package com.oneslogi.wms.dto.daily;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DailyDto extends PagingDto {

	public static class DailyData implements Serializable {
		//検索条件
		public MCenterDto dailySearch = new MCenterDto();
		//検索結果
		public List<MClientCenterDto> dailyList = new ArrayList<MClientCenterDto>();
	};

	public DailyData data = new DailyData();

	public Boolean flg = null;

}
