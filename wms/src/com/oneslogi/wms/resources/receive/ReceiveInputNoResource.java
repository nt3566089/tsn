package com.oneslogi.wms.resources.receive;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
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
import com.oneslogi.wms.dto.receive.ReceiveInputNoDto;
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
import com.oneslogi.wms.logic.receive.ReceiveInputInsertLogic;
import com.oneslogi.wms.logic.receive.ReceiveInputSelectLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanErrorCheckLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanInsertLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusUpdateLogic;
import com.oneslogi.wms.logic.receive.StoreLabelPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 入荷実績入力(予定なし)画面のリソースクラス。
 */
@Path("/receive/receiveInputNo")
public class ReceiveInputNoResource extends AbstractWmsResource {

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
		 * 重複レコードチェック異常
		 */
		protected static final int DUPLICATE_RECORD_CHECK_FAILED = 2;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 3;
		/**
		* ロケーションマスタ存在異常
		*/
		protected static final int LOCATION_NOT_FOUND = 4;
		/**
		 * 仕入先マスタ存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND = 6;
		/**
		 * 期限日(限界日)チェック異常
		 */
		protected static final int LIMIT_DT_CHECK_FAILED = 7;
		/**
		 * 入荷予定登録異常
		 */
		protected static final int RECEIVE_PLAN_INSERT_FAILED = 8;
		/**
		 * 入荷実績登録異常
		 */
		protected static final int RECEIVE_RECORD_INSERT_FAILED = 9;
		/**
		 * 入荷予定ステータス更新異常
		 */
		protected static final int RECEIVE_PLAN_STATUS_UPDATE_FAILED = 10;
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana Start
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		/**
		 * 入庫ラベル発行異常
		 */
		protected static final int STORE_LABEL_PRINT_FAILED = 11;
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End
		// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 honma/kawana End
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
		/**
		 * 入庫数小数桁数異常
		 */
		protected static final int STORE_NUM_DECIMAL_CHECK_FAILED = 13;
		// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceivePlanInsertLogic planInsertLogic;
	@Inject
	private ReceiveInputInsertLogic inputInsertLogic;
	@Inject
	private ReceiveStatusUpdateLogic statusUpdateLogic;
	// エラーチェック処理追加 2016.4.5 NayZaw Start
	@Inject
	private ReceivePlanErrorCheckLogic checkLogic;
	// エラーチェック処理追加 2016.4.5 NayZaw End
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
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
	private StockTypeLogic stockTypeLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private ReceiveInputSelectLogic receiveInputSelectLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
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
	 * 入力チェック結果（登録）
	 */
	protected enum ResultSetupRegisterData {
		ALL_OK,
		ERROR
	}

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・入荷実績明細の空行を新規作成
	 * ・追加用の空行を作成
	 * </pre>
	 * @return ReceiveInputNoDto 入荷実績入力(予定なし)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReceiveInputNoDto initNew() {
		// 画面用DTO作成
		ReceiveInputNoDto receiveInputNoDto = new ReceiveInputNoDto();
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
		// 発行帳票を指定
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		//receiveInputNoDto.data.reportData.printBasicData.reportId = reportLogic.getReportId(REPORT_CD_PRODUCT);
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End
		return receiveInputNoDto;
	}

