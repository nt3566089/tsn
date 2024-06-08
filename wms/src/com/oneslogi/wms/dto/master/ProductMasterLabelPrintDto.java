package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductMasterLabelPrintDto extends PrintParamDto{

	public static MCenterDto chaseMCenterDto() {
		return chaseMCenterDto(new MCenterDto());
	}

	public static MCenterDto chaseMCenterDto(MCenterDto dto) {
		return dto;
	}

	public static MProductDto chaseMProductDto() {
		return chaseMProductDto(new MProductDto());
	}

	public static MProductDto chaseMProductDto (MProductDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class ProductMasterLabelPrintData implements Serializable {

		// 商品情報
		public MProductDto search = chaseMProductDto();
		
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		public List<MProductDto> searchList = new ArrayList<MProductDto>();
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
		
		// センタ情報
		public MCenterDto center = chaseMCenterDto();
		
		// 出力枚数
		public Long labelOutputCnt ;
		
		
	};

	public ProductMasterLabelPrintData data = new ProductMasterLabelPrintData();
}
