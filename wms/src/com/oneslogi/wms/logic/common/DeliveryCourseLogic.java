package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配送コースマスタ共通ロジッククラス
 */
public class DeliveryCourseLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MDeliveryCourseBhv deliveryCourseBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>登録時配送コースCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・配送コースCD重複チェック
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID
	 * @return boolean (true:配送コースCD重複)
	 */
	public boolean checkDeliveryCourseCdInsert(MDeliveryCourse deliveryCourse) {
		boolean result = false;
		result = checkDeliveryCourseCdInsert(deliveryCourse, null);
		return result;
	}

	/**
	 * <h2>登録時配送コースCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に配送コースマスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:配送コースCD重複)
	 */
	public boolean checkDeliveryCourseCdInsert(MDeliveryCourse deliveryCourse, ErrorStatus errSts) {

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MDeliveryCourseCB cb = deliveryCourseBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setDeliveryCourseCd_Equal(deliveryCourse.getDeliveryCourseCd());
		cb.query().setCenterId_Equal(deliveryCourse.getCenterId());
		int count = deliveryCourseBhv.selectCount(cb);

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End


		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時配送コースマスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・配送コースCD重複チェック
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID・配送コースID
	 * @return boolean (true:配送コースマスタ重複)
	 */
	public boolean checkDeliveryCourseCdUpdate(MDeliveryCourse deliveryCourse) {
		boolean result = false;
		result = checkDeliveryCourseCdUpdate(deliveryCourse, null);
		return result;
	}

	/**
	 * <h2>更新時配送コースマスタCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に配送コースマスタのデータを検索し、
	 * 検索対象が存在する場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID・配送コースID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:配送コースCD重複)
	 */
	public boolean checkDeliveryCourseCdUpdate(MDeliveryCourse deliveryCourse, ErrorStatus errSts) {
		MDeliveryCourseCB cb = deliveryCourseBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setDeliveryCourseCd_Equal(deliveryCourse.getDeliveryCourseCd());
		cb.query().setCenterId_Equal(deliveryCourse.getCenterId());
		MDeliveryCourse mDeliveryCourse = deliveryCourseBhv.selectEntity(cb);

		// [ON推-品向-722] IDの比較間違いを修正 2015.04.14 kawana Start
		if (mDeliveryCourse != null && (mDeliveryCourse.getDeliveryCourseId().longValue() != deliveryCourse.getDeliveryCourseId().longValue())) {
			// [ON推-品向-722] IDの比較間違いを修正 2015.04.14 kawana End
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>配送コースマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に配送コースマスタデータを取得する。
	 * </pre>
	 * @param entity 配送コースマスタ：配送コースID
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getPkEntity(MDeliveryCourse entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>配送コースマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に配送コースマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getPkEntity(MDeliveryCourse deliveryCourse, ErrorStatus errSts) {
		MDeliveryCourse resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(deliveryCourse);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_IN_COURSE_MASTER_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>配送コースマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に配送コースマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースID
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getPkEntityWithDeletedCheck(MDeliveryCourse deliveryCourse) {
		if (deliveryCourse.getDeliveryCourseId() == null) {
			return null;
		}
		return deliveryCourseBhv.selectByPKValueWithDeletedCheck(deliveryCourse.getDeliveryCourseId());
	}

	/**
	 * <h2>配送コースマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に配送コースマスタデータを取得する。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getUkEntity(MDeliveryCourse deliveryCourse) {
		return getUkEntity(deliveryCourse, null);
	}

	/**
	 * <h2>配送コースマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に配送コースマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getUkEntity(MDeliveryCourse deliveryCourse, ErrorStatus errSts) {
		MDeliveryCourse resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(deliveryCourse);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_IN_COURSE_MASTER_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>配送コースマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に配送コースマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：配送コースCD・センタID
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getUkEntityWithDeletedCheck(MDeliveryCourse deliveryCourse) {
		if (deliveryCourse.getCenterId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(deliveryCourse.getDeliveryCourseCd())) {
			return null;
		}

		MDeliveryCourseCB cb = deliveryCourseBhv.newMyConditionBean();
		cb.query().setDeliveryCourseCd_Equal(deliveryCourse.getDeliveryCourseCd());
		cb.query().setCenterId_Equal(deliveryCourse.getCenterId());
		return deliveryCourseBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>取引先を条件に配送コースマスタを取得する。</h2>
	 * <pre>
	 * 引数をキーに配送コースマスタからデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 * </pre>
	 * @param mCustomer 取引先マスタ：取引先ID
	 * @param centerId センタID
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getDeliveryCourseByCustomerId(MCustomer mCustomer,final Long centerId) {
		if (mCustomer.getCustomerId() == null) {
			return null;
		}
		if (centerId == null) {
			return null;
		}

		List<MCustomer> mCustomerList = null;

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();

		//取引先IDの設定
		cb.query().setCustomerId_Equal(mCustomer.getCustomerId());

		//===== 検索実行 =====
		mCustomerList = mCustomerBhv.selectList(cb);

		mCustomerBhv.loadMCenterCustomerList(mCustomerList, new ConditionBeanSetupper<MCenterCustomerCB>() {
			public void setup(MCenterCustomerCB mCenterCustomerCB) {
				mCenterCustomerCB.setupSelect_MDeliveryCourse();
				mCenterCustomerCB.setupSelect_MCenter();
				mCenterCustomerCB.query().setCenterId_Equal(centerId);
			}
		});

		//===== ０件チェック =====
		if (mCustomerList.size() == 1) {
			if (mCustomerList.get(0).getMCenterCustomerList().size() == 1) {
				return mCustomerList.get(0).getMCenterCustomerList().get(0).getMDeliveryCourse();
			}
		}

		return null;
	}

	/**
	 * <h2>配送コースデータの検索を行う。</h2>
	 * <pre>
	 * 引数を条件に配送コースマスタのデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param deliveryCourse 配送コースマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MDeliveryCourse 配送コースマスタ
	 */
	public MDeliveryCourse getDeliveryCourse(MDeliveryCourse deliveryCourse, ErrorStatus errSts) {
		MDeliveryCourse resultEntity = null;
		MDeliveryCourseCB cb = deliveryCourseBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setDeliveryCourseCd_Equal(deliveryCourse.getDeliveryCourseCd());
		cb.query().setCenterId_Equal(deliveryCourse.getCenterId());

		try {
			resultEntity = getUkEntityWithDeletedCheck(deliveryCourse);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_NOT_FOUND_IN_COURSE_MASTER_ERROR);
		}
		return resultEntity;
	}
}