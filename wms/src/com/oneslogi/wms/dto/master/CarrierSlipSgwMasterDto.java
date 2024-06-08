package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierSlipSgwDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CarrierSlipSgwMasterDto extends PagingDto {

	public static MCarrierSlipSgwDto chaseMCarrierSlipSgwDto() {
		return chaseMCarrierSlipSgwDto(new MCarrierSlipSgwDto());
	}

	public static MCarrierSlipSgwDto chaseMCarrierSlipSgwDto(MCarrierSlipSgwDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static MCarrierSlipSgwDto chaseMCarrierSlipSgwBodyDto() {
		return chaseMCarrierSlipSgwBodyDto(new MCarrierSlipSgwDto());
	}

	public static MCarrierSlipSgwDto chaseMCarrierSlipSgwBodyDto(MCarrierSlipSgwDto dto) {
//		if (dto.getMWarehouse() == null) {
//			dto.setMWarehouse(new MWarehouseDto());
//		}
		return dto;
	}

	public static class CarrierSlipSgwData implements Serializable {
		//検索条件
		public MCarrierSlipSgwDto carrierSlipSgwMasterSearch = chaseMCarrierSlipSgwDto();
		//検索結果
		public List<MCarrierSlipSgwDto> carrierSlipSgwList = new ArrayList<MCarrierSlipSgwDto>();
		//空行
		public MCarrierSlipSgwDto blankRow = chaseMCarrierSlipSgwBodyDto();
		// 郵便番号エンティティー（ご依頼主住所取得用）
		public MZipDto zip = new MZipDto();
	};

	public CarrierSlipSgwData data = new CarrierSlipSgwData();
}
