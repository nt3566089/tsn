package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionInsertLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;

/**
 * 入荷検品確認画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionSend")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionSend/display")
public class ReceiveInspectionSendResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspectionInsertLogic insertLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveInspectionSelectLogic selectLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// ON推-品向-1048 過入荷不可時、同時に検品して予定数より超える場合エラー画面を表示する処理を追加 2016.3.24 nayzaw Start
	@Inject
	private ReceiveInspectionCheckLogic checkLogic;
	// ON推-品向-1048 過入荷不可時、同時に検品して予定数より超える場合エラー画面を表示する処理を追加 2016.3.24 nayzaw End

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 Start
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private ReportLogic reportLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 End
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	@Inject
	private StoreLabelPrintLogic storeLabelPrintLogic;
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要変数 numberingCenterLogic, customerLogic, tStoreRecordHBhv を削除) 2018.04.27 honma/kawana Delete
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

	/**
	 * 入荷検品確認画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		//自画面表示
		display(resource, util);
	}

	/**
	 * 入荷検品確認画面表示を行います。
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

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());

		// ==== 【JAN入力】画面で入力したJAN/商品コードのロット管理フラグ期限日管理フラグに応じて遷移先画面を変更する ====
		String backUrl = "ReceiveInspectionQty/display";

		// 汎用ラベル使用場合
		if (dto.getLabelKbn().equals("2")) {
			backUrl = "ReceiveInspectionLabelInput/display";
		}
		//センタ間移動の場合
		else if(dto.getTReceivePlanBDto().getTReceivePlanH().getCenterTransitFlg().equals("1")){
			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
				// ロット・期限日入力画面を表示
				backUrl = "ReceiveInspectionCenterMoveLotLimitDt/display";
			}

			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
				// ロット入力画面を表示
				backUrl = "ReceiveInspectionCenterMoveLotLimitDt/display";
			}

			if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
				// 期限日入力画面を表示
				backUrl = "ReceiveInspectionCenterMoveLotLimitDt/display";
			}
		}else {
			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$1()) {
				// ロット・期限日入力画面を表示
				backUrl = "ReceiveInspectionLotLimitDt/display";
			}

			if (mProduct.isLotManagFlg$1() && mProduct.isLimitDtManagFlg$0()) {
				// ロット入力画面を表示
				backUrl = "ReceiveInspectionLot/display";
			}

			if (mProduct.isLotManagFlg$0() && mProduct.isLimitDtManagFlg$1()) {
				// 期限日入力画面を表示
				backUrl = "ReceiveInspectionLimitDt/display";
			}
		}

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionSendHT");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url(backUrl)
				.itemCd("no")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_RETURN).build());

		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("ReceiveInspectionSend/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_SEND).build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionSend.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング画面に遷移します。
	 */
	@GET
	@Path("/send")
	// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana Start
	@WorkLogMergeEnd("ReceiveInspectionHT")
	// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		// 商品情報の取得
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getMProduct());

		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// 荷主センタマスタ検索
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(tReceivePlanH.getClientId());
		clientCenterC.setCenterId(tReceivePlanH.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);

		//ON推-品向-985 センタ間移動場合の処理修正 2015/11/26 NayZaw Start
		List<TReceivePlanB> planBodyList;
		if(tReceivePlanH.getCenterTransitFlg()!=null){
			if(tReceivePlanH.getCenterTransitFlg().equals("1") && (mProduct.isLotManagFlg$1() || mProduct.isLimitDtManagFlg$1())){
				//予定データの取得
				planBodyList = selectLogic.selectReceivePlanListData(tReceivePlanH, mProduct, bUser,tReceivePlanBDto.getPlanLot(),tReceivePlanBDto.getPlanLimitDt());
			}
			else{
				planBodyList = selectLogic.selectReceivePlanListData(tReceivePlanH, mProduct, bUser);
			}
		}else{
			planBodyList = selectLogic.selectReceivePlanListData(tReceivePlanH, mProduct, bUser);
		}

		if (planBodyList == null) {
			return;
		}
		//ON推-品向-985 センタ間移動場合の処理修正 2015/11/26 NayZaw End

		//入荷予定ボディ単位の入庫実績データの取得
		TStoreRecordH tStoreH = new TStoreRecordH();
		tStoreH.setReceivePlanHId(tReceivePlanBDto.getTReceivePlanH().getReceivePlanHId());

		tStoreH = selectLogic.selectStoreRecordeH(tStoreH);

		// 入庫実績ヘッダ
		TStoreRecordH storeHead = new TStoreRecordH();
		// 入庫実績ボディリスト
		List<TStoreRecordB> storeBodyList = new ArrayList<TStoreRecordB>();

		if (tStoreH != null) {
			//入庫実績ヘッダが存在場合
			storeHead = tStoreH;
		} else {
			//入庫実績ヘッダが存在しない場合

			//入庫実績情報の設定
			storeHead.setReceivePlanHId(planBodyList.get(0).getTReceivePlanH().getReceivePlanHId());
			storeHead.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());
			storeHead.setCenterId(tReceivePlanBDto.getTReceivePlanH().getCenterId());
			storeHead.setProcessTypeId(tReceivePlanBDto.getTReceivePlanH().getProcessTypeId());
			storeHead.setClientReceiveNo(tReceivePlanBDto.getTReceivePlanH().getClientReceiveNo());
			storeHead.setSupplierId(tReceivePlanBDto.getTReceivePlanH().getPlanSupplierId());
			storeHead.setDepositId(tReceivePlanBDto.getTReceivePlanH().getPlanDepositId());
			//[ON推-品向-941] 在庫区分のセット処理を追加 2015/09/11 KAI ADD START
			storeHead.setStockTypeId(tReceivePlanBDto.getTReceivePlanH().getStockTypeId());
			//[ON推-品向-941] 在庫区分のセット処理を追加 2015/09/11 KAI ADD END
			//[#999] 顧客入荷指示Noを設定する 2017/2/16 nayzaw Start
			storeHead.setClientReceiveNo(tReceivePlanBDto.getTReceivePlanH().getPlanClientReceiveNo());
			//[#999] 顧客入荷指示Noを設定する 2017/2/16 nayzaw End
			storeHead.setTReceivePlanH(planBodyList.get(0).getTReceivePlanH());

		}

		BigDecimal lngStoreRecordQty = dto.getStoreNum();
		BigDecimal lngStoreNum = dto.getStoreNum();
		Boolean isOverStoreNumFlg = false;
		//for (TReceivePlanB receiveB : planBodyList) {
		TReceivePlanB receiveB = new TReceivePlanB();
		for (int i = 0; i < planBodyList.size(); i++) {
			receiveB = planBodyList.get(i);

			// 全て検品済数（含む今回検品数）
			lngStoreRecordQty = WCC.add(lngStoreRecordQty, receiveB.getSumStoreNum());

			if (WCC.isZeroOrLess(lngStoreNum)) {
				break;
			}

			//未全て検品済（入庫数＜予定数）
			if (WCC.isLessThan(receiveB.getSumStoreNum(), receiveB.getPlanNum())) {
				TStoreRecordB storeBody = new TStoreRecordB();

				if (WCC.isLessEqual(lngStoreNum, WCC.subtract(receiveB.getPlanNum(), receiveB.getSumStoreNum()))) {
					storeBody.setStoreNum(lngStoreNum);
					lngStoreNum = WCC.ZERO;
				} else {
					//予定ボディ件数より分割する
					if (i == planBodyList.size() - 1) {
						//過入荷場合、最後１件目に追加
						storeBody.setStoreNum(lngStoreNum);
						lngStoreNum = WCC.ZERO;
						isOverStoreNumFlg = true;
					} else {
						storeBody.setStoreNum(WCC.subtract(receiveB.getPlanNum(), receiveB.getSumStoreNum()));
						lngStoreNum = WCC.add(WCC.subtract(lngStoreNum, receiveB.getPlanNum()), receiveB.getSumStoreNum());
					}
				}
				storeBody.setStoreRecordHId(storeHead.getStoreRecordHId());
				storeBody.setReceivePlanBId(receiveB.getReceivePlanBId());
				storeBody.setClientOrderNo(receiveB.getPlanClientOrderNo());
				storeBody.setLot(tReceivePlanBDto.getPlanLot());
				storeBody.setLimitDt(tReceivePlanBDto.getPlanLimitDt());
				// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start
				storeBody.setStoreDt(clientCenter.getSystemDt());
				// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End
				storeBody.setStoreFlg_$0();
				storeBody.setStoreLocationId(tReceivePlanBDto.getPlanLocationId());
				storeBody.setInputType_$30();
				storeBody.setStoreLabelNo(tReceivePlanBDto.getPlanStoreLabelNo());
				storeBody.setHtStoreInspectionDt(clientCenter.getSystemDt());
				storeBody.setHtStoreInspectionUserId(String.valueOf(bUser.getUserId()));
				// [#999] 顧客発注No.を設定する 2017/2/16 nayzaw Start
				storeBody.setClientOrderNo(tReceivePlanBDto.getPlanClientOrderNo());
				// [#999] 顧客発注No.を設定する 2017/2/16 nayzaw End
				storeBody.setTReceivePlanB(receiveB);
				storeBody.setTStoreRecordH(storeHead);

				storeBodyList.add(storeBody);
			}
		}

		// 全て検品済場合、再検品する
		if (WCC.isPositive(lngStoreNum)) {
			//過入荷場合
			isOverStoreNumFlg = true;

			TStoreRecordB storeBody = new TStoreRecordB();
			storeBody.setStoreNum(lngStoreNum);

			storeBody.setStoreRecordHId(storeHead.getStoreRecordHId());
			storeBody.setReceivePlanBId(receiveB.getReceivePlanBId());
			storeBody.setClientOrderNo(receiveB.getPlanClientOrderNo());
			storeBody.setLot(tReceivePlanBDto.getPlanLot());
			storeBody.setLimitDt(tReceivePlanBDto.getPlanLimitDt());
			// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start
			storeBody.setStoreDt(clientCenter.getSystemDt());
			// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End
			storeBody.setStoreFlg_$0();
			storeBody.setStoreLocationId(tReceivePlanBDto.getPlanLocationId());
			storeBody.setInputType_$30();
			storeBody.setStoreLabelNo(tReceivePlanBDto.getPlanStoreLabelNo());
			storeBody.setHtStoreInspectionDt(clientCenter.getSystemDt());
			storeBody.setHtStoreInspectionUserId(String.valueOf(bUser.getUserId()));
			// [#999] 顧客発注No.を設定する 2017/2/16 nayzaw Start
			storeBody.setClientOrderNo(tReceivePlanBDto.getPlanClientOrderNo());
			// [#999] 顧客発注No.を設定する 2017/2/16 nayzaw End

			storeBody.setTReceivePlanB(receiveB);
			storeBody.setTStoreRecordH(storeHead);

			storeBodyList.add(storeBody);
		}

		TStoreRecordBDtoMapper tStoreRecordDtoMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordBDto> lstTStoreRecordBDto = tStoreRecordDtoMapper.mappingToDtoList(storeBodyList);

		dto.setLstTStoreRecordBDto(lstTStoreRecordBDto);
		ses.setAttribute("ReceiveInspectionDto", dto);

		// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana Start

		// 作業実績に数量を登録(WAS連携)
		setWorkLogQty(dto.getStoreNum());

		// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana End

		// 入力された数量が入荷予定数を超えている 且つ パラメータマスタの過入荷可フラグが'1：可能'の場合
		//[HT1.5-CT1-028] 他の端末での過入荷がチェックできてないためチェック方法を修正 2015/06/25 KAI UPDATE START
		//if (isOverStoreNumFlg && dto.getOverStoreNumFlg().equals("1")) {
		if (isOverStoreNumFlg) {
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
			if (dto.getMParamDto().getOverStoreNumFlg().equals("1")) {
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]

				// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana Start
				// 作業実績の登録は次の確認画面で行う
				skipWorkLogEnd();
				// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana End

				//過入荷可能なら入荷検品数確認画面を表示
				ReceiveInspectionSendQtyResource.load(this, util);
			} else {
				//過入荷不可ならエラー画面を表示
				//検品数が予定数を超えています。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_QTY_OVER_ERROR);
				return;
			}
		//[HT1.5-CT1-028] 他の端末での過入荷がチェックできてないためチェック方法を修正 2015/06/25 KAI UPDATE END
		} else {

			// ON推-品向-1048 過入荷不可時、同時に検品して予定数より超える場合エラー画面を表示する処理を追加 2016.3.24 nayzaw Start
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
			if(!dto.getMParamDto().getOverStoreNumFlg().equals("1")){
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
				// 過入荷不可の場合
				receiveB.setPreceNum(dto.getStoreNum());
				checkLogic.checkOverPlanNum(receiveB);
				if (getErrorManager().size() > 0){
					return;
				}
			}
			// ON推-品向-1048 過入荷不可時、同時に検品して予定数より超える場合エラー画面を表示する処理を追加 2016.3.24 nayzaw End

			/* 2015/06/11 INOUE ADD START 色・音の適用 */
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
			/* 2015/06/11 INOUE ADD END */

			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 Start
			//検品データを登録する
			ReceiveInspectionResource.register(this, util, userLogic, selectLogic, insertLogic,autoPrintLogic,reportLogic, storeLabelPrintLogic, productLabelLogic);
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 End
			// [#1755]入庫ラベル最新化 2017.07.24 sampei End
			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
		}
	}
}
