package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCommonCarrierCB;
import com.oneslogi.base.dbflute.exbhv.MCommonCarrierBhv;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.wms.dto.master.CommonCarrierCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 運送業者データ取得用リソースクラス
 */
@Path("/common/commoncarrierCd")
public class CommonCarrierCdResource extends AbstractWmsResource {

	@Inject
	private MCommonCarrierBhv mCommonCarrierBhv;

	@GET
	@Path("/keyValueList")
	public CommonCarrierCdDto record(@QueryParam("centerCd") String centerCd) {

		MCommonCarrierCB cb = mCommonCarrierBhv.newMyConditionBean();

		cb.specify().columnCarrierCd();
		cb.specify().columnCarrierNm();

		cb.query().addOrderBy_CarrierCd_Asc();

		ListResultBean<MCommonCarrier> mCommonCarrier = mCommonCarrierBhv.selectList(cb);

		CommonCarrierCdDto dto = new CommonCarrierCdDto();
		for (MCommonCarrier o : mCommonCarrier) {
			CommonCarrierCdDto.DropDownListData data = new CommonCarrierCdDto.DropDownListData();
			data.carrierCd = o.getCarrierCd();
			data.carrierNm = o.getCarrierNm();
			dto.data.add(data);
		}
		return dto;
	}

}
