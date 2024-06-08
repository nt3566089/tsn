package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;

/**
 * 配送コースマスタメンテナンス登録ロジッククラス
 */
public class DeliveryCourseMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;
	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;

	/**
	 * <h2>配送コースマスタを登録する。</h2>
	 * <pre>
	 * 配送コースマスタのデータを登録する。
	 * センタ取引先マスタのデータを削除、登録する。
	 * </pre>
	 * @param mDeliveryCourse 配送コースマスタ：全項目
	 * @param mCenterCustomer センタ取引先マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MDeliveryCourse mDeliveryCourse, List<MCenterCustomer> mCenterCustomer, ErrorStatus errSts) {

		//配送コースマスタに存在チェック
		MDeliveryCourse deliveryCourse = new MDeliveryCourse();

		//センタIDの設定
		deliveryCourse.setCenterId(mDeliveryCourse.getCenterId());

		//配送コースCDの設定
		deliveryCourse.setDeliveryCourseCd(mDeliveryCourse.getDeliveryCourseCd());

		deliveryCourse = deliveryCourseLogic.getUkEntity(deliveryCourse);

		if (deliveryCourse != null) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}
		// ===== 配送コースマスタ登録実行 ====
		mDeliveryCourseBhv.insert(mDeliveryCourse);

		for (MCenterCustomer centerCustomer : mCenterCustomer) {

			centerCustomer.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
			//===== センタ取引先マスタの削除実行 ====
			MCenterCustomerCB cb = mCenterCustomerBhv.newMyConditionBean();

			//センタIDの設定
			cb.query().setCenterId_Equal(mDeliveryCourse.getCenterId());
			//取引先IDの設定
			cb.query().setCustomerId_Equal(centerCustomer.getCustomerId());

			mCenterCustomerBhv.queryDelete(cb);
		}

		// ===== センタ取引先マスタ登録実行 ====
		mCenterCustomerBhv.batchInsert(mCenterCustomer);

	}

}