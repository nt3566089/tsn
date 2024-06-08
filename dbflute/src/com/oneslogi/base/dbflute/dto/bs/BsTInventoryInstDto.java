package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_INVENTORY_INST as TABLE. <br>
 * 棚卸指示
 * <pre>
 * [primary-key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, INVENTORY_H_ID, DEPOSIT_ID, STOCK_TYPE_ID, FROM_LOCATION_CD, TO_LOCATION_CD, ZONE_ID, FROM_STOCK_INOUT_DT, TO_STOCK_INOUT_DT, STOCK_EXIST_ONLY_FLG, INVENTORY_INST_KBN, LINE_BLOCK, DIRECTIONAL_PISTON, SORTING_ORDER, SORTING_NUM_TIMES, LOCATION_CD, PRODUCT_CD, PRODUCT_DIVISION, LOCATION_GRP, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_STOCK_TYPE, M_ZONE, T_INVENTORY_H, M_CUSTOMER, B_CLASS_DTL(ByStockExistOnlyFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mStockType, mZone, tInventoryH, mCustomer, bClassDtlByStockExistOnlyFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTInventoryInstDto implements Serializable {

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
    /** INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _inventoryInstId;

    /** INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} */
    @JsonKey
    protected Long _inventoryHId;

    /** DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _depositId;

    /** STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    @JsonKey
    protected Long _stockTypeId;

    /** FROM_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _fromLocationCd;

    /** TO_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _toLocationCd;

    /** ZONE_ID: {IX, bigint(19), FK to M_ZONE} */
    @JsonKey
    protected Long _zoneId;

    /** FROM_STOCK_INOUT_DT: {varchar(8)} */
    @JsonKey
    protected String _fromStockInoutDt;

    /** TO_STOCK_INOUT_DT: {varchar(8)} */
    @JsonKey
    protected String _toStockInoutDt;

    /** STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} */
    @JsonKey
    protected String _stockExistOnlyFlg;

    /** INVENTORY_INST_KBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inventoryInstKbn;

    /** LINE_BLOCK: {varchar(30)} */
    @JsonKey
    protected String _lineBlock;

    /** DIRECTIONAL_PISTON: {varchar(255)} */
    @JsonKey
    protected String _directionalPiston;

    /** SORTING_ORDER: {varchar(255)} */
    @JsonKey
    protected String _sortingOrder;

    /** SORTING_NUM_TIMES: {bigint(19)} */
    @JsonKey
    protected Long _sortingNumTimes;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_DIVISION: {varchar(30)} */
    @JsonKey
    protected String _productDivision;

    /** LOCATION_GRP: {varchar(30)} */
    @JsonKey
    protected String _locationGrp;

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
    public BsTInventoryInstDto() {
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
    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected MZoneDto _mZone;

    public MZoneDto getMZone() {
        return _mZone;
    }

    public void setMZone(MZoneDto mZone) {
        this._mZone = mZone;
    }

    protected TInventoryHDto _tInventoryH;

    public TInventoryHDto getTInventoryH() {
        return _tInventoryH;
    }

    public void setTInventoryH(TInventoryHDto tInventoryH) {
        this._tInventoryH = tInventoryH;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected BClassDtlDto _bClassDtlByStockExistOnlyFlg;

    public BClassDtlDto getBClassDtlByStockExistOnlyFlg() {
        return _bClassDtlByStockExistOnlyFlg;
    }

    public void setBClassDtlByStockExistOnlyFlg(BClassDtlDto bClassDtlByStockExistOnlyFlg) {
        this._bClassDtlByStockExistOnlyFlg = bClassDtlByStockExistOnlyFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTInventoryInstDto)) { return false; }
        final BsTInventoryInstDto otherEntity = (BsTInventoryInstDto)other;
        if (!helpComparingValue(getInventoryInstId(), otherEntity.getInventoryInstId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_INVENTORY_INST");
        result = xCH(result, getInventoryInstId());
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
        sb.append(c).append(getInventoryInstId());
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getFromLocationCd());
        sb.append(c).append(getToLocationCd());
        sb.append(c).append(getZoneId());
        sb.append(c).append(getFromStockInoutDt());
        sb.append(c).append(getToStockInoutDt());
        sb.append(c).append(getStockExistOnlyFlg());
        sb.append(c).append(getInventoryInstKbn());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getDirectionalPiston());
        sb.append(c).append(getSortingOrder());
        sb.append(c).append(getSortingNumTimes());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductDivision());
        sb.append(c).append(getLocationGrp());
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
     * [get] INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸指示ID
     * @return The value of the column 'INVENTORY_INST_ID'. (NullAllowed)
     */
    public Long getInventoryInstId() {
        return _inventoryInstId;
    }

    /**
     * [set] INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸指示ID
     * @param inventoryInstId The value of the column 'INVENTORY_INST_ID'. (NullAllowed)
     */
    public void setInventoryInstId(Long inventoryInstId) {
        __modifiedProperties.add("inventoryInstId");
        this._inventoryInstId = inventoryInstId;
    }

    /**
     * [get] INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] FROM_LOCATION_CD: {varchar(30)} <br>
     * FROMロケーションCD
     * @return The value of the column 'FROM_LOCATION_CD'. (NullAllowed)
     */
    public String getFromLocationCd() {
        return _fromLocationCd;
    }

    /**
     * [set] FROM_LOCATION_CD: {varchar(30)} <br>
     * FROMロケーションCD
     * @param fromLocationCd The value of the column 'FROM_LOCATION_CD'. (NullAllowed)
     */
    public void setFromLocationCd(String fromLocationCd) {
        __modifiedProperties.add("fromLocationCd");
        this._fromLocationCd = fromLocationCd;
    }

    /**
     * [get] TO_LOCATION_CD: {varchar(30)} <br>
     * TOロケーションCD
     * @return The value of the column 'TO_LOCATION_CD'. (NullAllowed)
     */
    public String getToLocationCd() {
        return _toLocationCd;
    }

    /**
     * [set] TO_LOCATION_CD: {varchar(30)} <br>
     * TOロケーションCD
     * @param toLocationCd The value of the column 'TO_LOCATION_CD'. (NullAllowed)
     */
    public void setToLocationCd(String toLocationCd) {
        __modifiedProperties.add("toLocationCd");
        this._toLocationCd = toLocationCd;
    }

    /**
     * [get] ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public Long getZoneId() {
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public void setZoneId(Long zoneId) {
        __modifiedProperties.add("zoneId");
        this._zoneId = zoneId;
    }

    /**
     * [get] FROM_STOCK_INOUT_DT: {varchar(8)} <br>
     * FROM受払日
     * @return The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed)
     */
    public String getFromStockInoutDt() {
        return _fromStockInoutDt;
    }

    /**
     * [set] FROM_STOCK_INOUT_DT: {varchar(8)} <br>
     * FROM受払日
     * @param fromStockInoutDt The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed)
     */
    public void setFromStockInoutDt(String fromStockInoutDt) {
        __modifiedProperties.add("fromStockInoutDt");
        this._fromStockInoutDt = fromStockInoutDt;
    }

    /**
     * [get] TO_STOCK_INOUT_DT: {varchar(8)} <br>
     * TO受払日
     * @return The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed)
     */
    public String getToStockInoutDt() {
        return _toStockInoutDt;
    }

    /**
     * [set] TO_STOCK_INOUT_DT: {varchar(8)} <br>
     * TO受払日
     * @param toStockInoutDt The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed)
     */
    public void setToStockInoutDt(String toStockInoutDt) {
        __modifiedProperties.add("toStockInoutDt");
        this._toStockInoutDt = toStockInoutDt;
    }

    /**
     * [get] STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @return The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed)
     */
    public String getStockExistOnlyFlg() {
        return _stockExistOnlyFlg;
    }

    /**
     * [set] STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param stockExistOnlyFlg The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed)
     */
    public void setStockExistOnlyFlg(String stockExistOnlyFlg) {
        __modifiedProperties.add("stockExistOnlyFlg");
        this._stockExistOnlyFlg = stockExistOnlyFlg;
    }

    /**
     * [get] INVENTORY_INST_KBN: {NotNull, varchar(30)} <br>
     * 在庫調査区分
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public String getInventoryInstKbn() {
        return _inventoryInstKbn;
    }

    /**
     * [set] INVENTORY_INST_KBN: {NotNull, varchar(30)} <br>
     * 在庫調査区分
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        __modifiedProperties.add("inventoryInstKbn");
        this._inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * ライン/ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * 方面ピストン
     * @return The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed)
     */
    public String getDirectionalPiston() {
        return _directionalPiston;
    }

    /**
     * [set] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * 方面ピストン
     * @param directionalPiston The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed)
     */
    public void setDirectionalPiston(String directionalPiston) {
        __modifiedProperties.add("directionalPiston");
        this._directionalPiston = directionalPiston;
    }

    /**
     * [get] SORTING_ORDER: {varchar(255)} <br>
     * 仕分順
     * @return The value of the column 'SORTING_ORDER'. (NullAllowed)
     */
    public String getSortingOrder() {
        return _sortingOrder;
    }

    /**
     * [set] SORTING_ORDER: {varchar(255)} <br>
     * 仕分順
     * @param sortingOrder The value of the column 'SORTING_ORDER'. (NullAllowed)
     */
    public void setSortingOrder(String sortingOrder) {
        __modifiedProperties.add("sortingOrder");
        this._sortingOrder = sortingOrder;
    }

    /**
     * [get] SORTING_NUM_TIMES: {bigint(19)} <br>
     * 仕分回数
     * @return The value of the column 'SORTING_NUM_TIMES'. (NullAllowed)
     */
    public Long getSortingNumTimes() {
        return _sortingNumTimes;
    }

    /**
     * [set] SORTING_NUM_TIMES: {bigint(19)} <br>
     * 仕分回数
     * @param sortingNumTimes The value of the column 'SORTING_NUM_TIMES'. (NullAllowed)
     */
    public void setSortingNumTimes(Long sortingNumTimes) {
        __modifiedProperties.add("sortingNumTimes");
        this._sortingNumTimes = sortingNumTimes;
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
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_DIVISION: {varchar(30)} <br>
     * 銘柄区分
     * @return The value of the column 'PRODUCT_DIVISION'. (NullAllowed)
     */
    public String getProductDivision() {
        return _productDivision;
    }

    /**
     * [set] PRODUCT_DIVISION: {varchar(30)} <br>
     * 銘柄区分
     * @param productDivision The value of the column 'PRODUCT_DIVISION'. (NullAllowed)
     */
    public void setProductDivision(String productDivision) {
        __modifiedProperties.add("productDivision");
        this._productDivision = productDivision;
    }

    /**
     * [get] LOCATION_GRP: {varchar(30)} <br>
     * ロケーショングループ
     * @return The value of the column 'LOCATION_GRP'. (NullAllowed)
     */
    public String getLocationGrp() {
        return _locationGrp;
    }

    /**
     * [set] LOCATION_GRP: {varchar(30)} <br>
     * ロケーショングループ
     * @param locationGrp The value of the column 'LOCATION_GRP'. (NullAllowed)
     */
    public void setLocationGrp(String locationGrp) {
        __modifiedProperties.add("locationGrp");
        this._locationGrp = locationGrp;
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
