package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_MFWHxITEM as TABLE. <br>
 * 拠点別銘柄制御マスタ
 * <pre>
 * [primary-key]
 *     MFWH_ITEM_ID
 *
 * [column]
 *     MFWH_ITEM_ID, CLIENT_ID, CENTER_ID, PRODUCT_CD, SLOTLOCNAME, PICKLOCNAME, PHYSICALTYPE, PHYSICALCYCLE, PHYSICALGROUP, PHYSICALDATE, REORDERTYPE, REORDERINTERVAL, REORDERPOINT, REORDERQTY, REORDERLEADTIME, REORDERLASTDAY, SUPPLIERCD, REPLENISHPOINT, MAXQTY, CAUSELOC, SHIPPINGTYPE, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, PROCESSWORKINGKEY, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, SERIALFLG, FULLPALLETFLG, PLSLOTLOCNAME, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFWH_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_PRODUCT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient, mProduct
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMMfwhxitemDto implements Serializable {

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
    /** MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _mfwhItemId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** SLOTLOCNAME: {varchar(255)} */
    @JsonKey
    protected String _slotlocname;

    /** PICKLOCNAME: {varchar(255)} */
    @JsonKey
    protected String _picklocname;

    /** PHYSICALTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _physicaltype;

    /** PHYSICALCYCLE: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _physicalcycle;

    /** PHYSICALGROUP: {varchar(60)} */
    @JsonKey
    protected String _physicalgroup;

    /** PHYSICALDATE: {varchar(8)} */
    @JsonKey
    protected String _physicaldate;

    /** REORDERTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _reordertype;

    /** REORDERINTERVAL: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _reorderinterval;

    /** REORDERPOINT: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _reorderpoint;

    /** REORDERQTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _reorderqty;

    /** REORDERLEADTIME: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _reorderleadtime;

    /** REORDERLASTDAY: {varchar(8)} */
    @JsonKey
    protected String _reorderlastday;

    /** SUPPLIERCD: {varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** REPLENISHPOINT: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _replenishpoint;

    /** MAXQTY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _maxqty;

    /** CAUSELOC: {varchar(255)} */
    @JsonKey
    protected String _causeloc;

    /** SHIPPINGTYPE: {varchar(30)} */
    @JsonKey
    protected String _shippingtype;

    /** SLOTPOLICYKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _slotpolicykey;

    /** INWORKINGKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _inworkingkey;

    /** OUTWORKINGKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _outworkingkey;

    /** PROCESSWORKINGKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _processworkingkey;

    /** USERUSE1: {varchar(60)} */
    @JsonKey
    protected String _useruse1;

    /** USERUSE2: {varchar(60)} */
    @JsonKey
    protected String _useruse2;

    /** USERUSE3: {varchar(60)} */
    @JsonKey
    protected String _useruse3;

    /** USERUSE4: {varchar(60)} */
    @JsonKey
    protected String _useruse4;

    /** USERUSE5: {varchar(60)} */
    @JsonKey
    protected String _useruse5;

    /** SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _serialflg;

    /** FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _fullpalletflg;

    /** PLSLOTLOCNAME: {varchar(255)} */
    @JsonKey
    protected String _plslotlocname;

    /** PRODUCT_ID: {bigint(19), FK to M_PRODUCT} */
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
    public BsMMfwhxitemDto() {
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

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMMfwhxitemDto)) { return false; }
        final BsMMfwhxitemDto otherEntity = (BsMMfwhxitemDto)other;
        if (!helpComparingValue(getMfwhItemId(), otherEntity.getMfwhItemId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_MFWHxITEM");
        result = xCH(result, getMfwhItemId());
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
        sb.append(c).append(getMfwhItemId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getSlotlocname());
        sb.append(c).append(getPicklocname());
        sb.append(c).append(getPhysicaltype());
        sb.append(c).append(getPhysicalcycle());
        sb.append(c).append(getPhysicalgroup());
        sb.append(c).append(getPhysicaldate());
        sb.append(c).append(getReordertype());
        sb.append(c).append(getReorderinterval());
        sb.append(c).append(getReorderpoint());
        sb.append(c).append(getReorderqty());
        sb.append(c).append(getReorderleadtime());
        sb.append(c).append(getReorderlastday());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getReplenishpoint());
        sb.append(c).append(getMaxqty());
        sb.append(c).append(getCauseloc());
        sb.append(c).append(getShippingtype());
        sb.append(c).append(getSlotpolicykey());
        sb.append(c).append(getInworkingkey());
        sb.append(c).append(getOutworkingkey());
        sb.append(c).append(getProcessworkingkey());
        sb.append(c).append(getUseruse1());
        sb.append(c).append(getUseruse2());
        sb.append(c).append(getUseruse3());
        sb.append(c).append(getUseruse4());
        sb.append(c).append(getUseruse5());
        sb.append(c).append(getSerialflg());
        sb.append(c).append(getFullpalletflg());
        sb.append(c).append(getPlslotlocname());
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
     * [get] MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別銘柄制御ID
     * @return The value of the column 'MFWH_ITEM_ID'. (NullAllowed)
     */
    public Long getMfwhItemId() {
        return _mfwhItemId;
    }

    /**
     * [set] MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別銘柄制御ID
     * @param mfwhItemId The value of the column 'MFWH_ITEM_ID'. (NullAllowed)
     */
    public void setMfwhItemId(Long mfwhItemId) {
        __modifiedProperties.add("mfwhItemId");
        this._mfwhItemId = mfwhItemId;
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
     * [get] SLOTLOCNAME: {varchar(255)} <br>
     * 保管ロケ名称
     * @return The value of the column 'SLOTLOCNAME'. (NullAllowed)
     */
    public String getSlotlocname() {
        return _slotlocname;
    }

    /**
     * [set] SLOTLOCNAME: {varchar(255)} <br>
     * 保管ロケ名称
     * @param slotlocname The value of the column 'SLOTLOCNAME'. (NullAllowed)
     */
    public void setSlotlocname(String slotlocname) {
        __modifiedProperties.add("slotlocname");
        this._slotlocname = slotlocname;
    }

    /**
     * [get] PICKLOCNAME: {varchar(255)} <br>
     * ピッキングロケ名称
     * @return The value of the column 'PICKLOCNAME'. (NullAllowed)
     */
    public String getPicklocname() {
        return _picklocname;
    }

    /**
     * [set] PICKLOCNAME: {varchar(255)} <br>
     * ピッキングロケ名称
     * @param picklocname The value of the column 'PICKLOCNAME'. (NullAllowed)
     */
    public void setPicklocname(String picklocname) {
        __modifiedProperties.add("picklocname");
        this._picklocname = picklocname;
    }

    /**
     * [get] PHYSICALTYPE: {NotNull, varchar(30)} <br>
     * 棚卸手段タイプ
     * @return The value of the column 'PHYSICALTYPE'. (NullAllowed)
     */
    public String getPhysicaltype() {
        return _physicaltype;
    }

    /**
     * [set] PHYSICALTYPE: {NotNull, varchar(30)} <br>
     * 棚卸手段タイプ
     * @param physicaltype The value of the column 'PHYSICALTYPE'. (NullAllowed)
     */
    public void setPhysicaltype(String physicaltype) {
        __modifiedProperties.add("physicaltype");
        this._physicaltype = physicaltype;
    }

    /**
     * [get] PHYSICALCYCLE: {decimal(16, 6), default=[(0)]} <br>
     * 循環棚卸日数
     * @return The value of the column 'PHYSICALCYCLE'. (NullAllowed)
     */
    public java.math.BigDecimal getPhysicalcycle() {
        return _physicalcycle;
    }

    /**
     * [set] PHYSICALCYCLE: {decimal(16, 6), default=[(0)]} <br>
     * 循環棚卸日数
     * @param physicalcycle The value of the column 'PHYSICALCYCLE'. (NullAllowed)
     */
    public void setPhysicalcycle(java.math.BigDecimal physicalcycle) {
        __modifiedProperties.add("physicalcycle");
        this._physicalcycle = physicalcycle;
    }

    /**
     * [get] PHYSICALGROUP: {varchar(60)} <br>
     * 循環棚卸グループ
     * @return The value of the column 'PHYSICALGROUP'. (NullAllowed)
     */
    public String getPhysicalgroup() {
        return _physicalgroup;
    }

    /**
     * [set] PHYSICALGROUP: {varchar(60)} <br>
     * 循環棚卸グループ
     * @param physicalgroup The value of the column 'PHYSICALGROUP'. (NullAllowed)
     */
    public void setPhysicalgroup(String physicalgroup) {
        __modifiedProperties.add("physicalgroup");
        this._physicalgroup = physicalgroup;
    }

    /**
     * [get] PHYSICALDATE: {varchar(8)} <br>
     * 前回棚卸日
     * @return The value of the column 'PHYSICALDATE'. (NullAllowed)
     */
    public String getPhysicaldate() {
        return _physicaldate;
    }

    /**
     * [set] PHYSICALDATE: {varchar(8)} <br>
     * 前回棚卸日
     * @param physicaldate The value of the column 'PHYSICALDATE'. (NullAllowed)
     */
    public void setPhysicaldate(String physicaldate) {
        __modifiedProperties.add("physicaldate");
        this._physicaldate = physicaldate;
    }

    /**
     * [get] REORDERTYPE: {NotNull, varchar(30)} <br>
     * 自動発注タイプ
     * @return The value of the column 'REORDERTYPE'. (NullAllowed)
     */
    public String getReordertype() {
        return _reordertype;
    }

    /**
     * [set] REORDERTYPE: {NotNull, varchar(30)} <br>
     * 自動発注タイプ
     * @param reordertype The value of the column 'REORDERTYPE'. (NullAllowed)
     */
    public void setReordertype(String reordertype) {
        __modifiedProperties.add("reordertype");
        this._reordertype = reordertype;
    }

    /**
     * [get] REORDERINTERVAL: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注間隔
     * @return The value of the column 'REORDERINTERVAL'. (NullAllowed)
     */
    public java.math.BigDecimal getReorderinterval() {
        return _reorderinterval;
    }

    /**
     * [set] REORDERINTERVAL: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注間隔
     * @param reorderinterval The value of the column 'REORDERINTERVAL'. (NullAllowed)
     */
    public void setReorderinterval(java.math.BigDecimal reorderinterval) {
        __modifiedProperties.add("reorderinterval");
        this._reorderinterval = reorderinterval;
    }

    /**
     * [get] REORDERPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注点
     * @return The value of the column 'REORDERPOINT'. (NullAllowed)
     */
    public java.math.BigDecimal getReorderpoint() {
        return _reorderpoint;
    }

    /**
     * [set] REORDERPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注点
     * @param reorderpoint The value of the column 'REORDERPOINT'. (NullAllowed)
     */
    public void setReorderpoint(java.math.BigDecimal reorderpoint) {
        __modifiedProperties.add("reorderpoint");
        this._reorderpoint = reorderpoint;
    }

    /**
     * [get] REORDERQTY: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注数量
     * @return The value of the column 'REORDERQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getReorderqty() {
        return _reorderqty;
    }

    /**
     * [set] REORDERQTY: {decimal(16, 6), default=[(0)]} <br>
     * 自動発注数量
     * @param reorderqty The value of the column 'REORDERQTY'. (NullAllowed)
     */
    public void setReorderqty(java.math.BigDecimal reorderqty) {
        __modifiedProperties.add("reorderqty");
        this._reorderqty = reorderqty;
    }

    /**
     * [get] REORDERLEADTIME: {decimal(16, 6), default=[(0)]} <br>
     * 調達リードタイム
     * @return The value of the column 'REORDERLEADTIME'. (NullAllowed)
     */
    public java.math.BigDecimal getReorderleadtime() {
        return _reorderleadtime;
    }

    /**
     * [set] REORDERLEADTIME: {decimal(16, 6), default=[(0)]} <br>
     * 調達リードタイム
     * @param reorderleadtime The value of the column 'REORDERLEADTIME'. (NullAllowed)
     */
    public void setReorderleadtime(java.math.BigDecimal reorderleadtime) {
        __modifiedProperties.add("reorderleadtime");
        this._reorderleadtime = reorderleadtime;
    }

    /**
     * [get] REORDERLASTDAY: {varchar(8)} <br>
     * 前回発注日
     * @return The value of the column 'REORDERLASTDAY'. (NullAllowed)
     */
    public String getReorderlastday() {
        return _reorderlastday;
    }

    /**
     * [set] REORDERLASTDAY: {varchar(8)} <br>
     * 前回発注日
     * @param reorderlastday The value of the column 'REORDERLASTDAY'. (NullAllowed)
     */
    public void setReorderlastday(String reorderlastday) {
        __modifiedProperties.add("reorderlastday");
        this._reorderlastday = reorderlastday;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] REPLENISHPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動補充点
     * @return The value of the column 'REPLENISHPOINT'. (NullAllowed)
     */
    public java.math.BigDecimal getReplenishpoint() {
        return _replenishpoint;
    }

    /**
     * [set] REPLENISHPOINT: {decimal(16, 6), default=[(0)]} <br>
     * 自動補充点
     * @param replenishpoint The value of the column 'REPLENISHPOINT'. (NullAllowed)
     */
    public void setReplenishpoint(java.math.BigDecimal replenishpoint) {
        __modifiedProperties.add("replenishpoint");
        this._replenishpoint = replenishpoint;
    }

    /**
     * [get] MAXQTY: {decimal(16, 6), default=[(0)]} <br>
     * 最大保管数量
     * @return The value of the column 'MAXQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getMaxqty() {
        return _maxqty;
    }

    /**
     * [set] MAXQTY: {decimal(16, 6), default=[(0)]} <br>
     * 最大保管数量
     * @param maxqty The value of the column 'MAXQTY'. (NullAllowed)
     */
    public void setMaxqty(java.math.BigDecimal maxqty) {
        __modifiedProperties.add("maxqty");
        this._maxqty = maxqty;
    }

    /**
     * [get] CAUSELOC: {varchar(255)} <br>
     * 補充元ロケ名称
     * @return The value of the column 'CAUSELOC'. (NullAllowed)
     */
    public String getCauseloc() {
        return _causeloc;
    }

    /**
     * [set] CAUSELOC: {varchar(255)} <br>
     * 補充元ロケ名称
     * @param causeloc The value of the column 'CAUSELOC'. (NullAllowed)
     */
    public void setCauseloc(String causeloc) {
        __modifiedProperties.add("causeloc");
        this._causeloc = causeloc;
    }

    /**
     * [get] SHIPPINGTYPE: {varchar(30)} <br>
     * 発送方法タイプ
     * @return The value of the column 'SHIPPINGTYPE'. (NullAllowed)
     */
    public String getShippingtype() {
        return _shippingtype;
    }

    /**
     * [set] SHIPPINGTYPE: {varchar(30)} <br>
     * 発送方法タイプ
     * @param shippingtype The value of the column 'SHIPPINGTYPE'. (NullAllowed)
     */
    public void setShippingtype(String shippingtype) {
        __modifiedProperties.add("shippingtype");
        this._shippingtype = shippingtype;
    }

    /**
     * [get] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 格納ルールキー
     * @return The value of the column 'SLOTPOLICYKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSlotpolicykey() {
        return _slotpolicykey;
    }

    /**
     * [set] SLOTPOLICYKEY: {decimal(16, 6)} <br>
     * 格納ルールキー
     * @param slotpolicykey The value of the column 'SLOTPOLICYKEY'. (NullAllowed)
     */
    public void setSlotpolicykey(java.math.BigDecimal slotpolicykey) {
        __modifiedProperties.add("slotpolicykey");
        this._slotpolicykey = slotpolicykey;
    }

    /**
     * [get] INWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @return The value of the column 'INWORKINGKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getInworkingkey() {
        return _inworkingkey;
    }

    /**
     * [set] INWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @param inworkingkey The value of the column 'INWORKINGKEY'. (NullAllowed)
     */
    public void setInworkingkey(java.math.BigDecimal inworkingkey) {
        __modifiedProperties.add("inworkingkey");
        this._inworkingkey = inworkingkey;
    }

    /**
     * [get] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @return The value of the column 'OUTWORKINGKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getOutworkingkey() {
        return _outworkingkey;
    }

    /**
     * [set] OUTWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @param outworkingkey The value of the column 'OUTWORKINGKEY'. (NullAllowed)
     */
    public void setOutworkingkey(java.math.BigDecimal outworkingkey) {
        __modifiedProperties.add("outworkingkey");
        this._outworkingkey = outworkingkey;
    }

    /**
     * [get] PROCESSWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @return The value of the column 'PROCESSWORKINGKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getProcessworkingkey() {
        return _processworkingkey;
    }

    /**
     * [set] PROCESSWORKINGKEY: {decimal(16, 6)} <br>
     * 作業工程キー
     * @param processworkingkey The value of the column 'PROCESSWORKINGKEY'. (NullAllowed)
     */
    public void setProcessworkingkey(java.math.BigDecimal processworkingkey) {
        __modifiedProperties.add("processworkingkey");
        this._processworkingkey = processworkingkey;
    }

    /**
     * [get] USERUSE1: {varchar(60)} <br>
     * ユーザ設定項目１
     * @return The value of the column 'USERUSE1'. (NullAllowed)
     */
    public String getUseruse1() {
        return _useruse1;
    }

    /**
     * [set] USERUSE1: {varchar(60)} <br>
     * ユーザ設定項目１
     * @param useruse1 The value of the column 'USERUSE1'. (NullAllowed)
     */
    public void setUseruse1(String useruse1) {
        __modifiedProperties.add("useruse1");
        this._useruse1 = useruse1;
    }

    /**
     * [get] USERUSE2: {varchar(60)} <br>
     * ユーザ設定項目２
     * @return The value of the column 'USERUSE2'. (NullAllowed)
     */
    public String getUseruse2() {
        return _useruse2;
    }

    /**
     * [set] USERUSE2: {varchar(60)} <br>
     * ユーザ設定項目２
     * @param useruse2 The value of the column 'USERUSE2'. (NullAllowed)
     */
    public void setUseruse2(String useruse2) {
        __modifiedProperties.add("useruse2");
        this._useruse2 = useruse2;
    }

    /**
     * [get] USERUSE3: {varchar(60)} <br>
     * ユーザ設定項目３
     * @return The value of the column 'USERUSE3'. (NullAllowed)
     */
    public String getUseruse3() {
        return _useruse3;
    }

    /**
     * [set] USERUSE3: {varchar(60)} <br>
     * ユーザ設定項目３
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed)
     */
    public void setUseruse3(String useruse3) {
        __modifiedProperties.add("useruse3");
        this._useruse3 = useruse3;
    }

    /**
     * [get] USERUSE4: {varchar(60)} <br>
     * ユーザ設定項目４
     * @return The value of the column 'USERUSE4'. (NullAllowed)
     */
    public String getUseruse4() {
        return _useruse4;
    }

    /**
     * [set] USERUSE4: {varchar(60)} <br>
     * ユーザ設定項目４
     * @param useruse4 The value of the column 'USERUSE4'. (NullAllowed)
     */
    public void setUseruse4(String useruse4) {
        __modifiedProperties.add("useruse4");
        this._useruse4 = useruse4;
    }

    /**
     * [get] USERUSE5: {varchar(60)} <br>
     * ユーザ設定項目５
     * @return The value of the column 'USERUSE5'. (NullAllowed)
     */
    public String getUseruse5() {
        return _useruse5;
    }

    /**
     * [set] USERUSE5: {varchar(60)} <br>
     * ユーザ設定項目５
     * @param useruse5 The value of the column 'USERUSE5'. (NullAllowed)
     */
    public void setUseruse5(String useruse5) {
        __modifiedProperties.add("useruse5");
        this._useruse5 = useruse5;
    }

    /**
     * [get] SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * シリアル管理フラグ
     * @return The value of the column 'SERIALFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getSerialflg() {
        return _serialflg;
    }

    /**
     * [set] SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * シリアル管理フラグ
     * @param serialflg The value of the column 'SERIALFLG'. (NullAllowed)
     */
    public void setSerialflg(java.math.BigDecimal serialflg) {
        __modifiedProperties.add("serialflg");
        this._serialflg = serialflg;
    }

    /**
     * [get] FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * フルパレット管理フラグ
     * @return The value of the column 'FULLPALLETFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getFullpalletflg() {
        return _fullpalletflg;
    }

    /**
     * [set] FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * フルパレット管理フラグ
     * @param fullpalletflg The value of the column 'FULLPALLETFLG'. (NullAllowed)
     */
    public void setFullpalletflg(java.math.BigDecimal fullpalletflg) {
        __modifiedProperties.add("fullpalletflg");
        this._fullpalletflg = fullpalletflg;
    }

    /**
     * [get] PLSLOTLOCNAME: {varchar(255)} <br>
     * フルパレット保管ロケ名称
     * @return The value of the column 'PLSLOTLOCNAME'. (NullAllowed)
     */
    public String getPlslotlocname() {
        return _plslotlocname;
    }

    /**
     * [set] PLSLOTLOCNAME: {varchar(255)} <br>
     * フルパレット保管ロケ名称
     * @param plslotlocname The value of the column 'PLSLOTLOCNAME'. (NullAllowed)
     */
    public void setPlslotlocname(String plslotlocname) {
        __modifiedProperties.add("plslotlocname");
        this._plslotlocname = plslotlocname;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19), FK to M_PRODUCT} <br>
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
