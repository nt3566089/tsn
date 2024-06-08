package com.oneslogi.wms.dto.shipping.pmrapi;

import java.math.BigDecimal;

public class PmrApiSendParameterDto {

	/** トータルピック使用フラグ */
	private Integer totalFlg;
	/** マルチピック使用フラグ */
	private Integer multiFlg;
	/** 単行ピック使用フラグ */
	private Integer singleRowFlg;
	/** 単行ピック上限数 */
	private Integer singleRowMaxNum;
	/** カートバケット数 */
	private Integer cartBacketNum;

	/** トータルピック 仕事量掛率 */
	private BigDecimal totalRate;
	/** 種蒔き 仕事量掛率 */
	private BigDecimal seedingRate;
	/** 摘み取り 仕事量掛率 */
	private BigDecimal pickingRate;
	/** マルチピック 仕事量掛率 */
	private BigDecimal multiRate;
	/** マルチピック(種蒔き) 仕事量掛率 */
	private BigDecimal multiSeedingRate;
	/** 単行ピック(トータル) 仕事量掛率 */
	private BigDecimal singleRowTotalRate;
	/** 単行ピック(種蒔き) 仕事量掛率 */
	private BigDecimal singleRowSeedingRate;

	/** トータルピッキングロケーション抽出率 */
	private BigDecimal minsupport;

	// ===== 以下、ゲッタとセッタ =====

	public Integer getTotalFlg() {
		return totalFlg;
	}

	public void setTotalFlg(Integer totalFlg) {
		this.totalFlg = totalFlg;
	}

	public Integer getMultiFlg() {
		return multiFlg;
	}

	public void setMultiFlg(Integer multiFlg) {
		this.multiFlg = multiFlg;
	}

	public Integer getSingleRowFlg() {
		return singleRowFlg;
	}

	public void setSingleRowFlg(Integer singleRowFlg) {
		this.singleRowFlg = singleRowFlg;
	}

	public Integer getSingleRowMaxNum() {
		return singleRowMaxNum;
	}

	public void setSingleRowMaxNum(Integer singleRowMaxNum) {
		this.singleRowMaxNum = singleRowMaxNum;
	}

	public Integer getCartBacketNum() {
		return cartBacketNum;
	}

	public void setCartBacketNum(Integer cartBacketNum) {
		this.cartBacketNum = cartBacketNum;
	}

	public BigDecimal getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(BigDecimal totalRate) {
		this.totalRate = totalRate;
	}

	public BigDecimal getSeedingRate() {
		return seedingRate;
	}

	public void setSeedingRate(BigDecimal seedingRate) {
		this.seedingRate = seedingRate;
	}

	public BigDecimal getPickingRate() {
		return pickingRate;
	}

	public void setPickingRate(BigDecimal pickingRate) {
		this.pickingRate = pickingRate;
	}

	public BigDecimal getMultiRate() {
		return multiRate;
	}

	public void setMultiRate(BigDecimal multiRate) {
		this.multiRate = multiRate;
	}

	public BigDecimal getMultiSeedingRate() {
		return multiSeedingRate;
	}

	public void setMultiSeedingRate(BigDecimal multiSeedingRate) {
		this.multiSeedingRate = multiSeedingRate;
	}

	public BigDecimal getSingleRowTotalRate() {
		return singleRowTotalRate;
	}

	public void setSingleRowTotalRate(BigDecimal singleRowTotalRate) {
		this.singleRowTotalRate = singleRowTotalRate;
	}

	public BigDecimal getSingleRowSeedingRate() {
		return singleRowSeedingRate;
	}

	public void setSingleRowSeedingRate(BigDecimal singleRowSeedingRate) {
		this.singleRowSeedingRate = singleRowSeedingRate;
	}

	public BigDecimal getMinsupport() {
		return minsupport;
	}

	public void setMinsupport(BigDecimal minsupport) {
		this.minsupport = minsupport;
	}
}
