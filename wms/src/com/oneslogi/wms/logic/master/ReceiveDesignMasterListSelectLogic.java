package com.oneslogi.wms.logic.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlReceiveDesignMasterListPmb;
import com.oneslogi.base.dbflute.exbhv.MMfrcvdesignBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveDesignMasterList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.ReceiveDesignMasterListDto.ReceiveDesignMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnCenterClassLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

public class ReceiveDesignMasterListSelectLogic extends AbstractWmsLogic {



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
	private MMfrcvdesignBhv mMfrcvdesignBhv;
	
	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private TsnClassLogic tsnClassLogic;
	
	@Inject
	private TsnCenterClassLogic tsnCenterClassLogic;


	// ===== 定数定義 =====
	private static final String CLASS_CD_VALIDTYPE = "VALIDTYPE";
	
	private static final String CLASS_CD_DISTRIBUTIONCD = "DISTRIBUTIONCD";

	private static final String CLASS_CD_DESIGNFLG = "DESIGNFLG";
	
	private static final String CLASS_CD_DELFLG = "DEL_FLG";

	public static final String PROPERTY_NM = "allowQueryCount";


	//////////////////////////////////
	// 引数チェック
	//////////////////////////////////
	public void mappingAndInputCheck(ReceiveDesignMasterListLogicSearchConditionDto cond, ErrorStatus errSts) {

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

	public List<SqlReceiveDesignMasterList> select(ReceiveDesignMasterListLogicSearchConditionDto sc, PagingData paging, ErrorStatus errSts) throws Exception {


		//検索条件の設定

		List<SqlReceiveDesignMasterList> sqlReceiveDesignMasterList = this.getReceiveDesignMasterList(sc, paging, errSts);

		// データ未存在
		if (sqlReceiveDesignMasterList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;

			}
		//区分名称の補完
		setClassNm(sqlReceiveDesignMasterList,sc.getCenterCd());


		return sqlReceiveDesignMasterList;

		}

	/**
	 * 検索条件を元にデータベースからデータを取得する。
	 */
	public List<SqlReceiveDesignMasterList> getReceiveDesignMasterList(ReceiveDesignMasterListLogicSearchConditionDto sc, PagingData paging, ErrorStatus errSts) {


		//////////////////////////////////
		// SQL実行
		//////////////////////////////////
		// 外出しSQLの定義
		String path = MMfrcvdesignBhv.PATH_selectSqlReceiveDesignMasterList;

		//引数定義
		BsSqlReceiveDesignMasterListPmb pmb = new BsSqlReceiveDesignMasterListPmb();

		//引数の値を設定

		pmb.setClientId(sc.getClientId());
		pmb.setProductCd_PrefixSearch(sc.getProductCd());
		pmb.setValidType(sc.getValidType());
		pmb.setUpDate(sc.getUpdateDate());
		pmb.setRcvfrDateFrom(sc.getRcvFrDateFrom());
		pmb.setRcvfrDateTo(sc.getRcvFrDateTo());
		pmb.setRcvtoDateFrom(sc.getRcvToDateFrom());
		pmb.setRcvtoDateTo(sc.getRcvToDateTo());
		
		// 検索実行
		Class<SqlReceiveDesignMasterList> entityType = SqlReceiveDesignMasterList.class;
		List<SqlReceiveDesignMasterList> sqlReceiveDesignMasterList;


		sqlReceiveDesignMasterList = selectPage(mMfrcvdesignBhv, path, pmb, entityType, paging);



		return sqlReceiveDesignMasterList;

	}

	// throws Exception
	private void setClassNm(List<SqlReceiveDesignMasterList> SqlReceiveDesignMasterList, String centerCd)  throws Exception{

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_VALIDTYPE,CLASS_CD_DISTRIBUTIONCD,CLASS_CD_DELFLG);
		// マスタ存在チェック用に拠点区分値マスタのマップを一括取得
		Map<String, Map<String, String>> centerClassNmMap = tsnCenterClassLogic.getmCenterClassNmMap(centerCd, CLASS_CD_DESIGNFLG);
		// 名称項目を変換
		for (SqlReceiveDesignMasterList SqlReceiveDesignMaster : SqlReceiveDesignMasterList) {
			SqlReceiveDesignMaster.setValidTypeNm(classNmMap.get(CLASS_CD_VALIDTYPE).get(SqlReceiveDesignMaster.getValidtype()));
			SqlReceiveDesignMaster.setDistributionCdNm(classNmMap.get(CLASS_CD_DISTRIBUTIONCD).get(SqlReceiveDesignMaster.getDistributioncd()));
			SqlReceiveDesignMaster.setDelFlgNm(classNmMap.get(CLASS_CD_DELFLG).get(SqlReceiveDesignMaster.getDelFlg()));
			SqlReceiveDesignMaster.setDesignFlgNm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlReceiveDesignMaster.getDesignflg()));
		}

		return;
	}

	
}



