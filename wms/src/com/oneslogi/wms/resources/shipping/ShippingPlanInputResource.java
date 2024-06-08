package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingPlanInputDto;
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
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstErrorCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstInsertLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstUpdateLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanSelectLogic;
import com.oneslogi.wms.logic.shipping.StockDataSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 出荷指示入力画面のリソースクラス。
 */
@Path("/shipping/shippingPlanInput")
public class ShippingPlanInputResource extends AbstractWmsResource {
	//dsx
	@Inject
	private MCarrierBhv mCarrierBhv;

	//dsx
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
		 * 出荷指示入力データ取得異常
		 */
		protected static final int SHIPPING_PLAN_INPUT_GET_DATA_FAILED = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_FAILED = 3;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND_DATA_FAILED = 4;
		/**
		 * 納品先マスタ存在異常
		 */
		protected static final int DELIVERY_NOT_FOUND_DATA_FAILED = 5;
		/**
		 * 出荷指示ボディ0件
		 */
		protected static final int SHIPPING_PLAN_BODYT_NOT_FOUND_DATA_FAILED = 6;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND_DATA_FAILED = 7;
		/**
		 * 出荷指示入力データ登録異常
		 */
		protected static final int SHIPPING_PLAN_INPUT_INSERT_FAILED = 8;
		/**
		 * 出荷指示入力データ更新異常
		 */
		protected static final int SHIPPING_PLAN_INPUT_UPDATE_FAILED = 9;
		/**
		 * 在庫数データ取得異常
		 */
		protected static final int STOCK_NUM_NOT_FOUND_DATA_FAILED = 10;
		/**
		 * 顧客出荷指示No.存在チェック
		 */
		protected static final int CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR = 11;
		//[検査-207]再修正。 2014.12.04 KI End
		/**
		 * 配送コース存在チェック
		 */
		protected static final int DELIVERY_COURSE_FOUND_EXCEPTION = 12;
		//[検査-207]再修正。 2014.12.04 KI End
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana Start
		/**
		 * 届先住所未入力
		 */
		protected static final int DELIVERY_ADDRESS_NO_INPUT = 13;
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
		/**
		 * 倉庫マスタ存在チェック
		 */
		protected static final int WAREHOUSE_CD_NO_FOUND_ERROR = 14;
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの設定変更 2015.11.27 koyama Start
		/**
		 * 届先マスタ存在異常
		 */
		protected static final int DELIVERY_NOT_FOUND = 15;
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの設定変更 2015.11.27 koyama End
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
		/**
		 * 指示数小数桁数異常
		 */
		protected static final int INST_NUM_DECIMAL_CHECK_FAILED = 16;
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingPlanSelectLogic shippingPlanSelectLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private ShippingInstInsertLogic shippingInstInsertLogic;
	@Inject
	private ShippingInstUpdateLogic shippingInstUpdateLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private StockDataSelectLogic stockDataSelectLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private LotLogic lotLogic;
	@Inject
	private ShippingInstErrorCheckLogic shippingInstErrorCheckLogic;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
	@Inject
	private WarehouseLogic warehouseLogic;

	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End

