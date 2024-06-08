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
 * The DB meta of T_TRPICKDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpickdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpickdetailDbm _instance = new TTrpickdetailDbm();
    private TTrpickdetailDbm() {}
    public static TTrpickdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getTrpickdetailId(), (et, vl) -> ((TTrpickdetail)et).setTrpickdetailId(ctl(vl)), "trpickdetailId");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getTrsodetailId(), (et, vl) -> ((TTrpickdetail)et).setTrsodetailId(ctl(vl)), "trsodetailId");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getMoveInstHId(), (et, vl) -> ((TTrpickdetail)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getStockId(), (et, vl) -> ((TTrpickdetail)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getLocationId(), (et, vl) -> ((TTrpickdetail)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getPickBatchKey(), (et, vl) -> ((TTrpickdetail)et).setPickBatchKey(ctl(vl)), "pickBatchKey");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getPickBatchLineNo(), (et, vl) -> ((TTrpickdetail)et).setPickBatchLineNo(ctl(vl)), "pickBatchLineNo");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getProductCd(), (et, vl) -> ((TTrpickdetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getIfitemCd(), (et, vl) -> ((TTrpickdetail)et).setIfitemCd((String)vl), "ifitemCd");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getLotId(), (et, vl) -> ((TTrpickdetail)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getLocationCd(), (et, vl) -> ((TTrpickdetail)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getExpectQty(), (et, vl) -> ((TTrpickdetail)et).setExpectQty(ctl(vl)), "expectQty");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getPickedQty(), (et, vl) -> ((TTrpickdetail)et).setPickedQty(ctl(vl)), "pickedQty");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getSortedQty(), (et, vl) -> ((TTrpickdetail)et).setSortedQty(ctl(vl)), "sortedQty");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getShippedQty(), (et, vl) -> ((TTrpickdetail)et).setShippedQty(ctl(vl)), "shippedQty");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getPickUserCd(), (et, vl) -> ((TTrpickdetail)et).setPickUserCd((String)vl), "pickUserCd");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getLabelPrintedFlg(), (et, vl) -> ((TTrpickdetail)et).setLabelPrintedFlg(ctl(vl)), "labelPrintedFlg");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getMonthFlg(), (et, vl) -> ((TTrpickdetail)et).setMonthFlg((String)vl), "monthFlg");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getPlBatchKey(), (et, vl) -> ((TTrpickdetail)et).setPlBatchKey(ctl(vl)), "plBatchKey");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getWorkallocatename(), (et, vl) -> ((TTrpickdetail)et).setWorkallocatename((String)vl), "workallocatename");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getAlertflg(), (et, vl) -> ((TTrpickdetail)et).setAlertflg(ctl(vl)), "alertflg");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getReverseFlg(), (et, vl) -> ((TTrpickdetail)et).setReverseFlg((String)vl), "reverseFlg");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getReverseListOutputFlg(), (et, vl) -> ((TTrpickdetail)et).setReverseListOutputFlg((String)vl), "reverseListOutputFlg");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getDelFlg(), (et, vl) -> ((TTrpickdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getVersionNo(), (et, vl) -> ((TTrpickdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getControlNo(), (et, vl) -> ((TTrpickdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getAddDt(), (et, vl) -> ((TTrpickdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getAddUser(), (et, vl) -> ((TTrpickdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getAddProcess(), (et, vl) -> ((TTrpickdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getUpdDt(), (et, vl) -> ((TTrpickdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getUpdUser(), (et, vl) -> ((TTrpickdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpickdetail)et).getUpdProcess(), (et, vl) -> ((TTrpickdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrpickdetail)et).getTStock(), (et, vl) -> ((TTrpickdetail)et).setTStock((TStock)vl), "TStock");
        setupEfpg(_efpgMap, et -> ((TTrpickdetail)et).getMLocation(), (et, vl) -> ((TTrpickdetail)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TTrpickdetail)et).getTYtrsodetail(), (et, vl) -> ((TTrpickdetail)et).setTYtrsodetail((TYtrsodetail)vl), "TYtrsodetail");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPICKDETAIL";
    protected final String _tableDispName = "T_TRPICKDETAIL";
    protected final String _tablePropertyName = "TTrpickdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPICKDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrpickdetailId = cci("TRPICKDETAIL_ID", "TRPICKDETAIL_ID", null, null, Long.class, "trpickdetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrPicklistList", null, false);
    protected final ColumnInfo _columnTrsodetailId = cci("TRSODETAIL_ID", "TRSODETAIL_ID", null, null, Long.class, "trsodetailId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TYtrsodetail", null, null, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnPickBatchKey = cci("PICK_BATCH_KEY", "PICK_BATCH_KEY", null, null, Long.class, "pickBatchKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickBatchLineNo = cci("PICK_BATCH_LINE_NO", "PICK_BATCH_LINE_NO", null, null, Long.class, "pickBatchLineNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemCd = cci("IFITEM_CD", "IFITEM_CD", null, null, String.class, "ifitemCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQty = cci("EXPECT_QTY", "EXPECT_QTY", null, null, Long.class, "expectQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedQty = cci("PICKED_QTY", "PICKED_QTY", null, null, Long.class, "pickedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedQty = cci("SORTED_QTY", "SORTED_QTY", null, null, Long.class, "sortedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippedQty = cci("SHIPPED_QTY", "SHIPPED_QTY", null, null, Long.class, "shippedQty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickUserCd = cci("PICK_USER_CD", "PICK_USER_CD", null, null, String.class, "pickUserCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLabelPrintedFlg = cci("LABEL_PRINTED_FLG", "LABEL_PRINTED_FLG", null, null, Long.class, "labelPrintedFlg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonthFlg = cci("MONTH_FLG", "MONTH_FLG", null, null, String.class, "monthFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlBatchKey = cci("PL_BATCH_KEY", "PL_BATCH_KEY", null, null, Long.class, "plBatchKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocatename = cci("WORKALLOCATENAME", "WORKALLOCATENAME", null, null, String.class, "workallocatename", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlertflg = cci("ALERTFLG", "ALERTFLG", null, null, Long.class, "alertflg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReverseFlg = cci("REVERSE_FLG", "REVERSE_FLG", null, null, String.class, "reverseFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReverseListOutputFlg = cci("REVERSE_LIST_OUTPUT__FLG", "REVERSE_LIST_OUTPUT__FLG", null, null, String.class, "reverseListOutputFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpickdetailId() { return _columnTrpickdetailId; }
    /**
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsodetailId() { return _columnTrsodetailId; }
    /**
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickBatchKey() { return _columnPickBatchKey; }
    /**
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickBatchLineNo() { return _columnPickBatchLineNo; }
    /**
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * IFITEM_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemCd() { return _columnIfitemCd; }
    /**
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQty() { return _columnExpectQty; }
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
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippedQty() { return _columnShippedQty; }
    /**
     * PICK_USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickUserCd() { return _columnPickUserCd; }
    /**
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelPrintedFlg() { return _columnLabelPrintedFlg; }
    /**
     * MONTH_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonthFlg() { return _columnMonthFlg; }
    /**
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlBatchKey() { return _columnPlBatchKey; }
    /**
     * WORKALLOCATENAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocatename() { return _columnWorkallocatename; }
    /**
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlertflg() { return _columnAlertflg; }
    /**
     * REVERSE_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReverseFlg() { return _columnReverseFlg; }
    /**
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReverseListOutputFlg() { return _columnReverseListOutputFlg; }
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
        ls.add(columnTrpickdetailId());
        ls.add(columnTrsodetailId());
        ls.add(columnMoveInstHId());
        ls.add(columnStockId());
        ls.add(columnLocationId());
        ls.add(columnPickBatchKey());
        ls.add(columnPickBatchLineNo());
        ls.add(columnProductCd());
        ls.add(columnIfitemCd());
        ls.add(columnLotId());
        ls.add(columnLocationCd());
        ls.add(columnExpectQty());
        ls.add(columnPickedQty());
        ls.add(columnSortedQty());
        ls.add(columnShippedQty());
        ls.add(columnPickUserCd());
        ls.add(columnLabelPrintedFlg());
        ls.add(columnMonthFlg());
        ls.add(columnPlBatchKey());
        ls.add(columnWorkallocatename());
        ls.add(columnAlertflg());
        ls.add(columnReverseFlg());
        ls.add(columnReverseListOutputFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrpickdetailId()); }
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
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_TRPICKDETAIL_FK2", "TStock", this, TStockDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrpickdetailList", false);
    }
    /**
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_TRPICKDETAIL_FK3", "MLocation", this, MLocationDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrpickdetailList", false);
    }
    /**
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTYtrsodetail() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsodetailId(), TYtrsodetailDbm.getInstance().columnTrsodetailId());
        return cfi("T_TRPICKDETAIL_FK1", "TYtrsodetail", this, TYtrsodetailDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TTrpickdetailList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrPicklistList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrpickdetailId(), TTrPicklistDbm.getInstance().columnTrpickdetailId());
        return cri("T_TR_PICKLIST_FK1", "TTrPicklistList", this, TTrPicklistDbm.getInstance(), mp, false, "TTrpickdetail");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpickdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpickdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpickdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpickdetail> getEntityType() { return TTrpickdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpickdetail newEntity() { return new TTrpickdetail(); }
    public TTrpickdetail newMyEntity() { return new TTrpickdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpickdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpickdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
