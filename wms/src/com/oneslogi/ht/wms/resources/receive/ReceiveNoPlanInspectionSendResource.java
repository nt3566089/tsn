package com.oneslogi.ht.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveNoPlanInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.dto.AutoPrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionInsertLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;

/**
 * 予定無し入荷確認画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionSend")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionSend/display")
public class ReceiveNoPlanInspectionSendResource extends HandyResourceBase {

	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
	// private static final String REPORT_CD = "ProductLabel";
	private static final String PRODUCT_REPORT_CD = "ProductLabel";
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になった変数STORE_REPORT_CDを削除) 2018.04.27 kawana Delete
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionInsertLogic insertLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 Start
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private ReportLogic reportLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 End
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になった変数tStoreRecordHBhv, numberingCenterLogic, customerLogicを削除) 2018.04.27 kawana Delete
	@Inject
	private StoreLabelPrintLogic storeLabelPrintLogic;
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

	/**
	 * 予定無し入荷確認画面初期化を行います。
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
	 * 予定無し入荷確認画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionSendHT");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionLoc/display")
				.itemCd("no")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_RETURN)
				.build());

		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionSend/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_NO_DATA)
				.keyType(KEY_TYPE_SEND)
				.build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionSend.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング画面に遷移します。
	 */
	@GET
	@Path("/send")
	// [#3978][Ver3.0] WAS連携対応 2018.03.09 kawana Start
	@WorkLogMergeEnd("ReceiveNoPlanInspectionHT")
	// [#3978][Ver3.0] WAS連携対応 2018.03.09 kawana End
	public void send() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		final long centerId = wHtReceiveNoPlanInspecDto.getCenterId();
		final long clientId = wHtReceiveNoPlanInspecDto.getClientId();

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// 荷主センタマスタ検索
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(clientId);
		clientCenterC.setCenterId(centerId);
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);

		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH planHead = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanHDto());

		if (CU.isNullOrEmpty(planHead.getReceiveSlipNo())) {
			//入荷予定ヘッダが存在しない場合

			//入荷予定情報の設定
			planHead.setClientId(clientId);
			planHead.setCenterId(centerId);
			//[ON推-品向-993] 設定不要項目削除 2015/11/13 NayZaw
			planHead.setReceivePlanDt(clientCenter.getSystemDt());
			//[ON推-品向-993] 設定不要項目削除 2015/11/13 NayZaw
			planHead.setReceiveStatus_$01();
			planHead.setInputType_$30();
			planHead.setReceiveDeliveryStatus_$00();
			planHead.setCenterTransitFlg("0");
			planHead.setErrorFlg_$0();
			planHead.setDelFlg_$0();
		}

		// 入荷予定ボディリスト情報の取得
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		TReceivePlanB planBody = new TReceivePlanB();

		long lineNo = 1l;
		if (!CU.isNullOrEmpty(planHead.getReceiveSlipNo())) {
			//入荷予定ヘッダが存在します場合
			List<TReceivePlanB> lstTReceivePlanB = selectLogic.selectReceivePlanB(planHead);

			//入荷予定ボディ情報の設定
			if (lstTReceivePlanB.size() > 0) {
				lineNo = lstTReceivePlanB.get(0).getLineNo().longValue() + 1;
			}
		}
		planBody.setLineNo(lineNo);
		planBody.setReceiveStatus_$01();

		// ===== ロケーションコードがある場合はロケーションと倉庫を設定 =====
		// ロケーションの設定
		MLocation locationCondition = new MLocation();
		locationCondition.setCenterId(centerId);
		locationCondition.setLocationCd(wHtReceiveNoPlanInspecDto.getRcvLocCd());

		MLocation location = locationLogic.getUkEntityWithWarehouse(locationCondition, new ErrorStatus());

		if (location != null) {
			//[ON推-品向-993] 設定不要項目削除 2015/11/13 NayZaw

			// 倉庫の設定
			MWarehouse warehouse = location.getMZone().getMWarehouse();
			planBody.setPlanWarehouseId(warehouse.getWarehouseId());
			planBody.setPlanWarehouseCd(warehouse.getWarehouseCd());
		}

		planBody.setProductId(wHtReceiveNoPlanInspecDto.getProductId());
		planBody.setProductCd(wHtReceiveNoPlanInspecDto.getProductCd());
		//[ON推-品向-993] 設定不要項目削除  2015/11/13 NayZaw
		planBody.setPlanStoreLabelNo(wHtReceiveNoPlanInspecDto.getStoreNo());
		planBody.setPlanNum(WCC.ZERO);
		planBody.setErrorFlg_$0();
		planBody.setDelFlg_$0();
		planBodyList.add(planBody);

		// DBに入荷予定を登録
		insertLogic.planInsert(planHead, planBodyList, new ErrorStatus());
		// 結果判定
		if (this.getErrorManager().size() > 0) {
			// 処理中止
			return;
		}

		//入荷予定ボディ単位の入庫実績データの取得
		TStoreRecordH tStoreH = new TStoreRecordH();
		tStoreH.setReceivePlanHId(planHead.getReceivePlanHId());

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
			storeHead.setReceivePlanHId(planHead.getReceivePlanHId());
			storeHead.setClientId(clientId);
			storeHead.setCenterId(centerId);
			storeHead.setStockTypeId(wHtReceiveNoPlanInspecDto.getStockTypeId());
			storeHead.setProcessTypeId(wHtReceiveNoPlanInspecDto.getProcessTypeId());
			storeHead.setClientReceiveNo(wHtReceiveNoPlanInspecDto.getClientReceiveNo());
			storeHead.setSupplierId(wHtReceiveNoPlanInspecDto.getSupplierId());
			storeHead.setDepositId(wHtReceiveNoPlanInspecDto.getDepositId());

			storeHead.setTReceivePlanH(planHead);
		}

		// 入庫実績ボディ
		TStoreRecordB storeBody = new TStoreRecordB();
		//入庫実績ボディ情報の設定
		storeBody.setStoreRecordHId(storeHead.getStoreRecordHId());
		storeBody.setReceivePlanBId(planBodyList.get(0).getReceivePlanBId());
		storeBody.setClientOrderNo(planBodyList.get(0).getPlanClientOrderNo());
		storeBody.setLot(wHtReceiveNoPlanInspecDto.getLot());
		storeBody.setLimitDt(wHtReceiveNoPlanInspecDto.getLimitDt());
		storeBody.setStoreDt(planHead.getReceivePlanDt());
		storeBody.setStoreNum(dto.getStoreNum());
		storeBody.setStoreFlg_$0();
		storeBody.setStoreLocationId(wHtReceiveNoPlanInspecDto.getRcvLocId());
		storeBody.setInputType_$30();
		storeBody.setStoreLabelNo(wHtReceiveNoPlanInspecDto.getStoreNo());
		storeBody.setHtStoreInspectionDt(clientCenter.getSystemDt());
		storeBody.setHtStoreInspectionUserId(String.valueOf(bUser.getUserId()));

		storeBody.setTReceivePlanB(planBodyList.get(0));
		storeBody.setTStoreRecordH(storeHead);

		storeBodyList.add(storeBody);

		// 入荷実績登録.入荷実績登録メソッドを呼出し
		insertLogic.insert(storeHead, storeBodyList, new ErrorStatus());
		if (this.getErrorManager().size() > 0) {
			// 処理中止
			return;
		}

		// [#3978][Ver3.0] WAS連携対応 2018.03.09 kawana Start

		// 作業実績に数量を登録(WAS連携)
		setWorkLogQty(dto.getStoreNum());

		// [#3978][Ver3.0] WAS連携対応 2018.03.09 kawana End

		// 入荷検品ワークの登録
		WHtReceiveNoPlanInspDtoMapper wHtReceiveNoPlanInspecDtoMapper = new WHtReceiveNoPlanInspDtoMapper();
		WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec = wHtReceiveNoPlanInspecDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto);
		wHtReceiveNoPlanInspec.setMacAddress(dto.getMacAddress());
		wHtReceiveNoPlanInspec.setHtWorkNo(planHead.getReceiveSlipNo());
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
		wHtReceiveNoPlanInspec.setPieceQtyRcv(dto.getStoreNum());
		wHtReceiveNoPlanInspec.setStoreNo(dto.getStoreLabelNo());
		wHtReceiveNoPlanInspec.setLabelSelect(dto.getLabelKbn());
		wHtReceiveNoPlanInspec.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
		wHtReceiveNoPlanInspec.setWorkEndDt(AccessContext.getAccessTimestampOnThread());

		insertLogic.insertWHtReceiveNoPlanInsp(wHtReceiveNoPlanInspec);

		if (CU.isNullOrEmpty(wHtReceiveNoPlanInspecDto.getHtWorkNo())) {
			//通信制御データ作成
			String reopenKey = dto.getLabelKbn();
			reopenKey = reopenKey + "," + CU.nullToStr(planHead.getReceiveSlipNo());
			// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA Start
			//			reopenKey = reopenKey + "," + CU.nullToStr(wHtReceiveNoPlanInspecDto.getClientReceiveNo());
			//			reopenKey = reopenKey + "," + dto.getDeposit();
			//			reopenKey = reopenKey + "," + dto.getProcessType();
			//			reopenKey = reopenKey + "," + dto.getStockType();
			//			reopenKey = reopenKey + "," + dto.getSupplier();
			// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA End
			util.setHtComCtl(ses, "ReceiveNoPlanInspection", reopenKey);
		}

		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		if ("2".equals(dto.getMParamDto().getResultAfterProductLabel()) || "3".equals(dto.getMParamDto().getResultAfterProductLabel())) {
			if ("1".equals(dto.getMParamDto().getResultAfterProductTarget())) {
				// 入庫ラベル自動発行

				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start
				for (TStoreRecordB tStoreRecordB : storeBodyList) {

					String storeLabelNo = tStoreRecordB.getStoreLabelNo();
					if (storeLabelNo == null) {
						// 0入庫の場合 (在庫更新しないので入荷実績登録.入荷実績登録メソッドで入庫ラベルNo.が設定されない)
						continue;
					}

					storeLabelPrintLogic.autoPrintUnprintOnly(centerId, storeLabelNo, new ErrorStatus());
					if (0 < getErrorManager().size()) {
						return;
					}
				}
				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End
			}
			if ("2".equals(dto.getMParamDto().getResultAfterProductTarget())) {
				printProductLabel(wHtReceiveNoPlanInspecDto, dto);
			}

			// [#3353] 商品ラベル発行エラー後の処理で致命的エラー発生 2018.01.19 kawana Start
			if (0 < getErrorManager().size()) {
				return;
			}
			// [#3353] 商品ラベル発行エラー後の処理で致命的エラー発生 2018.01.19 kawana End
		}
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 Start
		// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
		//同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
		//		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD),"1");
		//		if (pReportLayout !=  null) {
		//			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
		//			// 実績入力後商品ラベル出力の判定　2:HTで実績入力後のみ出力,3：出力する
		//			if ("2".equals(dto.getMParamDto().getResultAfterProductLabel()) || "3".equals(dto.getMParamDto().getResultAfterProductLabel())){
		//
		//				// 出力内容
		//				MProductDto mProductDto = wHtReceiveNoPlanInspecDto.getMProduct();
		//				List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();
		//
		//				// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
		//				// 出力枚数取得
		//				long outCnt = WmsProductLabelUtil.getOutNum(wHtReceiveNoPlanInspecDto.getCaseUnitNum(), dto.storeNum, dto.getMParamDto());
		//				// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End
		//
		//				ProductLabelDto redto = new ProductLabelDto();
		//
		//				// 商品ラベル情報取得
		//				redto = WmsProductLabelUtil.getProductLabelDto(mProductDto, dto.getMParamDto());
		//				redto.cultureId = util.getCultureId();
		//
		//				for(int i = 0 ; i < outCnt ; i++ ){
		//					retList.add(redto);
		//				}
		//
		//				// ※※ 自動発行のため発行枚数の上限チェックはしない
		//
		//				// 帳票発行処理
		//				JSON json = new JSON();
		//				json.setSuppressNull(true);
		//
		//				AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(PRODUCT_REPORT_CD);
		//				// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
		////				//同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
		////				PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD),"1");
		//				// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
		//				autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
		//				//印刷内容
		//				autoPrintParamDto.printBasicData.outputData = json.format(retList);
		//
		//				AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);
		//
		//				// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana Start
		//				if (!result.isSuccess()) {
		//					// 商品ラベル発行失敗
		//
		//					getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_LABEL_PRINT_ERROR);
		//					return;
		//				}
		//				// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana End
		//			}
		//			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
		//		}
		// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.14 End
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End

		// ==== 登録後、商品単位で予定数を再取得する ====
		wHtReceiveNoPlanInspecDto.setHtWorkNo(planHead.getReceiveSlipNo());
		wHtReceiveNoPlanInspecDto.setLot("");
		wHtReceiveNoPlanInspecDto.setLimitDt("");

		// 入荷予定データの取得
		List<TReceivePlanB> lstTReceivePlanB = selectLogic.selectReceivePlanB(planHead);
		dto.setTReceivePlanHDto(tReceivePlanHDtoMapper.mappingToDto(lstTReceivePlanB.get(0).getTReceivePlanH()));
		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//数量入力画面を表示
		ReceiveNoPlanInspectionQtyResource.load(this, util);
	}

	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	/**
	 * <h2>商品ラベル発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに商品ラベル発行データを取得する
	 * </pre>
	 * @param printDto 商品ラベル発行画面用DTO
	 * @return productLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	public void printProductLabel(WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto, ReceiveNoPlanInspectionDto dto) throws Exception {
		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(PRODUCT_REPORT_CD), "1");
		if (pReportLayout != null) {
			// 出力内容
			MProductDto mProductDto = wHtReceiveNoPlanInspecDto.getMProduct();
			List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();

			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
			// [Ver3.0] unit of measure対応 2017.12.01 王 Del
			// [#3670][Ver3.0] [HT]予定無し入荷 - 商品ラベル自動発行異常 2018.02.08 honma Mod Start
			// 出力枚数取得
			long outCnt = productLabelLogic.getOutNum(mProductDto.getProductId(), dto.storeNum, dto.getMParamDto());
			// [#3670][Ver3.0] [HT]予定無し入荷 - 商品ラベル自動発行異常 2018.02.08 honma Mod End
			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End

			ProductLabelDto redto = new ProductLabelDto();

			// 商品ラベル情報取得
			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
			redto = productLabelLogic.getProductLabelDto(mProductDto, dto.getMParamDto());
			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
			redto.cultureId = util.getCultureId();

			// [#3670][Ver3.0] [HT]予定無し入荷 - 商品ラベル自動発行異常 2018.02.08 honma Mod Start
			for (int i = 0; i < outCnt; i++) {
				retList.add(redto);
			}
			// [#3670][Ver3.0] [HT]予定無し入荷 - 商品ラベル自動発行異常 2018.02.08 honma Mod End

			// ※※ 自動発行のため発行枚数の上限チェックはしない

			// 帳票発行処理
			JSON json = new JSON();
			json.setSuppressNull(true);

			AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(PRODUCT_REPORT_CD);
			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 Start
			//		//同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
			//		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD),"1");
			// [ON推-UT210-017] 帳票レイアウトマスタで自動印刷対象の判定追加 BY SJA 2016.07.05 End
			autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
			//印刷内容
			autoPrintParamDto.printBasicData.outputData = json.format(retList);

			AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);

			// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana Start
			if (!result.isSuccess()) {
				// 商品ラベル発行失敗

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_LABEL_PRINT_ERROR);
				return;
			}
		}
	}

	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になったメソッドprintStoreLabelを削除) 2018.04.27 kawana Delete

	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
}
