package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTInventoryHDto;

/**
 * The entity of T_INVENTORY_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryHDto extends BsTInventoryHDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 棚卸日(From) */
    private String inventoryDtFrom;

    /** 棚卸日(To) */
    private String inventoryDtTo;
        
	/**
	 * @return inventoryDtFrom
	 */
	public String getInventoryDtFrom() {
		return inventoryDtFrom;
	}

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	/**
	 * @param inventoryDtFrom セットする inventoryDtFrom
	 */
	public void setInventoryDtFrom(String inventoryDtFrom) {
		this.inventoryDtFrom = inventoryDtFrom;
	}

	/**
	 * @return inventoryDtTo
	 */
	public String getInventoryDtTo() {
		return inventoryDtTo;
	}

	/**
	 * @param inventoryDtTo セットする inventoryDtTo
	 */
	public void setInventoryDtTo(String inventoryDtTo) {
		this.inventoryDtTo = inventoryDtTo;
	}
	
	//LSC担当分機能対応のため、下記項目を追加 2024/05/06 ADD BY LSC START
	/** 荷主CD */
	private String clientCd;
	
	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	/** 拠点CD */
    private String centerCd;

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
	
	/** 在庫調査キーフラグ */
    private String inventoryKeyFlg;
    
    public String getInventoryKeyFlg() {
		return inventoryKeyFlg;
	}

	public void setInventoryKeyFlg(String inventoryKeyFlg) {
		this.inventoryKeyFlg = inventoryKeyFlg;
	}

    /** CAP製品 */
    private String capProduct;
    
    public String getCapProduct() {
		return capProduct;
	}

	public void setCapProduct(String capProduct) {
		this.capProduct = capProduct;
	}

    /** たばこ商品区分 */
    private String productType;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	//LSC担当分機能対応のため、下記項目を追加 2024/05/06 ADD BY LSC END
}
