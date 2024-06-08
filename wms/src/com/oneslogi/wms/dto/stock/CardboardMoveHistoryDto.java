package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlCardboardMoveHistoryListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CardboardMoveHistoryDto extends PagingDto {

	public static class CardboardMoveHistorySearchConditionDto{
		
		private String centerCd;
		private Long centerId;
		private String clientCd;
		private Long clientId;
		private String createDateTimeFrom;
		private String createDateTimeTo;
		private String makerCaseNoFrom;
		private String makerCaseNoTo;
		private String trsymbolId;
		private String receiveDate;
		private String shipDate;
		private String itemCd;
		private String productNm;
		private String lot1;
		private String lot4;
		private String symbolMakeNoFrom;
		private String symbolMakeNoTo;
		private String lot3;
		private String itfNo;
		private String carrierNo;
		
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
		public String getCreateDateTimeFrom() {
			return createDateTimeFrom;
		}
		public void setCreateDateTimeFrom(String createDateTimeFrom) {
			this.createDateTimeFrom = createDateTimeFrom;
		}
		public String getCreateDateTimeTo() {
			return createDateTimeTo;
		}
		public void setCreateDateTimeTo(String createDateTimeTo) {
			this.createDateTimeTo = createDateTimeTo;
		}
		public String getMakerCaseNoFrom() {
			return makerCaseNoFrom;
		}
		public void setMakerCaseNoFrom(String makerCaseNoFrom) {
			this.makerCaseNoFrom = makerCaseNoFrom;
		}
		public String getMakerCaseNoTo() {
			return makerCaseNoTo;
		}
		public void setMakerCaseNoTo(String makerCaseNoTo) {
			this.makerCaseNoTo = makerCaseNoTo;
		}
		public String getTrsymbolId() {
			return trsymbolId;
		}
		public void setTrsymbolId(String trsymbolId) {
			this.trsymbolId = trsymbolId;
		}
		public String getReceiveDate() {
			return receiveDate;
		}
		public void setReceiveDate(String receiveDate) {
			this.receiveDate = receiveDate;
		}
		public String getShipDate() {
			return shipDate;
		}
		public void setShipDate(String shipDate) {
			this.shipDate = shipDate;
		}
		public String getItemCd() {
			return itemCd;
		}
		public void setItemCd(String itemCd) {
			this.itemCd = itemCd;
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
		public String getSymbolMakeNoFrom() {
			return symbolMakeNoFrom;
		}
		public void setSymbolMakeNoFrom(String symbolMakeNoFrom) {
			this.symbolMakeNoFrom = symbolMakeNoFrom;
		}
		public String getSymbolMakeNoTo() {
			return symbolMakeNoTo;
		}
		public void setSymbolMakeNoTo(String symbolMakeNoTo) {
			this.symbolMakeNoTo = symbolMakeNoTo;
		}
		public String getLot3() {
			return lot3;
		}
		public void setLot3(String lot3) {
			this.lot3 = lot3;
		}
		public String getItfNo() {
			return itfNo;
		}
		public void setItfNo(String itfNo) {
			this.itfNo = itfNo;
		}
		public String getCarrierNo() {
			return carrierNo;
		}
		public void setCarrierNo(String carrierNo) {
			this.carrierNo = carrierNo;
		}
		public Long getCenterId() {
			return centerId;
		}
		public void setCenterId(Long centerId) {
			this.centerId = centerId;
		}
		public Long getClientId() {
			return clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		public String getProductNm() {
			return productNm;
		}
		public void setProductNm(String productNm) {
			this.productNm = productNm;
		}
		
	};
	
	public static class CardboardMoveHistoryData implements Serializable{
		
		//検索条件
		public CardboardMoveHistorySearchConditionDto searchCondition = new CardboardMoveHistorySearchConditionDto();
		
		//検索結果
		public List<SqlCardboardMoveHistoryListDto> resultList = new ArrayList<SqlCardboardMoveHistoryListDto>();
		
	};
	
	public CardboardMoveHistoryData data = new CardboardMoveHistoryData();
	
}
