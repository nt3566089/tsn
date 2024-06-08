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
 * The DB meta of SqlInventoryInputList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryInputListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryInputListDbm _instance = new SqlInventoryInputListDbm();
    private SqlInventoryInputListDbm() {}
    public static SqlInventoryInputListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryBId(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getVersionNo(), (et, vl) -> ((SqlInventoryInputList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryInstKbn(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryInstKbn((String)vl), "inventoryInstKbn");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getLocationGrp(), (et, vl) -> ((SqlInventoryInputList)et).setLocationGrp((String)vl), "locationGrp");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getCggdid(), (et, vl) -> ((SqlInventoryInputList)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInstructionKey(), (et, vl) -> ((SqlInventoryInputList)et).setInstructionKey(ctl(vl)), "instructionKey");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryDt(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getAddDt(), (et, vl) -> ((SqlInventoryInputList)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getLineBlock(), (et, vl) -> ((SqlInventoryInputList)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getDirectionalPiston(), (et, vl) -> ((SqlInventoryInputList)et).setDirectionalPiston((String)vl), "directionalPiston");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getSortingOrder(), (et, vl) -> ((SqlInventoryInputList)et).setSortingOrder((String)vl), "sortingOrder");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getSortingNumTimes(), (et, vl) -> ((SqlInventoryInputList)et).setSortingNumTimes(ctl(vl)), "sortingNumTimes");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getLocationCd(), (et, vl) -> ((SqlInventoryInputList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getProductCd(), (et, vl) -> ((SqlInventoryInputList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getJanCd(), (et, vl) -> ((SqlInventoryInputList)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getProductNm(), (et, vl) -> ((SqlInventoryInputList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getFirmTransportCd(), (et, vl) -> ((SqlInventoryInputList)et).setFirmTransportCd((String)vl), "firmTransportCd");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getUnitNumBreakdown(), (et, vl) -> ((SqlInventoryInputList)et).setUnitNumBreakdown((String)vl), "unitNumBreakdown");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getChargeNum(), (et, vl) -> ((SqlInventoryInputList)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getAllocNum(), (et, vl) -> ((SqlInventoryInputList)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getMoveNum(), (et, vl) -> ((SqlInventoryInputList)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryBeforeBreakdown(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryBeforeBreakdown((String)vl), "inventoryBeforeBreakdown");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryNum(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryNumOld(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryNumOld(ctb(vl)), "inventoryNumOld");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryItems(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryItems((String)vl), "inventoryItems");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getDifferenceNum(), (et, vl) -> ((SqlInventoryInputList)et).setDifferenceNum((String)vl), "differenceNum");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getDifferenceItems(), (et, vl) -> ((SqlInventoryInputList)et).setDifferenceItems((String)vl), "differenceItems");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getNoShippingFlg(), (et, vl) -> ((SqlInventoryInputList)et).setNoShippingFlg((String)vl), "noShippingFlg");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getUpdDt(), (et, vl) -> ((SqlInventoryInputList)et).setUpdDt((String)vl), "updDt");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getCenterCd(), (et, vl) -> ((SqlInventoryInputList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getCenterNm(), (et, vl) -> ((SqlInventoryInputList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getPQty(), (et, vl) -> ((SqlInventoryInputList)et).setPQty(ctb(vl)), "PQty");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getUnit1(), (et, vl) -> ((SqlInventoryInputList)et).setUnit1(ctb(vl)), "unit1");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getUnit2(), (et, vl) -> ((SqlInventoryInputList)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getUsernum4(), (et, vl) -> ((SqlInventoryInputList)et).setUsernum4(ctl(vl)), "usernum4");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryParcent(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryParcent(cti(vl)), "inventoryParcent");
        setupEpg(_epgMap, et -> ((SqlInventoryInputList)et).getInventoryInputFlg(), (et, vl) -> ((SqlInventoryInputList)et).setInventoryInputFlg((String)vl), "inventoryInputFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryInputList";
    protected final String _tableDispName = "SqlInventoryInputList";
    protected final String _tablePropertyName = "sqlInventoryInputList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryInputList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryInstKbn = cci("INVENTORY_INST_KBN", "INVENTORY_INST_KBN", null, null, String.class, "inventoryInstKbn", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationGrp = cci("LOCATION_GRP", "LOCATION_GRP", null, null, String.class, "locationGrp", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructionKey = cci("INSTRUCTION_KEY", "INSTRUCTION_KEY", null, null, Long.class, "instructionKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionalPiston = cci("DIRECTIONAL_PISTON", "DIRECTIONAL_PISTON", null, null, String.class, "directionalPiston", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortingOrder = cci("SORTING_ORDER", "SORTING_ORDER", null, null, String.class, "sortingOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortingNumTimes = cci("SORTING_NUM_TIMES", "SORTING_NUM_TIMES", null, null, Long.class, "sortingNumTimes", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmTransportCd = cci("FIRM_TRANSPORT_CD", "FIRM_TRANSPORT_CD", null, null, String.class, "firmTransportCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNumBreakdown = cci("UNIT_NUM_BREAKDOWN", "UNIT_NUM_BREAKDOWN", null, null, String.class, "unitNumBreakdown", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryBeforeBreakdown = cci("INVENTORY_BEFORE_BREAKDOWN", "INVENTORY_BEFORE_BREAKDOWN", null, null, String.class, "inventoryBeforeBreakdown", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNumOld = cci("INVENTORY_NUM_OLD", "INVENTORY_NUM_OLD", null, null, java.math.BigDecimal.class, "inventoryNumOld", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryItems = cci("INVENTORY_ITEMS", "INVENTORY_ITEMS", null, null, String.class, "inventoryItems", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDifferenceNum = cci("DIFFERENCE_NUM", "DIFFERENCE_NUM", null, null, String.class, "differenceNum", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDifferenceItems = cci("DIFFERENCE_ITEMS", "DIFFERENCE_ITEMS", null, null, String.class, "differenceItems", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoShippingFlg = cci("NO_SHIPPING_FLG", "NO_SHIPPING_FLG", null, null, String.class, "noShippingFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, String.class, "updDt", null, false, false, false, "nvarchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPQty = cci("P_QTY", "P_QTY", null, null, java.math.BigDecimal.class, "PQty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, java.math.BigDecimal.class, "unit1", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum4 = cci("USERNUM4", "USERNUM4", null, null, Long.class, "usernum4", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryParcent = cci("INVENTORY_PARCENT", "INVENTORY_PARCENT", null, null, Integer.class, "inventoryParcent", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryInputFlg = cci("INVENTORY_INPUT_FLG", "INVENTORY_INPUT_FLG", null, null, String.class, "inventoryInputFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INVENTORY_B_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * INVENTORY_INST_KBN: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstKbn() { return _columnInventoryInstKbn; }
    /**
     * LOCATION_GRP: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationGrp() { return _columnLocationGrp; }
    /**
     * CGGDID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * INSTRUCTION_KEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstructionKey() { return _columnInstructionKey; }
    /**
     * INVENTORY_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * LINE_BLOCK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * DIRECTIONAL_PISTON: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionalPiston() { return _columnDirectionalPiston; }
    /**
     * SORTING_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingOrder() { return _columnSortingOrder; }
    /**
     * SORTING_NUM_TIMES: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingNumTimes() { return _columnSortingNumTimes; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * FIRM_TRANSPORT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmTransportCd() { return _columnFirmTransportCd; }
    /**
     * UNIT_NUM_BREAKDOWN: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNumBreakdown() { return _columnUnitNumBreakdown; }
    /**
     * CHARGE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * ALLOC_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * MOVE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum() { return _columnMoveNum; }
    /**
     * INVENTORY_BEFORE_BREAKDOWN: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBeforeBreakdown() { return _columnInventoryBeforeBreakdown; }
    /**
     * INVENTORY_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * INVENTORY_NUM_OLD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNumOld() { return _columnInventoryNumOld; }
    /**
     * INVENTORY_ITEMS: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryItems() { return _columnInventoryItems; }
    /**
     * DIFFERENCE_NUM: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDifferenceNum() { return _columnDifferenceNum; }
    /**
     * DIFFERENCE_ITEMS: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDifferenceItems() { return _columnDifferenceItems; }
    /**
     * NO_SHIPPING_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoShippingFlg() { return _columnNoShippingFlg; }
    /**
     * UPD_DT: {nvarchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * P_QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPQty() { return _columnPQty; }
    /**
     * UNIT1: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT2: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * USERNUM4: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum4() { return _columnUsernum4; }
    /**
     * INVENTORY_PARCENT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryParcent() { return _columnInventoryParcent; }
    /**
     * INVENTORY_INPUT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInputFlg() { return _columnInventoryInputFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryBId());
        ls.add(columnVersionNo());
        ls.add(columnInventoryInstKbn());
        ls.add(columnLocationGrp());
        ls.add(columnCggdid());
        ls.add(columnInstructionKey());
        ls.add(columnInventoryDt());
        ls.add(columnAddDt());
        ls.add(columnLineBlock());
        ls.add(columnDirectionalPiston());
        ls.add(columnSortingOrder());
        ls.add(columnSortingNumTimes());
        ls.add(columnLocationCd());
        ls.add(columnProductCd());
        ls.add(columnJanCd());
        ls.add(columnProductNm());
        ls.add(columnFirmTransportCd());
        ls.add(columnUnitNumBreakdown());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnMoveNum());
        ls.add(columnInventoryBeforeBreakdown());
        ls.add(columnInventoryNum());
        ls.add(columnInventoryNumOld());
        ls.add(columnInventoryItems());
        ls.add(columnDifferenceNum());
        ls.add(columnDifferenceItems());
        ls.add(columnNoShippingFlg());
        ls.add(columnUpdDt());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnPQty());
        ls.add(columnUnit1());
        ls.add(columnUnit2());
        ls.add(columnUsernum4());
        ls.add(columnInventoryParcent());
        ls.add(columnInventoryInputFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryInputList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryInputList> getEntityType() { return SqlInventoryInputList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryInputList newEntity() { return new SqlInventoryInputList(); }
    public SqlInventoryInputList newMyEntity() { return new SqlInventoryInputList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryInputList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryInputList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
