package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionDeleteLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 入荷検品(終了)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionCancel")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionCancel/display")
public class ReceiveInspectionCancelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspectionDeleteLogic deleteLogic;

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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionCancelHT",VIEW_TEMPLATE_CANCEL);

		///戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionJan/display").itemCd("no").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspectionCancel/send").itemCd("yes").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionCancel.jsp", ses);

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

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		//機能単位セッションをクリア
		ReceiveInspectionResource.removeSession(this, util, deleteLogic);

		ses.setAttribute("ReceiveInspectionDto", dto);

		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			//ラベル選択画面を表示
			ReceiveInspectionLabelResource.display(this, util);
		} else {

			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
			// メニュー表示
			displaySubMenu(MENU_GROUP_CD_RECEIVE);
			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
		}
	}

}
