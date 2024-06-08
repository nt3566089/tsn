package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, VERSION_NO, INVENTORY_INST_KBN, LOCATION_GRP, CGGDID, INSTRUCTION_KEY, INVENTORY_DT, ADD_DT, LINE_BLOCK, DIRECTIONAL_PISTON, SORTING_ORDER, SORTING_NUM_TIMES, LOCATION_CD, PRODUCT_CD, JAN_CD, PRODUCT_NM, FIRM_TRANSPORT_CD, UNIT_NUM_BREAKDOWN, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_BEFORE_BREAKDOWN, INVENTORY_NUM, INVENTORY_NUM_OLD, INVENTORY_ITEMS, DIFFERENCE_NUM, DIFFERENCE_ITEMS, NO_SHIPPING_FLG, UPD_DT, CENTER_CD, CENTER_NM, P_QTY, UNIT1, UNIT2, USERNUM4, INVENTORY_PARCENT, INVENTORY_INPUT_FLG
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
public abstract class BsSqlInventoryInputListDto implements Serializable {

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
    /** INVENTORY_B_ID: {bigint(19)} */
    @JsonKey
    protected Long _inventoryBId;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** INVENTORY_INST_KBN: {varchar(100)} */
    @JsonKey
    protected String _inventoryInstKbn;

    /** LOCATION_GRP: {varchar(100)} */
    @JsonKey
    protected String _locationGrp;

    /** CGGDID: {varchar(100)} */
    @JsonKey
    protected String _cggdid;

    /** INSTRUCTION_KEY: {bigint(19)} */
    @JsonKey
    protected Long _instructionKey;

    /** INVENTORY_DT: {varchar(8)} */
    @JsonKey
    protected String _inventoryDt;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

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

    /** JAN_CD: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** FIRM_TRANSPORT_CD: {varchar(30)} */
    @JsonKey
    protected String _firmTransportCd;

    /** UNIT_NUM_BREAKDOWN: {varchar(1)} */
    @JsonKey
    protected String _unitNumBreakdown;

    /** CHARGE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _moveNum;

    /** INVENTORY_BEFORE_BREAKDOWN: {varchar(1)} */
    @JsonKey
    protected String _inventoryBeforeBreakdown;

    /** INVENTORY_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** INVENTORY_NUM_OLD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNumOld;

    /** INVENTORY_ITEMS: {varchar(1)} */
    @JsonKey
    protected String _inventoryItems;

    /** DIFFERENCE_NUM: {varchar(1)} */
    @JsonKey
    protected String _differenceNum;

    /** DIFFERENCE_ITEMS: {varchar(1)} */
    @JsonKey
    protected String _differenceItems;

    /** NO_SHIPPING_FLG: {char(1)} */
    @JsonKey
    protected String _noShippingFlg;

    /** UPD_DT: {nvarchar(4000)} */
    @JsonKey
    protected String _updDt;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** P_QTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pQty;

    /** UNIT1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit2;

    /** USERNUM4: {bigint(19)} */
    @JsonKey
    protected Long _usernum4;

    /** INVENTORY_PARCENT: {int(10)} */
    @JsonKey
    protected Integer _inventoryParcent;

