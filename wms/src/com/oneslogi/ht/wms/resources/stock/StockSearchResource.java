package com.oneslogi.ht.wms.resources.stock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockSearchDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫検索処理Resourceクラスです。
 *
 */
@Path("/handy/StockSearch")
public class StockSearchResource extends HandyResourceBase {

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

		//在庫情報の初期化
		StockSearchDto dto = new StockSearchDto();

		TStockDto tStockDto = dto.getStockDto();

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setCenterId(loginInfo.getCenterId());
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		tStockDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////荷主情報の取得
		//MClient mClient = new MClient();
		//mClient.setClientCd(loginInfo.getClientCd());
		//mClient = clientLogic.getUkEntity(mClient);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//荷主情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		//tStockDto.setMClient(mClientDtoMapper.mappingToDto(mClient));
		//tStockDto.setClientId(mClient.getClientId());
		tStockDto.setClientId(loginInfo.getClientId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		////倉庫情報の取得
		//MWarehouse mWarehouse = new MWarehouse();
		//mWarehouse.setCenterId(mCenter.getCenterId());
		//mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		//mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		//倉庫情報の初期化
		//MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		//tStockDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		//tStockDto.setWarehouseId(mWarehouse.getWarehouseId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		ses.setAttribute("StockSearchDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ses.removeAttribute("StockSearchDto");
	}

}
