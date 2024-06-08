package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ClientMasterDto extends PagingDto {

	public static class ClientData implements Serializable {
		//検索条件
		public MClientDto head = new MClientDto();
		//検索結果
		public List<MClientDto> body = new ArrayList<MClientDto>();
		//空行
		public MClientDto blankRow = new MClientDto();
	};

	public ClientData data = new ClientData();

}
