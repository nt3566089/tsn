package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKFLEXPICK as TABLE. <br>
 * 融通山出しリスト作業用ワーク
 * <pre>
 * [primary-key]
 *     ZIP_INPUT_ID
 *
 * [column]
 *     ZIP_INPUT_ID, PrintKey, FlexibityNo, FlexPickListNo, FlexPickListLNo, WarehouseCd, WarehouseName, ShipCd, Ship_Name, SchDate, TransportCd, PRODUCT_CD, Item_Name, ManufacturDate, DesignCd, QtyCase, QtyBowl, RootOutSeq, UserNum1, UserNum3, VA_ExtData1, VA_ExtData2, VA_ExtData3, NV_ExtData1, NV_ExtData2, NV_ExtData3, NM_ExtData1, NM_ExtData2, NM_ExtData3, DT_ExtData1, DT_ExtData2, DT_ExtData3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_INPUT_ID
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
public abstract class BsWWkflexpickDto implements Serializable {

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
    /** ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _zipInputId;

    /** PrintKey: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _printkey;

    /** FlexibityNo: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _flexibityno;

    /** FlexPickListNo: {NotNull, varchar(30)} */
    @JsonKey
    protected String _flexpicklistno;

    /** FlexPickListLNo: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _flexpicklistlno;

    /** WarehouseCd: {varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** WarehouseName: {varchar(100)} */
    @JsonKey
    protected String _warehousename;

    /** ShipCd: {varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** Ship_Name: {varchar(100)} */
    @JsonKey
    protected String _shipName;

    /** SchDate: {varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** TransportCd: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** Item_Name: {varchar(100)} */
    @JsonKey
    protected String _itemName;

    /** ManufacturDate: {varchar(8)} */
    @JsonKey
    protected String _manufacturdate;

    /** DesignCd: {varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** QtyCase: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtycase;

    /** QtyBowl: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtybowl;

    /** RootOutSeq: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rootoutseq;

    /** UserNum1: {bigint(19)} */
    @JsonKey
    protected Long _usernum1;

