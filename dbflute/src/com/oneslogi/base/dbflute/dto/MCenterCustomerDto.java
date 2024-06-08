package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMCenterCustomerDto;

/**
 * The entity of M_CENTER_CUSTOMER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCenterCustomerDto extends BsMCenterCustomerDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    // 行番号
 	private String lineNo;

 	private long customerRevieceId;

 	private String errorFlg ;

 	private String errorMessageCd;

 	private String errorMessageNm;

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

	public long getCustomerRevieceId() {
		return customerRevieceId;
	}

	public void setCustomerRevieceId(long customerRevieceId) {
		this.customerRevieceId = customerRevieceId;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

}
