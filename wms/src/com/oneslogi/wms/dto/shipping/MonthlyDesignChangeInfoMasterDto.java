package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlMonthlyDesignChangeInfoMasterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class MonthlyDesignChangeInfoMasterDto extends PagingDto {// このDTOに検索処理のために必要なデータをまとめる機能　extends PagingDto

	//検索条件を格納するDTO
	public static class MonthlyDesignChangeInfoMasterLogicSearchConditionDto{
		private String centerCd;
		private String clientCd;
		private String delFlg;
		private Long centerId;
		private Long clientId;
		private String productCd;
		private String sotedunit;
		private String productNm;

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
		public String getProductCd() {
			return productCd;
		}
		public void setProductCd(String productCd) {
			this.productCd = productCd;
		}
		public String getSotedunit() {
			return sotedunit;
		}
		public void setSotedunit(String sotedunit) {
			this.sotedunit = sotedunit;
		}
		public String getProductNm() {
			return productNm;
		}
		public void setProductNm(String productNm) {
			this.productNm = productNm;
		}

	};


	public static class  MonthlyDesignChangeInfoMasterData implements Serializable{

		//検索条件を入れるためのDTO static
		public MonthlyDesignChangeInfoMasterLogicSearchConditionDto searchCondition = new MonthlyDesignChangeInfoMasterLogicSearchConditionDto();

		//検索結果を入れるためのDTO static
		public	List<SqlMonthlyDesignChangeInfoMasterDto>	resultList = new ArrayList<SqlMonthlyDesignChangeInfoMasterDto>();

		//空行
		public SqlMonthlyDesignChangeInfoMasterDto blankRow = new SqlMonthlyDesignChangeInfoMasterDto();


	};

	public MonthlyDesignChangeInfoMasterData data = new MonthlyDesignChangeInfoMasterData();
}
