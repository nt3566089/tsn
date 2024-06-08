package com.oneslogi.ht.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveInDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveInSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 在庫移動入庫(在庫選択)画面Resourceクラスです。
 *
 */
@Path("/handy/StockMoveInSelect")
@HandyErrorReturnPath(returnURL = "StockMoveInSelect/display")
public class StockMoveInSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private StockMoveInSelectLogic selectLogic;
	@Inject
	private UserLogic userLogic;

	/**
	 * 在庫移動入庫(在庫選択)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic, userLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			StockMoveInSelectLogic selectLogic, UserLogic userLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//商品情報の取得
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(dto.getTMoveInstBDto().getMProduct().getJanCd());
		mProduct.setClientId(dto.getTMoveInstBDto().getMProduct().getClientId());
		//倉庫情報の取得
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		MWarehouse mWarehouse = mWarehouseDtoMapper.mappingToEntity(dto.getTMoveInstBDto().getMWarehouse());
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//一覧画面表示項目を取得
		List<TMoveInstB> lstTMoveInstB = selectLogic.selectTMoveInstB(mProduct, mWarehouse, bUser, true);

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
		dto.setLstTMoveInstBDto(tMoveInstBDtoMapper.mappingToDtoList(lstTMoveInstB));

		for (int i = 0; i < lstTMoveInstB.size(); i++) {
			TMoveInstB tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(dto.getLstTMoveInstBDto().get(i));

			TMoveInstB tmpTMoveInstB = selectLogic.selectMLocation(tMoveInstB, bUser);
			//ロケマスタの取得
			MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
			MLocation mLocation = new MLocation();
			mLocation.setLocationNm(tmpTMoveInstB.getMLocation().getLocationNm());
			mLocation.setLocationId(tmpTMoveInstB.getMLocation().getLocationId());
			mLocation.setLocationCd(tmpTMoveInstB.getMLocation().getLocationCd());
			dto.getLstTMoveInstBDto().get(i).setMLocation(mLocationDtoMapper.mappingToDto(mLocation));
			dto.setMoveInstBId(tmpTMoveInstB.getMoveInstBId());
		}
		ses.setAttribute("StockMoveInDto", dto);

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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("StockMoveInSelectHT");

		// オプションボタン２設定
		resource.setOptionButton2(
				ButtonInfo.builder().url("StockMoveInSelect/select").itemCd("option2").keyType(KEY_TYPE_SEND).build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("StockMoveInJanCd/display").itemCd("return").build());

		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("StockMoveInSelect/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("StockMoveInSelect/next").itemCd("next").build()
				);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//在庫選択へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/stock/StockMoveInSelect.jsp", ses);
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

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstTMoveInstBDto().size() - 1);
		}

		ses.setAttribute("StockMoveInDto", dto);

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

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");

		if (dto.getPageIndex() < dto.getLstTMoveInstBDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("StockMoveInDto", dto);

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

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		TMoveInstBDto selectTMoveInstBDto = dto.getLstTMoveInstBDto().get(dto.getPageIndex());
		dto.setTMoveInstBDto(selectTMoveInstBDto);

		ses.setAttribute("StockMoveInDto", dto);

		//先ロケ入力画面を表示
		StockMoveInLocResource.load(this, util, "StockMoveInSelect/display");

	}

}
