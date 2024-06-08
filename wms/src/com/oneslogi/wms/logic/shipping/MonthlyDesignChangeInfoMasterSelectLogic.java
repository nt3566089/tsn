package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlMonthlyDesignChangeInfoMasterPmb;
import com.oneslogi.base.dbflute.cbean.MMfmonthchgCB;
import com.oneslogi.base.dbflute.dto.customize.SqlMonthlyDesignChangeInfoMasterDto;
import com.oneslogi.base.dbflute.exbhv.MMfmonthchgBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MMfmonthchg;
import com.oneslogi.base.dbflute.exentity.customize.SqlMonthlyDesignChangeInfoMaster;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.shipping.MonthlyDesignChangeInfoMasterDto.MonthlyDesignChangeInfoMasterData;
import com.oneslogi.wms.dto.shipping.MonthlyDesignChangeInfoMasterDto.MonthlyDesignChangeInfoMasterLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnCenterClassLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

/**
 * 月替り・デザイン変更情報マスタメンテナンス取得ロジッククラス。
 */
public class MonthlyDesignChangeInfoMasterSelectLogic extends AbstractWmsLogic {

	private static final String CLASS_CD_DEL_FLG = "DEL_FLG";
	private static final String CLASS_CD_DESIGNFLG = "DESIGNFLG";
	private static final String CLASS_CD_SORTTYPE = "SORTTYPE";

	// ===== 使用テーブル =====
	@Inject
	private MMfmonthchgBhv mMfmonthchgBhv;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private TsnClassLogic tsnClassLogic;
	@Inject
	private TsnCenterClassLogic tsnCenterClassLogic;
	
	/**
	 * <h2>月替り・デザイン変更情報マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに、件数をチェックし、月替り・デザイン変更情報マスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mBox 荷材マスタ：センタID・荷材CD・荷材名称・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MBox> 荷材グループマスタリスト
	 */


	public void mappingAndInputCheck(MonthlyDesignChangeInfoMasterLogicSearchConditionDto cond, ErrorStatus errSts) {
	//////////////////////////////////////
	// センタ
	//////////////////////////////////////

		// 必須チェック
		if (cond.getCenterCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
			return;
		}

		// マスタ存在チェック＆ID取得
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(cond.getCenterCd());

		//共通関数側でエラー設定まで行わない呼び方
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput, errSts);
		if(getErrorManager().size() > 0) {
			return;
		}


		cond.setCenterId(mCenter.getCenterId());

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

		//共通関数側でエラー設定まで行わない呼び方
		MClient mClient = clientLogic.getUkEntity(mClientInput, errSts);
//		if(mClient == null) {
//			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_FOUND_ERROR);
//			return;
		if(getErrorManager().size() > 0) {
			return;
		}


