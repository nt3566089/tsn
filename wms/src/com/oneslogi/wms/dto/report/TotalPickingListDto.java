package com.oneslogi.wms.dto.report;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlTotalPickingListPrintDto;
import com.oneslogi.base.dto.BaseDto;


@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class TotalPickingListDto extends SqlTotalPickingListPrintDto {

    //帳票CD
    private String reportCd;

	private String printFlg;
    //帳票CD

	//時間Id
    private long cultureId;

    private String lineNo;

    //[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
    //入庫日
    private String storeDt;
    //入庫No.管理フラグ
    private String storeNoFlg;
    //[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

	// [Ver3.0] unit of measure対応 2017.11.24 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.24 REN End

	public String getReportCd() {
		return reportCd;
	}

	public long getCultureId() {
		return cultureId;
	}

	public void setCultureId(long cultureId) {
		this.cultureId = cultureId;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	public String getPrintFlg() {
		return printFlg;
	}

	public void setPrintFlg(String printFlg) {
		this.printFlg = printFlg;
	}

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public void setStoreDt(String storeDt) {
		this.storeDt = storeDt;
	}

	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	public void setStoreNoFlg(String storeNoFlg) {
		this.storeNoFlg = storeNoFlg;
	}
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
	// [Ver3.0] unit of measure対応 2017.11.24 REN Start
	//入数
	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}

	//内訳
	public String getBreakdown() {
	return breakdown;
	}

	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	//最小梱包単位
	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
	// [Ver3.0] unit of measure対応 2017.11.24 REN End
}
