package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.wms.WmsMessageConst;

/**
 * 在庫区分マスタ削除ロジッククラス
 */
public class StockTypeMasterDeleteLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MStockTypeBhv mStockTypeBhv;

	/**
	 * <h2>在庫区分マスタを削除する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから在庫区分マスタのデータを削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MStockType mStockType, ErrorStatus errSts) {

		// ===== 在庫区分マスタ削除実行 =====
		try {
			mStockTypeBhv.delete(mStockType);
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				// [新WMS-111-019] 削除メッセージの変更 2015.10.22 kawana Start
				getErrorManager().add(errSts, WmsMessageConst.DATA_CANNNOT_DELETE_SQL_EXCEPTION_ERROR);
				// [新WMS-111-019] 削除メッセージの変更 2015.10.22 kawana End
			} else {
				throw e;
			}
		}
	}

	/**
	 * <h2>バッチで在庫区分マスタを削除する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから在庫区分マスタのデータを一括削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mStockType 在庫区分マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchDelete(List<MStockType> mStockType, ErrorStatus errSts) {

		// ===== 在庫区分マスタ削除実行 =====
		try {
			mStockTypeBhv.batchDelete(mStockType);
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				// [新WMS-111-019] 削除メッセージの変更 2015.10.22 kawana Start
				getErrorManager().add(errSts, WmsMessageConst.DATA_CANNNOT_DELETE_SQL_EXCEPTION_ERROR);
				// [新WMS-111-019] 削除メッセージの変更 2015.10.22 kawana End
			} else {
				throw e;
			}
		}
	}

}
