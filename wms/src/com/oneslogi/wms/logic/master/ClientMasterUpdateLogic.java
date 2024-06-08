 package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主マスタメンテナンス更新ロジッククラス
 */
public class ClientMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientBhv mClientBhv;

	/**
	 * <h2>荷主マスタを更新する。</h2>
	 * <pre>
	 *
	 * 荷主マスのデータを更新する。
	 *</pre>
	 * @param mClient 荷主マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MClient mClient,ErrorStatus errSts) {
		// ===== 荷主マスタ更新実行 =====
		mClientBhv.update(mClient);
	}

	/**
	 * <h2>荷主マスタを一括更新する。</h2>
	 * <pre>
	 * 荷主マスタのデータを一括更新する。
	 * </pre>
	 * @param mClientList 荷主マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MClient> mClientList,ErrorStatus errSts) {
		// ===== 荷主マスタ更新実行 =====
		mClientBhv.batchUpdate(mClientList);
	}
}

