package com.oneslogi.wms.logic.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlMLocationMasterListPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlMLocationMasterOutputPmb;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterList;
import com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterOutput;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.LocationMasterDto.LocationMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

public class LocationMasterLogic extends AbstractWmsLogic {

	private static final String TDAYESRCOMPFG_$0 = "0";
	private static final String LIN_BLK_START_CHAR_L = "L";
	private static final String LIN_BLK_START_CHAR_B = "B";
	private static final String CLASS_CD_LOC_GROUP = "LOC_GROUP";
	private static final String CLASS_CD_ALLC_NG_FLG = "ALLC_NG_FLG";
	private static final String CLASS_CD_DEL_FLG = "DEL_FLG";
	private static final String CLASS_CD_LOCKBN = "LOCKBN";
	private static final String CLASS_CD_REPLENISHMENT_ROUNDEDUP_UNIT = "REPLENISHMENT_ROUNDEDUP_UNIT";
	private static final String CLASS_CD_RESTOCKKBN = "RESTOCKKBN";


	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;

	// ===== 使用ロジック =====
	@Inject
	private TsnClassLogic tsnClassLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private  CsrwhadmSelectLogic csrwhadmSelectLogic;
	@Inject
	private ClientCenterLogic clientcenterLogic;





	public void mappingAndInputCheck(LocationMasterListLogicSearchConditionDto cond, ErrorStatus errSts) {

//		//////////////////////////////////////
//		// センタ
//		//////////////////////////////////////
//
//		// 必須チェック
//		if (cond.getCenterCd() == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
//			return;
//		}
//
//		// マスタ存在チェック＆ID取得
//		MCenter mCenterInput = new MCenter();
//		mCenterInput.setCenterCd(cond.getCenterCd());
//		MCenter mCenter = centerLogic.getUkEntityWithDeletedCheck(mCenterInput);
//		if (mCenter == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
//			return;
//		}
//
//		cond.setCenterId(mCenter.getCenterId());


		//////////////////////////////////////
		//荷主
		//////////////////////////////////////

		// 必須チェック
                  		if (cond.getClientCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
			return;
		}

		// マスタ存在チェック＆ID取得
		MClient mClientInput = new MClient();
		mClientInput.setClientCd(cond.getClientCd());
		mClientInput = clientLogic.getUkEntity(mClientInput);
		if (mClientInput == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return ;
		}

		cond.setClientId(mClientInput.getClientId());

		return;

	}

	public String gettingDate(Long centerId, Long clientId, ErrorStatus errSts) {
		// マスタ存在チェック＆ID取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setCenterId(centerId);
			mClientCenter.setClientId(clientId);

			// 共通関数側でエラー設定まで行わない呼び方
			mClientCenter = clientcenterLogic.getUkEntity(mClientCenter, errSts);
			if (getErrorManager().size() > 0) {
				return null;
			}

			return mClientCenter.getSystemDt();

	}



	public List<SqlMLocationMasterList> getLocationMasterListSelect(LocationMasterListLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {


	//////////////////////////////////////
	// 外だしSQLの実行
	//////////////////////////////////////
		List<SqlMLocationMasterList> SqlLocationMasterList = this.getLocationMasterList(searchCondition,paging,errSts);
		// データ未存在
		if (SqlLocationMasterList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}


	//////////////////////////////////////
	// 区分名称の補完
	//////////////////////////////////////
		setClassNm(SqlLocationMasterList);


		return SqlLocationMasterList;


	}




////SQL検索を実行するロジック
	private List<SqlMLocationMasterList> getLocationMasterList(LocationMasterListLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

		String path = MLocationBhv.PATH_selectSqlMLocationMasterList;

		// 引数設定
		BsSqlMLocationMasterListPmb pmb = new BsSqlMLocationMasterListPmb();

		// 引数の値を設定(外だしSQLのWHERE)
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setClientId(searchCondition.getClientId());
		pmb.setLocGroup(searchCondition.getLocGroup());
		pmb.setLocationCd_PrefixSearch(searchCondition.getLocationCd());
		pmb.setAllcNgFlg(searchCondition.getAllocNgFlg());
		pmb.setZone_PrefixSearch(searchCondition.getZone());
		pmb.setDelFlg(searchCondition.getDelFlg());


		// 検索実行
		Class<SqlMLocationMasterList> entityType = SqlMLocationMasterList.class;

		//TODO:PagingResultBean で受け取る必要がある？LIST でよい？
//		List<SqlMLocationMasterList> sqlLocationMasterList;
		PagingResultBean<SqlMLocationMasterList> sqlLocationMasterList = selectPage(mLocationBhv, path, pmb, entityType, paging);


		return sqlLocationMasterList;


	}




	private void setClassNm(List<SqlMLocationMasterList> sqlLocationMasterList) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_LOC_GROUP, CLASS_CD_ALLC_NG_FLG, CLASS_CD_DEL_FLG, CLASS_CD_LOCKBN, CLASS_CD_REPLENISHMENT_ROUNDEDUP_UNIT,CLASS_CD_RESTOCKKBN, CLASS_CD_RESTOCKKBN);


