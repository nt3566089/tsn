package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BCultureDto;
import com.oneslogi.base.dbflute.dto.BMessageDto;
import com.oneslogi.base.dbflute.dto.MHtMessageDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class HTMessageMasterDto extends PagingDto {

	public static MHtMessageDto chaseMHtMessageDto() {
		return chaseMHtMessageDto(new MHtMessageDto());

	}

	public static MHtMessageDto chaseMHtMessageDto(MHtMessageDto dto) {
		if (dto.getBMessage() == null) {
			dto.setBMessage(new BMessageDto());
		}
		if (dto.getBMessage().getBCulture() == null) {
			dto.getBMessage().setBCulture(new BCultureDto());
		}
		return dto;
	}

	public static class HTMessageData implements Serializable {
		// HTメッセージマスタメンテナンス画面ヘッダ情報
		public MHtMessageDto head = chaseMHtMessageDto();
		// HTメッセージマスタメンテナンス画面明細情報
		public List<BMessageDto> body = new ArrayList<BMessageDto>();
		// HTメッセージマスタメンテナンス画面明細空行情報
		public BMessageDto blankRow = new BMessageDto();
	};

	public HTMessageData data = new HTMessageData();

}
