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
 * The DB meta of SqlShippingPalleteInfoList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingPalleteInfoListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingPalleteInfoListDbm _instance = new SqlShippingPalleteInfoListDbm();
    private SqlShippingPalleteInfoListDbm() {}
    public static SqlShippingPalleteInfoListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getSts(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setSts((String)vl), "sts");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getSopalletno(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getShipschdate(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getOwnerorderno(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setOwnerorderno((String)vl), "ownerorderno");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getOrdertype(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getCustorderno(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getRmano(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getOwnersono(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getShipdate(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setShipdate((String)vl), "shipdate");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getExpectQty1Style1(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setExpectQty1Style1(ctb(vl)), "expectQty1Style1");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getExpectQty1Style2(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setExpectQty1Style2(ctb(vl)), "expectQty1Style2");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getShiptocd(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getShiptoname(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setShiptoname((String)vl), "shiptoname");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getOtherrefno1(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getPalletkey(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setPalletkey((String)vl), "palletkey");
        setupEpg(_epgMap, et -> ((SqlShippingPalleteInfoList)et).getSoid(), (et, vl) -> ((SqlShippingPalleteInfoList)et).setSoid(ctl(vl)), "soid");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingPalleteInfoList";
    protected final String _tableDispName = "SqlShippingPalleteInfoList";
    protected final String _tablePropertyName = "sqlShippingPalleteInfoList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingPalleteInfoList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, String.class, "sts", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderno = cci("OWNERORDERNO", "OWNERORDERNO", null, null, String.class, "ownerorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipdate = cci("SHIPDATE", "SHIPDATE", null, null, String.class, "shipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQty1Style1 = cci("ExpectQty1Style1", "ExpectQty1Style1", null, null, java.math.BigDecimal.class, "expectQty1Style1", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQty1Style2 = cci("ExpectQty1Style2", "ExpectQty1Style2", null, null, java.math.BigDecimal.class, "expectQty1Style2", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoname = cci("SHIPTONAME", "SHIPTONAME", null, null, String.class, "shiptoname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletkey = cci("PALLETKEY", "PALLETKEY", null, null, String.class, "palletkey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * STS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * SOPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * OWNERORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderno() { return _columnOwnerorderno; }
    /**
     * ORDERTYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * CUSTORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * SHIPDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipdate() { return _columnShipdate; }
    /**
     * ExpectQty1Style1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQty1Style1() { return _columnExpectQty1Style1; }
    /**
     * ExpectQty1Style2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQty1Style2() { return _columnExpectQty1Style2; }
    /**
     * SHIPTOCD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * SHIPTONAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoname() { return _columnShiptoname; }
    /**
     * OTHERREFNO1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * PALLETKEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletkey() { return _columnPalletkey; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSts());
        ls.add(columnSopalletno());
        ls.add(columnShipschdate());
        ls.add(columnOwnerorderno());
        ls.add(columnOrdertype());
        ls.add(columnCustorderno());
        ls.add(columnRmano());
        ls.add(columnOwnersono());
        ls.add(columnShipdate());
        ls.add(columnExpectQty1Style1());
        ls.add(columnExpectQty1Style2());
        ls.add(columnShiptocd());
        ls.add(columnShiptoname());
        ls.add(columnOtherrefno1());
        ls.add(columnPalletkey());
        ls.add(columnSoid());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingPalleteInfoList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingPalleteInfoList> getEntityType() { return SqlShippingPalleteInfoList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingPalleteInfoList newEntity() { return new SqlShippingPalleteInfoList(); }
    public SqlShippingPalleteInfoList newMyEntity() { return new SqlShippingPalleteInfoList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingPalleteInfoList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingPalleteInfoList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
