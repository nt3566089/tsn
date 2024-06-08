package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WStockInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockInputDto extends BaseDto {

	/* 2015/09/24 INOUE UPDATE START [ON推-品向-906]初期データ取込メモリリーク対応 */
	// DTOではなく、Entityを直接扱う。
//	public static WStockInputDto chaseWStockInputDto() {
//		return new WStockInputDto();
//	}
//
//	public static class StockInputData implements Serializable {
//		public List<WStockInputDto> dataRows = new ArrayList<WStockInputDto>();
//		public WStockInputDto blankRow = chaseWStockInputDto();
//	};
	
	public static WStockInput chaseWStockInput() {
		return new WStockInput();
	}

	public static class StockInputData implements Serializable {
		public List<WStockInput> dataRows = new ArrayList<WStockInput>();
		public WStockInput blankRow = chaseWStockInput();
	};
	/* 2015/09/24 INOUE UPDATE END */
	
	public StockInputData data = new StockInputData();
}
