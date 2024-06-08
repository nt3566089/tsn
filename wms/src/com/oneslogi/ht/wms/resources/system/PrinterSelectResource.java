

package com.oneslogi.ht.wms.resources.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.PUserAutoPrintSettingDto;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.resources.system.PrinterSelectReportLayoutResource.PrinterSelectMode;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * プリンタ選択Resourceクラスです。
 */
@Path("/handy/PrinterSelect")

public class PrinterSelectResource extends HandyResourceBase {

	/**
	 * @param resource   呼び出すResourceクラス
	 * @param util       ハンディ向けモジュールで使用する共通関数群
	 * @param userLogic  ユーザマスタに対するロジッククラス
	 * @param mode
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, UserLogic userLogic, PrinterSelectMode mode){

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		PrinterSelectDto dto = new PrinterSelectDto();

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana Start

		dto.mode = mode;

		PUserAutoPrintSettingDto pUserAutoPrintSettingDto = dto.getpUserAutoPrintSettingDto();

		switch (mode) {
		case USER:
			BUser bUser = new BUser();
			bUser.setUserCd(loginInfo.getUserCd());
			bUser = userLogic.getUkEntity(bUser);

			pUserAutoPrintSettingDto.setUserId(bUser.getUserId());
			break;
		case TERMINAL:
			pUserAutoPrintSettingDto.setTerminalAssignCd(resource.getTerminalCd());
			break;
		}

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana End

		ses.setAttribute("PrinterSelectDto", dto);
	}

	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util){

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		util.clearHtComCtl(ses);

		ses.removeAttribute("PrinterSelectDto");


	}



}
