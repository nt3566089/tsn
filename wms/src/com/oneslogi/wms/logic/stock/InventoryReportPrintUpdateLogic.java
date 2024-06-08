package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TTrallinvCB;
import com.oneslogi.base.dbflute.cbean.TTrinvcheckinfoCB;
import com.oneslogi.base.dbflute.cbean.WTrallinvCB;
import com.oneslogi.base.dbflute.exbhv.TTrallinvBhv;
import com.oneslogi.base.dbflute.exbhv.TTrinvcheckinfoBhv;
import com.oneslogi.base.dbflute.exbhv.WTrallinvBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;

/**
 * 在庫調査関連リスト出力処理ロジッククラス。
 */
public class InventoryReportPrintUpdateLogic {
	
	// ===== 使用テーブル =====
	@Inject
	WTrallinvBhv wTrallinvBhv;
	
	@Inject
	TTrallinvBhv tTrallinvBhv;
	
	@Inject
	TTrinvcheckinfoBhv  tTrinvcheckinfoBhv;

	/**
	 * <h2>統合在庫実績ワーク削除。</h2>
	 * <pre>
	 *     統合在庫実績ワーク削除処理。
	 * </pre>
	 * @param mCenter	 センタマスタ
	 * @param mClient   荷主マスタ
	 */
	public void deleteWTrallinv(MCenter mCenter, MClient mClient) {	
		WTrallinvCB cb = wTrallinvBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(mCenter.getCenterId());
		cb.query().setClientId_Equal(mClient.getClientId());
		wTrallinvBhv.queryDelete(cb);				
	}

	/**
	 * <h2>統合在庫実績削除。</h2>
	 * <pre>
	 *     統合在庫実績削除処理。
	 * </pre>
	 * @param mCenter	 センタマスタ
	 * @param mClient   荷主マスタ
	 */
	public void deleteTTrallinv(MCenter mCenter, MClient mClient) {
		TTrallinvCB cb = tTrallinvBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(mCenter.getCenterId());
		cb.query().setClientId_Equal(mClient.getClientId());
		tTrallinvBhv.queryDelete(cb);
	}

	/**
	 * <h2>在庫調査表情報の物理削除。</h2>
	 * <pre>
	 *     在庫調査表情報の物理削除処理。
	 * </pre>
	 * @param mCenter	 センタマスタ
	 * @param mClient   荷主マスタ
	 */
	public void deleteTTrinvcheckinfo(MCenter mCenter, MClient mClient) {
		TTrinvcheckinfoCB cb = tTrinvcheckinfoBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(mCenter.getCenterId());
		cb.query().setClientId_Equal(mClient.getClientId());
		tTrinvcheckinfoBhv.queryDelete(cb);
		
	}


}
