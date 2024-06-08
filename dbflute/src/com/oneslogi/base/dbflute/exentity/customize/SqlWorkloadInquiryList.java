package com.oneslogi.base.dbflute.exentity.customize;

import com.oneslogi.base.dbflute.bsentity.customize.BsSqlWorkloadInquiryList;

/**
 * The entity of SqlWorkloadInquiryList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlWorkloadInquiryList extends BsSqlWorkloadInquiryList {

	/** The serial version UID for object serialization. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====
	
	// 作業時刻(From)
	private String workTimeFrom;

	// 作業時刻(To)
	private String workTimeTo;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getWorkTimeFrom() {
		return workTimeFrom;
	}

	public void setWorkTimeFrom(String workTimeFrom) {
		this.workTimeFrom = workTimeFrom;
	}

	public String getWorkTimeTo() {
		return workTimeTo;
	}

	public void setWorkTimeTo(String workTimeTo) {
		this.workTimeTo = workTimeTo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
