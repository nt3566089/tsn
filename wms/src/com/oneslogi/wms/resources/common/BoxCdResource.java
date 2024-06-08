package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.wms.dto.master.BoxCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/boxCd")
public class BoxCdResource extends AbstractWmsResource {
	@Inject
	private MBoxBhv mboxBhv;

	@GET
	@Path("/query")
	public BoxCdDto record(@QueryParam("centerCd") String centerCd) {

		MBoxCB cb = mboxBhv.newMyConditionBean();

		cb.setupSelect_MCenter();
		cb.query().queryMCenter().setCenterCd_Equal(centerCd);
		cb.specify().columnBoxCd();
		cb.specify().columnBoxNm();

		cb.query().addOrderBy_BoxCd_Asc();

		ListResultBean<MBox> mBox = mboxBhv.selectList(cb);

		BoxCdDto dto = new BoxCdDto();
		for (MBox o : mBox) {
			BoxCdDto.DropDownListData data = new BoxCdDto.DropDownListData();
			data.boxCd = o.getBoxCd();
			data.boxNm = o.getBoxNm();
			dto.data.add(data);
		}

		return dto;

	}
}
