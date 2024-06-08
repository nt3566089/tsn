package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷)(終了確認)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionCancel")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionCancel/display")
public class SerialShippingInspectionCancelResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;

	/**
	 * シリアル登録(出荷)(終了確認)画面初期化を行います。
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
	 * シリアル登録(出荷)(終了確認)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng Start
		//画面ヘッダ設定
		resource.initScreen("SerialShippingInspectionCancelHT",VIEW_TEMPLATE_CANCEL);
		//フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url("SerialShippingInspectionJanCd/display")
				.itemCd("no")
				.type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_RETURN).build()
				);

		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("SerialShippingInspectionCancel/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_SEND).build()
				);
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionCancel.jsp",ses);
	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登録(出荷)(出庫作業No入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		//機能単位セッションを再構造
		SerialShippingInspectionResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		SerialShippingInspectionWorkNoResource.load(this, util);

	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
