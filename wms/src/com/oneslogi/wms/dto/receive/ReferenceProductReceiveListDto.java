package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordHDto;
import com.oneslogi.base.dbflute.dto.VDictDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReferenceProductReceiveListDto extends PagingDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}

		return dto;
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {

		if (dto.getTStoreRecordBList().size() == 0) {
			dto.getTStoreRecordBList().add(0, new TStoreRecordBDto());
		}
		if (dto.getTStoreRecordBList().get(0).getBClassDtlByStoreFlg() == null) {
			dto.getTStoreRecordBList().get(0).setBClassDtlByStoreFlg(new BClassDtlDto());
		}
		if (dto.getTStoreRecordBList().get(0).getBClassDtlByStoreFlg().getVDict() == null) {
			dto.getTStoreRecordBList().get(0).getBClassDtlByStoreFlg().setVDict(new VDictDto());
		}
		if (dto.getTStoreRecordBList().get(0).getTStoreRecordH() == null) {
			dto.getTStoreRecordBList().get(0).setTStoreRecordH(new TStoreRecordHDto());
		}
		if (dto.getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerBySupplierId() == null) {
			dto.getTStoreRecordBList().get(0).getTStoreRecordH().setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerByDepositId() == null) {
			dto.getTStoreRecordBList().get(0).getTStoreRecordH().setMCustomerByDepositId(new MCustomerDto());
		}

		return dto;
	}

	public static class ReferenceProductReceiveListData implements Serializable {
		//検索条件を入れるDTO
		public TReceivePlanHDto head = chaseTReceivePlanHDto();
		//検索結果を入れるDTO
		public List<TReceivePlanBDto> list = new ArrayList<TReceivePlanBDto>();
	};

	public ReferenceProductReceiveListData data = new ReferenceProductReceiveListData();
}
