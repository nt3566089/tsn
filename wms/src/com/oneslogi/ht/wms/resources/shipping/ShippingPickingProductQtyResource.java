package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingQtyDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductUpdateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingProductQty")
@HandyErrorReturnPath(returnURL = "ShippingPickingProductQty/display")
public class ShippingPickingProductQtyResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingProductCheckLogic checkLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ShippingPickingProductUpdateLogic updateLogic;
	@Inject
	private ShippingPickingProductSelectLogic selectLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	// [Ver3.0] unit of measure対応 2017.11.24 王 Start
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
	// [Ver3.0] unit of measure対応 2017.11.24 王 End
	/**
	 * パラピッキング(数量入力)画面初期化メソッドです。
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
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
		ses.setAttribute("ShippingPickingProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * パラピッキング(数量入力)画面表示を行います。
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
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ShippingPickingProductQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定

			// [Ver3.0] unit of measure対応 2017.11.24 王 Start
			dto.setQty(auxiliaryInfo.getCalcQty());
			// [Ver3.0] unit of measure対応 2017.11.24 王 End

			ses.setAttribute("ShippingPickingProductDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("shipping");
		auxiliaryInfo.setReturnResource("ShippingPickingProductQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ShippingPickingProductQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.data.wHtShippingPickingDto.getMProduct().getProductId());
		auxiliaryInfo.setProductCd(dto.data.wHtShippingPickingDto.getMProduct().getProductCd());
		auxiliaryInfo.setShapeGrpId(dto.data.wHtShippingPickingDto.getMProduct().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 wangqi Start

	    // 画面初期設定
		resource.initScreen("ShippingPickingProductQtyHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingPickingProductJanCd/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingPickingProductQty/send").itemCd("send").build());
		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingPickingProductQty/send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 wangqi End

		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingProductQty.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(送信確認)画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/02/28 PYM Start
	@WorkLogEnd("ShippingPickingProductHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/28 PYM End
	public void send(@BeanParam ShippingPickingQtyDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingProductResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
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
		// [Ver3.0] unit of measure対応 2017.12.01 王 Start
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		// [Ver3.0] unit of measure対応 2017.11.24 王 Start
		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.getwHtShippingPickingDto().getMProduct().getProductCd();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("ShippingPickingProductQtyHT", "qty");
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
		// [Ver3.0] unit of measure対応  2017.11.24 王 End

		// [#575] ValidateチェックのHT国際化 2017.02.16 sja End
		wHtShippingPickingDto.setSpgQtyOns(WCC.toBigDecimal(bean.getQty()));
		// [Ver3.0] unit of measure対応 2017.11.24 王 End
		wHtShippingPickingDto.setPickingFlg("1");
		// [Ver3.0] unit of measure対応 2017.11.24 王 Del
		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//バラ数チェック
		if (!checkLogic.checkSpgQtyOns(wHtShippingPicking)) {
			return;
		}
		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingProductDto", dto);

		//出荷検品ワーク更新(検品済)
		updateLogic.updateWkPickingFlg(wHtShippingPicking);

		//出庫フラグの更新
		if (updateLogic.updatePickingFlg(wHtShippingPicking)) {
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			// 総数量
			setWorkLogQty(WCC.add(getWorkLogQty(), wHtShippingPicking.getInstNum()));
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

			//出庫作業NO全部出庫済
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingProductDto", dto);

			//完了確認画面を表示
			displayEndDialog();

			return;
		} else {
			//出庫作業NO一部出庫済
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingProductDto", dto);

			/* 2015/06/12 INOUE ADD START 色・音の適用 */
			// 次の画面で完了音を鳴らす。
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
			/* 2015/06/12 INOUE ADD END */

			//[ON推-品向-1112] 修正対応 2016.4.18 chou Add Start
			ses.removeAttribute("GTIN14_SYMBOL");
			//[ON推-品向-1112] 修正対応 2016.4.18 chou Add End

			//JAN入力画面を表示
			ShippingPickingProductJanCdResource.load(this, util, selectLogic);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			skipWorkLogEnd();
			addWorkLogQty(wHtShippingPicking.getInstNum());
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

			return;
		}
	}

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		/* 2015/05/18 INOUE UPDATE START フッタ共通化対応 */
		/* 2015/06/12 INOUE UPDATE START 色・音の適用 */
		displayOperationEndDialog(
				"ShippingPickingProduct",
				"ShippingPickingProductQty/onEndDialogEnd",
				"ShippingPickingProductQty/onEndDialogContinue"
			);
		/* 2015/06/12 INOUE UPDATE END */
		/* 2015/05/18 INOUE END */
	}

	/**
	 * 完了確認画面終了時にコールされるメソッドです。<br>
	 * 入力チェックを行い、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		//機能単位セッションをクリア
		ShippingPickingProductResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * 入力チェックを行い、出庫作業No入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//機能単位セッションを再構造
		ShippingPickingProductResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		ShippingPickingProductWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
