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
 * The DB meta of P_LS_REPORT_PRINTER_BY_SITE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PLsReportPrinterBySiteDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PLsReportPrinterBySiteDbm _instance = new PLsReportPrinterBySiteDbm();
    private PLsReportPrinterBySiteDbm() {}
    public static PLsReportPrinterBySiteDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getWarehouseCd(), (et, vl) -> ((PLsReportPrinterBySite)et).setWarehouseCd(ctl(vl)), "warehouseCd");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getReportFormName(), (et, vl) -> ((PLsReportPrinterBySite)et).setReportFormName((String)vl), "reportFormName");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getPrinterGroup(), (et, vl) -> ((PLsReportPrinterBySite)et).setPrinterGroup((String)vl), "printerGroup");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getLineNo(), (et, vl) -> ((PLsReportPrinterBySite)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getReportServerName(), (et, vl) -> ((PLsReportPrinterBySite)et).setReportServerName((String)vl), "reportServerName");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getReportPrinterName(), (et, vl) -> ((PLsReportPrinterBySite)et).setReportPrinterName((String)vl), "reportPrinterName");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getFloor(), (et, vl) -> ((PLsReportPrinterBySite)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getAutoFlg(), (et, vl) -> ((PLsReportPrinterBySite)et).setAutoFlg((String)vl), "autoFlg");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getTerminalCd(), (et, vl) -> ((PLsReportPrinterBySite)et).setTerminalCd((String)vl), "terminalCd");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getPriterNo(), (et, vl) -> ((PLsReportPrinterBySite)et).setPriterNo((String)vl), "priterNo");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getDelFlg(), (et, vl) -> ((PLsReportPrinterBySite)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getVersionNo(), (et, vl) -> ((PLsReportPrinterBySite)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getControlNo(), (et, vl) -> ((PLsReportPrinterBySite)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getAddDt(), (et, vl) -> ((PLsReportPrinterBySite)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getAddUser(), (et, vl) -> ((PLsReportPrinterBySite)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getAddProcess(), (et, vl) -> ((PLsReportPrinterBySite)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getUpdDt(), (et, vl) -> ((PLsReportPrinterBySite)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getUpdUser(), (et, vl) -> ((PLsReportPrinterBySite)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PLsReportPrinterBySite)et).getUpdProcess(), (et, vl) -> ((PLsReportPrinterBySite)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_LS_REPORT_PRINTER_BY_SITE";
    protected final String _tableDispName = "P_LS_REPORT_PRINTER_BY_SITE";
    protected final String _tablePropertyName = "PLsReportPrinterBySite";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_LS_REPORT_PRINTER_BY_SITE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, Long.class, "warehouseCd", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportFormName = cci("REPORT_FORM_NAME", "REPORT_FORM_NAME", null, null, String.class, "reportFormName", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrinterGroup = cci("PRINTER_GROUP", "PRINTER_GROUP", null, null, String.class, "printerGroup", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportServerName = cci("REPORT_SERVER_NAME", "REPORT_SERVER_NAME", null, null, String.class, "reportServerName", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportPrinterName = cci("REPORT_PRINTER_NAME", "REPORT_PRINTER_NAME", null, null, String.class, "reportPrinterName", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAutoFlg = cci("AUTO_FLG", "AUTO_FLG", null, null, String.class, "autoFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTerminalCd = cci("TERMINAL_CD", "TERMINAL_CD", null, null, String.class, "terminalCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriterNo = cci("PRITER_NO", "PRITER_NO", null, null, String.class, "priterNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * WAREHOUSE_CD: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * REPORT_FORM_NAME: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportFormName() { return _columnReportFormName; }
    /**
     * PRINTER_GROUP: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroup() { return _columnPrinterGroup; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * REPORT_SERVER_NAME: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportServerName() { return _columnReportServerName; }
    /**
     * REPORT_PRINTER_NAME: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportPrinterName() { return _columnReportPrinterName; }
    /**
     * FLOOR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * AUTO_FLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAutoFlg() { return _columnAutoFlg; }
    /**
     * TERMINAL_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTerminalCd() { return _columnTerminalCd; }
    /**
     * PRITER_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriterNo() { return _columnPriterNo; }
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
        ls.add(columnWarehouseCd());
        ls.add(columnReportFormName());
        ls.add(columnPrinterGroup());
        ls.add(columnLineNo());
        ls.add(columnReportServerName());
        ls.add(columnReportPrinterName());
        ls.add(columnFloor());
        ls.add(columnAutoFlg());
        ls.add(columnTerminalCd());
        ls.add(columnPriterNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnWarehouseCd()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PLsReportPrinterBySite"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PLsReportPrinterBySiteCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PLsReportPrinterBySiteBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PLsReportPrinterBySite> getEntityType() { return PLsReportPrinterBySite.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PLsReportPrinterBySite newEntity() { return new PLsReportPrinterBySite(); }
    public PLsReportPrinterBySite newMyEntity() { return new PLsReportPrinterBySite(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PLsReportPrinterBySite)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PLsReportPrinterBySite)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
