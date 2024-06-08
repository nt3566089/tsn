package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SHOP_IMPORT_SEND as TABLE. <br>
 * 販売店仕分情報送信テーブル(輸入)
 * <pre>
 * [primary-key]
 *     SHOP_IMPORT_SEND_ID
 *
 * [column]
 *     SHOP_IMPORT_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, SYMBOL_POS_KEY, WAREHOUSE_CD, WAREHOUSE_SNAME, FACTORY_CD, FACTORY_SNAME, ITEM_CD_CASE, ITEM_SNAME_CASE, ITEM_CD_WH, ITEM_SNAME_WH, RCV_KEY, MACHINE_NO, CREATE_NO, LIMIT_DATE_NOW, DESIGN_CD_CASE, FIRMTRANSPORT_NO, MANUFACTURE_CD, OTHER_LOT1, CASE_CREATE_TYPE, CODE_SNAME, RECEIVE_DATE, ARRIVAL_PORT_DATE, SHIP_NAME, INIT_NUM, MIXED_FLG, LEND_FLG, LOC_GROUP, LOC_CD, SHIP_DATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, SHIP_TO_CD, SHIP_TO_SNAME, CREATE_DATETIME, TRACE_TYPE, TRACE_TYPE_SNAME, EXAM_STS, CASE_IN_NUM, SHIPPING_NUM, ASSORT_DATETIME, LINE_BLOCK, ASSORTED_UNIT, ASSORTED_INDEX, OPERATION_CODE, OPERATION_NUM, ASSORT_NUM, ASSORT_DIF_NUM, DIRECTION_CD, PISTON_TYPE, CUSTOMER_CD, DIRECTION_NUM, SUPPLIER_RCV_NO, TOKUHAN_CD, TOKUHAN_SNAME, MAKER_CASE_NO, CASE_ITF_NO, CASE_BARCODE_VALIANT, CASE_LOT4, CASE_CENTER_NO, CASE_PACK_NO, CASE_PACK_TIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIER_NO, ORDER_NO, SRC_CD, BL_NO, INVOICE_NO, SSCC, CASE_NO, INV_NUM, SORT_NUM, ADOPT_NUM, DELIVERY_DATETIME, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHOP_IMPORT_SEND_ID
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
public abstract class BsEShopImportSendDto implements Serializable {

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
    /** SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shopImportSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _workFlg;

    /** SYMBOL_POS_KEY: {varchar(255)} */
    @JsonKey
    protected String _symbolPosKey;

    /** WAREHOUSE_CD: {varchar(255)} */
    @JsonKey
    protected String _warehouseCd;

    /** WAREHOUSE_SNAME: {varchar(255)} */
    @JsonKey
    protected String _warehouseSname;

    /** FACTORY_CD: {varchar(255)} */
    @JsonKey
    protected String _factoryCd;

    /** FACTORY_SNAME: {varchar(255)} */
    @JsonKey
    protected String _factorySname;

    /** ITEM_CD_CASE: {varchar(255)} */
    @JsonKey
    protected String _itemCdCase;

    /** ITEM_SNAME_CASE: {varchar(255)} */
    @JsonKey
    protected String _itemSnameCase;

    /** ITEM_CD_WH: {varchar(255)} */
    @JsonKey
    protected String _itemCdWh;

    /** ITEM_SNAME_WH: {varchar(255)} */
    @JsonKey
    protected String _itemSnameWh;

    /** RCV_KEY: {varchar(255)} */
    @JsonKey
    protected String _rcvKey;

    /** MACHINE_NO: {varchar(255)} */
    @JsonKey
    protected String _machineNo;

    /** CREATE_NO: {varchar(255)} */
    @JsonKey
    protected String _createNo;

    /** LIMIT_DATE_NOW: {varchar(255)} */
    @JsonKey
    protected String _limitDateNow;

    /** DESIGN_CD_CASE: {varchar(255)} */
    @JsonKey
    protected String _designCdCase;

    /** FIRMTRANSPORT_NO: {varchar(255)} */
    @JsonKey
    protected String _firmtransportNo;

    /** MANUFACTURE_CD: {varchar(255)} */
    @JsonKey
    protected String _manufactureCd;

    /** OTHER_LOT1: {varchar(255)} */
    @JsonKey
    protected String _otherLot1;

    /** CASE_CREATE_TYPE: {varchar(255)} */
    @JsonKey
    protected String _caseCreateType;

    /** CODE_SNAME: {varchar(255)} */
    @JsonKey
    protected String _codeSname;

    /** RECEIVE_DATE: {varchar(255)} */
    @JsonKey
    protected String _receiveDate;

    /** ARRIVAL_PORT_DATE: {varchar(255)} */
    @JsonKey
    protected String _arrivalPortDate;

    /** SHIP_NAME: {varchar(255)} */
    @JsonKey
    protected String _shipName;

    /** INIT_NUM: {varchar(255)} */
    @JsonKey
    protected String _initNum;

    /** MIXED_FLG: {varchar(255)} */
    @JsonKey
    protected String _mixedFlg;

    /** LEND_FLG: {varchar(255)} */
    @JsonKey
    protected String _lendFlg;

    /** LOC_GROUP: {varchar(255)} */
    @JsonKey
    protected String _locGroup;

    /** LOC_CD: {varchar(255)} */
    @JsonKey
    protected String _locCd;

    /** SHIP_DATE: {varchar(255)} */
    @JsonKey
    protected String _shipDate;

    /** CURRENT_LOCATION_CD: {varchar(255)} */
    @JsonKey
    protected String _currentLocationCd;

    /** CURRENT_LOCATION_SNAME: {varchar(255)} */
    @JsonKey
    protected String _currentLocationSname;

    /** SHIP_TO_CD: {varchar(255)} */
    @JsonKey
    protected String _shipToCd;

    /** SHIP_TO_SNAME: {varchar(255)} */
    @JsonKey
    protected String _shipToSname;

    /** CREATE_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _createDatetime;

    /** TRACE_TYPE: {varchar(255)} */
    @JsonKey
    protected String _traceType;

    /** TRACE_TYPE_SNAME: {varchar(255)} */
    @JsonKey
    protected String _traceTypeSname;

    /** EXAM_STS: {varchar(255)} */
    @JsonKey
    protected String _examSts;

    /** CASE_IN_NUM: {varchar(255)} */
    @JsonKey
    protected String _caseInNum;

    /** SHIPPING_NUM: {varchar(255)} */
    @JsonKey
    protected String _shippingNum;

