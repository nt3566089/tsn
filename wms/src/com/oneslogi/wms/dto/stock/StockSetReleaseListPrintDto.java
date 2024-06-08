package com.oneslogi.wms.dto.stock;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TMoveInstBDto;
import com.oneslogi.base.dbflute.dto.TMoveInstHDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockSetReleaseListPrintDto extends PrintParamDto {

	public static TMoveInstBDto chaseTMoveInstBDto() {
		return chaseTMoveInstBDto(new TMoveInstBDto());
	}

	public static TMoveInstBDto chaseTMoveInstBDto(TMoveInstBDto dto) {
		dto.setTMoveInstH(new TMoveInstHDto());

		if (dto.getTMoveInstH().getMCenter() == null) {
			dto.getTMoveInstH().setMCenter(new MCenterDto());
		}
		if (dto.getTMoveInstH().getMClient() == null) {
			dto.getTMoveInstH().setMClient(new MClientDto());
		}

		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}

		return dto;
	}

	public static class TMoveInstBListData implements Serializable {

		//検索条件を入れるDTO
		public TMoveInstBDto search = chaseTMoveInstBDto();
	};

	public TMoveInstBListData data = new TMoveInstBListData();
}