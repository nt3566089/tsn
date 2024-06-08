package com.oneslogi.wms.logic.daily;

import javax.inject.Inject;

import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.HInventoryBCB;
import com.oneslogi.base.dbflute.cbean.HInventoryHCB;
import com.oneslogi.base.dbflute.cbean.HMoveBCB;
import com.oneslogi.base.dbflute.cbean.HMoveHCB;
import com.oneslogi.base.dbflute.cbean.HPackingBCB;
import com.oneslogi.base.dbflute.cbean.HPackingHCB;
import com.oneslogi.base.dbflute.cbean.HReceiveBCB;
import com.oneslogi.base.dbflute.cbean.HReceiveHCB;
import com.oneslogi.base.dbflute.cbean.HReceiveSpareCB;
import com.oneslogi.base.dbflute.cbean.HShippingBCB;
import com.oneslogi.base.dbflute.cbean.HShippingHCB;
import com.oneslogi.base.dbflute.cbean.HShippingSpareCB;
import com.oneslogi.base.dbflute.cbean.HStockCB;
import com.oneslogi.base.dbflute.cbean.HStockInoutCB;
import com.oneslogi.base.dbflute.cbean.HStockReportCB;
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
import com.oneslogi.base.dbflute.exbhv.HStockReportBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;

/**
 * 日次締処理履歴削除ロジッククラス
 */
