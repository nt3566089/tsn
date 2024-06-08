package com.oneslogi.wms.logic.daily;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.cbean.TInventoryRCB;
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
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordRCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
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
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;

/**
 * 日次締処理未処理データ削除ロジッククラス
 */
public class DailyUnprocessDataDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TStockInoutBhv tStockInoutBhv;
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
	private TInventoryRBhv tInventoryRBhv;
	//[#2253]予備項目対応 2017.09.28 sampei Start
	@Inject
	private TReceivePlanSpareBhv tReceivePlanSpareBhv;
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	//[#2253]予備項目対応 2017.09.28 sampei Start


	// ===== 使用ロジッククラス =====

	@Inject
	private DailyCommonLogic commonLogic;
	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;

	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

	/**
	 * <h2>未処理データ削除処理を行う。</h2>
	 * <pre>
	 * 【対象日の取得処理】、【YYYY/MM/DD形式変換処理】を呼び出して、削除保持期間を過ぎた未処理のトランザクションデータを削除する。
	 * （ステータスが未処理またはエラーとなっているデータ）
	 * 初期処理後、ステータス用リストを設定する
	 * 【条件指定での更新処理】を呼出し、在庫受払を更新する、
	 * 【条件指定での削除実行処理】を呼出し、下記テーブルを削除する。
	 * ・入庫実績ボディ削除
	 * ・入庫実績ヘッダ削除
	 * ・入荷予定予備削除
	 * ・入荷予定ボディ削除
	 * ・入荷予定帳票削除
	 * ・入荷予定ヘッダ削除
	 * ・梱包ボディ削除
	 * ・梱包帳票削除
	 * ・梱包ヘッダ削除
	 * ・出庫ボディ削除
	 * ・出庫帳票削除
	 * ・入荷予定ヘッダ ⇒ 出庫ヘッダ リレーション削除
	 * ・出庫ヘッダ削除
	 * ・出荷指示予備削除
	 * ・出荷指示ボディ削除
	 * ・出荷指示ヘッダ削除
	 * ・ステータス用リスト設定
	 * ・棚卸入力履歴削除
	 * ・棚卸帳票削除
	 * ・棚卸ボディ削除
	 * ・在庫受払更新
	 * ・在庫移動実績ボディ削除
	 * ・在庫移動指示ボディ削除
	 * ・在庫移動指示帳票削除
	 * ・在庫移動指示ヘッダ削除
	 *
	 * 【運用ログの開始処理】、【運用ログの終了処理】、【運用ログ追加処理】を使用しログを記録する。
	 *
	 * 【運用ログの開始処理】
	 * ・{@link DailyCommonLogic#startLogSection(String, String, String...) 運用ログの開始メソッド}を呼び出す。
	 *
	 * 【対象日の取得処理】
	 * ・{@link DailyCommonLogic#getTargetDay(String, Long) 対象日の取得メソッド}を呼び出す。
	 *
	 * 【YYYY/MM/DD形式変換処理】
	 * ・{@link DailyCommonLogic#getDateString(String) YYYY/MM/DD形式変換メソッド}を呼び出す。
	 *
	 * 【運用ログの終了処理】
	 * ・{@link DailyCommonLogic#endLogSection() 運用ログの終了メソッド}を呼び出す。
	 *
	 * 【運用ログ追加処理】
	 * ・{@link DailyCommonLogic#addLog(String, String...) 運用ログ追加メソッド}を呼び出す。
	 *
	 * 【条件指定での削除実行処理】
	 * ・{@link DailyCommonLogic#queryDeleteWithSelect(AbstractBehaviorWritable, AbstractConditionBean, AbstractQuerySetter) 削除実行メソッド}を呼び出す。
	 *
	 * 【条件指定での更新処理】
	 * ・{@link DailyCommonLogic#queryUpdateWithSelect(AbstractBehaviorWritable, Entity, AbstractConditionBean, AbstractQuerySetter) 条件指定での更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID・センタID・前回システム管理日付（現在システム日付）
	 * @param param パラメータマスタ：削除保持期間
	 */
	public void unprocessDataDelete(MClientCenter clientCenter, MParam param) {

		// ===== 初期処理 =====

		// 荷主ID
		final long clientId = clientCenter.getClientId();
		// センタID
		final long centerId = clientCenter.getCenterId();
		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// 未処理データ保持期間
		final long keepingDays = param.getDKeepingDays();

		// 削除件数
		int delNum = 0;
		// ステータス用リスト
		List<String> statusList = new ArrayList<String>();

		// [#1530] 対象日をログ出力 2017.04.19 kawana Start

		// ===== 対象日の計算 =====

		String delDay = null;

		if (0 < keepingDays) {
			try {
				// 削除対象日に パラメータ.前回システム管理日付 － パラメータ.削除保持期間 を設定する
				delDay = commonLogic.getTargetDay(systemDt, keepingDays);
			} catch (Exception e) {
				getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
			}
		}

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_UNPROCESS_DATA_DELETE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT_UNPROCESS_KEEP_DAYS
				, new String[] { commonLogic.getDateString(systemDt), String.valueOf(keepingDays), commonLogic.getDateString(delDay) });

		// 削除保持期間のチェック
		if (keepingDays < 1) {

			// 運用ログの終了
			commonLogic.endLogSection();
			return;
		}

		// 削除フラグの条件付加を停止する
		boolean preAutoDelFlg = this.getBehaviorAutoDelFlg();
		this.setBehaviorAutoDelFlg(false);

		// [#1530] 対象日をログ出力 2017.04.19 kawana End

		// 在庫受払更新用データ編集
		TStockInout tStockInout = new TStockInout();
		// 入庫実績ボディID
		tStockInout.setStoreRecordBId(null);
		TReceivePlanH receiveStatus = new TReceivePlanH();
		// ===== ステータス用リスト設定 =====
		// 入荷ステータス('01'未入荷 )
		receiveStatus.setReceiveStatus_$01();
		statusList.add(receiveStatus.getReceiveStatus());
		// [ON推-品向-175][ON推-品向-176] 入荷ステータスに90:入荷削除を追加 2014.11.28 kawana Start
		// 入荷ステータス('90'入荷削除)
		receiveStatus.setReceiveStatus_$90();
		statusList.add(receiveStatus.getReceiveStatus());
		// [ON推-品向-175][ON推-品向-176] 入荷ステータスに90:入荷削除を追加 2014.11.28 kawana End
		// 入荷ステータス('99'エラー)
		receiveStatus.setReceiveStatus_$99();
		statusList.add(receiveStatus.getReceiveStatus());

		// ===== 在庫受払更新 =====
		TStockInoutCB tStockInoutCB = tStockInoutBhv.newMyConditionBean();
		// 荷主ID
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tStockInoutCB.query().queryTStoreRecordB().queryTStoreRecordH().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		// 更新実行
		queryUpdateLogic.queryUpdateWithSelect(tStockInoutBhv, tStockInout, tStockInoutCB, queryUpdateSettingsLogic.getQuerySetter(tStockInoutBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// ===== 入庫実績ボディ削除 =====
		TStoreRecordBCB tStoreRecordBCB = tStoreRecordBBhv.newMyConditionBean();
		// 荷主ID
		tStoreRecordBCB.query().queryTStoreRecordH().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tStoreRecordBCB.query().queryTStoreRecordH().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tStoreRecordBCB.query().queryTStoreRecordH().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tStoreRecordBCB.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tStoreRecordBCB.query().queryTStoreRecordH().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreRecordBBhv, tStoreRecordBCB, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreRecordBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#224][2.1.0-CT-044] 入庫実績帳票テーブルの削除処理を追加 2016.11.09 kawana Start

		// ===== 入庫実績帳票削除 =====
		TStoreRecordRCB tStoreRecordRCB = tStoreRecordRBhv.newMyConditionBean();
		// 荷主ID
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tStoreRecordRCB.query().queryTStoreRecordH().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		// 削除実行
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreRecordRBhv, tStoreRecordRCB, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordRBhv));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreRecordRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#224][2.1.0-CT-044] 入庫実績帳票テーブルの削除処理を追加 2016.11.09 kawana End

		// ===== 入庫実績ヘッダ削除 =====
		TStoreRecordHCB tStoreRecordHCB = tStoreRecordHBhv.newMyConditionBean();
		// 荷主ID
		tStoreRecordHCB.query().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tStoreRecordHCB.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tStoreRecordHCB.query().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tStoreRecordHCB.query().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tStoreRecordHCB.query().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tStoreRecordHBhv, tStoreRecordHCB, queryUpdateSettingsLogic.getQuerySetter(tStoreRecordHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tStoreRecordHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#2253]予備項目対応 2017.09.28 sampei Start

		// ===== 入荷予定予備削除 =====
		TReceivePlanSpareCB tReceivePlanSpareCB = tReceivePlanSpareBhv.newMyConditionBean();
		// 荷主ID
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tReceivePlanSpareCB.query().queryTReceivePlanB().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		//削除実行
		delNum = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanSpareBhv, tReceivePlanSpareCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanSpareBhv));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanSpareBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#2253]予備項目対応 2017.09.28 sampei End

		// ===== 入荷予定ボディ削除 =====
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
		// 荷主ID
		tReceivePlanBCB.query().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tReceivePlanBCB.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tReceivePlanBCB.query().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tReceivePlanBCB.query().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tReceivePlanBCB.query().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanBBhv, tReceivePlanBCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 入荷予定帳票削除 =====
		TReceivePlanRCB tReceivePlanRCB = tReceivePlanRBhv.newMyConditionBean();
		// 荷主ID
		tReceivePlanRCB.query().queryTReceivePlanH().setClientId_Equal(clientId);
		// センタID
		tReceivePlanRCB.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		// 入荷予定日
		tReceivePlanRCB.query().queryTReceivePlanH().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tReceivePlanRCB.query().queryTReceivePlanH().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
		tReceivePlanRCB.query().queryTReceivePlanH().notExistsTReceivePlanHSelfList(new SubQuery<TReceivePlanHCB>() {
			public void query(TReceivePlanHCB subCB) {
			}
		});

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanRBhv, tReceivePlanRCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 入荷予定ヘッダ削除 =====
		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();
		// 荷主ID
		tReceivePlanHCB.query().setClientId_Equal(clientId);
		// センタID
		tReceivePlanHCB.query().setCenterId_Equal(centerId);
		// 入荷予定日
		tReceivePlanHCB.query().setReceivePlanDt_LessEqual(delDay);
		// 入荷ステータス
		tReceivePlanHCB.query().setReceiveStatus_InScope(statusList);
		// 入荷予定ヘッダID
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

		// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana Start
		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		int delCount = queryUpdateLogic.queryDeleteWithSelect(tReceivePlanHBhv, tReceivePlanHCB, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tReceivePlanHBhv.asTableDbName().toUpperCase(), String.valueOf(delCount));
		// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana End

		// ===== ステータス用リスト設定 =====
		statusList = new ArrayList<String>();
		TPickingH pickingStatus = new TPickingH();

		// 出庫ステータス('10'未出荷)
		pickingStatus.setPickingStatus_$10();
		statusList.add(pickingStatus.getPickingStatus());
		// 出庫ステータス('90'キャンセル)
		pickingStatus.setPickingStatus_$90();
		statusList.add(pickingStatus.getPickingStatus());
		// 出庫ステータス('99'エラー)
		pickingStatus.setPickingStatus_$99();
		statusList.add(pickingStatus.getPickingStatus());

		// ===== 梱包ボディ削除 =====
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		// 荷主ID
		tPackingBCB.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().setClientId_Equal(clientId);
		// センタID
		tPackingBCB.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().setCenterId_Equal(centerId);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana Start
		// 出荷日
		tPackingBCB.query().queryTPickingB().queryTShippingInstB().queryTShippingInstH().setShippingDt_LessEqual(delDay);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana End
		// 出庫ステータス
		tPackingBCB.query().queryTPickingB().queryTPickingH().setPickingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPackingBBhv, tPackingBCB, queryUpdateSettingsLogic.getQuerySetter(tPackingBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPackingBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 梱包帳票削除 =====
		TPackingRCB tPackingRCB = tPackingRBhv.newMyConditionBean();
		// 梱包ヘッダID
		tPackingRCB.query().queryTPackingH().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});
		// 出庫ステータス
		tPackingRCB.query().queryTPackingH().queryTPickingH().setPickingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPackingRBhv, tPackingRCB, queryUpdateSettingsLogic.getQuerySetter(tPackingRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPackingRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 梱包ヘッダ削除 =====
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		// 梱包ヘッダID
		tPackingHCB.query().notExistsTPackingBList(new SubQuery<TPackingBCB>() {
			public void query(TPackingBCB subCB) {
			}
		});
		// 出庫ステータス
		tPackingHCB.query().queryTPickingH().setPickingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPackingHBhv, tPackingHCB, queryUpdateSettingsLogic.getQuerySetter(tPackingHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPackingHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 出庫ボディ削除 =====
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		// 荷主ID
		tPickingBCB.query().queryTShippingInstB().queryTShippingInstH().setClientId_Equal(clientId);
		// センタID
		tPickingBCB.query().queryTShippingInstB().queryTShippingInstH().setCenterId_Equal(centerId);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana Start
		// 出荷日
		tPickingBCB.query().queryTShippingInstB().queryTShippingInstH().setShippingDt_LessEqual(delDay);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana End
		// 出庫ステータス
		tPickingBCB.query().queryTPickingH().setPickingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPickingBBhv, tPickingBCB, queryUpdateSettingsLogic.getQuerySetter(tPickingBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPickingBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 出庫帳票削除 =====
		TPickingRCB tPickingRCB = tPickingRBhv.newMyConditionBean();
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
		tPickingRCB.query().queryTPickingH().setPickingStatus_InScope(statusList);

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
		relationClearCb.query().queryTPickingH().setPickingStatus_InScope(statusList);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tReceivePlanHBhv, relationClearEntity, relationClearCb, queryUpdateSettingsLogic.getQuerySetter(tReceivePlanHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.16 kawana End

		// ===== 出庫ヘッダ削除 =====

		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
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
		tPickingHCB.query().setPickingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tPickingHBhv, tPickingHCB, queryUpdateSettingsLogic.getQuerySetter(tPickingHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tPickingHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#2253]予備項目対応 2017.09.28 sampei Start

		// ===== 出荷指示予備削除 =====
		TShippingInstSpareCB tShippingInstSpareCB = tShippingInstSpareBhv.newMyConditionBean();
		// 荷主ID
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setClientId_Equal(clientId);
		// センタID
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setCenterId_Equal(centerId);
		// 出荷日
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setShippingDt_LessEqual(delDay);
		// 出荷ステータス
		tShippingInstSpareCB.query().queryTShippingInstB().queryTShippingInstH().setShippingStatus_InScope(statusList);

		// 削除実行
		delNum = queryUpdateLogic.queryDeleteWithSelect(tShippingInstSpareBhv, tShippingInstSpareCB, queryUpdateSettingsLogic.getQuerySetter(tShippingInstSpareBhv));

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tShippingInstSpareBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [#2253]予備項目対応 2017.09.28 sampei End

		// ===== 出荷指示ボディ削除 =====
		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
		// 荷主ID
		tShippingInstBCB.query().queryTShippingInstH().setClientId_Equal(clientId);
		// センタID
		tShippingInstBCB.query().queryTShippingInstH().setCenterId_Equal(centerId);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana Start
		// 出荷日
		tShippingInstBCB.query().queryTShippingInstH().setShippingDt_LessEqual(delDay);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana End
		// 出荷ステータス
		tShippingInstBCB.query().queryTShippingInstH().setShippingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tShippingInstBBhv, tShippingInstBCB, queryUpdateSettingsLogic.getQuerySetter(tShippingInstBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tShippingInstBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 出荷指示ヘッダ削除 =====
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		// 荷主ID
		tShippingInstHCB.query().setClientId_Equal(clientId);
		// センタID
		tShippingInstHCB.query().setCenterId_Equal(centerId);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana Start
		// 出荷日
		tShippingInstHCB.query().setShippingDt_LessEqual(delDay);
		// [C-EC-015] 納品予定日を任意入力に変更するため条件を出荷日に変更 2015.02.02 kawana End
		// 出荷ステータス
		tShippingInstHCB.query().setShippingStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tShippingInstHBhv, tShippingInstHCB, queryUpdateSettingsLogic.getQuerySetter(tShippingInstHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tShippingInstHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== ステータス用リスト設定 =====
		statusList = new ArrayList<String>();
		TMoveInstH moveInstStatus = new TMoveInstH();
		// 在庫移動指示ステータス('00'未作業)
		moveInstStatus.setMoveInstStatus_$00();
		statusList.add(moveInstStatus.getMoveInstStatus());
		// 在庫移動指示ステータス('99'取り消し)
		moveInstStatus.setMoveInstStatus_$99();
		statusList.add(moveInstStatus.getMoveInstStatus());

		// ===== 棚卸入力履歴削除 =====
		TInventoryInpHistCB tInventoryInpHistCB = tInventoryInpHistBhv.newMyConditionBean();
		// 荷主ID
		tInventoryInpHistCB.query().queryTInventoryB().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tInventoryInpHistCB.query().queryTInventoryB().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tInventoryInpHistCB.query().queryTInventoryB().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tInventoryInpHistCB.query().queryTInventoryB().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryInpHistBhv, tInventoryInpHistCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryInpHistBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryInpHistBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 棚卸帳票削除 =====
		TInventoryRCB tInventoryRCB = tInventoryRBhv.newMyConditionBean();
		// 荷主ID
		tInventoryRCB.query().queryTInventoryB().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tInventoryRCB.query().queryTInventoryB().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tInventoryRCB.query().queryTInventoryB().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tInventoryRCB.query().queryTInventoryB().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryRBhv, tInventoryRCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 棚卸ボディ削除 =====
		TInventoryBCB tInventoryBCB = tInventoryBBhv.newMyConditionBean();
		// 荷主ID
		tInventoryBCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tInventoryBCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tInventoryBCB.query().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tInventoryBCB.query().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tInventoryBBhv, tInventoryBCB, queryUpdateSettingsLogic.getQuerySetter(tInventoryBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tInventoryBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// 在庫受払更新用データ編集
		tStockInout = new TStockInout();
		// 在庫移動実績ボディボディID
		tStockInout.setMoveRecordBId(null);

		// ===== 在庫受払更新 =====
		tStockInoutCB = tStockInoutBhv.newMyConditionBean();
		// 荷主ID
		tStockInoutCB.query().queryTMoveRecordB().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tStockInoutCB.query().queryTMoveRecordB().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tStockInoutCB.query().queryTMoveRecordB().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tStockInoutCB.query().queryTMoveRecordB().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 更新実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tStockInoutBhv, tStockInout, tStockInoutCB, queryUpdateSettingsLogic.getQuerySetter(tStockInoutBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End

		// ===== 在庫移動実績ボディ削除 =====
		TMoveRecordBCB tMoveRecordBCB = tMoveRecordBBhv.newMyConditionBean();
		// 荷主ID
		tMoveRecordBCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tMoveRecordBCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tMoveRecordBCB.query().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tMoveRecordBCB.query().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveRecordBBhv, tMoveRecordBCB, queryUpdateSettingsLogic.getQuerySetter(tMoveRecordBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveRecordBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// ===== 在庫移動指示ボディ削除 =====
		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();
		// 荷主ID
		tMoveInstBCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tMoveInstBCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tMoveInstBCB.query().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tMoveInstBCB.query().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveInstBBhv, tMoveInstBCB, queryUpdateSettingsLogic.getQuerySetter(tMoveInstBBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveInstBBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [ON推-品向-1025] 在庫移動帳票テーブル追加により日次処理変更 2015.11.20 kawana Start

		// ===== 在庫移動指示帳票削除 =====
		TMoveInstRCB tMoveInstRCB = tMoveInstRBhv.newMyConditionBean();
		// 荷主ID
		tMoveInstRCB.query().queryTMoveInstH().setClientId_Equal(clientId);
		// センタID
		tMoveInstRCB.query().queryTMoveInstH().setCenterId_Equal(centerId);
		// 指示日
		tMoveInstRCB.query().queryTMoveInstH().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tMoveInstRCB.query().queryTMoveInstH().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveInstRBhv, tMoveInstRCB, queryUpdateSettingsLogic.getQuerySetter(tMoveInstRBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveInstRBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// [ON推-品向-1025] 在庫移動帳票テーブル追加により日次処理変更 2015.11.20 kawana End

		// ===== 在庫移動指示ヘッダ削除 =====
		TMoveInstHCB tMoveInstHCB = tMoveInstHBhv.newMyConditionBean();
		// 荷主ID
		tMoveInstHCB.query().setClientId_Equal(clientId);
		// センタID
		tMoveInstHCB.query().setCenterId_Equal(centerId);
		// 指示日
		tMoveInstHCB.query().setInstDt_LessEqual(delDay);
		// 在庫移動指示ステータス
		tMoveInstHCB.query().setMoveInstStatus_InScope(statusList);

		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		delNum = queryUpdateLogic.queryDeleteWithSelect(tMoveInstHBhv, tMoveInstHCB, queryUpdateSettingsLogic.getQuerySetter(tMoveInstHBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tMoveInstHBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(preAutoDelFlg);

		// 運用ログの終了
		commonLogic.endLogSection();
	}
}
