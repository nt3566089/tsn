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
 * The DB meta of T_TRREFNOCTLDM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrefnoctldmDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrefnoctldmDbm _instance = new TTrrefnoctldmDbm();
    private TTrrefnoctldmDbm() {}
    public static TTrrefnoctldmDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getTrrefnoctldmId(), (et, vl) -> ((TTrrefnoctldm)et).setTrrefnoctldmId(ctl(vl)), "trrefnoctldmId");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getRefno(), (et, vl) -> ((TTrrefnoctldm)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getPlanrcvflg(), (et, vl) -> ((TTrrefnoctldm)et).setPlanrcvflg((String)vl), "planrcvflg");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getFtsrcvflg(), (et, vl) -> ((TTrrefnoctldm)et).setFtsrcvflg((String)vl), "ftsrcvflg");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getTrrcvaddflg(), (et, vl) -> ((TTrrefnoctldm)et).setTrrcvaddflg((String)vl), "trrcvaddflg");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getWarehousecd(), (et, vl) -> ((TTrrefnoctldm)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getCenterId(), (et, vl) -> ((TTrrefnoctldm)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getDelFlg(), (et, vl) -> ((TTrrefnoctldm)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getVersionNo(), (et, vl) -> ((TTrrefnoctldm)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getControlNo(), (et, vl) -> ((TTrrefnoctldm)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getAddDt(), (et, vl) -> ((TTrrefnoctldm)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getAddUser(), (et, vl) -> ((TTrrefnoctldm)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getAddProcess(), (et, vl) -> ((TTrrefnoctldm)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getUpdDt(), (et, vl) -> ((TTrrefnoctldm)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getUpdUser(), (et, vl) -> ((TTrrefnoctldm)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrefnoctldm)et).getUpdProcess(), (et, vl) -> ((TTrrefnoctldm)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRREFNOCTLDM";
    protected final String _tableDispName = "T_TRREFNOCTLDM";
    protected final String _tablePropertyName = "TTrrefnoctldm";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRREFNOCTLDM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrrefnoctldmId = cci("TRREFNOCTLDM_ID", "TRREFNOCTLDM_ID", null, null, Long.class, "trrefnoctldmId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanrcvflg = cci("PLANRCVFLG", "PLANRCVFLG", null, null, String.class, "planrcvflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFtsrcvflg = cci("FTSRCVFLG", "FTSRCVFLG", null, null, String.class, "ftsrcvflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrrcvaddflg = cci("TRRCVADDFLG", "TRRCVADDFLG", null, null, String.class, "trrcvaddflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrefnoctldmId() { return _columnTrrefnoctldmId; }
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
     * FTSRCVFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFtsrcvflg() { return _columnFtsrcvflg; }
    /**
     * TRRCVADDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrcvaddflg() { return _columnTrrcvaddflg; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
        ls.add(columnTrrefnoctldmId());
        ls.add(columnRefno());
        ls.add(columnPlanrcvflg());
        ls.add(columnFtsrcvflg());
        ls.add(columnTrrcvaddflg());
        ls.add(columnWarehousecd());
        ls.add(columnCenterId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrrefnoctldmId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrefnoctldm"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrefnoctldmCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrefnoctldmBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrefnoctldm> getEntityType() { return TTrrefnoctldm.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrefnoctldm newEntity() { return new TTrrefnoctldm(); }
    public TTrrefnoctldm newMyEntity() { return new TTrrefnoctldm(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrefnoctldm)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrefnoctldm)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
