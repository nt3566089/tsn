package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.wms.dto.common.ClientDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/clientCd")
public class ClientCdResource extends AbstractWmsResource {
	@Inject
	private MClientBhv mclientBhv;

	@GET
	@Path("/query")
	public ClientDto record() {

		MClientCB cb = mclientBhv.newMyConditionBean();

//		cb.setupSelect_MCenter();
//		cb.query().queryMCenter().setCenterCd_Equal(centerCd);
		cb.specify().columnClientCd();
		cb.specify().columnClientNm();

		cb.query().addOrderBy_ClientCd_Asc();

		ListResultBean<MClient> mClient = mclientBhv.selectList(cb);

		ClientDto dto = new ClientDto();
		for (MClient o : mClient) {
			ClientDto.DropDownListData data = new ClientDto.DropDownListData();
			data.clientCd = o.getClientCd();
			data.clientNm = o.getClientNm();
			dto.data.add(data);
		}

		return dto;

	}
}
