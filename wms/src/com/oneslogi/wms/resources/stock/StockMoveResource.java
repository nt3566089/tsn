package com.oneslogi.wms.resources.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.dto.stock.StockMoveDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.StockDataSelectLogic;
import com.oneslogi.wms.logic.stock.StockMoveSelectChargeNumLogic;
import com.oneslogi.wms.logic.stock.StockMoveSelectLogic;
import com.oneslogi.wms.logic.stock.StockMoveUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 *在庫移動のリソースクラス。
 */
@Path("/stock/stockMove")
public class StockMoveResource extends AbstractWmsResource {

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
		 * 元ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_F_NOT_FOUND = 4;
		/**
		 * 先ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_T_NOT_FOUND = 5;
		/**
		 * 在庫移動データ取得異常
		 */
		protected static final int STOCK_SELECT_FAILED = 6;
		/**
		 * 在庫移動登録異常
		 */
		protected static final int STOCK_UPDATE_FAILED = 7;
		/**
		 * 在庫数データ取得異常
		 */
		protected static final int STOCK_DATA_SELECT_FAILED = 8;
		/**
		 * 倉庫CDが同じでない
		 */
		protected static final int LOCATION_DATA_F_IN_WAREHOUSE_NOT_FOUND_ERROR = 9;
		/**
		 * 倉庫CDが同じでない
		 */
		protected static final int LOCATION_DATA_T_IN_WAREHOUSE_NOT_FOUND_ERROR = 10;

