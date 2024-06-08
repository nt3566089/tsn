package com.oneslogi.wms.logic.common;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.cbean.MUserLoginCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MUserCenter;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.util.CU;

/**
 * ユーザログインマスタ登録共通ロジッククラス
 */
public class UserLoginRegisterLogic {

	@Inject
	private MUserCenterBhv mUserCenterBhv;

	@Inject
	private MCenterBhv mCenterBhv;

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	@Inject
	private MUserLoginBhv mUserLoginBhv;

	//[Ver2.2.1][#2517] ユーザログインマスタ登録処理追加 2017.09.19 miyabe Start
	@Inject
	private MUserClientBhv mUserClientBhv;
	//[Ver2.2.1][#2517] ユーザログインマスタ登録処理追加 2017.09.19 miyabe End

	/**
	/**
	 * <h2>ユーザセンターのリストを取得する。</h2>
	 * <pre>
	 * ユーザに紐づくユーザセンタ一覧を取得する。
	 * </pre>
	 * @param userId ユーザID
	 * @param accessUserCd アクセスユーザCD
	 * @return List<Long> ユーザセンタIDリスト
	 */
	public List<Long> getUserCenterIdList(long userId, String accessUserCd) {
		//ユーザに紐づくセンタ一覧を取得
		List<Long> userCenterIdList = new ArrayList<Long>();

		MUserCenterCB mUserCenterCB = mUserCenterBhv.newMyConditionBean();
		mUserCenterCB.setupSelect_MCenter();
		mUserCenterCB.query().setUserId_Equal(userId);
		mUserCenterCB.query().setDelFlg_Equal_$0();
		mUserCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
		mUserCenterCB.specify().columnCenterId();
		mUserCenterCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
		ListResultBean<MUserCenter> mUserCenter = mUserCenterBhv.selectList(mUserCenterCB); //Query実行

		for (MUserCenter o : mUserCenter) {
			userCenterIdList.add(o.getCenterId());
		}

		if (userCenterIdList.size() == 0) {
			MCenterCB mCenterCB = mCenterBhv.newMyConditionBean();
			mCenterCB.query().setDelFlg_Equal_$0();
			mCenterCB.specify().columnCenterId();
			mCenterCB.query().addOrderBy_CenterCd_Asc();
			ListResultBean<MCenter> mCenter = mCenterBhv.selectList(mCenterCB); //Query実行

			for (MCenter o : mCenter) {
				userCenterIdList.add(o.getCenterId());
			}
		}

		return userCenterIdList;
	}

