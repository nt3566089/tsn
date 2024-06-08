package com.oneslogi.wms.dto.common;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dto.BaseDto;

public class CustomerDto extends BaseDto {

	public static class CustomerData implements Serializable {

		public MCustomerDto mCustomer = new MCustomerDto();

	}

	public CustomerData data = new CustomerData();
}
