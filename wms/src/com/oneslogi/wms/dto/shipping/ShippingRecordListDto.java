package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPackingBDto;
import com.oneslogi.base.dbflute.dto.TPackingHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.TPickingRDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingRecordListDto extends BaseDto {

	public static TPackingHDto chaseTPackingHDto() {
		return chaseTPackingHDto(new TPackingHDto());
	}

	public static TPackingHDto chaseTPackingHDto(TPackingHDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getTPickingH() == null) {
			dto.setTPickingH(new TPickingHDto());
		}
		if (dto.getTPickingH().getTPickingRAsOne() == null) {
			dto.getTPickingH().setTPickingRAsOne(new TPickingRDto());
		}
		if (dto.getTAllocInstH() == null) {
			dto.setTAllocInstH(new TAllocInstHDto());
		}
		if (dto.getTAllocInstH().getMDeliveryCourse() == null) {
			dto.getTAllocInstH().setMDeliveryCourse(new MDeliveryCourseDto());
		}
		if (dto.getTAllocInstH().getMDeliveryCourse().getMCarrier() == null) {
			dto.getTAllocInstH().getMDeliveryCourse().setMCarrier(new MCarrierDto());
		}
		return dto;
	}

	public static class ShippingRecordListData implements Serializable {
		// 梱包ヘッダ
		public TPackingHDto search = chaseTPackingHDto();
		// 梱包ボディ
		public List<TPackingBDto> list = new ArrayList<TPackingBDto>();

		 // JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為送信データをコンバートし対応
		public String searchBase64;
		public String listBase64;
	};

	public ShippingRecordListData data = new ShippingRecordListData();
}