package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TPicMthdRcmdDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PickingMethodRecommendationDto extends PrintParamDto {

	public static TPicMthdRcmdDto chaseTPicMthdRcmdDto() {
		return chaseTPicMthdRcmdDto(new TPicMthdRcmdDto());
	}

	public static TPicMthdRcmdDto chaseTPicMthdRcmdDto(TPicMthdRcmdDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		return dto;
	}

	public static class PickingMethodRecommendationData implements Serializable {
		//検索条件を入れるDTO
		public TPicMthdRcmdDto search = chaseTPicMthdRcmdDto();
		//検索結果を入れるDTO
		public List<TPicMthdRcmdDto> list = new ArrayList<TPicMthdRcmdDto>();

		// 発行帳票ID
		public List<Long> listReportId  = new ArrayList<Long>();
		// 発行帳票CDマップ
		public List<String> listReportCd  = new ArrayList<String>();

		// 発行帳票CD
		public String reportCd;
	};

	public PickingMethodRecommendationData data = new PickingMethodRecommendationData();
}
