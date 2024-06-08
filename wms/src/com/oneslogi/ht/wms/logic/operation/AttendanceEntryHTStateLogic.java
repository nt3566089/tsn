package com.oneslogi.ht.wms.logic.operation;

import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 勤怠のステータスを管理するロジッククラス。
 */
public class AttendanceEntryHTStateLogic extends AbstractWmsLogic {

	// 出勤
	private static final int ATTENDANCE = 1 << 0;

	// 退勤
	private static final int LEAVING = 1 << 1;

	// 休憩開始
	private static final int START_REST = 1 << 2;

	// 休憩終了
	private static final int END_REST = 1 << 3;

	public boolean isAttendance(int state) {
		return (state & ATTENDANCE) != 0;
	}

	public boolean isLeaving(int state) {
		return (state & LEAVING) != 0;
	}

	public boolean isStartRest(int state) {
		return (state & START_REST) != 0;
	}

	public boolean isEndRest(int state) {
		return (state & END_REST) != 0;
	}

	public int stateAttendance() {
		return ATTENDANCE;
	}

	public int stateLeaving() {
		return LEAVING;
	}

	public int stateStartRest() {
		return START_REST;
	}

	public int stateEndRest() {
		return END_REST;
	}

}
