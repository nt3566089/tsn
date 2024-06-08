package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタメンテナンス登録ロジッククラス
 */
public class CustomerMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MClientBhv mClientBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;
	//	@Inject
	//	private MCustomerSubBhv mCustomerSubBhv;
	/**
	 * <h2>取引先マスタを登録する。</h2>
	 * <pre>
	 * 取引先マスタとセンタ取引先マスタのデータを登録する。
	 * 荷主マスタと荷主センタマスタのデータを更新する。
	 * </pre>
	 * @param mCustomer 取引先マスタ：全項目
	 * @param mClient 荷主マスタ：全項目
	 * @param mClientCenter 荷主センタマスタ：全項目
	 * @param mCenterCustomerList センタ取引先マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCustomer mCustomer, MClient mClient, MClientCenter mClientCenter, List<MCenterCustomer> mCenterCustomerList, ErrorStatus errSts) {

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		// ===== 取引先マスタの登録 =====
		mCustomerBhv.insert(mCustomer);
		//mCustomer.getMCustomerSubAsOne().setSpecialAgentsFlg("1");
	    //mCustomerSubBhv.insert(mCustomer.getMCustomerSubAsOne());

		// ===== 荷主取引先登録(荷主マスタ) =====
		if (mClient != null) {

			//荷主取引先IDの設定
			mClient.setCustomerId(mCustomer.getCustomerId());
			//荷主マスタの更新実行
			mClientBhv.update(mClient);
		}

		// ===== 社内入荷センタ登録(荷主センタマスタ) =====
		if (mClientCenter != null) {

			mClientCenter.setCustomerId(mCustomer.getCustomerId());

			// 荷主センタマスタの更新実行
			mClientCenterBhv.update(mClientCenter);
		}

		// ===== センタ取引先マスタ登録 =====
		insertCenterCustomer(mCustomer, mCenterCustomerList);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

	/**
	 * <h2>取引先マスタを登録する。</h2>
	 * <pre>
	 * 取引先マスタとセンタ取引先マスタのデータを登録する。
	 * </pre>
	 * @param mCustomer 取引先マスタ：全項目
	 * @param mCenterCustomerList センタ取引先マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCustomer mCustomer, List<MCenterCustomer> mCenterCustomerList, ErrorStatus errSts) {

		// 取引先マスタの登録
		mCustomerBhv.insert(mCustomer);

		// センタ取引先マスタ登録
		insertCenterCustomer(mCustomer, mCenterCustomerList);
	}

	/**
	 * センタ取引先マスタ登録
	 * @param mCustomer
	 * @param mCenterCustomerList
	 */
	private void insertCenterCustomer(MCustomer mCustomer, List<MCenterCustomer> mCenterCustomerList) {

		List<MCenterCustomer> insertList = new ArrayList<>();

		for (MCenterCustomer centerCustomer : mCenterCustomerList) {

			//取引先IDの設定
			if (centerCustomer.getDeliveryCourseId() != null) {
				centerCustomer.setCustomerId(mCustomer.getCustomerId());
				insertList.add(centerCustomer);
				//センタ取引先マスタの登録実行
//				mCenterCustomerBhv.insert(centerCustomer);
			}
		}

		if (!insertList.isEmpty()){
			//センタ取引先マスタの登録実行
			mCenterCustomerBhv.batchInsert(insertList);
		}

	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
}
