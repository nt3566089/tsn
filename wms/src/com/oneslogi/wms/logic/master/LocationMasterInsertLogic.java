package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *ロケーションマスタメンテナンス登録ロジッククラス
 */
public class LocationMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * <h2>ロケーションマスタを登録する。</h2>
	 * <pre>
	 * 引数のロケーションマスタを登録する。
	 *
	 * </pre>
	 * @param mLocation ロケーションマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MLocation mLocation, ErrorStatus errSts) {

		// =====ロケーションマスタ登録実行 =====
		mLocationBhv.insert(mLocation);
	}

	/**
	 * <h2>ロケーションマスタを一括登録する。</h2>
	 * <pre>
	 * 引数のロケーションマスタを一括登録する。
	 * </pre>
	 * @param mLocationList ロケーションマスタリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MLocation> mLocationList, ErrorStatus errSts) {
		// =====ロケーションマスタ登録実行 =====
		mLocationBhv.batchInsert(mLocationList);
	}

}