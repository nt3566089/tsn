package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRRCVTAGDETAIL as TABLE. <br>
 * 入庫受入指示明細
 * <pre>
 * [primary-key]
 *     TRRCVTAGDETAIL_ID
 *
 * [column]
 *     TRRCVTAGDETAIL_ID, RCVTAGKEY, ACCEPTKEY, ACCEPTLINENO, RCVKEY, RCVLINENO, STS, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOGISTICSCD, WAREHOUSECD, SLOTFLG, TOLOCCD, LOCCD, LOTKEY, TAGCD, ODDSFLG, INSTRUCTQTY1, INSTRUCTQTY2, INSTRUCTQTY3, LOADQTY1, LOADQTY2, LOADQTY3, LABELPRINTEDFLG, NOTES, SOKEY, SOLINENO, TRIGGERTYPE, PROSPECTFLG, PROSPECTUPDATEFLG, SLOTTYPE, SLOTTEDUSERCD, XDOCKORDERKEY, PICKKEY, FULLPALLETKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVTAGDETAIL_ID
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
public abstract class BsTTrrcvtagdetailDto implements Serializable {

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
    /** TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trrcvtagdetailId;

    /** RCVTAGKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvtagkey;

    /** ACCEPTKEY: {IX+, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _acceptkey;

    /** ACCEPTLINENO: {bigint(19)} */
    @JsonKey
    protected Long _acceptlineno;

    /** RCVKEY: {IX+, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** RCVLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** STS: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _sts;

    /** OWNERCD: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _ownercd;

    /** ITEMADMIN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemadmin;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** IFITEMCD: {varchar(30)} */
    @JsonKey
    protected String _ifitemcd;

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

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

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

    /** DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _damageflg;

    /** NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _customsreleaseflg;

    /** TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _taxflg;

    /** LOGISTICSCD: {varchar(30)} */
    @JsonKey
    protected String _logisticscd;

    /** WAREHOUSECD: {IX+, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _slotflg;

    /** TOLOCCD: {varchar(30)} */
    @JsonKey
    protected String _toloccd;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** LOTKEY: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotkey;

    /** TAGCD: {varchar(30)} */
    @JsonKey
    protected String _tagcd;

    /** ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _oddsflg;

    /** INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _instructqty1;

    /** INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _instructqty2;

    /** INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _instructqty3;

    /** LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _loadqty1;

    /** LOADQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _loadqty2;

    /** LOADQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _loadqty3;

    /** LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _labelprintedflg;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** SOKEY: {IX+, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sokey;

    /** SOLINENO: {bigint(19)} */
    @JsonKey
    protected Long _solineno;

    /** TRIGGERTYPE: {varchar(30)} */
    @JsonKey
    protected String _triggertype;

    /** PROSPECTFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _prospectflg;

    /** PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _prospectupdateflg;

    /** SLOTTYPE: {varchar(30)} */
    @JsonKey
    protected String _slottype;

    /** SLOTTEDUSERCD: {varchar(30)} */
    @JsonKey
    protected String _slottedusercd;

    /** XDOCKORDERKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _xdockorderkey;

    /** PICKKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _pickkey;

    /** FULLPALLETKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _fullpalletkey;

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
    public BsTTrrcvtagdetailDto() {
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
        if (other == null || !(other instanceof BsTTrrcvtagdetailDto)) { return false; }
        final BsTTrrcvtagdetailDto otherEntity = (BsTTrrcvtagdetailDto)other;
        if (!helpComparingValue(getTrrcvtagdetailId(), otherEntity.getTrrcvtagdetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRRCVTAGDETAIL");
        result = xCH(result, getTrrcvtagdetailId());
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
        sb.append(c).append(getTrrcvtagdetailId());
        sb.append(c).append(getRcvtagkey());
        sb.append(c).append(getAcceptkey());
        sb.append(c).append(getAcceptlineno());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getSts());
        sb.append(c).append(getOwnercd());
        sb.append(c).append(getItemadmin());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getIfitemcd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot5());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getOtherlot2());
        sb.append(c).append(getOtherlot3());
        sb.append(c).append(getOtherlot4());
        sb.append(c).append(getOtherlot5());
        sb.append(c).append(getDamageflg());
        sb.append(c).append(getNoshippingflg());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getCustomsreleaseflg());
        sb.append(c).append(getTaxflg());
        sb.append(c).append(getLogisticscd());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getSlotflg());
        sb.append(c).append(getToloccd());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getLotkey());
        sb.append(c).append(getTagcd());
        sb.append(c).append(getOddsflg());
        sb.append(c).append(getInstructqty1());
        sb.append(c).append(getInstructqty2());
        sb.append(c).append(getInstructqty3());
        sb.append(c).append(getLoadqty1());
        sb.append(c).append(getLoadqty2());
        sb.append(c).append(getLoadqty3());
        sb.append(c).append(getLabelprintedflg());
        sb.append(c).append(getNotes());
        sb.append(c).append(getSokey());
        sb.append(c).append(getSolineno());
        sb.append(c).append(getTriggertype());
        sb.append(c).append(getProspectflg());
        sb.append(c).append(getProspectupdateflg());
        sb.append(c).append(getSlottype());
        sb.append(c).append(getSlottedusercd());
        sb.append(c).append(getXdockorderkey());
        sb.append(c).append(getPickkey());
        sb.append(c).append(getFullpalletkey());
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
     * [get] TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受入指示明細ID
     * @return The value of the column 'TRRCVTAGDETAIL_ID'. (NullAllowed)
     */
    public Long getTrrcvtagdetailId() {
        return _trrcvtagdetailId;
    }

