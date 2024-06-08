package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ列マスタデータの登録ロジッククラス
 */
public class CenterColMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterColBhv mCenterColBhv;

	/**
	 * <h2>センタ列マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをセンタ列マスタに登録する。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterCol mCenterCol, ErrorStatus errSts) {
		// ===== センタ列マスタ登録実行 =====
		mCenterColBhv.insert(mCenterCol);
	}

}