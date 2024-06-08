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
 * The DB meta of SqlStockCheck. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlStockCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlStockCheckDbm _instance = new SqlStockCheckDbm();
    private SqlStockCheckDbm() {}
    public static SqlStockCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getProductCd(), (et, vl) -> ((SqlStockCheck)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getStockqty(), (et, vl) -> ((SqlStockCheck)et).setStockqty(ctl(vl)), "stockqty");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getAddDt(), (et, vl) -> ((SqlStockCheck)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getSname(), (et, vl) -> ((SqlStockCheck)et).setSname((String)vl), "sname");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getUsernum3(), (et, vl) -> ((SqlStockCheck)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getUnit1(), (et, vl) -> ((SqlStockCheck)et).setUnit1(ctb(vl)), "unit1");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getUnit2(), (et, vl) -> ((SqlStockCheck)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getChargeNum(), (et, vl) -> ((SqlStockCheck)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getInventoryNum(), (et, vl) -> ((SqlStockCheck)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getInventoryKey(), (et, vl) -> ((SqlStockCheck)et).setInventoryKey(ctl(vl)), "inventoryKey");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getCenterCd(), (et, vl) -> ((SqlStockCheck)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getCenterNm(), (et, vl) -> ((SqlStockCheck)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getClientCd(), (et, vl) -> ((SqlStockCheck)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlStockCheck)et).getClientNm(), (et, vl) -> ((SqlStockCheck)et).setClientNm((String)vl), "clientNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlStockCheck";
    protected final String _tableDispName = "SqlStockCheck";
    protected final String _tablePropertyName = "sqlStockCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlStockCheck", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockqty = cci("STOCKQTY", "STOCKQTY", null, null, Long.class, "stockqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSname = cci("SNAME", "SNAME", null, null, String.class, "sname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, java.math.BigDecimal.class, "unit1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKey = cci("INVENTORY_KEY", "INVENTORY_KEY", null, null, Long.class, "inventoryKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * STOCKQTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockqty() { return _columnStockqty; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * SNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSname() { return _columnSname; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * UNIT1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * CHARGE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * INVENTORY_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * INVENTORY_KEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKey() { return _columnInventoryKey; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCd());
        ls.add(columnStockqty());
        ls.add(columnAddDt());
        ls.add(columnSname());
        ls.add(columnUsernum3());
        ls.add(columnUnit1());
        ls.add(columnUnit2());
        ls.add(columnChargeNum());
        ls.add(columnInventoryNum());
        ls.add(columnInventoryKey());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlStockCheck"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlStockCheck> getEntityType() { return SqlStockCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlStockCheck newEntity() { return new SqlStockCheck(); }
    public SqlStockCheck newMyEntity() { return new SqlStockCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlStockCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlStockCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
