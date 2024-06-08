package com.oneslogi.wms.resources.inventory;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.stockupdate.StockSelectLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockSelectLotCondition;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.dto.inventory.InventoryBulkUpdateDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LotLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryAllInsUptLogic;
import com.oneslogi.wms.logic.inventory.InventoryAllUptSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸在庫一括更新画面のリソースクラス。
 */
@Path("/inventory/inventoryBulkUpdate")
public class InventoryBulkUpdateResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 登録異常
		 */
		protected static final int STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR = 3;
		/**
		 * 在庫変更異常
		 */
		protected static final int STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_COUNT_DATA_CHANGED_ERROR = 3;

		/**
		 * 棚卸数量が未登録
		 */
		protected static final int INVENTORY_BULK_UPDATE_CANNOT_UPDATE_NOT_INVENTORY_INPUT_ERROR = 4;
		// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 Start
		/**
		 * 在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDのデータが登録済
		 */
		protected static final int STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR = 5;
		// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 End
	}

	// ===== 使用テーブル =====

	@Inject
	private MZoneBhv mZoneBhv;
	// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 Start
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 End

	// ===== 使用ロジッククラス =====

	@Inject
	private InventoryAllUptSelectLogic inventoryAllUptSelectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private InventoryAllInsUptLogic inventoryAllInsUptLogic;
	@Inject
	private UserLogic userLogic;
	// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ParamLogic paramLogic;
	// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 End
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.11 sja Start
	// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.11 sja End
	// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana Start
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private LotLogic lotLogic;
	@Inject
	private StockSelectLogic stockSelectLogic;
	// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryBulkUpdateDto 棚卸在庫一括更新画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryBulkUpdateDto init() {
		return new InventoryBulkUpdateDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・棚卸在庫一括更新データを取得する
	 * </pre>
	 * @param inventoryBulkUpdateDto 棚卸在庫一括更新画面用DTO
	 * @return InventoryBulkUpdateDto 棚卸在庫一括更新画面用DTO
	 */
	@GET
	@Path("/search")
	public InventoryBulkUpdateDto search(InventoryBulkUpdateDto inventoryBulkUpdateDto) throws IOException {
		InventoryBulkUpdateDto inventoryDto = new InventoryBulkUpdateDto();

		// Entity変換
		TInventoryBDtoMapper mapperB = new TInventoryBDtoMapper();
		TInventoryB inventoryB = mapperB.mappingToEntity(inventoryBulkUpdateDto.data.headInventoryB);

		TInventoryInstDtoMapper mapperInst = new TInventoryInstDtoMapper();
		TInventoryInst inventoryInst = mapperInst.mappingToEntity(inventoryBulkUpdateDto.data.headInventoryInst);

		// Entity変換
		TInventoryHDtoMapper mapperH = new TInventoryHDtoMapper();
		TInventoryH inventoryH = mapperH.mappingToEntity(inventoryBulkUpdateDto.data.headInventoryH);

		// Entity変換
		MProductDtoMapper mapperMProduct = new MProductDtoMapper();
		MProduct product = mapperMProduct.mappingToEntity(inventoryBulkUpdateDto.data.headProduct);

		//センタID取得
		String centerCd = inventoryH.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		inventoryH.setCenterId(mCenter.getCenterId());

		//荷主ID取得
		String clientCd = inventoryH.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		inventoryH.setClientId(mClient.getClientId());

		//倉庫ID取得
		// 倉庫ID
		if (!CU.isNullOrEmpty(inventoryB.getMWarehouse().getWarehouseCd())) {
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(inventoryB.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			inventoryB.setWarehouseId(mWarehouse.getWarehouseId());
		}


		// 預託ID取得
		if (!CU.isNullOrEmpty(inventoryInst.getMCustomer().getCustomerCd())) {
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(mClient.getClientId());
			mCustomer.setCustomerCd(inventoryInst.getMCustomer().getCustomerCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			inventoryInst.setDepositId(mCustomer.getCustomerId());
		}

		// 在庫区分ID
		if (!CU.isNullOrEmpty(inventoryB.getMStockType().getStockTypeCd())) {
			MStockType mStockType = new MStockType();
//			mStockType.setClientId(mClient.getClientId());
			mStockType.setStockTypeCd(inventoryB.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			inventoryB.setStockTypeId(mStockType.getStockTypeId());
		}

		//ゾーンID取得
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		List<Long> zoneIdList = new ArrayList<Long>();
		if (!CU.isNullOrEmpty(inventoryInst.getMZone().getZoneCd())) {
			MZoneCB mZoneCB = mZoneBhv.newConditionBean();
			mZoneCB.query().setZoneCd_Equal(inventoryInst.getMZone().getZoneCd());
			List<MZone> mzoneList = mZoneBhv.selectList(mZoneCB);
			// ゾーンIDリストをセット
			for (MZone mZone : mzoneList) {
				zoneIdList.add(mZone.getZoneId());
			}
		}
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		inventoryInst.setFromLocationCd(inventoryInst.getFromLocationCd());
		inventoryInst.setToLocationCd(inventoryInst.getToLocationCd());
		inventoryInst.setStockTakingInput(inventoryInst.getStockTakingInput());
		inventoryInst.setUnmatch(inventoryInst.getUnmatch());

		// 検索
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		List<TInventoryB> page = inventoryAllUptSelectLogic.select(inventoryH,inventoryInst,inventoryB,product,zoneIdList,inventoryBulkUpdateDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if(page.size() > 0){
			for (int i = 0; i < page.size() ; i++) {
				BigDecimal lChargeNum;
				if (page.get(i).getTStock() == null || page.get(i).getTStock().getChargeNum() == null){
					lChargeNum = WCC.ZERO;
				}else{
					lChargeNum = page.get(i).getTStock().getChargeNum();
				}
				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.11 sja Start
				// [ON推-品向-110] ケース入数０の場合、明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng Start
				//page.get(i).setUnitNum(page.get(i).getShapeUnitNum()) ;
				// [ON推-品向-110] ケース入数０の場合、明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng End
				MProductShape mProductShape = new MProductShape();
				mProductShape.setProductId(page.get(i).getMProduct().getProductId());
				mProductShape.setClientId(mClient.getClientId());
				mProductShape.setCenterId(mCenter.getCenterId());
				mProductShape.setCaseFlg("1");
				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.11 sja End

				// [#2962][Ver3.0] 不要なピース・ケース換算処理を削除 2018.02.19 miyabe Delete

				// [ON推-品向-443] エラーが発生する行では、選択時に背景色の変更がされない時がある。 2014.12.16 KI Start

				TStock ts = new TStock();

				//現時点引当可能数
				if (lChargeNum == null || WCC.isZero(lChargeNum)) {
					ts.setChargeNum(WCC.ZERO);
					//page.get(i).setChargeNum(0L);
                }

				// 現時点引当済み数
				if (page.get(i).getTStock() == null || page.get(i).getTStock().getAllocNum() == null) {
					ts.setAllocNum(WCC.ZERO);
					//page.get(i).setAllocNum(0L);
				}
				// 現時点移動中数
				if (page.get(i).getTStock() == null || page.get(i).getTStock().getMoveNum() == null) {
					ts.setMoveNum(WCC.ZERO);
					//page.get(i).setMoveNum(0L);
				}
				if(ts.getChargeNum() != null && ts.getAllocNum() != null  && ts.getMoveNum() != null ){
					if ( WCC.isZero(ts.getChargeNum()) && WCC.isZero(ts.getAllocNum()) && WCC.isZero(ts.getMoveNum()) ){
						page.get(i).setTStock(ts);
					}
				}
				// [ON推-品向-443] エラーが発生する行では、選択時に背景色の変更がされない時がある。 2014.12.16 KI End
				//現時点調整可能数
				page.get(i).setAdjQty(lChargeNum);
				//棚卸差異数
				page.get(i).setDiffQty(WCC.subtract(page.get(i).getInventoryNum(), lChargeNum));


				BUser buser = new BUser();
				buser.setUserCd(page.get(i).getHistAddUser());
				buser = userLogic.getUkEntity(buser);

				if (buser != null) {
					page.get(i).setHistAddUser(buser.getUserNm());
				}

//				if (("1").equals(page.get(i).getStockAdjustFlg())){
//					page.get(i).setstockAdjustFlgShow("○");
//				}
			}
		}

		//Entity-Dto変換処理
		List<TInventoryBDto> list = mapperB.mappingToDtoList(page);

		//検索結果詰込処理
		inventoryDto.data.body = list;
		//検索結果詰め替え処理
		inventoryDto.paging = inventoryBulkUpdateDto.paging;

		return inventoryDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 入力データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param inventoryBulkUpdateDto 棚卸在庫一括更新画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/check")
	public StatusDto inputCheck(InventoryBulkUpdateDto inventoryBulkUpdateDto) {
	//入力チェックデータの組み立て
	this. setupInputCheck(inventoryBulkUpdateDto);
	//チェックエラーの場合
	if (getErrorManager().size() > 0) {
		// 処理中止
		return null;
	}
	// 確認メッセージをエラー管理クラスに登録
	getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
	//処理終了
	return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * チェックエラー : 在庫数異常、在庫変更異常
	 * ・チェック正常 : 正常
	 * </pre>
	 * @param bodyList 棚卸在庫一括更新画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(InventoryBulkUpdateDto inventoryBulkUpdateDto) {
		// 登録されていないセンタがあるか
		TInventoryBDtoMapper mapper = new TInventoryBDtoMapper();
		List<TInventoryB> tInventoryBList = mapper.mappingToEntityList(inventoryBulkUpdateDto.data.body);

		// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana Start
		Set<String> addErrorMessageSet = new HashSet<String>();
		// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana End
		// チェック処理
		for (TInventoryB tInventoryB : tInventoryBList) {
			//商品・預託在庫区分・在庫区分・ロット・期限日単位で、SUM（選択された行の差異数） + 総在庫数＜ ０ の場合
//			if (tInventoryB.getSumDiffQty()+tInventoryB.getSumAdjQty()<0 ){
//				getErrorManager().add(this.errRetSts(StatusCode.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR), WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR);
//			}
			//棚卸前在庫数 <> 選択された行の現時点調整可能数の場合
			if (tInventoryB.getTStock()!=null && tInventoryB.getTStock().getChargeNum()!=null){
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				if (!WCC.isEqual(tInventoryB.getChargeNum(), tInventoryB.getTStock().getChargeNum())){
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
					// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana Start
					addBodyMessage(this.errRetSts(StatusCode.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_COUNT_DATA_CHANGED_ERROR), WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_COUNT_DATA_CHANGED_ERROR, addErrorMessageSet);
					continue;
					// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana End
				}
			}

			// [横並-198] 棚卸入力されていない行のチェックを追加 2014.11.24 kei Start
			if(CU.isNullOrEmpty(tInventoryB.getHistAddUser())){
				// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana Start
				addBodyMessage(this.errRetSts(StatusCode.INVENTORY_BULK_UPDATE_CANNOT_UPDATE_NOT_INVENTORY_INPUT_ERROR), WmsMessageConst.INVENTORY_BULK_UPDATE_CANNOT_UPDATE_NOT_INVENTORY_INPUT_ERROR, addErrorMessageSet);
				continue;
				// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana End
			}
			// [横並-198] 棚卸入力されていない行のチェックを追加 2014.11.24 kei End

			// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 Start
			// ===== 在庫調整データ取得=====
			// ===== 検索条件の設定 =====
			TStockCB cb = tStockBhv.newMyConditionBean();
			cb.setupSelect_MProduct();
			cb.setupSelect_MLocation();
			cb.setupSelect_MLocation().withMCenter();
			cb.setupSelect_MCustomer();
			cb.setupSelect_TStoreNo();
			cb.setupSelect_TStoreNo().withMCustomer();
	        cb.setupSelect_MStockType();
	        cb.setupSelect_TLot();
	        cb.setupSelect_TStoreNo().withTStoreNoSelf();
	        cb.setupSelect_MClient();
	        cb.setupSelect_MShape();
	        cb.setupSelect_MWarehouse();

	        // ===== 商品荷姿マスタの荷姿ID最大値 =====
			// [Ver3.0] unit of measure対応 2017.11.22 ライ DEL

	        // ===== 商品荷姿マスタの商品ID最大値 =====
	        cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
				public void query(MProductShapeCB subCB) {
					subCB.specify().columnProductId();
					setDelFlg(subCB);
				}
	        }, TStock.ALIAS_maxProductId);
	        if (tInventoryB != null && tInventoryB.getInventoryBId() != null && tInventoryB.getStockId() ==null){
				TInventoryB selectInventoryB  = new TInventoryB();
				TInventoryBCB selectCb = tInventoryBBhv.newMyConditionBean();

				selectCb.setupSelect_MProduct().withMClient();
				selectCb.setupSelect_MLocation();
				selectCb.setupSelect_MLocation().withMCenter();
				selectCb.setupSelect_MCustomerByDepositId();
				selectCb.setupSelect_MCustomerBySupplierId();
				selectCb.setupSelect_TStoreNo();
				selectCb.setupSelect_TStoreNo().withMCustomer();
				selectCb.setupSelect_MStockType();
				selectCb.setupSelect_TLot();
				selectCb.setupSelect_TStoreNo().withTStoreNoSelf();
				selectCb.setupSelect_MStockType();
				selectCb.setupSelect_MShape();
				selectCb.setupSelect_MWarehouse();
				selectCb.query().setInventoryBId_Equal(tInventoryB.getInventoryBId());
				selectInventoryB = tInventoryBBhv.selectEntity(selectCb);

    			//パラメータマスタ.入庫No.マージ区分の取得
    			MClientCenter conditionEntity = new MClientCenter();
    			conditionEntity.setClientId(selectInventoryB.getMProduct().getClientId());
    			conditionEntity.setCenterId(selectInventoryB.getMLocation().getCenterId());
    			MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);
    			MParam paramEntity = paramLogic.getUkEntityWithDeletedCheck(entity);

				// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana Start

    			// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana Start
				// 在庫をマージするかを判定
				CDef.StoreNoMergeFlg mergeFlg = stockUpdateCheckLogic.onsNumMergeCheck(paramEntity, selectInventoryB.getMProduct(), selectInventoryB.getMLocation());
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
				if (mergeFlg == CDef.StoreNoMergeFlg.$1) {
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
	    			// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana End

					// マージする場合、マージ先在庫の存在チェック (存在する場合は新規追加不可)

					TLot lot = selectInventoryB.getTLot();
					if (lot == null) {
						// 登録ロットの検索

						TLot lotCb = new TLot();
						lotCb.setProductId(selectInventoryB.getProductId());
						lotCb.setLot(selectInventoryB.getLot());
						lotCb.setLimitDt(selectInventoryB.getLimitDt());

						lot = lotLogic.getUkEntity(lotCb);
					}

					if (lot != null) {
						// ロット登録有り (ロットの登録がない場合は在庫は存在しないので在庫検索不要)

						// マージ先在庫検索
						StockSelectLotCondition.Builder lotCondition = StockSelectLotCondition.builder()
								.clientId(selectInventoryB.getMProduct().getClientId())
								.productId(selectInventoryB.getProductId())
								.stockTypeId(selectInventoryB.getStockTypeId())
								.locationId(selectInventoryB.getLocationId())
								.depositId(selectInventoryB.getDepositId())
								.lotId(lot.getLotId())
								.shapeId(selectInventoryB.getShapeId())
								.selectMerge(true);

						if (paramEntity.isStoreDtFlg$1()) {
							// 入庫日管理あり

							lotCondition.storeDt(selectInventoryB.getStoreDt());
						}

						List<TStock> stockList = stockSelectLogic.selectListByLot(lotCondition.build());

						if (0 < stockList.size()) {
							// 在庫が存在する場合はエラー

							// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana Start
							addBodyMessage(this.errRetSts(StatusCode.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR), WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR, addErrorMessageSet);
							continue;
							// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana End
						}
					}
				}

				// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana End

	        }
			// [ON推-品向-448] 入庫No.をマージする設定(パラメータマスタと商品マスタ両方で判断)設定で、在庫に同一のセンタ・荷主・ロケ・商品・預託・ロット・期限日・在庫区分・仕入先CDが無いかチェックを追加 2014.12.18 許 End
		}

		// 結果の設定
		return null;

	}

	/**
	 * <h2>棚卸在庫一括更新。</h2>
	 * <pre>
	 * 棚卸在庫一括更新を行う
	 * エラーがない場合は、データベースにゾーンマスタデータを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param inventoryBulkUpdateDto 棚卸在庫一括更新画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(InventoryBulkUpdateDto inventoryBulkUpdateDto) {
		// Entity変換
		TInventoryBDtoMapper mapper = new TInventoryBDtoMapper();
		List<TInventoryB> tInventoryBList = mapper.mappingToEntityList(inventoryBulkUpdateDto.data.body);

		this.setupInputCheck(inventoryBulkUpdateDto);

		TInventoryH  tInventoryH= new TInventoryH();
		tInventoryH=tInventoryBList.get(0).getTInventoryH();
     	inventoryAllInsUptLogic.insert(tInventoryH, tInventoryBList,errRetSts(StatusCode.STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_COUNT_DATA_CHANGED_ERROR));

		// 完了メッセージの設定
        // [ON推-品向-141] 更新時のメッセージを統一する。 2014.11.26 KI Start
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-141] 更新時のメッセージを統一する。 2014.11.26 KI End
		return null;
	}

	// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana Start
	/**
	 * 明細のエラーを登録(一度登録したメッセージは登録しない)
	 */
	private void addBodyMessage(ErrorStatus errSts, String messageCd, Set<String> addedMessageCdSet) {

		if (addedMessageCdSet.contains(messageCd)) {
			return;
		}

		addedMessageCdSet.add(messageCd);
		getErrorManager().add(errSts, messageCd);
	}
	// [#6934][OSS] 同じメッセージが行数分表示される問題を修正 2019.12.05 kawana End
}
