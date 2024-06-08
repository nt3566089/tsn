package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSODETAIL as TABLE. <br>
 * 出庫予定明細
 * <pre>
 * [primary-key]
 *     SODETAILID
 *
 * [column]
 *     SODETAILID, SOID, SOLINENO, ORDERLINENO, OWNERORDERLINENO, CUSTORDERLINENO, ORIGINALPOLINENO, PRODUCT_ID, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, STOCK_TYPE_CD, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, XDOCKQTY1, ALLOCQTY1, PICKEDQTY1, SORTEDQTY1, INSPECTEDQTY1, SHIPPEDQTY1, ADJUSTQTY1, PRICE1, PRICE2, PRICE3, NOTES, LOTRESERVEFLG, PICKQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SODETAILID
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
public abstract class BsTTrsodetailDto implements Serializable {

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
    /** SODETAILID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sodetailid;

    /** SOID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** SOLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _solineno;

    /** ORDERLINENO: {bigint(19)} */
    @JsonKey
    protected Long _orderlineno;

    /** OWNERORDERLINENO: {bigint(19)} */
    @JsonKey
    protected Long _ownerorderlineno;

    /** CUSTORDERLINENO: {bigint(19)} */
    @JsonKey
    protected Long _custorderlineno;

    /** ORIGINALPOLINENO: {bigint(19)} */
    @JsonKey
    protected Long _originalpolineno;

    /** PRODUCT_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

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

    /** STOCK_TYPE_CD: {varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** OTHERLOT2: {varchar(60)} */
    @JsonKey
    protected String _otherlot2;

    /** OTHERLOT3: {varchar(60)} */
    @JsonKey
    protected String _otherlot3;

    /** OTHERLOT4: {varchar(60)} */
    @JsonKey
    protected String _otherlot4;

    /** OTHERLOT5: {bigint(19)} */
    @JsonKey
    protected Long _otherlot5;

    /** DAMAGEFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _damageflg;

    /** NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _customsreleaseflg;

    /** TAXFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _taxflg;

    /** EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectqty1;

    /** XDOCKQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _xdockqty1;

    /** ALLOCQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _allocqty1;

    /** PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _pickedqty1;

    /** SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sortedqty1;

    /** INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedqty1;

    /** SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _shippedqty1;

    /** ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _adjustqty1;

    /** PRICE1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _price1;

    /** PRICE2: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _price2;

    /** PRICE3: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _price3;

    /** NOTES: {varchar(30)} */
    @JsonKey
    protected String _notes;

    /** LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _lotreserveflg;

    /** PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _pickqtyerrorflg;

    /** LOGICFLG1: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _logicflg1;

    /** LOGICFLG2: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _logicflg2;

    /** LOGICFLG3: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _logicflg3;

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
    public BsTTrsodetailDto() {
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
        if (other == null || !(other instanceof BsTTrsodetailDto)) { return false; }
        final BsTTrsodetailDto otherEntity = (BsTTrsodetailDto)other;
        if (!helpComparingValue(getSodetailid(), otherEntity.getSodetailid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSODETAIL");
        result = xCH(result, getSodetailid());
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
        sb.append(c).append(getSodetailid());
        sb.append(c).append(getSoid());
        sb.append(c).append(getSolineno());
        sb.append(c).append(getOrderlineno());
        sb.append(c).append(getOwnerorderlineno());
        sb.append(c).append(getCustorderlineno());
        sb.append(c).append(getOriginalpolineno());
        sb.append(c).append(getProductId());
        sb.append(c).append(getIfitemcd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot5());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getOtherlot2());
        sb.append(c).append(getOtherlot3());
        sb.append(c).append(getOtherlot4());
        sb.append(c).append(getOtherlot5());
        sb.append(c).append(getDamageflg());
        sb.append(c).append(getNoshippingflg());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getCustomsreleaseflg());
        sb.append(c).append(getTaxflg());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getXdockqty1());
        sb.append(c).append(getAllocqty1());
        sb.append(c).append(getPickedqty1());
        sb.append(c).append(getSortedqty1());
        sb.append(c).append(getInspectedqty1());
        sb.append(c).append(getShippedqty1());
        sb.append(c).append(getAdjustqty1());
        sb.append(c).append(getPrice1());
        sb.append(c).append(getPrice2());
        sb.append(c).append(getPrice3());
        sb.append(c).append(getNotes());
        sb.append(c).append(getLotreserveflg());
        sb.append(c).append(getPickqtyerrorflg());
        sb.append(c).append(getLogicflg1());
        sb.append(c).append(getLogicflg2());
        sb.append(c).append(getLogicflg3());
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
     * [get] SODETAILID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed)
     */
    public Long getSodetailid() {
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed)
     */
    public void setSodetailid(Long sodetailid) {
        __modifiedProperties.add("sodetailid");
        this._sodetailid = sodetailid;
    }

