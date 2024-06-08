package com.oneslogi.ht.wms.resources.system;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.PPrinterDtoMapper;
import com.oneslogi.base.dbflute.exentity.PPrinter;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.dto.system.PrinterSelectPrinterSelectDto;
import com.oneslogi.ht.wms.logic.system.PrinterSelectSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;

/**
 * プリンタ選択画面Resourceクラス
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectPrinterSelect")
@HandyErrorReturnPath(returnURL = "PrinterSelectPrinterSelect/display")
public class PrinterSelectPrinterSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private PrinterSelectSelectLogic selectLogic;

	/**
	 * プリンタ選択画面初期化処理
	 * @param backUrl
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception{
		load(this, util, backUrl, autoPrintLogic);

	}

	/**
	 * プリンタ選択画面初期化処理
	 * @param resource     呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @param backUrl     戻る先
	 * @param logic       自動印刷データ登録ロジッククラス
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl, AutoPrintLogic logic) throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		// 選択したプリンタグループに応じてプリンタを取得
		List<PPrinter> list = logic.getPrinterList(dto.getpUserAutoPrintSettingDto().getPrinterGroupId());

		if(list.size() < 1){
			ErrorManager errorManager = resource.getErrorManager();
			errorManager.add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}
		dto.setBackUrl(backUrl);
		PPrinterDtoMapper pPrinterDtoMapper = new PPrinterDtoMapper();
		dto.setLstPPrinterDto(pPrinterDtoMapper.mappingToDtoList(list));

		display(resource,util);
	}

	/**
	 * プリンタ選択画面表示処理
	 *
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);
	}

	/**
	 * プリンタ選択画面表示処理
	 *
	 * @param resource    呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start

		//画面を設定
		resource.initScreen("PrinterSelectPrinterSelectHT");

		// 非表示のボタン設定
		resource.setHideButton(ButtonInfo.builder().url("PrinterSelectPrinterSelect/select").build());

		// 戻るボタン設定
		resource.setReturnButton(ButtonInfo.builder().url("PrinterSelectPrinter/display").itemCd("return").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End

		util.setTransURL(HT_URI_BASE + "/wms/system/PrinterSelectPrinterSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、プリンタ画面に遷移します。
	 * @param bean プリンタ選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam PrinterSelectPrinterSelectDto bean)throws Exception{

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		if(bean.getPrinterId()!=null){
			dto.getpUserAutoPrintSettingDto().setPrinterId(bean.getPrinterId());

			PPrinter pPrinter = new PPrinter();
			pPrinter.setPrinterId(bean.getPrinterId());

			pPrinter = selectLogic.selectPPrinter(pPrinter);

			if(pPrinter != null){
				dto.getpUserAutoPrintSettingDto().setPrinterNm(pPrinter.getPrinterNm());
			}
		}
		ses.setAttribute("PrinterSelectDto", dto);

		PrinterSelectPrinterResource.display(this, util);
	}

}
