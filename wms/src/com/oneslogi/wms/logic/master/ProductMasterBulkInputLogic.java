package com.oneslogi.wms.logic.master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlEProductListPmb;
import com.oneslogi.base.dbflute.cbean.EProductCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDtlDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDto;
import com.oneslogi.base.dbflute.dto.customize.SqlEProductListDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MProductShapeDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MShapeGrpDtlDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MShapeGrpDtoMapper;
import com.oneslogi.base.dbflute.exbhv.EProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.EProduct;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.ProductDto;
import com.oneslogi.wms.dto.master.ProductMasterBulkInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;
import com.oneslogi.wms.logic.common.ShapeLogic;
import com.oneslogi.wms.logic.common.TStockHandCheckLogic;

/**
 * 商品マスタ一括取込データ取得ロジッククラス
 */
public class ProductMasterBulkInputLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.09 honma start
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

		/**
		 * 在庫データで存在エラー
		 */
		protected static final int STOCK_DATA_FOUND_ERROR = 6;
	}

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;

	@Inject
	private EProductBhv eProductBhv;

	// ===== 使用ロジック =====
	// [Ver3.0] unit of measure対応 2017.12.14 NING Del

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CenterClassLogic centerClassLogic;

	@Inject
	private ProductMasterSelectLogic productSelectLogic;

	@Inject
	private TStockHandCheckLogic tStockHandCheckLogic;

	@Inject
	private ProductMasterInsertLogic productMasterInsertLogic;

	@Inject
	private ProductMasterUpdateLogic productMasterUpdateLogic;

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	@Inject
	private ShapeGroupMasterSelectLogic shapeGroupMasterSelectLogic;

	@Inject
	private LocationMasterSelectLogic locationMasterSelectLogic;

	@Inject
	private ProductShapeMasterBulkInputDeleteLogic productShapeMasterBulkInputDeleteLogic;

	@Inject
	private ProductShapeLogic productShapeLogic;
	@Inject
	private ShapeLogic shapeLogic;
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
		getDatabaseLogger().setPgmCd(WmsMessageConst.PRODUCT_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION);

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
	public void batchInsertEProduct(List<EProduct> eProductList) {
		eProductBhv.batchInsert(eProductList);
	}

	/**
	 * <h2>商品マスタデータ取得。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから商品マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 * (共通処理の削除フラグを見ない版)
	 *
	 * 【データ取得テーブル】
	 * ・商品マスタ
	 * ・商品荷姿マスタ
	 *
	 * 【パラメータの使用項目】
	 *  (商品マスタ)
	 *  ・商品ID
	 * </pre>
	 * @return MProduct 商品マスタデータ
	 */
	public MProduct getUkEntityWithShape(MProduct entity) {

		List<MProduct> result = null;

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MProductCB cb = mProductBhv.newMyConditionBean();
		//商品IDの設定
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setProductCd_Equal(entity.getProductCd());
		result = mProductBhv.selectList(cb);
		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			return null;
		}

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		mProductBhv.loadMProductShapeList(result, new ConditionBeanSetupper<MProductShapeCB>() {
			@Override
			public void setup(MProductShapeCB subCB) {
				// [Ver3.0] unit of measure対応 2017.12.14 NING Del
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
				// [Ver3.0] unit of measure対応 2017.12.14 NING End
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		return result.get(0);
	}

	/**
	 * <h2>ファイル取込データから商品マスタ受信テーブルのエンティティに変換.</h2>
	 * @param mClient 荷主マスタ
	 * @param productList 取込商品マスタリスト
	 * @param receiveCd 設定する受信CD
	 * @return 商品マスタ受信テーブルのリスト
	 */
	public List<EProduct> convertEProduct(MClient mClient, List<MProductShapeDto> productList, String receiveCd) {

		List<EProduct> eProductList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < productList.size(); row++) {
			MProductShapeDto mProductShape = productList.get(row);
			//商品マスタをエンティティに変換
			MProductDto product = mProductShape.getMProduct();
			//商品マスタ受信テーブル
			EProduct eProduct = new EProduct();
			eProduct.setClientCd(mClient.getClientCd());
			eProduct.setReceiveRowId(Long.valueOf(row + 1));
			eProduct.setReceiveCd(receiveCd);
			eProduct.setImportFlg("0");
			eProduct.setErrorFlg("0");
			//商品CD
			String productCd = product.getProductCd();
			eProduct.setProductCd(productCd);
			//商品名称
			String productNm = product.getProductNm();
			eProduct.setProductNm(productNm);
			//商品略称
			String productAbbr = product.getProductAbbr();
			eProduct.setProductAbbr(productAbbr);
			//JANCD
			String janCd = product.getJanCd();
			eProduct.setJanCd(janCd);
			//ロット管理フラグ
			String lotManagFlg = product.getLotManagFlg();
			eProduct.setLotManagFlg(lotManagFlg);
			// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu
			//期限日管理フラグ
			String limitDtManagFlg = product.getLimitDtManagFlg();
			eProduct.setLimitDtManagFlg(limitDtManagFlg);
			//期限日逆転防止フラグ
			String limitDtReverseFlg = product.getLimitDtReverseFlg();
			eProduct.setLimitDtReverseFlg(limitDtReverseFlg);
			//入荷期限日数
			Long receiveLimitNum = null;
			if (product.getReceiveLimitNum() != null) {
				receiveLimitNum = product.getReceiveLimitNum();
				if ("0".equals(limitDtManagFlg)) {
					receiveLimitNum = 0L;
				}
			}
			eProduct.setReceiveLimitNum((receiveLimitNum == null) ? null : CU.convertNumberToString(receiveLimitNum));
			// 出荷期限日数
			Long shippingLimitNum = null;
			if (product.getShippingLimitNum() != null) {
				shippingLimitNum = product.getShippingLimitNum();
				if ("0".equals(limitDtManagFlg)) {
					shippingLimitNum = 0L;
				}
			}
			eProduct.setShippingLimitNum((shippingLimitNum == null) ? null : CU.convertNumberToString(shippingLimitNum));
			//入庫No.マージ区分 ※必須
			String mergeCls = product.getMergeCls();
			eProduct.setMergeCls(mergeCls);
			//出荷停止フラグ ※必須
			String shippingStopFlg = product.getShippingStopFlg();
			eProduct.setShippingStopFlg(shippingStopFlg);
			//定点
			BigDecimal fixedPoint = null;
			if (product.getFixedPoint() != null) {
				fixedPoint = product.getFixedPoint();
			}
			eProduct.setFixedPoint((fixedPoint == null) ? null : CU.convertNumberToString(fixedPoint));

			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			// [#7395][OSS] 致命的エラー対応 2020.05.18 Matsubayashi mod Start
			if (mProductShape.getMProduct().getMShapeGrp() != null ) {
				String shapeGrpCd = mProductShape.getMProduct().getMShapeGrp().getShapeGrpCd();

				eProduct.setShapeGrpCd(shapeGrpCd);
			}
			// [#7395][OSS] 致命的エラー対応 2020.05.18 Matsubayashi mod End
			// [Ver3.0] unit of measure対応 2017.12.14 NING End

			//ピース縦(mm)
			BigDecimal length = null;
			if (mProductShape.getLength() != null) {
				length = mProductShape.getLength();
			}
			eProduct.setLength((length == null) ? null : CU.convertNumberToString(length));
			//ピース横(mm)
			BigDecimal width = null;
			if (mProductShape.getWidth() != null) {
				width = mProductShape.getWidth();
			}
			eProduct.setWidth((width == null) ? null : CU.convertNumberToString(width));
			//ピース高さ(mm)
			BigDecimal height = null;
			if (mProductShape.getHeight() != null) {
				height = mProductShape.getHeight();
			}
			eProduct.setHeight((height == null) ? null : CU.convertNumberToString(height));
			//ピース容積(mm3)
			BigDecimal volume = null;
			if (mProductShape.getVolume() != null) {
				volume = mProductShape.getVolume();
			}
			eProduct.setVolume((volume == null) ? null : CU.convertNumberToString(volume));
			//ピース商品重量(g)
			BigDecimal netWeight = null;
			if (mProductShape.getNetWeight() != null) {
				netWeight = mProductShape.getNetWeight();
			}
			eProduct.setNetWeight((netWeight == null) ? null : CU.convertNumberToString(netWeight));
			//ピース総重量(g)
			BigDecimal grossWeight = null;
			if (mProductShape.getGrossWeight() != null) {
				grossWeight = mProductShape.getGrossWeight();
			}
			eProduct.setGrossWeight((grossWeight == null) ? null : CU.convertNumberToString(grossWeight));
			eProductList.add(eProduct);
		}

		return eProductList;

	}

	/**
	 * <h2>商品マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<EProduct> selectEProductList(String receiveCd) {

		EProductCB cb = eProductBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eProductBhv.selectList(cb);
	}

	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add Start
	/**
	 * <h2>商品マスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<EProduct> selectEProductList(String receiveCd, SelectCls cls) {

		EProductCB cb = eProductBhv.newMyConditionBean();

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

		return eProductBhv.selectList(cb);
	}
	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add End

	/**
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param receiveCd 受信CD
	 * @param mClient 荷姿マスタ
	 */
	public void checkError(String receiveCd, MClient mClient) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<EProduct> checkProductList = selectEProductList(receiveCd);
		// 必須、文字数などのチェック
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		int errCount = checkError(checkProductList, DbUpdateForError.TRUE, mClient);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(receiveCd, mClient);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			int count = checkProductList.size();
			int errCountAll = errCount + errCountMaster;
			int normalCount = count - errCountAll;

			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_PRODUCT_MASTER_INFORMATION, String.valueOf(errCountAll), String.valueOf(errCountAll), String.valueOf(normalCount), String.valueOf(normalCount));
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End
			getDatabaseLogger().endLogDtl();
		}
	}


	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eProductList 商品マスタ受信データリスト
	 * @param doUpdate
	 * @param mClient 荷主
	 *
	 * @return エラー件数
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	private int checkError(List<EProduct> eProductList, DbUpdateForError doUpdate, MClient mClient) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		// 商品CD重複チェック用
		Set<String> productCdSet = new HashSet<String>();
		// JANCD重複チェック用
		Set<String> janCdSet = new HashSet<String>();

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(ロット管理フラグ)lotManagFlgNotFoundError
		Map<String, String> lotManagMap = centerClassLogic.getClassMapByCd("LOT_MANAG_FLG");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(期限日管理フラグ)limitDtManagFlgNotFoundError
		Map<String, String> limitDtManagMap = centerClassLogic.getClassMapByCd("LIMIT_DT_MANAG_FLG");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(期限日逆転防止フラグ)limitDtReverseFlgNotFoundError
		Map<String, String> limitDtReverseMap = centerClassLogic.getClassMapByCd("LIMIT_DT_REVERSE_FLG");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(入庫No.マージ区分)mergeClsNotFoundError
		Map<String, String> mergeClsMap = centerClassLogic.getClassMapByCd("MERGE_CLS");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(出荷停止フラグ)shippingStopFlgNotFoundError
		Map<String, String> shippingStopMap = centerClassLogic.getClassMapByCd("SHIPPING_STOP_FLG");

		// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu

		// エラー件数
		int errorCount = 0;

		for (EProduct product : eProductList) {

			// ===== 商品CD チェック =====

			String productCd = product.getProductCd();
			if (CU.isNullOrEmpty(productCd)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[!-~]*$", productCd)) {
				// 文字エラー
				updateErrorExecute(product, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", productCd)) {
				// 長さエラー
				updateErrorExecute(product, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (productCdSet.contains(productCd)) {
				// 重複エラー
				updateErrorExecute(product, WmsMessageConst.PRODUCT_CODE_DUPLICATE_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 商品CD重複チェック用リストに追加
			productCdSet.add(productCd);

			// ===== 商品名称 チェック =====

			String productNm = product.getProductNm();
			if (CU.isNullOrEmpty(productNm)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.PRODUCT_NM_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [#13]半角スペースが入ると文字数エラーになる不具合を修正 2016.09.29 kawana Start
			if (!checkExcelCellInput(".{1,50}$", productNm)) {
				// [#13]半角スペースが入ると文字数エラーになる不具合を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(product, WmsMessageConst.PRODUCT_NM_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 商品略称 チェック =====

			String productAbbr = product.getProductAbbr();
			if (CU.isNullOrEmpty(productAbbr)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.PRODUCT_ABBR_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [#13]半角スペースが入ると文字数エラーになる不具合を修正 2016.09.29 kawana Start
			if (!checkExcelCellInput(".{1,35}$", productAbbr)) {
				// [#13]半角スペースが入ると文字数エラーになる不具合を修正 2016.09.29 kawana End
				// 長さエラー
				updateErrorExecute(product, WmsMessageConst.PRODUCT_ABBR_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ソースCD チェック =====

			String janCd = product.getJanCd();
			if (!CU.isNullOrEmpty(janCd)) {
				// [#687] ソースCD チェック内容間違いを修正 2017.01.24 kawana Start
				if (!checkExcelCellInput("^[!-~]*$", janCd)) {
					// [#687] ソースCD チェック内容間違いを修正 2017.01.24 kawana End
					// 文字エラー
					updateErrorExecute(product, WmsMessageConst.JAN_CD_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [#687] ソースCD チェック内容間違いを修正 2017.01.24 kawana Start
				if (30 < janCd.length()) {
					// [#687] ソースCD チェック内容間違いを修正 2017.01.24 kawana End
					// 長さエラー
					updateErrorExecute(product, WmsMessageConst.JAN_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (janCdSet.contains(janCd)) {
					// 重複エラー
					updateErrorExecute(product, WmsMessageConst.JAN_CD_DUPLICATE_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// JANCD重複チェック用リストに追加
				janCdSet.add(janCd);
			}

			// ===== ロット管理フラグ チェック =====

			String lotManagFlg = product.getLotManagFlg();
			if (CU.isNullOrEmpty(lotManagFlg)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.LOT_MANAG_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!lotManagMap.containsKey(lotManagFlg)) {
				// ロット管理フラグがセンタ区分値明細マスタにない。
				updateErrorExecute(product, WmsMessageConst.LOT_MANAG_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu

			// ===== 期限日管理フラグ チェック =====

			String limitDtManagFlg = product.getLimitDtManagFlg();
			if (CU.isNullOrEmpty(limitDtManagFlg)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.LIMIT_DT_MANAG_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!limitDtManagMap.containsKey(limitDtManagFlg)) {
				// 期限日管理フラグがセンタ区分値明細マスタにない。
				updateErrorExecute(product, WmsMessageConst.LIMIT_DT_MANAG_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 期限日逆転防止フラグ チェック =====

			String limitDtReverseFlg = product.getLimitDtReverseFlg();
			if (CU.isNullOrEmpty(limitDtReverseFlg)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!limitDtReverseMap.containsKey(limitDtReverseFlg)) {
				// 期限日逆転防止フラグがセンタ区分値明細マスタにない。
				updateErrorExecute(product, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if ("0".equals(limitDtManagFlg) && !"0".equals(limitDtReverseFlg)) {
				// 期限日管理フラグに[管理しない]を設定した場合、期限日逆転防止フラグも[管理しない]以外を設定
				updateErrorExecute(product, WmsMessageConst.LIMIT_DT_REVERSE_FLG_CHECK_NO_MANAG_ERROR, doUpdate);
				errorCount++;
				continue;
			}


			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu Start
			// ===== 入荷期限日数 チェック =====

			String receiveLimitNum = product.getReceiveLimitNum();
			if (!CU.isNullOrEmpty(receiveLimitNum) && !"0".equals(limitDtManagFlg)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", receiveLimitNum)) {
					// 文字エラー
					updateErrorExecute(product, WmsMessageConst.RECEIVE_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [Ver3.0][#4292] 最大値チェックの廃止。桁数チェックに変更 2018.04.11 shimizu Start
				if(!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", receiveLimitNum)) {
					// 整数5桁以下
					updateErrorExecute(product, WmsMessageConst.RECEIVE_LIMIT_NUM_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4292] 最大値チェックの廃止。桁数チェックに変更 2018.04.11 shimizu End
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+$", receiveLimitNum)) {
					// 小数不可
					updateErrorExecute(product, WmsMessageConst.RECEIVE_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (Long.parseLong(receiveLimitNum) < 0) {
					// 最小0以上
					updateErrorExecute(product, WmsMessageConst.RECEIVE_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu End
			}

			// ===== 出荷期限日数 チェック =====

			String shippingLimitNum = product.getShippingLimitNum();
			if (!CU.isNullOrEmpty(shippingLimitNum) && !"0".equals(limitDtManagFlg)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", shippingLimitNum)) {
					// 文字エラー
					updateErrorExecute(product, WmsMessageConst.SHIPPING_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [Ver3.0][#4292] 最大値チェックの廃止。桁数チェックに変更 2018.04.11 shimizu Start
				if(!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", shippingLimitNum)) {
					// 整数5桁以内
					updateErrorExecute(product, WmsMessageConst.SHIPPING_LIMIT_NUM_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4292] 最大値チェックの廃止。桁数チェックに変更 2018.04.11 shimizu End
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+$", shippingLimitNum)) {
					// 小数不可
					updateErrorExecute(product, WmsMessageConst.SHIPPING_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (Long.parseLong(shippingLimitNum) < 0) {
					// 最小0以上
					updateErrorExecute(product, WmsMessageConst.SHIPPING_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
			}
			// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu End

			// ===== 入庫No.マージ区分 チェック =====

			String mergeCls = product.getMergeCls();
			if (CU.isNullOrEmpty(mergeCls)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.MERGE_CLS_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!mergeClsMap.containsKey(mergeCls)) {
				// 入庫No.マージ区分がセンタ区分値明細マスタにない。
				updateErrorExecute(product, WmsMessageConst.MERGE_CLS_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 出荷停止フラグ チェック =====

			String shippingStopFlg = product.getShippingStopFlg();
			if (CU.isNullOrEmpty(shippingStopFlg)) {
				// 必須
				updateErrorExecute(product, WmsMessageConst.SHIPPING_STOP_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			if (!shippingStopMap.containsKey(shippingStopFlg)) {
				// 出荷停止フラグがセンタ区分値明細マスタにない。
				updateErrorExecute(product, WmsMessageConst.SHIPPING_STOP_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 定点 チェック =====

			String fixedPoint = product.getFixedPoint();
			if (!CU.isNullOrEmpty(fixedPoint)) {
				// [#4014][Ver3.0] 商品マスタ一括取込 - 「定点」エラーチェック不正 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", fixedPoint)) {
					// 文字エラー
					updateErrorExecute(product, WmsMessageConst.FIXED_POINT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", fixedPoint)) {
					// 整数7桁以内
					updateErrorExecute(product, WmsMessageConst.FIXED_POINT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", fixedPoint)) {
					// 小数3桁以内
					updateErrorExecute(product, WmsMessageConst.FIXED_POINT_BULK_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				BigDecimal longFixedPoint = WCC.toBigDecimal(fixedPoint);
				if (WCC.isNegative(longFixedPoint)) {
					// 最小0以上
					updateErrorExecute(product, WmsMessageConst.FIXED_POINT_CHECK_INPUT_MIN_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// [#4014][Ver3.0] 商品マスタ一括取込 - 「定点」エラーチェック不正 2018.04.09 honma Mod End
			}


			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			// 在庫管理単位(荷姿グループCD)
			String shapeGrpCd = product.getShapeGrpCd();
			if (!CU.isNullOrEmpty(shapeGrpCd)) {
				// 英数字
				if (!checkExcelCellInput("^[0-9a-zA-Z]*$", shapeGrpCd)) {
					updateErrorExecute(product, WmsMessageConst.SHAPE_GRP_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				// 30文字
				if (shapeGrpCd.length() > 30) {
					updateErrorExecute(product, WmsMessageConst.SHAPE_GRP_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}

			/*
			 * 小数チェックために、荷姿グループCD設定する。
			 * Uploadファイルに、在庫管理単位が未指定の場合、荷主マスタと紐づく荷姿グループCDを設定する。
			 */
			String tmpShapeGrpCd = null;

			if (product.getShapeGrpCd() != null) {
				tmpShapeGrpCd = product.getShapeGrpCd();
			} else {
				//在庫管理単位が未指定の場合、荷主マスタと紐づく荷姿グループCDを設定する
				MClient tmpClient = clientLogic.getEntityWithShapeGrp(mClient, null);
				if(tmpClient == null || tmpClient.getMShapeGrp() == null) {
					// 荷主に紐付く在庫管理単位は未指定です
					updateErrorExecute(product, WmsMessageConst.CLIENT_DEFAULT_SHAPE_GROUP_NOT_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				} else {
					tmpShapeGrpCd = tmpClient.getMShapeGrp().getShapeGrpCd();
				}
			}

			/*
			 *  荷主CDにより、荷姿グループCDが荷姿グループマスタに存在チェック。
			 *  存在しない場合、小数チェックを行いません。
			 */
			MShapeGrp shapeGrp =
					shapeGroupMasterSelectLogic.selectByClientIdAndGrpCd(mClient.getClientId(),tmpShapeGrpCd);
			// 荷姿グループCDが荷姿グループマスタに存在しない場合、エラーにする
			if (shapeGrp == null) {
				updateErrorExecute(product, WmsMessageConst.SHAPE_GROUP_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			} else {
				// [Ver3.0][#3630] 小数有無フラグに関係なく小数を許容するよう変更 2018.02.19 shimizu Start

				// ===== ピース縦(mm) チェック =====

				String length = product.getLength();
				if (!CU.isNullOrEmpty(length)) {
					if (!checkExcelCellInput("^(-)?[0-9]*(\\.\\d+)?$", length)) {
						// 文字エラー
						updateErrorExecute(product, WmsMessageConst.LENGTH_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", length)) {
						// 整数10桁以内
						updateErrorExecute(product, WmsMessageConst.LENGTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", length)) {
						// 小数3桁以内
						updateErrorExecute(product, WmsMessageConst.LENGTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (WCC.isNegative(length)) {
						// 最小0以上
						updateErrorExecute(product, WmsMessageConst.LENGTH_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== ピース横(mm) チェック =====

				String width = product.getWidth();
				if (!CU.isNullOrEmpty(width)) {
					if (!checkExcelCellInput("^(-)?[0-9]*(\\.\\d+)?$", width)) {
						// 文字エラー
						updateErrorExecute(product, WmsMessageConst.WIDTH_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", width)) {
						// 整数10桁以内
						updateErrorExecute(product, WmsMessageConst.WIDTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", width)) {
						// 小数3桁以内
						updateErrorExecute(product, WmsMessageConst.WIDTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (WCC.isNegative(width)) {
						// 最小0以上
						updateErrorExecute(product, WmsMessageConst.WIDTH_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== ピース高さ(mm) チェック =====

				String height = product.getHeight();
				if (!CU.isNullOrEmpty(height)) {
					if (!checkExcelCellInput("^(-)?[0-9]*(\\.\\d+)?$", height)) {
						// 文字エラー
						updateErrorExecute(product, WmsMessageConst.HEIGHT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", height)) {
						// 整数10桁以内
						updateErrorExecute(product, WmsMessageConst.HEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", height)) {
						// 小数3桁以内
						updateErrorExecute(product, WmsMessageConst.HEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (WCC.isNegative(height)) {
						// 最小0以上
						updateErrorExecute(product, WmsMessageConst.HEIGHT_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== ピース容積(mm3) チェック =====

				String volume = product.getVolume();
				if (!CU.isNullOrEmpty(volume)) {
					if (!checkExcelCellInput("^(-)?[0-9]*(\\.\\d+)?$", volume)) {
						// 文字エラー
						updateErrorExecute(product, WmsMessageConst.VOLUME_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Add Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", volume)) {
						// 整数10桁以内
						updateErrorExecute(product, WmsMessageConst.VOLUME_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Add End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", volume)) {
						// 小数3桁以内
						updateErrorExecute(product, WmsMessageConst.VOLUME_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (WCC.isNegative(WCC.toBigDecimal(volume))) {
						// 最小0以上
						updateErrorExecute(product, WmsMessageConst.VOLUME_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== ピース商品重量(g) チェック =====

				String netWeight = product.getNetWeight();
				if (!CU.isNullOrEmpty(netWeight)) {
					if (!checkExcelCellInput("^(-)?[0-9]*(\\.\\d+)?$", netWeight)) {
						// 文字エラー
						updateErrorExecute(product, WmsMessageConst.NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", netWeight)) {
						// 整数10桁以内
						updateErrorExecute(product, WmsMessageConst.NET_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", netWeight)) {
						// 小数3桁以内
						updateErrorExecute(product, WmsMessageConst.NET_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (WCC.isNegative(netWeight)) {
						// 最小0以上
						updateErrorExecute(product, WmsMessageConst.NET_WEIGHT_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}

				// ===== ピース総重量(g) チェック =====

				String grossWeight = product.getGrossWeight();
				if (!CU.isNullOrEmpty(grossWeight)) {
					if (!checkExcelCellInput("^(-)?[0-9]*(\\.\\d+)?$", grossWeight)) {
						// 文字エラー
						updateErrorExecute(product, WmsMessageConst.GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,10}+(\\.\\d+)?$", grossWeight)) {
						// 整数10桁以内
						updateErrorExecute(product, WmsMessageConst.GROSS_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3822][Ver3.0] 商品マスタメンテナンス(編集) - 最大値登録異常 2018.02.28 honma Mod End
					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", grossWeight)) {
						// 小数3桁以内
						updateErrorExecute(product, WmsMessageConst.GROSS_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					if (WCC.isNegative(grossWeight)) {
						// 最小0以上
						updateErrorExecute(product, WmsMessageConst.GROSS_WEIGHT_CHECK_INPUT_MIN_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}
				// [Ver3.0][#3630] 小数有無フラグに関係なく小数を許容するよう変更 2018.02.19 shimizu End
			}

			// [Ver3.0] unit of measure対応 2017.12.14 NING End

			// エラー無を設定
			updateNormalExecute(product, doUpdate);
		}

		return errorCount;
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
	 * <h2>商品マスタ受信テーブルのエラー設定.</h2>
	 */
	private void updateErrorExecute(EProduct eProduct, String errorMessageCd, DbUpdateForError doUpdate) {
		eProduct.setErrorFlg("1");
		eProduct.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eProductBhv.update(eProduct);
		}
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eProduct.getReceiveRowId()), errorMessageCd);
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
	}

	/**
	 * <h2>商品マスタ受信テーブルのエラー無し設定.</h2>
	 */
	private void updateNormalExecute(EProduct eProduct, DbUpdateForError doUpdate) {
		eProduct.setErrorFlg("0");
		eProduct.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eProductBhv.update(eProduct);
		}
	}

	/**
	 * <h2>関連マスタ存在チェック.</h2>
	 * <pre>
	 * 一括取込されたCDを元にIDを取得し、データに設定する
	 * 設定時にマスタの存在有無を合わせてチェックする
	 * 【商品マスタ】
	 * ・荷主ID
	 * 【商品荷姿マスタ】
	 * ・荷姿ID
	 * 次の場合、エラーとして扱い、ステータス、エラーフラグ、エラーメッセージIDを設定する
	 * 【エラー条件】
	 * ・商品CD重複
	 * ・JANCD重複
	 * ・在庫存在(ﾛｯﾄ管理,期限日管理変更時)
	 *
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param mClient 荷主マスタ
	 * @return エラー件数
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//	private int checkErrorMaster(String receiveCd, MClient mClient) {
	public int checkErrorMaster(String receiveCd, MClient mClient) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
		// エラー件数
		int errorCount = 0;

		//エンティティに変換
		//ヘッダ項目
		MProductDtoMapper productMapper = new MProductDtoMapper();
		//一覧項目
		MProductShapeDtoMapper productShapeDtoMapper = new MProductShapeDtoMapper();

		List<MProductShapeDto> productMaster = selectAndConvertEProductList(receiveCd, mClient, SelectCls.NO_ERROR_ONLY);

		if (productMaster.size() == 0) {
			return 0;
		}

		for (int row = 0; row < productMaster.size(); row++) {
			ProductDto productDto = getUkEntityWithShape(mClient.getClientId(), productMaster.get(row).getMProduct().getProductCd());
			if (productDto != null && productDto.data.mProduct.getProductId() != null) {
				productMaster.get(row).getMProduct().setProductId(productDto.data.mProduct.getProductId());
				productMaster.get(row).getMProduct().setDelFlg("0");
				productMaster.get(row).getMProduct().setVersionNo(productDto.data.mProduct.getVersionNo());
				productMaster.get(row).getMProduct().setControlNo(productDto.data.mProduct.getControlNo());
				productMaster.get(row).getMProduct().setAddDt(productDto.data.mProduct.getAddDt());
				productMaster.get(row).getMProduct().setAddUser(productDto.data.mProduct.getAddUser());
				productMaster.get(row).getMProduct().setAddProcess(productDto.data.mProduct.getAddProcess());
				productMaster.get(row).getMProduct().setUpdDt(productDto.data.mProduct.getUpdDt());
				productMaster.get(row).getMProduct().setUpdUser(productDto.data.mProduct.getUpdUser());
				productMaster.get(row).getMProduct().setUpdProcess(productDto.data.mProduct.getUpdProcess());

				productMaster.get(row).setProductId(productDto.data.mProduct.getProductId());
				productMaster.get(row).setProductShapeId(productDto.data.mProduct.getMProductShapeList().get(0).getProductShapeId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				productMaster.get(row).setShapeGrpDtlId(productMaster.get(row).getMShapeGrpDtl().getShapeGrpDtlId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING End
				productMaster.get(row).setDelFlg("0");
				productMaster.get(row).setVersionNo(productDto.data.mProduct.getMProductShapeList().get(0).getVersionNo());
				productMaster.get(row).setControlNo(productDto.data.mProduct.getMProductShapeList().get(0).getControlNo());
				productMaster.get(row).setAddDt(productDto.data.mProduct.getMProductShapeList().get(0).getAddDt());
				productMaster.get(row).setAddUser(productDto.data.mProduct.getMProductShapeList().get(0).getAddUser());
				productMaster.get(row).setAddProcess(productDto.data.mProduct.getMProductShapeList().get(0).getAddProcess());
				productMaster.get(row).setUpdDt(productDto.data.mProduct.getMProductShapeList().get(0).getUpdDt());
				productMaster.get(row).setUpdUser(productDto.data.mProduct.getMProductShapeList().get(0).getUpdUser());
				productMaster.get(row).setUpdProcess(productDto.data.mProduct.getMProductShapeList().get(0).getUpdProcess());
			}
		}

		// マスタデータ取得用配列
		HashMap<String, Object> productCdMap = new HashMap<String, Object>();
		HashMap<String, Object> janCdMap = new HashMap<String, Object>();

		// 一覧件数分ループ
		for (int row = 0; row < productMaster.size(); row++) {
			//商品マスタをエンティティに変換
			MProduct product = productMapper.mappingToEntity(productMaster.get(row).getMProduct());

			//商品荷姿マスタをエンティティに変換
			//			MProductShape productShape = productShapeDtoMapper.mappingToEntity(productMaster.get(row));

			//マスタデータ取得用配列に格納
			if (!CU.isNullOrEmpty(product.getProductCd()) && !productCdMap.containsKey(product.getProductCd())) {
				productCdMap.put(product.getProductCd(), null);
			}
			if (!CU.isNullOrEmpty(product.getJanCd()) && !janCdMap.containsKey(product.getJanCd())) {
				janCdMap.put(product.getJanCd(), null);
			}
		}

		// 削除フラグの自動検索無効化 2015/02/19 KAI ADD
		this.setBehaviorAutoDelFlg(false);

		// 商品マスタ一括取得(キー：商品コード)
		//検索条件設定
		MProductCB cbMProductCd = mProductBhv.newConditionBean();
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		cbMProductCd.setupSelect_MShapeGrp();
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		cbMProductCd.query().setClientId_Equal(mClient.getClientId());
		cbMProductCd.query().setProductCd_InScope(productCdMap.keySet()); // 商品CDが一緒
		cbMProductCd.query().addOrderBy_ProductCd_Asc();

		//商品マスタ取得
		List<MProduct> productCdList = mProductBhv.selectList(cbMProductCd);

		mProductBhv.loadMProductShapeList(productCdList, new ConditionBeanSetupper<MProductShapeCB>() {

			@Override
			public void setup(MProductShapeCB cbPS) {
				cbPS.query().addOrderBy_ProductId_Asc();
			}
		});

		// [ON推-品向-930] 削除済商品のJANCDは重複チェックの対象としないように修正 2015.08.06 kawana Start
		// 削除フラグ自動検索有効化 2015/02/19 KAI ADD
		this.setBehaviorAutoDelFlg(true);
		// [ON推-品向-930] 削除済商品のJANCDは重複チェックの対象としないように修正 2015.08.06 kawana End

		//取得した商品コードを配列化
		ArrayList<String> productCd = new ArrayList<String>();
		for (int row = 0; row < productCdList.size(); row++) {
			productCd.add(productCdList.get(row).getProductCd());
		}

		// 商品マスタ一括取得(キー：JANコード)
		List<MProduct> janCdList = new ArrayList<MProduct>();

		if (janCdMap.size() > 0) {
			//検索条件設定
			MProductCB cbMProductJan = mProductBhv.newConditionBean();
			cbMProductJan.query().setClientId_Equal(mClient.getClientId());
			cbMProductJan.query().setJanCd_InScope(janCdMap.keySet()); // JANCDが一緒
			cbMProductJan.query().addOrderBy_JanCd_Asc();

			//商品マスタ取得
			janCdList = mProductBhv.selectList(cbMProductJan);
		}

		//取得したJANコードを配列化
		ArrayList<String> janCd = new ArrayList<String>();
		for (int row = 0; row < janCdList.size(); row++) {
			janCd.add(janCdList.get(row).getJanCd());
		}

		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
		//		// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana Start
		//		// 荷姿マスタ一括取得(キー：荷姿コード)
		//		// ※※※
		//		//   荷姿が荷主ごとに管理するようになった場合はコメントアウトのコードを使用すること
		//		//		//検索条件設定
		//		//		MShapeCB cbMShape = mShapeBhv.newConditionBean();
		//		//		cbMShape.query().setClientId_Equal(mClient.getClientId());
		//		//		cbMShape.query().setShapeCd_InScope(shapeCdMap.keySet()); // 荷姿CDが一緒
		//		//		cbMShape.query().addOrderBy_ShapeCd_Asc();
		//		//
		//		//		//荷姿マスタ取得
		//		//		List<MShape> shapeCdList = mShapeBhv.selectList(cbMShape);
		//		//
		//		//		//取得した荷姿を配列化
		//		//		ArrayList<String> shapeCd = new ArrayList<String>();
		//		//		for (int row = 0; row < shapeCdList.size(); row++) {
		//		//			shapeCd.add(shapeCdList.get(row).getShapeCd());
		//		//		}
		//		long shapeId = shapeLogic.getMaxValue(null);
		//		// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana End
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start

		// [ON推-品向-930] 削除済商品のJANCDは重複チェックの対象としないように修正(削除フラグ自動検索有効化の処理位置を移動) 2015.08.06 kawana

		// エラーフラグ
		boolean isError = false;

		// 各種マスタデータ位置
		int index = 0;

		// 商品マスタボディリスト
		List<MProductShape> lstMProduct = new ArrayList<MProductShape>();

		List<EProduct> eProductList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < productMaster.size(); row++) {
			//データを1行取得
			MProductShapeDto data = productMaster.get(row);

			//商品マスタをエンティティに変換
			MProduct product = productMapper.mappingToEntity(data.getMProduct());
			//			MProductDto product = data.getMProduct();
			//荷主セット
			product.setClientId(mClient.getClientId());

			//商品荷姿マスタをエンティティに変換
			MProductShape productShape = productShapeDtoMapper.mappingToEntity(data);

			// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana Start
			// 荷姿CDから該当する荷姿マスタデータ取得
			// ※※※
			//   荷姿が荷主ごとに管理するようになった場合はコメントアウトのコードを使用すること
			//			index = shapeCd.indexOf(productShape.getMShape().getShapeCd());
			//			if (index != -1) {
			//				productShape.setShapeId(shapeCdList.get(index).getShapeId());
			//			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana End
			// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
			productShape.setUnitNum(0l);
			// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja End

			// 商品IDがNULL(マスタ未登録)の場合、商品CD重複チェックとJANCD重複チェック処理を行う
			if (product.getProductId() == null) {
				// 登録の場合

				// 商品CDから該当する商品マスタデータ取得
				index = productCd.indexOf(product.getProductCd());
				if (index != -1) {
					//見つかった場合は重複エラー
					EProductCB cb = new EProductCB();
					cb.query().setProductId_Equal(product.getReceiveProductId());
					List<EProduct> list = eProductBhv.selectList(cb);
					if (!list.isEmpty()) {
						list.get(0).setErrorFlg("1");
						list.get(0).setErrorMessageCd(WmsMessageConst.PRODUCT_CODE_DUPLICATE_ERROR);
						eProductList.add(list.get(0));
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
						errorCount++;
					}
					//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
					productShape.setErrorFlg("1");
					//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
					// 商品IDがNULL(マスタ未登録)の場合
					//						if (product.getProductId() == null) {
					//							//「0:管理しない」ロット逆転防止フラグを設定
					//							product.setLotReverseFlg_$0();
					//						}
					//						productShape.setMProduct(product);
					//						lstMProduct.add(row, productShape);
					//						continue;
				} else {
					if ((product.getJanCd()) != null) {
						// JANCDから該当する商品マスタデータ取得
						index = janCd.indexOf(product.getJanCd());
						if (index != -1) {
							//見つかった場合は商品CDとも比較
							if (!product.getProductCd().equals(janCdList.get(index).getProductCd())) {
								//商品CD違いの場合は重複エラー
								EProductCB cb = new EProductCB();
								cb.query().setProductId_Equal(product.getReceiveProductId());
								List<EProduct> list = eProductBhv.selectList(cb);
								if (!list.isEmpty()) {
									list.get(0).setErrorFlg("1");
									list.get(0).setErrorMessageCd(WmsMessageConst.JAN_CD_DUPLICATE_ERROR);
									eProductList.add(list.get(0));
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
									// エラー内容ログ書込開始
									addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
									errorCount++;
								}
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
								productShape.setErrorFlg("1");
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
								// 商品IDがNULL(マスタ未登録)の場合
								if (product.getProductId() == null) {
									//「0:管理しない」ロット逆転防止フラグを設定
									product.setLotReverseFlg_$0();
								}
								productShape.setMProduct(product);
								lstMProduct.add(row, productShape);
								continue;
							}
						}
					}
				}
			} else {
				// 更新の場合
				// JANCD重複チェック
				if ((product.getJanCd()) != null) {
					// JANCDから該当する商品マスタデータ取得
					index = janCd.indexOf(product.getJanCd());
					if (index != -1) {
						//見つかった場合は商品CDとも比較
						if (!product.getProductCd().equals(janCdList.get(index).getProductCd())) {
							//商品CD違いの場合は重複エラー
							EProductCB cb = new EProductCB();
							cb.query().setProductId_Equal(product.getReceiveProductId());
							List<EProduct> list = eProductBhv.selectList(cb);
							if (!list.isEmpty()) {
								list.get(0).setErrorFlg("1");
								list.get(0).setErrorMessageCd(WmsMessageConst.JAN_CD_DUPLICATE_ERROR);
								eProductList.add(list.get(0));
								// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
								// エラー内容ログ書込開始
								addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
								// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
								errorCount++;
							}
							//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
							productShape.setErrorFlg("1");
							//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
							// 商品IDがNULL(マスタ未登録)の場合
							if (product.getProductId() == null) {
								//「0:管理しない」ロット逆転防止フラグを設定
								product.setLotReverseFlg_$0();
							}
							productShape.setMProduct(product);
							lstMProduct.add(row, productShape);
							continue;
						}
					}
				}

				// 商品マスタデータ取得
				index = productCd.indexOf(product.getProductCd());
				if (index != -1) {
					// [品質-007] 入数を変更した場合もチェックする様に追加（商品マスタメンテと同じチェックになるように修正）t.koseki Start
					// ロット管理フラグもしくは期限日管理フラグを変える場合は在庫数チェック
					if (product.isDelFlg$1()
							|| !CU.equals(CU.nullToZero(productShape.getUnitNum()).toString(), CU.nullToZero(productCdList.get(index).getMProductShapeList().get(0).getUnitNum()).toString())
							|| !CU.equals(product.getLimitDtManagFlg(), productCdList.get(index).getLimitDtManagFlg())
							|| !CU.equals(product.getLotManagFlg(), productCdList.get(index).getLotManagFlg())) {
						// 共通在庫存在チェックのチェックデータ編集
						TStock tStock = new TStock();
						tStock.setClientId(product.getClientId());
						tStock.setProductId(product.getProductId());
						tStock.setLocationId(null);
						MWarehouse mWarehouse = new MWarehouse();
						mWarehouse.setCenterId(null);
						mWarehouse.setWarehouseId(null);
						// 在庫チェックメソッドを呼出し
						// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
						isError = tStockHandCheckLogic.checkData(tStock, mWarehouse, errRetSts(errRetSts(StatusCode.PRODUCT_MASTER_REGISTER_FAILED), StatusCode.STOCK_DATA_FOUND_ERROR));
						// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
						if (isError) {
								EProductCB cb = new EProductCB();
								cb.query().setProductId_Equal(product.getReceiveProductId());
								List<EProduct> list = eProductBhv.selectList(cb);
								if (!list.isEmpty()) {
									list.get(0).setErrorFlg("1");
									list.get(0).setErrorMessageCd(WmsMessageConst.STOCK_DATA_FOUND_ERROR);
									eProductList.add(list.get(0));
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
									// エラー内容ログ書込開始
									addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
									errorCount++;
								}
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
								productShape.setErrorFlg("1");
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
								// 商品IDがNULL(マスタ未登録)の場合
								if (product.getProductId() == null) {
									//「0:管理しない」ロット逆転防止フラグを設定
									product.setLotReverseFlg_$0();
								}
								productShape.setMProduct(product);
								lstMProduct.add(row, productShape);
								continue;
						}
					}
					// [品質-007] 入数を変更した場合もチェックする様に追加（商品マスタメンテと同じチェックになるように修正）t.koseki End
				}
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			// 商品マスタ受信テーブル．荷姿グループCDが指定された場合、チェックを行う
			if (data.getMProduct().getMShapeGrp().getShapeGrpCd() != null
					&& !data.getMProduct().getMShapeGrp().getShapeGrpCd().equals("")) {
				// 荷主CDにより、荷姿グループCDが荷姿グループマスタに存在チェック
				ListResultBean<MShapeGrpDtl> shapeGrpDtls =
						shapeGroupMasterSelectLogic.selectDtlByClientCdAndProductCd(mClient.getClientCd(),
								data.getMProduct().getMShapeGrp().getShapeGrpCd());
				// 荷姿グループCDが荷姿グループマスタに存在しない場合、エラーにする
				if (shapeGrpDtls == null || shapeGrpDtls.size() == 0) {
					EProductCB cb = new EProductCB();
					cb.query().setProductId_Equal(data.getMProduct().getReceiveProductId());
					List<EProduct> list = eProductBhv.selectList(cb);
					if (!list.isEmpty()) {
						list.get(0).setErrorFlg("1");
						list.get(0).setErrorMessageCd(WmsMessageConst.SHAPE_GROUP_NOT_FOUND_ERROR);
						eProductList.add(list.get(0));
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
						errorCount++;
					}
				} else {
					// 変更場合
					if (product.getProductId() != null) {
						// 在庫管理単位の変更がる場合
						if (!productCdList.get(index).getMShapeGrp().getShapeGrpCd().equals(data.getMProduct().getMShapeGrp().getShapeGrpCd())) {
							// 在庫データ取得処理を呼出し、在庫が存在する場合、在庫管理単位が変更されている場合、エラーメッセージを表示する
							TStock tStock = new TStock();
							tStock.setClientId(mClient.getClientId());
							tStock.setProductId(data.getMProduct().getProductId());
							// 在庫数のチェック処理を行う。
							List<TStock> stockList = tStockHandCheckLogic.selectStock(tStock);
							boolean stockExisted = false;
							// 荷姿グループマスタ．荷姿グループCD＜＞商品マスタ受信テーブル．荷姿グループCD
							if (stockList != null) {
								for (int i = 0; i < stockList.size(); i++) {
									tStock = stockList.get(i);

									// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
									if (!tStock.getMProduct().getMShapeGrp().getShapeGrpCd().equals(data.getMProduct().getMShapeGrp().getShapeGrpCd())) {
										// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

										EProductCB cb = new EProductCB();
										cb.query().setProductId_Equal(data.getMProduct().getReceiveProductId());
										List<EProduct> list = eProductBhv.selectList(cb);
										if (!list.isEmpty()) {
											list.get(0).setErrorFlg("1");
											// エラーメッセージ：商品の在庫があるため、在庫管理単位は変更できません。
											list.get(0).setErrorMessageCd(WmsMessageConst.SHAPE_GROUP_CANNOT_UPDATE_USED_BY_PRODUCT_IN_STOCK_ERROR);
											eProductList.add(list.get(0));
											// エラー内容ログ書込開始
											addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
											errorCount++;
											stockExisted = true;
											break;
										}
									}
								}
							}
							if (!stockExisted) {
								// 在庫管理単位の変更があり、ロケーションマスタの補充商品に使用している場合、エラーとする
								// ロケーションマスタの補充商品に使用しているかどうかをチェックする
								List<MLocation> result = locationMasterSelectLogic.selectByReplenishProductCd(mClient.getClientCd(), data.getMProduct().getProductCd());
								if (result.size() > 0) {
									EProductCB cb = new EProductCB();
									cb.query().setProductId_Equal(data.getMProduct().getReceiveProductId());
									List<EProduct> list = eProductBhv.selectList(cb);
									if (!list.isEmpty()) {
										list.get(0).setErrorFlg("1");
										// 在庫管理単位はロケーション([0])の補充商品に使用しているため、変更できません。
										list.get(0).setErrorMessageCd(WmsMessageConst.PRODUCT_SHAPE_GRP_BULK_CANNOT_UPDATE_USE_LOCATION_ERROR);
										eProductList.add(list.get(0));
										// エラー内容ログ書込開始
										addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
										errorCount++;
									}
								}
							}
						}
					}
				}
			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING End
			// [EC-CT1-164] ロット逆転管理フラグがNullで登録されるので、通常のマスタ登録画面で作業時は"0"で登録されていることを合せるために、ロット逆転管理フラグの設定を追加 2015.04.01 Kyo Start
			// 商品IDがNULL(マスタ未登録)の場合
			if (product.getProductId() == null) {
				//「0:管理しない」ロット逆転防止フラグを設定
				product.setLotReverseFlg_$0();
			}
			// [EC-CT1-164] ロット逆転管理フラグがNullで登録されるので、通常のマスタ登録画面で作業時は"0"で登録されていることを合せるために、ロット逆転管理フラグの設定を追加 2015.04.01 Kyo End

			//マスタ取得データを格納
			productShape.setMProduct(product);
			lstMProduct.add(row, productShape);
		}

		if (!eProductList.isEmpty()) {
			eProductBhv.batchUpdate(eProductList);
		}
		return errorCount;
	}

	// [2.1.0-CT-002]バグ対応修正 2016.11.02 honma Add Start
	/**
	 * <h2>登録データの組み立て。</h2>
	 * <pre>
	 * 一括取込されたCDを元にIDを取得し、データに設定する
	 * 【商品マスタ】
	 * ・荷主ID
	 * 【商品荷姿マスタ】
	 * ・荷姿ID
	 * </pre>
	 * @param mClient 荷主マスタ
	 * @param productMaster 取込商品マスタリスト
	 * @return List<MProductShapeDto> 登録データの組み立て後の取込商品マスタリスト
	 */
	protected List<MProductShapeDto> setupRegisterData(MClient mClient, List<MProductShapeDto> productMaster) {

		//Mapper定義
		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProductShapeDtoMapper productShapeDtoMapper = new MProductShapeDtoMapper();

		for (int row = 0; row < productMaster.size(); row++) {
			ProductDto productDto = getUkEntityWithShape(mClient.getClientId(), productMaster.get(row).getMProduct().getProductCd());
			if (productDto != null && productDto.data.mProduct.getProductId() != null) {
				productMaster.get(row).getMProduct().setProductId(productDto.data.mProduct.getProductId());
				productMaster.get(row).getMProduct().setDelFlg("0");
				productMaster.get(row).getMProduct().setVersionNo(productDto.data.mProduct.getVersionNo());
				productMaster.get(row).getMProduct().setControlNo(productDto.data.mProduct.getControlNo());
				productMaster.get(row).getMProduct().setAddDt(productDto.data.mProduct.getAddDt());
				productMaster.get(row).getMProduct().setAddUser(productDto.data.mProduct.getAddUser());
				productMaster.get(row).getMProduct().setAddProcess(productDto.data.mProduct.getAddProcess());
				productMaster.get(row).getMProduct().setUpdDt(productDto.data.mProduct.getUpdDt());
				productMaster.get(row).getMProduct().setUpdUser(productDto.data.mProduct.getUpdUser());
				productMaster.get(row).getMProduct().setUpdProcess(productDto.data.mProduct.getUpdProcess());
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				productMaster.get(row).getMProduct().setShapeGrpId(productDto.data.mProduct.getShapeGrpId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING End
				productMaster.get(row).setProductId(productDto.data.mProduct.getProductId());
				productMaster.get(row).setProductShapeId(productDto.data.mProduct.getMProductShapeList().get(0).getProductShapeId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				productMaster.get(row).setShapeGrpDtlId(productMaster.get(row).getMShapeGrpDtl().getShapeGrpDtlId());
				// [Ver3.0] unit of measure対応 2017.12.14 NING ENd
				productMaster.get(row).setDelFlg("0");
				productMaster.get(row).setVersionNo(productDto.data.mProduct.getMProductShapeList().get(0).getVersionNo());
				productMaster.get(row).setControlNo(productDto.data.mProduct.getMProductShapeList().get(0).getControlNo());
				productMaster.get(row).setAddDt(productDto.data.mProduct.getMProductShapeList().get(0).getAddDt());
				productMaster.get(row).setAddUser(productDto.data.mProduct.getMProductShapeList().get(0).getAddUser());
				productMaster.get(row).setAddProcess(productDto.data.mProduct.getMProductShapeList().get(0).getAddProcess());
				productMaster.get(row).setUpdDt(productDto.data.mProduct.getMProductShapeList().get(0).getUpdDt());
				productMaster.get(row).setUpdUser(productDto.data.mProduct.getMProductShapeList().get(0).getUpdUser());
				productMaster.get(row).setUpdProcess(productDto.data.mProduct.getMProductShapeList().get(0).getUpdProcess());
			}
		}

		// マスタデータ取得用配列
		HashMap<String, Object> productCdMap = new HashMap<String, Object>();
		HashMap<String, Object> janCdMap = new HashMap<String, Object>();

		// 一覧件数分ループ
		for (int row = 0; row < productMaster.size(); row++) {
			//商品マスタをエンティティに変換
			MProduct product = productMapper.mappingToEntity(productMaster.get(row).getMProduct());

			//商品荷姿マスタをエンティティに変換
			//			MProductShape productShape = productShapeDtoMapper.mappingToEntity(productMaster.get(row));

			//マスタデータ取得用配列に格納
			if (!CU.isNullOrEmpty(product.getProductCd()) && !productCdMap.containsKey(product.getProductCd())) {
				productCdMap.put(product.getProductCd(), null);
			}
			if (!CU.isNullOrEmpty(product.getJanCd()) && !janCdMap.containsKey(product.getJanCd())) {
				janCdMap.put(product.getJanCd(), null);
			}
		}

		// 削除フラグの自動検索無効化 2015/02/19 KAI ADD
		this.setBehaviorAutoDelFlg(false);

		// 商品マスタ一括取得(キー：商品コード)
		//検索条件設定
		MProductCB cbMProductCd = mProductBhv.newConditionBean();
		cbMProductCd.setupSelect_MShapeGrp();
		cbMProductCd.query().setClientId_Equal(mClient.getClientId());
		cbMProductCd.query().setProductCd_InScope(productCdMap.keySet()); // 商品CDが一緒
		cbMProductCd.query().addOrderBy_ProductCd_Asc();

		//商品マスタ取得
		List<MProduct> productCdList = mProductBhv.selectList(cbMProductCd);

		mProductBhv.loadMProductShapeList(productCdList, new ConditionBeanSetupper<MProductShapeCB>() {
			@Override
			public void setup(MProductShapeCB cbPS) {
				cbPS.query().addOrderBy_ProductId_Asc();
			}
		});

		// [ON推-品向-930] 削除済商品のJANCDは重複チェックの対象としないように修正 2015.08.06 kawana Start
		// 削除フラグ自動検索有効化 2015/02/19 KAI ADD
		this.setBehaviorAutoDelFlg(true);
		// [ON推-品向-930] 削除済商品のJANCDは重複チェックの対象としないように修正 2015.08.06 kawana End

		//取得した商品コードを配列化
		ArrayList<String> productCd = new ArrayList<String>();
		for (int row = 0; row < productCdList.size(); row++) {
			productCd.add(productCdList.get(row).getProductCd());
		}

		// 商品マスタ一括取得(キー：JANコード)
		List<MProduct> janCdList = new ArrayList<MProduct>();

		if (janCdMap.size() > 0) {
			//検索条件設定
			MProductCB cbMProductJan = mProductBhv.newConditionBean();
			cbMProductJan.query().setClientId_Equal(mClient.getClientId());
			cbMProductJan.query().setJanCd_InScope(janCdMap.keySet()); // JANCDが一緒
			cbMProductJan.query().addOrderBy_JanCd_Asc();

			//商品マスタ取得
			janCdList = mProductBhv.selectList(cbMProductJan);
		}

		//取得したJANコードを配列化
		ArrayList<String> janCd = new ArrayList<String>();
		for (int row = 0; row < janCdList.size(); row++) {
			janCd.add(janCdList.get(row).getJanCd());
		}

		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
		//		// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana Start
		//		// 荷姿マスタ一括取得(キー：荷姿コード)
		//		// ※※※
		//		//   荷姿が荷主ごとに管理するようになった場合はコメントアウトのコードを使用すること
		//		//		//検索条件設定
		//		//		MShapeCB cbMShape = mShapeBhv.newConditionBean();
		//		//		cbMShape.query().setClientId_Equal(mClient.getClientId());
		//		//		cbMShape.query().setShapeCd_InScope(shapeCdMap.keySet()); // 荷姿CDが一緒
		//		//		cbMShape.query().addOrderBy_ShapeCd_Asc();
		//		//
		//		//		//荷姿マスタ取得
		//		//		List<MShape> shapeCdList = mShapeBhv.selectList(cbMShape);
		//		//
		//		//		//取得した荷姿を配列化
		//		//		ArrayList<String> shapeCd = new ArrayList<String>();
		//		//		for (int row = 0; row < shapeCdList.size(); row++) {
		//		//			shapeCd.add(shapeCdList.get(row).getShapeCd());
		//		//		}
		//		long shapeId = shapeLogic.getMaxValue(null);
		//		// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana End
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start

		// [ON推-品向-930] 削除済商品のJANCDは重複チェックの対象としないように修正(削除フラグ自動検索有効化の処理位置を移動) 2015.08.06 kawana

		// エラーフラグ
		boolean isError = false;

		// 各種マスタデータ位置
		int index = 0;

		// 商品マスタボディリスト
		List<MProductShape> lstMProduct = new ArrayList<MProductShape>();

		List<EProduct> eProductList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < productMaster.size(); row++) {
			//データを1行取得
			MProductShapeDto data = productMaster.get(row);

			//商品マスタをエンティティに変換
			MProduct product = productMapper.mappingToEntity(data.getMProduct());
			//			MProductDto product = data.getMProduct();
			//荷主セット
			product.setClientId(mClient.getClientId());

			//商品荷姿マスタをエンティティに変換
			MProductShape productShape = productShapeDtoMapper.mappingToEntity(data);

			// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana Start
			// 荷姿CDから該当する荷姿マスタデータ取得
			// ※※※
			//   荷姿が荷主ごとに管理するようになった場合はコメントアウトのコードを使用すること
			//			index = shapeCd.indexOf(productShape.getMShape().getShapeCd());
			//			if (index != -1) {
			//				productShape.setShapeId(shapeCdList.get(index).getShapeId());
			//			}
			// [Ver3.0] unit of measure対応 2017.12.14 NING Del
			// [ON推-品向-816] 他荷主での更新登録で致命的エラー 2015.05.28 kawana End
			// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
			productShape.setUnitNum(0l);
			// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja End

			// 商品IDがNULL(マスタ未登録)の場合、商品CD重複チェックとJANCD重複チェック処理を行う
			if (product.getProductId() == null) {
				// 登録の場合

				// 商品CDから該当する商品マスタデータ取得
				index = productCd.indexOf(product.getProductCd());
				if (index == -1) {
					if ((product.getJanCd()) != null) {
						// JANCDから該当する商品マスタデータ取得
						index = janCd.indexOf(product.getJanCd());
						if (index != -1) {
							//見つかった場合は商品CDとも比較
							if (!product.getProductCd().equals(janCdList.get(index).getProductCd())) {
								//商品CD違いの場合は重複エラー
								EProductCB cb = new EProductCB();
								cb.query().setProductId_Equal(product.getReceiveProductId());
								List<EProduct> list = eProductBhv.selectList(cb);
								if (!list.isEmpty()) {
									list.get(0).setErrorFlg("1");
									list.get(0).setErrorMessageCd(WmsMessageConst.JAN_CD_DUPLICATE_ERROR);
									eProductList.add(list.get(0));
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
									// エラー内容ログ書込開始
									addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
								}
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
								productShape.setErrorFlg("1");
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
								// 商品IDがNULL(マスタ未登録)の場合
								if (product.getProductId() == null) {
									//「0:管理しない」ロット逆転防止フラグを設定
									product.setLotReverseFlg_$0();
								}
								productShape.setMProduct(product);
								lstMProduct.add(row, productShape);
								continue;
							}
						}
					}
				}
			} else {
				// 更新の場合
				// JANCD重複チェック
				if ((product.getJanCd()) != null) {
					// JANCDから該当する商品マスタデータ取得
					index = janCd.indexOf(product.getJanCd());
					if (index != -1) {
						//見つかった場合は商品CDとも比較
						if (!product.getProductCd().equals(janCdList.get(index).getProductCd())) {
							//商品CD違いの場合は重複エラー
							EProductCB cb = new EProductCB();
							cb.query().setProductId_Equal(product.getReceiveProductId());
							List<EProduct> list = eProductBhv.selectList(cb);
							if (!list.isEmpty()) {
								list.get(0).setErrorFlg("1");
								list.get(0).setErrorMessageCd(WmsMessageConst.JAN_CD_DUPLICATE_ERROR);
								eProductList.add(list.get(0));
								// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
								// エラー内容ログ書込開始
								addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
								// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
							}
							//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
							productShape.setErrorFlg("1");
							//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
							// 商品IDがNULL(マスタ未登録)の場合
							if (product.getProductId() == null) {
								//「0:管理しない」ロット逆転防止フラグを設定
								product.setLotReverseFlg_$0();
							}
							productShape.setMProduct(product);
							lstMProduct.add(row, productShape);
							continue;
						}
					}
				}

				// 商品マスタデータ取得
				index = productCd.indexOf(product.getProductCd());
				if (index != -1) {
					// [品質-007] 入数を変更した場合もチェックする様に追加（商品マスタメンテと同じチェックになるように修正）t.koseki Start
					// ロット管理フラグもしくは期限日管理フラグを変える場合は在庫数チェック
					if (product.isDelFlg$1()
							|| !CU.equals(CU.nullToZero(productShape.getUnitNum()).toString(), CU.nullToZero(productCdList.get(index).getMProductShapeList().get(0).getUnitNum()).toString())
							|| !CU.equals(product.getLimitDtManagFlg(), productCdList.get(index).getLimitDtManagFlg())
							|| !CU.equals(product.getLotManagFlg(), productCdList.get(index).getLotManagFlg())) {
						// 共通在庫存在チェックのチェックデータ編集
						TStock tStock = new TStock();
						tStock.setClientId(product.getClientId());
						tStock.setProductId(product.getProductId());
						tStock.setLocationId(null);
						MWarehouse mWarehouse = new MWarehouse();
						mWarehouse.setCenterId(null);
						mWarehouse.setWarehouseId(null);
						// 在庫チェックメソッドを呼出し
						// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
						isError = tStockHandCheckLogic.checkData(tStock, mWarehouse, errRetSts(errRetSts(StatusCode.PRODUCT_MASTER_REGISTER_FAILED), StatusCode.STOCK_DATA_FOUND_ERROR));
						// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
						if (isError) {
								EProductCB cb = new EProductCB();
								cb.query().setProductId_Equal(product.getReceiveProductId());
								List<EProduct> list = eProductBhv.selectList(cb);
								if (!list.isEmpty()) {
									list.get(0).setErrorFlg("1");
									list.get(0).setErrorMessageCd(WmsMessageConst.STOCK_DATA_FOUND_ERROR);
									eProductList.add(list.get(0));
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
									// エラー内容ログ書込開始
									addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
									// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
								}
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod Start
								productShape.setErrorFlg("1");
								//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.16 chou Mod End
								// 商品IDがNULL(マスタ未登録)の場合
								if (product.getProductId() == null) {
									//「0:管理しない」ロット逆転防止フラグを設定
									product.setLotReverseFlg_$0();
								}
								productShape.setMProduct(product);
								lstMProduct.add(row, productShape);
								continue;
						}
					}
					// [品質-007] 入数を変更した場合もチェックする様に追加（商品マスタメンテと同じチェックになるように修正）t.koseki End
				}
			}

			// 商品マスタ受信テーブル．荷姿グループCDが指定された場合、チェックを行う
			if (data.getMProduct().getMShapeGrp().getShapeGrpCd() != null
					&& !data.getMProduct().getMShapeGrp().getShapeGrpCd().equals("")) {
				// 荷主CDにより、荷姿グループCDが荷姿グループマスタに存在チェック
				ListResultBean<MShapeGrpDtl> shapeGrpDtls =
						shapeGroupMasterSelectLogic.selectDtlByClientCdAndProductCd(mClient.getClientCd(),
								data.getMProduct().getMShapeGrp().getShapeGrpCd());
				// 荷姿グループCDが荷姿グループマスタに存在しない場合、エラーにする
				if (shapeGrpDtls == null || shapeGrpDtls.size() == 0) {
					EProductCB cb = new EProductCB();
					cb.query().setProductId_Equal(data.getMProduct().getReceiveProductId());
					List<EProduct> list = eProductBhv.selectList(cb);
					if (!list.isEmpty()) {
						list.get(0).setErrorFlg("1");
						list.get(0).setErrorMessageCd(WmsMessageConst.SHAPE_GROUP_NOT_FOUND_ERROR);
						eProductList.add(list.get(0));
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
					}
				} else {
					// 変更場合
					if (product.getProductId() != null) {
						// 在庫管理単位の変更がる場合
						if (!productCdList.get(index).getMShapeGrp().getShapeGrpCd().equals(data.getMProduct().getMShapeGrp().getShapeGrpCd())) {
							// 在庫データ取得処理を呼出し、在庫が存在する場合、在庫管理単位が変更されている場合、エラーメッセージを表示する
							TStock tStock = new TStock();
							tStock.setClientId(mClient.getClientId());
							tStock.setProductId(data.getMProduct().getProductId());
							// 在庫数のチェック処理を行う。
							List<TStock> stockList = tStockHandCheckLogic.selectStock(tStock);
							// 荷姿グループマスタ．荷姿グループCD＜＞商品マスタ受信テーブル．荷姿グループCD\
							boolean stockExisted = false;
							if (stockList != null) {
								for (int i = 0; i < stockList.size(); i++) {
									tStock = stockList.get(i);
									// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
									if (!tStock.getMProduct().getMShapeGrp().getShapeGrpCd().equals(data.getMProduct().getMShapeGrp().getShapeGrpCd())) {
										// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End
										EProductCB cb = new EProductCB();
										cb.query().setProductId_Equal(data.getMProduct().getReceiveProductId());
										List<EProduct> list = eProductBhv.selectList(cb);
										if (!list.isEmpty()) {
											list.get(0).setErrorFlg("1");
											// エラーメッセージ：商品の在庫があるため、在庫管理単位は変更できません。
											list.get(0).setErrorMessageCd(WmsMessageConst.SHAPE_GROUP_CANNOT_UPDATE_USED_BY_PRODUCT_IN_STOCK_ERROR);
											eProductList.add(list.get(0));
											// エラー内容ログ書込開始
											addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
											stockExisted = true;
											break;
										}
									}
								}
							}
							if (!stockExisted) {
								// 在庫管理単位の変更があり、ロケーションマスタの補充商品に使用している場合、エラーとする
								// ロケーションマスタの補充商品に使用しているかどうかをチェックする
								List<MLocation> result = locationMasterSelectLogic.selectByReplenishProductCd(mClient.getClientCd(), data.getMProduct().getProductCd());
								if (result.size() > 0) {
									EProductCB cb = new EProductCB();
									cb.query().setProductId_Equal(data.getMProduct().getReceiveProductId());
									List<EProduct> list = eProductBhv.selectList(cb);
									if (!list.isEmpty()) {
										list.get(0).setErrorFlg("1");
										// 在庫管理単位はロケーション([0])の補充商品に使用しているため、変更できません。
										list.get(0).setErrorMessageCd(WmsMessageConst.PRODUCT_SHAPE_GRP_BULK_CANNOT_UPDATE_USE_LOCATION_ERROR);
										eProductList.add(list.get(0));
										// エラー内容ログ書込開始
										addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(list.get(0).getReceiveRowId()), list.get(0).getErrorMessageCd());
									}
								}

							}
							product.setShapeGrpId(data.getMProduct().getMShapeGrp().getShapeGrpId());
						}
					}
				}
			}

			// [#490] ロット逆転管理フラグがファイルの内容で登録されない不具合を修正 2016.12.19 kawana Start
			// [EC-CT1-164] ロット逆転管理フラグがNullで登録されるので、通常のマスタ登録画面で作業時は"0"で登録されていることを合せるために、ロット逆転管理フラグの設定を追加 2015.04.01 Kyo Start
			if (product.getProductId() == null && product.getLotReverseFlg() == null) {
				// 商品新規登録の場合 で ロット逆転防止フラグがnullされていない場合

				// [#490] ロット逆転管理フラグがファイルの内容で登録されない不具合を修正 2016.12.19 kawana End

				//「0:管理しない」ロット逆転防止フラグを設定
				product.setLotReverseFlg_$0();
			}
			// [EC-CT1-164] ロット逆転管理フラグがNullで登録されるので、通常のマスタ登録画面で作業時は"0"で登録されていることを合せるために、ロット逆転管理フラグの設定を追加 2015.04.01 Kyo End

			//マスタ取得データを格納
			productShape.setMProduct(product);
			lstMProduct.add(row, productShape);
		}

		if (!eProductList.isEmpty()) {
			eProductBhv.batchUpdate(eProductList);
		}

		// Dto変換処理
		List<MProductShapeDto> bodyList = productShapeDtoMapper.mappingToDtoList(lstMProduct);

		//設定した結果を返す
		return bodyList;
	}
	// [2.1.0-CT-002]バグ対応修正 2016.11.02 honma Add End

	/**
	 * <h2>商品マスタ受信テーブル検索(商品荷姿マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param mClient 荷主マスタ：荷主ID
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<MProductShapeDto> selectAndConvertEProductList(String receiveCd, MClient mClient, SelectCls cls) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		return selectAndConvertEProductList(receiveCd, null, mClient, cls, false);
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
	}

	/**
	 * <h2>商品マスタ受信テーブル検索(商品荷姿マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param paging ページング設定
	 * @param mClient 荷主マスタ：荷主ID
	 * @param cls エラー検索区分
	 * @param searchFlg 検索結果フラグ
	 * @return 検索結果のリスト
	 */
	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	public List<MProductShapeDto> selectAndConvertEProductList(String receiveCd, PagingData paging, MClient mClient, SelectCls cls, boolean searchFlg) {
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
		// ロット管理フラグ DTO
		ListResultBean<BClassDtl> lotManagFlgList = productSelectLogic.getBClassList("LOT_MANAG_FLG");
		// 期限日管理フラグ DTO
		ListResultBean<BClassDtl> limitDtManagFlgList = productSelectLogic.getBClassList("LIMIT_DT_MANAG_FLG");
		// 期限日逆転防止フラグ DTO
		ListResultBean<BClassDtl> limitDtReverseFlgList = productSelectLogic.getBClassList("LIMIT_DT_REVERSE_FLG");
		// 入庫No.マージ区分 DTO
		ListResultBean<BClassDtl> mergeClsList = productSelectLogic.getBClassList("MERGE_CLS");
		// 出荷停止フラグ DTO
		ListResultBean<BClassDtl> shippingStopFlgList = productSelectLogic.getBClassList("SHIPPING_STOP_FLG");
		// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End

		// 外出しSQLの定義
		String path = EProductBhv.PATH_selectSqlEProductList;

		BsSqlEProductListPmb pmb = new BsSqlEProductListPmb();
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

		Class<SqlEProductListDto> entityType = SqlEProductListDto.class;

		List<SqlEProductListDto> sqlDtoList;
		if (paging != null) {
			sqlDtoList = super.selectPage(eProductBhv, path, pmb, entityType, paging);
		} else {
			sqlDtoList = super.selectList(eProductBhv, path, pmb, entityType);
		}

		List<MProductShapeDto> result = new ArrayList<>();

		for (SqlEProductListDto sqlDto : sqlDtoList) {
			MProductShapeDto searchDto = new MProductShapeDto();
			searchDto.setLineNo(CU.convertNumberToString(sqlDto.getReceiveRowId()));
			searchDto.setErrorFlg(sqlDto.getErrorFlg());
			searchDto.setErrorMessageCd(sqlDto.getErrorMessageCd());
			searchDto.setErrorMessageNm(sqlDto.getMessageNm());
			MProductDto product = new MProductDto();
			// 商品マスタ
			product.setReceiveProductId(sqlDto.getProductId());
			product.setClientId(mClient.getClientId());
			product.setProductCd(sqlDto.getProductCd());
			product.setProductNm(sqlDto.getProductNm());
			product.setProductAbbr(sqlDto.getProductAbbr());
			product.setJanCd(sqlDto.getJanCd());
			product.setLotManagFlg(sqlDto.getLotManagFlg());
			String lotManagFlgNm = sqlDto.getLotManagFlg();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
			for (BClassDtl lotManagFlg : lotManagFlgList) {
				if (lotManagFlg.getClassDtlCd().equals(sqlDto.getLotManagFlg())){
					lotManagFlgNm = sqlDto.getLotManagFlg()+":"+lotManagFlg.getVDict().getDictNm();
					break;
				}
			}
			product.setLotManagNm(lotManagFlgNm);

			// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu

			String limitDtManagFlgNm = sqlDto.getLimitDtManagFlg();
			product.setLimitDtManagFlg(sqlDto.getLimitDtManagFlg());
			for (BClassDtl limitDtManagFlg : limitDtManagFlgList) {
				if (limitDtManagFlg.getClassDtlCd().equals(sqlDto.getLimitDtManagFlg())){
					limitDtManagFlgNm = sqlDto.getLimitDtManagFlg()+":"+limitDtManagFlg.getVDict().getDictNm();
					break;
				}
			}
			product.setLimitDtManagNm(limitDtManagFlgNm);

			String limitDtReverseFlgNm = sqlDto.getLimitDtReverseFlg();
			product.setLimitDtReverseFlg(sqlDto.getLimitDtReverseFlg());
			for (BClassDtl limitDtReverseFlg : limitDtReverseFlgList) {
				if (limitDtReverseFlg.getClassDtlCd().equals(sqlDto.getLimitDtReverseFlg())){
					limitDtReverseFlgNm = sqlDto.getLimitDtReverseFlg()+":"+limitDtReverseFlg.getVDict().getDictNm();
					break;
				}
			}
			product.setLimitDtReverseNm(limitDtReverseFlgNm);

			// [Ver3.0][#3892] 小数チェック追加 2018.03.01 shimizu Start
			if (CU.isNullOrEmpty(sqlDto.getReceiveLimitNum()) || !checkExcelCellInput("^(-)?\\d+$", sqlDto.getReceiveLimitNum())) {
				product.setReceiveLimitNum(null);
			} else {
				product.setReceiveLimitNum(Long.parseLong(sqlDto.getReceiveLimitNum()));
			}
			if (CU.isNullOrEmpty(sqlDto.getShippingLimitNum()) || !checkExcelCellInput("^(-)?\\d+$", sqlDto.getShippingLimitNum())) {
				product.setShippingLimitNum(null);
			} else {
				product.setShippingLimitNum(Long.parseLong(sqlDto.getShippingLimitNum()));
			}
			// [Ver3.0][#3892] 小数チェック追加 2018.03.01 shimizu End

			String mergeClsNm = sqlDto.getMergeCls();
			product.setMergeCls(sqlDto.getMergeCls());
			for (BClassDtl mergeCls : mergeClsList) {
				if (mergeCls.getClassDtlCd().equals(sqlDto.getMergeCls())){
					mergeClsNm = sqlDto.getMergeCls()+":"+mergeCls.getVDict().getDictNm();
					break;
				}
			}
			product.setMergeClsNm(mergeClsNm);

			String shippingStopFlgNm = sqlDto.getShippingStopFlg();
			product.setShippingStopFlg(sqlDto.getShippingStopFlg());
			for (BClassDtl shippingStopFlg : shippingStopFlgList) {
				if (shippingStopFlg.getClassDtlCd().equals(sqlDto.getShippingStopFlg())){
					shippingStopFlgNm = sqlDto.getShippingStopFlg()+":"+shippingStopFlg.getVDict().getDictNm();
					break;
				}
			}
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End
			product.setShippingStopNm(shippingStopFlgNm);

			product.setFixedPoint(CU.isNullOrEmpty(sqlDto.getFixedPoint()) ? null : WCC.toBigDecimal(sqlDto.getFixedPoint()));
			// [Ver3.0] unit of measure対応 2017.12.14 NING Start
			MShapeGrpDto mShapeGrp = new MShapeGrpDto();

			String shapeGrpCd = null;

			// [Ver3.0][4541] ETLツールにて、商品マスタを取り込むとアベンド_空文字判定を追加 2018.05.11 shimizu Start
			if (sqlDto.getShapeGrpCd() != null && !sqlDto.getShapeGrpCd().equals("")) {
				shapeGrpCd = sqlDto.getShapeGrpCd();
			} else {
				//在庫管理単位が未指定の場合、荷主マスタと紐づく荷姿グループCDを設定する
				MClient tmpClient = clientLogic.getEntityWithShapeGrp(mClient, null);
				if(tmpClient != null && tmpClient.getMShapeGrp() != null) {
					shapeGrpCd = tmpClient.getMShapeGrp().getShapeGrpCd();
				}
			}
			// [Ver3.0][4541] ETLツールにて、商品マスタを取り込むとアベンド_空文字判定を追加 2018.05.11 shimizu End

			mShapeGrp.setShapeGrpCd(shapeGrpCd);
			if (shapeGrpCd != null) {
				// 既存荷姿グループを選択する。
				MShapeGrp existedShapeGrp = shapeGroupMasterSelectLogic.selectByClientIdAndGrpCd(mClient.getClientId(), shapeGrpCd);
				if (existedShapeGrp != null) {
					MShapeGrpDtoMapper mapper = new MShapeGrpDtoMapper();
					mShapeGrp = mapper.mappingToDto(existedShapeGrp);
					product.setShapeGrpId(mShapeGrp.getShapeGrpId());
				}
				// 既存荷姿グループ詳細を選択する。
				ListResultBean<MShapeGrpDtl> existedShapeGrpDtls = shapeGroupMasterSelectLogic.selectDtlByClientCdAndProductCd(mClient.getClientCd(), shapeGrpCd);
				MShapeGrpDtl existedShapeGrpDtl = null;
				if (existedShapeGrpDtls != null && existedShapeGrpDtls.size() > 0) {
					existedShapeGrpDtl = existedShapeGrpDtls.get(0);
					// 在庫最小単位の荷姿グループ明細IDを格納する。
					searchDto.setShapeGrpDtlId(existedShapeGrpDtl.getShapeGrpDtlId());
					MShapeGrpDtlDtoMapper mapper = new MShapeGrpDtlDtoMapper();
					MShapeGrpDtlDto shapeGrpDtlDto = mapper.mappingToDto(existedShapeGrpDtl);
					searchDto.setMShapeGrpDtl(shapeGrpDtlDto);
				}
				if (searchFlg) {
					// 取込ファイルに「在庫管理単位」が空白の場合、画面上も空白に。
					if (CU.isNullOrEmpty(sqlDto.getShapeGrpCd())) {
						mShapeGrp.setShapeGrpCd("");
					} else if (existedShapeGrpDtl != null){
						mShapeGrp.setShapeGrpCd(shapeGrpCd + "：" + existedShapeGrpDtl.getMShape().getVDictByShapeDictId().getDictNm() + "（" + existedShapeGrpDtl.getMShapeGrp().getShapeGrpName() + "）");
					}
				}
			}

			product.setMShapeGrp(mShapeGrp);
			// [Ver3.0] unit of measure対応 2017.12.14 NING End
			searchDto.setMProduct(product);

			searchDto.setLength(CU.isNullOrEmpty(sqlDto.getLength()) ? null : WCC.toBigDecimal(sqlDto.getLength()));
			searchDto.setWidth(CU.isNullOrEmpty(sqlDto.getWidth()) ? null : WCC.toBigDecimal(sqlDto.getWidth()));
			searchDto.setHeight(CU.isNullOrEmpty(sqlDto.getHeight()) ? null : WCC.toBigDecimal(sqlDto.getHeight()));
			searchDto.setVolume(CU.isNullOrEmpty(sqlDto.getVolume()) ? null : WCC.toBigDecimal(sqlDto.getVolume()));
			searchDto.setNetWeight(CU.isNullOrEmpty(sqlDto.getNetWeight()) ? null : WCC.toBigDecimal(sqlDto.getNetWeight()));
			searchDto.setGrossWeight(CU.isNullOrEmpty(sqlDto.getGrossWeight()) ? null : WCC.toBigDecimal(sqlDto.getGrossWeight()));

			result.add(searchDto);
		}

		return result;

	}

	/**
	 * <h2>商品マスタデータ取得</h2>
	 * <pre>
	 * 商品マスタデータの取得処理
	 * </pre>
	 * @param clientId 荷主
	 * @param productCd 商品CD
	 * @return ProductDto 商品マスタ検索結果
	 */
	public ProductDto getUkEntityWithShape(Long clientId, String productCd) {

		MProduct conditionEntity = new MProduct();
		conditionEntity.setClientId(clientId);
		conditionEntity.setProductCd(productCd);

		MProduct entity = getUkEntityWithShape(conditionEntity);

		if (entity == null) {
			return null;
		}

		MProductDtoMapper mapper = new MProductDtoMapper();
		MProductDto dto = mapper.mappingToDto(entity);

		ProductDto resultDto = new ProductDto();
		resultDto.data.mProduct = dto;

		return resultDto;
	}

	//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.07 chou Add Start
	/**
	 * <h2>登録時点にデータがマスタに存在しないかをチェックして該当データを削除。</h2>
	 * <pre>
	 * ロット管理フラグなどが区分値明細マスタに存在するかどうかをチェック。
	 * チェックNGの場合、商品マスタ受信テーブルの更新（エラーフラグ、エラーメッセージCD）を行って、
	 * 該当データをリストから削除する。
	 * </pre>
	 * @param productMasterBulkInputDto 商品マスタ一括取込画面用DTO
	 * @param receiveCd 受信ID
	 * @return int エラー件数
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
	public int checkRemoveNotExistsDataForRegister(ProductMasterBulkInputDto productMasterBulkInputDto, String receiveCd) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
		int errorCount = 0;
//		boolean hasError = false;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
		boolean errFlg = false;
		//エラーフラグ
		String errorFlg = "1";
		//エラーメッセージCD
		String errorMessageCd = "";

		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterBulkInputDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		List<MProductShapeDto> list = selectAndConvertEProductList(receiveCd, mClient, SelectCls.NO_ERROR_ONLY);

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
		//区分値明細マスタから各区分値を取得
		ListResultBean<BClassDtl> lotManagFlgList = productSelectLogic.getBClassList("LOT_MANAG_FLG");
		ListResultBean<BClassDtl> limitDtManagFlgList = productSelectLogic.getBClassList("LIMIT_DT_MANAG_FLG");
		ListResultBean<BClassDtl> limitDtReverseFlgList = productSelectLogic.getBClassList("LIMIT_DT_REVERSE_FLG");
		ListResultBean<BClassDtl> mergeClsList = productSelectLogic.getBClassList("MERGE_CLS");
		ListResultBean<BClassDtl> shippingStopFlgList = productSelectLogic.getBClassList("SHIPPING_STOP_FLG");
		// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End
		//受信行IDのリスト
		List<Long> receiveRowIdList = new ArrayList<Long>();

		//受信行IDリストの取得
		EProductCB eProductCB = new EProductCB();
		eProductCB.specify().columnReceiveRowId();
		eProductCB.query().setReceiveCd_Equal(receiveCd);
		eProductCB.query().setErrorFlg_Equal("0");
		eProductCB.query().addOrderBy_ReceiveRowId_Asc();
		List<EProduct> eProductList = eProductBhv.selectList(eProductCB);

		for (EProduct data : eProductList) {
			receiveRowIdList.add(data.getReceiveRowId());
		}

		//受信行ID
		Long receiveRowId = 0L;
		Iterator<MProductShapeDto> iterator = list.iterator();
		int row = 0;

		while (iterator.hasNext()) {

			MProductShapeDto mProductShape = iterator.next();

			if ("1".equals(mProductShape.getErrorFlg())) {
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//				hasError = true;
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
				continue;
			}

			errFlg = false;
			receiveRowId = receiveRowIdList.get(row);

			//商品マスタをエンティティに変換
			MProductDto product = mProductShape.getMProduct();

			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
			//ロット管理フラグ
			String lotManagFlg = product.getLotManagFlg();
			if (!errFlg) {
				boolean isExist = true;
				for (BClassDtl bClassDtl : lotManagFlgList) {
					if (bClassDtl.getClassDtlCd().equals(lotManagFlg)) {
						isExist = false;
						break;
					}
				}
				if (isExist) {
					errorMessageCd = WmsMessageConst.LOT_MANAG_FLG_NOT_FOUND_ERROR;
					errFlg = true;
				}
			}

			// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu

			//期限日管理フラグ
			String limitDtManagFlg = product.getLimitDtManagFlg();
			if (!errFlg) {
				boolean isExist = true;
				for (BClassDtl bClassDtl : limitDtManagFlgList) {
					if (bClassDtl.getClassDtlCd().equals(limitDtManagFlg)) {
						isExist = false;
						break;
					}
				}
				if (isExist) {
					errorMessageCd = WmsMessageConst.LIMIT_DT_MANAG_FLG_NOT_FOUND_ERROR;
					errFlg = true;
				}
			}

			//期限日逆転防止フラグ
			String limitDtReverseFlg = product.getLimitDtReverseFlg();
			if (!errFlg) {
				boolean isExist = true;
				for (BClassDtl bClassDtl : limitDtReverseFlgList) {
					if (bClassDtl.getClassDtlCd().equals(limitDtReverseFlg)) {
						isExist = false;
						break;
					}
				}
				if (isExist) {
					errorMessageCd = WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR;
					errFlg = true;
				}
			}

			//入庫No.マージ区分
			String mergeCls = product.getMergeCls();
			if (!errFlg) {
				boolean isExist = true;
				for (BClassDtl bClassDtl : mergeClsList) {
					if (bClassDtl.getClassDtlCd().equals(mergeCls)) {
						isExist = false;
						break;
					}
				}
				if (isExist) {
					errorMessageCd = WmsMessageConst.MERGE_CLS_NOT_FOUND_ERROR;
					errFlg = true;
				}
			}

			//出荷停止フラグ
			String shippingStopFlg = product.getShippingStopFlg();
			if (!errFlg) {
				boolean isExist = true;
				for (BClassDtl bClassDtl : shippingStopFlgList) {
					if (bClassDtl.getClassDtlCd().equals(shippingStopFlg)) {
						isExist = false;
						break;
					}
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End
				}
				if (isExist) {
					errorMessageCd = WmsMessageConst.SHIPPING_STOP_FLG_NOT_FOUND_ERROR;
					errFlg = true;
				}
			}

			if (errFlg) {

				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//				hasError = true;
				errorCount++;
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

				//商品マスタ受信テーブルの更新（エラーフラグ、エラーメッセージCD）
				EProductCB cb = new EProductCB();
				cb.query().setReceiveCd_Equal(receiveCd);
				cb.query().setReceiveRowId_Equal(receiveRowId);

				EProduct eProduct = eProductBhv.selectEntity(cb);
				eProduct.setErrorFlg(errorFlg);
				eProduct.setErrorMessageCd(errorMessageCd);
				eProductBhv.update(eProduct);

				//チェックNGのデータをリストから削除する
				iterator.remove();
			}

			row ++;

		}

		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//		return hasError;
		return errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

	}
	//[ON推-1.1.4-CT-087]CT指摘の修正対応 2016.06.07 chou Add End

	/**
	 * <h2>商品マスタ登録一括登録.</h2>
	 * @param locationMasterDto ロケーションマスタ一括取込画面用DTO
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(ProductMasterBulkInputDto productMasterBulkInputDto, ErrorStatus errSts) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		// 受信CD
		String receiveCd = productMasterBulkInputDto.data.receiveCd;

		MProductDtoMapper productMapper = new MProductDtoMapper();
		MProduct header = productMapper.mappingToEntity(productMasterBulkInputDto.data.head);

		//荷主ID取得
		String clientCd = header.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return;
		}

		List<MProductShapeDto> productMaster = selectAndConvertEProductList(receiveCd, mClient, SelectCls.NO_ERROR_ONLY);

		// [2.1.0-CT-002]バグ対応修正 2016.11.02 honma Mod Start
		// 登録データの組み立て
		productMaster = setupRegisterData(mClient, productMaster);
		// [2.1.0-CT-002]バグ対応修正 2016.11.02 honma Mod End

		//商品似姿マスタ
		MProductShapeDtoMapper productShapeDtoMapper = new MProductShapeDtoMapper();

		// 商品マスタ
		MProduct mProduct = new MProduct();

		// 商品荷姿マスタ
		MProductShape mProductShape = new MProductShape();

		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
		//		// 荷姿マスタ
		//		MShape mShape = new MShape();
		// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja End

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return;
		}

		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
		List<MProductShape> productShapeInsList = new ArrayList<>();

		List<MProductShape> productShapeUpdList = new ArrayList<>();
		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		List<MProductShape> productShapeDelList = new ArrayList<>();
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		List<MProduct> productUpdList = new ArrayList<>();
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End

		List<EProduct> eProductList = new ArrayList<>();


		//一覧データ件数分ループ
		for (int row = 0; row < productMaster.size(); row++) {
			MProductShapeDto data = productMaster.get(row);
			if ("1".equals(data.getErrorFlg())) {
				continue;
			}
			//商品マスタをエンティティに変換
			mProduct = productMapper.mappingToEntity(data.getMProduct());

			//商品荷姿マスタをエンティティに変換
			mProductShape = productShapeDtoMapper.mappingToEntity(data);

			// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
			//			// 荷姿マスタデータ取得
			//			mShape = shapeDtoMapper.mappingToEntity(data.getMShape());
			// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja End

			// 商品IDがNULL(マスタ未登録)の場合、商品マスタ登録、登録済みの場合は商品マスタ更新
			if (mProduct.getProductId() == null) {
				// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja Start
				// 商品マスタ登録メソッドを呼出し
				//				productMasterInsertLogic.insert(mProduct, mProductShape, mShape, errRetSts(StatusCode.PRODUCT_MASTER_INSERT_FAILED, row));
				//				productMasterInsertLogic.insert(mProduct, mProductShape, errRetSts(StatusCode.PRODUCT_MASTER_INSERT_FAILED, row));
				// [エンハンス PH2.0] 商品マスタ一括取込荷姿内容を変更 2015.11.30 sja End
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
				//検索条件の設定
				MProduct result = null;
				MProductCB cb = mProductBhv.newMyConditionBean();

				//荷主IDの設定
				cb.query().setClientId_Equal(mProduct.getClientId());
				//商品CDの設定
				cb.query().setProductCd_Equal(mProduct.getProductCd());

				result = mProductBhv.selectEntity(cb);

				if (result == null) {
					//存在なかった場合
					// ===== 商品マスタ登録実行 =====
					mProductBhv.insert(mProduct);
					// ===== 商品荷姿マスタ登録実行 =====
					mProductShape.setProductId(mProduct.getProductId());
					productShapeInsList.add(mProductShape);
				} else {
					EProduct eProduct = eProductBhv.selectByPKValue(mProduct.getReceiveProductId());
					if (eProduct != null) {
						eProduct.setErrorFlg("1");
						eProduct.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						eProductList.add(eProduct);
					}
				}
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
			} else {
				// 商品マスタ更新メソッドを呼出し
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
				List<MProduct> result = productSelectLogic.selectById(mProduct, errSts);
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				boolean insProductShape = false;
				// [Ver3.0] unit of measure対応 2017.12.14 NING End
				for (MProduct product : result) {
					if (mProduct.isDelFlg$1()
							|| !CU.equals(CU.nullToZero(mProductShape.getUnitNum()).toString(), CU.nullToZero(product.getMProductShapeList().get(0).getUnitNum()).toString())
							|| !CU.equals(mProduct.getLimitDtManagFlg(), product.getLimitDtManagFlg())
							|| !CU.equals(mProduct.getLotManagFlg(), product.getLotManagFlg())) {

						MWarehouse mWarehouse = new MWarehouse();
						TStock tStock = new TStock();
						tStock.setClientId(mProduct.getClientId());
						tStock.setProductId(mProduct.getProductId());
						if (tStockHandCheckLogic.checkDataZeroChargeNum(tStock, mWarehouse, errSts)) {
							EProduct eProduct = eProductBhv.selectByPKValue(mProduct.getReceiveProductId());
							if (eProduct != null) {
								eProduct.setErrorFlg("1");
								eProduct.setErrorMessageCd(WmsMessageConst.UPDATE_PRODUCT_STOCK_FOUND_ERROR);
								eProductList.add(eProduct);
								continue;
							}
						}
					} else {
						// [Ver3.0] unit of measure対応 2017.12.14 NING Start
						// 在庫管理単位変わらない場合、かつ最小在庫管理単位は使用している場合、変更できません。
						if (product.getMShapeGrp().getShapeGrpCd().equals(data.getMProduct().getMShapeGrp().getShapeGrpCd())) {
							// 最小単位の荷姿グループ明細を取得する。
							MShapeGrpDtl shapeGrpDtl = shapeLogic.getMinShapeGrpDtl(data.getMProduct().getMShapeGrp().getShapeGrpId());
							if (shapeGrpDtl != null) {
								// 最小在庫管理単位は使用しているチェック
								List<MProductShape> resultList = productShapeLogic.getProdutShapeListById(product.getProductId(), shapeGrpDtl.getShapeGrpDtlId());
								// 商品荷姿マスタに、既存荷姿グループ明細がある場合、エラー
								if (resultList == null || resultList.size() > 1) {
									EProduct eProduct = eProductBhv.selectByPKValue(mProduct.getReceiveProductId());
									if (eProduct != null) {
										eProduct.setErrorFlg("1");
										eProduct.setErrorMessageCd(WmsMessageConst.PRODUCT_SHAPE_GRP_DTL_CANNOT_UPDATE_ERROR);
										eProductList.add(eProduct);
										getErrorManager().add(errSts, WmsMessageConst.ERROR_DATA_FOUND_ERROR);
										continue;
									}
								}
							}
						} else {
							// 在庫管理単位変わる場合、商品荷姿マスタがDELETE⇒INSERT
							// 既存荷姿グループ明細選択
							for (Iterator<MProductShape> iterator = product.getMProductShapeList().iterator(); iterator.hasNext();) {
								MProductShape existedProductShape = iterator.next();
//								MProductShape existedProductShape = new MProductShape();
//								existedProductShape.setShapeGrpDtlId(data.getShapeGrpDtlId());
//								existedProductShape.setProductId(product.getProductId());
//								existedProductShape = productShapeLogic.getUkEntity(existedProductShape);
								if (existedProductShape != null) {
									// 既存商品荷姿削除
									productShapeDelList.add(existedProductShape);
									insProductShape = true;
								}
							}

						}
						// [Ver3.0] unit of measure対応 2017.12.14 NING End
					}
				}
				productUpdList.add(mProduct);
				// [Ver3.0] unit of measure対応 2017.12.14 NING Start
				if (insProductShape) {
					// 在庫管理単位変わる場合、商品荷姿マスタがDELETE⇒INSERT
					productShapeInsList.add(mProductShape);
				} else {
					productShapeUpdList.add(mProductShape);
				}
				// [Ver3.0] unit of measure対応 2017.12.14 NING End
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
		//
		if (!eProductList.isEmpty()) {
			eProductBhv.batchUpdate(eProductList);
		}

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return;
		}


		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		if(!productShapeDelList.isEmpty()) {
			productShapeMasterBulkInputDeleteLogic.batchDelete(productShapeDelList);
		}
		// [Ver3.0] unit of measure対応 2017.12.14 NING End
		if (!productShapeInsList.isEmpty()) {
			productMasterInsertLogic.batchInsert(productShapeInsList);
			if (!productUpdList.isEmpty()) {
				productMasterUpdateLogic.batchUpdate(productUpdList);
			}
		}

		if (!productUpdList.isEmpty() && !productShapeUpdList.isEmpty()) {
			productMasterUpdateLogic.batchUpdate(productUpdList, productShapeUpdList);
		}
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End

		//更新errflg=0的数据
		EProductCB cb = new EProductCB();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().setErrorFlg_Equal("0");
		List<EProduct> updEProduct = eProductBhv.selectList(cb);
		for (int i = 0; i < updEProduct.size(); i++) {
			updEProduct.get(i).setImportFlg("1");
		}
		eProductBhv.batchUpdate(updEProduct);

		if (getErrorManager().size() > 0) {
			// 処理中止
			return;
		}

		if (!productShapeInsList.isEmpty() || !productUpdList.isEmpty()) {
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

			int insertCount = productShapeInsList.size();
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
			int updateCount = productUpdList.size();
			int productShapeUpDateCount = productShapeUpdList.size();
			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_PRODUCT_MASTER_INFORMATION, String.valueOf(insertCount), String.valueOf(insertCount), String.valueOf(updateCount), String.valueOf(productShapeUpDateCount));
			// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End
			getDatabaseLogger().endLogDtl();
		}
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.09 honma end

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>商品マスタ受信テーブル検索(商品荷姿マスタDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param mClient 荷主マスタ：荷主ID
	 * @return セレクト件数
	 */
	public int getEProductCount(String receiveCd, MClient mClient) {

		// 外出しSQLの定義
		String path = EProductBhv.PATH_selectSqlEProductList;

		BsSqlEProductListPmb pmb = new BsSqlEProductListPmb();
		pmb.setClientCd(mClient.getClientCd());
		pmb.setReceiveCd(receiveCd);
		pmb.setImportFlg("0");
		pmb.setCultureId(getCultureId());

		Class<SqlEProductListDto> entityType = SqlEProductListDto.class;

		return eProductBhv.outsideSql().selectList(path, pmb, entityType).size();
	}
	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}