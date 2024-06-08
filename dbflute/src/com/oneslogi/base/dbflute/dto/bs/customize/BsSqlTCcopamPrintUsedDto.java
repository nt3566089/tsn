package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTCcopamPrintUsed. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DELIVERY_CLASS_CD, SHIP_CD, SN_NO1, SN_NO2, SN_NO3, SN_Y_M_D, ARV_Y_M_D, PLN_CAR_KND, AM_CAR_KND, CARRIER_NM, CAR_NO, SEAL_NO1, SEAL_NO2, SEAL_NO3, CCOPAM_ID, DELIVERY_CLASS, SHIP_NM, GN_PLT_QA, OT_PLT_QA, RCV_SUM_QTY1_PALLET, NO, SUM
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
public abstract class BsSqlTCcopamPrintUsedDto implements Serializable {

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
    /** DELIVERY_CLASS_CD: {char(1)} */
    @JsonKey
    protected String _deliveryClassCd;

    /** SHIP_CD: {varchar(30)} */
    @JsonKey
    protected String _shipCd;

    /** SN_NO1: {varchar(30)} */
    @JsonKey
    protected String _snNo1;

    /** SN_NO2: {varchar(30)} */
    @JsonKey
    protected String _snNo2;

    /** SN_NO3: {varchar(30)} */
    @JsonKey
    protected String _snNo3;

    /** SN_Y_M_D: {varchar(8)} */
    @JsonKey
    protected String _snYMD;

    /** ARV_Y_M_D: {varchar(8)} */
    @JsonKey
    protected String _arvYMD;

    /** PLN_CAR_KND: {varchar(255)} */
    @JsonKey
    protected String _plnCarKnd;

    /** AM_CAR_KND: {varchar(255)} */
    @JsonKey
    protected String _amCarKnd;

    /** CARRIER_NM: {varchar(60)} */
    @JsonKey
    protected String _carrierNm;

    /** CAR_NO: {varchar(30)} */
    @JsonKey
    protected String _carNo;

    /** SEAL_NO1: {varchar(30)} */
    @JsonKey
    protected String _sealNo1;

    /** SEAL_NO2: {varchar(30)} */
    @JsonKey
    protected String _sealNo2;

    /** SEAL_NO3: {varchar(30)} */
    @JsonKey
    protected String _sealNo3;

    /** CCOPAM_ID: {bigint(19)} */
    @JsonKey
    protected Long _ccopamId;

    /** DELIVERY_CLASS: {varchar(100)} */
    @JsonKey
    protected String _deliveryClass;

    /** SHIP_NM: {varchar(30)} */
    @JsonKey
    protected String _shipNm;

    /** GN_PLT_QA: {bigint(19)} */
    @JsonKey
    protected Long _gnPltQa;

    /** OT_PLT_QA: {bigint(19)} */
    @JsonKey
    protected Long _otPltQa;

    /** RCV_SUM_QTY1_PALLET: {bigint(19)} */
    @JsonKey
    protected Long _rcvSumQty1Pallet;

    /** NO: {int(10)} */
    @JsonKey
    protected Integer _no;

