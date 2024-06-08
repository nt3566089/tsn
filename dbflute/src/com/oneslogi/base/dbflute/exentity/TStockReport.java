package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTStockReport;

/**
 * The entity of t_stock_report.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockReport extends BsTStockReport {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TStock chaseTStock() {
		return _tStock != null ? _tStock : new TStock();
	}

	// ======================================================

    private Long _classDtlId;
    private String _classDtlCd;
    private String _locationCdFrom;
    private String _locationCdTo;
    private String _limitDtFrom;
    private String _limitDtTo;
    private String _limitDtNum;
    private Long _chargeNumDisplay;
    private Long _display;
    private Long _stockdisplayfld;
    private String _productCdOrder;
    private String _locationCdOrder;
    private String _dtAddLdn;
    private String _shippingLimitDt;
    // [Ver3.0] unit of measure対応 2017.11.28 駱 Start
    /** 商品単位 */
    private String productUnit;

    /** 入数内訳 */
    private String unitNumBreakdown;

    /** 在庫内訳 */
    private String stockBreakdown;

    /** 引当可能内訳 */
    private String chargeBreakdown;

    /** 引当済内訳 */
    private String allocBreakdown;

    /** 作業中内訳 */
    private String moveBreakdown;

    /** 積送中内訳 */
    private String transitBreakdown;

    /** 内訳 */
    private String breakdown;

    /** 入数 */
    private String stringUnitNum;

    /** 最小梱包単位 */
    private String minimumPackingUnit;
    // [Ver3.0] unit of measure対応 2017.11.28 駱 End

    public Long getClassDtlId() {
        return _classDtlId;
    }
    public void setClassDtlId(Long classDtlId) {
        this._classDtlId = classDtlId;
    }

    public String getClassDtlCd() {
        return _classDtlCd;
    }
    public void setClassDtlCd(String classDtlCd) {
        this._classDtlCd = classDtlCd;
    }

    public String getLocationCdFrom() {
        return _locationCdFrom;
    }
    public void setLocationCdFrom(String locationCd) {
        this._locationCdFrom = locationCd;
    }

    public String getLocationCdTo() {
        return _locationCdTo;
    }
    public void setLocationCdTo(String locationCd) {
        this._locationCdTo = locationCd;
    }

    public String getLimitDtFrom() {
        return _limitDtFrom;
    }
    public void setLimitDtFrom(String limitdt) {
        this._limitDtFrom = limitdt;
    }

    public String getLimitDtTo() {
        return _limitDtTo;
    }
    public void setLimitDtTo(String limitdt) {
        this._limitDtTo = limitdt;
    }

    public String getLimitDtNum() {
        return _limitDtNum;
    }
    public void setLimitDtNum(String limitdtNum) {
        this._limitDtNum = limitdtNum;
    }

    public Long getChargeNumDisplay() {
        return _chargeNumDisplay;
    }
    public void setChargeNumDisplay(Long chargeNumDisplay) {
        this._chargeNumDisplay = chargeNumDisplay;
    }

    public Long getDisplay() {
        return _display;
    }
    public void setDisplay(Long display) {
        this._display = display;
    }

    public Long getStockdisplayfld() {
        return _stockdisplayfld;
    }
    public void setStockdisplayfld(Long stockdisplayfld) {
        this._stockdisplayfld = stockdisplayfld;
    }

    public String getProductCdOrder() {
        return _productCdOrder;
    }
    public void setProductCdOrder(String productCdOrder) {
        this._productCdOrder = productCdOrder;
    }

    public String getLocationCdOrder() {
        return _locationCdOrder;
    }
    public void setLocationCdOrder(String locationCdOrder) {
        this._locationCdOrder = locationCdOrder;
    }

    public String getDtAddLdn() {
        return _dtAddLdn;
    }
    public void setDtAddLdn(String dtAddLdn) {
        this._dtAddLdn = dtAddLdn;
    }

    public String getShippingLimitDt() {
        return _shippingLimitDt;
    }
    public void setShippingLimitDt(String shippingLimitDt) {
        this._shippingLimitDt = shippingLimitDt;
    }

    // [Ver3.0] unit of measure対応 2017.11.28 駱 Start
    public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	public String getStockBreakdown() {
		return stockBreakdown;
	}

	public void setStockBreakdown(String stockBreakdown) {
		this.stockBreakdown = stockBreakdown;
	}

	public String getChargeBreakdown() {
		return chargeBreakdown;
	}

	public void setChargeBreakdown(String chargeBreakdown) {
		this.chargeBreakdown = chargeBreakdown;
	}

	public String getAllocBreakdown() {
		return allocBreakdown;
	}

	public void setAllocBreakdown(String allocBreakdown) {
		this.allocBreakdown = allocBreakdown;
	}

	public String getMoveBreakdown() {
		return moveBreakdown;
	}

	public void setMoveBreakdown(String moveBreakdown) {
		this.moveBreakdown = moveBreakdown;
	}

	public String getTransitBreakdown() {
		return transitBreakdown;
	}

	public void setTransitBreakdown(String transitBreakdown) {
		this.transitBreakdown = transitBreakdown;
	}

	public String getBreakdown() {
		return breakdown;
	}

	public void setBreakdown(String breakdown) {
		this.breakdown = breakdown;
	}

	public String getStringUnitNum() {
		return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
		this.stringUnitNum = stringUnitNum;
	}

	public String getMinimumPackingUnit() {
		return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
		this.minimumPackingUnit = minimumPackingUnit;
	}
    // [Ver3.0] unit of measure対応 2017.11.28 駱 End
}
