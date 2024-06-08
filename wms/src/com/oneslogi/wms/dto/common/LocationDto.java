package com.oneslogi.wms.dto.common;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dto.BaseDto;

public class LocationDto extends BaseDto {

	public static class LocationData implements Serializable {

		public MLocationDto mLocation = new MLocationDto();

	}

	public LocationData data = new LocationData();
}
