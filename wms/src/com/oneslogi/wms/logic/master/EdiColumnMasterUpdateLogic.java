 package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MEdiBhv;
import com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dbflute.exentity.MEdiColumn;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * EDI項目マスタメンテナンス更新ロジッククラス
 */
public class EdiColumnMasterUpdateLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MEdiBhv mEdiBhv;
	@Inject
	private MEdiColumnBhv mEdiColumnBhv;

	/**
	 * <h2>EDI項目マスタを更新する。</h2>
	 * <pre>
	 * EDIマスタのデータを更新する。
	 * EDI項目マスタのデータを削除、登録、更新する。
	 * EDI項目マスタの削除で異常発生する場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mEdi EDIマスタ：全項目
	 * @param mEdiColumnList EDI項目マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MEdi mEdi,List<MEdiColumn> mEdiColumnList,ErrorStatus errSts) {

		//EDIマスタの更新実行
		mEdiBhv.update(mEdi);

		//EDI列マスタリストのデータ件数分繰返
		for(MEdiColumn mEdiColumnEnt :mEdiColumnList ){
			if(mEdiColumnEnt.isDelFlg$1()){
				// ===== EDI列マスタ削除実行 =====
				try{
					//削除実行
					mEdiColumnBhv.delete(mEdiColumnEnt);
				}catch(SQLFailureException e){
					// [ON推-品向-598] 致命的エラー回避 2015.04.14 kawana Start
					if (e.getSQLException() != null) {
						// データベースから削除したときのエラーがFK違反の場合
						getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
					} else {
						throw e;
					}
					// [ON推-品向-598] 致命的エラー回避 2015.04.14 kawana End
				}

			}else{
				if(mEdiColumnEnt.getEdiColumnId() == null){
					mEdiColumnEnt.setEdiId(mEdi.getEdiId());
					//登録実行
					mEdiColumnBhv.insert(mEdiColumnEnt);
				}else{
					//更新実行
					mEdiColumnBhv.update(mEdiColumnEnt);
				}
			}
		}
	}
}
