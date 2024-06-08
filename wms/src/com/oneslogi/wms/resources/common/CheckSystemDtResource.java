package com.oneslogi.wms.resources.common;

import java.text.ParseException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.WarnManager.WarnStatus;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷主センタデータ取得用リソースクラス
 */
@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/checkSystemDt")
public class CheckSystemDtResource extends AbstractWmsResource {

	@Inject
	private ClientCenterLogic clientCenterLogic;

	@GET
	@Path("/record")
	public StatusDto record(@QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId, @QueryParam("systemDt") String systemDt) throws ParseException {

		MClientCenter conditionEntity = new MClientCenter();
		conditionEntity.setClientId(clientId);
		conditionEntity.setCenterId(centerId);
		conditionEntity.setSystemDt(systemDt);

		clientCenterLogic.getSystemDtCheck(conditionEntity, new WarnStatus(WmsConst.StatusCode.SYSTEM_DT_WARN));

		return null;
	}

}
