package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exbhv.MClientScreenBhv;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClientScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面マスタメンテナンス更新ロジッククラス
 */
public class CenterClientScreenMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientScreenBhv mClientScreenBhv;
	@Inject
	private MCenterScreenBhv mCenterScreenBhv;

	/**
	 * <h2>荷主画面マスタを削除・更新する。</h2>
	 * <pre>
	 *
	 * 荷主画面マスタのデータを削除・更新する。
	 * </pre>
	 * @param mClientScreen 荷主画面マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateByClient(MClientScreen mClientScreen, ErrorStatus errSts) {
		if (mClientScreen.getDictId() == null && mClientScreen.getVisible() == null) {
			// ===== 荷主画面マスタ削除実行 =====
			mClientScreenBhv.delete(mClientScreen);
		} else {
			// ===== 荷主画面マスタ更新実行 =====
			mClientScreenBhv.update(mClientScreen);
		}
		;
	}

	/**
	 * <h2>荷主画面マスタを一括削除・更新する。</h2>
	 * <pre>
	 *
	 * 荷主画面マスタのデータを一括削除・更新する。
	 * </pre>
	 * @param mClientScreenList 荷主画面マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdateByClient(List<MClientScreen> mClientScreenList, ErrorStatus errSts) {

		List<MClientScreen> deleteList = new ArrayList<>();

		List<MClientScreen> updateList = new ArrayList<>();

		for (MClientScreen mClientScreen : mClientScreenList) {
			if (mClientScreen.getDictId() == null && mClientScreen.getVisible() == null) {
				deleteList.add(mClientScreen);
				// ===== 荷主画面マスタ削除実行 =====
//				mClientScreenBhv.delete(mClientScreen);
			} else {
				updateList.add(mClientScreen);
				// ===== 荷主画面マスタ更新実行 =====
//				mClientScreenBhv.update(mClientScreen);
			}
		}

		if (!deleteList.isEmpty()) {
			// ===== 荷主画面マスタ削除実行 =====
			mClientScreenBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()) {
			// ===== 荷主画面マスタ更新実行 =====
			mClientScreenBhv.batchUpdate(updateList);
		}

	}

	/**
	 * <h2>センタ画面マスタを削除・更新する。</h2>
	 * <pre>
	 *
	 * センタ画面マスタのデータを削除・更新する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateByCenter(MCenterScreen mCenterScreen, ErrorStatus errSts) {
		if (mCenterScreen.getDictId() == null && mCenterScreen.getVisible() == null) {
			// ===== センタ画面マスタ削除実行 =====
			mCenterScreenBhv.delete(mCenterScreen);
		} else {
			// ===== センタ画面マスタ更新実行 =====
			mCenterScreenBhv.update(mCenterScreen);
		}
	}

	/**
	 * <h2>センタ画面マスタを一括削除・更新する。</h2>
	 * <pre>
	 *
	 * センタ画面マスタのデータを一括削除・更新する。
	 * </pre>
	 * @param mCenterScreenList センタ画面マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdateByCenter(List<MCenterScreen> mCenterScreenList, ErrorStatus errSts) {

		List<MCenterScreen> deleteList = new ArrayList<>();

		List<MCenterScreen> updateList = new ArrayList<>();

		for (MCenterScreen mCenterScreen : mCenterScreenList) {

			if (mCenterScreen.getDictId() == null && mCenterScreen.getVisible() == null) {
				deleteList.add(mCenterScreen);
				// ===== センタ画面マスタ削除実行 =====
//				mCenterScreenBhv.delete(mCenterScreen);
			} else {
				updateList.add(mCenterScreen);
				// ===== センタ画面マスタ更新実行 =====
//				mCenterScreenBhv.update(mCenterScreen);
			}
		}

		if (!deleteList.isEmpty()) {
			// ===== センタ画面マスタ削除実行 =====
			mCenterScreenBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()) {
			// ===== センタ画面マスタ更新実行 =====
			mCenterScreenBhv.batchUpdate(updateList);
		}
	}
}
