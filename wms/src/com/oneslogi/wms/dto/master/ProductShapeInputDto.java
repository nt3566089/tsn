package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WProductShapeInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductShapeInputDto extends BaseDto {

	public static WProductShapeInput chaseWProductShapeInput() {
		return new WProductShapeInput();
	}

	public static class ProductShapeInputData implements Serializable {
		public List<WProductShapeInput> dataRows = new ArrayList<WProductShapeInput>();
		public WProductShapeInput blankRow = chaseWProductShapeInput();
	};

	public ProductShapeInputData data = new ProductShapeInputData();
}
