package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordHDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveRecordListDto extends BaseDto {

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
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}

		if (dto.getTReceivePlanH() == null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}

		if (dto.getMCustomerBySupplierId() == null) {
			dto.setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getMCustomerByDepositId() == null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}

		if (dto.getMStockType() == null)
		{
			dto.setMStockType(new MStockTypeDto());
		}
		return dto;
	}

	public static class ReceiveRecordListData implements Serializable {

		// 入庫実績ヘッダ
		public TStoreRecordHDto search = chaseTStoreRecordHDto();

		// 入庫実績ボディ
		public List<TStoreRecordBDto> list = new ArrayList<TStoreRecordBDto>();

		 // JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為送信データをコンバートし対応
		public String searchBase64;
		public String listBase64;
	};

	public ReceiveRecordListData data = new ReceiveRecordListData();
}
