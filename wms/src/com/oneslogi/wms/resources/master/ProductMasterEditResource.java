package com.oneslogi.wms.resources.master;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MShapeGrpDtlDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ProductMasterEditDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.TStockHandCheckLogic;
import com.oneslogi.wms.logic.common.TransactionDataCheckLogic;
import com.oneslogi.wms.logic.master.LocationMasterSelectLogic;
import com.oneslogi.wms.logic.master.ProductMasterInsertLogic;
import com.oneslogi.wms.logic.master.ProductMasterSelectLogic;
import com.oneslogi.wms.logic.master.ProductMasterUpdateLogic;
import com.oneslogi.wms.logic.master.ShapeGroupMasterSelectLogic;
import com.oneslogi.wms.logic.master.ShapeMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品マスタメンテナンス(編集)画面のリソースクラス。
 */
@Path("/master/productMasterEdit")
public class ProductMasterEditResource extends AbstractWmsResource {

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
		 * 商品CDで重複エラー
		 */
		protected static final int PRODUCT_CODE_DUPLICATE_ERROR = 2;
		/**
		 * 商品マスタメンテナンス(編集)データ取得異常
		 */
		protected static final int PRODUCT_NOT_FOUND_ERROR = 3;
		/**
		 * 登録異常
		 */
		protected static final int PRODUCT_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int PRODUCT_MASTER_UPDATE_FAILED = 5;
		/**
		 * 在庫データで存在エラー
		 */
		protected static final int STOCK_DATA_FOUND_ERROR = 6;
		/**
		 * 在庫チェック異常
		 */
		protected static final int STOCK_CHECK_ERROR = 7;
		/**
		 * JANCDで重複エラー
		 */
		protected static final int JAN_CODE_DUPLICATE_ERROR = 8;
		// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana Start
		/**
		 * 商品荷姿削除エラー
		 */
		protected static final int PRODUCT_SHAPE_DELETE_ERROR = 9;
		// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana End
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		/**
		 * ロケーションマスタの補充商品に使用している
		 */
		protected static final int LOCATION_REPLENISH_PRODUCT_IN_USED = 10;

		/**
		 *在庫データが存在するため、在庫管理単位が変更できません。
		 */
		protected static final int SHAPE_GROUP_CHANGED_ERROR = 11;

		/**
		 *入数が変更。
		 */
		protected static final int UNIT_NUM_IS_CHANGED = 12;
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		/**
		 * トランザクションデータ存在エラー
		 */
		protected static final int TRAN_DATA_FOUND_ERROR = 13;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
	}

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		PRODUCT_CODE_DUPLICATE_ERROR,
		JAN_CODE_DUPLICATE_ERROR,
		STOCK_DATA_FOUND_ERROR,
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		TRAN_DATA_FOUND_ERROR,
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana Start
		PRODUCT_SHAPE_DELETE_ERROR,
		// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana End
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		LOCATION_REPLENISH_PRODUCT_IN_USED,
		STOCK_DATA_IN_USED,
		UNIT_NUM_IS_CHANGED
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductLogic productLogic;
	@Inject
	private ClientLogic clientLogic;
	// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
