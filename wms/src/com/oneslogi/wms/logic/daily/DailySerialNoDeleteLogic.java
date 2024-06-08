package com.oneslogi.wms.logic.daily;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateLogic.AbstractQuerySetter;

/**
 * シリアルNo.データ削除ロジッククラス
 */
public class DailySerialNoDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TSerialNoBhv tSerialNoBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private DailyCommonLogic commonLogic;
	@Inject
	private QueryUpdateLogic queryUpdateLogic;

	/**
	 * <h2>シリアルNo.データ削除処理.</h2>
	 * <pre>
	 * シリアルNo.データの削除処理を行う。
	 * トランザクション保持期間 + 履歴保持期間 が過ぎたシリアルNo.データを削除する。
	 *
	 * 【削除テーブル】
	 *  ・シリアルNo.管理テーブル
	 *
	 * 【パラメータの使用項目】
	 *  (荷主センタマスタ)
	 *  ・センタID : 必須
	 *  ・荷主ID : 必須
	 *  ・システム管理日付 : 必須
	 *  (パラメータマスタ)
	 *  ・トランザクション保持期間 : 必須
	 *  ・履歴保持期間 : 必須
	 * </pre>
	 * @param clientCenter 荷主センタマスタ
	 * @param param パラメータマスタ
	 */
	public void delete(MClientCenter clientCenter, MParam param) {

		// 荷主ID
		final long clientId = clientCenter.getClientId();
		// センタID
		final long centerId = clientCenter.getCenterId();
		// システム管理日付
		final String systemDt = clientCenter.getBeforeSystemDt();
		// トランザクション保持期間
		final long tKeepingDays = param.getTKeepingDays();
		// 履歴保持期間
		final long hKeepingDays = param.getHKeepingDays();

		// ===== 対象日の計算 =====

		String delDt = null;
		Timestamp delDtTimestamp = null;

		if (tKeepingDays != 0) {

			try {
				// 削除対象日に荷主センタマスタ.前回システム管理日付 － パラメータ.トランザクション保持期間 を設定する
				delDt = commonLogic.getTargetDay(systemDt, (tKeepingDays + hKeepingDays));
				// ※※※ 更新日の23:59:59までのデータを消すため対象日1日加算する
				Calendar calendar = commonLogic.stringToCalendar(delDt);
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				delDtTimestamp = new Timestamp(calendar.getTimeInMillis());
			} catch (Exception e) {
				getErrorManager().throwException(new IllegalStateException("TargetDay calculate error.", e));
			}
		}

		// ===== 初期処理 =====

		String[] logStrs = new String[] {
				commonLogic.getDateString(systemDt),
				String.valueOf(tKeepingDays),
				String.valueOf(hKeepingDays),
				commonLogic.getDateString(delDt)
		};

		// セクションの開始ログ
		commonLogic.startLogSection(WmsMessageConst.DAILY_PROCESS_SECTION_NAME_SERIAL_NO_DELETE
				, WmsMessageConst.DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS_HIST_KEEP_DAYS
				, logStrs);

		// トランザクション保持期間のチェック
		if (tKeepingDays == 0L) {

			// 運用ログの終了
			commonLogic.endLogSection();
			return;
		}

		// 削除フラグの条件付加を停止する
		boolean preAutoDelFlg = getBehaviorAutoDelFlg();
		setBehaviorAutoDelFlg(false);

		// ===== シリアルNo.受信データ削除 =====

		{
			TSerialNoCB cb = tSerialNoBhv.newMyConditionBean();
			// 荷主ID
			cb.query().setClientId_Equal(clientId);
			// センタID
			cb.query().setCenterId_Equal(centerId);
			// 更新日
			cb.query().setUpdDt_LessEqual(delDtTimestamp);
			// 削除実行
			int delNum = queryUpdateLogic.queryDeleteWithSelect(tSerialNoBhv, cb, getQuerySetter(tSerialNoBhv));
			// 運用ログ追加
			commonLogic.addLog(WmsMessageConst.DATA_DELETE_DAILY_PROCESS_INFORMATION, tSerialNoBhv.asTableDbName().toUpperCase(), String.valueOf(delNum));
		}

		// ===== 終了処理 =====

		// 削除フラグ条件付加を戻す
		setBehaviorAutoDelFlg(preAutoDelFlg);
		// セクションの終了ログ
		commonLogic.endLogSection();
	}

	/**
	 * <h2>QueryDelete , QueryUpdateの引数を取得.</h2>
	 * <pre>
	 * 日次締処理共通ロジッククラスの QueryDelete , QueryUpdate メソッドの引数、
	 * QuerySetterクラスを作成して返却する。
	 * </pre>
	 * @param bhv 処理対象テーブルの操作クラス
	 * @return 処理対象テーブル用のQuerySetterクラス
	 */
	private AbstractQuerySetter getQuerySetter(AbstractBehaviorWritable<?, ?> bhv) {

		if (bhv instanceof TSerialNoBhv) {
			return new AbstractQuerySetter() {

				@Override
				protected void specifyPkOnly(AbstractConditionBean cb) {
					((TSerialNoCB) cb).specify().columnSerialNoId();
				}

				@SuppressWarnings("unchecked")
				@Override
				protected List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList) {
					return tSerialNoBhv.extractSerialNoIdList((List<TSerialNo>) selectList);
				}

				@Override
				protected AbstractConditionBean createCbInPkOnly(List<Long> pkList) {
					TSerialNoCB cb = tSerialNoBhv.newMyConditionBean();
					cb.query().setSerialNoId_InScope(pkList);
					return cb;
				}
			};
		}

		getErrorManager().throwException(new IllegalArgumentException("querySetter not found"));
		return null;
	}
}