    /** SUM: {int(10)} */
    @JsonKey
    protected Integer _sum;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTCcopamPrintUsedDto() {
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
        if (other == null || !(other instanceof BsSqlTCcopamPrintUsedDto)) { return false; }
        final BsSqlTCcopamPrintUsedDto otherEntity = (BsSqlTCcopamPrintUsedDto)other;
        if (!helpComparingValue(getDeliveryClassCd(), otherEntity.getDeliveryClassCd())) { return false; }
        if (!helpComparingValue(getShipCd(), otherEntity.getShipCd())) { return false; }
        if (!helpComparingValue(getSnNo1(), otherEntity.getSnNo1())) { return false; }
        if (!helpComparingValue(getSnNo2(), otherEntity.getSnNo2())) { return false; }
        if (!helpComparingValue(getSnNo3(), otherEntity.getSnNo3())) { return false; }
        if (!helpComparingValue(getSnYMD(), otherEntity.getSnYMD())) { return false; }
        if (!helpComparingValue(getArvYMD(), otherEntity.getArvYMD())) { return false; }
        if (!helpComparingValue(getPlnCarKnd(), otherEntity.getPlnCarKnd())) { return false; }
        if (!helpComparingValue(getAmCarKnd(), otherEntity.getAmCarKnd())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getCarNo(), otherEntity.getCarNo())) { return false; }
        if (!helpComparingValue(getSealNo1(), otherEntity.getSealNo1())) { return false; }
        if (!helpComparingValue(getSealNo2(), otherEntity.getSealNo2())) { return false; }
        if (!helpComparingValue(getSealNo3(), otherEntity.getSealNo3())) { return false; }
        if (!helpComparingValue(getCcopamId(), otherEntity.getCcopamId())) { return false; }
        if (!helpComparingValue(getDeliveryClass(), otherEntity.getDeliveryClass())) { return false; }
        if (!helpComparingValue(getShipNm(), otherEntity.getShipNm())) { return false; }
        if (!helpComparingValue(getGnPltQa(), otherEntity.getGnPltQa())) { return false; }
        if (!helpComparingValue(getOtPltQa(), otherEntity.getOtPltQa())) { return false; }
        if (!helpComparingValue(getRcvSumQty1Pallet(), otherEntity.getRcvSumQty1Pallet())) { return false; }
        if (!helpComparingValue(getNo(), otherEntity.getNo())) { return false; }
        if (!helpComparingValue(getSum(), otherEntity.getSum())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTCcopamPrintUsed");
        result = xCH(result, getDeliveryClassCd());
        result = xCH(result, getShipCd());
        result = xCH(result, getSnNo1());
        result = xCH(result, getSnNo2());
        result = xCH(result, getSnNo3());
        result = xCH(result, getSnYMD());
        result = xCH(result, getArvYMD());
        result = xCH(result, getPlnCarKnd());
        result = xCH(result, getAmCarKnd());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getCarNo());
        result = xCH(result, getSealNo1());
        result = xCH(result, getSealNo2());
        result = xCH(result, getSealNo3());
        result = xCH(result, getCcopamId());
        result = xCH(result, getDeliveryClass());
        result = xCH(result, getShipNm());
        result = xCH(result, getGnPltQa());
        result = xCH(result, getOtPltQa());
        result = xCH(result, getRcvSumQty1Pallet());
        result = xCH(result, getNo());
        result = xCH(result, getSum());
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
        sb.append(c).append(getDeliveryClassCd());
        sb.append(c).append(getShipCd());
        sb.append(c).append(getSnNo1());
        sb.append(c).append(getSnNo2());
        sb.append(c).append(getSnNo3());
        sb.append(c).append(getSnYMD());
        sb.append(c).append(getArvYMD());
        sb.append(c).append(getPlnCarKnd());
        sb.append(c).append(getAmCarKnd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getCarNo());
        sb.append(c).append(getSealNo1());
        sb.append(c).append(getSealNo2());
        sb.append(c).append(getSealNo3());
        sb.append(c).append(getCcopamId());
        sb.append(c).append(getDeliveryClass());
        sb.append(c).append(getShipNm());
        sb.append(c).append(getGnPltQa());
        sb.append(c).append(getOtPltQa());
        sb.append(c).append(getRcvSumQty1Pallet());
        sb.append(c).append(getNo());
        sb.append(c).append(getSum());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DELIVERY_CLASS_CD: {char(1)} <br>
     * @return The value of the column 'DELIVERY_CLASS_CD'. (NullAllowed)
     */
    public String getDeliveryClassCd() {
        return _deliveryClassCd;
    }

    /**
     * [set] DELIVERY_CLASS_CD: {char(1)} <br>
     * @param deliveryClassCd The value of the column 'DELIVERY_CLASS_CD'. (NullAllowed)
     */
    public void setDeliveryClassCd(String deliveryClassCd) {
        __modifiedProperties.add("deliveryClassCd");
        this._deliveryClassCd = deliveryClassCd;
    }

    /**
     * [get] SHIP_CD: {varchar(30)} <br>
     * @return The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public String getShipCd() {
        return _shipCd;
    }

    /**
     * [set] SHIP_CD: {varchar(30)} <br>
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed)
     */
    public void setShipCd(String shipCd) {
        __modifiedProperties.add("shipCd");
        this._shipCd = shipCd;
    }

    /**
     * [get] SN_NO1: {varchar(30)} <br>
     * @return The value of the column 'SN_NO1'. (NullAllowed)
     */
    public String getSnNo1() {
        return _snNo1;
    }

    /**
     * [set] SN_NO1: {varchar(30)} <br>
     * @param snNo1 The value of the column 'SN_NO1'. (NullAllowed)
     */
    public void setSnNo1(String snNo1) {
        __modifiedProperties.add("snNo1");
        this._snNo1 = snNo1;
    }

    /**
     * [get] SN_NO2: {varchar(30)} <br>
     * @return The value of the column 'SN_NO2'. (NullAllowed)
     */
    public String getSnNo2() {
        return _snNo2;
    }

    /**
     * [set] SN_NO2: {varchar(30)} <br>
     * @param snNo2 The value of the column 'SN_NO2'. (NullAllowed)
     */
    public void setSnNo2(String snNo2) {
        __modifiedProperties.add("snNo2");
        this._snNo2 = snNo2;
    }

