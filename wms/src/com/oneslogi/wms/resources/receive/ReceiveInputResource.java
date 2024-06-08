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

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
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
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic.ResultReceive;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic.StockUpdateStatus;
import com.oneslogi.wms.dto.receive.ProductLabelPrintDto;
import com.oneslogi.wms.dto.receive.ReceiveInputDto;
import com.oneslogi.wms.dto.receive.StoreLabelPrintDto;
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
import com.oneslogi.wms.util.WmsCommonUtil;

import net.arnx.jsonic.JSON;

/**
 * 入荷実績入力(予定あり)画面のリソースクラス。
 */
@Path("/receive/receiveInput")
public class ReceiveInputResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
	// private static final String REPORT_CD = "ProductLabel";
	private static final String PRODUCT_REPORT_CD = "ProductLabel";
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
	private static final String STORE_REPORT_CD = "StoreLabel";

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
		// [ON推-品向-452] 押下時に「実績が無いデータは取消できません」のメッセージを表示する。 2014.12.19 KI Start
		/**
		 * 入荷実績キャンセル異常
		 */
		protected static final int STORE_RESULT_CAN_NOT_CANCEL_NO_INPUT_ERROR = 15;
		// [ON推-品向-452] 押下時に「実績が無いデータは取消できません」のメッセージを表示する。 2014.12.19 KI End
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		/**
		 * 入荷実績更新異常
		 */
		protected static final int RECEIVE_INPUT_UPDATE_FAILED = 16;
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana Start
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		/**
		 * 入庫ラベル発行異常
		 */
		protected static final int STORE_LABEL_PRINT_FAILED = 17;
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana End
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
		/**
		 * 入庫数小数桁数異常
		 */
		protected static final int STORE_NUM_DECIMAL_CHECK_FAILED = 18;
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveInputSelectLogic receiveInputSelectLogic;
	@Inject
	private ReceiveStatusCheckLogic receiveStatusCheckLogic;
	@Inject
	private ReceiveNumCheckLogic receiveNumCheckLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private ReceiveInputDeleteLogic receiveInputDeleteLogic;
	@Inject
	private ReceiveInputInsertLogic inputInsertLogic;
	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
	@Inject
	private ReceiveInputUpdateLogic inputUpdateLogic;
	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
	@Inject
	private ReceiveStatusUpdateLogic statusUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private StockTypeLogic stockTypeLogic;
	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
	@Inject
	private ReceiveStatusUpdateLogic receiveStatusUpdateLogic;
	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	// [#4194][Ver3.0] 入庫ラベル発行処理を共通化(不要変数 tStoreRecordHBhv, numberingCenterLogic を削除) 2018.04.27 honma/kawana Delete
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
	 * @return ReceiveInputDto 入荷実績入力(予定あり)画面用DTO
	 */
	@GET
	@Path("/initSearch")
	public ReceiveInputDto initSearch(@QueryParam("receivePlanHId") Long receivePlanHId) {

		// =======================================================
		// =              入荷実績入力データの取得                    =
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
		// =              入荷状態チェック                                                                =
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

		// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start
		// 入荷状態チェック.ＨＴ検品中メソッドを呼出し
		if (receiveStatusCheckLogic.htReceive(tReceivePlanHList, tReceivePlanBList, tStoreRecordBList)) {
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.UNDER_H_T_INSPECT_CONFIRMATION);
		}
		// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End

		// =======================================================
		// =              入荷実績登録画面用DTOデータセット                              =
		// =======================================================

		// JSON通信のためにSimpleDTO変換
		TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordBDto> selectDto = mapper.mappingToDtoList(selectEntity);

		// ===== 入荷実績登録画面用DTO ヘッダの作成 =====
		ReceiveInputDto receiveInputDto = new ReceiveInputDto();
		receiveInputDto.data.storeHead = ReceiveInputDto.chaseTStoreRecordHDto(selectDto.get(0).getTStoreRecordH());

		for (TStoreRecordBDto tStoreRecordBDto : selectDto) {
			if (tStoreRecordBDto.getTStoreRecordH().getStoreRecordHId() != null) {
				receiveInputDto.data.storeHead = ReceiveInputDto.chaseTStoreRecordHDto(tStoreRecordBDto.getTStoreRecordH());
				break;
			}
		}

		// 入荷予定ヘッダ取得
		receiveInputDto.data.storeHead.setTReceivePlanH(selectDto.get(0).getTReceivePlanB().getTReceivePlanH());

		// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start

		final long clientId = CU.coalesce(selectDto.get(0).getTStoreRecordH().getClientId(), selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getClientId());
		final long centerId = CU.coalesce(selectDto.get(0).getTStoreRecordH().getCenterId(), selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getCenterId());

		MParam mParam = paramLogic.getMParam(clientId, centerId);

		// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End

		receiveInputDto.data.storeHead.setStoreNoFlg(mParam.getStoreNoFlg());
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
		// 発行帳票を指定
		// receiveInputDto.data.reportData.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End

		// センタCDの取得
		MCenter centerCondition = new MCenter();
		if (selectDto.get(0).getTStoreRecordH().getCenterId() != null) {
			centerCondition.setCenterId(selectDto.get(0).getTStoreRecordH().getCenterId());
		} else {
			centerCondition.setCenterId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getCenterId());
		}
		String centerCd = centerLogic.getPkEntityWithDeletedCheck(centerCondition).getCenterCd();
		receiveInputDto.data.storeHead.getMCenter().setCenterCd(centerCd);

		// 荷主CDを取得
		MClient clientCondition = new MClient();
		if (selectDto.get(0).getTStoreRecordH().getClientId() != null) {
			clientCondition.setClientId(selectDto.get(0).getTStoreRecordH().getClientId());
		} else {
			clientCondition.setClientId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getClientId());
		}
		String clientCd = clientLogic.getPkEntityWithDeletedCheck(clientCondition).getClientCd();
		receiveInputDto.data.storeHead.getMClient().setClientCd(clientCd);

		// 仕入先CDを取得
		MCustomer customerCondition = new MCustomer();
		if (selectDto.get(0).getTStoreRecordH().getSupplierId() != null) {
			customerCondition.setCustomerId(selectDto.get(0).getTStoreRecordH().getSupplierId());
		} else {
			customerCondition.setCustomerId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getPlanSupplierId());
		}
		String supplierCd = customerLogic.getPkEntityWithDeletedCheck(customerCondition).getCustomerCd();
		receiveInputDto.data.storeHead.getTReceivePlanH().setPlanSupplierCd(supplierCd);

		// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.03.15 kawana Start
		// 入荷日
		String storeDt = getStoreDt(selectEntity);
		if (!CU.isNullOrEmpty(storeDt)) {
			// 入庫済
			receiveInputDto.data.storeHead.getTReceivePlanH().setReceivePlanDt(storeDt);
			// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.03.15 kawana End
		} else {
			// 未入庫 (システム管理日付を入庫日とする)

			// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start
			receiveInputDto.data.storeHead.getTReceivePlanH().setReceivePlanDt(mParam.chaseMClientCenter().getSystemDt());
			// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End
		}

		//処理区分CDを取得
		MProcessType processTypeCondition = new MProcessType();
		if (selectDto.get(0).getTStoreRecordH().getProcessTypeId() != null) {
			processTypeCondition.setProcessTypeId(selectDto.get(0).getTStoreRecordH().getProcessTypeId());
		} else {
			processTypeCondition.setProcessTypeId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getProcessTypeId());
		}
		String processTypeCd = processTypeLogic.getPkEntityWithDeletedCheck(processTypeCondition).getProcessTypeCd();
		receiveInputDto.data.storeHead.getMProcessType().setProcessTypeCd(processTypeCd);

		// 預託CDを取得
		MCustomer depositCdCondition = new MCustomer();
		if (selectDto.get(0).getTStoreRecordH().getDepositId() != null) {
			depositCdCondition.setCustomerId(selectDto.get(0).getTStoreRecordH().getDepositId());
		} else {
			depositCdCondition.setCustomerId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getPlanDepositId());
		}
		String depositCd = customerLogic.getPkEntityWithDeletedCheck(depositCdCondition).getCustomerCd();
		receiveInputDto.data.storeHead.getTReceivePlanH().setPlanDepositCd(depositCd);

		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi Start
		//処理区分CDを取得
		MStockType stockTypeCondition = new MStockType();
		if (selectDto.get(0).getTStoreRecordH().getStockTypeId() != null) {
			stockTypeCondition.setStockTypeId(selectDto.get(0).getTStoreRecordH().getStockTypeId());
		} else {
			stockTypeCondition.setStockTypeId(selectDto.get(0).getTReceivePlanB().getTReceivePlanH().getStockTypeId());
		}
		String stockTypeCd = stockTypeLogic.getPkEntityWithDeletedCheck(stockTypeCondition).getStockTypeCd();
		receiveInputDto.data.storeHead.getMStockType().setStockTypeCd(stockTypeCd);
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi End

		// ===== 入荷実績登録画面用DTO ボディの作成 =====
		for (TStoreRecordBDto selectBody : selectDto) {

			// [ON推-品向-535] 商品マスタから削除された場合の考慮追加 2015.01.14 kawana Start
			if (selectBody.getTReceivePlanB().getMProduct() == null) {
				// 商品が商品マスタから削除されている

				getErrorManager().add(errRetSts(StatusCode.PRODUCT_NOT_FOUND), WmsMessageConst.PRODUCT_CODE_FOUND_DELETED_WITH_CD_ERROR, selectBody.getTReceivePlanB().getProductCd());
				return null;
			}
			// [ON推-品向-535] 商品マスタから削除された場合の考慮追加 2015.01.14 kawana End

			// [#3552][Ver3.0] 入荷実績入力(予定あり) - 入庫実績有データ入庫数表示不正 既存の入庫数計算処理を削除(UoM対応) 2018.02.07 honma Delete
			receiveInputDto.data.storeBody.add(ReceiveInputDto.chaseTStoreRecordBDto(selectBody));
		}
		return receiveInputDto;
	}

	/**
	 * <h2>入力チェック（登録）を行う</h2>
	 * <pre>
	 * 【HT検品中チェック】してから、【登録データの組み立て】を行う。
	 * あと下記チェックする
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
	 * @param receiveInputDto 入荷実績入力(予定あり)画面用DTO：入荷実績入力画面ヘッダDTO・入荷実績入力画面明細DTOリスト
	 * @return ReceiveInputDto 入荷実績入力(予定あり)画面用処理結果DTO
	 */
	@POST
	@Path("/inputCheckRegister")
	public ReceiveInputDto inputCheckRegister(ReceiveInputDto receiveInputDto) {

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.storeHead);

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputDto.data.storeBody);

		// 入荷予定ボディリスト
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB body : storeBodyList) {
			planBodyList.add(body.getTReceivePlanB());
		}

		// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana Start

		// =======================================================
		// =              HT検品中チェック
		// =======================================================

		// 入力前データ(未選択のデータを含む)でHT検品中チェックを行う
		List<TStoreRecordB> originalStoreBodyList = storeBodyMapper.mappingToEntityList(receiveInputDto.data.originalStoreBody);
		List<TReceivePlanB> originalPlanBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB body : originalStoreBodyList) {
			originalPlanBodyList.add(body.getTReceivePlanB());
		}
		// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana End

		// 入荷状態チェック.ＨＴ検品中メソッドを呼出し
		List<TReceivePlanH> tReceivePlanHList = new ArrayList<TReceivePlanH>();
		tReceivePlanHList.add(storeHead.getTReceivePlanH());

		// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana Start
		// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start
		if (receiveStatusCheckLogic.htReceive(tReceivePlanHList, originalPlanBodyList, originalStoreBodyList)) {
			// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana End
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.UNDER_H_T_INSPECT_CONFIRMATION);
		}
		// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End

		// =======================================================
		// =              入力チェック
		// =======================================================

		// 登録データを組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(storeHead, storeBodyList, planBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		} else if (checkStatus == ResultSetupRegisterData.RECEIVE_QTY_WARN) {
			// 入荷数超過

			// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana Start

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
			if (storeHead.getTReceivePlanH().isCenterTransitFlg$1()) {

				// センタ間移動の場合はエラー
				getErrorManager().add(errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED), WmsMessageConst.SHIP_RESULT_QTY_CANNOT_INPUT_MORE_THAN_PLAN_ERROR);
				return null;
			} else {

				// 通常は確認メッセージ表示
				getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_QTY_REGISTER_MORE_THAN_PLAN_CONFIRMATION);
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana End

			// =======================================================
			// =              期限日(限界日)チェック                                                       =
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
					receiveInputDto.data.storeBody.get(i).setLimitDtNgFlg(body.getLimitDtNgFlg());
					receiveInputDto.data.storeBody.get(i).setMaxLimitDt(body.getMaxLimitDt());
				}

				// 処理中止
				return receiveInputDto;
			}

			return null;
			// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana End
		} else if (checkStatus == ResultSetupRegisterData.RECEIVE_QTY_ERROR) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// =======================================================
		// =              期限日(限界日)チェック                                                       =
		// =======================================================

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana Start
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
				receiveInputDto.data.storeBody.get(i).setLimitDtNgFlg(body.getLimitDtNgFlg());
				receiveInputDto.data.storeBody.get(i).setMaxLimitDt(body.getMaxLimitDt());
			}

			// 処理中止
			return receiveInputDto;
		}

		// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana Start

		String originalStoreDt = getStoreDt(originalStoreBodyList);
		String storeDt = storeHead.getTReceivePlanH().getReceivePlanDt();

		if (!CU.isNullOrEmpty(originalStoreDt)) {
			// 入荷日の登録あり

			if (!originalStoreDt.equals(storeDt)) {
				// 入荷日が上書きされる

				getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_DT_UPDATE_CONFIRMATION);
				return null;
			}
		}

		// [#4599] 入荷日を入荷予定日からシステム管理日付に変更 2018.05.15 kawana End

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana End
		return null;
	}

	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add Start

	/**
	 * <h2>期限日(限界日)チェック。</h2>
	 * <pre>
	 * 画面明細行に、期限日を入力する際に、期限日(限界日)チェックを行う。
	 *
	 * </pre>
	 * @param receiveInputDto 入荷実績入力(予定あり)画面用DTO
	 * @return ReceiveInputDto 入荷実績入力(予定あり)画面用DTO
	 */
	@POST
	@Path("/inputCheckLimitDt")
	public ReceiveInputDto inputCheckLimitDt(ReceiveInputDto receiveInputDto) {
		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.storeHead);
		// 入荷予定ヘッダ
		TReceivePlanH planHead = storeHead.getTReceivePlanH();

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputDto.data.storeBody);

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

		receiveInputDto.data.storeBody = storeBodyMapper.mappingToDtoList(storeBodyList);

		return receiveInputDto;
	}

	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add End
	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

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
	 * @param receiveInputDto 入荷実績入力(予定あり)画面用DTO：
	 *                        ・入荷実績入力画面ヘッダDTO
	 *                        ・入荷実績入力画面明細DTOリスト
	 *                        ・入荷実績入力画面ヘッダDTO(変更前)
	 *                        ・入荷実績入力画面明細DTOリスト(変更前)
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStartEnd("ReceiveInput")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 Start
	//public StatusDto register(ReceiveInputDto receiveInputDto) {
	public ReceiveInputDto register(ReceiveInputDto receiveInputDto) {
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 End
		// =======================================================
		// =              登録データ組み立て                                                                =
		// =======================================================

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.storeHead);
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		TStoreRecordH originalStoreHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.originalStoreHead);
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputDto.data.storeBody);
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		List<TStoreRecordB> originalStoreBodyList = storeBodyMapper.mappingToEntityList(receiveInputDto.data.originalStoreBody);
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

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

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

		// [1.1.4-CT-004] 入庫日が変わったときに他在庫にマージされてしまう問題を修正 2016.05.11 kawana Start
		// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.03.15 kawana Start
		String originalStoreDt = getStoreDt(originalStoreBodyList);
		// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.03.15 kawana End
		String storeDt = storeHead.getTReceivePlanH().getReceivePlanDt();

		// ===== 固定値の設定 =====
		for (TStoreRecordB body : storeBodyList) {
			body.setInputType_$00();
			body.setStoreDt(storeDt);
		}

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
		List<ResultReceive> resultList = null;
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End

		// 入荷実績を全て変更するかを判定
		boolean doChangeAll = doChangeAll(originalStoreHead, storeHead, originalStoreDt, storeDt);

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// 総数量
		BigDecimal storeNumSumUsedByLog = WCC.ZERO;
		// 画面に入庫数の合計
		for (TStoreRecordB body : storeBodyList) {
			storeNumSumUsedByLog = WCC.add(storeNumSumUsedByLog, body.getStoreNum());
		}
		setWorkLogQty(storeNumSumUsedByLog);
		//トレース項目
		setWorkLogTraceItem(storeHead.getTReceivePlanH().getReceiveSlipNo());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [1.1.4-CT-004] 入庫日が変わったときに他在庫にマージされてしまう問題を修正 2016.05.11 kawana End
		if (doChangeAll) {
			// 削除して再登録

			// =======================================================
			// =              入荷実績削除
			// =======================================================

			//入庫実績ボディID存在の場合
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
			// =              入荷実績登録
			// =======================================================

			// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
			// 入荷実績登録.入荷実績登録メソッドを呼出し
			resultList = inputInsertLogic.insert(storeHead, storeBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
			// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
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

			// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
			if (0 < reinsertBodyList.size() || 0 < insertBodyList.size()) {
				resultList = new ArrayList<ResultReceive>();
			}
			// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End

			// 再登録
			if (0 < reinsertBodyList.size()) {

				//入荷実績削除.入荷実績ボディ削除メソッドを呼出し
				receiveInputDeleteLogic.deleteBody(storeHead, reinsertBodyList, errRetSts(StatusCode.RECEIVE_INPUT_DELETE_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}

				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
				// 入荷実績登録.入荷実績ボディ登録メソッドを呼出し
				List<ResultReceive> result = inputInsertLogic.insertBody(storeHead, reinsertBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}
				resultList.addAll(result);
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
			}

			// 新規登録
			if (0 < insertBodyList.size()) {
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
				// 入荷実績登録.入荷実績ボディ登録メソッドを呼出し
				List<ResultReceive> result = inputInsertLogic.insertBody(storeHead, insertBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
				if (0 < getErrorManager().size()) {
					// 処理中止
					return null;
				}
				resultList.addAll(result);
				// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
			}

			// ===== ヘッダの更新 =====

			// 入荷実績ヘッダ更新
			inputUpdateLogic.updateHeader(storeHead, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}

			// [#7457][v3.1][OSS] 明細のみを更新した場合の納品ステータス「未完」への更新漏れを修正 2020.04.22 kawana Start

			TReceivePlanH planHead = tReceivePlanHBhv.selectByPKValue(storeHead.getTReceivePlanH().getReceivePlanHId());
			List<TReceivePlanH> planHeadList = new ArrayList<TReceivePlanH>();
			planHeadList.add(planHead);

			// 完納判定
			if (receiveStatusUpdateLogic.checkReceiveComplete(storeHead.getReceivePlanHId())) {

				// 入荷予定ステータス更新.完納メソッドを呼出し
				receiveStatusUpdateLogic.receiveComplete(planHeadList, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
			} else {

				// 入荷予定ステータス更新.未完メソッドを呼出し
				receiveStatusUpdateLogic.receiveNotComplete(planHeadList, errRetSts(StatusCode.RECEIVE_INPUT_UPDATE_FAILED));
			}

			// [#7457][v3.1][OSS] 明細のみを更新した場合の納品ステータス「未完」への更新漏れを修正 2020.04.22 kawana End
		}

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

		// =======================================================
		// =              DBに入荷予定ステータスを更新           =
		// =======================================================

		// 入荷予定ステータス更新.入荷済メソッドを呼出し
		statusUpdateLogic.received(planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_STATUS_UPDATE_FAILED));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start

		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 Start
		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (storeHead.getClientId() != null && storeHead.getCenterId() != null) {
			mClientCenter.setClientId(storeHead.getClientId());
			mClientCenter.setCenterId(storeHead.getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		receiveInputDto.data.printFlg = 0;
		if (mParam.isResultAfterProductLabel$1() || mParam.isResultAfterProductLabel$3()) {
			BigDecimal storeNumSum = WCC.ZERO;
			// 画面に入庫数の合計
			for (TStoreRecordB body : storeBodyList) {
				storeNumSum = WCC.add(storeNumSum, body.getStoreNum());
			}
			if (WCC.isPositive(storeNumSum)) {
				receiveInputDto.data.printFlg = 1;
			}
		}

		receiveInputDto.data.storeHead.setStoreRecordHId(storeHead.getStoreRecordHId());
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 End

		// ===== 完了メッセージの設定 =====

		if (resultList != null) {
			for (ResultReceive result : resultList) {
				if (result.status == StockUpdateStatus.NEW_CAUSE_USED) {
					getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.STOCK_REGISTER_NEW_CAUSE_STORE_LABEL_USED_INFORMATION);
					return receiveInputDto;
				}
			}
		}

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return receiveInputDto;

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
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

		//		// 顧客入荷指示No.存在チェック
		//		String strClientreceiveNo = header.getClientReceiveNo();
		//		if (!CU.isNullOrEmpty(strClientreceiveNo)) {
		//			inputInsertLogic.isClientReceiveNoCheck(header, errSts);
		//			if (getErrorManager().size() > 0) {
		//				return ResultSetupRegisterData.ERROR;
		//			}
		//		}

		// =======================================================
		// =              入庫実績ボディデータ組み立て                                            =
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
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				product = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(product);
				if (product == null) {
					getErrorManager().add(errRetSts(errSts, StatusCode.PRODUCT_NOT_FOUND, rowIndex), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				} else {
					String decimalExistFlg = product.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
					if (CU.isNullOrEmpty(decimalExistFlg)) {
						getErrorManager().add(errRetSts(errSts, StatusCode.PRODUCT_NOT_FOUND, rowIndex), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
					} else if (decimalExistFlg.equals(CDef.DecimalExistFlg.$0.code())) {
						//小数有無フラグが無の場合
						if (!WmsCommonUtil.checkPatternInput("^\\d+$", WCC.stripTrailingZeros(storeBody.getStoreNum()))) {
							// 小数0桁以内
							getErrorManager().add(errRetSts(errSts, StatusCode.STORE_NUM_DECIMAL_CHECK_FAILED, rowIndex), WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
						}
					} else {}
				}
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
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

		// =======================================================
		// =              入庫実績ヘッダと入荷予定ヘッダデータ組み立て          =
		// =======================================================

		// 処理区分IDの取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setProcessTypeCd(header.getMProcessType().getProcessTypeCd());
		MProcessType mProcessType = processTypeLogic.getUkEntityWithDeletedCheck(processTypeCondition);

		// 仕入先IDの取得
		MCustomer supplierCondition = new MCustomer();
		supplierCondition.setClientId(clientId);
		supplierCondition.setCustomerCd(header.getTReceivePlanH().getPlanSupplierCd());

		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
		// 仕入先IDが取得できない場合、エラーメッセージをエラー管理クラスに登録
		MCustomer supplier = customerLogic.getVendorCustomerByClientCd(supplierCondition, errRetSts(errSts, StatusCode.CUSTOMER_NOT_FOUND));
		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
		if (getErrorManager().size() > 0) {
			// 処理中止
			return ResultSetupRegisterData.ERROR;
		}

		// 預託IDの取得
		MCustomer depositCondition = new MCustomer();
		depositCondition.setClientId(clientId);
		depositCondition.setCustomerCd(header.getTReceivePlanH().getPlanDepositCd());
		MCustomer deposit = customerLogic.getUkEntityWithDeletedCheck(depositCondition);

		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi Start
		// 在庫区分IDの取得
		MStockType mStockTypeCondition = new MStockType();
		mStockTypeCondition.setStockTypeCd(header.getMStockType().getStockTypeCd());
		MStockType mStockType = stockTypeLogic.getUkEntity(mStockTypeCondition);
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi End

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

		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi Start
		// 在庫区分IDの設定
		header.setStockTypeId(mStockType.getStockTypeId());
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定あり)画面に在庫区分を追加する 2015.08.10 hayashi End

		// =======================================================
		// =              入荷数チェック                                                                            =
		// =======================================================

		// 入荷数チェック.入荷数チェックメソッドを呼出し
		//		boolean numCheck = receiveNumCheckLogic.check(storeBodyList);
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

	// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.03.15 kawana Start

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

	// [#2896] 入庫日が入庫実績ボディ1件目固定になっている問題を修正 2018.03.15 kawana End

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

	/**
	 * <h2>入荷実績を全変更するかの判定。</h2>
	 * <pre>
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

		// [1.1.4-CT-004] 入庫日が変わったときに他在庫にマージされてしまう問題を修正 2016.05.11 kawana Start
		// 入庫日
		if (originalStoreDt != null || storeDt != null) {

			if (!CU.nullToStr(originalStoreDt).equals(CU.nullToStr(storeDt))) {
				return true;
			}
		}
		// [1.1.4-CT-004] 入庫日が変わったときに他在庫にマージされてしまう問題を修正 2016.05.11 kawana End

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

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

	// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start

	/**
	 * <h2>入荷取消チェックを行う。</h2>
	 * <pre>
	 * 受け取ったデータが【入荷実績入力データを取得】し、下記のチェックを行う。
	 * ・1件も実績登録なしチェック
	 * ・【HT検品中チェック】
	 * ・排他チェック(バージョンNo)
	 * 返す【ステータスCDとステータス内容】を設定する。
	 *
	 * 【入荷実績入力データを取得】
	 * ・{@link ReceiveInputSelectLogic#select(TReceivePlanH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績入力データ取得メソッド}を呼び出す。
	 *
	 * 【HT検品中チェック】
	 * ・{@link ReceiveStatusCheckLogic#htReceive(List, List, List) HT検品中チェックメソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *  1:ユーザによる確認(HT検品中確認、排他チェック確認、通常処理前確認)
	 *  15:入荷実績キャンセル異常
	 *
	 * </pre>
	 * @param receiveInputDto 入荷実績入力(予定あり)画面用DTO：入荷実績入力画面ヘッダDTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckCancel")
	public StatusDto inputCheckCancel(ReceiveInputDto receiveInputDto) {

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.storeHead);

		// 入荷実績入力データ取得の検索データ編集
		TReceivePlanH planHead = new TReceivePlanH();
		planHead.setReceivePlanHId(storeHead.getReceivePlanHId());

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectBodyList = receiveInputSelectLogic.select(planHead, null);
		if (getErrorManager().size() > 0) {
			return null;
		}

		// DB登録されている入庫実績のみのリストを作成
		List<TReceivePlanH> planHList = new ArrayList<TReceivePlanH>();
		List<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> storeBList = new ArrayList<TStoreRecordB>();
		for (TStoreRecordB body : selectBodyList) {
			if (body.getStoreRecordBId() != null) {
				planHList.add(body.getTReceivePlanB().getTReceivePlanH());
				planBList.add(body.getTReceivePlanB());
				storeBList.add(body);
			}
		}

		// 1件も実績登録がない場合はエラー
		if (storeBList.size() == 0) {
			getErrorManager().add(new ErrorStatus(StatusCode.STORE_RESULT_CAN_NOT_CANCEL_NO_INPUT_ERROR), WmsMessageConst.STORE_RESULT_CANNOT_CANCEL_NO_INPUT_ERROR);
			return null;
		}

		// HT検品中チェック
		if (receiveStatusCheckLogic.htReceive(planHList, planBList, storeBList)) {

			// HT検品中用の確認メッセージを登録
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.UNDER_H_T_INSPECT_RECEIVE_CANCEL_CONFIRMATION);
			return null;
		}

		// 排他チェック(バージョンNo)
		if (!storeHead.getTReceivePlanH().getVersionNo().equals(selectBodyList.get(0).getTReceivePlanB().getTReceivePlanH().getVersionNo())) {

			// 排他用の確認メッセージを登録
			getWarnManager().add(warnRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_RESULT_CANCEL_DISREGARD_EXCLUSIVE_CONTROL_CONFIRMATION);
			return null;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.RECEIVE_RESULT_CANCEL_CONFIRMATION);

		return null;
	}

	// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End

	/**
	 * <h2>入荷取消処理を行う。</h2>
	 * <pre>
	 * 受け取ったデータをキーに【入荷実績データを取得】し、【入荷実績の削除】を行う。
	 * エラーがない場合は【入荷予定ステータス更新.入荷削除】する。
	 * 返す【ステータスCDとステータス内容】を設定する。
	 *
	 * 【入荷実績データを取得】
	 * ・{@link ReceiveInputSelectLogic#select(TReceivePlanH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績入力データ取得のメソッド}を呼び出す。
	 *
	 * 【入荷実績の削除】
	 * ・{@link ReceiveInputDeleteLogic#delete(TStoreRecordH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷実績削除のメソッド}を呼び出す。
	 *
	 * 【入荷予定ステータス更新.入荷削除】
	 * ・{@link ReceiveStatusUpdateLogic#receivedCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入荷削除メソッド}を呼び出す。
	 *
	 * 【ステータスCDとステータス内容】
	 *   0:正常終了
	 *   10：入荷予定ステータス更新異常
	 *   11:入荷実績削除異常
	 *   15:入荷実績キャンセル異常
	 * </pre>
	 * @param receiveInputDto 入荷実績入力(予定あり)画面用DTO：入荷実績入力画面ヘッダDTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/cancel")
	public StatusDto cancel(ReceiveInputDto receiveInputDto) {

		// =======================================================
		// =              入荷実績削除                                                                   =
		// =======================================================

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.storeHead);

		// 入庫実績ボディリスト
		//		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		//		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputDto.data.storeBody);

		// 入荷実績入力データ取得の検索データ編集
		TReceivePlanH planHead = new TReceivePlanH();
		planHead.setReceivePlanHId(storeHead.getReceivePlanHId());

		// 入荷実績入力データ取得.入荷実績入力データ取得メソッドを呼出し
		List<TStoreRecordB> selectEntity = receiveInputSelectLogic.select(planHead, null);

		List<TStoreRecordB> storeBodyList = new ArrayList<TStoreRecordB>();
		storeBodyList = selectEntity;

		// 入荷実績削除.入荷実績削除メソッドを呼出し
		List<TStoreRecordB> sBodyList = new ArrayList<TStoreRecordB>();

		for (TStoreRecordB sBody : storeBodyList) {
			if (sBody.getStoreRecordBId() != null) {
				sBodyList.add(sBody);
			}
		}

		if (sBodyList.size() > 0 && sBodyList.get(0).getStoreRecordBId() != null) {
			receiveInputDeleteLogic.delete(storeHead, errRetSts(StatusCode.RECEIVE_INPUT_DELETE_FAILED));
			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}

			// =======================================================
			// =              入荷予定ステータス更新                                                      =
			// =======================================================

			// 入荷予定ボディリスト
			List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
			for (TStoreRecordB body : sBodyList) {
				planBodyList.add(body.getTReceivePlanB());
			}

			// 入荷予定ステータス更新.入荷削除メソッドを呼出し
			statusUpdateLogic.receivedCancel(planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_STATUS_UPDATE_FAILED));
			// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(90:入荷削除)に入荷ステータスを変更するように追加 2014.12.11 許 Start
			reveicePlanDataSetDelFlg(planBodyList);
			// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(90:入荷削除)に入荷ステータスを変更するように追加 2014.12.11 許 End
			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}

			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
			// [ON推-品向-452] 押下時に「実績が無いデータは取消できません」のメッセージを表示する。 2014.12.19 KI Start
		} else {
			getErrorManager().add(new ErrorStatus(StatusCode.STORE_RESULT_CAN_NOT_CANCEL_NO_INPUT_ERROR), WmsMessageConst.STORE_RESULT_CANNOT_CANCEL_NO_INPUT_ERROR);
			return null;
		}
		// [ON推-品向-452] 押下時に「実績が無いデータは取消できません」のメッセージを表示する。 2014.12.19 KI End

		return null;
	}

	/**
	 * 予定なしで入荷したデータを入荷取消した場合、
	 * (90:入荷削除)に入荷ステータスを変更したので、入荷予定ヘッダと入荷予定ボディを削除
	 * @param planBodyList 入荷予定ボディリスト
	 */
	private void reveicePlanDataSetDelFlg(List<TReceivePlanB> planBodyList) {
		for (TReceivePlanB body : planBodyList) {
			// ===== 入荷予定ボディを検索条件 =====
			TReceivePlanBCB receivePlanBCb = tReceivePlanBBhv.newMyConditionBean();
			receivePlanBCb.query().setReceivePlanBId_Equal(body.getReceivePlanBId());
			// ===== 入荷予定ボディを検索実行 =====
			List<TReceivePlanB> receivePlanBList = tReceivePlanBBhv.selectList(receivePlanBCb);
			// ===== 入荷予定ボディが1件の場合 =====
			if (receivePlanBList.size() == 1) {
				// 入荷予定ボディの削除
				if ("90".equals(receivePlanBList.get(0).getReceiveStatus())) {
					receivePlanBList.get(0).setDelFlg_$1();
					tReceivePlanBBhv.update(receivePlanBList.get(0));
				}
			}
		}
		if (planBodyList.get(0).getReceivePlanHId() != null) {
			// ===== 入荷予定ヘッダを検索実行 =====
			TReceivePlanH receivePlanH = tReceivePlanHBhv.selectByPKValue(planBodyList.get(0).getReceivePlanHId());
			// ===== 入荷予定ヘッダが1件の場合 =====
			if (receivePlanH != null) {
				// 入荷予定ヘッダの削除
				if ("90".equals(receivePlanH.getReceiveStatus())) {
					receivePlanH.setDelFlg_$1();
					tReceivePlanHBhv.update(receivePlanH);
				}
			}
		}
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
	/**
	 * <h2>商品ラベル発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースに商品ラベル発行データを取得する
	 * </pre>
	 * @param printDto 商品ラベル発行画面用DTO
	 * @return productLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/printProductLabel")
	public ProductLabelPrintDto printProductLabel(final ProductLabelPrintDto printDto) throws Exception {

		// Entity変換
		TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper();
		TStoreRecordH tStoreRecordH = mapper.mappingToEntity(printDto.data.storeHead);

		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		// 発行帳票を指定
		//printDto.printBasicData.reportId = reportLogic.getReportId(PRODUCT_REPORT_CD);
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End

		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (tStoreRecordH.getClientId() != null && tStoreRecordH.getCenterId() != null) {
			mClientCenter.setClientId(tStoreRecordH.getClientId());
			mClientCenter.setCenterId(tStoreRecordH.getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		//帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		List<TStoreRecordB> tStoreRecordBList = receiveInputSelectLogic.selectReportInfo(tStoreRecordH, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (tStoreRecordBList == null) {
			return null;
		}

		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
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

			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
			// 出力枚数取得
			long outCnt = productLabelLogic.getOutNum(tBody.chaseTReceivePlanB().getProductId(), tBody.getStoreNum(), mParamDto);
			// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End

			for (int i = 1; i <= outCnt; i++) {
				retList.add(redto);
			}

			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
		}

		// ※※ 自動発行の場合、発行枚数の上限チェックはしない

		// 帳票発行処理
		JSON json = new JSON();

		json.setSuppressNull(true);

		printDto.printBasicData.outputData = json.format(retList);

		printLogic.print(printDto);

		//商品ラベル発行の取得
		ProductLabelPrintDto productLabelPrintDto = new ProductLabelPrintDto();
		productLabelPrintDto.output = printDto.output;

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return productLabelPrintDto;
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	/**
	 * <h2>入庫ラベル発行データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・データベースから入庫ラベル発行データを取得する
	 * </pre>
	 * @param StoreLabelPrintDto 入庫ラベル発行画面用DTO
	 * @return StoreLabelPrintDto 処理結果DTO
	 * @throws Exception
	 */
	@GET
	@Path("/printStoreLabel")
	public StoreLabelPrintDto printStoreLabel(final StoreLabelPrintDto storeLabelPrintDto) throws Exception {

		// Entity変換
		TStoreRecordHDtoMapper mapperTStoreRecordH = new TStoreRecordHDtoMapper();
		TStoreRecordH tStoreRecordH = mapperTStoreRecordH.mappingToEntity(storeLabelPrintDto.data.search.getTStoreRecordH());

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start

		storeLabelPrintLogic.printUnprintOnly(storeLabelPrintDto, tStoreRecordH, errRetSts(StatusCode.STORE_LABEL_PRINT_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return storeLabelPrintDto;

		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End
	}

	/**
	 * <h2>帳票ID検索処理。</h2>
	 * <pre>
	 * ・帳票IDを取得
	 * </pre>
	 * @param ReceiveInputDto 入荷実績入力(予定無し)画面用DTO
	 * @return ReceiveInputDto 処理結果DTO
	 */
	@GET
	@Path("/searchReportId")
	public ReceiveInputDto searchReportId(ReceiveInputDto receiveInputDto) throws Exception {
		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputDto.data.storeHead);

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(storeHead.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(storeHead.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		receiveInputDto.data.resultAfterProductTarget = mParam.getResultAfterProductTarget();

		if (mParam.isResultAfterProductTarget$1()) {
			receiveInputDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(STORE_REPORT_CD);
		}
		if (mParam.isResultAfterProductTarget$2()) {
			receiveInputDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(PRODUCT_REPORT_CD);
		}

		return receiveInputDto;
	}

	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
}