	/**
	 * <h2>入力チェック（新規）。</h2>
	 * <pre>
	 * 新規登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param receiveInputNoDto 入荷実績入力(予定なし)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckRegister")
	public ReceiveInputNoDto inputCheckRegister(ReceiveInputNoDto receiveInputNoDto) {

		// ===== 入力チェック（登録）のチェックデータ編集 =====

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputNoDto.data.storeHead);

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputNoDto.data.storeBody);

		// 入荷予定ヘッダ
		TReceivePlanH planHead = storeHead.getTReceivePlanH();

		// 入荷予定ボディリスト
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB body : storeBodyList) {
			planBodyList.add(body.getTReceivePlanB());
		}

		// 登録データを組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(storeHead, storeBodyList, planHead, planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		}

		// =======================================================
		// =              期限日(限界日)チェック                 =
		// =======================================================

		// 在庫更新チェッククラス.入荷限界日チェックメソッドを呼出し

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
		List<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> storeBList = new ArrayList<TStoreRecordB>();

		for (int i = 0; i < storeBodyList.size(); i++) {
			TStoreRecordB storeBody = storeBodyList.get(i);
			TReceivePlanB planBody = planBodyList.get(i);

			if (storeBody.getStoreNum() != null && WCC.isNotZero(storeBody.getStoreNum())) {
				// IDの仮設定
				long tmpId = i + 1;
				storeBody.setReceivePlanBId(tmpId);
				planBody.setReceivePlanBId(tmpId);

				storeBList.add(storeBody);
				planBList.add(planBody);
			}
		}

		stockUpdateCheckLogic.receiveLimitDateCheck(planHead, planBList, storeHead, storeBList, errRetSts(errRetSts(StatusCode.LIMIT_DT_CHECK_FAILED), StatusCode.CONFIRMATION));
		// 結果判定
		if (getWarnManager().size() > 0) {
			for (int i = 0; i < storeBodyList.size(); i++) {
				TStoreRecordB body = storeBodyList.get(i);
				receiveInputNoDto.data.storeBody.get(i).setLimitDtNgFlg(body.getLimitDtNgFlg());
				receiveInputNoDto.data.storeBody.get(i).setMaxLimitDt(body.getMaxLimitDt());
			}
			// 処理中止
			return receiveInputNoDto;
		}

		// 確認表示
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End

		return null;
	}

	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add Start
	/**
	 * <h2>期限日(限界日)チェック。</h2>
	 * <pre>
	 * 画面明細行に、商品CD又は期限日を入力する際に、期限日(限界日)チェックを行う。
	 *
	 * </pre>
	 * @param receiveInputNoDto 入荷実績入力(予定なし)画面用DTO
	 * @return ReceiveInputNoDto 入荷実績入力(予定なし)画面用DTO
	 */
	@POST
	@Path("/inputCheckLimitDt")
	public ReceiveInputNoDto inputCheckLimitDt(ReceiveInputNoDto receiveInputNoDto) {

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputNoDto.data.storeHead);
		// 入荷予定ヘッダ
		TReceivePlanH planHead = storeHead.getTReceivePlanH();

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputNoDto.data.storeBody);

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(storeHead.getMCenter().getCenterCd());
		MCenter center = centerLogic.getUkEntity(centerCondition);
		if (center == null) {
			return receiveInputNoDto;
		}
		final long centerId = center.getCenterId();
		storeHead.setCenterId(centerId);

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(storeHead.getMClient().getClientCd());
		MClient client = clientLogic.getUkEntity(clientCondition);
		if (client == null) {
			return receiveInputNoDto;
		}
		final long clientId = client.getClientId();
		storeHead.setClientId(clientId);

		List<TReceivePlanB> checkPlanBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> checkStoreBList = new ArrayList<TStoreRecordB>();
		List<TReceivePlanB> setPlanBList = new ArrayList<TReceivePlanB>();
		List<TStoreRecordB> setStoreBList = new ArrayList<TStoreRecordB>();
		for (TStoreRecordB storeBody : storeBodyList) {

			// 入荷予定ボディ
			TReceivePlanB planBody = storeBody.getTReceivePlanB();

			// 商品IDの取得
			MProduct productCondition = new MProduct();
			productCondition.setClientId(clientId);
			productCondition.setProductCd(planBody.getProductCd());
			MProduct product = productLogic.getUkEntity(productCondition);

			if (product != null) {
				// 入荷限界期限日チェックを行う
				planBody.setProductId(product.getProductId());

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
		}

		// ===== 入荷限界期限日チェック =====
		if (0 < setPlanBList.size()) {
			stockUpdateCheckLogic.setReceiveLimitDate(planHead, setPlanBList, storeHead, setStoreBList);
		}
		if (0 < checkPlanBList.size()) {
			stockUpdateCheckLogic.receiveLimitDateCheck(planHead, checkPlanBList, storeHead, checkStoreBList);
		}

		receiveInputNoDto.data.storeBody = storeBodyMapper.mappingToDtoList(storeBodyList);

		return receiveInputNoDto;
	}

	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add End
	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

	/**
	 * <h2>入荷実績登録。</h2>
	 * <pre>
	 * 登録データの組み立てを行う。
	 * エラーがない場合は、データベースに入荷予定データと入荷実績データを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param receiveInputNoDto 入荷実績入力(予定なし)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStartEnd("ReceiveInputNo")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
	//	public StatusDto register(ReceiveInputNoDto receiveInputNoDto) {
	public ReceiveInputNoDto register(ReceiveInputNoDto receiveInputNoDto) {
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End

		// ===== 入力チェック（登録）のチェックデータ編集 =====

		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputNoDto.data.storeHead);
		//		storeHead.setClientReceiveNo(receiveInputNoDto.data.storeHead.getTReceivePlanH().getPlanClientReceiveNo());

		// 入庫実績ボディリスト
		TStoreRecordBDtoMapper storeBodyMapper = new TStoreRecordBDtoMapper();
		List<TStoreRecordB> storeBodyList = storeBodyMapper.mappingToEntityList(receiveInputNoDto.data.storeBody);

		// 入荷予定ヘッダ
		TReceivePlanH planHead = storeHead.getTReceivePlanH();
		//		planHead.setPlanClientReceiveNo(null);

		// 入荷予定ボディリスト
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		for (TStoreRecordB body : storeBodyList) {
			planBodyList.add(body.getTReceivePlanB());
		}

		// 登録データ組み立て
		ResultSetupRegisterData checkStatus = setupRegisterData(storeHead, storeBodyList, planHead, planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// 結果判定
		if (checkStatus == ResultSetupRegisterData.ERROR) {
			// 処理中止
			return null;
		}

		// DBに入荷予定を登録
		planInsertLogic.insert(planHead, planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 入荷予定ヘッダID
		storeHead.setReceivePlanHId(planHead.getReceivePlanHId());

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
		// DBに入荷実績を登録
		List<ResultReceive> resultList = inputInsertLogic.insert(storeHead, storeBodyList, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// エラーチェック処理追加 2016.4.5 NayZaw Start
		boolean existErrorData = checkLogic.check(null, planHead.getReceivePlanHId(), errRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED));

		// DBに入荷予定ステータスを更新
		statusUpdateLogic.received(planBodyList, errRetSts(StatusCode.RECEIVE_PLAN_STATUS_UPDATE_FAILED));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

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
		//センタ
		setWorkLogCenterCd(storeHead.getMCenter().getCenterCd());
		//荷主
		setWorkLogClientCd(storeHead.getMClient().getClientCd());
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start

		// ===== 完了メッセージの設定 =====

		boolean setMessage = false;
		if (resultList != null) {
			for (ResultReceive result : resultList) {
				if (result.status == StockUpdateStatus.NEW_CAUSE_USED) {
					if (existErrorData) {
						getWarnManager().add(warnRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED), WmsMessageConst.DOCUMENT_NUMBER_CONFIRMATION_ERROR_INCLUDED_AND_NEW_CAUSE_STORE_LABEL_USED_INFORMATION,
								planHead.getReceiveSlipNo());
					} else {
						getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.DOCUMENT_NUMBER_CONFIRMATION_NEW_CAUSE_STORE_LABEL_USED_INFORMATION, planHead.getReceiveSlipNo());
					}
					setMessage = true;
					break;
				}
			}
		}

		if (!setMessage) {
			if (existErrorData) {
				getWarnManager().add(warnRetSts(StatusCode.RECEIVE_PLAN_INSERT_FAILED), WmsMessageConst.DOCUMENT_NUMBER_CONFIRMATION_ERROR_INCLUDED_INFORMATION, planHead.getReceiveSlipNo());
			} else {
				getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.DOCUMENT_NUMBER_CONFIRMATION_INFORMATION, planHead.getReceiveSlipNo());
			}
		}

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End

		// エラーチェック処理追加 2016.4.5 NayZaw End

		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
		//		return null;
		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		if (storeHead.getClientId() != null && storeHead.getCenterId() != null) {
			mClientCenter.setClientId(storeHead.getClientId());
			mClientCenter.setCenterId(storeHead.getCenterId());
		}

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		receiveInputNoDto.data.printFlg = 0;
		if (!existErrorData) {
			if (mParam.isResultAfterProductLabel$1() || mParam.isResultAfterProductLabel$3()) {
				BigDecimal storeNumSum = WCC.ZERO;
				// 画面に入庫数の合計
				for (TStoreRecordB body : storeBodyList) {
					storeNumSum = WCC.add(storeNumSum, body.getStoreNum());
				}
				if (WCC.isPositive(storeNumSum)) {
					receiveInputNoDto.data.printFlg = 1;
				}
			}
		}
		storeHead.setTReceivePlanH(planHead);
		receiveInputNoDto.data.storeHead = storeHeadMapper.mappingToDto(storeHead);
		return receiveInputNoDto;
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
	}

	/**
	 * <h2>登録データの組み立て。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・重複レコードチェック。
	 * ・実績数0以下チェック
	 * ・ロット・期限日入力チェック
	 * ・期限日(限界日)チェック
	 *
	 * 画面で入力されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 * 【入庫実績ヘッダ】
	 * ・仕入先ID
	 * 【入庫実績ボディ】
	 * ・商品ID
	 * ・ロケーションID
	 *
	 * 戻り値を下記のように設定する
	 *   ERROR : 重複レコードチェック異常、商品マスタ存在異常、ロケーションマスタ存在異常
	 *           、ロット・期限日入力チェック異常、仕入先マスタ存在異常、期限日(限界日)チェック異常
	 *   ALL_OK : 正常
	 * </pre>
	 * @param storeHead 入庫実績ヘッダ
	 * @param storeBody 入庫実績ボディリスト
	 * @param planHead 入荷予定ヘッダ
	 * @param planBody 入荷予定ボディリスト
	 * @return ResultSetupRegisterData 処理結果
	 *
	 */
	protected ResultSetupRegisterData setupRegisterData(TStoreRecordH storeHead, List<TStoreRecordB> storeBody,
			TReceivePlanH planHead, List<TReceivePlanB> planBody, ErrorStatus errSts) {

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(storeHead.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(storeHead.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// [ON推-品向-231] RS側の重複レコードチェックを削除 2014.11.20 fengc

		// =======================================================
		// =              入庫実績ボディと入荷予定ボディデータ組み立て          =
		// =======================================================

		// [ON推-品向-231] RS側の重複レコードチェックを削除 2014.11.20 fengc
		int rowIndex = -1;
		for (TStoreRecordB body : storeBody) {
			rowIndex++;

			// [ON推-品向-231] RS側の重複レコードチェックを削除 2014.11.20 fengc

			// ===== 商品マスタ存在チェック =====
			// 商品の設定
			MProduct productCondition = new MProduct();
			productCondition.setClientId(clientId);
			productCondition.setProductCd(planBody.get(rowIndex).getProductCd());
			MProduct product = productLogic.getUkEntity(productCondition, errRetSts(errSts, StatusCode.PRODUCT_NOT_FOUND, rowIndex));

			if (product != null) {
				planBody.get(rowIndex).setProductId(product.getProductId());
				body.getTReceivePlanB().setProductId(product.getProductId());

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
						if (!WmsCommonUtil.checkPatternInput("^\\d+$", WCC.stripTrailingZeros(body.getStoreNum()))) {
							// 小数0桁以内
							getErrorManager().add(errRetSts(errSts, StatusCode.STORE_NUM_DECIMAL_CHECK_FAILED, rowIndex), WmsMessageConst.PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR);
						}
					} else {}
				}
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			}
			// [ON推-品向-231] 商品存在チェックは全明細表示を修正 2014.11.20 fengc Start
			//			// 結果判定
			//			if (getErrorManager().size() > 0) {
			//				// 処理中止
			//				return ResultSetupRegisterData.ERROR;
			//			}
			// [ON推-品向-231] 商品存在チェックは全明細表示を修正 2014.11.20 fengc End

			// ===== ロケーションコードがある場合はロケーションと倉庫を設定 =====

			// ロケーションの設定
			MLocation locationCondition = new MLocation();
			locationCondition.setCenterId(centerId);
			locationCondition.setLocationCd(planBody.get(rowIndex).getPlanLocationCd());

			MLocation location = locationLogic.getUkEntityWithWarehouse(locationCondition, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));

			if (location != null) {
				planBody.get(rowIndex).setPlanLocationId(location.getLocationId());

				// 倉庫の設定
				MWarehouse warehouse = location.getMZone().getMWarehouse();
				planBody.get(rowIndex).setPlanWarehouseId(warehouse.getWarehouseId());
				planBody.get(rowIndex).setPlanWarehouseCd(warehouse.getWarehouseCd());
				body.setStoreLocationId(location.getLocationId());
			}
			// [ON推-品向-231] ロケーション存在チェックは全明細表示を修正 2014.11.20 fengc Start
			//			// 結果判定
			//			if (getErrorManager().size() > 0) {
			//				// 処理中止
			//				return ResultSetupRegisterData.ERROR;
			//			}
			// [ON推-品向-231] ロケーション存在チェックは全明細表示を修正 2014.11.20 fengc End

			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、入庫ラベルNOの設定を追加 2014.11.21 fengc Start
			body.setStoreLabelNo(body.getTReceivePlanB().getPlanStoreLabelNo());
			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、入庫ラベルNOの設定を追加 2014.11.21 fengc End

			// ===== 固定値の設定 =====
			planBody.get(rowIndex).setErrorFlg_$0();
			planBody.get(rowIndex).setPlanNum(body.getStoreNum());
			planBody.get(rowIndex).setReceiveStatus_$01();

			planBody.get(rowIndex).setPlanClientOrderNo(null);
			planBody.get(rowIndex).setPlanLot(null);
			planBody.get(rowIndex).setPlanLimitDt(null);
			planBody.get(rowIndex).setPlanLocationId(null);
			planBody.get(rowIndex).setPlanLocationCd(null);
			planBody.get(rowIndex).setPlanStoreLabelNo(null);
			planBody.get(rowIndex).setPlanNum(WCC.ZERO);

			//			if (!CU.isNullOrEmpty(body.getLimitDt())) {
			//				planBody.get(rowIndex).setPlanLimitDt(body.getLimitDt());
			//			}
			//
			//			if (!CU.isNullOrEmpty(body.getLot())) {
			//				planBody.get(rowIndex).setPlanLot(body.getLot());
			//			}
			body.setInputType_$00();
			body.setStoreDt(planHead.getReceivePlanDt());

		}
		// [ON推-品向-231] 存在チェックは全明細表示を修正 2014.11.20 fengc Start
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return ResultSetupRegisterData.ERROR;
		}
		// [ON推-品向-231] 存在チェックは全明細表示を修正 2014.11.20 fengc End

		// =======================================================
		// =              入庫実績ヘッダと入荷予定ヘッダデータ組み立て           =
		// =======================================================

		// 処理区分IDの取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setProcessTypeCd(storeHead.getMProcessType().getProcessTypeCd());
		MProcessType mProcessType = processTypeLogic.getUkEntityWithDeletedCheck(processTypeCondition);

		// 予定仕入先IDの取得
		MCustomer supplierCondition = new MCustomer();
		supplierCondition.setClientId(clientId);
		supplierCondition.setCustomerCd(storeHead.getTReceivePlanH().getPlanSupplierCd());

		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
		// 予定仕入先IDが取得できない場合、エラーメッセージをエラー管理クラスに登録
		MCustomer supplier = customerLogic.getVendorCustomerByClientCd(supplierCondition, errRetSts(errSts, StatusCode.CUSTOMER_NOT_FOUND));
		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

		// 予定預託IDの取得
		MCustomer depositCondition = new MCustomer();
		depositCondition.setClientId(clientId);
		depositCondition.setCustomerCd(storeHead.getTReceivePlanH().getPlanDepositCd());
		MCustomer deposit = customerLogic.getUkEntityWithDeletedCheck(depositCondition);

		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi Start
		// 在庫区分IDの取得
		MStockType mStockTypeCondition = new MStockType();
		mStockTypeCondition.setStockTypeCd(storeHead.getMStockType().getStockTypeCd());
		MStockType mStockType = stockTypeLogic.getUkEntity(mStockTypeCondition);
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi End
		// センタIDの設定
		storeHead.setCenterId(centerId);
		planHead.setCenterId(centerId);

		// 荷主IDの設定
		storeHead.setClientId(clientId);
		planHead.setClientId(clientId);

		// 処理区分IDの設定
		storeHead.setProcessTypeId(mProcessType.getProcessTypeId());
		// [SK2-053] 入荷予定入力なしの場合は入荷予定ヘッダに処理区分設定しない。設定処理削除 2014.12.15 kawana

		// 仕入先ID/予定仕入先IDの設定
		if (supplier != null) {
			storeHead.setSupplierId(supplier.getCustomerId());
			// [検査-019] 予定仕入先IDの設定を削除 2014.11.20 fengc
			//			planHead.setPlanSupplierId(supplier.getCustomerId());
		}

		// 預託ID/予定預託IDの設定
		storeHead.setDepositId(deposit.getCustomerId());
		// [検査-019] 予定預託IDの設定を削除 2014.11.20 fengc
		//		planHead.setPlanDepositId(deposit.getCustomerId());

		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi Start
		// 在庫区分IDの設定
		storeHead.setStockTypeId(mStockType.getStockTypeId());
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi End

		//入荷ステータス
		planHead.setReceiveStatus_$01();
		// 入力区分
		planHead.setInputType_$00();
		// エラーフラグ
		planHead.setErrorFlg_$0();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		// センタ間移動フラグ(通常)
		planHead.setCenterTransitFlg_$0();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End

		// [検査-019] 予定仕入先CDを修正 2014.11.20 fengc Start
		planHead.setPlanSupplierCd(null);
		planHead.setPlanDepositCd(null);
		// [検査-019] 予定仕入先CDを修正 2014.11.20 fengc End

		// 顧客入荷指示No.
		storeHead.setClientReceiveNo(storeHead.getTReceivePlanH().getPlanClientReceiveNo());

		// 予定顧客入荷指示No.
		planHead.setPlanClientReceiveNo(null);

		// =======================================================
		// =              結果設定                                                                                   =
		// =======================================================
		ResultSetupRegisterData checkStatus;
		checkStatus = ResultSetupRegisterData.ALL_OK;
		//		if (getErrorManager().size() > 0) {
		//			// 処理中止
		//			checkStatus =  ResultSetupRegisterData.ERROR;
		//		}
		return checkStatus;
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
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
		List<TStoreRecordB> tStoreRecordBList = receiveInputSelectLogic.selectReportInfo(tStoreRecordH, errRetSts(StatusCode.RECEIVE_RECORD_INSERT_FAILED));

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
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

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
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.DOCUMENT_NUMBER_CONFIRMATION_INFORMATION, tStoreRecordH.chaseTReceivePlanH().getReceiveSlipNo());

		return productLabelPrintDto;
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End

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
	 * @param ReceiveInputNoDto 入荷実績入力(予定無し)画面用DTO
	 * @return ReceiveInputNoDto 処理結果DTO
	 */
	@GET
	@Path("/searchReportId")
	public ReceiveInputNoDto searchReportId(ReceiveInputNoDto receiveInputNoDto) throws Exception {
		// 入庫実績ヘッダ
		TStoreRecordHDtoMapper storeHeadMapper = new TStoreRecordHDtoMapper();
		TStoreRecordH storeHead = storeHeadMapper.mappingToEntity(receiveInputNoDto.data.storeHead);

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

		receiveInputNoDto.data.resultAfterProductTarget = mParam.getResultAfterProductTarget();

		if (mParam.isResultAfterProductTarget$1()) {
			receiveInputNoDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(STORE_REPORT_CD);

		}
		if (mParam.isResultAfterProductTarget$2()) {
			receiveInputNoDto.data.directionsPrintParam.printBasicData.reportId = reportLogic.getReportId(PRODUCT_REPORT_CD);
		}

		return receiveInputNoDto;
	}

	// [#1755]入庫ラベル最新化 2017.07.24 sampei End
}
