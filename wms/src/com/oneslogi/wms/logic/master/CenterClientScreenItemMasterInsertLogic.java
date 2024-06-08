package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exbhv.MClientItemBhv;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MClientItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面項目マスタメンテナンス登録ロジッククラス
 */
public class CenterClientScreenItemMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientItemBhv mClientItemBhv;
	@Inject
	private MCenterItemBhv mCenterItemBhv;

	/**
	 * <h2>荷主項目マスタを登録する。</h2>
	 * <pre>
	 *
	 * 荷主項目マスタのデータを登録する。
	 * </pre>
	 * @param mClientItem 荷主項目マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByClient(MClientItem mClientItem, ErrorStatus errSts) {
		// ===== 荷主項目マスタ登録実行 =====
		mClientItemBhv.insert(mClientItem);
	}

	/**
	 * <h2>荷主項目マスタを一括登録する。</h2>
	 * <pre>
	 *
	 * 荷主項目マスタのデータを一括登録する。
	 * </pre>
	 * @param mClientItem 荷主項目マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsertByClient(List<MClientItem> mClientItem, ErrorStatus errSts) {
		// ===== 荷主項目マスタ登録実行 =====
		mClientItemBhv.batchInsert(mClientItem);
	}

	/**
	 * <h2>センタ項目マスタを登録する。</h2>
	 * <pre>
	 *
	 * センタ項目マスタのデータを登録する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByCenter(MCenterItem mCenterItem, ErrorStatus errSts) {
		// ===== センタ項目マスタ登録実行 =====
		mCenterItemBhv.insert(mCenterItem);
	}

	/**
	 * <h2>センタ項目マスタを一括登録する。</h2>
	 * <pre>
	 *
	 * センタ項目マスタのデータを一括登録する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsertByCenter(List<MCenterItem> mCenterItem, ErrorStatus errSts) {
		// ===== センタ項目マスタ登録実行 =====
		mCenterItemBhv.batchInsert(mCenterItem);
	}
}