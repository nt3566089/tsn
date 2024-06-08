package com.oneslogi.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.customize.SqlPickingListRePrintDto;
import com.oneslogi.base.dbflute.dtomapper.TTrsolistDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlPickingListRePrintDtoMapper;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListRePrint;
import com.oneslogi.base.dto.OutputDto.OutputData;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.BondedPickingListDto;
import com.oneslogi.wms.dto.report.PalletDtlFractionDto;
import com.oneslogi.wms.dto.report.PalleteDtlSingleDto;
import com.oneslogi.wms.dto.report.ShippingLoadingListDto;
import com.oneslogi.wms.dto.report.SortingPlaceIncomingInspecListDto;
import com.oneslogi.wms.dto.shipping.PickingListRePrintDto;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.BondedPickingListPrintLogic;
import com.oneslogi.wms.logic.shipping.PalletDtlFractionPrintLogic;
import com.oneslogi.wms.logic.shipping.PalleteDtlSinglePrintLogic;
import com.oneslogi.wms.logic.shipping.PickingListRePrintSelectLogic;
import com.oneslogi.wms.logic.shipping.PickingListRePrintUpdateLogic;
import com.oneslogi.wms.logic.shipping.ShippingLoadingListPrintLogic;
import com.oneslogi.wms.logic.shipping.SortingPlaceIncomingInspecListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

