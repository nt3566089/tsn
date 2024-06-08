package com.oneslogi.wms.logic.master;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlELocationListPmb;
import com.oneslogi.base.dbflute.cbean.ELocationCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.dto.customize.SqlELocationListDto;
import com.oneslogi.base.dbflute.exbhv.ELocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.ELocation;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.customize.SqlELocationList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.LocationMasterBulkInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.ShapeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;

/**
 * ロケーションマスタ一括取込取得ロジッククラス
 */
public class LocationMasterBulkInputSelectLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.01 honma start
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
		 * ロケーションマスタ登録異常
		 */
		protected static final int LOCATION_MASTER_INSERT_FAILED = 8;
	}

	// ===== 使用テーブル =====
	@Inject
	private CenterLogic centerLogic;

	@Inject
	private StockTypeLogic stockTypeLogic;

	@Inject
	private CustomerLogic customerLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private ELocationBhv eLocationBhv;

	@Inject
	private CenterClassLogic centerClassLogic;

	@Inject
	private StockTypeMasterSelectLogic StockTypeMasterSelectLogic;

	@Inject
	private LocationLogic locationLogic;

	@Inject
	private WarehouseLogic warehouseLogic;

	@Inject
	private ZoneLogic zoneLogic;

	//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19 Del fujiwara

	@Inject
	private ProductLogic productLogic;

	@Inject
	private ShapeLogic shapeLogic;

	// [Ver3.0] unit of measure対応 2017.11.30 駱 Del

	@Inject
	private LocationMasterInsertLogic insertLogic;

	@Inject
	private LocationMasterUpdateLogic updateLogic;

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
		// ===== 使用共通関数 =====
		@Inject
		private MProductShapeBhv mProductShapeBhv;
		// [Ver3.0] unit of measure対応 2017.11.30 駱 End
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
	/** 「英数字のみ」の正規表現パターン */
	private static String PARTTEN_CHARATER = "^[0-9a-zA-Z]*$";
	/** 「英数字と記号のみ」の正規表現パターン */
	private static String PARTTEN_DIGIT_SYMBOL = "^[!-~]*$";

	// 不要なソースを削除 2018.04.19 kawana Delete

	/**
	 * 正規表現処理方法。
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 */
	private boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	/**
	 * <h2>ロケーションマスタ受信テーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @param cls エラー検索区分
	 * @return List<SqlELocationList> ロケーションマスタ受信テーブル
	 */
	public List<SqlELocationList> getELocationList(String receiveCd, SqlELocationListDto header, PagingData paging, SelectCls cls) {

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();

		//荷主ID取得
		String clientCd = header.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);


		//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19 Del fujiwara

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(ピックロケフラグ)pickingLocationFlgNotFoundError
		Map<String, String> pickingLocationMap = centerClassLogic.getClassMapByCd("PICKING_LOCATION_FLG");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(ロケーション種別CD)locationTypeNotFoundError
		Map<String, String> locationTypeMap = centerClassLogic.getClassMapByCd("LOCATION_TYPE");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(引当禁止フラグ)allcNgFlgNotFoundError
		Map<String, String> allNgMap = centerClassLogic.getClassMapByCd("ALLC_NG_FLG");

		// 在庫区分マスタマップを選択する。(補充在庫区分)replenishStockTypeNotFoundError
		MStockType mStockType = new MStockType();
		List<MStockType> stockTypeList = StockTypeMasterSelectLogic.select(mStockType, null);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 外出しSQLの定義
		String path = ELocationBhv.PATH_selectSqlELocationList;

		BsSqlELocationListPmb pmb = new BsSqlELocationListPmb();

		pmb.setReceiveCd(receiveCd == null ? "0" : receiveCd);
		pmb.setCenterId(centerId);
		pmb.setClientId(mClient.getClientId());
		pmb.setCultureId(getCultureId());

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

		Class<SqlELocationList> entityType = SqlELocationList.class;

		List<SqlELocationList> sqlDtoList = null;
		if (paging != null) {
			sqlDtoList = super.selectPage(eLocationBhv, path, pmb, entityType, paging);
		} else {
			sqlDtoList = super.selectList(eLocationBhv, path, pmb, entityType);
		}

		// [#1817][Ver2.2.0] 数値項目4ケタ以上の値の場合の取込処理不正 2017.05.23 honma Mod Start
		for (SqlELocationList sqlELocationList2 : sqlDtoList) {

			// [#3982] ロケーションマスタ一括取込でExcel出力するとNo.が表示されない 2018.03.16 kawana Start
			sqlELocationList2.setLineNo(CU.convertNumberToString(sqlELocationList2.getReceiveRowId()));
			// [#3982] ロケーションマスタ一括取込でExcel出力するとNo.が表示されない 2018.03.16 kawana End

			// 不要なソースを削除 2018.04.19 kawana Delete

		// [#1817][Ver2.2.0] 数値項目4ケタ以上の値の場合の取込処理不正 2017.05.23 honma Mod End

			if (CU.isNullOrEmpty(sqlELocationList2.getWarehouseNm())) {
				sqlELocationList2.setWarehouseNm(sqlELocationList2.getWarehouseCd());
			} else {
				sqlELocationList2.setWarehouseNm(sqlELocationList2.getWarehouseCd() + ":" + sqlELocationList2.getWarehouseNm());
			}

			if (CU.isNullOrEmpty(sqlELocationList2.getZoneNm())) {
				sqlELocationList2.setZoneNm(sqlELocationList2.getZoneCd());
			} else {
				sqlELocationList2.setZoneNm(sqlELocationList2.getZoneCd() + ":" + sqlELocationList2.getZoneNm());
			}

			if (CU.isNullOrEmpty(sqlELocationList2.getReplenishProductShapeNm())) {
				sqlELocationList2.setReplenishProductShapeNm(sqlELocationList2.getReplenishPProductShapeCd());
			} else {
				sqlELocationList2.setReplenishProductShapeNm(sqlELocationList2.getReplenishPProductShapeCd() + ":" + sqlELocationList2.getReplenishProductShapeNm());
			}

			if (CU.isNullOrEmpty(sqlELocationList2.getMaxStoreProductShapeNm())) {
				sqlELocationList2.setMaxStoreProductShapeNm(sqlELocationList2.getMaxStoreProductShapeCd());
			} else {
				sqlELocationList2.setMaxStoreProductShapeNm(sqlELocationList2.getMaxStoreProductShapeCd() + ":" + sqlELocationList2.getMaxStoreProductShapeNm());
			}

			if (!CU.isNullOrEmpty(sqlELocationList2.getLocationType())) {
				if (!locationTypeMap.containsKey(sqlELocationList2.getLocationType())) {
					sqlELocationList2.setLocationTypeNm(sqlELocationList2.getLocationType());
				} else {
					sqlELocationList2.setLocationTypeNm(sqlELocationList2.getLocationType() + ":" + locationTypeMap.get(sqlELocationList2.getLocationType()));
				}
			}

			if (!CU.isNullOrEmpty(sqlELocationList2.getPickingLocationFlg())) {
				if (!pickingLocationMap.containsKey(sqlELocationList2.getPickingLocationFlg())) {
					sqlELocationList2.setPickingLocationFlgNm(sqlELocationList2.getPickingLocationFlg());
				} else {
					sqlELocationList2.setPickingLocationFlgNm(sqlELocationList2.getPickingLocationFlg() + ":" + pickingLocationMap.get(sqlELocationList2.getPickingLocationFlg()));
				}
			}

			if (!CU.isNullOrEmpty(sqlELocationList2.getReplenishStockTypeCd())) {
				String replenishStockTypeNm = sqlELocationList2.getReplenishStockTypeCd();
				for (MStockType MStockType : stockTypeList){
					if (MStockType.getStockTypeCd().equals(sqlELocationList2.getReplenishStockTypeCd())){
						replenishStockTypeNm = sqlELocationList2.getReplenishStockTypeCd() + ":" + MStockType.getVDict().getDictNm();
						break;
					}
				}
				sqlELocationList2.setReplenishStockTypeNm(replenishStockTypeNm);
			}

			if (!CU.isNullOrEmpty(sqlELocationList2.getReplenishDepositCd())) {
				if (CU.isNullOrEmpty(sqlELocationList2.getReplenishDepositNm())) {
					sqlELocationList2.setReplenishDepositNm(sqlELocationList2.getReplenishDepositCd());
				} else {
					sqlELocationList2.setReplenishDepositNm(sqlELocationList2.getReplenishDepositCd() + ":" + sqlELocationList2.getReplenishDepositNm());
				}
			}

			if (!CU.isNullOrEmpty(sqlELocationList2.getAllocNgFlg())) {
				if (!allNgMap.containsKey(sqlELocationList2.getAllocNgFlg())) {
					sqlELocationList2.setAllocNgFlgNm(sqlELocationList2.getAllocNgFlg());
				} else {
					sqlELocationList2.setAllocNgFlgNm(sqlELocationList2.getAllocNgFlg() + ":" + allNgMap.get(sqlELocationList2.getAllocNgFlg()));
				}
			}
		}
		//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19 Del fujiwara
		return sqlDtoList;
	}

	/**
	 * <h2>ロケーションマスタ受信テーブルにレコードを一緒に新規する。</h2>
	 * <pre>
	 * ロケーションマスタ受信テーブルにレコードを一緒に新規する。
	 * </pre>
	 *
	 * @param eLocationList 新規したいレコードリスト
	 */
	//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19  fujiwara Start
	public void batchInsert(List<ELocation> eLocationList) {
		for (ELocation eLocation : eLocationList) {
				eLocationBhv.insert(eLocation);
		}
	}
	//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19  fujiwara Start
	/**
	 * <h2>ログ開始</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * 開始とともにパラメータ情報を運用ログに出力する
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 */
	// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod Start
	public void startLog(String receiveCd, String centerCd, String clientCd) {
	// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod End

		outputLog = OutputLog.TRUE;

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.LOCATION_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION);

		// 属性１設定(センターCD)
		getDatabaseLogger().setAttribute1(centerCd);

		// 属性２設定(荷主CD)
		getDatabaseLogger().setAttribute2(clientCd);

		// ログ開始
		getDatabaseLogger().startLog();

		// [#169] メッセージの重複を削除 2016.12.05 kawana Start
		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.EDI_PARAMETER_INFORMATION, receiveCd, centerCd, clientCd);
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
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param locationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 */
	public void checkError(LocationMasterBulkInputDto locationMasterBulkInputDto) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<ELocation> checkLocationList = selectELocationList(locationMasterBulkInputDto.data.receiveCd);
		// 必須、文字数などのチェック
		int errCount = checkError(checkLocationList, locationMasterBulkInputDto.data.head.getClientCd(), DbUpdateForError.TRUE);
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(locationMasterBulkInputDto);
		// ロケーションマスタの登録/更新チェック
		int errCountLocationMaster = checkErrorLocationMaster(locationMasterBulkInputDto);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込
			int count = checkLocationList.size();
			int errCountAll = errCount + errCountMaster + errCountLocationMaster;
			int normalCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION, String.valueOf(errCountAll), String.valueOf(normalCount));
			getDatabaseLogger().endLogDtl();
		}
	}

	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eLocationList ロケーションマスタ受信テーブルリスト
	 * @param clientCd 荷主CD
	 * @param doUpdate
	 * @return エラー件数
	 */
	private int checkError(List<ELocation> eLocationList, String clientCd, DbUpdateForError doUpdate) {

		// [#669] 不要ソース削除 2017.01.25 nayzaw delete

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(ピックロケフラグ)pickingLocationFlgNotFoundError
		Map<String, String> pickingLocationMap = centerClassLogic.getClassMapByCd("PICKING_LOCATION_FLG");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(ロケーション種別CD)locationTypeNotFoundError
		Map<String, String> locationTypeMap = centerClassLogic.getClassMapByCd("LOCATION_TYPE");

		// 区分値CDにより、センタ区分値明細マスタマップを選択する。(引当禁止フラグ)allcNgFlgNotFoundError
		Map<String, String> allNgMap = centerClassLogic.getClassMapByCd("ALLC_NG_FLG");

		// 在庫区分マスタマップを選択する。(補充在庫区分)replenishStockTypeNotFoundError
		Map<String, String> stockTypeMap = stockTypeLogic.getStockTypeMap();

		// 取引先マスタマップを選択する。(補充預託)replenishDepositNotFoundError
		Map<String, String> dipositMap = customerLogic.getDepositMapByClientCd(clientCd);

		// ロケーションCD重複チェック用Map
		Map<String, String> locationCodeDuplicateMap = new HashMap<String, String>();

		// ロケーション名称重複チェック用Map
		Map<String, String> locationNameDuplicateMap = new HashMap<String, String>();

		// エラー件数
		int errorCount = 0;

		for (ELocation eLocation : eLocationList) {

			// ===== ロケーションCD チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getLocationCd())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 英数字
			if (!checkExcelCellInput(PARTTEN_CHARATER, eLocation.getLocationCd())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 10文字
			if (eLocation.getLocationCd().length() > 10) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_CD_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// ロケーションCD重複チェック
			if (locationCodeDuplicateMap.containsKey(eLocation.getLocationCd())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_CODE_DUPLICATE_ERROR, doUpdate);
				errorCount++;
				continue;
			} else {
				// ロケーションCD重複チェック用リストに追加
				locationCodeDuplicateMap.put(eLocation.getLocationCd(), null);
			}

			// ===== ロケーション名称 チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getLocationNm())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_NM_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 15文字
			if (eLocation.getLocationNm().length() > 15) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_NM_CHECK_INPUT_MAX_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// ロケーション名称重複チェック
			if (locationNameDuplicateMap.containsKey(eLocation.getLocationNm())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_NAME_DUPLICATE_ERROR, doUpdate);
				errorCount++;
				continue;
			} else {
				// ロケーション名称重複チェック用リストに追加
				locationNameDuplicateMap.put(eLocation.getLocationNm(), null);
			}

			// ===== 倉庫CD チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getWarehouseCd())) {
				updateErrorExecute(eLocation, WmsMessageConst.WAREHOUSE_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ゾーンCD チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getZoneCd())) {
				updateErrorExecute(eLocation, WmsMessageConst.ZONE_CD_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ロケーション種別CD チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getLocationType())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_TYPE_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// ロケーション種別がセンタ区分値明細マスタにない。
			if (!locationTypeMap.containsKey(eLocation.getLocationType())) {
				updateErrorExecute(eLocation, WmsMessageConst.LOCATION_TYPE_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ピックロケフラグ チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getPickingLocationFlg())) {
				updateErrorExecute(eLocation, WmsMessageConst.PICKING_LOCATION_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// ピックロケフラグがセンタ区分値明細マスタにない。
			if (!pickingLocationMap.containsKey(eLocation.getPickingLocationFlg())) {
				updateErrorExecute(eLocation, WmsMessageConst.PICKING_LOCATION_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== 引当禁止フラグ チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getAllocNgFlg())) {
				updateErrorExecute(eLocation, WmsMessageConst.ALLOC_NG_FLG_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// 引当禁止フラグがセンタ区分値明細マスタにない。
			if (!allNgMap.containsKey(eLocation.getAllocNgFlg())) {
				updateErrorExecute(eLocation, WmsMessageConst.ALLC_NG_FLG_NOT_FOUND_ERROR, doUpdate);
				errorCount++;
				continue;
			}

			// ===== ピッキング順序 チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getPickingOrder())) {
				updateErrorExecute(eLocation, WmsMessageConst.PICKING_ORDER_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4462] 数値の比較不備修正 2018.04.17 shimizu Start
			else {
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", eLocation.getPickingOrder())) {
					// 文字エラー
					updateErrorExecute(eLocation, WmsMessageConst.PICKING_ORDER_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", eLocation.getPickingOrder())) {
					// 整数5桁以内
					updateErrorExecute(eLocation, WmsMessageConst.PICKING_ORDER_CHECK_INPUT_INTEGER_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("^(-)?\\d+$", eLocation.getPickingOrder())) {
					// 小数不可
					updateErrorExecute(eLocation, WmsMessageConst.PICKING_ORDER_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (Long.valueOf(eLocation.getPickingOrder()) < 0) {
					// 最小0以上
					updateErrorExecute(eLocation, WmsMessageConst.PICKING_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}
			// [Ver3.0][#4462] 数値の比較不備修正 2018.04.17 shimizu End

			// ===== 引当順序 チェック =====

			// 必須
			if (CU.isNullOrEmpty(eLocation.getAllocOrder())) {
				updateErrorExecute(eLocation, WmsMessageConst.ALLOC_ORDER_NOT_INPUT_ERROR, doUpdate);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4462] 数値の比較不備修正 2018.04.17 shimizu Start
			else {
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", eLocation.getAllocOrder())) {
					// 文字エラー
					updateErrorExecute(eLocation, WmsMessageConst.ALLOC_ORDER_CHECK_NUMERIC_ONLY_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", eLocation.getAllocOrder())) {
					// 整数5桁以内
					updateErrorExecute(eLocation, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_INTEGER_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("^(-)?\\d+$", eLocation.getAllocOrder())) {
					// 小数不可
					updateErrorExecute(eLocation, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				if (Long.valueOf(eLocation.getAllocOrder()) < 0) {
					// 最小0以上
					updateErrorExecute(eLocation, WmsMessageConst.ALLOC_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}
			// [Ver3.0][#4462] 数値の比較不備修正 2018.04.17 shimizu End

			// ===== 補充情報 チェック =====

			// ピックロケフラグが「1」
			if ("1".equals(eLocation.getPickingLocationFlg())) {

				// 補充商品CDが設定された場合
				if (!CU.isNullOrEmpty(eLocation.getReplenishProductCd())) {
					//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Add Start
					// 英数字、記号
					if (!checkExcelCellInput(PARTTEN_DIGIT_SYMBOL, eLocation.getReplenishProductCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Add End

					// 補充在庫区分CD
					// 必須
					if (CU.isNullOrEmpty(eLocation.getReplenishStockTypeCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_STOCK_TYPE_CD_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// 補充在庫区分が在庫区分マスタにない。
					if (!stockTypeMap.containsKey(eLocation.getReplenishStockTypeCd())) {
						eLocation.setErrorMessageCd(WmsMessageConst.REPLENISH_STOCK_TYPE_CD_NOT_FOUND_ERROR);
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_STOCK_TYPE_CD_NOT_FOUND_ERROR, doUpdate);
						errorCount++;
						continue;
					}

					// 補充預託CD
					// 必須
					if (CU.isNullOrEmpty(eLocation.getReplenishDepositCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_DEPOSIT_CD_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// 補充預託が取引先マスタにない。
					if (!dipositMap.containsKey(eLocation.getReplenishDepositCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_DEPOSIT_CD_NOT_FOUND_ERROR, doUpdate);
						errorCount++;
						continue;
					}

					// 補充点荷姿CD
					// 必須
					if (CU.isNullOrEmpty(eLocation.getReplenishPProductShapeCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
					// 英数字
					if (!checkExcelCellInput(PARTTEN_CHARATER, eLocation.getReplenishPProductShapeCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

					// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
					//荷主ID取得
					MClient mClient = new MClient();
					mClient.setClientCd(clientCd);
					mClient = clientLogic.getUkEntity(mClient);

					//[#3941][Ver3.0] メッセージ編集 2018.03.07 fujiwara Start
					// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu Start
					// 補充点
					//[#7076][OSS] 補充点の必須チェックを追加 2020.01.20 Ono Start
					//必須
					if (CU.isNullOrEmpty(eLocation.getReplenishPNum())) {
						// 文字エラー
						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_P_NUM_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					//[#7076][OSS] 補充点の必須チェックを追加 2020.01.20 Ono End
//					if (!CU.isNullOrEmpty(eLocation.getReplenishPNum())) {
						// [Ver3.0][#4007] 正規表現を変更 2018.04.10 shimizu Start
						if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", eLocation.getReplenishPNum())) {
							// 文字エラー
							updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_P_NUM_CHECK_DECIMAL_ONLY_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						BigDecimal replenishPNum = WCC.toBigDecimal(eLocation.getReplenishPNum());
						if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", replenishPNum.stripTrailingZeros().toPlainString())) {
							// 整数7桁以内
							updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_P_NUM_CHECK_INPUT_INTEGER_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						if (!checkExcelCellInput("^(-)?\\d+$", replenishPNum.stripTrailingZeros().toPlainString())) {
							// 小数不可
							updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_P_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						// [Ver3.0][#4007] 正規表現を変更 2018.04.10 shimizu End
						// [Ver3.0][#4007] 最小チェック追加 2018.04.10 shimizu Start
						if (replenishPNum.signum() < 0) {
							// 最小0以上
							updateErrorExecute(eLocation, WmsMessageConst.RESTOCK_POINT_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						// [Ver3.0][#4007] 最小チェック追加 2018.04.10 shimizu End
//					}
					// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu End
					//[#3941][Ver3.0] メッセージ編集 2018.03.07 fujiwara End

					// 最大格納数商品荷姿CD
					// 必須
					if (CU.isNullOrEmpty(eLocation.getMaxStoreProductShapeCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
					// 英数字
					if (!checkExcelCellInput(PARTTEN_CHARATER, eLocation.getMaxStoreProductShapeCd())) {
						updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

					//[#7076][OSS] 最大格納数の必須チェックを追加 2020.01.20 Ono Start
					if (CU.isNullOrEmpty(eLocation.getMaxStoreNum())) {
						// 必須
						updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_NUM_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
					//[#7076][OSS] 最大格納数の必須チェックを追加 2020.01.20 Ono End

					//[#3941][Ver3.0] メッセージ編集 2018.03.07 fujiwara Start
					// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu Start
					// 最大格納数
//					if (!CU.isNullOrEmpty(eLocation.getMaxStoreNum())) {
						// [Ver3.0][#4007] 正規表現を変更 2018.04.10 shimizu Start
						if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", eLocation.getMaxStoreNum())) {
							// 文字エラー
							updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_NUM_CHECK_DECIMAL_ONLY_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						BigDecimal maxStoreNum = WCC.toBigDecimal(eLocation.getMaxStoreNum());
						if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", maxStoreNum.stripTrailingZeros().toPlainString())) {
							// 整数7桁以内
							updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_NUM_CHECK_INPUT_INTEGER_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						if (!checkExcelCellInput("^(-)?\\d+$", maxStoreNum.stripTrailingZeros().toPlainString())) {
							// 小数不可
							updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						// [Ver3.0][#4007] 正規表現を変更 2018.04.10 shimizu End
						// [Ver3.0][#4007] 最小チェック追加 2018.04.10 shimizu Start
						if (maxStoreNum.signum() < 0) {
							// 最小0以上
							updateErrorExecute(eLocation, WmsMessageConst.MAX_STORE_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR, doUpdate);
							errorCount++;
							continue;
						}
						// [Ver3.0][#4007] 最小チェック追加 2018.04.10 shimizu End
//					}
					// [Ver3.0][#4292] チェック処理の順序統一 2018.04.11 shimizu End
					//[#3941][Ver3.0] メッセージ編集 2018.03.07 fujiwara End
				}
				//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Add Start
				else { //補充商品CDが設定されていない場合
					//下記の項目のいずれかが入力された場合、エラーとする。
					if (!CU.isNullOrEmpty(eLocation.getReplenishStockTypeCd()) ||     //補充在庫区分CD
						!CU.isNullOrEmpty(eLocation.getReplenishDepositCd()) ||       //補充預託CD
						!CU.isNullOrEmpty(eLocation.getReplenishPProductShapeCd()) || //補充点荷姿CD
						!CU.isNullOrEmpty(eLocation.getReplenishPNum()) ||            //補充点
						!CU.isNullOrEmpty(eLocation.getMaxStoreProductShapeCd()) ||   //最大格納数商品荷姿CD
						!CU.isNullOrEmpty(eLocation.getMaxStoreNum())) {              //最大格納数

						updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_PRODUCT_CD_NOT_INPUT_ERROR, doUpdate);
						errorCount++;
						continue;
					}
				}
				//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Add End
			}
			//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Add Start
			else {//ピックロケフラグが「1」以外の場合、補充情報は入力不可とする。

				//補充商品CDが設定された場合
				if (!CU.isNullOrEmpty(eLocation.getReplenishProductCd())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				//補充在庫区分CDが設定された場合
				if (!CU.isNullOrEmpty(eLocation.getReplenishStockTypeCd())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				//補充預託CDが設定された場合
				if (!CU.isNullOrEmpty(eLocation.getReplenishDepositCd())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				//補充点荷姿CDが設定された場合
				if (!CU.isNullOrEmpty(eLocation.getReplenishPProductShapeCd())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				//補充点が設定された場合
				if (!CU.isNullOrEmpty(eLocation.getReplenishPNum())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				//最大格納数商品荷姿CDが設定された場合
				if (!CU.isNullOrEmpty(eLocation.getMaxStoreProductShapeCd())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
				//最大格納数が設定された場合
				if (!CU.isNullOrEmpty(eLocation.getMaxStoreNum())) {
					updateErrorExecute(eLocation, WmsMessageConst.REPLENISH_INFO_INPUT_ERROR, doUpdate);
					errorCount++;
					continue;
				}
			}
			//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Add End
			// [#669] 不要ソース削除 2017.01.25 nayzaw delete
			// エラー無を設定
			updateNormalExecute(eLocation, null, doUpdate);
		}

		return errorCount;
	}

	/**
	 * <h2>関連マスタ存在チェック.</h2>
	 * @param locationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 * @return エラー件数
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//	private int checkErrorMaster(LocationMasterBulkInputDto locationMasterDto) {
	public int checkErrorMaster(LocationMasterBulkInputDto locationMasterDto) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		// ロケーションマスタ受信テーブルから、正常データ（エラーフラグ＝０）を選択して、整合性チェックを行う。
		List<SqlELocationList> sqlELocationListList = getELocationList(locationMasterDto.data.receiveCd, locationMasterDto.data.head, null, SelectCls.NO_ERROR_ONLY);

		List<ELocation> errorELocationList = new ArrayList<>();
		ELocation errorELocation = null;

		// 正常データを繰返して、整合性チェックを行う。
		for (SqlELocationList sqlELocationList : sqlELocationListList) {
			//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19 Del fujiwara

			// 倉庫CDが取得できない場合、チェックエラーとする。
			if (sqlELocationList.getWarehouseId() == null) {
				errorELocation = new ELocation();
				setupELocation(errorELocation, sqlELocationList);
				errorELocation.setErrorFlg("1");
				errorELocation.setErrorMessageCd(WmsMessageConst.WAREHOUSE_CD_NOT_FOUND_ERROR);
				errorELocationList.add(errorELocation);
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
				// エラー内容ログ書込開始
				addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(errorELocation.getReceiveRowId()), errorELocation.getErrorMessageCd());
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
				continue;
			}

			// ゾーンCDが取得できない場合、チェックエラーとする。
			if (sqlELocationList.getZoneId() == null) {
				errorELocation = new ELocation();
				setupELocation(errorELocation, sqlELocationList);
				errorELocation.setErrorFlg("1");
				errorELocation.setErrorMessageCd(WmsMessageConst.ZONE_CD_NOT_FOUND_ERROR);
				errorELocationList.add(errorELocation);
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
				// エラー内容ログ書込開始
				addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(errorELocation.getReceiveRowId()), errorELocation.getErrorMessageCd());
				// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
				continue;
			}

			// ピックロケフラグが入力場合
			//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Mod Start
			if ("1".equals(sqlELocationList.getPickingLocationFlg()) && !CU.isNullOrEmpty(sqlELocationList.getReplenishProductCd())) {
			//[ON推-1.1.4-CT-059]CT指摘の修正対応 2016.05.26 chou Mod End
				// 補充商品CDが設定されが、取得できない場合、チェックエラーとする。
				if (sqlELocationList.getProductId() == null) {
					errorELocation = new ELocation();
					setupELocation(errorELocation, sqlELocationList);
					errorELocation.setErrorFlg("1");
					errorELocation.setErrorMessageCd(WmsMessageConst.REPLENISH_PRODUCT_CD_NOT_FOUND_ERROR);
					errorELocationList.add(errorELocation);
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(errorELocation.getReceiveRowId()), errorELocation.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					continue;
				}

				// 補充点商品荷姿CDが設定されが、取得できない場合、チェックエラーとする。
				if (sqlELocationList.getReplenishProductShapeId() == null) {
					errorELocation = new ELocation();
					setupELocation(errorELocation, sqlELocationList);
					errorELocation.setErrorFlg("1");
					errorELocation.setErrorMessageCd(WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR);
					errorELocationList.add(errorELocation);
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(errorELocation.getReceiveRowId()), errorELocation.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					continue;
				}

				// 最大格納数商品荷姿CDが設定されが、取得できない場合、チェックエラーとする。
				if (sqlELocationList.getMaxStoreProductShapeId() == null) {
					errorELocation = new ELocation();
					setupELocation(errorELocation, sqlELocationList);
					errorELocation.setErrorFlg("1");
					errorELocation.setErrorMessageCd(WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR);
					errorELocationList.add(errorELocation);
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(errorELocation.getReceiveRowId()), errorELocation.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					continue;
				}
			}
		}

		// 整合性チェックエラーがある場合、ELocationに、エラーデータを更新する。
		if (errorELocationList.size() > 0) {
			eLocationBhv.batchUpdate(errorELocationList);
		}

		return errorELocationList.size();
	}

	/**
	 * <h2>ロケーションマスタ登録チェック.</h2>
	 * @param locationMasterBulkInputDto ロケーションマスタ一括取込画面用DTO
	 * @return エラー件数
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
//	private int checkErrorLocationMaster(LocationMasterBulkInputDto locationMasterBulkInputDto) {
	public int checkErrorLocationMaster(LocationMasterBulkInputDto locationMasterBulkInputDto) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		// エラー件数
		int errorCount = 0;

		// ロケーションマスタ受信テーブルから、正常データ（エラーフラグ＝０）を選択して、整合性チェックを行う。
		List<SqlELocationList> sqlELocationListList = getELocationList(locationMasterBulkInputDto.data.receiveCd, locationMasterBulkInputDto.data.head, null, SelectCls.NO_ERROR_ONLY);
		List<MLocation> locationList = new ArrayList<MLocation>();

		// SqlELocationListから、MLocationに変更する。
		mappingELocationToMLocation(sqlELocationListList, locationList, locationMasterBulkInputDto.data.head.getClientCd());

		errorCount = check(locationList, locationMasterBulkInputDto.data.head.getClientId(), sqlELocationListList, 1);

		return errorCount;
	}

	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・ロケーションＣＤ重複チェック
	 * ・ロケーション名称重複チェック
	 * ・在庫チェック存在チェック
	 * </pre>
	 * @param mLocationList ロケーションマスタ画面List
	 * @param clientId 荷主Id
	 * @param sqlELocationListList ロケーションマスタ受信テーブル
	 * @param insertFlg エラー内容登録フラグ(1：登録)
	 * @return int エラー件数
	 */
	protected int check(List<MLocation> mLocationList, Long clientId, List<SqlELocationList> sqlELocationListList, int insertFlg) {
		// 登録されていないセンタがあるか
		boolean isNullStock = false;
		int rowIndex = -1;

		List<ELocation> errorELocationList = new ArrayList<>();
		ELocation eLocation = null;

		boolean info_Warn = false;
		// チェック処理
		for (MLocation mLocation : mLocationList) {
			getErrorManager().clear();
			rowIndex++;
			// センタID取得
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);
			MZone zone = mLocation.getMZone();
			MWarehouse warehouse = new MWarehouse();
			warehouse.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
			warehouse.setCenterId(mCenter.getCenterId());
			warehouse = warehouseLogic.getUkEntityWithCheck(warehouse, null);
			if (warehouse == null) {
				// MLocationから、ELocationに変更する。
				if (insertFlg == 1) {
					eLocation = new ELocation();
					setupELocation(eLocation, sqlELocationListList.get(rowIndex));
					//				mappingMLocationToELocation(mLocation, eLocation);
					errorELocationList.add(eLocation);
					eLocation.setErrorFlg("1");
					// [#226] 設計書に合わせてエラーメッセージを変更 2016.11.09 kawana Start
					eLocation.setErrorMessageCd(WmsMessageConst.WAREHOUSE_CD_NOT_FOUND_ERROR);
					// [#226] 設計書に合わせてエラーメッセージを変更 2016.11.09 kawana End
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
					// エラー内容ログ書込開始
					addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
					// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
				}
				mLocation.setErrorFlg("1");
				info_Warn = true;
				continue;
			} else {
				zone.setWarehouseId(warehouse.getWarehouseId());
				zone = zoneLogic.getUkEntity(zone, null);
				if (zone == null) {
					// MLocationから、ELocationに変更する。
					if (insertFlg == 1) {
						eLocation = new ELocation();
						//					mappingMLocationToELocation(mLocation, eLocation);
						setupELocation(eLocation, sqlELocationListList.get(rowIndex));
						errorELocationList.add(eLocation);
						eLocation.setErrorFlg("1");
						eLocation.setErrorMessageCd(WmsMessageConst.ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
					mLocation.setErrorFlg("1");
					info_Warn = true;
					continue;
				}
			}
			// ロケーションCD、名称重複チェック
			if (mLocation.getElocationId() == null) {
				// 登録の場合
				// ロケーションCD重複チェック
				getErrorManager().clear();
				boolean isDuplicateLocationCdInsert = locationLogic.checkLocationCdInsert(mLocation);
				if (isDuplicateLocationCdInsert) {
					// MLocationから、ELocationに変更する。
					if (insertFlg == 1) {
						eLocation = new ELocation();
						//					mappingMLocationToELocation(mLocation, eLocation);
						setupELocation(eLocation, sqlELocationListList.get(rowIndex));
						errorELocationList.add(eLocation);
						eLocation.setErrorFlg("1");
						eLocation.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
					mLocation.setErrorFlg("1");
					info_Warn = true;
					continue;
				}
				// ロケーション名称重複チェック
				getErrorManager().clear();
				boolean isDuplicateLocationNmInsert = locationLogic.checkLocationNmInsert(mLocation);
				if (isDuplicateLocationNmInsert) {
					// MLocationから、ELocationに変更する。
					if (insertFlg == 1) {
						eLocation = new ELocation();
						//					mappingMLocationToELocation(mLocation, eLocation);
						setupELocation(eLocation, sqlELocationListList.get(rowIndex));
						errorELocationList.add(eLocation);
						eLocation.setErrorFlg("1");
						eLocation.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
					mLocation.setErrorFlg("1");
					info_Warn = true;
					continue;
				}
			} else {
				// 修正の場合
				// ロケーション名称重複チェック
				getErrorManager().clear();
				boolean isDuplicateLocationCdUpdate = locationLogic.checkLocationNmInsert(mLocation);
				if (isDuplicateLocationCdUpdate) {
					// MLocationから、ELocationに変更する。
					if (insertFlg == 1) {
						eLocation = new ELocation();
						//					mappingMLocationToELocation(mLocation, eLocation);
						setupELocation(eLocation, sqlELocationListList.get(rowIndex));
						errorELocationList.add(eLocation);
						eLocation.setErrorFlg("1");
						eLocation.setErrorMessageCd(WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
					mLocation.setErrorFlg("1");
					info_Warn = true;
					continue;
				}
				//[#4097] [Ver3.0] ロケーションマスタ一括取込の取込ファイルから削除フラグを除去 2018.03.19 Del fujiwara
			}

			// 商品IDを設定
			if (mLocation.getMProduct() != null && mLocation.getMProduct().getProductCd() != null) {
				MProduct mProduct = new MProduct();
				mProduct.setProductCd(mLocation.getMProduct().getProductCd());
				mProduct.setClientId(clientId);
				mProduct = productLogic.getUkEntity(mProduct);
				if (mProduct == null) {
					// 商品IDを設定
					// MLocationから、ELocationに変更する。
					if (insertFlg == 1) {
						eLocation = new ELocation();
						//					mappingMLocationToELocation(mLocation, eLocation);
						setupELocation(eLocation, sqlELocationListList.get(rowIndex));
						errorELocationList.add(eLocation);
						eLocation.setErrorFlg("1");
						eLocation.setErrorMessageCd(WmsMessageConst.REPLENISH_PRODUCT_CD_NOT_FOUND_ERROR);
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
						// エラー内容ログ書込開始
						addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
						// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
					}
					mLocation.setErrorFlg("1");
					info_Warn = true;
					continue;
				} else {

					// [#3470] 補充商品に小数有り商品を指定した場合はエラーとする 2018.02.28 kawana Start
					if (mProduct.getMShapeGrp().isDecimalExistFlg$1()) {
						// 小数有り商品は指定不可

						if (insertFlg == 1) {
							eLocation = new ELocation();
							setupELocation(eLocation, sqlELocationListList.get(rowIndex));
							errorELocationList.add(eLocation);
							eLocation.setErrorFlg("1");
							eLocation.setErrorMessageCd(WmsMessageConst.INPUT_PRODUCT_DECIMAL_EXIST_FLG_ERROR);
							// エラー内容ログ書込開始
							addErrorCheckLogDtl(WmsMessageConst.INPUT_PRODUCT_DECIMAL_EXIST_FLG_ERROR, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
						}
						mLocation.setErrorFlg("1");
						info_Warn = true;
						continue;
					}
					// [#3470] 補充商品に小数有り商品を指定した場合はエラーとする 2018.02.28 kawana End

					if (mLocation.getMProductShapeByMaxStoreProductShapeId() != null) {
						// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
						if (mLocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() != null) {
							if (mLocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd() != null) {
								MShape mShape = new MShape();
								mShape.setShapeCd(mLocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd());
								// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
								mShape = shapeLogic.getUkEntity(mShape);

								MProductShape mProductShape = new MProductShape();
								mProductShape.setProductId(mProduct.getProductId());
								// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
								mProduct = productLogic.getUkEntityWithShape(mProduct);
								// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
								if (mProduct == null) {
						// [Ver3.0] unit of measure対応 2017.11.30 駱 End
									// MLocationから、ELocationに変更する。
									if (insertFlg == 1) {
										eLocation = new ELocation();
										setupELocation(eLocation, sqlELocationListList.get(rowIndex));
										errorELocationList.add(eLocation);
										eLocation.setErrorFlg("1");
										// [#226] 設計書に合わせてエラーメッセージを変更 2016.11.09 kawana Start
										eLocation.setErrorMessageCd(WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR);
										// [#226] 設計書に合わせてエラーメッセージを変更 2016.11.09 kawana End
										// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
										// エラー内容ログ書込開始
										addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
										// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
									}
									mLocation.setErrorFlg("1");
									info_Warn = true;
									continue;
								}
							}
						}
					}
					// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
					if (mLocation.getMProductShapeByReplenishPProductShapeId() != null) {
						if (mLocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape() != null) {
							if (mLocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd() != null) {
								MShape mShape = new MShape();
								mShape.setShapeCd(mLocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd());
								// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
								mShape = shapeLogic.getUkEntity(mShape);

								MProductShape mProductShape = new MProductShape();
								mProductShape.setProductId(mProduct.getProductId());
								// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
								mProduct = productLogic.getUkEntityWithShape(mProduct);
								// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
								if (mProduct == null) {
					// [Ver3.0] unit of measure対応 2017.11.30 駱 End
									// MLocationから、ELocationに変更する。
									if (insertFlg == 1) {
										eLocation = new ELocation();
										setupELocation(eLocation, sqlELocationListList.get(rowIndex));
										errorELocationList.add(eLocation);
										eLocation.setErrorFlg("1");
										// [#226] 設計書に合わせてエラーメッセージを変更 2016.11.09 kawana Start
										eLocation.setErrorMessageCd(WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR);
										// [#226] 設計書に合わせてエラーメッセージを変更 2016.11.09 kawana End
										// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
										// エラー内容ログ書込開始
										addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), eLocation.getErrorMessageCd());
										// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
									}
									mLocation.setErrorFlg("1");
									info_Warn = true;
									continue;
								}
							}
						}
					}
				}
			}
		}

		// エラー内容の登録
		if (errorELocationList.size() > 0) {
			eLocationBhv.batchUpdate(errorELocationList);
		}

		// 結果の設定
		if (isNullStock || info_Warn) {
			getErrorManager().clear();
		}

		return errorELocationList.size();
	}
	//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja end

	/**
	 * SqlELocationListから、MLocationに変更する。
	 *
	 * @param sqlELocationListList
	 * @param locationList
	 * @param clientCd 荷主CD
	 */
	private void mappingELocationToMLocation(List<SqlELocationList> sqlELocationListList, List<MLocation> locationList, String clientCd) {

		// 在庫区分マスタマップを選択する。(補充在庫区分)replenishStockTypeNotFoundError
		Map<String, String> stockTypeMap = stockTypeLogic.getStockTypeMap();

		// 取引先マスタマップを選択する。(補充預託)replenishDepositNotFoundError
		Map<String, String> dipositMap = customerLogic.getDepositMapByClientCd(clientCd);

		// SqlELocationListから、MLocationに変更する。
		for (SqlELocationList sqlELocationList : sqlELocationListList) {
			MLocation mlocation = new MLocation();

			locationList.add(mlocation);

			// ロケーションCD
			mlocation.setLocationCd(sqlELocationList.getLocationCd());
			// ロケーション名称
			mlocation.setLocationNm(sqlELocationList.getLocationNm());
			// ピックロケフラグ
			mlocation.setPickingLocationFlg(sqlELocationList.getPickingLocationFlg());
			// ピッキング順序
			mlocation.setPickingOrder(new Long(sqlELocationList.getPickingOrder()));
			// ロケーション種別
			mlocation.setLocationType(sqlELocationList.getLocationType());
			// 引当順序
			mlocation.setAllocOrder(new Long(sqlELocationList.getAllocOrder()));
			// 引当禁止フラグ
			mlocation.setAllocNgFlg(sqlELocationList.getAllocNgFlg());
			// ロケーションID
			mlocation.setLocationId(sqlELocationList.getMlocationId());
			// ロケーションID
			mlocation.setElocationId(sqlELocationList.getMlocationId() == null ? null : String.valueOf(sqlELocationList.getMlocationId()));
			// バージョンNo.
			mlocation.setVersionNo(sqlELocationList.getMversionNo());
			// 削除フラグ
			mlocation.setDelFlg(sqlELocationList.getDelFlg());

			// センタCD
			if (mlocation.getMCenter() == null) {
				mlocation.setMCenter(new MCenter());
			}
			mlocation.getMCenter().setCenterCd(sqlELocationList.getCenterCd());

			// ゾーンCD
			if (mlocation.getMZone() == null) {
				mlocation.setMZone(new MZone());
			}
			mlocation.getMZone().setZoneCd(sqlELocationList.getZoneCd());

			// 倉庫CD
			if (mlocation.getMZone().getMWarehouse() == null) {
				mlocation.getMZone().setMWarehouse(new MWarehouse());
			}
			mlocation.getMZone().getMWarehouse().setWarehouseCd(sqlELocationList.getWarehouseCd());

			// ピックロケフラグ=1
			if ("1".equals(sqlELocationList.getPickingLocationFlg())) {
				// 補充点
				// [#2799][Ver3.0] unit of measure 対応 2017.12.28 潘 Start
				if (sqlELocationList.getReplenishPNum() != null) {
					mlocation.setReplenishPNum(WCC.toBigDecimal(sqlELocationList.getReplenishPNum()));
				} else {
					mlocation.setReplenishPNum(null);
				}

				// 最大格納数
				if (sqlELocationList.getMaxStoreNum() != null) {
					mlocation.setMaxStoreNum(WCC.toBigDecimal(sqlELocationList.getMaxStoreNum()));
				} else {
					mlocation.setMaxStoreNum(null);
				}
				// [#2799][Ver3.0] unit of measure 対応 2017.12.28 潘 End
				// 補充商品CD
				if (mlocation.getMProduct() == null) {
					mlocation.setMProduct(new MProduct());
				}
				mlocation.getMProduct().setProductCd(sqlELocationList.getReplenishProductCd());
				mlocation.getMProduct().setProductId(sqlELocationList.getProductId());

				// 補充在庫区分CD
				if (mlocation.getMStockType() == null) {
					mlocation.setMStockType(new MStockType());
				}
				mlocation.getMStockType().setStockTypeCd(sqlELocationList.getReplenishStockTypeCd());
				if (sqlELocationList.getReplenishStockTypeCd() != null) {
					String stockTypeId = stockTypeMap.get(sqlELocationList.getReplenishStockTypeCd());
					if (stockTypeId != null) {
						mlocation.getMStockType().setStockTypeId(new Long(stockTypeId));
						mlocation.setReplenishStockTypeId(new Long(stockTypeId));
					} else {
						mlocation.setReplenishStockTypeId(null);
					}
				} else {
					mlocation.setReplenishStockTypeId(null);
				}

				// 補充預託CD
				if (mlocation.getMCustomer() == null) {
					mlocation.setMCustomer(new MCustomer());
				}
				mlocation.getMCustomer().setCustomerCd(sqlELocationList.getReplenishDepositCd());
				if (sqlELocationList.getReplenishDepositCd() != null) {
					String custormerId = dipositMap.get(sqlELocationList.getReplenishDepositCd());
					if (custormerId != null) {
						mlocation.getMCustomer().setCustomerId(new Long(custormerId));
						mlocation.setReplenishDepositId(new Long(custormerId));
					}
				}

				// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
				// 補充点商品荷姿CD
				if (mlocation.getMProductShapeByReplenishPProductShapeId() == null) {
					mlocation.setMProductShapeByReplenishPProductShapeId(new MProductShape());
				}

				if (mlocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl() == null) {
					mlocation.getMProductShapeByReplenishPProductShapeId().setMShapeGrpDtl(new MShapeGrpDtl());
				}

				if (mlocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape() == null) {
					mlocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().setMShape(new MShape());
				}
				mlocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().setShapeCd(sqlELocationList.getReplenishPProductShapeCd());
				mlocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().setShapeId(sqlELocationList.getReplenishProductShapeId());

				// 最大格納数商品荷姿CD
				if (mlocation.getMProductShapeByMaxStoreProductShapeId() == null) {
					mlocation.setMProductShapeByMaxStoreProductShapeId(new MProductShape());
				}

				if (mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl() == null) {
					mlocation.getMProductShapeByMaxStoreProductShapeId().setMShapeGrpDtl(new MShapeGrpDtl());
				}

				if (mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() == null) {
					mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().setMShape(new MShape());
				}

				if (mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() == null) {
					mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().setMShape(new MShape());
				}
				mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().setShapeCd(sqlELocationList.getMaxStoreProductShapeCd());
				mlocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().setShapeId(sqlELocationList.getMaxStoreProductShapeId());
				// [Ver3.0] unit of measure対応 2017.11.30 駱 End

			} else {
				// 補充点
				mlocation.setReplenishPNum(null);

				// 最大格納数
				mlocation.setMaxStoreNum(null);

				// 補充商品CD
				mlocation.setMProduct(null);

				// 補充在庫区分CD
				mlocation.setMStockType(null);
				mlocation.setReplenishStockTypeId(null);

				// 補充預託CD
				mlocation.setMCustomer(null);
				mlocation.setReplenishDepositId(null);

				// 補充点商品荷姿CD
				mlocation.setMProductShapeByReplenishPProductShapeId(null);

				// 最大格納数商品荷姿CD
				mlocation.setMProductShapeByMaxStoreProductShapeId(null);
			}
		}
	}

	/**
	 * 登録データの組み立て
	 * @param eLocation
	 * @param sqlELocationList
	 */
	private void setupELocation(ELocation eLocation, SqlELocationList sqlELocationList) {
		eLocation.setLocationId(sqlELocationList.getLocationId());
		eLocation.setReceiveCd(sqlELocationList.getReceiveCd());
		eLocation.setReceiveRowId(sqlELocationList.getReceiveRowId());
		eLocation.setImportFlg(sqlELocationList.getImportFlg());
		eLocation.setErrorFlg(sqlELocationList.getErrorFlg());
		eLocation.setErrorMessageCd(sqlELocationList.getErrorMessageCd());
		eLocation.setCenterCd(sqlELocationList.getCenterCd());
		eLocation.setLocationCd(sqlELocationList.getLocationCd());
		eLocation.setLocationNm(sqlELocationList.getLocationNm());
		eLocation.setWarehouseCd(sqlELocationList.getWarehouseCd());
		eLocation.setZoneCd(sqlELocationList.getZoneCd());
		eLocation.setLocationType(sqlELocationList.getLocationType());
		eLocation.setPickingLocationFlg(sqlELocationList.getPickingLocationFlg());
		eLocation.setAllocNgFlg(sqlELocationList.getAllocNgFlg());
		eLocation.setPickingOrder(sqlELocationList.getPickingOrder());
		eLocation.setAllocOrder(sqlELocationList.getAllocOrder());
		eLocation.setClientCd(sqlELocationList.getClientCd());
		eLocation.setReplenishProductCd(sqlELocationList.getReplenishProductCd());
		eLocation.setReplenishStockTypeCd(sqlELocationList.getReplenishStockTypeCd());
		eLocation.setReplenishDepositCd(sqlELocationList.getReplenishDepositCd());
		eLocation.setReplenishPNum(sqlELocationList.getReplenishPNum());
		eLocation.setReplenishPProductShapeCd(sqlELocationList.getReplenishPProductShapeCd());
		eLocation.setMaxStoreNum(sqlELocationList.getMaxStoreNum());
		eLocation.setMaxStoreProductShapeCd(sqlELocationList.getMaxStoreProductShapeCd());
		eLocation.setDelFlg(sqlELocationList.getDelFlg());
		eLocation.setVersionNo(sqlELocationList.getVersionNo());
		eLocation.setControlNo(sqlELocationList.getControlNo());
		eLocation.setAddDt(sqlELocationList.getAddDt());
		eLocation.setAddUser(sqlELocationList.getAddUser());
		eLocation.setAddProcess(sqlELocationList.getAddProcess());
		eLocation.setUpdDt(sqlELocationList.getUpdDt());
		eLocation.setUpdUser(sqlELocationList.getUpdUser());
		eLocation.setUpdProcess(sqlELocationList.getUpdProcess());
	}

	/**
	 * <h2>ロケーションマスタ受信テーブルのエラー設定.</h2>
	 * @param eLocation
	 * @param errorMessageCd
	 * @param doUpdate
	 */
	private void updateErrorExecute(ELocation eLocation, String errorMessageCd, DbUpdateForError doUpdate) {
		eLocation.setErrorFlg("1");
		eLocation.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eLocationBhv.update(eLocation);
		}
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
		// エラー内容ログ書込開始
		addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eLocation.getReceiveRowId()), errorMessageCd);
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End
	}

	/**
	 * <h2>ロケーションマスタ受信テーブルのエラー無し設定.</h2>
	 * @param eLocation
	 * @param successMessageCd
	 * @param doUpdate
	 */
	private void updateNormalExecute(ELocation eLocation, String successMessageCd, DbUpdateForError doUpdate) {
		eLocation.setErrorFlg("0");
		eLocation.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eLocationBhv.update(eLocation);
		}
	}

	/**
	 * <h2>ファイル取込データからロケーションマスタ受信テーブルのエンティティに変換.</h2>
	 * @param mCenter センタマスタ
	 * @param mClient 荷主マスタ
	 * @param locationList 取込ロケーションマスタリスト
	 * @param receiveCd 設定する受信CD
	 * @return ロケーションマスタ受信テーブルのリスト
	 */
	public List<ELocation> convertELocation(MCenter mCenter, MClient mClient, List<SqlELocationListDto> locationList, String receiveCd) {

		List<ELocation> eLocationList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < locationList.size(); row++) {

			SqlELocationListDto data = locationList.get(row);
			ELocation eLocation = new ELocation();
			eLocation.setCenterCd(mCenter.getCenterCd());
			eLocation.setClientCd(mClient.getClientCd());
			eLocation.setReceiveRowId(Long.valueOf(row + 1));
			eLocation.setReceiveCd(receiveCd);
			eLocation.setImportFlg("0");
			eLocation.setErrorFlg("0");
			String locationCd = data.getLocationCd();
			eLocation.setLocationCd(locationCd);
			String locationNm = data.getLocationNm();
			eLocation.setLocationNm(locationNm);
			String warehouseCd = data.getWarehouseCd();
			eLocation.setWarehouseCd(warehouseCd);
			String zoneCd = data.getZoneCd();
			eLocation.setZoneCd(zoneCd);
			String locationType = data.getLocationType();
			eLocation.setLocationType(locationType);
			String pickingLocationFlg = data.getPickingLocationFlg();
			eLocation.setPickingLocationFlg(pickingLocationFlg);
			String allocNgFlg = data.getAllocNgFlg();
			eLocation.setAllocNgFlg(allocNgFlg);
			String pickingOrder = data.getPickingOrder();
			eLocation.setPickingOrder(pickingOrder);
			String allocOrder = data.getAllocOrder();
			eLocation.setAllocOrder(allocOrder);
			String replenishProductCd = data.getReplenishProductCd();
			eLocation.setReplenishProductCd(replenishProductCd);
			String replenishStockTypeCd = data.getReplenishStockTypeCd();
			eLocation.setReplenishStockTypeCd(replenishStockTypeCd);
			String replenishDepositCd = data.getReplenishDepositCd();
			eLocation.setReplenishDepositCd(replenishDepositCd);
			String replenishPNum = data.getReplenishPNum();
			eLocation.setReplenishPNum(replenishPNum);
			String replenishPProductShapeCd = data.getReplenishPProductShapeCd();
			eLocation.setReplenishPProductShapeCd(replenishPProductShapeCd);
			String maxStoreNum = data.getMaxStoreNum();
			eLocation.setMaxStoreNum(maxStoreNum);
			String maxStoreProductShapeCd = data.getMaxStoreProductShapeCd();
			eLocation.setMaxStoreProductShapeCd(maxStoreProductShapeCd);
			String delFlg = data.getDelFlg();
			eLocation.setDelFlg(delFlg);
			eLocationList.add(eLocation);
		}

		return eLocationList;
	}

	/**
	 * <h2>ロケーションマスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<ELocation> selectELocationList(String receiveCd) {

		ELocationCB cb = eLocationBhv.newConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eLocationBhv.selectList(cb);
	}

	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add Start
	/**
	 * <h2>ロケーションマスタ受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<ELocation> selectELocationList(String receiveCd, SelectCls cls) {

		ELocationCB cb = eLocationBhv.newConditionBean();

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

		return eLocationBhv.selectList(cb);
	}
	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add End

	// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
	/**
	 * <h2>商品荷姿IDを取得する。</h2>
	 * @param entity 商品荷姿マスタ：商品ID・荷姿ID
	 * @return MProductShape 商品荷姿マスタ
	 */
	public List<MProductShape> getMProductShape(MProductShape entity,Long shapeId) {

		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
        cb.setupSelect_MShapeGrpDtl();
		cb.query().setProductId_Equal(entity.getProductId());
		cb.query().queryMShapeGrpDtl().setShapeId_Equal(shapeId);
		cb.query().setDelFlg_Equal_$0();

		return mProductShapeBhv.selectList(cb);
	}
	// [Ver3.0] unit of measure対応 2017.11.30 駱 End

	/**
	 * <h2>ロケーションマスタ一括登録.</h2>
	 * @param locationMasterDto ロケーションマスタ一括取込画面用DTO
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(LocationMasterBulkInputDto locationMasterBulkInputDto, ErrorStatus errSts) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION);
		}

		// ロケーションマスタ受信テーブルから、正常データ（エラーフラグ＝０）を選択して、整合性チェックを行う。
		List<SqlELocationList> sqlELocationListList = getELocationList(locationMasterBulkInputDto.data.receiveCd, locationMasterBulkInputDto.data.head, null, SelectCls.NO_ERROR_ONLY);

		List<MLocation> locationList = new ArrayList<MLocation>();

		// SqlELocationListから、MLocationに変更する。
		mappingELocationToMLocation(sqlELocationListList, locationList, locationMasterBulkInputDto.data.head.getClientCd());

		List<MLocation> insertList = new ArrayList<>();

		List<MLocation> updateList = new ArrayList<>();

		for (MLocation mLocation : locationList) {
			if ("1".equals(mLocation.getErrorFlg())) {
				continue;
			}
			// センタID取得
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);
			// センタID設定
			mLocation.setCenterId(mCenter.getCenterId());
			// ゾーンID取得
			MZone mZone = new MZone();
			mZone.setZoneCd(mLocation.getMZone().getZoneCd());

			// 倉庫ID設定
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(mLocation.getMZone().getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse, null);
			mLocation.getMZone().setWarehouseId(mWarehouse.getWarehouseId());

			mZone = zoneLogic.getUkEntity(mLocation.getMZone());

			// ゾーンID設定
			mLocation.setZoneId(mZone.getZoneId());

			//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
			if (mLocation.getMProduct() != null && mLocation.getMProduct().getProductCd() != null) {
				MProduct mProduct = new MProduct();
				mProduct.setProductCd(mLocation.getMProduct().getProductCd());
				mProduct.setClientId(locationMasterBulkInputDto.data.head.getClientId());
				mProduct = productLogic.getUkEntity(mProduct);
				mLocation.setReplenishProductId(mProduct.getProductId());

				// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
				if (mLocation.getMProductShapeByMaxStoreProductShapeId() != null) {
					if (mLocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() != null) {
						if (mLocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd() != null) {
							MShape mShape = new MShape();
							mShape.setShapeCd(mLocation.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd());
							// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
							mShape = shapeLogic.getUkEntity(mShape);

							MProductShape mProductShape = new MProductShape();
							mProductShape.setProductId(mProduct.getProductId());
							// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
							List<MProductShape> mProductShapeList=getMProductShape(mProductShape,mShape.getShapeId());
							mProductShape = mProductShapeList.get(0);
							mLocation.setMaxStoreProductShapeId(mProductShape.getProductShapeId());
							// [Ver3.0] unit of measure対応 2017.11.30 駱 End
						} else {
							mLocation.setMaxStoreProductShapeId(null);
						}

					} else {
						mLocation.setMaxStoreProductShapeId(null);
					}
				} else {
					mLocation.setMaxStoreProductShapeId(null);
				}
				if (mLocation.getMProductShapeByReplenishPProductShapeId() != null) {
					// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
					if (mLocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape() != null) {
						if (mLocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd() != null) {
							MShape mShape = new MShape();
							mShape.setShapeCd(mLocation.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape().getShapeCd());
							// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
							mShape = shapeLogic.getUkEntity(mShape);

							MProductShape mProductShape = new MProductShape();
							mProductShape.setProductId(mProduct.getProductId());
							// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
							List<MProductShape> mProductShapeList=getMProductShape(mProductShape,mShape.getShapeId());
							mProductShape = mProductShapeList.get(0);

							mLocation.setReplenishPProductShapeId(mProductShape.getProductShapeId());
							// [Ver3.0] unit of measure対応 2017.11.30 駱 End
						} else {
							mLocation.setReplenishPProductShapeId(null);
						}

					} else {
						mLocation.setReplenishPProductShapeId(null);
					}

				} else {
					mLocation.setReplenishPProductShapeId(null);
				}
			} else {
				mLocation.setReplenishProductId(null);
				mLocation.setReplenishDepositId(null);
				mLocation.setMaxStoreProductShapeId(null);
				mLocation.setReplenishPProductShapeId(null);
			}
			//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

			if (mLocation.getElocationId() == null) {
				// 登録
				insertList.add(mLocation);
			} else {
				// 修正
				updateList.add(mLocation);
			}
		}

		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		if (!insertList.isEmpty()) {
			insertLogic.batchInsert(insertList, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()) {
			updateLogic.batchUpdate(updateList, errRetSts(StatusCode.LOCATION_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End

		// 取込みフラグは１を設定する。
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		ELocationCB cb = new ELocationCB();
		cb.query().setReceiveCd_Equal(locationMasterBulkInputDto.data.receiveCd);
		cb.query().setErrorFlg_Equal("0");
		List<ELocation> updEReceive = eLocationBhv.selectList(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		for (int i = 0; i < updEReceive.size(); i++) {
			updEReceive.get(i).setImportFlg("1");
		}
		eLocationBhv.batchUpdate(updEReceive);

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

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_REGISTER_INFORMATION, String.valueOf(insertList.size()), String.valueOf(updateList.size()));
			getDatabaseLogger().endLogDtl();
		}
	}
	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.01 honma end

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>ロケーションマスタ受信テーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @return int セレクト件数
	 */
	public int getELocationCount(String receiveCd, SqlELocationListDto header) {

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();

		//荷主ID取得
		String clientCd = header.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 外出しSQLの定義
		String path = ELocationBhv.PATH_selectSqlELocationList;

		BsSqlELocationListPmb pmb = new BsSqlELocationListPmb();

		pmb.setReceiveCd(receiveCd == null ? "0" : receiveCd);
		pmb.setCenterId(centerId);
		pmb.setClientId(mClient.getClientId());
		pmb.setCultureId(getCultureId());


		pmb.setImportFlg("0");

		Class<SqlELocationList> entityType = SqlELocationList.class;

		return eLocationBhv.outsideSql().selectList(path, pmb, entityType).size();
	}

	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}
