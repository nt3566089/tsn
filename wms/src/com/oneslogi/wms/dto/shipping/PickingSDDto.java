package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PickingSDDto extends PagingDto {

	public static TPickingHDto chaseTPickingHDto() {
		return chaseTPickingHDto(new TPickingHDto());
	}

	public static TPickingHDto chaseTPickingHDto(TPickingHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}

		if (dto.getTAllocInstH() == null) {
			dto.setTAllocInstH(new TAllocInstHDto());
			dto.getTAllocInstH().setMCustomerBySupplyCustomerId(new MCustomerDto());
			dto.getTAllocInstH().setMCustomerByDelivCustomerId(new MCustomerDto());
		}
		return dto;
	}

	public static class OrderPickingSDData implements Serializable {
		// ヘッダ部DTO
		public TPickingHDto head = chaseTPickingHDto();
		// ピッキング種別
		public String pickingType;
		//フッタ部
		public TPickingHDto footer = chaseTPickingHDto();
	};

	public OrderPickingSDData data = new OrderPickingSDData();
}
