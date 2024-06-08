package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKRCVREVERSE as TABLE. <br>
 * 製造年月日逆転リスト（入庫）情報
 * <pre>
 * [primary-key]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO
 *
 * [column]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO, WAREHOUSECD, WAREHOUSENAME, TRANSPORTNO, RCVSCHDATE, SUPPLIERCD, SUPPLIERNAME, PRODUCT_CD, ITEMNAME, RCVLIMITDATE, RCVDESIGNCD, RCVQTY, WORKDATETIME, LOC, LOCCD, LIMITDAY, DESIGNCD, QTYCASE, QTYBOWL, FLG, INSIDE_OUTSIDE_KBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkrcvreverseDto implements Serializable {

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
    /** PRINTKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _printkey;

    /** RCVREVERSENO: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvreverseno;

    /** RCVREVERSELINENO: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _rcvreverselineno;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** WAREHOUSENAME: {varchar(100)} */
    @JsonKey
    protected String _warehousename;

    /** TRANSPORTNO: {NotNull, varchar(60)} */
    @JsonKey
    protected String _transportno;

    /** RCVSCHDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _rcvschdate;

    /** SUPPLIERCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _suppliercd;

    /** SUPPLIERNAME: {varchar(255)} */
    @JsonKey
    protected String _suppliername;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMNAME: {varchar(100)} */
    @JsonKey
    protected String _itemname;

    /** RCVLIMITDATE: {NotNull, varchar(255)} */
    @JsonKey
    protected String _rcvlimitdate;

    /** RCVDESIGNCD: {varchar(100)} */
    @JsonKey
    protected String _rcvdesigncd;

    /** RCVQTY: {NotNull, varchar(4000)} */
    @JsonKey
    protected String _rcvqty;

    /** WORKDATETIME: {varchar(8)} */
    @JsonKey
    protected String _workdatetime;

    /** LOC: {NotNull, varchar(30)} */
    @JsonKey
    protected String _loc;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** LIMITDAY: {NotNull, varchar(8)} */
    @JsonKey
    protected String _limitday;

    /** DESIGNCD: {varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** QTYCASE: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtybowl;

    /** FLG: {char(1)} */
    @JsonKey
    protected String _flg;

    /** INSIDE_OUTSIDE_KBN: {varchar(60)} */
    @JsonKey
    protected String _insideOutsideKbn;

    /** ITEM_ORDERBY: {bigint(19)} */
    @JsonKey
    protected Long _itemOrderby;

    /** PRINTPAGENO: {bigint(19)} */
    @JsonKey
    protected Long _printpageno;

    /** SEQSORTKEY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _seqsortkey;

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
    public BsWWkrcvreverseDto() {
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
        if (other == null || !(other instanceof BsWWkrcvreverseDto)) { return false; }
        final BsWWkrcvreverseDto otherEntity = (BsWWkrcvreverseDto)other;
        if (!helpComparingValue(getPrintkey(), otherEntity.getPrintkey())) { return false; }
        if (!helpComparingValue(getRcvreverseno(), otherEntity.getRcvreverseno())) { return false; }
        if (!helpComparingValue(getRcvreverselineno(), otherEntity.getRcvreverselineno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKRCVREVERSE");
        result = xCH(result, getPrintkey());
        result = xCH(result, getRcvreverseno());
        result = xCH(result, getRcvreverselineno());
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
        sb.append(c).append(getPrintkey());
        sb.append(c).append(getRcvreverseno());
        sb.append(c).append(getRcvreverselineno());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getWarehousename());
        sb.append(c).append(getTransportno());
        sb.append(c).append(getRcvschdate());
        sb.append(c).append(getSuppliercd());
        sb.append(c).append(getSuppliername());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemname());
        sb.append(c).append(getRcvlimitdate());
        sb.append(c).append(getRcvdesigncd());
        sb.append(c).append(getRcvqty());
        sb.append(c).append(getWorkdatetime());
        sb.append(c).append(getLoc());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getLimitday());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getQtycase());
        sb.append(c).append(getQtybowl());
        sb.append(c).append(getFlg());
        sb.append(c).append(getInsideOutsideKbn());
        sb.append(c).append(getItemOrderby());
        sb.append(c).append(getPrintpageno());
        sb.append(c).append(getSeqsortkey());
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
     * [get] PRINTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPrintkey() {
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public void setPrintkey(java.math.BigDecimal printkey) {
        __modifiedProperties.add("printkey");
        this._printkey = printkey;
    }

    /**
     * [get] RCVREVERSENO: {PK, NotNull, decimal(16, 6)} <br>
     * 逆転リストNo.
     * @return The value of the column 'RCVREVERSENO'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvreverseno() {
        return _rcvreverseno;
    }

    /**
     * [set] RCVREVERSENO: {PK, NotNull, decimal(16, 6)} <br>
     * 逆転リストNo.
     * @param rcvreverseno The value of the column 'RCVREVERSENO'. (NullAllowed)
     */
    public void setRcvreverseno(java.math.BigDecimal rcvreverseno) {
        __modifiedProperties.add("rcvreverseno");
        this._rcvreverseno = rcvreverseno;
    }

    /**
     * [get] RCVREVERSELINENO: {PK, NotNull, bigint(19)} <br>
     * 逆転リスト明細No.
     * @return The value of the column 'RCVREVERSELINENO'. (NullAllowed)
     */
    public Long getRcvreverselineno() {
        return _rcvreverselineno;
    }

    /**
     * [set] RCVREVERSELINENO: {PK, NotNull, bigint(19)} <br>
     * 逆転リスト明細No.
     * @param rcvreverselineno The value of the column 'RCVREVERSELINENO'. (NullAllowed)
     */
    public void setRcvreverselineno(Long rcvreverselineno) {
        __modifiedProperties.add("rcvreverselineno");
        this._rcvreverselineno = rcvreverselineno;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSENAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSENAME'. (NullAllowed)
     */
    public String getWarehousename() {
        return _warehousename;
    }

    /**
     * [set] WAREHOUSENAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehousename The value of the column 'WAREHOUSENAME'. (NullAllowed)
     */
    public void setWarehousename(String warehousename) {
        __modifiedProperties.add("warehousename");
        this._warehousename = warehousename;
    }

    /**
     * [get] TRANSPORTNO: {NotNull, varchar(60)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTNO'. (NullAllowed)
     */
    public String getTransportno() {
        return _transportno;
    }

    /**
     * [set] TRANSPORTNO: {NotNull, varchar(60)} <br>
     * 輸送番号
     * @param transportno The value of the column 'TRANSPORTNO'. (NullAllowed)
     */
    public void setTransportno(String transportno) {
        __modifiedProperties.add("transportno");
        this._transportno = transportno;
    }

    /**
     * [get] RCVSCHDATE: {NotNull, varchar(8)} <br>
     * 受入予定年月日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public String getRcvschdate() {
        return _rcvschdate;
    }

    /**
     * [set] RCVSCHDATE: {NotNull, varchar(8)} <br>
     * 受入予定年月日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public void setRcvschdate(String rcvschdate) {
        __modifiedProperties.add("rcvschdate");
        this._rcvschdate = rcvschdate;
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
     * [get] SUPPLIERNAME: {varchar(255)} <br>
     * 発送元名称
     * @return The value of the column 'SUPPLIERNAME'. (NullAllowed)
     */
    public String getSuppliername() {
        return _suppliername;
    }

    /**
     * [set] SUPPLIERNAME: {varchar(255)} <br>
     * 発送元名称
     * @param suppliername The value of the column 'SUPPLIERNAME'. (NullAllowed)
     */
    public void setSuppliername(String suppliername) {
        __modifiedProperties.add("suppliername");
        this._suppliername = suppliername;
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
     * [get] ITEMNAME: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEMNAME'. (NullAllowed)
     */
    public String getItemname() {
        return _itemname;
    }

    /**
     * [set] ITEMNAME: {varchar(100)} <br>
     * 銘柄名称
     * @param itemname The value of the column 'ITEMNAME'. (NullAllowed)
     */
    public void setItemname(String itemname) {
        __modifiedProperties.add("itemname");
        this._itemname = itemname;
    }

    /**
     * [get] RCVLIMITDATE: {NotNull, varchar(255)} <br>
     * 入庫製品製造年月日
     * @return The value of the column 'RCVLIMITDATE'. (NullAllowed)
     */
    public String getRcvlimitdate() {
        return _rcvlimitdate;
    }

    /**
     * [set] RCVLIMITDATE: {NotNull, varchar(255)} <br>
     * 入庫製品製造年月日
     * @param rcvlimitdate The value of the column 'RCVLIMITDATE'. (NullAllowed)
     */
    public void setRcvlimitdate(String rcvlimitdate) {
        __modifiedProperties.add("rcvlimitdate");
        this._rcvlimitdate = rcvlimitdate;
    }

    /**
     * [get] RCVDESIGNCD: {varchar(100)} <br>
     * 入庫製品デザイン区分
     * @return The value of the column 'RCVDESIGNCD'. (NullAllowed)
     */
    public String getRcvdesigncd() {
        return _rcvdesigncd;
    }

    /**
     * [set] RCVDESIGNCD: {varchar(100)} <br>
     * 入庫製品デザイン区分
     * @param rcvdesigncd The value of the column 'RCVDESIGNCD'. (NullAllowed)
     */
    public void setRcvdesigncd(String rcvdesigncd) {
        __modifiedProperties.add("rcvdesigncd");
        this._rcvdesigncd = rcvdesigncd;
    }

    /**
     * [get] RCVQTY: {NotNull, varchar(4000)} <br>
     * 数量
     * @return The value of the column 'RCVQTY'. (NullAllowed)
     */
    public String getRcvqty() {
        return _rcvqty;
    }

    /**
     * [set] RCVQTY: {NotNull, varchar(4000)} <br>
     * 数量
     * @param rcvqty The value of the column 'RCVQTY'. (NullAllowed)
     */
    public void setRcvqty(String rcvqty) {
        __modifiedProperties.add("rcvqty");
        this._rcvqty = rcvqty;
    }

    /**
     * [get] WORKDATETIME: {varchar(8)} <br>
     * 作業時刻
     * @return The value of the column 'WORKDATETIME'. (NullAllowed)
     */
    public String getWorkdatetime() {
        return _workdatetime;
    }

    /**
     * [set] WORKDATETIME: {varchar(8)} <br>
     * 作業時刻
     * @param workdatetime The value of the column 'WORKDATETIME'. (NullAllowed)
     */
    public void setWorkdatetime(String workdatetime) {
        __modifiedProperties.add("workdatetime");
        this._workdatetime = workdatetime;
    }

    /**
     * [get] LOC: {NotNull, varchar(30)} <br>
     * ロケーション区分
     * @return The value of the column 'LOC'. (NullAllowed)
     */
    public String getLoc() {
        return _loc;
    }

    /**
     * [set] LOC: {NotNull, varchar(30)} <br>
     * ロケーション区分
     * @param loc The value of the column 'LOC'. (NullAllowed)
     */
    public void setLoc(String loc) {
        __modifiedProperties.add("loc");
        this._loc = loc;
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
     * [get] LIMITDAY: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDAY'. (NullAllowed)
     */
    public String getLimitday() {
        return _limitday;
    }

    /**
     * [set] LIMITDAY: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param limitday The value of the column 'LIMITDAY'. (NullAllowed)
     */
    public void setLimitday(String limitday) {
        __modifiedProperties.add("limitday");
        this._limitday = limitday;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 在庫ケース数
     * @return The value of the column 'QTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getQtycase() {
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 在庫ケース数
     * @param qtycase The value of the column 'QTYCASE'. (NullAllowed)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        __modifiedProperties.add("qtycase");
        this._qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 在庫カートン数
     * @return The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getQtybowl() {
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 在庫カートン数
     * @param qtybowl The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        __modifiedProperties.add("qtybowl");
        this._qtybowl = qtybowl;
    }

    /**
     * [get] FLG: {char(1)} <br>
     * 逆転フラグ
     * @return The value of the column 'FLG'. (NullAllowed)
     */
    public String getFlg() {
        return _flg;
    }

    /**
     * [set] FLG: {char(1)} <br>
     * 逆転フラグ
     * @param flg The value of the column 'FLG'. (NullAllowed)
     */
    public void setFlg(String flg) {
        __modifiedProperties.add("flg");
        this._flg = flg;
    }

    /**
     * [get] INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * 内外区分
     * @return The value of the column 'INSIDE_OUTSIDE_KBN'. (NullAllowed)
     */
    public String getInsideOutsideKbn() {
        return _insideOutsideKbn;
    }

    /**
     * [set] INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * 内外区分
     * @param insideOutsideKbn The value of the column 'INSIDE_OUTSIDE_KBN'. (NullAllowed)
     */
    public void setInsideOutsideKbn(String insideOutsideKbn) {
        __modifiedProperties.add("insideOutsideKbn");
        this._insideOutsideKbn = insideOutsideKbn;
    }

    /**
     * [get] ITEM_ORDERBY: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'ITEM_ORDERBY'. (NullAllowed)
     */
    public Long getItemOrderby() {
        return _itemOrderby;
    }

    /**
     * [set] ITEM_ORDERBY: {bigint(19)} <br>
     * 一般出力順
     * @param itemOrderby The value of the column 'ITEM_ORDERBY'. (NullAllowed)
     */
    public void setItemOrderby(Long itemOrderby) {
        __modifiedProperties.add("itemOrderby");
        this._itemOrderby = itemOrderby;
    }

    /**
     * [get] PRINTPAGENO: {bigint(19)} <br>
     * 帳票改頁
     * @return The value of the column 'PRINTPAGENO'. (NullAllowed)
     */
    public Long getPrintpageno() {
        return _printpageno;
    }

    /**
     * [set] PRINTPAGENO: {bigint(19)} <br>
     * 帳票改頁
     * @param printpageno The value of the column 'PRINTPAGENO'. (NullAllowed)
     */
    public void setPrintpageno(Long printpageno) {
        __modifiedProperties.add("printpageno");
        this._printpageno = printpageno;
    }

    /**
     * [get] SEQSORTKEY: {decimal(16, 6)} <br>
     * 連番ソートキー
     * @return The value of the column 'SEQSORTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSeqsortkey() {
        return _seqsortkey;
    }

    /**
     * [set] SEQSORTKEY: {decimal(16, 6)} <br>
     * 連番ソートキー
     * @param seqsortkey The value of the column 'SEQSORTKEY'. (NullAllowed)
     */
    public void setSeqsortkey(java.math.BigDecimal seqsortkey) {
        __modifiedProperties.add("seqsortkey");
        this._seqsortkey = seqsortkey;
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
