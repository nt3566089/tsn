package com.oneslogi.wms.resources.stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.dto.MSetStructureDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.MSetStructureDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.stock.StockSetInstDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.stock.StockSetInstSelectLogic;
import com.oneslogi.wms.logic.stock.StockSetInstUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * セット組指示のリソースクラス。
 */
@Path("/stock/stockSetInst")
public class StockSetInstResource extends AbstractWmsResource {

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
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 2;
		/**
		 * 構成品データ取得異常
		 */
		protected static final int SET_STRUCTURE_LIST_FAILED = 3;
		/**
		 * 在庫データ取得異常
		 */
		protected static final int STOCK_LIST_FAILED = 4;
		/**
		 * ロケーション取得異常
		 */
		protected static final int LOCATION_NOT_FOUND = 5;
		/**
		 * 預託在庫区分が存在異常
		 */
		protected static final int DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR = 6;
		/**
		 * 在庫区分が存在異常
		 */
		protected static final int STOCK_CLASS_NOT_FOUND_ERROR = 7;
		/**
		 * セット組指示登録異常
		 */
		protected static final int INST_UPDATE_FAILED = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private StockSetInstSelectLogic stockSetInstSelectLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private StockSetInstUpdateLogic updateLogic;
	// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana End
	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private MProductBhv mproductBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return stockSetInstDto セット組指示画面用DTO
	 */
	@GET
	@Path("/init")
	public StockSetInstDto init() {
		// 画面用DTO作成
		StockSetInstDto stockSetInstDto = new StockSetInstDto();
		return stockSetInstDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された親商品CDより、構成品情報と在庫情報を取得する
	 * </pre>
	 * @param dto セット組指示画面用DTO
	 * @return dto セット組指示画面用DTO
	 */
	@GET
	@Path("/search")
	public StockSetInstDto search(StockSetInstDto dto) throws Exception {
		StockSetInstDto stockSetInstDto = new StockSetInstDto();
		// エンティティ編集
		TStockDtoMapper tMapper = new TStockDtoMapper();
		TStock head = tMapper.mappingToEntity(dto.data.head);

		// ===== センタIDを取得 =====
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(head.getMLocation().getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// ===== 荷主IDを取得 =====
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(head.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// ===== 親商品IDを取得 =====
		MProduct productCondition = new MProduct();
		productCondition.setClientId(clientId);
		productCondition.setProductCd(head.getMProduct().getProductCd());
		MProduct product = productLogic.getUkEntity(productCondition);
		if (product == null) {
			// 商品マスタがない場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND),	WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			return null;
		}

		// セット組指示データ取得.構成品データ取得メソッドを呼出し
		List<MSetStructure> page = stockSetInstSelectLogic.selectStructureList(product, errRetSts(StatusCode.SET_STRUCTURE_LIST_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// セット組指示データ取得.在庫データ取得メソッドを呼出し
		List<TStock> stockList = stockSetInstSelectLogic.selectStockList(centerId, clientId, page, errRetSts(StatusCode.STOCK_LIST_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		// JSON通信のためにSimpleDTO変換
		MSetStructureDtoMapper mMapper = new MSetStructureDtoMapper();
		List<MSetStructureDto> list = mMapper.mappingToDtoList(page);
		List<TStockDto> stockListDto = tMapper.mappingToDtoList(stockList);

		// 検索結果詰込処理
		stockSetInstDto.data.setStructureList = list;
		stockSetInstDto.data.stockList = stockListDto;
		return stockSetInstDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 入力データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・商品マスタ存在チェックエラー用メッセージ
	 * ・ロケーションマスタ存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param dto セット組指示画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckUpdate")
	public StatusDto inputCheckUpdate(StockSetInstDto dto) {

		// ===== 登録データ組み立て =====
		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH moveInstH =new TMoveInstH();
		// ===== 在庫移動指示ボディ[入庫] =====
		TMoveInstB moveInstB =new TMoveInstB();
		// ===== 在庫移動指示ボディ[出庫] =====
		List<TMoveInstB> moveInstBList =new ArrayList<TMoveInstB>();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(dto, moveInstH, moveInstB, moveInstBList);

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
	 * <h2>セット組指示。</h2>
	 * <pre>
	 * セット組指示登録データの組み立てを行う
	 * エラーがない場合は、セット組指示データを登録し、完了メッセージを設定する
	 *
	 * 登録データに次の値を設定する
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 * </pre>
	 * @param  dto セット組指示画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
    public StatusDto register(StockSetInstDto dto) {
		// ===== 登録データ組み立て =====
		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH moveInstH =new TMoveInstH();
		// ===== 在庫移動指示ボディ[出庫] =====
		TMoveInstB moveInstB =new TMoveInstB();
		// ===== 在庫移動指示ボディ[出庫] =====
		List<TMoveInstB> moveInstBList =new ArrayList<TMoveInstB>();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(dto, moveInstH, moveInstB, moveInstBList);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== セット組指示 =====
		updateLogic.update(moveInstH, moveInstB, moveInstBList, errRetSts(StatusCode.INST_UPDATE_FAILED));

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== 完了メッセージの設定 =====
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	/**
	 * <h2>セット組指示データの組み立て。</h2>
	 * <pre>
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 *
	 * </pre>
	 * @param dto セット組指示画面用DTO
	 * @param header 在庫移動指示ヘッダ
	 * @param body 在庫移動指示ボディ[入庫]
	 * @param bodyList 在庫移動指示ボディ[出庫]
	 * @return StatusDto 処理結果DTO
	 */
	public StatusDto registerCheck(StockSetInstDto dto, TMoveInstH header, TMoveInstB body, List<TMoveInstB> bodyList) {
		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		TStock head = mapper.mappingToEntity(dto.data.head);
		List<TStock> stockList = mapper.mappingToEntityList(dto.data.stockList);

		// ===== 荷主Cd取得と荷主ID設定 =====
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(head.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// ===== センタCd取得とセンタID設定 =====
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(head.getMLocation().getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// ===== ロケーションCd取得とロケーションID設定 =====
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MZone().withMWarehouse();
		cb.query().setLocationCd_Equal(head.getMLocation().getLocationCd());
		cb.query().setCenterId_Equal(centerId);
		MLocation mLocation = mLocationBhv.selectEntity(cb);
		if(mLocation == null){
			// ロケーションマスタがない場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.LOCATION_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 商品マスタ =====
		String porductCd = head.getMProduct().getProductCd();
		MProductCB mProductCB = mproductBhv.newMyConditionBean();
		mProductCB.query().setProductCd_Equal(porductCd);
		mProductCB.query().setClientId_Equal(clientId);
		MProduct mProduct = mproductBhv.selectEntity(mProductCB);
		mproductBhv.loadMProductShapeList(mProduct, new ConditionBeanSetupper<MProductShapeCB>() {
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
			public void setup(MProductShapeCB subCB){
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
			}
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
		});

		// ===== 預託IDの取得 =====
		String customerCd = head.getMCustomer().getCustomerCd();
		MCustomer deposit = new MCustomer();
		deposit.setCustomerCd(customerCd);
		deposit.setClientId(clientId);
		deposit = customerLogic.getUkEntity(deposit);
		if(deposit == null){
			//預託在庫区分が存在しません場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 処理区分マスタCDCd取得と処理区分マスタID設定 =====
		MProcessType mProcessType = new MProcessType();
		mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$30.code());
		mProcessType = processTypeLogic.getUkEntity(mProcessType);

		// ===== 在庫区分ID取得 =====
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(head.getMStockType().getStockTypeCd());
		mStockType = stockTypeLogic.getUkEntity(mStockType);
		if(mStockType == null){
			// 在庫区分が存在しません場合の確認メッセージを設定
			getErrorManager().add(this.errRetSts(StatusCode.STOCK_CLASS_NOT_FOUND_ERROR), WmsMessageConst.STOCK_TYPE_NOT_FOUND_ERROR);
			return null;
		}

		// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana Start
		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);
		mClientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(mClientCenter);
		// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana End

		// ===== 在庫移動指示ヘッダデータ組み立て =====
		// 荷主ID
		header.setClientId(clientId);
		// センタID
		header.setCenterId(centerId);
		// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana Start
		// 指示日
		header.setInstDt(mClientCenter.getSystemDt());
		// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana End
		// 処理区分ID
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		// ===== 在庫移動指示ボディ[入庫]データ組み立て =====
		// 倉庫ID
		body.setWarehouseId(mLocation.getMZone().getMWarehouse().getWarehouseId());
		// 倉庫CD
		body.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
		// 商品ID
		body.setProductId(mProduct.getProductId());
		// 商品CD
		body.setProductCd(mProduct.getProductCd());
		// 在庫区分ID
		body.setStockTypeId(mStockType.getStockTypeId());
		// 在庫区分CD
		body.setStockTypeCd(mStockType.getStockTypeCd());
		// ロケーションID
		body.setLocationId(mLocation.getLocationId());
		// ロケーションCD
		body.setLocationCd(mLocation.getLocationCd());
		// 預託ID
		body.setDepositId(deposit.getCustomerId());
		// 預託CD
		body.setDepositCd(deposit.getCustomerCd());
		// ロット
		body.setLot(head.getTLot().getLot());
		// 期限日
		body.setLimitDt(head.getTLot().getLimitDt());
		// 入庫日
		body.setStoreDt(head.getTStoreNo().getStoreDt());
		// 商品荷姿マスタデータ取得したの場合
		if (mProduct.getMProductShapeList().size() > 0){
			// 荷姿ID
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
			body.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getShapeId());
			// 入数
			//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.16 chou Mod Start
			// [#3347][Ver3.0] TODO残対応(UoM) - トラン系(在庫・棚卸)入数null対応 入数設定削除 2018.01.15 honma Delete
			//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.16 chou Mod End
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
		}
		// 指示数
		body.setInstNum(head.getChargeNum());

		// 在庫リストデータ件数繰り返し、在庫移動指示データを作成
		for(TStock stock : stockList){
			BigDecimal moveNumInfo = stock.getMoveNumInfo();
			if(WCC.isPositive(moveNumInfo)){
				TMoveInstB moveInstB = new TMoveInstB();
				// ===== 倉庫ID取得 =====
				MWarehouse mw = new MWarehouse();
				mw.setWarehouseCd(stock.getMWarehouse().getWarehouseCd());
				mw.setCenterId(centerId);
				mw = warehouseLogic.getUkEntity(mw);

				// ===== 商品ID取得 =====
				mProductCB = mproductBhv.newMyConditionBean();
				mProductCB.query().setProductCd_Equal(stock.getMProduct().getProductCd());
				mProductCB.query().setClientId_Equal(clientId);
				mProduct = mproductBhv.selectEntity(mProductCB);
				mproductBhv.loadMProductShapeList(mProduct, new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
					public void setup(MProductShapeCB subCB){
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						subCB.query().setDelFlg_Equal_$0();
					}
					// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
				});

				// ===== 在庫区分ID取得 =====
				mStockType = new MStockType();
				mStockType.setStockTypeCd(stock.getMStockType().getStockTypeCd());
				mStockType = stockTypeLogic.getUkEntity(mStockType);

				// ===== ロケーションID取得 =====
				mLocation = new MLocation();
				mLocation.setCenterId(centerId);
				mLocation.setLocationCd(stock.getMLocation().getLocationCd());
				mLocation = locationLogic.getUkEntity(mLocation);

				// ===== 預託ID =====
				deposit = new MCustomer();
				deposit.setClientId(clientId);
				deposit.setCustomerCd(stock.getMCustomer().getCustomerCd());
				deposit = customerLogic.getUkEntity(deposit);

				// ===== 在庫移動指示ボディデータ組み立て =====
				// 倉庫ID
				moveInstB.setWarehouseId(mw.getWarehouseId());
				// 倉庫CD
				moveInstB.setWarehouseCd(mw.getWarehouseCd());
				// 商品ID
				moveInstB.setProductId(mProduct.getProductId());
				// 商品CD
				moveInstB.setProductCd(mProduct.getProductCd());
				// 商品荷姿マスタデータ取得したの場合
				if (mProduct.getMProductShapeList().size() > 0){
					// 荷姿ID
					// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
					moveInstB.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getShapeId());
					// 入数
					//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.16 chou Mod Start
					// [#3347][Ver3.0] TODO残対応(UoM) - トラン系(在庫・棚卸)入数null対応 入数設定削除 2018.01.15 honma Delete
					//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.16 chou Mod End
					// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
				}
				// 在庫区分ID
				moveInstB.setStockTypeId(mStockType.getStockTypeId());
				// 在庫区分CD
				moveInstB.setStockTypeCd(mStockType.getStockTypeCd());
				// ロケーションID
				moveInstB.setLocationId(mLocation.getLocationId());
				// ロケーションCD
				moveInstB.setLocationCd(mLocation.getLocationCd());
				// 預託ID
				moveInstB.setDepositId(deposit.getCustomerId());
				// 預託CD
				moveInstB.setDepositCd(deposit.getCustomerCd());
				// ロット
				moveInstB.setLot(stock.getTLot().getLot());
				// 期限日
				moveInstB.setLimitDt(stock.getTLot().getLimitDt());
				// 入庫Noの指定
				moveInstB.setStoreNoId(stock.getStoreNoId());
				// 指示数
				moveInstB.setInstNum(stock.getMoveNumInfo());
				// 引当可能数
				moveInstB.setChargeNum(stock.getChargeNum());

				bodyList.add(moveInstB);
			}
		}

		return null;
	}
}

