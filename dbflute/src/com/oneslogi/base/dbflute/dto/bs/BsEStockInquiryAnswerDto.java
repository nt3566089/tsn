package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_STOCK_INQUIRY_ANSWER as TABLE. <br>
 * 在庫照会回答送信テーブル
 * <pre>
 * [primary-key]
 *     TRINVREANSWER_ID
 *
 * [column]
 *     TRINVREANSWER_ID, INVINQNO, INVINQDATE, COMPANYCD, PRODUCT_CD, MANUFACTURDATE, DESIGNCD, STOCKKBN, STOCKQTY, TRANSPORTCD, FIRMCARRYNO, SHIPCD, SHIPSCHDATE, RECEIVEDATE, RCVSCHDATE, EXPECTQTY, GETDATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVREANSWER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsEStockInquiryAnswerDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trinvreanswerId;

    /** INVINQNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _invinqno;

    /** INVINQDATE: {UQ+, IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _invinqdate;

    /** COMPANYCD: {+UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _companycd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** MANUFACTURDATE: {varchar(8)} */
    @JsonKey
    protected String _manufacturdate;

    /** DESIGNCD: {varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** STOCKKBN: {varchar(30)} */
    @JsonKey
    protected String _stockkbn;

    /** STOCKQTY: {bigint(19), default=[0000000000000]} */
    @JsonKey
    protected Long _stockqty;

    /** TRANSPORTCD: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** FIRMCARRYNO: {varchar(30)} */
    @JsonKey
    protected String _firmcarryno;

    /** SHIPCD: {varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** SHIPSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** RCVSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvschdate;

    /** EXPECTQTY: {bigint(19)} */
    @JsonKey
    protected Long _expectqty;

    /** GETDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _getdate;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEStockInquiryAnswerDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsEStockInquiryAnswerDto)) { return false; }
        final BsEStockInquiryAnswerDto otherEntity = (BsEStockInquiryAnswerDto)other;
        if (!helpComparingValue(getTrinvreanswerId(), otherEntity.getTrinvreanswerId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_STOCK_INQUIRY_ANSWER");
        result = xCH(result, getTrinvreanswerId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getTrinvreanswerId());
        sb.append(c).append(getInvinqno());
        sb.append(c).append(getInvinqdate());
        sb.append(c).append(getCompanycd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getManufacturdate());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getStockkbn());
        sb.append(c).append(getStockqty());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getRcvschdate());
        sb.append(c).append(getExpectqty());
        sb.append(c).append(getGetdate());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫照会回答情報送信ID
     * @return The value of the column 'TRINVREANSWER_ID'. (NullAllowed)
     */
    public Long getTrinvreanswerId() {
        return _trinvreanswerId;
    }

    /**
     * [set] TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫照会回答情報送信ID
     * @param trinvreanswerId The value of the column 'TRINVREANSWER_ID'. (NullAllowed)
     */
    public void setTrinvreanswerId(Long trinvreanswerId) {
        __modifiedProperties.add("trinvreanswerId");
        this._trinvreanswerId = trinvreanswerId;
    }

    /**
     * [get] INVINQNO: {NotNull, varchar(30)} <br>
     * 在庫照会No.
     * @return The value of the column 'INVINQNO'. (NullAllowed)
     */
    public String getInvinqno() {
        return _invinqno;
    }

    /**
     * [set] INVINQNO: {NotNull, varchar(30)} <br>
     * 在庫照会No.
     * @param invinqno The value of the column 'INVINQNO'. (NullAllowed)
     */
    public void setInvinqno(String invinqno) {
        __modifiedProperties.add("invinqno");
        this._invinqno = invinqno;
    }

    /**
     * [get] INVINQDATE: {UQ+, IX, NotNull, varchar(8)} <br>
     * 在庫照会日
     * @return The value of the column 'INVINQDATE'. (NullAllowed)
     */
    public String getInvinqdate() {
        return _invinqdate;
    }

    /**
     * [set] INVINQDATE: {UQ+, IX, NotNull, varchar(8)} <br>
     * 在庫照会日
     * @param invinqdate The value of the column 'INVINQDATE'. (NullAllowed)
     */
    public void setInvinqdate(String invinqdate) {
        __modifiedProperties.add("invinqdate");
        this._invinqdate = invinqdate;
    }

    /**
     * [get] COMPANYCD: {+UQ, NotNull, varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public String getCompanycd() {
        return _companycd;
    }

    /**
     * [set] COMPANYCD: {+UQ, NotNull, varchar(30)} <br>
     * 組織CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public void setCompanycd(String companycd) {
        __modifiedProperties.add("companycd");
        this._companycd = companycd;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] MANUFACTURDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURDATE'. (NullAllowed)
     */
    public String getManufacturdate() {
        return _manufacturdate;
    }

    /**
     * [set] MANUFACTURDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturdate The value of the column 'MANUFACTURDATE'. (NullAllowed)
     */
    public void setManufacturdate(String manufacturdate) {
        __modifiedProperties.add("manufacturdate");
        this._manufacturdate = manufacturdate;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] STOCKKBN: {varchar(30)} <br>
     * 在庫区分
     * @return The value of the column 'STOCKKBN'. (NullAllowed)
     */
    public String getStockkbn() {
        return _stockkbn;
    }

    /**
     * [set] STOCKKBN: {varchar(30)} <br>
     * 在庫区分
     * @param stockkbn The value of the column 'STOCKKBN'. (NullAllowed)
     */
    public void setStockkbn(String stockkbn) {
        __modifiedProperties.add("stockkbn");
        this._stockkbn = stockkbn;
    }

    /**
     * [get] STOCKQTY: {bigint(19), default=[0000000000000]} <br>
     * 在庫数量
     * @return The value of the column 'STOCKQTY'. (NullAllowed)
     */
    public Long getStockqty() {
        return _stockqty;
    }

    /**
     * [set] STOCKQTY: {bigint(19), default=[0000000000000]} <br>
     * 在庫数量
     * @param stockqty The value of the column 'STOCKQTY'. (NullAllowed)
     */
    public void setStockqty(Long stockqty) {
        __modifiedProperties.add("stockqty");
        this._stockqty = stockqty;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号(整理番号)
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号(整理番号)
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] SHIPCD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {varchar(30)} <br>
     * 発送元CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定年月日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public String getRcvschdate() {
        return _rcvschdate;
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定年月日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public void setRcvschdate(String rcvschdate) {
        __modifiedProperties.add("rcvschdate");
        this._rcvschdate = rcvschdate;
    }

    /**
     * [get] EXPECTQTY: {bigint(19)} <br>
     * 受入予定数量
     * @return The value of the column 'EXPECTQTY'. (NullAllowed)
     */
    public Long getExpectqty() {
        return _expectqty;
    }

    /**
     * [set] EXPECTQTY: {bigint(19)} <br>
     * 受入予定数量
     * @param expectqty The value of the column 'EXPECTQTY'. (NullAllowed)
     */
    public void setExpectqty(Long expectqty) {
        __modifiedProperties.add("expectqty");
        this._expectqty = expectqty;
    }

    /**
     * [get] GETDATE: {NotNull, varchar(8)} <br>
     * データ取得日時
     * @return The value of the column 'GETDATE'. (NullAllowed)
     */
    public String getGetdate() {
        return _getdate;
    }

    /**
     * [set] GETDATE: {NotNull, varchar(8)} <br>
     * データ取得日時
     * @param getdate The value of the column 'GETDATE'. (NullAllowed)
     */
    public void setGetdate(String getdate) {
        __modifiedProperties.add("getdate");
        this._getdate = getdate;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
