package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.TShippingInstSpareDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingPlanInputDto extends PagingDto {

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
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
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

		// [#2253]予備項目対応 2017.08.18 sampei Start
		if(dto.getTShippingInstSpareAsOne() == null){
			dto.setTShippingInstSpareAsOne(new TShippingInstSpareDto());
		}
		// [#2253]予備項目対応 2017.08.18 sampei End

		return dto;
	}

	public static class ShippingPlanInputData implements Serializable {
		//出荷指示入力画面ヘッダ情報
		public TShippingInstHDto head = chaseTShippingInstHDto();
		//出荷指示入力画面明細情報
		public List<TShippingInstBDto> body = new ArrayList<TShippingInstBDto>();
		//出荷指示入力画面明細空行情報
		public TShippingInstBDto blankRow = chaseTShippingInstBDto();
		// [C-NIS-0009] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
		// 納品予定日デフォルト表示設定
		public Integer delivPlanDtDefFlg;
		// 作業日デフォルト表示設定
		public Integer workDtDefFlg;
		// 出荷日デフォルト表示設定
		public Integer shippingDtDefFlg;
		// [C-NIS-0009] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End
	};

	public ShippingPlanInputData data = new ShippingPlanInputData();

}
