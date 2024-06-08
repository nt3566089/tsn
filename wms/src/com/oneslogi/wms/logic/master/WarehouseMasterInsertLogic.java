package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 倉庫マスタ登録ロジッククラス
 */
public class WarehouseMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MWarehouseBhv mWarehouseBhv;

	/**
	 * <h2>倉庫マスタを登録する。</h2>
	 * <pre>
	 * 引数で受け取ったデータを倉庫マスタに登録する。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MWarehouse mWarehouse, ErrorStatus errSts) {
		// ===== 倉庫マスタ登録実行 =====
		mWarehouseBhv.insert(mWarehouse);
	}

	/**
	 * <h2>バッチで倉庫マスタを登録する。</h2>
	 * <pre>
	 * 引数で受け取ったデータを倉庫マスタに登録する。
	 * </pre>
	 * @param mWarehouseList 倉庫マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MWarehouse> mWarehouseList,ErrorStatus errSts) {
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		// ===== 倉庫マスタ登録実行 =====
		mWarehouseBhv.batchInsert(mWarehouseList);
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End
	}

}