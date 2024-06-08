package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveListDto extends PagingDto {

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

	public static class ProgressData implements Serializable {
		//全体件数
		public Long allCount = 0L;
		//未入荷件数
		public Long nonReceiveCount = 0L;
		//入荷中件数
		public Long receivingCount = 0L;
		//入荷済件数
		public Long storedCount = 0L;
	};

	public static class ReceiveListData implements Serializable {
		//検索条件を入れるDTO
		public TReceivePlanHDto search = chaseTReceivePlanHDto();
		//検索結果を入れるDTO
		public List<TReceivePlanHDto> list = new ArrayList<TReceivePlanHDto>();
		//検索結果を入れるDTO（外だしＳＱＬ用のサンプル）
		//public List<SqlReceiveListDto> list = new ArrayList<SqlReceiveListDto>();
		//進捗状態を入れるDTO
		public ProgressData progress = new ProgressData();
	};

	public ReceiveListData data = new ReceiveListData();
}
