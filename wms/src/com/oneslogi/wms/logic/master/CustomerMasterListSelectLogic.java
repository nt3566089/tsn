package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.BProperty;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.PropertyLogic;

/**
 * 取引先マスタメンテナンス取得ロジッククラス
 */
public class CustomerMasterListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MCenterBhv mCenterBhv;
	// ===== 使用ロジッククラス =====
	@Inject
	private  PropertyLogic propertyLogic;
	// ===== 定数定義 =====
	public static final String PROPERTY_NM = "allowQueryCount";

	/**
	 * <h2>取引先マスタと取引先マスタサブデータを取得する。</h2>
	 * <pre>
	 * 取引先マスタ、取引先マスタサブデータからデータを取得する。
	 * 検索条件から取引先マスタをリスト検索、レコード数を取得する。
	 * ０件、１万件でエラー判定。
	 * </pre>
	 * @param header 取引先マスタ：荷主ID・取引先CD・取引先CD2・検索名称・市場区分・削除フラグ・特約店フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void selectCount(MCustomer header, ErrorStatus errSts) {

		//一覧(3)検索実行
		//一覧(A)検索条件から取引先マスタをリスト検索、レコード数を取得する。追加
		// ===== 一覧データ取得 =====

		// 削除フラグ無効化前の状態を保持
		boolean autoDelFlg = this.getBehaviorAutoDelFlg();
		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//MCustomerSubと結合
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		//cb.setupSelect_MCustomerSubAsOne();

		//検索条件
		//荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		//取引先CDの設定
		cb.query().setCustomerCd_PrefixSearch(header.getCustomerCd());

//		//特約店CD2の設定
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_PrefixSearch(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//
//		//検索名称の設定
//		cb.query().queryMCustomerSubAsOne().setAName_PrefixSearch(header.getMCustomerSubAsOne().getAName());
//
//		//市場区分
//		cb.query().queryMCustomerSubAsOne().setMarketType_Equal(header.getMCustomerSubAsOne().getMarketType());
//
//		//削除フラグの設定
//		cb.query().setDelFlg_Equal(header.getDelFlg());
//
//		//特約店フラグ
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");

		//COUNT(*)
		int count = mCustomerBhv.selectCount(cb);

		// 削除フラグの条件自動付加を元に戻す
		this.setBehaviorAutoDelFlg(autoDelFlg);

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		//レコード数 == 0
		if (count == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			//return;
		}

		//レコード数がプロパティマスタで設定された値を超過。
		 BProperty property = new BProperty();
		 property.setPropertyNm(PROPERTY_NM);
		 property = propertyLogic.getUkEntityWithDeletedCheck(property);

		 int PropertyNm = Integer.valueOf(property.getPropertyValue());

		 if (count > PropertyNm){
			this.getErrorManager().add(errSts, WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(PropertyNm));
			 return ;
		 }

		return;
	}

	/**
	 * <h2>取引先マスタデータを取得する。</h2>
	 * <pre>
	 * 取引先マスタ、取引先マスタサブ、荷主マスタ、
	 * 区分値マスタ、区分値明細マスタ、辞書マスタからデータを取得する。
	//	 * 対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * 検索結果リストに変換して返却する。
	 * </pre>
	 * @param header 取引先マスタ：荷主ID・取引先CD・取引先名称・納品先フラグ・仕入先フラグ・ワンタイムフラグ・預託先フラグ・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MCustomer> 取引先マスタリスト
	 */

	public PagingResultBean<MCustomer> selectByConditions(MCustomer header, PagingData paging, ErrorStatus errSts) {

		//一覧(3)検索実行
		//一覧(C)検索条件から取引先マスタをリスト検索、取引先マスタリストを取得する。

		PagingResultBean<MCustomer> mCustomerList = null;

		// ===== 一覧データ取得 =====

		// 削除フラグ無効化前の状態を保持
		boolean autoDelFlg = this.getBehaviorAutoDelFlg();
		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();

	/*		[TSN]下記フラグが利用されていないため、コメントアウト yamamoto start
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
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	*///	[TSN]下記フラグが利用されていないため、コメントアウト yamamoto end

		//結合条件 取引先マスタ、取引先マスタサブ、荷主マスタ
//		cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ
//		cb.setupSelect_MClient(); //荷主マスタ
//
//		//結合条件 市場区分：区分値マスタ、区分値明細マスタ、辞書マスタ
//		cb.setupSelect_MCustomerSubAsOne().withBClassDtlByMarketType();
//		cb.setupSelect_MCustomerSubAsOne().withBClassDtlByMarketType().withVDict(getCultureId());

		//結合条件 削除フラグ：区分値マスタ、区分値明細マスタ、辞書マスタ
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());

		//検索条件 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		//検索条件 取引先CDの設定
		cb.query().setCustomerCd_PrefixSearch(header.getCustomerCd());

	/*		[TSN]下記フラグが利用されていないため、コメントアウト yamamoto start
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
			[TSN]下記フラグが利用されていないため、コメントアウト yamamoto end*/

