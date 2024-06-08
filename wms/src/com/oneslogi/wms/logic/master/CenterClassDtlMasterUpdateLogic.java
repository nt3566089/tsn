 package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値マスタメンテナンス更新ロジッククラス
 */
public class CenterClassDtlMasterUpdateLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;

	/**
	 * <h2>センタ区分値明細マスタを更新する。</h2>
	 * <pre>
	 * センタ区分値マスタのデータを更新する。
	 * センタ区分値明細マスタのデータを削除・登録・更新する。
	 * 削除で異常発生する場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：全項目
	 * @param mCenterClassDtlList センタ区分値明細マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCenterClass mCenterClass,List<MCenterClassDtl> mCenterClassDtlList,ErrorStatus errSts) {

		//センタ区分値マスタの更新実行
		mCenterClassBhv.update(mCenterClass);

		//センタ区分値明細マスタリストのデータ件数分繰返
		for(MCenterClassDtl mCenterClassDtlEnt :mCenterClassDtlList ){
			if(mCenterClassDtlEnt.isDelFlg$1()){
				// ===== センタ区分値マスタ削除実行 =====
				try{
					//削除実行
					mCenterClassDtlBhv.delete(mCenterClassDtlEnt);
				}catch(SQLFailureException e){
					if (e.getSQLException() != null) {
						// データベースから削除したときのエラーがFK違反の場合
						getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
					} else {
						throw e;
					}
				}

			}else{
				if(mCenterClassDtlEnt.getCenterClassDtlId() == null){
					mCenterClassDtlEnt.setCenterClassId(mCenterClass.getCenterClassId());
					//登録実行
					mCenterClassDtlBhv.insert(mCenterClassDtlEnt);
				}else{
					//更新実行
					mCenterClassDtlBhv.update(mCenterClassDtlEnt);
				}
			}
		}
	}
}
