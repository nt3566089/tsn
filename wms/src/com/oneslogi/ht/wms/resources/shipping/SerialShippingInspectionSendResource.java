package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.WHtSerialShippingInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionUpdateLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷)(送信確認)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionSend")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionSend/display")
public class SerialShippingInspectionSendResource extends HandyMenuResource {
	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private SerialShippingInspectionSelectLogic selectLogic;
	@Inject
	private SerialShippingInspectionUpdateLogic updateLogic;
	@Inject
	private SerialShippingInspectionCheckLogic checkLogic;

	/**
	 * シリアル登録(出荷)(送信確認)画面初期化を行います。
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
	 * シリアル登録(出荷)(送信確認)画面表示を行います。
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
		resource.initScreen("SerialShippingInspectionSendHT");
		resource.setHeaderColor("Yellow") ;
		//フッタボタン（左）設定
		resource.setFooterLeftButton(
				ButtonInfo.builder()
				.url("SerialShippingInspectionJanCd/display")
				.itemCd("no")
				.type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_RETURN).build()
				);
		//フッタボタン（右）設定
		resource.setFooterRightButton(
				ButtonInfo.builder()
				.url("SerialShippingInspectionSend/send")
				.itemCd("yes")
				.type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_SEND).build()
				);
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//送信確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionSend.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登録(出荷)(完了確認)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("SerialShippingInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = selectLogic.selectList(wHtSerialShippingInsp);
		dto.setInspQty(lstWHtSerialShippingInsp.size());
		if (lstWHtSerialShippingInsp.size() == 0) {
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// 出庫数超過チェック
		checkLogic.checkOrverQuantity(wHtSerialShippingInsp.getCenterId(), wHtSerialShippingInsp.getClientId(), wHtSerialShippingInsp.getPickingWorkNo(), wHtSerialShippingInsp.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 検品数
		setWorkLogQty(dto.getInspQty());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		//シリアルNo.管理(t_serial_no)更新
		updateLogic.updateTSerialNo(wHtSerialShippingInsp);

		//シリアル登録(出荷)ワークテーブルをクリア
		shippingLogic.clearWHtSerialShippingInsp(wHtSerialShippingInsp);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		dto.setwHtSerialShippingInspDto(wHtSerialShippingInspDtoMapper.mappingToDto(wHtSerialShippingInsp));
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//完了確認画面を表示
		displayEndDialog();

	}

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayEndDialog() throws Exception {
		displayOperationEndDialog(
				"SerialShippingInspection",
				"SerialShippingInspectionSend/onEndDialogEnd",
				"SerialShippingInspectionSend/onEndDialogContinue");
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
		SerialShippingInspectionResource.removeSession(this, util, shippingLogic);

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
		setNextViewTemplateForceSetting(VIEW_TEMPLATE_NORMAL);
		//機能単位セッションを再構造
		SerialShippingInspectionResource.removeSession(this, util, shippingLogic);
		//出庫作業No入力画面を表示
		SerialShippingInspectionWorkNoResource.load(this, util);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
