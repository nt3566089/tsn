package com.oneslogi.ht.wms.resources;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.BaseContext;
import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.cookie.SessionData;
import com.oneslogi.base.cookie.SessionDataImpl;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MWebHtInfoCB;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exbhv.MWebHtInfoBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.dbflute.exentity.THtComctl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.master.SystemLogic;
import com.oneslogi.base.resources.AuthenticationBaseResource;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.AuthenticationHandy;
import com.oneslogi.ht.base.cdi.annotation.AuthenticationHandy.Mode;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.dto.HandyLoginDto;
import com.oneslogi.ht.base.dto.HandyMenuDto;
import com.oneslogi.ht.base.resources.HandyLoginResourceBase;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.logic.LoginLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * ログイン画面Resourceクラスです。
 * @author hi.watanabe.mp
 *
 */
//[#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add Start
@CheckBase(CheckMode.TYPE_NOT_CHECK)
//[#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add End
@HandyErrorReturnPath(returnURL = "initLogin")
@Path("/handy")
public class HandyLoginResource extends HandyLoginResourceBase {

	// 認証モード
	public static String authMode;

	static {
		Properties properties = new Properties();
		InputStream is = AuthenticationBaseResource.class.getClassLoader().getResourceAsStream("login.properties");

		try {
			properties.load(is);
			is.close();

			authMode = properties.getProperty("authMode");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private HandyCommonUtil util;
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.17 kawana Start
	@Inject
	private HandyScreenUtil screenUtil;
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.17 kawana End
	@Inject
	private MWebHtInfoBhv webHtInfoBhv;
	@Inject
	private LoginLogic loginLogic;
	// [#3270] センタ別ロケール対応 2018.01.11 kawana Start
	@Inject
	private SystemLogic systemLogic;
	// [#3270] センタ別ロケール対応 2018.01.11 kawana End
	@Inject
	private BUserBhv bUserBhv;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
	//[ON推]HT OCR文字認識の対応 2016.07.04 chou Add Start
	@Inject
	private ParamLogic paramLogic;
	//[ON推]HT OCR文字認識の対応 2016.07.04 chou Add End
	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
	@Inject
	private MUserLoginBhv mUserLoginBhv;
	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End


	/**
	 * 初期表示
	 * @throws Exception
	 */
	@Override
	@AuthenticationHandy(Mode.OFF)
	@CheckBase(CheckMode.TYPE_NOT_CHECK)
	@GET
	public void splash() {
		// 条件を満たした場合のみ自動ログイン処理
		if (CU.equals(authMode, "4")) {
			String userCd = getHttpServletRequest().getParameter("_du");
			if (!CU.isNullOrEmpty(userCd)) {
				try {
					// ログイン処理（共通）
					authCommon(userCd);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
				return;
			}
		}
		super.splash();
	}

	/**
	 * ログイン画面初期処理
	 * @throws Exception
	 */
	@Override
	@AuthenticationHandy(Mode.OFF)
	@CheckBase(CheckMode.TYPE_NOT_CHECK)
	@GET
	@Path("/initLogin")
	public void initLogin() throws Exception {
		if (CU.equals(authMode, "4")) {
			return;
		}
		super.initLogin();
	}

	/**
	 * ログイン処理
	 * @param bean
	 * @throws Exception
	 */
	@Override
	@AuthenticationHandy(Mode.OFF)
	@CheckBase(CheckMode.TYPE_NOT_CHECK)
	@GET
	@Path("/login")
	public void login(@BeanParam HandyLoginDto bean) throws Exception {
		super.login(bean);
	}

	/**
	 * 荷主判定を行い、荷主選択画面を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/loginClientInfo")
	public void loginWithClientInfo() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		if (((HandyLoginUserInfo) ses.getAttribute("loginInfo")) == null ||
				((HandyLoginUserInfo) ses.getAttribute("loginInfo")).getClientCd() == null ||
				((HandyLoginUserInfo) ses.getAttribute("loginInfo")).getClientCd().trim().length() <= 0) {
			loginLogic.getClientData(ses);
		}

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana Start

		// 画面初期設定
		initScreen("LoginClientHT");

		// オプション１ボタン設定
		//[Ver3.0][#3998]項目名変更に伴い修正 2018.04.10 miyabe upd Start
		setOptionButton1(ButtonInfo.builder().url("selectClientCd?returnURI=loginClientInfo").itemCd("clientCd").build());
		//[Ver3.0][#3998]項目名変更に伴い修正 2018.04.10 miyabe upd End
		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url("initLogin").itemCd("return").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().url("getMenuPage").itemCd("advance").build());

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana End

		util.setTransURL(HT_URI_BASE + "/common/HandyLoginClient.jsp", ses);
	}

	/**
	 * メインメニュー画面に遷移します。<br>
	 * セッションをクリアし、ハンディ管理情報にデータを登録します。
	 * @throws Exception
	 */
	@GET
	@Path("/getMenuPage")
	public void getMenuPage() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		if (loginInfo == null) {
			//ログイン情報がないのでタイムアウト
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SESSION_TIMEOUT);
			return;
		}

		//ログイン関連情報以外のセッション情報をクリア
		util.clearSession(ses);

		//確認ボタンが押されたので、この時点の顧客先情報を管理マスタに登録
		MWebHtInfoCB webHtInfoCB = webHtInfoBhv.newMyConditionBean();
		webHtInfoCB.query().setMacAddress_Equal(util.getMacAddress(ses));
		MWebHtInfo infoEntity = webHtInfoBhv.selectEntity(webHtInfoCB);

		//センタと荷主の入力されたCDをログイン情報に設定
		MCenterCB cbCenter = mCenterBhv.newMyConditionBean();
		cbCenter.query().setCenterCd_Equal(loginInfo.getCenterCd());
		MCenter mCenter = mCenterBhv.selectEntityWithDeletedCheck(cbCenter);

		MClientCB cbClient = mClientBhv.newMyConditionBean();
		cbClient.query().setClientCd_Equal(loginInfo.getClientCd());
		MClient mClient = mClientBhv.selectEntityWithDeletedCheck(cbClient);

		loginInfo.setCenterId(mCenter.getCenterId());
		loginInfo.setClientId(mClient.getClientId());

		if (infoEntity != null) {
			//データが存在するので更新
			infoEntity.setClientId(loginInfo.getClientId());
			infoEntity.setUpdDt(new Timestamp(new Date().getTime()));
			infoEntity.setUpdProcess(this.getClass().getCanonicalName());
			infoEntity.setUpdUser(loginInfo.getUserCd());
			webHtInfoBhv.update(infoEntity);
		} else {
			//データが存在しないので新規登録
			infoEntity = webHtInfoBhv.newMyEntity();
			infoEntity.setAddDt(new Timestamp(new Date().getTime()));
			infoEntity.setAddProcess(this.getClass().getCanonicalName());
			infoEntity.setAddUser(loginInfo.getUserCd());
			infoEntity.setClientId(loginInfo.getClientId());
			infoEntity.setCenterId(loginInfo.getCenterId());
			infoEntity.setWarehouseId(loginInfo.getWarehouseId());
			infoEntity.setDelFlg("0");
			infoEntity.setMacAddress(util.getMacAddress(ses));
			webHtInfoBhv.insert(infoEntity);
		}

		// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
		// ユーザマスタログインデータ取得
		MUserLogin mUserLogin = loginLogic.getMUserLogin(loginInfo);

		// MWebHtInfoデータ取得
		MWebHtInfoCB webHtCB = webHtInfoBhv.newMyConditionBean();
		webHtCB.query().setMacAddress_Equal(util.getMacAddress(ses));
		MWebHtInfo mWebHt = webHtInfoBhv.selectEntity(webHtInfoCB);
		// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End

		if (util.checkInterruptData(ses)) {
			//中断データあり
			THtComctl entity = util.getInterruptData(ses);

			// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start

			// 中断データのセンターと荷主IDをユーザログインマスタとM_WEB_HT_INFOに更新
			mUserLogin.setClientId(entity.getClientId());
			mUserLogin.setCenterId(entity.getCenterId());
			mUserLoginBhv.update(mUserLogin);

			mWebHt.setCenterId(entity.getCenterId());
			mWebHt.setClientId(entity.getClientId());
			webHtInfoBhv.update(mWebHt);

			loginInfo.setCenterId(entity.getCenterId());
			loginInfo.setClientId(entity.getClientId());

			//センタと荷主の入力されたCDをログイン情報に設定
			MCenterCB mCenterCB = mCenterBhv.newMyConditionBean();
			mCenterCB.query().setCenterId_Equal(loginInfo.getCenterId());
			MCenter center = mCenterBhv.selectEntityWithDeletedCheck(mCenterCB);

			MClientCB mClientCB = mClientBhv.newMyConditionBean();
			mClientCB.query().setClientId_Equal(loginInfo.getClientId());
			MClient client = mClientBhv.selectEntityWithDeletedCheck(mClientCB);

			loginInfo.setCenterCd(center.getCenterCd());
			loginInfo.setClientCd(client.getClientCd());

			// センタ荷主存在チェック
			loginLogic.checkClientCenterExist(loginInfo, mUserLogin.getUserId());

			if(getErrorManager().size()>0){
				return;
			}

			// セッションのプリンタグループの属性(センタ・荷主)更新
			SessionData sessionData = getSessionData();
			sessionData.setPrinterGroupAttribute1(loginInfo.getCenterCd());
			sessionData.setPrinterGroupAttribute2(loginInfo.getClientCd());

			// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End

			//[#3687][Ver3.0] セッション切れの際メインメニューが表示されなくなる不具合を修正 2018.02.15 miyabe Start
			//メインメニューのDTOをセット
			List<HandyMenuDto> groupList = util.getMenuGrp(ses);
			ses.setAttribute("lstHandyGrpMenuDto", groupList);
			//[#3687][Ver3.0] セッション切れの際メインメニューが表示されなくなる不具合を修正 2018.02.15 miyabe End

			// 再開先のURL
			String rightButtonUrl = util.determineReOpenProcess(entity);

			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana Start

			// 機能名
			String programNm = screenUtil.itemNm(suffixHT(entity.getHtDataKbn()), "programName");

			// 再開画面を表示
			displayResumeDialog(programNm, rightButtonUrl);

			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana End
		} else {
			//中断データがないので、メニューを表示

			// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start

			// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
			if (!CU.isNotNullAndEquals(mWebHt.getClientId(), mUserLogin.getClientId())) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

				// MWebHtInfoの荷主ID更新
				mWebHt.setClientId(mUserLogin.getClientId());
				webHtInfoBhv.update(mWebHt);
			}
			// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
			if (!CU.isNotNullAndEquals(mUserLogin.getCenterId(), mWebHt.getCenterId())) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

				// ユーザログインマスタのセンタID更新
				mUserLogin.setCenterId(mWebHt.getCenterId());
				mUserLoginBhv.update(mUserLogin);
			}

			loginInfo.setCenterId(mWebHt.getCenterId());
			loginInfo.setClientId(mWebHt.getClientId());

			//センタと荷主の入力されたCDをログイン情報に設定
			MCenterCB mCenterCB = mCenterBhv.newMyConditionBean();
			mCenterCB.query().setCenterId_Equal(loginInfo.getCenterId());
			MCenter center = mCenterBhv.selectEntityWithDeletedCheck(mCenterCB);

			MClientCB mClientCB = mClientBhv.newMyConditionBean();
			mClientCB.query().setClientId_Equal(loginInfo.getClientId());
			MClient client = mClientBhv.selectEntityWithDeletedCheck(mClientCB);

			loginInfo.setCenterCd(center.getCenterCd());
			loginInfo.setClientCd(client.getClientCd());

			// センタ荷主存在チェック
			loginLogic.checkClientCenterExist(loginInfo, mUserLogin.getUserId());

			if(getErrorManager().size()>0){
				return;
			}
			// セッションのプリンタグループの属性(センタ・荷主)更新
			SessionData sessionData = getSessionData();
			sessionData.setPrinterGroupAttribute1(loginInfo.getCenterCd());
			sessionData.setPrinterGroupAttribute2(loginInfo.getClientCd());

			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

			List<HandyMenuDto> groupList = util.getMenuGrp(ses);
			ses.setAttribute("lstHandyGrpMenuDto", groupList);

			// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End

			// ===== メインメニューに遷移 =====

			// 画面初期設定
			initScreen("MenuGrpHT");

			// 戻るボタン設定
			setReturnButton(ButtonInfo.builder().url("loginClientInfo").itemCd("return").type(BUTTON_URL_JUMP_NO_DATA).build());

			// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End

			util.setTransURL(HT_URI_BASE + "/common/HandyGrpMenu.jsp", ses);
		}

	}

	/**
	 * 中断データのクリアを行います。
	 * @throws Exception
	 */
	@GET
	@Path("/clearSuspendData")
	public void clearSuspendData() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		util.clearHtComCtl(ses);

		//ログイン画面に戻る
		initLogin();
	}

	/**
	 * ログイン処理（共通）
	 * @param userCd
	 * @throws Exception
	 */
	@Override
	protected void authCommon(String userCd) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#3270] センタ別ロケール対応 2018.01.11 kawana Start
		SessionDataImpl sessionData = AuthenticationBaseResource.createSessionData(systemLogic, bUserBhv, userCd, null, false);
		// [#3270] センタ別ロケール対応 2018.01.11 kawana End

		// 認証エラー（ユーザ不一致エラーなど）
		if (sessionData == null) {
			String msg = util.getMessage("handyLoginAuthError");
			sendErrorScreen(msg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana Start
		final String macAddress = util.getMacAddress(ses);
		sessionData.setTerminalCd(macAddress);
		// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana End

		//WEBHT管理マスタから、当該端末のセンタおよび荷主の情報を取得
		MWebHtInfoCB htInfoCB = webHtInfoBhv.newMyConditionBean();
		htInfoCB.query().setMacAddress_Equal(macAddress);
		MWebHtInfo webHtInfo = webHtInfoBhv.selectEntity(htInfoCB);

		if (webHtInfo == null) {
			//管理マスタにデータが存在しない場合、エラーとする
			String msg = util.getMessage("handyLoginAuthError");
			sendErrorScreen(msg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		//ログイン情報をセッションに格納
		HandyLoginUserInfo loginInfo = new HandyLoginUserInfo();
		loginInfo.setSessionData(sessionData);

		loginInfo.setCenterId(webHtInfo.getCenterId());
		loginInfo.setClientId(webHtInfo.getClientId());

		//センタと荷主のCDを画面表示用に取得し設定
		MCenterCB cbCenter = mCenterBhv.newMyConditionBean();
		cbCenter.query().setCenterId_Equal(webHtInfo.getCenterId());
		MCenter mCenter = mCenterBhv.selectEntityWithDeletedCheck(cbCenter);

		MClientCB cbClient = mClientBhv.newMyConditionBean();
		cbClient.query().setClientId_Equal(webHtInfo.getClientId());
		MClient mClient = mClientBhv.selectEntityWithDeletedCheck(cbClient);

		loginInfo.setCenterCd(mCenter.getCenterCd());
		loginInfo.setClientCd(mClient.getClientCd());

		if (AccessContext.isExistAccessContextOnThread()) {
			AccessContext context = AccessContext.getAccessContextOnThread();
			context.setAccessUser(sessionData.getUserCd());
			AccessContext.setAccessContextOnThread(context);
		}

		//カスタム処理
		if (BaseContext.getUserDataCustomHandler() != null) {
			CDI.current().select(BaseContext.getUserDataCustomHandler()).get().execute(sessionData);
		}


		// [#2898] メニュー取得処理を移動(ここから削除) 2017.10.31 kawana Start
		ses.setAttribute("loginInfo", loginInfo);
		// [#2898] メニュー取得処理を移動(ここから削除) 2017.10.31 kawana End
		ses.setAttribute("loginUserCd", loginInfo.getUserCd());
		loginLogic.getClientData(ses);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana Start

		// 画面初期設定
		initScreen("LoginClientHT");

		// オプション１ボタン設定
		//[Ver3.0][#3998]項目名変更に伴い修正 2018.04.10 miyabe upd Start
		setOptionButton1(ButtonInfo.builder().url("selectClientCd?returnURI=loginClientInfo").itemCd("clientCd").build());
		//[Ver3.0][#3998]項目名変更に伴い修正 2018.04.10 miyabe upd End
		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url("initLogin").itemCd("return").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().url("getMenuPage").itemCd("advance").build());

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana End

		util.setTransURL(HT_URI_BASE + "/common/HandyLoginClient.jsp", ses);

		// 認証完了フラグを設定
		ses.setAttribute(AuthenticationBaseResource.TOKEN_QUERY_STRING_KEY, loginInfo.getUserCd());

		//[ON推]HT-OCR文字認識の対応 2016.07.04 chou Add Start
		//== OCR文字認識の設定情報を取得 ==
		MClientCenter mcc = new MClientCenter();
		mcc.setClientId(loginInfo.getClientId());
		mcc.setCenterId(loginInfo.getCenterId());
		MParam mp = paramLogic.getUkEntityWithDeletedCheck(mcc);

		if(mp != null && "1".equals(mp.getHtCharReadFlg())){//HT文字認識使用：有りの場合
			ses.setAttribute("isOcrFlg", new Boolean(true));
			//HTロット入力方式の取得
			String lotProperty = CU.isNullOrEmpty(mp.getHtLotInputType()) ? "2" : mp.getHtLotInputType().trim();

			if (!lotProperty.equals("2") && lotProperty.indexOf("2:", 0) < 0) {
				lotProperty = "2:" + lotProperty;
			}
			ses.setAttribute("lotProperty", lotProperty);

			// [#1839] HTシリアル入出荷検品で文字認識できるように対応 追加 2017.06.01 nayzaw Start
			//HTシリアル入力方式の取得
			String serialProperty = CU.isNullOrEmpty(mp.getHtSerialInputType()) ? "2" : mp.getHtSerialInputType().trim();

			if(!serialProperty.equals("2") && serialProperty.indexOf("2:", 0) < 0){
				serialProperty = "2:" + serialProperty;
			}
			ses.setAttribute("serialProperty", serialProperty);
			// [#1839] HTシリアル入出荷検品で文字認識できるように対応 追加 2017.06.01 nayzaw End

		}else{//HT文字認識使用：無しの場合
			ses.setAttribute("isOcrFlg", new Boolean(false));
			ses.setAttribute("lotProperty", "");
			// [#1839] HTシリアル入出荷検品で文字認識できるように対応 追加 2017.06.01 nayzaw Start
			ses.setAttribute("serialProperty", "");
			// [#1839] HTシリアル入出荷検品で文字認識できるように対応 追加 2017.06.01 nayzaw End
		}
		//[ON推]HT OCR文字認識の対応 2016.07.04 chou Add End

	}

}
