package com.oneslogi.wms.logic.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlAllocateControlMasterListPmb;
import com.oneslogi.base.dbflute.exbhv.MMfpickctlBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MMfpickctl;
import com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.master.AllocateControlMasterListDto.AllocateControlMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnCenterClassLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

public class AllocateControlMasterListLogic extends AbstractWmsLogic {

	private static final String CLASS_CD_VALIDTYPE = "VALIDTYPE";

	private static final String CLASS_CD_DESIGNFLG = "DESIGNFLG";



	// ===== 使用テーブル =====
	@Inject
	private MMfpickctlBhv mMfpickctlBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private TsnClassLogic tsnClassLogic;

	@Inject
	private TsnCenterClassLogic tsnCenterClassLogic;


	public void mappingAndInputCheck(AllocateControlMasterListLogicSearchConditionDto cond, ErrorStatus errSts) {

//////////////////////////////////////
// 荷主
//////////////////////////////////////

		// 必須チェック
		if (cond.getClientCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
			return;
		}

		// マスタ存在チェック＆ID取得
		MClient mClientInput = new MClient();
		mClientInput.setClientCd(cond.getClientCd());

		//共通関数側でエラー設定まで行わない場合
//		MClient mClient = clientLogic.getUkEntity(mClientInput);
//		if (mClient == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
//			return ;
//		}

		//共通関数側でエラー設定まで行わない呼び方
		MClient mClient = clientLogic.getUkEntity(mClientInput, errSts);
		if(getErrorManager().size() > 0) {
			return;
		}
		cond.setClientId(mClient.getClientId());


		return;
	}

	/**
	 * <h2>引当制御マスタテーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @return List<AllocateControlMasterList> 引当制御マスタテーブル
	 */
	public List<SqlAllocateControlMasterList> getAllocateControlMasterListSelect(AllocateControlMasterListLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

//////////////////////////////////////
		// 外だしSQLの実行
//////////////////////////////////////
		List<SqlAllocateControlMasterList> SqlAllocateControlMasterList = this.getAllocateControlMasterList(searchCondition,paging,errSts);
		// データ未存在
		if (SqlAllocateControlMasterList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

//////////////////////////////////////
// 区分名称の補完
//////////////////////////////////////
		setClassNm(SqlAllocateControlMasterList, searchCondition.getCenterCd());


		return SqlAllocateControlMasterList;
	}

////SQL検索を実行するロジック
	/**
	 * @param searchCondition
	 * @param paging
	 * @param errSts
	 * @return
	 */
	/**
	 * @param searchCondition
	 * @param paging
	 * @param errSts
	 * @return
	 */
	/**
	 * @param searchCondition
	 * @param paging
	 * @param errSts
	 * @return
	 */
	private List<SqlAllocateControlMasterList> getAllocateControlMasterList(AllocateControlMasterListLogicSearchConditionDto	searchCondition, PagingData paging, ErrorStatus errSts) {

		String path = MMfpickctlBhv.PATH_selectSqlAllocateControlMasterList;

		// 引数設定
		BsSqlAllocateControlMasterListPmb pmb = new BsSqlAllocateControlMasterListPmb();


		//引数の値を設定
		pmb.setClientId(searchCondition.getClientId());
		pmb.setProductCd_PrefixSearch(searchCondition.getProductCd());
		pmb.setPickfrdateFrom(searchCondition.getPickfrdateFrom());
		pmb.setPickfrdateTo(searchCondition.getPickfrdateTo());
		pmb.setPicktodateFrom(searchCondition.getPicktodateFrom());
		pmb.setPicktodateTo(searchCondition.getPicktodateTo());
		pmb.setValidtype(searchCondition.getValidtype());
		pmb.setDesignflg(searchCondition.getDesignflg());

		// 検索実行
		Class<SqlAllocateControlMasterList> entityType = SqlAllocateControlMasterList.class;
		List<SqlAllocateControlMasterList> SqlAllocateControlMasterList;

		SqlAllocateControlMasterList = selectPage( mMfpickctlBhv, path, pmb, entityType,paging);


		return SqlAllocateControlMasterList;
	}

	private void setClassNm(List<SqlAllocateControlMasterList> SqlAllocateControlMasterList, String centerCd) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_VALIDTYPE);
		// マスタ存在チェック用に拠点区分値マスタのマップを一括取得
		Map<String, Map<String, String>> centerClassNmMap = tsnCenterClassLogic.getmCenterClassNmMap(centerCd, CLASS_CD_DESIGNFLG);

		// 名称項目を変換
		for (SqlAllocateControlMasterList SqlAllocateControlMaster : SqlAllocateControlMasterList) {
			SqlAllocateControlMaster.setValidtypeNm(classNmMap.get(CLASS_CD_VALIDTYPE).get(SqlAllocateControlMaster.getValidtype()));
			SqlAllocateControlMaster.setPickrank1Nm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlAllocateControlMaster.getPickrank1()));
			SqlAllocateControlMaster.setPickrank2Nm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlAllocateControlMaster.getPickrank2()));
			SqlAllocateControlMaster.setPickrank3Nm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlAllocateControlMaster.getPickrank3()));
			SqlAllocateControlMaster.setPickrank4Nm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlAllocateControlMaster.getPickrank4()));
			SqlAllocateControlMaster.setPickrank5Nm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlAllocateControlMaster.getPickrank5()));
//			SqlAllocateControlMaster.setDesignflg(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlAllocateControlMaster.getDesignflg()));
		}
		return;
	}
	/**
	 * <h2引当制御マスタを削除する。</h2>
	 * <pre>
	 * 引当制御マスタを削除する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mMfpickctl 引当制御マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(MMfpickctl mMfpickctl, ErrorStatus errSts) {

		// ===== 引当制御マスタ削除実行 =====
		try{
			mMfpickctlBhv.delete(mMfpickctl);
		}catch(SQLFailureException e){
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
			} else {
				throw e;
			}
		}
	}
}


