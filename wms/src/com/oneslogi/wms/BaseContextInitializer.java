package com.oneslogi.wms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.BaseContext;
import com.oneslogi.base.BaseCustomHandler;
import com.oneslogi.base.cookie.SessionData;
import com.oneslogi.base.dbflute.cbean.MCenterColCB;
import com.oneslogi.base.dbflute.cbean.MCenterItemCB;
import com.oneslogi.base.dbflute.cbean.MCenterScreenCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientColCB;
import com.oneslogi.base.dbflute.cbean.MClientItemCB;
import com.oneslogi.base.dbflute.cbean.MClientScreenCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.cbean.MUserLoginCB;
import com.oneslogi.base.dbflute.exbhv.MCenterColBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterItemBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterScreenBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientColBhv;
import com.oneslogi.base.dbflute.exbhv.MClientItemBhv;
import com.oneslogi.base.dbflute.exbhv.MClientScreenBhv;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exentity.BCol;
import com.oneslogi.base.dbflute.exentity.BItem;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.dbflute.exentity.BScreenRole;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MClientCol;
import com.oneslogi.base.dbflute.exentity.MClientItem;
import com.oneslogi.base.dbflute.exentity.MClientScreen;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dbflute.exentity.VHtDict;
import com.oneslogi.base.exception.CheckBaseException;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.SqlUtil;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.common.SelectClientDto;
import com.oneslogi.wms.logic.DailyProcessCheckLogic;
import com.oneslogi.wms.logic.common.SelectClientLogic;
import com.oneslogi.wms.logic.common.SelectClientLogic.AddFatalError;
import com.oneslogi.wms.logic.common.UserCenterLogic;
import com.oneslogi.wms.logic.common.UserLoginRegisterLogic;

/**
 * BaseContext初期化処理
 * ・[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue
 * @author at.inoue.hx
 *
 */
public class BaseContextInitializer {
	/**
	 * 初期化
	 */
	public static void initialize() {
		// セッションデータにＷＭＳシステム用の拡張領域を設定する。
		if (BaseContext.getUserDataCustomHandler() == null) {
			BaseContext.setUserDataCustomHandler(UserDataCustomLogic.class);
		}

		// 画面権限データにＷＭＳシステム用の割り込み権限を設定する。
		if (BaseContext.getScreenRoleCustomHandler() == null) {
			BaseContext.setScreenRoleCustomHandler(ScreenRoleCustomLogic.class);
		}

		// 項目権限データにＷＭＳシステム用の割り込み権限を設定する。
		if (BaseContext.getItemRoleCustomHandler() == null) {
			BaseContext.setItemRoleCustomHandler(ItemRoleCustomLogic.class);
		}

		// 列権限データにＷＭＳシステム用の割り込み権限を設定する。
		if (BaseContext.getColRoleCustomHandler() == null) {
			BaseContext.setColRoleCustomHandler(ColRoleCustomLogic.class);
		}

		//日次チェックを割り当て
		if (BaseContext.getBaseCheckHandler() == null) {
			BaseContext.setBaseCheckHandler(CheckDailyProcessLogic.class);
		}

	}

	public static class UserDataCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {

		@Inject
		private UserLoginRegisterLogic userLoginRegisterLogic;

		@Inject
		private MUserClientBhv mUserClientBhv;

