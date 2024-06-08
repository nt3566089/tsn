package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreQtyDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;

/**
 * 入庫格納(数量入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreQty")
@HandyErrorReturnPath(returnURL = "ReceiveStoreQty/display")
public class ReceiveStoreQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	// [Ver3.0] unit of measure対応 2017.11.27 王 Start
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

	// [Ver3.0] unit of measure対応 2017.11.27 王 End

	/**
	 * 入庫格納(数量入力)画面初期化を行います。
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

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		// [Ver3.0] unit of measure対応 2018.01.17 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2018.01.17 王 End
		dto.setLoc("");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setStoreNum(null);
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入庫格納(数量入力)画面表示を行います。
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
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		HandyInputAuxiliaryInfo auxiliaryInfo = (HandyInputAuxiliaryInfo) ses.getAttribute("HandyInputAuxiliaryInfo");
		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ReceiveStoreQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			dto.setQty(auxiliaryInfo.getCalcQty());
			ses.setAttribute("ReceiveStoreDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("receive");
		auxiliaryInfo.setReturnResource("ReceiveStoreQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ReceiveStoreQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.data.wHtReceiveStoreDto.getProductId());
		auxiliaryInfo.setProductCd(dto.data.wHtReceiveStoreDto.getProductCd());
		//auxiliaryInfo.setShapeGrpId(dto.data.wHtReceiveStoreDto.getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD Start
		resource.initScreen("ReceiveStoreQtyHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreQty/send").build());
		// オプション１ボタンの設定
		resource.setOptionButton1(ButtonInfo.builder().url("ReceiveStoreList/load?backUrl=ReceiveStoreQty/display").itemCd("option1").build());

		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		dto.setPageIndex(0);
		//フッタボタン（左）設定
		if (mParam.isStoreNoFlg$1()) {
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreLabelNo/display").itemCd("return").build());
		}else{
			if ("0".equals(dto.getLotLimitDt())) {
				resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreJanCd/display").itemCd("return").build());
			} else if ("1".equals(dto.getLotLimitDt())) {
				resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreLotLimitDt/display").itemCd("return").build());

			} else if ("2".equals(dto.getLotLimitDt())) {
				resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreLot/display").itemCd("return").build());

			} else if ("3".equals(dto.getLotLimitDt())) {
				resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreLimitDt/display").itemCd("return").build());
			}
		}

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreQty/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD END
		//数量入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreQty.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ロケ入力画面に遷移します。
	 * @param bean 数量入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveStoreQtyDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		// [HT1.5-CT1-023] 2015/06/23 delete sja [S]
		//wHtReceiveStoreDto.setStoreNum(Long.parseLong(bean.getQty()));
		// [HT1.5-CT1-023] 2015/06/23 delete sja [E]
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		dto.setQty(bean.getQty());
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End
		// [Ver3.0] unit of measure対応 2017.11.23 王 Start
		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.data.wHtReceiveStoreDto.getProductCd();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("ReceiveStoreQtyHT", "qty");
		//ログイン情報
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//荷主ID
		Long clientId = loginInfo.getClientId();
		//小数有無フラグ
		String decimalExistFlg = util.getDecimalExistFlg(productCd, clientId);
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

		if (decimalExistFlg.equals("0")) {
			if (!util.decimalExistFlgCheck(decimalExistFlg, qty, qtyItemNm)) {
				return;
			}
		}
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
		// [Ver3.0] unit of measure対応 2017.11.27 王 End

		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del

		// [HT1.5-CT1-023] 2015/06/23 add sja [S]
		wHtReceiveStoreDto.setStoreNum(WCC.toBigDecimal(bean.getQty()));
		// [HT1.5-CT1-023] 2015/06/23 add sja [E]

		if (WCC.isGreaterThan(WCC.add(WCC.toBigDecimal(bean.getQty()), wHtReceiveStoreDto.getNumOfStore()), wHtReceiveStoreDto.getPlanNum())) {
			//数量と格納済数の合計が入荷数を超えている。
			// [HT1.5-CT1-023] 2015/06/23 UPDATE sja [S]
			//getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_QTY_ERROR);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR);
			// [HT1.5-CT1-023] 2015/06/23 UPDATE sja [E]

			return;
		}

		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//ロケ入力画面を表示
		ReceiveStoreLocResource.load(this, util);
		return;
	}
}
