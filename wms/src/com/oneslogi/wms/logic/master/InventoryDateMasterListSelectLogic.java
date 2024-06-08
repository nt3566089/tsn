package com.oneslogi.wms.logic.master;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef.DaysOfWeek;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlInventoryDateMasterListPmb;
import com.oneslogi.base.dbflute.exbhv.MMfinvoperationBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryDateMasterList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.InventoryDateMasterListDto.InventoryDateMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

public class InventoryDateMasterListSelectLogic extends AbstractWmsLogic {



	/** エラーデータ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** エラーデータのみ検索 */
		ERROR_ONLY,
		/** エラー無データのみ検索 */
		NO_ERROR_ONLY
	}

	//===== 使用テーブル =====
	@Inject
	private MMfinvoperationBhv mMfinvoperationBhv;
	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private TsnClassLogic tsnClassLogic;


	// ===== 定数定義 =====
	private static final String CLASS_CD_SUNDAY_FLG = "SUNDAY_FLG";

	private static final String CLASS_CD_DAYS_OF_WEEK = "DAYS_OF_WEEK";

	public static final String PROPERTY_NM = "allowQueryCount";


	//////////////////////////////////
	// 引数チェック
	//////////////////////////////////
	public void mappingAndInputCheck(InventoryDateMasterListLogicSearchConditionDto cond, ErrorStatus errSts) {


		//センター

		//必須チェック
		if(cond.getCenterCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
			return;
		}

		//マスタ存在チェック＆ID取得
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(cond.getCenterCd());
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput,errSts);
		//エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			//処理中止
			return;
		}

//		MCenter mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenterInput);
//		if (mCenter == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
//			return;
//		}

		cond.setCenterId(mCenter.getCenterId());


		//荷主

		//必須チェック
		if (cond.getClientCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
			return;
		}

		//マスタ存在チェック＆ID取得
		MClient mClientInput = new MClient();
		mClientInput.setClientCd(cond.getClientCd());
		MClient mClient = clientLogic.getUkEntity(mClientInput);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return ;
		}


		cond.setClientId(mClient.getClientId());

		return;

	}
