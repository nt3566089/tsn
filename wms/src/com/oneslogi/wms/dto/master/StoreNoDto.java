package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StoreNoDto extends PagingDto {
	public static class StoreNoData implements Serializable {
		public TStoreNoDto tStoreNo = new TStoreNoDto();
	};
	public StoreNoData data = new StoreNoData();
}
