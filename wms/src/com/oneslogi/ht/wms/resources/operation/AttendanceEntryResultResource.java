package com.oneslogi.ht.wms.resources.operation;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.operation.AttendanceEntryHtDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 勤怠入力での結果画面Resourceクラスです。
 *
 */
@Path("/handy/AttendanceEntryResult")
@HandyErrorReturnPath(returnURL = "AttendanceEntryResult/display")
public class AttendanceEntryResultResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	/**
	 * 勤怠入力での結果画面初期化を行います。
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
	 * 勤怠入力での結果画面表示を行います。
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
		resource.initScreen("AttendanceEntryResultHT");

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("AttendanceEntryResult/send").itemCd("send").build());

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/operation/AttendanceEntryResult.jsp", ses);
	}

	/**
	 * 送信が選択された際のイベント。
	 * 出退勤入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		AttendanceEntryRegister.load(this, util);
	}

}
