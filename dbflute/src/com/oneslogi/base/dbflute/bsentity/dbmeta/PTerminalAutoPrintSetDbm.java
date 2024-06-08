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
 * The DB meta of P_TERMINAL_AUTO_PRINT_SET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PTerminalAutoPrintSetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PTerminalAutoPrintSetDbm _instance = new PTerminalAutoPrintSetDbm();
    private PTerminalAutoPrintSetDbm() {}
    public static PTerminalAutoPrintSetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getTerminalAutoPrintSetId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setTerminalAutoPrintSetId(ctl(vl)), "terminalAutoPrintSetId");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getTerminalAssignCd(), (et, vl) -> ((PTerminalAutoPrintSet)et).setTerminalAssignCd((String)vl), "terminalAssignCd");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getReportLayoutId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setReportLayoutId(ctl(vl)), "reportLayoutId");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getPrinterGroupId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPrinterGroupId(ctl(vl)), "printerGroupId");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getPrinterId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPrinterId(ctl(vl)), "printerId");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getPrinterAttributeId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPrinterAttributeId(ctl(vl)), "printerAttributeId");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getDelFlg(), (et, vl) -> ((PTerminalAutoPrintSet)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getVersionNo(), (et, vl) -> ((PTerminalAutoPrintSet)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getControlNo(), (et, vl) -> ((PTerminalAutoPrintSet)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getAddDt(), (et, vl) -> ((PTerminalAutoPrintSet)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getAddUser(), (et, vl) -> ((PTerminalAutoPrintSet)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getAddProcess(), (et, vl) -> ((PTerminalAutoPrintSet)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getUpdDt(), (et, vl) -> ((PTerminalAutoPrintSet)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getUpdUser(), (et, vl) -> ((PTerminalAutoPrintSet)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PTerminalAutoPrintSet)et).getUpdProcess(), (et, vl) -> ((PTerminalAutoPrintSet)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PTerminalAutoPrintSet)et).getPReportLayoutByReportLayoutId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPReportLayoutByReportLayoutId((PReportLayout)vl), "PReportLayoutByReportLayoutId");
        setupEfpg(_efpgMap, et -> ((PTerminalAutoPrintSet)et).getPPrinterGroupByPrinterGroupId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPPrinterGroupByPrinterGroupId((PPrinterGroup)vl), "PPrinterGroupByPrinterGroupId");
        setupEfpg(_efpgMap, et -> ((PTerminalAutoPrintSet)et).getPPrinterByPrinterId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPPrinterByPrinterId((PPrinter)vl), "PPrinterByPrinterId");
        setupEfpg(_efpgMap, et -> ((PTerminalAutoPrintSet)et).getPPrinterAttributeByPrinterAttributeId(), (et, vl) -> ((PTerminalAutoPrintSet)et).setPPrinterAttributeByPrinterAttributeId((PPrinterAttribute)vl), "PPrinterAttributeByPrinterAttributeId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_TERMINAL_AUTO_PRINT_SET";
    protected final String _tableDispName = "P_TERMINAL_AUTO_PRINT_SET";
    protected final String _tablePropertyName = "PTerminalAutoPrintSet";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_TERMINAL_AUTO_PRINT_SET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTerminalAutoPrintSetId = cci("TERMINAL_AUTO_PRINT_SET_ID", "TERMINAL_AUTO_PRINT_SET_ID", null, null, Long.class, "terminalAutoPrintSetId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTerminalAssignCd = cci("TERMINAL_ASSIGN_CD", "TERMINAL_ASSIGN_CD", null, null, String.class, "terminalAssignCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportLayoutId = cci("REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", null, null, Long.class, "reportLayoutId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PReportLayoutByReportLayoutId", null, null, false);
    protected final ColumnInfo _columnPrinterGroupId = cci("PRINTER_GROUP_ID", "PRINTER_GROUP_ID", null, null, Long.class, "printerGroupId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterGroupByPrinterGroupId", null, null, false);
    protected final ColumnInfo _columnPrinterId = cci("PRINTER_ID", "PRINTER_ID", null, null, Long.class, "printerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterByPrinterId", null, null, false);
    protected final ColumnInfo _columnPrinterAttributeId = cci("PRINTER_ATTRIBUTE_ID", "PRINTER_ATTRIBUTE_ID", null, null, Long.class, "printerAttributeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "PPrinterAttributeByPrinterAttributeId", null, null, false);
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
     * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTerminalAutoPrintSetId() { return _columnTerminalAutoPrintSetId; }
    /**
     * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTerminalAssignCd() { return _columnTerminalAssignCd; }
    /**
     * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutId() { return _columnReportLayoutId; }
    /**
     * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterGroupId() { return _columnPrinterGroupId; }
    /**
     * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterId() { return _columnPrinterId; }
    /**
     * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrinterAttributeId() { return _columnPrinterAttributeId; }
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
        ls.add(columnTerminalAutoPrintSetId());
        ls.add(columnTerminalAssignCd());
        ls.add(columnReportLayoutId());
        ls.add(columnPrinterGroupId());
        ls.add(columnPrinterId());
        ls.add(columnPrinterAttributeId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTerminalAutoPrintSetId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnTerminalAssignCd());
        ls.add(columnReportLayoutId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPReportLayoutByReportLayoutId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PReportLayoutDbm.getInstance().columnReportLayoutId());
        return cfi("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_REPORT_LAYOUT_BY_REPORT_LAYOUT_ID", "PReportLayoutByReportLayoutId", this, PReportLayoutDbm.getInstance(), mp, 0, null, false, false, false, true, null, null, false, "PTerminalAutoPrintSetByReportLayoutIdList", false);
    }
    /**
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterGroupByPrinterGroupId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterGroupId(), PPrinterGroupDbm.getInstance().columnPrinterGroupId());
        return cfi("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_PRINTER_GROUP_BY_P_PRINTER_GROUP_ID", "PPrinterGroupByPrinterGroupId", this, PPrinterGroupDbm.getInstance(), mp, 1, null, false, false, false, true, null, null, false, "PTerminalAutoPrintSetByPrinterGroupIdList", false);
    }
    /**
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterByPrinterId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterId(), PPrinterDbm.getInstance().columnPrinterId());
        return cfi("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_PRINTER_BY_P_PRINTER_ID", "PPrinterByPrinterId", this, PPrinterDbm.getInstance(), mp, 2, null, false, false, false, true, null, null, false, "PTerminalAutoPrintSetByPrinterIdList", false);
    }
    /**
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrinterAttributeByPrinterAttributeId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrinterAttributeId(), PPrinterAttributeDbm.getInstance().columnPrinterAttributeId());
        return cfi("FK_P_TERMINAL_AUTO_PRINT_SET_TO_P_PRINTER_ATTRIBUTE_BY_P_PRINTER_ATTRIBUTE_ID", "PPrinterAttributeByPrinterAttributeId", this, PPrinterAttributeDbm.getInstance(), mp, 3, null, false, false, false, true, null, null, false, "PTerminalAutoPrintSetByPrinterAttributeIdList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PTerminalAutoPrintSet"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PTerminalAutoPrintSetCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PTerminalAutoPrintSetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PTerminalAutoPrintSet> getEntityType() { return PTerminalAutoPrintSet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PTerminalAutoPrintSet newEntity() { return new PTerminalAutoPrintSet(); }
    public PTerminalAutoPrintSet newMyEntity() { return new PTerminalAutoPrintSet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PTerminalAutoPrintSet)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PTerminalAutoPrintSet)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
