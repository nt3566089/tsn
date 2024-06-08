package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.BScreenCB;
import com.oneslogi.base.dbflute.cbean.MCenterScreenCB;
import com.oneslogi.base.dbflute.cbean.MClientScreenCB;
import com.oneslogi.base.dbflute.exbhv.BScreenBhv;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面マスタメンテナンス取得ロジッククラス
 */
public class CenterClientScreenMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private BScreenBhv bScreenBhv;

	/**
	 * <h2>センタ・荷主別画面マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ・荷主別画面マスタ情報を取得する。
	 * 荷主の場合、荷主画面マスタと紐付く検索する。
	 * センタの場合、センタ画面マスタと紐付く検索する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bScreen 画面マスタ：センタID・荷主ID・センタ区分・荷主区分
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<BScreen> 画面マスタリスト
	 */
	public List<BScreen> select(final BScreen bScreen, ErrorStatus errSts) {

		List<BScreen> result = null;

		//==== 画面マスタデータ取得 =====

		//検索条件の設定
		BScreenCB cb = bScreenBhv.newMyConditionBean();
		// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
		//cb.setupSelect_BDict();
		cb.setupSelect_VDict(getCultureId());
		// [ON推-品向-562] 多言語対応 2015.05.20 ki End

		//ソート順の設定
		cb.query().addOrderBy_ScreenCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		//===== 画面マスタ検索実行 =====
		result = selectList(bScreenBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		//荷主場合
		if(bScreen.getCenterClientCls().equals("2")){
			//==== 荷主画面マスタデータ取得 =====
			bScreenBhv.loadMClientScreenList(result, new ConditionBeanSetupper<MClientScreenCB>() {
				public void setup(MClientScreenCB mClientScreenCB) {
					mClientScreenCB.setupSelect_MClient();
					mClientScreenCB.setupSelect_VDict(getCultureId());
					mClientScreenCB.query().setClientId_Equal(bScreen.getCenterOrClientId());
				}
			});

			for (int i = 0; i < result.size();) {
				result.get(i).setCenterClientCls(bScreen.getCenterClientCls());
				if(result.get(i).getMClientScreenList().size()>0){
					result.get(i).setCenterOrClientScreenId(result.get(i).getMClientScreenList().get(0).getClientScreenId());
					result.get(i).setCenterOrClientId(result.get(i).getMClientScreenList().get(0).getClientId());
					if(result.get(i).getMClientScreenList().get(0).getVDict() != null){
						result.get(i).setCenterOrClientScreenNm(result.get(i).getMClientScreenList().get(0).getVDict().getDictNm());
					}
					result.get(i).setCenterOrClientScreenVisible(result.get(i).getMClientScreenList().get(0).getVisible());
				}
				i++;
			}

		}else{//センタ場合
			//==== センタ画面マスタデータ取得 =====
			bScreenBhv.loadMCenterScreenList(result, new ConditionBeanSetupper<MCenterScreenCB>() {
				public void setup(MCenterScreenCB mCenterScreenCB) {
					mCenterScreenCB.setupSelect_MCenter();
					mCenterScreenCB.setupSelect_VDict(getCultureId());
					mCenterScreenCB.query().setCenterId_Equal(bScreen.getCenterOrClientId());
				}
			});

			for (int i = 0; i < result.size();) {
				result.get(i).setCenterClientCls(bScreen.getCenterClientCls());
				if(result.get(i).getMCenterScreenList().size()>0){
					result.get(i).setCenterOrClientScreenId(result.get(i).getMCenterScreenList().get(0).getCenterScreenId());
					result.get(i).setCenterOrClientId(result.get(i).getMCenterScreenList().get(0).getCenterId());
					if(result.get(i).getMCenterScreenList().get(0).getVDict() != null){
						result.get(i).setCenterOrClientScreenNm(result.get(i).getMCenterScreenList().get(0).getVDict().getDictNm());
					}
					result.get(i).setCenterOrClientScreenVisible(result.get(i).getMCenterScreenList().get(0).getVisible());

				}
				i++;
			}
		}

		return result;
	}
}