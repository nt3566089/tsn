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
 * The DB meta of T_LOT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TLotDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TLotDbm _instance = new TLotDbm();
    private TLotDbm() {}
    public static TLotDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TLot)et).getLotId(), (et, vl) -> ((TLot)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TLot)et).getProductId(), (et, vl) -> ((TLot)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TLot)et).getLot(), (et, vl) -> ((TLot)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TLot)et).getLotSort(), (et, vl) -> ((TLot)et).setLotSort((String)vl), "lotSort");
        setupEpg(_epgMap, et -> ((TLot)et).getLimitDt(), (et, vl) -> ((TLot)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TLot)et).getLot1(), (et, vl) -> ((TLot)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TLot)et).getLot2(), (et, vl) -> ((TLot)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TLot)et).getLot3(), (et, vl) -> ((TLot)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TLot)et).getLot4(), (et, vl) -> ((TLot)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TLot)et).getDamageflg(), (et, vl) -> ((TLot)et).setDamageflg((String)vl), "damageflg");
        setupEpg(_epgMap, et -> ((TLot)et).getNoshippingflg(), (et, vl) -> ((TLot)et).setNoshippingflg((String)vl), "noshippingflg");
        setupEpg(_epgMap, et -> ((TLot)et).getForeigncargoflg(), (et, vl) -> ((TLot)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TLot)et).getCustomsreleaseflg(), (et, vl) -> ((TLot)et).setCustomsreleaseflg((String)vl), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TLot)et).getTaxflg(), (et, vl) -> ((TLot)et).setTaxflg((String)vl), "taxflg");
        setupEpg(_epgMap, et -> ((TLot)et).getTranceportCd(), (et, vl) -> ((TLot)et).setTranceportCd((String)vl), "tranceportCd");
        setupEpg(_epgMap, et -> ((TLot)et).getSourceCd(), (et, vl) -> ((TLot)et).setSourceCd((String)vl), "sourceCd");
        setupEpg(_epgMap, et -> ((TLot)et).getSourceNm(), (et, vl) -> ((TLot)et).setSourceNm((String)vl), "sourceNm");
        setupEpg(_epgMap, et -> ((TLot)et).getSchDt(), (et, vl) -> ((TLot)et).setSchDt((String)vl), "schDt");
        setupEpg(_epgMap, et -> ((TLot)et).getDelFlg(), (et, vl) -> ((TLot)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TLot)et).getVersionNo(), (et, vl) -> ((TLot)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TLot)et).getControlNo(), (et, vl) -> ((TLot)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TLot)et).getAddDt(), (et, vl) -> ((TLot)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TLot)et).getAddUser(), (et, vl) -> ((TLot)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TLot)et).getAddProcess(), (et, vl) -> ((TLot)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TLot)et).getUpdDt(), (et, vl) -> ((TLot)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TLot)et).getUpdUser(), (et, vl) -> ((TLot)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TLot)et).getUpdProcess(), (et, vl) -> ((TLot)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TLot)et).getMProduct(), (et, vl) -> ((TLot)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_LOT";
    protected final String _tableDispName = "T_LOT";
    protected final String _tablePropertyName = "TLot";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_LOT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TAllocInstBList,TAllocLotList,TInventoryBList,TKeepingLotList,TLastLotList,TMoveInstBList,TShippingInstBList,TStockList,WHtInventoryInputProdList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtShippingPickingList", null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotSort = cci("LOT_SORT", "LOT_SORT", null, null, String.class, "lotSort", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, String.class, "damageflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, String.class, "noshippingflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, String.class, "customsreleaseflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxflg = cci("TAXFLG", "TAXFLG", null, null, String.class, "taxflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTranceportCd = cci("TRANCEPORT_CD", "TRANCEPORT_CD", null, null, String.class, "tranceportCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceCd = cci("SOURCE_CD", "SOURCE_CD", null, null, String.class, "sourceCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceNm = cci("SOURCE_NM", "SOURCE_NM", null, null, String.class, "sourceNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchDt = cci("SCH_DT", "SCH_DT", null, null, String.class, "schDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * LOT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LOT_SORT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotSort() { return _columnLotSort; }
    /**
     * LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * DAMAGEFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * NOSHIPPINGFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * FOREIGNCARGOFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * TAXFLG: {IX, NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxflg() { return _columnTaxflg; }
    /**
     * TRANCEPORT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTranceportCd() { return _columnTranceportCd; }
    /**
     * SOURCE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCd() { return _columnSourceCd; }
    /**
     * SOURCE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceNm() { return _columnSourceNm; }
    /**
     * SCH_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchDt() { return _columnSchDt; }
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
        ls.add(columnLotId());
        ls.add(columnProductId());
        ls.add(columnLot());
        ls.add(columnLotSort());
        ls.add(columnLimitDt());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnDamageflg());
        ls.add(columnNoshippingflg());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnTaxflg());
        ls.add(columnTranceportCd());
        ls.add(columnSourceCd());
        ls.add(columnSourceNm());
        ls.add(columnSchDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnLotId()); }
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
        return cfi("T_LOT_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TLotList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_ALLOC_INST_B by LOT_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TAllocInstBDbm.getInstance().columnLotId());
        return cri("T_ALLOC_INST_B_FK8", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_ALLOC_LOT by LOT_ID, named 'TAllocLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TAllocLotDbm.getInstance().columnLotId());
        return cri("T_ALLOC_LOT_FK1", "TAllocLotList", this, TAllocLotDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_INVENTORY_B by LOT_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TInventoryBDbm.getInstance().columnLotId());
        return cri("T_INVENTORY_B_FK11", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_KEEPING_LOT by LOT_ID, named 'TKeepingLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTKeepingLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TKeepingLotDbm.getInstance().columnLotId());
        return cri("T_KEEPING_LOT_FK2", "TKeepingLotList", this, TKeepingLotDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_LAST_LOT by LOT_ID, named 'TLastLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLastLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLastLotDbm.getInstance().columnLotId());
        return cri("T_LAST_LOT_FK2", "TLastLotList", this, TLastLotDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_MOVE_INST_B by LOT_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TMoveInstBDbm.getInstance().columnLotId());
        return cri("T_MOVE_INST_B_FK3", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_SHIPPING_INST_B by LOT_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TShippingInstBDbm.getInstance().columnLotId());
        return cri("T_SHIPPING_INST_B_FK1", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * T_STOCK by LOT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TStockDbm.getInstance().columnLotId());
        return cri("T_STOCK_FK3", "TStockList", this, TStockDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by LOT_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtInventoryInputProdDbm.getInstance().columnLotId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK7", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * W_HT_RECEIVE_INSPECTION by LOT_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtReceiveInspectionDbm.getInstance().columnLotId());
        return cri("W_HT_RECEIVE_INSPECTION_FK4", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by LOT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtReceiveNoPlanInspDbm.getInstance().columnLotId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK7", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * W_HT_RECEIVE_STORE by LOT_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtReceiveStoreDbm.getInstance().columnLotId());
        return cri("W_HT_RECEIVE_STORE_FK2", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * W_HT_SHIPPING_PICKING by LOT_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtShippingPickingDbm.getInstance().columnLotId());
        return cri("W_HT_SHIPPING_PICKING_FK4", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "TLot");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TLot"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TLotCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TLotBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TLot> getEntityType() { return TLot.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TLot newEntity() { return new TLot(); }
    public TLot newMyEntity() { return new TLot(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TLot)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TLot)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