		/**
		 *預託在庫区分が存在異常
		 */
		protected static final int DEPOSIT_STOCK_CLASS_F_NOT_FOUND_ERROR = 11;
		/**
		 *預託在庫区分が存在異常
		 */
		protected static final int DEPOSIT_STOCK_CLASS_T_NOT_FOUND_ERROR = 12;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockMoveSelectLogic selectLogic;
	@Inject
	private StockMoveSelectChargeNumLogic stockMoveSelectChargeNumLogic;
	@Inject
	private StockDataSelectLogic stockDataSelectLogic;
	@Inject
	private StockMoveUpdateLogic updateLogic;
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
	private MProductBhv mProductBhv;
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	@Inject
	private MWarehouseBhv mWarehouseBhv;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja Start
	// [Ver3.0] unit of measure対応 2017.11.28 ライ END
	// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja End
	// [C-CWMS-50] 補充管理件対応 nayzaw Start
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	// [C-CWMS-50] 補充管理件対応 nayzaw End
	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockMoveDto 在庫移動画面用DTO
	 */
	@GET
	@Path("/initNew")
	public StockMoveDto initNew() {

		// 画面用DTO作成
		StockMoveDto stockMoveDto = new StockMoveDto();

		return stockMoveDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫移動データ取得取り出し
	 * ・在庫移動画面用DTOに設定
	 * </pre>
	 * @param stockId       在庫ID
	 * @return stockMoveDto 在庫移動画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public StockMoveDto initUpdate(@QueryParam("stockId") Long stockId) {

		// ===== 在庫移動データ取得の検索データ編集 =====
		TStock tb = new TStock();
		tb.setStockId(stockId);

		// ===== 在庫移動データ取得メソッドを呼出し   =====
		TStock selectEntity = selectLogic.select(tb,null,null,null,null, errRetSts(StatusCode.STOCK_SELECT_FAILED));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStockDto selectDto = mapper.mappingToDto(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		StockMoveDto stockMoveDto = new StockMoveDto();
		stockMoveDto.data.fromDto = selectDto;

		return stockMoveDto;
	}

	/**
	 * <h2>確定後在庫データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫移動データ取得取り出し
	 * ・在庫移動画面用DTOに設定
	 * </pre>
	 * @param  stockMoveDto 在庫調整画面用DTO
	 * @return StockMoveDto 在庫調整画面用DTO
	 */
	@GET
	@Path("/select")
	public StockMoveDto select(StockMoveDto stockMoveDto) {

		boolean bln = false ;

		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStockFrom = mapper.mappingToEntity(stockMoveDto.data.fromDto);

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStockFrom.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		if(mClient != null){
			tStockFrom.setClientId(mClient.getClientId());
		}

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStockFrom.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if(mCenter != null){
			tStockFrom.getMLocation().getMCenter().setCenterId(mCenter.getCenterId());
		}

		// ===== 仕入先ID取得と取引先ID設定 =====
		if(tStockFrom.getTStoreNo().getMCustomer() != null){
			String suppliedCd = tStockFrom.getTStoreNo().getMCustomer().getCustomerCd();
			MCustomer mCustomer =null;
			if (!(CommonUtil.isNullOrEmpty(suppliedCd))){
				mCustomer = new MCustomer();
				mCustomer.setCustomerCd(suppliedCd);
				mCustomer.setClientId(mClient.getClientId());
				mCustomer = customerLogic.getUkEntity(mCustomer);
				if(mCustomer != null){
					tStockFrom.getTStoreNo().getMCustomer().setCustomerId(mCustomer.getCustomerId());
				}else{
					// 仕入先マスタがない場合の確認メッセージを設定
					getErrorManager().add(this.errRetSts(StatusCode.SUPPLIER_NOT_FOUND), WmsMessageConst.SUPPLIER_NOT_FOUND_ERROR);
					bln = true ;
				}
			}
		}

		// ===== ロケーションCd取得とロケーションID設定 =====
		String locationCd = tStockFrom.getMLocation().getLocationCd();
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
					if (!CU.isNullOrEmpty(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd()) && !CU.isNullOrEmpty(tStockFrom.getMWarehouse().getWarehouseCd())) {
					    if (!CU.equals(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd(),tStockFrom.getMWarehouse().getWarehouseCd())) {
					    	getErrorManager().add(this.errRetSts(StatusCode.LOCATION_DATA_F_IN_WAREHOUSE_NOT_FOUND_ERROR), WmsMessageConst.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR);
					    	bln = true ;
					    }
				    }
				}
				if (bln != true ){
					tStockFrom.setLocationId(mLocation.getLocationId());
				}

			}else{
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_F_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 商品Cd取得と商品ID設定 =====
		String porductCd = tStockFrom.getMProduct().getProductCd();
		MProduct mProduct = null ;
		if (!(CommonUtil.isNullOrEmpty(porductCd))){
			mProduct = new MProduct();
			mProduct.setProductCd(porductCd);
			mProduct.setClientId(mClient.getClientId());
			mProduct = productLogic.getUkEntity(mProduct);
			if(mProduct != null){
				tStockFrom.setProductId(mProduct.getProductId());
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 倉庫Cd取得と倉庫ID設定 =====
		String warehouseCd = tStockFrom.getMWarehouse().getWarehouseCd();
		MWarehouse mWarehouse = null;
		if (!(CommonUtil.isNullOrEmpty(warehouseCd))){
			mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			if(mWarehouse != null){
				tStockFrom.setWarehouseId(mWarehouse.getWarehouseId());
			}
		}

		// ===== 取引先Cd取得と預託ID設定 =====
		String customerCd = tStockFrom.getMCustomer().getCustomerCd();
		MCustomer mCustomer1 = null;
		if (!(CommonUtil.isNullOrEmpty(customerCd))){
			mCustomer1 = new MCustomer();
			mCustomer1.setCustomerCd(customerCd);
			mCustomer1.setClientId(mClient.getClientId());
			mCustomer1 = customerLogic.getUkEntity(mCustomer1);
			if(mCustomer1 != null){
				tStockFrom.setDepositId(mCustomer1.getCustomerId());
			}else{
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
				//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_F_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				bln = true ;
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
			}
		}

		// ===== 在庫区分Cd取得と在庫区分ID設定 =====
		String stockTypeCd = tStockFrom.getMStockType().getStockTypeCd();
		MStockType mStockType = null;
		if (!(CommonUtil.isNullOrEmpty(stockTypeCd))){
			mStockType = new MStockType();
			mStockType.setStockTypeCd(stockTypeCd);
//			mStockType.setClientId(mClient.getClientId());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if(mStockType != null){
				tStockFrom.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		if(bln == true){
			// ===== 処理中止 =====
			return null;
		}

        // ===== 在庫移動データ取得メソッドを呼出し =====
		TStock selectEntity = selectLogic.select(tStockFrom,tStockFrom.getMLocation().getMCenter(),tStockFrom.getMCustomer(),tStockFrom.getTLot(),tStockFrom.getTStoreNo(),errRetSts(StatusCode.STOCK_SELECT_FAILED));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper1 = new TStockDtoMapper();
		TStockDto selectDtoFrom = mapper1.mappingToDto(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		StockMoveDto stockMoveDtoFrom = new StockMoveDto();
		stockMoveDtoFrom.data.fromDto = selectDtoFrom;

		return stockMoveDtoFrom;
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
	 * @param stockMoveDto 在庫調整画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckUpdate")
	public StatusDto inputCheckUpdate(StockMoveDto stockMoveDto) {

		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH header =new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		List<TMoveInstB> bodyList =new ArrayList<TMoveInstB>();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(stockMoveDto,header,bodyList);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>在庫移動登録。</h2>
	 * <pre>
	 * 在庫移動登録データの組み立てを行う
	 * エラーがない場合は、在庫移動データを登録し、完了メッセージを設定する
	 *
	 * 登録データに次の値を設定する
	 * ・処理区分マスタ
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 * </pre>
	 * @param  stockMoveDto 在庫調整画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
    public StatusDto register(StockMoveDto stockMoveDto) {

		// ===== 登録データ組み立て =====
		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH header =new TMoveInstH();
		// ===== 在庫移動指示ボディ =====
		List<TMoveInstB> bodyList =new ArrayList<TMoveInstB>();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(stockMoveDto,header,bodyList);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStockFrom = mapper.mappingToEntity(stockMoveDto.data.fromDto);
		long lonStockId  = tStockFrom.getStockId();
		tStockFrom.setStockId(null);
		// ===== 在庫移動データ取得メソッドを呼出し =====
		TStock selectEntity = selectLogic.select(tStockFrom,tStockFrom.getMLocation().getMCenter(),tStockFrom.getMCustomer(),tStockFrom.getTLot(),tStockFrom.getTStoreNo(),errRetSts(StatusCode.STOCK_SELECT_FAILED));

		//◇【品質】問題点指摘票(新ソリ＿横並び確認)-176 2014/11/14 ADD START
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		//◇【品質】問題点指摘票(新ソリ＿横並び確認)-176 2014/11/14 ADD END

		if(selectEntity.getRowCount() >1){
			getErrorManager().add(this.errRetSts(StatusCode.STOCK_SELECT_FAILED), WmsMessageConst.DATA_PLURAL_FOUND_ERROR);
			return null;
		}
		tStockFrom.setStockId(lonStockId);

		// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana Start
		//[1.1.4-CT-096] ロケーションID、商品ID単位で全数移動チェック 2016.6.17 nayzaw Start
		//全数移動確認
		boolean isAllMove = stockUpdateCheckLogic.isAllShippingProduct(bodyList.get(0));
		//[1.1.4-CT-096] ロケーションID、商品ID単位で全数移動チェック 2016.6.17 nayzaw End
		// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana End

		// ===== 在庫移動登録 =====
		updateLogic.update(bodyList, header, errRetSts(StatusCode.STOCK_UPDATE_FAILED));

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// [C-CWMS-0050] 全数在庫移動件対応 2016.2.16 nayzaw Start

		TMoveInstB moveFrom = bodyList.get(0);
		TMoveInstB moveTo = bodyList.get(1);

		if(!CU.isNotNullAndEquals(moveFrom.getLocationId(), moveTo.getLocationId())){

			MClientCenter clientCenter = selectLogic.getClientCenterInfo(header.getClientId(), header.getCenterId());

			// [Ver3.0] unit of measure対応 2017.11.27 ライ DEL
			//在庫移動実績ボディ作成
			TMoveRecordB recordBody = new TMoveRecordB();
			recordBody.setMoveInstHId(header.getMoveInstHId());
			recordBody.setMoveInstBId(moveFrom.getMoveInstBId());
			recordBody.setProcessNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.PROCESS_NO));
			recordBody.setLocationId(moveFrom.getLocationId());
			recordBody.setMoveDt(clientCenter.getSystemDt());
			recordBody.setMoveNum(moveFrom.getInstNum());

			if(isAllMove){
				//全数移動の場合ロケーションマスタの補充データ更新
				updateLogic.updateLocationReplenishData(moveFrom, moveTo, recordBody);
			}
		}

		// [C-CWMS-0050] 全数在庫移動件対応 2016.2.16 nayzaw End

		// ===== 完了メッセージの設定 =====
		// [ON推-品向-139] 更新時のメッセージを統一する。 2014.11.26 KI Start
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-139] 更新時のメッセージを統一する。 2014.11.26 KI End

		return null;
	}

	/**
	 * <h2>在庫移動登録データの組み立て。</h2>
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
	 * @param stockMoveDto 在庫移動画面用DTO
	 * @param header       在庫移動指示ヘッダ
	 * @param bodyList     在庫移動指示ボディリスト
	 * @return StatusDto 処理結果DTO
	 */
	public StatusDto registerCheck(StockMoveDto stockMoveDto ,TMoveInstH header ,List<TMoveInstB> bodyList) {

		boolean bln = false;

		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStockFrom   = mapper.mappingToEntity(stockMoveDto.data.fromDto);
		TStock tStockTo     = mapper.mappingToEntity(stockMoveDto.data.toDto);
		TMoveInstB bodyFrom = new TMoveInstB();
		TMoveInstB bodyTo   = new TMoveInstB();

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStockFrom.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStockFrom.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		// ===== ロケーションCd取得とロケーションID設定 =====
		String locationCd = tStockFrom.getMLocation().getLocationCd();
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
					if (!CU.isNullOrEmpty(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd()) && !CU.isNullOrEmpty(tStockFrom.getMWarehouse().getWarehouseCd())) {
					    if (!CU.equals(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd(),tStockFrom.getMWarehouse().getWarehouseCd())) {
					    	getErrorManager().add(this.errRetSts(StatusCode.LOCATION_DATA_F_IN_WAREHOUSE_NOT_FOUND_ERROR), WmsMessageConst.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR);
					    	bln = true ;
					    }
				    }
				}
				if (bln != true ){
					bodyFrom.setLocationId(mLocation.getLocationId());
				}

			}else{
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_F_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 在庫移動指示ボディデータ組み立て =====
		// ===== 商品マスタ =====
		String porductCd = tStockFrom.getMProduct().getProductCd();
		MProduct mProduct = null ;
		if (!(CommonUtil.isNullOrEmpty(porductCd))){
			mProduct = new MProduct();
			mProduct.setProductCd(porductCd);
			mProduct.setClientId(mClient.getClientId());
			// [Ver3.0] unit of measure対応 2017.11.27 ライ START
			//mProduct = productLogic.getUkEntity(mProduct);
			mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
			// [Ver3.0] unit of measure対応 2017.11.27 ライ END
			if(mProduct != null){
				bodyFrom.setProductId(mProduct.getProductId());
				bodyTo.setProductId(mProduct.getProductId());
			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true ;
			}
			// [Ver3.0] unit of measure対応 2017.11.27 ライ START
			if(mProduct.getMProductShapeList().size() != 0){
				bodyFrom.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getShapeId());
				bodyTo.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getShapeId());
			}
		}   // [Ver3.0] unit of measure対応 2017.11.27 ライ END

		// ===== ロケーションマスタ先の存在チェック =====
		MLocationCB cbLoc_T = mLocationBhv.newMyConditionBean();
		cbLoc_T.query().setCenterId_Equal(mCenter.getCenterId());
		cbLoc_T.query().setLocationCd_Equal(tStockTo.getMLocation().getLocationCd());
		List<MLocation> listLocation_T = mLocationBhv.selectList(cbLoc_T);
		// ===== ロケーションIDが取得できない場合 =====
		if ( listLocation_T.size() == 0 ) {
			// ロケーションマスタがない場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.LOCATION_T_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			bln = true ;
		}else{

			//ON推-CT4-184 2014/11/13 ADD START
//			// 倉庫CD同じでないの場合
//			MLocationCB cb = mLocationBhv.newMyConditionBean();
//			cb.setupSelect_MZone().withMWarehouse();
//			cb.query().setLocationId_Equal(listLocation_T.get(0).getLocationId());
//			List<MLocation> mLocationWarehouse = mLocationBhv.selectList(cb);
//			if(mLocationWarehouse.size() != 0){
//				if (!CU.isNullOrEmpty(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd()) && !CU.isNullOrEmpty(tStockFrom.getMWarehouse().getWarehouseCd())) {
//				    if (!CU.equals(mLocationWarehouse.get(0).getMZone().getMWarehouse().getWarehouseCd(),tStockFrom.getMWarehouse().getWarehouseCd())) {
//				    	getErrorManager().add(this.errRetSts(StatusCode.LOCATION_DATA_T_IN_WAREHOUSE_NOT_FOUND_ERROR), WmsMessageConst.LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR);
//				    	bln = true ;
//				    }
//			    }
//			}
			//ON推-CT4-184 2014/11/13 ADD END

			if (bln != true){
				bodyTo.setLocationId(listLocation_T.get(0).getLocationId());
			}
		}

		// ===== 取引先マスタ =====
		if(tStockFrom.getTStoreNo().getMCustomer() != null){
			String suppliedCd = tStockFrom.getTStoreNo().getMCustomer().getCustomerCd();
			MCustomer mCustomer =null;
			if (!(CommonUtil.isNullOrEmpty(suppliedCd))){
				mCustomer = new MCustomer();
				mCustomer.setCustomerCd(suppliedCd);
				mCustomer.setClientId(mClient.getClientId());
				mCustomer = customerLogic.getUkEntity(mCustomer);
				if(mCustomer != null){
//							tStockFrom.getTStoreNo().getMCustomer().setCustomerId(mCustomer.getCustomerId());
					bodyFrom.setDepositId(mCustomer.getCustomerId());
					bodyTo.setDepositId(mCustomer.getCustomerId());

				}else{
					// 仕入先マスタがない場合の確認メッセージを設定
					getErrorManager().add(this.errRetSts(StatusCode.SUPPLIER_NOT_FOUND), WmsMessageConst.SUPPLIER_NOT_FOUND_ERROR);
					bln = true ;
				}
			}

		}

		//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
		// ===== 預託ID元の取得 =====
		//bodyFrom.setDepositId(tStockFrom.getMCustomer().getCustomerId());
		String customerCd = tStockFrom.getMCustomer().getCustomerCd();
		MCustomer mCustomer1 = null;
		if (!(CommonUtil.isNullOrEmpty(customerCd))){
			mCustomer1 = new MCustomer();
			mCustomer1.setCustomerCd(customerCd);
			mCustomer1.setClientId(mClient.getClientId());
			mCustomer1 = customerLogic.getUkEntity(mCustomer1);
			if(mCustomer1 != null){
				bodyFrom.setDepositId(mCustomer1.getCustomerId());
			}else{
				//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_F_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				bln = true ;
			}
		}
		//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END

		// ===== 預託ID先の取得 =====
		MCustomerCB cbCustomer_T = mCustomerBhv.newMyConditionBean();
		cbCustomer_T.query().setClientId_Equal(mClient.getClientId());
		cbCustomer_T.query().setCustomerCd_Equal(tStockTo.getMCustomer().getCustomerCd());
		List<MCustomer> listCustomer_T = mCustomerBhv.selectList(cbCustomer_T);
		if (listCustomer_T.size() != 0){
			bodyTo.setDepositId(listCustomer_T.get(0).getCustomerId());
		}else{
			//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
			//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_T_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			bln = true ;
			//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
		}

		// ===== 在庫区分ID元の取得 =====
		bodyFrom.setStockTypeId(tStockFrom.getMStockType().getStockTypeId());
		// ===== 在庫区分ID先の取得 =====
		MStockTypeCB cbSto_T = mStockTypeBhv.newMyConditionBean();
//		cbSto_T.query().setClientId_Equal(mClient.getClientId());
		cbSto_T.query().setStockTypeCd_Equal(tStockTo.getMStockType().getStockTypeCd());
		List<MStockType> listSto_T = mStockTypeBhv.selectList(cbSto_T);
		if (listSto_T.size() != 0){
			bodyTo.setStockTypeId(listSto_T.get(0).getStockTypeId());
		}

		// ===== 入庫No.IDの取得 =====
		bodyFrom.setStoreNoId(tStockFrom.getTStoreNo().getStoreNoId());
		// 入庫の入庫NoIDの設定を削除 2016.03.11 kawana

		// ===== 倉庫IDの取得 =====
		bodyFrom.setWarehouseId(tStockFrom.getMWarehouse().getWarehouseId());
		bodyTo.setWarehouseId(tStockFrom.getMWarehouse().getWarehouseId());

		// ===== 荷姿IDの取得 =====
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start
		//bodyFrom.setShapeId(tStockFrom.getMShape().getShapeId());
		//bodyTo.setShapeId(tStockFrom.getMShape().getShapeId());
		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(mClient.getClientId());
		clientCenter.setCenterId(mCenter.getCenterId());
		// [Ver3.0] unit of measure対応 2017.11.28 ライ END
		// [エンハンス PH2.0] 入数の設定値を変更 2015.11.30 sja Start

		// ===== ロットIDの取得 =====
		bodyFrom.setLotId(tStockFrom.getTLot().getLotId());
		bodyTo.setLotId(tStockFrom.getTLot().getLotId());

		if (bln == true) {
			return null ;
		}

		// ===== 処理区分マスタCDCd取得と処理区分マスタID設定 =====
		MProcessType mProcessType = new MProcessType();
		mProcessType = new MProcessType();
		// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana Start
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$21.code());
		// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana End
		mProcessType = processTypeLogic.getUkEntity(mProcessType);
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		// ===== 画面の在庫情報がheaderとbodyListに設定する =====
		header.setInputType_$00();
		header.setMoveInstStatus_$00();
		header.setMoveInstComment(tStockTo.getInstComment());

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

		bodyFrom.setInoutType_$1();
		bodyFrom.setWarehouseCd(tStockFrom.getMWarehouse().getWarehouseCd());
		bodyFrom.setProductCd(tStockFrom.getMProduct().getProductCd());
		bodyFrom.setStockTypeCd(tStockFrom.getMStockType().getStockTypeCd());
		bodyFrom.setLocationCd(tStockFrom.getMLocation().getLocationCd());
		bodyFrom.setDepositCd(tStockFrom.getMCustomer().getCustomerCd());
		bodyFrom.setLot(tStockFrom.getTLot().getLot());
		bodyFrom.setLimitDt(tStockFrom.getTLot().getLimitDt());
		bodyFrom.setStoreLabelNo(tStockFrom.getTStoreNo().getStoreLabelNo());
		if(tStockFrom.getTStoreNo().getMCustomer() != null){
			bodyFrom.setSupplierCd(tStockFrom.getTStoreNo().getMCustomer().getCustomerCd());
		}
		// [エンハンス PH2.0] 入数の取得方法を変更する 2015.11.30 sja Start
		//bodyFrom.setShapeCd(tStockFrom.getMShape().getShapeCd());
		// [Ver3.0] unit of measure対応 2017.11.28 ライ END
		// [エンハンス PH2.0] 入数の取得方法を変更する 2015.11.30 sja End
		bodyFrom.setUnitNum(tStockFrom.getUnitNum());
		bodyFrom.setInstNum(tStockTo.getChargeNum_A());
		bodyTo.setInoutType_$0();
		bodyTo.setWarehouseCd(tStockFrom.getMWarehouse().getWarehouseCd());
		bodyTo.setProductCd(tStockFrom.getMProduct().getProductCd());
		bodyTo.setStockTypeCd(tStockTo.getMStockType().getStockTypeCd());
		bodyTo.setLocationCd(tStockTo.getMLocation().getLocationCd());
		bodyTo.setDepositCd(tStockTo.getMCustomer().getCustomerCd());
		bodyTo.setInstNum(tStockTo.getChargeNum_A());
		// [ON推-品向-438] 全数出庫のチェックに仕入先の一致チェックを追加 2014.12.15 kawana Start
		bodyFrom.setSupplierId(tStockFrom.getTStoreNo().getSupplierId());
		bodyTo.setSupplierId(tStockFrom.getTStoreNo().getSupplierId());
		// [ON推-品向-438] 全数出庫のチェックに仕入先の一致チェックを追加 2014.12.15 kawana End
		// [エンハンス PH2.0] 入庫日の設定を追加する 2015.11.30 sja Start
		bodyFrom.setStoreDt(tStockFrom.getTStoreNo().getStoreDt());
		bodyTo.setStoreDt(tStockTo.getTStoreNo().getStoreDt());
		// [エンハンス PH2.0] 入庫日の設定を追加する 2015.11.30 sja End

		bodyList.add(bodyFrom);
		bodyList.add(bodyTo);

		return null;
	}

