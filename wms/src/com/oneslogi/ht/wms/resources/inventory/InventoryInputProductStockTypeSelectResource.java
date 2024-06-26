package com.oneslogi.ht.wms.resources.inventory;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.MStockTypeDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductStockTypeSelectDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductLogic;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductStockTypeSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 商品棚卸入力(在庫区分選択)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductStockTypeSelect")
@HandyErrorReturnPath(returnURL = "InventoryInputProductStockTypeSelect/display")
public class InventoryInputProductStockTypeSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private InventoryInputProductStockTypeSelectLogic StockTypeSelect;
	@Inject
	private InventoryInputProductLogic inventoryLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CustomerLogic customerLogic;

	/**
	 * 商品棚卸入力(在庫区分選択)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, userLogic, StockTypeSelect);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl,
			UserLogic userLogic, InventoryInputProductStockTypeSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		MStockTypeDtoMapper mStockTypeDtoMapper = new MStockTypeDtoMapper();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//一覧画面表示項目を取得
		List<MStockType> lstMStockType = selectLogic.selectList(bUser);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setBackUrl(backUrl);
		dto.setMStockTypeDto(mStockTypeDtoMapper.mappingToDtoList(lstMStockType));
		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(在庫区分選択)画面表示を行います。
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

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.13 kawana Start

		// 画面初期設定
		resource.initScreen("InventoryInputProductStockTypeSelectHT");

		// 戻るボタン設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.13 kawana End

		//預託選択画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductStockTypeSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(預託・在庫区分入力)画面に遷移します。
	 * @param bean 商品棚卸入力(在庫区分)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam InventoryInputProductStockTypeSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		dto.setStockType(bean.getStockType());

		ses.setAttribute("InventoryInputProductDto", dto);

		//商品棚卸入力(預託・在庫区分入力)画面を表示
		InventoryInputProductKbnResource.display(this, util, customerLogic, stockTypeLogic, userLogic, inventoryLogic);

	}

}
