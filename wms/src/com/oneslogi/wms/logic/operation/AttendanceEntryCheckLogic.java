package com.oneslogi.wms.logic.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.AttendanceEntryHead;

public class AttendanceEntryCheckLogic extends AbstractWmsLogic {

	@Inject
	private AttendanceEntrySelectLogic selectLogic;

	/**
	 * <h2>
	 * 出勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤されているかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return 出勤されている場合true、されていない場合falseを返す
	 */
	public boolean isAttendance(String workUserCd, String workDt) {

		// 出勤済みのユーザにおける件数を取得
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		int attendanceCnt = selectLogic.getAttendanceCntByWorkUserCdAndWorkDt(workUserCd, workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		return attendanceCnt > 0;

	}

	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
	/**
	 * <h2>
	 * 他センタで既に出勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤されているかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return 出勤されている場合true、されていない場合falseを返す
	 */
	public boolean isAnotherCenterAttendance(AttendanceEntryHead head, String entryStartDt) {
		AttendanceEntryDto inputDto = new AttendanceEntryDto();

		inputDto.data.head.workUserCd = head.workUserCd;
		inputDto.data.head.centerCd = head.centerCd;

		// 他センタで出勤済みのユーザ件数を取得
		int attendanceCnt = selectLogic.getAttendanceCntAnotherCenter(inputDto, entryStartDt);

		return attendanceCnt > 0;

	}
	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

	/**
	 * <h2>
	 * 出勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに出勤されているかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return 出勤されている場合true、されていない場合falseを返す
	 */
	public WWork getAttendanceEntity(String workUserCd, String workDt) {

		// 出勤済みのユーザにおける件数を取得
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		WWork wWork = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		return wWork;

	}

	/**
	 * <h2>
	 * 退勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤されているかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return 退勤されている場合true、されていない場合falseを返す
	 * @throws ParseException
	 */
	public boolean isLeaving(String workUserCd, String workDt) {

		// 退勤済みのユーザにおける件数を取得
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		int leavingCnt = selectLogic.getLeavingCntByWorkUserCdAndWorkDt(workUserCd, workDt);
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		return leavingCnt > 0;

	}

	/**
	 * <h2>
	 * 退勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤されているかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return 退勤されている場合true、されていない場合falseを返す
	 * @throws ParseException
	 */
	public boolean isAllReadyLeaving(String workUserCd, String workDt, WWork attendance) throws ParseException {

		// 退勤済みのユーザにおける件数を取得
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		int leavingCnt = 0;
		List<WWork> wWorkList = selectLogic.getLeavingListByWorkUserCdAndWorkDt(workUserCd, workDt);

		if (wWorkList != null) {
			for (WWork wWork : wWorkList) {
				if (isBeforeDtTm(attendance.getEntryStartDt()+attendance.getEntryStartTm(), wWork.getEntryEndDt()+wWork.getEntryEndTm())) {
					leavingCnt ++ ;
				}
			}
		}
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		return leavingCnt > 0;

	}

	/**
	 * <h2>
	 * 休憩開始が選択されているかのチェック関数。
	 * </h2>
	 *
	 * @param inputDto
	 * @return 休憩開始が選択されていない場合true, それ以外の場合false
	 */
	public boolean isStartRest(String workUserCd, String workDt, WWork wWork) {

		// 休憩開始のユーザ件数を取得
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		int startRestCnt = selectLogic.getStartRestCntByWorkUserCdAndWorkDt(workUserCd, workDt);

		return startRestCnt > 0;
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End
	}

	/**
	 * <h2>
	 * 退勤されているか判定するロジック。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに退勤されているかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return 退勤されている場合true、されていない場合falseを返す
	 * @throws ParseException
	 */
	public boolean isAlreadyLeaveStartRest(String workUserCd, String workDt, WWork attendance) throws ParseException {

		// 退勤済みのユーザにおける件数を取得
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka Start
		int leavingCnt = 0;
		List<WWork> wWorkList = selectLogic.getStartRestListByWorkUserCdAndWorkDt(workUserCd, workDt);

		if (wWorkList != null) {
			for (WWork wWork : wWorkList) {
				if (isBeforeDtTm(attendance.getEntryStartDt()+attendance.getEntryStartTm(), wWork.getEntryEndDt()+wWork.getEntryEndTm())) {
					leavingCnt ++ ;
				}
			}
		}
		//[ONEsLOGI 労務管理][#6636]WMS連携時にシステム管理日付を取得するように修正 2019.09.10 tanaka End

		return leavingCnt > 0;

	}

	/**
	 * <h2>
	 * 入力情報のユーザCDがユーザマスタに存在するかのチェック関数。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとにユーザマスタに存在するかの判定を行う。
	 * </pre>
	 * @param inputDto
	 * @return ユーザマスタに存在しない場合true、存在する場合falseを返す
	 */
	public boolean isExistUser(String workUserCd) {
		String userCd = workUserCd;

		BUser bUser = selectLogic.getBUserEntityByUserCd(userCd);

		return bUser == null;
	}

	/**
	 * <h2>
	 * 休憩開始が選択されているかの判定。
	 * </h2>
	 * <pre>
	 * 引数の情報をもとに休憩が開始されているかの判定を行う。
	 * </pre>
	 * @param wWork
	 * @return 休憩開始が選択されている場合true、されていない場合false
	 */
	public boolean isBreakStartFlg(List<WWork> wWorkList) {
		boolean checkFlg = false;

		for(WWork wWork : wWorkList) {
			String breakStartFlg = wWork.getBreakStartFlg();

			if(breakStartFlg != null && breakStartFlg.equals("1")) {
				checkFlg = true;
			}
		}

		return checkFlg;
	}

	/**
	 * <h2>対象の日時と日時の範囲内かを判定する。</h2>
	 *
	 * @param startTmStr 開始日時
	 * @param endTmStr 終了日時
	 * @param tmStr 対象日時
	 * @return
	 * @throws ParseException
	 */
	public boolean isPeriod(String startTmStr, String endTmStr, String tmStr) throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddHHmm");
		Date startTm = sdFormat.parse(startTmStr);
		Date endTm = sdFormat.parse(endTmStr);
		Date tm = sdFormat.parse(tmStr);

		// フォーマットされたDateをCalendarにセット
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startTm);

		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(endTm);

		Calendar tmCalendar = Calendar.getInstance();
		tmCalendar.setTime(tm);

		if(endCalendar.before(startCalendar)) {
			startCalendar.add(Calendar.DATE, -1);
		}

		if(endCalendar.before(tmCalendar)) {
			tmCalendar.add(Calendar.DATE, -1);
		}

		return tmCalendar.after(startCalendar) && tmCalendar.before(endCalendar);
	}

	/**
	 * <h2>対象の日付より前にあるか判定する。</h2>
	 *
	 * @param startDtTmStr
	 * @param endDtTmStr
	 * @return
	 * @throws ParseException
	 */
	public boolean isBeforeDtTm(String leftDtTmStr, String rightDtTmStr) throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddHHmm");
		Date rightDtTm = sdFormat.parse(rightDtTmStr);
		Date leftDtTm = sdFormat.parse(leftDtTmStr);

		// フォーマットされたDateをCalendarにセット
		Calendar rightCalendar = Calendar.getInstance();
		rightCalendar.setTime(rightDtTm);

		Calendar leftCalendar = Calendar.getInstance();
		leftCalendar.setTime(leftDtTm);

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.08 tanaka Start
		return leftCalendar.before(rightCalendar) || leftCalendar.equals(rightCalendar);
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.08 tanaka End
	}

}
