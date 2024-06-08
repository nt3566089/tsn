package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.exception.ReportOverSafetySizeException;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.dto.master.ProductMasterLabelPrintDto;
import com.oneslogi.wms.dto.master.ProductMasterListDto;
import com.oneslogi.wms.dto.receive.ProductLabelPrintDto;
import com.oneslogi.wms.dto.report.ProductLabelDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductLabelLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.master.ProductMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品マスタメンテナンス(一覧)画面のリソースクラス。
 */
@Path("/master/productMasterList")
public class ProductMasterListResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
	private static final String REPORT_CD = "ProductLabel";
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End

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
		 * 商品マスタメンテナンス(一覧)データ取得異常
		 */
		protected static final int PRODUCT_MASTER_SELECT_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductMasterSelectLogic productMasterSelectLogic;
	@Inject
	private ClientLogic clientLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
	@Inject
	private ProductLabelLogic productLabelLogic;
	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・商品マスタメンテナンス(一覧)画面用DTOの作成
	 * </pre>
	 * @return ProductMasterListDto 商品マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public ProductMasterListDto init() {

		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
//		return new ProductMasterListDto();

		ProductMasterListDto productMasterListDto = new ProductMasterListDto();

		// 発行帳票を指定
		productMasterListDto.data.reportData.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return productMasterListDto;
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End
	}

	/**
	 * <h2>商品マスタメンテナンス(一覧)データ取得</h2>
	 * <pre>
	 * ・データベースに商品マスタメンテナンス(一覧)データを取得する
	 * </pre>
	 * @param productMasterListDto 商品マスタメンテナンス(一覧)画面用DTO
	 * @return ProductMasterListDto 商品マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/search")
	public ProductMasterListDto search(ProductMasterListDto productMasterListDto) throws IOException {

		ProductMasterListDto productDto = new ProductMasterListDto();

		// 商品マスタメンテナンス(一覧)データ取得の検索データ編集
		MProductDtoMapper headerMapper = new MProductDtoMapper();
		MProduct header = headerMapper.mappingToEntity(productMasterListDto.data.head);

		// マスタ検索で必要なIDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		header.setClientId(clientId);

		// 商品マスタメンテナンス(一覧)データ取得
		PagingResultBean<MProduct> page = productMasterSelectLogic.selectByConditions(header, productMasterListDto.paging, errRetSts(StatusCode.PRODUCT_MASTER_SELECT_FAILED));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// JSON通信のためにSimpleDTO変換
		List<MProductDto> list = headerMapper.mappingToDtoList(page);

		// [Ver3.0] unit of measure対応 2017.11.22 潘 Del

		// 検索結果詰込処理
		productDto.data.body = list;
		productDto.paging = productMasterListDto.paging;

		return productDto;
	}

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
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
	@Path("/print")
	public ProductLabelPrintDto print(final ProductMasterLabelPrintDto printDto) throws Exception {

		// Entity変換
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MParamDtoMapper mParamDtoMapper = new MParamDtoMapper();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
//		MProduct mProduct = mapper.mappingToEntity(printDto.data.search);
		List<MProduct> mProductList = new ArrayList<MProduct>();
		MProduct mProduct = new MProduct();
		for (int i = 0;i < printDto.data.searchList.size(); i++){
			mProduct = mProductDtoMapper.mappingToEntity(printDto.data.searchList.get(i));
			mProductList.add(mProduct);
		}
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End

		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MCenter mCenter = centerMapper.mappingToEntity(printDto.data.center);
		// 出力枚数
		Long outCnt  = printDto.data.labelOutputCnt ;

		// 発行帳票を指定
		printDto.printBasicData.reportId  = reportLogic.getReportId(REPORT_CD);

		// パラメータマスタデータを取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mProduct.getClientId());
		mClientCenter.setCenterId(mCenter.getCenterId());

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		MParamDto mParamDto = mParamDtoMapper.mappingToDto(mParam);

		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		List<ProductLabelDto> retList = new ArrayList<ProductLabelDto>();
		for (int j = 0;j < mProductList.size(); j++){
			mProduct = mProductList.get(j);
			// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
			//帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
			List<MProduct> list = productMasterSelectLogic.selectReportInfo(mProduct, errRetSts(StatusCode.PRODUCT_MASTER_SELECT_FAILED));

			// 該当データ無し
			if (list == null) {
				return null;
			}

			// 帳票出力データ取得処理
			ProductLabelDto redto = new ProductLabelDto();

			// 商品ラベル情報取得
			MProductDto mProductDto = mProductDtoMapper.mappingToDto(mProduct);
			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start
			redto = productLabelLogic.getProductLabelDto(mProductDto, mParamDto);
			// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End
			redto.cultureId = getCultureId();

			for(int i = 1 ; i <= outCnt ; i++ ){
				retList.add(redto);
			}
			// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		}
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

		// [#1700] 商品ラベル発行のデータ件数に対して上限を設定 2017.04.20 kawana Start

		// 発行件数 上限チェック
		final int allowQueryCountToReport = getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT);
		if (allowQueryCountToReport < retList.size()) {

			// 件数上限エラー
			throw new ReportOverSafetySizeException("The report size is over the specified safety size.", allowQueryCountToReport);
		}

		// [#1700] 商品ラベル発行のデータ件数に対して上限を設定 2017.04.20 kawana End


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
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
}
