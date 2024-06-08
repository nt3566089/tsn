package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ区分値グループマスタメンテナンス登録ロジッククラス
 */
public class CenterClassGrpMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;

	/**
	 * <h2>センタ区分値グループを登録する。</h2>
	 * <pre>
	 * センタ区分値グループを登録する。
	 *
	 * </pre>
	 * @param mCenterClassGrp センタ区分値グループマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterClassGrp mCenterClassGrp, ErrorStatus errSts) {
		//センタ区分値マスタの登録実行
		mCenterClassGrpBhv.insert(mCenterClassGrp);
	}

}