//*************検索条件***************//

	public List<SqlInventoryDateMasterList> select(InventoryDateMasterListLogicSearchConditionDto sc, PagingData paging, ErrorStatus errSts) throws Exception {


		//検索条件の設定

		List<SqlInventoryDateMasterList> sqlInventoryDateMasterList = this.getInventoryDateMasterList(sc, paging, errSts);

		// データ未存在
		if (sqlInventoryDateMasterList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;

			}
		//区分名称の補完
		setClassNm(sqlInventoryDateMasterList);


		return sqlInventoryDateMasterList;

		}

	/**
	 * 検索条件を元にデータベースからデータを取得する。
	 */
	public List<SqlInventoryDateMasterList> getInventoryDateMasterList(InventoryDateMasterListLogicSearchConditionDto sc, PagingData paging, ErrorStatus errSts) {


		//////////////////////////////////
		// SQL実行
		//////////////////////////////////
		// 外出しSQLの定義
		String path = MMfinvoperationBhv.PATH_selectSqlInventoryDateMasterList;

		//引数定義
		BsSqlInventoryDateMasterListPmb pmb = new BsSqlInventoryDateMasterListPmb();

		//引数の値を設定

		pmb.setCenterId(sc.getCenterId());
		pmb.setClientId(sc.getClientId());
		/*対象年月日*/

		//[WMS_3.1a.2.2] 対象年月日_あいまい検索 2024/03/13 ma-urate UPD [S]
		//
		pmb.setTargetDate_PrefixSearch(sc.getTargetDate());
		//[WMS_3.1a.2.2] 対象年月日_あいまい検索 2024/03/13 ma-urate UPD [E]

		/*日曜フラグ*/
		pmb.setSundayFlg(sc.getSundayFlg());

		// 検索実行
		Class<SqlInventoryDateMasterList> entityType = SqlInventoryDateMasterList.class;
		List<SqlInventoryDateMasterList> sqlInventoryDateMasterList;


		sqlInventoryDateMasterList = selectPage(mMfinvoperationBhv, path, pmb, entityType, paging);
		//sqlInventoryDateMasterList = mMfinvoperationBhv.outsideSql().selectList(path, pmb, entityType);


		return sqlInventoryDateMasterList;

	}

	// throws Exception
	private void setClassNm(List<SqlInventoryDateMasterList> SqlInventoryDateMasterList)  throws Exception{

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		//[WMS_3.1a.2.2] 対象年月日とたな卸実施日から曜日に変換して表示 修正 2024/03/18 ma-urate UPD [S]

		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_SUNDAY_FLG,CLASS_CD_DAYS_OF_WEEK);



		Calendar cal = Calendar.getInstance();
		// 名称項目を変換
		for (SqlInventoryDateMasterList SqlInventoryDateMaster : SqlInventoryDateMasterList) {
		//	SqlInventoryDateMaster.setSundayFlgNm(classNmMap.get(CLASS_CD_SUNDAY_FLG).get(SqlInventoryDateMaster.getSundayFlg()));

			SqlInventoryDateMaster.setSundayFlgNm(classNmMap.get(CLASS_CD_SUNDAY_FLG).get(SqlInventoryDateMaster.getSundayFlg()));


			//日付から曜日を取得する

//			int targetdate	=	Integer.parseInt((SqlInventoryDateMaster.getTargetDate()));
//			int invdate	=	Integer.parseInt((SqlInventoryDateMaster.getInvDate()));

//			cal.set(targetdate);

			cal.setTime(CU.stringToDate((SqlInventoryDateMaster.getTargetDate())));

			DaysOfWeek dayOfTheWeekFlg = getDayOfWeek(cal);
			SqlInventoryDateMaster.setTargetDateEdit(classNmMap.get(CLASS_CD_DAYS_OF_WEEK).get(dayOfTheWeekFlg.code()));


			//SqlInventoryDateMaster.setTargetDateEdit(getDayOfWeek(cal));

			cal.setTime(CU.stringToDate((SqlInventoryDateMaster.getInvDate())));

			DaysOfWeek dayOfTheWeekFlg2 = getDayOfWeek(cal);
			SqlInventoryDateMaster.setInvDateEdit(classNmMap.get(CLASS_CD_DAYS_OF_WEEK).get(dayOfTheWeekFlg2.code()));
			//[WMS_3.1a.2.2]  対象年月日とたな卸実施日から曜日に変換して表示 修正 2024/03/18 ma-urate UPD [E]
			//SqlInventoryDateMaster.setInvDateEdit(getDayOfWeek(cal));

		}

		return;
	}
	private  DaysOfWeek getDayOfWeek (Calendar cal) {
	//String dayOfWeek = "";

	DaysOfWeek dayOfTheWeekFlg = null;

	switch(cal.get(Calendar.DAY_OF_WEEK)) {
	case Calendar.SUNDAY:
		//日曜日
		dayOfTheWeekFlg = DaysOfWeek.$7;
		break;
	case Calendar.MONDAY:
		//月曜日
		dayOfTheWeekFlg = DaysOfWeek.$1;
		break;
	case Calendar.TUESDAY:
		//火曜日
		dayOfTheWeekFlg = DaysOfWeek.$2;
		break;
	case Calendar.WEDNESDAY:
		//水曜日
		dayOfTheWeekFlg = DaysOfWeek.$3;
		break;
	case Calendar.THURSDAY:
		//木曜日
		dayOfTheWeekFlg = DaysOfWeek.$4;
		break;
	case Calendar.FRIDAY:
		//金曜日
		dayOfTheWeekFlg = DaysOfWeek.$5;
		break;
	case Calendar.SATURDAY:
		//土曜日
		dayOfTheWeekFlg = DaysOfWeek.$6;
		break;
	}
//	private String getDayOfWeek (Calendar cal) {
//		String dayOfWeek = "";
//
//		switch (cal.get(Calendar.DAY_OF_WEEK)) {
//		    case Calendar.SUNDAY:     // Calendar.SUNDAY:1
//		        //日曜日
//		    	dayOfWeek = "(日)";
//		        break;
//		    case Calendar.MONDAY:     // Calendar.MONDAY:2
//		        //月曜日
//		    	dayOfWeek = "(月)";
//		        break;
//		    case Calendar.TUESDAY:    // Calendar.TUESDAY:3
//		        //火曜日
//		    	dayOfWeek = "(火)";
//		        break;
//		    case Calendar.WEDNESDAY:  // Calendar.WEDNESDAY:4
//		        //水曜日
//		    	dayOfWeek = "(水)";
//		        break;
//		    case Calendar.THURSDAY:   // Calendar.THURSDAY:5
//		        //木曜日
//		    	dayOfWeek = "(木)";
//		        break;
//		    case Calendar.FRIDAY:     // Calendar.FRIDAY:6
//		        //金曜日
//		    	dayOfWeek = "(金)";
//		        break;
//		    case Calendar.SATURDAY:   // Calendar.SATURDAY:7
//		        //土曜日
//		    	dayOfWeek = "(土)";
//		        break;
//			}

		return dayOfTheWeekFlg;
	}
}



