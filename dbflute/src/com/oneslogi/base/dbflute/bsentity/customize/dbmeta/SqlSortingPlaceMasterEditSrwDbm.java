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
 * The DB meta of SqlSortingPlaceMasterEditSrw. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlSortingPlaceMasterEditSrwDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlSortingPlaceMasterEditSrwDbm _instance = new SqlSortingPlaceMasterEditSrwDbm();
    private SqlSortingPlaceMasterEditSrwDbm() {}
    public static SqlSortingPlaceMasterEditSrwDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfrnk(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfrnk((String)vl), "locidfrnk");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg1(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg1(ctl(vl)), "locidfbrctg1");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg2(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg2(ctl(vl)), "locidfbrctg2");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg3(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg3(ctl(vl)), "locidfbrctg3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg4(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg4(ctl(vl)), "locidfbrctg4");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg5(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg5(ctl(vl)), "locidfbrctg5");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg6(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg6(ctl(vl)), "locidfbrctg6");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg7(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg7(ctl(vl)), "locidfbrctg7");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg8(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg8(ctl(vl)), "locidfbrctg8");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg9(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg9(ctl(vl)), "locidfbrctg9");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getLocidfbrctg10(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setLocidfbrctg10(ctl(vl)), "locidfbrctg10");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getSortPlaceManageId(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setSortPlaceManageId(ctl(vl)), "sortPlaceManageId");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getVersionNo(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getCenterId(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getCenterCd(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getClientId(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setClientId(cti(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditSrw)et).getClientCd(), (et, vl) -> ((SqlSortingPlaceMasterEditSrw)et).setClientCd((String)vl), "clientCd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlSortingPlaceMasterEditSrw";
    protected final String _tableDispName = "SqlSortingPlaceMasterEditSrw";
    protected final String _tablePropertyName = "sqlSortingPlaceMasterEditSrw";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlSortingPlaceMasterEditSrw", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocidfrnk = cci("LOCIDFRNK", "LOCIDFRNK", null, null, String.class, "locidfrnk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnSortPlaceManageId = cci("SORT_PLACE_MANAGE_ID", "SORT_PLACE_MANAGE_ID", null, null, Long.class, "sortPlaceManageId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Integer.class, "clientId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LOCIDFRNK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfrnk() { return _columnLocidfrnk; }
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
     * SORT_PLACE_MANAGE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortPlaceManageId() { return _columnSortPlaceManageId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CLIENT_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLocidfrnk());
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
        ls.add(columnSortPlaceManageId());
        ls.add(columnVersionNo());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnClientId());
        ls.add(columnClientCd());
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditSrw"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlSortingPlaceMasterEditSrw> getEntityType() { return SqlSortingPlaceMasterEditSrw.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlSortingPlaceMasterEditSrw newEntity() { return new SqlSortingPlaceMasterEditSrw(); }
    public SqlSortingPlaceMasterEditSrw newMyEntity() { return new SqlSortingPlaceMasterEditSrw(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlSortingPlaceMasterEditSrw)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlSortingPlaceMasterEditSrw)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