		// 名称項目を変換
		for (SqlMLocationMasterList SqlLocationMasterListMaster : sqlLocationMasterList) {
			SqlLocationMasterListMaster.setLocGroupNm(classNmMap.get(CLASS_CD_LOC_GROUP).get(SqlLocationMasterListMaster.getLocGroup()));			//ロケーショングループ
			SqlLocationMasterListMaster.setAllocNgFlgNm(classNmMap.get(CLASS_CD_ALLC_NG_FLG).get(SqlLocationMasterListMaster.getAllocNgFlg()));	//引当禁止フラグ
			SqlLocationMasterListMaster.setDelFlgNm(classNmMap.get(CLASS_CD_DEL_FLG).get(SqlLocationMasterListMaster.getDelFlg()));				//削除フラグ
			SqlLocationMasterListMaster.setLockbnNm(classNmMap.get(CLASS_CD_LOCKBN).get(SqlLocationMasterListMaster.getLocid()));					//ロケーション区分
			SqlLocationMasterListMaster.setReplenishmentRoundedupUnitNm(classNmMap.get(CLASS_CD_REPLENISHMENT_ROUNDEDUP_UNIT).get(SqlLocationMasterListMaster.getSplrevun()));	//補充切上単位
			SqlLocationMasterListMaster.setTosplmdNm(classNmMap.get(CLASS_CD_RESTOCKKBN).get(SqlLocationMasterListMaster.getTosplmd()));			//補充区分
			SqlLocationMasterListMaster.setPresplmdNm(classNmMap.get(CLASS_CD_RESTOCKKBN).get(SqlLocationMasterListMaster.getPresplmd()));		//補充区分

			if (SqlLocationMasterListMaster.getLocationCd().startsWith(LIN_BLK_START_CHAR_L) == true) {
				SqlLocationMasterListMaster.setLinOrBlock(SqlLocationMasterListMaster.getLinnm());
			}
			else if(SqlLocationMasterListMaster.getLocationCd().startsWith(LIN_BLK_START_CHAR_B) == true){

				SqlLocationMasterListMaster.setLinOrBlock(SqlLocationMasterListMaster.getBlknm());
			}
//
//			SqlLocationMasterListMaster.setLocationCd(SqlLocationMasterListMaster.getLocationCd() + ':' + SqlLocationMasterListMaster.getProductNm());
		}

		return;
	}







	public List<SqlMLocationMasterOutput> getLocationMasterOutputSelect(LocationMasterListLogicSearchConditionDto searchCondition, ErrorStatus errSts) {


		//////////////////////////////////////
		// 外だしSQLの実行
		//////////////////////////////////////
			List<SqlMLocationMasterOutput> SqlLocationMasterOutput = this.getLocationMasterOutput(searchCondition,errSts);
			// データ未存在
			if (SqlLocationMasterOutput.size() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}


		//////////////////////////////////////
		// 区分名称の補完
		//////////////////////////////////////
			setClassNmForOutput(SqlLocationMasterOutput);


			return SqlLocationMasterOutput;


	}


	////SQL検索を実行するロジック
		private List<SqlMLocationMasterOutput> getLocationMasterOutput(LocationMasterListLogicSearchConditionDto searchCondition, ErrorStatus errSts) {

			String path = MLocationBhv.PATH_selectSqlMLocationMasterOutput;

			// 引数設定
			BsSqlMLocationMasterOutputPmb pmb = new BsSqlMLocationMasterOutputPmb();

			// 引数の値を設定(外だしSQLのWHERE)
			pmb.setCenterId(searchCondition.getCenterId());
//			pmb.setClientId(searchCondition.getClientId());
			pmb.setLocGroup(searchCondition.getLocGroup());
			pmb.setLocationCd_PrefixSearch(searchCondition.getLocationCd());
			pmb.setDelFlg(searchCondition.getDelFlg());


			// 検索実行
			Class<SqlMLocationMasterOutput> entityType = SqlMLocationMasterOutput.class;

			//List<SqlMLocationMasterOutput> SqlLocationMasterOutput = mLocationBhv.outsideSql().selectList( path, pmb, entityType);
			List<SqlMLocationMasterOutput> SqlLocationMasterOutput = selectList(mLocationBhv, path, pmb, entityType);

			return SqlLocationMasterOutput;


		}

		private void setClassNmForOutput(List<SqlMLocationMasterOutput> SqlLocationMasterOutput) {

			// マスタ存在チェック用に区分値マスタのマップを一括取得
			Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_LOCKBN, CLASS_CD_REPLENISHMENT_ROUNDEDUP_UNIT);


			// 名称項目を変換
			for (SqlMLocationMasterOutput SqlLocationMasterOutputMaster : SqlLocationMasterOutput) {


				SqlLocationMasterOutputMaster.setLocidNm(classNmMap.get(CLASS_CD_LOCKBN).get(SqlLocationMasterOutputMaster.getLocid()));
				SqlLocationMasterOutputMaster.setSplrevunNm(classNmMap.get(CLASS_CD_REPLENISHMENT_ROUNDEDUP_UNIT).get(SqlLocationMasterOutputMaster.getSplrevun()));
			}

			return;
		}





		public MLocationBhv getmLocationBhv() {
			return mLocationBhv;
		}




		public void setmLocationBhv(MLocationBhv mLocationBhv) {
			this.mLocationBhv = mLocationBhv;
		}




		public TsnClassLogic getTsnClassLogic() {
			return tsnClassLogic;
		}




		public void setTsnClassLogic(TsnClassLogic tsnClassLogic) {
			this.tsnClassLogic = tsnClassLogic;
		}




		public ClientLogic getClientLogic() {
			return clientLogic;
		}




		public void setClientLogic(ClientLogic clientLogic) {
			this.clientLogic = clientLogic;
		}




		public static String getClassCdDelFlg() {
			return CLASS_CD_DEL_FLG;
		}


}
