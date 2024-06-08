package com.oneslogi.wms.logic.daily;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.HStockCB;
import com.oneslogi.base.dbflute.cbean.HStockReportCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockReportCB;
import com.oneslogi.base.dbflute.exbhv.HStockBhv;
import com.oneslogi.base.dbflute.exbhv.HStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exentity.HStock;
import com.oneslogi.base.dbflute.exentity.HStockReport;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockReport;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;

/**
 * 日次締処理在庫日報作成ロジッククラス
 */
public class DailyStockReportLogic extends AbstractWmsLogic {

	// [EC-CT1-044] メモリ不足対応(処理数を制限するため全体的な流れを変更) 2015.06.11 kawana Start

	// ===== 使用テーブル =====

	@Inject
	private HStockReportBhv hStockReportBhv;
	@Inject
	private TStockReportBhv tStockReportBhv;
	@Inject
	private HStockBhv hStockBhv;
	@Inject
	private TStockBhv tStockBhv;

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

	/**
	 * <h2>在庫日報復元処理を行う。</h2>
	 * <pre>
	 * 【対象日の取得処理】と【日付文字列変換処理】を実行し、現在のシステム日付より過去日付を翌稼働日に設定した場合に、
	 * 在庫日報を翌稼働日前日の状態に復元し、翌稼働日以降の在庫日報履歴を削除する。
	 *
	 * 【運用ログの開始処理】、【運用ログの終了処理】を使用しログを記録する。
	 * 	 *
	 * 【運用ログの開始処理】
	 * ・{@link DailyCommonLogic#startLogSection(String, String, String...) 運用ログの開始メソッド}を呼び出す。
	 *
	 * 【運用ログの終了処理】
	 * ・{@link DailyCommonLogic#endLogSection() 運用ログの終了メソッド}を呼び出す。
	 *
	 * 【対象日の取得処理】
	 * ・{@link DailyCommonLogic#getTargetDay(String, Long) 対象日の取得メソッド}を呼び出す。
	 *
	 * 【日付文字列変換処理】
	 * ・{@link DailyCommonLogic#stringToCalendar(String) 日付文字列変換メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主ID・センタID・システム管理日付・前回システム管理日付
	 */
	public void recoveryStockReport(MClientCenter clientCenter) {

		// ===== 初期処理 =====
		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_STOCK_REPORT_RECOVERY
				// [#169] メッセージの重複を削除 2016.12.05 kawana Start
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_STOCK_DAILY
				// [#169] メッセージの重複を削除 2016.12.05 kawana End
				, new String[] { commonLogic.getDateString(clientCenter.getBeforeSystemDt()), commonLogic.getDateString(clientCenter.getSystemDt()) });

		final long centerId = clientCenter.getCenterId();
		final long clientId = clientCenter.getClientId();
		final String systemDt = clientCenter.getSystemDt();

		// ===== 対象在庫日報履歴の検索 =====

		// [ON推-品向-495] 在庫日報復元にクリア処理を追加 2014.12.26 kawana Start
		// 日報復元の前日を取得 (前日の状態に戻す)
		String targetDayStr = null;
		Calendar targetDay = null;
		try {
			targetDayStr = commonLogic.getTargetDay(systemDt, 1L);
			targetDay = commonLogic.stringToCalendar(targetDayStr);
		} catch (Exception e) {
			this.getErrorManager().throwException(new IllegalStateException(e));
		}
		// [ON推-品向-495] 在庫日報復元にクリア処理を追加 2014.12.26 kawana End

		// トランザクション復元
		recoveryStockReport_recoveryTransaction(centerId, clientId, systemDt, targetDayStr, targetDay);

		// 指定日以前の履歴データ削除
		recoveryStockReport_deleteHistory(centerId, clientId, systemDt);

