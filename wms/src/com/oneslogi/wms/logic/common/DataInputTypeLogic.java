package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MDataInputTypeCB;
import com.oneslogi.base.dbflute.exbhv.MDataInputTypeBhv;
import com.oneslogi.base.dbflute.exentity.MDataInputType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 初期データ取込種別マスタに対するロジッククラス。
 */
public class DataInputTypeLogic extends AbstractWmsLogic {

	@Inject
	private MDataInputTypeBhv mDataInputTypeBhv;

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MDataInputType getUkEntityWithDeletedCheck(MDataInputType entity) {
		if (CU.isNullOrEmpty(entity.getDataInputTypeCd())) {
			return null;
		}
		MDataInputTypeCB cb = mDataInputTypeBhv.newMyConditionBean();
		cb.query().setDataInputTypeCd_Equal(entity.getDataInputTypeCd());
		return mDataInputTypeBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MDataInputType getUkEntity(MDataInputType entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MDataInputType getUkEntity(MDataInputType entity, ErrorStatus errSts) {
		MDataInputType resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_INPUT_TYPE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}
}
