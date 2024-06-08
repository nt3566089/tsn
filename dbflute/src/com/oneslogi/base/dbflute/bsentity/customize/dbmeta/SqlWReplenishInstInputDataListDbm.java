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
 * The DB meta of SqlWReplenishInstInputDataList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlWReplenishInstInputDataListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlWReplenishInstInputDataListDbm _instance = new SqlWReplenishInstInputDataListDbm();
    private SqlWReplenishInstInputDataListDbm() {}
    public static SqlWReplenishInstInputDataListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getFlexlnsNo(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setFlexlnsNo((String)vl), "flexlnsNo");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getSchDate(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setSchDate((String)vl), "schDate");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getSupplierCd(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getRcvDate(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setRcvDate((String)vl), "rcvDate");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getShipCd(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setShipCd((String)vl), "shipCd");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getItemCd(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setItemCd((String)vl), "itemCd");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getManufactureDate(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getDesignCd(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setDesignCd((String)vl), "designCd");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getQty(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getFlexUpdUserCd(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setFlexUpdUserCd((String)vl), "flexUpdUserCd");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getReplenishInstInputId(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setReplenishInstInputId(ctl(vl)), "replenishInstInputId");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getVersionNo(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getOthercd1(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setOthercd1((String)vl), "othercd1");
        setupEpg(_epgMap, et -> ((SqlWReplenishInstInputDataList)et).getOthercd2(), (et, vl) -> ((SqlWReplenishInstInputDataList)et).setOthercd2((String)vl), "othercd2");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlWReplenishInstInputDataList";
    protected final String _tableDispName = "SqlWReplenishInstInputDataList";
    protected final String _tablePropertyName = "sqlWReplenishInstInputDataList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlWReplenishInstInputDataList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFlexlnsNo = cci("FLEXLNS_NO", "FLEXLNS_NO", null, null, String.class, "flexlnsNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchDate = cci("SCH_DATE", "SCH_DATE", null, null, String.class, "schDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvDate = cci("RCV_DATE", "RCV_DATE", null, null, String.class, "rcvDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCd = cci("SHIP_CD", "SHIP_CD", null, null, String.class, "shipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCd = cci("ITEM_CD", "ITEM_CD", null, null, String.class, "itemCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCd = cci("DESIGN_CD", "DESIGN_CD", null, null, String.class, "designCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexUpdUserCd = cci("FLEX_UPD_USER_CD", "FLEX_UPD_USER_CD", null, null, String.class, "flexUpdUserCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishInstInputId = cci("REPLENISH_INST_INPUT_ID", "REPLENISH_INST_INPUT_ID", null, null, Long.class, "replenishInstInputId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd1 = cci("OTHERCD1", "OTHERCD1", null, null, String.class, "othercd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd2 = cci("OTHERCD2", "OTHERCD2", null, null, String.class, "othercd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * FLEXLNS_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexlnsNo() { return _columnFlexlnsNo; }
    /**
     * SCH_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchDate() { return _columnSchDate; }
    /**
     * SUPPLIER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * RCV_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvDate() { return _columnRcvDate; }
    /**
     * SHIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCd() { return _columnShipCd; }
    /**
     * ITEM_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCd() { return _columnItemCd; }
    /**
     * MANUFACTURE_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * DESIGN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCd() { return _columnDesignCd; }
    /**
     * QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * FLEX_UPD_USER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexUpdUserCd() { return _columnFlexUpdUserCd; }
    /**
     * REPLENISH_INST_INPUT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishInstInputId() { return _columnReplenishInstInputId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * OTHERCD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd1() { return _columnOthercd1; }
    /**
     * OTHERCD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd2() { return _columnOthercd2; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFlexlnsNo());
        ls.add(columnSchDate());
        ls.add(columnSupplierCd());
        ls.add(columnRcvDate());
        ls.add(columnShipCd());
        ls.add(columnItemCd());
        ls.add(columnManufactureDate());
        ls.add(columnDesignCd());
        ls.add(columnQty());
        ls.add(columnFlexUpdUserCd());
        ls.add(columnReplenishInstInputId());
        ls.add(columnVersionNo());
        ls.add(columnOthercd1());
        ls.add(columnOthercd2());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlWReplenishInstInputDataList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlWReplenishInstInputDataList> getEntityType() { return SqlWReplenishInstInputDataList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlWReplenishInstInputDataList newEntity() { return new SqlWReplenishInstInputDataList(); }
    public SqlWReplenishInstInputDataList newMyEntity() { return new SqlWReplenishInstInputDataList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlWReplenishInstInputDataList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlWReplenishInstInputDataList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
