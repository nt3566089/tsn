package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゆうパック送り状マスタ共通ロジッククラス
 */
public class CarrierSlipYupkLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	/**
	 * <h2>登録時センタIDとデータ種別重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にゆうパック送り状マスタに検索し、
	 * 検索データが1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCarrierSlipYupk ゆうパック送り状マスタ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:センタIDとデータ種別重複)
	 */
	public boolean checkCenterIdInsert(MCarrierSlipYupk mCarrierSlipYupk, ErrorStatus errSts) {
		MCarrierSlipYupkCB cb = mCarrierSlipYupkBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCarrierSlipYupk.getCenterId());
		cb.query().setTagType_Equal(mCarrierSlipYupk.getTagType());

		int count = mCarrierSlipYupkBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>ゆうパック送り状マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にゆうパック送り状マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ゆうパック送り状マスタ：送り状定義ID
	 * @return MCarrierSlipYupk ゆうパック送り状マスタ
	 */
	public MCarrierSlipYupk getPkEntity(MCarrierSlipYupk entity) {
		if (entity.getCarrierSlipYupkId() == null) {
			return null;
		}
		return mCarrierSlipYupkBhv.selectByPKValueWithDeletedCheck(entity.getCarrierSlipYupkId());
	}

	/**
	 * <h2>ゆうパック送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にゆうパック送り状マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ゆうパック送り状マスタ：センタID・データ種別
	 * @return MCarrierSlipYupk ゆうパック送り状マスタ
	 */
	public MCarrierSlipYupk getUkEntityWithDeletedCheck(MCarrierSlipYupk entity) {

		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
		if (entity.getCenterId() == null) {
			return null;
		}
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End

		if (CU.isNullOrEmpty(entity.getTagType())) {
			return null;
		}

		MCarrierSlipYupkCB cb = mCarrierSlipYupkBhv.newMyConditionBean();
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
		cb.query().setCenterId_Equal(entity.getCenterId());
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
		cb.query().setTagType_Equal(entity.getTagType());
		return mCarrierSlipYupkBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>ゆうパック送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にゆうパック送り状マスタデータを取得する。
	 * </pre>
	 * @param entity ゆうパック送り状マスタ：センタID・データ種別
	 * @return MCarrierSlipYupk ゆうパック送り状マスタ
	 */
	public MCarrierSlipYupk getUkEntity(MCarrierSlipYupk entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ゆうパック送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にゆうパック送り状マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ゆうパック送り状マスタ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipYupk ゆうパック送り状マスタ
	 */
	public MCarrierSlipYupk getUkEntity(MCarrierSlipYupk entity, ErrorStatus errSts) {
		MCarrierSlipYupk resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "CenterNotFoundError");
		}
		return resultEntity;
	}
}
