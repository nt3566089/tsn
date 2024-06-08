package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTSerialNoDto;

/**
 * The entity of t_serial_no.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TSerialNoDto extends BsTSerialNoDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 導出カラム =====

	/** シリアルNo.(From) */
	private String serialNoFrom;

	/** シリアルNo.(To) */
	private String serialNoTo;

	/** 入荷日(From) */
	private String receiveDtFrom;

	/** 入荷日(To) */
	private String receiveDtTo;

	/** 出荷日(From) */
	private String shippingDtFrom;

	/** 出荷日(To) */
	private String shippingDtTo;

	/** エラーのみ表示 */
	private String chkErrorShow;

	/** エラー処理方法 */
	private String errorProcessMet;

	/** エラーメッセージ */
	private String errorFlg;
	private String errorMessageCd;
	private String errorMessageNm;

	/** シリアルNo.受信テーブルID */
	private Long serialInputId;
	private Long eReceiveVerNo;

	/** 行番号 */
	private long lineNo;

	/** 処理区分 */
	private String processType;
	private String processTypeNm;

	/** 仕入先ID */
	private Long supplierId;

	/** 納品先ID */
	private Long supplyCustomerId;

	/** 作業日 */
	private String workDt;

	// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除(変数spgWorkComment削除) 2018.12.14 kawana Delete

	// ===== 以下、ゲッタとセッタ =====

	public String getSerialNoFrom() {
		return serialNoFrom;
	}

	public void setSerialNoFrom(String serialNoFrom) {
		this.serialNoFrom = serialNoFrom;
	}

	public String getSerialNoTo() {
		return serialNoTo;
	}

	public void setSerialNoTo(String serialNoTo) {
		this.serialNoTo = serialNoTo;
	}

	public String getReceiveDtFrom() {
		return receiveDtFrom;
	}

	public void setReceiveDtFrom(String receiveDtFrom) {
		this.receiveDtFrom = receiveDtFrom;
	}

	public String getReceiveDtTo() {
		return receiveDtTo;
	}

	public void setReceiveDtTo(String receiveDtTo) {
		this.receiveDtTo = receiveDtTo;
	}

	public String getShippingDtFrom() {
		return shippingDtFrom;
	}

	public void setShippingDtFrom(String shippingDtFrom) {
		this.shippingDtFrom = shippingDtFrom;
	}

	public String getShippingDtTo() {
		return shippingDtTo;
	}

	public void setShippingDtTo(String shippingDtTo) {
		this.shippingDtTo = shippingDtTo;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

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

	public Long getSerialInputId() {
		return serialInputId;
	}

	public void setSerialInputId(Long serialInputId) {
		this.serialInputId = serialInputId;
	}

	public Long geteReceiveVerNo() {
		return eReceiveVerNo;
	}

	public void seteReceiveVerNo(Long eReceiveVerNo) {
		this.eReceiveVerNo = eReceiveVerNo;
	}

	public long getLineNo() {
		return lineNo;
	}

	public void setLineNo(long lineNo) {
		this.lineNo = lineNo;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getProcessTypeNm() {
		return processTypeNm;
	}

	public void setProcessTypeNm(String processTypeNm) {
		this.processTypeNm = processTypeNm;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getSupplyCustomerId() {
		return supplyCustomerId;
	}

	public void setSupplyCustomerId(Long supplyCustomerId) {
		this.supplyCustomerId = supplyCustomerId;
	}

	public String getWorkDt() {
		return workDt;
	}

	public void setWorkDt(String workDt) {
		this.workDt = workDt;
	}
}
