package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRRCVINSPECT as TABLE. <br>
 * 入庫検品
 * <pre>
 * [primary-key]
 *     TRRCVINSPECT_ID
 *
 * [column]
 *     TRRCVINSPECT_ID, ACCEPTKEY, RCVKEY, RCVLINENO, INSPECTUSERCD, INSPECTEDQTY1, INSPECTEDQTY2, INSPECTEDQTY3, INSTRUCTQTY1, INSTRUCTQTY2, INSTRUCTQTY3, WAREHOUSECD, OWNERCD, ITEMADMIN, PRODUCT_CD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOTKEY, NOTES, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVINSPECT_ID
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
public abstract class BsTTrrcvinspectDto implements Serializable {

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
    /** TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trrcvinspectId;

    /** ACCEPTKEY: {IX, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _acceptkey;

    /** RCVKEY: {IX+, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** RCVLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** INSPECTUSERCD: {varchar(30)} */
    @JsonKey
    protected String _inspectusercd;

    /** INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _inspectedqty1;

    /** INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedqty2;

    /** INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedqty3;

    /** INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _instructqty1;

    /** INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _instructqty2;

    /** INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _instructqty3;

    /** WAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** OWNERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ownercd;

    /** ITEMADMIN: {IX+, NotNull, varchar(30)} */
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

    /** LOTKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _lotkey;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

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
    public BsTTrrcvinspectDto() {
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
        if (other == null || !(other instanceof BsTTrrcvinspectDto)) { return false; }
        final BsTTrrcvinspectDto otherEntity = (BsTTrrcvinspectDto)other;
        if (!helpComparingValue(getTrrcvinspectId(), otherEntity.getTrrcvinspectId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRRCVINSPECT");
        result = xCH(result, getTrrcvinspectId());
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
        sb.append(c).append(getTrrcvinspectId());
        sb.append(c).append(getAcceptkey());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getInspectusercd());
        sb.append(c).append(getInspectedqty1());
        sb.append(c).append(getInspectedqty2());
        sb.append(c).append(getInspectedqty3());
        sb.append(c).append(getInstructqty1());
        sb.append(c).append(getInstructqty2());
        sb.append(c).append(getInstructqty3());
        sb.append(c).append(getWarehousecd());
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
        sb.append(c).append(getLotkey());
        sb.append(c).append(getNotes());
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
     * [get] TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫検品ID
     * @return The value of the column 'TRRCVINSPECT_ID'. (NullAllowed)
     */
    public Long getTrrcvinspectId() {
        return _trrcvinspectId;
    }

    /**
     * [set] TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫検品ID
     * @param trrcvinspectId The value of the column 'TRRCVINSPECT_ID'. (NullAllowed)
     */
    public void setTrrcvinspectId(Long trrcvinspectId) {
        __modifiedProperties.add("trrcvinspectId");
        this._trrcvinspectId = trrcvinspectId;
    }

    /**
     * [get] ACCEPTKEY: {IX, decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @return The value of the column 'ACCEPTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getAcceptkey() {
        return _acceptkey;
    }

    /**
     * [set] ACCEPTKEY: {IX, decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @param acceptkey The value of the column 'ACCEPTKEY'. (NullAllowed)
     */
    public void setAcceptkey(java.math.BigDecimal acceptkey) {
        __modifiedProperties.add("acceptkey");
        this._acceptkey = acceptkey;
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
     * [get] INSPECTUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @return The value of the column 'INSPECTUSERCD'. (NullAllowed)
     */
    public String getInspectusercd() {
        return _inspectusercd;
    }

    /**
     * [set] INSPECTUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @param inspectusercd The value of the column 'INSPECTUSERCD'. (NullAllowed)
     */
    public void setInspectusercd(String inspectusercd) {
        __modifiedProperties.add("inspectusercd");
        this._inspectusercd = inspectusercd;
    }

    /**
     * [get] INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @return The value of the column 'INSPECTEDQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getInspectedqty1() {
        return _inspectedqty1;
    }

    /**
     * [set] INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @param inspectedqty1 The value of the column 'INSPECTEDQTY1'. (NullAllowed)
     */
    public void setInspectedqty1(java.math.BigDecimal inspectedqty1) {
        __modifiedProperties.add("inspectedqty1");
        this._inspectedqty1 = inspectedqty1;
    }

    /**
     * [get] INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量２
     * @return The value of the column 'INSPECTEDQTY2'. (NullAllowed)
     */
    public Long getInspectedqty2() {
        return _inspectedqty2;
    }

    /**
     * [set] INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量２
     * @param inspectedqty2 The value of the column 'INSPECTEDQTY2'. (NullAllowed)
     */
    public void setInspectedqty2(Long inspectedqty2) {
        __modifiedProperties.add("inspectedqty2");
        this._inspectedqty2 = inspectedqty2;
    }

    /**
     * [get] INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量３
     * @return The value of the column 'INSPECTEDQTY3'. (NullAllowed)
     */
    public Long getInspectedqty3() {
        return _inspectedqty3;
    }

    /**
     * [set] INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量３
     * @param inspectedqty3 The value of the column 'INSPECTEDQTY3'. (NullAllowed)
     */
    public void setInspectedqty3(Long inspectedqty3) {
        __modifiedProperties.add("inspectedqty3");
        this._inspectedqty3 = inspectedqty3;
    }

    /**
     * [get] INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫受入指示数量１(バラ)
     * @return The value of the column 'INSTRUCTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getInstructqty1() {
        return _instructqty1;
    }

    /**
     * [set] INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫受入指示数量１(バラ)
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
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] OWNERCD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (NullAllowed)
     */
    public String getOwnercd() {
        return _ownercd;
    }

    /**
     * [set] OWNERCD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (NullAllowed)
     */
    public void setOwnercd(String ownercd) {
        __modifiedProperties.add("ownercd");
        this._ownercd = ownercd;
    }

    /**
     * [get] ITEMADMIN: {IX+, NotNull, varchar(30)} <br>
     * 品目管理社
     * @return The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public String getItemadmin() {
        return _itemadmin;
    }

    /**
     * [set] ITEMADMIN: {IX+, NotNull, varchar(30)} <br>
     * 品目管理社
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
     * I/F品目CD
     * @return The value of the column 'IFITEMCD'. (NullAllowed)
     */
    public String getIfitemcd() {
        return _ifitemcd;
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * I/F品目CD
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
     * [get] LOTKEY: {IX, bigint(19)} <br>
     * ロットＫｅｙ
     * @return The value of the column 'LOTKEY'. (NullAllowed)
     */
    public Long getLotkey() {
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {IX, bigint(19)} <br>
     * ロットＫｅｙ
     * @param lotkey The value of the column 'LOTKEY'. (NullAllowed)
     */
    public void setLotkey(Long lotkey) {
        __modifiedProperties.add("lotkey");
        this._lotkey = lotkey;
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
