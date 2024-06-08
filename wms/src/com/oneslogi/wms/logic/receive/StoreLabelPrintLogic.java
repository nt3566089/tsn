package com.oneslogi.wms.logic.receive;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTStock;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoRBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreNoR;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dto.AutoPrintParamDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.StoreLabelDto;
import com.oneslogi.wms.logic.common.RecommendLocationLogic;
import com.oneslogi.wms.logic.common.RecommendLocationLogic.PrintReportCls;
import com.oneslogi.wms.logic.common.RecommendLocationLogic.RecommendLocationCondition;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 入庫ラベル発行データ取得ロジッククラス
 */
public class StoreLabelPrintLogic extends AbstractWmsLogic {

	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana Start

	// ===== 使用テーブル =====

	@Inject
	private TStockInoutBhv tStockInoutBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	@Inject
	private TStockBhv tStockBhv;

	// [EC-CT1-123] 不要な変数削除(入庫実績ボディテーブル) 2015.03.18 kawana Delete

	// [エンハンス PH2.0] 入数取得(MProductShapeBhv削除) 2015.11.23 sja Delete

	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
	@Inject
	private TStoreNoRBhv tStoreNoRBhv;
	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

	// ===== 使用ロジック =====

	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private AutoPrintLogic autoPrintLogic;

	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
	@Inject
	private RecommendLocationLogic recommendLocationLogic;
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End
	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End

	// ===== 変数 =====

	/** 帳票コード */
	private static final String REPORT_CD = "StoreLabel";

	// ===== enum =====

	/** 発行対象区分 */
	private enum TargetPrint {
		/** 未発行 */
		UNPRINT,
		/** 全て */
		ALL
	}

	/**
	 * <h2>入庫ラベル発行の対象在庫リスト取得.</h2>
	 * <pre>
	 * 引数を検索条件にして入庫ラベル発行の対象在庫リストを取得する。
	 * 0件の場合はエラーを設定する。
	 *
	 * </pre>
	 * @param header 入庫実績ヘッダ：センタID・荷主ID・倉庫ID
	 * @param body 入庫実績ボディ：WMS入荷伝票No.・顧客入荷指示No.・入庫日・入庫ラベルNo.(From)・入庫ラベルNo.(To)・登録ユーザ・発行条件
	 * @param supplier 仕入先：取引先CD
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return List<TStock> 在庫リスト
	 */
	public List<TStock> search(TStoreRecordH storeRecordH, TStoreRecordB storeRecordB, MCustomer supplier, ErrorStatus errSts) throws Exception {

		final long centerId = storeRecordH.getCenterId();
		final long clientId = storeRecordH.getClientId();

		TStockInoutCB inoutCb = tStockInoutBhv.newMyConditionBean();
		inoutCb.setupSelect_TStock();

		inoutCb.query().queryTStock().queryMLocation().setCenterId_Equal(centerId);
		inoutCb.query().queryTStock().queryMProduct().setClientId_Equal(clientId);

		inoutCb.query().queryTStock().setWarehouseId_Equal(storeRecordH.getWarehouseId());

		inoutCb.query().queryTStock().queryTStoreNo().queryMCustomer().setCustomerCd_Equal(supplier.getCustomerCd());
		inoutCb.query().queryTStock().queryTStoreNo().setStoreDt_Equal(storeRecordB.getStoreDt());
		inoutCb.query().queryTStock().queryTStoreNo().setAddUser_Equal(storeRecordB.getAddUser());
		// 発行状況
		inoutCb.query().queryTStock().queryTStoreNo().queryTStoreNoRAsOne().setTwlOutFlg_Equal(storeRecordB.getPrintCondition());

		inoutCb.query().queryTStoreRecordB().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(storeRecordB.getClientReceiveNo());
		inoutCb.query().queryTStoreRecordB().queryTStoreRecordH().queryTReceivePlanH().setReceiveSlipNo_PrefixSearch(storeRecordB.getReceiveSlipNo());

		inoutCb.query().queryTStock().setChargeNum_GreaterThan(WCC.ZERO);

		inoutCb.query().queryTStock().queryTStoreNo().setStoreLabelNo_GreaterEqual(storeRecordB.getStoreLabelNoFrom());
		inoutCb.query().queryTStock().queryTStoreNo().setStoreLabelNo_LessEqual(storeRecordB.getStoreLabelNoTo());

		// 検索実行
		List<TStockInout> inoutList = tStockInoutBhv.selectList(inoutCb);
		if (inoutList.isEmpty()) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		List<TStock> stockList = tStockInoutBhv.pulloutTStock(inoutList);
		return stockList;
	}

