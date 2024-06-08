package com.oneslogi.ht.wms.resources;

import java.lang.reflect.Method;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.commons.lang3.StringUtils;

import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.validator.CommonValidator;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryDto;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryProductShapeDto;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.logic.HandyInputAuxiliarySelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * ハンディ用入力補助リソースクラス
 *
 */
@Path("/handy")
public class HandyInputAuxiliaryResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private HandyScreenUtil screenUtil;
	@Inject
	private HandyInputAuxiliarySelectLogic auxiliarySelectLogic;

	// ===== 定数定義 =====

	private static final String INPUT_LIMIT_NUMBER = "^[0-9]*$";
	private static final String INPUT_LIMIT_DECIMAL_NUMBER = "^[0-9]+[\\.]?[0-9]*$";

	/**
	 * 入力補助画面を表示します。
	 * @param qty 数量
	 * @throws Exception
	 */
	@GET
	@Path("/inputQty")
	public void inputQty(@QueryParam("qty") String qty) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");

		if (CU.isNullOrEmpty(qty)) {
			auxiliaryInfo.setOriginCalcQty("");
		} else {
			auxiliaryInfo.setOriginCalcQty(qty);
		}

		// 商品情報を取得
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct searchCondition = new MProduct();
		searchCondition.setClientId(loginInfo.getClientId());
		searchCondition.setProductCd(auxiliaryInfo.getProductCd());
		MProduct resultEntity = auxiliarySelectLogic.getUkEntityWithProductShapeWithShapeWithDeletedCheck(searchCondition);

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Add Start
		if (getErrorManager().size() > 0) {
			// 数量をセッションの数量項目に設定
			if (!CU.isNullOrEmpty(qty)) {
				auxiliaryInfo.setCalcQty(qty);
				ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
			}
			// エラー画面作成
			this.sendErrorScreen(util.getMessage(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR), "", auxiliaryInfo.getErrorReturnURL());
			return;
		}
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Add End

		String errorMessage = null;
		boolean validateErrFlg = false;
		// 入力文字チェック(正規表現)
		if (!CU.isNullOrEmpty(qty)) {
			if (!CommonValidator.checkInputLimit(qty, INPUT_LIMIT_DECIMAL_NUMBER)) {
				// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana Start
				// [0]は数値のみ入力可能です。
				errorMessage = WmsMessageConst.INPUT_LIMIT_CHECK_NUMERIC_ONLY_ERROR;
				// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana End
				validateErrFlg = true;
			}
			if (resultEntity.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().isDecimalExistFlg$0()) {
				// 小数有無フラグが無の場合
				if (!CommonValidator.checkInputLimit(qty, INPUT_LIMIT_NUMBER)) {
					// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana Start
					// [0]は整数のみ入力可能です。
					// [Ver3.0] unit of measure対応 2017.12.07 王 Start
					errorMessage = WmsMessageConst.INTEGER_ERROR;
					// [Ver3.0] unit of measure対応 2017.12.07 王 End
					// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana End
					validateErrFlg = true;
				}
			}
			if (validateErrFlg) {
				// 数量をセッションの数量項目に設定
				auxiliaryInfo.setCalcQty(qty);
				ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
				// エラーメッセージ作成
				String qtyItemNm = screenUtil.itemNm("HandyInputAuxiliaryHT", "qty");
				String replaceErrorMessage = util.getMessage(errorMessage, qtyItemNm);
				// エラー画面作成
				this.sendErrorScreen(replaceErrorMessage, "", auxiliaryInfo.getErrorReturnURL());
				return;
			}
		}

		HandyInputAuxiliaryDto inputAuxiliaryDto = new HandyInputAuxiliaryDto();
		// 数量と取得した商品荷姿リストから各荷姿.計算後入数と各荷姿.子荷姿単位名称と各荷姿.内訳を取得
		inputAuxiliaryDto = auxiliarySelectLogic.getProductShapeInfo(inputAuxiliaryDto, qty, resultEntity.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp(), resultEntity.getMProductShapeList());
		inputAuxiliaryDto.data.mProductDto = mProductDtoMapper.mappingToDto(resultEntity);
		ses.setAttribute("HandyInputAuxiliaryDto", inputAuxiliaryDto);

		setDisplay(ses);
	}

	/**
	 * 数量計算結果を返却します。
	 * @param bean 入力補助画面情報を保持するDTO
	 * @param calcFlg 数量計算フラグ
	 * @throws Exception
	 */
	@GET
	@Path("/returnCalcQty")
	public void returnCalcQty(@BeanParam HandyInputAuxiliaryDto bean, @QueryParam("calcFlg") String calcFlg) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		HandyInputAuxiliaryDto inputAuxiliaryDto = (HandyInputAuxiliaryDto) ses.getAttribute("HandyInputAuxiliaryDto");

		String calcQty = null;
		if (CU.equals(calcFlg, "true")) {
			String errorMessage = null;
			String qtyItemNm = null;
			boolean validateErrFlg = false;
			inputAuxiliaryDto = auxiliarySelectLogic.getProductShapeInputQtyAll(bean, inputAuxiliaryDto);

			String inputQty = null;
			for (HandyInputAuxiliaryProductShapeDto dto : inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList()) {
				inputQty = dto.getProductShapeInputQty();
				qtyItemNm = dto.getShapeNm();
				// 入力文字チェック(正規表現)
				if (!CU.isNullOrEmpty(inputQty)) {
					String decimalExistFlg = dto.getDecimalExistFlg();
					if (!CommonValidator.checkInputLimit(inputQty, INPUT_LIMIT_DECIMAL_NUMBER)) {
						// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana Start
						// [0]は数値のみ入力可能です。
						errorMessage = WmsMessageConst.INPUT_LIMIT_CHECK_NUMERIC_ONLY_ERROR;
						// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana End
						validateErrFlg = true;
					}
					if (!validateErrFlg && decimalExistFlg.equals("0")) {
						// 小数有無フラグが無の場合
						if (!CommonValidator.checkInputLimit(inputQty, INPUT_LIMIT_NUMBER)) {
							// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana Start
							// [Ver3.0] unit of measure対応 2017.12.07 王 Start
							// [0]は整数のみ入力可能です。
							errorMessage = WmsMessageConst.INTEGER_ERROR;
							// [Ver3.0] unit of measure対応 2017.12.07 王 End
							// [#4103] 基盤に不要なメッセージを削除 2018.03.19 kawana End
							validateErrFlg = true;
						}
					}
					if (validateErrFlg) {
						break;
					}
				}
			}

			if (validateErrFlg) {
				ses.setAttribute("HandyInputAuxiliaryDto", inputAuxiliaryDto);
				// エラーメッセージ作成
				String replaceErrorMessage = util.getMessage(errorMessage, qtyItemNm);
				// エラー画面作成
				this.sendErrorScreen(replaceErrorMessage, "", "inputAuxiliaryErrorRedisplay");
				return;
			}

			// 入力補助画面で入力された各荷姿内訳数と各荷姿計算後入数を元に総数量(最小荷姿単位)を取得
			calcQty = auxiliarySelectLogic.getCalcQty(bean, inputAuxiliaryDto);
		} else {
			calcQty = auxiliaryInfo.getOriginCalcQty();
		}
		// 総数量(最小荷姿単位)をセッションの数量項目に設定
		auxiliaryInfo.setCalcQty(calcQty);
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);

		// 返却先画面のClassを取得
		Class<?> returnClass;
		String className = null;
		if (CU.isNullOrEmpty(auxiliaryInfo.getReturnPackage())) {
			className = new StringBuilder().append("com.oneslogi.ht.wms.resources.").append(StringUtils.capitalize(auxiliaryInfo.getReturnResource())).toString();
		} else {
			className = new StringBuilder().append("com.oneslogi.ht.wms.resources.").append(auxiliaryInfo.getReturnPackage()).append(".").append(StringUtils.capitalize(auxiliaryInfo.getReturnResource())).toString();
		}
		returnClass = Class.forName(className);
		// 呼び出し元画面に遷移
		Method getKeyMethod = returnClass.getMethod(auxiliaryInfo.getReturnMethod(), HandyResourceBase.class, HandyCommonUtil.class);
		getKeyMethod.invoke(returnClass.getClass(), this, util);
	}

	/**
	 * 入力補助数値入力エラー後のエラー画面から入力補助画面を再表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/inputAuxiliaryErrorRedisplay")
	public void inputAuxiliaryErrorRedisplay() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		setDisplay(ses);
	}

	/**
	 * 画面、各種ボタン、jsp設定を行います。
	 * @param ses セッション
	 */
	private void setDisplay(HttpSession ses) {
		//画面CD設定
		this.initScreen("HandyInputAuxiliaryHT");
		// 戻るボタン設定
		String returnURL = "returnCalcQty?calcFlg=false";
		this.setReturnButton(ButtonInfo.builder().url(returnURL).itemCd("return").build());
		// OKボタン設定
		String sendURL = "returnCalcQty?calcFlg=true";
		this.setSendButton(ButtonInfo.builder().url(sendURL).itemCd("ok").build());
		// フッタボタン（非表示）設定
		this.setHideButton(ButtonInfo.builder().url(sendURL).build());

		util.setTransURL(HT_URI_BASE + "/common/HandyInputAuxiliary.jsp", ses);
	}

}
