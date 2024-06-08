package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫No.共通ロジッククラス
 */
public class StoreNoLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreNoBhv tStorenoBhv;

	/**
	 * <h2>入庫No.を取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に入庫No.データを取得する。
	 * </pre>
	 * @param entity 入庫No.：入庫ラベルNo.
	 * @return TStoreNo 入庫No.
	 */
	public TStoreNo getUkEntity(TStoreNo entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>入庫No.を取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に入庫No.データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * 未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 入庫No.：入庫ラベルNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TStoreNo 入庫No.
	 */
	public TStoreNo getUkEntity(TStoreNo entity, ErrorStatus errSts) {
		TStoreNo resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>入庫No.を取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に入庫No.データを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 入庫No.：入庫ラベルNo.
	 * @return TStoreNo 入庫No.
	 */
	public TStoreNo getUkEntityWithDeletedCheck(TStoreNo entity) {
		if (CU.isNullOrEmpty(entity.getStoreLabelNo())) {
			return null;
		}

		TStoreNoCB cb = tStorenoBhv.newMyConditionBean();
		cb.query().setStoreLabelNo_Equal(entity.getStoreLabelNo());
		return tStorenoBhv.selectEntityWithDeletedCheck(cb);
	}

}