		@Inject
		private MClientBhv mClientBhv;
		//[Ver2.2.1][#2517] ユーザログインマスタ更新時、荷主センタマスタの存在有無チェックを追加 2017.09.19 miyabe Start
		@Inject
		private MClientCenterBhv mClientCenterBhv;
		@Inject
		private SelectClientLogic selectClientLogic;
		@Inject
		private UserCenterLogic userCenterLogic;
		//[Ver2.2.1][#2517] ユーザログインマスタ更新時、荷主センタマスタの存在有無チェックを追加 2017.09.19 miyabe End
		/**
		 * セッションデータにＷＭＳシステム用の拡張領域を設定する。
		 */
		@Override
		public Object execute(Object object) {
			SessionData sessionData = null;

			if (object == null) {
				sessionData = getSessionData();
			} else {
				sessionData = (SessionData) object;
			}

			List<Long> userCenterIdList = userLoginRegisterLogic.getUserCenterIdList(sessionData.getUserId()
					, sessionData.getUserCd());

			MUserLogin mUserLogin = userLoginRegisterLogic.getMUserLogin(sessionData.getUserId());

			if (mUserLogin == null) {
				mUserLogin = userLoginRegisterLogic.insert(userCenterIdList
						, sessionData.getUserId()
						, sessionData.getUserCd());
			} else {
				//[Ver2.2.1][#2517] ユーザログインマスタ更新時、荷主センタマスタの存在有無チェックを追加 2017.09.19 miyabe Start
				// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start

				// ログインユーザ更新有無
				boolean updateLoginUser = false;

				// ===== ログインセンタのチェック =====

				// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動 2017.05.23 kawana Start
				// ログインユーザに許可されたセンタリスト取得
				List<MCenter> centerList = userCenterLogic.getCenterList(sessionData.getUserId(), UserCenterLogic.SelectCls.NO_DELETE_ONLY);
				// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動 2017.05.23 kawana End

				//荷主センタマスタを全件取得
				MClientCenterCB mClientCenterCB = mClientCenterBhv.newMyConditionBean();
				mClientCenterCB.query().setDelFlg_Equal_$0();
				mClientCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
				mClientCenterCB.query().queryMClient().setDelFlg_Equal_$0();
				mClientCenterCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
				mClientCenterCB.query().queryMClient().addOrderBy_ClientCd_Asc();
				List <MClientCenter> mClientCenterList = mClientCenterBhv.selectList(mClientCenterCB);

				Long beforeLoginCenterId = mUserLogin.getCenterId();
				boolean existCenter = false;
				if (beforeLoginCenterId != null && mClientCenterList.size() != 0) {
					for (MCenter center : centerList) {
						for (MClientCenter mClientCenter : mClientCenterList) {
							//ログインしたユーザのユーザIDと紐づくユーザセンタマスタのセンタIDが、
							//ユーザログインマスタと荷主センタマスタの両方に存在すれば問題なし
							if(beforeLoginCenterId.longValue() == center.getCenterId().longValue()
									&& mClientCenter.getCenterId() == center.getCenterId().longValue()){
								// センタ問題なし
								existCenter = true;
								break;
							}
						}
						if(existCenter == true){
							break;
						}
					}
				}

				// ===== ログイン荷主のチェック =====

				String beforeLoginCenterCd = mUserLogin.chaseMCenter().getCenterCd();
				String beforeLoginClientCd = mUserLogin.chaseMClient().getClientCd();
				boolean existClient = false;
				if (beforeLoginCenterCd != null && beforeLoginClientCd != null) {

					SelectClientDto checkDto = new SelectClientDto();
					checkDto.setSelCenterCd(beforeLoginCenterCd);
					checkDto.setSelClientCd(beforeLoginClientCd);

					existClient = selectClientLogic.checkCenterClientData(checkDto, AddFatalError.FALSE, sessionData.getUserId());
				}

				if (!existCenter || !existClient) {
					// ログインセンタ、またはログイン荷主が見つからない

					mUserLogin.setCenterId(null);
					mUserLogin.setMCenter(null);
					mUserLogin.setClientId(null);
					mUserLogin.setMClient(null);

					if (0 < centerList.size()) {
						for (MCenter center : centerList) {
							List<MClient> clientList = selectClientLogic.selectClientList(sessionData.getUserId(), center.getCenterCd());
							if(clientList.size() != 0){
								MClient client = clientList.get(0);
								mUserLogin.setMCenter(center);
								mUserLogin.setMClient(client);
								mUserLogin.setCenterId(center.getCenterId());
								mUserLogin.setClientId(client.getClientId());

								updateLoginUser = true;
								break;
							}
						}
						updateLoginUser = true;
					}
				}
				//[Ver2.2.1][#2517] ユーザログインマスタ更新時荷主センタマスタの存在有無チェックを追加 2017.09.19 miyabe End

				if (updateLoginUser) {
					// ログインユーザ更新有

					Long updateCenterId = mUserLogin.getCenterId();
					Long updateClientId = mUserLogin.getClientId();

					if (updateCenterId != null && updateClientId != null) {
						// ログインユーザの更新実行
						selectClientLogic.setUserLoginData(updateCenterId, updateClientId, sessionData.getUserId());
					}
				}

				// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End

			}

					final MUserLogin user = mUserLogin;

			//ユーザに紐づく荷主一覧を取得
			List<Long> userClientIdList = new ArrayList<Long>();
			MUserClientCB mUserClientCB = mUserClientBhv.newMyConditionBean();
			mUserClientCB.query().setUserId_Equal(sessionData.getUserId());
			mUserClientCB.query().setDelFlg_Equal_$0();
			mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();

			if (mUserClientBhv.selectCount(mUserClientCB) > 0) {
				mUserClientCB = mUserClientBhv.newMyConditionBean();
				mUserClientCB.query().setUserId_Equal(sessionData.getUserId());
				mUserClientCB.query().setDelFlg_Equal_$0();
				mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();

				mUserClientCB.query().queryMClient().existsMClientCenterList(new SubQuery<MClientCenterCB>() {

					@Override
					public void query(MClientCenterCB cb) {
						cb.query().setCenterId_Equal(user.getCenterId());
						cb.query().setDelFlg_Equal_$0();
					}

				});

				mUserClientCB.specify().columnClientId();
				mUserClientCB.query().queryMClient().addOrderBy_ClientCd_Asc();
				ListResultBean<MUserClient> mUserClient = mUserClientBhv.selectList(mUserClientCB); //Query実行

				for (MUserClient o : mUserClient) {
					userClientIdList.add(o.getClientId());
				}

			} else {
				MClientCB mClientCB = mClientBhv.newMyConditionBean();
				mClientCB.query().setDelFlg_Equal_$0();

				mClientCB.query().existsMClientCenterList(new SubQuery<MClientCenterCB>() {

					@Override
					public void query(MClientCenterCB cb) {
						cb.query().setCenterId_Equal(user.getCenterId());
						cb.query().setDelFlg_Equal_$0();
					}

				});

				mClientCB.specify().columnClientId();
				mClientCB.query().addOrderBy_ClientCd_Asc();
				ListResultBean<MClient> mClient = mClientBhv.selectList(mClientCB); //Query実行

				for (MClient o : mClient) {
					userClientIdList.add(o.getClientId());
				}

			}

			MUserLoginBhv mUserLoginBhv = userLoginRegisterLogic.getMUserLoginBhv();

			MUserLoginCB mUserLoginCB = mUserLoginBhv.newMyConditionBean();

			// [#3270] センタ別ロケール対応 2018.01.11 kawana Start
			mUserLoginCB.setupSelect_MCenter().withBTimeZone();
			// [#3270] センタ別ロケール対応 2018.01.11 kawana End
			mUserLoginCB.specify().specifyMCenter().columnCenterCd();
			mUserLoginCB.specify().specifyMCenter().columnCenterNm();
			// [#2828][#3270] センタ別ロケール対応 2018.01.11 kawana Start
			mUserLoginCB.specify().specifyMCenter().columnCultureId();
			mUserLoginCB.specify().specifyMCenter().specifyBTimeZone().columnTimeZoneCd();
			// [#2828][#3270] センタ別ロケール対応 2018.01.11 kawana End

			mUserLoginCB.setupSelect_MClient();
			mUserLoginCB.specify().specifyMClient().columnClientCd();
			mUserLoginCB.specify().specifyMClient().columnClientNm();

			mUserLoginCB.query().setUserId_Equal(sessionData.getUserId());
			mUserLogin = mUserLoginBhv.selectEntity(mUserLoginCB);

			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME, String.valueOf(mUserLogin.getCenterId()));
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME, mUserLogin.chaseMCenter().getCenterCd());
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_NM_KEY_NAME, mUserLogin.chaseMCenter().getCenterNm());
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_USER_CENTER_ID_KEY_NAME, JSON.encode(userCenterIdList));

			// [#2828][#3270] センタ別ロケール対応 2018.01.11 kawana Start
			if (mUserLogin.chaseMCenter().getCultureId() != null) {
				// カルチャをセンタカルチャに変更
				sessionData.setCultureId(mUserLogin.chaseMCenter().getCultureId());
			}

			if (mUserLogin.chaseMCenter().chaseBTimeZone().getTimeZoneCd() != null) {
				// タイムゾーン変更
				sessionData.setTimeZoneCd(mUserLogin.chaseMCenter().chaseBTimeZone().getTimeZoneCd());
			}
			// [#2828][#3270] センタ別ロケール対応 2018.01.11 kawana End

			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME, String.valueOf(mUserLogin.getClientId()));
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_CD_KEY_NAME, mUserLogin.chaseMClient().getClientCd());
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_NM_KEY_NAME, mUserLogin.chaseMClient().getClientNm());
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_USER_CLIENT_ID_KEY_NAME, JSON.encode(userClientIdList));

			// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu Start
			MClientCenterCB mClientCenterCB = mClientCenterBhv.newMyConditionBean();
			mClientCenterCB.query().setClientId_Equal(mUserLogin.chaseMClient().getClientId());
			mClientCenterCB.query().setCenterId_Equal(mUserLogin.chaseMCenter().getCenterId());
			MClientCenter mClientCenter = mClientCenterBhv.selectEntity(mClientCenterCB);
			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_SYSTEM_DT_KEY_NAME, mClientCenter.getSystemDt());
			// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu End

			/* [直接印刷対応] 2016.5.16 inoue Start */
			// プリンタグループ属性１～５
			sessionData.setPrinterGroupAttribute1(mUserLogin.chaseMCenter().getCenterCd());
			sessionData.setPrinterGroupAttribute2(mUserLogin.chaseMClient().getClientCd());

			/* [HT自動印刷対応] 2016.5.26 inoue | Start センター、荷主以外はデフォルト属性は設定しない。 */
