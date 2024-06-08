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
 * The entity of E_SHOP_IMPORT_SEND as TABLE. <br>
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
 * Long shopImportSendId = entity.getShopImportSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String symbolPosKey = entity.getSymbolPosKey();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseSname = entity.getWarehouseSname();
 * String factoryCd = entity.getFactoryCd();
 * String factorySname = entity.getFactorySname();
 * String itemCdCase = entity.getItemCdCase();
 * String itemSnameCase = entity.getItemSnameCase();
 * String itemCdWh = entity.getItemCdWh();
 * String itemSnameWh = entity.getItemSnameWh();
 * String rcvKey = entity.getRcvKey();
 * String machineNo = entity.getMachineNo();
 * String createNo = entity.getCreateNo();
 * String limitDateNow = entity.getLimitDateNow();
 * String designCdCase = entity.getDesignCdCase();
 * String firmtransportNo = entity.getFirmtransportNo();
 * String manufactureCd = entity.getManufactureCd();
 * String otherLot1 = entity.getOtherLot1();
 * String caseCreateType = entity.getCaseCreateType();
 * String codeSname = entity.getCodeSname();
 * String receiveDate = entity.getReceiveDate();
 * String arrivalPortDate = entity.getArrivalPortDate();
 * String shipName = entity.getShipName();
 * String initNum = entity.getInitNum();
 * String mixedFlg = entity.getMixedFlg();
 * String lendFlg = entity.getLendFlg();
 * String locGroup = entity.getLocGroup();
 * String locCd = entity.getLocCd();
 * String shipDate = entity.getShipDate();
 * String currentLocationCd = entity.getCurrentLocationCd();
 * String currentLocationSname = entity.getCurrentLocationSname();
 * String shipToCd = entity.getShipToCd();
 * String shipToSname = entity.getShipToSname();
 * String createDatetime = entity.getCreateDatetime();
 * String traceType = entity.getTraceType();
 * String traceTypeSname = entity.getTraceTypeSname();
 * String examSts = entity.getExamSts();
 * String caseInNum = entity.getCaseInNum();
 * String shippingNum = entity.getShippingNum();
 * String assortDatetime = entity.getAssortDatetime();
 * String lineBlock = entity.getLineBlock();
 * String assortedUnit = entity.getAssortedUnit();
 * String assortedIndex = entity.getAssortedIndex();
 * String operationCode = entity.getOperationCode();
 * String operationNum = entity.getOperationNum();
 * String assortNum = entity.getAssortNum();
 * String assortDifNum = entity.getAssortDifNum();
 * String directionCd = entity.getDirectionCd();
 * String pistonType = entity.getPistonType();
 * String customerCd = entity.getCustomerCd();
 * String directionNum = entity.getDirectionNum();
 * String supplierRcvNo = entity.getSupplierRcvNo();
 * String tokuhanCd = entity.getTokuhanCd();
 * String tokuhanSname = entity.getTokuhanSname();
 * String makerCaseNo = entity.getMakerCaseNo();
 * String caseItfNo = entity.getCaseItfNo();
 * String caseBarcodeValiant = entity.getCaseBarcodeValiant();
 * String caseLot4 = entity.getCaseLot4();
 * String caseCenterNo = entity.getCaseCenterNo();
 * String casePackNo = entity.getCasePackNo();
 * String casePackTime = entity.getCasePackTime();
 * String senderLocation = entity.getSenderLocation();
 * String receiverLocation = entity.getReceiverLocation();
 * String shipmentId = entity.getShipmentId();
 * String shipmentDate = entity.getShipmentDate();
 * String numberOfPallets = entity.getNumberOfPallets();
 * String carrierNo = entity.getCarrierNo();
 * String orderNo = entity.getOrderNo();
 * String srcCd = entity.getSrcCd();
 * String blNo = entity.getBlNo();
 * String invoiceNo = entity.getInvoiceNo();
 * String sscc = entity.getSscc();
 * String caseNo = entity.getCaseNo();
 * String invNum = entity.getInvNum();
 * String sortNum = entity.getSortNum();
 * String adoptNum = entity.getAdoptNum();
 * String deliveryDatetime = entity.getDeliveryDatetime();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShopImportSendId(shopImportSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setSymbolPosKey(symbolPosKey);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseSname(warehouseSname);
 * entity.setFactoryCd(factoryCd);
 * entity.setFactorySname(factorySname);
 * entity.setItemCdCase(itemCdCase);
 * entity.setItemSnameCase(itemSnameCase);
 * entity.setItemCdWh(itemCdWh);
 * entity.setItemSnameWh(itemSnameWh);
 * entity.setRcvKey(rcvKey);
 * entity.setMachineNo(machineNo);
 * entity.setCreateNo(createNo);
 * entity.setLimitDateNow(limitDateNow);
 * entity.setDesignCdCase(designCdCase);
 * entity.setFirmtransportNo(firmtransportNo);
 * entity.setManufactureCd(manufactureCd);
 * entity.setOtherLot1(otherLot1);
 * entity.setCaseCreateType(caseCreateType);
 * entity.setCodeSname(codeSname);
 * entity.setReceiveDate(receiveDate);
 * entity.setArrivalPortDate(arrivalPortDate);
 * entity.setShipName(shipName);
 * entity.setInitNum(initNum);
 * entity.setMixedFlg(mixedFlg);
 * entity.setLendFlg(lendFlg);
 * entity.setLocGroup(locGroup);
 * entity.setLocCd(locCd);
 * entity.setShipDate(shipDate);
 * entity.setCurrentLocationCd(currentLocationCd);
 * entity.setCurrentLocationSname(currentLocationSname);
 * entity.setShipToCd(shipToCd);
 * entity.setShipToSname(shipToSname);
 * entity.setCreateDatetime(createDatetime);
 * entity.setTraceType(traceType);
 * entity.setTraceTypeSname(traceTypeSname);
 * entity.setExamSts(examSts);
 * entity.setCaseInNum(caseInNum);
 * entity.setShippingNum(shippingNum);
 * entity.setAssortDatetime(assortDatetime);
 * entity.setLineBlock(lineBlock);
 * entity.setAssortedUnit(assortedUnit);
 * entity.setAssortedIndex(assortedIndex);
 * entity.setOperationCode(operationCode);
 * entity.setOperationNum(operationNum);
 * entity.setAssortNum(assortNum);
 * entity.setAssortDifNum(assortDifNum);
 * entity.setDirectionCd(directionCd);
 * entity.setPistonType(pistonType);
 * entity.setCustomerCd(customerCd);
 * entity.setDirectionNum(directionNum);
 * entity.setSupplierRcvNo(supplierRcvNo);
 * entity.setTokuhanCd(tokuhanCd);
 * entity.setTokuhanSname(tokuhanSname);
 * entity.setMakerCaseNo(makerCaseNo);
 * entity.setCaseItfNo(caseItfNo);
 * entity.setCaseBarcodeValiant(caseBarcodeValiant);
 * entity.setCaseLot4(caseLot4);
 * entity.setCaseCenterNo(caseCenterNo);
 * entity.setCasePackNo(casePackNo);
 * entity.setCasePackTime(casePackTime);
 * entity.setSenderLocation(senderLocation);
 * entity.setReceiverLocation(receiverLocation);
 * entity.setShipmentId(shipmentId);
 * entity.setShipmentDate(shipmentDate);
 * entity.setNumberOfPallets(numberOfPallets);
 * entity.setCarrierNo(carrierNo);
 * entity.setOrderNo(orderNo);
 * entity.setSrcCd(srcCd);
 * entity.setBlNo(blNo);
 * entity.setInvoiceNo(invoiceNo);
 * entity.setSscc(sscc);
 * entity.setCaseNo(caseNo);
 * entity.setInvNum(invNum);
 * entity.setSortNum(sortNum);
 * entity.setAdoptNum(adoptNum);
 * entity.setDeliveryDatetime(deliveryDatetime);
 * entity.setSpareStr(spareStr);
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
public abstract class BsEShopImportSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shopImportSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    protected String _workFlg;

    /** SYMBOL_POS_KEY: {varchar(255)} */
    protected String _symbolPosKey;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** WAREHOUSE_SNAME: {varchar(255)} */
    protected String _warehouseSname;

    /** FACTORY_CD: {varchar(255)} */
    protected String _factoryCd;

    /** FACTORY_SNAME: {varchar(255)} */
    protected String _factorySname;

    /** ITEM_CD_CASE: {varchar(255)} */
    protected String _itemCdCase;

    /** ITEM_SNAME_CASE: {varchar(255)} */
    protected String _itemSnameCase;

    /** ITEM_CD_WH: {varchar(255)} */
    protected String _itemCdWh;

    /** ITEM_SNAME_WH: {varchar(255)} */
    protected String _itemSnameWh;

    /** RCV_KEY: {varchar(255)} */
    protected String _rcvKey;

    /** MACHINE_NO: {varchar(255)} */
    protected String _machineNo;

    /** CREATE_NO: {varchar(255)} */
    protected String _createNo;

    /** LIMIT_DATE_NOW: {varchar(255)} */
    protected String _limitDateNow;

    /** DESIGN_CD_CASE: {varchar(255)} */
    protected String _designCdCase;

    /** FIRMTRANSPORT_NO: {varchar(255)} */
    protected String _firmtransportNo;

    /** MANUFACTURE_CD: {varchar(255)} */
    protected String _manufactureCd;

    /** OTHER_LOT1: {varchar(255)} */
    protected String _otherLot1;

    /** CASE_CREATE_TYPE: {varchar(255)} */
    protected String _caseCreateType;

    /** CODE_SNAME: {varchar(255)} */
    protected String _codeSname;

    /** RECEIVE_DATE: {varchar(255)} */
    protected String _receiveDate;

    /** ARRIVAL_PORT_DATE: {varchar(255)} */
    protected String _arrivalPortDate;

    /** SHIP_NAME: {varchar(255)} */
    protected String _shipName;

    /** INIT_NUM: {varchar(255)} */
    protected String _initNum;

    /** MIXED_FLG: {varchar(255)} */
    protected String _mixedFlg;

    /** LEND_FLG: {varchar(255)} */
    protected String _lendFlg;

    /** LOC_GROUP: {varchar(255)} */
    protected String _locGroup;

    /** LOC_CD: {varchar(255)} */
    protected String _locCd;

    /** SHIP_DATE: {varchar(255)} */
    protected String _shipDate;

    /** CURRENT_LOCATION_CD: {varchar(255)} */
    protected String _currentLocationCd;

    /** CURRENT_LOCATION_SNAME: {varchar(255)} */
    protected String _currentLocationSname;

    /** SHIP_TO_CD: {varchar(255)} */
    protected String _shipToCd;

    /** SHIP_TO_SNAME: {varchar(255)} */
    protected String _shipToSname;

    /** CREATE_DATETIME: {varchar(255)} */
    protected String _createDatetime;

    /** TRACE_TYPE: {varchar(255)} */
    protected String _traceType;

    /** TRACE_TYPE_SNAME: {varchar(255)} */
    protected String _traceTypeSname;

    /** EXAM_STS: {varchar(255)} */
    protected String _examSts;

    /** CASE_IN_NUM: {varchar(255)} */
    protected String _caseInNum;

    /** SHIPPING_NUM: {varchar(255)} */
    protected String _shippingNum;

    /** ASSORT_DATETIME: {varchar(255)} */
    protected String _assortDatetime;

    /** LINE_BLOCK: {varchar(255)} */
    protected String _lineBlock;

    /** ASSORTED_UNIT: {varchar(255)} */
    protected String _assortedUnit;

    /** ASSORTED_INDEX: {varchar(255)} */
    protected String _assortedIndex;

    /** OPERATION_CODE: {varchar(255)} */
    protected String _operationCode;

    /** OPERATION_NUM: {varchar(255)} */
    protected String _operationNum;

    /** ASSORT_NUM: {varchar(255)} */
    protected String _assortNum;

    /** ASSORT_DIF_NUM: {varchar(255)} */
    protected String _assortDifNum;

    /** DIRECTION_CD: {varchar(255)} */
    protected String _directionCd;

    /** PISTON_TYPE: {varchar(255)} */
    protected String _pistonType;

    /** CUSTOMER_CD: {varchar(255)} */
    protected String _customerCd;

    /** DIRECTION_NUM: {varchar(255)} */
    protected String _directionNum;

    /** SUPPLIER_RCV_NO: {varchar(255)} */
    protected String _supplierRcvNo;

    /** TOKUHAN_CD: {varchar(255)} */
    protected String _tokuhanCd;

    /** TOKUHAN_SNAME: {varchar(255)} */
    protected String _tokuhanSname;

    /** MAKER_CASE_NO: {varchar(255)} */
    protected String _makerCaseNo;

    /** CASE_ITF_NO: {varchar(255)} */
    protected String _caseItfNo;

    /** CASE_BARCODE_VALIANT: {varchar(255)} */
    protected String _caseBarcodeValiant;

    /** CASE_LOT4: {varchar(255)} */
    protected String _caseLot4;

    /** CASE_CENTER_NO: {varchar(255)} */
    protected String _caseCenterNo;

    /** CASE_PACK_NO: {varchar(255)} */
    protected String _casePackNo;

    /** CASE_PACK_TIME: {varchar(255)} */
    protected String _casePackTime;

    /** SENDER_LOCATION: {varchar(255)} */
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(255)} */
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(255)} */
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(255)} */
    protected String _shipmentDate;

    /** NUMBER_OF_PALLETS: {varchar(255)} */
    protected String _numberOfPallets;

    /** CARRIER_NO: {varchar(255)} */
    protected String _carrierNo;

    /** ORDER_NO: {varchar(255)} */
    protected String _orderNo;

    /** SRC_CD: {varchar(255)} */
    protected String _srcCd;

    /** BL_NO: {varchar(255)} */
    protected String _blNo;

    /** INVOICE_NO: {varchar(255)} */
    protected String _invoiceNo;

    /** SSCC: {varchar(255)} */
    protected String _sscc;

    /** CASE_NO: {varchar(255)} */
    protected String _caseNo;

    /** INV_NUM: {varchar(255)} */
    protected String _invNum;

    /** SORT_NUM: {varchar(255)} */
    protected String _sortNum;

    /** ADOPT_NUM: {varchar(255)} */
    protected String _adoptNum;

    /** DELIVERY_DATETIME: {varchar(255)} */
    protected String _deliveryDatetime;

    /** SPARE_STR: {varchar(255)} */
    protected String _spareStr;

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
        return "E_SHOP_IMPORT_SEND";
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
        if (_shopImportSendId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
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
        if (obj instanceof BsEShopImportSend) {
            BsEShopImportSend other = (BsEShopImportSend)obj;
            if (!xSV(_shopImportSendId, other._shopImportSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shopImportSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shopImportSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_symbolPosKey));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseSname));
        sb.append(dm).append(xfND(_factoryCd));
        sb.append(dm).append(xfND(_factorySname));
        sb.append(dm).append(xfND(_itemCdCase));
        sb.append(dm).append(xfND(_itemSnameCase));
        sb.append(dm).append(xfND(_itemCdWh));
        sb.append(dm).append(xfND(_itemSnameWh));
        sb.append(dm).append(xfND(_rcvKey));
        sb.append(dm).append(xfND(_machineNo));
        sb.append(dm).append(xfND(_createNo));
        sb.append(dm).append(xfND(_limitDateNow));
        sb.append(dm).append(xfND(_designCdCase));
        sb.append(dm).append(xfND(_firmtransportNo));
        sb.append(dm).append(xfND(_manufactureCd));
        sb.append(dm).append(xfND(_otherLot1));
        sb.append(dm).append(xfND(_caseCreateType));
        sb.append(dm).append(xfND(_codeSname));
        sb.append(dm).append(xfND(_receiveDate));
        sb.append(dm).append(xfND(_arrivalPortDate));
        sb.append(dm).append(xfND(_shipName));
        sb.append(dm).append(xfND(_initNum));
        sb.append(dm).append(xfND(_mixedFlg));
        sb.append(dm).append(xfND(_lendFlg));
        sb.append(dm).append(xfND(_locGroup));
        sb.append(dm).append(xfND(_locCd));
        sb.append(dm).append(xfND(_shipDate));
        sb.append(dm).append(xfND(_currentLocationCd));
        sb.append(dm).append(xfND(_currentLocationSname));
        sb.append(dm).append(xfND(_shipToCd));
        sb.append(dm).append(xfND(_shipToSname));
        sb.append(dm).append(xfND(_createDatetime));
        sb.append(dm).append(xfND(_traceType));
        sb.append(dm).append(xfND(_traceTypeSname));
        sb.append(dm).append(xfND(_examSts));
        sb.append(dm).append(xfND(_caseInNum));
        sb.append(dm).append(xfND(_shippingNum));
        sb.append(dm).append(xfND(_assortDatetime));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_assortedUnit));
        sb.append(dm).append(xfND(_assortedIndex));
        sb.append(dm).append(xfND(_operationCode));
        sb.append(dm).append(xfND(_operationNum));
        sb.append(dm).append(xfND(_assortNum));
        sb.append(dm).append(xfND(_assortDifNum));
        sb.append(dm).append(xfND(_directionCd));
        sb.append(dm).append(xfND(_pistonType));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_directionNum));
        sb.append(dm).append(xfND(_supplierRcvNo));
        sb.append(dm).append(xfND(_tokuhanCd));
        sb.append(dm).append(xfND(_tokuhanSname));
        sb.append(dm).append(xfND(_makerCaseNo));
        sb.append(dm).append(xfND(_caseItfNo));
        sb.append(dm).append(xfND(_caseBarcodeValiant));
        sb.append(dm).append(xfND(_caseLot4));
        sb.append(dm).append(xfND(_caseCenterNo));
        sb.append(dm).append(xfND(_casePackNo));
        sb.append(dm).append(xfND(_casePackTime));
        sb.append(dm).append(xfND(_senderLocation));
        sb.append(dm).append(xfND(_receiverLocation));
        sb.append(dm).append(xfND(_shipmentId));
        sb.append(dm).append(xfND(_shipmentDate));
        sb.append(dm).append(xfND(_numberOfPallets));
        sb.append(dm).append(xfND(_carrierNo));
        sb.append(dm).append(xfND(_orderNo));
        sb.append(dm).append(xfND(_srcCd));
        sb.append(dm).append(xfND(_blNo));
        sb.append(dm).append(xfND(_invoiceNo));
        sb.append(dm).append(xfND(_sscc));
        sb.append(dm).append(xfND(_caseNo));
        sb.append(dm).append(xfND(_invNum));
        sb.append(dm).append(xfND(_sortNum));
        sb.append(dm).append(xfND(_adoptNum));
        sb.append(dm).append(xfND(_deliveryDatetime));
        sb.append(dm).append(xfND(_spareStr));
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
    public EShopImportSend clone() {
        return (EShopImportSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売店仕分情報送信(輸入)ID
     * @return The value of the column 'SHOP_IMPORT_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShopImportSendId() {
        checkSpecifiedProperty("shopImportSendId");
        return _shopImportSendId;
    }

    /**
     * [set] SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売店仕分情報送信(輸入)ID
     * @param shopImportSendId The value of the column 'SHOP_IMPORT_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShopImportSendId(Long shopImportSendId) {
        registerModifiedProperty("shopImportSendId");
        _shopImportSendId = shopImportSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @return The value of the column 'SYMBOL_POS_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolPosKey() {
        checkSpecifiedProperty("symbolPosKey");
        return convertEmptyToNull(_symbolPosKey);
    }

    /**
     * [set] SYMBOL_POS_KEY: {varchar(255)} <br>
     * 製品追跡キー
     * @param symbolPosKey The value of the column 'SYMBOL_POS_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolPosKey(String symbolPosKey) {
        registerModifiedProperty("symbolPosKey");
        _symbolPosKey = symbolPosKey;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 作成拠点コード
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 作成拠点コード
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 作成拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseSname() {
        checkSpecifiedProperty("warehouseSname");
        return convertEmptyToNull(_warehouseSname);
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(255)} <br>
     * 作成拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseSname(String warehouseSname) {
        registerModifiedProperty("warehouseSname");
        _warehouseSname = warehouseSname;
    }

    /**
     * [get] FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @return The value of the column 'FACTORY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactoryCd() {
        checkSpecifiedProperty("factoryCd");
        return convertEmptyToNull(_factoryCd);
    }

    /**
     * [set] FACTORY_CD: {varchar(255)} <br>
     * 工場CD
     * @param factoryCd The value of the column 'FACTORY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactoryCd(String factoryCd) {
        registerModifiedProperty("factoryCd");
        _factoryCd = factoryCd;
    }

    /**
     * [get] FACTORY_SNAME: {varchar(255)} <br>
     * 工場名称
     * @return The value of the column 'FACTORY_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactorySname() {
        checkSpecifiedProperty("factorySname");
        return convertEmptyToNull(_factorySname);
    }

    /**
     * [set] FACTORY_SNAME: {varchar(255)} <br>
     * 工場名称
     * @param factorySname The value of the column 'FACTORY_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactorySname(String factorySname) {
        registerModifiedProperty("factorySname");
        _factorySname = factorySname;
    }

    /**
     * [get] ITEM_CD_CASE: {varchar(255)} <br>
     * 銘柄CD（ケース）
     * @return The value of the column 'ITEM_CD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemCdCase() {
        checkSpecifiedProperty("itemCdCase");
        return convertEmptyToNull(_itemCdCase);
    }

    /**
     * [set] ITEM_CD_CASE: {varchar(255)} <br>
     * 銘柄CD（ケース）
     * @param itemCdCase The value of the column 'ITEM_CD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCdCase(String itemCdCase) {
        registerModifiedProperty("itemCdCase");
        _itemCdCase = itemCdCase;
    }

    /**
     * [get] ITEM_SNAME_CASE: {varchar(255)} <br>
     * 銘柄名称（シンボル）
     * @return The value of the column 'ITEM_SNAME_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemSnameCase() {
        checkSpecifiedProperty("itemSnameCase");
        return convertEmptyToNull(_itemSnameCase);
    }

    /**
     * [set] ITEM_SNAME_CASE: {varchar(255)} <br>
     * 銘柄名称（シンボル）
     * @param itemSnameCase The value of the column 'ITEM_SNAME_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemSnameCase(String itemSnameCase) {
        registerModifiedProperty("itemSnameCase");
        _itemSnameCase = itemSnameCase;
    }

    /**
     * [get] ITEM_CD_WH: {varchar(255)} <br>
     * 銘柄CD（倉庫内）
     * @return The value of the column 'ITEM_CD_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemCdWh() {
        checkSpecifiedProperty("itemCdWh");
        return convertEmptyToNull(_itemCdWh);
    }

    /**
     * [set] ITEM_CD_WH: {varchar(255)} <br>
     * 銘柄CD（倉庫内）
     * @param itemCdWh The value of the column 'ITEM_CD_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemCdWh(String itemCdWh) {
        registerModifiedProperty("itemCdWh");
        _itemCdWh = itemCdWh;
    }

    /**
     * [get] ITEM_SNAME_WH: {varchar(255)} <br>
     * 銘柄名称（現在）
     * @return The value of the column 'ITEM_SNAME_WH'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemSnameWh() {
        checkSpecifiedProperty("itemSnameWh");
        return convertEmptyToNull(_itemSnameWh);
    }

    /**
     * [set] ITEM_SNAME_WH: {varchar(255)} <br>
     * 銘柄名称（現在）
     * @param itemSnameWh The value of the column 'ITEM_SNAME_WH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemSnameWh(String itemSnameWh) {
        registerModifiedProperty("itemSnameWh");
        _itemSnameWh = itemSnameWh;
    }

    /**
     * [get] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @return The value of the column 'RCV_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvKey() {
        checkSpecifiedProperty("rcvKey");
        return convertEmptyToNull(_rcvKey);
    }

    /**
     * [set] RCV_KEY: {varchar(255)} <br>
     * 入庫キー
     * @param rcvKey The value of the column 'RCV_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvKey(String rcvKey) {
        registerModifiedProperty("rcvKey");
        _rcvKey = rcvKey;
    }

    /**
     * [get] MACHINE_NO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'MACHINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMachineNo() {
        checkSpecifiedProperty("machineNo");
        return convertEmptyToNull(_machineNo);
    }

    /**
     * [set] MACHINE_NO: {varchar(255)} <br>
     * 号機
     * @param machineNo The value of the column 'MACHINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMachineNo(String machineNo) {
        registerModifiedProperty("machineNo");
        _machineNo = machineNo;
    }

    /**
     * [get] CREATE_NO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'CREATE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateNo() {
        checkSpecifiedProperty("createNo");
        return convertEmptyToNull(_createNo);
    }

    /**
     * [set] CREATE_NO: {varchar(255)} <br>
     * 生出番号
     * @param createNo The value of the column 'CREATE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateNo(String createNo) {
        registerModifiedProperty("createNo");
        _createNo = createNo;
    }

    /**
     * [get] LIMIT_DATE_NOW: {varchar(255)} <br>
     * 製造年月日（現在）
     * @return The value of the column 'LIMIT_DATE_NOW'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDateNow() {
        checkSpecifiedProperty("limitDateNow");
        return convertEmptyToNull(_limitDateNow);
    }

    /**
     * [set] LIMIT_DATE_NOW: {varchar(255)} <br>
     * 製造年月日（現在）
     * @param limitDateNow The value of the column 'LIMIT_DATE_NOW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDateNow(String limitDateNow) {
        registerModifiedProperty("limitDateNow");
        _limitDateNow = limitDateNow;
    }

    /**
     * [get] DESIGN_CD_CASE: {varchar(255)} <br>
     * デザイン区分（ケース）
     * @return The value of the column 'DESIGN_CD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignCdCase() {
        checkSpecifiedProperty("designCdCase");
        return convertEmptyToNull(_designCdCase);
    }

    /**
     * [set] DESIGN_CD_CASE: {varchar(255)} <br>
     * デザイン区分（ケース）
     * @param designCdCase The value of the column 'DESIGN_CD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignCdCase(String designCdCase) {
        registerModifiedProperty("designCdCase");
        _designCdCase = designCdCase;
    }

    /**
     * [get] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmtransportNo() {
        checkSpecifiedProperty("firmtransportNo");
        return convertEmptyToNull(_firmtransportNo);
    }

    /**
     * [set] FIRMTRANSPORT_NO: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmtransportNo The value of the column 'FIRMTRANSPORT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmtransportNo(String firmtransportNo) {
        registerModifiedProperty("firmtransportNo");
        _firmtransportNo = firmtransportNo;
    }

    /**
     * [get] MANUFACTURE_CD: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureCd() {
        checkSpecifiedProperty("manufactureCd");
        return convertEmptyToNull(_manufactureCd);
    }

    /**
     * [set] MANUFACTURE_CD: {varchar(255)} <br>
     * 製造記号
     * @param manufactureCd The value of the column 'MANUFACTURE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureCd(String manufactureCd) {
        registerModifiedProperty("manufactureCd");
        _manufactureCd = manufactureCd;
    }

    /**
     * [get] OTHER_LOT1: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'OTHER_LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherLot1() {
        checkSpecifiedProperty("otherLot1");
        return convertEmptyToNull(_otherLot1);
    }

    /**
     * [set] OTHER_LOT1: {varchar(255)} <br>
     * 在庫区分
     * @param otherLot1 The value of the column 'OTHER_LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherLot1(String otherLot1) {
        registerModifiedProperty("otherLot1");
        _otherLot1 = otherLot1;
    }

    /**
     * [get] CASE_CREATE_TYPE: {varchar(255)} <br>
     * ケース作成区分
     * @return The value of the column 'CASE_CREATE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseCreateType() {
        checkSpecifiedProperty("caseCreateType");
        return convertEmptyToNull(_caseCreateType);
    }

    /**
     * [set] CASE_CREATE_TYPE: {varchar(255)} <br>
     * ケース作成区分
     * @param caseCreateType The value of the column 'CASE_CREATE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseCreateType(String caseCreateType) {
        registerModifiedProperty("caseCreateType");
        _caseCreateType = caseCreateType;
    }

    /**
     * [get] CODE_SNAME: {varchar(255)} <br>
     * ケース作成区分名称
     * @return The value of the column 'CODE_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodeSname() {
        checkSpecifiedProperty("codeSname");
        return convertEmptyToNull(_codeSname);
    }

    /**
     * [set] CODE_SNAME: {varchar(255)} <br>
     * ケース作成区分名称
     * @param codeSname The value of the column 'CODE_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodeSname(String codeSname) {
        registerModifiedProperty("codeSname");
        _codeSname = codeSname;
    }

    /**
     * [get] RECEIVE_DATE: {varchar(255)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDate() {
        checkSpecifiedProperty("receiveDate");
        return convertEmptyToNull(_receiveDate);
    }

    /**
     * [set] RECEIVE_DATE: {varchar(255)} <br>
     * 入庫日
     * @param receiveDate The value of the column 'RECEIVE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDate(String receiveDate) {
        registerModifiedProperty("receiveDate");
        _receiveDate = receiveDate;
    }

    /**
     * [get] ARRIVAL_PORT_DATE: {varchar(255)} <br>
     * 入港日
     * @return The value of the column 'ARRIVAL_PORT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalPortDate() {
        checkSpecifiedProperty("arrivalPortDate");
        return convertEmptyToNull(_arrivalPortDate);
    }

    /**
     * [set] ARRIVAL_PORT_DATE: {varchar(255)} <br>
     * 入港日
     * @param arrivalPortDate The value of the column 'ARRIVAL_PORT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalPortDate(String arrivalPortDate) {
        registerModifiedProperty("arrivalPortDate");
        _arrivalPortDate = arrivalPortDate;
    }

    /**
     * [get] SHIP_NAME: {varchar(255)} <br>
     * 船名
     * @return The value of the column 'SHIP_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipName() {
        checkSpecifiedProperty("shipName");
        return convertEmptyToNull(_shipName);
    }

    /**
     * [set] SHIP_NAME: {varchar(255)} <br>
     * 船名
     * @param shipName The value of the column 'SHIP_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipName(String shipName) {
        registerModifiedProperty("shipName");
        _shipName = shipName;
    }

    /**
     * [get] INIT_NUM: {varchar(255)} <br>
     * ケース初期数量
     * @return The value of the column 'INIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInitNum() {
        checkSpecifiedProperty("initNum");
        return convertEmptyToNull(_initNum);
    }

    /**
     * [set] INIT_NUM: {varchar(255)} <br>
     * ケース初期数量
     * @param initNum The value of the column 'INIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitNum(String initNum) {
        registerModifiedProperty("initNum");
        _initNum = initNum;
    }

    /**
     * [get] MIXED_FLG: {varchar(255)} <br>
     * 開封フラグ
     * @return The value of the column 'MIXED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMixedFlg() {
        checkSpecifiedProperty("mixedFlg");
        return convertEmptyToNull(_mixedFlg);
    }

    /**
     * [set] MIXED_FLG: {varchar(255)} <br>
     * 開封フラグ
     * @param mixedFlg The value of the column 'MIXED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMixedFlg(String mixedFlg) {
        registerModifiedProperty("mixedFlg");
        _mixedFlg = mixedFlg;
    }

    /**
     * [get] LEND_FLG: {varchar(255)} <br>
     * 融通フラグ
     * @return The value of the column 'LEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLendFlg() {
        checkSpecifiedProperty("lendFlg");
        return convertEmptyToNull(_lendFlg);
    }

    /**
     * [set] LEND_FLG: {varchar(255)} <br>
     * 融通フラグ
     * @param lendFlg The value of the column 'LEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLendFlg(String lendFlg) {
        registerModifiedProperty("lendFlg");
        _lendFlg = lendFlg;
    }

    /**
     * [get] LOC_GROUP: {varchar(255)} <br>
     * ロケグループ
     * @return The value of the column 'LOC_GROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocGroup() {
        checkSpecifiedProperty("locGroup");
        return convertEmptyToNull(_locGroup);
    }

    /**
     * [set] LOC_GROUP: {varchar(255)} <br>
     * ロケグループ
     * @param locGroup The value of the column 'LOC_GROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocGroup(String locGroup) {
        registerModifiedProperty("locGroup");
        _locGroup = locGroup;
    }

    /**
     * [get] LOC_CD: {varchar(255)} <br>
     * ロケコード
     * @return The value of the column 'LOC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocCd() {
        checkSpecifiedProperty("locCd");
        return convertEmptyToNull(_locCd);
    }

    /**
     * [set] LOC_CD: {varchar(255)} <br>
     * ロケコード
     * @param locCd The value of the column 'LOC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocCd(String locCd) {
        registerModifiedProperty("locCd");
        _locCd = locCd;
    }

    /**
     * [get] SHIP_DATE: {varchar(255)} <br>
     * 出庫日
     * @return The value of the column 'SHIP_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipDate() {
        checkSpecifiedProperty("shipDate");
        return convertEmptyToNull(_shipDate);
    }

    /**
     * [set] SHIP_DATE: {varchar(255)} <br>
     * 出庫日
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipDate(String shipDate) {
        registerModifiedProperty("shipDate");
        _shipDate = shipDate;
    }

    /**
     * [get] CURRENT_LOCATION_CD: {varchar(255)} <br>
     * 現在地コード
     * @return The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrentLocationCd() {
        checkSpecifiedProperty("currentLocationCd");
        return convertEmptyToNull(_currentLocationCd);
    }

    /**
     * [set] CURRENT_LOCATION_CD: {varchar(255)} <br>
     * 現在地コード
     * @param currentLocationCd The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrentLocationCd(String currentLocationCd) {
        registerModifiedProperty("currentLocationCd");
        _currentLocationCd = currentLocationCd;
    }

    /**
     * [get] CURRENT_LOCATION_SNAME: {varchar(255)} <br>
     * 現在地名称
     * @return The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrentLocationSname() {
        checkSpecifiedProperty("currentLocationSname");
        return convertEmptyToNull(_currentLocationSname);
    }

    /**
     * [set] CURRENT_LOCATION_SNAME: {varchar(255)} <br>
     * 現在地名称
     * @param currentLocationSname The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrentLocationSname(String currentLocationSname) {
        registerModifiedProperty("currentLocationSname");
        _currentLocationSname = currentLocationSname;
    }

    /**
     * [get] SHIP_TO_CD: {varchar(255)} <br>
     * 受入先コード
     * @return The value of the column 'SHIP_TO_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipToCd() {
        checkSpecifiedProperty("shipToCd");
        return convertEmptyToNull(_shipToCd);
    }

    /**
     * [set] SHIP_TO_CD: {varchar(255)} <br>
     * 受入先コード
     * @param shipToCd The value of the column 'SHIP_TO_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipToCd(String shipToCd) {
        registerModifiedProperty("shipToCd");
        _shipToCd = shipToCd;
    }

    /**
     * [get] SHIP_TO_SNAME: {varchar(255)} <br>
     * 受入先名称
     * @return The value of the column 'SHIP_TO_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipToSname() {
        checkSpecifiedProperty("shipToSname");
        return convertEmptyToNull(_shipToSname);
    }

    /**
     * [set] SHIP_TO_SNAME: {varchar(255)} <br>
     * 受入先名称
     * @param shipToSname The value of the column 'SHIP_TO_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipToSname(String shipToSname) {
        registerModifiedProperty("shipToSname");
        _shipToSname = shipToSname;
    }

    /**
     * [get] CREATE_DATETIME: {varchar(255)} <br>
     * 情報作成日
     * @return The value of the column 'CREATE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateDatetime() {
        checkSpecifiedProperty("createDatetime");
        return convertEmptyToNull(_createDatetime);
    }

    /**
     * [set] CREATE_DATETIME: {varchar(255)} <br>
     * 情報作成日
     * @param createDatetime The value of the column 'CREATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDatetime(String createDatetime) {
        registerModifiedProperty("createDatetime");
        _createDatetime = createDatetime;
    }

    /**
     * [get] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @return The value of the column 'TRACE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTraceType() {
        checkSpecifiedProperty("traceType");
        return convertEmptyToNull(_traceType);
    }

    /**
     * [set] TRACE_TYPE: {varchar(255)} <br>
     * 追跡区分
     * @param traceType The value of the column 'TRACE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTraceType(String traceType) {
        registerModifiedProperty("traceType");
        _traceType = traceType;
    }

    /**
     * [get] TRACE_TYPE_SNAME: {varchar(255)} <br>
     * 追跡区分名称
     * @return The value of the column 'TRACE_TYPE_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getTraceTypeSname() {
        checkSpecifiedProperty("traceTypeSname");
        return convertEmptyToNull(_traceTypeSname);
    }

    /**
     * [set] TRACE_TYPE_SNAME: {varchar(255)} <br>
     * 追跡区分名称
     * @param traceTypeSname The value of the column 'TRACE_TYPE_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTraceTypeSname(String traceTypeSname) {
        registerModifiedProperty("traceTypeSname");
        _traceTypeSname = traceTypeSname;
    }

    /**
     * [get] EXAM_STS: {varchar(255)} <br>
     * 検査区分
     * @return The value of the column 'EXAM_STS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamSts() {
        checkSpecifiedProperty("examSts");
        return convertEmptyToNull(_examSts);
    }

    /**
     * [set] EXAM_STS: {varchar(255)} <br>
     * 検査区分
     * @param examSts The value of the column 'EXAM_STS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamSts(String examSts) {
        registerModifiedProperty("examSts");
        _examSts = examSts;
    }

    /**
     * [get] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @return The value of the column 'CASE_IN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseInNum() {
        checkSpecifiedProperty("caseInNum");
        return convertEmptyToNull(_caseInNum);
    }

    /**
     * [set] CASE_IN_NUM: {varchar(255)} <br>
     * ケース内数量
     * @param caseInNum The value of the column 'CASE_IN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseInNum(String caseInNum) {
        registerModifiedProperty("caseInNum");
        _caseInNum = caseInNum;
    }

    /**
     * [get] SHIPPING_NUM: {varchar(255)} <br>
     * 出庫数量
     * @return The value of the column 'SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingNum() {
        checkSpecifiedProperty("shippingNum");
        return convertEmptyToNull(_shippingNum);
    }

    /**
     * [set] SHIPPING_NUM: {varchar(255)} <br>
     * 出庫数量
     * @param shippingNum The value of the column 'SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingNum(String shippingNum) {
        registerModifiedProperty("shippingNum");
        _shippingNum = shippingNum;
    }

    /**
     * [get] ASSORT_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @return The value of the column 'ASSORT_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortDatetime() {
        checkSpecifiedProperty("assortDatetime");
        return convertEmptyToNull(_assortDatetime);
    }

    /**
     * [set] ASSORT_DATETIME: {varchar(255)} <br>
     * 仕分年月日
     * @param assortDatetime The value of the column 'ASSORT_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortDatetime(String assortDatetime) {
        registerModifiedProperty("assortDatetime");
        _assortDatetime = assortDatetime;
    }

    /**
     * [get] LINE_BLOCK: {varchar(255)} <br>
     * ラインブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(255)} <br>
     * ラインブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] ASSORTED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTED_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedUnit() {
        checkSpecifiedProperty("assortedUnit");
        return convertEmptyToNull(_assortedUnit);
    }

    /**
     * [set] ASSORTED_UNIT: {varchar(255)} <br>
     * 仕分ロケ
     * @param assortedUnit The value of the column 'ASSORTED_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedUnit(String assortedUnit) {
        registerModifiedProperty("assortedUnit");
        _assortedUnit = assortedUnit;
    }

    /**
     * [get] ASSORTED_INDEX: {varchar(255)} <br>
     * 投入順
     * @return The value of the column 'ASSORTED_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedIndex() {
        checkSpecifiedProperty("assortedIndex");
        return convertEmptyToNull(_assortedIndex);
    }

    /**
     * [set] ASSORTED_INDEX: {varchar(255)} <br>
     * 投入順
     * @param assortedIndex The value of the column 'ASSORTED_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedIndex(String assortedIndex) {
        registerModifiedProperty("assortedIndex");
        _assortedIndex = assortedIndex;
    }

    /**
     * [get] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @return The value of the column 'OPERATION_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOperationCode() {
        checkSpecifiedProperty("operationCode");
        return convertEmptyToNull(_operationCode);
    }

    /**
     * [set] OPERATION_CODE: {varchar(255)} <br>
     * 操作数量符号
     * @param operationCode The value of the column 'OPERATION_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationCode(String operationCode) {
        registerModifiedProperty("operationCode");
        _operationCode = operationCode;
    }

    /**
     * [get] OPERATION_NUM: {varchar(255)} <br>
     * 操作数量
     * @return The value of the column 'OPERATION_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOperationNum() {
        checkSpecifiedProperty("operationNum");
        return convertEmptyToNull(_operationNum);
    }

    /**
     * [set] OPERATION_NUM: {varchar(255)} <br>
     * 操作数量
     * @param operationNum The value of the column 'OPERATION_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperationNum(String operationNum) {
        registerModifiedProperty("operationNum");
        _operationNum = operationNum;
    }

    /**
     * [get] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @return The value of the column 'ASSORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortNum() {
        checkSpecifiedProperty("assortNum");
        return convertEmptyToNull(_assortNum);
    }

    /**
     * [set] ASSORT_NUM: {varchar(255)} <br>
     * 仕分数量
     * @param assortNum The value of the column 'ASSORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortNum(String assortNum) {
        registerModifiedProperty("assortNum");
        _assortNum = assortNum;
    }

    /**
     * [get] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @return The value of the column 'ASSORT_DIF_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortDifNum() {
        checkSpecifiedProperty("assortDifNum");
        return convertEmptyToNull(_assortDifNum);
    }

    /**
     * [set] ASSORT_DIF_NUM: {varchar(255)} <br>
     * 差異不良数量
     * @param assortDifNum The value of the column 'ASSORT_DIF_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortDifNum(String assortDifNum) {
        registerModifiedProperty("assortDifNum");
        _assortDifNum = assortDifNum;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionCd() {
        checkSpecifiedProperty("directionCd");
        return convertEmptyToNull(_directionCd);
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 方面CD
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionCd(String directionCd) {
        registerModifiedProperty("directionCd");
        _directionCd = directionCd;
    }

    /**
     * [get] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistonType() {
        checkSpecifiedProperty("pistonType");
        return convertEmptyToNull(_pistonType);
    }

    /**
     * [set] PISTON_TYPE: {varchar(255)} <br>
     * ピストン区分
     * @param pistonType The value of the column 'PISTON_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistonType(String pistonType) {
        registerModifiedProperty("pistonType");
        _pistonType = pistonType;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @return The value of the column 'DIRECTION_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionNum() {
        checkSpecifiedProperty("directionNum");
        return convertEmptyToNull(_directionNum);
    }

    /**
     * [set] DIRECTION_NUM: {varchar(255)} <br>
     * さしず数量
     * @param directionNum The value of the column 'DIRECTION_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionNum(String directionNum) {
        registerModifiedProperty("directionNum");
        _directionNum = directionNum;
    }

    /**
     * [get] SUPPLIER_RCV_NO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIER_RCV_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierRcvNo() {
        checkSpecifiedProperty("supplierRcvNo");
        return convertEmptyToNull(_supplierRcvNo);
    }

    /**
     * [set] SUPPLIER_RCV_NO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierRcvNo The value of the column 'SUPPLIER_RCV_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierRcvNo(String supplierRcvNo) {
        registerModifiedProperty("supplierRcvNo");
        _supplierRcvNo = supplierRcvNo;
    }

    /**
     * [get] TOKUHAN_CD: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'TOKUHAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTokuhanCd() {
        checkSpecifiedProperty("tokuhanCd");
        return convertEmptyToNull(_tokuhanCd);
    }

    /**
     * [set] TOKUHAN_CD: {varchar(255)} <br>
     * 特販業者CD
     * @param tokuhanCd The value of the column 'TOKUHAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTokuhanCd(String tokuhanCd) {
        registerModifiedProperty("tokuhanCd");
        _tokuhanCd = tokuhanCd;
    }

    /**
     * [get] TOKUHAN_SNAME: {varchar(255)} <br>
     * 特販業者名称
     * @return The value of the column 'TOKUHAN_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getTokuhanSname() {
        checkSpecifiedProperty("tokuhanSname");
        return convertEmptyToNull(_tokuhanSname);
    }

    /**
     * [set] TOKUHAN_SNAME: {varchar(255)} <br>
     * 特販業者名称
     * @param tokuhanSname The value of the column 'TOKUHAN_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTokuhanSname(String tokuhanSname) {
        registerModifiedProperty("tokuhanSname");
        _tokuhanSname = tokuhanSname;
    }

    /**
     * [get] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKER_CASE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakerCaseNo() {
        checkSpecifiedProperty("makerCaseNo");
        return convertEmptyToNull(_makerCaseNo);
    }

    /**
     * [set] MAKER_CASE_NO: {varchar(255)} <br>
     * メーカーケースCD
     * @param makerCaseNo The value of the column 'MAKER_CASE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakerCaseNo(String makerCaseNo) {
        registerModifiedProperty("makerCaseNo");
        _makerCaseNo = makerCaseNo;
    }

    /**
     * [get] CASE_ITF_NO: {varchar(255)} <br>
     * ITFNo.
     * @return The value of the column 'CASE_ITF_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseItfNo() {
        checkSpecifiedProperty("caseItfNo");
        return convertEmptyToNull(_caseItfNo);
    }

    /**
     * [set] CASE_ITF_NO: {varchar(255)} <br>
     * ITFNo.
     * @param caseItfNo The value of the column 'CASE_ITF_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseItfNo(String caseItfNo) {
        registerModifiedProperty("caseItfNo");
        _caseItfNo = caseItfNo;
    }

    /**
     * [get] CASE_BARCODE_VALIANT: {varchar(255)} <br>
     * Barcode Valiant
     * @return The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseBarcodeValiant() {
        checkSpecifiedProperty("caseBarcodeValiant");
        return convertEmptyToNull(_caseBarcodeValiant);
    }

    /**
     * [set] CASE_BARCODE_VALIANT: {varchar(255)} <br>
     * Barcode Valiant
     * @param caseBarcodeValiant The value of the column 'CASE_BARCODE_VALIANT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseBarcodeValiant(String caseBarcodeValiant) {
        registerModifiedProperty("caseBarcodeValiant");
        _caseBarcodeValiant = caseBarcodeValiant;
    }

    /**
     * [get] CASE_LOT4: {varchar(255)} <br>
     * 実製造年月日
     * @return The value of the column 'CASE_LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseLot4() {
        checkSpecifiedProperty("caseLot4");
        return convertEmptyToNull(_caseLot4);
    }

    /**
     * [set] CASE_LOT4: {varchar(255)} <br>
     * 実製造年月日
     * @param caseLot4 The value of the column 'CASE_LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseLot4(String caseLot4) {
        registerModifiedProperty("caseLot4");
        _caseLot4 = caseLot4;
    }

    /**
     * [get] CASE_CENTER_NO: {varchar(255)} <br>
     * センターNo.
     * @return The value of the column 'CASE_CENTER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseCenterNo() {
        checkSpecifiedProperty("caseCenterNo");
        return convertEmptyToNull(_caseCenterNo);
    }

    /**
     * [set] CASE_CENTER_NO: {varchar(255)} <br>
     * センターNo.
     * @param caseCenterNo The value of the column 'CASE_CENTER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseCenterNo(String caseCenterNo) {
        registerModifiedProperty("caseCenterNo");
        _caseCenterNo = caseCenterNo;
    }

    /**
     * [get] CASE_PACK_NO: {varchar(255)} <br>
     * ケースパッカーNo.
     * @return The value of the column 'CASE_PACK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePackNo() {
        checkSpecifiedProperty("casePackNo");
        return convertEmptyToNull(_casePackNo);
    }

    /**
     * [set] CASE_PACK_NO: {varchar(255)} <br>
     * ケースパッカーNo.
     * @param casePackNo The value of the column 'CASE_PACK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePackNo(String casePackNo) {
        registerModifiedProperty("casePackNo");
        _casePackNo = casePackNo;
    }

    /**
     * [get] CASE_PACK_TIME: {varchar(255)} <br>
     * ケースパッキング時間
     * @return The value of the column 'CASE_PACK_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePackTime() {
        checkSpecifiedProperty("casePackTime");
        return convertEmptyToNull(_casePackTime);
    }

    /**
     * [set] CASE_PACK_TIME: {varchar(255)} <br>
     * ケースパッキング時間
     * @param casePackTime The value of the column 'CASE_PACK_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePackTime(String casePackTime) {
        registerModifiedProperty("casePackTime");
        _casePackTime = casePackTime;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(255)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSenderLocation() {
        checkSpecifiedProperty("senderLocation");
        return convertEmptyToNull(_senderLocation);
    }

    /**
     * [set] SENDER_LOCATION: {varchar(255)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSenderLocation(String senderLocation) {
        registerModifiedProperty("senderLocation");
        _senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(255)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiverLocation() {
        checkSpecifiedProperty("receiverLocation");
        return convertEmptyToNull(_receiverLocation);
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(255)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiverLocation(String receiverLocation) {
        registerModifiedProperty("receiverLocation");
        _receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(255)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentId() {
        checkSpecifiedProperty("shipmentId");
        return convertEmptyToNull(_shipmentId);
    }

    /**
     * [set] SHIPMENT_ID: {varchar(255)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentId(String shipmentId) {
        registerModifiedProperty("shipmentId");
        _shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(255)} <br>
     * 送信日
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentDate() {
        checkSpecifiedProperty("shipmentDate");
        return convertEmptyToNull(_shipmentDate);
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(255)} <br>
     * 送信日
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentDate(String shipmentDate) {
        registerModifiedProperty("shipmentDate");
        _shipmentDate = shipmentDate;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(255)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberOfPallets() {
        checkSpecifiedProperty("numberOfPallets");
        return convertEmptyToNull(_numberOfPallets);
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(255)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        registerModifiedProperty("numberOfPallets");
        _numberOfPallets = numberOfPallets;
    }

    /**
     * [get] CARRIER_NO: {varchar(255)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNo() {
        checkSpecifiedProperty("carrierNo");
        return convertEmptyToNull(_carrierNo);
    }

    /**
     * [set] CARRIER_NO: {varchar(255)} <br>
     * コンテナNo
     * @param carrierNo The value of the column 'CARRIER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNo(String carrierNo) {
        registerModifiedProperty("carrierNo");
        _carrierNo = carrierNo;
    }

    /**
     * [get] ORDER_NO: {varchar(255)} <br>
     * オーダーNo
     * @return The value of the column 'ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderNo() {
        checkSpecifiedProperty("orderNo");
        return convertEmptyToNull(_orderNo);
    }

    /**
     * [set] ORDER_NO: {varchar(255)} <br>
     * オーダーNo
     * @param orderNo The value of the column 'ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNo(String orderNo) {
        registerModifiedProperty("orderNo");
        _orderNo = orderNo;
    }

    /**
     * [get] SRC_CD: {varchar(255)} <br>
     * SRC_CD
     * @return The value of the column 'SRC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrcCd() {
        checkSpecifiedProperty("srcCd");
        return convertEmptyToNull(_srcCd);
    }

    /**
     * [set] SRC_CD: {varchar(255)} <br>
     * SRC_CD
     * @param srcCd The value of the column 'SRC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrcCd(String srcCd) {
        registerModifiedProperty("srcCd");
        _srcCd = srcCd;
    }

    /**
     * [get] BL_NO: {varchar(255)} <br>
     * BLNo
     * @return The value of the column 'BL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlNo() {
        checkSpecifiedProperty("blNo");
        return convertEmptyToNull(_blNo);
    }

    /**
     * [set] BL_NO: {varchar(255)} <br>
     * BLNo
     * @param blNo The value of the column 'BL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlNo(String blNo) {
        registerModifiedProperty("blNo");
        _blNo = blNo;
    }

    /**
     * [get] INVOICE_NO: {varchar(255)} <br>
     * InvoiceNo
     * @return The value of the column 'INVOICE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceNo() {
        checkSpecifiedProperty("invoiceNo");
        return convertEmptyToNull(_invoiceNo);
    }

    /**
     * [set] INVOICE_NO: {varchar(255)} <br>
     * InvoiceNo
     * @param invoiceNo The value of the column 'INVOICE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceNo(String invoiceNo) {
        registerModifiedProperty("invoiceNo");
        _invoiceNo = invoiceNo;
    }

    /**
     * [get] SSCC: {varchar(255)} <br>
     * SSCC
     * @return The value of the column 'SSCC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscc() {
        checkSpecifiedProperty("sscc");
        return convertEmptyToNull(_sscc);
    }

    /**
     * [set] SSCC: {varchar(255)} <br>
     * SSCC
     * @param sscc The value of the column 'SSCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscc(String sscc) {
        registerModifiedProperty("sscc");
        _sscc = sscc;
    }

    /**
     * [get] CASE_NO: {varchar(255)} <br>
     * ケース番号
     * @return The value of the column 'CASE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseNo() {
        checkSpecifiedProperty("caseNo");
        return convertEmptyToNull(_caseNo);
    }

    /**
     * [set] CASE_NO: {varchar(255)} <br>
     * ケース番号
     * @param caseNo The value of the column 'CASE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseNo(String caseNo) {
        registerModifiedProperty("caseNo");
        _caseNo = caseNo;
    }

    /**
     * [get] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（保管場）
     * @return The value of the column 'INV_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvNum() {
        checkSpecifiedProperty("invNum");
        return convertEmptyToNull(_invNum);
    }

    /**
     * [set] INV_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（保管場）
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvNum(String invNum) {
        registerModifiedProperty("invNum");
        _invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（仕分場）
     * @return The value of the column 'SORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortNum() {
        checkSpecifiedProperty("sortNum");
        return convertEmptyToNull(_sortNum);
    }

    /**
     * [set] SORT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（仕分場）
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortNum(String sortNum) {
        registerModifiedProperty("sortNum");
        _sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（引取場）
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdoptNum() {
        checkSpecifiedProperty("adoptNum");
        return convertEmptyToNull(_adoptNum);
    }

    /**
     * [set] ADOPT_NUM: {varchar(255)} <br>
     * 倉庫内数量内訳（引取場）
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdoptNum(String adoptNum) {
        registerModifiedProperty("adoptNum");
        _adoptNum = adoptNum;
    }

    /**
     * [get] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @return The value of the column 'DELIVERY_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryDatetime() {
        checkSpecifiedProperty("deliveryDatetime");
        return convertEmptyToNull(_deliveryDatetime);
    }

    /**
     * [set] DELIVERY_DATETIME: {varchar(255)} <br>
     * 配達年月日
     * @param deliveryDatetime The value of the column 'DELIVERY_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryDatetime(String deliveryDatetime) {
        registerModifiedProperty("deliveryDatetime");
        _deliveryDatetime = deliveryDatetime;
    }

    /**
     * [get] SPARE_STR: {varchar(255)} <br>
     * 予備項目
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {varchar(255)} <br>
     * 予備項目
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
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