    /** ASSORT_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _assortDatetime;

    /** LINE_BLOCK: {varchar(255)} */
    @JsonKey
    protected String _lineBlock;

    /** ASSORTED_UNIT: {varchar(255)} */
    @JsonKey
    protected String _assortedUnit;

    /** ASSORTED_INDEX: {varchar(255)} */
    @JsonKey
    protected String _assortedIndex;

    /** OPERATION_CODE: {varchar(255)} */
    @JsonKey
    protected String _operationCode;

    /** OPERATION_NUM: {varchar(255)} */
    @JsonKey
    protected String _operationNum;

    /** ASSORT_NUM: {varchar(255)} */
    @JsonKey
    protected String _assortNum;

    /** ASSORT_DIF_NUM: {varchar(255)} */
    @JsonKey
    protected String _assortDifNum;

    /** DIRECTION_CD: {varchar(255)} */
    @JsonKey
    protected String _directionCd;

    /** PISTON_TYPE: {varchar(255)} */
    @JsonKey
    protected String _pistonType;

    /** CUSTOMER_CD: {varchar(255)} */
    @JsonKey
    protected String _customerCd;

    /** DIRECTION_NUM: {varchar(255)} */
    @JsonKey
    protected String _directionNum;

    /** SUPPLIER_RCV_NO: {varchar(255)} */
    @JsonKey
    protected String _supplierRcvNo;

    /** TOKUHAN_CD: {varchar(255)} */
    @JsonKey
    protected String _tokuhanCd;

    /** TOKUHAN_SNAME: {varchar(255)} */
    @JsonKey
    protected String _tokuhanSname;

    /** MAKER_CASE_NO: {varchar(255)} */
    @JsonKey
    protected String _makerCaseNo;

    /** CASE_ITF_NO: {varchar(255)} */
    @JsonKey
    protected String _caseItfNo;

    /** CASE_BARCODE_VALIANT: {varchar(255)} */
    @JsonKey
    protected String _caseBarcodeValiant;

    /** CASE_LOT4: {varchar(255)} */
    @JsonKey
    protected String _caseLot4;

    /** CASE_CENTER_NO: {varchar(255)} */
    @JsonKey
    protected String _caseCenterNo;

    /** CASE_PACK_NO: {varchar(255)} */
    @JsonKey
    protected String _casePackNo;

    /** CASE_PACK_TIME: {varchar(255)} */
    @JsonKey
    protected String _casePackTime;

