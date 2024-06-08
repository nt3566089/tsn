package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreLocDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 入庫格納(ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreLoc")
@HandyErrorReturnPath(returnURL = "ReceiveStoreLoc/display")
public class ReceiveStoreLocResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LocationLogic locationLogic;

	/**
	 * 入庫格納(ロケ入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		dto.setLoc("");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setLocCd(null);
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 *入庫格納(ロケ入力)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 ライ MOD Start
		resource.initScreen("ReceiveStoreLocHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreLoc/send").build());
		// オプションボタン１の設定
		resource.setOptionButton1(ButtonInfo.builder().url("ReceiveStoreList/load?backUrl=ReceiveStoreLoc/display").itemCd("option1").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreQty/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreLoc/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD END
		//ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreLoc.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、送信確認画面に遷移します。
	 * @param bean ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveStoreLocDto bean) throws Exception {//

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setLocCd(bean.getLoc());

		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//dto.setLoc(bean.getLoc());
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
		//入力チェック
		//		String valMsg = util.inputCheck(ses, bean);
		//		if (valMsg != null && valMsg.trim().length() > 0) {
		//			//入力エラー
		//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
		//			return;
		//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLoc());
		mLocation.setCenterId(dto.data.wHtReceiveStoreDto.getCenterId());
		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			//入力エラー
			//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		if (!"00".equals(mLocation.getLocationType())) {
			//ロケは通常ロケーションを入力してください。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LOC_NORMAL);
			return;
		}

		wHtReceiveStoreDto.setLocId(mLocation.getLocationId());
		wHtReceiveStoreDto.setLocNm(mLocation.getLocationNm());
		wHtReceiveStoreDto.setLocCd(bean.getLoc());

		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//格納確認画面を表示
		ReceiveStoreSendResource.load(this, util);

	}
}
