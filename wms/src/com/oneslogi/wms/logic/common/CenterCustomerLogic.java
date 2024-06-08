package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ取引先マスタ共通ロジッククラス
 */
public class CenterCustomerLogic extends AbstractWmsLogic {

	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;

	/**
	 * <h2>センタ取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ取引先マスタデータを取得する。
	 * </pre>
	 * @param entity センタ取引先マスタ：センタID・取引先ID
	 * @return MCenterCustomer センタ取引先マスタ
	 */
	public MCenterCustomer getUkEntity(MCenterCustomer entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタ取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ取引先マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ取引先マスタ：センタID・取引先ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterCustomer センタ取引先マスタ
	 */
	public MCenterCustomer getUkEntity(MCenterCustomer entity, ErrorStatus errSts) {
		MCenterCustomer resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ取引先マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ取引先マスタ：センタID・取引先ID
	 * @return MCenterCustomer センタ取引先マスタ
	 */
	public MCenterCustomer getUkEntityWithDeletedCheck(MCenterCustomer entity) {
		if (entity.getCenterId() == null) {
			return null;
		}
		if (entity.getCustomerId() == null) {
			return null;
		}

		MCenterCustomerCB cb = mCenterCustomerBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setCustomerId_Equal(entity.getCustomerId());

		return mCenterCustomerBhv.selectEntityWithDeletedCheck(cb);
	}
	/**
	 * <h2>センタ取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ取引先マスタデータを取得する。
	 * </pre>
	 * @param entity センタ取引先マスタ：センタID・取引先ID・配送コースID
	 * @return List<MCenterCustomer> センタ取引先マスタ
	 */
	public List<MCenterCustomer> getUkList (MCenterCustomer entity) {
		return getUkList(entity, null);
	}
	/**
	 * <h2>センタ取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ取引先マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ取引先マスタ：センタID・取引先ID・配送コースID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCenterCustomer> センタ取引先マスタ
	 */
	public List<MCenterCustomer> getUkList (MCenterCustomer entity, ErrorStatus errSts) {
		List<MCenterCustomer> resultEntityC = null;
		try {
			resultEntityC = getUkListWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return resultEntityC;
	}

	/**
	 * <h2>センタ取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ取引先マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ取引先マスタ：センタID・取引先ID・配送コースID
	 * @return List<MCenterCustomer> センタ取引先マスタ
	 */
	public List<MCenterCustomer> getUkListWithDeletedCheck(MCenterCustomer entity) {

		List<MCenterCustomer> result = null;

		if (entity.getCenterId() == null) {
			return null;
		}
		if (entity.getCustomerId() == null) {
			return null;
		}

		MCenterCustomerCB cb = mCenterCustomerBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setCustomerId_Equal(entity.getCustomerId());
		cb.query().setDeliveryCourseId_Equal(entity.getDeliveryCourseId());

		result = mCenterCustomerBhv.selectList(cb);
		return result;

	}
}
