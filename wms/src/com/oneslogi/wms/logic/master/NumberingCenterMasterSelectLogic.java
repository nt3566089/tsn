package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MNumberingCenterCB;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタ採番マスタメンテナンス取得ロジッククラス。
 */
public class NumberingCenterMasterSelectLogic extends AbstractWmsLogic {

	@Inject
	MNumberingCenterBhv mNumberingCenterBhv;

	/**
	 * @param mNumberingCenter センタ採番マスタ
	 * @param errSts エラー時使用するエラーステータス
	 * @return
	 */
	public List<MNumberingCenter> select(MNumberingCenter mNumberingCenter, ErrorStatus errSts){
		List<MNumberingCenter> result = null;

		// ==========センタ採番マスタデータ取得=========
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MNumberingCenterCB cb = mNumberingCenterBhv.newMyConditionBean();

		cb.setupSelect_MCenter();

		cb.query().setCenterId_Equal(mNumberingCenter.getCenterId());

		cb.query().setBizCd_PrefixSearch(mNumberingCenter.getBizCd());
		cb.query().setBizNm_LikeSearch(mNumberingCenter.getBizNm(), new LikeSearchOption().likeContain());
		cb.query().setDelFlg_Equal(mNumberingCenter.getDelFlg());
		cb.query().setUserEditable_Equal_$1();
		cb.query().addOrderBy_NumberingCenterId_Asc();


		result = selectList(mNumberingCenterBhv, cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

}
