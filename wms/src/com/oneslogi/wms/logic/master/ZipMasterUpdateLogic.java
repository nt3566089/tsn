package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 郵便番号マスタデータの更新ロジッククラス
 */
public class ZipMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZipBhv mZipBhv;

	/**
	 * <h2>郵便番号マスタデータの更新処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータで郵便番号マスタに更新する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MZip mZip ,ErrorStatus errSts) {

		// ===== 郵便番号マスタ更新実行 =====
		mZipBhv.update(mZip);
	}

	/**
	 * <h2>バッチで郵便番号マスタデータの一括更新を行う。</h2>
	 * <pre>
	 * 引数で受け取ったリストデータで郵便番号マスタに一括更新する。
	 * </pre>
	 * @param mZipList 郵便番号マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MZip> mZipList, ErrorStatus errSts) {

		// ===== 郵便番号マスタ更新実行 =====
		mZipBhv.batchUpdate(mZipList);
	}
}
