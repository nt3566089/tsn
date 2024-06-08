package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCarrierDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
//public class MCarrierMasterDto extends PagingDto {
public class MCarrierMasterListDto extends PagingDto {
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

	public static MCarrierDto chaseMCarrierDto() {
		return chaseMCarrierDto(new MCarrierDto());
	}

	public static MCarrierDto chaseMCarrierDto(MCarrierDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static MCarrierDto chaseMCarrierBodyDto() {
		return chaseMCarrierBodyDto(new MCarrierDto());
	}

	public static MCarrierDto chaseMCarrierBodyDto(MCarrierDto dto) {
//		if (dto.getMCenter() == null) {
//			dto.setMCenter(new MCenterDto());
//		}


		return dto;
	}

	public static class MCarrierData implements Serializable {
		//検索条件
		public MCarrierDto head = chaseMCarrierDto();
		//検索結果
		public List<MCarrierDto> body = new ArrayList<MCarrierDto>();
		//空行
		public MCarrierDto blankRow = chaseMCarrierBodyDto();
	};

	public MCarrierData data = new MCarrierData();

}
