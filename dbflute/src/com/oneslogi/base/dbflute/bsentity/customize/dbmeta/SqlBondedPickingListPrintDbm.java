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
 * The DB meta of SqlBondedPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlBondedPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlBondedPickingListPrintDbm _instance = new SqlBondedPickingListPrintDbm();
    private SqlBondedPickingListPrintDbm() {}
    public static SqlBondedPickingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getFloor(), (et, vl) -> ((SqlBondedPickingListPrint)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getWorkallocateid(), (et, vl) -> ((SqlBondedPickingListPrint)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getLot3(), (et, vl) -> ((SqlBondedPickingListPrint)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getOtherlot1(), (et, vl) -> ((SqlBondedPickingListPrint)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getLot1(), (et, vl) -> ((SqlBondedPickingListPrint)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getLot2(), (et, vl) -> ((SqlBondedPickingListPrint)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getLot4(), (et, vl) -> ((SqlBondedPickingListPrint)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getListkbn(), (et, vl) -> ((SqlBondedPickingListPrint)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getPalletQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setPalletQty(ctb(vl)), "palletQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getCaseQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setCaseQty(ctb(vl)), "caseQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getSortReceivedCaseQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setSortReceivedCaseQty(ctb(vl)), "sortReceivedCaseQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getSortReceivedCartonQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setSortReceivedCartonQty(ctb(vl)), "sortReceivedCartonQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getPickedPalletQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setPickedPalletQty(ctb(vl)), "pickedPalletQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getPickedCaseQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setPickedCaseQty(ctb(vl)), "pickedCaseQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getPickedCartonQty(), (et, vl) -> ((SqlBondedPickingListPrint)et).setPickedCartonQty(ctb(vl)), "pickedCartonQty");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getClientNm(), (et, vl) -> ((SqlBondedPickingListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getMinShipschdate(), (et, vl) -> ((SqlBondedPickingListPrint)et).setMinShipschdate((String)vl), "minShipschdate");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getMaxShipschdate(), (et, vl) -> ((SqlBondedPickingListPrint)et).setMaxShipschdate((String)vl), "maxShipschdate");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getCenterCd(), (et, vl) -> ((SqlBondedPickingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getCenterAbbr(), (et, vl) -> ((SqlBondedPickingListPrint)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getClientAbbr(), (et, vl) -> ((SqlBondedPickingListPrint)et).setClientAbbr((String)vl), "clientAbbr");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getProductCd(), (et, vl) -> ((SqlBondedPickingListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getProductAbbr(), (et, vl) -> ((SqlBondedPickingListPrint)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getUsernum3(), (et, vl) -> ((SqlBondedPickingListPrint)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getOthercd3(), (et, vl) -> ((SqlBondedPickingListPrint)et).setOthercd3((String)vl), "othercd3");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getUserCd(), (et, vl) -> ((SqlBondedPickingListPrint)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getUserNm(), (et, vl) -> ((SqlBondedPickingListPrint)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlBondedPickingListPrint)et).getLocationCd(), (et, vl) -> ((SqlBondedPickingListPrint)et).setLocationCd((String)vl), "locationCd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlBondedPickingListPrint";
    protected final String _tableDispName = "SqlBondedPickingListPrint";
    protected final String _tablePropertyName = "sqlBondedPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlBondedPickingListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletQty = cci("PALLET_QTY", "PALLET_QTY", null, null, java.math.BigDecimal.class, "palletQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseQty = cci("CASE_QTY", "CASE_QTY", null, null, java.math.BigDecimal.class, "caseQty", null, false, false, false, "decimal", 36, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortReceivedCaseQty = cci("SORT_RECEIVED_CASE_QTY", "SORT_RECEIVED_CASE_QTY", null, null, java.math.BigDecimal.class, "sortReceivedCaseQty", null, false, false, false, "decimal", 37, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortReceivedCartonQty = cci("SORT_RECEIVED_CARTON_QTY", "SORT_RECEIVED_CARTON_QTY", null, null, java.math.BigDecimal.class, "sortReceivedCartonQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedPalletQty = cci("PICKED_PALLET_QTY", "PICKED_PALLET_QTY", null, null, java.math.BigDecimal.class, "pickedPalletQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedCaseQty = cci("PICKED_CASE_QTY", "PICKED_CASE_QTY", null, null, java.math.BigDecimal.class, "pickedCaseQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedCartonQty = cci("PICKED_CARTON_QTY", "PICKED_CARTON_QTY", null, null, java.math.BigDecimal.class, "pickedCartonQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinShipschdate = cci("MIN_SHIPSCHDATE", "MIN_SHIPSCHDATE", null, null, String.class, "minShipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxShipschdate = cci("MAX_SHIPSCHDATE", "MAX_SHIPSCHDATE", null, null, String.class, "maxShipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAbbr = cci("CLIENT_ABBR", "CLIENT_ABBR", null, null, String.class, "clientAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOthercd3 = cci("OTHERCD3", "OTHERCD3", null, null, String.class, "othercd3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * FLOOR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * WORKALLOCATEID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
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
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LISTKBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * PALLET_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletQty() { return _columnPalletQty; }
    /**
     * CASE_QTY: {decimal(36, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseQty() { return _columnCaseQty; }
    /**
     * SORT_RECEIVED_CASE_QTY: {decimal(37, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortReceivedCaseQty() { return _columnSortReceivedCaseQty; }
    /**
     * SORT_RECEIVED_CARTON_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortReceivedCartonQty() { return _columnSortReceivedCartonQty; }
    /**
     * PICKED_PALLET_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedPalletQty() { return _columnPickedPalletQty; }
    /**
     * PICKED_CASE_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedCaseQty() { return _columnPickedCaseQty; }
    /**
     * PICKED_CARTON_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedCartonQty() { return _columnPickedCartonQty; }
    /**
     * CLIENT_NM: {varchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
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
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * CLIENT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAbbr() { return _columnClientAbbr; }
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
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFloor());
        ls.add(columnWorkallocateid());
        ls.add(columnLot3());
        ls.add(columnOtherlot1());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot4());
        ls.add(columnListkbn());
        ls.add(columnPalletQty());
        ls.add(columnCaseQty());
        ls.add(columnSortReceivedCaseQty());
        ls.add(columnSortReceivedCartonQty());
        ls.add(columnPickedPalletQty());
        ls.add(columnPickedCaseQty());
        ls.add(columnPickedCartonQty());
        ls.add(columnClientNm());
        ls.add(columnMinShipschdate());
        ls.add(columnMaxShipschdate());
        ls.add(columnCenterCd());
        ls.add(columnCenterAbbr());
        ls.add(columnClientAbbr());
        ls.add(columnProductCd());
        ls.add(columnProductAbbr());
        ls.add(columnUsernum3());
        ls.add(columnOthercd3());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
        ls.add(columnLocationCd());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlBondedPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlBondedPickingListPrint> getEntityType() { return SqlBondedPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlBondedPickingListPrint newEntity() { return new SqlBondedPickingListPrint(); }
    public SqlBondedPickingListPrint newMyEntity() { return new SqlBondedPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlBondedPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlBondedPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