    /**
     * [get] SN_NO3: {varchar(30)} <br>
     * @return The value of the column 'SN_NO3'. (NullAllowed)
     */
    public String getSnNo3() {
        return _snNo3;
    }

    /**
     * [set] SN_NO3: {varchar(30)} <br>
     * @param snNo3 The value of the column 'SN_NO3'. (NullAllowed)
     */
    public void setSnNo3(String snNo3) {
        __modifiedProperties.add("snNo3");
        this._snNo3 = snNo3;
    }

    /**
     * [get] SN_Y_M_D: {varchar(8)} <br>
     * @return The value of the column 'SN_Y_M_D'. (NullAllowed)
     */
    public String getSnYMD() {
        return _snYMD;
    }

    /**
     * [set] SN_Y_M_D: {varchar(8)} <br>
     * @param snYMD The value of the column 'SN_Y_M_D'. (NullAllowed)
     */
    public void setSnYMD(String snYMD) {
        __modifiedProperties.add("snYMD");
        this._snYMD = snYMD;
    }

    /**
     * [get] ARV_Y_M_D: {varchar(8)} <br>
     * @return The value of the column 'ARV_Y_M_D'. (NullAllowed)
     */
    public String getArvYMD() {
        return _arvYMD;
    }

    /**
     * [set] ARV_Y_M_D: {varchar(8)} <br>
     * @param arvYMD The value of the column 'ARV_Y_M_D'. (NullAllowed)
     */
    public void setArvYMD(String arvYMD) {
        __modifiedProperties.add("arvYMD");
        this._arvYMD = arvYMD;
    }

    /**
     * [get] PLN_CAR_KND: {varchar(255)} <br>
     * @return The value of the column 'PLN_CAR_KND'. (NullAllowed)
     */
    public String getPlnCarKnd() {
        return _plnCarKnd;
    }

    /**
     * [set] PLN_CAR_KND: {varchar(255)} <br>
     * @param plnCarKnd The value of the column 'PLN_CAR_KND'. (NullAllowed)
     */
    public void setPlnCarKnd(String plnCarKnd) {
        __modifiedProperties.add("plnCarKnd");
        this._plnCarKnd = plnCarKnd;
    }

    /**
     * [get] AM_CAR_KND: {varchar(255)} <br>
     * @return The value of the column 'AM_CAR_KND'. (NullAllowed)
     */
    public String getAmCarKnd() {
        return _amCarKnd;
    }

    /**
     * [set] AM_CAR_KND: {varchar(255)} <br>
     * @param amCarKnd The value of the column 'AM_CAR_KND'. (NullAllowed)
     */
    public void setAmCarKnd(String amCarKnd) {
        __modifiedProperties.add("amCarKnd");
        this._amCarKnd = amCarKnd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] CAR_NO: {varchar(30)} <br>
     * @return The value of the column 'CAR_NO'. (NullAllowed)
     */
    public String getCarNo() {
        return _carNo;
    }

    /**
     * [set] CAR_NO: {varchar(30)} <br>
     * @param carNo The value of the column 'CAR_NO'. (NullAllowed)
     */
    public void setCarNo(String carNo) {
        __modifiedProperties.add("carNo");
        this._carNo = carNo;
    }

    /**
     * [get] SEAL_NO1: {varchar(30)} <br>
     * @return The value of the column 'SEAL_NO1'. (NullAllowed)
     */
    public String getSealNo1() {
        return _sealNo1;
    }

    /**
     * [set] SEAL_NO1: {varchar(30)} <br>
     * @param sealNo1 The value of the column 'SEAL_NO1'. (NullAllowed)
     */
    public void setSealNo1(String sealNo1) {
        __modifiedProperties.add("sealNo1");
        this._sealNo1 = sealNo1;
    }

    /**
     * [get] SEAL_NO2: {varchar(30)} <br>
     * @return The value of the column 'SEAL_NO2'. (NullAllowed)
     */
    public String getSealNo2() {
        return _sealNo2;
    }

    /**
     * [set] SEAL_NO2: {varchar(30)} <br>
     * @param sealNo2 The value of the column 'SEAL_NO2'. (NullAllowed)
     */
    public void setSealNo2(String sealNo2) {
        __modifiedProperties.add("sealNo2");
        this._sealNo2 = sealNo2;
    }

    /**
     * [get] SEAL_NO3: {varchar(30)} <br>
     * @return The value of the column 'SEAL_NO3'. (NullAllowed)
     */
    public String getSealNo3() {
        return _sealNo3;
    }

