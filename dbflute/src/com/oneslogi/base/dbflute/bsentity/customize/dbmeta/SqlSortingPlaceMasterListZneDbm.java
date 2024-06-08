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
 * The DB meta of SqlSortingPlaceMasterListZne. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlSortingPlaceMasterListZneDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlSortingPlaceMasterListZneDbm _instance = new SqlSortingPlaceMasterListZneDbm();
    private SqlSortingPlaceMasterListZneDbm() {}
    public static SqlSortingPlaceMasterListZneDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfrnk(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfrnk((String)vl), "locidfrnk");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfrnkNm(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfrnkNm((String)vl), "locidfrnkNm");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg1(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg1(ctl(vl)), "locidfbrctg1");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg2(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg2(ctl(vl)), "locidfbrctg2");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg3(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg3(ctl(vl)), "locidfbrctg3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg4(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg4(ctl(vl)), "locidfbrctg4");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg5(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg5(ctl(vl)), "locidfbrctg5");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg6(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg6(ctl(vl)), "locidfbrctg6");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg7(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg7(ctl(vl)), "locidfbrctg7");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg8(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg8(ctl(vl)), "locidfbrctg8");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg9(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg9(ctl(vl)), "locidfbrctg9");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg10(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg10(ctl(vl)), "locidfbrctg10");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterListZne)et).getLocidfbrctg(), (et, vl) -> ((SqlSortingPlaceMasterListZne)et).setLocidfbrctg((String)vl), "locidfbrctg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlSortingPlaceMasterListZne";
    protected final String _tableDispName = "SqlSortingPlaceMasterListZne";
    protected final String _tablePropertyName = "sqlSortingPlaceMasterListZne";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlSortingPlaceMasterListZne", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocidfrnk = cci("LOCIDFRNK", "LOCIDFRNK", null, null, String.class, "locidfrnk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfrnkNm = cci("LOCIDFRNK_NM", "LOCIDFRNK_NM", null, null, String.class, "locidfrnkNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg1 = cci("LOCIDFBRCTG1", "LOCIDFBRCTG1", null, null, Long.class, "locidfbrctg1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg2 = cci("LOCIDFBRCTG2", "LOCIDFBRCTG2", null, null, Long.class, "locidfbrctg2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg3 = cci("LOCIDFBRCTG3", "LOCIDFBRCTG3", null, null, Long.class, "locidfbrctg3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg4 = cci("LOCIDFBRCTG4", "LOCIDFBRCTG4", null, null, Long.class, "locidfbrctg4", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg5 = cci("LOCIDFBRCTG5", "LOCIDFBRCTG5", null, null, Long.class, "locidfbrctg5", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg6 = cci("LOCIDFBRCTG6", "LOCIDFBRCTG6", null, null, Long.class, "locidfbrctg6", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg7 = cci("LOCIDFBRCTG7", "LOCIDFBRCTG7", null, null, Long.class, "locidfbrctg7", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg8 = cci("LOCIDFBRCTG8", "LOCIDFBRCTG8", null, null, Long.class, "locidfbrctg8", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg9 = cci("LOCIDFBRCTG9", "LOCIDFBRCTG9", null, null, Long.class, "locidfbrctg9", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg10 = cci("LOCIDFBRCTG10", "LOCIDFBRCTG10", null, null, Long.class, "locidfbrctg10", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfbrctg = cci("LOCIDFBRCTG", "LOCIDFBRCTG", null, null, String.class, "locidfbrctg", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LOCIDFRNK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfrnk() { return _columnLocidfrnk; }
    /**
     * LOCIDFRNK_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfrnkNm() { return _columnLocidfrnkNm; }
    /**
     * LOCIDFBRCTG1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg1() { return _columnLocidfbrctg1; }
    /**
     * LOCIDFBRCTG2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg2() { return _columnLocidfbrctg2; }
    /**
     * LOCIDFBRCTG3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg3() { return _columnLocidfbrctg3; }
    /**
     * LOCIDFBRCTG4: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg4() { return _columnLocidfbrctg4; }
    /**
     * LOCIDFBRCTG5: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg5() { return _columnLocidfbrctg5; }
    /**
     * LOCIDFBRCTG6: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg6() { return _columnLocidfbrctg6; }
    /**
     * LOCIDFBRCTG7: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg7() { return _columnLocidfbrctg7; }
    /**
     * LOCIDFBRCTG8: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg8() { return _columnLocidfbrctg8; }
    /**
     * LOCIDFBRCTG9: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg9() { return _columnLocidfbrctg9; }
    /**
     * LOCIDFBRCTG10: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg10() { return _columnLocidfbrctg10; }
    /**
     * LOCIDFBRCTG: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfbrctg() { return _columnLocidfbrctg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLocidfrnk());
        ls.add(columnLocidfrnkNm());
        ls.add(columnLocidfbrctg1());
        ls.add(columnLocidfbrctg2());
        ls.add(columnLocidfbrctg3());
        ls.add(columnLocidfbrctg4());
        ls.add(columnLocidfbrctg5());
        ls.add(columnLocidfbrctg6());
        ls.add(columnLocidfbrctg7());
        ls.add(columnLocidfbrctg8());
        ls.add(columnLocidfbrctg9());
        ls.add(columnLocidfbrctg10());
        ls.add(columnLocidfbrctg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterListZne"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlSortingPlaceMasterListZne> getEntityType() { return SqlSortingPlaceMasterListZne.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlSortingPlaceMasterListZne newEntity() { return new SqlSortingPlaceMasterListZne(); }
    public SqlSortingPlaceMasterListZne newMyEntity() { return new SqlSortingPlaceMasterListZne(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlSortingPlaceMasterListZne)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlSortingPlaceMasterListZne)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
