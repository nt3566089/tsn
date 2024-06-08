package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMLocationDto;

/**
 * The entity of M_LOCATION.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MLocationDto extends BsMLocationDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** 行番号 */
    private String lineNo;
    /** ロケーションCD(From) */
    private String locationCdFrom;
    /** ロケーションCD(To) */
    private String locationCdTo;
	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(受信ID削除) 2016.09.09 honma
    /** エラーのみ表示 */
    private String chkErrorShow;
    /** 荷主CD */
    private String clientCd;
    /** センタCD */
    private String centerCd;
    /** エラー処理方法 */
    private String errorProcessMet;
    /** 検索件数 */
    private int counter;
    private String errorFlg;
    // [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
    /** ロケーションNM(From) */
    private String locationNmFrom;
    /** ロケーションNM(To) */
    private String locationNmTo;
    // [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	public String getErrorFlg() {
		return errorFlg;
	}

	public void setErrorFlg(String errorFlg) {
		this.errorFlg = errorFlg;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(受信ID削除) 2016.09.09 honma

	public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

	public String getLocationCdFrom() {
		return locationCdFrom;
	}

	public void setLocationCdFrom(String locationCdFrom) {
		this.locationCdFrom = locationCdFrom;
	}

	public String getLocationCdTo() {
		return locationCdTo;
	}

	public void setLocationCdTo(String locationCdTo) {
		this.locationCdTo = locationCdTo;
	}

   //[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
    private Long clientId;

    public Long getClientId() {
		return clientId;
	}

    public void setClientId(Long clientId) {
    	this.clientId = clientId;
    }
    //[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End

    // [1.1.4-CT-061] 検索条件に補充商品未設定を追加 2016.06.03 ichikawa Start
    private String replenishProductCdUnset;

    public String getReplenishProductCdUnset() {
    	return replenishProductCdUnset;
    }

    public void setReplenishProductCdUnset(String replenishProductCdUnset) {
    	this.replenishProductCdUnset = replenishProductCdUnset;
    }
    // [1.1.4-CT-061] 検索条件に補充商品未設定を追加 2016.06.03 ichikawa End

    // [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	public String getLocationNmFrom() {
		return locationNmFrom;
	}

	public void setLocationNmFrom(String locationNmFrom) {
		this.locationNmFrom = locationNmFrom;
	}

	public String getLocationNmTo() {
		return locationNmTo;
	}

	public void setLocationNmTo(String locationNmTo) {
		this.locationNmTo = locationNmTo;
	}
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start

}
