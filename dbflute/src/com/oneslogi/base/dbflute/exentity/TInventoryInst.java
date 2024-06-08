package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsentity.BsTInventoryInst;

/**
 * The entity of T_INVENTORY_INST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInst extends BsTInventoryInst {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** ピース差異 */
    private BigDecimal pieceQty;

    /** ケース差異 */
    private Long caseQty;

    /** 差異数(以上) */
    private BigDecimal diffQtyUp;

    /** 比較条件 */
    private String inventoryLocationProduct;

	/** ロケーション名称 FROM*/
	private String fromLocationNm;

	/** ロケーション名称 TO*/
	private String toLocationNm;

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

	/** 棚卸データ有 */
    private String stockTakingInput;

    /** アンマッチ有 */
	private String unmatch;

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
     * $0: 棚卸データ無し
     */
    public boolean isStockTakingInput$0() {
        CDef.StockTakingInput cdef = CDef.StockTakingInput.codeOf(getStockTakingInput());
        return cdef != null ? cdef.equals(CDef.StockTakingInput.$0) : false;
    }

    /**
     * $1: 棚卸データ有のみ
     */
    public boolean isStockTakingInput$1() {
        CDef.StockTakingInput cdef = CDef.StockTakingInput.codeOf(getStockTakingInput());
        return cdef != null ? cdef.equals(CDef.StockTakingInput.$1) : false;
    }

    /**
     * $0: アンマッチ無し
     */
    public boolean isUnmatch$0() {
    	// [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang start
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
        CDef.Unmatch cdef = CDef.Unmatch.codeOf(getUnmatch());
        return cdef != null ? cdef.equals(CDef.Unmatch.$0) : false;
        // [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang end
    }

    /**
     * $1: アンマッチ有のみ
     */
    public boolean isUnmatch$1() {
    	// [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang start
        CDef.Unmatch cdef = CDef.Unmatch.codeOf(getUnmatch());
        return cdef != null ? cdef.equals(CDef.Unmatch.$1) : false;
        // [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
        // [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang end
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
	/** 方面ピストン(手入力)*/
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

	/** 方面ピストン(選択)*/
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

	/** 登録日付*/
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