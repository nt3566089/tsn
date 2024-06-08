package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.OutputDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingPalleteInfoInquiryDetailDto extends OutputDto {

	public static class ShippingPalleteInfoInquiryDetailHeadData implements Serializable {

		//検索条件（ヘッダ情報）

		//拠点CD
		public String centerCd;
		//荷主CD
		public String clientCd;
		//ステータス
		public String status;
		//P/LNo.
		public String soPalletNo;
		//出庫予定日
		public String shipSchDate;
		//車割キー
		public String ownerOrderNo;
		//依頼種別
		public String requestType;
		//依頼番号
		public String custorderNo;
		//問合番号
		public String rmaNo;
		//整理番号
		public String refNo;
		//出庫実績日
		public String shipDate;
		//積付合計数量(ケース)
		public Long totalQtyCase;
		//積付合計数量(カートン)
		public Long totalQtyCarton;
		//受入先CD
		public String shipToCd;
		//輸送形態
		public String otherRefNo1;
		//パレット積付キー
		public String palletKey;
		//出庫予定ID
		public long soId;
		
		//------------------eclipseでの自動生成-------------------------------
		
		public String getCenterCd() {
			return centerCd;
		}
		public void setCenterCd(String centerCd) {
			this.centerCd = centerCd;
		}
		public String getClientCd() {
			return clientCd;
		}
		public void setClientCd(String clientCd) {
			this.clientCd = clientCd;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getSoPalletNo() {
			return soPalletNo;
		}
		public void setSoPalletNo(String soPalletNo) {
			this.soPalletNo = soPalletNo;
		}
		public String getShipSchDate() {
			return shipSchDate;
		}
		public void setShipSchDate(String shipSchDate) {
			this.shipSchDate = shipSchDate;
		}
		public String getOwnerOrderNo() {
			return ownerOrderNo;
		}
		public void setOwnerOrderNo(String ownerOrderNo) {
			this.ownerOrderNo = ownerOrderNo;
		}
		public String getRequestType() {
			return requestType;
		}
		public void setRequestType(String requestType) {
			this.requestType = requestType;
		}
		public String getCustorderNo() {
			return custorderNo;
		}
		public void setCustorderNo(String custorderNo) {
			this.custorderNo = custorderNo;
		}
		public String getRmaNo() {
			return rmaNo;
		}
		public void setRmaNo(String rmaNo) {
			this.rmaNo = rmaNo;
		}
		public String getRefNo() {
			return refNo;
		}
		public void setRefNo(String refNo) {
			this.refNo = refNo;
		}
		public String getShipDate() {
			return shipDate;
		}
		public void setShipDate(String shipDate) {
			this.shipDate = shipDate;
		}
		public Long getTotalQtyCase() {
			return totalQtyCase;
		}
		public void setTotalQtyCase(Long totalQtyCase) {
			this.totalQtyCase = totalQtyCase;
		}
		public Long getTotalQtyCarton() {
			return totalQtyCarton;
		}
		public void setTotalQtyCarton(Long totalQtyCarton) {
			this.totalQtyCarton = totalQtyCarton;
		}
		public String getShipToCd() {
			return shipToCd;
		}
		public void setShipToCd(String shipToCd) {
			this.shipToCd = shipToCd;
		}
		public String getOtherRefNo1() {
			return otherRefNo1;
		}
		public void setOtherRefNo1(String otherRefNo1) {
			this.otherRefNo1 = otherRefNo1;
		}
		public String getPalletKey() {
			return palletKey;
		}
		public void setPalletKey(String palletKey) {
			this.palletKey = palletKey;
		}
		public long getSoId() {
			return soId;
		}
		public void setSoId(long soId) {
			this.soId = soId;
		}
		
	}

	public static class ShippingPalleteInfoInquiryDetailBodyData implements Serializable {

		//検索一覧結果（ボディ情報）
		//荷主ID
		public Long clientId;
		//荷主CD
		public String clientCd;
		//拠点ID
		public Long centerId;
		//拠点CD
		public String centerCd;
		//荷主名称
		public String clientNm;
		//拠点名称
		public String centerNm;

		//段ボール
		public Long symbolLineNo;
		//入庫キー
		public Long rcvKey;
		//生出番号
		public String symbolMakeNo;
		//銘柄CD
		public String product_Cd;
		//銘柄名称
		public String product_Nm;
		//商社搬入番号
		public String lot1;
		//製造年月日
		public String lot4;
		//デザイン区分
		public String lot3;
		//製造記号
		public String lot2;
		//在庫区分
		public String stockTypeCd;
		//メーカーケースCD
		public String makerCaseNo;
		//入庫年月日
		public String receiveDate;
		//数量(カートン)
		public BigDecimal totalQty;
		//内貨・外貨区分
		public String foreignCargoFlg;
		//需給CD
		public String ifItemCd;
		
		//------------------eclipseでの自動生成-------------------------------
		
		public Long getClientId() {
			return clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		public String getClientCd() {
			return clientCd;
		}
		public void setClientCd(String clientCd) {
			this.clientCd = clientCd;
		}
		public Long getCenterId() {
			return centerId;
		}
		public void setCenterId(Long centerId) {
			this.centerId = centerId;
		}
		public String getCenterCd() {
			return centerCd;
		}
		public void setCenterCd(String centerCd) {
			this.centerCd = centerCd;
		}
		public String getClientNm() {
			return clientNm;
		}
		public void setClientNm(String clientNm) {
			this.clientNm = clientNm;
		}
		public String getCenterNm() {
			return centerNm;
		}
		public void setCenterNm(String centerNm) {
			this.centerNm = centerNm;
		}
		public Long getSymbolLineNo() {
			return symbolLineNo;
		}
		public void setSymbolLineNo(Long symbolLineNo) {
			this.symbolLineNo = symbolLineNo;
		}
		public Long getRcvKey() {
			return rcvKey;
		}
		public void setRcvKey(Long rcvKey) {
			this.rcvKey = rcvKey;
		}
		public String getSymbolMakeNo() {
			return symbolMakeNo;
		}
		public void setSymbolMakeNo(String symbolMakeNo) {
			this.symbolMakeNo = symbolMakeNo;
		}
		public String getProduct_Cd() {
			return product_Cd;
		}
		public void setProduct_Cd(String product_Cd) {
			this.product_Cd = product_Cd;
		}
		public String getProduct_Nm() {
			return product_Nm;
		}
		public void setProduct_Nm(String product_Nm) {
			this.product_Nm = product_Nm;
		}
		public String getLot1() {
			return lot1;
		}
		public void setLot1(String lot1) {
			this.lot1 = lot1;
		}
		public String getLot4() {
			return lot4;
		}
		public void setLot4(String lot4) {
			this.lot4 = lot4;
		}
		public String getLot3() {
			return lot3;
		}
		public void setLot3(String lot3) {
			this.lot3 = lot3;
		}
		public String getLot2() {
			return lot2;
		}
		public void setLot2(String lot2) {
			this.lot2 = lot2;
		}
		public String getStockTypeCd() {
			return stockTypeCd;
		}
		public void setStockTypeCd(String stockTypeCd) {
			this.stockTypeCd = stockTypeCd;
		}
		public String getMakerCaseNo() {
			return makerCaseNo;
		}
		public void setMakerCaseNo(String makerCaseNo) {
			this.makerCaseNo = makerCaseNo;
		}
		public String getReceiveDate() {
			return receiveDate;
		}
		public void setReceiveDate(String receiveDate) {
			this.receiveDate = receiveDate;
		}
		public BigDecimal getTotalQty() {
			return totalQty;
		}
		public void setTotalQty(BigDecimal totalQty) {
			this.totalQty = totalQty;
		}
		public String getForeignCargoFlg() {
			return foreignCargoFlg;
		}
		public void setForeignCargoFlg(String foreignCargoFlg) {
			this.foreignCargoFlg = foreignCargoFlg;
		}
		public String getIfItemCd() {
			return ifItemCd;
		}
		public void setIfItemCd(String ifItemCd) {
			this.ifItemCd = ifItemCd;
		}
		
	}

//------------------eclipseでの自動生成が完了-------------------------------



	public static class ShippingPalleteInfoInquiryDetailData implements Serializable {
		//検索条件
		public ShippingPalleteInfoInquiryDetailHeadData head = new ShippingPalleteInfoInquiryDetailHeadData();
		//検索結果
		public List<ShippingPalleteInfoInquiryDetailBodyData> body = new ArrayList<ShippingPalleteInfoInquiryDetailBodyData>();

		public boolean isSearchCurrentData = false;

	};

	public ShippingPalleteInfoInquiryDetailData data = new ShippingPalleteInfoInquiryDetailData();

}