    /**
     * [set] TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫受入指示明細ID
     * @param trrcvtagdetailId The value of the column 'TRRCVTAGDETAIL_ID'. (NullAllowed)
     */
    public void setTrrcvtagdetailId(Long trrcvtagdetailId) {
        __modifiedProperties.add("trrcvtagdetailId");
        this._trrcvtagdetailId = trrcvtagdetailId;
    }

    /**
     * [get] RCVTAGKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫積付指示Ｋｅｙ
     * @return The value of the column 'RCVTAGKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvtagkey() {
        return _rcvtagkey;
    }

    /**
     * [set] RCVTAGKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫積付指示Ｋｅｙ
     * @param rcvtagkey The value of the column 'RCVTAGKEY'. (NullAllowed)
     */
    public void setRcvtagkey(java.math.BigDecimal rcvtagkey) {
        __modifiedProperties.add("rcvtagkey");
        this._rcvtagkey = rcvtagkey;
    }

    /**
     * [get] ACCEPTKEY: {IX+, decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @return The value of the column 'ACCEPTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getAcceptkey() {
        return _acceptkey;
    }

    /**
     * [set] ACCEPTKEY: {IX+, decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @param acceptkey The value of the column 'ACCEPTKEY'. (NullAllowed)
     */
    public void setAcceptkey(java.math.BigDecimal acceptkey) {
        __modifiedProperties.add("acceptkey");
        this._acceptkey = acceptkey;
    }

    /**
     * [get] ACCEPTLINENO: {bigint(19)} <br>
     * 入庫受付行№
     * @return The value of the column 'ACCEPTLINENO'. (NullAllowed)
     */
    public Long getAcceptlineno() {
        return _acceptlineno;
    }

    /**
     * [set] ACCEPTLINENO: {bigint(19)} <br>
     * 入庫受付行№
     * @param acceptlineno The value of the column 'ACCEPTLINENO'. (NullAllowed)
     */
    public void setAcceptlineno(Long acceptlineno) {
        __modifiedProperties.add("acceptlineno");
        this._acceptlineno = acceptlineno;
    }

    /**
     * [get] RCVKEY: {IX+, NotNull, decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {IX+, NotNull, decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @return The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public Long getRcvlineno() {
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {NotNull, bigint(19)} <br>
     * 入庫行№
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public void setRcvlineno(Long rcvlineno) {
        __modifiedProperties.add("rcvlineno");
        this._rcvlineno = rcvlineno;
    }

    /**
     * [get] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public Long getSts() {
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(Long sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
    }

    /**
     * [get] OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (NullAllowed)
     */
    public String getOwnercd() {
        return _ownercd;
    }

    /**
     * [set] OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (NullAllowed)
     */
    public void setOwnercd(String ownercd) {
        __modifiedProperties.add("ownercd");
        this._ownercd = ownercd;
    }

