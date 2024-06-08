package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMCenterCustomer;

/**
 * The entity of M_CENTER_CUSTOMER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCenterCustomer extends BsMCenterCustomer {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

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
}
