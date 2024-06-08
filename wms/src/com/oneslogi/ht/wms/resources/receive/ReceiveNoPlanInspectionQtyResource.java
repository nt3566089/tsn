package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionQtyDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;

/**
 * 予定無し入荷(数量)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionQty")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionQty/display")
public class ReceiveNoPlanInspectionQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	// [#4256] エラーメッセージを他画面と統一 2018.04.17 kawana Start
	@Inject
	private HandyScreenUtil screenUtil;
	// [#4256] エラーメッセージを他画面と統一 2018.04.17 kawana End
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;

	// [#4256] 数量のValidateチェックをHT基盤の機能(引数マスタ)で実施(ここからは削除) 2018.04.17 kawana Delete

	/**
	 * 予定無し入荷(数量)画面初期化を行います。
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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Start
		dto.setQty("");
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 End
		dto.setCaseQty("");
		dto.setSpgQtyOns("");
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 予定無し入荷(数量)画面表示を行います。
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

		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ReceiveNoPlanInspectionQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			dto.setQty(auxiliaryInfo.getCalcQty());
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("receive");
		auxiliaryInfo.setReturnResource("ReceiveNoPlanInspectionQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ReceiveNoPlanInspectionQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.getwHtReceiveNoPlanInspDto().getMProduct().getProductId());
		auxiliaryInfo.setProductCd(dto.getwHtReceiveNoPlanInspDto().getMProduct().getProductCd());
		auxiliaryInfo.setShapeGrpId(dto.getwHtReceiveNoPlanInspDto().getMProduct().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionQtyHT");
		// 左上ボタンの設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionList/load?backUrl=ReceiveNoPlanInspectionQty/display")
				.itemCd("option1")
				.build());
		// 右上ボタンの設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionQty/complete")
				.itemCd("option2")
				.build());
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionQty/send").build());

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionJan/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionQty/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionQty.jsp", ses);

	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、以下画面に遷移可能です
	 *     ロット入力画面
	 *     期限日入力画面
	 *     ロット・期限日入力画面
	 *     汎用No入力画面
	 *     ロケ入力画面
	 * @param bean JAN入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionQtyDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		dto.setCaseQty(bean.getCaseQty());
		dto.setSpgQtyOns(bean.getSpgQtyOns());
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 End

		// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.09 sja End

		// 2017.11.29 [Ver3.0] [Ver3.0] unit of measure対応  HDIS王 delete

		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Ins Start

		// [#4256] 数量のValidateチェックをHT基盤の機能(引数マスタ)で実施(ここからは削除) 2018.04.17 kawana Delete

		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();

		//商品CD
		String productCd = dto.getwHtReceiveNoPlanInspDto().getMProduct().getProductCd();
		// [#4256] 数量のValidateチェックをHT基盤の機能(引数マスタ)で実施(商品名称の取得を削除) 2018.04.17 kawana Delete
		//ログイン情報
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//荷主ID
		Long clientId = loginInfo.getClientId();
		//小数有無フラグ
		String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

		if (decimalExistFlg.equals("0")) {
			// [#4256] エラーメッセージを他画面と統一 2018.04.17 kawana Start
			String qtyItemNm = screenUtil.itemNm("ReceiveNoPlanInspectionQtyHT", "qty");
			if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
				// [#4256] エラーメッセージを他画面と統一 2018.04.17 kawana End
				return;
			}
		}

		// [#4256] 数量のValidateチェックをHT基盤の機能(引数マスタ)で実施(ここからは削除) 2018.04.17 kawana Delete

		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Ins End

		// 検品数が1以上チェック
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Ins Start
//		BigDecimal storeNum = WCC.toBigDecimal(CU.nullOrEmptyToZero(dto.getSpgQtyOns()));
		BigDecimal storeNum = WCC.toBigDecimal(CU.nullOrEmptyToZero(dto.getQty()));
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Ins End
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del

		// [#4256] 数量のValidateチェックをHT基盤の機能(引数マスタ)で実施(ここからは削除) 2018.04.17 kawana Delete

        // 計算した検品数を保存する
		dto.setStoreNum(storeNum);

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto.getMProduct());
		// ==== 【JAN入力】画面で入力したJAN/商品コードのロット管理フラグ期限日管理フラグに応じて遷移先画面を変更する ====
		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
			// ロット・期限日入力画面を表示
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			ReceiveNoPlanInspectionLotLimitDtResource.load(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
			// ロット入力画面を表示
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			ReceiveNoPlanInspectionLotResource.load(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
			// 期限日入力画面を表示
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			ReceiveNoPlanInspectionLimitDtResource.load(this, util);
			return;
		}

		// ロット/期限日管理品ではない場合
		if (mProduct.isLimitDtManagFlg$0() && mProduct.isLotManagFlg$0()) {
			MParam mParam = new MParam();
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
			mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
			if (mParam.isStoreNoFlg$1() && dto.getLabelKbn().equals("2")) {
				// 汎用ラベルNO入力確認画面へ遷移する
				ReceiveNoPlanInspectionLabelInputResource.load(this, util);
			} else {
				// ロケ入力画面へ遷移する
				ReceiveNoPlanInspectionLocResource.load(this, util);
			}
		}

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		return;
	}

	/**
	 * 終了時にコールされるメソッドです。<br>
	 * 入力チェックを行い(数量入力)画面に遷移します。
	 * @param bean 数量入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete(@BeanParam ReceiveNoPlanInspectionQtyDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();
		dto.setCaseQty(bean.getCaseQty());
		dto.setSpgQtyOns(bean.getSpgQtyOns());
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 Start
		dto.setQty(bean.getQty());
		// 数量の入力チェックを行う
		if (!(CU.isNullOrEmpty(bean.getQty()))) {
			// 数量は空白以外場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_QTY_COMPLETE_NO_INPUT);
			return;
		}
		// [Ver3.0] 複数荷姿対応 2017.11.29 HDIS王 End

		// 伝票Noの入力チェックを行う
		if (CU.isNullOrEmpty(wHtReceiveNoPlanInspecDto.getHtWorkNo())) {
			// 伝票Noは空白場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_WORK_NO_QTY_ZERO_ERROR);
			return;
		}

		// 数量の入力チェックを行う
		if (!(CU.isNullOrEmpty(bean.getCaseQty()) && CU.isNullOrEmpty(bean.getSpgQtyOns()))) {
			// 数量は空白以外場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_QTY_COMPLETE_NO_INPUT);
			return;
		}

		// 商品単位の総検品済数の取得
		WHtReceiveNoPlanInsp wReceive = new WHtReceiveNoPlanInsp();
		wReceive.setCenterId(wHtReceiveNoPlanInspecDto.getCenterId());
		wReceive.setClientId(wHtReceiveNoPlanInspecDto.getClientId());
		wReceive.setHtWorkNo(wHtReceiveNoPlanInspecDto.getHtWorkNo());
		wReceive.setMacAddress(dto.getMacAddress());
		wReceive.setProductId(wHtReceiveNoPlanInspecDto.getProductId());
		dto.setStoreNumSum(selectLogic.selectStoreNum(wReceive));

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
		// 【完了確認(商品単位】画面へ遷移する
		ReceiveNoPlanInspectionProductResource.load(this, util);
	}
}
