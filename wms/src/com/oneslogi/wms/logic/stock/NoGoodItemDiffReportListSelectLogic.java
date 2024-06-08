package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGetInvDatePmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGetTotalNumOfMonthAccountsPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlNoGoodItemDiffReportListPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlNotGoodItemReportListPmb;
import com.oneslogi.base.dbflute.exbhv.BClassBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MMfinvoperationBhv;
import com.oneslogi.base.dbflute.exbhv.TTrstockdiffhistoryBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlNoGoodItemDiffReportListCountPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrinvcheckinfo;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetInvDate;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetTotalNumOfMonthAccounts;
import com.oneslogi.base.dbflute.exentity.customize.SqlNoGoodItemDiffReportList;
import com.oneslogi.base.dbflute.exentity.customize.SqlNoGoodItemDiffReportListCount;
import com.oneslogi.base.dbflute.exentity.customize.SqlNotGoodItemReportList;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class NoGoodItemDiffReportListSelectLogic extends AbstractWmsLogic{
	
	@Inject
	private BClassBhv bClassBhv;
	
	@Inject
	private MMfinvoperationBhv mMfinvoperationBhv;
	
	@Inject
	private MClientBhv mClientBhv;
	
	@Inject
	private TTrstockdiffhistoryBhv tTrstockdiffhistoryBhv;
	
	/**
	 * 区分値マスタを単一検索、決算たな卸月件数を取得する。
	 * @param executedate
	 * @return
	 */
	public SqlGetTotalNumOfMonthAccounts getTotalNumOfMonthAccounts(String executedate) {
		String pathDTL = BClassBhv.PATH_selectSqlGetTotalNumOfMonthAccounts;
		BsSqlGetTotalNumOfMonthAccountsPmb totalNumOfMonthAccountsPmb = new BsSqlGetTotalNumOfMonthAccountsPmb();
		//在庫調査表情報リストENTITY.在庫実績日
		totalNumOfMonthAccountsPmb.setClassDtlCd(executedate);
		
		return  bClassBhv.outsideSql().entityHandling().selectEntity(pathDTL,totalNumOfMonthAccountsPmb,SqlGetTotalNumOfMonthAccounts.class);
	}

	/**
	 * (V)(i) たな卸実施日マスタを単一検索、たな卸実施日を取得する。
	 * @param mCenter
	 * @param mClient
	 * @param executedate
	 * @return
	 */
	public SqlGetInvDate getInvDate(MCenter mCenter, MClient mClient, String executedate) {
		String pathGetDate =  MMfinvoperationBhv.PATH_selectSqlGetInvDate;
		BsSqlGetInvDatePmb dateInvPmb = new BsSqlGetInvDatePmb();
		
		dateInvPmb.setCenterId(mCenter.getCenterId());
		dateInvPmb.setClientId(mClient.getClientId());
		//在庫調査表情報リストENTITY.在庫実績日
		dateInvPmb.setInvDate(executedate);
		// 検索実行
		return  mMfinvoperationBhv.outsideSql().entityHandling().selectEntity(pathGetDate,dateInvPmb,SqlGetInvDate.class);
	}

	/**
	 * //(VI)(i) 区分値マスタを単一検索、決算たな卸月件数を取得する。
	 * @param controlNo
	 * @return
	 */
	public SqlNoGoodItemDiffReportListCount itemDiffReportListCount(Long controlNo) {
		//(VI)(i) 区分値マスタを単一検索、決算たな卸月件数を取得する。
		String pathNoGoodCount = TTrstockdiffhistoryBhv.PATH_selectSqlNoGoodItemDiffReportListCount;
		SqlNoGoodItemDiffReportListCountPmb noGoodItemDiffReportListCountPmb = new  SqlNoGoodItemDiffReportListCountPmb();
		noGoodItemDiffReportListCountPmb.setControlNo(controlNo);
		
		return tTrstockdiffhistoryBhv.outsideSql().entityHandling().selectEntity(pathNoGoodCount,noGoodItemDiffReportListCountPmb,SqlNoGoodItemDiffReportListCount.class);
	}

	/**
	 * //(ア) コントロールNo.で在庫過不足履歴を検索し、不適品過不足報告書項目を取得する。
	 * @param controlNo
	 * @param executedate
	 * @param valueOf
	 * @param emptyFlag
	 * @return
	 */
	public List<SqlNoGoodItemDiffReportList> noGoodItemDiffReportList(Long controlNo, String executedate, Long printCount,
			String emptyFlag) {
		String pathTTNoGoodReport = TTrstockdiffhistoryBhv.PATH_selectSqlNoGoodItemDiffReportList;
		
		BsSqlNoGoodItemDiffReportListPmb noGoodItemDiffReportListPmb =new BsSqlNoGoodItemDiffReportListPmb();
		noGoodItemDiffReportListPmb.setControlNo(controlNo);
		noGoodItemDiffReportListPmb.setInvDate(executedate);
		noGoodItemDiffReportListPmb.setPrintCount(printCount);
		noGoodItemDiffReportListPmb.setEmptyFlag(emptyFlag);
		return tTrstockdiffhistoryBhv.outsideSql().selectList(pathTTNoGoodReport,noGoodItemDiffReportListPmb,SqlNoGoodItemDiffReportList.class);
		
	}
	
	/**
	 * //拠点マスタを単一検索し、不適品過不足報告書項目を取得する。
	 * @param tTrinvcheckinfo
	 * @param mCenter
	 * @param emptyFlag
	 * @param printNum
	 * @return
	 */
	public SqlNotGoodItemReportList getSqlNotGoodItemReportList(TTrinvcheckinfo tTrinvcheckinfo, MCenter mCenter, String emptyFlag,int printNum){
		//(ii) 変数.対象データ無フラグ == '1'(印刷対象なし) の場合
		//(ア) 拠点マスタを単一検索し、不適品過不足報告書項目を取得する。
		String pathMCNoGoodReport = MClientBhv.PATH_selectSqlNotGoodItemReportList;
		BsSqlNotGoodItemReportListPmb notGoodItemReportListPmb = new BsSqlNotGoodItemReportListPmb();
		notGoodItemReportListPmb.setInvDate(tTrinvcheckinfo.getExecutedate());
		notGoodItemReportListPmb.setInoutkbn(tTrinvcheckinfo.getInoutkbn());
		notGoodItemReportListPmb.setCenterId(mCenter.getCenterId());
		notGoodItemReportListPmb.setEmptyFlag(emptyFlag);
		notGoodItemReportListPmb.setPrintCount(Long.valueOf(printNum));
		notGoodItemReportListPmb.setUserCd(getSessionData().getUserCd());
		//検索実行
		return mClientBhv.outsideSql().entityHandling().selectEntity(pathMCNoGoodReport,notGoodItemReportListPmb,SqlNotGoodItemReportList.class);
	}

}
