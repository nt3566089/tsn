package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.TPickingRDto;
import com.oneslogi.base.dbflute.dto.customize.SqlBillOfLadingPrintSelectDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BillOfLadingPrintDto extends PagingDto {

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
		if (dto.getTPickingRAsOne() == null) {
			dto.setTPickingRAsOne(new TPickingRDto());;
		}

		if (dto.getTAllocInstH() == null) {
			dto.setTAllocInstH(new TAllocInstHDto());
			dto.getTAllocInstH().setMCustomerBySupplyCustomerId(new MCustomerDto());
			dto.getTAllocInstH().setMCustomerByDelivCustomerId(new MCustomerDto());
		}
		return dto;
	}

	public static class BillOfLadingPrintData implements Serializable {
		// ヘッダ部DTO
		public TPickingHDto head = chaseTPickingHDto();
		//検索結果を入れるDTO
		public List<SqlBillOfLadingPrintSelectDto> list = new ArrayList<SqlBillOfLadingPrintSelectDto>();
	};

	public BillOfLadingPrintData data = new BillOfLadingPrintData();
}
