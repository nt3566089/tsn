package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMProductShapeDto;

/**
 * The entity of M_PRODUCT_SHAPE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MProductShapeDto extends BsMProductShapeDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== 導出カラム =====
	private String lineNo;

	private String errorFlg;

	private String errorMessageCd;

	private String errorMessageNm;

	private long productShapeRevieceId;

	// [#2961][#2830] 複数荷姿対応 2017.12.20 kawana Start
    /** ピース単位での入数 */
    private long unitNumPiece;

    /** 荷姿単位の数量 */
    private long num;
    // [#2961][#2830] 複数荷姿対応 2017.12.20 kawana End

	// [Ver3.0] unit of measure対応 2017.11.05 NING Start
	/** 入数単位 */
	private String unitNumUnit;
	// [Ver3.0] unit of measure対応 2017.11.05 NING End
	// ===== 以下、ゲッタとセッタ =====

	public long getProductShapeRevieceId() {
		return productShapeRevieceId;
	}

	public void setProductShapeRevieceId(long productShapeRevieceId) {
		this.productShapeRevieceId = productShapeRevieceId;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getErrorFlg() {
		return errorFlg;
	}

	public void setErrorFlg(String errorFlg) {
		this.errorFlg = errorFlg;
	}

	public String getErrorMessageCd() {
		return errorMessageCd;
	}

	public void setErrorMessageCd(String errorMessageCd) {
		this.errorMessageCd = errorMessageCd;
	}

	public String getErrorMessageNm() {
		return errorMessageNm;
	}

	public void setErrorMessageNm(String errorMessageNm) {
		this.errorMessageNm = errorMessageNm;
	}

	public long getUnitNumPiece() {
		return unitNumPiece;
	}

	public void setUnitNumPiece(long unitNumPiece) {
		this.unitNumPiece = unitNumPiece;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getUnitNumUnit() {
		return unitNumUnit;
	}

	public void setUnitNumUnit(String unitNumUnit) {
		this.unitNumUnit = unitNumUnit;
	}
}
