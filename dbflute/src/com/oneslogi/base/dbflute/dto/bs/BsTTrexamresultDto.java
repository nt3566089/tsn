package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TREXAMRESULT as TABLE. <br>
 * 検査実績
 * <pre>
 * [primary-key]
 *     TREXAMRESULT_ID
 *
 * [column]
 *     TREXAMRESULT_ID, CLIENT_ID, CENTER_ID, SUPPLIERRCVNO, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOT_ID, EXAMSTS, EXAMENDSTS, ADDFLG, RECEIVEDATE, SENDFLG, EXAMQTY, RES40QTY, INFERIORQTY, NOTEXAMQTY, FIRSTEXAMSENDFLG, QUALITYEXAMFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TREXAMRESULT_ID
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
public abstract class BsTTrexamresultDto implements Serializable {

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
    /** TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trexamresultId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** SUPPLIERRCVNO: {varchar(60)} */
    @JsonKey
    protected String _supplierrcvno;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT5: {varchar(8)} */
    @JsonKey
    protected String _lot5;

    /** OTHERLOT2: {varchar(60)} */
    @JsonKey
    protected String _otherlot2;

    /** OTHERLOT3: {varchar(60)} */
    @JsonKey
    protected String _otherlot3;

    /** OTHERLOT4: {varchar(60)} */
    @JsonKey
    protected String _otherlot4;

    /** OTHERLOT5: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _otherlot5;

    /** DAMAGEFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _damageflg;

    /** NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _noshippingflg;

    /** FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _customsreleaseflg;

    /** TAXFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _taxflg;

    /** LOT_ID: {bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** EXAMSTS: {char(1), default=[(0)]} */
    @JsonKey
    protected String _examsts;

    /** EXAMENDSTS: {char(1), default=[(0)]} */
    @JsonKey
    protected String _examendsts;

    /** ADDFLG: {char(1)} */
    @JsonKey
    protected String _addflg;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** SENDFLG: {char(1)} */
    @JsonKey
    protected String _sendflg;

    /** EXAMQTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _examqty;

    /** RES40QTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _res40qty;

    /** INFERIORQTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _inferiorqty;

    /** NOTEXAMQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _notexamqty;

    /** FIRSTEXAMSENDFLG: {char(1)} */
    @JsonKey
    protected String _firstexamsendflg;

