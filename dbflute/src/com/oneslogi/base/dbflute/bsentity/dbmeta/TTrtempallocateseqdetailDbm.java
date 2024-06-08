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
 * The DB meta of T_TRTEMPALLOCATESEQDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrtempallocateseqdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrtempallocateseqdetailDbm _instance = new TTrtempallocateseqdetailDbm();
    private TTrtempallocateseqdetailDbm() {}
    public static TTrtempallocateseqdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getTemporaryAllocDetailId(), (et, vl) -> ((TTrtempallocateseqdetail)et).setTemporaryAllocDetailId(ctl(vl)), "temporaryAllocDetailId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getTemporaryAllocId(), (et, vl) -> ((TTrtempallocateseqdetail)et).setTemporaryAllocId(ctl(vl)), "temporaryAllocId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getAllocateseq(), (et, vl) -> ((TTrtempallocateseqdetail)et).setAllocateseq(ctl(vl)), "allocateseq");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getLotId(), (et, vl) -> ((TTrtempallocateseqdetail)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getLocationId(), (et, vl) -> ((TTrtempallocateseqdetail)et).setLocationId((String)vl), "locationId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getListkbn(), (et, vl) -> ((TTrtempallocateseqdetail)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getDetaillineno(), (et, vl) -> ((TTrtempallocateseqdetail)et).setDetaillineno(ctl(vl)), "detaillineno");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getPalletId(), (et, vl) -> ((TTrtempallocateseqdetail)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getTemppickedqty1(), (et, vl) -> ((TTrtempallocateseqdetail)et).setTemppickedqty1(ctl(vl)), "temppickedqty1");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getTemppickedqty2(), (et, vl) -> ((TTrtempallocateseqdetail)et).setTemppickedqty2(ctl(vl)), "temppickedqty2");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getTemppickedqty3(), (et, vl) -> ((TTrtempallocateseqdetail)et).setTemppickedqty3(ctl(vl)), "temppickedqty3");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getDelFlg(), (et, vl) -> ((TTrtempallocateseqdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getVersionNo(), (et, vl) -> ((TTrtempallocateseqdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getControlNo(), (et, vl) -> ((TTrtempallocateseqdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getAddDt(), (et, vl) -> ((TTrtempallocateseqdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getAddUser(), (et, vl) -> ((TTrtempallocateseqdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getAddProcess(), (et, vl) -> ((TTrtempallocateseqdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getUpdDt(), (et, vl) -> ((TTrtempallocateseqdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getUpdUser(), (et, vl) -> ((TTrtempallocateseqdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrtempallocateseqdetail)et).getUpdProcess(), (et, vl) -> ((TTrtempallocateseqdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrtempallocateseqdetail)et).getTTrtempallocateseq(), (et, vl) -> ((TTrtempallocateseqdetail)et).setTTrtempallocateseq((TTrtempallocateseq)vl), "TTrtempallocateseq");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRTEMPALLOCATESEQDETAIL";
    protected final String _tableDispName = "T_TRTEMPALLOCATESEQDETAIL";
    protected final String _tablePropertyName = "TTrtempallocateseqdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRTEMPALLOCATESEQDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTemporaryAllocDetailId = cci("TEMPORARY_ALLOC_DETAIL_ID", "TEMPORARY_ALLOC_DETAIL_ID", null, null, Long.class, "temporaryAllocDetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemporaryAllocId = cci("TEMPORARY_ALLOC_ID", "TEMPORARY_ALLOC_ID", null, null, Long.class, "temporaryAllocId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrtempallocateseq", null, null, false);
    protected final ColumnInfo _columnAllocateseq = cci("ALLOCATESEQ", "ALLOCATESEQ", null, null, Long.class, "allocateseq", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, String.class, "locationId", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDetaillineno = cci("DETAILLINENO", "DETAILLINENO", null, null, Long.class, "detaillineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemppickedqty1 = cci("TEMPPICKEDQTY1", "TEMPPICKEDQTY1", null, null, Long.class, "temppickedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemppickedqty2 = cci("TEMPPICKEDQTY2", "TEMPPICKEDQTY2", null, null, Long.class, "temppickedqty2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTemppickedqty3 = cci("TEMPPICKEDQTY3", "TEMPPICKEDQTY3", null, null, Long.class, "temppickedqty3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemporaryAllocDetailId() { return _columnTemporaryAllocDetailId; }
    /**
     * TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemporaryAllocId() { return _columnTemporaryAllocId; }
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
     * LOCATION_ID: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LISTKBN: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * DETAILLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDetaillineno() { return _columnDetaillineno; }
    /**
     * PALLET_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * TEMPPICKEDQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemppickedqty1() { return _columnTemppickedqty1; }
    /**
     * TEMPPICKEDQTY2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemppickedqty2() { return _columnTemppickedqty2; }
    /**
     * TEMPPICKEDQTY3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTemppickedqty3() { return _columnTemppickedqty3; }
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
        ls.add(columnTemporaryAllocDetailId());
        ls.add(columnTemporaryAllocId());
        ls.add(columnAllocateseq());
        ls.add(columnLotId());
        ls.add(columnLocationId());
        ls.add(columnListkbn());
        ls.add(columnDetaillineno());
        ls.add(columnPalletId());
        ls.add(columnTemppickedqty1());
        ls.add(columnTemppickedqty2());
        ls.add(columnTemppickedqty3());
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
    protected UniqueInfo cpui() { return hpcpui(columnTemporaryAllocDetailId()); }
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
     * T_TRTEMPALLOCATESEQ by my TEMPORARY_ALLOC_ID, named 'TTrtempallocateseq'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrtempallocateseq() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTemporaryAllocId(), TTrtempallocateseqDbm.getInstance().columnTemporaryAllocId());
        return cfi("T_TRTEMPALLOCATESEQDETAIL_FK1", "TTrtempallocateseq", this, TTrtempallocateseqDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrtempallocateseqdetailList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrtempallocateseqdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrtempallocateseqdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrtempallocateseqdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrtempallocateseqdetail> getEntityType() { return TTrtempallocateseqdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrtempallocateseqdetail newEntity() { return new TTrtempallocateseqdetail(); }
    public TTrtempallocateseqdetail newMyEntity() { return new TTrtempallocateseqdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrtempallocateseqdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrtempallocateseqdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
