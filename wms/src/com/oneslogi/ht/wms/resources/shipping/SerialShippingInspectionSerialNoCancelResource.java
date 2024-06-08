package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.WHtSerialShippingInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * ｼﾘｱﾙｸﾘｱ確認画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionSerialNoCancel")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionSerialNoCancel/display")
public class SerialShippingInspectionSerialNoCancelResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;

	/**
	 * ｼﾘｱﾙｸﾘｱ確認画面初期化を行います。
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

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");

		ses.setAttribute("SerialShippingInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ｼﾘｱﾙｸﾘｱ確認画面表示を行います。
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
		resource.initScreen("SerialShippingInspectionSerialNoCancelHT",VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow");
		// 非表示ボタンを設定
		resource.setHideButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNoCancel/send").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/display").itemCd("no").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNoCancel/send").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//シリアル入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionSerialNoCancel.jsp", ses);
	}

	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
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

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtDto = dto.getwHtSerialShippingInspDto();

		// ===== ワーク削除(商品CD指定) =====

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtEntity = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtDto);

		shippingLogic.clearWHtSerialShippingInspProduct(wHtEntity);

		// ===== セッション値削除 =====

		wHtDto.setProductCd("");
		wHtDto.setJanCd("");
		wHtDto.setProductNm("");
		dto.setmProduct(null);
		wHtDto.setSerialNo("");
		dto.setStartSerialNo("");
		dto.setSerialNum("");
		dto.setEndSerialNo("");
		dto.setInspQty(0);

		ses.setAttribute("SerialShippingInspectionDto", dto);

		// ===== ｼﾘｱﾙ登出(ｿｰｽCD)画面を表示 =====

		SerialShippingInspectionJanCdResource.load(this, util);
	}
	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
}
