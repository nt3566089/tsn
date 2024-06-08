package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MEdiColumnCB;
import com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dbflute.exentity.MEdiColumn;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * EDI項目マスタメンテナンス取得ロジッククラス
 */
public class EdiColumnMasterSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MEdiColumnBhv mEdiColumnBhv;

	/**
	 * <h2>EDI項目マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにEDI項目マスタデータを取得する。
	 * </pre>
	 * @param mEdi EDIマスタ：EDIID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return List<MEdiColumn> EDI項目マスタリスト
	 */

	public List<MEdiColumn> selectById(MEdi mEdi, ErrorStatus errStatus) {

		List<MEdiColumn> mEdiColumnList = null;
		// ===== 編集データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MEdiColumnCB cb = mEdiColumnBhv.newMyConditionBean();
		cb.setupSelect_MEdi();
		cb.query().setEdiId_Equal(mEdi.getEdiId());
		cb.query().addOrderBy_EdiColumnId_Asc();

		// ==== センタマスタ検索実行 =====
		mEdiColumnList = mEdiColumnBhv.selectList(cb);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return mEdiColumnList;
	}

}