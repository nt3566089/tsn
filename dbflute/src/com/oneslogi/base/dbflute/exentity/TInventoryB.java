package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTInventoryB;

/**
 * The entity of T_INVENTORY_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryB extends BsTInventoryB {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomerByDepositId() {
		return _mCustomerByDepositId != null ? _mCustomerByDepositId : new MCustomer();
	}

	public MCustomer chaseMCustomerBySupplierId() {
		return _mCustomerBySupplierId != null ? _mCustomerBySupplierId : new MCustomer();
	}

	public MLocation chaseMLocation() {
		return _mLocation != null ? _mLocation : new MLocation();
	}

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public MStockType chaseMStockType() {
		return _mStockType != null ? _mStockType : new MStockType();
	}

	public MWarehouse chaseMWarehouse() {
		return _mWarehouse != null ? _mWarehouse : new MWarehouse();
	}

	public TInventoryH chaseTInventoryH() {
		return _tInventoryH != null ? _tInventoryH : new TInventoryH();
	}

	public TStock chaseTStock() {
		return _tStock != null ? _tStock : new TStock();
	}

	public TStoreNo chaseTStoreNo() {
		return _tStoreNo != null ? _tStoreNo : new TStoreNo();
	}

	// ======================================================


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

	/** 棚卸ピース数 */
	private BigDecimal inventoryPieceNum;

	/** 棚卸前ピース数 */
	private BigDecimal inventoryBeforePieceNum;

	/** 棚卸前ケース数 */
	private BigDecimal inventoryBeforeCaseNum;

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

   	/** 棚卸前内訳*/
   	private String inventoryBreakdown;
   	// [Ver3.0] unit of measure対応 2017.11.22 駱 Add End
    // [Ver3.0] unit of measure対応 2017.11.22 ライ Add Start
    /**現時点内訳*/
  	private String breakdownN;
    // [Ver3.0] unit of measure対応 2017.11.22 ライ Add END

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

	/** SUM現時点調整可能数 */
	private BigDecimal sumadjQty;

	/** SUM棚卸差異数 */
	private BigDecimal sumdiffQty;

	/** 在庫調整フラグ */
	private String stockAdjustFlgShow;

	/** 棚卸数の商品単位合計 */
	private BigDecimal inventoryNumProductSum;

	/** 引当可能数の商品単位合計 */
	private BigDecimal chargeNumProductSum;

	// [Ver3.0] unit of measure対応 2017.11.27 HDIS Start
 	//入数
 	private String stringUnitNum;

 	//内訳
 	private String breakdown;

 	//最小梱包単位
 	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.27 HDIS End

	/**
	 * @return numDiff 差異数
	 */
	public BigDecimal getNumDiff() {
		return numDiff;
	}

	/**
	 * @param numDiff セットする 差異数
	 */
	public void setNumDiff(BigDecimal numDiff) {
		this.numDiff = numDiff;
	}

	/**
	 * @return numDiffSort 差異数ソート
	 */
	public BigDecimal getNumDiffSort() {
		return numDiffSort;
	}

	/**
	 * @param numDiffSort セットする 差異数ソート
	 */
	public void setNumDiffSort(BigDecimal numDiffSort) {
		this.numDiffSort = numDiffSort;
	}

	/**
	 * @return plusMinusType プラス/マイナス区分
	 */
	public Long getPlusMinusType() {
		return plusMinusType;
	}

	/**
	 * @param plusMinusType セットする プラス/マイナス区分
	 */
	public void setPlusMinusType(Long plusMinusType) {
		this.plusMinusType = plusMinusType;
	}

	/**
	 * @return inventoryNumSum 棚卸数の合計
	 */
	public BigDecimal getInventoryNumSum() {
		return inventoryNumSum;
	}

	/**
	 * @param inventoryNumSum セットする 棚卸数の合計
	 */
	public void setInventoryNumSum(BigDecimal inventoryNumSum) {
		this.inventoryNumSum = inventoryNumSum;
	}

	/**
	 * @return chargeNumSum 引当可能数の合計
	 */
	public BigDecimal getChargeNumSum() {
		return chargeNumSum;
	}

	/**
	 * @param chargeNumSum セットする 引当可能数の合計
	 */
	public void setChargeNumSum(BigDecimal chargeNumSum) {
		this.chargeNumSum = chargeNumSum;
	}

	/**
	 * @return inventoryCaseNum 棚卸ケース数
	 */
	public BigDecimal getInventoryCaseNum() {
		return inventoryCaseNum;
	}

	/**
	 * @param inventoryCaseNum セットする 棚卸ケース数
	 */
	public void setInventoryCaseNum(BigDecimal inventoryCaseNum) {
		this.inventoryCaseNum = inventoryCaseNum;
	}

	/**
	 * @return chargeCaseNum 引当可能ケース数
	 */
	public BigDecimal getChargeCaseNum() {
		return chargeCaseNum;
	}

	/**
	 * @param chargeCaseNum セットする 引当可能ケース数
	 */
	public void setChargeCaseNum(BigDecimal chargeCaseNum) {
		this.chargeCaseNum = chargeCaseNum;
	}

	/**
	 * @return productSort 商品単位合計ソート
	 */
	public BigDecimal getProductSort() {
		return productSort;
	}

	/**
	 * @param productSort セットする 商品単位合計ソート
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
	// [Ver3.0] unit of measure対応 2017.11.22 駱 End

	// [Ver3.0] unit of measure対応 2017.11.29 REN Start

	public String getStockBreakdown() {
		return stockBreakdown;
	}

	public void setStockBreakdown(String stockBreakdown) {
		this.stockBreakdown = stockBreakdown;
	}
	// [Ver3.0] unit of measure対応 2017.11.29 REN End

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

	public String getChargeNumBreakdown() {
		return chargeNumBreakdown;
	}

	public void setChargeNumBreakdown(String chargeNumBreakdown) {
		this.chargeNumBreakdown = chargeNumBreakdown;
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

	// 入庫実績ボディの商品荷姿．入数
	public static final String ALIAS_UnitNum = "UNIT_NUM";

	//    private Long unitNum;
	//
	//    public Long getUnitNum() {
	//		return unitNum;
	//	}
	//	public void setUnitNum(Long unitNum) {
	//		this.unitNum = unitNum;
	//	}

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

	// 入庫実績ボディの商品荷姿．入数
	public static final String SHAPE_UnitNum = "SHAPE_UNIT_NUM";
	private Long shapeUnitNum;

	public Long getShapeUnitNum() {
		return shapeUnitNum;
	}

	public void setShapeUnitNum(Long shapeUnitNum) {
		this.shapeUnitNum = shapeUnitNum;
	}

	// 入庫実績ボディの商品荷姿．荷姿Id
	//    public static final String ALIAS_ShapeId = "SHAPE_ID";
	//    private Long shapeId;
	//
	//    public Long getShapeId() {
	//		return shapeId;
	//	}
	//	public void setShapeId(Long shapeId) {
	//		this.shapeId = shapeId;
	//	}

	// 入庫実績ボディの商品荷姿．荷姿Id
	public static final String ALIAS_InventoryInpHistId = "INVENTORY_INP_HIST_ID";

	private Long inventoryInpHistId;

	public Long getInventoryInpHistId() {

		return inventoryInpHistId;
	}

	public void setInventoryInpHistId(Long inventoryInpHistId) {

		this.inventoryInpHistId = inventoryInpHistId;

	}

	//入力日時
	public static final String ALIAS_InputDt = "INPUT_DT";

	private java.sql.Timestamp inputDt;

	public java.sql.Timestamp getInputDt() {
		return inputDt;
	}

	public void setInputDt(java.sql.Timestamp inputDt) {
		this.inputDt = inputDt;
	}

	//入力日時
	public static final String ALIAS_AddUser = "HIST_ADD_USER";

	private String histAddUser;

	public String getHistAddUser() {
		return histAddUser;
	}

	public void setHistAddUser(String histAddUser) {
		this.histAddUser = histAddUser;
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

	public BigDecimal getInventoryNumProductSum() {
		return inventoryNumProductSum;
	}

	public void setInventoryNumProductSum(BigDecimal inventoryNumProductSum) {
		this.inventoryNumProductSum = inventoryNumProductSum;
	}

	public BigDecimal getChargeNumProductSum() {
		return chargeNumProductSum;
	}

	public void setChargeNumProductSum(BigDecimal chargeNumProductSum) {
		this.chargeNumProductSum = chargeNumProductSum;
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

	public String getBreakdownN() {
		return breakdownN;
	}

	public void setBreakdownN(String breakdownN) {
		this.breakdownN = breakdownN;
	}

	// [Ver3.0] unit of measure対応 2017.11.27 HDIS Start
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
	// [Ver3.0] unit of measure対応 2017.11.27 HDIS End
}
