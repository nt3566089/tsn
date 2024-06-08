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
 * The DB meta of E_TRACKING_INFO_IMPORT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETrackingInfoImportDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETrackingInfoImportDbm _instance = new ETrackingInfoImportDbm();
    private ETrackingInfoImportDbm() {}
    public static ETrackingInfoImportDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getTrackingInfoImportId(), (et, vl) -> ((ETrackingInfoImport)et).setTrackingInfoImportId(ctl(vl)), "trackingInfoImportId");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSymbolposkey(), (et, vl) -> ((ETrackingInfoImport)et).setSymbolposkey(ctl(vl)), "symbolposkey");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getWarehousecd(), (et, vl) -> ((ETrackingInfoImport)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getWarehouseSname(), (et, vl) -> ((ETrackingInfoImport)et).setWarehouseSname((String)vl), "warehouseSname");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getFactorySname(), (et, vl) -> ((ETrackingInfoImport)et).setFactorySname((String)vl), "factorySname");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getFactorycd(), (et, vl) -> ((ETrackingInfoImport)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getItemcdCase(), (et, vl) -> ((ETrackingInfoImport)et).setItemcdCase((String)vl), "itemcdCase");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getItemSnameCase(), (et, vl) -> ((ETrackingInfoImport)et).setItemSnameCase((String)vl), "itemSnameCase");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getItemcdWh(), (et, vl) -> ((ETrackingInfoImport)et).setItemcdWh((String)vl), "itemcdWh");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getItemSnameWh(), (et, vl) -> ((ETrackingInfoImport)et).setItemSnameWh((String)vl), "itemSnameWh");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getRcvkey(), (et, vl) -> ((ETrackingInfoImport)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getMachineno(), (et, vl) -> ((ETrackingInfoImport)et).setMachineno((String)vl), "machineno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCreateno(), (et, vl) -> ((ETrackingInfoImport)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getLimitdatenow(), (et, vl) -> ((ETrackingInfoImport)et).setLimitdatenow((String)vl), "limitdatenow");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getDesigncdCase(), (et, vl) -> ((ETrackingInfoImport)et).setDesigncdCase((String)vl), "designcdCase");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getLot1(), (et, vl) -> ((ETrackingInfoImport)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getManufacturecd(), (et, vl) -> ((ETrackingInfoImport)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getOtherlot1(), (et, vl) -> ((ETrackingInfoImport)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCasecreatetype(), (et, vl) -> ((ETrackingInfoImport)et).setCasecreatetype((String)vl), "casecreatetype");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCasecreatetypeNm(), (et, vl) -> ((ETrackingInfoImport)et).setCasecreatetypeNm((String)vl), "casecreatetypeNm");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getReceivedate(), (et, vl) -> ((ETrackingInfoImport)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getArrivalportdate(), (et, vl) -> ((ETrackingInfoImport)et).setArrivalportdate((String)vl), "arrivalportdate");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getShipname(), (et, vl) -> ((ETrackingInfoImport)et).setShipname((String)vl), "shipname");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getInitnum(), (et, vl) -> ((ETrackingInfoImport)et).setInitnum(ctl(vl)), "initnum");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getMixedflg(), (et, vl) -> ((ETrackingInfoImport)et).setMixedflg((String)vl), "mixedflg");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getLendflg(), (et, vl) -> ((ETrackingInfoImport)et).setLendflg((String)vl), "lendflg");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getLocgroup(), (et, vl) -> ((ETrackingInfoImport)et).setLocgroup((String)vl), "locgroup");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getLoccd(), (et, vl) -> ((ETrackingInfoImport)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getShipdate(), (et, vl) -> ((ETrackingInfoImport)et).setShipdate((String)vl), "shipdate");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCurrentLocationCd(), (et, vl) -> ((ETrackingInfoImport)et).setCurrentLocationCd((String)vl), "currentLocationCd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCurrentLocationSname(), (et, vl) -> ((ETrackingInfoImport)et).setCurrentLocationSname((String)vl), "currentLocationSname");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getAdddatetime(), (et, vl) -> ((ETrackingInfoImport)et).setAdddatetime(cttp(vl)), "adddatetime");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getTracetype(), (et, vl) -> ((ETrackingInfoImport)et).setTracetype((String)vl), "tracetype");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getOthercd1(), (et, vl) -> ((ETrackingInfoImport)et).setOthercd1((String)vl), "othercd1");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getExamsts(), (et, vl) -> ((ETrackingInfoImport)et).setExamsts(ctl(vl)), "examsts");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCaseinnumbowl(), (et, vl) -> ((ETrackingInfoImport)et).setCaseinnumbowl(ctl(vl)), "caseinnumbowl");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getShipnumbowl(), (et, vl) -> ((ETrackingInfoImport)et).setShipnumbowl(ctl(vl)), "shipnumbowl");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSupplierrcvno(), (et, vl) -> ((ETrackingInfoImport)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getTokuhancd(), (et, vl) -> ((ETrackingInfoImport)et).setTokuhancd((String)vl), "tokuhancd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getTokuhanNm(), (et, vl) -> ((ETrackingInfoImport)et).setTokuhanNm((String)vl), "tokuhanNm");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getMakercaseno(), (et, vl) -> ((ETrackingInfoImport)et).setMakercaseno((String)vl), "makercaseno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCaseitfno(), (et, vl) -> ((ETrackingInfoImport)et).setCaseitfno((String)vl), "caseitfno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCasebarcodevaliant(), (et, vl) -> ((ETrackingInfoImport)et).setCasebarcodevaliant((String)vl), "casebarcodevaliant");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCaselot4(), (et, vl) -> ((ETrackingInfoImport)et).setCaselot4((String)vl), "caselot4");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCasecenterno(), (et, vl) -> ((ETrackingInfoImport)et).setCasecenterno((String)vl), "casecenterno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCasepackno(), (et, vl) -> ((ETrackingInfoImport)et).setCasepackno((String)vl), "casepackno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCasepacktime(), (et, vl) -> ((ETrackingInfoImport)et).setCasepacktime((String)vl), "casepacktime");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSenderLocation(), (et, vl) -> ((ETrackingInfoImport)et).setSenderLocation((String)vl), "senderLocation");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getReceiverLocation(), (et, vl) -> ((ETrackingInfoImport)et).setReceiverLocation((String)vl), "receiverLocation");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getShipmentId(), (et, vl) -> ((ETrackingInfoImport)et).setShipmentId((String)vl), "shipmentId");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getShipmentDate(), (et, vl) -> ((ETrackingInfoImport)et).setShipmentDate((String)vl), "shipmentDate");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getNumberOfPallets(), (et, vl) -> ((ETrackingInfoImport)et).setNumberOfPallets((String)vl), "numberOfPallets");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCarrierno(), (et, vl) -> ((ETrackingInfoImport)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getTkhnorderno(), (et, vl) -> ((ETrackingInfoImport)et).setTkhnorderno((String)vl), "tkhnorderno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSrccd(), (et, vl) -> ((ETrackingInfoImport)et).setSrccd((String)vl), "srccd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getBlno(), (et, vl) -> ((ETrackingInfoImport)et).setBlno((String)vl), "blno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getInvoiceno(), (et, vl) -> ((ETrackingInfoImport)et).setInvoiceno((String)vl), "invoiceno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSscc(), (et, vl) -> ((ETrackingInfoImport)et).setSscc((String)vl), "sscc");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getCaseno(), (et, vl) -> ((ETrackingInfoImport)et).setCaseno((String)vl), "caseno");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getInvNum(), (et, vl) -> ((ETrackingInfoImport)et).setInvNum(ctl(vl)), "invNum");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSortNum(), (et, vl) -> ((ETrackingInfoImport)et).setSortNum(ctl(vl)), "sortNum");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getAdoptNum(), (et, vl) -> ((ETrackingInfoImport)et).setAdoptNum(ctl(vl)), "adoptNum");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSendCd(), (et, vl) -> ((ETrackingInfoImport)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getSendFlg(), (et, vl) -> ((ETrackingInfoImport)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getDelFlg(), (et, vl) -> ((ETrackingInfoImport)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getVersionNo(), (et, vl) -> ((ETrackingInfoImport)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getControlNo(), (et, vl) -> ((ETrackingInfoImport)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getAddDt(), (et, vl) -> ((ETrackingInfoImport)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getAddUser(), (et, vl) -> ((ETrackingInfoImport)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getAddProcess(), (et, vl) -> ((ETrackingInfoImport)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getUpdDt(), (et, vl) -> ((ETrackingInfoImport)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getUpdUser(), (et, vl) -> ((ETrackingInfoImport)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETrackingInfoImport)et).getUpdProcess(), (et, vl) -> ((ETrackingInfoImport)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TRACKING_INFO_IMPORT";
    protected final String _tableDispName = "E_TRACKING_INFO_IMPORT";
    protected final String _tablePropertyName = "ETrackingInfoImport";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TRACKING_INFO_IMPORT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrackingInfoImportId = cci("TRACKING_INFO_IMPORT_ID", "TRACKING_INFO_IMPORT_ID", null, null, Long.class, "trackingInfoImportId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolposkey = cci("SYMBOLPOSKEY", "SYMBOLPOSKEY", null, null, Long.class, "symbolposkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseSname = cci("WAREHOUSE_SNAME", "WAREHOUSE_SNAME", null, null, String.class, "warehouseSname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorySname = cci("FACTORY_SNAME", "FACTORY_SNAME", null, null, String.class, "factorySname", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdCase = cci("ITEMCD_CASE", "ITEMCD_CASE", null, null, String.class, "itemcdCase", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSnameCase = cci("ITEM_SNAME_CASE", "ITEM_SNAME_CASE", null, null, String.class, "itemSnameCase", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdWh = cci("ITEMCD_WH", "ITEMCD_WH", null, null, String.class, "itemcdWh", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSnameWh = cci("ITEM_SNAME_WH", "ITEM_SNAME_WH", null, null, String.class, "itemSnameWh", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineno = cci("MACHINENO", "MACHINENO", null, null, String.class, "machineno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdatenow = cci("LIMITDATENOW", "LIMITDATENOW", null, null, String.class, "limitdatenow", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncdCase = cci("DESIGNCD_CASE", "DESIGNCD_CASE", null, null, String.class, "designcdCase", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecreatetype = cci("CASECREATETYPE", "CASECREATETYPE", null, null, String.class, "casecreatetype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecreatetypeNm = cci("CASECREATETYPE_NM", "CASECREATETYPE_NM", null, null, String.class, "casecreatetypeNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalportdate = cci("ARRIVALPORTDATE", "ARRIVALPORTDATE", null, null, String.class, "arrivalportdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipname = cci("SHIPNAME", "SHIPNAME", null, null, String.class, "shipname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitnum = cci("INITNUM", "INITNUM", null, null, Long.class, "initnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedflg = cci("MIXEDFLG", "MIXEDFLG", null, null, String.class, "mixedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLendflg = cci("LENDFLG", "LENDFLG", null, null, String.class, "lendflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocgroup = cci("LOCGROUP", "LOCGROUP", null, null, String.class, "locgroup", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipdate = cci("SHIPDATE", "SHIPDATE", null, null, String.class, "shipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrentLocationCd = cci("CURRENT_LOCATION_CD", "CURRENT_LOCATION_CD", null, null, String.class, "currentLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrentLocationSname = cci("CURRENT_LOCATION_SNAME", "CURRENT_LOCATION_SNAME", null, null, String.class, "currentLocationSname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdddatetime = cci("ADDDATETIME", "ADDDATETIME", null, null, java.sql.Timestamp.class, "adddatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetype = cci("TRACETYPE", "TRACETYPE", null, null, String.class, "tracetype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd1 = cci("OTHERCD1", "OTHERCD1", null, null, String.class, "othercd1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamsts = cci("EXAMSTS", "EXAMSTS", null, null, Long.class, "examsts", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinnumbowl = cci("CASEINNUMBOWL", "CASEINNUMBOWL", null, null, Long.class, "caseinnumbowl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipnumbowl = cci("SHIPNUMBOWL", "SHIPNUMBOWL", null, null, Long.class, "shipnumbowl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTokuhancd = cci("TOKUHANCD", "TOKUHANCD", null, null, String.class, "tokuhancd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTokuhanNm = cci("TOKUHAN_NM", "TOKUHAN_NM", null, null, String.class, "tokuhanNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakercaseno = cci("MAKERCASENO", "MAKERCASENO", null, null, String.class, "makercaseno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseitfno = cci("CASEITFNO", "CASEITFNO", null, null, String.class, "caseitfno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasebarcodevaliant = cci("CASEBARCODEVALIANT", "CASEBARCODEVALIANT", null, null, String.class, "casebarcodevaliant", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaselot4 = cci("CASELOT4", "CASELOT4", null, null, String.class, "caselot4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasecenterno = cci("CASECENTERNO", "CASECENTERNO", null, null, String.class, "casecenterno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasepackno = cci("CASEPACKNO", "CASEPACKNO", null, null, String.class, "casepackno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasepacktime = cci("CASEPACKTIME", "CASEPACKTIME", null, null, String.class, "casepacktime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSenderLocation = cci("SENDER_LOCATION", "SENDER_LOCATION", null, null, String.class, "senderLocation", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiverLocation = cci("RECEIVER_LOCATION", "RECEIVER_LOCATION", null, null, String.class, "receiverLocation", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentId = cci("SHIPMENT_ID", "SHIPMENT_ID", null, null, String.class, "shipmentId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentDate = cci("SHIPMENT_DATE", "SHIPMENT_DATE", null, null, String.class, "shipmentDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberOfPallets = cci("NUMBER_OF_PALLETS", "NUMBER_OF_PALLETS", null, null, String.class, "numberOfPallets", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTkhnorderno = cci("TKHNORDERNO", "TKHNORDERNO", null, null, String.class, "tkhnorderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrccd = cci("SRCCD", "SRCCD", null, null, String.class, "srccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlno = cci("BLNO", "BLNO", null, null, String.class, "blno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceno = cci("INVOICENO", "INVOICENO", null, null, String.class, "invoiceno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscc = cci("SSCC", "SSCC", null, null, String.class, "sscc", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseno = cci("CASENO", "CASENO", null, null, String.class, "caseno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvNum = cci("INV_NUM", "INV_NUM", null, null, Long.class, "invNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortNum = cci("SORT_NUM", "SORT_NUM", null, null, Long.class, "sortNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdoptNum = cci("ADOPT_NUM", "ADOPT_NUM", null, null, Long.class, "adoptNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingInfoImportId() { return _columnTrackingInfoImportId; }
    /**
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolposkey() { return _columnSymbolposkey; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseSname() { return _columnWarehouseSname; }
    /**
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorySname() { return _columnFactorySname; }
    /**
     * FACTORYCD: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdCase() { return _columnItemcdCase; }
    /**
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSnameCase() { return _columnItemSnameCase; }
    /**
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdWh() { return _columnItemcdWh; }
    /**
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSnameWh() { return _columnItemSnameWh; }
    /**
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * MACHINENO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachineno() { return _columnMachineno; }
    /**
     * CREATENO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateno() { return _columnCreateno; }
    /**
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdatenow() { return _columnLimitdatenow; }
    /**
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncdCase() { return _columnDesigncdCase; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * MANUFACTURECD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturecd() { return _columnManufacturecd; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * CASECREATETYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecreatetype() { return _columnCasecreatetype; }
    /**
     * CASECREATETYPE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecreatetypeNm() { return _columnCasecreatetypeNm; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * ARRIVALPORTDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalportdate() { return _columnArrivalportdate; }
    /**
     * SHIPNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipname() { return _columnShipname; }
    /**
     * INITNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitnum() { return _columnInitnum; }
    /**
     * MIXEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedflg() { return _columnMixedflg; }
    /**
     * LENDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLendflg() { return _columnLendflg; }
    /**
     * LOCGROUP: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocgroup() { return _columnLocgroup; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * SHIPDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipdate() { return _columnShipdate; }
    /**
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrentLocationCd() { return _columnCurrentLocationCd; }
    /**
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrentLocationSname() { return _columnCurrentLocationSname; }
    /**
     * ADDDATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdddatetime() { return _columnAdddatetime; }
    /**
     * TRACETYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracetype() { return _columnTracetype; }
    /**
     * OTHERCD1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd1() { return _columnOthercd1; }
    /**
     * EXAMSTS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamsts() { return _columnExamsts; }
    /**
     * CASEINNUMBOWL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinnumbowl() { return _columnCaseinnumbowl; }
    /**
     * SHIPNUMBOWL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipnumbowl() { return _columnShipnumbowl; }
    /**
     * SUPPLIERRCVNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * TOKUHANCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTokuhancd() { return _columnTokuhancd; }
    /**
     * TOKUHAN_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTokuhanNm() { return _columnTokuhanNm; }
    /**
     * MAKERCASENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakercaseno() { return _columnMakercaseno; }
    /**
     * CASEITFNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseitfno() { return _columnCaseitfno; }
    /**
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasebarcodevaliant() { return _columnCasebarcodevaliant; }
    /**
     * CASELOT4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaselot4() { return _columnCaselot4; }
    /**
     * CASECENTERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasecenterno() { return _columnCasecenterno; }
    /**
     * CASEPACKNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasepackno() { return _columnCasepackno; }
    /**
     * CASEPACKTIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasepacktime() { return _columnCasepacktime; }
    /**
     * SENDER_LOCATION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSenderLocation() { return _columnSenderLocation; }
    /**
     * RECEIVER_LOCATION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiverLocation() { return _columnReceiverLocation; }
    /**
     * SHIPMENT_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentId() { return _columnShipmentId; }
    /**
     * SHIPMENT_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentDate() { return _columnShipmentDate; }
    /**
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberOfPallets() { return _columnNumberOfPallets; }
    /**
     * CARRIERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * TKHNORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTkhnorderno() { return _columnTkhnorderno; }
    /**
     * SRCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrccd() { return _columnSrccd; }
    /**
     * BLNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlno() { return _columnBlno; }
    /**
     * INVOICENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceno() { return _columnInvoiceno; }
    /**
     * SSCC: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscc() { return _columnSscc; }
    /**
     * CASENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseno() { return _columnCaseno; }
    /**
     * INV_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvNum() { return _columnInvNum; }
    /**
     * SORT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortNum() { return _columnSortNum; }
    /**
     * ADOPT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdoptNum() { return _columnAdoptNum; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
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
        ls.add(columnTrackingInfoImportId());
        ls.add(columnSymbolposkey());
        ls.add(columnWarehousecd());
        ls.add(columnWarehouseSname());
        ls.add(columnFactorySname());
        ls.add(columnFactorycd());
        ls.add(columnItemcdCase());
        ls.add(columnItemSnameCase());
        ls.add(columnItemcdWh());
        ls.add(columnItemSnameWh());
        ls.add(columnRcvkey());
        ls.add(columnMachineno());
        ls.add(columnCreateno());
        ls.add(columnLimitdatenow());
        ls.add(columnDesigncdCase());
        ls.add(columnLot1());
        ls.add(columnManufacturecd());
        ls.add(columnOtherlot1());
        ls.add(columnCasecreatetype());
        ls.add(columnCasecreatetypeNm());
        ls.add(columnReceivedate());
        ls.add(columnArrivalportdate());
        ls.add(columnShipname());
        ls.add(columnInitnum());
        ls.add(columnMixedflg());
        ls.add(columnLendflg());
        ls.add(columnLocgroup());
        ls.add(columnLoccd());
        ls.add(columnShipdate());
        ls.add(columnCurrentLocationCd());
        ls.add(columnCurrentLocationSname());
        ls.add(columnAdddatetime());
        ls.add(columnTracetype());
        ls.add(columnOthercd1());
        ls.add(columnExamsts());
        ls.add(columnCaseinnumbowl());
        ls.add(columnShipnumbowl());
        ls.add(columnSupplierrcvno());
        ls.add(columnTokuhancd());
        ls.add(columnTokuhanNm());
        ls.add(columnMakercaseno());
        ls.add(columnCaseitfno());
        ls.add(columnCasebarcodevaliant());
        ls.add(columnCaselot4());
        ls.add(columnCasecenterno());
        ls.add(columnCasepackno());
        ls.add(columnCasepacktime());
        ls.add(columnSenderLocation());
        ls.add(columnReceiverLocation());
        ls.add(columnShipmentId());
        ls.add(columnShipmentDate());
        ls.add(columnNumberOfPallets());
        ls.add(columnCarrierno());
        ls.add(columnTkhnorderno());
        ls.add(columnSrccd());
        ls.add(columnBlno());
        ls.add(columnInvoiceno());
        ls.add(columnSscc());
        ls.add(columnCaseno());
        ls.add(columnInvNum());
        ls.add(columnSortNum());
        ls.add(columnAdoptNum());
        ls.add(columnSendCd());
        ls.add(columnSendFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrackingInfoImportId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETrackingInfoImport"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETrackingInfoImportCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETrackingInfoImportBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETrackingInfoImport> getEntityType() { return ETrackingInfoImport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETrackingInfoImport newEntity() { return new ETrackingInfoImport(); }
    public ETrackingInfoImport newMyEntity() { return new ETrackingInfoImport(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETrackingInfoImport)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETrackingInfoImport)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
