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
 * The DB meta of W_WKCUTLOCMOVE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkcutlocmoveDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkcutlocmoveDbm _instance = new WWkcutlocmoveDbm();
    private WWkcutlocmoveDbm() {}
    public static WWkcutlocmoveDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getSeqno(), (et, vl) -> ((WWkcutlocmove)et).setSeqno(ctb(vl)), "seqno");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getSymbolno(), (et, vl) -> ((WWkcutlocmove)et).setSymbolno(ctb(vl)), "symbolno");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getProductCd(), (et, vl) -> ((WWkcutlocmove)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getLot3(), (et, vl) -> ((WWkcutlocmove)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getLot1(), (et, vl) -> ((WWkcutlocmove)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getLot4(), (et, vl) -> ((WWkcutlocmove)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getLot2(), (et, vl) -> ((WWkcutlocmove)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getOtherlot1(), (et, vl) -> ((WWkcutlocmove)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getQty(), (et, vl) -> ((WWkcutlocmove)et).setQty(ctb(vl)), "qty");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getQtybowl(), (et, vl) -> ((WWkcutlocmove)et).setQtybowl(ctb(vl)), "qtybowl");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getMixedflg(), (et, vl) -> ((WWkcutlocmove)et).setMixedflg((String)vl), "mixedflg");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getDelFlg(), (et, vl) -> ((WWkcutlocmove)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getVersionNo(), (et, vl) -> ((WWkcutlocmove)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getControlNo(), (et, vl) -> ((WWkcutlocmove)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getAddDt(), (et, vl) -> ((WWkcutlocmove)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getAddUser(), (et, vl) -> ((WWkcutlocmove)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getAddProcess(), (et, vl) -> ((WWkcutlocmove)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getUpdDt(), (et, vl) -> ((WWkcutlocmove)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getUpdUser(), (et, vl) -> ((WWkcutlocmove)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkcutlocmove)et).getUpdProcess(), (et, vl) -> ((WWkcutlocmove)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKCUTLOCMOVE";
    protected final String _tableDispName = "W_WKCUTLOCMOVE";
    protected final String _tablePropertyName = "WWkcutlocmove";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKCUTLOCMOVE", _tableDbName);
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
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, java.math.BigDecimal.class, "qty", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtybowl = cci("QTYBOWL", "QTYBOWL", null, null, java.math.BigDecimal.class, "qtybowl", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedflg = cci("MIXEDFLG", "MIXEDFLG", null, null, String.class, "mixedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * OTHERLOT1: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * QTY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtybowl() { return _columnQtybowl; }
    /**
     * MIXEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedflg() { return _columnMixedflg; }
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
        ls.add(columnLot3());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnLot2());
        ls.add(columnOtherlot1());
        ls.add(columnQty());
        ls.add(columnQtybowl());
        ls.add(columnMixedflg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkcutlocmove"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkcutlocmoveCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkcutlocmoveBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkcutlocmove> getEntityType() { return WWkcutlocmove.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkcutlocmove newEntity() { return new WWkcutlocmove(); }
    public WWkcutlocmove newMyEntity() { return new WWkcutlocmove(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkcutlocmove)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkcutlocmove)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
