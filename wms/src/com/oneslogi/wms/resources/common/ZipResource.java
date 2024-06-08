package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dbflute.dtomapper.MZipDtoMapper;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.wms.dto.common.ZipDto;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;


/**
 * 郵便番号データ取得用リソースクラス
 */
@Path("/common/zip")
public class ZipResource extends AbstractWmsResource {

	@Inject
	private ZipLogic zipLogic;

	@GET
	@Path("/record")
	public ZipDto getZipByCd(@QueryParam("zipCd") String zipCd) {

		MZip conditionEntity = new MZip();
		conditionEntity.setZipCd(zipCd);

		MZip entity = zipLogic.getUkEntity(conditionEntity);

		if (entity == null) {
			return null;
		}

		MZipDtoMapper mapper = new MZipDtoMapper();
		MZipDto dto = mapper.mappingToDto(entity);

		ZipDto resultDto = new ZipDto();
		resultDto.data.mZip = dto;

		return resultDto;
	}

}
