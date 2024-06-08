package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MEdiDto;
import com.oneslogi.base.dbflute.dtomapper.MEdiDtoMapper;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.wms.dto.common.EdiDto;
import com.oneslogi.wms.logic.common.EdiLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 取込み種別マスタ取得用リソースクラス
 */
@Path("/ecorder/edi")
public class EdiResource extends AbstractWmsResource {

	@Inject
	private EdiLogic ediLogic;

	@GET
	@Path("/ediList")
	public EdiDto getEdiList() {

		List<MEdi> entityList = ediLogic.getEntityList();

		MEdiDtoMapper mapper = new MEdiDtoMapper();
		List<MEdiDto> resultList = mapper.mappingToDtoList(entityList);

		EdiDto resultDto = new EdiDto();
		resultDto.data.ediList = resultList;

		return resultDto;
	}
}
