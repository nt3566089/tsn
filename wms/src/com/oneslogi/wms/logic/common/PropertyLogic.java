package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.BPropertyCB;
import com.oneslogi.base.dbflute.exbhv.BPropertyBhv;
import com.oneslogi.base.dbflute.exentity.BProperty;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * プロパティマスタ共通ロジッククラス
 */
public class PropertyLogic extends AbstractWmsLogic {

	@Inject
	private BPropertyBhv bPropertyBhv;

	/**
	 * <h2>プロパティマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にプロパティマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity プロパティマスタ：プロパティID
	 * @return BProperty プロパティマスタ
	 */
	public BProperty getPkEntityWithDeletedCheck(BProperty entity) {
		if (entity.getPropertyId() == null) {
			return null;
		}
		return bPropertyBhv.selectByPKValueWithDeletedCheck(entity.getPropertyId());
	}

	/**
	 * <h2>プロパティマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にプロパティマスタデータを取得する。
	 * </pre>
	 * @param entity プロパティマスタ：プロパティID
	 * @return BProperty プロパティマスタ
	 */
	public BProperty getPkEntity(BProperty entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>プロパティマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にプロパティマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity プロパティマスタ：プロパティID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return BProperty プロパティマスタ
	 */
	public BProperty getPkEntity(BProperty entity, ErrorStatus errSts) {
		BProperty resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "propertyNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>プロパティマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にプロパティマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity プロパティマスタ：項目名
	 * @return BProperty プロパティマスタ
	 */
	public BProperty getUkEntityWithDeletedCheck(BProperty entity) {
		if (CU.isNullOrEmpty(entity.getPropertyNm())) {
			return null;
		}
		BPropertyCB cb = bPropertyBhv.newMyConditionBean();
		cb.query().setPropertyNm_Equal(entity.getPropertyNm());
		return bPropertyBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>プロパティマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にプロパティマスタデータを取得する。
	 * </pre>
	 * @param entity プロパティマスタ：項目名
	 * @return BProperty プロパティマスタ
	 */
	public BProperty getUkEntity(BProperty entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>プロパティマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にプロパティマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity プロパティマスタ：項目名
	 * @param errSts エラー時に設定するエラーステータス
	 * @return BProperty プロパティマスタ
	 */
	public BProperty getUkEntity(BProperty entity, ErrorStatus errSts) {
		BProperty resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "propertyNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>項目名を条件にプロパティIDを返す。</h2>
	 * <pre>
	 * 項目名を条件にプロパティIDを返す。
	 * </pre>
	 * @param propertyNm 項目名
	 * @return Long プロパティID
	 */
	public Long getPropertyId(String propertyNm) {
		BProperty entity = bPropertyBhv.newMyEntity();
		entity.setPropertyNm(propertyNm);
		BProperty resultEntity = getUkEntityWithDeletedCheck(entity);
		return resultEntity.getPropertyId();
	}

	/**
	 * <h2>更新時プロパティマスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・項目名重複チェック
	 * </pre>
	 * @param bProperty プロパティマスタ：項目名・プロパティID
	 * @return boolean (true:プロパティマスタ重複)
	 */
	public boolean checkPropertyNmUpdate(BProperty bProperty) {
		boolean result = false;
		result = checkPropertyNmUpdate(bProperty, null);
		return result;
	}

	/**
	 * <h2>更新時項目名重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーにプロパティマスタのデータを検索する。
	 * 引数と取得結果のプロパティIDが異なる場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param bProperty プロパティマスタ：項目名・プロパティID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:項目名重複)
	 */
	public boolean checkPropertyNmUpdate(BProperty bProperty, ErrorStatus errSts) {
		BPropertyCB cb = bPropertyBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setPropertyNm_Equal(bProperty.getPropertyNm());
		BProperty property = bPropertyBhv.selectEntity(cb);

		if (property != null &&
				!CU.isNotNullAndEquals(bProperty.getPropertyId(), property.getPropertyId())) {

			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

}
