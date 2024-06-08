package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ケースピッキング(終了確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingCasePickingCancel")
@HandyErrorReturnPath(returnURL = "ShippingCasePickingCancel/display")
public class ShippingCasePickingCancelResource extends HandyResourceBase {

	/* 共通関数群ユティリティクラス */
	@Inject
	private HandyCommonUtil util;
	/* センタマスタに対するロジッククラス */
	@Inject
	private CenterLogic centerLogic;
	/* 荷主マスタに対するロジッククラス */
	@Inject
	private ClientLogic clientLogic;
	/* 倉庫マスタチェック処理ロジッククラス */
	@Inject
	private WarehouseLogic warehouseLogic;
	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;

	/**
	 * ケースピッキング(終了確認)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();
		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		dto.setBackUrl(backUrl);

		ses.setAttribute("ShippingCasePickingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ケースピッキング(終了確認)画面表示を行います。
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

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 Start

		// 画面初期設定
		resource.initScreen("ShippingCasePickingCancelHT",VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow");

		// フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url(dto.getBackUrl())
				.itemCd("no")
				.type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_RETURN).build());
		// フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("ShippingCasePickingCancel/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_SEND).build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingCasePickingCancel.jsp", ses);
	}


	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキング(ケースピッキングNo入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		// ケースピッキングNo.のデータ存在チェック
		if (!ShippingCasePickingResource.checkExistCasePickingNo(this, util, shippingLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Mod Start
		// 出庫フラグ、検品フラグをクリア
		shippingLogic.clearPickingFlgAndInspectionFlgByCasePickingNo(wHtShippingPicking, dto.getCasePickingNo());
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Mod End
		// [#260][2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingCasePickingDto", dto);

		//機能単位セッションを再構造
		ShippingCasePickingResource.removeSession(this, util, shippingLogic);

		//ケースピッキングNo入力画面を表示
		ShippingCasePickingNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
