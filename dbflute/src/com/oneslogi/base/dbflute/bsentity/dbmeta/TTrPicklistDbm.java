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
 * The DB meta of T_TR_PICKLIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrPicklistDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrPicklistDbm _instance = new TTrPicklistDbm();
    private TTrPicklistDbm() {}
    public static TTrPicklistDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getTTrPicklistId(), (et, vl) -> ((TTrPicklist)et).setTTrPicklistId(ctl(vl)), "TTrPicklistId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getTrpickdetailId(), (et, vl) -> ((TTrPicklist)et).setTrpickdetailId(ctl(vl)), "trpickdetailId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getPickListKey(), (et, vl) -> ((TTrPicklist)et).setPickListKey(ctl(vl)), "pickListKey");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getPicklistGNo(), (et, vl) -> ((TTrPicklist)et).setPicklistGNo(ctl(vl)), "picklistGNo");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getPlBatchKey(), (et, vl) -> ((TTrPicklist)et).setPlBatchKey(ctl(vl)), "plBatchKey");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getStockId(), (et, vl) -> ((TTrPicklist)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getLotId(), (et, vl) -> ((TTrPicklist)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getPicklistDate(), (et, vl) -> ((TTrPicklist)et).setPicklistDate((String)vl), "picklistDate");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getProductCd(), (et, vl) -> ((TTrPicklist)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getManufactureDate(), (et, vl) -> ((TTrPicklist)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getDesignFlg(), (et, vl) -> ((TTrPicklist)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getMonthFlg(), (et, vl) -> ((TTrPicklist)et).setMonthFlg((String)vl), "monthFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getDailyFlg(), (et, vl) -> ((TTrPicklist)et).setDailyFlg((String)vl), "dailyFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getFrontRackFlg(), (et, vl) -> ((TTrPicklist)et).setFrontRackFlg((String)vl), "frontRackFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getLocFlg(), (et, vl) -> ((TTrPicklist)et).setLocFlg((String)vl), "locFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getStdDifFlg(), (et, vl) -> ((TTrPicklist)et).setStdDifFlg((String)vl), "stdDifFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getOrderType(), (et, vl) -> ((TTrPicklist)et).setOrderType((String)vl), "orderType");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getShipTosub(), (et, vl) -> ((TTrPicklist)et).setShipTosub((String)vl), "shipTosub");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getRmaNo(), (et, vl) -> ((TTrPicklist)et).setRmaNo((String)vl), "rmaNo");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getSotedLocationId(), (et, vl) -> ((TTrPicklist)et).setSotedLocationId(ctl(vl)), "sotedLocationId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getSotedLocationCd(), (et, vl) -> ((TTrPicklist)et).setSotedLocationCd((String)vl), "sotedLocationCd");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getAllocLocationId(), (et, vl) -> ((TTrPicklist)et).setAllocLocationId(ctl(vl)), "allocLocationId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getAllocLocationCd(), (et, vl) -> ((TTrPicklist)et).setAllocLocationCd((String)vl), "allocLocationCd");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getRootOutSeq(), (et, vl) -> ((TTrPicklist)et).setRootOutSeq(ctl(vl)), "rootOutSeq");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getDirectionComment(), (et, vl) -> ((TTrPicklist)et).setDirectionComment((String)vl), "directionComment");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getQtyCase(), (et, vl) -> ((TTrPicklist)et).setQtyCase(ctl(vl)), "qtyCase");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getQtyBowl(), (et, vl) -> ((TTrPicklist)et).setQtyBowl(ctl(vl)), "qtyBowl");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getQty(), (et, vl) -> ((TTrPicklist)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getHtQtyCase(), (et, vl) -> ((TTrPicklist)et).setHtQtyCase(ctl(vl)), "htQtyCase");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getHtQtyBowl(), (et, vl) -> ((TTrPicklist)et).setHtQtyBowl(ctl(vl)), "htQtyBowl");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getHtQty(), (et, vl) -> ((TTrPicklist)et).setHtQty(ctl(vl)), "htQty");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getCompleteSts(), (et, vl) -> ((TTrPicklist)et).setCompleteSts((String)vl), "completeSts");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getStartTime(), (et, vl) -> ((TTrPicklist)et).setStartTime(cttp(vl)), "startTime");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getEndTime(), (et, vl) -> ((TTrPicklist)et).setEndTime(cttp(vl)), "endTime");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getUserCd(), (et, vl) -> ((TTrPicklist)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getSuppliercd(), (et, vl) -> ((TTrPicklist)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getSchdate(), (et, vl) -> ((TTrPicklist)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getCaseOutNumber(), (et, vl) -> ((TTrPicklist)et).setCaseOutNumber(ctl(vl)), "caseOutNumber");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getCenterId(), (et, vl) -> ((TTrPicklist)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getClientId(), (et, vl) -> ((TTrPicklist)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getLineBlock(), (et, vl) -> ((TTrPicklist)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getSortingRackNo(), (et, vl) -> ((TTrPicklist)et).setSortingRackNo((String)vl), "sortingRackNo");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getDelFlg(), (et, vl) -> ((TTrPicklist)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getVersionNo(), (et, vl) -> ((TTrPicklist)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getControlNo(), (et, vl) -> ((TTrPicklist)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getAddDt(), (et, vl) -> ((TTrPicklist)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getAddUser(), (et, vl) -> ((TTrPicklist)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getAddProcess(), (et, vl) -> ((TTrPicklist)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getUpdDt(), (et, vl) -> ((TTrPicklist)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getUpdUser(), (et, vl) -> ((TTrPicklist)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrPicklist)et).getUpdProcess(), (et, vl) -> ((TTrPicklist)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrPicklist)et).getTTrpickdetail(), (et, vl) -> ((TTrPicklist)et).setTTrpickdetail((TTrpickdetail)vl), "TTrpickdetail");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TR_PICKLIST";
    protected final String _tableDispName = "T_TR_PICKLIST";
    protected final String _tablePropertyName = "TTrPicklist";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TR_PICKLIST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTTrPicklistId = cci("T_TR_PICKLIST_ID", "T_TR_PICKLIST_ID", null, null, Long.class, "TTrPicklistId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrpicklistexpList", null, false);
    protected final ColumnInfo _columnTrpickdetailId = cci("TRPICKDETAIL_ID", "TRPICKDETAIL_ID", null, null, Long.class, "trpickdetailId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TTrpickdetail", null, null, false);
    protected final ColumnInfo _columnPickListKey = cci("PICK_LIST_KEY", "PICK_LIST_KEY", null, null, Long.class, "pickListKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistGNo = cci("PICKLIST_G_NO", "PICKLIST_G_NO", null, null, Long.class, "picklistGNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlBatchKey = cci("PL_BATCH_KEY", "PL_BATCH_KEY", null, null, Long.class, "plBatchKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistDate = cci("PICKLIST_DATE", "PICKLIST_DATE", null, null, String.class, "picklistDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonthFlg = cci("MONTH_FLG", "MONTH_FLG", null, null, String.class, "monthFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDailyFlg = cci("DAILY_FLG", "DAILY_FLG", null, null, String.class, "dailyFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFrontRackFlg = cci("FRONT_RACK_FLG", "FRONT_RACK_FLG", null, null, String.class, "frontRackFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocFlg = cci("LOC_FLG", "LOC_FLG", null, null, String.class, "locFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStdDifFlg = cci("STD_DIF_FLG", "STD_DIF_FLG", null, null, String.class, "stdDifFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderType = cci("ORDER_TYPE", "ORDER_TYPE", null, null, String.class, "orderType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipTosub = cci("SHIP_TOSUB", "SHIP_TOSUB", null, null, String.class, "shipTosub", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmaNo = cci("RMA_NO", "RMA_NO", null, null, String.class, "rmaNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedLocationId = cci("SOTED_LOCATION_ID", "SOTED_LOCATION_ID", null, null, Long.class, "sotedLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedLocationCd = cci("SOTED_LOCATION_CD", "SOTED_LOCATION_CD", null, null, String.class, "sotedLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocLocationId = cci("ALLOC_LOCATION_ID", "ALLOC_LOCATION_ID", null, null, Long.class, "allocLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocLocationCd = cci("ALLOC_LOCATION_CD", "ALLOC_LOCATION_CD", null, null, String.class, "allocLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRootOutSeq = cci("ROOT_OUT_SEQ", "ROOT_OUT_SEQ", null, null, Long.class, "rootOutSeq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionComment = cci("DIRECTION_COMMENT", "DIRECTION_COMMENT", null, null, String.class, "directionComment", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtyCase = cci("QTY_CASE", "QTY_CASE", null, null, Long.class, "qtyCase", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtyBowl = cci("QTY_BOWL", "QTY_BOWL", null, null, Long.class, "qtyBowl", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtQtyCase = cci("HT_QTY_CASE", "HT_QTY_CASE", null, null, Long.class, "htQtyCase", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtQtyBowl = cci("HT_QTY_BOWL", "HT_QTY_BOWL", null, null, Long.class, "htQtyBowl", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtQty = cci("HT_QTY", "HT_QTY", null, null, Long.class, "htQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompleteSts = cci("COMPLETE_STS", "COMPLETE_STS", null, null, String.class, "completeSts", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartTime = cci("START_TIME", "START_TIME", null, null, java.sql.Timestamp.class, "startTime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndTime = cci("END_TIME", "END_TIME", null, null, java.sql.Timestamp.class, "endTime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SCHDATE", "SCHDATE", null, null, String.class, "schdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutNumber = cci("CASE_OUT_NUMBER", "CASE_OUT_NUMBER", null, null, Long.class, "caseOutNumber", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortingRackNo = cci("SORTING_RACK_NO", "SORTING_RACK_NO", null, null, String.class, "sortingRackNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * T_TR_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTTrPicklistId() { return _columnTTrPicklistId; }
    /**
     * TRPICKDETAIL_ID: {bigint(19), FK to T_TRPICKDETAIL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpickdetailId() { return _columnTrpickdetailId; }
    /**
     * PICK_LIST_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickListKey() { return _columnPickListKey; }
    /**
     * PICKLIST_G_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistGNo() { return _columnPicklistGNo; }
    /**
     * PL_BATCH_KEY: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlBatchKey() { return _columnPlBatchKey; }
    /**
     * STOCK_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * LOT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PICKLIST_DATE: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistDate() { return _columnPicklistDate; }
    /**
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * MANUFACTURE_DATE: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * DESIGN_FLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
    /**
     * MONTH_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonthFlg() { return _columnMonthFlg; }
    /**
     * DAILY_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDailyFlg() { return _columnDailyFlg; }
    /**
     * FRONT_RACK_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFrontRackFlg() { return _columnFrontRackFlg; }
    /**
     * LOC_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocFlg() { return _columnLocFlg; }
    /**
     * STD_DIF_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStdDifFlg() { return _columnStdDifFlg; }
    /**
     * ORDER_TYPE: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderType() { return _columnOrderType; }
    /**
     * SHIP_TOSUB: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipTosub() { return _columnShipTosub; }
    /**
     * RMA_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmaNo() { return _columnRmaNo; }
    /**
     * SOTED_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedLocationId() { return _columnSotedLocationId; }
    /**
     * SOTED_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedLocationCd() { return _columnSotedLocationCd; }
    /**
     * ALLOC_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocLocationId() { return _columnAllocLocationId; }
    /**
     * ALLOC_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocLocationCd() { return _columnAllocLocationCd; }
    /**
     * ROOT_OUT_SEQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRootOutSeq() { return _columnRootOutSeq; }
    /**
     * DIRECTION_COMMENT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionComment() { return _columnDirectionComment; }
    /**
     * QTY_CASE: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtyCase() { return _columnQtyCase; }
    /**
     * QTY_BOWL: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtyBowl() { return _columnQtyBowl; }
    /**
     * QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * HT_QTY_CASE: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtQtyCase() { return _columnHtQtyCase; }
    /**
     * HT_QTY_BOWL: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtQtyBowl() { return _columnHtQtyBowl; }
    /**
     * HT_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtQty() { return _columnHtQty; }
    /**
     * COMPLETE_STS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompleteSts() { return _columnCompleteSts; }
    /**
     * START_TIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartTime() { return _columnStartTime; }
    /**
     * END_TIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndTime() { return _columnEndTime; }
    /**
     * USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * SUPPLIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * SCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * CASE_OUT_NUMBER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutNumber() { return _columnCaseOutNumber; }
    /**
     * CENTER_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * LINE_BLOCK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * SORTING_RACK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingRackNo() { return _columnSortingRackNo; }
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
        ls.add(columnTTrPicklistId());
        ls.add(columnTrpickdetailId());
        ls.add(columnPickListKey());
        ls.add(columnPicklistGNo());
        ls.add(columnPlBatchKey());
        ls.add(columnStockId());
        ls.add(columnLotId());
        ls.add(columnPicklistDate());
        ls.add(columnProductCd());
        ls.add(columnManufactureDate());
        ls.add(columnDesignFlg());
        ls.add(columnMonthFlg());
        ls.add(columnDailyFlg());
        ls.add(columnFrontRackFlg());
        ls.add(columnLocFlg());
        ls.add(columnStdDifFlg());
        ls.add(columnOrderType());
        ls.add(columnShipTosub());
        ls.add(columnRmaNo());
        ls.add(columnSotedLocationId());
        ls.add(columnSotedLocationCd());
        ls.add(columnAllocLocationId());
        ls.add(columnAllocLocationCd());
        ls.add(columnRootOutSeq());
        ls.add(columnDirectionComment());
        ls.add(columnQtyCase());
        ls.add(columnQtyBowl());
        ls.add(columnQty());
        ls.add(columnHtQtyCase());
        ls.add(columnHtQtyBowl());
        ls.add(columnHtQty());
        ls.add(columnCompleteSts());
        ls.add(columnStartTime());
        ls.add(columnEndTime());
        ls.add(columnUserCd());
        ls.add(columnSuppliercd());
        ls.add(columnSchdate());
        ls.add(columnCaseOutNumber());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnLineBlock());
        ls.add(columnSortingRackNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnTTrPicklistId()); }
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
     * T_TRPICKDETAIL by my TRPICKDETAIL_ID, named 'TTrpickdetail'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrpickdetail() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrpickdetailId(), TTrpickdetailDbm.getInstance().columnTrpickdetailId());
        return cfi("T_TR_PICKLIST_FK1", "TTrpickdetail", this, TTrpickdetailDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrPicklistList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_TRPICKLISTEXP by T_TRPICKLIST_ID, named 'TTrpicklistexpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrpicklistexpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTTrPicklistId(), TTrpicklistexpDbm.getInstance().columnTTrpicklistId());
        return cri("T_TRPICKLISTEXP_FK1", "TTrpicklistexpList", this, TTrpicklistexpDbm.getInstance(), mp, false, "TTrPicklist");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrPicklist"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrPicklistCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrPicklistBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrPicklist> getEntityType() { return TTrPicklist.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrPicklist newEntity() { return new TTrPicklist(); }
    public TTrPicklist newMyEntity() { return new TTrPicklist(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrPicklist)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrPicklist)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
