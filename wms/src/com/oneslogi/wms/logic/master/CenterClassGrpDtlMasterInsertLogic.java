package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値グループ明細マスタメンテナンス登録ロジッククラス
 */
public class CenterClassGrpDtlMasterInsertLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassGrpDtlBhv mCenterClassGrpDtlBhv;

	/**
	 * <h2>センタ区分値グループマスタを登録する。</h2>
	 * <pre>
	 * 選択されたデータのセンタ区分値グループ明細IDがNULLの場合、センタ区分値グループ明細マスタを登録する。
	 * センタ区分値グループ明細IDが存在する場合、センタ区分値グループ明細マスタを更新する。
	 * 未選択のデータを削除する。
	 * </pre>
	 * @param mCenterClassGrpDtl センタ区分値グループ明細マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCenterClassGrpDtl mCenterClassGrpDtl, ErrorStatus errSts) {
		if ("1".equals(mCenterClassGrpDtl.getSelectFlg())) {

			if (mCenterClassGrpDtl.getCenterClassGrpDtlId() == null) {
				// 未登録のデータ
				mCenterClassGrpDtlBhv.insert(mCenterClassGrpDtl);
			} else {
				mCenterClassGrpDtlBhv.update(mCenterClassGrpDtl);
			}
		} else {
			if (mCenterClassGrpDtl.getCenterClassGrpDtlId() != null) {
				// 未登録のデータ
				mCenterClassGrpDtlBhv.delete(mCenterClassGrpDtl);
			}
		}
	}

	// [#2166] 2017.8.4 ase Start
	/**
	 * <h2>センタ区分値グループ明細マスタを登録する。</h2>
	 * <pre>
	 *
	 * センタ区分値グループ明細マスタのデータを登録する。
	 * </pre>
	 * @param mCenterClassDtl センタ区分値グループ明細マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterClassGrpDtl mCenterClassGrpDtl, ErrorStatus errSts) {

		// ===== センタ区分値明細マスタ登録実行 =====
		mCenterClassGrpDtlBhv.insert(mCenterClassGrpDtl);
	}
	// [#2166] 2017.8.4 ase End

}
