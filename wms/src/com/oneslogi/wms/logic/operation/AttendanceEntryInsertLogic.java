package com.oneslogi.wms.logic.operation;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.WWorkBhv;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.Attendance;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.AttendanceEntryHead;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.Leaving;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.StartRest;

/**
 * 出退勤・休憩入力機能のinsertロジック。
 */
public class AttendanceEntryInsertLogic extends AbstractWmsLogic {

	// 使用Bhv
	@Inject
	private WWorkBhv wWorkBhv;

	// 勤務実績ワークEntity
	private WWork wWork;

	/**
	 * <h2>
	 * WWorkテーブル(出勤)にインサートする際の必要な情報をセットするメソッド。
	 * </h2>
	 * <pre>
	 * 【必要なパラメータ】
	 * centerCd    ：センタCD
	 * clientCd    ：荷主CD
	 * workUserCd  ：作業者CD
	 * workDt      ：作業日
	 * clockInFlg  ：出勤フラグ("1")
	 * clockOutFlg : 退勤フラグ("0")
	 * entryStartDt：出勤日
	 * entryStartTm：出勤時間
	 * </pre>
	 * @param head ヘッダパラメータ
	 * @param attendance 出勤パラメータ
	 * @return インサートされたWWork
	 */
	public WWork insertRegisterByWWorkAttendance(AttendanceEntryHead head, Attendance attendance) {
		this.wWork = new WWork();
		this.wWork.setCenterCd(head.centerCd);
		this.wWork.setWorkUserCd(head.workUserCd);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		this.wWork.setWorkDt(head.systemDt);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End

		this.wWork.setClockInFlg("1");
		this.wWork.setClockOutFlg("0");
		this.wWork.setEntryStartDt(attendance.entryStartDt);
		this.wWork.setEntryStartTm(attendance.entryStartTm);

		return this.insertByWWork();
	}

	/**
	 * <h2>
	 * WWorkテーブル(退勤)にインサートする際の必要な情報をセットするメソッド。
	 * </h2>
	 * <pre>
	 * 【必要なパラメータ】
	 * centerCd    ：センタCD
	 * clientCd    ：荷主CD
	 * workUserCd  ：作業者CD
	 * workDt      ：作業日
	 * clockInFlg  ：出勤フラグ("0")
	 * clockOutFlg : 退勤フラグ("1")
	 * entryStartDt：退勤日
	 * entryStartTm：退勤時間
	 * </pre>
	 *
	 * @param head ヘッダパラメータ
	 * @param leaving 退勤パラメータ
	 * @return インサートされたWWork
	 */
	public WWork insertRegisterByWWorkLeaving(AttendanceEntryHead head, Leaving leaving) {
		this.wWork = new WWork();
		this.wWork.setCenterCd(head.centerCd);
		this.wWork.setWorkUserCd(head.workUserCd);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		this.wWork.setWorkDt(head.systemDt);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End

		this.wWork.setClockInFlg("0");
		this.wWork.setClockOutFlg("1");
		this.wWork.setEntryEndDt(leaving.entryEndDt);
		this.wWork.setEntryEndTm(leaving.entryEndTm);

		return this.insertByWWork();
	}

	/**
	 * <h2>
	 * WWorkテーブル(退勤)にインサートする際の必要な情報をセットするメソッド。
	 * </h2>
	 * <pre>
	 * 【必要なパラメータ】
	 * centerCd      ：センタCD
	 * clientCd      ：荷主CD
	 * workUserCd    ：作業者CD
	 * workDt        ：作業日
	 * clockInFlg    ：出勤フラグ("0")
	 * clockOutFlg   : 退勤フラグ("0")
	 * breakStartTm  ：休憩開始時間
	 * breakStartFlg ：休憩開始フラグ("1")
	 * </pre>
	 *
	 * @param head ヘッダパラメータ
	 * @param startRest 休憩開始パラメータ
	 * @return インサートされたWWork
	 */
	public WWork insertRegisterByWWorkRestStart(AttendanceEntryHead head, StartRest startRest) {
		this.wWork = new WWork();
		this.wWork.setCenterCd(head.centerCd);
		this.wWork.setWorkUserCd(head.workUserCd);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		this.wWork.setWorkDt(head.systemDt);

		this.wWork.setClockInFlg("0");
		this.wWork.setClockOutFlg("0");
		this.wWork.setBreakStartDt(startRest.breakStartDt);
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End
		this.wWork.setBreakStartTm(startRest.breakStartTm);
		this.wWork.setBreakStartFlg("1");

		return this.insertByWWork();
	}

	/**
	 * <h2>
	 * 勤務実績ワークテーブルのインサートロジック。
	 * </h2>
	 * <pre>
	 * セットされたパラメータをインサートする。
	 * 値がセットされていない場合、NullPointerExceptionをthrowする。
	 * </pre>
	 */
	private WWork insertByWWork() {
		if(this.wWork == null) {
			throw new NullPointerException();
		}
		wWorkBhv.insert(this.wWork);

		return this.wWork;
	}

}