package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic.PieceCaseCls;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング(終了確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingCancel")
@HandyErrorReturnPath(returnURL = "ShippingPickingCancel/display")
public class ShippingPickingCancelResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ShippingLogic shippingLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * パラピッキング(終了確認)画面初期化を行います。
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
	 * パラピッキング(終了確認)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH Start
		//画面ヘッダ設定
		resource.initScreen("ShippingPickingCancelHT", VIEW_TEMPLATE_CANCEL);

		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder()
				.url("ShippingPickingStoreLabelNo/display").itemCd("no").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder()
				.url("ShippingPickingCancel/send").itemCd("yes").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingCancel.jsp", ses);
	}

	//【C-CWMS-0041】「出荷検品ワーク」から「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE Start

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(出庫作業No入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingDto dto = (ShippingPickingDto) ses.getAttribute("ShippingPickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		// [C-CWMS-0051] 出荷梱包No.でピッキング検品する場合の為追加処理 2015.12.16 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// [2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start
			shippingLogic.clearPickingFlg(wHtShippingPicking, PieceCaseCls.PIECE);
			// [2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			shippingLogic.clearPickingFlgByPackingNo(wHtShippingPicking);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// [C-CWMS-0051] 出荷梱包No.でピッキング検品する場合の為追加処理 2015.12.16 NayZaw End

		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		ses.setAttribute("ShippingPickingDto", dto);

		//機能単位セッションを再構造
		ShippingPickingResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		ShippingPickingWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}
	//【C-CWMS-0041】「出荷検品ワーク」から「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE End
}