		cond.setClientId(mClient.getClientId());




	}

	/**
	 * <h2>月替り・デザイン変更情報マスタテーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @return List<SqlBoxMasterDto> 月替り・デザイン変更情報マスタテーブル
	 */

	public List<SqlMonthlyDesignChangeInfoMaster> getMonthlyDesignChangeInfoMasterListSelect(MonthlyDesignChangeInfoMasterLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

		//////////////////////////////////////
		// 外だしSQLの実行
		//////////////////////////////////////
		List<SqlMonthlyDesignChangeInfoMaster> SqlMonthlyDesignChangeInfoMasterList = this.getMonthlyDesignChangeInfoMasterList(searchCondition, paging, errSts);
		// データ未存在
		if(SqlMonthlyDesignChangeInfoMasterList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		//////////////////////////////////////
		//区分名称の補完
		//////////////////////////////////////
			setClassNm(SqlMonthlyDesignChangeInfoMasterList, searchCondition.getCenterCd());


			return SqlMonthlyDesignChangeInfoMasterList;

	}

	////SQL検索を実行するロジック
	private List<SqlMonthlyDesignChangeInfoMaster> getMonthlyDesignChangeInfoMasterList(MonthlyDesignChangeInfoMasterLogicSearchConditionDto	searchCondition, PagingData paging, ErrorStatus errSts) {

		String path = MMfmonthchgBhv.PATH_selectSqlMonthlyDesignChangeInfoMaster;

		// 引数設定

		BsSqlMonthlyDesignChangeInfoMasterPmb pmb = new BsSqlMonthlyDesignChangeInfoMasterPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setClientId(searchCondition.getClientId());
		pmb.setProductCd_PrefixSearch(searchCondition.getProductCd());
		pmb.setSotedunit(searchCondition.getSotedunit());
		pmb.setDelFlg(searchCondition.getDelFlg());

		// 検索実行
		Class<SqlMonthlyDesignChangeInfoMaster> entityType = SqlMonthlyDesignChangeInfoMaster.class;
		List<SqlMonthlyDesignChangeInfoMaster> SqlMonthlyDesignChangeInfoMaster;

		SqlMonthlyDesignChangeInfoMaster = selectPage(mMfmonthchgBhv, path, pmb, entityType, paging);

		return SqlMonthlyDesignChangeInfoMaster;

	}

	private void setClassNm(List<SqlMonthlyDesignChangeInfoMaster> SqlMonthlyDesignChangeInfoMasterList, String centerCd ) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_DEL_FLG, CLASS_CD_SORTTYPE);

		// マスタ存在チェック用に拠点区分値マスタのマップを一括取得
		Map<String, Map<String, String>> centerClassNmMap = tsnCenterClassLogic.getmCenterClassNmMap(centerCd,CLASS_CD_DESIGNFLG);

		// 名称項目を変換
		for (SqlMonthlyDesignChangeInfoMaster SqlMonthlyDesignChangeInfoMaster : SqlMonthlyDesignChangeInfoMasterList) {
			SqlMonthlyDesignChangeInfoMaster.setDelFlgNm(classNmMap.get(CLASS_CD_DEL_FLG).get(SqlMonthlyDesignChangeInfoMaster.getDelFlg()));
			SqlMonthlyDesignChangeInfoMaster.setSotedunitNm(classNmMap.get(CLASS_CD_SORTTYPE).get(SqlMonthlyDesignChangeInfoMaster.getSotedunit()));
			SqlMonthlyDesignChangeInfoMaster.setDesignflgNm(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(SqlMonthlyDesignChangeInfoMaster.getDesignflg()));

		}

		return;
	}


	//登録ボタン押下時、拠点CD、銘柄CD、補充先の重複チェックを行う

	public boolean checkInsert(MonthlyDesignChangeInfoMasterData data, ErrorStatus errSts) {

		for (SqlMonthlyDesignChangeInfoMasterDto line : data.resultList) {
			MMfmonthchgCB cb = mMfmonthchgBhv.newMyConditionBean();
			cb.query().setCenterId_Equal(line.getCenterId());
			cb.query().setProductCd_Equal(line.getProductCd());
			cb.query().setSotedunit_Equal(line.getSotedunit());

			int count = mMfmonthchgBhv.selectCount(cb);
			if (count > 0) {

				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);

				return false;
			}
		}

		return true;
	}





	public void inputCheckAndMapping(List<SqlMonthlyDesignChangeInfoMaster> sqlMonthlyDesignChangeInfoMasterList, List<MMfmonthchg> mMfmonthchgList, MClient mClient,String systemDt, ErrorStatus errSts) {

		for (SqlMonthlyDesignChangeInfoMaster sqlMonthlyDesignChangeInfoMaster : sqlMonthlyDesignChangeInfoMasterList) {
			MMfmonthchg mMfmonthchg = new MMfmonthchg();

			// MMfmonthchg項目マッピング
			mMfmonthchg.setMfmonthchgId(sqlMonthlyDesignChangeInfoMaster.getMfmonthchgId());
			//月替り・デ変情報ID
			mMfmonthchg.setCenterId(sqlMonthlyDesignChangeInfoMaster.getCenterId());
			//拠点ID
			mMfmonthchg.setProductCd(sqlMonthlyDesignChangeInfoMaster.getProductCd());
			//銘柄CD
			mMfmonthchg.setSotedunit(sqlMonthlyDesignChangeInfoMaster.getSotedunit());
			//補充先
			mMfmonthchg.setLimitdate(sqlMonthlyDesignChangeInfoMaster.getLimitdate());
			//製造年月日
			mMfmonthchg.setDesignflg(sqlMonthlyDesignChangeInfoMaster.getDesignflg());
			//デザイン区分
			mMfmonthchg.setSotedloc(sqlMonthlyDesignChangeInfoMaster.getSotedloc());
			//仕分ロケ
			mMfmonthchg.setDelFlg(sqlMonthlyDesignChangeInfoMaster.getDelFlg());
			//削除フラグ
			mMfmonthchg.setSystemDt(systemDt);
			//更新日付
			mMfmonthchg.setClientId(mClient.getClientId());
			//荷主ID
			mMfmonthchg.setVersionNo(sqlMonthlyDesignChangeInfoMaster.getVersionNo());
			//バージョンNo.

			mMfmonthchgList.add(mMfmonthchg);

		}

		return;
	}

	public void registerMain(List<MMfmonthchg> mMfmonthchgList, ErrorStatus errSts) {

		// 登録用の配列定義
		List<MMfmonthchg> insertMMfmonthchgList = new ArrayList<>();
		List<MMfmonthchg> updateMMfmonthchgList = new ArrayList<>();

		///////////////////////////////////
		// MMfmonthchg
		///////////////////////////////////
		// 登録データと更新データに振り分け
		for (MMfmonthchg mMfmonthchg : mMfmonthchgList) {
			if (mMfmonthchg.getMfmonthchgId() == null) {

//				// controlNo未設定の場合は採番
//				if (controlNo == null) {
//					controlNo = numberingLogic.getControlNo();
//				}
//				mBox.setControlNo(controlNo);
//				mBox.setBoxCd(numberingLogic.getNumbering(NUMBERING_KEY_BOX_CD));

				insertMMfmonthchgList.add(mMfmonthchg);
			}else {
				updateMMfmonthchgList.add(mMfmonthchg);
			}
		}

		// insert対象があれば登録
		if (insertMMfmonthchgList.size() > 0) {
			mMfmonthchgBhv.batchInsert(insertMMfmonthchgList);
//			insertedList = getInsertedMBoxList(controlNo);
		}

		// update対象があれば登録
		if (updateMMfmonthchgList.size() > 0) {
			mMfmonthchgBhv.batchUpdate(updateMMfmonthchgList);
		}

		return;
	}





//	}

}