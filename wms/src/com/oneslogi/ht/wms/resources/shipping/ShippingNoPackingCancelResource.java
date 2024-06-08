package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic.PieceCaseCls;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(終了確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingCancel")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingCancel/display")
public class ShippingNoPackingCancelResource extends HandyResourceBase {

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
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * バラ出荷検品(終了確認)画面初期化を行います。
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
	 * バラ出荷検品(終了確認)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD Start
		//画面ヘッダ設定
        resource.initScreen("ShippingNoPackingCancelHT",VIEW_TEMPLATE_CANCEL);
		// 非表示ボタンを設定
		resource.setHeaderColor("Yellow");
		//フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url("ShippingNoPackingJanCd/display")
				.itemCd("no").type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("ShippingNoPackingCancel/send")
				.itemCd("yes").type(BUTTON_URL_JUMP_WITH_DATA).keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD END
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingCancel.jsp",ses);
	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(出庫作業No入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingDto.getCenterId();
		final String targetNo = wHtShippingDto.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// [2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana Start
			shippingLogic.clearInspectionFlg(wHtShipping, PieceCaseCls.PIECE);
			// [2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.22 kawana End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			shippingLogic.clearInspectionFlgByPackingNo(wHtShipping);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//機能単位セッションを再構造
		ShippingNoPackingResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		ShippingNoPackingWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
