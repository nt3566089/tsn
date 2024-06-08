package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MWebHtInfoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class WebHTinfoMasterDto extends PagingDto {

	public static MWebHtInfoDto chaseMWebHtInfoDto() {
		return chaseMWebHtInfoDto(new MWebHtInfoDto());
	}

	public static MWebHtInfoDto chaseMWebHtInfoDto(MWebHtInfoDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}

		return dto;
	}

	public static MWebHtInfoDto chaseMWebHtInfoBodyDto() {
		return chaseMWebHtInfoBodyDto(new MWebHtInfoDto());
	}

	public static MWebHtInfoDto chaseMWebHtInfoBodyDto(MWebHtInfoDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}

		return dto;
	}

	public static class WebHtInfoMasterData implements Serializable {
		//検索条件
		public MWebHtInfoDto head = chaseMWebHtInfoDto();
		//検索結果
		public List<MWebHtInfoDto> body = new ArrayList<MWebHtInfoDto>();
		//空行
		public MWebHtInfoDto blankRow = chaseMWebHtInfoBodyDto();
	};

	public WebHtInfoMasterData data = new WebHtInfoMasterData();
}
