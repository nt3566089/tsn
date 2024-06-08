package com.oneslogi.wms.logic.stock;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;

import org.apache.commons.lang3.text.StrBuilder;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlSortingPlaceMasterListBlkPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlSortingPlaceMasterListLinPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlSortingPlaceMasterListSrwPmb;
import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListBlk;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListLin;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListSrw;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.stock.SortingPlaceMasterListDto.SortingPlaceMasterListLogicSearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

public class SortingPlaceMasterListLogic extends AbstractWmsLogic {

	private static final String CLASS_CD_DEL_FLG = "DEL_FLG";
	private static final String CLASS_CD_NOT_COVERED_CLASS = "NOT_COVERED_CLASS";
	private static final String CLASS_CD_CONSOLIDATIONFLG = "CONSOLIDATIONFLG";
	private static final String CLASS_CD_COVERED_CLASS = "COVERED_CLASS";
	private static final String CLASS_CD_LINE_ORDER_KBN = "LINE_ORDER_KBN";

	// ===== 使用テーブル =====
	@Inject
	private TCsrwhadmBhv tCsrwhadmBhv;
	@Inject
	private MClinBhv mClinBhv;
	@Inject
	private MCblkBhv mCblkBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private TsnClassLogic tsnClassLogic;


	/* SQL実行後の検索結果を格納するDTO */
	public static class SortingPlaceMasterListLogicSearchResultDto{
		private Date srymd;
		private Long sroprtcnt;
		private String tdayesrcompfg;


		public Date getSrymd() {
			return srymd;
		}

		public void setSrymd(Date srymd) {
			this.srymd = srymd;
		}

		public Long getSroprtcnt() {
			return sroprtcnt;
		}

		public void setSroprtcnt(Long sroprtcnt) {
			this.sroprtcnt = sroprtcnt;
		}

		public String getTdayesrcompfg() {
			return tdayesrcompfg;
		}

		public void setTdayesrcompfg(String tdayesrcompfg) {
			this.tdayesrcompfg = tdayesrcompfg;
		}
	};

	public void mappingAndInputCheck(SortingPlaceMasterListLogicSearchConditionDto cond, ErrorStatus errSts) {
		//////////////////////////////////////
		// センタ
		//////////////////////////////////////

		// 必須チェック
		if (cond.getCenterCd() == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_NOT_INPUT_ERROR);
			return;
		}

		// マスタ存在チェック＆ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(cond.getCenterCd());

		// 共通関数側でエラー設定まで行わない呼び方
		mCenter = centerLogic.getUkEntity(mCenter, errSts);
		if (getErrorManager().size() > 0) {
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
		MClient mClient = new MClient();
		mClient.setClientCd(cond.getClientCd());
		mClient = clientLogic.getUkEntity(mClient, errSts);
		if (getErrorManager().size() > 0) {
			return;
		}

		cond.setClientId(mClient.getClientId());

		return;

	}


	/**
	 * <h2>ゾーンマスタテーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @return List<SqlSortingPlaceMasterList> 仕分場構成マスタテーブル
	 */
	public SqlSortingPlaceMasterListSrw getSortingPlaceMasterListSrwSelect(SortingPlaceMasterListLogicSearchConditionDto searchCondition, ErrorStatus errSts) {

		//////////////////////////////////////
		// 外だしSQLの実行
		//////////////////////////////////////
		SqlSortingPlaceMasterListSrw SqlSortingPlaceMasterListSrw = this.getSortingPlaceMasterListSrw(searchCondition,errSts);
		// データ未存在
		if (SqlSortingPlaceMasterListSrw == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}


		//////////////////////////////////////
		// 区分名称と貼付順の補完
		//////////////////////////////////////
		setSrwClassNmLocidfbrctg(SqlSortingPlaceMasterListSrw);


		return SqlSortingPlaceMasterListSrw;
	}

	////SQL検索を実行するロジック
	private SqlSortingPlaceMasterListSrw getSortingPlaceMasterListSrw(SortingPlaceMasterListLogicSearchConditionDto	searchCondition, ErrorStatus errSts) {

		String path = TCsrwhadmBhv.PATH_selectSqlSortingPlaceMasterListSrw;

		// 引数設定
		BsSqlSortingPlaceMasterListSrwPmb pmb = new BsSqlSortingPlaceMasterListSrwPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setDelFlg(searchCondition.getDelFlg());

		//1件目のみを表示する
		pmb.fetchFirst(1);

		Class<SqlSortingPlaceMasterListSrw> entityType = SqlSortingPlaceMasterListSrw.class;
		SqlSortingPlaceMasterListSrw  sqlSortingPlaceMasterListSrw= tCsrwhadmBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);