		// 運用ログの終了
		commonLogic.endLogSection();
	}

	/**
	 * 在庫日報の復元(トランザクション)
	 *
	 * @param centerId
	 * @param clientId
	 * @param systemDt
	 * @param targetDayStr
	 * @param targetDay
	 */
	private void recoveryStockReport_recoveryTransaction(final long centerId, final long clientId, final String systemDt, String targetDayStr, Calendar targetDay) {

		// コントロールNo採番
		final long controlNo = numberingLogic.getControlNo();

		int countUpdateTStockReport = 0;

		while (true) {

			// 在庫日報を戻すために在庫日報履歴を取得
			List<HStockReport> selectData = recoveryStockReport_selectHStockReport(centerId, clientId, targetDayStr, controlNo);

			if (selectData.size() == 0) {
				// 対象なし - while文を抜ける

				break;
			}

			// ===== 在庫日報の更新 =====

			List<Long> stockIdList = new ArrayList<Long>();
			// 一括更新用 在庫日報リストを作成
			List<TStockReport> tStockReportList = new ArrayList<TStockReport>();

			for (HStockReport hStockReport : selectData) {

				// トランザクション存在チェック用在庫IDリストに追加
				stockIdList.add(hStockReport.getStockId());

				TStockReport tStockReport = new TStockReport();
				// 在庫ID
				tStockReport.setStockId(hStockReport.getStockId());
				//当月入庫数
				tStockReport.setStoreNumMonth(hStockReport.getStoreNumMonth());
				//当月出庫数
				tStockReport.setPickingNumMonth(hStockReport.getPickingNumMonth());
				//当月移動数＋
				tStockReport.setMovePlsNumMonth(hStockReport.getMovePlsNumMonth());
				//当月移動数－
				tStockReport.setMoveMnsNumMonth(hStockReport.getMoveMnsNumMonth());
				//当月調整数＋
				tStockReport.setAdjPlsNumMonth(hStockReport.getAdjPlsNumMonth());
				//当月調整数－
				tStockReport.setAdjMnsNumMonth(hStockReport.getAdjMnsNumMonth());
				//前月引当可能数
				tStockReport.setPChargeNumMonth(hStockReport.getPChargeNumMonth());
				//前月引当済数
				tStockReport.setPAllocNumMonth(hStockReport.getPAllocNumMonth());
				//前月移動中数
				tStockReport.setPMoveNumMonth(hStockReport.getPMoveNumMonth());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				//前月積送中数
				tStockReport.setPTransitNumMonth(hStockReport.getPTransitNumMonth());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				//１０日残引当可能数
				tStockReport.setChargeNum10(hStockReport.getChargeNum10());
				//１０日残引当済数
				tStockReport.setAllocNum10(hStockReport.getAllocNum10());
				//１０日残移動中数
				tStockReport.setMoveNum10(hStockReport.getMoveNum10());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				//１０日残積送中数
				tStockReport.setTransitNum10(hStockReport.getTransitNum10());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				//１５日残引当可能数
				tStockReport.setChargeNum15(hStockReport.getChargeNum15());
				//１５日残引当済数
				tStockReport.setAllocNum15(hStockReport.getAllocNum15());
				//１５日残移動中数
				tStockReport.setMoveNum15(hStockReport.getMoveNum15());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				//１５日残積送中数
				tStockReport.setTransitNum15(hStockReport.getTransitNum15());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				//２０日残引当可能数
				tStockReport.setChargeNum20(hStockReport.getChargeNum20());
				//２０日残引当済数
				tStockReport.setAllocNum20(hStockReport.getAllocNum20());
				//２０日残移動中数
				tStockReport.setMoveNum20(hStockReport.getMoveNum20());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				//２０日残積送中数
				tStockReport.setTransitNum20(hStockReport.getTransitNum20());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				//末日残引当可能数
				tStockReport.setChargeNumLast(hStockReport.getChargeNumLast());
				//末日残引当済数
				tStockReport.setAllocNumLast(hStockReport.getAllocNumLast());
				//末日残移動中数
				tStockReport.setMoveNumLast(hStockReport.getMoveNumLast());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				//末日残積送中数
				tStockReport.setTransitNumLast(hStockReport.getTransitNumLast());
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

				// [ON推-品向-495] 在庫日報復元にクリア処理を追加 2014.12.26 kawana Start
				TStock stock = new TStock();
				stock.setChargeNum(hStockReport.getChargeNum());
				stock.setAllocNum(hStockReport.getAllocNum());
				stock.setMoveNum(hStockReport.getMoveNum());
				// [#1842] 在庫復元すると前日積送中数がnullになる不具合を修正 2017.05.31 kawana Start
				stock.setTransitNum(hStockReport.getTransitNum());
				// [#1842] 在庫復元すると前日積送中数がnullになる不具合を修正 2017.05.31 kawana End

				// 当日の残数などをクリア
				clearStockReport(stock, tStockReport, targetDay);
				// [ON推-品向-495] 在庫日報復元にクリア処理を追加 2014.12.26 kawana End

				tStockReportList.add(tStockReport);
			}

			// トランザクションに存在するかのチェック
			TStockReportCB checkCb = tStockReportBhv.newMyConditionBean();
			checkCb.query().setStockId_InScope(stockIdList);

			// [検査-234] トランザクションにない場合はエラーではなくスキップに変更 2014.12.05 kawana Start

			// トランザクションを検索
			List<TStockReport> checkList = tStockReportBhv.selectList(checkCb);

			// 更新対象件数と検索件数が一致しない場合
			if (checkList.size() != tStockReportList.size()) {

				// トランザクションに存在する在庫日報と存在しない在庫日報に振り分け

				ArrayList<TStockReport> okList = new ArrayList<TStockReport>();
				ArrayList<Long> ngList = new ArrayList<Long>();

				for (TStockReport stockReport : tStockReportList) {

					long id = stockReport.getStockId();
					boolean find = false;

					for (TStockReport tranStockReport : checkList) {

						long tranId = tranStockReport.getStockId();
						if (id == tranId) {
							// 在庫IDが一致

							okList.add(stockReport);
							find = true;
							checkList.remove(tranStockReport);
							break;
						}
					}

					if (!find) {

						// 見つからなかった場合はNG
						ngList.add(id);
					}
				}

				// NGをログに出力
				if (0 < ngList.size()) {

					recoveryStockReport_addLogRecoveryNgStock(ngList);
				}

				// 一括更新リストにOKリストを設定
				tStockReportList = okList;
			}

			// [検査-234] トランザクションにない場合はエラーではなくスキップに変更 2014.12.05 kawana End

			// 一括更新用 在庫日報リストで一括更新実行
			int[] updateCount = tStockReportBhv.batchUpdateNonstrict(tStockReportList);
			// 件数に加算
			countUpdateTStockReport = countUpdateTStockReport + updateCount.length;
		}

		// コントロールNo.をクリア
		recoveryStockReport_clearControlNo(controlNo);

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_UPDATE_DAILY_PROCESS_INFORMATION, tStockReportBhv.asTableDbName().toUpperCase(), String.valueOf(countUpdateTStockReport));
	}

	/**
	 * 在庫日報を復元する日の在庫日報履歴を取得する
	 *
	 * @param centerId
	 * @param clientId
	 * @param targetDayStr
	 * @param controlNo
	 * @return List<HStockReport>
	 */
	private List<HStockReport> recoveryStockReport_selectHStockReport(final long centerId, final long clientId, String targetDayStr, final long controlNo) {

		HStockReportCB cb = hStockReportBhv.newMyConditionBean();
		// 荷主ID
		cb.query().queryHStock().setClientId_Equal(clientId);
		// センタID
		cb.query().queryHStock().setCenterId_Equal(centerId);
		// [ON推-品向-495] 在庫日報復元にクリア処理を追加 2014.12.26 kawana Start
		// 履歴日
		cb.query().setHistDt_Equal(targetDayStr);
		// [ON推-品向-495] 在庫日報復元にクリア処理を追加 2014.12.26 kawana End

		cb.orScopeQuery(new OrQuery<HStockReportCB>() {

			@Override
			public void query(HStockReportCB orCb) {
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
		List<HStockReport> selectData = hStockReportBhv.selectList(cb);

		if (selectData.size() == 0) {
			return selectData;
		}

		// 1度検索したデータはcontrolNoを設定する
		for (HStockReport e : selectData) {

			e.setControlNo(controlNo);
		}

		// 一括更新
		hStockReportBhv.batchUpdate(selectData);

		return selectData;
	}

	/**
	 * 復元できなかった在庫情報をログ出力
	 *
	 * @param ngStockIdList NGの在庫IDリスト
	 */
	private void recoveryStockReport_addLogRecoveryNgStock(ArrayList<Long> ngStockIdList) {
		// 在庫履歴を検索
		HStockCB hStockCb = hStockBhv.newMyConditionBean();
		hStockCb.specify().columnStoreLabelNo();
		hStockCb.query().setStockId_InScope(ngStockIdList);
		List<HStock> ngStockList = hStockBhv.selectList(hStockCb);

		int ngCount = 0;
		StringBuilder sb = new StringBuilder();

		// 入庫ラベルNoをパラメータに設定してログ出力
		for (int i = 0; i < ngStockList.size(); i++) {

			String storeLabelNo = ngStockList.get(i).getStoreLabelNo();

			if (ngCount == 0) {
				sb.append(storeLabelNo);
			} else {
				sb.append(",").append(storeLabelNo);
			}
			ngCount++;

			if ((5 <= ngCount) || (i == (ngStockList.size() - 1))) {
				// 5件ずつログに出力

				// 運用ログ追加
				commonLogic.addLog(WmsMessageConst.DAILY_PROCESS_CANNOT_UPDATE_STOCK_REPORT_NOT_FOUND_INFORMATION, sb.toString());
				// 初期化
				sb = new StringBuilder();
				ngCount = 0;
			}
		}
	}

	/**
	 * コントロールNo.のクリア
	 * @param controlNo 処理No
	 */
	private void recoveryStockReport_clearControlNo(long controlNo) {
		HStockReportCB cb = hStockReportBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(controlNo);
		HStockReport updateEntity = new HStockReport();
		updateEntity.setControlNo(null);

		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(hStockReportBhv, updateEntity, cb, queryUpdateSettingsLogic.getQuerySetter(hStockReportBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	/**
	 * 指定日以前の在庫日報履歴を削除
	 *
	 * @param centerId
	 * @param clientId
	 * @param systemDt
	 */
	private void recoveryStockReport_deleteHistory(final long centerId, final long clientId, final String systemDt) {

		HStockReportCB deleteCB = hStockReportBhv.newMyConditionBean();
		// 荷主ID
		deleteCB.query().queryHStock().setClientId_Equal(clientId);
		// センタID
		deleteCB.query().queryHStock().setCenterId_Equal(centerId);
		// 履歴日
		deleteCB.query().setHistDt_GreaterEqual(systemDt);
		// 削除実行
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start
		int delNum = queryUpdateLogic.queryDeleteWithSelect(hStockReportBhv, deleteCB, queryUpdateSettingsLogic.getQuerySetter(hStockReportBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End

		// 運用ログ追加
		commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, hStockReportBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
	}

	/**
	 * <h2>在庫繰越処理を行う。</h2>
	 * <pre>
	 * 【日付文字列変換処理】後、下記の順番で日次処理の在庫繰越処理を行う
	 *   1.在庫日報の10日残、15日残、20日残、末日残の設定。
	 *   2.在庫日報履歴の作成
	 *   3.在庫日報の当日数のクリア（月末日の場合は当月数もクリアする）
	 *   4.在庫日報の更新
	 *
	 * 【運用ログの開始処理】、【運用ログの追加処理】を使用しログを記録する。
	 *
	 * 【運用ログの開始処理】
	 * ・{@link DailyCommonLogic#startLogSection(String, String, String...) 運用ログの開始メソッド}を呼び出す。
	 *
	 * 【日付文字列変換処理】
	 * ・{@link DailyCommonLogic#stringToCalendar(String) 日付文字列変換処理メソッド}を呼び出す。
	 *
	 * 【運用ログ追加処理】
	 * ・{@link DailyCommonLogic#addLog(String, String...) 運用ログ追加メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：前回システム管理日付・現在稼働日付・荷主ID・センタID
	 * @param param パラメータマスタ（使用しない）
	 */
	public void stockDaily(MClientCenter clientCenter, MParam param) {

		// ===== 初期処理 =====

		// 運用ログの開始
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_STOCK_DAILY
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_STOCK_DAILY
				, new String[] { commonLogic.getDateString(clientCenter.getBeforeSystemDt()), commonLogic.getDateString(clientCenter.getSystemDt()) });

		// 現在年月
		String yearsNowStr = clientCenter.getBeforeSystemDt().substring(0, 6);
		// 翌稼働年月
		String yearsNextStr = clientCenter.getSystemDt().substring(0, 6);
		Calendar yearsNowCal = null;
		Calendar yearsNextCal = null;
		try {
			// 現在日付
			yearsNowCal = commonLogic.stringToCalendar(clientCenter.getBeforeSystemDt());
			// 翌稼働日付
			yearsNextCal = commonLogic.stringToCalendar(clientCenter.getSystemDt());
		} catch (Exception e) {
			this.getErrorManager().throwException(new IllegalStateException(e));
		}

		// 更新件数
		int hStockInsertCount = 0;
		int hStockReportInsertCount = 0;
		int tStockReportUpdateCount = 0;

		// コントロールNo採番
		long controlNo = numberingLogic.getControlNo();

		// 対象在庫が0になるまで繰り返し
		while (true) {

			// ===== 対象在庫の検索 =====
			List<TStock> tStockList = stockDaily_selectTStock(clientCenter, yearsNowStr, yearsNextStr, yearsNowCal, controlNo);

			if (tStockList.size() == 0) {
				// 対象の在庫なし - while文を抜ける

				break;
			}

			// 在庫日報履歴一括登録用リスト
			List<HStockReport> hStockReportListIns = new ArrayList<HStockReport>();
			// 在庫日報一括登録用リスト
			List<TStockReport> tStockReportListUpd = new ArrayList<TStockReport>();

			List<Long> stockIdList = new ArrayList<Long>();
			// ===== 在庫の件数分繰返 =====
			for (TStock tStock : tStockList) {

				// 在庫IDリストに追加
				stockIdList.add(tStock.getStockId());

				// 処理日付 に 現在日付 を設定する
				Calendar processDate = null;
				processDate = (Calendar) yearsNowCal.clone();

				// 在庫日報を取得
				TStockReport tStockReport = tStock.getTStockReportAsOne();

				// 処理日付 が 翌稼働日付 以上（ ＝＞ ）になるまで繰返
				while (processDate.compareTo(yearsNextCal) < 0) {

					// 在庫日報の日残を設定
					stockDaily_setRestNum(tStock, tStockReport, processDate);
					// 在庫日報履歴を生成
					HStockReport hStockReport = stockDaily_newHStockReport(tStock, tStockReport, processDate);

					// 在庫日報履歴一括登録用 在庫日報履歴リストに追加する
					hStockReportListIns.add(hStockReport);

					// 最大件数を超えたらINSERT実行
					// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
					if (getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT) <= hStockReportListIns.size()) {
						// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

						// 在庫日報履歴の登録
						ReturnDto_insertStockReport result = insertStockReport(stockIdList, hStockReportListIns);
						hStockInsertCount = hStockInsertCount + result.stockInsertCount;
						hStockReportInsertCount = hStockReportInsertCount + result.stockReportInsertCount;

						// リストのクリア
						stockIdList = new ArrayList<>();
						hStockReportListIns = new ArrayList<HStockReport>();
					}

					// [ON推-品向-495] クリア処理を抜き出し 2014.12.26 kawana Start
					// 在庫日報の当日残数などをクリア
					clearStockReport(tStock, tStockReport, processDate);
					// [ON推-品向-495] クリア処理を抜き出し 2014.12.26 kawana End

					// 処理日付を1日進める
					processDate.add(Calendar.DAY_OF_MONTH, 1);
				}

				// 一括更新用 在庫日報リストに在庫.在庫日報を追加する
				tStockReportListUpd.add(tStockReport);
			}

			if (0 < hStockReportListIns.size()) {

				// 在庫日報履歴の登録
				ReturnDto_insertStockReport result = insertStockReport(stockIdList, hStockReportListIns);
				hStockInsertCount = hStockInsertCount + result.stockInsertCount;
				hStockReportInsertCount = hStockReportInsertCount + result.stockReportInsertCount;
			}

			if (0 < tStockReportListUpd.size()) {

				// 在庫日報更新
				int[] updCount = tStockReportBhv.batchUpdate(tStockReportListUpd);
				tStockReportUpdateCount = tStockReportUpdateCount + updCount.length;
			}
		}

		// 運用ログ追加(在庫日報履歴 登録)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockReportBhv.asTableDbName().toUpperCase(), String.valueOf(hStockReportInsertCount));

		// 運用ログ追加(在庫履歴 登録)
		commonLogic.addLog(WmsMessageConst.DATA_REGISTER_DAILY_PROCESS_INFORMATION, hStockBhv.asTableDbName().toUpperCase(), String.valueOf(hStockInsertCount));

		// 運用ログ追加(在庫日報 更新)
		commonLogic.addLog(WmsMessageConst.DATA_UPDATE_DAILY_PROCESS_INFORMATION, tStockReportBhv.asTableDbName().toUpperCase(), String.valueOf(tStockReportUpdateCount));

		// コントロールNo.クリア
		stockDaily_clearControlNo(controlNo);
	}

	/**
	 * <h2>在庫日報作成対象の在庫を検索。</h2>
	 * <pre>
	 * コントロールNo.が設定されていない(未処理)在庫を取得する。
	 * 取得した在庫にはコントロールNo.を設定する。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ
	 * @param yearsNowStr 現在日付の年月(文字列)
	 * @param yearsNextStr 翌稼働日付の年月(文字列)
	 * @param yearsNowCal 現在日付(カレンダー型)
	 * @param controlNo 処理No.
	 * @return List<TStock> 在庫日報作成対象の在庫リスト
	 */
	private List<TStock> stockDaily_selectTStock(MClientCenter clientCenter, String yearsNowStr, String yearsNextStr, Calendar yearsNowCal, final long controlNo) {

		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TStockReportAsOne();

		// [#2620] 当月に出荷して在庫数0になった在庫の日報履歴を月末以外の日付でも作るように変更 2017.09.14 kawana Start

		// 荷主ID
		cb.query().setClientId_Equal(clientCenter.getClientId());
		// センタID
		cb.query().queryMLocation().setCenterId_Equal(clientCenter.getCenterId());
		// 在庫数の条件
		cb.orScopeQuery(new OrQuery<TStockCB>() {
			public void query(TStockCB orCB) {
				// 引当可能数 > 0
				orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
				// 引当済数 > 0
				orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
				// 移動中数 > 0
				orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				// 積送中数 > 0
				orCB.query().setTransitNum_GreaterThan(WCC.ZERO);
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				// 当月入庫数 > 0
				orCB.query().queryTStockReportAsOne().setStoreNumMonth_GreaterThan(WCC.ZERO);
				// 当月出庫数 > 0
				orCB.query().queryTStockReportAsOne().setPickingNumMonth_GreaterThan(WCC.ZERO);
				// 当月移動数＋ > 0
				orCB.query().queryTStockReportAsOne().setMovePlsNumMonth_GreaterThan(WCC.ZERO);
				// 当月移動数－ > 0
				orCB.query().queryTStockReportAsOne().setMoveMnsNumMonth_GreaterThan(WCC.ZERO);
				// 当月調整数＋ > 0
				orCB.query().queryTStockReportAsOne().setAdjPlsNumMonth_GreaterThan(WCC.ZERO);
				// 当月調整数－ > 0
				orCB.query().queryTStockReportAsOne().setAdjMnsNumMonth_GreaterThan(WCC.ZERO);
			}
		});

		// [#2620] 当月に出荷して在庫数0になった在庫の日報履歴を月末以外の日付でも作るように変更 2017.09.14 kawana End

		cb.orScopeQuery(new OrQuery<TStockCB>() {

			@Override
			public void query(TStockCB orCb) {
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
		List<TStock> tStockList = tStockBhv.selectList(cb);

		if (tStockList.size() == 0) {
			return tStockList;
		}

		// 1度検索した在庫はcontrolNoを設定する
		for (TStock stock : tStockList) {

			stock.setControlNo(controlNo);
		}
		// 一括更新
		tStockBhv.batchUpdate(tStockList);

		return tStockList;
	}

	/**
	 * <h2>在庫繰越処理_日残設定</h2>
	 * <pre>
	 * 在庫日報の10日残、15日残、20日残、末日残を設定する
	 *
	 *
	 * 【パラメータの使用項目】
	 *  (在庫)
	 *  ・引当可能数 : 必須
	 *  ・引当済数 : 必須
	 *  ・移動中数 : 必須
	 *
	 * </pre>
	 * @param stock 在庫
	 * @param report 在庫日報
	 * @param targetDt 処理日付
	 */
	private void stockDaily_setRestNum(TStock stock, TStockReport report, Calendar targetDt) {

		// ===== 初期処理 =====
		// パラメータ.処理日付の日を設定
		int day = targetDt.get(Calendar.DATE);

		// 対象日が10の場合
		if (day == 10) {
			// ===== 10日残の設定 =====

			// 10日残引当可能数
			report.setChargeNum10(stock.getChargeNum());
			// 10日残引当済数
			report.setAllocNum10(stock.getAllocNum());
			// 10日移動中数
			report.setMoveNum10(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 10日積送中数
			report.setTransitNum10(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

			// 対象日が15の場合
		} else if (day == 15) {
			// ===== 15日残の設定 =====

			// 15日残引当可能数
			report.setChargeNum15(stock.getChargeNum());
			// 15日残引当済数
			report.setAllocNum15(stock.getAllocNum());
			// 15日移動中数
			report.setMoveNum15(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 15日積送中数
			report.setTransitNum15(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

			// 対象日が20の場合
		} else if (day == 20) {
			// ===== 20日残の設定 =====

			// 20日残引当可能数
			report.setChargeNum20(stock.getChargeNum());
			// 20日残引当済数
			report.setAllocNum20(stock.getAllocNum());
			// 20日移動中数
			report.setMoveNum20(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 20日積送中数
			report.setTransitNum20(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

			// 対象日が月末日の場合
		} else if (commonLogic.checkLastDayOfMonth(targetDt)) {
			// ===== 末日残の設定 =====

			// 末日残引当可能数
			report.setChargeNumLast(stock.getChargeNum());
			// 末日残引当済数
			report.setAllocNumLast(stock.getAllocNum());
			// 末日移動中数
			report.setMoveNumLast(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 末日積送中数
			report.setTransitNumLast(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		}
	}

	/**
	 * 在庫日報履歴の作成
	 *
	 * @param tStock 在庫
	 * @param tStockReport 在庫日報
	 * @param processDate 履歴日
	 * @return HStockReport 在庫日報履歴
	 */
	private HStockReport stockDaily_newHStockReport(TStock tStock, TStockReport tStockReport, Calendar processDate) {
		// 在庫日報履歴の登録データを作成し
		HStockReport hStockReport = new HStockReport();
		// 履歴日
		hStockReport.setHistDt(CU.calendarToString(processDate));
		// 在庫ID
		hStockReport.setStockId(tStock.getStockId());
		// 引当可能数
		hStockReport.setChargeNum(tStock.getChargeNum());
		// 引当済数
		hStockReport.setAllocNum(tStock.getAllocNum());
		// 移動中数
		hStockReport.setMoveNum(tStock.getMoveNum());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// 積送中数
		hStockReport.setTransitNum(tStock.getTransitNum());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// 当日入庫数
		hStockReport.setStoreNumDay(tStockReport.getStoreNumDay());
		// 当日出庫数
		hStockReport.setPickingNumDay(tStockReport.getPickingNumDay());
		// 当日移動数＋
		hStockReport.setMovePlsNumDay(tStockReport.getMovePlsNumDay());
		// 当日移動数－
		hStockReport.setMoveMnsNumDay(tStockReport.getMoveMnsNumDay());
		// 当日調整数＋
		hStockReport.setAdjPlsNumDay(tStockReport.getAdjPlsNumDay());
		// 当日調整数－
		hStockReport.setAdjMnsNumDay(tStockReport.getAdjMnsNumDay());
		// 前日引当可能数
		hStockReport.setPChargeNumDay(tStockReport.getPChargeNumDay());
		// 前日引当済数
		hStockReport.setPAllocNumDay(tStockReport.getPAllocNumDay());
		// 前日移動中数
		hStockReport.setPMoveNumDay(tStockReport.getPMoveNumDay());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// 前日積送中数
		hStockReport.setPTransitNumDay(tStockReport.getPTransitNumDay());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// 当月入庫数
		hStockReport.setStoreNumMonth(tStockReport.getStoreNumMonth());
		// 当月出庫数
		hStockReport.setPickingNumMonth(tStockReport.getPickingNumMonth());
		// 当月移動数＋
		hStockReport.setMovePlsNumMonth(tStockReport.getMovePlsNumMonth());
		// 当月移動数－
		hStockReport.setMoveMnsNumMonth(tStockReport.getMoveMnsNumMonth());
		// 当月調整数＋
		hStockReport.setAdjPlsNumMonth(tStockReport.getAdjPlsNumMonth());
		// 当月調整数－
		hStockReport.setAdjMnsNumMonth(tStockReport.getAdjMnsNumMonth());
		// 前月引当可能数
		hStockReport.setPChargeNumMonth(tStockReport.getPChargeNumMonth());
		// 前月引当済数
		hStockReport.setPAllocNumMonth(tStockReport.getPAllocNumMonth());
		// 前月移動中数
		hStockReport.setPMoveNumMonth(tStockReport.getPMoveNumMonth());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// 前月積送中数
		hStockReport.setPTransitNumMonth(tStockReport.getPTransitNumMonth());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// １０日残引当可能数
		hStockReport.setChargeNum10(tStockReport.getChargeNum10());
		// １０日残引当済数
		hStockReport.setAllocNum10(tStockReport.getAllocNum10());
		// １０日残移動中数
		hStockReport.setMoveNum10(tStockReport.getMoveNum10());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// １０日残積送中数
		hStockReport.setTransitNum10(tStockReport.getTransitNum10());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// １５日残引当可能数
		hStockReport.setChargeNum15(tStockReport.getChargeNum15());
		// １５日残引当済数
		hStockReport.setAllocNum15(tStockReport.getAllocNum15());
		// １５日残移動中数
		hStockReport.setMoveNum15(tStockReport.getMoveNum15());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// １５日残積送中数
		hStockReport.setTransitNum15(tStockReport.getTransitNum15());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// ２０日残引当可能数
		hStockReport.setChargeNum20(tStockReport.getChargeNum20());
		// ２０日残引当済数
		hStockReport.setAllocNum20(tStockReport.getAllocNum20());
		// ２０日残移動中数
		hStockReport.setMoveNum20(tStockReport.getMoveNum20());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// ２０日残積送中数
		hStockReport.setTransitNum20(tStockReport.getTransitNum20());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// 末日残引当可能数
		hStockReport.setChargeNumLast(tStockReport.getChargeNumLast());
		// 末日残引当済数
		hStockReport.setAllocNumLast(tStockReport.getAllocNumLast());
		// 末日残移動中数
		hStockReport.setMoveNumLast(tStockReport.getMoveNumLast());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// 末日残積送中数
		hStockReport.setTransitNumLast(tStockReport.getTransitNumLast());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		// 最新入庫年月日
		hStockReport.setLastStoreDt(tStockReport.getLastStoreDt());
		// 最新出庫年月日
		hStockReport.setLastPickingDt(tStockReport.getLastPickingDt());

		return hStockReport;
	}

	/**
	 * 「在庫日報履歴の登録処理」メソッドの戻り値
	 */
	private class ReturnDto_insertStockReport {
		/** 在庫登録件数 **/
		public int stockInsertCount;
		/** 在庫日報登録件数 **/
		public int stockReportInsertCount;
	}

	/**
	 * 在庫日報履歴の登録処理
	 *
	 * @param stockIdList
	 * @param stockReportList
	 */
	private ReturnDto_insertStockReport insertStockReport(List<Long> stockIdList, List<HStockReport> stockReportList) {

		// ===== 在庫履歴の登録 =====
		int stockCount = commonLogic.insertNotExistsHStock(stockIdList);

		// ===== 在庫日報履歴の登録 =====
		int[] stockReportCount = hStockReportBhv.batchInsert(stockReportList);

		// 戻り値の設定
		ReturnDto_insertStockReport result = new ReturnDto_insertStockReport();
		result.stockInsertCount = stockCount;
		result.stockReportInsertCount = stockReportCount.length;

		return result;
	}

	// [ON推-品向-495] クリア処理を抜き出し 2014.12.26 kawana Start
	/**
	 * <h2>在庫日報の当日残数などをクリアする</h2>
	 * <pre>
	 * 前日の在庫数には引数の在庫から設定。
	 * (引当可能数、移動中数、引当済数)
	 * </pre>
	 *
	 * @param stock 在庫
	 * @param stockReport 対象の在庫日報
	 * @param processDate 対象日
	 */
	private void clearStockReport(TStock stock, TStockReport stockReport, Calendar processDate) {

		// 処理日付の日が月末日の場合
		if (commonLogic.checkLastDayOfMonth(processDate)) {
			// 当日入庫数
			stockReport.setStoreNumDay(WCC.ZERO);
			// 当日出庫数
			stockReport.setPickingNumDay(WCC.ZERO);
			// 当日移動数＋
			stockReport.setMovePlsNumDay(WCC.ZERO);
			// 当日移動数－
			stockReport.setMoveMnsNumDay(WCC.ZERO);
			// 当日調整数＋
			stockReport.setAdjPlsNumDay(WCC.ZERO);
			// 当日調整数－
			stockReport.setAdjMnsNumDay(WCC.ZERO);
			// 前日引当可能数
			stockReport.setPChargeNumDay(stock.getChargeNum());
			// 前日引当済数
			stockReport.setPAllocNumDay(stock.getAllocNum());
			// 前日移動中数
			stockReport.setPMoveNumDay(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 前日積送中数
			stockReport.setPTransitNumDay(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
			// 当月入庫数
			stockReport.setStoreNumMonth(WCC.ZERO);
			// 当月出庫数
			stockReport.setPickingNumMonth(WCC.ZERO);
			// 当月移動数＋
			stockReport.setMovePlsNumMonth(WCC.ZERO);
			// 当月移動数－
			stockReport.setMoveMnsNumMonth(WCC.ZERO);
			// 当月調整数＋
			stockReport.setAdjPlsNumMonth(WCC.ZERO);
			// 当月調整数－
			stockReport.setAdjMnsNumMonth(WCC.ZERO);
			// 前月引当可能数
			stockReport.setPChargeNumMonth(stock.getChargeNum());
			// 前月引当済数
			stockReport.setPAllocNumMonth(stock.getAllocNum());
			// 前月移動中数
			stockReport.setPMoveNumMonth(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 前月積送中数
			stockReport.setPTransitNumMonth(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		} else {
			// 当日入庫数
			stockReport.setStoreNumDay(WCC.ZERO);
			// 当日出庫数
			stockReport.setPickingNumDay(WCC.ZERO);
			// 当日移動数＋
			stockReport.setMovePlsNumDay(WCC.ZERO);
			// 当日移動数－
			stockReport.setMoveMnsNumDay(WCC.ZERO);
			// 当日調整数＋
			stockReport.setAdjPlsNumDay(WCC.ZERO);
			// 当日調整数－
			stockReport.setAdjMnsNumDay(WCC.ZERO);
			// 前日引当可能数
			stockReport.setPChargeNumDay(stock.getChargeNum());
			// 前日引当済数
			stockReport.setPAllocNumDay(stock.getAllocNum());
			// 前日移動中数
			stockReport.setPMoveNumDay(stock.getMoveNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// 前日積送中数
			stockReport.setPTransitNumDay(stock.getTransitNum());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		}
	}

	// [ON推-品向-495] クリア処理を抜き出し 2014.12.26 kawana End

	/**
	 * 在庫のコントロールNo.のクリア
	 * @param controlNo 処理No
	 */
	private void stockDaily_clearControlNo(long controlNo) {
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(controlNo);
		TStock updateStock = new TStock();
		updateStock.setControlNo(null);

		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana Start
		queryUpdateLogic.queryUpdateWithSelect(tStockBhv, updateStock, cb, queryUpdateSettingsLogic.getQuerySetter(tStockBhv));
		// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.08 kawana End
	}

	// [EC-CT1-044] メモリ不足対応(処理数を制限するため全体的な流れを変更) 2015.06.11 kawana End
}
