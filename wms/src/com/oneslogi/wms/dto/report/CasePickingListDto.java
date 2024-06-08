package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlCasePickingListPrintDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CasePickingListDto extends SqlCasePickingListPrintDto {

	//帳票CD
	private String reportCd;

	private String printFlg;

	private long cultureId;

	private String lineNo;
	// [Ver3.0] unit of measure対応 2017.11.24 NIU Start
	//入数
	private String stringUnitNum;

	//総ピック内訳
	private String totalBreakdown;

	//ピック内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.24 NIU End

	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 Start
	//商品CD列の印刷フラグ
	private String printProductCdFlg = "true";
	//商品CD列以外の印刷フラグ
	private String printProductCdElseFlg = "true";
	// [#5703][v3.1] ページング時の罫線不正を修正 2018.11.26 kawana Start
	//罫線(サブ)の印刷フラグ
	private String printSubLineFlg = "false";
	// [#5703][v3.1] ページング時の罫線不正を修正 2018.11.26 kawana End
	//罫線の印刷フラグ
	private String printLineFlg = "false";
	//総ケース数
	private BigDecimal totalCaseNum;
	//総ピース数
	private BigDecimal totalPieceNum;
	//総ピック数
	private BigDecimal totalPickNum;
	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 End

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
	//入庫日
	private String storeDt;
	//入庫No.管理フラグ
	private String storeNoFlg;

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

	// [#1942] SD用に追加した項目を削除 2017.06.20 kawana

	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
	private String fromShippingPackingNo;

	private String toShippingPackingNo;
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End

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

	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 Start
	public String getPrintProductCdFlg() {
		return printProductCdFlg;
	}

	public void setPrintProductCdFlg(String printProductCdFlg) {
		this.printProductCdFlg = printProductCdFlg;
	}

	public String getPrintProductCdElseFlg() {
		return printProductCdElseFlg;
	}

	public void setPrintProductCdElseFlg(String printProductCdElseFlg) {
		this.printProductCdElseFlg = printProductCdElseFlg;
	}

	public BigDecimal getTotalCaseNum() {
		return totalCaseNum;
	}

	public void setTotalCaseNum(BigDecimal totalCaseNum) {
		this.totalCaseNum = totalCaseNum;
	}

	public BigDecimal getTotalPieceNum() {
		return totalPieceNum;
	}

	public void setTotalPieceNum(BigDecimal totalPieceNum) {
		this.totalPieceNum = totalPieceNum;
	}

	public BigDecimal getTotalPickNum() {
		return totalPickNum;
	}

	public void setTotalPickNum(BigDecimal totalPickNum) {
		this.totalPickNum = totalPickNum;
	}

	public String getPrintSubLineFlg() {
		return printSubLineFlg;
	}

	public void setPrintSubLineFlg(String printSubLineFlg) {
		this.printSubLineFlg = printSubLineFlg;
	}

	public String getPrintLineFlg() {
		return printLineFlg;
	}

	public void setPrintLineFlg(String printLineFlg) {
		this.printLineFlg = printLineFlg;
	}

	// [Ver3.0] unit of measure対応 2017.11.21 NIU Start
	//入数
	public String getStringUnitNum() {
		return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
		this.stringUnitNum = stringUnitNum;
	}

	//総ピック内訳
	public String getTotalBreakdown() {
		return totalBreakdown;
	}

	public void setTotalBreakdown(String totalBreakdown) {
		this.totalBreakdown = totalBreakdown;
	}

	//ピック内訳
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

	// [Ver3.0] unit of measure対応 2017.11.21 NIU End

	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 End

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

	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
	public String getFromShippingPackingNo() {
		return fromShippingPackingNo;
	}

	public void setFromShippingPackingNo(String fromShippingPackingNo) {
		this.fromShippingPackingNo = fromShippingPackingNo;
	}

	public String getToShippingPackingNo() {
		return toShippingPackingNo;
	}

	public void setToShippingPackingNo(String toShippingPackingNo) {
		this.toShippingPackingNo = toShippingPackingNo;
	}
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End

}
