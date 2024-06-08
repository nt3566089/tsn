package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionWorkNoDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionSelectSupplierCdLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckReceiveLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登入(伝票No)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionWorkNo")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionWorkNo/display")
public class SerialReceiveInspectionWorkNoResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialNoCheckReceiveLogic checkLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private SerialReceiveInspectionSelectSupplierCdLogic selectSupplierCdLogic;
	@Inject
	private SerialReceiveInspectionSelectLogic serialReceiveInspectionSelectLogic;

	/**
	 * シリアル登入(伝票No)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {

		//機能単位セッションを処理化
		SerialReceiveInspectionResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * シリアル登入(伝票No)画面表示を行います。
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
		resource.initScreen("SerialReceiveInspectionWorkNoHT");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SerialReceiveInspectionWorkNo/send").build());

		// [#5935][v3.1]仕入先ボタン表示不正を修正(ボタン配置をjspに記述) 2019.01.23 kawana Delete

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionWorkNo/back").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionWorkNo/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//シリアル登入(ｿｰｽCD)入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionWorkNo.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		//機能単位セッションをクリア
		SerialReceiveInspectionResource.removeSession(this);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登入(ｿｰｽCD)画面に遷移します。
	 * @param bean シリアル登入(伝票No)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("SerialReceiveInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam SerialReceiveInspectionWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		dto.setReceiveSlipNo(bean.getReceiveSlipNo());
		dto.setSupplierCd(bean.getSupplierCd());

		if (bean.isValidateErr()) {
			return;
		}

		final long centerId = dto.getCenterId();
		final long clientId = dto.getClientId();
		final String receiveSlipNo = dto.getReceiveSlipNo();
		final String supplierCd = dto.getSupplierCd();

		// ===== 入荷情報のチェックと値設定 =====

		TSerialNo headerSerialNo = new TSerialNo();
		headerSerialNo.setCenterId(centerId);
		headerSerialNo.setClientId(clientId);
		headerSerialNo.setReceiveSlipNo(receiveSlipNo);
		headerSerialNo.setSupplierCd(supplierCd);

		checkLogic.checkAndSetHeader(headerSerialNo, new ErrorStatus());
		if (0 < this.getErrorManager().size()) {

			return;
		}

		dto.setSupplierCd(headerSerialNo.getSupplierCd());
		dto.setSupplierNm(headerSerialNo.getSupplierNm());

		// ===== セッションデータの設定と画面遷移 =====

		// 全体のシリアル登録数を設定
		int count = serialReceiveInspectionSelectLogic.selectWHtSerialReceiveInspectionCount(dto);
		dto.setUnitNum(count);

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.getReceiveSlipNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//通信制御データ作成
		String reopenKey = bean.getReceiveSlipNo();
		reopenKey = reopenKey + "," + bean.getSupplierCd();
		util.setHtComCtl(ses, "SerialReceiveInspection", reopenKey);
		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionJanCdResource.load(this, util);
	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/selectSupplier")
	public void selectSupplier(@BeanParam SerialReceiveInspectionWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setReceiveSlipNo(bean.getReceiveSlipNo());
		dto.setSupplierCd(bean.getSupplierCd());
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionSelectSupplierCdResource.load(this, util, selectSupplierCdLogic, "SerialReceiveInspectionWorkNo/display");
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
