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
 * The DB meta of T_WORK_DATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TWorkDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TWorkDataDbm _instance = new TWorkDataDbm();
    private TWorkDataDbm() {}
    public static TWorkDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TWorkData)et).getWorkDataId(), (et, vl) -> ((TWorkData)et).setWorkDataId(ctl(vl)), "workDataId");
        setupEpg(_epgMap, et -> ((TWorkData)et).getUserCd(), (et, vl) -> ((TWorkData)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((TWorkData)et).getWorkCd(), (et, vl) -> ((TWorkData)et).setWorkCd((String)vl), "workCd");
        setupEpg(_epgMap, et -> ((TWorkData)et).getWorkQty(), (et, vl) -> ((TWorkData)et).setWorkQty(ctb(vl)), "workQty");
        setupEpg(_epgMap, et -> ((TWorkData)et).getMacAddress(), (et, vl) -> ((TWorkData)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((TWorkData)et).getClientCd(), (et, vl) -> ((TWorkData)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((TWorkData)et).getCenterCd(), (et, vl) -> ((TWorkData)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TWorkData)et).getWorkLogId(), (et, vl) -> ((TWorkData)et).setWorkLogId(ctl(vl)), "workLogId");
        setupEpg(_epgMap, et -> ((TWorkData)et).getDelFlg(), (et, vl) -> ((TWorkData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TWorkData)et).getVersionNo(), (et, vl) -> ((TWorkData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TWorkData)et).getControlNo(), (et, vl) -> ((TWorkData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TWorkData)et).getAddDt(), (et, vl) -> ((TWorkData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TWorkData)et).getAddUser(), (et, vl) -> ((TWorkData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TWorkData)et).getAddProcess(), (et, vl) -> ((TWorkData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TWorkData)et).getUpdDt(), (et, vl) -> ((TWorkData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TWorkData)et).getUpdUser(), (et, vl) -> ((TWorkData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TWorkData)et).getUpdProcess(), (et, vl) -> ((TWorkData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TWorkData)et).getTWorkLog(), (et, vl) -> ((TWorkData)et).setTWorkLog((TWorkLog)vl), "TWorkLog");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_WORK_DATA";
    protected final String _tableDispName = "T_WORK_DATA";
    protected final String _tablePropertyName = "TWorkData";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_WORK_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWorkDataId = cci("WORK_DATA_ID", "WORK_DATA_ID", null, null, Long.class, "workDataId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCd = cci("WORK_CD", "WORK_CD", null, null, String.class, "workCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkQty = cci("WORK_QTY", "WORK_QTY", null, null, java.math.BigDecimal.class, "workQty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkLogId = cci("WORK_LOG_ID", "WORK_LOG_ID", null, null, Long.class, "workLogId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TWorkLog", null, null, false);
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
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDataId() { return _columnWorkDataId; }
    /**
     * USER_CD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * WORK_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCd() { return _columnWorkCd; }
    /**
     * WORK_QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkQty() { return _columnWorkQty; }
    /**
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkLogId() { return _columnWorkLogId; }
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
        ls.add(columnWorkDataId());
        ls.add(columnUserCd());
        ls.add(columnWorkCd());
        ls.add(columnWorkQty());
        ls.add(columnMacAddress());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnWorkLogId());
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
    protected UniqueInfo cpui() { return hpcpui(columnWorkDataId()); }
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
     * T_WORK_LOG by my WORK_LOG_ID, named 'TWorkLog'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTWorkLog() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWorkLogId(), TWorkLogDbm.getInstance().columnWorkLogId());
        return cfi("T_WORK_DATA_FK1", "TWorkLog", this, TWorkLogDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TWorkDataList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TWorkData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TWorkDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TWorkDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TWorkData> getEntityType() { return TWorkData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TWorkData newEntity() { return new TWorkData(); }
    public TWorkData newMyEntity() { return new TWorkData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TWorkData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TWorkData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
