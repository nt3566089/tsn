package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutQtyDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;

/**
 * 在庫移動出庫(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOutQty")
@HandyErrorReturnPath(returnURL = "StockMoveOutQty/display")
public class StockMoveOutQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	// [Ver3.0] unit of measure対応 2017.11.20 王 Start
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

	// [Ver3.0] unit of measure対応 2017.11.20 王 End

	/**
	 * 在庫移動出庫(数量入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		dto.setQty("");

		//戻るURLの設定
		dto.setBackUrl(backUrl);

		ses.setAttribute("StockMoveOutDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫移動出庫(数量入力)画面表示を行います。
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

		// [Ver3.0] unit of measure対応 2017.11.20 王 Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "StockMoveOutQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			dto.setQty(auxiliaryInfo.getCalcQty());

			ses.setAttribute("StockMoveOutDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("stock");
		auxiliaryInfo.setReturnResource("StockMoveOutQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("StockMoveOutQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.data.tStockDto.getProductId());
		auxiliaryInfo.setProductCd(dto.data.tStockDto.getMProduct().getProductCd());
		auxiliaryInfo.setShapeGrpId(dto.data.tStockDto.getMProduct().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.20 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW Start
		resource.initScreen("StockMoveOutQtyHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("StockMoveOutQty/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("StockMoveOutQty/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveOutQty.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動出庫(送信確認)画面画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam StockMoveOutQtyDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		// [#575] ValidateチェックのHT国際化 2017.02.16 sja Start
		//入力チェック
		dto.setQty(bean.getQty());
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

		// [Ver3.0] unit of measure対応  2017.11.20 王 Start
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.getTStockDto().getMProduct().getProductCd();
		//ログイン情報
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//荷主ID
		Long clientId = loginInfo.getClientId();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("StockMoveOutQtyHT", "instNum");
		//小数有無フラグ
		String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

		if (decimalExistFlg.equals("0")) {
			if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
				return;
			}
		}

		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		// [Ver3.0] unit of measure対応  2017.11.20 王 End

		if (WCC.isLessThan(dto.getTStockDto().getChargeNum(), qty)) {
			// 在庫移動数より在庫.引当可能数が少ない場合
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
			return;
		}

		ses.setAttribute("StockMoveOutDto", dto);

		//送信確認画面を表示
		StockMoveOutSendResource.load(this, util);

		return;
	}
}
