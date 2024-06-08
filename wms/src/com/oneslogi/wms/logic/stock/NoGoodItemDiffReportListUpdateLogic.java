package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.TTrstockdiffhistoryCB;
import com.oneslogi.base.dbflute.exbhv.TTrstockdiffhistoryBhv;
import com.oneslogi.base.dbflute.exentity.TTrinvcheckinfo;
import com.oneslogi.base.dbflute.exentity.TTrstockdiffhistory;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetTotalNumOfMonthAccounts;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class NoGoodItemDiffReportListUpdateLogic  extends AbstractWmsLogic{
	@Inject
	TTrstockdiffhistoryBhv tTrstockdiffhistoryBhv;
	
	/**
	 * (VII) 在庫過不足履歴のコントロールNo.を設定する。
	 * updateControlNo
	 * @param update
	 * @param condition
	 * @param inventoryDateFrom
	 * @param inventoryDateTo
	 * @param totalNumOfMonthAccounts
	 * @param tTrinvcheckinfo
	 * @return
	 */
	public int updateControlNo(TTrstockdiffhistory update, TTrstockdiffhistory condition, String inventoryDateFrom, String inventoryDateTo,
			SqlGetTotalNumOfMonthAccounts totalNumOfMonthAccounts, TTrinvcheckinfo tTrinvcheckinfo) {
		TTrstockdiffhistoryCB cb = tTrstockdiffhistoryBhv.newConditionBean();
		cb.query().setCenterId_Equal(condition.getCenterId());
		cb.query().setClientId_Equal(condition.getClientId());
		cb.query().setGoodItemKbn_Equal("9");
		cb.query().setInoutKbn_Equal(condition.getInoutKbn());
		cb.query().setDiffoccArea_Equal(condition.getDiffoccArea());
		//※1　3.1.(2)(C)(a)(VI)で取得した 決算たな卸月件数 > 0 の時のみ、条件に設定
		if(totalNumOfMonthAccounts.getSettlementinvmonthNum() > 0) {
			cb.query().setDiffaddDate_GreaterEqual(inventoryDateFrom);
			cb.query().setDiffaddDate_LessEqual(inventoryDateTo);
		}else if(totalNumOfMonthAccounts.getSettlementinvmonthNum() == 0){
			//※2　3.1.(2)(C)(a)(VI)で取得した 決算たな卸月件数 == 0 の時のみ、条件に設定
			cb.query().setDiffaddDate_LikeSearch( tTrinvcheckinfo.getExecutedate().substring(0, 6), new LikeSearchOption().likePrefix());
		}
		cb.query().setDelFlg_Equal_$0();
		return tTrstockdiffhistoryBhv.queryUpdate(update, cb);
	}	
	/**
	 * クリアcontrolNo
	 * @param update
	 * @param controlNo
	 */
	public void updateInventoryByControlNo(TTrstockdiffhistory update, Long controlNo) {
		TTrstockdiffhistoryCB cb = tTrstockdiffhistoryBhv.newConditionBean();
		cb.query().setControlNo_Equal(controlNo);
		cb.query().setDelFlg_Equal_$0();
		
		tTrstockdiffhistoryBhv.queryUpdate(update, cb);
		
	}

}
