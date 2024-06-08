package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゆうパック送り状マスタメンテナンス更新ロジッククラス
 */
public class CarrierSlipYupkMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	/**
	 * <h2>ゆうパック送り状マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 削除フラグ＝1の場合、ゆうパック送り状マスタのデータを削除し、
	 * それ以外の場合、ゆうパック送り状マスタのデータを更新する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrierSlipYupk ゆうパック送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCarrierSlipYupk mCarrierSlipYupk, ErrorStatus errSts) {
		// 削除
		if (mCarrierSlipYupk.getDelFlg().equals("1")) {
			// ===== ゆうパック送り状マスタ削除実行 =====
			try {
				mCarrierSlipYupkBhv.delete(mCarrierSlipYupk);
			} catch (SQLFailureException e) {
				if (e.getSQLException() != null) {
					// データベースから削除したときのエラーがFK違反の場合
					getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
				} else {
					throw e;
				}
			}
		} else {
			// ===== ゆうパック送り状マスタ更新実行 =====
			mCarrierSlipYupkBhv.update(mCarrierSlipYupk);
		}
	}

	/**
	 * <h2>ゆうパック送り状マスタリストデータを一括削除、更新する。</h2>
	 * <pre>
	 *
	 * ゆうパック送り状マスタリストのデータを一括削除、更新する。
	 * </pre>
	 * @param mCarrierSlipYupkList ゆうパック送り状マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MCarrierSlipYupk> mCarrierSlipYupkList, ErrorStatus errSts) {

		List<MCarrierSlipYupk> deleteList = new ArrayList<>();

		List<MCarrierSlipYupk> updateList = new ArrayList<>();

		for (MCarrierSlipYupk mCarrierSlipYupk : mCarrierSlipYupkList) {

			// 削除
			if (mCarrierSlipYupk.getDelFlg().equals("1")) {
				// ===== ゆうパック送り状マスタ削除実行 =====
				deleteList.add(mCarrierSlipYupk);


//				try {
//					mCarrierSlipYupkBhv.delete(mCarrierSlipYupk);
//				} catch (SQLFailureException e) {
//					if (e.getSQLException() != null) {
//						// データベースから削除したときのエラーがFK違反の場合
//						getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
//					} else {
//						throw e;
//					}
//				}
			} else {
				// ===== ゆうパック送り状マスタ更新実行 =====
				updateList.add(mCarrierSlipYupk);
//				mCarrierSlipYupkBhv.update(mCarrierSlipYupk);
			}
		}

		if (!deleteList.isEmpty()){
			// [#7211][OSS] 削除時の例外処理を実装 2020.03.04 tsuboi Start
			try {
				// ===== ゆうパック送り状マスタ削除実行 =====
				mCarrierSlipYupkBhv.batchDelete(deleteList);
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
			// ===== ゆうパック送り状マスタ更新実行 =====
			mCarrierSlipYupkBhv.batchUpdate(updateList);
		}

	}
}
