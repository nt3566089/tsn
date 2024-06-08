package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTInventoryBDto;

/**
 * The entity of T_INVENTORY_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryBDto extends BsTInventoryBDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 差異数 */
    private BigDecimal numDiff;

    /** 差異数ソート */
    private BigDecimal numDiffSort;

    /** プラス/マイナス区分 */
    private Long plusMinusType;

    /** 棚卸数の合計 */
    private BigDecimal inventoryNumSum;

    /** 引当可能数の合計 */
    private BigDecimal chargeNumSum;

    /** 棚卸ケース数 */
    private BigDecimal inventoryCaseNum;

    /** 引当可能ケース数 */
    private BigDecimal chargeCaseNum;

    /** 商品単位合計ソート */
    private BigDecimal productSort;

    /** 棚卸前ピース数 */
    private BigDecimal pieceQtyB;

    /** 棚卸前ケース数 */
    private BigDecimal caseQtyB;

    /** 現時点ピース数 */
    private BigDecimal pieceQtyN;

    /** 現時点ケース数 */
    private BigDecimal caseQtyN;

    /** 棚卸ピース数 */
    private BigDecimal pieceQty;

    /** 棚卸ケース数 */
    private BigDecimal caseQty;

	// [#2799][#3116][Ver3.0] unit of measure 対応 2017.12.19 honma Add Start
	/** 商品単位 */
	private String productUnit;

	/** 入数内訳 */
	private String unitNumBreakdown;

	/** 棚卸前引当可能数内訳 */
	private String chargeNumBreakdown;
	// [#2799][#3116][Ver3.0] unit of measure 対応 2017.12.19 honma Add End

    // [Ver3.0] unit of measure対応 2017.11.22 駱 Add Start
    /** 棚卸内訳 */
    private String inventoryBeforeBreakdown;

    /** 棚卸前内訳 */
    private String inventoryBreakdown;
    // [Ver3.0] unit of measure対応 2017.11.22 駱 Add End

    //[Ver3.0] unit of measure対応 2017.11.22 ライ Add Start
    /**現時点内訳*/
    private String breakdownN;

    //[Ver3.0] unit of measure対応 2017.11.22 ライ Add END

    // [Ver3.0] unit of measure対応 2017.11.29 REN Start

    //在庫内訳
    private String stockBreakdown;
    // [Ver3.0] unit of measure対応 2017.11.29 REN End

    /** 現時点調整可能数 */
    private BigDecimal adjQty;

    /** 棚卸差異数 */
    private BigDecimal diffQty;

    /** 棚卸数量備考 */
    private BigDecimal oldInventoryNum;

    /** 進捗率 */
    private Long inventroyParcent;

 /** 棚卸ピース数 */
    private BigDecimal inventoryPieceNum;

    /** 棚卸前ピース数 */
    private BigDecimal inventoryBeforePieceNum;

    /** 棚卸前ケース数 */
    private BigDecimal inventoryBeforeCaseNum;

    /** SUM現時点調整可能数 */
    private BigDecimal sumadjQty;

    /** SUM棚卸差異数 */
    private BigDecimal sumdiffQty;

    /** 在庫調整フラグ */
    private String stockAdjustFlgShow;

   // [Ver3.0] unit of measure対応 2017.11.27 HDIS Start
 	//入数
 	private String stringUnitNum;

 	//内訳
 	private String breakdown;

 	//最小梱包単位
 	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.27 HDIS End


	// ===== 以下Eclipse自動生成のアクセサメソッド =====
	/**
	 * @return numDif
	 */
	public BigDecimal getNumDiff() {
		return numDiff;
	}

	/**
	 * @param numDiff セットする numDiff
	 */
	public void setNumDiff(BigDecimal numDiff) {
		this.numDiff = numDiff;
	}

	/**
	 * @return numDiffSort
	 */
	public BigDecimal getNumDiffSort() {
		return numDiffSort;
	}

	/**
	 * @param numDiffSort セットする numDiffSort
	 */
	public void setNumDiffSort(BigDecimal numDiffSort) {
		this.numDiffSort = numDiffSort;
	}

	/**
	 * @return plusMinusType
	 */
	public Long getPlusMinusType() {
		return plusMinusType;
	}

	/**
	 * @param plusMinusType セットする plusMinusType
	 */
	public void setPlusMinusType(Long plusMinusType) {
		this.plusMinusType = plusMinusType;
	}

	/**
	 * @return inventoryNumSum
	 */
	public BigDecimal getInventoryNumSum() {
		return inventoryNumSum;
	}

	/**
	 * @param inventoryNumSum セットする inventoryNumSum
	 */
	public void setInventoryNumSum(BigDecimal inventoryNumSum) {
		this.inventoryNumSum = inventoryNumSum;
	}

	/**
	 * @return chargeNumSum
	 */
	public BigDecimal getChargeNumSum() {
		return chargeNumSum;
	}

	/**
	 * @param chargeNumSum セットする chargeNumSum
	 */
	public void setChargeNumSum(BigDecimal chargeNumSum) {
		this.chargeNumSum = chargeNumSum;
	}

	/**
	 * @return inventoryCaseNum
	 */
	public BigDecimal getInventoryCaseNum() {
		return inventoryCaseNum;
	}

	/**
	 * @param inventoryCaseNum セットする inventoryCaseNum
	 */
	public void setInventoryCaseNum(BigDecimal inventoryCaseNum) {
		this.inventoryCaseNum = inventoryCaseNum;
	}

	/**
	 * @return chargeCaseNum
	 */
	public BigDecimal getChargeCaseNum() {
		return chargeCaseNum;
	}

	/**
	 * @param chargeCaseNum セットする chargeCaseNum
	 */
	public void setChargeCaseNum(BigDecimal chargeCaseNum) {
		this.chargeCaseNum = chargeCaseNum;
	}

	/**
	 * @return productSort
	 */
	public BigDecimal getProductSort() {
		return productSort;
	}

	/**
	 * @param productSort セットする productSort
	 */
	public void setProductSort(BigDecimal productSort) {
		this.productSort = productSort;
	}

   /**
	 * @return pieceQtyB 棚卸前ピース数
	 */
	public BigDecimal getPieceQtyB() {
		return pieceQtyB;
	}

	/**
	 * @param pieceQtyB セットする棚卸前ピース数
	 */
	public void setPieceQtyB(BigDecimal pieceQtyB) {
		this.pieceQtyB = pieceQtyB;
	}

	/**
	 * @return caseQtyB 棚卸前ケース数
	 */
	public BigDecimal getCaseQtyB() {
		return caseQtyB;
	}

	/**
	 * @param caseQtyB セットする棚卸前ケース数
	 */
	public void setCaseQtyB(BigDecimal caseQtyB) {
		this.caseQtyB = caseQtyB;
	}

	 /**
	 * @return pieceQtyN 現時点ピース数
	 */
	public BigDecimal getPieceQtyN() {
		return pieceQtyN;
	}

	/**
	 * @param pieceQtyN セットする現時点ピース数
	 */
	public void setPieceQtyN(BigDecimal pieceQtyN) {
		this.pieceQtyN = pieceQtyN;
	}

	/**
	 * @return caseQtyN 現時点ケース数
	 */
	public BigDecimal getCaseQtyN() {
		return caseQtyN;
	}

	/**
	 * @param caseQtyN セットする現時点ケース数
	 */
	public void setCaseQtyN(BigDecimal caseQtyN) {
		this.caseQtyN = caseQtyN;
	}

	 /**
	 * @return pieceQty 棚卸ピース数
	 */
	public BigDecimal getPieceQty() {
		return pieceQty;
	}

	/**
	 * @param pieceQty セットする棚卸ピース数
	 */
	public void setPieceQty(BigDecimal pieceQty) {
		this.pieceQty = pieceQty;
	}

	/**
	 * @return caseQty 棚卸ケース数
	 */
	public BigDecimal getCaseQty() {
		return caseQty;
	}

	/**
	 * @param caseQty セットする棚卸ケース数
	 */
	public void setCaseQty(BigDecimal caseQty) {
		this.caseQty = caseQty;
	}

    /**
	 * @return adjQty 現時点調整可能数
	 */
	public BigDecimal getAdjQty() {
		return adjQty;
	}

	/**
	 * @param adjQty 現時点調整可能数
	 */
	public void setAdjQty(BigDecimal adjQty) {
		this.adjQty = adjQty;
	}

    /**
	 * @return diffQty 棚卸差異数
	 */
	public BigDecimal getDiffQty() {
		return diffQty;
	}

	/**
	 * @param diffQty 棚卸差異数
	 */
	public void setDiffQty(BigDecimal diffQty) {
		this.diffQty = diffQty;
	}

   /**
	 * @return oldInventoryNum 棚卸数量備考
	 */
	public BigDecimal getOldInventoryNum() {
		return oldInventoryNum;
	}

	/**
	 * @param oldInventoryNum 棚卸数量備考
	 */
	public void setOldInventoryNum(BigDecimal oldInventoryNum) {
		this.oldInventoryNum = oldInventoryNum;
	}

	 /**
	 * @return inventroyParcent 進捗率
	 */
	public Long getInventroyParcent() {
		return inventroyParcent;
	}

	/**
	 * @param inventroyParcent 進捗率
	 */
	public void setInventroyParcent(Long inventroyParcent) {
		this.inventroyParcent = inventroyParcent;
	}

	/**
	 * @return inventoryPieceNum
	 */
	public BigDecimal getInventoryPieceNum() {
		return inventoryPieceNum;
	}

	/**
	 * @param inventoryPieceNum セットする 棚卸ピース数
	 */
	public void setInventoryPieceNum(BigDecimal inventoryPieceNum) {
		this.inventoryPieceNum = inventoryPieceNum;
	}

	/**
	 * @return inventoryBeforePieceNum
	 */
	public BigDecimal getInventoryBeforePieceNum() {
		return inventoryBeforePieceNum;
	}

	/**
	 * @param inventoryBeforePieceNum セットする 棚卸前ピース数
	 */
	public void setInventoryBeforePieceNum(BigDecimal inventoryBeforePieceNum) {
		this.inventoryBeforePieceNum = inventoryBeforePieceNum;
	}

	/**
	 * @return inventoryBeforeCaseNum
	 */
	public BigDecimal getInventoryBeforeCaseNum() {
		return inventoryBeforeCaseNum;
	}

	/**
	 * @param inventoryBeforeCaseNum セットする 棚卸前ケース数
	 */
	public void setInventoryBeforeCaseNum(BigDecimal inventoryBeforeCaseNum) {
		this.inventoryBeforeCaseNum = inventoryBeforeCaseNum;
	}
    /**
	 * @return adjQty SUM現時点調整可能数
	 */
	public BigDecimal getSumAdjQty() {
		return sumadjQty;
	}

	/**
	 * @param adjQty SUM現時点調整可能数
	 */
	public void setSumAdjQty(BigDecimal sumadjQty) {
		this.sumadjQty = sumadjQty;
	}

    /**
	 * @return sumdiffQty SUM棚卸差異数
	 */
	public BigDecimal getSumDiffQty() {
		return sumdiffQty;
	}

	/**
	 * @param sumdiffQty SUM棚卸差異数
	 */
	public void setSumDiffQty(BigDecimal sumdiffQty) {
		this.sumdiffQty = sumdiffQty;
	}

	 /**
	 * @return stockAdjustFlgShow 在庫調整フラグ
	 */
	public String getstockAdjustFlgShow() {
		return stockAdjustFlgShow;
	}

	/**
	 * @param stockAdjustFlgShow 在庫調整フラグ
	 */
	public void setstockAdjustFlgShow(String stockAdjustFlgShow) {
		this.stockAdjustFlgShow = stockAdjustFlgShow;
	}

	//入力日時
	private java.sql.Timestamp inputDt;

	    public java.sql.Timestamp getInputDt() {
		return inputDt;
	}

	public void setInputDt(java.sql.Timestamp inputDt) {
		this.inputDt = inputDt;
	}

	//入力日時
	private String histAddUser;

	    public String getHistAddUser() {
		return histAddUser;
	}

	public void setHistAddUser(String histAddUser) {
		this.histAddUser = histAddUser;
	}

	private String fromLocationCd;
	private String toLocationCd;
	private String zoneCd;
	private String stockTakingInput;
	private String unmatch;

	public String getFromLocationCd() {
		return fromLocationCd;
	}

	public void setFromLocationCd(String fromLocationCd) {
		this.fromLocationCd = fromLocationCd;
	}

	public String getToLocationCd() {
		return toLocationCd;
	}

	public void setToLocationCd(String toLocationCd) {
		this.toLocationCd = toLocationCd;
	}

	public String getZoneCd() {
		return zoneCd;
	}

	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}

	public String getStockTakingInput() {
		return stockTakingInput;
	}

	public void setStockTakingInput(String stockTakingInput) {
		this.stockTakingInput = stockTakingInput;
	}

	public String getUnmatch() {
		return unmatch;
	}

	public void setUnmatch(String unmatch) {
		this.unmatch = unmatch;
	}

	public String getChargeNumBreakdown() {
		return chargeNumBreakdown;
	}

	public void setChargeNumBreakdown(String chargeNumBreakdown) {
		this.chargeNumBreakdown = chargeNumBreakdown;
	}

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

	public String getInventoryBeforeBreakdown() {
		return inventoryBeforeBreakdown;
	}

	public void setInventoryBeforeBreakdown(String inventoryBeforeBreakdown) {
		this.inventoryBeforeBreakdown = inventoryBeforeBreakdown;
	}

	public String getInventoryBreakdown() {
		return inventoryBreakdown;
	}

	public void setInventoryBreakdown(String inventoryBreakdown) {
		this.inventoryBreakdown = inventoryBreakdown;
	}

	public String getBreakdownN() {
		return breakdownN;
	}

	public void setBreakdownN(String breakdownN) {
		this.breakdownN = breakdownN;
	}

	public String getStockBreakdown() {
		return stockBreakdown;
	}

	public void setStockBreakdown(String stockBreakdown) {
		this.stockBreakdown = stockBreakdown;
	}

	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}

	public String getBreakdown() {
	return breakdown;
	}

	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
}
