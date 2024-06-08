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
 * The DB meta of P_PRINT_REQUEST_DATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrintRequestDataDbm _instance = new PPrintRequestDataDbm();
    private PPrintRequestDataDbm() {}
    public static PPrintRequestDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getPrintRequestId(), (et, vl) -> ((PPrintRequestData)et).setPrintRequestId(ctl(vl)), "printRequestId");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getReportLayoutData(), (et, vl) -> ((PPrintRequestData)et).setReportLayoutData((String)vl), "reportLayoutData");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getSubrepLayoutData(), (et, vl) -> ((PPrintRequestData)et).setSubrepLayoutData((String)vl), "subrepLayoutData");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getReportLayoutBinary(), (et, vl) -> ((PPrintRequestData)et).setReportLayoutBinary((byte[])vl), "reportLayoutBinary");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getSubrepLayoutBinary(), (et, vl) -> ((PPrintRequestData)et).setSubrepLayoutBinary((byte[])vl), "subrepLayoutBinary");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getDataForReport(), (et, vl) -> ((PPrintRequestData)et).setDataForReport((String)vl), "dataForReport");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getCultureCd(), (et, vl) -> ((PPrintRequestData)et).setCultureCd((String)vl), "cultureCd");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getTimeZoneCd(), (et, vl) -> ((PPrintRequestData)et).setTimeZoneCd((String)vl), "timeZoneCd");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getDateTimeFormat(), (et, vl) -> ((PPrintRequestData)et).setDateTimeFormat((String)vl), "dateTimeFormat");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getDateFormat(), (et, vl) -> ((PPrintRequestData)et).setDateFormat((String)vl), "dateFormat");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getTimeFormat(), (et, vl) -> ((PPrintRequestData)et).setTimeFormat((String)vl), "timeFormat");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getNumberFormat(), (et, vl) -> ((PPrintRequestData)et).setNumberFormat((String)vl), "numberFormat");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getCurrencyFormat(), (et, vl) -> ((PPrintRequestData)et).setCurrencyFormat((String)vl), "currencyFormat");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getDelFlg(), (et, vl) -> ((PPrintRequestData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getVersionNo(), (et, vl) -> ((PPrintRequestData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getControlNo(), (et, vl) -> ((PPrintRequestData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getAddDt(), (et, vl) -> ((PPrintRequestData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getAddUser(), (et, vl) -> ((PPrintRequestData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getAddProcess(), (et, vl) -> ((PPrintRequestData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getUpdDt(), (et, vl) -> ((PPrintRequestData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getUpdUser(), (et, vl) -> ((PPrintRequestData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrintRequestData)et).getUpdProcess(), (et, vl) -> ((PPrintRequestData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrintRequestData)et).getPPrintRequest(), (et, vl) -> ((PPrintRequestData)et).setPPrintRequest((PPrintRequest)vl), "PPrintRequest");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINT_REQUEST_DATA";
    protected final String _tableDispName = "P_PRINT_REQUEST_DATA";
    protected final String _tablePropertyName = "PPrintRequestData";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINT_REQUEST_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintRequestId = cci("PRINT_REQUEST_ID", "PRINT_REQUEST_ID", null, null, Long.class, "printRequestId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "PPrintRequest", null, null, false);
    protected final ColumnInfo _columnReportLayoutData = cci("REPORT_LAYOUT_DATA", "REPORT_LAYOUT_DATA", null, null, String.class, "reportLayoutData", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubrepLayoutData = cci("SUBREP_LAYOUT_DATA", "SUBREP_LAYOUT_DATA", null, null, String.class, "subrepLayoutData", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutBinary = cci("REPORT_LAYOUT_BINARY", "REPORT_LAYOUT_BINARY", null, null, byte[].class, "reportLayoutBinary", null, false, false, false, "varbinary", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubrepLayoutBinary = cci("SUBREP_LAYOUT_BINARY", "SUBREP_LAYOUT_BINARY", null, null, byte[].class, "subrepLayoutBinary", null, false, false, false, "varbinary", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataForReport = cci("DATA_FOR_REPORT", "DATA_FOR_REPORT", null, null, String.class, "dataForReport", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCultureCd = cci("CULTURE_CD", "CULTURE_CD", null, null, String.class, "cultureCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeZoneCd = cci("TIME_ZONE_CD", "TIME_ZONE_CD", null, null, String.class, "timeZoneCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateTimeFormat = cci("DATE_TIME_FORMAT", "DATE_TIME_FORMAT", null, null, String.class, "dateTimeFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateFormat = cci("DATE_FORMAT", "DATE_FORMAT", null, null, String.class, "dateFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimeFormat = cci("TIME_FORMAT", "TIME_FORMAT", null, null, String.class, "timeFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberFormat = cci("NUMBER_FORMAT", "NUMBER_FORMAT", null, null, String.class, "numberFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurrencyFormat = cci("CURRENCY_FORMAT", "CURRENCY_FORMAT", null, null, String.class, "currencyFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINT_REQUEST_ID: {PK, ID, NotNull, bigint identity(19), FK to P_PRINT_REQUEST}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestId() { return _columnPrintRequestId; }
    /**
     * REPORT_LAYOUT_DATA: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutData() { return _columnReportLayoutData; }
    /**
     * SUBREP_LAYOUT_DATA: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubrepLayoutData() { return _columnSubrepLayoutData; }
    /**
     * REPORT_LAYOUT_BINARY: {varbinary(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutBinary() { return _columnReportLayoutBinary; }
    /**
     * SUBREP_LAYOUT_BINARY: {varbinary(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubrepLayoutBinary() { return _columnSubrepLayoutBinary; }
    /**
     * DATA_FOR_REPORT: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataForReport() { return _columnDataForReport; }
    /**
     * CULTURE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureCd() { return _columnCultureCd; }
    /**
     * TIME_ZONE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeZoneCd() { return _columnTimeZoneCd; }
    /**
     * DATE_TIME_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateTimeFormat() { return _columnDateTimeFormat; }
    /**
     * DATE_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateFormat() { return _columnDateFormat; }
    /**
     * TIME_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeFormat() { return _columnTimeFormat; }
    /**
     * NUMBER_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberFormat() { return _columnNumberFormat; }
    /**
     * CURRENCY_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurrencyFormat() { return _columnCurrencyFormat; }
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
        ls.add(columnPrintRequestId());
        ls.add(columnReportLayoutData());
        ls.add(columnSubrepLayoutData());
        ls.add(columnReportLayoutBinary());
        ls.add(columnSubrepLayoutBinary());
        ls.add(columnDataForReport());
        ls.add(columnCultureCd());
        ls.add(columnTimeZoneCd());
        ls.add(columnDateTimeFormat());
        ls.add(columnDateFormat());
        ls.add(columnTimeFormat());
        ls.add(columnNumberFormat());
        ls.add(columnCurrencyFormat());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrintRequestId()); }
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
    /**
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrintRequest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestDbm.getInstance().columnPrintRequestId());
        return cfi("P_PRINT_REQUEST_DATA_FK1", "PPrintRequest", this, PPrintRequestDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "PPrintRequestDataAsOne", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrintRequestData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrintRequestDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrintRequestDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrintRequestData> getEntityType() { return PPrintRequestData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrintRequestData newEntity() { return new PPrintRequestData(); }
    public PPrintRequestData newMyEntity() { return new PPrintRequestData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrintRequestData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrintRequestData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
