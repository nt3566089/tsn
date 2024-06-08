package com.oneslogi.wms.dto.stock;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterEditBlkDto;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterEditLinDto;
import com.oneslogi.base.dbflute.dto.customize.SqlSortingPlaceMasterEditSrwDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class SortingPlaceMasterEditDto extends PagingDto {

//	//検索条件を格納するDTO
//		public static class SortingPlaceMasterEditLogicSearchConditionDto{
//			private String centerCd;
//			private String clientCd;
//			private String delFlg;
//			private Long centerId;
//			private Long clientId;
//
//
//			public String getCenterCd() {
//				return centerCd;
//			}
//			public void setCenterCd(String centerCd) {
//				this.centerCd = centerCd;
//			}
//			public String getClientCd() {
//				return clientCd;
//			}
//			public void setClientCd(String clientCd) {
//				this.clientCd = clientCd;
//			}
//			public String getDelFlg() {
//				return delFlg;
//			}
//			public void setDelFlg(String delFlg) {
//				this.delFlg = delFlg;
//			}
//			public Long getCenterId() {
//				return centerId;
//			}
//			public void setCenterId(Long centerId) {
//				this.centerId = centerId;
//			}
//			public Long getClientId() {
//				return clientId;
//			}
//			public void setClientId(Long clientId) {
//				this.clientId = clientId;
//			}
//
//		}




	public static class SortingPlaceMasterEditData implements Serializable {
//		//検索条件を入れるためのDTO  static
//		public	SortingPlaceMasterListLogicSearchConditionDto	searchCondition = new SortingPlaceMasterListLogicSearchConditionDto();

		// 共通部分
		public SqlSortingPlaceMasterEditSrwDto srw = new SqlSortingPlaceMasterEditSrwDto();

		// ライン
		public SqlSortingPlaceMasterEditLinDto lin = new SqlSortingPlaceMasterEditLinDto();

		// ブロック
		public SqlSortingPlaceMasterEditBlkDto blk = new SqlSortingPlaceMasterEditBlkDto();

		public String lineBlockCommon = new String();

	};

	public SortingPlaceMasterEditData data = new SortingPlaceMasterEditData();
}