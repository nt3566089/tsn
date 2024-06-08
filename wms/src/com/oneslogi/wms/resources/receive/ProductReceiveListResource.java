package com.oneslogi.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.exception.ReportOverSafetySizeException;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ProductReceiveListDto;
import com.oneslogi.wms.dto.receive.ReceivePlanListPrintDto;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.receive.ProductLabelPrintLogic;
import com.oneslogi.wms.logic.receive.ReceiveListToProductSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.resources.receive.SlipNoReceiveListResource.ResultSetupPrintData;

/**
 * 商品別入荷一覧画面のリソースクラス。
 */
@Path("/receive/ProductReceiveList")
public class ProductReceiveListResource extends AbstractWmsResource {

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
	private static final String REPORT_CD = "ProductLabel";
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End

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
		 * 商品別入荷一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
		/**
		 * 削除データのチェック異常
		 */
		protected static final int CHECK_DELETE_FAILED = 3;
		/**
		 * エラーデータのチェック異常
		 */
		protected static final int CHECK_ERROR_DATA_FAILED = 4;
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_FAILED = 5;
		/**
		 * 更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 6;
		/**
		 * 商品ラベル異常
		 */
		protected static final int PRODUCT_LABEL_FAILED = 7;
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveListToProductSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private ProductLabelPrintLogic productLabelPrintLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ProductReceiveListDto 商品別入荷一覧画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ProductReceiveListDto initNew() {

		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
//		return new ProductReceiveListDto();
		// 発行帳票を指定
		ProductReceiveListDto productReceiveListDto = new ProductReceiveListDto();
		productReceiveListDto.data.test.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		return productReceiveListDto;
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
	}

