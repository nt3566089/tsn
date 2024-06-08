package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WCustomerInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CustomerInputDto extends BaseDto {

	/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// DTOではなく、Entityを直接扱う。
//	public static WCustomerInputDto chaseWCustomerInputDto() {
//		return new WCustomerInputDto();
//	}
//
//	public static class CustomerInputData implements Serializable {
//		public List<WCustomerInputDto> dataRows = new ArrayList<WCustomerInputDto>();
//		public WCustomerInputDto blankRow = chaseWCustomerInputDto();
//	};
	
	public static WCustomerInput chaseWCustomerInput() {
		return new WCustomerInput();
	}

	public static class CustomerInputData implements Serializable {
		public List<WCustomerInput> dataRows = new ArrayList<WCustomerInput>();
		public WCustomerInput blankRow = chaseWCustomerInput();
	};
	/* 2015/09/24 INOUE UPDATE END */
	
	public CustomerInputData data = new CustomerInputData();
}
