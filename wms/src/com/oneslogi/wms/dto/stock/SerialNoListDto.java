package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TSerialNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class SerialNoListDto extends PagingDto {

	public static TSerialNoDto chaseTSerialNoDto() {
		return chaseTSerialNoDto(new TSerialNoDto());
	}
	public static TSerialNoDto chaseTSerialNoDto(TSerialNoDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		return dto;
	}

	public static class SearchFooterData implements Serializable {
		//納品先CD
		public String supplyCustomerCdBatch;
		//納品先名称
		public String supplyCustomerNmBatch;
		//出庫作業No.
		public String pickingWorkNoBatch;
		//出荷日
		public String shippingDtBatch;
	};
	public static class TSerialNoListData implements Serializable {
		//検索条件を入れるDTO
		public TSerialNoDto search = chaseTSerialNoDto();
		//検索結果を入れるDTO
		public List<TSerialNoDto> list = new ArrayList<TSerialNoDto>();
		//フッター情報
		public SearchFooterData tSerialNoFooter = new SearchFooterData();
		public String message;
	};

	public TSerialNoListData data = new TSerialNoListData();
}
