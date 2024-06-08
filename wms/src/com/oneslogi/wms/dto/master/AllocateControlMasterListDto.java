package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlAllocateControlMasterListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class AllocateControlMasterListDto extends PagingDto {
	//検索条件を格納するDTO
	public static class AllocateControlMasterListLogicSearchConditionDto{
		private String clientCd;
		private String productCd;
		private String pickfrdateFrom;
		private String pickfrdateTo;
		private String picktodateFrom;
		private String picktodateTo;
		private String designflg;
		private String validtype;
		private Long	clientId;
		private String productNm;
		private Long	centerId;
		private String	centerCd;


		public String getClientCd() {
			return clientCd;
		}
		public void setClientCd(String clientCd) {
			this.clientCd = clientCd;
		}
		public String getProductCd() {
			return productCd;
		}
		public void setProductCd(String productCd) {
			this.productCd = productCd;
		}
		public String getPickfrdateFrom() {
			return pickfrdateFrom;
		}
		public void setPickfrdateFrom(String pickfrdateFrom) {
			this.pickfrdateFrom = pickfrdateFrom;
		}
		public String getPickfrdateTo() {
			return pickfrdateTo;
		}
		public void setPickfrdateTo(String pickfrdateTo) {
			this.pickfrdateTo = pickfrdateTo;
		}
		public String getPicktodateFrom() {
			return picktodateFrom;
		}
		public void setPicktodateFrom(String picktodateFrom) {
			this.picktodateFrom = picktodateFrom;
		}
		public String getPicktodateTo() {
			return picktodateTo;
		}
		public void setPicktodateTo(String picktodateTo) {
			this.picktodateTo = picktodateTo;
		}
		public String getDesignflg() {
			return designflg ;
		}
		public void setDesignflg(String designflg) {
			this.designflg = designflg;
		}
		public String getValidtype() {
			return validtype;
		}
		public void setValidtype(String validtype) {
			this.validtype = validtype;
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

	};

	public static class AllocateControlMasterListData implements Serializable {

		//検索条件
		public AllocateControlMasterListLogicSearchConditionDto  searchCondition = new AllocateControlMasterListLogicSearchConditionDto();

		//検索結果
		public List<SqlAllocateControlMasterListDto> resultList = new ArrayList<SqlAllocateControlMasterListDto>();
	};

	public AllocateControlMasterListData data = new AllocateControlMasterListData();
}
