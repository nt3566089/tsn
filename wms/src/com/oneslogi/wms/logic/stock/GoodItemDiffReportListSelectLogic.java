package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGetFinishInvDatePmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGetStartInvDatePmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGoodItemDiffReportListCenterPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGoodItemDiffReportListCountPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlGoodItemDiffReportListPmb;
import com.oneslogi.base.dbflute.exbhv.MMfinvoperationBhv;
import com.oneslogi.base.dbflute.exbhv.TTrstockdiffhistoryBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrinvcheckinfo;
import com.oneslogi.base.dbflute.exentity.TTrstockdiffhistory;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetFinishInvDate;
import com.oneslogi.base.dbflute.exentity.customize.SqlGetStartInvDate;
import com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportList;
import com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportListCenter;
import com.oneslogi.base.dbflute.exentity.customize.SqlGoodItemDiffReportListCount;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class GoodItemDiffReportListSelectLogic  extends AbstractWmsLogic {
	
	@Inject
	TTrstockdiffhistoryBhv tTrstockdiffhistoryBhv;
	
	@Inject
	private MMfinvoperationBhv mfinvoperationBhv;
	
	/**
	 * //(i) 変数.対象データ無フラグ == '0'(印刷対象あり) の場合
	 * @param condition
	 * @param executedate
	 * @param printCount
	 * @param emptyFlag
	 * @return
	 */
	public List<SqlGoodItemDiffReportList> getGoodItemDiffReportList(TTrstockdiffhistory condition, String executedate, int printCount,
			String emptyFlag) {
		BsSqlGoodItemDiffReportListPmb pmb = new BsSqlGoodItemDiffReportListPmb();
		pmb.setEmptyFlag(emptyFlag);
		pmb.setPrintCount(Long.valueOf(printCount));
		pmb.setControlNo(condition.getControlNo());
		pmb.setInvDate(executedate);
		String path = TTrstockdiffhistoryBhv.PATH_selectSqlGoodItemDiffReportList;
		return tTrstockdiffhistoryBhv.outsideSql().selectList(path,pmb,SqlGoodItemDiffReportList.class);
	}
	
	/**
	 * (ii) 変数.対象データ無フラグ == '1'(印刷対象なし) の場合
	 * @param update
	 * @param executedate
	 * @param printCount
	 * @param emptyFlag
	 * @return
	 */
	public SqlGoodItemDiffReportListCenter getGoodItemDiffReportListCenter(TTrstockdiffhistory update, String executedate, int printCount,
			String emptyFlag) {
		BsSqlGoodItemDiffReportListCenterPmb pmb = new BsSqlGoodItemDiffReportListCenterPmb();
		pmb.setEmptyFlag(emptyFlag);
		pmb.setPrintCount(Long.valueOf(printCount));
		pmb.setInvDate(executedate);
		pmb.setUserCd(getSessionData().getUserCd());
		pmb.setCenterId(update.getCenterId());
		pmb.setInoutkbn(update.getInoutKbn());
		String path = TTrstockdiffhistoryBhv.PATH_selectSqlGoodItemDiffReportListCenter;
		return tTrstockdiffhistoryBhv.outsideSql().entityHandling().selectEntity(path,pmb,SqlGoodItemDiffReportListCenter.class);
		
	}
	
	/**
	 * (V) たな卸実施日マスタ取得(開始日の取得)
	 * @param mCenter
	 * @param mClient
	 * @param tTrinvcheckinfo
	 * @return
	 */
	public SqlGetStartInvDate getStartInvDate(MCenter mCenter, MClient mClient, TTrinvcheckinfo tTrinvcheckinfo) {
		BsSqlGetStartInvDatePmb startPmb  = new BsSqlGetStartInvDatePmb();
		String startPath = MMfinvoperationBhv.PATH_selectSqlGetStartInvDate;
		// 引数の値を設定
		startPmb.setCenterId(mCenter.getCenterId());
		startPmb.setClientId(mClient.getClientId());
		//在庫調査表情報リストENTITY.在庫実績日
		startPmb.setInvDate(tTrinvcheckinfo.getExecutedate());
		// 検索実行
		return mfinvoperationBhv.outsideSql().entityHandling().selectEntity(startPath, startPmb, SqlGetStartInvDate.class);
	}
	
	/**
	 * (VI) たな卸実施日マスタ取得(終了日の取得)
	 * @param mCenter
	 * @param mClient
	 * @param tTrinvcheckinfo
	 * @return
	 */
	public SqlGetFinishInvDate getFinishInvDate(MCenter mCenter, MClient mClient, TTrinvcheckinfo tTrinvcheckinfo) {
		BsSqlGetFinishInvDatePmb finishPmb  = new BsSqlGetFinishInvDatePmb();
		String finnishPath = MMfinvoperationBhv.PATH_selectSqlGetFinishInvDate;
		// 引数の値を設定
		finishPmb.setCenterId(mCenter.getCenterId());
		finishPmb.setClientId(mClient.getClientId());
		//在庫調査表情報リストENTITY.在庫実績日
		finishPmb.setInvDate(tTrinvcheckinfo.getExecutedate());
		// 検索実行
		return mfinvoperationBhv.outsideSql().entityHandling().selectEntity(finnishPath, finishPmb, SqlGetFinishInvDate.class);
	}
	
	/**
	 * <h2>印刷対象件数の取得。</h2>
	 * <pre>
	 *     印刷対象件数の取得処理。
	 * </pre>
	 * @param controlNo	 コントロールNo.
	 * @return  印刷対象件数
	 */
	public int getReportListCount(Long controlNo) {
		BsSqlGoodItemDiffReportListCountPmb countPmb = new BsSqlGoodItemDiffReportListCountPmb();
		countPmb.setControlNo(controlNo);
		String countPath = TTrstockdiffhistoryBhv.PATH_selectSqlGoodItemDiffReportListCount;
		// 検索実行
		SqlGoodItemDiffReportListCount sqlGoodItemDiffReportListCount = tTrstockdiffhistoryBhv.outsideSql().entityHandling().selectEntity(countPath,countPmb,SqlGoodItemDiffReportListCount.class);
		return sqlGoodItemDiffReportListCount.getNumofprints();
	}




}
