package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 検品格納(ラベル選択)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreLabel")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreLabel/display")
public class ReceiveInspecStoreLabelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;
	@Inject
	private ReceiveInspecStoreDeleteLogic deleteLogic;

	/**
	 * 入荷検品格納(ラベル選択)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic, selectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, ReceiveInspecStoreSelectLogic selectLogic) throws Exception {

		//機能単位セッションを処理化
		ReceiveInspecStoreResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic, selectLogic);

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			//自画面表示
			display(resource, util);
		} else {
			// 入庫No管理対象外場合
			// 入庫ラベル使用
			dto.setLabelKbn("1");
			ses.setAttribute("ReceiveInspecStoreDto", dto);
			//伝票NO入力画面に遷移する
			ReceiveInspecStoreWorkNoResource.load(resource, util);
		}
	}

	/**
	 * 入荷検品格納(ラベル選択)画面表示を行います。
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
		resource.initScreen("ReceiveInspecStoreLabelHT");
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreLabel/back").itemCd("return").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreLabel.jsp", ses);

	}

	/**
	 * ラベル選択後にコールされるメソッドです。<br>
	 * 伝票NO入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@QueryParam("labelKbn") String labelKbn) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		//ラベル区分の設定
		dto.setLabelKbn(labelKbn);

		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//伝票NO画面を表示
		ReceiveInspecStoreWorkNoResource.load(this, util);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ReceiveInspecStoreResource.removeSession(this, util, deleteLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}
}
