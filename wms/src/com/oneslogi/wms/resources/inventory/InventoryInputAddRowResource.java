package com.oneslogi.wms.resources.inventory;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.inventory.InventoryInputAddRowDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;
import com.oneslogi.wms.logic.common.LotLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.inventory.InventoryInputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸入力(行追加)画面のリソースクラス。
 */
@Path("/inventory/inventoryInputAddRow")
public class InventoryInputAddRowResource extends AbstractWmsResource {

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
		protected static final int PRODUCT_MASTER_CHECK_FAILED = 2;
		/**
		 * 仕入先マスタ存在異常
		 */
		protected static final int CUSTOMER_MASTER_CHECK_FAILED = 3;
		/**
		 * ロット期限日チェック異常
		 */
		protected static final int LOT_LIMIT_DT_CHECK_FAILED = 4;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_CHECK_FAILED = 5;

		/**
		 * ロット存在異常
		 */
		protected static final int LOT_CHECK_FAILED = 6;

		/**
		 * 入庫ラベルNo.存在異常
		 */
		protected static final int ONS_LABEL_NUMBER_CHECK_FAILED = 7;

		// ===== 以降はマスタ異常以外のステータスコード(jsでcode < 7の判定あり) =====

		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start
		/**
		 * データ存在チェック
		 */
		protected static final int EXIST_CHECK_FAILED = 8;
		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End
	}

	// ===== 使用ロジッククラス =====

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
	private ZoneLogic zoneLogic;
	@Inject
	private ProductLogic productLogic;
	// [#4705][v3.0] 入庫ラベルNo.を非表示に設定(不要になった変数storeNoLogicを削除) 2018.06.11 kawana Delete
	@Inject
	private LotLimitCheckLogic lotLimitCheckLogic;
	// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana Start
	@Inject
	private LotLogic lotLogic;
	// [#4705][v3.0] 入庫ラベルNo.を非表示に設定(不要になった変数paramLogic, stockUpdateCheckLogicを削除) 2018.06.11 kawana Delete
	// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana End
	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start
	@Inject
	private InventoryInputSelectLogic selectLogic;
	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryInputAddRowDto 棚卸入力(行追加)画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryInputAddRowDto init() {

		//棚卸入力(行追加)画面用DTOを作成
		InventoryInputAddRowDto tInventoryAddRowData = new InventoryInputAddRowDto();

		return tInventoryAddRowData;
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
	 * </pre>
	 * @param tInventoryAddRowDto 棚卸入力(行追加)画面用DTO
	 * @return InventoryInputAddRowDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	//荷主センタ変更対応 201７.02.24 sja Start
	public InventoryInputAddRowDto inputCheck(InventoryInputAddRowDto tInventoryAddRowDto) {
	//荷主センタ変更対応 201７.02.24 sja End

		//棚卸ヘッダ
		TInventoryHDtoMapper headMapper = new TInventoryHDtoMapper();
		TInventoryH head = headMapper.mappingToEntity(tInventoryAddRowDto.data.head);

		//棚卸ボディ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(tInventoryAddRowDto.data.body);

		// 登録データの組み立て
		setupData(head, body);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start

		// 棚卸追加データDB未存在チェック
		selectLogic.checkAlreadyExistData(head, body, errRetSts(StatusCode.EXIST_CHECK_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

		//荷主センタ変更対応 201７.02.24 sja Start
		tInventoryAddRowDto.data.head = headMapper.mappingToDto(head);
		return tInventoryAddRowDto;
		//荷主センタ変更対応 201７.02.24 sja End
	}

	/**
	 * <h2>登録または更新データの組み立て。</h2>
	 *  * <pre>
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 * 【棚卸ヘッダ】
	 * ・荷主ID
	 * ・センタID
	 * 【棚卸ボディ】
	 * ・商品ID
	 * ・ロケーションID
	 * ・仕入先ID（仕入先CDが入力されているときのみ）
	 * 次の場合、エラーとして扱い、エラーステータス、エラーメッセージCDを設定する
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 * ・ロケーションマスタに存在しない
	 * ・取引先マスタに存在しない
	 * ・ロット・期限日入力不正
	 * 戻り値を下記のように設定する
	 * チェックエラー : 商品マスタ存在異常、仕入先マスタ存在異常、ロケーションマスタ存在異常、ロット・期限日入力チェック異常
	 * チェック正常 : 正常
	 * </pre>
	 * @param header 棚卸ヘッダ
	 * @param body 棚卸ボディ
	 */
	protected void setupData(TInventoryH header, TInventoryB body) {

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(header.getMCenter().getCenterCd());
		//荷主センタ変更対応 2017.02.24 sja Start
		header.setMCenter(centerLogic.getUkEntityWithDeletedCheck(centerCondition));
		//荷主センタ変更対応 2017.02.24 sja End
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start
		header.setCenterId(centerId);
		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getMClient().getClientCd());
		//荷主センタ変更対応 2017.02.24 sja Start
		header.setMClient(clientLogic.getUkEntityWithDeletedCheck(clientCondition));
		//荷主センタ変更対応 2017.02.24 sja End
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start
		header.setClientId(clientId);
		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

		// =======================================================
		// =                     ボディ組立                      =
		// =======================================================
		//商品マスタの存在チェック
		// 商品IDを設定
		MProduct productCondition = new MProduct();
		productCondition.setClientId(clientId);
		productCondition.setProductCd(body.getMProduct().getProductCd());
		MProduct product = productLogic.getUkEntity(productCondition);

		if (product == null) {
			// 商品IDを設定
			body.setProductId(null);

			//エラーメッセージをエラー管理クラスに登録
			this.getErrorManager().add(new ErrorStatus(StatusCode.PRODUCT_MASTER_CHECK_FAILED), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR,"productCd");
			// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana Start
			return;

		}

		final long productId = product.getProductId();

		// 商品IDを設定
		body.setProductId(productId);

		// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana End

		//荷主ID
		MClient mClientParam = new MClient();
		mClientParam.setClientId(clientId);
		//商品マスタ
		MProduct mProductParam = new MProduct();
		mProductParam.setProductCd(body.getMProduct().getProductCd());

		//ロット
		TLot tLotParam = new TLot();
		tLotParam.setLot(body.getLot());
		tLotParam.setLimitDt(body.getLimitDt());
		// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana Start
		tLotParam.setProductId(productId);

		// ロットID設定
		TLot lot = lotLogic.getUkEntity(tLotParam);
		if (lot != null) {
			body.setLotId(lot.getLotId());
		}

		// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana End

		//実績数
		BigDecimal num = body.getInventoryNum();

		//ロット・期限日入力チェック
		if (product != null){
			if(body.getMProduct().isLotManagFlg$1() && CU.isNullOrEmpty(body.getLot())){
				lotLimitCheckLogic.check(mClientParam,mProductParam,tLotParam,num,errRetSts(StatusCode.LOT_CHECK_FAILED));
			}
			if (body.getMProduct().isLimitDtManagFlg$1() && CU.isNullOrEmpty(body.getLimitDt())){
				lotLimitCheckLogic.check(mClientParam,mProductParam,tLotParam,num,errRetSts(StatusCode.LOT_LIMIT_DT_CHECK_FAILED));
			}
		}

		//ロケーションマスタの存在チェック
		MLocation locationCondition = new MLocation();
		locationCondition.setCenterId(centerId);
		locationCondition.setLocationCd(body.getMLocation().getLocationCd());
		MLocation location = locationLogic.getUkEntity(locationCondition);

		if (location == null) {
			// ロケーションIDを設定
			body.setLocationId(null);

			//エラーメッセージをエラー管理クラスに登録
			this.getErrorManager().add(new ErrorStatus(StatusCode.LOCATION_CHECK_FAILED), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana Start
			return;
			// [#4285] 入庫ラベルNo.チェックを追加 2018.04.13 kawana End

		} else {

			// ロケーションIDを設定
			body.setLocationId(location.getLocationId());
			if (!CU.isNullOrEmpty(Long.toString(location.getZoneId()))) {
				MZone mZoneCondition = new MZone();
				mZoneCondition.setZoneId(location.getZoneId());
				mZoneCondition = zoneLogic.getPkEntity(mZoneCondition);
			}
		}

		//仕入先CDが入力した場合、仕入先CDが取引先マスタの存在チェック
		//仕入先IDの取得
		if (!CU.isNullOrEmpty(body.getMCustomerBySupplierId().getCustomerCd())) {
			MCustomer mCustomerCondition = new MCustomer();
			mCustomerCondition.setClientId(clientId);
			mCustomerCondition.setCustomerCd(body.getMCustomerBySupplierId().getCustomerCd());
			mCustomerCondition.setVendorFlg_$1();
			MCustomer mSupply = customerLogic.getUkEntity(mCustomerCondition);

			if (mSupply == null) {
				// 仕入先IDを設定
				body.getTStoreNo().setSupplierId(null);

				//エラーメッセージをエラー管理クラスに登録
				this.getErrorManager().add(new ErrorStatus(StatusCode.CUSTOMER_MASTER_CHECK_FAILED), WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);

			} else {

				// 仕入先IDを設定
				body.getTStoreNo().setSupplierId(mSupply.getCustomerId());
				// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start
				body.setSupplierId(mSupply.getCustomerId());
				// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End
			}
		}

		// 預託ID取得
		MCustomer mCustomer = new MCustomer();
		mCustomer.setClientId(clientId);
		mCustomer.setCustomerCd(body.getMCustomerByDepositId().getCustomerCd());
		mCustomer = customerLogic.getUkEntity(mCustomer);
		body.setDepositId(mCustomer.getCustomerId());

		// 在庫区分ID
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(body.getMStockType().getStockTypeCd());
		mStockType = stockTypeLogic.getUkEntity(mStockType);
		body.setStockTypeId(mStockType.getStockTypeId());

		// [#4705][v3.0] 入庫ラベルNo.を非表示に設定(入庫ラベルNo.のチェック処理を削除) 2018.06.11 kawana Delete
	}
}
