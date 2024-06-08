package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタマスタメンテナンス更新ロジッククラス
 */
public class CenterMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterBhv MCenterBhv;

	/**
	 * <h2>センタマスタを更新する。</h2>
	 * <pre>
	 *
	 * センタマスタのデータを更新する。
	 * </pre>
	 * @param mCenter センタマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCenter mCenter, ErrorStatus errSts) {
		// ===== センタマスタ更新実行 =====
		MCenterBhv.update(mCenter);
	}

}
