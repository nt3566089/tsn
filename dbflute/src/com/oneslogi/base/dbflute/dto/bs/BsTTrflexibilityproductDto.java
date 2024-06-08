package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRFLEXIBILITYPRODUCT as TABLE. <br>
 * 融通輸送製品情報
 * <pre>
 * [primary-key]
 *     TRFLEXIBILITYPRODUCT_ID
 *
 * [column]
 *     TRFLEXIBILITYPRODUCT_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, OWNERCD, INSTRACTDATETIME, RCVMAKEFLG, REFLINENO, PRODUCT_CD, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, CASEINFOFLG, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, OPERATIONNUM, RCVKEY, FIRMCARRYNO, BATJPRODUCTIONYM, COMETODATE, RECEIVEDATE, CARDBOARDNO, RCVPALLETNO, TAXPALLETNO, ITEMCD_IN, ITEMCD_WH, DESIGNCD_IN, DESIGNCD_WH, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILITYPRODUCT_ID
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
public abstract class BsTTrflexibilityproductDto implements Serializable {

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
    /** TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trflexibilityproductId;

    /** SUPPLIERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** SHIPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** SCHDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** FLEXIBITYNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _flexibityno;

    /** TRANSPORTCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** RCVDATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _rcvdate;

    /** OWNERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ownercd;

    /** INSTRACTDATETIME: {NotNull, varchar(8)} */
    @JsonKey
    protected String _instractdatetime;

    /** RCVMAKEFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvmakeflg;

    /** REFLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _reflineno;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** MANUFACTUREDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _manufacturedate;

    /** DESIGNCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** QTYCASE: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtybowl;

    /** CASEINFOFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _caseinfoflg;

    /** FACTORYCD: {varchar(30)} */
    @JsonKey
    protected String _factorycd;

    /** ITEMCD_CASE: {varchar(30)} */
    @JsonKey
    protected String _itemcdCase;

    /** SKUCD: {varchar(30)} */
    @JsonKey
    protected String _skucd;

