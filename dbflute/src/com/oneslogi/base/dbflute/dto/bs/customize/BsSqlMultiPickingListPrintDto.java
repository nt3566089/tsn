package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMultiPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, WAREHOUSE_CD, WAREHOUSE_NM, EMERGENCY_FLG, PICKING_GROUP_NO, WORK_DT, CART_NO, LOCATION_CD, LOCATION_NM, PRODUCT_CD, PRODUCT_NM, JANCD, LOT, LIMT_DT, STORE_LABEL_NO, STORE_DT, BACKET_COL_NUM, BACKET_ROW_NUM, SUM_PICKING_NUM, PACKING_NUM_1_1, PACKING_NUM_1_2, PACKING_NUM_1_3, PACKING_NUM_1_4, PACKING_NUM_1_5, PACKING_NUM_1_6, PACKING_NUM_2_1, PACKING_NUM_2_2, PACKING_NUM_2_3, PACKING_NUM_2_4, PACKING_NUM_2_5, PACKING_NUM_2_6, PACKING_NUM_3_1, PACKING_NUM_3_2, PACKING_NUM_3_3, PACKING_NUM_3_4, PACKING_NUM_3_5, PACKING_NUM_3_6, PACKING_NUM_4_1, PACKING_NUM_4_2, PACKING_NUM_4_3, PACKING_NUM_4_4, PACKING_NUM_4_5, PACKING_NUM_4_6, PACKING_NUM_5_1, PACKING_NUM_5_2, PACKING_NUM_5_3, PACKING_NUM_5_4, PACKING_NUM_5_5, PACKING_NUM_5_6, PACKING_NUM_6_1, PACKING_NUM_6_2, PACKING_NUM_6_3, PACKING_NUM_6_4, PACKING_NUM_6_5, PACKING_NUM_6_6, MLT_OUT_FLG
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlMultiPickingListPrintDto implements Serializable {

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
    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {varchar(60)} */
    @JsonKey
    protected String _warehouseNm;

    /** EMERGENCY_FLG: {varchar(1)} */
    @JsonKey
    protected String _emergencyFlg;

    /** PICKING_GROUP_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** WORK_DT: {varchar(8)} */
    @JsonKey
    protected String _workDt;

    /** CART_NO: {bigint(19)} */
    @JsonKey
    protected Long _cartNo;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _locationNm;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(60)} */
    @JsonKey
    protected String _productNm;

    /** JANCD: {varchar(30)} */
    @JsonKey
    protected String _jancd;

    /** LOT: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** LIMT_DT: {varchar(8)} */
    @JsonKey
    protected String _limtDt;

    /** STORE_LABEL_NO: {varchar(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    @JsonKey
    protected String _storeDt;

    /** BACKET_COL_NUM: {bigint(19)} */
    @JsonKey
    protected Long _backetColNum;

    /** BACKET_ROW_NUM: {bigint(19)} */
    @JsonKey
    protected Long _backetRowNum;

    /** SUM_PICKING_NUM: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sumPickingNum;

    /** PACKING_NUM_1_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum11;

    /** PACKING_NUM_1_2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum12;

    /** PACKING_NUM_1_3: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum13;

    /** PACKING_NUM_1_4: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum14;

    /** PACKING_NUM_1_5: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum15;

    /** PACKING_NUM_1_6: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum16;

    /** PACKING_NUM_2_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum21;

    /** PACKING_NUM_2_2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum22;

    /** PACKING_NUM_2_3: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum23;

    /** PACKING_NUM_2_4: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum24;

    /** PACKING_NUM_2_5: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum25;

    /** PACKING_NUM_2_6: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum26;

    /** PACKING_NUM_3_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum31;

    /** PACKING_NUM_3_2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum32;

    /** PACKING_NUM_3_3: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum33;

    /** PACKING_NUM_3_4: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum34;

    /** PACKING_NUM_3_5: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum35;

    /** PACKING_NUM_3_6: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum36;

    /** PACKING_NUM_4_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum41;

    /** PACKING_NUM_4_2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum42;

    /** PACKING_NUM_4_3: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum43;

    /** PACKING_NUM_4_4: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum44;

    /** PACKING_NUM_4_5: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum45;

    /** PACKING_NUM_4_6: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum46;

    /** PACKING_NUM_5_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum51;

    /** PACKING_NUM_5_2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum52;

    /** PACKING_NUM_5_3: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum53;

    /** PACKING_NUM_5_4: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum54;

    /** PACKING_NUM_5_5: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum55;

    /** PACKING_NUM_5_6: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum56;

    /** PACKING_NUM_6_1: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum61;

    /** PACKING_NUM_6_2: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum62;

    /** PACKING_NUM_6_3: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum63;

    /** PACKING_NUM_6_4: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum64;

    /** PACKING_NUM_6_5: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum65;

    /** PACKING_NUM_6_6: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum66;

    /** MLT_OUT_FLG: {char(1), classification=ListOutFlg} */
    @JsonKey
    protected String _mltOutFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMultiPickingListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlMultiPickingListPrintDto)) { return false; }
        final BsSqlMultiPickingListPrintDto otherEntity = (BsSqlMultiPickingListPrintDto)other;
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getWarehouseCd(), otherEntity.getWarehouseCd())) { return false; }
        if (!helpComparingValue(getWarehouseNm(), otherEntity.getWarehouseNm())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getPickingGroupNo(), otherEntity.getPickingGroupNo())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getCartNo(), otherEntity.getCartNo())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getLocationNm(), otherEntity.getLocationNm())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getJancd(), otherEntity.getJancd())) { return false; }
        if (!helpComparingValue(getLot(), otherEntity.getLot())) { return false; }
        if (!helpComparingValue(getLimtDt(), otherEntity.getLimtDt())) { return false; }
        if (!helpComparingValue(getStoreLabelNo(), otherEntity.getStoreLabelNo())) { return false; }
        if (!helpComparingValue(getStoreDt(), otherEntity.getStoreDt())) { return false; }
        if (!helpComparingValue(getBacketColNum(), otherEntity.getBacketColNum())) { return false; }
        if (!helpComparingValue(getBacketRowNum(), otherEntity.getBacketRowNum())) { return false; }
        if (!helpComparingValue(getSumPickingNum(), otherEntity.getSumPickingNum())) { return false; }
        if (!helpComparingValue(getPackingNum11(), otherEntity.getPackingNum11())) { return false; }
        if (!helpComparingValue(getPackingNum12(), otherEntity.getPackingNum12())) { return false; }
        if (!helpComparingValue(getPackingNum13(), otherEntity.getPackingNum13())) { return false; }
        if (!helpComparingValue(getPackingNum14(), otherEntity.getPackingNum14())) { return false; }
        if (!helpComparingValue(getPackingNum15(), otherEntity.getPackingNum15())) { return false; }
        if (!helpComparingValue(getPackingNum16(), otherEntity.getPackingNum16())) { return false; }
        if (!helpComparingValue(getPackingNum21(), otherEntity.getPackingNum21())) { return false; }
        if (!helpComparingValue(getPackingNum22(), otherEntity.getPackingNum22())) { return false; }
        if (!helpComparingValue(getPackingNum23(), otherEntity.getPackingNum23())) { return false; }
        if (!helpComparingValue(getPackingNum24(), otherEntity.getPackingNum24())) { return false; }
        if (!helpComparingValue(getPackingNum25(), otherEntity.getPackingNum25())) { return false; }
        if (!helpComparingValue(getPackingNum26(), otherEntity.getPackingNum26())) { return false; }
        if (!helpComparingValue(getPackingNum31(), otherEntity.getPackingNum31())) { return false; }
        if (!helpComparingValue(getPackingNum32(), otherEntity.getPackingNum32())) { return false; }
        if (!helpComparingValue(getPackingNum33(), otherEntity.getPackingNum33())) { return false; }
        if (!helpComparingValue(getPackingNum34(), otherEntity.getPackingNum34())) { return false; }
        if (!helpComparingValue(getPackingNum35(), otherEntity.getPackingNum35())) { return false; }
        if (!helpComparingValue(getPackingNum36(), otherEntity.getPackingNum36())) { return false; }
        if (!helpComparingValue(getPackingNum41(), otherEntity.getPackingNum41())) { return false; }
        if (!helpComparingValue(getPackingNum42(), otherEntity.getPackingNum42())) { return false; }
        if (!helpComparingValue(getPackingNum43(), otherEntity.getPackingNum43())) { return false; }
        if (!helpComparingValue(getPackingNum44(), otherEntity.getPackingNum44())) { return false; }
        if (!helpComparingValue(getPackingNum45(), otherEntity.getPackingNum45())) { return false; }
        if (!helpComparingValue(getPackingNum46(), otherEntity.getPackingNum46())) { return false; }
        if (!helpComparingValue(getPackingNum51(), otherEntity.getPackingNum51())) { return false; }
        if (!helpComparingValue(getPackingNum52(), otherEntity.getPackingNum52())) { return false; }
        if (!helpComparingValue(getPackingNum53(), otherEntity.getPackingNum53())) { return false; }
        if (!helpComparingValue(getPackingNum54(), otherEntity.getPackingNum54())) { return false; }
        if (!helpComparingValue(getPackingNum55(), otherEntity.getPackingNum55())) { return false; }
        if (!helpComparingValue(getPackingNum56(), otherEntity.getPackingNum56())) { return false; }
        if (!helpComparingValue(getPackingNum61(), otherEntity.getPackingNum61())) { return false; }
        if (!helpComparingValue(getPackingNum62(), otherEntity.getPackingNum62())) { return false; }
        if (!helpComparingValue(getPackingNum63(), otherEntity.getPackingNum63())) { return false; }
        if (!helpComparingValue(getPackingNum64(), otherEntity.getPackingNum64())) { return false; }
        if (!helpComparingValue(getPackingNum65(), otherEntity.getPackingNum65())) { return false; }
        if (!helpComparingValue(getPackingNum66(), otherEntity.getPackingNum66())) { return false; }
        if (!helpComparingValue(getMltOutFlg(), otherEntity.getMltOutFlg())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMultiPickingListPrint");
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getWarehouseCd());
        result = xCH(result, getWarehouseNm());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getPickingGroupNo());
        result = xCH(result, getWorkDt());
        result = xCH(result, getCartNo());
        result = xCH(result, getLocationCd());
        result = xCH(result, getLocationNm());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getJancd());
        result = xCH(result, getLot());
        result = xCH(result, getLimtDt());
        result = xCH(result, getStoreLabelNo());
        result = xCH(result, getStoreDt());
        result = xCH(result, getBacketColNum());
        result = xCH(result, getBacketRowNum());
        result = xCH(result, getSumPickingNum());
        result = xCH(result, getPackingNum11());
        result = xCH(result, getPackingNum12());
        result = xCH(result, getPackingNum13());
        result = xCH(result, getPackingNum14());
        result = xCH(result, getPackingNum15());
        result = xCH(result, getPackingNum16());
        result = xCH(result, getPackingNum21());
        result = xCH(result, getPackingNum22());
        result = xCH(result, getPackingNum23());
        result = xCH(result, getPackingNum24());
        result = xCH(result, getPackingNum25());
        result = xCH(result, getPackingNum26());
        result = xCH(result, getPackingNum31());
        result = xCH(result, getPackingNum32());
        result = xCH(result, getPackingNum33());
        result = xCH(result, getPackingNum34());
        result = xCH(result, getPackingNum35());
        result = xCH(result, getPackingNum36());
        result = xCH(result, getPackingNum41());
        result = xCH(result, getPackingNum42());
        result = xCH(result, getPackingNum43());
        result = xCH(result, getPackingNum44());
        result = xCH(result, getPackingNum45());
        result = xCH(result, getPackingNum46());
        result = xCH(result, getPackingNum51());
        result = xCH(result, getPackingNum52());
        result = xCH(result, getPackingNum53());
        result = xCH(result, getPackingNum54());
        result = xCH(result, getPackingNum55());
        result = xCH(result, getPackingNum56());
        result = xCH(result, getPackingNum61());
        result = xCH(result, getPackingNum62());
        result = xCH(result, getPackingNum63());
        result = xCH(result, getPackingNum64());
        result = xCH(result, getPackingNum65());
        result = xCH(result, getPackingNum66());
        result = xCH(result, getMltOutFlg());
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
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getCartNo());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getJancd());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimtDt());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getBacketColNum());
        sb.append(c).append(getBacketRowNum());
        sb.append(c).append(getSumPickingNum());
        sb.append(c).append(getPackingNum11());
        sb.append(c).append(getPackingNum12());
        sb.append(c).append(getPackingNum13());
        sb.append(c).append(getPackingNum14());
        sb.append(c).append(getPackingNum15());
        sb.append(c).append(getPackingNum16());
        sb.append(c).append(getPackingNum21());
        sb.append(c).append(getPackingNum22());
        sb.append(c).append(getPackingNum23());
        sb.append(c).append(getPackingNum24());
        sb.append(c).append(getPackingNum25());
        sb.append(c).append(getPackingNum26());
        sb.append(c).append(getPackingNum31());
        sb.append(c).append(getPackingNum32());
        sb.append(c).append(getPackingNum33());
        sb.append(c).append(getPackingNum34());
        sb.append(c).append(getPackingNum35());
        sb.append(c).append(getPackingNum36());
        sb.append(c).append(getPackingNum41());
        sb.append(c).append(getPackingNum42());
        sb.append(c).append(getPackingNum43());
        sb.append(c).append(getPackingNum44());
        sb.append(c).append(getPackingNum45());
        sb.append(c).append(getPackingNum46());
        sb.append(c).append(getPackingNum51());
        sb.append(c).append(getPackingNum52());
        sb.append(c).append(getPackingNum53());
        sb.append(c).append(getPackingNum54());
        sb.append(c).append(getPackingNum55());
        sb.append(c).append(getPackingNum56());
        sb.append(c).append(getPackingNum61());
        sb.append(c).append(getPackingNum62());
        sb.append(c).append(getPackingNum63());
        sb.append(c).append(getPackingNum64());
        sb.append(c).append(getPackingNum65());
        sb.append(c).append(getPackingNum66());
        sb.append(c).append(getMltOutFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
    }

    /**
     * [get] EMERGENCY_FLG: {varchar(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public String getPickingGroupNo() {
        return _pickingGroupNo;
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        __modifiedProperties.add("pickingGroupNo");
        this._pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] CART_NO: {bigint(19)} <br>
     * @return The value of the column 'CART_NO'. (NullAllowed)
     */
    public Long getCartNo() {
        return _cartNo;
    }

    /**
     * [set] CART_NO: {bigint(19)} <br>
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed)
     */
    public void setCartNo(Long cartNo) {
        __modifiedProperties.add("cartNo");
        this._cartNo = cartNo;
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
     * [get] LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(60)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] JANCD: {varchar(30)} <br>
     * @return The value of the column 'JANCD'. (NullAllowed)
     */
    public String getJancd() {
        return _jancd;
    }

    /**
     * [set] JANCD: {varchar(30)} <br>
     * @param jancd The value of the column 'JANCD'. (NullAllowed)
     */
    public void setJancd(String jancd) {
        __modifiedProperties.add("jancd");
        this._jancd = jancd;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMT_DT: {varchar(8)} <br>
     * @return The value of the column 'LIMT_DT'. (NullAllowed)
     */
    public String getLimtDt() {
        return _limtDt;
    }

    /**
     * [set] LIMT_DT: {varchar(8)} <br>
     * @param limtDt The value of the column 'LIMT_DT'. (NullAllowed)
     */
    public void setLimtDt(String limtDt) {
        __modifiedProperties.add("limtDt");
        this._limtDt = limtDt;
    }

    /**
     * [get] STORE_LABEL_NO: {varchar(30)} <br>
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {varchar(30)} <br>
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {varchar(8)} <br>
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {varchar(8)} <br>
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] BACKET_COL_NUM: {bigint(19)} <br>
     * @return The value of the column 'BACKET_COL_NUM'. (NullAllowed)
     */
    public Long getBacketColNum() {
        return _backetColNum;
    }

    /**
     * [set] BACKET_COL_NUM: {bigint(19)} <br>
     * @param backetColNum The value of the column 'BACKET_COL_NUM'. (NullAllowed)
     */
    public void setBacketColNum(Long backetColNum) {
        __modifiedProperties.add("backetColNum");
        this._backetColNum = backetColNum;
    }

    /**
     * [get] BACKET_ROW_NUM: {bigint(19)} <br>
     * @return The value of the column 'BACKET_ROW_NUM'. (NullAllowed)
     */
    public Long getBacketRowNum() {
        return _backetRowNum;
    }

    /**
     * [set] BACKET_ROW_NUM: {bigint(19)} <br>
     * @param backetRowNum The value of the column 'BACKET_ROW_NUM'. (NullAllowed)
     */
    public void setBacketRowNum(Long backetRowNum) {
        __modifiedProperties.add("backetRowNum");
        this._backetRowNum = backetRowNum;
    }

    /**
     * [get] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'SUM_PICKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getSumPickingNum() {
        return _sumPickingNum;
    }

    /**
     * [set] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @param sumPickingNum The value of the column 'SUM_PICKING_NUM'. (NullAllowed)
     */
    public void setSumPickingNum(java.math.BigDecimal sumPickingNum) {
        __modifiedProperties.add("sumPickingNum");
        this._sumPickingNum = sumPickingNum;
    }

    /**
     * [get] PACKING_NUM_1_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum11() {
        return _packingNum11;
    }

    /**
     * [set] PACKING_NUM_1_1: {decimal(38, 6)} <br>
     * @param packingNum11 The value of the column 'PACKING_NUM_1_1'. (NullAllowed)
     */
    public void setPackingNum11(java.math.BigDecimal packingNum11) {
        __modifiedProperties.add("packingNum11");
        this._packingNum11 = packingNum11;
    }

    /**
     * [get] PACKING_NUM_1_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_2'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum12() {
        return _packingNum12;
    }

    /**
     * [set] PACKING_NUM_1_2: {decimal(38, 6)} <br>
     * @param packingNum12 The value of the column 'PACKING_NUM_1_2'. (NullAllowed)
     */
    public void setPackingNum12(java.math.BigDecimal packingNum12) {
        __modifiedProperties.add("packingNum12");
        this._packingNum12 = packingNum12;
    }

    /**
     * [get] PACKING_NUM_1_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_3'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum13() {
        return _packingNum13;
    }

    /**
     * [set] PACKING_NUM_1_3: {decimal(38, 6)} <br>
     * @param packingNum13 The value of the column 'PACKING_NUM_1_3'. (NullAllowed)
     */
    public void setPackingNum13(java.math.BigDecimal packingNum13) {
        __modifiedProperties.add("packingNum13");
        this._packingNum13 = packingNum13;
    }

    /**
     * [get] PACKING_NUM_1_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_4'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum14() {
        return _packingNum14;
    }

    /**
     * [set] PACKING_NUM_1_4: {decimal(38, 6)} <br>
     * @param packingNum14 The value of the column 'PACKING_NUM_1_4'. (NullAllowed)
     */
    public void setPackingNum14(java.math.BigDecimal packingNum14) {
        __modifiedProperties.add("packingNum14");
        this._packingNum14 = packingNum14;
    }

    /**
     * [get] PACKING_NUM_1_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_5'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum15() {
        return _packingNum15;
    }

    /**
     * [set] PACKING_NUM_1_5: {decimal(38, 6)} <br>
     * @param packingNum15 The value of the column 'PACKING_NUM_1_5'. (NullAllowed)
     */
    public void setPackingNum15(java.math.BigDecimal packingNum15) {
        __modifiedProperties.add("packingNum15");
        this._packingNum15 = packingNum15;
    }

    /**
     * [get] PACKING_NUM_1_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_6'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum16() {
        return _packingNum16;
    }

    /**
     * [set] PACKING_NUM_1_6: {decimal(38, 6)} <br>
     * @param packingNum16 The value of the column 'PACKING_NUM_1_6'. (NullAllowed)
     */
    public void setPackingNum16(java.math.BigDecimal packingNum16) {
        __modifiedProperties.add("packingNum16");
        this._packingNum16 = packingNum16;
    }

    /**
     * [get] PACKING_NUM_2_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum21() {
        return _packingNum21;
    }

    /**
     * [set] PACKING_NUM_2_1: {decimal(38, 6)} <br>
     * @param packingNum21 The value of the column 'PACKING_NUM_2_1'. (NullAllowed)
     */
    public void setPackingNum21(java.math.BigDecimal packingNum21) {
        __modifiedProperties.add("packingNum21");
        this._packingNum21 = packingNum21;
    }

    /**
     * [get] PACKING_NUM_2_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_2'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum22() {
        return _packingNum22;
    }

    /**
     * [set] PACKING_NUM_2_2: {decimal(38, 6)} <br>
     * @param packingNum22 The value of the column 'PACKING_NUM_2_2'. (NullAllowed)
     */
    public void setPackingNum22(java.math.BigDecimal packingNum22) {
        __modifiedProperties.add("packingNum22");
        this._packingNum22 = packingNum22;
    }

    /**
     * [get] PACKING_NUM_2_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_3'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum23() {
        return _packingNum23;
    }

    /**
     * [set] PACKING_NUM_2_3: {decimal(38, 6)} <br>
     * @param packingNum23 The value of the column 'PACKING_NUM_2_3'. (NullAllowed)
     */
    public void setPackingNum23(java.math.BigDecimal packingNum23) {
        __modifiedProperties.add("packingNum23");
        this._packingNum23 = packingNum23;
    }

    /**
     * [get] PACKING_NUM_2_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_4'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum24() {
        return _packingNum24;
    }

    /**
     * [set] PACKING_NUM_2_4: {decimal(38, 6)} <br>
     * @param packingNum24 The value of the column 'PACKING_NUM_2_4'. (NullAllowed)
     */
    public void setPackingNum24(java.math.BigDecimal packingNum24) {
        __modifiedProperties.add("packingNum24");
        this._packingNum24 = packingNum24;
    }

    /**
     * [get] PACKING_NUM_2_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_5'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum25() {
        return _packingNum25;
    }

    /**
     * [set] PACKING_NUM_2_5: {decimal(38, 6)} <br>
     * @param packingNum25 The value of the column 'PACKING_NUM_2_5'. (NullAllowed)
     */
    public void setPackingNum25(java.math.BigDecimal packingNum25) {
        __modifiedProperties.add("packingNum25");
        this._packingNum25 = packingNum25;
    }

    /**
     * [get] PACKING_NUM_2_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_6'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum26() {
        return _packingNum26;
    }

    /**
     * [set] PACKING_NUM_2_6: {decimal(38, 6)} <br>
     * @param packingNum26 The value of the column 'PACKING_NUM_2_6'. (NullAllowed)
     */
    public void setPackingNum26(java.math.BigDecimal packingNum26) {
        __modifiedProperties.add("packingNum26");
        this._packingNum26 = packingNum26;
    }

    /**
     * [get] PACKING_NUM_3_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum31() {
        return _packingNum31;
    }

    /**
     * [set] PACKING_NUM_3_1: {decimal(38, 6)} <br>
     * @param packingNum31 The value of the column 'PACKING_NUM_3_1'. (NullAllowed)
     */
    public void setPackingNum31(java.math.BigDecimal packingNum31) {
        __modifiedProperties.add("packingNum31");
        this._packingNum31 = packingNum31;
    }

    /**
     * [get] PACKING_NUM_3_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_2'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum32() {
        return _packingNum32;
    }

    /**
     * [set] PACKING_NUM_3_2: {decimal(38, 6)} <br>
     * @param packingNum32 The value of the column 'PACKING_NUM_3_2'. (NullAllowed)
     */
    public void setPackingNum32(java.math.BigDecimal packingNum32) {
        __modifiedProperties.add("packingNum32");
        this._packingNum32 = packingNum32;
    }

    /**
     * [get] PACKING_NUM_3_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_3'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum33() {
        return _packingNum33;
    }

    /**
     * [set] PACKING_NUM_3_3: {decimal(38, 6)} <br>
     * @param packingNum33 The value of the column 'PACKING_NUM_3_3'. (NullAllowed)
     */
    public void setPackingNum33(java.math.BigDecimal packingNum33) {
        __modifiedProperties.add("packingNum33");
        this._packingNum33 = packingNum33;
    }

    /**
     * [get] PACKING_NUM_3_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_4'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum34() {
        return _packingNum34;
    }

    /**
     * [set] PACKING_NUM_3_4: {decimal(38, 6)} <br>
     * @param packingNum34 The value of the column 'PACKING_NUM_3_4'. (NullAllowed)
     */
    public void setPackingNum34(java.math.BigDecimal packingNum34) {
        __modifiedProperties.add("packingNum34");
        this._packingNum34 = packingNum34;
    }

    /**
     * [get] PACKING_NUM_3_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_5'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum35() {
        return _packingNum35;
    }

    /**
     * [set] PACKING_NUM_3_5: {decimal(38, 6)} <br>
     * @param packingNum35 The value of the column 'PACKING_NUM_3_5'. (NullAllowed)
     */
    public void setPackingNum35(java.math.BigDecimal packingNum35) {
        __modifiedProperties.add("packingNum35");
        this._packingNum35 = packingNum35;
    }

    /**
     * [get] PACKING_NUM_3_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_6'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum36() {
        return _packingNum36;
    }

    /**
     * [set] PACKING_NUM_3_6: {decimal(38, 6)} <br>
     * @param packingNum36 The value of the column 'PACKING_NUM_3_6'. (NullAllowed)
     */
    public void setPackingNum36(java.math.BigDecimal packingNum36) {
        __modifiedProperties.add("packingNum36");
        this._packingNum36 = packingNum36;
    }

    /**
     * [get] PACKING_NUM_4_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum41() {
        return _packingNum41;
    }

    /**
     * [set] PACKING_NUM_4_1: {decimal(38, 6)} <br>
     * @param packingNum41 The value of the column 'PACKING_NUM_4_1'. (NullAllowed)
     */
    public void setPackingNum41(java.math.BigDecimal packingNum41) {
        __modifiedProperties.add("packingNum41");
        this._packingNum41 = packingNum41;
    }

    /**
     * [get] PACKING_NUM_4_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_2'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum42() {
        return _packingNum42;
    }

    /**
     * [set] PACKING_NUM_4_2: {decimal(38, 6)} <br>
     * @param packingNum42 The value of the column 'PACKING_NUM_4_2'. (NullAllowed)
     */
    public void setPackingNum42(java.math.BigDecimal packingNum42) {
        __modifiedProperties.add("packingNum42");
        this._packingNum42 = packingNum42;
    }

    /**
     * [get] PACKING_NUM_4_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_3'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum43() {
        return _packingNum43;
    }

    /**
     * [set] PACKING_NUM_4_3: {decimal(38, 6)} <br>
     * @param packingNum43 The value of the column 'PACKING_NUM_4_3'. (NullAllowed)
     */
    public void setPackingNum43(java.math.BigDecimal packingNum43) {
        __modifiedProperties.add("packingNum43");
        this._packingNum43 = packingNum43;
    }

    /**
     * [get] PACKING_NUM_4_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_4'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum44() {
        return _packingNum44;
    }

    /**
     * [set] PACKING_NUM_4_4: {decimal(38, 6)} <br>
     * @param packingNum44 The value of the column 'PACKING_NUM_4_4'. (NullAllowed)
     */
    public void setPackingNum44(java.math.BigDecimal packingNum44) {
        __modifiedProperties.add("packingNum44");
        this._packingNum44 = packingNum44;
    }

    /**
     * [get] PACKING_NUM_4_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_5'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum45() {
        return _packingNum45;
    }

    /**
     * [set] PACKING_NUM_4_5: {decimal(38, 6)} <br>
     * @param packingNum45 The value of the column 'PACKING_NUM_4_5'. (NullAllowed)
     */
    public void setPackingNum45(java.math.BigDecimal packingNum45) {
        __modifiedProperties.add("packingNum45");
        this._packingNum45 = packingNum45;
    }

    /**
     * [get] PACKING_NUM_4_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_6'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum46() {
        return _packingNum46;
    }

    /**
     * [set] PACKING_NUM_4_6: {decimal(38, 6)} <br>
     * @param packingNum46 The value of the column 'PACKING_NUM_4_6'. (NullAllowed)
     */
    public void setPackingNum46(java.math.BigDecimal packingNum46) {
        __modifiedProperties.add("packingNum46");
        this._packingNum46 = packingNum46;
    }

    /**
     * [get] PACKING_NUM_5_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum51() {
        return _packingNum51;
    }

    /**
     * [set] PACKING_NUM_5_1: {decimal(38, 6)} <br>
     * @param packingNum51 The value of the column 'PACKING_NUM_5_1'. (NullAllowed)
     */
    public void setPackingNum51(java.math.BigDecimal packingNum51) {
        __modifiedProperties.add("packingNum51");
        this._packingNum51 = packingNum51;
    }

    /**
     * [get] PACKING_NUM_5_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_2'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum52() {
        return _packingNum52;
    }

    /**
     * [set] PACKING_NUM_5_2: {decimal(38, 6)} <br>
     * @param packingNum52 The value of the column 'PACKING_NUM_5_2'. (NullAllowed)
     */
    public void setPackingNum52(java.math.BigDecimal packingNum52) {
        __modifiedProperties.add("packingNum52");
        this._packingNum52 = packingNum52;
    }

    /**
     * [get] PACKING_NUM_5_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_3'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum53() {
        return _packingNum53;
    }

    /**
     * [set] PACKING_NUM_5_3: {decimal(38, 6)} <br>
     * @param packingNum53 The value of the column 'PACKING_NUM_5_3'. (NullAllowed)
     */
    public void setPackingNum53(java.math.BigDecimal packingNum53) {
        __modifiedProperties.add("packingNum53");
        this._packingNum53 = packingNum53;
    }

    /**
     * [get] PACKING_NUM_5_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_4'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum54() {
        return _packingNum54;
    }

    /**
     * [set] PACKING_NUM_5_4: {decimal(38, 6)} <br>
     * @param packingNum54 The value of the column 'PACKING_NUM_5_4'. (NullAllowed)
     */
    public void setPackingNum54(java.math.BigDecimal packingNum54) {
        __modifiedProperties.add("packingNum54");
        this._packingNum54 = packingNum54;
    }

    /**
     * [get] PACKING_NUM_5_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_5'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum55() {
        return _packingNum55;
    }

    /**
     * [set] PACKING_NUM_5_5: {decimal(38, 6)} <br>
     * @param packingNum55 The value of the column 'PACKING_NUM_5_5'. (NullAllowed)
     */
    public void setPackingNum55(java.math.BigDecimal packingNum55) {
        __modifiedProperties.add("packingNum55");
        this._packingNum55 = packingNum55;
    }

    /**
     * [get] PACKING_NUM_5_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_6'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum56() {
        return _packingNum56;
    }

    /**
     * [set] PACKING_NUM_5_6: {decimal(38, 6)} <br>
     * @param packingNum56 The value of the column 'PACKING_NUM_5_6'. (NullAllowed)
     */
    public void setPackingNum56(java.math.BigDecimal packingNum56) {
        __modifiedProperties.add("packingNum56");
        this._packingNum56 = packingNum56;
    }

    /**
     * [get] PACKING_NUM_6_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum61() {
        return _packingNum61;
    }

    /**
     * [set] PACKING_NUM_6_1: {decimal(38, 6)} <br>
     * @param packingNum61 The value of the column 'PACKING_NUM_6_1'. (NullAllowed)
     */
    public void setPackingNum61(java.math.BigDecimal packingNum61) {
        __modifiedProperties.add("packingNum61");
        this._packingNum61 = packingNum61;
    }

    /**
     * [get] PACKING_NUM_6_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_2'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum62() {
        return _packingNum62;
    }

    /**
     * [set] PACKING_NUM_6_2: {decimal(38, 6)} <br>
     * @param packingNum62 The value of the column 'PACKING_NUM_6_2'. (NullAllowed)
     */
    public void setPackingNum62(java.math.BigDecimal packingNum62) {
        __modifiedProperties.add("packingNum62");
        this._packingNum62 = packingNum62;
    }

    /**
     * [get] PACKING_NUM_6_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_3'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum63() {
        return _packingNum63;
    }

    /**
     * [set] PACKING_NUM_6_3: {decimal(38, 6)} <br>
     * @param packingNum63 The value of the column 'PACKING_NUM_6_3'. (NullAllowed)
     */
    public void setPackingNum63(java.math.BigDecimal packingNum63) {
        __modifiedProperties.add("packingNum63");
        this._packingNum63 = packingNum63;
    }

    /**
     * [get] PACKING_NUM_6_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_4'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum64() {
        return _packingNum64;
    }

    /**
     * [set] PACKING_NUM_6_4: {decimal(38, 6)} <br>
     * @param packingNum64 The value of the column 'PACKING_NUM_6_4'. (NullAllowed)
     */
    public void setPackingNum64(java.math.BigDecimal packingNum64) {
        __modifiedProperties.add("packingNum64");
        this._packingNum64 = packingNum64;
    }

    /**
     * [get] PACKING_NUM_6_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_5'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum65() {
        return _packingNum65;
    }

    /**
     * [set] PACKING_NUM_6_5: {decimal(38, 6)} <br>
     * @param packingNum65 The value of the column 'PACKING_NUM_6_5'. (NullAllowed)
     */
    public void setPackingNum65(java.math.BigDecimal packingNum65) {
        __modifiedProperties.add("packingNum65");
        this._packingNum65 = packingNum65;
    }

    /**
     * [get] PACKING_NUM_6_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_6'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum66() {
        return _packingNum66;
    }

    /**
     * [set] PACKING_NUM_6_6: {decimal(38, 6)} <br>
     * @param packingNum66 The value of the column 'PACKING_NUM_6_6'. (NullAllowed)
     */
    public void setPackingNum66(java.math.BigDecimal packingNum66) {
        __modifiedProperties.add("packingNum66");
        this._packingNum66 = packingNum66;
    }

    /**
     * [get] MLT_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed)
     */
    public String getMltOutFlg() {
        return _mltOutFlg;
    }

    /**
     * [set] MLT_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed)
     */
    public void setMltOutFlg(String mltOutFlg) {
        __modifiedProperties.add("mltOutFlg");
        this._mltOutFlg = mltOutFlg;
    }

}
