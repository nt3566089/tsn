package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.EBarcodeLabelDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BarcodeLabelPrintDto extends PrintParamDto{

	public static EBarcodeLabelDto chaseEBarcodeLabelDto() {
		return chaseEBarcodeLabelDto(new EBarcodeLabelDto());
	}

	public static EBarcodeLabelDto chaseEBarcodeLabelDto (EBarcodeLabelDto dto) {
		return dto;
	}

	public static class BarcodeLabelPrintData implements Serializable {

		// バーコードラベル情報
		public EBarcodeLabelDto head = chaseEBarcodeLabelDto();
		// 検索結果(バーコードラベル受信テーブル)
		public List<EBarcodeLabelDto> body = new ArrayList<EBarcodeLabelDto>();
	};

	public BarcodeLabelPrintData data = new BarcodeLabelPrintData();
}
