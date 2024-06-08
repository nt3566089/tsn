package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.OutputDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingPalleteInfoInquiryDto extends OutputDto {

	public static class ShippingPalleteInfoInquiryHeadData implements Serializable {

		//検索条件（ヘッダ情報）

		//拠点CD
		public String centerCd;
		//荷主CD
		public String clientCd;
		//出庫予定日(From)
		public String shipSchDateFrom;
		//出庫予定日(To)
		public String shipSchDateTo;
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
		//P/LNo.
		public String soPalletNo;
		//ステータス
		public String status;
		//受入先CD
		public String shipToCd;
		//特約店CD
		public String customerCd;
		
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
		public String getShipSchDateFrom() {
			return shipSchDateFrom;
		}
		public void setShipSchDateFrom(String shipSchDateFrom) {
			this.shipSchDateFrom = shipSchDateFrom;
		}
		public String getShipSchDateTo() {
			return shipSchDateTo;
		}
		public void setShipSchDateTo(String shipSchDateTo) {
			this.shipSchDateTo = shipSchDateTo;
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
		public String getSoPalletNo() {
			return soPalletNo;
		}
		public void setSoPalletNo(String soPalletNo) {
			this.soPalletNo = soPalletNo;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getShipToCd() {
			return shipToCd;
		}
		public void setShipToCd(String shipToCd) {
			this.shipToCd = shipToCd;
		}
		public String getCustomerCd() {
			return customerCd;
		}
		public void setCustomerCd(String customerCd) {
			this.customerCd = customerCd;
		}

	}

	public static class ShippingPalleteInfoInquiryBodyData implements Serializable {

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

		//ステータス
		public String sts;
		//P/LNo.
		public String soPalletNo;
		//出庫予定日
		public String shipSchDate;
		//車割キー
		public String ownerOrderNo;
		//依頼種別
		public String orderType;
		//依頼番号
		public String custOrderNo;
		//問合番号
		public String rmaNo;
		//整理番号
		public String ownerSoNo;
		//出庫実績日
		public String shipDate;
		//積付合計数量(ケース)
		public BigDecimal expectQty1Style1;
		//積付合計数量(カートン)
		public BigDecimal expectQty1Style2;
		//受入先CD
		public String shipToCd;
		//受入先名称
		public String shipToSName;
		//輸送形態
		public String otherRefNo1;
		//パレット積付キー
		public String palletKey;
		//出庫予定ID
		public Long soId;
		
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
		public String getSts() {
			return sts;
		}
		public void setSts(String sts) {
			this.sts = sts;
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
		public String getOrderType() {
			return orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getCustOrderNo() {
			return custOrderNo;
		}
		public void setCustOrderNo(String custOrderNo) {
			this.custOrderNo = custOrderNo;
		}
		public String getRmaNo() {
			return rmaNo;
		}
		public void setRmaNo(String rmaNo) {
			this.rmaNo = rmaNo;
		}
		public String getOwnerSoNo() {
			return ownerSoNo;
		}
		public void setOwnerSoNo(String ownerSoNo) {
			this.ownerSoNo = ownerSoNo;
		}
		public String getShipDate() {
			return shipDate;
		}
		public void setShipDate(String shipDate) {
			this.shipDate = shipDate;
		}
		public BigDecimal getExpectQty1Style1() {
			return expectQty1Style1;
		}
		public void setExpectQty1Style1(BigDecimal expectQty1Style1) {
			this.expectQty1Style1 = expectQty1Style1;
		}
		public BigDecimal getExpectQty1Style2() {
			return expectQty1Style2;
		}
		public void setExpectQty1Style2(BigDecimal expectQty1Style2) {
			this.expectQty1Style2 = expectQty1Style2;
		}
		public String getShipToCd() {
			return shipToCd;
		}
		public void setShipToCd(String shipToCd) {
			this.shipToCd = shipToCd;
		}
		public String getShipToSName() {
			return shipToSName;
		}
		public void setShipToSName(String shipToSName) {
			this.shipToSName = shipToSName;
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
		public Long getSoId() {
			return soId;
		}
		public void setSoId(Long soId) {
			this.soId = soId;
		}

	}

//------------------eclipseでの自動生成が完了-------------------------------



	public static class ShippingPalleteInfoInquiryData implements Serializable {
		//検索条件
		public ShippingPalleteInfoInquiryHeadData head = new ShippingPalleteInfoInquiryHeadData();
		//検索結果
		public List<ShippingPalleteInfoInquiryBodyData> body = new ArrayList<ShippingPalleteInfoInquiryBodyData>();

		public boolean isSearchCurrentData = false;


	};

	public ShippingPalleteInfoInquiryData data = new ShippingPalleteInfoInquiryData();

	// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei

}
