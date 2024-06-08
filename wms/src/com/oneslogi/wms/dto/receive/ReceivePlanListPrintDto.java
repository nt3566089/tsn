package com.oneslogi.wms.dto.receive;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanRDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceivePlanListPrintDto extends PrintParamDto {

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {

		dto.setTReceivePlanH(new TReceivePlanHDto());

		if (dto.getTReceivePlanH().getMCenter() == null) {
			dto.getTReceivePlanH().setMCenter(new MCenterDto());
		}
		if (dto.getTReceivePlanH().getMClient() == null) {
			dto.getTReceivePlanH().setMClient(new MClientDto());
		}
		if (dto.getTReceivePlanH().getTReceivePlanRAsOne() == null){
			dto.getTReceivePlanH().setTReceivePlanRAsOne(new TReceivePlanRDto());
		}
		if (dto.getTReceivePlanH().getMProcessType() == null) {
			dto.getTReceivePlanH().setMProcessType(new MProcessTypeDto());
		}
		if (dto.getTReceivePlanH().getMCustomerByPlanDepositId() == null) {
			dto.getTReceivePlanH().setMCustomerByPlanDepositId(new MCustomerDto());
		}
		if (dto.getTReceivePlanH().getMCustomerByPlanSupplierId() == null) {
			dto.getTReceivePlanH().setMCustomerByPlanSupplierId(new MCustomerDto());
		}
		if(dto.getMWarehouse() == null){
			dto.setMWarehouse(new MWarehouseDto());
		}

		return dto;
	}


	public static class TReceivePlanBListData implements Serializable {

		//検索条件を入れるDTO
		public TReceivePlanBDto search = chaseTReceivePlanBDto();
	};

	public TReceivePlanBListData data = new TReceivePlanBListData();
}