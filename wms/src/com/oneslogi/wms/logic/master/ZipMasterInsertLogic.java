package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MZipCB;
import com.oneslogi.base.dbflute.exbhv.MZipBhv;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 郵便番号マスタ登録ロジッククラス
 */
public class ZipMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZipBhv mZipBhv;
	/**
	 * <h2>郵便番号マスタ登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを郵便番号マスタに登録する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MZip mZip, ErrorStatus errSts) {

		// ===== 郵便番号マスタ登録実行 =====
		mZipBhv.insert(mZip);
	}

	/**
	 * <h2>郵便番号マスタリストの一括登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったリストのデータを郵便番号マスタに一括登録する。
	 * </pre>
	 * @param mZipList 郵便番号マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MZip> mZipList, ErrorStatus errSts) {

		// ===== 郵便番号マスタ登録実行 =====
		mZipBhv.batchInsert(mZipList);
	}

	// [#434] 同一郵便番号が存在した場合はスキップして正常終了 2016.12.14 kawana Start
	//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
	/**
	 * <h2>郵便番号マスタ登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを郵便番号マスタに登録する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertMZip(MZip mZip, ErrorStatus errSts) {

		//検索条件の設定
		MZipCB cb = mZipBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZipCd_Equal(mZip.getZipCd());

		List<MZip> zipList = mZipBhv.selectList(cb);
		if (0 < zipList.size()) {
			// 既に登録済

			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}

		mZipBhv.insert(mZip);
	}

	//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End

	/**
	 * <h2>郵便番号マスタ登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを郵便番号マスタに登録する。
	 * </pre>
	 * @param mZip 郵便番号マスタ：全項目
	 */
	public void insertMZip(MZip mZip) {

		insertMZip(mZip, null);
	}
	// [#434] 同一郵便番号が存在した場合はスキップして正常終了 2016.12.14 kawana End
}
