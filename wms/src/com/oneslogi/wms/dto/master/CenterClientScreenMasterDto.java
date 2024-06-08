package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BScreenDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CenterClientScreenMasterDto extends PagingDto {

	public static class CenterClientScreenData implements Serializable {
		//検索条件
		public BScreenDto head = new BScreenDto();
		//検索結果
		public List<BScreenDto> body = new ArrayList<BScreenDto>();
	};

	public CenterClientScreenData data = new CenterClientScreenData();

	public static class DropDownListData implements Serializable {

		public Long centerOrClientId;

		public String centerOrClientNm;

		public String centerOrClientCd;
	};

	public List<DropDownListData> centerOrClientList = new ArrayList<DropDownListData>();
}
