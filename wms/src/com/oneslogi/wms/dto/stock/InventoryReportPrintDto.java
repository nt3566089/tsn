package com.oneslogi.wms.dto.stock;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TTrinvcheckinfoDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.dto.report.ExcessOrDeficiencyReportListDomesticDto;
import com.oneslogi.wms.dto.report.ExcessOrDeficiencyReportListDto;
import com.oneslogi.wms.dto.report.ExcessOrDeficiencyReportListImportDto;
import com.oneslogi.wms.dto.report.InventoryReportListDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryReportPrintDto extends PrintParamDto{
	
	public static TTrinvcheckinfoDto chaseTTrinvcheckinfoDto() {
		return chaseTTrinvcheckinfoDto(new TTrinvcheckinfoDto());
	}

	private static TTrinvcheckinfoDto chaseTTrinvcheckinfoDto(TTrinvcheckinfoDto dto) {
		if(dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		
		if(dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		return dto;
	}
	
	
	public static class InventoryReportPrintData implements Serializable {
		//検索条件
		public TTrinvcheckinfoDto searchCondition = chaseTTrinvcheckinfoDto();
		//在庫調査表アウトプットデータ
		public InventoryReportListDto inventoryReportListDto =new InventoryReportListDto();
		//適品過不足報告書アウトプットデータ
		public ExcessOrDeficiencyReportListDto excessOrDeficiencyReportListDto =new ExcessOrDeficiencyReportListDto();
		//不適品過不足報告書アウトプットデータ(国産)
		public ExcessOrDeficiencyReportListDomesticDto  excessOrDeficiencyReportListDomesticDto 	= new ExcessOrDeficiencyReportListDomesticDto();
		//不適品過不足報告書アウトプットデータ(輸入)
		public ExcessOrDeficiencyReportListImportDto excessOrDeficiencyReportListImportDto = new ExcessOrDeficiencyReportListImportDto();
	};
	
	public InventoryReportPrintData data = new InventoryReportPrintData();
}
