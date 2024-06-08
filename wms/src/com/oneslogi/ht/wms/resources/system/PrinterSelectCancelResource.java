package com.oneslogi.ht.wms.resources.system;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * プリンタ選択(終了)画面Resourceクラス
 *
 */
@Path("/handy/PrinterSelectCancel")
@HandyErrorReturnPath(returnURL = "PrinterSelectCancel/display")
public class PrinterSelectCancelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	/**
	 * プリンタ選択(終了)画面の初期化処理
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception{
		load(this,util);
	}

	/**
	 * プリンタ選択(終了)画面の初期化処理
	 * @param resource
	 * @param util
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util)throws Exception{
		display(resource,util);
	}

	/**
	 * プリンタ選択(終了)画面表示処理
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display()throws Exception{
		display(this,util);
	}

	/**
	 * プリンタ選択(終了)画面表示処理
	 * @param resource
	 * @param util
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util)throws Exception{

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start

		resource.initScreen("PrinterSelectCancelHT", VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder().url("PrinterSelectReportLayout/display")
				.itemCd("no").type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder().url("PrinterSelectCancel/send").itemCd("yes")
				.type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/system/PrinterSelectCancel.jsp",ses);

	}

	/**
	 * プリンタ選択(終了)画面の送信処理
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception{

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		PrinterSelectResource.removeSession(this, util);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SYSTEM);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}
}