	/**
	 * <h2>ユーザログインマスタを登録する。</h2>
	 * <pre>
	 * 引数を条件にユーザログインマスタに登録する。
	 * 引数のユーザセンタIDリストがNULLの場合、例外をスローする。
	 * </pre>
	 * @param userCenterIdList ユーザセンタIDリスト
	 * @param userId ユーザID
	 * @param accessUserCd アクセスユーザCD
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin insert(List<Long> userCenterIdList, long userId, String accessUserCd) {
		MClientCenterCB mClientCenterCB = mClientCenterBhv.newMyConditionBean();
		mClientCenterCB.query().setDelFlg_Equal_$0();
		mClientCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
		mClientCenterCB.query().queryMClient().setDelFlg_Equal_$0();
		mClientCenterCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
		mClientCenterCB.query().queryMClient().addOrderBy_ClientCd_Asc();
		List<MClientCenter> mClientCenterList = mClientCenterBhv.selectList(mClientCenterCB);

		MUserLogin mUserLogin = mUserLoginBhv.newMyEntity();
		mUserLogin.setUserId(userId);

		//[Ver2.2.1][#2517] ユーザログインマスタ登録処理追加 2017.09.19 miyabe Start
		if (mClientCenterList != null && mClientCenterList.size() > 0) {
			MUserCenterCB mUserCenterCB = mUserCenterBhv.newMyConditionBean();
			mUserCenterCB.query().setDelFlg_Equal_$0();
			mUserCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
			mUserCenterCB.query().setUserId_Equal(userId);
			mUserCenterCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
			List <MUserCenter> mUserCenterList = mUserCenterBhv.selectList(mUserCenterCB);

			MUserClientCB mUserClientCB = mUserClientBhv.newMyConditionBean();
			mUserClientCB.query().setDelFlg_Equal_$0();
			mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();
			mUserClientCB.query().setUserId_Equal(userId);
			mUserClientCB.query().queryMClient().addOrderBy_ClientCd_Asc();
			List <MUserClient> mUserClientList = mUserClientBhv.selectList(mUserClientCB);

			//ログインユーザがセンタ、荷主両方について全権限保有
			if(mUserCenterList.size() == 0 && mUserClientList.size() == 0){
				mUserLogin.setCenterId(mClientCenterList.get(0).getCenterId());
				mUserLogin.setClientId(mClientCenterList.get(0).getClientId());
			//ログインユーザがセンタについて全権限、荷主について一部権限保有
			} else if(mUserCenterList.size() == 0 && mUserClientList.size() != 0) {
				boolean authFlg = false;
				for (MClientCenter mClientCenter : mClientCenterList) {
					for (MUserClient mUserClient : mUserClientList) {
						// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
						if (CU.isNotNullAndEquals(mClientCenter.getClientId(), mUserClient.getClientId())) {
							// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

							mUserLogin.setCenterId(mClientCenter.getCenterId());
							mUserLogin.setClientId(mClientCenter.getClientId());
							authFlg = true;
							break;
						}
					}
					if(authFlg == true){
						break;
					}
				}
			//ログインユーザがセンタについて一部権限、荷主について全権限保有
			} else if (mUserCenterList.size() != 0 && mUserClientList.size() == 0) {
				boolean authFlg = false;
				for (MClientCenter mClientCenter : mClientCenterList) {
					for(MUserCenter mUserCenter : mUserCenterList){
						// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
						if (CU.isNotNullAndEquals(mClientCenter.getCenterId(), mUserCenter.getCenterId())) {
							// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

							mUserLogin.setCenterId(mClientCenter.getCenterId());
							mUserLogin.setClientId(mClientCenter.getClientId());
							authFlg = true;
							break;
						}
					}
					if(authFlg == true){
						break;
					}
				}
			//ログインユーザがセンタ、荷主について一部権限保有
			} else {
				boolean authFlg = false;
				for (MClientCenter mClientCenter : mClientCenterList) {
					for(MUserCenter mUserCenter : mUserCenterList){
						// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
						if (CU.isNotNullAndEquals(mClientCenter.getCenterId(), mUserCenter.getCenterId())) {
							// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

							for (MUserClient mUserClient : mUserClientList) {
								// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
								if (CU.isNotNullAndEquals(mClientCenter.getClientId(), mUserClient.getClientId())) {
									// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

									mUserLogin.setCenterId(mClientCenter.getCenterId());
									mUserLogin.setClientId(mClientCenter.getClientId());
									authFlg = true;
									break;
								}
							}
						}
						if(authFlg == true){
							break;
						}
					}
					if(authFlg == true){
						break;
					}
				}
			}
		} else {
			throw new RuntimeException("Center is not found.");
		}

		//[Ver2.2.1][#2517] ユーザログインマスタ登録処理追加 2017.09.19 miyabe End

		if (AccessContext.isExistAccessContextOnThread()) {
			AccessContext context = AccessContext.getAccessContextOnThread();
			context.setAccessUser(accessUserCd);
			AccessContext.setAccessContextOnThread(context);
		}

		mUserLoginBhv.insert(mUserLogin);

		return mUserLogin;
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * 引数をキーにユーザログインマスタからデータを取得する。
	 * </pre>
	 * @param userId ユーザID
	 * @return MUserLogin ユーザログインマスタ
	 */
	public MUserLogin getMUserLogin(long userId) {
		//[Ver2.2.1][#2517] 荷主センタマスタの存在有無チェック対応のためconditionBean追加 2017.10.05 miyabe Start
		MUserLoginCB mUserLoginCB = mUserLoginBhv.newMyConditionBean();
		mUserLoginCB.setupSelect_MCenter();
		mUserLoginCB.setupSelect_MClient();
		mUserLoginCB.query().setUserId_Equal(userId);
		return mUserLoginBhv.selectEntity(mUserLoginCB);
		//[Ver2.2.1][#2517] 荷主センタマスタの存在有無チェック対応のためsetup_select追加 2017.10.05 miyabe End
	}

	/**
	 * <h2>ユーザセンタマスタを取得する。</h2>
	 * <pre>
	 * ユーザセンタマスタからデータを取得する。
	 * </pre>
	 * @return MUserCenterBhv ユーザセンタマスタ
	 */
	public MUserCenterBhv getMUserCenterBhv() {
		return mUserCenterBhv;
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * センタマスタからデータを取得する。
	 * </pre>
	 * @return MCenterBhv センタマスタ
	 */
	public MCenterBhv getMCenterBhv() {
		return mCenterBhv;
	}

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * 荷主センタマスタからデータを取得する。
	 * </pre>
	 * @return MClientCenterBhv 荷主センタマスタ
	 */
	public MClientCenterBhv getMClientCenterBhv() {
		return mClientCenterBhv;
	}

	/**
	 * <h2>ユーザログインマスタを取得する。</h2>
	 * <pre>
	 * ユーザログインマスタからデータを取得する。
	 * </pre>
	 * @return MUserLoginBhv ユーザログインマスタ
	 */
	public MUserLoginBhv getMUserLoginBhv() {
		return mUserLoginBhv;
	}
}
