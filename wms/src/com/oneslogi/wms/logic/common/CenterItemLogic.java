package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterItemCB;
import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ項目マスタ共通ロジッククラス
 */
public class CenterItemLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterItemBhv mCenterItemBhv;

	/**
	 * <h2>登録時項目CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・項目CD重複チェック
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：センタID・項目ID
	 * @return boolean (true:項目CD重複)
	 */
	public boolean checkCenterItemCdInsert(MCenterItem mCenterItem) {
		boolean result = false;
		result = checkCenterItemCdInsert(mCenterItem, null);
		return result;
	}

	/**
	 * <h2>登録時項目CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタ項目マスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：センタID・項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:センタIDと項目ID重複)
	 */
	public boolean checkCenterItemCdInsert(MCenterItem mCenterItem, ErrorStatus errSts) {
		MCenterItemCB cb = mCenterItemBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCenterItem.getCenterId());
		cb.query().setItemId_Equal(mCenterItem.getItemId());

		int count = mCenterItemBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_ITEM_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時項目CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・項目CD重複チェック
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：センタID・項目ID・センタ項目ID
	 * @return boolean (true:項目CD重複)
	 */
	public boolean checkCenterItemCdUpdate(MCenterItem mCenterItem) {
		boolean result = false;
		result = checkCenterItemCdUpdate(mCenterItem, null);
		return result;
	}

	/**
	 * <h2>更新時センタ項目ID重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタ項目マスタのデータを検索し、
	 * 引数と取得結果のセンタ項目IDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCenterItem センタ項目マスタ：センタID・項目ID・センタ項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:センタ項目ID重複)
	 */
	public boolean checkCenterItemCdUpdate(MCenterItem mCenterItem, ErrorStatus errSts) {
		MCenterItemCB cb = mCenterItemBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCenterItem.getCenterId());
		cb.query().setItemId_Equal(mCenterItem.getItemId());
		MCenterItem centerItem = mCenterItemBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (centerItem != null &&
				!CU.isNotNullAndEquals(mCenterItem.getCenterItemId(), centerItem.getCenterItemId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_ITEM_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>センタ項目マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ項目マスタデータを取得する。
	 * </pre>
	 * @param entity センタ項目マスタ：センタ項目ID
	 * @return MCenterItem センタ項目マスタ
	 */
	public MCenterItem getPkEntity(MCenterItem entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>センタ項目マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ項目マスタデータを取得する。
	 * 検索対象が見つからない場合、存在しないエラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ項目マスタ：センタ項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterItem センタ項目マスタ
	 */
	public MCenterItem getPkEntity(MCenterItem entity, ErrorStatus errSts) {
		MCenterItem resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_ITEM_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ項目マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ項目マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ項目マスタ：センタ項目ID
	 * @return MCenterItem センタ項目マスタ
	 */
	public MCenterItem getPkEntityWithDeletedCheck(MCenterItem entity) {
		if (entity.getCenterItemId() == null) {
			return null;
		}
		return mCenterItemBhv.selectByPKValueWithDeletedCheck(entity.getCenterItemId());
	}

	/**
	 * <h2>センタ項目マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ項目マスタデータを取得する。
	 * </pre>
	 * @param entity センタ項目マスタ：センタID・項目ID
	 * @return MCenterItem センタ項目マスタ
	 */
	public MCenterItem getUkEntity(MCenterItem entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタ項目マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ項目マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ項目マスタ：センタID・項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterItem センタ項目マスタ
	 */
	public MCenterItem getUkEntity(MCenterItem entity, ErrorStatus errSts) {
		MCenterItem resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_ITEM_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ項目マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ項目マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ項目マスタ：センタID・項目ID
	 * @return MCenterItem センタ項目マスタ
	 */
	public MCenterItem getUkEntityWithDeletedCheck(MCenterItem entity) {
		Long centerId = entity.getCenterId();
		if (centerId == null) {
			return null;
		}
		MCenterItemCB cb = mCenterItemBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setItemId_Equal(entity.getItemId());
		return mCenterItemBhv.selectEntityWithDeletedCheck(cb);
	}
}