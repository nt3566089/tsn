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
 * The DB meta of W_HT_RECEIVE_INSPECTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveInspectionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtReceiveInspectionDbm _instance = new WHtReceiveInspectionDbm();
    private WHtReceiveInspectionDbm() {}
    public static WHtReceiveInspectionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getHtReceiveInspectionId(), (et, vl) -> ((WHtReceiveInspection)et).setHtReceiveInspectionId(ctl(vl)), "htReceiveInspectionId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getMacAddress(), (et, vl) -> ((WHtReceiveInspection)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getClientId(), (et, vl) -> ((WHtReceiveInspection)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getCenterId(), (et, vl) -> ((WHtReceiveInspection)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getWarehouseId(), (et, vl) -> ((WHtReceiveInspection)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getProductId(), (et, vl) -> ((WHtReceiveInspection)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getJanCd(), (et, vl) -> ((WHtReceiveInspection)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getProductCd(), (et, vl) -> ((WHtReceiveInspection)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getProductNm(), (et, vl) -> ((WHtReceiveInspection)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getStockTypeId(), (et, vl) -> ((WHtReceiveInspection)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getStkClsNm(), (et, vl) -> ((WHtReceiveInspection)et).setStkClsNm((String)vl), "stkClsNm");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getPieceQtyRcvOrd(), (et, vl) -> ((WHtReceiveInspection)et).setPieceQtyRcvOrd(ctb(vl)), "pieceQtyRcvOrd");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getPieceQtyRcv(), (et, vl) -> ((WHtReceiveInspection)et).setPieceQtyRcv(ctb(vl)), "pieceQtyRcv");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getRcvLocId(), (et, vl) -> ((WHtReceiveInspection)et).setRcvLocId(ctl(vl)), "rcvLocId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getRcvLocCd(), (et, vl) -> ((WHtReceiveInspection)et).setRcvLocCd((String)vl), "rcvLocCd");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getRcvLocNm(), (et, vl) -> ((WHtReceiveInspection)et).setRcvLocNm((String)vl), "rcvLocNm");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getHtWorkNo(), (et, vl) -> ((WHtReceiveInspection)et).setHtWorkNo((String)vl), "htWorkNo");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getOnsNum(), (et, vl) -> ((WHtReceiveInspection)et).setOnsNum((String)vl), "onsNum");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getLotId(), (et, vl) -> ((WHtReceiveInspection)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getLot(), (et, vl) -> ((WHtReceiveInspection)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getLimitDt(), (et, vl) -> ((WHtReceiveInspection)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getLabelSelect(), (et, vl) -> ((WHtReceiveInspection)et).setLabelSelect((String)vl), "labelSelect");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getWorkStartDt(), (et, vl) -> ((WHtReceiveInspection)et).setWorkStartDt(cttp(vl)), "workStartDt");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getWorkEndDt(), (et, vl) -> ((WHtReceiveInspection)et).setWorkEndDt(cttp(vl)), "workEndDt");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getDelFlg(), (et, vl) -> ((WHtReceiveInspection)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getVersionNo(), (et, vl) -> ((WHtReceiveInspection)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getControlNo(), (et, vl) -> ((WHtReceiveInspection)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getAddDt(), (et, vl) -> ((WHtReceiveInspection)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getAddUser(), (et, vl) -> ((WHtReceiveInspection)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getAddProcess(), (et, vl) -> ((WHtReceiveInspection)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getUpdDt(), (et, vl) -> ((WHtReceiveInspection)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getUpdUser(), (et, vl) -> ((WHtReceiveInspection)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtReceiveInspection)et).getUpdProcess(), (et, vl) -> ((WHtReceiveInspection)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getMCenter(), (et, vl) -> ((WHtReceiveInspection)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getMClient(), (et, vl) -> ((WHtReceiveInspection)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getTLot(), (et, vl) -> ((WHtReceiveInspection)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getMProduct(), (et, vl) -> ((WHtReceiveInspection)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getMLocation(), (et, vl) -> ((WHtReceiveInspection)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getMStockType(), (et, vl) -> ((WHtReceiveInspection)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((WHtReceiveInspection)et).getMWarehouse(), (et, vl) -> ((WHtReceiveInspection)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_HT_RECEIVE_INSPECTION";
    protected final String _tableDispName = "W_HT_RECEIVE_INSPECTION";
    protected final String _tablePropertyName = "WHtReceiveInspection";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_HT_RECEIVE_INSPECTION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtReceiveInspectionId = cci("HT_RECEIVE_INSPECTION_ID", "HT_RECEIVE_INSPECTION_ID", null, null, Long.class, "htReceiveInspectionId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnStkClsNm = cci("STK_CLS_NM", "STK_CLS_NM", null, null, String.class, "stkClsNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPieceQtyRcvOrd = cci("PIECE_QTY_RCV_ORD", "PIECE_QTY_RCV_ORD", null, null, java.math.BigDecimal.class, "pieceQtyRcvOrd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPieceQtyRcv = cci("PIECE_QTY_RCV", "PIECE_QTY_RCV", null, null, java.math.BigDecimal.class, "pieceQtyRcv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvLocId = cci("RCV_LOC_ID", "RCV_LOC_ID", null, null, Long.class, "rcvLocId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnRcvLocCd = cci("RCV_LOC_CD", "RCV_LOC_CD", null, null, String.class, "rcvLocCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvLocNm = cci("RCV_LOC_NM", "RCV_LOC_NM", null, null, String.class, "rcvLocNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtWorkNo = cci("HT_WORK_NO", "HT_WORK_NO", null, null, String.class, "htWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnsNum = cci("ONS_NUM", "ONS_NUM", null, null, String.class, "onsNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLabelSelect = cci("LABEL_SELECT", "LABEL_SELECT", null, null, String.class, "labelSelect", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkStartDt = cci("WORK_START_DT", "WORK_START_DT", null, null, java.sql.Timestamp.class, "workStartDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkEndDt = cci("WORK_END_DT", "WORK_END_DT", null, null, java.sql.Timestamp.class, "workEndDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * HT_RECEIVE_INSPECTION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtReceiveInspectionId() { return _columnHtReceiveInspectionId; }
    /**
     * MAC_ADDRESS: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STK_CLS_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStkClsNm() { return _columnStkClsNm; }
    /**
     * PIECE_QTY_RCV_ORD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPieceQtyRcvOrd() { return _columnPieceQtyRcvOrd; }
    /**
     * PIECE_QTY_RCV: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPieceQtyRcv() { return _columnPieceQtyRcv; }
    /**
     * RCV_LOC_ID: {bigint(19), FK to M_LOCATION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvLocId() { return _columnRcvLocId; }
    /**
     * RCV_LOC_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvLocCd() { return _columnRcvLocCd; }
    /**
     * RCV_LOC_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvLocNm() { return _columnRcvLocNm; }
    /**
     * HT_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtWorkNo() { return _columnHtWorkNo; }
    /**
     * ONS_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnsNum() { return _columnOnsNum; }
    /**
     * LOT_ID: {bigint(19), FK to T_LOT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * LABEL_SELECT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelSelect() { return _columnLabelSelect; }
    /**
     * WORK_START_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkStartDt() { return _columnWorkStartDt; }
    /**
     * WORK_END_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkEndDt() { return _columnWorkEndDt; }
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
        ls.add(columnHtReceiveInspectionId());
        ls.add(columnMacAddress());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnWarehouseId());
        ls.add(columnProductId());
        ls.add(columnJanCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnStockTypeId());
        ls.add(columnStkClsNm());
        ls.add(columnPieceQtyRcvOrd());
        ls.add(columnPieceQtyRcv());
        ls.add(columnRcvLocId());
        ls.add(columnRcvLocCd());
        ls.add(columnRcvLocNm());
        ls.add(columnHtWorkNo());
        ls.add(columnOnsNum());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnLabelSelect());
        ls.add(columnWorkStartDt());
        ls.add(columnWorkEndDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtReceiveInspectionId()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK5", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK7", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK4", "TLot", this, TLotDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }
    /**
     * M_LOCATION by my RCV_LOC_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRcvLocId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK6", "MLocation", this, MLocationDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK3", "MStockType", this, MStockTypeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }
    /**
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("W_HT_RECEIVE_INSPECTION_FK2", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "WHtReceiveInspectionList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtReceiveInspection"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtReceiveInspectionCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtReceiveInspectionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtReceiveInspection> getEntityType() { return WHtReceiveInspection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtReceiveInspection newEntity() { return new WHtReceiveInspection(); }
    public WHtReceiveInspection newMyEntity() { return new WHtReceiveInspection(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtReceiveInspection)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtReceiveInspection)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