		return sqlSortingPlaceMasterListSrw;


	}

	private void setSrwClassNmLocidfbrctg(SqlSortingPlaceMasterListSrw sqlSortingPlaceMasterListSrw) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_LINE_ORDER_KBN);

		// 名称項目を変換
		sqlSortingPlaceMasterListSrw.setLocidfrnkNm(classNmMap.get(CLASS_CD_LINE_ORDER_KBN).get(sqlSortingPlaceMasterListSrw.getLocidfrnk()));


		//ロケ不定銘柄カテゴリ貼付順の並び替え

		sqlSortingPlaceMasterListSrw.setLocidfbrctg(
			order(
				sqlSortingPlaceMasterListSrw.getLocidfrnk(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg1(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg2(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg3(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg4(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg5(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg6(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg7(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg8(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg9(),
				sqlSortingPlaceMasterListSrw.getLocidfbrctg10()
			)
		);

		return;
	}

	/**
	 * <h2>ラインマスタテーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @return List<SqlSortingPlaceMasterList> 仕分場構成マスタテーブル
	 */
	public List<SqlSortingPlaceMasterListLin> getSortingPlaceMasterListLinSelect(SortingPlaceMasterListLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

		//////////////////////////////////////
		// 外だしSQLの実行
		//////////////////////////////////////
		List<SqlSortingPlaceMasterListLin> SqlSortingPlaceMasterListLin = this.getSortingPlaceMasterListLin(searchCondition,paging,errSts);
		// データ未存在
		if (SqlSortingPlaceMasterListLin.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}


		//////////////////////////////////////
		// 区分名称の補完
		//////////////////////////////////////
		setLinClassNm(SqlSortingPlaceMasterListLin);


		return SqlSortingPlaceMasterListLin;
	}

	////SQL検索を実行するロジック
	private List<SqlSortingPlaceMasterListLin> getSortingPlaceMasterListLin(SortingPlaceMasterListLogicSearchConditionDto	searchCondition, PagingData paging, ErrorStatus errSts) {

		String path = MClinBhv.PATH_selectSqlSortingPlaceMasterListLin;

		// 引数設定
		BsSqlSortingPlaceMasterListLinPmb pmb = new BsSqlSortingPlaceMasterListLinPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setDelFlg(searchCondition.getDelFlg());

		// 検索実行
		Class<SqlSortingPlaceMasterListLin> entityType = SqlSortingPlaceMasterListLin.class;
		List<SqlSortingPlaceMasterListLin> SqlSortingPlaceMasterListLin;
		SqlSortingPlaceMasterListLin = selectPage(mClinBhv, path, pmb, entityType, paging);



		return SqlSortingPlaceMasterListLin;


	}

	private void setLinClassNm(List<SqlSortingPlaceMasterListLin> sqlSortingPlaceMasterListLin) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_DEL_FLG, CLASS_CD_CONSOLIDATIONFLG, CLASS_CD_NOT_COVERED_CLASS);

		// 名称項目を変換
		for (SqlSortingPlaceMasterListLin SqlSortingPlaceMaster : sqlSortingPlaceMasterListLin) {
			SqlSortingPlaceMaster.setDelFlgNm(classNmMap.get(CLASS_CD_DEL_FLG).get(SqlSortingPlaceMaster.getDelFlg()));
			SqlSortingPlaceMaster.setSprprsidNm(classNmMap.get(CLASS_CD_CONSOLIDATIONFLG).get(SqlSortingPlaceMaster.getSprprsid()));
			SqlSortingPlaceMaster.setHdrdboxrsfidNm(classNmMap.get(CLASS_CD_NOT_COVERED_CLASS).get(SqlSortingPlaceMaster.getHdrdboxrsfid()));

		}

		return;
	}

	/**
	 * <h2>ブロックマスタテーブルから、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param header 検索条件
	 * @param paging ページング
	 * @return List<SqlSortingPlaceMasterList> 仕分場構成マスタテーブル
	 */
	public List<SqlSortingPlaceMasterListBlk> getSortingPlaceMasterListBlkSelect(SortingPlaceMasterListLogicSearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

		//////////////////////////////////////
		// 外だしSQLの実行
		//////////////////////////////////////
		List<SqlSortingPlaceMasterListBlk> SqlSortingPlaceMasterListBlk = this.getSortingPlaceMasterListBlk(searchCondition,paging,errSts);
		// データ未存在
		if (SqlSortingPlaceMasterListBlk.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}



		//////////////////////////////////////
		// 区分名称の補完
		//////////////////////////////////////
		setBlkClassNm(SqlSortingPlaceMasterListBlk);


		return SqlSortingPlaceMasterListBlk;
	}

	////SQL検索を実行するロジック
	private List<SqlSortingPlaceMasterListBlk> getSortingPlaceMasterListBlk(SortingPlaceMasterListLogicSearchConditionDto	searchCondition, PagingData paging, ErrorStatus errSts) {

		String path = MCblkBhv.PATH_selectSqlSortingPlaceMasterListBlk;

		// 引数設定
		BsSqlSortingPlaceMasterListBlkPmb pmb = new BsSqlSortingPlaceMasterListBlkPmb();

		// 引数の値を設定
		pmb.setCenterId(searchCondition.getCenterId());
		pmb.setDelFlg(searchCondition.getDelFlg());


		// 検索実行
		Class<SqlSortingPlaceMasterListBlk> entityType = SqlSortingPlaceMasterListBlk.class;
		List<SqlSortingPlaceMasterListBlk> SqlSortingPlaceMasterListBlk;
		SqlSortingPlaceMasterListBlk = selectPage(mCblkBhv, path, pmb, entityType, paging);



		return SqlSortingPlaceMasterListBlk;


	}

	private void setBlkClassNm(List<SqlSortingPlaceMasterListBlk> sqlSortingPlaceMasterListBlk) {

		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_DEL_FLG, CLASS_CD_COVERED_CLASS, CLASS_CD_NOT_COVERED_CLASS ,CLASS_CD_LINE_ORDER_KBN);

		// 名称項目を変換
		for (SqlSortingPlaceMasterListBlk SqlSortingPlaceMaster : sqlSortingPlaceMasterListBlk) {
			SqlSortingPlaceMaster.setDelFlgNm(classNmMap.get(CLASS_CD_DEL_FLG).get(SqlSortingPlaceMaster.getDelFlg()));
			SqlSortingPlaceMaster.setSprprsidNm(classNmMap.get(CLASS_CD_COVERED_CLASS).get(SqlSortingPlaceMaster.getSprprsid()));
			SqlSortingPlaceMaster.setHdrdboxrsfidNm(classNmMap.get(CLASS_CD_NOT_COVERED_CLASS).get(SqlSortingPlaceMaster.getHdrdboxrsfid()));
			SqlSortingPlaceMaster.setLocidfrnkNm(classNmMap.get(CLASS_CD_LINE_ORDER_KBN).get(SqlSortingPlaceMaster.getLocidfrnk()));


			//ロケ不定銘柄カテゴリ貼付順の並び替え

			SqlSortingPlaceMaster.setLocidfbrctg(
				order(
					SqlSortingPlaceMaster.getLocidfrnk(),
					SqlSortingPlaceMaster.getLocidfbrctg1(),
					SqlSortingPlaceMaster.getLocidfbrctg2(),
					SqlSortingPlaceMaster.getLocidfbrctg3(),
					SqlSortingPlaceMaster.getLocidfbrctg4(),
					SqlSortingPlaceMaster.getLocidfbrctg5(),
					SqlSortingPlaceMaster.getLocidfbrctg6(),
					SqlSortingPlaceMaster.getLocidfbrctg7(),
					SqlSortingPlaceMaster.getLocidfbrctg8(),
					SqlSortingPlaceMaster.getLocidfbrctg9(),
					SqlSortingPlaceMaster.getLocidfbrctg10()
				)
			);
		}


		return;
	}

	private String order(String lineOrderKbn, Long... orderList ) {
		StrBuilder sb = new StrBuilder();


		if(Objects.equals(lineOrderKbn, CDef.LineOrderKbn.$0.code())) {
			for(int i= 0;i<orderList.length;i++) {
				if (orderList[i] == null) {
					continue;
				}

				sb.append(orderList[i].toString());

				if (i < orderList.length  -1) {
					sb.append(" ");
				}
			}

		}else {
			for(int i= orderList.length -1 ; i>=0 ; i--) {
				if (orderList[i] == null) {
					continue;
				}

				sb.append(orderList[i].toString());

				if (i !=0 ) {
					sb.append(" ");
				}
			}

		}

		return sb.toString();

	}


}
