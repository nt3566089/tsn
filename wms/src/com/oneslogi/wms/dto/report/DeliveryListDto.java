package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 輸送帳票DTOクラス
 */
public class DeliveryListDto extends ReportDto {

	/** 帳票名 */
	public String reportName;
	/** 帳票種別詳細 */
	public String reportTypeDetail;
	/** 作成日 */
	public String addDt;
	/** 運送業者名 */
	public String carrierNm;
	/** 発送番号 */
	public String snNo3;
	/** ＪＴ整理番号 */
	public String snNo2;
	/** ＴＳＮ整理番号 */
	public String snNo1;
	/** 号車No */
	public String carNo;
	/** 計画車種 */
	public Integer plnCarKnd;
	/** 実績車種 */
	public Integer amCarKnd;
	/** 発送日 */
	public String snYMD;
	/** 到着日 */
	public String arvYMD;
	/** 発送元 */
	public String supplierName;
	/** 発送先 */
	public String shipName;
	/** 汎用パレット */
	public Integer gnPltQa;
	/** その他のパレット */
	public Integer otPltQa;
	/** 封印Ｎｏ1 */
	public String selNo1;
	/** 封印Ｎｏ2 */
	public String selNo2;
	/** 封印Ｎｏ3 */
	public String selNo3;
	/** 区分 */
	public String deliveryClass;

	// ===== 以下、ゲッタ・セッタ =====

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportTypeDetail() {
		return reportTypeDetail;
	}

	public void setReportTypeDetail(String reportTypeDetail) {
		this.reportTypeDetail = reportTypeDetail;
	}

	public String getAddDt() {
		return addDt;
	}

	public void setAddDt(String addDt) {
		this.addDt = addDt;
	}

	public String getCarrierNm() {
		return carrierNm;
	}

	public void setCarrierNm(String carrierNm) {
		this.carrierNm = carrierNm;
	}

	public String getSnNo3() {
		return snNo3;
	}

	public void setSnNo3(String snNo3) {
		this.snNo3 = snNo3;
	}

	public String getSnNo2() {
		return snNo2;
	}

	public void setSnNo2(String snNo2) {
		this.snNo2 = snNo2;
	}

	public String getSnNo1() {
		return snNo1;
	}

	public void setSnNo1(String snNo1) {
		this.snNo1 = snNo1;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public Integer getPlnCarKnd() {
		return plnCarKnd;
	}

	public void setPlnCarKnd(Integer plnCarKnd) {
		this.plnCarKnd = plnCarKnd;
	}

	public Integer getAmCarKnd() {
		return amCarKnd;
	}

	public void setAmCarKnd(Integer amCarKnd) {
		this.amCarKnd = amCarKnd;
	}

	public String getSnYMD() {
		return snYMD;
	}

	public void setSnYMD(String snYMD) {
		this.snYMD = snYMD;
	}

	public String getArvYMD() {
		return arvYMD;
	}

	public void setArvYMD(String arvYMD) {
		this.arvYMD = arvYMD;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public Integer getGnPltQa() {
		return gnPltQa;
	}

	public void setGnPltQa(Integer gnPltQa) {
		this.gnPltQa = gnPltQa;
	}

	public Integer getOtPltQa() {
		return otPltQa;
	}

	public void setOtPltQa(Integer otPltQa) {
		this.otPltQa = otPltQa;
	}

	public String getSelNo1() {
		return selNo1;
	}

	public void setSelNo1(String selNo1) {
		this.selNo1 = selNo1;
	}

	public String getSelNo2() {
		return selNo2;
	}

	public void setSelNo2(String selNo2) {
		this.selNo2 = selNo2;
	}

	public String getSelNo3() {
		return selNo3;
	}

	public void setSelNo3(String selNo3) {
		this.selNo3 = selNo3;
	}

	public String getDeliveryClass() {
		return deliveryClass;
	}

	public void setDeliveryClass(String deliveryClass) {
		this.deliveryClass = deliveryClass;
	}

}
