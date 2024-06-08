package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTAllocInstH;

/**
 * The entity of T_ALLOC_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstH extends BsTAllocInstH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomerBySupplyCustomerId() {
		return _mCustomerBySupplyCustomerId != null ? _mCustomerBySupplyCustomerId : new MCustomer();
	}

	public MCenterCustomer chaseMCenterCustomerByDelivCustomerId() {
		return _mCenterCustomerByDelivCustomerId != null ? _mCenterCustomerByDelivCustomerId : new MCenterCustomer();
	}

	public MCenterCustomer chaseMCenterCustomerBySupplyCustomerId() {
		return _mCenterCustomerBySupplyCustomerId != null ? _mCenterCustomerBySupplyCustomerId : new MCenterCustomer();
	}

	public MDeliveryCourse chaseMDeliveryCourse() {
		return _mDeliveryCourse != null ? _mDeliveryCourse : new MDeliveryCourse();
	}

	public TPickingH chaseTPickingH() {
		return _tPickingH != null ? _tPickingH : new TPickingH();
	}

	// ======================================================

	// 出荷日From
	private String shippingDtFrom;

	// 出荷日To
	private String shippingDtTo;

	private boolean _isChanged;

	//データ種別
	private String tagType;

	public boolean isIsChanged() {
		return _isChanged;
	}

	// 作業日From
	private String workDtFrom;

	// 作業日To
	private String workDtTo;

	// レスポンス対策 2016.01.26 kawana Start
	// 緊急フラグ
	private int emergencyFlg;
	// レスポンス対策 2016.01.26 kawana End

	// 顧客出荷指示No.
	public static final String ALIAS_clientShippingNo = "CLIENT_SHIPPING_NO";
	protected String clientShippingNo;

	// 梱包数(梱包ヘッダ数)
	public static final String ALIAS_packingCount = "PACKING_COUNT";
	protected Integer packingCount;

	// 出庫指示バッチNo.
	public static final String ALIAS_pickingBatchNo = "PICKING_BATCH_NO";
	protected String pickingBatchNo;

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
	// 代引請求額
	public static final String ALIAS_cod = "COD";
	protected Long cod;

	/**
	 * @return the cod
	 */
	public Long getCod() {
		return cod;
	}

	/**
	 * @param cod the cod to set
	 */
	public void setCod(Long cod) {
		this.cod = cod;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  End

	public void setIsChanged(boolean isChanged) {
		this._isChanged = isChanged;
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

	public String getTagType() {
		return tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
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

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public Integer getPackingCount() {
		return packingCount;
	}

	public void setPackingCount(Integer packingCount) {
		this.packingCount = packingCount;
	}

	public String getPickingBatchNo() {
		return pickingBatchNo;
	}

	public void setPickingBatchNo(String pickingBatchNo) {
		this.pickingBatchNo = pickingBatchNo;
	}

	/**
	 * @return emergencyFlg
	 */
	public int getEmergencyFlg() {
		return emergencyFlg;
	}
}
