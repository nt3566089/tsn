package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKRECEIVEPLAN as TABLE. <br>
 * 格納先予定リスト情報
 * <pre>
 * [primary-key]
 *     W_WKRECEIVEPLAN_ID
 *
 * [column]
 *     W_WKRECEIVEPLAN_ID, PRINTKEY, LINE_NO, RECEIVE_PLAN_H_ID, RCVLINENO, WAREHOUSECD, WAREHOUSE_SNAME, SLOTLOCNAME, RCVSCHDATE, RECEIVE_LOT4, RECEIVE_LOT3, LOCATION_CD, CASEQTY_CAPACITY, FLOOR, FROMFAX, FROMPHONE, SUPPLIERRCVNO, PRODUCT_CD, ITEMNAME, ZONE, EXPECTQTY, RCVPAL, RCVCASE, LOT1, LOT4, LOT3, QTYCASE, QTYBOWL, QTYPAL, INOUTKBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkreceiveplanDto implements Serializable {

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
    /** W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _wWkreceiveplanId;

    /** PRINTKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _printkey;

    /** LINE_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** RCVLINENO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvlineno;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {varchar(100)} */
    @JsonKey
    protected String _warehouseSname;

    /** SLOTLOCNAME: {varchar(255)} */
    @JsonKey
    protected String _slotlocname;

    /** RCVSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvschdate;

    /** RECEIVE_LOT4: {varchar(8)} */
    @JsonKey
    protected String _receiveLot4;

    /** RECEIVE_LOT3: {varchar(60)} */
    @JsonKey
    protected String _receiveLot3;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** CASEQTY_CAPACITY: {bigint(19)} */
    @JsonKey
    protected Long _caseqtyCapacity;

    /** FLOOR: {varchar(60)} */
    @JsonKey
    protected String _floor;

    /** FROMFAX: {varchar(60)} */
    @JsonKey
    protected String _fromfax;

    /** FROMPHONE: {varchar(60)} */
    @JsonKey
    protected String _fromphone;

    /** SUPPLIERRCVNO: {varchar(60)} */
    @JsonKey
    protected String _supplierrcvno;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMNAME: {varchar(100)} */
    @JsonKey
    protected String _itemname;

    /** ZONE: {varchar(60)} */
    @JsonKey
    protected String _zone;

    /** EXPECTQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _expectqty;

    /** RCVPAL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvpal;

    /** RCVCASE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvcase;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** QTYCASE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtybowl;

    /** QTYPAL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtypal;

    /** INOUTKBN: {varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

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
    public BsWWkreceiveplanDto() {
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
        if (other == null || !(other instanceof BsWWkreceiveplanDto)) { return false; }
        final BsWWkreceiveplanDto otherEntity = (BsWWkreceiveplanDto)other;
        if (!helpComparingValue(getWWkreceiveplanId(), otherEntity.getWWkreceiveplanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKRECEIVEPLAN");
        result = xCH(result, getWWkreceiveplanId());
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
        sb.append(c).append(getWWkreceiveplanId());
        sb.append(c).append(getPrintkey());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getWarehouseSname());
        sb.append(c).append(getSlotlocname());
        sb.append(c).append(getRcvschdate());
        sb.append(c).append(getReceiveLot4());
        sb.append(c).append(getReceiveLot3());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getCaseqtyCapacity());
        sb.append(c).append(getFloor());
        sb.append(c).append(getFromfax());
        sb.append(c).append(getFromphone());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemname());
        sb.append(c).append(getZone());
        sb.append(c).append(getExpectqty());
        sb.append(c).append(getRcvpal());
        sb.append(c).append(getRcvcase());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot3());
        sb.append(c).append(getQtycase());
        sb.append(c).append(getQtybowl());
        sb.append(c).append(getQtypal());
        sb.append(c).append(getInoutkbn());
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
     * [get] W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)} <br>
     * 格納先予定リスト情報ID
     * @return The value of the column 'W_WKRECEIVEPLAN_ID'. (NullAllowed)
     */
    public Long getWWkreceiveplanId() {
        return _wWkreceiveplanId;
    }

    /**
     * [set] W_WKRECEIVEPLAN_ID: {PK, NotNull, bigint(19)} <br>
     * 格納先予定リスト情報ID
     * @param wWkreceiveplanId The value of the column 'W_WKRECEIVEPLAN_ID'. (NullAllowed)
     */
    public void setWWkreceiveplanId(Long wWkreceiveplanId) {
        __modifiedProperties.add("WWkreceiveplanId");
        this._wWkreceiveplanId = wWkreceiveplanId;
    }

    /**
     * [get] PRINTKEY: {NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPrintkey() {
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public void setPrintkey(java.math.BigDecimal printkey) {
        __modifiedProperties.add("printkey");
        this._printkey = printkey;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 格納先予定リスト明細No.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 格納先予定リスト明細No.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RCVLINENO: {decimal(16, 6)} <br>
     * 入庫行No.
     * @return The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvlineno() {
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {decimal(16, 6)} <br>
     * 入庫行No.
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed)
     */
    public void setRcvlineno(java.math.BigDecimal rcvlineno) {
        __modifiedProperties.add("rcvlineno");
        this._rcvlineno = rcvlineno;
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
     * [get] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public String getWarehouseSname() {
        return _warehouseSname;
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public void setWarehouseSname(String warehouseSname) {
        __modifiedProperties.add("warehouseSname");
        this._warehouseSname = warehouseSname;
    }

    /**
     * [get] SLOTLOCNAME: {varchar(255)} <br>
     * 入庫予定ロケーション
     * @return The value of the column 'SLOTLOCNAME'. (NullAllowed)
     */
    public String getSlotlocname() {
        return _slotlocname;
    }

    /**
     * [set] SLOTLOCNAME: {varchar(255)} <br>
     * 入庫予定ロケーション
     * @param slotlocname The value of the column 'SLOTLOCNAME'. (NullAllowed)
     */
    public void setSlotlocname(String slotlocname) {
        __modifiedProperties.add("slotlocname");
        this._slotlocname = slotlocname;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日・時刻
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public String getRcvschdate() {
        return _rcvschdate;
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日・時刻
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed)
     */
    public void setRcvschdate(String rcvschdate) {
        __modifiedProperties.add("rcvschdate");
        this._rcvschdate = rcvschdate;
    }

    /**
     * [get] RECEIVE_LOT4: {varchar(8)} <br>
     * 入庫予定製造年月日
     * @return The value of the column 'RECEIVE_LOT4'. (NullAllowed)
     */
    public String getReceiveLot4() {
        return _receiveLot4;
    }

    /**
     * [set] RECEIVE_LOT4: {varchar(8)} <br>
     * 入庫予定製造年月日
     * @param receiveLot4 The value of the column 'RECEIVE_LOT4'. (NullAllowed)
     */
    public void setReceiveLot4(String receiveLot4) {
        __modifiedProperties.add("receiveLot4");
        this._receiveLot4 = receiveLot4;
    }

    /**
     * [get] RECEIVE_LOT3: {varchar(60)} <br>
     * 入庫予定デザイン区分
     * @return The value of the column 'RECEIVE_LOT3'. (NullAllowed)
     */
    public String getReceiveLot3() {
        return _receiveLot3;
    }

    /**
     * [set] RECEIVE_LOT3: {varchar(60)} <br>
     * 入庫予定デザイン区分
     * @param receiveLot3 The value of the column 'RECEIVE_LOT3'. (NullAllowed)
     */
    public void setReceiveLot3(String receiveLot3) {
        __modifiedProperties.add("receiveLot3");
        this._receiveLot3 = receiveLot3;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] CASEQTY_CAPACITY: {bigint(19)} <br>
     * 許容ケース数
     * @return The value of the column 'CASEQTY_CAPACITY'. (NullAllowed)
     */
    public Long getCaseqtyCapacity() {
        return _caseqtyCapacity;
    }

    /**
     * [set] CASEQTY_CAPACITY: {bigint(19)} <br>
     * 許容ケース数
     * @param caseqtyCapacity The value of the column 'CASEQTY_CAPACITY'. (NullAllowed)
     */
    public void setCaseqtyCapacity(Long caseqtyCapacity) {
        __modifiedProperties.add("caseqtyCapacity");
        this._caseqtyCapacity = caseqtyCapacity;
    }

    /**
     * [get] FLOOR: {varchar(60)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {varchar(60)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] FROMFAX: {varchar(60)} <br>
     * ラインNO
     * @return The value of the column 'FROMFAX'. (NullAllowed)
     */
    public String getFromfax() {
        return _fromfax;
    }

    /**
     * [set] FROMFAX: {varchar(60)} <br>
     * ラインNO
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed)
     */
    public void setFromfax(String fromfax) {
        __modifiedProperties.add("fromfax");
        this._fromfax = fromfax;
    }

    /**
     * [get] FROMPHONE: {varchar(60)} <br>
     * 搬入順
     * @return The value of the column 'FROMPHONE'. (NullAllowed)
     */
    public String getFromphone() {
        return _fromphone;
    }

    /**
     * [set] FROMPHONE: {varchar(60)} <br>
     * 搬入順
     * @param fromphone The value of the column 'FROMPHONE'. (NullAllowed)
     */
    public void setFromphone(String fromphone) {
        __modifiedProperties.add("fromphone");
        this._fromphone = fromphone;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 整理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
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
     * [get] ZONE: {varchar(60)} <br>
     * ゾーン
     * @return The value of the column 'ZONE'. (NullAllowed)
     */
    public String getZone() {
        return _zone;
    }

    /**
     * [set] ZONE: {varchar(60)} <br>
     * ゾーン
     * @param zone The value of the column 'ZONE'. (NullAllowed)
     */
    public void setZone(String zone) {
        __modifiedProperties.add("zone");
        this._zone = zone;
    }

    /**
     * [get] EXPECTQTY: {decimal(16, 6)} <br>
     * 格納予定数量（バラ）
     * @return The value of the column 'EXPECTQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty() {
        return _expectqty;
    }

    /**
     * [set] EXPECTQTY: {decimal(16, 6)} <br>
     * 格納予定数量（バラ）
     * @param expectqty The value of the column 'EXPECTQTY'. (NullAllowed)
     */
    public void setExpectqty(java.math.BigDecimal expectqty) {
        __modifiedProperties.add("expectqty");
        this._expectqty = expectqty;
    }

    /**
     * [get] RCVPAL: {decimal(16, 6)} <br>
     * 格納予定数量（パレット）
     * @return The value of the column 'RCVPAL'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvpal() {
        return _rcvpal;
    }

    /**
     * [set] RCVPAL: {decimal(16, 6)} <br>
     * 格納予定数量（パレット）
     * @param rcvpal The value of the column 'RCVPAL'. (NullAllowed)
     */
    public void setRcvpal(java.math.BigDecimal rcvpal) {
        __modifiedProperties.add("rcvpal");
        this._rcvpal = rcvpal;
    }

    /**
     * [get] RCVCASE: {decimal(16, 6)} <br>
     * 格納予定数量（ケース）
     * @return The value of the column 'RCVCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvcase() {
        return _rcvcase;
    }

    /**
     * [set] RCVCASE: {decimal(16, 6)} <br>
     * 格納予定数量（ケース）
     * @param rcvcase The value of the column 'RCVCASE'. (NullAllowed)
     */
    public void setRcvcase(java.math.BigDecimal rcvcase) {
        __modifiedProperties.add("rcvcase");
        this._rcvcase = rcvcase;
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
     * [get] QTYCASE: {decimal(16, 6)} <br>
     * 在庫ケース数
     * @return The value of the column 'QTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getQtycase() {
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {decimal(16, 6)} <br>
     * 在庫ケース数
     * @param qtycase The value of the column 'QTYCASE'. (NullAllowed)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        __modifiedProperties.add("qtycase");
        this._qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {decimal(16, 6)} <br>
     * 在庫カートン数
     * @return The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getQtybowl() {
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {decimal(16, 6)} <br>
     * 在庫カートン数
     * @param qtybowl The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        __modifiedProperties.add("qtybowl");
        this._qtybowl = qtybowl;
    }

    /**
     * [get] QTYPAL: {decimal(16, 6)} <br>
     * 在庫パレット数
     * @return The value of the column 'QTYPAL'. (NullAllowed)
     */
    public java.math.BigDecimal getQtypal() {
        return _qtypal;
    }

    /**
     * [set] QTYPAL: {decimal(16, 6)} <br>
     * 在庫パレット数
     * @param qtypal The value of the column 'QTYPAL'. (NullAllowed)
     */
    public void setQtypal(java.math.BigDecimal qtypal) {
        __modifiedProperties.add("qtypal");
        this._qtypal = qtypal;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * 内外区分
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
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
