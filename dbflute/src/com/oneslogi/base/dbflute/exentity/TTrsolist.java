package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTTrsolist;

/**
 * The entity of T_TRSOLIST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TTrsolist extends BsTTrsolist {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    //【TSN KGL030301_保税出庫関連リスト出力】 2024.02.27 K.SATO ADD [S]
    // 拠点CD
    private String centerCd;
    // 荷主CD
    private String clientCd;
    // 出庫予定日(From)
    private String shipschdateFrom;
    // 出庫予定日(To)
    private String shipschdateTo;
    // 引当バッチキー
    private Long pickbatchkey;

    public String getCenterCd() {
		return centerCd;
	}
	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
	public String getClientCd() {
		return clientCd;
	}
	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
	public String getShipschdateFrom() {
		return shipschdateFrom;
	}
	public void setShipschdateFrom(String shipschdateFrom) {
		this.shipschdateFrom = shipschdateFrom;
	}
	public String getShipschdateTo() {
		return shipschdateTo;
	}
	public void setShipschdateTo(String shipschdateTo) {
		this.shipschdateTo = shipschdateTo;
	}
	public Long getPickbatchkey() {
		return pickbatchkey;
	}
	public void setPickbatchkey(Long pickbatchkey) {
		this.pickbatchkey = pickbatchkey;
	}
    //【TSN KGL030301_保税出庫関連リスト出力】 2024.02.27 K.SATO ADD [E]

    //【TSN KGL030308_保税出庫関連リスト再出力】 2024.04.16 K.SATO ADD [S]
	// 印刷年月日(From)
	private String printdatetimeFrom;
	// 印刷年月日(From)
	private String printdatetimeTo;
	// 受入先CD
	private String shiptocd;
	// 受入先名称
	private String shiptoNm;
	// 特約店CD
	private String customerCd;
	// 特約店名称
	private String customerNm;
	// 車割キー
	private String ownerorderno;
	// 依頼種別
	private String otherlot2;
	// 依頼番号
	private String otherlot4;
	// 整理番号
	private String otherlot3;
	// パレット番号（保税）
	private String notes;
	// ロケーションCD
	private String locationCd;
	// ロケーション名称
	private String locationNm;

	public String getPrintdatetimeFrom() {
		return printdatetimeFrom;
	}
	public void setPrintdatetimeFrom(String printdatetimeFrom) {
		this.printdatetimeFrom = printdatetimeFrom;
	}
	public String getPrintdatetimeTo() {
		return printdatetimeTo;
	}
	public void setPrintdatetimeTo(String printdatetimeTo) {
		this.printdatetimeTo = printdatetimeTo;
	}
	public String getShiptocd() {
		return shiptocd;
	}
	public void setShiptocd(String shiptocd) {
		this.shiptocd = shiptocd;
	}
	public String getShiptoNm() {
		return shiptoNm;
	}
	public void setShiptoNm(String shiptoNm) {
		this.shiptoNm = shiptoNm;
	}
	public String getCustomerCd() {
		return customerCd;
	}
	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}
	public String getCustomerNm() {
		return customerNm;
	}
	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}
	public String getOwnerorderno() {
		return ownerorderno;
	}
	public void setOwnerorderno(String ownerorderno) {
		this.ownerorderno = ownerorderno;
	}
	public String getOtherlot2() {
		return otherlot2;
	}
	public void setOtherlot2(String otherlot2) {
		this.otherlot2 = otherlot2;
	}
	public String getOtherlot4() {
		return otherlot4;
	}
	public void setOtherlot4(String otherlot4) {
		this.otherlot4 = otherlot4;
	}
	public String getOtherlot3() {
		return otherlot3;
	}
	public void setOtherlot3(String otherlot3) {
		this.otherlot3 = otherlot3;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getLocationCd() {
		return locationCd;
	}
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}
	public String getLocationNm() {
		return locationNm;
	}
	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}
    //【TSN KGL030308_保税出庫関連リスト再出力】 2024.04.16 K.SATO ADD [E]
}
