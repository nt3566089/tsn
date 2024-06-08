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
 * The DB meta of SqlInventoryInfoOffset. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryInfoOffsetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryInfoOffsetDbm _instance = new SqlInventoryInfoOffsetDbm();
    private SqlInventoryInfoOffsetDbm() {}
    public static SqlInventoryInfoOffsetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getHeadid(), (et, vl) -> ((SqlInventoryInfoOffset)et).setHeadid(ctl(vl)), "headid");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getInfoid(), (et, vl) -> ((SqlInventoryInfoOffset)et).setInfoid(ctl(vl)), "infoid");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getInfoversion(), (et, vl) -> ((SqlInventoryInfoOffset)et).setInfoversion(ctl(vl)), "infoversion");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetid(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetid(ctl(vl)), "offsetid");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetcasecd(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetcasecd(ctb(vl)), "offsetcasecd");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetcutcasecd(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetcutcasecd(ctb(vl)), "offsetcutcasecd");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetdtlno(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetdtlno(ctl(vl)), "offsetdtlno");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetinstno(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetinstno(ctl(vl)), "offsetinstno");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetinstbranchno(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetinstbranchno(ctl(vl)), "offsetinstbranchno");
        setupEpg(_epgMap, et -> ((SqlInventoryInfoOffset)et).getOffsetversion(), (et, vl) -> ((SqlInventoryInfoOffset)et).setOffsetversion(ctl(vl)), "offsetversion");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryInfoOffset";
    protected final String _tableDispName = "SqlInventoryInfoOffset";
    protected final String _tablePropertyName = "sqlInventoryInfoOffset";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryInfoOffset", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHeadid = cci("HEADID", "HEADID", null, null, Long.class, "headid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInfoid = cci("INFOID", "INFOID", null, null, Long.class, "infoid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInfoversion = cci("INFOVERSION", "INFOVERSION", null, null, Long.class, "infoversion", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetid = cci("OFFSETID", "OFFSETID", null, null, Long.class, "offsetid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetcasecd = cci("OFFSETCASECD", "OFFSETCASECD", null, null, java.math.BigDecimal.class, "offsetcasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetcutcasecd = cci("OFFSETCUTCASECD", "OFFSETCUTCASECD", null, null, java.math.BigDecimal.class, "offsetcutcasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetdtlno = cci("OFFSETDTLNO", "OFFSETDTLNO", null, null, Long.class, "offsetdtlno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetinstno = cci("OFFSETINSTNO", "OFFSETINSTNO", null, null, Long.class, "offsetinstno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetinstbranchno = cci("OFFSETINSTBRANCHNO", "OFFSETINSTBRANCHNO", null, null, Long.class, "offsetinstbranchno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOffsetversion = cci("OFFSETVERSION", "OFFSETVERSION", null, null, Long.class, "offsetversion", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * HEADID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeadid() { return _columnHeadid; }
    /**
     * INFOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInfoid() { return _columnInfoid; }
    /**
     * INFOVERSION: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInfoversion() { return _columnInfoversion; }
    /**
     * OFFSETID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetid() { return _columnOffsetid; }
    /**
     * OFFSETCASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetcasecd() { return _columnOffsetcasecd; }
    /**
     * OFFSETCUTCASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetcutcasecd() { return _columnOffsetcutcasecd; }
    /**
     * OFFSETDTLNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetdtlno() { return _columnOffsetdtlno; }
    /**
     * OFFSETINSTNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetinstno() { return _columnOffsetinstno; }
    /**
     * OFFSETINSTBRANCHNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetinstbranchno() { return _columnOffsetinstbranchno; }
    /**
     * OFFSETVERSION: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOffsetversion() { return _columnOffsetversion; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnHeadid());
        ls.add(columnInfoid());
        ls.add(columnInfoversion());
        ls.add(columnOffsetid());
        ls.add(columnOffsetcasecd());
        ls.add(columnOffsetcutcasecd());
        ls.add(columnOffsetdtlno());
        ls.add(columnOffsetinstno());
        ls.add(columnOffsetinstbranchno());
        ls.add(columnOffsetversion());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryInfoOffset"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryInfoOffset> getEntityType() { return SqlInventoryInfoOffset.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryInfoOffset newEntity() { return new SqlInventoryInfoOffset(); }
    public SqlInventoryInfoOffset newMyEntity() { return new SqlInventoryInfoOffset(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryInfoOffset)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryInfoOffset)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
