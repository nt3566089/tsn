package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TAllocInstBDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class QuantityInputDto extends PagingDto {

	public static class QuantityInputData implements Serializable {
		//数量入力画面ヘッダ情報
		public TAllocInstBDto head = new TAllocInstBDto();
	};
	public QuantityInputData data = new QuantityInputData();
}
