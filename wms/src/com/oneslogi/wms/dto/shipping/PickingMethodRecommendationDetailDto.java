package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TPicMthdRcmdDataDto;
import com.oneslogi.base.dbflute.dto.TPicMthdRcmdDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PickingMethodRecommendationDetailDto extends PagingDto {

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

	public static TPicMthdRcmdDataDto chaseTPicMthdRcmdDataDto() {
		return chaseTPicMthdRcmdDataDto(new TPicMthdRcmdDataDto());
	}

	public static TPicMthdRcmdDataDto chaseTPicMthdRcmdDataDto(TPicMthdRcmdDataDto dto) {
		if (dto.getTPickingH() == null) {
			dto.setTPickingH(new TPickingHDto());
		}

		if (dto.getTPicMthdRcmd() == null) {
			dto.setTPicMthdRcmd(new TPicMthdRcmdDto());
		}
		return dto;
	}

	public static class PickingMethodRecommendationDetailData implements Serializable {
		//ヘッダ情報を入れるDTO
		public TPicMthdRcmdDto header = chaseTPicMthdRcmdDto();
		//検索結果を入れるDTO
		public List<TPicMthdRcmdDataDto> list = new ArrayList<TPicMthdRcmdDataDto>();
	};

	public PickingMethodRecommendationDetailData data = new PickingMethodRecommendationDetailData();
}
