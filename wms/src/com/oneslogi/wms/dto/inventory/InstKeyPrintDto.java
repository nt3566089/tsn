package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dto.customize.SqlInstKeyListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.dto.report.NonconformityStockReportListDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InstKeyPrintDto extends PrintParamDto {

	public static TInventoryHDto chaseTInventoryHDto() {
		return chaseTInventoryHDto(new TInventoryHDto());
	}

	public static TInventoryHDto chaseTInventoryHDto(TInventoryHDto dto) {
		return dto;
	}

	public static TInventoryInstDto chasTInventoryInstDto() {
		return chaseTInventoryInstDtoDto(new TInventoryInstDto());
	}

	public static TInventoryInstDto chaseTInventoryInstDtoDto(TInventoryInstDto dto) {

		return dto;
	}

	public static class InstKeyListata implements Serializable {
		// 検索条件を入れるDTO
		public TInventoryHDto head = chaseTInventoryHDto();
		public TInventoryInstDto inst = chasTInventoryInstDto();
		public String userCd;
		
		public String getUserCd() {
			return userCd;
		}

		public void setUserCd(String userCd) {
			this.userCd = userCd;
		}

		//検索結果
		public List<SqlInstKeyListDto> bodyList = new ArrayList<SqlInstKeyListDto>();
		
		//不適品在庫調査表アウトプットデータ
		public List<NonconformityStockReportListDto> printList = new ArrayList<NonconformityStockReportListDto>();		
	};

	public InstKeyListata data = new InstKeyListata();
}
