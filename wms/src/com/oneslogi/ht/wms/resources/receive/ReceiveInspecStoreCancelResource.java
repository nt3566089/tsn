package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreDeleteLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 検品格納(終了)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreCancel")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreCancel/display")
public class ReceiveInspecStoreCancelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspecStoreDeleteLogic deleteLogic;

	/**
	 * 入荷検品(終了)画面初期化を行います。
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
	 * 入荷検品(終了)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreCancelHT",VIEW_TEMPLATE_CANCEL);

		///戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreJan/display").itemCd("no").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreCancel/send").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreCancel.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * ラベル選択画面またはメニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		//機能単位セッションをクリア
		ReceiveInspecStoreResource.removeSession(this, util, deleteLogic);

		ses.setAttribute("ReceiveInspecStoreDto", dto);

		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg( dto.getMParamDto().getStoreNoFlg() );
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		if (mParam.isStoreNoFlg$1() ) {
			//入庫No管理対象場合
			//ラベル選択画面を表示
			ReceiveInspecStoreLabelResource.display(this, util);
		} else {
			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
			// メニュー表示
			displaySubMenu(MENU_GROUP_CD_RECEIVE);
			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
		}
	}

}
