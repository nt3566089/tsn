package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTPackingHDto;

/**
 * The entity of t_packing_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingHDto extends BsTPackingHDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

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
	protected String pickingBatchNo;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  End

	public String getPrintCondition() {
		return printCondition;
	}

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

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

}
