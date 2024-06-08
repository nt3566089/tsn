package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 商品棚卸入力(終了確認)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductCancel")
@HandyErrorReturnPath(returnURL = "InventoryInputProductCancel/display")
public class InventoryInputProductCancelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private InventoryInputProductLogic inventoryLogic;

	/**
	 * 商品棚卸入力(終了確認)画面初期化を行います。
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
	 * 商品棚卸入力(終了確認)画面表示を行います。
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
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.29  ライ Start
		resource.initScreen("InventoryInputProductCancelHT", VIEW_TEMPLATE_CANCEL);

		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url("InventoryInputProductKbn/display")
				.itemCd("no").type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_RETURN).build());

		resource.setFooterRightButton(
				ButtonInfo.builder().url("InventoryInputProductCancel/send")
				.itemCd("yes").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.29  ライ END
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductCancel.jsp", ses);
	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、棚卸管理メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションを再構造
		InventoryInputProductResource.removeSession(this, util, inventoryLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_INVENTORY);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}
}
