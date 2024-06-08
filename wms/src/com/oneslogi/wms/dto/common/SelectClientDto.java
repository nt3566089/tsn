package com.oneslogi.wms.dto.common;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
@JsonIgnoreProperties(ignoreUnknown=true)
public class SelectClientDto extends BaseDto {

	public SelectClientDto() {
	}

	private UserClientDto userClientDto;

	private ClientCenterDto clientCenterDto;

	private String selClientCd;

	private String selClientNm;

	private String selClientId;

	private String selCenterCd;

	private String selCenterNm;

	private String selCenterId;

	public UserClientDto getUserClientDto() {
		return userClientDto;
	}

	public void setUserClientDto(UserClientDto userClientDto) {
		this.userClientDto = userClientDto;
	}

	public ClientCenterDto getClientCenterDto() {
		return clientCenterDto;
	}

	public void setClientCenterDto(ClientCenterDto clientCenterDto) {
		this.clientCenterDto = clientCenterDto;
	}

	public String getSelClientCd() {
		return selClientCd;
	}

	public void setSelClientCd(String selClientCd) {
		this.selClientCd = selClientCd;
	}

	public String getSelClientNm() {
		return selClientNm;
	}

	public void setSelClientNm(String selClientNm) {
		this.selClientNm = selClientNm;
	}

	public String getSelClientId() {
		return selClientId;
	}

	public void setSelClientId(String selClientId) {
		this.selClientId = selClientId;
	}

	public String getSelCenterCd() {
		return selCenterCd;
	}

	public void setSelCenterCd(String selCenterCd) {
		this.selCenterCd = selCenterCd;
	}

	public String getSelCenterNm() {
		return selCenterNm;
	}

	public void setSelCenterNm(String selCenterNm) {
		this.selCenterNm = selCenterNm;
	}

	public String getSelCenterId() {
		return selCenterId;
	}

	public void setSelCenterId(String selCenterId) {
		this.selCenterId = selCenterId;
	}



}
