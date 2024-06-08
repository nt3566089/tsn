package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.stock.LocationMoveDto;
import com.oneslogi.ht.wms.dto.stock.LocationMoveInLocDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ロケ変更(入庫ロケ)画面Resourceクラスです。
 *
 */
@Path("/handy/LocationMoveInLoc")
@HandyErrorReturnPath(returnURL = "LocationMoveInLoc/display")
public class LocationMoveInLocResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private LocationLogic locationLogic;

	/**
	 * ロケ変更(入庫ロケ)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");
		dto.setLocationCd("");

		ses.setAttribute("LocationMoveDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ロケ変更(入庫ロケ)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng Start

		//画面ヘッダ設定
		resource.initScreen("LocationMoveInLocHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("LocationMoveOutList/display").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("LocationMoveInLoc/send").itemCd("send").build());

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("LocationMoveInLoc/send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.24 yanjiafeng End

		//ロケ変更(入庫ロケ)画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/LocationMoveInLoc.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ロケ変更(確認)画面に遷移します。
	 * @param bean ロケ変更(入庫ロケ)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam LocationMoveInLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");
		dto.setLocationCd(bean.getLocationCd());

		// [#575] ValidateチェックのHT国際化 2017.02.21 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.21 sja End

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLocationCd());
		mLocation.setCenterId(dto.getTStockDto().getMLocation().getCenterId());
		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}

		//[ON推-品質問題点指摘票(新ｿﾘV2-053)] 修正対応 2016.08.18 chou Add Start
		if (dto.getTStockDto().getMLocation().getLocationId().equals(mLocation.getLocationId())) {
			//出庫ロケと入庫ロケが同一です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_OUTLOC_INLOC_SAME_ERROR);
			return;
		}
		//[ON推-品質問題点指摘票(新ｿﾘV2-053)] 修正対応 2016.08.18 chou Add End

		dto.setLocationNm(mLocation.getLocationNm());
		dto.setLocationId(mLocation.getLocationId());

		ses.setAttribute("LocationMoveDto", dto);

		//ロケ変更(確認)画面を表示
		LocationMoveSendResource.load(this, util);
	}
}
