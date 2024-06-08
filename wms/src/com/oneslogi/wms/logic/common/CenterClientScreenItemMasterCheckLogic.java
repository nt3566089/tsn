package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BItem;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientItem;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.ItemLogic;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別項目マスタ共通ロジッククラス
 */
public class CenterClientScreenItemMasterCheckLogic extends AbstractWmsLogic {

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
		 * 項目CD重複
		 */
		protected static final int CENTER_CLIENT_ITEM_NAME_DUPLICATE = 2;
		/**
		 * 表示不可の項目は表示可を設定できません
		 */
		protected static final int CENTER_CLIENT_ITEM_DIFF_VISIBLE = 3;
		/**
		 * 編集不可の項目は編集可を設定できません
		 */
		protected static final int CENTER_CLIENT_ITEM_DIFF_EDITABLE = 4;
		/**
		 * 必須の項目は任意を設定できません
		 */
		protected static final int CENTER_CLIENT_ITEM_DIFF_NECESSARY = 5;
	}

	// ===== 使用ロジッククラス =====
	// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//	@Inject
//	private DictLogic dictLogic;
	@Inject
	private VDictLogic vdictLogic;
	// [ON推-品向-562] 多言語対応 2015.05.20 ki End
	@Inject
	private ItemLogic itemLogic;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
	@Inject
	private ClientItemLogic clientItemLogic;
	@Inject
	private CenterItemLogic centerItemLogic;

	/**
	 * <h2>センタ・荷主別項目マスタのチェック処理を行う（確認ダイアログ表示有り）。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・項目名存在チェック
	 * ・項目CD重複チェック
	 * ・表示不可の項目チェック
	 * ・編集不可の項目チェック
	 * ・必須項目のチェック
	 * エラーの場合、ステータスコードを設定する。
	 * </pre>
	 * @param bItemList 項目マスタリスト：センタOR荷主区分・センタOR荷主項目ID・画面項目名・画面項目表示可否・画面項目編集可否・画面項目必須・項目ID
	 * @param item 項目マスタ：センタOR荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkCenterClientItemMasterWithConfirm(List<BItem> bItemList, BItem item, ErrorStatus errSts) {
		checkCenterClientItemMaster(bItemList, item, errSts, true);
	}

	/**
	 * <h2>センタ・荷主別項目マスタのチェック処理を行う（確認ダイアログ表示無し）。</h2>
	 * <pre>
	 * 以下のチェックを行う。
	 * ・項目名存在チェック
	 * ・項目CD重複チェック
	 * ・表示不可の項目チェック
	 * ・編集不可の項目チェック
	 * ・必須項目のチェック
	 * エラーの場合、ステータスコードを設定する。
	 * </pre>
	 * @param bItemList 項目マスタリスト：センタOR荷主区分・センタOR荷主項目ID・画面項目名・画面項目表示可否・画面項目編集可否・画面項目必須・項目ID
	 * @param item 項目マスタ：センタOR荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkCenterClientItemMasterNoneConfirm(List<BItem> bItemList, BItem item, ErrorStatus errSts) {
		checkCenterClientItemMaster(bItemList, item, errSts, false);
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・項目名存在チェック
	 * ・項目CD重複チェック
	 * ・表示不可の項目チェック
	 * ・編集不可の項目チェック
	 * ・必須項目のチェック
	 * </pre>
	 * @param bItemList 項目マスタ画面List
	 * @param item 項目マスタ：センタOR荷主CD
	 * @return ResultSetupData 結果
	 */
	private void checkCenterClientItemMaster(List<BItem> bItemList, BItem item, ErrorStatus errSts, boolean confirm) {
		int rowIndex = -1;

		// チェック処理
		for (BItem bItem : bItemList) {
			rowIndex++;

			if(bItem !=null){
				if(bItem.getCenterClientCls() != null && (bItem.getCenterOrClientItemId() != null ||
						(bItem.getCenterOrClientItemId() == null && (bItem.getScreenItemNm() != null || bItem.getScreenItemVisible() != null ||
								bItem.getScreenItemEditable() != null || bItem.getScreenItemNecessary() != null)))){
					// 項目名存在チェック
					// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//					BDict bDict = new BDict();
//					if(bItem.getScreenItemNm() != null && bItem.getScreenItemNm().length() > 0){
//						bDict.setDictNm(bItem.getScreenItemNm());
//						bDict = dictLogic.getUkEntity(bDict,errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_NAME_DUPLICATE, rowIndex));
//					}
					VDict vDict = new VDict();
					if(bItem.getScreenItemNm() != null && bItem.getScreenItemNm().length() > 0){
						vDict.setDictNm(bItem.getScreenItemNm());
						vDict.setCultureId(getCultureId());
						vDict = vdictLogic.getUkEntity(vDict,errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_NAME_DUPLICATE, rowIndex));
					}
					// [ON推-品向-562] 多言語対応 2015.05.20 ki End

					// 表示不可の項目チェック
					itemLogic.checkVisible(bItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_DIFF_VISIBLE, rowIndex));

					// 表示不可の項目チェック
					itemLogic.checkEditable(bItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_DIFF_EDITABLE, rowIndex));

					// 表示不可の項目チェック
					itemLogic.checkNecessary(bItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_DIFF_NECESSARY, rowIndex));

						//荷主の場合
						if(bItem.getCenterClientCls() != null && bItem.getCenterClientCls().equals("2")){
							MClientItem mClientItem = new MClientItem();
							MClientCB cb = mClientBhv.newMyConditionBean();
							cb.query().setClientCd_Equal(item.getCenterOrClientCd());
							MClient mClient = mClientBhv.selectEntity(cb);

							//項目ID取得
							mClientItem.setItemId(bItem.getItemId());

							// 項目CD重複チェック
							if (bItem.getCenterOrClientItemId() == null) {
								//ログインユーザが選択した荷主ID取得
								mClientItem.setClientId(mClient.getClientId());

								// 登録の場合
								clientItemLogic.checkClientItemCdInsert(mClientItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_NAME_DUPLICATE, rowIndex));
							} else {
								//荷主ID取得
								mClientItem.setClientId(mClient.getClientId());
								//荷主画面ID取得
								mClientItem.setClientItemId(bItem.getCenterOrClientItemId());

								// 修正の場合
								clientItemLogic.checkClientItemCdUpdate(mClientItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_NAME_DUPLICATE, rowIndex));
							}
						}
						if(bItem.getCenterClientCls() != null && bItem.getCenterClientCls().equals("1")){
							//センタの場合
							MCenterItem mCenterItem = new MCenterItem();

							MCenterCB cb = mCenterBhv.newMyConditionBean();
							cb.query().setCenterCd_Equal(item.getCenterOrClientCd());
							MCenter mCenter = mCenterBhv.selectEntity(cb);


							//項目ID取得
							mCenterItem.setItemId(bItem.getItemId());

							// 項目CD重複チェック
							if (bItem.getCenterOrClientItemId() == null) {
								//ログインユーザが選択したセンタID取得
								mCenterItem.setCenterId(mCenter.getCenterId());

								// 登録の場合
								centerItemLogic.checkCenterItemCdInsert(mCenterItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_NAME_DUPLICATE, rowIndex));
							} else {
								//センタID取得
								mCenterItem.setCenterId(mCenter.getCenterId());
								//センタ画面ID取得
								mCenterItem.setCenterItemId(bItem.getCenterOrClientItemId());

								// 修正の場合
								centerItemLogic.checkCenterItemCdUpdate(mCenterItem, errRetSts(errSts,StatusCode.CENTER_CLIENT_ITEM_NAME_DUPLICATE, rowIndex));
							}
						}
					}
				}
			}
		}
	}
