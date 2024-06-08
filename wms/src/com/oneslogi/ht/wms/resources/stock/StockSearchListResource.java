package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockSearchDto;
import com.oneslogi.ht.wms.logic.stock.StockSearchSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫一覧画面Resourceクラスです。
 *
 */
@Path("/handy/StockSearchList")
@HandyErrorReturnPath(returnURL = "StockSearchList/display")
public class StockSearchListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private StockSearchSelectLogic stockSearchSelectLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 *在庫一覧画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, stockSearchSelectLogic, userLogic, clientLogic, centerLogic, warehouseLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			StockSearchSelectLogic stockSearchSelectLogic, UserLogic userLogic
			, ClientLogic clientLogic, CenterLogic centerLogic, WarehouseLogic warehouseLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockSearchDto dto = (StockSearchDto) ses.getAttribute("StockSearchDto");

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////荷主情報の取得
		//MClient mClient = new MClient();
		//mClient.setClientCd(loginInfo.getClientCd());
		//mClient = clientLogic.getUkEntity(mClient);

		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		////倉庫情報の取得
		//MWarehouse mWarehouse = new MWarehouse();
		//mWarehouse.setCenterId(mCenter.getCenterId());
		//mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		//mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//在庫検索データ保存する。
		TStockDtoMapper tstockDtoMapper = new TStockDtoMapper();
		TStock tStock = tstockDtoMapper.mappingToEntity(dto.getStockDto());
		tStock.chaseMLocation().setLocationCd(dto.getLocationCd());
		tStock.chaseMProduct().setJanCd(dto.getJanCd());
		tStock.chaseTStoreNo().setStoreLabelNo(dto.getStoreLabelNo());

		//一覧画面表示項目を取得
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//List<TStock> lstTStock = stockSearchSelectLogic.selectList(tStock, bUser, mClient, mWarehouse);
		List<TStock> lstTStock = stockSearchSelectLogic.selectList(tStock, bUser, loginInfo.getClientId(), loginInfo.getWarehouseId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}
		TStockDtoMapper tStockDtoMapper = new TStockDtoMapper();
		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);
		dto.setLstStockDto(tStockDtoMapper.mappingToDtoList(lstTStock));

		ses.setAttribute("StockSearchDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫一覧画面表示を行います。
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

		StockSearchDto dto = (StockSearchDto) ses.getAttribute("StockSearchDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.13 kawana Start

		// 画面初期設定
		resource.initScreen("StockSearchListHT");

		// 戻るボタン設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		// ページボタン設定
		resource.setPageButton(
				ButtonInfo.builder().url("StockSearchList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("StockSearchList/next").itemCd("next").build()
				);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.13 kawana End

		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockSearchList.jsp", ses);
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

		StockSearchDto dto = (StockSearchDto) ses.getAttribute("StockSearchDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstStockDto().size() - 1);
		}

		ses.setAttribute("StockSearchDto", dto);

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

		StockSearchDto dto = (StockSearchDto) ses.getAttribute("StockSearchDto");

		if (dto.getPageIndex() < dto.getLstStockDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("StockSearchDto", dto);

		//自画面表示
		display();
	}
}
