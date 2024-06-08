package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRASSORTORDER as TABLE. <br>
 * 追跡情報(棚卸)
 * <pre>
 * [primary-key]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO
 *
 * [column]
 *     DIRECTIONORDERKEY, DIRECTIONORDERGNO, ACTFLG, WAREHOUSECD, RCVDATE, SHIPORDER, RANGESTART, RANGEEND, DPWAREHOUSECD, DELIVERYDATE, ITEMCD, LINECD, SOTEDUNIT, ASSORTEDORDER, DELIVERYSEQNO, DELIVERYBRANCHNO, CASENO, CASESERIAL, SOTEDLOC, PRODUCT_CD, DIRECTIONCD, PISTONTYPE, CUSTOMERCD, DIRECTIONNUM, SROPRTCNT, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DIRECTIONORDERKEY
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
public abstract class BsTTrassortorderDto implements Serializable {

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
    /** DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _directionorderkey;

    /** DIRECTIONORDERGNO: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _directionordergno;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    @JsonKey
    protected java.math.BigDecimal _actflg;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** RCVDATE: {IX+, varchar(8)} */
    @JsonKey
    protected String _rcvdate;

    /** SHIPORDER: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _shiporder;

    /** RANGESTART: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rangestart;

    /** RANGEEND: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rangeend;

    /** DPWAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dpwarehousecd;

    /** DELIVERYDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _deliverydate;

    /** ITEMCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** LINECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _linecd;

    /** SOTEDUNIT: {varchar(30)} */
    @JsonKey
    protected String _sotedunit;

    /** ASSORTEDORDER: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _assortedorder;

    /** DELIVERYSEQNO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _deliveryseqno;

    /** DELIVERYBRANCHNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _deliverybranchno;

    /** CASENO: {varchar(30)} */
    @JsonKey
    protected String _caseno;

    /** CASESERIAL: {varchar(30)} */
    @JsonKey
    protected String _caseserial;

    /** SOTEDLOC: {varchar(255)} */
    @JsonKey
    protected String _sotedloc;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** DIRECTIONCD: {varchar(30)} */
    @JsonKey
    protected String _directioncd;

    /** PISTONTYPE: {char(1)} */
    @JsonKey
    protected String _pistontype;

    /** CUSTOMERCD: {varchar(30)} */
    @JsonKey
    protected String _customercd;

    /** DIRECTIONNUM: {bigint(19)} */
    @JsonKey
    protected Long _directionnum;

    /** SROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata3;

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
    public BsTTrassortorderDto() {
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
        if (other == null || !(other instanceof BsTTrassortorderDto)) { return false; }
        final BsTTrassortorderDto otherEntity = (BsTTrassortorderDto)other;
        if (!helpComparingValue(getDirectionorderkey(), otherEntity.getDirectionorderkey())) { return false; }
        if (!helpComparingValue(getDirectionordergno(), otherEntity.getDirectionordergno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRASSORTORDER");
        result = xCH(result, getDirectionorderkey());
        result = xCH(result, getDirectionordergno());
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
        sb.append(c).append(getDirectionorderkey());
        sb.append(c).append(getDirectionordergno());
        sb.append(c).append(getActflg());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getRcvdate());
        sb.append(c).append(getShiporder());
        sb.append(c).append(getRangestart());
        sb.append(c).append(getRangeend());
        sb.append(c).append(getDpwarehousecd());
        sb.append(c).append(getDeliverydate());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getLinecd());
        sb.append(c).append(getSotedunit());
        sb.append(c).append(getAssortedorder());
        sb.append(c).append(getDeliveryseqno());
        sb.append(c).append(getDeliverybranchno());
        sb.append(c).append(getCaseno());
        sb.append(c).append(getCaseserial());
        sb.append(c).append(getSotedloc());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getDirectioncd());
        sb.append(c).append(getPistontype());
        sb.append(c).append(getCustomercd());
        sb.append(c).append(getDirectionnum());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getVaExtdata3());
        sb.append(c).append(getNvExtdata1());
        sb.append(c).append(getNvExtdata2());
        sb.append(c).append(getNvExtdata3());
        sb.append(c).append(getNmExtdata1());
        sb.append(c).append(getNmExtdata2());
        sb.append(c).append(getNmExtdata3());
        sb.append(c).append(getDtExtdata1());
        sb.append(c).append(getDtExtdata2());
        sb.append(c).append(getDtExtdata3());
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
     * [get] DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず実績順序キー
     * @return The value of the column 'DIRECTIONORDERKEY'. (NullAllowed)
     */
    public Long getDirectionorderkey() {
        return _directionorderkey;
    }

