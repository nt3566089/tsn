package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlTCcopamPrintData. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTCcopamPrintDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTCcopamPrintDataDbm _instance = new SqlTCcopamPrintDataDbm();
    private SqlTCcopamPrintDataDbm() {}
    public static SqlTCcopamPrintDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getTdrelayid(), (et, vl) -> ((SqlTCcopamPrintData)et).setTdrelayid((String)vl), "tdrelayid");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getStcd(), (et, vl) -> ((SqlTCcopamPrintData)et).setStcd((String)vl), "stcd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSnno1(), (et, vl) -> ((SqlTCcopamPrintData)et).setSnno1((String)vl), "snno1");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSnno2(), (et, vl) -> ((SqlTCcopamPrintData)et).setSnno2((String)vl), "snno2");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSnno3(), (et, vl) -> ((SqlTCcopamPrintData)et).setSnno3((String)vl), "snno3");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSnymd(), (et, vl) -> ((SqlTCcopamPrintData)et).setSnymd((String)vl), "snymd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getArvymd(), (et, vl) -> ((SqlTCcopamPrintData)et).setArvymd((String)vl), "arvymd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getPlncarknd(), (et, vl) -> ((SqlTCcopamPrintData)et).setPlncarknd((String)vl), "plncarknd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getAmcarknd(), (et, vl) -> ((SqlTCcopamPrintData)et).setAmcarknd((String)vl), "amcarknd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getTrannm(), (et, vl) -> ((SqlTCcopamPrintData)et).setTrannm((String)vl), "trannm");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getCarno(), (et, vl) -> ((SqlTCcopamPrintData)et).setCarno((String)vl), "carno");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getGnlpltqa(), (et, vl) -> ((SqlTCcopamPrintData)et).setGnlpltqa(ctl(vl)), "gnlpltqa");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getOtpltqa(), (et, vl) -> ((SqlTCcopamPrintData)et).setOtpltqa(ctl(vl)), "otpltqa");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSumpltqa(), (et, vl) -> ((SqlTCcopamPrintData)et).setSumpltqa(ctl(vl)), "sumpltqa");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getQty(), (et, vl) -> ((SqlTCcopamPrintData)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getTotalnum(), (et, vl) -> ((SqlTCcopamPrintData)et).setTotalnum(ctl(vl)), "totalnum");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSelno1(), (et, vl) -> ((SqlTCcopamPrintData)et).setSelno1((String)vl), "selno1");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSelno2(), (et, vl) -> ((SqlTCcopamPrintData)et).setSelno2((String)vl), "selno2");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintData)et).getSelno3(), (et, vl) -> ((SqlTCcopamPrintData)et).setSelno3((String)vl), "selno3");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTCcopamPrintData";
    protected final String _tableDispName = "SqlTCcopamPrintData";
    protected final String _tablePropertyName = "sqlTCcopamPrintData";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTCcopamPrintData", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTdrelayid = cci("TDRELAYID", "TDRELAYID", null, null, String.class, "tdrelayid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStcd = cci("STCD", "STCD", null, null, String.class, "stcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnno1 = cci("SNNO1", "SNNO1", null, null, String.class, "snno1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnno2 = cci("SNNO2", "SNNO2", null, null, String.class, "snno2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnno3 = cci("SNNO3", "SNNO3", null, null, String.class, "snno3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnymd = cci("SNYMD", "SNYMD", null, null, String.class, "snymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArvymd = cci("ARVYMD", "ARVYMD", null, null, String.class, "arvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlncarknd = cci("PLNCARKND", "PLNCARKND", null, null, String.class, "plncarknd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmcarknd = cci("AMCARKND", "AMCARKND", null, null, String.class, "amcarknd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrannm = cci("TRANNM", "TRANNM", null, null, String.class, "trannm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarno = cci("CARNO", "CARNO", null, null, String.class, "carno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGnlpltqa = cci("GNLPLTQA", "GNLPLTQA", null, null, Long.class, "gnlpltqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtpltqa = cci("OTPLTQA", "OTPLTQA", null, null, Long.class, "otpltqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumpltqa = cci("SUMPLTQA", "SUMPLTQA", null, null, Long.class, "sumpltqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalnum = cci("TOTALNUM", "TOTALNUM", null, null, Long.class, "totalnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelno1 = cci("SELNO1", "SELNO1", null, null, String.class, "selno1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelno2 = cci("SELNO2", "SELNO2", null, null, String.class, "selno2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelno3 = cci("SELNO3", "SELNO3", null, null, String.class, "selno3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TDRELAYID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTdrelayid() { return _columnTdrelayid; }
    /**
     * STCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStcd() { return _columnStcd; }
    /**
     * SNNO1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnno1() { return _columnSnno1; }
    /**
     * SNNO2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnno2() { return _columnSnno2; }
    /**
     * SNNO3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnno3() { return _columnSnno3; }
    /**
     * SNYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnymd() { return _columnSnymd; }
    /**
     * ARVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArvymd() { return _columnArvymd; }
    /**
     * PLNCARKND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlncarknd() { return _columnPlncarknd; }
    /**
     * AMCARKND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmcarknd() { return _columnAmcarknd; }
    /**
     * TRANNM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrannm() { return _columnTrannm; }
    /**
     * CARNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarno() { return _columnCarno; }
    /**
     * GNLPLTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGnlpltqa() { return _columnGnlpltqa; }
    /**
     * OTPLTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtpltqa() { return _columnOtpltqa; }
    /**
     * SUMPLTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumpltqa() { return _columnSumpltqa; }
    /**
     * QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * TOTALNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalnum() { return _columnTotalnum; }
    /**
     * SELNO1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelno1() { return _columnSelno1; }
    /**
     * SELNO2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelno2() { return _columnSelno2; }
    /**
     * SELNO3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelno3() { return _columnSelno3; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTdrelayid());
        ls.add(columnStcd());
        ls.add(columnSnno1());
        ls.add(columnSnno2());
        ls.add(columnSnno3());
        ls.add(columnSnymd());
        ls.add(columnArvymd());
        ls.add(columnPlncarknd());
        ls.add(columnAmcarknd());
        ls.add(columnTrannm());
        ls.add(columnCarno());
        ls.add(columnGnlpltqa());
        ls.add(columnOtpltqa());
        ls.add(columnSumpltqa());
        ls.add(columnQty());
        ls.add(columnTotalnum());
        ls.add(columnSelno1());
        ls.add(columnSelno2());
        ls.add(columnSelno3());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamPrintData"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTCcopamPrintData> getEntityType() { return SqlTCcopamPrintData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTCcopamPrintData newEntity() { return new SqlTCcopamPrintData(); }
    public SqlTCcopamPrintData newMyEntity() { return new SqlTCcopamPrintData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTCcopamPrintData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTCcopamPrintData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
