package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷材マスタメンテナンス登録ロジッククラス
 */
public class BoxMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MBoxBhv mBoxBhv;

	/**
	 * <h2>荷材マスタデータを登録する。</h2>
	 * <pre>
	 * 荷材マスタのデータを登録する。
	 * </pre>
	 * @param mBox 荷材マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MBox mBox, ErrorStatus errSts) {

		// ===== 荷材マスタ登録実行 =====
		mBoxBhv.insert(mBox);
	}

	/**
	 * <h2>荷材マスタリストデータを一括登録する。</h2>
	 * <pre>
	 * 荷材マスタリストデータを一括登録する。
	 * </pre>
	 * @param mBoxList 荷材マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MBox> mBoxList, ErrorStatus errSts) {

		// ===== 荷材マスタ登録実行 =====
		mBoxBhv.batchInsert(mBoxList);
	}

}