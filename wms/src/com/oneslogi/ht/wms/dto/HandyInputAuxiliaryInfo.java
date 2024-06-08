package com.oneslogi.ht.wms.dto;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入力補助情報を保持します。
 *
 */
public class HandyInputAuxiliaryInfo extends HandyBaseDto {

	/** 返却先Package<br>
	 * com.oneslogi.ht.wms.resources.以下を定義する
	 */
	private String returnPackage;
	/** 返却先Resource */
	private String returnResource;
	/** 返却先Method */
	private String returnMethod;
	/** 入力エラー用返却先URL */
	private String errorReturnURL;
	/** 荷主ID */
	private Long clientId;
	/** 荷主CD */
	private String clientCd;
	/** 商品ID */
	private Long productId;
	/** 商品CD */
	private String productCd;
	/** 荷姿グループID */
	private Long shapeGrpId;
	/** 編集前数量 */
	private String originCalcQty;
	/** 計算後総数量 */
	private String calcQty;

	public String getReturnPackage() {
		return returnPackage;
	}

	public void setReturnPackage(String returnPackage) {
		this.returnPackage = returnPackage;
	}

	public String getReturnResource() {
		return returnResource;
	}

	public void setReturnResource(String returnResource) {
		this.returnResource = returnResource;
	}

	public String getReturnMethod() {
		return returnMethod;
	}

	public void setReturnMethod(String returnMethod) {
		this.returnMethod = returnMethod;
	}

	public String getErrorReturnURL() {
		return errorReturnURL;
	}

	public void setErrorReturnURL(String errorReturnURL) {
		this.errorReturnURL = errorReturnURL;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public Long getShapeGrpId() {
		return shapeGrpId;
	}

	public void setShapeGrpId(Long shapeGrpId) {
		this.shapeGrpId = shapeGrpId;
	}

	public String getOriginCalcQty() {
		return originCalcQty;
	}

	public void setOriginCalcQty(String originCalcQty) {
		this.originCalcQty = originCalcQty;
	}

	public String getCalcQty() {
		return calcQty;
	}

	public void setCalcQty(String calcQty) {
		this.calcQty = calcQty;
	}

}
