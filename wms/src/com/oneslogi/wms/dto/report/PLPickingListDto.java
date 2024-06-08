package com.oneslogi.wms.dto.report;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlPLPickingListPrintDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PLPickingListDto extends SqlPLPickingListPrintDto {

	//名寄せ分子/名寄せ分母
	private String strFraction;

	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.23 REN End

	//時間Id
	private long cultureId;

	//帳票CD
	private String reportId;

	//再Flg
	private String printFlg;

	//伝票№件数
	private String shippingSlipNoNum;

	// [ON推-品向-555] 5桁の出庫作業Noをjava側で作成 2015.01.15 kawana Start
	// 出庫作業No.(省略形)
	private String pickingWorkNoAbbr;
	// [ON推-品向-555] 5桁の出庫作業Noをjava側で作成 2015.01.15 kawana End

	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja Start
	// 出荷梱包No.(省略形)
	private String shippingPackingNoAbbr;
	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja End

    //[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
    //入庫日
    private String storeDt;
    //入庫No.管理フラグ
    private String storeNoFlg;
    //[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

	// [1.1.4-CT-080] 摘み取りリストにバケットNoを表示 2016.06.14 kawana Start
    // バケット段列No.
    private String bucketRowColNo;
	// [1.1.4-CT-080] 摘み取りリストにバケットNoを表示 2016.06.14 kawana End

	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
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
	// [Ver3.0] unit of measure対応 2017.11.23 REN End

	public String getStrFraction() {
		return strFraction;
	}

	public void setStrFraction(String strFraction) {
		this.strFraction = strFraction;
	}

	public long getCultureId() {
		return cultureId;
	}

	public void setCultureId(long cultureId) {
		this.cultureId = cultureId;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getPrintFlg() {
		return printFlg;
	}

	public void setPrintFlg(String printFlg) {
		this.printFlg = printFlg;
	}

	public String getShippingSlipNoNum() {
		return shippingSlipNoNum;
	}

	public void setShippingSlipNoNum(String shippingSlipNoNum) {
		this.shippingSlipNoNum = shippingSlipNoNum;
	}

	// [ON推-品向-555] 5桁の出庫作業Noをjava側で作成 2015.01.15 kawana Start
	public String getPickingWorkNoAbbr() {
		return pickingWorkNoAbbr;
	}

	public void setPickingWorkNoAbbr(String pickingWorkNoAbbr) {
		this.pickingWorkNoAbbr = pickingWorkNoAbbr;
	}
	// [ON推-品向-555] 5桁の出庫作業Noをjava側で作成 2015.01.15 kawana End

	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja Start
	/**
	 * @return the shippingPackingNoAbbr
	 */
	public String getShippingPackingNoAbbr() {
		return shippingPackingNoAbbr;
	}

	/**
	 * @param shippingPackingNoAbbr the shippingPackingNoAbbr to set
	 */
	public void setShippingPackingNoAbbr(String shippingPackingNoAbbr) {
		this.shippingPackingNoAbbr = shippingPackingNoAbbr;
	}
	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.03 sja End

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

	public String getBucketRowColNo() {
		return bucketRowColNo;
	}

	public void setBucketRowColNo(String bucketRowColNo) {
		this.bucketRowColNo = bucketRowColNo;
	}
}
