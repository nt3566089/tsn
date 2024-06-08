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
 * The DB meta of W_WKPALLETIZE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkpalletizeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkpalletizeDbm _instance = new WWkpalletizeDbm();
    private WWkpalletizeDbm() {}
    public static WWkpalletizeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getSeqno(), (et, vl) -> ((WWkpalletize)et).setSeqno(ctb(vl)), "seqno");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getSymbolno(), (et, vl) -> ((WWkpalletize)et).setSymbolno(ctb(vl)), "symbolno");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getProductCd(), (et, vl) -> ((WWkpalletize)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getAname(), (et, vl) -> ((WWkpalletize)et).setAname((String)vl), "aname");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getLot3(), (et, vl) -> ((WWkpalletize)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getLot1(), (et, vl) -> ((WWkpalletize)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getLot4(), (et, vl) -> ((WWkpalletize)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getLot2(), (et, vl) -> ((WWkpalletize)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getRestqty(), (et, vl) -> ((WWkpalletize)et).setRestqty(ctb(vl)), "restqty");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getPalletno(), (et, vl) -> ((WWkpalletize)et).setPalletno(ctb(vl)), "palletno");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getLoccd(), (et, vl) -> ((WWkpalletize)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getLotkey(), (et, vl) -> ((WWkpalletize)et).setLotkey(ctb(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getDelFlg(), (et, vl) -> ((WWkpalletize)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getVersionNo(), (et, vl) -> ((WWkpalletize)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getControlNo(), (et, vl) -> ((WWkpalletize)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getAddDt(), (et, vl) -> ((WWkpalletize)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getAddUser(), (et, vl) -> ((WWkpalletize)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getAddProcess(), (et, vl) -> ((WWkpalletize)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getUpdDt(), (et, vl) -> ((WWkpalletize)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getUpdUser(), (et, vl) -> ((WWkpalletize)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkpalletize)et).getUpdProcess(), (et, vl) -> ((WWkpalletize)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKPALLETIZE";
    protected final String _tableDispName = "W_WKPALLETIZE";
    protected final String _tablePropertyName = "WWkpalletize";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKPALLETIZE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, java.math.BigDecimal.class, "seqno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolno = cci("SYMBOLNO", "SYMBOLNO", null, null, java.math.BigDecimal.class, "symbolno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAname = cci("ANAME", "ANAME", null, null, String.class, "aname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqty = cci("RESTQTY", "RESTQTY", null, null, java.math.BigDecimal.class, "restqty", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PALLETNO", "PALLETNO", null, null, java.math.BigDecimal.class, "palletno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotkey = cci("LOTKEY", "LOTKEY", null, null, java.math.BigDecimal.class, "lotkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * SEQNO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * SYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolno() { return _columnSymbolno; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ANAME: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAname() { return _columnAname; }
    /**
     * LOT3: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT1: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT2: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * RESTQTY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqty() { return _columnRestqty; }
    /**
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
    /**
     * LOCCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * LOTKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
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
        ls.add(columnSeqno());
        ls.add(columnSymbolno());
        ls.add(columnProductCd());
        ls.add(columnAname());
        ls.add(columnLot3());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnLot2());
        ls.add(columnRestqty());
        ls.add(columnPalletno());
        ls.add(columnLoccd());
        ls.add(columnLotkey());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnSeqno());
        ls.add(columnSymbolno());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkpalletize"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkpalletizeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkpalletizeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkpalletize> getEntityType() { return WWkpalletize.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkpalletize newEntity() { return new WWkpalletize(); }
    public WWkpalletize newMyEntity() { return new WWkpalletize(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkpalletize)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkpalletize)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
