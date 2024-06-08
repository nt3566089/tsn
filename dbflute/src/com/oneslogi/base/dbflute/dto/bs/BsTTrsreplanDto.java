package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSREPLAN as TABLE. <br>
 * 返品入庫予定
 * <pre>
 * [primary-key]
 *     TRSREPLAN_ID
 *
 * [column]
 *     TRSREPLAN_ID, PREKEY, TEMPLATEFLG, RCVINSPECTFLG, SUPPLIERRCVNO, RMANO, RCVTYPE, PARTFLG, ACTFLG, STS, PRIORITIES, COMPANYCD, RCVSCHDATE, RECEIVEDATE, LOGISTICSCD, WAREHOUSECD, SUPPLIERCD, SUPPLIERNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, SUPPLIERPHONE, FAX1, EMAIL, REFNAME, FROMCD, FROMSUB, FROMNAME, FROMADDRESS1, FROMADDRESS2, FROMADDRESS3, FROMPOSTNO, FROMCOUNTRYCD, FROMPORTCD, FROMDISTRICTCD, FROMPHONE, FROMFAX, FROMEMAIL, FROMREFNAME, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARRIERSEQ, EXPECTEDTIME, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, ALLOCGROUP, ACCEPTKEY, ACCEPTUSERCD, INSPECTEDUSERCD, RECEIVEDUSERCD, MOVEKEY, ASSYKEY, PRODUCEKEY, SYHN_KBN, CGGDID, CONFIRMED_FLG, SUFFER_USAGE_FLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSREPLAN_ID
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
public abstract class BsTTrsreplanDto implements Serializable {

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
    /** TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trsreplanId;

    /** PREKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _prekey;

    /** TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _templateflg;

    /** RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    @JsonKey
    protected java.math.BigDecimal _rcvinspectflg;

    /** SUPPLIERRCVNO: {varchar(60)} */
    @JsonKey
    protected String _supplierrcvno;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** RCVTYPE: {varchar(30)} */
    @JsonKey
    protected String _rcvtype;

    /** PARTFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _partflg;

    /** ACTFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _actflg;

    /** STS: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sts;

    /** PRIORITIES: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _priorities;

    /** COMPANYCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _companycd;

    /** RCVSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvschdate;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** LOGISTICSCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _logisticscd;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** SUPPLIERCD: {varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** SUPPLIERNAME: {varchar(255)} */
    @JsonKey
    protected String _suppliername;

    /** ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** POSTNO: {varchar(30)} */
    @JsonKey
    protected String _postno;

    /** COUNTRYCD: {varchar(60)} */
    @JsonKey
    protected String _countrycd;

    /** PORTCD: {varchar(60)} */
    @JsonKey
    protected String _portcd;

    /** DISTRICTCD: {varchar(30)} */
    @JsonKey
    protected String _districtcd;

    /** SUPPLIERPHONE: {varchar(60)} */
    @JsonKey
    protected String _supplierphone;

    /** FAX1: {varchar(60)} */
    @JsonKey
    protected String _fax1;

    /** EMAIL: {varchar(255)} */
    @JsonKey
    protected String _email;

    /** REFNAME: {varchar(60)} */
    @JsonKey
    protected String _refname;

    /** FROMCD: {varchar(30)} */
    @JsonKey
    protected String _fromcd;

    /** FROMSUB: {varchar(60)} */
    @JsonKey
    protected String _fromsub;

    /** FROMNAME: {varchar(255)} */
    @JsonKey
    protected String _fromname;

    /** FROMADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _fromaddress1;

    /** FROMADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _fromaddress2;

    /** FROMADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _fromaddress3;

    /** FROMPOSTNO: {varchar(30)} */
    @JsonKey
    protected String _frompostno;

    /** FROMCOUNTRYCD: {varchar(60)} */
    @JsonKey
    protected String _fromcountrycd;

    /** FROMPORTCD: {varchar(60)} */
    @JsonKey
    protected String _fromportcd;

    /** FROMDISTRICTCD: {varchar(30)} */
    @JsonKey
    protected String _fromdistrictcd;

    /** FROMPHONE: {varchar(60)} */
    @JsonKey
    protected String _fromphone;

    /** FROMFAX: {varchar(60)} */
    @JsonKey
    protected String _fromfax;

    /** FROMEMAIL: {varchar(255)} */
    @JsonKey
    protected String _fromemail;

    /** FROMREFNAME: {varchar(60)} */
    @JsonKey
    protected String _fromrefname;

    /** CARRIERCD: {varchar(30)} */
    @JsonKey
    protected String _carriercd;

