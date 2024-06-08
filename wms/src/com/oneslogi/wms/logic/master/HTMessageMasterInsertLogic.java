package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MHtMessageBhv;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.MHtMessage;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.util.CommonUtil;

/**
 * HTメッセージマスタデータ登録ロジッククラス
 */
public class HTMessageMasterInsertLogic extends AbstractLogic {

	//===== 使用テーブル =====
	@Inject
	private MHtMessageBhv mHtMessageBhv;

	/**
	 * <h2>HTメッセージマスタデータ登録。</h2>
	 * <pre>
	 * データを更新、追加、削除に分け、
	 * 一括でHTメッセージマスタデータを登録する。
	 * </pre>
	 * @param bmessageList メッセージリスト
	 * @param errSts エラーステータス
	 */
	public void update(List<BMessage> bmessageList, ErrorStatus errSts) {
		// ===== HTメッセージマスタ登録実行 =====
		List<MHtMessage> insertList = new ArrayList<>();

		List<MHtMessage> updateList = new ArrayList<>();

		List<MHtMessage> deleteList = new ArrayList<>();

		for (BMessage bmessage : bmessageList) {

			MHtMessage mhtmessage = bmessage.getMHtMessageAsOne();

			//update
			if (mhtmessage.getMessageId() != null && mhtmessage.getMessageNm() != null) {
				if (mhtmessage.getOldMessageNm().equals(mhtmessage.getMessageNm())) {
					continue;
				}
				updateList.add(mhtmessage);
			}

			//insert
			else if (mhtmessage.getMessageId() == null && mhtmessage.getMessageNm() != null) {

				mhtmessage.setMessageId(bmessage.getMessageId());

				insertList.add(mhtmessage);
			}

			//delete
			else if (CommonUtil.isNullOrEmpty(mhtmessage.getMessageNm()) && mhtmessage.getMessageId() != null) {
				deleteList.add(mhtmessage);
			}
		}

		//登録処理

		if (!updateList.isEmpty()) {
			mHtMessageBhv.batchUpdate(updateList);

		}

		if (!insertList.isEmpty()) {
			mHtMessageBhv.batchInsert(insertList);
		}

		if (!deleteList.isEmpty()) {
			mHtMessageBhv.batchDelete(deleteList);
		}

	}
}