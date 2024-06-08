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
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 予定無し入荷(ラベル選択)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionLabel")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionLabel/display")
public class ReceiveNoPlanInspectionLabelResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private ReceiveNoPlanInspectionDeleteLogic deleteLogic;

	/**
	 * 予定無し入荷(ラベル選択)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic, customerLogic, stockTypeLogic, userLogic, selectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, CustomerLogic customerLogic, StockTypeLogic stockTypeLogic,
			UserLogic userLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {

		//機能単位セッションを処理化
		ReceiveNoPlanInspectionResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic, selectLogic);

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

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
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			//予定無し入荷(区分)画面に遷移する
			ReceiveNoPlanInspectionKbnResource.load( resource, util, customerLogic, stockTypeLogic, userLogic, selectLogic);
		}
	}

	/**
	 * 入荷検品(ラベル選択)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionLabelHT");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLabel/back").itemCd("return").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionLabel.jsp", ses);

	}

	/**
	 * ラベル選択後にコールされるメソッドです。<br>
	 * 伝票NO・仮ロケ入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@QueryParam("labelKbn") String labelKbn) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		//ラベル区分の設定
		dto.setLabelKbn(labelKbn);

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(区分)画面を表示
		ReceiveNoPlanInspectionKbnResource.load(this, util, customerLogic, stockTypeLogic, userLogic, selectLogic);
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
		ReceiveNoPlanInspectionResource.removeSession(this, util, deleteLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}
}
