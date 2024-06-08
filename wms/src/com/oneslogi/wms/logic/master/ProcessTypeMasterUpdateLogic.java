package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 処理区分マスタメンテナンス更新ロジッククラス
 */
public class ProcessTypeMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * <h2>処理区分マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 引数の処理区分マスタを更新する。
	 * </pre>
	 * @param mProcessType 処理区分マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MProcessType mProcessType, ErrorStatus errSts) {
		// ===== 処理区分マスタ更新実行 =====
		mProcessTypeBhv.update(mProcessType);
	}

	/**
	 * <h2>処理区分マスタデータを一括更新する。</h2>
	 * <pre>
	 *
	 * 引数の処理区分マスタを一括更新する。
	 * </pre>
	 * @param mProcessType 処理区分マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MProcessType> mProcessType, ErrorStatus errSts) {
		// ===== 処理区分マスタ更新実行 =====
		mProcessTypeBhv.batchUpdate(mProcessType);
	}

}
