package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.WHtReceiveNoPlanInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 予定無し入荷(一覧)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionList")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionList/display")
public class ReceiveNoPlanInspectionListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;

	/**
	 * 予定無し入荷画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		// 予定無し入荷ワーク
		WHtReceiveNoPlanInsp wHtReceiveNoPlanInspection = new WHtReceiveNoPlanInsp();
		wHtReceiveNoPlanInspection.setMacAddress(dto.getMacAddress());

		//一覧画面表示項目を取得
		List<WHtReceiveNoPlanInsp> lstWHtreceive = selectLogic.selectList(wHtReceiveNoPlanInspection);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		WHtReceiveNoPlanInspDtoMapper wHtReceiveNoPlanInspecDtoMapper = new WHtReceiveNoPlanInspDtoMapper();
		dto.setLstWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDtoMapper.mappingToDtoList(lstWHtreceive));
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 予定無し入荷画面表示を行います。
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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionListHT");

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("ReceiveNoPlanInspectionList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("ReceiveNoPlanInspectionList/next").itemCd("next").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionList.jsp", ses);

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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstWHtReceiveNoPlanInspDto().size() - 1);
		}

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

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

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		if (dto.getPageIndex() < dto.getLstWHtReceiveNoPlanInspDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display();

	}
}
