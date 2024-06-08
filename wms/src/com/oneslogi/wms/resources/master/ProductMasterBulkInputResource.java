package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.EProduct;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.master.ProductMasterBulkInputDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.ProductMasterBulkInputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品マスタ取込機能に対するリソースクラス。
 */
@Path("/master/productMasterBulkInput")
public class ProductMasterBulkInputResource extends AbstractWmsResource {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.09 honma start
	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
		/**
		 * 登録異常
		 */
		protected static final int PRODUCT_MASTER_REGISTER_FAILED = 4;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		/**
		 * warn
		 */
		protected static final int WARN_INFORMATION = 11;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		/**
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 17;

		/**
		 * データの取り込み中にエラーが発生しました
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductMasterBulkInputLogic productMasterBulkInputLogic;

	@Inject
	private ClientLogic clientLogic;

	// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
	@Inject
	private NumberingCenterLogic numberingLogic;
	// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ProductMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ProductMasterBulkInputDto initNew() {

		// 画面用DTO作成
		ProductMasterBulkInputDto dto = new ProductMasterBulkInputDto();

		return dto;
	}

	/**
	 * <h2>商品マスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成
	 * </pre>
	 * @param input アップロードデータ
	 * @return ProductMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ProductMasterBulkInputDto fileUpload(MultipartFormDataInput input
		, @QueryParam("clientCd") String clientCd
		, @QueryParam("chkErrorShow") String chkErrorShow
		, @QueryParam("errorProcessMet") String errorProcessMet) throws Exception {

		// 画面用DTO作成
		ProductMasterBulkInputDto productMasterBulkInputDto = new ProductMasterBulkInputDto();

		// 荷主CD
		productMasterBulkInputDto.data.head.getMClient().setClientCd(clientCd);
		// エラーのみ表示
		productMasterBulkInputDto.data.head.setChkErrorShow(chkErrorShow);
		// エラー処理方法
		productMasterBulkInputDto.data.head.setErrorProcessMet(errorProcessMet);

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(productMasterBulkInputDto, param);
			rows += conv.getUploadRows();
		}

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		productMasterBulkInputDto.data.receiveCd = receiveCd;

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		// 荷主ID
		productMasterBulkInputDto.data.head.setClientId(mClient.getClientId());

		// 登録データ作成
		List<EProduct> eProductList = productMasterBulkInputLogic.convertEProduct(mClient, productMasterBulkInputDto.data.productMaster, receiveCd);

		// データ登録
		try {
			productMasterBulkInputLogic.batchInsertEProduct(eProductList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new ProductMasterBulkInputDto();
		}

		// エラーチェック
		productMasterBulkInputLogic.checkError(receiveCd, mClient);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));
		return productMasterBulkInputDto;
	}

	/**
	 * <h2>取込データ検索処理。</h2>
	 * <pre>
	 * 取込データを検索する。
	 * </pre>
	 * @param productMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 * @return ProductMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/search")
	public ProductMasterBulkInputDto search(ProductMasterBulkInputDto productMasterBulkInputDto) {

		// 受信CD
		String receiveCd = productMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterBulkInputDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		ProductMasterBulkInputLogic.SelectCls cls = ProductMasterBulkInputLogic.SelectCls.ALL;
		if (CU.nullToStr(header.getChkErrorShow()).equals("1")) {
			cls = ProductMasterBulkInputLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		List<MProductShapeDto> productList =
				productMasterBulkInputLogic.selectAndConvertEProductList(receiveCd, productMasterBulkInputDto.paging, mClient, cls, true);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		// 画面DTOに設定
		productMasterBulkInputDto.data.productMaster = productList;

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		productMasterBulkInputDto.data.dataCount = productMasterBulkInputLogic.getEProductCount(receiveCd, mClient);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		return productMasterBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータを検索し存在する場合はエラーを登録する。
	 * </pre>
	 * @param productMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 * @return StatusDto ステータスDTO
	 */
	@GET
	@Path("/checkExistError")
	public StatusDto checkExistError(ProductMasterBulkInputDto productMasterBulkInputDto) {

		// 受信CD
		String receiveCd = productMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterBulkInputDto.data.head);


		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);


		// エラーデータ検索実行
		List<MProductShapeDto> productList =
				productMasterBulkInputLogic.selectAndConvertEProductList(receiveCd, mClient, ProductMasterBulkInputLogic.SelectCls.ERROR_ONLY);

		if (0 < productList.size()) {
			// エラー有
			getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
			return null;
		}

		return null;
	}

	/**
	 * <h2>Excel出力処理。</h2>
	 * <pre>
	 * Excel出力処理を行う
	 * </pre>
	 * @param productMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 * @param errSts エラーステータス
	 * @return ProductMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public ProductMasterBulkInputDto excelOutput(ProductMasterBulkInputDto productMasterBulkInputDto, ErrorStatus errSts) throws IOException {

		// 受信CD
		String receiveCd = productMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterBulkInputDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取込データ全件検索実行 画面DTOに設定
		productMasterBulkInputDto.data.productMaster =
				productMasterBulkInputLogic.selectAndConvertEProductList(receiveCd, mClient, ProductMasterBulkInputLogic.SelectCls.ALL);
		productMasterBulkInputDto.data.head = productMapper.mappingToDto(header);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return productMasterBulkInputDto;
	}

	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param productMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 * @return ProductMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public ProductMasterBulkInputDto checkErrorMaster(ProductMasterBulkInputDto productMasterBulkInputDto) {

		// 受信CD
		String receiveCd = productMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterBulkInputDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 関係マスタチェック処理実行
		int masterErrorCount = productMasterBulkInputLogic.checkErrorMaster(receiveCd, mClient);
		//データがマスタに存在しないかをチェックして該当データを削除する。
		int checkErrorCount = productMasterBulkInputLogic.checkRemoveNotExistsDataForRegister(productMasterBulkInputDto, receiveCd);
		productMasterBulkInputDto.data.errorCount = masterErrorCount + checkErrorCount;

		return productMasterBulkInputDto;
	}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

	/**
	 * <h2>商品マスタ登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに商品マスタを登録し、完了メッセージを設定する
	 * </pre>
	 * @param productMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ProductMasterBulkInputDto ProductMasterBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = ProductMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = ProductMasterBulkInputDto.data.errorCount;
//		//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.07 chou Add Start
//		//データがマスタに存在しないかをチェックして該当データを削除する。
//		boolean checkResult = productMasterBulkInputLogic.checkRemoveNotExistsDataForRegister(ProductMasterBulkInputDto, receiveCd);
//		if ("0".equals(ProductMasterBulkInputDto.data.head.getErrorProcessMet())) {//エラー処理方法が「0：全て取込まない」の場合
//			//エラーありの場合
//			if (checkResult) {
//				getWarnManager().clear();
//				getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
//				return null;
//			}
//		}
//		//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.07 chou Add End

		productMasterBulkInputLogic.register(ProductMasterBulkInputDto, errRetSts(StatusCode.PRODUCT_MASTER_REGISTER_FAILED));
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		// 警告メッセージ
		if (0 < masterErrorCount) {
			getInfoManager().clear();
			getWarnManager().add(warnRetSts(StatusCode.WARN_INFORMATION), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			return null;
		}
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

		return null;

	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.09 honma end
}
