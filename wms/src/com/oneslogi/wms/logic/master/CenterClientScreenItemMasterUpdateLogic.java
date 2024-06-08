package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exbhv.MClientItemBhv;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MClientItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面項目マスメンテナンス更新ロジッククラス
 */
public class CenterClientScreenItemMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientItemBhv mClientItemBhv;
	@Inject
	private MCenterItemBhv mCenterItemBhv;

	/**
	 * <h2>荷主項目マスタを削除・更新する。</h2>
	 * <pre>
	 *
	 * 荷主項目マスタのデータを削除・更新する。
	 * </pre>
	 * @param mClientItem 荷主項目マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateByClient(MClientItem mClientItem, ErrorStatus errSts) {
		if (mClientItem.getDictId() == null && mClientItem.getVisible() == null &&
				mClientItem.getEditable() == null && mClientItem.getNecessary() == null) {
			// ===== 荷主項目マスタ削除実行 =====
			mClientItemBhv.delete(mClientItem);
		} else {
			// ===== 荷主項目マスタ更新実行 =====
			mClientItemBhv.update(mClientItem);
		}
		;
	}

	/**
	 * <h2>荷主項目マスタを一括削除・更新する。</h2>
	 * <pre>
	 *
	 * 荷主項目マスタのデータを一括削除・更新する。
	 * </pre>
	 * @param mClientItemList 荷主項目マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdateByClient(List<MClientItem> mClientItemList, ErrorStatus errSts) {

		List<MClientItem> deleteList = new ArrayList<>();

		List<MClientItem> updateList = new ArrayList<>();

		for (MClientItem mClientItem : mClientItemList) {
			if (mClientItem.getDictId() == null && mClientItem.getVisible() == null &&
					mClientItem.getEditable() == null && mClientItem.getNecessary() == null) {
				deleteList.add(mClientItem);
				// ===== 荷主項目マスタ削除実行 =====
				//			mClientItemBhv.delete(mClientItem);
			} else {
				updateList.add(mClientItem);
				// ===== 荷主項目マスタ更新実行 =====
				//			mClientItemBhv.update(mClientItem);
			}
		}

		if (!deleteList.isEmpty()) {
			// ===== 荷主項目マスタ削除実行 =====
			mClientItemBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()) {
			// ===== 荷主項目マスタ更新実行 =====
			mClientItemBhv.batchUpdate(updateList);
		}

	}

	/**
	 * <h2>センタ項目マスタを削除・更新する。</h2>
	 * <pre>
	 *
	 * センタ項目マスタのデータを削除・更新する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateByCenter(MCenterItem mCenterItem, ErrorStatus errSts) {
		if (mCenterItem.getDictId() == null && mCenterItem.getVisible() == null &&
				mCenterItem.getEditable() == null && mCenterItem.getNecessary() == null) {
			// ===== センタ項目マスタ削除実行 =====
			mCenterItemBhv.delete(mCenterItem);
		} else {
			// ===== センタ項目マスタ更新実行 =====
			mCenterItemBhv.update(mCenterItem);
		}
		;
	}

	/**
	 * <h2>センタ項目マスタを一括削除・更新する。</h2>
	 * <pre>
	 *
	 * センタ項目マスタのデータを一括削除・更新する。
	 * </pre>
	 * @param mCenterItemList センタ項目マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdateByCenter(List<MCenterItem> mCenterItemList, ErrorStatus errSts) {

		List<MCenterItem> deleteList = new ArrayList<>();

		List<MCenterItem> updateList = new ArrayList<>();


		for (MCenterItem mCenterItem : mCenterItemList) {
			if (mCenterItem.getDictId() == null && mCenterItem.getVisible() == null &&
					mCenterItem.getEditable() == null && mCenterItem.getNecessary() == null) {
				deleteList.add(mCenterItem);
				// ===== センタ項目マスタ削除実行 =====
//				mCenterItemBhv.delete(mCenterItem);
			} else {
				updateList.add(mCenterItem);
				// ===== センタ項目マスタ更新実行 =====
//				mCenterItemBhv.update(mCenterItem);
			}
		}

		if (!deleteList.isEmpty()) {
			// ===== 荷主項目マスタ削除実行 =====
			mCenterItemBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()) {
			// ===== 荷主項目マスタ更新実行 =====
			mCenterItemBhv.batchUpdate(updateList);
		}
	}
}
