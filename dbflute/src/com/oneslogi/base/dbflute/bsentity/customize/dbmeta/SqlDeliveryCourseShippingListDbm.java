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
 * The DB meta of SqlDeliveryCourseShippingList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlDeliveryCourseShippingListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlDeliveryCourseShippingListDbm _instance = new SqlDeliveryCourseShippingListDbm();
    private SqlDeliveryCourseShippingListDbm() {}
    public static SqlDeliveryCourseShippingListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getClientId(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getClientCd(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getClientNm(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCenterId(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCenterCd(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCenterNm(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getEmergencyFlg(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getErrorFlg(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCancelFlg(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCancelFlg((String)vl), "cancelFlg");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getStockOutFlg(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setStockOutFlg((String)vl), "stockOutFlg");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getWorkDt(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingDt(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getMaxUpdDt(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setMaxUpdDt(cttp(vl)), "maxUpdDt");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getPickingTime(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setPickingTime((String)vl), "pickingTime");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getStowageTime(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setStowageTime((String)vl), "stowageTime");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingTime(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingTime((String)vl), "shippingTime");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getDeliveryCourseCd(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getDeliveryCourseNm(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCarrierCd(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCarrierNm(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCountSupplyCustomerCd(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCountSupplyCustomerCd(ctl(vl)), "countSupplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getPickingBatchNo(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingStatus(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingStatus((String)vl), "shippingStatus");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingStatusMax(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingStatusMax((String)vl), "shippingStatusMax");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingStatusNm(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingStatusNm((String)vl), "shippingStatusNm");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingSlipNo(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingSlipNo(cti(vl)), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getNum(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setNum(cti(vl)), "num");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getTsihNum(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setTsihNum(ctl(vl)), "tsihNum");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCountProductCd(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCountProductCd(cti(vl)), "countProductCd");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getInstNum(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getAllocNum(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getCountShippingPackingNo(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setCountShippingPackingNo(cti(vl)), "countShippingPackingNo");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getSumGrossWeight(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setSumGrossWeight(ctb(vl)), "sumGrossWeight");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getPicListStatus1(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setPicListStatus1(cti(vl)), "picListStatus1");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getPicListStatus2(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setPicListStatus2(cti(vl)), "picListStatus2");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getChkStatus(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setChkStatus(cti(vl)), "chkStatus");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getInvoiceCreate(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setInvoiceCreate(cti(vl)), "invoiceCreate");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getPackingOut(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setPackingOut(cti(vl)), "packingOut");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getLoadingStatus(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setLoadingStatus(cti(vl)), "loadingStatus");
        setupEpg(_epgMap, et -> ((SqlDeliveryCourseShippingList)et).getShippingFixed(), (et, vl) -> ((SqlDeliveryCourseShippingList)et).setShippingFixed(cti(vl)), "shippingFixed");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlDeliveryCourseShippingList";
    protected final String _tableDispName = "SqlDeliveryCourseShippingList";
    protected final String _tablePropertyName = "sqlDeliveryCourseShippingList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlDeliveryCourseShippingList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCancelFlg = cci("CANCEL_FLG", "CANCEL_FLG", null, null, String.class, "cancelFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutFlg = cci("STOCK_OUT_FLG", "STOCK_OUT_FLG", null, null, String.class, "stockOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxUpdDt = cci("MAX_UPD_DT", "MAX_UPD_DT", null, null, java.sql.Timestamp.class, "maxUpdDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingTime = cci("PICKING_TIME", "PICKING_TIME", null, null, String.class, "pickingTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStowageTime = cci("STOWAGE_TIME", "STOWAGE_TIME", null, null, String.class, "stowageTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTime = cci("SHIPPING_TIME", "SHIPPING_TIME", null, null, String.class, "shippingTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountSupplyCustomerCd = cci("COUNT_SUPPLY_CUSTOMER_CD", "COUNT_SUPPLY_CUSTOMER_CD", null, null, Long.class, "countSupplyCustomerCd", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("PICKING_BATCH_NO", "PICKING_BATCH_NO", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStatus = cci("SHIPPING_STATUS", "SHIPPING_STATUS", null, null, String.class, "shippingStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, CDef.DefMeta.ShippingStatus, false);
    protected final ColumnInfo _columnShippingStatusMax = cci("SHIPPING_STATUS_MAX", "SHIPPING_STATUS_MAX", null, null, String.class, "shippingStatusMax", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, CDef.DefMeta.ShippingStatus, false);
    protected final ColumnInfo _columnShippingStatusNm = cci("SHIPPING_STATUS_NM", "SHIPPING_STATUS_NM", null, null, String.class, "shippingStatusNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, Integer.class, "shippingSlipNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, Integer.class, "num", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsihNum = cci("TSIH_NUM", "TSIH_NUM", null, null, Long.class, "tsihNum", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountProductCd = cci("COUNT_PRODUCT_CD", "COUNT_PRODUCT_CD", null, null, Integer.class, "countProductCd", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountShippingPackingNo = cci("COUNT_SHIPPING_PACKING_NO", "COUNT_SHIPPING_PACKING_NO", null, null, Integer.class, "countShippingPackingNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumGrossWeight = cci("SUM_GROSS_WEIGHT", "SUM_GROSS_WEIGHT", null, null, java.math.BigDecimal.class, "sumGrossWeight", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicListStatus1 = cci("PIC_LIST_STATUS1", "PIC_LIST_STATUS1", null, null, Integer.class, "picListStatus1", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicListStatus2 = cci("PIC_LIST_STATUS2", "PIC_LIST_STATUS2", null, null, Integer.class, "picListStatus2", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChkStatus = cci("CHK_STATUS", "CHK_STATUS", null, null, Integer.class, "chkStatus", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreate = cci("INVOICE_CREATE", "INVOICE_CREATE", null, null, Integer.class, "invoiceCreate", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingOut = cci("PACKING_OUT", "PACKING_OUT", null, null, Integer.class, "packingOut", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadingStatus = cci("LOADING_STATUS", "LOADING_STATUS", null, null, Integer.class, "loadingStatus", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingFixed = cci("SHIPPING_FIXED", "SHIPPING_FIXED", null, null, Integer.class, "shippingFixed", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

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
     * ERROR_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * CANCEL_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCancelFlg() { return _columnCancelFlg; }
    /**
     * STOCK_OUT_FLG: {varchar(1)}
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
     * MAX_UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxUpdDt() { return _columnMaxUpdDt; }
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
     * COUNT_SUPPLY_CUSTOMER_CD: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountSupplyCustomerCd() { return _columnCountSupplyCustomerCd; }
    /**
     * PICKING_BATCH_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
    /**
     * SHIPPING_STATUS: {varchar(30), classification=ShippingStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStatus() { return _columnShippingStatus; }
    /**
     * SHIPPING_STATUS_MAX: {varchar(30), classification=ShippingStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStatusMax() { return _columnShippingStatusMax; }
    /**
     * SHIPPING_STATUS_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStatusNm() { return _columnShippingStatusNm; }
    /**
     * SHIPPING_SLIP_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * NUM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * TSIH_NUM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsihNum() { return _columnTsihNum; }
    /**
     * COUNT_PRODUCT_CD: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountProductCd() { return _columnCountProductCd; }
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
     * COUNT_SHIPPING_PACKING_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountShippingPackingNo() { return _columnCountShippingPackingNo; }
    /**
     * SUM_GROSS_WEIGHT: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumGrossWeight() { return _columnSumGrossWeight; }
    /**
     * PIC_LIST_STATUS1: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicListStatus1() { return _columnPicListStatus1; }
    /**
     * PIC_LIST_STATUS2: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicListStatus2() { return _columnPicListStatus2; }
    /**
     * CHK_STATUS: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChkStatus() { return _columnChkStatus; }
    /**
     * INVOICE_CREATE: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreate() { return _columnInvoiceCreate; }
    /**
     * PACKING_OUT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOut() { return _columnPackingOut; }
    /**
     * LOADING_STATUS: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadingStatus() { return _columnLoadingStatus; }
    /**
     * SHIPPING_FIXED: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingFixed() { return _columnShippingFixed; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnEmergencyFlg());
        ls.add(columnErrorFlg());
        ls.add(columnCancelFlg());
        ls.add(columnStockOutFlg());
        ls.add(columnWorkDt());
        ls.add(columnShippingDt());
        ls.add(columnMaxUpdDt());
        ls.add(columnPickingTime());
        ls.add(columnStowageTime());
        ls.add(columnShippingTime());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnCountSupplyCustomerCd());
        ls.add(columnPickingBatchNo());
        ls.add(columnShippingStatus());
        ls.add(columnShippingStatusMax());
        ls.add(columnShippingStatusNm());
        ls.add(columnShippingSlipNo());
        ls.add(columnNum());
        ls.add(columnTsihNum());
        ls.add(columnCountProductCd());
        ls.add(columnInstNum());
        ls.add(columnAllocNum());
        ls.add(columnCountShippingPackingNo());
        ls.add(columnSumGrossWeight());
        ls.add(columnPicListStatus1());
        ls.add(columnPicListStatus2());
        ls.add(columnChkStatus());
        ls.add(columnInvoiceCreate());
        ls.add(columnPackingOut());
        ls.add(columnLoadingStatus());
        ls.add(columnShippingFixed());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlDeliveryCourseShippingList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlDeliveryCourseShippingList> getEntityType() { return SqlDeliveryCourseShippingList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlDeliveryCourseShippingList newEntity() { return new SqlDeliveryCourseShippingList(); }
    public SqlDeliveryCourseShippingList newMyEntity() { return new SqlDeliveryCourseShippingList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlDeliveryCourseShippingList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlDeliveryCourseShippingList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
