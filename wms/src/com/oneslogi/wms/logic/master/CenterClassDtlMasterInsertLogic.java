package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値マスタメンテナンス登録ロジッククラス
 */
public class CenterClassDtlMasterInsertLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;

	/**
	 * <h2>センタ区分値マスタを登録する。</h2>
	 * <pre>
	 *
	 * センタ区分値マスタとセンタ区分値明細マスタのデータを登録する。
	 * 存在した場合、既に存在エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：全項目
	 * @param mCenterClassDtlList センタ区分値明細マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterClass mCenterClass, List<MCenterClassDtl> mCenterClassDtlList, ErrorStatus errSts) {

		//検索条件の設定
		MCenterClass result = null;
		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();

		//センタIDの設定
		cb.query().setCenterId_Equal(mCenterClass.getCenterId());
		//区分値CDの設定
		cb.query().setClassCd_Equal(mCenterClass.getClassCd());

		result = mCenterClassBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== センタ区分値マスタ登録実行 =====
			mCenterClassBhv.insert(mCenterClass);

		} else {
			//存在した場合
			this.getErrorManager().add(errSts, BaseMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		for (int i = 0; i < mCenterClassDtlList.size(); i++) {
			mCenterClassDtlList.get(i).setCenterClassId(mCenterClass.getCenterClassId());
		}
		// ===== センタ区分値明細マスタ登録実行 =====
		mCenterClassDtlBhv.batchInsert(mCenterClassDtlList);
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
		//
		//		for(MCenterClassDtl mCenterClassDtlEnt : mCenterClassDtlList){
		//
		//			mCenterClassDtlEnt.setCenterClassId(mCenterClass.getCenterClassId());
		//			// ===== センタ区分値明細マスタ登録実行 =====
		//			mCenterClassDtlBhv.insert(mCenterClassDtlEnt);
		//
		//		}
	}

	// [#2166] 2017.8.4 ase Start
	/**
	 * <h2>センタ区分値マスタを登録する。</h2>
	 * <pre>
	 *
	 * センタ区分値明細マスタのデータを登録する。
	 * </pre>
	 * @param mCenterClassDtl センタ区分値明細マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenterClassDtl mCenterClassDtl, ErrorStatus errSts) {

		// ===== センタ区分値明細マスタ登録実行 =====
		mCenterClassDtlBhv.insert(mCenterClassDtl);
	}
	// [#2166] 2017.8.4 ase End
}