	/**
	 * <h2>商品別入荷一覧データ取得</h2>
	 * <pre>
	 * ・画面で入力されたCDを元にIDを取得し、商品別入荷一覧データ取得
	 * </pre>
	 * @param productReceiveListDto 商品別入荷一覧画面用DTO
	 * @return ProductReceiveListDto 商品別入荷一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public ProductReceiveListDto search(ProductReceiveListDto productReceiveListDto) {

		ProductReceiveListDto resultProductReceiveListDto = new ProductReceiveListDto();

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final TReceivePlanH header = headerMapper.mappingToEntity(productReceiveListDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		header.setClientId(mClient.getClientId());

		//センタID取得
		String centerCd = header.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		header.setCenterId(mCenter.getCenterId());

		//倉庫ID
		String warehouseCd = header.getPlanWarehouseCd();
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setWarehouseCd(warehouseCd);
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		if (!CU.isNullOrEmpty(warehouseCd)) {
			if (mWarehouse == null) {
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
		}

		TStoreRecordB body = new TStoreRecordB();
		body.setStoreDtFrom(header.getStoreDtFrom());
		body.setStoreDtTo(header.getStoreDtTo());

		TReceivePlanB tReceivePlanB = new TReceivePlanB();
		tReceivePlanB.setProductCd(header.getProductCd());
		tReceivePlanB.setPlanClientOrderNo(header.getClientOrderNo());
		if (mWarehouse != null)
		{
			tReceivePlanB.setPlanWarehouseId(mWarehouse.getWarehouseId());
		}

		//商品別入荷一覧データ取得(検索)メソッドを呼出し
		resultProductReceiveListDto = this.searchData(header, body, tReceivePlanB, productReceiveListDto.paging);

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		return resultProductReceiveListDto;
	}

	/**
	 * <h2>商品別入荷一覧データ取得(検索)</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・商品別入荷一覧データ取得
	 * </pre>
	 * @param header 入荷予定ヘッダ
	 * @param recordBody 入庫実績ボディ
	 * @param planBody 入荷予定ボディ
	 * @return ProductReceiveListDto 商品別入荷一覧画面用DTO
	 */
	protected ProductReceiveListDto searchData(TReceivePlanH header, TStoreRecordB recordBody, TReceivePlanB planBody, PagingData paging) {

		ProductReceiveListDto resultProductReceiveListDto = new ProductReceiveListDto();

		//商品別入荷一覧データ取得(検索)メソッドを呼出し
		PagingResultBean<TReceivePlanB> page = selectLogic.select(header, planBody, recordBody, paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// 該当データ無し
		if (page.size() == 0) {
			return resultProductReceiveListDto;
		}

//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		// 進捗率計算用
//		ProductReceiveListDto.ProgressData progressData = new ProductReceiveListDto.ProgressData();
//		// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana Start
//		// 進捗用に全件取得
//		List<TReceivePlanB> progressDataList = selectLogic.selectForProgress(header, planBody, recordBody, errRetSts(StatusCode.NOT_FOUND_DATA));
//
//		//エラーが存在する場合
//		if (getErrorManager().size() > 0) {
//			return resultProductReceiveListDto;
//		}
//
//		//進捗率計算
//		for (TReceivePlanB b : progressDataList) {
//			// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana End
//
//			//[SK2-031] 出庫指示一覧画面と不一致。2014.12.11 KI Start
//			if (b.isReceiveStatus$90()) {
//				continue;
//			}
//			//[SK2-031] 出庫指示一覧画面と不一致。2014.12.11 KI End
//			progressData.allCount += 1;
//			if (b.isReceiveStatus$01()) {
//				progressData.nonReceiveCount += 1;
//			} else if (b.isReceiveStatus$02()) {
//				progressData.receivingCount += 1;
//			} else if (b.isReceiveStatus$03()) {
//				progressData.storedCount += 1;
//			}
//		}
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

		// Dto変換処理
		TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanBDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultProductReceiveListDto.paging = paging;
		// ===== 画面用DTO ボディの作成 =====
		for (TReceivePlanBDto selectBody : list) {
			resultProductReceiveListDto.data.list.add(ProductReceiveListDto.chaseTReceivePlanBDto(selectBody));
		}
//		resultProductReceiveListDto.data.list = list;
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		resultProductReceiveListDto.data.progress = progressData;
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

		return resultProductReceiveListDto;
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
		/**
		 * <h2>入力チェック（商品ラベル）</h2>
		 * <pre>
		 * ・商品ラベル発行データのチェックを行う
		 * </pre>
		 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
		 * @return StatusDto 処理結果DTO
		 */
		@POST
		@Path("/inputCheckProductLabel")
		public StatusDto inputCheckProductLabel(ProductReceiveListDto productReceiveListDto) {

			//商品ラベル発行チェックメソッドを呼出し
			productLabelCheck(productReceiveListDto);

			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理終了
				return null;
			}

			return null;
		}

		/**
		 * <h2>・商品ラベル発行</h2>
		 * <pre>
		 * ・商品ラベル発行チェックを行う
		 * ・エラーがない場合は、・商品ラベル発行画面へ遷移
		 * </pre>
		 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
		 * @return StatusDto 処理結果DTO
		 */
		@GET
		@Path("/productLabel")
		public StatusDto productLabel(ProductReceiveListDto productReceiveListDto) {

			//商品ラベル発行チェックメソッドを呼出し
			productLabelCheck(productReceiveListDto);

			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理終了
				return null;
			}

			return null;

		}

