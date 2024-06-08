package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BItemDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CenterClientScreenItemMasterDto extends PagingDto {

	public static class CenterClientScreenItemData implements Serializable {
		//検索条件
		public BItemDto head = new BItemDto();
		//検索結果
		public List<BItemDto> body = new ArrayList<BItemDto>();
	};

	public CenterClientScreenItemData data = new CenterClientScreenItemData();

	public static class DropDownListData implements Serializable {

		public Long centerOrClientId;

		public String centerOrClientNm;

		public String centerOrClientCd;
	};

	public List<DropDownListData> centerOrClientList = new ArrayList<DropDownListData>();
}
