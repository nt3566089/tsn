package com.oneslogi.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingInputNoPlanDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.LotLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstErrorCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstInsertLogic;
import com.oneslogi.wms.logic.shipping.StockDataSelectLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.logic.shipping.WorkOrderLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 出荷実績入力(予定なし)画面のリソースクラス。
 */
@Path("/shipping/shippingInputNoPlan")
public class ShippingInputNoPlanResource extends AbstractWmsResource {

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
		 * 出荷指示登録処理異常
		 */
		protected static final int ADD_EXCEPTION = 2;
		/**
		 * 出庫指示処理異常
		 */
		protected static final int PICKING_EXCEPTION = 3;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_EXCEPTION = 4;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_EXCEPTION = 5;
		/**
		 * 在庫数データ取得異常
		 */
		protected static final int GET_STOCK_EXCEPTION = 6;
		/**
		 * 商品マスタデータ取得異常
		 */
		protected static final int GET_PRODUCT_EXCEPTION = 7;
		/**
		 * 取引先マスタ存在異常
		 */
		protected static final int SUPPLY_CUSTOMER_EXCEPTION = 8;
		/**
		 * 配送コースマスタ存在異常
		 */
		protected static final int DELIVERY_COURSE_FOUND_EXCEPTION = 9;
		/**
		 * 出荷実績登録処理異常
		 */
		protected static final int SHIPPING_REGISTER_EXCEPTION = 10;
		/**
		 * ロットマスタデータ取得異常
		 */
		protected static final int LOT_FOUND_EXCEPTION = 11;
		//[検査-202] チェック時処理を追加します。 2014.12.02 KI Start
		/**
		 * 在庫不足
		 */
		protected static final int SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR = 12;
		//[検査-202] チェック時処理を追加します。 2014.12.02 KI End
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.24 kawana Start
		/**
		 * 届先住所未入力
		 */
		protected static final int DELIVERY_ADDRESS_NO_INPUT = 13;
		/**
		 * 取引先マスタ存在異常(届先)
		 */
		protected static final int DELIVERY_CUSTOMER_FOUND_EXCEPTION = 14;
		/**
		 * 顧客出荷指示No.重複異常
		 */
		protected static final int CLIENT_SHIPPING_NO_DUPLICATE_EXCEPTION = 15;
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.24 kawana End
		// [EC-CT1-192] エラーチェックを追加 2015.04.09 kawana Start
		/**
		 * 郵便番号マスタ存在異常
		 */
		protected static final int ZIP_CD_FOUND_EXCEPTION = 16;
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 17;
		// [EC-CT1-192] エラーチェックを追加 2015.04.09 kawana End
		// コントロールNoクリア処理追加 2016.4.25 nayzaw Start
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 18;
		// コントロールNoクリア処理追加 2016.4.25 nayzaw End
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
		/**
		 * 指示数小数桁数異常
		 */
		protected static final int INST_NUM_DECIMAL_CHECK_FAILED = 19;
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ShippingInstInsertLogic shippingInstInsertLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private WorkOrderLogic workOrderLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private LotLogic lotLogic;
	@Inject
	private StockDataSelectLogic stockDataSelectLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	// [EC-CT1-192] エラーチェックを追加 2015.04.09 kawana Start
	@Inject
	private ShippingInstErrorCheckLogic shippingInstErrorCheckLogic;
	@Inject
	private ZipLogic zipLogic;
	// [EC-CT1-192] エラーチェックを追加 2015.04.09 kawana End
	// コントロールNoクリア処理追加 2016.4.25 nayzaw Start
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	// コントロールNoクリア処理追加 2016.4.25 nayzaw End
	// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End

	//[検査-202] チェック時処理を追加します。 2014.12.02 KI Start
	/**
	 * 新規登録データ組立の結果
	 */
	private enum ResultSetupRegisterData {
		CHARGE_NUM_DATA_FAILED
	}

	private ResultSetupRegisterData resultStatus;

	//[検査-202] チェック時処理を追加します。 2014.12.02 KI End
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ShippingInputNoPlanDto 出荷実績入力(予定なし)画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingInputNoPlanDto init() {
		return new ShippingInputNoPlanDto();

	}