	/**
	 * <h2>移動先在庫数取得。</h2>
	 * <pre>
	 * 移動先在庫数の取得
	 * 在庫移動画面用DTOに設定
	 *
	 * </pre>
	 * @param stockMoveDto 在庫移動画面用DTO
	 * @return StockMoveDto 在庫移動画面用DTO
	 */
	@GET
	@Path("/selectChargeNumTo")
	public StockMoveDto selectChargeNumTo(StockMoveDto stockMoveDto ) {

		boolean bln = false;
		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStockFrom = mapper.mappingToEntity(stockMoveDto.data.fromDto);
		TStock tStockTo   = mapper.mappingToEntity(stockMoveDto.data.toDto);

		// ===== 出荷指示ヘッダ =====
		TShippingInstH head =new TShippingInstH();
		// ===== 出荷指示ボディ =====
		TShippingInstB body =new TShippingInstB();

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStockFrom.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		head.setClientId(mClient.getClientId());

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStockFrom.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		head.setCenterId(mCenter.getCenterId());

		// ===== 倉庫IDの取得 =====
		//【品質】問題点指摘票(新ソリューション)-033 2014.10.28 ADD START
		//body.setWarehouseId(tStockFrom.getMWarehouse().getWarehouseId());
		body.setWarehouseId(null);
		//【品質】問題点指摘票(新ソリューション)-033 2014.10.28 ADD END

		// ===== 商品IDの取得  =====
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数の商品ID取得を修正 2014.11.21 kei Start
		String porductCd = tStockFrom.getMProduct().getProductCd();
		MProduct mProduct = null ;
		if (!(CommonUtil.isNullOrEmpty(porductCd))){
			mProduct = new MProduct();
			mProduct.setProductCd(porductCd);
			mProduct.setClientId(mClient.getClientId());
			mProduct = productLogic.getUkEntity(mProduct);
			if(mProduct != null){
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
				body.setProductId(mProduct.getProductId());
			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true ;
			}
		}
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数の商品ID取得を修正 2014.11.21 kei End

		// ===== ロットの取得 =====
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数のロット取得を修正 2014.11.21 kei Start
		String strLot = tStockFrom.getTLot().getLot();
		if (!(CommonUtil.isNullOrEmpty(strLot))){
			body.setLot(strLot);
		}
		String strLimiDt = tStockFrom.getTLot().getLimitDt();
		if (!(CommonUtil.isNullOrEmpty(strLimiDt))){
			body.setLimitDt(strLimiDt);
		}
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数のロット取得を修正 2014.11.21 kei End

		// ===== 在庫区分ID先の取得 =====
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数の在庫区分ID先取得を修正 2014.11.21 kei Start
		String stockTypeCd = tStockTo.getMStockType().getStockTypeCd();
		MStockType mStockType = null;
		if (!(CommonUtil.isNullOrEmpty(stockTypeCd))){
			mStockType = new MStockType();
			mStockType.setStockTypeCd(stockTypeCd);
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if(mStockType != null){
				body.setStockTypeId(mStockType.getStockTypeId());
			}
		}
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数の在庫区分ID先取得を修正 2014.11.21 kei End

		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数の預託ID元の取得を削除 2014.11.21 kei

		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数の預託ID先取得を修正 2014.11.21 kei Start
		// ===== 預託ID先の取得 =====
		String customerCd = tStockTo.getMCustomer().getCustomerCd();
		MCustomer mCustomer1 = null;
		if (!(CommonUtil.isNullOrEmpty(customerCd))){
			mCustomer1 = new MCustomer();
			mCustomer1.setCustomerCd(customerCd);
			mCustomer1.setClientId(mClient.getClientId());
			mCustomer1 = customerLogic.getUkEntity(mCustomer1);
			if(mCustomer1 != null){
				body.setDepositId(mCustomer1.getCustomerId());
			}else{
				//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_F_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				bln = true ;
			}
		}
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数のロケーションID先取得を修正 2014.11.21 kei End

		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数のロケーションID先取得を修正 2014.11.21 kei Start
		// ===== ロケーションID先の取得 =====
		String locationCd = tStockTo.getMLocation().getLocationCd();
		MLocation mLocation = null;
		if (!(CommonUtil.isNullOrEmpty(locationCd))){
			mLocation = new MLocation();
			mLocation.setLocationCd(locationCd);
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation = locationLogic.getUkEntity(mLocation);
			if(mLocation != null){
				body.setLocationId(mLocation.getLocationId());
			}else{
				// [ON推-品向-831] ロケーションCD(To)未存在エラーの表示箇所不正を修正 2015.07.02 kawana Start
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_T_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				// [ON推-品向-831] ロケーションCD(To)未存在エラーの表示箇所不正を修正 2015.07.02 kawana End
				bln = true ;
			}
		}
		// [品質】問題点指摘票(新ソリューション)-033] 移動先在庫総数のロケーションID先取得を修正 2014.11.21 kei End

		if (bln != true) {
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
			// ===== 在庫数データ取得.在庫数データ取得メソッドを呼出し =====
			List<TStock> result = stockDataSelectLogic.select(head,body,false,errRetSts(StatusCode.STOCK_DATA_SELECT_FAILED));
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End

			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				return null;
			}else{
				if (result.size() != 0){
					// ===== 在庫移動画面用DTOデータセット =====
					BigDecimal lonSumChargeNum = WCC.ZERO;
					for(TStock listEnt : result){
						lonSumChargeNum = WCC.add(lonSumChargeNum, CU.nullToZero(listEnt.getChargeNum()));
					}
					tStockTo.setSumChargeNum(lonSumChargeNum);

				}else{
					tStockTo.setSumChargeNum(WCC.ZERO);
				}
			}

		}else{
			tStockTo.setSumChargeNum(WCC.ZERO);
		}

