package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MHtDictCultureBhv;
import com.oneslogi.base.dbflute.exentity.BDictCulture;
import com.oneslogi.base.dbflute.exentity.MHtDictCulture;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CommonUtil;

/**
 *HT辞書マスタデータ登録処理ロジッククラス
 */
public class HTDictCultureMasterInsertLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MHtDictCultureBhv mHtDictCultureBhv;

	/**
	 * <h2>HT辞書カルチャマスタデータ登録	。</h2>
	 * <pre>
	 * 更新、追加、削除処理の実行結果を元に
	 * HT辞書カルチャマスタ情報を登録する。
	 *
	 * </pre>
	 * @param bDictCultureList      辞書カルチャマスタリスト
	 * @param errSts エラーステータス
	 */
	public void update(List<BDictCulture> bDictCultureList, ErrorStatus errSts) {

		List<MHtDictCulture> insertList = new ArrayList<>();

		List<MHtDictCulture> updateList = new ArrayList<>();

		List<MHtDictCulture> deleteList = new ArrayList<>();

		for (BDictCulture bdictculture : bDictCultureList) {

			MHtDictCulture mhtdictculture = bdictculture.getMHtDictCultureAsOne();

			//update
			if (mhtdictculture.getDictCultureId() != null && mhtdictculture.getDictNm() != null) {

				if (mhtdictculture.getOldDictNm().equals(mhtdictculture.getDictNm())) {
					continue;
				}
				updateList.add(mhtdictculture);
			}

			//inseert
			else if (mhtdictculture.getDictCultureId() == null && mhtdictculture.getDictNm() != null) {

				mhtdictculture.setDictCultureId(bdictculture.getDictCultureId());

				insertList.add(mhtdictculture);
			}

			//delete
			else if (CommonUtil.isNullOrEmpty(mhtdictculture.getDictNm()) && mhtdictculture.getDictCultureId() != null) {
				deleteList.add(mhtdictculture);
			}
		}

		//登録処理

		if (!updateList.isEmpty()) {

			mHtDictCultureBhv.batchUpdate(updateList);
		}

		if (!insertList.isEmpty()) {

			mHtDictCultureBhv.batchInsert(insertList);
		}

		if (!deleteList.isEmpty()) {

			mHtDictCultureBhv.batchDelete(deleteList);
		}

	}

}