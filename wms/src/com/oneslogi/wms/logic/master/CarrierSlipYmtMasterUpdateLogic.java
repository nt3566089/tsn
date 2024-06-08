package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ヤマト送り状マスタメンテナンス更新ロジッククラス
 */
public class CarrierSlipYmtMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYmtBhv mCarrierSlipYmtBhv;

	/**
	 * <h2>ヤマト送り状マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 削除フラグ＝1の場合、ヤマト送り状マスタのデータを削除し、
	 * それ以外の場合、ヤマト送り状マスタのデータを更新する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrierSlipYmt ヤマト送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCarrierSlipYmt mCarrierSlipYmt, ErrorStatus errSts) {
		// 削除
		if (mCarrierSlipYmt.getDelFlg().equals("1")) {
			// ===== ヤマト送り状マスタ削除実行 =====
			try {
				mCarrierSlipYmtBhv.delete(mCarrierSlipYmt);
			} catch (SQLFailureException e) {
				if (e.getSQLException() != null) {
					// データベースから削除したときのエラーがFK違反の場合
					getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
				} else {
					throw e;
				}
			}
		} else {
			// ===== ヤマト送り状マスタ更新実行 =====
			mCarrierSlipYmtBhv.update(mCarrierSlipYmt);
		}
	}

	/**
	 * <h2>ヤマト送り状マスタリストデータを一括削除、更新する。</h2>
	 * <pre>
	 *
	 * ヤマト送り状マスタリストのデータを一括削除、更新する。
	 *</pre>
	 * @param mCarrierSlipYmtList ヤマト送り状マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MCarrierSlipYmt> mCarrierSlipYmtList, ErrorStatus errSts) {

		List<MCarrierSlipYmt> deleteList = new ArrayList<>();

		List<MCarrierSlipYmt> updateList = new ArrayList<>();

		for (MCarrierSlipYmt mCarrierSlipYmt : mCarrierSlipYmtList) {
			// 削除
			if (mCarrierSlipYmt.getDelFlg().equals("1")) {
				deleteList.add(mCarrierSlipYmt);
				// ===== ヤマト送り状マスタ削除実行 =====
//				try {
//					mCarrierSlipYmtBhv.delete(mCarrierSlipYmt);
//				} catch (SQLFailureException e) {
//					if (e.getSQLException() != null) {
//						// データベースから削除したときのエラーがFK違反の場合
//						getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
//					} else {
//						throw e;
//					}
//				}
			} else {
				updateList.add(mCarrierSlipYmt);
				// ===== ヤマト送り状マスタ更新実行 =====
//				mCarrierSlipYmtBhv.update(mCarrierSlipYmt);
			}
		}

		if (!deleteList.isEmpty()){
			// ===== ヤマト送り状マスタ削除実行 =====
			// [#7211][OSS] 削除時の例外処理を実装 2020.03.04 tsuboi Start
			try {
				mCarrierSlipYmtBhv.batchDelete(deleteList);
			} catch (SQLFailureException e) {
				if (e.getSQLException() != null) {
					// データベースから削除したときのエラーがFK違反の場合
					getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
				} else {
					throw e;
				}
			}
			// [#7211][OSS] 削除時の例外処理を実装 2020.03.04 tsuboi End
		}

		if (!updateList.isEmpty()){
			// ===== ヤマト送り状マスタ更新実行 =====
			mCarrierSlipYmtBhv.batchUpdate(updateList);
		}

	}

}
