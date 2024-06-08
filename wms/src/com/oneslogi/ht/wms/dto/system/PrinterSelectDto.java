package com.oneslogi.ht.wms.dto.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.PPrinterAttributeDto;
import com.oneslogi.base.dbflute.dto.PPrinterDto;
import com.oneslogi.base.dbflute.dto.PPrinterGroupDto;
import com.oneslogi.base.dbflute.dto.PReportLayoutDto;
import com.oneslogi.base.dbflute.dto.PUserAutoPrintSettingDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;
import com.oneslogi.ht.wms.resources.system.PrinterSelectReportLayoutResource.PrinterSelectMode;

public class PrinterSelectDto extends HandyBaseDto{

	public static PUserAutoPrintSettingDto chasePUserAutoPrintSettingDto(){
		return chasePUserAutoPrintSettingDto(new PUserAutoPrintSettingDto());
	}

	public static PUserAutoPrintSettingDto chasePUserAutoPrintSettingDto(PUserAutoPrintSettingDto dto){

		return dto;
	}

	public static class PrinterSelectData implements Serializable{

		public PUserAutoPrintSettingDto pUserAutoPrintSettingDto = chasePUserAutoPrintSettingDto();

		public List<PUserAutoPrintSettingDto> lstPUserAutoPrintSettingDto = new ArrayList<PUserAutoPrintSettingDto>();

		public List<PReportLayoutDto> lstPReportLayoutDto = new ArrayList<PReportLayoutDto>();

		public List<PPrinterGroupDto> lstPPrinterGroupDto = new ArrayList<PPrinterGroupDto>();

		public List<PPrinterDto> lstPPrinterDto = new ArrayList<PPrinterDto>();

		public List<PPrinterAttributeDto> lstPPrinterAttributeDto = new ArrayList<PPrinterAttributeDto>();

	}

	public PrinterSelectData data = new PrinterSelectData();
	// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana Start
	public PrinterSelectMode mode;
	// [v3.1] 端末別自動印刷設定機能の追加 2019.09.05 kawana End

	/**
	 * @return pUserAutoPrintSettingDto
	 */
	public PUserAutoPrintSettingDto getpUserAutoPrintSettingDto() {
		return data.pUserAutoPrintSettingDto;
	}

	/**
	 * @param pUserAutoPrintSettingDto セットする pUserAutoPrintSettingDto
	 */
	public void setpUserAutoPrintSettingDto(PUserAutoPrintSettingDto pUserAutoPrintSettingDto) {
		data.pUserAutoPrintSettingDto = pUserAutoPrintSettingDto;
	}

	/**
	 * @return lstPUserAutoPrintSettingDto
	 */
	public List<PUserAutoPrintSettingDto> getLstPUserAutoPrintSettingDto() {
		return data.lstPUserAutoPrintSettingDto;
	}

	/**
	 * @param lstPUserAutoPrintSettingDto セットする lstPUserAutoPrintSettingDto
	 */
	public void setLstPUserAutoPrintSettingDto(List<PUserAutoPrintSettingDto> lstPUserAutoPrintSettingDto) {
		data.lstPUserAutoPrintSettingDto = lstPUserAutoPrintSettingDto;
	}

	/**
	 * @return lstPReportLayout
	 */
	public List<PReportLayoutDto> getLstPReportLayoutDto() {
		return data.lstPReportLayoutDto;
	}

	/**
	 * @param lstPReportLayout セットする lstPReportLayout
	 */
	public void setLstPReportLayoutDto(List<PReportLayoutDto> lstPReportLayoutDto) {
		data.lstPReportLayoutDto = lstPReportLayoutDto;
	}


	/**
	 * @return lstPPrinterGroupDto
	 */
	public List<PPrinterGroupDto> getLstPPrinterGroupDto() {
		return data.lstPPrinterGroupDto;
	}

	/**
	 * @param lstPPrinterGroupDto セットする lstPPrinterGroupDto
	 */
	public void setLstPPrinterGroupDto(List<PPrinterGroupDto> lstPPrinterGroupDto) {
		data.lstPPrinterGroupDto = lstPPrinterGroupDto;
	}
	/**
	 * @return lstPPrinterDto
	 */
	public List<PPrinterDto> getLstPPrinterDto() {
		return data.lstPPrinterDto;
	}

	/**
	 * @param lstPPrinterDto セットする lstPPrinterDto
	 */
	public void setLstPPrinterDto(List<PPrinterDto> lstPPrinterDto) {
		data.lstPPrinterDto = lstPPrinterDto;
	}


	/**
	 * @return lstPPrinterAttributeDto
	 */
	public List<PPrinterAttributeDto> getLstPPrinterAttributeDto() {
		return data.lstPPrinterAttributeDto;
	}

	/**
	 * @param lstPPrinterAttributeDto セットする lstPPrinterAttributeDto
	 */
	public void setLstPPrinterAttributeDto(List<PPrinterAttributeDto> lstPPrinterAttributeDto) {
		data.lstPPrinterAttributeDto = lstPPrinterAttributeDto;
	}
}
