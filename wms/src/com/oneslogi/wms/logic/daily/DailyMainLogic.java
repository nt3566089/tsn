package com.oneslogi.wms.logic.daily;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.ScalarQuery;
import org.jboss.weld.exceptions.IllegalStateException;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.cbean.HStockInoutCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.HStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.ecorder.EcOrderDailyLogic;

/**
 * 日次締処理メインロジッククラス
 */
public class DailyMainLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private HStockInoutBhv hStockInoutBhv;
	@Inject
	private MParamBhv mParamBhv;
	//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.08.31 miyabe start
	@Inject
	private TPickingHBhv tPickingHBhv;
	//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.08.31 miyabe start
	// ===== 使用ロジッククラス =====

	// [EC-CT1-044] メモリ不足対応 - 処理クラスを分割 2015.06.11 kawana Start
	@Inject
	private DailyCommonLogic commonLogic;
	@Inject
	private DailyStockReportLogic stockReportLogic;
	@Inject
	private DailyUnprocessDataDeleteLogic unprocessDataDeleteLogic;
	@Inject
	private DailyHistoryDeleteLogic historyDeleteLogic;
	@Inject
	private DailyHistoryMoveLogic historyMoveLogic;
	// [EC-CT1-044] メモリ不足対応 - 処理クラスを分割 2015.06.11 kawana End

	// [C-EC-006] EC受注関連テーブルの日次処理追加 2015.01.30 kawana Start
	@Inject
	private EcOrderDailyLogic ecLogic;
	// [C-EC-006] EC受注関連テーブルの日次処理追加 2015.01.30 kawana End

	// [C-CWMS-0057] EDI データ削除対応 2016.09.13 ATK Add
	@Inject
	private DailyEdiDataDeleteLogic ediDataDeleteLogic;
	// [C-CWMS-0057] EDI データ削除対応 2016.09.13 ATK End

	// [#1697] ワークデータの削除処理追加 2017.04.20 kawana Start
	@Inject
	private DailyWorkDeleteLogic dailyWorkDeleteLogic;
	// [#1697] ワークデータの削除処理追加 2017.04.20 kawana End

	// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start
	@Inject
	private DailySerialNoDeleteLogic serialNoDeleteLogic;
	// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End

	// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start
	/**
	 * <h2>バッチ処理中フラグ更新</h2>
	 * <pre>
	 * 日次処理を行うセンタ・荷主のバッチ処理中フラグを「処理中」に更新する。
	 * 更新前にチェック処理を実行する。
	 * </pre>
	 * @param clientCenter
	 * @param errSts
	 */
	public void updateBatchProgress(MClientCenter clientCenter, ErrorStatus errSts) {
		// ===== 日次処理実行チェックメソッドを呼出 =====
		checkExecute(clientCenter, errSts);
		if (this.getErrorManager().size() > 0) {
			return;
		}

		// ===== 日次処理開始メソッドを呼出 =====
		commonLogic.dailyProcessStart(clientCenter, errSts);
		if (this.getErrorManager().size() > 0) {
			return;
		}
	}

	// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End

	/**
	 * <h2>日次メイン処理を行う。</h2>
	 * <pre>
	 * 日次処理のメイン処理を行う。
	 * 日次処理実行チェック後、下記順番で処理を実行する。
	 * ※各処理の内容については該当処理の概要を参照する。
	 *
	 * パラメータのシステム管理日付（翌稼働日） ＞ 現在のシステム管理日付の場合
	 *   01.【日次処理開始】
	 *   02.【在庫繰越処理】
	 *   03.【ECデータ削除処理】
	 *   04.【未処理データ削除処理】
	 *   05.【履歴データ削除処理】
	 *   06.【履歴データ移動処理】
	 *   07.【EDIデータ削除処理】
	 *   08.【ワークデータ削除処理】
	 *   09.【シリアルNo.データ削除処理】
	 *   10.【日次処理日付更新】
	 *   11.【システム管理日付更新】
	 *   12.日次処理終了
	 *
	 * パラメータのシステム管理日付（翌稼働日） ＜ 現在のシステム管理日付の場合
	 *   1.【日次処理開始】
	 *   2.【在庫日報復元処理】
	 *   3.【システム管理日付更新】
	 *   4.日次処理終了
	 *
	 * 【日次処理開始】
	 * ・{@link DailyCommonLogic#dailyProcessStart(MClientCenter, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 日次処理開始メソッド}を呼び出す。
	 *
	 * 【在庫繰越処理】
	 * ・{@link DailyStockReportLogic#stockDaily(MClientCenter, MParam) 在庫繰越処理メソッド}を呼び出す。
	 *
	 * 【在庫日報復元処理】
	 * ・{@link DailyStockReportLogic#recoveryStockReport(MClientCenter) 在庫日報復元処理メソッド}を呼び出す。
	 *
	 * 【ECデータ削除処理】
	 * ・{@link EcOrderDailyLogic#deleteData(MClientCenter) ECデータ削除処理メソッド}を呼び出す。
	 *
	 * 【未処理データ削除処理】
	 * ・{@link DailyUnprocessDataDeleteLogic#unprocessDataDelete(MClientCenter, MParam) 未処理データ削除処理メソッド}を呼び出す。
	 *
	 * 【履歴データ削除処理】
	 * ・{@link DailyHistoryDeleteLogic#historyDataDelete(MClientCenter, MParam) 履歴データ削除処理メソッド}を呼び出す。
	 *
	 * 【EDIデータ削除処理】
	 * ・{@link DailyEdiDataDeleteLogic#ediDataDelete(MClientCenter, MParam) EDIデータ削除処理メソッド}を呼び出す。
	 *
	 * 【ワークデータ削除処理】
	 * ・{@link DailyWorkDeleteLogic#delete(MClientCenter, MParam) ワークデータ削除処理メソッド}を呼び出す。
	 *
	 * 【シリアルNo.データ削除処理】
	 * ・{@link DailySerialNoDeleteLogic#delete(MClientCenter, MParam) シリアルNo.データ削除処理メソッド}を呼び出す。
	 *
	 * 【履歴データ移動処理】
	 * ・{@link DailyHistoryMoveLogic#moveDataHistory(MClientCenter, MParam) 履歴データ移動処理メソッド}を呼び出す。
	 *
	 * 【日次処理日付更新】
	 * ・{@link DailyCommonLogic#dailyDateUpdate(MClientCenter) 日次処理日付更新処理メソッド}を呼び出す。
	 *
	 * 【システム管理日付更新】
	 * ・{@link DailyCommonLogic#systemDateUpdate(MClientCenter) システム管理日付更新処理メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID・センタID・システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void mainProcess(MClientCenter clientCenter, ErrorStatus errSts) {

		// [C-CWMS-0066] 非同期処理化(チェック処理をバッチ処理中フラグ更新メソッドに移動するため削除) 2016.10.14 kawana

		// ===== 現在の荷主センタ情報の取得 =====

		// 検索条件
		MClientCenterCB mClientCenterCB = mClientCenterBhv.newMyConditionBean();
		mClientCenterCB.setupSelect_MClient();
		mClientCenterCB.setupSelect_MCenter();
		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start
		mClientCenterCB.setupSelect_MParamAsOne();
		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End
		// 荷主ID
		mClientCenterCB.query().setClientId_Equal(clientCenter.getClientId());
		// センタID
		mClientCenterCB.query().setCenterId_Equal(clientCenter.getCenterId());

		// 検索実行
		MClientCenter nowClientCenter = mClientCenterBhv.selectEntity(mClientCenterCB);

		// [EC-CT1-045] エラー場合、returnではなく例外をスローさせるためエラーステータスの処理を削除 2015.06.11 kawana Start

		// ===== 初期処理の呼出 =====
		commonLogic.initialize(clientCenter, nowClientCenter);

		// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start
		// ===== 対象荷主がバッチ処理中であることを確認 =====
		if (!nowClientCenter.isBatchProgressFlg$1()) {
			getErrorManager().throwException(new IllegalStateException("batch_progress_flg is illegal."));
			return;
		}
		// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End

		// パラメータ.システム管理日付（翌稼働日） ＜ 現在のシステム管理日付 の場合
		if (clientCenter.getSystemDateAdd().compareTo(nowClientCenter.getSystemDt()) < 0) {
			// 前回システム管理日付
			nowClientCenter.setBeforeSystemDt(nowClientCenter.getSystemDt());
			// システム管理日付
			nowClientCenter.setSystemDt(clientCenter.getSystemDateAdd());

			// ===== 在庫日報復元処理メソッドを呼出 =====
			stockReportLogic.recoveryStockReport(nowClientCenter);

			// ===== システム管理日付更新メソッドを呼出 =====
			commonLogic.systemDateUpdate(nowClientCenter);

			// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正 2014.12.05 kawana Start
			// 終了処理呼出
			finalize(clientCenter, nowClientCenter);
			// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正 2014.12.05 kawana End

			// 処理終了
			return;
		}

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start

		MParam mParam = nowClientCenter.getMParamAsOne();

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End

		// ===== システム管理日付の変更 =====
		// 前回システム管理日付
		nowClientCenter.setBeforeSystemDt(nowClientCenter.getSystemDt());
		// システム管理日付
		nowClientCenter.setSystemDt(clientCenter.getSystemDateAdd());

		// ===== 在庫繰越処理メソッドを呼出 =====
		stockReportLogic.stockDaily(nowClientCenter, mParam);

		// [C-EC-006] EC受注関連テーブルの日次処理追加 2015.02.17 kawana Start
		// ===== ECデータ削除処理メソッドを呼出 =====
		ecLogic.deleteData(nowClientCenter);
		// [C-EC-006] EC受注関連テーブルの日次処理追加 2015.02.17 kawana End

		// ===== 未処理データ削除処理メソッドを呼出 =====
		unprocessDataDeleteLogic.unprocessDataDelete(nowClientCenter, mParam);

		// ===== 履歴データ削除処理メソッドを呼出 =====
		historyDeleteLogic.historyDataDelete(nowClientCenter, mParam);

		// [C-CWMS-0061] EDI データ削除対応 2016.09.13 ATK Add
		// ===== EDIデータ削除処理メソッドを呼出 =====
		ediDataDeleteLogic.ediDataDelete(nowClientCenter, mParam);
		// [C-CWMS-0061] EDI データ削除対応 2016.09.13 ATK End

		// [#1697] ワークデータの削除処理追加 2017.04.20 kawana Start
		// ===== ワークデータ削除 =====
		dailyWorkDeleteLogic.delete(nowClientCenter, mParam);
		// [#1697] ワークデータの削除処理追加 2017.04.20 kawana End

		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana Start
		// ===== シリアルNo.データ削除 =====
		serialNoDeleteLogic.delete(nowClientCenter, mParam);
		// [#1530] シリアルNo.管理テーブルの過去データ削除 2017.04.19 kawana End

		// ===== 履歴データ移動処理メソッドを呼出 =====
		historyMoveLogic.moveDataHistory(nowClientCenter, mParam);

		// ===== 日次処理日付更新メソッドを呼出 =====
		commonLogic.dailyDateUpdate(nowClientCenter);

		// ===== システム管理日付更新メソッドを呼出 =====
		commonLogic.systemDateUpdate(nowClientCenter);

		// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正 2014.12.05 kawana Start
		// 終了処理呼出
		finalize(clientCenter, nowClientCenter);
		// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正 2014.12.05 kawana End

		// [EC-CT1-045] エラー場合、returnではなく例外をスローさせるためエラーステータスの処理を削除 2015.06.11 kawana End
	}

	/**
	 * <h2>日次処理実行チェックを行う。</h2>
	 * <pre>
	 * 現在の荷主センタ情報を取得し、日次処理の実行可能チェックを行う。
	 * 以下の場合、エラー管理クラスにエラーを登録する。
	 * ・日次処理が既に実行中
	 * ・日次締処理が一度も実行されていない
	 * ・翌稼働日と現在のシステム日付が同一
	 * ・翌稼働日に前回の日次締処理より前の日付が指定されている
	 * ・翌稼働日に受払が発生した日付より前の日付が指定されている
	 * ・【EC受注.日次実行チェック】でエラーが登録されている
	 *
	 * 【EC受注.日次実行チェック】
	 * ・{@link EcOrderDailyLogic#checkExecute(MClientCenter, MParam, com.oneslogi.base.exception.ErrorManager.ErrorStatus) EC受注 - 日次実行チェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID・センタID・システム管理日付（翌稼働日）
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkExecute(MClientCenter clientCenter, ErrorStatus errSts) {

		// [検査-234] 入力された情報などを変数化（可読性考慮） 2014.12.05 kawana Start
		final Long clientId = clientCenter.getClientId();
		final Long centerId = clientCenter.getCenterId();
		final String nextWorkDt = clientCenter.getSystemDateAdd();

		// ===== 現在の荷主センタ情報の取得 =====
		// 検索条件の設定
		MClientCenterCB mCCcb = mClientCenterBhv.newMyConditionBean();
		mCCcb.setupSelect_MClient();
		mCCcb.setupSelect_MCenter();
		// 荷主ID
		mCCcb.query().setClientId_Equal(clientId);
		// センタID
		mCCcb.query().setCenterId_Equal(centerId);

		// 検索実行
		MClientCenter searchData = mClientCenterBhv.selectEntity(mCCcb);

		// ===== 日次処理中チェック =====
		if (searchData.isBatchProgressFlg$1()) {
			this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_OPERATION_RUNNING_ERROR);
			return;
		}

		// システム日付
		final String systemDt = searchData.getSystemDt();
		// 前回システム日付（日次実行日付）
		final String beforeSystemDt = searchData.getBeforeSystemDt();

		// ===== パラメータ.システム管理日付（翌稼働日） = 荷主センタマスタ.システム管理日付 の場合 =====
		if (nextWorkDt.compareTo(systemDt) == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_INPUT_EQUAL_DATE_ERROR);
			return;
		}

		// ===== 翌稼働日のチェック =====
		// 稼働日戻しか判定 (パラメータ.システム管理日付(翌稼働日) ＜ 荷主センタマスタ.システム管理日付 の場合)
		if (nextWorkDt.compareTo(systemDt) < 0) {

			// [検査-234] 翌稼働日の指定日のチェックを追加 2014.12.05 kawana Start

			// 前回の日次が実行されていない場合は戻せない
			if (CU.isNullOrEmpty(beforeSystemDt)) {

				this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_INPUT_NOT_BEFORE_SYSTEM_DT_ERROR);
				return;
			}

			// 前回の日次実行日より前の日付へは戻せない
			if (nextWorkDt.compareTo(beforeSystemDt) < 0) {

				this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_INPUT_BEFORE_LAST_BUT_ONE_ERROR);
				return;
			}
			// [検査-234] 翌稼働日の指定日のチェックを追加 2014.12.05 kawana End

			// ===== 最終受払日の検索 =====
			String maxDt = tStockInoutBhv.scalarSelect(String.class).max(new ScalarQuery<TStockInoutCB>() {

				@Override
				public void query(TStockInoutCB cb) {
					cb.specify().columnProcessDt();
					// 荷主ID
					cb.query().queryTStock().setClientId_Equal(clientId);
					// センタID
					cb.query().queryTStock().queryMLocation().setCenterId_Equal(centerId);
					setDelFlg(cb);
				}
			}).orElse(null);

			if (maxDt == null) {
				// 受払履歴から検索

				maxDt = hStockInoutBhv.scalarSelect(String.class).max(new ScalarQuery<HStockInoutCB>() {

					@Override
					public void query(HStockInoutCB cb) {
						cb.specify().columnProcessDt();
						// 荷主ID
						cb.query().queryHStock().setClientId_Equal(clientId);
						// センタID
						cb.query().queryHStock().setCenterId_Equal(centerId);
						setDelFlg(cb);
					}
				}).orElse(null);
			}

			if (maxDt == null) {
				// 履歴にもない
				return;
			}

			// ===== パラメータ.システム管理日付(翌稼働日) ＜＝ 在庫受払.処理日(MAX)の場合 =====
			// [ON推-品向-466] 受払発生日には戻せないように修正 2014.12.19 kawana Start
			if (nextWorkDt.compareTo(maxDt) <= 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_INPUT_CONTAINED_STOCK_IN_OUT_ERROR);
				return;
			}
			// [ON推-品向-466] 受払発生日には戻せないように修正 2014.12.19 kawana End
		}

		// [C-EC-006] EC受注関連テーブルの日次処理追加 2015.02.17 kawana Start
		// ===== パラメータマスタ取得 =====
		MParamCB mParamCB = mParamBhv.newMyConditionBean();
		mParamCB.query().queryMClientCenter().setClientId_Equal(clientId);
		mParamCB.query().queryMClientCenter().setCenterId_Equal(centerId);
		MParam mParam = mParamBhv.selectEntity(mParamCB);

		// EC受注 - 日次実行チェック
		ecLogic.checkExecute(clientCenter, mParam, errSts);
		// エラーが登録されている場合
		if (this.getErrorManager().size() > 0) {
			// 処理終了
			return;
		}
		// [C-EC-006] EC受注関連テーブルの日次処理追加 2015.02.17 kawana End

		// [検査-234] 入力された情報などを変数化（可読性考慮） 2014.12.05 kawana End
	}

	// [EC-CT1-045] エラー場合、returnではなく例外をスローさせるためエラーステータスの処理を削除 2015.06.11 kawana Start
	// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正 2014.12.05 kawana Start
	/**
	 * 終了処理
	 */
	private void finalize(MClientCenter clientCenter, MClientCenter nowClientCenter) {

		// ===== 日次処理終了メソッドを呼出 =====
		commonLogic.dailyProcessEnd(nowClientCenter);

		// 終了処理呼出
		commonLogic.finalize(clientCenter, nowClientCenter);
	}
	// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正 2014.12.05 kawana End
	// [EC-CT1-045] エラー場合、returnではなく例外をスローさせるためエラーステータスの処理を削除 2015.06.11 kawana End

	//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.08.31 miyabe start

	/**
	 * <h2>出荷確定チェックを行う。</h2>
	 * <pre>
	 * 取得した荷主センタマスタを元に、
	 * 対象の荷主センタと紐づく出荷確定以外の出庫データが存在するかどうかをチェックする。
	 *
	 * </pre>
	 * @param mClientCenter 荷主センタマスタ：荷主ID・センタID
	 * @return true：未出荷データなし、false：未出荷データあり
	 */
	public boolean checkShippingInspection(MClientCenter mClientCenter){
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.query().setCenterId_Equal(mClientCenter.getCenterId());
		tPickingHCB.query().setClientId_Equal(mClientCenter.getClientId());
		tPickingHCB.query().setPickingStatus_NotEqual_$55();
		List<TPickingH> checkedPickingHList = tPickingHBhv.selectList(tPickingHCB);
		if(checkedPickingHList.size() > 0){
			return false;
		} else {
			return true;
		}
	}
	//[#274][Ver2.2.1]出荷未確定のデータが存在する場合、表示メッセージ変更 2017.08.31 miyabe End
}
