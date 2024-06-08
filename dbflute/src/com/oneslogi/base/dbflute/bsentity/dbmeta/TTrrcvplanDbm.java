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
 * The DB meta of T_TRRCVPLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvplanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrcvplanDbm _instance = new TTrrcvplanDbm();
    private TTrrcvplanDbm() {}
    public static TTrrcvplanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getTrrcvplanId(), (et, vl) -> ((TTrrcvplan)et).setTrrcvplanId(ctl(vl)), "trrcvplanId");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getReceivePlanHId(), (et, vl) -> ((TTrrcvplan)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getRcvlineno(), (et, vl) -> ((TTrrcvplan)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getRcvplansts(), (et, vl) -> ((TTrrcvplan)et).setRcvplansts(ctb(vl)), "rcvplansts");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getProductCd(), (et, vl) -> ((TTrrcvplan)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getLot1(), (et, vl) -> ((TTrrcvplan)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getLot3(), (et, vl) -> ((TTrrcvplan)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getLot4(), (et, vl) -> ((TTrrcvplan)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getLot2(), (et, vl) -> ((TTrrcvplan)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getWarehousecd(), (et, vl) -> ((TTrrcvplan)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getToloccd(), (et, vl) -> ((TTrrcvplan)et).setToloccd((String)vl), "toloccd");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getTrrcvqty1(), (et, vl) -> ((TTrrcvplan)et).setTrrcvqty1(ctb(vl)), "trrcvqty1");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getRcvinno(), (et, vl) -> ((TTrrcvplan)et).setRcvinno((String)vl), "rcvinno");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getPrintedflg(), (et, vl) -> ((TTrrcvplan)et).setPrintedflg(ctb(vl)), "printedflg");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getLoadqty1(), (et, vl) -> ((TTrrcvplan)et).setLoadqty1(ctb(vl)), "loadqty1");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getReceivedqty1(), (et, vl) -> ((TTrrcvplan)et).setReceivedqty1(ctb(vl)), "receivedqty1");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getReceivePlanBId(), (et, vl) -> ((TTrrcvplan)et).setReceivePlanBId(ctb(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getDelFlg(), (et, vl) -> ((TTrrcvplan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getVersionNo(), (et, vl) -> ((TTrrcvplan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getControlNo(), (et, vl) -> ((TTrrcvplan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getAddDt(), (et, vl) -> ((TTrrcvplan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getAddUser(), (et, vl) -> ((TTrrcvplan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getAddProcess(), (et, vl) -> ((TTrrcvplan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getUpdDt(), (et, vl) -> ((TTrrcvplan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getUpdUser(), (et, vl) -> ((TTrrcvplan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrcvplan)et).getUpdProcess(), (et, vl) -> ((TTrrcvplan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRRCVPLAN";
    protected final String _tableDispName = "T_TRRCVPLAN";
    protected final String _tablePropertyName = "TTrrcvplan";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRRCVPLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrrcvplanId = cci("TRRCVPLAN_ID", "TRRCVPLAN_ID", null, null, Long.class, "trrcvplanId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvplansts = cci("RCVPLANSTS", "RCVPLANSTS", null, null, java.math.BigDecimal.class, "rcvplansts", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToloccd = cci("TOLOCCD", "TOLOCCD", null, null, String.class, "toloccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrrcvqty1 = cci("TRRCVQTY1", "TRRCVQTY1", null, null, java.math.BigDecimal.class, "trrcvqty1", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvinno = cci("RCVINNO", "RCVINNO", null, null, String.class, "rcvinno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, java.math.BigDecimal.class, "printedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadqty1 = cci("LOADQTY1", "LOADQTY1", null, null, java.math.BigDecimal.class, "loadqty1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty1 = cci("RECEIVEDQTY1", "RECEIVEDQTY1", null, null, java.math.BigDecimal.class, "receivedqty1", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, java.math.BigDecimal.class, "receivePlanBId", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * TRRCVPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrcvplanId() { return _columnTrrcvplanId; }
    /**
     * RECEIVE_PLAN_H_ID: {IX+, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * RCVLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * RCVPLANSTS: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvplansts() { return _columnRcvplansts; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
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
     * WAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * TOLOCCD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToloccd() { return _columnToloccd; }
    /**
     * TRRCVQTY1: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrcvqty1() { return _columnTrrcvqty1; }
    /**
     * RCVINNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvinno() { return _columnRcvinno; }
    /**
     * PRINTEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * LOADQTY1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadqty1() { return _columnLoadqty1; }
    /**
     * RECEIVEDQTY1: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty1() { return _columnReceivedqty1; }
    /**
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
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
        ls.add(columnTrrcvplanId());
        ls.add(columnReceivePlanHId());
        ls.add(columnRcvlineno());
        ls.add(columnRcvplansts());
        ls.add(columnProductCd());
        ls.add(columnLot1());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot2());
        ls.add(columnWarehousecd());
        ls.add(columnToloccd());
        ls.add(columnTrrcvqty1());
        ls.add(columnRcvinno());
        ls.add(columnPrintedflg());
        ls.add(columnLoadqty1());
        ls.add(columnReceivedqty1());
        ls.add(columnReceivePlanBId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrrcvplanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrcvplan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrcvplanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrcvplanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrcvplan> getEntityType() { return TTrrcvplan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrcvplan newEntity() { return new TTrrcvplan(); }
    public TTrrcvplan newMyEntity() { return new TTrrcvplan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrcvplan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrcvplan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
