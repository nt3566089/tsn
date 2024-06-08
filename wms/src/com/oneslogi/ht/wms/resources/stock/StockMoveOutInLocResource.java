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
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutInLocDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * 在庫移動入庫(先ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOutInLoc")
@HandyErrorReturnPath(returnURL = "StockMoveOutInLoc/display")
public class StockMoveOutInLocResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LocationLogic locationLogic;

	/**
	 * 在庫移動入庫(ロケ入力)画面初期化を行います。
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

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");
		dto.setLocationCd("");

		ses.setAttribute("StockMoveOutDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫移動入庫(先ロケ入力)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW Start
		resource.initScreen("StockMoveOutInLocHT");
		//非表示の設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveOutInLoc/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveOutInLoc/back").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveOutInLoc/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW End
		//ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveOutInLoc.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * 在庫移動出庫（確認）画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// ===== 在庫移動出庫(確認)を表示 =====

		String dialogScreenCd = "StockMoveOutCancelOrSendHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_CANCEL);

		// いいえボタン設定
		setReturnButton(ButtonInfo.builder().url("StockMoveOutSend/onCancelDialogNo").itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).build());
		// はいボタン設定
		setSendButton(ButtonInfo.builder().url("StockMoveOutSend/onCancelDialogYes").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動入庫(送信確認)画面に遷移します。
	 * @param bean ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("StockMoveOutInHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam StockMoveOutInLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");
		dto.setLocationCd(bean.getLocationCd());
		// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.16 sja End

		//ロケ存在チェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getLocationCd());
		mLocation.setCenterId(dto.getTStockDto().getMWarehouse().getCenterId());
		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		//トレース項目
		setWorkLogTraceItem(bean.getLocationCd());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		dto.setLocationNm(mLocation.getLocationNm());
		dto.setLocationId(mLocation.getLocationId());

		ses.setAttribute("StockMoveOutDto", dto);

		//送信確認画面を表示
		StockMoveOutInSendResource.load(this, util);

		return;
	}
}
