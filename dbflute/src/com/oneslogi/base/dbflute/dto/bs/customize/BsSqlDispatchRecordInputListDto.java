package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlDispatchRecordInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SUPPLIERR_CV_FLG_CD, SHIP_CD, SUPPLIERR_CV_NO1, SUPPLIERR_CV_NO2, SUPPLIERR_CV_NO, SHIPMENT_DT, ARRIVAL_DT, PLANNED_CAR, ACHIEVED_CAR, TRANSPORTATION_CO, CAR_NO, SEAL_NO1, SEAL_NO2, SEAL_NO3, CCOPAM_ID, VERSION_NO, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM, SUPPLIERR_CV_FLG, GENERIC_PALLET_NO, OTHER_PALLET_NO, RCV_SUM_QTY1_PALLET, NO, SUM, LANDING
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
public abstract class BsSqlDispatchRecordInputListDto implements Serializable {

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
    /** SUPPLIERR_CV_FLG_CD: {char(1)} */
    @JsonKey
    protected String _supplierrCvFlgCd;

    /** SHIP_CD: {varchar(30)} */
    @JsonKey
    protected String _shipCd;

    /** SUPPLIERR_CV_NO1: {varchar(30)} */
    @JsonKey
    protected String _supplierrCvNo1;

    /** SUPPLIERR_CV_NO2: {varchar(30)} */
    @JsonKey
    protected String _supplierrCvNo2;

    /** SUPPLIERR_CV_NO: {varchar(30)} */
    @JsonKey
    protected String _supplierrCvNo;

    /** SHIPMENT_DT: {varchar(8)} */
    @JsonKey
    protected String _shipmentDt;

    /** ARRIVAL_DT: {varchar(8)} */
    @JsonKey
    protected String _arrivalDt;

    /** PLANNED_CAR: {varchar(100)} */
    @JsonKey
    protected String _plannedCar;

    /** ACHIEVED_CAR: {varchar(100)} */
    @JsonKey
    protected String _achievedCar;

    /** TRANSPORTATION_CO: {varchar(60)} */
    @JsonKey
    protected String _transportationCo;

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

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** SUPPLIERR_CV_FLG: {varchar(100)} */
    @JsonKey
    protected String _supplierrCvFlg;

    /** GENERIC_PALLET_NO: {bigint(19)} */
    @JsonKey
    protected Long _genericPalletNo;

    /** OTHER_PALLET_NO: {bigint(19)} */
    @JsonKey
    protected Long _otherPalletNo;

    /** RCV_SUM_QTY1_PALLET: {bigint(19)} */
    @JsonKey
    protected Long _rcvSumQty1Pallet;

    /** NO: {int(10)} */
    @JsonKey
    protected Integer _no;

    /** SUM: {int(10)} */
    @JsonKey
    protected Integer _sum;

