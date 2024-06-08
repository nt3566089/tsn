package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MMfwhxitemCB;
import com.oneslogi.base.dbflute.exbhv.MMfwhxitemBhv;
import com.oneslogi.base.dbflute.exentity.MMfwhxitem;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタマスタメンテナンス取得ロジッククラス
 * @param <SelectCondition>
 * @param <SqlCenterProductControlMasterList>
 */
public class CenterProductControlMasterEditSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MMfwhxitemBhv mMfwhxitemBhv;

	public MMfwhxitem selectByEdit(MMfwhxitem header, ErrorStatus errSts) {

		MMfwhxitemCB cb = mMfwhxitemBhv.newMyConditionBean();

		//結合 拠点別銘柄制御マスタ、銘柄マスタ
		cb.setupSelect_MProduct();
		cb.setupSelect_MClient();
		cb.setupSelect_MCenter();

		//検索条件 拠点別銘柄制御IDの設定
		cb.query().setMfwhItemId_Equal(header.getMfwhItemId());
		//検索条件 削除フラグの設定
		cb.query().setDelFlg_Equal("0");

		//===== 検索実行 =====
		final MMfwhxitem mmfwhxitem = mMfwhxitemBhv.selectEntity(cb);

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
		if (mmfwhxitem == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		List<MMfwhxitem> mmfwhxitemList = new ArrayList<MMfwhxitem>();
		mmfwhxitemList.add(mmfwhxitem);

		return mmfwhxitem;

	}

}