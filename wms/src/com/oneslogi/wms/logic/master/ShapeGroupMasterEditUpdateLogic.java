package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ShapeLogic;

/**
 * 荷姿グループマスタメンテナンス更新ロジッククラス
 */
public class ShapeGroupMasterEditUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MShapeGrpBhv mShapeGrpBhv;
	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;
	@Inject
	private ShapeLogic shapeLogic;

	/**
	 * <h2>荷姿グループマスタデータを更新する。</h2>
	 *
	 * <pre>
	 * 荷姿グループマスタのデータを更新する。
	 * 荷姿グループ明細マスタのデータを削除、登録する。
	 * </pre>
	 *
	 * @param mShapeGrp 荷姿グループマスタ：全項目
	 * @param mShapeGrpDtlList 荷姿グループ明細マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MShapeGrp mShapeGrp, List<MShapeGrpDtl> mShapeGrpDtlList, ErrorStatus errSts) {
		//ヘッダ．削除が「１：削除」の場合
		if(mShapeGrp.isDelFlg$1()){
			//荷姿グループマスタの論理削除処理
			mShapeGrpBhv.update(mShapeGrp);

			//荷姿グループ明細マスタの論理削除処理
			// 荷姿グループ明細マスタリストのデータ件数分繰返
			for(MShapeGrpDtl mShapeGrpDtlEnt : mShapeGrpDtlList){
				mShapeGrpDtlEnt.setDelFlg_$1();
				//荷姿グループ明細マスタの更新実行
				mShapeGrpDtlBhv.update(mShapeGrpDtlEnt);
			}
		} else {
			// 荷姿グループマスタの更新実行
			mShapeGrpBhv.update(mShapeGrp);

			// 荷姿グループ明細マスタリストのデータ件数分繰返
			for(MShapeGrpDtl mShapeGrpDtlEnt : mShapeGrpDtlList){
				//明細．削除が「１：削除」の場合
				if (mShapeGrpDtlEnt.getDelFlg().equals("1")) {
					//荷姿グループ明細マスタの物理削除処理
					// 削除フラグ自動検索無効化
					this.setBehaviorAutoDelFlg(false);
					MShapeGrpDtlCB cbDel = mShapeGrpDtlBhv.newMyConditionBean();
					cbDel.query().setShapeGrpDtlId_Equal(mShapeGrpDtlEnt.getShapeGrpDtlId());
					mShapeGrpDtlBhv.queryDelete(cbDel);
				} else {
					if (mShapeGrpDtlEnt.getShapeGrpDtlId() == null) {
						//荷姿ID取得
						MShape mshape = new MShape();
						mshape.setShapeCd(mShapeGrpDtlEnt.getMShape().getShapeCd());
						mshape=shapeLogic.getUkEntity(mshape);
						// 荷姿グループID
						mShapeGrpDtlEnt.setShapeGrpId(mShapeGrp.getShapeGrpId());
						// 荷材ID
						mShapeGrpDtlEnt.setShapeId(mshape.getShapeId());
						// バージョンNo.
						mShapeGrpDtlEnt.setVersionNo(mShapeGrp.getVersionNo());
						//緊急補充ゾーン補充荷姿
						if (mShapeGrpDtlEnt.getEmReplenishShapeFlg()==null) {
							mShapeGrpDtlEnt.setEmReplenishShapeFlg_$0();
						}
						//ケースピッキング対象
						if (mShapeGrpDtlEnt.getCasePickFlg()==null) {
							mShapeGrpDtlEnt.setCasePickFlg_$0();
						}
						//荷姿グループ明細マスタの更新実行
						mShapeGrpDtlBhv.insert(mShapeGrpDtlEnt);
					} else {
						//荷姿ID取得
						MShape mshape = new MShape();
						mshape.setShapeCd(mShapeGrpDtlEnt.getMShape().getShapeCd());
						mshape=shapeLogic.getUkEntity(mshape);
						// 荷材ID
						mShapeGrpDtlEnt.setShapeId(mshape.getShapeId());
						//荷姿グループ明細マスタの更新実行
						mShapeGrpDtlBhv.update(mShapeGrpDtlEnt);
					}
				}
			}
		}
	}
}
