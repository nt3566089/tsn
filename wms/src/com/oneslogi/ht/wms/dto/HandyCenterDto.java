package com.oneslogi.ht.wms.dto;


/**
 * センタ情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyCenterDto {
	
	private String centerCd;
	private String centerNm;
	private String centerId;
	private String option;
	private String sendURL;
	
	public String getCenterCd() {
		return centerCd;
	}
	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
	public String getCenterNm() {
		return centerNm;
	}
	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getSendURL() {
		return sendURL;
	}
	public void setSendURL(String sendURL) {
		this.sendURL = sendURL;
	}
	
	

}