@Path("/shipping/pickingListRePrint")
public class PickingListRePrintResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	private static final String BONDED_PICKING_LIST_REPORT_CD = "BondedPickingList";
	private static final String PALLETE_DTL_SINGLE_REPORT_CD = "PalleteDtlSingle";
	private static final String PALLET_DTL_FRACTION_REPORT_CD = "PalletDtlFraction";
	private static final String SORTING_PLACE_INCOMING_INSPEC_LIST_REPORT_CD = "SortingPlaceIncomingInspecList";
	private static final String SHIPPING_LOADING_LIST_REPORT_CD = "ShippingLoadingList";

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
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 該当データ無し
		 */
		protected static final int SVF_CALL_ERROR = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private PrintLogic printLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PickingListRePrintSelectLogic selectLogic;
	@Inject
	private PickingListRePrintUpdateLogic updateLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private BondedPickingListPrintLogic bondedPickingListPrintLogic;
	@Inject
	private PalleteDtlSinglePrintLogic palleteDtlSinglePrintLogic;
	@Inject
	private PalletDtlFractionPrintLogic palletDtlFractionPrintLogic;
	@Inject
	private SortingPlaceIncomingInspecListPrintLogic sortingPlaceIncomingInspecListPrintLogic;
	@Inject
	private ShippingLoadingListPrintLogic shippingLoadingListPrintLogic;

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return PickingListRePrintDto 保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/init")
	public PickingListRePrintDto init() {

		PickingListRePrintDto result = new PickingListRePrintDto();

		// 発行帳票を指定
		result.data.prmBondedPickingListDto.printBasicData.reportId = reportLogic.getReportId(BONDED_PICKING_LIST_REPORT_CD);
		result.data.prmPalleteDtlSingleDto.printBasicData.reportId = reportLogic.getReportId(PALLETE_DTL_SINGLE_REPORT_CD);
		result.data.prmPalletDtlFractionDto.printBasicData.reportId = reportLogic.getReportId(PALLET_DTL_FRACTION_REPORT_CD);
		result.data.prmSortingPlaceIncomingInspecListDto.printBasicData.reportId = reportLogic.getReportId(SORTING_PLACE_INCOMING_INSPEC_LIST_REPORT_CD);
		result.data.prmShippingLoadingListDto.printBasicData.reportId = reportLogic.getReportId(SHIPPING_LOADING_LIST_REPORT_CD);

		return result;
	}

	/**
	 * <h2>保税出庫関連リスト再出力一覧データ検索処理</h2>
	 * <pre>
	 * 画面で入力された検索条件を元に保税出庫関連リスト再出力一覧データを取得する。
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto 保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/search")
	public PickingListRePrintDto search(PickingListRePrintDto pickingListRePrintDto) {
		return searchByOutsideSql(pickingListRePrintDto);
	}

	protected PickingListRePrintDto searchByOutsideSql(PickingListRePrintDto pickingListRePrintDto) {

		PickingListRePrintDto result = new PickingListRePrintDto();

		// Entity変換
		TTrsolistDtoMapper headerMapper = new TTrsolistDtoMapper();
		final TTrsolist header = headerMapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 保税出庫関連リスト再出力一覧取得用
		PagingResultBean<SqlPickingListRePrint> page = selectLogic.select(header, pickingListRePrintDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return result;
		}
		// Dto変換処理
		SqlPickingListRePrintDtoMapper mapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrintDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		result.paging = pickingListRePrintDto.paging;

		result.data.list = list;

		return result;
	}

	/**
	 * <h2>保税出庫関連リスト再出力印刷チェック</h2>
	 * <pre>
	 * 画面で選択された情報を元に発行可否チェックを行う。
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return StatusDto
	 */
	@POST
	@Path("/checkPrint")
	public StatusDto checkPrint(PickingListRePrintDto pickingListRePrintDto) {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// 印刷チェック
		selectLogic.checkPrint(header, bodyList, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		return null;
	}

	/**
	 * <h2>棚出リスト出力</h2>
	 * <pre>
	 * 棚出リスト発行対象データ取得・発行処理を行う
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/printBondedPickingList")
	public PickingListRePrintDto printBondedPickingList(PickingListRePrintDto pickingListRePrintDto) throws Exception {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		TTrsolist update = new TTrsolist();
		update.setControlNo(controlNo);

		// コントロールNo.更新処理
		int updateCount = updateLogic.setControlNo(header, bodyList, update, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (updateCount > 0) {

			// 印刷対象データ取得
			List<BondedPickingListDto> bondedPickingListDtoList = bondedPickingListPrintLogic.selectPrintData(update, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 印刷実行
			pickingListRePrintDto.data.prmBondedPickingListDto.output = 
					execBondedPickingListPrint(pickingListRePrintDto.data.prmBondedPickingListDto, 
							bondedPickingListDtoList, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// コントロールNo.クリア
		updateLogic.clearControlNo(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 完了メッセージ表示
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListRePrintDto;

	}

	/**
	 * <h2>棚出リスト帳票発行処理</h2>
	 * <pre>
	 * 棚出リストの帳票発行処理を行う
	 * </pre>
	 * @param PrintParamDto
	 * @param List<BondedPickingListDto>
	 * @param ErrorStatus
	 * @return PrintParamDto
	 */
	private OutputData execBondedPickingListPrint(PrintParamDto pp, List<BondedPickingListDto> printDtoList, ErrorStatus errSts) throws Exception {

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// 棚出リストを発行
		pp.printBasicData.outputData = json.format(printDtoList);
		printLogic.print(pp);

		return pp.output;

	}

	/**
	 * <h2>パレット明細(単品)出力</h2>
	 * <pre>
	 * パレット明細(単品)発行対象データ取得・発行処理を行う
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/printPalleteDtlSingle")
	public PickingListRePrintDto printPalleteDtlSingle(PickingListRePrintDto pickingListRePrintDto) throws Exception {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		TTrsolist update = new TTrsolist();
		update.setControlNo(controlNo);

		// コントロールNo.更新処理
		int updateCount = updateLogic.setControlNo(header, bodyList, update, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (updateCount > 0) {

			// 印刷対象データ取得
			List<PalleteDtlSingleDto> palleteDtlSingleDtoList = palleteDtlSinglePrintLogic.selectPrintData(update, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 印刷実行
			pickingListRePrintDto.data.prmPalleteDtlSingleDto.output = 
					execPalleteDtlSinglePrint(pickingListRePrintDto.data.prmPalleteDtlSingleDto, 
							palleteDtlSingleDtoList, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// コントロールNo.クリア
		updateLogic.clearControlNo(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 完了メッセージ表示
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListRePrintDto;

	}

	/**
	 * <h2>パレット明細(単品)帳票発行処理</h2>
	 * <pre>
	 * パレット明細(単品)の帳票発行処理を行う
	 * </pre>
	 * @param PrintParamDto
	 * @param List<PalleteDtlSingleDto>
	 * @param ErrorStatus
	 * @return PrintParamDto
	 */
	private OutputData execPalleteDtlSinglePrint(PrintParamDto pp, List<PalleteDtlSingleDto> printDtoList, ErrorStatus errSts) throws Exception {

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// パレット明細(単品)を発行
		pp.printBasicData.outputData = json.format(printDtoList);
		printLogic.print(pp);

		return pp.output;

	}

	/**
	 * <h2>パレット明細(端数)出力</h2>
	 * <pre>
	 * パレット明細(端数)発行対象データ取得・発行処理を行う
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/printPalletDtlFraction")
	public PickingListRePrintDto printPalletDtlFraction(PickingListRePrintDto pickingListRePrintDto) throws Exception {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		TTrsolist update = new TTrsolist();
		update.setControlNo(controlNo);

		// コントロールNo.更新処理
		int updateCount = updateLogic.setControlNo(header, bodyList, update, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (updateCount > 0) {

			// 印刷対象データ取得
			List<PalletDtlFractionDto> palletDtlFractionDtoList = palletDtlFractionPrintLogic.selectPrintData(update, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 印刷実行
			pickingListRePrintDto.data.prmPalletDtlFractionDto.output = 
					execPalletDtlFractionPrint(pickingListRePrintDto.data.prmPalletDtlFractionDto, 
							palletDtlFractionDtoList, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// コントロールNo.クリア
		updateLogic.clearControlNo(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 完了メッセージ表示
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListRePrintDto;

	}

	/**
	 * <h2>パレット明細(端数)帳票発行処理</h2>
	 * <pre>
	 * パレット明細(端数)の帳票発行処理を行う
	 * </pre>
	 * @param PrintParamDto
	 * @param List<PalletDtlFractionDto>
	 * @param ErrorStatus
	 * @return PrintParamDto
	 */
	private OutputData execPalletDtlFractionPrint(PrintParamDto pp, List<PalletDtlFractionDto> printDtoList, ErrorStatus errSts) throws Exception {

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// パレット明細(端数)を発行
		pp.printBasicData.outputData = json.format(printDtoList);
		printLogic.print(pp);

		return pp.output;

	}

	/**
	 * <h2>仕分場受入検品リスト出力</h2>
	 * <pre>
	 * 仕分場受入検品リスト発行対象データ取得・発行処理を行う
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/printSortingPlaceIncomingInspecList")
	public PickingListRePrintDto printSortingPlaceIncomingInspecList(PickingListRePrintDto pickingListRePrintDto) throws Exception {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		TTrsolist update = new TTrsolist();
		update.setControlNo(controlNo);

		// コントロールNo.更新処理
		int updateCount = updateLogic.setControlNo(header, bodyList, update, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (updateCount > 0) {

			// 印刷対象データ取得
			List<SortingPlaceIncomingInspecListDto> sortingPlaceIncomingInspecListDtoList = sortingPlaceIncomingInspecListPrintLogic.selectPrintData(update, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 印刷実行
			pickingListRePrintDto.data.prmSortingPlaceIncomingInspecListDto.output = 
					execSortingPlaceIncomingInspecListPrint(pickingListRePrintDto.data.prmSortingPlaceIncomingInspecListDto, 
							sortingPlaceIncomingInspecListDtoList, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// コントロールNo.クリア
		updateLogic.clearControlNo(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 完了メッセージ表示
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListRePrintDto;

	}

	/**
	 * <h2>仕分場受入検品リスト帳票発行処理</h2>
	 * <pre>
	 * 仕分場受入検品リストの帳票発行処理を行う
	 * </pre>
	 * @param PrintParamDto
	 * @param List<SortingPlaceIncomingInspecListDto>
	 * @param ErrorStatus
	 * @return PrintParamDto
	 */
	private OutputData execSortingPlaceIncomingInspecListPrint(PrintParamDto pp, List<SortingPlaceIncomingInspecListDto> printDtoList, ErrorStatus errSts) throws Exception {

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// 仕分場受入検品リストを発行
		pp.printBasicData.outputData = json.format(printDtoList);
		printLogic.print(pp);

		return pp.output;

	}

	/**
	 * <h2>積込リスト出力</h2>
	 * <pre>
	 * 積込リスト発行対象データ取得・発行処理を行う
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 */
	@GET
	@Path("/printShippingLoadingList")
	public PickingListRePrintDto printShippingLoadingList(PickingListRePrintDto pickingListRePrintDto) throws Exception {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		TTrsolist update = new TTrsolist();
		update.setControlNo(controlNo);

		// コントロールNo.更新処理
		int updateCount = updateLogic.setControlNo(header, bodyList, update, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (updateCount > 0) {

			// 印刷対象データ取得
			List<ShippingLoadingListDto> shippingLoadingListDtoList = shippingLoadingListPrintLogic.selectPrintData(update, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

			// 印刷実行
			pickingListRePrintDto.data.prmShippingLoadingListDto.output = 
					execShippingLoadingListPrint(pickingListRePrintDto.data.prmShippingLoadingListDto, 
							shippingLoadingListDtoList, errRetSts(StatusCode.NOT_FOUND_DATA));
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// コントロールNo.クリア
		updateLogic.clearControlNo(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 完了メッセージ表示
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListRePrintDto;

	}

	/**
	 * <h2>積込リスト帳票発行処理</h2>
	 * <pre>
	 * 積込リストの帳票発行処理を行う
	 * </pre>
	 * @param PrintParamDto
	 * @param List<ShippingLoadingListDto>
	 * @param ErrorStatus
	 * @return PrintParamDto
	 */
	private OutputData execShippingLoadingListPrint(PrintParamDto pp, List<ShippingLoadingListDto> printDtoList, ErrorStatus errSts) throws Exception {

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		// 積込リストを発行
		pp.printBasicData.outputData = json.format(printDtoList);
		printLogic.print(pp);

		return pp.output;

	}

	/**
	 * <h2>パレット内個体情報コード一覧</h2>
	 * <pre>
	 *  SVF定義作成(パレット内個体情報コード一覧)を呼び出す
	 * </pre>
	 * @param PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 * @return PickingListRePrintDto  保税出庫関連リスト再出力画面用DTO
	 */
	@POST
	@Path("/palletSymbol")
	public PickingListRePrintDto palletSymbol(PickingListRePrintDto pickingListRePrintDto) throws Exception {

		// Entity変換
		TTrsolistDtoMapper mapper = new TTrsolistDtoMapper();
		final TTrsolist header = mapper.mappingToEntity(pickingListRePrintDto.data.search);

		// 明細部Entity変換
		SqlPickingListRePrintDtoMapper bodyMapper = new SqlPickingListRePrintDtoMapper();
		List<SqlPickingListRePrint> bodyList = bodyMapper.mappingToEntityList(pickingListRePrintDto.data.list);

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		TTrsolist update = new TTrsolist();
		update.setControlNo(controlNo);

		// コントロールNo.更新処理
		int updateCount = updateLogic.setControlNo(header, bodyList, update, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		if (updateCount > 0) {

			// SVF定義作成(パレット内個体情報コード一覧)を呼び出す
			//[TSN］共通処理未作成 2024.04.17 K.SATO [S]
			//CreateSvfDefinePalletInfoList.setPalletInfoListDataMaking(header.getCenterCd(), header.getClientCd(), controlNo, errRetSts(StatusCode.SVF_CALL_ERROR));
			//[TSN］共通処理未作成 2024.04.17 K.SATO [E]
			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null;
			}

		}

		// コントロールNo.クリア
		updateLogic.clearControlNo(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 完了メッセージ表示
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListRePrintDto;

	}
}