    /**
     * [get] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public String getItemadmin() {
        return _itemadmin;
    }

    /**
     * [set] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @param itemadmin The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public void setItemadmin(String itemadmin) {
        __modifiedProperties.add("itemadmin");
        this._itemadmin = itemadmin;
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
     * [get] IFITEMCD: {varchar(30)} <br>
     * I/F銘柄CD
     * @return The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public String getIfitemcd() {
        return _ifitemcd;
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * I/F銘柄CD
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public void setIfitemcd(String ifitemcd) {
        __modifiedProperties.add("ifitemcd");
        this._ifitemcd = ifitemcd;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 管理１
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 管理１
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 管理２
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 管理２
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * 管理３
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * 管理３
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 管理４（日付属性１）
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 管理４（日付属性１）
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
     * [get] OTHERLOT1: {varchar(60)} <br>
     * その他属性１
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * その他属性１
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
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
     * [get] DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getDamageflg() {
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        __modifiedProperties.add("damageflg");
        this._damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getNoshippingflg() {
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public void setNoshippingflg(java.math.BigDecimal noshippingflg) {
        __modifiedProperties.add("noshippingflg");
        this._noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        __modifiedProperties.add("customsreleaseflg");
        this._customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getTaxflg() {
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (NullAllowed)
     */
    public void setTaxflg(java.math.BigDecimal taxflg) {
        __modifiedProperties.add("taxflg");
        this._taxflg = taxflg;
    }

    /**
     * [get] LOGISTICSCD: {varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @return The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public String getLogisticscd() {
        return _logisticscd;
    }

    /**
     * [set] LOGISTICSCD: {varchar(30)} <br>
     * 取引先（倉庫会社）CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public void setLogisticscd(String logisticscd) {
        __modifiedProperties.add("logisticscd");
        this._logisticscd = logisticscd;
    }

    /**
     * [get] WAREHOUSECD: {IX+, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {IX+, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ロケーション指示フラグ
     * @return The value of the column 'SLOTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSlotflg() {
        return _slotflg;
    }

    /**
     * [set] SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 格納ロケーション指示フラグ
     * @param slotflg The value of the column 'SLOTFLG'. (NullAllowed)
     */
    public void setSlotflg(java.math.BigDecimal slotflg) {
        __modifiedProperties.add("slotflg");
        this._slotflg = slotflg;
    }

    /**
     * [get] TOLOCCD: {varchar(30)} <br>
     * 格納指示ロケーションCD
     * @return The value of the column 'TOLOCCD'. (NullAllowed)
     */
    public String getToloccd() {
        return _toloccd;
    }

    /**
     * [set] TOLOCCD: {varchar(30)} <br>
     * 格納指示ロケーションCD
     * @param toloccd The value of the column 'TOLOCCD'. (NullAllowed)
     */
    public void setToloccd(String toloccd) {
        __modifiedProperties.add("toloccd");
        this._toloccd = toloccd;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * 格納実績ロケーションCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * 格納実績ロケーションCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
    }