    /** LANDING: {varchar(30)} */
    @JsonKey
    protected String _landing;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlDispatchRecordInputListDto() {
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
        if (other == null || !(other instanceof BsSqlDispatchRecordInputListDto)) { return false; }
        final BsSqlDispatchRecordInputListDto otherEntity = (BsSqlDispatchRecordInputListDto)other;
        if (!helpComparingValue(getSupplierrCvFlgCd(), otherEntity.getSupplierrCvFlgCd())) { return false; }
        if (!helpComparingValue(getShipCd(), otherEntity.getShipCd())) { return false; }
        if (!helpComparingValue(getSupplierrCvNo1(), otherEntity.getSupplierrCvNo1())) { return false; }
        if (!helpComparingValue(getSupplierrCvNo2(), otherEntity.getSupplierrCvNo2())) { return false; }
        if (!helpComparingValue(getSupplierrCvNo(), otherEntity.getSupplierrCvNo())) { return false; }
        if (!helpComparingValue(getShipmentDt(), otherEntity.getShipmentDt())) { return false; }
        if (!helpComparingValue(getArrivalDt(), otherEntity.getArrivalDt())) { return false; }
        if (!helpComparingValue(getPlannedCar(), otherEntity.getPlannedCar())) { return false; }
        if (!helpComparingValue(getAchievedCar(), otherEntity.getAchievedCar())) { return false; }
        if (!helpComparingValue(getTransportationCo(), otherEntity.getTransportationCo())) { return false; }
        if (!helpComparingValue(getCarNo(), otherEntity.getCarNo())) { return false; }
        if (!helpComparingValue(getSealNo1(), otherEntity.getSealNo1())) { return false; }
        if (!helpComparingValue(getSealNo2(), otherEntity.getSealNo2())) { return false; }
        if (!helpComparingValue(getSealNo3(), otherEntity.getSealNo3())) { return false; }
        if (!helpComparingValue(getCcopamId(), otherEntity.getCcopamId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getSupplierrCvFlg(), otherEntity.getSupplierrCvFlg())) { return false; }
        if (!helpComparingValue(getGenericPalletNo(), otherEntity.getGenericPalletNo())) { return false; }
        if (!helpComparingValue(getOtherPalletNo(), otherEntity.getOtherPalletNo())) { return false; }
        if (!helpComparingValue(getRcvSumQty1Pallet(), otherEntity.getRcvSumQty1Pallet())) { return false; }
        if (!helpComparingValue(getNo(), otherEntity.getNo())) { return false; }
        if (!helpComparingValue(getSum(), otherEntity.getSum())) { return false; }
        if (!helpComparingValue(getLanding(), otherEntity.getLanding())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlDispatchRecordInputList");
        result = xCH(result, getSupplierrCvFlgCd());
        result = xCH(result, getShipCd());
        result = xCH(result, getSupplierrCvNo1());
        result = xCH(result, getSupplierrCvNo2());
        result = xCH(result, getSupplierrCvNo());
        result = xCH(result, getShipmentDt());
        result = xCH(result, getArrivalDt());
        result = xCH(result, getPlannedCar());
        result = xCH(result, getAchievedCar());
        result = xCH(result, getTransportationCo());
        result = xCH(result, getCarNo());
        result = xCH(result, getSealNo1());
        result = xCH(result, getSealNo2());
        result = xCH(result, getSealNo3());
        result = xCH(result, getCcopamId());
        result = xCH(result, getVersionNo());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getSupplierrCvFlg());
        result = xCH(result, getGenericPalletNo());
        result = xCH(result, getOtherPalletNo());
        result = xCH(result, getRcvSumQty1Pallet());
        result = xCH(result, getNo());
        result = xCH(result, getSum());
        result = xCH(result, getLanding());
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
        sb.append(c).append(getSupplierrCvFlgCd());
        sb.append(c).append(getShipCd());
        sb.append(c).append(getSupplierrCvNo1());
        sb.append(c).append(getSupplierrCvNo2());
        sb.append(c).append(getSupplierrCvNo());
        sb.append(c).append(getShipmentDt());
        sb.append(c).append(getArrivalDt());
        sb.append(c).append(getPlannedCar());
        sb.append(c).append(getAchievedCar());
        sb.append(c).append(getTransportationCo());
        sb.append(c).append(getCarNo());
        sb.append(c).append(getSealNo1());
        sb.append(c).append(getSealNo2());
        sb.append(c).append(getSealNo3());
        sb.append(c).append(getCcopamId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getSupplierrCvFlg());
        sb.append(c).append(getGenericPalletNo());
        sb.append(c).append(getOtherPalletNo());
        sb.append(c).append(getRcvSumQty1Pallet());
        sb.append(c).append(getNo());
        sb.append(c).append(getSum());
        sb.append(c).append(getLanding());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUPPLIERR_CV_FLG_CD: {char(1)} <br>
     * @return The value of the column 'SUPPLIERR_CV_FLG_CD'. (NullAllowed)
     */
    public String getSupplierrCvFlgCd() {
        return _supplierrCvFlgCd;
    }

    /**
     * [set] SUPPLIERR_CV_FLG_CD: {char(1)} <br>
     * @param supplierrCvFlgCd The value of the column 'SUPPLIERR_CV_FLG_CD'. (NullAllowed)
     */
    public void setSupplierrCvFlgCd(String supplierrCvFlgCd) {
        __modifiedProperties.add("supplierrCvFlgCd");
        this._supplierrCvFlgCd = supplierrCvFlgCd;
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
     * [get] SUPPLIERR_CV_NO1: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERR_CV_NO1'. (NullAllowed)
     */
    public String getSupplierrCvNo1() {
        return _supplierrCvNo1;
    }

    /**
     * [set] SUPPLIERR_CV_NO1: {varchar(30)} <br>
     * @param supplierrCvNo1 The value of the column 'SUPPLIERR_CV_NO1'. (NullAllowed)
     */
    public void setSupplierrCvNo1(String supplierrCvNo1) {
        __modifiedProperties.add("supplierrCvNo1");
        this._supplierrCvNo1 = supplierrCvNo1;
    }

    /**
     * [get] SUPPLIERR_CV_NO2: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERR_CV_NO2'. (NullAllowed)
     */
    public String getSupplierrCvNo2() {
        return _supplierrCvNo2;
    }

    /**
     * [set] SUPPLIERR_CV_NO2: {varchar(30)} <br>
     * @param supplierrCvNo2 The value of the column 'SUPPLIERR_CV_NO2'. (NullAllowed)
     */
    public void setSupplierrCvNo2(String supplierrCvNo2) {
        __modifiedProperties.add("supplierrCvNo2");
        this._supplierrCvNo2 = supplierrCvNo2;
    }

    /**
     * [get] SUPPLIERR_CV_NO: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERR_CV_NO'. (NullAllowed)
     */
    public String getSupplierrCvNo() {
        return _supplierrCvNo;
    }

    /**
     * [set] SUPPLIERR_CV_NO: {varchar(30)} <br>
     * @param supplierrCvNo The value of the column 'SUPPLIERR_CV_NO'. (NullAllowed)
     */
    public void setSupplierrCvNo(String supplierrCvNo) {
        __modifiedProperties.add("supplierrCvNo");
        this._supplierrCvNo = supplierrCvNo;
    }

    /**
     * [get] SHIPMENT_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPMENT_DT'. (NullAllowed)
     */
    public String getShipmentDt() {
        return _shipmentDt;
    }

    /**
     * [set] SHIPMENT_DT: {varchar(8)} <br>
     * @param shipmentDt The value of the column 'SHIPMENT_DT'. (NullAllowed)
     */
    public void setShipmentDt(String shipmentDt) {
        __modifiedProperties.add("shipmentDt");
        this._shipmentDt = shipmentDt;
    }

    /**
     * [get] ARRIVAL_DT: {varchar(8)} <br>
     * @return The value of the column 'ARRIVAL_DT'. (NullAllowed)
     */
    public String getArrivalDt() {
        return _arrivalDt;
    }

    /**
     * [set] ARRIVAL_DT: {varchar(8)} <br>
     * @param arrivalDt The value of the column 'ARRIVAL_DT'. (NullAllowed)
     */
    public void setArrivalDt(String arrivalDt) {
        __modifiedProperties.add("arrivalDt");
        this._arrivalDt = arrivalDt;
    }

    /**
     * [get] PLANNED_CAR: {varchar(100)} <br>
     * @return The value of the column 'PLANNED_CAR'. (NullAllowed)
     */
    public String getPlannedCar() {
        return _plannedCar;
    }

    /**
     * [set] PLANNED_CAR: {varchar(100)} <br>
     * @param plannedCar The value of the column 'PLANNED_CAR'. (NullAllowed)
     */
    public void setPlannedCar(String plannedCar) {
        __modifiedProperties.add("plannedCar");
        this._plannedCar = plannedCar;
    }

    /**
     * [get] ACHIEVED_CAR: {varchar(100)} <br>
     * @return The value of the column 'ACHIEVED_CAR'. (NullAllowed)
     */
    public String getAchievedCar() {
        return _achievedCar;
    }

    /**
     * [set] ACHIEVED_CAR: {varchar(100)} <br>
     * @param achievedCar The value of the column 'ACHIEVED_CAR'. (NullAllowed)
     */
    public void setAchievedCar(String achievedCar) {
        __modifiedProperties.add("achievedCar");
        this._achievedCar = achievedCar;
    }

    /**
     * [get] TRANSPORTATION_CO: {varchar(60)} <br>
     * @return The value of the column 'TRANSPORTATION_CO'. (NullAllowed)
     */
    public String getTransportationCo() {
        return _transportationCo;
    }

    /**
     * [set] TRANSPORTATION_CO: {varchar(60)} <br>
     * @param transportationCo The value of the column 'TRANSPORTATION_CO'. (NullAllowed)
     */
    public void setTransportationCo(String transportationCo) {
        __modifiedProperties.add("transportationCo");
        this._transportationCo = transportationCo;
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
     * [get] SUPPLIERR_CV_FLG: {varchar(100)} <br>
     * @return The value of the column 'SUPPLIERR_CV_FLG'. (NullAllowed)
     */
    public String getSupplierrCvFlg() {
        return _supplierrCvFlg;
    }

    /**
     * [set] SUPPLIERR_CV_FLG: {varchar(100)} <br>
     * @param supplierrCvFlg The value of the column 'SUPPLIERR_CV_FLG'. (NullAllowed)
     */
    public void setSupplierrCvFlg(String supplierrCvFlg) {
        __modifiedProperties.add("supplierrCvFlg");
        this._supplierrCvFlg = supplierrCvFlg;
    }

    /**
     * [get] GENERIC_PALLET_NO: {bigint(19)} <br>
     * @return The value of the column 'GENERIC_PALLET_NO'. (NullAllowed)
     */
    public Long getGenericPalletNo() {
        return _genericPalletNo;
    }

    /**
     * [set] GENERIC_PALLET_NO: {bigint(19)} <br>
     * @param genericPalletNo The value of the column 'GENERIC_PALLET_NO'. (NullAllowed)
     */
    public void setGenericPalletNo(Long genericPalletNo) {
        __modifiedProperties.add("genericPalletNo");
        this._genericPalletNo = genericPalletNo;
    }

    /**
     * [get] OTHER_PALLET_NO: {bigint(19)} <br>
     * @return The value of the column 'OTHER_PALLET_NO'. (NullAllowed)
     */
    public Long getOtherPalletNo() {
        return _otherPalletNo;
    }

    /**
     * [set] OTHER_PALLET_NO: {bigint(19)} <br>
     * @param otherPalletNo The value of the column 'OTHER_PALLET_NO'. (NullAllowed)
     */
    public void setOtherPalletNo(Long otherPalletNo) {
        __modifiedProperties.add("otherPalletNo");
        this._otherPalletNo = otherPalletNo;
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

    /**
     * [get] LANDING: {varchar(30)} <br>
     * @return The value of the column 'LANDING'. (NullAllowed)
     */
    public String getLanding() {
        return _landing;
    }

    /**
     * [set] LANDING: {varchar(30)} <br>
     * @param landing The value of the column 'LANDING'. (NullAllowed)
     */
    public void setLanding(String landing) {
        __modifiedProperties.add("landing");
        this._landing = landing;
    }

}
