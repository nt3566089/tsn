package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MClientItemCB;
import com.oneslogi.base.dbflute.exbhv.MClientItemBhv;
import com.oneslogi.base.dbflute.exentity.MClientItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主項目マスタ共通ロジッククラス
 */
public class ClientItemLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientItemBhv mClientItemBhv;

	/**
	 * <h2>登録時荷主項目マスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 荷主項目マスタの重複チェックを行う。
	 * </pre>
	 * @param mClientItem 荷主項目マスタ：荷主ID・項目ID
	 * @return boolean (true:荷主項目マスタ重複)
	 */
	public boolean checkClientItemCdInsert(MClientItem mClientItem) {
		boolean result = false;
		result = checkClientItemCdInsert(mClientItem, null);
		return result;
	}

	/**
	 * <h2>登録時項目ID重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主項目マスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClientItem 荷主項目マスタ：荷主ID・項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:項目ID重複)
	 */
	public boolean checkClientItemCdInsert(MClientItem mClientItem, ErrorStatus errSts) {
		MClientItemCB cb = mClientItemBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(mClientItem.getClientId());
		cb.query().setItemId_Equal(mClientItem.getItemId());

		int count = mClientItemBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_ITEM_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時荷主項目マスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 荷主項目マスタの重複チェックを行う。
	 * </pre>
	 * @param mClientItem 荷主項目マスタ：荷主ID・項目ID・荷主項目ID
	 * @return boolean (true:荷主項目マスタ重複)
	 */
	public boolean checkClientItemCdUpdate(MClientItem mClientItem) {
		boolean result = false;
		result = checkClientItemCdUpdate(mClientItem, null);
		return result;
	}

	/**
	 * <h2>更新時荷主項目ID重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主項目マスタのデータを検索し、
	 * 引数と取得結果の荷主項目IDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClientItem 荷主項目マスタ：荷主ID・項目ID・荷主項目ID
	 * @return boolean (true:荷主項目ID重複)
	 */
	public boolean checkClientItemCdUpdate(MClientItem mClientItem, ErrorStatus errSts) {
		MClientItemCB cb = mClientItemBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(mClientItem.getClientId());
		cb.query().setItemId_Equal(mClientItem.getItemId());
		MClientItem clientItem = mClientItemBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (clientItem != null &&
				!CU.isNotNullAndEquals(mClientItem.getClientItemId(), clientItem.getClientItemId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_ITEM_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>荷主項目マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主項目マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主項目マスタ：荷主項目ID
	 * @return MClientItem 荷主項目マスタ
	 */
	public MClientItem getPkEntity(MClientItem entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>荷主項目マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主項目マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主項目マスタ：荷主項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientItem 荷主項目マスタ
	 */
	public MClientItem getPkEntity(MClientItem entity, ErrorStatus errSts) {
		MClientItem resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_ITEM_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主項目マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主項目マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主項目マスタ：荷主項目ID
	 * @return MClientItem 荷主項目マスタ
	 */
	public MClientItem getPkEntityWithDeletedCheck(MClientItem entity) {
		if (entity.getClientItemId() == null) {
			return null;
		}
		return mClientItemBhv.selectByPKValueWithDeletedCheck(entity.getClientItemId());
	}

	/**
	 * <h2>荷主項目マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主項目マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主項目マスタ：荷主ID・項目ID
	 * @return MClientItem 荷主項目マスタ
	 */
	public MClientItem getUkEntity(MClientItem entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷主項目マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主項目マスタデータを取得する。
	 * 検索対象が見つからない場合未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主項目マスタ：荷主ID・項目ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientItem 荷主項目マスタ
	 */
	public MClientItem getUkEntity(MClientItem entity, ErrorStatus errSts) {
		MClientItem resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_ITEM_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主項目マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主項目マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主項目マスタ：荷主ID・項目ID
	 * @return MClientItem 荷主項目マスタ
	 */
	public MClientItem getUkEntityWithDeletedCheck(MClientItem entity) {
		Long clientId = entity.getClientId();
		if (clientId == null) {
			return null;
		}
		MClientItemCB cb = mClientItemBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setItemId_Equal(entity.getItemId());
		return mClientItemBhv.selectEntityWithDeletedCheck(cb);
	}
}