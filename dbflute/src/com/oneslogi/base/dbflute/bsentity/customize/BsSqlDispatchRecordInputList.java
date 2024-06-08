package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlDispatchRecordInputList. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String supplierrCvFlgCd = entity.getSupplierrCvFlgCd();
 * String shipCd = entity.getShipCd();
 * String supplierrCvNo1 = entity.getSupplierrCvNo1();
 * String supplierrCvNo2 = entity.getSupplierrCvNo2();
 * String supplierrCvNo = entity.getSupplierrCvNo();
 * String shipmentDt = entity.getShipmentDt();
 * String arrivalDt = entity.getArrivalDt();
 * String plannedCar = entity.getPlannedCar();
 * String achievedCar = entity.getAchievedCar();
 * String transportationCo = entity.getTransportationCo();
 * String carNo = entity.getCarNo();
 * String sealNo1 = entity.getSealNo1();
 * String sealNo2 = entity.getSealNo2();
 * String sealNo3 = entity.getSealNo3();
 * Long ccopamId = entity.getCcopamId();
 * Long versionNo = entity.getVersionNo();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String supplierrCvFlg = entity.getSupplierrCvFlg();
 * Long genericPalletNo = entity.getGenericPalletNo();
 * Long otherPalletNo = entity.getOtherPalletNo();
 * Long rcvSumQty1Pallet = entity.getRcvSumQty1Pallet();
 * Integer no = entity.getNo();
 * Integer sum = entity.getSum();
 * String landing = entity.getLanding();
 * entity.setSupplierrCvFlgCd(supplierrCvFlgCd);
 * entity.setShipCd(shipCd);
 * entity.setSupplierrCvNo1(supplierrCvNo1);
 * entity.setSupplierrCvNo2(supplierrCvNo2);
 * entity.setSupplierrCvNo(supplierrCvNo);
 * entity.setShipmentDt(shipmentDt);
 * entity.setArrivalDt(arrivalDt);
 * entity.setPlannedCar(plannedCar);
 * entity.setAchievedCar(achievedCar);
 * entity.setTransportationCo(transportationCo);
 * entity.setCarNo(carNo);
 * entity.setSealNo1(sealNo1);
 * entity.setSealNo2(sealNo2);
 * entity.setSealNo3(sealNo3);
 * entity.setCcopamId(ccopamId);
 * entity.setVersionNo(versionNo);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setSupplierrCvFlg(supplierrCvFlg);
 * entity.setGenericPalletNo(genericPalletNo);
 * entity.setOtherPalletNo(otherPalletNo);
 * entity.setRcvSumQty1Pallet(rcvSumQty1Pallet);
 * entity.setNo(no);
 * entity.setSum(sum);
 * entity.setLanding(landing);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlDispatchRecordInputList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SUPPLIERR_CV_FLG_CD: {char(1)} */
    protected String _supplierrCvFlgCd;

    /** SHIP_CD: {varchar(30)} */
    protected String _shipCd;

    /** SUPPLIERR_CV_NO1: {varchar(30)} */
    protected String _supplierrCvNo1;

    /** SUPPLIERR_CV_NO2: {varchar(30)} */
    protected String _supplierrCvNo2;

    /** SUPPLIERR_CV_NO: {varchar(30)} */
    protected String _supplierrCvNo;

    /** SHIPMENT_DT: {varchar(8)} */
    protected String _shipmentDt;

    /** ARRIVAL_DT: {varchar(8)} */
    protected String _arrivalDt;

    /** PLANNED_CAR: {varchar(100)} */
    protected String _plannedCar;

    /** ACHIEVED_CAR: {varchar(100)} */
    protected String _achievedCar;

    /** TRANSPORTATION_CO: {varchar(60)} */
    protected String _transportationCo;

    /** CAR_NO: {varchar(30)} */
    protected String _carNo;

    /** SEAL_NO1: {varchar(30)} */
    protected String _sealNo1;

    /** SEAL_NO2: {varchar(30)} */
    protected String _sealNo2;

    /** SEAL_NO3: {varchar(30)} */
    protected String _sealNo3;

    /** CCOPAM_ID: {bigint(19)} */
    protected Long _ccopamId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** SUPPLIERR_CV_FLG: {varchar(100)} */
    protected String _supplierrCvFlg;

    /** GENERIC_PALLET_NO: {bigint(19)} */
    protected Long _genericPalletNo;

    /** OTHER_PALLET_NO: {bigint(19)} */
    protected Long _otherPalletNo;

    /** RCV_SUM_QTY1_PALLET: {bigint(19)} */
    protected Long _rcvSumQty1Pallet;

    /** NO: {int(10)} */
    protected Integer _no;

    /** SUM: {int(10)} */
    protected Integer _sum;

    /** LANDING: {varchar(30)} */
    protected String _landing;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlDispatchRecordInputListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlDispatchRecordInputList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlDispatchRecordInputList) {
            BsSqlDispatchRecordInputList other = (BsSqlDispatchRecordInputList)obj;
            if (!xSV(_supplierrCvFlgCd, other._supplierrCvFlgCd)) { return false; }
            if (!xSV(_shipCd, other._shipCd)) { return false; }
            if (!xSV(_supplierrCvNo1, other._supplierrCvNo1)) { return false; }
            if (!xSV(_supplierrCvNo2, other._supplierrCvNo2)) { return false; }
            if (!xSV(_supplierrCvNo, other._supplierrCvNo)) { return false; }
            if (!xSV(_shipmentDt, other._shipmentDt)) { return false; }
            if (!xSV(_arrivalDt, other._arrivalDt)) { return false; }
            if (!xSV(_plannedCar, other._plannedCar)) { return false; }
            if (!xSV(_achievedCar, other._achievedCar)) { return false; }
            if (!xSV(_transportationCo, other._transportationCo)) { return false; }
            if (!xSV(_carNo, other._carNo)) { return false; }
            if (!xSV(_sealNo1, other._sealNo1)) { return false; }
            if (!xSV(_sealNo2, other._sealNo2)) { return false; }
            if (!xSV(_sealNo3, other._sealNo3)) { return false; }
            if (!xSV(_ccopamId, other._ccopamId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_supplierrCvFlg, other._supplierrCvFlg)) { return false; }
            if (!xSV(_genericPalletNo, other._genericPalletNo)) { return false; }
            if (!xSV(_otherPalletNo, other._otherPalletNo)) { return false; }
            if (!xSV(_rcvSumQty1Pallet, other._rcvSumQty1Pallet)) { return false; }
            if (!xSV(_no, other._no)) { return false; }
            if (!xSV(_sum, other._sum)) { return false; }
            if (!xSV(_landing, other._landing)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _supplierrCvFlgCd);
        hs = xCH(hs, _shipCd);
        hs = xCH(hs, _supplierrCvNo1);
        hs = xCH(hs, _supplierrCvNo2);
        hs = xCH(hs, _supplierrCvNo);
        hs = xCH(hs, _shipmentDt);
        hs = xCH(hs, _arrivalDt);
        hs = xCH(hs, _plannedCar);
        hs = xCH(hs, _achievedCar);
        hs = xCH(hs, _transportationCo);
        hs = xCH(hs, _carNo);
        hs = xCH(hs, _sealNo1);
        hs = xCH(hs, _sealNo2);
        hs = xCH(hs, _sealNo3);
        hs = xCH(hs, _ccopamId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _supplierrCvFlg);
        hs = xCH(hs, _genericPalletNo);
        hs = xCH(hs, _otherPalletNo);
        hs = xCH(hs, _rcvSumQty1Pallet);
        hs = xCH(hs, _no);
        hs = xCH(hs, _sum);
        hs = xCH(hs, _landing);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_supplierrCvFlgCd));
        sb.append(dm).append(xfND(_shipCd));
        sb.append(dm).append(xfND(_supplierrCvNo1));
        sb.append(dm).append(xfND(_supplierrCvNo2));
        sb.append(dm).append(xfND(_supplierrCvNo));
        sb.append(dm).append(xfND(_shipmentDt));
        sb.append(dm).append(xfND(_arrivalDt));
        sb.append(dm).append(xfND(_plannedCar));
        sb.append(dm).append(xfND(_achievedCar));
        sb.append(dm).append(xfND(_transportationCo));
        sb.append(dm).append(xfND(_carNo));
        sb.append(dm).append(xfND(_sealNo1));
        sb.append(dm).append(xfND(_sealNo2));
        sb.append(dm).append(xfND(_sealNo3));
        sb.append(dm).append(xfND(_ccopamId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_supplierrCvFlg));
        sb.append(dm).append(xfND(_genericPalletNo));
        sb.append(dm).append(xfND(_otherPalletNo));
        sb.append(dm).append(xfND(_rcvSumQty1Pallet));
        sb.append(dm).append(xfND(_no));
        sb.append(dm).append(xfND(_sum));
        sb.append(dm).append(xfND(_landing));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlDispatchRecordInputList clone() {
        return (SqlDispatchRecordInputList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUPPLIERR_CV_FLG_CD: {char(1)} <br>
     * @return The value of the column 'SUPPLIERR_CV_FLG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrCvFlgCd() {
        checkSpecifiedProperty("supplierrCvFlgCd");
        return convertEmptyToNull(_supplierrCvFlgCd);
    }

    /**
     * [set] SUPPLIERR_CV_FLG_CD: {char(1)} <br>
     * @param supplierrCvFlgCd The value of the column 'SUPPLIERR_CV_FLG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrCvFlgCd(String supplierrCvFlgCd) {
        registerModifiedProperty("supplierrCvFlgCd");
        _supplierrCvFlgCd = supplierrCvFlgCd;
    }

    /**
     * [get] SHIP_CD: {varchar(30)} <br>
     * @return The value of the column 'SHIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipCd() {
        checkSpecifiedProperty("shipCd");
        return convertEmptyToNull(_shipCd);
    }

    /**
     * [set] SHIP_CD: {varchar(30)} <br>
     * @param shipCd The value of the column 'SHIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipCd(String shipCd) {
        registerModifiedProperty("shipCd");
        _shipCd = shipCd;
    }

    /**
     * [get] SUPPLIERR_CV_NO1: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERR_CV_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrCvNo1() {
        checkSpecifiedProperty("supplierrCvNo1");
        return convertEmptyToNull(_supplierrCvNo1);
    }

    /**
     * [set] SUPPLIERR_CV_NO1: {varchar(30)} <br>
     * @param supplierrCvNo1 The value of the column 'SUPPLIERR_CV_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrCvNo1(String supplierrCvNo1) {
        registerModifiedProperty("supplierrCvNo1");
        _supplierrCvNo1 = supplierrCvNo1;
    }

    /**
     * [get] SUPPLIERR_CV_NO2: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERR_CV_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrCvNo2() {
        checkSpecifiedProperty("supplierrCvNo2");
        return convertEmptyToNull(_supplierrCvNo2);
    }

    /**
     * [set] SUPPLIERR_CV_NO2: {varchar(30)} <br>
     * @param supplierrCvNo2 The value of the column 'SUPPLIERR_CV_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrCvNo2(String supplierrCvNo2) {
        registerModifiedProperty("supplierrCvNo2");
        _supplierrCvNo2 = supplierrCvNo2;
    }

    /**
     * [get] SUPPLIERR_CV_NO: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERR_CV_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrCvNo() {
        checkSpecifiedProperty("supplierrCvNo");
        return convertEmptyToNull(_supplierrCvNo);
    }

    /**
     * [set] SUPPLIERR_CV_NO: {varchar(30)} <br>
     * @param supplierrCvNo The value of the column 'SUPPLIERR_CV_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrCvNo(String supplierrCvNo) {
        registerModifiedProperty("supplierrCvNo");
        _supplierrCvNo = supplierrCvNo;
    }

    /**
     * [get] SHIPMENT_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPMENT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentDt() {
        checkSpecifiedProperty("shipmentDt");
        return convertEmptyToNull(_shipmentDt);
    }

    /**
     * [set] SHIPMENT_DT: {varchar(8)} <br>
     * @param shipmentDt The value of the column 'SHIPMENT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentDt(String shipmentDt) {
        registerModifiedProperty("shipmentDt");
        _shipmentDt = shipmentDt;
    }

    /**
     * [get] ARRIVAL_DT: {varchar(8)} <br>
     * @return The value of the column 'ARRIVAL_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalDt() {
        checkSpecifiedProperty("arrivalDt");
        return convertEmptyToNull(_arrivalDt);
    }

    /**
     * [set] ARRIVAL_DT: {varchar(8)} <br>
     * @param arrivalDt The value of the column 'ARRIVAL_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalDt(String arrivalDt) {
        registerModifiedProperty("arrivalDt");
        _arrivalDt = arrivalDt;
    }

    /**
     * [get] PLANNED_CAR: {varchar(100)} <br>
     * @return The value of the column 'PLANNED_CAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlannedCar() {
        checkSpecifiedProperty("plannedCar");
        return convertEmptyToNull(_plannedCar);
    }

    /**
     * [set] PLANNED_CAR: {varchar(100)} <br>
     * @param plannedCar The value of the column 'PLANNED_CAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlannedCar(String plannedCar) {
        registerModifiedProperty("plannedCar");
        _plannedCar = plannedCar;
    }

    /**
     * [get] ACHIEVED_CAR: {varchar(100)} <br>
     * @return The value of the column 'ACHIEVED_CAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getAchievedCar() {
        checkSpecifiedProperty("achievedCar");
        return convertEmptyToNull(_achievedCar);
    }

    /**
     * [set] ACHIEVED_CAR: {varchar(100)} <br>
     * @param achievedCar The value of the column 'ACHIEVED_CAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAchievedCar(String achievedCar) {
        registerModifiedProperty("achievedCar");
        _achievedCar = achievedCar;
    }

    /**
     * [get] TRANSPORTATION_CO: {varchar(60)} <br>
     * @return The value of the column 'TRANSPORTATION_CO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportationCo() {
        checkSpecifiedProperty("transportationCo");
        return convertEmptyToNull(_transportationCo);
    }

    /**
     * [set] TRANSPORTATION_CO: {varchar(60)} <br>
     * @param transportationCo The value of the column 'TRANSPORTATION_CO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportationCo(String transportationCo) {
        registerModifiedProperty("transportationCo");
        _transportationCo = transportationCo;
    }

    /**
     * [get] CAR_NO: {varchar(30)} <br>
     * @return The value of the column 'CAR_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarNo() {
        checkSpecifiedProperty("carNo");
        return convertEmptyToNull(_carNo);
    }

    /**
     * [set] CAR_NO: {varchar(30)} <br>
     * @param carNo The value of the column 'CAR_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarNo(String carNo) {
        registerModifiedProperty("carNo");
        _carNo = carNo;
    }

    /**
     * [get] SEAL_NO1: {varchar(30)} <br>
     * @return The value of the column 'SEAL_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSealNo1() {
        checkSpecifiedProperty("sealNo1");
        return convertEmptyToNull(_sealNo1);
    }

    /**
     * [set] SEAL_NO1: {varchar(30)} <br>
     * @param sealNo1 The value of the column 'SEAL_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSealNo1(String sealNo1) {
        registerModifiedProperty("sealNo1");
        _sealNo1 = sealNo1;
    }

    /**
     * [get] SEAL_NO2: {varchar(30)} <br>
     * @return The value of the column 'SEAL_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSealNo2() {
        checkSpecifiedProperty("sealNo2");
        return convertEmptyToNull(_sealNo2);
    }

    /**
     * [set] SEAL_NO2: {varchar(30)} <br>
     * @param sealNo2 The value of the column 'SEAL_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSealNo2(String sealNo2) {
        registerModifiedProperty("sealNo2");
        _sealNo2 = sealNo2;
    }

    /**
     * [get] SEAL_NO3: {varchar(30)} <br>
     * @return The value of the column 'SEAL_NO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSealNo3() {
        checkSpecifiedProperty("sealNo3");
        return convertEmptyToNull(_sealNo3);
    }

    /**
     * [set] SEAL_NO3: {varchar(30)} <br>
     * @param sealNo3 The value of the column 'SEAL_NO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSealNo3(String sealNo3) {
        registerModifiedProperty("sealNo3");
        _sealNo3 = sealNo3;
    }

    /**
     * [get] CCOPAM_ID: {bigint(19)} <br>
     * @return The value of the column 'CCOPAM_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCcopamId() {
        checkSpecifiedProperty("ccopamId");
        return _ccopamId;
    }

    /**
     * [set] CCOPAM_ID: {bigint(19)} <br>
     * @param ccopamId The value of the column 'CCOPAM_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCcopamId(Long ccopamId) {
        registerModifiedProperty("ccopamId");
        _ccopamId = ccopamId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] SUPPLIERR_CV_FLG: {varchar(100)} <br>
     * @return The value of the column 'SUPPLIERR_CV_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrCvFlg() {
        checkSpecifiedProperty("supplierrCvFlg");
        return convertEmptyToNull(_supplierrCvFlg);
    }

    /**
     * [set] SUPPLIERR_CV_FLG: {varchar(100)} <br>
     * @param supplierrCvFlg The value of the column 'SUPPLIERR_CV_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrCvFlg(String supplierrCvFlg) {
        registerModifiedProperty("supplierrCvFlg");
        _supplierrCvFlg = supplierrCvFlg;
    }

    /**
     * [get] GENERIC_PALLET_NO: {bigint(19)} <br>
     * @return The value of the column 'GENERIC_PALLET_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGenericPalletNo() {
        checkSpecifiedProperty("genericPalletNo");
        return _genericPalletNo;
    }

    /**
     * [set] GENERIC_PALLET_NO: {bigint(19)} <br>
     * @param genericPalletNo The value of the column 'GENERIC_PALLET_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenericPalletNo(Long genericPalletNo) {
        registerModifiedProperty("genericPalletNo");
        _genericPalletNo = genericPalletNo;
    }

    /**
     * [get] OTHER_PALLET_NO: {bigint(19)} <br>
     * @return The value of the column 'OTHER_PALLET_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtherPalletNo() {
        checkSpecifiedProperty("otherPalletNo");
        return _otherPalletNo;
    }

    /**
     * [set] OTHER_PALLET_NO: {bigint(19)} <br>
     * @param otherPalletNo The value of the column 'OTHER_PALLET_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherPalletNo(Long otherPalletNo) {
        registerModifiedProperty("otherPalletNo");
        _otherPalletNo = otherPalletNo;
    }

    /**
     * [get] RCV_SUM_QTY1_PALLET: {bigint(19)} <br>
     * @return The value of the column 'RCV_SUM_QTY1_PALLET'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvSumQty1Pallet() {
        checkSpecifiedProperty("rcvSumQty1Pallet");
        return _rcvSumQty1Pallet;
    }

    /**
     * [set] RCV_SUM_QTY1_PALLET: {bigint(19)} <br>
     * @param rcvSumQty1Pallet The value of the column 'RCV_SUM_QTY1_PALLET'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvSumQty1Pallet(Long rcvSumQty1Pallet) {
        registerModifiedProperty("rcvSumQty1Pallet");
        _rcvSumQty1Pallet = rcvSumQty1Pallet;
    }

    /**
     * [get] NO: {int(10)} <br>
     * @return The value of the column 'NO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNo() {
        checkSpecifiedProperty("no");
        return _no;
    }

    /**
     * [set] NO: {int(10)} <br>
     * @param no The value of the column 'NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNo(Integer no) {
        registerModifiedProperty("no");
        _no = no;
    }

    /**
     * [get] SUM: {int(10)} <br>
     * @return The value of the column 'SUM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSum() {
        checkSpecifiedProperty("sum");
        return _sum;
    }

    /**
     * [set] SUM: {int(10)} <br>
     * @param sum The value of the column 'SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSum(Integer sum) {
        registerModifiedProperty("sum");
        _sum = sum;
    }

    /**
     * [get] LANDING: {varchar(30)} <br>
     * @return The value of the column 'LANDING'. (NullAllowed even if selected: for no constraint)
     */
    public String getLanding() {
        checkSpecifiedProperty("landing");
        return convertEmptyToNull(_landing);
    }

    /**
     * [set] LANDING: {varchar(30)} <br>
     * @param landing The value of the column 'LANDING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLanding(String landing) {
        registerModifiedProperty("landing");
        _landing = landing;
    }
}
