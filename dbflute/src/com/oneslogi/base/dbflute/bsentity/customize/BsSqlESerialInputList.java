package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlESerialInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, SERIAL_INPUT_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PROCESS_TYPE, PROCESS_TYPE_NM, PRODUCT_CD, PRODUCT_ID, PRODUCT_NM, SERIAL_NO, SUPPLIER_CD, SUPPLIER_NM, SUPPLIER_ID, SUPPLIER_NM2, RECEIVE_SLIP_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_NM2, PICKING_WORK_NO, WORK_DT, MESSAGE_NM, VERSION_NO, CONTROL_NO
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
 * String receiveCd = entity.getReceiveCd();
 * Long serialInputId = entity.getSerialInputId();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String centerCd = entity.getCenterCd();
 * String processType = entity.getProcessType();
 * String processTypeNm = entity.getProcessTypeNm();
 * String productCd = entity.getProductCd();
 * Long productId = entity.getProductId();
 * String productNm = entity.getProductNm();
 * String serialNo = entity.getSerialNo();
 * String supplierCd = entity.getSupplierCd();
 * String supplierNm = entity.getSupplierNm();
 * Long supplierId = entity.getSupplierId();
 * String supplierNm2 = entity.getSupplierNm2();
 * String receiveSlipNo = entity.getReceiveSlipNo();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyCustomerNm2 = entity.getSupplyCustomerNm2();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String workDt = entity.getWorkDt();
 * String messageNm = entity.getMessageNm();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * entity.setReceiveCd(receiveCd);
 * entity.setSerialInputId(serialInputId);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setCenterCd(centerCd);
 * entity.setProcessType(processType);
 * entity.setProcessTypeNm(processTypeNm);
 * entity.setProductCd(productCd);
 * entity.setProductId(productId);
 * entity.setProductNm(productNm);
 * entity.setSerialNo(serialNo);
 * entity.setSupplierCd(supplierCd);
 * entity.setSupplierNm(supplierNm);
 * entity.setSupplierId(supplierId);
 * entity.setSupplierNm2(supplierNm2);
 * entity.setReceiveSlipNo(receiveSlipNo);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyCustomerNm2(supplyCustomerNm2);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setWorkDt(workDt);
 * entity.setMessageNm(messageNm);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlESerialInputList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_CD: {varchar(30)} */
    protected String _receiveCd;

    /** SERIAL_INPUT_ID: {bigint(19)} */
    protected Long _serialInputId;

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

    /** CENTER_CD: {varchar(255)} */
    protected String _centerCd;

    /** PROCESS_TYPE: {varchar(255)} */
    protected String _processType;

    /** PROCESS_TYPE_NM: {varchar(100)} */
    protected String _processTypeNm;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** SERIAL_NO: {varchar(255)} */
    protected String _serialNo;

    /** SUPPLIER_CD: {varchar(255)} */
    protected String _supplierCd;

    /** SUPPLIER_NM: {varchar(255)} */
    protected String _supplierNm;

    /** SUPPLIER_ID: {bigint(19)} */
    protected Long _supplierId;

    /** SUPPLIER_NM2: {varchar(60)} */
    protected String _supplierNm2;

    /** RECEIVE_SLIP_NO: {varchar(255)} */
    protected String _receiveSlipNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(255)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_NM2: {varchar(60)} */
    protected String _supplyCustomerNm2;

    /** PICKING_WORK_NO: {varchar(255)} */
    protected String _pickingWorkNo;

    /** WORK_DT: {varchar(255)} */
    protected String _workDt;

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlESerialInputListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlESerialInputList";
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
        if (obj instanceof BsSqlESerialInputList) {
            BsSqlESerialInputList other = (BsSqlESerialInputList)obj;
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_serialInputId, other._serialInputId)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_processType, other._processType)) { return false; }
            if (!xSV(_processTypeNm, other._processTypeNm)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_serialNo, other._serialNo)) { return false; }
            if (!xSV(_supplierCd, other._supplierCd)) { return false; }
            if (!xSV(_supplierNm, other._supplierNm)) { return false; }
            if (!xSV(_supplierId, other._supplierId)) { return false; }
            if (!xSV(_supplierNm2, other._supplierNm2)) { return false; }
            if (!xSV(_receiveSlipNo, other._receiveSlipNo)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_supplyCustomerId, other._supplyCustomerId)) { return false; }
            if (!xSV(_supplyCustomerNm2, other._supplyCustomerNm2)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _serialInputId);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _processType);
        hs = xCH(hs, _processTypeNm);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _serialNo);
        hs = xCH(hs, _supplierCd);
        hs = xCH(hs, _supplierNm);
        hs = xCH(hs, _supplierId);
        hs = xCH(hs, _supplierNm2);
        hs = xCH(hs, _receiveSlipNo);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _supplyCustomerId);
        hs = xCH(hs, _supplyCustomerNm2);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_serialInputId));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_processType));
        sb.append(dm).append(xfND(_processTypeNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_serialNo));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_supplierNm));
        sb.append(dm).append(xfND(_supplierId));
        sb.append(dm).append(xfND(_supplierNm2));
        sb.append(dm).append(xfND(_receiveSlipNo));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyCustomerNm2));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
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
    public SqlESerialInputList clone() {
        return (SqlESerialInputList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] SERIAL_INPUT_ID: {bigint(19)} <br>
     * @return The value of the column 'SERIAL_INPUT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSerialInputId() {
        checkSpecifiedProperty("serialInputId");
        return _serialInputId;
    }

    /**
     * [set] SERIAL_INPUT_ID: {bigint(19)} <br>
     * @param serialInputId The value of the column 'SERIAL_INPUT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSerialInputId(Long serialInputId) {
        registerModifiedProperty("serialInputId");
        _serialInputId = serialInputId;
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
     * [get] PROCESS_TYPE: {varchar(255)} <br>
     * @return The value of the column 'PROCESS_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessType() {
        checkSpecifiedProperty("processType");
        return convertEmptyToNull(_processType);
    }

    /**
     * [set] PROCESS_TYPE: {varchar(255)} <br>
     * @param processType The value of the column 'PROCESS_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessType(String processType) {
        registerModifiedProperty("processType");
        _processType = processType;
    }

    /**
     * [get] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeNm() {
        checkSpecifiedProperty("processTypeNm");
        return convertEmptyToNull(_processTypeNm);
    }

    /**
     * [set] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeNm(String processTypeNm) {
        registerModifiedProperty("processTypeNm");
        _processTypeNm = processTypeNm;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] SERIAL_NO: {varchar(255)} <br>
     * @return The value of the column 'SERIAL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSerialNo() {
        checkSpecifiedProperty("serialNo");
        return convertEmptyToNull(_serialNo);
    }

    /**
     * [set] SERIAL_NO: {varchar(255)} <br>
     * @param serialNo The value of the column 'SERIAL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSerialNo(String serialNo) {
        registerModifiedProperty("serialNo");
        _serialNo = serialNo;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierCd() {
        checkSpecifiedProperty("supplierCd");
        return convertEmptyToNull(_supplierCd);
    }

    /**
     * [set] SUPPLIER_CD: {varchar(255)} <br>
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierCd(String supplierCd) {
        registerModifiedProperty("supplierCd");
        _supplierCd = supplierCd;
    }

    /**
     * [get] SUPPLIER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierNm() {
        checkSpecifiedProperty("supplierNm");
        return convertEmptyToNull(_supplierNm);
    }

    /**
     * [set] SUPPLIER_NM: {varchar(255)} <br>
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierNm(String supplierNm) {
        registerModifiedProperty("supplierNm");
        _supplierNm = supplierNm;
    }

    /**
     * [get] SUPPLIER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplierId() {
        checkSpecifiedProperty("supplierId");
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {bigint(19)} <br>
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierId(Long supplierId) {
        registerModifiedProperty("supplierId");
        _supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_NM2: {varchar(60)} <br>
     * @return The value of the column 'SUPPLIER_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierNm2() {
        checkSpecifiedProperty("supplierNm2");
        return convertEmptyToNull(_supplierNm2);
    }

    /**
     * [set] SUPPLIER_NM2: {varchar(60)} <br>
     * @param supplierNm2 The value of the column 'SUPPLIER_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierNm2(String supplierNm2) {
        registerModifiedProperty("supplierNm2");
        _supplierNm2 = supplierNm2;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {varchar(255)} <br>
     * @return The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveSlipNo() {
        checkSpecifiedProperty("receiveSlipNo");
        return convertEmptyToNull(_receiveSlipNo);
    }

    /**
     * [set] RECEIVE_SLIP_NO: {varchar(255)} <br>
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        registerModifiedProperty("receiveSlipNo");
        _receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
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
     * [get] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplyCustomerId() {
        checkSpecifiedProperty("supplyCustomerId");
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        registerModifiedProperty("supplyCustomerId");
        _supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM2: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm2() {
        checkSpecifiedProperty("supplyCustomerNm2");
        return convertEmptyToNull(_supplyCustomerNm2);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM2: {varchar(60)} <br>
     * @param supplyCustomerNm2 The value of the column 'SUPPLY_CUSTOMER_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm2(String supplyCustomerNm2) {
        registerModifiedProperty("supplyCustomerNm2");
        _supplyCustomerNm2 = supplyCustomerNm2;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(255)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] WORK_DT: {varchar(255)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(255)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
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
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }
}