	/**
	 * 新規登録データ組立の結果
	 */
	private enum ResultSetupRegisterData {
		ALL_OK,
		ERROR,
		BODY_DATA_NONE,
		PRODUCT_NOT_FOUND,
		DELIVERY_NOT_FOUND,
		LOCATION_NOT_FOUND,
		INST_NUM_DATA_FAILED,
		CHARGE_NUM_DATA_FAILED,
		CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR,
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
		WARNING_PRODUCT_NOT_FOUND,
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
		//[検査-207]再修正。 2014.12.04 KI Start
		DELIVERY_COURSE_FOUND_EXCEPTION,
		//[検査-207]再修正。 2014.12.04 KI End
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana Start
		DELIVERY_ADDRESS_NO_INPUT,
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
		WAREHOUSE_CD_NO_FOUND_ERROR,
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * 	 出荷指示入力明細の空行を新規作成
	 * 	 追加用の空行を作成
	 * </pre>
	 * @return ShippingPlanInputDto 出荷指示入力画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ShippingPlanInputDto initNew() {
		// [C-NIS-0009] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		ShippingPlanInputDto dto =  new ShippingPlanInputDto();
		// 納品予定日デフォルト表示設定
		dto.data.delivPlanDtDefFlg = getPropertyIntValue(WmsPropertyConst.SHIPPING_PLAN_INPUT_DELIV_PLAN_DT_DEF_FLG);
		// 作業日デフォルト表示設定
		dto.data.workDtDefFlg = getPropertyIntValue(WmsPropertyConst.SHIPPING_PLAN_INPUT_WORK_DT_DEF_FLG);
		// 出荷日デフォルト表示設定
		dto.data.shippingDtDefFlg = getPropertyIntValue(WmsPropertyConst.SHIPPING_PLAN_INPUT_SHIPPING_DT_DEF_FLG);
		return dto;
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End
		// [C-NIS-0009] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 *   出荷指示ヘッダIDをキーに出荷指示入力データ取り出し
	 *   出荷指示ヘッダ部のデータを画面用DTOに設定
	 *   出荷指示ボディ部のデータを画面用DTOに設定

	 * </pre>
	 * @param  shippingInstHId 出荷指示ヘッダID
	 * @return ShippingPlanInputDto 出荷指示入力画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public ShippingPlanInputDto initUpdate(@QueryParam("shippingInstHId") Long shippingInstHId) {

		TShippingInstH tShippingInstH = new TShippingInstH();
		tShippingInstH.setShippingInstHId(shippingInstHId);

		// 検索
		List<TShippingInstB> searchList = shippingPlanSelectLogic.select(tShippingInstH, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_GET_DATA_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// [EC-CT1-173] 画面遷移の時にも出荷ステータスのチェックを追加 2015.04.01 kawana Start
		// 出荷ステータスのチェック
		List<TShippingInstH> headList = new ArrayList<TShippingInstH>();
		headList.add(searchList.get(0).getTShippingInstH());
		shipStatusCheckLogic.orderUpdate(headList, null, null, null, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_GET_DATA_FAILED));
		if (getErrorManager().size() > 0) {
			return null;
		}
		// [EC-CT1-173] 画面遷移の時にも出荷ステータスのチェックを追加 2015.04.01 kawana End

		// DTO変換
		TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper();
		List<TShippingInstBDto> retultList = mapper.mappingToDtoList(searchList);

		// ===== 画面用DTO ヘッダの作成 =====
		ShippingPlanInputDto resultDto = new ShippingPlanInputDto();
		resultDto.data.head = ShippingPlanInputDto.chaseTShippingInstHDto(retultList.get(0).getTShippingInstH());

		// ===== 画面用DTO ボディの作成 =====
		for (TShippingInstBDto selectBody : retultList) {
			resultDto.data.body.add(ShippingPlanInputDto.chaseTShippingInstBDto(selectBody));
		}

		return resultDto;
	}

	/**
	 * <h2>入力チェック（新規）。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param shippingPlanInputDto 出荷指示入力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckRegister")
	public StatusDto inputCheckRegister(ShippingPlanInputDto shippingPlanInputDto) {
		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH head = headerMapper.mappingToEntity(shippingPlanInputDto.data.head);
		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> list = bodyMapper.mappingToEntityList(shippingPlanInputDto.data.body);

		// 新規登録データの組み立て
		ResultSetupRegisterData resultStatus = setupRegisterData(head, list, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));

		switch (resultStatus) {
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		case INST_NUM_DATA_FAILED:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.SHIP_ORDER_QTY_REGISTER_MORE_THAN_STOCK_CONFIRMATION);
			break;
		case CHARGE_NUM_DATA_FAILED:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.SHIP_RESULT_QTY_REGISTER_STOCK_SHORTAGE_CONFIRMATION);
			break;
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
		case WARNING_PRODUCT_NOT_FOUND:
			// 商品マスタ存在チェック警告表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_PLAN_REGISTERPRODUCT_CODE_NOT_FOUND_CONFIRMATION);
			break;
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
		default:
			break;
		}

		return null;
	}

	/**
	 * <h2>入力チェック（更新）。</h2>
	 * <pre>
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・ボディ無エラー用メッセージ
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingPlanInputDto 出荷指示入力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckUpdate")
	public StatusDto inputCheckUpdate(ShippingPlanInputDto shippingPlanInputDto) {
		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH head = headerMapper.mappingToEntity(shippingPlanInputDto.data.head);
		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> list = bodyMapper.mappingToEntityList(shippingPlanInputDto.data.body);
		List<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();
		tShippingInstHList.add(head);

		//出荷状態チェック.指示修正メソッドを呼出し
		shipStatusCheckLogic.orderUpdate(tShippingInstHList, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_FAILED));

		//結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		//更新データの組み立て
		ResultSetupRegisterData resultStatus = setupUpdateData(head, list, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));

		switch (resultStatus) {
		case ALL_OK:
			//通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		case INST_NUM_DATA_FAILED:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.SHIP_ORDER_QTY_REGISTER_MORE_THAN_STOCK_CONFIRMATION);
			break;
		case CHARGE_NUM_DATA_FAILED:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.SHIP_RESULT_QTY_REGISTER_STOCK_SHORTAGE_CONFIRMATION);
			break;
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
		case WARNING_PRODUCT_NOT_FOUND:
			// 商品マスタ存在チェック警告表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_PLAN_REGISTERPRODUCT_CODE_NOT_FOUND_CONFIRMATION);
			//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
			break;
		default:
			break;
		}

		return null;
	}

	/**
	 * <h2>出荷指示登録。</h2>
	 * <pre>
	 * 新規登録データの組み立てを行う。
	 * エラーがない場合は、データベースに出荷指示入力データを登録し、完了メッセージを設定する。
	 * 登録データに次の値を設定する。
	 * ・入力区分
	 * ・出荷ステータス
	 * </pre>
	 * @param shippingPlanInputDto 出荷指示入力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ShippingPlanInputDto shippingPlanInputDto) {
		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH head = headerMapper.mappingToEntity(shippingPlanInputDto.data.head);
		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> list = bodyMapper.mappingToEntityList(shippingPlanInputDto.data.body);

		// 新規登録データの組み立て
		ResultSetupRegisterData resultStatus = setupRegisterData(head, list, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));

		// 結果判定
		if (resultStatus == ResultSetupRegisterData.ERROR) {
			return null;
		}

		//入力区分の設定
		head.setInputType_$00();
		//出荷ステータスの設定
		head.setShippingStatus_$10();
		//エラーフラグの設定
		head.setErrorFlg_$0();

		//出荷伝票No.を登録する直前に採番
		head.setShippingSlipNo(numberingLogic.getNumbering(head.getCenterId(), WmsNumberingConst.SHIPPING_SLIP_NO));

		//出荷指示登録.出荷指示登録メソッドを呼出し
		shippingInstInsertLogic.insert(head, list, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));

		//結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana Start
		//出荷エラーチェックメソッドを呼出し
		// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw Start
		boolean isError = shippingInstErrorCheckLogic.check(null,head.getShippingInstHId(), errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));
//		boolean isError = shippingInstErrorCheckLogic.check(head, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));
		if (isError) {
			//エラーチェック処理でエラーマネージャに入れたエラーをクリア
			getErrorManager().clear();
			// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw End
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		} else {
			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.DOCUMENT_SHIPPING_SLIP_NO_INFORMATION, head.getShippingSlipNo());
		}
		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana End

		return null;
	}

	/**
	 * <h2>出荷指示更新。</h2>
	 * <pre>
	 * 更新データの組み立てを行う。
	 * エラーがない場合は、データベースに出荷指示入力データを更新し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param shippingPlanInputDto 出荷指示入力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(ShippingPlanInputDto shippingPlanInputDto) {
		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH head = headerMapper.mappingToEntity(shippingPlanInputDto.data.head);
		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> list = bodyMapper.mappingToEntityList(shippingPlanInputDto.data.body);

		//更新データの組み立て
		ResultSetupRegisterData resultStatus = setupUpdateData(head, list, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));

		// 結果判定
		if (resultStatus == ResultSetupRegisterData.ERROR) {
			return null;
		}

		//出荷指示訂正.出荷指示訂正メソッドを呼出し
		shippingInstUpdateLogic.update(head, list, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_UPDATE_FAILED));

		//結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana Start
		boolean isError = false;
		//出荷エラーチェックメソッドを呼出し
		if (list.size() > 0) {
			// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw Start
			isError = shippingInstErrorCheckLogic.check(null,head.getShippingInstHId(), errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));
//			isError = shippingInstErrorCheckLogic.check(head, errRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED));
		}

		if (isError) {
			//エラーチェック処理でエラーマネージャに入れたエラーをクリア
			getErrorManager().clear();
			// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw End
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.SHIPPING_PLAN_INPUT_INSERT_FAILED), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
		} else {
			// 完了メッセージの設定
			this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		}
		// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana End
		return null;
	}

	/**
	 * <h2>新規登録データの組み立て。</h2>
	 *<pre>
	 * 各マスタより次のデータを取得し、登録データに設定する
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する
	 *
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 * ・納品先マスタに存在しない
	 * ・ロケーションマスタに存在しない
	 *  戻り値を下記のように設定する
	 *  チェックエラー : 商品マスタ存在異常、納品先マスタ存在異常、ロケーションマスタ存在異常
	 *  チェック正常 : 正常
	 * </pre>
	 *
	 * @param header 出荷指示ヘッダEntity
	 * @param bodyList 出荷指示ボディList
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return ResultSetupRegisterData 処理結果
	 */
	public ResultSetupRegisterData setupRegisterData(TShippingInstH header, List<TShippingInstB> bodyList, ErrorStatus errSts) {
		ResultSetupRegisterData resultStatus = setupData(header, bodyList, true, errSts);
		// 結果判定
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
		if (0 < getErrorManager().size() && !(resultStatus == ResultSetupRegisterData.PRODUCT_NOT_FOUND)) {
			//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
			resultStatus = ResultSetupRegisterData.ERROR;
		} else {
			if (resultStatus == ResultSetupRegisterData.INST_NUM_DATA_FAILED) {
				resultStatus = ResultSetupRegisterData.INST_NUM_DATA_FAILED;
			} else if (resultStatus == ResultSetupRegisterData.CHARGE_NUM_DATA_FAILED) {
				resultStatus = ResultSetupRegisterData.CHARGE_NUM_DATA_FAILED;
				//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
			} else if (resultStatus == ResultSetupRegisterData.PRODUCT_NOT_FOUND) {
				// 商品マスタ存在チェック警告の場合
				resultStatus = ResultSetupRegisterData.WARNING_PRODUCT_NOT_FOUND;
				//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
				//[検査-207]再修正。 2014.12.04 KI Start
			} else if (resultStatus == ResultSetupRegisterData.DELIVERY_COURSE_FOUND_EXCEPTION) {
				// 商品マスタ存在チェック警告の場合
				resultStatus = ResultSetupRegisterData.DELIVERY_COURSE_FOUND_EXCEPTION;
				//[検査-207]再修正。 2014.12.04 KI End
			} else {
				resultStatus = ResultSetupRegisterData.ALL_OK;
			}
		}
		return resultStatus;
	}

	/**
	 * <h2>更新データの組み立て。</h2>
	 *<pre>
	 * 各マスタより次のデータを取得し、登録データに設定する
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する
	 *
	 * 【エラー条件】
	 * ・商品マスタに存在しない
	 * ・納品先マスタに存在しない
	 * ・ロケーションマスタに存在しない
	 *  戻り値を下記のように設定する
	 *  チェックエラー : 商品マスタ存在異常、納品先マスタ存在異常、ロケーションマスタ存在異常
	 *  チェック正常 : 正常
	 * </pre>
	 *
	 * @param header 出荷指示ヘッダEntity
	 * @param bodyList 出荷指示ボディList
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return ResultSetupRegisterData 処理結果
	 */
	public ResultSetupRegisterData setupUpdateData(TShippingInstH header, List<TShippingInstB> bodyList, ErrorStatus errSts) {
		ResultSetupRegisterData resultStatus = setupData(header, bodyList, false, errSts);

		// 結果判定
		//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
		if (0 < getErrorManager().size() && !(resultStatus == ResultSetupRegisterData.PRODUCT_NOT_FOUND)) {
			//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
			resultStatus = ResultSetupRegisterData.ERROR;
		} else {
			if (resultStatus == ResultSetupRegisterData.INST_NUM_DATA_FAILED) {
				resultStatus = ResultSetupRegisterData.INST_NUM_DATA_FAILED;
			} else if (resultStatus == ResultSetupRegisterData.CHARGE_NUM_DATA_FAILED) {
				resultStatus = ResultSetupRegisterData.CHARGE_NUM_DATA_FAILED;
				//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
			} else if (resultStatus == ResultSetupRegisterData.PRODUCT_NOT_FOUND) {
				// 商品マスタ存在チェック警告の場合
				resultStatus = ResultSetupRegisterData.WARNING_PRODUCT_NOT_FOUND;
				//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
				//[検査-207]再修正。 2014.12.04 KI Start
			} else if (resultStatus == ResultSetupRegisterData.DELIVERY_COURSE_FOUND_EXCEPTION) {
				// 商品マスタ存在チェック警告の場合
				resultStatus = ResultSetupRegisterData.DELIVERY_COURSE_FOUND_EXCEPTION;
				//[検査-207]再修正。 2014.12.04 KI End
			} else {
				resultStatus = ResultSetupRegisterData.ALL_OK;
			}
		}
		return resultStatus;
	}

	/**
	 * <h2>登録または更新データの組み立て。</h2>
	 * <pre>
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 *【出荷指示ヘッダ】
	 * ・荷主ID
	 * ・センタID
	 * ・処理区分ID
	 * ・納品先ID
	 * ・届先ID
	 * ・配送コースID
	 * 【出荷指示ボディ】
	 * ・商品ID
	 * ・指定ロケーションID（ロケーションコードが入力されているときのみ）
	 * ・指定倉庫ID（ロケーションコードが入力されているときのみ）
	 * ・指定倉庫CD（ロケーションコードが入力されているときのみ）
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する
	 *【エラー条件】
	 * ・商品マスタに存在しない
	 * ・納品先マスタに存在しない
	 * ・ロケーションマスタに存在しない
	 * 戻り値を下記のように設定する
	 * チェックエラー : 商品マスタ存在異常、納品先マスタ存在異常、ロケーションマスタ存在異常
	 * ボディ0件警告 : ボディ0件
	 * チェック正常 : 正常
	 *
	 * </pre>
	 *
	 * @param header 出荷指示ヘッダEntity
	 * @param bodyList 出荷指示ボディList
	 * @return ResultSetupRegisterData 処理結果
	 */
	public ResultSetupRegisterData setupData(TShippingInstH header, List<TShippingInstB> bodyList, boolean isInsert, ErrorStatus errSts) {
		int rowIndex = -1;
		boolean isProduct = false;
		boolean isDelivery = false;
		boolean isLocation = false;
		boolean isInstNum = false;
		boolean isChargeNum = false;
		boolean isClientShippingNo = false;
		//[検査-207]再修正。 2014.12.04 KI Start
		boolean isDeliveryCourse = false;
		//[検査-207]再修正。 2014.12.04 KI End
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana Start
		boolean isNoInputDelivErr = false;
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
		boolean isNoWarehouseErr = false;
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End

		//センタIDの設定
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		//荷主IDの設定
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());

		//出荷指示ボディリストの行数分繰返し
		for (TShippingInstB tShippingInstB : bodyList) {
			rowIndex++;

			// [ON推-品向-126] チェックを削除 2014.11.26 王忠勝

			//商品マスタ存在チェック
			MProduct mProduct = new MProduct();
			mProduct.setClientId(header.getClientId());
			mProduct.setProductCd(tShippingInstB.getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);

			//商品マスタに存在しない
			if (mProduct == null) {
				// [#1173] 指示修正時、商品マスタ未存在エラーなのに修正前商品の名称などが表示されている問題を修正 2017.03.13 kawana Start
				// 商品IDをクリア
				tShippingInstB.setProductId(null);
				// [#1173] 指示修正時、商品マスタ未存在エラーなのに修正前商品の名称などが表示されている問題を修正 2017.03.13 kawana End
				isProduct = true;
				//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI Start
				//getErrorManager().add(errRetSts(errSts, StatusCode.PRODUCT_NOT_FOUND_DATA_FAILED, rowIndex), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				//[検査-173] 7.3と同様にエラーとして登録できるように修正します。 2014.12.01 KI End
			} else {
				//商品IDの設定
				tShippingInstB.setProductId(mProduct.getProductId());

				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				mProduct = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(mProduct);
				if (mProduct == null) {
					// 商品IDをクリア
					tShippingInstB.setProductId(null);
					isProduct = true;
				} else {
					String decimalExistFlg = mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
					if (!CU.isNullOrEmpty(decimalExistFlg) && decimalExistFlg.equals(CDef.DecimalExistFlg.$0.code())) {
						//小数有無フラグが無の場合
						if (!WmsCommonUtil.checkPatternInput("^\\d+$", WCC.stripTrailingZeros(tShippingInstB.getInstNum()))) {
							// 小数0桁以内
							getErrorManager().add(errRetSts(errSts, StatusCode.INST_NUM_DECIMAL_CHECK_FAILED, rowIndex), WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
						}
					}
				}
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

				//ロットIDの設定
				TLot tLot = new TLot();
				tLot.setProductId(mProduct.getProductId());
				tLot.setLot(tShippingInstB.getLot());
				tLot.setLimitDt(tShippingInstB.getLimitDt());
				tLot = lotLogic.getUkEntity(tLot);
				if (tLot == null) {
					//tShippingInstB.setLotId(tLot.getLotId());
					//				} else {
					tShippingInstB.setLotId(null);
				}

				//引当可能数が未入力の場合
				if (tShippingInstB.getChargeNum() != null) {
					if (WCC.isZero(tShippingInstB.getChargeNum())) {
						isChargeNum = true;
					} else {
						//出荷指示数 > 引当可能数の場合
						if (WCC.isGreaterThan(tShippingInstB.getInstNum(), tShippingInstB.getChargeNum())) {
							isInstNum = true;
						}
					}
				}
			}

			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
			// 倉庫マスタに指定倉庫CDの存在チェック
			MWarehouse mWarehouse = null;
			if (!CU.isNullOrEmpty(tShippingInstB.getWarehouseCd())) {
				mWarehouse = new MWarehouse();
				mWarehouse.setCenterId(header.getCenterId());
				mWarehouse.setWarehouseCd(tShippingInstB.getWarehouseCd());
				mWarehouse = warehouseLogic.getUkEntityWithCheck(mWarehouse, errRetSts(errSts, StatusCode.WAREHOUSE_CD_NO_FOUND_ERROR, rowIndex));

				// [品質-102-027] 倉庫未存在エラー間違いを修正 2015.04.08 kawana Start
				if(mWarehouse == null){
					isNoWarehouseErr = true;
				}
				// [品質-102-027] 倉庫未存在エラー間違いを修正 2015.04.08 kawana End
			}

			// [品質-102-027] 倉庫未存在エラー間違いを修正(エラー判定の場所を移動) 2015.04.08 kawana Start
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End

			//ロケーションマスタ存在チェック
			MLocation mLocation = new MLocation();
			mLocation.setCenterId(header.getCenterId());
			mLocation.setLocationCd(tShippingInstB.getLocationCd());
			// [C-CWMS-0020] 指定倉庫CDを追加してから、ロケーションマスタ存在チェックの検索条件に指定倉庫CDの追加を修正 2015.03.25 kyo Start
			if (mWarehouse != null) {
				mLocation = locationLogic.getUkEntityWithWarehouseCd(mLocation, mWarehouse, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND_DATA_FAILED, rowIndex));
			} else {
				mLocation = locationLogic.getUkEntityWithWarehouse(mLocation, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND_DATA_FAILED, rowIndex));
			}
			// [C-CWMS-0020] 指定倉庫CDを追加してから、ロケーションマスタ存在チェックの検索条件に指定倉庫CDの追加を修正 2015.03.25 kyo End

			//ロケーションマスタに存在しない
			if (mLocation == null) {
				if (tShippingInstB.getLocationCd() != null) {
					isLocation = true;
				}
				//ロケーションIDの設定
				tShippingInstB.setLocationId(null);
				// [C-CWMS-0020] 指定倉庫CDを追加するため、修正 2015.03.25 kyo Start
				if (mWarehouse != null) {
					//指定倉庫IDの設定
					tShippingInstB.setWarehouseId(mWarehouse.getWarehouseId());
					//指定倉庫CDの設定
					tShippingInstB.setWarehouseCd(mWarehouse.getWarehouseCd());
				} else {
					//指定倉庫IDの設定
					tShippingInstB.setWarehouseId(null);
					//指定倉庫CDの設定
					tShippingInstB.setWarehouseCd(null);
				}
				// [C-CWMS-0020] 指定倉庫CDを追加ため、修正 2015.03.25 kyo End
			} else {
				//ロケーションIDの設定
				tShippingInstB.setLocationId(mLocation.getLocationId());
				//指定倉庫IDの設定
				tShippingInstB.setWarehouseId(mLocation.getMZone().getMWarehouse().getWarehouseId());
				//指定倉庫CDの設定
				tShippingInstB.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
			}

			//引当済数の設定
			tShippingInstB.setAllocNum(WCC.ZERO);

			//在庫区分IDの設定
			MStockType mStockType = new MStockType();
			//			mStockType.setClientId(header.getClientId());
			mStockType.setStockTypeCd(tShippingInstB.getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType);
			if (mStockType != null) {
				tShippingInstB.setStockTypeId(mStockType.getStockTypeId());
			}

			//預託IDの設定
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(header.getClientId());
			mCustomer.setCustomerCd(tShippingInstB.getDepositCd());
			mCustomer = customerLogic.getUkEntity(mCustomer);
			if (mCustomer != null) {
				tShippingInstB.setDepositId(mCustomer.getCustomerId());
			} else {
				tShippingInstB.setDepositId(null);
			}
		}

