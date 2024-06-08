package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientScreen;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面マスタ共通ロジッククラス
 */
public class CenterClientScreenMasterCheckLogic extends AbstractWmsLogic {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 画面CD重複
		 */
		protected static final int CLIENT_SCREEN_NAME_DUPLICATE = 2;
	}

	// ===== 使用ロジッククラス =====
	// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//	@Inject
//	private DictLogic dictLogic;
	@Inject
	private VDictLogic vdictLogic;
	// [ON推-品向-562] 多言語対応 2015.05.20 ki End
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
	@Inject
	private ClientScreenLogic clientScreenLogic;
	@Inject
	private CenterScreenLogic centerScreenLogic;

	/**
	 * <h2>センタ・荷主別画面マスタのチェック処理を行う（確認ダイアログ表示有り）。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・画面名存在チェック
	 * ・画面CD重複チェック
	 * エラーの場合、ステータスコードを設定する。
	 * </pre>
	 * @param bScreenList 画面マスタリスト：センタOR荷主画面名・センタOR荷主区分・センタOR荷主画面ID・画面表示可否・画面ID
	 * @param screen 画面マスタ：センタOR荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkCenterClientScreenMasterWithConfirm(List<BScreen> bScreenList,BScreen screen, ErrorStatus errSts) {
		checkCenterClientScreenMaster(bScreenList,screen, errSts, true);
	}

	/**
	 * <h2>センタ・荷主別画面マスタのチェック処理を行う（確認ダイアログ表示無し）。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・画面名存在チェック
	 * ・画面CD重複チェック
	 * エラーの場合、ステータスコードを設定する。
	 * </pre>
	 * @param bScreenList 画面マスタリスト：センタOR荷主画面名・センタOR荷主区分・センタOR荷主画面ID・画面表示可否・画面ID
	 * @param screen 画面マスタ：センタOR荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkCenterClientScreenMasterNoneConfirm(List<BScreen> bScreenList, BScreen screen,ErrorStatus errSts) {
		checkCenterClientScreenMaster(bScreenList,screen, errSts, false);
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・画面名存在チェック
	 * ・画面CD重複チェック
	 * </pre>
	 * @param bScreenList 画面マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private void checkCenterClientScreenMaster(List<BScreen> bScreenList,BScreen screen, ErrorStatus errSts, boolean confirm) {
		int rowIndex = -1;


		// チェック処理
		for (BScreen bScreen : bScreenList) {
			rowIndex++;

			if(bScreen !=null){
				// 画面名存在チェック
				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//				BDict bDict = new BDict();
//				if(bScreen.getCenterOrClientScreenNm() != null && bScreen.getCenterOrClientScreenNm().length() > 0){
//					bDict.setDictNm(bScreen.getCenterOrClientScreenNm());
//					bDict = dictLogic.getUkEntity(bDict,errRetSts(errSts,StatusCode.CLIENT_SCREEN_NAME_DUPLICATE, rowIndex));
//				}
				VDict vDict = new VDict();
				if(bScreen.getCenterOrClientScreenNm() != null && bScreen.getCenterOrClientScreenNm().length() > 0){
					vDict.setDictNm(bScreen.getCenterOrClientScreenNm());
					vDict.setCultureId(getCultureId());
					vDict = vdictLogic.getUkEntity(vDict,errRetSts(errSts,StatusCode.CLIENT_SCREEN_NAME_DUPLICATE, rowIndex));
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End
				if(bScreen.getCenterClientCls() != null && (bScreen.getCenterOrClientScreenId() != null ||
						(bScreen.getCenterOrClientScreenId() == null && (bScreen.getCenterOrClientScreenNm() != null ||
								bScreen.getCenterOrClientScreenVisible() != null)))){

						//荷主の場合
						if(bScreen.getCenterClientCls() != null && bScreen.getCenterClientCls().equals("2")){
							MClientScreen mClientScreen = new MClientScreen();
							//MClient mClient = new MClient();
							MClientCB cb = mClientBhv.newMyConditionBean();
							cb.query().setClientCd_Equal(screen.getCenterOrClientCd());
							MClient mClient = mClientBhv.selectEntity(cb);

							//画面ID取得
							mClientScreen.setScreenId(bScreen.getScreenId());

							// 画面CD重複チェック
							if (bScreen.getCenterOrClientScreenId() == null) {
								//ログインユーザが選択した荷主ID取得
								mClientScreen.setClientId(mClient.getClientId());


								// 登録の場合
								clientScreenLogic.checkClientScreenCdInsert(mClientScreen, errRetSts(errSts,StatusCode.CLIENT_SCREEN_NAME_DUPLICATE, rowIndex));
							} else {
								//荷主ID取得
								mClientScreen.setClientId(mClient.getClientId());
								//荷主画面ID取得
								mClientScreen.setClientScreenId(bScreen.getCenterOrClientScreenId());

								// 修正の場合
								clientScreenLogic.checkClientScreenCdUpdate(mClientScreen, errRetSts(errSts,StatusCode.CLIENT_SCREEN_NAME_DUPLICATE, rowIndex));
							}
						}
						if(bScreen.getCenterClientCls() != null && bScreen.getCenterClientCls().equals("1")){
							//センタの場合
							MCenterScreen mCenterScreen = new MCenterScreen();

							//画面ID取得
							mCenterScreen.setScreenId(bScreen.getScreenId());

							MCenterCB cb = mCenterBhv.newMyConditionBean();
							cb.query().setCenterCd_Equal(screen.getCenterOrClientCd());
							MCenter mCenter = mCenterBhv.selectEntity(cb);

							// 画面CD重複チェック
							if (bScreen.getCenterOrClientScreenId() == null) {
								//ログインユーザが選択したセンタID取得
								//mCenterScreen.setCenterId(mUserLogin.getCenterId());
								mCenterScreen.setCenterId(mCenter.getCenterId());

								// 登録の場合
								centerScreenLogic.checkCenterScreenCdInsert(mCenterScreen, errRetSts(errSts,StatusCode.CLIENT_SCREEN_NAME_DUPLICATE, rowIndex));
							} else {
								//センタID取得
								mCenterScreen.setCenterId(mCenter.getCenterId());
								//センタ画面ID取得
								mCenterScreen.setCenterScreenId(bScreen.getCenterOrClientScreenId());

								// 修正の場合
								centerScreenLogic.checkCenterScreenCdUpdate(mCenterScreen, errRetSts(errSts,StatusCode.CLIENT_SCREEN_NAME_DUPLICATE, rowIndex));
							}
						}
					}
				}
			}
		}

}
