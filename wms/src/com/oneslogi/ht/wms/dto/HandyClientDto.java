package com.oneslogi.ht.wms.dto;

import java.util.List;

import com.oneslogi.base.dbflute.dto.MUserClientDto;


/**
 * 荷主情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyClientDto {

	private String returnURL;
	
	private String sendURL;
	
	private List<MUserClientDto> userClientDto;

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	public String getSendURL() {
		return sendURL;
	}

	public void setSendURL(String sendURL) {
		this.sendURL = sendURL;
	}
	
	public List<MUserClientDto> getUserClientDto() {
		return userClientDto;
	}

	public void setUserClientDto(List<MUserClientDto> userClientDto) {
		this.userClientDto = userClientDto;
	}

	

}
