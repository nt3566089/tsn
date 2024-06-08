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
 * The DB meta of SqlMatchingUintnumList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlMatchingUintnumListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlMatchingUintnumListDbm _instance = new SqlMatchingUintnumListDbm();
    private SqlMatchingUintnumListDbm() {}
    public static SqlMatchingUintnumListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlMatchingUintnumList)et).getMatchingKeyword(), (et, vl) -> ((SqlMatchingUintnumList)et).setMatchingKeyword((String)vl), "matchingKeyword");
        setupEpg(_epgMap, et -> ((SqlMatchingUintnumList)et).getUnitNum(), (et, vl) -> ((SqlMatchingUintnumList)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((SqlMatchingUintnumList)et).getGrossWeight(), (et, vl) -> ((SqlMatchingUintnumList)et).setGrossWeight(ctb(vl)), "grossWeight");
        setupEpg(_epgMap, et -> ((SqlMatchingUintnumList)et).getShapeSort(), (et, vl) -> ((SqlMatchingUintnumList)et).setShapeSort(ctl(vl)), "shapeSort");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlMatchingUintnumList";
    protected final String _tableDispName = "SqlMatchingUintnumList";
    protected final String _tablePropertyName = "sqlMatchingUintnumList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlMatchingUintnumList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMatchingKeyword = cci("MATCHING_KEYWORD", "MATCHING_KEYWORD", null, null, String.class, "matchingKeyword", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "grossWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeSort = cci("SHAPE_SORT", "SHAPE_SORT", null, null, Long.class, "shapeSort", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * MATCHING_KEYWORD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMatchingKeyword() { return _columnMatchingKeyword; }
    /**
     * UNIT_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * SHAPE_SORT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeSort() { return _columnShapeSort; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMatchingKeyword());
        ls.add(columnUnitNum());
        ls.add(columnGrossWeight());
        ls.add(columnShapeSort());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlMatchingUintnumList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlMatchingUintnumList> getEntityType() { return SqlMatchingUintnumList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlMatchingUintnumList newEntity() { return new SqlMatchingUintnumList(); }
    public SqlMatchingUintnumList newMyEntity() { return new SqlMatchingUintnumList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlMatchingUintnumList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlMatchingUintnumList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
