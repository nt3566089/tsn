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
 * The DB meta of SqlGetStartInvDate. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlGetStartInvDateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlGetStartInvDateDbm _instance = new SqlGetStartInvDateDbm();
    private SqlGetStartInvDateDbm() {}
    public static SqlGetStartInvDateDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlGetStartInvDate)et).getRcvFrDate(), (et, vl) -> ((SqlGetStartInvDate)et).setRcvFrDate((String)vl), "rcvFrDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlGetStartInvDate";
    protected final String _tableDispName = "SqlGetStartInvDate";
    protected final String _tablePropertyName = "sqlGetStartInvDate";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlGetStartInvDate", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRcvFrDate = cci("RcvFrDate", "RcvFrDate", null, null, String.class, "rcvFrDate", null, false, false, false, "nvarchar", 4000, 0, null, null, false, null, null, null, null, null, false);

    /**
     * RcvFrDate: {nvarchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvFrDate() { return _columnRcvFrDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRcvFrDate());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlGetStartInvDate"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlGetStartInvDate> getEntityType() { return SqlGetStartInvDate.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlGetStartInvDate newEntity() { return new SqlGetStartInvDate(); }
    public SqlGetStartInvDate newMyEntity() { return new SqlGetStartInvDate(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlGetStartInvDate)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlGetStartInvDate)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