    /** INVENTORY_INPUT_FLG: {char(1)} */
    @JsonKey
    protected String _inventoryInputFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryInputListDto() {
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
        if (other == null || !(other instanceof BsSqlInventoryInputListDto)) { return false; }
        final BsSqlInventoryInputListDto otherEntity = (BsSqlInventoryInputListDto)other;
        if (!helpComparingValue(getInventoryBId(), otherEntity.getInventoryBId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getInventoryInstKbn(), otherEntity.getInventoryInstKbn())) { return false; }
        if (!helpComparingValue(getLocationGrp(), otherEntity.getLocationGrp())) { return false; }
        if (!helpComparingValue(getCggdid(), otherEntity.getCggdid())) { return false; }
        if (!helpComparingValue(getInstructionKey(), otherEntity.getInstructionKey())) { return false; }
        if (!helpComparingValue(getInventoryDt(), otherEntity.getInventoryDt())) { return false; }
        if (!helpComparingValue(getAddDt(), otherEntity.getAddDt())) { return false; }
        if (!helpComparingValue(getLineBlock(), otherEntity.getLineBlock())) { return false; }
        if (!helpComparingValue(getDirectionalPiston(), otherEntity.getDirectionalPiston())) { return false; }
        if (!helpComparingValue(getSortingOrder(), otherEntity.getSortingOrder())) { return false; }
        if (!helpComparingValue(getSortingNumTimes(), otherEntity.getSortingNumTimes())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getFirmTransportCd(), otherEntity.getFirmTransportCd())) { return false; }
        if (!helpComparingValue(getUnitNumBreakdown(), otherEntity.getUnitNumBreakdown())) { return false; }
        if (!helpComparingValue(getChargeNum(), otherEntity.getChargeNum())) { return false; }
        if (!helpComparingValue(getAllocNum(), otherEntity.getAllocNum())) { return false; }
        if (!helpComparingValue(getMoveNum(), otherEntity.getMoveNum())) { return false; }
        if (!helpComparingValue(getInventoryBeforeBreakdown(), otherEntity.getInventoryBeforeBreakdown())) { return false; }
        if (!helpComparingValue(getInventoryNum(), otherEntity.getInventoryNum())) { return false; }
        if (!helpComparingValue(getInventoryNumOld(), otherEntity.getInventoryNumOld())) { return false; }
        if (!helpComparingValue(getInventoryItems(), otherEntity.getInventoryItems())) { return false; }
        if (!helpComparingValue(getDifferenceNum(), otherEntity.getDifferenceNum())) { return false; }
        if (!helpComparingValue(getDifferenceItems(), otherEntity.getDifferenceItems())) { return false; }
        if (!helpComparingValue(getNoShippingFlg(), otherEntity.getNoShippingFlg())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getPQty(), otherEntity.getPQty())) { return false; }
        if (!helpComparingValue(getUnit1(), otherEntity.getUnit1())) { return false; }
        if (!helpComparingValue(getUnit2(), otherEntity.getUnit2())) { return false; }
        if (!helpComparingValue(getUsernum4(), otherEntity.getUsernum4())) { return false; }
        if (!helpComparingValue(getInventoryParcent(), otherEntity.getInventoryParcent())) { return false; }
        if (!helpComparingValue(getInventoryInputFlg(), otherEntity.getInventoryInputFlg())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryInputList");
        result = xCH(result, getInventoryBId());
        result = xCH(result, getVersionNo());
        result = xCH(result, getInventoryInstKbn());
        result = xCH(result, getLocationGrp());
        result = xCH(result, getCggdid());
        result = xCH(result, getInstructionKey());
        result = xCH(result, getInventoryDt());
        result = xCH(result, getAddDt());
        result = xCH(result, getLineBlock());
        result = xCH(result, getDirectionalPiston());
        result = xCH(result, getSortingOrder());
        result = xCH(result, getSortingNumTimes());
        result = xCH(result, getLocationCd());
        result = xCH(result, getProductCd());
        result = xCH(result, getJanCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getFirmTransportCd());
        result = xCH(result, getUnitNumBreakdown());
        result = xCH(result, getChargeNum());
        result = xCH(result, getAllocNum());
        result = xCH(result, getMoveNum());
        result = xCH(result, getInventoryBeforeBreakdown());
        result = xCH(result, getInventoryNum());
        result = xCH(result, getInventoryNumOld());
        result = xCH(result, getInventoryItems());
        result = xCH(result, getDifferenceNum());
        result = xCH(result, getDifferenceItems());
        result = xCH(result, getNoShippingFlg());
        result = xCH(result, getUpdDt());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getPQty());
        result = xCH(result, getUnit1());
        result = xCH(result, getUnit2());
        result = xCH(result, getUsernum4());
        result = xCH(result, getInventoryParcent());
        result = xCH(result, getInventoryInputFlg());
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
        sb.append(c).append(getInventoryBId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getInventoryInstKbn());
        sb.append(c).append(getLocationGrp());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getInstructionKey());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getDirectionalPiston());
        sb.append(c).append(getSortingOrder());
        sb.append(c).append(getSortingNumTimes());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getFirmTransportCd());
        sb.append(c).append(getUnitNumBreakdown());
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getMoveNum());
        sb.append(c).append(getInventoryBeforeBreakdown());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getInventoryNumOld());
        sb.append(c).append(getInventoryItems());
        sb.append(c).append(getDifferenceNum());
        sb.append(c).append(getDifferenceItems());
        sb.append(c).append(getNoShippingFlg());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getPQty());
        sb.append(c).append(getUnit1());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getUsernum4());
        sb.append(c).append(getInventoryParcent());
        sb.append(c).append(getInventoryInputFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {bigint(19)} <br>
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] INVENTORY_INST_KBN: {varchar(100)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public String getInventoryInstKbn() {
        return _inventoryInstKbn;
    }

    /**
     * [set] INVENTORY_INST_KBN: {varchar(100)} <br>
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        __modifiedProperties.add("inventoryInstKbn");
        this._inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] LOCATION_GRP: {varchar(100)} <br>
     * @return The value of the column 'LOCATION_GRP'. (NullAllowed)
     */
    public String getLocationGrp() {
        return _locationGrp;
    }

    /**
     * [set] LOCATION_GRP: {varchar(100)} <br>
     * @param locationGrp The value of the column 'LOCATION_GRP'. (NullAllowed)
     */
    public void setLocationGrp(String locationGrp) {
        __modifiedProperties.add("locationGrp");
        this._locationGrp = locationGrp;
    }

    /**
     * [get] CGGDID: {varchar(100)} <br>
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(100)} <br>
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] INSTRUCTION_KEY: {bigint(19)} <br>
     * @return The value of the column 'INSTRUCTION_KEY'. (NullAllowed)
     */
    public Long getInstructionKey() {
        return _instructionKey;
    }

    /**
     * [set] INSTRUCTION_KEY: {bigint(19)} <br>
     * @param instructionKey The value of the column 'INSTRUCTION_KEY'. (NullAllowed)
     */
    public void setInstructionKey(Long instructionKey) {
        __modifiedProperties.add("instructionKey");
        this._instructionKey = instructionKey;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @return The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed)
     */
    public String getDirectionalPiston() {
        return _directionalPiston;
    }

    /**
     * [set] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @param directionalPiston The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed)
     */
    public void setDirectionalPiston(String directionalPiston) {
        __modifiedProperties.add("directionalPiston");
        this._directionalPiston = directionalPiston;
    }

    /**
     * [get] SORTING_ORDER: {varchar(255)} <br>
     * @return The value of the column 'SORTING_ORDER'. (NullAllowed)
     */
    public String getSortingOrder() {
        return _sortingOrder;
    }

    /**
     * [set] SORTING_ORDER: {varchar(255)} <br>
     * @param sortingOrder The value of the column 'SORTING_ORDER'. (NullAllowed)
     */
    public void setSortingOrder(String sortingOrder) {
        __modifiedProperties.add("sortingOrder");
        this._sortingOrder = sortingOrder;
    }

    /**
     * [get] SORTING_NUM_TIMES: {bigint(19)} <br>
     * @return The value of the column 'SORTING_NUM_TIMES'. (NullAllowed)
     */
    public Long getSortingNumTimes() {
        return _sortingNumTimes;
    }

    /**
     * [set] SORTING_NUM_TIMES: {bigint(19)} <br>
     * @param sortingNumTimes The value of the column 'SORTING_NUM_TIMES'. (NullAllowed)
     */
    public void setSortingNumTimes(Long sortingNumTimes) {
        __modifiedProperties.add("sortingNumTimes");
        this._sortingNumTimes = sortingNumTimes;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] FIRM_TRANSPORT_CD: {varchar(30)} <br>
     * @return The value of the column 'FIRM_TRANSPORT_CD'. (NullAllowed)
     */
    public String getFirmTransportCd() {
        return _firmTransportCd;
    }

    /**
     * [set] FIRM_TRANSPORT_CD: {varchar(30)} <br>
     * @param firmTransportCd The value of the column 'FIRM_TRANSPORT_CD'. (NullAllowed)
     */
    public void setFirmTransportCd(String firmTransportCd) {
        __modifiedProperties.add("firmTransportCd");
        this._firmTransportCd = firmTransportCd;
    }

    /**
     * [get] UNIT_NUM_BREAKDOWN: {varchar(1)} <br>
     * @return The value of the column 'UNIT_NUM_BREAKDOWN'. (NullAllowed)
     */
    public String getUnitNumBreakdown() {
        return _unitNumBreakdown;
    }

    /**
     * [set] UNIT_NUM_BREAKDOWN: {varchar(1)} <br>
     * @param unitNumBreakdown The value of the column 'UNIT_NUM_BREAKDOWN'. (NullAllowed)
     */
    public void setUnitNumBreakdown(String unitNumBreakdown) {
        __modifiedProperties.add("unitNumBreakdown");
        this._unitNumBreakdown = unitNumBreakdown;
    }

    /**
     * [get] CHARGE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(16, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum() {
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {decimal(16, 6)} <br>
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        __modifiedProperties.add("moveNum");
        this._moveNum = moveNum;
    }

    /**
     * [get] INVENTORY_BEFORE_BREAKDOWN: {varchar(1)} <br>
     * @return The value of the column 'INVENTORY_BEFORE_BREAKDOWN'. (NullAllowed)
     */
    public String getInventoryBeforeBreakdown() {
        return _inventoryBeforeBreakdown;
    }

    /**
     * [set] INVENTORY_BEFORE_BREAKDOWN: {varchar(1)} <br>
     * @param inventoryBeforeBreakdown The value of the column 'INVENTORY_BEFORE_BREAKDOWN'. (NullAllowed)
     */
    public void setInventoryBeforeBreakdown(String inventoryBeforeBreakdown) {
        __modifiedProperties.add("inventoryBeforeBreakdown");
        this._inventoryBeforeBreakdown = inventoryBeforeBreakdown;
    }

    /**
     * [get] INVENTORY_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {decimal(16, 6)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] INVENTORY_NUM_OLD: {decimal(16, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM_OLD'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNumOld() {
        return _inventoryNumOld;
    }

    /**
     * [set] INVENTORY_NUM_OLD: {decimal(16, 6)} <br>
     * @param inventoryNumOld The value of the column 'INVENTORY_NUM_OLD'. (NullAllowed)
     */
    public void setInventoryNumOld(java.math.BigDecimal inventoryNumOld) {
        __modifiedProperties.add("inventoryNumOld");
        this._inventoryNumOld = inventoryNumOld;
    }

    /**
     * [get] INVENTORY_ITEMS: {varchar(1)} <br>
     * @return The value of the column 'INVENTORY_ITEMS'. (NullAllowed)
     */
    public String getInventoryItems() {
        return _inventoryItems;
    }

    /**
     * [set] INVENTORY_ITEMS: {varchar(1)} <br>
     * @param inventoryItems The value of the column 'INVENTORY_ITEMS'. (NullAllowed)
     */
    public void setInventoryItems(String inventoryItems) {
        __modifiedProperties.add("inventoryItems");
        this._inventoryItems = inventoryItems;
    }

    /**
     * [get] DIFFERENCE_NUM: {varchar(1)} <br>
     * @return The value of the column 'DIFFERENCE_NUM'. (NullAllowed)
     */
    public String getDifferenceNum() {
        return _differenceNum;
    }

    /**
     * [set] DIFFERENCE_NUM: {varchar(1)} <br>
     * @param differenceNum The value of the column 'DIFFERENCE_NUM'. (NullAllowed)
     */
    public void setDifferenceNum(String differenceNum) {
        __modifiedProperties.add("differenceNum");
        this._differenceNum = differenceNum;
    }

    /**
     * [get] DIFFERENCE_ITEMS: {varchar(1)} <br>
     * @return The value of the column 'DIFFERENCE_ITEMS'. (NullAllowed)
     */
    public String getDifferenceItems() {
        return _differenceItems;
    }

    /**
     * [set] DIFFERENCE_ITEMS: {varchar(1)} <br>
     * @param differenceItems The value of the column 'DIFFERENCE_ITEMS'. (NullAllowed)
     */
    public void setDifferenceItems(String differenceItems) {
        __modifiedProperties.add("differenceItems");
        this._differenceItems = differenceItems;
    }

    /**
     * [get] NO_SHIPPING_FLG: {char(1)} <br>
     * @return The value of the column 'NO_SHIPPING_FLG'. (NullAllowed)
     */
    public String getNoShippingFlg() {
        return _noShippingFlg;
    }

    /**
     * [set] NO_SHIPPING_FLG: {char(1)} <br>
     * @param noShippingFlg The value of the column 'NO_SHIPPING_FLG'. (NullAllowed)
     */
    public void setNoShippingFlg(String noShippingFlg) {
        __modifiedProperties.add("noShippingFlg");
        this._noShippingFlg = noShippingFlg;
    }

    /**
     * [get] UPD_DT: {nvarchar(4000)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    public String getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {nvarchar(4000)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(String updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] P_QTY: {decimal(16, 6)} <br>
     * @return The value of the column 'P_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getPQty() {
        return _pQty;
    }

    /**
     * [set] P_QTY: {decimal(16, 6)} <br>
     * @param pQty The value of the column 'P_QTY'. (NullAllowed)
     */
    public void setPQty(java.math.BigDecimal pQty) {
        __modifiedProperties.add("PQty");
        this._pQty = pQty;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit1() {
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        __modifiedProperties.add("unit1");
        this._unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit2() {
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        __modifiedProperties.add("unit2");
        this._unit2 = unit2;
    }

    /**
     * [get] USERNUM4: {bigint(19)} <br>
     * @return The value of the column 'USERNUM4'. (NullAllowed)
     */
    public Long getUsernum4() {
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19)} <br>
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed)
     */
    public void setUsernum4(Long usernum4) {
        __modifiedProperties.add("usernum4");
        this._usernum4 = usernum4;
    }

    /**
     * [get] INVENTORY_PARCENT: {int(10)} <br>
     * @return The value of the column 'INVENTORY_PARCENT'. (NullAllowed)
     */
    public Integer getInventoryParcent() {
        return _inventoryParcent;
    }

    /**
     * [set] INVENTORY_PARCENT: {int(10)} <br>
     * @param inventoryParcent The value of the column 'INVENTORY_PARCENT'. (NullAllowed)
     */
    public void setInventoryParcent(Integer inventoryParcent) {
        __modifiedProperties.add("inventoryParcent");
        this._inventoryParcent = inventoryParcent;
    }

    /**
     * [get] INVENTORY_INPUT_FLG: {char(1)} <br>
     * @return The value of the column 'INVENTORY_INPUT_FLG'. (NullAllowed)
     */
    public String getInventoryInputFlg() {
        return _inventoryInputFlg;
    }

    /**
     * [set] INVENTORY_INPUT_FLG: {char(1)} <br>
     * @param inventoryInputFlg The value of the column 'INVENTORY_INPUT_FLG'. (NullAllowed)
     */
    public void setInventoryInputFlg(String inventoryInputFlg) {
        __modifiedProperties.add("inventoryInputFlg");
        this._inventoryInputFlg = inventoryInputFlg;
    }

}