    /**
     * [get] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {NotNull, bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] SOLINENO: {NotNull, bigint(19)} <br>
     * 出庫指示行№
     * @return The value of the column 'SOLINENO'. (NullAllowed)
     */
    public Long getSolineno() {
        return _solineno;
    }

    /**
     * [set] SOLINENO: {NotNull, bigint(19)} <br>
     * 出庫指示行№
     * @param solineno The value of the column 'SOLINENO'. (NullAllowed)
     */
    public void setSolineno(Long solineno) {
        __modifiedProperties.add("solineno");
        this._solineno = solineno;
    }

    /**
     * [get] ORDERLINENO: {bigint(19)} <br>
     * 受注オーダ行№
     * @return The value of the column 'ORDERLINENO'. (NullAllowed)
     */
    public Long getOrderlineno() {
        return _orderlineno;
    }

    /**
     * [set] ORDERLINENO: {bigint(19)} <br>
     * 受注オーダ行№
     * @param orderlineno The value of the column 'ORDERLINENO'. (NullAllowed)
     */
    public void setOrderlineno(Long orderlineno) {
        __modifiedProperties.add("orderlineno");
        this._orderlineno = orderlineno;
    }

    /**
     * [get] OWNERORDERLINENO: {bigint(19)} <br>
     * 荷主オーダ行№
     * @return The value of the column 'OWNERORDERLINENO'. (NullAllowed)
     */
    public Long getOwnerorderlineno() {
        return _ownerorderlineno;
    }

    /**
     * [set] OWNERORDERLINENO: {bigint(19)} <br>
     * 荷主オーダ行№
     * @param ownerorderlineno The value of the column 'OWNERORDERLINENO'. (NullAllowed)
     */
    public void setOwnerorderlineno(Long ownerorderlineno) {
        __modifiedProperties.add("ownerorderlineno");
        this._ownerorderlineno = ownerorderlineno;
    }

    /**
     * [get] CUSTORDERLINENO: {bigint(19)} <br>
     * 顧客オーダ行№
     * @return The value of the column 'CUSTORDERLINENO'. (NullAllowed)
     */
    public Long getCustorderlineno() {
        return _custorderlineno;
    }

    /**
     * [set] CUSTORDERLINENO: {bigint(19)} <br>
     * 顧客オーダ行№
     * @param custorderlineno The value of the column 'CUSTORDERLINENO'. (NullAllowed)
     */
    public void setCustorderlineno(Long custorderlineno) {
        __modifiedProperties.add("custorderlineno");
        this._custorderlineno = custorderlineno;
    }

    /**
     * [get] ORIGINALPOLINENO: {bigint(19)} <br>
     * 原始ＰＯ行№
     * @return The value of the column 'ORIGINALPOLINENO'. (NullAllowed)
     */
    public Long getOriginalpolineno() {
        return _originalpolineno;
    }

    /**
     * [set] ORIGINALPOLINENO: {bigint(19)} <br>
     * 原始ＰＯ行№
     * @param originalpolineno The value of the column 'ORIGINALPOLINENO'. (NullAllowed)
     */
    public void setOriginalpolineno(Long originalpolineno) {
        __modifiedProperties.add("originalpolineno");
        this._originalpolineno = originalpolineno;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
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
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] OTHERLOT2: {varchar(60)} <br>
     * 依頼種別
     * @return The value of the column 'OTHERLOT2'. (NullAllowed)
     */
    public String getOtherlot2() {
        return _otherlot2;
    }

    /**
     * [set] OTHERLOT2: {varchar(60)} <br>
     * 依頼種別
     * @param otherlot2 The value of the column 'OTHERLOT2'. (NullAllowed)
     */
    public void setOtherlot2(String otherlot2) {
        __modifiedProperties.add("otherlot2");
        this._otherlot2 = otherlot2;
    }

    /**
     * [get] OTHERLOT3: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OTHERLOT3'. (NullAllowed)
     */
    public String getOtherlot3() {
        return _otherlot3;
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * 整理番号
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed)
     */
    public void setOtherlot3(String otherlot3) {
        __modifiedProperties.add("otherlot3");
        this._otherlot3 = otherlot3;
    }

    /**
     * [get] OTHERLOT4: {varchar(60)} <br>
     * 依頼番号
     * @return The value of the column 'OTHERLOT4'. (NullAllowed)
     */
    public String getOtherlot4() {
        return _otherlot4;
    }

