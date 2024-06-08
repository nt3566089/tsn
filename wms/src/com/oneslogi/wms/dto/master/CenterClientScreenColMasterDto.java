package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BColDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CenterClientScreenColMasterDto extends PagingDto {

	public static class CenterClientScreenColData implements Serializable {
		//検索条件
		public BColDto head = new BColDto();
		//検索結果
		public List<BColDto> body = new ArrayList<BColDto>();
	};

	public CenterClientScreenColData data = new CenterClientScreenColData();

	public static class DropDownListData implements Serializable {

		public Long centerOrClientId;

		public String centerOrClientNm;

		public String centerOrClientCd;
	};

	public List<DropDownListData> centerOrClientList = new ArrayList<DropDownListData>();
}
