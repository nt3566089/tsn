package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 佐川送り状マスタ共通ロジッククラス
 */
public class CarrierSlipSgwLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;

	/**
	 * <h2>登録時センタIDとデータ種別重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に佐川送り状マスタのデータを検索し、
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCarrierSlipSgw 佐川送り状マスタ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:センタIDとデータ種別重複)
	 */
	public boolean checkCenterIdInsert(MCarrierSlipSgw mCarrierSlipSgw, ErrorStatus errSts) {
		MCarrierSlipSgwCB cb = mCarrierSlipSgwBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCarrierSlipSgw.getCenterId());
		cb.query().setTagType_Equal(mCarrierSlipSgw.getTagType());

		int count = mCarrierSlipSgwBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>佐川送り状マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に佐川送り状マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 佐川送り状マスタ：送り状定義ID
	 * @return MCarrierSlipSgw 佐川送り状マスタ
	 */
	public MCarrierSlipSgw getPkEntity(MCarrierSlipSgw entity) {
		if (entity.getCarrierSlipSgwId() == null) {
			return null;
		}
		return mCarrierSlipSgwBhv.selectByPKValueWithDeletedCheck(entity.getCarrierSlipSgwId());
	}

	/**
	 * <h2>佐川送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に佐川送り状マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 佐川送り状マスタ：センタID・データ種別
	 * @return MCarrierSlipSgw 佐川送り状マスタ
	 */
	public MCarrierSlipSgw getUkEntityWithDeletedCheck(MCarrierSlipSgw entity) {

		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
		if (entity.getCenterId() == null) {
			return null;
		}
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End

		if (CU.isNullOrEmpty(entity.getTagType())) {
			return null;
		}

		MCarrierSlipSgwCB cb = mCarrierSlipSgwBhv.newMyConditionBean();
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
		cb.query().setCenterId_Equal(entity.getCenterId());
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
		cb.query().setTagType_Equal(entity.getTagType());
		return mCarrierSlipSgwBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>佐川送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に佐川送り状マスタデータを取得する。
	 * </pre>
	 * @param entity 佐川送り状マスタ：センタID・データ種別
	 * @return MCarrierSlipSgw 佐川送り状マスタ
	 */
	public MCarrierSlipSgw getUkEntity(MCarrierSlipSgw entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>佐川送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に佐川送り状マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 佐川送り状マスタ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipSgw 佐川送り状マスタ
	 */
	public MCarrierSlipSgw getUkEntity(MCarrierSlipSgw entity, ErrorStatus errSts) {
		MCarrierSlipSgw resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "CenterNotFoundError");
		}
		return resultEntity;
	}
}
