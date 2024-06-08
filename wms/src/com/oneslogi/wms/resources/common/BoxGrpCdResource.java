package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MBoxGrpCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.wms.dto.master.BoxGrpCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/boxGrpCd")
public class BoxGrpCdResource extends AbstractWmsResource {
	@Inject
	private MBoxGrpBhv mboxGrpBhv;

	@GET
	@Path("/keyValueList")
	public BoxGrpCdDto record(@QueryParam("centerId") Long centerId) {

		MBoxGrpCB cb = mboxGrpBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		cb.specify().columnBoxGrpCd();
		cb.specify().columnBoxGrpNm();

		cb.query().addOrderBy_BoxGrpCd_Asc();
		ListResultBean<MBoxGrp> mBoxGrp = mboxGrpBhv.selectList(cb);

		BoxGrpCdDto dto = new BoxGrpCdDto();
		for (MBoxGrp o : mBoxGrp) {
			BoxGrpCdDto.DropDownListData data = new BoxGrpCdDto.DropDownListData();
			data.boxGrpCd = o.getBoxGrpCd();
			data.boxGrpNm = o.getBoxGrpNm();
			dto.data.add(data);
		}

		return dto;

	}
}
