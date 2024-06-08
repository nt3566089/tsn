package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 在庫移動出庫(在庫選択)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOutList")
@HandyErrorReturnPath(returnURL = "StockMoveOutList/display")
public class StockMoveOutListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private StockMoveOutSelectLogic selectLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * 在庫移動出庫(在庫選択)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic, userLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			StockMoveOutSelectLogic selectLogic, UserLogic userLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//商品情報の取得
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(dto.getJanCdProd());
		//荷主情報の取得
		MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		MClient mClient = mClientDtoMapper.mappingToEntity(dto.getTStockDto().getMClient());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		mClient.setClientId(dto.getTStockDto().getClientId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//倉庫情報の取得
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		MWarehouse mWarehouse = mWarehouseDtoMapper.mappingToEntity(dto.getTStockDto().getMWarehouse());
		//ロケーション情報の取得
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationDtoMapper.mappingToEntity(dto.getTStockDto().getMLocation());
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//入庫No.情報の取得
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(null);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		//一覧画面表示項目を取得
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//List<TStock> lstTStock = selectLogic.SelectStock(mClient, mLocation, mProduct, mWarehouse, bUser);
		List<TStock> lstTStock = selectLogic.SelectStock(mClient, mLocation, mProduct, mWarehouse, bUser, tStoreNo);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		TStockDtoMapper tStockDtoMapper = new TStockDtoMapper();
		dto.setLstTStockDto(tStockDtoMapper.mappingToDtoList(lstTStock));
		ses.setAttribute("StockMoveOutDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 在庫移動出庫(在庫選択)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 LSW Start
		resource.initScreen("StockMoveOutListHT");
		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("StockMoveOutList/select")
				.itemCd("option2")
				.keyType(KEY_TYPE_SEND)
				.build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveOutJanCd/display").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("StockMoveOutList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("StockMoveOutList/next").itemCd("next").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		//在庫選択へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveOutList.jsp",ses);
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

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstTStockDto().size() - 1);
		}

		ses.setAttribute("StockMoveOutDto", dto);

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

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");

		if (dto.getPageIndex() < dto.getLstTStockDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("StockMoveOutDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 数量入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");
		TStockDto selectDto = dto.getLstTStockDto().get(dto.getPageIndex());
		dto.setTStockDto(selectDto);
		//[新WMS-112-007] 入庫ラベルNo入力後、戻って商品CDを入力時、在庫データと入庫ラベルNoがズレる不具合対応 2015/11/18 Yokosuka [S]
		dto.setStoreLabelNo(selectDto.getTStoreNo().getStoreLabelNo());
		//[新WMS-112-007] 入庫ラベルNo入力後、戻って商品CDを入力時、在庫データと入庫ラベルNoがズレる不具合対応 2015/11/18 Yokosuka [E]

		ses.setAttribute("StockMoveOutDto", dto);

		//数量入力画面を表示
		StockMoveOutQtyResource.load(this, util, "StockMoveOutList/display");

	}

}
