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
 * The DB meta of SqlSortingPlaceMasterEditBlk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlSortingPlaceMasterEditBlkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlSortingPlaceMasterEditBlkDbm _instance = new SqlSortingPlaceMasterEditBlkDbm();
    private SqlSortingPlaceMasterEditBlkDbm() {}
    public static SqlSortingPlaceMasterEditBlkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getCblkId(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setCblkId(ctl(vl)), "cblkId");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getBlkcd(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setBlkcd((String)vl), "blkcd");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getBlknm(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setBlknm((String)vl), "blknm");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfrnk(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfrnk((String)vl), "locidfrnk");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getVersionNo(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg1(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg1(ctl(vl)), "locidfbrctg1");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg2(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg2(ctl(vl)), "locidfbrctg2");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg3(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg3(ctl(vl)), "locidfbrctg3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg4(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg4(ctl(vl)), "locidfbrctg4");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg5(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg5(ctl(vl)), "locidfbrctg5");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg6(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg6(ctl(vl)), "locidfbrctg6");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg7(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg7(ctl(vl)), "locidfbrctg7");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg8(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg8(ctl(vl)), "locidfbrctg8");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg9(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg9(ctl(vl)), "locidfbrctg9");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getLocidfbrctg10(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setLocidfbrctg10(ctl(vl)), "locidfbrctg10");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getHdrdboxrsfid(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setHdrdboxrsfid((String)vl), "hdrdboxrsfid");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getPkgrt(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setPkgrt(ctl(vl)), "pkgrt");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getSprprsid(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getDelFlg(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditBlk)et).getCenterId(), (et, vl) -> ((SqlSortingPlaceMasterEditBlk)et).setCenterId(ctl(vl)), "centerId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlSortingPlaceMasterEditBlk";
    protected final String _tableDispName = "SqlSortingPlaceMasterEditBlk";
    protected final String _tablePropertyName = "sqlSortingPlaceMasterEditBlk";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlSortingPlaceMasterEditBlk", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCblkId = cci("CBLK_ID", "CBLK_ID", null, null, Long.class, "cblkId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlkcd = cci("BLKCD", "BLKCD", null, null, String.class, "blkcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlknm = cci("BLKNM", "BLKNM", null, null, String.class, "blknm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocidfrnk = cci("LOCIDFRNK", "LOCIDFRNK", null, null, String.class, "locidfrnk", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
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
    protected final ColumnInfo _columnHdrdboxrsfid = cci("HDRDBOXRSFID", "HDRDBOXRSFID", null, null, String.class, "hdrdboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPkgrt = cci("PKGRT", "PKGRT", null, null, Long.class, "pkgrt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CBLK_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCblkId() { return _columnCblkId; }
    /**
     * BLKCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlkcd() { return _columnBlkcd; }
    /**
     * BLKNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlknm() { return _columnBlknm; }
    /**
     * LOCIDFRNK: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocidfrnk() { return _columnLocidfrnk; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
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
     * HDRDBOXRSFID: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdboxrsfid() { return _columnHdrdboxrsfid; }
    /**
     * PKGRT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkgrt() { return _columnPkgrt; }
    /**
     * SPRPRSID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSprprsid() { return _columnSprprsid; }
    /**
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCblkId());
        ls.add(columnBlkcd());
        ls.add(columnBlknm());
        ls.add(columnLocidfrnk());
        ls.add(columnVersionNo());
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
        ls.add(columnHdrdboxrsfid());
        ls.add(columnPkgrt());
        ls.add(columnSprprsid());
        ls.add(columnDelFlg());
        ls.add(columnCenterId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditBlk"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlSortingPlaceMasterEditBlk> getEntityType() { return SqlSortingPlaceMasterEditBlk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlSortingPlaceMasterEditBlk newEntity() { return new SqlSortingPlaceMasterEditBlk(); }
    public SqlSortingPlaceMasterEditBlk newMyEntity() { return new SqlSortingPlaceMasterEditBlk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlSortingPlaceMasterEditBlk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlSortingPlaceMasterEditBlk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
