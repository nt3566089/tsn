package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingQtyDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingUpdateLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogData;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingQty")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingQty/display")
public class ShippingNoPackingQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingNoPackingCheckLogic checkLogic;
	@Inject
	private ShippingNoPackingSelectLogic selectLogic;
	@Inject
	private ShippingNoPackingUpdateLogic updateLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	// [Ver3.0] unit of measure対応 2017.11.28 王 Start
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] 基盤のエラーチェック内容と同じエラーチェックを削除 2018.04.20 fujiwara Del

	// [Ver3.0] unit of measure対応 2017.11.28 王 End
	/**
	 * バラ出荷検品(数量入力)画面初期化を行います。
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

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		// [Ver3.0] unit of measure対応 2017.11.28 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2017.11.28 王 End
		ses.setAttribute("ShippingNoPackingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * バラ出荷検品(数量入力)画面表示を行います。
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
		// [Ver3.0] unit of measure対応 2017.11.27 王 Start
		// [#2739][Ver3.0] 複数荷姿対応（WMS共通機能） 2017.10.23 honma Add Start
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ShippingNoPackingQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			// [Ver3.0] unit of measure対応 2017.11.28 王 Start
			dto.setQty(auxiliaryInfo.getCalcQty());
			// [Ver3.0] unit of measure対応 2017.11.28 王 End
			ses.setAttribute("ShippingNoPackingDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("shipping");
		auxiliaryInfo.setReturnResource("ShippingNoPackingQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ShippingNoPackingQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.getwHtShippingDto().getMProduct().getProductId());
		auxiliaryInfo.setProductCd(dto.getwHtShippingDto().getMProduct().getProductCd());
		auxiliaryInfo.setShapeGrpId(dto.getwHtShippingDto().getMProduct().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		//[C-CWMS-0051] 出荷梱包No.で検品する場合、「箱登録ボタン」未表示 2015.12.10 NayZaw Start
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD Start
		//画面ヘッダ設定
		resource.initScreen("ShippingNoPackingQtyHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingNoPackingQty/input").func("6").build());
		// オプションボタン１の設定
		resource.setOptionButton1(
				ButtonInfo.builder()
						.url("ShippingNoPackingList/load?backUrl=ShippingNoPackingQty/display").itemCd("option1").build());
		if (!dto.isPackingNo) {
			// オプションボタン２の設定
			resource.setOptionButton2
					(ButtonInfo.builder()
							.url("ShippingNoPackingBox/load?backUrl=ShippingNoPackingQty/display").itemCd("option2").build());
		}
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingNoPackingJanCd/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingNoPackingQty/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD END
		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingQty.jsp", ses);
	}

	/**
	 * 数量入力＋ENT時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(箱登録)画面画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/input")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogData("ShippingNoPackingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void input(@BeanParam ShippingNoPackingQtyDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();
		// [Ver3.0] unit of measure対応 2017.11.28 王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] unit of measure対応 2017.11.28 王 End
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
		// [Ver3.0] unit of measure対応 2017.11.28 王 Start
		// [#4256] 基盤のエラーチェック内容と同じエラーチェックを削除 2018.04.20 fujiwara Del
		dto.setQty(bean.getQty());
		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.getwHtShippingDto().getMProduct().getProductCd();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("ShippingNoPackingQtyHT", "spgQtyOns");
		//ログイン情報
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//荷主ID
		Long clientId = loginInfo.getClientId();
		//小数有無フラグ
		String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

		if (decimalExistFlg.equals("0")) {
			if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
				return;
			}
		}
		// [#4256] 基盤のエラーチェック内容と同じエラーチェックを削除 2018.04.20 fujiwara Del
		wHtShippingDto.setSpgQtyOns(WCC.toBigDecimal(bean.getQty()));
		// [Ver3.0] unit of measure対応 2017.11.28 王 End

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//検品済数の取得
		if (!checkLogic.checkSpgQtyOns(wHtShipping)) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM Start
		addWorkLogQty(WCC.toBigDecimal(bean.getQty()));
		// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM End

		//出荷検品WORKテーブルの更新
		updateLogic.updateWHtShipping(wHtShipping);

		//出庫検品残数の抽出
		selectLogic.selectSpgQtyRemain(wHtShipping);

		/* 2015/06/12 INOUE ADD START 色・音の適用 */
		// 更新が行われているので、次の画面で完了音を出す。
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
		/* 2015/06/12 INOUE ADD END */

		//検品未完件数抽出
		if (selectLogic.selectSpgQtyRemainCount(wHtShipping) == 0) {
			//出荷検品未完件数=0時
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			// [#405][2.1.0-CT-078] 出庫作業No./出荷梱包No.ともに箱登録画面を表示するため分岐を削除(ソース可読性向上) 2016.12.09 kawana Start
			//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw Start

			//箱登録画面を表示
			//2015/04/27 KAI UPDATE START カウントアップ対応 戻り先URLを変更
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
			ShippingNoPackingBoxResource.load(this, util, "ShippingNoPackingQty/load", checkLogic, selectLogic, shippingLogic, clearLogic, commonLogic);
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
			//2015/04/27 KAI UPDATE END
			return;

			//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw End
			// [#405][2.1.0-CT-078] 出庫作業No./出荷梱包No.ともに箱登録画面を表示するため分岐を削除(ソース可読性向上) 2016.12.09 kawana End
		}

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//JAN入力画面を表示
		ShippingNoPackingJanCdResource.load(this, util);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(箱登録)画面画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogData("ShippingNoPackingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
	public void send(@BeanParam ShippingNoPackingQtyDto bean) throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();
		// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.07 kawana Start
		boolean doUpdateSpgQtyOns = false;
		// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.07 kawana End
		// [Ver3.0] unit of measure対応 2017.11.28 王 Start
		if (CU.isNullOrEmpty(bean.getQty())) {
			// [Ver3.0] unit of measure対応 2017.11.28 王 End
			// 数量入力無し
			wHtShippingDto.setSpgQtyOns(WCC.ZERO);
		} else {
			// 数量入力有り

			// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.07 kawana Start
			doUpdateSpgQtyOns = true;

			// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
			//			String valMsg = util.inputCheck(ses, bean);
			//			if (valMsg != null && valMsg.trim().length() > 0) {
			//				sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			//				return;
			//			}
			if (bean.isValidateErr()) {
				return;
			}
			// [Ver3.0] unit of measure対応 2017.11.28 王 Start
			dto.setQty(bean.getQty());
			//荷姿グループマスタから小数有無フラグ取得
			String qty = dto.getQty();
			//商品CD
			String productCd = dto.getwHtShippingDto().getMProduct().getProductCd();
			// エラーメッセージ作成
			String qtyItemNm = screenUtil.itemNm("ShippingNoPackingQtyHT", "spgQtyOns");
			//ログイン情報
			HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
			//荷主ID
			Long clientId = loginInfo.getClientId();
			//小数有無フラグ
			String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);

			if (decimalExistFlg.equals("0")) {
				if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
					return;
				}
			}
			// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
			// [Ver3.0] unit of measure対応 2017.11.28 王 End
			// [#575] ValidateチェックのHT国際化 2017.02.14 sja End

			// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.07 kawana End
			// [Ver3.0] unit of measure対応 2017.11.28 王 Start
			wHtShippingDto.setSpgQtyOns(WCC.toBigDecimal(bean.getQty()));
			// [Ver3.0] unit of measure対応 2017.11.28 王 End

		}

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.13 kawana Start
		if (doUpdateSpgQtyOns) {
			// 入力数量を検品済数に登録

			if (!checkLogic.checkSpgQtyOns(wHtShipping)) {
				// 残数の超過チェック
				return;
			}
			// 検品済数登録
			updateLogic.updateWHtShipping(wHtShipping);
			// 出庫検品残数の抽出 ※ 画面DTOの検品残数を設定
			selectLogic.selectSpgQtyRemain(wHtShipping);
			// 更新が行われているので、次の画面で完了音を出す。
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
		}
		// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.13 kawana End

		// 検品未完件数抽出
		if (selectLogic.selectSpgQtyRemainCount(wHtShipping) > 0) {
			//未検品データが存在します。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NOT_COMPLETE);
			return;
		}

		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

		// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.09 kawana Start
		//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw Start

		// 箱登録チェック
		if (checkLogic.selectNoBoxCount(wHtShipping) > 0) {
			// 箱が未登録の検品データあり

			// 箱登録画面を表示
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
			//2015/04/27 KAI UPDATE START カウントアップ対応 戻り先URLを変更
			ShippingNoPackingBoxResource.load(this, util, "ShippingNoPackingQty/load", checkLogic, selectLogic, shippingLogic, clearLogic, commonLogic);
			//2015/04/27 KAI UPDATE END
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
			return;
		}

		//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw End
		// [#405][2.1.0-CT-078] F3(送信)時に検品数登録処理を追加 2016.12.09 kawana End

		//戻り先画面の設定 2015/04/27 KAI ADD カウントアップ対応
		dto.setBackUrl("ShippingNoPackingQty/load");

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//検品数が入力なかった、または検品残数が０の場合
		//送信確認画面を表示
		ShippingNoPackingSendResource.load(this, util);
		return;
	}

}
