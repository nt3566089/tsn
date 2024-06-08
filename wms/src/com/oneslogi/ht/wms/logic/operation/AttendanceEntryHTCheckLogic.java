package com.oneslogi.ht.wms.logic.operation;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 勤怠に関するロジッククラス
 */
public class AttendanceEntryHTCheckLogic extends AbstractWmsLogic {

	@Inject
	private AttendanceEntryHTSelectLogic selectLogic;

	/**
	 * <h2>
	 * 出勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤されているかの判定を行う。
	 * </pre>
	 * @param wWork
	 * @return 出勤されている場合true、されていない場合falseを返す
	 */
	public boolean isAttendance(WWork wWork) {
		// 出勤済みのユーザにおける件数を取得
		int attendanceCnt = selectLogic.getAttendanceCntByWorkUserCdAndWorkDt(wWork.getWorkUserCd(), wWork.getWorkDt());

		return attendanceCnt > 0;
	}

	/**
	 * <h2>
	 * 退勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤されているかの判定を行う。
	 * </pre>
	 * @param wWork
	 * @return 退勤されている場合true、されていない場合falseを返す
	 */
	public boolean isLeaving(WWork wWork) {
		// 退勤済みのユーザ件数を取得
		int leavingCnt = selectLogic.getLeavingCntByWorkUserCdAndWorkDt(wWork.getWorkUserCd(), wWork.getWorkDt());

		return leavingCnt > 0;
	}

	/**
	 * <h2>
	 * 休憩開始が選択されているかのチェック関数。
	 * </h2>
	 *
	 * @param wWork
	 * @return 休憩開始が選択されていない場合true, それ以外の場合false
	 */
	public boolean isStartRest(WWork wWork) {
		// 休憩開始のユーザ件数を取得
		int startRestCnt = selectLogic.getStartRestCntByWorkUserCdAndWorkDt(wWork.getWorkUserCd(), wWork.getWorkDt());

		return startRestCnt == 0;
	}

}
