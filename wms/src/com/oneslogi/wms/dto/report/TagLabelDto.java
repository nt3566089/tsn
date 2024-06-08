package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * 荷札DTO(共通)
 */
public class TagLabelDto extends ReportDto implements Cloneable {

	/** 再印刷フラグ */
	private String reprintFlg;
	/** WMS出荷伝票No */
	private String shippingSlipNo;
	/** 顧客出荷指示No */
	private String clientShippingNo;
	/** 出荷梱包No */
	private String shippingPackingNo;
	/** 出荷梱包No略(下5桁) */
	private String shippingPackingNoAbbr;
	/** 出荷梱包No(バーコード) */
	private String shippingPackingNoBarcode;
	/** 梱包個数(個口分母) ※貨物追跡No単位 */
	private Integer packingNum;
	/** 梱包番号(個口分子) ※貨物追跡No単位 */
	private Integer packingIndex;
	/** 貨物追跡No */
	private String carrierTraceNum;
	/** 貨物追跡No(バーコード) */
	private String carrierTraceNumBarcode;
	/** 貨物追跡Noバーコード種別 */
	private String carrierTraceNumBarcodeType;
	/** 貨物追跡No採番単位 */
	private String carrierTraceNumNumberingUnit;
	/** 総重量(g) */
	private BigDecimal grossWeight;
	/** 総容積(mm3) */
	private BigDecimal totalVolume;
	/** 出庫作業No */
	private String pickingWorkNo;
	/** 出庫作業No略(下5桁) */
	private String pickingWorkNoAbbr;
	/** 届先単位No */
	private String delivUnitNo;
	/** 届先単位No略(下5桁) */
	private String delivUnitNoAbbr;
	/** 出荷日 */
	private String shippingDt;
	/** 納品予定日 */
	private String delivPlanDt;
	/** 納品指定日 */
	private String delivDt;
	/** 納品時間帯 */
	private String delivTz;
	/** 納品時間帯表示名 */
	private String delivTzNm;
	/** 納品先CD */
	private String supplyCustomerCd;
	/** 納品先名称 */
	private String supplyCustomerNm;
	/** 届先CD */
	private String delivCustomerCd;
	/** 届先郵便番号 */
	private String delivZipCd;
	/** 届先住所(総合) */
	private String delivAddress;
	/** 届先住所１ */
	private String delivAddress1;
	/** 届先住所２ */
	private String delivAddress2;
	/** 届先住所３ */
	private String delivAddress3;
	/** 届先住所補足 */
	private String delivAddressSupply;
	/** 届先名称 */
	private String delivCustomerNm;
	/** 届先電話番号 */
	private String delivTelNo;
	/** センタ名称 */
	private String centerNm;
	/** センタ電話番号 */
	private String centerTelNo;
	/** センタ郵便番号 */
	private String centerZipCd;
	/** センタ住所(総合) */
	private String centerAddress;
	/** センタ住所１ */
	private String centerAddress1;
	/** センタ住所２ */
	private String centerAddress2;
	/** センタ住所３ */
	private String centerAddress3;
	/** 荷主名称 */
	private String clientNm;
	/** 配送コースCD */
	private String deliveryCourseCd;
	/** 配送コース名称 */
	private String deliveryCourseNm;
	/** 運送業者CD */
	private String carrierCd;
	/** 運送業者名称 */
	private String carrierNm;
	/** 着店CD */
	private String arrivalStoreCd;
	/** 着店CD(バーコード) */
	private String arrivalStoreCdBarcode;
	// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma Start
	/** 着店CD(バーコード)文字 */
	private String arrivalStoreCdBarcodeText;
	// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma End
	/** 着店CDバーコード種別 */
	private String arrivalStoreCdBarcodeType;
	/** 着店名称 */
	private String arrivalStoreNm;
	/** 荷材サイズCD */
	private String boxSizeCd;
	/** 荷材名称 */
	private String boxNm;
	/** 代引請求金額 */
	private Long cod;
	/** 代引消費税 */
	private Long codTax;
	/** 納品書在中フラグ */
	private String tagDeliveryOutFlg;
	/** 1枚目フラグ */
	private String isFirst;
	/** 梱包計算処理区分 */
	private String packingCalCls;
	/** 混載フラグ */
	private String mixedFlg;

	@Override
	public TagLabelDto clone() {

		TagLabelDto cloneDto;
		try {
			cloneDto = (TagLabelDto) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}

		return cloneDto;
	}

	// ===== 以下、ゲッタ・セッタ =====

	public String getReprintFlg() {
		return reprintFlg;
	}

	public void setReprintFlg(String reprintFlg) {
		this.reprintFlg = reprintFlg;
	}

	public String getShippingSlipNo() {
		return shippingSlipNo;
	}

