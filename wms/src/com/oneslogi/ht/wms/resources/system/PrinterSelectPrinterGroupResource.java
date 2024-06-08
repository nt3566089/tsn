package com.oneslogi.ht.wms.resources.system;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * プリンタグループ画面Resourceクラス
 *
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectPrinterGroup")
@HandyErrorReturnPath(returnURL = "PrinterSelectPrinterGroup/display")
public class PrinterSelectPrinterGroupResource extends HandyResourceBase {
	@Inject
	private HandyCommonUtil util;

	/**
	 * プリンタグループ画面初期化処理
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception{
		load(this,util);

	}

	/**
	 * プリンタグループ画面初期化処理
	 * @param resource   呼び出すResourceクラス
	 * @param util       ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		display(resource,util);
	}


	/**
	 * プリンタグループ画面表示
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);

	}

	/**
	 * プリンタグループ画面表示処理
	 * @param resource   呼び出すResourceクラス
	 * @param util       ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util)throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		// プリンタ情報をクリア
		dto.getpUserAutoPrintSettingDto().setPrinterId(null);
		dto.getpUserAutoPrintSettingDto().setPrinterNm(null);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start

		//画面を設定
		resource.initScreen("PrinterSelectPrinterGroupHT");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("PrinterSelectReportLayout/display").itemCd("return").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("PrinterSelectPrinterGroup/send").itemCd("send").build());

		//オプションボタン1を設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("PrinterSelectList/load?backUrl=PrinterSelectPrinterGroup/display").itemCd("view").build());

		//オプションボタン2を設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("PrinterSelectPrinterGroupSelect/load?backUrl=PrinterSelectPrinterGroup/display")
				.itemCd("pGroup").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End

		util.setTransURL(HT_URI_BASE+"/wms/system/PrinterSelectPrinterGroup.jsp", ses);
	}

	/**
	 * プリンタグループの送信処理
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception{
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");
		if(dto.getpUserAutoPrintSettingDto().getPrinterGroupId()==null){
			// プリンタグループを設定していません
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PRINTER_SELECT_PRINTER_GROUP_NOT_SET);
			return;
		}
		// プリンタ画面へ遷移
		PrinterSelectPrinterResource.load(this, util);
	}

}
