package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MNumberingCenterCB;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.wms.dto.master.BizCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/bizCd")
public class BizCdResource extends AbstractWmsResource {

	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;

	@GET
	@Path("/keyValueList")
	public BizCdDto record(@QueryParam("centerCd") String centerCd){

		MNumberingCenterCB cb = mNumberingCenterBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.query().queryMCenter().setCenterCd_Equal(centerCd);
		cb.query().setUserEditable_Equal_$1();
		cb.specify().columnBizCd();
		cb.specify().columnBizNm();

		cb.query().addOrderBy_NumberingCenterId_Asc();

		ListResultBean<MNumberingCenter> lstNumberingCenter = mNumberingCenterBhv.selectList(cb);

		BizCdDto bizCdDto = new BizCdDto();
		for(MNumberingCenter mNumberingCenter: lstNumberingCenter){
			BizCdDto.DropDownListData data = new BizCdDto.DropDownListData();
			data.bizCd = mNumberingCenter.getBizCd();
			data.bizNm = mNumberingCenter.getBizNm();
			bizCdDto.data.add(data);
		}
		return bizCdDto;


	}

}
