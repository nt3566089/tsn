package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MImportTypeDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.wms.dto.common.ImportTypeDto;
import com.oneslogi.wms.logic.common.ImportTypeLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 取込み種別マスタ取得用リソースクラス
 */
@Path("/ecorder/importType")
public class ImportTypeResource extends AbstractWmsResource {

	@Inject
	private ImportTypeLogic importTypeBLogic;

	@GET
	@Path("/keyValueList")
	public ImportTypeDto getKeyValueList(@QueryParam("clientCd") final String clientCd) {

		MClient entity = new MClient();
		entity.setClientCd(clientCd);
		List<MImportType> entityList = importTypeBLogic.getEntityListByClientCd(entity);

		MImportTypeDtoMapper mapper = new MImportTypeDtoMapper();
		List<MImportTypeDto> resultList = mapper.mappingToDtoList(entityList);

		ImportTypeDto resultDto = new ImportTypeDto();
		resultDto.data.mImportType = resultList;

		return resultDto;
	}
}
