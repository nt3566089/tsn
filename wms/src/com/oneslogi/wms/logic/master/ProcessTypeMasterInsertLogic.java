package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 処理区分マスタメンテナンス登録ロジッククラス
 */
public class ProcessTypeMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * <h2>処理区分マスタデータを登録する。</h2>
	 * <pre>
	 *
	 * 引数の処理区分マスタを登録する。
	 * </pre>
	 * @param mProcessType 処理区分マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MProcessType mProcessType, ErrorStatus errSts) {
		// ===== 処理区分マスタ登録実行 =====
		mProcessTypeBhv.insert(mProcessType);
	}

	/**
	 * <h2>処理区分マスタデータを一括登録する。</h2>
	 * <pre>
	 *
	 * 引数の処理区分マスタを一括登録する。
	 *
	 * </pre>
	 * @param mProcessType 処理区分マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MProcessType> mProcessType, ErrorStatus errSts) {
		// ===== 処理区分マスタ登録実行 =====
		mProcessTypeBhv.batchInsert(mProcessType);
	}

}