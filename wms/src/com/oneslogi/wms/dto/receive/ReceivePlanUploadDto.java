package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceivePlanUploadDto extends BaseDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getTReceivePlanH() == null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}
		TReceivePlanHDto tReceivePlanHDto = dto.getTReceivePlanH();
		if (tReceivePlanHDto.getMCenter() == null) {
			tReceivePlanHDto.setMCenter(new MCenterDto());
		}
		if (tReceivePlanHDto.getMClient() == null) {
			tReceivePlanHDto.setMClient(new MClientDto());
		}
		if (tReceivePlanHDto.getMProcessType() == null) {
			tReceivePlanHDto.setMProcessType(new MProcessTypeDto());
		}
		if (tReceivePlanHDto.getMCustomerByPlanSupplierId() == null) {
			tReceivePlanHDto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}
		if (tReceivePlanHDto.getMCustomerByPlanDepositId() == null) {
			tReceivePlanHDto.setMCustomerByPlanDepositId(new MCustomerDto());
		}
		return dto;
	}

	public static class ReceivePlanUploadData implements Serializable {
		public TReceivePlanHDto head = chaseTReceivePlanHDto();
		public List<TReceivePlanBDto> receivePlan = new ArrayList<TReceivePlanBDto>();
		public TReceivePlanBDto blankRow = chaseTReceivePlanBDto();
	};

	public ReceivePlanUploadData data = new ReceivePlanUploadData();

}
