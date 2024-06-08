package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTInventoryH;

/**
 * The entity of T_INVENTORY_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryH extends BsTInventoryH {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	// ======================================================

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

	/**
	 * @param inventoryDtFrom セットする 棚卸日(From)
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
	 * @param inventoryDtTo セットする 棚卸日(To)
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
	/* 在庫調査指示一覧 2024/04/23 ADD BY LSC END */
}
