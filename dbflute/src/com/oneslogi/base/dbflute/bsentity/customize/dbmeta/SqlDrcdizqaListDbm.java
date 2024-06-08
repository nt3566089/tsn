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
 * The DB meta of SqlDrcdizqaList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlDrcdizqaListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlDrcdizqaListDbm _instance = new SqlDrcdizqaListDbm();
    private SqlDrcdizqaListDbm() {}
    public static SqlDrcdizqaListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getProductId(), (et, vl) -> ((SqlDrcdizqaList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getZzmatnr(), (et, vl) -> ((SqlDrcdizqaList)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getLinblk(), (et, vl) -> ((SqlDrcdizqaList)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getLocid(), (et, vl) -> ((SqlDrcdizqaList)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getSrrnk(), (et, vl) -> ((SqlDrcdizqaList)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getSroprtcnt(), (et, vl) -> ((SqlDrcdizqaList)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getDed(), (et, vl) -> ((SqlDrcdizqaList)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getPstnid(), (et, vl) -> ((SqlDrcdizqaList)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getZqacp(), (et, vl) -> ((SqlDrcdizqaList)et).setZqacp(ctl(vl)), "zqacp");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getZqactqa(), (et, vl) -> ((SqlDrcdizqaList)et).setZqactqa(ctl(vl)), "zqactqa");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getUnit1(), (et, vl) -> ((SqlDrcdizqaList)et).setUnit1(ctb(vl)), "unit1");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getUnit2(), (et, vl) -> ((SqlDrcdizqaList)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((SqlDrcdizqaList)et).getLocationId(), (et, vl) -> ((SqlDrcdizqaList)et).setLocationId(ctl(vl)), "locationId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlDrcdizqaList";
    protected final String _tableDispName = "SqlDrcdizqaList";
    protected final String _tablePropertyName = "sqlDrcdizqaList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlDrcdizqaList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqacp = cci("ZQACP", "ZQACP", null, null, Long.class, "zqacp", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZqactqa = cci("ZQACTQA", "ZQACTQA", null, null, Long.class, "zqactqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, java.math.BigDecimal.class, "unit1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * ZZMATNR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * LINBLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * LOCID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocid() { return _columnLocid; }
    /**
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * SROPRTCNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * DED: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * ZQACP: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZqacp() { return _columnZqacp; }
    /**
     * ZQACTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZqactqa() { return _columnZqactqa; }
    /**
     * UNIT1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnZzmatnr());
        ls.add(columnLinblk());
        ls.add(columnLocid());
        ls.add(columnSrrnk());
        ls.add(columnSroprtcnt());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnZqacp());
        ls.add(columnZqactqa());
        ls.add(columnUnit1());
        ls.add(columnUnit2());
        ls.add(columnLocationId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlDrcdizqaList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlDrcdizqaList> getEntityType() { return SqlDrcdizqaList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlDrcdizqaList newEntity() { return new SqlDrcdizqaList(); }
    public SqlDrcdizqaList newMyEntity() { return new SqlDrcdizqaList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlDrcdizqaList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlDrcdizqaList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
