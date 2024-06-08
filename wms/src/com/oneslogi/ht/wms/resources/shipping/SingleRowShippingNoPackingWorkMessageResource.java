package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 単行出荷検品(出庫作業メッセージ)画面Resourceクラスです。
 *
 */
@Path("/handy/SingleRowShippingNoPackingWorkMessage")
@HandyErrorReturnPath(returnURL = "SingleRowShippingNoPackingWorkMessage/load")
public class SingleRowShippingNoPackingWorkMessageResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;

	/**
	 * 画面初期化
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

		SingleRowShippingNoPackingDto dto = (SingleRowShippingNoPackingDto) ses.getAttribute("SingleRowShippingNoPackingDto");

		String strSpgWorkComment = dto.getPickingWorkMessage();
		// メッセージを分割
		dto.setPickingWorkMessage(util.splitText(strSpgWorkComment, 20));

		ses.setAttribute("SingleRowShippingNoPackingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 画面表示
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

		// 画面設定
		resource.initScreen("SingleRowShippingNoPackingWorkMessageHT", "spg_work_comment");
		// 継続ボタンの設定
		resource.setSendButton(ButtonInfo.builder().url("SingleRowShippingNoPackingJanCd/backFromWorkMessage").itemCd("continue").build());

		// 画面表示
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SingleRowShippingNoPackingWorkMessage.jsp", ses);
	}
}
