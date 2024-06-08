package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of E_SHOP_IMPORT_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShopImportSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShopImportSendDbm _instance = new EShopImportSendDbm();
    private EShopImportSendDbm() {}
    public static EShopImportSendDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShopImportSendId(), (et, vl) -> ((EShopImportSend)et).setShopImportSendId(ctl(vl)), "shopImportSendId");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSendCd(), (et, vl) -> ((EShopImportSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSendRowId(), (et, vl) -> ((EShopImportSend)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getWorkFlg(), (et, vl) -> ((EShopImportSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSymbolPosKey(), (et, vl) -> ((EShopImportSend)et).setSymbolPosKey((String)vl), "symbolPosKey");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getWarehouseCd(), (et, vl) -> ((EShopImportSend)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getWarehouseSname(), (et, vl) -> ((EShopImportSend)et).setWarehouseSname((String)vl), "warehouseSname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getFactoryCd(), (et, vl) -> ((EShopImportSend)et).setFactoryCd((String)vl), "factoryCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getFactorySname(), (et, vl) -> ((EShopImportSend)et).setFactorySname((String)vl), "factorySname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getItemCdCase(), (et, vl) -> ((EShopImportSend)et).setItemCdCase((String)vl), "itemCdCase");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getItemSnameCase(), (et, vl) -> ((EShopImportSend)et).setItemSnameCase((String)vl), "itemSnameCase");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getItemCdWh(), (et, vl) -> ((EShopImportSend)et).setItemCdWh((String)vl), "itemCdWh");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getItemSnameWh(), (et, vl) -> ((EShopImportSend)et).setItemSnameWh((String)vl), "itemSnameWh");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getRcvKey(), (et, vl) -> ((EShopImportSend)et).setRcvKey((String)vl), "rcvKey");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getMachineNo(), (et, vl) -> ((EShopImportSend)et).setMachineNo((String)vl), "machineNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCreateNo(), (et, vl) -> ((EShopImportSend)et).setCreateNo((String)vl), "createNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getLimitDateNow(), (et, vl) -> ((EShopImportSend)et).setLimitDateNow((String)vl), "limitDateNow");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getDesignCdCase(), (et, vl) -> ((EShopImportSend)et).setDesignCdCase((String)vl), "designCdCase");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getFirmtransportNo(), (et, vl) -> ((EShopImportSend)et).setFirmtransportNo((String)vl), "firmtransportNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getManufactureCd(), (et, vl) -> ((EShopImportSend)et).setManufactureCd((String)vl), "manufactureCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getOtherLot1(), (et, vl) -> ((EShopImportSend)et).setOtherLot1((String)vl), "otherLot1");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseCreateType(), (et, vl) -> ((EShopImportSend)et).setCaseCreateType((String)vl), "caseCreateType");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCodeSname(), (et, vl) -> ((EShopImportSend)et).setCodeSname((String)vl), "codeSname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getReceiveDate(), (et, vl) -> ((EShopImportSend)et).setReceiveDate((String)vl), "receiveDate");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getArrivalPortDate(), (et, vl) -> ((EShopImportSend)et).setArrivalPortDate((String)vl), "arrivalPortDate");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShipName(), (et, vl) -> ((EShopImportSend)et).setShipName((String)vl), "shipName");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getInitNum(), (et, vl) -> ((EShopImportSend)et).setInitNum((String)vl), "initNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getMixedFlg(), (et, vl) -> ((EShopImportSend)et).setMixedFlg((String)vl), "mixedFlg");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getLendFlg(), (et, vl) -> ((EShopImportSend)et).setLendFlg((String)vl), "lendFlg");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getLocGroup(), (et, vl) -> ((EShopImportSend)et).setLocGroup((String)vl), "locGroup");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getLocCd(), (et, vl) -> ((EShopImportSend)et).setLocCd((String)vl), "locCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShipDate(), (et, vl) -> ((EShopImportSend)et).setShipDate((String)vl), "shipDate");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCurrentLocationCd(), (et, vl) -> ((EShopImportSend)et).setCurrentLocationCd((String)vl), "currentLocationCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCurrentLocationSname(), (et, vl) -> ((EShopImportSend)et).setCurrentLocationSname((String)vl), "currentLocationSname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShipToCd(), (et, vl) -> ((EShopImportSend)et).setShipToCd((String)vl), "shipToCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShipToSname(), (et, vl) -> ((EShopImportSend)et).setShipToSname((String)vl), "shipToSname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCreateDatetime(), (et, vl) -> ((EShopImportSend)et).setCreateDatetime((String)vl), "createDatetime");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getTraceType(), (et, vl) -> ((EShopImportSend)et).setTraceType((String)vl), "traceType");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getTraceTypeSname(), (et, vl) -> ((EShopImportSend)et).setTraceTypeSname((String)vl), "traceTypeSname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getExamSts(), (et, vl) -> ((EShopImportSend)et).setExamSts((String)vl), "examSts");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseInNum(), (et, vl) -> ((EShopImportSend)et).setCaseInNum((String)vl), "caseInNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShippingNum(), (et, vl) -> ((EShopImportSend)et).setShippingNum((String)vl), "shippingNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAssortDatetime(), (et, vl) -> ((EShopImportSend)et).setAssortDatetime((String)vl), "assortDatetime");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getLineBlock(), (et, vl) -> ((EShopImportSend)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAssortedUnit(), (et, vl) -> ((EShopImportSend)et).setAssortedUnit((String)vl), "assortedUnit");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAssortedIndex(), (et, vl) -> ((EShopImportSend)et).setAssortedIndex((String)vl), "assortedIndex");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getOperationCode(), (et, vl) -> ((EShopImportSend)et).setOperationCode((String)vl), "operationCode");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getOperationNum(), (et, vl) -> ((EShopImportSend)et).setOperationNum((String)vl), "operationNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAssortNum(), (et, vl) -> ((EShopImportSend)et).setAssortNum((String)vl), "assortNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAssortDifNum(), (et, vl) -> ((EShopImportSend)et).setAssortDifNum((String)vl), "assortDifNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getDirectionCd(), (et, vl) -> ((EShopImportSend)et).setDirectionCd((String)vl), "directionCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getPistonType(), (et, vl) -> ((EShopImportSend)et).setPistonType((String)vl), "pistonType");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCustomerCd(), (et, vl) -> ((EShopImportSend)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getDirectionNum(), (et, vl) -> ((EShopImportSend)et).setDirectionNum((String)vl), "directionNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSupplierRcvNo(), (et, vl) -> ((EShopImportSend)et).setSupplierRcvNo((String)vl), "supplierRcvNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getTokuhanCd(), (et, vl) -> ((EShopImportSend)et).setTokuhanCd((String)vl), "tokuhanCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getTokuhanSname(), (et, vl) -> ((EShopImportSend)et).setTokuhanSname((String)vl), "tokuhanSname");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getMakerCaseNo(), (et, vl) -> ((EShopImportSend)et).setMakerCaseNo((String)vl), "makerCaseNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseItfNo(), (et, vl) -> ((EShopImportSend)et).setCaseItfNo((String)vl), "caseItfNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseBarcodeValiant(), (et, vl) -> ((EShopImportSend)et).setCaseBarcodeValiant((String)vl), "caseBarcodeValiant");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseLot4(), (et, vl) -> ((EShopImportSend)et).setCaseLot4((String)vl), "caseLot4");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseCenterNo(), (et, vl) -> ((EShopImportSend)et).setCaseCenterNo((String)vl), "caseCenterNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCasePackNo(), (et, vl) -> ((EShopImportSend)et).setCasePackNo((String)vl), "casePackNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCasePackTime(), (et, vl) -> ((EShopImportSend)et).setCasePackTime((String)vl), "casePackTime");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSenderLocation(), (et, vl) -> ((EShopImportSend)et).setSenderLocation((String)vl), "senderLocation");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getReceiverLocation(), (et, vl) -> ((EShopImportSend)et).setReceiverLocation((String)vl), "receiverLocation");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShipmentId(), (et, vl) -> ((EShopImportSend)et).setShipmentId((String)vl), "shipmentId");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getShipmentDate(), (et, vl) -> ((EShopImportSend)et).setShipmentDate((String)vl), "shipmentDate");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getNumberOfPallets(), (et, vl) -> ((EShopImportSend)et).setNumberOfPallets((String)vl), "numberOfPallets");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCarrierNo(), (et, vl) -> ((EShopImportSend)et).setCarrierNo((String)vl), "carrierNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getOrderNo(), (et, vl) -> ((EShopImportSend)et).setOrderNo((String)vl), "orderNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSrcCd(), (et, vl) -> ((EShopImportSend)et).setSrcCd((String)vl), "srcCd");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getBlNo(), (et, vl) -> ((EShopImportSend)et).setBlNo((String)vl), "blNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getInvoiceNo(), (et, vl) -> ((EShopImportSend)et).setInvoiceNo((String)vl), "invoiceNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSscc(), (et, vl) -> ((EShopImportSend)et).setSscc((String)vl), "sscc");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getCaseNo(), (et, vl) -> ((EShopImportSend)et).setCaseNo((String)vl), "caseNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getInvNum(), (et, vl) -> ((EShopImportSend)et).setInvNum((String)vl), "invNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSortNum(), (et, vl) -> ((EShopImportSend)et).setSortNum((String)vl), "sortNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAdoptNum(), (et, vl) -> ((EShopImportSend)et).setAdoptNum((String)vl), "adoptNum");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getDeliveryDatetime(), (et, vl) -> ((EShopImportSend)et).setDeliveryDatetime((String)vl), "deliveryDatetime");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getSpareStr(), (et, vl) -> ((EShopImportSend)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getDelFlg(), (et, vl) -> ((EShopImportSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getVersionNo(), (et, vl) -> ((EShopImportSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getControlNo(), (et, vl) -> ((EShopImportSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAddDt(), (et, vl) -> ((EShopImportSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAddUser(), (et, vl) -> ((EShopImportSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getAddProcess(), (et, vl) -> ((EShopImportSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getUpdDt(), (et, vl) -> ((EShopImportSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getUpdUser(), (et, vl) -> ((EShopImportSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShopImportSend)et).getUpdProcess(), (et, vl) -> ((EShopImportSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHOP_IMPORT_SEND";
    protected final String _tableDispName = "E_SHOP_IMPORT_SEND";
    protected final String _tablePropertyName = "EShopImportSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHOP_IMPORT_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShopImportSendId = cci("SHOP_IMPORT_SEND_ID", "SHOP_IMPORT_SEND_ID", null, null, Long.class, "shopImportSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolPosKey = cci("SYMBOL_POS_KEY", "SYMBOL_POS_KEY", null, null, String.class, "symbolPosKey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseSname = cci("WAREHOUSE_SNAME", "WAREHOUSE_SNAME", null, null, String.class, "warehouseSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactoryCd = cci("FACTORY_CD", "FACTORY_CD", null, null, String.class, "factoryCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorySname = cci("FACTORY_SNAME", "FACTORY_SNAME", null, null, String.class, "factorySname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCdCase = cci("ITEM_CD_CASE", "ITEM_CD_CASE", null, null, String.class, "itemCdCase", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSnameCase = cci("ITEM_SNAME_CASE", "ITEM_SNAME_CASE", null, null, String.class, "itemSnameCase", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCdWh = cci("ITEM_CD_WH", "ITEM_CD_WH", null, null, String.class, "itemCdWh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSnameWh = cci("ITEM_SNAME_WH", "ITEM_SNAME_WH", null, null, String.class, "itemSnameWh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvKey = cci("RCV_KEY", "RCV_KEY", null, null, String.class, "rcvKey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineNo = cci("MACHINE_NO", "MACHINE_NO", null, null, String.class, "machineNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateNo = cci("CREATE_NO", "CREATE_NO", null, null, String.class, "createNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDateNow = cci("LIMIT_DATE_NOW", "LIMIT_DATE_NOW", null, null, String.class, "limitDateNow", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCdCase = cci("DESIGN_CD_CASE", "DESIGN_CD_CASE", null, null, String.class, "designCdCase", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmtransportNo = cci("FIRMTRANSPORT_NO", "FIRMTRANSPORT_NO", null, null, String.class, "firmtransportNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureCd = cci("MANUFACTURE_CD", "MANUFACTURE_CD", null, null, String.class, "manufactureCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherLot1 = cci("OTHER_LOT1", "OTHER_LOT1", null, null, String.class, "otherLot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseCreateType = cci("CASE_CREATE_TYPE", "CASE_CREATE_TYPE", null, null, String.class, "caseCreateType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodeSname = cci("CODE_SNAME", "CODE_SNAME", null, null, String.class, "codeSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDate = cci("RECEIVE_DATE", "RECEIVE_DATE", null, null, String.class, "receiveDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalPortDate = cci("ARRIVAL_PORT_DATE", "ARRIVAL_PORT_DATE", null, null, String.class, "arrivalPortDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipName = cci("SHIP_NAME", "SHIP_NAME", null, null, String.class, "shipName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitNum = cci("INIT_NUM", "INIT_NUM", null, null, String.class, "initNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedFlg = cci("MIXED_FLG", "MIXED_FLG", null, null, String.class, "mixedFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLendFlg = cci("LEND_FLG", "LEND_FLG", null, null, String.class, "lendFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocGroup = cci("LOC_GROUP", "LOC_GROUP", null, null, String.class, "locGroup", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocCd = cci("LOC_CD", "LOC_CD", null, null, String.class, "locCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipDate = cci("SHIP_DATE", "SHIP_DATE", null, null, String.class, "shipDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrentLocationCd = cci("CURRENT_LOCATION_CD", "CURRENT_LOCATION_CD", null, null, String.class, "currentLocationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrentLocationSname = cci("CURRENT_LOCATION_SNAME", "CURRENT_LOCATION_SNAME", null, null, String.class, "currentLocationSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipToCd = cci("SHIP_TO_CD", "SHIP_TO_CD", null, null, String.class, "shipToCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipToSname = cci("SHIP_TO_SNAME", "SHIP_TO_SNAME", null, null, String.class, "shipToSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDatetime = cci("CREATE_DATETIME", "CREATE_DATETIME", null, null, String.class, "createDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTraceType = cci("TRACE_TYPE", "TRACE_TYPE", null, null, String.class, "traceType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTraceTypeSname = cci("TRACE_TYPE_SNAME", "TRACE_TYPE_SNAME", null, null, String.class, "traceTypeSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamSts = cci("EXAM_STS", "EXAM_STS", null, null, String.class, "examSts", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseInNum = cci("CASE_IN_NUM", "CASE_IN_NUM", null, null, String.class, "caseInNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingNum = cci("SHIPPING_NUM", "SHIPPING_NUM", null, null, String.class, "shippingNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortDatetime = cci("ASSORT_DATETIME", "ASSORT_DATETIME", null, null, String.class, "assortDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedUnit = cci("ASSORTED_UNIT", "ASSORTED_UNIT", null, null, String.class, "assortedUnit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedIndex = cci("ASSORTED_INDEX", "ASSORTED_INDEX", null, null, String.class, "assortedIndex", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationCode = cci("OPERATION_CODE", "OPERATION_CODE", null, null, String.class, "operationCode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationNum = cci("OPERATION_NUM", "OPERATION_NUM", null, null, String.class, "operationNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortNum = cci("ASSORT_NUM", "ASSORT_NUM", null, null, String.class, "assortNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortDifNum = cci("ASSORT_DIF_NUM", "ASSORT_DIF_NUM", null, null, String.class, "assortDifNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionCd = cci("DIRECTION_CD", "DIRECTION_CD", null, null, String.class, "directionCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistonType = cci("PISTON_TYPE", "PISTON_TYPE", null, null, String.class, "pistonType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionNum = cci("DIRECTION_NUM", "DIRECTION_NUM", null, null, String.class, "directionNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierRcvNo = cci("SUPPLIER_RCV_NO", "SUPPLIER_RCV_NO", null, null, String.class, "supplierRcvNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTokuhanCd = cci("TOKUHAN_CD", "TOKUHAN_CD", null, null, String.class, "tokuhanCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTokuhanSname = cci("TOKUHAN_SNAME", "TOKUHAN_SNAME", null, null, String.class, "tokuhanSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakerCaseNo = cci("MAKER_CASE_NO", "MAKER_CASE_NO", null, null, String.class, "makerCaseNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseItfNo = cci("CASE_ITF_NO", "CASE_ITF_NO", null, null, String.class, "caseItfNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseBarcodeValiant = cci("CASE_BARCODE_VALIANT", "CASE_BARCODE_VALIANT", null, null, String.class, "caseBarcodeValiant", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseLot4 = cci("CASE_LOT4", "CASE_LOT4", null, null, String.class, "caseLot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseCenterNo = cci("CASE_CENTER_NO", "CASE_CENTER_NO", null, null, String.class, "caseCenterNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePackNo = cci("CASE_PACK_NO", "CASE_PACK_NO", null, null, String.class, "casePackNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePackTime = cci("CASE_PACK_TIME", "CASE_PACK_TIME", null, null, String.class, "casePackTime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSenderLocation = cci("SENDER_LOCATION", "SENDER_LOCATION", null, null, String.class, "senderLocation", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiverLocation = cci("RECEIVER_LOCATION", "RECEIVER_LOCATION", null, null, String.class, "receiverLocation", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentId = cci("SHIPMENT_ID", "SHIPMENT_ID", null, null, String.class, "shipmentId", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentDate = cci("SHIPMENT_DATE", "SHIPMENT_DATE", null, null, String.class, "shipmentDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberOfPallets = cci("NUMBER_OF_PALLETS", "NUMBER_OF_PALLETS", null, null, String.class, "numberOfPallets", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNo = cci("CARRIER_NO", "CARRIER_NO", null, null, String.class, "carrierNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNo = cci("ORDER_NO", "ORDER_NO", null, null, String.class, "orderNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrcCd = cci("SRC_CD", "SRC_CD", null, null, String.class, "srcCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlNo = cci("BL_NO", "BL_NO", null, null, String.class, "blNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceNo = cci("INVOICE_NO", "INVOICE_NO", null, null, String.class, "invoiceNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscc = cci("SSCC", "SSCC", null, null, String.class, "sscc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseNo = cci("CASE_NO", "CASE_NO", null, null, String.class, "caseNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvNum = cci("INV_NUM", "INV_NUM", null, null, String.class, "invNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortNum = cci("SORT_NUM", "SORT_NUM", null, null, String.class, "sortNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdoptNum = cci("ADOPT_NUM", "ADOPT_NUM", null, null, String.class, "adoptNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryDatetime = cci("DELIVERY_DATETIME", "DELIVERY_DATETIME", null, null, String.class, "deliveryDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopImportSendId() { return _columnShopImportSendId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * SYMBOL_POS_KEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolPosKey() { return _columnSymbolPosKey; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * WAREHOUSE_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseSname() { return _columnWarehouseSname; }
    /**
     * FACTORY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactoryCd() { return _columnFactoryCd; }
    /**
     * FACTORY_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorySname() { return _columnFactorySname; }
    /**
     * ITEM_CD_CASE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCdCase() { return _columnItemCdCase; }
    /**
     * ITEM_SNAME_CASE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSnameCase() { return _columnItemSnameCase; }
    /**
     * ITEM_CD_WH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCdWh() { return _columnItemCdWh; }
    /**
     * ITEM_SNAME_WH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSnameWh() { return _columnItemSnameWh; }
    /**
     * RCV_KEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvKey() { return _columnRcvKey; }
    /**
     * MACHINE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachineNo() { return _columnMachineNo; }
    /**
     * CREATE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateNo() { return _columnCreateNo; }
    /**
     * LIMIT_DATE_NOW: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDateNow() { return _columnLimitDateNow; }
    /**
     * DESIGN_CD_CASE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCdCase() { return _columnDesignCdCase; }
    /**
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmtransportNo() { return _columnFirmtransportNo; }
    /**
     * MANUFACTURE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureCd() { return _columnManufactureCd; }
    /**
     * OTHER_LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherLot1() { return _columnOtherLot1; }
    /**
     * CASE_CREATE_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseCreateType() { return _columnCaseCreateType; }
    /**
     * CODE_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodeSname() { return _columnCodeSname; }
    /**
     * RECEIVE_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDate() { return _columnReceiveDate; }
    /**
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalPortDate() { return _columnArrivalPortDate; }
    /**
     * SHIP_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipName() { return _columnShipName; }
    /**
     * INIT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitNum() { return _columnInitNum; }
    /**
     * MIXED_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedFlg() { return _columnMixedFlg; }
    /**
     * LEND_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLendFlg() { return _columnLendFlg; }
    /**
     * LOC_GROUP: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocGroup() { return _columnLocGroup; }
    /**
     * LOC_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocCd() { return _columnLocCd; }
    /**
     * SHIP_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipDate() { return _columnShipDate; }
    /**
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrentLocationCd() { return _columnCurrentLocationCd; }
    /**
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrentLocationSname() { return _columnCurrentLocationSname; }
    /**
     * SHIP_TO_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipToCd() { return _columnShipToCd; }
    /**
     * SHIP_TO_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipToSname() { return _columnShipToSname; }
    /**
     * CREATE_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDatetime() { return _columnCreateDatetime; }
    /**
     * TRACE_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceType() { return _columnTraceType; }
    /**
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceTypeSname() { return _columnTraceTypeSname; }
    /**
     * EXAM_STS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamSts() { return _columnExamSts; }
    /**
     * CASE_IN_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseInNum() { return _columnCaseInNum; }
    /**
     * SHIPPING_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingNum() { return _columnShippingNum; }
    /**
     * ASSORT_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortDatetime() { return _columnAssortDatetime; }
    /**
     * LINE_BLOCK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * ASSORTED_UNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedUnit() { return _columnAssortedUnit; }
    /**
     * ASSORTED_INDEX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedIndex() { return _columnAssortedIndex; }
    /**
     * OPERATION_CODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationCode() { return _columnOperationCode; }
    /**
     * OPERATION_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationNum() { return _columnOperationNum; }
    /**
     * ASSORT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortNum() { return _columnAssortNum; }
    /**
     * ASSORT_DIF_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortDifNum() { return _columnAssortDifNum; }
    /**
     * DIRECTION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionCd() { return _columnDirectionCd; }
    /**
     * PISTON_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistonType() { return _columnPistonType; }
    /**
     * CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * DIRECTION_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionNum() { return _columnDirectionNum; }
    /**
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierRcvNo() { return _columnSupplierRcvNo; }
    /**
     * TOKUHAN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTokuhanCd() { return _columnTokuhanCd; }
    /**
     * TOKUHAN_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTokuhanSname() { return _columnTokuhanSname; }
    /**
     * MAKER_CASE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakerCaseNo() { return _columnMakerCaseNo; }
    /**
     * CASE_ITF_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseItfNo() { return _columnCaseItfNo; }
    /**
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseBarcodeValiant() { return _columnCaseBarcodeValiant; }
    /**
     * CASE_LOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseLot4() { return _columnCaseLot4; }
    /**
     * CASE_CENTER_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseCenterNo() { return _columnCaseCenterNo; }
    /**
     * CASE_PACK_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePackNo() { return _columnCasePackNo; }
    /**
     * CASE_PACK_TIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePackTime() { return _columnCasePackTime; }
    /**
     * SENDER_LOCATION: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSenderLocation() { return _columnSenderLocation; }
    /**
     * RECEIVER_LOCATION: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiverLocation() { return _columnReceiverLocation; }
    /**
     * SHIPMENT_ID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentId() { return _columnShipmentId; }
    /**
     * SHIPMENT_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentDate() { return _columnShipmentDate; }
    /**
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberOfPallets() { return _columnNumberOfPallets; }
    /**
     * CARRIER_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNo() { return _columnCarrierNo; }
    /**
     * ORDER_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNo() { return _columnOrderNo; }
    /**
     * SRC_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrcCd() { return _columnSrcCd; }
    /**
     * BL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlNo() { return _columnBlNo; }
    /**
     * INVOICE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceNo() { return _columnInvoiceNo; }
    /**
     * SSCC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscc() { return _columnSscc; }
    /**
     * CASE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseNo() { return _columnCaseNo; }
    /**
     * INV_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvNum() { return _columnInvNum; }
    /**
     * SORT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortNum() { return _columnSortNum; }
    /**
     * ADOPT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdoptNum() { return _columnAdoptNum; }
    /**
     * DELIVERY_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryDatetime() { return _columnDeliveryDatetime; }
    /**
     * SPARE_STR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnShopImportSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnSymbolPosKey());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseSname());
        ls.add(columnFactoryCd());
        ls.add(columnFactorySname());
        ls.add(columnItemCdCase());
        ls.add(columnItemSnameCase());
        ls.add(columnItemCdWh());
        ls.add(columnItemSnameWh());
        ls.add(columnRcvKey());
        ls.add(columnMachineNo());
        ls.add(columnCreateNo());
        ls.add(columnLimitDateNow());
        ls.add(columnDesignCdCase());
        ls.add(columnFirmtransportNo());
        ls.add(columnManufactureCd());
        ls.add(columnOtherLot1());
        ls.add(columnCaseCreateType());
        ls.add(columnCodeSname());
        ls.add(columnReceiveDate());
        ls.add(columnArrivalPortDate());
        ls.add(columnShipName());
        ls.add(columnInitNum());
        ls.add(columnMixedFlg());
        ls.add(columnLendFlg());
        ls.add(columnLocGroup());
        ls.add(columnLocCd());
        ls.add(columnShipDate());
        ls.add(columnCurrentLocationCd());
        ls.add(columnCurrentLocationSname());
        ls.add(columnShipToCd());
        ls.add(columnShipToSname());
        ls.add(columnCreateDatetime());
        ls.add(columnTraceType());
        ls.add(columnTraceTypeSname());
        ls.add(columnExamSts());
        ls.add(columnCaseInNum());
        ls.add(columnShippingNum());
        ls.add(columnAssortDatetime());
        ls.add(columnLineBlock());
        ls.add(columnAssortedUnit());
        ls.add(columnAssortedIndex());
        ls.add(columnOperationCode());
        ls.add(columnOperationNum());
        ls.add(columnAssortNum());
        ls.add(columnAssortDifNum());
        ls.add(columnDirectionCd());
        ls.add(columnPistonType());
        ls.add(columnCustomerCd());
        ls.add(columnDirectionNum());
        ls.add(columnSupplierRcvNo());
        ls.add(columnTokuhanCd());
        ls.add(columnTokuhanSname());
        ls.add(columnMakerCaseNo());
        ls.add(columnCaseItfNo());
        ls.add(columnCaseBarcodeValiant());
        ls.add(columnCaseLot4());
        ls.add(columnCaseCenterNo());
        ls.add(columnCasePackNo());
        ls.add(columnCasePackTime());
        ls.add(columnSenderLocation());
        ls.add(columnReceiverLocation());
        ls.add(columnShipmentId());
        ls.add(columnShipmentDate());
        ls.add(columnNumberOfPallets());
        ls.add(columnCarrierNo());
        ls.add(columnOrderNo());
        ls.add(columnSrcCd());
        ls.add(columnBlNo());
        ls.add(columnInvoiceNo());
        ls.add(columnSscc());
        ls.add(columnCaseNo());
        ls.add(columnInvNum());
        ls.add(columnSortNum());
        ls.add(columnAdoptNum());
        ls.add(columnDeliveryDatetime());
        ls.add(columnSpareStr());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnShopImportSendId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShopImportSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShopImportSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShopImportSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShopImportSend> getEntityType() { return EShopImportSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShopImportSend newEntity() { return new EShopImportSend(); }
    public EShopImportSend newMyEntity() { return new EShopImportSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShopImportSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShopImportSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
