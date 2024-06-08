package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlInventoryDateMasterListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryDateMasterListDto  extends PagingDto {




	public static class InventoryDateMasterListLogicSearchConditionDto {



		private Long	centerId;
		private Long	clientId;
		private String centerCd;
		private String clientCd;
		private String targetDate;
		private String sundayFlg;

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
		public String getTargetDate() {
			return targetDate;
		}
		public void setTargetDate(String targetDate) {
			this.targetDate = targetDate;
		}
		public String getSundayFlg() {
			return sundayFlg;
		}
		public void setSundayFlg(String sundayFlg) {
			this.sundayFlg = sundayFlg;
		}

	};


	public static class InventoryDateMasterListData implements Serializable {
		//検索条件
		public	InventoryDateMasterListLogicSearchConditionDto cond = new InventoryDateMasterListLogicSearchConditionDto();

		//検索結果
		public	List<SqlInventoryDateMasterListDto>	resultList = new ArrayList<SqlInventoryDateMasterListDto>();
	};

	public	 InventoryDateMasterListData data = new InventoryDateMasterListData();
}










