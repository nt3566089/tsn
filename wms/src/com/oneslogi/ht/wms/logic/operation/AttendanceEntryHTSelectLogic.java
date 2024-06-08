package com.oneslogi.ht.wms.logic.operation;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WWorkCB;
import com.oneslogi.base.dbflute.exbhv.WWorkBhv;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出退勤・休憩入力機能のselectロジック。
 */
public class AttendanceEntryHTSelectLogic extends AbstractWmsLogic {

	@Inject
	private WWorkBhv wWorkBhv;

	/**
	 * <h2>
	 * 出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @param workDt 作業日
	 * @return 条件にあてはまった情報の数
	 */
	public int getAttendanceCntByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setWorkDt_Equal(workDt);
		cb.query().setClockInFlg_Equal("1");

		int cnt = wWorkBhv.selectCount(cb);

		return cnt;
	}

	/**
	 * <h2>
	 * 退勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤している各ユーザの勤務実績ワーク情報を取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @param workDt 作業日
	 * @return 条件にあてはまった情報の数
	 */
	public int getLeavingCntByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();
		cb.query().setWorkUserCd_Equal(workUserCd);
		cb.query().setWorkDt_Equal(workDt);
		cb.query().setClockOutFlg_Equal("1");

		int cnt = wWorkBhv.selectCount(cb);

		return cnt;
	}

	/**
	 * <h2>
	 * 休憩開始での勤務実績ワーク情報のentityを取得する。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに勤務実績ワーク情報のentityを取得する。
	 * </pre>
	 * @param workUserCd 作業者CD
	 * @param workDt 作業日
	 * @return 勤務実績ワーク情報のentity
	 */
	public int getStartRestCntByWorkUserCdAndWorkDt(String workUserCd, String workDt) {
		WWorkCB startCb = wWorkBhv.newMyConditionBean();
		startCb.query().setWorkUserCd_Equal(workUserCd);
		startCb.query().setWorkDt_Equal(workDt);
		startCb.query().setBreakStartFlg_Equal("1");
		startCb.query().setBreakStartTm_IsNotNull();

		int startCnt = wWorkBhv.selectCount(startCb);

		return startCnt;
	}

	/**
	 * <h2>休憩開始での勤務実績ワーク1件検索。</h2>
	 *
	 * @param wWork
	 * @return 休憩開始での勤務実績ワーク
	 */
	public WWork getWWorkByBreakStart(WWork wWork) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();

		cb.query().setWorkUserCd_Equal(wWork.getWorkUserCd());
		cb.query().setWorkDt_Equal(wWork.getWorkDt());
		cb.query().setBreakStartFlg_Equal("1");

		WWork result = wWorkBhv.selectEntity(cb);

		return result;
	}

	/**
	 * <h2>休憩開始での勤務実績ワーク複数件検索。</h2>
	 *
	 * @param wWork
	 * @return 休憩開始での勤務実績ワークリスト
	 */
	public List<WWork> getWWorkListByBreakStart(WWork wWork) {
		WWorkCB cb = wWorkBhv.newMyConditionBean();

		cb.query().setWorkUserCd_Equal(wWork.getWorkUserCd());
		cb.query().setWorkDt_Equal(wWork.getWorkDt());
		cb.query().setBreakStartFlg_Equal("1");

		cb.query().addOrderBy_BreakStartTm_Asc();

		List<WWork> resultList = wWorkBhv.selectList(cb);

		return resultList;
	}

}
