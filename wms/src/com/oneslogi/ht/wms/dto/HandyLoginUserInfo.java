package com.oneslogi.ht.wms.dto;

import com.oneslogi.ht.base.dto.HandyLoginUserInfoBase;

/**
 * ログイン情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyLoginUserInfo extends HandyLoginUserInfoBase {

	private String clientCd;
	private Long clientId;
	private String centerCd;
	private Long centerId;
	private String warehouseCd;
	private Long warehouseId;

	/**
	 * ユーザーCDを取得します。
	 * @return ユーザーCD
	 */
	public String getUserCd() {
		return sessionData.getUserCd();
	}

	public void setUserCd(String userCd) {
		sessionData.setUserCd(userCd);
	}

	/**
	 * ユーザー名を取得します。
	 * @return ユーザー名
	 */
	public String getUserNm() {
		return sessionData.getUserNm();
	}

	public void setUserNm(String userNm) {
		sessionData.setUserNm(userNm);
	}

	/**
	 * 荷主IDを取得します。
	 * @return 荷主ID
	 */
	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	/**
	 * 荷主CDを取得します。
	 * @return 荷主CD
	 */
	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	/**
	 * センタIDを取得します。
	 * @return センタID
	 */
	public Long getCenterId() {
		return centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	/**
	 * センタCDを取得します。
	 * @return センタCD
	 */
	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	/**
	 * 倉庫IDを取得します。
	 * @return 倉庫ID
	 */
	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	/**
	 * 倉庫CDを取得します。
	 * @return 倉庫CD
	 */
	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

}