		// ===== 画面用DTO ヘッダの作成 =====
		StockMoveDto  resultStockMoveDto = new StockMoveDto();

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper1 = new TStockDtoMapper();
		resultStockMoveDto.data.fromDto  = mapper1.mappingToDto(tStockFrom);
		resultStockMoveDto.data.toDto    = mapper1.mappingToDto(tStockTo);

		return resultStockMoveDto;

	}

	/**
	 * <h2>移動元在庫総数取得。</h2>
	 * <pre>
	 * 移動元在庫数の取得
	 * 在庫移動画面用DTOに設定
	 *
	 * </pre>
	 * @param stockMoveDto 在庫移動画面用DTO
	 * @return StockMoveDto 在庫移動画面用DTO
	 */
	@GET
	@Path("/selectChargeNumFrom")
	public StockMoveDto selectChargeNumFrom(StockMoveDto stockMoveDto ) {
		boolean bln = false;
		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStockFrom = mapper.mappingToEntity(stockMoveDto.data.fromDto);
		TStock tStockTo   = mapper.mappingToEntity(stockMoveDto.data.toDto);

		// ===== 出荷指示ヘッダ =====
		TShippingInstH head =new TShippingInstH();
		// ===== 出荷指示ボディ =====
		TShippingInstB body =new TShippingInstB();

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStockFrom.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		head.setClientId(mClient.getClientId());

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStockFrom.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		head.setCenterId(mCenter.getCenterId());

		// ===== 倉庫IDの取得 =====
		String warehouseCd = tStockFrom.getMWarehouse().getWarehouseCd();
		if (!(CommonUtil.isNullOrEmpty(warehouseCd))){
			MWarehouseCB cbWare = mWarehouseBhv.newMyConditionBean();
			cbWare.query().setWarehouseCd_Equal(warehouseCd);
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
			cbWare.query().setCenterId_Equal(mCenter.getCenterId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End

			List<MWarehouse> listWare = mWarehouseBhv.selectList(cbWare);
			if (listWare.size() != 0){
				body.setWarehouseId(listWare.get(0).getWarehouseId());
			}
		}

		// ===== 商品IDのの取得 =====
		String productCd = tStockFrom.getMProduct().getProductCd();
		if (!(CommonUtil.isNullOrEmpty(productCd))){
			MProductCB cbPro = mProductBhv.newMyConditionBean();
			cbPro.query().setClientId_Equal(mClient.getClientId());
			cbPro.query().setProductCd_Equal(productCd);
			List<MProduct> listProduct = mProductBhv.selectList(cbPro);
			// ===== 商品IDが取得できない場合 =====
			if ( listProduct.size() != 0 ) {
				body.setProductId(listProduct.get(0).getProductId());
			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true;
			}
		}

		// ===== 預託ID元の取得 =====
		MCustomerCB cbCustomer_F = mCustomerBhv.newMyConditionBean();
		cbCustomer_F.query().setClientId_Equal(mClient.getClientId());
		cbCustomer_F.query().setCustomerCd_Equal(tStockFrom.getMCustomer().getCustomerCd());
		List<MCustomer> listCustomer_F = mCustomerBhv.selectList(cbCustomer_F);
		if (listCustomer_F.size() != 0){
			body.setDepositId(listCustomer_F.get(0).getCustomerId());
		}else{
			//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
			//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_F_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			bln = true ;
			//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
		}

		// ===== ロケーションID元の取得 =====
		String locationCd = tStockFrom.getMLocation().getLocationCd();
		if(!(CommonUtil.isNullOrEmpty(locationCd))){
			MLocationCB cbLoc_F = mLocationBhv.newMyConditionBean();
			cbLoc_F.query().setCenterId_Equal(mCenter.getCenterId());
			cbLoc_F.query().setLocationCd_Equal(tStockFrom.getMLocation().getLocationCd());
			List<MLocation> listLocation_F = mLocationBhv.selectList(cbLoc_F);
			// ===== ロケーションIDが取得できない場合 =====
			if ( listLocation_F.size() != 0 ) {
				body.setLocationId(listLocation_F.get(0).getLocationId());
			}else{
				// 元ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_F_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				bln = true;
			}
		}

		// ===== 在庫区分ID元の取得 =====
		MStockTypeCB cbSto_F = mStockTypeBhv.newMyConditionBean();
//		cbSto_F.query().setClientId_Equal(mClient.getClientId());
		cbSto_F.query().setStockTypeCd_Equal(tStockFrom.getMStockType().getStockTypeCd());
		List<MStockType> listSto_F = mStockTypeBhv.selectList(cbSto_F);
		if (listSto_F.size() != 0){
			body.setStockTypeId(listSto_F.get(0).getStockTypeId());
		}

		// 結果判定
		if (bln == true) {
			// 処理中止
			tStockFrom.setSumChargeNum(WCC.ZERO);
		}else{
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
			// ===== 在庫数データ取得.在庫数データ取得メソッドを呼出し =====
			List<TStock> result = stockDataSelectLogic.select(head,body,false,errRetSts(StatusCode.STOCK_DATA_SELECT_FAILED));
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End
			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}else{
				if (result.size() != 0){
					TStock ret = result.get(0);
					// ===== 在庫移動画面用DTOデータセット =====
					tStockFrom.setSumChargeNum(CU.nullToZero(ret.getSumChargeNum()));
				}else{
					tStockFrom.setSumChargeNum(WCC.ZERO);
				}
			}
		}

		// ===== 画面用DTO ヘッダの作成 =====
		StockMoveDto  resultStockMoveDto = new StockMoveDto();

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper1 = new TStockDtoMapper();
		resultStockMoveDto.data.fromDto  = mapper1.mappingToDto(tStockFrom);
		resultStockMoveDto.data.toDto    = mapper1.mappingToDto(tStockTo);

		return resultStockMoveDto;
	}

	/**
	 * <h2>移動元在庫数取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・移動元在庫数の取得
	 * ・在庫移動画面移動元在庫数に設定
	 * </pre>
	 * @param  stockMoveDto 在庫調整画面用DTO
	 * @return stockMoveDto 在庫調整画面用DTO
	 */
	@GET
	@Path("/selectChargeNum")
	public StockMoveDto selectChargeNum(StockMoveDto stockMoveDto) {

		BigDecimal intResult = WCC.ZERO;
		boolean bln = false ;

		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock tStockFrom = mapper.mappingToEntity(stockMoveDto.data.fromDto);

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = tStockFrom.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient= clientLogic.getUkEntity(mClient);
		if(mClient != null){
			tStockFrom.setClientId(mClient.getClientId());
		}

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = tStockFrom.getMLocation().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if(mCenter != null){
			tStockFrom.getMLocation().setCenterId(mCenter.getCenterId());
		}

		// ===== 仕入先ID取得と取引先ID設定 =====
		if(tStockFrom.getTStoreNo().getMCustomer() != null){
			String suppliedCd = tStockFrom.getTStoreNo().getMCustomer().getCustomerCd();
			MCustomer mCustomer =null;
			if (!(CommonUtil.isNullOrEmpty(suppliedCd))){
				mCustomer = new MCustomer();
				mCustomer.setCustomerCd(suppliedCd);
				mCustomer.setClientId(mClient.getClientId());
				mCustomer = customerLogic.getUkEntity(mCustomer);
				if(mCustomer != null){
					tStockFrom.getTStoreNo().getMCustomer().setCustomerId(mCustomer.getCustomerId());
				}else{
					// 仕入先マスタがない場合の確認メッセージを設定
					getErrorManager().add(this.errRetSts(StatusCode.SUPPLIER_NOT_FOUND), WmsMessageConst.SUPPLIER_NOT_FOUND_ERROR);
					bln = true ;
				}
			}
		}

		// ===== ロケーションCd取得とロケーションID設定 =====
		String locationCd = tStockFrom.getMLocation().getLocationCd();
		MLocation mLocation = null;
		if (!(CommonUtil.isNullOrEmpty(locationCd))){
			mLocation = new MLocation();
			mLocation.setLocationCd(locationCd);
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation = locationLogic.getUkEntity(mLocation);
			if(mLocation != null){
				tStockFrom.setLocationId(mLocation.getLocationId());
			}else{
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_F_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 商品Cd取得と商品ID設定 =====
		String porductCd = tStockFrom.getMProduct().getProductCd();
		MProduct mProduct = null ;
		if (!(CommonUtil.isNullOrEmpty(porductCd))){
			mProduct = new MProduct();
			mProduct.setProductCd(porductCd);
			mProduct.setClientId(mClient.getClientId());
			mProduct = productLogic.getUkEntity(mProduct);
			if(mProduct != null){
				tStockFrom.setProductId(mProduct.getProductId());
				// [Ver3.0] unit of measure対応 2017.11.20 ライ Start
				mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
			}else{
				// 商品マスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				bln = true ;
			}
		}

		// ===== 倉庫Cd取得と倉庫ID設定 =====
		String warehouseCd = tStockFrom.getMWarehouse().getWarehouseCd();
		MWarehouse mWarehouse = null;
		if (!(CommonUtil.isNullOrEmpty(warehouseCd))){
			mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			if(mWarehouse != null){
				tStockFrom.setWarehouseId(mWarehouse.getWarehouseId());
			}
		}

		// ===== 取引先Cd取得と預託ID設定 =====
		String customerCd = tStockFrom.getMCustomer().getCustomerCd();
		MCustomer mCustomer1 = null;
		if (!(CommonUtil.isNullOrEmpty(customerCd))){
			mCustomer1 = new MCustomer();
			mCustomer1.setCustomerCd(customerCd);
			mCustomer1.setClientId(mClient.getClientId());
			mCustomer1 = customerLogic.getUkEntity(mCustomer1);
			if(mCustomer1 != null){
				tStockFrom.setDepositId(mCustomer1.getCustomerId());
			}else{
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
				//預託在庫区分預託在庫区分が存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_F_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
				bln = true ;
				//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
			}
		}

		// ===== 在庫区分Cd取得と在庫区分ID設定 =====
		String stockTypeCd = tStockFrom.getMStockType().getStockTypeCd();
		MStockType mStockType = null;
		if (!(CommonUtil.isNullOrEmpty(stockTypeCd))){
			mStockType = new MStockType();
			mStockType.setStockTypeCd(stockTypeCd);
//			mStockType.setClientId(mClient.getClientId());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if(mStockType != null){
				tStockFrom.setStockTypeId(mStockType.getStockTypeId());
			}
		}

		if(bln == true){
			return null;
		}

        // ===== 在庫数データ取得メソッドを呼出し =====
		intResult = stockMoveSelectChargeNumLogic.selectChargeNum(tStockFrom,tStockFrom.getMLocation().getMCenter(),tStockFrom.getMCustomer(),tStockFrom.getTLot(),tStockFrom.getTStoreNo(),errRetSts(StatusCode.STOCK_DATA_SELECT_FAILED));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		tStockFrom.setChargeNum(intResult);

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStockDtoMapper mapper1 = new TStockDtoMapper();
		TStockDto selectDtoFrom = mapper1.mappingToDto(tStockFrom);

		// ===== 画面用DTO ヘッダの作成 =====
		StockMoveDto stockMoveDtoFrom = new StockMoveDto();
		stockMoveDtoFrom.data.fromDto = selectDtoFrom;

		return stockMoveDtoFrom;

	}

	//[ON推-品質問題点指摘対応（新ｿﾘV2-015）]警告確認メッセージ表示チェック処理の追加 2016.07.20 chou Add Start
	/**
	 * <h2>確認メッセージ表示チェック。</h2>
	 * <pre>
	 * 全数移動の場合、移動先の補充商品ＣＤが移動元の補充商品ＣＤで
	 * 上書きされる確認メッセージを表示するかどうかをチェックする。
	 * </pre>
	 * @param  stockMoveDto 在庫移動画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkReplenishInfoOverwrite")
	public StatusDto checkReplenishInfoOverwrite(StockMoveDto stockMoveDto) {

		StatusDto result = new StatusDto();

		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH header =new TMoveInstH();

		// ===== 在庫移動指示ボディ =====
		List<TMoveInstB> bodyList =new ArrayList<TMoveInstB>();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(stockMoveDto,header,bodyList);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			result.status.statusCode = StatusCode.STOCK_UPDATE_FAILED;
			// 処理中止
			return null;
		}

		// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana Start
		//全数移動確認
		boolean isAllMove = stockUpdateCheckLogic.isAllShippingProduct(bodyList.get(0));
		// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana End

		if(isAllMove){//全数移動の場合
			TMoveInstB moveFrom = bodyList.get(0);
			TMoveInstB moveTo = bodyList.get(1);

			//移動元ロケーションの情報取得
			MLocationCB srcCB = mLocationBhv.newMyConditionBean();
			srcCB.query().setLocationId_Equal(moveFrom.getLocationId());
			srcCB.query().setReplenishProductId_Equal(moveFrom.getProductId());
			srcCB.query().setReplenishStockTypeId_Equal(moveFrom.getStockTypeId());
			srcCB.query().setReplenishDepositId_Equal(moveFrom.getDepositId());
			MLocation sourceLoc = mLocationBhv.selectEntity(srcCB);

			//移動先ロケーの情報取得
			MLocationCB destCB = mLocationBhv.newMyConditionBean();
			destCB.query().setLocationId_Equal(moveTo.getLocationId());
			destCB.query().setPickingLocationFlg_Equal_$1();//ピックロケーション
			destCB.query().setReplenishProductId_IsNotNull();
			MLocation destLoc = mLocationBhv.selectEntity(destCB);

			if(sourceLoc != null && destLoc != null && !sourceLoc.getReplenishProductId().equals(destLoc.getReplenishProductId())){
				//全数移動の場合、且つ、移動商品ID＝移動元ロケの補充商品ID、且つ、移動先ロケの補充商品ID≠NULLの場合に、
				//警告確認メッセージの表示が必要になる。
				result.status.statusCode = StatusCode.CONFIRMATION;
			}else{
				result.status.statusCode = StatusCode.SUCCESS;
			}

		}else{
			result.status.statusCode = StatusCode.SUCCESS;
		}

		return result;
	}
	//[ON推-品質問題点指摘対応（新ｿﾘV2-015）]警告確認メッセージ表示チェック処理の追加 2016.07.20 chou Add End
}
