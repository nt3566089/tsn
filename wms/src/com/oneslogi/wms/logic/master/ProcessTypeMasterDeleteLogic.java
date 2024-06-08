package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * 処理区分マスタメンテナンス削除ロジッククラス
 */
public class ProcessTypeMasterDeleteLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * <h2>処理区分マスタを削除する。</h2>
	 * <pre>
	 * 引数の処理区分マスタを削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProcessType 処理区分マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MProcessType mProcessType, ErrorStatus errSts) {

		// ===== 処理区分マスタ削除実行 =====
		try{
			mProcessTypeBhv.delete(mProcessType);
		}catch(SQLFailureException e){
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
	}

	/**
	 * <h2>処理区分マスタを一括削除する。</h2>
	 * <pre>
	 * 引数の処理区分マスタを一括削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProcessType 処理区分マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchDelete(List<MProcessType> mProcessType, ErrorStatus errSts) {

		// ===== 処理区分マスタ削除実行 =====
		try{
			mProcessTypeBhv.batchDelete(mProcessType);
		}catch(SQLFailureException e){
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
	}

}
