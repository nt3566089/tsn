package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

public class ProductLabelDto extends ReportDto {

    //JANCD or 商品CD
	public String productCd;

    //商品名称
	public String productNm;

    //JANCD or 商品CDバーコード
	public String productCdBar;

    //備考
	public String productBiko;

    //商品ラベルJANCDバーコード種別 or 商品ラベル商品CDバーコード種別
	public String productLabelBarcode;

	/**
	 * @return the productCd
	 */
	public String getProductCd() {
		return productCd;
	}

	/**
	 * @param productCd the productCd to set
	 */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	/**
	 * @return the productNm
	 */
	public String getProductNm() {
		return productNm;
	}

	/**
	 * @param productNm the productNm to set
	 */
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	/**
	 * @return the productCdBar
	 */
	public String getProductCdBar() {
		return productCdBar;
	}

	/**
	 * @param productCdBar the productCdBar to set
	 */
	public void setProductCdBar(String productCdBar) {
		this.productCdBar = productCdBar;
	}

	/**
	 * @return the productBiko
	 */
	public String getProductBiko() {
		return productBiko;
	}

	/**
	 * @param productBiko the productBiko to set
	 */
	public void setProductBiko(String productBiko) {
		this.productBiko = productBiko;
	}

	/**
	 * @return the productLabelBarcode
	 */
	public String getProductLabelBarcode() {
		return productLabelBarcode;
	}

	/**
	 * @param productLabelBarcode the productLabelBarcode to set
	 */
	public void setProductLabelBarcode(String productLabelBarcode) {
		this.productLabelBarcode = productLabelBarcode;
	}


}
