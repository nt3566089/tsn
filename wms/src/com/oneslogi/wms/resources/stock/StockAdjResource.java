package com.oneslogi.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.stock.StockAdjDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.InventoryUpdateLogic;
import com.oneslogi.wms.logic.stock.StockAdjustSelectLogic;
import com.oneslogi.wms.logic.stock.StockAdjustUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 *在庫調整のリソースクラス。
 */
@Path("/stock/stockAdj")
public class StockAdjResource extends AbstractWmsResource {

	// ===== 定数定義 =====

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
		 * 仕入先マスタ存在異常
		 */
		protected static final int SUPPLIER_NOT_FOUND = 2;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 3;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND = 4;
		/**
		 * 在庫調整データ取得異常
		 */
		protected static final int STOCK_SELECT_FAILED = 5;
		/**
		 * 在庫調整登録異常
		 */
		protected static final int STOCK_UPDATE_FAILED = 6;
		/**
		 * 棚卸データ更新登録異常
		 */
		protected static final int INVENTORY_UPDATE_FAILED = 7;
		/**
		 * 倉庫CDが同じでない
		 */
		protected static final int LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR = 8;
		/**
		 *預託在庫区分が存在異常
		 */
		protected static final int DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR = 9;
		// [検査-240] ロット期限日チェック追加 2014/12/08 KI Start
		/**
		 *ロット期限日異常
		 */
		protected static final int ADJ_LOT_LIMITDT_CHANGE_ERROR = 10;
		// [検査-240] ロット期限日チェック追加 2014/12/08 KI End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockAdjustSelectLogic selectLogic;
	@Inject
	private StockAdjustUpdateLogic updateLogic;
	@Inject
	private InventoryUpdateLogic inventoryUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private TInventoryBBhv tInventoryBhv;
	// [#2799][Ver3.0] unit of measure 対応 商品荷姿Bhv削除 2017.11.13 honma Delete
	@Inject
	private MLocationBhv mLocationBhv;
	// [Ver3.0] unit of measure対応 2017.11.27 ライ END
	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockAdjDto 在庫調整画面用DTO
	 */
	@GET
	@Path("/initNew")
	public StockAdjDto initNew() {

		// 画面用DTO作成
		StockAdjDto stockAdjDto = new StockAdjDto();
		return stockAdjDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫調整データ取得取り出し
	 * ・在庫調整画面用DTOに設定
	 * </pre>
	 * @param stockId      在庫ID
	 * @param inventoryId  棚卸ボディID
	 * @return StockAdjDto 在庫調整画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public StockAdjDto initUpdate(@QueryParam("stockId") Long stockId ,@QueryParam("inventoryId") Long inventoryId) {

		// ===== 在庫調整データ取得の検索データ編集 =====
		TInventoryB tb = new TInventoryB();
		tb.setStockId(stockId);
		tb.setInventoryBId(inventoryId);

		// ===== 在庫調整データ取得メソッドを呼出し  =====
		TStock selectEntity = selectLogic.select(null,null,null,null,null,tb, errRetSts(StatusCode.STOCK_SELECT_FAILED));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStockDto selectDto = mapper.mappingToDto(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		StockAdjDto stockAdjDto = new StockAdjDto();
		stockAdjDto.data.head = selectDto;

		return stockAdjDto;
	}

	/**
	 * <h2>確定後在庫データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫調整データ取得取り出し
	 * ・在庫調整画面用DTOに設定
	 * </pre>
	 * @param  stockAdjDto 在庫調整画面用DTO
	 * @return StockAdjDto 在庫調整画面用DTO
	 */
	@GET
	@Path("/select")
	public StockAdjDto select(StockAdjDto stockAdjDto) {

		boolean bln = false;
		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStock = mapper.mappingToEntity(stockAdjDto.data.head);

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStock.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		if(mClient != null){
			tStock.setClientId(mClient.getClientId());
		}

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStock.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if(mCenter != null){
			tStock.getMLocation().setCenterId(mCenter.getCenterId());
		}

		// ===== 仕入先ID取得と取引先ID設定 =====
		if(tStock.getTStoreNo() != null){
			if(tStock.getTStoreNo().getMCustomer() != null){
				String suppliedCd = tStock.getTStoreNo().getMCustomer().getCustomerCd();
				MCustomer mCustomer =null;
				if (!(CommonUtil.isNullOrEmpty(suppliedCd))){
					mCustomer = new MCustomer();
					mCustomer.setCustomerCd(suppliedCd);
					mCustomer.setClientId(mClient.getClientId());
					mCustomer = customerLogic.getUkEntity(mCustomer);
					if(mCustomer != null && mCustomer.isVendorFlg$1()){
						tStock.getTStoreNo().getMCustomer().setCustomerId(mCustomer.getCustomerId());
						tStock.getTStoreNo().setSupplierId(mCustomer.getCustomerId());
					}else{
						// 仕入先マスタがない場合の確認メッセージを設定
						getErrorManager().add(this.errRetSts(StatusCode.SUPPLIER_NOT_FOUND), WmsMessageConst.SUPPLIER_NOT_FOUND_ERROR);
						bln = true ;
					}
				}
			}
		}

		// ===== ロケーションCd取得とロケーションID設定 =====
		String locationCd = tStock.getMLocation().getLocationCd();
		MLocation mLocation = null;
		if (!(CommonUtil.isNullOrEmpty(locationCd))){
			mLocation = new MLocation();
			mLocation.setLocationCd(locationCd);
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation = locationLogic.getUkEntity(mLocation);
			if(mLocation != null){

				// 倉庫CD同じでないの場合
				MLocationCB cb = mLocationBhv.newMyConditionBean();
				cb.setupSelect_MZone().withMWarehouse();
				cb.query().setLocationId_Equal(mLocation.getLocationId());
				List<MLocation> mLocationWarehouse = mLocationBhv.selectList(cb);
				if(mLocationWarehouse.size() != 0){
					if (!CU.isNullOrEmpty(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd()) && !CU.isNullOrEmpty(tStock.getMWarehouse().getWarehouseCd())) {
					    if (!CU.equals(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd(),tStock.getMWarehouse().getWarehouseCd())) {
					    	getErrorManager().add(this.errRetSts(StatusCode.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR), WmsMessageConst.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR);
					    	bln = true ;
					    }
				    }
				}

				if (bln != true){
					tStock.setLocationId(mLocation.getLocationId());
					// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei Start
					tStock.setMLocation(mLocation) ;
					tStock.getMLocation().setMCenter(mCenter);
					// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei End
				}

			}else{
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 商品Cd取得と商品ID設定 =====
		String porductCd = tStock.getMProduct().getProductCd();
		MProduct mProduct = null ;
		if (!(CommonUtil.isNullOrEmpty(porductCd))){
			mProduct = new MProduct();
			mProduct.setProductCd(porductCd);
			mProduct.setClientId(mClient.getClientId());
			mProduct = productLogic.getUkEntity(mProduct);
			if(mProduct != null){
				tStock.setProductId(mProduct.getProductId());
				// [#2799][Ver3.0] unit of measure 対応 2017.12.05 honma Add Start
				mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
				// [#2799][Ver3.0] unit of measure 対応 2017.12.05 honma Add End
				// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei Start
				tStock.setMProduct(mProduct);
				// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.01 kei End
			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 倉庫Cd取得と倉庫ID設定 =====
		String warehouseCd = tStock.getMWarehouse().getWarehouseCd();
		MWarehouse mWarehouse = null;
		if (!(CommonUtil.isNullOrEmpty(warehouseCd))){
			mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			if(mWarehouse != null){
				tStock.setWarehouseId(mWarehouse.getWarehouseId());
			}
		}

		// ===== 取引先Cd取得と預託ID設定 =====
		String customerCd = String.valueOf(tStock.getMCustomer().getCustomerCd());
		MCustomer mCustomer1 = null;
		if (!(CommonUtil.isNullOrEmpty(customerCd))){
			mCustomer1 = new MCustomer();
			mCustomer1.setCustomerCd(customerCd);
			mCustomer1.setClientId(mClient.getClientId());
			mCustomer1 = customerLogic.getUkEntity(mCustomer1);
			if(mCustomer1 != null){
				tStock.setDepositId(mCustomer1.getCustomerId());
			}else{
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD START
				//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				bln = true ;
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD END
			}
		}

		// ===== 在庫区分Cd取得と在庫区分ID設定 =====
		String stockTypeCd = tStock.getMStockType().getStockTypeCd();
		MStockType mStockType = null;
		if (!(CommonUtil.isNullOrEmpty(stockTypeCd))){
			mStockType = new MStockType();
			mStockType.setStockTypeCd(stockTypeCd);
//			mStockType.setClientId(mClient.getClientId());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if(mStockType != null){
				tStock.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		if(bln == true){
			// ===== 処理中止 =====
			return null;
		}

        // ===== 在庫調整データ取得メソッドを呼出し =====
		TStock selectEntity = selectLogic.select(tStock,tStock.getMWarehouse(),tStock.getMCustomer(),tStock.getTLot(),tStock.getTStoreNo(),null, errRetSts(StatusCode.STOCK_SELECT_FAILED));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.02 kei Start
		if(selectEntity == null){
			tStock.setChargeNum(WCC.ZERO);
			selectEntity = tStock;
		}
		// [ON推-品向-229] 在庫調整モード判定カルチャを追加 2014.12.02 kei End

		// [ON推-品向-229] 在庫調整モード判定カルチャを削除 2014.12.02 kei

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper1 = new TStockDtoMapper();
		TStockDto selectDto = mapper1.mappingToDto(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		StockAdjDto stockAdjDto1 = new StockAdjDto();
		stockAdjDto1.data.head = selectDto;

		return stockAdjDto1;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 入力データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・商品マスタ存在チェックエラー用メッセージ
	 * ・ロット期限日チェックエラー用メッセージ
	 * ・仕入先マスタ存在チェックエラー用メッセージ
	 * ・ロケーションマスタ存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param stockAdjDto 在庫調整画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckUpdate")
	public StatusDto inputCheckUpdate(StockAdjDto stockAdjDto) {

		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH th =new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		TMoveInstB tb =new TMoveInstB();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(stockAdjDto,th,tb);

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>在庫調整登録。</h2>
	 * <pre>
	 * 在庫調整登録データの組み立てを行う
	 * エラーがない場合は、在庫調整データを登録し、完了メッセージを設定する
	 *
	 * 登録データに次の値を設定する。
	 * ・処理区分マスタ
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 * </pre>
	 * @param  stockAdjDto 在庫調整画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(StockAdjDto stockAdjDto) {

		// ===== 登録データ組み立て =====
		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH th =new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		TMoveInstB tb =new TMoveInstB();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(stockAdjDto,th,tb);

		// ===== 処理区分マスタCDCd取得と処理区分マスタID設定 =====
		String processtypeCd = stockAdjDto.data.head.getProcessTypeCd();
		MProcessType mProcessType = null ;
		if (!(CommonUtil.isNullOrEmpty(processtypeCd))){
		    mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(processtypeCd);
			mProcessType = processTypeLogic.getUkEntity(mProcessType);
			th.setProcessTypeId(mProcessType.getProcessTypeId());
		}

		// ===== 在庫調整登録 =====
		updateLogic.update(mProcessType, th, tb, errRetSts(StatusCode.STOCK_UPDATE_FAILED));

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== 棚卸ボディID<>NULLの場合 =====
		if (stockAdjDto.data.body.getInventoryBId() != null){
			// ===== 棚卸ボディID =====
			String strInventoryBId = String.valueOf(stockAdjDto.data.body.getInventoryBId());

			// ===== 検索条件の設定 =====
			TMoveInstH tMoveInstH =new TMoveInstH();
			tMoveInstH.setMoveInstHId(th.getMoveInstHId());

			// ===== 棚卸ボディ =====
			TInventoryB tInventoryB =new TInventoryB();
			TInventoryBCB cb = tInventoryBhv.newMyConditionBean();
			cb.query().setInventoryBId_Equal(Long.valueOf(strInventoryBId));
			tInventoryB = tInventoryBhv.selectEntity(cb);

			// ===== 棚卸データ更新登録.棚卸データ更新登録メソッドを呼出し =====
			inventoryUpdateLogic.update(tInventoryB, tMoveInstH, errRetSts(StatusCode.INVENTORY_UPDATE_FAILED));

			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
		}

		// ===== 完了メッセージの設定 =====
		// [ON推-品向-137] 更新時のメッセージを統一する。 2014.11.26 KI Start
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-137] 更新時のメッセージを統一する。 2014.11.26 KI End

		return null;

	}

	/**
	 * <h2>在庫調整登録データの組み立て。</h2>
	 * <pre>
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 *  【在庫移動指示ヘッダ】
	 *  ・荷主ID
	 *  ・センタID
	 *  【在庫移動指示ボディ】
	 *  ・商品ID
	 *  ・ロケーションID
	 *  ・仕入先ID（仕入先CDが入力されているときのみ）
	 * 次の場合、エラーとして扱い、エラーステータス、エラーメッセージCDを設定する
	 *  【エラー条件】
	 *  ・商品マスタに存在しない
	 *  ・ロケーションマスタに存在しない
	 *  ・取引先マスタに存在しない
	 * 戻り値を下記のように設定する
	 * チェックエラー : 商品マスタ存在異常、仕入先マスタ存在異常、ロケーションマスタ存在異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param stockAdjDto 在庫調整画面用DTO
	 * @param header      在庫移動指示ヘッダ
	 * @param body        在庫移動指示ボディ
	 * @return StatusDto 処理結果DTO
	 */
	public StatusDto registerCheck(StockAdjDto stockAdjDto ,TMoveInstH header ,TMoveInstB body) {

		boolean bln = false;
		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStock = mapper.mappingToEntity(stockAdjDto.data.head);

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStock.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStock.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		// ===== 仕入先ID取得と取引先ID設定 =====
		if(tStock.getTStoreNo() != null){
			if(tStock.getTStoreNo().getMCustomer() != null){
				String suppliedCd = tStock.getTStoreNo().getMCustomer().getCustomerCd();
				MCustomer mCustomer =null;
				if (!(CommonUtil.isNullOrEmpty(suppliedCd))){
					mCustomer = new MCustomer();
					mCustomer.setCustomerCd(suppliedCd);
					mCustomer.setClientId(mClient.getClientId());
					mCustomer = customerLogic.getUkEntity(mCustomer);
					if(mCustomer != null){
						tStock.getTStoreNo().getMCustomer().setCustomerId(mCustomer.getCustomerId());
					}else{
						// 仕入先マスタがない場合の確認メッセージを設定
						getErrorManager().add(this.errRetSts(StatusCode.SUPPLIER_NOT_FOUND), WmsMessageConst.SUPPLIER_NOT_FOUND_ERROR);
						bln = true ;
					}
				}
			}
		}

		// ===== ロケーションCd取得とロケーションID設定 =====
		String locationCd = tStock.getMLocation().getLocationCd();
		MLocation mLocation = null;
		if (!(CommonUtil.isNullOrEmpty(locationCd))){
			mLocation = new MLocation();
			mLocation.setLocationCd(locationCd);
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation = locationLogic.getUkEntity(mLocation);
			if(mLocation != null){
				tStock.setLocationId(mLocation.getLocationId());
				body.setLocationId(mLocation.getLocationId());
			}else{
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 商品Cd取得と商品ID設定 =====
		String porductCd = tStock.getMProduct().getProductCd();
		MProduct mProduct = null ;
		if (!(CommonUtil.isNullOrEmpty(porductCd))){
			mProduct = new MProduct();
			mProduct.setProductCd(porductCd);
			mProduct.setClientId(mClient.getClientId());
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
//			mProduct = productLogic.getUkEntity(mProduct);
			mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End
			if(mProduct != null){
				tStock.setProductId(mProduct.getProductId());
				body.setProductId(mProduct.getProductId());

				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
				// ===== 商品荷姿ID設定 =====
				// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
				if(mProduct.getMProductShapeList().size() != 0){
					tStock.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getShapeId());
					body.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getShapeId());
				}
				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End

			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true ;
			}
			// [検査-240] ロット期限日チェック追加 2014/12/08 KI Start
			if (mProduct != null){
			if ((tStock.getTLot().getLot() == null && mProduct.getLotManagFlg().equals("1")) ||
					(tStock.getTLot().getLot() != null && mProduct.getLotManagFlg().equals("0")) ||
					(tStock.getTLot().getLimitDt() == null && mProduct.getLimitDtManagFlg().equals("1")) ||
					(tStock.getTLot().getLimitDt() != null && mProduct.getLimitDtManagFlg().equals("0"))){
				// ロット、期限日変更場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.ADJ_LOT_LIMITDT_CHANGE_ERROR), WmsMessageConst.STOCK_ADJUSTMENT_CANNOT_REGISTER_LOT_LIMIT_DT_FLG_CHANGED_ERROR);

				bln = true ;
		 	  }
			}
			// [検査-240] ロット期限日チェック追加 2014/12/08 KI End
		}

		// ===== 倉庫情報取得と倉庫ID設定 =====
		//[ON推-品向-1090]修正対応 2016.4.15 chou Mod Start
		MWarehouse mWarehouse = null;

		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MZone().withMWarehouse();
		cb.query().setLocationId_Equal(mLocation.getLocationId());
		List<MLocation> mLocationList = mLocationBhv.selectList(cb);

		if (mLocationList.size() != 0) {
			mWarehouse = mLocationList.get(0).getMZone().getMWarehouse();

			if (mWarehouse != null) {
				tStock.setWarehouseId(mWarehouse.getWarehouseId());
				body.setWarehouseId(mWarehouse.getWarehouseId());
			}else {
				mWarehouse = new MWarehouse();
			}
		}
		//[ON推-品向-1090]修正対応 2016.4.15 chou Mod End

		// ===== 取引先Cd取得と預託ID設定 =====
		String customerCd = String.valueOf(tStock.getMCustomer().getCustomerCd());
		MCustomer mCustomer1 = null;
		if (!(CommonUtil.isNullOrEmpty(customerCd))){
			mCustomer1 = new MCustomer();
			mCustomer1.setCustomerCd(customerCd);
			mCustomer1.setClientId(mClient.getClientId());
			mCustomer1 = customerLogic.getUkEntity(mCustomer1);
			if(mCustomer1 != null){
				tStock.setDepositId(mCustomer1.getCustomerId());
				body.setDepositId(mCustomer1.getCustomerId());
			}else{
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD START
				//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				bln = true ;
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD END
			}
		}

		// ===== 在庫区分Cd取得と在庫区分ID設定 =====
		String stockTypeCd = tStock.getMStockType().getStockTypeCd();
		MStockType mStockType = null;
		if (!(CommonUtil.isNullOrEmpty(stockTypeCd))){
			mStockType = new MStockType();
			mStockType.setStockTypeCd(stockTypeCd);
//			mStockType.setClientId(mClient.getClientId());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if(mStockType != null){
				tStock.setStockTypeId(mStockType.getStockTypeId());
				body.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		if(bln == true){
			return null;
		}

//		 // ===== 在庫調整データ取得メソッドを呼出し =====
//		TStock selectEntity = selectLogic.select(tStock,tStock.getMWarehouse(),tStock.getMCustomer(),tStock.getTLot(),tStock.getTStoreNo(),null, errRetSts(StatusCode.STOCK_SELECT_FAILED));
//		// ===== エラーが存在する場合 =====
//		if (0 < getErrorManager().size()) {
//			// ===== 処理中止 =====
//			return null;
//		}
//
//		if(selectEntity == null){
//			if(tStock.getStockId() == null){
//				if(tStock.getTStoreNo() != null){
//					if(tStock.getTStoreNo().getStoreLabelNo() != null){
//						this.getErrorManager().add(errRetSts(StatusCode.STOCK_SELECT_FAILED), WmsMessageConst.ONS_LABEL_NUMBER_NOT_FOUND_IN_STOCK_INFORMATION_ERROR);
//						return null;
//					}
//				}
//			}
//		}

		// ===== 在庫移動指示ボディデータ組み立て =====
		body.setStoreNoId(tStock.getStoreNoId());
		body.setLotId(tStock.getLotId());
		// [エンハンス PH2.0] 入庫日の設定を追加する 2015.11.30 sja Start
		body.setStoreDt(tStock.getTStoreNo().getStoreDt());
		// [エンハンス PH2.0] 入庫日の設定を追加する 2015.11.30 sja End

		// ===== 画面の在庫情報がheaderとbodyに設定する =====
		header.setInputType_$00();
		header.setMoveInstStatus_$00();

		// ===== 処理区分マスタCDCd取得と処理区分マスタID設定 =====
		String processtypeCd = stockAdjDto.data.head.getProcessTypeCd();
		MProcessType mProcessType = null ;
		if (!(CommonUtil.isNullOrEmpty(processtypeCd))){
		    mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(processtypeCd);
			mProcessType = processTypeLogic.getUkEntity(mProcessType);
			header.setProcessTypeId(mProcessType.getProcessTypeId());
		}

		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start
		// ===== 荷姿IDを取得 =====
		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(mClient.getClientId());
		clientCenter.setCenterId(mCenter.getCenterId());
		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja End

		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(header.getClientId());
		mClientCenter.setCenterId(header.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
		String inst_Dt = "";
		try {
			inst_Dt = CommonUtil.dateToString(CommonUtil.stringToDate(mClientCenter.getSystemDt()));
			header.setInstDt(inst_Dt);
		} catch (Exception e) {
			getErrorManager().throwException(e);
		}

		// WMS在庫移動伝票No.を登録する直前に採番
		String moveSlipNo = numberingCenterLogic.getNumbering(header.getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);
		header.setMoveSlipNo(moveSlipNo);

		header.setMoveInstComment(tStock.getInstComment());
		// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana Start
		switch (CDef.ProcessTypeCd.codeOf(processtypeCd)) {
		case $23:
			body.setInoutType_$1();
			break;
		case $24:
			body.setInoutType_$0();
			break;
		default:
			getErrorManager().throwException(new IllegalStateException("ProcessTypeCd is illegal."));
			return null;
		}
		// [ON推-品向-1132] 在庫調整(-)の時の入出庫区分を出庫に変更 2016.04.20 kawana End
		//[ON推-品向-1090]修正対応 2016.4.15 chou Mod Start
		body.setWarehouseCd(mWarehouse.getWarehouseCd());
		//[ON推-品向-1090]修正対応 2016.4.15 chou Mod End
		body.setProductCd(tStock.getMProduct().getProductCd());
		body.setStockTypeCd(tStock.getMStockType().getStockTypeCd());
		body.setLocationCd(tStock.getMLocation().getLocationCd());
		body.setDepositCd(tStock.getMCustomer().getCustomerCd());
		if(tStock.getTLot() != null){
			body.setLot(tStock.getTLot().getLot());
			body.setLimitDt(tStock.getTLot().getLimitDt());
		}

		if(tStock.getTStoreNo() != null){
			body.setStoreLabelNo(tStock.getTStoreNo().getStoreLabelNo());
			if(tStock.getTStoreNo().getMCustomer() != null){
				body.setSupplierCd(tStock.getTStoreNo().getMCustomer().getCustomerCd());
				body.setSupplierId(tStock.getTStoreNo().getMCustomer().getCustomerId());
			}
		}
		body.setUnitNum(tStock.getUnitNum());
		body.setInstNum(tStock.getAdjNum());

		return null;
	}
}
