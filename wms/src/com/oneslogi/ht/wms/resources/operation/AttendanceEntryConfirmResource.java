package com.oneslogi.ht.wms.resources.operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.WWork;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.operation.AttendanceEntryHtDto;
import com.oneslogi.ht.wms.logic.operation.AttendanceEntryHTStateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.Attendance;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.AttendanceEntryHead;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.Leaving;
import com.oneslogi.wms.dto.operation.AttendanceEntryDto.StartRest;
import com.oneslogi.wms.logic.operation.AttendanceEntryCheckLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntryInsertLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntrySelectLogic;
import com.oneslogi.wms.logic.operation.AttendanceEntryUpdateLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 勤怠入力での確認画面Resourceクラスです。
 *
 */
@Path("/handy/AttendanceEntryConfirm")
@HandyErrorReturnPath(returnURL = "AttendanceEntryRegister/display")
public class AttendanceEntryConfirmResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private AttendanceEntryHTStateLogic stateLogic;
	@Inject
	private AttendanceEntryCheckLogic checkLogic;
	@Inject
	private AttendanceEntrySelectLogic selectLogic;
	@Inject
	private AttendanceEntryInsertLogic insertLogic;
	@Inject
	private AttendanceEntryUpdateLogic updateLogic;

	/**
	 * 勤怠入力での確認画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		AttendanceEntryHtDto dto = (AttendanceEntryHtDto) ses.getAttribute("AttendanceEntryHtDto");

		ses.setAttribute("AttendanceEntryHtDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 勤怠入力での確認画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// 画面初期設定
		resource.initScreen("AttendanceEntryConfirmHT");
		// 非表示ボタン設定
		resource.setHideButton(ButtonInfo.builder().url("AttendanceEntryConfirm/send").build());
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("AttendanceEntryConfirm/back").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("AttendanceEntryConfirm/send").itemCd("send").build());

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/operation/AttendanceEntryConfirm.jsp", ses);
	}

	/**
	 * 戻るが選択された際のイベント。
	 * 勤怠入力画面へ遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {
		AttendanceEntryRegister.load(this, util);
	}

	/**
	 * 送信が選択された際のイベント。
	 * 出退勤情報を更新します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		AttendanceEntryHtDto dto = getScreenDto();

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		if (dto.getTestMode().equals("1")) {
			if (dto.getInDate().length() != 8 || !WCU.checkDateStr(dto.getInDate())) {
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATE_ERROR);
				return;
			}
			if (dto.getInTime().length() != 4 || !WCU.isTimeType(dto.getInTime())) {
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_TIME_ERROR);
				return;
			}
		}

		if(stateLogic.isAttendance(dto.getState())) {
			attendance(dto);
		}
		else if(stateLogic.isLeaving(dto.getState())) {
			leaving(dto);
		}
		else if(stateLogic.isStartRest(dto.getState())) {
			startRest(dto);
		}
		else if(stateLogic.isEndRest(dto.getState())) {
			endRest(dto);
		}

		AttendanceEntryResultResource.load(this, util);
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End
	}

	/**
	 * セッションスコープから画面DTOを取得します。
	 * @return 画面DTO
	 */
	private AttendanceEntryHtDto getScreenDto() {
		HttpSession ses = getScreenSession();

		AttendanceEntryHtDto dto = (AttendanceEntryHtDto) ses.getAttribute("AttendanceEntryHtDto");
		return dto;
	}

	/**
	 * ハンディでログインしたユーザ情報を取得します。
	 * @return ハンディでログインしたユーザ情報
	 */
	private HandyLoginUserInfo getHTLoginUserInfo() {
		HttpSession ses = getScreenSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		return loginInfo;
	}

	/**
	 * セッションを取得します。
	 * @return セッション
	 */
	private HttpSession getScreenSession() {
		HttpServletRequest req = this.getHttpServletRequest();
		return req.getSession();
	}

	/**
	 * 現在の日時を取得します。
	 * @return
	 */
	private Date setDateTimeNow(AttendanceEntryHtDto dto) {
		Calendar calendar = Calendar.getInstance();

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		if (dto.getTestMode().equals("1")) {
			calendar.set(Calendar.YEAR, Integer.parseInt(dto.getInDate().substring(0,4)));
			calendar.set(Calendar.MONTH, Integer.parseInt(dto.getInDate().substring(4,6)) - 1);
			calendar.set(Calendar.DATE, Integer.parseInt(dto.getInDate().substring(6)));
			calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(dto.getInTime().substring(0,2)));
			calendar.set(Calendar.MINUTE, Integer.parseInt(dto.getInTime().substring(2)));
		} else {
			dto.setInDate(getDateTimeFormat(calendar.getTime(), "yyyyMMdd"));
			dto.setInTime(getDateTimeFormat(calendar.getTime(), "HHmm"));
		}

		dto.setTextDate(WCU.stringToDateString(dto.getInDate()));
		dto.setTextTime(WCU.stringToTimeString(dto.getInTime()));
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

		return calendar.getTime();
	}

	/**
	 * 日時を引数のフォーマット文字列にあわせフォーマットします。
	 *
	 * @param date
	 * @param format
	 * @return
	 */
	private String getDateTimeFormat(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
	/**
	 * 出勤情報の更新。
	 * @throws ParseException
	 */
	private void attendance(AttendanceEntryHtDto dto) throws ParseException {
		AttendanceEntryHead head = new AttendanceEntryHead();
		Attendance attendance = new Attendance();
		WWork wWork = new WWork();

		// 現在の日時を取得
		Date dateNow = setDateTimeNow(dto);
		//共通情報を取得
		head = setHead(dateNow);

		attendance.entryStartDt = getDateTimeFormat(dateNow, "yyyyMMdd");
		attendance.entryStartTm = getDateTimeFormat(dateNow, "HHmm");

		if(checkLogic.isAttendance(head.workUserCd, attendance.entryStartDt)) {
			if (checkLogic.isAnotherCenterAttendance(head, attendance.entryStartDt)) {
				//他センタですでに出勤済の場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return ;
			} else if (checkLogic.isLeaving(head.workUserCd, attendance.entryStartDt)) {
				wWork = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(head.workUserCd, attendance.entryStartDt);
				if (checkLogic.isAllReadyLeaving(head.workUserCd, attendance.entryStartDt, wWork)) {
					//既に退勤している場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return ;
				} else {
					// 既に出勤されている場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ERROR);
					return ;
				}
			} else {
				// 既に出勤されている場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ERROR);
				return ;
			}
		}

		insertLogic.insertRegisterByWWorkAttendance(head, attendance);
	}

	/**
	 * 退勤情報の更新。
	 * @throws ParseException
	 */
	private void leaving(AttendanceEntryHtDto dto) throws ParseException {

		AttendanceEntryHead head = new AttendanceEntryHead();
		WWork attendance = new WWork();
		Leaving leaving = new Leaving();

		// 現在の日時を取得
		Date dateNow = setDateTimeNow(dto);
		head = setHead(dateNow);

		String workUserCd = head.workUserCd;
		String entryEndDt = getDateTimeFormat(dateNow, "yyyyMMdd");

		if(checkLogic.isAttendance(workUserCd, entryEndDt)) {
			attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, entryEndDt);
			if (checkLogic.isAnotherCenterAttendance(head, entryEndDt)) {
				//他センタですでに出勤済の場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return ;
			} else if (checkLogic.isLeaving(workUserCd, entryEndDt)) {
				if (checkLogic.isAllReadyLeaving(workUserCd, entryEndDt, attendance)) {
					//既に退勤している場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return ;
				}
			}
			//退勤されていない場合は後続の処理を続行
		} else {
			//出勤していない場合は前日の出勤データを確認する
			if (checkLogic.isAttendance(workUserCd, beforeWorkDt(entryEndDt))) {
				//前日で出勤済みの場合
				attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, beforeWorkDt(entryEndDt));
				if (checkLogic.isAnotherCenterAttendance(head, beforeWorkDt(entryEndDt))) {
					//他センタですでに出勤済の場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
					return ;
				} else if (checkLogic.isLeaving(workUserCd, beforeWorkDt(entryEndDt))) {
					if (checkLogic.isAllReadyLeaving(workUserCd, beforeWorkDt(entryEndDt), attendance)) {
						//既に退勤している場合
						getErrorManager().add(new ErrorStatus(), WmsMessageConst.NOT_ATTENDANCE_ERROR);
						return ;
					}
				}
			} else {
				//当日も前日も出勤されていない場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.NOT_ATTENDANCE_ERROR);
				return ;
			}
		}

		leaving.entryEndDt = getDateTimeFormat(dateNow, "yyyyMMdd");
		leaving.entryEndTm = getDateTimeFormat(dateNow, "HHmm");

		insertLogic.insertRegisterByWWorkLeaving(head, leaving);

	}

	/**
	 * 休憩開始情報の更新。
	 * @throws ParseException
	 */
	private void startRest(AttendanceEntryHtDto dto) throws ParseException {

		AttendanceEntryHead head = new AttendanceEntryHead();
		WWork attendance = new WWork();
		StartRest startRest = new StartRest();

		// 現在の日時を取得
		Date dateNow = setDateTimeNow(dto);

		head = setHead(dateNow);

		String workUserCd = head.workUserCd;
		String breakStartDt = getDateTimeFormat(dateNow, "yyyyMMdd");

		if (checkLogic.isAttendance(workUserCd, breakStartDt)) {
			//出勤済みの場合
			attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, breakStartDt);
			if (checkLogic.isAnotherCenterAttendance(head, breakStartDt)) {
				//他センタですでに出勤済の場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return ;
			} else if (checkLogic.isLeaving(workUserCd, breakStartDt)) {
				if (checkLogic.isAllReadyLeaving(workUserCd, breakStartDt, attendance)) {
					//既に退勤している場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return ;
				}
			} else {
				if (checkLogic.isStartRest(workUserCd, breakStartDt, attendance)) {
					// 既に休憩開始が選択されている場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.BREAK_START_DUPLICATE_ERROR);
					return ;
				}
				//休憩開始されていない場合は後続の処理を続行
			}
		} else {
			//出勤していない場合は前日の出勤データを確認する
			if (checkLogic.isAttendance(workUserCd, beforeWorkDt(breakStartDt))) {
				//前日で出勤済みの場合

				attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, beforeWorkDt(breakStartDt));
				if (checkLogic.isAnotherCenterAttendance(head, beforeWorkDt(breakStartDt))) {
					//他センタですでに出勤済の場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
					return ;
				} else if (checkLogic.isLeaving(workUserCd, beforeWorkDt(breakStartDt))) {
					if (checkLogic.isAllReadyLeaving(workUserCd, beforeWorkDt(breakStartDt), attendance)) {
						//既に退勤している場合
						getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
						return ;
					}
				} else {
					if (checkLogic.isStartRest(workUserCd, beforeWorkDt(breakStartDt), attendance)) {
						// 既に休憩開始が選択されている場合
						getErrorManager().add(new ErrorStatus(), WmsMessageConst.BREAK_START_DUPLICATE_ERROR);
						return ;
					}
					//前日の作業から継続している場合は処理を続行
				}
			} else {
				// 出勤されていない場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.NOT_ATTENDANCE_ERROR);
				return ;
			}
		}

		List<WWork> wWorkList = selectLogic.getWWorkListByBreakStart(head);

		for (int i = 0; i < wWorkList.size(); i++) {
			wWorkList.get(i).setBreakStartFlg("0");
			updateLogic.updateRegisterByWWork(wWorkList.get(i));
		}

		startRest.breakStartDt = getDateTimeFormat(dateNow, "yyyyMMdd");
		startRest.breakStartTm = getDateTimeFormat(dateNow, "HHmm");

		insertLogic.insertRegisterByWWorkRestStart(head, startRest);

	}

	/**
	 * 休憩終了情報の更新。
	 * @throws ParseException
	 */
	private void endRest(AttendanceEntryHtDto dto) throws ParseException {

		AttendanceEntryHead head = new AttendanceEntryHead();
		WWork attendance = new WWork();

		// 現在の日時を取得
		Date dateNow = setDateTimeNow(dto);

		head = setHead(dateNow);

		String workUserCd = head.workUserCd;
		String breakEndDt = getDateTimeFormat(dateNow, "yyyyMMdd");

		if (checkLogic.isAttendance(workUserCd, breakEndDt)) {
			//出勤済みの場合
			attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, breakEndDt);
			if (checkLogic.isAnotherCenterAttendance(head, breakEndDt)) {
				//他センタですでに出勤済の場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
				return ;
			} else if (checkLogic.isLeaving(workUserCd, breakEndDt)) {
				if (checkLogic.isAllReadyLeaving(workUserCd, breakEndDt, attendance)) {
					//既に退勤している場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
					return ;
				} else if (!checkLogic.isStartRest(workUserCd, breakEndDt, attendance)) {
					// 休憩開始が選択されていない場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
					return ;
				}
			} else {
				if (!checkLogic.isStartRest(workUserCd, breakEndDt, attendance)) {
					// 休憩開始が選択されていない場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
					return ;
				}
				//休憩開始されていない場合は後続の処理を続行
			}
		} else {
			//出勤していない場合は前日の出勤データを確認する
			if(checkLogic.isAttendance(workUserCd, beforeWorkDt(breakEndDt))) {
				attendance = selectLogic.getAttendanceEntityByWorkUserCdAndWorkDt(workUserCd, beforeWorkDt(breakEndDt));
				if (checkLogic.isAnotherCenterAttendance(head, beforeWorkDt(breakEndDt))) {
					//他センタですでに出勤済の場合
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_ATTENDANCE_ANOTHER_ERROR);
					return ;
				} else if(checkLogic.isLeaving(workUserCd, beforeWorkDt(breakEndDt))) {
					if (checkLogic.isAllReadyLeaving(workUserCd, beforeWorkDt(breakEndDt), attendance)) {
						//既に退勤している場合
						getErrorManager().add(new ErrorStatus(), WmsMessageConst.ALREADY_LEAVE_WORK_ERROR);
						return ;
					} else if (!checkLogic.isStartRest(workUserCd, beforeWorkDt(breakEndDt), attendance)) {
						// 休憩開始が選択されていない場合
						getErrorManager().add(new ErrorStatus(), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
						return ;
					}
				} else {
					if(!checkLogic.isStartRest(workUserCd, beforeWorkDt(breakEndDt), attendance)) {
						// 休憩開始が選択されていない場合
						getErrorManager().add(new ErrorStatus(), WmsMessageConst.BREAK_START_IS_NOT_SELECTED);
						return ;
					}
					//前日の作業から継続している場合は処理を続行
				}
			} else {
				// 出勤されていない場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.NOT_ATTENDANCE_ERROR);
				return ;
			}
		}

		WWork wWork = selectLogic.getWWorkByBreakStart(head);

		wWork.setBreakEndDt(getDateTimeFormat(dateNow, "yyyyMMdd"));
		wWork.setBreakEndTm(getDateTimeFormat(dateNow, "HHmm"));
		wWork.setWorkFlg("0");
		wWork.setBreakStartFlg("0");

		updateLogic.updateRegisterByWWork(wWork);

	}

	/**
	 * 勤務実績ワークの共通パラメータを設定します。
	 * @param dateNow
	 * @return 設定された勤務実績ワークEntity
	 */
	private AttendanceEntryHead setHead(Date dateNow) {
		HandyLoginUserInfo loginInfo = getHTLoginUserInfo();

		// 共通パラメータを設定
		AttendanceEntryHead head = new AttendanceEntryHead();
		head.centerCd = loginInfo.getCenterCd();
		head.workUserCd = loginInfo.getUserCd();
		head.systemDt = getDateTimeFormat(dateNow, "yyyyMMdd");

		return head;
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
	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

}
