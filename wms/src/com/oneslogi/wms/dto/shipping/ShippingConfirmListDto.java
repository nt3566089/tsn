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
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingConfirmListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingConfirmListDto extends PagingDto {

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

	public static class ShippingConfirmListData implements Serializable {
		//検索条件を入れるDTO
		public TPickingHDto search = chaseTPickingHDto();
		//検索結果を入れるDTO
		public List<SqlShippingConfirmListDto> list = new ArrayList<SqlShippingConfirmListDto>();
		//検索結果を入れるDTO（外だしＳＱＬ用のサンプル）
		//public List<SqlReceiveListDto> list = new ArrayList<SqlReceiveListDto>();
	};

	public ShippingConfirmListData data = new ShippingConfirmListData();
}
