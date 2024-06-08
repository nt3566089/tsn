package com.oneslogi.wms.resources.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.BUserAuth;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.base.logic.common.PropertyLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.Attendance;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.AttendanceEntryHead;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.EndRest;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.Leaving;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.StartRest;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.UserLoginLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntryCheckLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntryInsertLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntrySelectLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntryUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 勤怠データ出力画面のリソースクラス
 */
@Path("/operation/attendanceEntry")
public class AttendanceEntryResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 2;
		/**
		 * 登録異常
		 */
		protected static final int REGISTER_FAILED = 3;
		/**
		 * 必須項目入力なし
		 */
		protected static final int NOT_INPUT = 4;
		/**
		 * CD重複
		 */
		protected static final int DUPLICATE_DATA = 5;
		/**
		 * センタ切替
		 */
		protected static final int LOGIN_CENTER_CHANGE = 6;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private AttendanceEntryCheckLogic checkLogic;
	@Inject
	private AttendanceEntrySelectLogic selectLogic;
	@Inject
	private AttendanceEntryInsertLogic insertLogic;
	@Inject
	private AttendanceEntryUpdateLogic updateLogic;
	@Inject
	private PropertyLogic propertyLogic;
	@Inject
	private UserLoginLogic userLoginLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>初期処理。</h2>
	 *
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 *
	 * @return AttendanceEntryDto 出退勤・休憩入力画面用DTO
	 */
	@GET
	@Path("/init")
	public AttendanceEntryDto init(AttendanceEntryDto inputDto) {

		//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka Start
		inputDto.data.head.passwordFlg = propertyLogic.getPropertyValue(WmsPropertyConst.ATTENDANCE_ENTRY_PASSWORD_FLG);
		//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka End

		return inputDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 *
	 * <pre>
	 * マスタデータの存在チェック、また入力チェックを行う。
	 * </pre>
	 *
	 * @return AttendanceEntryDto 出退勤・休憩入力画面用DTO
	 */
	@GET
	@Path("/inputCheck")
	public AttendanceEntryDto inputCheck(AttendanceEntryDto inputDto) {

		String workUserCd = inputDto.data.head.workUserCd;
		String passWord = inputDto.data.head.passWord;

		// [ONEsLOGI 労務管理][[#6741] ログインセンタが切り替えられた場合にリロードするように修正 2019.10.24 tanaka Start
		MUserLogin mUserLogin = new MUserLogin();
		mUserLogin.setUserId(getUserId());
		mUserLogin = userLoginLogic.getPkEntityWithDeletedCheck(mUserLogin);

		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(inputDto.data.head.centerCd);
		mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenter);

		if (mUserLogin.getCenterId() != mCenter.getCenterId()) {
			this.getErrorManager().add(errRetSts(StatusCode.LOGIN_CENTER_CHANGE), WmsMessageConst.LOGIN_CENTER_CHANGE_INFO);
			return inputDto;
		}
		// [ONEsLOGI 労務管理][[#6741] ログインセンタが切り替えられた場合にリロードするように修正 2019.10.24 tanaka End

		// [ONEsLOGI 労務管理][#6704]パスワード入力無しの場合の作業者CD不正のエラーメッセージを修正 2019.09.13 tsuboi Start
		//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka Start
		if (!inputDto.data.head.passwordFlg.equals("0")) {
			// ユーザ認証マスタチェック
			BUserAuth bUserAuth = selectLogic.getBUserAuth(workUserCd);
			if (bUserAuth == null || !bUserAuth.getPassword().equals(passWord)){
				this.getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.USER_CD_OR_PASSWORD_INPUT_ERROR);
				return inputDto;
			}
		}
		if(checkLogic.isExistUser(workUserCd)) {
			// [ONEsLOGI 労務管理][#6699] エラーメッセージを変更 2019.09.12 tsuboi Start
			getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.USER_CD_NOT_FOUND_ERROR);
			// [ONEsLOGI 労務管理][#6699] エラーメッセージを変更 2019.09.12 tsuboi End
		}
		//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka End
		// [ONEsLOGI 労務管理][#6704]パスワード入力無しの場合の作業者CD不正のエラーメッセージを修正 2019.09.13 tsuboi End

		return inputDto;
	}

	/**
	 * <h2>出勤情報の登録。</h2>
	 * <pre>
	 * 引数の情報から出勤情報を登録する。
	 * </pre>
	 * @param inputDto 作業時間登録画面用DTO
	 * @return AttendanceEntryDto 処理結果DTO
	 * @throws ParseException
	 */
	@POST
	@Path("/attendanceRegister")
	public AttendanceEntryDto attendanceRegister(AttendanceEntryDto inputDto) throws ParseException {
		AttendanceEntryHead head = inputDto.data.head;
		Attendance attendance = inputDto.data.attendance;
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.08 tanaka Start
		WWork wWork = new WWork();
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.08 tanaka End

		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka Start
		if (propertyLogic.getPropertyValue(WmsPropertyConst.ATTENDANCE_TEST_MODE_FLG).equals("0")) {
			serverTime(inputDto);
		}
		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka End

		String workUserCd = inputDto.data.head.workUserCd;
		String entryStartDt = inputDto.data.attendance.entryStartDt;

		inputDto.data.log.logComment = selectLogic.getLogComment(WmsMessageConst.SELECT_ATTENDANCE_LOG, head);

		if (checkLogic.isAttendance(workUserCd, entryStartDt)) {
			//出勤済みの場合

			if (selectLogic.getAttendanceCntAnotherCenter(inputDto, entryStartDt) > 0) {
				//他センタですでに出勤済の場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return inputDto;
				// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.08 tanaka Start
			} else if (checkLogic.isLeaving(workUserCd, entryStartDt)) {
				wWork.setEntryStartDt(attendance.entryStartDt);
				wWork.setEntryStartTm(attendance.entryStartTm);
				if (checkLogic.isAllReadyLeaving(workUserCd, entryStartDt, wWork)) {
					//既に退勤している場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return inputDto;
				} else {
					// 既に出勤されている場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ERROR);
					return inputDto;
				}
				// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.08 tanaka End
			} else {
				// 既に出勤されている場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ERROR);
				return inputDto;
			}
		}

		insertLogic.insertRegisterByWWorkAttendance(head, attendance);

		return inputDto;
	}

	/**
	 * <h2>退勤情報の登録。</h2>
	 * <pre>
	 * 引数の情報から退勤情報を登録する。
	 * </pre>
	 * @param inputDto 作業時間登録画面用DTO
	 * @return AttendanceEntryDto 処理結果DTO
	 * @throws ParseException
	 */
	@POST
	@Path("/leavingRegister")
	public AttendanceEntryDto leavingRegister(AttendanceEntryDto inputDto) throws ParseException {

		AttendanceEntryHead head = inputDto.data.head;

		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka Start
		if (propertyLogic.getPropertyValue(WmsPropertyConst.ATTENDANCE_TEST_MODE_FLG).equals("0")) {
			serverTime(inputDto);
		}
		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka End

		String workUserCd = inputDto.data.head.workUserCd;
		String entryEndDt = inputDto.data.leaving.entryEndDt;

		WWork attendance = new WWork();

		if (checkLogic.isAttendance(workUserCd, entryEndDt)) {
			//出勤済みの場合
			attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, entryEndDt);
			if (selectLogic.getAttendanceCntAnotherCenter(inputDto, entryEndDt) > 0) {
				//他センタですでに出勤済の場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return inputDto;

			} else if (checkLogic.isLeaving(workUserCd, entryEndDt)) {
				if (checkLogic.isAllReadyLeaving(workUserCd, entryEndDt, attendance)) {
					//既に退勤している場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return inputDto;
				}
			}
			//退勤されていない場合は後続の処理を続行
		} else {
			//出勤していない場合は前日の出勤データを確認する
			if (checkLogic.isAttendance(workUserCd, beforeWorkDt(entryEndDt))) {
				//前日で出勤済みの場合
				attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, beforeWorkDt(entryEndDt));
				if (selectLogic.getAttendanceCntAnotherCenter(inputDto, beforeWorkDt(entryEndDt)) > 0) {
					//他センタで出勤済の場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
					return inputDto;
				} else if (checkLogic.isLeaving(workUserCd, beforeWorkDt(entryEndDt))) {
					if (checkLogic.isAllReadyLeaving(workUserCd, beforeWorkDt(entryEndDt), attendance)) {
						//既に退勤している場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.NOT_ATTENDANCE_ERROR);
						return inputDto;
					}
				}
				//退勤されていない場合は後続の処理を続行
			} else {
				//当日も前日も出勤されていない場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.NOT_ATTENDANCE_ERROR);
				return inputDto;
			}
		}

		Leaving leaving = inputDto.data.leaving;

		insertLogic.insertRegisterByWWorkLeaving(head, leaving);

		inputDto.data.log.logComment = selectLogic.getLogComment(WmsMessageConst.SELECT_LEAVE_WORK_LOG, head);

		return inputDto;
	}

	/**
	 * <h2>休憩開始時刻の登録。</h2>
	 * <pre>
	 * 引数の情報から休憩開始情報を登録する。
	 * </pre>
	 * @param inputDto 作業時間登録画面用DTO
	 * @return AttendanceEntryDto 処理結果DTO
	 * @throws ParseException
	 */
	@POST
	@Path("/startRestRegister")
	public AttendanceEntryDto startRestRegister(AttendanceEntryDto inputDto) throws ParseException {

		AttendanceEntryHead head = inputDto.data.head;

		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka Start
		if (propertyLogic.getPropertyValue(WmsPropertyConst.ATTENDANCE_TEST_MODE_FLG).equals("0")) {
			serverTime(inputDto);
		}
		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka End

		String workUserCd = inputDto.data.head.workUserCd;
		String breakStartDt = inputDto.data.startRest.breakStartDt;

		WWork attendance = new WWork();

		if (checkLogic.isAttendance(workUserCd, breakStartDt)) {
			//出勤済みの場合
			attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, breakStartDt);
			if (selectLogic.getAttendanceCntAnotherCenter(inputDto, breakStartDt) > 0) {
				//他センタですでに出勤済の場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return inputDto;

			} else if (checkLogic.isLeaving(workUserCd, breakStartDt)) {
				if (checkLogic.isAllReadyLeaving(workUserCd, breakStartDt, attendance)) {
					//既に退勤している場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return inputDto;
				} else if (checkLogic.isStartRest(workUserCd, breakStartDt, attendance)) {
					// 既に休憩開始が選択されている場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_DUPLICATE_ERROR);
					return inputDto;
				}
			} else {
				if (checkLogic.isStartRest(workUserCd, breakStartDt, attendance)) {
					// 既に休憩開始が選択されている場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_DUPLICATE_ERROR);
					return inputDto;
				}
				//休憩開始されていない場合は後続の処理を続行
			}
		} else {
			//出勤していない場合は前日の出勤データを確認する
			if (checkLogic.isAttendance(workUserCd, beforeWorkDt(breakStartDt))) {
				//前日で出勤済みの場合

				attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, beforeWorkDt(breakStartDt));
				if (selectLogic.getAttendanceCntAnotherCenter(inputDto, beforeWorkDt(breakStartDt)) > 0) {
					//他センタで出勤済の場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
					return inputDto;
				} else if (checkLogic.isLeaving(workUserCd, beforeWorkDt(breakStartDt))) {
					if (checkLogic.isAllReadyLeaving(workUserCd, beforeWorkDt(breakStartDt), attendance)) {
						//既に退勤している場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
						return inputDto;
					} else if (checkLogic.isStartRest(workUserCd, beforeWorkDt(breakStartDt), attendance)) {
						// 既に休憩開始が選択されている場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_DUPLICATE_ERROR);
						return inputDto;
					}
				} else {
					if (checkLogic.isStartRest(workUserCd, beforeWorkDt(breakStartDt), attendance)) {
						// 既に休憩開始が選択されている場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_DUPLICATE_ERROR);
						return inputDto;
					}
					//前日の作業から継続している場合は処理を続行
				}
			} else {
				// 出勤されていない場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.NOT_ATTENDANCE_ERROR);
				return inputDto;
			}
		}

		StartRest startRest = inputDto.data.startRest;

		List<WWork> wWorkList = selectLogic.getWWorkListByBreakStart(head);

		for(int i=0; i<wWorkList.size(); i++) {
			wWorkList.get(i).setBreakStartFlg("0");
			updateLogic.updateRegisterByWWork(wWorkList.get(i));
		}

		insertLogic.insertRegisterByWWorkRestStart(head, startRest);

		inputDto.data.log.logComment = selectLogic.getLogComment(WmsMessageConst.SELECT_START_BREAK_LOG, head);

		return inputDto;
	}

	/**
	 * <h2>休憩終了時刻の登録。</h2>
	 * <pre>
	 * 引数の情報から休憩終了情報を登録する。
	 * </pre>
	 * @param inputDto 作業時間登録画面用DTO
	 * @return AttendanceEntryDto 処理結果DTO
	 */
	@POST
	@Path("/endRestRegister")
	public AttendanceEntryDto endRestRegister(AttendanceEntryDto inputDto) throws ParseException{

		AttendanceEntryHead head = inputDto.data.head;

		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka Start
		if (propertyLogic.getPropertyValue(WmsPropertyConst.ATTENDANCE_TEST_MODE_FLG).equals("0")) {
			serverTime(inputDto);
		}
		// [ONEsLOGi 労務管理][#6725] 勤怠入力時にサーバ日付かローカル日付かをプロパティで制御するように変更 2019.11.15 tanaka End

		String workUserCd = inputDto.data.head.workUserCd;
		String breakEndDt = inputDto.data.endRest.breakEndDt;

		WWork attendance = new WWork();

		if (checkLogic.isAttendance(workUserCd, breakEndDt)) {
			//出勤済みの場合
			attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, breakEndDt);
			if (selectLogic.getAttendanceCntAnotherCenter(inputDto, breakEndDt) > 0) {
				//他センタですでに出勤済の場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return inputDto;

			} else if (checkLogic.isLeaving(workUserCd, breakEndDt)) {
				if (checkLogic.isAllReadyLeaving(workUserCd, breakEndDt, attendance)) {
					//既に退勤している場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return inputDto;
				} else if (!checkLogic.isStartRest(workUserCd, breakEndDt, attendance)) {
					// 休憩開始が選択されていない場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
					return inputDto;
				}
			} else {
				if (!checkLogic.isStartRest(workUserCd, breakEndDt, attendance)) {
					// 休憩開始が選択されていない場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
					return inputDto;
				}
				//休憩開始されていない場合は後続の処理を続行
			}
		} else {
			//出勤していない場合は前日の出勤データを確認する
			if(checkLogic.isAttendance(workUserCd, beforeWorkDt(breakEndDt))) {
				attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, beforeWorkDt(breakEndDt));
				if (selectLogic.getAttendanceCntAnotherCenter(inputDto, beforeWorkDt(breakEndDt)) > 0) {
					//他センタですでに出勤済の場合
					getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
					return inputDto;

				} else if(checkLogic.isLeaving(workUserCd, beforeWorkDt(breakEndDt))) {
					if (checkLogic.isAllReadyLeaving(workUserCd, beforeWorkDt(breakEndDt), attendance)) {
						//既に退勤している場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
						return inputDto;
					} else if(!checkLogic.isStartRest(workUserCd, beforeWorkDt(breakEndDt), attendance)) {
						// 休憩開始が選択されていない場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
						return inputDto;
					}
				} else {
					if(!checkLogic.isStartRest(workUserCd, beforeWorkDt(breakEndDt), attendance)) {
						// 休憩開始が選択されていない場合
						getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
						return inputDto;
					}
					//前日の作業から継続している場合は処理を続行
				}
			} else {
				// 出勤されていない場合
				getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.NOT_ATTENDANCE_ERROR);
				return inputDto;
			}
		}

		EndRest endRest = inputDto.data.endRest;

		WWork wWork = selectLogic.getWWorkByBreakStart(head);
		wWork.setBreakEndDt(endRest.breakEndDt);
		wWork.setBreakEndTm(endRest.breakEndTm);
		wWork.setWorkFlg("0");
		wWork.setBreakStartFlg("0");

		updateLogic.updateRegisterByWWork(wWork);

		inputDto.data.log.logComment = selectLogic.getLogComment(WmsMessageConst.SELECT_END_BREAK_LOG, head);

		return inputDto;
	}

	/**
	 * <h2>前日のシステム管理日付を取得</h2>
	 * <pre>
	 * 当日のシステム管理日付を受け取り、前日のシステム管理日付を計算
	 * </pre>
	 *
	 * @param inputDto 作業時間登録画面用DTO
	 * @return String 前日のシステム管理日付
	 * @throws ParseException
	 */
	public String beforeWorkDt(String workDt) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		//昨日のシステム管理日付を取得し設定
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(workDt.substring(0,4)));
		cal.set(Calendar.MONTH, Integer.parseInt(workDt.substring(4,6)) - 1);
		cal.set(Calendar.DATE, Integer.parseInt(workDt.substring(6)));
		cal.add(Calendar.DATE, -1);
		return dateFormat.format(cal.getTime());
	}

	/**
	 * <h2>前日のシステム管理日付を取得</h2>
	 * <pre>
	 * 当日のシステム管理日付を受け取り、前日のシステム管理日付を計算
	 * </pre>
	 *
	 * @param inputDto 作業時間登録画面用DTO
	 * @return String 前日のシステム管理日付
	 * @throws ParseException
	 */
	public void serverTime(AttendanceEntryDto inputDto) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		// [ONEsLOGi 労務管理][#6725] 24時間表示になるように修正 2019.11.15 tanaka Start
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
		// [ONEsLOGi 労務管理][#6725] 24時間表示になるように修正 2019.11.15 tanaka End

		//サーバ日付を取得し設定
		Calendar cal = Calendar.getInstance();

		if (inputDto.data.attendance.entryStartDt != null) {
			inputDto.data.attendance.entryStartDt = dateFormat.format(cal.getTime());
			inputDto.data.attendance.entryStartTm = timeFormat.format(cal.getTime());
		} else if (inputDto.data.leaving.entryEndDt != null) {
			inputDto.data.leaving.entryEndDt = dateFormat.format(cal.getTime());
			inputDto.data.leaving.entryEndTm = timeFormat.format(cal.getTime());
		} else if (inputDto.data.startRest.breakStartDt != null) {
			inputDto.data.startRest.breakStartDt = dateFormat.format(cal.getTime());
			inputDto.data.startRest.breakStartTm = timeFormat.format(cal.getTime());
		} else {
			inputDto.data.endRest.breakEndDt = dateFormat.format(cal.getTime());
			inputDto.data.endRest.breakEndTm = timeFormat.format(cal.getTime());
		}

		// [ONEsLOGi 労務管理][#6725] 24時間表示になるように修正 2019.11.15 tanaka Start
		timeFormat = new SimpleDateFormat("HH:mm:ss");
		// [ONEsLOGi 労務管理][#6725] 24時間表示になるように修正 2019.11.15 tanaka End

		inputDto.data.head.workDt = dateFormat.format(cal.getTime());
		inputDto.data.head.workTm = timeFormat.format(cal.getTime());

		return;
	}

}
