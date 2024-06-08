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
import com.oneslogi.base.dbflute.exentity.EProductShape;
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
import com.oneslogi.wms.dto.master.ProductShapeMasterBulkInputDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.ProductShapeMasterBulkInputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品荷姿マスタデータ機能に対するリソースクラス。
 */
@Path("/master/productShapeMasterBulkInput")
public class ProductShapeMasterBulkInputResource extends AbstractWmsResource {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.14 honma start

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
		protected static final int PRODUCT_SHAPE_MASTER_REGISTER_FAILED = 5;
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
		protected static final int ERROR_DATA_EXIST_ERROR = 12;

		/**
		 * データの取り込み中にエラーが発生しました。
		 */
		protected static final int EXCEL_FILE_UPLOAD_FAILED = -1;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductShapeMasterBulkInputLogic productShapeMasterBulkInputLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ProductShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ProductShapeMasterBulkInputDto initNew() {

		// 画面用DTO作成
		ProductShapeMasterBulkInputDto dto = new ProductShapeMasterBulkInputDto();
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
		return dto;
	}

	/**
	 * <h2>商品荷姿マスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return ProductShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ProductShapeMasterBulkInputDto fileUpload(MultipartFormDataInput input
		, @QueryParam("clientCd") String clientCd
		, @QueryParam("chkErrorShow") String chkErrorShow
		, @QueryParam("errorProcessMet") String errorProcessMet) throws Exception {

		// 画面用DTO作成
		ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto = new ProductShapeMasterBulkInputDto();

		// 荷主CD
		productShapeMasterBulkInputDto.data.head.getMClient().setClientCd(clientCd);
		// エラーのみ表示
		productShapeMasterBulkInputDto.data.head.setChkErrorShow(chkErrorShow);
		// エラー処理方法
		productShapeMasterBulkInputDto.data.head.setErrorProcessMet(errorProcessMet);

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(productShapeMasterBulkInputDto, param);
			rows += conv.getUploadRows();
		}

		//荷主センタ変更対応 2017.02.24 sja Start
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		//荷主センタ変更対応 2017.02.24 sja End
		// [Ver3.0] unit of measure対応 2017.12.13 NING Del

		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		productShapeMasterBulkInputDto.data.receiveCd = receiveCd;

		// 登録データ作成
//		MClient mClient = new MClient();
//		mClient.setClientCd(clientCd);
//		mClient = clientLogic.getUkEntity(mClient);

		List<EProductShape> eProductShapeList = productShapeMasterBulkInputLogic.convertEProductShape(mClient, productShapeMasterBulkInputDto.data.productShapeMaster, receiveCd);

		// データ登録
		try {
			productShapeMasterBulkInputLogic.batchInsertEProductShape(eProductShapeList);
		} catch (Exception e) {
			e.printStackTrace();
			getInfoManager().clear();
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(errRetSts(StatusCode.EXCEL_FILE_UPLOAD_FAILED), WmsMessageConst.FILE_UPLOAD_SET_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return new ProductShapeMasterBulkInputDto();
		}

		// エラーチェック
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		productShapeMasterBulkInputLogic.checkError(receiveCd, mClient);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return productShapeMasterBulkInputDto;
	}

	/**
	 * <h2>取込データ検索処理。</h2>
	 * <pre>
	 * 取込データを検索する。
	 * </pre>
	 * @param productShapeMasterBulkInputDto 商品荷姿マスタ一括取込画面用DTO
	 * @return productShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ProductShapeMasterBulkInputDto search(ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto) {

		// 受信CD
		String receiveCd = productShapeMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productShapeMasterBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		ProductShapeMasterBulkInputLogic.SelectCls cls = ProductShapeMasterBulkInputLogic.SelectCls.ALL;
		if (CU.nullToStr(header.getChkErrorShow()).equals("1")) {
			cls = ProductShapeMasterBulkInputLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		List<MProductShapeDto> productShapeList =
				productShapeMasterBulkInputLogic.selectAndConvertEProductShapeList(receiveCd, mClient, productShapeMasterBulkInputDto.paging, cls);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		// 画面DTOに設定
		productShapeMasterBulkInputDto.data.productShapeMaster = productShapeList;

		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		productShapeMasterBulkInputDto.data.dataCount = productShapeMasterBulkInputLogic.getEProductShapeCount(receiveCd, mClient);
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		return productShapeMasterBulkInputDto;
	}

	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータを検索し存在する場合はエラーを登録する。
	 * </pre>
	 * @param productShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 * @return StatusDto ステータスDTO
	 */
	@GET
	@Path("/checkExistError")
	public StatusDto checkExistError(ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto) {

		// 受信CD
		String receiveCd = productShapeMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productShapeMasterBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		// エラーデータ検索実行
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		List<MProductShapeDto> productShapeList = productShapeMasterBulkInputLogic.selectAndConvertEProductShapeList(receiveCd, mClient, ProductShapeMasterBulkInputLogic.SelectCls.ERROR_ONLY);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		if (0 < productShapeList.size()) {
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
	 * @param productShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 * @param errSts エラーステータス
	 * @return ProductShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 */
	@GET
	@Path("/excelOutput")
	public ProductShapeMasterBulkInputDto excelOutput(ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto, ErrorStatus errSts) throws IOException {

		// 受信CD
		String receiveCd = productShapeMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productShapeMasterBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		// 取込データ全件検索実行 画面DTOに設定
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		productShapeMasterBulkInputDto.data.productShapeMaster = productShapeMasterBulkInputLogic.selectAndConvertEProductShapeList(receiveCd, mClient, ProductShapeMasterBulkInputLogic.SelectCls.ALL);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		productShapeMasterBulkInputDto.data.head = productMapper.mappingToDto(header);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION);

		return productShapeMasterBulkInputDto;
	}

	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
	/**
	 * <h2>登録時の関係マスタチェック処理.</h2>
	 * <pre>
	 * 正常データに対して登録時の関係マスタエラーチェック処理を行う。
	 * </pre>
	 * @param productShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 * @return ProductShapeMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 */
	@POST
	@Path("/checkErrorMaster")
	public ProductShapeMasterBulkInputDto checkErrorMaster(ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto) {

		// 受信CD
		String receiveCd = productShapeMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productShapeMasterBulkInputDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 関係マスタチェック処理実行
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		int masterErrorCount = productShapeMasterBulkInputLogic.checkErrorMaster(receiveCd, mClient);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		productShapeMasterBulkInputDto.data.errorCount = masterErrorCount;

		return productShapeMasterBulkInputDto;
	}
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

	/**
	 * <h2>商品荷姿マスタ登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに商品荷姿マスタを登録し、完了メッセージを設定する
	 * </pre>
	 * @param productShapeMasterBulkInputDto 商品荷姿マスタ画面用DTO
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto, ErrorStatus errSts) {

		// 受信CD
		String receiveCd = productShapeMasterBulkInputDto.data.receiveCd;
		if (CU.isNullOrEmpty(receiveCd)) {
			return null;
		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
		// 登録時の関係マスタチェックエラー件数取得
		int masterErrorCount = productShapeMasterBulkInputDto.data.errorCount;
//		MProductDtoMapper productMapper = new MProductDtoMapper();
//		MProduct header = productMapper.mappingToEntity(productShapeMasterBulkInputDto.data.head);
//
//		//荷主ID取得
//		String clientCd = header.getMClient().getClientCd();
//		MClient mClient = new MClient();
//		mClient.setClientCd(clientCd);
//		mClient = clientLogic.getUkEntity(mClient);
//
//		int errorCount = productShapeMasterBulkInputLogic.checkErrorMaster(receiveCd, mClient, productShapeMasterBulkInputDto.data.pieceShapeCd);
//		//[ON推-1.1.4-CT-088]CT指摘の修正対応 2016.06.08 chou Add Start
//		if ("0".equals(productShapeMasterBulkInputDto.data.head.getErrorProcessMet())) {//エラー処理方法が「0：全て取込まない」の場合
//			// [2.1.0-CT-005]バグ対応修正 2016.11.04 honma Mod Start
//			if (0 < errorCount) {//エラーありの場合
//			// [2.1.0-CT-005]バグ対応修正 2016.11.04 honma Mod End
//				getErrorManager().add(errRetSts(StatusCode.ERROR_DATA_EXIST_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
//				return null;
//			}
//		}
//		//[ON推-1.1.4-CT-088]CT指摘の修正対応 2016.06.08 chou Add End
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		productShapeMasterBulkInputLogic.register(productShapeMasterBulkInputDto, errRetSts(StatusCode.PRODUCT_SHAPE_MASTER_REGISTER_FAILED));
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

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.14 honma end

}
