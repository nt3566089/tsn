package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlEShippingInstList. <br>
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
public abstract class BsSqlEShippingInstListDto implements Serializable {

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
    /** SHIPPING_INST_ID: {bigint(19)} */
    @JsonKey
    protected Long _shippingInstId;

    /** RECEIVE_CD: {varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** EMERGENCY_FLG: {varchar(255)} */
    @JsonKey
    protected String _emergencyFlg;

    /** CLIENT_SHIPPING_NO: {varchar(255)} */
    @JsonKey
    protected String _clientShippingNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** PROCESS_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _processTypeCd;

    /** DELIV_PLAN_DT: {varchar(255)} */
    @JsonKey
    protected String _delivPlanDt;

    /** WORK_DT: {varchar(255)} */
    @JsonKey
    protected String _workDt;

    /** SHIPPING_DT: {varchar(255)} */
    @JsonKey
    protected String _shippingDt;

    /** DELIVERY_COURSE_CD: {varchar(255)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIV_DT: {varchar(255)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {varchar(255)} */
    @JsonKey
    protected String _delivTz;

    /** DELIV_CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_ZIP_CD: {varchar(255)} */
    @JsonKey
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** DELIV_TEL_NO: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIV_ADDRESS_SUPPLY: {varchar(255)} */
    @JsonKey
    protected String _delivAddressSupply;

    /** PICKING_WORK_MESSAGE: {varchar(255)} */
    @JsonKey
    protected String _pickingWorkMessage;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** DEPOSIT_CD: {varchar(255)} */
    @JsonKey
    protected String _depositCd;

    /** STOCK_TYPE_CD: {varchar(255)} */
    @JsonKey
    protected String _stockTypeCd;

    /** INST_NUM: {varchar(255)} */
    @JsonKey
    protected String _instNum;

    /** LOT: {varchar(255)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {varchar(255)} */
    @JsonKey
    protected String _limitDt;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** LOCATION_CD: {varchar(255)} */
    @JsonKey
    protected String _locationCd;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ABBR: {varchar(60)} */
    @JsonKey
    protected String _supplyCustomerAbbr;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** MP_PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _mpProductNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** JAN_CD: {varchar(30)} */
    @JsonKey
    protected String _janCd;

    /** LOT_MANAG_FLG: {char(1), classification=LotManagFlg} */
    @JsonKey
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** DELIV_CUSTOMER_ID: {bigint(19)} */
    @JsonKey
    protected Long _delivCustomerId;

    /** ONE_CUSTOMER_NM: {varchar(60)} */
    @JsonKey
    protected String _oneCustomerNm;

    /** ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _zipCd;

    /** ADDRESS1: {varchar(60)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(60)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(60)} */
    @JsonKey
    protected String _address3;

    /** TEL_NO: {varchar(30)} */
    @JsonKey
    protected String _telNo;

    /** ONETIME_FLG: {char(1), classification=OnetimeFlg} */
    @JsonKey
    protected String _onetimeFlg;

    /** MPT_PROCESS_TYPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _mptProcessTypeId;

    /** PROCESS_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _processTypeNm;

    /** STOCK_TYPE_NM: {varchar(100)} */
    @JsonKey
    protected String _stockTypeNm;

    /** MST_STOCK_TYPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _mstStockTypeId;

    /** DEPOSIT_NM: {varchar(60)} */
    @JsonKey
    protected String _depositNm;

    /** DEPOSIT_ID: {bigint(19)} */
    @JsonKey
    protected Long _depositId;

    /** WAREHOUSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _warehouseId;

    /** WAREHOUSE_NM: {varchar(60)} */
    @JsonKey
    protected String _warehouseNm;

    /** CCL_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _cclLocationId;

    /** CCL_LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _cclLocationNm;

    /** LCT_WAREHOUSE_CD: {varchar(30)} */
    @JsonKey
    protected String _lctWarehouseCd;

    /** MESSAGE_NM: {varchar(4000)} */
    @JsonKey
    protected String _messageNm;

    /** DELIVERY_COURSE_CD_0: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd0;

    /** DELIVERY_COURSE_NM_0: {varchar(60)} */
    @JsonKey
    protected String _deliveryCourseNm0;

