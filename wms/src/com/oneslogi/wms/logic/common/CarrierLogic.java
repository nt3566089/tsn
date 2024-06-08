package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 運送業者マスタ共通ロジッククラス
 */
public class CarrierLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MCarrierBhv mCarrierBhv;
	// [#5705][v3.1] 配送コースに存在する運送業者を削除不可に変更 2018.12.06 kawana Start
	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;
	// [#5705][v3.1] 配送コースに存在する運送業者を削除不可に変更 2018.12.06 kawana End

	/**
	 * <h2>登録時運送業者CD存在チェック処理を行う。</h2>
	 * <pre>
	 * 運送業者マスタの存在チェックを行う。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：センタID・運送業者CD
	 * @return boolean (true:運送業者CD重複)
	 */
	public boolean checkCarrierCdInsert(MCarrier mCarrier) {
		boolean result = false;
		result = checkCarrierCdInsert(mCarrier, null);
		return result;
	}

	/**
	 * <h2>登録時運送業者CD存在チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に運送業者マスタのデータを検索し、
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：センタID・運送業者CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:運送業者CD重複)
	 */
	public boolean checkCarrierCdInsert(MCarrier mCarrier, ErrorStatus errSts) {

		// [新WMS-110-008] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-008] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MCarrierCB cb = mCarrierBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(mCarrier.getCenterId());
		cb.query().setCarrierCd_Equal(mCarrier.getCarrierCd());

		int count = mCarrierBhv.selectCount(cb);

		// [新WMS-110-008] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-008] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts,  WmsMessageConst.CARRIER_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts,  WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時運送業者CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 運送業者マスタの重複チェックを行う。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：運送業者CD・運送業者ID
	 * @return boolean (true:運送業者CD重複)
	 */
	public boolean checkCarrierCdUpdate(MCarrier mCarrier) {
		boolean result = false;
		result = checkCarrierCdUpdate(mCarrier, null);
		return result;
	}

	/**
	 * <h2>更新時運送業者CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に運送業者マスタのデータを検索し、
	 * 引数と取得結果の運送業者IDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：運送業者CD・運送業者ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:運送業者CD重複)
	 */
	public boolean checkCarrierCdUpdate(MCarrier mCarrier, ErrorStatus errSts) {
		MCarrierCB cb = mCarrierBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCarrierCd_Equal(mCarrier.getCarrierCd());
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		cb.query().setCenterId_Equal(mCarrier.getCenterId());
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		MCarrier Carrier = mCarrierBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (Carrier != null &&
				!CU.isNotNullAndEquals(mCarrier.getCarrierId(), Carrier.getCarrierId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			this.getErrorManager().add(errSts,  WmsMessageConst.CARRIER_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>運送業者ID存在チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・運送業者ID存在チェック
	 * 検索結果が1件以上の場合、trueを返す。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：運送業者ID
	 * @return boolean (true:運送業者ID存在)
	 */
	public boolean checkCarrierId(MCarrier mCarrier) {
		MCarrierCB cb = mCarrierBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCarrierId_Equal(mCarrier.getCarrierId());

		int count = mCarrierBhv.selectCount(cb);
		if (count > 0) {
			return true;
		}
		return false;
	}

	// [#5705][v3.1] 配送コースに存在する運送業者を削除不可に変更 2018.12.06 kawana Start

	/**
	 * <h2>配送コース存在チェック.</h2>
	 * <pre>
	 * 配送コースマスタに運送業者が存在する場合はエラーを登録する。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：運送業者ID
	 */
	public void checkDeliveryCourseExist(MCarrier mCarrier, ErrorStatus errSts) {

		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCarrierId_Equal(mCarrier.getCarrierId());
		if (0 < mDeliveryCourseBhv.selectCount(cb)) {
			// 配送コースあり
			this.getErrorManager().add(errSts, WmsMessageConst.CARRIER_CANNOT_DELETE_EXIST_DELIVERY_COURSE_MASTER_ERROR);
		}
	}

	// [#5705][v3.1] 配送コースに存在する運送業者を削除不可に変更 2018.12.06 kawana End

	/**
	 * <h2>運送業者マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に運送業者マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：運送業者ID
	 * @return MCarrier 運送業者マスタ
	 */
	public MCarrier getPkEntity(MCarrier mCarrier) {
		if (mCarrier.getCarrierId() == null) {
			return null;
		}
		return mCarrierBhv.selectByPKValueWithDeletedCheck(mCarrier.getCarrierId());
	}

	/**
	 * <h2>運送業者マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に運送業者マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：センタID・運送業者CD
	 * @return MCarrier 運送業者マスタ
	 */
	public MCarrier getUkEntity(MCarrier mCarrier) {

		MCarrierCB cb = mCarrierBhv.newMyConditionBean();

		if (mCarrier.getCenterId() == null) {
			return null;
		}
		cb.query().setCenterId_Equal(mCarrier.getCenterId());
		if (mCarrier.getCarrierCd() == null) {
			return null;
		}
		MCarrier carrier = getUkEntity(mCarrier, null);
		return carrier;
	}

	/**
	 * <h2>運送業者マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に運送業者マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 運送業者マスタ：運送業者CD・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrier 運送業者マスタ
	 */
	public MCarrier getUkEntity(MCarrier entity, ErrorStatus errSts) {
		MCarrier resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
			this.getErrorManager().add(errSts, "carrierCodeNotFoundInCarrierMasterError");
		    // [検査-095] エラーが表示を修正 2014.11.27 taoys End
		}
		return resultEntity;
	}

	/**
	 * <h2>運送業者マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に運送業者マスタデータを取得する。
	 * </pre>
	 * @param entity 運送業者マスタ：運送業者CD・センタID
	 * @return MCarrier 運送業者マスタ
	 */
	public MCarrier getUkEntityWithDeletedCheck(MCarrier entity) {

		if (CU.isNullOrEmpty(entity.getCarrierCd())) {
			return null;
		}

		MCarrierCB cb = mCarrierBhv.newMyConditionBean();
		cb.query().setCarrierCd_Equal(entity.getCarrierCd());
		// [ON推-品向-265] センタを追加 2014.11.26 taoys Start
		cb.query().setCenterId_Equal(entity.getCenterId());
		// [ON推-品向-265] センタを追加 2014.11.26 taoys End
		return mCarrierBhv.selectEntityWithDeletedCheck(cb);
	}
}