package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTInventoryInstDto;

/**
 * The entity of T_INVENTORY_INST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInstDto extends BsTInventoryInstDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====

    /** ピース差異 */
    private BigDecimal pieceQty;

    /** ケース差異 */
    private Long caseQty;

    /** 差異数(以上) */
    private BigDecimal diffQtyUp;

    /** 比較条件 */
    private String inventoryLocationProduct;

    /** 棚卸データ有 */
    private String stockTakingInput;

    /** アンマッチ有 */
	private String unmatch;

	/** ロケーション名称 FROM*/
	private String fromLocationNm;

	/** ロケーション名称 TO*/
	private String toLocationNm;

	//trainで追加
	/** 引当可能数+引当済数>0 */
	private String stockTarget;
	
	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getStockTarget() {
		return stockTarget;
	}

	public void setStockTarget(String stockTarget) {
		this.stockTarget = stockTarget;
	}
	
	/**
	 * @return pieceQty ピース差異
	 */
	public BigDecimal getPieceQty() {
		return pieceQty;
	}

	/**
	 * @param pieceQty セットする ピース差異
	 */
	public void setPieceQty(BigDecimal pieceQty) {
		this.pieceQty = pieceQty;
	}

	/**
	 * @return diffQtyUp 差異数(以上)
	 */
	public BigDecimal getDiffQtyUp() {
		return diffQtyUp;
	}

	/**
	 * @param pieceQty セットする 差異数(以上)
	 */
	public void setDiffQtyUp(BigDecimal diffQtyUp) {
		this.diffQtyUp = diffQtyUp;
	}
	/**
	 * @return caseQty ケース差異
	 */
	public Long getCaseQty() {
		return caseQty;
	}

	/**
	 * @param caseQty セットする ケース差異
	 */
	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	/**
	 * @return inventoryLocationProduct
	 */
	public String getInventoryLocationProduct() {
		return inventoryLocationProduct;
	}

	/**
	 * @param inventoryLocationProduct セットする inventoryLocationProduct
	 */
	public void setInventoryLocationProduct(String inventoryLocationProduct) {
		this.inventoryLocationProduct = inventoryLocationProduct;
	}

	/**
	 * @return stockTakingInput 棚卸データ有
	 */
	public String getStockTakingInput() {
		return stockTakingInput;
	}

	/**
	 * @param stockTakingInput 棚卸データ有
	 */
	public void setStockTakingInput(String stockTakingInput) {
		this.stockTakingInput = stockTakingInput;
	}

	/**
	 * @return unmatch アンマッチ有
	 */
	public String getUnmatch() {
		return unmatch;
	}

	/**
	 * @param unmatch アンマッチ有
	 */
	public void setUnmatch(String unmatch) {
		this.unmatch = unmatch;
	}

	/**
	 * @return fromLocationNm ロケーション名称 FROM
	 */
	public String getFromLocationNm() {
		return fromLocationNm;
	}

	/**
	 * @param fromLocationNm ロケーション名称 FROM
	 */
	public void setFromLocationNm(String fromLocationNm) {
		this.fromLocationNm = fromLocationNm;
	}

	/**
	 * @return toLocationNm ロケーション名称 TO
	 */
	public String getToLocationNm() {
		return toLocationNm;
	}

	/**
	 * @param toLocationNm ロケーション名称 TO
	 */
	public void setToLocationNm(String toLocationNm) {
		this.toLocationNm = toLocationNm;
	}
	
	//LSC担当分機能対応のため、下記項目を追加 2024/05/07 ADD BY LSC START
	/** ロケーション名称 */
	private String locationNm;
	
	/**
	 * @return locationNm ロケーション名称
	 */
	public String getLocationNm() {
		return locationNm;
	}
	
	/**
	 * @param locationNm ロケーション名称
	 */
	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	/** 銘柄名称 */
	private String productNm;
	
	/**
	 * @return productNm 銘柄名称
	 */
	public String getProductNm() {
		return productNm;
	}

	/**
	 * @param productNm 銘柄名称
	 */
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	/** 方面ピストン(手入力) */
	private String directionalPistonText;

	/**
	 * @return directionalPistonText 方面ピストン(手入力)
	 */
	public String getDirectionalPistonText() {
		return directionalPistonText;
	}

	/**
	 * @param directionalPistonText 方面ピストン(手入力)
	 */
	public void setDirectionalPistonText(String directionalPistonText) {
		this.directionalPistonText = directionalPistonText;
	}

	/** 方面ピストン(選択) */
	private String directionalPistonDropdown;
	
	/**
	 * @return directionalPistonDropdown 方面ピストン(選択)
	 */
	public String getDirectionalPistonDropdown() {
		return directionalPistonDropdown;
	}

	/**
	 * @param directionalPistonDropdown 方面ピストン(選択)
	 */
	public void setDirectionalPistonDropdown(String directionalPistonDropdown) {
		this.directionalPistonDropdown = directionalPistonDropdown;
	}

	/** 登録日付 */
	private String registDt;

	/**
	 * @return registDt 登録日付
	 */
	public String getRegistDt() {
		return registDt;
	}

	/**
	 * @return registDt 登録日付
	 */
	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}
	//LSC担当分機能対応のため、下記項目を追加 2024/05/07 ADD BY LSC END
	
	//trainで追加
	/** 保税・倉庫フラグ */
	private String hozeFlag;

	public String getHozeFlag() {
		return hozeFlag;
	}

	public void setHozeFlag(String hozeFlag) {
		this.hozeFlag = hozeFlag;
	}
	
	//trainで追加
	/** ロケーションID */
	private Long locationId;
	
	/** 商品ID */
	private Long productionId;
	
	/** 引当可能数 */
	private BigDecimal sumcharge;
	
	/** 引当済数 */
	private BigDecimal sumalloc;
	
	/** 移動中数 */
	private BigDecimal moveNum;
	
	/** 商社搬入番号 */
	private String lot1;
	
	/** 製造年月日 */
	private String lot4;
	
	/** 製造記号 */
	private String lot2;
	
	/** 仕分作業回数 */
	private Long sortingWrokNumtimes;
	
	/** 内外区分 */
	private String inoutKbn;

	/** 累計過不足数_返品 */
	private BigDecimal retrunTotal;
	
	/** 累計過不足数_国税還付品 */
	private BigDecimal taxlessTotal;

	/** り災品 */
	private BigDecimal backTotal;
	
	/** 不適品ラベル作成個装数 */
	private BigDecimal notObjectTotal;
	
	/** 一括登録個装数 */
	private BigDecimal registTotal;
	
	/** 国税還付品数 */
	private BigDecimal taxTotal;
	
	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getProductionId() {
		return productionId;
	}

	public void setProductionId(Long productionId) {
		this.productionId = productionId;
	}

	public BigDecimal getSumcharge() {
		return sumcharge;
	}

	public void setSumcharge(BigDecimal sumcharge) {
		this.sumcharge = sumcharge;
	}

	public BigDecimal getSumalloc() {
		return sumalloc;
	}

	public void setSumalloc(BigDecimal sumalloc) {
		this.sumalloc = sumalloc;
	}

	public BigDecimal getMoveNum() {
		return moveNum;
	}

	public void setMoveNum(BigDecimal moveNum) {
		this.moveNum = moveNum;
	}

	public String getLot1() {
		return lot1;
	}

	public void setLot1(String lot1) {
		this.lot1 = lot1;
	}

	public String getLot4() {
		return lot4;
	}

	public void setLot4(String lot4) {
		this.lot4 = lot4;
	}

	public String getLot2() {
		return lot2;
	}

	public void setLot2(String lot2) {
		this.lot2 = lot2;
	}

	public Long getSortingWrokNumtimes() {
		return sortingWrokNumtimes;
	}

	public void setSortingWrokNumtimes(Long sortingWrokNumtimes) {
		this.sortingWrokNumtimes = sortingWrokNumtimes;
	}

	public String getInoutKbn() {
		return inoutKbn;
	}

	public void setInoutKbn(String inoutKbn) {
		this.inoutKbn = inoutKbn;
	}

	public BigDecimal getRetrunTotal() {
		return retrunTotal;
	}

	public void setRetrunTotal(BigDecimal retrunTotal) {
		this.retrunTotal = retrunTotal;
	}

	public BigDecimal getTaxlessTotal() {
		return taxlessTotal;
	}

	public void setTaxlessTotal(BigDecimal taxlessTotal) {
		this.taxlessTotal = taxlessTotal;
	}

	public BigDecimal getBackTotal() {
		return backTotal;
	}

	public void setBackTotal(BigDecimal backTotal) {
		this.backTotal = backTotal;
	}

	public BigDecimal getNotObjectTotal() {
		return notObjectTotal;
	}

	public void setNotObjectTotal(BigDecimal notObjectTotal) {
		this.notObjectTotal = notObjectTotal;
	}

	public BigDecimal getRegistTotal() {
		return registTotal;
	}

	public void setRegistTotal(BigDecimal registTotal) {
		this.registTotal = registTotal;
	}

	public BigDecimal getTaxTotal() {
		return taxTotal;
	}

	public void setTaxTotal(BigDecimal taxTotal) {
		this.taxTotal = taxTotal;
	}
	
	
}