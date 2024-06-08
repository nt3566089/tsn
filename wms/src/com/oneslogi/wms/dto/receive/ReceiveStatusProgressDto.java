package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlReceiveStatusProgressDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.StatusDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveStatusProgressDto extends StatusDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}
		return dto;
	}

	public static class SearchConditionData implements Serializable {
		//検索条件を入れるDTO
		public TReceivePlanHDto search = chaseTReceivePlanHDto();
		//検索結果を入れるDTO（外だしＳＱＬ）
		public List<SqlReceiveStatusProgressDto> list = new ArrayList<SqlReceiveStatusProgressDto>();
	};

	public SearchConditionData data = new SearchConditionData();
}
