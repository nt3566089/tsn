package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.allcommon.CDef.DelFlg;
import com.oneslogi.base.dbflute.cbean.TTrinvcheckinfoCB;
import com.oneslogi.base.dbflute.exbhv.TTrinvcheckinfoBhv;
import com.oneslogi.base.dbflute.exentity.TTrinvcheckinfo;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class InventoryReportListUpdateLogic extends AbstractWmsLogic {

	@Inject
	private TTrinvcheckinfoBhv tTrinvcheckinfoBhv;
	
	/**
	 * (VII) 在庫調査表情報のコントロールNo.を設定する。
	 * 在庫調査表情報を一括更新(queryUpdate)する。
	 * @param update
	 * @param condition
	 * @param systemDt
	 * @param productCd
	 */
	public int updateControlNo(TTrinvcheckinfo update,TTrinvcheckinfo condition,String systemDt,String unmatch,String productCd) {
		TTrinvcheckinfoCB cb = tTrinvcheckinfoBhv.newConditionBean();
		Long centerId = condition.getCenterId();
		Long clientId = condition.getClientId();
		String executeDate = condition.getExecutedate();
		
		cb.query().setCenterId_Equal(centerId);
		cb.query().setClientId_Equal(clientId);
		cb.query().setExecutedate_Equal(executeDate);
		//※1　検索条件が入力されていない場合は、条件から除外
		cb.query().setInoutkbn_Equal(condition.getInoutkbn());
		
		if (productCd!= null) {
			cb.query().queryMProduct().setClientId_Equal(clientId);
			cb.query().queryMProduct().setProductCd_LikeSearch(productCd, new LikeSearchOption().likePrefix());
			cb.query().queryMProduct().setDelFlg_Equal_$0();
		}
		
		//※2　検索.CAP銘柄区分 == '1'(CAP製品除く)の時のみ、条件に設定
		if("1".equals(condition.getCapitemflg())){
			cb.query().setCapitemflg_NotEqual("1");
		}
		
		//※3　検索.アンマッチ有 == 1(アンマッチ有のみ表示)の時のみ、条件に設定
		if("1".equals(unmatch)){
			cb.orScopeQuery(new OrQuery<TTrinvcheckinfoCB>() {
				
				@Override
				public void query(TTrinvcheckinfoCB orCb) {
					orCb.query().setExcesstotalinv_NotEqual(WCC.ZERO);
					orCb.query().setDefecttotalinv_NotEqual(WCC.ZERO);
				}
			});
		}
		
		cb.query().setDelFlg_Equal_AsDelFlg(DelFlg.$0);
		return tTrinvcheckinfoBhv.queryUpdate(update,cb);
	}
	/**
	 * クリアcontrolNo
	 * @param update
	 * @param controlNo
	 */
	public void updateInventoryByControlNo(TTrinvcheckinfo update,Long controlNo) {
		TTrinvcheckinfoCB cb = tTrinvcheckinfoBhv.newConditionBean();
		
		cb.query().setControlNo_Equal(controlNo);
		cb.query().setDelFlg_Equal_$0();
		
		tTrinvcheckinfoBhv.queryUpdate(update, cb);
	}

}
