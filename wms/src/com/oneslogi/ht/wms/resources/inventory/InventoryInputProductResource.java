package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.dtomapper.WHtInventoryInputProdDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.WHtInventoryInputProd;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 商品棚卸入力Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProduct")
@HandyErrorReturnPath(returnURL = "InventoryInputProduct/reopenProcess")
public class InventoryInputProductResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private InventoryInputProductLogic inventoryLogic;
	@Inject
	private UserLogic userLogic;
	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(ロケ入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String inventoryInfo) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//機能単位セッションを処理化
		InventoryInputProductResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);

		String aryInventoryInfo[] = inventoryInfo.split("\\|");
		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		//出庫作業No.の初期化
		dto.setDeposit(aryInventoryInfo[0]);
		dto.setStockType(aryInventoryInfo[1]);

		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		//預託区分名称取得
		MCustomer mCustomer = new MCustomer();
		mCustomer.setCustomerCd(dto.getDeposit());
		mCustomer.setClientId(dto.data.wHtInventoryInputProdDto.getClientId());

		mCustomer = customerLogic.getUkEntity(mCustomer);
		wHtInventoryInputProdDto.setConsignmentClsNm("");
		if (mCustomer != null) {
			if(mCustomer.isDepositFlg$1()){
				wHtInventoryInputProdDto.setConsignmentClsId(mCustomer.getCustomerId());
				wHtInventoryInputProdDto.setConsignmentClsNm(mCustomer.getCustomerNm());
			}
		}

		//在庫区分名称取得
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(dto.getStockType());
		MStockType retMStockType = inventoryLogic.getStockTypeNm(bUser, mStockType);
		if (retMStockType!=null){
			wHtInventoryInputProdDto.setStockTypeId(retMStockType.getStockTypeId());
			wHtInventoryInputProdDto.setStkClsNm(retMStockType.getVDict().getDictNm());
		}

		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);

		ses.setAttribute("InventoryInputProductDto", dto);

		//ロケ入力画面を表示
		InventoryInputProductLocResource.load(this, util);
	}

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//商品棚卸入力情報の初期化
		InventoryInputProductDto dto = new InventoryInputProductDto();

		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//センター情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		//wHtInventoryInputProdDto.setMCenter(mCenterDtoMapper.mappingToDto(mCenter));
		//wHtInventoryInputProdDto.setCenterId(mCenter.getCenterId());
		wHtInventoryInputProdDto.setCenterId(loginInfo.getCenterId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]


		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//荷主情報の取得
		//MClient mClient = new MClient();
		//mClient.setClientCd(loginInfo.getClientCd());
		//mClient = clientLogic.getUkEntity(mClient);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//荷主情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		//wHtInventoryInputProdDto.setMClient(mClientDtoMapper.mappingToDto(mClient));
		//wHtInventoryInputProdDto.setClientId(mClient.getClientId());
		wHtInventoryInputProdDto.setClientId(loginInfo.getClientId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		////倉庫情報の取得
		//MWarehouse mWarehouse = new MWarehouse();
		//mWarehouse.setCenterId(mCenter.getCenterId());
		//mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		//mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		////倉庫情報の初期化
		//MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		//wHtInventoryInputProdDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		//wHtInventoryInputProdDto.setWarehouseId(mWarehouse.getWarehouseId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//MACアドレスの初期化
		wHtInventoryInputProdDto.setMacAddress(util.getMacAddress(ses));

		//預託の初期化
		dto.setDeposit("");

		//在庫区分の初期化
		dto.setStockType("");

		//JAN/商品CDの初期化
		dto.setJanProdCd("");

		ses.setAttribute("InventoryInputProductDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param inventoryLogic  業務ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, InventoryInputProductLogic inventoryLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		WHtInventoryInputProdDtoMapper wHtInventoryInputProdMapper = new WHtInventoryInputProdDtoMapper();
		WHtInventoryInputProd wHtInventoryInputProd = wHtInventoryInputProdMapper.mappingToEntity(wHtInventoryInputProdDto);

		//商品棚卸ワークテーブルをクリア
		inventoryLogic.clearWHtInventory(wHtInventoryInputProd);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("InventoryInputProductDto");
	}

}
