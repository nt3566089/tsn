package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusUpdateLogic;

/**
 * 完了確認(伝票No単位)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionWorkNo")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionWorkNo/display")
public class ReceiveNoPlanInspectionWorkNoResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveNoPlanInspectionDeleteLogic deleteLogic;
	// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana Start
	@Inject
	private ReceiveStatusUpdateLogic statusUpdateLogic;
	// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana End
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;

	/**
	 * 完了確認(伝票No単位)画面初期化を行います。
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
	 * 完了確認(伝票No単位)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionWorkNoHT",VIEW_TEMPLATE_WARN);
		resource.setHeaderColor("Yellow");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionJan/display").itemCd("no").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionWorkNo/yes").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionWorkNo.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 検品完了画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/yes")
	public void yes() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		WHtReceiveNoPlanInsp wHtReceiveNoPlan = new WHtReceiveNoPlanInsp();
		wHtReceiveNoPlan.setHtWorkNo(dto.getTReceivePlanHDto().getReceiveSlipNo());
		wHtReceiveNoPlan.setMacAddress(dto.getMacAddress());

		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanHDto());

		// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana Start

		// 入荷ステータスを入荷済に更新
		statusUpdateLogic.recceivedUpdateOnlyHeader(tReceivePlanH.getReceivePlanHId(), new ErrorStatus());

		// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana End

		//入荷検品ワークテーブルをクリア
		deleteLogic.clearWHtReceiveNoPlanInsption(wHtReceiveNoPlan);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// ===== 完了画面を表示 =====

		String dialogScreenCd = "ReceiveNoPlanInspectionEndHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_OPERATION_END);

		// 終了ボタン設定
		setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionWorkNo/onEndDialogEnd").itemCd("end").type(BUTTON_URL_JUMP_NO_DATA).build());
		// 継続ボタン設定
		setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionWorkNo/onEndDialogContinue").itemCd("continue").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * 検品完了画面終了時にコールされるメソッドです。<br>
	 * セッションをクリア、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ReceiveNoPlanInspectionResource.removeSession(this, util, deleteLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 検品完了画面継続時にコールされるメソッドです。<br>
	 * 予定無し入荷(区分)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//予定無し入荷(区分)画面を表示
		ReceiveNoPlanInspectionKbnResource.load(this, util, customerLogic, stockTypeLogic, userLogic, selectLogic);

	}
}
