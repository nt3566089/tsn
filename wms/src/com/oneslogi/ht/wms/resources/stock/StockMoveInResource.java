package com.oneslogi.ht.wms.resources.stock;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MWarehouseDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TMoveInstBDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.stock.StockMoveInDto;
import com.oneslogi.ht.wms.logic.stock.StockMoveInSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 在庫移動出庫再開Resourceクラスです。
 *
 */
@Path("/handy/StockMoveIn")
@HandyErrorReturnPath(returnURL = "StockMoveIn/reopenProcess")
public class StockMoveInResource extends HandyResourceBase {

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
	private StockMoveInSelectLogic selectLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫移動入庫(JAN入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String JanCd) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
		//StockMoveInResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic, userLogic);
		StockMoveInResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic, userLogic,selectLogic);
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */

		StockMoveInDto dto = (StockMoveInDto) ses.getAttribute("StockMoveInDto");
		TMoveInstBDto tMoveInstBDto = dto.getTMoveInstBDto();

		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */

//		//在庫移動入庫の初期化
//		dto.setJanCdProd(JanCd);
//
//		TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
//		TMoveInstB tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(tMoveInstBDto);
//
//		dto.setTMoveInstBDto(tMoveInstBDtoMapper.mappingToDto(tMoveInstB));
//		ses.setAttribute("StockMoveInDto", dto);
//		//JAM/商品入力画面を表示
//		StockMoveInJanCdResource.display(this, util);

		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			//在庫移動入庫の初期化
			String storeNoFlgKbn = JanCd.split(",")[0];
			String keyValue = JanCd.split(",")[1];
			if (storeNoFlgKbn.equals("1")){
				dto.setLabelNo(keyValue);
			}else{
				dto.setLabelNo(null);
			}
			TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
			TMoveInstB tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(tMoveInstBDto);
			dto.setTMoveInstBDto(tMoveInstBDtoMapper.mappingToDto(tMoveInstB));
			ses.setAttribute("StockMoveInDto", dto);
			//ラベルNo入力画面を表示
			StockMoveInLabelNoResource.display(this, util);
		}else{
			//在庫移動入庫の初期化
			String storeNoFlgKbn = JanCd.split(",")[0];
			String keyValue = JanCd.split(",")[1];
			if (storeNoFlgKbn.equals("0")){
				dto.setJanCdProd(keyValue);
			}else{
				dto.setJanCdProd(null);
			}
			TMoveInstBDtoMapper tMoveInstBDtoMapper = new TMoveInstBDtoMapper();
			TMoveInstB tMoveInstB = tMoveInstBDtoMapper.mappingToEntity(tMoveInstBDto);

			dto.setTMoveInstBDto(tMoveInstBDtoMapper.mappingToDto(tMoveInstB));
			ses.setAttribute("StockMoveInDto", dto);
			//JAM/商品入力画面を表示
			StockMoveInJanCdResource.display(this, util);
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
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
	 * @param userLogic      メッセージマスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, UserLogic userLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//在庫移動入庫情報の初期化
		StockMoveInDto dto = new StockMoveInDto();

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		//TMoveInstBDto ｔMoveInstBDto = dto.getTMoveInstBDto();
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);

		TMoveInstBDto tMoveInstBDto = dto.getTMoveInstBDto();
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setCenterId(loginInfo.getCenterId());

		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		tMoveInstBDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));

		MProduct mProduct = new MProduct();
		mProduct.setClientId(loginInfo.getClientId());

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		tMoveInstBDto.setMProduct(mProductDtoMapper.mappingToDto(mProduct));
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		////倉庫情報の取得
		//MWarehouse mWarehouse = new MWarehouse();
		//mWarehouse.setCenterId(mCenter.getCenterId());
		//mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		//mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		////倉庫情報の初期化
		//MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		//ｔMoveInstBDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		//ｔMoveInstBDto.setWarehouseId(mWarehouse.getWarehouseId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		dto.setBuser(bUser);

		ses.setAttribute("StockMoveInDto", dto);
	}


	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @param userLogic      メッセージマスタに対するロジック
	 * @param selectLogic    在庫移送入庫データ取得ロジッククラス
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, UserLogic userLogic,StockMoveInSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//在庫移動入庫情報の初期化
		StockMoveInDto dto = new StockMoveInDto();

		TMoveInstBDto tMoveInstBDto = dto.getTMoveInstBDto();
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setCenterId(loginInfo.getCenterId());

		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		tMoveInstBDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));

		MProduct mProduct = new MProduct();
		mProduct.setClientId(loginInfo.getClientId());

		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		tMoveInstBDto.setMProduct(mProductDtoMapper.mappingToDto(mProduct));

		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		dto.setBuser(bUser);

		MParam mParam = selectLogic.getMParam(loginInfo.getClientId(), loginInfo.getCenterId());
		if (mParam != null) {
			// 入庫No.管理フラグ
			dto.setStoreNoFlg(mParam.getStoreNoFlg());
		}

		ses.setAttribute("StockMoveInDto", dto);
	}
	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */

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

		ses.removeAttribute("StockMoveInDto");
	}
}
