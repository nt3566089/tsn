package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingInsertLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingUpdateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング（送信確認）画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingSend")
@HandyErrorReturnPath(returnURL = "ShippingPickingSend/display")
public class ShippingPickingSendResource extends HandyMenuResource {

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
	private ShippingPickingInsertLogic insertLogic;
	@Inject
	private ShippingPickingUpdateLogic updateLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * パラピッキング（送信確認）画面初期化を行います。
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
	 * パラピッキング（送信確認）画面表示を行います。
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
		resource.initScreen("ShippingPickingSendHT");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder()
				.url("ShippingPickingQty/display").itemCd("no").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder()
				.url("ShippingPickingSend/send").itemCd("yes").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 RYH End

		//送信確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingSend.jsp", ses);
	}

	//【C-CWMS-0041】「出荷検品ワーク」から「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE Start

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(完了確認)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
	@WorkLogEnd("ShippingPickingHT")
	// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End
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

		// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.16 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();
		boolean updatePickingFlg = false;

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//出荷ピッキングワーク登録
			insertLogic.insertWHtShippingPicking(wHtShippingPicking);
			//出庫作業No.でピッキングフラグを更新
			updatePickingFlg = updateLogic.updatePickingFlg(wHtShippingPicking);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//出荷ピッキングワーク登録
			insertLogic.insertWHtShippingPickingByPackingNo(wHtShippingPicking);
			//出荷梱包No.でピッキングフラグを更新
			updatePickingFlg = updateLogic.updatePickingFlgByPackingNo(wHtShippingPicking);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else {
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}
	    // [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.16 NayZaw End

		//出庫フラグの更新
		if (updatePickingFlg) {

			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			// 総数量
			setWorkLogQty(WCC.add(getWorkLogQty(), dto.getQty()));
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

			//出庫作業NO全部出庫済
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingDto", dto);

			//完了確認画面を表示
			displayEndDialog();

			return;
		} else {
			//出庫作業NO一部出庫済
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingDto", dto);

			/* 2015/06/11 INOUE ADD START 色・音の適用 */
			setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);
			/* 2015/06/11 INOUE ADD END */

			//数量入力画面を表示
			ShippingPickingStoreLabelNoResource.load(this, util);
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM Start
			skipWorkLogEnd();
			addWorkLogQty(dto.getQty());
			// [#2946][Ver3.0] WAS連携対応 2018/02/27 PYM End

			return;
		}
	}
	//【C-CWMS-0041】「出荷検品ワーク」から「出荷ピッキングワーク」に変更  2015/09/15 NayZaw UPDATE Start

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		/* 2015/05/19 INOUE UPDATE START フッタ共通化対応 */
		/* 2015/06/11 INOUE UPDATE START 色・音の適用 */
		displayOperationEndDialog(
				"ShippingPicking",
				"ShippingPickingSend/onEndDialogEnd",
				"ShippingPickingSend/onEndDialogContinue"
			);
		/* 2015/06/11 INOUE UPDATE END */
		/* 2015/05/19 INOUE END */
	}

	/**
	 * 完了確認画面終了時にコールされるメソッドです。<br>
	 * 入力チェックを行い、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ShippingPickingResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 完了確認画面継続時にコールされるメソッドです。<br>
	 * 入力チェックを行い、出庫作業No入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//機能単位セッションを再構造
		ShippingPickingResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		ShippingPickingWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}
}
