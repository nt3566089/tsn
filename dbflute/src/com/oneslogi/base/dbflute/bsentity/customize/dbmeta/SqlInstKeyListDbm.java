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
 * The DB meta of SqlInstKeyList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInstKeyListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInstKeyListDbm _instance = new SqlInstKeyListDbm();
    private SqlInstKeyListDbm() {}
    public static SqlInstKeyListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getInventoryInstKbn(), (et, vl) -> ((SqlInstKeyList)et).setInventoryInstKbn((String)vl), "inventoryInstKbn");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getInventoryKey(), (et, vl) -> ((SqlInstKeyList)et).setInventoryKey(ctl(vl)), "inventoryKey");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getInventoryDt(), (et, vl) -> ((SqlInstKeyList)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getProductDivision(), (et, vl) -> ((SqlInstKeyList)et).setProductDivision((String)vl), "productDivision");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getLineBlock(), (et, vl) -> ((SqlInstKeyList)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getDirectionalPiston(), (et, vl) -> ((SqlInstKeyList)et).setDirectionalPiston((String)vl), "directionalPiston");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getLocationGrp(), (et, vl) -> ((SqlInstKeyList)et).setLocationGrp((String)vl), "locationGrp");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getLocationCd(), (et, vl) -> ((SqlInstKeyList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getFromLocationCd(), (et, vl) -> ((SqlInstKeyList)et).setFromLocationCd((String)vl), "fromLocationCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getToLocationCd(), (et, vl) -> ((SqlInstKeyList)et).setToLocationCd((String)vl), "toLocationCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getProductCd(), (et, vl) -> ((SqlInstKeyList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getProductNm(), (et, vl) -> ((SqlInstKeyList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getInventoryInstKbnNm(), (et, vl) -> ((SqlInstKeyList)et).setInventoryInstKbnNm((String)vl), "inventoryInstKbnNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getProductDivisionNm(), (et, vl) -> ((SqlInstKeyList)et).setProductDivisionNm((String)vl), "productDivisionNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getLocationGrpNm(), (et, vl) -> ((SqlInstKeyList)et).setLocationGrpNm((String)vl), "locationGrpNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getClientCd(), (et, vl) -> ((SqlInstKeyList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getClientNm(), (et, vl) -> ((SqlInstKeyList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getCenterCd(), (et, vl) -> ((SqlInstKeyList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInstKeyList)et).getCenterNm(), (et, vl) -> ((SqlInstKeyList)et).setCenterNm((String)vl), "centerNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInstKeyList";
    protected final String _tableDispName = "SqlInstKeyList";
    protected final String _tablePropertyName = "sqlInstKeyList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInstKeyList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryInstKbn = cci("INVENTORY_INST_KBN", "INVENTORY_INST_KBN", null, null, String.class, "inventoryInstKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKey = cci("INVENTORY_KEY", "INVENTORY_KEY", null, null, Long.class, "inventoryKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductDivision = cci("PRODUCT_DIVISION", "PRODUCT_DIVISION", null, null, String.class, "productDivision", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionalPiston = cci("DIRECTIONAL_PISTON", "DIRECTIONAL_PISTON", null, null, String.class, "directionalPiston", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationGrp = cci("LOCATION_GRP", "LOCATION_GRP", null, null, String.class, "locationGrp", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromLocationCd = cci("FROM_LOCATION_CD", "FROM_LOCATION_CD", null, null, String.class, "fromLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToLocationCd = cci("TO_LOCATION_CD", "TO_LOCATION_CD", null, null, String.class, "toLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryInstKbnNm = cci("INVENTORY_INST_KBN_NM", "INVENTORY_INST_KBN_NM", null, null, String.class, "inventoryInstKbnNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductDivisionNm = cci("PRODUCT_DIVISION_NM", "PRODUCT_DIVISION_NM", null, null, String.class, "productDivisionNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationGrpNm = cci("LOCATION_GRP_NM", "LOCATION_GRP_NM", null, null, String.class, "locationGrpNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INVENTORY_INST_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstKbn() { return _columnInventoryInstKbn; }
    /**
     * INVENTORY_KEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKey() { return _columnInventoryKey; }
    /**
     * INVENTORY_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * PRODUCT_DIVISION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductDivision() { return _columnProductDivision; }
    /**
     * LINE_BLOCK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionalPiston() { return _columnDirectionalPiston; }
    /**
     * LOCATION_GRP: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationGrp() { return _columnLocationGrp; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * FROM_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromLocationCd() { return _columnFromLocationCd; }
    /**
     * TO_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToLocationCd() { return _columnToLocationCd; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * INVENTORY_INST_KBN_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstKbnNm() { return _columnInventoryInstKbnNm; }
    /**
     * PRODUCT_DIVISION_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductDivisionNm() { return _columnProductDivisionNm; }
    /**
     * LOCATION_GRP_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationGrpNm() { return _columnLocationGrpNm; }
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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryInstKbn());
        ls.add(columnInventoryKey());
        ls.add(columnInventoryDt());
        ls.add(columnProductDivision());
        ls.add(columnLineBlock());
        ls.add(columnDirectionalPiston());
        ls.add(columnLocationGrp());
        ls.add(columnLocationCd());
        ls.add(columnFromLocationCd());
        ls.add(columnToLocationCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnInventoryInstKbnNm());
        ls.add(columnProductDivisionNm());
        ls.add(columnLocationGrpNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInstKeyList> getEntityType() { return SqlInstKeyList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInstKeyList newEntity() { return new SqlInstKeyList(); }
    public SqlInstKeyList newMyEntity() { return new SqlInstKeyList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInstKeyList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInstKeyList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
