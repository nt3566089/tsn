package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMProductShape;

/**
 * The entity of M_PRODUCT_SHAPE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MProductShape extends BsMProductShape {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public MShapeGrpDtl chaseMShapeGrpDtl() {
		return _mShapeGrpDtl != null ? _mShapeGrpDtl : new MShapeGrpDtl();
	}

	// ======================================================

    /**
     * 荷主ID
     */
    private Long clientId;
    /**
     * センタID
     */
    private Long centerId;
    /**
     * ケース荷姿フラグ
     *
     * 1:ケース荷姿IDで使う
     */
    private String caseFlg;
    /**
     * ボール荷姿フラグ
     *
     * 1:ボール荷姿IDで使う
     */
    private String bowFlg;
    /**
     * ピース荷姿フラグ
     *
     * 1:ピース荷姿IDで使う
     */
    private String pieceFlg;

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

    // [Ver3.0] unit of measure対応 2017.12.05 NING Start
    /** 入数単位 **/
    private String unitNumUnit;
    // [Ver3.0] unit of measure対応 2017.12.05 NING End

	// ===== 以下、ゲッタとセッタ =====

    public String getUnitNumUnit() {
		return unitNumUnit;
	}
	public void setUnitNumUnit(String unitNumUnit) {
		this.unitNumUnit = unitNumUnit;
	}
	public long getProductShapeRevieceId() {
		return productShapeRevieceId;
	}
	public void setProductShapeRevieceId(long productShapeRevieceId) {
		this.productShapeRevieceId = productShapeRevieceId;
	}
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public Long getCenterId() {
		return centerId;
	}
	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}
	public String getCaseFlg() {
		return caseFlg;
	}
	public void setCaseFlg(String caseFlg) {
		this.caseFlg = caseFlg;
	}
	public String getBowFlg() {
		return bowFlg;
	}
	public void setBowFlg(String bowFlg) {
		this.bowFlg = bowFlg;
	}
	public String getPieceFlg() {
		return pieceFlg;
	}
	public void setPieceFlg(String pieceFlg) {
		this.pieceFlg = pieceFlg;
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

}