		/**
		 * <h2>商品ラベル発行チェック</h2>
		 * <pre>
		 * ・商品ラベルデータを取得
		 * ・以下のチェックを行う
		 * ・ 削除データのチェック
		 * ・ エラーデータのチェック
		 *
		 * ・戻り値を下記のように設定する
		 * ・チェックエラー : 削除データのチェック異常、エラーデータのチェック異常
		 * ・チェック正常 : 正常
		 * </pre>
		 * @param slipNoReceiveListDto 伝票別入荷一覧画面用DTO
		 * @return ResultSetupPrintData 処理結果
		 */
		@GET
		@Path("/productLabelCheck")
		public ResultSetupPrintData productLabelCheck(ProductReceiveListDto productReceiveListDto) {

			// Entity変換
			TReceivePlanBDtoMapper headerMapper = new TReceivePlanBDtoMapper();
			final List<TReceivePlanB> list = headerMapper.mappingToEntityList(productReceiveListDto.data.list);

			for (TReceivePlanB head : list) {

				//削除フラグ="1"の場合
				if (head.isDelFlg$1()) {
					getErrorManager().add(errRetSts(StatusCode.CHECK_DELETE_FAILED), WmsMessageConst.DELETED_DATA_CANNOT_OUTPUT_ERROR);
					return ResultSetupPrintData.ERROR;
				}
				//エラーフラグ="1"の場合
				if (head.isErrorFlg$1()) {
					getErrorManager().add(errRetSts(StatusCode.CHECK_ERROR_DATA_FAILED), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
					return ResultSetupPrintData.ERROR;
				}
				//入荷ステータスが「03：入荷済」以外のデータがあった場合
				if (!head.isReceiveStatus$03()){
					getErrorManager().add(errRetSts(StatusCode.PRODUCT_LABEL_FAILED), WmsMessageConst.PRODUCT_LABEL_CANNOT_OUTPUT_NOT_RECEIVE_COMPLETED_ERROR);
					return ResultSetupPrintData.ERROR;
				}
			}

			return ResultSetupPrintData.ALL_OK;
		}

		/**
		 * <h2>商品ラベル発行。</h2>
		 * <pre>
		 * コントロールNo.を更新してから、商品ラベル帳票データ更新を取得する
		 * 帳票を発行する
		 * エラーがない場合は、データベースに商品ラベル帳票データ更新を更新する
		 * </pre>
		 * @param dtoList 商品ラベル発行画面用DTO
		 * @return receivePlanListPrintDto 処理結果DTO
		 */
		@GET
		@Path("/productLabelPrint")
		public ReceivePlanListPrintDto productLabelPrint(final List<ReceivePlanListPrintDto> dtoList) throws Exception {

			// コントロールNo.を採番（ロジッククラスを呼ぶ）
			Long controlNo = numberingCenterLogic.getControlNo();
			//荷主センタ変更対応 201７.02.24 sja Start
			MCenter mcenetr = new MCenter();
			//荷主センタ変更対応 201７.02.24 sja End

			for (ReceivePlanListPrintDto dto : dtoList) {
				// 発行帳票を指定
				dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
				// Entity変換
				TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
				TReceivePlanB entity = mapper.mappingToEntity(dto.data.search);

				// コントロールNo更新
				TReceivePlanR update = new TReceivePlanR();

				TReceivePlanH header = new TReceivePlanH();

				TReceivePlanB body = new TReceivePlanB();

				TReceivePlanR report = new TReceivePlanR();

				//エンティティ編集
				update.setControlNo(controlNo);

				//センタID取得
				String centerCd = entity.getTReceivePlanH().getMCenter().getCenterCd();

				MCenter mCenter = new MCenter();

				mCenter.setCenterCd(centerCd);

				mCenter = centerLogic.getUkEntity(mCenter);

				header.setCenterId(mCenter.getCenterId());
				header.setCenterId(dto.data.search.getTReceivePlanH().getMCenter().getCenterId());

				//荷主センタ変更対応 201７.02.24 sja Start
				mcenetr = mCenter;
				//荷主センタ変更対応 201７.02.24 sja End

				//荷主ID取得
				String clientCd = entity.getTReceivePlanH().getMClient().getClientCd();

				MClient mClient = new MClient();

				mClient.setClientCd(clientCd);

				mClient = clientLogic.getUkEntity(mClient);

				header.setClientId(mClient.getClientId());
				header.setClientId(dto.data.search.getTReceivePlanH().getMClient().getClientId());
				//入荷予定ヘッダID
				header.setReceivePlanHId(entity.getTReceivePlanH().getReceivePlanHId());

				// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
				productLabelPrintLogic.updateControlNo(update, header, body, report, errRetSts(StatusCode.UPDATE_EXCEPTION));
			}

			// 商品ラベル帳票(検索用)
			TReceivePlanR tReceivePlanR = new TReceivePlanR();
			tReceivePlanR.setControlNo(controlNo);

			// 商品ラベル発行データ取得メソッドを呼出し
			//荷主センタ変更対応 201７.02.24 sja Start
//			List<TStoreRecordB> tStoreRecordBList = productLabelPrintLogic.select(tReceivePlanR,errRetSts(StatusCode.NOT_FOUND_DATA));
			List<TStoreRecordB> tStoreRecordBList = productLabelPrintLogic.select(tReceivePlanR,mcenetr, errRetSts(StatusCode.NOT_FOUND_DATA));
			//荷主センタ変更対応 201７.02.24 sja End
			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理終了
				return null;
			}
			// JSON通信のためにSimpleDTO変換
			TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper();
			List<TStoreRecordBDto> selectDto = mapper.mappingToDtoList(tStoreRecordBList);

			// パラメータマスタデータを取得
			MClientCenter mClientCenter = new MClientCenter();
			if (selectDto.get(0).getTStoreRecordH().getClientId() != null && selectDto.get(0).getTStoreRecordH().getCenterId() != null) {
				mClientCenter.setClientId(selectDto.get(0).getTStoreRecordH().getClientId());
				mClientCenter.setCenterId(selectDto.get(0).getTStoreRecordH().getCenterId());
			} else {
				mClientCenter.setClientId(dtoList.get(0).data.search.getTReceivePlanH().getClientId());
				mClientCenter.setCenterId(dtoList.get(0).data.search.getTReceivePlanH().getCenterId());
			}

			MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

			if (tStoreRecordBList == null) {
				return null;
			}

			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
			MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
			MParamDtoMapper mParamDtoMapper = new MParamDtoMapper();
			MParamDto mParamDto = mParamDtoMapper.mappingToDto(mParam);

			// 帳票出力データ取得処理
			List<ProductLabelDto> dataList = new ArrayList<ProductLabelDto>();
			for (TStoreRecordB tStoreRecordB : tStoreRecordBList) {

				ProductLabelDto redto = new ProductLabelDto();

				// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start

				// 商品ラベル情報取得
				MProductDto mProductDto = mProductDtoMapper.mappingToDto(tStoreRecordB.chaseTReceivePlanB().chaseMProduct());
				redto = productLabelLogic.getProductLabelDto(mProductDto, mParamDto);
				redto.cultureId = getCultureId();

				// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana Start
				// 出力枚数取得
				long outCnt = productLabelLogic.getOutNum(tStoreRecordB.chaseTReceivePlanB().getProductId(), tStoreRecordB.getStoreNum(), mParamDto);
				// [#358] 商品ラベル発行時に致命的エラー、枚数の計算を修正 2016.12.09 kawana End

				for (int i = 1; i <= outCnt; i++) {
					dataList.add(redto);
				}

				// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

			}
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

			// [#1700] 商品ラベル発行のデータ件数に対して上限を設定 2017.04.20 kawana Start

			// 発行件数 上限チェック
			final int allowQueryCountToReport = getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT);
			if (allowQueryCountToReport < dataList.size()) {

				// 件数上限エラー
				throw new ReportOverSafetySizeException("The report size is over the specified safety size.", allowQueryCountToReport);
			}

			// [#1700] 商品ラベル発行のデータ件数に対して上限を設定 2017.04.20 kawana End

			// 帳票発行処理
			JSON json = new JSON();
			json.setSuppressNull(true);

			// 商品ラベル帳票を発行する
			dtoList.get(0).printBasicData.outputData = json.format(dataList);
			printLogic.print(dtoList.get(0));

			ReceivePlanListPrintDto receivePlanListPrintDto = new ReceivePlanListPrintDto();
			receivePlanListPrintDto.output = dtoList.get(0).output;

			TReceivePlanR tr = new TReceivePlanR();
			//商品ラベル帳票更新
			tr.setControlNo(null);

			// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
			productLabelPrintLogic.updateRplOutFlg(tr, tReceivePlanR, errRetSts(StatusCode.UPDATE_EXCEPTION));

			getInfoManager().add(new InfoStatus(StatusCode.SUCCESS),
					WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
			return receivePlanListPrintDto;
		}
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End

}
