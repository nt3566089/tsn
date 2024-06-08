package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlBoxMasterPmb;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.customize.SqlBoxMaster;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.NumberingLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.stock.BoxMasterDto.BoxMasterLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

/**
 * 荷材マスタメンテナンス取得ロジッククラス。
 */
public class BoxMasterSelectLogic extends AbstractWmsLogic {

	private static final String NUMBERING_KEY_BOX_CD = "BOX_CD";
	private static final String CLASS_CD_DEL_FLG = "DEL_FLG";
	private static final String CLASS_CD_BOX_CATEGORY = "BOX_CATEGORY";

	// ===== 使用テーブル =====
	@Inject
	private MBoxBhv mBoxBhv;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private TsnClassLogic tsnClassLogic;
	@Inject
	private NumberingLogic numberingLogic;
	/**
	 * <h2>梱包箱情報マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに、件数をチェックし、梱包箱情報マスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mBox 荷材マスタ：センタID・荷材CD・荷材名称・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MBox> 荷材グループマスタリスト
	 */


	public void mappingAndInputCheck(BoxMasterLogicSearchConditionDto cond, ErrorStatus errSts) {
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
	}

	/**
	 * <h2>梱包箱情報マスタテーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @return List<SqlBoxMasterDto> 梱包箱情報マスタテーブル
	 */

	public List<SqlBoxMaster> getBoxMasterListSelect(BoxMasterLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

		//////////////////////////////////////
		// 外だしSQLの実行
		//////////////////////////////////////
		List<SqlBoxMaster> SqlBoxMasterList = this.getBoxMasterList(searchCondition, paging, errSts);
		// データ未存在
		if(SqlBoxMasterList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		//////////////////////////////////////
		//区分名称の補完
		//////////////////////////////////////
			setClassNm(SqlBoxMasterList);


			return SqlBoxMasterList;

	}

	////SQL検索を実行するロジック
	private List<SqlBoxMaster> getBoxMasterList(BoxMasterLogicSearchConditionDto	searchCondition, PagingData paging, ErrorStatus errSts) {

		String path = MBoxBhv.PATH_selectSqlBoxMaster;

		// 引数設定

		BsSqlBoxMasterPmb pmb = new BsSqlBoxMasterPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setBoxCd_PrefixSearch(searchCondition.getBoxCd());
		pmb.setBoxNm_PrefixSearch(searchCondition.getBoxNm());
		pmb.setBoxType(searchCondition.getBoxType());
		pmb.setDelFlg(searchCondition.getDelFlg());

		// 検索実行
		Class<SqlBoxMaster> entityType = SqlBoxMaster.class;
		List<SqlBoxMaster> SqlBoxMaster;

		SqlBoxMaster = selectPage(mBoxBhv, path, pmb, entityType, paging);
//		SqlBoxMaster = mBoxBhv.outsideSql().selectList(path, pmb, entityType);

		return SqlBoxMaster;

	}

	private void setClassNm(List<SqlBoxMaster> SqlBoxMasterList ) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_DEL_FLG, CLASS_CD_BOX_CATEGORY);

		// 名称項目を変換
		for (SqlBoxMaster SqlBoxMaster : SqlBoxMasterList) {
			SqlBoxMaster.setDelFlgNm(classNmMap.get(CLASS_CD_DEL_FLG).get(SqlBoxMaster.getDelFlg()));
			SqlBoxMaster.setBoxTypeNm(classNmMap.get(CLASS_CD_BOX_CATEGORY).get(SqlBoxMaster.getBoxType()));
		}



		return;
	}



	public void inputCheckAndMapping(List<SqlBoxMaster> sqlBoxMasterList, List<MBox> mBoxList, ErrorStatus errSts) {


		for (SqlBoxMaster sqlBoxMaster : sqlBoxMasterList) {
			MBox mBox = new MBox();
//			MBoxSub mBoxSub = new MBoxSub();

			// MBox項目マッピング
			mBox.setBoxId(sqlBoxMaster.getBoxId());
			mBox.setCenterId(sqlBoxMaster.getCenterId());
			mBox.setBoxId(sqlBoxMaster.getBoxId());
			mBox.setBoxCd(sqlBoxMaster.getBoxCd());
			mBox.setBoxNm(sqlBoxMaster.getBoxNm());
			mBox.setHeight(sqlBoxMaster.getHeight());
			mBox.setLength(sqlBoxMaster.getLength());
			mBox.setWidth(sqlBoxMaster.getWidth());
			mBox.setVolumeRate(sqlBoxMaster.getVolumeRate());
			mBox.setVersionNo(sqlBoxMaster.getVersionNo());
			mBox.setBoxType(sqlBoxMaster.getBoxType());
			mBox.setBxcpy(sqlBoxMaster.getBxcpy());
			mBox.setBxweight(sqlBoxMaster.getBxweight());
			mBox.setBxoszh(sqlBoxMaster.getBxoszh());
			mBox.setBxoszl(sqlBoxMaster.getBxoszl());
			mBox.setBxoszw(sqlBoxMaster.getBxoszw());


			mBoxList.add(mBox);

		}
		return;
	}

	public void registerMain(List<MBox> mBoxList, ErrorStatus errSts) {

		// 登録用の配列定義
		List<MBox> insertMBoxList = new ArrayList<>();
		List<MBox> updateMBoxList = new ArrayList<>();

		///////////////////////////////////
		// MBox
		///////////////////////////////////
		// 登録データと更新データに振り分け
		for (MBox mBox : mBoxList) {
			if (mBox.getBoxId() == null) {

				mBox.setBoxCd(numberingLogic.getNumbering(NUMBERING_KEY_BOX_CD));

				insertMBoxList.add(mBox);
			}else {
				updateMBoxList.add(mBox);
			}
		}

		// insert対象があれば登録
		if (insertMBoxList.size() > 0) {
			mBoxBhv.batchInsert(insertMBoxList);

		}

		// update対象があれば登録
		if (updateMBoxList.size() > 0) {
			mBoxBhv.batchUpdate(updateMBoxList);
		}

		return;
	}

}