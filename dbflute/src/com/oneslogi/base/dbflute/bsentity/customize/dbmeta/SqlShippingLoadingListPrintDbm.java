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
 * The DB meta of SqlShippingLoadingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingLoadingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingLoadingListPrintDbm _instance = new SqlShippingLoadingListPrintDbm();
    private SqlShippingLoadingListPrintDbm() {}
    public static SqlShippingLoadingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getShipschdate(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getTrsolistkey(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setTrsolistkey(ctl(vl)), "trsolistkey");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getCenterCd(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getOwnersono(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getPhoneno(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setPhoneno((String)vl), "phoneno");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getShiptocd(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getDelivname(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setDelivname((String)vl), "delivname");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getCustomerCd(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getRmano(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getOtherrefno1(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getOrdertype(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getFax1(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getPrice2(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setPrice2(ctb(vl)), "price2");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getNotes(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getProductCd(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getLot3(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getLot1(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getLot4(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getExpectqty1(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setExpectqty1(ctb(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getExpectqty2(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setExpectqty2(ctb(vl)), "expectqty2");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getCenterAbbr(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getCustomerAbbr(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getProductAbbr(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getUsernum3(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getUserCd(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getUserNm(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getOtherrefno1Nm(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setOtherrefno1Nm((String)vl), "otherrefno1Nm");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getOrdertypeNm(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setOrdertypeNm((String)vl), "ordertypeNm");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getOtherlot2Cnt(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setOtherlot2Cnt(cti(vl)), "otherlot2Cnt");
        setupEpg(_epgMap, et -> ((SqlShippingLoadingListPrint)et).getTransportpriority(), (et, vl) -> ((SqlShippingLoadingListPrint)et).setTransportpriority(ctb(vl)), "transportpriority");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingLoadingListPrint";
    protected final String _tableDispName = "SqlShippingLoadingListPrint";
    protected final String _tablePropertyName = "sqlShippingLoadingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingLoadingListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsolistkey = cci("TRSOLISTKEY", "TRSOLISTKEY", null, null, Long.class, "trsolistkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneno = cci("PHONENO", "PHONENO", null, null, String.class, "phoneno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivname = cci("DELIVNAME", "DELIVNAME", null, null, String.class, "delivname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice2 = cci("PRICE2", "PRICE2", null, null, java.math.BigDecimal.class, "price2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, java.math.BigDecimal.class, "expectqty1", null, false, false, false, "decimal", 18, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty2 = cci("EXPECTQTY2", "EXPECTQTY2", null, null, java.math.BigDecimal.class, "expectqty2", null, false, false, false, "decimal", 18, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1Nm = cci("OTHERREFNO1_NM", "OTHERREFNO1_NM", null, null, String.class, "otherrefno1Nm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertypeNm = cci("ORDERTYPE_NM", "ORDERTYPE_NM", null, null, String.class, "ordertypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot2Cnt = cci("OTHERLOT2_CNT", "OTHERLOT2_CNT", null, null, Integer.class, "otherlot2Cnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);

    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * TRSOLISTKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsolistkey() { return _columnTrsolistkey; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * PHONENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneno() { return _columnPhoneno; }
    /**
     * SHIPTOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * DELIVNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivname() { return _columnDelivname; }
    /**
     * CUSTOMER_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * OTHERREFNO1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * ORDERTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * FAX1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * PRICE2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice2() { return _columnPrice2; }
    /**
     * NOTES: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * EXPECTQTY1: {decimal(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * EXPECTQTY2: {decimal(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty2() { return _columnExpectqty2; }
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
     * USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * OTHERREFNO1_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1Nm() { return _columnOtherrefno1Nm; }
    /**
     * ORDERTYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertypeNm() { return _columnOrdertypeNm; }
    /**
     * OTHERLOT2_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot2Cnt() { return _columnOtherlot2Cnt; }
    /**
     * TRANSPORTPRIORITY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportpriority() { return _columnTransportpriority; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnShipschdate());
        ls.add(columnTrsolistkey());
        ls.add(columnCenterCd());
        ls.add(columnOwnersono());
        ls.add(columnPhoneno());
        ls.add(columnShiptocd());
        ls.add(columnDelivname());
        ls.add(columnCustomerCd());
        ls.add(columnRmano());
        ls.add(columnOtherrefno1());
        ls.add(columnOrdertype());
        ls.add(columnFax1());
        ls.add(columnPrice2());
        ls.add(columnNotes());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnExpectqty1());
        ls.add(columnExpectqty2());
        ls.add(columnCenterAbbr());
        ls.add(columnCustomerAbbr());
        ls.add(columnProductAbbr());
        ls.add(columnUsernum3());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
        ls.add(columnOtherrefno1Nm());
        ls.add(columnOrdertypeNm());
        ls.add(columnOtherlot2Cnt());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingLoadingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingLoadingListPrint> getEntityType() { return SqlShippingLoadingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingLoadingListPrint newEntity() { return new SqlShippingLoadingListPrint(); }
    public SqlShippingLoadingListPrint newMyEntity() { return new SqlShippingLoadingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingLoadingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingLoadingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
