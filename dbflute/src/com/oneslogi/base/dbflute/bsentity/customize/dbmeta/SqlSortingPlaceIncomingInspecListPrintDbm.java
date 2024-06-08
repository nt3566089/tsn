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
 * The DB meta of SqlSortingPlaceIncomingInspecListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlSortingPlaceIncomingInspecListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlSortingPlaceIncomingInspecListPrintDbm _instance = new SqlSortingPlaceIncomingInspecListPrintDbm();
    private SqlSortingPlaceIncomingInspecListPrintDbm() {}
    public static SqlSortingPlaceIncomingInspecListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getCenterCd(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getWorkallocateid(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getOtherlot1(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getLot1(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getLot2(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getLot3(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getLot4(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getFloor(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getProductCd(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getClientNm(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getListkbn(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getPickCaseQty(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setPickCaseQty(ctb(vl)), "pickCaseQty");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getPickCartonQty(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setPickCartonQty(ctb(vl)), "pickCartonQty");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getCaseExpectQty(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setCaseExpectQty(ctb(vl)), "caseExpectQty");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getCartonExpectQty(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setCartonExpectQty(ctb(vl)), "cartonExpectQty");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getPalletExpectQty(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setPalletExpectQty(ctb(vl)), "palletExpectQty");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getMinShipschdate(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setMinShipschdate((String)vl), "minShipschdate");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getMaxShipschdate(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setMaxShipschdate((String)vl), "maxShipschdate");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getCenterAbbr(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getProductAbbr(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getUsernum3(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getOthercd3(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setOthercd3((String)vl), "othercd3");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getUserCd(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlSortingPlaceIncomingInspecListPrint)et).getUserNm(), (et, vl) -> ((SqlSortingPlaceIncomingInspecListPrint)et).setUserNm((String)vl), "userNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlSortingPlaceIncomingInspecListPrint";
    protected final String _tableDispName = "SqlSortingPlaceIncomingInspecListPrint";
    protected final String _tablePropertyName = "sqlSortingPlaceIncomingInspecListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlSortingPlaceIncomingInspecListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickCaseQty = cci("PICK_CASE_QTY", "PICK_CASE_QTY", null, null, java.math.BigDecimal.class, "pickCaseQty", null, false, false, false, "decimal", 37, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickCartonQty = cci("PICK_CARTON_QTY", "PICK_CARTON_QTY", null, null, java.math.BigDecimal.class, "pickCartonQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseExpectQty = cci("CASE_EXPECT_QTY", "CASE_EXPECT_QTY", null, null, java.math.BigDecimal.class, "caseExpectQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCartonExpectQty = cci("CARTON_EXPECT_QTY", "CARTON_EXPECT_QTY", null, null, java.math.BigDecimal.class, "cartonExpectQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletExpectQty = cci("PALLET_EXPECT_QTY", "PALLET_EXPECT_QTY", null, null, java.math.BigDecimal.class, "palletExpectQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinShipschdate = cci("MIN_SHIPSCHDATE", "MIN_SHIPSCHDATE", null, null, String.class, "minShipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxShipschdate = cci("MAX_SHIPSCHDATE", "MAX_SHIPSCHDATE", null, null, String.class, "maxShipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd3 = cci("OTHERCD3", "OTHERCD3", null, null, String.class, "othercd3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * WORKALLOCATEID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * FLOOR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * CLIENT_NM: {varchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * LISTKBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * PICK_CASE_QTY: {decimal(37, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickCaseQty() { return _columnPickCaseQty; }
    /**
     * PICK_CARTON_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickCartonQty() { return _columnPickCartonQty; }
    /**
     * CASE_EXPECT_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseExpectQty() { return _columnCaseExpectQty; }
    /**
     * CARTON_EXPECT_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCartonExpectQty() { return _columnCartonExpectQty; }
    /**
     * PALLET_EXPECT_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletExpectQty() { return _columnPalletExpectQty; }
    /**
     * MIN_SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinShipschdate() { return _columnMinShipschdate; }
    /**
     * MAX_SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxShipschdate() { return _columnMaxShipschdate; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
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
     * OTHERCD3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOthercd3() { return _columnOthercd3; }
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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCenterCd());
        ls.add(columnWorkallocateid());
        ls.add(columnOtherlot1());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnFloor());
        ls.add(columnProductCd());
        ls.add(columnClientNm());
        ls.add(columnListkbn());
        ls.add(columnPickCaseQty());
        ls.add(columnPickCartonQty());
        ls.add(columnCaseExpectQty());
        ls.add(columnCartonExpectQty());
        ls.add(columnPalletExpectQty());
        ls.add(columnMinShipschdate());
        ls.add(columnMaxShipschdate());
        ls.add(columnCenterAbbr());
        ls.add(columnProductAbbr());
        ls.add(columnUsernum3());
        ls.add(columnOthercd3());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceIncomingInspecListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlSortingPlaceIncomingInspecListPrint> getEntityType() { return SqlSortingPlaceIncomingInspecListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlSortingPlaceIncomingInspecListPrint newEntity() { return new SqlSortingPlaceIncomingInspecListPrint(); }
    public SqlSortingPlaceIncomingInspecListPrint newMyEntity() { return new SqlSortingPlaceIncomingInspecListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlSortingPlaceIncomingInspecListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlSortingPlaceIncomingInspecListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
