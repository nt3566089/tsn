package com.oneslogi.wms.dto.tsnCommon;

import java.util.List;

/**
 * TSplitDataを保持します。
 * @author hi.watanabe.mp
 *
 */
public class TSplitData {

	//工場コード
	private String factoryCd;
	//銘柄コード
	private String itemCd;
	//SKUコード
	private String skuCd;
	//仕向地コード
	private String destinationCd;
	//製造記号
	private String manufactureCd;
	//発注番号
	private String orderNumber;
	//号機
	private String machineNumber;
	//生出番号
	private String createNo;
	//製造年月日
	private String manufactureDate;
	//日付時刻
	private String dateTime;
	//流通識別コード
	private String distributionCd;
	//入庫キー
	private String rcvKey;
	//デザイン区分
	private String designCd;

	//ITFコード
	private String itfCd;
	//barcode_valiant
	private String barcodeValiant;
	//製造センターNo
	private String manufactureCenterNo;
	//ケースパッカーNo
	private String casePackNo;
	//ケースパッキング時間
	private String casePackTime;
	//機械コード
	private String machineCd;
	//製造時間
	private String makeTime;

	//パレット積み付けキー
	private String palletLoadingKey;
	//通番
	private String serialNumber;

	private List<TSplitDetailData> splitDetailData;
	//整理番号
	private String refNo;
	//発地コード
	private String shipCd;
	//払出実績日
	private String carryOutDate;
	//着地コード
	private String shipToCd;
	//受入予定日
	private String rcvDate;
	//輸送形態コード
	private String zzshType;
	//総パレット数
	private String tplQty;
	//需給パレット番号
	private String rcvPalletNo;
	//保税パレット番号
	private String taxPalletNo;
	//段ボール数
	private String caseQty;

	//商社搬入番号
	private String firmtransportCd;
	//BATJ製造月記号
	private String batjMfYm;
	//個装数量
	private String qty;
	//銘柄変更前銘柄コード
	private String lastItemCd;
	//銘柄変更前デザイン区分
	private String lastDesignCd;
	//段ボール有無フラグ
	private String caseFlg;

	//出庫関連リストキー
	private String shipListKey;
	//出庫指示行No
	private String shipOrderNo;
	//PLNo
	private String plNo;
	//出庫指示キー
	private String shipOrderKey;
	//出庫予定明細ID
	private String soDetailId;
	//出庫予定ID
	private String soId;

	public String getSkuCd() {
		return skuCd;
	}

	public void setSkuCd(String skuCd) {
		this.skuCd = skuCd;
	}

	public String getorderNumber() {
		return orderNumber;
	}

	public void setorderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getmachineNumber() {
		return machineNumber;
	}

	public void setmachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDistributionCd() {
		return distributionCd;
	}

	public void setDistributionCd(String distributionCd) {
		this.distributionCd = distributionCd;
	}

	public String getItfCd() {
		return itfCd;
	}

	public void setItfCd(String itfCd) {
		this.itfCd = itfCd;
	}

	public String getMachineCd() {
		return machineCd;
	}

	public void setMachineCd(String machineCd) {
		this.machineCd = machineCd;
	}

	public String getPalletLoadingKey() {
		return palletLoadingKey;
	}

