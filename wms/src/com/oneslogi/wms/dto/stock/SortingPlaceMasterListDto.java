package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterListBlkDto;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterListLinDto;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterListSrwDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class SortingPlaceMasterListDto extends PagingDto {

	//検索条件を格納するDTO
	public static class SortingPlaceMasterListLogicSearchConditionDto{
		private String centerCd;
		private String clientCd;
		private String delFlg;
		private Long centerId;
		private Long clientId;



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

		public String getDelFlg() {
			return delFlg;
		}
		public void setDelFlg(String delFlg) {
			this.delFlg = delFlg;
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


	};


	public static class SortingPlaceMasterListData implements Serializable {

		//検索条件を入れるためのDTO  static
		public	SortingPlaceMasterListLogicSearchConditionDto	searchCondition = new SortingPlaceMasterListLogicSearchConditionDto();

		//検索結果を入れるためのDTO static
		public	SqlSortingPlaceMasterListSrwDto	resultSrw = new SqlSortingPlaceMasterListSrwDto();
		public	List<SqlSortingPlaceMasterListLinDto>	resultListLin = new ArrayList<SqlSortingPlaceMasterListLinDto>();
		public	List<SqlSortingPlaceMasterListBlkDto>	resultListBlk = new ArrayList<SqlSortingPlaceMasterListBlkDto>();



	};

	public	SortingPlaceMasterListData data = new SortingPlaceMasterListData();

}
