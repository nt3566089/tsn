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
 * The DB meta of T_MOVE_INST_B_SUB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstBSubDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TMoveInstBSubDbm _instance = new TMoveInstBSubDbm();
    private TMoveInstBSubDbm() {}
    public static TMoveInstBSubDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getTMoveInstBSubId(), (et, vl) -> ((TMoveInstBSub)et).setTMoveInstBSubId(ctl(vl)), "TMoveInstBSubId");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getTMoveInstBId(), (et, vl) -> ((TMoveInstBSub)et).setTMoveInstBId(ctl(vl)), "TMoveInstBId");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getTrpalletId(), (et, vl) -> ((TMoveInstBSub)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getTrsymbolId(), (et, vl) -> ((TMoveInstBSub)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getMoveInstStatus(), (et, vl) -> ((TMoveInstBSub)et).setMoveInstStatus((String)vl), "moveInstStatus");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getInstNum(), (et, vl) -> ((TMoveInstBSub)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getDelFlg(), (et, vl) -> ((TMoveInstBSub)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getVersionNo(), (et, vl) -> ((TMoveInstBSub)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getControlNo(), (et, vl) -> ((TMoveInstBSub)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getAddDt(), (et, vl) -> ((TMoveInstBSub)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getAddUser(), (et, vl) -> ((TMoveInstBSub)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getAddProcess(), (et, vl) -> ((TMoveInstBSub)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getUpdDt(), (et, vl) -> ((TMoveInstBSub)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getUpdUser(), (et, vl) -> ((TMoveInstBSub)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TMoveInstBSub)et).getUpdProcess(), (et, vl) -> ((TMoveInstBSub)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TMoveInstBSub)et).getTMoveInstB(), (et, vl) -> ((TMoveInstBSub)et).setTMoveInstB((TMoveInstB)vl), "TMoveInstB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_MOVE_INST_B_SUB";
    protected final String _tableDispName = "T_MOVE_INST_B_SUB";
    protected final String _tablePropertyName = "TMoveInstBSub";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_MOVE_INST_B_SUB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTMoveInstBSubId = cci("T_MOVE_INST_B_SUB_ID", "T_MOVE_INST_B_SUB_ID", null, null, Long.class, "TMoveInstBSubId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TMoveInstB", null, null, false);
    protected final ColumnInfo _columnTMoveInstBId = cci("T_MOVE_INST_B_ID", "T_MOVE_INST_B_ID", null, null, Long.class, "TMoveInstBId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveInstStatus = cci("MOVE_INST_STATUS", "MOVE_INST_STATUS", null, null, String.class, "moveInstStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * T_MOVE_INST_B_SUB_ID: {PK, ID, NotNull, bigint identity(19), FK to T_MOVE_INST_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTMoveInstBSubId() { return _columnTMoveInstBSubId; }
    /**
     * T_MOVE_INST_B_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTMoveInstBId() { return _columnTMoveInstBId; }
    /**
     * TRPALLET_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * TRSYMBOL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * MOVE_INST_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstStatus() { return _columnMoveInstStatus; }
    /**
     * INST_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
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
        ls.add(columnTMoveInstBSubId());
        ls.add(columnTMoveInstBId());
        ls.add(columnTrpalletId());
        ls.add(columnTrsymbolId());
        ls.add(columnMoveInstStatus());
        ls.add(columnInstNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnTMoveInstBSubId()); }
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
     * T_MOVE_INST_B by my T_MOVE_INST_B_SUB_ID, named 'TMoveInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTMoveInstBSubId(), TMoveInstBDbm.getInstance().columnMoveInstBId());
        return cfi("T_MOVE_INST_B_SUB_FK1", "TMoveInstB", this, TMoveInstBDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TMoveInstBSubAsOne", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TMoveInstBSub"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TMoveInstBSubCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TMoveInstBSubBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TMoveInstBSub> getEntityType() { return TMoveInstBSub.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TMoveInstBSub newEntity() { return new TMoveInstBSub(); }
    public TMoveInstBSub newMyEntity() { return new TMoveInstBSub(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TMoveInstBSub)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TMoveInstBSub)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
