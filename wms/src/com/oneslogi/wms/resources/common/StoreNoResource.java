package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dbflute.dtomapper.TStoreNoDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.wms.dto.master.StoreNoDto;
import com.oneslogi.wms.logic.common.StoreNoLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入庫No.取得用リソースクラス
 */
@Path("/common/storeNo")
public class StoreNoResource extends AbstractWmsResource {

	@Inject
	private StoreNoLogic storeNoLogic;

	@GET
	@Path("/record")
	public StoreNoDto getStoreNo(@QueryParam("storeLabelNo") String storeLabelNo) {

		TStoreNo conditionEntity = new TStoreNo();
		conditionEntity.setStoreLabelNo(storeLabelNo);

		TStoreNo entity = storeNoLogic.getUkEntity(conditionEntity);

		if (entity == null) {
			return null;
		}

		TStoreNoDtoMapper mapper = new TStoreNoDtoMapper();
		TStoreNoDto dto = mapper.mappingToDto(entity);

		StoreNoDto resultDto = new StoreNoDto();
		resultDto.data.tStoreNo = dto;

		return resultDto;
	}

}
