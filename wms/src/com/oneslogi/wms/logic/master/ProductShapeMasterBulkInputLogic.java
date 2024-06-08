package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlEProductShapeListPmb;
import com.oneslogi.base.dbflute.cbean.EProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDtlDto;
import com.oneslogi.base.dbflute.dto.customize.SqlEProductShapeListDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductShapeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.EProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.EProductShape;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.ProductShapeMasterBulkInputDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProductLogic;

/**
 * 商品荷姿マスタ一括取込取得ロジッククラス
 */
public class ProductShapeMasterBulkInputLogic extends AbstractWmsLogic {

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
	}

	// ===== 使用テーブル =====
	@Inject
	private MProductShapeBhv mProductShapeBhv;

	@Inject
	private MParamBhv mParamBhv;

	@Inject
	private EProductShapeBhv eProductShapeBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private ProductLogic productLogic;

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	@Inject
	private HandyCommonUtil util;
	// [Ver3.0] unit of measure対応 2017.12.14 NING End

	// ===== enum =====

	/** エラーデータ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** エラーデータのみ検索 */
		ERROR_ONLY,
		/** エラー無データのみ検索 */
		NO_ERROR_ONLY
	}

	/** エラー時DB更新有無 */
	private enum DbUpdateForError {
		/** 更新有 */
		TRUE,
		/** 更新無 */
		FALSE
	}

	/** ログ書込 */
	private enum OutputLog {
		/** ログ書込有 */
		TRUE,
		/** ログ書込無 */
		FALSE,
	}

	// ===== 内部変数 =====

	/** ログの書込み有無 */
	private OutputLog outputLog = OutputLog.FALSE;

	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param clientCd 荷主CD
	 */
	public void startLog(String receiveCd, String clientCd) {

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.PRODUCT_SHAPE_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// [#169] メッセージの重複を削除 2016.12.05 kawana Start
		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_PARAMETER_CLIENT_CD_ONLY_INFORMATION, receiveCd, clientCd);
		// [#169] メッセージの重複を削除 2016.12.05 kawana End
	}

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	/**
	 * <h2>ログ追加（エラー情報）</h2>
	 * <pre>
	 * 運用ログのエラーチェック情報出力処理
	 * エラーチェック情報を運用ログに出力する
	 * </pre>
	 * @param processInfo 処理情報
	 * @param replaceValue 差し替え文字列
	 */
	public void addErrorCheckLogDtl(String processInfo, String... replaceValue) {

		if (outputLog == OutputLog.TRUE) {
			// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
			// ログ追加（エラー情報）
			getDatabaseLogger().addErrorLogDtl(processInfo, replaceValue[0], replaceValue[1]);
		}
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	/**
	 * <h2>ログ終了(正常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endSuccessLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（正常終了)
			getDatabaseLogger().endSuccessLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>ログ終了(異常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endFailureLog() {

		if (outputLog == OutputLog.TRUE) {
			// ログ終了（異常終了)
			getDatabaseLogger().endFailureLog();
			outputLog = OutputLog.FALSE;
		}
	}

	/**
	 * <h2>一括登録.</h2>
	 * @param eProductList 一括登録
	 */
	public void batchInsertEProductShape(List<EProductShape> eProductShapeList) {
		eProductShapeBhv.batchInsert(eProductShapeList);
	}

	/**
	 * <h2>一括更新.</h2>
	 * @param eProductList 一括登録
	 */
	public void batchUpdateEProductShape(List<EProductShape> eProductShapeList) {
		eProductShapeBhv.batchUpdate(eProductShapeList);
	}

	/**
	 * <h2>商品荷姿マスタ一括取込取得。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから商品荷姿マスタ一括取込を取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 * (共通処理の削除フラグを見ない版)
	 *
	 * 【データ取得テーブル】
	 * ・商品荷姿マスタ
	 *
	 * 【パラメータの使用項目】
	 *  (商品荷姿マスタ)
	 *  ・荷主ID
	 *  (商品マスタ)
	 *  ・商品CD
	 *  (荷姿マスタ)
	 *  ・荷姿CD
	 * </pre>
	 * @param entity 商品荷姿マスタ
	 * @return MProductShape 商品荷姿マスタデータ
	 */
	public MProductShape getUkEntity(MProductShape entity) {

		List<MProductShape> result = null;
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(false);
		//検索条件設定
		MProductShapeCB cb = mProductShapeBhv.newConditionBean();
		cb.query().queryMProduct().setClientId_Equal(entity.getClientId());
		cb.query().queryMProduct().setProductCd_Equal(entity.chaseMProduct().getProductCd());
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		cb.query().queryMShapeGrpDtl().setShapeGrpDtlId_Equal(entity.getShapeGrpDtlId());
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		result = mProductShapeBhv.selectList(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			return null;
		} else {
		}
		return result.get(0);
	}

	/**
	 * <h2>ピース荷姿CD取得処理。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースからパラメータマスタを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 * (共通処理の削除フラグを見ない版)
	 *
	 * 【データ取得テーブル】
	 * ・パラメータマスタ
	 * ・荷姿マスタ
	 *
	 * 【パラメータの使用項目】
	 *  (荷主センタマスタ)
	 *  ・荷主ID
	 *  ・センタID
	 * </pre>
	 * @param entity 荷主センタマスタ
	 * @return MParam パラメータマスタデータ
	 */
	public MParam getMParam(MClientCenter entity) {

		List<MParam> result = null;
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(false);
		//検索条件設定
		MParamCB cb = mParamBhv.newConditionBean();
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del

		cb.query().queryMClientCenter().setClientId_Equal(entity.getClientId());
		cb.query().queryMClientCenter().setCenterId_Equal(entity.getCenterId());
		result = mParamBhv.selectList(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			return null;
		} else {
		}
		return result.get(0);
	}

	/**
	 * <h2>商品荷姿マスタ受信テーブル検索(商品荷姿マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param mClient 荷主マスタ：荷主ID
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	public List<MProductShapeDto> selectAndConvertEProductShapeList(String receiveCd, MClient mClient, SelectCls cls) {
		return selectAndConvertEProductShapeList(receiveCd, mClient, null, cls);
	// [Ver3.0] unit of measure対応 2017.12.14 NING End
	}

	/**
	 * <h2>取引先マスタ受信テーブル検索(センタ取引先マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param mClient 荷主マスタ：荷主ID
	 * @param paging ページング設定
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	public List<MProductShapeDto> selectAndConvertEProductShapeList(String receiveCd, MClient mClient, PagingData paging, SelectCls cls) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		// 外出しSQLの定義
		String path = EProductShapeBhv.PATH_selectSqlEProductShapeList;

		BsSqlEProductShapeListPmb pmb = new BsSqlEProductShapeListPmb();
		pmb.setClientCd(mClient.getClientCd());
		pmb.setReceiveCd(receiveCd);

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			pmb.setErrorFlg("1");
			break;
		case NO_ERROR_ONLY:
			pmb.setErrorFlg("0");
			break;
		}

		pmb.setImportFlg("0");

		pmb.setCultureId(getCultureId());

		Class<SqlEProductShapeListDto> entityType = SqlEProductShapeListDto.class;

		List<SqlEProductShapeListDto> sqlDtoList;
		if (paging != null) {
			sqlDtoList = super.selectPage(eProductShapeBhv, path, pmb, entityType, paging);
		} else {
			sqlDtoList = super.selectList(eProductShapeBhv, path, pmb, entityType);
		}

		List<MProductShapeDto> result = new ArrayList<>();

		for (SqlEProductShapeListDto sqlDto : sqlDtoList) {
			MProductShapeDto productShapeDto = new MProductShapeDto();
			productShapeDto.setProductShapeRevieceId(sqlDto.getProductShapeId());
			productShapeDto.setLineNo(CU.convertNumberToString(sqlDto.getReceiveRowId()));
			MProductDto mProduct = new MProductDto();
			mProduct.setProductCd(sqlDto.getProductCd());
			mProduct.setProductNm(sqlDto.getProductNm());
			mProduct.setProductId(sqlDto.getProductId());
			productShapeDto.setMProduct(mProduct);

			MShapeDto mShapeDto = new MShapeDto();
			mShapeDto.setShapeCd(sqlDto.getShapeCd());
			if (!CU.isNullOrEmpty(sqlDto.getShapeNm())) {
				mShapeDto.setShapeNm(sqlDto.getShapeCd() + ":" + sqlDto.getShapeNm());
			} else {
				mShapeDto.setShapeNm(sqlDto.getShapeCd());
			}
			mShapeDto.setShapeId(sqlDto.getShapeId());
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			MShapeGrpDtlDto mShapeGrpDtl = new MShapeGrpDtlDto();
			mShapeGrpDtl.setMShape(mShapeDto);
			productShapeDto.setMShapeGrpDtl(mShapeGrpDtl);
			// [Ver3.0][#3642] 最小荷姿の入数に0を埋める処理を削除 2018.02.16 shimizu Start
			productShapeDto.setUnitNum(CU.isNullOrEmpty(sqlDto.getUnitNum()) ? null : Long.parseLong(sqlDto.getUnitNum()));
			// [Ver3.0][#3642] 最小荷姿の入数に0を埋める処理を削除 2018.02.16 shimizu End
			productShapeDto.setLength(CU.isNullOrEmpty(sqlDto.getLength()) ? null : WCC.toBigDecimal(sqlDto.getLength()));
			productShapeDto.setHeight(CU.isNullOrEmpty(sqlDto.getHeight()) ? null : WCC.toBigDecimal(sqlDto.getHeight()));
			productShapeDto.setVolume(CU.isNullOrEmpty(sqlDto.getVolume()) ? null : WCC.toBigDecimal(sqlDto.getVolume()));
			productShapeDto.setWidth(CU.isNullOrEmpty(sqlDto.getWidth()) ? null : WCC.toBigDecimal(sqlDto.getWidth()));
			productShapeDto.setNetWeight(CU.isNullOrEmpty(sqlDto.getNetWeight()) ? null : WCC.toBigDecimal(sqlDto.getNetWeight()));
			productShapeDto.setGrossWeight(CU.isNullOrEmpty(sqlDto.getGrossWeight()) ? null : WCC.toBigDecimal(sqlDto.getGrossWeight()));
			productShapeDto.setErrorFlg(sqlDto.getErrorFlg());
			productShapeDto.setErrorMessageCd(sqlDto.getErrorMessageCd());
			productShapeDto.setErrorMessageNm(sqlDto.getMessageNm());
			result.add(productShapeDto);
		}

		return result;
	}

	/**
	 * <h2>ファイル取込データから商品荷姿マスタ受信テーブルのエンティティに変換.</h2>
	 * @param mClient 荷主マスタ
	 * @param productShapeDtoList 取込商品荷姿マスタリスト
	 * @param receiveCd 設定する受信CD
	 * @return 商品荷姿マスタ受信テーブルのリスト
	 */
	public List<EProductShape> convertEProductShape(MClient mClient, List<MProductShapeDto> productShapeDtoList, String receiveCd) {

		//エンティティに変換
		//一覧項目
		MProductShapeDtoMapper bodyMapper = new MProductShapeDtoMapper();
		List<MProductShape> productShapeList = bodyMapper.mappingToEntityList(productShapeDtoList);

		List<EProductShape> eProductShapeList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < productShapeList.size(); row++) {
			MProductShape data = productShapeList.get(row);
			EProductShape eProductShape = new EProductShape();
			eProductShape.setClientCd(mClient.getClientCd());
			eProductShape.setReceiveRowId(Long.valueOf(row + 1));
			eProductShape.setReceiveCd(receiveCd);
			eProductShape.setImportFlg("0");
			eProductShape.setErrorFlg("0");
			String productCd = data.chaseMProduct().getProductCd();
			eProductShape.setProductCd(productCd);
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			eProductShape.setShapeCd(data.getMShapeGrpDtl().getMShape().getShapeCd());
			// [Ver3.0] unit of measure対応 2017.12.14 NING End
			String unitNum = (data.getUnitNum() == null ? "" : CU.convertNumberToString(data.getUnitNum()));
			eProductShape.setUnitNum(unitNum);
			String length = (data.getLength() == null ? "" : CU.convertNumberToString(data.getLength()));
			eProductShape.setLength(length);
			String width = (data.getWidth() == null ? "" : CU.convertNumberToString(data.getWidth()));
			eProductShape.setWidth(width);
			String height = (data.getHeight() == null ? "" : CU.convertNumberToString(data.getHeight()));
			eProductShape.setHeight(height);
			String volume = (data.getVolume() == null ? "" : CU.convertNumberToString(data.getVolume()));
			eProductShape.setVolume(volume);
			String netWeight = (data.getNetWeight() == null ? "" : CU.convertNumberToString(data.getNetWeight()));
			eProductShape.setNetWeight(netWeight);
			String grossWeight = (data.getGrossWeight() == null ? "" : CU.convertNumberToString(data.getGrossWeight()));
			eProductShape.setGrossWeight(grossWeight);
			eProductShapeList.add(eProductShape);
		}

		return eProductShapeList;
	}

	/**
	 * <h2>商品荷姿マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<EProductShape> selectEProductShapeList(String receiveCd) {

		EProductShapeCB cb = eProductShapeBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eProductShapeBhv.selectList(cb);
	}

	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add Start
	/**
	 * <h2>商品荷姿マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<EProductShape> selectEProductShapeList(String receiveCd, SelectCls cls) {

		EProductShapeCB cb = eProductShapeBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			cb.query().setErrorFlg_Equal("1");
			break;
		case NO_ERROR_ONLY:
			cb.query().setErrorFlg_Equal("0");
			break;
		}

		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eProductShapeBhv.selectList(cb);
	}
	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add End

	/**
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param receiveCd 受信CD
	 * @param mClient 荷姿マスタ
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	public void checkError(String receiveCd, MClient mClient) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<EProductShape> checkProductShapeList = selectEProductShapeList(receiveCd);
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		// 必須、文字数などのチェック
		int errCount = checkError(checkProductShapeList, DbUpdateForError.TRUE, mClient);
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(receiveCd, mClient);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			int count = checkProductShapeList.size();
			int errCountAll = errCount + errCountMaster;
			int normalCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION, String.valueOf(errCountAll), String.valueOf(normalCount));
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eProductShapeList 商品荷姿マスタ受信データリスト
	 * @param doUpdate
	 * @return エラー件数
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	private int checkError(List<EProductShape> eProductShapeList, DbUpdateForError doUpdate, MClient mClient) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		// エラー件数
		int errorCount = 0;

		// [2.1.0-CT-005]バグ対応修正 2016.11.04 honma Mod Start
		for (int i = 0; i < eProductShapeList.size(); i++) {
			EProductShape eProductShape = eProductShapeList.get(i);

			if ("1".equals(eProductShape.getErrorFlg())) {
				continue;
			}
		// [2.1.0-CT-005]バグ対応修正 2016.11.04 honma Mod End

			// ===== 商品CD チェック =====

			String productCd = eProductShape.getProductCd();
			if (CU.isNullOrEmpty(productCd)) {
				// 必須
				updateErrorExecute(eProductShape, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[!-~]*$", productCd)) {
				// 文字エラー
				updateErrorExecute(eProductShape, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", productCd)) {
				// 長さエラー
				updateErrorExecute(eProductShape, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// ===== 荷姿CD チェック =====

			String shapeCd = eProductShape.getShapeCd();
			if (CU.isNullOrEmpty(shapeCd)) {
				// 必須
				updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
			if (!checkExcelCellInput(".{1,30}$", shapeCd)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 入数 チェック =====

			String unitNum = eProductShape.getUnitNum();
			if (CU.isNullOrEmpty(unitNum)) {
				// 必須
				updateErrorExecute(eProductShape, WmsMessageConst.UNIT_NUM_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", unitNum)) {
				// 文字エラー
				updateErrorExecute(eProductShape, WmsMessageConst.UNIT_NUM_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
			// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
			// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
			if (!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", unitNum)) {
				// 整数5桁以内
				updateErrorExecute(eProductShape, WmsMessageConst.UNIT_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^(-)?\\d+$", unitNum)) {
				// 小数0桁以内
				updateErrorExecute(eProductShape, WmsMessageConst.UNIT_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu End
			if (Long.parseLong(unitNum) < 0) {
				// 最小0以上
				updateErrorExecute(eProductShape, WmsMessageConst.UNIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End

			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			//小数有無フラグ取得
			String decimalExistFlg = util.getDecimalExistFlg(productCd, mClient.getClientId());

			if (decimalExistFlg != null) {

				// ===== 縦(mm) チェック =====
				String length = eProductShape.getLength();
				if (!CU.isNullOrEmpty(length)) {
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
					if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", length)) {
						// 文字エラー
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_LENGTH_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", length)) {
						// 整数10桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_LENGTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", length)) {
						// 小数3桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.LENGTH_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
					if (WCC.isNegative(WCC.toBigDecimal(length))) {
						// 最小0以上
						updateErrorExecute(eProductShape, WmsMessageConst.LENGTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod end
				}

				// ===== 横(mm) チェック =====
				String width = eProductShape.getWidth();
				if (!CU.isNullOrEmpty(width)) {
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
					if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", width)) {
						// 文字エラー
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_WIDTH_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", width)) {
						// 整数10桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_WIDTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", width)) {
						// 小数3桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.WIDTH_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
					if (WCC.isNegative(WCC.toBigDecimal(width))) {
						// 最小0以上
						updateErrorExecute(eProductShape, WmsMessageConst.WIDTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== 高さ(mm) チェック =====
				String height = eProductShape.getHeight();
				if (!CU.isNullOrEmpty(height)) {
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
					if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", height)) {
						// 文字エラー
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_HEIGHT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", height)) {
						// 整数10桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_HEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", height)) {
						// 小数3桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.HEIGHT_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
					if (WCC.isNegative(WCC.toBigDecimal(height))) {
						// 最小0以上
						updateErrorExecute(eProductShape, WmsMessageConst.HEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== 容積(mm3) チェック =====

				String volume = eProductShape.getVolume();
				if (!CU.isNullOrEmpty(volume)) {
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
					if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", volume)) {
						// 文字エラー
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_VOLUME_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Add Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", volume)) {
						// 整数10桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_VOLUME_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Add End
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", volume)) {
						// 小数3桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_VOLUME_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu End
					if (WCC.isNegative(WCC.toBigDecimal(volume))) {
						// 最小0以上
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_VOLUME_CHECK_MIN_IS_ZERO_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== 商品重量(g) チェック =====
				String netWeight = eProductShape.getNetWeight();
				if (!CU.isNullOrEmpty(netWeight)) {
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
					if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", netWeight)) {
						// 文字エラー
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", netWeight)) {
						// 整数10桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_NET_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", netWeight)) {
						// 小数3桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.NET_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					if (WCC.isNegative(WCC.toBigDecimal(netWeight))) {
						// 最小0以上
						updateErrorExecute(eProductShape, WmsMessageConst.NET_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== 総重量(g) チェック =====
				String grossWeight = eProductShape.getGrossWeight();
				if (!CU.isNullOrEmpty(grossWeight)) {
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
					if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", grossWeight)) {
						// 文字エラー
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", grossWeight)) {
						// 整数10桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.SHAPE_GROSS_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", grossWeight)) {
						// 小数3桁以内
						updateErrorExecute(eProductShape, WmsMessageConst.GROSS_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [Ver3.0][#3630] 小数フラグ有無に関係なく、少数を許容するように変更 2018.02.15 shimizu Start
					if (WCC.isNegative(WCC.toBigDecimal(grossWeight))) {
						// 最小0以上
						updateErrorExecute(eProductShape, WmsMessageConst.GROSS_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING End

			// ===== 商品CD、荷姿CD重複 チェック =====

			// [2.1.0-CT-005]バグ対応修正 2016.11.04 honma Mod Start
			for (int j = i + 1; j < eProductShapeList.size(); j++) {
				if (productCd.equals(eProductShapeList.get(j).getProductCd())
						&& shapeCd.equals(eProductShapeList.get(j).getShapeCd())) {
					// 重複エラー
					updateErrorExecute(eProductShapeList.get(j), WmsMessageConst.PRODUCT_AND_SHAPE_CODE_DUPLICATE_ERROR, doUpdate);
					eProductShapeList.get(j).setErrorFlg("1");
					errorCount++;
				}
			}
			// [2.1.0-CT-005]バグ対応修正 2016.11.04 honma Mod End

			// エラー無を設定
			updateNormalExecute(eProductShape, doUpdate);
		}

		return errorCount;
	}

	/**
	 * <h2>関連マスタ存在チェック.</h2>
	 * @param receiveCd 受信CD
	 * @return
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	public int checkErrorMaster(String receiveCd, MClient mClient) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		//エンティティに変換
		//一覧項目
		MProductShapeDtoMapper productShapeDtoMapper = new MProductShapeDtoMapper();
		// 商品荷姿マスタ
		MProductShape mProductShape = new MProductShape();

		List<EProductShape> errorEProductShapeList = new ArrayList<>();

		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		List<MProductShapeDto> checkList = selectAndConvertEProductShapeList(receiveCd, mClient, SelectCls.NO_ERROR_ONLY);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		for (MProductShapeDto dto : checkList) {
			if (dto.getMProduct() != null && dto.getMProduct().getProductId() == null) {
				EProductShape eProductShape = eProductShapeBhv.selectByPKValue(dto.getProductShapeRevieceId());
				if (eProductShape != null) {
					eProductShape.setErrorFlg("1");
					eProductShape.setErrorMessageCd(WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
					errorEProductShapeList.add(eProductShape);
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					continue;
				}
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			if (dto.getMShapeGrpDtl().getMShape() != null && !CU.isNullOrEmpty(dto.getMShapeGrpDtl().getMShape().getShapeCd())
					&& dto.getMShapeGrpDtl().getMShape().getShapeCd().equals(dto.getMShapeGrpDtl().getMShape().getShapeNm())) {
				EProductShape eProductShape = eProductShapeBhv.selectByPKValue(dto.getProductShapeRevieceId());
				if (eProductShape != null) {
					eProductShape.setErrorFlg("1");
					//[Ver3.1][#5754] 荷姿マスタチェック時にエラーメッセージが間違っていた問題を修正 2018.12.13 tanaka mod start
					eProductShape.setErrorMessageCd(WmsMessageConst.SHAPE_NOT_FOUND_ERROR);
					//[Ver3.1][#5754] 荷姿マスタチェック時にエラーメッセージが間違っていた問題を修正 2018.12.13 tanaka mod end
					errorEProductShapeList.add(eProductShape);
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					continue;
				}
			}

			// 商品CDにより、既存商品と荷姿グループと荷姿グループ詳細マスタ取得
			MShapeGrp shapeGrp = productLogic.getProductByCd(dto.getMProduct().getProductCd(), mClient.getClientCd());
			// 荷姿グループ明細存在チェック
			boolean isExisted = false;
			List<MShapeGrpDtl> existedProductShapeList = shapeGrp.getMShapeGrpDtlList();
			for (Iterator<MShapeGrpDtl> iterator = existedProductShapeList.iterator(); iterator.hasNext();) {
				MShapeGrpDtl mShapeGrpDtl = iterator.next();
				if (mShapeGrpDtl.getMShape().getShapeCd().equals(dto.getMShapeGrpDtl().getMShape().getShapeCd())) {
					dto.getMShapeGrpDtl().setShapeGrpDtlId(mShapeGrpDtl.getShapeGrpDtlId());
					dto.setShapeGrpDtlId(mShapeGrpDtl.getShapeGrpDtlId());
					isExisted = true;
					break;
				}
			}
			// 荷姿グループ明細不存在
			if (!isExisted) {
				EProductShape eProductShape = eProductShapeBhv.selectByPKValue(dto.getProductShapeRevieceId());
				if (eProductShape != null) {
					eProductShape.setErrorFlg("1");
					eProductShape.setErrorMessageCd(WmsMessageConst.SHAPE_GRP_DTL_NOT_FOUND_ERROR);
					errorEProductShapeList.add(eProductShape);
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
					continue;
				}
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING End

			//商品荷姿マスタをエンティティに変換
			mProductShape = productShapeDtoMapper.mappingToEntity(dto);
			// 商品IDを取得
			MProduct mProduct = new MProduct();
			mProduct.setClientId(mClient.getClientId());
			mProduct.setProductCd(mProductShape.getMProduct().getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);

			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			//商品荷姿マスタの非表示項目設定
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			mProductShape = setHiddenField(mProductShape, mClient, mProduct);
			// [Ver3.0] unit of measure対応 2017.12.14 NING End

			if (mProductShape.getProductShapeId() == null) {
				MProductShape conditionEntity = new MProductShape();
				conditionEntity.setClientId(mClient.getClientId());
				conditionEntity.setMProduct(mProduct);
				// [Ver3.0] unit of measure対応 2017.12.14 NING Del
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				conditionEntity.setShapeGrpDtlId(dto.getShapeGrpDtlId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING End

				MProductShape entity = getUkEntity(conditionEntity);
				if (entity != null) {
					//見つかった場合は重複エラー
					EProductShapeCB cb = new EProductShapeCB();
					cb.query().setProductShapeId_Equal(mProductShape.getProductShapeRevieceId());
					EProductShape eProductShape = eProductShapeBhv.selectEntity(cb);
					if (eProductShape != null) {
						eProductShape.setErrorFlg("1");
						eProductShape.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						errorEProductShapeList.add(eProductShape);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
				}
			}

			// [Ver3.0][#3642] 最小荷姿と最小荷姿以外の場合でエラー内容を変更 2018.02.16 shimizu Start
			if (!CU.isNullOrEmpty(dto.getMShapeGrpDtl().getMShape().getShapeCd()) && shapeGrp != null
					&& shapeGrp.getMShapeGrpDtlList() != null && shapeGrp.getMShapeGrpDtlList().size() > 0
					&& dto.getMShapeGrpDtl().getMShape().getShapeCd().equals(shapeGrp.getMShapeGrpDtlList().get(0).getMShape().getShapeCd())) {
				// 最小荷姿の入数が0ではなかった場合
				if(mProductShape.getUnitNum() != 0) {
					EProductShape eProductShape = eProductShapeBhv.selectByPKValue(dto.getProductShapeRevieceId());
					eProductShape.setErrorFlg("1");
					eProductShape.setErrorMessageCd(WmsMessageConst.UNIT_NUM_INPUT_REQUEST_ONLY_ZERO_ERROR);
					errorEProductShapeList.add(eProductShape);
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
				}
				continue;
			} else {
				// 最小荷姿以外の荷姿が1未満だった場合
				if(mProductShape.getUnitNum() < 1) {
					EProductShape eProductShape = eProductShapeBhv.selectByPKValue(dto.getProductShapeRevieceId());
					eProductShape.setErrorFlg("1");
					eProductShape.setErrorMessageCd(WmsMessageConst.UNIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR);
					errorEProductShapeList.add(eProductShape);
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
				}
			}
			//[Ver3.0][#3642] 最小荷姿と最小荷姿以外の場合でエラー内容を変更 2018.02.16 shimizu End

		}

		if (!errorEProductShapeList.isEmpty()) {
			batchUpdateEProductShape(errorEProductShapeList);
		}

		return errorEProductShapeList.size();
	}

	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 * */
	public boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	/**
	 * <h2>取引先マスタ受信テーブルのエラー設定.</h2>
	 */
	private void updateErrorExecute(EProductShape eProductShape, String errorMessageCd, DbUpdateForError doUpdate) {
		eProductShape.setErrorFlg("1");
		eProductShape.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eProductShapeBhv.update(eProductShape);
		}
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), errorMessageCd);
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
	}

	/**
	 * <h2>取引先マスタ受信テーブルのエラー無し設定.</h2>
	 */
	private void updateNormalExecute(EProductShape eProductShape, DbUpdateForError doUpdate) {
		eProductShape.setErrorFlg("0");
		eProductShape.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eProductShapeBhv.update(eProductShape);
		}
	}

	/**
	 * <h2>商品荷姿マスタの非表示項目設定.</h2>
	 * <pre>
	 * 商品荷姿マスタ取得
	 * 一致するデータがあれば非表示項目セット
	 * </pre>
	 * @param mProductShape 商品荷姿マスタ
	 * @param mClient 荷主マスタ
	 * @return 非表示項目を設定した商品荷姿マスタ
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	private MProductShape setHiddenField(MProductShape mProductShape, MClient mClient, MProduct mProduct) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		MProductShape condition = new MProductShape();
		condition.setClientId(mClient.getClientId());
		condition.setMProduct(mProduct);
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		condition.setShapeGrpDtlId(mProductShape.getMShapeGrpDtl().getShapeGrpDtlId());
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		//商品荷姿マスタ取得
		MProductShape productShapeSet = getUkEntity(condition);
		//一致するデータがあれば非表示項目セット
		if (productShapeSet != null) {
			mProductShape.setProductShapeId(productShapeSet.getProductShapeId());
			mProductShape.setProductId(productShapeSet.getProductId());
			mProductShape.setDelFlg("0"); //更新の場合は削除フラグを戻す
			mProductShape.setVersionNo(productShapeSet.getVersionNo());
			mProductShape.setControlNo(productShapeSet.getControlNo());
			mProductShape.setAddDt(productShapeSet.getAddDt());
			mProductShape.setAddUser(productShapeSet.getAddUser());
			mProductShape.setAddProcess(productShapeSet.getAddProcess());
			mProductShape.setUpdDt(productShapeSet.getUpdDt());
			mProductShape.setUpdUser(productShapeSet.getUpdUser());
			mProductShape.setUpdProcess(productShapeSet.getUpdProcess());
		} else {
			mProductShape.setProductShapeId(null);
			if (mProduct != null) {
				mProductShape.setProductId(mProduct.getProductId());
			} else {
				mProductShape.setProductId(null);
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			mProductShape.setDelFlg("0"); //更新の場合は削除フラグを戻す
			mProductShape.setVersionNo(null);
			mProductShape.setControlNo(null);
			mProductShape.setAddDt(null);
			mProductShape.setAddUser(null);
			mProductShape.setAddProcess(null);
			mProductShape.setUpdDt(null);
			mProductShape.setUpdUser(null);
			mProductShape.setUpdProcess(null);
		}

		return mProductShape;
	}

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
	public StatusDto register(ProductShapeMasterBulkInputDto productShapeMasterBulkInputDto, ErrorStatus errSts) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		// 受信CD
		String receiveCd = productShapeMasterBulkInputDto.data.receiveCd;

		//Mapper定義
		//商品荷姿マスタ
		MProductShapeDtoMapper productShapeDtoMapper = new MProductShapeDtoMapper();
		// ヘッダ項目をエンティティに変換
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productShapeMasterBulkInputDto.data.head);

		// 検索に必要な項目を取得・設定
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		List<MProductShapeDto> mProductShapeDtoList = selectAndConvertEProductShapeList(receiveCd, mClient
				, ProductShapeMasterBulkInputLogic.SelectCls.NO_ERROR_ONLY);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		// 商品荷姿マスタ
		MProductShape mProductShape = new MProductShape();
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
		List<MProductShape> updateList = new ArrayList<>();

		List<MProductShape> insertList = new ArrayList<>();
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End

		List<EProductShape> eProductShapeList = new ArrayList<>();

		//一覧データ件数分ループ
		for (int row = 0; row < mProductShapeDtoList.size(); row++) {
			MProductShapeDto data = mProductShapeDtoList.get(row);
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			// 商品CDにより、既存商品と荷姿グループと荷姿グループ詳細マスタ取得
			MShapeGrp shapeGrp = productLogic.getProductByCd(data.getMProduct().getProductCd(), mClient.getClientCd());

			List<MShapeGrpDtl> existedProductShapeList = shapeGrp.getMShapeGrpDtlList();
			for (Iterator<MShapeGrpDtl> iterator = existedProductShapeList.iterator(); iterator.hasNext();) {
				MShapeGrpDtl mShapeGrpDtl = iterator.next();
				if (mShapeGrpDtl.getMShape().getShapeCd().equals(data.getMShapeGrpDtl().getMShape().getShapeCd())) {
					data.getMShapeGrpDtl().setShapeGrpDtlId(mShapeGrpDtl.getShapeGrpDtlId());
					data.setShapeGrpDtlId(mShapeGrpDtl.getShapeGrpDtlId());
					break;
				}
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING End
			//商品荷姿マスタをエンティティに変換
			mProductShape = productShapeDtoMapper.mappingToEntity(data);
			// 商品IDを取得
			MProduct mProduct = new MProduct();
			mProduct.setClientId(mClient.getClientId());
			mProduct.setProductCd(mProductShape.getMProduct().getProductCd());
			mProduct = productLogic.getUkEntity(mProduct);
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			//商品荷姿マスタの非表示項目設定
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			mProductShape = setHiddenField(mProductShape, mClient, mProduct);
			// [Ver3.0] unit of measure対応 2017.12.14 NING End

			// /商品荷姿IDがNULL(マスタ未登録)の場合、/商品荷姿マスタ登録、登録済みの場合は/商品荷姿マスタ更新
			if (mProductShape.getProductShapeId() == null) {
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
				//検索条件の設定
				MProductShape result = null;
				//検索条件設定
				MProductShapeCB cb = mProductShapeBhv.newConditionBean();
				cb.query().setProductId_Equal(mProductShape.getProductId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING Del
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				cb.query().setShapeGrpDtlId_Equal(mProductShape.getShapeGrpDtlId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING End
				result = mProductShapeBhv.selectEntity(cb);

				if (result == null) {
					//存在なかった場合
					insertList.add(mProductShape);
				} else {
					//存在した場合
					EProductShape eProductShape = eProductShapeBhv.selectByPKValue(data.getProductShapeRevieceId());
					if (eProductShape != null) {
						eProductShape.setErrorFlg("1");
						eProductShape.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						eProductShapeList.add(eProductShape);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProductShape.getReceiveRowId()), eProductShape.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
				}
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
			} else {
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
				updateList.add(mProductShape);
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
			}
			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理中止
				if (outputLog == OutputLog.TRUE) {
					// ログ書込
					getDatabaseLogger().endLogDtl();
				}
				return null;
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
		if (!insertList.isEmpty()) {
			mProductShapeBhv.batchInsert(insertList);
		}

		if (!updateList.isEmpty()) {
			mProductShapeBhv.batchUpdate(updateList);
		}
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End

		if (!eProductShapeList.isEmpty()) {
			eProductShapeBhv.batchUpdate(eProductShapeList);
		}

		//更新errflg=0的数据
		EProductShapeCB cb = new EProductShapeCB();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().setErrorFlg_Equal("0");
		List<EProductShape> updEProduct = eProductShapeBhv.selectList(cb);
		for (int i = 0; i < updEProduct.size(); i++) {
			updEProduct.get(i).setImportFlg("1");
		}
		eProductShapeBhv.batchUpdate(updEProduct);

		if (!insertList.isEmpty() || !updateList.isEmpty()) {
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		} else {
			getErrorManager().add(errSts, WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
			if (outputLog == OutputLog.TRUE) {
				// ログ書込
				getDatabaseLogger().addErrorLogDtl(WmsMessageConst.INSERT_DATA_NOT_FOUND_INFORMATION);
				getDatabaseLogger().endLogDtl();
				endFailureLog();
			}
		}

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			int insertCount = insertList.size();
			int updateCount = updateList.size();
			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_INFORMATION, String.valueOf(insertCount), String.valueOf(updateCount));
			getDatabaseLogger().endLogDtl();
		}

		return null;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.14 honma end

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>商品荷姿マスタ受信テーブル検索</h2>
	 * @param receiveCd 受信CD
	 * @param mClient 荷主
	 * @return セレクト件数
	 */
	public int getEProductShapeCount(String receiveCd, MClient mClient) {
		// 外出しSQLの定義
		String path = EProductShapeBhv.PATH_selectSqlEProductShapeList;

		BsSqlEProductShapeListPmb pmb = new BsSqlEProductShapeListPmb();
		pmb.setClientCd(mClient.getClientCd());
		pmb.setReceiveCd(receiveCd);
		pmb.setImportFlg("0");
		pmb.setCultureId(getCultureId());

		Class<SqlEProductShapeListDto> entityType = SqlEProductShapeListDto.class;

		return eProductShapeBhv.outsideSql().selectList(path, pmb, entityType).size();
	}
	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}
