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
 * The DB meta of SqlInventoryBInventoryCreateList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryBInventoryCreateListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryBInventoryCreateListDbm _instance = new SqlInventoryBInventoryCreateListDbm();
    private SqlInventoryBInventoryCreateListDbm() {}
    public static SqlInventoryBInventoryCreateListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getInventoryBId(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getInventoryKey(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setInventoryKey((String)vl), "inventoryKey");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getInventoryDt(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getProductCd(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getLocationCd(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getManufactureDate(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getTrmanufacturedatedetailId(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setTrmanufacturedatedetailId(ctl(vl)), "trmanufacturedatedetailId");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getCenterId(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getClientId(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getCenterCd(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getOwnerCd(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setOwnerCd((String)vl), "ownerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getInventoryKbn(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setInventoryKbn((String)vl), "inventoryKbn");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getLineBlock(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getInventoryDate(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setInventoryDate((String)vl), "inventoryDate");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getBfManufactureDate(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setBfManufactureDate((String)vl), "bfManufactureDate");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getAfManufactureDate(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setAfManufactureDate((String)vl), "afManufactureDate");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getDesignFlg(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((SqlInventoryBInventoryCreateList)et).getVersionNo(), (et, vl) -> ((SqlInventoryBInventoryCreateList)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryBInventoryCreateList";
    protected final String _tableDispName = "SqlInventoryBInventoryCreateList";
    protected final String _tablePropertyName = "sqlInventoryBInventoryCreateList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryBInventoryCreateList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKey = cci("INVENTORY_KEY", "INVENTORY_KEY", null, null, String.class, "inventoryKey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrmanufacturedatedetailId = cci("TRMANUFACTUREDATEDETAIL_ID", "TRMANUFACTUREDATEDETAIL_ID", null, null, Long.class, "trmanufacturedatedetailId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerCd = cci("OWNER_CD", "OWNER_CD", null, null, String.class, "ownerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryKbn = cci("INVENTORY_KBN", "INVENTORY_KBN", null, null, String.class, "inventoryKbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDate = cci("INVENTORY_DATE", "INVENTORY_DATE", null, null, String.class, "inventoryDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBfManufactureDate = cci("BF_MANUFACTURE_DATE", "BF_MANUFACTURE_DATE", null, null, String.class, "bfManufactureDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAfManufactureDate = cci("AF_MANUFACTURE_DATE", "AF_MANUFACTURE_DATE", null, null, String.class, "afManufactureDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * INVENTORY_B_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * INVENTORY_KEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKey() { return _columnInventoryKey; }
    /**
     * INVENTORY_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * MANUFACTURE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * TRMANUFACTUREDATEDETAIL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrmanufacturedatedetailId() { return _columnTrmanufacturedatedetailId; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * OWNER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerCd() { return _columnOwnerCd; }
    /**
     * INVENTORY_KBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryKbn() { return _columnInventoryKbn; }
    /**
     * LINE_BLOCK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * INVENTORY_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDate() { return _columnInventoryDate; }
    /**
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBfManufactureDate() { return _columnBfManufactureDate; }
    /**
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAfManufactureDate() { return _columnAfManufactureDate; }
    /**
     * DESIGN_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryBId());
        ls.add(columnInventoryKey());
        ls.add(columnInventoryDt());
        ls.add(columnProductCd());
        ls.add(columnLocationCd());
        ls.add(columnManufactureDate());
        ls.add(columnTrmanufacturedatedetailId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnCenterCd());
        ls.add(columnOwnerCd());
        ls.add(columnInventoryKbn());
        ls.add(columnLineBlock());
        ls.add(columnInventoryDate());
        ls.add(columnBfManufactureDate());
        ls.add(columnAfManufactureDate());
        ls.add(columnDesignFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryBInventoryCreateList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryBInventoryCreateList> getEntityType() { return SqlInventoryBInventoryCreateList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryBInventoryCreateList newEntity() { return new SqlInventoryBInventoryCreateList(); }
    public SqlInventoryBInventoryCreateList newMyEntity() { return new SqlInventoryBInventoryCreateList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryBInventoryCreateList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryBInventoryCreateList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
