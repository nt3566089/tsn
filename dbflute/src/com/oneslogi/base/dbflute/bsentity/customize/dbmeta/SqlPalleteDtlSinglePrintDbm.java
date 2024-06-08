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
 * The DB meta of SqlPalleteDtlSinglePrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPalleteDtlSinglePrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPalleteDtlSinglePrintDbm _instance = new SqlPalleteDtlSinglePrintDbm();
    private SqlPalleteDtlSinglePrintDbm() {}
    public static SqlPalleteDtlSinglePrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getTrsolistkey(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setTrsolistkey(ctl(vl)), "trsolistkey");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getWorkallocateid(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getFax1(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getCarriersname(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getShipschdate(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getOwnersono(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getNotes(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getRmano(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getSopalletno(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getStockTypeCd(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getSolineno(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setSolineno(ctl(vl)), "solineno");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getCaseExpectqty1(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setCaseExpectqty1(ctb(vl)), "caseExpectqty1");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getLot1(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getLot4(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getIfitemcd(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getLocationCd(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getLot3(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getLot2(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getCustomerAbbr(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getCenterAbbr(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getProductCd(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getProductAbbr(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getUsernum3(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getTransportpriority(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setTransportpriority(ctb(vl)), "transportpriority");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getOthercd3(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setOthercd3((String)vl), "othercd3");
        setupEpg(_epgMap, et -> ((SqlPalleteDtlSinglePrint)et).getOtherrefno1(), (et, vl) -> ((SqlPalleteDtlSinglePrint)et).setOtherrefno1((String)vl), "otherrefno1");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPalleteDtlSinglePrint";
    protected final String _tableDispName = "SqlPalleteDtlSinglePrint";
    protected final String _tablePropertyName = "sqlPalleteDtlSinglePrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPalleteDtlSinglePrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsolistkey = cci("TRSOLISTKEY", "TRSOLISTKEY", null, null, Long.class, "trsolistkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSolineno = cci("SOLINENO", "SOLINENO", null, null, Long.class, "solineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseExpectqty1 = cci("CASE_EXPECTQTY1", "CASE_EXPECTQTY1", null, null, java.math.BigDecimal.class, "caseExpectqty1", null, false, false, false, "decimal", 18, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd3 = cci("OTHERCD3", "OTHERCD3", null, null, String.class, "othercd3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TRSOLISTKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsolistkey() { return _columnTrsolistkey; }
    /**
     * WORKALLOCATEID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * FAX1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * CARRIERSNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * SOPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * SOLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSolineno() { return _columnSolineno; }
    /**
     * CASE_EXPECTQTY1: {decimal(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseExpectqty1() { return _columnCaseExpectqty1; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * IFITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * CUSTOMER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerAbbr() { return _columnCustomerAbbr; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * TRANSPORTPRIORITY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportpriority() { return _columnTransportpriority; }
    /**
     * OTHERCD3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd3() { return _columnOthercd3; }
    /**
     * OTHERREFNO1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrsolistkey());
        ls.add(columnWorkallocateid());
        ls.add(columnFax1());
        ls.add(columnCarriersname());
        ls.add(columnShipschdate());
        ls.add(columnOwnersono());
        ls.add(columnNotes());
        ls.add(columnRmano());
        ls.add(columnSopalletno());
        ls.add(columnStockTypeCd());
        ls.add(columnSolineno());
        ls.add(columnCaseExpectqty1());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnIfitemcd());
        ls.add(columnLocationCd());
        ls.add(columnLot3());
        ls.add(columnLot2());
        ls.add(columnCustomerAbbr());
        ls.add(columnCenterAbbr());
        ls.add(columnProductCd());
        ls.add(columnProductAbbr());
        ls.add(columnUsernum3());
        ls.add(columnTransportpriority());
        ls.add(columnOthercd3());
        ls.add(columnOtherrefno1());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPalleteDtlSinglePrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPalleteDtlSinglePrint> getEntityType() { return SqlPalleteDtlSinglePrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPalleteDtlSinglePrint newEntity() { return new SqlPalleteDtlSinglePrint(); }
    public SqlPalleteDtlSinglePrint newMyEntity() { return new SqlPalleteDtlSinglePrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPalleteDtlSinglePrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPalleteDtlSinglePrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
