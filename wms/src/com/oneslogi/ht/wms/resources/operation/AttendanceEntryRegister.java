package com.oneslogi.ht.wms.resources.operation;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.logic.common.BClassLogic;
import com.oneslogi.base.logic.common.PropertyLogic;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.operation.AttendanceEntryHtDto;
import com.oneslogi.ht.wms.logic.operation.AttendanceEntryHTStateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsPropertyConst;

/**
 * 勤怠入力画面の出退勤・休憩選択Resourceクラスです。
 *
 */
@Path("/handy/AttendanceEntryRegister")
@HandyErrorReturnPath(returnURL = "AttendanceEntryRegister/display")
public class AttendanceEntryRegister extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private AttendanceEntryHTStateLogic stateLogic;
	@Inject
	private BClassLogic bClassLogic;

	/**
	 * 勤怠入力画面初期化を行います。
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

		if(dto == null) {
			dto = new AttendanceEntryHtDto();
		}

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		PropertyLogic propertyLogic = new PropertyLogic();
		dto.setTestMode(propertyLogic.getPropertyValue(WmsPropertyConst.ATTENDANCE_TEST_MODE_FLG));
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

		ses.setAttribute("AttendanceEntryHtDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 勤怠入力画面表示を行います。
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
		resource.initScreen("AttendanceEntryRegisterHT");
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("AttendanceEntryRegister/back").itemCd("return").build());

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/operation/AttendanceEntryRegister.jsp", ses);
	}

	/**
	 * 戻るが選択された際のイベント。
	 * 運用メニューに遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {
		displaySubMenu(MENU_GROUP_CD_OPERATION);
	}

	/**
	 * 「出勤」が選択された際のイベント。
	 * 確認画面へ遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/attendanceRegister")
	public void attendanceRegister(@BeanParam AttendanceEntryHtDto bean) throws Exception {

		AttendanceEntryHtDto dto = getScreenDto();

		dto.setState(stateLogic.stateAttendance(), bClassLogic);

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		dto.setInDate(bean.getInDate());
		dto.setInTime(bean.getInTime());
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

		setScreenDto(dto);

		AttendanceEntryConfirmResource.load(this, util);

	}

	/**
	 * 「退勤」が選択された際のイベント。
	 * 確認画面へ遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/leaveingRegister")
	public void leaveingRegister(@BeanParam AttendanceEntryHtDto bean) throws Exception {

		AttendanceEntryHtDto dto = getScreenDto();

		dto.setState(stateLogic.stateLeaving(), bClassLogic);

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		dto.setInDate(bean.getInDate());
		dto.setInTime(bean.getInTime());
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

		setScreenDto(dto);

		AttendanceEntryConfirmResource.load(this, util);

	}

	/**
	 * 「休憩開始」が選択された際のイベント。
	 * 確認画面へ遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/startRestRegister")
	public void startRestRegister(@BeanParam AttendanceEntryHtDto bean) throws Exception {

		AttendanceEntryHtDto dto = getScreenDto();

		dto.setState(stateLogic.stateStartRest(), bClassLogic);

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		dto.setInDate(bean.getInDate());
		dto.setInTime(bean.getInTime());
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

		setScreenDto(dto);

		AttendanceEntryConfirmResource.load(this, util);

	}

	/**
	 * 「休憩終了」が選択された際のイベント。
	 * 確認画面へ遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/endRestRegister")
	public void endRestRegister(@BeanParam AttendanceEntryHtDto bean) throws Exception{

		AttendanceEntryHtDto dto = getScreenDto();

		dto.setState(stateLogic.stateEndRest(), bClassLogic);

		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
		dto.setInDate(bean.getInDate());
		dto.setInTime(bean.getInTime());
		// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

		setScreenDto(dto);

		AttendanceEntryConfirmResource.load(this, util);

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
	 * 画面DTOをセッションスコープに格納します。
	 * @param dto
	 */
	private void setScreenDto(AttendanceEntryHtDto dto) {
		HttpSession ses = getScreenSession();

		ses.setAttribute("AttendanceEntryHtDto", dto);
	}

	/**
	 * セッションを取得します。
	 * @return
	 */
	private HttpSession getScreenSession() {
		HttpServletRequest req = this.getHttpServletRequest();
		return req.getSession();
	}

}
