package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYmtCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ヤマト送り状マスタ共通ロジッククラス
 */
public class CarrierSlipYmtLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYmtBhv mCarrierSlipYmtBhv;

	/**
	 * <h2>更新時センタIDとデータ種別重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にヤマト送り状マスタのデータを検索し、
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCarrierSlipYmt ヤマト送り状マスタ：センタID・データ種別・送り状定義ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:センタIDとデータ種別重複)
	 */
	public boolean checkCenterIdUpdate(MCarrierSlipYmt mCarrierSlipYmt, ErrorStatus errSts) {
		MCarrierSlipYmtCB cb = mCarrierSlipYmtBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCarrierSlipYmt.getCenterId());
		cb.query().setTagType_Equal(mCarrierSlipYmt.getTagType());
		cb.query().setCarrierSlipYmtId_NotEqual(mCarrierSlipYmt.getCarrierSlipYmtId());

		int count = mCarrierSlipYmtBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>登録時センタIDとデータ種別重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にヤマト送り状マスタのデータを検索し、
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCarrierSlipYmt ヤマト送り状マスタ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:センタIDとデータ種別重複)
	 */
	public boolean checkCenterIdInsert(MCarrierSlipYmt mCarrierSlipYmt, ErrorStatus errSts) {
		MCarrierSlipYmtCB cb = mCarrierSlipYmtBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCarrierSlipYmt.getCenterId());
		cb.query().setTagType_Equal(mCarrierSlipYmt.getTagType());

		int count = mCarrierSlipYmtBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>ヤマト送り状マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にヤマト送り状マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ヤマト送り状マスタ：送り状定義ID
	 * @return MCarrierSlipYmt ヤマト送り状マスタ
	 */
	public MCarrierSlipYmt getPkEntity(MCarrierSlipYmt entity) {
		if (entity.getCarrierSlipYmtId() == null) {
			return null;
		}
		return mCarrierSlipYmtBhv.selectByPKValueWithDeletedCheck(entity.getCarrierSlipYmtId());
	}

	/**
	 * <h2>ヤマト送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にヤマト送り状マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ヤマト送り状マスタ：センタID・データ種別
	 * @return MCarrierSlipYmt ヤマト送り状マスタ
	 */
	public MCarrierSlipYmt getUkEntityWithDeletedCheck(MCarrierSlipYmt entity) {

		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
		if (entity.getCenterId() == null) {
			return null;
		}
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End

		if (CU.isNullOrEmpty(entity.getTagType())) {
			return null;
		}

		MCarrierSlipYmtCB cb = mCarrierSlipYmtBhv.newMyConditionBean();
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
		cb.query().setCenterId_Equal(entity.getCenterId());
		// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
		cb.query().setTagType_Equal(entity.getTagType());
		return mCarrierSlipYmtBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>ヤマト送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にヤマト送り状マスタデータを取得する。
	 * </pre>
	 * @param entity ヤマト送り状マスタ：センタID・データ種別
	 * @return MCarrierSlipYmt ヤマト送り状マスタ
	 */
	public MCarrierSlipYmt getUkEntity(MCarrierSlipYmt entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ヤマト送り状マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にヤマト送り状マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ヤマト送り状マスタ：センタID・データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipYmt ヤマト送り状マスタ
	 */
	public MCarrierSlipYmt getUkEntity(MCarrierSlipYmt entity, ErrorStatus errSts) {
		MCarrierSlipYmt resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "CenterNotFoundError");
		}
		return resultEntity;
	}
}
