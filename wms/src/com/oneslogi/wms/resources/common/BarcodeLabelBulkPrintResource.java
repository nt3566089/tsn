package com.oneslogi.wms.resources.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.EBarcodeLabelDto;
import com.oneslogi.base.dbflute.dtomapper.EBarcodeLabelDtoMapper;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.EBarcodeLabel;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.common.BarcodeLabelBulkPrintDto;
import com.oneslogi.wms.dto.common.BarcodeLabelPrintDto;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.BarcodeLabelBulkPrintLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * バーコードラベル一括出力機能に対するリソースクラス。
 */
@Path("/common/barcodeLabelBulkPrint")
public class BarcodeLabelBulkPrintResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	private static final String REPORT_CD = "BarcodeLabel";

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
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 2;
		/**
		 * データの取り込み中にエラーが発生しました。
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private BarcodeLabelBulkPrintLogic barcodeLabelBulkPrintLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private MessageLogic messageLogic;

	// [Ver3.0][#4007] 定数の削除 2018.04.20 shimizu Start

	/**
	 * <h2>初期処理を行う。</h2>
	 * <pre>
	 * 画面用のDTOを作成する。
	 * 画面用DTOに発行する帳票IDを設定する。
	 * </pre>
	 * @return BarcodeLabelBulkPrintDto バーコードラベル一括出力画面用DTO
	 */
	@GET
	@Path("/init")
	public BarcodeLabelBulkPrintDto initNew() {

		// 画面用DTO作成
		BarcodeLabelBulkPrintDto barcodeLabelBulkPrintDto = new BarcodeLabelBulkPrintDto();

		// 発行帳票を指定
		barcodeLabelBulkPrintDto.data.reportData.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return barcodeLabelBulkPrintDto;
	}

	/**
	 * <h2>バーコードラベル一括出力処理を行う。</h2>
	 * <pre>
	 * アップロードデータ取得し、以下のチェックを行う。
	 * ・バーコード：必須チェック、正規表現(半角英数字・記号)チェック
	 * ・出力枚数  ：必須チェック、正規表現（数字）チェック
	 * 取得したデータをバーコードラベル受信テーブルに登録する。
	 *
	 * 【ステータスCDとステータス内容】
	 *   0:正常終了
	 *   12:データの取り込み中にエラーが発生しました。
	 * </pre>
	 * @param input アップロードデータ
	 * @param barcodeType バーコード種別
	 * @param startBit スタートビット
	 * @param endBit エンドビット
	 * @param chkErrorShow エラーのみ表示
	 * @param errorProcessMet エラー処理方法
	 * @return BarcodeLabelBulkPrintDto バーコードラベル一括出力画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public BarcodeLabelBulkPrintDto fileUpload(MultipartFormDataInput input
			, @QueryParam("barcodeType") String barcodeType
			, @QueryParam("startBit") String startBit
			, @QueryParam("endBit") String endBit
			, @QueryParam("chkErrorShow") String chkErrorShow
			, @QueryParam("errorProcessMet") String errorProcessMet
			) throws Exception {

		// 画面用DTO作成
		BarcodeLabelBulkPrintDto barcodeLabelBulkPrintDto = new BarcodeLabelBulkPrintDto();
		// バーコードタイプ
		barcodeLabelBulkPrintDto.data.head.setBarcodeType(barcodeType);
		// スタートビット
		barcodeLabelBulkPrintDto.data.head.setStartBit(startBit);
		// エンドビット
		barcodeLabelBulkPrintDto.data.head.setEndBit(endBit);
		// エラーのみ表示
		barcodeLabelBulkPrintDto.data.head.setChkErrorShow(chkErrorShow);
		// エラー処理方法
		barcodeLabelBulkPrintDto.data.head.setErrorProcessMet(errorProcessMet);
		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(barcodeLabelBulkPrintDto, param);
			rows += conv.getUploadRows();
		}

		long row = 0L;

		// 受信ID
		long receiveId = Long.parseLong(numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_ID));
		barcodeLabelBulkPrintDto.data.head.setReceiveId(receiveId);

		// バーコードラベル受信テーブル
		EBarcodeLabel eBarcodeLabel = null;

		List<EBarcodeLabel> eBarcodeLabelList = new ArrayList<>();

		try {
			// Excelデータを繰返して、整合性チェックを行う。
			for (EBarcodeLabelDto body : barcodeLabelBulkPrintDto.data.body) {

				row++;

				eBarcodeLabel = new EBarcodeLabel();

				// バーコードラベル情報を設定する
				setBarcodeLabelInfo(eBarcodeLabel, receiveId, row, body);

				eBarcodeLabelList.add(eBarcodeLabel);

				// バーコード
				if (CU.isNullOrEmpty(eBarcodeLabel.getBarcode())) {
					// 必須
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.BARCODE_NOT_INPUT_ERROR);
					continue;
				}
				if (!checkExcelCellInput("^[!-~]*$", eBarcodeLabel.getBarcode())) {
					// 英数字と記号
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.BARCODE_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR);
					continue;
				}
				// [Ver3.0][#4007] エラーチェックの追加 2018.04.20 shimizu Start
				if (!checkExcelCellInput(".{1,100}$", eBarcodeLabel.getBarcode())) {
					// 長さエラー
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.BARCODE_CHECK_INPUT_MAX_ERROR);
					continue;
				}

				// [Ver3.0][#4007] エラーチェックの不備修正 2018.04.26 shimizu Start
				// バーコード名称
				if(!CU.isNullOrEmpty(eBarcodeLabel.getBarcodeNm())) {
					if (!checkExcelCellInput(".{1,100}$", eBarcodeLabel.getBarcodeNm())) {
						// 長さエラー
						eBarcodeLabel.setErrorFlg("1");
						eBarcodeLabel.setErrorMessageCd(WmsMessageConst.BARCODE_NM_CHECK_INPUT_MAX_ERROR);
						continue;
					}
				}

				// 備考
				if(!CU.isNullOrEmpty(eBarcodeLabel.getBarcodeLabelComment())) {
					if (!checkExcelCellInput(".{1,100}$", eBarcodeLabel.getBarcodeLabelComment())) {
						// 長さエラー
						eBarcodeLabel.setErrorFlg("1");
						eBarcodeLabel.setErrorMessageCd(WmsMessageConst.COMMENT_CHECK_INPUT_MAX_ERROR);
						continue;
					}
				}
				// [Ver3.0][#4007] エラーチェックの不備修正 2018.04.26 shimizu End
				// [Ver3.0][#4007] エラーチェックの追加 2018.04.20 shimizu End

				// 出力枚数
				if (CU.isNullOrEmpty(eBarcodeLabel.getOutputCnt())) {
					// 必須
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.OUTPUT_CNT_NOT_INPUT_ERROR);
					continue;
				}
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", eBarcodeLabel.getOutputCnt())) {
					// 文字エラー
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.OUTPUT_CNT_CHECK_NUMERIC_ONLY_ERROR);
					continue;
				}
				// [Ver3.0][#4007] エラーチェックの追加 2018.04.20 shimizu Start
				if(!checkExcelCellInput("^(-)?[0-9]{1,2}+(\\.\\d+)?$", eBarcodeLabel.getOutputCnt())) {
					// 整数2桁以下
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.OUTPUT_CNT_CHECK_INPUT_MAX_ERROR);
					continue;
				}
				if (!checkExcelCellInput("^(-)?\\d+$", eBarcodeLabel.getOutputCnt())) {
					// 小数不可
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.OUTPUT_CNT_CHECK_INPUT_DECIMAL_ERROR);
					continue;
				}
				if (Long.parseLong(eBarcodeLabel.getOutputCnt()) < 1) {
					// 最小1以上
					eBarcodeLabel.setErrorFlg("1");
					eBarcodeLabel.setErrorMessageCd(WmsMessageConst.OUTPUT_CNT_INPUT_REQUEST_MIN_IS_ONE_ERROR);
					continue;
				}
				// [Ver3.0][#4007] エラーチェックの追加 2018.04.20 shimizu End
			}

			// バーコードラベル受信テーブルに登録する。
			barcodeLabelBulkPrintLogic.batchInsert(eBarcodeLabelList);

			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

			// Excelデータをクライアントへ返却する（ただし、クライアント側では未使用）
			barcodeLabelBulkPrintDto.data.body = new ArrayList<EBarcodeLabelDto>();

			return barcodeLabelBulkPrintDto;

		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new BarcodeLabelBulkPrintDto();
		}
	}

	/**
	 * 正規表現処理方法。
	 *
	 */
	private boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	/**
	 * <h2>Excel出力処理を行う。/h2>
	 * <pre>
	 * バーコードラベル受信テーブルからデータを取得する。
	 * 取得したデータをExcelに出力する。
	 *
	 * 【ステータスCDとステータス内容】
	 *   0:正常終了
	 * </pre>
	 * @param barcodeLabelBulkPrintDto バーコードラベル一括出力画面用DTO
	 * @param errSts エラーステータス
	 * @return BarcodeLabelBulkPrintDto バーコードラベル一括出力画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public BarcodeLabelBulkPrintDto excelOutput(BarcodeLabelBulkPrintDto barcodeLabelBulkPrintDto, ErrorStatus errSts) throws IOException {

		// Entity変換
		EBarcodeLabelDtoMapper mapper = new EBarcodeLabelDtoMapper();
		EBarcodeLabel eBarcodeLabel = mapper.mappingToEntity(barcodeLabelBulkPrintDto.data.head);

		// バーコードラベル受信テーブルからデータを取得する。
		List<EBarcodeLabel> eBarcodeLabelList = barcodeLabelBulkPrintLogic.getBarcodeLabelList(eBarcodeLabel, null, 0);

		barcodeLabelBulkPrintDto.data.body = mapper.mappingToDtoList(eBarcodeLabelList);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return barcodeLabelBulkPrintDto;
	}

	/**
	 * バーコードラベル受信情報を設定する。
	 *
	 * @param eBarcodeLabel バーコードラベル受信テーブル
	 * @param receiveId 受信ID
	 * @param row 受信行ID
	 * @param eBarcodeLabelDto
	 */
	private void setBarcodeLabelInfo(EBarcodeLabel eBarcodeLabel, Long receiveId, Long row, EBarcodeLabelDto eBarcodeLabelDto) {

		// 受信ID
		eBarcodeLabel.setReceiveId(receiveId);
		// 受信行ID
		eBarcodeLabel.setReceiveRowId(row);
		// 取込みフラグ
		eBarcodeLabel.setImportFlg("0");
		// エラーフラグ
		eBarcodeLabel.setErrorFlg("0");

		// バーコード
		eBarcodeLabel.setBarcode(eBarcodeLabelDto.getBarcode());
		// バーコード名称
		eBarcodeLabel.setBarcodeNm(eBarcodeLabelDto.getBarcodeNm());
		// 備考
		eBarcodeLabel.setBarcodeLabelComment(eBarcodeLabelDto.getBarcodeLabelComment());
		// 出力枚数
		eBarcodeLabel.setOutputCnt(eBarcodeLabelDto.getOutputCnt());
	}

	/**
	 * <h2>検索処理を行う。</h2>
	 * <pre>
	 * バーコードラベル受信テーブルからデータを取得する。
	 * メッセージマスタからエラーメッセージ名称を取得する。
	 * 取得したデータをバーコードラベル一括出力画面用DTOに設定する。
	 * </pre>
	 * @param inputDto バーコードラベル一括出力画面用DTO
	 * @return BarcodeLabelBulkPrintDto バーコードラベル一括出力画面用DTO
	 */
	@GET
	@Path("/search")
	public BarcodeLabelBulkPrintDto search(BarcodeLabelBulkPrintDto inputDto) throws IOException {

		// Entity変換
		EBarcodeLabelDtoMapper mapper = new EBarcodeLabelDtoMapper();
		EBarcodeLabel eBarcodeLabel = mapper.mappingToEntity(inputDto.data.head);

		List<EBarcodeLabel> eBarcodeLabelList = barcodeLabelBulkPrintLogic.getBarcodeLabelList(eBarcodeLabel,inputDto.paging, 0);

		// エラーメッセージ名称取得、設定
		for (EBarcodeLabel entity : eBarcodeLabelList){
			BMessage message = new BMessage();
			message.setMessageCd(entity.getErrorMessageCd());
			message = messageLogic.getUkEntity(message);
			if (message != null) {
				entity.setErrorMessageNm(message.getMessageNm());
			}
		}

		List<EBarcodeLabelDto> eBarcodeLabelDto = mapper.mappingToDtoList(eBarcodeLabelList);

		BarcodeLabelBulkPrintDto barcodeLabelBulkPrintDto = new BarcodeLabelBulkPrintDto();

		barcodeLabelBulkPrintDto.paging = inputDto.paging;
		barcodeLabelBulkPrintDto.data.head = inputDto.data.head;
		barcodeLabelBulkPrintDto.data.body = eBarcodeLabelDto;

		return barcodeLabelBulkPrintDto;
	}

	/**
	 * <h2>出力前チェック処理を行う。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・出力対象存在チェック
	 *
	 * 【ステータスCDとステータス内容】
	 *   2:入力チェック異常
	 * </pre>
	 * @param printDto バーコードラベル一括出力画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@GET
	@Path("/check")
	public StatusDto check(final BarcodeLabelPrintDto printDto) {

		// Entity変換
		EBarcodeLabelDtoMapper mapper = new EBarcodeLabelDtoMapper();
		EBarcodeLabel eBarcodeLabel = mapper.mappingToEntity(printDto.data.head);

		// エラー対象抽出
		EBarcodeLabel checkEntity = mapper.mappingToEntity(printDto.data.head);
		checkEntity.setChkErrorShow("1");
		List<EBarcodeLabel> eBarcodeLabelList = barcodeLabelBulkPrintLogic.getBarcodeLabelList(checkEntity, null, 0);

		// 「エラー処理方法：全て取り込まない」の場合、エラー対象があれば処理中止。
		if ("0".equals(printDto.data.head.getErrorProcessMet()) && eBarcodeLabelList.size() > 0) {
			this.getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出力対象抽出
		eBarcodeLabelList = barcodeLabelBulkPrintLogic.getBarcodeLabelList(eBarcodeLabel, null, 1);

		// 正常データが無い場合は処理中止。
		if (eBarcodeLabelList.size() < 1){
			this.getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return null;
	}

	/**
	 * <h2>バーコードラベル発行データを取得する。</h2>
	 * <pre>
	 * 画面用DTOの作成。
	 * データベースからバーコードラベル発行データを取得する。
	 *
	 * 【ステータスCDとステータス内容】
	 *   0:正常終了
	 * </pre>
	 * @param printDto バーコードラベル発行画面用DTO
	 * @return BarcodeLabelPrintDto バーコードラベル出力用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public BarcodeLabelPrintDto print(final BarcodeLabelPrintDto printDto) throws Exception {

		// Entity変換
		EBarcodeLabelDtoMapper mapper = new EBarcodeLabelDtoMapper();
		EBarcodeLabel eBarcodeLabel = mapper.mappingToEntity(printDto.data.head);

		// 出力対象抽出
		List<EBarcodeLabel> eBarcodeLabelList = barcodeLabelBulkPrintLogic.getBarcodeLabelList(eBarcodeLabel, null, 1);

		// 発行帳票を指定
		printDto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// 帳票出力データ取得処理（商品ラベルのレイアウト使用）
		List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();

		for (EBarcodeLabel body : eBarcodeLabelList) {

			ProductLabelDto redto = new ProductLabelDto();
			redto.cultureId = getCultureId();
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #256]対応修正 2016.11.14 nayzaw Start
			// バーコード種別
			if (eBarcodeLabel.getBarcodeType().equals("JAN")) {
				// バーコード種別がJANの場合
				if (body.getBarcode().length() <= 8) {
					redto.setProductLabelBarcode(eBarcodeLabel.getBarcodeType() + "8");
				} else {
					redto.setProductLabelBarcode(eBarcodeLabel.getBarcodeType() + "13");
				}
			}else{
				// バーコード種別がJAN以外の場合
				redto.setProductLabelBarcode(eBarcodeLabel.getBarcodeType());
			}
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #256]対応修正 2016.11.14 nayzaw End

			// バーコード（表示用コード値）
			redto.setProductCd(body.getBarcode());
			// バーコード
			redto.setProductCdBar(eBarcodeLabel.getStartBit() + CU.nullToStr(body.getBarcode()) + eBarcodeLabel.getEndBit());
			// バーコード名称
			redto.setProductNm(body.getBarcodeNm());
			// バーコード備考
			redto.setProductBiko(body.getBarcodeLabelComment());

			int outCnt = Integer.parseInt(body.getOutputCnt());

			for(int i = 1 ; i <= outCnt ; i++ ){
				retList.add(redto);
			}
		}

		// 帳票発行処理
		JSON json = new JSON();

		json.setSuppressNull(true);

		printDto.printBasicData.outputData = json.format(retList);

		printLogic.print(printDto);

		//バーコードラベル発行の取得
		BarcodeLabelPrintDto barcodeLabelPrintDto = new BarcodeLabelPrintDto();
		barcodeLabelPrintDto.output = printDto.output;

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return barcodeLabelPrintDto;
	}
}