public class DailyHistoryDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private HStockReportBhv hStockReportBhv;
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
	// [#2253]予備項目対応 2017.09.28 sampei Start
	@Inject
	private HReceiveSpareBhv hReceiveSpareBhv;
	@Inject
	private HShippingSpareBhv hShippingSpareBhv;
	// [#2253]予備項目対応 2017.09.28 sampei End

	// ===== 使用ロジック =====

	@Inject
	private DailyCommonLogic commonLogic;
	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;

	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

	/**
	 * <h2>履歴データ削除処理を行う。</h2>
	 * <pre>
	 * 履歴データの削除処理を行う。
	 * 【対象日の取得処理】を呼び出して、履歴保持期間が過ぎた下記履歴データの【削除実行処理】を行う。
	 * ・入荷予備履歴削除
	 * ・入荷ボディ履歴削除
	 * ・入荷ヘッダ履歴削除
	 * ・梱包ボディ履歴削除
	 * ・梱包ヘッダ履歴削除
	 * ・出荷予備履歴削除
	 * ・出荷ボディ履歴削除
	 * ・出荷ヘッダ履歴削除
	 * ・棚卸ボディ履歴削除
	 * ・棚卸ヘッダ履歴削除
	 * ・在庫移動ボディ履歴削除
	 * ・在庫移動ヘッダ履歴削除
	 * ・在庫受払データ履歴削除
	 * ・在庫日報履歴削除
	 * ・在庫履歴削除
	 *
	 * 「【運用ログの開始処理】、【運用ログの終了処理】を使用しログを記録する。
	 * 各履歴の削除処理ごとに【運用ログ追加処理】を行う。
	 *
	 * 【運用ログの開始処理】
	 * ・{@link DailyCommonLogic#startLogSection(String, String, String...) 運用ログの開始メソッド}を呼び出す。
	 *
	 * 【運用ログの終了処理】
	 * ・{@link DailyCommonLogic#endLogSection() 運用ログの終了メソッド}を呼び出す。
	 *
	 * 【対象日の取得処理】
	 * ・{@link DailyCommonLogic#getTargetDay(String, Long) 対象日の取得メソッド}を呼び出す。
	 *
	 * 【運用ログ追加処理】
	 * ・{@link DailyCommonLogic#addLog(String, String...) 運用ログ追加メソッド}を呼び出す。
	 *
	 * 【削除実行処理】
	 * ・{@link DailyCommonLogic#queryDeleteWithSelect(AbstractBehaviorWritable, AbstractConditionBean, AbstractQuerySetter) 削除実行メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主センタID・センタID・前回システム管理日付（現在システム日付）
	 * @param param パラメータマスタ：履歴保持期間
	 */
	public void historyDataDelete(MClientCenter clientCenter, MParam param) {

		// ===== 初期処理 =====

		// [#1530] 対象日をログ出力 2017.04.19 kawana Start

		// 荷主ID
		final long clientId = clientCenter.getClientId();
		// センタID
		final long centerId = clientCenter.getCenterId();
		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// 履歴保持期間
		final long keepingDays = param.getHKeepingDays();

		// 削除対象日に パラメータ.前回システム管理日付 － パラメータ.履歴保持期間 を設定する
		String delDay = null;

		if (0 < keepingDays) {
			try {
				delDay = commonLogic.getTargetDay(systemDt, keepingDays);
			} catch (Exception e) {
				getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
			}
		}

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_DELETE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT_HIST_KEEP_DAYS
				, new String[] { commonLogic.getDateString(systemDt), String.valueOf(keepingDays), commonLogic.getDateString(delDay) });

		// 履歴保持期間のチェック
		if (keepingDays < 1) {

			// 運用ログの終了
			commonLogic.endLogSection();
			return;
		}

		boolean preAutoDelFlg = this.getBehaviorAutoDelFlg();
		// 削除フラグの条件付加を停止
		this.setBehaviorAutoDelFlg(false);

		// [#1530] 対象日をログ出力 2017.04.19 kawana End

		// [#2253]予備項目対応 2017.09.28 sampei Start

		// ===== 入荷予備履歴削除 =====

		{
			HReceiveSpareCB hReceiveSpareCB = hReceiveSpareBhv.newConditionBean();
			// 履歴日
			hReceiveSpareCB.query().queryHReceiveB().queryHReceiveH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hReceiveSpareCB.query().queryHReceiveB().queryHReceiveH().setClientId_Equal(clientId);
			// センタID
			hReceiveSpareCB.query().queryHReceiveB().queryHReceiveH().setCenterId_Equal(centerId);

			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hReceiveSpareBhv, hReceiveSpareCB, queryUpdateSettingsLogic.getQuerySetter(hReceiveSpareBhv));

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hReceiveSpareBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// [#2253]予備項目対応 2017.09.28 sampei End

		// ===== 入荷ボディ履歴削除 =====

		{
			HReceiveBCB hReceiveBCB = hReceiveBBhv.newMyConditionBean();
			// 履歴日
			hReceiveBCB.query().queryHReceiveH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hReceiveBCB.query().queryHReceiveH().setClientId_Equal(clientId);
			// センタID
			hReceiveBCB.query().queryHReceiveH().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hReceiveBBhv, hReceiveBCB, queryUpdateSettingsLogic.getQuerySetter(hReceiveBBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hReceiveBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 入荷ヘッダ履歴削除 =====

		{
			HReceiveHCB hReceiveHCB = hReceiveHBhv.newMyConditionBean();
			// 履歴日
			hReceiveHCB.query().setHistDt_LessEqual(delDay);
			// 荷主ID
			hReceiveHCB.query().setClientId_Equal(clientId);
			// センタID
			hReceiveHCB.query().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hReceiveHBhv, hReceiveHCB, queryUpdateSettingsLogic.getQuerySetter(hReceiveHBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hReceiveHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 梱包ボディ履歴削除 =====

		{
			HPackingBCB hPackingBCB = hPackingBBhv.newMyConditionBean();
			// 履歴日
			hPackingBCB.query().queryHPackingH().queryHShippingH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hPackingBCB.query().queryHPackingH().queryHShippingH().setClientId_Equal(clientId);
			// センタID
			hPackingBCB.query().queryHPackingH().queryHShippingH().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hPackingBBhv, hPackingBCB, queryUpdateSettingsLogic.getQuerySetter(hPackingBBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hPackingBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 梱包ヘッダ履歴削除 =====

		{
			HPackingHCB hPackingHCB = hPackingHBhv.newMyConditionBean();
			// 履歴日
			hPackingHCB.query().queryHShippingH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hPackingHCB.query().queryHShippingH().setClientId_Equal(clientId);
			// センタID
			hPackingHCB.query().queryHShippingH().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hPackingHBhv, hPackingHCB, queryUpdateSettingsLogic.getQuerySetter(hPackingHBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hPackingHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// [#2253]予備項目対応 2017.09.28 sampei Start

		// ===== 出荷予備履歴削除 =====

		{
			HShippingSpareCB hShippingSpareCB = hShippingSpareBhv.newMyConditionBean();
			// 履歴日
			hShippingSpareCB.query().queryHShippingB().queryHShippingH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hShippingSpareCB.query().queryHShippingB().queryHShippingH().setClientId_Equal(clientId);
			// センタID
			hShippingSpareCB.query().queryHShippingB().queryHShippingH().setCenterId_Equal(centerId);

			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hShippingSpareBhv, hShippingSpareCB, queryUpdateSettingsLogic.getQuerySetter(hShippingSpareBhv));

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hShippingSpareBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}


		// [#2253]予備項目対応 2017.09.28 sampei End

		// ===== 出荷ボディ履歴削除 =====

		{
			HShippingBCB hShippingBCB = hShippingBBhv.newMyConditionBean();
			// 履歴日
			hShippingBCB.query().queryHShippingH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hShippingBCB.query().queryHShippingH().setClientId_Equal(clientId);
			// センタID
			hShippingBCB.query().queryHShippingH().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hShippingBBhv, hShippingBCB, queryUpdateSettingsLogic.getQuerySetter(hShippingBBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hShippingBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 出荷ヘッダ履歴削除 =====

		{
			HShippingHCB hShippingHCB = hShippingHBhv.newMyConditionBean();
			// 履歴日
			hShippingHCB.query().setHistDt_LessEqual(delDay);
			// 荷主ID
			hShippingHCB.query().setClientId_Equal(clientId);
			// センタID
			hShippingHCB.query().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hShippingHBhv, hShippingHCB, queryUpdateSettingsLogic.getQuerySetter(hShippingHBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hShippingHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 棚卸ボディ履歴削除 =====

		{
			HInventoryBCB hInventoryBCB = hInventoryBBhv.newMyConditionBean();
			// 履歴日
			hInventoryBCB.query().queryHInventoryH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hInventoryBCB.query().queryHInventoryH().setClientId_Equal(clientId);
			// センタID
			hInventoryBCB.query().queryHInventoryH().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hInventoryBBhv, hInventoryBCB, queryUpdateSettingsLogic.getQuerySetter(hInventoryBBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hInventoryBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 棚卸ヘッダ履歴削除 =====

		{
			HInventoryHCB hInventoryHCB = hInventoryHBhv.newMyConditionBean();
			// 履歴日
			hInventoryHCB.query().setHistDt_LessEqual(delDay);
			// 荷主ID
			hInventoryHCB.query().setClientId_Equal(clientId);
			// センタID
			hInventoryHCB.query().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hInventoryHBhv, hInventoryHCB, queryUpdateSettingsLogic.getQuerySetter(hInventoryHBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hInventoryHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 在庫移動ボディ履歴削除 =====

		{
			HMoveBCB hMoveBCB = hMoveBBhv.newMyConditionBean();
			// 履歴日
			hMoveBCB.query().queryHMoveH().setHistDt_LessEqual(delDay);
			// 荷主ID
			hMoveBCB.query().queryHMoveH().setClientId_Equal(clientId);
			// センタID
			hMoveBCB.query().queryHMoveH().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hMoveBBhv, hMoveBCB, queryUpdateSettingsLogic.getQuerySetter(hMoveBBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hMoveBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 在庫移動ヘッダ履歴削除 =====

		{
			HMoveHCB hMoveHCB = hMoveHBhv.newMyConditionBean();
			// 履歴日
			hMoveHCB.query().setHistDt_LessEqual(delDay);
			// 荷主ID
			hMoveHCB.query().setClientId_Equal(clientId);
			// センタID
			hMoveHCB.query().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hMoveHBhv, hMoveHCB, queryUpdateSettingsLogic.getQuerySetter(hMoveHBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hMoveHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 在庫受払データ履歴削除 =====

		{
			HStockInoutCB hStockInoutCB = hStockInoutBhv.newMyConditionBean();
			// 履歴日
			hStockInoutCB.query().setHistDt_LessEqual(delDay);
			// 荷主ID
			hStockInoutCB.query().queryHStock().setClientId_Equal(clientId);
			// センタID
			hStockInoutCB.query().queryHStock().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hStockInoutBhv, hStockInoutCB, queryUpdateSettingsLogic.getQuerySetter(hStockInoutBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hStockInoutBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 在庫日報履歴削除 =====

		{
			HStockReportCB hStockReportCB = hStockReportBhv.newMyConditionBean();
			// 履歴日
			hStockReportCB.query().setHistDt_LessEqual(delDay);
			// 荷主ID
			hStockReportCB.query().queryHStock().setClientId_Equal(clientId);
			// センタID
			hStockReportCB.query().queryHStock().setCenterId_Equal(centerId);

			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delNum = queryUpdateLogic.queryDeleteWithSelect(hStockReportBhv, hStockReportCB, queryUpdateSettingsLogic.getQuerySetter(hStockReportBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hStockReportBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 在庫履歴削除 =====

		{
			HStockCB hStockCB = hStockBhv.newMyConditionBean();
			// 在庫日報履歴.在庫ID
			hStockCB.query().notExistsHStockReportList(new SubQuery<HStockReportCB>() {
				public void query(HStockReportCB subCB) {
				}
			});
			// 在庫受払データ履歴.在庫ID
			hStockCB.query().notExistsHStockInoutList(new SubQuery<HStockInoutCB>() {
				public void query(HStockInoutCB subCB) {
				}
			});
			// 入荷ボディ履歴.在庫ID
			hStockCB.query().notExistsHReceiveBList(new SubQuery<HReceiveBCB>() {
				public void query(HReceiveBCB subCB) {
				}
			});
			// 梱包ボディ履歴.在庫ID
			hStockCB.query().notExistsHPackingBList(new SubQuery<HPackingBCB>() {
				public void query(HPackingBCB subCB) {
				}
			});
			// 在庫移動ボディ履歴.在庫ID
			hStockCB.query().notExistsHMoveBList(new SubQuery<HMoveBCB>() {
				public void query(HMoveBCB subCB) {
				}
			});
			// 棚卸ボディ履歴.在庫ID
			hStockCB.query().notExistsHInventoryBList(new SubQuery<HInventoryBCB>() {
				public void query(HInventoryBCB subCB) {
				}
			});

			// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana Start
			// 削除実行
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
			int delCount = queryUpdateLogic.queryDeleteWithSelect(hStockBhv, hStockCB, queryUpdateSettingsLogic.getQuerySetter(hStockBhv));
			// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hStockBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
			// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana End
		}

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(preAutoDelFlg);

		// 運用ログの終了
		commonLogic.endLogSection();
	}

}