		//処理区分マスタ存在チェック
		MProcessType mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(header.getMProcessType().getProcessTypeCd());
		mProcessType = processTypeLogic.getUkEntity(mProcessType);

		//処理区分マスタに存在する
		if (mProcessType != null) {
			//処理区分IDの設定
			header.setProcessTypeId(mProcessType.getProcessTypeId());
		}

		// [EC-CT1-097] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.06 kawana Start

		// 納品先マスタ存在チェックと設定
		boolean findSupplyCustomer = false;
		MCustomer condition = new MCustomer();
		condition.setClientId(header.getClientId());
		// [C-CWMS-0052] 届先入力追加に伴い、納品先の設定を変更 2015.12.02 koyama Start
		// 納品先CDがNULLの場合、届先CDをコピー
		if(CU.isNullOrEmpty(header.getSupplyCustomerCd()) && !CU.isNullOrEmpty(header.getDelivCustomerCd())){
			header.setSupplyCustomerCd(header.getDelivCustomerCd());
		}
		// [C-CWMS-0052] 届先入力追加に伴い、納品先の設定を変更 2015.12.02 koyama End
		condition.setCustomerCd(header.getSupplyCustomerCd());
		MCustomer supplyCustomer = customerLogic.getDeliveryCustomer(condition, errRetSts(errSts, StatusCode.DELIVERY_NOT_FOUND_DATA_FAILED));

