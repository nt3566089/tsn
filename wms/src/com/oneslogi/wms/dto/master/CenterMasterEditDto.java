package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MBoxGrpDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dto.PagingDto;

public class CenterMasterEditDto extends PagingDto {

	public static MClientCenterDto chaseMClientCenterBodyDto() {
		return chaseMClientCenterBodyDto(new MClientCenterDto());
	}

	public static MClientCenterDto chaseMClientCenterBodyDto(MClientCenterDto dto) {

		if(dto.getMClient() == null){
			dto.setMClient(new MClientDto());
		}
		if(dto.getMParamAsOne()==null){
			dto.setMParamAsOne(new MParamDto());
		}

		if(dto.getMParamAsOne().getMDeliveryCourse()==null){
			dto.getMParamAsOne().setMDeliveryCourse(new MDeliveryCourseDto());
		}

		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
		if(dto.getMParamAsOne().getMZone()==null){
			dto.getMParamAsOne().setMZone(new MZoneDto());
		}
		if(dto.getMParamAsOne().getMZone().getMWarehouse()==null){
			dto.getMParamAsOne().getMZone().setMWarehouse(new MWarehouseDto());
		}
		if(dto.getMParamAsOne().getMBoxGrp()==null){
			dto.getMParamAsOne().setMBoxGrp(new MBoxGrpDto());
		}

		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
		if(dto.getMParamAsOne().getMBox()==null){
			dto.getMParamAsOne().setMBox(new MBoxDto());
		}
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
		return dto;
	}

	public static class CenterMasterEditData implements Serializable {

		public MCenterDto head = new MCenterDto();

//		public List<MCenterDto> body = new ArrayList<MCenterDto>();
		public List<MClientCenterDto> body = new ArrayList<MClientCenterDto>();

		//空行
		public MClientCenterDto blankRow =  chaseMClientCenterBodyDto();

	}

	public CenterMasterEditData data = new CenterMasterEditData();

	public String mode = null;

}
