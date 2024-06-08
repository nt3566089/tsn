package com.oneslogi.ht.wms.dto;

import java.io.Serializable;


/**
 * 入力補助商品荷姿情報を保持します。
 */
public class HandyInputAuxiliaryProductShapeDto implements Serializable {


	/** 小数有無フラグ */
	private String decimalExistFlg;

	/** 荷姿名称 */
	private String shapeNm;

	/** 荷姿単位名称 */
	private String shapeUnitNm;

	/** 荷姿入力項目名称 */
	private String shapeInputItemNm;

	/** 荷姿計算後入数 */
	private Long calcShapeUnitNum;;

	/** 内訳数 */
	private String productShapeInputQty;

	/** 入力項目用パラメータ名称 */
	private String queryParamNm;

	/**
	 * テキストキャプションの表示位置。
	 * 左からの桁位置を指定します。
	 */
	private String positionTextY;
	/**
	 * インプットキャプションの表示位置。
	 * 左からの桁位置を指定します。
	 */
	private String positionInputY;

	public String getDecimalExistFlg() {
		return decimalExistFlg;
	}

	public void setDecimalExistFlg(String decimalExistFlg) {
		this.decimalExistFlg = decimalExistFlg;
	}

	public String getShapeNm() {
		return shapeNm;
	}

	public void setShapeNm(String shapeNm) {
		this.shapeNm = shapeNm;
	}

	public String getShapeUnitNm() {
		return shapeUnitNm;
	}

	public void setShapeUnitNm(String shapeUnitNm) {
		this.shapeUnitNm = shapeUnitNm;
	}

	public String getShapeInputItemNm() {
		return shapeInputItemNm;
	}

	public void setShapeInputItemNm(String shapeInputItemNm) {
		this.shapeInputItemNm = shapeInputItemNm;
	}

	public Long getCalcShapeUnitNum() {
		return calcShapeUnitNum;
	}

	public void setCalcShapeUnitNum(Long calcShapeUnitNum) {
		this.calcShapeUnitNum = calcShapeUnitNum;
	}

	public String getProductShapeInputQty() {
		return productShapeInputQty;
	}

	public void setProductShapeInputQty(String productShapeInputQty) {
		this.productShapeInputQty = productShapeInputQty;
	}

	public String getQueryParamNm() {
		return queryParamNm;
	}

	public void setQueryParamNm(String queryParamNm) {
		this.queryParamNm = queryParamNm;
	}

	public String getPositionTextY() {
		return positionTextY;
	}

	public void setPositionTextY(String positionTextY) {
		this.positionTextY = positionTextY;
	}

	public String getPositionInputY() {
		return positionInputY;
	}

	public void setPositionInputY(String positionInputY) {
		this.positionInputY = positionInputY;
	}

}
