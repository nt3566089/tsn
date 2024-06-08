package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterScreenCB;
import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ画面マスタ共通ロジッククラス
 */
public class CenterScreenLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterScreenBhv mCenterScreenBhv;

	/**
	 * <h2>登録時画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・画面CD重複チェック
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：センタID・画面ID
	 * @return boolean (true:画面CD重複)
	 */
	public boolean checkCenterScreenCdInsert(MCenterScreen mCenterScreen) {
		boolean result = false;
		result = checkCenterScreenCdInsert(mCenterScreen, null);
		return result;
	}

	/**
	 * <h2>登録時画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタ画面マスタ のデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：センタID・画面ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:画面CD重複)
	 */
	public boolean checkCenterScreenCdInsert(MCenterScreen mCenterScreen, ErrorStatus errSts) {
		MCenterScreenCB cb = mCenterScreenBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCenterScreen.getCenterId());
		cb.query().setScreenId_Equal(mCenterScreen.getScreenId());

		int count = mCenterScreenBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_SCREEN_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・画面CD重複チェック
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：センタID・画面ID・センタ画面ID
	 * @return boolean (true:画面CD重複)
	 */
	public boolean checkCenterScreenCdUpdate(MCenterScreen mCenterScreen) {
		boolean result = false;
		result = checkCenterScreenCdUpdate(mCenterScreen, null);
		return result;
	}

	/**
	 * <h2>更新時画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタ画面マスタ のデータを検索し、
	 * 引数と取得結果のセンタ画面IDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCenterScreen センタ画面マスタ：センタID・画面ID・センタ画面ID
	 * @return boolean (true:画面CD重複)
	 */
	public boolean checkCenterScreenCdUpdate(MCenterScreen mCenterScreen, ErrorStatus errSts) {
		MCenterScreenCB cb = mCenterScreenBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCenterScreen.getCenterId());
		cb.query().setScreenId_Equal(mCenterScreen.getScreenId());
		MCenterScreen centerScreen = mCenterScreenBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (centerScreen != null &&
				!CU.isNotNullAndEquals(mCenterScreen.getCenterScreenId(), centerScreen.getCenterScreenId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_SCREEN_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>センタ画面マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ画面マスタデータを取得する。
	 * </pre>
	 * @param entity センタ画面マスタ：センタ画面ID
	 * @return MCenterScreen センタ画面マスタ
	 */
	public MCenterScreen getPkEntity(MCenterScreen entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>センタ画面マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ画面マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ画面マスタ：センタ画面ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterScreen センタ画面マスタ
	 */
	public MCenterScreen getPkEntity(MCenterScreen entity, ErrorStatus errSts) {
		MCenterScreen resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_SCREEN_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ画面マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ画面マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ画面マスタ：センタ画面ID
	 * @return MCenterScreen センタ画面マスタ
	 */
	public MCenterScreen getPkEntityWithDeletedCheck(MCenterScreen entity) {
		if (entity.getCenterScreenId() == null) {
			return null;
		}
		return mCenterScreenBhv.selectByPKValueWithDeletedCheck(entity.getCenterScreenId());
	}

	/**
	 * <h2>センタ画面マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ画面マスタデータを取得する。
	 * </pre>
	 * @param entity センタ画面マスタ：センタID・画面ID
	 * @return MCenterScreen センタ画面マスタ
	 */
	public MCenterScreen getUkEntity(MCenterScreen entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタ画面マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ画面マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ画面マスタ：センタID・画面ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterScreen センタ画面マスタ
	 */
	public MCenterScreen getUkEntity(MCenterScreen entity, ErrorStatus errSts) {
		MCenterScreen resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_SCREEN_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ画面マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ画面マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ画面マスタ：センタID・画面ID
	 * @return MCenterScreen センタ画面マスタ
	 */
	public MCenterScreen getUkEntityWithDeletedCheck(MCenterScreen entity) {
		Long centerId = entity.getCenterId();
		if (centerId == null) {
			return null;
		}
		MCenterScreenCB cb = mCenterScreenBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setScreenId_Equal(entity.getScreenId());
		return mCenterScreenBhv.selectEntityWithDeletedCheck(cb);
	}
}