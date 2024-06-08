package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exbhv.MClientColBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MClientCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面グリッドマスタメンテナンス登録ロジッククラス
 */
public class CenterClientScreenColMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientColBhv mClientColBhv;
	@Inject
	private MCenterColBhv mCenterColBhv;

	/**
	 * <h2>荷主列マスタを登録する。</h2>
	 * <pre>
	 *
	 * 荷主列マスタのデータを登録する。
	 * </pre>
	 * @param mClientCol 荷主列マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByClient(MClientCol mClientCol, ErrorStatus errSts) {
		// ===== 荷主列マスタ登録実行 =====
		mClientColBhv.insert(mClientCol);
	}

	/**
	 * <h2>荷主列マスタを一括登録する。</h2>
	 * <pre>
	 *
	 * 荷主列マスタのデータを一括登録する。
	 * </pre>
	 * @param mClientColList 荷主列マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsertByClient(List<MClientCol> mClientColList, ErrorStatus errSts) {
		// ===== 荷主列マスタ登録実行 =====
		mClientColBhv.batchInsert(mClientColList);
	}

	/**
	 * <h2>センタ列マスタを登録する。</h2>
	 * <pre>
	 *
	 * センタ列マスタのデータを登録する。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByCenter(MCenterCol mCenterCol, ErrorStatus errSts) {
		// ===== センタ列マスタ登録実行 =====
		mCenterColBhv.insert(mCenterCol);
	}

	/**
	 * <h2>センタ列マスタを一括登録する。</h2>
	 * <pre>
	 * センタ列マスタのデータを一括登録する。
	 * </pre>
	 * @param mCenterColList センタ列マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsertByCenter(List<MCenterCol> mCenterColList, ErrorStatus errSts) {
		// ===== センタ列マスタ登録実行 =====
		mCenterColBhv.batchInsert(mCenterColList);
	}
}