    /** CARRIERNAME: {varchar(255)} */
    @JsonKey
    protected String _carriername;

    /** CARRIERWBNO: {varchar(60)} */
    @JsonKey
    protected String _carrierwbno;

    /** DELIVERYCD: {varchar(30)} */
    @JsonKey
    protected String _deliverycd;

    /** CARRIERNO: {varchar(60)} */
    @JsonKey
    protected String _carrierno;

    /** CARRIERSNAME: {varchar(100), default=[(0)]} */
    @JsonKey
    protected String _carriersname;

    /** CARRIERSEQ: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _carrierseq;

    /** EXPECTEDTIME: {varchar(8)} */
    @JsonKey
    protected String _expectedtime;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** OTHERREFNO1: {varchar(60)} */
    @JsonKey
    protected String _otherrefno1;

    /** OTHERREFNO2: {varchar(60)} */
    @JsonKey
    protected String _otherrefno2;

    /** OTHERREFNO3: {varchar(60)} */
    @JsonKey
    protected String _otherrefno3;

    /** ALLOCGROUP: {varchar(60)} */
    @JsonKey
    protected String _allocgroup;

    /** ACCEPTKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _acceptkey;

    /** ACCEPTUSERCD: {varchar(30)} */
    @JsonKey
    protected String _acceptusercd;

    /** INSPECTEDUSERCD: {varchar(30)} */
    @JsonKey
    protected String _inspectedusercd;

    /** RECEIVEDUSERCD: {varchar(30)} */
    @JsonKey
    protected String _receivedusercd;

    /** MOVEKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _movekey;

    /** ASSYKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _assykey;

    /** PRODUCEKEY: {bigint(19)} */
    @JsonKey
    protected Long _producekey;

    /** SYHN_KBN: {varchar(30)} */
    @JsonKey
    protected String _syhnKbn;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** CONFIRMED_FLG: {char(1)} */
    @JsonKey
    protected String _confirmedFlg;

