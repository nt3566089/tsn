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
 * The DB meta of T_TRTEMPALLOCATESEQ. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrtempallocateseqDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrtempallocateseqDbm _instance = new TTrtempallocateseqDbm();
    private TTrtempallocateseqDbm() {}
    public static TTrtempallocateseqDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getTemporaryAllocId(), (et, vl) -> ((TTrtempallocateseq)et).setTemporaryAllocId(ctl(vl)), "temporaryAllocId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getPickingInstId(), (et, vl) -> ((TTrtempallocateseq)et).setPickingInstId(ctl(vl)), "pickingInstId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getAllocateseq(), (et, vl) -> ((TTrtempallocateseq)et).setAllocateseq(ctl(vl)), "allocateseq");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getLotId(), (et, vl) -> ((TTrtempallocateseq)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getLocationId(), (et, vl) -> ((TTrtempallocateseq)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getListkbn(), (et, vl) -> ((TTrtempallocateseq)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getTemppickedqty1(), (et, vl) -> ((TTrtempallocateseq)et).setTemppickedqty1(ctl(vl)), "temppickedqty1");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getCenterId(), (et, vl) -> ((TTrtempallocateseq)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getClientId(), (et, vl) -> ((TTrtempallocateseq)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getDelFlg(), (et, vl) -> ((TTrtempallocateseq)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getVersionNo(), (et, vl) -> ((TTrtempallocateseq)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getControlNo(), (et, vl) -> ((TTrtempallocateseq)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getAddDt(), (et, vl) -> ((TTrtempallocateseq)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getAddUser(), (et, vl) -> ((TTrtempallocateseq)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getAddProcess(), (et, vl) -> ((TTrtempallocateseq)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getUpdDt(), (et, vl) -> ((TTrtempallocateseq)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getUpdUser(), (et, vl) -> ((TTrtempallocateseq)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrtempallocateseq)et).getUpdProcess(), (et, vl) -> ((TTrtempallocateseq)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRTEMPALLOCATESEQ";
    protected final String _tableDispName = "T_TRTEMPALLOCATESEQ";
    protected final String _tablePropertyName = "TTrtempallocateseq";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRTEMPALLOCATESEQ", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTemporaryAllocId = cci("TEMPORARY_ALLOC_ID", "TEMPORARY_ALLOC_ID", null, null, Long.class, "temporaryAllocId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrtempallocateseqdetailList", null, false);
    protected final ColumnInfo _columnPickingInstId = cci("PICKING_INST_ID", "PICKING_INST_ID", null, null, Long.class, "pickingInstId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocateseq = cci("ALLOCATESEQ", "ALLOCATESEQ", null, null, Long.class, "allocateseq", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemppickedqty1 = cci("TEMPPICKEDQTY1", "TEMPPICKEDQTY1", null, null, Long.class, "temppickedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TEMPORARY_ALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemporaryAllocId() { return _columnTemporaryAllocId; }
    /**
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstId() { return _columnPickingInstId; }
    /**
     * ALLOCATESEQ: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocateseq() { return _columnAllocateseq; }
    /**
     * LOT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LISTKBN: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * TEMPPICKEDQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemppickedqty1() { return _columnTemppickedqty1; }
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
        ls.add(columnTemporaryAllocId());
        ls.add(columnPickingInstId());
        ls.add(columnAllocateseq());
        ls.add(columnLotId());
        ls.add(columnLocationId());
        ls.add(columnListkbn());
        ls.add(columnTemppickedqty1());
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
    protected UniqueInfo cpui() { return hpcpui(columnTemporaryAllocId()); }
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
    /**
     * T_TRTEMPALLOCATESEQDETAIL by TEMPORARY_ALLOC_ID, named 'TTrtempallocateseqdetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrtempallocateseqdetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTemporaryAllocId(), TTrtempallocateseqdetailDbm.getInstance().columnTemporaryAllocId());
        return cri("T_TRTEMPALLOCATESEQDETAIL_FK1", "TTrtempallocateseqdetailList", this, TTrtempallocateseqdetailDbm.getInstance(), mp, false, "TTrtempallocateseq");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrtempallocateseq"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrtempallocateseqCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrtempallocateseqBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrtempallocateseq> getEntityType() { return TTrtempallocateseq.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrtempallocateseq newEntity() { return new TTrtempallocateseq(); }
    public TTrtempallocateseq newMyEntity() { return new TTrtempallocateseq(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrtempallocateseq)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrtempallocateseq)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
