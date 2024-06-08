package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductDto extends PagingDto {
	public static class ProductData implements Serializable {
		public MProductDto mProduct = new MProductDto();
		public MClientDto mClient = new MClientDto();
	};
	public ProductData data = new ProductData();
}
