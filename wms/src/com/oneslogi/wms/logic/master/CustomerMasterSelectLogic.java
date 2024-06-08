package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタメンテナンス取得ロジッククラス
 */
public class CustomerMasterSelectLogic extends AbstractWmsLogic {


	//===== 使用テーブル =====
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>取引先マスタデータを取得する。</h2>
	 * <pre>
	 * 取引先マスタ、荷主センタマスタからデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 取引先マスタ：荷主ID・取引先CD・取引先名称・納品先フラグ・仕入先フラグ・ワンタイムフラグ・預託先フラグ・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MCustomer> 取引先マスタリスト
	 */
	public PagingResultBean<MCustomer> selectByConditions(MCustomer header, PagingData paging,  ErrorStatus errSts) {

		PagingResultBean<MCustomer> mCustomerList = null;

		// ===== 一覧データ取得 =====

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
		// 削除フラグ無効化前の状態を保持
		boolean autoDelFlg = this.getBehaviorAutoDelFlg();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();

		//納品先フラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByDeliveryFlg();
		cb.setupSelect_BClassDtlByDeliveryFlg().withVDict(getCultureId());


		//預託先フラグ
		cb.setupSelect_BClassDtlByDepositFlg();
		cb.setupSelect_BClassDtlByDepositFlg().withVDict(getCultureId());

		///期限日逆転防止フラグ
		cb.setupSelect_BClassDtlByLimitDtReverseFlg();
		cb.setupSelect_BClassDtlByLimitDtReverseFlg().withVDict(getCultureId());

		//ワンタイムフラグ
		cb.setupSelect_BClassDtlByOnetimeFlg();
		cb.setupSelect_BClassDtlByOnetimeFlg().withVDict(getCultureId());

		//出荷停止フラグ
		cb.setupSelect_BClassDtlByShippingStopFlg();
		cb.setupSelect_BClassDtlByShippingStopFlg().withVDict(getCultureId());

		//仕入先フラグ
		cb.setupSelect_BClassDtlByVendorFlg();
		cb.setupSelect_BClassDtlByVendorFlg().withVDict(getCultureId());

        //ロット逆転防止フラグ
		cb.setupSelect_BClassDtlByLotReverseFlg();
		cb.setupSelect_BClassDtlByLotReverseFlg().withVDict(getCultureId());
		// [横並-006] 削除フラグを追加 2014.11.26 taoys Start
		//削除フラグ
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [横並-006] 削除フラグを追加 2014.11.26 taoys End
		//荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		//取引先CDの設定
		cb.query().setCustomerCd_PrefixSearch(header.getCustomerCd());

		//取引先名称の設定
		cb.query().setCustomerNm_LikeSearch(header.getCustomerNm(), new LikeSearchOption().likeContain());

		//納品先フラグの設定
		cb.query().setDeliveryFlg_Equal(header.getDeliveryFlg());

		//仕入先フラグの設定
		cb.query().setVendorFlg_Equal(header.getVendorFlg());

		//ワンタイムフラグの設定
		cb.query().setOnetimeFlg_Equal(header.getOnetimeFlg());

		//預託先フラグの設定
		cb.query().setDepositFlg_Equal(header.getDepositFlg());

		//削除フラグの設定
		cb.query().setDelFlg_Equal(header.getDelFlg());

		//ソート順の設定
		cb.query().addOrderBy_ClientId_Asc();//荷主CD
		cb.query().addOrderBy_CustomerCd_Asc();//取引先CD

		//==== 取引先マスタ検索実行 =====
		mCustomerList =selectPage(mCustomerBhv, cb, paging);

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
		// 荷主センタマスタ - センタ
		mCustomerBhv.loadMClientCenterList(mCustomerList, new ConditionBeanSetupper<MClientCenterCB>() {
			@Override
			public void setup(MClientCenterCB loadCb) {
				loadCb.setupSelect_MCenter();
			}
		});
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End

		mCustomerBhv.loadMClientList(mCustomerList,  new ConditionBeanSetupper<MClientCB>() {
			public void setup(MClientCB mClientCB) {

			}
		});

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
		// 削除フラグの条件自動付加を元に戻す
		this.setBehaviorAutoDelFlg(autoDelFlg);
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End

		// ===== ０件チェック =====
		if (mCustomerList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return mCustomerList;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
		// 社内入荷センタCD、社内入荷センタ名称、荷主取引先の設定
		for (MCustomer customer : mCustomerList) {
			long clientId = customer.getClientId();

			// 社内入荷センタの設定
			for (MClientCenter clientCenter : customer.getMClientCenterList()) {
				if (clientId == clientCenter.getClientId().longValue()) {
					customer.setCenterCd(clientCenter.chaseMCenter().getCenterCd());
					customer.setCenterNm(clientCenter.chaseMCenter().getCenterNm());
					break;
				}
			}

			// 荷主取引先の設定
			for (MClient clientCustomer : customer.getMClientList()) {
				customer.setClientCustomerCd(clientCustomer.getClientCd());
				break;
			}
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End

		return mCustomerList;

	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
	/**
	 * <h2>取引先マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから取引先マスタ、センタ取引先マスタ、荷主センタマスタからデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 取引先マスタ：取引先ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer selectById(MCustomer header, ErrorStatus errSts) {

		//===== 編集データ取得 =====

		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();

		//取引先IDの設定
		cb.query().setCustomerId_Equal(header.getCustomerId());

		//===== 検索実行 =====
		final MCustomer customer = mCustomerBhv.selectEntity(cb);

		if (customer == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);

			this.setBehaviorAutoDelFlg(beforeAutoDelFlg);
			return null;
		}

		List<MCustomer> customerList = new ArrayList<MCustomer>();
		customerList.add(customer);

		// センタ取引先マスタ
		mCustomerBhv.loadMCenterCustomerList(customerList, new ConditionBeanSetupper<MCenterCustomerCB>() {
			public void setup(MCenterCustomerCB loadCb) {
				loadCb.setupSelect_MDeliveryCourse();
				loadCb.setupSelect_MCenter();
				// [EC-CT1-127] センタIDの条件を追加 2015.03.19 kawana Start
				loadCb.query().setCenterId_Equal(getCenterClassCondition());
				// [EC-CT1-127] センタIDの条件を追加 2015.03.19 kawana End
			}
		});

		// 荷主センタマスタ - センタ
		mCustomerBhv.loadMClientCenterList(customerList, new ConditionBeanSetupper<MClientCenterCB>() {
			@Override
			public void setup(MClientCenterCB loadCb) {
				loadCb.setupSelect_MCenter();
				loadCb.query().setClientId_Equal(customer.getClientId());
			}
		});

		mCustomerBhv.loadMClientList(customerList, new ConditionBeanSetupper<MClientCB>() {
			public void setup(MClientCB loadCb) {
			}
		});

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		return customer;
	}
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
}