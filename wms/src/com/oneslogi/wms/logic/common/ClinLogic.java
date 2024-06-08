package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MClinCB;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ラインマスタ共通ロジッククラス
 */
public class ClinLogic extends AbstractWmsLogic {

	@Inject
	MClinBhv mClinBhv;


	public MClin getUkEntity(Long centerId, String lincd, ErrorStatus errSts) {
		return getUkEntity(centerId, lincd, errSts, true);
	}


	public MClin getUkEntity(Long centerId, String lincd, ErrorStatus errSts, Boolean isAutoDelFlg) {
		// ユニークキー未設定の場合は標準版に合わせてスキップ
		if (centerId == null) {
			return null;
		}
		if (lincd == null) {
			return null;
		}


		Boolean backupAutoDelFlg = this.getBehaviorAutoDelFlg();;
		// 削除フラグの条件付加を停止する
		if (isAutoDelFlg == false) {
			this.setBehaviorAutoDelFlg(false);
		}

		MClinCB cb = mClinBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setLincd_Equal(lincd);
		MClin mClin = mClinBhv.selectEntity(cb);

		// 削除フラグの条件付加を復元
		this.setBehaviorAutoDelFlg(backupAutoDelFlg);

		if (mClin == null) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return null;
		}

		return mClin;
	}

	public MClin getUkEntity(Long centerId, String lincd) {
		return getUkEntity(centerId, lincd, null, true);
	}
	public MClin getUkEntity(Long centerId, String lincd, Boolean isAutoDelFlg) {
		return getUkEntity(centerId, lincd, null,isAutoDelFlg);
	}


	public MClin getUkEntityByName(Long centerId, String linnm, ErrorStatus errSts, Boolean isAutoDelFlg) {
		// ユニークキー未設定の場合は標準版に合わせてスキップ
		if (centerId == null) {
			return null;
		}
		if (linnm == null) {
			return null;
		}


		Boolean backupAutoDelFlg = this.getBehaviorAutoDelFlg();;
		// 削除フラグの条件付加を停止する
		if (isAutoDelFlg == false) {
			this.setBehaviorAutoDelFlg(false);
		}

		MClinCB cb = mClinBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setLinnm_Equal(linnm);
		MClin mClin = mClinBhv.selectEntity(cb);

		// 削除フラグの条件付加を復元
		this.setBehaviorAutoDelFlg(backupAutoDelFlg);

		if (mClin == null) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return null;
		}

		return mClin;
	}



}
