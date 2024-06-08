package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlSLPickingListPrintDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.wms.core.WCC;


@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class SLPickingListDto extends SqlSLPickingListPrintDto {

    //帳票CD
    private String reportCd;

	private String printFlg;
	//時間Id
    private long cultureId;

    private int lineN;
	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.23 REN End
    //[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
    //入庫日
    private String storeDt;
    //入庫No.管理フラグ
    private String storeNoFlg;
    //[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End
	// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start
	/** 出庫数(小計) */
	private PickingNumSubTotal PickingNumSubTotal;
	// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Ｅｎｄ

	public int getLineN() {
		return lineN;
	}

	public void setLineN(int lineN) {
		this.lineN = lineN;
	}

	public String getPrintFlg() {
		return printFlg;
	}
	public void setPrintFlg(String printFlg) {
		this.printFlg = printFlg;
	}

    public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	public long getCultureId() {
		return cultureId;
	}

	public void setCultureId(long cultureId) {
		this.cultureId = cultureId;
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
	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}

	public String getBreakdown() {
	return breakdown;
	}

	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
	// [Ver3.0] unit of measure対応 2017.11.23 REN End

	// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana Start

	public PickingNumSubTotal getPickingNumSubTotal() {
		return PickingNumSubTotal;
	}

	public void setPickingNumSubTotal(PickingNumSubTotal pickingNumSubTotal) {
		PickingNumSubTotal = pickingNumSubTotal;
	}

	/**
	 * 出庫数小計クラス
	 */
	public static class PickingNumSubTotal {

		/** 出庫数 */
		private BigDecimal pickingNum;
		/** 出庫数 内訳 */
		private String breakdown;

		// ===== 以下ゲッタ、セッタ =====

		public BigDecimal getPickingNum() {
			return pickingNum;
		}

		public void setPickingNum(BigDecimal pickingNum) {
			this.pickingNum = pickingNum;
		}

		public void addPickingNum(BigDecimal pickingNum) {
			this.pickingNum = WCC.add(this.pickingNum, pickingNum);
		}

		public String getBreakdown() {
			return breakdown;
		}

		public void setBreakdown(String breakdown) {
			this.breakdown = breakdown;
		}
	}

	// [#5253][v3.0] 小計の内訳不正を修正 2018.08.28 kawana End
}
