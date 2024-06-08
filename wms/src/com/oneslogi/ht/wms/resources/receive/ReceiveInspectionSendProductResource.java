package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 完了確認(商品単位)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionSendProduct")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionSendProduct/display")
public class ReceiveInspectionSendProductResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	/**
	 * 完了確認(商品単位)画面初期化を行います。
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
	 * 完了確認(商品単位)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionSendProductHT");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionQty/display").itemCd("no").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspectionJan/load").itemCd("yes").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionSendProduct.jsp", ses);

	}

}