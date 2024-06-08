package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionWorkNoDto;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckShippingLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(No)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionWorkNo")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionWorkNo/display")
public class SerialShippingInspectionWorkNoResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private SerialShippingInspectionSelectLogic selectLogic;
	@Inject
	private ShippingCommonLogic commonLogic;
	@Inject
	private SerialNoCheckShippingLogic checkLogic;

	/**
	 *  シリアル登出(No)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		//機能単位セッションを処理化
		SerialShippingInspectionResource.createSession(resource, util);

		//自画面表示
		display(resource, util);
	}

	/**
	 *  シリアル登出(No)画面表示を行います。
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
		resource.initScreen("SerialShippingInspectionWorkNoHT");

		//非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SerialShippingInspectionWorkNo/send").build());

		// [#5935][v3.1]納品先ボタン表示不正を修正(ボタン配置をjspに記述) 2019.01.23 kawana Delete

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialShippingInspectionWorkNo/back").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("SerialShippingInspectionWorkNo/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//出庫作業No入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionWorkNo.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// 機能単位セッションをクリア
		SerialShippingInspectionResource.removeSession(this, util, shippingLogic);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登出(ｿｰｽCD)画面に遷移します。
	 * @param bean シリアル登出(No)画面の情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("SerialShippingInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam SerialShippingInspectionWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");

		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();
		wHtSerialShippingInspDto.setPickingWorkNo(bean.getPickingWorkNo());
		dto.setSupplierCustomerCd(bean.getSupplierCustomerCd());

		//入力チェック
		if (bean.isValidateErr()) {
			return;
		}

		final long centerId = wHtSerialShippingInspDto.getCenterId();
		final long clientId = wHtSerialShippingInspDto.getClientId();
		final String pickingWorkNo = wHtSerialShippingInspDto.getPickingWorkNo();
		final String supplyCustomerCd = dto.getSupplierCustomerCd();

		// ===== 出荷情報のチェックと値設定 =====

		TSerialNo headerSerialNo = new TSerialNo();
		headerSerialNo.setCenterId(centerId);
		headerSerialNo.setClientId(clientId);
		headerSerialNo.setPickingWorkNo(pickingWorkNo);
		headerSerialNo.setSupplyCustomerCd(supplyCustomerCd);

		checkLogic.checkAndSetHeader(headerSerialNo, new ErrorStatus());
		if (0 < this.getErrorManager().size()) {

			return;
		}

		wHtSerialShippingInspDto.setCustomerId(headerSerialNo.getSupplyCustomerId());
		dto.setSupplierCustomerCd(headerSerialNo.getSupplyCustomerCd());
		dto.setSupplierCustomerNm(headerSerialNo.getSupplyCustomerNm());

		if (!CU.isNullOrEmpty(pickingWorkNo)) {

			// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除 2018.12.14 kawana Delete
			dto.setIsPackingNo(commonLogic.isShippingPackingNo(centerId, pickingWorkNo));
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.getPickingWorkNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// ===== 通信制御データ作成 =====

		String reopenKey = bean.getPickingWorkNo();
		reopenKey += "," + bean.getSupplierCustomerCd();
		util.setHtComCtl(ses, "SerialShippingInspection", reopenKey);

		ses.setAttribute("SerialShippingInspectionDto", dto);

		// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除 2018.12.14 kawana Start

		//JAN入力画面を表示
		SerialShippingInspectionJanCdResource.load(this, util);

		// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除 2018.12.14 kawana End
	}

	// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除(メソッドdoConfirm, displayConfirmDialog, onConfirmOk削除) 2018.12.14 kawana Delete

	/**
	 * 納品先押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、納品先選択入力画面に遷移します。
	 * @param bean シリアル登出(No)画面の情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/supplier")
	public void supplier(@BeanParam SerialShippingInspectionWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");

		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();
		wHtSerialShippingInspDto.setPickingWorkNo(bean.getPickingWorkNo());
		dto.setSupplierCustomerCd(bean.getSupplierCustomerCd());

		ses.setAttribute("SerialShippingInspectionDto", dto);

		//納品先入力画面を表示
		SerialShippingInspectionSupplierSelectResource.load(this, util, "SerialShippingInspectionWorkNo/display", selectLogic);

	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
