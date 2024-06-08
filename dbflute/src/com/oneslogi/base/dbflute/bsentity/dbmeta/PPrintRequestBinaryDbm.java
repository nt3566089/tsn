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
 * The DB meta of P_PRINT_REQUEST_BINARY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestBinaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PPrintRequestBinaryDbm _instance = new PPrintRequestBinaryDbm();
    private PPrintRequestBinaryDbm() {}
    public static PPrintRequestBinaryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getPrintRequestBinaryId(), (et, vl) -> ((PPrintRequestBinary)et).setPrintRequestBinaryId(ctl(vl)), "printRequestBinaryId");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getPrintRequestId(), (et, vl) -> ((PPrintRequestBinary)et).setPrintRequestId(ctl(vl)), "printRequestId");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getSrcFileIndex(), (et, vl) -> ((PPrintRequestBinary)et).setSrcFileIndex(ctl(vl)), "srcFileIndex");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getReportBinary(), (et, vl) -> ((PPrintRequestBinary)et).setReportBinary((byte[])vl), "reportBinary");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getPrintCustomRangeFlg(), (et, vl) -> ((PPrintRequestBinary)et).setPrintCustomRangeFlg((String)vl), "printCustomRangeFlg");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getPrintFirstPage(), (et, vl) -> ((PPrintRequestBinary)et).setPrintFirstPage(ctl(vl)), "printFirstPage");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getPrintLastPage(), (et, vl) -> ((PPrintRequestBinary)et).setPrintLastPage(ctl(vl)), "printLastPage");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getDelFlg(), (et, vl) -> ((PPrintRequestBinary)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getVersionNo(), (et, vl) -> ((PPrintRequestBinary)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getControlNo(), (et, vl) -> ((PPrintRequestBinary)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getAddDt(), (et, vl) -> ((PPrintRequestBinary)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getAddUser(), (et, vl) -> ((PPrintRequestBinary)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getAddProcess(), (et, vl) -> ((PPrintRequestBinary)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getUpdDt(), (et, vl) -> ((PPrintRequestBinary)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getUpdUser(), (et, vl) -> ((PPrintRequestBinary)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PPrintRequestBinary)et).getUpdProcess(), (et, vl) -> ((PPrintRequestBinary)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PPrintRequestBinary)et).getPPrintRequest(), (et, vl) -> ((PPrintRequestBinary)et).setPPrintRequest((PPrintRequest)vl), "PPrintRequest");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "P_PRINT_REQUEST_BINARY";
    protected final String _tableDispName = "P_PRINT_REQUEST_BINARY";
    protected final String _tablePropertyName = "PPrintRequestBinary";
    protected final TableSqlName _tableSqlName = new TableSqlName("P_PRINT_REQUEST_BINARY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrintRequestBinaryId = cci("PRINT_REQUEST_BINARY_ID", "PRINT_REQUEST_BINARY_ID", null, null, Long.class, "printRequestBinaryId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintRequestId = cci("PRINT_REQUEST_ID", "PRINT_REQUEST_ID", null, null, Long.class, "printRequestId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "PPrintRequest", null, null, false);
    protected final ColumnInfo _columnSrcFileIndex = cci("SRC_FILE_INDEX", "SRC_FILE_INDEX", null, null, Long.class, "srcFileIndex", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportBinary = cci("REPORT_BINARY", "REPORT_BINARY", null, null, byte[].class, "reportBinary", null, false, false, false, "varbinary", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintCustomRangeFlg = cci("PRINT_CUSTOM_RANGE_FLG", "PRINT_CUSTOM_RANGE_FLG", null, null, String.class, "printCustomRangeFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintFirstPage = cci("PRINT_FIRST_PAGE", "PRINT_FIRST_PAGE", null, null, Long.class, "printFirstPage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintLastPage = cci("PRINT_LAST_PAGE", "PRINT_LAST_PAGE", null, null, Long.class, "printLastPage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PRINT_REQUEST_BINARY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestBinaryId() { return _columnPrintRequestBinaryId; }
    /**
     * PRINT_REQUEST_ID: {UQ+, IX, NotNull, bigint(19), FK to P_PRINT_REQUEST}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintRequestId() { return _columnPrintRequestId; }
    /**
     * SRC_FILE_INDEX: {+UQ, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrcFileIndex() { return _columnSrcFileIndex; }
    /**
     * REPORT_BINARY: {varbinary(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportBinary() { return _columnReportBinary; }
    /**
     * PRINT_CUSTOM_RANGE_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintCustomRangeFlg() { return _columnPrintCustomRangeFlg; }
    /**
     * PRINT_FIRST_PAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintFirstPage() { return _columnPrintFirstPage; }
    /**
     * PRINT_LAST_PAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintLastPage() { return _columnPrintLastPage; }
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
        ls.add(columnPrintRequestBinaryId());
        ls.add(columnPrintRequestId());
        ls.add(columnSrcFileIndex());
        ls.add(columnReportBinary());
        ls.add(columnPrintCustomRangeFlg());
        ls.add(columnPrintFirstPage());
        ls.add(columnPrintLastPage());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrintRequestBinaryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPrintRequestId());
        ls.add(columnSrcFileIndex());
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
     * P_PRINT_REQUEST by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPPrintRequest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrintRequestId(), PPrintRequestDbm.getInstance().columnPrintRequestId());
        return cfi("P_PRINT_REQUEST_BINARY_FK1", "PPrintRequest", this, PPrintRequestDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "PPrintRequestBinaryList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PPrintRequestBinary"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PPrintRequestBinaryCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PPrintRequestBinaryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PPrintRequestBinary> getEntityType() { return PPrintRequestBinary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PPrintRequestBinary newEntity() { return new PPrintRequestBinary(); }
    public PPrintRequestBinary newMyEntity() { return new PPrintRequestBinary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PPrintRequestBinary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PPrintRequestBinary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
