package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 倉庫マスタ更新ロジッククラス
 */
public class WarehouseMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MWarehouseBhv mWarehouseBhv;

	/**
	 * <h2>倉庫マスタを更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータで倉庫マスタに更新する。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MWarehouse mWarehouse, ErrorStatus errSts) {
		// ===== 倉庫マスタ更新実行 =====
		mWarehouseBhv.update(mWarehouse);
	}

	/**
	 * <h2>バッチで倉庫マスタを更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータで倉庫マスタに更新する。
	 * </pre>
	 * @param mWarehouseList 倉庫マスタリスト：全項目
	 * @param errSts エラー時に登録するエラーステータス
	 */
	public void batchUpdate(List<MWarehouse> mWarehouseList, ErrorStatus errSts) {
		// ===== 倉庫マスタ更新実行 =====
		mWarehouseBhv.batchUpdate(mWarehouseList);
	}


}
