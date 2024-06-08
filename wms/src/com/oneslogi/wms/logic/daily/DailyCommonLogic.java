package com.oneslogi.wms.logic.daily;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.cbean.HStockCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.HStockBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.HStock;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 日次締処理共通ロジッククラス
 */
public class DailyCommonLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private HStockBhv hStockBhv;
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>初期処理を行う。</h2>
	 * <pre>
	 * ・クラス変数の初期化を行う。
	 * ・運用ログを開始する。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：センタCD・荷主CD・システム管理日付
	 * @param nowClientCenter データベースの荷主センタマスタ：前回システム管理日付・システム管理日付
	 */
	protected void initialize(MClientCenter clientCenter, MClientCenter nowClientCenter) {

		// [EC-CT1-044] メモリ不足対応 - クラス分割により不要な処理・変数を削除 2015.06.11 kawana

		// 運用ログの開始
		startLog(WmsMessageConst.DAILY_PROCESS_PROGRAM_NAME
				, WmsMessageConst.DAILY_PROCESS_PARAMETER
				, new String[] { clientCenter.getMCenter().getCenterCd()
						, clientCenter.getMClient().getClientCd()
						, getDateString(nowClientCenter.getBeforeSystemDt())
						, getDateString(nowClientCenter.getSystemDt())
						, getDateString(clientCenter.getSystemDateAdd()) });
	}

	/**
	 * <h2>終了処理を行う。</h2>
	 * <pre>
	 * ・運用ログを終了する。
	 * </pre>
	 * @param clientCenter パラメータの荷主センタマスタ：全項目
	 * @param nowClientCenter データベースの荷主センタマスタ：全項目
	 */
	protected void finalize(MClientCenter clientCenter, MClientCenter nowClientCenter) {

		endLog();
	}

	/**
	 * <h2>在庫履歴を登録する。</h2>
	 * <pre>
	 * 在庫履歴に登録されていない在庫を一括登録する。
	 * </pre>
	 * @param stockIdList 在庫IDリスト：全項目
	 * @return int 登録数
	 */
	protected int insertNotExistsHStock(List<Long> stockIdList) {

		// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana Start

		// nullを排除
		List<Long> idList = new ArrayList<Long>();
		for (Long stockId : stockIdList) {

			if (stockId == null) {
				continue;
			}

			if (idList.contains(stockId)) {
				// 既に追加済
				continue;
			}

			idList.add(stockId);
		}

		if (idList.size() == 0) {
			return 0;
		}

		// 在庫履歴を検索
		HStockCB existsCb = hStockBhv.newMyConditionBean();
		existsCb.specify().columnStockId();
		existsCb.query().setStockId_InScope(idList);

		List<HStock> existsStockList = hStockBhv.selectList(existsCb);

		// 未登録の在庫IDを抜出
		List<Long> notExistsIdList = new ArrayList<>();
		for (long id : idList) {

			boolean isFind = false;
			for (HStock hStock : existsStockList) {

				long hId = hStock.getStockId();
				if (id == hId) {
					isFind = true;
					existsStockList.remove(hStock);
					break;
				}
			}

			// 見つからない
			if (!isFind) {
				notExistsIdList.add(id);
			}
		}

		if (notExistsIdList.size() == 0) {

			// すべて登録済
			return 0;
		}

		// [#6069][v2.2] 削除した商品名称等が空文字で履歴登録される問題を修正 2019.02.27 kawana Start
		boolean autoDelFlg = getBehaviorAutoDelFlg();
		setBehaviorAutoDelFlg(false);
		// [#6069][v2.2] 削除した商品名称等が空文字で履歴登録される問題を修正 2019.02.27 kawana End

		// 未登録の在庫を検索
		TStockCB tStockCb = tStockBhv.newMyConditionBean();
		tStockCb.setupSelect_MClient();
		tStockCb.setupSelect_MProduct();
		tStockCb.setupSelect_MLocation().withMZone();
		tStockCb.setupSelect_MLocation().withMCenter();
		tStockCb.setupSelect_MWarehouse();
		tStockCb.setupSelect_MCustomer();
		tStockCb.setupSelect_TLot();
		tStockCb.setupSelect_TStoreNo().withMCustomer();
		tStockCb.setupSelect_TStoreNo().withTStoreNoSelf();
		// 検索条件
		tStockCb.query().setStockId_InScope(notExistsIdList);

		// 検索実行
		List<TStock> tStockList = tStockBhv.selectList(tStockCb);

		// [#6069][v2.2] 削除した商品名称等が空文字で履歴登録される問題を修正 2019.02.27 kawana Start
		setBehaviorAutoDelFlg(autoDelFlg);
		// [#6069][v2.2] 削除した商品名称等が空文字で履歴登録される問題を修正 2019.02.27 kawana End

		List<HStock> hStockListIns = new ArrayList<HStock>();

		// ===== 在庫の件数分繰返 =====
		for (TStock tstock : tStockList) {

			// 在庫履歴の登録データを作成し
			HStock hStock = new HStock();
			// 在庫ID
			hStock.setStockId(tstock.getStockId());
			// 荷主ID
			hStock.setClientId(tstock.getClientId());
			// 荷主CD
			hStock.setClientCd(tstock.chaseMClient().getClientCd());
			// 荷主名称
			hStock.setClientNm(tstock.chaseMClient().getClientNm());
			// センタID
			hStock.setCenterId(tstock.chaseMLocation().getCenterId());
			// センタCD
			hStock.setCenterCd(tstock.chaseMLocation().chaseMCenter().getCenterCd());
			// センタ名称
			hStock.setCenterNm(tstock.chaseMLocation().chaseMCenter().getCenterNm());
			// 倉庫ID
			hStock.setWarehouseId(tstock.getWarehouseId());
			// 倉庫CD
			hStock.setWarehouseCd(tstock.chaseMWarehouse().getWarehouseCd());
			// 倉庫名称
			hStock.setWarehouseNm(tstock.chaseMWarehouse().getWarehouseNm());
			// 商品ID
			hStock.setProductId(tstock.getProductId());
			// 商品CD
			hStock.setProductCd(tstock.chaseMProduct().getProductCd());
			// 商品名称
			hStock.setProductNm(tstock.chaseMProduct().getProductNm());
			// 商品略称
			hStock.setProductAbbr(tstock.chaseMProduct().getProductAbbr());
			// JANCD
			hStock.setJanCd(tstock.chaseMProduct().getJanCd());
			// 在庫区分ID
			hStock.setStockTypeId(tstock.getStockTypeId());
			//  [C-CWMS-0029] 在庫問合せ - 検索条件にゾーンを追加 2015.06.11 kawana Start
			// ゾーンID
			hStock.setZoneId(tstock.chaseMLocation().getZoneId());
			// ゾーンCD
			hStock.setZoneCd(tstock.chaseMLocation().chaseMZone().getZoneCd());
			// ゾーン名称
			hStock.setZoneNm(tstock.chaseMLocation().chaseMZone().getZoneNm());
			//  [C-CWMS-0029] 在庫問合せ - 検索条件にゾーンを追加 2015.06.11 kawana End
			// ロケーションID
			hStock.setLocationId(tstock.getLocationId());
			// ロケーションCD
			hStock.setLocationCd(tstock.chaseMLocation().getLocationCd());
			// ロケーション名称
			hStock.setLocationNm(tstock.chaseMLocation().getLocationNm());
			// 預託ID
			hStock.setDepositId(tstock.getDepositId());
			// 預託CD
			hStock.setDepositCd(tstock.chaseMCustomer().getCustomerCd());
			// 預託名称
			hStock.setDepositNm(tstock.chaseMCustomer().getCustomerNm());
			// 預託略称
			hStock.setDepositAbbr(tstock.chaseMCustomer().getCustomerAbbr());
			// ロットID
			hStock.setLotId(tstock.getLotId());
			// ロット
			hStock.setLot(tstock.chaseTLot().getLot());
			// 期限日
			hStock.setLimitDt(tstock.chaseTLot().getLimitDt());
			// 荷姿ID
			hStock.setShapeId(tstock.getShapeId());
			// 入庫No.ID
			hStock.setStoreNoId(tstock.getStoreNoId());
			// 入庫ラベルNo.
			hStock.setStoreLabelNo(tstock.chaseTStoreNo().getStoreLabelNo());
			// 元入庫No.ID
			hStock.setOldStoreNumId(tstock.chaseTStoreNo().getOldStoreNumId());
			// 元入庫ラベルNo.
			hStock.setOldStoreLabelNo(tstock.chaseTStoreNo().chaseTStoreNoSelf().getStoreLabelNo());
			// 仕入先ID
			hStock.setSupplierId(tstock.chaseTStoreNo().getSupplierId());
			// 仕入先CD
			hStock.setSupplierCd(tstock.chaseTStoreNo().chaseMCustomer().getCustomerCd());
			// 仕入先名称
			hStock.setSupplierNm(tstock.chaseTStoreNo().chaseMCustomer().getCustomerNm());
			// 仕入先略称
			hStock.setSupplierAbbr(tstock.chaseTStoreNo().chaseMCustomer().getCustomerAbbr());
			// 入庫日
			hStock.setStoreDt(tstock.chaseTStoreNo().getStoreDt());
			// 入数
			hStock.setUnitNum(tstock.getUnitNum());
			// 一括登録用 在庫履歴リストに追加する
			hStockListIns.add(hStock);
		}

		// 一括登録用 在庫履歴リストで一括登録実行
		int[] insertCount = hStockBhv.batchInsert(hStockListIns);

		return insertCount.length;
		// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana End
	}

	/**
	 * <h2>日次処理開始を行う。</h2>
	 * <pre>
	 * 日次処理の開始処理を行う。
	 * 荷主センタマスタのバッチ処理中フラグを「処理中」にする。
	 * 更新件数が0件の場合、日次処理中操作不可エラーをエラーステータスに設定する。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	protected void dailyProcessStart(MClientCenter clientCenter, ErrorStatus errSts) {
		// 荷主センタマスタ更新用データ編集
		MClientCenter mClientCenter = new MClientCenter();
		// バッチ処理中フラグ
		mClientCenter.setBatchProgressFlg_$1();

		// ===== 荷主センタマスタ更新 =====
		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start
		cb.checkInvalidQuery();
		// 荷主ID
		cb.query().setClientId_Equal(clientCenter.getClientId());
		// センタID
		cb.query().setCenterId_Equal(clientCenter.getCenterId());
		// [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End
		// バッチ処理中フラグ
		cb.query().setBatchProgressFlg_Equal_$0();

		// 更新実行
		int updNum = mClientCenterBhv.queryUpdate(mClientCenter, cb);

		if (updNum == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DAILY_PROCESS_CANNOT_OPERATION_RUNNING_ERROR);
			return;
		}
	}

	// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正(BEGIN_TRANSACTION追加) 2014.12.05 kawana
	/**
	 * <h2>システム管理日付を更新する。</h2>
	 * <pre>
	 * システム管理日付の更新処理を行う。
	 * 荷主センタマスタのシステム管理日付を指定された日付に更新する。
	 * 実行結果は運用ログに出力する。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主センタID・システム管理日付
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void systemDateUpdate(MClientCenter clientCenter) {
		// ===== 初期処理 =====
		// 運用ログの開始
		startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_SYSTEM_DATE_UPDATE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT
				, new String[] { getDateString(clientCenter.getSystemDt()) });

		// ===== 荷主センタマスタ更新 =====
		// 荷主センタマスタ更新用データ編集
		MClientCenter mClientCenter = new MClientCenter();
		// [#5576][v3.0] 更新データの荷主センタID指定を削除 2018.11.06 kawana Delete
		// システム管理日付
		mClientCenter.setSystemDt(clientCenter.getSystemDt());

		// 検索条件
		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		// 荷主センタID
		cb.query().setClientCenterId_Equal(clientCenter.getClientCenterId());
		// バッチ処理中フラグ
		cb.query().setBatchProgressFlg_Equal_$1();

		// 更新実行
		int updateNum = mClientCenterBhv.queryUpdate(mClientCenter, cb);

		// 運用ログ追加
		addLog(WmsMessageConst.DATA_UPDATE_DAILY_PROCESS_INFORMATION, mClientCenterBhv.asTableDbName().toUpperCase(), String.valueOf(updateNum));

		// 運用ログの終了
		endLogSection();
	}

	// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正(BEGIN_TRANSACTION追加) 2014.12.05 kawana
	/**
	 * <h2>日次処理日付の更新を行う。</h2>
	 * <pre>
	 * システム管理日付の更新処理を行う。
	 * 荷主センタマスタの前回システム管理日付を指定された日付に更新する。
	 * 実行結果は運用ログに出力する。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主センタID・前回システム管理日付
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void dailyDateUpdate(MClientCenter clientCenter) {
		// ===== 初期処理 =====
		// 運用ログの開始
		startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_DAILY_DATE_UPDATE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_DAILY_DATE_UPDATE
				, new String[] { getDateString(clientCenter.getBeforeSystemDt()) });

		// ===== 荷主センタマスタ更新 =====
		// 荷主センタマスタ更新用データ編集
		MClientCenter mClientCenter = new MClientCenter();
		// [#5576][v3.0] 更新データの荷主センタID指定を削除 2018.11.06 kawana Delete
		// 前回システム管理日付
		mClientCenter.setBeforeSystemDt(clientCenter.getBeforeSystemDt());

		// 検索条件
		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		// 荷主センタID
		cb.query().setClientCenterId_Equal(clientCenter.getClientCenterId());
		// バッチ処理中フラグ
		cb.query().setBatchProgressFlg_Equal_$1();

		// 更新実行
		int updateNum = mClientCenterBhv.queryUpdate(mClientCenter, cb);

		// 運用ログ追加
		addLog(WmsMessageConst.DATA_UPDATE_DAILY_PROCESS_INFORMATION, mClientCenterBhv.asTableDbName().toUpperCase(), String.valueOf(updateNum));

		// 運用ログの終了
		endLogSection();
	}

	// [検査-230] エラーのときにバッチ処理中になってしまう不具合を修正(BEGIN_TRANSACTION追加) 2014.12.05 kawana
	/**
	 * <h2>日次処理終了を行う。</h2>
	 * <pre>
	 * 日次処理の終了処理を行う。
	 * 荷主センタマスタのバッチ処理中フラグを「非処理中」にする。
	 * </pre>
	 * @param clientCenter 荷主センタマスタ：荷主センタID
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void dailyProcessEnd(MClientCenter clientCenter) {
		// ===== 荷主センタマスタ更新 =====
		// 荷主センタマスタ更新用データ編集
		MClientCenter mClientCenter = new MClientCenter();
		// [#5576][v3.0] 更新データの荷主センタID指定を削除 2018.11.06 kawana Delete
		// バッチ処理中フラグ
		mClientCenter.setBatchProgressFlg_$0();

		// 検索条件
		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		// 荷主センタID
		cb.query().setClientCenterId_Equal(clientCenter.getClientCenterId());
		// バッチ処理中フラグ
		cb.query().setBatchProgressFlg_Equal_$1();

		// 更新実行
		mClientCenterBhv.queryUpdate(mClientCenter, cb);
	}

	/**
	 * <h2>ログを開始する。</h2>
	 * <pre>
	 * 運用ログの開始処理を行う。
	 * ログ出力を開始する。
	 * 開始とともにパラメータ情報を運用ログに出力する。
	 * </pre>
	 * @param programCd プログラムCD
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字
	 */
	protected void startLog(String programCd, String messageCd, String... replaceValue) {
		// プログラムCD設定
		getDatabaseLogger().setPgmCd(programCd);

		// 属性１設定
		getDatabaseLogger().setAttribute1(replaceValue[0]);

		// 属性２設定
		getDatabaseLogger().setAttribute2(replaceValue[1]);

		// ログ開始
		getDatabaseLogger().startLog();

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(messageCd, replaceValue);
	}

	/**
	 * <h2>ログを終了する。</h2>
	 * <pre>
	 * 運用ログの終了処理を行う。
	 * 運用ログを終了する。
	 * </pre>
	 */
	protected void endLog() {
		// ログ終了（正常終了
		getDatabaseLogger().endSuccessLog();
	}

	/**
	 * <h2>ログセクションを開始する。</h2>
	 * <pre>
	 * 運用ログのセクション開始処理を行う。
	 * セクションを新しく開始する。
	 * ログセクション終了メソッドが実行されるまでは、開始したセクションにログが追加される。
	 * </pre>
	 * @param sectionCd セクションCD
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字
	 */
	public void startLogSection(String sectionCd, String messageCd, String... replaceValue) {

		// セクションログ開始
		getDatabaseLogger().startLogDtl(sectionCd);

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(messageCd, replaceValue);
	}

	// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana Start

	/**
	 * <h2>ログセクションを開始する。</h2>
	 * <pre>
	 * 運用ログのセクション開始処理を行う。
	 * セクションを新しく開始する。
	 * ログセクション終了メソッドが実行されるまでは、開始したセクションにログが追加される。
	 * </pre>
	 * @param sectionCd セクションCD
	 */
	public void startLogSection(String sectionCd) {

		// セクションログ開始
		getDatabaseLogger().startLogDtl(sectionCd);
	}

	// [EC-CT1-044] メモリ不足対応 2015.06.11 kawana End

	/**
	 * <h2>ログセクション終了を行う。</h2>
	 * <pre>
	 * 運用ログのセクション終了処理を行う。
	 * ログセクションを終了する。
	 * </pre>
	 */
	public void endLogSection() {
		// セクションログ終了
		getDatabaseLogger().endLogDtl();
	}

	/**
	 * <h2>ログ追加を行う。</h2>
	 * <pre>
	 * 運用ログを追加する。
	 * 最後に開始したセクションにログを追加する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字
	 */
	public void addLog(String messageCd, String... replaceValue) {
		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(messageCd, replaceValue);
	}

	/**
	 * <h2>StringのYYYY/MM/DD形式に変換する。</h2>
	 * <pre>
	 * 日付のYYYYMMDD⇒YYYY/MM/DD形式に変換する。
	 * </pre>
	 * @param value 文字列
	 * @return String 文字列
	 */
	public String getDateString(String value) {
		if (value == null || value.length() < 8) {
			return "";
		}
		// 年
		String year = value.substring(0, 4);
		// 月
		String month = value.substring(4, 6);
		// 日
		String day = value.substring(6, 8);
		// YYYY/MM/DD形式
		String dateString = year + "/" + month + "/" + day;

		return dateString;
	}

	// [検査-234] メインロジックの実行チェックからも使用するためpublicに変更 2014.12.05 kawana
	/**
	 * <h2>対象日を取得する。</h2>
	 * <pre>
	 * 対象日を取得する。
	 * （日付 - 保持期間）を計算した結果を返す。
	 * </pre>
	 * @param dateStr 対象日日付の文字列（YYYYMMDD）
	 * @param minusDays 保持期間
	 * @return String (日付 - 保持期間)の日付文字（YYYYMMDD）
	 * @throws Exception 例外処理
	 */
	public String getTargetDay(String dateStr, Long minusDays) throws Exception {
		String delDay = null;

		String tempDays = "-" + String.valueOf(CU.nullToZero(minusDays));
		Calendar cal = Calendar.getInstance();
		cal.setTime(CU.stringToDate(dateStr));
		cal.add(Calendar.DATE, Integer.parseInt(tempDays));
		delDay = CU.calendarToString(cal);

		return delDay;
	}

	/**
	 * <h2>日付文字列８桁をCalendar型に変換し返す。</h2>
	 * <pre>
	 * ８桁の日付文字列（YYYYMMDD）をCalendar型に変換し返す。
	 * </pre>
	 * @param value 日付
	 * @return Calendar型
	 * @throws Exception 例外処理
	 */
	public Calendar stringToCalendar(String value) throws Exception {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(CU.stringToDate(value));

		return calendar;
	}

	/**
	 * <h2>日付が月末日かチェックを行う。</h2>
	 * <pre>
	 * 日付が月末日かチェックを行う。
	 * </pre>
	 * @param value 日付
	 * @return boolean true：月末日 false：月末日ではない
	 */
	public boolean checkLastDayOfMonth(Calendar value) {
		int lastDayOfMonth = value.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nowDay = value.get(Calendar.DAY_OF_MONTH);
		if (nowDay == lastDayOfMonth) {
			return true;
		} else {
			return false;
		}
	}
}
