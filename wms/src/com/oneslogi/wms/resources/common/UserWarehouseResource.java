package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.wms.dto.master.UserWarehouseDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザ倉庫データ取得用リソースクラス
 */
@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/userWarehouse")
public class UserWarehouseResource extends AbstractWmsResource {

	@Inject
	private MWarehouseBhv mWarehouseBhv;

	@GET
	@Path("/keyValueList")
	public UserWarehouseDto getKeyValueList(@QueryParam("centerId") Long centerId) {

		MWarehouseCB cb = mWarehouseBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.specify().columnWarehouseId();
		cb.specify().columnWarehouseCd();
		cb.specify().columnWarehouseNm();
		cb.query().addOrderBy_WarehouseCd_Asc();

		ListResultBean<MWarehouse> mWarehouse = mWarehouseBhv.selectList(cb);

		UserWarehouseDto dto = new UserWarehouseDto();
		for (MWarehouse o : mWarehouse) {
			UserWarehouseDto.DropDownListData data = new UserWarehouseDto.DropDownListData();
			data.warehouseId = o.getWarehouseId();
			data.warehouseCd = o.getWarehouseCd();
			data.warehouseNm = o.getWarehouseNm();
			dto.data.add(data);
		}

		return dto;
	}

}
