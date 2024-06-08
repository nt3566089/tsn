package com.oneslogi.base.dbflute.exentity;

import java.sql.Timestamp;

import com.oneslogi.base.dbflute.bsentity.BsTShippingInstH;

/**
 * The entity of T_SHIPPING_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstH extends BsTShippingInstH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomerBySupplyCustomerId() {
		return _mCustomerBySupplyCustomerId != null ? _mCustomerBySupplyCustomerId : new MCustomer();
	}

	public MDeliveryCourse chaseMDeliveryCourse() {
		return _mDeliveryCourse != null ? _mDeliveryCourse : new MDeliveryCourse();
	}

	public TAllocInstH chaseTAllocInstH() {
		return _tAllocInstH != null ? _tAllocInstH : new TAllocInstH();
	}

	// ======================================================

	// ===== 導出カラム =====

	// 出荷日/作業日
	long shippingWorkDtFlg = 0;

	//add by wangsm 20140725 start

	//出荷日(From)
	private String shippingDtFrom;

	//出荷日(To)
	private String shippingDtTo;

	//未出荷全件
	private Integer noAllcDisplayFlg;

	//運送業者
	private String carrierCd;

	//エラーメッセージ
	private String headMessageNm;

	//配送コース名称
	private String deliveryCourseNm;

	//納品先CD
	private String customerCd;

	//納品先名称
	private String customerNm;

	//作業日/出荷日
	private String takingShippingFlg;

	//日付(From)
	private String dtFrom;

	//日付(To)
	private String dtTo;

	//商品CD
	private String productCd;

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutFlg削除) 2018.07.23 kawana Delete

	//出庫作業No.
	private String pickingWorkNo;

	//add by wangsm 20140725 end

	//処理区分CD
	private String processTypeCd;

	//作業日(From)
	private String workDtFrom;

	//作業日(To)
	private String workDtTo;

	//欠品有無のみ
	private String noStockOutFlg;

	//キャンセルデータ表示
	private String cancelDisplay;

	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
	//作業メッセージ有無
	private String pickingWorkMessageFlg;
	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End

	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu Start
	// 預託
	private String depositCustomerCd;

	// ユーザCD
	private String referenceUserCd;
	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu End

	private String chkErrorShow;

	private String emergencyFlgNm;

	private long receiveId;

	private String errorProcessMet;

	private String delivTzNm;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====
	public String getDelivTzNm() {
		return delivTzNm;
	}

	public void setDelivTzNm(String delivTzNm) {
		this.delivTzNm = delivTzNm;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public String getEmergencyFlgNm() {
		return emergencyFlgNm;
	}

	public long getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(long receiveId) {
		this.receiveId = receiveId;
	}

	public void setEmergencyFlgNm(String emergencyFlgNm) {
		this.emergencyFlgNm = emergencyFlgNm;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public long getShippingWorkDtFlg() {
		return shippingWorkDtFlg;
	}

	public void setShippingWorkDtFlg(long shippingWorkDtFlg) {
		this.shippingWorkDtFlg = shippingWorkDtFlg;
	}

	public String getShippingDtFrom() {
		return shippingDtFrom;
	}

	public void setShippingDtFrom(String shippingDtFrom) {
		this.shippingDtFrom = shippingDtFrom;
	}

	public String getShippingDtTo() {
		return shippingDtTo;
	}

	public void setShippingDtTo(String shippingDtTo) {
		this.shippingDtTo = shippingDtTo;
	}

	public Integer getNoAllcDisplayFlg() {
		return noAllcDisplayFlg;
	}

	public void setNoAllcDisplayFlg(Integer noAllcDisplayFlg) {
		this.noAllcDisplayFlg = noAllcDisplayFlg;
	}

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}

	public String getHeadMessageNm() {
		return headMessageNm;
	}

	public void setHeadMessageNm(String headMessageNm) {
		this.headMessageNm = headMessageNm;
	}

	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getTakingShippingFlg() {
		return takingShippingFlg;
	}

	public void setTakingShippingFlg(String takingShippingFlg) {
		this.takingShippingFlg = takingShippingFlg;
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

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}

	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}

	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	public String getWorkDtFrom() {
		return workDtFrom;
	}

	public void setWorkDtFrom(String workDtFrom) {
		this.workDtFrom = workDtFrom;
	}

	public String getWorkDtTo() {
		return workDtTo;
	}

	public void setWorkDtTo(String workDtTo) {
		this.workDtTo = workDtTo;
	}

	public static final String ALIAS_maxUpdDt = "MAX_UPD_DT";
	private Timestamp maxUpdDt;

	public Timestamp getMaxUpdDt() {
		return maxUpdDt;
	}

	public void setMaxUpdDt(Timestamp maxUpdDt) {
		this.maxUpdDt = maxUpdDt;
	}

	public String getNoStockOutFlg() {
		return noStockOutFlg;
	}

	public void setNoStockOutFlg(String noStockOutFlg) {
		this.noStockOutFlg = noStockOutFlg;
	}

	public String getCancelDisplay() {
		return cancelDisplay;
	}

	public void setCancelDisplay(String cancelDisplay) {
		this.cancelDisplay = cancelDisplay;
	}

	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
	public String getPickingWorkMessageFlg() {
		return pickingWorkMessageFlg;
	}

	public void setPickingWorkMessageFlg(String pickingWorkMessageFlg) {
		this.pickingWorkMessageFlg = pickingWorkMessageFlg;
	}
	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End

	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu Start
	public String getDepositCustomerCd() {
		return depositCustomerCd;
	}

	public void setDepositCustomerCd(String depositCustomerCd) {
		this.depositCustomerCd = depositCustomerCd;
	}

	public String getReferenceUserCd() {
		return referenceUserCd;
	}

	public void setReferenceUserCd(String referenceUserCd) {
		this.referenceUserCd = referenceUserCd;
	}
	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu End
}
