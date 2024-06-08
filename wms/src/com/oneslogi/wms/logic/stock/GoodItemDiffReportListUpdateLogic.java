package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TTrstockdiffhistoryCB;
import com.oneslogi.base.dbflute.exbhv.TTrstockdiffhistoryBhv;
import com.oneslogi.base.dbflute.exentity.TTrstockdiffhistory;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class GoodItemDiffReportListUpdateLogic  extends AbstractWmsLogic {

	
	@Inject
	TTrstockdiffhistoryBhv tTrstockdiffhistoryBhv;
	/**
	 *　(VII) 在庫過不足履歴のコントロールNo.を設定する。(i) 以下の条件で在庫過不足履歴を一括更新(queryUpdate)する。
	 * @param update
	 * @param controlNo
	 */
	public int updateControlNo(TTrstockdiffhistory update,TTrstockdiffhistory tTrstockdiffhistoryCondition, String start, String finnish) {
		TTrstockdiffhistoryCB cb = tTrstockdiffhistoryBhv.newConditionBean();
		cb.query().setCenterId_Equal(tTrstockdiffhistoryCondition.getCenterId());
		cb.query().setClientId_Equal(tTrstockdiffhistoryCondition.getClientId());
		cb.query().setGoodItemKbn_Equal(tTrstockdiffhistoryCondition.getGoodItemKbn());
		cb.query().setInoutKbn_Equal(tTrstockdiffhistoryCondition.getInoutKbn());
		cb.query().setDelFlg_Equal_$0();
		cb.query().setDiffaddDate_GreaterEqual(start);
		cb.query().setDamageRefundKbn_Equal(tTrstockdiffhistoryCondition.getDamageRefundKbn());
		cb.query().setDiffaddDate_LessEqual(finnish);
		
		return tTrstockdiffhistoryBhv.queryUpdate(update,cb);
	}
	/**	
	 * クリアcontrolNo
	 * @param update
	 * @param controlNo
	 */
	public void updateInventoryByControlNo(TTrstockdiffhistory update,Long controlNo) {
		TTrstockdiffhistoryCB cb = tTrstockdiffhistoryBhv.newConditionBean();
		cb.query().setControlNo_Equal(controlNo);
		cb.query().setDelFlg_Equal_$0();
		tTrstockdiffhistoryBhv.queryUpdate(update, cb);
		
	}


}