    /** DESTINATIONCD: {varchar(30)} */
    @JsonKey
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(30)} */
    @JsonKey
    protected String _manufacturecd;

    /** ORDERNO: {varchar(30)} */
    @JsonKey
    protected String _orderno;

    /** MACHINENO: {varchar(30)} */
    @JsonKey
    protected String _machineno;

    /** CREATENO: {varchar(30)} */
    @JsonKey
    protected String _createno;

    /** LIMITDATE: {varchar(8)} */
    @JsonKey
    protected String _limitdate;

    /** DATETIME: {varchar(8)} */
    @JsonKey
    protected String _datetime;

    /** DISTRIBUTIONCD: {char(1)} */
    @JsonKey
    protected String _distributioncd;

    /** OPERATIONNUM: {bigint(19)} */
    @JsonKey
    protected Long _operationnum;

    /** RCVKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** FIRMCARRYNO: {varchar(30)} */
    @JsonKey
    protected String _firmcarryno;

    /** BATJPRODUCTIONYM: {varchar(30)} */
    @JsonKey
    protected String _batjproductionym;

    /** COMETODATE: {varchar(8)} */
    @JsonKey
    protected String _cometodate;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** CARDBOARDNO: {varchar(30)} */
    @JsonKey
    protected String _cardboardno;

    /** RCVPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _rcvpalletno;

    /** TAXPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _taxpalletno;

    /** ITEMCD_IN: {varchar(30)} */
    @JsonKey
    protected String _itemcdIn;

    /** ITEMCD_WH: {varchar(30)} */
    @JsonKey
    protected String _itemcdWh;

    /** DESIGNCD_IN: {varchar(30)} */
    @JsonKey
    protected String _designcdIn;

    /** DESIGNCD_WH: {varchar(30)} */
    @JsonKey
    protected String _designcdWh;

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
    public BsTTrflexibilityproductDto() {
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
        if (other == null || !(other instanceof BsTTrflexibilityproductDto)) { return false; }
        final BsTTrflexibilityproductDto otherEntity = (BsTTrflexibilityproductDto)other;
        if (!helpComparingValue(getTrflexibilityproductId(), otherEntity.getTrflexibilityproductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRFLEXIBILITYPRODUCT");
        result = xCH(result, getTrflexibilityproductId());
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
        sb.append(c).append(getTrflexibilityproductId());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getFlexibityno());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getRcvdate());
        sb.append(c).append(getOwnercd());
        sb.append(c).append(getInstractdatetime());
        sb.append(c).append(getRcvmakeflg());
        sb.append(c).append(getReflineno());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getManufacturedate());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getQtycase());
        sb.append(c).append(getQtybowl());
        sb.append(c).append(getCaseinfoflg());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getItemcdCase());
        sb.append(c).append(getSkucd());
        sb.append(c).append(getDestinationcd());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getOrderno());
        sb.append(c).append(getMachineno());
        sb.append(c).append(getCreateno());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getDatetime());
        sb.append(c).append(getDistributioncd());
        sb.append(c).append(getOperationnum());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getBatjproductionym());
        sb.append(c).append(getCometodate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getCardboardno());
        sb.append(c).append(getRcvpalletno());
        sb.append(c).append(getTaxpalletno());
        sb.append(c).append(getItemcdIn());
        sb.append(c).append(getItemcdWh());
        sb.append(c).append(getDesigncdIn());
        sb.append(c).append(getDesigncdWh());
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
     * [get] TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送製品情報ID
     * @return The value of the column 'TRFLEXIBILITYPRODUCT_ID'. (NullAllowed)
     */
    public Long getTrflexibilityproductId() {
        return _trflexibilityproductId;
    }

    /**
     * [set] TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送製品情報ID
     * @param trflexibilityproductId The value of the column 'TRFLEXIBILITYPRODUCT_ID'. (NullAllowed)
     */
    public void setTrflexibilityproductId(Long trflexibilityproductId) {
        __modifiedProperties.add("trflexibilityproductId");
        this._trflexibilityproductId = trflexibilityproductId;
    }

    /**
     * [get] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public String getSuppliercd() {
        return _suppliercd;
    }

    /**
     * [set] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed)
     */
    public void setSuppliercd(String suppliercd) {
        __modifiedProperties.add("suppliercd");
        this._suppliercd = suppliercd;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @return The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public java.math.BigDecimal getFlexibityno() {
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (NullAllowed)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        __modifiedProperties.add("flexibityno");
        this._flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed)
     */
    public String getRcvdate() {
        return _rcvdate;
    }

    /**
     * [set] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed)
     */
    public void setRcvdate(String rcvdate) {
        __modifiedProperties.add("rcvdate");
        this._rcvdate = rcvdate;
    }

    /**
     * [get] OWNERCD: {NotNull, varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'OWNERCD'. (NullAllowed)
     */
    public String getOwnercd() {
        return _ownercd;
    }

    /**
     * [set] OWNERCD: {NotNull, varchar(30)} <br>
     * 荷主CD
     * @param ownercd The value of the column 'OWNERCD'. (NullAllowed)
     */
    public void setOwnercd(String ownercd) {
        __modifiedProperties.add("ownercd");
        this._ownercd = ownercd;
    }

    /**
     * [get] INSTRACTDATETIME: {NotNull, varchar(8)} <br>
     * 指示登録日時
     * @return The value of the column 'INSTRACTDATETIME'. (NullAllowed)
     */
    public String getInstractdatetime() {
        return _instractdatetime;
    }

    /**
     * [set] INSTRACTDATETIME: {NotNull, varchar(8)} <br>
     * 指示登録日時
     * @param instractdatetime The value of the column 'INSTRACTDATETIME'. (NullAllowed)
     */
    public void setInstractdatetime(String instractdatetime) {
        __modifiedProperties.add("instractdatetime");
        this._instractdatetime = instractdatetime;
    }

    /**
     * [get] RCVMAKEFLG: {NotNull, decimal(16, 6)} <br>
     * 入庫予定作成フラグ
     * @return The value of the column 'RCVMAKEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvmakeflg() {
        return _rcvmakeflg;
    }

    /**
     * [set] RCVMAKEFLG: {NotNull, decimal(16, 6)} <br>
     * 入庫予定作成フラグ
     * @param rcvmakeflg The value of the column 'RCVMAKEFLG'. (NullAllowed)
     */
    public void setRcvmakeflg(java.math.BigDecimal rcvmakeflg) {
        __modifiedProperties.add("rcvmakeflg");
        this._rcvmakeflg = rcvmakeflg;
    }

    /**
     * [get] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @return The value of the column 'REFLINENO'. (NullAllowed)
     */
    public Long getReflineno() {
        return _reflineno;
    }

    /**
     * [set] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @param reflineno The value of the column 'REFLINENO'. (NullAllowed)
     */
    public void setReflineno(Long reflineno) {
        __modifiedProperties.add("reflineno");
        this._reflineno = reflineno;
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
     * [get] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public String getManufacturedate() {
        return _manufacturedate;
    }

    /**
     * [set] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public void setManufacturedate(String manufacturedate) {
        __modifiedProperties.add("manufacturedate");
        this._manufacturedate = manufacturedate;
    }

    /**
     * [get] DESIGNCD: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @return The value of the column 'QTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getQtycase() {
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @param qtycase The value of the column 'QTYCASE'. (NullAllowed)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        __modifiedProperties.add("qtycase");
        this._qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @return The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getQtybowl() {
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @param qtybowl The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        __modifiedProperties.add("qtybowl");
        this._qtybowl = qtybowl;
    }

    /**
     * [get] CASEINFOFLG: {decimal(16, 6)} <br>
     * ケース情報有無フラグ
     * @return The value of the column 'CASEINFOFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getCaseinfoflg() {
        return _caseinfoflg;
    }

    /**
     * [set] CASEINFOFLG: {decimal(16, 6)} <br>
     * ケース情報有無フラグ
     * @param caseinfoflg The value of the column 'CASEINFOFLG'. (NullAllowed)
     */
    public void setCaseinfoflg(java.math.BigDecimal caseinfoflg) {
        __modifiedProperties.add("caseinfoflg");
        this._caseinfoflg = caseinfoflg;
    }

    /**
     * [get] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public String getFactorycd() {
        return _factorycd;
    }

    /**
     * [set] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public void setFactorycd(String factorycd) {
        __modifiedProperties.add("factorycd");
        this._factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @return The value of the column 'ITEMCD_CASE'. (NullAllowed)
     */
    public String getItemcdCase() {
        return _itemcdCase;
    }

    /**
     * [set] ITEMCD_CASE: {varchar(30)} <br>
     * 銘柄CD（ケース）
     * @param itemcdCase The value of the column 'ITEMCD_CASE'. (NullAllowed)
     */
    public void setItemcdCase(String itemcdCase) {
        __modifiedProperties.add("itemcdCase");
        this._itemcdCase = itemcdCase;
    }

    /**
     * [get] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed)
     */
    public String getSkucd() {
        return _skucd;
    }

    /**
     * [set] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed)
     */
    public void setSkucd(String skucd) {
        __modifiedProperties.add("skucd");
        this._skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public String getDestinationcd() {
        return _destinationcd;
    }

    /**
     * [set] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public void setDestinationcd(String destinationcd) {
        __modifiedProperties.add("destinationcd");
        this._destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public String getManufacturecd() {
        return _manufacturecd;
    }

    /**
     * [set] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public void setManufacturecd(String manufacturecd) {
        __modifiedProperties.add("manufacturecd");
        this._manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed)
     */
    public String getOrderno() {
        return _orderno;
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed)
     */
    public void setOrderno(String orderno) {
        __modifiedProperties.add("orderno");
        this._orderno = orderno;
    }

    /**
     * [get] MACHINENO: {varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed)
     */
    public String getMachineno() {
        return _machineno;
    }

    /**
     * [set] MACHINENO: {varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed)
     */
    public void setMachineno(String machineno) {
        __modifiedProperties.add("machineno");
        this._machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed)
     */
    public String getCreateno() {
        return _createno;
    }

    /**
     * [set] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed)
     */
    public void setCreateno(String createno) {
        __modifiedProperties.add("createno");
        this._createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * 製造年月日（ケース）
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed)
     */
    public String getDatetime() {
        return _datetime;
    }

    /**
     * [set] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed)
     */
    public void setDatetime(String datetime) {
        __modifiedProperties.add("datetime");
        this._datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
    }

    /**
     * [get] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @return The value of the column 'OPERATIONNUM'. (NullAllowed)
     */
    public Long getOperationnum() {
        return _operationnum;
    }

    /**
     * [set] OPERATIONNUM: {bigint(19)} <br>
     * 操作数量
     * @param operationnum The value of the column 'OPERATIONNUM'. (NullAllowed)
     */
    public void setOperationnum(Long operationnum) {
        __modifiedProperties.add("operationnum");
        this._operationnum = operationnum;
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
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJPRODUCTIONYM'. (NullAllowed)
     */
    public String getBatjproductionym() {
        return _batjproductionym;
    }

    /**
     * [set] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @param batjproductionym The value of the column 'BATJPRODUCTIONYM'. (NullAllowed)
     */
    public void setBatjproductionym(String batjproductionym) {
        __modifiedProperties.add("batjproductionym");
        this._batjproductionym = batjproductionym;
    }

    /**
     * [get] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'COMETODATE'. (NullAllowed)
     */
    public String getCometodate() {
        return _cometodate;
    }

    /**
     * [set] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @param cometodate The value of the column 'COMETODATE'. (NullAllowed)
     */
    public void setCometodate(String cometodate) {
        __modifiedProperties.add("cometodate");
        this._cometodate = cometodate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] CARDBOARDNO: {varchar(30)} <br>
     * 段ボール番号
     * @return The value of the column 'CARDBOARDNO'. (NullAllowed)
     */
    public String getCardboardno() {
        return _cardboardno;
    }

    /**
     * [set] CARDBOARDNO: {varchar(30)} <br>
     * 段ボール番号
     * @param cardboardno The value of the column 'CARDBOARDNO'. (NullAllowed)
     */
    public void setCardboardno(String cardboardno) {
        __modifiedProperties.add("cardboardno");
        this._cardboardno = cardboardno;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public String getRcvpalletno() {
        return _rcvpalletno;
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public void setRcvpalletno(String rcvpalletno) {
        __modifiedProperties.add("rcvpalletno");
        this._rcvpalletno = rcvpalletno;
    }

    /**
     * [get] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @return The value of the column 'TAXPALLETNO'. (NullAllowed)
     */
    public String getTaxpalletno() {
        return _taxpalletno;
    }

    /**
     * [set] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @param taxpalletno The value of the column 'TAXPALLETNO'. (NullAllowed)
     */
    public void setTaxpalletno(String taxpalletno) {
        __modifiedProperties.add("taxpalletno");
        this._taxpalletno = taxpalletno;
    }

    /**
     * [get] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @return The value of the column 'ITEMCD_IN'. (NullAllowed)
     */
    public String getItemcdIn() {
        return _itemcdIn;
    }

    /**
     * [set] ITEMCD_IN: {varchar(30)} <br>
     * 銘柄CD（入庫時）
     * @param itemcdIn The value of the column 'ITEMCD_IN'. (NullAllowed)
     */
    public void setItemcdIn(String itemcdIn) {
        __modifiedProperties.add("itemcdIn");
        this._itemcdIn = itemcdIn;
    }

    /**
     * [get] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @return The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public String getItemcdWh() {
        return _itemcdWh;
    }

    /**
     * [set] ITEMCD_WH: {varchar(30)} <br>
     * 銘柄CD（倉庫内）
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (NullAllowed)
     */
    public void setItemcdWh(String itemcdWh) {
        __modifiedProperties.add("itemcdWh");
        this._itemcdWh = itemcdWh;
    }

    /**
     * [get] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @return The value of the column 'DESIGNCD_IN'. (NullAllowed)
     */
    public String getDesigncdIn() {
        return _designcdIn;
    }

    /**
     * [set] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分（入庫時）
     * @param designcdIn The value of the column 'DESIGNCD_IN'. (NullAllowed)
     */
    public void setDesigncdIn(String designcdIn) {
        __modifiedProperties.add("designcdIn");
        this._designcdIn = designcdIn;
    }

    /**
     * [get] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @return The value of the column 'DESIGNCD_WH'. (NullAllowed)
     */
    public String getDesigncdWh() {
        return _designcdWh;
    }

    /**
     * [set] DESIGNCD_WH: {varchar(30)} <br>
     * デザイン区分（倉庫内）
     * @param designcdWh The value of the column 'DESIGNCD_WH'. (NullAllowed)
     */
    public void setDesigncdWh(String designcdWh) {
        __modifiedProperties.add("designcdWh");
        this._designcdWh = designcdWh;
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
