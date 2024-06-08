package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionDeleteLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 入荷検品(終了)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionCancel")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionCancel/display")
public class SerialReceiveInspectionCancelResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private SerialReceiveInspectionDeleteLogic deleteLogic;

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

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH Start
        //画面を設定
		resource.initScreen("SerialReceiveInspectionCancelHT", VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionJanCd/display").itemCd("no").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionCancel/send").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionCancel.jsp", ses);

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

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		//機能単位セッションをクリア
		SerialReceiveInspectionResource.removeSession(this, util, deleteLogic);
		dto.setReceiveSlipNo("");
		dto.setJanProdCd("");
		dto.setProductCd("");
		dto.setProductNm("");
		dto.setUnitNum(0);
		ses.setAttribute("SerialReceiveInspectionDto",dto);

		SerialReceiveInspectionWorkNoResource.load(this, util,centerLogic, clientLogic, warehouseLogic);
	}
}