package com.oneslogi.ht.wms.resources.system;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.PPrinterAttributeDtoMapper;
import com.oneslogi.base.dbflute.exentity.PPrinterAttribute;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;

/**
 * プリンタ画面Resourceクラス
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectPrinter")
@HandyErrorReturnPath(returnURL = "PrinterSelectPrinter/display")
public class PrinterSelectPrinterResource extends HandyResourceBase {
	@Inject
	private HandyCommonUtil util;
	@Inject
	private AutoPrintLogic autoPrintLogic;

	/**
	 * プリンタ画面初期化処理
	 * @throws Exception
	 */

	@GET
	@Path("/load")
	public void load() throws Exception{
		load(this,util);
	}

	/**
	 * プリンタ画面初期化処理
	 * @param resource   呼び出すResourceクラス
	 * @param util       ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		display(resource,util);
	}

	/**
	 * プリンタ画面表示処理
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);

	}

	/**
	 * プリンタ画面表示処理
	 * @param resource   呼び出すResourceクラス
	 * @param util       ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util){
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		// トレイ情報をクリア
		dto.getpUserAutoPrintSettingDto().setPrinterAttributeId(null);
		dto.getpUserAutoPrintSettingDto().setTrayNm(null);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start

		//画面を設定
		resource.initScreen("PrinterSelectPrinterHT");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("PrinterSelectPrinterGroup/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("PrinterSelectPrinter/send").itemCd("send").build());

		//オプションボタン1を設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("PrinterSelectList/load?backUrl=PrinterSelectPrinter/display").itemCd("view").build());

		//オプションボタン2を設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("PrinterSelectPrinterSelect/load?backUrl=PrinterSelectPrinter/display").itemCd("printerHalf").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start

		util.setTransURL(HT_URI_BASE+"/wms/system/PrinterSelectPrinter.jsp", ses);

	}

	/**
	 * プリンタの送信処理
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception{
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");
		if(dto.getpUserAutoPrintSettingDto().getPrinterId()==null){
			// プリンタグループを設定していません
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PRINTER_SELECT_PRINTER_NOT_SET);
			return;
		}

		// 選択したプリンタに応じてトレイを取得する
		List<PPrinterAttribute> lstPPrinterAttribute = autoPrintLogic.getPrinterAttributeList(dto.getpUserAutoPrintSettingDto().getPrinterId());

		//選択したプリンタに応じてトレイが無い場合、エラー
		if(lstPPrinterAttribute.size() == 0){
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}
		else if(lstPPrinterAttribute.size() > 1){
			// 選択したプリンタに応じてトレイがふくすうある場合、トレイ画面へ遷移する
			PPrinterAttributeDtoMapper dtoMapper = new PPrinterAttributeDtoMapper();
			dto.setLstPPrinterAttributeDto(dtoMapper.mappingToDtoList(lstPPrinterAttribute));

			PrinterSelectTrayResource.load(this, util);
		}else{
			// 選択したプリンタに応じてトレイが1個のみある場合、確認画面へ遷移する
			dto.getpUserAutoPrintSettingDto().setPrinterAttributeId(lstPPrinterAttribute.get(0).getPrinterAttributeId());
			dto.getpUserAutoPrintSettingDto().setTrayNm(lstPPrinterAttribute.get(0).getTrayNm());

			PrinterSelectSendResource.load(this,util);
		}
		return;
	}
}