		//納品先マスタに存在しない
		if (supplyCustomer == null) {

			// [#1173] 指示修正時、商品マスタ未存在エラーなのに修正前商品の名称などが表示されている問題を修正 2017.03.13 kawana Start
			// 納品先IDをクリア
			header.setSupplyCustomerId(null);
			// [#1173] 指示修正時、商品マスタ未存在エラーなのに修正前商品の名称などが表示されている問題を修正 2017.03.13 kawana End
			// マスタ未存在エラー
			isDelivery = true;
		} else {

			findSupplyCustomer = true;

			// 納品先IDを設定
			header.setSupplyCustomerId(supplyCustomer.getCustomerId());

			// 納品先名称を設定(未設定の場合のみ)
			if (CU.isNullOrEmpty(header.getSupplyCustomerNm())) {
				header.setSupplyCustomerNm(supplyCustomer.getCustomerNm());
			}
		}

		// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.11.27 koyama Start
		// 届先マスタ存在チェックと設定
		boolean findDeliveryCustomer = false;
		MCustomer deliveryCustomerCondition = new MCustomer();
		deliveryCustomerCondition.setClientId(header.getClientId());
		// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.12.02 koyama Start
		// 届先CDがNULLの場合、納品先CDをコピー
		if(CU.isNullOrEmpty(header.getDelivCustomerCd()) && !CU.isNullOrEmpty(header.getSupplyCustomerCd())){
			header.setDelivCustomerCd(header.getSupplyCustomerCd());
		}
		// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.12.02 koyama End
		deliveryCustomerCondition.setCustomerCd(header.getDelivCustomerCd());
		MCustomer deliveryCustomer = customerLogic.getDeliveryCustomer(deliveryCustomerCondition, errRetSts(errSts, StatusCode.DELIVERY_NOT_FOUND, rowIndex));

