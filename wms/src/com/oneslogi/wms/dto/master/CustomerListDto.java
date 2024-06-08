package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CustomerListDto extends PagingDto {
	public static class CustomerData implements Serializable {
		public MCustomerDto mCustomer = new MCustomerDto();
	};
	public List<CustomerData> data = new ArrayList<CustomerData>();

}
