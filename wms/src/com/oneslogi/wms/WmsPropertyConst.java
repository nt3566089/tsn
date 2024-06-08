package com.oneslogi.wms;

import com.oneslogi.base.PropertyConst;

/**
 * プロパティマスタのデフォルト値設定クラス
 *
 */

public class WmsPropertyConst extends PropertyConst {

	/** 一括処理件数 (日次締処理で使用)（デフォルト値:1000）*/
	public static final PropertySetting BATCH_DATA_COUNT = new PropertySetting("batchDataCount", "1000");
	/** 出力可能件数（入庫ラベル）(0:制限なし)（デフォルト値:500）*/
	public static final PropertySetting ALLOW_QUERY_COUNT_TO_REPORT_STORE_LABEL = new PropertySetting("allowQueryCountToReportStoreLabel", "500");
	/** 入荷予定入力の入荷予定日のデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting RECEIVE_PLAN_INPUT_DT_DEF_FLG = new PropertySetting("receivePlanInputDtDefFlg", "1");
	/** 伝票別入荷一覧の入荷予定日Fromのデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting SLIP_NO_RECEIVE_LIST_DT_FROM_DEF_FLG = new PropertySetting("slipNoReceiveListDtFromDefFlg", "1");
	/** 伝票別入荷一覧の入荷予定日Toのデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting SLIP_NO_RECEIVE_LIST_DT_TO_DEF_FLG = new PropertySetting("slipNoReceiveListDtToDefFlg", "1");
	/** 出庫指示一覧の日付Fromのデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting SHIPPING_INST_LIST_DT_FROM_DEF_FLG = new PropertySetting("shippingInstListDtFromDefFlg", "1");
	/** 出庫指示一覧の日付Toのデフォルト設定(1:設定する 0:設定しない)（デフォルト値:）*/
	public static final PropertySetting SHIPPING_INST_LIST_DT_TO_DEF_FLG = new PropertySetting("shippingInstListDtToDefFlg", "1");
	/** 出荷指示入力の納品予定日のデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting SHIPPING_PLAN_INPUT_DELIV_PLAN_DT_DEF_FLG = new PropertySetting("shippingPlanInputDelivPlanDtDefFlg", "1");
	/** 出荷指示入力の作業日のデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting SHIPPING_PLAN_INPUT_WORK_DT_DEF_FLG = new PropertySetting("shippingPlanInputWorkDtDefFlg", "1");
	/** 出荷指示入力の出荷日のデフォルト設定(1:設定する 0:設定しない)（デフォルト値:1）*/
	public static final PropertySetting SHIPPING_PLAN_INPUT_SHIPPING_DT_DEF_FLG = new PropertySetting("shippingPlanInputShippingDtDefFlg", "1");
	/** 日次処理未実施警告時間（単位：分）（デフォルト値:null（警告なし））*/
	public static final PropertySetting SYSTEM_DT_CHECK_TIME = new PropertySetting("systemDtCheckTime", null);
	/** 初期データ取込エラー許容件数（デフォルト値:100） */
	public static final PropertySetting ALLOW_DATA_INPUT_ERROR_COUNT = new PropertySetting("allowDataInputErrorCount", "100");
	/** 初期データ取込コミット単位件数（デフォルト値:100）*/
	public static final PropertySetting DATA_INPUT_COMMIT_UNIT_NUM = new PropertySetting("dataInputCommitUnitNum", "100");
	/** 郵便番号マスタ存在チェック有効/無効(1:有効 0:無効)（デフォルト値:0） */
	public static final PropertySetting ZIP_CD_EXISTS_CHECK_FLG = new PropertySetting("zipCdExistsCheckFlg", "0");
	// [ON推-品向-1173] 標準検索引当と商品単位検索引当を一本化(不要な設定を削除) 2016.07.19 kawana
	// [#423] 非同期処理のジョブCDを設定マスタに追加 2016.12.09 kawana Start
	/** 出庫指示バッチのジョブCD */
	public static final PropertySetting SHIPPING_INST_BATCH_JOB_CD = new PropertySetting("shippingInstBatchJobCd", "wmsShippingInstBatch");
	/** 日次締処理バッチのジョブCD */
	public static final PropertySetting DAILY_BATCH_JOB_CD = new PropertySetting("dailyBatchJobCd", "wmsDailyBatch");
	// [#423] 非同期処理のジョブCDを設定マスタに追加 2016.12.09 kawana End
	// [##1977] HTｼﾘｱﾙ検品の範囲を設定マスタに追加 2017.6.28 nayzaw Start
	/** HTｼﾘｱﾙ検品の範囲 */
	public static final PropertySetting ALLOW_INSERT_COUNT = new PropertySetting("allowInsertCount", "1000");
	// [##1977] HTｼﾘｱﾙ検品の範囲を設定マスタに追加 2017.6.28 nayzaw End
	// [#2237] トータル在庫問合せの表示件数のチェックを追加 2017.8.14 kawana Start
	/** クライアント端末返却可能リスト件数 */
	public static final PropertySetting ALLOW_RESPONSE_LIST_COUNT = new PropertySetting("allowResponseListCount", "1000");
	// [#2237] トータル在庫問合せの表示件数のチェックを追加 2017.8.14 kawana End
	// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add Start
	/** 荷姿グループマスタメンテナンスの最大荷姿件数(帳票の最大に合わせてデフォルト値:3) */
	public static final PropertySetting MAX_SHAPE_COUNT = new PropertySetting("maxShapeCount", "3");
	// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add End
	//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka Start
	/** 出退勤・休憩入力パスワード入力有無 */
	public static final PropertySetting ATTENDANCE_ENTRY_PASSWORD_FLG = new PropertySetting("attendanceEntryPasswordFlg", "0");
	//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka End
	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
	/** テストモード有無 */
	public static final PropertySetting ATTENDANCE_TEST_MODE_FLG = new PropertySetting("attendanceTestModeFlg", "0");
	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End
}