    /**
     * [set] OTHERLOT4: {varchar(60)} <br>
     * 依頼番号
     * @param otherlot4 The value of the column 'OTHERLOT4'. (NullAllowed)
     */
    public void setOtherlot4(String otherlot4) {
        __modifiedProperties.add("otherlot4");
        this._otherlot4 = otherlot4;
    }

    /**
     * [get] OTHERLOT5: {bigint(19)} <br>
     * その他属性５（数値）
     * @return The value of the column 'OTHERLOT5'. (NullAllowed)
     */
    public Long getOtherlot5() {
        return _otherlot5;
    }

    /**
     * [set] OTHERLOT5: {bigint(19)} <br>
     * その他属性５（数値）
     * @param otherlot5 The value of the column 'OTHERLOT5'. (NullAllowed)
     */
    public void setOtherlot5(Long otherlot5) {
        __modifiedProperties.add("otherlot5");
        this._otherlot5 = otherlot5;
    }

    /**
     * [get] DAMAGEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public String getDamageflg() {
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public void setDamageflg(String damageflg) {
        __modifiedProperties.add("damageflg");
        this._damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public String getNoshippingflg() {
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public void setNoshippingflg(String noshippingflg) {
        __modifiedProperties.add("noshippingflg");
        this._noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public String getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public String getCustomsreleaseflg() {
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public void setCustomsreleaseflg(String customsreleaseflg) {
        __modifiedProperties.add("customsreleaseflg");
        this._customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {NotNull, char(1), default=[(0)]} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (NullAllowed)
     */
    public String getTaxflg() {
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {NotNull, char(1), default=[(0)]} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (NullAllowed)
     */
    public void setTaxflg(String taxflg) {
        __modifiedProperties.add("taxflg");
        this._taxflg = taxflg;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public Long getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(Long expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] XDOCKQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * クロスドック済数量１（バラ）
     * @return The value of the column 'XDOCKQTY1'. (NullAllowed)
     */
    public Long getXdockqty1() {
        return _xdockqty1;
    }

    /**
     * [set] XDOCKQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * クロスドック済数量１（バラ）
     * @param xdockqty1 The value of the column 'XDOCKQTY1'. (NullAllowed)
     */
    public void setXdockqty1(Long xdockqty1) {
        __modifiedProperties.add("xdockqty1");
        this._xdockqty1 = xdockqty1;
    }

    /**
     * [get] ALLOCQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 引当済数量１（バラ）
     * @return The value of the column 'ALLOCQTY1'. (NullAllowed)
     */
    public Long getAllocqty1() {
        return _allocqty1;
    }

    /**
     * [set] ALLOCQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 引当済数量１（バラ）
     * @param allocqty1 The value of the column 'ALLOCQTY1'. (NullAllowed)
     */
    public void setAllocqty1(Long allocqty1) {
        __modifiedProperties.add("allocqty1");
        this._allocqty1 = allocqty1;
    }

    /**
     * [get] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public Long getPickedqty1() {
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量１（バラ）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public void setPickedqty1(Long pickedqty1) {
        __modifiedProperties.add("pickedqty1");
        this._pickedqty1 = pickedqty1;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public Long getSortedqty1() {
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public void setSortedqty1(Long sortedqty1) {
        __modifiedProperties.add("sortedqty1");
        this._sortedqty1 = sortedqty1;
    }

    /**
     * [get] INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @return The value of the column 'INSPECTEDQTY1'. (NullAllowed)
     */
    public Long getInspectedqty1() {
        return _inspectedqty1;
    }

    /**
     * [set] INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量１（バラ）
     * @param inspectedqty1 The value of the column 'INSPECTEDQTY1'. (NullAllowed)
     */
    public void setInspectedqty1(Long inspectedqty1) {
        __modifiedProperties.add("inspectedqty1");
        this._inspectedqty1 = inspectedqty1;
    }

    /**
     * [get] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @return The value of the column 'SHIPPEDQTY1'. (NullAllowed)
     */
    public Long getShippedqty1() {
        return _shippedqty1;
    }

    /**
     * [set] SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 出庫実績数量１（バラ）
     * @param shippedqty1 The value of the column 'SHIPPEDQTY1'. (NullAllowed)
     */
    public void setShippedqty1(Long shippedqty1) {
        __modifiedProperties.add("shippedqty1");
        this._shippedqty1 = shippedqty1;
    }

    /**
     * [get] ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量（個）
     * @return The value of the column 'ADJUSTQTY1'. (NullAllowed)
     */
    public Long getAdjustqty1() {
        return _adjustqty1;
    }

    /**
     * [set] ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量（個）
     * @param adjustqty1 The value of the column 'ADJUSTQTY1'. (NullAllowed)
     */
    public void setAdjustqty1(Long adjustqty1) {
        __modifiedProperties.add("adjustqty1");
        this._adjustqty1 = adjustqty1;
    }

    /**
     * [get] PRICE1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価１
     * @return The value of the column 'PRICE1'. (NullAllowed)
     */
    public java.math.BigDecimal getPrice1() {
        return _price1;
    }

    /**
     * [set] PRICE1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 銘柄単価１
     * @param price1 The value of the column 'PRICE1'. (NullAllowed)
     */
    public void setPrice1(java.math.BigDecimal price1) {
        __modifiedProperties.add("price1");
        this._price1 = price1;
    }

    /**
     * [get] PRICE2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレタイズ順
     * @return The value of the column 'PRICE2'. (NullAllowed)
     */
    public java.math.BigDecimal getPrice2() {
        return _price2;
    }

    /**
     * [set] PRICE2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレタイズ順
     * @param price2 The value of the column 'PRICE2'. (NullAllowed)
     */
    public void setPrice2(java.math.BigDecimal price2) {
        __modifiedProperties.add("price2");
        this._price2 = price2;
    }

    /**
     * [get] PRICE3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレット種別
     * @return The value of the column 'PRICE3'. (NullAllowed)
     */
    public java.math.BigDecimal getPrice3() {
        return _price3;
    }

    /**
     * [set] PRICE3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレット種別
     * @param price3 The value of the column 'PRICE3'. (NullAllowed)
     */
    public void setPrice3(java.math.BigDecimal price3) {
        __modifiedProperties.add("price3");
        this._price3 = price3;
    }

    /**
     * [get] NOTES: {varchar(30)} <br>
     * パレット番号（保税）
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(30)} <br>
     * パレット番号（保税）
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} <br>
     * ロット指定フラグ
     * @return The value of the column 'LOTRESERVEFLG'. (NullAllowed)
     */
    public String getLotreserveflg() {
        return _lotreserveflg;
    }

    /**
     * [set] LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]} <br>
     * ロット指定フラグ
     * @param lotreserveflg The value of the column 'LOTRESERVEFLG'. (NullAllowed)
     */
    public void setLotreserveflg(String lotreserveflg) {
        __modifiedProperties.add("lotreserveflg");
        this._lotreserveflg = lotreserveflg;
    }

    /**
     * [get] PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} <br>
     * ピッキング数量異常フラグ
     * @return The value of the column 'PICKQTYERRORFLG'. (NullAllowed)
     */
    public String getPickqtyerrorflg() {
        return _pickqtyerrorflg;
    }

    /**
     * [set] PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]} <br>
     * ピッキング数量異常フラグ
     * @param pickqtyerrorflg The value of the column 'PICKQTYERRORFLG'. (NullAllowed)
     */
    public void setPickqtyerrorflg(String pickqtyerrorflg) {
        __modifiedProperties.add("pickqtyerrorflg");
        this._pickqtyerrorflg = pickqtyerrorflg;
    }

    /**
     * [get] LOGICFLG1: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @return The value of the column 'LOGICFLG1'. (NullAllowed)
     */
    public String getLogicflg1() {
        return _logicflg1;
    }

    /**
     * [set] LOGICFLG1: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @param logicflg1 The value of the column 'LOGICFLG1'. (NullAllowed)
     */
    public void setLogicflg1(String logicflg1) {
        __modifiedProperties.add("logicflg1");
        this._logicflg1 = logicflg1;
    }

    /**
     * [get] LOGICFLG2: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @return The value of the column 'LOGICFLG2'. (NullAllowed)
     */
    public String getLogicflg2() {
        return _logicflg2;
    }

    /**
     * [set] LOGICFLG2: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @param logicflg2 The value of the column 'LOGICFLG2'. (NullAllowed)
     */
    public void setLogicflg2(String logicflg2) {
        __modifiedProperties.add("logicflg2");
        this._logicflg2 = logicflg2;
    }

    /**
     * [get] LOGICFLG3: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @return The value of the column 'LOGICFLG3'. (NullAllowed)
     */
    public String getLogicflg3() {
        return _logicflg3;
    }

    /**
     * [set] LOGICFLG3: {NotNull, char(1), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @param logicflg3 The value of the column 'LOGICFLG3'. (NullAllowed)
     */
    public void setLogicflg3(String logicflg3) {
        __modifiedProperties.add("logicflg3");
        this._logicflg3 = logicflg3;
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
