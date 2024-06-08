package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterClassGrpDtlDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CenterClassGrpDtlDto extends PagingDto {

	public static class CenterClassGrpDtlData implements Serializable {
		// センタ区分値グループ明細マスタメンテナンスヘッダ情報
		public MCenterClassGrpDtlDto head = new MCenterClassGrpDtlDto();
		// センタ区分値グループ明細マスタメンテナンス画面明細情報
		public List<MCenterClassGrpDtlDto> body = new ArrayList<MCenterClassGrpDtlDto>();
	};

	public CenterClassGrpDtlData data = new CenterClassGrpDtlData();

}
