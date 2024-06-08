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
 * The DB meta of SqlInventoryInspection. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryInspectionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryInspectionDbm _instance = new SqlInventoryInspectionDbm();
    private SqlInventoryInspectionDbm() {}
    public static SqlInventoryInspectionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryInspection)et).getInventoryBodyCount(), (et, vl) -> ((SqlInventoryInspection)et).setInventoryBodyCount(ctl(vl)), "inventoryBodyCount");
        setupEpg(_epgMap, et -> ((SqlInventoryInspection)et).getInspectionNotCompleteCount(), (et, vl) -> ((SqlInventoryInspection)et).setInspectionNotCompleteCount(ctl(vl)), "inspectionNotCompleteCount");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryInspection";
    protected final String _tableDispName = "SqlInventoryInspection";
    protected final String _tablePropertyName = "sqlInventoryInspection";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryInspection", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBodyCount = cci("INVENTORY_BODY_COUNT", "INVENTORY_BODY_COUNT", null, null, Long.class, "inventoryBodyCount", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionNotCompleteCount = cci("INSPECTION_NOT_COMPLETE_COUNT", "INSPECTION_NOT_COMPLETE_COUNT", null, null, Long.class, "inspectionNotCompleteCount", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INVENTORY_BODY_COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBodyCount() { return _columnInventoryBodyCount; }
    /**
     * INSPECTION_NOT_COMPLETE_COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionNotCompleteCount() { return _columnInspectionNotCompleteCount; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryBodyCount());
        ls.add(columnInspectionNotCompleteCount());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryInspection"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryInspection> getEntityType() { return SqlInventoryInspection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryInspection newEntity() { return new SqlInventoryInspection(); }
    public SqlInventoryInspection newMyEntity() { return new SqlInventoryInspection(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryInspection)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryInspection)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
