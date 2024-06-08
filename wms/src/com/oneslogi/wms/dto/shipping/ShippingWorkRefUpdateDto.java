package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingWorkRefUpdateDto extends PagingDto {

	public static class ShippingWorkRefUpdateData implements Serializable {
		//出荷指示ヘッダ情報
		public TShippingInstHDto head = new TShippingInstHDto();
	};

	public ShippingWorkRefUpdateData data = new ShippingWorkRefUpdateData();

}
