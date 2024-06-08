package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BCol;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCol;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.ColLogic;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別列マスタマスタ共通ロジッククラス
 */
public class CenterClientScreenColMasterCheckLogic extends AbstractWmsLogic {

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
		 * 列CD重複
		 */
		protected static final int CENTER_CLIENT_COL_NAME_DUPLICATE = 2;
		/**
		 * 表示不可の項目は表示可を設定できません
		 */
		protected static final int CENTER_CLIENT_COL_DIFF_VISIBLE = 3;
		/**
		 * 編集不可の項目は編集可を設定できません
		 */
		protected static final int CENTER_CLIENT_COL_DIFF_EDITABLE = 4;
		/**
		 * 必須の項目は任意を設定できません
		 */
		protected static final int CENTER_CLIENT_COL_DIFF_NECESSARY = 5;
	}

	// ===== 使用ロジッククラス =====
	// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//	@Inject
//	private DictLogic dictLogic;
	@Inject
	private VDictLogic vdictLogic;
	// [ON推-品向-562] 多言語対応 2015.05.20 ki End
	@Inject
	private ColLogic colLogic;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
	@Inject
	private ClientColLogic clientColLogic;
	@Inject
	private CenterColLogic centerColLogic;

	/**
	 * <h2>センタ・荷主別列マスタのチェック処理を行う（確認ダイアログ表示有り）。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・列名存在チェック
	 * ・列CD重複チェック
	 * ・表示不可の項目チェック
	 * ・編集不可の項目チェック
	 * ・必須項目のチェック
	 * エラーの場合、ステータスコードを設定する。
	 * </pre>
	 * @param bColList 列マスタリスト：センタOR荷主区分・センタOR荷主列ID・画面名・画面列表示可否・画面列編集可否・画面列必須・列ID
	 * @param col 列マスタ：センタOR荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkCenterClientColMasterWithConfirm(List<BCol> bColList,BCol col, ErrorStatus errSts) {
		checkCenterClientColMaster(bColList, col, errSts, true);
	}

	/**
	 * <h2>センタ・荷主別列マスタのチェック処理を行う（確認ダイアログ表示無し）。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・列名存在チェック
	 * ・列CD重複チェック
	 * ・表示不可の項目チェック
	 * ・編集不可の項目チェック
	 * ・必須項目のチェック
	 * エラーの場合、ステータスコードを設定する。
	 * </pre>
	 * @param bColList 列マスタリスト：センタOR荷主区分・センタOR荷主列ID・画面名・画面列表示可否・画面列編集可否・画面列必須・列ID
	 * @param col 列マスタ：センタOR荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkCenterClientColMasterNoneConfirm(List<BCol> bColList,BCol col, ErrorStatus errSts) {
		checkCenterClientColMaster(bColList,col, errSts, false);
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・列名存在チェック
	 * ・列CD重複チェック
	 * </pre>
	 * @param bColList 列マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private void checkCenterClientColMaster(List<BCol> bColList,BCol col, ErrorStatus errSts, boolean confirm) {
		int rowIndex = -1;

		// チェック処理
		for (BCol bCol : bColList) {
			rowIndex++;

			if(bCol !=null){
				if(bCol.getCenterClientCls() != null && (bCol.getCenterOrClientColId() != null ||
						(bCol.getCenterOrClientColId() == null && (bCol.getScreenColNm() != null || bCol.getScreenColVisible() != null ||
								bCol.getScreenColEditable() != null || bCol.getScreenColNecessary() != null)))){
					// 列名存在チェック
					// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//					BDict bDict = new BDict();
//					if(bCol.getScreenColNm() != null && bCol.getScreenColNm().length() > 0){
//						bDict.setDictNm(bCol.getScreenColNm());
//						bDict = dictLogic.getUkEntity(bDict,errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_NAME_DUPLICATE, rowIndex));
//					}

					VDict vDict = new VDict();
					if(bCol.getScreenColNm() != null && bCol.getScreenColNm().length() > 0){
						vDict.setDictNm(bCol.getScreenColNm());
						vDict.setCultureId(getCultureId());
						vDict = vdictLogic.getUkEntity(vDict,errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_NAME_DUPLICATE, rowIndex));
					}
					// [ON推-品向-562] 多言語対応 2015.05.20 ki End

					// 表示不可の項目チェック
					colLogic.checkVisible(bCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_DIFF_VISIBLE, rowIndex));

					// 表示不可の項目チェック
					colLogic.checkEditable(bCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_DIFF_EDITABLE, rowIndex));

					// 表示不可の項目チェック
					colLogic.checkNecessary(bCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_DIFF_NECESSARY, rowIndex));

						//荷主の場合
						if(bCol.getCenterClientCls() != null && bCol.getCenterClientCls().equals("2")){
							MClientCol mClientCol = new MClientCol();

							MClientCB cb = mClientBhv.newMyConditionBean();
							cb.query().setClientCd_Equal(col.getCenterOrClientCd());
							MClient mClient = mClientBhv.selectEntity(cb);

							//列ID取得
							mClientCol.setColId(bCol.getColId());

							// 列CD重複チェック
							if (bCol.getCenterOrClientColId() == null) {
								//ログインユーザが選択した荷主ID取得
								mClientCol.setClientId(mClient.getClientId());

								// 登録の場合
								clientColLogic.checkClientColCdInsert(mClientCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_NAME_DUPLICATE, rowIndex));
							} else {
								//荷主ID取得
								mClientCol.setClientId(mClient.getClientId());
								//荷主画面ID取得
								mClientCol.setClientColId(bCol.getCenterOrClientColId());

								// 修正の場合
								clientColLogic.checkClientColCdUpdate(mClientCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_NAME_DUPLICATE, rowIndex));
							}
						}
						if(bCol.getCenterClientCls() != null && bCol.getCenterClientCls().equals("1")){
							//センタの場合
							MCenterCol mCenterCol = new MCenterCol();
							MCenterCB cb = mCenterBhv.newMyConditionBean();
							cb.query().setCenterCd_Equal(col.getCenterOrClientCd());
							MCenter mCenter = mCenterBhv.selectEntity(cb);

							//列ID取得
							mCenterCol.setColId(bCol.getColId());

							// 列CD重複チェック
							if (bCol.getCenterOrClientColId() == null) {
								//ログインユーザが選択したセンタID取得
								mCenterCol.setCenterId(mCenter.getCenterId());

								// 登録の場合
								centerColLogic.checkCenterColCdInsert(mCenterCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_NAME_DUPLICATE, rowIndex));
							} else {
								//センタID取得
								mCenterCol.setCenterId(mCenter.getCenterId());
								//センタ画面ID取得
								mCenterCol.setCenterColId(bCol.getCenterOrClientColId());

								// 修正の場合
								centerColLogic.checkCenterColCdUpdate(mCenterCol, errRetSts(errSts,StatusCode.CENTER_CLIENT_COL_NAME_DUPLICATE, rowIndex));
							}
						}
					}
				}
			}
		}
	}
