package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MBoxGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.base.dbflute.exentity.MBoxGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.BoxLogic;

/**
 * 荷材グループマスタメンテナンス更新ロジッククラス
 */
public class BoxGroupMasterEditUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MBoxGrpBhv mBoxGrpBhv;
	@Inject
	private MBoxGrpDtlBhv mBoxGrpDtlBhv;
	@Inject
	private BoxLogic boxLogic;

	/**
	 * <h2>荷材グループマスタデータを更新する。</h2>
	 *
	 * <pre>
	 * 荷材グループマスタのデータを更新する。
	 * 荷材グループ明細マスタのデータを削除、登録する。
	 * </pre>
	 *
	 * @param mBoxGrp 荷材グループマスタ：全項目
	 * @param mBoxGrpDtlList 荷材グループ明細マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MBoxGrp mBoxGrp, List<MBoxGrpDtl> mBoxGrpDtlList, ErrorStatus errSts) {


		MBox mboxHead = new MBox();
		mboxHead.setCenterId(mBoxGrp.getCenterId());
		mboxHead.setBoxCd(mBoxGrp.getMBox().getBoxCd());
		mboxHead=boxLogic.getUkEntity(mboxHead);

		mBoxGrp.setStandardBoxId(mboxHead.getBoxId());
		// 荷材グループマスタの更新実行
		mBoxGrpBhv.update(mBoxGrp);

		if(mBoxGrp.isDelFlg$1()){
			return;
		}

		MBoxGrpDtlCB cbDel = mBoxGrpDtlBhv.newMyConditionBean();
		cbDel.query().setBoxGrpId_Equal(mBoxGrp.getBoxGrpId());
		mBoxGrpDtlBhv.queryDelete(cbDel);

		// 荷材グループ明細マスタリストのデータ件数分繰返
		for(MBoxGrpDtl mBoxGrpDtlEnt : mBoxGrpDtlList){
			//荷材ID取得
			MBox mbox = new MBox();
			mbox.setCenterId(mBoxGrp.getCenterId());
			mbox.setBoxCd(mBoxGrpDtlEnt.getMBox().getBoxCd());
			mbox=boxLogic.getUkEntity(mbox);
			// 荷材グループID
			mBoxGrpDtlEnt.setBoxGrpId(mBoxGrp.getBoxGrpId());
			// 荷材ID
			mBoxGrpDtlEnt.setBoxId(mbox.getBoxId());
			mBoxGrpDtlBhv.insert(mBoxGrpDtlEnt);
		}


	}
}