    /** TOTAL_PRICE: {varchar(255)} */
    @JsonKey
    protected String _totalPrice;

    /** TOTAL_TAX: {varchar(255)} */
    @JsonKey
    protected String _totalTax;

    /** UNIT_PRICE: {varchar(255)} */
    @JsonKey
    protected String _unitPrice;

    /** PRICE: {varchar(255)} */
    @JsonKey
    protected String _price;

    /** TAX: {varchar(255)} */
    @JsonKey
    protected String _tax;

    /** SPARE_STR_1: {varchar(255)} */
    @JsonKey
    protected String _spareStr1;

    /** SPARE_STR_2: {varchar(255)} */
    @JsonKey
    protected String _spareStr2;

    /** SPARE_STR_3: {varchar(255)} */
    @JsonKey
    protected String _spareStr3;

    /** SPARE_NUM_1: {varchar(255)} */
    @JsonKey
    protected String _spareNum1;

    /** SPARE_NUM_2: {varchar(255)} */
    @JsonKey
    protected String _spareNum2;

    /** SPARE_NUM_3: {varchar(255)} */
    @JsonKey
    protected String _spareNum3;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlEShippingInstListDto() {
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
        if (other == null || !(other instanceof BsSqlEShippingInstListDto)) { return false; }
        final BsSqlEShippingInstListDto otherEntity = (BsSqlEShippingInstListDto)other;
        if (!helpComparingValue(getShippingInstId(), otherEntity.getShippingInstId())) { return false; }
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getProcessTypeCd(), otherEntity.getProcessTypeCd())) { return false; }
        if (!helpComparingValue(getDelivPlanDt(), otherEntity.getDelivPlanDt())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDelivDt(), otherEntity.getDelivDt())) { return false; }
        if (!helpComparingValue(getDelivTz(), otherEntity.getDelivTz())) { return false; }
        if (!helpComparingValue(getDelivCustomerCd(), otherEntity.getDelivCustomerCd())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivZipCd(), otherEntity.getDelivZipCd())) { return false; }
        if (!helpComparingValue(getDelivAddress1(), otherEntity.getDelivAddress1())) { return false; }
        if (!helpComparingValue(getDelivAddress2(), otherEntity.getDelivAddress2())) { return false; }
        if (!helpComparingValue(getDelivAddress3(), otherEntity.getDelivAddress3())) { return false; }
        if (!helpComparingValue(getDelivTelNo(), otherEntity.getDelivTelNo())) { return false; }
        if (!helpComparingValue(getDelivAddressSupply(), otherEntity.getDelivAddressSupply())) { return false; }
        if (!helpComparingValue(getPickingWorkMessage(), otherEntity.getPickingWorkMessage())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getDepositCd(), otherEntity.getDepositCd())) { return false; }
        if (!helpComparingValue(getStockTypeCd(), otherEntity.getStockTypeCd())) { return false; }
        if (!helpComparingValue(getInstNum(), otherEntity.getInstNum())) { return false; }
        if (!helpComparingValue(getLot(), otherEntity.getLot())) { return false; }
        if (!helpComparingValue(getLimitDt(), otherEntity.getLimitDt())) { return false; }
        if (!helpComparingValue(getWarehouseCd(), otherEntity.getWarehouseCd())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        if (!helpComparingValue(getAddDt(), otherEntity.getAddDt())) { return false; }
        if (!helpComparingValue(getAddUser(), otherEntity.getAddUser())) { return false; }
        if (!helpComparingValue(getAddProcess(), otherEntity.getAddProcess())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getUpdProcess(), otherEntity.getUpdProcess())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerId(), otherEntity.getSupplyCustomerId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getSupplyCustomerAbbr(), otherEntity.getSupplyCustomerAbbr())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getMpProductNm(), otherEntity.getMpProductNm())) { return false; }
        if (!helpComparingValue(getProductAbbr(), otherEntity.getProductAbbr())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getLotManagFlg(), otherEntity.getLotManagFlg())) { return false; }
        if (!helpComparingValue(getLimitDtManagFlg(), otherEntity.getLimitDtManagFlg())) { return false; }
        if (!helpComparingValue(getDelivCustomerId(), otherEntity.getDelivCustomerId())) { return false; }
        if (!helpComparingValue(getOneCustomerNm(), otherEntity.getOneCustomerNm())) { return false; }
        if (!helpComparingValue(getZipCd(), otherEntity.getZipCd())) { return false; }
        if (!helpComparingValue(getAddress1(), otherEntity.getAddress1())) { return false; }
        if (!helpComparingValue(getAddress2(), otherEntity.getAddress2())) { return false; }
        if (!helpComparingValue(getAddress3(), otherEntity.getAddress3())) { return false; }
        if (!helpComparingValue(getTelNo(), otherEntity.getTelNo())) { return false; }
        if (!helpComparingValue(getOnetimeFlg(), otherEntity.getOnetimeFlg())) { return false; }
        if (!helpComparingValue(getMptProcessTypeId(), otherEntity.getMptProcessTypeId())) { return false; }
        if (!helpComparingValue(getProcessTypeNm(), otherEntity.getProcessTypeNm())) { return false; }
        if (!helpComparingValue(getStockTypeNm(), otherEntity.getStockTypeNm())) { return false; }
        if (!helpComparingValue(getMstStockTypeId(), otherEntity.getMstStockTypeId())) { return false; }
        if (!helpComparingValue(getDepositNm(), otherEntity.getDepositNm())) { return false; }
        if (!helpComparingValue(getDepositId(), otherEntity.getDepositId())) { return false; }
        if (!helpComparingValue(getWarehouseId(), otherEntity.getWarehouseId())) { return false; }
        if (!helpComparingValue(getWarehouseNm(), otherEntity.getWarehouseNm())) { return false; }
        if (!helpComparingValue(getCclLocationId(), otherEntity.getCclLocationId())) { return false; }
        if (!helpComparingValue(getCclLocationNm(), otherEntity.getCclLocationNm())) { return false; }
        if (!helpComparingValue(getLctWarehouseCd(), otherEntity.getLctWarehouseCd())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd0(), otherEntity.getDeliveryCourseCd0())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm0(), otherEntity.getDeliveryCourseNm0())) { return false; }
        if (!helpComparingValue(getTotalPrice(), otherEntity.getTotalPrice())) { return false; }
        if (!helpComparingValue(getTotalTax(), otherEntity.getTotalTax())) { return false; }
        if (!helpComparingValue(getUnitPrice(), otherEntity.getUnitPrice())) { return false; }
        if (!helpComparingValue(getPrice(), otherEntity.getPrice())) { return false; }
        if (!helpComparingValue(getTax(), otherEntity.getTax())) { return false; }
        if (!helpComparingValue(getSpareStr1(), otherEntity.getSpareStr1())) { return false; }
        if (!helpComparingValue(getSpareStr2(), otherEntity.getSpareStr2())) { return false; }
        if (!helpComparingValue(getSpareStr3(), otherEntity.getSpareStr3())) { return false; }
        if (!helpComparingValue(getSpareNum1(), otherEntity.getSpareNum1())) { return false; }
        if (!helpComparingValue(getSpareNum2(), otherEntity.getSpareNum2())) { return false; }
        if (!helpComparingValue(getSpareNum3(), otherEntity.getSpareNum3())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlEShippingInstList");
        result = xCH(result, getShippingInstId());
        result = xCH(result, getReceiveCd());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterCd());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getProcessTypeCd());
        result = xCH(result, getDelivPlanDt());
        result = xCH(result, getWorkDt());
        result = xCH(result, getShippingDt());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDelivDt());
        result = xCH(result, getDelivTz());
        result = xCH(result, getDelivCustomerCd());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getDelivZipCd());
        result = xCH(result, getDelivAddress1());
        result = xCH(result, getDelivAddress2());
        result = xCH(result, getDelivAddress3());
        result = xCH(result, getDelivTelNo());
        result = xCH(result, getDelivAddressSupply());
        result = xCH(result, getPickingWorkMessage());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getDepositCd());
        result = xCH(result, getStockTypeCd());
        result = xCH(result, getInstNum());
        result = xCH(result, getLot());
        result = xCH(result, getLimitDt());
        result = xCH(result, getWarehouseCd());
        result = xCH(result, getLocationCd());
        result = xCH(result, getDelFlg());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
        result = xCH(result, getAddDt());
        result = xCH(result, getAddUser());
        result = xCH(result, getAddProcess());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getUpdProcess());
        result = xCH(result, getClientId());
        result = xCH(result, getCenterId());
        result = xCH(result, getSupplyCustomerId());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getSupplyCustomerAbbr());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getProductId());
        result = xCH(result, getMpProductNm());
        result = xCH(result, getProductAbbr());
        result = xCH(result, getJanCd());
        result = xCH(result, getLotManagFlg());
        result = xCH(result, getLimitDtManagFlg());
        result = xCH(result, getDelivCustomerId());
        result = xCH(result, getOneCustomerNm());
        result = xCH(result, getZipCd());
        result = xCH(result, getAddress1());
        result = xCH(result, getAddress2());
        result = xCH(result, getAddress3());
        result = xCH(result, getTelNo());
        result = xCH(result, getOnetimeFlg());
        result = xCH(result, getMptProcessTypeId());
        result = xCH(result, getProcessTypeNm());
        result = xCH(result, getStockTypeNm());
        result = xCH(result, getMstStockTypeId());
        result = xCH(result, getDepositNm());
        result = xCH(result, getDepositId());
        result = xCH(result, getWarehouseId());
        result = xCH(result, getWarehouseNm());
        result = xCH(result, getCclLocationId());
        result = xCH(result, getCclLocationNm());
        result = xCH(result, getLctWarehouseCd());
        result = xCH(result, getMessageNm());
        result = xCH(result, getDeliveryCourseCd0());
        result = xCH(result, getDeliveryCourseNm0());
        result = xCH(result, getTotalPrice());
        result = xCH(result, getTotalTax());
        result = xCH(result, getUnitPrice());
        result = xCH(result, getPrice());
        result = xCH(result, getTax());
        result = xCH(result, getSpareStr1());
        result = xCH(result, getSpareStr2());
        result = xCH(result, getSpareStr3());
        result = xCH(result, getSpareNum1());
        result = xCH(result, getSpareNum2());
        result = xCH(result, getSpareNum3());
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
        sb.append(c).append(getShippingInstId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getProcessTypeCd());
        sb.append(c).append(getDelivPlanDt());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getDelivCustomerCd());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDelivAddressSupply());
        sb.append(c).append(getPickingWorkMessage());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getDepositCd());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getSupplyCustomerAbbr());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getProductId());
        sb.append(c).append(getMpProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getLotManagFlg());
        sb.append(c).append(getLimitDtManagFlg());
        sb.append(c).append(getDelivCustomerId());
        sb.append(c).append(getOneCustomerNm());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getTelNo());
        sb.append(c).append(getOnetimeFlg());
        sb.append(c).append(getMptProcessTypeId());
        sb.append(c).append(getProcessTypeNm());
        sb.append(c).append(getStockTypeNm());
        sb.append(c).append(getMstStockTypeId());
        sb.append(c).append(getDepositNm());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getCclLocationId());
        sb.append(c).append(getCclLocationNm());
        sb.append(c).append(getLctWarehouseCd());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getDeliveryCourseCd0());
        sb.append(c).append(getDeliveryCourseNm0());
        sb.append(c).append(getTotalPrice());
        sb.append(c).append(getTotalTax());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getPrice());
        sb.append(c).append(getTax());
        sb.append(c).append(getSpareStr1());
        sb.append(c).append(getSpareStr2());
        sb.append(c).append(getSpareStr3());
        sb.append(c).append(getSpareNum1());
        sb.append(c).append(getSpareNum2());
        sb.append(c).append(getSpareNum3());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_ID'. (NullAllowed)
     */
    public Long getShippingInstId() {
        return _shippingInstId;
    }

    /**
     * [set] SHIPPING_INST_ID: {bigint(19)} <br>
     * @param shippingInstId The value of the column 'SHIPPING_INST_ID'. (NullAllowed)
     */
    public void setShippingInstId(Long shippingInstId) {
        __modifiedProperties.add("shippingInstId");
        this._shippingInstId = shippingInstId;
    }

    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
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
     * [get] EMERGENCY_FLG: {varchar(255)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(255)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(255)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(255)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public String getProcessTypeCd() {
        return _processTypeCd;
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public void setProcessTypeCd(String processTypeCd) {
        __modifiedProperties.add("processTypeCd");
        this._processTypeCd = processTypeCd;
    }

    /**
     * [get] DELIV_PLAN_DT: {varchar(255)} <br>
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public String getDelivPlanDt() {
        return _delivPlanDt;
    }

    /**
     * [set] DELIV_PLAN_DT: {varchar(255)} <br>
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        __modifiedProperties.add("delivPlanDt");
        this._delivPlanDt = delivPlanDt;
    }

    /**
     * [get] WORK_DT: {varchar(255)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {varchar(255)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {varchar(255)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(255)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(255)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIV_DT: {varchar(255)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {varchar(255)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {varchar(255)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {varchar(255)} <br>
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        __modifiedProperties.add("delivCustomerCd");
        this._delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(255)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public String getDelivAddressSupply() {
        return _delivAddressSupply;
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {varchar(255)} <br>
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        __modifiedProperties.add("delivAddressSupply");
        this._delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public String getPickingWorkMessage() {
        return _pickingWorkMessage;
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        __modifiedProperties.add("pickingWorkMessage");
        this._pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] DEPOSIT_CD: {varchar(255)} <br>
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public String getDepositCd() {
        return _depositCd;
    }

    /**
     * [set] DEPOSIT_CD: {varchar(255)} <br>
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public void setDepositCd(String depositCd) {
        __modifiedProperties.add("depositCd");
        this._depositCd = depositCd;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] INST_NUM: {varchar(255)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public String getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {varchar(255)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(String instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] LOT: {varchar(255)} <br>
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {varchar(255)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {varchar(255)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
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
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        __modifiedProperties.add("supplyCustomerId");
        this._supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ABBR'. (NullAllowed)
     */
    public String getSupplyCustomerAbbr() {
        return _supplyCustomerAbbr;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ABBR: {varchar(60)} <br>
     * @param supplyCustomerAbbr The value of the column 'SUPPLY_CUSTOMER_ABBR'. (NullAllowed)
     */
    public void setSupplyCustomerAbbr(String supplyCustomerAbbr) {
        __modifiedProperties.add("supplyCustomerAbbr");
        this._supplyCustomerAbbr = supplyCustomerAbbr;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] MP_PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'MP_PRODUCT_NM'. (NullAllowed)
     */
    public String getMpProductNm() {
        return _mpProductNm;
    }

    /**
     * [set] MP_PRODUCT_NM: {varchar(255)} <br>
     * @param mpProductNm The value of the column 'MP_PRODUCT_NM'. (NullAllowed)
     */
    public void setMpProductNm(String mpProductNm) {
        __modifiedProperties.add("mpProductNm");
        this._mpProductNm = mpProductNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getDelivCustomerId() {
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {bigint(19)} <br>
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        __modifiedProperties.add("delivCustomerId");
        this._delivCustomerId = delivCustomerId;
    }

    /**
     * [get] ONE_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'ONE_CUSTOMER_NM'. (NullAllowed)
     */
    public String getOneCustomerNm() {
        return _oneCustomerNm;
    }

    /**
     * [set] ONE_CUSTOMER_NM: {varchar(60)} <br>
     * @param oneCustomerNm The value of the column 'ONE_CUSTOMER_NM'. (NullAllowed)
     */
    public void setOneCustomerNm(String oneCustomerNm) {
        __modifiedProperties.add("oneCustomerNm");
        this._oneCustomerNm = oneCustomerNm;
    }

    /**
     * [get] ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {varchar(30)} <br>
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {varchar(60)} <br>
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(60)} <br>
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(60)} <br>
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'TEL_NO'. (NullAllowed)
     */
    public String getTelNo() {
        return _telNo;
    }

    /**
     * [set] TEL_NO: {varchar(30)} <br>
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed)
     */
    public void setTelNo(String telNo) {
        __modifiedProperties.add("telNo");
        this._telNo = telNo;
    }

    /**
     * [get] ONETIME_FLG: {char(1), classification=OnetimeFlg} <br>
     * // cls(OnetimeFlg)
     * @return The value of the column 'ONETIME_FLG'. (NullAllowed)
     */
    public String getOnetimeFlg() {
        return _onetimeFlg;
    }

    /**
     * [set] ONETIME_FLG: {char(1), classification=OnetimeFlg} <br>
     * // cls(OnetimeFlg)
     * @param onetimeFlg The value of the column 'ONETIME_FLG'. (NullAllowed)
     */
    public void setOnetimeFlg(String onetimeFlg) {
        __modifiedProperties.add("onetimeFlg");
        this._onetimeFlg = onetimeFlg;
    }

    /**
     * [get] MPT_PROCESS_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'MPT_PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getMptProcessTypeId() {
        return _mptProcessTypeId;
    }

    /**
     * [set] MPT_PROCESS_TYPE_ID: {bigint(19)} <br>
     * @param mptProcessTypeId The value of the column 'MPT_PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setMptProcessTypeId(Long mptProcessTypeId) {
        __modifiedProperties.add("mptProcessTypeId");
        this._mptProcessTypeId = mptProcessTypeId;
    }

    /**
     * [get] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public String getProcessTypeNm() {
        return _processTypeNm;
    }

    /**
     * [set] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public void setProcessTypeNm(String processTypeNm) {
        __modifiedProperties.add("processTypeNm");
        this._processTypeNm = processTypeNm;
    }

    /**
     * [get] STOCK_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed)
     */
    public String getStockTypeNm() {
        return _stockTypeNm;
    }

    /**
     * [set] STOCK_TYPE_NM: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed)
     */
    public void setStockTypeNm(String stockTypeNm) {
        __modifiedProperties.add("stockTypeNm");
        this._stockTypeNm = stockTypeNm;
    }

    /**
     * [get] MST_STOCK_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'MST_STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getMstStockTypeId() {
        return _mstStockTypeId;
    }

    /**
     * [set] MST_STOCK_TYPE_ID: {bigint(19)} <br>
     * @param mstStockTypeId The value of the column 'MST_STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setMstStockTypeId(Long mstStockTypeId) {
        __modifiedProperties.add("mstStockTypeId");
        this._mstStockTypeId = mstStockTypeId;
    }

    /**
     * [get] DEPOSIT_NM: {varchar(60)} <br>
     * @return The value of the column 'DEPOSIT_NM'. (NullAllowed)
     */
    public String getDepositNm() {
        return _depositNm;
    }

    /**
     * [set] DEPOSIT_NM: {varchar(60)} <br>
     * @param depositNm The value of the column 'DEPOSIT_NM'. (NullAllowed)
     */
    public void setDepositNm(String depositNm) {
        __modifiedProperties.add("depositNm");
        this._depositNm = depositNm;
    }

    /**
     * [get] DEPOSIT_ID: {bigint(19)} <br>
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {bigint(19)} <br>
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {bigint(19)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
    }

    /**
     * [get] CCL_LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'CCL_LOCATION_ID'. (NullAllowed)
     */
    public Long getCclLocationId() {
        return _cclLocationId;
    }

    /**
     * [set] CCL_LOCATION_ID: {bigint(19)} <br>
     * @param cclLocationId The value of the column 'CCL_LOCATION_ID'. (NullAllowed)
     */
    public void setCclLocationId(Long cclLocationId) {
        __modifiedProperties.add("cclLocationId");
        this._cclLocationId = cclLocationId;
    }

    /**
     * [get] CCL_LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'CCL_LOCATION_NM'. (NullAllowed)
     */
    public String getCclLocationNm() {
        return _cclLocationNm;
    }

    /**
     * [set] CCL_LOCATION_NM: {varchar(60)} <br>
     * @param cclLocationNm The value of the column 'CCL_LOCATION_NM'. (NullAllowed)
     */
    public void setCclLocationNm(String cclLocationNm) {
        __modifiedProperties.add("cclLocationNm");
        this._cclLocationNm = cclLocationNm;
    }

    /**
     * [get] LCT_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'LCT_WAREHOUSE_CD'. (NullAllowed)
     */
    public String getLctWarehouseCd() {
        return _lctWarehouseCd;
    }

    /**
     * [set] LCT_WAREHOUSE_CD: {varchar(30)} <br>
     * @param lctWarehouseCd The value of the column 'LCT_WAREHOUSE_CD'. (NullAllowed)
     */
    public void setLctWarehouseCd(String lctWarehouseCd) {
        __modifiedProperties.add("lctWarehouseCd");
        this._lctWarehouseCd = lctWarehouseCd;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD_0: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD_0'. (NullAllowed)
     */
    public String getDeliveryCourseCd0() {
        return _deliveryCourseCd0;
    }

    /**
     * [set] DELIVERY_COURSE_CD_0: {varchar(30)} <br>
     * @param deliveryCourseCd0 The value of the column 'DELIVERY_COURSE_CD_0'. (NullAllowed)
     */
    public void setDeliveryCourseCd0(String deliveryCourseCd0) {
        __modifiedProperties.add("deliveryCourseCd0");
        this._deliveryCourseCd0 = deliveryCourseCd0;
    }

    /**
     * [get] DELIVERY_COURSE_NM_0: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM_0'. (NullAllowed)
     */
    public String getDeliveryCourseNm0() {
        return _deliveryCourseNm0;
    }

    /**
     * [set] DELIVERY_COURSE_NM_0: {varchar(60)} <br>
     * @param deliveryCourseNm0 The value of the column 'DELIVERY_COURSE_NM_0'. (NullAllowed)
     */
    public void setDeliveryCourseNm0(String deliveryCourseNm0) {
        __modifiedProperties.add("deliveryCourseNm0");
        this._deliveryCourseNm0 = deliveryCourseNm0;
    }

    /**
     * [get] TOTAL_PRICE: {varchar(255)} <br>
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public String getTotalPrice() {
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {varchar(255)} <br>
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public void setTotalPrice(String totalPrice) {
        __modifiedProperties.add("totalPrice");
        this._totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {varchar(255)} <br>
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public String getTotalTax() {
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {varchar(255)} <br>
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public void setTotalTax(String totalTax) {
        __modifiedProperties.add("totalTax");
        this._totalTax = totalTax;
    }

    /**
     * [get] UNIT_PRICE: {varchar(255)} <br>
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public String getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {varchar(255)} <br>
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(String unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] PRICE: {varchar(255)} <br>
     * @return The value of the column 'PRICE'. (NullAllowed)
     */
    public String getPrice() {
        return _price;
    }

    /**
     * [set] PRICE: {varchar(255)} <br>
     * @param price The value of the column 'PRICE'. (NullAllowed)
     */
    public void setPrice(String price) {
        __modifiedProperties.add("price");
        this._price = price;
    }

    /**
     * [get] TAX: {varchar(255)} <br>
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public String getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {varchar(255)} <br>
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(String tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public String getSpareStr1() {
        return _spareStr1;
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public void setSpareStr1(String spareStr1) {
        __modifiedProperties.add("spareStr1");
        this._spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public String getSpareStr2() {
        return _spareStr2;
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public void setSpareStr2(String spareStr2) {
        __modifiedProperties.add("spareStr2");
        this._spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public String getSpareStr3() {
        return _spareStr3;
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public void setSpareStr3(String spareStr3) {
        __modifiedProperties.add("spareStr3");
        this._spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public String getSpareNum1() {
        return _spareNum1;
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public void setSpareNum1(String spareNum1) {
        __modifiedProperties.add("spareNum1");
        this._spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public String getSpareNum2() {
        return _spareNum2;
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public void setSpareNum2(String spareNum2) {
        __modifiedProperties.add("spareNum2");
        this._spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public String getSpareNum3() {
        return _spareNum3;
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public void setSpareNum3(String spareNum3) {
        __modifiedProperties.add("spareNum3");
        this._spareNum3 = spareNum3;
    }

}
