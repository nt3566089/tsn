package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.dto.common.CustomerDto;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 仕入先データ取得用リソースクラス
 */
@Path("/common/supplierCustomer")
public class SupplierCustomerResource extends AbstractWmsResource {

	@Inject
	private CustomerLogic customerLogic;

	@GET
	@Path("/record")
	public CustomerDto record(@QueryParam("clientId") Long clientId, @QueryParam("customerCd") String customerCd) {

		MCustomer conditionEntity = new MCustomer();
		conditionEntity.setClientId(clientId);
		conditionEntity.setCustomerCd(customerCd);

		MCustomer entity = customerLogic.getVendorCustomerByClientCd(conditionEntity, null);

		if (entity == null) {
			return null;
		}

		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		MCustomerDto dto = mapper.mappingToDto(entity);

		CustomerDto resultDto = new CustomerDto();
		resultDto.data.mCustomer = dto;

		return resultDto;
	}

}
