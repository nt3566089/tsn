package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷材マスタメンテナンス更新ロジッククラス
 */
public class BoxMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MBoxBhv mBoxBhv;

	/**
	 * <h2>荷材マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 荷材マスタのデータを更新する。
	 * </pre>
	 * @param mBox 荷材マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MBox mBox ,ErrorStatus errSts) {

		// ===== 荷材マスタ更新実行 =====
		mBoxBhv.update(mBox);
	}

	/**
	 * <h2>荷材マスタリストデータを一括更新する。</h2>
	 * <pre>
	 *
	 * 荷材マスタリストデータを一括更新する。
	  </pre>
	 * @param mBoxList 荷材マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MBox> mBoxList, ErrorStatus errSts) {

		// ===== 荷材マスタ更新実行 =====
		mBoxBhv.batchUpdate(mBoxList);
	}

}
