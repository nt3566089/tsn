package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MEdiColumnCB;
import com.oneslogi.base.dbflute.exbhv.MEdiBhv;
import com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dbflute.exentity.MEdiColumn;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * EDIマスタメンテナンス削除ロジッククラス
 */
public class EdiMasterDeleteLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MEdiBhv mEdiBhv;
	@Inject
	private MEdiColumnBhv mEdiColumnBhv;

	/**
	 * <h2>EDIマスタを削除する。</h2>
	 * <pre>
	 * EDIマスタ、EDI項目マスタを削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mEdi EDIマスタ：EDIID項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MEdi mEdi, ErrorStatus errSts) {

		// ===== EDIマスタ削除実行 =====
		try{
			MEdiColumnCB cb = mEdiColumnBhv.newConditionBean();
			cb.query().setEdiId_Equal(mEdi.getEdiId());
			List<MEdiColumn> mEdiColumnList = mEdiColumnBhv.selectList(cb);
			if (mEdiColumnList.size() > 0) {
				mEdiColumnBhv.batchDelete(mEdiColumnList);
			}

			mEdiBhv.delete(mEdi);
		}catch(SQLFailureException e){
			// [ON推-品向-598] 致命的エラー回避 2015.04.14 kawana Start
			if (e.getSQLException() != null) {
				// エラー管理クラスにエラーを登録
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
			// [ON推-品向-598] 致命的エラー回避 2015.04.14 kawana End
		}

	}

}
