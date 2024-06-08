package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TCcopamDto;
import com.oneslogi.base.dbflute.dto.customize.SqlChakuchiOtherListDto;
import com.oneslogi.base.dbflute.dto.customize.SqlChakuchiSapListDto;
import com.oneslogi.base.dbflute.dto.customize.SqlDispatchRecordInputListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DispatchRecordInputDto extends PagingDto {

	public static TCcopamDto chaseTCcopamDto() {
		return chaseTCcopamDto(new TCcopamDto());
	}

	public static TCcopamDto chaseTCcopamDto(TCcopamDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class DispatchRecordInputData implements Serializable {
		// 検索条件
		public TCcopamDto head = chaseTCcopamDto();

		// 検索結果
		public List<SqlDispatchRecordInputListDto> list = new ArrayList<SqlDispatchRecordInputListDto>();
		// 着地リスト
		public List<SqlChakuchiSapListDto>  chakuchiSapList = new ArrayList<SqlChakuchiSapListDto>();
		public List<SqlChakuchiOtherListDto>  chakuchiOtherList = new ArrayList<SqlChakuchiOtherListDto>();
		// CAPセンターフラグ
		public String capFlg = "";
		// システム管理日付
		public String systemDt = "";
		
		// 輸送帳票用検索結果
		public DispatchRecordInputPrintDto dispatchRecordInputPrintDto =  new DispatchRecordInputPrintDto();
	};

	public DispatchRecordInputData data = new DispatchRecordInputData();

}
