package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dtomapper.MClientCenterDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.wms.dto.common.ClientCenterDto;
import com.oneslogi.wms.dto.common.ClientDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷主センタデータ取得用リソースクラス
 */
@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/clientCenter")
public class ClientCenterResource extends AbstractWmsResource {

	// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana Start
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana End
	@Inject
	private ClientCenterLogic clientCenterLogic;

	@GET
	@Path("/record")
	public ClientCenterDto record(@QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId) {

		MClientCenter conditionEntity = new MClientCenter();
		conditionEntity.setClientId(clientId);
		conditionEntity.setCenterId(centerId);

		MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);

		MClientCenterDtoMapper mapper = new MClientCenterDtoMapper();
		MClientCenterDto dto = mapper.mappingToDto(entity);

		ClientCenterDto resultDto = new ClientCenterDto();
		resultDto.data.mClientCenter = dto;

		return resultDto;
	}

	// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.03.05 kawana Start

	/**
	 * <h2>荷主リスト取得(ユーザ荷主未使用).</h2>
	 * <pre>
	 * センタに登録されている荷主のリストを取得して
	 * 荷主ドロップダウン用のDtoにして返却する。
	 *
	 * ユーザ荷主によるユーザ権限の絞込みはしない。
	 * </pre>
	 *
	 * @param centerId センタID
	 * @return 荷主ドロップダウン用Dto
	 */
	@GET
	@Path("/clientListNotUseUserClient")
	public ClientDto clientListNotUseUserClient(@QueryParam("centerId") Long centerId) {

		if (centerId == null) {
			return new ClientDto();
		}

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(centerId);

		List<MClientCenter> clientCenterList = mClientCenterBhv.selectList(cb);

		ClientDto resultDto = new ClientDto();
		for (MClientCenter clientCenter : clientCenterList) {

			MClient client = clientCenter.getMClient();
			if (client == null || client.isDelFlg$1()) {
				continue;
			}

			ClientDto.DropDownListData data = new ClientDto.DropDownListData();
			data.clientId = client.getClientId();
			data.clientCd = client.getClientCd();
			data.clientNm = client.getClientNm();
			resultDto.data.add(data);
		}

		return resultDto;
	}

	// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.03.05 kawana End
}
