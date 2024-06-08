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
 * The DB meta of SqlPalletDtlFractionPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPalletDtlFractionPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPalletDtlFractionPrintDbm _instance = new SqlPalletDtlFractionPrintDbm();
    private SqlPalletDtlFractionPrintDbm() {}
    public static SqlPalletDtlFractionPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getTrsolistkey(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setTrsolistkey(ctl(vl)), "trsolistkey");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getShipschdate(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getFax1(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getCarriersname(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getRmano(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getOwnersono(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getLot2(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getLot4(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getOtherlot3(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setOtherlot3((String)vl), "otherlot3");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getLot3(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getSopalletno(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getIfitemcd(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getLot1(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getLot4Cnt(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setLot4Cnt(cti(vl)), "lot4Cnt");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getLot1Cnt(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setLot1Cnt(cti(vl)), "lot1Cnt");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getExpectCaseQty(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setExpectCaseQty(ctb(vl)), "expectCaseQty");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getExpectCartonQty(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setExpectCartonQty(ctb(vl)), "expectCartonQty");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getOtherlot3Cnt(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setOtherlot3Cnt(cti(vl)), "otherlot3Cnt");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getCenterAbbr(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getCustomerAbbr(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getProductCd(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getProductAbbr(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getOtherrefno1(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getPrice2(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setPrice2(ctb(vl)), "price2");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getUsernum3(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlPalletDtlFractionPrint)et).getTransportpriority(), (et, vl) -> ((SqlPalletDtlFractionPrint)et).setTransportpriority(ctb(vl)), "transportpriority");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPalletDtlFractionPrint";
    protected final String _tableDispName = "SqlPalletDtlFractionPrint";
    protected final String _tablePropertyName = "sqlPalletDtlFractionPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPalletDtlFractionPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsolistkey = cci("TRSOLISTKEY", "TRSOLISTKEY", null, null, Long.class, "trsolistkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3 = cci("OTHERLOT3", "OTHERLOT3", null, null, String.class, "otherlot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4Cnt = cci("LOT4_CNT", "LOT4_CNT", null, null, Integer.class, "lot4Cnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1Cnt = cci("LOT1_CNT", "LOT1_CNT", null, null, Integer.class, "lot1Cnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectCaseQty = cci("EXPECT_CASE_QTY", "EXPECT_CASE_QTY", null, null, java.math.BigDecimal.class, "expectCaseQty", null, false, false, false, "decimal", 18, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectCartonQty = cci("EXPECT_CARTON_QTY", "EXPECT_CARTON_QTY", null, null, java.math.BigDecimal.class, "expectCartonQty", null, false, false, false, "decimal", 18, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3Cnt = cci("OTHERLOT3_CNT", "OTHERLOT3_CNT", null, null, Integer.class, "otherlot3Cnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice2 = cci("PRICE2", "PRICE2", null, null, java.math.BigDecimal.class, "price2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);

    /**
     * TRSOLISTKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsolistkey() { return _columnTrsolistkey; }
    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
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
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * OTHERLOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot3() { return _columnOtherlot3; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * SOPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * IFITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4Cnt() { return _columnLot4Cnt; }
    /**
     * LOT1_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1Cnt() { return _columnLot1Cnt; }
    /**
     * EXPECT_CASE_QTY: {decimal(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectCaseQty() { return _columnExpectCaseQty; }
    /**
     * EXPECT_CARTON_QTY: {decimal(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectCartonQty() { return _columnExpectCartonQty; }
    /**
     * OTHERLOT3_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot3Cnt() { return _columnOtherlot3Cnt; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * CUSTOMER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerAbbr() { return _columnCustomerAbbr; }
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
     * OTHERREFNO1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * PRICE2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice2() { return _columnPrice2; }
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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrsolistkey());
        ls.add(columnShipschdate());
        ls.add(columnFax1());
        ls.add(columnCarriersname());
        ls.add(columnRmano());
        ls.add(columnOwnersono());
        ls.add(columnLot2());
        ls.add(columnLot4());
        ls.add(columnOtherlot3());
        ls.add(columnLot3());
        ls.add(columnSopalletno());
        ls.add(columnIfitemcd());
        ls.add(columnLot1());
        ls.add(columnLot4Cnt());
        ls.add(columnLot1Cnt());
        ls.add(columnExpectCaseQty());
        ls.add(columnExpectCartonQty());
        ls.add(columnOtherlot3Cnt());
        ls.add(columnCenterAbbr());
        ls.add(columnCustomerAbbr());
        ls.add(columnProductCd());
        ls.add(columnProductAbbr());
        ls.add(columnOtherrefno1());
        ls.add(columnPrice2());
        ls.add(columnUsernum3());
        ls.add(columnTransportpriority());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPalletDtlFractionPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPalletDtlFractionPrint> getEntityType() { return SqlPalletDtlFractionPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPalletDtlFractionPrint newEntity() { return new SqlPalletDtlFractionPrint(); }
    public SqlPalletDtlFractionPrint newMyEntity() { return new SqlPalletDtlFractionPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPalletDtlFractionPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPalletDtlFractionPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
