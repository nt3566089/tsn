package com.oneslogi.ht.wms.resources;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.ht.base.dto.HandyMenuDto;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * メインメニューResourceクラスです。
 * @author hi.watanabe.mp
 *
 */
//[#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add Start
@CheckBase(CheckMode.TYPE_NOT_CHECK)
//[#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add End
@Path("/handy")
public class HandyMenuResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
	@Inject
	private HandyScreenUtil screenUtil;

	// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End

	// [#3085] handyMenu()メソッド削除 2017.11.21 kawana

	/**
	 * メインメニューで選択されたグループに合致するサブメニューの一覧を取得し、表示します。
	 * @param selGrp サブグループID
	 * @throws Exception
	 */
	@GET
	@Path("/submenu")
	public void displaySubMenu(@QueryParam("selGrp") String selGrp) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		@SuppressWarnings("unchecked")
		List<HandyMenuDto> grpList = (List<HandyMenuDto>) ses.getAttribute("lstHandyGrpMenuDto");
		if (grpList == null || grpList.size() < 1) {
			//セッション切れのため再ログイン
			sendErrorScreen(util.getMessage(WmsMessageConst.HANDY_SESSION_TIMEOUT1),
					util.getMessage(WmsMessageConst.HANDY_SESSION_TIMEOUT2), "");
		}

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		List<HandyMenuDto> list = util.getMenuData(ses, selGrp);
		ses.setAttribute("lstHandyMenuDto", list);
		ses.setAttribute("handySelGrp", selGrp);

		// 画面初期設定
		initScreen("MenuHT");

		// メニュータイトルを変更
		util.setHeaderText(new StringBuilder(list.get(0).getMenuGrpNm())
				.append(screenUtil.screenNm("MenuHT"))
				.toString());

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url("mainmenu").itemCd("return").build());

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End

		// メニュー画面に遷移
		util.setTransURL(HT_URI_BASE + "/common/HandyMenu.jsp", ses);
	}

	/**
	 * メインメニューの一覧を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/mainmenu")
	public void displayMainMenu() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//ログイン関連情報以外のセッション情報をクリア
		util.clearSession(ses);
		//[#3687][VEr3.0] セッション切れ時もメインメニューのDTOを保持するようにしたため削除 2018.02.15 miyabe delete

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// ===== メインメニューに遷移 =====

		// 画面初期設定
		initScreen("MenuGrpHT");

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url("loginClientInfo").itemCd("return").type(BUTTON_URL_JUMP_NO_DATA).build());

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End

		// メインメニュー画面に遷移
		util.setTransURL(HT_URI_BASE + "/common/HandyGrpMenu.jsp", ses);
	}
}
