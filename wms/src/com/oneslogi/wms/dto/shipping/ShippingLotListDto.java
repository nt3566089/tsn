package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TLastLotDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ShippingLotListDto extends PagingDto {

	public static TLastLotDto chaseTLastLotDto(){
		return chaseTLastLotDto(new TLastLotDto());
	}

	public static TLastLotDto chaseTLastLotDto(TLastLotDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMCustomer()== null) {
			dto.setMCustomer(new MCustomerDto());
		}


		return dto;
	}

	public static TLastLotDto chaseTLastLotBodyDto() {
		return chaseTLastLotBodyDto(new TLastLotDto());
	}

	public static TLastLotDto chaseTLastLotBodyDto(TLastLotDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMCustomer()== null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if(dto.getTLot() == null){
			dto.setTLot(new TLotDto());
		}
		return dto;
	}

	public static class ShippingLotData implements Serializable {

		//検索条件
		public TLastLotDto head = chaseTLastLotDto();
		//検索結果
		public List<TLastLotDto> body = new ArrayList<TLastLotDto>();
		//空行
		public TLastLotDto blankRow = chaseTLastLotBodyDto();
	}

	public ShippingLotData data = new ShippingLotData();

}
