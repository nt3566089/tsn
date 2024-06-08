package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.TAllocInstBDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TPickingBDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dbflute.dto.VDictDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingUpdateDto extends BaseDto {

	public static TShippingInstBDto chaseTShippingInstBDto() {
		return chaseTShippingInstBDto(new TShippingInstBDto());
	}

	public static TShippingInstBDto chaseTShippingInstBDto(TShippingInstBDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (dto.getMProduct().getBClassDtlByShippingStopFlg() == null) {
			dto.getMProduct().setBClassDtlByShippingStopFlg(new BClassDtlDto());
		}
		if (dto.getMProduct().getBClassDtlByShippingStopFlg().getVDict() == null) {
			dto.getMProduct().getBClassDtlByShippingStopFlg().setVDict(new VDictDto());
		}
		if (dto.getTShippingInstH() == null) {
			dto.setTShippingInstH(new TShippingInstHDto());
		}
		if (dto.getTShippingInstH().getMCustomerBySupplyCustomerId() == null) {
			dto.getTShippingInstH().setMCustomerBySupplyCustomerId(new MCustomerDto());
		}
		if (dto.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg() == null) {
			dto.getTShippingInstH().getMCustomerBySupplyCustomerId().setBClassDtlByShippingStopFlg(new BClassDtlDto());
		}
		if (dto.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict() == null) {
			dto.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().setVDict(new VDictDto());
		}
		if (dto.getTShippingInstH().getMCenter() == null) {
			dto.getTShippingInstH().setMCenter(new MCenterDto());
		}
		if (dto.getTShippingInstH().getMClient() == null) {
			dto.getTShippingInstH().setMClient(new MClientDto());
		}
		if (dto.getTAllocInstB() == null) {
			dto.setTAllocInstB(new TAllocInstBDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().size() == 0) {
			dto.getTAllocInstB().getTPickingBList().add(0, new TPickingBDto());
		}
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTPickingH() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).setTPickingH(new TPickingHDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).setTStock(new TStockDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMCustomer() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().setMCustomer(new MCustomerDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMStockType() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().setMStockType(new MStockTypeDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().setMLocation(new MLocationDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getBClassDtlByAllocNgFlg() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().setBClassDtlByAllocNgFlg(new BClassDtlDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getBClassDtlByAllocNgFlg().getVDict() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMLocation().getBClassDtlByAllocNgFlg().setVDict(new VDictDto());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}
//		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMProduct() == null) {
//			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().setMProduct(new MProductDto());
//		}
//		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMProduct().getBClassDtlByShippingStopFlg() == null) {
//			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMProduct().setBClassDtlByShippingStopFlg(new BClassDtlDto());
//		}
//		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMProduct().getBClassDtlByShippingStopFlg().getVDict() == null) {
//			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getMProduct().getBClassDtlByShippingStopFlg().setVDict(new VDictDto());
//		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getTLot() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().setTLot(new TLotDto());
		}
		if (dto.getTAllocInstB().getTPickingBList().get(0).getTStock().getTStoreNo() == null) {
			dto.getTAllocInstB().getTPickingBList().get(0).getTStock().setTStoreNo(new TStoreNoDto());
		}
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		return dto;
	}

	public static class ShippingInstData implements Serializable {
		public TShippingInstBDto head = chaseTShippingInstBDto();
		public List<TShippingInstBDto> body = new ArrayList<TShippingInstBDto>();
		public TShippingInstBDto blankRow = chaseTShippingInstBDto();

		 // JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為、送信データをコンバートし対応
		public String headBase64;
		public String bodyBase64;
	};

	public ShippingInstData data = new ShippingInstData();
}
