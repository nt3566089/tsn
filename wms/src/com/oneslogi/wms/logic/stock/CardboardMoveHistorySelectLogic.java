package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlCardboardMoveHistoryListPmb;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TTrsymbolBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.customize.SqlCardboardMoveHistoryList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.stock.CardboardMoveHistoryDto.CardboardMoveHistorySearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnCenterClassLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;

public class CardboardMoveHistorySelectLogic extends AbstractWmsLogic {
	
	// ===== 区分値クラス名称取得定数 =====
	//詰合せ状態
	private static final String CLASS_CD_ASSORTMENTSTS = "ASSORTMENTSTS";
	//ロケーショングループ
	private static final String CLASS_CD_LOC_GROUP = "LOC_GROUP";
	//デザイン区分
	private static final String CLASS_CD_DESIGNFLG = "DESIGNFLG";
	//開封フラグ
	private static final String CLASS_CD_OPENFLG = "OPENFLG";
	
	// ===== 使用テーブル =====
	@Inject
	private TTrsymbolBhv tTrsymbolBhv;
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	
	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private TsnClassLogic tsnClassLogic;
	@Inject
	private TsnCenterClassLogic tsnCenterClassLogic;
	
	
	
	public void mappingAndInputCheck(CardboardMoveHistorySearchConditionDto cond, ErrorStatus errSts) {

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
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		if (mCenter == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return;
		}

		cond.setCenterId(mCenter.getCenterId());


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
	
	/**
	 * スタブ（共通関数）
	 */
	public BigDecimal getQtyCartonConversion(BigDecimal restqtyBowl, BigDecimal unit1, BigDecimal unit2) {
		return restqtyBowl.multiply(unit1).multiply(unit2);
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
	public List<SqlCardboardMoveHistoryList> getSqlCardboardMoveHistory(CardboardMoveHistorySearchConditionDto searchCondition, PagingData paging, ErrorStatus errSts) {

		//////////////////////////////////////
				// 外だしSQLの実行
		//////////////////////////////////////
		List<SqlCardboardMoveHistoryList> sqlCardboardMoveHistoryList = this.getCardboardMoveHistoryListSelect(searchCondition, paging, errSts);
		// データ未存在
		if (sqlCardboardMoveHistoryList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		
		for (SqlCardboardMoveHistoryList sqlCardboardMoveHistory : sqlCardboardMoveHistoryList) {
			//残数量(個装)
			BigDecimal restQtyBowl = sqlCardboardMoveHistory.getRestqtyBowl();
			//1ケース当カートン数
			BigDecimal unit1 = sqlCardboardMoveHistory.getUnit1();
			//1カートン当個数
			BigDecimal unit2 = sqlCardboardMoveHistory.getUnit2();
			
			//残数量 = 1ケース当カートン数＊1カートン当個数
			if(restQtyBowl.stripTrailingZeros().compareTo((unit1.multiply(unit2)).stripTrailingZeros()) == 0) {
				sqlCardboardMoveHistory.setRestqtyCarton(unit1);
			} else {
				//TODO 共通関数
				BigDecimal carton = getQtyCartonConversion(restQtyBowl,unit1,unit2);
				sqlCardboardMoveHistory.setRestqtyCarton(carton);
			}
		}
		
		//////////////////////////////////////
		// 区分名称
		//////////////////////////////////////
		setClassNm(sqlCardboardMoveHistoryList, searchCondition.getCenterCd());


		return sqlCardboardMoveHistoryList;
	}

	
	/**
	 * <h2>段ボール情報から、データを選択する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * </pre>
	 * @param receiveCd 受信CD
	 * @param header 検索条件
	 * @param paging ページング
	 * @return List<AllocateControlMasterList> 引当制御マスタテーブル
	 */
	public List<SqlCardboardMoveHistoryList> getCardboardMoveHistoryListSelect(CardboardMoveHistorySearchConditionDto cond, PagingData paging, ErrorStatus errSts) {
		
		String path = TTrsymbolBhv.PATH_selectSqlCardboardMoveHistoryList;

		// 引数設定
		BsSqlCardboardMoveHistoryListPmb pmb = new BsSqlCardboardMoveHistoryListPmb();

		// 引数の値を設定
		pmb.setCenterId(cond.getCenterId());
		pmb.setClientId(cond.getClientId());
		pmb.setCreateDateTimeFrom(cond.getCreateDateTimeFrom());
		pmb.setCreateDateTimeTo(cond.getCreateDateTimeTo());
		pmb.setMakerCaseNoFrom(cond.getMakerCaseNoFrom());
		pmb.setMakerCaseNoTo(cond.getMakerCaseNoTo());
		pmb.setTrsymbolId_PrefixSearch(cond.getTrsymbolId());
		pmb.setReceiveDate(cond.getReceiveDate());
		pmb.setShipDate(cond.getShipDate());
		pmb.setItemCd_PrefixSearch(cond.getItemCd());
		pmb.setLot1_PrefixSearch(cond.getLot1());
		pmb.setLot4(cond.getLot4());
		pmb.setSymbolMakeNoFrom(cond.getSymbolMakeNoFrom());
		pmb.setSymbolMakeNoTo(cond.getSymbolMakeNoTo());
		pmb.setLot3(cond.getLot3());
		pmb.setCaseItfNo_PrefixSearch(cond.getItfNo());
		pmb.setCarrierNo_PrefixSearch(cond.getCarrierNo());
		

		// 検索実行
		Class<SqlCardboardMoveHistoryList> entityType = SqlCardboardMoveHistoryList.class;
		List<SqlCardboardMoveHistoryList> sqlCardboardMoveHistoryList;
		sqlCardboardMoveHistoryList = selectPage(tTrsymbolBhv, path, pmb, entityType, paging);
		
		return sqlCardboardMoveHistoryList;
		
	}
	
	private void setClassNm(List<SqlCardboardMoveHistoryList> sqlCardboardMoveHistoryList, String centerCd) {
		
		// マスタ存在チェック用に区分値マスタのマップを一括取得
		Map<String, Map<String, String>> classMap = tsnClassLogic.getClassNmMap(CLASS_CD_ASSORTMENTSTS,CLASS_CD_LOC_GROUP,CLASS_CD_OPENFLG);
		// マスタ存在チェック用に拠点区分値マスタのマップを一括取得
		Map<String, Map<String, String>> centerClassNmMap = tsnCenterClassLogic.getmCenterClassNmMap(centerCd, CLASS_CD_DESIGNFLG);
		//在庫区分マスタのマップを一括取得
		Map<String, String> stockTypeMap = new HashMap<String, String>();
		MStockTypeCB cb = mStockTypeBhv.newConditionBean();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().columnStockTypeCd();
		cb.specify().specifyVDict().columnDictNm();
		List<MStockType> mStockTypeList = mStockTypeBhv.selectList(cb);
		for (MStockType mStockType : mStockTypeList) {
			stockTypeMap.put(mStockType.getStockTypeCd(), mStockType.getVDict().getDictNm());
		}
		
		
		// 名称項目を変換
		for (SqlCardboardMoveHistoryList sqlCardboardMoveHistory : sqlCardboardMoveHistoryList) {
			String damageFlg = sqlCardboardMoveHistory.getDamageFlgCd().stripTrailingZeros().toString();
			//詰合せ状態
			sqlCardboardMoveHistory.setDamageFlg(classMap.get(CLASS_CD_ASSORTMENTSTS).get(damageFlg));
			//ロケーショングループ
			sqlCardboardMoveHistory.setLocGroup(classMap.get(CLASS_CD_LOC_GROUP).get(sqlCardboardMoveHistory.getLocGroupCd()));
			//開封フラグ
			sqlCardboardMoveHistory.setOpenFlg(classMap.get(CLASS_CD_OPENFLG).get(sqlCardboardMoveHistory.getOpenFlgCd()));
			//デザイン区分
			sqlCardboardMoveHistory.setSymbolLot3(centerClassNmMap.get(CLASS_CD_DESIGNFLG).get(sqlCardboardMoveHistory.getSymbolLot3Cd()));
			//在庫区分
			sqlCardboardMoveHistory.setOtherlot1(stockTypeMap.get(sqlCardboardMoveHistory.getStockTypeCd()));
		}
		return;
		
	}

}
