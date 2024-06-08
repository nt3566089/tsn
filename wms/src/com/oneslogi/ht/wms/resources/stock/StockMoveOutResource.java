package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveOutDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveOutSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫移動出庫再開Resourceクラスです。
 *
 */
@Path("/handy/StockMoveOut")
@HandyErrorReturnPath(returnURL = "StockMoveOut/reopenProcess")
public class StockMoveOutResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private StockMoveOutSelectLogic selectLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動出庫(JAN入力)画面に遷移します。
	 * @param locationCd JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String locationCd) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//StockMoveOutResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);
		StockMoveOutResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic,selectLogic);
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		StockMoveOutDto dto = (StockMoveOutDto) ses.getAttribute("StockMoveOutDto");
		TStockDto tStockDto = dto.getTStockDto();

		//出庫ロケの初期化
		tStockDto.getMLocation().setLocationCd(locationCd);

		ses.setAttribute("StockMoveOutDto", dto);

		//ロケ入力画面を表示
		StockMoveOutLocResource.display(this, util);
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
	 * @param selectLogic    在庫移送出庫データ取得ロジッククラス
	 * @throws Exception
	 */
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
//	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
//			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, StockMoveOutSelectLogic selectLogic) throws Exception {
			/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//在庫移動出庫情報の初期化
		StockMoveOutDto dto = new StockMoveOutDto();

		TStockDto tStockDto = dto.getTStockDto();

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		MLocationDto mLocationDto = tStockDto.getMLocation();
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//センター情報の取得
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		mLocationDto.setCenterId(loginInfo.getCenterId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//荷主情報の取得
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
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

		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA Start */
		//パラメータマスタ情報の取得
		MParam mParam = selectLogic.getMParam(loginInfo.getClientId(), loginInfo.getCenterId());
		if (mParam != null) {
			// 入庫No.管理フラグ
			dto.setStoreNoFlg(mParam.getStoreNoFlg());
		}
		/* [次期エンハンス] 移動出庫(入庫ラベルNo.)を追加 2015.09.15 By SJA End */
		ses.setAttribute("StockMoveOutDto", dto);
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

		ses.removeAttribute("StockMoveOutDto");
	}

}
