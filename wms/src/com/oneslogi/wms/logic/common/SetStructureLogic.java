package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MSetStructureCB;
import com.oneslogi.base.dbflute.exbhv.MSetStructureBhv;
import com.oneslogi.base.dbflute.exentity.MSetStructure;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * セット品構成マスタ共通ロジッククラス
 */
public class SetStructureLogic extends AbstractWmsLogic {

	@Inject
	private MSetStructureBhv mSetStructureBhv;

	/**
	 * <h2>セット品構成マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセット品構成マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity セット品構成マスタ：商品ID・親ID
	 * @return MSetStructure セット品構成マスタ
	 */
	public MSetStructure getUkEntityWithDeletedCheck(MSetStructure entity) {
		if (entity.getProductId() == null) {
			return null;
		}

		MSetStructureCB cb = mSetStructureBhv.newMyConditionBean();
		cb.query().setProductId_Equal(entity.getProductId());
		cb.query().setSetParentId_Equal(entity.getSetParentId());
		return mSetStructureBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>セット品構成マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセット品構成マスタデータを取得する。
	 * </pre>
	 * @param entity セット品構成マスタ：商品ID・親ID
	 * @return MSetStructure セット品構成マスタ
	 */
	public MSetStructure getUkEntity(MSetStructure entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>セット品構成マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセット品構成マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity セット品構成マスタ：商品ID・親ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MSetStructure セット品構成マスタ
	 */
	public MSetStructure getUkEntity(MSetStructure entity, ErrorStatus errSts) {
		MSetStructure resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "SetStructureFoundError");
		}
		return resultEntity;
	}

}
