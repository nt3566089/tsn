package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.LocationMoveDto;
import com.oneslogi.ht.wms.logic.stock.LocationMoveCheckLogic;
import com.oneslogi.ht.wms.logic.stock.LocationMoveSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ロケ変更再開Resourceクラスです。
 *
 */
@Path("/handy/LocationMoveOut")
@HandyErrorReturnPath(returnURL = "LocationMoveOutLoc/load")
public class LocationMoveResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private LocationMoveSelectLogic selectLogic;
	//[ON推-品向-1014] 2015/11/13 NayZaw Start
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private LocationMoveCheckLogic checkLogic;
	//[ON推-品向-1014] 2015/11/13 NayZaw End

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ロケ変更(一覧)画面に遷移します。
	 * @param locationCd ロケ変更(一覧)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String locationCd) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		LocationMoveResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);

		LocationMoveDto dto = (LocationMoveDto) ses.getAttribute("LocationMoveDto");
		TStockDto tStockDto = dto.getTStockDto();

		//出庫ロケの初期化
		tStockDto.getMLocation().setLocationCd(locationCd);

		//[ON推-品向-1014] 2015/11/13 NayZaw Start

		//出庫ロケ存在チェック
		MLocationDtoMapper mLocationDtoMapper = new MLocationDtoMapper();
		MLocation mLocation = mLocationDtoMapper.mappingToEntity(tStockDto.getMLocation());

		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			return;
		}
		tStockDto.getMLocation().setLocationNm(mLocation.getLocationNm());

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//商品情報の取得
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(null);
		//荷主情報の取得
		MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		MClient mClient = mClientDtoMapper.mappingToEntity(dto.getTStockDto().getMClient());
		mClient.setClientId(dto.getTStockDto().getClientId());
		//倉庫情報の取得
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		MWarehouse mWarehouse = mWarehouseDtoMapper.mappingToEntity(dto.getTStockDto().getMWarehouse());
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		//入庫No.情報の取得
		TStoreNo tStoreNo = new TStoreNo();
		tStoreNo.setStoreLabelNo(null);

		//在庫存在チェック
		int dataCnt = checkLogic.checkStock(mClient, mLocation, mProduct, mWarehouse, bUser, tStoreNo);
		if (dataCnt == 0) {
			return;
		}
		//[ON推-品向-1014] 2015/11/13 NayZaw End
		ses.setAttribute("LocationMoveDto", dto);

		//ロケ入力画面を表示
		LocationMoveOutListResource.load(this, util, "LocationMoveOutLoc/display", selectLogic, userLogic);
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

		//ロケ変更情報の初期化
		LocationMoveDto dto = new LocationMoveDto();

		TStockDto tStockDto = dto.getTStockDto();

		MLocationDto mLocationDto = tStockDto.getMLocation();

		//センター情報の取得
		mLocationDto.setCenterId(loginInfo.getCenterId());

		//荷主情報の取得
		tStockDto.setClientId(loginInfo.getClientId());

		//倉庫情報の取得
		tStockDto.setWarehouseId(loginInfo.getWarehouseId());

		ses.setAttribute("LocationMoveDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("LocationMoveDto");
	}

}
