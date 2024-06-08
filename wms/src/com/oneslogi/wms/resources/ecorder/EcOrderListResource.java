package com.oneslogi.wms.resources.ecorder;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.dto.TEcOrderHDto;
import com.oneslogi.base.dbflute.dtomapper.TEcOrderHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.ecorder.EcOrderListDto;
import com.oneslogi.wms.dto.report.EcDeliverySlipListDto;
import com.oneslogi.wms.dto.shipping.PickingListPrintParamDto;
import com.oneslogi.wms.dto.shipping.ShippingInstListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ImportTypeLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.ecorder.EcDeliverySlipListPrintSelectLogic;
import com.oneslogi.wms.logic.ecorder.EcOrderDeleteLogic;
import com.oneslogi.wms.logic.ecorder.EcOrderListSelectLogic;
import com.oneslogi.wms.logic.ecorder.EcOrderMergeLogic;
import com.oneslogi.wms.logic.ecorder.EcOrderUpdateControlNoLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanDeleteLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/ecorder/ecOrderList")
public class EcOrderListResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (PACKING_REPORT_CDをロジッククラスに移動) 2018.08.20 kawana Delete

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
		 * 検索異常
		 */
		protected static final int SEARCH_ERROR = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_ERROR = 3;
		/**
		 * 受注キャンセル異常
		 */
		protected static final int ORDER_CANCEL_ERROR = 4;
		/**
		 * 納品書出力異常
		 */
		protected static final int STATEMENT_OUT_ERROR = 5;
		/**
		 * エラーデータ削除異常
		 */
		protected static final int ORDER_DELETE_ERROR = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ImportTypeLogic importTypeLogic;
	@Inject
	private EcOrderListSelectLogic selectLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private EcOrderUpdateControlNoLogic updateControlNoLogic;
	// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正(不要になった定義を削除) 2015.08.06 kawana
	@Inject
	private ShippingPlanDeleteLogic shipPlanDeleteLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private EcDeliverySlipListPrintSelectLogic reportPrintSelectLogic;
	@Inject
	private EcOrderDeleteLogic deleteLogic;
	@Inject
	private EcOrderMergeLogic mergeLogic;

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOを作成する
	 * </pre>
	 * @return ShippingInstListDto EC受注データ一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public EcOrderListDto init() {
		EcOrderListDto dto = new EcOrderListDto();

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (PACKING_REPORT_CDをロジッククラスに移動) 2018.08.20 kawana Start

		// お買い上げ明細のレポートIDを設定
		dto.printBasicData.reportId = reportLogic.getReportId(EcDeliverySlipListPrintSelectLogic.REPORT_CD);

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (PACKING_REPORT_CDをロジッククラスに移動) 2018.08.20 kawana End

		return dto;
	}

	/**
	 * <h2>検索</h2>
	 * <pre>
	 * EC受注データの検索
	 * 入力された検索条件からEC受注データ一覧データを取得する
	 * </pre>
	 * @param inputDto 検索条件を設定したEC受注データ一覧画面用DTO
	 * @return EcOrderListDto 検索結果を設定したEC受注データ一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public EcOrderListDto search(EcOrderListDto inputDto) {

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		TEcOrderH condition = mapper.mappingToEntity(inputDto.data.search);
		TEcOrderR conditionR = condition.chaseTEcOrderRAsOne();
		TShippingInstH conditionShipH = condition.chaseTShippingInstH();

		// ===== 検索データの構築 =====
		// 荷主IDの設定
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(condition.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		condition.setClientId(clientId);

		// センタIDの設定
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(condition.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		condition.setCenterId(centerId);

		// 取込み種別IDの設定
		String importTypeCd = condition.chaseMImportType().getImportTypeCd();
		if (!CU.isNullOrEmpty(importTypeCd)) {
			MImportType importTypeCondition = new MImportType();
			importTypeCondition.setImportTypeCd(importTypeCd);
			importTypeCondition.setClientId(clientId);
			MImportType importType = importTypeLogic.getUkEntity(importTypeCondition);
			if (importType == null) {
				getErrorManager().add(new ErrorStatus(StatusCode.SEARCH_ERROR), WmsMessageConst.IMPORT_TYPE_NOT_FOUND_ERROR);
				return null;
			}
			condition.setImportTypeId(importType.getImportTypeId());
		}

		// ===== 検索ロジック呼出 =====
		List<TEcOrderH> resultList = selectLogic.select(condition, conditionR, conditionShipH, errRetSts(StatusCode.SEARCH_ERROR));
		EcOrderListDto resultDto = new EcOrderListDto();
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultDto;
		}

		// Dto変換処理;
		List<TEcOrderHDto> list = mapper.mappingToDtoList(resultList);

		resultDto.data.list = list;

		return resultDto;
	}

	/**
	 * <h2>チェック処理(指示修正)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、指示修正処理クラスを呼出し、完了メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkInstUpdate")
	public StatusDto checkInstUpdate(EcOrderListDto inputDto) {

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> entityList = mapper.mappingToEntityList(inputDto.data.list);

		for (TEcOrderH h : entityList) {

			if (!(h.chaseTShippingInstH().isShippingStatus$10() || h.chaseTShippingInstH().isShippingStatus$99())) {
				this.getErrorManager().add(errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR), WmsMessageConst.EC_ORDER_CANNOT_UPDATE_EXCEPT_NOT_SHIPPING_ERROR);
				return null;
			}
		}

		// エラーなし
		return null;
	}

	/**
	 * <h2>納品書出力チェック処理</h2>
	 * <pre>
	 * 納品書出力の処理前に状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 *
	 * 【チェック内容】
	 * ・出荷状態が未入荷以外であること
	 *
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkStatementOut")
	public StatusDto checkStatementOut(EcOrderListDto inputDto) {

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> entityList = mapper.mappingToEntityList(inputDto.data.list);

		for (TEcOrderH h : entityList) {
			TShippingInstH instH = h.chaseTShippingInstH();

			if (CU.isNullOrEmpty(instH.getShippingStatus())) {
				this.getErrorManager().add(errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR), WmsMessageConst.EC_ORDER_CANNOT_STATEMENT_OUT_NOT_SHIPPING_ERROR);
				return null;
			}
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			switch (h.chaseTShippingInstH().getShippingStatusAsShippingStatus()) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			case $10:
			// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
			case $15:
			case $20:
			// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End
			case $90:
			case $99:
				this.getErrorManager().add(errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR), WmsMessageConst.EC_ORDER_CANNOT_STATEMENT_OUT_NOT_SHIPPING_ERROR);
				return null;
			// [C-CWMS-0066] 非同期処理化(出庫指示中、出庫解除中をエラーのケースに移動) 2016.10.19 kawana
			case $25:
			case $30:
			case $35:
			case $40:
			case $45:
			case $50:
			case $55:
				break;
			}
		}

		// ===== 名寄せチェックのために出力処理の一部を行う ====

		// コントロールNo.を採番
		Long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo更新 =====
		List<TEcOrderR> updateList = new ArrayList<TEcOrderR>();
		for (TEcOrderH body : entityList) {
			TEcOrderR orderR = body.getTEcOrderRAsOne();
			orderR.setControlNo(controlNo);
			updateList.add(orderR);
		}
		reportPrintSelectLogic.ecOrderRBatchUpdate(updateList, errRetSts(StatusCode.STATEMENT_OUT_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// EC受注帳票(検索用)
		TEcOrderR ecOrderRSearch = new TEcOrderR();
		// EC受注帳票(検索用)
		ecOrderRSearch.setControlNo(controlNo);
		// 対象データ検索
		List<TEcOrderH> eccOrderHList = reportPrintSelectLogic.select(ecOrderRSearch, errRetSts(StatusCode.STATEMENT_OUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 名寄せ情報の作成とチェック
		mergeLogic.createMergeInfoMapWithCheck(eccOrderHList, errRetSts(StatusCode.STATEMENT_OUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// コントロールNoクリア
		TEcOrderR ecOrderRUpdate = new TEcOrderR(); //EC受注帳票(更新用)
		ecOrderRUpdate.setControlNo(null);

		reportPrintSelectLogic.ecOrderRUpdate(ecOrderRUpdate, ecOrderRSearch, errRetSts(StatusCode.STATEMENT_OUT_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		return null;
	}

	/**
	 * <h2>納品書出力処理</h2>
	 * <pre>
	 * エラーがない場合は、納品書出力ロジックを呼び出し納品書を出力する
	 *
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */

	@GET
	@Path("/statementOut")
	public EcOrderListDto statementOut(EcOrderListDto inputDto) throws Exception {

		// コントロールNo.を採番
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TEcOrderHDtoMapper bodyMapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> bodyList = bodyMapper.mappingToEntityList(inputDto.data.list);

		// ===== コントロールNo更新 =====
		List<TEcOrderR> updateList = new ArrayList<TEcOrderR>();
		for (TEcOrderH body : bodyList) {
			TEcOrderR orderR = body.getTEcOrderRAsOne();
			orderR.setControlNo(controlNo);
			updateList.add(orderR);
		}

		// ECお買上明細リスト出力データ取得.EC受注帳票更新メソッドを呼出し
		reportPrintSelectLogic.ecOrderRBatchUpdate(updateList, errRetSts(StatusCode.STATEMENT_OUT_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// EC受注帳票(検索用)
		TEcOrderR ecOrderRSearch = new TEcOrderR();
		// EC受注帳票(検索用)
		ecOrderRSearch.setControlNo(controlNo);

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (データ取得メソッド[getEcDeliverySlipDataList]をリソースクラスからロジッククラスへ移動) 2018.08.20 kawana Start

		// コントロールNoを指定してロジック呼出
		List<EcDeliverySlipListDto> printDto = reportPrintSelectLogic.selectReportDtoList(ecOrderRSearch, errRetSts(StatusCode.STATEMENT_OUT_ERROR));

		// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (データ取得メソッド[getEcDeliverySlipDataList]をリソースクラスからロジッククラスへ移動) 2018.08.20 kawana End

		if (getErrorManager().size() > 0) {
			return null;
		}

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// ECお買上明細を発行する
		inputDto.printBasicData.outputData = json.format(printDto);
		printLogic.print(inputDto);

		PickingListPrintParamDto ret = new PickingListPrintParamDto();
		ret.output = inputDto.output;

		Timestamp time = new Timestamp(System.currentTimeMillis());

		// コントロールNo更新
		TEcOrderR ecOrderRUpdate = new TEcOrderR(); //EC受注帳票(更新用)

		// エンティティ編集
		// EC受注帳票(更新用)
		ecOrderRUpdate.setControlNo(null);
		ecOrderRUpdate.setStatementOutFlg_$1();
		ecOrderRUpdate.setStatementOutDt(time);
		ecOrderRUpdate.setStatementOutUserId(this.getUserId());

		// ECお買上明細リスト出力データ取得.コントロールNo更新メソッドを呼出し
		// コントロールNo更新メソッドを呼出し
		reportPrintSelectLogic.ecOrderRUpdate(ecOrderRUpdate, ecOrderRSearch, errRetSts(StatusCode.STATEMENT_OUT_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージを設定
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return inputDto;
	}

	/**
	 * <h2>受注キャンセルチェック処理</h2>
	 * <pre>
	 * 受注キャンセル時の状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 *
	 * 【チェック内容】
	 * ・出荷状態が未出荷であること
	 *
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkOrderCancel")
	public StatusDto checkOrderCancel(EcOrderListDto inputDto) {

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> entityList = mapper.mappingToEntityList(inputDto.data.list);

		// ステータスチェック(未出荷)
		for (TEcOrderH h : entityList) {

			if (!h.chaseTShippingInstH().isShippingStatus$10()) {
				this.getErrorManager().add(errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR), WmsMessageConst.EC_ORDER_CANNOT_CANCEL_EXCEPT_NOT_SHIPPING_ERROR);
				return null;
			}
		}

		// エラーなし - 確認メッセージを設定
		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>出荷指示キャンセル処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷指示キャンセル処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/orderCancel")
	public ShippingInstListDto orderCancel(EcOrderListDto inputDto) {

		// コントロールNo.を採番
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> entityList = mapper.mappingToEntityList(inputDto.data.list);

		// コントロールNoを設定 (VersionNoの排他チェック込み)
		updateControlNoLogic.setControlNo(entityList, controlNo, errRetSts(StatusCode.ORDER_CANCEL_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana Start

		// 出荷指示キャンセル処理
		shipPlanDeleteLogic.Cancel(controlNo);

		// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana End

		// コントロールNoをクリア
		updateControlNoLogic.clearControlNo(controlNo, errRetSts(StatusCode.ORDER_CANCEL_ERROR));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>チェック処理(エラーデータ削除時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkErrorDelete")
	public StatusDto checkErrorDelete(EcOrderListDto inputDto) {
		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> entityList = mapper.mappingToEntityList(inputDto.data.list);

		// ステータスチェック(未出荷)
		for (TEcOrderH h : entityList) {

			if (!h.chaseTShippingInstH().isShippingStatus$99()) {
				this.getErrorManager().add(errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR), WmsMessageConst.ERROR_DELETE_START_ERROR);
				return null;
			}
		}

		// エラーなし - 確認メッセージを設定
		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		return null;

	}

	/**
	 * <h2>エラーデータ削除処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、エラーデータ削除処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param inputDto EC受注データ一覧画面用DTO
	 * @return ShippingInstListDto 処理結果DTO
	 */
	@POST
	@Path("/errorDelete")
	public ShippingInstListDto errorDelete(EcOrderListDto inputDto) {
		// コントロールNo.を採番
		Long controlNo = numberingCenterLogic.getControlNo();

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> entityList = mapper.mappingToEntityList(inputDto.data.list);

		// コントロールNoを設定 (VersionNoの排他チェック込み)
		updateControlNoLogic.setControlNo(entityList, controlNo, errRetSts(StatusCode.ORDER_DELETE_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana Start

		// 出荷指示データ削除処理
		shipPlanDeleteLogic.delete(controlNo);

		// EC受注データ削除処理
		deleteLogic.delete(controlNo);

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);

		// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana End

		// コントロールNoをクリア
		updateControlNoLogic.clearControlNo(controlNo, errRetSts(StatusCode.ORDER_DELETE_ERROR));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;

	}

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (getEcDeliverySlipDataList, addDeliverySlipData, createDeliverySlipDataメソッドをロジッククラスに移動) 2018.08.20 kawana Delete
}
