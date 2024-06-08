package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WProductInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductInputDto extends BaseDto {

	/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// DTOではなく、Entityを直接扱う。
//	public static WProductInputDto chaseWProductInputDto() {
//		return new WProductInputDto();
//	}
//
//	public static class ProductInputData implements Serializable {
//		public List<WProductInputDto> dataRows = new ArrayList<WProductInputDto>();
//		public WProductInputDto blankRow = chaseWProductInputDto();
//	};
	
	public static WProductInput chaseWProductInput() {
		return new WProductInput();
	}

	public static class ProductInputData implements Serializable {
		public List<WProductInput> dataRows = new ArrayList<WProductInput>();
		public WProductInput blankRow = chaseWProductInput();
	};
	/* 2015/09/24 INOUE UPDATE END */
	
	public ProductInputData data = new ProductInputData();
}
