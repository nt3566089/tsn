package com.oneslogi.wms.dto.ecorder;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MImportTypeDto;
import com.oneslogi.base.dbflute.dto.TEcOrderHDto;
import com.oneslogi.base.dbflute.dto.TEcOrderRDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class EcDelivAddressModifyDto extends PagingDto {

	public static TEcOrderHDto chaseTEcOrderHDto() {
		return chaseTEcOrderHDto(new TEcOrderHDto());
	}

	public static TEcOrderHDto chaseTEcOrderHDto(TEcOrderHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		if(dto.getMImportType() == null){
			dto.setMImportType(new MImportTypeDto());
		}

		if(dto.getTShippingInstH() == null){
			dto.setTShippingInstH(new TShippingInstHDto());
		}

		if(dto.getTShippingInstH().getMDeliveryCourse() == null){
			dto.getTShippingInstH().setMDeliveryCourse(new MDeliveryCourseDto());
		}

		if(dto.getTShippingInstH().getMDeliveryCourse().getMCarrier() == null){
			dto.getTShippingInstH().getMDeliveryCourse().setMCarrier(new MCarrierDto());
		}

		if(dto.getTEcOrderRAsOne() == null){
			dto.setTEcOrderRAsOne(new TEcOrderRDto());
		}

		return dto;
	}

	public static class EcDelivAddressModifyData implements Serializable {
		// ヘッダ部DTO
		public TEcOrderHDto head = chaseTEcOrderHDto();
		 // JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為、送信データをコンバートし対応
		public String searchBase64;
		public String jsonData ;
	};

	public EcDelivAddressModifyData data = new EcDelivAddressModifyData();
}
