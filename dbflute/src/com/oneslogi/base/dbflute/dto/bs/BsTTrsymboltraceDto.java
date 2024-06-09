package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRSYMBOLTRACE as TABLE. <br>
 * 段ボール追跡情報
 * <pre>
 * [primary-key]
 *     TRSYMBOLTRACE_ID
 *
 * [column]
 *     TRSYMBOLTRACE_ID, SYMBOLTRACEKEY, TRSYMBOL_ID, CREATEDATETIME, WAREHOUSECD, TRACETYPE, INITNUM, CASEINNUM, ASSORTNUM, DIRECTIONNUM, CUSTOMERCD, DISTWAREHOUSECD, MIXEDFLG, LOCCD, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, NOSHIPPINGFLG, IFITEMCD, SENDFLG, RCVKEY, PALLETNO, SOKEY, FAX1, ORIGINALPONO, MOSJTSENDFLG, SHIPDATE, DELIVNAME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOLTRACE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrsymboltraceDto implements Serializable {

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
    /** TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trsymboltraceId;

    /** SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _symboltracekey;

    /** TRSYMBOL_ID: {IX+, bigint(19)} */
    @JsonKey
    protected Long _trsymbolId;

    /** CREATEDATETIME: {varchar(8)} */
    @JsonKey
    protected String _createdatetime;

    /** WAREHOUSECD: {IX, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** TRACETYPE: {varchar(30)} */
    @JsonKey
    protected String _tracetype;

    /** INITNUM: {bigint(19)} */
    @JsonKey
    protected Long _initnum;

    /** CASEINNUM: {bigint(19)} */
    @JsonKey
    protected Long _caseinnum;

    /** ASSORTNUM: {bigint(19)} */
    @JsonKey
    protected Long _assortnum;

    /** DIRECTIONNUM: {bigint(19)} */
    @JsonKey
    protected Long _directionnum;

    /** CUSTOMERCD: {varchar(30)} */
    @JsonKey
    protected String _customercd;

    /** DISTWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _distwarehousecd;

    /** MIXEDFLG: {char(1)} */
    @JsonKey
    protected String _mixedflg;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

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

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

    /** NOSHIPPINGFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _noshippingflg;

    /** IFITEMCD: {varchar(30)} */
    @JsonKey
    protected String _ifitemcd;

    /** SENDFLG: {IX+, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sendflg;

    /** RCVKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** PALLETNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletno;

    /** SOKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sokey;

    /** FAX1: {varchar(60)} */
    @JsonKey
    protected String _fax1;

    /** ORIGINALPONO: {varchar(60)} */
    @JsonKey
    protected String _originalpono;

    /** MOSJTSENDFLG: {char(1), default=[0]} */
    @JsonKey
    protected String _mosjtsendflg;

    /** SHIPDATE: {varchar(8)} */
    @JsonKey
    protected String _shipdate;

    /** DELIVNAME: {varchar(255)} */
    @JsonKey
    protected String _delivname;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
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
    public BsTTrsymboltraceDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrsymboltraceDto)) { return false; }
        final BsTTrsymboltraceDto otherEntity = (BsTTrsymboltraceDto)other;
        if (!helpComparingValue(getTrsymboltraceId(), otherEntity.getTrsymboltraceId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSYMBOLTRACE");
        result = xCH(result, getTrsymboltraceId());
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
        sb.append(c).append(getTrsymboltraceId());
        sb.append(c).append(getSymboltracekey());
        sb.append(c).append(getTrsymbolId());
        sb.append(c).append(getCreatedatetime());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getTracetype());
        sb.append(c).append(getInitnum());
        sb.append(c).append(getCaseinnum());
        sb.append(c).append(getAssortnum());
        sb.append(c).append(getDirectionnum());
        sb.append(c).append(getCustomercd());
        sb.append(c).append(getDistwarehousecd());
        sb.append(c).append(getMixedflg());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getNoshippingflg());
        sb.append(c).append(getIfitemcd());
        sb.append(c).append(getSendflg());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getPalletno());
        sb.append(c).append(getSokey());
        sb.append(c).append(getFax1());
        sb.append(c).append(getOriginalpono());
        sb.append(c).append(getMosjtsendflg());
        sb.append(c).append(getShipdate());
        sb.append(c).append(getDelivname());
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
     * [get] TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール追跡情報ID
     * @return The value of the column 'TRSYMBOLTRACE_ID'. (NullAllowed)
     */
    public Long getTrsymboltraceId() {
        return _trsymboltraceId;
    }

    /**
     * [set] TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール追跡情報ID
     * @param trsymboltraceId The value of the column 'TRSYMBOLTRACE_ID'. (NullAllowed)
     */
    public void setTrsymboltraceId(Long trsymboltraceId) {
        __modifiedProperties.add("trsymboltraceId");
        this._trsymboltraceId = trsymboltraceId;
    }

    /**
     * [get] SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} <br>
     * 段ボール追跡キー
     * @return The value of the column 'SYMBOLTRACEKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSymboltracekey() {
        return _symboltracekey;
    }

    /**
     * [set] SYMBOLTRACEKEY: {NotNull, decimal(16, 6)} <br>
     * 段ボール追跡キー
     * @param symboltracekey The value of the column 'SYMBOLTRACEKEY'. (NullAllowed)
     */
    public void setSymboltracekey(java.math.BigDecimal symboltracekey) {
        __modifiedProperties.add("symboltracekey");
        this._symboltracekey = symboltracekey;
    }

    /**
     * [get] TRSYMBOL_ID: {IX+, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public Long getTrsymbolId() {
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {IX+, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed)
     */
    public void setTrsymbolId(Long trsymbolId) {
        __modifiedProperties.add("trsymbolId");
        this._trsymbolId = trsymbolId;
    }

    /**
     * [get] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public String getCreatedatetime() {
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {varchar(8)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed)
     */
    public void setCreatedatetime(String createdatetime) {
        __modifiedProperties.add("createdatetime");
        this._createdatetime = createdatetime;
    }

    /**
     * [get] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {IX, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed)
     */
    public String getTracetype() {
        return _tracetype;
    }

    /**
     * [set] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed)
     */
    public void setTracetype(String tracetype) {
        __modifiedProperties.add("tracetype");
        this._tracetype = tracetype;
    }

    /**
     * [get] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'INITNUM'. (NullAllowed)
     */
    public Long getInitnum() {
        return _initnum;
    }

    /**
     * [set] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed)
     */
    public void setInitnum(Long initnum) {
        __modifiedProperties.add("initnum");
        this._initnum = initnum;
    }

    /**
     * [get] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @return The value of the column 'CASEINNUM'. (NullAllowed)
     */
    public Long getCaseinnum() {
        return _caseinnum;
    }

    /**
     * [set] CASEINNUM: {bigint(19)} <br>
     * ケース内数量
     * @param caseinnum The value of the column 'CASEINNUM'. (NullAllowed)
     */
    public void setCaseinnum(Long caseinnum) {
        __modifiedProperties.add("caseinnum");
        this._caseinnum = caseinnum;
    }

    /**
     * [get] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public Long getAssortnum() {
        return _assortnum;
    }

    /**
     * [set] ASSORTNUM: {bigint(19)} <br>
     * 仕分数量
     * @param assortnum The value of the column 'ASSORTNUM'. (NullAllowed)
     */
    public void setAssortnum(Long assortnum) {
        __modifiedProperties.add("assortnum");
        this._assortnum = assortnum;
    }

    /**
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * ケース内数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public Long getDirectionnum() {
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * ケース内数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public void setDirectionnum(Long directionnum) {
        __modifiedProperties.add("directionnum");
        this._directionnum = directionnum;
    }

    /**
     * [get] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public String getCustomercd() {
        return _customercd;
    }

    /**
     * [set] CUSTOMERCD: {varchar(30)} <br>
     * お得意様CD
     * @param customercd The value of the column 'CUSTOMERCD'. (NullAllowed)
     */
    public void setCustomercd(String customercd) {
        __modifiedProperties.add("customercd");
        this._customercd = customercd;
    }

    /**
     * [get] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @return The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public String getDistwarehousecd() {
        return _distwarehousecd;
    }

    /**
     * [set] DISTWAREHOUSECD: {varchar(30)} <br>
     * 融通先CD
     * @param distwarehousecd The value of the column 'DISTWAREHOUSECD'. (NullAllowed)
     */
    public void setDistwarehousecd(String distwarehousecd) {
        __modifiedProperties.add("distwarehousecd");
        this._distwarehousecd = distwarehousecd;
    }

    /**
     * [get] MIXEDFLG: {char(1)} <br>
     * 疑いフラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed)
     */
    public String getMixedflg() {
        return _mixedflg;
    }

    /**
     * [set] MIXEDFLG: {char(1)} <br>
     * 疑いフラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed)
     */
    public void setMixedflg(String mixedflg) {
        __modifiedProperties.add("mixedflg");
        this._mixedflg = mixedflg;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
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
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] NOSHIPPINGFLG: {decimal(16, 6)} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getNoshippingflg() {
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {decimal(16, 6)} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        __modifiedProperties.add("noshippingflg");
        this._noshippingflg = noshippingflg;
    }

    /**
     * [get] IFITEMCD: {varchar(30)} <br>
     * 需給CD
     * @return The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public String getIfitemcd() {
        return _ifitemcd;
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * 需給CD
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public void setIfitemcd(String ifitemcd) {
        __modifiedProperties.add("ifitemcd");
        this._ifitemcd = ifitemcd;
    }

    /**
     * [get] SENDFLG: {IX+, decimal(16, 6)} <br>
     * 製品追跡送信済フラグ
     * @return The value of the column 'SENDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSendflg() {
        return _sendflg;
    }

    /**
     * [set] SENDFLG: {IX+, decimal(16, 6)} <br>
     * 製品追跡送信済フラグ
     * @param sendflg The value of the column 'SENDFLG'. (NullAllowed)
     */
    public void setSendflg(java.math.BigDecimal sendflg) {
        __modifiedProperties.add("sendflg");
        this._sendflg = sendflg;
    }

    /**
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] PALLETNO: {decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletno() {
        return _palletno;
    }

    /**
     * [set] PALLETNO: {decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (NullAllowed)
     */
    public void setPalletno(java.math.BigDecimal palletno) {
        __modifiedProperties.add("palletno");
        this._palletno = palletno;
    }

    /**
     * [get] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSokey() {
        return _sokey;
    }

    /**
     * [set] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (NullAllowed)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        __modifiedProperties.add("sokey");
        this._sokey = sokey;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @return The value of the column 'FAX1'. (NullAllowed)
     */
    public String getFax1() {
        return _fax1;
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @param fax1 The value of the column 'FAX1'. (NullAllowed)
     */
    public void setFax1(String fax1) {
        __modifiedProperties.add("fax1");
        this._fax1 = fax1;
    }

    /**
     * [get] ORIGINALPONO: {varchar(60)} <br>
     * 特約店CD
     * @return The value of the column 'ORIGINALPONO'. (NullAllowed)
     */
    public String getOriginalpono() {
        return _originalpono;
    }

    /**
     * [set] ORIGINALPONO: {varchar(60)} <br>
     * 特約店CD
     * @param originalpono The value of the column 'ORIGINALPONO'. (NullAllowed)
     */
    public void setOriginalpono(String originalpono) {
        __modifiedProperties.add("originalpono");
        this._originalpono = originalpono;
    }

    /**
     * [get] MOSJTSENDFLG: {char(1), default=[0]} <br>
     * ＭＯＳ国産送信フラグ
     * @return The value of the column 'MOSJTSENDFLG'. (NullAllowed)
     */
    public String getMosjtsendflg() {
        return _mosjtsendflg;
    }

    /**
     * [set] MOSJTSENDFLG: {char(1), default=[0]} <br>
     * ＭＯＳ国産送信フラグ
     * @param mosjtsendflg The value of the column 'MOSJTSENDFLG'. (NullAllowed)
     */
    public void setMosjtsendflg(String mosjtsendflg) {
        __modifiedProperties.add("mosjtsendflg");
        this._mosjtsendflg = mosjtsendflg;
    }

    /**
     * [get] SHIPDATE: {varchar(8)} <br>
     * 出庫実績日
     * @return The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public String getShipdate() {
        return _shipdate;
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * 出庫実績日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public void setShipdate(String shipdate) {
        __modifiedProperties.add("shipdate");
        this._shipdate = shipdate;
    }

    /**
     * [get] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @return The value of the column 'DELIVNAME'. (NullAllowed)
     */
    public String getDelivname() {
        return _delivname;
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed)
     */
    public void setDelivname(String delivname) {
        __modifiedProperties.add("delivname");
        this._delivname = delivname;
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
