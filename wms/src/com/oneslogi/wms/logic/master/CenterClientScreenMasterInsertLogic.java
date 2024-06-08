package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exbhv.MClientScreenBhv;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClientScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面マスタメンテナンス登録ロジッククラス
 */
public class CenterClientScreenMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientScreenBhv mClientScreenBhv;
	@Inject
	private MCenterScreenBhv mCenterScreenBhv;

	/**
	 * <h2>荷主画面マスタを登録する。</h2>
	 * <pre>
	 *
	 * 荷主画面マスタのデータを登録する。
	 * </pre>
	 * @param mClientScreen 荷主画面マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByClient(MClientScreen mClientScreen, ErrorStatus errSts) {
		// ===== 荷主画面マスタ登録実行 =====
		mClientScreenBhv.insert(mClientScreen);
	}

	/**
	 * <h2>荷主画面マスタを一括登録する。</h2>
	 * <pre>
	 *
	 * 荷主画面マスタのデータを一括登録する。
	 * </pre>
	 * @param mClientScreen 荷主画面マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsertByClient(List<MClientScreen> mClientScreen, ErrorStatus errSts) {
		// ===== 荷主画面マスタ登録実行 =====
		mClientScreenBhv.batchInsert(mClientScreen);
	}

	/**
	 * <h2>センタ画面マスタを登録する。</h2>
	 * <pre>
	 *
	 * センタ画面マスタのデータを登録する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByCenter(MCenterScreen mCenterScreen, ErrorStatus errSts) {
		// ===== センタ画面マスタ登録実行 =====
		mCenterScreenBhv.insert(mCenterScreen);
	}

	/**
	 * <h2>センタ画面マスタを一括登録する。</h2>
	 * <pre>
	 *
	 * センタ画面マスタのデータを一括登録する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsertByCenter(List<MCenterScreen> mCenterScreen, ErrorStatus errSts) {
		// ===== センタ画面マスタ登録実行 =====
		mCenterScreenBhv.batchInsert(mCenterScreen);
	}
}