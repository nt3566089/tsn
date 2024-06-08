package com.oneslogi.ht.wms.logic;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.cbean.MUserLoginCB;
import com.oneslogi.base.dbflute.cbean.MWebHtInfoCB;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exbhv.MWebHtInfoBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MUserCenter;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * HTログインロジッククラス
 */
public class LoginLogic extends AbstractBase {

	@Inject
	private HandyCommonUtil util;

	@Inject
	private MWebHtInfoBhv webHtInfoBhv;

	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
	@Inject
	private BUserBhv bUserBhv;

	@Inject
	private MUserLoginBhv mUserLoginBhv;

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	@Inject
	private MUserCenterBhv mUserCenterBhv;

	@Inject
	private MUserClientBhv mUserClientBhv;
	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End
	/**
	 * <h2>クライアント情報を取得する</h2>
	 * <pre>
	 * セッションからログイン情報が取得できない場合、
	 * セッションがタイムアウトする。
	 *
	 * WEBHT管理マスタから荷主ID、センタID、倉庫IDを取得し、ログイン情報に設定する。
	 * </pre>
	 * @param ses Httpのセッション
	 */
	public void getClientData(HttpSession ses) throws Exception {

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		if (loginInfo == null) {
			//ログイン情報がないのでタイムアウト
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SESSION_TIMEOUT);
			return;
		}

		//WEBHT管理マスタから記録されている荷主コード等取得
		MWebHtInfoCB webInfoCB = webHtInfoBhv.newMyConditionBean();
		webInfoCB.query().setMacAddress_Equal(util.getMacAddress(ses));
		MWebHtInfo infoEntity = webHtInfoBhv.selectEntity(webInfoCB);

		if (infoEntity != null) {
			loginInfo.setCenterId(infoEntity.getCenterId());
			loginInfo.setClientId(infoEntity.getClientId());
			loginInfo.setWarehouseId(infoEntity.getWarehouseId());
			ses.setAttribute("loginInfo", loginInfo);
		} else {
			getErrorManager().add(new ErrorStatus(), "handyLoginAuthError");
			return;
		}

	}

	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
	/**
	 * ユーザログインマスタデータ取得
	 *
	 * @param loginInfo ログイン情報
	 * @return
	 * @throws Exception
	 */
	public MUserLogin getMUserLogin(HandyLoginUserInfo loginInfo) throws Exception{

		if(loginInfo == null){
			// ログイン情報がないのでタイムアウト
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SESSION_TIMEOUT);
			return null;
		}

		BUserCB bUserCB = bUserBhv.newMyConditionBean();
		bUserCB.query().setUserCd_Equal(loginInfo.getUserCd());
		BUser bUser = bUserBhv.selectEntity(bUserCB);

		MUserLoginCB mUserLoginCB = mUserLoginBhv.newMyConditionBean();
		mUserLoginCB.query().setUserId_Equal(bUser.getUserId());
		MUserLogin mUserLogin = mUserLoginBhv.selectEntity(mUserLoginCB);

		return mUserLogin;
	}

	/**
	 * 選択した荷主とセンタのデータが荷主センタマスタに存在チェック
	 * @param loginInfo ログイン情報
	 * @throws Exception
	 */
	public void checkClientCenterExist(HandyLoginUserInfo loginInfo, long userId) throws Exception{

		// [#2129] ログインしたユーザの荷主・センタの権限が一つも登録されていない場合全ての荷主・センタが扱えるように修正 2017.7.27 nayzaw Start
		boolean centerFlg = false;
		boolean clientFlg = false;

		if(loginInfo == null){
			// ログイン情報がないのでタイムアウト
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SESSION_TIMEOUT);
			return;
		}

		MClientCenterCB clientCenterCB = mClientCenterBhv.newMyConditionBean();
		clientCenterCB.query().setClientId_Equal(loginInfo.getClientId());
		clientCenterCB.query().setCenterId_Equal(loginInfo.getCenterId());
		MClientCenter mClientCenter = mClientCenterBhv.selectEntity(clientCenterCB);

		if(mClientCenter == null){

			//荷主センタマスタにデータが存在しない場合、エラーとする
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_CLIENT_CENTER_AUTH_ERROR);
			return;
		}

		MUserCenterCB mUserCenterCB = mUserCenterBhv.newMyConditionBean();
		mUserCenterCB.query().setUserId_Equal(userId);
		List<MUserCenter> lstMUserCenter = mUserCenterBhv.selectList(mUserCenterCB);

		MUserClientCB mUserClientCB = mUserClientBhv.newMyConditionBean();
		mUserClientCB.query().setUserId_Equal(userId);
		List<MUserClient> lstMUserClient = mUserClientBhv.selectList(mUserClientCB);

		if(!(lstMUserCenter == null || lstMUserCenter.size() == 0)) {

			// ログインしたユーザのデータがユーザセンタマスタまたはユーザ荷主マスタに存在する場合
			for(MUserCenter mUserCenter : lstMUserCenter){
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
				if (CU.isNotNullAndEquals(mUserCenter.getCenterId(), loginInfo.getCenterId())) {
					// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End
					centerFlg = true;
				}
			}
			if(!centerFlg){
				// ユーザセンタマスタにデータが存在しない場合、エラーとする
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_LOGIN_CENTER_AUTH_ERROR);
				return;
			}
		}
		if(!(lstMUserClient == null || lstMUserClient.size() == 0)){
			for(MUserClient mUserClient : lstMUserClient){
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
				if (CU.isNotNullAndEquals(mUserClient.getClientId(), loginInfo.getClientId())) {
					// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End
					clientFlg = true;
				}
			}
			if(!clientFlg){

				// ユーザ荷主マスタにデータが存在しない場合、エラーとする
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_LOGIN_CLIENT_AUTH_ERROR);
				return;
			}
		}
		// [#2129] ログインしたユーザの荷主・センタの権限が一つも登録されていない場合全ての荷主・センタが扱えるように修正 2017.7.27 nayzaw End
	}
	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End
}