		// 届先マスタに存在する
		if (deliveryCustomer == null) {

			// [#1173] 指示修正時、商品マスタ未存在エラーなのに修正前商品の名称などが表示されている問題を修正 2017.03.13 kawana Start
			//届先IDをクリア
			header.setDelivCustomerId(null);
			// [#1173] 指示修正時、商品マスタ未存在エラーなのに修正前商品の名称などが表示されている問題を修正 2017.03.13 kawana End
			// マスタ未存在エラー
			isDelivery = true;
		}else{
			// 届先が取得できた場合、ワンタイム設定に従い届先を設定

			findDeliveryCustomer = true;

			// [EC-CT1-180] ワンタイムにかかわらず届先ID、届先CDは納品先ID、納品先CDを設定 2015.04.08 kawana Start
			//届先IDの設定
			header.setDelivCustomerId(deliveryCustomer.getCustomerId());

			if (CU.isNullOrEmpty(deliveryCustomer.getOnetimeFlg()) || deliveryCustomer.isOnetimeFlg$0()) {
				// 通常の届先の場合(ワンタイム以外)

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

			} else {
				// 届先がワンタイムの場合

				// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana Start
				String delivAddr = new StringBuilder()
						.append(CU.nullToStr(header.getDelivAddress1()))
						.append(CU.nullToStr(header.getDelivAddress2()))
						.append(CU.nullToStr(header.getDelivAddress3()))
						.append(CU.nullToStr(header.getDelivAddressSupply()))
						.toString();

				if (delivAddr.length() < 1) {

					isNoInputDelivErr = true;
				}
				// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana End
			}
			// [EC-CT1-180] ワンタイムにかかわらず届先ID、届先CDは納品先ID、納品先CDを設定 2015.04.08 kawana End
		}
		// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.11.27 koyama End
		// [EC-CT1-097] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.06 kawana End

