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
 * The DB meta of SqlShippingInstList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlShippingInstListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlShippingInstListDbm _instance = new SqlShippingInstListDbm();
    private SqlShippingInstListDbm() {}
    public static SqlShippingInstListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingInstHId(), (et, vl) -> ((SqlShippingInstList)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getClientId(), (et, vl) -> ((SqlShippingInstList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getClientCd(), (et, vl) -> ((SqlShippingInstList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getClientNm(), (et, vl) -> ((SqlShippingInstList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCenterId(), (et, vl) -> ((SqlShippingInstList)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCenterCd(), (et, vl) -> ((SqlShippingInstList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCenterNm(), (et, vl) -> ((SqlShippingInstList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getWorkDt(), (et, vl) -> ((SqlShippingInstList)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingDt(), (et, vl) -> ((SqlShippingInstList)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPickingBatchNo(), (et, vl) -> ((SqlShippingInstList)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSupplyCustomerCd(), (et, vl) -> ((SqlShippingInstList)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSupplyCustomerNm(), (et, vl) -> ((SqlShippingInstList)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivCustomerCd(), (et, vl) -> ((SqlShippingInstList)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivCustomerNm(), (et, vl) -> ((SqlShippingInstList)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getBolNo(), (et, vl) -> ((SqlShippingInstList)et).setBolNo((String)vl), "bolNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getBolOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setBolOutFlg((String)vl), "bolOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getBolOutNm(), (et, vl) -> ((SqlShippingInstList)et).setBolOutNm((String)vl), "bolOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingSlipNo(), (et, vl) -> ((SqlShippingInstList)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getClientShippingNo(), (et, vl) -> ((SqlShippingInstList)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingStatus(), (et, vl) -> ((SqlShippingInstList)et).setShippingStatus((String)vl), "shippingStatus");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingStatusNm(), (et, vl) -> ((SqlShippingInstList)et).setShippingStatusNm((String)vl), "shippingStatusNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDeliveryCourseCd(), (et, vl) -> ((SqlShippingInstList)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDeliveryCourseNm(), (et, vl) -> ((SqlShippingInstList)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCarrierCd(), (et, vl) -> ((SqlShippingInstList)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCarrierNm(), (et, vl) -> ((SqlShippingInstList)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSlipNo(), (et, vl) -> ((SqlShippingInstList)et).setSlipNo(ctl(vl)), "slipNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getLineNo(), (et, vl) -> ((SqlShippingInstList)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getProductId(), (et, vl) -> ((SqlShippingInstList)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getInstNum(), (et, vl) -> ((SqlShippingInstList)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getAllocNum(), (et, vl) -> ((SqlShippingInstList)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getStockOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setStockOutFlg((String)vl), "stockOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getOplOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setOplOutFlg((String)vl), "oplOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getMltOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setMltOutFlg((String)vl), "mltOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getTplOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setTplOutFlg((String)vl), "tplOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPlOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setPlOutFlg((String)vl), "plOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSplOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setSplOutFlg((String)vl), "splOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPl1OutFlg(), (et, vl) -> ((SqlShippingInstList)et).setPl1OutFlg((String)vl), "pl1OutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPl2OutFlg(), (et, vl) -> ((SqlShippingInstList)et).setPl2OutFlg((String)vl), "pl2OutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCaseOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setCaseOutFlg((String)vl), "caseOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getInspectionOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setInspectionOutFlg((String)vl), "inspectionOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSlOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setSlOutFlg((String)vl), "slOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPackingOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setPackingOutFlg((String)vl), "packingOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getInvoiceCreateFlg(), (et, vl) -> ((SqlShippingInstList)et).setInvoiceCreateFlg((String)vl), "invoiceCreateFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getStwOutFlg(), (et, vl) -> ((SqlShippingInstList)et).setStwOutFlg((String)vl), "stwOutFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getOplOutNm(), (et, vl) -> ((SqlShippingInstList)et).setOplOutNm((String)vl), "oplOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getMltOutNm(), (et, vl) -> ((SqlShippingInstList)et).setMltOutNm((String)vl), "mltOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getTplOutNm(), (et, vl) -> ((SqlShippingInstList)et).setTplOutNm((String)vl), "tplOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPlOutNm(), (et, vl) -> ((SqlShippingInstList)et).setPlOutNm((String)vl), "plOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSplOutNm(), (et, vl) -> ((SqlShippingInstList)et).setSplOutNm((String)vl), "splOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPl1OutNm(), (et, vl) -> ((SqlShippingInstList)et).setPl1OutNm((String)vl), "pl1OutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPl2OutNm(), (et, vl) -> ((SqlShippingInstList)et).setPl2OutNm((String)vl), "pl2OutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getCaseOutNm(), (et, vl) -> ((SqlShippingInstList)et).setCaseOutNm((String)vl), "caseOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getInspectionOutNm(), (et, vl) -> ((SqlShippingInstList)et).setInspectionOutNm((String)vl), "inspectionOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getSlOutNm(), (et, vl) -> ((SqlShippingInstList)et).setSlOutNm((String)vl), "slOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPackingOutNm(), (et, vl) -> ((SqlShippingInstList)et).setPackingOutNm((String)vl), "packingOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getInvoiceCreateNm(), (et, vl) -> ((SqlShippingInstList)et).setInvoiceCreateNm((String)vl), "invoiceCreateNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getStwOutNm(), (et, vl) -> ((SqlShippingInstList)et).setStwOutNm((String)vl), "stwOutNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPickingNum(), (et, vl) -> ((SqlShippingInstList)et).setPickingNum(ctb(vl)), "pickingNum");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getInspectionNum(), (et, vl) -> ((SqlShippingInstList)et).setInspectionNum(ctb(vl)), "inspectionNum");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getLoadingStatus(), (et, vl) -> ((SqlShippingInstList)et).setLoadingStatus(cti(vl)), "loadingStatus");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPickingWorkNo(), (et, vl) -> ((SqlShippingInstList)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivUnitNo(), (et, vl) -> ((SqlShippingInstList)et).setDelivUnitNo((String)vl), "delivUnitNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivPlanDt(), (et, vl) -> ((SqlShippingInstList)et).setDelivPlanDt((String)vl), "delivPlanDt");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivDt(), (et, vl) -> ((SqlShippingInstList)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivTz(), (et, vl) -> ((SqlShippingInstList)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getDelivTzNm(), (et, vl) -> ((SqlShippingInstList)et).setDelivTzNm((String)vl), "delivTzNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getMessageNm(), (et, vl) -> ((SqlShippingInstList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPickingWorkMessage(), (et, vl) -> ((SqlShippingInstList)et).setPickingWorkMessage((String)vl), "pickingWorkMessage");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPickingWorkMessageCount(), (et, vl) -> ((SqlShippingInstList)et).setPickingWorkMessageCount(ctl(vl)), "pickingWorkMessageCount");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getEmergencyFlg(), (et, vl) -> ((SqlShippingInstList)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getUpdDt(), (et, vl) -> ((SqlShippingInstList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getPickingWorkNoCnt(), (et, vl) -> ((SqlShippingInstList)et).setPickingWorkNoCnt(ctl(vl)), "pickingWorkNoCnt");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getUpdDtH(), (et, vl) -> ((SqlShippingInstList)et).setUpdDtH(cttp(vl)), "updDtH");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingStopCs(), (et, vl) -> ((SqlShippingInstList)et).setShippingStopCs((String)vl), "shippingStopCs");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingStopCsNm(), (et, vl) -> ((SqlShippingInstList)et).setShippingStopCsNm((String)vl), "shippingStopCsNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingStopPd(), (et, vl) -> ((SqlShippingInstList)et).setShippingStopPd((String)vl), "shippingStopPd");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getShippingStopPdNm(), (et, vl) -> ((SqlShippingInstList)et).setShippingStopPdNm((String)vl), "shippingStopPdNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getForceFixedFlg(), (et, vl) -> ((SqlShippingInstList)et).setForceFixedFlg((String)vl), "forceFixedFlg");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getForceFixedFlgNm(), (et, vl) -> ((SqlShippingInstList)et).setForceFixedFlgNm((String)vl), "forceFixedFlgNm");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getNum(), (et, vl) -> ((SqlShippingInstList)et).setNum(ctl(vl)), "num");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getVersionNo(), (et, vl) -> ((SqlShippingInstList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlShippingInstList)et).getControlNo(), (et, vl) -> ((SqlShippingInstList)et).setControlNo(ctl(vl)), "controlNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlShippingInstList";
    protected final String _tableDispName = "SqlShippingInstList";
    protected final String _tablePropertyName = "sqlShippingInstList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlShippingInstList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("PICKING_BATCH_NO", "PICKING_BATCH_NO", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolNo = cci("BOL_NO", "BOL_NO", null, null, String.class, "bolNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutFlg = cci("BOL_OUT_FLG", "BOL_OUT_FLG", null, null, String.class, "bolOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutNm = cci("BOL_OUT_NM", "BOL_OUT_NM", null, null, String.class, "bolOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStatus = cci("SHIPPING_STATUS", "SHIPPING_STATUS", null, null, String.class, "shippingStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStatusNm = cci("SHIPPING_STATUS_NM", "SHIPPING_STATUS_NM", null, null, String.class, "shippingStatusNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNo = cci("SLIP_NO", "SLIP_NO", null, null, Long.class, "slipNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutFlg = cci("STOCK_OUT_FLG", "STOCK_OUT_FLG", null, null, String.class, "stockOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOplOutFlg = cci("OPL_OUT_FLG", "OPL_OUT_FLG", null, null, String.class, "oplOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMltOutFlg = cci("MLT_OUT_FLG", "MLT_OUT_FLG", null, null, String.class, "mltOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTplOutFlg = cci("TPL_OUT_FLG", "TPL_OUT_FLG", null, null, String.class, "tplOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutFlg = cci("PL_OUT_FLG", "PL_OUT_FLG", null, null, String.class, "plOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplOutFlg = cci("SPL_OUT_FLG", "SPL_OUT_FLG", null, null, String.class, "splOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl1OutFlg = cci("PL1_OUT_FLG", "PL1_OUT_FLG", null, null, String.class, "pl1OutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl2OutFlg = cci("PL2_OUT_FLG", "PL2_OUT_FLG", null, null, String.class, "pl2OutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutFlg = cci("CASE_OUT_FLG", "CASE_OUT_FLG", null, null, String.class, "caseOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionOutFlg = cci("INSPECTION_OUT_FLG", "INSPECTION_OUT_FLG", null, null, String.class, "inspectionOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlOutFlg = cci("SL_OUT_FLG", "SL_OUT_FLG", null, null, String.class, "slOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingOutFlg = cci("PACKING_OUT_FLG", "PACKING_OUT_FLG", null, null, String.class, "packingOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlg = cci("INVOICE_CREATE_FLG", "INVOICE_CREATE_FLG", null, null, String.class, "invoiceCreateFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStwOutFlg = cci("STW_OUT_FLG", "STW_OUT_FLG", null, null, String.class, "stwOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOplOutNm = cci("OPL_OUT_NM", "OPL_OUT_NM", null, null, String.class, "oplOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMltOutNm = cci("MLT_OUT_NM", "MLT_OUT_NM", null, null, String.class, "mltOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTplOutNm = cci("TPL_OUT_NM", "TPL_OUT_NM", null, null, String.class, "tplOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutNm = cci("PL_OUT_NM", "PL_OUT_NM", null, null, String.class, "plOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplOutNm = cci("SPL_OUT_NM", "SPL_OUT_NM", null, null, String.class, "splOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl1OutNm = cci("PL1_OUT_NM", "PL1_OUT_NM", null, null, String.class, "pl1OutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl2OutNm = cci("PL2_OUT_NM", "PL2_OUT_NM", null, null, String.class, "pl2OutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutNm = cci("CASE_OUT_NM", "CASE_OUT_NM", null, null, String.class, "caseOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionOutNm = cci("INSPECTION_OUT_NM", "INSPECTION_OUT_NM", null, null, String.class, "inspectionOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlOutNm = cci("SL_OUT_NM", "SL_OUT_NM", null, null, String.class, "slOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingOutNm = cci("PACKING_OUT_NM", "PACKING_OUT_NM", null, null, String.class, "packingOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateNm = cci("INVOICE_CREATE_NM", "INVOICE_CREATE_NM", null, null, String.class, "invoiceCreateNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStwOutNm = cci("STW_OUT_NM", "STW_OUT_NM", null, null, String.class, "stwOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingNum = cci("PICKING_NUM", "PICKING_NUM", null, null, java.math.BigDecimal.class, "pickingNum", null, false, false, false, "decimal", 38, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionNum = cci("INSPECTION_NUM", "INSPECTION_NUM", null, null, java.math.BigDecimal.class, "inspectionNum", null, false, false, false, "decimal", 38, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadingStatus = cci("LOADING_STATUS", "LOADING_STATUS", null, null, Integer.class, "loadingStatus", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivUnitNo = cci("DELIV_UNIT_NO", "DELIV_UNIT_NO", null, null, String.class, "delivUnitNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivPlanDt = cci("DELIV_PLAN_DT", "DELIV_PLAN_DT", null, null, String.class, "delivPlanDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTzNm = cci("DELIV_TZ_NM", "DELIV_TZ_NM", null, null, String.class, "delivTzNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkMessage = cci("PICKING_WORK_MESSAGE", "PICKING_WORK_MESSAGE", null, null, String.class, "pickingWorkMessage", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkMessageCount = cci("PICKING_WORK_MESSAGE_COUNT", "PICKING_WORK_MESSAGE_COUNT", null, null, Long.class, "pickingWorkMessageCount", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNoCnt = cci("PICKING_WORK_NO_CNT", "PICKING_WORK_NO_CNT", null, null, Long.class, "pickingWorkNoCnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDtH = cci("UPD_DT_H", "UPD_DT_H", null, null, java.sql.Timestamp.class, "updDtH", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopCs = cci("SHIPPING_STOP_CS", "SHIPPING_STOP_CS", null, null, String.class, "shippingStopCs", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopCsNm = cci("SHIPPING_STOP_CS_NM", "SHIPPING_STOP_CS_NM", null, null, String.class, "shippingStopCsNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopPd = cci("SHIPPING_STOP_PD", "SHIPPING_STOP_PD", null, null, String.class, "shippingStopPd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopPdNm = cci("SHIPPING_STOP_PD_NM", "SHIPPING_STOP_PD_NM", null, null, String.class, "shippingStopPdNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForceFixedFlg = cci("FORCE_FIXED_FLG", "FORCE_FIXED_FLG", null, null, String.class, "forceFixedFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForceFixedFlgNm = cci("FORCE_FIXED_FLG_NM", "FORCE_FIXED_FLG_NM", null, null, String.class, "forceFixedFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, Long.class, "num", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SHIPPING_INST_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
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
     * PICKING_BATCH_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
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
     * BOL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolNo() { return _columnBolNo; }
    /**
     * BOL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutFlg() { return _columnBolOutFlg; }
    /**
     * BOL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutNm() { return _columnBolOutNm; }
    /**
     * SHIPPING_SLIP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * CLIENT_SHIPPING_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * SHIPPING_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStatus() { return _columnShippingStatus; }
    /**
     * SHIPPING_STATUS_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStatusNm() { return _columnShippingStatusNm; }
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
     * SLIP_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipNo() { return _columnSlipNo; }
    /**
     * LINE_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * PRODUCT_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
     * STOCK_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutFlg() { return _columnStockOutFlg; }
    /**
     * OPL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOplOutFlg() { return _columnOplOutFlg; }
    /**
     * MLT_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutFlg() { return _columnMltOutFlg; }
    /**
     * TPL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutFlg() { return _columnTplOutFlg; }
    /**
     * PL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutFlg() { return _columnPlOutFlg; }
    /**
     * SPL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplOutFlg() { return _columnSplOutFlg; }
    /**
     * PL1_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutFlg() { return _columnPl1OutFlg; }
    /**
     * PL2_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutFlg() { return _columnPl2OutFlg; }
    /**
     * CASE_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutFlg() { return _columnCaseOutFlg; }
    /**
     * INSPECTION_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionOutFlg() { return _columnInspectionOutFlg; }
    /**
     * SL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutFlg() { return _columnSlOutFlg; }
    /**
     * PACKING_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutFlg() { return _columnPackingOutFlg; }
    /**
     * INVOICE_CREATE_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlg() { return _columnInvoiceCreateFlg; }
    /**
     * STW_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStwOutFlg() { return _columnStwOutFlg; }
    /**
     * OPL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOplOutNm() { return _columnOplOutNm; }
    /**
     * MLT_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutNm() { return _columnMltOutNm; }
    /**
     * TPL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutNm() { return _columnTplOutNm; }
    /**
     * PL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutNm() { return _columnPlOutNm; }
    /**
     * SPL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplOutNm() { return _columnSplOutNm; }
    /**
     * PL1_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutNm() { return _columnPl1OutNm; }
    /**
     * PL2_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutNm() { return _columnPl2OutNm; }
    /**
     * CASE_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutNm() { return _columnCaseOutNm; }
    /**
     * INSPECTION_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionOutNm() { return _columnInspectionOutNm; }
    /**
     * SL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutNm() { return _columnSlOutNm; }
    /**
     * PACKING_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutNm() { return _columnPackingOutNm; }
    /**
     * INVOICE_CREATE_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateNm() { return _columnInvoiceCreateNm; }
    /**
     * STW_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStwOutNm() { return _columnStwOutNm; }
    /**
     * PICKING_NUM: {decimal(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNum() { return _columnPickingNum; }
    /**
     * INSPECTION_NUM: {decimal(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionNum() { return _columnInspectionNum; }
    /**
     * LOADING_STATUS: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadingStatus() { return _columnLoadingStatus; }
    /**
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * DELIV_UNIT_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivUnitNo() { return _columnDelivUnitNo; }
    /**
     * DELIV_PLAN_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivPlanDt() { return _columnDelivPlanDt; }
    /**
     * DELIV_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * DELIV_TZ_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTzNm() { return _columnDelivTzNm; }
    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessage() { return _columnPickingWorkMessage; }
    /**
     * PICKING_WORK_MESSAGE_COUNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessageCount() { return _columnPickingWorkMessageCount; }
    /**
     * EMERGENCY_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * PICKING_WORK_NO_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNoCnt() { return _columnPickingWorkNoCnt; }
    /**
     * UPD_DT_H: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDtH() { return _columnUpdDtH; }
    /**
     * SHIPPING_STOP_CS: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopCs() { return _columnShippingStopCs; }
    /**
     * SHIPPING_STOP_CS_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopCsNm() { return _columnShippingStopCsNm; }
    /**
     * SHIPPING_STOP_PD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopPd() { return _columnShippingStopPd; }
    /**
     * SHIPPING_STOP_PD_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopPdNm() { return _columnShippingStopPdNm; }
    /**
     * FORCE_FIXED_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceFixedFlg() { return _columnForceFixedFlg; }
    /**
     * FORCE_FIXED_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceFixedFlgNm() { return _columnForceFixedFlgNm; }
    /**
     * NUM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnShippingInstHId());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnWorkDt());
        ls.add(columnShippingDt());
        ls.add(columnPickingBatchNo());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivCustomerNm());
        ls.add(columnBolNo());
        ls.add(columnBolOutFlg());
        ls.add(columnBolOutNm());
        ls.add(columnShippingSlipNo());
        ls.add(columnClientShippingNo());
        ls.add(columnShippingStatus());
        ls.add(columnShippingStatusNm());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnSlipNo());
        ls.add(columnLineNo());
        ls.add(columnProductId());
        ls.add(columnInstNum());
        ls.add(columnAllocNum());
        ls.add(columnStockOutFlg());
        ls.add(columnOplOutFlg());
        ls.add(columnMltOutFlg());
        ls.add(columnTplOutFlg());
        ls.add(columnPlOutFlg());
        ls.add(columnSplOutFlg());
        ls.add(columnPl1OutFlg());
        ls.add(columnPl2OutFlg());
        ls.add(columnCaseOutFlg());
        ls.add(columnInspectionOutFlg());
        ls.add(columnSlOutFlg());
        ls.add(columnPackingOutFlg());
        ls.add(columnInvoiceCreateFlg());
        ls.add(columnStwOutFlg());
        ls.add(columnOplOutNm());
        ls.add(columnMltOutNm());
        ls.add(columnTplOutNm());
        ls.add(columnPlOutNm());
        ls.add(columnSplOutNm());
        ls.add(columnPl1OutNm());
        ls.add(columnPl2OutNm());
        ls.add(columnCaseOutNm());
        ls.add(columnInspectionOutNm());
        ls.add(columnSlOutNm());
        ls.add(columnPackingOutNm());
        ls.add(columnInvoiceCreateNm());
        ls.add(columnStwOutNm());
        ls.add(columnPickingNum());
        ls.add(columnInspectionNum());
        ls.add(columnLoadingStatus());
        ls.add(columnPickingWorkNo());
        ls.add(columnDelivUnitNo());
        ls.add(columnDelivPlanDt());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnDelivTzNm());
        ls.add(columnMessageNm());
        ls.add(columnPickingWorkMessage());
        ls.add(columnPickingWorkMessageCount());
        ls.add(columnEmergencyFlg());
        ls.add(columnUpdDt());
        ls.add(columnPickingWorkNoCnt());
        ls.add(columnUpdDtH());
        ls.add(columnShippingStopCs());
        ls.add(columnShippingStopCsNm());
        ls.add(columnShippingStopPd());
        ls.add(columnShippingStopPdNm());
        ls.add(columnForceFixedFlg());
        ls.add(columnForceFixedFlgNm());
        ls.add(columnNum());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlShippingInstList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlShippingInstList> getEntityType() { return SqlShippingInstList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlShippingInstList newEntity() { return new SqlShippingInstList(); }
    public SqlShippingInstList newMyEntity() { return new SqlShippingInstList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlShippingInstList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlShippingInstList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
