package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCblkCB;
import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ブロックマスタ共通ロジッククラス
 */
public class BlockLogic extends AbstractWmsLogic {

	@Inject
	MCblkBhv mCblkBhv;

	public MCblk getUkEntity(Long centerId, String blkcd, ErrorStatus errSts) {
		return getUkEntity(centerId, blkcd, errSts, true);
	}


	public MCblk getUkEntity(Long centerId, String blkcd, ErrorStatus errSts, Boolean isAutoDelFlg) {
		// ユニークキー未設定の場合は標準版に合わせてスキップ
		if (centerId == null) {
			return null;
		}
		if (blkcd == null) {
			return null;
		}


		Boolean backupAutoDelFlg = this.getBehaviorAutoDelFlg();;
		// 削除フラグの条件付加を停止する
		if (isAutoDelFlg == false) {
			this.setBehaviorAutoDelFlg(false);
		}

		MCblkCB cb = mCblkBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setBlkcd_Equal(blkcd);
		MCblk mCblk = mCblkBhv.selectEntity(cb);

		// 削除フラグの条件付加を復元
		this.setBehaviorAutoDelFlg(backupAutoDelFlg);

		if (mCblk == null) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.BLOCK_NOT_FOUND_ERROR);
			return null;
		}

		return mCblk;
	}

	public MCblk getUkEntity(Long centerId, String blkcd) {
		return getUkEntity(centerId, blkcd, null, true);
	}
	public MCblk getUkEntity(Long centerId, String blkcd, Boolean isAutoDelFlg) {
		return getUkEntity(centerId, blkcd, null,isAutoDelFlg);
	}

	public MCblk getUkEntityByName(Long centerId, String blknm, ErrorStatus errSts, Boolean isAutoDelFlg) {
		// ユニークキー未設定の場合は標準版に合わせてスキップ
		if (centerId == null) {
			return null;
		}
		if (blknm == null) {
			return null;
		}


		Boolean backupAutoDelFlg = this.getBehaviorAutoDelFlg();;
		// 削除フラグの条件付加を停止する
		if (isAutoDelFlg == false) {
			this.setBehaviorAutoDelFlg(false);
		}

		MCblkCB cb = mCblkBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setBlknm_Equal(blknm);
		MCblk mCblk = mCblkBhv.selectEntity(cb);

		// 削除フラグの条件付加を復元
		this.setBehaviorAutoDelFlg(backupAutoDelFlg);

		if (mCblk == null) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.BLOCK_NOT_FOUND_ERROR);
			return null;
		}

		return mCblk;
	}



}
