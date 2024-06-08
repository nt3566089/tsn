package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;

/**
 * ロケーションバーコードリスト発行ロジッククラス
 */
public class LocationBarcodeListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;

	@Inject
	private LocationLogic locationLogic;

	/**
	 * <h2>ロケーションバーコードリストデータを発行する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからロケーションマスタデータを発行する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mLocationF ロケーションマスタ：ロケーションCD・センタID・ゾーンID
	 * @param mLocationT TOロケーションマスタ：ロケーションCD
	 * @param mZone ゾーンマスタ：倉庫ID・ゾーンCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MLocation> ロケーションマスタリスト
	 */
	public List<MLocation> select(MLocation mLocationF,MLocation mLocationT,MZone mZone,ErrorStatus errSts) {

		List<MLocation> result = new ArrayList<MLocation>();

		// ===== ロケーションマスタ取得  =====

		MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();

		mLocationCB.setupSelect_MZone();
		mLocationCB.setupSelect_MZone().withMWarehouse();
		mLocationCB.setupSelect_MCenter();
		mLocationCB.query().queryMCenter().innerJoin();
		mLocationCB.query().queryMZone().innerJoin();
		mLocationCB.query().queryMZone().queryMWarehouse().innerJoin();

		// 検索条件の設定

		mLocationCB.query().setCenterId_Equal(mLocationF.getCenterId());

		if (!CU.isNullOrEmpty(mLocationF.getLocationCdFrom())) {
			mLocationCB.query().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocationF).getLocationCdFrom());
		}

		if (!CU.isNullOrEmpty(mLocationT.getLocationCdTo())) {
			mLocationCB.query().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocationT).getLocationCdTo());
		}

		mLocationCB.query().setZoneId_Equal(mLocationF.getZoneId());

		mLocationCB.query().queryMZone().setWarehouseId_Equal(mZone.getWarehouseId());
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI Start
		mLocationCB.query().queryMZone().setZoneCd_Equal(mZone.getZoneCd());
		// [SK2-051] ゾーン項目を指定して発行すると「致命的エラー～」のメッセージが表示される。2014.12.13 KI End
		mLocationCB.query().queryMZone().queryMWarehouse().addOrderBy_WarehouseCd_Asc();

		mLocationCB.query().queryMZone().addOrderBy_ZoneCd_Asc();

		mLocationCB.query().addOrderBy_LocationCd_Asc();

		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		result = selectListToReport(mLocationBhv, mLocationCB);
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

}