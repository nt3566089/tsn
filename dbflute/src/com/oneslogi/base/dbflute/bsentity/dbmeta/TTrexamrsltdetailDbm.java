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
 * The DB meta of T_TREXAMRSLTDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrexamrsltdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrexamrsltdetailDbm _instance = new TTrexamrsltdetailDbm();
    private TTrexamrsltdetailDbm() {}
    public static TTrexamrsltdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getTrexamrsltdetailId(), (et, vl) -> ((TTrexamrsltdetail)et).setTrexamrsltdetailId(ctl(vl)), "trexamrsltdetailId");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getTrexamresultId(), (et, vl) -> ((TTrexamrsltdetail)et).setTrexamresultId(ctl(vl)), "trexamresultId");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getExamlineno(), (et, vl) -> ((TTrexamrsltdetail)et).setExamlineno(ctl(vl)), "examlineno");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getZaikoinvId(), (et, vl) -> ((TTrexamrsltdetail)et).setZaikoinvId(ctl(vl)), "zaikoinvId");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getZaikoinv(), (et, vl) -> ((TTrexamrsltdetail)et).setZaikoinv((String)vl), "zaikoinv");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getExamqty(), (et, vl) -> ((TTrexamrsltdetail)et).setExamqty(ctb(vl)), "examqty");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getRes40qty1(), (et, vl) -> ((TTrexamrsltdetail)et).setRes40qty1(ctb(vl)), "res40qty1");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getRes40qty2(), (et, vl) -> ((TTrexamrsltdetail)et).setRes40qty2(ctb(vl)), "res40qty2");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getInferiorqty(), (et, vl) -> ((TTrexamrsltdetail)et).setInferiorqty(ctb(vl)), "inferiorqty");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getAftzaikoinvId(), (et, vl) -> ((TTrexamrsltdetail)et).setAftzaikoinvId(ctl(vl)), "aftzaikoinvId");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getAftzaikoinv(), (et, vl) -> ((TTrexamrsltdetail)et).setAftzaikoinv((String)vl), "aftzaikoinv");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getReservationflg(), (et, vl) -> ((TTrexamrsltdetail)et).setReservationflg((String)vl), "reservationflg");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getExamdetailsts(), (et, vl) -> ((TTrexamrsltdetail)et).setExamdetailsts((String)vl), "examdetailsts");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getExamdate(), (et, vl) -> ((TTrexamrsltdetail)et).setExamdate((String)vl), "examdate");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getNotexamqty(), (et, vl) -> ((TTrexamrsltdetail)et).setNotexamqty(ctb(vl)), "notexamqty");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getDelFlg(), (et, vl) -> ((TTrexamrsltdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getVersionNo(), (et, vl) -> ((TTrexamrsltdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getControlNo(), (et, vl) -> ((TTrexamrsltdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getAddDt(), (et, vl) -> ((TTrexamrsltdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getAddUser(), (et, vl) -> ((TTrexamrsltdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getAddProcess(), (et, vl) -> ((TTrexamrsltdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getUpdDt(), (et, vl) -> ((TTrexamrsltdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getUpdUser(), (et, vl) -> ((TTrexamrsltdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrexamrsltdetail)et).getUpdProcess(), (et, vl) -> ((TTrexamrsltdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TREXAMRSLTDETAIL";
    protected final String _tableDispName = "T_TREXAMRSLTDETAIL";
    protected final String _tablePropertyName = "TTrexamrsltdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TREXAMRSLTDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrexamrsltdetailId = cci("TREXAMRSLTDETAIL_ID", "TREXAMRSLTDETAIL_ID", null, null, Long.class, "trexamrsltdetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrexamresultId = cci("TREXAMRESULT_ID", "TREXAMRESULT_ID", null, null, Long.class, "trexamresultId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamlineno = cci("EXAMLINENO", "EXAMLINENO", null, null, Long.class, "examlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZaikoinvId = cci("ZAIKOINV_ID", "ZAIKOINV_ID", null, null, Long.class, "zaikoinvId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZaikoinv = cci("ZAIKOINV", "ZAIKOINV", null, null, String.class, "zaikoinv", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamqty = cci("EXAMQTY", "EXAMQTY", null, null, java.math.BigDecimal.class, "examqty", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRes40qty1 = cci("RES40QTY1", "RES40QTY1", null, null, java.math.BigDecimal.class, "res40qty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRes40qty2 = cci("RES40QTY2", "RES40QTY2", null, null, java.math.BigDecimal.class, "res40qty2", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInferiorqty = cci("INFERIORQTY", "INFERIORQTY", null, null, java.math.BigDecimal.class, "inferiorqty", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAftzaikoinvId = cci("AFTZAIKOINV_ID", "AFTZAIKOINV_ID", null, null, Long.class, "aftzaikoinvId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAftzaikoinv = cci("AFTZAIKOINV", "AFTZAIKOINV", null, null, String.class, "aftzaikoinv", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReservationflg = cci("RESERVATIONFLG", "RESERVATIONFLG", null, null, String.class, "reservationflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamdetailsts = cci("EXAMDETAILSTS", "EXAMDETAILSTS", null, null, String.class, "examdetailsts", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamdate = cci("EXAMDATE", "EXAMDATE", null, null, String.class, "examdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotexamqty = cci("NOTEXAMQTY", "NOTEXAMQTY", null, null, java.math.BigDecimal.class, "notexamqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * TREXAMRSLTDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrexamrsltdetailId() { return _columnTrexamrsltdetailId; }
    /**
     * TREXAMRESULT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrexamresultId() { return _columnTrexamresultId; }
    /**
     * EXAMLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamlineno() { return _columnExamlineno; }
    /**
     * ZAIKOINV_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZaikoinvId() { return _columnZaikoinvId; }
    /**
     * ZAIKOINV: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZaikoinv() { return _columnZaikoinv; }
    /**
     * EXAMQTY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamqty() { return _columnExamqty; }
    /**
     * RES40QTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRes40qty1() { return _columnRes40qty1; }
    /**
     * RES40QTY2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRes40qty2() { return _columnRes40qty2; }
    /**
     * INFERIORQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInferiorqty() { return _columnInferiorqty; }
    /**
     * AFTZAIKOINV_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAftzaikoinvId() { return _columnAftzaikoinvId; }
    /**
     * AFTZAIKOINV: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAftzaikoinv() { return _columnAftzaikoinv; }
    /**
     * RESERVATIONFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReservationflg() { return _columnReservationflg; }
    /**
     * EXAMDETAILSTS: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamdetailsts() { return _columnExamdetailsts; }
    /**
     * EXAMDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamdate() { return _columnExamdate; }
    /**
     * NOTEXAMQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotexamqty() { return _columnNotexamqty; }
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
        ls.add(columnTrexamrsltdetailId());
        ls.add(columnTrexamresultId());
        ls.add(columnExamlineno());
        ls.add(columnZaikoinvId());
        ls.add(columnZaikoinv());
        ls.add(columnExamqty());
        ls.add(columnRes40qty1());
        ls.add(columnRes40qty2());
        ls.add(columnInferiorqty());
        ls.add(columnAftzaikoinvId());
        ls.add(columnAftzaikoinv());
        ls.add(columnReservationflg());
        ls.add(columnExamdetailsts());
        ls.add(columnExamdate());
        ls.add(columnNotexamqty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrexamrsltdetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrexamrsltdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrexamrsltdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrexamrsltdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrexamrsltdetail> getEntityType() { return TTrexamrsltdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrexamrsltdetail newEntity() { return new TTrexamrsltdetail(); }
    public TTrexamrsltdetail newMyEntity() { return new TTrexamrsltdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrexamrsltdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrexamrsltdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
