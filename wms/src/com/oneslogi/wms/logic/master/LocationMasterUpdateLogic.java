package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロケーションマスタメンテナンス更新ロジッククラス
 */
public class LocationMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * <h2>ロケーションマスタを更新する。</h2>
	 * <pre>
	 *
	 * 引数のロケーションマスタを更新する。
	 *
	 * </pre>
	 * @param mLocation ロケーションマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void update(MLocation mLocation, ErrorStatus errSts) {

		// ===== ロケーションマスタ更新実行 =====
		mLocationBhv.update(mLocation);

	}

	/**
	 * <h2>ロケーションマスタを一括更新する。</h2>
	 * <pre>
	 *
	 * 引数のロケーションマスタを一括更新する。
	 *
	 * </pre>
	 * @param mLocationList ロケーションマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void batchUpdate(List<MLocation> mLocationList, ErrorStatus errSts) {

		// ===== ロケーションマスタ更新実行 =====
//		mLocationBhv.batchUpdate(mLocationList);
		mLocationBhv.batchUpdateNonstrict(mLocationList);

	}
}
