package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingInstListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingInstListDto extends PagingDto {

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
		if (dto.getMDeliveryCourse() == null) {
			dto.setMDeliveryCourse(new MDeliveryCourseDto());
		}
		if (dto.getMDeliveryCourse().getMCarrier() == null) {
			dto.getMDeliveryCourse().setMCarrier(new MCarrierDto());
		}
		return dto;
	}

	public static class SearchFooterData implements Serializable {
		//作業日/出荷日(日付一括変更)
		public String workShippingDtFlg;
		//日付(日付一括変更)
		public String dateBatch;
		//配送コース(配送コース一括変更)
		public String deliveryCourseCdBatch;
		public String deliveryCourseNmBatch;
	};
	public static class ShippingInstListData implements Serializable {
		//検索条件を入れるDTO
		public TShippingInstHDto search = chaseTShippingInstHDto();
		//検索結果を入れるDTO
		public List<SqlShippingInstListDto> list = new ArrayList<SqlShippingInstListDto>();
		//フッター情報
		public SearchFooterData shippingInstFooter = new SearchFooterData();
		// [C-NIS-0007] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
		// 日付(From)デフォルト表示設定
		public int dtFromDefFlg;
		// 日付(To)デフォルト表示設定
		public int dtToDefFlg;
		// [C-NIS-0007] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End
		public String message;
	};

	public ShippingInstListData data = new ShippingInstListData();
}
