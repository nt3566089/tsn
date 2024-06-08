package com.oneslogi.wms.resources.common;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.common.ZoneDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ゾーンタデータ取得用リソースクラス
 */
@Path("/common/zone")
public class ZoneResource extends AbstractWmsResource {

	@Inject
	private MZoneBhv mZoneBhv;

	@GET
	@Path("/keyValueList")
	public ZoneDto getKeyValueList(@QueryParam("warehouseCd") String warehouseCd, @QueryParam("centerCd") String centerCd) {

		if (CU.isNullOrEmpty(warehouseCd) && CU.isNullOrEmpty(centerCd)) {
			return null;
		}

		MZoneCB cb = mZoneBhv.newMyConditionBean();

		cb.setupSelect_MWarehouse();
		cb.query().queryMWarehouse().setWarehouseCd_Equal(warehouseCd);
		cb.query().queryMWarehouse().queryMCenter().setCenterCd_Equal(centerCd);

		// [ON推-品向-1009] ゾーンタデータ取得用内容を修正 2015.12.21 sja Start
		cb.query().addOrderBy_ZoneCd_Asc();
		cb.query().addOrderBy_ZoneNm_Asc();
		// [ON推-品向-1009] ゾーンタデータ取得用内容を修正 2015.12.21 sja End
		ListResultBean<MZone> mZone = mZoneBhv.selectList(cb);

		ZoneDto dto = new ZoneDto();
		
		// [ON推-品向-1009] ゾーンタデータ取得用内容を修正 2015.12.21 sja Start
		List<String> zoneCdList = new ArrayList<String>();
		// [ON推-品向-1009] ゾーンタデータ取得用内容を修正 2015.12.21 sja End

		for (MZone o : mZone) {
			ZoneDto.DropDownListData data = new ZoneDto.DropDownListData();
			data.zoneCd = o.getZoneCd();
			data.zoneNm = o.getZoneNm();
			data.warehouseCd = o.getMWarehouse().getWarehouseCd();
			
			// [ON推-品向-1009] ゾーンタデータ取得用内容を修正 2015.12.21 sja Start
			if (zoneCdList.indexOf(data.zoneCd) == -1) {
				dto.data.add(data);
				zoneCdList.add(data.zoneCd);
			};
			//dto.data.add(data);
			// [ON推-品向-1009] ゾーンタデータ取得用内容を修正 2015.12.21 sja End
			
		}

		return dto;
	}

}
