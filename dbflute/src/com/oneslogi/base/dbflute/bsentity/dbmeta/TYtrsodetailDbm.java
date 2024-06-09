package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of T_YTRSODETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TYtrsodetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TYtrsodetailDbm _instance = new TYtrsodetailDbm();
    private TYtrsodetailDbm() {}
    public static TYtrsodetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getTrsodetailId(), (et, vl) -> ((TYtrsodetail)et).setTrsodetailId(ctl(vl)), "trsodetailId");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getTrsoId(), (et, vl) -> ((TYtrsodetail)et).setTrsoId(ctl(vl)), "trsoId");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getProductId(), (et, vl) -> ((TYtrsodetail)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getSoLineNo(), (et, vl) -> ((TYtrsodetail)et).setSoLineNo(ctl(vl)), "soLineNo");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getProductCd(), (et, vl) -> ((TYtrsodetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getIfitemCd(), (et, vl) -> ((TYtrsodetail)et).setIfitemCd((String)vl), "ifitemCd");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getLocationId(), (et, vl) -> ((TYtrsodetail)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getLocationCd(), (et, vl) -> ((TYtrsodetail)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getDamageFlg(), (et, vl) -> ((TYtrsodetail)et).setDamageFlg(ctl(vl)), "damageFlg");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getNoShippingFlg(), (et, vl) -> ((TYtrsodetail)et).setNoShippingFlg(ctl(vl)), "noShippingFlg");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getExpectQty(), (et, vl) -> ((TYtrsodetail)et).setExpectQty(ctl(vl)), "expectQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getAllocQty(), (et, vl) -> ((TYtrsodetail)et).setAllocQty(ctl(vl)), "allocQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getPickedQty(), (et, vl) -> ((TYtrsodetail)et).setPickedQty(ctl(vl)), "pickedQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getSortedQty(), (et, vl) -> ((TYtrsodetail)et).setSortedQty(ctl(vl)), "sortedQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getInspectedQty(), (et, vl) -> ((TYtrsodetail)et).setInspectedQty(ctl(vl)), "inspectedQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getShippedQty(), (et, vl) -> ((TYtrsodetail)et).setShippedQty(ctl(vl)), "shippedQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getAdjustQty(), (et, vl) -> ((TYtrsodetail)et).setAdjustQty(ctl(vl)), "adjustQty");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getLocFlg(), (et, vl) -> ((TYtrsodetail)et).setLocFlg(ctl(vl)), "locFlg");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getStdDifFlg(), (et, vl) -> ((TYtrsodetail)et).setStdDifFlg(ctl(vl)), "stdDifFlg");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getDelFlg(), (et, vl) -> ((TYtrsodetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getVersionNo(), (et, vl) -> ((TYtrsodetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getControlNo(), (et, vl) -> ((TYtrsodetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getAddDt(), (et, vl) -> ((TYtrsodetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getAddUser(), (et, vl) -> ((TYtrsodetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getAddProcess(), (et, vl) -> ((TYtrsodetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getUpdDt(), (et, vl) -> ((TYtrsodetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getUpdUser(), (et, vl) -> ((TYtrsodetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TYtrsodetail)et).getUpdProcess(), (et, vl) -> ((TYtrsodetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TYtrsodetail)et).getMProduct(), (et, vl) -> ((TYtrsodetail)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TYtrsodetail)et).getTYtrso(), (et, vl) -> ((TYtrsodetail)et).setTYtrso((TYtrso)vl), "TYtrso");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_YTRSODETAIL";
    protected final String _tableDispName = "T_YTRSODETAIL";
    protected final String _tablePropertyName = "TYtrsodetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_YTRSODETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsodetailId = cci("TRSODETAIL_ID", "TRSODETAIL_ID", null, null, Long.class, "trsodetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrimallocschkriList,TTrpickdetailList", null, false);
    protected final ColumnInfo _columnTrsoId = cci("TRSO_ID", "TRSO_ID", null, null, Long.class, "trsoId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TYtrso", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnSoLineNo = cci("SO_LINE_NO", "SO_LINE_NO", null, null, Long.class, "soLineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemCd = cci("IFITEM_CD", "IFITEM_CD", null, null, String.class, "ifitemCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageFlg = cci("DAMAGE_FLG", "DAMAGE_FLG", null, null, Long.class, "damageFlg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoShippingFlg = cci("NO_SHIPPING_FLG", "NO_SHIPPING_FLG", null, null, Long.class, "noShippingFlg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQty = cci("EXPECT_QTY", "EXPECT_QTY", null, null, Long.class, "expectQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocQty = cci("ALLOC_QTY", "ALLOC_QTY", null, null, Long.class, "allocQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedQty = cci("PICKED_QTY", "PICKED_QTY", null, null, Long.class, "pickedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedQty = cci("SORTED_QTY", "SORTED_QTY", null, null, Long.class, "sortedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedQty = cci("INSPECTED_QTY", "INSPECTED_QTY", null, null, Long.class, "inspectedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippedQty = cci("SHIPPED_QTY", "SHIPPED_QTY", null, null, Long.class, "shippedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustQty = cci("ADJUST_QTY", "ADJUST_QTY", null, null, Long.class, "adjustQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocFlg = cci("LOC_FLG", "LOC_FLG", null, null, Long.class, "locFlg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStdDifFlg = cci("STD_DIF_FLG", "STD_DIF_FLG", null, null, Long.class, "stdDifFlg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsodetailId() { return _columnTrsodetailId; }
    /**
     * TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsoId() { return _columnTrsoId; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * SO_LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoLineNo() { return _columnSoLineNo; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * IFITEM_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemCd() { return _columnIfitemCd; }
    /**
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_CD: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageFlg() { return _columnDamageFlg; }
    /**
     * NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoShippingFlg() { return _columnNoShippingFlg; }
    /**
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQty() { return _columnExpectQty; }
    /**
     * ALLOC_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocQty() { return _columnAllocQty; }
    /**
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedQty() { return _columnPickedQty; }
    /**
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedQty() { return _columnSortedQty; }
    /**
     * INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedQty() { return _columnInspectedQty; }
    /**
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippedQty() { return _columnShippedQty; }
    /**
     * ADJUST_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustQty() { return _columnAdjustQty; }
    /**
     * LOC_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocFlg() { return _columnLocFlg; }
    /**
     * STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStdDifFlg() { return _columnStdDifFlg; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTrsodetailId());
        ls.add(columnTrsoId());
        ls.add(columnProductId());
        ls.add(columnSoLineNo());
        ls.add(columnProductCd());
        ls.add(columnIfitemCd());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnDamageFlg());
        ls.add(columnNoShippingFlg());
        ls.add(columnExpectQty());
        ls.add(columnAllocQty());
        ls.add(columnPickedQty());
        ls.add(columnSortedQty());
        ls.add(columnInspectedQty());
        ls.add(columnShippedQty());
        ls.add(columnAdjustQty());
        ls.add(columnLocFlg());
        ls.add(columnStdDifFlg());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTrsodetailId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_YTRSODETAIL_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TYtrsodetailList", false);
    }
    /**
     * T_YTRSO by my TRSO_ID, named 'TYtrso'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTYtrso() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsoId(), TYtrsoDbm.getInstance().columnTrsrId());
        return cfi("T_YTRSODETAIL_FK2", "TYtrso", this, TYtrsoDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TYtrsodetailList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrimallocschkriList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsodetailId(), TTrimallocschkriDbm.getInstance().columnTrsodetailId());
        return cri("T_TRIMALLOCSCHKRI_FK2", "TTrimallocschkriList", this, TTrimallocschkriDbm.getInstance(), mp, false, "TYtrsodetail");
    }
    /**
     * T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrpickdetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsodetailId(), TTrpickdetailDbm.getInstance().columnTrsodetailId());
        return cri("T_TRPICKDETAIL_FK1", "TTrpickdetailList", this, TTrpickdetailDbm.getInstance(), mp, false, "TYtrsodetail");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TYtrsodetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TYtrsodetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TYtrsodetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TYtrsodetail> getEntityType() { return TYtrsodetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TYtrsodetail newEntity() { return new TYtrsodetail(); }
    public TYtrsodetail newMyEntity() { return new TYtrsodetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TYtrsodetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TYtrsodetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
