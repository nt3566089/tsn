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
 * The DB meta of SqlTTrassortorderCorrectList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTTrassortorderCorrectListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTTrassortorderCorrectListDbm _instance = new SqlTTrassortorderCorrectListDbm();
    private SqlTTrassortorderCorrectListDbm() {}
    public static SqlTTrassortorderCorrectListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTTrassortorderCorrectList)et).getDirectionorderkey(), (et, vl) -> ((SqlTTrassortorderCorrectList)et).setDirectionorderkey(ctl(vl)), "directionorderkey");
        setupEpg(_epgMap, et -> ((SqlTTrassortorderCorrectList)et).getDirectionordergno(), (et, vl) -> ((SqlTTrassortorderCorrectList)et).setDirectionordergno(ctl(vl)), "directionordergno");
        setupEpg(_epgMap, et -> ((SqlTTrassortorderCorrectList)et).getVersionNo(), (et, vl) -> ((SqlTTrassortorderCorrectList)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTTrassortorderCorrectList";
    protected final String _tableDispName = "SqlTTrassortorderCorrectList";
    protected final String _tablePropertyName = "sqlTTrassortorderCorrectList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTTrassortorderCorrectList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDirectionorderkey = cci("DIRECTIONORDERKEY", "DIRECTIONORDERKEY", null, null, Long.class, "directionorderkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionordergno = cci("DIRECTIONORDERGNO", "DIRECTIONORDERGNO", null, null, Long.class, "directionordergno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * DIRECTIONORDERKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionorderkey() { return _columnDirectionorderkey; }
    /**
     * DIRECTIONORDERGNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionordergno() { return _columnDirectionordergno; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDirectionorderkey());
        ls.add(columnDirectionordergno());
        ls.add(columnVersionNo());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTTrassortorderCorrectList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTTrassortorderCorrectList> getEntityType() { return SqlTTrassortorderCorrectList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTTrassortorderCorrectList newEntity() { return new SqlTTrassortorderCorrectList(); }
    public SqlTTrassortorderCorrectList newMyEntity() { return new SqlTTrassortorderCorrectList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTTrassortorderCorrectList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTTrassortorderCorrectList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