    /**
     * [set] DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず実績順序キー
     * @param directionorderkey The value of the column 'DIRECTIONORDERKEY'. (NullAllowed)
     */
    public void setDirectionorderkey(Long directionorderkey) {
        __modifiedProperties.add("directionorderkey");
        this._directionorderkey = directionorderkey;
    }

    /**
     * [get] DIRECTIONORDERGNO: {PK, NotNull, bigint(19)} <br>
     * さしず実績枝番号
     * @return The value of the column 'DIRECTIONORDERGNO'. (NullAllowed)
     */
    public Long getDirectionordergno() {
        return _directionordergno;
    }

    /**
     * [set] DIRECTIONORDERGNO: {PK, NotNull, bigint(19)} <br>
     * さしず実績枝番号
     * @param directionordergno The value of the column 'DIRECTIONORDERGNO'. (NullAllowed)
     */
    public void setDirectionordergno(Long directionordergno) {
        __modifiedProperties.add("directionordergno");
        this._directionordergno = directionordergno;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getActflg() {
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        __modifiedProperties.add("actflg");
        this._actflg = actflg;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点コード
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点コード
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] RCVDATE: {IX+, varchar(8)} <br>
     * 受信日
     * @return The value of the column 'RCVDATE'. (NullAllowed)
     */
    public String getRcvdate() {
        return _rcvdate;
    }

    /**
     * [set] RCVDATE: {IX+, varchar(8)} <br>
     * 受信日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed)
     */
    public void setRcvdate(String rcvdate) {
        __modifiedProperties.add("rcvdate");
        this._rcvdate = rcvdate;
    }

    /**
     * [get] SHIPORDER: {NotNull, bigint(19)} <br>
     * 出荷順
     * @return The value of the column 'SHIPORDER'. (NullAllowed)
     */
    public Long getShiporder() {
        return _shiporder;
    }

    /**
     * [set] SHIPORDER: {NotNull, bigint(19)} <br>
     * 出荷順
     * @param shiporder The value of the column 'SHIPORDER'. (NullAllowed)
     */
    public void setShiporder(Long shiporder) {
        __modifiedProperties.add("shiporder");
        this._shiporder = shiporder;
    }

    /**
     * [get] RANGESTART: {NotNull, decimal(16, 6)} <br>
     * 仕分範囲（開始）
     * @return The value of the column 'RANGESTART'. (NullAllowed)
     */
    public java.math.BigDecimal getRangestart() {
        return _rangestart;
    }

    /**
     * [set] RANGESTART: {NotNull, decimal(16, 6)} <br>
     * 仕分範囲（開始）
     * @param rangestart The value of the column 'RANGESTART'. (NullAllowed)
     */
    public void setRangestart(java.math.BigDecimal rangestart) {
        __modifiedProperties.add("rangestart");
        this._rangestart = rangestart;
    }

    /**
     * [get] RANGEEND: {NotNull, decimal(16, 6)} <br>
     * 仕分範囲（終了）
     * @return The value of the column 'RANGEEND'. (NullAllowed)
     */
    public java.math.BigDecimal getRangeend() {
        return _rangeend;
    }

    /**
     * [set] RANGEEND: {NotNull, decimal(16, 6)} <br>
     * 仕分範囲（終了）
     * @param rangeend The value of the column 'RANGEEND'. (NullAllowed)
     */
    public void setRangeend(java.math.BigDecimal rangeend) {
        __modifiedProperties.add("rangeend");
        this._rangeend = rangeend;
    }

    /**
     * [get] DPWAREHOUSECD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPWAREHOUSECD'. (NullAllowed)
     */
    public String getDpwarehousecd() {
        return _dpwarehousecd;
    }

    /**
     * [set] DPWAREHOUSECD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpwarehousecd The value of the column 'DPWAREHOUSECD'. (NullAllowed)
     */
    public void setDpwarehousecd(String dpwarehousecd) {
        __modifiedProperties.add("dpwarehousecd");
        this._dpwarehousecd = dpwarehousecd;
    }

    /**
     * [get] DELIVERYDATE: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DELIVERYDATE'. (NullAllowed)
     */
    public String getDeliverydate() {
        return _deliverydate;
    }

    /**
     * [set] DELIVERYDATE: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @param deliverydate The value of the column 'DELIVERYDATE'. (NullAllowed)
     */
    public void setDeliverydate(String deliverydate) {
        __modifiedProperties.add("deliverydate");
        this._deliverydate = deliverydate;
    }

    /**
     * [get] ITEMCD: {NotNull, varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {NotNull, varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
    }

    /**
     * [get] LINECD: {NotNull, varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'LINECD'. (NullAllowed)
     */
    public String getLinecd() {
        return _linecd;
    }

    /**
     * [set] LINECD: {NotNull, varchar(30)} <br>
     * 仕分ラインCD
     * @param linecd The value of the column 'LINECD'. (NullAllowed)
     */
    public void setLinecd(String linecd) {
        __modifiedProperties.add("linecd");
        this._linecd = linecd;
    }

    /**
     * [get] SOTEDUNIT: {varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public String getSotedunit() {
        return _sotedunit;
    }

    /**
     * [set] SOTEDUNIT: {varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        __modifiedProperties.add("sotedunit");
        this._sotedunit = sotedunit;
    }

    /**
     * [get] ASSORTEDORDER: {NotNull, bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'ASSORTEDORDER'. (NullAllowed)
     */
    public Long getAssortedorder() {
        return _assortedorder;
    }

    /**
     * [set] ASSORTEDORDER: {NotNull, bigint(19)} <br>
     * 仕分順
     * @param assortedorder The value of the column 'ASSORTEDORDER'. (NullAllowed)
     */
    public void setAssortedorder(Long assortedorder) {
        __modifiedProperties.add("assortedorder");
        this._assortedorder = assortedorder;
    }

    /**
     * [get] DELIVERYSEQNO: {NotNull, bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DELIVERYSEQNO'. (NullAllowed)
     */
    public Long getDeliveryseqno() {
        return _deliveryseqno;
    }

    /**
     * [set] DELIVERYSEQNO: {NotNull, bigint(19)} <br>
     * 配達通番
     * @param deliveryseqno The value of the column 'DELIVERYSEQNO'. (NullAllowed)
     */
    public void setDeliveryseqno(Long deliveryseqno) {
        __modifiedProperties.add("deliveryseqno");
        this._deliveryseqno = deliveryseqno;
    }

    /**
     * [get] DELIVERYBRANCHNO: {NotNull, decimal(16, 6)} <br>
     * 配達通番枝番
     * @return The value of the column 'DELIVERYBRANCHNO'. (NullAllowed)
     */
    public java.math.BigDecimal getDeliverybranchno() {
        return _deliverybranchno;
    }

    /**
     * [set] DELIVERYBRANCHNO: {NotNull, decimal(16, 6)} <br>
     * 配達通番枝番
     * @param deliverybranchno The value of the column 'DELIVERYBRANCHNO'. (NullAllowed)
     */
    public void setDeliverybranchno(java.math.BigDecimal deliverybranchno) {
        __modifiedProperties.add("deliverybranchno");
        this._deliverybranchno = deliverybranchno;
    }

    /**
     * [get] CASENO: {varchar(30)} <br>
     * 箱№
     * @return The value of the column 'CASENO'. (NullAllowed)
     */
    public String getCaseno() {
        return _caseno;
    }

    /**
     * [set] CASENO: {varchar(30)} <br>
     * 箱№
     * @param caseno The value of the column 'CASENO'. (NullAllowed)
     */
    public void setCaseno(String caseno) {
        __modifiedProperties.add("caseno");
        this._caseno = caseno;
    }

    /**
     * [get] CASESERIAL: {varchar(30)} <br>
     * 箱№（通番）
     * @return The value of the column 'CASESERIAL'. (NullAllowed)
     */
    public String getCaseserial() {
        return _caseserial;
    }

    /**
     * [set] CASESERIAL: {varchar(30)} <br>
     * 箱№（通番）
     * @param caseserial The value of the column 'CASESERIAL'. (NullAllowed)
     */
    public void setCaseserial(String caseserial) {
        __modifiedProperties.add("caseserial");
        this._caseserial = caseserial;
    }

    /**
     * [get] SOTEDLOC: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'SOTEDLOC'. (NullAllowed)
     */
    public String getSotedloc() {
        return _sotedloc;
    }

    /**
     * [set] SOTEDLOC: {varchar(255)} <br>
     * 仕分ロケ
     * @param sotedloc The value of the column 'SOTEDLOC'. (NullAllowed)
     */
    public void setSotedloc(String sotedloc) {
        __modifiedProperties.add("sotedloc");
        this._sotedloc = sotedloc;
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
     * [get] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public String getDirectioncd() {
        return _directioncd;
    }

    /**
     * [set] DIRECTIONCD: {varchar(30)} <br>
     * 方面CD
     * @param directioncd The value of the column 'DIRECTIONCD'. (NullAllowed)
     */
    public void setDirectioncd(String directioncd) {
        __modifiedProperties.add("directioncd");
        this._directioncd = directioncd;
    }

    /**
     * [get] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public String getPistontype() {
        return _pistontype;
    }

    /**
     * [set] PISTONTYPE: {char(1)} <br>
     * ピストン区分
     * @param pistontype The value of the column 'PISTONTYPE'. (NullAllowed)
     */
    public void setPistontype(String pistontype) {
        __modifiedProperties.add("pistontype");
        this._pistontype = pistontype;
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
     * [get] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public Long getDirectionnum() {
        return _directionnum;
    }

    /**
     * [set] DIRECTIONNUM: {bigint(19)} <br>
     * さしず数量
     * @param directionnum The value of the column 'DIRECTIONNUM'. (NullAllowed)
     */
    public void setDirectionnum(Long directionnum) {
        __modifiedProperties.add("directionnum");
        this._directionnum = directionnum;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public Long getSroprtcnt() {
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        __modifiedProperties.add("sroprtcnt");
        this._sroprtcnt = sroprtcnt;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public String getVaExtdata3() {
        return _vaExtdata3;
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public void setVaExtdata3(String vaExtdata3) {
        __modifiedProperties.add("vaExtdata3");
        this._vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public String getNvExtdata1() {
        return _nvExtdata1;
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public void setNvExtdata1(String nvExtdata1) {
        __modifiedProperties.add("nvExtdata1");
        this._nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public String getNvExtdata2() {
        return _nvExtdata2;
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public void setNvExtdata2(String nvExtdata2) {
        __modifiedProperties.add("nvExtdata2");
        this._nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public String getNvExtdata3() {
        return _nvExtdata3;
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public void setNvExtdata3(String nvExtdata3) {
        __modifiedProperties.add("nvExtdata3");
        this._nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public Long getNmExtdata1() {
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        __modifiedProperties.add("nmExtdata1");
        this._nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public Long getNmExtdata2() {
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        __modifiedProperties.add("nmExtdata2");
        this._nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public Long getNmExtdata3() {
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        __modifiedProperties.add("nmExtdata3");
        this._nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public String getDtExtdata1() {
        return _dtExtdata1;
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        __modifiedProperties.add("dtExtdata1");
        this._dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public String getDtExtdata3() {
        return _dtExtdata3;
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public void setDtExtdata3(String dtExtdata3) {
        __modifiedProperties.add("dtExtdata3");
        this._dtExtdata3 = dtExtdata3;
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
