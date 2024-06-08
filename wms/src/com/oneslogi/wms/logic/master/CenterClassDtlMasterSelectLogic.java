package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * センタ区分値マスタメンテナンス取得ロジッククラス
 */
public class CenterClassDtlMasterSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;

	/**
	 * <h2>センタ区分値マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ区分値マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param  mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param  errSts エラー時に設定するエラーステータス
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass selectCenterClassMaster(MCenterClass mCenterClass,  ErrorStatus errSts) {

		MCenterClass result = null;

		// ===== 一覧データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.query().setCenterClassId_Equal(mCenterClass.getCenterClassId());

		// ===== センタ区分値マスタ検索実行 =====
		result = mCenterClassBhv.selectEntity(cb);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result == null) {
			this.getErrorManager().add(errSts, BaseMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	/**
	 * <h2>センタ区分値明細マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにセンタ区分値明細マスタデータを取得する。
	 * </pre>
	 * @param mCenterClass センタ区分値マスタ：センタ区分値ID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return List<MCenterClassDtl> センタ区分値明細マスタリスト
	 */

	public List<MCenterClassDtl> selectById(MCenterClass mCenterClass, ErrorStatus errStatus) {

		List<MCenterClassDtl> mCenterClassDtlList = null;
		// ===== 編集データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCenterClassDtlCB cb = mCenterClassDtlBhv.newMyConditionBean();
		cb.setupSelect_VDict(getCultureId());
		cb.query().setCenterClassId_Equal(mCenterClass.getCenterClassId());
		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		// ==== センタ区分値マスタ検索実行 =====
		mCenterClassDtlList = mCenterClassDtlBhv.selectList(cb);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return mCenterClassDtlList;
	}

}