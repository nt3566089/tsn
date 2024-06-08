package com.oneslogi.ht.wms.resources.system;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.PUserAutoPrintSettingDtoMapper;
import com.oneslogi.base.dbflute.exentity.PUserAutoPrintSetting;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * プリンタ選択の更新確認画面Resourceクラス
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectUpdateConfirm")
@HandyErrorReturnPath(returnURL = "PrinterSelectUpdateConfirm/display")
public class PrinterSelectUpdateConfirmResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private AutoPrintLogic logic;
	@Inject
	private UserLogic userLogic;


	/**
	 * 更新確認画面の初期化を行う
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception{
		load(this,util);
	}

	/**
	 * 更新確認画面の初期化を行う
	 * @param resource
	 * @param util
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util)throws Exception{
		display(resource,util);
	}

	/**
	 * 更新確認画面表示処理
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display()throws Exception{
		display(this,util);
	}

	/**
	 * 更新確認画面表示処理
	 * @param resource
	 * @param util
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util)throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();


		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start
		//画面を設定
		resource.initScreen("PrinterSelectUpdateConfirmHT", VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow");
		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder()
				.url("PrinterSelectSend/display").itemCd("no").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_RETURN).build());
		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder()
				.url("PrinterSelectUpdateConfirm/send").itemCd("yes").type(BUTTON_URL_JUMP_WITH_DATA)
				.keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End
		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/system/PrinterSelectUpdateConfirm.jsp",ses);
	}

	/**
	 * 更新確認画面送信処理
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send()throws Exception{
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto)ses.getAttribute("PrinterSelectDto");
		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana Start
		PUserAutoPrintSetting autoPrintSettingEntyty = new PUserAutoPrintSettingDtoMapper().mappingToEntity(dto.getpUserAutoPrintSettingDto());

		switch (dto.mode) {
		case USER:
			logic.saveUserAutoPrintSetting(autoPrintSettingEntyty);
			break;
		case TERMINAL:
			logic.saveTerminalAutoPrintSetting(logic.convertToPTerminalAutoPrintSet(autoPrintSettingEntyty));
			break;
		}

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana End

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
				"PrinterSelect",
				"PrinterSelectUpdateConfirm/onEndDialogEnd",
				"PrinterSelectUpdateConfirm/onEndDialogContinue"
			);
	}

	/**
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana Start
		PrinterSelectResource.removeSession(this, util);
		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana End

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start
		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SYSTEM);
		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End

	}

	/**
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana Start
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		PrinterSelectDto dto = (PrinterSelectDto)ses.getAttribute("PrinterSelectDto");

		PrinterSelectResource.removeSession(this, util);

		//帳票レイアウト画面に遷移
		PrinterSelectReportLayoutResource.load(this, util, userLogic, dto.mode);
		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana End
	}
}
