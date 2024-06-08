package com.oneslogi.wms.logic.master;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.WLocationInputCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.WLocationInputBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.WLocationInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.util.WCU;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * ロケーションマスタ取込サブロジッククラス
 */
public class LocationInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private WLocationInputBhv wLocationInputBhv;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private LocationMasterInsertLogic locationMasterInsertLogic;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	@Inject
	private ProductLogic productLogic;
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End
	// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Add Start
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Add End

	/**
	 * <h2>ロケーションマスタ取込ワークテーブルを登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータをロケーションマスタ取込ワークテーブルに登録する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWLocationInput ロケーションマスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WLocationInput> lstWLocationInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWLocationInput, errSts);
	}

	/**
	 * <h2>ロケーションマスタ取込ワークテーブルを登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータをロケーションマスタ取込ワークテーブルに登録する。
	 *
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWLocationInput ロケーションマスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WLocationInput> lstWLocationInput, ErrorStatus errSts) {
		wLocationInputBhv.batchInsert(lstWLocationInput);
	}

	/**
	 * <h2>ロケーションマスタ取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * ロケーションマスタ取込ワークが全削除後追記の場合、事前に削除する。
	 *
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>ロケーションマスタ取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * ロケーションマスタ取込ワークが全削除後追記の場合、事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「ロケーションマスタ取込ワーク」テーブルを全件削除する
		try {
			WLocationInputCB wLocationInputCB = wLocationInputBhv.newConditionBean();
			wLocationInputBhv.varyingQueryDelete(wLocationInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wLocationInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>ロケーションマスタを移行する（コミットあり）。</h2>
	 * <pre>
	 * ロケーションマスタ登録を呼出し、ロケーションマスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWLocationInput ロケーションマスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WLocationInput> lstWLocationInput, ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWLocationInput, errSts);
	}

	/**
	 * <h2>ロケーションマスタを移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、ロケーションマスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWLocationInput ロケーションマスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws Exception  例外処理
	 */
	public void register(DataInputDto dataInputDto, List<WLocationInput> lstWLocationInput, ErrorStatus errSts) throws Exception {

		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
		// ===== 各種区分値CDより区分値明細マスタマップ取得 =====
		// ピックロケフラグ
		Map<String, String> pickingLocationMap = centerClassLogic.getClassMapByCd("PICKING_LOCATION_FLG");
		// ロケーション種別CD
		Map<String, String> locationTypeMap = centerClassLogic.getClassMapByCd("LOCATION_TYPE");
		// 引当禁止フラグ
		Map<String, String> allNgMap = centerClassLogic.getClassMapByCd("ALLC_NG_FLG");
		// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Add Start
		// 在庫区分マスタマップ取得
		Map<String, String> stockTypeMap = stockTypeLogic.getStockTypeMap();
		// 取引先マスタマップ取得
		Map<String, String> depositMap = customerLogic.getDepositMapByClientCd(getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_CD_KEY_NAME));
		// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Add Start
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// ロケーションCDファイル内重複チェック用
		Set<String> locationCdDuplicateSet = new HashSet<String>();
		// ロケーション名称ファイル内重複チェック用
		Set<String> locationNmDuplicateSet = new HashSet<String>();
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End

		for (WLocationInput wLocationInput : lstWLocationInput) {
			MLocation mLocation = new MLocation();

			getErrorManager().clear();

			// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
			// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Mod Start
			// 取込データのチェック処理を行う
			checkRegister(wLocationInput, mLocation, locationCdDuplicateSet, locationNmDuplicateSet, pickingLocationMap
					, locationTypeMap, allNgMap, stockTypeMap, depositMap, errSts);
			// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Mod End
			// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wLocationInput,getErrorManager());
				wLocationInputBhv.update(wLocationInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// ロケーションマスタ登録処理を行う
			locationMasterInsertLogic.insert(mLocation, errSts);
			if (getErrorManager().size() > 0) {
				setErrorMessage(wLocationInput, getErrorManager());
				wLocationInputBhv.update(wLocationInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			wLocationInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wLocationInputBhv.update(wLocationInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、以下のチェックを行う。
	 *・センタCDの存在チェック
	 *・倉庫CD存在チェック
	 *・ゾーンCD存在チェック
	 *・補充点商品荷姿CD存在チェック
	 *・最大格納数商品荷姿CD存在チェック
	 *・ロケーションCDの必須チェック
	 *・ロケーション名称の必須チェック
	 *・ピックロケフラグの必須チェック
	 *・ピックロケフラグの区分値明細マスタ存在チェック
	 *・ピッキング順序の必須チェック
	 *・ピッキング順序の0以上チェック
	 *・ロケーション種別の必須チェック
	 *・ロケーション種別の区分値明細マスタ存在チェック
	 *・引当順序の必須チェック
	 *・引当順序の0以上チェック
	 *・引当禁止フラグの必須チェック
	 *・引当禁止フラグの区分値明細マスタ存在チェック
	 *・補充の場合、補充項目の必須チェック
	 *・補充点の0以上チェック
	 *・最大格納数の0以上チェック
	 *・補充の場合、ピックロケになるチェック
	 *・ロケーションCD重複チェック
	 *・ロケーション名称重複チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 引数のロケーションマスタにロケーションマスタ取込ワーク情報を設定する。
	 * </pre>
	 * @param wLocationInput ロケーションマスタ取込ワーク：全項目
	 * @param mLocation ロケーションマスタ
	 * @param locationCdDuplicateSet ロケーションCDファイル内重複チェック用
	 * @param locationNmDuplicateSet ロケーション名称ファイル内重複チェック用
	 * @param pickingLocationMap ピックロケフラグ区分値明細マスタマップ
	 * @param locationTypeMap ロケーション種別区分値明細マスタマップ
	 * @param allNgMap 引当禁止フラグ区分値明細マスタマップ
	 * @param stockTypeMap 在庫区分マスタマップ
	 * @param depositMap 取引先マスタマップ(預託)
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Mod Start
	public void checkRegister(WLocationInput wLocationInput, MLocation mLocation, Set<String> locationCdDuplicateSet, Set<String> locationNmDuplicateSet
			, Map<String, String> pickingLocationMap, Map<String, String> locationTypeMap, Map<String, String> allNgMap
			, Map<String, String> stockTypeMap, Map<String, String> depositMap, ErrorStatus errSts) {
	// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Mod End

		wLocationInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wLocationInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 項目チェック
		// センタCD
		if (CU.isNullOrEmpty(wLocationInput.getCenterCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wLocationInput.getCenterCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wLocationInput.getCenterCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		// ===== センタCd取得とセンタID設定 =====
		String centerCd = wLocationInput.getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
		} else {
			mLocation.setCenterId(mCenter.getCenterId());
			mLocation.setMCenter(mCenter);
		}

		// 倉庫CD
		if (CU.isNullOrEmpty(wLocationInput.getWarehouseCd())) {
			getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wLocationInput.getWarehouseCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wLocationInput.getWarehouseCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		// ===== 倉庫Cd取得と倉庫ID設定 =====
		MWarehouse mWarehouse = null;
		if (mCenter != null) {
			String warehouseCd = wLocationInput.getWarehouseCd();
			mWarehouse = new MWarehouse();
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			if (mWarehouse == null) {
				getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
			}
		}

		// ゾーンCD
		if (CU.isNullOrEmpty(wLocationInput.getZoneCd())) {
			getErrorManager().add(errSts, WmsMessageConst.ZONE_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z]*$", wLocationInput.getZoneCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ZONE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,2}$", wLocationInput.getZoneCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ZONE_CD_CHECK_INPUT_MAX_ERROR, "2");
			}
		}

		// ===== ゾーンCd取得とゾーンID設定 =====
		if (mWarehouse != null) {
			String zoneCd = wLocationInput.getZoneCd();
			MZone mZone = new MZone();
			mZone.setWarehouseId(mWarehouse.getWarehouseId());
			mZone.setZoneCd(zoneCd);
			mZone = zoneLogic.getUkEntity(mZone, errSts);
			if (mZone == null) {
				getErrorManager().add(errSts, WmsMessageConst.ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR);
			} else {
				mLocation.setZoneId(mZone.getZoneId());
			}
		}

		// ロケーションCD
		if (CU.isNullOrEmpty(wLocationInput.getLocationCd())) {
			getErrorManager().add(errSts, WmsMessageConst.LOCATION_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z]*$", wLocationInput.getLocationCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_CODE_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z]{1,10}$", wLocationInput.getLocationCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_CODE_CHECK_INPUT_MAX_ERROR, "10");
			}
			if (locationCdDuplicateSet.contains(wLocationInput.getLocationCd())) {
				// ファイル内重複エラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_CODE_DUPLICATE_ERROR);
			} else {
				// ファイル内重複チェック用に追加
				locationCdDuplicateSet.add(wLocationInput.getLocationCd());
			}
		}
		// ロケーション名称
		if (CU.isNullOrEmpty(wLocationInput.getLocationNm())) {
			getErrorManager().add(errSts, WmsMessageConst.LOCATION_NM_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput(".{1,15}$", wLocationInput.getLocationNm())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_NM_CHECK_INPUT_MAX_ERROR);
			}
			if (locationNmDuplicateSet.contains(wLocationInput.getLocationNm())) {
				// ファイル内重複エラー
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_NAME_DUPLICATE_ERROR);
			} else {
				// ファイル内重複チェック用に追加
				locationNmDuplicateSet.add(wLocationInput.getLocationNm());
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
		// ピックロケフラグ
		if (CU.isNullOrEmpty(wLocationInput.getPickingLocationFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.PICKING_LOCATION_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!pickingLocationMap.containsKey(wLocationInput.getPickingLocationFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.PICKING_LOCATION_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
		// ピッキング順序
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (CU.isNullOrEmpty(wLocationInput.getPickingOrder())) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			getErrorManager().add(errSts, WmsMessageConst.PICKING_ORDER_NOT_INPUT_ERROR);
		} else {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			String strPickingOrder = wLocationInput.getPickingOrder();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+(\\.\\d+)?$", strPickingOrder)) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.PICKING_ORDER_CHECK_NUMERIC_ONLY_ERROR);
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", strPickingOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数5桁以内
				getErrorManager().add(errSts, WmsMessageConst.PICKING_ORDER_CHECK_INPUT_INTEGER_ERROR, "5");
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+$", strPickingOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.PICKING_ORDER_CHECK_INPUT_DECIMAL_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (Long.valueOf(strPickingOrder).longValue() < 0) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				getErrorManager().add(errSts, WmsMessageConst.PICKING_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
		// ロケーション種別
		if (CU.isNullOrEmpty(wLocationInput.getLocationType())) {
			getErrorManager().add(errSts, WmsMessageConst.LOCATION_TYPE_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!locationTypeMap.containsKey(wLocationInput.getLocationType())) {
				getErrorManager().add(errSts, WmsMessageConst.LOCATION_TYPE_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
		// 引当順序
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (CU.isNullOrEmpty(wLocationInput.getAllocOrder())) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_NOT_INPUT_ERROR);
		} else {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			String strAllocOrder = wLocationInput.getAllocOrder();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+(\\.\\d+)?$", strAllocOrder)) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_CHECK_NUMERIC_ONLY_ERROR);
				// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", strAllocOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数5桁以内
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_INTEGER_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+$", strAllocOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_DECIMAL_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (Long.valueOf(strAllocOrder).longValue() < 0) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
		// 引当禁止フラグ
		if (CU.isNullOrEmpty(wLocationInput.getAllocNgFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.ALLOC_NG_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!allNgMap.containsKey(wLocationInput.getAllocNgFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.ALLC_NG_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
		// [Ver3.0] unit of measure対応 2017.12.21 NING Start
		MProduct mProduct = null;
		// [Ver3.0] unit of measure対応 2017.12.21 NING End
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// 補充商品CD
		if (!CU.isNullOrEmpty(wLocationInput.getRestockProductCd())) {
			if (!checkExcelCellInput("^[!-~]*$", wLocationInput.getRestockProductCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR);
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", wLocationInput.getRestockProductCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_PRODUCT_CD_CHECK_INPUT_MAX_ERROR, "30");
			}

			// 商品マスタ存在チェック
			mProduct = new MProduct();
			mProduct.setClientId(Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
			mProduct.setProductCd(wLocationInput.getRestockProductCd());
			try {
				mProduct = productLogic.getUkEntityWithDeletedCheck(mProduct);
				if (mProduct != null) {
					// [Ver3.0] unit of measure対応 2017.12.21 NING Start
					if (mProduct.getMShapeGrp().isDecimalExistFlg$0()) {
						// 補充商品ID
						mLocation.setReplenishProductId(mProduct.getProductId());
					}
					// 小数有無フラグチェック
					if (mProduct.getMShapeGrp().isDecimalExistFlg$1()) {
						// 小数有り商品エラー
						getErrorManager().add(errSts, WmsMessageConst.INPUT_PRODUCT_DECIMAL_EXIST_FLG_ERROR);
					}
				}
			} catch (EntityAlreadyDeletedException ex) {
				this.getErrorManager().add(errSts, WmsMessageConst.REPLENISH_PRODUCT_CD_NOT_FOUND_ERROR);
				mProduct = null;
			}
		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Add Start
		// 補充在庫区分CD
		if (!CU.isNullOrEmpty(wLocationInput.getRestockStockTypeCd())) {
			// 在庫区分マスタ存在チェック
			if (!stockTypeMap.containsKey(wLocationInput.getRestockStockTypeCd())) {
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_STOCK_TYPE_CD_NOT_FOUND_ERROR);
			} else {
				mLocation.setReplenishStockTypeId(Long.parseLong(stockTypeMap.get(wLocationInput.getRestockStockTypeCd())));
			}
		}
		// 補充預託CD
		if (!CU.isNullOrEmpty(wLocationInput.getRestockDepositCd())) {
			// 取引先マスタ(預託)存在チェック
			if (!depositMap.containsKey(wLocationInput.getRestockDepositCd())) {
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_DEPOSIT_CD_NOT_FOUND_ERROR);
			} else {
				mLocation.setReplenishDepositId(Long.parseLong(depositMap.get(wLocationInput.getRestockDepositCd())));
			}
		}
		// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Add End

		// 補充点荷姿CD
		if (!CU.isNullOrEmpty(wLocationInput.getRestockShapeCd())) {
			if (!checkExcelCellInput("^[0-9a-zA-Z]*$", wLocationInput.getRestockShapeCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR);
			}
			if (!checkExcelCellInput(".{1,30}$", wLocationInput.getRestockShapeCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_INPUT_MAX_ERROR, "30");
			}
			if (mProduct != null) {
				MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
				// [Ver3.0] unit of measure対応 2017.12.21 NING Del
				mProductShapeCB.setupSelect_MShapeGrpDtl().withMShape();
				mProductShapeCB.query().setProductId_Equal(mProduct.getProductId());
				// [Ver3.0] unit of measure対応 2017.12.21 NING Del
				mProductShapeCB.query().queryMShapeGrpDtl().queryMShape().setShapeCd_Equal(wLocationInput.getRestockShapeCd());
				MProductShape mProductShape = mProductShapeBhv.selectEntity(mProductShapeCB);
				if (mProductShape != null) {
					// 補充点商品荷姿ID
					mLocation.setReplenishPProductShapeId(mProductShape.getProductShapeId());
				} else {
					// [Ver3.0] unit of measure対応 2017.12.21 NING Start
					// 荷姿マスタ未存在エラー
					getErrorManager().add(errSts, WmsMessageConst.REPLENISH_P_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR);
					// [Ver3.0] unit of measure対応 2017.12.21 NING End
				}
			}
		}

		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// 補充点
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wLocationInput.getRestockPointNum())) {
			String restockPointNum = wLocationInput.getRestockPointNum();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", restockPointNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_P_NUM_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", restockPointNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数7桁以内
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_P_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR, "7");
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?\\d+$", restockPointNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.REPLENISH_P_NUM_CHECK_INPUT_DECIMAL_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
				// [Ver3.0] unit of measure対応 2017.12.21 NING End
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(restockPointNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.RESTOCK_POINT_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
		}

		// 最大格納数商品荷姿CD
		if (!CU.isNullOrEmpty(wLocationInput.getMaxStoreShapeCd())) {
			if (!checkExcelCellInput("^[0-9a-zA-Z]*$", wLocationInput.getMaxStoreShapeCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR);
			}
			if (!checkExcelCellInput(".{1,30}$", wLocationInput.getMaxStoreShapeCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_CHECK_INPUT_MAX_ERROR, "30");
			}
			if (mProduct != null) {
				MProductShapeCB mProductShapeMaxCB = mProductShapeBhv.newMyConditionBean();
				// [Ver3.0] unit of measure対応 2017.12.21 NING Del
				mProductShapeMaxCB.setupSelect_MShapeGrpDtl().withMShape();
				mProductShapeMaxCB.query().setProductId_Equal(mProduct.getProductId());
				// [Ver3.0] unit of measure対応 2017.12.21 NING Del
				mProductShapeMaxCB.query().queryMShapeGrpDtl().queryMShape().setShapeCd_Equal(wLocationInput.getMaxStoreShapeCd());
				MProductShape mProductShapeMax = mProductShapeBhv.selectEntity(mProductShapeMaxCB);
				if (mProductShapeMax != null) {
					// 最大格納数商品荷姿ID
					mLocation.setMaxStoreProductShapeId(mProductShapeMax.getProductShapeId());
				} else {
					// [Ver3.0] unit of measure対応 2017.12.21 NING Start
					// 荷姿マスタ未存在エラー
					getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR);
					// [Ver3.0] unit of measure対応 2017.12.21 NING End
				}
			}
		}

		// 最大格納数
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wLocationInput.getMaxStoreNum())) {
			String maxStoreNum = wLocationInput.getMaxStoreNum();
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", maxStoreNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_NUM_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", maxStoreNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数7桁以内
				getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR, "7");
				// [Ver3.0] unit of measure対応 2017.12.21 NING Start
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!checkExcelCellInput("^(-)?\\d+$", maxStoreNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_NUM_CHECK_INPUT_DECIMAL_ERROR);
				// [#3776][Ver3.0] 小数計算方法の共通化 2018.03.01 honma Mod End
				// [Ver3.0] unit of measure対応 2017.12.21 NING End
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (WCC.isNegative(maxStoreNum)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.MAX_STORE_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
		}

		// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Mod Start
		// 補充商品CD、補充在庫区分CD、補充預託CD、補充点荷姿CD、補充点、最大格納数商品荷姿CD、最大格納数いずれ入力ある場合、補充の項目が全部必須入力になること
		if (!CU.isNullOrEmpty(wLocationInput.getRestockProductCd()) &&
				!CU.isNullOrEmpty(wLocationInput.getRestockStockTypeCd()) &&
				!CU.isNullOrEmpty(wLocationInput.getRestockDepositCd()) &&
				!CU.isNullOrEmpty(wLocationInput.getRestockShapeCd()) &&
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				!CU.isNullOrEmpty(wLocationInput.getRestockPointNum()) &&
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				!CU.isNullOrEmpty(wLocationInput.getMaxStoreShapeCd()) &&
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				!CU.isNullOrEmpty(wLocationInput.getMaxStoreNum()) ) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End

		} else if(CU.isNullOrEmpty(wLocationInput.getRestockProductCd()) &&
				CU.isNullOrEmpty(wLocationInput.getRestockStockTypeCd()) &&
				CU.isNullOrEmpty(wLocationInput.getRestockDepositCd()) &&
				CU.isNullOrEmpty(wLocationInput.getRestockShapeCd()) &&
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				CU.isNullOrEmpty(wLocationInput.getRestockPointNum()) &&
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				CU.isNullOrEmpty(wLocationInput.getMaxStoreShapeCd()) &&
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
				CU.isNullOrEmpty(wLocationInput.getMaxStoreNum()) ) {
					// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End

		// [#4084][Ver3.0] 初期データ取込 - 取込項目の統一化 2018.03.16 honma Mod End
		} else {
			getErrorManager().add(errSts, WmsMessageConst.SUPPLEMENT_NO_INPUT_ERROR);
		}
		// 補充商品CDの入力ある場合、ピックロケフラグ(ピックロケ)になること
		if (!CU.isNullOrEmpty(wLocationInput.getRestockProductCd()) &&
				!CU.isNullOrEmpty(wLocationInput.getPickingLocationFlg()) &&
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				CDef.PickingLocationFlg.$1 != CDef.PickingLocationFlg.codeOf(wLocationInput.getPickingLocationFlg())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			getErrorManager().add(errSts, WmsMessageConst.PICKING_PICKING_LOCATION_FLG_NOT_INPUT_ERROR);
		}
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		// ロケーションCD DB重複チェック
		if (mLocation.getMCenter() != null &&
				!CU.isNullOrEmpty(wLocationInput.getLocationCd())) {
			mLocation.setLocationCd(wLocationInput.getLocationCd());
			locationLogic.checkLocationCdInsert(mLocation, errSts);
		}

		// ロケーション名称 DB重複チェック
		if (mLocation.getMCenter() != null &&
				!CU.isNullOrEmpty(wLocationInput.getLocationCd()) &&
				!CU.isNullOrEmpty(wLocationInput.getLocationNm())) {
			mLocation.setLocationCd(wLocationInput.getLocationCd());
			mLocation.setLocationNm(wLocationInput.getLocationNm());
			locationLogic.checkLocationNmInsert(mLocation, errSts);
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

		if (getErrorManager().size() > 0) {
			return;
		}

		mLocation.setPickingLocationFlg(wLocationInput.getPickingLocationFlg());
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mLocation.setPickingOrder(WCU.stringToLong(wLocationInput.getPickingOrder()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
		mLocation.setLocationType(wLocationInput.getLocationType());
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mLocation.setAllocOrder(WCU.stringToLong(wLocationInput.getAllocOrder()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
		mLocation.setAllocNgFlg(wLocationInput.getAllocNgFlg());
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mLocation.setReplenishPNum(WCU.stringToBigDecimal(wLocationInput.getRestockPointNum()));
		mLocation.setMaxStoreNum(WCU.stringToBigDecimal(wLocationInput.getMaxStoreNum()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
	}

	/**
	 * <h2>ロケーションマスタテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 移行が全削除後追記の場合、ロケーションマスタを事前に削除する。
	 *
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(ErrorStatus errSts) {
		delete(errSts);
	}

	/**
	 * <h2>ロケーションマスタテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 移行が全削除後追記の場合、ロケーションマスタを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(ErrorStatus errSts) {
		//「ロケーションマスタ」テーブルを全件削除する
		try {
			MLocationCB mLocationCB = mLocationBhv.newConditionBean();
			mLocationBhv.varyingQueryDelete(mLocationCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mLocationBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mLocationBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mLocationBhv.asTableDbName().toUpperCase());
			return;
		}
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
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
	// [Ver3.0] unit of measure対応 2017.12.21 NING End
}
