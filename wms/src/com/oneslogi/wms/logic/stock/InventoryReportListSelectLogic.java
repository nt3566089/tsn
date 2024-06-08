package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGetInventoryItemPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGetWholesaleDayPmb;
import com.oneslogi.base.dbflute.exbhv.MMfinvoperationBhv;
import com.oneslogi.base.dbflute.exbhv.TTrinvcheckinfoBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetInventoryItem;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetWholesaleDay;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class InventoryReportListSelectLogic extends AbstractWmsLogic{
	@Inject
	private TTrinvcheckinfoBhv trinvcheckinfoBhv;
	
	@Inject
	private MMfinvoperationBhv mfinvoperationBhv;
	
	/**
	 * (i) コントロールNo.で在庫調査表情報を検索し、在庫調査表項目を取得する。
	 * @param controlNo
	 */
	public List<SqlGetInventoryItem> getTrinvCheckInfo(Long controlNo,String inventoryReportInv) {
		BsSqlGetInventoryItemPmb pmb = new BsSqlGetInventoryItemPmb();
		pmb.setControlNo(controlNo);
		pmb.setInventoryReportInv(inventoryReportInv);
		
		String pathString = TTrinvcheckinfoBhv.PATH_selectSqlGetInventoryItem;
		
		Class<SqlGetInventoryItem> sqlGetInventoryItem = SqlGetInventoryItem.class;
		
		List<SqlGetInventoryItem> tTrinvcheckinfoList =	trinvcheckinfoBhv.outsideSql().selectList(pathString,pmb,sqlGetInventoryItem);
		
		return tTrinvcheckinfoList;
		
	}

	/**
	 * たな卸実施日マスタ取得
	 * @param mCenter
	 * @param mClient
	 * @param systemDt
	 * @return
	 */
	public SqlGetWholesaleDay getWholesaleDay(MCenter mCenter, MClient mClient, String systemDt) {
		BsSqlGetWholesaleDayPmb pmb = new BsSqlGetWholesaleDayPmb();
		String path = MMfinvoperationBhv.PATH_selectSqlGetWholesaleDay;
		
		pmb.setCenterId(mCenter.getCenterId());
		pmb.setClientId(mClient.getClientId());
		pmb.setInvDate(systemDt);
		return mfinvoperationBhv.outsideSql().entityHandling().selectEntity(path, pmb, SqlGetWholesaleDay.class);
	}

}
