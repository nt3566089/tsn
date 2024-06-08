package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MMatchingBhv;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * マッチングマスタメンテナンス更新ロジッククラス
 */
public class MatchingMasterUpdateLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MMatchingBhv mMatchingBhv;

	/**
	 * <h2>マッチングマスタを更新する。</h2>
	 * <pre>
	 * マッチングマスタのデータを一括削除・登録・更新する。
	 *
	 * </pre>
	 * @param matchingList マッチングマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(List<MMatching> matchingList, ErrorStatus errSts) {

		List<MMatching> insertList = new ArrayList<MMatching>();
		List<MMatching> updateList = new ArrayList<MMatching>();
		List<MMatching> deleteList = new ArrayList<MMatching>();

		//マッチングマスタリストのデータ件数分繰返
		for (MMatching matching : matchingList) {
			if (matching.isDelFlg$1()) {
				// 削除

				if (matching.getMatchingId() == null) {
					// 登録なし
					continue;
				}
				deleteList.add(matching);
			} else {
				// 削除なし

				// 削除フラグを設定
				matching.setDelFlg_$0();

				if (matching.getMatchingId() == null) {

					// 新規登録
					insertList.add(matching);
				} else {

					// 更新
					updateList.add(matching);
				}
			}
		}

		// 削除、登録、更新を実行
		// [#7211][OSS] 削除時の例外処理を実装 2020.03.04 tsuboi Start
		try {
			mMatchingBhv.batchDelete(deleteList);
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
		// [#7211][OSS] 削除時の例外処理を実装 2020.03.04 tsuboi End
		mMatchingBhv.batchInsert(insertList);
		mMatchingBhv.batchUpdate(updateList);
	}
}
