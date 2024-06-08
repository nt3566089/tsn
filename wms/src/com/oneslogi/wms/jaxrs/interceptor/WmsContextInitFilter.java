package com.oneslogi.wms.jaxrs.interceptor;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import com.oneslogi.base.BaseConst;
import com.oneslogi.wms.BaseContextInitializer;

/**
 * ＷＭＳシステム用の割り込み処理を定義するフィルタクラス。
 */
@Priority(BaseConst.SYSTEM_PRIORITY + 1)
@Provider
public class WmsContextInitFilter implements ContainerRequestFilter {
	// [バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue Start
	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		BaseContextInitializer.initialize();
	}

	// 以降の内容はBaseContextInitializerに移動
//	@Override
//	public void filter(ContainerRequestContext arg0) {
//		INOUE_DEBUG.OUT("WmsContextInitFilter#filter");
//
//		// セッションデータにＷＭＳシステム用の拡張領域を設定する。
//		if (BaseContext.getUserDataCustomHandler() == null) {
//			BaseContext.setUserDataCustomHandler(UserDataCustomLogic.class);
//		}
//
//		// 画面権限データにＷＭＳシステム用の割り込み権限を設定する。
//		if (BaseContext.getScreenRoleCustomHandler() == null) {
//			BaseContext.setScreenRoleCustomHandler(ScreenRoleCustomLogic.class);
//		}
//
//		// 項目権限データにＷＭＳシステム用の割り込み権限を設定する。
//		if (BaseContext.getItemRoleCustomHandler() == null) {
//			BaseContext.setItemRoleCustomHandler(ItemRoleCustomLogic.class);
//		}
//
//		// 列権限データにＷＭＳシステム用の割り込み権限を設定する。
//		if (BaseContext.getColRoleCustomHandler() == null) {
//			BaseContext.setColRoleCustomHandler(ColRoleCustomLogic.class);
//		}
//
//		//日次チェックを割り当て
//		if (BaseContext.getBaseCheckHandler() == null) {
//			BaseContext.setBaseCheckHandler(CheckDailyProcessLogic.class);
//		}
//
//	}
//
//	public static class UserDataCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {
//
//		@Inject
//		private UserLoginRegisterLogic userLoginRegisterLogic;
//
//		@Inject
//		private MUserClientBhv mUserClientBhv;
//
//		@Inject
//		private MClientBhv mClientBhv;
//
//		/**
//		 * セッションデータにＷＭＳシステム用の拡張領域を設定する。
//		 */
//		@Override
//		public Object execute(Object object) {
//			SessionData sessionData = null;
//
//			if (object == null) {
//				sessionData = getSessionData();
//			} else {
//				sessionData = (SessionData) object;
//			}
//
//			List<Long> userCenterIdList = userLoginRegisterLogic.getUserCenterIdList(sessionData.getUserId()
//					, sessionData.getUserCd());
//
//			MUserLogin mUserLogin = userLoginRegisterLogic.getMUserLogin(sessionData.getUserId());
//
//			if (mUserLogin == null) {
//				mUserLogin = userLoginRegisterLogic.insert(userCenterIdList
//						, sessionData.getUserId()
//						, sessionData.getUserCd());
//			}
//
//			final MUserLogin user = mUserLogin;
//
//			//ユーザに紐づく荷主一覧を取得
//			List<Long> userClientIdList = new ArrayList<Long>();
//			MUserClientCB mUserClientCB = mUserClientBhv.newMyConditionBean();
//			mUserClientCB.query().setUserId_Equal(sessionData.getUserId());
//			mUserClientCB.query().setDelFlg_Equal_$0();
//			mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();
//
//			if (mUserClientBhv.selectCount(mUserClientCB) > 0) {
//				mUserClientCB = mUserClientBhv.newMyConditionBean();
//				mUserClientCB.query().setUserId_Equal(sessionData.getUserId());
//				mUserClientCB.query().setDelFlg_Equal_$0();
//				mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();
//
//				mUserClientCB.query().queryMClient().existsMClientCenterList(new SubQuery<MClientCenterCB>() {
//
//					@Override
//					public void query(MClientCenterCB cb) {
//						cb.query().setCenterId_Equal(user.getCenterId());
//						cb.query().setDelFlg_Equal_$0();
//					}
//
//				});
//
//				mUserClientCB.specify().columnClientId();
//				mUserClientCB.query().queryMClient().addOrderBy_ClientCd_Asc();
//				ListResultBean<MUserClient> mUserClient = mUserClientBhv.selectList(mUserClientCB); //Query実行
//
//				for (MUserClient o : mUserClient) {
//					userClientIdList.add(o.getClientId());
//				}
//
//			} else {
//				MClientCB mClientCB = mClientBhv.newMyConditionBean();
//				mClientCB.query().setDelFlg_Equal_$0();
//
//				mClientCB.query().existsMClientCenterList(new SubQuery<MClientCenterCB>() {
//
//					@Override
//					public void query(MClientCenterCB cb) {
//						cb.query().setCenterId_Equal(user.getCenterId());
//						cb.query().setDelFlg_Equal_$0();
//					}
//
//				});
//
//				mClientCB.specify().columnClientId();
//				mClientCB.query().addOrderBy_ClientCd_Asc();
//				ListResultBean<MClient> mClient = mClientBhv.selectList(mClientCB); //Query実行
//
//				for (MClient o : mClient) {
//					userClientIdList.add(o.getClientId());
//				}
//
//			}
//
//			MUserLoginBhv mUserLoginBhv = userLoginRegisterLogic.getMUserLoginBhv();
//
//			MUserLoginCB mUserLoginCB = mUserLoginBhv.newMyConditionBean();
//
//			mUserLoginCB.setupSelect_MCenter();
//			mUserLoginCB.specify().specifyMCenter().columnCenterCd();
//			mUserLoginCB.specify().specifyMCenter().columnCenterNm();
//
//			mUserLoginCB.setupSelect_MClient();
//			mUserLoginCB.specify().specifyMClient().columnClientCd();
//			mUserLoginCB.specify().specifyMClient().columnClientNm();
//
//			mUserLoginCB.query().setUserId_Equal(sessionData.getUserId());
//			mUserLogin = mUserLoginBhv.selectEntity(mUserLoginCB);
//
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME, String.valueOf(mUserLogin.getCenterId()));
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME, mUserLogin.chaseMCenter().getCenterCd());
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CENTER_NM_KEY_NAME, mUserLogin.chaseMCenter().getCenterNm());
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_USER_CENTER_ID_KEY_NAME, JSON.encode(userCenterIdList));
//
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME, String.valueOf(mUserLogin.getClientId()));
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_CD_KEY_NAME, mUserLogin.chaseMClient().getClientCd());
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_NM_KEY_NAME, mUserLogin.chaseMClient().getClientNm());
//			sessionData.getUserData().put(WmsConst.ONESLOGI_WMS_USER_CLIENT_ID_KEY_NAME, JSON.encode(userClientIdList));
//
//			/* [直接印刷対応] 2016.5.16 inoue Start */
//			// プリンタグループ属性１～５
//			sessionData.setPrinterGroupAttribute1(mUserLogin.chaseMCenter().getCenterCd());
//			sessionData.setPrinterGroupAttribute2(mUserLogin.chaseMClient().getClientCd());
//
//			/* [HT自動印刷対応] 2016.5.26 inoue | Start センター、荷主以外はデフォルト属性は設定しない。 */
////			sessionData.setPrinterGroupAttribute3(null);
////			sessionData.setPrinterGroupAttribute4(null);
////			sessionData.setPrinterGroupAttribute5(null);
//			/* [HT自動印刷対応] 2016.5.26 inoue End */
//
//			// 帳票レイアウト属性１～５
//			sessionData.setReportLayoutAttribute1(mUserLogin.chaseMCenter().getCenterCd());
//			sessionData.setReportLayoutAttribute2(mUserLogin.chaseMClient().getClientCd());
//
//			/* [HT自動印刷対応] 2016.5.26 inoue | Start センター、荷主以外はデフォルト属性は設定しない。 */
////			sessionData.setReportLayoutAttribute3(null);
////			sessionData.setReportLayoutAttribute4(null);
////			sessionData.setReportLayoutAttribute5(null);
//			/* [HT自動印刷対応] 2016.5.26 inoue End */
//			/* [直接印刷対応] 2016.5.16 inoue End */
//
//			return null;
//		}
//
//	}
//
//	public static class ScreenRoleCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {
//
//		@Inject
//		private MCenterScreenBhv mCenterScreenBhv;
//
//		@Inject
//		private MClientScreenBhv mClientScreenBhv;
//
//		/**
//		 * 画面権限データにＷＭＳシステム用の割り込み権限を設定する。
//		 */
//		@Override
//		public Object execute(Object object) {
//			SessionData sessionData = getSessionData();
//
//			//画面権限情報
//			Map<Long, BScreenRole> bScreenRoleMap = new HashMap<Long, BScreenRole>();
//
//			//センタ権限情報抽出
//			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME))) {
//				MCenterScreenCB mCenterScreenCB = mCenterScreenBhv.newMyConditionBean();
//				mCenterScreenCB.setupSelect_VDict(sessionData.getCultureId());
//				mCenterScreenCB.query().setCenterId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
//				SqlUtil.setDelFlg(mCenterScreenCB);
//				List<MCenterScreen> mCenterScreenList = mCenterScreenBhv.selectList(mCenterScreenCB);
//				for (MCenterScreen o : mCenterScreenList) {
//					BScreenRole bScreenRole = new BScreenRole();
//					bScreenRole.setScreenId(o.getScreenId());
//					bScreenRole.setVisible(o.getVisible());
//					if (o.getVDict() != null) {
//						bScreenRole.setBScreen(new BScreen());
//						bScreenRole.getBScreen().setVDict(new VDict());
//						bScreenRole.getBScreen().getVDict().setDictNm(o.getVDict().getDictNm());
//					}
//					bScreenRoleMap.put(o.getScreenId(), bScreenRole);
//				}
//			}
//
//			//荷主権限情報抽出
//			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME))) {
//				MClientScreenCB mClientScreenCB = mClientScreenBhv.newMyConditionBean();
//				mClientScreenCB.setupSelect_VDict(sessionData.getCultureId());
//				mClientScreenCB.query().setClientId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
//				SqlUtil.setDelFlg(mClientScreenCB);
//				List<MClientScreen> mClientScreenList = mClientScreenBhv.selectList(mClientScreenCB);
//				for (MClientScreen o : mClientScreenList) {
//
//					if (bScreenRoleMap.containsKey(o.getScreenId())) {
//						if (!CU.equals(bScreenRoleMap.get(o.getScreenId()).getVisible(), "0")) {
//							BScreenRole bScreenRole = new BScreenRole();
//							bScreenRole.setScreenId(o.getScreenId());
//							if (!CU.isNullOrEmpty(o.getVisible())) {
//								bScreenRole.setVisible(o.getVisible());
//							} else {
//								bScreenRole.setVisible(bScreenRoleMap.get(o.getScreenId()).getVisible());
//							}
//							if (o.getVDict() != null && !CU.isNullOrEmpty(o.getVDict().getDictNm())) {
//								bScreenRole.setBScreen(new BScreen());
//								bScreenRole.getBScreen().setVDict(new VDict());
//								bScreenRole.getBScreen().getVDict().setDictNm(o.getVDict().getDictNm());
//							} else if (bScreenRoleMap.get(o.getScreenId()).getBScreen() != null && bScreenRoleMap.get(o.getScreenId()).getBScreen().getVDict() != null
//									&& !CU.isNullOrEmpty(bScreenRoleMap.get(o.getScreenId()).getBScreen().getVDict().getDictNm())) {
//								bScreenRole.setBScreen(new BScreen());
//								bScreenRole.getBScreen().setVDict(new VDict());
//								bScreenRole.getBScreen().getVDict().setDictNm(bScreenRoleMap.get(o.getScreenId()).getBScreen().getVDict().getDictNm());
//							}
//							bScreenRoleMap.put(o.getScreenId(), bScreenRole);
//						}
//					} else {
//						BScreenRole bScreenRole = new BScreenRole();
//						bScreenRole.setScreenId(o.getScreenId());
//						bScreenRole.setVisible(o.getVisible());
//						if (o.getVDict() != null) {
//							bScreenRole.setBScreen(new BScreen());
//							bScreenRole.getBScreen().setVDict(new VDict());
//							bScreenRole.getBScreen().getVDict().setDictNm(o.getVDict().getDictNm());
//						}
//						bScreenRoleMap.put(o.getScreenId(), bScreenRole);
//					}
//
//				}
//			}
//
//			List<BScreenRole> bScreenRoleList = new ArrayList<BScreenRole>();
//			for (BScreenRole o : bScreenRoleMap.values()) {
//				bScreenRoleList.add(o);
//			}
//
//			return bScreenRoleList;
//		}
//
//	}
//
//	public static class ItemRoleCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {
//
//		@Inject
//		private MCenterItemBhv mCenterItemBhv;
//
//		@Inject
//		private MClientItemBhv mClientItemBhv;
//
//		/**
//		 * 項目権限データにＷＭＳシステム用の割り込み権限を設定する。
//		 */
//		@Override
//		public Object execute(Object object) {
//			SessionData sessionData = getSessionData();
//
//			//項目権限情報
//			Map<Long, BItem> bItemMap = new HashMap<Long, BItem>();
//
//			//センタ権限情報抽出
//			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME))) {
//				MCenterItemCB mCenterItemCB = mCenterItemBhv.newMyConditionBean();
//				mCenterItemCB.setupSelect_VDict(sessionData.getCultureId());
//				mCenterItemCB.query().setCenterId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
//				SqlUtil.setDelFlg(mCenterItemCB);
//				List<MCenterItem> mCenterItemList = mCenterItemBhv.selectList(mCenterItemCB);
//				for (MCenterItem o : mCenterItemList) {
//					BItem bItem = new BItem();
//					bItem.setItemId(o.getItemId());
//					bItem.setVisible(o.getVisible());
//					bItem.setEditable(o.getEditable());
//					bItem.setNecessary(o.getNecessary());
//					if (o.getVDict() != null) {
//						bItem.setVDict(new VDict());
//						bItem.getVDict().setDictNm(o.getVDict().getDictNm());
//					}
//					bItemMap.put(o.getItemId(), bItem);
//				}
//			}
//
//			//荷主権限情報抽出
//			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME))) {
//				MClientItemCB mClientItemCB = mClientItemBhv.newMyConditionBean();
//				mClientItemCB.setupSelect_VDict(sessionData.getCultureId());
//				mClientItemCB.query().setClientId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
//				SqlUtil.setDelFlg(mClientItemCB);
//				List<MClientItem> mClientItemList = mClientItemBhv.selectList(mClientItemCB);
//				for (MClientItem o : mClientItemList) {
//					if (bItemMap.containsKey(o.getItemId())) {
//						if (!CU.equals(bItemMap.get(o.getItemId()).getVisible(), "0")) {
//							BItem bItem = new BItem();
//							bItem.setItemId(o.getItemId());
//							if (!CU.isNullOrEmpty(o.getVisible())) {
//								bItem.setVisible(o.getVisible());
//							} else {
//								bItem.setVisible(bItemMap.get(o.getItemId()).getVisible());
//							}
//							if (!CU.equals(bItemMap.get(o.getItemId()).getEditable(), "0")) {
//								if (!CU.isNullOrEmpty(o.getEditable())) {
//									bItem.setEditable(o.getEditable());
//								} else {
//									bItem.setEditable(bItemMap.get(o.getItemId()).getEditable());
//								}
//							} else {
//								bItem.setEditable(bItemMap.get(o.getItemId()).getEditable());
//							}
//							if (!CU.equals(bItemMap.get(o.getItemId()).getNecessary(), "1")) {
//								if (!CU.isNullOrEmpty(o.getNecessary())) {
//									bItem.setNecessary(o.getNecessary());
//								} else {
//									bItem.setNecessary(bItemMap.get(o.getItemId()).getNecessary());
//								}
//							} else {
//								bItem.setNecessary(bItemMap.get(o.getItemId()).getNecessary());
//							}
//							if (o.getVDict() != null && !CU.isNullOrEmpty(o.getVDict().getDictNm())) {
//								bItem.setVDict(new VDict());
//								bItem.getVDict().setDictNm(o.getVDict().getDictNm());
//							} else if (bItemMap.get(o.getItemId()).getVDict() != null && !CU.isNullOrEmpty(bItemMap.get(o.getItemId()).getVDict().getDictNm())) {
//								bItem.setVDict(new VDict());
//								bItem.getVDict().setDictNm(bItemMap.get(o.getItemId()).getVDict().getDictNm());
//							}
//							bItemMap.put(o.getItemId(), bItem);
//						}
//					} else {
//						BItem bItem = new BItem();
//						bItem.setItemId(o.getItemId());
//						bItem.setVisible(o.getVisible());
//						bItem.setEditable(o.getEditable());
//						bItem.setNecessary(o.getNecessary());
//						if (o.getVDict() != null) {
//							bItem.setVDict(new VDict());
//							bItem.getVDict().setDictNm(o.getVDict().getDictNm());
//						}
//						bItemMap.put(o.getItemId(), bItem);
//					}
//				}
//			}
//
//			List<BItem> bItemList = new ArrayList<BItem>();
//			for (BItem o : bItemMap.values()) {
//				bItemList.add(o);
//			}
//
//			return bItemList;
//		}
//
//	}
//
//	public static class ColRoleCustomLogic extends AbstractWmsLogic implements BaseCustomHandler {
//
//		@Inject
//		private MCenterColBhv mCenterColBhv;
//
//		@Inject
//		private MClientColBhv mClientColBhv;
//
//		/**
//		 * 列権限データにＷＭＳシステム用の割り込み権限を設定する。
//		 */
//		@Override
//		public Object execute(Object object) {
//			SessionData sessionData = getSessionData();
//
//			//列権限情報
//			Map<Long, BCol> bColMap = new HashMap<Long, BCol>();
//
//			//センタ権限情報抽出
//			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME))) {
//				MCenterColCB mCenterColCB = mCenterColBhv.newMyConditionBean();
//				mCenterColCB.setupSelect_VDict(sessionData.getCultureId());
//				mCenterColCB.query().setCenterId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
//				SqlUtil.setDelFlg(mCenterColCB);
//				List<MCenterCol> mCenterColList = mCenterColBhv.selectList(mCenterColCB);
//				for (MCenterCol o : mCenterColList) {
//					BCol bCol = new BCol();
//					bCol.setColId(o.getColId());
//					bCol.setVisible(o.getVisible());
//					bCol.setEditable(o.getEditable());
//					bCol.setNecessary(o.getNecessary());
//					if (o.getVDict() != null) {
//						bCol.setVDict(new VDict());
//						bCol.getVDict().setDictNm(o.getVDict().getDictNm());
//					}
//					bColMap.put(o.getColId(), bCol);
//				}
//			}
//
//			//荷主権限情報抽出
//			if (!CU.isNullOrEmpty(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME))) {
//				MClientColCB mClientColCB = mClientColBhv.newMyConditionBean();
//				mClientColCB.setupSelect_VDict(sessionData.getCultureId());
//				mClientColCB.query().setClientId_Equal(Long.valueOf(sessionData.getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
//				SqlUtil.setDelFlg(mClientColCB);
//				List<MClientCol> mClientColList = mClientColBhv.selectList(mClientColCB);
//				for (MClientCol o : mClientColList) {
//					if (bColMap.containsKey(o.getColId())) {
//						if (!CU.equals(bColMap.get(o.getColId()).getVisible(), "0")) {
//							BCol bCol = new BCol();
//							bCol.setColId(o.getColId());
//							if (!CU.isNullOrEmpty(o.getVisible())) {
//								bCol.setVisible(o.getVisible());
//							} else {
//								bCol.setVisible(bColMap.get(o.getColId()).getVisible());
//							}
//							if (!CU.equals(bColMap.get(o.getColId()).getEditable(), "0")) {
//								if (!CU.isNullOrEmpty(o.getEditable())) {
//									bCol.setEditable(o.getEditable());
//								} else {
//									bCol.setEditable(bColMap.get(o.getColId()).getEditable());
//								}
//							} else {
//								bCol.setEditable(bColMap.get(o.getColId()).getEditable());
//							}
//							if (!CU.equals(bColMap.get(o.getColId()).getNecessary(), "1")) {
//								if (!CU.isNullOrEmpty(o.getNecessary())) {
//									bCol.setNecessary(o.getNecessary());
//								} else {
//									bCol.setNecessary(bColMap.get(o.getColId()).getNecessary());
//								}
//							} else {
//								bCol.setNecessary(bColMap.get(o.getColId()).getNecessary());
//							}
//							if (o.getVDict() != null && !CU.isNullOrEmpty(o.getVDict().getDictNm())) {
//								bCol.setVDict(new VDict());
//								bCol.getVDict().setDictNm(o.getVDict().getDictNm());
//							} else if (bColMap.get(o.getColId()).getVDict() != null && !CU.isNullOrEmpty(bColMap.get(o.getColId()).getVDict().getDictNm())) {
//								bCol.setVDict(new VDict());
//								bCol.getVDict().setDictNm(bColMap.get(o.getColId()).getVDict().getDictNm());
//							}
//							bColMap.put(o.getColId(), bCol);
//						}
//					} else {
//						BCol bCol = new BCol();
//						bCol.setColId(o.getColId());
//						bCol.setVisible(o.getVisible());
//						bCol.setEditable(o.getEditable());
//						bCol.setNecessary(o.getNecessary());
//						if (o.getVDict() != null) {
//							bCol.setVDict(new VDict());
//							bCol.getVDict().setDictNm(o.getVDict().getDictNm());
//						}
//						bColMap.put(o.getColId(), bCol);
//					}
//				}
//			}
//
//			List<BCol> bColList = new ArrayList<BCol>();
//			for (BCol o : bColMap.values()) {
//				bColList.add(o);
//			}
//
//			return bColList;
//		}
//
//	}
//
//	public static class CheckDailyProcessLogic extends AbstractWmsLogic implements BaseCustomHandler {
//
//		@Inject
//		private DailyProcessCheckLogic logic;
//
//		/**
//		 * 日次実行チェックを行う割り込み処理。
//		 */
//		@Override
//		public Object execute(Object object) {
//
//			//メイン処理
//			boolean dailyProcessFlg = logic.isDailyProcessRunning(getUserData());
//
//			if (dailyProcessFlg) {
//				//ログインユーザの情報が日次処理中のため、メインメニューに戻す
//				throw new CommonException(WmsConst.StatusCode.DAILY_CHECK_ERROR, WmsMessageConst.DAILY_CHECK_ERROR);
//			}
//
//			return null;
//		}
//
//	}
	// [バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue End
}
