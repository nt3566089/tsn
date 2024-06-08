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
 * The DB meta of SqlBillOfLadingPrintSubReport. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlBillOfLadingPrintSubReportDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlBillOfLadingPrintSubReportDbm _instance = new SqlBillOfLadingPrintSubReportDbm();
    private SqlBillOfLadingPrintSubReportDbm() {}
    public static SqlBillOfLadingPrintSubReportDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSubReport)et).getInstNum2(), (et, vl) -> ((SqlBillOfLadingPrintSubReport)et).setInstNum2(ctl(vl)), "instNum2");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSubReport)et).getType(), (et, vl) -> ((SqlBillOfLadingPrintSubReport)et).setType((String)vl), "type");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSubReport)et).getWeight(), (et, vl) -> ((SqlBillOfLadingPrintSubReport)et).setWeight(ctb(vl)), "weight");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSubReport)et).getProductAbbr(), (et, vl) -> ((SqlBillOfLadingPrintSubReport)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSubReport)et).getNmfcCode(), (et, vl) -> ((SqlBillOfLadingPrintSubReport)et).setNmfcCode((String)vl), "nmfcCode");
        setupEpg(_epgMap, et -> ((SqlBillOfLadingPrintSubReport)et).getFreightCls(), (et, vl) -> ((SqlBillOfLadingPrintSubReport)et).setFreightCls((String)vl), "freightCls");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlBillOfLadingPrintSubReport";
    protected final String _tableDispName = "SqlBillOfLadingPrintSubReport";
    protected final String _tablePropertyName = "sqlBillOfLadingPrintSubReport";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlBillOfLadingPrintSubReport", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInstNum2 = cci("INST_NUM2", "INST_NUM2", null, null, Long.class, "instNum2", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnType = cci("TYPE", "TYPE", null, null, String.class, "type", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeight = cci("WEIGHT", "WEIGHT", null, null, java.math.BigDecimal.class, "weight", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmfcCode = cci("NMFC_CODE", "NMFC_CODE", null, null, String.class, "nmfcCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightCls = cci("FREIGHT_CLS", "FREIGHT_CLS", null, null, String.class, "freightCls", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INST_NUM2: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum2() { return _columnInstNum2; }
    /**
     * TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnType() { return _columnType; }
    /**
     * WEIGHT: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeight() { return _columnWeight; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * NMFC_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmfcCode() { return _columnNmfcCode; }
    /**
     * FREIGHT_CLS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightCls() { return _columnFreightCls; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInstNum2());
        ls.add(columnType());
        ls.add(columnWeight());
        ls.add(columnProductAbbr());
        ls.add(columnNmfcCode());
        ls.add(columnFreightCls());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSubReport"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlBillOfLadingPrintSubReport> getEntityType() { return SqlBillOfLadingPrintSubReport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlBillOfLadingPrintSubReport newEntity() { return new SqlBillOfLadingPrintSubReport(); }
    public SqlBillOfLadingPrintSubReport newMyEntity() { return new SqlBillOfLadingPrintSubReport(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlBillOfLadingPrintSubReport)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlBillOfLadingPrintSubReport)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
