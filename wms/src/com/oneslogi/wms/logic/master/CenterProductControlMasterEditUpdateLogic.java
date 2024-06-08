package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MMfwhxitemCB;
import com.oneslogi.base.dbflute.exbhv.MMfwhxitemBhv;
import com.oneslogi.base.dbflute.exentity.MMfwhxitem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロケーションマスタメンテナンス更新ロジッククラス
 */
public class CenterProductControlMasterEditUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MMfwhxitemBhv mMfwhxitemBhv;

	/**
	 * <h2>ロケーションマスタを更新する。</h2>
	 * <pre>
	 *
	 * 引数のロケーションマスタを更新する。
	 *
	 * </pre>
	 * @param mLocation ロケーションマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MMfwhxitem mmfwhxitem, ErrorStatus errRetSts) {
		//検索条件
		MMfwhxitemCB cb = mMfwhxitemBhv.newMyConditionBean();
		cb.query().setMfwhItemId_Equal(mmfwhxitem.getMfwhItemId());

		MMfwhxitem updateMMfwhxitem = new MMfwhxitem();
		updateMMfwhxitem.setSlotlocname(mmfwhxitem.getSlotlocname());
		updateMMfwhxitem.setPicklocname(mmfwhxitem.getPicklocname());

		// ===== ロケーションマスタ更新実行 =====
		mMfwhxitemBhv.queryUpdate(updateMMfwhxitem, cb);
	}

}
