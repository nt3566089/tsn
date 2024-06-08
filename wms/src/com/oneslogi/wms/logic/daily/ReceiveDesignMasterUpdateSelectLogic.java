package com.oneslogi.wms.logic.daily;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MMfrcvdesignCB;
import com.oneslogi.base.dbflute.exbhv.MMfrcvdesignBhv;
import com.oneslogi.base.dbflute.exentity.MMfrcvdesign;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 受入デザイン更新の検索ロジッククラス
 */
public class ReceiveDesignMasterUpdateSelectLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	/**
	 * 有効区分：過去世代
	 */
	protected static final BigDecimal VALIDTYPE_PAST = BigDecimal.valueOf(0);

	/**
	 * 有効区分：適用世代
	 */
	protected static final BigDecimal VALIDTYPE_APPLICABLE = BigDecimal.valueOf(1);

	/**
	 * 有効区分：未来世代
	 */
	protected static final BigDecimal VALIDTYPE_FUTURE = BigDecimal.valueOf(2);

	// ===== 使用テーブル =====
	@Inject
	private MMfrcvdesignBhv mMfrcvdesignBhv;

	/**
	 * <h2>受入デザインマスタの有効区分(未来世代)を確認する。</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'2'(未来世代)の
	 * 受入デザインマスタのデータ有無を確認する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return boolean true:データ有り false:データ無し
	 */
	public boolean existMMfrcvdesignValidTypeFutur(final String systemDt) {
		
		MMfrcvdesignCB mMfrcvdesignCB = mMfrcvdesignBhv.newConditionBean();

		// 検索条件
		mMfrcvdesignCB.query().setRcvfrdate_LessEqual(systemDt);
		mMfrcvdesignCB.query().setRcvtodate_GreaterEqual(systemDt);
		//mMfrcvdesignCB.query().setValidtype_Equal(VALIDTYPE_FUTURE);
		mMfrcvdesignCB.query().setDelFlg_Equal_$0();
		
		// 検索
		List<MMfrcvdesign> resultList = mMfrcvdesignBhv.selectList(mMfrcvdesignCB);

		if(resultList.size() > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * <h2>受入デザインマスタの有効区分(適用世代)を確認する。</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'1'(適用世代)の
	 * 受入デザインマスタのデータ有無を確認する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return boolean true:データ有り false:データ無し
	 */
	public boolean existMMfrcvdesignValidTypeApplicable(final String systemDt) {
		
		// ===== 有効区分(適用世代)を検索 =====
		MMfrcvdesignCB mMfrcvdesignCB = mMfrcvdesignBhv.newConditionBean();

		// 検索条件
		mMfrcvdesignCB.query().setRcvtodate_LessThan(systemDt);
		//mMfrcvdesignCB.query().setValidtype_Equal(VALIDTYPE_APPLICABLE);
		mMfrcvdesignCB.query().setDelFlg_Equal_$0();
		
		// 検索
		List<MMfrcvdesign> resultList = mMfrcvdesignBhv.selectList(mMfrcvdesignCB);

		if(resultList.size() > 0) {
			return true;
		}
		
		return false;
	}

	/**
	 * <h2>受入デザインマスタ コントロールNo.更新</h2>
	 * <pre>
	 * 受入デザインマスタのコントロールNo.を更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @param controlNo コントロールNo.
	 */
	public void updateMMfrcvdesignControlNo(final String systemDt, final Long controlNo) {

		MMfrcvdesignCB mMfrcvdesignCB = mMfrcvdesignBhv.newConditionBean();
		
		// 検索条件
		mMfrcvdesignCB.orScopeQuery(orCB -> {
			orCB.orScopeQueryAndPart(andCB ->{
				andCB.query().setRcvfrdate_LessEqual(systemDt);
				andCB.query().setRcvtodate_GreaterEqual(systemDt);
				//andCB.query().setValidtype_Equal(VALIDTYPE_FUTURE);
			});
			orCB.orScopeQueryAndPart(andCB ->{
				andCB.query().setRcvtodate_LessThan(systemDt);
				//andCB.query().setValidtype_Equal(VALIDTYPE_APPLICABLE);
			});
		});
		mMfrcvdesignCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfrcvdesign mMfrcvdesign = mMfrcvdesignBhv.newMyEntity();
		mMfrcvdesign.setControlNo(controlNo);
		
		// 更新
		mMfrcvdesignBhv.queryUpdate(mMfrcvdesign, mMfrcvdesignCB);
	}

	/**
	 * <h2>受入デザインマスタ 有効区分を適用世代に更新</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'2'(未来世代)の
	 * 受入デザインマスタのデータを'1'(適用世代)に更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return int 更新レコード件数
	 */
	public int updateMMfrcvdesignValidTypeFuturToApplicable(final String systemDt) {
		
		MMfrcvdesignCB mMfrcvdesignCB = mMfrcvdesignBhv.newConditionBean();

		// 検索条件
		mMfrcvdesignCB.query().setRcvfrdate_LessEqual(systemDt);
		mMfrcvdesignCB.query().setRcvtodate_GreaterEqual(systemDt);
		//mMfrcvdesignCB.query().setValidtype_Equal(VALIDTYPE_FUTURE);
		mMfrcvdesignCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfrcvdesign mMfrcvdesign = mMfrcvdesignBhv.newMyEntity();
		//mMfrcvdesign.setValidtype(VALIDTYPE_APPLICABLE);
		
		// 更新
		int result = mMfrcvdesignBhv.queryUpdate(mMfrcvdesign, mMfrcvdesignCB);
		
		return result;
	}
	
	/**
	 * <h2>受入デザインマスタ 有効区分を過去世代に更新</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて有効区分が'1'(適用世代)の
	 * 受入デザインマスタのデータを'0'(過去世代)に更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return int 更新レコード件数
	 */
	public int updateMMfrcvdesignValidTypeApplicableToPast(final String systemDt) {
		
		MMfrcvdesignCB mMfrcvdesignCB = mMfrcvdesignBhv.newConditionBean();

		// 検索条件
		mMfrcvdesignCB.query().setRcvtodate_LessThan(systemDt);
		//mMfrcvdesignCB.query().setValidtype_Equal(VALIDTYPE_APPLICABLE);
		mMfrcvdesignCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfrcvdesign mMfrcvdesign = mMfrcvdesignBhv.newMyEntity();
		//mMfrcvdesign.setValidtype(VALIDTYPE_PAST);
		
		// 更新
		int result = mMfrcvdesignBhv.queryUpdate(mMfrcvdesign, mMfrcvdesignCB);
		
		return result;
	}

	/**
	 * <h2>受入デザインマスタ コントロールNo.更新(クリア)</h2>
	 * <pre>
	 * 受入デザインマスタのコントロールNo.を更新(クリア)する。
	 * </pre>
	 * @param controlNo コントロールNo.
	 */
	public void updateMMfrcvdesignControlNo(final Long controlNo) {

		MMfrcvdesignCB mMfrcvdesignCB = mMfrcvdesignBhv.newConditionBean();
		
		// 検索条件
		mMfrcvdesignCB.query().setControlNo_Equal(controlNo);
		mMfrcvdesignCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MMfrcvdesign mMfrcvdesign = mMfrcvdesignBhv.newMyEntity();
		mMfrcvdesign.setControlNo(null);
		
		// 更新
		mMfrcvdesignBhv.queryUpdate(mMfrcvdesign, mMfrcvdesignCB);
	}
}