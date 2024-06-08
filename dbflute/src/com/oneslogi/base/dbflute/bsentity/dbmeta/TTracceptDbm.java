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
 * The DB meta of T_TRACCEPT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTracceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTracceptDbm _instance = new TTracceptDbm();
    private TTracceptDbm() {}
    public static TTracceptDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTraccept)et).getTracceptId(), (et, vl) -> ((TTraccept)et).setTracceptId(ctl(vl)), "tracceptId");
        setupEpg(_epgMap, et -> ((TTraccept)et).getPrekey(), (et, vl) -> ((TTraccept)et).setPrekey(ctb(vl)), "prekey");
        setupEpg(_epgMap, et -> ((TTraccept)et).getAccepttype(), (et, vl) -> ((TTraccept)et).setAccepttype((String)vl), "accepttype");
        setupEpg(_epgMap, et -> ((TTraccept)et).getAcceptgroup(), (et, vl) -> ((TTraccept)et).setAcceptgroup((String)vl), "acceptgroup");
        setupEpg(_epgMap, et -> ((TTraccept)et).getNotes(), (et, vl) -> ((TTraccept)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTraccept)et).getLogisticscd(), (et, vl) -> ((TTraccept)et).setLogisticscd((String)vl), "logisticscd");
        setupEpg(_epgMap, et -> ((TTraccept)et).getWarehousecd(), (et, vl) -> ((TTraccept)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTraccept)et).getLoccd(), (et, vl) -> ((TTraccept)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((TTraccept)et).getInspectedusercd(), (et, vl) -> ((TTraccept)et).setInspectedusercd((String)vl), "inspectedusercd");
        setupEpg(_epgMap, et -> ((TTraccept)et).getCarriercd(), (et, vl) -> ((TTraccept)et).setCarriercd((String)vl), "carriercd");
        setupEpg(_epgMap, et -> ((TTraccept)et).getCarriername(), (et, vl) -> ((TTraccept)et).setCarriername((String)vl), "carriername");
        setupEpg(_epgMap, et -> ((TTraccept)et).getCarrierwbno(), (et, vl) -> ((TTraccept)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((TTraccept)et).getDeliverycd(), (et, vl) -> ((TTraccept)et).setDeliverycd((String)vl), "deliverycd");
        setupEpg(_epgMap, et -> ((TTraccept)et).getCarrierno(), (et, vl) -> ((TTraccept)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTraccept)et).getCarriersname(), (et, vl) -> ((TTraccept)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((TTraccept)et).getActualtime(), (et, vl) -> ((TTraccept)et).setActualtime(cttp(vl)), "actualtime");
        setupEpg(_epgMap, et -> ((TTraccept)et).getCompletetime(), (et, vl) -> ((TTraccept)et).setCompletetime(cttp(vl)), "completetime");
        setupEpg(_epgMap, et -> ((TTraccept)et).getAcceptlinetotal(), (et, vl) -> ((TTraccept)et).setAcceptlinetotal(ctb(vl)), "acceptlinetotal");
        setupEpg(_epgMap, et -> ((TTraccept)et).getTaglabelprintflg(), (et, vl) -> ((TTraccept)et).setTaglabelprintflg(ctb(vl)), "taglabelprintflg");
        setupEpg(_epgMap, et -> ((TTraccept)et).getReceivePlanHId(), (et, vl) -> ((TTraccept)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTraccept)et).getDelFlg(), (et, vl) -> ((TTraccept)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTraccept)et).getVersionNo(), (et, vl) -> ((TTraccept)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTraccept)et).getControlNo(), (et, vl) -> ((TTraccept)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTraccept)et).getAddDt(), (et, vl) -> ((TTraccept)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTraccept)et).getAddUser(), (et, vl) -> ((TTraccept)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTraccept)et).getAddProcess(), (et, vl) -> ((TTraccept)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTraccept)et).getUpdDt(), (et, vl) -> ((TTraccept)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTraccept)et).getUpdUser(), (et, vl) -> ((TTraccept)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTraccept)et).getUpdProcess(), (et, vl) -> ((TTraccept)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRACCEPT";
    protected final String _tableDispName = "T_TRACCEPT";
    protected final String _tablePropertyName = "TTraccept";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRACCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTracceptId = cci("TRACCEPT_ID", "TRACCEPT_ID", null, null, Long.class, "tracceptId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrekey = cci("PREKEY", "PREKEY", null, null, java.math.BigDecimal.class, "prekey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccepttype = cci("ACCEPTTYPE", "ACCEPTTYPE", null, null, String.class, "accepttype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptgroup = cci("ACCEPTGROUP", "ACCEPTGROUP", null, null, String.class, "acceptgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogisticscd = cci("LOGISTICSCD", "LOGISTICSCD", null, null, String.class, "logisticscd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedusercd = cci("INSPECTEDUSERCD", "INSPECTEDUSERCD", null, null, String.class, "inspectedusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriercd = cci("CARRIERCD", "CARRIERCD", null, null, String.class, "carriercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriername = cci("CARRIERNAME", "CARRIERNAME", null, null, String.class, "carriername", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverycd = cci("DELIVERYCD", "DELIVERYCD", null, null, String.class, "deliverycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActualtime = cci("ACTUALTIME", "ACTUALTIME", null, null, java.sql.Timestamp.class, "actualtime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompletetime = cci("COMPLETETIME", "COMPLETETIME", null, null, java.sql.Timestamp.class, "completetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptlinetotal = cci("ACCEPTLINETOTAL", "ACCEPTLINETOTAL", null, null, java.math.BigDecimal.class, "acceptlinetotal", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaglabelprintflg = cci("TAGLABELPRINTFLG", "TAGLABELPRINTFLG", null, null, java.math.BigDecimal.class, "taglabelprintflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracceptId() { return _columnTracceptId; }
    /**
     * PREKEY: {IX, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrekey() { return _columnPrekey; }
    /**
     * ACCEPTTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccepttype() { return _columnAccepttype; }
    /**
     * ACCEPTGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptgroup() { return _columnAcceptgroup; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogisticscd() { return _columnLogisticscd; }
    /**
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * INSPECTEDUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedusercd() { return _columnInspectedusercd; }
    /**
     * CARRIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriercd() { return _columnCarriercd; }
    /**
     * CARRIERNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriername() { return _columnCarriername; }
    /**
     * CARRIERWBNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * DELIVERYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverycd() { return _columnDeliverycd; }
    /**
     * CARRIERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * CARRIERSNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * ACTUALTIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActualtime() { return _columnActualtime; }
    /**
     * COMPLETETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompletetime() { return _columnCompletetime; }
    /**
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptlinetotal() { return _columnAcceptlinetotal; }
    /**
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaglabelprintflg() { return _columnTaglabelprintflg; }
    /**
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
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
        ls.add(columnTracceptId());
        ls.add(columnPrekey());
        ls.add(columnAccepttype());
        ls.add(columnAcceptgroup());
        ls.add(columnNotes());
        ls.add(columnLogisticscd());
        ls.add(columnWarehousecd());
        ls.add(columnLoccd());
        ls.add(columnInspectedusercd());
        ls.add(columnCarriercd());
        ls.add(columnCarriername());
        ls.add(columnCarrierwbno());
        ls.add(columnDeliverycd());
        ls.add(columnCarrierno());
        ls.add(columnCarriersname());
        ls.add(columnActualtime());
        ls.add(columnCompletetime());
        ls.add(columnAcceptlinetotal());
        ls.add(columnTaglabelprintflg());
        ls.add(columnReceivePlanHId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTracceptId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTraccept"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTracceptCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTracceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTraccept> getEntityType() { return TTraccept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTraccept newEntity() { return new TTraccept(); }
    public TTraccept newMyEntity() { return new TTraccept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTraccept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTraccept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
