package com.oneslogi.ht.wms.resources.system;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.PUserAutoPrintSettingDtoMapper;
import com.oneslogi.base.dbflute.exentity.PTerminalAutoPrintSet;
import com.oneslogi.base.dbflute.exentity.PUserAutoPrintSetting;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.wms.WmsMessageConst;

/**
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectList")
@HandyErrorReturnPath(returnURL = "PrinterSelectList/display")
public class PrinterSelectListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private AutoPrintLogic autoPrintLogic;

	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception{
		load(this, util, backUrl, autoPrintLogic);

	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,  AutoPrintLogic logic)throws Exception{

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto)ses.getAttribute("PrinterSelectDto");

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana Start
		List<PUserAutoPrintSetting> lstPUserAutoPrintSetting = null;
		switch (dto.mode) {
		case USER:
			lstPUserAutoPrintSetting = logic.getUserAutoPrintSettings();
			break;
		case TERMINAL:
			List<PTerminalAutoPrintSet> terminalList = logic.getTerminalAutoPrintSettings();
			lstPUserAutoPrintSetting = logic.convertToPUserAutoPrintSetting(terminalList);
			break;
		}
		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana End

		if(lstPUserAutoPrintSetting.size() == 0){
			ErrorManager errorManager = resource.getErrorManager();
			errorManager.add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		lstPUserAutoPrintSetting.get(0).getPPrinterGroupByPrinterGroupId().getPrinterGroupNm();
		PUserAutoPrintSettingDtoMapper dtoMapper = new PUserAutoPrintSettingDtoMapper();

		dto.setLstPUserAutoPrintSettingDto(dtoMapper.mappingToDtoList(lstPUserAutoPrintSetting));

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		ses.setAttribute("PrinterSelectDto", dto);
		display(resource, util);

	}

	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util){

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto)ses.getAttribute("PrinterSelectDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start

		resource.initScreen("PrinterSelectListHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("PrinterSelectList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("PrinterSelectList/next").itemCd("next").build()
				);
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End

		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/system/PrinterSelectList.jsp",ses);

	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/prev")
	public void prev() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstPUserAutoPrintSettingDto().size() - 1);
		}

		ses.setAttribute("PrinterSelectDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 次時にコールされるメソッドです。<br>
	 * 次情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/next")
	public void next() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		if (dto.getPageIndex() < dto.getLstPUserAutoPrintSettingDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("PrinterSelectDto", dto);

		//自画面表示
		display();
	}
}