    /** UserNum3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** VA_ExtData1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VA_ExtData2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** VA_ExtData3: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata3;

    /** NV_ExtData1: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata1;

    /** NV_ExtData2: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata2;

    /** NV_ExtData3: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata3;

    /** NM_ExtData1: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata1;

    /** NM_ExtData2: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata2;

    /** NM_ExtData3: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata3;

    /** DT_ExtData1: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata1;

    /** DT_ExtData2: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata2;

    /** DT_ExtData3: {varchar(8)} */
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
    public BsWWkflexpickDto() {
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
        if (other == null || !(other instanceof BsWWkflexpickDto)) { return false; }
        final BsWWkflexpickDto otherEntity = (BsWWkflexpickDto)other;
        if (!helpComparingValue(getZipInputId(), otherEntity.getZipInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKFLEXPICK");
        result = xCH(result, getZipInputId());
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
        sb.append(c).append(getZipInputId());
        sb.append(c).append(getPrintkey());
        sb.append(c).append(getFlexibityno());
        sb.append(c).append(getFlexpicklistno());
        sb.append(c).append(getFlexpicklistlno());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getWarehousename());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getShipName());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemName());
        sb.append(c).append(getManufacturdate());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getQtycase());
        sb.append(c).append(getQtybowl());
        sb.append(c).append(getRootoutseq());
        sb.append(c).append(getUsernum1());
        sb.append(c).append(getUsernum3());
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
     * [get] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通山出しリスト作業用ワークID
     * @return The value of the column 'ZIP_INPUT_ID'. (NullAllowed)
     */
    public Long getZipInputId() {
        return _zipInputId;
    }

    /**
     * [set] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通山出しリスト作業用ワークID
     * @param zipInputId The value of the column 'ZIP_INPUT_ID'. (NullAllowed)
     */
    public void setZipInputId(Long zipInputId) {
        __modifiedProperties.add("zipInputId");
        this._zipInputId = zipInputId;
    }

    /**
     * [get] PrintKey: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @return The value of the column 'PrintKey'. (NullAllowed)
     */
    public Long getPrintkey() {
        return _printkey;
    }

    /**
     * [set] PrintKey: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PrintKey'. (NullAllowed)
     */
    public void setPrintkey(Long printkey) {
        __modifiedProperties.add("printkey");
        this._printkey = printkey;
    }

    /**
     * [get] FlexibityNo: {NotNull, decimal(16, 6)} <br>
     * 融通No
     * @return The value of the column 'FlexibityNo'. (NullAllowed)
     */
    public java.math.BigDecimal getFlexibityno() {
        return _flexibityno;
    }

    /**
     * [set] FlexibityNo: {NotNull, decimal(16, 6)} <br>
     * 融通No
     * @param flexibityno The value of the column 'FlexibityNo'. (NullAllowed)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        __modifiedProperties.add("flexibityno");
        this._flexibityno = flexibityno;
    }

    /**
     * [get] FlexPickListNo: {NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @return The value of the column 'FlexPickListNo'. (NullAllowed)
     */
    public String getFlexpicklistno() {
        return _flexpicklistno;
    }

    /**
     * [set] FlexPickListNo: {NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @param flexpicklistno The value of the column 'FlexPickListNo'. (NullAllowed)
     */
    public void setFlexpicklistno(String flexpicklistno) {
        __modifiedProperties.add("flexpicklistno");
        this._flexpicklistno = flexpicklistno;
    }

    /**
     * [get] FlexPickListLNo: {NotNull, decimal(16, 6)} <br>
     * 融通山出しリスト行No.
     * @return The value of the column 'FlexPickListLNo'. (NullAllowed)
     */
    public java.math.BigDecimal getFlexpicklistlno() {
        return _flexpicklistlno;
    }

    /**
     * [set] FlexPickListLNo: {NotNull, decimal(16, 6)} <br>
     * 融通山出しリスト行No.
     * @param flexpicklistlno The value of the column 'FlexPickListLNo'. (NullAllowed)
     */
    public void setFlexpicklistlno(java.math.BigDecimal flexpicklistlno) {
        __modifiedProperties.add("flexpicklistlno");
        this._flexpicklistlno = flexpicklistlno;
    }

    /**
     * [get] WarehouseCd: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WarehouseCd'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WarehouseCd: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WarehouseCd'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] WarehouseName: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WarehouseName'. (NullAllowed)
     */
    public String getWarehousename() {
        return _warehousename;
    }

    /**
     * [set] WarehouseName: {varchar(100)} <br>
     * 拠点名称
     * @param warehousename The value of the column 'WarehouseName'. (NullAllowed)
     */
    public void setWarehousename(String warehousename) {
        __modifiedProperties.add("warehousename");
        this._warehousename = warehousename;
    }

    /**
     * [get] ShipCd: {varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'ShipCd'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] ShipCd: {varchar(30)} <br>
     * 発送先CD
     * @param shipcd The value of the column 'ShipCd'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] Ship_Name: {varchar(100)} <br>
     * 発送先名称
     * @return The value of the column 'Ship_Name'. (NullAllowed)
     */
    public String getShipName() {
        return _shipName;
    }

    /**
     * [set] Ship_Name: {varchar(100)} <br>
     * 発送先名称
     * @param shipName The value of the column 'Ship_Name'. (NullAllowed)
     */
    public void setShipName(String shipName) {
        __modifiedProperties.add("shipName");
        this._shipName = shipName;
    }

    /**
     * [get] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SchDate'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SchDate'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] TransportCd: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TransportCd'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TransportCd: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TransportCd'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
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
     * [get] Item_Name: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'Item_Name'. (NullAllowed)
     */
    public String getItemName() {
        return _itemName;
    }

    /**
     * [set] Item_Name: {varchar(100)} <br>
     * 銘柄名称
     * @param itemName The value of the column 'Item_Name'. (NullAllowed)
     */
    public void setItemName(String itemName) {
        __modifiedProperties.add("itemName");
        this._itemName = itemName;
    }

    /**
     * [get] ManufacturDate: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'ManufacturDate'. (NullAllowed)
     */
    public String getManufacturdate() {
        return _manufacturdate;
    }

    /**
     * [set] ManufacturDate: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturdate The value of the column 'ManufacturDate'. (NullAllowed)
     */
    public void setManufacturdate(String manufacturdate) {
        __modifiedProperties.add("manufacturdate");
        this._manufacturdate = manufacturdate;
    }

    /**
     * [get] DesignCd: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DesignCd'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DesignCd: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DesignCd'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] QtyCase: {decimal(16, 6)} <br>
     * 数量（ケース）
     * @return The value of the column 'QtyCase'. (NullAllowed)
     */
    public java.math.BigDecimal getQtycase() {
        return _qtycase;
    }

    /**
     * [set] QtyCase: {decimal(16, 6)} <br>
     * 数量（ケース）
     * @param qtycase The value of the column 'QtyCase'. (NullAllowed)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        __modifiedProperties.add("qtycase");
        this._qtycase = qtycase;
    }

    /**
     * [get] QtyBowl: {decimal(16, 6)} <br>
     * 数量（カートン）
     * @return The value of the column 'QtyBowl'. (NullAllowed)
     */
    public java.math.BigDecimal getQtybowl() {
        return _qtybowl;
    }

    /**
     * [set] QtyBowl: {decimal(16, 6)} <br>
     * 数量（カートン）
     * @param qtybowl The value of the column 'QtyBowl'. (NullAllowed)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        __modifiedProperties.add("qtybowl");
        this._qtybowl = qtybowl;
    }

    /**
     * [get] RootOutSeq: {decimal(16, 6)} <br>
     * 出庫ルート順
     * @return The value of the column 'RootOutSeq'. (NullAllowed)
     */
    public java.math.BigDecimal getRootoutseq() {
        return _rootoutseq;
    }

    /**
     * [set] RootOutSeq: {decimal(16, 6)} <br>
     * 出庫ルート順
     * @param rootoutseq The value of the column 'RootOutSeq'. (NullAllowed)
     */
    public void setRootoutseq(java.math.BigDecimal rootoutseq) {
        __modifiedProperties.add("rootoutseq");
        this._rootoutseq = rootoutseq;
    }

    /**
     * [get] UserNum1: {bigint(19)} <br>
     * 使用区分
     * @return The value of the column 'UserNum1'. (NullAllowed)
     */
    public Long getUsernum1() {
        return _usernum1;
    }

    /**
     * [set] UserNum1: {bigint(19)} <br>
     * 使用区分
     * @param usernum1 The value of the column 'UserNum1'. (NullAllowed)
     */
    public void setUsernum1(Long usernum1) {
        __modifiedProperties.add("usernum1");
        this._usernum1 = usernum1;
    }

    /**
     * [get] UserNum3: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'UserNum3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] UserNum3: {bigint(19)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'UserNum3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

    /**
     * [get] VA_ExtData1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_ExtData1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_ExtData1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_ExtData1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_ExtData2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_ExtData2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_ExtData2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_ExtData2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_ExtData3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_ExtData3'. (NullAllowed)
     */
    public String getVaExtdata3() {
        return _vaExtdata3;
    }

    /**
     * [set] VA_ExtData3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_ExtData3'. (NullAllowed)
     */
    public void setVaExtdata3(String vaExtdata3) {
        __modifiedProperties.add("vaExtdata3");
        this._vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_ExtData1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_ExtData1'. (NullAllowed)
     */
    public String getNvExtdata1() {
        return _nvExtdata1;
    }

    /**
     * [set] NV_ExtData1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_ExtData1'. (NullAllowed)
     */
    public void setNvExtdata1(String nvExtdata1) {
        __modifiedProperties.add("nvExtdata1");
        this._nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_ExtData2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_ExtData2'. (NullAllowed)
     */
    public String getNvExtdata2() {
        return _nvExtdata2;
    }

    /**
     * [set] NV_ExtData2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_ExtData2'. (NullAllowed)
     */
    public void setNvExtdata2(String nvExtdata2) {
        __modifiedProperties.add("nvExtdata2");
        this._nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_ExtData3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_ExtData3'. (NullAllowed)
     */
    public String getNvExtdata3() {
        return _nvExtdata3;
    }

    /**
     * [set] NV_ExtData3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_ExtData3'. (NullAllowed)
     */
    public void setNvExtdata3(String nvExtdata3) {
        __modifiedProperties.add("nvExtdata3");
        this._nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_ExtData1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_ExtData1'. (NullAllowed)
     */
    public Long getNmExtdata1() {
        return _nmExtdata1;
    }

    /**
     * [set] NM_ExtData1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_ExtData1'. (NullAllowed)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        __modifiedProperties.add("nmExtdata1");
        this._nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_ExtData2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_ExtData2'. (NullAllowed)
     */
    public Long getNmExtdata2() {
        return _nmExtdata2;
    }

    /**
     * [set] NM_ExtData2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_ExtData2'. (NullAllowed)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        __modifiedProperties.add("nmExtdata2");
        this._nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_ExtData3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_ExtData3'. (NullAllowed)
     */
    public Long getNmExtdata3() {
        return _nmExtdata3;
    }

    /**
     * [set] NM_ExtData3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_ExtData3'. (NullAllowed)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        __modifiedProperties.add("nmExtdata3");
        this._nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_ExtData1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_ExtData1'. (NullAllowed)
     */
    public String getDtExtdata1() {
        return _dtExtdata1;
    }

    /**
     * [set] DT_ExtData1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_ExtData1'. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        __modifiedProperties.add("dtExtdata1");
        this._dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_ExtData2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_ExtData2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_ExtData2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_ExtData2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_ExtData3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_ExtData3'. (NullAllowed)
     */
    public String getDtExtdata3() {
        return _dtExtdata3;
    }

    /**
     * [set] DT_ExtData3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_ExtData3'. (NullAllowed)
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
