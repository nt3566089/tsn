package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterColCB;
import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ列マスタ共通ロジッククラス
 */
public class CenterColLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterColBhv mCenterColBhv;

	/**
	 * <h2>登録時列CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーにセンタ列マスタの重複チェックを行う。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：センタID・列ID
	 * @return boolean (true:列CD重複)
	 */
	public boolean checkCenterColCdInsert(MCenterCol mCenterCol) {
		boolean result = false;
		result = checkCenterColCdInsert(mCenterCol, null);
		return result;
	}

	/**
	 * <h2>登録時列CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタ列マスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：センタID・列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:列CD重複)
	 */
	public boolean checkCenterColCdInsert(MCenterCol mCenterCol, ErrorStatus errSts) {
		MCenterColCB cb = mCenterColBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCenterCol.getCenterId());
		cb.query().setColId_Equal(mCenterCol.getColId());

		int count = mCenterColBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_COL_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時列CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーにセンタ列マスタの重複チェックを行う。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：センタID・列ID
	 * @return boolean (true:列CD重複)
	 */
	public boolean checkCenterColCdUpdate(MCenterCol mCenterCol) {
		boolean result = false;
		result = checkCenterColCdUpdate(mCenterCol, null);
		return result;
	}

	/**
	 * <h2>更新時列CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタ列マスタのデータを検索し、
	 * 引数と取得結果の列CDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCenterCol センタ列マスタ：センタID・列ID
	 * @return boolean (true:列CD重複)
	 */
	public boolean checkCenterColCdUpdate(MCenterCol mCenterCol, ErrorStatus errSts) {
		MCenterColCB cb = mCenterColBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCenterCol.getCenterId());
		cb.query().setColId_Equal(mCenterCol.getColId());
		MCenterCol centerCol = mCenterColBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (centerCol != null &&
				!CU.isNotNullAndEquals(mCenterCol.getCenterColId(), centerCol.getCenterColId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_COL_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>センタ列マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ列マスタデータを取得する。
	 * </pre>
	 * @param entity センタ列マスタ：センタ列ID
	 * @return MCenterCol センタ列マスタ
	 */
	public MCenterCol getPkEntity(MCenterCol entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>センタ列マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ列マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ列マスタ：センタ列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterCol センタ列マスタ
	 */
	public MCenterCol getPkEntity(MCenterCol entity, ErrorStatus errSts) {
		MCenterCol resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_COL_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ列マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ列マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ列マスタ：センタ列ID
	 * @return MCenterCol センタ列マスタ
	 */
	public MCenterCol getPkEntityWithDeletedCheck(MCenterCol entity) {
		if (entity.getCenterColId() == null) {
			return null;
		}
		return mCenterColBhv.selectByPKValueWithDeletedCheck(entity.getCenterColId());
	}

	/**
	 * <h2>センタ列マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ列マスタデータを取得する。
	 * </pre>
	 * @param entity センタ列マスタ：センタID・列ID
	 * @return MCenterCol センタ列マスタ
	 */
	public MCenterCol getUkEntity(MCenterCol entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタ列マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ列マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ列マスタ：センタID・列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterCol センタ列マスタ
	 */
	public MCenterCol getUkEntity(MCenterCol entity, ErrorStatus errSts) {
		MCenterCol resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_COL_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ列マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ列マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ列マスタ：センタID・列ID
	 * @return MCenterCol センタ列マスタ
	 */
	public MCenterCol getUkEntityWithDeletedCheck(MCenterCol entity) {
		Long centerId = entity.getCenterId();
		if (centerId == null) {
			return null;
		}
		MCenterColCB cb = mCenterColBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setColId_Equal(entity.getColId());
		return mCenterColBhv.selectEntityWithDeletedCheck(cb);
	}
}