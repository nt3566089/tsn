package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTPackingH;

/**
 * The entity of t_packing_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingH extends BsTPackingH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public BUser chaseBUserByUpdUser() {
		return _bUserByUpdUser != null ? _bUserByUpdUser : new BUser();
	}

	public MBox chaseMBox() {
		return _mBox != null ? _mBox : new MBox();
	}

	public TAllocInstH chaseTAllocInstH() {
		return _tAllocInstH != null ? _tAllocInstH : new TAllocInstH();
	}

	public TPackingR chaseTPackingRAsOne() {
		return _tPackingRAsOne != null ? _tPackingRAsOne : new TPackingR();
	}

	public TPickingH chaseTPickingH() {
		return _tPickingH != null ? _tPickingH : new TPickingH();
	}

	// ======================================================

	//発行条件
	private String printCondition;

	//作業日/出荷日/納品日
	private String takingShippingDtFlg;

	//日付(From)
	private String dtFrom;

	//日付(To)
	private String dtTo;

	//顧客出荷指示№
	private String clientShippingNo;

	//配送コースCD
	private String deliveryCourseCd;

	//配送コース名
	private String deliveryCourseNm;

	//運送業者CD
	private String carrierCd;

	//納品先名
	private String supplyCustomerNm;

	//届先名
	private String delivCustomerNm;

    // [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  Start
	// 出庫指示バッチNo.
	public static final String ALIAS_pickingBatchNo = "PICKING_BATCH_NO";
	protected String pickingBatchNo;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  End

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start

	public static final String ALIAS_shippingInstHCount = "SHIPPING_INST_H_COUNT";
	protected String shippingInstHCount;

	public static final String ALIAS_minCarrierTraceNum = "MIN_CARRIER_TRACE_NUM";
	protected String minCarrierTraceNum;

	public static final String ALIAS_maxCod = "MAX_COD";
	protected String maxCod;

	public static final String ALIAS_maxCodTax = "MAX_COD_TAX";
	protected String maxCodTax;

	public static final String ALIAS_packingHCount = "PACKING_H_COUNT";
	protected int packingHCount;
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	// [1.1.4-CT-079] バケット計算を変更(不要になった変数を削除) 2016.06.13 kawana

	public String getTakingShippingDtFlg() {
		return takingShippingDtFlg;
	}

	public void setTakingShippingDtFlg(String takingShippingDtFlg) {
		this.takingShippingDtFlg = takingShippingDtFlg;
	}

	public String getDtFrom() {
		return dtFrom;
	}

	public void setDtFrom(String dtFrom) {
		this.dtFrom = dtFrom;
	}

	public String getDtTo() {
		return dtTo;
	}

	public void setDtTo(String dtTo) {
		this.dtTo = dtTo;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
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

	public String getSupplyCustomerNm() {
		return supplyCustomerNm;
	}

	public void setSupplyCustomerNm(String supplyCustomerNm) {
		this.supplyCustomerNm = supplyCustomerNm;
	}

	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}

	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}

	public String getPickingBatchNo() {
		return pickingBatchNo;
	}

	public void setPickingBatchNo(String pickingBatchNo) {
		this.pickingBatchNo = pickingBatchNo;
	}

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
	public String getShippingInstHCount() {
		return shippingInstHCount;
	}

	public void setShippingInstHCount(String shippingInstHCount) {
		this.shippingInstHCount = shippingInstHCount;
	}

	public String getMinCarrierTraceNum() {
		return minCarrierTraceNum;
	}

	public void setMinCarrierTraceNum(String minCarrierTraceNum) {
		this.minCarrierTraceNum = minCarrierTraceNum;
	}

	public String getMaxCodTax() {
		return maxCodTax;
	}

	public void setMaxCodTax(String maxCodTax) {
		this.maxCodTax = maxCodTax;
	}

	public String getMaxCod() {
		return maxCod;
	}

	public void setMaxCod(String maxCod) {
		this.maxCod = maxCod;
	}

	public String getPrintCondition() {
		return printCondition;
	}

	public int getPackingHCount() {
		return packingHCount;
	}

	public void setPackingHCount(int packingHCount) {
		this.packingHCount = packingHCount;
	}

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End

}
