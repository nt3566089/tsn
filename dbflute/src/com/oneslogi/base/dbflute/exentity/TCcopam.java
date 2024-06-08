package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTCcopam;

/**
 * The entity of T_CCOPAM.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TCcopam extends BsTCcopam {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;
    
    /** 倉庫区分  */
    private String warehouseCls;
    
    /** 拠点CD  */
    private String centerCd;
    
    /** 荷主CD  */
    private String clientCd;
    
    /** 合計数  */
    private BigDecimal sum;
    
    /** 個数  */
    private BigDecimal no;
    
    /** 着地  */
    private String landing;
    
    /** 合計パレット数  */
    private BigDecimal rcvSumQty1Pallet;
    
	public BigDecimal getRcvSumQty1Pallet() {
		return rcvSumQty1Pallet;
	}

	public void setRcvSumQty1Pallet(BigDecimal rcvSumQty1Pallet) {
		this.rcvSumQty1Pallet = rcvSumQty1Pallet;
	}

	public String getLanding() {
		return landing;
	}

	public void setLanding(String landing) {
		this.landing = landing;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public BigDecimal getNo() {
		return no;
	}

	public void setNo(BigDecimal no) {
		this.no = no;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public String getWarehouseCls() {
		return warehouseCls;
	}

	public void setWarehouseCls(String warehouseCls) {
		this.warehouseCls = warehouseCls;
	}
}
