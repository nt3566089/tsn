package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dtomapper.MDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.wms.dto.common.DeliveryCourseDto;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 配送コースデータ取得用リソースクラス
 */
@Path("/common/deliveryCourse")
public class DeliveryCourseResource extends AbstractWmsResource {

	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;

	@GET
	@Path("/record")
	public DeliveryCourseDto record(@QueryParam("centerId") Long centerId,@QueryParam("deliveryCourseCd")String deliveryCourseCd) {

		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();

		mDeliveryCourse.setCenterId(centerId);

		mDeliveryCourse.setDeliveryCourseCd(deliveryCourseCd);

		MDeliveryCourse deliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourse);

		if(deliveryCourse == null){

			return null;
		}

		MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourseDto mDeliveryCourseDto = mapper.mappingToDto(deliveryCourse);

		DeliveryCourseDto resultDto = new DeliveryCourseDto();

		resultDto.data.mDeliveryCourse = mDeliveryCourseDto;

		return resultDto;

		}

	@GET
	@Path("/search")
	public DeliveryCourseDto search(@QueryParam("customerId")Long customerId,@QueryParam("centerId")Long centerId) {

		MCustomer mCustomer = new MCustomer();

		mCustomer.setCustomerId(customerId);

		MDeliveryCourse deliveryCourse = deliveryCourseLogic.getDeliveryCourseByCustomerId(mCustomer,centerId);

		if(deliveryCourse == null){

			return null;
		}

		MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourseDto mDeliveryCourseDto = mapper.mappingToDto(deliveryCourse);

		DeliveryCourseDto resultDto = new DeliveryCourseDto();

		resultDto.data.mDeliveryCourse = mDeliveryCourseDto;

		return resultDto;

		}

}
