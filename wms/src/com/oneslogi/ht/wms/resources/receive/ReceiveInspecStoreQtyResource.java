package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreQtyDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;

/**
 * 検品格納(数量)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreQty")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreQty/display")
public class ReceiveInspecStoreQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;
	@Inject
	private ReceiveInspecStoreCheckLogic checkLogic;
	// [Ver3.0] unit of measure対応 2017.11.27 王 Start
	@Inject
	private HandyScreenUtil screenUtil;
	// ===== 定数定義 =====

	// [#4256] HT基盤で行っている入力チェックを削除 2018.4.18 fujiwara Del
	// [Ver3.0] unit of measure対応 2017.11.27 王 End
	/**
	 * 検品格納(数量)画面初期化を行います。
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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		// [Ver3.0] unit of measure対応 2017.11.27 王 Start
		dto.setQty("");
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		// [Ver3.0] unit of measure対応 2017.11.27 王 Del
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 検品格納(数量)画面表示を行います。
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
		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		if (auxiliaryInfo != null && CU.equals(auxiliaryInfo.getReturnResource(), "ReceiveInspecStoreQtyResource") && auxiliaryInfo.getCalcQty() != null) {
			// 入力補助画面の計算後数量を画面数量項目に設定
			dto.setQty(auxiliaryInfo.getCalcQty());
			ses.setAttribute("ReceiveInspecStoreDto", dto);
		}
		// 入力補助情報を初期化
		auxiliaryInfo = new HandyInputAuxiliaryInfo();
		auxiliaryInfo.setReturnPackage("receive");
		auxiliaryInfo.setReturnResource("ReceiveInspecStoreQtyResource");
		auxiliaryInfo.setReturnMethod("display");
		auxiliaryInfo.setErrorReturnURL("ReceiveInspecStoreQty/display");
		auxiliaryInfo.setClientId(loginInfo.getClientId());
		auxiliaryInfo.setClientCd(loginInfo.getClientCd());
		auxiliaryInfo.setProductId(dto.getTReceivePlanBDto().getMProduct().getProductId());
		auxiliaryInfo.setProductCd(dto.getTReceivePlanBDto().getMProduct().getProductCd());
		auxiliaryInfo.setShapeGrpId(dto.getTReceivePlanBDto().getMProduct().getShapeGrpId());
		ses.setAttribute("HandyInputAuxiliaryInfo", auxiliaryInfo);
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start
		req.setAttribute("inputAuxiliaryVisible", util.isVisibleAuxiliary(auxiliaryInfo));
		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreQtyHT");
		// 左上ボタンの設定
		resource.setOptionButton1(
				ButtonInfo.builder()
				.url("ReceiveInspecStoreList/load?backUrl=ReceiveInspecStoreQty/display").itemCd("option1").build()
				);
		// 右上ボタンの設定
		resource.setOptionButton2(ButtonInfo.builder().url("ReceiveInspecStoreQty/complete").itemCd("option2").build());
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspecStoreQty/send").build());
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreJan/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreQty/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreQty.jsp", ses);

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
	public void send(@BeanParam ReceiveInspecStoreQtyDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		tReceivePlanBDto.setProductId(tReceivePlanBDto.getProductId());
		tReceivePlanBDto.setProductCd(tReceivePlanBDto.getProductCd());
		// [Ver3.0] unit of measure対応 2017.11.27 王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		// [Ver3.0] unit of measure対応 2017.11.27 王 Del
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End

		// [Ver3.0] unit of measure対応 2017.11.27 王 Start

		// [#4256] 数量の必須チェックをHT基盤の機能(引数マスタ)で実施(ここからは削除) 2018.04.17 kawana Delete

		//荷姿グループマスタから小数有無フラグ取得
		String qty = dto.getQty();
		//商品CD
		String productCd = dto.getTReceivePlanBDto().getMProduct().getProductCd();
		// エラーメッセージ作成
		String qtyItemNm = screenUtil.itemNm("ReceiveInspecStoreQtyHT", "qty");
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
		// [Ver3.0] unit of measure対応 2017.11.23 王 End

		// 検品数が1以上チェック
		BigDecimal storeNum = WCC.toBigDecimal(CU.nullOrEmptyToZero(dto.getQty()));
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou Start
		// [Ver3.0] unit of measure対応 2017.11.27 王 Del
		//storeNum = WCC.add(storeNum, WCC.multiply(WCC.toBigDecimal(CU.nullOrEmptyToZero(dto.getQty())), tReceivePlanBDto.getUnitNum()));
		//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou End
		// [#4256] HT基盤で行っている入力チェックを削除 2018.4.19 fujiwara Del
		// 計算した検品数を保存する
		dto.setStoreNum(storeNum);

		// === パラメータマスタの過入荷可フラグに応じて入力した数量のチェックを行う ===
		// パラメータマスタの過入荷可フラグが'0：不可'の場合
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		if (dto.getMParamDto().getOverStoreNumFlg().equals("0") || CU.nullToStr(tReceivePlanBDto.getTReceivePlanH().getCenterTransitFlg()).equals("1")) {
			// 入力された数量が入荷予定数を超えていないかチェックを行う
			TReceivePlanBDtoMapper planBDtoMapper = new TReceivePlanBDtoMapper();
			TReceivePlanB planB = planBDtoMapper.mappingToEntity(tReceivePlanBDto);
			planB.setPreceNum(storeNum);
			checkLogic.checkOverPlanNum(planB);
			if (getErrorManager().size() > 0) {
				return;
			}
			//ON推-品向-1005  センタ間移動の場合の為処理追加   2015/11/26 NayZaw Start

			MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
			MProduct mProduct = mProductDtoMapper.mappingToEntity(tReceivePlanBDto.getMProduct());
			if(tReceivePlanBDto.getTReceivePlanH().getCenterTransitFlg().equals("1")){
				ses.setAttribute("ReceiveInspecStoreDto", dto);
				// ロット・期限日選択画面を表示
				if(mProduct.isLotManagFlg$1() || mProduct.isLimitDtManagFlg$1()){
					ReceiveInspecStoreCenterMoveLotLimitDtResource.load(this,util,null,selectLogic);
					return;
				}else{
					// ロット/期限日管理品ではない場合
					MParam mParam = new MParam();
					mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
					if (mParam.isStoreNoFlg$1() && dto.getLabelKbn().equals("2")) {
						// 汎用ラベルNO入力確認画面へ遷移する
						ReceiveInspecStoreLabelInputResource.load(this, util);
						return;
					}
					else{
						// 検品確認画面へ遷移する
						ReceiveInspecStoreLocationResource.load(this, util);
						return;
					}
				}
			}
			//ON推-品向-1005 センタ間移動の場合の為処理追加   2015/11/26 NayZaw End
		}
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(tReceivePlanBDto.getMProduct());
		// ==== 【JAN入力】画面で入力したJAN/商品コードのロット管理フラグ期限日管理フラグに応じて遷移先画面を変更する ====
		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
			// ロット・期限日入力画面を表示
			ses.setAttribute("ReceiveInspecStoreDto", dto);
			ReceiveInspecStoreLotLimitDtResource.load(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
			// ロット入力画面を表示
			ses.setAttribute("ReceiveInspecStoreDto", dto);
			ReceiveInspecStoreLotResource.load(this, util);
			return;
		}

		if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
			// 期限日入力画面を表示
			ses.setAttribute("ReceiveInspecStoreDto", dto);
			ReceiveInspecStoreLimitDtResource.load(this, util);
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
				ReceiveInspecStoreLabelInputResource.load(this, util);
			} else {
				// ロケ入力画面を表示
				ReceiveInspecStoreLocationResource.load(this, util);
			}
		}

		dto.setTReceivePlanBDto(tReceivePlanBDto);
		ses.setAttribute("ReceiveInspecStoreDto", dto);

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
	public void complete(@BeanParam ReceiveInspecStoreQtyDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();
		// [Ver3.0] unit of measure対応 2017.11.27 王 Start
		dto.setQty(bean.getQty());
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		// [Ver3.0] unit of measure対応 2017.11.27 王 Del
		// 数量の入力チェックを行う
		// [Ver3.0] unit of measure対応 2017.11.27 王 Start
		if (!(CU.isNullOrEmpty(bean.getQty()))) {
			// [Ver3.0] unit of measure対応 2017.11.27 王 End
			// 数量は空白以外場合、エラーを表示する。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_QTY_COMPLETE_NO_INPUT );
			return;
		}

		// 商品単位の総検品済数の取得
		WHtReceiveInspection wReceive = new WHtReceiveInspection();
		wReceive.setCenterId(tReceivePlanBDto.getTReceivePlanH().getCenterId());
		wReceive.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());
		wReceive.setHtWorkNo(tReceivePlanBDto.getTReceivePlanH().getReceiveSlipNo());
		wReceive.setMacAddress(dto.getMacAddress());
		wReceive.setProductId(tReceivePlanBDto.getProductId());

		//ON推-品向-1005 センタ間移動の場合処理修正 2015/11/26 NayZaw Start
		if(tReceivePlanBDto.getTReceivePlanH().getCenterTransitFlg()!=null){
			if(tReceivePlanBDto.getTReceivePlanH().getCenterTransitFlg().equals("1")){
				List<TReceivePlanBDto> lstPlanBDto=dto.getLstTReceivePlanBDto();
				BigDecimal totalPlan=WCC.ZERO;
				for(TReceivePlanBDto planBDto:lstPlanBDto){
					totalPlan= WCC.add(totalPlan, planBDto.getPlanNum());
				}
				//[ON推-1.1.4-CT-034]CT指摘不具合の対応 2016.05.19 chou Mod Start
				if(WCC.isPositive(totalPlan)){
					tReceivePlanBDto.setPlanNum(totalPlan);
				}
				//[ON推-1.1.4-CT-034]CT指摘不具合の対応 2016.05.19 chou Mod End
			}
		}
		//ON推-品向-1005 センタ間移動の場合処理修正 2015/11/26 NayZaw End

		BigDecimal lngStoreNum = selectLogic.getMyStoreNum(wReceive);

		// 検品数はHT毎ではなく全体の入庫数を表示(不要な処理を削除)

		//差異の有無は伝票No,商品単位の実績数のサマリで比較
		lngStoreNum = selectLogic.selectStoreNum(wReceive);
		// 検品数はHT毎ではなく全体の入庫数を表示
		dto.setStoreNumSum(lngStoreNum);

		// 商品単位の総入荷予定数と総検品済数を比較して遷移先画面を変更する
		if (lngStoreNum.compareTo(tReceivePlanBDto.getPlanNum()) == 0) {
			// 【完了確認(商品単位 差異無)】画面へ遷移する
			dto.setDifferentFlg("0");
		} else {
			// 【完了確認(商品単位 差異有)】画面へ遷移する
			if (lngStoreNum.compareTo(tReceivePlanBDto.getPlanNum()) > 0) {
				dto.setDifferentFlg("1");
			} else {
				dto.setDifferentFlg("2");
			}
		}

		if (!dto.getDifferentFlg().equals("0")) {
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_WARN);
		}
		// [Ver3.0] unit of measure対応 2017.11.27 王 Start
		dto.storeNum=lngStoreNum;
		// [Ver3.0] unit of measure対応 2017.11.27 王 End
		ses.setAttribute("ReceiveInspecStoreDto", dto);
		// 【完了確認(商品単位】画面へ遷移する
		ReceiveInspecStoreSendProductResource.load(this, util);
	}
}
