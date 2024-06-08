package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exbhv.MClientColBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MClientCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面グリッドマスタメンテナンス更新ロジッククラス
 */
public class CenterClientScreenColMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientColBhv mClientColBhv;
	@Inject
	private MCenterColBhv mCenterColBhv;

	/**
	 * <h2>荷主列マスタを削除・更新する。</h2>
	 * <pre>
	 *
	 * 荷主列マスタのデータを削除・更新する。
	 * </pre>
	 * @param mClientCol 荷主列マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateByClient(MClientCol mClientCol, ErrorStatus errSts) {
		if (mClientCol.getDictId() == null && mClientCol.getVisible() == null &&
				mClientCol.getEditable() == null && mClientCol.getNecessary() == null) {
			// ===== 荷主列マスタ削除実行 =====
			mClientColBhv.delete(mClientCol);
		} else {
			// ===== 荷主列マスタ更新実行 =====
			mClientColBhv.update(mClientCol);
		}
		;
	}

	/**
	 * <h2>荷主列マスタを一括削除・更新する。</h2>
	 * <pre>
	 *
	 * 荷主列マスタのデータを一括削除・更新する。
	 * </pre>
	 * @param mClientColList 荷主列マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdateByClient(List<MClientCol> mClientColList, ErrorStatus errSts) {

		List<MClientCol> deleteList = new ArrayList<>();

		List<MClientCol> updateList = new ArrayList<>();

		for (MClientCol mClientCol : mClientColList) {

			if (mClientCol.getDictId() == null && mClientCol.getVisible() == null &&
					mClientCol.getEditable() == null && mClientCol.getNecessary() == null) {
				deleteList.add(mClientCol);
				// ===== 荷主列マスタ削除実行 =====
				//				mClientColBhv.delete(mClientCol);
			} else {
				updateList.add(mClientCol);
				// ===== 荷主列マスタ更新実行 =====
				//				mClientColBhv.update(mClientCol);
			}
		}

		if (!deleteList.isEmpty()) {
			// ===== 荷主列マスタ削除実行 =====
			mClientColBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()) {
			// ===== 荷主列マスタ削除実行 =====
			mClientColBhv.batchUpdate(updateList);
		}

	}

	/**
	 * <h2>センタ列マスタを削除・更新する。</h2>
	 * <pre>
	 *
	 * センタ列マスタのデータを削除・更新する。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateByCenter(MCenterCol mCenterCol, ErrorStatus errSts) {
		if (mCenterCol.getDictId() == null && mCenterCol.getVisible() == null &&
				mCenterCol.getEditable() == null && mCenterCol.getNecessary() == null) {
			// ===== センタ列マスタ削除実行 =====
			mCenterColBhv.delete(mCenterCol);
		} else {
			// ===== センタ列マスタ更新実行 =====
			mCenterColBhv.update(mCenterCol);
		}
		;
	}

	/**
	 * <h2>センタ列マスタを一括削除・更新する。</h2>
	 * <pre>
	 *
	 * センタ列マスタのデータを一括削除・更新する。
	 * </pre>
	 * @param mCenterColList センタ列マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdateByCenter(List<MCenterCol> mCenterColList, ErrorStatus errSts) {

		List<MCenterCol> deleteList = new ArrayList<>();

		List<MCenterCol> updateList = new ArrayList<>();

		for (MCenterCol mCenterCol : mCenterColList) {

			if (mCenterCol.getDictId() == null && mCenterCol.getVisible() == null &&
					mCenterCol.getEditable() == null && mCenterCol.getNecessary() == null) {
				deleteList.add(mCenterCol);
				// ===== センタ列マスタ削除実行 =====
//				mCenterColBhv.delete(mCenterCol);
			} else {
				updateList.add(mCenterCol);
				// ===== センタ列マスタ更新実行 =====
//				mCenterColBhv.update(mCenterCol);
			}
		}
		if (!deleteList.isEmpty()) {
			// ===== 荷主列マスタ削除実行 =====
			mCenterColBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()) {
			// ===== 荷主列マスタ削除実行 =====
			mCenterColBhv.batchUpdate(updateList);
		}
	}
}
