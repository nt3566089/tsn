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
 * The DB meta of SqlInventoryHCorrectList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryHCorrectListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryHCorrectListDbm _instance = new SqlInventoryHCorrectListDbm();
    private SqlInventoryHCorrectListDbm() {}
    public static SqlInventoryHCorrectListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getInventoryHId(), (et, vl) -> ((SqlInventoryHCorrectList)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getTrcaseinventoryId(), (et, vl) -> ((SqlInventoryHCorrectList)et).setTrcaseinventoryId(ctl(vl)), "trcaseinventoryId");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getVersionNoCase(), (et, vl) -> ((SqlInventoryHCorrectList)et).setVersionNoCase(ctl(vl)), "versionNoCase");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getTrinvcorrectId(), (et, vl) -> ((SqlInventoryHCorrectList)et).setTrinvcorrectId(ctl(vl)), "trinvcorrectId");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getPutdmycasecd(), (et, vl) -> ((SqlInventoryHCorrectList)et).setPutdmycasecd(ctb(vl)), "putdmycasecd");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getPutdmycutcasecd(), (et, vl) -> ((SqlInventoryHCorrectList)et).setPutdmycutcasecd(ctb(vl)), "putdmycutcasecd");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getPutdmycasedetailno(), (et, vl) -> ((SqlInventoryHCorrectList)et).setPutdmycasedetailno(ctl(vl)), "putdmycasedetailno");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getPutdmydirectionno(), (et, vl) -> ((SqlInventoryHCorrectList)et).setPutdmydirectionno(ctl(vl)), "putdmydirectionno");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getPutdmydirectionordergno(), (et, vl) -> ((SqlInventoryHCorrectList)et).setPutdmydirectionordergno(ctl(vl)), "putdmydirectionordergno");
        setupEpg(_epgMap, et -> ((SqlInventoryHCorrectList)et).getVersionNoCorrect(), (et, vl) -> ((SqlInventoryHCorrectList)et).setVersionNoCorrect(ctl(vl)), "versionNoCorrect");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryHCorrectList";
    protected final String _tableDispName = "SqlInventoryHCorrectList";
    protected final String _tablePropertyName = "sqlInventoryHCorrectList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryHCorrectList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrcaseinventoryId = cci("TRCASEINVENTORY_ID", "TRCASEINVENTORY_ID", null, null, Long.class, "trcaseinventoryId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNoCase = cci("VERSION_NO_CASE", "VERSION_NO_CASE", null, null, Long.class, "versionNoCase", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrinvcorrectId = cci("TRINVCORRECT_ID", "TRINVCORRECT_ID", null, null, Long.class, "trinvcorrectId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmycasecd = cci("PUTDMYCASECD", "PUTDMYCASECD", null, null, java.math.BigDecimal.class, "putdmycasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmycutcasecd = cci("PUTDMYCUTCASECD", "PUTDMYCUTCASECD", null, null, java.math.BigDecimal.class, "putdmycutcasecd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmycasedetailno = cci("PUTDMYCASEDETAILNO", "PUTDMYCASEDETAILNO", null, null, Long.class, "putdmycasedetailno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmydirectionno = cci("PUTDMYDIRECTIONNO", "PUTDMYDIRECTIONNO", null, null, Long.class, "putdmydirectionno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPutdmydirectionordergno = cci("PUTDMYDIRECTIONORDERGNO", "PUTDMYDIRECTIONORDERGNO", null, null, Long.class, "putdmydirectionordergno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNoCorrect = cci("VERSION_NO_CORRECT", "VERSION_NO_CORRECT", null, null, Long.class, "versionNoCorrect", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INVENTORY_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * TRCASEINVENTORY_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrcaseinventoryId() { return _columnTrcaseinventoryId; }
    /**
     * VERSION_NO_CASE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNoCase() { return _columnVersionNoCase; }
    /**
     * TRINVCORRECT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrinvcorrectId() { return _columnTrinvcorrectId; }
    /**
     * PUTDMYCASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmycasecd() { return _columnPutdmycasecd; }
    /**
     * PUTDMYCUTCASECD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmycutcasecd() { return _columnPutdmycutcasecd; }
    /**
     * PUTDMYCASEDETAILNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmycasedetailno() { return _columnPutdmycasedetailno; }
    /**
     * PUTDMYDIRECTIONNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmydirectionno() { return _columnPutdmydirectionno; }
    /**
     * PUTDMYDIRECTIONORDERGNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPutdmydirectionordergno() { return _columnPutdmydirectionordergno; }
    /**
     * VERSION_NO_CORRECT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNoCorrect() { return _columnVersionNoCorrect; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryHId());
        ls.add(columnTrcaseinventoryId());
        ls.add(columnVersionNoCase());
        ls.add(columnTrinvcorrectId());
        ls.add(columnPutdmycasecd());
        ls.add(columnPutdmycutcasecd());
        ls.add(columnPutdmycasedetailno());
        ls.add(columnPutdmydirectionno());
        ls.add(columnPutdmydirectionordergno());
        ls.add(columnVersionNoCorrect());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryHCorrectList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryHCorrectList> getEntityType() { return SqlInventoryHCorrectList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryHCorrectList newEntity() { return new SqlInventoryHCorrectList(); }
    public SqlInventoryHCorrectList newMyEntity() { return new SqlInventoryHCorrectList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryHCorrectList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryHCorrectList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