//	@Inject
//	private ShapeLogic shapeLogic;
	// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
	@Inject
	private ProductMasterSelectLogic productMasterSelectLogic;
	@Inject
	private TStockHandCheckLogic tStockHandCheckLogic;
	@Inject
	private ProductMasterInsertLogic productMasterInsertLogic;
	@Inject
	private ProductMasterUpdateLogic productMasterUpdateLogic;

	// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
	@Inject
	private ShapeMasterSelectLogic shapeMasterSelectLogic;
	// [Ver3.0] unit of measure対応 2017.12.04 NING Del
	// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	@Inject
	private LocationMasterSelectLogic locationMasterSelectLogic;
	@Inject
	private ShapeGroupMasterSelectLogic shapeGroupMasterSelectLogic;
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・商品マスタメンテナンス(編集)明細の空行を新規作成
	 * ・追加用の空行を作成
	 * </pre>
	 * @return productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ProductMasterEditDto initNew() {

		ProductMasterEditDto productMasterEditDto = new ProductMasterEditDto();

		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
		MClient mclient = new MClient();
		mclient.setClientId(Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
		mclient = clientLogic.getPkEntity(mclient);

		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		MProductDtoMapper productMapper = new MProductDtoMapper();

		MProduct mProduct = new MProduct();
		mProduct.setMClient(mclient);
		// 荷主マスタ．荷姿グループIDと紐づく荷姿グループを取得する
		MClient clientWihtShapeGrp = clientLogic.getEntityWithShapeGrp(mclient, errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));
		if (clientWihtShapeGrp != null) {
			mProduct.setMShapeGrp(clientWihtShapeGrp.getMShapeGrp());

			// 荷姿マスタと商品荷姿マスタデータを取得する
			List<MShapeGrpDtl> shapeGrpDtlList = shapeMasterSelectLogic.selectProductShapeList(mclient.getClientCd(), clientWihtShapeGrp.getMShapeGrp().getShapeGrpCd(), null, errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));
			if (shapeGrpDtlList != null) {
				MShapeGrpDtlDtoMapper shapeGrpDtlMapper = new MShapeGrpDtlDtoMapper();
				productMasterEditDto.data.gridBody = shapeGrpDtlMapper.mappingToDtoList(shapeGrpDtlList);
			}
		}
		// 商品マスタ更新画面用DTOデータセット
		productMasterEditDto.data.head = productMapper.mappingToDto(mProduct);

		// [Ver3.0] unit of measure対応 2017.12.04 NING End

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del

		// 商品マスタ登録画面用DTOを作成
		return productMasterEditDto;

	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・商品マスタメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @param productId 商品ID
	 * @param clientId 荷主ID
	 * @return productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public ProductMasterEditDto initUpdate(@QueryParam("productId") Long productId,@QueryParam("clientId") Long clientId) {

		// 商品マスタメンテナンス(編集)データ取得の検索データ編集
		// エンティティ編集
		MProduct mProduct = new MProduct();
		mProduct.setProductId(productId);

		// 商品マスタメンテナンス(編集)データ取得
		List<MProduct> list = productMasterSelectLogic.selectById(mProduct, errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));

		MClient mclient = new MClient();
		mclient.setClientId(list.get(0).getClientId());
		mclient = clientLogic.getPkEntity(mclient);
		list.get(0).setMClient(mclient);
		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		MProductDtoMapper productMapper = new MProductDtoMapper();
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
//		MProductShapeDtoMapper productShapeMapper = new MProductShapeDtoMapper();
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End

		// 商品マスタ更新画面用DTOデータセット
		ProductMasterEditDto productMasterEditDto = new ProductMasterEditDto();
		list.get(0).getMShapeGrp().setShapeGrpCd(list.get(0).getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getShapeGrpCd());
		productMasterEditDto.data.head = productMapper.mappingToDto(list.get(0));
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del

		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		List<MShapeGrpDtl> shapeGrpDtlList = shapeMasterSelectLogic.selectProductShapeList(mclient.getClientCd(), list.get(0).getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getShapeGrpCd(), list.get(0).getProductCd(), errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));

		if (shapeGrpDtlList != null) {
			MShapeGrpDtlDtoMapper shapeGrpDtlMapper = new MShapeGrpDtlDtoMapper();
			productMasterEditDto.data.gridBody = shapeGrpDtlMapper.mappingToDtoList(shapeGrpDtlList);
		}
		// [Ver3.0] unit of measure対応 2017.12.04 NING End

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
		return productMasterEditDto;
	}

	/**
	 * <h2>入力チェック（新規と更新）。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ProductMasterEditDto productMasterEditDto) {

		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正 2017.05.31 kawana Start
		// Entity変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterEditDto.data.head);

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		MShapeGrpDtlDtoMapper shapeGrpDtlMapper = new MShapeGrpDtlDtoMapper();
		List<MShapeGrpDtl> shapeGrpDtlList =shapeGrpDtlMapper.mappingToEntityList(productMasterEditDto.data.gridBody);
		// データの設定とチェック
		ResultSetupData resultStatus = setupInputCheck(header, shapeGrpDtlList);
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正 2017.05.31 kawana End

		switch (resultStatus) {
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		default:
			break;
		}

		return null;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 * <pre>
	 * 商品CD重複チェックを行う
	 * 共通在庫存在チェック
	 * </pre>
	 * @param productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 *
	 */
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	private ResultSetupData setupInputCheck(MProduct header, List<MShapeGrpDtl> shapeGrpDtlList) {
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		boolean isProductId = false;
		boolean tStockCheck = false;
		boolean isJanCd = false;
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		boolean isReplenishProductInUsed = false;
		boolean isShapeGrpChaged = false;
		boolean unitNumChanged = false;
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		boolean existTran = false;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正(不要なコード削除) 2017.05.31 kawana

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		header.setClientId(mClient.getClientId());


		// 商品IDがNULLの場合、商品CD重複チェックとJANCD重複チェック処理を行う
		if (header.getProductId() == null) {
			// 登録の場合
			// 商品CD重複チェック
			isProductId = productLogic.checkProductCdInsert(header, errRetSts(StatusCode.PRODUCT_CODE_DUPLICATE_ERROR));
			if(isProductId == false){
				// JANCD重複チェック
				if((header.getJanCd()) != null){
					isJanCd = productLogic.checkJanCdInsert(header, errRetSts(StatusCode.JAN_CODE_DUPLICATE_ERROR));
				}
			}

			MClient mclient = new MClient();
			mclient.setClientId(header.getClientId());
			mclient = clientLogic.getPkEntity(mclient);

			// 選択した在庫管理単位（荷姿グループCD）により、荷姿グループ取得
			MShapeGrp shapeGrp = shapeGroupMasterSelectLogic.selectByClientIdAndGrpCd(mClient.getClientId(), header.getMShapeGrp().getShapeGrpCd());

			header.setMShapeGrp(shapeGrp);
			header.setShapeGrpId(shapeGrp.getShapeGrpId());

		} else {
			// 更新の場合
			// JANCD重複チェック
			if((header.getJanCd()) != null){
				isJanCd = productLogic.checkJanCdInsert(header, errRetSts(StatusCode.JAN_CODE_DUPLICATE_ERROR));
			}
			// 削除フラグが'1'の場合、共通在庫存在チェック処理を行う
				if(isProductId == false){
					if (header.isDelFlg$1()) {
						// 共通在庫存在チェックのチェックデータ編集
						TStock tStock = new TStock();
						tStock.setClientId(header.getClientId());
						tStock.setProductId(header.getProductId());
						tStock.setLocationId(null);
						MWarehouse mWarehouse = new MWarehouse();
						mWarehouse.setCenterId(null);
						mWarehouse.setWarehouseId(null);
						// 在庫チェックメソッドを呼出し
						tStockCheck = tStockHandCheckLogic.checkData(tStock, mWarehouse, errRetSts(StatusCode.STOCK_CHECK_ERROR));

						// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
						// トランザクション存在チェック
						existTran = transactionDataCheckLogic.existTran(header);
						// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
					}
				}

			// [Ver3.0] unit of measure対応 2017.12.04 NING Start
			// 商品マスタメンテナンス(編集)データ取得の検索データ編集
			// エンティティ編集
			MProduct mProduct = new MProduct();
			mProduct.setProductId(header.getProductId());

			// 商品マスタメンテナンス(編集)データ取得
			List<MProduct> list = productMasterSelectLogic.selectById(mProduct, errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));

			MClient mclient = new MClient();
			mclient.setClientId(list.get(0).getClientId());
			mclient = clientLogic.getPkEntity(mclient);
			list.get(0).setMClient(mclient);

			// 元商品の荷姿グループ
			Long oldShapeGrpId = list.get(0).getShapeGrpId();

			// 選択した在庫管理単位（荷姿グループCD）により、荷姿グループ取得
			MShapeGrp shapeGrp = shapeGroupMasterSelectLogic.selectByClientIdAndGrpCd(mClient.getClientId(), header.getMShapeGrp().getShapeGrpCd());

			// 在庫管理単位が変更する場合
			// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
			if (!CU.isNotNullAndEquals(shapeGrp.getShapeGrpId(), oldShapeGrpId)) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

				// ロケーションマスタの補充商品に使用しているかどうかをチェックする
				List<MLocation> result = locationMasterSelectLogic.selectByReplenishProductCd(mclient.getClientCd(), list.get(0).getProductCd());
				if (result.size() > 0) {
					isReplenishProductInUsed = true;
					// 在庫存在チェックのメッセージを設定
					getErrorManager().add(errRetSts(StatusCode.LOCATION_REPLENISH_PRODUCT_IN_USED), WmsMessageConst.PRODUCT_SHAPE_GRP_CANNOT_UPDATE_USE_LOCATION_ERROR, result.get(0).getLocationCd());
				} else {
					// データが存在しないメッセージクリア。
					getErrorManager().clear();
				}
			}

			// 入数が変更されるかどうか判断
			List<MShapeGrpDtl> oldShapeGrpDtlList = shapeMasterSelectLogic.selectProductShapeList(mclient.getClientCd(), list.get(0).getMShapeGrp().getShapeGrpCd(), list.get(0).getProductCd(), errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));
			for (Iterator<MShapeGrpDtl> iterator = oldShapeGrpDtlList.iterator(); iterator.hasNext();) {
				MProductShape oldProductShape = iterator.next().getMProductShapeList().get(0);
				for (Iterator<MShapeGrpDtl> iterator2 = shapeGrpDtlList.iterator(); iterator2.hasNext();) {
					MProductShape newProductShape = iterator2.next().getMProductShapeList().get(0);

					// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
					// 入数が変更されるかどうか判断
					if (CU.isNotNullAndEquals(oldProductShape.getProductShapeId(), newProductShape.getProductShapeId())) {
						if (!CU.isNotNullAndEquals(oldProductShape.getUnitNum(), newProductShape.getUnitNum())) {
							// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

							unitNumChanged = true;
							break;
						}
					}
				}
				// 入数が変更される
				if (unitNumChanged) {
					break;
				}
			}

			// 在庫管理単位もしくは入数が変更される場合
			// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
			if (!CU.isNotNullAndEquals(shapeGrp.getShapeGrpId(), oldShapeGrpId) || unitNumChanged) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

				// 在庫データ取得処理を呼出し、在庫が存在する場合、在庫管理単位が変更されている場合、エラーメッセージを表示する
				TStock tStock = new TStock();
				tStock.setClientId(header.getClientId());
				tStock.setProductId(header.getProductId());
				// 在庫数のチェック処理を行う。
				boolean tStockExisted = tStockHandCheckLogic.checkDataExist(tStock, errRetSts(StatusCode.STOCK_CHECK_ERROR));

				// 在庫が存在する場合
				if (tStockExisted) {

					// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
					if (!CU.isNotNullAndEquals(shapeGrp.getShapeGrpId(), oldShapeGrpId)) {
						// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

						// 在庫管理単位が変更されている場合、エラーメッセージを表示する

						isShapeGrpChaged = true;
					}
				} else {
					// 在庫が存在しない場合、入数が変更されるアラートを表示されない
					unitNumChanged = false;
				}


			}
		}
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
		// ===== 結果の設定 =====

		ResultSetupData resultStatus;
		if (isProductId) {
			resultStatus = ResultSetupData.PRODUCT_CODE_DUPLICATE_ERROR;
		} else if (isJanCd) {
			resultStatus = ResultSetupData.JAN_CODE_DUPLICATE_ERROR;
		} else if (tStockCheck) {
			resultStatus = ResultSetupData.STOCK_DATA_FOUND_ERROR;
			// [Ver3.0] unit of measure対応 2017.12.04 NING Del
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		} else if (existTran) {
			resultStatus = ResultSetupData.TRAN_DATA_FOUND_ERROR;
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
			// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		} else if (isReplenishProductInUsed) {
			// 在庫管理単位はロケーションの補充商品に使用しているため、変更できません。
			resultStatus = ResultSetupData.LOCATION_REPLENISH_PRODUCT_IN_USED;
		} else if (isShapeGrpChaged) {
			// 在庫データが存在するため、在庫管理単位が変更できません。
			resultStatus = ResultSetupData.STOCK_DATA_IN_USED;
		} else if (unitNumChanged) {
			// 入数が変更されている
			resultStatus = ResultSetupData.UNIT_NUM_IS_CHANGED;
			// [Ver3.0] unit of measure対応 2017.12.04 NING End
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		switch (resultStatus) {
		case PRODUCT_CODE_DUPLICATE_ERROR:
			// 商品CD重複のメッセージを設定
			break;
		case JAN_CODE_DUPLICATE_ERROR:
			// JANCD重複のメッセージを設定
			break;
			// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		case LOCATION_REPLENISH_PRODUCT_IN_USED:
			// 在庫管理単位はロケーションの補充商品に使用しているため、変更できません。
			break;
		case STOCK_DATA_IN_USED:
			// 在庫存在チェックのメッセージを設定
			getErrorManager().add(errRetSts(StatusCode.SHAPE_GROUP_CHANGED_ERROR), WmsMessageConst.SHAPE_GROUP_CHANGED_ERROR);
			break;
		case UNIT_NUM_IS_CHANGED:
			//入数が変更されている場合、警告メッセージを表示する
			getWarnManager().add(warnRetSts(StatusCode.UNIT_NUM_IS_CHANGED), WmsMessageConst.UNIT_NUM_CHANGED_WARN);
			break;
			// [Ver3.0] unit of measure対応 2017.12.04 NING End
		case STOCK_DATA_FOUND_ERROR:
			// 在庫存在チェックのメッセージを設定
			getErrorManager().add(errRetSts(StatusCode.STOCK_DATA_FOUND_ERROR), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			break;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		case TRAN_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
			break;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		default:
			break;
		}

		return resultStatus;
	}

	/**
	 * <h2>商品マスタ登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに商品マスタと商品荷姿マスタを登録し、完了メッセージを設定する
	 * </pre>
	 * @param productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ProductMasterEditDto productMasterEditDto) {

		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正 2017.05.31 kawana Start
		// Entity変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterEditDto.data.head);

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		MShapeGrpDtlDtoMapper shapeGrpDtlMapper = new MShapeGrpDtlDtoMapper();
		List<MShapeGrpDtl> shapeGrpDtlList =shapeGrpDtlMapper.mappingToEntityList(productMasterEditDto.data.gridBody);

		// データの設定とチェック
		ResultSetupData resultStatus = setupInputCheck(header, shapeGrpDtlList);
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正 2017.05.31 kawana End

		// 結果判定
		if (resultStatus != ResultSetupData.ALL_OK && resultStatus != ResultSetupData.UNIT_NUM_IS_CHANGED) {
			return null;
		} else {
			getInfoManager().clear();
		}

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del

		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正(荷主取得処理を削除) 2017.05.31 kawana

		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
		// 商品マスタ登録メソッドを呼出し
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		productMasterInsertLogic.insert(header, shapeGrpDtlList, errRetSts(StatusCode.PRODUCT_MASTER_INSERT_FAILED));
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
		// エラーの場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	/**
	 * <h2>商品マスタ更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに商品マスタと商品荷姿マスタを更新し、完了メッセージを設定する
	 * </pre>
	 * @param productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(ProductMasterEditDto productMasterEditDto) {

		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正 2017.05.31 kawana Start
		// Entity変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterEditDto.data.head);

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		MShapeGrpDtlDtoMapper shapeGrpDtlMapper = new MShapeGrpDtlDtoMapper();
		List<MShapeGrpDtl> shapeGrpDtlList =shapeGrpDtlMapper.mappingToEntityList(productMasterEditDto.data.gridBody);

		// データの設定とチェック
		ResultSetupData resultStatus = setupInputCheck(header, shapeGrpDtlList);
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正 2017.05.31 kawana End

		// 結果判定
		if (resultStatus != ResultSetupData.ALL_OK && resultStatus != ResultSetupData.UNIT_NUM_IS_CHANGED) {
			return null;
		} else if (resultStatus == ResultSetupData.UNIT_NUM_IS_CHANGED) {
			// 入数が変更アラートが表示しない。
			getWarnManager().clear();
		}

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del

		// [#1836] ログイン荷主とは別荷主の商品のピース荷姿が多重登録されてしまう問題を修正(荷主取得処理を削除) 2017.05.31 kawana

		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
		// 商品マスタ更新メソッドを呼出し
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		productMasterUpdateLogic.update(header, shapeGrpDtlList, errRetSts(StatusCode.PRODUCT_MASTER_UPDATE_FAILED));
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End

		// エラーの場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫管理単位が変更後、選択中の在庫管理単位に紐付く商品荷姿を選択する。
	 * </pre>
	 * @param productId 商品ID
	 * @param clientId 荷主ID
	 * @param shapeGrpCd 荷姿グループCD
	 * @return productMasterEditDto 商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/getProductShapeList")
	public ProductMasterEditDto getProductShapeList(@QueryParam("productId") Long productId, @QueryParam("clientId") Long clientId, @QueryParam("shapeGrpCd") String shapeGrpCd) {

		ProductMasterEditDto productMasterEditDto = new ProductMasterEditDto();

		List<MShapeGrpDtl> shapeGrpDtlList = null;

		// 変更場合
		if(productId != null) {

			if (shapeGrpCd != null) {
				// エンティティ編集
				MProduct mProduct = new MProduct();
				mProduct.setProductId(productId);

				// 商品マスタメンテナンス(編集)データ取得
				List<MProduct> list = productMasterSelectLogic.selectById(mProduct, errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));

				MClient mclient = new MClient();
				mclient.setClientId(list.get(0).getClientId());
				mclient = clientLogic.getPkEntity(mclient);
				list.get(0).setMClient(mclient);

				// 荷姿マスタと商品荷姿マスタデータを取得する
				shapeGrpDtlList = shapeMasterSelectLogic.selectProductShapeList(mclient.getClientCd(), shapeGrpCd, list.get(0).getProductCd(), errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));
			}
		} else {
			if (shapeGrpCd != null) {
				// 新規場合
				MClient mclient = new MClient();
				mclient.setClientId(Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
				mclient = clientLogic.getPkEntity(mclient);

				// 荷姿マスタと商品荷姿マスタデータを取得する
				shapeGrpDtlList = shapeMasterSelectLogic.selectProductShapeList(mclient.getClientCd(), shapeGrpCd, null, errRetSts(StatusCode.PRODUCT_NOT_FOUND_ERROR));
			}
		}
		if (shapeGrpDtlList != null) {
			MShapeGrpDtlDtoMapper shapeGrpDtlMapper = new MShapeGrpDtlDtoMapper();
			productMasterEditDto.data.gridBody = shapeGrpDtlMapper.mappingToDtoList(shapeGrpDtlList);
			productMasterEditDto.data.decimalExistFlg = shapeGrpDtlList.get(0).getMShapeGrp().getDecimalExistFlg();
		}

		return productMasterEditDto;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
}
