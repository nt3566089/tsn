package com.oneslogi.wms.logic.stock;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.bsbhv.BsTTrsoBhv;
import com.oneslogi.base.dbflute.exbhv.TTrsoBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingPalleteInfoListPmb;
import com.oneslogi.base.dbflute.exentity.BProperty;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingPalleteInfoList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDto.ShippingPalleteInfoInquiryBodyData;
import com.oneslogi.wms.dto.stock.ShippingPalleteInfoInquiryDto.ShippingPalleteInfoInquiryHeadData;
import com.oneslogi.wms.logic.common.PropertyLogic;

/**
 * 補充指示一覧データ取得ロジッククラス
 */
public class ShippingPalleteInfoInquirySelectLogic extends AbstractWmsLogic {

	@Inject
	private TTrsoBhv tTrsoBhv;
	@Inject
	private  PropertyLogic propertyLogic;

	/* 出庫パレット情報照会一覧データ */
	private List<ShippingPalleteInfoInquiryBodyData> searchResultList = new ArrayList<ShippingPalleteInfoInquiryBodyData>();

	// ===== 定数定義 =====
	public static final String PROPERTY_NM = "allowQueryCount";

	/**
	 * <h2>出庫パレット情報照会一覧データを取得する。</h2>
	 * @param head 出庫パレット情報照会画面.ヘッダ情報
	 * @param mCenter 拠点マスタ：拠点ID・拠点CD
	 * @param mClient 荷主マスタ：荷主ID・荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<ShippingPalleteInfoInquiryBodyData> 出庫パレット情報照会明細リスト
	 * @throws ParseException
	 */
	public List<ShippingPalleteInfoInquiryBodyData> select(ShippingPalleteInfoInquiryHeadData head,MCenter mCenter,
															MClient mClient, ErrorStatus errSts) throws ParseException {

		// ===== 入庫登録情報取得 =====
		ListResultBean<SqlShippingPalleteInfoList> resultList = new ListResultBean<SqlShippingPalleteInfoList>();

		// 外出しSQLの定義
		String path = BsTTrsoBhv.PATH_selectSqlShippingPalleteInfoList;

		// 検索条件の設定
		SqlShippingPalleteInfoListPmb pmb = new SqlShippingPalleteInfoListPmb();
		
		pmb.setCenterId(mCenter.getCenterId());
		pmb.setClientId(mClient.getClientId());
		
		if(head.getShipSchDateFrom() != null){
			pmb.setShipSchDtFrom(head.getShipSchDateFrom());
		}
		if(head.getShipSchDateTo() != null){
			pmb.setShipSchDtTo(head.getShipSchDateTo());
		}
		if(head.getOwnerOrderNo() != null){
			pmb.setOwnerOrderNo_PrefixSearch(head.getOwnerOrderNo());
		}
		if(head.getRequestType() != null){
			pmb.setRequestType(head.getRequestType());
		}
		if(head.getCustorderNo() != null){
			pmb.setCustorderNo_PrefixSearch(head.getCustorderNo());
		}
		if(head.getRmaNo() != null){
			pmb.setRmaNo_PrefixSearch(head.getRmaNo());
		}
		if(head.getRefNo() != null){
			pmb.setRefNo_PrefixSearch(head.getRefNo());
		}
		if(head.getSoPalletNo() != null){
			pmb.setSoPalletNo_PrefixSearch(head.getSoPalletNo());
		}
		if(head.getStatus() != null){
			pmb.setStatus(head.getStatus());
		}
		if(head.getShipToCd() != null){
			pmb.setShipToCd_PrefixSearch(head.getShipToCd());
		}
		if(head.getCustomerCd() != null){
			pmb.setCustomerCd_PrefixSearch(head.getCustomerCd());
		}

		// 検索実行
		Class<SqlShippingPalleteInfoList> entityType = SqlShippingPalleteInfoList.class;
		resultList = tTrsoBhv.outsideSql().selectList(path, pmb, entityType);

		// ===== ０件チェック =====
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return this.searchResultList;
		}

		 // 検索可能件数チェック
		BProperty property = new BProperty();
		property.setPropertyNm(PROPERTY_NM);
		property = propertyLogic.getUkEntityWithDeletedCheck(property);

		int PropertyNm = Integer.valueOf(property.getPropertyValue());

		if (resultList.size() > PropertyNm){
			this.getErrorManager().add(errSts, WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(PropertyNm));
			return this.searchResultList;
		}

		//検索されたテーブルレコードを一覧データ格納用のオブジェクトに設定
		for(SqlShippingPalleteInfoList list : resultList){

			ShippingPalleteInfoInquiryBodyData body = new ShippingPalleteInfoInquiryBodyData();

			body.setSts(list.getSts());
			body.setSoPalletNo(list.getSopalletno());
			body.setShipSchDate(list.getShipschdate());
			body.setOwnerOrderNo(list.getOwnerorderno());
			body.setOrderType(list.getOrdertype());
			body.setCustOrderNo(list.getCustorderno());
			body.setRmaNo(list.getRmano());
			body.setOwnerSoNo(list.getOwnersono());
			body.setShipDate(list.getShipdate());
			body.setExpectQty1Style1(list.getExpectQty1Style1());
			body.setExpectQty1Style2(list.getExpectQty1Style2());
			body.setShipToCd(list.getShiptocd());
			body.setShipToSName(list.getShiptoname());
			body.setOtherRefNo1(list.getOtherrefno1());
			body.setPalletKey(list.getPalletkey());
			body.setSoId(list.getSoid());
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