	/**
	 * <h2>入庫ラベルの発行(全件).</h2>
	 * <pre>
	 * 入庫ラベルNo.を発行する。
	 * 印刷後に入庫ラベルNo.発行フラグを発行済に更新する。
	 * 既に発行済の入庫ラベルも発行される。
	 *
	 * </pre>
	 *
	 * @param printParamDto 画面で印刷設定を行った印刷パラメータ
	 * @param centerId センタID
	 * @param stockIdSet 在庫IDセット
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @throws Exception 帳票発行(PrintLogic.print)の例外
	 */
	public void printAll(PrintParamDto printParamDto, long centerId, final Set<Long> stockIdSet, ErrorStatus errSts) throws Exception {

		print(printParamDto, centerId, stockIdSet, TargetPrint.ALL, errSts);
	}

	/**
	 * <h2>入庫ラベルの発行(未発行のみ).</h2>
	 * <pre>
	 * 入庫ラベルNo.を発行する。
	 * 印刷後に入庫ラベルNo.発行フラグを発行済に更新する。
	 * 既に発行済の場合は何もしない。
	 *
	 * </pre>
	 *
	 * @param printParamDto 画面で印刷設定を行った印刷パラメータ
	 * @param storeRecordH 入庫実績ヘッダ：センタID・入庫実績ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @throws Exception 帳票発行(PrintLogic.print)の例外
	 */
	public void printUnprintOnly(PrintParamDto printParamDto, TStoreRecordH storeRecordH, ErrorStatus errSts) throws Exception {

		final long centerId = storeRecordH.getCenterId();
		final long storeRecordHId = storeRecordH.getStoreRecordHId();

		// 在庫受払から在庫IDを特定
		TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
		cb.query().queryTStoreRecordB().queryTStoreRecordH().setStoreRecordHId_Equal(storeRecordHId);

		List<TStockInout> stockInoutList = tStockInoutBhv.selectList(cb);

		if (stockInoutList.isEmpty()) {
			return;
		}

		Set<Long> stockIdSet = new HashSet<Long>();
		for (TStockInout inout : stockInoutList) {
			stockIdSet.add(inout.getStockId());
		}

		print(printParamDto, centerId, stockIdSet, TargetPrint.UNPRINT, errSts);
	}

	/**
	 * 入庫ラベル発行処理
	 */
	private void print(PrintParamDto printParamDto, long centerId, final Set<Long> stockIdSet, TargetPrint targetPrint, ErrorStatus errSts) throws Exception {

		printParamDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
		// 対象データ取得
		List<TStock> stockList = selectData(centerId, stockIdSet, targetPrint, errSts);
		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End
		if (stockList.isEmpty()) {
			return;
		}

		// 入庫ラベル発行用Dtoに変換
		List<StoreLabelDto> reportDtoList = convertToReportDtoData(stockList);

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);
		printParamDto.printBasicData.outputData = json.format(reportDtoList);
		printLogic.print(printParamDto);