//		//検索条件 特約店CD2の設定
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_PrefixSearch(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//
//		//検索条件 検索名称の設定
//		cb.query().queryMCustomerSubAsOne().setAName_PrefixSearch(header.getMCustomerSubAsOne().getAName());
//
//		//検索条件 市場区分
//		cb.query().queryMCustomerSubAsOne().setMarketType_Equal(header.getMCustomerSubAsOne().getMarketType());
//
//		//検索条件 削除フラグの設定
//		cb.query().setDelFlg_Equal(header.getDelFlg());
//
//		//検索条件 特約店フラグ
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");
//
//		// ソート順の設定
//		//[TSN]荷主でソートしてないためコメントアウト yamamoto
//		//cb.query().addOrderBy_ClientId_Asc();//荷主CD
//		cb.query().queryMCustomerSubAsOne().addOrderBy_ShowPriority_Asc();
//		cb.query().addOrderBy_CustomerCd_Asc();
//		cb.query().queryMCustomerSubAsOne().addOrderBy_SpecialAgentsCd2_Asc();

		//==== 取引先マスタ検索実行 =====
		mCustomerList = selectPage(mCustomerBhv, cb, paging);

	/*	[TSN] センタ間移動機能がないためコメントアウト yamamoto start
			 [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
			 荷主センタマスタ - センタ
			mCustomerBhv.loadMClientCenterList(mCustomerList, new ConditionBeanSetupper<MClientCenterCB>() {
				@Override
				public void setup(MClientCenterCB loadCb) {
					loadCb.setupSelect_MCenter();
				}
			});
			 [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End
			mCustomerBhv.loadMClientList(mCustomerList,  new ConditionBeanSetupper<MClientCB>() {
			public void setup(MClientCB mClientCB) {
				}
			});
		[TSN] センタ間移動機能がないためコメントアウト yamamoto end
			*/


		//(D)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		//レコード数 == 0
		if (mCustomerList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		/*		[TSN]下記使用されていないためコメントアウト yamamoto start
				 [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
				 社内入荷センタCD、社内入荷センタ名称、荷主取引先の設定
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
				 [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End
				[TSN]下記使用されていないためコメントアウト yamamoto end
		*/
		// 削除フラグの条件自動付加を元に戻す
		this.setBehaviorAutoDelFlg(autoDelFlg);

		return mCustomerList;

	}

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

		//編集(2)検索実行
		//編集(A)引継項目から取引先マスタを単一検索、取引先マスタを取得する。

		//===== 編集データ取得 =====

		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();

////		//取引先マスタ、取引先マスタサブ、荷主マスタ
////		cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ
////		cb.setupSelect_MClient(); //荷主マスタ
////
////		//市場区分：区分値マスタ、区分値明細マスタ、辞書マスタ
////		cb.setupSelect_MCustomerSubAsOne().withBClassDtlByMarketType();
////		cb.setupSelect_MCustomerSubAsOne().withBClassDtlByMarketType().withVDict(getCultureId());
//
//		//削除フラグ：区分値マスタ、区分値明細マスタ、辞書マスタ
//		cb.setupSelect_BClassDtlByDelFlg();
//		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
//
//		//検索条件 荷主IDの設定
//		cb.query().setClientId_Equal(header.getClientId());
//
//		//検索条件 取引先IDの設定
//		cb.query().setCustomerId_Equal(header.getCustomerId());
//
//		//検索条件 特約店フラグ
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");

		//===== 検索実行 =====
		final MCustomer customer = mCustomerBhv.selectEntity(cb);

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		if (customer == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);

			this.setBehaviorAutoDelFlg(beforeAutoDelFlg);
			return null;
		}

		List<MCustomer> customerList = new ArrayList<MCustomer>();
		customerList.add(customer);


		/* [TSN]下記使用されていないためコメントアウト yamamoto start
		 * センタ取引先マスタ
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
			[TSN]下記使用されていないためコメントアウト yamamoto end
			*/

		mCustomerBhv.loadMClientList(customerList, new ConditionBeanSetupper<MClientCB>() {
			public void setup(MClientCB loadCb) {
			}
		});

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		return customer;
	}

	/**
	 * <h2>センタマスタリストデータ取得</h2>
	 * <pre>
	 * データベースからセンタマスタデータを取得する

	 *
	 * 戻り値には次のテーブル取得結果が設定される。
	 * 【データ取得テーブル】
	 * ・センタマスタ
	 *
	 * </pre>
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<MCenter> センタマスタリスト
	 */
	public List<MCenter> selectMCenterList(ErrorStatus errSts) {

		List<MCenter> result = null;

		MCenterCB cb = mCenterBhv.newMyConditionBean();
		cb.query().addOrderBy_CenterCd_Asc();

		result = mCenterBhv.selectList(cb);

		// データ存在チェック
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	//(A)1.2.(1)(A)で取得した取引先マスタENTITY.取引先IDがNULLの場合
	//(a)検索条件から取引先マスタをリスト検索、取引先マスタリストを取得する

	public MCustomer selectByEdit(MCustomer header, ErrorStatus errSts ) {

		//結合
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
//		cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ
//
//		//検索条件
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");
//		cb.orScopeQuery(new OrQuery<MCustomerCB>() {
//		  public void query(MCustomerCB orCB) {
//		    orCB.query().setCustomerCd_Equal(header.getCustomerCd());
//			orCB.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_Equal(header.getCustomerCd());
//			orCB.query().setCustomerCd_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//			orCB.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//		  }
//		 });

		//===== 検索実行 =====
		MCustomer result = mCustomerBhv.selectEntity(cb);


		return result;
	}


	//(B)1.2.(1)(A)で取得した取引先マスタENTITY.取引先IDがNULL以外の場合
	//(a)検索条件から取引先マスタを単一検索、取引先マスタを取得する。

	public MCustomer selectByEditNotNull(MCustomer header, ErrorStatus errSts) {

		MCustomer mCustomerListNotNull = null;

		//結合
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		//cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ

		//検索条件
		cb.query().setCustomerCd_Equal(header.getCustomerCd());
		//cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");

		//===== 検索実行 =====
		mCustomerListNotNull = mCustomerBhv.selectEntity(cb);

		return mCustomerListNotNull;
	}

	//	(c)入力.特約店CD2が入力されている場合
	//	(I)検索条件から取引先マスタをリスト検索、取引先マスタリストを取得する。
	public MCustomer selectByspecialAgentsCd2(MCustomer header, ErrorStatus errSts) {

		//結合
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
//		cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ
//
//		//検索条件
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");
//		cb.orScopeQuery(new OrQuery<MCustomerCB>() {
//			  public void query(MCustomerCB orCB) {
//			    orCB.query().setCustomerCd_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//				orCB.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//			  }
//			 });

		//===== 検索実行 =====
		MCustomer result = mCustomerBhv.selectEntity(cb);

		return result;
	}


	//	(C)重複チェック
	//	(a)入力項目から取引先マスタをリスト検索、取引先マスタリストを取得する。
	public MCustomer selectByCheck(MCustomer header, ErrorStatus errSts ) {

		//結合
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		//cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ

//		//検索条件
//		cb.query().queryMClient().setClientCd_Equal(header.getClientCd());//?
//		cb.orScopeQuery(new OrQuery<MCustomerCB>() {
//		  public void query(MCustomerCB orCB) {
//		    orCB.query().setCustomerCd_Equal(header.getCustomerCd());
//			orCB.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_Equal(header.getCustomerCd());
//			orCB.query().setCustomerCd_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//			orCB.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//		  }
//		 });
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");

		//===== 検索実行 =====
		MCustomer result = mCustomerBhv.selectEntity(cb);


		return result;
	}


	//(C)重複チェック (2)引数.モードがSCREEN_MODE.Updateの場合
	//(a)入力.特約店CD2が入力されている場合
	//(I)検索条件から取引先マスタをリスト検索、取引先マスタリストを取得する。

	public MCustomer selectByCheckUpdate(MCustomer header, ErrorStatus errSts ) {

		//結合
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
//		cb.setupSelect_MCustomerSubAsOne();//取引先マスタサブ
//
//		//検索条件
//		cb.query().queryMClient().setClientCd_Equal(header.getClientCd());
//		cb.orScopeQuery(new OrQuery<MCustomerCB>() {
//		  public void query(MCustomerCB orCB) {
//		    orCB.query().setCustomerCd_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//			orCB.query().queryMCustomerSubAsOne().setSpecialAgentsCd2_Equal(header.getMCustomerSubAsOne().getSpecialAgentsCd2());
//		  }
//		 });
//		cb.query().queryMCustomerSubAsOne().setSpecialAgentsFlg_Equal("1");

		//===== 検索実行 =====
		MCustomer result = mCustomerBhv.selectEntity(cb);


		return result;
	}

}