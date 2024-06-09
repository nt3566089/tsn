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
 * The DB meta of W_HT_RECEIVE_NO_PLAN_INSP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveNoPlanInspDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtReceiveNoPlanInspDbm _instance = new WHtReceiveNoPlanInspDbm();
    private WHtReceiveNoPlanInspDbm() {}
    public static WHtReceiveNoPlanInspDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getHtReceiveNoPlanInspId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setHtReceiveNoPlanInspId(ctl(vl)), "htReceiveNoPlanInspId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getMacAddress(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getClientId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getCenterId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getWarehouseId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getProductId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getJanCd(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getProductCd(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getProductNm(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getDepositId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getDepositNm(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setDepositNm((String)vl), "depositNm");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getProcessTypeId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getProcessTypeNm(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setProcessTypeNm((String)vl), "processTypeNm");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getStockTypeId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getStockTypeNm(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getClientReceiveNo(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setClientReceiveNo((String)vl), "clientReceiveNo");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getSupplierId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getSupplierCd(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getSupplierNm(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setSupplierNm((String)vl), "supplierNm");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getPieceQtyRcv(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setPieceQtyRcv(ctb(vl)), "pieceQtyRcv");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getRcvLocId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setRcvLocId(ctl(vl)), "rcvLocId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getRcvLocCd(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setRcvLocCd((String)vl), "rcvLocCd");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getRcvLocNm(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setRcvLocNm((String)vl), "rcvLocNm");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getHtWorkNo(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setHtWorkNo((String)vl), "htWorkNo");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getStoreNo(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setStoreNo((String)vl), "storeNo");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getLotId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getLot(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getLimitDt(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getLabelSelect(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setLabelSelect((String)vl), "labelSelect");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getWorkStartDt(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setWorkStartDt(cttp(vl)), "workStartDt");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getWorkEndDt(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setWorkEndDt(cttp(vl)), "workEndDt");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getDelFlg(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getVersionNo(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getControlNo(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getAddDt(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getAddUser(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getAddProcess(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getUpdDt(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getUpdUser(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtReceiveNoPlanInsp)et).getUpdProcess(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMCenter(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMClient(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMCustomerByDepositId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMCustomerByDepositId((MCustomer)vl), "MCustomerByDepositId");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getTLot(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMProcessType(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMProcessType((MProcessType)vl), "MProcessType");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMProduct(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMLocation(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMStockType(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMCustomerBySupplierId(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMCustomerBySupplierId((MCustomer)vl), "MCustomerBySupplierId");
        setupEfpg(_efpgMap, et -> ((WHtReceiveNoPlanInsp)et).getMWarehouse(), (et, vl) -> ((WHtReceiveNoPlanInsp)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_HT_RECEIVE_NO_PLAN_INSP";
    protected final String _tableDispName = "W_HT_RECEIVE_NO_PLAN_INSP";
    protected final String _tablePropertyName = "WHtReceiveNoPlanInsp";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_HT_RECEIVE_NO_PLAN_INSP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtReceiveNoPlanInspId = cci("HT_RECEIVE_NO_PLAN_INSP_ID", "HT_RECEIVE_NO_PLAN_INSP_ID", null, null, Long.class, "htReceiveNoPlanInspId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerByDepositId", null, null, false);
    protected final ColumnInfo _columnDepositNm = cci("DEPOSIT_NM", "DEPOSIT_NM", null, null, String.class, "depositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProcessType", null, null, false);
    protected final ColumnInfo _columnProcessTypeNm = cci("PROCESS_TYPE_NM", "PROCESS_TYPE_NM", null, null, String.class, "processTypeNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("STOCK_TYPE_NM", "STOCK_TYPE_NM", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientReceiveNo = cci("CLIENT_RECEIVE_NO", "CLIENT_RECEIVE_NO", null, null, String.class, "clientReceiveNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomerBySupplierId", null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierNm = cci("SUPPLIER_NM", "SUPPLIER_NM", null, null, String.class, "supplierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPieceQtyRcv = cci("PIECE_QTY_RCV", "PIECE_QTY_RCV", null, null, java.math.BigDecimal.class, "pieceQtyRcv", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvLocId = cci("RCV_LOC_ID", "RCV_LOC_ID", null, null, Long.class, "rcvLocId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnRcvLocCd = cci("RCV_LOC_CD", "RCV_LOC_CD", null, null, String.class, "rcvLocCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvLocNm = cci("RCV_LOC_NM", "RCV_LOC_NM", null, null, String.class, "rcvLocNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtWorkNo = cci("HT_WORK_NO", "HT_WORK_NO", null, null, String.class, "htWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNo = cci("STORE_NO", "STORE_NO", null, null, String.class, "storeNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * HT_RECEIVE_NO_PLAN_INSP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtReceiveNoPlanInspId() { return _columnHtReceiveNoPlanInspId; }
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
     * DEPOSIT_ID: {bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositNm() { return _columnDepositNm; }
    /**
     * PROCESS_TYPE_ID: {bigint(19), FK to M_PROCESS_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * PROCESS_TYPE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeNm() { return _columnProcessTypeNm; }
    /**
     * STOCK_TYPE_ID: {bigint(19), FK to M_STOCK_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STOCK_TYPE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeNm() { return _columnStockTypeNm; }
    /**
     * CLIENT_RECEIVE_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientReceiveNo() { return _columnClientReceiveNo; }
    /**
     * SUPPLIER_ID: {bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * SUPPLIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SUPPLIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierNm() { return _columnSupplierNm; }
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
     * STORE_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNo() { return _columnStoreNo; }
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
        ls.add(columnHtReceiveNoPlanInspId());
        ls.add(columnMacAddress());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnWarehouseId());
        ls.add(columnProductId());
        ls.add(columnJanCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnDepositId());
        ls.add(columnDepositNm());
        ls.add(columnProcessTypeId());
        ls.add(columnProcessTypeNm());
        ls.add(columnStockTypeId());
        ls.add(columnStockTypeNm());
        ls.add(columnClientReceiveNo());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnSupplierNm());
        ls.add(columnPieceQtyRcv());
        ls.add(columnRcvLocId());
        ls.add(columnRcvLocCd());
        ls.add(columnRcvLocNm());
        ls.add(columnHtWorkNo());
        ls.add(columnStoreNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtReceiveNoPlanInspId()); }
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
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK4", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK5", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByDepositId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK10", "MCustomerByDepositId", this, MCustomerDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspByDepositIdList", false);
    }
    /**
     * T_LOT by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK7", "TLot", this, TLotDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProcessType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProcessTypeId(), MProcessTypeDbm.getInstance().columnProcessTypeId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK2", "MProcessType", this, MProcessTypeDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_LOCATION by my RCV_LOC_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRcvLocId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK6", "MLocation", this, MLocationDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK9", "MStockType", this, MStockTypeDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
    }
    /**
     * M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerBySupplierId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK8", "MCustomerBySupplierId", this, MCustomerDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspBySupplierIdList", false);
    }
    /**
     * M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("W_HT_RECEIVE_NO_PLAN_INSP_FK3", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 9, null, false, false, false, false, null, null, false, "WHtReceiveNoPlanInspList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtReceiveNoPlanInspCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtReceiveNoPlanInspBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtReceiveNoPlanInsp> getEntityType() { return WHtReceiveNoPlanInsp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtReceiveNoPlanInsp newEntity() { return new WHtReceiveNoPlanInsp(); }
    public WHtReceiveNoPlanInsp newMyEntity() { return new WHtReceiveNoPlanInsp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtReceiveNoPlanInsp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtReceiveNoPlanInsp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
