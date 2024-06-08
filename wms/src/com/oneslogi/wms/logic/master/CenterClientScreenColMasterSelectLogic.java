package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.BColCB;
import com.oneslogi.base.dbflute.cbean.MCenterColCB;
import com.oneslogi.base.dbflute.cbean.MClientColCB;
import com.oneslogi.base.dbflute.exbhv.BColBhv;
import com.oneslogi.base.dbflute.exentity.BClass;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.BClassLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ・荷主別画面グリッドマスタメンテナンス取得ロジッククラス
 */
public class CenterClientScreenColMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private BColBhv bColBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private BClassLogic bClassLogic;

	/**
	 * <h2>センタ・荷主別画面グリッドマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタ・荷主別画面グリッドマスタ情報を取得する。
	 * 荷主の場合、荷主列マスタと紐付く検索する。
	 * センタの場合、センタ列マスタと紐付く検索する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bCol 列マスタ：項目ID・センタ区分・荷主区分・センタID・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<BCol> 列マスタリスト
	 */
	public List<BCol> select(final BCol bCol, ErrorStatus errSts) {

		List<BCol> result = null;

		//==== 列マスタデータ取得 =====

		//検索条件の設定
		BColCB cb = bColBhv.newMyConditionBean();
		// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
		//cb.setupSelect_BDict();
		cb.setupSelect_VDict(getCultureId());
		// [ON推-品向-562] 多言語対応 2015.05.20 ki End
		cb.setupSelect_BItem();
		//項目IDの設定
		cb.query().setItemId_Equal(bCol.getItemId());
		//表示可の設定
		cb.query().setVisible_Equal("1");

		//ソート順の設定
		cb.query().addOrderBy_ColOrder_Asc();
		cb.query().addOrderBy_ColCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		//===== 列マスタ検索実行 =====
		result = selectList(bColBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}else{
			for (int i = 0; i < result.size();) {
				//表示可否の名称取得
				BClass bClassVisible = new BClass();
				bClassVisible.setClassCd("VISIBLE");

				BClassDtl bClassDtlVisible = new BClassDtl();
				bClassDtlVisible.setClassDtlCd(result.get(i).getVisible());

				bClassDtlVisible = bClassLogic.getUkEntityWithDeletedCheck(bClassVisible,bClassDtlVisible);
				if(bClassDtlVisible != null && bClassDtlVisible.getVDict() != null){
					result.get(i).setVisibleName(bClassDtlVisible.getVDict().getDictNm());
				}
				//編集可否の名称取得
				BClass bClassEditable = new BClass();
				bClassEditable.setClassCd("EDITABLE");

				BClassDtl bClassDtlEditable = new BClassDtl();
				bClassDtlEditable.setClassDtlCd(result.get(i).getEditable());

				bClassDtlEditable = bClassLogic.getUkEntityWithDeletedCheck(bClassEditable,bClassDtlEditable);
				if(bClassDtlEditable != null && bClassDtlEditable.getVDict() != null){
					result.get(i).setEditableName(bClassDtlEditable.getVDict().getDictNm());
				}
				//必須の名称取得
				BClass bClassNecessary = new BClass();
				bClassNecessary.setClassCd("NECESSARY");

				BClassDtl bClassDtlNecessary = new BClassDtl();
				bClassDtlNecessary.setClassDtlCd(result.get(i).getNecessary());

				bClassDtlNecessary = bClassLogic.getUkEntityWithDeletedCheck(bClassNecessary,bClassDtlNecessary);
				if(bClassDtlNecessary != null && bClassDtlNecessary.getVDict() != null){
					result.get(i).setNecessaryName(bClassDtlNecessary.getVDict().getDictNm());
				}
				i++;
			}
		}
		//荷主場合
		if (bCol.getCenterClientCls().equals("2")) {
			//==== 荷主列マスタデータ取得 =====
			bColBhv.loadMClientColList(result, new ConditionBeanSetupper<MClientColCB>() {
				public void setup(MClientColCB mClientColCB) {
					mClientColCB.setupSelect_MClient();
					mClientColCB.setupSelect_VDict(getCultureId());
					mClientColCB.query().setClientId_Equal(bCol.getCenterOrClientId());
				}
			});

			for (int i = 0; i < result.size();) {
				result.get(i).setCenterClientCls(bCol.getCenterClientCls());
				if (result.get(i).getMClientColList().size() > 0) {
					result.get(i).setCenterOrClientColId(result.get(i).getMClientColList().get(0).getClientColId());
					result.get(i).setCenterOrClientId(result.get(i).getMClientColList().get(0).getClientId());
					result.get(i).setScreenColId(result.get(i).getMClientColList().get(0).getColId());
					if (result.get(i).getMClientColList().get(0).getVDict() != null) {
						result.get(i).setScreenColNm(result.get(i).getMClientColList().get(0).getVDict().getDictNm());
					}
					result.get(i).setScreenColVisible(result.get(i).getMClientColList().get(0).getVisible());
					result.get(i).setScreenColEditable(result.get(i).getMClientColList().get(0).getEditable());
					result.get(i).setScreenColNecessary(result.get(i).getMClientColList().get(0).getNecessary());
				}
				i++;
			}

		} else {//センタ場合
				//==== センタ列マスタデータ取得 =====
			bColBhv.loadMCenterColList(result, new ConditionBeanSetupper<MCenterColCB>() {
				public void setup(MCenterColCB mCenterColCB) {
					mCenterColCB.setupSelect_MCenter();
					mCenterColCB.setupSelect_VDict(getCultureId());
					mCenterColCB.query().setCenterId_Equal(bCol.getCenterOrClientId());
				}
			});

			for (int i = 0; i < result.size();) {
				result.get(i).setCenterClientCls(bCol.getCenterClientCls());
				if (result.get(i).getMCenterColList().size() > 0) {
					result.get(i).setCenterOrClientColId(result.get(i).getMCenterColList().get(0).getCenterColId());
					result.get(i).setCenterOrClientId(result.get(i).getMCenterColList().get(0).getCenterId());
					result.get(i).setScreenColId(result.get(i).getMCenterColList().get(0).getColId());
					if (result.get(i).getMCenterColList().get(0).getVDict() != null) {
						result.get(i).setScreenColNm(result.get(i).getMCenterColList().get(0).getVDict().getDictNm());
					}
					result.get(i).setScreenColVisible(result.get(i).getMCenterColList().get(0).getVisible());
					result.get(i).setScreenColEditable(result.get(i).getMCenterColList().get(0).getEditable());
					result.get(i).setScreenColNecessary(result.get(i).getMCenterColList().get(0).getNecessary());
				}
				i++;
			}
		}

		return result;
	}
}