package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.wms.dto.master.CarrierCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 運送業者データ取得用リソースクラス
 */
@Path("/common/carrierCd")
public class CarrierResource extends AbstractWmsResource {

	@Inject
	private MCarrierBhv mCarrierBhv;

	@GET
	@Path("/keyValueList")
	public CarrierCdDto record(@QueryParam("centerCd") String centerCd) {

		MCarrierCB cb = mCarrierBhv.newMyConditionBean();

		cb.setupSelect_MCenter();
		cb.query().queryMCenter().setCenterCd_Equal(centerCd);
		cb.specify().columnCarrierCd();
		cb.specify().columnCarrierNm();

		cb.query().addOrderBy_CarrierCd_Asc();

		ListResultBean<MCarrier> mCarrier = mCarrierBhv.selectList(cb);

		CarrierCdDto dto = new CarrierCdDto();
		for (MCarrier o : mCarrier) {
			CarrierCdDto.DropDownListData data = new CarrierCdDto.DropDownListData();
			data.carrierCd = o.getCarrierCd();
			data.carrierNm = o.getCarrierNm();
			dto.data.add(data);
		}

		return dto;

	}

}
