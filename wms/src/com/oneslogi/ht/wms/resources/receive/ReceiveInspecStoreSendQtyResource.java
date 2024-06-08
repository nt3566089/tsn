package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreInsertLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;

/**
 * 検品格納(検品数確認)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreSendQty")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreSendQty/display")
public class ReceiveInspecStoreSendQtyResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspecStoreInsertLogic insertLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveInspecStoreSelectLogic selectLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 Start
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private ReportLogic reportLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 End
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	@Inject
	private StoreLabelPrintLogic storeLabelPrintLogic;
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要変数 numberingCenterLogic, customerLogic, tStoreRecordHBhv を削除) 2018.04.27 honma/kawana Delete
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End


	/**
	 * 入荷検品格納(検品数確認)画面初期化を行います。
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
	 * 入荷検品格納(検品数確認)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreSendQtyHT",VIEW_TEMPLATE_WARN);
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreSend/display").itemCd("no").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreSendQty/send").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreSendQty.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 入力チェックを行い、数量入力画面へ遷移する。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana Start
	@WorkLogMergeEnd("ReceiveInspecStoreHT")
	// [#4025][Ver3.0] WAS連携対応 2018.03.13 kawana End
	public void send() throws Exception {

		setNextViewTemplateForceSetting(VIEW_TEMPLATE_COMPLETE);

		// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 Start
		//検品データを登録する
		ReceiveInspecStoreResource.register(this, util, userLogic, selectLogic, insertLogic, autoPrintLogic, reportLogic, storeLabelPrintLogic, productLabelLogic);
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016.06.17 End
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End
		// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

		// 結果判定
		if (getErrorManager().size() > 0) {
			clearNextViewTemplateForceSetting();

			// 処理中止
			return;
		}
	}
}
