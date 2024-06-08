package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlWorkloadInquiryList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlWorkloadInquiryListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlWorkloadInquiryListDbm _instance = new SqlWorkloadInquiryListDbm();
    private SqlWorkloadInquiryListDbm() {}
    public static SqlWorkloadInquiryListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getSequenceno(), (et, vl) -> ((SqlWorkloadInquiryList)et).setSequenceno(ctl(vl)), "sequenceno");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getWorkDt(), (et, vl) -> ((SqlWorkloadInquiryList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getUsercd(), (et, vl) -> ((SqlWorkloadInquiryList)et).setUsercd((String)vl), "usercd");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getUserNm(), (et, vl) -> ((SqlWorkloadInquiryList)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getTaskType(), (et, vl) -> ((SqlWorkloadInquiryList)et).setTaskType((String)vl), "taskType");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getTaskTypeDetail(), (et, vl) -> ((SqlWorkloadInquiryList)et).setTaskTypeDetail((String)vl), "taskTypeDetail");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getWorktime(), (et, vl) -> ((SqlWorkloadInquiryList)et).setWorktime((String)vl), "worktime");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getStartEnd(), (et, vl) -> ((SqlWorkloadInquiryList)et).setStartEnd((String)vl), "startEnd");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getWorkPalletQty(), (et, vl) -> ((SqlWorkloadInquiryList)et).setWorkPalletQty(ctl(vl)), "workPalletQty");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getWorkCaseQty(), (et, vl) -> ((SqlWorkloadInquiryList)et).setWorkCaseQty(ctl(vl)), "workCaseQty");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getWorkCartonQty(), (et, vl) -> ((SqlWorkloadInquiryList)et).setWorkCartonQty(ctl(vl)), "workCartonQty");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getWorkQty(), (et, vl) -> ((SqlWorkloadInquiryList)et).setWorkQty(ctl(vl)), "workQty");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getCenterCd(), (et, vl) -> ((SqlWorkloadInquiryList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getCenterNm(), (et, vl) -> ((SqlWorkloadInquiryList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getClientCd(), (et, vl) -> ((SqlWorkloadInquiryList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlWorkloadInquiryList)et).getClientNm(), (et, vl) -> ((SqlWorkloadInquiryList)et).setClientNm((String)vl), "clientNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlWorkloadInquiryList";
    protected final String _tableDispName = "SqlWorkloadInquiryList";
    protected final String _tablePropertyName = "sqlWorkloadInquiryList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlWorkloadInquiryList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSequenceno = cci("SEQUENCENO", "SEQUENCENO", null, null, Long.class, "sequenceno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "nvarchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsercd = cci("USERCD", "USERCD", null, null, String.class, "usercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaskType = cci("TASK_TYPE", "TASK_TYPE", null, null, String.class, "taskType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaskTypeDetail = cci("TASK_TYPE_DETAIL", "TASK_TYPE_DETAIL", null, null, String.class, "taskTypeDetail", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorktime = cci("WORKTIME", "WORKTIME", null, null, String.class, "worktime", null, false, false, false, "nvarchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartEnd = cci("START_END", "START_END", null, null, String.class, "startEnd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkPalletQty = cci("WORK_PALLET_QTY", "WORK_PALLET_QTY", null, null, Long.class, "workPalletQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCaseQty = cci("WORK_CASE_QTY", "WORK_CASE_QTY", null, null, Long.class, "workCaseQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCartonQty = cci("WORK_CARTON_QTY", "WORK_CARTON_QTY", null, null, Long.class, "workCartonQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkQty = cci("WORK_QTY", "WORK_QTY", null, null, Long.class, "workQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SEQUENCENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSequenceno() { return _columnSequenceno; }
    /**
     * WORK_DT: {nvarchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * USERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsercd() { return _columnUsercd; }
    /**
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * TASK_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaskType() { return _columnTaskType; }
    /**
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaskTypeDetail() { return _columnTaskTypeDetail; }
    /**
     * WORKTIME: {nvarchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorktime() { return _columnWorktime; }
    /**
     * START_END: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartEnd() { return _columnStartEnd; }
    /**
     * WORK_PALLET_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkPalletQty() { return _columnWorkPalletQty; }
    /**
     * WORK_CASE_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCaseQty() { return _columnWorkCaseQty; }
    /**
     * WORK_CARTON_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCartonQty() { return _columnWorkCartonQty; }
    /**
     * WORK_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkQty() { return _columnWorkQty; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSequenceno());
        ls.add(columnWorkDt());
        ls.add(columnUsercd());
        ls.add(columnUserNm());
        ls.add(columnTaskType());
        ls.add(columnTaskTypeDetail());
        ls.add(columnWorktime());
        ls.add(columnStartEnd());
        ls.add(columnWorkPalletQty());
        ls.add(columnWorkCaseQty());
        ls.add(columnWorkCartonQty());
        ls.add(columnWorkQty());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlWorkloadInquiryList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlWorkloadInquiryList> getEntityType() { return SqlWorkloadInquiryList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlWorkloadInquiryList newEntity() { return new SqlWorkloadInquiryList(); }
    public SqlWorkloadInquiryList newMyEntity() { return new SqlWorkloadInquiryList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlWorkloadInquiryList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlWorkloadInquiryList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
