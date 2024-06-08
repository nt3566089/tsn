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
 * The DB meta of T_TRREFNOCTL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrefnoctlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrefnoctlDbm _instance = new TTrrefnoctlDbm();
    private TTrrefnoctlDbm() {}
    public static TTrrefnoctlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getTrrefnoctlId(), (et, vl) -> ((TTrrefnoctl)et).setTrrefnoctlId(ctl(vl)), "trrefnoctlId");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getRefno(), (et, vl) -> ((TTrrefnoctl)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getPlanrcvflg(), (et, vl) -> ((TTrrefnoctl)et).setPlanrcvflg((String)vl), "planrcvflg");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getDtlrcvflg(), (et, vl) -> ((TTrrefnoctl)et).setDtlrcvflg((String)vl), "dtlrcvflg");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getTrrcvaddflg(), (et, vl) -> ((TTrrefnoctl)et).setTrrcvaddflg((String)vl), "trrcvaddflg");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getCenterCd(), (et, vl) -> ((TTrrefnoctl)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getDelFlg(), (et, vl) -> ((TTrrefnoctl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getVersionNo(), (et, vl) -> ((TTrrefnoctl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getControlNo(), (et, vl) -> ((TTrrefnoctl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getAddDt(), (et, vl) -> ((TTrrefnoctl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getAddUser(), (et, vl) -> ((TTrrefnoctl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getAddProcess(), (et, vl) -> ((TTrrefnoctl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getUpdDt(), (et, vl) -> ((TTrrefnoctl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getUpdUser(), (et, vl) -> ((TTrrefnoctl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrefnoctl)et).getUpdProcess(), (et, vl) -> ((TTrrefnoctl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRREFNOCTL";
    protected final String _tableDispName = "T_TRREFNOCTL";
    protected final String _tablePropertyName = "TTrrefnoctl";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRREFNOCTL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrrefnoctlId = cci("TRREFNOCTL_ID", "TRREFNOCTL_ID", null, null, Long.class, "trrefnoctlId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanrcvflg = cci("PLANRCVFLG", "PLANRCVFLG", null, null, String.class, "planrcvflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtlrcvflg = cci("DTLRCVFLG", "DTLRCVFLG", null, null, String.class, "dtlrcvflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrrcvaddflg = cci("TRRCVADDFLG", "TRRCVADDFLG", null, null, String.class, "trrcvaddflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TRREFNOCTL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrefnoctlId() { return _columnTrrefnoctlId; }
    /**
     * REFNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * PLANRCVFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanrcvflg() { return _columnPlanrcvflg; }
    /**
     * DTLRCVFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtlrcvflg() { return _columnDtlrcvflg; }
    /**
     * TRRCVADDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrcvaddflg() { return _columnTrrcvaddflg; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
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
        ls.add(columnTrrefnoctlId());
        ls.add(columnRefno());
        ls.add(columnPlanrcvflg());
        ls.add(columnDtlrcvflg());
        ls.add(columnTrrcvaddflg());
        ls.add(columnCenterCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrrefnoctlId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrefnoctl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrefnoctlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrefnoctlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrefnoctl> getEntityType() { return TTrrefnoctl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrefnoctl newEntity() { return new TTrrefnoctl(); }
    public TTrrefnoctl newMyEntity() { return new TTrrefnoctl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrefnoctl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrefnoctl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
