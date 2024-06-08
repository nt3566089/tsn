package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.TPickingRDto;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingTagDataOutputDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingTagDataOutputDto extends PagingDto {

	public static TPickingHDto chaseTPickingHDto() {
		return chaseTPickingHDto(new TPickingHDto());
	}

	public static TPickingHDto chaseTPickingHDto(TPickingHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}

		if (dto.getTAllocInstH() == null) {
			dto.setTAllocInstH(new TAllocInstHDto());
		}

		if (dto.getTPickingRAsOne() == null) {
			dto.setTPickingRAsOne(new TPickingRDto());
		}

		if (dto.getTAllocInstH().getMCustomerBySupplyCustomerId() == null) {
			dto.getTAllocInstH().setMCustomerBySupplyCustomerId(new MCustomerDto());
		}

		if (dto.getTAllocInstH().getMDeliveryCourse() == null) {
			dto.getTAllocInstH().setMDeliveryCourse(new MDeliveryCourseDto());
		}

		if (dto.getTAllocInstH().getMDeliveryCourse().getMCarrier() == null) {
			dto.getTAllocInstH().getMDeliveryCourse().setMCarrier(new MCarrierDto());
		}
		return dto;
	}

	public static class ShippingTagDataOutputData implements Serializable {
		// ヘッダ部DTO
		public TPickingHDto head = chaseTPickingHDto();
		//検索結果を入れるDTO
		public List<SqlShippingTagDataOutputDto> list = new ArrayList<SqlShippingTagDataOutputDto>();
		// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部の送り状種別を削除) 2015.03.18 kawana
	};

	public ShippingTagDataOutputData data = new ShippingTagDataOutputData();
}
