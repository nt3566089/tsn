package com.oneslogi.wms.resources.stock;

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
import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dtomapper.TStockDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.stock.StockSetReleaseDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.stock.StockSetReleaseSelectLogic;
import com.oneslogi.wms.logic.stock.StockSetReleaseUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * セット解除指示のリソースクラス。
 */
@Path("/stock/stockSetRelease")
public class StockSetReleaseResource extends AbstractWmsResource {

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
		 * 預託在庫区分が存在異常
		 */
		protected static final int DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR = 3;
		/**
		 * 在庫区分が存在異常
		 */
		protected static final int STOCK_CLASS_NOT_FOUND_ERROR = 4;
		/**
		 * ロケーション取得異常
		 */
		protected static final int LOCATION_NOT_FOUND = 5;
		/**
		 * 親商品在庫データ取得異常
		 */
		protected static final int SET_PARENT_STOCK_LIST_FAILED = 6;
		/**
		 * 構成品データ取得異常
		 */
		protected static final int SET_STRUCTURE_LIST_FAILED = 7;

		/**
		 * セット解除指示登録異常
		 */
		protected static final int UPDATE_FAILED = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private StockSetReleaseSelectLogic selectLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private StockSetReleaseUpdateLogic updateLogic;
	// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [#184][2.1.0-CT-026] 指示日が入庫日になっている不具合を修正 2016.11.04 kawana End

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mproductBhv;
	@Inject
	private MSetStructureBhv mSetStructureBhv;
	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return stockSetInstDto セット解除指示画面用DTO
	 */
	@GET
	@Path("/init")
	public StockSetReleaseDto init() {
		// 画面用DTO作成
		StockSetReleaseDto stockSetReleaseDto = new StockSetReleaseDto();
		return stockSetReleaseDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された、親商品在庫情報を取得する
	 * </pre>
	 * @param dto セット解除指示画面用DTO
	 * @return StockSetReleaseDto セット解除指示画面用DTO
	 */
	@GET
	@Path("/search")
	public StockSetReleaseDto search(StockSetReleaseDto dto) throws Exception {
		StockSetReleaseDto stockSetReleaseDto = new StockSetReleaseDto();
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
		}else{
			// 親商品存在チェック
			parentIdCheck(product.getProductId());
		}

		// ===== 預託IDを取得 =====
		String customerCd = head.getMCustomer().getCustomerCd();
		MCustomer deposit = new MCustomer();
		if(!CU.isNullOrEmpty(customerCd)){
			deposit.setCustomerCd(customerCd);
			deposit.setClientId(clientId);
			deposit = customerLogic.getUkEntity(deposit);
		}

		// ===== 在庫区分IDを取得 =====
		String stockTypeCd = head.getMStockType().getStockTypeCd();
		MStockType mStockType = new MStockType();
		if(!CU.isNullOrEmpty(stockTypeCd)){
			mStockType.setStockTypeCd(stockTypeCd);
			mStockType = stockTypeLogic.getUkEntity(mStockType);
		}

		// ===== ロケーションIDを取得 =====
		String locationCd = head.getMLocation().getLocationCd();
		MLocation mLocation = new MLocation();
		if(!CU.isNullOrEmpty(locationCd)){
			mLocation.setLocationCd(locationCd);
			mLocation.setCenterId(centerId);
			mLocation = locationLogic.getUkEntity(mLocation);
			if(mLocation == null){
				// ロケーションが存在しません場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_NOT_FOUND), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			}
		}

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// エンティティ編集
		// センタID
		head.getMLocation().getMCenter().setCenterId(centerId);
		// 荷主ID
		head.setClientId(clientId);
		// 商品ID
		head.setProductId(product.getProductId());
		// 預託ID
		head.setDepositId(deposit.getCustomerId());
		// 在庫区分ID
		head.setStockTypeId(mStockType.getStockTypeId());
		// ロケーションID
		head.setLocationId(mLocation.getLocationId());

		// セット解除指示データ取得.親商品在庫データ取得メソッドを呼出し
		List<TStock> result = selectLogic.selectStockList(head, errRetSts(StatusCode.SET_PARENT_STOCK_LIST_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// JSON通信のためにSimpleDTO変換
		List<TStockDto> stockListDto = tMapper.mappingToDtoList(result);

		// 検索結果詰込処理
		stockSetReleaseDto.data.stockList = stockListDto;
		return stockSetReleaseDto;
	}

	/***
	 * <h2>親商品存在チェック。</h2>
	 * <pre>
	 * 親商品より、セット品構成マスタにデータを取得する
	 * 以下のチェックを行う
	 * ・取得データが0件チェック
	 * </pre>
	 * @param parentId　親商品ID
	 * @return　boolean
	 */
	private void parentIdCheck(Long parentId) {
		// ===== セット品構成マスタ検索 =====
		MSetStructureCB cb = mSetStructureBhv.newMyConditionBean();

		// ===== データ取得テーブル =====
		cb.setupSelect_MProduct();
		cb.setupSelect_MSetParent();
		cb.setupSelect_MSetParent().withMProduct();

		// ===== 検索条件 =====
		cb.query().queryMSetParent().setProductId_Equal(parentId);

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== 検索実行 =====
		List<MSetStructure> result = selectList(mSetStructureBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		if(result.size() == 0){
			getErrorManager().add(this.errRetSts(StatusCode.PRODUCT_NOT_FOUND),	WmsMessageConst.PARENT_PRODUCT_CODE_NOT_FOUND_ERROR);
		}
	}

	/***
	 * <h2>構成品検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された親商品CDより、構成品情報を取得する
	 * @param dto　セット解除指示画面用DTO
	 * @return　StockSetReleaseDto　セット解除指示画面用DTO
	 */
	@GET
	@Path("/searchStructure")
	public StockSetReleaseDto searchStructure(StockSetReleaseDto dto) throws Exception {
		StockSetReleaseDto stockSetReleaseDto = new StockSetReleaseDto();
		// エンティティ編集
		TStockDtoMapper tMapper = new TStockDtoMapper();
		TStock stock = tMapper.mappingToEntity(dto.data.stock);
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる - 指示数量取得元変更 2018.01.11 honma Delete

		// セット解除指示データ取得.構成品データ取得メソッドを呼出し
		List<MSetStructure> setStructureList = selectLogic.selectStructure(stock, errRetSts(StatusCode.SET_STRUCTURE_LIST_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		List<TStock> result = new ArrayList<TStock>();
		for(MSetStructure mSetStructure : setStructureList){
			TStock ts = chaseTStock();
			// 商品ID
			ts.setProductId(mSetStructure.getMProduct().getProductId());
			// 商品CD
			ts.getMProduct().setProductCd(mSetStructure.getMProduct().getProductCd());
			// 商品名称
			ts.getMProduct().setProductNm(mSetStructure.getMProduct().getProductNm());
			// 商品略称
			ts.getMProduct().setProductAbbr(mSetStructure.getMProduct().getProductAbbr());
			// JANCD
			ts.getMProduct().setJanCd(mSetStructure.getMProduct().getJanCd());
			// 入数
			ts.setUnitNum(mSetStructure.getUnitNum());
			// 預託CD
			ts.getMCustomer().setCustomerCd(stock.getMCustomer().getCustomerCd());
			// 預託名称
			ts.getMCustomer().setCustomerNm(stock.getMCustomer().getCustomerNm());
			// 在庫区分CD
			ts.getMStockType().setStockTypeCd(stock.getMStockType().getStockTypeCd());
			// 在庫区分名称
			ts.getMStockType().getVDict().setDictNm(stock.getMStockType().getVDict().getDictNm());
			// ロット管理フラグ
			ts.getMProduct().setLotManagFlg(mSetStructure.getMProduct().getLotManagFlg());
			// 期限日管理フラグ
			ts.getMProduct().setLimitDtManagFlg(mSetStructure.getMProduct().getLimitDtManagFlg());
			// [ON推-CT113-016] 指示数の初期値を設定する 2015.12.28 hayashi Start
			// 指示数
			// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
			ts.setChargeNum(WCC.multiply(mSetStructure.getUnitNum(), dto.data.instInput.getChargeNum()));
			// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End
			// [ON推-CT113-016] 指示数の初期値を設定する 2015.12.28 hayashi End
			//荷主センタ変更対応 201７.02.24 sja Start
			ts.getMProduct().getMClient().setClientCd(mSetStructure.getMProduct().getMClient().getClientCd());
			ts.getMProduct().getMClient().setClientNm(mSetStructure.getMProduct().getMClient().getClientNm());
			//荷主センタ変更対応 201７.02.24 sja End

			result.add(ts);
		}

		// JSON通信のためにSimpleDTO変換
		List<TStockDto> stockListDto = tMapper.mappingToDtoList(result);

		// 検索結果詰込処理
		stockSetReleaseDto.data.releaseInput = stockListDto;
		return stockSetReleaseDto;
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
	 * @param dto セット解除指示画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckUpdate")
	public StatusDto inputCheckUpdate(StockSetReleaseDto dto) {

		// ===== 登録データ組み立て =====
		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH moveInstH = new TMoveInstH();
		// ===== 在庫移動指示ボディ[入庫] =====
		List<TMoveInstB> moveInstBList = new ArrayList<TMoveInstB>();
		// ===== 在庫移動指示ボディ[出庫] =====
		TMoveInstB moveInstB = new TMoveInstB();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(dto, moveInstH, moveInstBList, moveInstB);

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
	 * <h2>セット解除指示。</h2>
	 * <pre>
	 * セット解除指示登録データの組み立てを行う
	 * エラーがない場合は、セット解除指示データを登録し、完了メッセージを設定する
	 *
	 * 登録データに次の値を設定する
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 * </pre>
	 * @param  dto セット解除指示画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
    public StatusDto register(StockSetReleaseDto dto) {
		// ===== 登録データ組み立て =====
		// ===== 在庫移動指示ヘッダ =====
		TMoveInstH moveInstH = new TMoveInstH();
		// ===== 在庫移動指示ボディ[入庫] =====
		List<TMoveInstB> moveInstBList = new ArrayList<TMoveInstB>();
		// ===== 在庫移動指示ボディ[出庫] =====
		TMoveInstB moveInstB = new TMoveInstB();

		// ===== 登録データを組み立てた結果をチェック =====
		registerCheck(dto, moveInstH, moveInstBList, moveInstB);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== セット解除指示 =====
		updateLogic.update(moveInstH, moveInstBList, moveInstB, errRetSts(StatusCode.UPDATE_FAILED));

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
	 * <h2>セット解除指示データの組み立て。</h2>
	 * <pre>
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 *
	 * </pre>
	 * @param dto セット解除指示画面用DTO
	 * @param header 在庫移動指示ヘッダ
	 * @param bodyList 在庫移動指示ボディ[入庫]
	 * @param body 在庫移動指示ボディ[出庫]
	 * @return StatusDto 処理結果DTO
	 */
	public StatusDto registerCheck(StockSetReleaseDto dto, TMoveInstH header, List<TMoveInstB> bodyList, TMoveInstB body) {
		// ===== 変数 =====
		int rowIndex = -1;
		MProductCB mProductCB = null;
		MStockType mStockType = null;
		MLocation mLocation = null;
		MCustomer deposit = null;

		// ===== Entity変換 =====
		TStockDtoMapper mapper = new TStockDtoMapper();
		//荷主センタ変更対応 201７.02.24 sja Start
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる - 指示数量取得元変更 2018.01.11 honma Delete
		//荷主センタ変更対応 201７.02.24 sja End
		TStock stock = mapper.mappingToEntity(dto.data.stock);
		List<TStock> releaseInput = mapper.mappingToEntityList(dto.data.releaseInput);

		// ===== 荷主Cd取得と荷主ID設定 =====
		MClient clientCondition = new MClient();
		// [#3332][Ver2.2] セット解除指示で親商品の在庫が必ず0になる 2018.01.10 honma Mod Start
		clientCondition.setClientCd(stock.getMClient().getClientCd());
		// [#3332][Ver2.2] セット解除指示で親商品の在庫が必ず0になる 2018.01.10 honma Mod End
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// ===== センタCd取得とセンタID設定 =====
		MCenter centerCondition = new MCenter();
		// [#3332][Ver2.2] セット解除指示で親商品の在庫が必ず0になる 2018.01.10 honma Mod Start
		centerCondition.setCenterCd(stock.getMLocation().getMCenter().getCenterCd());
		// [#3332][Ver2.2] セット解除指示で親商品の在庫が必ず0になる 2018.01.10 honma Mod End
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// ===== 処理区分マスタCDCd取得と処理区分マスタID設定 =====
		MProcessType mProcessType = new MProcessType();
		mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$31.code()); // セット解除指示
		mProcessType = processTypeLogic.getUkEntity(mProcessType);

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

		// 在庫リストデータ件数繰り返し、在庫移動指示ボディ[入庫]データを作成
		for(TStock list : releaseInput){
			rowIndex++;
			TMoveInstB moveInstB = new TMoveInstB();
			// ===== 商品ID取得 =====
			mProductCB = mproductBhv.newMyConditionBean();
			mProductCB.query().setProductCd_Equal(list.getMProduct().getProductCd());
			mProductCB.query().setClientId_Equal(clientId);
			MProduct mProduct = mproductBhv.selectEntity(mProductCB);
			mproductBhv.loadMProductShapeList(mProduct, new ConditionBeanSetupper<MProductShapeCB>() {
				// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
				@Override
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
			mStockType.setStockTypeCd(list.getMStockType().getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);

			// ===== ロケーションID取得 =====
			MLocationCB cb = mLocationBhv.newMyConditionBean();
			cb.setupSelect_MZone().withMWarehouse();
			cb.query().setLocationCd_Equal(list.getMLocation().getLocationCd());
			cb.query().setCenterId_Equal(centerId);
			mLocation = mLocationBhv.selectEntity(cb);
			if(mLocation == null){
				// ロケーションマスタがない場合の確認メッセージを設定
				getErrorManager().add(this.errRetSts(StatusCode.LOCATION_NOT_FOUND, rowIndex), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
				continue;
			}

			// ===== 預託ID =====
			deposit = new MCustomer();
			deposit.setClientId(clientId);
			deposit.setCustomerCd(list.getMCustomer().getCustomerCd());
			deposit = customerLogic.getUkEntity(deposit);

			// ===== 在庫移動指示ボディ[入庫]データ組み立て =====
			// 商品ID
			moveInstB.setProductId(mProduct.getProductId());
			// 商品CD
			moveInstB.setProductCd(mProduct.getProductCd());
			// 商品荷姿マスタデータ取得したの場合
			if (mProduct.getMProductShapeList().size() > 0){
				// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
				// 荷姿ID
				moveInstB.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getShapeId());
				// 入数
				//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.17 chou Mod Start
				// [#3347][Ver3.0] TODO残対応(UoM) - トラン系(在庫・棚卸)入数null対応 入数設定削除 2018.01.15 honma Delete
				//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.17 chou Mod End
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
			moveInstB.setLot(list.getTLot().getLot());
			// 期限日
			moveInstB.setLimitDt(list.getTLot().getLimitDt());
			// 指示数
			moveInstB.setInstNum(list.getChargeNum());
			// 倉庫ID
			moveInstB.setWarehouseId(mLocation.chaseMZone().chaseMWarehouse().getWarehouseId());
			// 倉庫CD
			moveInstB.setWarehouseCd(mLocation.chaseMZone().chaseMWarehouse().getWarehouseCd());
			// 入庫日
			moveInstB.setStoreDt(list.getTStoreNo().getStoreDt());

			bodyList.add(moveInstB);
		}

		// ====================
		// ===== 商品ID取得 =====
		mProductCB = mproductBhv.newMyConditionBean();
		mProductCB.query().setProductCd_Equal(stock.getMProduct().getProductCd());
		mProductCB.query().setClientId_Equal(clientId);
		MProduct mProduct = mproductBhv.selectEntity(mProductCB);
		mproductBhv.loadMProductShapeList(mProduct, new ConditionBeanSetupper<MProductShapeCB>() {
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod Start
			@Override
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
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MZone().withMWarehouse();
		cb.query().setLocationCd_Equal(stock.getMLocation().getLocationCd());
		cb.query().setCenterId_Equal(centerId);
		mLocation = mLocationBhv.selectEntity(cb);

		// ===== 預託ID =====
		deposit = new MCustomer();
		deposit.setClientId(clientId);
		deposit.setCustomerCd(stock.getMCustomer().getCustomerCd());
		deposit = customerLogic.getUkEntity(deposit);

		// ===== 在庫移動指示ボディ[出庫]データ組み立て =====
		// 商品ID
		body.setProductId(mProduct.getProductId());
		// 商品CD
		body.setProductCd(mProduct.getProductCd());
		// [ON推-CT113-020] 入庫NO.IDを追加する 2015.12.29 hayashi Start
		body.setStoreNoId(stock.getStoreNoId());
		// [ON推-CT113-020] 入庫NO.IDを追加する 2015.12.29 hayashi Start

		// 商品荷姿マスタデータ取得したの場合
		if (mProduct.getMProductShapeList().size() > 0){
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod start
			// 荷姿ID
			body.setShapeId(mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getShapeId());
			// 入数
			//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.17 chou Mod Start
			// [#3347][Ver3.0] TODO残対応(UoM) - トラン系(在庫・棚卸)入数null対応 入数設定削除 2018.01.15 honma Delete
			//[ON推-1.1.4-CT-089]CT指摘の修正対応 2016.06.17 chou Mod End
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Mod End
		}
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
		body.setLot(stock.getTLot().getLot());
		// 期限日
		body.setLimitDt(stock.getTLot().getLimitDt());
		// 指示数
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
		body.setInstNum(dto.data.instInput.getChargeNum());
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End
		// 引当可能数
		body.setChargeNum(stock.getChargeNum());
		// 倉庫ID
		body.setWarehouseId(mLocation.chaseMZone().chaseMWarehouse().getWarehouseId());
		// 倉庫CD
		body.setWarehouseCd(mLocation.chaseMZone().chaseMWarehouse().getWarehouseCd());
		// 入庫日
		body.setStoreDt(stock.getTStoreNo().getStoreDt());
		return null;
	}

	private static TStock chaseTStock() {
		return chaseTStockData(new TStock());
	}

	private static TStock chaseTStockData(TStock tStock) {
		if (tStock.getMProduct() == null) {
			tStock.setMProduct(new MProduct());
		}
		//荷主センタ変更対応 201７.02.24 sja Start
		if (tStock.getMProduct().getMClient() == null) {
			tStock.getMProduct().setMClient(new MClient());
		}
		//荷主センタ変更対応 201７.02.24 sja Ent
		if (tStock.getMProduct().getMProductShapeList().size() == 0) {
			tStock.getMProduct().getMProductShapeList().add(new MProductShape());
		}
		if (tStock.getMCustomer() == null) {
			tStock.setMCustomer(new MCustomer());
		}
		if (tStock.getMStockType() == null) {
			tStock.setMStockType(new MStockType());
		}
		if (tStock.getMStockType().getVDict() == null) {
			tStock.getMStockType().setVDict(new VDict());
		}
		if (tStock.getMLocation() == null) {
			tStock.setMLocation(new MLocation());
		}
		if (tStock.getTLot() == null) {
			tStock.setTLot(new TLot());
		}
		if (tStock.getTStoreNo() == null) {
			tStock.setTStoreNo(new TStoreNo());
		}
		return tStock;
	}
}

