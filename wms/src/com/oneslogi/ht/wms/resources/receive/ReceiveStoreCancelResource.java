package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreWkDeleteLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 入庫格納(終了確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreCancel")
@HandyErrorReturnPath(returnURL = "ReceiveStoreCancel/display")
public class ReceiveStoreCancelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveStoreWkDeleteLogic receivestoreLogic;

	/**
	 * 入庫格納(終了確認)画面初期化を行います。
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
	 * 入庫格納(終了確認)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD Start
		resource.initScreen("ReceiveStoreCancelHT",VIEW_TEMPLATE_CANCEL);
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreCancel/send").build());
		//フッタボタン（左）設定
		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			resource.setFooterLeftButton(
					 ButtonInfo.builder().url("ReceiveStoreLabelNo/display")
					.itemCd("no")
					.type(BUTTON_URL_JUMP_WITH_DATA)
					.keyType(KEY_TYPE_RETURN).build());

		}else{
			resource.setFooterLeftButton(
					 ButtonInfo.builder().url("ReceiveStoreKariLoc/display")
					.itemCd("no")
					.type(BUTTON_URL_JUMP_WITH_DATA)
					.keyType(KEY_TYPE_RETURN).build());

		}

		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("ReceiveStoreCancel/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD END
		//終了確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreCancel.jsp", ses);
	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入荷検品ワークテーブルをクリアする、入荷管理メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションを再構造
		ReceiveStoreResource.removeSession(this, util, receivestoreLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}
}
