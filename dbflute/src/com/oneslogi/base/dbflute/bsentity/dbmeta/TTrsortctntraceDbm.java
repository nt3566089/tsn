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
 * The DB meta of T_TRSORTCTNTRACE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsortctntraceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsortctntraceDbm _instance = new TTrsortctntraceDbm();
    private TTrsortctntraceDbm() {}
    public static TTrsortctntraceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getSortPlaceCartonAssortLogManageId(), (et, vl) -> ((TTrsortctntrace)et).setSortPlaceCartonAssortLogManageId(ctl(vl)), "sortPlaceCartonAssortLogManageId");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getSeqno(), (et, vl) -> ((TTrsortctntrace)et).setSeqno(ctl(vl)), "seqno");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getCenterSymbolId(), (et, vl) -> ((TTrsortctntrace)et).setCenterSymbolId(ctl(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getFromCenterSymbolId(), (et, vl) -> ((TTrsortctntrace)et).setFromCenterSymbolId(ctl(vl)), "fromCenterSymbolId");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getMoveqtybowl(), (et, vl) -> ((TTrsortctntrace)et).setMoveqtybowl(ctl(vl)), "moveqtybowl");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getSortedqtybowl(), (et, vl) -> ((TTrsortctntrace)et).setSortedqtybowl(ctl(vl)), "sortedqtybowl");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getCenterId(), (et, vl) -> ((TTrsortctntrace)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getClientId(), (et, vl) -> ((TTrsortctntrace)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getDelFlg(), (et, vl) -> ((TTrsortctntrace)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getVersionNo(), (et, vl) -> ((TTrsortctntrace)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getControlNo(), (et, vl) -> ((TTrsortctntrace)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getAddDt(), (et, vl) -> ((TTrsortctntrace)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getAddUser(), (et, vl) -> ((TTrsortctntrace)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getAddProcess(), (et, vl) -> ((TTrsortctntrace)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getUpdDt(), (et, vl) -> ((TTrsortctntrace)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getUpdUser(), (et, vl) -> ((TTrsortctntrace)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsortctntrace)et).getUpdProcess(), (et, vl) -> ((TTrsortctntrace)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSORTCTNTRACE";
    protected final String _tableDispName = "T_TRSORTCTNTRACE";
    protected final String _tablePropertyName = "TTrsortctntrace";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSORTCTNTRACE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSortPlaceCartonAssortLogManageId = cci("SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID", "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID", null, null, Long.class, "sortPlaceCartonAssortLogManageId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, Long.class, "seqno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, Long.class, "centerSymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromCenterSymbolId = cci("FROM_CENTER_SYMBOL_ID", "FROM_CENTER_SYMBOL_ID", null, null, Long.class, "fromCenterSymbolId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveqtybowl = cci("MOVEQTYBOWL", "MOVEQTYBOWL", null, null, Long.class, "moveqtybowl", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqtybowl = cci("SORTEDQTYBOWL", "SORTEDQTYBOWL", null, null, Long.class, "sortedqtybowl", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortPlaceCartonAssortLogManageId() { return _columnSortPlaceCartonAssortLogManageId; }
    /**
     * SEQNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterSymbolId() { return _columnCenterSymbolId; }
    /**
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromCenterSymbolId() { return _columnFromCenterSymbolId; }
    /**
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveqtybowl() { return _columnMoveqtybowl; }
    /**
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqtybowl() { return _columnSortedqtybowl; }
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
        ls.add(columnSortPlaceCartonAssortLogManageId());
        ls.add(columnSeqno());
        ls.add(columnCenterSymbolId());
        ls.add(columnFromCenterSymbolId());
        ls.add(columnMoveqtybowl());
        ls.add(columnSortedqtybowl());
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
    protected UniqueInfo cpui() { return hpcpui(columnSortPlaceCartonAssortLogManageId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsortctntrace"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsortctntraceCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsortctntraceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsortctntrace> getEntityType() { return TTrsortctntrace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsortctntrace newEntity() { return new TTrsortctntrace(); }
    public TTrsortctntrace newMyEntity() { return new TTrsortctntrace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsortctntrace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsortctntrace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
