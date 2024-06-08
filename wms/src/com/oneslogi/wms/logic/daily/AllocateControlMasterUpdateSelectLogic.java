package com.oneslogi.wms.logic.daily;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MMfpickctlCB;
import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exentity.MMfpickctl;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 引当制御マスタ更新の検索ロジッククラス
 */
public class AllocateControlMasterUpdateSelectLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	/**
	 * 有効区分：過去世代
	 */
	protected static final String VALIDTYPE_PAST = "0";

	/**
	 * 有効区分：適用世代
	 */
	protected static final String VALIDTYPE_APPLICABLE = "1";

	/**
	 * 有効区分：未来世代
	 */
	protected static final String VALIDTYPE_FUTURE = "2";

	// ===== 使用テーブル =====
	@Inject
	private MMfpickctlBhv mMfpickctlBhv;

	/**
	 * <h2>引当制御マスタの有効区分(未来世代)を確認する。</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'2'(未来世代)の
	 * 引当制御マスタのデータ有無を確認する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return boolean true:データ有り false:データ無し
	 */
	public boolean existMMfpickctlValidTypeFutur(final String systemDt) {
		
		MMfpickctlCB mMfpickctlCB = mMfpickctlBhv.newConditionBean();

		// 検索条件
		mMfpickctlCB.query().setPickfrdate_LessEqual(systemDt);
		mMfpickctlCB.query().setPicktodate_GreaterEqual(systemDt);
		mMfpickctlCB.query().setValidtype_Equal(VALIDTYPE_FUTURE);
		mMfpickctlCB.query().setDelFlg_Equal_$0();
		
		// 検索
		List<MMfpickctl> resultList = mMfpickctlBhv.selectList(mMfpickctlCB);

		if(resultList.size() > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * <h2>引当制御マスタの有効区分(適用世代)を確認する。</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'1'(適用世代)の
	 * 引当制御マスタのデータ有無を確認する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return boolean true:データ有り false:データ無し
	 */
	public boolean existMMfpickctlValidTypeApplicable(final String systemDt) {
		
		// ===== 有効区分(適用世代)を検索 =====
		MMfpickctlCB mMfpickctlCB = mMfpickctlBhv.newConditionBean();

		// 検索条件
		mMfpickctlCB.query().setPicktodate_LessThan(systemDt);
		mMfpickctlCB.query().setValidtype_Equal(VALIDTYPE_APPLICABLE);
		mMfpickctlCB.query().setDelFlg_Equal_$0();
		
		// 検索
		List<MMfpickctl> resultList = mMfpickctlBhv.selectList(mMfpickctlCB);

		if(resultList.size() > 0) {
			return true;
		}
		
		return false;
	}

	/**
	 * <h2>引当制御マスタ コントロールNo.更新</h2>
	 * <pre>
	 * 引当制御マスタのコントロールNo.を更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @param controlNo コントロールNo.
	 */
	public void updateMMfpickctlControlNo(final String systemDt, final Long controlNo) {

		MMfpickctlCB mMfpickctlCB = mMfpickctlBhv.newConditionBean();
		
		// 検索条件
		mMfpickctlCB.orScopeQuery(orCB -> {
			orCB.orScopeQueryAndPart(andCB ->{
				andCB.query().setPickfrdate_LessEqual(systemDt);
				andCB.query().setPicktodate_GreaterEqual(systemDt);
				andCB.query().setValidtype_Equal(VALIDTYPE_FUTURE);
			});
			orCB.orScopeQueryAndPart(andCB ->{
				andCB.query().setPicktodate_LessThan(systemDt);
				andCB.query().setValidtype_Equal(VALIDTYPE_APPLICABLE);
			});
		});
		mMfpickctlCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfpickctl mMfpickctl = mMfpickctlBhv.newMyEntity();
		mMfpickctl.setControlNo(controlNo);
		
		// 更新
		mMfpickctlBhv.queryUpdate(mMfpickctl, mMfpickctlCB);
	}

	/**
	 * <h2>引当制御マスタ 有効区分を適用世代に更新</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'2'(未来世代)の
	 * 引当制御マスタのデータを'1'(適用世代)に更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return int 更新レコード件数
	 */
	public int updateMMfpickctlValidTypeFuturToApplicable(final String systemDt) {
		
		MMfpickctlCB mMfpickctlCB = mMfpickctlBhv.newConditionBean();

		// 検索条件
		mMfpickctlCB.query().setPickfrdate_LessEqual(systemDt);
		mMfpickctlCB.query().setPicktodate_GreaterEqual(systemDt);
		mMfpickctlCB.query().setValidtype_Equal(VALIDTYPE_FUTURE);
		mMfpickctlCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfpickctl mMfpickctl = mMfpickctlBhv.newMyEntity();
		mMfpickctl.setValidtype(VALIDTYPE_APPLICABLE);
		
		// 更新
		int result = mMfpickctlBhv.queryUpdate(mMfpickctl, mMfpickctlCB);
		
		return result;
	}
	
	/**
	 * <h2>引当制御マスタ 有効区分を過去世代に更新</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'1'(適用世代)の
	 * 引当制御マスタのデータを'0'(過去世代)に更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return int 更新レコード件数
	 */
	public int updateMMfpickctlValidTypeApplicableToPast(final String systemDt) {
		
		MMfpickctlCB mMfpickctlCB = mMfpickctlBhv.newConditionBean();

		// 検索条件
		mMfpickctlCB.query().setPicktodate_LessThan(systemDt);
		mMfpickctlCB.query().setValidtype_Equal(VALIDTYPE_APPLICABLE);
		mMfpickctlCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfpickctl mMfpickctl = mMfpickctlBhv.newMyEntity();
		mMfpickctl.setValidtype(VALIDTYPE_PAST);
		
		// 更新
		int result = mMfpickctlBhv.queryUpdate(mMfpickctl, mMfpickctlCB);
		
		return result;
	}

	/**
	 * <h2>引当制御マスタ コントロールNo.更新(クリア)</h2>
	 * <pre>
	 * 引当制御マスタのコントロールNo.を更新(クリア)する。
	 * </pre>
	 * @param controlNo コントロールNo.
	 */
	public void updateMMfpickctlControlNo(final Long controlNo) {

		MMfpickctlCB mMfpickctlCB = mMfpickctlBhv.newConditionBean();
		
		// 検索条件
		mMfpickctlCB.query().setControlNo_Equal(controlNo);
		mMfpickctlCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfpickctl mMfpickctl = mMfpickctlBhv.newMyEntity();
		mMfpickctl.setControlNo(null);
		
		// 更新
		mMfpickctlBhv.queryUpdate(mMfpickctl, mMfpickctlCB);
	}
}