    /**
     * [set] SEAL_NO3: {varchar(30)} <br>
     * @param sealNo3 The value of the column 'SEAL_NO3'. (NullAllowed)
     */
    public void setSealNo3(String sealNo3) {
        __modifiedProperties.add("sealNo3");
        this._sealNo3 = sealNo3;
    }

    /**
     * [get] CCOPAM_ID: {bigint(19)} <br>
     * @return The value of the column 'CCOPAM_ID'. (NullAllowed)
     */
    public Long getCcopamId() {
        return _ccopamId;
    }

    /**
     * [set] CCOPAM_ID: {bigint(19)} <br>
     * @param ccopamId The value of the column 'CCOPAM_ID'. (NullAllowed)
     */
    public void setCcopamId(Long ccopamId) {
        __modifiedProperties.add("ccopamId");
        this._ccopamId = ccopamId;
    }

    /**
     * [get] DELIVERY_CLASS: {varchar(100)} <br>
     * @return The value of the column 'DELIVERY_CLASS'. (NullAllowed)
     */
    public String getDeliveryClass() {
        return _deliveryClass;
    }

    /**
     * [set] DELIVERY_CLASS: {varchar(100)} <br>
     * @param deliveryClass The value of the column 'DELIVERY_CLASS'. (NullAllowed)
     */
    public void setDeliveryClass(String deliveryClass) {
        __modifiedProperties.add("deliveryClass");
        this._deliveryClass = deliveryClass;
    }

    /**
     * [get] SHIP_NM: {varchar(30)} <br>
     * @return The value of the column 'SHIP_NM'. (NullAllowed)
     */
    public String getShipNm() {
        return _shipNm;
    }

    /**
     * [set] SHIP_NM: {varchar(30)} <br>
     * @param shipNm The value of the column 'SHIP_NM'. (NullAllowed)
     */
    public void setShipNm(String shipNm) {
        __modifiedProperties.add("shipNm");
        this._shipNm = shipNm;
    }

    /**
     * [get] GN_PLT_QA: {bigint(19)} <br>
     * @return The value of the column 'GN_PLT_QA'. (NullAllowed)
     */
    public Long getGnPltQa() {
        return _gnPltQa;
    }

    /**
     * [set] GN_PLT_QA: {bigint(19)} <br>
     * @param gnPltQa The value of the column 'GN_PLT_QA'. (NullAllowed)
     */
    public void setGnPltQa(Long gnPltQa) {
        __modifiedProperties.add("gnPltQa");
        this._gnPltQa = gnPltQa;
    }

    /**
     * [get] OT_PLT_QA: {bigint(19)} <br>
     * @return The value of the column 'OT_PLT_QA'. (NullAllowed)
     */
    public Long getOtPltQa() {
        return _otPltQa;
    }

    /**
     * [set] OT_PLT_QA: {bigint(19)} <br>
     * @param otPltQa The value of the column 'OT_PLT_QA'. (NullAllowed)
     */
    public void setOtPltQa(Long otPltQa) {
        __modifiedProperties.add("otPltQa");
        this._otPltQa = otPltQa;
    }

    /**
     * [get] RCV_SUM_QTY1_PALLET: {bigint(19)} <br>
     * @return The value of the column 'RCV_SUM_QTY1_PALLET'. (NullAllowed)
     */
    public Long getRcvSumQty1Pallet() {
        return _rcvSumQty1Pallet;
    }

    /**
     * [set] RCV_SUM_QTY1_PALLET: {bigint(19)} <br>
     * @param rcvSumQty1Pallet The value of the column 'RCV_SUM_QTY1_PALLET'. (NullAllowed)
     */
    public void setRcvSumQty1Pallet(Long rcvSumQty1Pallet) {
        __modifiedProperties.add("rcvSumQty1Pallet");
        this._rcvSumQty1Pallet = rcvSumQty1Pallet;
    }

    /**
     * [get] NO: {int(10)} <br>
     * @return The value of the column 'NO'. (NullAllowed)
     */
    public Integer getNo() {
        return _no;
    }

    /**
     * [set] NO: {int(10)} <br>
     * @param no The value of the column 'NO'. (NullAllowed)
     */
    public void setNo(Integer no) {
        __modifiedProperties.add("no");
        this._no = no;
    }

    /**
     * [get] SUM: {int(10)} <br>
     * @return The value of the column 'SUM'. (NullAllowed)
     */
    public Integer getSum() {
        return _sum;
    }

    /**
     * [set] SUM: {int(10)} <br>
     * @param sum The value of the column 'SUM'. (NullAllowed)
     */
    public void setSum(Integer sum) {
        __modifiedProperties.add("sum");
        this._sum = sum;
    }

}
