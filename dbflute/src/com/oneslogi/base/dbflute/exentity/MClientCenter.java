package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMClientCenter;

/**
 * The entity of M_CLIENT_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MClientCenter extends BsMClientCenter {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	public MCustomer chaseMCustomer() {
		return _mCustomer != null ? _mCustomer : new MCustomer();
	}

	// ======================================================

	/** システム管理日付(翌稼働日) */
	private String systemDateAdd;

	/**
	 * @return numDif
	 */
	public String getSystemDateAdd() {
		return systemDateAdd;
	}

	/**
	 * @param systemDateAdd セットする systemDateAdd
	 */
	public void setSystemDateAdd(String systemDateAdd) {
		this.systemDateAdd = systemDateAdd;
	}

	/** 行番号 */
	private String lineNo;

	/**
	 * @return lineNo
	 */
	public String getLineNo() {
		return lineNo;
	}

	/**
	 * @param lineNo セットする lineNo
	 */
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
}
