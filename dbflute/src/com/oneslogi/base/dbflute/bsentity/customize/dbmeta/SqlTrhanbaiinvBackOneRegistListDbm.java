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
 * The DB meta of SqlTrhanbaiinvBackOneRegistList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTrhanbaiinvBackOneRegistListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTrhanbaiinvBackOneRegistListDbm _instance = new SqlTrhanbaiinvBackOneRegistListDbm();
    private SqlTrhanbaiinvBackOneRegistListDbm() {}
    public static SqlTrhanbaiinvBackOneRegistListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvBackOneRegistList)et).getPcd(), (et, vl) -> ((SqlTrhanbaiinvBackOneRegistList)et).setPcd((String)vl), "pcd");
        setupEpg(_epgMap, et -> ((SqlTrhanbaiinvBackOneRegistList)et).getTotal(), (et, vl) -> ((SqlTrhanbaiinvBackOneRegistList)et).setTotal(ctb(vl)), "total");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTrhanbaiinvBackOneRegistList";
    protected final String _tableDispName = "SqlTrhanbaiinvBackOneRegistList";
    protected final String _tablePropertyName = "sqlTrhanbaiinvBackOneRegistList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTrhanbaiinvBackOneRegistList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPcd = cci("PCD", "PCD", null, null, String.class, "pcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotal = cci("TOTAL", "TOTAL", null, null, java.math.BigDecimal.class, "total", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

    /**
     * PCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPcd() { return _columnPcd; }
    /**
     * TOTAL: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotal() { return _columnTotal; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPcd());
        ls.add(columnTotal());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvBackOneRegistList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTrhanbaiinvBackOneRegistList> getEntityType() { return SqlTrhanbaiinvBackOneRegistList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTrhanbaiinvBackOneRegistList newEntity() { return new SqlTrhanbaiinvBackOneRegistList(); }
    public SqlTrhanbaiinvBackOneRegistList newMyEntity() { return new SqlTrhanbaiinvBackOneRegistList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTrhanbaiinvBackOneRegistList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTrhanbaiinvBackOneRegistList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}