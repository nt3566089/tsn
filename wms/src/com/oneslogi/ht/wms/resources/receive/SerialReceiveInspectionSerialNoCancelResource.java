package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionDeleteLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登入(ｸﾘｱ)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionSerialNoCancel")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionSerialNoCancel/display")
public class SerialReceiveInspectionSerialNoCancelResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialReceiveInspectionDeleteLogic deleteLogic;

	/**
	 * シリアル登入(ｸﾘｱ)画面初期化を行います。
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

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * シリアル登入(ｸﾘｱ)画面表示を行います。
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
		resource.initScreen("SerialReceiveInspectionSerialNoCancelHT", VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SerialReceiveInspectionSerialNoCancel/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionSerialNoCancel/back").itemCd("no").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionSerialNoCancel/send").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//シリアル登入(ｿｰｽCD)入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionSerialNoCancel.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionSerialNoResource.load(this, util);

	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登入(ｿｰｽCD)画面に遷移します。
	 * @param bean シリアル登入(ｿｰｽCD)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		// ===== ワーク削除(商品CD指定) =====

		WHtSerialReceiveInsp wHtSerialReceiveInsp = new WHtSerialReceiveInsp();
		wHtSerialReceiveInsp.setMacAddress(dto.getMacAddress());
		wHtSerialReceiveInsp.setProductCd(dto.getProductCd());

		deleteLogic.clearWHtSerialReceiveInspectionProduct(wHtSerialReceiveInsp);

		// ===== セッション値削除 =====

		dto.setJanProdCd("");
		dto.setProductCd("");
		dto.setProductNm("");
		dto.setUnitNum(0);
		dto.setSerialNo("");
		dto.setStartSerialNo("");
		dto.setSerialNum("");
		dto.setEndSerialNo("");
		ses.setAttribute("SerialReceiveInspectionDto", dto);

		// ===== シリアル登入(ｿｰｽCD)画面を表示 =====

		SerialReceiveInspectionJanCdResource.display(this, util);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
