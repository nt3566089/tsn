package com.oneslogi.wms.dto.receive;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductLabelPrintDto extends PrintParamDto {

	public static TStoreRecordHDto chaseTStoreRecordHDto() {
		return chaseTStoreRecordHDto(new TStoreRecordHDto());
	}

	public static TStoreRecordHDto chaseTStoreRecordHDto(TStoreRecordHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		if (dto.getTReceivePlanH() == null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}

		return dto;
	}

	public static class ProductLabelPrintData implements Serializable {

		// 入荷実績入力(予定なし)画面ヘッダ情報(実績)
		public TStoreRecordHDto storeHead = chaseTStoreRecordHDto();
	};

	public ProductLabelPrintData data = new ProductLabelPrintData();
}