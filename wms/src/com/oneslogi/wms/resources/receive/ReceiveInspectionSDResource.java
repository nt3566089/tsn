package com.oneslogi.wms.resources.receive;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dto.AutoPrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic.ResultReceive;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic.StockUpdateStatus;
import com.oneslogi.wms.dto.receive.ProductLabelPrintDto;
import com.oneslogi.wms.dto.receive.ReceiveInputDto;
import com.oneslogi.wms.dto.receive.ReceiveInspectionSDDto;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.receive.ReceiveInputDeleteLogic;
import com.oneslogi.wms.logic.receive.ReceiveInputInsertLogic;
import com.oneslogi.wms.logic.receive.ReceiveInputSelectLogic;
import com.oneslogi.wms.logic.receive.ReceiveInputUpdateLogic;
import com.oneslogi.wms.logic.receive.ReceiveNumCheckLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusCheckLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusUpdateLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * SD用入荷検品画面のリソースクラス。
 */
// [#120] 入荷検品 2017.02.07 honma Mod Start
@Path("/receive/receiveInspectionSD")
public class ReceiveInspectionSDResource extends AbstractWmsResource {
	// [#120] 入荷検品 2017.02.07 honma Mod End

	// ===== 定数定義 =====

	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	private static final String PRODUCT_REPORT_CD = "ProductLabel";
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になった変数STORE_REPORT_CDを削除) 2018.04.27 kawana Delete
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End

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
		 * 入荷実績入力データ取得異常
		 */
		protected static final int RECEIVE_INPUT_SELECT_FAILED = 2;
		/**
		 * 入荷状態チェック異常
		 */
		protected static final int RECEIVE_STATUS_CHECK_FAILED = 3;
		/**
		 * 入荷数チェック異常
		 */
		protected static final int RECEIVE_NUM_CHECK_FAILED = 4;
		/**
		 * 期限日(限界日)チェック異常
		 */
		protected static final int LIMIT_DT_CHECK_FAILED = 6;
		/**
		 * 仕入先マスタ存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND = 7;
		/**
		* ロケーションマスタ存在異常
		*/
		protected static final int LOCATION_NOT_FOUND = 8;
		/**
		 * 入荷実績登録異常
		 */
		protected static final int RECEIVE_RECORD_INSERT_FAILED = 9;
		/**
		 * 入荷予定ステータス更新異常
		 */
		protected static final int RECEIVE_PLAN_STATUS_UPDATE_FAILED = 10;
		/**
		 * 入荷実績削除異常
		 */
		protected static final int RECEIVE_INPUT_DELETE_FAILED = 11;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 12;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 13;
		/**
		 * 入荷数期限日(限界日)チェック異常
		 */
		protected static final int RECEIVE_NUM_AND_LIMIT_DT_CHECK_FAILED = 14;
		/**
		 * 入荷実績キャンセル異常
		 */
		protected static final int STORE_RESULT_CAN_NOT_CANCEL_NO_INPUT_ERROR = 15;
		/**
		 * 入荷実績更新異常
		 */
		protected static final int RECEIVE_INPUT_UPDATE_FAILED = 16;
		// [#1795][Ver2.2.0] SD側で検索後に入荷済伝票をPC側で修正、同伝票をSD側で明細選択で致命的エラーへの対応 2017.05.17 honma Add Start
		/**
		 * 商品ラベル出力異常
		 */
		protected static final int PRODUCT_LABEL_PRINT_FAILED = 17;
		// [#1795][Ver2.2.0] SD側で検索後に入荷済伝票をPC側で修正、同伝票をSD側で明細選択で致命的エラーへの対応 2017.05.17 honma Add End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		/**
		 * 入庫ラベル出力異常
		 */
		protected static final int STORE_LABEL_PRINT_FAILED = 18;
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveInputSelectLogic receiveInputSelectLogic;
	@Inject
	private ReceiveStatusCheckLogic receiveStatusCheckLogic;
	// [#120] 入荷検品 2017.02.07 honma Add Start
	@Inject
	private ReceiveNumCheckLogic receiveNumCheckLogic;
	// [#120] 入荷検品 2017.02.07 honma Add End
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	// [#120] 入荷検品 2017.02.07 honma Add Start
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	// [#120] 入荷検品 2017.02.07 honma Add End
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	// [#120] 入荷検品 2017.02.07 honma Add Start
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	// [#120] 入荷検品 2017.02.07 honma Add End
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ReportLogic reportLogic;
	// [#120] 入荷検品 2017.02.07 honma Add Start
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private ReceiveInputDeleteLogic receiveInputDeleteLogic;
	@Inject
	private ReceiveInputInsertLogic inputInsertLogic;
	@Inject
	private ReceiveInputUpdateLogic inputUpdateLogic;
	@Inject
	private ReceiveStatusUpdateLogic statusUpdateLogic;
	@Inject
	private ReceiveStatusUpdateLogic receiveStatusUpdateLogic;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になった変数tStoreRecordHBhv, numberingCenterLogicを削除) 2018.04.27 kawana Delete
	@Inject
	private StoreLabelPrintLogic storeLabelPrintLogic;
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

	// ===== メンバ変数 =====
	/**
	 * 入荷実績入力チェックの結果（登録）
	 */
	protected enum ResultSetupRegisterData {
		ALL_OK,
		ERROR,
		RECEIVE_QTY_WARN,
		LIMIT_DT_WARN,
		RECEIVE_NUM_AND_LIMIT_DT_WARN,
		RECEIVE_QTY_ERROR

	}

	// [#120] 入荷検品 2017.02.07 honma Add End

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReceiveInspectionSDDto initNew() {

		// 発行帳票を指定
		ReceiveInspectionSDDto receiveInspectionSDDto = new ReceiveInspectionSDDto();
		return receiveInspectionSDDto;
	}

	/**
	 * <h2>入荷検品データ取得。</h2>
	 * <pre>
	 * 画面で入力された検索条件で入荷検品データを検索する。
	 *
	 * 【入荷実績データ取得】、【入荷状態チェック】、【HT検品中チェック】後、
	 * 入荷検品画面用DTOに下記内容を設定し返却する。
	 * ・入荷実績ボディ情報
	 * ・ページング情報
	 * ・【ステータスCDとステータス内容】
	 *
	 * 【入荷実績データ取得】
	 * ・{@link ReceiveInputSelectLogic#select(TReceivePlanH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績入力データ取得メソッド}を呼び出す。
	 *
	 * 【入荷状態チェック】
	 *・{@link ReceiveStatusCheckLogic#receiveResultEntry(List,List,List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【HT検品中チェック】
	 *・{@link ReceiveStatusCheckLogic#htReceive(List,List,List) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   1:ユーザによる確認（HT検品中確認）
	 *   2:入荷実績入力データ取得異常
	 *   3:入荷状態チェック異常
	 *   12:商品マスタ存在異常
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/search")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("ReceiveInspectionSD")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public ReceiveInspectionSDDto search(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Del

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// =======================================================
		// =              入荷実績入力データの取得
		// =======================================================

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectList = searchCommonOn(receiveInspectionSDDto);
		if (selectList == null) {
			return null;
		}
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Del
		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM Start
		return searchCommonUnder(receiveInspectionSDDto,selectList);
		// [#2946][Ver3.0] WAS連携対応 2018/01/17 PYM End
	}

	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	/**
	 * <h2>入荷検品データ取得。</h2>
	 * <pre>
	 * 画面で入力された検索条件で入荷検品データを検索する。
	 *
	 * 【入荷実績データ取得】、【入荷状態チェック】、【HT検品中チェック】後、
	 * 入荷検品画面用DTOに下記内容を設定し返却する。
	 * ・入荷実績ボディ情報
	 * ・ページング情報
	 * ・【ステータスCDとステータス内容】
	 *
	 * 【入荷実績データ取得】
	 * ・{@link ReceiveInputSelectLogic#select(TReceivePlanH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績入力データ取得メソッド}を呼び出す。
	 *
	 * 【入荷状態チェック】
	 *・{@link ReceiveStatusCheckLogic#receiveResultEntry(List,List,List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【HT検品中チェック】
	 *・{@link ReceiveStatusCheckLogic#htReceive(List,List,List) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   1:ユーザによる確認（HT検品中確認）
	 *   2:入荷実績入力データ取得異常
	 *   3:入荷状態チェック異常
	 *   12:商品マスタ存在異常
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/research")
	public ReceiveInspectionSDDto research(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// =======================================================
		// =              入荷実績入力データの取得
		// =======================================================

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectList = searchCommonOn(receiveInspectionSDDto);
		if (selectList == null) {
			return null;
		} else {
			return searchCommonUnder(receiveInspectionSDDto,selectList);
		}
	}

	/**
	 * <h2>入荷検品データ取得。</h2>
	 * <pre>
	 * 画面で入力された検索条件で入荷検品データを検索する。
	 *
	 * 【入荷実績データ取得】、【入荷状態チェック】、【HT検品中チェック】後、
	 * 入荷実績入力データを取得する。
	 * ・入荷実績ボディ情報
	 * ・ページング情報
	 * ・【ステータスCDとステータス内容】
	 *
	 * 【入荷実績データ取得】
	 * ・{@link ReceiveInputSelectLogic#select(TReceivePlanH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績入力データ取得メソッド}を呼び出す。
	 *
	 * 【入荷状態チェック】
	 *・{@link ReceiveStatusCheckLogic#receiveResultEntry(List,List,List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【HT検品中チェック】
	 *・{@link ReceiveStatusCheckLogic#htReceive(List,List,List) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   1:ユーザによる確認（HT検品中確認）
	 *   2:入荷実績入力データ取得異常
	 *   3:入荷状態チェック異常
	 *   12:商品マスタ存在異常
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @return selectList 入荷実績入力データ用List
	 */
	public List<TStoreRecordB> searchCommonOn(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final TReceivePlanH header = headerMapper.mappingToEntity(receiveInspectionSDDto.data.head);

		//仮ロケーションのロケーションID取得
		String locationCd = receiveInspectionSDDto.data.locationCd;
		MLocation locationCondition = new MLocation();
		locationCondition.setCenterId(header.getCenterId());
		locationCondition.setLocationCd(locationCd);

		locationCondition = locationLogic.getUkEntityWithWarehouse(locationCondition, errRetSts(StatusCode.LOCATION_NOT_FOUND));

		if (!CU.isNullOrEmpty(locationCd)) {
			//エラーが存在する場合
			if (0 < getErrorManager().size()) {
				// 処理中止
				return null;
			}
		}

		TStoreRecordB body = new TStoreRecordB();
		body.setStoreDtFrom(header.getStoreDtFrom());
		body.setStoreDtTo(header.getStoreDtTo());

		TReceivePlanB tReceivePlanB = new TReceivePlanB();
		tReceivePlanB.setProductCd(header.getProductCd());
		tReceivePlanB.setPlanClientOrderNo(header.getClientOrderNo());

		// =======================================================
		// =              入荷実績入力データの取得
		// =======================================================

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectList = receiveInputSelectLogic.selectPage(header, body, tReceivePlanB, receiveInspectionSDDto.paging, errRetSts(StatusCode.RECEIVE_INPUT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}
		return selectList;
	}

	/**
	 * <h2>返信用DTO作成。</h2>
	 * <pre>
	 * 入荷実績入力データで返信用DTOを作成する。
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @param selectList 入荷実績入力データ用List
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	public ReceiveInspectionSDDto searchCommonUnder(ReceiveInspectionSDDto receiveInspectionSDDto, List<TStoreRecordB> selectList) {
		// =======================================================
		// =              返信用DTO作成
		// =======================================================

		ReceiveInspectionSDDto resultDto = new ReceiveInspectionSDDto();

		TStoreRecordBDtoMapper bodyMapper = new TStoreRecordBDtoMapper();

		resultDto.data.storeBody = bodyMapper.mappingToDtoList(selectList);
		resultDto.paging = receiveInspectionSDDto.paging;
		return resultDto;
	}
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

	/**
	 * <h2>入荷検品データ取得(明細)。</h2>
	 * <pre>
	 * 画面で選択された入荷検品明細のデータを取得する。
	 *
	 * 【入荷実績データ取得】、【入荷状態チェック】、【HT検品中チェック】後、
	 * 入荷検品画面用DTOに下記内容を設定し返却する。
	 * ・入荷実績ヘッダ情報
	 * ・入荷実績ボディ情報 (1件のみ)
	 * ・【ステータスCDとステータス内容】
	 *
	 * 【入荷実績データ取得】
	 * ・{@link ReceiveInputSelectLogic#selectDetail(TReceivePlanH, TStoreRecordB, TReceivePlanB, ErrorStatus) 入荷実績入力データ(明細)メソッド}を呼び出す。
	 *
	 * 【入荷状態チェック】
	 *・{@link ReceiveStatusCheckLogic#receiveResultEntry(List,List,List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【HT検品中チェック】
	 *・{@link ReceiveStatusCheckLogic#htReceive(List,List,List) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   1:ユーザによる確認（HT検品中確認）
	 *   2:入荷実績入力データ取得異常
	 *   3:入荷状態チェック異常
	 *   12:商品マスタ存在異常
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/searchDetail")
	public ReceiveInspectionSDDto searchDetail(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final TReceivePlanH header = headerMapper.mappingToEntity(receiveInspectionSDDto.data.head);
		TStoreRecordBDtoMapper bodyMapper = new TStoreRecordBDtoMapper();
		final TStoreRecordB body = bodyMapper.mappingToEntity(receiveInspectionSDDto.data.storeBody.get(0));

		// =======================================================
		// =              入荷実績入力データ(1件)の取得
		// =======================================================

		TReceivePlanH conditionHeader = new TReceivePlanH();
		conditionHeader.setCenterId(header.getCenterId());
		conditionHeader.setClientId(header.getClientId());

		TStoreRecordB conditionBody = new TStoreRecordB();
		conditionBody.setStoreRecordBId(body.getStoreRecordBId());

		TReceivePlanB conditionPlanBody = new TReceivePlanB();
		conditionPlanBody.setReceivePlanBId(body.getReceivePlanBId());

		TStoreRecordB selectEntity = receiveInputSelectLogic.selectDetail(conditionHeader, conditionBody, conditionPlanBody, errRetSts(StatusCode.RECEIVE_INPUT_SELECT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// =======================================================
		// =              入荷状態チェック
		// =======================================================

		// [#1928] 入荷検品ＳＤ - 検索画面のHT検品中時メッセージ不正 2017.06.22 honma Mod Start
		// チェック用入荷実績入力データリスト取得の検索データ編集
		TReceivePlanH checkConditionHeader = new TReceivePlanH();
		checkConditionHeader.setReceivePlanHId(selectEntity.getTReceivePlanB().getTReceivePlanH().getReceivePlanHId());

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectEntityList = receiveInputSelectLogic.select(checkConditionHeader, errRetSts(StatusCode.RECEIVE_INPUT_SELECT_FAILED));
		//エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 入荷予定ヘッダリスト、入荷予定ボディリスト、入庫実績ボディリストの取得
		List<TReceivePlanH> checkTReceivePlanHList = new ArrayList<TReceivePlanH>();
		List<TReceivePlanB> checkTReceivePlanBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> checkTStoreRecordBList = new ArrayList<TStoreRecordB>();

		checkTReceivePlanHList.add(selectEntityList.get(0).getTReceivePlanB().getTReceivePlanH());
		for (TStoreRecordB selectEntitybody : selectEntityList) {
			checkTReceivePlanBList.add(selectEntitybody.getTReceivePlanB());
			checkTStoreRecordBList = selectEntityList;
		}

		// 入荷状態チェック.入荷実績登録メソッドを呼出し
		receiveStatusCheckLogic.receiveResultEntry(checkTReceivePlanHList, checkTReceivePlanBList, checkTStoreRecordBList, errRetSts(StatusCode.RECEIVE_STATUS_CHECK_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 入荷状態チェック.ＨＴ検品中メソッドを呼出し
		if (receiveStatusCheckLogic.htReceive(checkTReceivePlanHList, checkTReceivePlanBList, checkTStoreRecordBList)) {
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.UNDER_H_T_INSPECT_CONFIRMATION);
		}
		// [#1928] 入荷検品ＳＤ - 検索画面のHT検品中時メッセージ不正 2017.06.22 honma Mod End

		// =======================================================
		// =              入荷実績データセット
		// =======================================================

		setDtoData(selectEntity);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// =======================================================
		// =              返信用DTO作成
		// =======================================================

		ReceiveInspectionSDDto resultDto = new ReceiveInspectionSDDto();
		// [#1928] 入荷検品ＳＤ - 検索画面のHT検品中時メッセージ不正 2017.06.22 honma Add Start
		List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();
		tStoreRecordBList.add(selectEntity);
		// [#1928] 入荷検品ＳＤ - 検索画面のHT検品中時メッセージ不正 2017.06.22 honma Add End
		resultDto.data.storeBody = bodyMapper.mappingToDtoList(tStoreRecordBList);
		resultDto.data.storeHead = ReceiveInspectionSDDto.chaseTStoreRecordHDto(resultDto.data.storeBody.get(0).getTStoreRecordH());

		return resultDto;
	}

	private void setDtoData(TStoreRecordB selectBody) {
		if (selectBody.getTReceivePlanB().getMProduct() == null) {
			// 商品が商品マスタから削除されている

			getErrorManager().add(errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_CODE_FOUND_DELETED_WITH_CD_ERROR, selectBody.getTReceivePlanB().getProductCd());
			return;
		}

		//[Ver3.0][#3113] 複数荷姿対応に伴い不要となった処理を削除 2017.12.06 miyabe

		if (selectBody.getMLocation() == null) {
			selectBody.setMLocation(new MLocation());
		}
	}

	// [#120] 入荷検品 2017.02.07 honma Add Start

	/**
	 * <h2>初期処理を行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダIDをキーに【入荷実績入力データ取得】し、
	 * データが存在しない場合、エラーにして処理を中止する。
	 * 【入荷状態チェック.入荷実績登録起動】、【HT検品中】チェック後、各マスタからデータを取得し、
	 * 入荷実績登録画面用のDTOをセットする。
	 * ・入荷実績入力(予定あり)ヘッダ部のデータを画面用のDTOに設定
	 * ・入荷実績入力(予定あり)ボディ部のデータを画面用のDTOに設定
	 * 返す【ステータスCDとステータス内容】を設定する。
	 *
	 * 【入荷実績入力データ取得】
	 * ・{@link ReceiveInputSelectLogic#select(TReceivePlanH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績入力データ取得メソッド}を呼び出す。
	 *
	 * 【入荷状態チェック.入荷実績登録起動】
	 *・{@link ReceiveStatusCheckLogic#receiveResultEntry(List,List,List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【入荷状態チェック.HT検品中】
	 *・{@link ReceiveStatusCheckLogic#htReceive(List,List,List) 入荷実績登録起動チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   1:ユーザによる確認（HT検品中確認）
	 *   2:入荷実績入力データ取得異常
	 *   3:入荷状態チェック異常
	 *   12:商品マスタ存在異常
	 * </pre>
	 * @param receivePlanHId 入荷予定ヘッダID
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/initSearch")
	public ReceiveInspectionSDDto initSearch(@QueryParam("receivePlanHId") Long receivePlanHId) {

		// =======================================================
		// =              入荷実績入力データの取得               =
		// =======================================================

		// 入荷実績入力データ取得の検索データ編集
		TReceivePlanH planHead = new TReceivePlanH();
		planHead.setReceivePlanHId(receivePlanHId);

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectEntity = receiveInputSelectLogic.select(planHead, errRetSts(StatusCode.RECEIVE_INPUT_SELECT_FAILED));
		//エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// =======================================================
		// =              入荷状態チェック                       =
		// =======================================================

		// 入荷予定ヘッダリスト、入荷予定ボディリスト、入庫実績ボディリストの取得
		List<TReceivePlanH> tReceivePlanHList = new ArrayList<TReceivePlanH>();
		List<TReceivePlanB> tReceivePlanBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();

		tReceivePlanHList.add(selectEntity.get(0).getTReceivePlanB().getTReceivePlanH());
		for (TStoreRecordB body : selectEntity) {
			tReceivePlanBList.add(body.getTReceivePlanB());
			tStoreRecordBList = selectEntity;
		}

		// 入荷状態チェック.入荷実績登録メソッドを呼出し
		receiveStatusCheckLogic.receiveResultEntry(tReceivePlanHList, tReceivePlanBList, tStoreRecordBList, errRetSts(StatusCode.RECEIVE_STATUS_CHECK_FAILED));

		//エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 入荷状態チェック.ＨＴ検品中メソッドを呼出し
		if (receiveStatusCheckLogic.htReceive(tReceivePlanHList, tReceivePlanBList, tStoreRecordBList)) {
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.UNDER_H_T_INSPECT_CONFIRMATION);
		}

		// =======================================================
		// =              入荷実績登録画面用DTOデータセット      =
		// =======================================================

		// JSON通信のためにSimpleDTO変換
		TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordBDto> selectDto = mapper.mappingToDtoList(selectEntity);

		// ===== 入荷実績登録画面用DTO ヘッダの作成 =====
		ReceiveInspectionSDDto receiveInspectionSDDto = new ReceiveInspectionSDDto();
		receiveInspectionSDDto.data.storeHead = ReceiveInputDto.chaseTStoreRecordHDto(selectDto.get(0).getTStoreRecordH());

		for (TStoreRecordBDto tStoreRecordBDto : selectDto) {
			if (tStoreRecordBDto.getTStoreRecordH().getStoreRecordHId() != null) {
				receiveInspectionSDDto.data.storeHead = ReceiveInputDto.chaseTStoreRecordHDto(tStoreRecordBDto.getTStoreRecordH());
				break;
			}
		}

		// 入荷予定ヘッダ取得
		receiveInspectionSDDto.data.storeHead.setTReceivePlanH(selectDto.get(0).getTReceivePlanB().getTReceivePlanH());

		// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start

		// パラメータマスタデータを取得
		final long clientId = CU.coalesce(selectDto.get(0).getTStoreRecordH().getClientId(), selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getClientId());
		final long centerId = CU.coalesce(selectDto.get(0).getTStoreRecordH().getCenterId(), selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getCenterId());
		MParam mParam = paramLogic.getMParam(clientId, centerId);

		// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End

		receiveInspectionSDDto.data.storeHead.setStoreNoFlg(mParam.getStoreNoFlg());

		// センタCDの取得
		MCenter centerCondition = new MCenter();
		if (selectDto.get(0).getTStoreRecordH().getCenterId() != null) {
			centerCondition.setCenterId(selectDto.get(0).getTStoreRecordH().getCenterId());
		} else {
			centerCondition.setCenterId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getCenterId());
		}
		String centerCd = centerLogic.getPkEntityWithDeletedCheck(centerCondition).getCenterCd();
		receiveInspectionSDDto.data.storeHead.getMCenter().setCenterCd(centerCd);

		// 荷主CDを取得
		MClient clientCondition = new MClient();
		if (selectDto.get(0).getTStoreRecordH().getClientId() != null) {
			clientCondition.setClientId(selectDto.get(0).getTStoreRecordH().getClientId());
		} else {
			clientCondition.setClientId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getClientId());
		}
		String clientCd = clientLogic.getPkEntityWithDeletedCheck(clientCondition).getClientCd();
		receiveInspectionSDDto.data.storeHead.getMClient().setClientCd(clientCd);

		// 仕入先CDを取得
		MCustomer customerCondition = new MCustomer();
		if (selectDto.get(0).getTStoreRecordH().getSupplierId() != null) {
			customerCondition.setCustomerId(selectDto.get(0).getTStoreRecordH().getSupplierId());
		} else {
			customerCondition.setCustomerId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getPlanSupplierId());
		}
		String supplierCd = customerLogic.getPkEntityWithDeletedCheck(customerCondition).getCustomerCd();
		receiveInspectionSDDto.data.storeHead.getTReceivePlanH().setPlanSupplierCd(supplierCd);


		// [#2896][#4599] 入庫日が入庫実績ボディ1件目固定になっている問題を修正/入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start
		// 入荷日
		String storeDt = getStoreDt(selectEntity);
		if (!CU.isNullOrEmpty(storeDt)) {
			// 入庫済
			receiveInspectionSDDto.data.storeHead.getTReceivePlanH().setReceivePlanDt(storeDt);
		} else {
			// 未入庫 (システム管理日付を入庫日とする)
			receiveInspectionSDDto.data.storeHead.getTReceivePlanH().setReceivePlanDt(mParam.chaseMClientCenter().getSystemDt());
		}
		// [#2896][#4599] 入庫日が入庫実績ボディ1件目固定になっている問題を修正/入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End

		//処理区分CDを取得
		MProcessType processTypeCondition = new MProcessType();
		if (selectDto.get(0).getTStoreRecordH().getProcessTypeId() != null) {
			processTypeCondition.setProcessTypeId(selectDto.get(0).getTStoreRecordH().getProcessTypeId());
		} else {
			processTypeCondition.setProcessTypeId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getProcessTypeId());
		}
		String processTypeCd = processTypeLogic.getPkEntityWithDeletedCheck(processTypeCondition).getProcessTypeCd();
		receiveInspectionSDDto.data.storeHead.getMProcessType().setProcessTypeCd(processTypeCd);

		// 預託CDを取得
		MCustomer depositCdCondition = new MCustomer();
		if (selectDto.get(0).getTStoreRecordH().getDepositId() != null) {
			depositCdCondition.setCustomerId(selectDto.get(0).getTStoreRecordH().getDepositId());
		} else {
			depositCdCondition.setCustomerId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getPlanDepositId());
		}
		String depositCd = customerLogic.getPkEntityWithDeletedCheck(depositCdCondition).getCustomerCd();
		receiveInspectionSDDto.data.storeHead.getTReceivePlanH().setPlanDepositCd(depositCd);

		//処理区分CDを取得
		MStockType stockTypeCondition = new MStockType();
		if (selectDto.get(0).getTStoreRecordH().getStockTypeId() != null) {
			stockTypeCondition.setStockTypeId(selectDto.get(0).getTStoreRecordH().getStockTypeId());
		} else {
			stockTypeCondition.setStockTypeId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getStockTypeId());
		}
		String stockTypeCd = stockTypeLogic.getPkEntityWithDeletedCheck(stockTypeCondition).getStockTypeCd();
		receiveInspectionSDDto.data.storeHead.getMStockType().setStockTypeCd(stockTypeCd);

		// ===== 入荷実績登録画面用DTO ボディの作成 =====
		for (TStoreRecordBDto selectBody : selectDto) {

			if (selectBody.getTReceivePlanB().getMProduct() == null) {
				// 商品が商品マスタから削除されている

				getErrorManager().add(errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_CODE_FOUND_DELETED_WITH_CD_ERROR, selectBody.getTReceivePlanB().getProductCd());
				return null;
			}

			//[Ver3.0][#3113] 複数荷姿対応に伴い不要となった処理を削除 2017.12.06 miyabe

			receiveInspectionSDDto.data.storeBody.add(ReceiveInputDto.chaseTStoreRecordBDto(selectBody));
		}
		return receiveInspectionSDDto;
	}

	/**
	 * <h2>入力チェック（登録）を行う</h2>
	 * <pre>
	 * 【HT検品中チェック】してから、【登録データの組み立て】を行う。
	 * あと下記チェックする
	 * ・パラメータマスタ.過入荷可フラグ[0:不可]の場合、入荷予定数超えるかどうかチェック
	 * ・センタ間移動の場合、入荷予定数超えるかどうかチェック
	 * ・【在庫更新チェッククラス.入荷限界日チェック】
	 * 返す【ステータスCDとステータス内容】を設定する。
	 *
	 * 【HT検品中チェック】
	 * ・{@link ReceiveStatusCheckLogic#htReceive(List, List, List) HT検品中チェックメソッド}を呼び出す。
	 *
	 * 【登録データの組み立て】
	 * ・{@link ReceiveInputResource#setupRegisterData(TStoreRecordH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 登録データの組み立てメソッド}を呼び出す。
	 *
	 * 【在庫更新チェッククラス.入荷限界日チェック】
	 * ・{@link StockUpdateCheckLogic#receiveLimitDateCheck(TReceivePlanH, List, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷限界日チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   1:ユーザによる確認(HT検品中確認、予定数超える確認、通常処理前確認)
	 *   6：期限日(限界日)チェック異常
	 *   9:入荷実績登録異常
	 *   13：該当データ無し
	 *
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO：入荷実績入力(予定あり)画面ヘッダDTO・入荷実績入力(予定あり)画面明細DTOリスト
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@POST
	@Path("/inputCheckRegister")
	public ReceiveInspectionSDDto inputCheckRegister(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInspectionSDDto.data.storeHead);

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInspectionSDDto.data.storeBody);

		// 入荷予定ボディリスト
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB body : storeBodyList) {
			planBodyList.add(body.getTReceivePlanB());
		}

		// =======================================================
		// =              HT検品中チェック                       =
		// =======================================================

		// 入力前データ(未選択のデータを含む)でHT検品中チェックを行う
		List<TStoreRecordB> originalStoreBodyList = storeBodyMapper.mappingToEntityList(receiveInspectionSDDto.data.originalStoreBody);
		List<TReceivePlanB> originalPlanBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB body : originalStoreBodyList) {
			originalPlanBodyList.add(body.getTReceivePlanB());
		}

		// 入荷状態チェック.ＨＴ検品中メソッドを呼出し
		List<TReceivePlanH> tReceivePlanHList = new ArrayList<TReceivePlanH>();
		tReceivePlanHList.add(storeHead.getTReceivePlanH());

		if (receiveStatusCheckLogic.htReceive(tReceivePlanHList, originalPlanBodyList, originalStoreBodyList)) {
			// 選択されていないデータの入荷数超えの確認メッセージを表示しない
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.UNDER_H_T_INSPECT_CONFIRMATION);
		}

		// =======================================================
		// =              入力チェック                           =
		// =======================================================

		// [#1800][#1805][Ver2.2.0] 過入荷可フラグ対応 2017.05.18 honma Add Start
		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (storeHead.getClientId() != null && storeHead.getCenterId() != null) {
			mClientCenter.setClientId(storeHead.getClientId());
			mClientCenter.setCenterId(storeHead.getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		// [#1800][#1805][Ver2.2.0] 過入荷可フラグ対応 2017.05.18 honma Add End

		// 登録データを組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(storeHead, storeBodyList, planBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		} else if (checkStatus == ResultSetupRegisterData.RECEIVE_QTY_WARN) {
			// 入荷数超過

			// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana Start

			// [#1800][#1805][Ver2.2.0] 過入荷可フラグ対応 2017.05.18 honma Mod Start
			// パラメータマスタ.過入荷可フラグ[0:不可]、または、センタ間移動
			if (mParam.isOverStoreNumFlg$0() || storeHead.getTReceivePlanH().isCenterTransitFlg$1()) {
				// [#1800][#1805][Ver2.2.0] 過入荷可フラグ対応 2017.05.18 honma Mod End

				// パラメータマスタ.過入荷可フラグ[0:不可]、または、センタ間移動の場合はエラー
				getErrorManager().add(errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED), WmsMessageConst.SHIP_RESULT_QTY_CANNOT_INPUT_MORE_THAN_PLAN_ERROR);
				return null;
			} else {

				// 通常は確認メッセージ表示
				getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_QTY_REGISTER_MORE_THAN_PLAN_CONFIRMATION);
			}

			// =======================================================
			// =              期限日(限界日)チェック                 =
			// =======================================================

			List<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
			List<TStoreRecordB> storeBList = new ArrayList<TStoreRecordB>();

			for (int i = 0; i < storeBodyList.size(); i++) {
				TStoreRecordB storeBody = storeBodyList.get(i);
				TReceivePlanB planBody = planBodyList.get(i);

				if (storeBody.getStoreNum() != null && WCC.isNotZero(storeBody.getStoreNum())) {
					storeBList.add(storeBody);
					planBList.add(planBody);
				}
			}

			int warnSize = getWarnManager().size();
			// 在庫更新チェッククラス.入荷限界日チェックメソッドを呼出し
			stockUpdateCheckLogic.receiveLimitDateCheck(storeHead.getTReceivePlanH(), planBList, storeHead, storeBList,
					errRetSts(errRetSts(StatusCode.LIMIT_DT_CHECK_FAILED), StatusCode.CONFIRMATION));

			// 結果判定
			if (getWarnManager().size() > warnSize) {
				for (int i = 0; i < storeBodyList.size(); i++) {
					TStoreRecordB body = storeBodyList.get(i);
					receiveInspectionSDDto.data.storeBody.get(i).setLimitDtNgFlg(body.getLimitDtNgFlg());
					receiveInspectionSDDto.data.storeBody.get(i).setMaxLimitDt(body.getMaxLimitDt());
				}

				// [#1805][Ver2.2.0] 過去日入力可フラグ対応 2017.05.18 honma Add Start
				if (mParam.isPastStoreDtFlg$0()) {
					// パラメータマスタ.過去日入力可フラグ[0:不可]の場合
					getErrorManager().add(errRetSts(StatusCode.LIMIT_DT_CHECK_FAILED), WmsMessageConst.INPUT_LIMIT_DATE_OVER_ERROR);
				}
				// [#1805][Ver2.2.0] 過去日入力可フラグ対応 2017.05.18 honma Add End

				// 処理中止
				return receiveInspectionSDDto;
			}

			return null;
		} else if (checkStatus == ResultSetupRegisterData.RECEIVE_QTY_ERROR) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// =======================================================
		// =              期限日(限界日)チェック                 =
		// =======================================================

		List<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> storeBList = new ArrayList<TStoreRecordB>();

		for (int i = 0; i < storeBodyList.size(); i++) {
			TStoreRecordB storeBody = storeBodyList.get(i);
			TReceivePlanB planBody = planBodyList.get(i);

			if (storeBody.getStoreNum() != null && WCC.isNotZero(storeBody.getStoreNum())) {
				storeBList.add(storeBody);
				planBList.add(planBody);
			}
		}

		int warnSize = getWarnManager().size();
		// 在庫更新チェッククラス.入荷限界日チェックメソッドを呼出し
		stockUpdateCheckLogic.receiveLimitDateCheck(storeHead.getTReceivePlanH(), planBList, storeHead, storeBList,
				errRetSts(errRetSts(StatusCode.LIMIT_DT_CHECK_FAILED), StatusCode.CONFIRMATION));

		// 結果判定
		if (getWarnManager().size() > warnSize) {
			for (int i = 0; i < storeBodyList.size(); i++) {
				TStoreRecordB body = storeBodyList.get(i);
				receiveInspectionSDDto.data.storeBody.get(i).setLimitDtNgFlg(body.getLimitDtNgFlg());
				receiveInspectionSDDto.data.storeBody.get(i).setMaxLimitDt(body.getMaxLimitDt());
			}

			// [#1805][Ver2.2.0] 過去日入力可フラグ対応 2017.05.18 honma Add Start
			if (mParam.isPastStoreDtFlg$0()) {
				// パラメータマスタ.過去日入力可フラグ[0:不可]の場合
				getErrorManager().add(errRetSts(StatusCode.LIMIT_DT_CHECK_FAILED), WmsMessageConst.INPUT_LIMIT_DATE_OVER_ERROR);
			}
			// [#1805][Ver2.2.0] 過去日入力可フラグ対応 2017.05.18 honma Add End

			// 処理中止
			return receiveInspectionSDDto;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>期限日(限界日)チェック。</h2>
	 * <pre>
	 * 画面明細行に、期限日を入力する際に、期限日(限界日)チェックを行う。
	 *
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@POST
	@Path("/inputCheckLimitDt")
	public ReceiveInspectionSDDto inputCheckLimitDt(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInspectionSDDto.data.storeHead);
		// 入荷予定ヘッダ
		TReceivePlanH planHead = storeHead.getTReceivePlanH();

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInspectionSDDto.data.storeBody);

		List<TReceivePlanB> checkPlanBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> checkStoreBList = new ArrayList<TStoreRecordB>();
		List<TReceivePlanB> setPlanBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> setStoreBList = new ArrayList<TStoreRecordB>();
		for (TStoreRecordB storeBody : storeBodyList) {

			// 入荷予定ボディ
			TReceivePlanB planBody = storeBody.getTReceivePlanB();

			if (CU.isNullOrEmpty(storeBody.getLimitDt())) {

				// 入荷限界期限日の設定のみ
				setPlanBList.add(planBody);
				setStoreBList.add(storeBody);
			} else {

				try {
					// 日付文字列チェック
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
					dateFormat.parse(storeBody.getLimitDt());

					// 入荷限界期限日の設定とチェック
					checkPlanBList.add(planBody);
					checkStoreBList.add(storeBody);
				} catch (ParseException e) {

					// 入荷限界期限日の設定のみ
					setPlanBList.add(planBody);
					setStoreBList.add(storeBody);
				}
			}
		}

		// ===== 入荷限界期限日チェック =====
		if (0 < setPlanBList.size()) {
			stockUpdateCheckLogic.setReceiveLimitDate(planHead, setPlanBList, storeHead, setStoreBList);
		}
		if (0 < checkPlanBList.size()) {
			stockUpdateCheckLogic.receiveLimitDateCheck(planHead, checkPlanBList, storeHead, checkStoreBList);
		}

		receiveInspectionSDDto.data.storeBody = storeBodyMapper.mappingToDtoList(storeBodyList);

		return receiveInspectionSDDto;
	}

	/**
	 * <h2>入荷実績登録処理を行う。</h2>
	 * <pre>
	 * 【登録データを組み立て】し、
	 * 全削除して登録の時：
	 *   ヘッダー単位で【入荷実績削除】してから【入荷実績登録】を行う。
	 * 部分更新時：
	 *   【入庫数の更新(プラス)】、【入庫数の更新(マイナス)】、【入荷実績ボディ削除＆新規＆更新】【入荷実績ヘッダ更新】を行う。
	 *   【入荷予定ステータス更新.完納判定】後、【入荷予定ステータス更新.完納】を行う。
	 *【入荷予定ステータス更新.入荷済】を更新する。
	 * 返す【ステータスCDとステータス内容】を設定する。
	 *
	 * 【登録データを組み立て】
	 * ・{@link ReceiveInputResource#setupRegisterData(TStoreRecordH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 登録データを組み立てメソッド}を呼び出す。
	 *
	 * 【入荷実績削除】
	 * ・{@link ReceiveInputDeleteLogic#delete(TStoreRecordH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績削除メソッド}を呼び出す。
	 *
	 * 【入荷実績登録】
	 * ・{@link ReceiveInputInsertLogic#insert(TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績登録メソッド}を呼び出す。
	 *
	 * 【入庫数の更新(プラス)】
	 * ・{@link ReceiveInputUpdateLogic#updateStoreNumPlus(TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫数の更新(プラス)メソッド}を呼び出す。
	 *
	 * 【入庫数の更新(マイナス)】
	 * ・{@link ReceiveInputUpdateLogic#updateStoreNumMinus(TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫数の更新(マイナス)メソッド}を呼び出す。
	 *
	 * 【入荷実績ボディ更新＆削除＆新規】
	 * ・{@link ReceiveInputUpdateLogic#updateBody(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績ボディ更新メソッド}を呼び出す。
	 * ・{@link ReceiveInputDeleteLogic#deleteBody(TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫実績ボディ削除メソッド}を呼び出す。
	 * ・{@link ReceiveInputInsertLogic#insertBody(TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫実績ボディ登録メソッド}を呼び出す。
	 *
	 * 【入荷実績ヘッダ更新】
	 * ・{@link ReceiveInputUpdateLogic#updateHeader(TStoreRecordH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績ヘッダ更新メソッド}を呼び出す。
	 *
	 * 【入荷予定ステータス更新.完納判定】
	 * ・{@link ReceiveStatusUpdateLogic#checkReceiveComplete(long) 完納判定メソッド}を呼び出す。
	 *
	 * 【入荷予定ステータス更新.完納】
	 * ・{@link ReceiveStatusUpdateLogic#receiveComplete(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 完納メソッド}を呼び出す。
	 *
	 * 【入荷予定ステータス更新.入荷済】
	 * ・{@link ReceiveInputUpdateLogic#updateHeader(TStoreRecordH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績ヘッダ更新メソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   0:正常終了
	 *   9:入荷実績登録異常
	 *   10:入荷予定ステータス更新異常
	 *   11:入荷実績削除異常
	 *   16:入荷実績更新異常
	 *
	 * </pre>
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO：
	 *                        ・入荷実績入力(予定あり)画面ヘッダDTO
	 *                        ・入荷実績入力(予定あり)画面明細DTOリスト
	 *                        ・入荷実績入力(予定あり)画面ヘッダDTO(変更前)
	 *                        ・入荷実績入力(予定あり)画面明細DTOリスト(変更前)
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM Start
	@WorkLogMergeEnd("ReceiveInspectionSD")
	// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM End
	public ReceiveInspectionSDDto register(ReceiveInspectionSDDto receiveInspectionSDDto) throws Exception {

		// =======================================================
		// =              登録データ組み立て                     =
		// =======================================================

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInspectionSDDto.data.storeHead);
		// 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように
		TStoreRecordH originalStoreHead = storeHeadMapper.mappingToEntity(receiveInspectionSDDto.data.originalStoreHead);

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInspectionSDDto.data.storeBody);
		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Add Start
		List<TStoreRecordB> printStoreBodyList = storeBodyMapper.mappingToEntityList(receiveInspectionSDDto.data.printStoreBody);
		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Add End
		// 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように
		List<TStoreRecordB> originalStoreBodyList = storeBodyMapper.mappingToEntityList(receiveInspectionSDDto.data.originalStoreBody);

		// 入荷予定ボディリスト
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB storeBody : storeBodyList) {
			planBodyList.add(storeBody.getTReceivePlanB());
		}

		// 登録データ組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(storeHead, storeBodyList, planBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		}

		// 入庫日が変わったときに他在庫にマージされないように
		// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.05.15 kawana Start
		String originalStoreDt = getStoreDt(originalStoreBodyList);
		// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.05.15 kawana End
		String storeDt = storeHead.getTReceivePlanH().getReceivePlanDt();

		// ===== 固定値の設定 =====
		for (TStoreRecordB body : storeBodyList) {
			body.setInputType_$00();
			body.setStoreDt(storeDt);
		}

		// マージされた全在庫の期限日が変わらないように
		List<ResultReceive> resultList = null;

		// 入荷実績を全て変更するかを判定
		boolean doChangeAll = doChangeAll(originalStoreHead, storeHead, originalStoreDt, storeDt);
		// 入庫日が変わったときに他在庫にマージされないように
		if (doChangeAll) {
			// 削除して再登録

			// =======================================================
			// =              入荷実績削除                           =
			// =======================================================

			//入庫実績ヘッダID存在の場合
			if (storeHead.getStoreRecordHId() != null) {
				//入荷実績削除.入荷実績削除メソッドを呼出し
				receiveInputDeleteLogic.delete(storeHead, errRetSts(StatusCode.RECEIVE_INPUT_DELETE_FAILED));
				// 結果判定
				if (getErrorManager().size() > 0) {
					// 処理中止
					return null;
				}
			}

			// =======================================================
			// =              入荷実績登録                           =
			// =======================================================

			// マージされた全在庫の期限日が変わらないように
			// 入荷実績登録.入荷実績登録メソッドを呼出し
			resultList = inputInsertLogic.insert(storeHead, storeBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}

		} else {
			// 部分更新

			// 変更前の実績ボディのマップを作成
			Map<Long, TStoreRecordB> originalBodyMap = new HashMap<>();
			for (TStoreRecordB body : originalStoreBodyList) {
				if (body.getStoreRecordBId() == null) {
					continue;
				}

				originalBodyMap.put(body.getStoreRecordBId(), body);
			}

			// 変更後の実績ボディから登録リスト、削除リスト、更新リストなどに分ける
			List<TStoreRecordB> insertBodyList = new ArrayList<TStoreRecordB>();
			List<TStoreRecordB> reinsertBodyList = new ArrayList<TStoreRecordB>();
			List<TStoreRecordB> updateBodyList = new ArrayList<TStoreRecordB>();
			List<TStoreRecordB> updateStoreNumPlusList = new ArrayList<TStoreRecordB>();
			List<TStoreRecordB> updateStoreNumMinusList = new ArrayList<TStoreRecordB>();

			for (TStoreRecordB body : storeBodyList) {

				if (body.getStoreRecordBId() == null) {
					// 新規登録
					insertBodyList.add(body);
				} else {
					// 登録済の行

					// 差分を確認
					TStoreRecordB originalBody = originalBodyMap.get(body.getStoreRecordBId());
					boolean doChangeBody = doChangeBody(originalBody, body);
					if (doChangeBody) {
						// 差分あり

						// 削除 -> 登録
						reinsertBodyList.add(body);
					} else {
						// 差分なし

						// 通常の更新
						updateBodyList.add(body);

						// 入庫数の差分を確認
						BigDecimal storeNum = CU.nullToZero(body.getStoreNum());
						BigDecimal originalStoreNum = CU.nullToZero(originalBody.getStoreNum());

						if (originalStoreNum != storeNum) {
							// 入庫数に差分あり

							BigDecimal diffNum = WCC.subtract(storeNum, originalStoreNum);

							if (WCC.isPositive(diffNum)) {

								TStoreRecordB diffBody = body.clone();
								diffBody.setStoreNum(diffNum);

								updateStoreNumPlusList.add(diffBody);
							} else {

								TStoreRecordB diffBody = body.clone();
								// 絶対値
								diffBody.setStoreNum(diffNum.abs());

								updateStoreNumMinusList.add(diffBody);
							}
						}
					}
				}
			}

			//  ===== 各ボディの登録 =====

			// 入庫数の更新(プラス)
			if (0 < updateStoreNumPlusList.size()) {
				inputUpdateLogic.updateStoreNumPlus(storeHead, updateStoreNumPlusList, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}
			}

			// 入庫数の更新(マイナス)
			if (0 < updateStoreNumMinusList.size()) {
				inputUpdateLogic.updateStoreNumMinus(storeHead, updateStoreNumMinusList, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}
			}

			// 入荷実績ボディ更新
			if (0 < updateBodyList.size()) {
				inputUpdateLogic.updateBody(updateBodyList, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
				if (getErrorManager().size() > 0) {
					// 処理中止
					return null;
				}
			}

			// マージされた全在庫の期限日が変わらないように
			if (0 < reinsertBodyList.size() || 0 < insertBodyList.size()) {
				resultList = new ArrayList<ResultReceive>();
			}

			// 再登録
			if (0 < reinsertBodyList.size()) {

				//入荷実績削除.入荷実績ボディ削除メソッドを呼出し
				receiveInputDeleteLogic.deleteBody(storeHead, reinsertBodyList, errRetSts(StatusCode.RECEIVE_INPUT_DELETE_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}

				// マージされた全在庫の期限日が変わらないように
				// 入荷実績登録.入荷実績ボディ登録メソッドを呼出し
				List<ResultReceive> result = inputInsertLogic.insertBody(storeHead, reinsertBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}
				resultList.addAll(result);
			}

			// 新規登録
			if (0 < insertBodyList.size()) {
				// マージされた全在庫の期限日が変わらないように
				// 入荷実績登録.入荷実績ボディ登録メソッドを呼出し
				List<ResultReceive> result = inputInsertLogic.insertBody(storeHead, insertBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}
				resultList.addAll(result);
			}

			// ===== ヘッダの更新 =====

			// 入荷実績ヘッダ更新
			inputUpdateLogic.updateHeader(storeHead, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}

			// 完納判定
			if (receiveStatusUpdateLogic.checkReceiveComplete(storeHead.getReceivePlanHId())) {

				TReceivePlanH planHead = tReceivePlanHBhv.selectByPKValue(storeHead.getTReceivePlanH().getReceivePlanHId());
				List<TReceivePlanH> planHeadList = new ArrayList<TReceivePlanH>();
				planHeadList.add(planHead);

				// 入荷予定ステータス更新.完納メソッドを呼出し
				receiveStatusUpdateLogic.receiveComplete(planHeadList, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
			}
		}

		// =======================================================
		// =              DBに入荷予定ステータスを更新           =
		// =======================================================

		// 入荷予定ステータス更新.入荷済メソッドを呼出し
		statusUpdateLogic.received(planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_STATUS_UPDATE_FAILED));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (storeHead.getClientId() != null && storeHead.getCenterId() != null) {
			mClientCenter.setClientId(storeHead.getClientId());
			mClientCenter.setCenterId(storeHead.getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod Start
		boolean printFlg = false;
		if (mParam.isResultAfterProductLabel$2() || mParam.isResultAfterProductLabel$3()) {
			BigDecimal storeNumSum = WCC.ZERO;
			// 入庫数の合計による商品ラベル自動出力判定
			for (TStoreRecordB body : printStoreBodyList) {
				storeNumSum = WCC.add(storeNumSum, body.getStoreNum());
			}
			if (WCC.isPositive(storeNumSum)) {
				printFlg = true;
			}
		}
		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod End

		receiveInspectionSDDto.data.storeHead.setStoreRecordHId(storeHead.getStoreRecordHId());

		// ===== 完了メッセージの設定 =====

		if (resultList != null) {
			for (ResultReceive result : resultList) {
				if (result.status == StockUpdateStatus.NEW_CAUSE_USED) {
					getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.STOCK_REGISTER_NEW_CAUSE_STORE_LABEL_USED_INFORMATION);
					return receiveInspectionSDDto;
				}
			}
		}

		// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM Start
		// 総入庫数
		setWorkLogQty(CU.nullToZero(storeBodyList.get(0).getStoreNum()));
		// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM End

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod Start
		if (printFlg) {
			if (mParam.isResultAfterProductTarget$1() && resultList != null) {
				// 入庫ラベル自動発行処理

				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start
				String storeLabelNo = resultList.get(0).storeLabelNo;
				storeLabelPrintLogic.autoPrintUnprintOnly(storeHead.getCenterId(), storeLabelNo, errRetSts(StatusCode.STORE_LABEL_PRINT_FAILED));
				if (0 < getErrorManager().size()) {
					return receiveInspectionSDDto;
				}
				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End
			}
			if (mParam.isResultAfterProductTarget$2()) {
				// 商品ラベル自動発行処理
				ProductLabelPrintDto labelPrintDto = new ProductLabelPrintDto();
				labelPrintDto.data.storeHead = receiveInspectionSDDto.data.storeHead;
				autoPrint(labelPrintDto, printStoreBodyList);
			}
		}
		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod End

		return receiveInspectionSDDto;
	}

	/**
	 * <h2>登録データを組み立てする</h2>
	 * <pre>
	 * 入庫実績ボディデータ組み立て時、以下のチェックを行う後、結果を戻り値に設定する
	 * ・商品マスタ存在チェック
	 * ・ロケーション存在チェック
	 * ・【入荷数チェック】（予定数超えていないかチェック）
	 *
	 * 画面で入力されたCDを元にIDを取得し、入庫実績データに設定する。
	 * 入庫実績ヘッダ:センタID・荷主ID・処理区分ID・預託ID・在庫区分ID・仕入先ID
	 * 入庫実績ボディ・商品ID・ロケーションID（ロケーションコードが入力されているときのみ）
	 *
	 * 【入荷数チェック】
	 * ・{@link ReceiveNumCheckLogic#check(List) 入荷数チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   7: 仕入先マスタ存在異常
	 *   8:ロケーションマスタ存在異常
	 *   12:商品マスタ存在異常
	 *   13:該当データ無し
	 *
	 * </pre>
	 * @param header 入庫実績ヘッダ:センタCD・荷主CD・処理区分CD、仕入先CD･預託CD･在庫区分CD
	 * @param storeBodyList 入庫実績ボディリスト:商品CD･ロケーションCD
	 * @param planBodyList 入荷予定ボディリスト
	 * @return ResultSetupRegisterData チェックの処理結果
	 */
	protected ResultSetupRegisterData setupRegisterData(TStoreRecordH header, List<TStoreRecordB> storeBodyList,
			List<TReceivePlanB> planBodyList, ErrorStatus errSts) {

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(header.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// =======================================================
		// =              入庫実績ボディデータ組み立て           =
		// =======================================================
		int rowIndex = -1;
		for (TStoreRecordB storeBody : storeBodyList) {
			rowIndex++;

			// ===== 商品マスタ存在チェック =====
			// 商品の設定
			MProduct productCondition = new MProduct();
			productCondition.setClientId(clientId);
			productCondition.setProductCd(storeBody.getTReceivePlanB().getProductCd());
			MProduct product = productLogic.getUkEntity(productCondition, errRetSts(errSts, StatusCode.PRODUCT_NOT_FOUND, rowIndex));

			if (product != null) {
				storeBody.getTReceivePlanB().setProductId(product.getProductId());
				// 結果判定
			}

			if (getErrorManager().size() > 0) {
				getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return ResultSetupRegisterData.ERROR;
			}

			// ===== ロケーションコードがある場合はロケーションと倉庫を設定 =====

			// ロケーションの設定
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
			if (storeBody.getMLocation().getLocationCd() != null) {
				MLocation locationCondition = new MLocation();
				locationCondition.setCenterId(centerId);
				locationCondition.setLocationCd(storeBody.getMLocation().getLocationCd());

				MLocation location = locationLogic.getUkEntityWithWarehouse(locationCondition, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));

				if (location != null) {
					storeBody.setStoreLocationId(location.getLocationId());
				}

				if (getErrorManager().size() > 0) {
					// 処理中止
					return ResultSetupRegisterData.ERROR;
				}
			}
			// 入庫数空値の場合、ロケーションはNULL固定
			if (WCC.isZero(storeBody.getStoreNum())) {
				storeBody.setStoreLocationId(null);
			}
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End
		}

		// =======================================================================
		// =              入庫実績ヘッダと入荷予定ヘッダデータ組み立て           =
		// =======================================================================

		// 処理区分IDの取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setProcessTypeCd(header.getMProcessType().getProcessTypeCd());
		MProcessType mProcessType = processTypeLogic.getUkEntityWithDeletedCheck(processTypeCondition);

		// 仕入先IDの取得
		MCustomer supplierCondition = new MCustomer();
		supplierCondition.setClientId(clientId);
		supplierCondition.setCustomerCd(header.getTReceivePlanH().getPlanSupplierCd());

		// 入荷限界期限日チェック対応
		// 仕入先IDが取得できない場合、エラーメッセージをエラー管理クラスに登録
		MCustomer supplier = customerLogic.getVendorCustomerByClientCd(supplierCondition, errRetSts(errSts, StatusCode.CUSTOMER_NOT_FOUND));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return ResultSetupRegisterData.ERROR;
		}

		// 預託IDの取得
		MCustomer depositCondition = new MCustomer();
		depositCondition.setClientId(clientId);
		depositCondition.setCustomerCd(header.getTReceivePlanH().getPlanDepositCd());
		MCustomer deposit = customerLogic.getUkEntityWithDeletedCheck(depositCondition);

		// 在庫区分IDの取得
		MStockType mStockTypeCondition = new MStockType();
		mStockTypeCondition.setStockTypeCd(header.getMStockType().getStockTypeCd());
		MStockType mStockType = stockTypeLogic.getUkEntity(mStockTypeCondition);

		// センタIDの設定
		header.setCenterId(centerId);

		// 荷主IDの設定
		header.setClientId(clientId);

		// 処理区分IDの設定
		header.setProcessTypeId(mProcessType.getProcessTypeId());

		// 仕入先ID/予定仕入先IDの設定
		if (supplier != null) {
			header.setSupplierId(supplier.getCustomerId());
		}

		// 預託IDの設定
		header.setDepositId(deposit.getCustomerId());

		// 在庫区分IDの設定
		header.setStockTypeId(mStockType.getStockTypeId());

		// [#2125] SD入荷検品 - 入荷実績ヘッダ.顧客入荷指示No.登録不良 2017.07.14 Add Start
		// 顧客入荷指示No.の設定
		if (header.getTReceivePlanH().getPlanClientReceiveNo() != null) {
			header.setClientReceiveNo(header.getTReceivePlanH().getPlanClientReceiveNo());
		}
		// [#2125] SD入荷検品 - 入荷実績ヘッダ.顧客入荷指示No.登録不良 2017.07.14 Add End

		// =======================================================
		// =              入荷数チェック                         =
		// =======================================================

		// 入荷数チェック.入荷数チェックメソッドを呼出し
		String strCheck = receiveNumCheckLogic.check(storeBodyList);

		// 結果判定
		if (CU.equals(strCheck, "2")) {
			return ResultSetupRegisterData.RECEIVE_QTY_WARN;
		} else if (CU.equals(strCheck, "1")) {
			return ResultSetupRegisterData.RECEIVE_QTY_ERROR;

		}

		// 結果の設定
		ResultSetupRegisterData checkStatus;
		checkStatus = ResultSetupRegisterData.ALL_OK;
		return checkStatus;
	}

	// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.05.15 kawana Start

	/**
	 * 入庫実績ボディの入庫日を取得
	 */
	private String getStoreDt(List<TStoreRecordB> storeBodyList) {

		if (storeBodyList == null) {
			return null;
		}

		if (storeBodyList.isEmpty()) {
			return null;
		}

		String storeDt = null;
		for (TStoreRecordB body : storeBodyList) {
			String dt = body.getStoreDt();
			if (!CU.isNullOrEmpty(dt)) {
				// 入庫日あり

				if (CU.isNullOrEmpty(storeDt)) {
					storeDt = dt;
				} else {
					if (0 < dt.compareTo(storeDt)) {
						// 大きい方を適用

						storeDt = dt;
					}
				}
			}
		}

		return storeDt;
	}

	// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.05.15 kawana End

	/**
	 * <h2>入荷実績を全変更するかの判定。</h2>
	 * <pre>
	 * 入荷実績ヘッダが未登録の場合は全変更とする。
	 * 変更前と変更後で次の情報を比較し、変更がある場合は全変更とする。
	 * ・荷主ID
	 * ・センタID
	 * ・処理区分ID
	 * ・在庫区分ID
	 * ・仕入先ID
	 * ・預託ID
	 *
	 * </pre>
	 * @param originalStoreHead 変更前の入荷実績ヘッダ
	 * @param storeHead 変更後の入荷実績ヘッダ
	 * @param originalStoreDt 変更前の入庫日
	 * @param storeDt 変更後の入庫日
	 * @return boolean true : 全変更
	 */
	private boolean doChangeAll(TStoreRecordH originalStoreHead, TStoreRecordH storeHead, String originalStoreDt, String storeDt) {

		// 登録済のデータか
		if (storeHead.getStoreRecordHId() == null) {
			return true;
		}

		// 荷主ID
		if (!CU.isNotNullAndEquals(originalStoreHead.getClientId(), storeHead.getClientId())) {
			return true;
		}

		// センタID
		if (!CU.isNotNullAndEquals(originalStoreHead.getCenterId(), storeHead.getCenterId())) {
			return true;
		}

		// 処理区分ID
		if (!CU.isNotNullAndEquals(originalStoreHead.getProcessTypeId(), storeHead.getProcessTypeId())) {
			return true;
		}

		// 在庫区分ID
		if (!CU.isNotNullAndEquals(originalStoreHead.getStockTypeId(), storeHead.getStockTypeId())) {
			return true;
		}

		// 仕入先ID
		if (originalStoreHead.getSupplierId() != null || storeHead.getSupplierId() != null) {

			if (!CU.isNotNullAndEquals(originalStoreHead.getSupplierId(), storeHead.getSupplierId())) {
				return true;
			}
		}

		// 預託ID
		if (originalStoreHead.getDepositId() != null || storeHead.getDepositId() != null) {

			if (!CU.isNotNullAndEquals(originalStoreHead.getDepositId(), storeHead.getDepositId())) {
				return true;
			}
		}

		// 入庫日が変わったときに他在庫にマージされないように
		// 入庫日
		if (originalStoreDt != null || storeDt != null) {

			if (!CU.nullToStr(originalStoreDt).equals(CU.nullToStr(storeDt))) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>入庫実績ボディに変更があるかの判定。</h2>
	 * <pre>
	 * 変更前と変更後で次の情報を比較する。
	 * ・ロケーションID
	 * ・期限日
	 * ・ロット
	 * ・入庫ラベルNo
	 *
	 * </pre>
	 * @param originalStoreBody 変更前の入庫実績ボディ
	 * @param storeBody 変更後の入庫実績ボディ
	 * @return boolean true : 変更あり
	 */
	private boolean doChangeBody(TStoreRecordB originalStoreBody, TStoreRecordB storeBody) {

		if (storeBody.getStoreRecordBId() == null) {
			return true;
		}

		// ロケーションID
		if (originalStoreBody.getStoreLocationId() != null || storeBody.getStoreLocationId() != null) {

			if (!CU.isNotNullAndEquals(originalStoreBody.getStoreLocationId(), storeBody.getStoreLocationId())) {
				return true;
			}
		}

		// 期限日
		if (originalStoreBody.getLimitDt() != null || storeBody.getLimitDt() != null) {

			if (!CU.nullToStr(originalStoreBody.getLimitDt()).equals(CU.nullToStr(storeBody.getLimitDt()))) {
				return true;
			}
		}

		// ロット
		if (originalStoreBody.getLot() != null || storeBody.getLot() != null) {

			if (!CU.nullToStr(originalStoreBody.getLot()).equals(CU.nullToStr(storeBody.getLot()))) {
				return true;
			}
		}

		// 入庫ラベルNo
		if (originalStoreBody.getStoreLabelNo() != null || storeBody.getStoreLabelNo() != null) {

			if (!CU.nullToStr(originalStoreBody.getStoreLabelNo()).equals(CU.nullToStr(storeBody.getStoreLabelNo()))) {
				return true;
			}
		}

		if (originalStoreBody.getStoreLabelNo() != null || storeBody.getStoreLabelNo() != null) {

			if (!CU.nullToStr(originalStoreBody.getStoreLabelNo()).equals(CU.nullToStr(storeBody.getStoreLabelNo()))) {
				return true;
			}
		}

		return false;
	}

	/**
	 * <h2>商品ラベル自動発行処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに商品ラベル発行データを取得し、商品ラベル自動発行を行う
	 * </pre>
	 * @param printDto 商品ラベル発行画面用DTO
	 * @param tStoreRecordBList 商品ラベル発行用入庫実績ボディリスト
	 * @throws Exception
	 */
	// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod Start
	private void autoPrint(final ProductLabelPrintDto printDto, List<TStoreRecordB> tStoreRecordBList) throws Exception {
		// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod End

		// Entity変換
		TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper();
		TStoreRecordH tStoreRecordH = mapper.mappingToEntity(printDto.data.storeHead);

		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (tStoreRecordH.getClientId() != null && tStoreRecordH.getCenterId() != null) {
			mClientCenter.setClientId(tStoreRecordH.getClientId());
			mClientCenter.setCenterId(tStoreRecordH.getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		// 帳票レイアウトマスタで自動印刷対象の判定
		// 同一帳票内のレイアウトの中から、自動印刷対象のデータのIDがセットされます。
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		//PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(REPORT_CD), "1");
		PReportLayout pReportLayout = reportLogic.getPReportLayout(reportLogic.getReportId(PRODUCT_REPORT_CD), "1");
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		if (pReportLayout != null) {
			// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod Start
			// 実績入力後商品ラベル出力の判定 2:HT/SDで実績入力後のみ出力,3：出力する
			if (mParam.isResultAfterProductLabel$2() || mParam.isResultAfterProductLabel$3()) {
				// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Mod End

				// 該当データ無し
				if (tStoreRecordBList == null) {
					return;
				}

				// パラメータマスタ情報はマスタDtoのみの設定
				MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
				MParamDtoMapper mParamDtoMapper = new MParamDtoMapper();
				MParamDto mParamDto = mParamDtoMapper.mappingToDto(mParam);

				// 帳票出力データ取得処理
				List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();
				for (TStoreRecordB tBody : tStoreRecordBList) {

					ProductLabelDto redto = new ProductLabelDto();

					// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start

					// 商品ラベル情報取得
					MProductDto mProductDto = mProductDtoMapper.mappingToDto(tBody.chaseTReceivePlanB().chaseMProduct());
					redto = productLabelLogic.getProductLabelDto(mProductDto, mParamDto);
					redto.cultureId = getCultureId();

					// 商品ラベル発行時、枚数の計算
					// 出力枚数取得
					long outCnt = productLabelLogic.getOutNum(tBody.chaseTReceivePlanB().getProductId(), tBody.getStoreNum(), mParamDto);

					for (int i = 1; i <= outCnt; i++) {
						retList.add(redto);
					}

					// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
				}

				// ※※ 自動発行の場合、発行枚数の上限チェックはしない

				// 帳票発行処理
				JSON json = new JSON();
				json.setSuppressNull(true);

				// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
				//AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(REPORT_CD);
				AutoPrintParamDto autoPrintParamDto = autoPrintLogic.getDefaultAutoPrintParamDto(PRODUCT_REPORT_CD);
				// [#1755]入庫ラベル最新化 2017.07.24 sampei Start

				// 同一帳票内のレイアウトの中から、自動印刷対象のデータのIDをセット
				autoPrintParamDto.printBasicData.reportLayoutId = pReportLayout.getReportLayoutId();
				//印刷内容
				autoPrintParamDto.printBasicData.outputData = json.format(retList);

				AutoPrintAddQueueResult result = autoPrintLogic.print(autoPrintParamDto);

				// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana Start
				if (!result.isSuccess()) {
					// 商品ラベル発行失敗

					// 自動発行エラー(エラーはクリアして警告を登録)
					getErrorManager().clear();
					this.getWarnManager().add(warnRetSts(StatusCode.PRODUCT_LABEL_PRINT_FAILED), WmsMessageConst.PRODUCT_LABEL_AUTO_PRINT_FAILED_WARN);
					return;
				}
				// [#1769] 商品ラベル発行失敗のエラーメッセージ変更 2017.05.11 kawana End
			}
		}

		return;
	}

	// [#120] 入荷検品 2017.02.07 honma Add End

	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要になったメソッドautoPrintStoreLabelを削除) 2018.04.27 kawana Delete

}