		//配送コースマスタ存在チェック
		MDeliveryCourse meliveryCourse = new MDeliveryCourse();
		meliveryCourse.setCenterId(header.getCenterId());
		// [C-CWMS-0052] 届先入力追加に伴い、配送コースの設定を変更 2015.12.02 koyama Start
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
		// [C-CWMS-0052] 届先入力追加に伴い、配送コースの設定を変更 2015.12.02 koyama End
		meliveryCourse.setDeliveryCourseCd(header.getDeliveryCourseCd());
		// [C-CWMS-0052] 配送コースがNULLの場合、エラーを表示させるように修正 2015.11.27 koyama Start
		meliveryCourse = deliveryCourseLogic.getDeliveryCourse(meliveryCourse, errRetSts(errSts, StatusCode.DELIVERY_COURSE_FOUND_EXCEPTION));
		// [C-CWMS-0052] 配送コースがNULLの場合、エラーを表示させるように修正 2015.11.27 koyama End

		//配送コースマスタに存在する
		if (meliveryCourse != null) {
			//配送コースIDの設定
			header.setDeliveryCourseId(meliveryCourse.getDeliveryCourseId());
			//配送コースCDの設定
			header.setDeliveryCourseCd(meliveryCourse.getDeliveryCourseCd());

			//運送業者マスタ存在チェック

			//[検査-243] 運送業者無し時のチェック処理が不正です。 2014.12.08 KI Start
			MCarrierCB mCarrier = mCarrierBhv.newMyConditionBean();
			mCarrier.query().setCarrierId_Equal(meliveryCourse.getCarrierId());
			MCarrier mc = mCarrierBhv.selectEntity(mCarrier);
			if (mc != null) {
				//運送業者CDの設定
				header.setCarrierCd(mc.getCarrierCd());
			}
			//[検査-243] 運送業者無し時のチェック処理が不正です。 2014.12.08 KI End
		} else {
			//[検査-207]再修正。 2014.12.04 KI Start
			isDeliveryCourse = true;
			//[検査-207]再修正。 2014.12.04 KI End
			//配送コースIDの設定
			header.setDeliveryCourseId(null);
			//配送コースCDの設定
			header.setDeliveryCourseCd(null);
		}

