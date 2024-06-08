package com.oneslogi.wms.dto.common;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dto.BaseDto;

public class ParamDto extends BaseDto {

	public static class ParamData implements Serializable {

		public MParamDto mParam = new MParamDto();

	}

	public ParamData data = new ParamData();
}
