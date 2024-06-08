package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿グループ明細マスタ共通ロジッククラス
 */
public class ShapeGrpDtlLogic extends AbstractWmsLogic {

	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;

	/**
	 * <h2>荷姿グループ明細マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷姿グループ明細マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷姿グループ明細マスタ：荷姿グループID・荷姿CD
	 * @return MShapeGrpDtl 荷姿グループ明細マスタ
	 */
	public MShapeGrpDtl getUkEntityWithDeletedCheck(MShapeGrpDtl entity) {

		if (entity.getShapeId() == null) {
			return null;
		}
		if (entity.getShapeGrpId() == null) {
			return null;
		}

		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();
		cb.query().setShapeId_Equal(entity.getShapeId());
		cb.query().setShapeGrpId_Equal(entity.getShapeGrpId());
		return mShapeGrpDtlBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>荷姿グループ明細マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷姿グループ明細マスタデータを取得する。
	 * </pre>
	 * @param entity 荷姿グループ明細マスタ：荷姿グループID・荷姿CD
	 * @return MShapeGrpDtl 荷姿グループ明細マスタ
	 */
	public MShapeGrpDtl getUkEntity(MShapeGrpDtl entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷姿グループ明細マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷姿グループ明細マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷姿グループ明細マスタ：荷姿グループID・荷姿CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MShapeGrpDtl 荷姿グループ明細マスタ
	 */
	public MShapeGrpDtl getUkEntity(MShapeGrpDtl entity, ErrorStatus errSts) {
		MShapeGrpDtl resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			//this.getErrorManager().add(errSts, WmsMessageConst.SHAPE_GRP_DTL_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷姿グループ明細マスタのデータを取得する。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param shapeGrpDtlId 荷姿グループ明細ID
	 * @return MShapeGrpDtl 荷姿グループ明細マスタ
	 */
	public MShapeGrpDtl getPkEntity(Long shapeGrpDtlId) {
		if (shapeGrpDtlId == null) {
			return null;
		}

		return mShapeGrpDtlBhv.selectByPKValueWithDeletedCheck(shapeGrpDtlId);
	}
}