		// [SK2-037] 出荷指示入力新規登録時、各情報を入力後に、納品先CDを裏で論理削除し、登録ボタンを押下すると、致命的エラーを解消するため、納品先の存在チェックを追加 2014.12.12 Start
		// 納品先存在する場合、以下の処理を続ける
		if (findSupplyCustomer && findDeliveryCustomer) {
			// [SK2-037] 出荷指示入力新規登録時、各情報を入力後に、納品先CDを裏で論理削除し、登録ボタンを押下すると、致命的エラーを解消するため、納品先の存在チェックを追加 2014.12.12 End
			// [ON推-品向-126] チェックを修正 2014.11.26 王忠勝 Start
			//顧客出荷指示No.存在チェック
			//顧客出荷指示No.
			String clientShippingNo = header.getClientShippingNo();
			if (isInsert) {
				if (!CU.isNullOrEmpty(clientShippingNo)) {
					TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
					cb.query().setClientId_Equal(mClient.getClientId());
					cb.query().setSupplyCustomerId_Equal(supplyCustomer.getCustomerId());
					cb.query().setClientShippingNo_Equal(clientShippingNo);
					// [EC-CT1-029] キャンセルは重複チェックに含まない 2015.02.12 kawana Start
					cb.query().setShippingStatus_NotEqual_$90();
					// [EC-CT1-029] キャンセルは重複チェックに含まない 2015.02.12 kawana End
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
					//センタID（Center_ID）
					cb.query().setCenterId_Equal(mCenter.getCenterId());
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
					int count = tShippingInstHBhv.selectCount(cb);
					if (count > 0) {
						isClientShippingNo = true;
					}
				}
			} else {
				//[検査-241] 顧客出荷指示No.が登録されている場合に発生することを確認。 2014.12.09 KI Start
				if (!CU.isNullOrEmpty(clientShippingNo) && supplyCustomer != null) {
					//[検査-241] 顧客出荷指示No.が登録されている場合に発生することを確認。 2014.12.09 KI End
					TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
					cb.query().setClientId_Equal(mClient.getClientId());
					cb.query().setSupplyCustomerId_Equal(supplyCustomer.getCustomerId());
					cb.query().setClientShippingNo_Equal(clientShippingNo);
					// [EC-CT1-029] キャンセルは重複チェックに含まない 2015.02.12 kawana Start
					cb.query().setShippingStatus_NotEqual_$90();
					// [EC-CT1-029] キャンセルは重複チェックに含まない 2015.02.12 kawana End
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
					//センタID（Center_ID）
					cb.query().setCenterId_Equal(mCenter.getCenterId());
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
					ListResultBean<TShippingInstH> list = tShippingInstHBhv.selectList(cb);
					// [ON推-品向-410] 顧客出荷指示No.重複チェックで複数件取得時もチェック対象にする変更 2014.12.4 Sakata Start
					if (list.size() > 0) {
						for (TShippingInstH head : list) {
							Long shippingInstHId = head.getShippingInstHId();
							if (!shippingInstHId.equals(header.getShippingInstHId())) {
								isClientShippingNo = true;
								break;
							}
						}
					}
					// [ON推-品向-410] 顧客出荷指示No.重複チェックで複数件取得時もチェック対象にする変更 2014.12.4 Sakata End
				}
			}
			// [ON推-品向-126] チェックを修正 2014.11.26 王忠勝 End
			// [SK2-037] 出荷指示入力新規登録時、各情報を入力後に、納品先CDを裏で論理削除し、登録ボタンを押下すると、致命的エラーを解消するため、納品先の存在チェックを追加 2014.12.12 Start
		}
		// [SK2-037] 出荷指示入力新規登録時、各情報を入力後に、納品先CDを裏で論理削除し、登録ボタンを押下すると、致命的エラーを解消するため、納品先の存在チェックを追加 2014.12.12 End

		// 結果の設定
		ResultSetupRegisterData resultStatus;
		if (bodyList.size() == 0) {
			resultStatus = ResultSetupRegisterData.BODY_DATA_NONE;
		} else if (isClientShippingNo) {
			resultStatus = ResultSetupRegisterData.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR;
		} else if (isProduct) {
			resultStatus = ResultSetupRegisterData.PRODUCT_NOT_FOUND;
		} else if (isDelivery) {
			resultStatus = ResultSetupRegisterData.DELIVERY_NOT_FOUND;
		} else if (isLocation) {
			resultStatus = ResultSetupRegisterData.LOCATION_NOT_FOUND;
			// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana Start
		} else if (isNoInputDelivErr) {
			resultStatus = ResultSetupRegisterData.DELIVERY_ADDRESS_NO_INPUT;
			// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana End
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
		} else if (isNoWarehouseErr) {
			resultStatus = ResultSetupRegisterData.WAREHOUSE_CD_NO_FOUND_ERROR;
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
		} else if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupRegisterData.ERROR;
		} else if (isInstNum) {
			resultStatus = ResultSetupRegisterData.INST_NUM_DATA_FAILED;
		} else if (isChargeNum) {
			resultStatus = ResultSetupRegisterData.CHARGE_NUM_DATA_FAILED;
			//[検査-207]再修正。 2014.12.04 KI Start
		} else if (isDeliveryCourse) {
			resultStatus = ResultSetupRegisterData.DELIVERY_COURSE_FOUND_EXCEPTION;
			//[検査-207]再修正。 2014.12.04 KI End
		} else {
			resultStatus = ResultSetupRegisterData.ALL_OK;
		}

		switch (resultStatus) {
		case ERROR:
			return null;
		case BODY_DATA_NONE:
			// 明細0件はエラーとする

			// [C-EC-018] updateでも明細行0行の場合はエラーとする。 2015.02.04 kawana Start
			getErrorManager().add(errRetSts(StatusCode.SHIPPING_PLAN_BODYT_NOT_FOUND_DATA_FAILED), WmsMessageConst.DETAIL_LINE_NOT_INPUT_ERROR);
			// [C-EC-018] updateでも明細行0行の場合はエラーとする。 2015.02.04 kawana End
			break;
		case PRODUCT_NOT_FOUND:
			// 商品マスタ存在チェックのエラーメッセージを設定
			break;
		case DELIVERY_NOT_FOUND:
			// 納品先マスタ存在チェックのエラーメッセージを設定
			break;
		//[検査-207]再修正。 2014.12.04 KI Start
		case DELIVERY_COURSE_FOUND_EXCEPTION:
			// 配送マスタ存在チェックのエラーメッセージを設定
			break;
		//[検査-207]再修正。 2014.12.04 KI End
		case LOCATION_NOT_FOUND:
			// ロケーションマスタ存在チェックのエラーメッセージを設定
			break;
		case CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR:
			// 顧客出荷指示No.存在チェックのエラーメッセージを設定
			getErrorManager().add(errRetSts(StatusCode.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR), WmsMessageConst.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR);
			break;
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana Start
		case DELIVERY_ADDRESS_NO_INPUT:
			// 届先住所必須(ワンタイムの場合)
			getErrorManager().add(errRetSts(errSts, StatusCode.DELIVERY_ADDRESS_NO_INPUT), WmsMessageConst.DELIV_ADDRESS_NO_INPUT_ERROR);
			break;
		// [C-CWMS-0021] 届先の入力項目を追加 2015.03.23 kawana End
		default:
			break;
		}

