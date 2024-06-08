package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * パラピッキング(登録内容参照)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingProductList")
@HandyErrorReturnPath(returnURL = "ShippingPickingProductList/display")
public class ShippingPickingProductListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingPickingProductSelectLogic selectLogic;

	/**
	 * パラピッキング(登録内容参照)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ShippingPickingProductSelectLogic selectLogic
			) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//一覧画面表示項目を取得
		List<WHtShippingPicking> lstWHtShippingPicking = selectLogic.selectList(wHtShippingPicking);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		dto.setLstWHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDtoList(lstWHtShippingPicking));
		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));

		ses.setAttribute("ShippingPickingProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * パラピッキング(登録内容参照)画面表示を行います。
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

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 wangqi Start

		// 画面初期設定
		resource.initScreen("ShippingPickingProductListHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("ShippingPickingProductList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("ShippingPickingProductList/next").itemCd("next").build()
				);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 wangqi End

		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingPickingProductList.jsp", ses);
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

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstWHtShippingPickingDto().size() - 1);
		}

		ses.setAttribute("ShippingPickingProductDto", dto);

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

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");

		if (dto.getPageIndex() < dto.getLstWHtShippingPickingDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ShippingPickingProductDto", dto);

		//自画面表示
		display();
	}

}
