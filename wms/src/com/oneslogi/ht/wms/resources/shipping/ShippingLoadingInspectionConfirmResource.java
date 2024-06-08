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
 * 積込検品(確認)画面Resourceクラスです。
 */
@Path("/handy/ShippingLoadingInspectionConfirm")
@HandyErrorReturnPath(returnURL = "ShippingLoadingInspectionConfirm/display")
public class ShippingLoadingInspectionConfirmResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;

	/**
	 * 積込検品(確認)画面の初期化を行います
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load()throws Exception{
		load(this,util);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		display(resource,util);
	}

	/**
	 * 積込検品(確認)画面表示を行います
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display()throws Exception{
		display(this,util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util)throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();


		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW Strat

		// 画面初期設定
	    resource.initScreen("ShippingLoadingInspectionConfirmHT");
	    resource.setHeaderColor("Yellow");

	    //フッタボタン（左）設定、
	    resource.setReturnButton(ButtonInfo.builder().url("ShippingLoadingInspectionConfirm/back").itemCd("return").build());

		//フッタボタン（右）設定、積込検品(No)画面へ移動
	    resource.setSendButton(ButtonInfo.builder().url("ShippingLoadingInspectionNo/display").itemCd("send").build());
	    // [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

	    //積込検品(No)画面へ移動

		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingLoadingInspectionConfirm.jsp",ses);

	}

	/**
	 * 出荷管理メニュー画面へ戻す
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back()throws Exception{
		ShippingLoadingInspectionResource.removeSession(this, util, shippingLogic);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}




}
