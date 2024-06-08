package com.oneslogi.ht.wms.resources.system;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 帳票レイアウト画面Resourceクラス
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectReportLayout")
@HandyErrorReturnPath(returnURL = "PrinterSelectReportLayout/display")
public class PrinterSelectReportLayoutResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private UserLogic userLogic;

	// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana Start

	public enum PrinterSelectMode {
		/** ユーザ */
		USER,
		/** 端末 */
		TERMINAL
	}

	/**
	 * 帳票レイアウト画面初期化処理
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception{
		load(this,util,userLogic, PrinterSelectMode.USER);
	}

	/**
	 * 帳票レイアウト画面初期化処理
	 * @throws Exception
	 */
	@GET
	@Path("/loadTerminal")
	public void loadTerminal() throws Exception{
		load(this,util,userLogic, PrinterSelectMode.TERMINAL);
	}

	/**
	 * 帳票レイアウト画面初期化処理
	 *
	 * @param resource   呼び出すResourceクラス
	 * @param util       ハンディ向けモジュールで使用する共通関数群
	 * @param userLogic  ユーザマスタに対するロジッククラス
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util, UserLogic userLogic, PrinterSelectMode mode) throws Exception{

		PrinterSelectResource.createSession(resource, util, userLogic, mode);

		display(resource,util);
	}

	// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana End

	/**
	 * 帳票レイアウト画面表示処理
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this,util);
	}

	/**
	 * 帳票レイアウト画面表示処理
	 *
	 * @param resource     呼び出すResourceクラス
	 * @param util         ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception{

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		//プリンタグループ情報をクリア
		dto.getpUserAutoPrintSettingDto().setPrinterGroupId(null);
		dto.getpUserAutoPrintSettingDto().setPrinterGroupNm(null);

		ses.removeAttribute("GTIN14_SYMBOL");
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start
		//画面を設定
		resource.initScreen("PrinterSelectReportLayoutHT");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("PrinterSelectCancel/load").itemCd("return").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("PrinterSelectReportLayout/send").itemCd("send").build());

		//オプションボタン1を設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("PrinterSelectList/load?backUrl=PrinterSelectReportLayout/display").itemCd("view").build());
		//オプションボタン2を設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("PrinterSelectReportLayoutSelect/load?backUrl=PrinterSelectReportLayout/display").itemCd("reportL").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End

		util.setTransURL(HT_URI_BASE+"/wms/system/PrinterSelectReportLayout.jsp", ses);

	}

	/**
	 * 帳票レイアウト画面の送信処理
	 *
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send()throws Exception{
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");
		if(dto.getpUserAutoPrintSettingDto().getReportLayoutId()==null){
			// 帳票レイアウトを設定していません
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PRINTER_SELECT_REPORT_LAYOUT_NOT_SET);
			return;
		}
		// プリンタグループ画面へ遷移
		PrinterSelectPrinterGroupResource.load(this, util);
	}


}
