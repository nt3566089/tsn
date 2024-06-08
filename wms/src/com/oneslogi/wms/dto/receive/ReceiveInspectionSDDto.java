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
import com.oneslogi.base.dto.PagingDto;

// [#120] 入荷検品 2017.02.07 honma Mod Start
@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveInspectionSDDto extends PagingDto {
// [#120] 入荷検品 2017.02.07 honma Mod End

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {

		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}

		return dto;
	}

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

	public static class ReceiveInputData implements Serializable {

		/** 仮入力.入庫ロケーションCD */
		public String locationCd;
		/** 検索条件 */
		public TReceivePlanHDto head = chaseTReceivePlanHDto();

		/** 入荷実績ヘッダ情報 */
		public TStoreRecordHDto storeHead = chaseTStoreRecordHDto();
		/** 入荷実績ボディ情報 */
		public List<TStoreRecordBDto> storeBody = new ArrayList<TStoreRecordBDto>();

		/** 入荷実績ヘッダ情報(変更前) */
		public TStoreRecordHDto originalStoreHead;
		/** 入荷実績ボディ情報(変更前) */
		public List<TStoreRecordBDto> originalStoreBody;

		/** 商品ラベル発行用 入荷実績明細情報 */
		public List<TStoreRecordBDto> printStoreBody = new ArrayList<TStoreRecordBDto>();
	};

	public ReceiveInputData data = new ReceiveInputData();
}
