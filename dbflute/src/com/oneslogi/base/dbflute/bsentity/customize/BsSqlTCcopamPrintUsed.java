package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTCcopamPrintUsed. <br>
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
 * String deliveryClassCd = entity.getDeliveryClassCd();
 * String shipCd = entity.getShipCd();
 * String snNo1 = entity.getSnNo1();
 * String snNo2 = entity.getSnNo2();
 * String snNo3 = entity.getSnNo3();
 * String snYMD = entity.getSnYMD();
 * String arvYMD = entity.getArvYMD();
 * String plnCarKnd = entity.getPlnCarKnd();
 * String amCarKnd = entity.getAmCarKnd();
 * String carrierNm = entity.getCarrierNm();
 * String carNo = entity.getCarNo();
 * String sealNo1 = entity.getSealNo1();
 * String sealNo2 = entity.getSealNo2();
 * String sealNo3 = entity.getSealNo3();
 * Long ccopamId = entity.getCcopamId();
 * String deliveryClass = entity.getDeliveryClass();
 * String shipNm = entity.getShipNm();
 * Long gnPltQa = entity.getGnPltQa();
 * Long otPltQa = entity.getOtPltQa();
 * Long rcvSumQty1Pallet = entity.getRcvSumQty1Pallet();
 * Integer no = entity.getNo();
 * Integer sum = entity.getSum();
 * entity.setDeliveryClassCd(deliveryClassCd);
 * entity.setShipCd(shipCd);
 * entity.setSnNo1(snNo1);
 * entity.setSnNo2(snNo2);
 * entity.setSnNo3(snNo3);
 * entity.setSnYMD(snYMD);
 * entity.setArvYMD(arvYMD);
 * entity.setPlnCarKnd(plnCarKnd);
 * entity.setAmCarKnd(amCarKnd);
 * entity.setCarrierNm(carrierNm);
 * entity.setCarNo(carNo);
 * entity.setSealNo1(sealNo1);
 * entity.setSealNo2(sealNo2);
 * entity.setSealNo3(sealNo3);
 * entity.setCcopamId(ccopamId);
 * entity.setDeliveryClass(deliveryClass);
 * entity.setShipNm(shipNm);
 * entity.setGnPltQa(gnPltQa);
 * entity.setOtPltQa(otPltQa);
 * entity.setRcvSumQty1Pallet(rcvSumQty1Pallet);
 * entity.setNo(no);
 * entity.setSum(sum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTCcopamPrintUsed extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DELIVERY_CLASS_CD: {char(1)} */
    protected String _deliveryClassCd;

    /** SHIP_CD: {varchar(30)} */
    protected String _shipCd;

    /** SN_NO1: {varchar(30)} */
    protected String _snNo1;

    /** SN_NO2: {varchar(30)} */
    protected String _snNo2;

    /** SN_NO3: {varchar(30)} */
    protected String _snNo3;

    /** SN_Y_M_D: {varchar(8)} */
    protected String _snYMD;

    /** ARV_Y_M_D: {varchar(8)} */
    protected String _arvYMD;

    /** PLN_CAR_KND: {varchar(255)} */
    protected String _plnCarKnd;

    /** AM_CAR_KND: {varchar(255)} */
    protected String _amCarKnd;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

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

    /** DELIVERY_CLASS: {varchar(100)} */
    protected String _deliveryClass;

    /** SHIP_NM: {varchar(30)} */
    protected String _shipNm;

    /** GN_PLT_QA: {bigint(19)} */
    protected Long _gnPltQa;

    /** OT_PLT_QA: {bigint(19)} */
    protected Long _otPltQa;

    /** RCV_SUM_QTY1_PALLET: {bigint(19)} */
    protected Long _rcvSumQty1Pallet;

    /** NO: {int(10)} */
    protected Integer _no;

    /** SUM: {int(10)} */
    protected Integer _sum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTCcopamPrintUsedDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTCcopamPrintUsed";
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
        if (obj instanceof BsSqlTCcopamPrintUsed) {
            BsSqlTCcopamPrintUsed other = (BsSqlTCcopamPrintUsed)obj;
            if (!xSV(_deliveryClassCd, other._deliveryClassCd)) { return false; }
            if (!xSV(_shipCd, other._shipCd)) { return false; }
            if (!xSV(_snNo1, other._snNo1)) { return false; }
            if (!xSV(_snNo2, other._snNo2)) { return false; }
            if (!xSV(_snNo3, other._snNo3)) { return false; }
            if (!xSV(_snYMD, other._snYMD)) { return false; }
            if (!xSV(_arvYMD, other._arvYMD)) { return false; }
            if (!xSV(_plnCarKnd, other._plnCarKnd)) { return false; }
            if (!xSV(_amCarKnd, other._amCarKnd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_carNo, other._carNo)) { return false; }
            if (!xSV(_sealNo1, other._sealNo1)) { return false; }
            if (!xSV(_sealNo2, other._sealNo2)) { return false; }
            if (!xSV(_sealNo3, other._sealNo3)) { return false; }
            if (!xSV(_ccopamId, other._ccopamId)) { return false; }
            if (!xSV(_deliveryClass, other._deliveryClass)) { return false; }
            if (!xSV(_shipNm, other._shipNm)) { return false; }
            if (!xSV(_gnPltQa, other._gnPltQa)) { return false; }
            if (!xSV(_otPltQa, other._otPltQa)) { return false; }
            if (!xSV(_rcvSumQty1Pallet, other._rcvSumQty1Pallet)) { return false; }
            if (!xSV(_no, other._no)) { return false; }
            if (!xSV(_sum, other._sum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deliveryClassCd);
        hs = xCH(hs, _shipCd);
        hs = xCH(hs, _snNo1);
        hs = xCH(hs, _snNo2);
        hs = xCH(hs, _snNo3);
        hs = xCH(hs, _snYMD);
        hs = xCH(hs, _arvYMD);
        hs = xCH(hs, _plnCarKnd);
        hs = xCH(hs, _amCarKnd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _carNo);
        hs = xCH(hs, _sealNo1);
        hs = xCH(hs, _sealNo2);
        hs = xCH(hs, _sealNo3);
        hs = xCH(hs, _ccopamId);
        hs = xCH(hs, _deliveryClass);
        hs = xCH(hs, _shipNm);
        hs = xCH(hs, _gnPltQa);
        hs = xCH(hs, _otPltQa);
        hs = xCH(hs, _rcvSumQty1Pallet);
        hs = xCH(hs, _no);
        hs = xCH(hs, _sum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deliveryClassCd));
        sb.append(dm).append(xfND(_shipCd));
        sb.append(dm).append(xfND(_snNo1));
        sb.append(dm).append(xfND(_snNo2));
        sb.append(dm).append(xfND(_snNo3));
        sb.append(dm).append(xfND(_snYMD));
        sb.append(dm).append(xfND(_arvYMD));
        sb.append(dm).append(xfND(_plnCarKnd));
        sb.append(dm).append(xfND(_amCarKnd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_carNo));
        sb.append(dm).append(xfND(_sealNo1));
        sb.append(dm).append(xfND(_sealNo2));
        sb.append(dm).append(xfND(_sealNo3));
        sb.append(dm).append(xfND(_ccopamId));
        sb.append(dm).append(xfND(_deliveryClass));
        sb.append(dm).append(xfND(_shipNm));
        sb.append(dm).append(xfND(_gnPltQa));
        sb.append(dm).append(xfND(_otPltQa));
        sb.append(dm).append(xfND(_rcvSumQty1Pallet));
        sb.append(dm).append(xfND(_no));
        sb.append(dm).append(xfND(_sum));
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
    public SqlTCcopamPrintUsed clone() {
        return (SqlTCcopamPrintUsed)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DELIVERY_CLASS_CD: {char(1)} <br>
     * @return The value of the column 'DELIVERY_CLASS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryClassCd() {
        checkSpecifiedProperty("deliveryClassCd");
        return convertEmptyToNull(_deliveryClassCd);
    }

    /**
     * [set] DELIVERY_CLASS_CD: {char(1)} <br>
     * @param deliveryClassCd The value of the column 'DELIVERY_CLASS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryClassCd(String deliveryClassCd) {
        registerModifiedProperty("deliveryClassCd");
        _deliveryClassCd = deliveryClassCd;
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
     * [get] SN_NO1: {varchar(30)} <br>
     * @return The value of the column 'SN_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnNo1() {
        checkSpecifiedProperty("snNo1");
        return convertEmptyToNull(_snNo1);
    }

    /**
     * [set] SN_NO1: {varchar(30)} <br>
     * @param snNo1 The value of the column 'SN_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnNo1(String snNo1) {
        registerModifiedProperty("snNo1");
        _snNo1 = snNo1;
    }

    /**
     * [get] SN_NO2: {varchar(30)} <br>
     * @return The value of the column 'SN_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnNo2() {
        checkSpecifiedProperty("snNo2");
        return convertEmptyToNull(_snNo2);
    }

    /**
     * [set] SN_NO2: {varchar(30)} <br>
     * @param snNo2 The value of the column 'SN_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnNo2(String snNo2) {
        registerModifiedProperty("snNo2");
        _snNo2 = snNo2;
    }

    /**
     * [get] SN_NO3: {varchar(30)} <br>
     * @return The value of the column 'SN_NO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnNo3() {
        checkSpecifiedProperty("snNo3");
        return convertEmptyToNull(_snNo3);
    }

    /**
     * [set] SN_NO3: {varchar(30)} <br>
     * @param snNo3 The value of the column 'SN_NO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnNo3(String snNo3) {
        registerModifiedProperty("snNo3");
        _snNo3 = snNo3;
    }

    /**
     * [get] SN_Y_M_D: {varchar(8)} <br>
     * @return The value of the column 'SN_Y_M_D'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnYMD() {
        checkSpecifiedProperty("snYMD");
        return convertEmptyToNull(_snYMD);
    }

    /**
     * [set] SN_Y_M_D: {varchar(8)} <br>
     * @param snYMD The value of the column 'SN_Y_M_D'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnYMD(String snYMD) {
        registerModifiedProperty("snYMD");
        _snYMD = snYMD;
    }

    /**
     * [get] ARV_Y_M_D: {varchar(8)} <br>
     * @return The value of the column 'ARV_Y_M_D'. (NullAllowed even if selected: for no constraint)
     */
    public String getArvYMD() {
        checkSpecifiedProperty("arvYMD");
        return convertEmptyToNull(_arvYMD);
    }

    /**
     * [set] ARV_Y_M_D: {varchar(8)} <br>
     * @param arvYMD The value of the column 'ARV_Y_M_D'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArvYMD(String arvYMD) {
        registerModifiedProperty("arvYMD");
        _arvYMD = arvYMD;
    }

    /**
     * [get] PLN_CAR_KND: {varchar(255)} <br>
     * @return The value of the column 'PLN_CAR_KND'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlnCarKnd() {
        checkSpecifiedProperty("plnCarKnd");
        return convertEmptyToNull(_plnCarKnd);
    }

    /**
     * [set] PLN_CAR_KND: {varchar(255)} <br>
     * @param plnCarKnd The value of the column 'PLN_CAR_KND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlnCarKnd(String plnCarKnd) {
        registerModifiedProperty("plnCarKnd");
        _plnCarKnd = plnCarKnd;
    }

    /**
     * [get] AM_CAR_KND: {varchar(255)} <br>
     * @return The value of the column 'AM_CAR_KND'. (NullAllowed even if selected: for no constraint)
     */
    public String getAmCarKnd() {
        checkSpecifiedProperty("amCarKnd");
        return convertEmptyToNull(_amCarKnd);
    }

    /**
     * [set] AM_CAR_KND: {varchar(255)} <br>
     * @param amCarKnd The value of the column 'AM_CAR_KND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmCarKnd(String amCarKnd) {
        registerModifiedProperty("amCarKnd");
        _amCarKnd = amCarKnd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
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
     * [get] DELIVERY_CLASS: {varchar(100)} <br>
     * @return The value of the column 'DELIVERY_CLASS'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryClass() {
        checkSpecifiedProperty("deliveryClass");
        return convertEmptyToNull(_deliveryClass);
    }

    /**
     * [set] DELIVERY_CLASS: {varchar(100)} <br>
     * @param deliveryClass The value of the column 'DELIVERY_CLASS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryClass(String deliveryClass) {
        registerModifiedProperty("deliveryClass");
        _deliveryClass = deliveryClass;
    }

    /**
     * [get] SHIP_NM: {varchar(30)} <br>
     * @return The value of the column 'SHIP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipNm() {
        checkSpecifiedProperty("shipNm");
        return convertEmptyToNull(_shipNm);
    }

    /**
     * [set] SHIP_NM: {varchar(30)} <br>
     * @param shipNm The value of the column 'SHIP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipNm(String shipNm) {
        registerModifiedProperty("shipNm");
        _shipNm = shipNm;
    }

    /**
     * [get] GN_PLT_QA: {bigint(19)} <br>
     * @return The value of the column 'GN_PLT_QA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGnPltQa() {
        checkSpecifiedProperty("gnPltQa");
        return _gnPltQa;
    }

    /**
     * [set] GN_PLT_QA: {bigint(19)} <br>
     * @param gnPltQa The value of the column 'GN_PLT_QA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGnPltQa(Long gnPltQa) {
        registerModifiedProperty("gnPltQa");
        _gnPltQa = gnPltQa;
    }

    /**
     * [get] OT_PLT_QA: {bigint(19)} <br>
     * @return The value of the column 'OT_PLT_QA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtPltQa() {
        checkSpecifiedProperty("otPltQa");
        return _otPltQa;
    }

    /**
     * [set] OT_PLT_QA: {bigint(19)} <br>
     * @param otPltQa The value of the column 'OT_PLT_QA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtPltQa(Long otPltQa) {
        registerModifiedProperty("otPltQa");
        _otPltQa = otPltQa;
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
}
