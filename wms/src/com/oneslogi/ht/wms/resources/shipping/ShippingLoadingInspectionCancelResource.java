package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 積込検品(終了)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingLoadingInspectionCancel")
@HandyErrorReturnPath(returnURL = "ShippingLoadingInspectionCancel/display")
public class ShippingLoadingInspectionCancelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;


	/**
	 * 積込検品(終了)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		//自画面表示
		display(resource, util);
	}

	/**
	 * 積込検品(終了)画面表示を行います。
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

        // [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW Strat

	    // 画面初期設定
        resource.initScreen("ShippingLoadingInspectionCancelHT",VIEW_TEMPLATE_CANCEL);
        resource.setHeaderColor("Yellow");

        //フッタボタン（左）設定
	    resource.setFooterLeftButton(ButtonInfo.builder()
	    		.url("ShippingLoadingInspectionNo/display")
	    		.itemCd("no")
	    		.type(BUTTON_URL_JUMP_WITH_DATA)
	    		.keyType(KEY_TYPE_RETURN)
	    		.build());

	    //フッタボタン（右）設定
	    resource.setFooterRightButton(ButtonInfo.builder()
	    		.url("ShippingLoadingInspectionCancel/send")
                .itemCd("yes")
                .type(BUTTON_URL_JUMP_WITH_DATA)
                .keyType(KEY_TYPE_SEND)
                .build());

        // [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingLoadingInspectionCancel.jsp",ses);
	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 積込検品(終了)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ShippingLoadingInspectionResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

}
