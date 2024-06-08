package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MCarrierBoxDto;
import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MCommonCarrierDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CarrierMasterEditDto extends BaseDto {

	public static MCarrierDto chaseMCarrierDto() {
		return chaseMCarrierDto(new MCarrierDto());
	}

	public static MCarrierDto chaseMCarrierDto(MCarrierDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMCommonCarrier() == null) {
			dto.setMCommonCarrier(new MCommonCarrierDto());
		}

		return dto;
	}

	public static class CarrierMasterEditData implements Serializable {
		//画面ヘッダ情報
		public MCarrierDto head = chaseMCarrierDto();
		//画面明細情報
		public List<MBoxDto> body = new ArrayList<MBoxDto>();
		//空行
		public MCarrierBoxDto blankRow = new MCarrierBoxDto();

	};

	public CarrierMasterEditData data = new CarrierMasterEditData();
}
