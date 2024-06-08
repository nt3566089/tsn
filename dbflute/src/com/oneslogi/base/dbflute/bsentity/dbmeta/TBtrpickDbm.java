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
 * The DB meta of T_BTRPICK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBtrpickDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBtrpickDbm _instance = new TBtrpickDbm();
    private TBtrpickDbm() {}
    public static TBtrpickDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickingInstId(), (et, vl) -> ((TBtrpick)et).setPickingInstId(ctl(vl)), "pickingInstId");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickbatchkey(), (et, vl) -> ((TBtrpick)et).setPickbatchkey(ctl(vl)), "pickbatchkey");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickbatchtype(), (et, vl) -> ((TBtrpick)et).setPickbatchtype((String)vl), "pickbatchtype");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickbatchgroup(), (et, vl) -> ((TBtrpick)et).setPickbatchgroup((String)vl), "pickbatchgroup");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickdate(), (et, vl) -> ((TBtrpick)et).setPickdate(cttp(vl)), "pickdate");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickstartdate(), (et, vl) -> ((TBtrpick)et).setPickstartdate(cttp(vl)), "pickstartdate");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getNotes(), (et, vl) -> ((TBtrpick)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getShipdate(), (et, vl) -> ((TBtrpick)et).setShipdate((String)vl), "shipdate");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getDelivschdate(), (et, vl) -> ((TBtrpick)et).setDelivschdate(cttp(vl)), "delivschdate");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getAllocgroup(), (et, vl) -> ((TBtrpick)et).setAllocgroup((String)vl), "allocgroup");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getSoid(), (et, vl) -> ((TBtrpick)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPicklinetotal(), (et, vl) -> ((TBtrpick)et).setPicklinetotal(ctl(vl)), "picklinetotal");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getPickingway(), (et, vl) -> ((TBtrpick)et).setPickingway(ctl(vl)), "pickingway");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getExeckey(), (et, vl) -> ((TBtrpick)et).setExeckey(ctl(vl)), "execkey");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getCenterId(), (et, vl) -> ((TBtrpick)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getClientId(), (et, vl) -> ((TBtrpick)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getDelFlg(), (et, vl) -> ((TBtrpick)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getVersionNo(), (et, vl) -> ((TBtrpick)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getControlNo(), (et, vl) -> ((TBtrpick)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getAddDt(), (et, vl) -> ((TBtrpick)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getAddUser(), (et, vl) -> ((TBtrpick)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getAddProcess(), (et, vl) -> ((TBtrpick)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getUpdDt(), (et, vl) -> ((TBtrpick)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getUpdUser(), (et, vl) -> ((TBtrpick)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBtrpick)et).getUpdProcess(), (et, vl) -> ((TBtrpick)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_BTRPICK";
    protected final String _tableDispName = "T_BTRPICK";
    protected final String _tablePropertyName = "TBtrpick";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_BTRPICK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingInstId = cci("PICKING_INST_ID", "PICKING_INST_ID", null, null, Long.class, "pickingInstId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickbatchkey = cci("PICKBATCHKEY", "PICKBATCHKEY", null, null, Long.class, "pickbatchkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickbatchtype = cci("PICKBATCHTYPE", "PICKBATCHTYPE", null, null, String.class, "pickbatchtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickbatchgroup = cci("PICKBATCHGROUP", "PICKBATCHGROUP", null, null, String.class, "pickbatchgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickdate = cci("PICKDATE", "PICKDATE", null, null, java.sql.Timestamp.class, "pickdate", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickstartdate = cci("PICKSTARTDATE", "PICKSTARTDATE", null, null, java.sql.Timestamp.class, "pickstartdate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipdate = cci("SHIPDATE", "SHIPDATE", null, null, String.class, "shipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivschdate = cci("DELIVSCHDATE", "DELIVSCHDATE", null, null, java.sql.Timestamp.class, "delivschdate", null, false, false, false, "datetime2", 26, 6, null, "sysdatetime()", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocgroup = cci("ALLOCGROUP", "ALLOCGROUP", null, null, String.class, "allocgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklinetotal = cci("PICKLINETOTAL", "PICKLINETOTAL", null, null, Long.class, "picklinetotal", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingway = cci("PICKINGWAY", "PICKINGWAY", null, null, Long.class, "pickingway", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExeckey = cci("EXECKEY", "EXECKEY", null, null, Long.class, "execkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstId() { return _columnPickingInstId; }
    /**
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickbatchkey() { return _columnPickbatchkey; }
    /**
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickbatchtype() { return _columnPickbatchtype; }
    /**
     * PICKBATCHGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickbatchgroup() { return _columnPickbatchgroup; }
    /**
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickdate() { return _columnPickdate; }
    /**
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickstartdate() { return _columnPickstartdate; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * SHIPDATE: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipdate() { return _columnShipdate; }
    /**
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivschdate() { return _columnDelivschdate; }
    /**
     * ALLOCGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocgroup() { return _columnAllocgroup; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklinetotal() { return _columnPicklinetotal; }
    /**
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingway() { return _columnPickingway; }
    /**
     * EXECKEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExeckey() { return _columnExeckey; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnPickingInstId());
        ls.add(columnPickbatchkey());
        ls.add(columnPickbatchtype());
        ls.add(columnPickbatchgroup());
        ls.add(columnPickdate());
        ls.add(columnPickstartdate());
        ls.add(columnNotes());
        ls.add(columnShipdate());
        ls.add(columnDelivschdate());
        ls.add(columnAllocgroup());
        ls.add(columnSoid());
        ls.add(columnPicklinetotal());
        ls.add(columnPickingway());
        ls.add(columnExeckey());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingInstId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBtrpick"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBtrpickCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBtrpickBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBtrpick> getEntityType() { return TBtrpick.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBtrpick newEntity() { return new TBtrpick(); }
    public TBtrpick newMyEntity() { return new TBtrpick(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBtrpick)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBtrpick)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
