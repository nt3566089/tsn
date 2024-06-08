package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.BaseException;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.job.logic.JobQueEntry;
import com.oneslogi.job.logic.JobQueEntryInitializerLogic;
import com.oneslogi.job.logic.jobqueentry.JobQueEntryResult;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.shipping.PackingCalculateLogic;
import com.oneslogi.wms.core.logic.shipping.StockAllocateLogic;
import com.oneslogi.wms.core.logic.shipping.StockAllocateLogic.AllocateState;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;

/**
 * 出庫指示ロジッククラス
 */
public class WorkOrderLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
	// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private StockAllocateLogic stockAllocateLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private PackingCalculateLogic packingCalculateLogic;
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana Start
	@Inject
	private JobQueEntryInitializerLogic jobQueEntryInitializerLogic;
	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana End
	@Inject
	private LastShipdLotLogic lastShipdLotLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(BucketCalculateLogic削除) 2018.08.22 kawana Delete
	// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
	@Inject
	private MessageLogic messageLogic;
	// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End
	// [#5123][#5121][#5119][#5143][#5107][v3.1] 緊急フラグの自動設定 / 欠品時の引当取消 / 単行ピッキング / 単行出荷検品 / 最適ピッキング提案 機能追加 2018.09.10 kawana Start
	@Inject
	private ShippingInstEmgFlgLogic shippingInstEmgFlgLogic;
	@Inject
	private StockAllocateStockOutLogic stockAllocateStockOutLogic;
	@Inject
	private SingleRowPickingFlgLogic singleRowPickingFlgLogic;
	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;
	@Inject
	private PickingMethodRecommendationCallLogic pickingMethodRecommendationCallLogic;
	// [#5123][#5121][#5119][#5143][#5107][v3.1] 緊急フラグの自動設定 / 欠品時の引当取消 / 単行ピッキング / 単行出荷検品 / 最適ピッキング提案 機能追加 2018.09.10 kawana End


	// ===== enum定義 =====

	/** ログ書込 */
	private enum OutputLog {
		/** ログ書込有 */
		TRUE,
		/** ログ書込無 */
		FALSE,
	}

	// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana Start

	/** 緊急フラグ自動設定 */
	private enum SetAutoEmgFlg {
		TRUE,
		FALSE,
	}

	// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana End

	// ===== 内部変数 =====

	/** ログの書込み有無 */
	private OutputLog outputLog = OutputLog.FALSE;

	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana End

	/**
	 * <h2>出庫指示処理を実行する。</h2>
	 * <pre>
	 * 以下順序で処理を行う
	 *
	 * 1. 出庫指示バッチNo、処理Noの採番
	 * 2. 出庫指示・引当指示データの登録
	 * 3. 【在庫引当】
	 * 4. 【梱包計算】
	 * 5. 【バケット割付計算】
	 *
	 * 欠品、緊急補充が発生した場合、警告メッセージを登録する。
	 *
	 * 【在庫引当】
	 * ・{@link StockAllocateLogic#allocate(TShippingInstH ,String, String, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫引当メソッド}を呼び出す。
	 *
	 * 【梱包計算】
	 * ・{@link PackingCalculateLogic#calculate(TShippingInstH ,com.oneslogi.base.exception.ErrorManager.ErrorStatus) 梱包計算メソッド}を呼び出す。
	 *
	 * 【バケット割付計算】
	 * ・{@link BucketCalculateLogic#TPackingHUpd(TShippingInstH ,com.oneslogi.base.exception.ErrorManager.ErrorStatus) バケット割付メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ：センタID・荷主ID・コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipInstructe(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		// ===== パラメータチェック =====
		if (shippingInstHead.getControlNo() == null
				|| shippingInstHead.getCenterId() == null
				|| shippingInstHead.getClientId() == null) {

			// 致命的例外をスローする パラメータ不正
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		long centerId = shippingInstHead.getCenterId();

		// 出庫指示バッチNo 採番
		String pickingBatchNo = numberingLogic.getNumbering(centerId, WmsNumberingConst.PICKING_BATCH_NO);

		// 処理No. 採番
		String processNo = numberingLogic.getNumbering(centerId, WmsNumberingConst.PROCESS_NO);

		// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana Start
		shipInstructe(shippingInstHead, pickingBatchNo, processNo, errSts);
		// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana End

	}

	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana Start

	/**
	 * <h2>出庫指示処理を行う。</h2>
	 * <pre>
	 * 以下のロジックを順番に呼出し、出庫指示を行う。
	 *
	 * 1. {@link WorkOrderLogic#shipInstructeAdd(TShippingInstH, String, String, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫指示ロジック.引当指示データ作成・登録}
	 * 2. {@link StockAllocateLogic#allocate(TShippingInstH ,String, String, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫引当ロジック.在庫引当}
	 * 3. {@link PackingCalculateLogic#calculate(TShippingInstH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 梱包計算ロジック.梱包計算}
	 * 4. {@link BucketCalculateLogic#TPackingHUpd(TShippingInstH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) バケット割付ロジック.バケット割付}
	 *
	 * 在庫が不足している場合、警告メッセージをメッセージ管理クラスに追加する。
	 *
	 * 【パラメータの使用項目】
	 *  (出荷指示ヘッダ)
	 *  ・センタID
	 *  ・荷主ID
	 *  ・コントロールNo.
	 *
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ
	 * @param errSts エラー時のエラー情報への設定値
	 */
	public void shipInstructe(TShippingInstH shippingInstHead, String pickingBatchNo, String processNo, ErrorStatus errSts) {

		// ===== パラメータチェック =====

		final Long centerId = shippingInstHead.getCenterId();
		final Long clientId = shippingInstHead.getClientId();

		if (shippingInstHead.getControlNo() == null
				|| centerId == null
				|| clientId == null) {

			// 致命的例外をスローする パラメータ不正
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出庫指示、引当指示登録 =====

		// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana Start
		shipInstructeAdd(shippingInstHead, pickingBatchNo, processNo, SetAutoEmgFlg.TRUE, errSts);
		// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana End
		if (getErrorManager().size() > 0) {
			addErrorLog();
			return;
		}

		// ===== 在庫引当 =====

		// [ON推-品向-1173] 標準検索引当と商品単位検索引当を一本化 2016.07.19 kawana Start
		AllocateState allocState = stockAllocateLogic.allocate(shippingInstHead, pickingBatchNo, processNo, errSts);
		if (getErrorManager().size() > 0) {
			addErrorLog();
			return;
		}
		// [ON推-品向-1173] 標準検索引当と商品単位検索引当を一本化 2016.07.19 kawana End

		// [#5121][v3.1] 欠品時の引当取消処理を追加 2018.07.27 kawana Start

		// ===== 欠品分の引当取消 =====

		stockAllocateStockOutLogic.allocateCancel(shippingInstHead, errSts);
		if (getErrorManager().size() > 0) {
			addErrorLog();
			return;
		}

		// ===== 欠品分の出荷指示分離 =====

		stockAllocateStockOutLogic.splitShippingInstData(shippingInstHead, errSts);
		if (getErrorManager().size() > 0) {
			addErrorLog();
			return;
		}

		// [#5121][v3.1] 欠品時の引当取消処理を追加 2018.07.27 kawana End


		// ===== 梱包計算.計算 =====

		packingCalculateLogic.calculate(shippingInstHead, errSts);
		if (getErrorManager().size() > 0) {
			addErrorLog();
			return;
		}

		// [C-CWMS-0053] マルチピッキング機能を追加 2016.01.20 kawana Start

		// [#5131][v3.1] ピッキングリストの採番を発行時に変更(bucketCalculateLogic.TPackingHUpd呼出削除) 2018.08.22 kawana Delete

		// [#5119][#5107][v3.1] 単行ピッキングフラグ設定 / 最適ピッキング提案呼出 2018.11.08 kawana Start

		// ===== 単行ピックフラグ設定 =====

		singleRowPickingFlgLogic.updateSglRowPicFlg(shippingInstHead, errSts);
		if (getErrorManager().size() > 0) {
			addErrorLog();
			return;
		}

		// ===== 最適ピッキング提案呼出 =====

		// ログ書込
		if (outputLog == OutputLog.TRUE) {
			pickingMethodRecommendationCallLogic.startLogSection();
		} else {
			pickingMethodRecommendationCallLogic.startLog();
		}
		//  最適ピッキング提案呼出
		pickingMethodRecommendationCallLogic.call(centerId, clientId, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
		// ログ終了
		pickingMethodRecommendationCallLogic.endSuccessLog();

		// [#5119][#5107][v3.1] 単行ピッキングフラグ設定 / 最適ピッキング提案呼出 2018.11.08 kawana End

		// [ON推-品向-1086] 緊急補充、欠品メッセージの管理を呼出し元で行うように変更 2016.04.08 kawana Start

		// ===== 警告メッセージの設定 =====
		if (allocState.isStockOut && allocState.didReplenish) {
			// 欠品 + 補充

			// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
			String centerCd = mCenterBhv.selectByPKValueWithDeletedCheck(centerId).getCenterCd();
			String clientCd = mClientBhv.selectByPKValueWithDeletedCheck(clientId).getClientCd();

			String stockMoveListLinkStr = messageLogic.getMessageNm(WmsMessageConst.STOCK_MOVE_LIST_EMERGENCY_REPLENISH_LINK, centerCd, clientCd);

			this.getWarnManager().add(
					warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()),
					WmsMessageConst.SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_AND_REPLENISH_INFORMATION,
					stockMoveListLinkStr);
			// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End
		} else if (allocState.isStockOut) {
			// 欠品

			// [SK2-001] エラーコード間違いを修正 2014.12.08 kawana Start
			this.getWarnManager().add(this.warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()), WmsMessageConst.SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_INFORMATION);
			// [SK2-001] エラーコード間違いを修正 2014.12.08 kawana End
		} else if (allocState.didReplenish) {
			// 補充

			// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
			String centerCd = mCenterBhv.selectByPKValueWithDeletedCheck(centerId).getCenterCd();
			String clientCd = mClientBhv.selectByPKValueWithDeletedCheck(clientId).getClientCd();

			String stockMoveListLinkStr = messageLogic.getMessageNm(WmsMessageConst.STOCK_MOVE_LIST_EMERGENCY_REPLENISH_LINK, centerCd, clientCd);

			this.getWarnManager().add(
					warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()),
					WmsMessageConst.SHIP_INSTRUCTE_COMPLETE_REPLENISH_INFORMATION,
					stockMoveListLinkStr);
			// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End
		}
		// [ON推-品向-1086] 緊急補充、欠品メッセージの管理を呼出し元で行うように変更 2016.04.08 kawana End
		addWarnLog();
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana End

	/**
	 * <h2>出庫指示を登録する。</h2>
	 * <pre>
	 * 引数をキーに出荷指示データを検索し、
	 * 検索対象が見つからない場合、データ未存在エラーをエラーステータスに設定する。
	 * マスタ存在チェック後、出荷指示ヘッダと出荷指示ボディを元に、引当指示ヘッダと引当指示ボディを作成し登録する。
	 * 最後に、出荷指示ヘッダの引当指示ヘッダID・出庫指示バッチNo.・作業日・出荷ステータス、出荷指示ボディの引当指示ボディIDを更新する。
	 *
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ：センタID・荷主ID・コントロールNo.
	 * @param pickingBatchNo 出庫指示バッチNo
	 * @param processNo 処理No.
	 * @param setAutoEmgFlg 自動緊急フラグ設定有無
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void shipInstructeAdd(TShippingInstH shippingInstHead, String pickingBatchNo, String processNo, SetAutoEmgFlg setAutoEmgFlg, ErrorStatus errSts) {

		// レスポンス対策 - 処理全体を見直し修正 2016.02.24 kawana Start

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();
		final long controlNo = shippingInstHead.getControlNo();

		// ===== 出荷指示ボディ→出荷指示ヘッダ検索（コントロールNo.） =====
		// 出荷指示データ取得
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_MProduct();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MStockType();
		// [#5705][v3.1] 指定倉庫、指定ロケーションの削除チェックを追加 2018.12.06 kawana Start
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation();
		// [#5705][v3.1] 指定倉庫、指定ロケーションの削除チェックを追加 2018.12.06 kawana End
		cb.setupSelect_TShippingInstH().withMCustomerByDelivCustomerId();
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrier();

		// 検索条件(コントロールNo.)
		cb.checkInvalidQuery();
		cb.query().queryTShippingInstH().setCenterId_Equal(centerId);
		cb.query().queryTShippingInstH().setClientId_Equal(clientId);
		cb.query().queryTShippingInstH().setControlNo_Equal(controlNo);

		// ソート順の設定
		cb.query().queryTShippingInstH().addOrderBy_ProcessTypeId_Asc();
		cb.query().queryTShippingInstH().addOrderBy_ShippingDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DeliveryCourseId_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DelivPlanDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DelivDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DelivTz_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DelivCustomerId_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DelivCustomerCd_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DelivZipCd_Asc();
		cb.query().queryTShippingInstH().addOrderBy_SupplyCustomerId_Asc();
		cb.query().queryTShippingInstH().addOrderBy_SupplyCustomerCd_Asc();
		cb.query().addOrderBy_ProductId_Asc();
		cb.query().addOrderBy_StockTypeId_Asc();
		cb.query().addOrderBy_DepositId_Asc();
		cb.query().addOrderBy_LocationCd_Asc();
		cb.query().addOrderBy_Lot_Asc();
		cb.query().addOrderBy_LimitDt_Asc();
		// [#6656][v3.1] Pluto対応 引当指示ヘッダの作成順を統一するためにソートキー追加 2019.08.26 kawana Start
		cb.addOrderBy_PK_Asc();
		// [#6656][v3.1] Pluto対応 引当指示ヘッダの作成順を統一するためにソートキー追加 2019.08.26 kawana End

		// ===== 検索実行 =====
		List<TShippingInstB> shippingInstBList = tShippingInstBBhv.selectList(cb);

		// ===== データ存在チェック =====
		// 件数チェック
		if (shippingInstBList.size() == 0) {
			// 20141007 許 修正 Start
			// 出荷指示データの件数が0件の場合、エラー
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// 20141007 許 修正 End
			return;
		}

		// ===== システム管理日付取得 =====
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);
		// レスポンス対策 2016.01.22 kawana Start
		mClientCenter = clientCenterLogic.getUkEntityCacheable(mClientCenter);
		// レスポンス対策 2016.01.22 kawana End
		String workDt = mClientCenter.getSystemDt();

		// [ON推-品向-979] 出庫指示の速度改善を採番キャッシュ機能で行うため速度改善前に戻す 2015.10.14(不要な処理を削除) kawana

		// ===== 出荷指示データ件数分繰返 =====

		Map<AllocHeaderKey, TAllocInstH> allocInstHMap = new LinkedHashMap<AllocHeaderKey, TAllocInstH>(); // 挿入順番を維持
		Map<AllocBodyKey, TAllocInstB> allocInstBMap = new HashMap<AllocBodyKey, TAllocInstB>();

		Set<Long> shippingInstHIdSet = new HashSet<Long>();

		for (TShippingInstB shippingInstB : shippingInstBList) {

			// ===== マスタエラーチェック =====
			masterErrCheck(shippingInstB, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			// ===== 引当指示ヘッダの処理 =====

			// 引当指示ヘッダキー作成

			TShippingInstH shippingInstH = shippingInstB.getTShippingInstH();

			long processTypeId = shippingInstH.getProcessTypeId();
			String shippingDt = shippingInstH.getShippingDt();
			String delivPlanDt = shippingInstH.getDelivPlanDt();
			String delivDt = shippingInstH.getDelivDt();
			String delivTz = shippingInstH.getDelivTz();
			Long supplyCustomerId = shippingInstH.getSupplyCustomerId();
			String supplyCustomerCd = shippingInstH.getSupplyCustomerCd();
			String supplyCustomerNm = shippingInstH.getSupplyCustomerNm();
			Long delivCustomerId = shippingInstH.getDelivCustomerId();
			String delivCustomerCd = shippingInstH.getDelivCustomerCd();
			String delivZipCd = shippingInstH.getDelivZipCd();
			String delivAddress1 = shippingInstH.getDelivAddress1();
			String delivAddress2 = shippingInstH.getDelivAddress2();
			String delivAddress3 = shippingInstH.getDelivAddress3();
			String delivAddressSupply = shippingInstH.getDelivAddressSupply();
			String delivCustomerNm = shippingInstH.getDelivCustomerNm();
			String delivTelNo = shippingInstH.getDelivTelNo();
			Long delivCourseId = shippingInstH.getDeliveryCourseId();

			// 引当指示ヘッダキーを作成
			AllocHeaderKey allocHeaderKey = AllocHeaderKey.builder().processTypeId(processTypeId).shippingDt(shippingDt).delivPlanDt(delivPlanDt).delivDt(delivDt).delivTz(delivTz)
					.supplyCustomerId(supplyCustomerId).supplyCustomerCd(supplyCustomerCd).supplyCustomerNm(supplyCustomerNm).delivCustomerId(delivCustomerId).delivCustomerCd(delivCustomerCd)
					.delivZipCd(delivZipCd).delivAddress1(delivAddress1).delivAddress2(delivAddress2).delivAddress3(delivAddress3).delivAddressSupply(delivAddressSupply)
					.delivCustomerNm(delivCustomerNm).delivTelNo(delivTelNo).delivCourseId(delivCourseId).build();

			TAllocInstH allocInstH;

			// キーと同じ引当指示ヘッダを作成済か
			if (allocInstHMap.containsKey(allocHeaderKey)) {
				// 作成済

				allocInstH = allocInstHMap.get(allocHeaderKey);
			} else {
				// 未作成

				// 引当指示ヘッダを作成
				allocInstH = new TAllocInstH();
				allocInstH.setClientId(shippingInstH.getClientId());
				allocInstH.setCenterId(shippingInstH.getCenterId());
				allocInstH.setProcessTypeId(shippingInstH.getProcessTypeId());
				allocInstH.setShippingDt(shippingInstH.getShippingDt());
				allocInstH.setWorkDt(workDt);
				allocInstH.setDelivPlanDt(shippingInstH.getDelivPlanDt());
				allocInstH.setDelivDt(shippingInstH.getDelivDt());
				allocInstH.setDelivTz(shippingInstH.getDelivTz());
				allocInstH.setSupplyCustomerId(shippingInstH.getSupplyCustomerId());
				allocInstH.setSupplyCustomerCd(shippingInstH.getSupplyCustomerCd());
				allocInstH.setSupplyCustomerNm(shippingInstH.getSupplyCustomerNm());
				allocInstH.setDelivCustomerId(shippingInstH.getDelivCustomerId());
				allocInstH.setDelivCustomerCd(shippingInstH.getDelivCustomerCd());
				allocInstH.setDelivZipCd(shippingInstH.getDelivZipCd());
				allocInstH.setDelivAddress1(shippingInstH.getDelivAddress1());
				allocInstH.setDelivAddress2(shippingInstH.getDelivAddress2());
				allocInstH.setDelivAddress3(shippingInstH.getDelivAddress3());
				allocInstH.setDelivAddressSupply(shippingInstH.getDelivAddressSupply());
				allocInstH.setDelivCustomerNm(shippingInstH.getDelivCustomerNm());
				allocInstH.setDelivTelNo(shippingInstH.getDelivTelNo());
				allocInstH.setDeliveryCourseId(shippingInstH.getDeliveryCourseId());

				allocInstHMap.put(allocHeaderKey, allocInstH);
			}

			// 引当指示ヘッダに出庫指示ヘッダを設定
			if (!shippingInstHIdSet.contains(shippingInstH.getShippingInstHId())) {
				// 未設定の出荷指示ヘッダIDの場合

				allocInstH.getTShippingInstHList().add(shippingInstH);
				shippingInstHIdSet.add(shippingInstH.getShippingInstHId());
			}

			// ===== 引当指示ボディの処理 =====

			// 引当指示ボディキー作成

			// 引当在庫キー
			Long productId = shippingInstB.getProductId();
			Long stockTypeId = shippingInstB.getStockTypeId();
			Long depositId = shippingInstB.getDepositId();
			String warehouseCd = shippingInstB.getWarehouseCd();
			String locationCd = shippingInstB.getLocationCd();
			String lot = shippingInstB.getLot();
			String limitDt = shippingInstB.getLimitDt();

			AllocBodyKey allocBodyKey = AllocBodyKey.builder().headerKey(allocHeaderKey).productId(productId).stockTypeId(stockTypeId).depositId(depositId).warehouseCd(warehouseCd)
					.locationCd(locationCd)
					.lot(lot).limitDt(limitDt).build();

			TAllocInstB allocInstB;

			// キーと同じ引当指示ボディを作成済か
			if (allocInstBMap.containsKey(allocBodyKey)) {
				// 作成済

				allocInstB = allocInstBMap.get(allocBodyKey);
				// 指示数に加算
				allocInstB.setInstNum(WCC.add(allocInstB.getInstNum(), shippingInstB.getInstNum()));
			} else {
				// 未作成

				// 引当指示ボディ
				allocInstB = new TAllocInstB();
				allocInstB.setWarehouseId(shippingInstB.getWarehouseId());
				allocInstB.setProductId(shippingInstB.getProductId());
				allocInstB.setStockTypeId(shippingInstB.getStockTypeId());
				allocInstB.setLocationId(shippingInstB.getLocationId());
				allocInstB.setLocationCd(shippingInstB.getLocationCd());
				allocInstB.setDepositId(shippingInstB.getDepositId());
				allocInstB.setLot(shippingInstB.getLot());
				allocInstB.setLotId(shippingInstB.getLotId());
				allocInstB.setLimitDt(shippingInstB.getLimitDt());
				allocInstB.setStoreNoId(shippingInstB.getStoreNoId());
				allocInstB.setStoreLabelNo(shippingInstB.getStoreLabelNo());
				allocInstB.setShapeId(shippingInstB.getShapeId());
				allocInstB.setShapeCd(shippingInstB.getShapeCd());
				allocInstB.setUnitNum(shippingInstB.getUnitNum());
				allocInstB.setInstNum(shippingInstB.getInstNum());
				allocInstB.setProcessNo(processNo);
				allocInstB.setAllocNum(WCC.ZERO);

				allocInstBMap.put(allocBodyKey, allocInstB);

				allocInstH.getTAllocInstBList().add(allocInstB);
			}

			allocInstB.getTShippingInstBList().add(shippingInstB);
		}

		// ===== データベースへ登録 =====
		for (TAllocInstH allocInstH : allocInstHMap.values()) {

			// 引当指示ヘッダの登録実行
			tAllocInstHBhv.insert(allocInstH);

			long allocInstHId = allocInstH.getAllocInstHId();

			// 出荷指示ヘッダの更新実行
			for (TShippingInstH shippingInstH : allocInstH.getTShippingInstHList()) {

				shippingInstH.setAllocInstHId(allocInstHId);
				shippingInstH.setPickingBatchNo(pickingBatchNo);
				shippingInstH.setWorkDt(workDt);
				shippingInstH.setShippingStatus_$25();

				// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana Start

				if (setAutoEmgFlg == SetAutoEmgFlg.TRUE) {

					// 緊急フラグ設定
					shippingInstEmgFlgLogic.setEmergencyFlg(shippingInstH, shippingInstH.getMDeliveryCourse(), mClientCenter.getMParamAsOne(), errSts);
					if (0 < getErrorManager().size()) {
						return;
					}
				}

				// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana End

				tShippingInstHBhv.update(shippingInstH);
			}

			// 引当指示ボディの登録実行
			for (TAllocInstB allocInstB : allocInstH.getTAllocInstBList()) {

				allocInstB.setAllocInstHId(allocInstHId);
				tAllocInstBBhv.insert(allocInstB);

				long allocInstBId = allocInstB.getAllocInstBId();

				// 出荷指示ボディの更新実行
				for (TShippingInstB shippingInstB : allocInstB.getTShippingInstBList()) {
					shippingInstB.setAllocInstBId(allocInstBId);

					tShippingInstBBhv.update(shippingInstB);
				}
			}
		}

		// レスポンス対策 - 処理全体を見直し修正 2016.02.24 kawana End
	}

	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana Start

	/**
	 * <h2>出庫指示ジョブのキュー登録。</h2>
	 * <pre>
	 * 出庫指示バッチをジョブコントローラに登録する。
	 * ジョブ登録前に出荷ステータスを出庫指示中に変更する。
	 * </pre>
	 * @param center センター
	 * @param client 荷主
	 * @param controlNo コントロールNo
	 * @param dataCount 対象の件数 (出荷指示ヘッダ件数)
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return ジョブキュー登録受付No
	 */
	public String shipInstructeJobEntry(MCenter center, MClient client, long controlNo, int dataCount, ErrorStatus errSts) {

		// ===== 出荷ステータス変更(出庫指示中) =====

		shipStatusUpdateLogic.workOrderBatchStart(controlNo, dataCount, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		String entryNo = null;

		// ===== 出庫指示バッチ登録 =====
		{
			String jobCd = getPropertyValue(WmsPropertyConst.SHIPPING_INST_BATCH_JOB_CD);
			JobQueEntry jobQueEntry = jobQueEntryInitializerLogic.initialize(jobCd);
			// パラメータ設定
			long centerId = center.getCenterId();
			String centerCd = center.getCenterCd();
			long clientId = client.getClientId();
			String clientCd = client.getClientCd();
			jobQueEntry.addJobParam("centerId", String.valueOf(centerId));
			jobQueEntry.addJobParam("clientId", String.valueOf(clientId));
			jobQueEntry.addJobParam("centerCd", centerCd);
			jobQueEntry.addJobParam("clientCd", clientCd);
			jobQueEntry.addJobParam("controlNo", String.valueOf(controlNo));
			jobQueEntry.addJobParam("dataCount", String.valueOf(dataCount));

			// ジョブキュー登録
			JobQueEntryResult jobQueEntryResult = jobQueEntry.entry(errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			entryNo = jobQueEntryResult.getJobQueReceiptNo();
		}

		// [#422][2.1.0-CT-080] 後処理がメイン処理と同時に実行されてしまうため後処理の登録削除 2016.12.09 kawana

		return entryNo;
	}

	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana End

	/**
	 * <h2>出庫指示を解除する。</h2>
	 * <pre>
	 * 引数チェック後、出庫指示の削除を行う。
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ：センタID・荷主ID・コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipCancel(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		// ===== 初期処理 =====

		// ===== 引数チェック =====
		if (shippingInstHead.getControlNo() == null) {
			// 致命的例外をスローする パラメータ不正
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 出庫指示削除 =====
		// 出庫指示.出庫指示削除メソッドを呼出し
		shipInstructeDelete(shippingInstHead, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * <h2>出庫指示を削除する。</h2>
	 * <pre>
	 *
	 * 引数（コントロールNo.）を条件に出荷指示データを取得し、
	 * 検索対象が見つからない場合、データ未存在エラーをエラーステータスに設定する。
	 * 引当指示データより、在庫受払データを検索し、データ編集後、【在庫更新.出庫[赤]】を実行する。
	 * 引当ロット管理を削除後、【最終ロット取消】を呼び出し、在庫受払データを更新する。
	 * 梱包データ(梱包ボディ、梱包帳票、梱包ヘッダ)を削除し、
	 * 出庫（出庫ヘッダ、出庫ボディ）と引当指示（引当指示ヘッダ、引当指示ボディ）データを削除する。
	 * 出荷指示ヘッダの出庫指示バッチNo.・引当指示ヘッダIDと出荷指示ボディの引当指示ボディID・引当済数・欠品フラグをクリアする。
	 * 最後に、【出荷ステータス更新クラス.出庫指示解除】を実行する。
	 *
	 * 【在庫更新.出庫［赤］】
	 * ・{@link StockUpdateLogic#shipedCancel(TAllocInstH, TAllocInstB, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫［赤］メソッド}を呼び出す。
	 *
	 * 【最終ロット取消】
	 * ・{@link LastShipdLotLogic#LastShipLotCancel(TAllocInstH, TAllocInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 最終ロット取消メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新クラス.出庫指示解除】
	 * ・{@link ShipStatusUpdateLogic#workOrderCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出庫指示解除のステータス更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipInstructeDelete(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		// ===== 初期処理 =====
		// 変数宣言及び初期化
		// 繰返用List変数宣言
		// 引当指示ヘッダID一括削除用allocInstHIdList
		ArrayList<Long> allocInstHIdList = new ArrayList<Long>();
		// 引当指示ボディID一括削除用allocInstBIdList
		ArrayList<Long> allocInstBIdList = new ArrayList<Long>();
		// 出荷指示ヘッダ一括更新用tShippingInstHList
		ArrayList<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();

		// 繰返用Map変数宣言
		// 引当指示ヘッダID一括削除用allocInstHIdMap
		HashMap<Long, Long> allocInstHIdMap = new HashMap<Long, Long>();
		// 引当指示ボディID一括削除用allocInstBIdMap
		HashMap<Long, Long> allocInstBIdMap = new HashMap<Long, Long>();
		// 出荷指示ヘッダ一括更新用tShippingInstHMap
		HashMap<Long, TShippingInstH> tShippingInstHMap = new HashMap<Long, TShippingInstH>();

		// ===== 引当指示ボディ→引当指示ヘッダ→出荷指示ヘッダ検索→（コントロールNo.） =====
		// 引当指示ボディデータ取得
		List<TShippingInstB> result = null;
		// 検索条件の設定
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_TAllocInstB().withTAllocInstH();

		// コントロールNo.の設定
		cb.query().queryTShippingInstH().setControlNo_Equal(shippingInstHead.getControlNo());

		// ソート順の設定
		cb.query().queryTAllocInstB().queryTAllocInstH().addOrderBy_AllocInstHId_Asc();
		cb.query().queryTShippingInstH().addOrderBy_ShippingInstHId_Asc();
		cb.query().queryTAllocInstB().addOrderBy_AllocInstBId_Asc();

		// ===== 検索実行 =====
		result = tShippingInstBBhv.selectList(cb);

		// ===== データ存在チェック =====
		if (result.size() == 0) {
			// 20141007 許 仮修正 Start
			// [ A ]の引当指示ボディデータの件数が0件の場合致命的例外をスローする
			//this.getErrorManager().throwException(new IllegalArgumentException());
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// 20141007 許 仮修正 End
			return;
		}

		// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana Start

		// ===== ピッキング提案データ削除 =====

		pickingMethodRecommendationCallLogic.shipInstructeDelete(shippingInstHead, errSts);
		if (getErrorManager().size() > 0) {
			return;
		}

		// [#5107][v3.1] 最適ピッキング提案 機能追加 2018.09.10 kawana End

		// ===== 引当指示ボディデータ件数分繰返 =====
		for (int row = 0; row < result.size(); row++) {
			// 20141003 許 仮修正 Start [ON推-CT3-011対応]
			// ===== 引当指示ボディで更新削除用のMapを編集 =====
			TAllocInstB dataAllocB = result.get(row).getTAllocInstB();
			// 引当指示ボディID一括削除用allocInstBIdMapに[ A ]の引当指示ボディ.引当指示ボディIDが存在しない場合、
			if (!allocInstBIdMap.containsKey(dataAllocB.getAllocInstBId())) {
				// tAllocInstBMapに[ A ]の引当指示ボディデータを追加する
				allocInstBIdMap.put(dataAllocB.getAllocInstBId(), dataAllocB.getAllocInstBId());

				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start

				// ===== 出庫ボディ検索 (引当指示ボディID) =====
				// 出庫ボディから検索
				TPickingBCB pickingBCb = tPickingBBhv.newMyConditionBean();
				// 検索条件
				pickingBCb.checkInvalidQuery();
				pickingBCb.query().setAllocInstBId_Equal(dataAllocB.getAllocInstBId());
				List<TPickingB> pickingBodyList = tPickingBBhv.selectList(pickingBCb);

				// 在庫ID毎の出庫数を計算 (出庫[赤]用)
				Map<Long, BigDecimal> stockPickingNumMap = new HashMap<Long, BigDecimal>();

				for (TPickingB pickingB : pickingBodyList) {

					long stockId = pickingB.getStockId();
					BigDecimal pickingNum = pickingB.getPickingNum();
					if (WCC.isZeroOrLess(pickingNum)) {
						continue;
					}

					if (stockPickingNumMap.containsKey(stockId)) {
						// 現在の出庫数を加算
						pickingNum = WCC.add(pickingNum, stockPickingNumMap.get(stockId));
					}

					// マップに設定
					stockPickingNumMap.put(stockId, pickingNum);
				}

				// ===== 在庫受払検索（引当指示ボディID） =====

				// 検索条件の設定
				TStockInoutCB stockInoutCb = tStockInoutBhv.newMyConditionBean();
				stockInoutCb.setupSelect_TAllocInstB().withTAllocInstH();
				stockInoutCb.checkInvalidQuery();
				stockInoutCb.query().setAllocInstBId_Equal(dataAllocB.getAllocInstBId());

				// ソート順の設定
				stockInoutCb.query().addOrderBy_StockInoutId_Desc();

				// ===== 検索実行 =====
				List<TStockInout> stockInoutList = tStockInoutBhv.selectList(stockInoutCb);

				// [ B ]の在庫データを取得件数 ＞ 0の場合、
				if (stockInoutList.size() > 0) {

					// 在庫ID毎に出庫[赤]用の在庫受払を作成
					// (出荷実績訂正などで出庫[黒]、出庫[赤]の在庫受払が混在しているため)
					Set<Long> shipedCancelStockIdSet = new HashSet<Long>();
					List<TStockInout> shipedCancelInoutList = new ArrayList<TStockInout>();
					for (TStockInout inout : stockInoutList) {
						long stockId = inout.getStockId();

						if (shipedCancelStockIdSet.contains(stockId)) {
							// 追加済
							continue;
						}

						if (stockPickingNumMap.containsKey(stockId)) {
							// 出庫あり

							// 出庫数を設定
							inout.setStockInoutNum(stockPickingNumMap.get(stockId));
							shipedCancelInoutList.add(inout);
							shipedCancelStockIdSet.add(stockId);
						}
					}

					if (shipedCancelInoutList.size() != stockPickingNumMap.values().size()) {
						getErrorManager().throwException(new IllegalStateException("stockInout count not equals picking stock count."));
					}

					TAllocInstH tAllocInstH = stockInoutList.get(0).getTAllocInstB().getTAllocInstH();
					TAllocInstB tAllocInstB = stockInoutList.get(0).getTAllocInstB();

					// [ON推-品向-1189] 実績訂正で出庫数0にしたデータの指示解除で致命的エラー 2016.08.23 kawana Start
					if (0 < shipedCancelInoutList.size()) {

						// 在庫更新.出庫[赤]メソッドを呼出し
						stockUpdateLogic.shipedCancel(tAllocInstH, tAllocInstB, shipedCancelInoutList, errSts);
						// エラー有りの場合は終了
						if (getErrorManager().size() > 0) {
							return;
						}
					}
					// [ON推-品向-1189] 実績訂正で出庫数0にしたデータの指示解除で致命的エラー 2016.08.23 kawana End

					// 引当ロット管理を削除する
					TAllocLotCB cb3 = tAllocLotBhv.newMyConditionBean();
					cb3.query().setAllocInstBId_Equal(tAllocInstB.getAllocInstBId());
					tAllocLotBhv.queryDelete(cb3);

					// 最終ロット管理.最終ロット取消
					lastShipdLotLogic.LastShipLotCancel(tAllocInstH, tAllocInstB, errSts);
					// エラー有りの場合は終了
					if (getErrorManager().size() > 0) {
						return;
					}
				}

				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			}

			// ===== 引当指示ヘッダで更新削除用のMapを編集 =====
			TAllocInstH dataAllocH = result.get(row).getTAllocInstB().getTAllocInstH();
			// 引当指示ヘッダID一括削除用allocInstHIdMapに[ A ]の引当指示ヘッダ.引当指示ヘッダIDが存在しない場合、
			if (!allocInstHIdMap.containsKey(dataAllocH.getAllocInstHId())) {
				// 引当指示ヘッダID一括削除用allocInstHIdMapに[ A ]の引当指示ヘッダIDを追加する
				allocInstHIdMap.put(dataAllocH.getAllocInstHId(), dataAllocH.getAllocInstHId());
			}

			// ===== 出荷指示ヘッダ一括更新用のエンティティを編集 =====
			TShippingInstH dataShippingH = result.get(row).getTShippingInstH();
			// 出荷指示ヘッダ一括更新用tShippingInstHMapに[ A ]の出荷指示ヘッダ.出荷指示ヘッダIDが存在しない場合、
			if (!tShippingInstHMap.containsKey(dataShippingH.getShippingInstHId())) {
				// [ A ]の出荷指示ヘッダ更新用データ編集
				dataShippingH.setAllocInstHId(null);
				dataShippingH.setPickingBatchNo(null);
				// 出荷指示ヘッダ一括更新用tShippingInstHMapに[ A ]の出荷指示ヘッダデータを追加する
				tShippingInstHMap.put(dataShippingH.getShippingInstHId(), dataShippingH);
			}
		}

		// ===== 引当指示ヘッダと引当指示ボディで削除用のListを編集 と 出荷指示ヘッダで更新用のListを編集 =====
		// 引当指示ボディID一括削除用allocInstBIdList ← allocInstBIdMapより取得した引当指示ボディIDを追加する
		Iterator<Long> valuesAllocB = allocInstBIdMap.values().iterator();
		while (valuesAllocB.hasNext()) {
			allocInstBIdList.add(valuesAllocB.next());
		}

		// 引当指示ヘッダID一括削除用allocInstHIdList ← allocInstHIdMapより取得した引当指示ヘッダIDを追加する
		Iterator<Long> valuesAllocH = allocInstHIdMap.values().iterator();
		while (valuesAllocH.hasNext()) {
			allocInstHIdList.add(valuesAllocH.next());
		}

		// 出荷指示ヘッダ一括更新用tShippingInstHList ← tShippingInstHMapより取得した引当指示ヘッダデータを追加する
		Iterator<TShippingInstH> valuesShippingH = tShippingInstHMap.values().iterator();
		while (valuesShippingH.hasNext()) {
			tShippingInstHList.add(valuesShippingH.next());
		}

		// ===== 在庫受払を更新 =====
		TStockInoutCB cb4 = tStockInoutBhv.newMyConditionBean();
		// 検索条件
		cb4.query().setAllocInstBId_InScope(allocInstBIdList);
		// 在庫受払更新用データ編集
		TStockInout updStockInout = new TStockInout();
		updStockInout.setAllocInstBId(null);
		// 在庫受払データを更新
		tStockInoutBhv.queryUpdate(updStockInout, cb4);

		// ===== 出荷指示ボディを更新 =====
		TShippingInstBCB cb5 = tShippingInstBBhv.newMyConditionBean();
		// 検索条件
		cb5.query().setAllocInstBId_InScope(allocInstBIdList);
		// 出荷指示ボディ更新用データ編集
		TShippingInstB updShippingInstB = new TShippingInstB();
		updShippingInstB.setAllocInstBId(null);
		updShippingInstB.setAllocNum(WCC.ZERO);

		// [#5144][v3.1] 欠品フラグ = 0 の設定を削除 2018.07.23 kawana Delete
		// ※※ 欠品フラグ、欠品数は出庫指示解除しても保持 ※※

		// 出荷指示ボディデータを更新
		tShippingInstBBhv.queryUpdate(updShippingInstB, cb5);

		// ===== 梱包ボディを削除 =====
		TPackingBCB cb6 = tPackingBBhv.newMyConditionBean();
		// 検索条件
		cb6.query().setAllocInstBId_InScope(allocInstBIdList);
		// 梱包ボディデータを削除
		tPackingBBhv.queryDelete(cb6);

		// ===== 出庫ボディを削除 =====
		TPickingBCB cb7 = tPickingBBhv.newMyConditionBean();
		// 検索条件
		cb7.query().setAllocInstBId_InScope(allocInstBIdList);
		// 梱包ボディデータを削除
		tPickingBBhv.queryDelete(cb7);

		// ===== 引当指示ボディを削除 =====
		TAllocInstBCB cb8 = tAllocInstBBhv.newMyConditionBean();
		// 検索条件
		cb8.query().setAllocInstBId_InScope(allocInstBIdList);
		// 引当指示ボディデータを削除
		tAllocInstBBhv.queryDelete(cb8);

		// ===== 出荷指示ヘッダ一括更新 =====
		tShippingInstHBhv.batchUpdate(tShippingInstHList);

		// ===== 梱包帳票を削除 =====
		TPackingRCB cb9 = tPackingRBhv.newMyConditionBean();
		// 検索条件
		cb9.query().queryTPackingH().setAllocInstHId_InScope(allocInstHIdList);
		// 梱包帳票データを削除
		tPackingRBhv.queryDelete(cb9);

		// ===== 梱包ヘッダを削除 =====
		TPackingHCB cb10 = tPackingHBhv.newMyConditionBean();
		// 検索条件
		cb10.query().setAllocInstHId_InScope(allocInstHIdList);
		// 梱包ヘッダデータを削除
		tPackingHBhv.queryDelete(cb10);

		// [#5143][v3.1] 出庫指示一覧 - 出庫指示解除の単行出荷検品ワーク対応 2018.08.21 kawana Start

		// ===== 単行出荷検品ワーク削除 =====
		singleRowShippingInspectLogic.deleteWork(allocInstHIdList);

		// [#5143][v3.1] 出庫指示一覧 - 出庫指示解除の単行出荷検品ワーク対応 2018.08.21 kawana End

		// ===== 出庫帳票を削除 =====
		TPickingRCB cb11 = tPickingRBhv.newMyConditionBean();
		// 検索条件
		cb11.query().queryTPickingH().setAllocInstHId_InScope(allocInstHIdList);
		// 出庫帳票データを削除
		tPickingRBhv.queryDelete(cb11);

		// ===== 出庫ヘッダを削除 =====
		TPickingHCB cb12 = tPickingHBhv.newMyConditionBean();
		// 検索条件
		cb12.query().setAllocInstHId_InScope(allocInstHIdList);
		// 出庫ヘッダデータを削除
		tPickingHBhv.queryDelete(cb12);

		// ===== 引当指示ヘッダを削除 =====
		TAllocInstHCB cb13 = tAllocInstHBhv.newMyConditionBean();
		// 検索条件
		cb13.query().setAllocInstHId_InScope(allocInstHIdList);
		// 引当指示ヘッダデータを削除
		tAllocInstHBhv.queryDelete(cb13);

		// ===== 出荷ステータス更新.出庫指示解除 =====
		shipStatusUpdateLogic.workOrderCancel(tShippingInstHList, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return;
		}

	}

	// [ver3.0][#2220][#3847] 出荷実績入力(予定なし) - 梱包計算なしでデータ作成・帳票を出力済に変更 2018.03.05 miyabe/kawana Start

	/**
	 * <h2>出庫指示処理を実行する(予定なし・出庫作業済)。</h2>
	 * <pre>
	 * 以下順序で処理を行う
	 *
	 * 1. 出庫指示バッチNo、処理Noの採番
	 * 2. 出庫指示・引当指示データの登録
	 * 3. 【在庫引当】
	 * 4. 【梱包データ登録(計算なし)】
	 * 5. 出庫作業に関わる帳票を出力済に更新
	 *
	 * 【在庫引当】
	 * ・{@link StockAllocateLogic#allocate(TShippingInstH ,String, String, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫引当メソッド}を呼び出す。
	 *
	 * 【梱包データ登録(計算なし)】
	 * ・{@link PackingCalculateLogic#noCalculate(TShippingInstH ,com.oneslogi.base.exception.ErrorManager.ErrorStatus) 梱包データ作成(計算なし)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ：センタID・荷主ID・コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipInstructeNoPlan(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		// ===== パラメータチェック =====

		if (shippingInstHead.getControlNo() == null
				|| shippingInstHead.getCenterId() == null
				|| shippingInstHead.getClientId() == null) {

			// 致命的例外をスローする パラメータ不正
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}

		// ===== 採番 =====

		final long centerId = shippingInstHead.getCenterId();

		// 出庫指示バッチNo 採番
		String pickingBatchNo = numberingLogic.getNumbering(centerId, WmsNumberingConst.PICKING_BATCH_NO);

		// 処理No. 採番
		String processNo = numberingLogic.getNumbering(centerId, WmsNumberingConst.PROCESS_NO);

		// ===== 出庫指示、引当指示登録 =====

		// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana Start
		shipInstructeAdd(shippingInstHead, pickingBatchNo, processNo, SetAutoEmgFlg.FALSE, errSts);
		// [#5123][v3.1] 緊急フラグの自動設定機能追加 2018.07.31 kawana End
		if (0 < getErrorManager().size()) {
			addErrorLog();
			return;
		}

		// ===== 在庫引当 =====

		AllocateState allocState = stockAllocateLogic.allocate(shippingInstHead, pickingBatchNo, processNo, errSts);
		if (0 < getErrorManager().size()) {
			addErrorLog();
			return;
		}

		if (allocState.isStockOut || allocState.didReplenish) {
			// 実績登録なので欠品・緊急補充はエラー

			getErrorManager().add(errSts, WmsMessageConst.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR);
			addErrorLog();
			return;
		}

		// ===== 梱包計算(計算なし) =====

		packingCalculateLogic.noCalculate(shippingInstHead, null, errSts);
		if (0 < getErrorManager().size()) {
			addErrorLog();
			return;
		}

		// ===== 帳票を出力済に更新 =====

		updateOutFlgAllEnd(shippingInstHead, errSts);
		if (0 < getErrorManager().size()) {
			addErrorLog();
			return;
		}
	}

	/**
	 * <h2>帳票系の発行フラグに1を設定する</h2>
	 * <pre>
	 * 出荷指示ヘッダに付与されたコントロールNo.から紐づく出庫帳票、梱包帳票の
	 * 出庫作業に関わる出力フラグを「1:発行済」に更新する。
	 *
	 * ※「発行済」の判定に発行日時の有無で判定している処理があるため、暫定対応で日時も設定する
	 * </pre>
	 * @param shippingInstHead 出荷指示ヘッダ : コントロールNo.
	 */
	public void updateOutFlgAllEnd(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();
		final long controlNo = shippingInstHead.getControlNo();

		// コントロールNo.が付与された出荷指示ヘッダを検索(引当指示ヘッダIDのみ)
		TShippingInstHCB sihCb = tShippingInstHBhv.newMyConditionBean();
		sihCb.specify().columnAllocInstHId();
		sihCb.checkInvalidQuery();
		// 検索条件(コントロールNo.)
		sihCb.query().setCenterId_Equal(centerId);
		sihCb.query().setClientId_Equal(clientId);
		sihCb.query().setControlNo_Equal(controlNo);

		List<TShippingInstH> sihList = tShippingInstHBhv.selectList(sihCb);
		if (sihList.isEmpty()) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}

		Set<Long> allocInstHIdSet = new HashSet<Long>();
		for (TShippingInstH sih : sihList) {
			if (sih.getAllocInstHId() == null) {
				this.getErrorManager().throwException(new IllegalStateException("allocInstHId is null."));
			}
			allocInstHIdSet.add(sih.getAllocInstHId());
		}

		// ===== 出庫帳票の更新 =====

		TPickingR updatedPickingR = new TPickingR();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
		updatedPickingR.setPl1OutFlg_$1();
		updatedPickingR.setPl2OutFlg_$1();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
		updatedPickingR.setOplOutFlg_$1();
		updatedPickingR.setTplOutFlg_$1();
		updatedPickingR.setMltOutFlg_$1();
		updatedPickingR.setCaseOutFlg_$1();
		updatedPickingR.setPlOutFlg_$1();
		updatedPickingR.setSlOutFlg_$1();
		updatedPickingR.setPackingOutFlg_$1();
		updatedPickingR.setSlipOutFlg_$1();
		updatedPickingR.setInvoiceCreateFlg_$1();
		// ※「発行済」の判定に発行日時の有無で判定している処理があるため、暫定対応で日時を設定する
		Timestamp nowTime = new Timestamp(System.currentTimeMillis());
		updatedPickingR.setPl1OutDt(nowTime);
		updatedPickingR.setPl2OutDt(nowTime);
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
		updatedPickingR.setCaseOutDt(nowTime);
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
		updatedPickingR.setPackingOutDt(nowTime);
		updatedPickingR.setSlipOutDt(nowTime);
		updatedPickingR.setInvoiceCreateDt(nowTime);

		TPickingRCB updatedPickingRCb = tPickingRBhv.newConditionBean();
		updatedPickingRCb.query().queryTPickingH().setAllocInstHId_InScope(allocInstHIdSet);

		tPickingRBhv.queryUpdate(updatedPickingR, updatedPickingRCb);

		// ===== 梱包帳票の更新 =====

		TPackingR updatedPackingR = new TPackingR();
		updatedPackingR.setStwOutFlg_$1();
		updatedPackingR.setTagOutFlg_$1();
		updatedPackingR.setInspectionOutFlg_$1();
		// ※「発行済」の判定に発行日時の有無で判定している処理があるため、暫定対応で日時を設定する
		updatedPackingR.setStwOutDt(nowTime);
		updatedPackingR.setTagOutDt(nowTime);
		updatedPackingR.setInspectionOutDt(nowTime);

		TPackingRCB updatedPackingRCb = tPackingRBhv.newConditionBean();
		updatedPackingRCb.query().queryTPackingH().setAllocInstHId_InScope(allocInstHIdSet);

		tPackingRBhv.queryUpdate(updatedPackingR, updatedPackingRCb);
	}

	// [ver3.0][#2220][#3847] 出荷実績入力(予定なし) - 梱包計算なしでデータ作成・帳票を出力済に変更 2018.03.05 miyabe/kawana End

	// [ON推-品向-979] 出庫指示の速度改善を採番キャッシュ機能で行うため速度改善前に戻す 2015.10.14(不要な処理を削除) kawana

	// [Ver3.1][#5125]欠品クリア処理を追加 2018.08.20 matsumoto Start
	/**
	 * <h2>欠品フラグ、欠品数をnullにする。</h2>
	 * <pre>
	 * 引数を条件に対象データを取得し、
	 * 出荷指示ヘッダの欠品フラグと出荷指示ボディの欠品数をnullに更新する。
	 * </pre>
	 * @param controlNo コントロールNo
	 */
	public void clearShortage(Long controlNo) {

		List<TShippingInstB> tShippingInstBList = null;

		// 出荷指示ボディのデータを取得
		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
		tShippingInstBCB.setupSelect_TShippingInstH();
		tShippingInstBCB.query().queryTShippingInstH().setControlNo_Equal(controlNo);
		tShippingInstBList = tShippingInstBBhv.selectList(tShippingInstBCB);

		// 欠品数と欠品フラグをnullに更新する
		if (tShippingInstBList.size() > 0) {
			for (TShippingInstB tShippingInstB : tShippingInstBList) {
				tShippingInstB.setStockOutNum(null);
				tShippingInstB.getTShippingInstH().setStockOutFlg(null);

				tShippingInstBBhv.update(tShippingInstB);
				tShippingInstHBhv.update(tShippingInstB.getTShippingInstH());
			}
		}
	}
	// [Ver3.1][#5125]欠品クリア処理を追加 2018.08.20 matsumoto End

	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana Start

	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param pickingBatchNo 出庫指示バッチNo.
	 * @param dataCount
	 * @param processNo
	 */
	public void startLog(String centerCd, String clientCd, String pickingBatchNo, String processNo, int dataCount) {

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.SHIPPING_INST_BATCH_PROGRAM_NAME_INFORMATION);

		// 属性１設定(センターCD)
		getDatabaseLogger().setAttribute1(centerCd);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.SHIPPING_INST_BATCH_PARAMETER_INFORMATION, centerCd, clientCd, pickingBatchNo, processNo, String.valueOf(dataCount));
	}

	/**
	 * <h2>ログ終了(正常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endSuccessLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（正常終了)
			getDatabaseLogger().endSuccessLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>エラーログを追加</h2>
	 * <pre>
	 * エラー管理クラスに登録されているエラーをログに出力する
	 * </pre>
	 */
	private void addErrorLog() {

		if (outputLog == OutputLog.TRUE) {
			Map<Integer, BaseException> errorMap = getErrorManager().get();
			for (BaseException exp : errorMap.values()) {
				if (exp instanceof CommonException) {
					String messageCd = ((CommonException) exp).getMessageCd();
					List<String> replaceValue = ((CommonException) exp).getReplaceValue();
					if (replaceValue == null) {
						getDatabaseLogger().addErrorLogDtl(messageCd);
					} else {
						// [#6807][OSS]致命的エラー発生 2019.11.08 kawana Start
						getDatabaseLogger().addErrorLogDtl(messageCd, (String[]) replaceValue.toArray(new String[replaceValue.size()]));
						// [#6807][OSS]致命的エラー発生 2019.11.08 kawana End
					}
				}
			}
		}
	}

	/**
	 * <h2>警告ログを追加</h2>
	 * <pre>
	 * エラー管理クラスに登録されているエラーをログに出力する
	 * </pre>
	 */
	private void addWarnLog() {

		if (outputLog == OutputLog.TRUE) {
			Map<Integer, BaseException> warnMap = getWarnManager().get();
			for (BaseException exp : warnMap.values()) {
				if (exp instanceof CommonException) {
					String messageCd = ((CommonException) exp).getMessageCd();
					List<String> replaceValueList = ((CommonException) exp).getReplaceValue();
					if (replaceValueList == null) {
						getDatabaseLogger().addWarnLogDtl(messageCd);
					} else {
						// [#5670][#5704][v3.1] 運用ログからHTMLタグを除去 2018.11.22 kawana Start
						String[] replaceValues = new String[replaceValueList.size()];

						for (int i = 0; i < replaceValueList.size(); i++) {
							String str = replaceValueList.get(i);

							if (CU.isNullOrEmpty(str)) {
								// ※ nullが入ることもあるので注意
								replaceValues[i] = str;
							} else {
								// HTMLタグの除去
								replaceValues[i] = str.replaceAll("<.+?>", "");
							}
						}
						getDatabaseLogger().addWarnLogDtl(messageCd, replaceValues);
						// [#5670][#5704][v3.1] 運用ログからHTMLタグを除去 2018.11.22 kawana End
					}
				}
			}
		}
	}

	/**
	 * <h2>ログ終了(異常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endFailureLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（異常終了)
			getDatabaseLogger().endFailureLog();
			outputLog = OutputLog.FALSE;
		}
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.13 kawana End

	// レスポンス対策 2016.02.24 kawana Start

	/**
	 * <h2>マスタ存在チェック。</h2>
	 */
	private void masterErrCheck(TShippingInstB shippingInstB, ErrorStatus errSts) {

		TShippingInstH shippingInstH = shippingInstB.getTShippingInstH();

		// ===== 納品先取引マスタチェック(必須) =====
		if (shippingInstH.getMCustomerBySupplyCustomerId() == null) {
			// エラー
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			getErrorManager().add(errSts, WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			return;
		}

		// ===== 届先先取引マスタチェック(必須) =====
		if (shippingInstH.getMCustomerByDelivCustomerId() == null) {
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			getErrorManager().add(errSts, WmsMessageConst.DELIV_CUSTOMER_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			return;
		}

		// ===== 配送コースマスタチェック(必須) =====
		if (shippingInstH.getMDeliveryCourse() == null) {

			getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_ERROR);
			return;
		}

		// ===== 運送業者マスタチェック(必須) =====
		if (shippingInstH.getMDeliveryCourse().getMCarrier() == null) {

			getErrorManager().add(errSts, WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
			return;
		}

		// ===== 預託取引先マスタチェック(必須) =====
		if (shippingInstB.getMCustomer() == null) {
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
			//getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR);
			// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
			return;
		}

		// ===== 在庫区分マスタチェク(必須) =====
		if (shippingInstB.getMStockType() == null) {

			getErrorManager().add(errSts, WmsMessageConst.STOCK_TYPE_NOT_FOUND_ERROR);
			return;
		}

		// ===== 商品マスタチェック(必須) =====
		if (shippingInstB.getMProduct() == null) {

			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			return;
		}

		// [#5705][v3.1] 指定倉庫、指定ロケーションの削除チェックを追加 2018.12.06 kawana Start

		// ===== ロケーションマスタチェック (指定ロケーションCDに入力がある場合は必須) =====
		if (!CU.isNullOrEmpty(shippingInstB.getLocationCd()) && shippingInstB.getMLocation() == null) {

			getErrorManager().add(errSts, WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			return;
		}

		// ===== 倉庫マスタチェック (指定倉庫CDに入力がある場合は必須) =====
		if (!CU.isNullOrEmpty(shippingInstB.getWarehouseCd()) && shippingInstB.getMWarehouse() == null) {

			getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
			return;
		}

		// [#5705][v3.1] 指定倉庫、指定ロケーションの削除チェックを追加 2018.12.06 kawana End
	}

	/**
	 * 引当指示ヘッダキー
	 */
	public static final class AllocHeaderKey {
		private long processTypeId;
		private String shippingDt;
		private String delivPlanDt;
		private String delivDt;
		private String delivTz;
		private Long supplyCustomerId;
		private String supplyCustomerCd;
		private String supplyCustomerNm;
		private Long delivCustomerId;
		private String delivCustomerCd;
		private String delivZipCd;
		private String delivAddress1;
		private String delivAddress2;
		private String delivAddress3;
		private String delivAddressSupply;
		private String delivCustomerNm;
		private String delivTelNo;
		private Long delivCourseId;

		private AllocHeaderKey() {
		}

		private AllocHeaderKey(Builder builder) {
			this.processTypeId = builder.processTypeId;
			this.shippingDt = builder.shippingDt;
			this.delivPlanDt = builder.delivPlanDt;
			this.delivDt = builder.delivDt;
			this.delivTz = builder.delivTz;
			this.supplyCustomerId = builder.supplyCustomerId;
			this.supplyCustomerCd = builder.supplyCustomerCd;
			this.supplyCustomerNm = builder.supplyCustomerNm;
			this.delivCustomerId = builder.delivCustomerId;
			this.delivCustomerCd = builder.delivCustomerCd;
			this.delivZipCd = builder.delivZipCd;
			this.delivAddress1 = builder.delivAddress1;
			this.delivAddress2 = builder.delivAddress2;
			this.delivAddress3 = builder.delivAddress3;
			this.delivAddressSupply = builder.delivAddressSupply;
			this.delivCustomerNm = builder.delivCustomerNm;
			this.delivTelNo = builder.delivTelNo;
			this.delivCourseId = builder.delivCourseId;
		}

		public static ProcessTypeBuilder builder() {
			return new Builder();
		}

		public static interface ProcessTypeBuilder {
			ShippingDtBuilder processTypeId(long processTypeId);
		}

		public static interface ShippingDtBuilder {
			Builder shippingDt(String shippingDt);
		}

		public static class Builder implements ProcessTypeBuilder, ShippingDtBuilder {

			private long processTypeId;
			private String shippingDt;
			private String delivPlanDt;
			private String delivDt;
			private String delivTz;
			private Long supplyCustomerId;
			private String supplyCustomerCd;
			private String supplyCustomerNm;
			private Long delivCustomerId;
			private String delivCustomerCd;
			private String delivZipCd;
			private String delivAddress1;
			private String delivAddress2;
			private String delivAddress3;
			private String delivAddressSupply;
			private String delivCustomerNm;
			private String delivTelNo;
			private Long delivCourseId;

			private Builder() {
			}

			@Override
			public ShippingDtBuilder processTypeId(long processTypeId) {
				this.processTypeId = processTypeId;
				return this;
			}

			@Override
			public Builder shippingDt(String shippingDt) {
				this.shippingDt = shippingDt;
				return this;
			}

			public Builder delivPlanDt(String delivPlanDt) {
				this.delivPlanDt = delivPlanDt;
				return this;
			}

			public Builder delivDt(String delivDt) {
				this.delivDt = delivDt;
				return this;
			}

			public Builder delivTz(String delivTz) {
				this.delivTz = delivTz;
				return this;
			}

			public Builder supplyCustomerId(Long supplyCustomerId) {
				this.supplyCustomerId = supplyCustomerId;
				return this;
			}

			public Builder supplyCustomerCd(String supplyCustomerCd) {
				this.supplyCustomerCd = supplyCustomerCd;
				return this;
			}

			public Builder supplyCustomerNm(String supplyCustomerNm) {
				this.supplyCustomerNm = supplyCustomerNm;
				return this;
			}

			public Builder delivCustomerId(Long delivCustomerId) {
				this.delivCustomerId = delivCustomerId;
				return this;
			}

			public Builder delivCustomerCd(String delivCustomerCd) {
				this.delivCustomerCd = delivCustomerCd;
				return this;
			}

			public Builder delivZipCd(String delivZipCd) {
				this.delivZipCd = delivZipCd;
				return this;
			}

			public Builder delivAddress1(String delivAddress1) {
				this.delivAddress1 = delivAddress1;
				return this;
			}

			public Builder delivAddress2(String delivAddress2) {
				this.delivAddress2 = delivAddress2;
				return this;
			}

			public Builder delivAddress3(String delivAddress3) {
				this.delivAddress3 = delivAddress3;
				return this;
			}

			public Builder delivAddressSupply(String delivAddressSupply) {
				this.delivAddressSupply = delivAddressSupply;
				return this;
			}

			public Builder delivCustomerNm(String delivCustomerNm) {
				this.delivCustomerNm = delivCustomerNm;
				return this;
			}

			public Builder delivTelNo(String delivTelNo) {
				this.delivTelNo = delivTelNo;
				return this;
			}

			public Builder delivCourseId(Long delivCourseId) {
				this.delivCourseId = delivCourseId;
				return this;
			}

			public AllocHeaderKey build() {
				return new AllocHeaderKey(this);
			}
		}

		// ===== 以下、ゲッタ

		/**
		 * @return processTypeId
		 */
		public long getProcessTypeId() {
			return processTypeId;
		}

		/**
		 * @return shippingDt
		 */
		public String getShippingDt() {
			return shippingDt;
		}

		/**
		 * @return delivPlanDt
		 */
		public String getDelivPlanDt() {
			return delivPlanDt;
		}

		/**
		 * @return delivDt
		 */
		public String getDelivDt() {
			return delivDt;
		}

		/**
		 * @return delivTz
		 */
		public String getDelivTz() {
			return delivTz;
		}

		/**
		 * @return supplyCustomerId
		 */
		public Long getSupplyCustomerId() {
			return supplyCustomerId;
		}

		/**
		 * @return supplyCustomerCd
		 */
		public String getSupplyCustomerCd() {
			return supplyCustomerCd;
		}

		/**
		 * @return supplyCustomerNm
		 */
		public String getSupplyCustomerNm() {
			return supplyCustomerNm;
		}

		/**
		 * @return delivCustomerId
		 */
		public Long getDelivCustomerId() {
			return delivCustomerId;
		}

		/**
		 * @return delivCustomerCd
		 */
		public String getDelivCustomerCd() {
			return delivCustomerCd;
		}

		/**
		 * @return delivZipCd
		 */
		public String getDelivZipCd() {
			return delivZipCd;
		}

		/**
		 * @return delivAddress1
		 */
		public String getDelivAddress1() {
			return delivAddress1;
		}

		/**
		 * @return delivAddress2
		 */
		public String getDelivAddress2() {
			return delivAddress2;
		}

		/**
		 * @return delivAddress3
		 */
		public String getDelivAddress3() {
			return delivAddress3;
		}

		/**
		 * @return delivAddressSupply
		 */
		public String getDelivAddressSupply() {
			return delivAddressSupply;
		}

		/**
		 * @return delivCustomerNm
		 */
		public String getDelivCustomerNm() {
			return delivCustomerNm;
		}

		/**
		 * @return delivTelNo
		 */
		public String getDelivTelNo() {
			return delivTelNo;
		}

		/**
		 * @return delivCourseId
		 */
		public Long getDelivCourseId() {
			return delivCourseId;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((delivAddress1 == null) ? 0 : delivAddress1.hashCode());
			result = prime * result + ((delivAddress2 == null) ? 0 : delivAddress2.hashCode());
			result = prime * result + ((delivAddress3 == null) ? 0 : delivAddress3.hashCode());
			result = prime * result + ((delivAddressSupply == null) ? 0 : delivAddressSupply.hashCode());
			result = prime * result + ((delivCourseId == null) ? 0 : delivCourseId.hashCode());
			result = prime * result + ((delivCustomerCd == null) ? 0 : delivCustomerCd.hashCode());
			result = prime * result + ((delivCustomerId == null) ? 0 : delivCustomerId.hashCode());
			result = prime * result + ((delivCustomerNm == null) ? 0 : delivCustomerNm.hashCode());
			result = prime * result + ((delivDt == null) ? 0 : delivDt.hashCode());
			result = prime * result + ((delivPlanDt == null) ? 0 : delivPlanDt.hashCode());
			result = prime * result + ((delivTelNo == null) ? 0 : delivTelNo.hashCode());
			result = prime * result + ((delivTz == null) ? 0 : delivTz.hashCode());
			result = prime * result + ((delivZipCd == null) ? 0 : delivZipCd.hashCode());
			result = prime * result + (int) (processTypeId ^ (processTypeId >>> 32));
			result = prime * result + ((shippingDt == null) ? 0 : shippingDt.hashCode());
			result = prime * result + ((supplyCustomerCd == null) ? 0 : supplyCustomerCd.hashCode());
			result = prime * result + ((supplyCustomerId == null) ? 0 : supplyCustomerId.hashCode());
			result = prime * result + ((supplyCustomerNm == null) ? 0 : supplyCustomerNm.hashCode());
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AllocHeaderKey other = (AllocHeaderKey) obj;
			if (delivAddress1 == null) {
				if (other.delivAddress1 != null)
					return false;
			} else if (!delivAddress1.equals(other.delivAddress1))
				return false;
			if (delivAddress2 == null) {
				if (other.delivAddress2 != null)
					return false;
			} else if (!delivAddress2.equals(other.delivAddress2))
				return false;
			if (delivAddress3 == null) {
				if (other.delivAddress3 != null)
					return false;
			} else if (!delivAddress3.equals(other.delivAddress3))
				return false;
			if (delivAddressSupply == null) {
				if (other.delivAddressSupply != null)
					return false;
			} else if (!delivAddressSupply.equals(other.delivAddressSupply))
				return false;
			if (delivCourseId == null) {
				if (other.delivCourseId != null)
					return false;
			} else if (!delivCourseId.equals(other.delivCourseId))
				return false;
			if (delivCustomerCd == null) {
				if (other.delivCustomerCd != null)
					return false;
			} else if (!delivCustomerCd.equals(other.delivCustomerCd))
				return false;
			if (delivCustomerId == null) {
				if (other.delivCustomerId != null)
					return false;
			} else if (!delivCustomerId.equals(other.delivCustomerId))
				return false;
			if (delivCustomerNm == null) {
				if (other.delivCustomerNm != null)
					return false;
			} else if (!delivCustomerNm.equals(other.delivCustomerNm))
				return false;
			if (delivDt == null) {
				if (other.delivDt != null)
					return false;
			} else if (!delivDt.equals(other.delivDt))
				return false;
			if (delivPlanDt == null) {
				if (other.delivPlanDt != null)
					return false;
			} else if (!delivPlanDt.equals(other.delivPlanDt))
				return false;
			if (delivTelNo == null) {
				if (other.delivTelNo != null)
					return false;
			} else if (!delivTelNo.equals(other.delivTelNo))
				return false;
			if (delivTz == null) {
				if (other.delivTz != null)
					return false;
			} else if (!delivTz.equals(other.delivTz))
				return false;
			if (delivZipCd == null) {
				if (other.delivZipCd != null)
					return false;
			} else if (!delivZipCd.equals(other.delivZipCd))
				return false;
			if (processTypeId != other.processTypeId)
				return false;
			if (shippingDt == null) {
				if (other.shippingDt != null)
					return false;
			} else if (!shippingDt.equals(other.shippingDt))
				return false;
			if (supplyCustomerCd == null) {
				if (other.supplyCustomerCd != null)
					return false;
			} else if (!supplyCustomerCd.equals(other.supplyCustomerCd))
				return false;
			if (supplyCustomerId == null) {
				if (other.supplyCustomerId != null)
					return false;
			} else if (!supplyCustomerId.equals(other.supplyCustomerId))
				return false;
			if (supplyCustomerNm == null) {
				if (other.supplyCustomerNm != null)
					return false;
			} else if (!supplyCustomerNm.equals(other.supplyCustomerNm))
				return false;
			return true;
		}
	}

	/**
	 * 引当指示ボディキー
	 */
	public static final class AllocBodyKey {

		private AllocHeaderKey headerKey;
		private Long productId;
		private Long stockTypeId;
		private Long depositId;
		private String warehouseCd;
		private String locationCd;
		private String lot;
		private String limitDt;

		private AllocBodyKey() {
		}

		private AllocBodyKey(Builder builder) {
			this.headerKey = builder.headerKey;
			this.productId = builder.productId;
			this.stockTypeId = builder.stockTypeId;
			this.depositId = builder.depositId;
			this.warehouseCd = builder.warehouseCd;
			this.locationCd = builder.locationCd;
			this.lot = builder.lot;
			this.limitDt = builder.limitDt;
		}

		public static HeaderBuilder builder() {
			return new Builder();
		}

		public static interface HeaderBuilder {
			Builder headerKey(AllocHeaderKey headerKey);
		}

		public static class Builder implements HeaderBuilder {

			private AllocHeaderKey headerKey;
			private Long productId;
			private Long stockTypeId;
			private Long depositId;
			private String warehouseCd;
			private String locationCd;
			private String lot;
			private String limitDt;

			@Override
			public Builder headerKey(AllocHeaderKey headerKey) {
				this.headerKey = headerKey;
				return this;
			}

			Builder productId(Long productId) {
				this.productId = productId;
				return this;
			}

			Builder stockTypeId(Long stockTypeId) {
				this.stockTypeId = stockTypeId;
				return this;
			}

			Builder depositId(Long depositId) {
				this.depositId = depositId;
				return this;
			}

			Builder warehouseCd(String warehouseCd) {
				this.warehouseCd = warehouseCd;
				return this;
			}

			Builder locationCd(String locationCd) {
				this.locationCd = locationCd;
				return this;
			}

			Builder lot(String lot) {
				this.lot = lot;
				return this;
			}

			Builder limitDt(String limitDt) {
				this.limitDt = limitDt;
				return this;
			}

			public AllocBodyKey build() {
				return new AllocBodyKey(this);
			}
		}

		// ===== 以下、ゲッタ

		/**
		 * @return productId
		 */
		public Long getProductId() {
			return productId;
		}

		/**
		 * @return stockTypeId
		 */
		public Long getStockTypeId() {
			return stockTypeId;
		}

		/**
		 * @return depositId
		 */
		public Long getDepositId() {
			return depositId;
		}

		/**
		 * @return warehouseCd
		 */
		public String getWarehouseCd() {
			return warehouseCd;
		}

		/**
		 * @return locationCd
		 */
		public String getLocationCd() {
			return locationCd;
		}

		/**
		 * @return lot
		 */
		public String getLot() {
			return lot;
		}

		/**
		 * @return limitDt
		 */
		public String getLimitDt() {
			return limitDt;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((depositId == null) ? 0 : depositId.hashCode());
			result = prime * result + ((headerKey == null) ? 0 : headerKey.hashCode());
			result = prime * result + ((limitDt == null) ? 0 : limitDt.hashCode());
			result = prime * result + ((locationCd == null) ? 0 : locationCd.hashCode());
			result = prime * result + ((lot == null) ? 0 : lot.hashCode());
			result = prime * result + ((productId == null) ? 0 : productId.hashCode());
			result = prime * result + ((stockTypeId == null) ? 0 : stockTypeId.hashCode());
			result = prime * result + ((warehouseCd == null) ? 0 : warehouseCd.hashCode());
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AllocBodyKey other = (AllocBodyKey) obj;
			if (depositId == null) {
				if (other.depositId != null)
					return false;
			} else if (!depositId.equals(other.depositId))
				return false;
			if (headerKey == null) {
				if (other.headerKey != null)
					return false;
			} else if (!headerKey.equals(other.headerKey))
				return false;
			if (limitDt == null) {
				if (other.limitDt != null)
					return false;
			} else if (!limitDt.equals(other.limitDt))
				return false;
			if (locationCd == null) {
				if (other.locationCd != null)
					return false;
			} else if (!locationCd.equals(other.locationCd))
				return false;
			if (lot == null) {
				if (other.lot != null)
					return false;
			} else if (!lot.equals(other.lot))
				return false;
			if (productId == null) {
				if (other.productId != null)
					return false;
			} else if (!productId.equals(other.productId))
				return false;
			if (stockTypeId == null) {
				if (other.stockTypeId != null)
					return false;
			} else if (!stockTypeId.equals(other.stockTypeId))
				return false;
			if (warehouseCd == null) {
				if (other.warehouseCd != null)
					return false;
			} else if (!warehouseCd.equals(other.warehouseCd))
				return false;
			return true;
		}
	}

	// レスポンス対策 2016.02.24 kawana End
}