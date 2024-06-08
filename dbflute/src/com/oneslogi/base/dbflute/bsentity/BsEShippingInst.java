package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of E_SHIPPING_INST as TABLE. <br>
 * 出荷指示受信
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_ID
 *
 * [column]
 *     SHIPPING_INST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, EMERGENCY_FLG, CLIENT_SHIPPING_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, PROCESS_TYPE_CD, DELIV_PLAN_DT, WORK_DT, SHIPPING_DT, DELIVERY_COURSE_CD, DELIV_DT, DELIV_TZ, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_TEL_NO, DELIV_ADDRESS_SUPPLY, PICKING_WORK_MESSAGE, PRODUCT_CD, PRODUCT_NM, DEPOSIT_CD, STOCK_TYPE_CD, INST_NUM, LOT, LIMIT_DT, WAREHOUSE_CD, LOCATION_CD, TOTAL_PRICE, TOTAL_TAX, UNIT_PRICE, PRICE, TAX, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_ID
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
 * Long shippingInstId = entity.getShippingInstId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String centerCd = entity.getCenterCd();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String clientShippingNo = entity.getClientShippingNo();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String processTypeCd = entity.getProcessTypeCd();
 * String delivPlanDt = entity.getDelivPlanDt();
 * String workDt = entity.getWorkDt();
 * String shippingDt = entity.getShippingDt();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivTelNo = entity.getDelivTelNo();
 * String delivAddressSupply = entity.getDelivAddressSupply();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String depositCd = entity.getDepositCd();
 * String stockTypeCd = entity.getStockTypeCd();
 * String instNum = entity.getInstNum();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * String warehouseCd = entity.getWarehouseCd();
 * String locationCd = entity.getLocationCd();
 * String totalPrice = entity.getTotalPrice();
 * String totalTax = entity.getTotalTax();
 * String unitPrice = entity.getUnitPrice();
 * String price = entity.getPrice();
 * String tax = entity.getTax();
 * String spareStr1 = entity.getSpareStr1();
 * String spareStr2 = entity.getSpareStr2();
 * String spareStr3 = entity.getSpareStr3();
 * String spareNum1 = entity.getSpareNum1();
 * String spareNum2 = entity.getSpareNum2();
 * String spareNum3 = entity.getSpareNum3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstId(shippingInstId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setCenterCd(centerCd);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setProcessTypeCd(processTypeCd);
 * entity.setDelivPlanDt(delivPlanDt);
 * entity.setWorkDt(workDt);
 * entity.setShippingDt(shippingDt);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDelivAddressSupply(delivAddressSupply);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setDepositCd(depositCd);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setInstNum(instNum);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setLocationCd(locationCd);
 * entity.setTotalPrice(totalPrice);
 * entity.setTotalTax(totalTax);
 * entity.setUnitPrice(unitPrice);
 * entity.setPrice(price);
 * entity.setTax(tax);
 * entity.setSpareStr1(spareStr1);
 * entity.setSpareStr2(spareStr2);
 * entity.setSpareStr3(spareStr3);
 * entity.setSpareNum1(spareNum1);
 * entity.setSpareNum2(spareNum2);
 * entity.setSpareNum3(spareNum3);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEShippingInst extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shippingInstId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(255)} */
    protected String _clientCd;

    /** CENTER_CD: {varchar(255)} */
    protected String _centerCd;

    /** EMERGENCY_FLG: {varchar(255)} */
    protected String _emergencyFlg;

    /** CLIENT_SHIPPING_NO: {varchar(255)} */
    protected String _clientShippingNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(255)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** PROCESS_TYPE_CD: {varchar(255)} */
    protected String _processTypeCd;

    /** DELIV_PLAN_DT: {varchar(255)} */
    protected String _delivPlanDt;

    /** WORK_DT: {varchar(255)} */
    protected String _workDt;

    /** SHIPPING_DT: {varchar(255)} */
    protected String _shippingDt;

    /** DELIVERY_COURSE_CD: {varchar(255)} */
    protected String _deliveryCourseCd;

    /** DELIV_DT: {varchar(255)} */
    protected String _delivDt;

    /** DELIV_TZ: {varchar(255)} */
    protected String _delivTz;

    /** DELIV_CUSTOMER_CD: {varchar(255)} */
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    protected String _delivCustomerNm;

    /** DELIV_ZIP_CD: {varchar(255)} */
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {varchar(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    protected String _delivAddress3;

    /** DELIV_TEL_NO: {varchar(255)} */
    protected String _delivTelNo;

    /** DELIV_ADDRESS_SUPPLY: {varchar(255)} */
    protected String _delivAddressSupply;

    /** PICKING_WORK_MESSAGE: {varchar(255)} */
    protected String _pickingWorkMessage;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** DEPOSIT_CD: {varchar(255)} */
    protected String _depositCd;

    /** STOCK_TYPE_CD: {varchar(255)} */
    protected String _stockTypeCd;

    /** INST_NUM: {varchar(255)} */
    protected String _instNum;

    /** LOT: {varchar(255)} */
    protected String _lot;

    /** LIMIT_DT: {varchar(255)} */
    protected String _limitDt;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** LOCATION_CD: {varchar(255)} */
    protected String _locationCd;

    /** TOTAL_PRICE: {varchar(255)} */
    protected String _totalPrice;

    /** TOTAL_TAX: {varchar(255)} */
    protected String _totalTax;

    /** UNIT_PRICE: {varchar(255)} */
    protected String _unitPrice;

    /** PRICE: {varchar(255)} */
    protected String _price;

    /** TAX: {varchar(255)} */
    protected String _tax;

    /** SPARE_STR_1: {varchar(255)} */
    protected String _spareStr1;

    /** SPARE_STR_2: {varchar(255)} */
    protected String _spareStr2;

    /** SPARE_STR_3: {varchar(255)} */
    protected String _spareStr3;

    /** SPARE_NUM_1: {varchar(255)} */
    protected String _spareNum1;

    /** SPARE_NUM_2: {varchar(255)} */
    protected String _spareNum2;

    /** SPARE_NUM_3: {varchar(255)} */
    protected String _spareNum3;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "E_SHIPPING_INST";
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
        if (_shippingInstId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param receiveCd : UQ+, IX, NotNull, varchar(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, bigint(19). (NotNull)
     */
    public void uniqueBy(String receiveCd, Long receiveRowId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("receiveCd");
        __uniqueDrivenProperties.addPropertyName("receiveRowId");
        setReceiveCd(receiveCd);setReceiveRowId(receiveRowId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsEShippingInst) {
            BsEShippingInst other = (BsEShippingInst)obj;
            if (!xSV(_shippingInstId, other._shippingInstId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_processTypeCd));
        sb.append(dm).append(xfND(_delivPlanDt));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_delivAddressSupply));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_depositCd));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_totalPrice));
        sb.append(dm).append(xfND(_totalTax));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_price));
        sb.append(dm).append(xfND(_tax));
        sb.append(dm).append(xfND(_spareStr1));
        sb.append(dm).append(xfND(_spareStr2));
        sb.append(dm).append(xfND(_spareStr3));
        sb.append(dm).append(xfND(_spareNum1));
        sb.append(dm).append(xfND(_spareNum2));
        sb.append(dm).append(xfND(_spareNum3));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
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
    public EShippingInst clone() {
        return (EShippingInst)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指示受信ID
     * @return The value of the column 'SHIPPING_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstId() {
        checkSpecifiedProperty("shippingInstId");
        return _shippingInstId;
    }

    /**
     * [set] SHIPPING_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指示受信ID
     * @param shippingInstId The value of the column 'SHIPPING_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstId(Long shippingInstId) {
        registerModifiedProperty("shippingInstId");
        _shippingInstId = shippingInstId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] EMERGENCY_FLG: {varchar(255)} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(255)} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(255)} <br>
     * 顧客出荷指示No.
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(255)} <br>
     * 顧客出荷指示No.
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * 処理区分CD
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * 処理区分CD
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
    }

    /**
     * [get] DELIV_PLAN_DT: {varchar(255)} <br>
     * 納品予定日
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivPlanDt() {
        checkSpecifiedProperty("delivPlanDt");
        return convertEmptyToNull(_delivPlanDt);
    }

    /**
     * [set] DELIV_PLAN_DT: {varchar(255)} <br>
     * 納品予定日
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        registerModifiedProperty("delivPlanDt");
        _delivPlanDt = delivPlanDt;
    }

    /**
     * [get] WORK_DT: {varchar(255)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(255)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(255)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(255)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(255)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(255)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIV_DT: {varchar(255)} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(255)} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(255)} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {varchar(255)} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(255)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(255)} <br>
     * 届先CD
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        registerModifiedProperty("delivCustomerCd");
        _delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 届先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * 届先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(255)} <br>
     * 届先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(255)} <br>
     * 届先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * 届先住所1
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * 届先住所1
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * 届先住所2
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * 届先住所2
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * 届先住所3
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * 届先住所3
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * 届先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * 届先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {varchar(255)} <br>
     * 届先住所補足
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressSupply() {
        checkSpecifiedProperty("delivAddressSupply");
        return convertEmptyToNull(_delivAddressSupply);
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {varchar(255)} <br>
     * 届先住所補足
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        registerModifiedProperty("delivAddressSupply");
        _delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * 出庫作業メッセージ
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * 出庫作業メッセージ
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] DEPOSIT_CD: {varchar(255)} <br>
     * 預託CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {varchar(255)} <br>
     * 預託CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] INST_NUM: {varchar(255)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInstNum() {
        checkSpecifiedProperty("instNum");
        return convertEmptyToNull(_instNum);
    }

    /**
     * [set] INST_NUM: {varchar(255)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum(String instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] LOT: {varchar(255)} <br>
     * 指定ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(255)} <br>
     * 指定ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(255)} <br>
     * 指定期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {varchar(255)} <br>
     * 指定期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 指定倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 指定倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * 指定ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * 指定ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] TOTAL_PRICE: {varchar(255)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return convertEmptyToNull(_totalPrice);
    }

    /**
     * [set] TOTAL_PRICE: {varchar(255)} <br>
     * 合計金額
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(String totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {varchar(255)} <br>
     * 合計消費税
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalTax() {
        checkSpecifiedProperty("totalTax");
        return convertEmptyToNull(_totalTax);
    }

    /**
     * [set] TOTAL_TAX: {varchar(255)} <br>
     * 合計消費税
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalTax(String totalTax) {
        registerModifiedProperty("totalTax");
        _totalTax = totalTax;
    }

    /**
     * [get] UNIT_PRICE: {varchar(255)} <br>
     * 価格
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return convertEmptyToNull(_unitPrice);
    }

    /**
     * [set] UNIT_PRICE: {varchar(255)} <br>
     * 価格
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(String unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] PRICE: {varchar(255)} <br>
     * 金額
     * @return The value of the column 'PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrice() {
        checkSpecifiedProperty("price");
        return convertEmptyToNull(_price);
    }

    /**
     * [set] PRICE: {varchar(255)} <br>
     * 金額
     * @param price The value of the column 'PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrice(String price) {
        registerModifiedProperty("price");
        _price = price;
    }

    /**
     * [get] TAX: {varchar(255)} <br>
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTax() {
        checkSpecifiedProperty("tax");
        return convertEmptyToNull(_tax);
    }

    /**
     * [set] TAX: {varchar(255)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(String tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr1() {
        checkSpecifiedProperty("spareStr1");
        return convertEmptyToNull(_spareStr1);
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr1(String spareStr1) {
        registerModifiedProperty("spareStr1");
        _spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr2() {
        checkSpecifiedProperty("spareStr2");
        return convertEmptyToNull(_spareStr2);
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr2(String spareStr2) {
        registerModifiedProperty("spareStr2");
        _spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr3() {
        checkSpecifiedProperty("spareStr3");
        return convertEmptyToNull(_spareStr3);
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr3(String spareStr3) {
        registerModifiedProperty("spareStr3");
        _spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * 予備項目１（数値）
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum1() {
        checkSpecifiedProperty("spareNum1");
        return convertEmptyToNull(_spareNum1);
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * 予備項目１（数値）
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum1(String spareNum1) {
        registerModifiedProperty("spareNum1");
        _spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * 予備項目２（数値）
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum2() {
        checkSpecifiedProperty("spareNum2");
        return convertEmptyToNull(_spareNum2);
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * 予備項目２（数値）
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum2(String spareNum2) {
        registerModifiedProperty("spareNum2");
        _spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * 予備項目３（数値）
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum3() {
        checkSpecifiedProperty("spareNum3");
        return convertEmptyToNull(_spareNum3);
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * 予備項目３（数値）
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum3(String spareNum3) {
        registerModifiedProperty("spareNum3");
        _spareNum3 = spareNum3;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
