package com.oneslogi.wms.logic.assist;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロケーションマスタデータ取得ロジッククラス
 */
public class LocationListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * <h2>ロケーションマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースからロケーションマスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header ロケーションマスタ：ロケーション種別・センタID・ロケーションCD・ピックロケフラグ
	 * @param zone ゾーンマスタ：ゾーンCD
	 * @param warehouse 倉庫マスタ：倉庫CD
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MLocation> ロケーションマスタリスト
	 */
	public PagingResultBean<MLocation> select(MLocation header,MZone zone, MWarehouse warehouse, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MLocation> result = null;

		//===== ロケーションデータ取得 =====

		//検索条件の設定
		MLocationCB cb = mLocationBhv.newMyConditionBean();

		//引当禁止フラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByAllocNgFlg();
		cb.setupSelect_BClassDtlByAllocNgFlg().withVDict(getCultureId());

		//ロケーション種別
		cb.setupSelect_BClassDtlByLocationType();
		cb.setupSelect_BClassDtlByLocationType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//荷主センタ変更対応 201７.02.15 sja Start
		cb.setupSelect_MCenter();
		//荷主センタ変更対応 201７.02.15 sja End
		// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana Start
		// ピックロケフラグ
		cb.setupSelect_BClassDtlByPickingLocationFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana End

		//センタIDの設定
		cb.query().setCenterId_Equal(header.getCenterId());
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
		//ロケーション種別の設定
		cb.query().setLocationType_Equal(header.getLocationType());
		//ゾーンCD
		cb.query().queryMZone().setZoneCd_Equal(zone.getZoneCd());
		//倉庫CD
		cb.query().queryMZone().queryMWarehouse().setWarehouseCd_Equal(warehouse.getWarehouseCd());
		// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana Start
		//ピックロケフラグ
		cb.query().setPickingLocationFlg_Equal(header.getPickingLocationFlg());
		// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana End
		//ロケーションCDの設定
		cb.query().setLocationCd_PrefixSearch(header.getLocationCd());
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End

		//ソート順の設定
		cb.query().addOrderBy_LocationCd_Asc();

		//===== ロケーションマスタ検索実行 =====
		result = selectPage(mLocationBhv, cb, paging);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}