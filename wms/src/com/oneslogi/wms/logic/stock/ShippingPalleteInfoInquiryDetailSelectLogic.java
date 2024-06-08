package com.oneslogi.wms.logic.stock;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.bsbhv.BsTTrsoBhv;
import com.oneslogi.base.dbflute.exbhv.TTrsoBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingPalleteDetailInfoListPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingPalleteDetailInfoList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDetailDto.ShippingPalleteInfoInquiryDetailBodyData;

/**
 * 出庫パレット情報照会(詳細)データ取得ロジッククラス
 */
public class ShippingPalleteInfoInquiryDetailSelectLogic extends AbstractWmsLogic {

	@Inject
	private TTrsoBhv tTrsoBhv;
	
	/* 出庫パレット情報照会(詳細)明細データ */
	private List<ShippingPalleteInfoInquiryDetailBodyData> searchResultList = new ArrayList<ShippingPalleteInfoInquiryDetailBodyData>();

	/**
	 * <h2>出庫パレット情報照会(詳細)の明細データを取得する。</h2>
	 * <pre>
	 *
	 * </pre>
	 * @param soId 出庫予定ID
	 * @param mCenter 拠点マスタ：拠点ID・拠点CD
	 * @param mClient 荷主マスタ：荷主ID・荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<ShippingPalleteInfoInquiryDetailBodyData> 出庫パレット情報照会(詳細)明細リスト
	 * @throws ParseException
	 */
	public List<ShippingPalleteInfoInquiryDetailBodyData> select(Long soId, MCenter mCenter, MClient mClient, ErrorStatus errSts) throws ParseException {

		// ===== 出庫パレット情報照会(詳細)情報取得 =====
		ListResultBean<SqlShippingPalleteDetailInfoList> resultList = new ListResultBean<SqlShippingPalleteDetailInfoList>();

		// 外出しSQLの定義
		String path = BsTTrsoBhv.PATH_selectSqlShippingPalleteDetailInfoList;

		// 検索条件の設定
		SqlShippingPalleteDetailInfoListPmb pmb = new SqlShippingPalleteDetailInfoListPmb();
		
		pmb.setSoId(soId);

		// 検索実行
		Class<SqlShippingPalleteDetailInfoList> entityType = SqlShippingPalleteDetailInfoList.class;
		resultList = tTrsoBhv.outsideSql().selectList(path, pmb, entityType);
		
		// ===== ０件チェック =====
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return this.searchResultList;
		}

		//検索されたテーブルレコードを一覧データ格納用のオブジェクトに設定
		for(SqlShippingPalleteDetailInfoList list : resultList){

			ShippingPalleteInfoInquiryDetailBodyData body = new ShippingPalleteInfoInquiryDetailBodyData();

			body.setSymbolLineNo(list.getSymbollineno());
			body.setRcvKey(list.getRcvkey());
			body.setSymbolMakeNo(list.getSymbolmakeno());
			body.setProduct_Cd(list.getProductCd());
			body.setProduct_Nm(list.getProductNm());
			body.setLot1(list.getLot1());
			body.setLot4(list.getLot4());
			body.setLot3(list.getLot3());
			body.setLot2(list.getLot2());
			body.setStockTypeCd(list.getStockTypeCd());
			body.setMakerCaseNo(list.getMakercaseno());
			body.setReceiveDate(list.getReceivedate());
			body.setMakerCaseNo(list.getMakercaseno());
			body.setTotalQty(list.getTotalqty());
			body.setForeignCargoFlg(list.getForeigncargoflg());
			body.setIfItemCd(list.getIfitemcd());
			
			body.setClientId(mClient.getClientId());
			body.setClientCd(mClient.getClientCd());
			body.setClientNm(mClient.getClientNm());
			body.setCenterId(mCenter.getCenterId());
			body.setCenterCd(mCenter.getCenterCd());
			body.setCenterNm(mCenter.getCenterNm());

			//リストに追加
			searchResultList.add(body);
			
		}

		return this.searchResultList;
	}

}
