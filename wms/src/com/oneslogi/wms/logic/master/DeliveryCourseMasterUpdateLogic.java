package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配送コースマスタメンテナンス更新ロジッククラス
 */
public class DeliveryCourseMasterUpdateLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;
	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;

	/**
	 * <h2>配送コースマスタを更新する。</h2>
	 * <pre>
	 * 配送コースマスタを更新し、
	 * センタ取引先マスタのデータを一括更新・登録・削除する。
	 * </pre>
	 * @param mDeliveryCourse 配送コースマスタ：全項目
	 * @param mCenterCustomer センタ取引先マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MDeliveryCourse mDeliveryCourse, List<MCenterCustomer> mCenterCustomer, ErrorStatus errSts) {

		List<MCenterCustomer> mCenterCustomerInsertList = new ArrayList<MCenterCustomer>();
		// [#4626] 更新、削除リストの設定削除 fujiwara 2018.05.23 Del
		//===== 配送コースマスタの更新実行 ====
		mDeliveryCourseBhv.update(mDeliveryCourse);

		// [#4626] 取引先配送コース設定時、既に配送コースが設定されている場合、配送コース上書き fujiwara 2018.06.04 Start
		List<Long> customerIdList = new LinkedList<>();
		for(MCenterCustomer centerCustomer : mCenterCustomer) {
			customerIdList.add(centerCustomer.getCustomerId());

			// 削除フラグが"1"の時、データ追加処理を行わない。削除フラグが"1"以外の場合はデータ追加処理を行う。
			if (centerCustomer.isDelFlg$1()) {
				continue;
			}
			mCenterCustomerInsertList.add(centerCustomer);
		}
		// [#5163][v3.1] 明細0件で登録時に致命的エラー発生 2018.07.30 kawana Start
		if (!customerIdList.isEmpty()) {
			MCenterCustomerCB cb = mCenterCustomerBhv.newMyConditionBean();
			cb.checkInvalidQuery();
			cb.query().setCustomerId_InScope(customerIdList);
			cb.query().setCenterId_Equal(mDeliveryCourse.getCenterId());
			mCenterCustomerBhv.queryDelete(cb);
		}
		// [#5163][v3.1] 明細0件で登録時に致命的エラー発生 2018.07.30 kawana End
		// [#4626] 取引先配送コース設定時、既に配送コースが設定されている場合、配送コース上書き fujiwara 2018.06.04 End

		// [#4626] センタ取引先マスタ更新実行処理削除 fujiwara 2018.05.23 Del

		//===== センタ取引先マスタの登録実行 ====
		mCenterCustomerBhv.batchInsert(mCenterCustomerInsertList);

		// [#4626] センタ取引先マスタ削除実行処理削除 fujiwara 2018.05.23 Del
	}
}
