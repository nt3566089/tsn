package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ShapeLogic;

/**
 * 荷姿グループマスタメンテナンス登録ロジッククラス
 */
public class ShapeGroupMasterEditInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MShapeGrpBhv mShapeGrpBhv;
	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;
	@Inject
	private ShapeLogic shapeLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>荷姿グループマスタデータを登録する。</h2>
	 * <pre>
	 * 引数で受け取ったデータを荷姿グループマスタと荷姿グループ明細マスタに登録する。
	 * </pre>
	 * @param mShapeGrp 荷姿グループマスタ：全項目
	 * @param mShapeGrpDtlList 荷姿グループ明細マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MShapeGrp mShapeGrp, List<MShapeGrpDtl> mShapeGrpDtlList, ErrorStatus errSts) {
		//荷主ID取得
		MClient mclient = new MClient();
		mclient.setClientCd(mShapeGrp.getMClient().getClientCd());
		mclient=clientLogic.getUkEntity(mclient);
		mShapeGrp.setClientId(mclient.getClientId());

		//荷姿グループマスタの登録実行
		mShapeGrpBhv.insert(mShapeGrp);

		// =====  荷姿グループ明細マスタ登録実行 =====
		for(MShapeGrpDtl mShapeGrpDtlEnt : mShapeGrpDtlList){
			if (mShapeGrpDtlEnt.isDelFlg$0()) {
				//荷姿ID取得
				MShape mshape = new MShape();
				mshape.setShapeCd(mShapeGrpDtlEnt.getMShape().getShapeCd());
				mshape=shapeLogic.getUkEntity(mshape);
				// 荷材ID
				mShapeGrpDtlEnt.setShapeId(mshape.getShapeId());
				// 荷姿グループID
				mShapeGrpDtlEnt.setShapeGrpId(mShapeGrp.getShapeGrpId());
				//緊急補充ゾーン補充荷姿
				if (mShapeGrpDtlEnt.getEmReplenishShapeFlg()==null) {
					mShapeGrpDtlEnt.setEmReplenishShapeFlg_$0();
				}
				//ケースピッキング対象
				if (mShapeGrpDtlEnt.getCasePickFlg()==null) {
					mShapeGrpDtlEnt.setCasePickFlg_$0();
				}
				mShapeGrpDtlBhv.insert(mShapeGrpDtlEnt);
			}
		}
	}
}