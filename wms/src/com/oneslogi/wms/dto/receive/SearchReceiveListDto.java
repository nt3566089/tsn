package com.oneslogi.wms.dto.receive;

import javax.ws.rs.QueryParam;


public class SearchReceiveListDto {

	@QueryParam("clientId")
	public Long clientId;

	@QueryParam("clientCd")
	public String clientCd;

	@QueryParam("centerId")
	public Long centerId;

	@QueryParam("centerCd")
	public String centerCd;

	@QueryParam("warehouseId")
	public Long warehouseId;

	@QueryParam("warehouseCd")
	public String warehouseCd;

	@QueryParam("receivePlanDtFrom")
	public String receivePlanDtFrom;

	@QueryParam("receivePlanDtTo")
	public String receivePlanDtTo;

	@QueryParam("slipNo")
	public String slipNo;

	@QueryParam("customerId")
	public Long customerId;

	@QueryParam("receiveCustId")
	public Long receiveCustId;

	@QueryParam("reportId")
	public Long reportId;

	@QueryParam("conditionId")
	public String conditionId;

	public String prevMode;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public Long getCenterId() {
		return centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getReceivePlanDtFrom() {
		return receivePlanDtFrom;
	}

	public void setReceivePlanDtFrom(String receivePlanDtFrom) {
		this.receivePlanDtFrom = receivePlanDtFrom;
	}

	public String getReceivePlanDtTo() {
		return receivePlanDtTo;
	}

	public void setReceivePlanDtTo(String receivePlanDtTo) {
		this.receivePlanDtTo = receivePlanDtTo;
	}

	public String getSlipNo() {
		return slipNo;
	}

	public void setSlipNo(String slipNo) {
		this.slipNo = slipNo;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getReceiveCustId() {
		return receiveCustId;
	}

	public void setReceiveCustId(Long receiveCustId) {
		this.receiveCustId = receiveCustId;
	}

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public String getConditionId() {
		return conditionId;
	}

	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}

	public String getPrevMode() {
		return prevMode;
	}

	public void setPrevMode(String prevMode) {
		this.prevMode = prevMode;
	}



}