		return resultStatus;
	}

	/**
	 * <h2>在庫数データ取得。</h2>
	 *
	 * @param shippingPlanInputDto 出荷指示入力画面用DTO
	 * @return TStock 処理結果
	 */
	@POST
	@Path("/getStockData")
	public String getStockData(ShippingPlanInputDto shippingPlanInputDto) {

		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		TShippingInstH header = headerMapper.mappingToEntity(shippingPlanInputDto.data.head);
		TShippingInstBDtoMapper bodyMapper = new TShippingInstBDtoMapper();
		List<TShippingInstB> list = bodyMapper.mappingToEntityList(shippingPlanInputDto.data.body);

		//センタIDの設定
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		//荷主IDの設定
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient != null) {
			header.setClientId(mClient.getClientId());
		}

		TShippingInstB body = list.get(0);
		//商品IDの設定
		MProduct mProduct = new MProduct();
		mProduct.setClientId(header.getClientId());
		mProduct.setProductCd(body.getProductCd());
		mProduct = productLogic.getUkEntity(mProduct);
		if (mProduct != null) {
			body.setProductId(mProduct.getProductId());
			// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットマスタ取得を追加する  2015.03.27 kyo Start

			//ロットマスタを取得
			if (!CU.isNullOrEmpty(body.getLimitDt()) || !CU.isNullOrEmpty(body.getLot())) {
				TLot tLot = new TLot();
				tLot.setProductId(mProduct.getProductId());
				tLot.setLot(body.getLot());
				tLot.setLimitDt(body.getLimitDt());

				List<TLot> lotList = new ArrayList<TLot>();
				lotList = lotLogic.getUkEntityWithLotOrLimitDt(tLot);
				if (lotList.size() > 0) {
					if (lotList.size() == 1) {
						body.setLotId(lotList.get(0).getLotId());
						body.setLimitDt(lotList.get(0).getLimitDt());
						body.setLot(lotList.get(0).getLot());
					} else {
						body.setLotId(null);
						body.setLimitDt(tLot.getLimitDt());
						body.setLot(tLot.getLot());
					}
				} else {
					body.setLotId(null);
					body.setLimitDt(tLot.getLimitDt());
					body.setLot(tLot.getLot());
				}
			} else {
				body.setLotId(null);
				body.setLimitDt(null);
				body.setLot(null);
			}
			// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットマスタ取得を追加する  2015.03.27 kyo End
		} else {
			body.setProductId(null);
			body.setLotId(null);
		}

		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
		MWarehouse mWarehouse = null;
		if (!CU.isNullOrEmpty(body.getWarehouseCd())) {
			mWarehouse = new MWarehouse();
			mWarehouse.setCenterId(header.getCenterId());
			mWarehouse.setWarehouseCd(body.getWarehouseCd());
			mWarehouse = warehouseLogic.getUkEntityWithCheck(mWarehouse, null);
		}
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End

		//ロケーションIDの設定
		MLocation mLocation = new MLocation();
		mLocation.setCenterId(header.getCenterId());
		mLocation.setLocationCd(body.getLocationCd());
		mLocation = locationLogic.getUkEntityWithWarehouse(mLocation, null);
		if (mLocation != null) {
			//ロケーションIDの設定
			body.setLocationId(mLocation.getLocationId());
			//指定倉庫IDの設定
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
			if (mWarehouse != null) {
				body.setWarehouseId(mWarehouse.getWarehouseId());
			} else {
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End
				body.setWarehouseId(mLocation.getMZone().getMWarehouse().getWarehouseId());
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
			}
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End
		} else {
			body.setLocationId(null);
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
			if (mWarehouse != null) {
				body.setWarehouseId(mWarehouse.getWarehouseId());
			} else {
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End
				body.setWarehouseId(null);
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
			}
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End
		}

		//在庫区分IDの設定
		MStockType mStockType = new MStockType();
		//		mStockType.setClientId(header.getClientId());
		mStockType.setStockTypeCd(body.getStockTypeCd());
		mStockType = stockTypeLogic.getUkEntity(mStockType, null);
		if (mStockType != null) {
			body.setStockTypeId(mStockType.getStockTypeId());
		} else {
			body.setStockTypeId(null);
		}

		//預託IDの設定
		MCustomer mCustomer = new MCustomer();
		mCustomer.setClientId(header.getClientId());
		mCustomer.setCustomerCd(body.getDepositCd());
		mCustomer = customerLogic.getUkEntity(mCustomer);
		if (mCustomer != null) {
			body.setDepositId(mCustomer.getCustomerId());
		} else {
			body.setDepositId(null);
		}

		// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
		//在庫数データ取得.在庫数データ取得メソッドを呼出し
		List<TStock> resultList = stockDataSelectLogic.select(header, body, true, errRetSts(StatusCode.STOCK_NUM_NOT_FOUND_DATA_FAILED));
		// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End
		TStock tStock = resultList.get(0);
		// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
		return String.valueOf(tStock.getSumChargeNum());
		// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
	}
}
