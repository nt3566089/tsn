package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreWkDeleteLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 入庫格納再開Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStore")
@HandyErrorReturnPath(returnURL = "ReceiveStore/reopenProcess")
public class ReceiveStoreResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ReceiveStoreSelectLogic receiveStoreSelectLogic;
	@Inject
	private ReceiveStoreSelectLogic selectLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、JAN入力画面に遷移します。
	 * @param onsNum 通信制御情報の作業管理キー
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String onsNum) throws Exception {

		String valMsg = "";
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		ReceiveStoreResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic,selectLogic);

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA Start */
//		//伝票No.の初期化
//		wHtReceiveStoreDto.setOnsNum(onsNum);
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA End */

		ses.setAttribute("ReceiveStoreDto", dto);
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA Start */

//		//出庫作業Noが出庫ヘッダにの存在チェック
//		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
//		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);
//
//		//出庫作業No存在チェック
//		//入力した伝票Noが入庫実績データに存在するかチェックを行う
//		List<TStoreRecordB> tStoreRecordBList = receiveStoreCheckLogic.checkExistStoreRecordBSelect(wHtReceiveStore);
//
//		if (tStoreRecordBList.size() == 0) {
//			valMsg = "";
//			valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_WORK_NO_NOT_FOUND_ERROR);
//			//該当の伝票Noが入庫実績データに存在しません。
//			sendErrorScreen(valMsg, "", "ReceiveStoreWorkNo/display");
//			return;
//		}
//
//		Long lSumStoreNum = 0l;
//		boolean blStoreFlg = false;
//		for (int i = 0; i < tStoreRecordBList.size(); i++) {
//			lSumStoreNum = lSumStoreNum + tStoreRecordBList.get(i).getStoreNum();
//			if ("0".equals(tStoreRecordBList.get(i).getStoreFlg().toString())) {
//				blStoreFlg = true;
//			}
//		}
//
//		//入力した伝票Noが入庫数チェックを行う
//		if (lSumStoreNum == 0) {
//			valMsg = "";
//			valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_WORK_NO_QTY_ZERO_ERROR);
//			//該当の伝票Noの入庫数が0です。
//			sendErrorScreen(valMsg, "", "ReceiveStoreWorkNo/display");
//			return;
//		}
//
//		//入力した伝票Noが入庫格納フラグが全て格納済かチェックを行う
//		if (blStoreFlg == false) {
//			valMsg = "";
//			valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_WORK_NO_STORED_ERROR);
//			//該当の伝票Noが全て格納済です。
//			sendErrorScreen(valMsg, "", "ReceiveStoreWorkNo/display");
//			return;
//		}
//
//		//入力した伝票Noで取得した入庫実績データから仮ロケに入荷した在庫データが存在するかチェックを行う
//		List<TStockInout> tStockInoutList = receiveStoreSelectLogic.checkExistStoreInoutSelect(wHtReceiveStore);
//		if (tStockInoutList.size() == 0) {
//			valMsg = "";
//			valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_WORK_NO_STOCK_NOT_FOUND_ERROR);
//			//該当の伝票Noで取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。
//			sendErrorScreen(valMsg, "", "ReceiveStoreWorkNo/display");
//			return;
//		}
//
//		Long lChargeNum = 0l;
//		for (int i = 0; i < tStockInoutList.size(); i++) {
//			lChargeNum = lChargeNum + tStockInoutList.get(i).getTStock().getChargeNum();
//			}
//
//		//仮ロケに入荷した在庫データの在庫数チェックを行う
//		if (lChargeNum == 0) {
//			valMsg = "";
//			valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_WORK_NO_STOCK_QTY_ZERO_ERROR);
//			//該当の伝票Noの仮ロケに入荷した在庫データの在庫数が0です。
//			sendErrorScreen(valMsg, "", "ReceiveStoreWorkNo/display");
//			return;
//		}
//
//		//伝票NO入力画面を表示
//		ReceiveStoreJanCdResource.load(this, util);

		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			//ラベルNoがの初期化
			wHtReceiveStoreDto.setOnsNum(onsNum);
			//出庫作業Noが出庫ヘッダにの存在チェック
			WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
			WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

			//入力したラベルNoで取得した入庫実績データから在庫データが存在するかチェックを行う
			List<TStockInout> tStockInoutList = receiveStoreSelectLogic.checkExistStoreInoutSelect(wHtReceiveStore);
			if (tStockInoutList.size() == 0) {
				//該当のラベルNOに入荷した在庫データ（仮ロケ）が存在しません。
				valMsg = "";
				valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_LABEL_STOCK_NOT_FOUND_ERROR);
				sendErrorScreen(valMsg, "", "ReceiveStoreLabelNo/display");
				return;
			}

			BigDecimal lChargeNum = WCC.ZERO;
			BigDecimal lStoreNum = WCC.ZERO;

			for (int i = 0; i < tStockInoutList.size(); i++) {
				lChargeNum = WCC.add(lChargeNum, tStockInoutList.get(i).getTStock().getChargeNum());
				lStoreNum = WCC.add(lStoreNum, tStockInoutList.get(i).getTStoreRecordB().getStoreNum());
			}

			//ラベルNoに入荷した在庫データの在庫数チェックを行う
			if (WCC.isZero(lChargeNum)) {
				//該当のラベルNOに入荷した在庫データの在庫数が0です。
				valMsg = "";
				valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_LABEL_STOCK_QTY_ZERO_ERROR);
				//該当のラベルNOに入荷した在庫データの在庫数が0です。
				sendErrorScreen(valMsg, "", "ReceiveStoreLabelNo/display");
				return;
			}

			wHtReceiveStoreDto.setProductId(tStockInoutList.get(0).getTStock().getProductId());
			wHtReceiveStoreDto.setProductNm(tStockInoutList.get(0).getTStock().getMProduct().getProductNm());
			wHtReceiveStoreDto.setProductCd(tStockInoutList.get(0).getTStock().getMProduct().getProductCd());
			wHtReceiveStoreDto.setJanCd(tStockInoutList.get(0).getTStock().getMProduct().getJanCd());

			//格納済数
			wHtReceiveStoreDto.setNumOfStore(WCC.subtract(lStoreNum, lChargeNum));
			wHtReceiveStoreDto.setLimitDt(tStockInoutList.get(0).getTStoreRecordB().getLimitDt());
			wHtReceiveStoreDto.setLot(tStockInoutList.get(0).getTStoreRecordB().getLot());
			wHtReceiveStoreDto.setPlanNum(lStoreNum);
			wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStock().getStockTypeId());
			wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStock().getMStockType().chaseVDict().getDictNm());

			dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
			ses.setAttribute("ReceiveStoreDto", dto);
			//入庫格納(数量入力)画面表示
			ReceiveStoreQtyResource.load(this, util);
		} else {
			// 入庫No管理対象外場合
			//仮ロケがの初期化
			wHtReceiveStoreDto.setKariLocCd(onsNum);
			//出庫作業Noが出庫ヘッダにの存在チェック
			WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
			WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

			//在庫データに入力したの仮ロケが存在するかチェックを行う
			List<TStockInout> tStockInoutListByKariLoc = receiveStoreSelectLogic.checkExistStoreInoutSelectByKariLoc(wHtReceiveStore);
			if (tStockInoutListByKariLoc.size() == 0) {
				//該当の仮ロケに入荷した在庫データが存在しません。
				valMsg = "";
				valMsg = util.getMessage(WmsMessageConst.HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR);
				sendErrorScreen(valMsg, "", "ReceiveStoreKariLoc/display");
				return;
			}

			dto.setwHtReceiveStoreDto(wHtReceiveStoreDtoMapper.mappingToDto(wHtReceiveStore));
			ses.setAttribute("ReceiveStoreDto", dto);
			//入庫格納(JAN入力)画面表示
			ReceiveStoreJanCdResource.load(this, util);
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA End */

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

		//入庫格納情報の初期化
		ReceiveStoreDto dto = new ReceiveStoreDto();

		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//センター情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		//wHtReceiveStoreDto.setMCenter(mCenterDtoMapper.mappingToDto(mCenter));
		//wHtReceiveStoreDto.setCenterId(mCenter.getCenterId());
		wHtReceiveStoreDto.setCenterId(loginInfo.getCenterId());
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
		//wHtReceiveStoreDto.setMClient(mClientDtoMapper.mappingToDto(mClient));
		//wHtReceiveStoreDto.setClientId(mClient.getClientId());
		wHtReceiveStoreDto.setClientId(loginInfo.getClientId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		////倉庫情報の取得
		//MWarehouse mWarehouse = new MWarehouse();
		//mWarehouse.setCenterId(mCenter.getCenterId());
		//mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		//mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		////倉庫情報の初期化
		//MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		//wHtReceiveStoreDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		//wHtReceiveStoreDto.setWarehouseId(mWarehouse.getWarehouseId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//MACアドレスの初期化
		wHtReceiveStoreDto.setMacAddress(util.getMacAddress(ses));
		ses.setAttribute("ReceiveStoreDto", dto);
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
			ClientLogic clientLogic, WarehouseLogic warehouseLogic,ReceiveStoreSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//入庫格納情報の初期化
		ReceiveStoreDto dto = new ReceiveStoreDto();

		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//センター情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		//wHtReceiveStoreDto.setMCenter(mCenterDtoMapper.mappingToDto(mCenter));
		//wHtReceiveStoreDto.setCenterId(mCenter.getCenterId());
		wHtReceiveStoreDto.setCenterId(loginInfo.getCenterId());
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
		//wHtReceiveStoreDto.setMClient(mClientDtoMapper.mappingToDto(mClient));
		//wHtReceiveStoreDto.setClientId(mClient.getClientId());
		wHtReceiveStoreDto.setClientId(loginInfo.getClientId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		////倉庫情報の取得
		//MWarehouse mWarehouse = new MWarehouse();
		//mWarehouse.setCenterId(mCenter.getCenterId());
		//mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		//mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		////倉庫情報の初期化
		//MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		//wHtReceiveStoreDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		//wHtReceiveStoreDto.setWarehouseId(mWarehouse.getWarehouseId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		//MACアドレスの初期化
		wHtReceiveStoreDto.setMacAddress(util.getMacAddress(ses));

		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA Start */
		MParam mParam = selectLogic.getMParam(loginInfo.getClientId(), loginInfo.getCenterId());
		if (mParam != null) {
			// 入庫No.管理フラグ
			dto.setStoreNoFlg(mParam.getStoreNoFlg());
		}
		/* [次期エンハンス] 入庫No管理判定追加 2015.08.19 By SJA End */

		ses.setAttribute("ReceiveStoreDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param receivestoreLogic  入庫格納ワークテーブルをクリアロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ReceiveStoreWkDeleteLogic receivestoreLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//入庫格納ワークテーブルをクリア
		receivestoreLogic.clearWHtReceiveStoreWorkNo(wHtReceiveStore);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("ReceiveStoreDto");
	}

}
