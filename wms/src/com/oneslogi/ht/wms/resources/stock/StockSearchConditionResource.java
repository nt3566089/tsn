package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.stock.StockSearchConditionDto;
import com.oneslogi.ht.wms.dto.stock.StockSearchDto;
import com.oneslogi.ht.wms.logic.stock.StockSearchSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫検索画面Resourceクラスです。
 *
 */
@Path("/handy/StockSearchCondition")
@HandyErrorReturnPath(returnURL = "StockSearchCondition/display")
public class StockSearchConditionResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private StockSearchSelectLogic stockSearchSelectLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * 在庫検索画面初期化を行います。
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

		//機能単位セッションを処理化
		StockSearchResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫検索画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.13 kawana Start

		// 画面初期設定
		resource.initScreen("StockSearchConditionHT");

		// 戻るボタン設定
		resource.setReturnButton(ButtonInfo.builder().url("StockSearchCondition/back").itemCd("return").build());
		// 送信ボタン設定
		resource.setSendButton(ButtonInfo.builder().url("StockSearchCondition/send").itemCd("send").build());
		// 非表示のボタン設定
		resource.setHideButton(ButtonInfo.builder().url("StockSearchCondition/send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.13 kawana End

		//ロケ・JAN・入庫ＮＯ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockSearchCondition.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// 機能単位セッションをクリア
		StockSearchResource.removeSession(this);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_STOCK);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫一覧画面に遷移します。
	 * @param bean 在庫検索画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam StockSearchConditionDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockSearchDto dto = (StockSearchDto) ses.getAttribute("StockSearchDto");

		//画面の値保存する。
		dto.setStoreLabelNo(bean.getStoreLabelNo());
		dto.setLocationCd(bean.getLocationCd());
		dto.setJanCd(bean.getJanCd());
		ses.setAttribute("StockSearchDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.03.07 sja Start
        // 入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.03.07 sja End

		if (bean.getJanCd().isEmpty() && bean.getLocationCd().isEmpty() && bean.getStoreLabelNo().isEmpty()) {
			//ロケまたはJANまたは入庫ＮＯ入力を入力してください。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_LOC_OR_JANCD_OR_STOCK_LABEL_NO_NOT_BLANK_ERROR);
			return;
		}

		//在庫一覧画面を表示
		StockSearchListResource.load(this, util, "StockSearchCondition/display", stockSearchSelectLogic, userLogic
				, clientLogic, centerLogic, warehouseLogic);

	}

}
