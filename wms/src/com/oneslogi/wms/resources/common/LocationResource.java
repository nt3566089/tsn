package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dtomapper.MLocationDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.common.LocationDto;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ロケーションデータ取得用リソースクラス
 */
@Path("/common/location")
public class LocationResource extends AbstractWmsResource {

	@Inject
	private LocationLogic locationLogic;
	@Inject
	private MLocationBhv mLocationBhv;

	@GET
	@Path("/record")
	public LocationDto record(@QueryParam("centerId") Long centerId, @QueryParam("locationCd") String locationCd) {

		MLocation mLocation = new MLocation();

		mLocation.setCenterId(centerId);

		mLocation.setLocationCd(locationCd);

		mLocation = locationLogic.getUkEntity(mLocation);

		if (mLocation == null) {

			return null;
		}

		MLocationDtoMapper mapper = new MLocationDtoMapper();
		MLocationDto mLocationDto = mapper.mappingToDto(mLocation);

		LocationDto resultDto = new LocationDto();

		resultDto.data.mLocation = mLocationDto;

		return resultDto;

	}

	// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana Start
	@GET
	@Path("/recordWithAllocNgFlgName")
	public LocationDto recordWithAllocFlgNgName(@QueryParam("centerId") Long centerId, @QueryParam("locationCd") String locationCd) {

		if (centerId == null) {
			return null;
		}
		if (CU.isNullOrEmpty(locationCd)) {
			return null;
		}
		MLocation entity = null;

		if ((centerId != null) && (!CU.isNullOrEmpty(locationCd))) {
			MLocationCB cb = mLocationBhv.newMyConditionBean();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			cb.setupSelect_BClassDtlByAllocNgFlg().withVDict(getCultureId());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			cb.query().setCenterId_Equal(centerId);
			cb.query().setLocationCd_Equal(locationCd);

			entity = mLocationBhv.selectEntity(cb);
		}

		MLocationDtoMapper mapper = new MLocationDtoMapper();
		MLocationDto dto = mapper.mappingToDto(entity);

		LocationDto resultDto = new LocationDto();
		resultDto.data.mLocation = dto;

		return resultDto;
	}
	// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana End

}
