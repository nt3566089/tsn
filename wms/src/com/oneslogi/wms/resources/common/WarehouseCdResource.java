package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.wms.dto.common.WarehouseDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/warehouseCd")
public class WarehouseCdResource extends AbstractWmsResource {
	@Inject
	private MWarehouseBhv mwarehouseBhv;

	@GET
	@Path("/keyValueList")
	public WarehouseDto record(@QueryParam("centerId") long centerId) {

		MWarehouseCB cb = mwarehouseBhv.newMyConditionBean();

		cb.setupSelect_MCenter();
		cb.query().queryMCenter().setCenterId_Equal(centerId);
		cb.specify().columnWarehouseCd();
		cb.specify().columnWarehouseNm();

		cb.query().addOrderBy_WarehouseCd_Asc();

		ListResultBean<MWarehouse> mWarehouse = mwarehouseBhv.selectList(cb);

		WarehouseDto dto = new WarehouseDto();
		for (MWarehouse o : mWarehouse) {
			WarehouseDto.DropDownListData data = new WarehouseDto.DropDownListData();
			data.warehouseCd = o.getWarehouseCd();
			data.warehouseNm = o.getWarehouseNm();
			dto.data.add(data);
		}

		return dto;

	}
}
