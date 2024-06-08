package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStockReportDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockBulkMoveDto extends BaseDto {

	public static class StockList implements Serializable {
		public List<TStockReportDto> head = new ArrayList<TStockReportDto>();
		public List<TStockDto> body = new ArrayList<TStockDto>();
	};

	public StockList data = new StockList();

}