	/**
	 * <h2>出荷実績登録</h2>
	 * <pre>
	 * エラーがない場合は、出荷指示ヘッダと出荷指示ボディを登録し、完了メッセージを設定する。
	 * </pre>
	 * @param shippingInputNoPlanDto 出荷実績入力(予定なし)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStartEnd("ShippingInputNoPlan")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public StatusDto register(ShippingInputNoPlanDto shippingInputNoPlanDto) {

		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH header = headerMapper.mappingToEntity(shippingInputNoPlanDto.data.head);

		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> bodyList = bodyMapper.mappingToEntityList(shippingInputNoPlanDto.data.list);

		//チェック処理
		setupRegisterData(header, bodyList, errRetSts(StatusCode.SHIPPING_REGISTER_EXCEPTION));

		if (getErrorManager().size() > 0) {
			return null;
		}

		//荷主ID
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());

		//センタID取得
		String centerCd = header.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		// [C-CWMS-0021] 納品先、届先の設定はsetupRegisterDataメソッド行うためここから削除 2015.03.24 kawana

		//配送コースID
		String deliveryCourseCd = header.getDeliveryCourseCd();
		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
		mDeliveryCourse.setDeliveryCourseCd(deliveryCourseCd);
		mDeliveryCourse.setCenterId(mCenter.getCenterId());
		mDeliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourse);
		header.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());

		for (int row = 0; row < bodyList.size(); row++) {
			//在庫区分ID
			String stockTypeCd = bodyList.get(row).getStockTypeCd();
			MStockType mStockType = new MStockType();
			//			mStockType.setClientId(mClient.getClientId());
			mStockType.setStockTypeCd(stockTypeCd);
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			bodyList.get(row).setStockTypeId(mStockType.getStockTypeId());

			//指定倉庫ID
			String locationCd = bodyList.get(row).getLocationCd();
			MLocation mLocation = new MLocation();
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation.setLocationCd(locationCd);
			mLocation = locationLogic.getUkEntity(mLocation);
			bodyList.get(row).setLocationId(mLocation.getLocationId());

			if (mLocation.getZoneId() != null) {
				MZone mZone = new MZone();
				mZone.setZoneId(mLocation.getZoneId());
				mZone = zoneLogic.getPkEntity(mZone);

				if (mZone != null) {
					if (mZone.getWarehouseId() != null) {
						MWarehouse mWarehouse = new MWarehouse();
						mWarehouse.setWarehouseId(mZone.getWarehouseId());
						mWarehouse = warehouseLogic.getPkEntity(mWarehouse);

						if (mWarehouse != null) {
							bodyList.get(row).setWarehouseId(mWarehouse.getWarehouseId());
							// [品質-102-013] 倉庫CDを設定 2015.04.07 kawana Start
							bodyList.get(row).setWarehouseCd(mWarehouse.getWarehouseCd());
							// [品質-102-013] 倉庫CDを設定 2015.04.07 kawana End
						}
					}
				}
			}

			//商品ID
			MProduct mProduct = new MProduct();
			mProduct.setClientId(mClient.getClientId());
			mProduct.setProductCd(bodyList.get(row).getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);
			bodyList.get(row).setProductId(mProduct.getProductId());

			//			//指定ロットID
			//			String lot = bodyList.get(row).getLot();
			//			TLot tLot = new TLot();
			//			tLot.setProductId(mProduct.getProductId());
			//			tLot.setLot(lot);
			//			tLot.setLimitDt(bodyList.get(row).getLimitDt());
			//			tLot = lotLogic.getUkEntity(tLot);
			//
			//			if (tLot != null) {
			//				bodyList.get(row).setLotId(tLot.getLotId());
			//			}

			//預託ID
			String depositCd = bodyList.get(row).getDepositCd();
			MCustomer mCustomer = new MCustomer();
			mCustomer.setCustomerCd(depositCd);
			mCustomer.setClientId(mClient.getClientId());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			bodyList.get(row).setDepositId(mCustomer.getCustomerId());
		}

		//処理区分ID
		String processTypeCd = header.getMProcessType().getProcessTypeCd();
		MProcessType mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(processTypeCd);
		mProcessType = processTypeLogic.getUkEntity(mProcessType);
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		header.setShippingStatus_$10();

		for (TShippingInstB tShippingInstB : bodyList)
		{
			tShippingInstB.setAllocNum(WCC.ZERO);
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		header.setControlNo(controlNo);

		header.setInputType_$00();

		//出荷伝票No.を登録する直前に採番
		header.setShippingSlipNo(numberingCenterLogic.getNumbering(header.getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));

		//出荷指示登録処理
		shippingInstInsertLogic.insert(header, bodyList, errRetSts(StatusCode.ADD_EXCEPTION));

		if (getErrorManager().size() > 0) {
			return null;
		}

		// [EC-CT1-192] エラーチェックを追加 2015.04.09 kawana Start
		// エラーチェック
		// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw Start
		shippingInstErrorCheckLogic.check(null, header.getShippingInstHId(), errRetSts(StatusCode.ERROR_CHECK_ERROR));
//		boolean isDataError = shippingInstErrorCheckLogic.check(header, errRetSts(StatusCode.ERROR_CHECK_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}
//		if (isDataError) {
//			getErrorManager().add(errRetSts(StatusCode.ERROR_CHECK_ERROR), header.getErrorMessageCd());
//			return null;
//		}
		// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw End
		// [EC-CT1-192] エラーチェックを追加 2015.04.09 kawana End

		// [ver3.0][#2220] 梱包計算なしでデータ作成・帳票を出力済に変更 2018.02.21 miyabe/kawana Start

		// 出庫指示処理 (予定なし・出庫作業済)
		workOrderLogic.shipInstructeNoPlan(header, errRetSts(StatusCode.PICKING_EXCEPTION));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ver3.0][#2220] 梱包計算なしでデータ作成・帳票を出力済に変更 2018.02.21 miyabe/kawana End

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 (問題のソースを削除) 2017.05.26 kawana

		// コントロールNoクリア処理追加 2016.4.25 nayzaw Start

		List<TShippingInstH> lstTShippingInstH = new ArrayList<>();
		lstTShippingInstH.add(header);
		Long oldControlNo = controlNo;
		controlNo = null;
		// 出荷指示ヘッダのコントロールNoクリア
		int headerUpdateCount = updateControlNoLogic.update(lstTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		// 出荷指示ボディのコントロールNoクリア
		int bodyUpdateCount = updateControlNoLogic.updateTShippingInstBody(oldControlNo, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (getErrorManager().size() > 0) {
			return null;
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 (問題のソースを削除) 2017.05.26 kawana

		if(headerUpdateCount != lstTShippingInstH.size() || bodyUpdateCount != bodyList.size()){
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 総数量
		BigDecimal instNumSumUsedByLog = WCC.ZERO;
		// 明細部.指示数の合計（入力された行の指示数合計）
		for (TShippingInstB tShippingInstB : bodyList)
		{
			instNumSumUsedByLog = WCC.add(instNumSumUsedByLog, tShippingInstB.getInstNum());
		}
		setWorkLogQty(instNumSumUsedByLog);
		//トレース項目
		setWorkLogTraceItem(header.getShippingSlipNo());
		//センタ
		setWorkLogCenterCd(header.getMCenter().getCenterCd());
		//荷主
		setWorkLogClientCd(header.getMClient().getClientCd());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// コントロールNoクリア処理追加 2016.4.25 nayzaw End

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 2017.05.26 kawana Start
		if (getWarnManager().size() == 0) {
			// 警告ありの場合は警告メッセージのみ表示

			// 完了メッセージの設定
			// [ON推-品向-133] 更新時のメッセージを統一する。 2014.11.26 KI Start
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
			// [ON推-品向-133] 更新時のメッセージを統一する。 2014.11.26 KI End

		}
		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 2017.05.26 kawana End

		return null;
	}

	/**
	 * <h2>チェック処理</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・仕入先マスタ存在チェック
	 * ・商品マスタ存在チェック
	 * ・ロケーションマスタ存在チェック
	 * チェックエラー : 仕入先マスタ存在異常、商品マスタ存在異常、ロケーションマスタ存在異常
	 * チェック正常 : 正常
	 * </pre>
	 * @param header 出荷指示ヘッダ
	 * @param bodyList 出荷指示ボディリスト
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupRegisterData(TShippingInstH header, List<TShippingInstB> bodyList, ErrorStatus errSts) {

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());

		//センタID取得
		String centerCd = header.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
		// 納品先マスタ存在チェックと設定
		MCustomer condition = new MCustomer();
		condition.setClientId(mClient.getClientId());
		// [ON推-品向-1037] 届先入力追加に伴い、納品先の設定を変更 2015.12.21 koyama Start
		// 納品先CDがNULLの場合、届先CDをコピー
		if(CU.isNullOrEmpty(header.getSupplyCustomerCd()) && !CU.isNullOrEmpty(header.getDelivCustomerCd())){
			header.setSupplyCustomerCd(header.getDelivCustomerCd());
		}
		// [ON推-品向-1037] 届先入力追加に伴い、納品先の設定を変更 2015.12.21 koyama End
		condition.setCustomerCd(header.getSupplyCustomerCd());
		MCustomer supplyCustomer = customerLogic.getDeliveryCustomer(condition, errRetSts(errSts, StatusCode.SUPPLY_CUSTOMER_EXCEPTION));
		if (supplyCustomer == null) {
			return null;
		}

		// [#4671] 引当前に出荷停止チェックを追加 2018.05.30 kawana Start

		if (supplyCustomer.isShippingStopFlg$1()) {
			// 出荷停止納品先のためエラー

			getErrorManager().add(errRetSts(errSts, StatusCode.SUPPLY_CUSTOMER_EXCEPTION), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
			return null;
		}

		// [#4671] 引当前に出荷停止チェックを追加 2018.05.30 kawana End

		// 納品先IDを設定
		header.setSupplyCustomerId(supplyCustomer.getCustomerId());
		// 納品先名称を設定(未設定の場合のみ)
		if (CU.isNullOrEmpty(header.getSupplyCustomerNm())) {
			header.setSupplyCustomerNm(supplyCustomer.getCustomerNm());
		}

		// [ON推-品向-1037] 届先入力追加に伴い、届先の設定を変更 2015.12.21 koyama Start
		// 届先マスタ存在チェックと設定
		MCustomer deliveryCustomerCondition = new MCustomer();
		deliveryCustomerCondition.setClientId(header.getClientId());
		// 届先CDがNULLの場合、納品先CDをコピー
		if(CU.isNullOrEmpty(header.getDelivCustomerCd()) && !CU.isNullOrEmpty(header.getSupplyCustomerCd())){
			header.setDelivCustomerCd(header.getSupplyCustomerCd());
		}
		deliveryCustomerCondition.setCustomerCd(header.getDelivCustomerCd());
		MCustomer deliveryCustomer = customerLogic.getDeliveryCustomer(deliveryCustomerCondition, errRetSts(errSts, StatusCode.DELIVERY_CUSTOMER_FOUND_EXCEPTION));
		if (deliveryCustomer == null) {
			return null;
		}

		// [EC-CT1-180] ワンタイムにかかわらず届先ID、届先CDは納品先ID、納品先CDを設定 2015.04.08 kawana Start
		//届先IDの設定
		header.setDelivCustomerId(deliveryCustomer.getCustomerId());

		if (CU.isNullOrEmpty(deliveryCustomer.getOnetimeFlg()) || deliveryCustomer.isOnetimeFlg$0()) {
			// 通常の納品先の場合(ワンタイム以外)

			//届先郵便番号の設定
			header.setDelivZipCd(deliveryCustomer.getZipCd());
			//届先住所1の設定
			header.setDelivAddress1(deliveryCustomer.getAddress1());
			//届先住所2の設定
			header.setDelivAddress2(deliveryCustomer.getAddress2());
			//届先住所3の設定
			header.setDelivAddress3(deliveryCustomer.getAddress3());
			//届先名称の設定
			header.setDelivCustomerNm(deliveryCustomer.getCustomerNm());
			//届先電話番号の設定
			header.setDelivTelNo(deliveryCustomer.getTelNo());

			// [EC-CT1-191] 郵便番号チェックを追加 2015.04.09 kawana Start
			// ===== 郵便番号チェック =====
			MZip mZipEntity = new MZip();
			mZipEntity.setZipCd(header.getDelivZipCd());
			boolean isErr = zipLogic.checkZipCd(mZipEntity);
			if (isErr) {
				getErrorManager().add(errRetSts(errSts, StatusCode.ZIP_CD_FOUND_EXCEPTION), WmsMessageConst.POST_CODE_NOT_FOUND_POST_CODE_MASTER_ERROR);
				return null;
			}
			// [EC-CT1-191] 郵便番号チェックを追加 2015.04.09 kawana End

		} else {
			// 納品先がワンタイムの場合

			// [品質-102-007] 届先住所のチェックは出荷指示入力にあわせる 2015.04.07 kawana Start
			String delivAddr = new StringBuilder()
					.append(CU.nullToStr(header.getDelivAddress1()))
					.append(CU.nullToStr(header.getDelivAddress2()))
					.append(CU.nullToStr(header.getDelivAddress3()))
					.append(CU.nullToStr(header.getDelivAddressSupply()))
					.toString();

			if (delivAddr.length() < 1) {
				getErrorManager().add(errRetSts(errSts, StatusCode.DELIVERY_ADDRESS_NO_INPUT), WmsMessageConst.DELIV_ADDRESS_NO_INPUT_ERROR);
				return null;
			}
			// [品質-102-007] 届先住所のチェックは出荷指示入力にあわせる 2015.04.07 kawana End
		}
		// [EC-CT1-180] ワンタイムにかかわらず届先ID、届先CDは納品先ID、納品先CDを設定 2015.04.08 kawana End
		// [ON推-品向-1037] 届先入力追加に伴い、届先の設定を変更 2015.12.21 koyama End

		// 顧客出荷指示No.存在チェック
		String clientShippingNo = header.getClientShippingNo();
		if (!CU.isNullOrEmpty(clientShippingNo)) {
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
			cb.query().setClientId_Equal(mClient.getClientId());
			cb.query().setSupplyCustomerId_Equal(supplyCustomer.getCustomerId());
			cb.query().setClientShippingNo_Equal(clientShippingNo);
			cb.query().setShippingStatus_NotEqual_$90();
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
			//センタID（Center_ID）
			cb.query().setCenterId_Equal(mCenter.getCenterId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
			int count = tShippingInstHBhv.selectCount(cb);
			if (count > 0) {
				getErrorManager().add(errRetSts(errSts, StatusCode.CLIENT_SHIPPING_NO_DUPLICATE_EXCEPTION), WmsMessageConst.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR);
				return null;
			}
		}
		// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End

		//配送コースマスタ存在チェック
		// [ON推-品向-1037] 届先入力追加に伴い、配送コースの設定を変更 2015.12.21 koyama Start
		// 配送コースがNULLの場合、届先CD紐付く配送コースを取得
		if (CU.isNullOrEmpty(header.getDeliveryCourseCd())) {
			// 届先マスタに存在する
			if (deliveryCustomer != null) {
				// 配送コース取得
				Long delivCustomerId = deliveryCustomer.getCustomerId();
				MCustomer mDelivCustomer = new MCustomer();
				mDelivCustomer.setCustomerId(delivCustomerId);
				MDeliveryCourse deliveryCourse = deliveryCourseLogic.getDeliveryCourseByCustomerId(mDelivCustomer, header.getCenterId());
				if (deliveryCourse != null) {
					header.setDeliveryCourseCd(deliveryCourse.getDeliveryCourseCd());
				}
			}
		}
		// [ON推-品向-1037] 届先入力追加に伴い、配送コースの設定を変更 2015.12.21 koyama End
		String deliveryCourseCd = header.getDeliveryCourseCd();
		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
		mDeliveryCourse.setDeliveryCourseCd(deliveryCourseCd);
		mDeliveryCourse.setCenterId(mCenter.getCenterId());
		// [ON推-品向-1037] 配送コースがNULLの場合、エラーを表示させるように修正 2015.12.21 koyama Start
		mDeliveryCourse = deliveryCourseLogic.getDeliveryCourse(mDeliveryCourse, errRetSts(StatusCode.DELIVERY_COURSE_FOUND_EXCEPTION));
		// [ON推-品向-1037] 配送コースがNULLの場合、エラーを表示させるように修正 2015.12.21 koyama End

		if (mDeliveryCourse == null)
		{
			return null;
		}

		for (int row = 0; row < bodyList.size(); row++) {

			//商品マスタ存在チェック
			MProduct mProduct = new MProduct();
			mProduct.setClientId(mClient.getClientId());
			mProduct.setProductCd(bodyList.get(row).getProductCd());
			mProduct = productLogic.getUkEntity(mProduct, errRetSts(errSts, StatusCode.PRODUCT_EXCEPTION, row));

			if (mProduct == null) {
				return null;
			}

			// [#4671] 引当前に出荷停止チェックを追加 2018.05.30 kawana Start

			if (mProduct.isShippingStopFlg$1()) {
				// 出荷停止商品のためエラー

				getErrorManager().add(errRetSts(errSts, StatusCode.PRODUCT_EXCEPTION, row), WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				return null;
			}

			// [#4671] 引当前に出荷停止チェックを追加 2018.05.30 kawana End

			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
			if (mProduct == null) {
				getErrorManager().add(errRetSts(errSts, StatusCode.PRODUCT_EXCEPTION, row), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				return null;
			} else {
				String decimalExistFlg = mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
				if (CU.isNullOrEmpty(decimalExistFlg)) {
					getErrorManager().add(errRetSts(errSts, StatusCode.PRODUCT_EXCEPTION, row), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
					return null;
				} else if (decimalExistFlg.equals(CDef.DecimalExistFlg.$0.code())) {
					//小数有無フラグが無の場合
					if (!WmsCommonUtil.checkPatternInput("^\\d+$", WCC.stripTrailingZeros(bodyList.get(row).getInstNum()))) {
						// 小数0桁以内
						getErrorManager().add(errRetSts(errSts, StatusCode.INST_NUM_DECIMAL_CHECK_FAILED, row), WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
						return null;
					}
				} else {}
			}
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

			// ロケーションマスタ存在チェック
			MLocation mLocation = new MLocation();
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation.setLocationCd(bodyList.get(row).getLocationCd());
			mLocation = locationLogic.getUkEntity(mLocation, errRetSts(errSts, StatusCode.LOCATION_EXCEPTION, row));

			if (mLocation == null) {
				return null;
			}

			// [#4671] 引当前に出荷停止チェックを追加 2018.05.30 kawana Start

			if (mLocation.isAllocNgFlg$1()) {
				// 引当禁止ロケーションのためエラー

				getErrorManager().add(errRetSts(errSts, StatusCode.LOCATION_EXCEPTION, row), WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
				return null;
			}

			// [#4671] 引当前に出荷停止チェックを追加 2018.05.30 kawana End

			// ロットマスタ存在チェック
			TLot tLot = new TLot();
			tLot.setProductId(mProduct.getProductId());
			tLot.setLot(bodyList.get(row).getLot());
			tLot.setLimitDt(bodyList.get(row).getLimitDt());
			tLot = lotLogic.getUkEntity(tLot, errRetSts(errSts, StatusCode.LOT_FOUND_EXCEPTION, row));

			if (tLot == null) {
				return null;
			}

			//[検査-202] チェック時処理を追加します。 2014.12.02 KI Start
			if (WCC.isLessThan(bodyList.get(row).getChargeNum(), bodyList.get(row).getInstNum())) {
				resultStatus = ResultSetupRegisterData.CHARGE_NUM_DATA_FAILED;
				return null;
			}
			//[検査-202] チェック時処理を追加します。 2014.12.02 KI End

		}

		return null;
	}

	/**
	 * <h2>在庫数データ取得</h2>
	 * <pre>
	 * 在庫数データ取得する。
	 * </pre>
	 * @param shippingInputNoPlanDto 出荷実績入力(予定なし)画面用DTO
	 * @return ShippingInputNoPlanDto 出荷実績入力(予定なし)画面用DTO
	 */
	@GET
	@Path("/select")
	public ShippingInputNoPlanDto select(ShippingInputNoPlanDto shippingInputNoPlanDto) {

		// ===== 画面用DTO ヘッダの作成 =====
		ShippingInputNoPlanDto resultDto = new ShippingInputNoPlanDto();

		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH header = headerMapper.mappingToEntity(shippingInputNoPlanDto.data.head);

		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> bodyList = bodyMapper.mappingToEntityList(shippingInputNoPlanDto.data.list);

		for (int row = 0; row < bodyList.size(); row++) {

			//マスタ検索で必要なIDの取得

			if (CU.isNullOrEmpty(header.getMClient().getClientCd()))
			{
				bodyList.get(row).setChargeNum(WCC.ZERO);
				break;
			}
			else
			{
				//荷主ID
				MClient mClient = new MClient();
				mClient.setClientCd(header.getMClient().getClientCd());
				mClient = clientLogic.getUkEntity(mClient);
				header.setClientId(mClient.getClientId());
			}

			if (CU.isNullOrEmpty(header.getMCenter().getCenterCd()))
			{
				bodyList.get(row).setChargeNum(WCC.ZERO);
				break;
			}
			else
			{
				//センタID取得
				MCenter mCenter = new MCenter();
				mCenter.setCenterCd(header.getMCenter().getCenterCd());
				mCenter = centerLogic.getUkEntity(mCenter);
				header.setCenterId(mCenter.getCenterId());
			}

			if (CU.isNullOrEmpty(bodyList.get(row).getProductCd()))
			{
				bodyList.get(row).setProductId(null);
			}
			else
			{
				//商品IDの設定
				MProduct mProduct = new MProduct();
				mProduct.setClientId(header.getClientId());
				mProduct.setProductCd(bodyList.get(row).getProductCd());
				mProduct = productLogic.getUkEntity(mProduct);
				if (mProduct != null) {
					bodyList.get(row).setProductId(mProduct.getProductId());
					// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットマスタ取得を追加する  2015.03.27 kyo Start

					//ロットマスタを取得
					if (!CU.isNullOrEmpty(bodyList.get(row).getLimitDt()) || !CU.isNullOrEmpty(bodyList.get(row).getLot())) {
						TLot tLot = new TLot();
						tLot.setProductId(mProduct.getProductId());
						tLot.setLot(bodyList.get(row).getLot());
						tLot.setLimitDt(bodyList.get(row).getLimitDt());

						List<TLot> lotList = new ArrayList<TLot>();
						lotList = lotLogic.getUkEntityWithLotOrLimitDt(tLot);
						if (lotList.size() > 0) {
							if (lotList.size() == 1) {
								bodyList.get(row).setLotId(lotList.get(0).getLotId());
								bodyList.get(row).setLimitDt(lotList.get(0).getLimitDt());
								bodyList.get(row).setLot(lotList.get(0).getLot());
							} else {
								bodyList.get(row).setLotId(null);
								bodyList.get(row).setLimitDt(tLot.getLimitDt());
								bodyList.get(row).setLot(tLot.getLot());
							}
						} else {
							bodyList.get(row).setLotId(null);
							bodyList.get(row).setLimitDt(tLot.getLimitDt());
							bodyList.get(row).setLot(tLot.getLot());
						}
					} else {
						bodyList.get(row).setLotId(null);
						bodyList.get(row).setLimitDt(null);
						bodyList.get(row).setLot(null);
					}
					// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットマスタ取得を追加する  2015.03.27 kyo End
				} else {
					bodyList.get(row).setChargeNum(WCC.ZERO);
					break;
				}

				// [ON推-品向-517] ロットIDの設定、ロット未登録の場合に引当可能数を0を設定する処理を削除(出庫指示入力画面と動作を合わせるため) 2015.01.13 kawana
			}

			if (CU.isNullOrEmpty(bodyList.get(row).getLocationCd()))
			{
				bodyList.get(row).setLocationId(null);
				bodyList.get(row).setWarehouseId(null);
			}
			else
			{
				//ロケーションIDの設定
				MLocation mLocation = new MLocation();
				mLocation.setCenterId(header.getCenterId());
				mLocation.setLocationCd(bodyList.get(row).getLocationCd());
				mLocation = locationLogic.getUkEntityWithWarehouse(mLocation, null);
				if (mLocation != null) {
					//ロケーションIDの設定
					bodyList.get(row).setLocationId(mLocation.getLocationId());
					//指定倉庫IDの設定
					bodyList.get(row).setWarehouseId(mLocation.getMZone().getMWarehouse().getWarehouseId());
				} else {
					bodyList.get(row).setChargeNum(WCC.ZERO);
					break;
				}
			}

			if (CU.isNullOrEmpty(bodyList.get(row).getStockTypeCd()))
			{
				bodyList.get(row).setStockTypeId(null);
			}
			else
			{
				//在庫区分IDの設定
				MStockType mStockType = new MStockType();
				//				mStockType.setClientId(header.getClientId());
				mStockType.setStockTypeCd(bodyList.get(row).getStockTypeCd());
				mStockType = stockTypeLogic.getUkEntity(mStockType);
				if (mStockType != null) {
					bodyList.get(row).setStockTypeId(mStockType.getStockTypeId());
				} else {
					bodyList.get(row).setChargeNum(WCC.ZERO);
					break;
				}
			}

			if (CU.isNullOrEmpty(bodyList.get(row).getDepositCd()))
			{
				bodyList.get(row).setDepositId(null);
			}
			else
			{
				//預託IDの設定
				MCustomer mCustomer = new MCustomer();
				mCustomer.setClientId(header.getClientId());
				mCustomer.setCustomerCd(bodyList.get(row).getDepositCd());
				mCustomer = customerLogic.getUkEntity(mCustomer);
				if (mCustomer != null) {
					bodyList.get(row).setDepositId(mCustomer.getCustomerId());
				} else {
					bodyList.get(row).setChargeNum(WCC.ZERO);
					break;
				}
			}

			List<TStock> tStockList = null;

			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
			//在庫数データ取得.在庫数データ取得
			tStockList = stockDataSelectLogic.select(header, bodyList.get(row), true, errRetSts(StatusCode.GET_STOCK_EXCEPTION));
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End

			bodyList.get(row).setChargeNum(tStockList.get(0).getSumChargeNum());
		}

		// JSON通信のためにSimpleDTO変換

		TShippingInstHDto headerDto = headerMapper.mappingToDto(header);

		List<TShippingInstBDto> listDto = bodyMapper.mappingToDtoList(bodyList);

		resultDto.data.head = headerDto;
		resultDto.data.list = listDto;

		return resultDto;
	}

	/**
	 * <h2>入力チェック</h2>
	 * <pre>
	 * 登録データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInputNoPlanDto 出荷実績入力(予定なし)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ShippingInputNoPlanDto shippingInputNoPlanDto) {

		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH header = headerMapper.mappingToEntity(shippingInputNoPlanDto.data.head);

		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> bodyList = bodyMapper.mappingToEntityList(shippingInputNoPlanDto.data.list);

		//チェック処理
		setupRegisterData(header, bodyList, errRetSts(StatusCode.SHIPPING_REGISTER_EXCEPTION));

		if (getErrorManager().size() > 0) {
			return null;
		} else {
			//[検査-202] チェック時処理を追加します。 2014.12.02 KI Start
			if (!(resultStatus == null)) {
				switch (resultStatus) {
				case CHARGE_NUM_DATA_FAILED:
					// 通常の確認メッセージを設定
					getErrorManager().add(errRetSts(StatusCode.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR), WmsMessageConst.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR);
					return null;
				default:
					//[検査-202] チェック時処理を追加します。 2014.12.02 KI End
					// 確認表示
				}

			}
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}
}
