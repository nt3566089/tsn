package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlEShippingInstList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_INST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, EMERGENCY_FLG, CLIENT_SHIPPING_NO, SUPPLY_CUSTOMER_CD, PROCESS_TYPE_CD, DELIV_PLAN_DT, WORK_DT, SHIPPING_DT, DELIVERY_COURSE_CD, DELIV_DT, DELIV_TZ, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_TEL_NO, DELIV_ADDRESS_SUPPLY, PICKING_WORK_MESSAGE, PRODUCT_CD, PRODUCT_NM, DEPOSIT_CD, STOCK_TYPE_CD, INST_NUM, LOT, LIMIT_DT, WAREHOUSE_CD, LOCATION_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS, CLIENT_ID, CENTER_ID, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_NM, SUPPLY_CUSTOMER_ABBR, DELIVERY_COURSE_NM, PRODUCT_ID, MP_PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, DELIV_CUSTOMER_ID, ONE_CUSTOMER_NM, ZIP_CD, ADDRESS1, ADDRESS2, ADDRESS3, TEL_NO, ONETIME_FLG, MPT_PROCESS_TYPE_ID, PROCESS_TYPE_NM, STOCK_TYPE_NM, MST_STOCK_TYPE_ID, DEPOSIT_NM, DEPOSIT_ID, WAREHOUSE_ID, WAREHOUSE_NM, CCL_LOCATION_ID, CCL_LOCATION_NM, LCT_WAREHOUSE_CD, MESSAGE_NM, DELIVERY_COURSE_CD_0, DELIVERY_COURSE_NM_0, TOTAL_PRICE, TOTAL_TAX, UNIT_PRICE, PRICE, TAX, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3
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
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String supplyCustomerAbbr = entity.getSupplyCustomerAbbr();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * Long productId = entity.getProductId();
 * String mpProductNm = entity.getMpProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String lotManagFlg = entity.getLotManagFlg();
 * String limitDtManagFlg = entity.getLimitDtManagFlg();
 * Long delivCustomerId = entity.getDelivCustomerId();
 * String oneCustomerNm = entity.getOneCustomerNm();
 * String zipCd = entity.getZipCd();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String telNo = entity.getTelNo();
 * String onetimeFlg = entity.getOnetimeFlg();
 * Long mptProcessTypeId = entity.getMptProcessTypeId();
 * String processTypeNm = entity.getProcessTypeNm();
 * String stockTypeNm = entity.getStockTypeNm();
 * Long mstStockTypeId = entity.getMstStockTypeId();
 * String depositNm = entity.getDepositNm();
 * Long depositId = entity.getDepositId();
 * Long warehouseId = entity.getWarehouseId();
 * String warehouseNm = entity.getWarehouseNm();
 * Long cclLocationId = entity.getCclLocationId();
 * String cclLocationNm = entity.getCclLocationNm();
 * String lctWarehouseCd = entity.getLctWarehouseCd();
 * String messageNm = entity.getMessageNm();
 * String deliveryCourseCd0 = entity.getDeliveryCourseCd0();
 * String deliveryCourseNm0 = entity.getDeliveryCourseNm0();
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
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setSupplyCustomerAbbr(supplyCustomerAbbr);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setProductId(productId);
 * entity.setMpProductNm(mpProductNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setLotManagFlg(lotManagFlg);
 * entity.setLimitDtManagFlg(limitDtManagFlg);
 * entity.setDelivCustomerId(delivCustomerId);
 * entity.setOneCustomerNm(oneCustomerNm);
 * entity.setZipCd(zipCd);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setTelNo(telNo);
 * entity.setOnetimeFlg(onetimeFlg);
 * entity.setMptProcessTypeId(mptProcessTypeId);
 * entity.setProcessTypeNm(processTypeNm);
 * entity.setStockTypeNm(stockTypeNm);
 * entity.setMstStockTypeId(mstStockTypeId);
 * entity.setDepositNm(depositNm);
 * entity.setDepositId(depositId);
 * entity.setWarehouseId(warehouseId);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setCclLocationId(cclLocationId);
 * entity.setCclLocationNm(cclLocationNm);
 * entity.setLctWarehouseCd(lctWarehouseCd);
 * entity.setMessageNm(messageNm);
 * entity.setDeliveryCourseCd0(deliveryCourseCd0);
 * entity.setDeliveryCourseNm0(deliveryCourseNm0);
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
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlEShippingInstList extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_ID: {bigint(19)} */
    protected Long _shippingInstId;

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

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** EMERGENCY_FLG: {varchar(255)} */
    protected String _emergencyFlg;

    /** CLIENT_SHIPPING_NO: {varchar(255)} */
    protected String _clientShippingNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(255)} */
    protected String _supplyCustomerCd;

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

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
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

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ABBR: {varchar(60)} */
    protected String _supplyCustomerAbbr;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** MP_PRODUCT_NM: {varchar(255)} */
    protected String _mpProductNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** JAN_CD: {varchar(30)} */
    protected String _janCd;

    /** LOT_MANAG_FLG: {char(1), classification=LotManagFlg} */
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} */
    protected String _limitDtManagFlg;

    /** DELIV_CUSTOMER_ID: {bigint(19)} */
    protected Long _delivCustomerId;

    /** ONE_CUSTOMER_NM: {varchar(60)} */
    protected String _oneCustomerNm;

    /** ZIP_CD: {varchar(30)} */
    protected String _zipCd;

    /** ADDRESS1: {varchar(60)} */
    protected String _address1;

    /** ADDRESS2: {varchar(60)} */
    protected String _address2;

    /** ADDRESS3: {varchar(60)} */
    protected String _address3;

    /** TEL_NO: {varchar(30)} */
    protected String _telNo;

    /** ONETIME_FLG: {char(1), classification=OnetimeFlg} */
    protected String _onetimeFlg;

    /** MPT_PROCESS_TYPE_ID: {bigint(19)} */
    protected Long _mptProcessTypeId;

    /** PROCESS_TYPE_NM: {varchar(100)} */
    protected String _processTypeNm;

    /** STOCK_TYPE_NM: {varchar(100)} */
    protected String _stockTypeNm;

    /** MST_STOCK_TYPE_ID: {bigint(19)} */
    protected Long _mstStockTypeId;

    /** DEPOSIT_NM: {varchar(60)} */
    protected String _depositNm;

    /** DEPOSIT_ID: {bigint(19)} */
    protected Long _depositId;

    /** WAREHOUSE_ID: {bigint(19)} */
    protected Long _warehouseId;

    /** WAREHOUSE_NM: {varchar(60)} */
    protected String _warehouseNm;

    /** CCL_LOCATION_ID: {bigint(19)} */
    protected Long _cclLocationId;

    /** CCL_LOCATION_NM: {varchar(60)} */
    protected String _cclLocationNm;

    /** LCT_WAREHOUSE_CD: {varchar(30)} */
    protected String _lctWarehouseCd;

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** DELIVERY_COURSE_CD_0: {varchar(30)} */
    protected String _deliveryCourseCd0;

    /** DELIVERY_COURSE_NM_0: {varchar(60)} */
    protected String _deliveryCourseNm0;

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

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlEShippingInstListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlEShippingInstList";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * ロット管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotManagFlg getLotManagFlgAsLotManagFlg() {
        return CDef.LotManagFlg.codeOf(getLotManagFlg());
    }

    /**
     * Set the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotManagFlgAsLotManagFlg(CDef.LotManagFlg cdef) {
        setLotManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtManagFlg getLimitDtManagFlgAsLimitDtManagFlg() {
        return CDef.LimitDtManagFlg.codeOf(getLimitDtManagFlg());
    }

    /**
     * Set the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        setLimitDtManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of onetimeFlg as the classification of OnetimeFlg. <br>
     * ONETIME_FLG: {char(1), classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.OnetimeFlg getOnetimeFlgAsOnetimeFlg() {
        return CDef.OnetimeFlg.codeOf(getOnetimeFlg());
    }

    /**
     * Set the value of onetimeFlg as the classification of OnetimeFlg. <br>
     * ONETIME_FLG: {char(1), classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg cdef) {
        setOnetimeFlg(cdef != null ? cdef.code() : null);
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

    /**
     * Set the value of lotManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_$0() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$0);
    }

    /**
     * Set the value of lotManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotManagFlg_$1() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$1);
    }

    /**
     * Set the value of limitDtManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_$0() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    /**
     * Set the value of limitDtManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_$1() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    /**
     * Set the value of onetimeFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setOnetimeFlg_$0() {
        setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg.$0);
    }

    /**
     * Set the value of onetimeFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setOnetimeFlg_$1() {
        setOnetimeFlgAsOnetimeFlg(CDef.OnetimeFlg.$1);
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

    /**
     * Is the value of lotManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$0() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$0) : false;
    }

    /**
     * Is the value of lotManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$1() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$1) : false;
    }

    /**
     * Is the value of limitDtManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$0() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$0) : false;
    }

    /**
     * Is the value of limitDtManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$1() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$1) : false;
    }

    /**
     * Is the value of onetimeFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOnetimeFlg$0() {
        CDef.OnetimeFlg cdef = getOnetimeFlgAsOnetimeFlg();
        return cdef != null ? cdef.equals(CDef.OnetimeFlg.$0) : false;
    }

    /**
     * Is the value of onetimeFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOnetimeFlg$1() {
        CDef.OnetimeFlg cdef = getOnetimeFlgAsOnetimeFlg();
        return cdef != null ? cdef.equals(CDef.OnetimeFlg.$1) : false;
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

    /**
     * Get the value of the column 'lotManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotManagFlgName() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtManagFlgName() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'onetimeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOnetimeFlgName() {
        CDef.OnetimeFlg cdef = getOnetimeFlgAsOnetimeFlg();
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
        if (obj instanceof BsSqlEShippingInstList) {
            BsSqlEShippingInstList other = (BsSqlEShippingInstList)obj;
            if (!xSV(_shippingInstId, other._shippingInstId)) { return false; }
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_clientShippingNo, other._clientShippingNo)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_processTypeCd, other._processTypeCd)) { return false; }
            if (!xSV(_delivPlanDt, other._delivPlanDt)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_delivDt, other._delivDt)) { return false; }
            if (!xSV(_delivTz, other._delivTz)) { return false; }
            if (!xSV(_delivCustomerCd, other._delivCustomerCd)) { return false; }
            if (!xSV(_delivCustomerNm, other._delivCustomerNm)) { return false; }
            if (!xSV(_delivZipCd, other._delivZipCd)) { return false; }
            if (!xSV(_delivAddress1, other._delivAddress1)) { return false; }
            if (!xSV(_delivAddress2, other._delivAddress2)) { return false; }
            if (!xSV(_delivAddress3, other._delivAddress3)) { return false; }
            if (!xSV(_delivTelNo, other._delivTelNo)) { return false; }
            if (!xSV(_delivAddressSupply, other._delivAddressSupply)) { return false; }
            if (!xSV(_pickingWorkMessage, other._pickingWorkMessage)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_depositCd, other._depositCd)) { return false; }
            if (!xSV(_stockTypeCd, other._stockTypeCd)) { return false; }
            if (!xSV(_instNum, other._instNum)) { return false; }
            if (!xSV(_lot, other._lot)) { return false; }
            if (!xSV(_limitDt, other._limitDt)) { return false; }
            if (!xSV(_warehouseCd, other._warehouseCd)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_supplyCustomerId, other._supplyCustomerId)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_supplyCustomerAbbr, other._supplyCustomerAbbr)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_mpProductNm, other._mpProductNm)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_lotManagFlg, other._lotManagFlg)) { return false; }
            if (!xSV(_limitDtManagFlg, other._limitDtManagFlg)) { return false; }
            if (!xSV(_delivCustomerId, other._delivCustomerId)) { return false; }
            if (!xSV(_oneCustomerNm, other._oneCustomerNm)) { return false; }
            if (!xSV(_zipCd, other._zipCd)) { return false; }
            if (!xSV(_address1, other._address1)) { return false; }
            if (!xSV(_address2, other._address2)) { return false; }
            if (!xSV(_address3, other._address3)) { return false; }
            if (!xSV(_telNo, other._telNo)) { return false; }
            if (!xSV(_onetimeFlg, other._onetimeFlg)) { return false; }
            if (!xSV(_mptProcessTypeId, other._mptProcessTypeId)) { return false; }
            if (!xSV(_processTypeNm, other._processTypeNm)) { return false; }
            if (!xSV(_stockTypeNm, other._stockTypeNm)) { return false; }
            if (!xSV(_mstStockTypeId, other._mstStockTypeId)) { return false; }
            if (!xSV(_depositNm, other._depositNm)) { return false; }
            if (!xSV(_depositId, other._depositId)) { return false; }
            if (!xSV(_warehouseId, other._warehouseId)) { return false; }
            if (!xSV(_warehouseNm, other._warehouseNm)) { return false; }
            if (!xSV(_cclLocationId, other._cclLocationId)) { return false; }
            if (!xSV(_cclLocationNm, other._cclLocationNm)) { return false; }
            if (!xSV(_lctWarehouseCd, other._lctWarehouseCd)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_deliveryCourseCd0, other._deliveryCourseCd0)) { return false; }
            if (!xSV(_deliveryCourseNm0, other._deliveryCourseNm0)) { return false; }
            if (!xSV(_totalPrice, other._totalPrice)) { return false; }
            if (!xSV(_totalTax, other._totalTax)) { return false; }
            if (!xSV(_unitPrice, other._unitPrice)) { return false; }
            if (!xSV(_price, other._price)) { return false; }
            if (!xSV(_tax, other._tax)) { return false; }
            if (!xSV(_spareStr1, other._spareStr1)) { return false; }
            if (!xSV(_spareStr2, other._spareStr2)) { return false; }
            if (!xSV(_spareStr3, other._spareStr3)) { return false; }
            if (!xSV(_spareNum1, other._spareNum1)) { return false; }
            if (!xSV(_spareNum2, other._spareNum2)) { return false; }
            if (!xSV(_spareNum3, other._spareNum3)) { return false; }
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
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _clientShippingNo);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _processTypeCd);
        hs = xCH(hs, _delivPlanDt);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _delivDt);
        hs = xCH(hs, _delivTz);
        hs = xCH(hs, _delivCustomerCd);
        hs = xCH(hs, _delivCustomerNm);
        hs = xCH(hs, _delivZipCd);
        hs = xCH(hs, _delivAddress1);
        hs = xCH(hs, _delivAddress2);
        hs = xCH(hs, _delivAddress3);
        hs = xCH(hs, _delivTelNo);
        hs = xCH(hs, _delivAddressSupply);
        hs = xCH(hs, _pickingWorkMessage);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _depositCd);
        hs = xCH(hs, _stockTypeCd);
        hs = xCH(hs, _instNum);
        hs = xCH(hs, _lot);
        hs = xCH(hs, _limitDt);
        hs = xCH(hs, _warehouseCd);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _supplyCustomerId);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _supplyCustomerAbbr);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _mpProductNm);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _lotManagFlg);
        hs = xCH(hs, _limitDtManagFlg);
        hs = xCH(hs, _delivCustomerId);
        hs = xCH(hs, _oneCustomerNm);
        hs = xCH(hs, _zipCd);
        hs = xCH(hs, _address1);
        hs = xCH(hs, _address2);
        hs = xCH(hs, _address3);
        hs = xCH(hs, _telNo);
        hs = xCH(hs, _onetimeFlg);
        hs = xCH(hs, _mptProcessTypeId);
        hs = xCH(hs, _processTypeNm);
        hs = xCH(hs, _stockTypeNm);
        hs = xCH(hs, _mstStockTypeId);
        hs = xCH(hs, _depositNm);
        hs = xCH(hs, _depositId);
        hs = xCH(hs, _warehouseId);
        hs = xCH(hs, _warehouseNm);
        hs = xCH(hs, _cclLocationId);
        hs = xCH(hs, _cclLocationNm);
        hs = xCH(hs, _lctWarehouseCd);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _deliveryCourseCd0);
        hs = xCH(hs, _deliveryCourseNm0);
        hs = xCH(hs, _totalPrice);
        hs = xCH(hs, _totalTax);
        hs = xCH(hs, _unitPrice);
        hs = xCH(hs, _price);
        hs = xCH(hs, _tax);
        hs = xCH(hs, _spareStr1);
        hs = xCH(hs, _spareStr2);
        hs = xCH(hs, _spareStr3);
        hs = xCH(hs, _spareNum1);
        hs = xCH(hs, _spareNum2);
        hs = xCH(hs, _spareNum3);
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
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_supplyCustomerAbbr));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_mpProductNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_lotManagFlg));
        sb.append(dm).append(xfND(_limitDtManagFlg));
        sb.append(dm).append(xfND(_delivCustomerId));
        sb.append(dm).append(xfND(_oneCustomerNm));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_telNo));
        sb.append(dm).append(xfND(_onetimeFlg));
        sb.append(dm).append(xfND(_mptProcessTypeId));
        sb.append(dm).append(xfND(_processTypeNm));
        sb.append(dm).append(xfND(_stockTypeNm));
        sb.append(dm).append(xfND(_mstStockTypeId));
        sb.append(dm).append(xfND(_depositNm));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_cclLocationId));
        sb.append(dm).append(xfND(_cclLocationNm));
        sb.append(dm).append(xfND(_lctWarehouseCd));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_deliveryCourseCd0));
        sb.append(dm).append(xfND(_deliveryCourseNm0));
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
    public SqlEShippingInstList clone() {
        return (SqlEShippingInstList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstId() {
        checkSpecifiedProperty("shippingInstId");
        return _shippingInstId;
    }

    /**
     * [set] SHIPPING_INST_ID: {bigint(19)} <br>
     * @param shippingInstId The value of the column 'SHIPPING_INST_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstId(Long shippingInstId) {
        registerModifiedProperty("shippingInstId");
        _shippingInstId = shippingInstId;
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
     * [get] EMERGENCY_FLG: {varchar(255)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(255)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(255)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
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
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
    }

    /**
     * [get] DELIV_PLAN_DT: {varchar(255)} <br>
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivPlanDt() {
        checkSpecifiedProperty("delivPlanDt");
        return convertEmptyToNull(_delivPlanDt);
    }

    /**
     * [set] DELIV_PLAN_DT: {varchar(255)} <br>
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        registerModifiedProperty("delivPlanDt");
        _delivPlanDt = delivPlanDt;
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
     * [get] SHIPPING_DT: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(255)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
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
     * [get] DELIV_DT: {varchar(255)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(255)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {varchar(255)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(255)} <br>
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
     * [get] DELIV_ZIP_CD: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(255)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
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
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressSupply() {
        checkSpecifiedProperty("delivAddressSupply");
        return convertEmptyToNull(_delivAddressSupply);
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {varchar(255)} <br>
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        registerModifiedProperty("delivAddressSupply");
        _delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
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
     * [get] DEPOSIT_CD: {varchar(255)} <br>
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {varchar(255)} <br>
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] INST_NUM: {varchar(255)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInstNum() {
        checkSpecifiedProperty("instNum");
        return convertEmptyToNull(_instNum);
    }

    /**
     * [set] INST_NUM: {varchar(255)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum(String instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] LOT: {varchar(255)} <br>
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(255)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {varchar(255)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
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

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
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
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
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
     * [get] MP_PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'MP_PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMpProductNm() {
        checkSpecifiedProperty("mpProductNm");
        return convertEmptyToNull(_mpProductNm);
    }

    /**
     * [set] MP_PRODUCT_NM: {varchar(255)} <br>
     * @param mpProductNm The value of the column 'MP_PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMpProductNm(String mpProductNm) {
        registerModifiedProperty("mpProductNm");
        _mpProductNm = mpProductNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagFlg() {
        checkSpecifiedProperty("lotManagFlg");
        return convertEmptyToNull(_lotManagFlg);
    }

    /**
     * [set] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagFlg(String lotManagFlg) {
        registerModifiedProperty("lotManagFlg");
        _lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtManagFlg() {
        checkSpecifiedProperty("limitDtManagFlg");
        return convertEmptyToNull(_limitDtManagFlg);
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        registerModifiedProperty("limitDtManagFlg");
        _limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCustomerId() {
        checkSpecifiedProperty("delivCustomerId");
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {bigint(19)} <br>
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        registerModifiedProperty("delivCustomerId");
        _delivCustomerId = delivCustomerId;
    }

    /**
     * [get] ONE_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'ONE_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOneCustomerNm() {
        checkSpecifiedProperty("oneCustomerNm");
        return convertEmptyToNull(_oneCustomerNm);
    }

    /**
     * [set] ONE_CUSTOMER_NM: {varchar(60)} <br>
     * @param oneCustomerNm The value of the column 'ONE_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOneCustomerNm(String oneCustomerNm) {
        registerModifiedProperty("oneCustomerNm");
        _oneCustomerNm = oneCustomerNm;
    }

    /**
     * [get] ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {varchar(30)} <br>
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
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
     * [get] ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(60)} <br>
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(60)} <br>
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTelNo() {
        checkSpecifiedProperty("telNo");
        return convertEmptyToNull(_telNo);
    }

    /**
     * [set] TEL_NO: {varchar(30)} <br>
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTelNo(String telNo) {
        registerModifiedProperty("telNo");
        _telNo = telNo;
    }

    /**
     * [get] ONETIME_FLG: {char(1), classification=OnetimeFlg} <br>
     * // cls(OnetimeFlg)
     * @return The value of the column 'ONETIME_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOnetimeFlg() {
        checkSpecifiedProperty("onetimeFlg");
        return convertEmptyToNull(_onetimeFlg);
    }

    /**
     * [set] ONETIME_FLG: {char(1), classification=OnetimeFlg} <br>
     * // cls(OnetimeFlg)
     * @param onetimeFlg The value of the column 'ONETIME_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOnetimeFlg(String onetimeFlg) {
        registerModifiedProperty("onetimeFlg");
        _onetimeFlg = onetimeFlg;
    }

    /**
     * [get] MPT_PROCESS_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'MPT_PROCESS_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMptProcessTypeId() {
        checkSpecifiedProperty("mptProcessTypeId");
        return _mptProcessTypeId;
    }

    /**
     * [set] MPT_PROCESS_TYPE_ID: {bigint(19)} <br>
     * @param mptProcessTypeId The value of the column 'MPT_PROCESS_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMptProcessTypeId(Long mptProcessTypeId) {
        registerModifiedProperty("mptProcessTypeId");
        _mptProcessTypeId = mptProcessTypeId;
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
     * [get] STOCK_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeNm() {
        checkSpecifiedProperty("stockTypeNm");
        return convertEmptyToNull(_stockTypeNm);
    }

    /**
     * [set] STOCK_TYPE_NM: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeNm(String stockTypeNm) {
        registerModifiedProperty("stockTypeNm");
        _stockTypeNm = stockTypeNm;
    }

    /**
     * [get] MST_STOCK_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'MST_STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMstStockTypeId() {
        checkSpecifiedProperty("mstStockTypeId");
        return _mstStockTypeId;
    }

    /**
     * [set] MST_STOCK_TYPE_ID: {bigint(19)} <br>
     * @param mstStockTypeId The value of the column 'MST_STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMstStockTypeId(Long mstStockTypeId) {
        registerModifiedProperty("mstStockTypeId");
        _mstStockTypeId = mstStockTypeId;
    }

    /**
     * [get] DEPOSIT_NM: {varchar(60)} <br>
     * @return The value of the column 'DEPOSIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositNm() {
        checkSpecifiedProperty("depositNm");
        return convertEmptyToNull(_depositNm);
    }

    /**
     * [set] DEPOSIT_NM: {varchar(60)} <br>
     * @param depositNm The value of the column 'DEPOSIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositNm(String depositNm) {
        registerModifiedProperty("depositNm");
        _depositNm = depositNm;
    }

    /**
     * [get] DEPOSIT_ID: {bigint(19)} <br>
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {bigint(19)} <br>
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
    }

    /**
     * [get] WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {bigint(19)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] CCL_LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'CCL_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCclLocationId() {
        checkSpecifiedProperty("cclLocationId");
        return _cclLocationId;
    }

    /**
     * [set] CCL_LOCATION_ID: {bigint(19)} <br>
     * @param cclLocationId The value of the column 'CCL_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCclLocationId(Long cclLocationId) {
        registerModifiedProperty("cclLocationId");
        _cclLocationId = cclLocationId;
    }

    /**
     * [get] CCL_LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'CCL_LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCclLocationNm() {
        checkSpecifiedProperty("cclLocationNm");
        return convertEmptyToNull(_cclLocationNm);
    }

    /**
     * [set] CCL_LOCATION_NM: {varchar(60)} <br>
     * @param cclLocationNm The value of the column 'CCL_LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCclLocationNm(String cclLocationNm) {
        registerModifiedProperty("cclLocationNm");
        _cclLocationNm = cclLocationNm;
    }

    /**
     * [get] LCT_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'LCT_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLctWarehouseCd() {
        checkSpecifiedProperty("lctWarehouseCd");
        return convertEmptyToNull(_lctWarehouseCd);
    }

    /**
     * [set] LCT_WAREHOUSE_CD: {varchar(30)} <br>
     * @param lctWarehouseCd The value of the column 'LCT_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLctWarehouseCd(String lctWarehouseCd) {
        registerModifiedProperty("lctWarehouseCd");
        _lctWarehouseCd = lctWarehouseCd;
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
     * [get] DELIVERY_COURSE_CD_0: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD_0'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd0() {
        checkSpecifiedProperty("deliveryCourseCd0");
        return convertEmptyToNull(_deliveryCourseCd0);
    }

    /**
     * [set] DELIVERY_COURSE_CD_0: {varchar(30)} <br>
     * @param deliveryCourseCd0 The value of the column 'DELIVERY_COURSE_CD_0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd0(String deliveryCourseCd0) {
        registerModifiedProperty("deliveryCourseCd0");
        _deliveryCourseCd0 = deliveryCourseCd0;
    }

    /**
     * [get] DELIVERY_COURSE_NM_0: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM_0'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm0() {
        checkSpecifiedProperty("deliveryCourseNm0");
        return convertEmptyToNull(_deliveryCourseNm0);
    }

    /**
     * [set] DELIVERY_COURSE_NM_0: {varchar(60)} <br>
     * @param deliveryCourseNm0 The value of the column 'DELIVERY_COURSE_NM_0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm0(String deliveryCourseNm0) {
        registerModifiedProperty("deliveryCourseNm0");
        _deliveryCourseNm0 = deliveryCourseNm0;
    }

    /**
     * [get] TOTAL_PRICE: {varchar(255)} <br>
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return convertEmptyToNull(_totalPrice);
    }

    /**
     * [set] TOTAL_PRICE: {varchar(255)} <br>
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(String totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {varchar(255)} <br>
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalTax() {
        checkSpecifiedProperty("totalTax");
        return convertEmptyToNull(_totalTax);
    }

    /**
     * [set] TOTAL_TAX: {varchar(255)} <br>
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalTax(String totalTax) {
        registerModifiedProperty("totalTax");
        _totalTax = totalTax;
    }

    /**
     * [get] UNIT_PRICE: {varchar(255)} <br>
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return convertEmptyToNull(_unitPrice);
    }

    /**
     * [set] UNIT_PRICE: {varchar(255)} <br>
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(String unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] PRICE: {varchar(255)} <br>
     * @return The value of the column 'PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrice() {
        checkSpecifiedProperty("price");
        return convertEmptyToNull(_price);
    }

    /**
     * [set] PRICE: {varchar(255)} <br>
     * @param price The value of the column 'PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrice(String price) {
        registerModifiedProperty("price");
        _price = price;
    }

    /**
     * [get] TAX: {varchar(255)} <br>
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTax() {
        checkSpecifiedProperty("tax");
        return convertEmptyToNull(_tax);
    }

    /**
     * [set] TAX: {varchar(255)} <br>
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(String tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr1() {
        checkSpecifiedProperty("spareStr1");
        return convertEmptyToNull(_spareStr1);
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr1(String spareStr1) {
        registerModifiedProperty("spareStr1");
        _spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr2() {
        checkSpecifiedProperty("spareStr2");
        return convertEmptyToNull(_spareStr2);
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr2(String spareStr2) {
        registerModifiedProperty("spareStr2");
        _spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr3() {
        checkSpecifiedProperty("spareStr3");
        return convertEmptyToNull(_spareStr3);
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr3(String spareStr3) {
        registerModifiedProperty("spareStr3");
        _spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum1() {
        checkSpecifiedProperty("spareNum1");
        return convertEmptyToNull(_spareNum1);
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum1(String spareNum1) {
        registerModifiedProperty("spareNum1");
        _spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum2() {
        checkSpecifiedProperty("spareNum2");
        return convertEmptyToNull(_spareNum2);
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum2(String spareNum2) {
        registerModifiedProperty("spareNum2");
        _spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum3() {
        checkSpecifiedProperty("spareNum3");
        return convertEmptyToNull(_spareNum3);
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum3(String spareNum3) {
        registerModifiedProperty("spareNum3");
        _spareNum3 = spareNum3;
    }
}
