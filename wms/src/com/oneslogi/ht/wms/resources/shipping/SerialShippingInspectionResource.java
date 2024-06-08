package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.WHtSerialShippingInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckShippingLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷)再開Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspection")
@HandyErrorReturnPath(returnURL = "SerialShippingInspection/reopenProcess")
public class SerialShippingInspectionResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialNoCheckShippingLogic checkLogic;
	@Inject
	private ShippingCommonLogic commonLogic;
	@Inject
	private ShippingLogic shippingLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登出(ソースCD)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String reopenKey) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		SerialShippingInspectionResource.createSession(this, util);

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		//出庫作業No.の初期化
		String[] keys = reopenKey.split(",");
		if (keys.length > 0) {
			wHtSerialShippingInspDto.setPickingWorkNo(keys[0]);
		}
		if (keys.length > 1) {
			dto.setSupplierCustomerCd(keys[1]);
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

			//機能単位セッションを再構造
			SerialShippingInspectionResource.removeSession(this, util, shippingLogic);

			ErrorManager errorManager = this.getErrorManager();
			this.sendErrorScreen(util.getMessage(errorManager), "", "SerialShippingInspectionWorkNo/load");
			errorManager.clear();
			return;
		}

		wHtSerialShippingInspDto.setCustomerId(headerSerialNo.getSupplyCustomerId());
		dto.setSupplierCustomerCd(headerSerialNo.getSupplyCustomerCd());
		dto.setSupplierCustomerNm(headerSerialNo.getSupplyCustomerNm());

		if (!CU.isNullOrEmpty(pickingWorkNo)) {

			// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除 2018.12.14 kawana Delete
			dto.setIsPackingNo(commonLogic.isShippingPackingNo(centerId, pickingWorkNo));
		}

		// ===== 画面遷移 =====

		ses.setAttribute("SerialShippingInspectionDto", dto);

		//ソースCD入力画面を表示
		SerialShippingInspectionJanCdResource.load(this, util);
	}

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//シリアル登録(出荷)情報の初期化
		SerialShippingInspectionDto dto = new SerialShippingInspectionDto();

		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		//センター情報の初期化
		wHtSerialShippingInspDto.setCenterId(loginInfo.getCenterId());
		wHtSerialShippingInspDto.setClientId(loginInfo.getClientId());

		//MACアドレスの初期化
		wHtSerialShippingInspDto.setMacAddress(util.getMacAddress(ses));

		ses.setAttribute("SerialShippingInspectionDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic  業務ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ShippingLogic shippingLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		//シリアル登録(出荷)ワークテーブルをクリア
		shippingLogic.clearWHtSerialShippingInsp(wHtSerialShippingInsp);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("SerialShippingInspectionDto");
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
