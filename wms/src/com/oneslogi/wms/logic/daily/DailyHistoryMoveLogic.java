package com.oneslogi.wms.logic.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.ScalarQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInstCB;
import com.oneslogi.base.dbflute.cbean.TInventoryRCB;
import com.oneslogi.base.dbflute.cbean.TKeepingLotCB;
import com.oneslogi.base.dbflute.cbean.TLastLotCB;
import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstHCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstRCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanRCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanSpareCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstSpareCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStockReportCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoRCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordRCB;
import com.oneslogi.base.dbflute.exbhv.HInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.HInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.HMoveBBhv;
import com.oneslogi.base.dbflute.exbhv.HMoveHBhv;
import com.oneslogi.base.dbflute.exbhv.HPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.HPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.HReceiveBBhv;
import com.oneslogi.base.dbflute.exbhv.HReceiveHBhv;
import com.oneslogi.base.dbflute.exbhv.HReceiveSpareBhv;
import com.oneslogi.base.dbflute.exbhv.HShippingBBhv;
import com.oneslogi.base.dbflute.exbhv.HShippingHBhv;
import com.oneslogi.base.dbflute.exbhv.HShippingSpareBhv;
import com.oneslogi.base.dbflute.exbhv.HStockBhv;
import com.oneslogi.base.dbflute.exbhv.HStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
import com.oneslogi.base.dbflute.exbhv.TKeepingLotBhv;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanSpareBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoRBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exentity.HInventoryB;
import com.oneslogi.base.dbflute.exentity.HInventoryH;
import com.oneslogi.base.dbflute.exentity.HMoveB;
import com.oneslogi.base.dbflute.exentity.HMoveH;
import com.oneslogi.base.dbflute.exentity.HPackingB;
import com.oneslogi.base.dbflute.exentity.HPackingH;
import com.oneslogi.base.dbflute.exentity.HReceiveB;
import com.oneslogi.base.dbflute.exentity.HReceiveH;
import com.oneslogi.base.dbflute.exentity.HReceiveSpare;
import com.oneslogi.base.dbflute.exentity.HShippingB;
import com.oneslogi.base.dbflute.exentity.HShippingH;
import com.oneslogi.base.dbflute.exentity.HShippingSpare;
import com.oneslogi.base.dbflute.exentity.HStockInout;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TKeepingLot;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;

/**
 * 日次締処理履歴移動ロジッククラス
 */
public class DailyHistoryMoveLogic extends AbstractWmsLogic {

	// [EC-CT1-044] メモリ不足対応(処理数を制限するため全体的な流れを変更) 2015.06.11 kawana Start

	// ===== 使用テーブル =====

	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private TStockReportBhv tStockReportBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	// [#224][2.1.0-CT-044] 入庫実績帳票テーブルの削除処理を追加 2016.11.09 kawana Start
	@Inject
	private TStoreRecordRBhv tStoreRecordRBhv;
	// [#224][2.1.0-CT-044] 入庫実績帳票テーブルの削除処理を追加 2016.11.09 kawana End
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TInventoryInpHistBhv tInventoryInpHistBhv;
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	// [ON推-品向-1025] 在庫移動帳票テーブル追加により日次処理変更 2015.11.20 kawana Start
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	// [ON推-品向-1025] 在庫移動帳票テーブル追加により日次処理変更 2015.11.20 kawana End
	@Inject
	private HReceiveBBhv hReceiveBBhv;
	@Inject
	private HReceiveHBhv hReceiveHBhv;
	@Inject
	private HPackingBBhv hPackingBBhv;
	@Inject
	private HPackingHBhv hPackingHBhv;
	@Inject
	private HShippingBBhv hShippingBBhv;
	@Inject
	private HShippingHBhv hShippingHBhv;
	@Inject
	private HInventoryBBhv hInventoryBBhv;
	@Inject
	private HInventoryHBhv hInventoryHBhv;
	@Inject
	private HMoveBBhv hMoveBBhv;
	@Inject
	private HMoveHBhv hMoveHBhv;
	@Inject
	private HStockInoutBhv hStockInoutBhv;
	@Inject
	private HStockBhv hStockBhv;
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	@Inject
	private TKeepingLotBhv tKeepingLotBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TInventoryRBhv tInventoryRBhv;
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	@Inject
	private TLotBhv tLotBhv;
	@Inject
	private TStoreNoBhv tStoreNoBhv;
	// [ON推-品向-1026] 入庫No帳票テーブル追加により日次処理変更 2015.11.20 kawana Start
	@Inject
	private TStoreNoRBhv tStoreNoRBhv;
	// [ON推-品向-1026] 入庫No帳票テーブル追加により日次処理変更 2015.11.20 kawana End
	// [#2253]予備項目対応 2017.09.28 sampei Start
	@Inject
	private TReceivePlanSpareBhv tReceivePlanSpareBhv;
	@Inject
	private HShippingSpareBhv hShippingSpareBhv;
	@Inject
	private HReceiveSpareBhv hReceiveSpareBhv;
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	// [#2253]予備項目対応 2017.09.28 sampei End

	// ===== 使用ロジッククラス =====

	@Inject
	private DailyCommonLogic commonLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;
	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

	/** コントロールNo(順次処理用) */
	private Long controlNo = null;

	/** コントロールNo(移動用) */
	private Long controlNoMoved = null;

	/** コントロールNo(除外用) */
	private Long controlNoExclude = null;

	/** トランザクションIDと履歴IDのMAP **/
	private Map<Long, Long> hReceiveHMap;
	private Map<Long, Long> hShippingHMap;
	private Map<Long, Long> hShippingBMap;
	private Map<Long, Long> hPackingHMap;
	private Map<Long, Long> hMoveHMap;
	// [検査-135] 出荷ボディ履歴IDのMAP(hMoveBMap)削除 2014.11.27 kawana
	private Map<Long, Long> hInventoryHMap;

	/**
	 * <h2>履歴への移動処理を行う。</h2>
	 * <pre>
	 * 処理済データの履歴移動処理を行う。
	 * 【移動対象日の取得処理】を実行し、トランザクション保持期間を過ぎた処理済のトランザクションデータを履歴に移動する。
	 * 履歴に移動したトランザクションデータを削除し、外部キー参照がなくなった関連データを削除する。
	 * また、削除する引当ロット管理の内容を保管ロット管理に反映する。
	 *
	 * 【運用ログの開始処理】、【運用ログの終了処理】を使用しログを記録する。
	 *
	 * 【運用ログの開始処理】
	 * ・{@link DailyCommonLogic#startLogSection(String, String, String...) 運用ログの開始メソッド}を呼び出す。
	 *
	 * 【運用ログの終了処理】
	 * ・{@link DailyCommonLogic#endLogSection() 運用ログの終了メソッド}を呼び出す。
	 *
	 * 【移動対象日の取得処理】
	 * ・{@link DailyCommonLogic#getTargetDay(String, Long) 履歴移動対象日の設定メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID・センタID・前回システム管理日付（現在システム日付）
	 * @param param パラメータマスタ：トランザクション保持期間
	 */
	public void moveDataHistory(MClientCenter clientCenter, MParam param) {

		// 荷主ID
		final long clientId = clientCenter.getClientId();
		// センタID
		final long centerId = clientCenter.getCenterId();
		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// トランザクション保持期間
		final long keepingDays = param.getTKeepingDays();

		// [#1530] 対象日をログ出力 2017.04.19 kawana Start

		String hMoveDay = null;

		if (0 < keepingDays) {

			try {
				// 履歴移動対象日の設定
				hMoveDay = commonLogic.getTargetDay(systemDt, keepingDays);
			} catch (Exception e) {
				getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
			}
		}

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_MOVE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS
				, new String[] { commonLogic.getDateString(systemDt), String.valueOf(keepingDays), commonLogic.getDateString(hMoveDay) });

		// トランザクション保持期間のチェック
		if (keepingDays < 1) {
			// 0設定は履歴移動なし

			// 運用ログの終了
			commonLogic.endLogSection();
			// 処理終了
			return;
		}

		// [#1530] 対象日をログ出力 2017.04.19 kawana End

		// ===== 初期処理 =====
		hReceiveHMap = new HashMap<Long, Long>();
		hShippingHMap = new HashMap<Long, Long>();
		hShippingBMap = new HashMap<Long, Long>();
		hPackingHMap = new HashMap<Long, Long>();
		hMoveHMap = new HashMap<Long, Long>();
		// [検査-135] 出荷ボディ履歴IDのMAP(hMoveBMap)削除 2014.11.27 kawana
		hInventoryHMap = new HashMap<Long, Long>();

		// コントロールNo採番
		controlNo = numberingLogic.getControlNo();
		controlNoMoved = numberingLogic.getControlNo();
		controlNoExclude = numberingLogic.getControlNo();

		boolean preAutoDelFlg = this.getBehaviorAutoDelFlg();
		// 削除フラグの条件付加を停止
		this.setBehaviorAutoDelFlg(false);

		// ===== 入荷関連データの履歴移動 =====
		historyReceive(clientId, centerId, systemDt, hMoveDay);

		// ===== 出荷関連データの履歴移動 =====
		historyShipping(clientId, centerId, systemDt, hMoveDay);

		// ===== 在庫移動、棚卸関連データの履歴移動 =====
		historyMoveAndInventory(clientId, centerId, systemDt, hMoveDay);

		// ========================================================================================== ここから削除処理

		// ===== 入荷関連の移動データ削除 =====
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		deleteReceive(clientId, centerId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End

		// [新WMS-110-009] 別荷主の強制確定データが消えてしまう問題を修正 2015.07.15 kawana Start
		// ===== 出荷関連の移動データ削除 =====
		deleteShipping(clientId, centerId, hMoveDay);
		// [新WMS-110-009] 別荷主の強制確定データが消えてしまう問題を修正 2015.07.15 kawana End

		// ===== 在庫移動、棚卸関連の移動データ削除(削除前に保管ロット更新) =====
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		deleteMoveAndInventory(clientId, centerId, hMoveDay);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End

		// ===== 在庫受払、在庫関連の不要データ削除(削除前に在庫受払を履歴に移動) =====
		historyAndDeleteStock(clientId, centerId, systemDt, hMoveDay);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(preAutoDelFlg);

		// 運用ログの終了
		commonLogic.endLogSection();
	}

	/**
	 * 入荷関連のデータを履歴に移動する
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param systemDt 現在のシステム管理日付
	 * @param hMoveDay 移動対象日
	 */
	private void historyReceive(final long clientId, final long centerId, final String systemDt, String hMoveDay) {

		int countStoreH = 0;
		int countStoreB = 0;
		int countStock = 0;
		// [#2253]予備項目対応 2017.09.28 sampei Start
		int countStoreSpare = 0;
		// [#2253]予備項目対応 2017.09.28 sampei Start

		int countUpdateControlNo = 0;

		// 対象の入荷履歴が0件になるまで繰り返し
		while (true) {

			// ===== 入荷履歴データ作成対象にコントロールNoを設定 =====
			int updateCount = receive_updateControlNo(clientId, centerId, hMoveDay);

			// 0件の場合は処理終了
			if (updateCount == 0) {
				break;
			}
			// コントロールNo.設定件数を更新
			countUpdateControlNo = countUpdateControlNo + updateCount;

			// ===== 入荷履歴データの取得=====
			TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
			cb.setupSelect_TStoreRecordB();

			// [#2253]予備項目対応 2017.09.28 sampei Start
			//cb.setupSelect_TStoreRecordB().withTReceivePlanB();
			cb.setupSelect_TStoreRecordB().withTReceivePlanB().withTReceivePlanSpareAsOne();
			// [#2253]予備項目対応 2017.09.28 sampei End

			cb.setupSelect_TStoreRecordB().withMLocation();
			cb.setupSelect_TStoreRecordB().withTStoreRecordH();
			cb.setupSelect_TStoreRecordB().withTStoreRecordH().withTReceivePlanH();
			cb.setupSelect_TStoreRecordB().withTStoreRecordH().withMClient();
			cb.setupSelect_TStoreRecordB().withTStoreRecordH().withMCenter();
			cb.setupSelect_TStoreRecordB().withTStoreRecordH().withMCustomerBySupplierId();
			cb.setupSelect_TStoreRecordB().withTStoreRecordH().withMCustomerByDepositId();
			// 検索条件：コントロールNo
			cb.query().queryTStoreRecordB().setControlNo_Equal(controlNo);
			// [新WMS-113-001] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.12 kawana Start
			cb.query().queryTStoreRecordB().setStoreNum_NotEqual(WCC.ZERO);
			// [新WMS-113-001] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.12 kawana End

			// [ON推-品向-1195] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.06 kawana Start
			cb.query().queryTStoreRecordB().queryTStoreRecordH().addOrderBy_ReceivePlanHId_Asc();
			cb.query().queryTStoreRecordB().addOrderBy_ReceivePlanBId_Asc();
			cb.query().addOrderBy_StoreRecordBId_Asc();
			cb.query().addOrderBy_StockInoutId_Desc();
			// [ON推-品向-1195] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.06 kawana End

			// 検索実行
			List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(cb);

			// ===== 入荷履歴データ作成 =====

			List<Long> stockIdList = new ArrayList<Long>();
			// 一括登録用 入荷ボディ履歴リスト
			List<HReceiveB> hReceiveBListIns = new ArrayList<HReceiveB>();

			// [ON推-品向-1195] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.06 kawana Start
			Set<Long> bodyIdSet = new HashSet<Long>();
			// [ON推-品向-1195] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.06 kawana End

			// 在庫受払の件数分繰返
			for (TStockInout tStockInout : tStockInoutList) {

				// [ON推-品向-1195] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.06 kawana Start
				long bodyId = tStockInout.getStoreRecordBId();
				if (bodyIdSet.contains(bodyId)) {
					// 入庫実績ボディIDに紐づくデータが登録済の場合はスキップ
					continue;
				}
				bodyIdSet.add(bodyId);
				// [ON推-品向-1195] 入荷履歴の移動処理で件数不一致の致命的エラー発生 2016.09.06 kawana End

				// 入庫実績ヘッダIDに紐づく登録データが未登録の場合
				Long storeRecordHId = tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getStoreRecordHId();
				if (storeRecordHId != null &&
						hReceiveHMap.get(storeRecordHId) == null) {

					// 入荷ヘッダ履歴を生成
					HReceiveH hReceiveH = receive_newHReceiveH(tStockInout, systemDt);
					// データベースに登録実行
					hReceiveHBhv.insert(hReceiveH);
					// 履歴IDマップに保管
					hReceiveHMap.put(storeRecordHId, hReceiveH.getStoreRecordHId());

					// 件数をカウント
					countStoreH++;
				}

				// 入荷ボディ履歴を生成
				HReceiveB hReceiveB = receive_newHReceiveB(tStockInout, storeRecordHId);
				// 一括登録用 入荷ボディ履歴リストに追加
				hReceiveBListIns.add(hReceiveB);

				// 在庫IDリストに追加
				stockIdList.add(tStockInout.getStockId());
			}

			if (0 < hReceiveBListIns.size()) {

				// 入荷ボディ履歴の登録実行
				ReturnDto_insertHReceiveB result = receive_insertHReceiveB(stockIdList, hReceiveBListIns);
				countStock = countStock + result.stockInsertCount;
				countStoreB = countStoreB + result.receiveBInsertCount;
				// [#2253]予備項目対応 2017.09.28 sampei Start
				countStoreSpare = countStoreSpare + result.receiveSpareInsertCount;
				// [#2253]予備項目対応 2017.09.28 sampei End
			}

			// ===== 移動済のコントロールNoを設定 =====
			receive_updateControlNoMoved();
		}

		// ===== 入庫数 0 のデータ数をカウント =====
		TStoreRecordBCB noStoreCb = tStoreRecordBBhv.newMyConditionBean();

		noStoreCb.query().setControlNo_Equal(controlNoMoved);
		// 入庫数0
		noStoreCb.query().setStoreNum_Equal(WCC.ZERO);

		// 検索実行
		int countNoStore = tStoreRecordBBhv.selectCount(noStoreCb);

		// 入荷実績の更新(取得)件数と入荷履歴の登録件数が異なる場合
		if (countUpdateControlNo != (countStoreB + countNoStore)) {
			this.getErrorManager().throwException(new IllegalStateException());
		}

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hReceiveHBhv.asTableDbName().toUpperCase(), String.valueOf(countStoreH));

