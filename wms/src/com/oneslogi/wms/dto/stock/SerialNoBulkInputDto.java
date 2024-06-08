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
public class SerialNoBulkInputDto extends PagingDto {

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

	public static class SerialNoBulkInputData implements Serializable {
		public String receiveCd;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.18 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.18 tanaka end
		public int errorCount;
		//検索条件
		public TSerialNoDto head = chaseTSerialNoDto();
		//検索結果(シリアルNo.管理テーブル)
		public List<TSerialNoDto> serialNoList = new ArrayList<TSerialNoDto>();
		//空行
		public TSerialNoDto blankRow = chaseTSerialNoDto();
	};

	public SerialNoBulkInputData data = new SerialNoBulkInputData();
}
