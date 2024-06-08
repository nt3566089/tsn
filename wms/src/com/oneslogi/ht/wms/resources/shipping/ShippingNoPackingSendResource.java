package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingInsertLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(送信確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingSend")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingSend/display")
public class ShippingNoPackingSendResource extends HandyMenuResource {

	// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw add Start
	protected static class StatusCode {
		/**
		 * 荷札の自動印刷エラー
		 */
		protected static final int AUTO_PRINT_ERROR = 3;
	}
	// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw add End

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
	private ShippingNoPackingInsertLogic insertLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * バラ出荷検品(送信確認)画面初期化を行います。
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
	 * バラ出荷検品(送信確認)画面表示を行います。
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

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");

		//画面ヘッダ設定
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD Start
		resource.initScreen("ShippingNoPackingSendHT");
		//フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder().url(dto.getBackUrl())
				.itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder().url("ShippingNoPackingSend/send")
				.itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD END
		//送信確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingSend.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(完了確認)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("ShippingNoPackingHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
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

		// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw mod Start
		//梱包情報登録
		insertLogic.insertPacking(wHtShipping, errRetSts(StatusCode.AUTO_PRINT_ERROR));
		// [2.1.0-CT-057]対応修正 2016.11.28 nayzaw mod End

		//出荷検品ワークテーブルをクリア
		shippingLogic.clearWHtShipping(wHtShipping);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Add Start
		// 出庫指示時と検品梱包数差異ありの場合、警告メッセージ表示(荷札再出力)
		if (getWarnManager().size() > 0) {
			int statusCd = getWarnManager().get().get(1).getStatusCd();
			if (statusCd == new ErrorStatus().getStatusCd()) {
				// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Mod Start
				sendWarnScreenWithButtons(util.getMessage(WmsMessageConst.SHIPPING_INSPECTION_COMPLETE_TAG_LABEL_REISSUE_INFORMATION), "", "ShippingNoPackingSend/onEndDialogEnd", "ShippingNoPackingSend/onEndDialogContinue");
				// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Mod End
				getWarnManager().clear();
				return;
			}
		}
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Add End

		// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
		if(getErrorManager().size() > 0){
			int statusCd = getErrorManager().get().get(1).getStatusCd();
			if(statusCd == StatusCode.AUTO_PRINT_ERROR){
				// // [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #525]件対応 エラーメッセージ変更 2016.12.27 nayzaw
				// 荷札自動印刷時エラーの場合、エラー画面を表示した後、成功した時と同じ画面へ遷移
				// 荷札出力エラー。PCで出力し直して下さい。検品は終了しています。
				sendErrorScreenWithButtons(util.getMessage(WmsMessageConst.HANDY_TAG_OUTPUT_ERROR), "", "ShippingNoPackingSend/onEndDialogEnd", "ShippingNoPackingSend/onEndDialogContinue");
				getErrorManager().clear();
				return;
			}
		}
		// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
		//完了確認画面を表示
		displayEndDialog();

	}

	// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
	/**
	 * 終了時、エラー画面表示後行う処理
	 * @throws Exception
	 */
	@GET
	@Path("/finishErrorConfirm")
	public void finishErrorConfirm() throws Exception{

		setNextViewTemplateForceSetting(VIEW_TEMPLATE_OPERATION_END);
		//完了確認画面を表示
		displayEndDialog();
	}
	// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		/* 2015/05/19 INOUE UPDATE START フッタ共通化対応 */
		/* 2015/06/12 INOUE ADD START 色・音の適用 */
		displayOperationEndDialog(
				"ShippingNoPacking",
				"ShippingNoPackingSend/onEndDialogEnd",
				"ShippingNoPackingSend/onEndDialogContinue"
			);
		/* 2015/06/12 INOUE ADD END */
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
		ShippingNoPackingResource.removeSession(this, util, shippingLogic);

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
		// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add Start
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_NORMAL);
		// [2.1.0-CT-057]対応修正 2016.11.25 nayzaw add End
		//機能単位セッションを再構造
		ShippingNoPackingResource.removeSession(this, util, shippingLogic);

		//出庫作業No入力画面を表示
		ShippingNoPackingWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);

	}

}
