package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionDeleteLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckReceiveLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷)の再開Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspection")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspection/reopenProcess")
public class SerialReceiveInspectionResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private SerialNoCheckReceiveLogic checkLogic;
	@Inject
	private SerialReceiveInspectionDeleteLogic deleteLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登入(伝票No)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String reopenKey) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		SerialReceiveInspectionResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		String[] key1 = reopenKey.split(",");

		if (key1.length > 0) {
			dto.setReceiveSlipNo(key1[0]);
		}
		if (key1.length > 1) {
			dto.setSupplierCd(key1[1]);
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

			//機能単位セッションを再構造
			SerialReceiveInspectionResource.removeSession(this, util, deleteLogic);

			ErrorManager errorManager = this.getErrorManager();
			this.sendErrorScreen(util.getMessage(errorManager), "", "SerialReceiveInspectionWorkNo/load");
			errorManager.clear();
			return;
		}

		dto.setSupplierCd(headerSerialNo.getSupplierCd());
		dto.setSupplierNm(headerSerialNo.getSupplierNm());

		// ===== セッションデータの設定と画面遷移 =====

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//シリアル登入(ｿｰｽCD)画面を表示
		SerialReceiveInspectionJanCdResource.display(this, util);
	}

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//パラピッキング情報の初期化
		SerialReceiveInspectionDto dto = new SerialReceiveInspectionDto();

		dto.setCenterId(loginInfo.getCenterId());
		dto.setClientId(loginInfo.getClientId());

		//MACアドレスの初期化
		dto.setMacAddress(util.getMacAddress(ses));
		ses.setAttribute("SerialReceiveInspectionDto", dto);
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
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, SerialReceiveInspectionDeleteLogic deleteLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		WHtSerialReceiveInsp wHtSerialReceiveInsp = new WHtSerialReceiveInsp();
		//		wHtSerialReceiveInsp.setReceiveSlipNo(dto.getReceiveSlipNo());
		wHtSerialReceiveInsp.setMacAddress(dto.getMacAddress());

		//シリアル登録(入荷)ワークテーブルをクリア
		deleteLogic.clearWHtSerialReceiveInspection(wHtSerialReceiveInsp);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("SerialReceiveInspectionDto");
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ses.removeAttribute("SerialReceiveInspectionDto");
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End