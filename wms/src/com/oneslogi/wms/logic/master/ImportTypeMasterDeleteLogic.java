package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCB;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * 取込種別マスタメンテナンス削除ロジッククラス
 */
public class ImportTypeMasterDeleteLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MImportTypeBhv mImportTypeBhv;
	@Inject
	private MImportTypeBBhv mImportTypeBBhv;

	/**
	 * <h2>取込種別マスタを削除する。</h2>
	 * <pre>
	 *
	 * 取込種別マスタと取込種別ボディマスタのデータを削除する。
	 *
	 * </pre>
	 * @param importTypeList 取込種別マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(List<MImportType> importTypeList, ErrorStatus errSts) {

		MImportTypeBCB bodyCb = mImportTypeBBhv.newMyConditionBean();

		// 削除対象の取込種別IDのリストを作成
		List<Long> importTypeIdList = new ArrayList<Long>();
		for (MImportType h : importTypeList) {
			importTypeIdList.add(h.getImportTypeId());
		}
		bodyCb.query().setImportTypeId_InScope(importTypeIdList);

		// [#6902][OSS] 致命的エラー時のメッセージを修正 2020.01.23 tsuboi Start
		try {
			// ===== 取込種別ボディマスタ削除実行 =====
			mImportTypeBBhv.queryDelete(bodyCb);

			// ===== 取込種別マスタ削除実行 =====
			mImportTypeBhv.batchDelete(importTypeList);

		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
		// [#6902][OSS] 致命的エラー時のメッセージを修正 2020.01.23 tsuboi End

	}
}
