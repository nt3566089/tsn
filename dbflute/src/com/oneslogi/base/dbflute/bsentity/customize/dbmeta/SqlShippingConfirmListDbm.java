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
 * The DB meta of SqlShippingConfirmList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingConfirmListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingConfirmListDbm _instance = new SqlShippingConfirmListDbm();
    private SqlShippingConfirmListDbm() {}
    public static SqlShippingConfirmListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getAllocInstHId(), (et, vl) -> ((SqlShippingConfirmList)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPickingHId(), (et, vl) -> ((SqlShippingConfirmList)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getUpdDt(), (et, vl) -> ((SqlShippingConfirmList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPicking(), (et, vl) -> ((SqlShippingConfirmList)et).setPicking(ctl(vl)), "picking");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getClientId(), (et, vl) -> ((SqlShippingConfirmList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getClientCd(), (et, vl) -> ((SqlShippingConfirmList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getClientNm(), (et, vl) -> ((SqlShippingConfirmList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getCenterId(), (et, vl) -> ((SqlShippingConfirmList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getCenterCd(), (et, vl) -> ((SqlShippingConfirmList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getCenterNm(), (et, vl) -> ((SqlShippingConfirmList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getEmergencyFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getStockOutFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setStockOutFlg((String)vl), "stockOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getWorkDt(), (et, vl) -> ((SqlShippingConfirmList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingDt(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingHUpdDt(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingHUpdDt(cttp(vl)), "shippingHUpdDt");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPickingTime(), (et, vl) -> ((SqlShippingConfirmList)et).setPickingTime((String)vl), "pickingTime");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getStowageTime(), (et, vl) -> ((SqlShippingConfirmList)et).setStowageTime((String)vl), "stowageTime");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingTime(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingTime((String)vl), "shippingTime");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getDeliveryCourseCd(), (et, vl) -> ((SqlShippingConfirmList)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getDeliveryCourseNm(), (et, vl) -> ((SqlShippingConfirmList)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getCarrierCd(), (et, vl) -> ((SqlShippingConfirmList)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getCarrierNm(), (et, vl) -> ((SqlShippingConfirmList)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getSupplyCustomerCd(), (et, vl) -> ((SqlShippingConfirmList)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getSupplyCustomerNm(), (et, vl) -> ((SqlShippingConfirmList)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getDelivCustomerCd(), (et, vl) -> ((SqlShippingConfirmList)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getDelivCustomerNm(), (et, vl) -> ((SqlShippingConfirmList)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPickingBatchNo(), (et, vl) -> ((SqlShippingConfirmList)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPickingWorkNo(), (et, vl) -> ((SqlShippingConfirmList)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPickingStatus(), (et, vl) -> ((SqlShippingConfirmList)et).setPickingStatus((String)vl), "pickingStatus");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPickingStatusNm(), (et, vl) -> ((SqlShippingConfirmList)et).setPickingStatusNm((String)vl), "pickingStatusNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getBolNo(), (et, vl) -> ((SqlShippingConfirmList)et).setBolNo((String)vl), "bolNo");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingSlipNo(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingSlipNo(ctl(vl)), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingHCount(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingHCount(ctl(vl)), "shippingHCount");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getInstNum(), (et, vl) -> ((SqlShippingConfirmList)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getAllocNum(), (et, vl) -> ((SqlShippingConfirmList)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getPackingHId(), (et, vl) -> ((SqlShippingConfirmList)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getGrossWeight(), (et, vl) -> ((SqlShippingConfirmList)et).setGrossWeight(ctb(vl)), "grossWeight");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getTotalVolume(), (et, vl) -> ((SqlShippingConfirmList)et).setTotalVolume(ctb(vl)), "totalVolume");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getInvoiceCreateFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setInvoiceCreateFlg((String)vl), "invoiceCreateFlg");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getInvoiceCreateFlgNm(), (et, vl) -> ((SqlShippingConfirmList)et).setInvoiceCreateFlgNm((String)vl), "invoiceCreateFlgNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getForceFixedFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setForceFixedFlg((String)vl), "forceFixedFlg");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getForceFixedFlgNm(), (et, vl) -> ((SqlShippingConfirmList)et).setForceFixedFlgNm((String)vl), "forceFixedFlgNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingStopFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getShippingStopFlgNm(), (et, vl) -> ((SqlShippingConfirmList)et).setShippingStopFlgNm((String)vl), "shippingStopFlgNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getStopFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setStopFlg((String)vl), "stopFlg");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getStopFlgNm(), (et, vl) -> ((SqlShippingConfirmList)et).setStopFlgNm((String)vl), "stopFlgNm");
        setupEpg(_epgMap, et -> ((SqlShippingConfirmList)et).getCenterTransitFlg(), (et, vl) -> ((SqlShippingConfirmList)et).setCenterTransitFlg((String)vl), "centerTransitFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingConfirmList";
    protected final String _tableDispName = "SqlShippingConfirmList";
    protected final String _tablePropertyName = "sqlShippingConfirmList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingConfirmList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicking = cci("PICKING", "PICKING", null, null, Long.class, "picking", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutFlg = cci("STOCK_OUT_FLG", "STOCK_OUT_FLG", null, null, String.class, "stockOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingHUpdDt = cci("SHIPPING_H_UPD_DT", "SHIPPING_H_UPD_DT", null, null, java.sql.Timestamp.class, "shippingHUpdDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingTime = cci("PICKING_TIME", "PICKING_TIME", null, null, String.class, "pickingTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStowageTime = cci("STOWAGE_TIME", "STOWAGE_TIME", null, null, String.class, "stowageTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTime = cci("SHIPPING_TIME", "SHIPPING_TIME", null, null, String.class, "shippingTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("PICKING_BATCH_NO", "PICKING_BATCH_NO", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingStatus = cci("PICKING_STATUS", "PICKING_STATUS", null, null, String.class, "pickingStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, CDef.DefMeta.ShippingStatus, false);
    protected final ColumnInfo _columnPickingStatusNm = cci("PICKING_STATUS_NM", "PICKING_STATUS_NM", null, null, String.class, "pickingStatusNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolNo = cci("BOL_NO", "BOL_NO", null, null, String.class, "bolNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, Long.class, "shippingSlipNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingHCount = cci("SHIPPING_H_COUNT", "SHIPPING_H_COUNT", null, null, Long.class, "shippingHCount", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "grossWeight", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalVolume = cci("TOTAL_VOLUME", "TOTAL_VOLUME", null, null, java.math.BigDecimal.class, "totalVolume", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlg = cci("INVOICE_CREATE_FLG", "INVOICE_CREATE_FLG", null, null, String.class, "invoiceCreateFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlgNm = cci("INVOICE_CREATE_FLG_NM", "INVOICE_CREATE_FLG_NM", null, null, String.class, "invoiceCreateFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForceFixedFlg = cci("FORCE_FIXED_FLG", "FORCE_FIXED_FLG", null, null, String.class, "forceFixedFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.ForceFixedFlg, false);
    protected final ColumnInfo _columnForceFixedFlgNm = cci("FORCE_FIXED_FLG_NM", "FORCE_FIXED_FLG_NM", null, null, String.class, "forceFixedFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopFlgNm = cci("SHIPPING_STOP_FLG_NM", "SHIPPING_STOP_FLG_NM", null, null, String.class, "shippingStopFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStopFlg = cci("STOP_FLG", "STOP_FLG", null, null, String.class, "stopFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStopFlgNm = cci("STOP_FLG_NM", "STOP_FLG_NM", null, null, String.class, "stopFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterTransitFlg = cci("CENTER_TRANSIT_FLG", "CENTER_TRANSIT_FLG", null, null, String.class, "centerTransitFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.CenterTransitFlg, false);

    /**
     * ALLOC_INST_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * PICKING_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * PICKING: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicking() { return _columnPicking; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
     * EMERGENCY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * STOCK_OUT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutFlg() { return _columnStockOutFlg; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * SHIPPING_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * SHIPPING_H_UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingHUpdDt() { return _columnShippingHUpdDt; }
    /**
     * PICKING_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingTime() { return _columnPickingTime; }
    /**
     * STOWAGE_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStowageTime() { return _columnStowageTime; }
    /**
     * SHIPPING_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTime() { return _columnShippingTime; }
    /**
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * CARRIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * SUPPLY_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerCd() { return _columnDelivCustomerCd; }
    /**
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * PICKING_BATCH_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
    /**
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * PICKING_STATUS: {varchar(30), classification=ShippingStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingStatus() { return _columnPickingStatus; }
    /**
     * PICKING_STATUS_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingStatusNm() { return _columnPickingStatusNm; }
    /**
     * BOL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolNo() { return _columnBolNo; }
    /**
     * SHIPPING_SLIP_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * SHIPPING_H_COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingHCount() { return _columnShippingHCount; }
    /**
     * INST_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * ALLOC_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * PACKING_H_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * GROSS_WEIGHT: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * TOTAL_VOLUME: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalVolume() { return _columnTotalVolume; }
    /**
     * INVOICE_CREATE_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlg() { return _columnInvoiceCreateFlg; }
    /**
     * INVOICE_CREATE_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlgNm() { return _columnInvoiceCreateFlgNm; }
    /**
     * FORCE_FIXED_FLG: {char(1), classification=ForceFixedFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceFixedFlg() { return _columnForceFixedFlg; }
    /**
     * FORCE_FIXED_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceFixedFlgNm() { return _columnForceFixedFlgNm; }
    /**
     * SHIPPING_STOP_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * SHIPPING_STOP_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlgNm() { return _columnShippingStopFlgNm; }
    /**
     * STOP_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStopFlg() { return _columnStopFlg; }
    /**
     * STOP_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStopFlgNm() { return _columnStopFlgNm; }
    /**
     * CENTER_TRANSIT_FLG: {char(1), classification=CenterTransitFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterTransitFlg() { return _columnCenterTransitFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAllocInstHId());
        ls.add(columnPickingHId());
        ls.add(columnUpdDt());
        ls.add(columnPicking());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnEmergencyFlg());
        ls.add(columnStockOutFlg());
        ls.add(columnWorkDt());
        ls.add(columnShippingDt());
        ls.add(columnShippingHUpdDt());
        ls.add(columnPickingTime());
        ls.add(columnStowageTime());
        ls.add(columnShippingTime());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivCustomerNm());
        ls.add(columnPickingBatchNo());
        ls.add(columnPickingWorkNo());
        ls.add(columnPickingStatus());
        ls.add(columnPickingStatusNm());
        ls.add(columnBolNo());
        ls.add(columnShippingSlipNo());
        ls.add(columnShippingHCount());
        ls.add(columnInstNum());
        ls.add(columnAllocNum());
        ls.add(columnPackingHId());
        ls.add(columnGrossWeight());
        ls.add(columnTotalVolume());
        ls.add(columnInvoiceCreateFlg());
        ls.add(columnInvoiceCreateFlgNm());
        ls.add(columnForceFixedFlg());
        ls.add(columnForceFixedFlgNm());
        ls.add(columnShippingStopFlg());
        ls.add(columnShippingStopFlgNm());
        ls.add(columnStopFlg());
        ls.add(columnStopFlgNm());
        ls.add(columnCenterTransitFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingConfirmList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingConfirmList> getEntityType() { return SqlShippingConfirmList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingConfirmList newEntity() { return new SqlShippingConfirmList(); }
    public SqlShippingConfirmList newMyEntity() { return new SqlShippingConfirmList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingConfirmList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingConfirmList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
