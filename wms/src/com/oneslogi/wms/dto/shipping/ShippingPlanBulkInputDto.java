package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.TShippingInstSpareDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingPlanBulkInputDto extends PagingDto {

	public static TShippingInstHDto chaseTShippingInstHDto() {
		return chaseTShippingInstHDto(new TShippingInstHDto());
	}

	public static TShippingInstHDto chaseTShippingInstHDto(TShippingInstHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static TShippingInstBDto chaseTShippingInstBDto() {
		return chaseTShippingInstBDto(new TShippingInstBDto());
	}

	public static TShippingInstBDto chaseTShippingInstBDto(TShippingInstBDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
//		if(dto.getMLocation()==null){
//			dto.setMLocation(new MLocationDto());
//		}
		if (dto.getTShippingInstH() == null) {
			dto.setTShippingInstH(new TShippingInstHDto());
		}
		TShippingInstHDto TShippingInstHDto = dto.getTShippingInstH();
		if (TShippingInstHDto.getMProcessType() == null) {
			TShippingInstHDto.setMProcessType(new MProcessTypeDto());
		}
		if (TShippingInstHDto.getMCustomerBySupplyCustomerId() == null) {
			TShippingInstHDto.setMCustomerBySupplyCustomerId(new MCustomerDto());
		}
		if (TShippingInstHDto.getMDeliveryCourse() == null) {
			TShippingInstHDto.setMDeliveryCourse(new MDeliveryCourseDto());
		}

		// [#2253]予備項目対応 2017.08.18 sampei Start
		if(dto.getTShippingInstSpareAsOne() == null){
			dto.setTShippingInstSpareAsOne(new TShippingInstSpareDto());
		}
		// [#2253]予備項目対応 2017.08.18 sampei End


		return dto;
	}

	public static class ShippingPlanBulkInputData implements Serializable {
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma Start
		public String receiveCd;
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma End
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka end
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		public int errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
		public TShippingInstHDto head = chaseTShippingInstHDto();
		public List<TShippingInstBDto> shippingPlan = new ArrayList<TShippingInstBDto>();
		public TShippingInstBDto blankRow = chaseTShippingInstBDto();
	};

	public ShippingPlanBulkInputData data = new ShippingPlanBulkInputData();

}
