package com.oneslogi.ht.wms.resources.system;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.PUserAutoPrintSettingDto;
import com.oneslogi.base.dbflute.dtomapper.PUserAutoPrintSettingDtoMapper;
import com.oneslogi.base.dbflute.exentity.PTerminalAutoPrintSet;
import com.oneslogi.base.dbflute.exentity.PUserAutoPrintSetting;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.resources.system.PrinterSelectReportLayoutResource.PrinterSelectMode;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectSend")
@HandyErrorReturnPath(returnURL = "PrinterSelectSend/display")
public class PrinterSelectSendResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * プリンタ選択(確認)画面初期化処理行う
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load()throws Exception{
		load(this, util);
	}

	/**
	 * プリンタ選択(確認)画面初期化処理行う
	 * @param resource     呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		display(resource, util);

	}

	/**
	 * プリンタ選択(確認)画面表示処理を行う
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);

	}

	/**
	 * プリンタ選択(確認)画面表示処理を行う
	 * @param resource     呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start
		//画面を設定
		resource.initScreen("PrinterSelectSendHT");

		//フッタボタン（左）設定
		resource.setFooterLeftButton(ButtonInfo.builder()
				.url(dto.getBackUrl()).itemCd("no").type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_RETURN).build());

		//フッタボタン（右）設定
		resource.setFooterRightButton(ButtonInfo.builder()
				.url("PrinterSelectSend/send").itemCd("yes").type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_SEND).build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End
		util.setTransURL(HT_URI_BASE+"/wms/system/PrinterSelectSend.jsp", ses);
	}

	@GET
	@Path("/send")
	public void send() throws Exception{
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");
		PUserAutoPrintSettingDto pUserAutoPrintSettingDto = dto.getpUserAutoPrintSettingDto();

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.17 kawana Start

		PUserAutoPrintSettingDtoMapper dtoMapper = new PUserAutoPrintSettingDtoMapper();

		if (dto.mode == PrinterSelectMode.TERMINAL) {
			// 端末別自動印刷設定

			// 全部同じデータ存在チェック
			PTerminalAutoPrintSet pUserAutoPrintSetting = autoPrintLogic.getTerminalAutoPrintSetting(pUserAutoPrintSettingDto.getTerminalAssignCd(),
					pUserAutoPrintSettingDto.getReportLayoutId(), pUserAutoPrintSettingDto.getPrinterGroupId(),
					pUserAutoPrintSettingDto.getPrinterId(), pUserAutoPrintSettingDto.getPrinterAttributeId());

			if (pUserAutoPrintSetting != null) {
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PRINTER_ALREADY_REGISTER_ERROR);
				return;
			}

			// 帳票レイアウトとユーザのみ同じデータ存在チェック
			pUserAutoPrintSetting = autoPrintLogic.getTerminalAutoPrintSetting(pUserAutoPrintSettingDto.getTerminalAssignCd(), pUserAutoPrintSettingDto.getReportLayoutId());
			if (pUserAutoPrintSetting != null) {

				pUserAutoPrintSettingDto.setUserAutoPrintSettingId(pUserAutoPrintSetting.getTerminalAutoPrintSetId());
				pUserAutoPrintSettingDto.setVersionNo(pUserAutoPrintSetting.getVersionNo());

				dto.setpUserAutoPrintSettingDto(pUserAutoPrintSettingDto);
				ses.setAttribute("PrinterSelectDto", dto);
				PrinterSelectUpdateConfirmResource.display(this, util);
				return;
			}

			PTerminalAutoPrintSet autoPrintSettingEntyty = autoPrintLogic.convertToPTerminalAutoPrintSet(dtoMapper.mappingToEntity(pUserAutoPrintSettingDto));
			// すでに登録してない場合、登録
			autoPrintLogic.saveTerminalAutoPrintSetting(autoPrintSettingEntyty);
		} else {
			// ユーザ別自動印刷設定

			// 全部同じデータ存在チェック
			PUserAutoPrintSetting pUserAutoPrintSetting = autoPrintLogic.getUserAutoPrintSetting(pUserAutoPrintSettingDto.getUserId(),
					pUserAutoPrintSettingDto.getReportLayoutId(), pUserAutoPrintSettingDto.getPrinterGroupId(),
					pUserAutoPrintSettingDto.getPrinterId(), pUserAutoPrintSettingDto.getPrinterAttributeId());

			if (pUserAutoPrintSetting != null) {
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PRINTER_ALREADY_REGISTER_ERROR);
				return;
			}

			// 帳票レイアウトとユーザのみ同じデータ存在チェック
			pUserAutoPrintSetting = autoPrintLogic.getUserAutoPrintSetting(pUserAutoPrintSettingDto.getUserId(), pUserAutoPrintSettingDto.getReportLayoutId());
			if (pUserAutoPrintSetting != null) {

				pUserAutoPrintSettingDto.setUserAutoPrintSettingId(pUserAutoPrintSetting.getUserAutoPrintSettingId());
				pUserAutoPrintSettingDto.setVersionNo(pUserAutoPrintSetting.getVersionNo());

				dto.setpUserAutoPrintSettingDto(pUserAutoPrintSettingDto);
				ses.setAttribute("PrinterSelectDto", dto);
				PrinterSelectUpdateConfirmResource.display(this, util);
				return;
			}

			PUserAutoPrintSetting autoPrintSettingEntyty = dtoMapper.mappingToEntity(pUserAutoPrintSettingDto);
			autoPrintLogic.saveUserAutoPrintSetting(autoPrintSettingEntyty);
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
				"PrinterSelectSend/onEndDialogEnd",
				"PrinterSelectSend/onEndDialogContinue"
			);
	}

	/**
	 *
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
