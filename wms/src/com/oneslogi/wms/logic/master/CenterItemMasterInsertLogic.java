package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ項目マスタデータの登録ロジッククラス
 */
public class CenterItemMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterItemBhv mCenterItemBhv;

	/**
	 * <h2>センタ項目マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをセンタ項目マスタに登録する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterItem mCenterItem, ErrorStatus errSts) {
		// ===== センタ項目マスタ登録実行 =====
		mCenterItemBhv.insert(mCenterItem);
	}

}