package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRRCVDETAIL as TABLE. <br>
 * 入庫予定明細
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, RCVLINENO, SUPPLIERRCVLINENO, XDOCFLG, POKEY, POLINENO, POTYPE, OWNERPOLINENO, ORIGINALPONO, ORIGINALPOLINENO, PODATE, OWNERCD, ITEMADMIN, PRODUCT_CD, ITEMCD, IFITEMCD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT1, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, RECEIVEDQTY1, RECEIVEDQTY2, RECEIVEDQTY3, ADJUSTQTY1, ADJUSTQTY2, ADJUSTQTY3, RCVTAGQTY1, XDOCFREEQTY1, INSPECTEDQTY1, INSPECTEDQTY2, INSPECTEDQTY3, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, NOTES, ICDATE, ORDERKEY, ORDERLINENO, OWNERORDERNO, OWNERORDERLINENO, CUSTORDERNO, CUSTORDERLINENO, ORDERTYPE, RCVQTYERRORFLG, LOGICFLG1, LOGICFLG2, LOGICFLG3, MOVELINENO, ASSYLINENO, PRODUCELINENO, CHECKLASTLOTFLG, TRPALLET_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     T_RECEIVE_PLAN_B, T_TRRCV
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tReceivePlanB, tTrrcv
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrrcvdetailDto implements Serializable {

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
    /** RECEIVE_PLAN_B_ID: {PK, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B} */
    @JsonKey
    protected Long _receivePlanBId;

    /** RECEIVE_PLAN_H_ID: {NotNull, bigint(19), FK to T_TRRCV} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RCVLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** SUPPLIERRCVLINENO: {bigint(19)} */
    @JsonKey
    protected Long _supplierrcvlineno;

    /** XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _xdocflg;

    /** POKEY: {IX+, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pokey;

    /** POLINENO: {bigint(19)} */
    @JsonKey
    protected Long _polineno;

    /** POTYPE: {varchar(30)} */
    @JsonKey
    protected String _potype;

    /** OWNERPOLINENO: {bigint(19)} */
    @JsonKey
    protected Long _ownerpolineno;

    /** ORIGINALPONO: {varchar(60)} */
    @JsonKey
    protected String _originalpono;

    /** ORIGINALPOLINENO: {bigint(19)} */
    @JsonKey
    protected Long _originalpolineno;

    /** PODATE: {IX, varchar(8)} */
    @JsonKey
    protected String _podate;

    /** OWNERCD: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _ownercd;

    /** ITEMADMIN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemadmin;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

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

    /** EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _expectqty1;

    /** EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectqty2;

    /** EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectqty3;

    /** RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _receivedqty1;

    /** RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _receivedqty2;

    /** RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _receivedqty3;

    /** ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _adjustqty1;

    /** ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _adjustqty2;

    /** ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _adjustqty3;

    /** RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _rcvtagqty1;

    /** XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _xdocfreeqty1;

    /** INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _inspectedqty1;

    /** INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedqty2;

    /** INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedqty3;

    /** PRICE_BUY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceBuy;

    /** PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceWholesale;

    /** PRICE_SALE: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _priceSale;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** ICDATE: {varchar(8)} */
    @JsonKey
    protected String _icdate;

    /** ORDERKEY: {IX+, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _orderkey;

    /** ORDERLINENO: {bigint(19)} */
    @JsonKey
    protected Long _orderlineno;

    /** OWNERORDERNO: {varchar(60)} */
    @JsonKey
    protected String _ownerorderno;

    /** OWNERORDERLINENO: {bigint(19)} */
    @JsonKey
    protected Long _ownerorderlineno;

    /** CUSTORDERNO: {varchar(60)} */
    @JsonKey
    protected String _custorderno;

    /** CUSTORDERLINENO: {bigint(19)} */
    @JsonKey
    protected Long _custorderlineno;

    /** ORDERTYPE: {varchar(30)} */
    @JsonKey
    protected String _ordertype;

    /** RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _rcvqtyerrorflg;

    /** LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _logicflg1;

    /** LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _logicflg2;

    /** LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _logicflg3;

    /** MOVELINENO: {bigint(19)} */
    @JsonKey
    protected Long _movelineno;

    /** ASSYLINENO: {bigint(19)} */
    @JsonKey
    protected Long _assylineno;

    /** PRODUCELINENO: {bigint(19)} */
    @JsonKey
    protected Long _producelineno;

    /** CHECKLASTLOTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _checklastlotflg;

    /** TRPALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _trpalletId;

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
    public BsTTrrcvdetailDto() {
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
    protected TReceivePlanBDto _tReceivePlanB;

    public TReceivePlanBDto getTReceivePlanB() {
        return _tReceivePlanB;
    }

    public void setTReceivePlanB(TReceivePlanBDto tReceivePlanB) {
        this._tReceivePlanB = tReceivePlanB;
    }

    protected TTrrcvDto _tTrrcv;

    public TTrrcvDto getTTrrcv() {
        return _tTrrcv;
    }

    public void setTTrrcv(TTrrcvDto tTrrcv) {
        this._tTrrcv = tTrrcv;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrrcvdetailDto)) { return false; }
        final BsTTrrcvdetailDto otherEntity = (BsTTrrcvdetailDto)other;
        if (!helpComparingValue(getReceivePlanBId(), otherEntity.getReceivePlanBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRRCVDETAIL");
        result = xCH(result, getReceivePlanBId());
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
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getSupplierrcvlineno());
        sb.append(c).append(getXdocflg());
        sb.append(c).append(getPokey());
        sb.append(c).append(getPolineno());
        sb.append(c).append(getPotype());
        sb.append(c).append(getOwnerpolineno());
        sb.append(c).append(getOriginalpono());
        sb.append(c).append(getOriginalpolineno());
        sb.append(c).append(getPodate());
        sb.append(c).append(getOwnercd());
        sb.append(c).append(getItemadmin());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemcd());
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
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getExpectqty2());
        sb.append(c).append(getExpectqty3());
        sb.append(c).append(getReceivedqty1());
        sb.append(c).append(getReceivedqty2());
        sb.append(c).append(getReceivedqty3());
        sb.append(c).append(getAdjustqty1());
        sb.append(c).append(getAdjustqty2());
        sb.append(c).append(getAdjustqty3());
        sb.append(c).append(getRcvtagqty1());
        sb.append(c).append(getXdocfreeqty1());
        sb.append(c).append(getInspectedqty1());
        sb.append(c).append(getInspectedqty2());
        sb.append(c).append(getInspectedqty3());
        sb.append(c).append(getPriceBuy());
        sb.append(c).append(getPriceWholesale());
        sb.append(c).append(getPriceSale());
        sb.append(c).append(getNotes());
        sb.append(c).append(getIcdate());
        sb.append(c).append(getOrderkey());
        sb.append(c).append(getOrderlineno());
        sb.append(c).append(getOwnerorderno());
        sb.append(c).append(getOwnerorderlineno());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getCustorderlineno());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getRcvqtyerrorflg());
        sb.append(c).append(getLogicflg1());
        sb.append(c).append(getLogicflg2());
        sb.append(c).append(getLogicflg3());
        sb.append(c).append(getMovelineno());
        sb.append(c).append(getAssylineno());
        sb.append(c).append(getProducelineno());
        sb.append(c).append(getChecklastlotflg());
        sb.append(c).append(getTrpalletId());
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
     * [get] RECEIVE_PLAN_B_ID: {PK, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {PK, NotNull, bigint(19), FK to T_RECEIVE_PLAN_B} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {NotNull, bigint(19), FK to T_TRRCV} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {NotNull, bigint(19), FK to T_TRRCV} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
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
     * [get] SUPPLIERRCVLINENO: {bigint(19)} <br>
     * 明細番号
     * @return The value of the column 'SUPPLIERRCVLINENO'. (NullAllowed)
     */
    public Long getSupplierrcvlineno() {
        return _supplierrcvlineno;
    }

    /**
     * [set] SUPPLIERRCVLINENO: {bigint(19)} <br>
     * 明細番号
     * @param supplierrcvlineno The value of the column 'SUPPLIERRCVLINENO'. (NullAllowed)
     */
    public void setSupplierrcvlineno(Long supplierrcvlineno) {
        __modifiedProperties.add("supplierrcvlineno");
        this._supplierrcvlineno = supplierrcvlineno;
    }

    /**
     * [get] XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック対象フラグ
     * @return The value of the column 'XDOCFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getXdocflg() {
        return _xdocflg;
    }

    /**
     * [set] XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック対象フラグ
     * @param xdocflg The value of the column 'XDOCFLG'. (NullAllowed)
     */
    public void setXdocflg(java.math.BigDecimal xdocflg) {
        __modifiedProperties.add("xdocflg");
        this._xdocflg = xdocflg;
    }

    /**
     * [get] POKEY: {IX+, decimal(16, 6)} <br>
     * ＰＯＫｅｙ
     * @return The value of the column 'POKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPokey() {
        return _pokey;
    }

    /**
     * [set] POKEY: {IX+, decimal(16, 6)} <br>
     * ＰＯＫｅｙ
     * @param pokey The value of the column 'POKEY'. (NullAllowed)
     */
    public void setPokey(java.math.BigDecimal pokey) {
        __modifiedProperties.add("pokey");
        this._pokey = pokey;
    }

    /**
     * [get] POLINENO: {bigint(19)} <br>
     * ＰＯ行№
     * @return The value of the column 'POLINENO'. (NullAllowed)
     */
    public Long getPolineno() {
        return _polineno;
    }

    /**
     * [set] POLINENO: {bigint(19)} <br>
     * ＰＯ行№
     * @param polineno The value of the column 'POLINENO'. (NullAllowed)
     */
    public void setPolineno(Long polineno) {
        __modifiedProperties.add("polineno");
        this._polineno = polineno;
    }

    /**
     * [get] POTYPE: {varchar(30)} <br>
     * 調達タイプ
     * @return The value of the column 'POTYPE'. (NullAllowed)
     */
    public String getPotype() {
        return _potype;
    }

    /**
     * [set] POTYPE: {varchar(30)} <br>
     * 調達タイプ
     * @param potype The value of the column 'POTYPE'. (NullAllowed)
     */
    public void setPotype(String potype) {
        __modifiedProperties.add("potype");
        this._potype = potype;
    }

    /**
     * [get] OWNERPOLINENO: {bigint(19)} <br>
     * 発注元ＰＯ行№
     * @return The value of the column 'OWNERPOLINENO'. (NullAllowed)
     */
    public Long getOwnerpolineno() {
        return _ownerpolineno;
    }

    /**
     * [set] OWNERPOLINENO: {bigint(19)} <br>
     * 発注元ＰＯ行№
     * @param ownerpolineno The value of the column 'OWNERPOLINENO'. (NullAllowed)
     */
    public void setOwnerpolineno(Long ownerpolineno) {
        __modifiedProperties.add("ownerpolineno");
        this._ownerpolineno = ownerpolineno;
    }

    /**
     * [get] ORIGINALPONO: {varchar(60)} <br>
     * パレット番号（０８需給）
     * @return The value of the column 'ORIGINALPONO'. (NullAllowed)
     */
    public String getOriginalpono() {
        return _originalpono;
    }

    /**
     * [set] ORIGINALPONO: {varchar(60)} <br>
     * パレット番号（０８需給）
     * @param originalpono The value of the column 'ORIGINALPONO'. (NullAllowed)
     */
    public void setOriginalpono(String originalpono) {
        __modifiedProperties.add("originalpono");
        this._originalpono = originalpono;
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
     * [get] PODATE: {IX, varchar(8)} <br>
     * 通関日
     * @return The value of the column 'PODATE'. (NullAllowed)
     */
    public String getPodate() {
        return _podate;
    }

    /**
     * [set] PODATE: {IX, varchar(8)} <br>
     * 通関日
     * @param podate The value of the column 'PODATE'. (NullAllowed)
     */
    public void setPodate(String podate) {
        __modifiedProperties.add("podate");
        this._podate = podate;
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
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
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
     * [get] EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫予定数量１（バラ）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫予定数量１（バラ）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量２
     * @return The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public Long getExpectqty2() {
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量２
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public void setExpectqty2(Long expectqty2) {
        __modifiedProperties.add("expectqty2");
        this._expectqty2 = expectqty2;
    }

    /**
     * [get] EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量３
     * @return The value of the column 'EXPECTQTY3'. (NullAllowed)
     */
    public Long getExpectqty3() {
        return _expectqty3;
    }

    /**
     * [set] EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫予定数量３
     * @param expectqty3 The value of the column 'EXPECTQTY3'. (NullAllowed)
     */
    public void setExpectqty3(Long expectqty3) {
        __modifiedProperties.add("expectqty3");
        this._expectqty3 = expectqty3;
    }

    /**
     * [get] RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫実績数量１（バラ）
     * @return The value of the column 'RECEIVEDQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getReceivedqty1() {
        return _receivedqty1;
    }

    /**
     * [set] RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫実績数量１（バラ）
     * @param receivedqty1 The value of the column 'RECEIVEDQTY1'. (NullAllowed)
     */
    public void setReceivedqty1(java.math.BigDecimal receivedqty1) {
        __modifiedProperties.add("receivedqty1");
        this._receivedqty1 = receivedqty1;
    }

    /**
     * [get] RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数量２
     * @return The value of the column 'RECEIVEDQTY2'. (NullAllowed)
     */
    public Long getReceivedqty2() {
        return _receivedqty2;
    }

    /**
     * [set] RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数量２
     * @param receivedqty2 The value of the column 'RECEIVEDQTY2'. (NullAllowed)
     */
    public void setReceivedqty2(Long receivedqty2) {
        __modifiedProperties.add("receivedqty2");
        this._receivedqty2 = receivedqty2;
    }

    /**
     * [get] RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数量３
     * @return The value of the column 'RECEIVEDQTY3'. (NullAllowed)
     */
    public Long getReceivedqty3() {
        return _receivedqty3;
    }

    /**
     * [set] RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫実績数量３
     * @param receivedqty3 The value of the column 'RECEIVEDQTY3'. (NullAllowed)
     */
    public void setReceivedqty3(Long receivedqty3) {
        __modifiedProperties.add("receivedqty3");
        this._receivedqty3 = receivedqty3;
    }

    /**
     * [get] ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫取消数量１（バラ）
     * @return The value of the column 'ADJUSTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getAdjustqty1() {
        return _adjustqty1;
    }

    /**
     * [set] ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫取消数量１（バラ）
     * @param adjustqty1 The value of the column 'ADJUSTQTY1'. (NullAllowed)
     */
    public void setAdjustqty1(java.math.BigDecimal adjustqty1) {
        __modifiedProperties.add("adjustqty1");
        this._adjustqty1 = adjustqty1;
    }

    /**
     * [get] ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量２
     * @return The value of the column 'ADJUSTQTY2'. (NullAllowed)
     */
    public Long getAdjustqty2() {
        return _adjustqty2;
    }

    /**
     * [set] ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量２
     * @param adjustqty2 The value of the column 'ADJUSTQTY2'. (NullAllowed)
     */
    public void setAdjustqty2(Long adjustqty2) {
        __modifiedProperties.add("adjustqty2");
        this._adjustqty2 = adjustqty2;
    }

    /**
     * [get] ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量３
     * @return The value of the column 'ADJUSTQTY3'. (NullAllowed)
     */
    public Long getAdjustqty3() {
        return _adjustqty3;
    }

    /**
     * [set] ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫取消数量３
     * @param adjustqty3 The value of the column 'ADJUSTQTY3'. (NullAllowed)
     */
    public void setAdjustqty3(Long adjustqty3) {
        __modifiedProperties.add("adjustqty3");
        this._adjustqty3 = adjustqty3;
    }

    /**
     * [get] RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付指示済数量１（バラ）
     * @return The value of the column 'RCVTAGQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvtagqty1() {
        return _rcvtagqty1;
    }

    /**
     * [set] RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫積付指示済数量１（バラ）
     * @param rcvtagqty1 The value of the column 'RCVTAGQTY1'. (NullAllowed)
     */
    public void setRcvtagqty1(java.math.BigDecimal rcvtagqty1) {
        __modifiedProperties.add("rcvtagqty1");
        this._rcvtagqty1 = rcvtagqty1;
    }

    /**
     * [get] XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック可能数量１（バラ）
     * @return The value of the column 'XDOCFREEQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getXdocfreeqty1() {
        return _xdocfreeqty1;
    }

    /**
     * [set] XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * クロスドック可能数量１（バラ）
     * @param xdocfreeqty1 The value of the column 'XDOCFREEQTY1'. (NullAllowed)
     */
    public void setXdocfreeqty1(java.math.BigDecimal xdocfreeqty1) {
        __modifiedProperties.add("xdocfreeqty1");
        this._xdocfreeqty1 = xdocfreeqty1;
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
     * [get] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（仕入値）
     * @return The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public Long getPriceBuy() {
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（仕入値）
     * @param priceBuy The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public void setPriceBuy(Long priceBuy) {
        __modifiedProperties.add("priceBuy");
        this._priceBuy = priceBuy;
    }

    /**
     * [get] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（卸値）
     * @return The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public Long getPriceWholesale() {
        return _priceWholesale;
    }

    /**
     * [set] PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（卸値）
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public void setPriceWholesale(Long priceWholesale) {
        __modifiedProperties.add("priceWholesale");
        this._priceWholesale = priceWholesale;
    }

    /**
     * [get] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（売値）
     * @return The value of the column 'PRICE_SALE'. (NullAllowed)
     */
    public Long getPriceSale() {
        return _priceSale;
    }

    /**
     * [set] PRICE_SALE: {NotNull, bigint(19), default=[(0)]} <br>
     * 銘柄単価（売値）
     * @param priceSale The value of the column 'PRICE_SALE'. (NullAllowed)
     */
    public void setPriceSale(Long priceSale) {
        __modifiedProperties.add("priceSale");
        this._priceSale = priceSale;
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
     * [get] ICDATE: {varchar(8)} <br>
     * 保管料起算日
     * @return The value of the column 'ICDATE'. (NullAllowed)
     */
    public String getIcdate() {
        return _icdate;
    }

    /**
     * [set] ICDATE: {varchar(8)} <br>
     * 保管料起算日
     * @param icdate The value of the column 'ICDATE'. (NullAllowed)
     */
    public void setIcdate(String icdate) {
        __modifiedProperties.add("icdate");
        this._icdate = icdate;
    }

    /**
     * [get] ORDERKEY: {IX+, decimal(16, 6)} <br>
     * 受注オーダＫｅｙ
     * @return The value of the column 'ORDERKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getOrderkey() {
        return _orderkey;
    }

    /**
     * [set] ORDERKEY: {IX+, decimal(16, 6)} <br>
     * 受注オーダＫｅｙ
     * @param orderkey The value of the column 'ORDERKEY'. (NullAllowed)
     */
    public void setOrderkey(java.math.BigDecimal orderkey) {
        __modifiedProperties.add("orderkey");
        this._orderkey = orderkey;
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
     * [get] OWNERORDERNO: {varchar(60)} <br>
     * 荷主オーダ番号
     * @return The value of the column 'OWNERORDERNO'. (NullAllowed)
     */
    public String getOwnerorderno() {
        return _ownerorderno;
    }

    /**
     * [set] OWNERORDERNO: {varchar(60)} <br>
     * 荷主オーダ番号
     * @param ownerorderno The value of the column 'OWNERORDERNO'. (NullAllowed)
     */
    public void setOwnerorderno(String ownerorderno) {
        __modifiedProperties.add("ownerorderno");
        this._ownerorderno = ownerorderno;
    }

    /**
     * [get] OWNERORDERLINENO: {bigint(19)} <br>
     * シンボル送信フラグ
     * @return The value of the column 'OWNERORDERLINENO'. (NullAllowed)
     */
    public Long getOwnerorderlineno() {
        return _ownerorderlineno;
    }

    /**
     * [set] OWNERORDERLINENO: {bigint(19)} <br>
     * シンボル送信フラグ
     * @param ownerorderlineno The value of the column 'OWNERORDERLINENO'. (NullAllowed)
     */
    public void setOwnerorderlineno(Long ownerorderlineno) {
        __modifiedProperties.add("ownerorderlineno");
        this._ownerorderlineno = ownerorderlineno;
    }

    /**
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * 流通識別
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public String getCustorderno() {
        return _custorderno;
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * 流通識別
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public void setCustorderno(String custorderno) {
        __modifiedProperties.add("custorderno");
        this._custorderno = custorderno;
    }

    /**
     * [get] CUSTORDERLINENO: {bigint(19)} <br>
     * ロットエンドフラグ
     * @return The value of the column 'CUSTORDERLINENO'. (NullAllowed)
     */
    public Long getCustorderlineno() {
        return _custorderlineno;
    }

    /**
     * [set] CUSTORDERLINENO: {bigint(19)} <br>
     * ロットエンドフラグ
     * @param custorderlineno The value of the column 'CUSTORDERLINENO'. (NullAllowed)
     */
    public void setCustorderlineno(Long custorderlineno) {
        __modifiedProperties.add("custorderlineno");
        this._custorderlineno = custorderlineno;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * 受注タイプ
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * 受注タイプ
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫数量異常フラグ
     * @return The value of the column 'RCVQTYERRORFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvqtyerrorflg() {
        return _rcvqtyerrorflg;
    }

    /**
     * [set] RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 入庫数量異常フラグ
     * @param rcvqtyerrorflg The value of the column 'RCVQTYERRORFLG'. (NullAllowed)
     */
    public void setRcvqtyerrorflg(java.math.BigDecimal rcvqtyerrorflg) {
        __modifiedProperties.add("rcvqtyerrorflg");
        this._rcvqtyerrorflg = rcvqtyerrorflg;
    }

    /**
     * [get] LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @return The value of the column 'LOGICFLG1'. (NullAllowed)
     */
    public java.math.BigDecimal getLogicflg1() {
        return _logicflg1;
    }

    /**
     * [set] LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ１
     * @param logicflg1 The value of the column 'LOGICFLG1'. (NullAllowed)
     */
    public void setLogicflg1(java.math.BigDecimal logicflg1) {
        __modifiedProperties.add("logicflg1");
        this._logicflg1 = logicflg1;
    }

    /**
     * [get] LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @return The value of the column 'LOGICFLG2'. (NullAllowed)
     */
    public java.math.BigDecimal getLogicflg2() {
        return _logicflg2;
    }

    /**
     * [set] LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ２
     * @param logicflg2 The value of the column 'LOGICFLG2'. (NullAllowed)
     */
    public void setLogicflg2(java.math.BigDecimal logicflg2) {
        __modifiedProperties.add("logicflg2");
        this._logicflg2 = logicflg2;
    }

    /**
     * [get] LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @return The value of the column 'LOGICFLG3'. (NullAllowed)
     */
    public java.math.BigDecimal getLogicflg3() {
        return _logicflg3;
    }

    /**
     * [set] LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 理論在庫フラグ３
     * @param logicflg3 The value of the column 'LOGICFLG3'. (NullAllowed)
     */
    public void setLogicflg3(java.math.BigDecimal logicflg3) {
        __modifiedProperties.add("logicflg3");
        this._logicflg3 = logicflg3;
    }

    /**
     * [get] MOVELINENO: {bigint(19)} <br>
     * 移動予定行№
     * @return The value of the column 'MOVELINENO'. (NullAllowed)
     */
    public Long getMovelineno() {
        return _movelineno;
    }

    /**
     * [set] MOVELINENO: {bigint(19)} <br>
     * 移動予定行№
     * @param movelineno The value of the column 'MOVELINENO'. (NullAllowed)
     */
    public void setMovelineno(Long movelineno) {
        __modifiedProperties.add("movelineno");
        this._movelineno = movelineno;
    }

    /**
     * [get] ASSYLINENO: {bigint(19)} <br>
     * 加工指示行№
     * @return The value of the column 'ASSYLINENO'. (NullAllowed)
     */
    public Long getAssylineno() {
        return _assylineno;
    }

    /**
     * [set] ASSYLINENO: {bigint(19)} <br>
     * 加工指示行№
     * @param assylineno The value of the column 'ASSYLINENO'. (NullAllowed)
     */
    public void setAssylineno(Long assylineno) {
        __modifiedProperties.add("assylineno");
        this._assylineno = assylineno;
    }

    /**
     * [get] PRODUCELINENO: {bigint(19)} <br>
     * 加工結果行№
     * @return The value of the column 'PRODUCELINENO'. (NullAllowed)
     */
    public Long getProducelineno() {
        return _producelineno;
    }

    /**
     * [set] PRODUCELINENO: {bigint(19)} <br>
     * 加工結果行№
     * @param producelineno The value of the column 'PRODUCELINENO'. (NullAllowed)
     */
    public void setProducelineno(Long producelineno) {
        __modifiedProperties.add("producelineno");
        this._producelineno = producelineno;
    }

    /**
     * [get] CHECKLASTLOTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * ロット後退チェックフラグ
     * @return The value of the column 'CHECKLASTLOTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getChecklastlotflg() {
        return _checklastlotflg;
    }

    /**
     * [set] CHECKLASTLOTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]} <br>
     * ロット後退チェックフラグ
     * @param checklastlotflg The value of the column 'CHECKLASTLOTFLG'. (NullAllowed)
     */
    public void setChecklastlotflg(java.math.BigDecimal checklastlotflg) {
        __modifiedProperties.add("checklastlotflg");
        this._checklastlotflg = checklastlotflg;
    }

    /**
     * [get] TRPALLET_ID: {bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public Long getTrpalletId() {
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public void setTrpalletId(Long trpalletId) {
        __modifiedProperties.add("trpalletId");
        this._trpalletId = trpalletId;
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