    /** SUFFER_USAGE_FLG: {char(1)} */
    @JsonKey
    protected String _sufferUsageFlg;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

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
    public BsTTrsreplanDto() {
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
        if (other == null || !(other instanceof BsTTrsreplanDto)) { return false; }
        final BsTTrsreplanDto otherEntity = (BsTTrsreplanDto)other;
        if (!helpComparingValue(getTrsreplanId(), otherEntity.getTrsreplanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSREPLAN");
        result = xCH(result, getTrsreplanId());
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
        sb.append(c).append(getTrsreplanId());
        sb.append(c).append(getPrekey());
        sb.append(c).append(getTemplateflg());
        sb.append(c).append(getRcvinspectflg());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getRmano());
        sb.append(c).append(getRcvtype());
        sb.append(c).append(getPartflg());
        sb.append(c).append(getActflg());
        sb.append(c).append(getSts());
        sb.append(c).append(getPriorities());
        sb.append(c).append(getCompanycd());
        sb.append(c).append(getRcvschdate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getLogisticscd());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getSuppliername());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getPostno());
        sb.append(c).append(getCountrycd());
        sb.append(c).append(getPortcd());
        sb.append(c).append(getDistrictcd());
        sb.append(c).append(getSupplierphone());
        sb.append(c).append(getFax1());
        sb.append(c).append(getEmail());
        sb.append(c).append(getRefname());
        sb.append(c).append(getFromcd());
        sb.append(c).append(getFromsub());
        sb.append(c).append(getFromname());
        sb.append(c).append(getFromaddress1());
        sb.append(c).append(getFromaddress2());
        sb.append(c).append(getFromaddress3());
        sb.append(c).append(getFrompostno());
        sb.append(c).append(getFromcountrycd());
        sb.append(c).append(getFromportcd());
        sb.append(c).append(getFromdistrictcd());
        sb.append(c).append(getFromphone());
        sb.append(c).append(getFromfax());
        sb.append(c).append(getFromemail());
        sb.append(c).append(getFromrefname());
        sb.append(c).append(getCarriercd());
        sb.append(c).append(getCarriername());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getDeliverycd());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getCarrierseq());
        sb.append(c).append(getExpectedtime());
        sb.append(c).append(getNotes());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getOtherrefno2());
        sb.append(c).append(getOtherrefno3());
        sb.append(c).append(getAllocgroup());
        sb.append(c).append(getAcceptkey());
        sb.append(c).append(getAcceptusercd());
        sb.append(c).append(getInspectedusercd());
        sb.append(c).append(getReceivedusercd());
        sb.append(c).append(getMovekey());
        sb.append(c).append(getAssykey());
        sb.append(c).append(getProducekey());
        sb.append(c).append(getSyhnKbn());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getConfirmedFlg());
        sb.append(c).append(getSufferUsageFlg());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定ID
     * @return The value of the column 'TRSREPLAN_ID'. (NullAllowed)
     */
    public Long getTrsreplanId() {
        return _trsreplanId;
    }

    /**
     * [set] TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定ID
     * @param trsreplanId The value of the column 'TRSREPLAN_ID'. (NullAllowed)
     */
    public void setTrsreplanId(Long trsreplanId) {
        __modifiedProperties.add("trsreplanId");
        this._trsreplanId = trsreplanId;
    }

    /**
     * [get] PREKEY: {decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @return The value of the column 'PREKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPrekey() {
        return _prekey;
    }

    /**
     * [set] PREKEY: {decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @param prekey The value of the column 'PREKEY'. (NullAllowed)
     */
    public void setPrekey(java.math.BigDecimal prekey) {
        __modifiedProperties.add("prekey");
        this._prekey = prekey;
    }

    /**
     * [get] TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * り災品区分
     * @return The value of the column 'TEMPLATEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getTemplateflg() {
        return _templateflg;
    }

    /**
     * [set] TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * り災品区分
     * @param templateflg The value of the column 'TEMPLATEFLG'. (NullAllowed)
     */
    public void setTemplateflg(java.math.BigDecimal templateflg) {
        __modifiedProperties.add("templateflg");
        this._templateflg = templateflg;
    }

    /**
     * [get] RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 入庫検品フラグ
     * @return The value of the column 'RCVINSPECTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvinspectflg() {
        return _rcvinspectflg;
    }

    /**
     * [set] RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 入庫検品フラグ
     * @param rcvinspectflg The value of the column 'RCVINSPECTFLG'. (NullAllowed)
     */
    public void setRcvinspectflg(java.math.BigDecimal rcvinspectflg) {
        __modifiedProperties.add("rcvinspectflg");
        this._rcvinspectflg = rcvinspectflg;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 伝票番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 伝票番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * 販売年月日
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * 販売年月日
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] RCVTYPE: {varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @return The value of the column 'RCVTYPE'. (NullAllowed)
     */
    public String getRcvtype() {
        return _rcvtype;
    }

    /**
     * [set] RCVTYPE: {varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @param rcvtype The value of the column 'RCVTYPE'. (NullAllowed)
     */
    public void setRcvtype(String rcvtype) {
        __modifiedProperties.add("rcvtype");
        this._rcvtype = rcvtype;
    }

    /**
     * [get] PARTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 一括登録フラグ
     * @return The value of the column 'PARTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getPartflg() {
        return _partflg;
    }

    /**
     * [set] PARTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 一括登録フラグ
     * @param partflg The value of the column 'PARTFLG'. (NullAllowed)
     */
    public void setPartflg(java.math.BigDecimal partflg) {
        __modifiedProperties.add("partflg");
        this._partflg = partflg;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getActflg() {
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        __modifiedProperties.add("actflg");
        this._actflg = actflg;
    }

    /**
     * [get] STS: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫ステータス
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public Long getSts() {
        return _sts;
    }

    /**
     * [set] STS: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫ステータス
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(Long sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
    }

    /**
     * [get] PRIORITIES: {decimal(16, 6)} <br>
     * 配達順位
     * @return The value of the column 'PRIORITIES'. (NullAllowed)
     */
    public java.math.BigDecimal getPriorities() {
        return _priorities;
    }

    /**
     * [set] PRIORITIES: {decimal(16, 6)} <br>
     * 配達順位
     * @param priorities The value of the column 'PRIORITIES'. (NullAllowed)
     */
    public void setPriorities(java.math.BigDecimal priorities) {
        __modifiedProperties.add("priorities");
        this._priorities = priorities;
    }

    /**
     * [get] COMPANYCD: {NotNull, varchar(30)} <br>
     * 取引先(発注元)CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public String getCompanycd() {
        return _companycd;
    }

    /**
     * [set] COMPANYCD: {NotNull, varchar(30)} <br>
     * 取引先(発注元)CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public void setCompanycd(String companycd) {
        __modifiedProperties.add("companycd");
        this._companycd = companycd;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public String getRcvschdate() {
        return _rcvschdate;
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public void setRcvschdate(String rcvschdate) {
        __modifiedProperties.add("rcvschdate");
        this._rcvschdate = rcvschdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 検品実施日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 検品実施日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先(倉庫会社)CD
     * @return The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public String getLogisticscd() {
        return _logisticscd;
    }

    /**
     * [set] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先(倉庫会社)CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public void setLogisticscd(String logisticscd) {
        __modifiedProperties.add("logisticscd");
        this._logisticscd = logisticscd;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] SUPPLIERNAME: {varchar(255)} <br>
     * 調達先名称
     * @return The value of the column 'SUPPLIERNAME'. (NullAllowed)
     */
    public String getSuppliername() {
        return _suppliername;
    }

    /**
     * [set] SUPPLIERNAME: {varchar(255)} <br>
     * 調達先名称
     * @param suppliername The value of the column 'SUPPLIERNAME'. (NullAllowed)
     */
    public void setSuppliername(String suppliername) {
        __modifiedProperties.add("suppliername");
        this._suppliername = suppliername;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 保留登録日
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 保留登録日
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 保留解除日
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 保留解除日
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 調達先住所３
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 調達先住所３
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] POSTNO: {varchar(30)} <br>
     * 調達先郵便番号
     * @return The value of the column 'POSTNO'. (NullAllowed)
     */
    public String getPostno() {
        return _postno;
    }

    /**
     * [set] POSTNO: {varchar(30)} <br>
     * 調達先郵便番号
     * @param postno The value of the column 'POSTNO'. (NullAllowed)
     */
    public void setPostno(String postno) {
        __modifiedProperties.add("postno");
        this._postno = postno;
    }

    /**
     * [get] COUNTRYCD: {varchar(60)} <br>
     * 調達先国CD
     * @return The value of the column 'COUNTRYCD'. (NullAllowed)
     */
    public String getCountrycd() {
        return _countrycd;
    }

    /**
     * [set] COUNTRYCD: {varchar(60)} <br>
     * 調達先国CD
     * @param countrycd The value of the column 'COUNTRYCD'. (NullAllowed)
     */
    public void setCountrycd(String countrycd) {
        __modifiedProperties.add("countrycd");
        this._countrycd = countrycd;
    }

    /**
     * [get] PORTCD: {varchar(60)} <br>
     * 調達先入出港CD
     * @return The value of the column 'PORTCD'. (NullAllowed)
     */
    public String getPortcd() {
        return _portcd;
    }

    /**
     * [set] PORTCD: {varchar(60)} <br>
     * 調達先入出港CD
     * @param portcd The value of the column 'PORTCD'. (NullAllowed)
     */
    public void setPortcd(String portcd) {
        __modifiedProperties.add("portcd");
        this._portcd = portcd;
    }

    /**
     * [get] DISTRICTCD: {varchar(30)} <br>
     * 一致／不一致区分
     * @return The value of the column 'DISTRICTCD'. (NullAllowed)
     */
    public String getDistrictcd() {
        return _districtcd;
    }

    /**
     * [set] DISTRICTCD: {varchar(30)} <br>
     * 一致／不一致区分
     * @param districtcd The value of the column 'DISTRICTCD'. (NullAllowed)
     */
    public void setDistrictcd(String districtcd) {
        __modifiedProperties.add("districtcd");
        this._districtcd = districtcd;
    }

    /**
     * [get] SUPPLIERPHONE: {varchar(60)} <br>
     * 調達先電話番号
     * @return The value of the column 'SUPPLIERPHONE'. (NullAllowed)
     */
    public String getSupplierphone() {
        return _supplierphone;
    }

    /**
     * [set] SUPPLIERPHONE: {varchar(60)} <br>
     * 調達先電話番号
     * @param supplierphone The value of the column 'SUPPLIERPHONE'. (NullAllowed)
     */
    public void setSupplierphone(String supplierphone) {
        __modifiedProperties.add("supplierphone");
        this._supplierphone = supplierphone;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 調達先Fax
     * @return The value of the column 'FAX1'. (NullAllowed)
     */
    public String getFax1() {
        return _fax1;
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 調達先Fax
     * @param fax1 The value of the column 'FAX1'. (NullAllowed)
     */
    public void setFax1(String fax1) {
        __modifiedProperties.add("fax1");
        this._fax1 = fax1;
    }

    /**
     * [get] EMAIL: {varchar(255)} <br>
     * 調達先E-Mail
     * @return The value of the column 'EMAIL'. (NullAllowed)
     */
    public String getEmail() {
        return _email;
    }

    /**
     * [set] EMAIL: {varchar(255)} <br>
     * 調達先E-Mail
     * @param email The value of the column 'EMAIL'. (NullAllowed)
     */
    public void setEmail(String email) {
        __modifiedProperties.add("email");
        this._email = email;
    }

    /**
     * [get] REFNAME: {varchar(60)} <br>
     * 調達先担当者名
     * @return The value of the column 'REFNAME'. (NullAllowed)
     */
    public String getRefname() {
        return _refname;
    }

    /**
     * [set] REFNAME: {varchar(60)} <br>
     * 調達先担当者名
     * @param refname The value of the column 'REFNAME'. (NullAllowed)
     */
    public void setRefname(String refname) {
        __modifiedProperties.add("refname");
        this._refname = refname;
    }

    /**
     * [get] FROMCD: {varchar(30)} <br>
     * 取引先(積地)CD
     * @return The value of the column 'FROMCD'. (NullAllowed)
     */
    public String getFromcd() {
        return _fromcd;
    }

    /**
     * [set] FROMCD: {varchar(30)} <br>
     * 取引先(積地)CD
     * @param fromcd The value of the column 'FROMCD'. (NullAllowed)
     */
    public void setFromcd(String fromcd) {
        __modifiedProperties.add("fromcd");
        this._fromcd = fromcd;
    }

    /**
     * [get] FROMSUB: {varchar(60)} <br>
     * 積地カテゴリ
     * @return The value of the column 'FROMSUB'. (NullAllowed)
     */
    public String getFromsub() {
        return _fromsub;
    }

    /**
     * [set] FROMSUB: {varchar(60)} <br>
     * 積地カテゴリ
     * @param fromsub The value of the column 'FROMSUB'. (NullAllowed)
     */
    public void setFromsub(String fromsub) {
        __modifiedProperties.add("fromsub");
        this._fromsub = fromsub;
    }

    /**
     * [get] FROMNAME: {varchar(255)} <br>
     * 伝票表示名称
     * @return The value of the column 'FROMNAME'. (NullAllowed)
     */
    public String getFromname() {
        return _fromname;
    }

    /**
     * [set] FROMNAME: {varchar(255)} <br>
     * 伝票表示名称
     * @param fromname The value of the column 'FROMNAME'. (NullAllowed)
     */
    public void setFromname(String fromname) {
        __modifiedProperties.add("fromname");
        this._fromname = fromname;
    }

    /**
     * [get] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @return The value of the column 'FROMADDRESS1'. (NullAllowed)
     */
    public String getFromaddress1() {
        return _fromaddress1;
    }

    /**
     * [set] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @param fromaddress1 The value of the column 'FROMADDRESS1'. (NullAllowed)
     */
    public void setFromaddress1(String fromaddress1) {
        __modifiedProperties.add("fromaddress1");
        this._fromaddress1 = fromaddress1;
    }

    /**
     * [get] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'FROMADDRESS2'. (NullAllowed)
     */
    public String getFromaddress2() {
        return _fromaddress2;
    }

    /**
     * [set] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @param fromaddress2 The value of the column 'FROMADDRESS2'. (NullAllowed)
     */
    public void setFromaddress2(String fromaddress2) {
        __modifiedProperties.add("fromaddress2");
        this._fromaddress2 = fromaddress2;
    }

    /**
     * [get] FROMADDRESS3: {varchar(255)} <br>
     * 中継拠点
     * @return The value of the column 'FROMADDRESS3'. (NullAllowed)
     */
    public String getFromaddress3() {
        return _fromaddress3;
    }

    /**
     * [set] FROMADDRESS3: {varchar(255)} <br>
     * 中継拠点
     * @param fromaddress3 The value of the column 'FROMADDRESS3'. (NullAllowed)
     */
    public void setFromaddress3(String fromaddress3) {
        __modifiedProperties.add("fromaddress3");
        this._fromaddress3 = fromaddress3;
    }

    /**
     * [get] FROMPOSTNO: {varchar(30)} <br>
     * 注意喚起
     * @return The value of the column 'FROMPOSTNO'. (NullAllowed)
     */
    public String getFrompostno() {
        return _frompostno;
    }

    /**
     * [set] FROMPOSTNO: {varchar(30)} <br>
     * 注意喚起
     * @param frompostno The value of the column 'FROMPOSTNO'. (NullAllowed)
     */
    public void setFrompostno(String frompostno) {
        __modifiedProperties.add("frompostno");
        this._frompostno = frompostno;
    }

    /**
     * [get] FROMCOUNTRYCD: {varchar(60)} <br>
     * 積地国CD
     * @return The value of the column 'FROMCOUNTRYCD'. (NullAllowed)
     */
    public String getFromcountrycd() {
        return _fromcountrycd;
    }

    /**
     * [set] FROMCOUNTRYCD: {varchar(60)} <br>
     * 積地国CD
     * @param fromcountrycd The value of the column 'FROMCOUNTRYCD'. (NullAllowed)
     */
    public void setFromcountrycd(String fromcountrycd) {
        __modifiedProperties.add("fromcountrycd");
        this._fromcountrycd = fromcountrycd;
    }

    /**
     * [get] FROMPORTCD: {varchar(60)} <br>
     * 積地入出港CD
     * @return The value of the column 'FROMPORTCD'. (NullAllowed)
     */
    public String getFromportcd() {
        return _fromportcd;
    }

    /**
     * [set] FROMPORTCD: {varchar(60)} <br>
     * 積地入出港CD
     * @param fromportcd The value of the column 'FROMPORTCD'. (NullAllowed)
     */
    public void setFromportcd(String fromportcd) {
        __modifiedProperties.add("fromportcd");
        this._fromportcd = fromportcd;
    }

    /**
     * [get] FROMDISTRICTCD: {varchar(30)} <br>
     * 積地地区CD
     * @return The value of the column 'FROMDISTRICTCD'. (NullAllowed)
     */
    public String getFromdistrictcd() {
        return _fromdistrictcd;
    }

    /**
     * [set] FROMDISTRICTCD: {varchar(30)} <br>
     * 積地地区CD
     * @param fromdistrictcd The value of the column 'FROMDISTRICTCD'. (NullAllowed)
     */
    public void setFromdistrictcd(String fromdistrictcd) {
        __modifiedProperties.add("fromdistrictcd");
        this._fromdistrictcd = fromdistrictcd;
    }

    /**
     * [get] FROMPHONE: {varchar(60)} <br>
     * 積地電話番号
     * @return The value of the column 'FROMPHONE'. (NullAllowed)
     */
    public String getFromphone() {
        return _fromphone;
    }

    /**
     * [set] FROMPHONE: {varchar(60)} <br>
     * 積地電話番号
     * @param fromphone The value of the column 'FROMPHONE'. (NullAllowed)
     */
    public void setFromphone(String fromphone) {
        __modifiedProperties.add("fromphone");
        this._fromphone = fromphone;
    }

    /**
     * [get] FROMFAX: {varchar(60)} <br>
     * 積地FAX番号１
     * @return The value of the column 'FROMFAX'. (NullAllowed)
     */
    public String getFromfax() {
        return _fromfax;
    }

    /**
     * [set] FROMFAX: {varchar(60)} <br>
     * 積地FAX番号１
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed)
     */
    public void setFromfax(String fromfax) {
        __modifiedProperties.add("fromfax");
        this._fromfax = fromfax;
    }

    /**
     * [get] FROMEMAIL: {varchar(255)} <br>
     * 積地E-Mail
     * @return The value of the column 'FROMEMAIL'. (NullAllowed)
     */
    public String getFromemail() {
        return _fromemail;
    }

    /**
     * [set] FROMEMAIL: {varchar(255)} <br>
     * 積地E-Mail
     * @param fromemail The value of the column 'FROMEMAIL'. (NullAllowed)
     */
    public void setFromemail(String fromemail) {
        __modifiedProperties.add("fromemail");
        this._fromemail = fromemail;
    }

    /**
     * [get] FROMREFNAME: {varchar(60)} <br>
     * 積地担当者名
     * @return The value of the column 'FROMREFNAME'. (NullAllowed)
     */
    public String getFromrefname() {
        return _fromrefname;
    }

    /**
     * [set] FROMREFNAME: {varchar(60)} <br>
     * 積地担当者名
     * @param fromrefname The value of the column 'FROMREFNAME'. (NullAllowed)
     */
    public void setFromrefname(String fromrefname) {
        __modifiedProperties.add("fromrefname");
        this._fromrefname = fromrefname;
    }

    /**
     * [get] CARRIERCD: {varchar(30)} <br>
     * 取引先(運送会社)コード
     * @return The value of the column 'CARRIERCD'. (NullAllowed)
     */
    public String getCarriercd() {
        return _carriercd;
    }

    /**
     * [set] CARRIERCD: {varchar(30)} <br>
     * 取引先(運送会社)コード
     * @param carriercd The value of the column 'CARRIERCD'. (NullAllowed)
     */
    public void setCarriercd(String carriercd) {
        __modifiedProperties.add("carriercd");
        this._carriercd = carriercd;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public String getCarriername() {
        return _carriername;
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * ピストン区分
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public void setCarriername(String carriername) {
        __modifiedProperties.add("carriername");
        this._carriername = carriername;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @return The value of the column 'DELIVERYCD'. (NullAllowed)
     */
    public String getDeliverycd() {
        return _deliverycd;
    }

    /**
     * [set] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @param deliverycd The value of the column 'DELIVERYCD'. (NullAllowed)
     */
    public void setDeliverycd(String deliverycd) {
        __modifiedProperties.add("deliverycd");
        this._deliverycd = deliverycd;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * 返品ステータス
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * 返品ステータス
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100), default=[(0)]} <br>
     * 乗務員
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public String getCarriersname() {
        return _carriersname;
    }

    /**
     * [set] CARRIERSNAME: {varchar(100), default=[(0)]} <br>
     * 乗務員
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public void setCarriersname(String carriersname) {
        __modifiedProperties.add("carriersname");
        this._carriersname = carriersname;
    }

    /**
     * [get] CARRIERSEQ: {decimal(16, 6)} <br>
     * 入庫実績計
     * @return The value of the column 'CARRIERSEQ'. (NullAllowed)
     */
    public java.math.BigDecimal getCarrierseq() {
        return _carrierseq;
    }

    /**
     * [set] CARRIERSEQ: {decimal(16, 6)} <br>
     * 入庫実績計
     * @param carrierseq The value of the column 'CARRIERSEQ'. (NullAllowed)
     */
    public void setCarrierseq(java.math.BigDecimal carrierseq) {
        __modifiedProperties.add("carrierseq");
        this._carrierseq = carrierseq;
    }

    /**
     * [get] EXPECTEDTIME: {varchar(8)} <br>
     * 削除実施日
     * @return The value of the column 'EXPECTEDTIME'. (NullAllowed)
     */
    public String getExpectedtime() {
        return _expectedtime;
    }

    /**
     * [set] EXPECTEDTIME: {varchar(8)} <br>
     * 削除実施日
     * @param expectedtime The value of the column 'EXPECTEDTIME'. (NullAllowed)
     */
    public void setExpectedtime(String expectedtime) {
        __modifiedProperties.add("expectedtime");
        this._expectedtime = expectedtime;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * お得意様CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * お得意様CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] OTHERREFNO2: {varchar(60)} <br>
     * 取引方法
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public String getOtherrefno2() {
        return _otherrefno2;
    }

    /**
     * [set] OTHERREFNO2: {varchar(60)} <br>
     * 取引方法
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public void setOtherrefno2(String otherrefno2) {
        __modifiedProperties.add("otherrefno2");
        this._otherrefno2 = otherrefno2;
    }

    /**
     * [get] OTHERREFNO3: {varchar(60)} <br>
     * 返品区分
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public String getOtherrefno3() {
        return _otherrefno3;
    }

    /**
     * [set] OTHERREFNO3: {varchar(60)} <br>
     * 返品区分
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public void setOtherrefno3(String otherrefno3) {
        __modifiedProperties.add("otherrefno3");
        this._otherrefno3 = otherrefno3;
    }

    /**
     * [get] ALLOCGROUP: {varchar(60)} <br>
     * 入庫締めグループ
     * @return The value of the column 'ALLOCGROUP'. (NullAllowed)
     */
    public String getAllocgroup() {
        return _allocgroup;
    }

    /**
     * [set] ALLOCGROUP: {varchar(60)} <br>
     * 入庫締めグループ
     * @param allocgroup The value of the column 'ALLOCGROUP'. (NullAllowed)
     */
    public void setAllocgroup(String allocgroup) {
        __modifiedProperties.add("allocgroup");
        this._allocgroup = allocgroup;
    }

    /**
     * [get] ACCEPTKEY: {decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @return The value of the column 'ACCEPTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getAcceptkey() {
        return _acceptkey;
    }

    /**
     * [set] ACCEPTKEY: {decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @param acceptkey The value of the column 'ACCEPTKEY'. (NullAllowed)
     */
    public void setAcceptkey(java.math.BigDecimal acceptkey) {
        __modifiedProperties.add("acceptkey");
        this._acceptkey = acceptkey;
    }

    /**
     * [get] ACCEPTUSERCD: {varchar(30)} <br>
     * 入庫受付担当者
     * @return The value of the column 'ACCEPTUSERCD'. (NullAllowed)
     */
    public String getAcceptusercd() {
        return _acceptusercd;
    }

    /**
     * [set] ACCEPTUSERCD: {varchar(30)} <br>
     * 入庫受付担当者
     * @param acceptusercd The value of the column 'ACCEPTUSERCD'. (NullAllowed)
     */
    public void setAcceptusercd(String acceptusercd) {
        __modifiedProperties.add("acceptusercd");
        this._acceptusercd = acceptusercd;
    }

    /**
     * [get] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @return The value of the column 'INSPECTEDUSERCD'. (NullAllowed)
     */
    public String getInspectedusercd() {
        return _inspectedusercd;
    }

    /**
     * [set] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @param inspectedusercd The value of the column 'INSPECTEDUSERCD'. (NullAllowed)
     */
    public void setInspectedusercd(String inspectedusercd) {
        __modifiedProperties.add("inspectedusercd");
        this._inspectedusercd = inspectedusercd;
    }

    /**
     * [get] RECEIVEDUSERCD: {varchar(30)} <br>
     * 入庫確定担当者
     * @return The value of the column 'RECEIVEDUSERCD'. (NullAllowed)
     */
    public String getReceivedusercd() {
        return _receivedusercd;
    }

    /**
     * [set] RECEIVEDUSERCD: {varchar(30)} <br>
     * 入庫確定担当者
     * @param receivedusercd The value of the column 'RECEIVEDUSERCD'. (NullAllowed)
     */
    public void setReceivedusercd(String receivedusercd) {
        __modifiedProperties.add("receivedusercd");
        this._receivedusercd = receivedusercd;
    }

    /**
     * [get] MOVEKEY: {decimal(16, 6)} <br>
     * 移動予定Ｋｅｙ
     * @return The value of the column 'MOVEKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getMovekey() {
        return _movekey;
    }

    /**
     * [set] MOVEKEY: {decimal(16, 6)} <br>
     * 移動予定Ｋｅｙ
     * @param movekey The value of the column 'MOVEKEY'. (NullAllowed)
     */
    public void setMovekey(java.math.BigDecimal movekey) {
        __modifiedProperties.add("movekey");
        this._movekey = movekey;
    }

    /**
     * [get] ASSYKEY: {decimal(16, 6)} <br>
     * 加工指示Ｋｅｙ
     * @return The value of the column 'ASSYKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getAssykey() {
        return _assykey;
    }

    /**
     * [set] ASSYKEY: {decimal(16, 6)} <br>
     * 加工指示Ｋｅｙ
     * @param assykey The value of the column 'ASSYKEY'. (NullAllowed)
     */
    public void setAssykey(java.math.BigDecimal assykey) {
        __modifiedProperties.add("assykey");
        this._assykey = assykey;
    }

    /**
     * [get] PRODUCEKEY: {bigint(19)} <br>
     * 加工結果Ｋｅｙ
     * @return The value of the column 'PRODUCEKEY'. (NullAllowed)
     */
    public Long getProducekey() {
        return _producekey;
    }

    /**
     * [set] PRODUCEKEY: {bigint(19)} <br>
     * 加工結果Ｋｅｙ
     * @param producekey The value of the column 'PRODUCEKEY'. (NullAllowed)
     */
    public void setProducekey(Long producekey) {
        __modifiedProperties.add("producekey");
        this._producekey = producekey;
    }

    /**
     * [get] SYHN_KBN: {varchar(30)} <br>
     * 銘柄区分
     * @return The value of the column 'SYHN_KBN'. (NullAllowed)
     */
    public String getSyhnKbn() {
        return _syhnKbn;
    }

    /**
     * [set] SYHN_KBN: {varchar(30)} <br>
     * 銘柄区分
     * @param syhnKbn The value of the column 'SYHN_KBN'. (NullAllowed)
     */
    public void setSyhnKbn(String syhnKbn) {
        __modifiedProperties.add("syhnKbn");
        this._syhnKbn = syhnKbn;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] CONFIRMED_FLG: {char(1)} <br>
     * 実績確定対象フラグ
     * @return The value of the column 'CONFIRMED_FLG'. (NullAllowed)
     */
    public String getConfirmedFlg() {
        return _confirmedFlg;
    }

    /**
     * [set] CONFIRMED_FLG: {char(1)} <br>
     * 実績確定対象フラグ
     * @param confirmedFlg The value of the column 'CONFIRMED_FLG'. (NullAllowed)
     */
    public void setConfirmedFlg(String confirmedFlg) {
        __modifiedProperties.add("confirmedFlg");
        this._confirmedFlg = confirmedFlg;
    }

    /**
     * [get] SUFFER_USAGE_FLG: {char(1)} <br>
     * り災品取扱区分
     * @return The value of the column 'SUFFER_USAGE_FLG'. (NullAllowed)
     */
    public String getSufferUsageFlg() {
        return _sufferUsageFlg;
    }

    /**
     * [set] SUFFER_USAGE_FLG: {char(1)} <br>
     * り災品取扱区分
     * @param sufferUsageFlg The value of the column 'SUFFER_USAGE_FLG'. (NullAllowed)
     */
    public void setSufferUsageFlg(String sufferUsageFlg) {
        __modifiedProperties.add("sufferUsageFlg");
        this._sufferUsageFlg = sufferUsageFlg;
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
