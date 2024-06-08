package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductShapeDto extends PagingDto {
	public static class ProductShapeData implements Serializable {
//		public MProductDto mProduct = new MProductDto();
		public MProductShapeDto mProductShape = new MProductShapeDto();
	};
	public ProductShapeData data = new ProductShapeData();
}
