package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionInsertLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionUpdateLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 入荷検品確認画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionSend")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionSend/display")
public class SerialReceiveInspectionSendResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private SerialReceiveInspectionSelectLogic serialReceiveInspectionSelectLogic;
	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private MProductBhv mproductBhv;
	@Inject
	private SerialReceiveInspectionInsertLogic serialReceiveInspectionInsertLogic;
	@Inject
	private SerialReceiveInspectionUpdateLogic serialReceiveInspectionupdateLogic;
	@Inject
	private SerialReceiveInspectionDeleteLogic deleteLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private SerialReceiveInspectionCheckLogic checkLogic;

	/**
	 * 入荷検品確認画面初期化を行います。
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
	 * 入荷検品確認画面表示を行います。
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
		resource.initScreen("SerialReceiveInspectionSendHT",VIEW_TEMPLATE_NORMAL);
		resource.setHeaderColor("Yellow");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionSend/back").itemCd("no").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionSend/yes").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionSend.jsp", ses);

	}

	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionJanCdResource.load(this, util);

	}
	// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング画面に遷移します。
	 */
	@GET
	@Path("/yes")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogEnd("SerialReceiveInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void yes() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		// HT入荷検品ワークデータ取得
		List<WHtSerialReceiveInsp> list = serialReceiveInspectionSelectLogic.selectWHtSerialReceiveInspection(dto);
		if (list.size() == 0) {
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// ===== 入荷数超過チェック =====

		checkLogic.checkOrverQuantity(dto.getCenterId(), dto.getClientId(), dto.getReceiveSlipNo(), dto.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 検品数
		setWorkLogQty(dto.getUnitNum());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// シリアルNo情報の取得
		for (WHtSerialReceiveInsp wHtSerialReceiveInsp : list) {

			TSerialNoCB serialNoCB = tSerialNoBhv.newMyConditionBean();
			serialNoCB.checkInvalidQuery();
			serialNoCB.query().setCenterId_Equal(wHtSerialReceiveInsp.getCenterId());
			serialNoCB.query().setClientId_Equal(wHtSerialReceiveInsp.getClientId());
			serialNoCB.query().setSerialNo_Equal(wHtSerialReceiveInsp.getSerialNo());
			serialNoCB.query().queryMProduct().setProductCd_Equal(wHtSerialReceiveInsp.getProductCd());

			TSerialNo serialNo = tSerialNoBhv.selectEntity(serialNoCB);

			//システム管理日付取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(wHtSerialReceiveInsp.getClientId());
			mClientCenter.setCenterId(wHtSerialReceiveInsp.getCenterId());
			mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
			if (serialNo != null) {
				// 更新

				String serialNoSlipNo = serialNo.getReceiveSlipNo();
				String wHtSlipNo = CU.nullToStr(wHtSerialReceiveInsp.getReceiveSlipNo());
				if (!CU.isNullOrEmpty(serialNoSlipNo)) {
					// 伝票No.登録済

					if (!serialNoSlipNo.equals(wHtSlipNo)) {
						// 伝票No.相違エラー

						getErrorManager().add(new ErrorStatus(), WmsMessageConst.SERIAL_NO_ALREADY_REGISTERED_ERROR, serialNo.getSerialNo(), serialNoSlipNo);
						return;
					}
				}

				// 更新実行
				serialReceiveInspectionupdateLogic.update(serialNo, wHtSerialReceiveInsp, mClientCenter);
			} else {
				// 新規

				MProductCB productCB = mproductBhv.newMyConditionBean();
				productCB.checkInvalidQuery();
				productCB.query().setClientId_Equal(wHtSerialReceiveInsp.getClientId());
				productCB.query().setProductCd_Equal(wHtSerialReceiveInsp.getProductCd());
				MProduct mProduct = mproductBhv.selectEntity(productCB);
				if (mProduct == null) {
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
					return;
				}

				// 登録実行
				serialReceiveInspectionInsertLogic.insert(wHtSerialReceiveInsp, mProduct, mClientCenter);
			}
		}
		//機能単位セッションをクリア
		SerialReceiveInspectionResource.removeSession(this, util, deleteLogic);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// ===== 検品完了画面を表示 =====

		String dialogScreenCd = "SerialReceiveInspectionEndHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_OPERATION_END);

		// 終了ボタン設定
		setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionSend/onEndDialogEnd").itemCd("end").type(BUTTON_URL_JUMP_NO_DATA).build());
		// 継続ボタン設定
		setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionSend/onEndDialogContinue").itemCd("continue").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/*
	 * 検品完了画面終了時にコールされるメソッドです。<br>
	 * セッションをクリア、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 検品完了画面継続時にコールされるメソッドです。<br>
	 * 伝票No入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//伝票No入力画面を表示
		SerialReceiveInspectionWorkNoResource.load(this, util, centerLogic, clientLogic, warehouseLogic);
	}
}