    /** QUALITYEXAMFLG: {char(1), default=[(0)]} */
    @JsonKey
    protected String _qualityexamflg;

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
    public BsTTrexamresultDto() {
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
        if (other == null || !(other instanceof BsTTrexamresultDto)) { return false; }
        final BsTTrexamresultDto otherEntity = (BsTTrexamresultDto)other;
        if (!helpComparingValue(getTrexamresultId(), otherEntity.getTrexamresultId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TREXAMRESULT");
        result = xCH(result, getTrexamresultId());
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
        sb.append(c).append(getTrexamresultId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot5());
        sb.append(c).append(getOtherlot2());
        sb.append(c).append(getOtherlot3());
        sb.append(c).append(getOtherlot4());
        sb.append(c).append(getOtherlot5());
        sb.append(c).append(getDamageflg());
        sb.append(c).append(getNoshippingflg());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getCustomsreleaseflg());
        sb.append(c).append(getTaxflg());
        sb.append(c).append(getLotId());
        sb.append(c).append(getExamsts());
        sb.append(c).append(getExamendsts());
        sb.append(c).append(getAddflg());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getSendflg());
        sb.append(c).append(getExamqty());
        sb.append(c).append(getRes40qty());
        sb.append(c).append(getInferiorqty());
        sb.append(c).append(getNotexamqty());
        sb.append(c).append(getFirstexamsendflg());
        sb.append(c).append(getQualityexamflg());
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
     * [get] TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績ID
     * @return The value of the column 'TREXAMRESULT_ID'. (NullAllowed)
     */
    public Long getTrexamresultId() {
        return _trexamresultId;
    }

    /**
     * [set] TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 検査実績ID
     * @param trexamresultId The value of the column 'TREXAMRESULT_ID'. (NullAllowed)
     */
    public void setTrexamresultId(Long trexamresultId) {
        __modifiedProperties.add("trexamresultId");
        this._trexamresultId = trexamresultId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @return The value of the column 'LOT5'. (NullAllowed)
     */
    public String getLot5() {
        return _lot5;
    }

    /**
     * [set] LOT5: {varchar(8)} <br>
     * 管理５（日付属性２）
     * @param lot5 The value of the column 'LOT5'. (NullAllowed)
     */
    public void setLot5(String lot5) {
        __modifiedProperties.add("lot5");
        this._lot5 = lot5;
    }

    /**
     * [get] OTHERLOT2: {varchar(60)} <br>
     * その他属性２
     * @return The value of the column 'OTHERLOT2'. (NullAllowed)
     */
    public String getOtherlot2() {
        return _otherlot2;
    }

    /**
     * [set] OTHERLOT2: {varchar(60)} <br>
     * その他属性２
     * @param otherlot2 The value of the column 'OTHERLOT2'. (NullAllowed)
     */
    public void setOtherlot2(String otherlot2) {
        __modifiedProperties.add("otherlot2");
        this._otherlot2 = otherlot2;
    }

    /**
     * [get] OTHERLOT3: {varchar(60)} <br>
     * その他属性３
     * @return The value of the column 'OTHERLOT3'. (NullAllowed)
     */
    public String getOtherlot3() {
        return _otherlot3;
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * その他属性３
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed)
     */
    public void setOtherlot3(String otherlot3) {
        __modifiedProperties.add("otherlot3");
        this._otherlot3 = otherlot3;
    }

    /**
     * [get] OTHERLOT4: {varchar(60)} <br>
     * その他属性４
     * @return The value of the column 'OTHERLOT4'. (NullAllowed)
     */
    public String getOtherlot4() {
        return _otherlot4;
    }

    /**
     * [set] OTHERLOT4: {varchar(60)} <br>
     * その他属性４
     * @param otherlot4 The value of the column 'OTHERLOT4'. (NullAllowed)
     */
    public void setOtherlot4(String otherlot4) {
        __modifiedProperties.add("otherlot4");
        this._otherlot4 = otherlot4;
    }

    /**
     * [get] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @return The value of the column 'OTHERLOT5'. (NullAllowed)
     */
    public java.math.BigDecimal getOtherlot5() {
        return _otherlot5;
    }

    /**
     * [set] OTHERLOT5: {decimal(16, 6)} <br>
     * その他属性５（数値）
     * @param otherlot5 The value of the column 'OTHERLOT5'. (NullAllowed)
     */
    public void setOtherlot5(java.math.BigDecimal otherlot5) {
        __modifiedProperties.add("otherlot5");
        this._otherlot5 = otherlot5;
    }

    /**
     * [get] DAMAGEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getDamageflg() {
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        __modifiedProperties.add("damageflg");
        this._damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getNoshippingflg() {
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        __modifiedProperties.add("noshippingflg");
        this._noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        __modifiedProperties.add("customsreleaseflg");
        this._customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getTaxflg() {
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (NullAllowed)
     */
    public void setTaxflg(java.math.BigDecimal taxflg) {
        __modifiedProperties.add("taxflg");
        this._taxflg = taxflg;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] EXAMSTS: {char(1), default=[(0)]} <br>
     * 検査ステータス
     * @return The value of the column 'EXAMSTS'. (NullAllowed)
     */
    public String getExamsts() {
        return _examsts;
    }

    /**
     * [set] EXAMSTS: {char(1), default=[(0)]} <br>
     * 検査ステータス
     * @param examsts The value of the column 'EXAMSTS'. (NullAllowed)
     */
    public void setExamsts(String examsts) {
        __modifiedProperties.add("examsts");
        this._examsts = examsts;
    }

    /**
     * [get] EXAMENDSTS: {char(1), default=[(0)]} <br>
     * 完了ステータス
     * @return The value of the column 'EXAMENDSTS'. (NullAllowed)
     */
    public String getExamendsts() {
        return _examendsts;
    }

    /**
     * [set] EXAMENDSTS: {char(1), default=[(0)]} <br>
     * 完了ステータス
     * @param examendsts The value of the column 'EXAMENDSTS'. (NullAllowed)
     */
    public void setExamendsts(String examendsts) {
        __modifiedProperties.add("examendsts");
        this._examendsts = examendsts;
    }

    /**
     * [get] ADDFLG: {char(1)} <br>
     * 作成区分
     * @return The value of the column 'ADDFLG'. (NullAllowed)
     */
    public String getAddflg() {
        return _addflg;
    }

    /**
     * [set] ADDFLG: {char(1)} <br>
     * 作成区分
     * @param addflg The value of the column 'ADDFLG'. (NullAllowed)
     */
    public void setAddflg(String addflg) {
        __modifiedProperties.add("addflg");
        this._addflg = addflg;
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
     * [get] SENDFLG: {char(1)} <br>
     * 送信フラグ
     * @return The value of the column 'SENDFLG'. (NullAllowed)
     */
    public String getSendflg() {
        return _sendflg;
    }

    /**
     * [set] SENDFLG: {char(1)} <br>
     * 送信フラグ
     * @param sendflg The value of the column 'SENDFLG'. (NullAllowed)
     */
    public void setSendflg(String sendflg) {
        __modifiedProperties.add("sendflg");
        this._sendflg = sendflg;
    }

    /**
     * [get] EXAMQTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査予定数量（個装）
     * @return The value of the column 'EXAMQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getExamqty() {
        return _examqty;
    }

    /**
     * [set] EXAMQTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査予定数量（個装）
     * @param examqty The value of the column 'EXAMQTY'. (NullAllowed)
     */
    public void setExamqty(java.math.BigDecimal examqty) {
        __modifiedProperties.add("examqty");
        this._examqty = examqty;
    }

    /**
     * [get] RES40QTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査済正常品数量（個装）
     * @return The value of the column 'RES40QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getRes40qty() {
        return _res40qty;
    }

    /**
     * [set] RES40QTY: {decimal(16, 6), default=[(0)]} <br>
     * 検査済正常品数量（個装）
     * @param res40qty The value of the column 'RES40QTY'. (NullAllowed)
     */
    public void setRes40qty(java.math.BigDecimal res40qty) {
        __modifiedProperties.add("res40qty");
        this._res40qty = res40qty;
    }

    /**
     * [get] INFERIORQTY: {decimal(16, 6), default=[(0)]} <br>
     * 不良品数量（個装）
     * @return The value of the column 'INFERIORQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getInferiorqty() {
        return _inferiorqty;
    }

    /**
     * [set] INFERIORQTY: {decimal(16, 6), default=[(0)]} <br>
     * 不良品数量（個装）
     * @param inferiorqty The value of the column 'INFERIORQTY'. (NullAllowed)
     */
    public void setInferiorqty(java.math.BigDecimal inferiorqty) {
        __modifiedProperties.add("inferiorqty");
        this._inferiorqty = inferiorqty;
    }

    /**
     * [get] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @return The value of the column 'NOTEXAMQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getNotexamqty() {
        return _notexamqty;
    }

    /**
     * [set] NOTEXAMQTY: {decimal(16, 6)} <br>
     * 検査対象外数量(個装）
     * @param notexamqty The value of the column 'NOTEXAMQTY'. (NullAllowed)
     */
    public void setNotexamqty(java.math.BigDecimal notexamqty) {
        __modifiedProperties.add("notexamqty");
        this._notexamqty = notexamqty;
    }

    /**
     * [get] FIRSTEXAMSENDFLG: {char(1)} <br>
     * １次検査開始送信フラグ
     * @return The value of the column 'FIRSTEXAMSENDFLG'. (NullAllowed)
     */
    public String getFirstexamsendflg() {
        return _firstexamsendflg;
    }

    /**
     * [set] FIRSTEXAMSENDFLG: {char(1)} <br>
     * １次検査開始送信フラグ
     * @param firstexamsendflg The value of the column 'FIRSTEXAMSENDFLG'. (NullAllowed)
     */
    public void setFirstexamsendflg(String firstexamsendflg) {
        __modifiedProperties.add("firstexamsendflg");
        this._firstexamsendflg = firstexamsendflg;
    }

    /**
     * [get] QUALITYEXAMFLG: {char(1), default=[(0)]} <br>
     * 品質検査実施フラグ
     * @return The value of the column 'QUALITYEXAMFLG'. (NullAllowed)
     */
    public String getQualityexamflg() {
        return _qualityexamflg;
    }

    /**
     * [set] QUALITYEXAMFLG: {char(1), default=[(0)]} <br>
     * 品質検査実施フラグ
     * @param qualityexamflg The value of the column 'QUALITYEXAMFLG'. (NullAllowed)
     */
    public void setQualityexamflg(String qualityexamflg) {
        __modifiedProperties.add("qualityexamflg");
        this._qualityexamflg = qualityexamflg;
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
