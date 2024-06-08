package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierSlipYmtDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CarrierSlipYmtMasterDto extends PagingDto {

	public static MCarrierSlipYmtDto chaseMCarrierSlipYmtDto() {
		return chaseMCarrierSlipYmtDto(new MCarrierSlipYmtDto());
	}

	public static MCarrierSlipYmtDto chaseMCarrierSlipYmtDto(MCarrierSlipYmtDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static MCarrierSlipYmtDto chaseMCarrierSlipYmtBodyDto() {
		return chaseMCarrierSlipYmtBodyDto(new MCarrierSlipYmtDto());
	}

	public static MCarrierSlipYmtDto chaseMCarrierSlipYmtBodyDto(MCarrierSlipYmtDto dto) {
		return dto;
	}

	public static class CarrierSlipYmtData implements Serializable {
		//検索条件
		public MCarrierSlipYmtDto carrierSlipYmtMasterSearch = chaseMCarrierSlipYmtDto();
		//検索結果
		public List<MCarrierSlipYmtDto> carrierSlipYmtList = new ArrayList<MCarrierSlipYmtDto>();
		//空行
		public MCarrierSlipYmtDto blankRow = chaseMCarrierSlipYmtBodyDto();
		// 郵便番号エンティティー（ご依頼主住所取得用）
		public MZipDto zip = new MZipDto();
	};

	public CarrierSlipYmtData data = new CarrierSlipYmtData();
}
