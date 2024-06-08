package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.EBarcodeLabelDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BarcodeLabelBulkPrintDto extends PagingDto {

	public static EBarcodeLabelDto chaseEBarcodeLabelDto() {
		return chaseEBarcodeLabelDto(new EBarcodeLabelDto());
	}

	public static EBarcodeLabelDto chaseEBarcodeLabelDto(EBarcodeLabelDto dto) {
		return dto;
	}

	public static EBarcodeLabelDto chaseEBarcodeLabelBodyDto() {
		return chaseEBarcodeLabelDtoDto(new EBarcodeLabelDto());
	}

	public static EBarcodeLabelDto chaseEBarcodeLabelDtoDto(EBarcodeLabelDto dto) {
		return dto;
	}

	public static class BarcodeLabelData implements Serializable {
		// 検索条件
		public EBarcodeLabelDto head = chaseEBarcodeLabelDto();
		// 検索結果(ロケーションマスタ受信テーブル)
		public List<EBarcodeLabelDto> body = new ArrayList<EBarcodeLabelDto>();
		// 空行
		public EBarcodeLabelDto blankRow = chaseEBarcodeLabelBodyDto();
		// バーコードラベル出力設定
		public BarcodeLabelPrintDto reportData = new BarcodeLabelPrintDto();
	};

	public BarcodeLabelData data = new BarcodeLabelData();
}
