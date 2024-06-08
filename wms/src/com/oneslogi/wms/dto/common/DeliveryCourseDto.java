package com.oneslogi.wms.dto.common;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dto.BaseDto;

public class DeliveryCourseDto extends BaseDto {

	public static class DeliveryCourseData implements Serializable {

		public MDeliveryCourseDto mDeliveryCourse = new MDeliveryCourseDto();

	}

	public DeliveryCourseData data = new DeliveryCourseData();
}
