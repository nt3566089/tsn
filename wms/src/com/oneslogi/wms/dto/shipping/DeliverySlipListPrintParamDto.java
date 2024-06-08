package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlPickingListPrintDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class DeliverySlipListPrintParamDto extends PrintParamDto {

	public static TPickingHDto chaseTPickingHDto() {
		return chaseTPickingHDto(new TPickingHDto());
	}

	public static TPickingHDto chaseTPickingHDto(TPickingHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}

		if (dto.getTAllocInstH() == null) {
			dto.setTAllocInstH(new TAllocInstHDto());
		}
		return dto;
	}

	public static class PickingListPrintData implements Serializable {
		// ヘッダ部DTO
		public TPickingHDto head = chaseTPickingHDto();
		//検索結果を入れるDTO
		public List<SqlPickingListPrintDto> list = new ArrayList<SqlPickingListPrintDto>();
		public TPickingHDto footer = chaseTPickingHDto();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
		public String isInvoiceTagReportOutFlg = "0";
		// 発行帳票ID
		public List<Long> listReportId  = new ArrayList<Long>();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
	};

	public PickingListPrintData data = new PickingListPrintData();
}