	public void setShippingSlipNo(String shippingSlipNo) {
		this.shippingSlipNo = shippingSlipNo;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public String getShippingPackingNo() {
		return shippingPackingNo;
	}

	public void setShippingPackingNo(String shippingPackingNo) {
		this.shippingPackingNo = shippingPackingNo;
	}

	public String getShippingPackingNoAbbr() {
		return shippingPackingNoAbbr;
	}

	public void setShippingPackingNoAbbr(String shippingPackingNoAbbr) {
		this.shippingPackingNoAbbr = shippingPackingNoAbbr;
	}

	public String getShippingPackingNoBarcode() {
		return shippingPackingNoBarcode;
	}

	public void setShippingPackingNoBarcode(String shippingPackingNoBarcode) {
		this.shippingPackingNoBarcode = shippingPackingNoBarcode;
	}

	public Integer getPackingNum() {
		return packingNum;
	}

	public void setPackingNum(Integer packingNum) {
		this.packingNum = packingNum;
	}

	public Integer getPackingIndex() {
		return packingIndex;
	}

	public void setPackingIndex(Integer packingIndex) {
		this.packingIndex = packingIndex;
	}

	public String getCarrierTraceNum() {
		return carrierTraceNum;
	}

	public void setCarrierTraceNum(String carrierTraceNum) {
		this.carrierTraceNum = carrierTraceNum;
	}

	public String getCarrierTraceNumBarcode() {
		return carrierTraceNumBarcode;
	}

	public void setCarrierTraceNumBarcode(String carrierTraceNumBarcode) {
		this.carrierTraceNumBarcode = carrierTraceNumBarcode;
	}

	public String getCarrierTraceNumBarcodeType() {
		return carrierTraceNumBarcodeType;
	}

	public void setCarrierTraceNumBarcodeType(String carrierTraceNumBarcodeType) {
		this.carrierTraceNumBarcodeType = carrierTraceNumBarcodeType;
	}

	public String getCarrierTraceNumNumberingUnit() {
		return carrierTraceNumNumberingUnit;
	}

	public void setCarrierTraceNumNumberingUnit(String carrierTraceNumNumberingUnit) {
		this.carrierTraceNumNumberingUnit = carrierTraceNumNumberingUnit;
	}

	public BigDecimal getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}

	public BigDecimal getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(BigDecimal totalVolume) {
		this.totalVolume = totalVolume;
	}

	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	public String getPickingWorkNoAbbr() {
		return pickingWorkNoAbbr;
	}

	public void setPickingWorkNoAbbr(String pickingWorkNoAbbr) {
		this.pickingWorkNoAbbr = pickingWorkNoAbbr;
	}

	public String getDelivUnitNo() {
		return delivUnitNo;
	}

	public void setDelivUnitNo(String delivUnitNo) {
		this.delivUnitNo = delivUnitNo;
	}

	public String getDelivUnitNoAbbr() {
		return delivUnitNoAbbr;
	}

	public void setDelivUnitNoAbbr(String delivUnitNoAbbr) {
		this.delivUnitNoAbbr = delivUnitNoAbbr;
	}

	public String getShippingDt() {
		return shippingDt;
	}

	public void setShippingDt(String shippingDt) {
		this.shippingDt = shippingDt;
	}

	public String getDelivPlanDt() {
		return delivPlanDt;
	}

	public void setDelivPlanDt(String delivPlanDt) {
		this.delivPlanDt = delivPlanDt;
	}

	public String getDelivDt() {
		return delivDt;
	}

	public void setDelivDt(String delivDt) {
		this.delivDt = delivDt;
	}

	public String getDelivTz() {
		return delivTz;
	}

	public void setDelivTz(String delivTz) {
		this.delivTz = delivTz;
	}

	public String getDelivTzNm() {
		return delivTzNm;
	}

	public void setDelivTzNm(String delivTzNm) {
		this.delivTzNm = delivTzNm;
	}

	public String getSupplyCustomerCd() {
		return supplyCustomerCd;
	}

	public void setSupplyCustomerCd(String supplyCustomerCd) {
		this.supplyCustomerCd = supplyCustomerCd;
	}

	public String getSupplyCustomerNm() {
		return supplyCustomerNm;
	}

	public void setSupplyCustomerNm(String supplyCustomerNm) {
		this.supplyCustomerNm = supplyCustomerNm;
	}

	public String getDelivCustomerCd() {
		return delivCustomerCd;
	}

	public void setDelivCustomerCd(String delivCustomerCd) {
		this.delivCustomerCd = delivCustomerCd;
	}

	public String getDelivZipCd() {
		return delivZipCd;
	}

	public void setDelivZipCd(String delivZipCd) {
		this.delivZipCd = delivZipCd;
	}

	public String getDelivAddress() {
		return delivAddress;
	}

	public void setDelivAddress(String delivAddress) {
		this.delivAddress = delivAddress;
	}

	public String getDelivAddress1() {
		return delivAddress1;
	}

