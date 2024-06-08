 package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタメンテナンス更新ロジッククラス
 */
public class CustomerMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientBhv mClientBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;
	//	@Inject
//	private MCustomerSubBhv mCustomerSubBhv;

	/**
	 * <h2>取引先マスタを更新する。</h2>
	 * <pre>
	 * 取引先マスタ、荷主マスタと荷主センタマスタのデータを更新する。
	 * 他の荷主センタに登録されている取引先IDをNULLで更新する。
	 * センタ取引先マスタを更新、登録、削除する。
	 * </pre>
	 * @param mCustomer 取引先マスタ：全項目
	 * @param mClient 荷主マスタ：荷主CD
	 * @param mClientCenter 荷主センタマスタ：荷主センタID
	 * @param mCenterCustomerList センタ取引先マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCustomer mCustomer, MClient mClient, MClientCenter mClientCenter, List<MCenterCustomer> mCenterCustomerList, ErrorStatus errSts) {

		List<MClient> clientResult = null;
		//取引先マスタの更新実行
	    mCustomerBhv.update(mCustomer);
	    //mCustomerSubBhv.update(mCustomer.getMCustomerSubAsOne());

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
	    // 変更前の設定
	    boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();
        //削除フラグの自動設定を無効化
      	this.setBehaviorAutoDelFlg(false);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

		//検索条件の設定
	    MClientCB cb = mClientBhv.newMyConditionBean();

	    //荷主取引先IDの設定
	    cb.query().setCustomerId_Equal(mCustomer.getCustomerId());

	    //===== 荷主マスタ検索実行 =====
	    clientResult = mClientBhv.selectList(cb);
	    boolean clientUpdateFlg = false;
        if (clientResult.size() > 0) {
			for(MClient client : clientResult){
				if (mClient != null) {
					if (!client.getClientCd().equals(mClient.getClientCd())){
						//荷主取引先IDの設定
						client.setCustomerId(null);
						//更新実行
						mClientBhv.update(client);
						clientUpdateFlg = true;
					}
				} else {
					//荷主取引先IDの設定
					client.setCustomerId(null);
					//更新実行
					mClientBhv.update(client);
				}
			}
		} else {
			clientUpdateFlg = true;
		}
        if (clientUpdateFlg && mClient != null) {
          //取引先マスタの更新実行
  	      mClientBhv.update(mClient);
        }

		// [C-CWMS-0039] センタ間移動機能を追加 2015.10.01 kawana Start

		// ===== 荷主センタの取引先をクリア =====

		// 他の荷主センタに登録されている取引先IDをnullに設定
		MClientCenterCB clientCenterCb = mClientCenterBhv.newMyConditionBean();
		clientCenterCb.checkInvalidQuery();
		clientCenterCb.query().setClientId_Equal(mCustomer.getClientId());
		clientCenterCb.query().setCustomerId_Equal(mCustomer.getCustomerId());
		// 荷主センタリスト検索
		List<MClientCenter> clientCenterList = mClientCenterBhv.selectList(clientCenterCb);

		// 登録対象の荷主センタID
		Long myClientCenterId = null;
		if (mClientCenter != null) {
			myClientCenterId = mClientCenter.getClientCenterId();
		}

		for (MClientCenter clientCenter : clientCenterList) {
			clientCenter.setCustomerId(null);
			// 登録対象以外を更新
			if (!CU.isNotNullAndEquals(clientCenter.getClientCenterId(), myClientCenterId)) {
				mClientCenterBhv.update(clientCenter);
			}
		}

		// ===== 荷主センタの取引先を登録 =====

		if (mClientCenter != null) {

			mClientCenter.setCustomerId(mCustomer.getCustomerId());
			// 荷主センタマスタの更新実行
			mClientCenterBhv.update(mClientCenter);
		}

		// ===== センタ取引マスタの登録 =====
        updateCenterCustomer(mCustomer, mCenterCustomerList);

		//削除フラグの自動設定を戻す
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.10.01 kawana End
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

	/**
	 * <h2>取引先マスタを更新する。</h2>
	 * <pre>
	 * 取引先マスタのデータを更新する。
	 * センタ取引先マスタを更新、登録、削除する。
	 * </pre>
	 * @param mCustomer 取引先マスタ：全項目
	 * @param mCenterCustomerList センタ取引先マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCustomer mCustomer, List<MCenterCustomer> mCenterCustomerList, ErrorStatus errSts) {

		//取引先マスタの更新実行
		mCustomerBhv.update(mCustomer);

		//削除フラグの自動設定を無効化
		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();
		this.setBehaviorAutoDelFlg(false);

		// センタ取引マスタ更新登録
		updateCenterCustomer(mCustomer, mCenterCustomerList);

		//削除フラグの自動設定を戻す
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);
	}

	/**
	 * センタ取引先マスタの更新登録
	 * @param mCustomer
	 * @param mCenterCustomerList
	 */
	private void updateCenterCustomer(MCustomer mCustomer, List<MCenterCustomer> mCenterCustomerList) {

		//検索条件の設定
		MCenterCustomerCB centerCustomercb = mCenterCustomerBhv.newMyConditionBean();
		centerCustomercb.query().setCustomerId_Equal(mCustomer.getCustomerId());
		// センタ取引先マスタ検索実行
		mCenterCustomerBhv.selectList(centerCustomercb);

		List<MCenterCustomer> mCenterCustomerInsertList = new ArrayList<MCenterCustomer>();
		// [ON推-品向-208] 削除フラグを追加 2014.12.1 yangc Start
		List<MCenterCustomer> mCenterCustomerUpdateList = new ArrayList<MCenterCustomer>();
		// [ON推-品向-208] 削除フラグを追加 2014.12.1 yangc End

		// [ON推-品向-394] 削除フラグを追加 2014.12.4 衛 Start
		List<MCenterCustomer> mCenterCustomerDeleteList = new ArrayList<MCenterCustomer>();

		for (MCenterCustomer centerCustomer : mCenterCustomerList) {
			if (centerCustomer.getCenterCustomerId() == null) {
				// [ON推-品向-394] アベンド修正 2014.12.5 yokosuka Start
				// if(!centerCustomer.getDeliveryCourseId().equals("")) {
				if (centerCustomer.getMDeliveryCourse().getDeliveryCourseCd() != null) {
					// [ON推-品向-394] アベンド修正 2014.12.5 yokosuka Start
					centerCustomer.setCustomerId(mCustomer.getCustomerId());
					mCenterCustomerInsertList.add(centerCustomer);
				}
			} else if (centerCustomer.getMDeliveryCourse().getDeliveryCourseCd() != null) {
				mCenterCustomerUpdateList.add(centerCustomer);
			} else if (centerCustomer.getMDeliveryCourse().getDeliveryCourseCd() == null) {
				mCenterCustomerDeleteList.add(centerCustomer);

			}
		}
		//===== センタ取引先マスタの更新実行 ====
		mCenterCustomerBhv.batchUpdate(mCenterCustomerUpdateList);
		//===== センタ取引先マスタの登録実行 ====
		mCenterCustomerBhv.batchInsert(mCenterCustomerInsertList);
		//===== センタ取引先マスタの削除実行 ====
		mCenterCustomerBhv.batchDelete(mCenterCustomerDeleteList);
		// [ON推-品向-394] 削除フラグを追加 2014.12.4 衛 End
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
}
