package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlMLocationMasterListDto;
import com.oneslogi.base.dbflute.dto.customize.SqlMLocationMasterOutputDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class LocationMasterDto extends PagingDto {


	public static class LocationMasterListLogicSearchConditionDto{


		private String clientCd;
		private String locGroup;
		private String locationCd;
		private String allocNgFlg;
		private String zone;
		private String delFlg;
		private Long clientId;
		private Long centerId;
		private String centerCd;

		public String getClientCd() {
			return clientCd;
		}
		public void setClientCd(String clientCd) {
			this.clientCd = clientCd;
		}
		public String getLocGroup() {
			return locGroup;
		}
		public void setLocGroup(String locGroup) {
			this.locGroup = locGroup;
		}
		public String getLocationCd() {
			return locationCd;
		}
		public void setLocationCd(String locationCd) {
			this.locationCd = locationCd;
		}
		public String getAllocNgFlg() {
			return allocNgFlg;
		}
		public void setAllocNgFlg(String allocNgFlg) {
			this.allocNgFlg = allocNgFlg;
		}
		public String getZone() {
			return zone;
		}
		public void setZone(String zone) {
			this.zone = zone;
		}
		public String getDelFlg() {
			return delFlg;
		}
		public void setDelFlg(String delFlg) {
			this.delFlg = delFlg;
		}
		public Long getClientId() {
			return clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
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
	public static class LocationMasterData implements Serializable {

		//検索条件
		public LocationMasterListLogicSearchConditionDto searchCondition = new LocationMasterListLogicSearchConditionDto();

		//検索結果
		public List<SqlMLocationMasterListDto> resultList = new ArrayList<SqlMLocationMasterListDto>();




		//検索結果
		public List<SqlMLocationMasterOutputDto> excelOutputData = new ArrayList<SqlMLocationMasterOutputDto>();

	};

	public LocationMasterData data = new LocationMasterData();
}
