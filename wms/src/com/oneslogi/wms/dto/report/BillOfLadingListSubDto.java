package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class BillOfLadingListSubDto extends ReportDto {

	//空白行Flg
	public String nullFlg;

	public String getNullFlg() {
		return nullFlg;
	}

	public void setNullFlg(String nullFlg) {
		this.nullFlg = nullFlg;
	}
	//合計
	public BigDecimal qtyPLTS;
	public BigDecimal getQtyPLTS() {
		return qtyPLTS;
	}

	public void setQtyPLTS(BigDecimal qtyPLTS) {
		this.qtyPLTS = qtyPLTS;
	}

	public BigDecimal getQtyCASES() {
		return qtyCASES;
	}

	public void setQtyCASES(BigDecimal qtyCASES) {
		this.qtyCASES = qtyCASES;
	}

	public BigDecimal getWeightSum() {
		return weightSum;
	}

	public void setWeightSum(BigDecimal weightSum) {
		this.weightSum = weightSum;
	}
	public BigDecimal qtyCASES;
	public BigDecimal weightSum;
	//Handling Unit Qty
	public BigDecimal handlingUnitQty;

	//Handling Unit Type
	public String handlingUnitType;

	//Package Qty
	public BigDecimal packageQty;

	//Package Type
	public String packageType;

	//Weight
	public BigDecimal weight;

	//Commondity Description
	public String productAbbr;

	//NMFC#
	public String nmfcCode;

	// Class
	public String freightCls;

	public BigDecimal getHandlingUnitQty() {
		return handlingUnitQty;
	}

	public void setHandlingUnitQty(BigDecimal handlingUnitQty) {
		this.handlingUnitQty = handlingUnitQty;
	}

	public String getHandlingUnitType() {
		return handlingUnitType;
	}

	public void setHandlingUnitType(String handlingUnitType) {
		this.handlingUnitType = handlingUnitType;
	}

	public BigDecimal getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(BigDecimal packageQty) {
		this.packageQty = packageQty;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getProductAbbr() {
		return productAbbr;
	}

	public void setProductAbbr(String productAbbr) {
		this.productAbbr = productAbbr;
	}

	public String getNmfcCode() {
		return nmfcCode;
	}

	public void setNmfcCode(String nmfcCode) {
		this.nmfcCode = nmfcCode;
	}

	public String getFreightCls() {
		return freightCls;
	}

	public void setFreightCls(String freightCls) {
		this.freightCls = freightCls;
	}


}
