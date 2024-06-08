package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値グループマスタメンテナンス更新ロジッククラス
 */
public class CenterClassGrpMasterUpdateLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;

	/**
	 * <h2>センタ区分値グループマスタを更新する。</h2>
	 * <pre>
	 * センタ区分値グループマスタのデータを更新する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param mCenterClassGrpList センタ区分値グループマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCenterClass mCenterClass, List<MCenterClassGrp> mCenterClassGrpList, ErrorStatus errSts) {
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		List<MCenterClassGrp> insertList = new ArrayList<>();

		List<MCenterClassGrp> updateList = new ArrayList<>();

		List<MCenterClassGrp> deleteList = new ArrayList<>();

		// センタ区分値グループマスタリストより、ループ
		for (MCenterClassGrp mCenterClassGrp : mCenterClassGrpList) {
			if (mCenterClassGrp.isDelFlg$1() && mCenterClassGrp.getCenterClassId() != null) {
				// ===== センタ区分値グループマスタの物理削除実行 =====
				deleteList.add(mCenterClassGrp);
//				try {
//					mCenterClassGrpBhv.delete(mCenterClassGrp);
//				}catch(SQLFailureException e){
//					if (e.getSQLException() != null) {
//						// データベースから削除したときのエラーがFK違反の場合
//						getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
//					} else {
//						throw e;
//					}
//				}
			} else {
				if (mCenterClassGrp.getCenterClassGrpId() != null) {
					if (mCenterClassGrp.getDelFlg() == null) {
						// 削除フラグをセット
						mCenterClassGrp.setDelFlg_$0();
					}
					// ===== センタ区分値グループマスタの更新実行 =====
					updateList.add(mCenterClassGrp);
//					mCenterClassGrpBhv.update(mCenterClassGrp);
				} else {
					mCenterClassGrp.setCenterClassId(mCenterClass.getCenterClassId());
					// ===== センタ区分値グループマスタの登録実行 =====
					insertList.add(mCenterClassGrp);
//					mCenterClassGrpBhv.insert(mCenterClassGrp);
				}
			}
		}

		if (!deleteList.isEmpty()){
			// [#7028][OSS] 致命的エラー時のメッセージを修正 2020.01.23 tsuboi Start
			try {
				// ===== センタ区分値グループマスタの物理削除実行 =====
				mCenterClassGrpBhv.batchDelete(deleteList);
			} catch (SQLFailureException e) {
				if (e.getSQLException() != null) {
					// データベースから削除したときのエラーがFK違反の場合
					getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
				} else {
					throw e;
				}
			}
			// [#7028][OSS] 致命的エラー時のメッセージを修正 2020.01.23 tsuboi End
		}

		if (!updateList.isEmpty()){
			// ===== センタ区分値グループマスタの更新実行 =====
			mCenterClassGrpBhv.batchUpdate(updateList);
		}

		if (!insertList.isEmpty()){
			// ===== センタ区分値グループマスタの挿入実行 =====
			mCenterClassGrpBhv.batchInsert(insertList);
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End


	}

}
