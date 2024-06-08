package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingQtyDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingUpdateLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ケースピッキング(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingCasePickingQty")
@HandyErrorReturnPath(returnURL = "ShippingCasePickingQty/display")
public class ShippingCasePickingQtyResource extends HandyMenuResource {

	// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw add Start
	protected static class StatusCode {
		/**
		 * 荷札の自動印刷エラー
		 */
		protected static final int AUTO_PRINT_ERROR = 3;
	}

	// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw add End

	/* 共通関数群ユティリティクラス */
	@Inject
	private HandyCommonUtil util;
	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;
	/* ケースピッキングデータ取得ロジッククラス */
	@Inject
	private ShippingCasePickingSelectLogic shippingCasePickingSelectLogic;
	/* ケースピッキングデータ更新ロジッククラス */
	@Inject
	private ShippingCasePickingUpdateLogic shippingCasePickingUpdateLogic;
	/* センタマスタに対するロジッククラス */
	@Inject
	private CenterLogic centerLogic;
	/* 荷主マスタに対するロジッククラス */
	@Inject
	private ClientLogic clientLogic;
	/* 倉庫マスタチェック処理ロジッククラス */
	@Inject
	private WarehouseLogic warehouseLogic;
	// [Ver3.0] unit of measure対応 2017.11.29 王 Start
	/* ケースピッキングデータチェックロジッククラス */
	@Inject
	private ShippingCasePickingCheckLogic checkLogic;
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

	// [Ver3.0] unit of measure対応 2017.11.29 王 End

	/**
	 * ケースピッキング(数量入力)画面初期化メソッドです。
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

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		// [Ver3.0] unit of measure対応 2017.11.29 王 Del
		ses.setAttribute("ShippingCasePickingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ケースピッキング(数量入力)画面表示を行います。
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
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		// [#2739][Ver3.0] 複数荷姿対応（WMS共通機能） 2017.10.23 honma Add Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ShippingCasePickingQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			dto.setQty(auxiliaryInfo.getCalcQty());
			ses.setAttribute("ShippingCasePickingDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("shipping");
		auxiliaryInfo.setReturnResource("ShippingCasePickingQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ShippingCasePickingQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.getwHtShippingPickingDto().getProductId());
		auxiliaryInfo.setProductCd(dto.getwHtShippingPickingDto().getProductCd());
		//auxiliaryInfo.setShapeGrpId(dto.getwHtShippingPickingDto().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 Start

		// 画面初期設定
		resource.initScreen("ShippingCasePickingQtyHT");

		// 非表示ボタンの設定
		resource.setHideButton(
				ButtonInfo.builder().url("ShippingCasePickingQty/send?backUrl=" + dto.getBackUrl()).build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder()
						.url("ShippingCasePickingQty/send?backUrl=" + dto.getBackUrl())
						.itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 End

		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingCasePickingQty.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキング(送信確認)画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @param backUrl 戻るURL
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogEnd("ShippingCasePickingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void send(@BeanParam ShippingCasePickingQtyDto bean, @QueryParam("backUrl") String backUrl) throws Exception {

		// ケースピッキングNo.のデータ存在チェック
		if (!ShippingCasePickingResource.checkExistCasePickingNo(this, util, shippingLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		// [Ver3.0] unit of measure対応 2017.11.29 王 Del
		// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.14 sja End
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		dto.setQty(bean.getQty());
		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.getwHtShippingPickingDto().getProductCd();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("ShippingCasePickingQtyHT", "qty");
		//ログイン情報
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//荷主ID
		Long clientId = loginInfo.getClientId();

		//小数有無フラグ
		String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

		// [#4256] 数量の必須チェックをHT基盤の機能(引数マスタ)で実施(ここからは削除) 2018.04.17 kawana Delete

		if (decimalExistFlg.equals("0")) {
			if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
				return;
			}
		}
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		// [Ver3.0] unit of measure対応 2017.11.29 王 Del
		//[ON推-1.1.4-CT-118]CT指摘の修正対応 2016.06.22 chou Mod Start
		//検品数がピッキング検品の指示数を超えている場合
		if (WCC.isGreaterThan(qty, wHtShippingPickingDto.getInstNum())) {
			//該当のアイテムの指示数を超えています。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_INST_NUM_OVER_ERROR);
			return;
		}

		wHtShippingPickingDto.setSpgQtyOns(WCC.toBigDecimal(qty));
		//[ON推-1.1.4-CT-118]CT指摘の修正対応 2016.06.22 chou Mod End

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingCasePickingDto", dto);

		//検品済数が指示数に達したかチェック
		if (WCC.isZero(wHtShippingPickingDto.getSpgQtyOns())
				|| WCC.isZero(wHtShippingPickingDto.getInstNum())
				|| WCC.isNotEqual(wHtShippingPickingDto.getSpgQtyOns(), wHtShippingPickingDto.getInstNum())) {

			//出荷ピッキングワーク更新(検品数)
			shippingCasePickingUpdateLogic.updateWkPickingFlg(wHtShippingPicking);

			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingCasePickingDto", dto);

			// 次の画面で完了音を鳴らす。
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

			if (backUrl.equals("ShippingCasePickingJanCd/load")) {
				//JAN入力画面を表示
				// [Ver3.0] unit of measure対応 2017.12.01 王 Start
				ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
				// [Ver3.0] unit of measure対応 2017.12.01 王 End
			} else {
				//入庫No.入力画面を表示
				// [Ver3.0] unit of measure対応 2017.11.29 王 Start
				ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
				// [Ver3.0] unit of measure対応 2017.11.29 王 End
			}
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			skipWorkLogEnd();
			addWorkLogQty(WCC.ZERO);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
		} else {
			wHtShippingPicking.setPickingFlg("1");//出庫フラグ:出庫済
			//出荷ピッキングワークの更新(検品数、出庫フラグ)
			shippingCasePickingUpdateLogic.updateWkPickingFlg(wHtShippingPicking);

			//[ON推-品向-1111] 修正対応 2016.4.18 chou Add Start
			ses.removeAttribute("GTIN14_SYMBOL");
			//[ON推-品向-1111] 修正対応 2016.4.18 chou Add End

			//梱包ボディの更新(出庫フラグ→出庫済、検品フラグ→検品済)
			if (shippingCasePickingUpdateLogic.updatePickingFlg(wHtShippingPicking, dto.getCasePickingNo(), errRetSts(StatusCode.AUTO_PRINT_ERROR))) {//ケースピッキングNO全部検品済

				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingCasePickingDto", dto);

				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start

				if (getErrorManager().size() > 0) {
					int statusCd = getErrorManager().get().get(1).getStatusCd();
					if (statusCd == StatusCode.AUTO_PRINT_ERROR) {
						// 荷札自動印刷時エラーの場合、エラー画面を表示した後、成功した時と同じ画面へ遷移
						sendErrorScreen(util.getMessage(getErrorManager()), "", "ShippingCasePickingQty/finishErrorConfirm");
						getErrorManager().clear();
						return;
					}
				}

				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				// 総数量
				setWorkLogQty(WCC.add(getWorkLogQty(), wHtShippingPicking.getInstNum()));
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
				//完了確認画面を表示
				displayEndDialog();
				return;
			} else {//ケースピッキングNO一部検品済
				dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
				ses.setAttribute("ShippingCasePickingDto", dto);

				// 次の画面で完了音を鳴らす。
				setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
				if (getErrorManager().size() > 0) {
					int statusCd = getErrorManager().get().get(1).getStatusCd();
					if (statusCd == StatusCode.AUTO_PRINT_ERROR) {
						// 荷札自動印刷時エラーの場合、エラー画面を表示した後、成功した時と同じ画面へ遷移
						sendErrorScreen(util.getMessage(getErrorManager()), "", "ShippingCasePickingQty/notFinishErrorConfirm");
						getErrorManager().clear();
						return;
					}
				}
				// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
				skipWorkLogEnd();
				addWorkLogQty(wHtShippingPicking.getInstNum());
				// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

				//入庫No.管理フラグを取得
				String storeNoFlg = shippingCasePickingSelectLogic.getStoreNoFlg(ses);

				if (storeNoFlg.equals("0")) {//入庫NO.管理対象外の場合
					//ケースピック(JAN)の画面を表示
					// [Ver3.0] unit of measure対応 2017.12.01 王 Start
					ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
					// [Ver3.0] unit of measure対応 2017.12.01 王 End
				} else {//入庫NO.管理対象の場合
					//ケースピック(入庫No.)の画面を表示
					// [Ver3.0] unit of measure対応 2017.11.29 王 Start
					ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
					// [Ver3.0] unit of measure対応 2017.11.29 王 End
				}
				return;
			}
		}
	}

	// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
	/**
	 * 未終了時、エラー画面表示後行う処理
	 * @throws Exception
	 */
	@GET
	@Path("/notFinishErrorConfirm")
	public void notFinishErrorConfirm() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		//入庫No.管理フラグを取得
		String storeNoFlg = shippingCasePickingSelectLogic.getStoreNoFlg(ses);

		if (storeNoFlg.equals("0")) {//入庫NO.管理対象外の場合
			//ケースピック(JAN)の画面を表示
			// [Ver3.0] unit of measure対応 2017.12.01 王 Start
			ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
			// [Ver3.0] unit of measure対応 2017.12.01 王 End
		} else {//入庫NO.管理対象の場合
			//ケースピック(入庫No.)の画面を表示
			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic, checkLogic);
			// [Ver3.0] unit of measure対応 2017.11.29 王 End
		}
		return;
	}

	/**
	 * 終了時、エラー画面表示後行う処理
	 * @throws Exception
	 */
	@GET
	@Path("/finishErrorConfirm")
	public void finishErrorConfirm() throws Exception {

		setNextViewTemplateForceSetting(VIEW_TEMPLATE_OPERATION_END);
		displayEndDialog();
	}

	// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		displayOperationEndDialog(
				"ShippingCasePicking",
				"ShippingCasePickingQty/onEndDialogEnd",
				"ShippingCasePickingQty/onEndDialogContinue");
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

		// 機能単位セッションをクリア
		ShippingCasePickingResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキングNo入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//機能単位セッションを再構造
		ShippingCasePickingResource.removeSession(this, util, shippingLogic);

		//ケースピッキングNo入力画面を表示
		ShippingCasePickingNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
