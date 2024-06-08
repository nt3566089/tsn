package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlECustomerList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CUSTOMER_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ZIP_CD, ADDRESS1, ADDRESS2, ADDRESS3, TEL_NO, ALLOC_ORDER, SHIPPING_STOP_FLG, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, CENTER_CD, DELIVERY_COURSE_CD, DELIVERY_ORDER, DELIVERY_READTIME, MESSAGE_NM, CLIENT_ID, CLIENT_NM, MZ_ZIP_ID, ZIP_ADDRESS1, ZIP_ADDRESS2, ZIP_ADDRESS3, CENTER_ID, CENTER_NM, DELIVERY_COURSE_NM, DELIVERY_COURSE_ID, MDC_VERSION_NO, MCU_CUSTOMER_ID, MCU_VERSION_NO
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
 * Long customerId = entity.getCustomerId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String customerAbbr = entity.getCustomerAbbr();
 * String vendorFlg = entity.getVendorFlg();
 * String deliveryFlg = entity.getDeliveryFlg();
 * String onetimeFlg = entity.getOnetimeFlg();
 * String depositFlg = entity.getDepositFlg();
 * String zipCd = entity.getZipCd();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String telNo = entity.getTelNo();
 * String allocOrder = entity.getAllocOrder();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * String lotReverseFlg = entity.getLotReverseFlg();
 * String limitDtReverseFlg = entity.getLimitDtReverseFlg();
 * String centerCd = entity.getCenterCd();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryOrder = entity.getDeliveryOrder();
 * String deliveryReadtime = entity.getDeliveryReadtime();
 * String messageNm = entity.getMessageNm();
 * Long clientId = entity.getClientId();
 * String clientNm = entity.getClientNm();
 * Long mzZipId = entity.getMzZipId();
 * String zipAddress1 = entity.getZipAddress1();
 * String zipAddress2 = entity.getZipAddress2();
 * String zipAddress3 = entity.getZipAddress3();
 * Long centerId = entity.getCenterId();
 * String centerNm = entity.getCenterNm();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * Long mdcVersionNo = entity.getMdcVersionNo();
 * Long mcuCustomerId = entity.getMcuCustomerId();
 * Long mcuVersionNo = entity.getMcuVersionNo();
 * entity.setCustomerId(customerId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setCustomerAbbr(customerAbbr);
 * entity.setVendorFlg(vendorFlg);
 * entity.setDeliveryFlg(deliveryFlg);
 * entity.setOnetimeFlg(onetimeFlg);
 * entity.setDepositFlg(depositFlg);
 * entity.setZipCd(zipCd);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setTelNo(telNo);
 * entity.setAllocOrder(allocOrder);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setLotReverseFlg(lotReverseFlg);
 * entity.setLimitDtReverseFlg(limitDtReverseFlg);
 * entity.setCenterCd(centerCd);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryOrder(deliveryOrder);
 * entity.setDeliveryReadtime(deliveryReadtime);
 * entity.setMessageNm(messageNm);
 * entity.setClientId(clientId);
 * entity.setClientNm(clientNm);
 * entity.setMzZipId(mzZipId);
 * entity.setZipAddress1(zipAddress1);
 * entity.setZipAddress2(zipAddress2);
 * entity.setZipAddress3(zipAddress3);
 * entity.setCenterId(centerId);
 * entity.setCenterNm(centerNm);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setMdcVersionNo(mdcVersionNo);
 * entity.setMcuCustomerId(mcuCustomerId);
 * entity.setMcuVersionNo(mcuVersionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlECustomerList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CUSTOMER_ID: {bigint(19)} */
    protected Long _customerId;

    /** RECEIVE_CD: {varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(255)} */
    protected String _clientCd;

    /** CUSTOMER_CD: {varchar(255)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {varchar(255)} */
    protected String _customerNm;

    /** CUSTOMER_ABBR: {varchar(255)} */
    protected String _customerAbbr;

    /** VENDOR_FLG: {varchar(255)} */
    protected String _vendorFlg;

    /** DELIVERY_FLG: {varchar(255)} */
    protected String _deliveryFlg;

    /** ONETIME_FLG: {varchar(255)} */
    protected String _onetimeFlg;

    /** DEPOSIT_FLG: {varchar(255)} */
    protected String _depositFlg;

    /** ZIP_CD: {varchar(255)} */
    protected String _zipCd;

    /** ADDRESS1: {varchar(255)} */
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** TEL_NO: {varchar(255)} */
    protected String _telNo;

    /** ALLOC_ORDER: {varchar(255)} */
    protected String _allocOrder;

    /** SHIPPING_STOP_FLG: {varchar(255)} */
    protected String _shippingStopFlg;

    /** LOT_REVERSE_FLG: {varchar(255)} */
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {varchar(255)} */
    protected String _limitDtReverseFlg;

    /** CENTER_CD: {varchar(255)} */
    protected String _centerCd;

    /** DELIVERY_COURSE_CD: {varchar(255)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_ORDER: {varchar(255)} */
    protected String _deliveryOrder;

    /** DELIVERY_READTIME: {varchar(255)} */
    protected String _deliveryReadtime;

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** MZ_ZIP_ID: {bigint(19)} */
    protected Long _mzZipId;

    /** ZIP_ADDRESS1: {varchar(255)} */
    protected String _zipAddress1;

    /** ZIP_ADDRESS2: {varchar(255)} */
    protected String _zipAddress2;

    /** ZIP_ADDRESS3: {varchar(255)} */
    protected String _zipAddress3;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** DELIVERY_COURSE_ID: {bigint(19)} */
    protected Long _deliveryCourseId;

    /** MDC_VERSION_NO: {bigint(19)} */
    protected Long _mdcVersionNo;

    /** MCU_CUSTOMER_ID: {bigint(19)} */
    protected Long _mcuCustomerId;

    /** MCU_VERSION_NO: {bigint(19)} */
    protected Long _mcuVersionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlECustomerListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlECustomerList";
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
        if (obj instanceof BsSqlECustomerList) {
            BsSqlECustomerList other = (BsSqlECustomerList)obj;
            if (!xSV(_customerId, other._customerId)) { return false; }
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_customerCd, other._customerCd)) { return false; }
            if (!xSV(_customerNm, other._customerNm)) { return false; }
            if (!xSV(_customerAbbr, other._customerAbbr)) { return false; }
            if (!xSV(_vendorFlg, other._vendorFlg)) { return false; }
            if (!xSV(_deliveryFlg, other._deliveryFlg)) { return false; }
            if (!xSV(_onetimeFlg, other._onetimeFlg)) { return false; }
            if (!xSV(_depositFlg, other._depositFlg)) { return false; }
            if (!xSV(_zipCd, other._zipCd)) { return false; }
            if (!xSV(_address1, other._address1)) { return false; }
            if (!xSV(_address2, other._address2)) { return false; }
            if (!xSV(_address3, other._address3)) { return false; }
            if (!xSV(_telNo, other._telNo)) { return false; }
            if (!xSV(_allocOrder, other._allocOrder)) { return false; }
            if (!xSV(_shippingStopFlg, other._shippingStopFlg)) { return false; }
            if (!xSV(_lotReverseFlg, other._lotReverseFlg)) { return false; }
            if (!xSV(_limitDtReverseFlg, other._limitDtReverseFlg)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryOrder, other._deliveryOrder)) { return false; }
            if (!xSV(_deliveryReadtime, other._deliveryReadtime)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_mzZipId, other._mzZipId)) { return false; }
            if (!xSV(_zipAddress1, other._zipAddress1)) { return false; }
            if (!xSV(_zipAddress2, other._zipAddress2)) { return false; }
            if (!xSV(_zipAddress3, other._zipAddress3)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_deliveryCourseId, other._deliveryCourseId)) { return false; }
            if (!xSV(_mdcVersionNo, other._mdcVersionNo)) { return false; }
            if (!xSV(_mcuCustomerId, other._mcuCustomerId)) { return false; }
            if (!xSV(_mcuVersionNo, other._mcuVersionNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _customerId);
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _customerCd);
        hs = xCH(hs, _customerNm);
        hs = xCH(hs, _customerAbbr);
        hs = xCH(hs, _vendorFlg);
        hs = xCH(hs, _deliveryFlg);
        hs = xCH(hs, _onetimeFlg);
        hs = xCH(hs, _depositFlg);
        hs = xCH(hs, _zipCd);
        hs = xCH(hs, _address1);
        hs = xCH(hs, _address2);
        hs = xCH(hs, _address3);
        hs = xCH(hs, _telNo);
        hs = xCH(hs, _allocOrder);
        hs = xCH(hs, _shippingStopFlg);
        hs = xCH(hs, _lotReverseFlg);
        hs = xCH(hs, _limitDtReverseFlg);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryOrder);
        hs = xCH(hs, _deliveryReadtime);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _mzZipId);
        hs = xCH(hs, _zipAddress1);
        hs = xCH(hs, _zipAddress2);
        hs = xCH(hs, _zipAddress3);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _deliveryCourseId);
        hs = xCH(hs, _mdcVersionNo);
        hs = xCH(hs, _mcuCustomerId);
        hs = xCH(hs, _mcuVersionNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_customerAbbr));
        sb.append(dm).append(xfND(_vendorFlg));
        sb.append(dm).append(xfND(_deliveryFlg));
        sb.append(dm).append(xfND(_onetimeFlg));
        sb.append(dm).append(xfND(_depositFlg));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_telNo));
        sb.append(dm).append(xfND(_allocOrder));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_lotReverseFlg));
        sb.append(dm).append(xfND(_limitDtReverseFlg));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryOrder));
        sb.append(dm).append(xfND(_deliveryReadtime));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_mzZipId));
        sb.append(dm).append(xfND(_zipAddress1));
        sb.append(dm).append(xfND(_zipAddress2));
        sb.append(dm).append(xfND(_zipAddress3));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_mdcVersionNo));
        sb.append(dm).append(xfND(_mcuCustomerId));
        sb.append(dm).append(xfND(_mcuVersionNo));
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
    public SqlECustomerList clone() {
        return (SqlECustomerList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {bigint(19)} <br>
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {varchar(255)} <br>
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
    }

    /**
     * [get] CUSTOMER_ABBR: {varchar(255)} <br>
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerAbbr() {
        checkSpecifiedProperty("customerAbbr");
        return convertEmptyToNull(_customerAbbr);
    }

    /**
     * [set] CUSTOMER_ABBR: {varchar(255)} <br>
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerAbbr(String customerAbbr) {
        registerModifiedProperty("customerAbbr");
        _customerAbbr = customerAbbr;
    }

    /**
     * [get] VENDOR_FLG: {varchar(255)} <br>
     * @return The value of the column 'VENDOR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getVendorFlg() {
        checkSpecifiedProperty("vendorFlg");
        return convertEmptyToNull(_vendorFlg);
    }

    /**
     * [set] VENDOR_FLG: {varchar(255)} <br>
     * @param vendorFlg The value of the column 'VENDOR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorFlg(String vendorFlg) {
        registerModifiedProperty("vendorFlg");
        _vendorFlg = vendorFlg;
    }

    /**
     * [get] DELIVERY_FLG: {varchar(255)} <br>
     * @return The value of the column 'DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryFlg() {
        checkSpecifiedProperty("deliveryFlg");
        return convertEmptyToNull(_deliveryFlg);
    }

    /**
     * [set] DELIVERY_FLG: {varchar(255)} <br>
     * @param deliveryFlg The value of the column 'DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryFlg(String deliveryFlg) {
        registerModifiedProperty("deliveryFlg");
        _deliveryFlg = deliveryFlg;
    }

    /**
     * [get] ONETIME_FLG: {varchar(255)} <br>
     * @return The value of the column 'ONETIME_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOnetimeFlg() {
        checkSpecifiedProperty("onetimeFlg");
        return convertEmptyToNull(_onetimeFlg);
    }

    /**
     * [set] ONETIME_FLG: {varchar(255)} <br>
     * @param onetimeFlg The value of the column 'ONETIME_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOnetimeFlg(String onetimeFlg) {
        registerModifiedProperty("onetimeFlg");
        _onetimeFlg = onetimeFlg;
    }

    /**
     * [get] DEPOSIT_FLG: {varchar(255)} <br>
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositFlg() {
        checkSpecifiedProperty("depositFlg");
        return convertEmptyToNull(_depositFlg);
    }

    /**
     * [set] DEPOSIT_FLG: {varchar(255)} <br>
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositFlg(String depositFlg) {
        registerModifiedProperty("depositFlg");
        _depositFlg = depositFlg;
    }

    /**
     * [get] ZIP_CD: {varchar(255)} <br>
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {varchar(255)} <br>
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelNo() {
        checkSpecifiedProperty("telNo");
        return convertEmptyToNull(_telNo);
    }

    /**
     * [set] TEL_NO: {varchar(255)} <br>
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo(String telNo) {
        registerModifiedProperty("telNo");
        _telNo = telNo;
    }

    /**
     * [get] ALLOC_ORDER: {varchar(255)} <br>
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocOrder() {
        checkSpecifiedProperty("allocOrder");
        return convertEmptyToNull(_allocOrder);
    }

    /**
     * [set] ALLOC_ORDER: {varchar(255)} <br>
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocOrder(String allocOrder) {
        registerModifiedProperty("allocOrder");
        _allocOrder = allocOrder;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {varchar(255)} <br>
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] LOT_REVERSE_FLG: {varchar(255)} <br>
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotReverseFlg() {
        checkSpecifiedProperty("lotReverseFlg");
        return convertEmptyToNull(_lotReverseFlg);
    }

    /**
     * [set] LOT_REVERSE_FLG: {varchar(255)} <br>
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        registerModifiedProperty("lotReverseFlg");
        _lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtReverseFlg() {
        checkSpecifiedProperty("limitDtReverseFlg");
        return convertEmptyToNull(_limitDtReverseFlg);
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {varchar(255)} <br>
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        registerModifiedProperty("limitDtReverseFlg");
        _limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(255)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(255)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_ORDER: {varchar(255)} <br>
     * @return The value of the column 'DELIVERY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryOrder() {
        checkSpecifiedProperty("deliveryOrder");
        return convertEmptyToNull(_deliveryOrder);
    }

    /**
     * [set] DELIVERY_ORDER: {varchar(255)} <br>
     * @param deliveryOrder The value of the column 'DELIVERY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryOrder(String deliveryOrder) {
        registerModifiedProperty("deliveryOrder");
        _deliveryOrder = deliveryOrder;
    }

    /**
     * [get] DELIVERY_READTIME: {varchar(255)} <br>
     * @return The value of the column 'DELIVERY_READTIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryReadtime() {
        checkSpecifiedProperty("deliveryReadtime");
        return convertEmptyToNull(_deliveryReadtime);
    }

    /**
     * [set] DELIVERY_READTIME: {varchar(255)} <br>
     * @param deliveryReadtime The value of the column 'DELIVERY_READTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryReadtime(String deliveryReadtime) {
        registerModifiedProperty("deliveryReadtime");
        _deliveryReadtime = deliveryReadtime;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }

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
     * [get] MZ_ZIP_ID: {bigint(19)} <br>
     * @return The value of the column 'MZ_ZIP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMzZipId() {
        checkSpecifiedProperty("mzZipId");
        return _mzZipId;
    }

    /**
     * [set] MZ_ZIP_ID: {bigint(19)} <br>
     * @param mzZipId The value of the column 'MZ_ZIP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMzZipId(Long mzZipId) {
        registerModifiedProperty("mzZipId");
        _mzZipId = mzZipId;
    }

    /**
     * [get] ZIP_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'ZIP_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipAddress1() {
        checkSpecifiedProperty("zipAddress1");
        return convertEmptyToNull(_zipAddress1);
    }

    /**
     * [set] ZIP_ADDRESS1: {varchar(255)} <br>
     * @param zipAddress1 The value of the column 'ZIP_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipAddress1(String zipAddress1) {
        registerModifiedProperty("zipAddress1");
        _zipAddress1 = zipAddress1;
    }

    /**
     * [get] ZIP_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'ZIP_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipAddress2() {
        checkSpecifiedProperty("zipAddress2");
        return convertEmptyToNull(_zipAddress2);
    }

    /**
     * [set] ZIP_ADDRESS2: {varchar(255)} <br>
     * @param zipAddress2 The value of the column 'ZIP_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipAddress2(String zipAddress2) {
        registerModifiedProperty("zipAddress2");
        _zipAddress2 = zipAddress2;
    }

    /**
     * [get] ZIP_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'ZIP_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipAddress3() {
        checkSpecifiedProperty("zipAddress3");
        return convertEmptyToNull(_zipAddress3);
    }

    /**
     * [set] ZIP_ADDRESS3: {varchar(255)} <br>
     * @param zipAddress3 The value of the column 'ZIP_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipAddress3(String zipAddress3) {
        registerModifiedProperty("zipAddress3");
        _zipAddress3 = zipAddress3;
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
     * [get] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] MDC_VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'MDC_VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMdcVersionNo() {
        checkSpecifiedProperty("mdcVersionNo");
        return _mdcVersionNo;
    }

    /**
     * [set] MDC_VERSION_NO: {bigint(19)} <br>
     * @param mdcVersionNo The value of the column 'MDC_VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMdcVersionNo(Long mdcVersionNo) {
        registerModifiedProperty("mdcVersionNo");
        _mdcVersionNo = mdcVersionNo;
    }

    /**
     * [get] MCU_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCU_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMcuCustomerId() {
        checkSpecifiedProperty("mcuCustomerId");
        return _mcuCustomerId;
    }

    /**
     * [set] MCU_CUSTOMER_ID: {bigint(19)} <br>
     * @param mcuCustomerId The value of the column 'MCU_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcuCustomerId(Long mcuCustomerId) {
        registerModifiedProperty("mcuCustomerId");
        _mcuCustomerId = mcuCustomerId;
    }

    /**
     * [get] MCU_VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'MCU_VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMcuVersionNo() {
        checkSpecifiedProperty("mcuVersionNo");
        return _mcuVersionNo;
    }

    /**
     * [set] MCU_VERSION_NO: {bigint(19)} <br>
     * @param mcuVersionNo The value of the column 'MCU_VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcuVersionNo(Long mcuVersionNo) {
        registerModifiedProperty("mcuVersionNo");
        _mcuVersionNo = mcuVersionNo;
    }
}
