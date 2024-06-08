package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.BItemCB;
import com.oneslogi.base.dbflute.cbean.MCenterItemCB;
import com.oneslogi.base.dbflute.cbean.MClientItemCB;
import com.oneslogi.base.dbflute.exbhv.BItemBhv;
import com.oneslogi.base.dbflute.exentity.BItem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面項目マスタメンテナンス取得ロジッククラス
 */
public class CenterClientScreenItemMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private BItemBhv bItemBhv;

	/**
	 * <h2>センタ・荷主別画面項目マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ・荷主別画面項目マスタ情報を取得する。
	 * 荷主の場合、荷主項目マスタと紐付く検索する。
	 * センタの場合、センタ項目マスタと紐付く検索する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bItem 項目マスタ：センタ区分・荷主区分・画面ID・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<BItem> 項目マスタリスト
	 */
	public List<BItem> select(final BItem bItem, ErrorStatus errSts) {

		List<BItem> result = null;

		//==== 項目マスタデータ取得 =====

		//検索条件の設定
		BItemCB cb = bItemBhv.newMyConditionBean();
		// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
		//cb.setupSelect_BDict();
		cb.setupSelect_VDict(getCultureId());
		// [ON推-品向-562] 多言語対応 2015.05.20 ki End
		cb.setupSelect_BScreen();
		//表示可否の設定
		cb.setupSelect_BClassDtlByVisible().withVDict(getCultureId());
		//編集可否の設定
		cb.setupSelect_BClassDtlByEditable().withVDict(getCultureId());
		//必須の設定
		cb.setupSelect_BClassDtlByNecessary().withVDict(getCultureId());
		//画面IDの設定
		cb.query().setScreenId_Equal(bItem.getScreenId());
		//表示可の設定
		cb.query().setVisible_Equal("1");

		//ソート順の設定
		cb.query().addOrderBy_ItemCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		//===== 項目マスタ検索実行 =====
		result = selectList(bItemBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		//荷主場合
		if(bItem.getCenterClientCls().equals("2")){
			//==== 荷主項目マスタデータ取得 =====
			bItemBhv.loadMClientItemList(result, new ConditionBeanSetupper<MClientItemCB>() {
				public void setup(MClientItemCB mClientItemCB) {
					mClientItemCB.setupSelect_MClient();
					mClientItemCB.setupSelect_VDict(getCultureId());
					mClientItemCB.query().setClientId_Equal(bItem.getCenterOrClientId());
				}
			});

			for (int i = 0; i < result.size();) {
				result.get(i).setCenterClientCls(bItem.getCenterClientCls());
				if(result.get(i).getMClientItemList().size()>0){
					result.get(i).setCenterOrClientItemId(result.get(i).getMClientItemList().get(0).getClientItemId());
					result.get(i).setCenterOrClientId(result.get(i).getMClientItemList().get(0).getClientId());
					result.get(i).setScreenItemId(result.get(i).getMClientItemList().get(0).getItemId());
					if(result.get(i).getMClientItemList().get(0).getVDict() != null){
						result.get(i).setScreenItemNm(result.get(i).getMClientItemList().get(0).getVDict().getDictNm());
					}
					result.get(i).setScreenItemVisible(result.get(i).getMClientItemList().get(0).getVisible());
					result.get(i).setScreenItemEditable(result.get(i).getMClientItemList().get(0).getEditable());
					result.get(i).setScreenItemNecessary(result.get(i).getMClientItemList().get(0).getNecessary());
				}
				i++;
			}

		}else{//センタ場合
			//==== センタ項目マスタデータ取得 =====
			bItemBhv.loadMCenterItemList(result, new ConditionBeanSetupper<MCenterItemCB>() {
				public void setup(MCenterItemCB mCenterItemCB) {
					mCenterItemCB.setupSelect_MCenter();
					mCenterItemCB.setupSelect_VDict(getCultureId());
					mCenterItemCB.query().setCenterId_Equal(bItem.getCenterOrClientId());
				}
			});

			for (int i = 0; i < result.size();) {
				result.get(i).setCenterClientCls(bItem.getCenterClientCls());
				if(result.get(i).getMCenterItemList().size()>0){
					result.get(i).setCenterOrClientItemId(result.get(i).getMCenterItemList().get(0).getCenterItemId());
					result.get(i).setCenterOrClientId(result.get(i).getMCenterItemList().get(0).getCenterId());
					result.get(i).setScreenItemId(result.get(i).getMCenterItemList().get(0).getItemId());
					if(result.get(i).getMCenterItemList().get(0).getVDict() != null){
						result.get(i).setScreenItemNm(result.get(i).getMCenterItemList().get(0).getVDict().getDictNm());
					}
					result.get(i).setScreenItemVisible(result.get(i).getMCenterItemList().get(0).getVisible());
					result.get(i).setScreenItemEditable(result.get(i).getMCenterItemList().get(0).getEditable());
					result.get(i).setScreenItemNecessary(result.get(i).getMCenterItemList().get(0).getNecessary());
				}
				i++;
			}
		}

		return result;
	}
}