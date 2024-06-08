package com.oneslogi.wms.dto.operation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlWorkloadInquiryListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class WorkloadInquiryDto extends PagingDto {

	public static SqlWorkloadInquiryListDto chaseSqlWorkloadInquiryListDto() {

		return chaseSqlWorkloadInquiryListDto(new SqlWorkloadInquiryListDto());

	}

	public static SqlWorkloadInquiryListDto chaseSqlWorkloadInquiryListDto(SqlWorkloadInquiryListDto dto) {

		return dto;

	}

	public static class WorkloadInquiryData implements Serializable {

		// 検索条件を入れるDTO
		public SqlWorkloadInquiryListDto head = chaseSqlWorkloadInquiryListDto();
		// 検索結果を入れるDTO
		public List<SqlWorkloadInquiryListDto> list = new ArrayList<SqlWorkloadInquiryListDto>();

	};

	public WorkloadInquiryData data = new WorkloadInquiryData();
}
