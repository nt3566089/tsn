package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTAllocInstHDto;

/**
 * The entity of T_ALLOC_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TAllocInstHDto extends BsTAllocInstHDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// 出荷日From
	private String shippingDtFrom;

	// 出荷日To
	private String shippingDtTo;

	// 作業日(From)
	private String workDtFrom;

	// 作業日(To)
	private String workDtTo;

	private boolean isChanged;

	// 顧客出荷指示No.
	protected String clientShippingNo;

	// 梱包数(梱包ヘッダ数)
	protected Integer packingCount;

	// 出庫指示バッチNo.
	protected String pickingBatchNo;

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/28  Start
	// 代引請求額
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

	public boolean isIsChanged() {
		return isChanged;
	}

	public void setIsChanged(boolean isChanged) {
		this.isChanged = isChanged;
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

}
