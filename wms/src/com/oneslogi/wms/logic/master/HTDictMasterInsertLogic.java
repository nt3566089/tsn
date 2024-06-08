package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MHtDictBhv;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.MHtDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CommonUtil;

/**
 *HT辞書マスタデータ登録処理ロジッククラス
 */
public class HTDictMasterInsertLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MHtDictBhv mhtDictBhv;

	/**
	 * <h2>HT辞書マスタデータ登録</h2>
	 * <pre>
	 * 更新・追加・削除処理を行う。
	 * </pre>
	 * @param bDictList      辞書マスタ
	 * @param errSts エラーステータス
	 *
	 */
	public void insert(List<BDict> bDictList, ErrorStatus errSts) {

		List<MHtDict> update = new ArrayList<>();

		List<MHtDict> insert = new ArrayList<>();

		List<MHtDict> delete = new ArrayList<>();

		for (BDict bdict : bDictList) {

			MHtDict mhtdict = bdict.getMHtDictAsOne();

			//update
			if (mhtdict.getDictId() != null && mhtdict.getDictNm() != null) {
				if (mhtdict.getOldDictNm().equals(mhtdict.getDictNm())) {
					continue;
				}
				update.add(mhtdict);
			}

			//insert
			else if (mhtdict.getDictId() == null && mhtdict.getDictNm() != null) {

				mhtdict.setDictId(bdict.getDictId());

				insert.add(mhtdict);
			}

			//delete
			else if (CommonUtil.isNullOrEmpty(mhtdict.getDictNm()) && mhtdict.getDictId() != null) {
				delete.add(mhtdict);

			}

		}
		//更新
		if (!update.isEmpty()) {

			mhtDictBhv.batchUpdate(update);
		}
		//追加
		if (!insert.isEmpty()) {

			mhtDictBhv.batchInsert(insert);
		}
		//削除
		if (!delete.isEmpty()) {

			mhtDictBhv.batchDelete(delete);
		}

	}
}
