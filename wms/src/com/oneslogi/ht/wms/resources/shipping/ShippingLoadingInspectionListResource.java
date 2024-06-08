package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtLoadingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtLoadingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 積込検品(一覧)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingLoadingInspectionList")
@HandyErrorReturnPath(returnURL = "ShippingLoadingInspectionList/display")
public class ShippingLoadingInspectionListResource extends HandyResourceBase {

	@Inject
	HandyCommonUtil util;
	@Inject
	ShippingLoadingInspectionSelectLogic selectLogic;


	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl)throws Exception{
		load(this, util, backUrl, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ShippingLoadingInspectionSelectLogic selectLogic)throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");
		WHtLoadingDto wHtLoadingDto = dto.getwHtLoadingDto();

		WHtLoadingDtoMapper wHtLoadingDtoMapper = new WHtLoadingDtoMapper();
		WHtLoading wHtLoading = wHtLoadingDtoMapper.mappingToEntity(wHtLoadingDto);

		List<WHtLoading> lstWHtLoading = selectLogic.selectList(wHtLoading);
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}
		dto.setPageIndex(0);
		dto.setTotalPage(lstWHtLoading.size()/10+1);
		dto.setBackUrl(backUrl);
		dto.setLstWHtLoadingDto(wHtLoadingDtoMapper.mappingToDtoList(lstWHtLoading));
		dto.setwHtLoadingDto(wHtLoadingDto);

		ses.setAttribute("ShippingLoadingInspectionDto", dto);

		// 自画面表示
		display(resource,util);

	}

	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this,util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util){
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

//		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW Strat

		// 画面初期設定
		resource.initScreen("ShippingLoadingInspectionListHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingLoadingInspectionNo/display").itemCd("return").build());

		resource.setPageButton(
			ButtonInfo.builder().url("ShippingLoadingInspectionList/prev").itemCd("prev").build(),
			ButtonInfo.builder().url("ShippingLoadingInspectionList/next").itemCd("next").build()
			);
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

	    //預託選択画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingLoadingInspectionList.jsp", ses);

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

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex((dto.getLstWHtLoadingDto().size()-1)/9);
		}

		ses.setAttribute("ShippingLoadingInspectionDto", dto);

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

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");

		if (dto.getPageIndex() < (dto.getLstWHtLoadingDto().size()-1) /9) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ShippingLoadingInspectionDto", dto);

		//自画面表示
		display();
	}

}
