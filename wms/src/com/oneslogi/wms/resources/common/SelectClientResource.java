package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.exbhv.BTimeZoneBhv;
import com.oneslogi.base.dbflute.exentity.BTimeZone;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.dto.common.ClientCenterDto;
import com.oneslogi.wms.dto.common.SelectClientDto;
import com.oneslogi.wms.dto.common.UserClientDto;
import com.oneslogi.wms.logic.common.SelectClientLogic;
import com.oneslogi.wms.logic.common.SelectClientLogic.AddFatalError;
import com.oneslogi.wms.resources.AbstractWmsResource;

@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/selectClient")
public class SelectClientResource extends AbstractWmsResource {

	@Inject
	private SelectClientLogic logic;

	// [#3270] センタ別ロケール対応 2018.01.11 kawana Start
	@Inject
	private BTimeZoneBhv bTimeZoneBhv;

	// [#3270] センタ別ロケール対応 2018.01.11 kawana End

	public SelectClientResource() {
	}

	@GET
	@Path("/initNew")
	public SelectClientDto initNew() {
		SelectClientDto retDto = new SelectClientDto();
		retDto.setSelCenterCd("");
		retDto.setSelCenterId("");
		retDto.setSelCenterNm("");
		retDto.setSelClientCd("");
		retDto.setSelClientId("");
		retDto.setSelClientNm("");
		return retDto;
	}

	@GET
	@Path("/initialize")
	public SelectClientDto initialize() {
		SelectClientDto retDto = new SelectClientDto();
		retDto.setSelCenterCd("");
		retDto.setSelCenterId("");
		retDto.setSelCenterNm("");
		retDto.setSelClientCd("");
		retDto.setSelClientId("");
		retDto.setSelClientNm("");
		//ユーザーログインマスタから、デフォルト表示する荷主およびセンタの情報を取得
		String defClientCd = logic.getLoginClientCd();
		String defCenterCd = getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME);

		//ユーザ荷主マスタから、ユーザーに紐づく荷主の一覧を取得
		UserClientDto userDto = logic.getWmsUserClientDto();

		//センタマスタからデータを取得
		ClientCenterDto centerDto = logic.getClientCenterDto();

		//結果をDTOオブジェクトに格納
		retDto.setUserClientDto(userDto);
		retDto.setClientCenterDto(centerDto);
		retDto.setSelClientCd(defClientCd);
		retDto.setSelCenterCd(defCenterCd);

		if (getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME) != null &&
				getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME).trim().length() > 0) {
			logic.getClientCenterData(retDto);
		}

		//DTOオブジェクトの返却
		return retDto;
	}

	/**
	 * センタ選択時に荷主のリストを再作成します
	 * @param dto
	 */
	@POST
	@Path("/changeCenterList")
	public SelectClientDto changeCenterList(SelectClientDto dto) {

		return logic.getClientCenterData(dto);

	}

	@POST
	@Path("/decide")
	public SelectClientDto decide(SelectClientDto dto) {

		// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
		//送信されたレコードの妥当性チェック
		boolean dataChk = logic.checkCenterClientData(dto, AddFatalError.TRUE);
		// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End

		if (getErrorManager().size() > 0 || !dataChk) {
			return null;
		} else {
			//画面で選択された荷主コードおよび倉庫コードを取得
			//ユーザーログインマスタにセットするために、IDを取得
			MCenter centerEntity = logic.getSelectCenterId(dto);
			//セッションデータを更新
			getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME, dto.getSelCenterCd());
			getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME, centerEntity.getCenterId().toString());
			getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_NM_KEY_NAME, centerEntity.getCenterNm());
			// [#2828][#3270] センタ別ロケール対応 2018.01.11 kawana Start
			if (centerEntity.getCultureId() != null) {
				// カルチャをセンタカルチャに変更
				getSessionData().setCultureId(centerEntity.getCultureId());
			}
			if (centerEntity.getTimeZoneId() != null) {
				// タイムゾーン変更
				BTimeZone timeZone = bTimeZoneBhv.selectByPKValue(centerEntity.getTimeZoneId());
				if (timeZone != null && timeZone.isDelFlg$0()) {
					getSessionData().setTimeZoneCd(timeZone.getTimeZoneCd());
				}
			}
			// [#2828][#3270] センタ別ロケール対応 2018.01.11 kawana End

			dto.setSelCenterId(centerEntity.getCenterId().toString());
			dto.setSelCenterNm(centerEntity.getCenterNm());
			if (dto.getSelClientCd() != null && dto.getSelClientCd().trim().length() > 0) {
				MClient clientEntity = logic.getSelectClientId(dto);
				getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_CD_KEY_NAME, dto.getSelClientCd());
				getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME, clientEntity.getClientId().toString());
				getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_NM_KEY_NAME, clientEntity.getClientNm());
				dto.setSelClientId(clientEntity.getClientId().toString());
				dto.setSelClientNm(clientEntity.getClientNm());
				//データ更新
				logic.setUserLoginData(centerEntity.getCenterId(), clientEntity.getClientId());
			} else {
				dto.setSelClientId(null);
				dto.setSelClientNm(null);
				logic.setUserLoginData(centerEntity.getCenterId(), null);
			}
		}
		//メイン画面に遷移する
		return dto;
	}

}
