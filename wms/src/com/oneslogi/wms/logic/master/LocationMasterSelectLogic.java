package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
/**
 * ロケーションマスタメンテナンス取得ロジッククラス
 */
public class LocationMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * <h2>ロケーションマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからロケーションマスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：センタID・ロケーションCD・ピックロケフラグ・削除フラグ・補充商品CD・補充商品未設定
	 * @param mWarehouse 倉庫マスタ：倉庫ID
	 * @param mZone ゾーンマスタ：ゾーンID・ゾーンCD
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MLocation> ロケーションマスタリスト
	 */
	public List<MLocation> select(MLocation mLocation, MWarehouse mWarehouse, MZone mZone, PagingData paging, ErrorStatus errSts) {

		// ===== ロケーションマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		boolean preAutoDelFlg = getBehaviorAutoDelFlg();
		setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.setupSelect_MZone().withMWarehouse();
		cb.setupSelect_MZone();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByPickingLocationFlg();
		cb.setupSelect_BClassDtlByPickingLocationFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		cb.setupSelect_MProduct().withMClient();
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		// [Ver3.0] unit of measure対応 2017.11.24 NING Start
		cb.setupSelect_MProductShapeByMaxStoreProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
		cb.setupSelect_MProductShapeByReplenishPProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
		// [Ver3.0] unit of measure対応 2017.11.24 NING Start
		// [Ver3.0] unit of measure対応 2017.11.24 NING Del
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		// ピックロケフラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByPickingLocationFlg().withVDict(getCultureId());
		// 引当禁止フラグ
		cb.setupSelect_BClassDtlByAllocNgFlg().withVDict(getCultureId());
		// ロケーション種別
		cb.setupSelect_BClassDtlByLocationType().withVDict(getCultureId());
		// 補充在庫区分
		cb.setupSelect_MStockType().withVDict(getCultureId());
		// 補充預託ID
		cb.setupSelect_MCustomer();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// センタIDの設定
		cb.query().setCenterId_Equal(mLocation.getCenterId());
		// 倉庫IDの設定
		cb.query().queryMZone().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		// ゾーンIDの設定
		cb.query().queryMZone().setZoneId_Equal(mZone.getZoneId());
		// ロケーションCDの設定
		cb.query().setLocationCd_PrefixSearch(mLocation.getLocationCd());
		// ピックロケフラグの設定
		cb.query().setPickingLocationFlg_Equal(mLocation.getPickingLocationFlg());
		// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa Start
		cb.query().queryMProduct().setProductCd_PrefixSearch(mLocation.getMProduct().getProductCd());
		if (CU.nullToStr(mLocation.getReplenishProductCdUnset()).equals("1")) {
			cb.query().setReplenishProductId_IsNull();
		}
		// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa End

		// 削除フラグの設定
		cb.query().setDelFlg_Equal(mLocation.getDelFlg());
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI Start
		cb.query().queryMZone().setZoneCd_Equal(mZone.getZoneCd());
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI End
		// ソート順の設定
		cb.query().addOrderBy_LocationCd_Asc();
		cb.query().queryMZone().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().queryMZone().addOrderBy_ZoneCd_Asc();

		// [品質-016] 検索件数制限の対応 2015.02.25 kawana Start
		// ===== ロケーションマスタ検索実行 =====
		List<MLocation> result = selectPage(mLocationBhv, cb, paging);
		// [品質-016] 検索件数制限の対応 2015.02.25 kawana End

		// 削除フラグ自動検索有効化
		setBehaviorAutoDelFlg(preAutoDelFlg);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana Start
		for (MLocation location : result) {
			// 削除フラグのチェック
			checkDelFlg(location);
		}
		// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana End

		return result;
	}

	/**
	 * <h2>ロケーションマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからロケーションマスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param locationId ロケーションID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MLocation> ロケーションマスタリスト
	 */
	public MLocation selectById(long locationId, ErrorStatus errSts) {

		// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana Start

		// ===== ロケーションマスタデータ取得 =====

		// 削除フラグ自動検索無効化
		boolean preAutoDelFlg = getBehaviorAutoDelFlg();
		setBehaviorAutoDelFlg(false);

		// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana End

		// 検索条件の設定
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.setupSelect_MZone().withMWarehouse();
		cb.setupSelect_MZone();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByPickingLocationFlg();
		cb.setupSelect_BClassDtlByPickingLocationFlg().withVDict(getCultureId());
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		cb.setupSelect_MProduct().withMClient();
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		// [Ver3.0] unit of measure対応 2017.11.28 NING Start
		cb.setupSelect_MProductShapeByMaxStoreProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
		cb.setupSelect_MProductShapeByReplenishPProductShapeId().withMShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
		// [Ver3.0] unit of measure対応 2017.11.28 NING End
		// [Ver3.0] unit of measure対応 2017.11.28 NING Del
		// ピックロケフラグ
		cb.setupSelect_BClassDtlByPickingLocationFlg().withVDict(getCultureId());
		// 引当禁止フラグ
		cb.setupSelect_BClassDtlByAllocNgFlg().withVDict(getCultureId());
		// ロケーション種別
		cb.setupSelect_BClassDtlByLocationType().withVDict(getCultureId());
		// 補充在庫区分
		cb.setupSelect_MStockType().withVDict(getCultureId());
		// 補充預託ID
		cb.setupSelect_MCustomer();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// ロケーションIDの設定
		cb.query().setLocationId_Equal(locationId);

		// ソート順の設定
		cb.query().addOrderBy_LocationCd_Asc();
		cb.query().queryMZone().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().queryMZone().addOrderBy_ZoneCd_Asc();

		// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana Start

		// ===== ロケーションマスタ検索実行 =====

		MLocation result = mLocationBhv.selectEntity(cb);

		// 削除フラグ自動検索有効化
		setBehaviorAutoDelFlg(preAutoDelFlg);

		// ===== ０件チェック =====
		if (result == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			// [#5436][v3.0] FindBugsの警告対応 2018.11.06 kawana Start
			return null;
			// [#5436][v3.0] FindBugsの警告対応 2018.11.06 kawana End
		}

		// 削除フラグのチェック
		checkDelFlg(result);

		// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana End

		return result;
	}

	// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana Start

	/**
	 * 検索したロケーションに結合されたマスタの削除フラグチェック
	 */
	private void checkDelFlg(MLocation location) {

		// 荷主の削除フラグをチェック
		if (location.chaseMProduct().chaseMClient().isDelFlg$1()) {
			location.setMProduct(null);
			location.setMCustomer(null);
		}

		// 商品の削除フラグをチェック
		if (location.chaseMProduct().isDelFlg$1()) {
			location.setMProduct(null);
		}

		// 預託の削除フラグをチェック
		if (location.chaseMCustomer().isDelFlg$1()) {
			location.setMCustomer(null);
		}
	}

	// [#3484] 荷主のドロップダウンを追加 2018.03.05 kawana End

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>ロケーションマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからロケーションマスタデータを取得する。
	 * </pre>
	 * @param clientCd 荷主CD
	 * @param productCd 商品CD
	 * @return List<MLocation> ロケーションマスタリスト
	 */
	public List<MLocation> selectByReplenishProductCd(String clientCd, String productCd) {
		List<MLocation> result = null;
		// 検索条件の設定
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		// 補充商品
		cb.setupSelect_MProduct();
		cb.setupSelect_MProduct().withMClient();

		cb.query().queryMProduct().setProductCd_Equal(productCd);
		cb.query().queryMProduct().queryMClient().setClientCd_Equal(clientCd);

		// ===== ロケーションマスタ検索実行 =====
		result = selectList(mLocationBhv, cb);

		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
}