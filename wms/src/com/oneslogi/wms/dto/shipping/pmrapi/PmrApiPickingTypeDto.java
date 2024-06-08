package com.oneslogi.wms.dto.shipping.pmrapi;

import java.math.BigDecimal;
import java.util.List;

public class PmrApiPickingTypeDto {

	private Integer batchNo;
	private String breakKey;
	private Integer type;
	private BigDecimal workVolume;
	private Integer packingNum;
	private List<String> slipNo;
	private List<PmrApiCartDto> cartList;

	// ===== 以下、ゲッタ/セッタ =====

	public Integer getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
	}

	public String getBreakKey() {
		return breakKey;
	}

	public void setBreakKey(String breakKey) {
		this.breakKey = breakKey;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BigDecimal getWorkVolume() {
		return workVolume;
	}

	public void setWorkVolume(BigDecimal workVolume) {
		this.workVolume = workVolume;
	}

	public Integer getPackingNum() {
		return packingNum;
	}

	public void setPackingNum(Integer packingNum) {
		this.packingNum = packingNum;
	}

	public List<String> getSlipNo() {
		return slipNo;
	}

	public void setSlipNo(List<String> slipNo) {
		this.slipNo = slipNo;
	}

	public List<PmrApiCartDto> getCartList() {
		return cartList;
	}

	public void setCartList(List<PmrApiCartDto> cartList) {
		this.cartList = cartList;
	}
}
