package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TPickingBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductShippingListDto extends PagingDto {

	public static TShippingInstHDto chaseTShippingInstHDto() {
		return chaseTShippingInstHDto(new TShippingInstHDto());
	}

	public static TShippingInstHDto chaseTShippingInstHDto(TShippingInstHDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMDeliveryCourse() == null) {
			dto.setMDeliveryCourse(new MDeliveryCourseDto());
		}
		if (dto.getMDeliveryCourse().getMCarrier() == null) {
			dto.getMDeliveryCourse().setMCarrier(new MCarrierDto());
		}
		if (dto.getMCustomerByDelivCustomerId() == null) {
			dto.setMCustomerByDelivCustomerId(new MCustomerDto());
		}
		return dto;
	}

	public static TShippingInstBDto chaseTShippingInstBDto() {
		return chaseTShippingInstBDto(new TShippingInstBDto());
	}

	public static TShippingInstBDto chaseTShippingInstBDto(TShippingInstBDto dto) {

		if (dto.getTPickingBList().size() == 0) {
			dto.getTPickingBList().add(0, new TPickingBDto());
		}
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		if (dto.getTPickingBList().get(0).getTStock() == null) {
			dto.getTPickingBList().get(0).setTStock(new TStockDto());
		}
		if (dto.getTPickingBList().get(0).getTStock().getMLocation() == null) {
			dto.getTPickingBList().get(0).getTStock().setMLocation(new MLocationDto());
		}
		if (dto.getTPickingBList().get(0).getPickingNum() == null) {
			dto.getTPickingBList().get(0).setPickingNum(null);
		}
		if (dto.getTPickingBList().get(0).getTStock().getTLot() == null) {
			dto.getTPickingBList().get(0).getTStock().setTLot(new TLotDto());
		}
		if (dto.getTPickingBList().get(0).getTStock().getTStoreNo() == null) {
			dto.getTPickingBList().get(0).getTStock().setTStoreNo(new TStoreNoDto());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (dto.getTPickingBList().get(0).getTStock().getMLocation().getBClassDtlByAllocNgFlg() == null) {
			dto.getTPickingBList().get(0).getTStock().getMLocation().setBClassDtlByAllocNgFlg(new BClassDtlDto());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		return dto;
	}

	public static class SearchFooterData implements Serializable {
		//作業日/出荷日(日付一括変更)
		public String workShippingDtFlg;
		//日付(日付一括変更)
		public String workShippingDt;
		//郵便番号
		public String zipCd;
		//配送コースコード(配送コース一括変更)
		public String deliveryCourseCd;
		//配送コース名称(配送コース一括変更)
		public String deliveryCourseNm;

	};

	public static class SearchConditionData implements Serializable {
		//商品別出荷一覧画面ヘッダ情報
		public TShippingInstHDto search = chaseTShippingInstHDto();
		//商品別出荷一覧画面明細情報
		public List<TShippingInstBDto> list = new ArrayList<TShippingInstBDto>();
		//商品別出荷一覧画面フッター情報
		public SearchFooterData shippingInstFooter = new SearchFooterData();

		 // JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為、送信データをコンバートし対応
		public String searchBase64;
		public String listBase64;
		public String shippingInstFooterBase64;
	};

	public SearchConditionData data = new SearchConditionData();
}
// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End