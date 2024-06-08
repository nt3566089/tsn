package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ区分値マスタメンテナンス登録ロジッククラス
 */
public class CenterClassMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;

	/**
	 * <h2>センタ区分値マスタを登録する。</h2>
	 * <pre>
	 * センタ区分値マスタを登録する。
	 *
	 * </pre>
	 * @param header センタ区分値マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterClass mCenterClass, ErrorStatus errSts) {
		//センタ区分値マスタの登録実行
		mCenterClassBhv.insert(mCenterClass);
	}

}