		if (0 < countStock) {
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockBhv.asTableDbName().toUpperCase(), String.valueOf(countStock));
		}

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hReceiveBBhv.asTableDbName().toUpperCase(), String.valueOf(countStoreB));

		// [#2253]予備項目対応 2017.09.28 sampei Start
		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hReceiveSpareBhv.asTableDbName().toUpperCase(), String.valueOf(countStoreSpare));
		// [#2253]予備項目対応 2017.09.28 sampei End
	}

	/**
	 * 入荷履歴データ作成対象のコントロールNo設定
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param hMoveDay 移動対象日
	 */
	private int receive_updateControlNo(long clientId, long centerId, String hMoveDay) {

		// 更新条件設定
		TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTStoreRecordH().setClientId_Equal(clientId);
		cb.query().queryTStoreRecordH().setCenterId_Equal(centerId);
		// 入荷ステータス : 入荷済
		cb.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveStatus_Equal_$03();
		cb.query().setStoreDt_LessEqual(hMoveDay);
		cb.query().setControlNo_IsNull();
		// 上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		cb.fetchFirst(getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT));
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		List<TStoreRecordB> list = tStoreRecordBBhv.selectList(cb);

		if (list.size() == 0) {
			return 0;
		}

		for (TStoreRecordB entity : list) {
			entity.setControlNo(controlNo);
		}

		// 更新実行
		int[] updNum = tStoreRecordBBhv.batchUpdate(list);

		return updNum.length;
	}

	/**
	 * 入荷ヘッダ履歴を生成
	 * @param tStockInout
	 * @param systemDt
	 * @return HReceiveH 入荷ヘッダ履歴
	 */
	private HReceiveH receive_newHReceiveH(TStockInout tStockInout, final String systemDt) {

		// 入荷ヘッダ履歴を作成
		HReceiveH hReceiveH = new HReceiveH();

		// 履歴日
		// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana Start
		hReceiveH.setHistDt(systemDt);
		// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana End
		// 荷主ID
		hReceiveH.setClientId(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getClientId());
		// 荷主CD
		hReceiveH.setClientCd(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMClient().getClientCd());
		// 荷主名称
		hReceiveH.setClientNm(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMClient().getClientNm());
		// センタID
		hReceiveH.setCenterId(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getCenterId());
		// センタCD
		hReceiveH.setCenterCd(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMCenter().getCenterCd());
		// センタ名称
		hReceiveH.setCenterNm(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMCenter().getCenterNm());
		// 処理区分ID
		hReceiveH.setProcessTypeId(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getProcessTypeId());
		// 入荷予定日
		hReceiveH.setReceivePlanDt(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseTReceivePlanH().getReceivePlanDt());
		// 顧客入荷指示No.
		hReceiveH.setClientReceiveNo(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getClientReceiveNo());
		// WMS入荷伝票No.
		hReceiveH.setReceiveSlipNo(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseTReceivePlanH().getReceiveSlipNo());
		// 仕入先ID
		hReceiveH.setSupplierId(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getSupplierId());
		// 仕入先CD
		hReceiveH.setSupplierCd(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMCustomerBySupplierId().getCustomerCd());
		// 仕入先名称
		hReceiveH.setSupplierNm(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMCustomerBySupplierId().getCustomerNm());
		// 預託ID
		hReceiveH.setDepositId(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().getDepositId());
		// 預託CD
		hReceiveH.setDepositCd(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMCustomerByDepositId().getCustomerCd());
		// 預託名称
		hReceiveH.setDepositNm(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseMCustomerByDepositId().getCustomerNm());
		// 入荷納品ステータス
		hReceiveH.setReceiveDeliveryStatus(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseTReceivePlanH().getReceiveDeliveryStatus());
		// 削除フラグ
		hReceiveH.setDelFlg(tStockInout.chaseTStoreRecordB().chaseTStoreRecordH().chaseTReceivePlanH().getDelFlg());

		return hReceiveH;
	}

	/**
	 * 入荷ボディ履歴の生成
	 * @param tStockInout
	 * @param storeRecordHId
	 * @return HReceiveB 入荷ボディ履歴
	 */
	private HReceiveB receive_newHReceiveB(TStockInout tStockInout, Long storeRecordHId) {

		// 入荷ボディ履歴の登録データを編集し
		HReceiveB hReceiveB = new HReceiveB();
		// [#2253]予備項目対応 2017.09.28 sampei Start
		HReceiveSpare hReceiveSpare = new HReceiveSpare();
		// [#2253]予備項目対応 2017.09.28 sampei End

		// 入庫実績ヘッダID
		hReceiveB.setStoreRecordHId(hReceiveHMap.get(storeRecordHId));
		// 在庫ID
		hReceiveB.setStockId(tStockInout.getStockId());
		// 予定数
		hReceiveB.setPlanNum(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().getPlanNum());
		// 処理No.
		hReceiveB.setProcessNo(tStockInout.chaseTStoreRecordB().getProcessNo());
		// 入庫日
		hReceiveB.setStoreDt(tStockInout.chaseTStoreRecordB().getStoreDt());
		// 入庫数
		hReceiveB.setStoreNum(tStockInout.chaseTStoreRecordB().getStoreNum());
		// 入庫格納フラグ
		hReceiveB.setStoreFlg(tStockInout.chaseTStoreRecordB().getStoreFlg());
		// 入庫格納ロケーションID
		hReceiveB.setStoreLocationId(tStockInout.chaseTStoreRecordB().getStoreLocationId());
		// 入庫格納ロケーションCD
		hReceiveB.setStoreLocationCd(tStockInout.chaseTStoreRecordB().chaseMLocation().getLocationCd());
		// 入庫格納ロケーション名称
		hReceiveB.setStoreLocationNm(tStockInout.chaseTStoreRecordB().chaseMLocation().getLocationNm());
		// 削除フラグ
		hReceiveB.setDelFlg(tStockInout.chaseTStoreRecordB().chaseMLocation().getDelFlg());
		// [#2253]予備項目対応 2017.09.28 sampei Start
		// 予備項目１（文字列）
		hReceiveSpare.setSpareStr1(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().chaseTReceivePlanSpareAsOne().getSpareStr1());
		// 予備項目２（文字列）
		hReceiveSpare.setSpareStr2(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().chaseTReceivePlanSpareAsOne().getSpareStr2());
		// 予備項目３（文字列）
		hReceiveSpare.setSpareStr3(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().chaseTReceivePlanSpareAsOne().getSpareStr3());
		// 予備項目１（数値）
		hReceiveSpare.setSpareNum1(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().chaseTReceivePlanSpareAsOne().getSpareNum1());
		// 予備項目２（数値）
		hReceiveSpare.setSpareNum2(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().chaseTReceivePlanSpareAsOne().getSpareNum2());
		// 予備項目３（数値）
		hReceiveSpare.setSpareNum3(tStockInout.chaseTStoreRecordB().chaseTReceivePlanB().chaseTReceivePlanSpareAsOne().getSpareNum3());
		// 入荷予備履歴
		hReceiveB.setHReceiveSpareAsOne(hReceiveSpare);
		// [#2253]予備項目対応 2017.09.28 sampei End
		return hReceiveB;
	}

	private class ReturnDto_insertHReceiveB {
		public int stockInsertCount;
		public int receiveBInsertCount;
		// [#2253]予備項目対応 2017.09.28 sampei Start
		public int receiveSpareInsertCount;
		// [#2253]予備項目対応 2017.09.28 sampei End
	}

	/**
	 * 入荷ボディ履歴の登録
	 *
	 * @param stockIdList
	 * @param receiveBList
	 */
	private ReturnDto_insertHReceiveB receive_insertHReceiveB(List<Long> stockIdList, List<HReceiveB> receiveBList) {

		// ===== 在庫履歴の登録 =====
		int stockCount = commonLogic.insertNotExistsHStock(stockIdList);

		// [#2253]予備項目対応 2017.09.28 sampei Start
		// ===== 入荷ボディ履歴の登録 =====
		//int[] receiveBCount = hReceiveBBhv.batchInsert(receiveBList);
		int receiveBCount = 0;
		for(HReceiveB receiveB : receiveBList){
			hReceiveBBhv.insert(receiveB);
			receiveBCount ++;
		}

		// 一括登録用 入荷予備履歴リスト
		List<HReceiveSpare> hReceiveSpareListIns = new ArrayList<HReceiveSpare>();
		// 入荷予備履歴登録件数
		int[] receiveSpareCount = new int[0];

		if(0 < receiveBCount){
			for(HReceiveB receiveB : receiveBList){
				HReceiveSpare hReceiveSpare = receive_newHReceiveSpare(receiveB);
				hReceiveSpareListIns.add(hReceiveSpare);
			}

			if(0 < hReceiveSpareListIns.size()){
				receiveSpareCount = hReceiveSpareBhv.batchInsert(hReceiveSpareListIns);
			}
		}
		// [#2253]予備項目対応 2017.09.28 sampei End

		// 戻り値の設定
		ReturnDto_insertHReceiveB result = new ReturnDto_insertHReceiveB();
		result.stockInsertCount = stockCount;
		result.receiveBInsertCount = receiveBCount;
		result.receiveSpareInsertCount = receiveSpareCount.length;

		return result;
	}


	// [#2253]予備項目対応 2017.09.28 sampei Start
	/**
	 * 入荷予備履歴の生成
	 * @param tStockInout
	 * @param storeRecordHId
	 * @return HReceiveSpare 入荷予備履歴
	 */
	private HReceiveSpare receive_newHReceiveSpare( HReceiveB hReceiveB) {

		// 入荷予備履歴の登録データを編集
		HReceiveSpare hReceiveSpare = new HReceiveSpare();

		// 入庫実績ボディID
		hReceiveSpare.setStoreRecordBId(hReceiveB.getStoreRecordBId());
		if(hReceiveB.getHReceiveSpareAsOne() != null){
			// 予備項目１（文字列）
			hReceiveSpare.setSpareStr1(hReceiveB.getHReceiveSpareAsOne().getSpareStr1());
			// 予備項目２（文字列）
			hReceiveSpare.setSpareStr2(hReceiveB.getHReceiveSpareAsOne().getSpareStr2());
			// 予備項目３（文字列）
			hReceiveSpare.setSpareStr3(hReceiveB.getHReceiveSpareAsOne().getSpareStr3());
			// 予備項目１（数値）
			hReceiveSpare.setSpareNum1(hReceiveB.getHReceiveSpareAsOne().getSpareNum1());
			// 予備項目２（数値）
			hReceiveSpare.setSpareNum2(hReceiveB.getHReceiveSpareAsOne().getSpareNum2());
			// 予備項目３（数値）
			hReceiveSpare.setSpareNum3(hReceiveB.getHReceiveSpareAsOne().getSpareNum3());
			// 削除フラグ
			hReceiveSpare.setDelFlg(hReceiveB.getHReceiveSpareAsOne().getDelFlg());
		}

		return hReceiveSpare;
	}
	// [#2253]予備項目対応 2017.09.28 sampei End

	/**
	 * 入荷履歴データ作成対象に移動済のコントロールNoを設定
	 */
	private void receive_updateControlNoMoved() {

		// 更新用データ編集
		TStoreRecordB tStoreRecordB = new TStoreRecordB();
		// コントロールNo(移動済)
		tStoreRecordB.setControlNo(controlNoMoved);

		// 更新条件設定
		TStoreRecordBCB cb = tStoreRecordBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tStoreRecordBBhv, tStoreRecordB, cb, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	/**
	 * 出荷関連のデータを履歴に移動する
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param systemDt 現在のシステム管理日付
	 * @param hMoveDay 移動対象日
	 */
	private void historyShipping(final long clientId, final long centerId, final String systemDt, String hMoveDay) {

		int countShippingH = 0;
		int countShippingB = 0;
		// [#2253]予備項目対応 2017.09.28 sampei Start
		int countShippingSpare = 0;
		// [#2253]予備項目対応 2017.09.28 sampei End
		int countPackingH = 0;
		int countStockH = 0;
		int countPackingB = 0;

		int countUpdateControlNo = 0;

		// ===== 出荷履歴への移動(強制確定以外) =====

		// 対象の梱包ボディが0件になるまで繰り返し
		while (true) {

			// ===== 出荷履歴データ作成対象にコントロールNoを設定 =====
			int updateCount = shipping_updateControlNo(clientId, centerId, hMoveDay);

			// 0件の場合は処理終了
			if (updateCount == 0) {
				break;
			}
			// コントロールNo.設定件数を更新
			countUpdateControlNo = countUpdateControlNo + updateCount;

			// ===== 出荷履歴データの取得=====
			TPackingBCB cb = tPackingBBhv.newMyConditionBean();
			cb.setupSelect_TPickingB();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更(在庫受払の結合削除) 2016.02.15 kawana
			cb.setupSelect_TPackingH();
			// [#2253]予備項目対応 2017.09.28 sampei Start
			//cb.setupSelect_TPickingB().withTShippingInstB();
			cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstSpareAsOne();
			// [#2253]予備項目対応 2017.09.28 sampei End
			cb.setupSelect_TPackingH().withMBox();
			cb.setupSelect_TPickingB().withTShippingInstB().withMWarehouse();
			cb.setupSelect_TPickingB().withTShippingInstB().withMProduct();
			cb.setupSelect_TPickingB().withTShippingInstB().withMLocation();
			cb.setupSelect_TPickingB().withTShippingInstB().withMCustomer();
			cb.setupSelect_TPickingB().withTShippingInstB().withMShape();
			cb.setupSelect_TPickingB().withTShippingInstB().withMShape().withVDictByShapeDictId(getCultureId());
			cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH();
			cb.setupSelect_TPickingB().withTPickingH();
			cb.setupSelect_TPickingB().withTPickingH().withMClient();
			cb.setupSelect_TPickingB().withTPickingH().withMCenter();
			cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH().withMDeliveryCourse();
			cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH().withMDeliveryCourse().withMCarrier();
			// 検索条件 : コントロールNo
			cb.query().setControlNo_Equal(controlNo);

			// 検索実行
			List<TPackingB> tPackingBList = tPackingBBhv.selectList(cb);

			// ===== 出荷履歴データ作成 =====

			List<Long> stockIdList = new ArrayList<Long>();

			// 一括登録用 梱包ボディ履歴リスト
			List<HPackingB> hPackingBListIns = new ArrayList<HPackingB>();

			// 梱包ボディの件数分繰返
			for (TPackingB packingB : tPackingBList) {

				// ===== 出荷指示ヘッダ履歴の登録 =====

				// 出荷指示ヘッダIDに紐づく登録データが未登録の場合
				Long shippingInstHId = packingB.chaseTPickingB().chaseTShippingInstB().getShippingInstHId();
				if (shippingInstHId != null &&
						hShippingHMap.get(shippingInstHId) == null) {

					// 出荷ヘッダ履歴を生成
					HShippingH hShippingH = shipping_newHShippingH(packingB.chaseTPickingB(), systemDt);
					// データベースに登録実行
					hShippingHBhv.insert(hShippingH);

					// 履歴IDマップに登録
					hShippingHMap.put(shippingInstHId, hShippingH.getShippingInstHId());
					// 件数をカウント
					countShippingH++;
				}

				// ===== 出荷指示ボディ履歴の登録 =====

				// 出荷指示ボディIDに紐づく登録データが未登録の場合
				Long shippingInstBId = packingB.chaseTPickingB().getShippingInstBId();
				if (shippingInstBId != null &&
						hShippingBMap.get(shippingInstBId) == null) {

					// 出荷ボディ履歴を生成
					HShippingB hShippingB = shipping_newHShippingB(packingB.chaseTPickingB(), shippingInstHId);
					// データベースに登録実行
					hShippingBBhv.insert(hShippingB);

					// 履歴IDマップに登録
					hShippingBMap.put(shippingInstBId, hShippingB.getShippingInstBId());
					// 件数をカウント
					countShippingB++;

					// [#2253]予備項目対応 2017.09.28 sampei Start
					// 出荷予備履歴を生成
					HShippingSpare hShippingSpare = shipping_newHShippingSapre(hShippingB);
					// データベースに登録
					hShippingSpareBhv.insert(hShippingSpare);
					//登録件数をカウント
					countShippingSpare++;
					// [#2253]予備項目対応 2017.09.28 sampei End

				}

				// ===== 梱包ヘッダ履歴の登録 =====

				// 梱包ヘッダIDに紐づく登録データが未登録の場合
				Long packingHId = packingB.getPackingHId();
				if (packingHId != null &&
						hPackingHMap.get(packingHId) == null) {

					// 梱包ヘッダ履歴生成
					HPackingH hPackingH = shipping_newHPackingH(packingB, shippingInstHId);
					// データベースに登録実行
					hPackingHBhv.insert(hPackingH);

					// 履歴IDマップに登録
					hPackingHMap.put(packingHId, hPackingH.getPackingHId());
					// 件数をカウント
					countPackingH++;
				}

				// ===== 梱包ボディ履歴の登録 =====

				// 梱包ボディ履歴生成
				HPackingB hPackingB = shipping_newHPackingB(packingB, packingHId, shippingInstBId);

				// 一括登録用 梱包ボディ履歴リストに追加
				hPackingBListIns.add(hPackingB);

				// 在庫IDリストに追加
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				stockIdList.add(packingB.chaseTPickingB().getStockId());
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			}

			if (0 < hPackingBListIns.size()) {

				// 梱包ボディ履歴の登録実行
				ReturnDto_insertPackingB result = insertPackingB(stockIdList, hPackingBListIns);
				countStockH = countStockH + result.stockInsertCount;
				countPackingB = countPackingB + result.packingBInsertCount;
			}

			// ===== 移動済のコントロールNoを設定 =====
			shipping_updateControlNoMoved();
		}

		// [ON推-品向-1151] 出荷データの強制確定用の処理を削除 2016.04.26 kawana

		// 運用ログ追加(出荷ヘッダ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hShippingHBhv.asTableDbName().toUpperCase(), String.valueOf(countShippingH));

		// 運用ログ追加(出荷ボディ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hShippingBBhv.asTableDbName().toUpperCase(), String.valueOf(countShippingB));

		// [#2253]予備項目対応 2017.09.28 sampei Start
		// 運用ログ追加(出荷予備履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hShippingSpareBhv.asTableDbName().toUpperCase(), String.valueOf(countShippingSpare));
		// [#2253]予備項目対応 2017.09.28 sampei End

		// 運用ログ追加(梱包ヘッダ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hPackingHBhv.asTableDbName().toUpperCase(), String.valueOf(countPackingH));

		if (0 < countStockH) {
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockBhv.asTableDbName().toUpperCase(), String.valueOf(countStockH));
		}

		// 運用ログ追加(梱包ボディ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hPackingBBhv.asTableDbName().toUpperCase(), String.valueOf(countPackingB));
	}

	/**
	 * 出荷履歴データ作成対象のコントロールNo設定
	 *
	 * @param clientId
	 * @param centerId
	 * @param hMoveDay
	 */
	private int shipping_updateControlNo(long clientId, long centerId, String hMoveDay) {

		// 更新条件設定
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPickingB().queryTPickingH().setClientId_Equal(clientId);
		cb.query().queryTPickingB().queryTPickingH().setCenterId_Equal(centerId);
		// 出荷ステータス：出荷確定済
		cb.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().setShippingStatus_Equal_$55();
		cb.query().queryTPickingB().queryTPickingH().setShippingFixedDt_LessEqual(hMoveDay);
		cb.query().setControlNo_IsNull();
		// 上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		cb.fetchFirst(getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT));
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		List<TPackingB> list = tPackingBBhv.selectList(cb);

		if (list.size() == 0) {
			return 0;
		}

		for (TPackingB entity : list) {
			entity.setControlNo(controlNo);
		}

		// 更新実行
		int[] updNum = tPackingBBhv.batchUpdate(list);

		return updNum.length;
	}

	/**
	 * 出荷ヘッダ履歴を生成
	 *
	 * @param pickingB
	 * @param systemDt
	 */
	private HShippingH shipping_newHShippingH(TPickingB pickingB, final String systemDt) {

		// 出荷ヘッダ履歴の登録データを編集
		HShippingH hShippingH = new HShippingH();

		// 履歴日
		// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana Start
		hShippingH.setHistDt(systemDt);
		// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana End
		// 荷主ID
		hShippingH.setClientId(pickingB.chaseTPickingH().getClientId());
		// [検査-130] 出荷ヘッダ履歴のデータ間違いを修正 2014.11.27 kawana Start
		// 荷主CD
		hShippingH.setClientCd(pickingB.chaseTPickingH().chaseMClient().getClientCd());
		// 荷主名称
		hShippingH.setClientNm(pickingB.chaseTPickingH().chaseMClient().getClientNm());
		// [検査-130] 出荷ヘッダ履歴のデータ間違いを修正 2014.11.27 kawana End
		// センタID
		hShippingH.setCenterId(pickingB.chaseTPickingH().getCenterId());
		// センタCD
		hShippingH.setCenterCd(pickingB.chaseTPickingH().chaseMCenter().getCenterCd());
		// センタ名称
		hShippingH.setCenterNm(pickingB.chaseTPickingH().chaseMCenter().getCenterNm());
		// 処理区分ID
		hShippingH.setProcessTypeId(pickingB.chaseTPickingH().getProcessTypeId());
		// 指示日
		hShippingH.setWorkDt(pickingB.chaseTShippingInstB().chaseTShippingInstH().getWorkDt());
		// 納品予定日
		hShippingH.setDelivPlanDt(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivPlanDt());
		// 納品指定日
		hShippingH.setDelivDt(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivDt());
		// 納品時間帯
		hShippingH.setDelivTz(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivTz());
		// 出荷日
		hShippingH.setShippingDt(pickingB.chaseTShippingInstB().chaseTShippingInstH().getShippingDt());
		// 顧客出荷指示No.
		hShippingH.setClientShippingNo(pickingB.chaseTShippingInstB().chaseTShippingInstH().getClientShippingNo());
		// [検査-130] 出荷ヘッダ履歴のデータ間違いを修正 2014.11.27 kawana Start
		// WMS出荷伝票No.
		hShippingH.setShippingSlipNo(pickingB.chaseTShippingInstB().chaseTShippingInstH().getShippingSlipNo());
		// [検査-130] 出荷ヘッダ履歴のデータ間違いを修正 2014.11.27 kawana End
		// 納品先ID
		hShippingH.setSupplyCustomerId(pickingB.chaseTShippingInstB().chaseTShippingInstH().getSupplyCustomerId());
		// 納品先CD
		hShippingH.setSupplyCustomerCd(pickingB.chaseTShippingInstB().chaseTShippingInstH().getSupplyCustomerCd());
		// 納品先名称
		hShippingH.setSupplyCustomerNm(pickingB.chaseTShippingInstB().chaseTShippingInstH().getSupplyCustomerNm());
		// 届先ID
		hShippingH.setDelivCustomerId(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivCustomerId());
		// 届先CD
		hShippingH.setDelivCustomerCd(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivCustomerCd());
		// 届先郵便番号
		hShippingH.setDelivZipCd(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivZipCd());
		// 届先住所1
		hShippingH.setDelivAddress1(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivAddress1());
		// 届先住所2
		hShippingH.setDelivAddress2(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivAddress2());
		// 届先住所3
		hShippingH.setDelivAddress3(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivAddress3());
		// 届先住所補足
		hShippingH.setDelivAddressSupply(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivAddressSupply());
		// 届先名称
		hShippingH.setDelivCustomerNm(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivCustomerNm());
		// 届先電話番号
		hShippingH.setDelivTelNo(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelivTelNo());
		// 配送コースID
		hShippingH.setDeliveryCourseId(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDeliveryCourseId());
		// 配送コースCD
		hShippingH.setDeliveryCourseCd(pickingB.chaseTShippingInstB().chaseTShippingInstH().chaseMDeliveryCourse().getDeliveryCourseCd());
		// 配送コース名称
		hShippingH.setDeliveryCourseNm(pickingB.chaseTShippingInstB().chaseTShippingInstH().chaseMDeliveryCourse().getDeliveryCourseNm());
		// 運送業者ID
		hShippingH.setCarrierId(pickingB.chaseTShippingInstB().chaseTShippingInstH().chaseMDeliveryCourse().getCarrierId());
		// 運送業者CD
		hShippingH.setCarrierCd(pickingB.chaseTShippingInstB().chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrier().getCarrierCd());
		// 運送業者名称
		hShippingH.setCarrierNm(pickingB.chaseTShippingInstB().chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrier().getCarrierNm());
		// 緊急フラグ
		hShippingH.setEmergencyFlg(pickingB.chaseTShippingInstB().chaseTShippingInstH().getEmergencyFlg());
		// 出庫作業メッセージ
		hShippingH.setPickingWorkMessage(pickingB.chaseTShippingInstB().chaseTShippingInstH().getPickingWorkMessage());
		// [#2252]金額項目の追加 2017.09.29 sampei Start
		// 合計金額
		hShippingH.setTotalPrice(pickingB.chaseTShippingInstB().chaseTShippingInstH().getTotalPrice());
		// 合計消費税
		hShippingH.setTotalTax(pickingB.chaseTShippingInstB().chaseTShippingInstH().getTotalTax());
		//[#2252]金額項目の追加 2017.09.29 sampei End
		// 削除フラグ
		hShippingH.setDelFlg(pickingB.chaseTShippingInstB().chaseTShippingInstH().getDelFlg());

		return hShippingH;
	}

	/**
	 * 出荷ボディ履歴を生成
	 *
	 * @param pickingB
	 * @param shippingInstHId
	 */
	private HShippingB shipping_newHShippingB(TPickingB pickingB, Long shippingInstHId) {

		// 出荷ボディ履歴の登録データを編集
		HShippingB hShippingB = new HShippingB();
		// [#2253]予備項目対応 2017.09.28 sampei Start
		HShippingSpare hShippingSpare = new HShippingSpare();
		// [#2253]予備項目対応 2017.09.28 sampei End

		// 出荷指示ヘッダID
		hShippingB.setShippingInstHId(hShippingHMap.get(shippingInstHId));
		// 行No.
		hShippingB.setLineNo(pickingB.chaseTShippingInstB().getLineNo());
		// 指定倉庫ID
		hShippingB.setWarehouseId(pickingB.chaseTShippingInstB().getWarehouseId());
		// 指定倉庫CD
		hShippingB.setWarehouseCd(pickingB.chaseTShippingInstB().getWarehouseCd());
		// 指定倉庫名称
		hShippingB.setWarehouseNm(pickingB.chaseTShippingInstB().chaseMWarehouse().getWarehouseNm());
		// 商品ID
		hShippingB.setProductId(pickingB.chaseTShippingInstB().getProductId());
		// 商品CD
		hShippingB.setProductCd(pickingB.chaseTShippingInstB().getProductCd());
		// 商品名称
		hShippingB.setProductNm(pickingB.chaseTShippingInstB().chaseMProduct().getProductNm());
		// 在庫区分ID
		hShippingB.setStockTypeId(pickingB.chaseTShippingInstB().getStockTypeId());
		// 指定ロケーションID
		hShippingB.setLocationId(pickingB.chaseTShippingInstB().getLocationId());
		// 指定ロケーションCD
		hShippingB.setLocationCd(pickingB.chaseTShippingInstB().getLocationCd());
		// 指定ロケーション名称
		hShippingB.setLocationNm(pickingB.chaseTShippingInstB().chaseMLocation().getLocationNm());
		// 指定預託ID
		hShippingB.setDepositId(pickingB.chaseTShippingInstB().getDepositId());
		// 指定預託CD
		hShippingB.setDepositCd(pickingB.chaseTShippingInstB().getDepositCd());
		// 指定預託名称
		hShippingB.setDepositNm(pickingB.chaseTShippingInstB().chaseMCustomer().getCustomerNm());
		// 指定ロットID
		hShippingB.setLotId(pickingB.chaseTShippingInstB().getLotId());
		// 指定ロット
		hShippingB.setLot(pickingB.chaseTShippingInstB().getLot());
		// 指定期限日
		hShippingB.setLimitDt(pickingB.chaseTShippingInstB().getLimitDt());
		// 指定入庫No.ID
		hShippingB.setStoreNoId(pickingB.chaseTShippingInstB().getStoreNoId());
		// 指定入庫ラベルNo.
		hShippingB.setStoreLabelNo(pickingB.chaseTShippingInstB().getStoreLabelNo());
		// 指定荷姿ID
		hShippingB.setShapeId(pickingB.chaseTShippingInstB().getShapeId());
		// 指定荷姿CD
		hShippingB.setShapeCd(pickingB.chaseTShippingInstB().getShapeCd());
		// 指定荷姿名称
		hShippingB.setShapeNm(pickingB.chaseTShippingInstB().chaseMShape().chaseVDictByShapeDictId().getDictNm());
		// 指定入数
		hShippingB.setUnitNum(pickingB.chaseTShippingInstB().getUnitNum());
		// 指示数
		hShippingB.setInstNum(pickingB.chaseTShippingInstB().getInstNum());
		// [#4494] 出荷数が少なく登録される不具合を修正 2018.04.23 kawana Start
		// 出荷数
		hShippingB.setShippingNum(pickingB.chaseTShippingInstB().getAllocNum());
		// [#4494] 出荷数が少なく登録される不具合を修正 2018.04.23 kawana End
		// 削除フラグ
		hShippingB.setDelFlg(pickingB.getDelFlg());
		// [#2252]金額項目の追加 2017.09.29 sampei Start
		// 単価
		hShippingB.setUnitPrice(pickingB.chaseTShippingInstB().getUnitPrice());
		// 金額
		hShippingB.setPrice(pickingB.chaseTShippingInstB().getPrice());
		// 消費税
		hShippingB.setTax(pickingB.chaseTShippingInstB().getTax());
		//[#2252]金額項目の追加 2017.09.29 sampei End
		// [#2253]予備項目対応 2017.09.28 sampei Start
		// 予備項目１（文字列）
		hShippingSpare.setSpareStr1(pickingB.chaseTShippingInstB().getTShippingInstSpareAsOne().getSpareStr1());
		// 予備項目２（文字列）
		hShippingSpare.setSpareStr2(pickingB.chaseTShippingInstB().getTShippingInstSpareAsOne().getSpareStr2());
		// 予備項目３（文字列）
		hShippingSpare.setSpareStr3(pickingB.chaseTShippingInstB().getTShippingInstSpareAsOne().getSpareStr3());
		// 予備項目１（数値）
		hShippingSpare.setSpareNum1(pickingB.chaseTShippingInstB().getTShippingInstSpareAsOne().getSpareNum1());
		// 予備項目２（数値）
		hShippingSpare.setSpareNum2(pickingB.chaseTShippingInstB().getTShippingInstSpareAsOne().getSpareNum2());
		// 予備項目３（数値）
		hShippingSpare.setSpareNum3(pickingB.chaseTShippingInstB().getTShippingInstSpareAsOne().getSpareNum3());
		// 出荷予備履歴
		hShippingB.setHShippingSpareAsOne(hShippingSpare);
		// [#2253]予備項目対応 2017.09.28 sampei End

		return hShippingB;
	}

	// [#2253]予備項目対応 2017.09.28 sampei Start
	/**
	 * 出荷予備履歴を生成
	 *
	 * @param HShippingB
	 */
	private HShippingSpare shipping_newHShippingSapre(HShippingB hShippingB) {

		// 出荷ボディ履歴の登録データを編集
		HShippingSpare hShippingSpare = new HShippingSpare();

		// 出荷指示ボディID
		hShippingSpare.setShippingInstBId(hShippingB.getShippingInstBId());
		if(hShippingB.getHShippingSpareAsOne() != null){
			// 予備項目１（文字列）
			hShippingSpare.setSpareStr1(hShippingB.getHShippingSpareAsOne().getSpareStr1());
			// 予備項目２（文字列）
			hShippingSpare.setSpareStr2(hShippingB.getHShippingSpareAsOne().getSpareStr2());
			// 予備項目３（文字列）
			hShippingSpare.setSpareStr3(hShippingB.getHShippingSpareAsOne().getSpareStr3());
			// 予備項目１（数値）
			hShippingSpare.setSpareNum1(hShippingB.getHShippingSpareAsOne().getSpareNum1());
			// 予備項目２（数値）
			hShippingSpare.setSpareNum2(hShippingB.getHShippingSpareAsOne().getSpareNum2());
			// 予備項目３（数値）
			hShippingSpare.setSpareNum3(hShippingB.getHShippingSpareAsOne().getSpareNum3());
			// 削除フラグ
			hShippingSpare.setDelFlg(hShippingB.getHShippingSpareAsOne().getDelFlg());
		}
		return hShippingSpare;
	}
	// [#2253]予備項目対応 2017.09.28 sampei End

	private HPackingH shipping_newHPackingH(TPackingB packingB, Long shippingInstHId) {
		// 梱包ヘッダ履歴の登録データを編集し
		HPackingH hPackingH = new HPackingH();

		// 出荷指示ヘッダID
		hPackingH.setShippingInstHId(hShippingHMap.get(shippingInstHId));
		// 処理区分ID
		hPackingH.setProcessTypeId(packingB.chaseTPackingH().getProcessTypeId());
		// 貨物追跡No.
		hPackingH.setCarrierTraceNum(packingB.chaseTPackingH().getCarrierTraceNum());
		// 荷材ID
		hPackingH.setBoxId(packingB.chaseTPackingH().getBoxId());
		// 荷材CD
		hPackingH.setBoxCd(packingB.chaseTPackingH().chaseMBox().getBoxCd());
		// 荷材名称
		hPackingH.setBoxNm(packingB.chaseTPackingH().chaseMBox().getBoxNm());
		// 総重量(g)
		hPackingH.setGrossWeight(packingB.chaseTPackingH().getGrossWeight());
		// 総容積(mm3)
		hPackingH.setTotalVolume(packingB.chaseTPackingH().getTotalVolume());
		// 削除フラグ
		hPackingH.setDelFlg(packingB.chaseTPackingH().getDelFlg());
		return hPackingH;
	}

	private HPackingB shipping_newHPackingB(TPackingB packingB, Long packingHId, Long shippingInstBId) {
		// 梱包ボディ履歴の登録データを編集
		HPackingB hPackingB = new HPackingB();

		// 梱包ヘッダID
		hPackingB.setPackingHId(hPackingHMap.get(packingHId));
		// 出荷指示ボディID
		hPackingB.setShippingInstBId(hShippingBMap.get(shippingInstBId));
		// 在庫ID
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		hPackingB.setStockId(packingB.chaseTPickingB().getStockId());
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// 梱包数
		hPackingB.setPackingNum(packingB.getPackingNum());
		// 削除フラグ
		hPackingB.setDelFlg(packingB.getDelFlg());
		return hPackingB;
	}

	private class ReturnDto_insertPackingB {
		public int stockInsertCount;
		public int packingBInsertCount;
	}

	/**
	 * 梱包ボディ履歴の登録
	 *
	 * @param stockIdList
	 * @param packingBList
	 */
	private ReturnDto_insertPackingB insertPackingB(List<Long> stockIdList, List<HPackingB> packingBList) {

		// ===== 在庫履歴の登録 =====
		int stockCount = commonLogic.insertNotExistsHStock(stockIdList);

		// ===== 梱包ボディ履歴の登録 =====
		int[] packingBCount = hPackingBBhv.batchInsert(packingBList);

		// 戻り値の設定
		ReturnDto_insertPackingB result = new ReturnDto_insertPackingB();
		result.stockInsertCount = stockCount;
		result.packingBInsertCount = packingBCount.length;

		return result;
	}

	private void shipping_updateControlNoMoved() {
		// 更新用データ編集
		TPackingB entity = new TPackingB();
		// コントロールNo(移動済)
		entity.setControlNo(controlNoMoved);

		// 更新条件設定
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tPackingBBhv, entity, cb, queryUpdateSettingsLogic.getQuerySetter(tPackingBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	// [ON推-品向-1151] 出荷データの強制確定用の処理を削除 2016.04.26 kawana

	/**
	 * 在庫移動、棚卸関連のデータを履歴に移動する
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param systemDt 現在のシステム管理日付
	 * @param hMoveDay 移動対象日
	 */
	private void historyMoveAndInventory(final long clientId, final long centerId, final String systemDt, String hMoveDay) {

		// 登録件数
		int countMoveH = 0;
		int countStockH = 0;
		int countMoveB = 0;
		int countInventoryH = 0;
		int countInventoryB = 0;

		// ===== 在庫移動履歴データ作成 =====

		// 作成対象が0件になるまで繰り返し
		while (true) {

			// ===== 在庫移動履歴データ作成対象にコントロールNoを設定 =====
			int count = move_updateControlNo(clientId, centerId, hMoveDay);

			if (count == 0) {
				// 対象なし - whileループを抜ける

				break;
			}

			// ===== 在庫移動履歴データ作成 =====
			ReturnDto_insertMove moveInsertReturnDto = insertMove(systemDt);

			// 件数をカウント
			countMoveH = countMoveH + moveInsertReturnDto.headerInsertCount;
			countMoveB = countMoveB + moveInsertReturnDto.bodyInsertCount;
			countStockH = countStockH + moveInsertReturnDto.stockInsertCount;

			// ===== 移動済のコントロールNoを設定 =====
			move_updateControlNoMoved();
		}

		// ===== 棚卸履歴データ作成 =====

		// 作成対象が0件になるまで繰り返し
		while (true) {

			// =====  棚卸履歴データ作成対象にコントロールNoを設定 =====
			int count = inventory_updateControlNo(clientId, centerId, hMoveDay);

			if (count == 0) {
				// 対象なし - whileループを抜ける

				break;
			}

			// ===== 棚卸履歴データ作成対象の取得 =====
			// 検索条件
			TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
			cb.setupSelect_MWarehouse();
			cb.setupSelect_MProduct();
			cb.setupSelect_MLocation();
			cb.setupSelect_MCustomerByDepositId();
			cb.setupSelect_TStoreNo();
			cb.setupSelect_TStoreNo().withMCustomer();
			cb.setupSelect_TInventoryH().withMClient();
			cb.setupSelect_TInventoryH().withMCenter();
			// 検索条件 : コントロールNo
			cb.query().setControlNo_Equal(controlNo);

			// 検索実行
			List<TInventoryB> tInventoryBList = tInventoryBBhv.selectList(cb);

			List<Long> stockIdList = new ArrayList<Long>();
			List<HInventoryB> hInventoryBListIns = new ArrayList<HInventoryB>();

			// 棚卸ボディの件数分繰返
			for (TInventoryB tInventoryB : tInventoryBList) {

				// ===== 在庫移動指示ヘッダ履歴の登録 =====

				//  在庫移動指示ヘッダIDに紐づく登録データが未登録の場合
				Long moveInstHId = tInventoryB.getMoveInstHId();
				if (moveInstHId != null &&
						hMoveHMap.get(moveInstHId) == null) {

					// 在庫移動の作成対象にコントロールNoを設定
					int moveCount = move_updateControlNo(moveInstHId);

					if (moveCount == 0) {
						// 棚卸ボディが作成できないため除外

						// ===== 除外のコントロールNoを設定 =====
						inventory_updateControlNoExclude();
						continue;
					}

					// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana Start
					// 履歴データ移動処理_在庫移動メソッドを呼出
					ReturnDto_insertMove returnDto = insertMove(systemDt);
					// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana End

					countMoveH = countMoveH + returnDto.headerInsertCount;
					countMoveB = countMoveB + returnDto.bodyInsertCount;
					countStockH = countStockH + returnDto.stockInsertCount;

					// ===== 移動済のコントロールNoを設定 =====
					move_updateControlNoMoved();
				}

				// ===== 棚卸ヘッダ履歴の登録 =====

				//  棚卸ヘッダIDに紐づく登録データが未登録の場合
				Long inventoryHId = tInventoryB.chaseTInventoryH().getInventoryHId();
				if (inventoryHId != null &&
						hInventoryHMap.get(inventoryHId) == null) {

					// 棚卸ヘッダ履歴作成
					HInventoryH hInventoryH = inventory_newHInventoryH(tInventoryB, systemDt);

					// データベースに登録実行
					hInventoryHBhv.insert(hInventoryH);

					// 履歴IDマップに登録
					hInventoryHMap.put(inventoryHId, hInventoryH.getInventoryHId());

					// 件数をカウント
					countInventoryH++;
				}

				// ===== 棚卸ボディ履歴の作成 =====
				HInventoryB hInventoryB = inventory_newHInventoryB(tInventoryB, inventoryHId, moveInstHId);

				// 一括登録用 棚卸ボディ履歴リストに追加
				hInventoryBListIns.add(hInventoryB);

				// 在庫IDリストに追加
				stockIdList.add(tInventoryB.getStockId());
			}

			if (0 < hInventoryBListIns.size()) {

				// 棚卸ボディ履歴の登録実行
				ReturnDto_insertInventoryB result = insertInventoryB(stockIdList, hInventoryBListIns);
				countStockH = countStockH + result.stockInsertCount;
				countInventoryB = countInventoryB + result.inventoryBInsertCount;
			}

			// ===== 移動済のコントロールNoを設定 =====
			inventory_updateControlNoMoved();
		}

		// ===== 除外のコントロールNoをクリア =====
		inventory_clearControlNoExclude();

		// 運用ログ追加(在庫移動ヘッダ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hMoveHBhv.asTableDbName().toUpperCase(), String.valueOf(countMoveH));

		if (0 < countStockH) {
			// 運用ログ追加(在庫履歴)
			commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockBhv.asTableDbName().toUpperCase(), String.valueOf(countStockH));
		}

		// 運用ログ追加(在庫移動ボディ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hMoveBBhv.asTableDbName().toUpperCase(), String.valueOf(countMoveB));

		// 運用ログ追加(棚卸ヘッダ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hInventoryHBhv.asTableDbName().toUpperCase(), String.valueOf(countInventoryH));

		// 運用ログ追加(棚卸ボディ履歴)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hInventoryBBhv.asTableDbName().toUpperCase(), String.valueOf(countInventoryB));
	}

	private int move_updateControlNo(final long clientId, final long centerId, String hMoveDay) {

		// 検索条件
		TMoveRecordBCB tMoveRecordBCB = tMoveRecordBBhv.newMyConditionBean();
		// 荷主ID
		tMoveRecordBCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tMoveRecordBCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		// 移動日
		tMoveRecordBCB.query().setMoveDt_LessEqual(hMoveDay);
		// 在庫移動指示ステータス
		tMoveRecordBCB.query().queryTMoveInstH().setMoveInstStatus_Equal_$02();

		// 検索条件
		// コントロールNo
		tMoveRecordBCB.query().setControlNo_IsNull();
		// 上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		tMoveRecordBCB.fetchFirst(getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT));
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		// 検索実行
		List<TMoveRecordB> list = tMoveRecordBBhv.selectList(tMoveRecordBCB);

		if (list.size() == 0) {
			return 0;
		}

		for (TMoveRecordB entity : list) {
			entity.setControlNo(controlNo);
		}

		// 更新実行
		int[] updateCount = tMoveRecordBBhv.batchUpdate(list);

		return updateCount.length;
	}

	private class ReturnDto_insertMove {
		public int headerInsertCount;
		public int bodyInsertCount;
		public int stockInsertCount;
	}

	private ReturnDto_insertMove insertMove(String systemDt) {

		// ===== 作成対象の取得 =====
		// 検索条件
		TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();
		cb.setupSelect_TMoveRecordB();
		cb.setupSelect_TMoveRecordB().withTMoveInstB();
		cb.setupSelect_TMoveRecordB().withTMoveInstH();
		cb.setupSelect_TMoveRecordB().withTMoveInstH().withMClient();
		cb.setupSelect_TMoveRecordB().withTMoveInstH().withMCenter();
		// 検索条件：コントロールNo
		cb.query().queryTMoveRecordB().setControlNo_Equal(controlNo);
		// ソート条件
		cb.query().addOrderBy_StockInoutId_Asc();

		// 検索実行
		List<TStockInout> tStockInoutList = tStockInoutBhv.selectList(cb);

		// ===== 在庫受払の件数分繰返 =====

		// [検査-135] 出荷ボディ履歴と紐づく在庫履歴が作成されない不具合を修正 2014.11.27 kawana Start
		List<HMoveB> hMoveBListIns = new ArrayList<HMoveB>();
		Map<Long, Long> tMoveBIdMap = new HashMap<Long, Long>();
		// [検査-135] 出荷ボディ履歴と紐づく在庫履歴が作成されない不具合を修正 2014.11.27 kawana End
		List<Long> stockIdList = new ArrayList<Long>();

		int countMoveH = 0;
		int countStock = 0;
		int countMoveB = 0;

		for (TStockInout tStockInout : tStockInoutList) {

			// ===== 在庫移動指示ヘッダの登録 =====

			// 在庫移動指示ヘッダIDに紐づく登録データが未登録の場合
			Long moveInstHId = tStockInout.chaseTMoveRecordB().getMoveInstHId();
			if (moveInstHId != null &&
					hMoveHMap.get(moveInstHId) == null) {

				// 在庫移動ヘッダ履歴の登録データを編集し
				HMoveH hMoveH = new HMoveH();

				// 履歴日
				hMoveH.setHistDt(systemDt);
				// 荷主ID
				hMoveH.setClientId(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().getClientId());
				// 荷主CD
				hMoveH.setClientCd(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().chaseMClient().getClientCd());
				// 荷主名称
				hMoveH.setClientNm(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().chaseMClient().getClientNm());
				// センタID
				hMoveH.setCenterId(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().getCenterId());
				// センタCD
				hMoveH.setCenterCd(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().chaseMCenter().getCenterCd());
				// センタ名称
				hMoveH.setCenterNm(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().chaseMCenter().getCenterNm());
				// 処理区分ID
				hMoveH.setProcessTypeId(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().getProcessTypeId());
				// 在庫移動指示備考
				hMoveH.setMoveInstComment(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().getMoveInstComment());
				// 削除フラグ
				hMoveH.setDelFlg(tStockInout.chaseTMoveRecordB().chaseTMoveInstH().getDelFlg());

				// データベースに登録実行
				hMoveHBhv.insert(hMoveH);

				// 履歴IDマップに登録
				hMoveHMap.put(moveInstHId, hMoveH.getMoveInstHId());

				// 件数をカウント
				countMoveH++;
			}

			// 在庫移動実績ボディIDに紐づく登録データが未登録の場合
			Long moveInstBId = tStockInout.getMoveRecordBId();
			// [検査-135] 出荷ボディ履歴と紐づく在庫履歴が作成されない不具合を修正 2014.11.27 kawana Start
			if (moveInstBId != null &&
					tMoveBIdMap.get(moveInstBId) == null) {
				// [検査-135] 出荷ボディ履歴と紐づく在庫履歴が作成されない不具合を修正 2014.11.27 kawana End

				// 在庫移動ボディ履歴の登録データを編集し
				HMoveB hMoveB = new HMoveB();

				// 在庫移動指示ヘッダID
				hMoveB.setMoveInstHId(hMoveHMap.get(moveInstHId));
				// 入出庫区分
				hMoveB.setInoutType(tStockInout.chaseTMoveRecordB().chaseTMoveInstB().getInoutType());
				// 在庫ID
				hMoveB.setStockId(tStockInout.getStockId());
				// 処理No.
				hMoveB.setProcessNo(tStockInout.chaseTMoveRecordB().getProcessNo());
				// 移動日
				hMoveB.setMoveDt(tStockInout.chaseTMoveRecordB().getMoveDt());
				// 在庫移動実績数
				hMoveB.setMoveNum(tStockInout.chaseTMoveRecordB().getMoveNum());
				// 削除フラグ
				hMoveB.setDelFlg(tStockInout.chaseTMoveRecordB().getDelFlg());

				// [検査-135] 出荷ボディ履歴と紐づく在庫履歴が作成されない不具合を修正 2014.11.27 kawana Start
				// 登録用リストに追加
				hMoveBListIns.add(hMoveB);

				// 登録済チェックのMapに追加
				tMoveBIdMap.put(moveInstBId, moveInstBId);
				// [検査-135] 出荷ボディ履歴と紐づく在庫履歴が作成されない不具合を修正 2014.11.27 kawana End

				// 在庫IDリストに追加
				stockIdList.add(tStockInout.getStockId());
			}
		}

		if (0 < hMoveBListIns.size()) {

			// ===== 在庫履歴の登録 =====
			int stockCount = commonLogic.insertNotExistsHStock(stockIdList);
			countStock = countStock + stockCount;

			// ===== 在庫移動ボディ履歴の登録 =====
			int[] moveBCount = hMoveBBhv.batchInsert(hMoveBListIns);
			countMoveB = countMoveB + moveBCount.length;
		}

		// 戻り値設定
		ReturnDto_insertMove returnDto = new ReturnDto_insertMove();
		returnDto.headerInsertCount = countMoveH;
		returnDto.bodyInsertCount = countMoveB;
		returnDto.stockInsertCount = countStock;

		return returnDto;
	}

	/**
	 * 在庫移動履歴データ作成対象に移動済のコントロールNoを設定
	 */
	private void move_updateControlNoMoved() {

		// 更新用データ編集
		TMoveRecordB updateEntity = new TMoveRecordB();
		// コントロールNo(移動済)
		updateEntity.setControlNo(controlNoMoved);

		// 更新条件設定
		TMoveRecordBCB cb = tMoveRecordBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tMoveRecordBBhv, updateEntity, cb, queryUpdateSettingsLogic.getQuerySetter(tMoveRecordBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	private int inventory_updateControlNo(final long clientId, final long centerId, String hMoveDay) {

		// 更新条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		// 荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(clientId);
		// センタID
		cb.query().queryTInventoryH().setCenterId_Equal(centerId);
		// 棚卸日
		cb.query().queryTInventoryH().setInventoryDt_LessEqual(hMoveDay);
		// コントロールNo
		cb.query().setControlNo_IsNull();
		cb.orScopeQuery(new OrQuery<TInventoryBCB>() {
			public void query(TInventoryBCB orCB) {
				// 在庫移動指示ヘッダID
				orCB.query().setMoveInstHId_IsNull();
				// 在庫移動指示ステータス
				orCB.query().queryTMoveInstH().setMoveInstStatus_Equal_$02();
			}
		});
		// 上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		cb.fetchFirst(getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT));
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		// 検索実行
		List<TInventoryB> list = tInventoryBBhv.selectList(cb);

		if (list.size() == 0) {
			return 0;
		}

		for (TInventoryB entity : list) {
			entity.setControlNo(controlNo);
		}

		// 更新実行
		int[] updateCount = tInventoryBBhv.batchUpdate(list);

		return updateCount.length;
	}

	private int move_updateControlNo(final long moveInstHId) {

		// 検索条件
		TMoveRecordBCB cb = tMoveRecordBBhv.newMyConditionBean();
		cb.query().setMoveInstHId_Equal(moveInstHId);
		cb.query().setControlNo_IsNull();

		// 検索実行
		List<TMoveRecordB> list = tMoveRecordBBhv.selectList(cb);

		if (list.size() == 0) {
			return 0;
		}

		for (TMoveRecordB entity : list) {
			entity.setControlNo(controlNo);
		}

		// 更新実行
		int[] updateCount = tMoveRecordBBhv.batchUpdate(list);

		return updateCount.length;
	}

	private void inventory_updateControlNoExclude() {

		// 更新用データ編集
		TInventoryB updateEntity = new TInventoryB();
		// コントロールNo(除外)
		updateEntity.setControlNo(controlNoExclude);

		// 更新条件設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tInventoryBBhv, updateEntity, cb, queryUpdateSettingsLogic.getQuerySetter(tInventoryBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	private HInventoryH inventory_newHInventoryH(TInventoryB tInventoryB, final String systemDt) {
		// 棚卸ヘッダ履歴の登録データを編集
		HInventoryH hInventoryH = new HInventoryH();

		// 履歴日
		// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana Start
		hInventoryH.setHistDt(systemDt);
		// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana End
		// 荷主ID
		hInventoryH.setClientId(tInventoryB.chaseTInventoryH().getClientId());
		// 荷主CD
		hInventoryH.setClientCd(tInventoryB.chaseTInventoryH().chaseMClient().getClientCd());
		// 荷主名称
		hInventoryH.setClientNm(tInventoryB.chaseTInventoryH().chaseMClient().getClientNm());
		// センタID
		hInventoryH.setCenterId(tInventoryB.chaseTInventoryH().getCenterId());
		// センタCD
		hInventoryH.setCenterCd(tInventoryB.chaseTInventoryH().chaseMCenter().getCenterCd());
		// センタ名称
		hInventoryH.setCenterNm(tInventoryB.chaseTInventoryH().chaseMCenter().getCenterNm());
		// 棚卸日
		hInventoryH.setInventoryDt(tInventoryB.chaseTInventoryH().getInventoryDt());
		// バッチNo.
		hInventoryH.setBatchNum(tInventoryB.chaseTInventoryH().getBatchNum());
		// 削除フラグ
		hInventoryH.setBatchNum(tInventoryB.chaseTInventoryH().getBatchNum());
		return hInventoryH;
	}

	private HInventoryB inventory_newHInventoryB(TInventoryB tInventoryB, Long inventoryHId, Long moveInstHId) {
		// 棚卸ボディ履歴の登録データを編集
		HInventoryB hInventoryB = new HInventoryB();

		// 棚卸ヘッダID
		hInventoryB.setInventoryHId(hInventoryHMap.get(inventoryHId));
		// 在庫ID
		hInventoryB.setStockId(tInventoryB.getStockId());
		// 倉庫ID
		hInventoryB.setWarehouseId(tInventoryB.getWarehouseId());
		// 倉庫CD
		hInventoryB.setWarehouseCd(tInventoryB.chaseMWarehouse().getWarehouseCd());
		// 倉庫名称
		hInventoryB.setWarehouseNm(tInventoryB.chaseMWarehouse().getWarehouseNm());
		// 商品ID
		hInventoryB.setProductId(tInventoryB.getProductId());
		// 商品CD
		hInventoryB.setProductCd(tInventoryB.chaseMProduct().getProductCd());
		// 商品名称
		hInventoryB.setProductNm(tInventoryB.chaseMProduct().getProductNm());
		// 在庫区分ID
		hInventoryB.setStockTypeId(tInventoryB.getStockTypeId());
		// ロケーションID
		hInventoryB.setLocationId(tInventoryB.getLocationId());
		// ロケーションCD
		hInventoryB.setLocationCd(tInventoryB.chaseMLocation().getLocationCd());
		// ロケーション名称
		hInventoryB.setLocationNm(tInventoryB.chaseMLocation().getLocationNm());
		// 預託ID
		hInventoryB.setDepositId(tInventoryB.getDepositId());
		// 預託CD
		hInventoryB.setDepositCd(tInventoryB.chaseMCustomerByDepositId().getCustomerCd());
		// 預託名称
		hInventoryB.setDepositNm(tInventoryB.chaseMCustomerByDepositId().getCustomerNm());
		// ロットID
		hInventoryB.setLotId(tInventoryB.getLotId());
		// ロット
		hInventoryB.setLot(tInventoryB.getLot());
		// 期限日
		hInventoryB.setLimitDt(tInventoryB.getLimitDt());
		// 荷姿ID
		hInventoryB.setShapeId(tInventoryB.getShapeId());
		// 入庫No.ID
		hInventoryB.setStoreNoId(tInventoryB.getStoreNoId());
		// 入庫ラベルNo.
		hInventoryB.setStoreLabelNo(tInventoryB.getStoreLabelNo());
		// 仕入先ID
		hInventoryB.setSupplierId(tInventoryB.chaseTStoreNo().getSupplierId());
		// 仕入先CD
		hInventoryB.setSupplierCd(tInventoryB.chaseTStoreNo().chaseMCustomer().getCustomerCd());
		// 仕入先名称
		hInventoryB.setSupplierNm(tInventoryB.chaseTStoreNo().chaseMCustomer().getCustomerNm());
		// 入庫日
		hInventoryB.setStoreDt(tInventoryB.chaseTStoreNo().getStoreDt());
		// 入数
		hInventoryB.setUnitNum(tInventoryB.getUnitNum());
		// 引当可能数
		hInventoryB.setChargeNum(tInventoryB.getChargeNum());
		// 引当済数
		hInventoryB.setAllocNum(tInventoryB.getAllocNum());
		// 移動中数
		hInventoryB.setMoveNum(tInventoryB.getMoveNum());
		// 棚卸数
		hInventoryB.setInventoryNum(tInventoryB.getInventoryNum());
		// 入力区分
		hInventoryB.setInputType(tInventoryB.getInputType());
		// 在庫調整フラグ
		hInventoryB.setStockAdjustFlg(tInventoryB.getStockAdjustFlg());
		// 在庫移動指示ヘッダID
		hInventoryB.setMoveInstHId(hMoveHMap.get(moveInstHId));
		// 削除フラグ
		hInventoryB.setDelFlg(tInventoryB.getDelFlg());
		return hInventoryB;
	}

	private class ReturnDto_insertInventoryB {
		public int stockInsertCount;
		public int inventoryBInsertCount;
	}

	/**
	 * 棚卸ボディ履歴の登録
	 *
	 * @param stockIdList
	 * @param inventoryBList
	 */
	private ReturnDto_insertInventoryB insertInventoryB(List<Long> stockIdList, List<HInventoryB> inventoryBList) {

		// ===== 在庫履歴の登録 =====
		int stockCount = commonLogic.insertNotExistsHStock(stockIdList);

		// ===== 棚卸ボディ履歴の登録 =====
		int[] inventoryBCount = hInventoryBBhv.batchInsert(inventoryBList);

		// 戻り値の設定
		ReturnDto_insertInventoryB result = new ReturnDto_insertInventoryB();
		result.stockInsertCount = stockCount;
		result.inventoryBInsertCount = inventoryBCount.length;

		return result;
	}

	/**
	 * 棚卸履歴データ作成対象に移動済のコントロールNoを設定
	 */
	private void inventory_updateControlNoMoved() {

		// 更新用データ編集
		TInventoryB updateEntity = new TInventoryB();
		// コントロールNo(移動済)
		updateEntity.setControlNo(controlNoMoved);

		// 更新条件設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tInventoryBBhv, updateEntity, cb, queryUpdateSettingsLogic.getQuerySetter(tInventoryBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	private void inventory_clearControlNoExclude() {

		// 更新用データ編集
		TInventoryB updateEntity = new TInventoryB();
		// コントロールNo(除外)
		updateEntity.setControlNo(null);

		// 更新条件設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNoExclude);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tInventoryBBhv, updateEntity, cb, queryUpdateSettingsLogic.getQuerySetter(tInventoryBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	/**
	 * 履歴に移動した入荷関連データを削除する
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 */
	private void deleteReceive(long clientId, long centerId) {
		int delNum;
		// ===== 在庫受払更新 =====
		// 更新用データ編集
		TStockInout tStockInout = new TStockInout();
		// 入庫実績ボディID
		tStockInout.setStoreRecordBId(null);

		// 更新条件設定
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
		// コントロールNo
		tStockInoutCB.query().queryTStoreRecordB().setControlNo_Equal(controlNoMoved);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tStockInoutBhv, tStockInout, tStockInoutCB, queryUpdateSettingsLogic.getQuerySetter(tStockInoutBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End

		// ===== 入庫実績ボディ削除 =====
		// 削除条件設定
		TStoreRecordBCB tStoreRecordBCB = tStoreRecordBBhv.newMyConditionBean();
		// コントロールNo
		tStoreRecordBCB.query().setControlNo_Equal(controlNoMoved);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreRecordBBhv, tStoreRecordBCB, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreRecordBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#224][2.1.0-CT-044] 入庫実績帳票テーブルの削除処理を追加 2016.11.09 kawana Start

		// ===== 入庫実績帳票削除 =====
		// 削除条件設定
		TStoreRecordRCB tStoreRecordRCB = tStoreRecordRBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setCenterId_Equal(centerId);
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 入庫実績ヘッダID
		tStoreRecordRCB.query().queryTStoreRecordH().notExistsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
			public void query(TStoreRecordBCB subCB) {
			}
		});
		// 入荷ステータス
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveStatus_Equal_$03();

		// 削除実行
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreRecordRBhv, tStoreRecordRCB, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordRBhv));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreRecordRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#224][2.1.0-CT-044] 入庫実績帳票テーブルの削除処理を追加 2016.11.09 kawana End

		// ===== 入庫実績ヘッダ削除 =====
		// 削除条件設定
		TStoreRecordHCB tStoreRecordHCB = tStoreRecordHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tStoreRecordHCB.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		tStoreRecordHCB.query().queryTReceivePlanH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 入庫実績ヘッダID
		tStoreRecordHCB.query().notExistsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
			public void query(TStoreRecordBCB subCB) {
			}
		});
		// 入荷ステータス
		tStoreRecordHCB.query().queryTReceivePlanH().setReceiveStatus_Equal_$03();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreRecordHBhv, tStoreRecordHCB, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreRecordHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#2253]予備項目対応 2017.09.28 sampei Start
		// ===== 入荷予定予備削除 =====
		// 削除条件設定
		TReceivePlanSpareCB tReceivePlanSpareCB = tReceivePlanSpareBhv.newMyConditionBean();
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setCenterId_Equal(centerId);
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setClientId_Equal(clientId);
		// 入荷予定ボディID
		tReceivePlanSpareCB.query().queryTReceivePlanB().notExistsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
			public void query(TStoreRecordBCB subCB) {
			}
		});
		// 入荷ステータス
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setReceiveStatus_Equal_$03();

		// 削除実行
		delNum = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanSpareBhv, tReceivePlanSpareCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanSpareBhv));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanSpareBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		// [#2253]予備項目対応 2017.09.28 sampei End


		// ===== 入荷予定ボディ削除 =====
		// 削除条件設定
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tReceivePlanBCB.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		tReceivePlanBCB.query().queryTReceivePlanH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 入荷予定ボディID
		tReceivePlanBCB.query().notExistsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
			public void query(TStoreRecordBCB subCB) {
			}
		});
		// 入荷ステータス
		tReceivePlanBCB.query().queryTReceivePlanH().setReceiveStatus_Equal_$03();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanBBhv, tReceivePlanBCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 入荷予定帳票削除 =====
		// 削除条件設定
		TReceivePlanRCB tReceivePlanRCB = tReceivePlanRBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tReceivePlanRCB.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		tReceivePlanRCB.query().queryTReceivePlanH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 入荷予定ボディ.入荷予定ヘッダID
		tReceivePlanRCB.query().queryTReceivePlanH().notExistsTReceivePlanBList(new SubQuery<TReceivePlanBCB>() {
			public void query(TReceivePlanBCB subCB) {
			}
		});
		// 入庫実績ヘッダ.入荷予定ヘッダID
		tReceivePlanRCB.query().queryTReceivePlanH().notExistsTStoreRecordHList(new SubQuery<TStoreRecordHCB>() {
			public void query(TStoreRecordHCB subCB) {
			}
		});
		// 入荷予定ヘッダ.元入荷予定ヘッダID
		tReceivePlanRCB.query().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});
		// 入荷ステータス
		tReceivePlanRCB.query().queryTReceivePlanH().setReceiveStatus_Equal_$03();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanRBhv, tReceivePlanRCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 入荷予定ヘッダ削除 =====
		// 削除条件設定
		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tReceivePlanHCB.query().setCenterId_Equal(centerId);
		tReceivePlanHCB.query().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 入荷予定ボディ.入荷予定ヘッダID
		tReceivePlanHCB.query().notExistsTReceivePlanBList(new SubQuery<TReceivePlanBCB>() {
			public void query(TReceivePlanBCB subCB) {
			}
		});
		// 入庫実績ヘッダ.入荷予定ヘッダID
		tReceivePlanHCB.query().notExistsTStoreRecordHList(new SubQuery<TStoreRecordHCB>() {
			public void query(TStoreRecordHCB subCB) {
			}
		});
		// 入荷予定ヘッダ.元入荷予定ヘッダID
		tReceivePlanHCB.query().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});
		// [ON推-品向-1026] 帳票テーブルからのFK考慮漏れを修正 2015.11.25 kawana Start
		tReceivePlanHCB.query().notExistsTReceivePlanRAsOne(new SubQuery<TReceivePlanRCB>() {
			@Override
			public void query(TReceivePlanRCB subCB) {
			}
		});
		// [ON推-品向-1026] 帳票テーブルからのFK考慮漏れを修正 2015.11.25 kawana End
		// 入荷ステータス
		tReceivePlanHCB.query().setReceiveStatus_Equal_$03();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		int count = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanHBhv, tReceivePlanHCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanHBhv.asTableDbName().toUpperCase(), String.valueOf(count));
	}

	/**
	 * <pre>
	 * 履歴に移動した出荷関連データを削除する
	 * 削除前に保管ロットを登録・更新する
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param hMoveDay 移動対象日
	 */
	private void deleteShipping(long clientId, long centerId, String hMoveDay) {
		int delNum;
		// ===== 梱包ボディ削除 =====

		// 削除条件設定
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		// コントロールNo
		tPackingBCB.query().setControlNo_Equal(controlNoMoved);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPackingBBhv, tPackingBCB, queryUpdateSettingsLogic.getQuerySetter(tPackingBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPackingBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 梱包帳票削除 =====
		// 削除条件設定
		TPackingRCB tPackingRCB = tPackingRBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tPackingRCB.query().queryTPackingH().queryTPickingH().setCenterId_Equal(centerId);
		tPackingRCB.query().queryTPackingH().queryTPickingH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 梱包ボディ.梱包ヘッダID
		tPackingRCB.query().queryTPackingH().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});
		// 出庫ステータス
		tPackingRCB.query().queryTPackingH().queryTPickingH().setPickingStatus_Equal_$55();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPackingRBhv, tPackingRCB, queryUpdateSettingsLogic.getQuerySetter(tPackingRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPackingRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 梱包ヘッダ削除 =====
		// 削除条件設定
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tPackingHCB.query().queryTPickingH().setCenterId_Equal(centerId);
		tPackingHCB.query().queryTPickingH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 梱包ボディ.梱包ヘッダID
		tPackingHCB.query().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});
		// 出庫ステータス
		tPackingHCB.query().queryTPickingH().setPickingStatus_Equal_$55();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPackingHBhv, tPackingHCB, queryUpdateSettingsLogic.getQuerySetter(tPackingHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPackingHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 出庫ボディ削除 =====
		// 削除条件設定
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		// [新WMS-110-009] 別荷主の強制確定データが消えてしまう問題を修正 2015.07.15 kawana Start
		// 荷主ID
		tPickingBCB.query().queryTPickingH().setClientId_Equal(clientId);
		// センタID
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(centerId);
		// [新WMS-110-009] 別荷主の強制確定データが消えてしまう問題を修正 2015.07.15 kawana End
		// 梱包ボディ.出庫ボディID
		tPickingBCB.query().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});
		// 出庫ステータス
		tPickingBCB.query().queryTPickingH().setPickingStatus_Equal_$55();
		// 出荷確定日
		tPickingBCB.query().queryTPickingH().setShippingFixedDt_LessEqual(hMoveDay);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPickingBBhv, tPickingBCB, queryUpdateSettingsLogic.getQuerySetter(tPickingBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPickingBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 出庫帳票削除 =====
		// 削除条件設定
		TPickingRCB tPickingRCB = tPickingRBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tPickingRCB.query().queryTPickingH().setCenterId_Equal(centerId);
		tPickingRCB.query().queryTPickingH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 出庫ボディ.出庫ヘッダID
		tPickingRCB.query().queryTPickingH().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 梱包ヘッダ.出庫ヘッダID
		tPickingRCB.query().queryTPickingH().notExistsTPackingHList(new SubQuery<TPackingHCB>() {
			public void query(TPackingHCB subCB) {
			}
		});
		// 出庫ステータス
		tPickingRCB.query().queryTPickingH().setPickingStatus_Equal_$55();
		// [ON推-品向-561] 全数欠品の確定データが消えてしまう問題を改修 2015.01.16 kawana Start
		// 出荷確定日
		tPickingRCB.query().queryTPickingH().setShippingFixedDt_LessEqual(hMoveDay);
		// [ON推-品向-561] 全数欠品の確定データが消えてしまう問題を改修 2015.01.16 kawana End

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPickingRBhv, tPickingRCB, queryUpdateSettingsLogic.getQuerySetter(tPickingRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPickingRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana Start

		// ===== 入荷予定ヘッダ ⇒ 出庫ヘッダ リレーション削除 =====

		// 出庫ヘッダIDをnullに更新
		TReceivePlanH relationClearEntity = new TReceivePlanH();
		relationClearEntity.setPickingHId(null);

		// 更新条件(出庫ヘッダと同条件)
		TReceivePlanHCB relationClearCb = tReceivePlanHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		relationClearCb.query().queryTPickingH().setCenterId_Equal(centerId);
		relationClearCb.query().queryTPickingH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 出庫ボディ.出庫ヘッダID
		relationClearCb.query().queryTPickingH().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 梱包ヘッダ.出庫ヘッダID
		relationClearCb.query().queryTPickingH().notExistsTPackingHList(new SubQuery<TPackingHCB>() {
			public void query(TPackingHCB subCB) {
			}
		});
		// 出庫ステータス
		relationClearCb.query().queryTPickingH().setPickingStatus_Equal_$55();
		// 出荷確定日
		relationClearCb.query().queryTPickingH().setShippingFixedDt_LessEqual(hMoveDay);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tReceivePlanHBhv, relationClearEntity, relationClearCb, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana End

		// ===== 出庫ヘッダ削除 =====
		// 削除条件設定
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tPickingHCB.query().setCenterId_Equal(centerId);
		tPickingHCB.query().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 出庫ボディ.出庫ヘッダID
		tPickingHCB.query().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 梱包ヘッダ.出庫ヘッダID
		tPickingHCB.query().notExistsTPackingHList(new SubQuery<TPackingHCB>() {
			public void query(TPackingHCB subCB) {
			}
		});
		// 出庫ステータス
		tPickingHCB.query().setPickingStatus_Equal_$55();
		// [ON推-品向-561] 全数欠品の確定データが消えてしまう問題を改修 2015.01.16 kawana Start
		// 出荷確定日
		tPickingHCB.query().setShippingFixedDt_LessEqual(hMoveDay);
		// [ON推-品向-561] 全数欠品の確定データが消えてしまう問題を改修 2015.01.16 kawana End

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPickingHBhv, tPickingHCB, queryUpdateSettingsLogic.getQuerySetter(tPickingHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPickingHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#2253]予備項目対応 2017.09.28 sampei Start
		// ===== 出荷指示予備削除 =====
		// 削除条件設定
		TShippingInstSpareCB tShippingInstSpareCB = tShippingInstSpareBhv.newMyConditionBean();
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setCenterId_Equal(centerId);
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setClientId_Equal(clientId);
		// 出荷指示ボディ.出庫ボディ.出荷指示ボディID
		tShippingInstSpareCB.query().queryTShippingInstB().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 出荷ステータス
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setShippingStatus_Equal_$55();
		// 出荷日
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setShippingDt_LessEqual(hMoveDay);

		// 削除実行
		delNum = queryUpdateLogic.queryDeleteWithSelect(tShippingInstSpareBhv, tShippingInstSpareCB, queryUpdateSettingsLogic.getQuerySetter(tShippingInstSpareBhv));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tShippingInstSpareBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		// [#2253]予備項目対応 2017.09.28 sampei End

		// ===== 出荷指示ボディ削除 =====
		// 削除条件設定
		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tShippingInstBCB.query().queryTShippingInstH().setCenterId_Equal(centerId);
		tShippingInstBCB.query().queryTShippingInstH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 出庫ボディ.出荷指示ボディID
		tShippingInstBCB.query().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 出荷ステータス
		tShippingInstBCB.query().queryTShippingInstH().setShippingStatus_Equal_$55();
		// [ON推-品向-561] 全数欠品の確定データが消えてしまう問題を改修 2015.01.15 kawana Start
		// 出荷日
		tShippingInstBCB.query().queryTShippingInstH().setShippingDt_LessEqual(hMoveDay);
		// [ON推-品向-561] 全数欠品の確定データが消えてしまう問題を改修 2015.01.15 kawana End

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tShippingInstBBhv, tShippingInstBCB, queryUpdateSettingsLogic.getQuerySetter(tShippingInstBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tShippingInstBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 出荷指示ヘッダ削除 =====
		// 削除条件設定
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tShippingInstHCB.query().setCenterId_Equal(centerId);
		tShippingInstHCB.query().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 出庫ボディ.出荷指示ボディID
		tShippingInstHCB.query().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 出荷ステータス
		tShippingInstHCB.query().setShippingStatus_Equal_$55();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tShippingInstHBhv, tShippingInstHCB, queryUpdateSettingsLogic.getQuerySetter(tShippingInstHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tShippingInstHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 在庫受払更新 =====

		// 更新用データ編集
		TStockInout tStockInout = new TStockInout();
		// 引当指示ボディID
		tStockInout.setAllocInstBId(null);

		// 更新条件設定
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
		// [#6084][v2.2]絞込み不正が原因でデッドロック発生 2019.02.28 kawana Start
		// 引当指示ボディID
		tStockInoutCB.query().setAllocInstBId_IsNotNull();
		// [#6084][v2.2]絞込み不正が原因でデッドロック発生 2019.02.28 kawana End
		// 出庫ボディ.引当指示ボディID
		tStockInoutCB.query().queryTAllocInstB().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 出荷指示ボディ.引当指示ボディID
		tStockInoutCB.query().queryTAllocInstB().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 梱包ボディ.引当指示ボディID
		tStockInoutCB.query().queryTAllocInstB().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tStockInoutBhv, tStockInout, tStockInoutCB, queryUpdateSettingsLogic.getQuerySetter(tStockInoutBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End

		// ===== 保管ロット管理更新 =====

		deleteShipping_updateKeepingLot();

		// ===== 引当ロット管理削除 =====
		// 削除条件
		TAllocLotCB tAllocLotCB = tAllocLotBhv.newMyConditionBean();
		// 出庫ボディ.引当指示ボディID
		tAllocLotCB.query().queryTAllocInstB().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 出荷指示ボディ.引当指示ボディID
		tAllocLotCB.query().queryTAllocInstB().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 梱包ボディ.引当指示ボディID
		tAllocLotCB.query().queryTAllocInstB().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tAllocLotBhv, tAllocLotCB, queryUpdateSettingsLogic.getQuerySetter(tAllocLotBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tAllocLotBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 引当指示ボディ削除 =====
		// 削除条件
		TAllocInstBCB tAllocInstBCB = tAllocInstBBhv.newMyConditionBean();
		// 出庫ボディ.引当指示ボディID
		tAllocInstBCB.query().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 出荷指示ボディ.引当指示ボディID
		tAllocInstBCB.query().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 梱包ボディ.引当指示ボディID
		tAllocInstBCB.query().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tAllocInstBBhv, tAllocInstBCB, queryUpdateSettingsLogic.getQuerySetter(tAllocInstBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tAllocInstBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 引当指示ヘッダ削除 =====
		// 削除条件
		TAllocInstHCB tAllocInstHCB = tAllocInstHBhv.newMyConditionBean();
		// 出荷指示ヘッダ.引当指示ヘッダID
		tAllocInstHCB.query().notExistsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			public void query(TShippingInstHCB subCB) {
			}
		});
		// 引当指示ボディ.引当指示ヘッダID
		tAllocInstHCB.query().notExistsTAllocInstBList(new SubQuery<TAllocInstBCB>() {
			public void query(TAllocInstBCB subCB) {
			}
		});
		// 出庫ヘッダ.引当指示ヘッダID
		tAllocInstHCB.query().notExistsTPickingHList(new SubQuery<TPickingHCB>() {
			public void query(TPickingHCB subCB) {
			}
		});
		// 梱包ヘッダ.引当指示ヘッダID
		tAllocInstHCB.query().notExistsTPackingHList(new SubQuery<TPackingHCB>() {
			public void query(TPackingHCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tAllocInstHBhv, tAllocInstHCB, queryUpdateSettingsLogic.getQuerySetter(tAllocInstHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tAllocInstHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
	}

	/**
	 * 引当ロットを削除する前の保管ロット更新
	 */
	private void deleteShipping_updateKeepingLot() {

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		int tKeepingLotInsertCount = 0;
		int tKeepingLotUpdateCount = 0;

		// 取引先IDチェック用
		long beforeCustomerId = 0L;
		// 商品IDチェック用
		long beforeProductId = 0L;

		// 対象がなくなるまで繰返し
		while (true) {

			// 対象の引当ロットを検索
			List<TAllocLot> tAllocLotList = deleteShipping_selectAllocLotList();

			if (tAllocLotList.size() == 0) {
				// 対象なし - whileループを抜ける

				break;
			}

			// 一括更新用 保管ロット管理リスト
			List<TKeepingLot> tKeepingLotListIns = new ArrayList<TKeepingLot>();
			// 一括更新用 保管ロット管理リスト
			List<TKeepingLot> tKeepingLotListUpd = new ArrayList<TKeepingLot>();

			// 引当ロット管理の件数分繰返
			for (TAllocLot tAllocLot : tAllocLotList) {

				// [#576] 期限日逆転防止しない引当のロットが保管ロットに登録されてしまう不具合を修正 2017.01.10 kawana Start
				if (!tAllocLot.getTAllocInstB().isLimitDtReverseFlg$1()) {
					// 期限日逆転管理しない引当の場合は保管ロットに登録しない
					continue;
				}
				// [#576] 期限日逆転防止しない引当のロットが保管ロットに登録されてしまう不具合を修正 2017.01.10 kawana End

				long customerId = tAllocLot.getCustomerId();
				long productId = tAllocLot.getProductId();

				// 前回処理と取引先IDまたは商品IDが異なっている場合
				if (beforeCustomerId != customerId || beforeProductId != productId) {

					// 現在の保管ロットの取得
					TKeepingLotCB tKeepingLotCb = tKeepingLotBhv.newMyConditionBean();
					tKeepingLotCb.setupSelect_TLot();
					tKeepingLotCb.query().setCustomerId_Equal(customerId);
					tKeepingLotCb.query().setProductId_Equal(productId);

					// 検索実行
					TKeepingLot selectKeepingLot = tKeepingLotBhv.selectEntity(tKeepingLotCb);

					if (selectKeepingLot == null) {

						// 保管ロット管理の登録データを編集し
						TKeepingLot tKeepingLot = new TKeepingLot();
						// 取引先ID
						tKeepingLot.setCustomerId(customerId);
						// 商品ID
						tKeepingLot.setProductId(productId);
						// ロットID
						tKeepingLot.setLotId(tAllocLot.getLotId());
						// 一括登録用 保管ロット管理リストに追加
						tKeepingLotListIns.add(tKeepingLot);

					} else {
						if (selectKeepingLot.getTLot().getLimitDt().compareTo(tAllocLot.getTLot().getLimitDt()) < 0) {
							// 現在ロットとの期限日を比較

							// 保管ロットのロットIDを更新
							selectKeepingLot.setLotId(tAllocLot.getLotId());
							// 一括更新用 保管ロット管理リストに追加
							tKeepingLotListUpd.add(selectKeepingLot);
						}
					}

					// 取引先IDチェック用
					beforeCustomerId = customerId;
					// 商品IDチェック用
					beforeProductId = productId;
				}
			}

			if (0 < tKeepingLotListIns.size()) {

				// 保管ロット登録
				int[] insCount = tKeepingLotBhv.batchInsert(tKeepingLotListIns);
				tKeepingLotInsertCount = tKeepingLotInsertCount + insCount.length;
			}

			if (0 < tKeepingLotListUpd.size()) {

				// 保管ロット更新
				int[] updCount = tKeepingLotBhv.batchUpdate(tKeepingLotListUpd);
				tKeepingLotUpdateCount = tKeepingLotUpdateCount + updCount.length;
			}
		}

		// 運用ログ追加(保管ロット登録)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, tKeepingLotBhv.asTableDbName().toUpperCase(), String.valueOf(tKeepingLotInsertCount));

		// 運用ログ追加(保管ロット更新)
		commonLogic.addLog(WmsMessageConst.DATA_UPDATE_DAILY_PROCESS_INFORMATION, tKeepingLotBhv.asTableDbName().toUpperCase(), String.valueOf(tKeepingLotUpdateCount));

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
	}

	/**
	 * 削除対象の引当ロットを取得
	 */
	private List<TAllocLot> deleteShipping_selectAllocLotList() {

		// 検索条件
		TAllocLotCB cb = tAllocLotBhv.newMyConditionBean();
		cb.setupSelect_TLot();
		// [#576] 期限日逆転防止しない引当のロットが保管ロットに登録されてしまう不具合を修正 2017.01.10 kawana Start
		cb.setupSelect_TAllocInstB();
		// [#576] 期限日逆転防止しない引当のロットが保管ロットに登録されてしまう不具合を修正 2017.01.10 kawana End
		// 出庫ボディ.引当指示ボディID
		cb.query().queryTAllocInstB().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// 出荷指示ボディ.引当指示ボディID
		cb.query().queryTAllocInstB().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 梱包ボディ.引当指示ボディID
		cb.query().queryTAllocInstB().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});

		// ソート条件
		// [ON推-品向-500] ソート条件間違いを修正 2014.12.25 kawana Start
		// 取引先ID
		cb.query().addOrderBy_CustomerId_Asc();
		// [ON推-品向-500] ソート条件間違いを修正 2014.12.25 kawana End
		// 商品ID
		cb.query().addOrderBy_ProductId_Asc();
		// 期限日
		cb.query().queryTLot().addOrderBy_LimitDt_Desc();

		cb.orScopeQuery(new OrQuery<TAllocLotCB>() {

			@Override
			public void query(TAllocLotCB orCb) {
				// 処理済みを除く
				orCb.query().setControlNo_IsNull();
				orCb.query().setControlNo_NotEqual(controlNo);
			}
		});

		// 検索上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		cb.fetchFirst(getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT));
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		// 検索実行
		List<TAllocLot> tAllocLotList = tAllocLotBhv.selectList(cb);

		if (tAllocLotList.size() == 0) {
			return tAllocLotList;
		}

		// 1度検索した行はcontrolNoを設定する
		for (TAllocLot entity : tAllocLotList) {

			entity.setControlNo(controlNo);
		}
		// 一括更新
		tAllocLotBhv.batchUpdate(tAllocLotList);

		return tAllocLotList;
	}

	/**
	 * 履歴に移動した在庫移動、棚卸関連データを削除する
	 * @param centerId 荷主ID
	 * @param clientId センタID
	 * @param hMoveDay 移動対象日
	 */
	private void deleteMoveAndInventory(long clientId, long centerId, String hMoveDay) {
		int delNum;
		// ===== 棚卸入力履歴削除 =====
		// 削除条件
		TInventoryInpHistCB tInventoryInpHistCB = tInventoryInpHistBhv.newMyConditionBean();
		// コントロールNo
		tInventoryInpHistCB.query().queryTInventoryB().setControlNo_Equal(controlNoMoved);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryInpHistBhv, tInventoryInpHistCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryInpHistBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryInpHistBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 棚卸帳票削除 =====
		// 削除条件
		TInventoryRCB tInventoryRCB = tInventoryRBhv.newMyConditionBean();
		// コントロールNo
		tInventoryRCB.query().queryTInventoryB().setControlNo_Equal(controlNoMoved);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryRBhv, tInventoryRCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 棚卸ボディ削除 =====

		// 削除条件
		TInventoryBCB tInventoryBCB = tInventoryBBhv.newMyConditionBean();
		// コントロールNo
		tInventoryBCB.query().setControlNo_Equal(controlNoMoved);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryBBhv, tInventoryBCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 棚卸指示削除 =====
		// 削除条件
		TInventoryInstCB tInventoryInstCB = tInventoryInstBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tInventoryInstCB.query().queryTInventoryH().setCenterId_Equal(centerId);
		tInventoryInstCB.query().queryTInventoryH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 棚卸日
		tInventoryInstCB.query().queryTInventoryH().setInventoryDt_LessEqual(hMoveDay);
		// 棚卸ヘッダID
		tInventoryInstCB.query().queryTInventoryH().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryInstBhv, tInventoryInstCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryInstBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryInstBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 棚卸ヘッダ削除 =====
		// 削除条件
		TInventoryHCB tInventoryHCB = tInventoryHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tInventoryHCB.query().setCenterId_Equal(centerId);
		tInventoryHCB.query().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 棚卸日
		tInventoryHCB.query().setInventoryDt_LessEqual(hMoveDay);
		// 棚卸ヘッダID
		tInventoryHCB.query().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryHBhv, tInventoryHCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 在庫受払更新 =====

		// 更新用データ編集
		TStockInout tStockInout = new TStockInout();
		// 在庫移動実績ボディID
		tStockInout.setMoveRecordBId(null);

		// 更新条件
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
		// コントロールNo
		tStockInoutCB.query().queryTMoveRecordB().setControlNo_Equal(controlNoMoved);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tStockInoutBhv, tStockInout, tStockInoutCB, queryUpdateSettingsLogic.getQuerySetter(tStockInoutBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End

		// ===== 在庫移動実績ボディ削除 =====
		// 削除条件
		TMoveRecordBCB tMoveRecordBCB = tMoveRecordBBhv.newMyConditionBean();
		// コントロールNo
		tMoveRecordBCB.query().setControlNo_Equal(controlNoMoved);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveRecordBBhv, tMoveRecordBCB, queryUpdateSettingsLogic.getQuerySetter(tMoveRecordBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveRecordBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 在庫移動実績ボディ削除 =====
		// 削除条件
		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tMoveInstBCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		tMoveInstBCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 在庫移動実績ボディ.在庫移動指示ボディID
		tMoveInstBCB.query().notExistsTMoveRecordBList(new SubQuery<TMoveRecordBCB>() {
			public void query(TMoveRecordBCB subCB) {
			}
		});
		// 在庫移動指示ステータス
		tMoveInstBCB.query().queryTMoveInstH().setMoveInstStatus_Equal_$02();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveInstBBhv, tMoveInstBCB, queryUpdateSettingsLogic.getQuerySetter(tMoveInstBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveInstBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [ON推-品向-1025] 在庫移動帳票テーブル追加により日次処理変更 2015.11.20 kawana Start

		// ===== 在庫移動指示帳票削除 =====
		TMoveInstRCB tMoveInstRCB = tMoveInstRBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tMoveInstRCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		tMoveInstRCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 在庫移動実績ボディ.在庫移動指示ヘッダID
		tMoveInstRCB.query().queryTMoveInstH().notExistsTMoveRecordBList(new SubQuery<TMoveRecordBCB>() {
			public void query(TMoveRecordBCB subCB) {
			}
		});
		// 在庫移動指示ボディ.在庫移動指示ヘッダID
		tMoveInstRCB.query().queryTMoveInstH().notExistsTMoveInstBList(new SubQuery<TMoveInstBCB>() {
			public void query(TMoveInstBCB subCB) {
			}
		});
		// 棚卸ボディ.在庫移動指示ヘッダID
		tMoveInstRCB.query().queryTMoveInstH().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 在庫移動指示ステータス
		tMoveInstRCB.query().queryTMoveInstH().setMoveInstStatus_Equal_$02();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveInstRBhv, tMoveInstRCB, queryUpdateSettingsLogic.getQuerySetter(tMoveInstRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveInstRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [ON推-品向-1025] 在庫移動帳票テーブル追加により日次処理変更 2015.11.20 kawana End

		// ===== 在庫移動指示ヘッダ削除 =====
		// 削除条件
		TMoveInstHCB tMoveInstHCB = tMoveInstHBhv.newMyConditionBean();
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana Start
		tMoveInstHCB.query().setCenterId_Equal(centerId);
		tMoveInstHCB.query().setClientId_Equal(clientId);
		// [#1139] 削除条件にセンタID、荷主IDを追加 2017.03.06 kawana End
		// 在庫移動実績ボディ.在庫移動指示ヘッダID
		tMoveInstHCB.query().notExistsTMoveRecordBList(new SubQuery<TMoveRecordBCB>() {
			public void query(TMoveRecordBCB subCB) {
			}
		});
		// 在庫移動指示ボディ.在庫移動指示ヘッダID
		tMoveInstHCB.query().notExistsTMoveInstBList(new SubQuery<TMoveInstBCB>() {
			public void query(TMoveInstBCB subCB) {
			}
		});
		// 棚卸ボディ.在庫移動指示ヘッダID
		tMoveInstHCB.query().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 在庫移動指示ステータス
		tMoveInstHCB.query().setMoveInstStatus_Equal_$02();

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveInstHBhv, tMoveInstHCB, queryUpdateSettingsLogic.getQuerySetter(tMoveInstHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveInstHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
	}

	/**
	 * <pre>
	 * 不要となった在庫受払、在庫関連データを削除する
	 * 削除前に在庫受払を履歴に移動する
	 * </pre>
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @param systemDt 現在のシステム管理日付
	 * @param hMoveDay 移動対象日
	 */
	private void historyAndDeleteStock(final long clientId, final long centerId, final String systemDt, String hMoveDay) {
		int delNum;

		// ===== 在庫受払データ削除 =====

		int countInsertHStock = 0;
		int countInsertHStockInout = 0;
		int countDeleteStockInout = 0;

		// 削除対象がなくなるまで繰り返し
		while (true) {

			// ===== 削除対象の在庫受払を検索 =====
			List<TStockInout> tStockInoutList = stock_selectStockInoutNoUse(clientId, centerId, hMoveDay);

			if (tStockInoutList.size() == 0) {
				// 対象なし - whileループを抜ける

				break;
			}

			// ===== 在庫受払履歴を登録 =====
			ReturnDto_insertHStockInout count = insertHStockInout(tStockInoutList, systemDt);

			// 件数に加算
			countInsertHStock = countInsertHStock + count.stockInsertCount;
			countInsertHStockInout = countInsertHStockInout + count.stockInoutInsertCount;

			// ===== 在庫受払を削除 =====
			int[] delCount = tStockInoutBhv.batchDelete(tStockInoutList);

			// 削除件数に加算
			countDeleteStockInout = countDeleteStockInout + delCount.length;
		}

		if (0 < countInsertHStock) {
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockBhv.asTableDbName().toUpperCase(), String.valueOf(countInsertHStock));
		}

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockInoutBhv.asTableDbName().toUpperCase(), String.valueOf(countInsertHStockInout));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStockInoutBhv.asTableDbName().toUpperCase(), String.valueOf(countDeleteStockInout));

		// ===== 在庫日報削除 =====

		// 在庫履歴の在庫IDのMAXを取得
		Long maxStockId = tStockBhv.scalarSelect(Long.class).max(new ScalarQuery<TStockCB>() {

			@Override
			public void query(TStockCB cb) {
				cb.specify().columnStockId();
			}
		}).orElse(null);

		// 削除条件
		TStockReportCB tStockReportCB = tStockReportBhv.newMyConditionBean();
		// [#6084][v2.2]絞込み不正が原因でデッドロック発生 2019.02.28 kawana Start
		// センタID
		tStockReportCB.query().queryTStock().queryMLocation().setCenterId_Equal(centerId);
		// 荷主ID
		tStockReportCB.query().queryTStock().setClientId_Equal(clientId);
		// [#6084][v2.2]絞込み不正が原因でデッドロック発生 2019.02.28 kawana End
		// 引当可能数
		tStockReportCB.query().queryTStock().setChargeNum_Equal(WCC.ZERO);
		// 引当済数
		tStockReportCB.query().queryTStock().setAllocNum_Equal(WCC.ZERO);
		// 移動中数
		tStockReportCB.query().queryTStock().setMoveNum_Equal(WCC.ZERO);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana Start
		// 積送中数
		tStockReportCB.query().queryTStock().setTransitNum_Equal(WCC.ZERO);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana End
		// 在庫受払からの参照
		tStockReportCB.query().queryTStock().notExistsTStockInoutList(new SubQuery<TStockInoutCB>() {
			public void query(TStockInoutCB subCB) {
			}
		});
		// 棚卸ボディからの参照
		tStockReportCB.query().queryTStock().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		// 出庫ボディからの参照
		tStockReportCB.query().queryTStock().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		if (maxStockId != null) {
			// 最大のIDは削除しない(DBの再起動によるIDが戻るのを防ぐため）
			tStockReportCB.query().setStockId_NotEqual(maxStockId);
		}

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		int stockReportDelCount = queryUpdateLogic.queryDeleteWithSelect(tStockReportBhv, tStockReportCB, queryUpdateSettingsLogic.getQuerySetter(tStockReportBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStockReportBhv.asTableDbName().toUpperCase(), String.valueOf(stockReportDelCount));

		// ===== 在庫削除 =====

		// 削除条件
		TStockCB tStockCB = tStockBhv.newMyConditionBean();
		// [#6084][v2.2]絞込み不正が原因でデッドロック発生 2019.02.28 kawana Start
		// センタID
		tStockCB.query().queryMLocation().setCenterId_Equal(centerId);
		// 荷主ID
		tStockCB.query().setClientId_Equal(clientId);
		// [#6084][v2.2]絞込み不正が原因でデッドロック発生 2019.02.28 kawana End
		// 引当可能数
		tStockCB.query().setChargeNum_Equal(WCC.ZERO);
		// 引当済数
		tStockCB.query().setAllocNum_Equal(WCC.ZERO);
		// 移動中数
		tStockCB.query().setMoveNum_Equal(WCC.ZERO);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana Start
		// 積送中数
		tStockCB.query().setTransitNum_Equal(WCC.ZERO);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana End
		// 在庫受払からの参照
		tStockCB.query().notExistsTStockInoutList(new SubQuery<TStockInoutCB>() {
			public void query(TStockInoutCB subCB) {
			}
		});
		// 棚卸ボディからの参照
		tStockCB.query().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		// 出庫ボディからの参照
		tStockCB.query().notExistsTPickingBList(new SubQuery<TPickingBCB>() {
			public void query(TPickingBCB subCB) {
			}
		});
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		if (maxStockId != null) {
			// 最大のIDは削除しない(DBの再起動によるIDが戻るのを防ぐため）
			tStockCB.query().setStockId_NotEqual(maxStockId);
		}

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStockBhv, tStockCB, queryUpdateSettingsLogic.getQuerySetter(tStockBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStockBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== ロット削除 =====
		// 削除条件
		TLotCB tLotCB = tLotBhv.newMyConditionBean();
		// 在庫.ロットID
		tLotCB.query().notExistsTStockList(new SubQuery<TStockCB>() {
			public void query(TStockCB subCB) {
			}
		});
		// 出荷指示ボディ.指定ロットID
		tLotCB.query().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 引当指示ボディ.指定ロットID
		tLotCB.query().notExistsTAllocInstBList(new SubQuery<TAllocInstBCB>() {
			public void query(TAllocInstBCB subCB) {
			}
		});
		// 在庫移動指示ボディ.ロットID
		tLotCB.query().notExistsTMoveInstBList(new SubQuery<TMoveInstBCB>() {
			public void query(TMoveInstBCB subCB) {
			}
		});
		// 棚卸ボディ.ロットID
		tLotCB.query().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 引当ロット管理.ロットID
		tLotCB.query().notExistsTAllocLotList(new SubQuery<TAllocLotCB>() {
			public void query(TAllocLotCB subCB) {
			}
		});
		// 最終ロット管理.ロットID
		tLotCB.query().notExistsTLastLotList(new SubQuery<TLastLotCB>() {
			public void query(TLastLotCB subCB) {
			}
		});
		// 保管ロット管理.ロットID
		tLotCB.query().notExistsTKeepingLotList(new SubQuery<TKeepingLotCB>() {
			public void query(TKeepingLotCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tLotBhv, tLotCB, queryUpdateSettingsLogic.getQuerySetter(tLotBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tLotBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [ON推-品向-1026] 入庫No帳票テーブル追加により日次処理変更 2015.11.24 kawana Start

		// ===== 入庫No帳票削除 =====
		// 削除条件
		TStoreNoRCB tStoreNoRCB = tStoreNoRBhv.newMyConditionBean();
		// 在庫.入庫NoID
		tStoreNoRCB.query().queryTStoreNo().notExistsTStockList(new SubQuery<TStockCB>() {
			public void query(TStockCB subCB) {
			}
		});
		// 出荷指示ボディ.指定入庫NoID
		tStoreNoRCB.query().queryTStoreNo().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 引当指示ボディ.指定入庫NoID
		tStoreNoRCB.query().queryTStoreNo().notExistsTAllocInstBList(new SubQuery<TAllocInstBCB>() {
			public void query(TAllocInstBCB subCB) {
			}
		});
		// 在庫移動指示ボディ.入庫NoID
		tStoreNoRCB.query().queryTStoreNo().notExistsTMoveInstBList(new SubQuery<TMoveInstBCB>() {
			public void query(TMoveInstBCB subCB) {
			}
		});
		// 棚卸ボディ.入庫NoID
		tStoreNoRCB.query().queryTStoreNo().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 入庫No.元入庫NoID
		tStoreNoRCB.query().queryTStoreNo().notExistsTStoreNoSelfList(new SubQuery<TStoreNoCB>() {
			public void query(TStoreNoCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreNoRBhv, tStoreNoRCB, queryUpdateSettingsLogic.getQuerySetter(tStoreNoRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreNoRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [ON推-品向-1026] 入庫No帳票テーブル追加により日次処理変更 2015.11.24 kawana End

		// ===== 入庫No.削除 =====
		// 削除条件
		TStoreNoCB tStoreNoCB = tStoreNoBhv.newMyConditionBean();
		// 在庫.入庫NoID
		tStoreNoCB.query().notExistsTStockList(new SubQuery<TStockCB>() {
			public void query(TStockCB subCB) {
			}
		});
		// 出荷指示ボディ.指定入庫NoID
		tStoreNoCB.query().notExistsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
			public void query(TShippingInstBCB subCB) {
			}
		});
		// 引当指示ボディ.指定入庫NoID
		tStoreNoCB.query().notExistsTAllocInstBList(new SubQuery<TAllocInstBCB>() {
			public void query(TAllocInstBCB subCB) {
			}
		});
		// 在庫移動指示ボディ.入庫NoID
		tStoreNoCB.query().notExistsTMoveInstBList(new SubQuery<TMoveInstBCB>() {
			public void query(TMoveInstBCB subCB) {
			}
		});
		// 棚卸ボディ.入庫NoID
		tStoreNoCB.query().notExistsTInventoryBList(new SubQuery<TInventoryBCB>() {
			public void query(TInventoryBCB subCB) {
			}
		});
		// 入庫No.元入庫NoID
		tStoreNoCB.query().notExistsTStoreNoSelfList(new SubQuery<TStoreNoCB>() {
			public void query(TStoreNoCB subCB) {
			}
		});
		// [ON推-品向-1026] 入庫No帳票テーブル追加により日次処理変更 2015.11.25 kawana Start
		tStoreNoCB.query().notExistsTStoreNoRAsOne(new SubQuery<TStoreNoRCB>() {
			@Override
			public void query(TStoreNoRCB subCB) {
			}

		});
		// [ON推-品向-1026] 入庫No帳票テーブル追加により日次処理変更 2015.11.25 kawana End

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		int storeNoDelCount = queryUpdateLogic.queryDeleteWithSelect(tStoreNoBhv, tStoreNoCB, queryUpdateSettingsLogic.getQuerySetter(tStoreNoBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreNoBhv.asTableDbName().toUpperCase(), String.valueOf(storeNoDelCount));
	}

	/**
	 * <h2>未使用の在庫受払を検索(上限付)</h2>
	 *
	 * @param clientId
	 * @param centerId
	 * @param hMoveDay
	 */
	private List<TStockInout> stock_selectStockInoutNoUse(final long clientId, final long centerId, String hMoveDay) {

		// 削除条件
		TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();

		// [ON推-品向-499] 在庫受払の履歴移動の条件にセンタID,荷主IDを追加 2014.12.26 kawana Start
		// センタID
		cb.query().queryTStock().queryMLocation().setCenterId_Equal(centerId);
		// 荷主ID
		cb.query().queryTStock().setClientId_Equal(clientId);
		// [ON推-品向-499] 在庫受払の履歴移動の条件にセンタID,荷主IDを追加 2014.12.26 kawana End
		// 在庫移動実績ボディID
		cb.query().setMoveRecordBId_IsNull();
		// 入庫実績ボディID
		cb.query().setStoreRecordBId_IsNull();
		// 引当指示ボディID
		cb.query().setAllocInstBId_IsNull();
		// 処理日
		cb.query().setProcessDt_LessEqual(hMoveDay);
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更(出庫ボディからの参照条件を削除) 2016.02.15 kawana
		// 在庫受払.初回在庫受払ID
		cb.query().notExistsTStockInoutByFsStockInoutIdSelfList(new SubQuery<TStockInoutCB>() {
			public void query(TStockInoutCB subCB) {
			}
		});
		// 在庫受払.前回在庫受払ID
		cb.query().notExistsTStockInoutByBfStockInoutIdSelfList(new SubQuery<TStockInoutCB>() {
			public void query(TStockInoutCB subCB) {
			}
		});

		// 上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		cb.fetchFirst(getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT));
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		// [ON推-品向-411] 履歴に入れる順番を在庫受払PK順にソート 2014.12.05 kawana Start
		cb.addOrderBy_PK_Asc();
		// [ON推-品向-411] 履歴に入れる順番を在庫受払PK順にソート 2014.12.05 kawana End

		// 検索結果を返却
		return tStockInoutBhv.selectList(cb);
	}

	private class ReturnDto_insertHStockInout {
		public int stockInsertCount;
		public int stockInoutInsertCount;
	}

	/**
	 * 在庫受払リストの登録
	 * @param tStockInoutList
	 * @param systemDt
	 */
	private ReturnDto_insertHStockInout insertHStockInout(List<TStockInout> tStockInoutList, final String systemDt) {

		List<Long> stockIdList = new ArrayList<Long>();

		// ===== 在庫受払データ履歴の登録 =====
		// 一括登録用 在庫受払データ履歴リスト
		List<HStockInout> hStockInoutListIns = new ArrayList<HStockInout>();
		// [ON推-品向-411] 在庫受払履歴はユーザ情報・更新情報を引継（画面に表示するため） 2014.12.05 kawana Start
		// 一括更新用 在庫受払データ履歴リスト(登録ユーザを上書きするため。登録時は共通列は共通機能で変更されてしまう。)
		List<HStockInout> hStockInoutListUpd = new ArrayList<HStockInout>();
		// [ON推-品向-411] 在庫受払履歴はユーザ情報・更新情報を引継（画面に表示するため） 2014.12.05 kawana End
		for (TStockInout tStockInout : tStockInoutList) {

			// 在庫受払データ履歴の登録データを作成
			HStockInout hStockInout = new HStockInout();

			// 履歴日
			// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana Start
			hStockInout.setHistDt(systemDt);
			// [検査-061] 履歴日を日次締前のシステム管理日付に修正 2014.11.21 kawana End
			// 初回在庫受払ID
			hStockInout.setFsStockInoutId(tStockInout.getFsStockInoutId());
			// 前回在庫受払ID
			hStockInout.setBfStockInoutId(tStockInout.getBfStockInoutId());
			// 処理日
			hStockInout.setProcessDt(tStockInout.getProcessDt());
			// 処理区分ID
			hStockInout.setProcessTypeId(tStockInout.getProcessTypeId());
			// 処理No.
			hStockInout.setProcessNo(tStockInout.getProcessNo());
			// 赤黒区分
			hStockInout.setCorrectType(tStockInout.getCorrectType());
			// 在庫ID
			hStockInout.setStockId(tStockInout.getStockId());
			// 入出庫区分
			hStockInout.setInoutType(tStockInout.getInoutType());
			// 受払数
			hStockInout.setStockInoutNum(tStockInout.getStockInoutNum());
			// 削除フラグ
			hStockInout.setDelFlg(tStockInout.getDelFlg());
			// 一括登録用 在庫受払データ履歴リストに追加する
			hStockInoutListIns.add(hStockInout);

			// [ON推-品向-411] 在庫受払履歴の登録情報を引継（画面に表示するため） 2014.12.05 kawana Start
			// 在庫受払データ履歴の登録データを作成
			HStockInout hStockInoutUpd = new HStockInout();
			// 登録日時
			hStockInoutUpd.setAddDt(tStockInout.getAddDt());
			// 登録ユーザ
			hStockInoutUpd.setAddUser(tStockInout.getAddUser());
			// 登録プロセス
			hStockInoutUpd.setAddProcess(tStockInout.getAddProcess());

			// 一括更新用リストに追加
			hStockInoutListUpd.add(hStockInoutUpd);
			// [ON推-品向-411] 在庫受払履歴の登録情報を引継（画面に表示するため） 2014.12.05 kawana End

			// 在庫IDリストに追加
			stockIdList.add(tStockInout.getStockId());
		}

		// 在庫履歴の登録
		int insStockCount = commonLogic.insertNotExistsHStock(stockIdList);

		// [ON推-品向-411] 在庫受払履歴はユーザ情報・更新情報を引継（画面に表示するため） 2014.12.05 kawana Start
		for (int i = 0; i < hStockInoutListIns.size(); i++) {
			// 登録用
			HStockInout ins = hStockInoutListIns.get(i);
			// 更新用
			HStockInout upd = hStockInoutListUpd.get(i);

			// 登録実行
			hStockInoutBhv.insert(ins);

			// 登録情報を上書き設定
			// 登録日時
			ins.setAddDt(upd.getAddDt());
			// 登録ユーザ
			ins.setAddUser(upd.getAddUser());
			// 登録プロセス
			ins.setAddProcess(upd.getAddProcess());

			// 更新実行
			hStockInoutBhv.update(ins);
		}
		// [ON推-品向-411] 在庫受払履歴はユーザ情報・更新情報を引継（画面に表示するため） 2014.12.05 kawana End

		// 戻り値を作成
		ReturnDto_insertHStockInout result = new ReturnDto_insertHStockInout();
		result.stockInsertCount = insStockCount;
		result.stockInoutInsertCount = hStockInoutListIns.size();

		return result;
	}

	// [EC-CT1-044] メモリ不足対応(処理数を制限するため全体的な流れを変更) 2015.06.11 kawana End
}
