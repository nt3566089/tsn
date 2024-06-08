package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRALLINV as TABLE. <br>
 * 統合在庫実績
 * <pre>
 * [primary-key]
 *     TRALLINV_ID
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, EXECUTEDATE, INOUTKBN, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, YDAYTLEQULYKEEPLOCINV, YDAYTLEQULYRECEIVELOCINV, YDAYTLEQULYDAMAGEITEM, YDAYTLEQULYCLSSIFYLOCINV, YDAYTLEQULYTMPLOCINV, YDAYTLEQULYAUTOINV, TDAYEQYTOTALINV, TDAYEQYKEEPLOCINV, TDAYEQYRECEIVELOCINV, TDAYEQYDAMAGEITEM, TDAYEQYCLSSIFYLOCINV, TDAYEQYTMPLOCINV, TDAYEQYAUTOINV, CAPITEMFLG, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRALLINV_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrallinvDto implements Serializable {

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
    /** TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trallinvId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** EXECUTEDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _executedate;

    /** INOUTKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtotalinv;

    /** SYSINVKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvkeeplocinv;

    /** SYSINVRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvreceivelocinv;

    /** SYSINVDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvdamageitem;

    /** SYSINVCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvclssifylocinv;

    /** SYSINVTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtmplocinv;

    /** SYSINVAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvautoinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investautoinv;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlykeeplocinv;

    /** YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlyreceivelocinv;

    /** YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlydamageitem;

    /** YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlyclssifylocinv;

    /** YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytmplocinv;

    /** YDAYTLEQULYAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlyautoinv;

    /** TDAYEQYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqytotalinv;

    /** TDAYEQYKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqykeeplocinv;

    /** TDAYEQYRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqyreceivelocinv;

    /** TDAYEQYDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqydamageitem;

    /** TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqyclssifylocinv;

    /** TDAYEQYTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqytmplocinv;

    /** TDAYEQYAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqyautoinv;

    /** CAPITEMFLG: {bigint(19)} */
    @JsonKey
    protected Long _capitemflg;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

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
    public BsTTrallinvDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrallinvDto)) { return false; }
        final BsTTrallinvDto otherEntity = (BsTTrallinvDto)other;
        if (!helpComparingValue(getTrallinvId(), otherEntity.getTrallinvId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRALLINV");
        result = xCH(result, getTrallinvId());
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
        sb.append(c).append(getTrallinvId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getExecutedate());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getSysinvtotalinv());
        sb.append(c).append(getSysinvkeeplocinv());
        sb.append(c).append(getSysinvreceivelocinv());
        sb.append(c).append(getSysinvdamageitem());
        sb.append(c).append(getSysinvclssifylocinv());
        sb.append(c).append(getSysinvtmplocinv());
        sb.append(c).append(getSysinvautoinv());
        sb.append(c).append(getInvesttotalinv());
        sb.append(c).append(getInvestkeeplocinv());
        sb.append(c).append(getInvestreceivelocinv());
        sb.append(c).append(getInvestdamageitem());
        sb.append(c).append(getInvestclssifylocinv());
        sb.append(c).append(getInvesttmplocinv());
        sb.append(c).append(getInvestautoinv());
        sb.append(c).append(getYdaytlequlytotalinv());
        sb.append(c).append(getYdaytlequlykeeplocinv());
        sb.append(c).append(getYdaytlequlyreceivelocinv());
        sb.append(c).append(getYdaytlequlydamageitem());
        sb.append(c).append(getYdaytlequlyclssifylocinv());
        sb.append(c).append(getYdaytlequlytmplocinv());
        sb.append(c).append(getYdaytlequlyautoinv());
        sb.append(c).append(getTdayeqytotalinv());
        sb.append(c).append(getTdayeqykeeplocinv());
        sb.append(c).append(getTdayeqyreceivelocinv());
        sb.append(c).append(getTdayeqydamageitem());
        sb.append(c).append(getTdayeqyclssifylocinv());
        sb.append(c).append(getTdayeqytmplocinv());
        sb.append(c).append(getTdayeqyautoinv());
        sb.append(c).append(getCapitemflg());
        sb.append(c).append(getProductId());
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
     * [get] TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 統合在庫実績ID
     * @return The value of the column 'TRALLINV_ID'. (NullAllowed)
     */
    public Long getTrallinvId() {
        return _trallinvId;
    }

    /**
     * [set] TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 統合在庫実績ID
     * @param trallinvId The value of the column 'TRALLINV_ID'. (NullAllowed)
     */
    public void setTrallinvId(Long trallinvId) {
        __modifiedProperties.add("trallinvId");
        this._trallinvId = trallinvId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] EXECUTEDATE: {NotNull, varchar(8)} <br>
     * 在庫実績日
     * @return The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public String getExecutedate() {
        return _executedate;
    }

    /**
     * [set] EXECUTEDATE: {NotNull, varchar(8)} <br>
     * 在庫実績日
     * @param executedate The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public void setExecutedate(String executedate) {
        __modifiedProperties.add("executedate");
        this._executedate = executedate;
    }

    /**
     * [get] INOUTKBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * システム適品在庫計
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * システム適品在庫計
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        __modifiedProperties.add("sysinvtotalinv");
        this._sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * システム保管場在庫
     * @return The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvkeeplocinv() {
        return _sysinvkeeplocinv;
    }

    /**
     * [set] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * システム保管場在庫
     * @param sysinvkeeplocinv The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public void setSysinvkeeplocinv(java.math.BigDecimal sysinvkeeplocinv) {
        __modifiedProperties.add("sysinvkeeplocinv");
        this._sysinvkeeplocinv = sysinvkeeplocinv;
    }

    /**
     * [get] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * システム引取場在庫
     * @return The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvreceivelocinv() {
        return _sysinvreceivelocinv;
    }

    /**
     * [set] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * システム引取場在庫
     * @param sysinvreceivelocinv The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public void setSysinvreceivelocinv(java.math.BigDecimal sysinvreceivelocinv) {
        __modifiedProperties.add("sysinvreceivelocinv");
        this._sysinvreceivelocinv = sysinvreceivelocinv;
    }

    /**
     * [get] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * システムかし品在庫
     * @return The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvdamageitem() {
        return _sysinvdamageitem;
    }

    /**
     * [set] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * システムかし品在庫
     * @param sysinvdamageitem The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public void setSysinvdamageitem(java.math.BigDecimal sysinvdamageitem) {
        __modifiedProperties.add("sysinvdamageitem");
        this._sysinvdamageitem = sysinvdamageitem;
    }

    /**
     * [get] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * システム仕分場在庫
     * @return The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvclssifylocinv() {
        return _sysinvclssifylocinv;
    }

    /**
     * [set] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * システム仕分場在庫
     * @param sysinvclssifylocinv The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setSysinvclssifylocinv(java.math.BigDecimal sysinvclssifylocinv) {
        __modifiedProperties.add("sysinvclssifylocinv");
        this._sysinvclssifylocinv = sysinvclssifylocinv;
    }

    /**
     * [get] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * システム仕分済在庫
     * @return The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtmplocinv() {
        return _sysinvtmplocinv;
    }

    /**
     * [set] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * システム仕分済在庫
     * @param sysinvtmplocinv The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public void setSysinvtmplocinv(java.math.BigDecimal sysinvtmplocinv) {
        __modifiedProperties.add("sysinvtmplocinv");
        this._sysinvtmplocinv = sysinvtmplocinv;
    }

    /**
     * [get] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * システム自動在庫
     * @return The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvautoinv() {
        return _sysinvautoinv;
    }

    /**
     * [set] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * システム自動在庫
     * @param sysinvautoinv The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public void setSysinvautoinv(java.math.BigDecimal sysinvautoinv) {
        __modifiedProperties.add("sysinvautoinv");
        this._sysinvautoinv = sysinvautoinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * 調査適品在庫計
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * 調査適品在庫計
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        __modifiedProperties.add("investtotalinv");
        this._investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * 調査保管場在庫
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * 調査保管場在庫
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        __modifiedProperties.add("investkeeplocinv");
        this._investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * 調査引取場在庫
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * 調査引取場在庫
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        __modifiedProperties.add("investreceivelocinv");
        this._investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * 調査かし品在庫
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * 調査かし品在庫
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        __modifiedProperties.add("investdamageitem");
        this._investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 調査仕分場在庫
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 調査仕分場在庫
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        __modifiedProperties.add("investclssifylocinv");
        this._investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * 調査仕分済在庫
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * 調査仕分済在庫
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        __modifiedProperties.add("investtmplocinv");
        this._investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * 調査自動在庫
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestautoinv() {
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * 調査自動在庫
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        __modifiedProperties.add("investautoinv");
        this._investautoinv = investautoinv;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * 過不足統計適品在庫計
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * 過不足統計適品在庫計
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        __modifiedProperties.add("ydaytlequlytotalinv");
        this._ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} <br>
     * 過不足統計保管場在庫
     * @return The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlykeeplocinv() {
        return _ydaytlequlykeeplocinv;
    }

    /**
     * [set] YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} <br>
     * 過不足統計保管場在庫
     * @param ydaytlequlykeeplocinv The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlykeeplocinv(java.math.BigDecimal ydaytlequlykeeplocinv) {
        __modifiedProperties.add("ydaytlequlykeeplocinv");
        this._ydaytlequlykeeplocinv = ydaytlequlykeeplocinv;
    }

    /**
     * [get] YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} <br>
     * 過不足統計引取場在庫
     * @return The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyreceivelocinv() {
        return _ydaytlequlyreceivelocinv;
    }

    /**
     * [set] YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} <br>
     * 過不足統計引取場在庫
     * @param ydaytlequlyreceivelocinv The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed)
     */
    public void setYdaytlequlyreceivelocinv(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        __modifiedProperties.add("ydaytlequlyreceivelocinv");
        this._ydaytlequlyreceivelocinv = ydaytlequlyreceivelocinv;
    }

    /**
     * [get] YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} <br>
     * 過不足統計かし品在庫
     * @return The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlydamageitem() {
        return _ydaytlequlydamageitem;
    }

    /**
     * [set] YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} <br>
     * 過不足統計かし品在庫
     * @param ydaytlequlydamageitem The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed)
     */
    public void setYdaytlequlydamageitem(java.math.BigDecimal ydaytlequlydamageitem) {
        __modifiedProperties.add("ydaytlequlydamageitem");
        this._ydaytlequlydamageitem = ydaytlequlydamageitem;
    }

    /**
     * [get] YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 過不足統計仕分場在庫
     * @return The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyclssifylocinv() {
        return _ydaytlequlyclssifylocinv;
    }

    /**
     * [set] YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 過不足統計仕分場在庫
     * @param ydaytlequlyclssifylocinv The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlyclssifylocinv(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        __modifiedProperties.add("ydaytlequlyclssifylocinv");
        this._ydaytlequlyclssifylocinv = ydaytlequlyclssifylocinv;
    }

    /**
     * [get] YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} <br>
     * 過不足統計仕分済在庫
     * @return The value of the column 'YDAYTLEQULYTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytmplocinv() {
        return _ydaytlequlytmplocinv;
    }

    /**
     * [set] YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} <br>
     * 過不足統計仕分済在庫
     * @param ydaytlequlytmplocinv The value of the column 'YDAYTLEQULYTMPLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlytmplocinv(java.math.BigDecimal ydaytlequlytmplocinv) {
        __modifiedProperties.add("ydaytlequlytmplocinv");
        this._ydaytlequlytmplocinv = ydaytlequlytmplocinv;
    }

    /**
     * [get] YDAYTLEQULYAUTOINV: {decimal(16, 6)} <br>
     * 過不足統計自動在庫
     * @return The value of the column 'YDAYTLEQULYAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyautoinv() {
        return _ydaytlequlyautoinv;
    }

    /**
     * [set] YDAYTLEQULYAUTOINV: {decimal(16, 6)} <br>
     * 過不足統計自動在庫
     * @param ydaytlequlyautoinv The value of the column 'YDAYTLEQULYAUTOINV'. (NullAllowed)
     */
    public void setYdaytlequlyautoinv(java.math.BigDecimal ydaytlequlyautoinv) {
        __modifiedProperties.add("ydaytlequlyautoinv");
        this._ydaytlequlyautoinv = ydaytlequlyautoinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * 過不足当日適品在庫計
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * 過不足当日適品在庫計
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        __modifiedProperties.add("tdayeqytotalinv");
        this._tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] TDAYEQYKEEPLOCINV: {decimal(16, 6)} <br>
     * 過不足当日保管場在庫
     * @return The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqykeeplocinv() {
        return _tdayeqykeeplocinv;
    }

    /**
     * [set] TDAYEQYKEEPLOCINV: {decimal(16, 6)} <br>
     * 過不足当日保管場在庫
     * @param tdayeqykeeplocinv The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed)
     */
    public void setTdayeqykeeplocinv(java.math.BigDecimal tdayeqykeeplocinv) {
        __modifiedProperties.add("tdayeqykeeplocinv");
        this._tdayeqykeeplocinv = tdayeqykeeplocinv;
    }

    /**
     * [get] TDAYEQYRECEIVELOCINV: {decimal(16, 6)} <br>
     * 過不足当日引取場在庫
     * @return The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyreceivelocinv() {
        return _tdayeqyreceivelocinv;
    }

    /**
     * [set] TDAYEQYRECEIVELOCINV: {decimal(16, 6)} <br>
     * 過不足当日引取場在庫
     * @param tdayeqyreceivelocinv The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed)
     */
    public void setTdayeqyreceivelocinv(java.math.BigDecimal tdayeqyreceivelocinv) {
        __modifiedProperties.add("tdayeqyreceivelocinv");
        this._tdayeqyreceivelocinv = tdayeqyreceivelocinv;
    }

    /**
     * [get] TDAYEQYDAMAGEITEM: {decimal(16, 6)} <br>
     * 過不足当日かし品在庫
     * @return The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqydamageitem() {
        return _tdayeqydamageitem;
    }

    /**
     * [set] TDAYEQYDAMAGEITEM: {decimal(16, 6)} <br>
     * 過不足当日かし品在庫
     * @param tdayeqydamageitem The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed)
     */
    public void setTdayeqydamageitem(java.math.BigDecimal tdayeqydamageitem) {
        __modifiedProperties.add("tdayeqydamageitem");
        this._tdayeqydamageitem = tdayeqydamageitem;
    }

    /**
     * [get] TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 過不足当日仕分場在庫
     * @return The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyclssifylocinv() {
        return _tdayeqyclssifylocinv;
    }

    /**
     * [set] TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 過不足当日仕分場在庫
     * @param tdayeqyclssifylocinv The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setTdayeqyclssifylocinv(java.math.BigDecimal tdayeqyclssifylocinv) {
        __modifiedProperties.add("tdayeqyclssifylocinv");
        this._tdayeqyclssifylocinv = tdayeqyclssifylocinv;
    }

    /**
     * [get] TDAYEQYTMPLOCINV: {decimal(16, 6)} <br>
     * 過不足当日仕分済在庫
     * @return The value of the column 'TDAYEQYTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytmplocinv() {
        return _tdayeqytmplocinv;
    }

    /**
     * [set] TDAYEQYTMPLOCINV: {decimal(16, 6)} <br>
     * 過不足当日仕分済在庫
     * @param tdayeqytmplocinv The value of the column 'TDAYEQYTMPLOCINV'. (NullAllowed)
     */
    public void setTdayeqytmplocinv(java.math.BigDecimal tdayeqytmplocinv) {
        __modifiedProperties.add("tdayeqytmplocinv");
        this._tdayeqytmplocinv = tdayeqytmplocinv;
    }

    /**
     * [get] TDAYEQYAUTOINV: {decimal(16, 6)} <br>
     * 過不足当日自動在庫
     * @return The value of the column 'TDAYEQYAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyautoinv() {
        return _tdayeqyautoinv;
    }

    /**
     * [set] TDAYEQYAUTOINV: {decimal(16, 6)} <br>
     * 過不足当日自動在庫
     * @param tdayeqyautoinv The value of the column 'TDAYEQYAUTOINV'. (NullAllowed)
     */
    public void setTdayeqyautoinv(java.math.BigDecimal tdayeqyautoinv) {
        __modifiedProperties.add("tdayeqyautoinv");
        this._tdayeqyautoinv = tdayeqyautoinv;
    }

    /**
     * [get] CAPITEMFLG: {bigint(19)} <br>
     * CAP銘柄区分
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public Long getCapitemflg() {
        return _capitemflg;
    }

    /**
     * [set] CAPITEMFLG: {bigint(19)} <br>
     * CAP銘柄区分
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public void setCapitemflg(Long capitemflg) {
        __modifiedProperties.add("capitemflg");
        this._capitemflg = capitemflg;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
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