    /**
     * [get] LOTKEY: {IX, NotNull, bigint(19)} <br>
     * 実績ロットＫｅｙ
     * @return The value of the column 'LOTKEY'. (NullAllowed)
     */
    public Long getLotkey() {
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {IX, NotNull, bigint(19)} <br>
     * 実績ロットＫｅｙ
     * @param lotkey The value of the column 'LOTKEY'. (NullAllowed)
     */
    public void setLotkey(Long lotkey) {
        __modifiedProperties.add("lotkey");
        this._lotkey = lotkey;
    }

    /**
     * [get] TAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed)
     */
    public String getTagcd() {
        return _tagcd;
    }

    /**
     * [set] TAGCD: {varchar(30)} <br>
     * 実績タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed)
     */
    public void setTagcd(String tagcd) {
        __modifiedProperties.add("tagcd");
        this._tagcd = tagcd;
    }

    /**
     * [get] ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 端数フラグ
     * @return The value of the column 'ODDSFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOddsflg() {
        return _oddsflg;
    }

    /**
     * [set] ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 端数フラグ
     * @param oddsflg The value of the column 'ODDSFLG'. (NullAllowed)
     */
    public void setOddsflg(java.math.BigDecimal oddsflg) {
        __modifiedProperties.add("oddsflg");
        this._oddsflg = oddsflg;
    }

    /**
     * [get] INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫受入指示数量１（バラ）
     * @return The value of the column 'INSTRUCTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getInstructqty1() {
        return _instructqty1;
    }

    /**
     * [set] INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫受入指示数量１（バラ）
     * @param instructqty1 The value of the column 'INSTRUCTQTY1'. (NullAllowed)
     */
    public void setInstructqty1(java.math.BigDecimal instructqty1) {
        __modifiedProperties.add("instructqty1");
        this._instructqty1 = instructqty1;
    }

    /**
     * [get] INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量２
     * @return The value of the column 'INSTRUCTQTY2'. (NullAllowed)
     */
    public Long getInstructqty2() {
        return _instructqty2;
    }

    /**
     * [set] INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量２
     * @param instructqty2 The value of the column 'INSTRUCTQTY2'. (NullAllowed)
     */
    public void setInstructqty2(Long instructqty2) {
        __modifiedProperties.add("instructqty2");
        this._instructqty2 = instructqty2;
    }

    /**
     * [get] INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量３
     * @return The value of the column 'INSTRUCTQTY3'. (NullAllowed)
     */
    public Long getInstructqty3() {
        return _instructqty3;
    }

    /**
     * [set] INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫受入指示数量３
     * @param instructqty3 The value of the column 'INSTRUCTQTY3'. (NullAllowed)
     */
    public void setInstructqty3(Long instructqty3) {
        __modifiedProperties.add("instructqty3");
        this._instructqty3 = instructqty3;
    }

    /**
     * [get] LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付格納数量１（バラ）
     * @return The value of the column 'LOADQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getLoadqty1() {
        return _loadqty1;
    }

    /**
     * [set] LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付格納数量１（バラ）
     * @param loadqty1 The value of the column 'LOADQTY1'. (NullAllowed)
     */
    public void setLoadqty1(java.math.BigDecimal loadqty1) {
        __modifiedProperties.add("loadqty1");
        this._loadqty1 = loadqty1;
    }

    /**
     * [get] LOADQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量２
     * @return The value of the column 'LOADQTY2'. (NullAllowed)
     */
    public Long getLoadqty2() {
        return _loadqty2;
    }

    /**
     * [set] LOADQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量２
     * @param loadqty2 The value of the column 'LOADQTY2'. (NullAllowed)
     */
    public void setLoadqty2(Long loadqty2) {
        __modifiedProperties.add("loadqty2");
        this._loadqty2 = loadqty2;
    }

    /**
     * [get] LOADQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量３
     * @return The value of the column 'LOADQTY3'. (NullAllowed)
     */
    public Long getLoadqty3() {
        return _loadqty3;
    }

    /**
     * [set] LOADQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫積付格納数量３
     * @param loadqty3 The value of the column 'LOADQTY3'. (NullAllowed)
     */
    public void setLoadqty3(Long loadqty3) {
        __modifiedProperties.add("loadqty3");
        this._loadqty3 = loadqty3;
    }

    /**
     * [get] LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * ラベル発行済フラグ
     * @return The value of the column 'LABELPRINTEDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getLabelprintedflg() {
        return _labelprintedflg;
    }

    /**
     * [set] LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * ラベル発行済フラグ
     * @param labelprintedflg The value of the column 'LABELPRINTEDFLG'. (NullAllowed)
     */
    public void setLabelprintedflg(java.math.BigDecimal labelprintedflg) {
        __modifiedProperties.add("labelprintedflg");
        this._labelprintedflg = labelprintedflg;
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
     * [get] SOKEY: {IX+, decimal(16, 6)} <br>
     * クロスドック出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSokey() {
        return _sokey;
    }

    /**
     * [set] SOKEY: {IX+, decimal(16, 6)} <br>
     * クロスドック出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (NullAllowed)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        __modifiedProperties.add("sokey");
        this._sokey = sokey;
    }

    /**
     * [get] SOLINENO: {bigint(19)} <br>
     * クロスドック出庫指示行№
     * @return The value of the column 'SOLINENO'. (NullAllowed)
     */
    public Long getSolineno() {
        return _solineno;
    }

    /**
     * [set] SOLINENO: {bigint(19)} <br>
     * クロスドック出庫指示行№
     * @param solineno The value of the column 'SOLINENO'. (NullAllowed)
     */
    public void setSolineno(Long solineno) {
        __modifiedProperties.add("solineno");
        this._solineno = solineno;
    }

    /**
     * [get] TRIGGERTYPE: {varchar(30)} <br>
     * トリガー起動タイプ
     * @return The value of the column 'TRIGGERTYPE'. (NullAllowed)
     */
    public String getTriggertype() {
        return _triggertype;
    }

    /**
     * [set] TRIGGERTYPE: {varchar(30)} <br>
     * トリガー起動タイプ
     * @param triggertype The value of the column 'TRIGGERTYPE'. (NullAllowed)
     */
    public void setTriggertype(String triggertype) {
        __modifiedProperties.add("triggertype");
        this._triggertype = triggertype;
    }

    /**
     * [get] PROSPECTFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量種別
     * @return The value of the column 'PROSPECTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getProspectflg() {
        return _prospectflg;
    }

    /**
     * [set] PROSPECTFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量種別
     * @param prospectflg The value of the column 'PROSPECTFLG'. (NullAllowed)
     */
    public void setProspectflg(java.math.BigDecimal prospectflg) {
        __modifiedProperties.add("prospectflg");
        this._prospectflg = prospectflg;
    }

    /**
     * [get] PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量更新フラグ
     * @return The value of the column 'PROSPECTUPDATEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getProspectupdateflg() {
        return _prospectupdateflg;
    }

    /**
     * [set] PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]} <br>
     * 見込数量更新フラグ
     * @param prospectupdateflg The value of the column 'PROSPECTUPDATEFLG'. (NullAllowed)
     */
    public void setProspectupdateflg(java.math.BigDecimal prospectupdateflg) {
        __modifiedProperties.add("prospectupdateflg");
        this._prospectupdateflg = prospectupdateflg;
    }

    /**
     * [get] SLOTTYPE: {varchar(30)} <br>
     * 格納タイプ
     * @return The value of the column 'SLOTTYPE'. (NullAllowed)
     */
    public String getSlottype() {
        return _slottype;
    }

    /**
     * [set] SLOTTYPE: {varchar(30)} <br>
     * 格納タイプ
     * @param slottype The value of the column 'SLOTTYPE'. (NullAllowed)
     */
    public void setSlottype(String slottype) {
        __modifiedProperties.add("slottype");
        this._slottype = slottype;
    }

    /**
     * [get] SLOTTEDUSERCD: {varchar(30)} <br>
     * 格納担当者
     * @return The value of the column 'SLOTTEDUSERCD'. (NullAllowed)
     */
    public String getSlottedusercd() {
        return _slottedusercd;
    }

    /**
     * [set] SLOTTEDUSERCD: {varchar(30)} <br>
     * 格納担当者
     * @param slottedusercd The value of the column 'SLOTTEDUSERCD'. (NullAllowed)
     */
    public void setSlottedusercd(String slottedusercd) {
        __modifiedProperties.add("slottedusercd");
        this._slottedusercd = slottedusercd;
    }

    /**
     * [get] XDOCKORDERKEY: {decimal(16, 6)} <br>
     * クロスドックオーダーキー
     * @return The value of the column 'XDOCKORDERKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getXdockorderkey() {
        return _xdockorderkey;
    }

    /**
     * [set] XDOCKORDERKEY: {decimal(16, 6)} <br>
     * クロスドックオーダーキー
     * @param xdockorderkey The value of the column 'XDOCKORDERKEY'. (NullAllowed)
     */
    public void setXdockorderkey(java.math.BigDecimal xdockorderkey) {
        __modifiedProperties.add("xdockorderkey");
        this._xdockorderkey = xdockorderkey;
    }

    /**
     * [get] PICKKEY: {IX, bigint(19)} <br>
     * ピッキング指示Ｋｅｙ
     * @return The value of the column 'PICKKEY'. (NullAllowed)
     */
    public Long getPickkey() {
        return _pickkey;
    }

    /**
     * [set] PICKKEY: {IX, bigint(19)} <br>
     * ピッキング指示Ｋｅｙ
     * @param pickkey The value of the column 'PICKKEY'. (NullAllowed)
     */
    public void setPickkey(Long pickkey) {
        __modifiedProperties.add("pickkey");
        this._pickkey = pickkey;
    }

    /**
     * [get] FULLPALLETKEY: {decimal(16, 6)} <br>
     * フルパレットキー
     * @return The value of the column 'FULLPALLETKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getFullpalletkey() {
        return _fullpalletkey;
    }

    /**
     * [set] FULLPALLETKEY: {decimal(16, 6)} <br>
     * フルパレットキー
     * @param fullpalletkey The value of the column 'FULLPALLETKEY'. (NullAllowed)
     */
    public void setFullpalletkey(java.math.BigDecimal fullpalletkey) {
        __modifiedProperties.add("fullpalletkey");
        this._fullpalletkey = fullpalletkey;
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
