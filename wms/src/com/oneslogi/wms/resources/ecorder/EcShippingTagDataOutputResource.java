package com.oneslogi.wms.resources.ecorder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedMap;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;

import com.oneslogi.base.BaseConst;
import com.oneslogi.base.dbflute.dto.TEcOrderHDto;
import com.oneslogi.base.dbflute.dtomapper.TEcOrderHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.OutputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.ecorder.EcShinppingTagDataOutPutInvoceDataCountDto;
import com.oneslogi.wms.dto.ecorder.EcShippingTagDataOutputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ImportTypeLogic;
import com.oneslogi.wms.logic.ecorder.EcDelivAddressModifyLogic;
import com.oneslogi.wms.logic.ecorder.EcShippingTagDataOutputCsvDataSelectLogic;
import com.oneslogi.wms.logic.ecorder.EcShippingTagDataOutputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * EC送り状データ出力のリソースクラス。
 */
@Path("/ecorder/ecShippingTagDataOutput")
public class EcShippingTagDataOutputResource extends AbstractWmsResource {

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
		 * ヤマト送り状出力データ取得異常
		 */
		protected static final int YAMATO_DATA_SELECT_FAILED = 2;
		/**
		 * 佐川送り状出力データ取得異常
		 */
		protected static final int SAWATA_DATA_SELECT_FAILED = 3;
		/**
		 * ゆうパック送り状出力データ取得異常
		 */
		protected static final int YUPK_DATA_SELECT_FAILED = 4;
		/**
		 * EC受注帳票更新異常
		 */
		protected static final int T_EC_ORDER_R_UPDATE_FAILED = 5;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_SELECT_FAILED = 6;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_ERROR = 7;
		// [品質-001] 「該当データが存在しません。」のメッセージ色を修正するため、追加する 2015.02.19 許 Start
		/**
		 * 検索異常
		 */
		protected static final int SEARCH_ERROR = 8;
		// [品質-001] 「該当データが存在しません。」のメッセージ色を修正するため、追加する 2015.02.19 許 End
		// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo Start
		/**
		 * 送付先住所変更エラー
		 */
		protected static final int DELIV_ADDRESS_MODIFID_ERROR = 9;
		// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo End
	}

	// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo Start
	/**
	 * 登録データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		DELIV_ADDRESS_MODIFID_ERROR
	}

	// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo End

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start

	/**
	 * 運送業者種別
	 */
	private enum CarrierType {
		YAMATO,
		SAGAWA,
		YOUPACK
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private EcShippingTagDataOutputSelectLogic selectLogic;
	@Inject
	private EcShippingTagDataOutputCsvDataSelectLogic ecShippingTagDataOutputCsvDataSelectLogic;
	@Inject
	private ImportTypeLogic importTypeLogic;
	// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo Start
	@Inject
	private EcDelivAddressModifyLogic ecDelivAddressModifyLogic;

	// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo End

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ecShippingTagDataOutputDto EC送り状データ出力画面用DTO
	 */
	@GET
	@Path("/initNew")
	public EcShippingTagDataOutputDto initNew() {

		// 画面用DTO作成
		EcShippingTagDataOutputDto ecshippingTagDataOutputDto = new EcShippingTagDataOutputDto();

		return ecshippingTagDataOutputDto;
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・EC送り状出力データを取得する
	 * </pre>
	 * @param ecShippingTagDataOutputDto 送り状データ出力画面用DTO
	 * @return EcShippingTagDataOutputDto 送り状データ出力画面用DTO
	 */
	@GET
	@Path("/search")
	public EcShippingTagDataOutputDto search(EcShippingTagDataOutputDto ecShippingTagDataOutputDto) {

		// Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		TEcOrderH tEcOrderH = mapper.mappingToEntity(ecShippingTagDataOutputDto.data.search);
		TEcOrderR tEcOrderR = tEcOrderH.chaseTEcOrderRAsOne();
		TShippingInstH tShippingInstH = tEcOrderH.chaseTShippingInstH();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
//		MCarrier mCarrier = tShippingInstH.chaseMDeliveryCourse().chaseMCarrier();
		MDeliveryCourse mDeliveryCourse = tShippingInstH.chaseMDeliveryCourse();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End

		// 荷主IDを取得
		MClient mClient = new MClient();
		mClient.setClientCd(tEcOrderH.getMClient().getClientCd());
		mClient = clientLogic.getUkEntityWithDeletedCheck(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(mClient).getClientId();

		// 取込み種別IDの設定
		String importTypeCd = tEcOrderH.chaseMImportType().getImportTypeCd();
		if (!CU.isNullOrEmpty(importTypeCd)) {
			MImportType importTypeCondition = new MImportType();
			importTypeCondition.setImportTypeCd(importTypeCd);
			importTypeCondition.setClientId(clientId);
			MImportType importType = importTypeLogic.getUkEntity(importTypeCondition);
			if (importType == null) {
				getErrorManager().add(new ErrorStatus(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.IMPORT_TYPE_NOT_FOUND_ERROR);
				return null;
			}
			tEcOrderH.setImportTypeId(importType.getImportTypeId());
		}
		// [品質-001] 「該当データが存在しません。」のメッセージ色を修正する 2015.02.19 許 Start
		// ===== 検索ロジック呼出 =====
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
//		List<TEcOrderH> resultList = selectLogic.select(tEcOrderH, tEcOrderR, tShippingInstH, mCarrier, errRetSts(StatusCode.SEARCH_ERROR));
		List<TEcOrderH> resultList = selectLogic.select(tEcOrderH, tEcOrderR, tShippingInstH, mDeliveryCourse, errRetSts(StatusCode.SEARCH_ERROR));
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
		// [品質-001] 「該当データが存在しません。」のメッセージ色を修正する 2015.02.19 許 End
		EcShippingTagDataOutputDto resultDto = new EcShippingTagDataOutputDto();

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultDto;
		}
		// Dto変換処理;
		List<TEcOrderHDto> list = mapper.mappingToDtoList(resultList);

		resultDto.data.list = list;

		return resultDto;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start

	/**
	 * <h2>EC送り状データリスト出力前のチェック。</h2>
	 * <pre>
	 * エラーがない場合は、確認メッセージを設定する
	 * </pre>
	 * @param ecShippingTagDataOutputDto EC送り状データ出力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkPrint")
	public StatusDto checkPrint(EcShippingTagDataOutputDto ecShippingTagDataOutputDto) throws Exception {

		// 明細部Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> ecOrderList = mapper.mappingToEntityList(ecShippingTagDataOutputDto.data.list);

		//出荷状態チェック
		List<TShippingInstH> shippingInstHList = new ArrayList<TShippingInstH>();

		for (TEcOrderH ecOrderH : ecOrderList) {
			if (ecOrderH.chaseTShippingInstH().getShippingStatus() == null) {

				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR), WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_INVOICE_CREATE_NOT_SHIPPING_ERROR);
				return null;
			} else {

				shippingInstHList.add(ecOrderH.getTShippingInstH());
			}
		}

		// 出荷指示がある場合、出荷ステータスをチェック
		ecShippingTagDataOutputCsvDataSelectLogic.shipStatusCheck(shippingInstHList, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// ===== 同一の運送業者が選択されているかのチェック =====

		// EC送り状用の各CSVファイルのデータ件数とCSVファイル名称を取得
		EcShinppingTagDataOutPutInvoceDataCountDto countDto = ecShippingTagDataOutputCsvDataSelectLogic.carrierSlipDataCountSelect(ecOrderList, errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED));

		// 配送コースに紐付く送り状データ定義の存在チャック
		String csvFileName = "";
		CarrierType carrierType;
		if (countDto.isAllCarrierSlipIdIsOK()) {
			if (countDto.getYamatoInvoceDataCount() >= 1 && countDto.getSagawaInvoceDataCount() == 0 && countDto.getYupkInvoceDataCount() == 0) {
				carrierType = CarrierType.YAMATO;
				csvFileName = countDto.getYamatoCsvFileName();
			} else if (countDto.getYamatoInvoceDataCount() == 0 && countDto.getSagawaInvoceDataCount() >= 1 && countDto.getYupkInvoceDataCount() == 0) {
				carrierType = CarrierType.SAGAWA;
				csvFileName = countDto.getSagawaCsvFileName();
			} else if (countDto.getYamatoInvoceDataCount() == 0 && countDto.getSagawaInvoceDataCount() == 0 && countDto.getYupkInvoceDataCount() >= 1) {
				carrierType = CarrierType.YOUPACK;
				csvFileName = countDto.getYupkCsvFileName();
			} else {
				// 異なる運送業者のデータが選択されているため、出力できません。
				this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_CARRIER_TO_ERROR);
				return null;
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
			if (countDto.getTagDataTypeCount() > 1) {
				// 異なる送り状データ種別のデータが選択されている
				this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_DATA_TYPE_ERROR);
				return null;
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
		} else {
			// 配送コースに紐付く送り状データ定義が存在しない場合
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CARRIER_SLIP_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR);
			return null;
		}

		// ===== ファイル名が設定されているかのチェック =====
		if (CU.isNullOrEmpty(csvFileName)) {
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
			return null;
		}

		// ===== CSV作成時のエラーチェック(同梱チェック) =====
		// CSV出力対象データを取得
		List<TEcOrderH> csvDataList = ecShippingTagDataOutputCsvDataSelectLogic.selectCsvData(ecOrderList, errRetSts(StatusCode.YAMATO_DATA_SELECT_FAILED));
		if (getErrorManager().size() > 0) {
			return null;
		}
		// CSVデータ作成
		switch (carrierType) {
		case YAMATO:
			ecShippingTagDataOutputCsvDataSelectLogic.createYamatoCsvData(csvDataList, errRetSts(StatusCode.YAMATO_DATA_SELECT_FAILED));
			break;
		case SAGAWA:
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
//			ecShippingTagDataOutputCsvDataSelectLogic.createSagawaCsvData(csvDataList, errRetSts(StatusCode.SAWATA_DATA_SELECT_FAILED));
			if (csvDataList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$2()) {
				// 送り状データ種別が「2：E飛伝」の場合
				ecShippingTagDataOutputCsvDataSelectLogic.createSagawaCsvData(csvDataList, errRetSts(StatusCode.SAWATA_DATA_SELECT_FAILED));
			}else {
				// 送り状データ種別が「3：E飛伝Pro」の場合
				ecShippingTagDataOutputCsvDataSelectLogic.createSagawaProCsvData(csvDataList, errRetSts(StatusCode.SAWATA_DATA_SELECT_FAILED));
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End
			break;
		case YOUPACK:
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
//			ecShippingTagDataOutputCsvDataSelectLogic.createYoupackCsvData(csvDataList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			if (csvDataList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$4()) {
				// 送り状データ種別が「4：ゆうパックプリントR（発送予定）」の場合
				ecShippingTagDataOutputCsvDataSelectLogic.createYoupackCsvData(csvDataList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}else if(csvDataList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$5()){
				// 送り状データ種別が「5：ゆうパックプリントR(発送履歴)」の場合
				// ===== 出力データ作成 =====
				ecShippingTagDataOutputCsvDataSelectLogic.createHYoupackCsvData(csvDataList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}else if(csvDataList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$6()){
				// 送り状データ種別が「6：発送確定データフォーマット」の場合
				ecShippingTagDataOutputCsvDataSelectLogic.createCYoupackCsvData(csvDataList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}else if(csvDataList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$7()){
				// 送り状データ種別が「7：大口FDデータフォーマット」の場合
				ecShippingTagDataOutputCsvDataSelectLogic.createLargeFDYupkEexportData(csvDataList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End

			break;
		}

		if (getErrorManager().size() > 0) {
			return null;
		}

		// ===== エラーなしのため確認メッセージを設定 =====
		getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		return null;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

	/**
	 * <h2>EC送り状データリスト出力。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する。
	 * 帳票を出力する。
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 *
	 * ・コントロールNo
	 * ・送り状データ作成フラグ
	 * ・送り状データ作成日時
	 * </pre>
	 * @param ecShippingTagDataOutputDto EC送り状データ出力画面用DTO
	 * @return OutputDto
	 */
	@GET
	@Path("/print")
	public OutputDto print(final EcShippingTagDataOutputDto ecShippingTagDataOutputDto) throws Exception {

		// Entity変換
		TEcOrderHDtoMapper headerMapper = new TEcOrderHDtoMapper();
		final TEcOrderH header = headerMapper.mappingToEntity(ecShippingTagDataOutputDto.data.search);

		// 荷主IDを取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntityWithDeletedCheck(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(mClient).getClientId();

		// センタIDを取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CENTER_ITEM_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();

		// 明細部Entity変換
		TEcOrderHDtoMapper mapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> bodyList = mapper.mappingToEntityList(ecShippingTagDataOutputDto.data.list);

		// ===== コントロールNo.採番 =====
		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo更新 =====
		//コントロールNo更新
		TEcOrderR ecOrderRUpdate = new TEcOrderR(); //EC受注帳票(更新用)
		TEcOrderR ecOrderRSearch = new TEcOrderR(); //EC受注帳票(検索用)
		// エンティティ編集
		// EC受注帳票(更新用)
		ecOrderRUpdate.setControlNo(controlNo);
		// EC受注帳票(検索用)
		ecOrderRSearch.setControlNo(controlNo);

		// EC送り状データリスト出力データ取得.コントロールNo更新メソッドを呼出し(VersionNoの排他チェック込み)
		selectLogic.updateControlNo(bodyList, ecOrderRUpdate, clientId, centerId, errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED));

		// EC送り状用の各CSVファイルのデータ件数とCSVファイル名称を取得
		EcShinppingTagDataOutPutInvoceDataCountDto countDto = ecShippingTagDataOutputCsvDataSelectLogic.carrierSlipDataCountSelect(ecOrderRSearch, errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED));

		// 配送コースに紐付く送り状データ定義の存在チャック
		String tagDataType = "";
		String csvFileName = "";

		if (countDto.isAllCarrierSlipIdIsOK()) {
			if (countDto.getYamatoInvoceDataCount() >= 1 && countDto.getSagawaInvoceDataCount() == 0 && countDto.getYupkInvoceDataCount() == 0) {
				tagDataType = "YAMATO";
				csvFileName = countDto.getYamatoCsvFileName();
			} else if (countDto.getYamatoInvoceDataCount() == 0 && countDto.getSagawaInvoceDataCount() >= 1 && countDto.getYupkInvoceDataCount() == 0) {
				tagDataType = "SAGAWA";
				csvFileName = countDto.getSagawaCsvFileName();
			} else if (countDto.getYamatoInvoceDataCount() == 0 && countDto.getSagawaInvoceDataCount() == 0 && countDto.getYupkInvoceDataCount() >= 1) {
				tagDataType = "YUPK";
				csvFileName = countDto.getYupkCsvFileName();
			} else {
				// 異なる運送業者のデータが選択されているため、出力できません。
				this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_CARRIER_TO_ERROR);
				return null;
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
			if (countDto.getTagDataTypeCount() > 1) {
				// 異なる送り状データ種別のデータが選択されている
				this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_DATA_TYPE_ERROR);
				return null;
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
		} else {
			// 配送コースに紐付く送り状データ定義が存在しない場合
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CARRIER_SLIP_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR);
			return null;
		}

		// 運送業者マスタに送り状データ種別の存在チェック
		if (CU.isNullOrEmpty(csvFileName)) {
			this.getErrorManager().add(errRetSts(StatusCode.SEARCH_DATA_SELECT_FAILED), WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
			return null;
		}

		// [ON推-品向-791] 文字コードをマスタから設定 2015.04.22 kawana Start
		// 送り状CSVデータ
		List<SortedMap<Integer, Object>> exportData = new ArrayList<SortedMap<Integer, Object>>();

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana Start
		// データを取得
		List<TEcOrderH> selectList = ecShippingTagDataOutputCsvDataSelectLogic.selectCsvData(ecOrderRSearch, errRetSts(StatusCode.YAMATO_DATA_SELECT_FAILED));
		if (getErrorManager().size() > 0) {
			return null;
		}
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana End

		// [C-CWMS-0026] 文字コードの初期値設定箇所を変更 2015.05.20 kawana Start
		// 文字コード
		String exportCharsets = null;
		// [C-CWMS-0026] 文字コードの初期値設定箇所を変更 2015.05.20 kawana End
		if ("YAMATO".equals(tagDataType)) {
			// ECヤマト送り状を出力する場合

			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更(検索ロジックを一本化のため削除) 2015.05.20 kawana

			// 出力データを作成
			exportData = ecShippingTagDataOutputCsvDataSelectLogic.createYamatoCsvData(selectList, errRetSts(StatusCode.YAMATO_DATA_SELECT_FAILED));
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 文字コード
			String ymtCharsets = selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getCharacterCd();
			if (!CU.isNullOrEmpty(ymtCharsets)) {
				exportCharsets = ymtCharsets;
			}
		} else if ("SAGAWA".equals(tagDataType)) {
			// EC佐川送り状を出力する場合

			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更(検索ロジックを一本化のため削除) 2015.05.20 kawana

			// 出力データを作成
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
//			exportData = ecShippingTagDataOutputCsvDataSelectLogic.createSagawaCsvData(selectList, errRetSts(StatusCode.SAWATA_DATA_SELECT_FAILED));
			if (selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$2()) {
				// 送り状データ種別が「2：E飛伝」の場合
				exportData = ecShippingTagDataOutputCsvDataSelectLogic.createSagawaCsvData(selectList, errRetSts(StatusCode.SAWATA_DATA_SELECT_FAILED));
			}else {
				// 送り状データ種別が「3：E飛伝Pro」の場合
				exportData = ecShippingTagDataOutputCsvDataSelectLogic.createSagawaProCsvData(selectList, errRetSts(StatusCode.SAWATA_DATA_SELECT_FAILED));
			}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 文字コード
			String sgwCharsets = selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipSgw().getCharacterCd();
			if (!CU.isNullOrEmpty(sgwCharsets)) {
				exportCharsets = sgwCharsets;
			}
		} else if ("YUPK".equals(tagDataType)) {
			// ECゆうパック送り状を出力する場合

			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更(検索ロジックを一本化のため削除) 2015.05.20 kawana

			// 出力データを作成
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
//			exportData = ecShippingTagDataOutputCsvDataSelectLogic.createYoupackCsvData(selectList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			if (selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$4()) {
				// 送り状データ種別が「4：ゆうパックプリントR（発送予定）」の場合
				exportData = ecShippingTagDataOutputCsvDataSelectLogic.createYoupackCsvData(selectList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}else if(selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$5()){
				// 送り状データ種別が「5：ゆうパックプリントR(発送履歴)」の場合
				// ===== 出力データ作成 =====
				exportData = ecShippingTagDataOutputCsvDataSelectLogic.createHYoupackCsvData(selectList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403] ゆうパックの送り状データの新しいフォーマット作成 2016.12.27 nayzaw Start
			else if(selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$6()){
				// 送り状データ種別が「6：発送確定データフォーマット」の場合
				// ===== 出力データ作成 =====
				exportData = ecShippingTagDataOutputCsvDataSelectLogic.createCYoupackCsvData(selectList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}
			else if(selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().isTagDataType$7()){
				// 送り状データ種別が「7：大口FDデータフォーマット」の場合
				// ===== 出力データ作成 =====
				exportData = ecShippingTagDataOutputCsvDataSelectLogic.createLargeFDYupkEexportData(selectList, errRetSts(StatusCode.YUPK_DATA_SELECT_FAILED));
			}
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403] ゆうパックの送り状データの新しいフォーマット作成 2016.12.27 nayzaw End
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 文字コード
			String youpackCharsets = selectList.get(0).chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYupk().getCharacterCd();
			if (!CU.isNullOrEmpty(youpackCharsets)) {
				exportCharsets = youpackCharsets;
			}
		}

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/05  Start
		SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyyMMddHHmmss");
		Date curDate = new Date(System.currentTimeMillis());
		csvFileName = csvFileName + '_' + dateFormat.format(curDate);
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/05  End
		// CSVファイル作成
		this.getFile(ecShippingTagDataOutputDto, exportData, csvFileName, exportCharsets);
		// [ON推-品向-791] 文字コードをマスタから設定 2015.04.22 kawana End

		Timestamp time = new Timestamp(System.currentTimeMillis());

		// EC受注帳票更新
		ecOrderRUpdate.setControlNo(null);
		ecOrderRUpdate.setInvoiceCreateFlg("1");
		ecOrderRUpdate.setInvoiceCreateDt(time);

		// EC受注帳票更新メソッドを呼出し
		selectLogic.ecOrderRUpdate(ecOrderRUpdate, ecOrderRSearch, errRetSts(StatusCode.T_EC_ORDER_R_UPDATE_FAILED));
		// コントロールNoをクリアメソッドを呼出し
		selectLogic.clearControlNo(controlNo, errRetSts(StatusCode.T_EC_ORDER_R_UPDATE_FAILED));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return ecShippingTagDataOutputDto;
	}

	/**
	 * Ec送り状データでCSVファイル作成処理
	 *
	 * @param outputDto
	 * @param exportData Ec送り状データ
	 * @param csvName CSVファイル名称
	 * @param exportCharsets 文字コード
	 * @throws IOException
	 */
	private void getFile(OutputDto outputDto, List<SortedMap<Integer, Object>> exportData, String csvName, String exportCharsets) throws IOException {

		//プロパティファイルの内容取得
		ServletContext context = this.getServletContext();

		String extName = ".csv";
		String downloadTempFileNm = null;

		File tempDir = FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(context.getContextPath()));

		File tempFile = null;

		while (downloadTempFileNm == null) {
			downloadTempFileNm = UUID.randomUUID().toString();
			tempFile = new File(tempDir, downloadTempFileNm + extName);
			if (tempFile.exists()) {
				downloadTempFileNm = null;
			}
		}

		ICsvListWriter listWriter = null;
		try {

			// 出力ファイルを作成
			String fileName = tempFile.getPath();
			FileOutputStream fos = new FileOutputStream(fileName, false);

			// [ON推-品向-791] 文字コードをマスタから設定 2015.04.22 kawana Start
			// [C-CWMS-0026] 文字コードの初期値設定箇所を変更 2015.05.20 kawana Start
			if (CU.isNullOrEmpty(exportCharsets)) {
				exportCharsets = "MS932";
			}
			// [C-CWMS-0026] 文字コードの初期値設定箇所を変更 2015.05.20 kawana End
			if (StandardCharsets.UTF_8.name().toLowerCase().equals(exportCharsets.toLowerCase())) {
				// BOM付与
				fos.write(0xef);
				fos.write(0xbb);
				fos.write(0xbf);
				fos.flush();
			}

			OutputStreamWriter fileWriter = new OutputStreamWriter(fos, exportCharsets);
			// [ON推-品向-791] 文字コードをマスタから設定 2015.04.22 kawana End
			listWriter = new CsvListWriter(fileWriter, CsvPreference.STANDARD_PREFERENCE);

			for (SortedMap<Integer, Object> csvData : exportData) {

				listWriter.write(csvData.values().toArray());
			}

			// [ON推-品向-791] 例外のcatchを削除 2015.04.22 kawana
		} finally {
			if (listWriter != null) {
				try {
					listWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		String mimeType = "text/comma-separated-values";
		String downloadFileNm = csvName;

		outputDto.output.downloadUrl = context.getContextPath() + BaseConst.APP_RESOURCE_PATH + BaseConst.DOWNLOAD_RESOURCE_PATH + "/"
				+ URLEncoder.encode(downloadFileNm, StandardCharsets.UTF_8.name()) + extName + "?"
				+ BaseConst.DOWNLOAD_FILE_NAME + "=" + downloadTempFileNm + extName + "&" + BaseConst.DOWNLOAD_MIME_TYPE + "=" + URLEncoder.encode(mimeType, StandardCharsets.UTF_8.name());

		// [ON推-品向-791] 例外のcatchを削除 2015.04.22 kawana
	}

	// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo Start
	/**
	 * <h2>送付先住所変更。</h2>
	 * <pre>
	 * 送付先住所変更処理を行い、完了メッセージを設定する
	 * </pre>
	 * @param ecShippingTagDataOutputDto EC送り状データ出力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(EcShippingTagDataOutputDto ecShippingTagDataOutputDto) {
		// Entity変換
		TEcOrderHDtoMapper headerMapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> bodyList = headerMapper.mappingToEntityList(ecShippingTagDataOutputDto.data.list);
		TEcOrderH ecOrderH = new TEcOrderH();
		if (bodyList != null) {
			if (bodyList.size() > 0) {
				ecOrderH = bodyList.get(0);
			}
		}
		// 住所変更処理を行う
		ecDelivAddressModifyLogic.update(ecOrderH, errRetSts(StatusCode.DELIV_ADDRESS_MODIFID_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;

	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * データチェックは結果で判定。
	 * </pre>
	 * @param ecShippingTagDataOutputDto EC送り状データ出力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(EcShippingTagDataOutputDto ecShippingTagDataOutputDto, ErrorStatus errSts) {
		ResultSetupData resultStatus = setupInputCheck(ecShippingTagDataOutputDto, errRetSts(StatusCode.DELIV_ADDRESS_MODIFID_ERROR));

		switch (resultStatus) {
		case DELIV_ADDRESS_MODIFID_ERROR:
			this.getErrorManager().add(errRetSts(StatusCode.DELIV_ADDRESS_MODIFID_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			break;
		case ALL_OK:
			break;
		default:
			break;
		}
		return null;
	}

	/**
	 * <h2>排他チェック。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * </pre>
	 * @param ecShippingTagDataOutputDto EC送り状データ出力画面用DTO
	 * @return ResultSetupData 処理結果
	 */
	private ResultSetupData setupInputCheck(EcShippingTagDataOutputDto ecShippingTagDataOutputDto, ErrorStatus errSts) {
		boolean isOk = false;
		// Entity変換
		TEcOrderHDtoMapper headerMapper = new TEcOrderHDtoMapper();
		List<TEcOrderH> bodyList = headerMapper.mappingToEntityList(ecShippingTagDataOutputDto.data.list);

		for (TEcOrderH ecOrderH : bodyList) {
			// 排他チェック処理
			isOk = ecDelivAddressModifyLogic.updateCheck(ecOrderH, errRetSts(StatusCode.DELIV_ADDRESS_MODIFID_ERROR));
		}
		// 結果の設定
		ResultSetupData resultStatus;
		if (!isOk) {
			resultStatus = ResultSetupData.DELIV_ADDRESS_MODIFID_ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		return resultStatus;
	}
	// [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo End
}
