package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.wms.dto.common.ClientDto;
import com.oneslogi.wms.dto.common.ParamDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * パラメータデータ取得用リソースクラス
 */
@Path("/common/param")
public class ParamResource extends AbstractWmsResource {

	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private MParamBhv mparamBhv;

	@GET
	@Path("/record")
	public ParamDto record(@QueryParam("clientCd") String clientCd, @QueryParam("centerCd") String centerCd) {

		// ===== マスタ検索で必要なIDの取得 =====
		// ===== センタID =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		Long centerId = mCenter.getCenterId();
		// ===== ClientID =====
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		Long clientId = mClient.getClientId();

		MClientCenter conditionEntity = new MClientCenter();
		conditionEntity.setClientId(clientId);
		conditionEntity.setCenterId(centerId);

		MClientCenter entity = clientCenterLogic.getUkEntityWithDeletedCheck(conditionEntity);

		if (entity == null) {
			return null;
		}

		MParam paramEntity = paramLogic.getUkEntityWithDeletedCheck(entity);

		MParamDtoMapper mapper = new MParamDtoMapper();
		MParamDto dto = mapper.mappingToDto(paramEntity);

		ParamDto resultDto = new ParamDto();
		resultDto.data.mParam = dto;

		return resultDto;
	}

	// [#2166] 2017.8.4 ase Start
	@GET
	@Path("/query")
	public ClientDto record(@QueryParam("centerCd") String centerCd) {

		if (centerCd == null) {
			return null;
		}

		MParamCB cb = mparamBhv.newMyConditionBean();

		// ===== センタID =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		Long centerId = mCenter.getCenterId();

		cb.setupSelect_MClientCenter();
		cb.setupSelect_MClientCenter().withMCenter();
		cb.setupSelect_MClientCenter().withMClient();
		cb.query().queryMClientCenter().queryMCenter().setCenterId_Equal(centerId);
		cb.query().queryMClientCenter().queryMClient().addOrderBy_ClientCd_Asc();

		ListResultBean<MParam> mParam = mparamBhv.selectList(cb);

		ClientDto dto = new ClientDto();
		for (MParam o : mParam) {
			ClientDto.DropDownListData data = new ClientDto.DropDownListData();
			data.clientCd = o.getMClientCenter().getMClient().getClientCd();
			data.clientNm = o.getMClientCenter().getMClient().getClientNm();
			dto.data.add(data);
		}

		return dto;

	}
	// [#2166] 2017.8.4 ase End

}
