package com.oneslogi.wms.dto.returns;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TTrbaditemcaseDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class NonconformityLabelPrintDto extends PagingDto {

	public static TTrbaditemcaseDto chaseTTrbaditemcaseDto() {
		return chaseTTrbaditemcaseDto(new TTrbaditemcaseDto());
	}

	public static TTrbaditemcaseDto chaseTTrbaditemcaseDto(TTrbaditemcaseDto dto) {
		return dto;
	}

	public static class NonconformityLabelPrintData implements Serializable {
		//検索条件を入れるDTO
		public TTrbaditemcaseDto search = chaseTTrbaditemcaseDto();
		//検索結果を入れるDTO
		public List<TTrbaditemcaseDto> list = new ArrayList<TTrbaditemcaseDto>();
		//不適品ラベルアウトプットデータを入れるDTO
		public PrintParamDto printData = new PrintParamDto();
	};

	public NonconformityLabelPrintData data = new NonconformityLabelPrintData();
}
