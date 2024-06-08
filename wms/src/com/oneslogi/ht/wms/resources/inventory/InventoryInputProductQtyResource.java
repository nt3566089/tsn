package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductQtyDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;

/**
 * 商品棚卸入力(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductQty")
@HandyErrorReturnPath(returnURL = "InventoryInputProductQty/display")
public class InventoryInputProductQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	// [Ver3.0] unit of measure対応 2017.11.30 REN Start
	// ===== 定数定義 =====
	@Inject
	private HandyScreenUtil screenUtil;

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
	// [#2945][Ver3.0] 複数荷姿対応 2017.11.30 REN End
	/**
	 * 商品棚卸入力(数量入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		dto.setQty("");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();
		wHtInventoryInputProdDto.setQty(null);
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(数量入力)画面表示を行います。
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

		//InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		// [Ver3.0] unit of measure対応 2017.11.30 REN Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "InventoryInputProductQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			dto.setQty(auxiliaryInfo.getCalcQty());
			ses.setAttribute("InventoryInputProductDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("inventory");
		auxiliaryInfo.setReturnResource("InventoryInputProductQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("InventoryInputProductQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.getwHtInventoryInputProdDto().getProductId());
		auxiliaryInfo.setProductCd(dto.getwHtInventoryInputProdDto().getProductCd());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.30 REN End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD Start
		resource.initScreen("InventoryInputProductQtyHT");
		// 非表示ボタンの設定
		resource.setHideButton(
				ButtonInfo.builder()
				.url("InventoryInputProductQty/send").build());
		// オプションボタン１の設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("InventoryInputProductList/load?backUrl=InventoryInputProductQty/display")
				.itemCd("option1").build());
		/* 2015/05/14 INOUE END */

		//フッタボタン（左）設定
		if("0".equals(dto.getLotLimitDt())){
			resource.setReturnButton(
					ButtonInfo.builder().url("InventoryInputProductJanCd/display")
					.itemCd("return").build());

		}else if ("1".equals(dto.getLotLimitDt())){
			resource.setReturnButton(
					ButtonInfo.builder().url("InventoryInputProductLotLimitDt/display")
					.itemCd("return").build());

		}else if ("2".equals(dto.getLotLimitDt())){
			resource.setReturnButton(
					ButtonInfo.builder().url("InventoryInputProductLot/display")
					.itemCd("return").build());

		}else if ("3".equals(dto.getLotLimitDt())){
			resource.setReturnButton(
					ButtonInfo.builder().url("InventoryInputProductLimitDt/display")
					.itemCd("return").build());
		}
		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder().url("InventoryInputProductQty/send")
				.itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD END
		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductQty.jsp",ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(送信確認)画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam InventoryInputProductQtyDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		dto.setQty(bean.getQty());
		// [#575] ValidateチェックのHT国際化 2017.02.22 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.22 sja End

		// [Ver3.0] unit of measure対応  2017.11.30 REN Start
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara

			//荷姿グループマスタから小数有無フラグ取得
			String qty = dto.getQty();
			//商品CD
			String productCd = dto.getwHtInventoryInputProdDto().getProductCd();
			// エラーメッセージ作成
			String qtyItemNm = screenUtil.itemNm("InventoryInputProductQtyHT", "qty");
			//ログイン情報
			HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
			//荷主ID
			Long clientId = loginInfo.getClientId();
			//小数有無フラグ
			String decimalExistFlg=util.getDecimalExistFlg(productCd, clientId);

			if (decimalExistFlg.equals("0")) {
				if(!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)){
					return;
				}
			}

			// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
			// [Ver3.0] unit of measure対応  2017.11.30 REN End

		wHtInventoryInputProdDto.setQty(WCC.toBigDecimal(bean.getQty()));

		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
		ses.setAttribute("InventoryInputProductDto", dto);

		//送信確認画面を表示
		InventoryInputProductSendResource.load(this, util);
		return;
	}

}
