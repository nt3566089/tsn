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
 * The DB meta of E_SYMBOL_PASTE_RECORD. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ESymbolPasteRecordDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ESymbolPasteRecordDbm _instance = new ESymbolPasteRecordDbm();
    private ESymbolPasteRecordDbm() {}
    public static ESymbolPasteRecordDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getESymbolPasteRecordId(), (et, vl) -> ((ESymbolPasteRecord)et).setESymbolPasteRecordId(ctl(vl)), "ESymbolPasteRecordId");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getReceiveCd(), (et, vl) -> ((ESymbolPasteRecord)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getReceiveRowId(), (et, vl) -> ((ESymbolPasteRecord)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getImportFlg(), (et, vl) -> ((ESymbolPasteRecord)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getErrorFlg(), (et, vl) -> ((ESymbolPasteRecord)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getErrorMessageCd(), (et, vl) -> ((ESymbolPasteRecord)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getRcvKey(), (et, vl) -> ((ESymbolPasteRecord)et).setRcvKey((String)vl), "rcvKey");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getProductCd(), (et, vl) -> ((ESymbolPasteRecord)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getFirmtransportNo(), (et, vl) -> ((ESymbolPasteRecord)et).setFirmtransportNo((String)vl), "firmtransportNo");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getManufacturDate(), (et, vl) -> ((ESymbolPasteRecord)et).setManufacturDate((String)vl), "manufacturDate");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getPrinterNo(), (et, vl) -> ((ESymbolPasteRecord)et).setPrinterNo((String)vl), "printerNo");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getMakeNo(), (et, vl) -> ((ESymbolPasteRecord)et).setMakeNo((String)vl), "makeNo");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getDesignCd(), (et, vl) -> ((ESymbolPasteRecord)et).setDesignCd((String)vl), "designCd");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getStockType(), (et, vl) -> ((ESymbolPasteRecord)et).setStockType((String)vl), "stockType");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getMakerCaseNo(), (et, vl) -> ((ESymbolPasteRecord)et).setMakerCaseNo((String)vl), "makerCaseNo");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getDelFlg(), (et, vl) -> ((ESymbolPasteRecord)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getVersionNo(), (et, vl) -> ((ESymbolPasteRecord)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getControlNo(), (et, vl) -> ((ESymbolPasteRecord)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getAddDt(), (et, vl) -> ((ESymbolPasteRecord)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getAddUser(), (et, vl) -> ((ESymbolPasteRecord)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getAddProcess(), (et, vl) -> ((ESymbolPasteRecord)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getUpdDt(), (et, vl) -> ((ESymbolPasteRecord)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getUpdUser(), (et, vl) -> ((ESymbolPasteRecord)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ESymbolPasteRecord)et).getUpdProcess(), (et, vl) -> ((ESymbolPasteRecord)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SYMBOL_PASTE_RECORD";
    protected final String _tableDispName = "E_SYMBOL_PASTE_RECORD";
    protected final String _tablePropertyName = "ESymbolPasteRecord";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SYMBOL_PASTE_RECORD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnESymbolPasteRecordId = cci("E_SYMBOL_PASTE_RECORD_ID", "E_SYMBOL_PASTE_RECORD_ID", null, null, Long.class, "ESymbolPasteRecordId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvKey = cci("RCV_KEY", "RCV_KEY", null, null, String.class, "rcvKey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmtransportNo = cci("FIRMTRANSPORT_NO", "FIRMTRANSPORT_NO", null, null, String.class, "firmtransportNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturDate = cci("MANUFACTUR_DATE", "MANUFACTUR_DATE", null, null, String.class, "manufacturDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterNo = cci("PRINTER_NO", "PRINTER_NO", null, null, String.class, "printerNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakeNo = cci("MAKE_NO", "MAKE_NO", null, null, String.class, "makeNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCd = cci("DESIGN_CD", "DESIGN_CD", null, null, String.class, "designCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockType = cci("STOCK_TYPE", "STOCK_TYPE", null, null, String.class, "stockType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakerCaseNo = cci("MAKER_CASE_NO", "MAKER_CASE_NO", null, null, String.class, "makerCaseNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnESymbolPasteRecordId() { return _columnESymbolPasteRecordId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * RCV_KEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvKey() { return _columnRcvKey; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmtransportNo() { return _columnFirmtransportNo; }
    /**
     * MANUFACTUR_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturDate() { return _columnManufacturDate; }
    /**
     * PRINTER_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterNo() { return _columnPrinterNo; }
    /**
     * MAKE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakeNo() { return _columnMakeNo; }
    /**
     * DESIGN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCd() { return _columnDesignCd; }
    /**
     * STOCK_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockType() { return _columnStockType; }
    /**
     * MAKER_CASE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakerCaseNo() { return _columnMakerCaseNo; }
    /**
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {bigint(19), default=[(0)]}
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
        ls.add(columnESymbolPasteRecordId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnRcvKey());
        ls.add(columnProductCd());
        ls.add(columnFirmtransportNo());
        ls.add(columnManufacturDate());
        ls.add(columnPrinterNo());
        ls.add(columnMakeNo());
        ls.add(columnDesignCd());
        ls.add(columnStockType());
        ls.add(columnMakerCaseNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnESymbolPasteRecordId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ESymbolPasteRecord"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ESymbolPasteRecordCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ESymbolPasteRecordBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ESymbolPasteRecord> getEntityType() { return ESymbolPasteRecord.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ESymbolPasteRecord newEntity() { return new ESymbolPasteRecord(); }
    public ESymbolPasteRecord newMyEntity() { return new ESymbolPasteRecord(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ESymbolPasteRecord)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ESymbolPasteRecord)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