    /** SENDER_LOCATION: {varchar(255)} */
    @JsonKey
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(255)} */
    @JsonKey
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(255)} */
    @JsonKey
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(255)} */
    @JsonKey
    protected String _shipmentDate;

    /** NUMBER_OF_PALLETS: {varchar(255)} */
    @JsonKey
    protected String _numberOfPallets;

    /** CARRIER_NO: {varchar(255)} */
    @JsonKey
    protected String _carrierNo;

    /** ORDER_NO: {varchar(255)} */
    @JsonKey
    protected String _orderNo;

    /** SRC_CD: {varchar(255)} */
    @JsonKey
    protected String _srcCd;

    /** BL_NO: {varchar(255)} */
    @JsonKey
    protected String _blNo;

    /** INVOICE_NO: {varchar(255)} */
    @JsonKey
    protected String _invoiceNo;

    /** SSCC: {varchar(255)} */
    @JsonKey
    protected String _sscc;

    /** CASE_NO: {varchar(255)} */
    @JsonKey
    protected String _caseNo;

    /** INV_NUM: {varchar(255)} */
    @JsonKey
    protected String _invNum;

    /** SORT_NUM: {varchar(255)} */
    @JsonKey
    protected String _sortNum;

    /** ADOPT_NUM: {varchar(255)} */
    @JsonKey
    protected String _adoptNum;

    /** DELIVERY_DATETIME: {varchar(255)} */
    @JsonKey
    protected String _deliveryDatetime;

    /** SPARE_STR: {varchar(255)} */
    @JsonKey
    protected String _spareStr;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShopImportSendDto() {
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
        if (other == null || !(other instanceof BsEShopImportSendDto)) { return false; }
        final BsEShopImportSendDto otherEntity = (BsEShopImportSendDto)other;
        if (!helpComparingValue(getShopImportSendId(), otherEntity.getShopImportSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SHOP_IMPORT_SEND");
        result = xCH(result, getShopImportSendId());
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
        sb.append(c).append(getShopImportSendId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getSymbolPosKey());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseSname());
        sb.append(c).append(getFactoryCd());
        sb.append(c).append(getFactorySname());
        sb.append(c).append(getItemCdCase());
        sb.append(c).append(getItemSnameCase());
        sb.append(c).append(getItemCdWh());
        sb.append(c).append(getItemSnameWh());
        sb.append(c).append(getRcvKey());
        sb.append(c).append(getMachineNo());
        sb.append(c).append(getCreateNo());
        sb.append(c).append(getLimitDateNow());
        sb.append(c).append(getDesignCdCase());
        sb.append(c).append(getFirmtransportNo());
        sb.append(c).append(getManufactureCd());
        sb.append(c).append(getOtherLot1());
        sb.append(c).append(getCaseCreateType());
        sb.append(c).append(getCodeSname());
        sb.append(c).append(getReceiveDate());
        sb.append(c).append(getArrivalPortDate());
        sb.append(c).append(getShipName());
        sb.append(c).append(getInitNum());
        sb.append(c).append(getMixedFlg());
        sb.append(c).append(getLendFlg());
        sb.append(c).append(getLocGroup());
        sb.append(c).append(getLocCd());
        sb.append(c).append(getShipDate());
        sb.append(c).append(getCurrentLocationCd());
        sb.append(c).append(getCurrentLocationSname());
        sb.append(c).append(getShipToCd());
        sb.append(c).append(getShipToSname());
        sb.append(c).append(getCreateDatetime());
        sb.append(c).append(getTraceType());
        sb.append(c).append(getTraceTypeSname());
        sb.append(c).append(getExamSts());
        sb.append(c).append(getCaseInNum());
        sb.append(c).append(getShippingNum());
        sb.append(c).append(getAssortDatetime());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getAssortedUnit());
        sb.append(c).append(getAssortedIndex());
        sb.append(c).append(getOperationCode());
        sb.append(c).append(getOperationNum());
        sb.append(c).append(getAssortNum());
        sb.append(c).append(getAssortDifNum());
        sb.append(c).append(getDirectionCd());
        sb.append(c).append(getPistonType());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getDirectionNum());
        sb.append(c).append(getSupplierRcvNo());
        sb.append(c).append(getTokuhanCd());
        sb.append(c).append(getTokuhanSname());
        sb.append(c).append(getMakerCaseNo());
        sb.append(c).append(getCaseItfNo());
        sb.append(c).append(getCaseBarcodeValiant());
        sb.append(c).append(getCaseLot4());
        sb.append(c).append(getCaseCenterNo());
        sb.append(c).append(getCasePackNo());
        sb.append(c).append(getCasePackTime());
        sb.append(c).append(getSenderLocation());
        sb.append(c).append(getReceiverLocation());
        sb.append(c).append(getShipmentId());
        sb.append(c).append(getShipmentDate());
        sb.append(c).append(getNumberOfPallets());
        sb.append(c).append(getCarrierNo());
        sb.append(c).append(getOrderNo());
        sb.append(c).append(getSrcCd());
        sb.append(c).append(getBlNo());
        sb.append(c).append(getInvoiceNo());
        sb.append(c).append(getSscc());
        sb.append(c).append(getCaseNo());
        sb.append(c).append(getInvNum());
        sb.append(c).append(getSortNum());
        sb.append(c).append(getAdoptNum());
        sb.append(c).append(getDeliveryDatetime());
        sb.append(c).append(getSpareStr());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売店仕分情報送信(輸入)ID
     * @return The value of the column 'SHOP_IMPORT_SEND_ID'. (NullAllowed)
     */
    public Long getShopImportSendId() {
        return _shopImportSendId;
    }

    /**
     * [set] SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売店仕分情報送信(輸入)ID
     * @param shopImportSendId The value of the column 'SHOP_IMPORT_SEND_ID'. (NullAllowed)
     */
    public void setShopImportSendId(Long shopImportSendId) {
        __modifiedProperties.add("shopImportSendId");
        this._shopImportSendId = shopImportSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @return The value of the column 'SYMBOL_POS_KEY'. (NullAllowed)
     */
    public String getSymbolPosKey() {
        return _symbolPosKey;
    }

    /**
     * [set] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @param symbolPosKey The value of the column 'SYMBOL_POS_KEY'. (NullAllowed)
     */
    public void setSymbolPosKey(String symbolPosKey) {
        __modifiedProperties.add("symbolPosKey");
        this._symbolPosKey = symbolPosKey;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 作成拠点コード
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 作成拠点コード
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 作成拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public String getWarehouseSname() {
        return _warehouseSname;
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 作成拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public void setWarehouseSname(String warehouseSname) {
        __modifiedProperties.add("warehouseSname");
        this._warehouseSname = warehouseSname;
    }

    /**
     * [get] FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @return The value of the column 'FACTORY_CD'. (NullAllowed)
     */
    public String getFactoryCd() {
        return _factoryCd;
    }

    /**
     * [set] FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @param factoryCd The value of the column 'FACTORY_CD'. (NullAllowed)
     */
    public void setFactoryCd(String factoryCd) {
        __modifiedProperties.add("factoryCd");
        this._factoryCd = factoryCd;
    }

    /**
     * [get] FACTORY_SNAME: {varchar(255)} <br>
     * 工場名称
     * @return The value of the column 'FACTORY_SNAME'. (NullAllowed)
     */
    public String getFactorySname() {
        return _factorySname;
    }

    /**
     * [set] FACTORY_SNAME: {varchar(255)} <br>
     * 工場名称
     * @param factorySname The value of the column 'FACTORY_SNAME'. (NullAllowed)
     */
    public void setFactorySname(String factorySname) {
        __modifiedProperties.add("factorySname");
        this._factorySname = factorySname;
    }

    /**
     * [get] ITEM_CD_CASE: {varchar(255)} <br>
     * 銘柄CD（ケース）
     * @return The value of the column 'ITEM_CD_CASE'. (NullAllowed)
     */
    public String getItemCdCase() {
        return _itemCdCase;
    }

    /**
     * [set] ITEM_CD_CASE: {varchar(255)} <br>
     * 銘柄CD（ケース）
     * @param itemCdCase The value of the column 'ITEM_CD_CASE'. (NullAllowed)
     */
    public void setItemCdCase(String itemCdCase) {
        __modifiedProperties.add("itemCdCase");
        this._itemCdCase = itemCdCase;
    }

    /**
     * [get] ITEM_SNAME_CASE: {varchar(255)} <br>
     * 銘柄名称（シンボル）
     * @return The value of the column 'ITEM_SNAME_CASE'. (NullAllowed)
     */
    public String getItemSnameCase() {
        return _itemSnameCase;
    }

    /**
     * [set] ITEM_SNAME_CASE: {varchar(255)} <br>
     * 銘柄名称（シンボル）
     * @param itemSnameCase The value of the column 'ITEM_SNAME_CASE'. (NullAllowed)
     */
    public void setItemSnameCase(String itemSnameCase) {
        __modifiedProperties.add("itemSnameCase");
        this._itemSnameCase = itemSnameCase;
    }

    /**
     * [get] ITEM_CD_WH: {varchar(255)} <br>
     * 銘柄CD（倉庫内）
     * @return The value of the column 'ITEM_CD_WH'. (NullAllowed)
     */
    public String getItemCdWh() {
        return _itemCdWh;
    }

    /**
     * [set] ITEM_CD_WH: {varchar(255)} <br>
     * 銘柄CD（倉庫内）
     * @param itemCdWh The value of the column 'ITEM_CD_WH'. (NullAllowed)
     */
    public void setItemCdWh(String itemCdWh) {
        __modifiedProperties.add("itemCdWh");
        this._itemCdWh = itemCdWh;
    }

    /**
     * [get] ITEM_SNAME_WH: {varchar(255)} <br>
     * 銘柄名称（現在）
     * @return The value of the column 'ITEM_SNAME_WH'. (NullAllowed)
     */
    public String getItemSnameWh() {
        return _itemSnameWh;
    }

    /**
     * [set] ITEM_SNAME_WH: {varchar(255)} <br>
     * 銘柄名称（現在）
     * @param itemSnameWh The value of the column 'ITEM_SNAME_WH'. (NullAllowed)
     */
    public void setItemSnameWh(String itemSnameWh) {
        __modifiedProperties.add("itemSnameWh");
        this._itemSnameWh = itemSnameWh;
    }

    /**
     * [get] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCV_KEY'. (NullAllowed)
     */
    public String getRcvKey() {
        return _rcvKey;
    }

    /**
     * [set] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvKey The value of the column 'RCV_KEY'. (NullAllowed)
     */
    public void setRcvKey(String rcvKey) {
        __modifiedProperties.add("rcvKey");
        this._rcvKey = rcvKey;
    }

    /**
     * [get] MACHINE_NO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'MACHINE_NO'. (NullAllowed)
     */
    public String getMachineNo() {
        return _machineNo;
    }

    /**
     * [set] MACHINE_NO: {varchar(255)} <br>
     * 号機
     * @param machineNo The value of the column 'MACHINE_NO'. (NullAllowed)
     */
    public void setMachineNo(String machineNo) {
        __modifiedProperties.add("machineNo");
        this._machineNo = machineNo;
    }

    /**
     * [get] CREATE_NO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'CREATE_NO'. (NullAllowed)
     */
    public String getCreateNo() {
        return _createNo;
    }

    /**
     * [set] CREATE_NO: {varchar(255)} <br>
     * 生出番号
     * @param createNo The value of the column 'CREATE_NO'. (NullAllowed)
     */
    public void setCreateNo(String createNo) {
        __modifiedProperties.add("createNo");
        this._createNo = createNo;
    }

    /**
     * [get] LIMIT_DATE_NOW: {varchar(255)} <br>
     * 製造年月日（現在）
     * @return The value of the column 'LIMIT_DATE_NOW'. (NullAllowed)
     */
    public String getLimitDateNow() {
        return _limitDateNow;
    }

    /**
     * [set] LIMIT_DATE_NOW: {varchar(255)} <br>
     * 製造年月日（現在）
     * @param limitDateNow The value of the column 'LIMIT_DATE_NOW'. (NullAllowed)
     */
    public void setLimitDateNow(String limitDateNow) {
        __modifiedProperties.add("limitDateNow");
        this._limitDateNow = limitDateNow;
    }

    /**
     * [get] DESIGN_CD_CASE: {varchar(255)} <br>
     * デザイン区分（ケース）
     * @return The value of the column 'DESIGN_CD_CASE'. (NullAllowed)
     */
    public String getDesignCdCase() {
        return _designCdCase;
    }

    /**
     * [set] DESIGN_CD_CASE: {varchar(255)} <br>
     * デザイン区分（ケース）
     * @param designCdCase The value of the column 'DESIGN_CD_CASE'. (NullAllowed)
     */
    public void setDesignCdCase(String designCdCase) {
        __modifiedProperties.add("designCdCase");
        this._designCdCase = designCdCase;
    }

    /**
     * [get] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed)
     */
    public String getFirmtransportNo() {
        return _firmtransportNo;
    }

    /**
     * [set] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmtransportNo The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed)
     */
    public void setFirmtransportNo(String firmtransportNo) {
        __modifiedProperties.add("firmtransportNo");
        this._firmtransportNo = firmtransportNo;
    }

    /**
     * [get] MANUFACTURE_CD: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURE_CD'. (NullAllowed)
     */
    public String getManufactureCd() {
        return _manufactureCd;
    }

    /**
     * [set] MANUFACTURE_CD: {varchar(255)} <br>
     * 製造記号
     * @param manufactureCd The value of the column 'MANUFACTURE_CD'. (NullAllowed)
     */
    public void setManufactureCd(String manufactureCd) {
        __modifiedProperties.add("manufactureCd");
        this._manufactureCd = manufactureCd;
    }

    /**
     * [get] OTHER_LOT1: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'OTHER_LOT1'. (NullAllowed)
     */
    public String getOtherLot1() {
        return _otherLot1;
    }

    /**
     * [set] OTHER_LOT1: {varchar(255)} <br>
     * 在庫区分
     * @param otherLot1 The value of the column 'OTHER_LOT1'. (NullAllowed)
     */
    public void setOtherLot1(String otherLot1) {
        __modifiedProperties.add("otherLot1");
        this._otherLot1 = otherLot1;
    }

    /**
     * [get] CASE_CREATE_TYPE: {varchar(255)} <br>
     * ケース作成区分
     * @return The value of the column 'CASE_CREATE_TYPE'. (NullAllowed)
     */
    public String getCaseCreateType() {
        return _caseCreateType;
    }

    /**
     * [set] CASE_CREATE_TYPE: {varchar(255)} <br>
     * ケース作成区分
     * @param caseCreateType The value of the column 'CASE_CREATE_TYPE'. (NullAllowed)
     */
    public void setCaseCreateType(String caseCreateType) {
        __modifiedProperties.add("caseCreateType");
        this._caseCreateType = caseCreateType;
    }

    /**
     * [get] CODE_SNAME: {varchar(255)} <br>
     * ケース作成区分名称
     * @return The value of the column 'CODE_SNAME'. (NullAllowed)
     */
    public String getCodeSname() {
        return _codeSname;
    }

    /**
     * [set] CODE_SNAME: {varchar(255)} <br>
     * ケース作成区分名称
     * @param codeSname The value of the column 'CODE_SNAME'. (NullAllowed)
     */
    public void setCodeSname(String codeSname) {
        __modifiedProperties.add("codeSname");
        this._codeSname = codeSname;
    }

    /**
     * [get] RECEIVE_DATE: {varchar(255)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVE_DATE'. (NullAllowed)
     */
    public String getReceiveDate() {
        return _receiveDate;
    }

    /**
     * [set] RECEIVE_DATE: {varchar(255)} <br>
     * 入庫日
     * @param receiveDate The value of the column 'RECEIVE_DATE'. (NullAllowed)
     */
    public void setReceiveDate(String receiveDate) {
        __modifiedProperties.add("receiveDate");
        this._receiveDate = receiveDate;
    }

    /**
     * [get] ARRIVAL_PORT_DATE: {varchar(255)} <br>
     * 入港日
     * @return The value of the column 'ARRIVAL_PORT_DATE'. (NullAllowed)
     */
    public String getArrivalPortDate() {
        return _arrivalPortDate;
    }

    /**
     * [set] ARRIVAL_PORT_DATE: {varchar(255)} <br>
     * 入港日
     * @param arrivalPortDate The value of the column 'ARRIVAL_PORT_DATE'. (NullAllowed)
     */
    public void setArrivalPortDate(String arrivalPortDate) {
        __modifiedProperties.add("arrivalPortDate");
        this._arrivalPortDate = arrivalPortDate;
    }

    /**
     * [get] SHIP_NAME: {varchar(255)} <br>
     * 船名
     * @return The value of the column 'SHIP_NAME'. (NullAllowed)
     */
    public String getShipName() {
        return _shipName;
    }

    /**
     * [set] SHIP_NAME: {varchar(255)} <br>
     * 船名
     * @param shipName The value of the column 'SHIP_NAME'. (NullAllowed)
     */
    public void setShipName(String shipName) {
        __modifiedProperties.add("shipName");
        this._shipName = shipName;
    }

    /**
     * [get] INIT_NUM: {varchar(255)} <br>
     * ケース初期数量
     * @return The value of the column 'INIT_NUM'. (NullAllowed)
     */
    public String getInitNum() {
        return _initNum;
    }

    /**
     * [set] INIT_NUM: {varchar(255)} <br>
     * ケース初期数量
     * @param initNum The value of the column 'INIT_NUM'. (NullAllowed)
     */
    public void setInitNum(String initNum) {
        __modifiedProperties.add("initNum");
        this._initNum = initNum;
    }

    /**
     * [get] MIXED_FLG: {varchar(255)} <br>
     * 開封フラグ
     * @return The value of the column 'MIXED_FLG'. (NullAllowed)
     */
    public String getMixedFlg() {
        return _mixedFlg;
    }

    /**
     * [set] MIXED_FLG: {varchar(255)} <br>
     * 開封フラグ
     * @param mixedFlg The value of the column 'MIXED_FLG'. (NullAllowed)
     */
    public void setMixedFlg(String mixedFlg) {
        __modifiedProperties.add("mixedFlg");
        this._mixedFlg = mixedFlg;
    }

    /**
     * [get] LEND_FLG: {varchar(255)} <br>
     * 融通フラグ
     * @return The value of the column 'LEND_FLG'. (NullAllowed)
     */
    public String getLendFlg() {
        return _lendFlg;
    }

    /**
     * [set] LEND_FLG: {varchar(255)} <br>
     * 融通フラグ
     * @param lendFlg The value of the column 'LEND_FLG'. (NullAllowed)
     */
    public void setLendFlg(String lendFlg) {
        __modifiedProperties.add("lendFlg");
        this._lendFlg = lendFlg;
    }

    /**
     * [get] LOC_GROUP: {varchar(255)} <br>
     * ロケグループ
     * @return The value of the column 'LOC_GROUP'. (NullAllowed)
     */
    public String getLocGroup() {
        return _locGroup;
    }

    /**
     * [set] LOC_GROUP: {varchar(255)} <br>
     * ロケグループ
     * @param locGroup The value of the column 'LOC_GROUP'. (NullAllowed)
     */
    public void setLocGroup(String locGroup) {
        __modifiedProperties.add("locGroup");
        this._locGroup = locGroup;
    }

    /**
     * [get] LOC_CD: {varchar(255)} <br>
     * ロケコード
     * @return The value of the column 'LOC_CD'. (NullAllowed)
     */
    public String getLocCd() {
        return _locCd;
    }

    /**
     * [set] LOC_CD: {varchar(255)} <br>
     * ロケコード
     * @param locCd The value of the column 'LOC_CD'. (NullAllowed)
     */
    public void setLocCd(String locCd) {
        __modifiedProperties.add("locCd");
        this._locCd = locCd;
    }

    /**
     * [get] SHIP_DATE: {varchar(255)} <br>
     * 出庫日
     * @return The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public String getShipDate() {
        return _shipDate;
    }

    /**
     * [set] SHIP_DATE: {varchar(255)} <br>
     * 出庫日
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed)
     */
    public void setShipDate(String shipDate) {
        __modifiedProperties.add("shipDate");
        this._shipDate = shipDate;
    }

    /**
     * [get] CURRENT_LOCATION_CD: {varchar(255)} <br>
     * 現在地コード
     * @return The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed)
     */
    public String getCurrentLocationCd() {
        return _currentLocationCd;
    }

    /**
     * [set] CURRENT_LOCATION_CD: {varchar(255)} <br>
     * 現在地コード
     * @param currentLocationCd The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed)
     */
    public void setCurrentLocationCd(String currentLocationCd) {
        __modifiedProperties.add("currentLocationCd");
        this._currentLocationCd = currentLocationCd;
    }

    /**
     * [get] CURRENT_LOCATION_SNAME: {varchar(255)} <br>
     * 現在地名称
     * @return The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed)
     */
    public String getCurrentLocationSname() {
        return _currentLocationSname;
    }

    /**
     * [set] CURRENT_LOCATION_SNAME: {varchar(255)} <br>
     * 現在地名称
     * @param currentLocationSname The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed)
     */
    public void setCurrentLocationSname(String currentLocationSname) {
        __modifiedProperties.add("currentLocationSname");
        this._currentLocationSname = currentLocationSname;
    }

    /**
     * [get] SHIP_TO_CD: {varchar(255)} <br>
     * 受入先コード
     * @return The value of the column 'SHIP_TO_CD'. (NullAllowed)
     */
    public String getShipToCd() {
        return _shipToCd;
    }

    /**
     * [set] SHIP_TO_CD: {varchar(255)} <br>
     * 受入先コード
     * @param shipToCd The value of the column 'SHIP_TO_CD'. (NullAllowed)
     */
    public void setShipToCd(String shipToCd) {
        __modifiedProperties.add("shipToCd");
        this._shipToCd = shipToCd;
    }

    /**
     * [get] SHIP_TO_SNAME: {varchar(255)} <br>
     * 受入先名称
     * @return The value of the column 'SHIP_TO_SNAME'. (NullAllowed)
     */
    public String getShipToSname() {
        return _shipToSname;
    }

    /**
     * [set] SHIP_TO_SNAME: {varchar(255)} <br>
     * 受入先名称
     * @param shipToSname The value of the column 'SHIP_TO_SNAME'. (NullAllowed)
     */
    public void setShipToSname(String shipToSname) {
        __modifiedProperties.add("shipToSname");
        this._shipToSname = shipToSname;
    }

    /**
     * [get] CREATE_DATETIME: {varchar(255)} <br>
     * 情報作成日
     * @return The value of the column 'CREATE_DATETIME'. (NullAllowed)
     */
    public String getCreateDatetime() {
        return _createDatetime;
    }

    /**
     * [set] CREATE_DATETIME: {varchar(255)} <br>
     * 情報作成日
     * @param createDatetime The value of the column 'CREATE_DATETIME'. (NullAllowed)
     */
    public void setCreateDatetime(String createDatetime) {
        __modifiedProperties.add("createDatetime");
        this._createDatetime = createDatetime;
    }

    /**
     * [get] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @return The value of the column 'TRACE_TYPE'. (NullAllowed)
     */
    public String getTraceType() {
        return _traceType;
    }

    /**
     * [set] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @param traceType The value of the column 'TRACE_TYPE'. (NullAllowed)
     */
    public void setTraceType(String traceType) {
        __modifiedProperties.add("traceType");
        this._traceType = traceType;
    }

    /**
     * [get] TRACE_TYPE_SNAME: {varchar(255)} <br>
     * 追跡区分名称
     * @return The value of the column 'TRACE_TYPE_SNAME'. (NullAllowed)
     */
    public String getTraceTypeSname() {
        return _traceTypeSname;
    }

    /**
     * [set] TRACE_TYPE_SNAME: {varchar(255)} <br>
     * 追跡区分名称
     * @param traceTypeSname The value of the column 'TRACE_TYPE_SNAME'. (NullAllowed)
     */
    public void setTraceTypeSname(String traceTypeSname) {
        __modifiedProperties.add("traceTypeSname");
        this._traceTypeSname = traceTypeSname;
    }

    /**
     * [get] EXAM_STS: {varchar(255)} <br>
     * 検査区分
     * @return The value of the column 'EXAM_STS'. (NullAllowed)
     */
    public String getExamSts() {
        return _examSts;
    }

    /**
     * [set] EXAM_STS: {varchar(255)} <br>
     * 検査区分
     * @param examSts The value of the column 'EXAM_STS'. (NullAllowed)
     */
    public void setExamSts(String examSts) {
        __modifiedProperties.add("examSts");
        this._examSts = examSts;
    }

    /**
     * [get] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @return The value of the column 'CASE_IN_NUM'. (NullAllowed)
     */
    public String getCaseInNum() {
        return _caseInNum;
    }

    /**
     * [set] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @param caseInNum The value of the column 'CASE_IN_NUM'. (NullAllowed)
     */
    public void setCaseInNum(String caseInNum) {
        __modifiedProperties.add("caseInNum");
        this._caseInNum = caseInNum;
    }

    /**
     * [get] SHIPPING_NUM: {varchar(255)} <br>
     * 出庫数量
     * @return The value of the column 'SHIPPING_NUM'. (NullAllowed)
     */
    public String getShippingNum() {
        return _shippingNum;
    }

    /**
     * [set] SHIPPING_NUM: {varchar(255)} <br>
     * 出庫数量
     * @param shippingNum The value of the column 'SHIPPING_NUM'. (NullAllowed)
     */
    public void setShippingNum(String shippingNum) {
        __modifiedProperties.add("shippingNum");
        this._shippingNum = shippingNum;
    }

    /**
     * [get] ASSORT_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @return The value of the column 'ASSORT_DATETIME'. (NullAllowed)
     */
    public String getAssortDatetime() {
        return _assortDatetime;
    }

    /**
     * [set] ASSORT_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @param assortDatetime The value of the column 'ASSORT_DATETIME'. (NullAllowed)
     */
    public void setAssortDatetime(String assortDatetime) {
        __modifiedProperties.add("assortDatetime");
        this._assortDatetime = assortDatetime;
    }

    /**
     * [get] LINE_BLOCK: {varchar(255)} <br>
     * ラインブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {varchar(255)} <br>
     * ラインブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
    }

    /**
     * [get] ASSORTED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTED_UNIT'. (NullAllowed)
     */
    public String getAssortedUnit() {
        return _assortedUnit;
    }

    /**
     * [set] ASSORTED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedUnit The value of the column 'ASSORTED_UNIT'. (NullAllowed)
     */
    public void setAssortedUnit(String assortedUnit) {
        __modifiedProperties.add("assortedUnit");
        this._assortedUnit = assortedUnit;
    }

    /**
     * [get] ASSORTED_INDEX: {varchar(255)} <br>
     * 投入順
     * @return The value of the column 'ASSORTED_INDEX'. (NullAllowed)
     */
    public String getAssortedIndex() {
        return _assortedIndex;
    }

    /**
     * [set] ASSORTED_INDEX: {varchar(255)} <br>
     * 投入順
     * @param assortedIndex The value of the column 'ASSORTED_INDEX'. (NullAllowed)
     */
    public void setAssortedIndex(String assortedIndex) {
        __modifiedProperties.add("assortedIndex");
        this._assortedIndex = assortedIndex;
    }

    /**
     * [get] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATION_CODE'. (NullAllowed)
     */
    public String getOperationCode() {
        return _operationCode;
    }

    /**
     * [set] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @param operationCode The value of the column 'OPERATION_CODE'. (NullAllowed)
     */
    public void setOperationCode(String operationCode) {
        __modifiedProperties.add("operationCode");
        this._operationCode = operationCode;
    }

    /**
     * [get] OPERATION_NUM: {varchar(255)} <br>
     * 操作数量
     * @return The value of the column 'OPERATION_NUM'. (NullAllowed)
     */
    public String getOperationNum() {
        return _operationNum;
    }

    /**
     * [set] OPERATION_NUM: {varchar(255)} <br>
     * 操作数量
     * @param operationNum The value of the column 'OPERATION_NUM'. (NullAllowed)
     */
    public void setOperationNum(String operationNum) {
        __modifiedProperties.add("operationNum");
        this._operationNum = operationNum;
    }

    /**
     * [get] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORT_NUM'. (NullAllowed)
     */
    public String getAssortNum() {
        return _assortNum;
    }

    /**
     * [set] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @param assortNum The value of the column 'ASSORT_NUM'. (NullAllowed)
     */
    public void setAssortNum(String assortNum) {
        __modifiedProperties.add("assortNum");
        this._assortNum = assortNum;
    }

    /**
     * [get] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORT_DIF_NUM'. (NullAllowed)
     */
    public String getAssortDifNum() {
        return _assortDifNum;
    }

    /**
     * [set] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @param assortDifNum The value of the column 'ASSORT_DIF_NUM'. (NullAllowed)
     */
    public void setAssortDifNum(String assortDifNum) {
        __modifiedProperties.add("assortDifNum");
        this._assortDifNum = assortDifNum;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public String getDirectionCd() {
        return _directionCd;
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed)
     */
    public void setDirectionCd(String directionCd) {
        __modifiedProperties.add("directionCd");
        this._directionCd = directionCd;
    }

    /**
     * [get] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_TYPE'. (NullAllowed)
     */
    public String getPistonType() {
        return _pistonType;
    }

    /**
     * [set] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistonType The value of the column 'PISTON_TYPE'. (NullAllowed)
     */
    public void setPistonType(String pistonType) {
        __modifiedProperties.add("pistonType");
        this._pistonType = pistonType;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTION_NUM'. (NullAllowed)
     */
    public String getDirectionNum() {
        return _directionNum;
    }

    /**
     * [set] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @param directionNum The value of the column 'DIRECTION_NUM'. (NullAllowed)
     */
    public void setDirectionNum(String directionNum) {
        __modifiedProperties.add("directionNum");
        this._directionNum = directionNum;
    }

    /**
     * [get] SUPPLIER_RCV_NO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIER_RCV_NO'. (NullAllowed)
     */
    public String getSupplierRcvNo() {
        return _supplierRcvNo;
    }

    /**
     * [set] SUPPLIER_RCV_NO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierRcvNo The value of the column 'SUPPLIER_RCV_NO'. (NullAllowed)
     */
    public void setSupplierRcvNo(String supplierRcvNo) {
        __modifiedProperties.add("supplierRcvNo");
        this._supplierRcvNo = supplierRcvNo;
    }

    /**
     * [get] TOKUHAN_CD: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'TOKUHAN_CD'. (NullAllowed)
     */
    public String getTokuhanCd() {
        return _tokuhanCd;
    }

    /**
     * [set] TOKUHAN_CD: {varchar(255)} <br>
     * 特販業者CD
     * @param tokuhanCd The value of the column 'TOKUHAN_CD'. (NullAllowed)
     */
    public void setTokuhanCd(String tokuhanCd) {
        __modifiedProperties.add("tokuhanCd");
        this._tokuhanCd = tokuhanCd;
    }

    /**
     * [get] TOKUHAN_SNAME: {varchar(255)} <br>
     * 特販業者名称
     * @return The value of the column 'TOKUHAN_SNAME'. (NullAllowed)
     */
    public String getTokuhanSname() {
        return _tokuhanSname;
    }

    /**
     * [set] TOKUHAN_SNAME: {varchar(255)} <br>
     * 特販業者名称
     * @param tokuhanSname The value of the column 'TOKUHAN_SNAME'. (NullAllowed)
     */
    public void setTokuhanSname(String tokuhanSname) {
        __modifiedProperties.add("tokuhanSname");
        this._tokuhanSname = tokuhanSname;
    }

    /**
     * [get] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKER_CASE_NO'. (NullAllowed)
     */
    public String getMakerCaseNo() {
        return _makerCaseNo;
    }

    /**
     * [set] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @param makerCaseNo The value of the column 'MAKER_CASE_NO'. (NullAllowed)
     */
    public void setMakerCaseNo(String makerCaseNo) {
        __modifiedProperties.add("makerCaseNo");
        this._makerCaseNo = makerCaseNo;
    }

    /**
     * [get] CASE_ITF_NO: {varchar(255)} <br>
     * ITFNo.
     * @return The value of the column 'CASE_ITF_NO'. (NullAllowed)
     */
    public String getCaseItfNo() {
        return _caseItfNo;
    }

    /**
     * [set] CASE_ITF_NO: {varchar(255)} <br>
     * ITFNo.
     * @param caseItfNo The value of the column 'CASE_ITF_NO'. (NullAllowed)
     */
    public void setCaseItfNo(String caseItfNo) {
        __modifiedProperties.add("caseItfNo");
        this._caseItfNo = caseItfNo;
    }

    /**
     * [get] CASE_BARCODE_VALIANT: {varchar(255)} <br>
     * Barcode Valiant
     * @return The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed)
     */
    public String getCaseBarcodeValiant() {
        return _caseBarcodeValiant;
    }

    /**
     * [set] CASE_BARCODE_VALIANT: {varchar(255)} <br>
     * Barcode Valiant
     * @param caseBarcodeValiant The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed)
     */
    public void setCaseBarcodeValiant(String caseBarcodeValiant) {
        __modifiedProperties.add("caseBarcodeValiant");
        this._caseBarcodeValiant = caseBarcodeValiant;
    }

    /**
     * [get] CASE_LOT4: {varchar(255)} <br>
     * 実製造年月日
     * @return The value of the column 'CASE_LOT4'. (NullAllowed)
     */
    public String getCaseLot4() {
        return _caseLot4;
    }

    /**
     * [set] CASE_LOT4: {varchar(255)} <br>
     * 実製造年月日
     * @param caseLot4 The value of the column 'CASE_LOT4'. (NullAllowed)
     */
    public void setCaseLot4(String caseLot4) {
        __modifiedProperties.add("caseLot4");
        this._caseLot4 = caseLot4;
    }

    /**
     * [get] CASE_CENTER_NO: {varchar(255)} <br>
     * センターNo.
     * @return The value of the column 'CASE_CENTER_NO'. (NullAllowed)
     */
    public String getCaseCenterNo() {
        return _caseCenterNo;
    }

    /**
     * [set] CASE_CENTER_NO: {varchar(255)} <br>
     * センターNo.
     * @param caseCenterNo The value of the column 'CASE_CENTER_NO'. (NullAllowed)
     */
    public void setCaseCenterNo(String caseCenterNo) {
        __modifiedProperties.add("caseCenterNo");
        this._caseCenterNo = caseCenterNo;
    }

    /**
     * [get] CASE_PACK_NO: {varchar(255)} <br>
     * ケースパッカーNo.
     * @return The value of the column 'CASE_PACK_NO'. (NullAllowed)
     */
    public String getCasePackNo() {
        return _casePackNo;
    }

    /**
     * [set] CASE_PACK_NO: {varchar(255)} <br>
     * ケースパッカーNo.
     * @param casePackNo The value of the column 'CASE_PACK_NO'. (NullAllowed)
     */
    public void setCasePackNo(String casePackNo) {
        __modifiedProperties.add("casePackNo");
        this._casePackNo = casePackNo;
    }

    /**
     * [get] CASE_PACK_TIME: {varchar(255)} <br>
     * ケースパッキング時間
     * @return The value of the column 'CASE_PACK_TIME'. (NullAllowed)
     */
    public String getCasePackTime() {
        return _casePackTime;
    }

    /**
     * [set] CASE_PACK_TIME: {varchar(255)} <br>
     * ケースパッキング時間
     * @param casePackTime The value of the column 'CASE_PACK_TIME'. (NullAllowed)
     */
    public void setCasePackTime(String casePackTime) {
        __modifiedProperties.add("casePackTime");
        this._casePackTime = casePackTime;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(255)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed)
     */
    public String getSenderLocation() {
        return _senderLocation;
    }

    /**
     * [set] SENDER_LOCATION: {varchar(255)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed)
     */
    public void setSenderLocation(String senderLocation) {
        __modifiedProperties.add("senderLocation");
        this._senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(255)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed)
     */
    public String getReceiverLocation() {
        return _receiverLocation;
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(255)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed)
     */
    public void setReceiverLocation(String receiverLocation) {
        __modifiedProperties.add("receiverLocation");
        this._receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(255)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed)
     */
    public String getShipmentId() {
        return _shipmentId;
    }

    /**
     * [set] SHIPMENT_ID: {varchar(255)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed)
     */
    public void setShipmentId(String shipmentId) {
        __modifiedProperties.add("shipmentId");
        this._shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(255)} <br>
     * 送信日
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed)
     */
    public String getShipmentDate() {
        return _shipmentDate;
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(255)} <br>
     * 送信日
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed)
     */
    public void setShipmentDate(String shipmentDate) {
        __modifiedProperties.add("shipmentDate");
        this._shipmentDate = shipmentDate;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(255)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed)
     */
    public String getNumberOfPallets() {
        return _numberOfPallets;
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(255)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        __modifiedProperties.add("numberOfPallets");
        this._numberOfPallets = numberOfPallets;
    }

    /**
     * [get] CARRIER_NO: {varchar(255)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIER_NO'. (NullAllowed)
     */
    public String getCarrierNo() {
        return _carrierNo;
    }

    /**
     * [set] CARRIER_NO: {varchar(255)} <br>
     * コンテナNo
     * @param carrierNo The value of the column 'CARRIER_NO'. (NullAllowed)
     */
    public void setCarrierNo(String carrierNo) {
        __modifiedProperties.add("carrierNo");
        this._carrierNo = carrierNo;
    }

    /**
     * [get] ORDER_NO: {varchar(255)} <br>
     * オーダーNo
     * @return The value of the column 'ORDER_NO'. (NullAllowed)
     */
    public String getOrderNo() {
        return _orderNo;
    }

    /**
     * [set] ORDER_NO: {varchar(255)} <br>
     * オーダーNo
     * @param orderNo The value of the column 'ORDER_NO'. (NullAllowed)
     */
    public void setOrderNo(String orderNo) {
        __modifiedProperties.add("orderNo");
        this._orderNo = orderNo;
    }

    /**
     * [get] SRC_CD: {varchar(255)} <br>
     * SRC_CD
     * @return The value of the column 'SRC_CD'. (NullAllowed)
     */
    public String getSrcCd() {
        return _srcCd;
    }

    /**
     * [set] SRC_CD: {varchar(255)} <br>
     * SRC_CD
     * @param srcCd The value of the column 'SRC_CD'. (NullAllowed)
     */
    public void setSrcCd(String srcCd) {
        __modifiedProperties.add("srcCd");
        this._srcCd = srcCd;
    }

    /**
     * [get] BL_NO: {varchar(255)} <br>
     * BLNo
     * @return The value of the column 'BL_NO'. (NullAllowed)
     */
    public String getBlNo() {
        return _blNo;
    }

    /**
     * [set] BL_NO: {varchar(255)} <br>
     * BLNo
     * @param blNo The value of the column 'BL_NO'. (NullAllowed)
     */
    public void setBlNo(String blNo) {
        __modifiedProperties.add("blNo");
        this._blNo = blNo;
    }

    /**
     * [get] INVOICE_NO: {varchar(255)} <br>
     * InvoiceNo
     * @return The value of the column 'INVOICE_NO'. (NullAllowed)
     */
    public String getInvoiceNo() {
        return _invoiceNo;
    }

    /**
     * [set] INVOICE_NO: {varchar(255)} <br>
     * InvoiceNo
     * @param invoiceNo The value of the column 'INVOICE_NO'. (NullAllowed)
     */
    public void setInvoiceNo(String invoiceNo) {
        __modifiedProperties.add("invoiceNo");
        this._invoiceNo = invoiceNo;
    }

    /**
     * [get] SSCC: {varchar(255)} <br>
     * SSCC
     * @return The value of the column 'SSCC'. (NullAllowed)
     */
    public String getSscc() {
        return _sscc;
    }

    /**
     * [set] SSCC: {varchar(255)} <br>
     * SSCC
     * @param sscc The value of the column 'SSCC'. (NullAllowed)
     */
    public void setSscc(String sscc) {
        __modifiedProperties.add("sscc");
        this._sscc = sscc;
    }

    /**
     * [get] CASE_NO: {varchar(255)} <br>
     * ケース番号
     * @return The value of the column 'CASE_NO'. (NullAllowed)
     */
    public String getCaseNo() {
        return _caseNo;
    }

    /**
     * [set] CASE_NO: {varchar(255)} <br>
     * ケース番号
     * @param caseNo The value of the column 'CASE_NO'. (NullAllowed)
     */
    public void setCaseNo(String caseNo) {
        __modifiedProperties.add("caseNo");
        this._caseNo = caseNo;
    }

    /**
     * [get] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（保管場）
     * @return The value of the column 'INV_NUM'. (NullAllowed)
     */
    public String getInvNum() {
        return _invNum;
    }

    /**
     * [set] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（保管場）
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed)
     */
    public void setInvNum(String invNum) {
        __modifiedProperties.add("invNum");
        this._invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（仕分場）
     * @return The value of the column 'SORT_NUM'. (NullAllowed)
     */
    public String getSortNum() {
        return _sortNum;
    }

    /**
     * [set] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（仕分場）
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed)
     */
    public void setSortNum(String sortNum) {
        __modifiedProperties.add("sortNum");
        this._sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（引取場）
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed)
     */
    public String getAdoptNum() {
        return _adoptNum;
    }

    /**
     * [set] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（引取場）
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed)
     */
    public void setAdoptNum(String adoptNum) {
        __modifiedProperties.add("adoptNum");
        this._adoptNum = adoptNum;
    }

    /**
     * [get] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @return The value of the column 'DELIVERY_DATETIME'. (NullAllowed)
     */
    public String getDeliveryDatetime() {
        return _deliveryDatetime;
    }

    /**
     * [set] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @param deliveryDatetime The value of the column 'DELIVERY_DATETIME'. (NullAllowed)
     */
    public void setDeliveryDatetime(String deliveryDatetime) {
        __modifiedProperties.add("deliveryDatetime");
        this._deliveryDatetime = deliveryDatetime;
    }

    /**
     * [get] SPARE_STR: {varchar(255)} <br>
     * 予備項目
     * @return The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public String getSpareStr() {
        return _spareStr;
    }

    /**
     * [set] SPARE_STR: {varchar(255)} <br>
     * 予備項目
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public void setSpareStr(String spareStr) {
        __modifiedProperties.add("spareStr");
        this._spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
