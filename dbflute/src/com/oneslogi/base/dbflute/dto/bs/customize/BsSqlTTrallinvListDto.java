package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTTrallinvList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, EXECUTEDATE, INOUTKBN, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, YDAYTLEQULYKEEPLOCINV, YDAYTLEQULYRECEIVELOCINV, YDAYTLEQULYDAMAGEITEM, YDAYTLEQULYCLSSIFYLOCINV, YDAYTLEQULYTMPLOCINV, YDAYTLEQULYAUTOINV, TDAYEQYTOTALINV, TDAYEQYKEEPLOCINV, TDAYEQYRECEIVELOCINV, TDAYEQYDAMAGEITEM, TDAYEQYCLSSIFYLOCINV, TDAYEQYTMPLOCINV, TDAYEQYAUTOINV, CAPITEMFLG, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsSqlTTrallinvListDto implements Serializable {

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
    /** TRALLINV_ID: {bigint(19)} */
    @JsonKey
    protected Long _trallinvId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** EXECUTEDATE: {varchar(8)} */
    @JsonKey
    protected String _executedate;

    /** INOUTKBN: {varchar(30)} */
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

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
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
    public BsSqlTTrallinvListDto() {
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
        if (other == null || !(other instanceof BsSqlTTrallinvListDto)) { return false; }
        final BsSqlTTrallinvListDto otherEntity = (BsSqlTTrallinvListDto)other;
        if (!helpComparingValue(getTrallinvId(), otherEntity.getTrallinvId())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getExecutedate(), otherEntity.getExecutedate())) { return false; }
        if (!helpComparingValue(getInoutkbn(), otherEntity.getInoutkbn())) { return false; }
        if (!helpComparingValue(getSysinvtotalinv(), otherEntity.getSysinvtotalinv())) { return false; }
        if (!helpComparingValue(getSysinvkeeplocinv(), otherEntity.getSysinvkeeplocinv())) { return false; }
        if (!helpComparingValue(getSysinvreceivelocinv(), otherEntity.getSysinvreceivelocinv())) { return false; }
        if (!helpComparingValue(getSysinvdamageitem(), otherEntity.getSysinvdamageitem())) { return false; }
        if (!helpComparingValue(getSysinvclssifylocinv(), otherEntity.getSysinvclssifylocinv())) { return false; }
        if (!helpComparingValue(getSysinvtmplocinv(), otherEntity.getSysinvtmplocinv())) { return false; }
        if (!helpComparingValue(getSysinvautoinv(), otherEntity.getSysinvautoinv())) { return false; }
        if (!helpComparingValue(getInvesttotalinv(), otherEntity.getInvesttotalinv())) { return false; }
        if (!helpComparingValue(getInvestkeeplocinv(), otherEntity.getInvestkeeplocinv())) { return false; }
        if (!helpComparingValue(getInvestreceivelocinv(), otherEntity.getInvestreceivelocinv())) { return false; }
        if (!helpComparingValue(getInvestdamageitem(), otherEntity.getInvestdamageitem())) { return false; }
        if (!helpComparingValue(getInvestclssifylocinv(), otherEntity.getInvestclssifylocinv())) { return false; }
        if (!helpComparingValue(getInvesttmplocinv(), otherEntity.getInvesttmplocinv())) { return false; }
        if (!helpComparingValue(getInvestautoinv(), otherEntity.getInvestautoinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlytotalinv(), otherEntity.getYdaytlequlytotalinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlykeeplocinv(), otherEntity.getYdaytlequlykeeplocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlyreceivelocinv(), otherEntity.getYdaytlequlyreceivelocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlydamageitem(), otherEntity.getYdaytlequlydamageitem())) { return false; }
        if (!helpComparingValue(getYdaytlequlyclssifylocinv(), otherEntity.getYdaytlequlyclssifylocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlytmplocinv(), otherEntity.getYdaytlequlytmplocinv())) { return false; }
        if (!helpComparingValue(getYdaytlequlyautoinv(), otherEntity.getYdaytlequlyautoinv())) { return false; }
        if (!helpComparingValue(getTdayeqytotalinv(), otherEntity.getTdayeqytotalinv())) { return false; }
        if (!helpComparingValue(getTdayeqykeeplocinv(), otherEntity.getTdayeqykeeplocinv())) { return false; }
        if (!helpComparingValue(getTdayeqyreceivelocinv(), otherEntity.getTdayeqyreceivelocinv())) { return false; }
        if (!helpComparingValue(getTdayeqydamageitem(), otherEntity.getTdayeqydamageitem())) { return false; }
        if (!helpComparingValue(getTdayeqyclssifylocinv(), otherEntity.getTdayeqyclssifylocinv())) { return false; }
        if (!helpComparingValue(getTdayeqytmplocinv(), otherEntity.getTdayeqytmplocinv())) { return false; }
        if (!helpComparingValue(getTdayeqyautoinv(), otherEntity.getTdayeqyautoinv())) { return false; }
        if (!helpComparingValue(getCapitemflg(), otherEntity.getCapitemflg())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        if (!helpComparingValue(getAddDt(), otherEntity.getAddDt())) { return false; }
        if (!helpComparingValue(getAddUser(), otherEntity.getAddUser())) { return false; }
        if (!helpComparingValue(getAddProcess(), otherEntity.getAddProcess())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getUpdProcess(), otherEntity.getUpdProcess())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTTrallinvList");
        result = xCH(result, getTrallinvId());
        result = xCH(result, getCenterId());
        result = xCH(result, getClientId());
        result = xCH(result, getExecutedate());
        result = xCH(result, getInoutkbn());
        result = xCH(result, getSysinvtotalinv());
        result = xCH(result, getSysinvkeeplocinv());
        result = xCH(result, getSysinvreceivelocinv());
        result = xCH(result, getSysinvdamageitem());
        result = xCH(result, getSysinvclssifylocinv());
        result = xCH(result, getSysinvtmplocinv());
        result = xCH(result, getSysinvautoinv());
        result = xCH(result, getInvesttotalinv());
        result = xCH(result, getInvestkeeplocinv());
        result = xCH(result, getInvestreceivelocinv());
        result = xCH(result, getInvestdamageitem());
        result = xCH(result, getInvestclssifylocinv());
        result = xCH(result, getInvesttmplocinv());
        result = xCH(result, getInvestautoinv());
        result = xCH(result, getYdaytlequlytotalinv());
        result = xCH(result, getYdaytlequlykeeplocinv());
        result = xCH(result, getYdaytlequlyreceivelocinv());
        result = xCH(result, getYdaytlequlydamageitem());
        result = xCH(result, getYdaytlequlyclssifylocinv());
        result = xCH(result, getYdaytlequlytmplocinv());
        result = xCH(result, getYdaytlequlyautoinv());
        result = xCH(result, getTdayeqytotalinv());
        result = xCH(result, getTdayeqykeeplocinv());
        result = xCH(result, getTdayeqyreceivelocinv());
        result = xCH(result, getTdayeqydamageitem());
        result = xCH(result, getTdayeqyclssifylocinv());
        result = xCH(result, getTdayeqytmplocinv());
        result = xCH(result, getTdayeqyautoinv());
        result = xCH(result, getCapitemflg());
        result = xCH(result, getProductId());
        result = xCH(result, getDelFlg());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
        result = xCH(result, getAddDt());
        result = xCH(result, getAddUser());
        result = xCH(result, getAddProcess());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getUpdProcess());
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
     * [get] TRALLINV_ID: {bigint(19)} <br>
     * @return The value of the column 'TRALLINV_ID'. (NullAllowed)
     */
    public Long getTrallinvId() {
        return _trallinvId;
    }

    /**
     * [set] TRALLINV_ID: {bigint(19)} <br>
     * @param trallinvId The value of the column 'TRALLINV_ID'. (NullAllowed)
     */
    public void setTrallinvId(Long trallinvId) {
        __modifiedProperties.add("trallinvId");
        this._trallinvId = trallinvId;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] EXECUTEDATE: {varchar(8)} <br>
     * @return The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public String getExecutedate() {
        return _executedate;
    }

    /**
     * [set] EXECUTEDATE: {varchar(8)} <br>
     * @param executedate The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public void setExecutedate(String executedate) {
        __modifiedProperties.add("executedate");
        this._executedate = executedate;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        __modifiedProperties.add("sysinvtotalinv");
        this._sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvkeeplocinv() {
        return _sysinvkeeplocinv;
    }

    /**
     * [set] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * @param sysinvkeeplocinv The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed)
     */
    public void setSysinvkeeplocinv(java.math.BigDecimal sysinvkeeplocinv) {
        __modifiedProperties.add("sysinvkeeplocinv");
        this._sysinvkeeplocinv = sysinvkeeplocinv;
    }

    /**
     * [get] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvreceivelocinv() {
        return _sysinvreceivelocinv;
    }

    /**
     * [set] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param sysinvreceivelocinv The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed)
     */
    public void setSysinvreceivelocinv(java.math.BigDecimal sysinvreceivelocinv) {
        __modifiedProperties.add("sysinvreceivelocinv");
        this._sysinvreceivelocinv = sysinvreceivelocinv;
    }

    /**
     * [get] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvdamageitem() {
        return _sysinvdamageitem;
    }

    /**
     * [set] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * @param sysinvdamageitem The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed)
     */
    public void setSysinvdamageitem(java.math.BigDecimal sysinvdamageitem) {
        __modifiedProperties.add("sysinvdamageitem");
        this._sysinvdamageitem = sysinvdamageitem;
    }

    /**
     * [get] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvclssifylocinv() {
        return _sysinvclssifylocinv;
    }

    /**
     * [set] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param sysinvclssifylocinv The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setSysinvclssifylocinv(java.math.BigDecimal sysinvclssifylocinv) {
        __modifiedProperties.add("sysinvclssifylocinv");
        this._sysinvclssifylocinv = sysinvclssifylocinv;
    }

    /**
     * [get] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtmplocinv() {
        return _sysinvtmplocinv;
    }

    /**
     * [set] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * @param sysinvtmplocinv The value of the column 'SYSINVTMPLOCINV'. (NullAllowed)
     */
    public void setSysinvtmplocinv(java.math.BigDecimal sysinvtmplocinv) {
        __modifiedProperties.add("sysinvtmplocinv");
        this._sysinvtmplocinv = sysinvtmplocinv;
    }

    /**
     * [get] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvautoinv() {
        return _sysinvautoinv;
    }

    /**
     * [set] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * @param sysinvautoinv The value of the column 'SYSINVAUTOINV'. (NullAllowed)
     */
    public void setSysinvautoinv(java.math.BigDecimal sysinvautoinv) {
        __modifiedProperties.add("sysinvautoinv");
        this._sysinvautoinv = sysinvautoinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        __modifiedProperties.add("investtotalinv");
        this._investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        __modifiedProperties.add("investkeeplocinv");
        this._investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        __modifiedProperties.add("investreceivelocinv");
        this._investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        __modifiedProperties.add("investdamageitem");
        this._investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        __modifiedProperties.add("investclssifylocinv");
        this._investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        __modifiedProperties.add("investtmplocinv");
        this._investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestautoinv() {
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        __modifiedProperties.add("investautoinv");
        this._investautoinv = investautoinv;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        __modifiedProperties.add("ydaytlequlytotalinv");
        this._ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlykeeplocinv() {
        return _ydaytlequlykeeplocinv;
    }

    /**
     * [set] YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlykeeplocinv The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlykeeplocinv(java.math.BigDecimal ydaytlequlykeeplocinv) {
        __modifiedProperties.add("ydaytlequlykeeplocinv");
        this._ydaytlequlykeeplocinv = ydaytlequlykeeplocinv;
    }

    /**
     * [get] YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyreceivelocinv() {
        return _ydaytlequlyreceivelocinv;
    }

    /**
     * [set] YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlyreceivelocinv The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed)
     */
    public void setYdaytlequlyreceivelocinv(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        __modifiedProperties.add("ydaytlequlyreceivelocinv");
        this._ydaytlequlyreceivelocinv = ydaytlequlyreceivelocinv;
    }

    /**
     * [get] YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlydamageitem() {
        return _ydaytlequlydamageitem;
    }

    /**
     * [set] YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} <br>
     * @param ydaytlequlydamageitem The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed)
     */
    public void setYdaytlequlydamageitem(java.math.BigDecimal ydaytlequlydamageitem) {
        __modifiedProperties.add("ydaytlequlydamageitem");
        this._ydaytlequlydamageitem = ydaytlequlydamageitem;
    }

    /**
     * [get] YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyclssifylocinv() {
        return _ydaytlequlyclssifylocinv;
    }

    /**
     * [set] YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlyclssifylocinv The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlyclssifylocinv(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        __modifiedProperties.add("ydaytlequlyclssifylocinv");
        this._ydaytlequlyclssifylocinv = ydaytlequlyclssifylocinv;
    }

    /**
     * [get] YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytmplocinv() {
        return _ydaytlequlytmplocinv;
    }

    /**
     * [set] YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytmplocinv The value of the column 'YDAYTLEQULYTMPLOCINV'. (NullAllowed)
     */
    public void setYdaytlequlytmplocinv(java.math.BigDecimal ydaytlequlytmplocinv) {
        __modifiedProperties.add("ydaytlequlytmplocinv");
        this._ydaytlequlytmplocinv = ydaytlequlytmplocinv;
    }

    /**
     * [get] YDAYTLEQULYAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlyautoinv() {
        return _ydaytlequlyautoinv;
    }

    /**
     * [set] YDAYTLEQULYAUTOINV: {decimal(16, 6)} <br>
     * @param ydaytlequlyautoinv The value of the column 'YDAYTLEQULYAUTOINV'. (NullAllowed)
     */
    public void setYdaytlequlyautoinv(java.math.BigDecimal ydaytlequlyautoinv) {
        __modifiedProperties.add("ydaytlequlyautoinv");
        this._ydaytlequlyautoinv = ydaytlequlyautoinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        __modifiedProperties.add("tdayeqytotalinv");
        this._tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] TDAYEQYKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqykeeplocinv() {
        return _tdayeqykeeplocinv;
    }

    /**
     * [set] TDAYEQYKEEPLOCINV: {decimal(16, 6)} <br>
     * @param tdayeqykeeplocinv The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed)
     */
    public void setTdayeqykeeplocinv(java.math.BigDecimal tdayeqykeeplocinv) {
        __modifiedProperties.add("tdayeqykeeplocinv");
        this._tdayeqykeeplocinv = tdayeqykeeplocinv;
    }

    /**
     * [get] TDAYEQYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyreceivelocinv() {
        return _tdayeqyreceivelocinv;
    }

    /**
     * [set] TDAYEQYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param tdayeqyreceivelocinv The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed)
     */
    public void setTdayeqyreceivelocinv(java.math.BigDecimal tdayeqyreceivelocinv) {
        __modifiedProperties.add("tdayeqyreceivelocinv");
        this._tdayeqyreceivelocinv = tdayeqyreceivelocinv;
    }

    /**
     * [get] TDAYEQYDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqydamageitem() {
        return _tdayeqydamageitem;
    }

    /**
     * [set] TDAYEQYDAMAGEITEM: {decimal(16, 6)} <br>
     * @param tdayeqydamageitem The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed)
     */
    public void setTdayeqydamageitem(java.math.BigDecimal tdayeqydamageitem) {
        __modifiedProperties.add("tdayeqydamageitem");
        this._tdayeqydamageitem = tdayeqydamageitem;
    }

    /**
     * [get] TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyclssifylocinv() {
        return _tdayeqyclssifylocinv;
    }

    /**
     * [set] TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param tdayeqyclssifylocinv The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setTdayeqyclssifylocinv(java.math.BigDecimal tdayeqyclssifylocinv) {
        __modifiedProperties.add("tdayeqyclssifylocinv");
        this._tdayeqyclssifylocinv = tdayeqyclssifylocinv;
    }

    /**
     * [get] TDAYEQYTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytmplocinv() {
        return _tdayeqytmplocinv;
    }

    /**
     * [set] TDAYEQYTMPLOCINV: {decimal(16, 6)} <br>
     * @param tdayeqytmplocinv The value of the column 'TDAYEQYTMPLOCINV'. (NullAllowed)
     */
    public void setTdayeqytmplocinv(java.math.BigDecimal tdayeqytmplocinv) {
        __modifiedProperties.add("tdayeqytmplocinv");
        this._tdayeqytmplocinv = tdayeqytmplocinv;
    }

    /**
     * [get] TDAYEQYAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqyautoinv() {
        return _tdayeqyautoinv;
    }

    /**
     * [set] TDAYEQYAUTOINV: {decimal(16, 6)} <br>
     * @param tdayeqyautoinv The value of the column 'TDAYEQYAUTOINV'. (NullAllowed)
     */
    public void setTdayeqyautoinv(java.math.BigDecimal tdayeqyautoinv) {
        __modifiedProperties.add("tdayeqyautoinv");
        this._tdayeqyautoinv = tdayeqyautoinv;
    }

    /**
     * [get] CAPITEMFLG: {bigint(19)} <br>
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public Long getCapitemflg() {
        return _capitemflg;
    }

    /**
     * [set] CAPITEMFLG: {bigint(19)} <br>
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public void setCapitemflg(Long capitemflg) {
        __modifiedProperties.add("capitemflg");
        this._capitemflg = capitemflg;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