		// 入庫ラベル発行フラグを発行済に更新
		for (TStock stock : stockList) {
			TStoreNoR storeNoR = stock.getTStoreNo().getTStoreNoRAsOne();
			updateTwlOutFlg(storeNoR);
		}
	}

	/**
	 * <h2>入庫ラベルの自動発行(未発行分のみ).</h2>
	 * <pre>
	 * 入庫ラベルNo.を自動発行する。
	 * 印刷後に入庫ラベルNo.発行フラグを発行済に更新する。
	 * 既に発行済の場合は何もしない。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param storeLabelNo 入庫ラベルNo.
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @throws Exception 帳票発行(AutoPrintLogic.print)の例外
	 */
	public void autoPrintUnprintOnly(long centerId, String storeLabelNo, ErrorStatus errSts) throws Exception {

		if (storeLabelNo == null) {
			getErrorManager().throwException(new IllegalArgumentException("storeLabelNo is null."));
			return;
		}

		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD), "1");
		if (pReportLayout == null) {
			return;
		}

		// 対象データ取得
		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
		List<TStock> stockList = selectData(centerId, storeLabelNo, TargetPrint.UNPRINT, errSts);
		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End
		if (stockList.isEmpty()) {
			return;
		}

		// 入庫ラベル発行用Dtoに変換
		List<StoreLabelDto> reportDtoList = convertToReportDtoData(stockList);

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);
		AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(REPORT_CD);
		autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
		autoPrintParamDto.printBasicData.outputData = json.format(reportDtoList);

		AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);

		if (!result.isSuccess()) {
			// 商品ラベル発行失敗

			getErrorManager().add(errSts, WmsMessageConst.STORE_LABEL_PRINT_ERROR);
			return;
		}

		// 入庫ラベル発行フラグを発行済に更新
		for (TStock stock : stockList) {
			TStoreNoR storeNoR = stock.getTStoreNo().getTStoreNoRAsOne();
			updateTwlOutFlg(storeNoR);
		}
	}

	// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
	/**
	 * 対象データ検索
	 */
	private List<TStock> selectData(long centerId, String storeLabelNo, TargetPrint targetPrint, ErrorStatus errSts) {
	// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End

		// 検索条件
		TStockCB cb = tStockBhv.newMyConditionBean();

		cb.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
		cb.query().queryMLocation().setCenterId_Equal(centerId);
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		if (targetPrint == TargetPrint.UNPRINT) {
			// 未印刷のみ対象
			cb.query().queryTStoreNo().queryTStoreNoRAsOne().setTwlOutFlg_NotEqual_$1();
		}

		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
		List<TStock> list = selectDataMain(centerId, cb, errSts);
		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End

		return list;
	}

	// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
	/**
	 * 対象データ検索
	 */
	private List<TStock> selectData(long centerId, final Set<Long> stockIdSet, TargetPrint targetPrint, ErrorStatus errSts) {
	// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End

		if (stockIdSet.isEmpty()) {
			return new ArrayList<TStock>();
		}

		// 検索条件
		TStockCB cb = tStockBhv.newMyConditionBean();

		cb.query().setStockId_InScope(stockIdSet);

		if (targetPrint == TargetPrint.UNPRINT) {
			// 未印刷のみ対象
			cb.query().queryTStoreNo().queryTStoreNoRAsOne().setTwlOutFlg_NotEqual_$1();
		}

		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
		List<TStock> list = selectDataMain(centerId, cb, errSts);
		// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End

		return list;
	}

	// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu Start
	/**
	 * <h2>入庫ラベルデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに入庫ラベル発行データを取得する。
	 * 検索対象が見つかった場合、検索結果に入数と【推奨ロケの設定処理】で取得した推奨ロケーションを設定する。
	 * 出力可能件数を超える場合、エラーが発生する。
	 * 検索対象が見つからない場合はNULLを返す。(エラー設定は行わない)
	 *
	 * 【推奨ロケの設定処理】
	 * ・{@link RecommendLocationLogic#getRecommendLocation(RecommendLocationCondition, PrintReportCls) 推奨ロケの設定メソッド}を呼び出す。
	 *
	 * </pre>
	 * @return List<TStock> 入庫ラベル発行データ取得のリスト
	 */
	private List<TStock> selectDataMain(final long centerId, TStockCB tStockCB, ErrorStatus errSts) {
	// [Ver3.0][#4775] 引数errSts追加 2018.06.28 shimizu End

		// ===== テーブル結合 =====

		selectDataSetupTable(tStockCB);

		// ===== ソート条件 =====

		selectDataSetOrderBy(tStockCB);

		// ===== 入庫ラベル発行データ取得 =====

		List<TStock> tStockList = selectListToReport(tStockBhv, tStockCB, getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT_STORE_LABEL));
		if (tStockList.size() == 0) {
			// [Ver3.0][#4775] 検品後入庫ラベル出力時のエラーメッセージ設定 2018.06.28 shimizu Start
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return new ArrayList<>();
			// [Ver3.0][#4775] 検品後入庫ラベル出力時のエラーメッセージ設定 2018.06.28 shimizu End
		}

		// ===== 必要データをload ======

		// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
		tStockBhv.load(tStockList, new ReferrerLoaderHandler<LoaderOfTStock>() {
			@Override
			public void handle(LoaderOfTStock pickLocaLoader) {
				pickLocaLoader.pulloutMProduct().loadMLocationList(new ConditionBeanSetupper<MLocationCB>() {
					@Override
					public void setup(MLocationCB pickLocaSubCB) {
						pickLocaSubCB.query().queryMCenter().setCenterId_Equal(centerId);
						pickLocaSubCB.query().setDelFlg_Equal_$0();
						pickLocaSubCB.query().addOrderBy_AllocOrder_Asc();
						pickLocaSubCB.query().addOrderBy_LocationCd_Asc();
					}
				});
			}
		});
		// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End

		// [Ver3.0] unit of measure対応 2017.11.21 REN Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tStockBhv.load(tStockList, new ReferrerLoaderHandler<LoaderOfTStock>() {
			@Override
			public void handle(LoaderOfTStock loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		// ===== 帳票用データの設定 =====

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		// [Ver3.0] unit of measure対応 2017.11.21 REN End
		for (TStock tstock : tStockList) {

			// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
			// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
			// 推奨ロケの設定
			RecommendLocationLogic.RecommendLocationCondition recommendLocationCondition = RecommendLocationLogic.RecommendLocationCondition.builder()
					.centerId(tstock.chaseMLocation().getCenterId())
					.productId(tstock.getProductId())
					.stockTypeId(tstock.getStockTypeId())
					.depositId(tstock.getDepositId())
					.warehouseId(tstock.getWarehouseId())
					.stockId(tstock.getStockId()).build();

			// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Mod Start
			tstock.setRecommendLocation(recommendLocationLogic.getRecommendLocation(recommendLocationCondition, RecommendLocationLogic.PrintReportCls.STORE_LABEL));
			// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Mod End
			// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End
			// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tstock.getMProduct());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			// [Ver3.0] unit of measure対応 2017.11.21 REN Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 入数内訳
			tstock.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tstock.getMProduct()));
			// 予定内訳
			tstock.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tstock.getChargeNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, tstock.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			// 最小荷姿単位
			tstock.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tstock.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.21 REN End
		}

		return tStockList;
	}

	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する(不要になったメソッドの削除) 2016.06.17 kawana

	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

	/**
	 * テーブル結合
	 */
	private void selectDataSetupTable(TStockCB cb) {
		//商品マスタ
		cb.setupSelect_MProduct();
		// [Ver3.0] unit of measure対応 2017.11.21 REN Del
		//預託マスタ
		cb.setupSelect_MCustomer();
		//仕入先マスタ
		cb.setupSelect_TStoreNo().withMCustomer();
		//入庫No.帳票
		cb.setupSelect_TStoreNo().withTStoreNoRAsOne();
		//ロット
		cb.setupSelect_TLot();
		//入庫No.
		cb.setupSelect_TStoreNo();
		//在庫区分マスタ
		cb.setupSelect_MStockType().withVDict(getCultureId());
		//倉庫マスタ、センタマスタ
		cb.setupSelect_MWarehouse().withMCenter();
		//ゾーンマスタ
		cb.setupSelect_MLocation().withMZone();
		//荷主マスタ
		cb.setupSelect_MClient();
		//ロケーションマスタ
		cb.setupSelect_MLocation().withMCenter();
	}

	/**
	 * ソート条件の指定
	 */
	private void selectDataSetOrderBy(TStockCB cb) {

		cb.query().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryMLocation().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().queryTStoreNo().queryMCustomer().addOrderBy_CustomerCd_Asc();
		cb.query().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
	}

	/**
	 * 在庫リストを入庫ラベル帳票用DTOに変換
	 */
	private List<StoreLabelDto> convertToReportDtoData(List<TStock> stockList) {

		List<StoreLabelDto> retList = new ArrayList<StoreLabelDto>();

		for (TStock stock : stockList) {

			//エンティティ編集
			// [#3652][Ver3.0] 入荷実績入力(予定あり) - 実績登録後入庫ラベル自動発行異常 在庫入数NULL対応によるケース/ピース数計算処理削除 2018.02.07 honma Delete

			StoreLabelDto storeLabelDto = new StoreLabelDto();

			storeLabelDto.cultureId = getCultureId();

			storeLabelDto.printCondition = "1";

			//荷主CD
			storeLabelDto.clientCd = stock.chaseMClient().getClientCd();

			//荷主略称
			storeLabelDto.clientNm = stock.chaseMClient().getClientAbbr();

			//センタCD
			storeLabelDto.centerCd = stock.chaseMWarehouse().chaseMCenter().getCenterCd();

			//センタ略称
			storeLabelDto.centerNm = stock.chaseMWarehouse().chaseMCenter().getCenterAbbr();

			//商品CD
			if (!CU.isNullOrEmpty(stock.chaseMProduct().getProductCd())) {
				storeLabelDto.productCd = stock.chaseMProduct().getProductCd();
			} else {
				storeLabelDto.productCd = "";
			}

			//商品名称
			storeLabelDto.productNm = stock.chaseMProduct().getProductAbbr();

			//JANCD
			if (!CU.isNullOrEmpty(stock.chaseMProduct().getJanCd())) {
				storeLabelDto.janCd = stock.chaseMProduct().getJanCd();
			} else {
				storeLabelDto.janCd = "";
			}

			//預託
			storeLabelDto.depositNm = stock.chaseMCustomer().getCustomerAbbr();

			//期限日
			storeLabelDto.limitDt = stock.chaseTLot().getLimitDt();

			//倉庫CD
			storeLabelDto.warehouseCd = stock.chaseMWarehouse().getWarehouseCd();

			//倉庫略称
			storeLabelDto.warehouseNm = stock.chaseMWarehouse().getWarehouseAbbr();

			//在庫区分
			storeLabelDto.stockType = stock.chaseMStockType().chaseVDict().getDictNm();

			//ロット
			storeLabelDto.lot = stock.chaseTLot().getLot();

			//ゾーンCD
			storeLabelDto.zoneCd = stock.chaseMLocation().chaseMZone().getZoneCd();

			//ゾーン名称
			storeLabelDto.zoneNm = stock.chaseMLocation().chaseMZone().getZoneNm();

			//入庫ロケCD
			storeLabelDto.inTLocationCd = stock.chaseMLocation().getLocationCd();

			//入庫ロケ名称
			storeLabelDto.inTLocationNm = stock.chaseMLocation().getLocationNm();

			//入庫数
			storeLabelDto.storeNum = stock.getChargeNum();

			// [#3669][Ver3.0] 入荷実績入力(予定あり) - 入庫ラベル自動発行項目表示不正(UoM未対応) 2018.02.07 honma Mod Start
			// 入数
			storeLabelDto.setStringUnitNum(stock.getStringUnitNum());

			// 内訳
			storeLabelDto.setBreakdown(stock.getBreakdown());

			//最小梱包単位
			storeLabelDto.setMinimumPackingUnit(stock.getMinimumPackingUnit());
			// [#3669][Ver3.0] 入荷実績入力(予定あり) - 入庫ラベル自動発行項目表示不正(UoM未対応) 2018.02.07 honma Mod End

			//入庫ラベルNo.
			if (!CU.isNullOrEmpty(stock.chaseTStoreNo().getStoreLabelNo())) {
				storeLabelDto.storeLabelNo = stock.chaseTStoreNo().getStoreLabelNo();
			} else {
				storeLabelDto.storeLabelNo = "";
			}

			//入庫日
			if (!CU.isNullOrEmpty(stock.chaseTStoreNo().getStoreDt())) {
				storeLabelDto.storeDt = stock.chaseTStoreNo().getStoreDt();
			} else {
				storeLabelDto.storeDt = "";
			}

			// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Mod Start
			//推奨ロケ
			if (stock.getRecommendLocation() != null) {
				storeLabelDto.tLoactionCd = stock.getRecommendLocation().getLocationCd();
				storeLabelDto.tLocationNm = stock.getRecommendLocation().getLocationNm();
			} else {
				storeLabelDto.tLoactionCd = "";
				storeLabelDto.tLocationNm = "";
			}
			// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Mod End

			// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
			if (stock.chaseMProduct().getMLocationList().size() > 0) {
				// ピックロケCD
				storeLabelDto.setPickTLocationCd(stock.chaseMProduct().getMLocationList().get(0).getLocationCd());

				// ピックロケ名称
				storeLabelDto.setPickTLocationNm(stock.chaseMProduct().getMLocationList().get(0).getLocationNm());
			}
			// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End

			storeLabelDto.userCd = stock.chaseTStoreNo().getAddUser();

			retList.add(storeLabelDto);
		}

		return retList;
	}

	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する(不要になったメソッドの削除) 2016.06.17 kawana

	private void updateTwlOutFlg(TStoreNoR tStoreNoR) {

		Timestamp time = new Timestamp(System.currentTimeMillis());

		tStoreNoR.setTwlOutFlg_$1();
		tStoreNoR.setTwlOutUserId(this.getUserId());
		tStoreNoR.setTwlOutDt(time);

		// ===== 入庫No.帳票更新実行 =====
		tStoreNoRBhv.update(tStoreNoR);
	}

	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana End
}