	public void setPalletLoadingKey(String palletLoadingKey) {
		this.palletLoadingKey = palletLoadingKey;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public List<TSplitDetailData> getSplitDetailData() {
		return splitDetailData;
	}

	public void setSplitDetailData(List<TSplitDetailData> splitDetailData) {
		this.splitDetailData = splitDetailData;
	}

	public String getShipListKey() {
		return shipListKey;
	}

	public void setShipListKey(String shipListKey) {
		this.shipListKey = shipListKey;
	}

	public String getShipOrderNo() {
		return shipOrderNo;
	}

	public void setShipOrderNo(String shipOrderNo) {
		this.shipOrderNo = shipOrderNo;
	}

	public String getPlNo() {
		return plNo;
	}

	public void setPlNo(String plNo) {
		this.plNo = plNo;
	}

	public String getShipOrderKey() {
		return shipOrderKey;
	}

	public void setShipOrderKey(String shipOrderKey) {
		this.shipOrderKey = shipOrderKey;
	}

	public String getSoDetailId() {
		return soDetailId;
	}

	public void setSoDetailId(String soDetailId) {
		this.soDetailId = soDetailId;
	}

	public String getSoId() {
		return soId;
	}

	public void setSoId(String soId) {
		this.soId = soId;
	}

	public String getFactoryCd() {
		return factoryCd;
	}

	public void setFactoryCd(String factoryCd) {
		this.factoryCd = factoryCd;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getDestinationCd() {
		return destinationCd;
	}

	public void setDestinationCd(String destinationCd) {
		this.destinationCd = destinationCd;
	}

	public String getManufactureCd() {
		return manufactureCd;
	}

	public void setManufactureCd(String manufactureCd) {
		this.manufactureCd = manufactureCd;
	}

	public String getCreateNo() {
		return createNo;
	}

	public void setCreateNo(String createNo) {
		this.createNo = createNo;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getRcvKey() {
		return rcvKey;
	}

	public void setRcvKey(String rcvKey) {
		this.rcvKey = rcvKey;
	}

	public String getDesignCd() {
		return designCd;
	}

	public void setDesignCd(String designCd) {
		this.designCd = designCd;
	}

	public String getBarcodeValiant() {
		return barcodeValiant;
	}

	public void setBarcodeValiant(String barcodeValiant) {
		this.barcodeValiant = barcodeValiant;
	}

	public String getManufactureCenterNo() {
		return manufactureCenterNo;
	}

	public void setManufactureCenterNo(String manufactureCenterNo) {
		this.manufactureCenterNo = manufactureCenterNo;
	}

	public String getCasePackNo() {
		return casePackNo;
	}

	public void setCasePackNo(String casePackNo) {
		this.casePackNo = casePackNo;
	}

	public String getCasePackTime() {
		return casePackTime;
	}

	public void setCasePackTime(String casePackTime) {
		this.casePackTime = casePackTime;
	}

	public String getMakeTime() {
		return makeTime;
	}

	public void setMakeTime(String makeTime) {
		this.makeTime = makeTime;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getShipCd() {
		return shipCd;
	}

	public void setShipCd(String shipCd) {
		this.shipCd = shipCd;
	}

	public String getCarryOutDate() {
		return carryOutDate;
	}

	public void setCarryOutDate(String carryOutDate) {
		this.carryOutDate = carryOutDate;
	}

	public String getShipToCd() {
		return shipToCd;
	}

	public void setShipToCd(String shipToCd) {
		this.shipToCd = shipToCd;
	}

	public String getRcvDate() {
		return rcvDate;
	}

	public void setRcvDate(String rcvDate) {
		this.rcvDate = rcvDate;
	}

	public String getZzshType() {
		return zzshType;
	}

	public void setZzshType(String zzshType) {
		this.zzshType = zzshType;
	}

	public String getTplQty() {
		return tplQty;
	}

	public void setTplQty(String tplQty) {
		this.tplQty = tplQty;
	}

	public String getRcvPalletNo() {
		return rcvPalletNo;
	}

	public void setRcvPalletNo(String rcvPalletNo) {
		this.rcvPalletNo = rcvPalletNo;
	}

	public String getTaxPalletNo() {
		return taxPalletNo;
	}

	public void setTaxPalletNo(String taxPalletNo) {
		this.taxPalletNo = taxPalletNo;
	}

	public String getCaseQty() {
		return caseQty;
	}

	public void setCaseQty(String caseQty) {
		this.caseQty = caseQty;
	}

	public String getFirmtransportCd() {
		return firmtransportCd;
	}

	public void setFirmtransportCd(String firmtransportCd) {
		this.firmtransportCd = firmtransportCd;
	}

	public String getBatjMfYm() {
		return batjMfYm;
	}

	public void setBatjMfYm(String batjMfYm) {
		this.batjMfYm = batjMfYm;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getLastItemCd() {
		return lastItemCd;
	}

	public void setLastItemCd(String lastItemCd) {
		this.lastItemCd = lastItemCd;
	}

	public String getLastDesignCd() {
		return lastDesignCd;
	}

	public void setLastDesignCd(String lastDesignCd) {
		this.lastDesignCd = lastDesignCd;
	}

	public String getCaseFlg() {
		return caseFlg;
	}

	public void setCaseFlg(String caseFlg) {
		this.caseFlg = caseFlg;
	}

}
