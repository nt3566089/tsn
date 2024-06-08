package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.wms.dto.master.ZoneCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 郵便番号データ取得用リソースクラス
 */
@Path("/common/zoneCd")
public class ZoneCdResource extends AbstractWmsResource {

	@Inject
	private MZoneBhv mZoneBhv;

	@GET
	@Path("/keyValueList")
	public ZoneCdDto getKeyValueList(@QueryParam("warehouseCd")String warehouseCd) {

		MZoneCB cb = mZoneBhv.newMyConditionBean();

		cb.setupSelect_MWarehouse();
		cb.query().queryMWarehouse().setWarehouseCd_Equal(warehouseCd);
		cb.specify().columnZoneCd();
		cb.specify().columnZoneNm();

		cb.query().addOrderBy_ZoneCd_Asc();

		ListResultBean<MZone> mZone = mZoneBhv.selectList(cb);

		ZoneCdDto dto = new ZoneCdDto();
		for (MZone o : mZone) {
			ZoneCdDto.DropDownListData data = new ZoneCdDto.DropDownListData();
			data.zoneCd = o.getZoneCd();
			data.zoneNm = o.getZoneNm();
			dto.data.add(data);
		}

		return dto;
	}

}
