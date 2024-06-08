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
 * The DB meta of SqlSortingPlaceMasterEditLin. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlSortingPlaceMasterEditLinDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlSortingPlaceMasterEditLinDbm _instance = new SqlSortingPlaceMasterEditLinDbm();
    private SqlSortingPlaceMasterEditLinDbm() {}
    public static SqlSortingPlaceMasterEditLinDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getLincd(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setLincd((String)vl), "lincd");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getLinnm(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setLinnm((String)vl), "linnm");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getLinblk1(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setLinblk1((String)vl), "linblk1");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getLinblk2(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setLinblk2((String)vl), "linblk2");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getLinblk3(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setLinblk3((String)vl), "linblk3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getHdrdboxrsfid(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setHdrdboxrsfid((String)vl), "hdrdboxrsfid");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getPkgrt(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setPkgrt(ctl(vl)), "pkgrt");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getSprprsid(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setSprprsid((String)vl), "sprprsid");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getDelFlg(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getClinId(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setClinId(ctl(vl)), "clinId");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getVersionNo(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceMasterEditLin)et).getCenterId(), (et, vl) -> ((SqlSortingPlaceMasterEditLin)et).setCenterId(ctl(vl)), "centerId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlSortingPlaceMasterEditLin";
    protected final String _tableDispName = "SqlSortingPlaceMasterEditLin";
    protected final String _tablePropertyName = "sqlSortingPlaceMasterEditLin";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlSortingPlaceMasterEditLin", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLincd = cci("LINCD", "LINCD", null, null, String.class, "lincd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinnm = cci("LINNM", "LINNM", null, null, String.class, "linnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk1 = cci("LINBLK1", "LINBLK1", null, null, String.class, "linblk1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk2 = cci("LINBLK2", "LINBLK2", null, null, String.class, "linblk2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk3 = cci("LINBLK3", "LINBLK3", null, null, String.class, "linblk3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdboxrsfid = cci("HDRDBOXRSFID", "HDRDBOXRSFID", null, null, String.class, "hdrdboxrsfid", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPkgrt = cci("PKGRT", "PKGRT", null, null, Long.class, "pkgrt", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSprprsid = cci("SPRPRSID", "SPRPRSID", null, null, String.class, "sprprsid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnClinId = cci("CLIN_ID", "CLIN_ID", null, null, Long.class, "clinId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LINCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLincd() { return _columnLincd; }
    /**
     * LINNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinnm() { return _columnLinnm; }
    /**
     * LINBLK1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk1() { return _columnLinblk1; }
    /**
     * LINBLK2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk2() { return _columnLinblk2; }
    /**
     * LINBLK3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk3() { return _columnLinblk3; }
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
     * CLIN_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClinId() { return _columnClinId; }
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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLincd());
        ls.add(columnLinnm());
        ls.add(columnLinblk1());
        ls.add(columnLinblk2());
        ls.add(columnLinblk3());
        ls.add(columnHdrdboxrsfid());
        ls.add(columnPkgrt());
        ls.add(columnSprprsid());
        ls.add(columnDelFlg());
        ls.add(columnClinId());
        ls.add(columnVersionNo());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceMasterEditLin"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlSortingPlaceMasterEditLin> getEntityType() { return SqlSortingPlaceMasterEditLin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlSortingPlaceMasterEditLin newEntity() { return new SqlSortingPlaceMasterEditLin(); }
    public SqlSortingPlaceMasterEditLin newMyEntity() { return new SqlSortingPlaceMasterEditLin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlSortingPlaceMasterEditLin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlSortingPlaceMasterEditLin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
