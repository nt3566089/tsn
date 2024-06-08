package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.HStockReportDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStockReportDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockListDto extends PagingDto {

	public static TStockReportDto chaseTStockReportDto() {
		return chaseTStockReportDto(new TStockReportDto());
	}

	public static TStockReportDto chaseTStockReportDto(TStockReportDto dto) {
		if (dto.getTStock() == null) {
			dto.setTStock(new TStockDto());
		}
		if (dto.getTStock().getMWarehouse() == null) {
			dto.getTStock().setMWarehouse(new MWarehouseDto());
		}
		if (dto.getTStock().getMWarehouse().getMCenter() == null) {
			dto.getTStock().getMWarehouse().setMCenter(new MCenterDto());
		}
		if (dto.getTStock().getMClient() == null) {
			dto.getTStock().setMClient(new MClientDto());
		}
		if (dto.getTStock().getMProduct() == null) {
			dto.getTStock().setMProduct(new MProductDto());
		}
		if (dto.getTStock().getTLot() == null) {
			dto.getTStock().setTLot(new TLotDto());
		}
		if (dto.getTStock().getMCustomer() == null) {
			dto.getTStock().setMCustomer(new MCustomerDto());
		}
		if (dto.getTStock().getMStockType() == null) {
			dto.getTStock().setMStockType(new MStockTypeDto());
		}
		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
		if (dto.getTStock().getMLocation() == null) {
			dto.getTStock().setMLocation(new MLocationDto());
		}
		if (dto.getTStock().getMLocation().getMZone() == null) {
			dto.getTStock().getMLocation().setMZone(new MZoneDto());
		}
		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End

		return dto;
	}

	public static class StockList implements Serializable {
		public TStockReportDto head = chaseTStockReportDto();
		public List<TStockReportDto> body = new ArrayList<TStockReportDto>();
		public List<HStockReportDto> bodyH = new ArrayList<HStockReportDto>();
		// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana Start
		public boolean isSearchCurrentData = false;
		// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana End
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
		public PrintParamDto storeLabelPrintParam = new PrintParamDto();
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End
		// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start
		public PrintParamDto stockListPrintParam = new PrintParamDto();
		// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End
	};

	public StockList data = new StockList();

}
