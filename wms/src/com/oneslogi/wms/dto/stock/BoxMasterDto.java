package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlBoxMasterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BoxMasterDto extends PagingDto {// このDTOに検索処理のために必要なデータをまとめる機能　extends PagingDto

	//検索条件を格納するDTO
	public static class BoxMasterLogicSearchConditionDto{
		private String centerCd;
		private String delFlg;
		private Long centerId;
		private String boxCd;
		private String boxNm;
		private String boxType;


		public String getCenterCd() {
			return centerCd;
		}

		public void setCenterCd(String centerCd) {
			this.centerCd = centerCd;
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

		public String getBoxCd() {
			return boxCd;
		}

		public void setBoxCd(String boxCd) {
			this.boxCd = boxCd;
		}

		public String getBoxNm() {
			return boxNm;
		}

		public void setBoxNm(String boxNm) {
			this.boxNm = boxNm;
		}

		public String getBoxType() {
			return boxType;
		}

		public void setBoxType(String boxType) {
			this.boxType = boxType;
		}

	};


	public static class  BoxMasterData implements Serializable{

		//検索条件を入れるためのDTO static
		public BoxMasterLogicSearchConditionDto searchCondition = new BoxMasterLogicSearchConditionDto();

		//検索結果を入れるためのDTO static
		public	List<SqlBoxMasterDto>	resultList = new ArrayList<SqlBoxMasterDto>();

		//空行
		public SqlBoxMasterDto blankRow = new SqlBoxMasterDto();


	};

	public BoxMasterData data = new BoxMasterData();
}
