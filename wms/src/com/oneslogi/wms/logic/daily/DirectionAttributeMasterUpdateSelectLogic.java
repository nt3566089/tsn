package com.oneslogi.wms.logic.daily;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCdrcattCB;
import com.oneslogi.base.dbflute.exbhv.MCdrcattBhv;
import com.oneslogi.base.dbflute.exentity.MCdrcatt;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 方面属性マスタ更新の検索ロジッククラス
 */
public class DirectionAttributeMasterUpdateSelectLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	/**
	 * 世代区分：過去世代
	 */
	protected static final String GRTNID_PAST = "0";

	/**
	 * 世代区分：適用世代
	 */
	protected static final String GRTNID_APPLICABLE = "1";

	/**
	 * 世代区分：未来世代
	 */
	protected static final String GRTNID_FUTURE = "2";

	// ===== 使用テーブル =====
	@Inject
	private MCdrcattBhv mCdrcattBhv;

	/**
	 * <h2>方面属性マスタの世代区分(未来世代)を確認する。</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて世代区分が'2'(未来世代)の
	 * 方面属性マスタのデータ有無を確認する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return boolean true:データ有り false:データ無し
	 */
	public boolean existMCdrcattGrtnIdFutur(final String systemDt) {
		
		MCdrcattCB mCdrcattCB = mCdrcattBhv.newConditionBean();

		// 検索条件
		mCdrcattCB.query().setZzfrdateh_LessEqual(systemDt);
		mCdrcattCB.query().setZztodateh_GreaterEqual(systemDt);
		mCdrcattCB.query().setGrtnid_Equal(GRTNID_FUTURE);
		mCdrcattCB.query().setDelFlg_Equal_$0();
		
		// 検索
		List<MCdrcatt> resultList = mCdrcattBhv.selectList(mCdrcattCB);

		if(resultList.size() > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * <h2>方面属性マスタの削除対象を確認する。</h2>
	 * <pre>
	 * 削除対象となる指定されたシステム管理日付より大きい適用終了年月日の
	 * 方面属性マスタのデータ有無を確認する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return boolean true:データ有り false:データ無し
	 */
	public boolean existMCdrcattDelete(final String systemDt) {
		
		// ===== 削除対象レコードを検索 =====
		MCdrcattCB mCdrcattCB = mCdrcattBhv.newConditionBean();

		// 検索条件
		mCdrcattCB.query().setZztodateh_LessThan(systemDt);
		mCdrcattCB.query().setDelFlg_Equal_$0();
		
		// 検索
		List<MCdrcatt> resultList = mCdrcattBhv.selectList(mCdrcattCB);

		if(resultList.size() > 0) {
			return true;
		}
		
		return false;
	}

	/**
	 * <h2>方面属性マスタ コントロールNo.更新</h2>
	 * <pre>
	 * 方面属性マスタのコントロールNo.を更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @param controlNo コントロールNo.
	 */
	public void updateMCdrcattControlNo(final String systemDt, final Long controlNo) {

		MCdrcattCB mCdrcattCB = mCdrcattBhv.newConditionBean();
		
		// 検索条件
		mCdrcattCB.orScopeQuery(orCB -> {
			orCB.orScopeQueryAndPart(andCB ->{
				andCB.query().setZzfrdateh_LessEqual(systemDt);
				andCB.query().setZztodateh_GreaterEqual(systemDt);
				andCB.query().setGrtnid_Equal(GRTNID_FUTURE);
			});
			orCB.orScopeQueryAndPart(andCB ->{
				andCB.query().setZztodateh_LessThan(systemDt);
			});
		});
		mCdrcattCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MCdrcatt mCdrcatt = mCdrcattBhv.newMyEntity();
		mCdrcatt.setControlNo(controlNo);
		
		// 更新
		mCdrcattBhv.queryUpdate(mCdrcatt, mCdrcattCB);
	}

	/**
	 * <h2>方面属性マスタ 世代区分を適用世代に更新</h2>
	 * <pre>
	 * 指定されたシステム管理日付にて世代区分が'2'(未来世代)の
	 * 方面属性マスタのデータを'1'(適用世代)に更新する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return int 更新レコード件数
	 */
	public int updateMCdrcattGrtnIdFuturToApplicable(final String systemDt) {
		
		MCdrcattCB mCdrcattCB = mCdrcattBhv.newConditionBean();

		// 検索条件
		mCdrcattCB.query().setZzfrdateh_LessEqual(systemDt);
		mCdrcattCB.query().setZztodateh_GreaterEqual(systemDt);
		mCdrcattCB.query().setGrtnid_Equal(GRTNID_FUTURE);
		mCdrcattCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MCdrcatt mCdrcatt = mCdrcattBhv.newMyEntity();
		mCdrcatt.setGrtnid(GRTNID_APPLICABLE);
		
		// 更新
		int result = mCdrcattBhv.queryUpdate(mCdrcatt, mCdrcattCB);
		
		return result;
	}
	
	/**
	 * <h2>方面属性マスタ削除</h2>
	 * <pre>
	 * 指定されたシステム管理日付より大きい適用終了年月日の
	 * 方面属性マスタのデータを削除する。
	 * </pre>
	 * @param systemDt システム管理日付
	 * @return int 更新レコード件数
	 */
	public int deleteMCdrcatt(final String systemDt) {
		
		MCdrcattCB mCdrcattCB = mCdrcattBhv.newConditionBean();

		// 検索条件
		mCdrcattCB.query().setZztodateh_LessThan(systemDt);
		mCdrcattCB.query().setDelFlg_Equal_$0();
		
		// 対象(更新)項目
		MCdrcatt mCdrcatt = mCdrcattBhv.newMyEntity();
		mCdrcatt.setDelFlg_$1();
		
		// 更新
		int result = mCdrcattBhv.queryUpdate(mCdrcatt, mCdrcattCB);
		
		return result;
	}

	/**
	 * <h2>方面属性マスタ コントロールNo.更新(クリア)</h2>
	 * <pre>
	 * 方面属性マスタのコントロールNo.を更新(クリア)する。
	 * </pre>
	 * @param controlNo コントロールNo.
	 */
	public void updateMCdrcattControlNo(final Long controlNo) {

		//[TSN] 削除フラグの検索条件自動付与の無効化処理追加 2024.3.27 K.Nakaide Start
		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		//[TSN] 削除フラグの検索条件自動付与の無効化処理追加 2024.3.27 K.Nakaide End

		MCdrcattCB mCdrcattCB = mCdrcattBhv.newConditionBean();
		
		// 検索条件
		mCdrcattCB.query().setControlNo_Equal(controlNo);
		//[TSN] 削除フラグの検索条件自動付与の無効化処理追加 2024.3.27 K.Nakaide Start
		//mCdrcattCB.query().setDelFlg_Equal_$0();
		//[TSN] 削除フラグの検索条件自動付与の無効化処理追加 2024.3.27 K.Nakaide End
		
		// 対象(更新)項目
		MCdrcatt mCdrcatt = mCdrcattBhv.newMyEntity();
		mCdrcatt.setControlNo(null);
		
		// 更新
		mCdrcattBhv.queryUpdate(mCdrcatt, mCdrcattCB);

		//[TSN] 削除フラグの検索条件自動付与の無効化処理追加 2024.3.27 K.Nakaide Start
		//削除フラグ自動検索を有効に戻す
		this.setBehaviorAutoDelFlg(true);
		//[TSN] 削除フラグの検索条件自動付与の無効化処理追加 2024.3.27 K.Nakaide End
	}
}

