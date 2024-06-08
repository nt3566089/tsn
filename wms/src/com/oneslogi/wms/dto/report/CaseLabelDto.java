package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 *ケースはり紙DTOクラス
 */
public class CaseLabelDto extends ReportDto {

	/**  ケース内数量*/
	public String caseNum ;
	/**  工場コード*/
	public String factoryCd ;
	/**  製造年月日*/
	public String limitDate ;
	/**  生出番号*/
	public String createNo ;
	/**  号機*/
	public String machineNo ;
	/**  QRコード*/
	public String qrCode ;
	/**  流通識別*/
	public String distributionCd ;
	/**  日付時刻*/
	public String dateTime ;
	/**  銘柄コード*/
	public String itemCd ;
	/**  銘柄名称*/
	public String itemName ;
	/**  はり紙管理番号*/
	public String caseCd ;
	/**  輸送番号*/
	public String transportCd ;
	/**  保管場ロケ*/
	public String locCd ;
	/**  パレット管理番号*/
	public String palletNo ;
	/**  デザイン区分*/
	public String designCd ;
	/**  山出しリストNo.*/
	public String picklistKey ;
	/**  補充先*/
	public String sotedUnit ;
	/**  拠点コード*/
	public String warehouseCd ;
	/**  拠点名称*/
	public String warehouseSname ;
	/**  ユーザコード*/
	public String userCd ;
	/**  ユーザ名称*/
	public String userNm ;
	/**  山出しリスト出力順*/
	public String picklistSort ;
	/**  使用区分*/
	public String itemSort1 ;
	/**  一般出力順*/
	public String itemSort3 ;
	/**  工場出力順*/
	public String factoryCdSort ;
	/**  再印刷区分*/
	public String rePrintedFlg ;





	// ===== 以下、ゲッタ・セッタ =====

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}

	public String getFactoryCd() {
		return factoryCd;
	}

	public void setFactoryCd(String factoryCd) {
		this.factoryCd = factoryCd;
	}

	public String getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(String limitDate) {
		this.limitDate = limitDate;
	}

	public String getCreateNo() {
		return createNo;
	}

	public void setCreateNo(String createNo) {
		this.createNo = createNo;
	}

	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getDistributionCd() {
		return distributionCd;
	}

	public void setDistributionCd(String distributionCd) {
		this.distributionCd = distributionCd;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setCaseCd(String caseCd) {
		this.caseCd = caseCd;
	}

	public String getCaseCd() {
		return caseCd;
	}

	public void setTransportCd(String transportCd) {
		this.transportCd = transportCd;
	}

	public String getTransportCd() {
		return transportCd;
	}

	public String getLocCd() {
		return locCd;
	}

	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}

	public String getPalletNo() {
		return palletNo;
	}

	public void setPalletNo(String palletNo) {
		this.palletNo = palletNo;
	}

	public String getDesignCd() {
		return designCd;
	}

	public void setDesignCd(String designCd) {
		this.designCd = designCd;
	}

	public String getPicklistKey() {
		return picklistKey;
	}

	public void setPicklistKey(String picklistKey) {
		this.picklistKey = picklistKey;
	}

	public String getSotedUnit() {
		return sotedUnit;
	}

	public void setSotedUnit(String sotedUnit) {
		this.sotedUnit = sotedUnit;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getWarehouseSname() {
		return warehouseSname;
	}

	public void setWarehouseSname(String warehouseSname) {
		this.warehouseSname = warehouseSname;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public void setPicklistSort(String picklistSort) {
		this.picklistSort = picklistSort;
	}

	public String getPicklistSort() {
		return picklistSort;
	}

	public void setItemSort1(String itemSort1) {
		this.itemSort1 = itemSort1;
	}

	public String getItemSort1() {
		return itemSort1;
	}

	public void setItemSort3(String itemSort3) {
		this.itemSort3 = itemSort3;
	}

	public String getItemSort3() {
		return itemSort3;
	}

	public void setFactoryCdSort(String factoryCdSort) {
		this.factoryCdSort = factoryCdSort;
	}

	public String getFactoryCdSort() {
		return factoryCdSort;
	}

	public void setRePrintedFlg(String rePrintedFlg) {
		this.rePrintedFlg = rePrintedFlg;
	}

	public String getRePrintedFlg() {
		return rePrintedFlg;
	}

}