	public void setDelivAddress1(String delivAddress1) {
		this.delivAddress1 = delivAddress1;
	}

	public String getDelivAddress2() {
		return delivAddress2;
	}

	public void setDelivAddress2(String delivAddress2) {
		this.delivAddress2 = delivAddress2;
	}

	public String getDelivAddress3() {
		return delivAddress3;
	}

	public void setDelivAddress3(String delivAddress3) {
		this.delivAddress3 = delivAddress3;
	}

	public String getDelivAddressSupply() {
		return delivAddressSupply;
	}

	public void setDelivAddressSupply(String delivAddressSupply) {
		this.delivAddressSupply = delivAddressSupply;
	}

	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}

	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}

	public String getDelivTelNo() {
		return delivTelNo;
	}

	public void setDelivTelNo(String delivTelNo) {
		this.delivTelNo = delivTelNo;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getCenterTelNo() {
		return centerTelNo;
	}

	public void setCenterTelNo(String centerTelNo) {
		this.centerTelNo = centerTelNo;
	}

	public String getCenterZipCd() {
		return centerZipCd;
	}

	public void setCenterZipCd(String centerZipCd) {
		this.centerZipCd = centerZipCd;
	}

	public String getCenterAddress() {
		return centerAddress;
	}

	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}

	public String getCenterAddress1() {
		return centerAddress1;
	}

	public void setCenterAddress1(String centerAddress1) {
		this.centerAddress1 = centerAddress1;
	}

	public String getCenterAddress2() {
		return centerAddress2;
	}

	public void setCenterAddress2(String centerAddress2) {
		this.centerAddress2 = centerAddress2;
	}

	public String getCenterAddress3() {
		return centerAddress3;
	}

	public void setCenterAddress3(String centerAddress3) {
		this.centerAddress3 = centerAddress3;
	}

	public String getClientNm() {
		return clientNm;
	}

	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}

	public String getDeliveryCourseCd() {
		return deliveryCourseCd;
	}

	public void setDeliveryCourseCd(String deliveryCourseCd) {
		this.deliveryCourseCd = deliveryCourseCd;
	}

	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}

	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}

	public String getCarrierNm() {
		return carrierNm;
	}

	public void setCarrierNm(String carrierNm) {
		this.carrierNm = carrierNm;
	}

	public String getArrivalStoreCd() {
		return arrivalStoreCd;
	}

	public void setArrivalStoreCd(String arrivalStoreCd) {
		this.arrivalStoreCd = arrivalStoreCd;
	}

	public String getArrivalStoreCdBarcode() {
		return arrivalStoreCdBarcode;
	}

	public void setArrivalStoreCdBarcode(String arrivalStoreCdBarcode) {
		this.arrivalStoreCdBarcode = arrivalStoreCdBarcode;
	}

	// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma Start
	public String getArrivalStoreCdBarcodeText() {
		return arrivalStoreCdBarcodeText;
	}

	public void setArrivalStoreCdBarcodeText(String arrivalStoreCdBarcodeText) {
		this.arrivalStoreCdBarcodeText = arrivalStoreCdBarcodeText;
	}
	// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma End

	public String getArrivalStoreCdBarcodeType() {
		return arrivalStoreCdBarcodeType;
	}

	public void setArrivalStoreCdBarcodeType(String arrivalStoreCdBarcodeType) {
		this.arrivalStoreCdBarcodeType = arrivalStoreCdBarcodeType;
	}

	public String getArrivalStoreNm() {
		return arrivalStoreNm;
	}

	public void setArrivalStoreNm(String arrivalStoreNm) {
		this.arrivalStoreNm = arrivalStoreNm;
	}

	public String getBoxSizeCd() {
		return boxSizeCd;
	}

	public void setBoxSizeCd(String boxSizeCd) {
		this.boxSizeCd = boxSizeCd;
	}

	public String getBoxNm() {
		return boxNm;
	}

	public void setBoxNm(String boxNm) {
		this.boxNm = boxNm;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public Long getCodTax() {
		return codTax;
	}

	public void setCodTax(Long codTax) {
		this.codTax = codTax;
	}

	public String getTagDeliveryOutFlg() {
		return tagDeliveryOutFlg;
	}

	public void setTagDeliveryOutFlg(String tagDeliveryOutFlg) {
		this.tagDeliveryOutFlg = tagDeliveryOutFlg;
	}

	public String getIsFirst() {
		return isFirst;
	}

	public void setIsFirst(String isFirst) {
		this.isFirst = isFirst;
	}

	public String getPackingCalCls() {
		return packingCalCls;
	}

	public void setPackingCalCls(String packingCalCls) {
		this.packingCalCls = packingCalCls;
	}

	public String getMixedFlg() {
		return mixedFlg;
	}

	public void setMixedFlg(String mixedFlg) {
		this.mixedFlg = mixedFlg;
	}
}
