package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.wms.dto.master.CenterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品データ取得用リソースクラス
 */
@Path("/common/center")
public class CenterResource extends AbstractWmsResource {

	@Inject
	private CenterLogic centerLogic;

	@GET
	@Path("/record")
	public CenterDto getCenterByCd(@QueryParam("centerCd") String centerCd) {
		if (centerCd == null) {
			return null;
		}


		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);

		MCenter entity = centerLogic.getUkEntity(mCenter);

		if (entity == null) {
			return null;
		}

		MCenterDtoMapper mapper = new MCenterDtoMapper();
		MCenterDto dto = mapper.mappingToDto(entity);

		CenterDto resultDto = new CenterDto();
		resultDto.data.mCenter = dto;

		return resultDto;
	}
}
