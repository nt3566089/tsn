package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlReceiveDesignMasterListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveDesignMasterListDto  extends PagingDto {




	public static class ReceiveDesignMasterListLogicSearchConditionDto {
		private Long clientId;
		private String clientCd;
		private String centerCd;
		private String productCd;
		private String productNm;
		private String validType;
		private String updateDate;
		private String rcvFrDateFrom;
		private String rcvFrDateTo;
		private String rcvToDateFrom;
		private String rcvToDateTo;
		
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
		public String getCenterCd() {
			return centerCd;
		}
		public void setCenterCd(String centerCd) {
			this.centerCd = centerCd;
		}
		public String getProductCd() {
			return productCd;
		}
		public void setProductCd(String productCd) {
			this.productCd = productCd;
		}
		public String getProductNm() {
			return productNm;
		}
		public void setProductNm(String productNm) {
			this.productNm = productNm;
		}
		public String getValidType() {
			return validType;
		}
		public void setValidType(String validType) {
			this.validType = validType;
		}
		public String getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}
		public String getRcvFrDateFrom() {
			return rcvFrDateFrom;
		}
		public void setRcvFrDateFrom(String rcvFrDateFrom) {
			this.rcvFrDateFrom = rcvFrDateFrom;
		}
		public String getRcvFrDateTo() {
			return rcvFrDateTo;
		}
		public void setRcvFrDateTo(String rcvFrDateTo) {
			this.rcvFrDateTo = rcvFrDateTo;
		}
		public String getRcvToDateFrom() {
			return rcvToDateFrom;
		}
		public void setRcvToDateFrom(String rcvToDateFrom) {
			this.rcvToDateFrom = rcvToDateFrom;
		}
		public String getRcvToDateTo() {
			return rcvToDateTo;
		}
		public void setRcvToDateTo(String rcvToDateTo) {
			this.rcvToDateTo = rcvToDateTo;
		}
		
		
	

	};


	public static class ReceiveDesignMasterListData implements Serializable {
		//検索条件
		public	ReceiveDesignMasterListLogicSearchConditionDto cond = new ReceiveDesignMasterListLogicSearchConditionDto();

		//検索結果
		public	List<SqlReceiveDesignMasterListDto>	resultList = new ArrayList<SqlReceiveDesignMasterListDto>();
	};

	public	 ReceiveDesignMasterListData data = new ReceiveDesignMasterListData();
}










