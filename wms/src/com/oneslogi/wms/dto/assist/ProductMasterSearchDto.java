package com.oneslogi.wms.dto.assist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductMasterSearchDto extends PagingDto {

	public static MProductDto chaseMProductDto() {
		return chaseMProductDto(new MProductDto());
	}

	public static MProductDto chaseMProductDto(MProductDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class ProductData implements Serializable {
		//検索条件
		public MProductDto head = chaseMProductDto();
		//検索結果
		public List<MProductDto> list = new ArrayList<MProductDto>();
	};

	public ProductData data = new ProductData();

}
