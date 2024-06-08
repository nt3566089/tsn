package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMImportTypeDto;

/**
 * The entity of m_import_type.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeDto extends BsMImportTypeDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // 荷主センタ変更対応 2017.03.15 sja Start
    /** センタコード */
	private String centerCd = "";
    /** 荷主コード */
	private String clientCd = "";
    // 荷主センタ変更対応 2017.03.15 sja End

	/**
	 * @return the centerCd
	 */
	public String getCenterCd() {
		return centerCd;
	}
	/**
	 * @param centerCd the centerCd to set
	 */
	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
	/**
	 * @return the clientCd
	 */
	public String getClientCd() {
		return clientCd;
	}
	/**
	 * @param clientCd the clientCd to set
	 */
	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
}
