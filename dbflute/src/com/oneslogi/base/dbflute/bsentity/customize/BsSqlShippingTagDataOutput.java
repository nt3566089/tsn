package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingTagDataOutput. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, ALLOC_INST_H_ID, SHIPPING_DT, WORK_DT, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_CUSTOMER_ABBR, PICKING_WORK_NO, CLIENT_SHIPPING_NO, SUM_PICKINGH_COUNT, EMERGENCY_FLG, INVOICE_CREATE_FLG, INVOICE_CREATE_DT
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
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * Long allocInstHId = entity.getAllocInstHId();
 * String shippingDt = entity.getShippingDt();
 * String workDt = entity.getWorkDt();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String carrierAbbr = entity.getCarrierAbbr();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String supplyCustomerAbbr = entity.getSupplyCustomerAbbr();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * Long sumPickinghCount = entity.getSumPickinghCount();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String invoiceCreateFlg = entity.getInvoiceCreateFlg();
 * java.sql.Timestamp invoiceCreateDt = entity.getInvoiceCreateDt();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setShippingDt(shippingDt);
 * entity.setWorkDt(workDt);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setCarrierAbbr(carrierAbbr);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setSupplyCustomerAbbr(supplyCustomerAbbr);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setSumPickinghCount(sumPickinghCount);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setInvoiceCreateFlg(invoiceCreateFlg);
 * entity.setInvoiceCreateDt(invoiceCreateDt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingTagDataOutput extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** ALLOC_INST_H_ID: {bigint(19)} */
    protected Long _allocInstHId;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

    /** CARRIER_ABBR: {varchar(60)} */
    protected String _carrierAbbr;

    /** DELIV_CUSTOMER_CD: {varchar(30)} */
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ABBR: {varchar(60)} */
    protected String _supplyCustomerAbbr;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    protected String _clientShippingNo;

    /** SUM_PICKINGH_COUNT: {int(10)} */
    protected Long _sumPickinghCount;

    /** EMERGENCY_FLG: {varchar(100)} */
    protected String _emergencyFlg;

    /** INVOICE_CREATE_FLG: {varchar(100)} */
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _invoiceCreateDt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingTagDataOutputDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingTagDataOutput";
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
        if (obj instanceof BsSqlShippingTagDataOutput) {
            BsSqlShippingTagDataOutput other = (BsSqlShippingTagDataOutput)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_allocInstHId, other._allocInstHId)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_carrierAbbr, other._carrierAbbr)) { return false; }
            if (!xSV(_delivCustomerCd, other._delivCustomerCd)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_delivAddress1, other._delivAddress1)) { return false; }
            if (!xSV(_delivAddress2, other._delivAddress2)) { return false; }
            if (!xSV(_delivAddress3, other._delivAddress3)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_supplyCustomerAbbr, other._supplyCustomerAbbr)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_sumPickinghCount, other._sumPickinghCount)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_invoiceCreateFlg, other._invoiceCreateFlg)) { return false; }
            if (!xSV(_invoiceCreateDt, other._invoiceCreateDt)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _allocInstHId);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _carrierAbbr);
        hs = xCH(hs, _delivCustomerCd);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _delivAddress1);
        hs = xCH(hs, _delivAddress2);
        hs = xCH(hs, _delivAddress3);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _supplyCustomerAbbr);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _sumPickinghCount);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _invoiceCreateFlg);
        hs = xCH(hs, _invoiceCreateDt);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_carrierAbbr));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_supplyCustomerAbbr));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_sumPickinghCount));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_invoiceCreateFlg));
        sb.append(dm).append(xfND(_invoiceCreateDt));
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
    public SqlShippingTagDataOutput clone() {
        return (SqlShippingTagDataOutput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
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
     * [get] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {bigint(19)} <br>
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
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
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
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
     * [get] CARRIER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierAbbr() {
        checkSpecifiedProperty("carrierAbbr");
        return convertEmptyToNull(_carrierAbbr);
    }

    /**
     * [set] CARRIER_ABBR: {varchar(60)} <br>
     * @param carrierAbbr The value of the column 'CARRIER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierAbbr(String carrierAbbr) {
        registerModifiedProperty("carrierAbbr");
        _carrierAbbr = carrierAbbr;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        registerModifiedProperty("delivCustomerCd");
        _delivCustomerCd = delivCustomerCd;
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
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerAbbr() {
        checkSpecifiedProperty("supplyCustomerAbbr");
        return convertEmptyToNull(_supplyCustomerAbbr);
    }

    /**
     * [set] SUPPLY_CUSTOMER_ABBR: {varchar(60)} <br>
     * @param supplyCustomerAbbr The value of the column 'SUPPLY_CUSTOMER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerAbbr(String supplyCustomerAbbr) {
        registerModifiedProperty("supplyCustomerAbbr");
        _supplyCustomerAbbr = supplyCustomerAbbr;
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
     * [get] SUM_PICKINGH_COUNT: {int(10)} <br>
     * @return The value of the column 'SUM_PICKINGH_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSumPickinghCount() {
        checkSpecifiedProperty("sumPickinghCount");
        return _sumPickinghCount;
    }

    /**
     * [set] SUM_PICKINGH_COUNT: {int(10)} <br>
     * @param sumPickinghCount The value of the column 'SUM_PICKINGH_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumPickinghCount(Long sumPickinghCount) {
        registerModifiedProperty("sumPickinghCount");
        _sumPickinghCount = sumPickinghCount;
    }

    /**
     * [get] EMERGENCY_FLG: {varchar(100)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(100)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {varchar(100)} <br>
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceCreateFlg() {
        checkSpecifiedProperty("invoiceCreateFlg");
        return convertEmptyToNull(_invoiceCreateFlg);
    }

    /**
     * [set] INVOICE_CREATE_FLG: {varchar(100)} <br>
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        registerModifiedProperty("invoiceCreateFlg");
        _invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'INVOICE_CREATE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInvoiceCreateDt() {
        checkSpecifiedProperty("invoiceCreateDt");
        return _invoiceCreateDt;
    }

    /**
     * [set] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * @param invoiceCreateDt The value of the column 'INVOICE_CREATE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateDt(java.sql.Timestamp invoiceCreateDt) {
        registerModifiedProperty("invoiceCreateDt");
        _invoiceCreateDt = invoiceCreateDt;
    }
}
