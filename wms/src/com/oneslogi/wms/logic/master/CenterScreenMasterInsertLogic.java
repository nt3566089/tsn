package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ画面マスタデータの登録ロジッククラス
 */
public class CenterScreenMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterScreenBhv mCenterScreenBhv;

	/**
	 * <h2>センタ画面マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをセンタ画面マスタに登録する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterScreen mCenterScreen, ErrorStatus errSts) {
		// ===== センタ画面マスタ登録実行 =====
		mCenterScreenBhv.insert(mCenterScreen);
	}

}