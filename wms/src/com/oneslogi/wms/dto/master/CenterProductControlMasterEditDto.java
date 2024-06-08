package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MMfwhxitemDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dto.PagingDto;


public class CenterProductControlMasterEditDto extends PagingDto {

	public static MMfwhxitemDto chaseMMfwhxitemDto() {
		return chaseMMfwhxitemDto(new MMfwhxitemDto());
	}

	public static MMfwhxitemDto chaseMMfwhxitemDto(MMfwhxitemDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}

		return dto;
	}

	public static class MfwhItemData implements Serializable {

		public MMfwhxitemDto head = chaseMMfwhxitemDto();
		public List<MMfwhxitemDto> body = new ArrayList<MMfwhxitemDto>();
	};

	public MfwhItemData data = new MfwhItemData();




}
