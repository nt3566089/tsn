package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlBillOfLadingPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PICKING_H_ID, PICKING_WORK_NO, SHIPPING_DT, CLIENT_NM, ADDRESS1, ZIP_CD_FROM, BOL_NO, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, ZIP_CD_TO, CARRIER_NM, CARRIER_CD, CARRIER_TRACE_NUM, PAYMENT_TERM, CLIENT_SHIPPING_NO, PKGS, WEIGHT
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
 * Long pickingHId = entity.getPickingHId();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String shippingDt = entity.getShippingDt();
 * String clientNm = entity.getClientNm();
 * String address1 = entity.getAddress1();
 * String zipCdFrom = entity.getZipCdFrom();
 * String bolNo = entity.getBolNo();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivAddress1 = entity.getDelivAddress1();
 * String zipCdTo = entity.getZipCdTo();
 * String carrierNm = entity.getCarrierNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierTraceNum = entity.getCarrierTraceNum();
 * String paymentTerm = entity.getPaymentTerm();
 * String clientShippingNo = entity.getClientShippingNo();
 * Long pkgs = entity.getPkgs();
 * java.math.BigDecimal weight = entity.getWeight();
 * entity.setPickingHId(pickingHId);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setShippingDt(shippingDt);
 * entity.setClientNm(clientNm);
 * entity.setAddress1(address1);
 * entity.setZipCdFrom(zipCdFrom);
 * entity.setBolNo(bolNo);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setZipCdTo(zipCdTo);
 * entity.setCarrierNm(carrierNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierTraceNum(carrierTraceNum);
 * entity.setPaymentTerm(paymentTerm);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setPkgs(pkgs);
 * entity.setWeight(weight);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlBillOfLadingPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_H_ID: {bigint(19)} */
    protected Long _pickingHId;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** ADDRESS1: {varchar(60)} */
    protected String _address1;

    /** ZIP_CD_FROM: {varchar(543)} */
    protected String _zipCdFrom;

    /** BOL_NO: {varchar(30)} */
    protected String _bolNo;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** ZIP_CD_TO: {varchar(543)} */
    protected String _zipCdTo;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

    /** CARRIER_CD: {varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    protected String _carrierTraceNum;

    /** PAYMENT_TERM: {varchar(30)} */
    protected String _paymentTerm;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    protected String _clientShippingNo;

    /** PKGS: {int(10)} */
    protected Long _pkgs;

    /** WEIGHT: {decimal(38, 6)} */
    protected java.math.BigDecimal _weight;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlBillOfLadingPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlBillOfLadingPrint";
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
        if (obj instanceof BsSqlBillOfLadingPrint) {
            BsSqlBillOfLadingPrint other = (BsSqlBillOfLadingPrint)obj;
            if (!xSV(_pickingHId, other._pickingHId)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_address1, other._address1)) { return false; }
            if (!xSV(_zipCdFrom, other._zipCdFrom)) { return false; }
            if (!xSV(_bolNo, other._bolNo)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_delivAddress1, other._delivAddress1)) { return false; }
            if (!xSV(_zipCdTo, other._zipCdTo)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierTraceNum, other._carrierTraceNum)) { return false; }
            if (!xSV(_paymentTerm, other._paymentTerm)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_pkgs, other._pkgs)) { return false; }
            if (!xSV(_weight, other._weight)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingHId);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _address1);
        hs = xCH(hs, _zipCdFrom);
        hs = xCH(hs, _bolNo);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _delivAddress1);
        hs = xCH(hs, _zipCdTo);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierTraceNum);
        hs = xCH(hs, _paymentTerm);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _pkgs);
        hs = xCH(hs, _weight);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_zipCdFrom));
        sb.append(dm).append(xfND(_bolNo));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_zipCdTo));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierTraceNum));
        sb.append(dm).append(xfND(_paymentTerm));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_pkgs));
        sb.append(dm).append(xfND(_weight));
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
    public SqlBillOfLadingPrint clone() {
        return (SqlBillOfLadingPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {bigint(19)} <br>
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
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
     * [get] ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(60)} <br>
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ZIP_CD_FROM: {varchar(543)} <br>
     * @return The value of the column 'ZIP_CD_FROM'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCdFrom() {
        checkSpecifiedProperty("zipCdFrom");
        return convertEmptyToNull(_zipCdFrom);
    }

    /**
     * [set] ZIP_CD_FROM: {varchar(543)} <br>
     * @param zipCdFrom The value of the column 'ZIP_CD_FROM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCdFrom(String zipCdFrom) {
        registerModifiedProperty("zipCdFrom");
        _zipCdFrom = zipCdFrom;
    }

    /**
     * [get] BOL_NO: {varchar(30)} <br>
     * @return The value of the column 'BOL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolNo() {
        checkSpecifiedProperty("bolNo");
        return convertEmptyToNull(_bolNo);
    }

    /**
     * [set] BOL_NO: {varchar(30)} <br>
     * @param bolNo The value of the column 'BOL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolNo(String bolNo) {
        registerModifiedProperty("bolNo");
        _bolNo = bolNo;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] ZIP_CD_TO: {varchar(543)} <br>
     * @return The value of the column 'ZIP_CD_TO'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCdTo() {
        checkSpecifiedProperty("zipCdTo");
        return convertEmptyToNull(_zipCdTo);
    }

    /**
     * [set] ZIP_CD_TO: {varchar(543)} <br>
     * @param zipCdTo The value of the column 'ZIP_CD_TO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCdTo(String zipCdTo) {
        registerModifiedProperty("zipCdTo");
        _zipCdTo = zipCdTo;
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
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTraceNum() {
        checkSpecifiedProperty("carrierTraceNum");
        return convertEmptyToNull(_carrierTraceNum);
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        registerModifiedProperty("carrierTraceNum");
        _carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] PAYMENT_TERM: {varchar(30)} <br>
     * @return The value of the column 'PAYMENT_TERM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentTerm() {
        checkSpecifiedProperty("paymentTerm");
        return convertEmptyToNull(_paymentTerm);
    }

    /**
     * [set] PAYMENT_TERM: {varchar(30)} <br>
     * @param paymentTerm The value of the column 'PAYMENT_TERM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentTerm(String paymentTerm) {
        registerModifiedProperty("paymentTerm");
        _paymentTerm = paymentTerm;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] PKGS: {int(10)} <br>
     * @return The value of the column 'PKGS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPkgs() {
        checkSpecifiedProperty("pkgs");
        return _pkgs;
    }

    /**
     * [set] PKGS: {int(10)} <br>
     * @param pkgs The value of the column 'PKGS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPkgs(Long pkgs) {
        registerModifiedProperty("pkgs");
        _pkgs = pkgs;
    }

    /**
     * [get] WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWeight() {
        checkSpecifiedProperty("weight");
        return _weight;
    }

    /**
     * [set] WEIGHT: {decimal(38, 6)} <br>
     * @param weight The value of the column 'WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeight(java.math.BigDecimal weight) {
        registerModifiedProperty("weight");
        _weight = weight;
    }
}