//			sessionData.setPrinterGroupAttribute3(null);
//			sessionData.setPrinterGroupAttribute4(null);
//			sessionData.setPrinterGroupAttribute5(null);
			/* [HT自動印刷対応] 2016.5.26 inoue End */

			// 帳票レイアウト属性１～５
			sessionData.setReportLayoutAttribute1(mUserLogin.chaseMCenter().getCenterCd());
			sessionData.setReportLayoutAttribute2(mUserLogin.chaseMClient().getClientCd());

			/* [HT自動印刷対応] 2016.5.26 inoue | Start センター、荷主以外はデフォルト属性は設定しない。 */
//			sessionData.setReportLayoutAttribute3(null);
//			sessionData.setReportLayoutAttribute4(null);
//			sessionData.setReportLayoutAttribute5(null);
			/* [HT自動印刷対応] 2016.5.26 inoue End */
			/* [直接印刷対応] 2016.5.16 inoue End */

			return null;
		}

	}

	public static class ScreenRoleCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {

		@Inject
		private MCenterScreenBhv mCenterScreenBhv;

		@Inject
		private MClientScreenBhv mClientScreenBhv;

		/**
		 * 画面権限データにＷＭＳシステム用の割り込み権限を設定する。
		 */
		@Override
		public Object execute(Object object) {
			SessionData sessionData = getSessionData();

			//画面権限情報
			Map<Long, BScreenRole> bScreenRoleMap = new HashMap<Long, BScreenRole>();

			//センタ権限情報抽出
			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME))) {
				MCenterScreenCB mCenterScreenCB = mCenterScreenBhv.newMyConditionBean();
				mCenterScreenCB.setupSelect_VDict(sessionData.getCultureId());
				// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
				mCenterScreenCB.setupSelect_VHtDict(sessionData.getCultureId());
				// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
				mCenterScreenCB.query().setCenterId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
				SqlUtil.setDelFlg(mCenterScreenCB);
				List<MCenterScreen> mCenterScreenList = mCenterScreenBhv.selectList(mCenterScreenCB);
				for (MCenterScreen o : mCenterScreenList) {
					BScreenRole bScreenRole = new BScreenRole();
					bScreenRole.setScreenId(o.getScreenId());
					bScreenRole.setVisible(o.getVisible());
					// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
					bScreenRole.setBScreen(new BScreen());
					// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
					if (o.getVDict() != null) {
						bScreenRole.getBScreen().setVDict(new VDict());
						bScreenRole.getBScreen().getVDict().setDictNm(o.getVDict().getDictNm());
					}
					// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
					if (o.getVHtDict() != null) {
						bScreenRole.getBScreen().setVHtDict(new VHtDict());
						bScreenRole.getBScreen().getVHtDict().setDictNm(o.getVHtDict().getDictNm());
					}
					// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
					bScreenRoleMap.put(o.getScreenId(), bScreenRole);
				}
			}

			//荷主権限情報抽出
			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME))) {
				MClientScreenCB mClientScreenCB = mClientScreenBhv.newMyConditionBean();
				mClientScreenCB.setupSelect_VDict(sessionData.getCultureId());
				// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
				mClientScreenCB.setupSelect_VHtDict(sessionData.getCultureId());
				// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
				mClientScreenCB.query().setClientId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
				SqlUtil.setDelFlg(mClientScreenCB);
				List<MClientScreen> mClientScreenList = mClientScreenBhv.selectList(mClientScreenCB);
				for (MClientScreen o : mClientScreenList) {

					if (bScreenRoleMap.containsKey(o.getScreenId())) {
						if (!CU.equals(bScreenRoleMap.get(o.getScreenId()).getVisible(), "0")) {
							BScreenRole bScreenRole = new BScreenRole();
							bScreenRole.setScreenId(o.getScreenId());
							if (!CU.isNullOrEmpty(o.getVisible())) {
								bScreenRole.setVisible(o.getVisible());
							} else {
								bScreenRole.setVisible(bScreenRoleMap.get(o.getScreenId()).getVisible());
							}
							// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
							bScreenRole.setBScreen(new BScreen());
							// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
							if (o.getVDict() != null && !CU.isNullOrEmpty(o.getVDict().getDictNm())) {
								bScreenRole.getBScreen().setVDict(new VDict());
								bScreenRole.getBScreen().getVDict().setDictNm(o.getVDict().getDictNm());
							} else if (bScreenRoleMap.get(o.getScreenId()).getBScreen() != null && bScreenRoleMap.get(o.getScreenId()).getBScreen().getVDict() != null
									&& !CU.isNullOrEmpty(bScreenRoleMap.get(o.getScreenId()).getBScreen().getVDict().getDictNm())) {
								bScreenRole.getBScreen().setVDict(new VDict());
								bScreenRole.getBScreen().getVDict().setDictNm(bScreenRoleMap.get(o.getScreenId()).getBScreen().getVDict().getDictNm());
							}
							// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
							if (o.getVHtDict() != null && !CU.isNullOrEmpty(o.getVHtDict().getDictNm())) {
								bScreenRole.getBScreen().setVHtDict(new VHtDict());
								bScreenRole.getBScreen().getVHtDict().setDictNm(o.getVHtDict().getDictNm());
							} else if (bScreenRoleMap.get(o.getScreenId()).getBScreen() != null && bScreenRoleMap.get(o.getScreenId()).getBScreen().getVHtDict() != null
									&& !CU.isNullOrEmpty(bScreenRoleMap.get(o.getScreenId()).getBScreen().getVHtDict().getDictNm())) {
								bScreenRole.getBScreen().setVHtDict(new VHtDict());
								bScreenRole.getBScreen().getVHtDict().setDictNm(bScreenRoleMap.get(o.getScreenId()).getBScreen().getVHtDict().getDictNm());
							}
							// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
							bScreenRoleMap.put(o.getScreenId(), bScreenRole);
						}
					} else {
						BScreenRole bScreenRole = new BScreenRole();
						bScreenRole.setScreenId(o.getScreenId());
						bScreenRole.setVisible(o.getVisible());
						// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
						bScreenRole.setBScreen(new BScreen());
						// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
						if (o.getVDict() != null) {
							bScreenRole.getBScreen().setVDict(new VDict());
							bScreenRole.getBScreen().getVDict().setDictNm(o.getVDict().getDictNm());
						}
						// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana Start
						if (o.getVHtDict() != null) {
							bScreenRole.getBScreen().setVHtDict(new VHtDict());
							bScreenRole.getBScreen().getVHtDict().setDictNm(o.getVHtDict().getDictNm());
						}
						// [#2898] HT国際化対応(メニューマスタ連携) 2017.12.15 kawana End
						bScreenRoleMap.put(o.getScreenId(), bScreenRole);
					}

				}
			}

			List<BScreenRole> bScreenRoleList = new ArrayList<BScreenRole>();
			for (BScreenRole o : bScreenRoleMap.values()) {
				bScreenRoleList.add(o);
			}

			return bScreenRoleList;
		}

	}

	public static class ItemRoleCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {

		@Inject
		private MCenterItemBhv mCenterItemBhv;

		@Inject
		private MClientItemBhv mClientItemBhv;

		/**
		 * 項目権限データにＷＭＳシステム用の割り込み権限を設定する。
		 */
		@Override
		public Object execute(Object object) {
			SessionData sessionData = getSessionData();

			//項目権限情報
			Map<Long, BItem> bItemMap = new HashMap<Long, BItem>();

			//センタ権限情報抽出
			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME))) {
				MCenterItemCB mCenterItemCB = mCenterItemBhv.newMyConditionBean();
				mCenterItemCB.setupSelect_VDict(sessionData.getCultureId());
				mCenterItemCB.query().setCenterId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
				SqlUtil.setDelFlg(mCenterItemCB);
				List<MCenterItem> mCenterItemList = mCenterItemBhv.selectList(mCenterItemCB);
				for (MCenterItem o : mCenterItemList) {
					BItem bItem = new BItem();
					bItem.setItemId(o.getItemId());
					bItem.setVisible(o.getVisible());
					bItem.setEditable(o.getEditable());
					bItem.setNecessary(o.getNecessary());
					if (o.getVDict() != null) {
						bItem.setVDict(new VDict());
						bItem.getVDict().setDictNm(o.getVDict().getDictNm());
					}
					bItemMap.put(o.getItemId(), bItem);
				}
			}

			//荷主権限情報抽出
			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME))) {
				MClientItemCB mClientItemCB = mClientItemBhv.newMyConditionBean();
				mClientItemCB.setupSelect_VDict(sessionData.getCultureId());
				mClientItemCB.query().setClientId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
				SqlUtil.setDelFlg(mClientItemCB);
				List<MClientItem> mClientItemList = mClientItemBhv.selectList(mClientItemCB);
				for (MClientItem o : mClientItemList) {
					if (bItemMap.containsKey(o.getItemId())) {
						if (!CU.equals(bItemMap.get(o.getItemId()).getVisible(), "0")) {
							BItem bItem = new BItem();
							bItem.setItemId(o.getItemId());
							if (!CU.isNullOrEmpty(o.getVisible())) {
								bItem.setVisible(o.getVisible());
							} else {
								bItem.setVisible(bItemMap.get(o.getItemId()).getVisible());
							}
							if (!CU.equals(bItemMap.get(o.getItemId()).getEditable(), "0")) {
								if (!CU.isNullOrEmpty(o.getEditable())) {
									bItem.setEditable(o.getEditable());
								} else {
									bItem.setEditable(bItemMap.get(o.getItemId()).getEditable());
								}
							} else {
								bItem.setEditable(bItemMap.get(o.getItemId()).getEditable());
							}
							if (!CU.equals(bItemMap.get(o.getItemId()).getNecessary(), "1")) {
								if (!CU.isNullOrEmpty(o.getNecessary())) {
									bItem.setNecessary(o.getNecessary());
								} else {
									bItem.setNecessary(bItemMap.get(o.getItemId()).getNecessary());
								}
							} else {
								bItem.setNecessary(bItemMap.get(o.getItemId()).getNecessary());
							}
							if (o.getVDict() != null && !CU.isNullOrEmpty(o.getVDict().getDictNm())) {
								bItem.setVDict(new VDict());
								bItem.getVDict().setDictNm(o.getVDict().getDictNm());
							} else if (bItemMap.get(o.getItemId()).getVDict() != null && !CU.isNullOrEmpty(bItemMap.get(o.getItemId()).getVDict().getDictNm())) {
								bItem.setVDict(new VDict());
								bItem.getVDict().setDictNm(bItemMap.get(o.getItemId()).getVDict().getDictNm());
							}
							bItemMap.put(o.getItemId(), bItem);
						}
					} else {
						BItem bItem = new BItem();
						bItem.setItemId(o.getItemId());
						bItem.setVisible(o.getVisible());
						bItem.setEditable(o.getEditable());
						bItem.setNecessary(o.getNecessary());
						if (o.getVDict() != null) {
							bItem.setVDict(new VDict());
							bItem.getVDict().setDictNm(o.getVDict().getDictNm());
						}
						bItemMap.put(o.getItemId(), bItem);
					}
				}
			}

			List<BItem> bItemList = new ArrayList<BItem>();
			for (BItem o : bItemMap.values()) {
				bItemList.add(o);
			}

			return bItemList;
		}

	}

	public static class ColRoleCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {

		@Inject
		private MCenterColBhv mCenterColBhv;

		@Inject
		private MClientColBhv mClientColBhv;

		/**
		 * 列権限データにＷＭＳシステム用の割り込み権限を設定する。
		 */
		@Override
		public Object execute(Object object) {
			SessionData sessionData = getSessionData();

			//列権限情報
			Map<Long, BCol> bColMap = new HashMap<Long, BCol>();

			//センタ権限情報抽出
			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME))) {
				MCenterColCB mCenterColCB = mCenterColBhv.newMyConditionBean();
				mCenterColCB.setupSelect_VDict(sessionData.getCultureId());
				mCenterColCB.query().setCenterId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
				SqlUtil.setDelFlg(mCenterColCB);
				List<MCenterCol> mCenterColList = mCenterColBhv.selectList(mCenterColCB);
				for (MCenterCol o : mCenterColList) {
					BCol bCol = new BCol();
					bCol.setColId(o.getColId());
					bCol.setVisible(o.getVisible());
					bCol.setEditable(o.getEditable());
					bCol.setNecessary(o.getNecessary());
					if (o.getVDict() != null) {
						bCol.setVDict(new VDict());
						bCol.getVDict().setDictNm(o.getVDict().getDictNm());
					}
					bColMap.put(o.getColId(), bCol);
				}
			}

			//荷主権限情報抽出
			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME))) {
				MClientColCB mClientColCB = mClientColBhv.newMyConditionBean();
				mClientColCB.setupSelect_VDict(sessionData.getCultureId());
				mClientColCB.query().setClientId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
				SqlUtil.setDelFlg(mClientColCB);
				List<MClientCol> mClientColList = mClientColBhv.selectList(mClientColCB);
				for (MClientCol o : mClientColList) {
					if (bColMap.containsKey(o.getColId())) {
						if (!CU.equals(bColMap.get(o.getColId()).getVisible(), "0")) {
							BCol bCol = new BCol();
							bCol.setColId(o.getColId());
							if (!CU.isNullOrEmpty(o.getVisible())) {
								bCol.setVisible(o.getVisible());
							} else {
								bCol.setVisible(bColMap.get(o.getColId()).getVisible());
							}
							if (!CU.equals(bColMap.get(o.getColId()).getEditable(), "0")) {
								if (!CU.isNullOrEmpty(o.getEditable())) {
									bCol.setEditable(o.getEditable());
								} else {
									bCol.setEditable(bColMap.get(o.getColId()).getEditable());
								}
							} else {
								bCol.setEditable(bColMap.get(o.getColId()).getEditable());
							}
							if (!CU.equals(bColMap.get(o.getColId()).getNecessary(), "1")) {
								if (!CU.isNullOrEmpty(o.getNecessary())) {
									bCol.setNecessary(o.getNecessary());
								} else {
									bCol.setNecessary(bColMap.get(o.getColId()).getNecessary());
								}
							} else {
								bCol.setNecessary(bColMap.get(o.getColId()).getNecessary());
							}
							if (o.getVDict() != null && !CU.isNullOrEmpty(o.getVDict().getDictNm())) {
								bCol.setVDict(new VDict());
								bCol.getVDict().setDictNm(o.getVDict().getDictNm());
							} else if (bColMap.get(o.getColId()).getVDict() != null && !CU.isNullOrEmpty(bColMap.get(o.getColId()).getVDict().getDictNm())) {
								bCol.setVDict(new VDict());
								bCol.getVDict().setDictNm(bColMap.get(o.getColId()).getVDict().getDictNm());
							}
							bColMap.put(o.getColId(), bCol);
						}
					} else {
						BCol bCol = new BCol();
						bCol.setColId(o.getColId());
						bCol.setVisible(o.getVisible());
						bCol.setEditable(o.getEditable());
						bCol.setNecessary(o.getNecessary());
						if (o.getVDict() != null) {
							bCol.setVDict(new VDict());
							bCol.getVDict().setDictNm(o.getVDict().getDictNm());
						}
						bColMap.put(o.getColId(), bCol);
					}
				}
			}

			List<BCol> bColList = new ArrayList<BCol>();
			for (BCol o : bColMap.values()) {
				bColList.add(o);
			}

			return bColList;
		}

	}

	public static class CheckDailyProcessLogic extends AbstractWmsLogic implements BaseCustomHandler {

		// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu Start
		/**
		 * ステータスコード定義
		 */
		public static class StatusCode {
			/**
			 * 正常終了
			 */
			protected static final int SUCCESS = 0;
			/**
			 * 日次実行中エラー
			 */
			public static final int DAILY_CHECK_ERROR = 101;
			/**
			 * システム管理日付不一致エラー
			 */
			public static final int SYSTEM_DT_CHECK_ERROR = 103;
		}

		@Inject
		private DailyProcessCheckLogic logic;

		/**
		 * 日次実行チェックを行う割り込み処理。
		 */
		@Override
		public Object execute(Object object) {

			//メイン処理
			final int checkStatusCode = logic.dailyProcessCheck(getUserData());

			if(checkStatusCode == StatusCode.DAILY_CHECK_ERROR) {
				// [#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Mod Start
				throw new CheckBaseException(WmsConst.StatusCode.DAILY_CHECK_ERROR, WmsMessageConst.DAILY_CHECK_ERROR);
				// [#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Mod End
			} else if(checkStatusCode == StatusCode.SYSTEM_DT_CHECK_ERROR) {
				throw new CheckBaseException(WmsConst.StatusCode.SYSTEM_DT_CHECK_ERROR, WmsMessageConst.SYSTEM_DT_CHECK_ERROR);
			}

			return null;
		}
		// [Ver3.0][#2718] ログイン時、システム稼働日を保持 2018.06.08 shimizu End

	}
}
