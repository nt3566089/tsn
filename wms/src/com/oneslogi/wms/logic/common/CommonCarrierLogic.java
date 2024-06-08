package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCommonCarrierCB;
import com.oneslogi.base.dbflute.exbhv.MCommonCarrierBhv;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 共通運送業者マスタチェック処理ロジッククラス
 */
public class CommonCarrierLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCommonCarrierBhv mCommonCarrierBhv;

	/**
	 * <h2>登録時共通運送業者CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記テーブルのデータをチェックする。
	 * ・共通運送業者マスタ
	 * </pre>
	 * @param mCarrier 共通運送業者マスタ：全項目
	 * @return boolean (true:共通運送業者CD重複)
	 */
	public boolean checkCarrierCdInsert(MCommonCarrier mCommonCarrier) {
		boolean result = false;
		result = checkCommonCarrierCdInsert(mCommonCarrier, null);
		return result;
	}

	/**
	 * <h2>登録時共通運送業者CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記テーブルのデータをチェックする。
	 * ・運送業者マスタ
	 * 検索結果が0件以上の場合、登録済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrier 共通運送業者マスタ：センタID・運共通運送業者CD
	 * @param errSts エラー時のエラー情報への設定値
	 * @return boolean (true:共通運送業者CD重複)
	 */
	public boolean checkCommonCarrierCdInsert(MCommonCarrier mCommonCarrier, ErrorStatus errSts) {

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(false);

		MCommonCarrierCB cb = mCommonCarrierBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCommonCarrierId_Equal(mCommonCarrier.getCommonCarrierId());
		cb.query().setCarrierCd_Equal(mCommonCarrier.getCarrierCd());

		int count = mCommonCarrierBhv.selectCount(cb);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts,  WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時共通運送業者CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記テーブルのデータをチェックする。
	 * ・共通運送業者マスタ
	 * </pre>
	 * @param mCommonCarrier 共通運送業者マスタ：全項目
	 * @return boolean (true:共通運送業者CD重複)
	 */
	public boolean checkCommonCarrierCdUpdate(MCommonCarrier mCommonCarrier) {
		boolean result = false;
		result = checkCommonCarrierCdUpdate(mCommonCarrier, null);
		return result;
	}

	/**
	 * <h2>更新時共通運送業者CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記テーブルのデータをチェックする。
	 * ・共通運送業者マスタ
	 * 検索対象が見つかった場合、重複エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCommonCarrier 共通運送業者マスタ：運送業者CD・共通運送業者ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:運送業者CD重複)
	 */
	public boolean checkCommonCarrierCdUpdate(MCommonCarrier mCommonCarrier, ErrorStatus errSts) {
		MCommonCarrierCB cb = mCommonCarrierBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCarrierCd_Equal(mCommonCarrier.getCarrierCd());
		MCommonCarrier CommonCarrier = mCommonCarrierBhv.selectEntity(cb);

		if (CommonCarrier != null &&
				!CU.isNotNullAndEquals(mCommonCarrier.getCommonCarrierId(), CommonCarrier.getCommonCarrierId())) {

			this.getErrorManager().add(errSts,  WmsMessageConst.CARRIER_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>共通運送業者ID存在チェック処理を行う。</h2>
	 * <pre>
	 * 下記テーブルのデータをチェックする。
	 * ・共通運送業者マスタ
	 * 検索結果が0件以上の場合、trueを返す。
	 * </pre>
	 * @param mCommonCarrier 共通運送業者マスタ：共通運送業者ID
	 * @return boolean (true:運送業者ID存在)
	 */
	public boolean checkCommonCarrierId(MCommonCarrier mCommonCarrier) {
		MCommonCarrierCB cb = mCommonCarrierBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCommonCarrierId_Equal(mCommonCarrier.getCommonCarrierId());

		int count = mCommonCarrierBhv.selectCount(cb);
		if (count > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <h2>共通運送業者マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に共通運送業者マスタから検索し、エンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mCommonCarrier 共通運送業者マスタ：共通運送業者ID
	 * @return MCommonCarrier ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCommonCarrier getPkEntity(MCommonCarrier mCommonCarrier) {
		if (mCommonCarrier.getCommonCarrierId() == null) {
			return null;
		}
		return mCommonCarrierBhv.selectByPKValueWithDeletedCheck(mCommonCarrier.getCommonCarrierId());
	}

	/**
	 * <h2>共通運送業者マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に運送業者マスタから検索し、エンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mCommonCarrier 共通運送業者マスタ：センタID・運送業者CD
	 * @return MCommonCarrier ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCommonCarrier getUkEntity(MCommonCarrier mCommonCarrier) {

		MCommonCarrierCB cb = mCommonCarrierBhv.newMyConditionBean();

		if (mCommonCarrier.getCarrierCd() == null) {
			return null;
		}
		cb.query().setCarrierCd_Equal(mCommonCarrier.getCarrierCd());
		MCommonCarrier commoncarrier = getUkEntity(mCommonCarrier, null);
		return commoncarrier;
	}

	/**
	 * <h2>共通運送業者マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に共通運送業者マスタから検索し、エンティティを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * 存在しないエラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 共通運送業者マスタ：全項目
	 * @param errSts エラー時のエラー情報への設定値
	 * @return MCommonCarrier ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCommonCarrier getUkEntity(MCommonCarrier entity, ErrorStatus errSts) {
		MCommonCarrier resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.COMMON_CARRIER_CODE_NOT_FOUND_IN_COMMON_CARRIER_MASTER_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>共通運送業者マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に共通運送業者マスタから検索し、エンティティを返す。
	 * </pre>
	 * @param entity 共通運送業者マスタ：運送業者CD・センタID
	 * @return MCarrier ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCommonCarrier getUkEntityWithDeletedCheck(MCommonCarrier entity) {

		if (CU.isNullOrEmpty(entity.getCarrierCd())) {
			return null;
		}

		MCommonCarrierCB cb = mCommonCarrierBhv.newMyConditionBean();
		cb.query().setCarrierCd_Equal(entity.getCarrierCd());
		return mCommonCarrierBhv.selectEntityWithDeletedCheck(cb);
	}
}