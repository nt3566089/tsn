package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MMfwhxitemDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.customize.SqlCenterProductControlMasterListDto;
import com.oneslogi.base.dto.PagingDto;

public class CenterProductControlMasterListDto extends PagingDto {

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

	public static class CenterProductControlMasterListData implements Serializable {

		public MMfwhxitemDto head = chaseMMfwhxitemDto();
		public List<SqlCenterProductControlMasterListDto> body = new ArrayList<SqlCenterProductControlMasterListDto>();

	}

	public CenterProductControlMasterListData data = new CenterProductControlMasterListData();
}