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
 * The DB meta of SqlPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPickingListPrintDbm _instance = new SqlPickingListPrintDbm();
    private SqlPickingListPrintDbm() {}
    public static SqlPickingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getClientId(), (et, vl) -> ((SqlPickingListPrint)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getClientCd(), (et, vl) -> ((SqlPickingListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getClientNm(), (et, vl) -> ((SqlPickingListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCenterId(), (et, vl) -> ((SqlPickingListPrint)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCenterCd(), (et, vl) -> ((SqlPickingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCenterNm(), (et, vl) -> ((SqlPickingListPrint)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getWorkDt(), (et, vl) -> ((SqlPickingListPrint)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getShippingDt(), (et, vl) -> ((SqlPickingListPrint)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPickingBatchNo(), (et, vl) -> ((SqlPickingListPrint)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPickingWorkNo(), (et, vl) -> ((SqlPickingListPrint)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSupplyCustomerCd(), (et, vl) -> ((SqlPickingListPrint)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSupplyCustomerNm(), (et, vl) -> ((SqlPickingListPrint)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDeliveryCourseCd(), (et, vl) -> ((SqlPickingListPrint)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDeliveryCourseNm(), (et, vl) -> ((SqlPickingListPrint)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCarrierCd(), (et, vl) -> ((SqlPickingListPrint)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCarrierNm(), (et, vl) -> ((SqlPickingListPrint)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSlipNo(), (et, vl) -> ((SqlPickingListPrint)et).setSlipNo(ctl(vl)), "slipNo");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getLineNo(), (et, vl) -> ((SqlPickingListPrint)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getProductId(), (et, vl) -> ((SqlPickingListPrint)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getInstNum(), (et, vl) -> ((SqlPickingListPrint)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getAllocNum(), (et, vl) -> ((SqlPickingListPrint)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getStockOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setStockOutFlg((String)vl), "stockOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getOplOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setOplOutFlg((String)vl), "oplOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getOplOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setOplOutNm((String)vl), "oplOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTplOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setTplOutFlg((String)vl), "tplOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTplOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setTplOutNm((String)vl), "tplOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getMltOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setMltOutFlg((String)vl), "mltOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getMltOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setMltOutNm((String)vl), "mltOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSplOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setSplOutFlg((String)vl), "splOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSplOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setSplOutNm(cti(vl)), "splOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPl1OutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setPl1OutFlg((String)vl), "pl1OutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPl1OutNm(), (et, vl) -> ((SqlPickingListPrint)et).setPl1OutNm(cti(vl)), "pl1OutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPl1OutDt(), (et, vl) -> ((SqlPickingListPrint)et).setPl1OutDt(cttp(vl)), "pl1OutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPlOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setPlOutFlg((String)vl), "plOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPlOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setPlOutNm((String)vl), "plOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSlOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setSlOutFlg((String)vl), "slOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSlOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setSlOutNm((String)vl), "slOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPl2OutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setPl2OutFlg((String)vl), "pl2OutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPl2OutNm(), (et, vl) -> ((SqlPickingListPrint)et).setPl2OutNm(cti(vl)), "pl2OutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPl2OutDt(), (et, vl) -> ((SqlPickingListPrint)et).setPl2OutDt(cttp(vl)), "pl2OutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCaseOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setCaseOutFlg((String)vl), "caseOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCaseOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setCaseOutNm((String)vl), "caseOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCaseOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setCaseOutDt(cttp(vl)), "caseOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPickingGroupNo(), (et, vl) -> ((SqlPickingListPrint)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getEmergencyFlg(), (et, vl) -> ((SqlPickingListPrint)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getUpdDt(), (et, vl) -> ((SqlPickingListPrint)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getNum(), (et, vl) -> ((SqlPickingListPrint)et).setNum(ctl(vl)), "num");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPackingCnt(), (et, vl) -> ((SqlPickingListPrint)et).setPackingCnt(ctl(vl)), "packingCnt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPackingCaseCnt(), (et, vl) -> ((SqlPickingListPrint)et).setPackingCaseCnt(cti(vl)), "packingCaseCnt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPackingMixedCnt(), (et, vl) -> ((SqlPickingListPrint)et).setPackingMixedCnt(cti(vl)), "packingMixedCnt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getMultiPicFlg(), (et, vl) -> ((SqlPickingListPrint)et).setMultiPicFlg((String)vl), "multiPicFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getMultiPicFlgNm(), (et, vl) -> ((SqlPickingListPrint)et).setMultiPicFlgNm(cti(vl)), "multiPicFlgNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTagOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setTagOutFlg((String)vl), "tagOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTagOutFlgNm(), (et, vl) -> ((SqlPickingListPrint)et).setTagOutFlgNm(cti(vl)), "tagOutFlgNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTagOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setTagOutDt(cttp(vl)), "tagOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSglRowPicFlg(), (et, vl) -> ((SqlPickingListPrint)et).setSglRowPicFlg((String)vl), "sglRowPicFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSglRowPicNm(), (et, vl) -> ((SqlPickingListPrint)et).setSglRowPicNm((String)vl), "sglRowPicNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCasePicFlg(), (et, vl) -> ((SqlPickingListPrint)et).setCasePicFlg((String)vl), "casePicFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCasePicNm(), (et, vl) -> ((SqlPickingListPrint)et).setCasePicNm((String)vl), "casePicNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPickingListPrint";
    protected final String _tableDispName = "SqlPickingListPrint";
    protected final String _tablePropertyName = "sqlPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPickingListPrint", _tableDbName);
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
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("PICKING_BATCH_NO", "PICKING_BATCH_NO", null, null, String.class, "pickingBatchNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNo = cci("SLIP_NO", "SLIP_NO", null, null, Long.class, "slipNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutFlg = cci("STOCK_OUT_FLG", "STOCK_OUT_FLG", null, null, String.class, "stockOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOplOutFlg = cci("OPL_OUT_FLG", "OPL_OUT_FLG", null, null, String.class, "oplOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOplOutNm = cci("OPL_OUT_NM", "OPL_OUT_NM", null, null, String.class, "oplOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTplOutFlg = cci("TPL_OUT_FLG", "TPL_OUT_FLG", null, null, String.class, "tplOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTplOutNm = cci("TPL_OUT_NM", "TPL_OUT_NM", null, null, String.class, "tplOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMltOutFlg = cci("MLT_OUT_FLG", "MLT_OUT_FLG", null, null, String.class, "mltOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMltOutNm = cci("MLT_OUT_NM", "MLT_OUT_NM", null, null, String.class, "mltOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplOutFlg = cci("SPL_OUT_FLG", "SPL_OUT_FLG", null, null, String.class, "splOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplOutNm = cci("SPL_OUT_NM", "SPL_OUT_NM", null, null, Integer.class, "splOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl1OutFlg = cci("PL1_OUT_FLG", "PL1_OUT_FLG", null, null, String.class, "pl1OutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl1OutNm = cci("PL1_OUT_NM", "PL1_OUT_NM", null, null, Integer.class, "pl1OutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl1OutDt = cci("PL1_OUT_DT", "PL1_OUT_DT", null, null, java.sql.Timestamp.class, "pl1OutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutFlg = cci("PL_OUT_FLG", "PL_OUT_FLG", null, null, String.class, "plOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutNm = cci("PL_OUT_NM", "PL_OUT_NM", null, null, String.class, "plOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlOutFlg = cci("SL_OUT_FLG", "SL_OUT_FLG", null, null, String.class, "slOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlOutNm = cci("SL_OUT_NM", "SL_OUT_NM", null, null, String.class, "slOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl2OutFlg = cci("PL2_OUT_FLG", "PL2_OUT_FLG", null, null, String.class, "pl2OutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl2OutNm = cci("PL2_OUT_NM", "PL2_OUT_NM", null, null, Integer.class, "pl2OutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPl2OutDt = cci("PL2_OUT_DT", "PL2_OUT_DT", null, null, java.sql.Timestamp.class, "pl2OutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutFlg = cci("CASE_OUT_FLG", "CASE_OUT_FLG", null, null, String.class, "caseOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutNm = cci("CASE_OUT_NM", "CASE_OUT_NM", null, null, String.class, "caseOutNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutDt = cci("CASE_OUT_DT", "CASE_OUT_DT", null, null, java.sql.Timestamp.class, "caseOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, Long.class, "num", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingCnt = cci("PACKING_CNT", "PACKING_CNT", null, null, Long.class, "packingCnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingCaseCnt = cci("PACKING_CASE_CNT", "PACKING_CASE_CNT", null, null, Integer.class, "packingCaseCnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingMixedCnt = cci("PACKING_MIXED_CNT", "PACKING_MIXED_CNT", null, null, Integer.class, "packingMixedCnt", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMultiPicFlg = cci("MULTI_PIC_FLG", "MULTI_PIC_FLG", null, null, String.class, "multiPicFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.MultiPicFlg, false);
    protected final ColumnInfo _columnMultiPicFlgNm = cci("MULTI_PIC_FLG_NM", "MULTI_PIC_FLG_NM", null, null, Integer.class, "multiPicFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutFlg = cci("TAG_OUT_FLG", "TAG_OUT_FLG", null, null, String.class, "tagOutFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutFlgNm = cci("TAG_OUT_FLG_NM", "TAG_OUT_FLG_NM", null, null, Integer.class, "tagOutFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutDt = cci("TAG_OUT_DT", "TAG_OUT_DT", null, null, java.sql.Timestamp.class, "tagOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSglRowPicFlg = cci("SGL_ROW_PIC_FLG", "SGL_ROW_PIC_FLG", null, null, String.class, "sglRowPicFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.SglRowPicFlg, false);
    protected final ColumnInfo _columnSglRowPicNm = cci("SGL_ROW_PIC_NM", "SGL_ROW_PIC_NM", null, null, String.class, "sglRowPicNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePicFlg = cci("CASE_PIC_FLG", "CASE_PIC_FLG", null, null, String.class, "casePicFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePicNm = cci("CASE_PIC_NM", "CASE_PIC_NM", null, null, String.class, "casePicNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

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
     * PICKING_WORK_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
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
     * STOCK_OUT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutFlg() { return _columnStockOutFlg; }
    /**
     * OPL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOplOutFlg() { return _columnOplOutFlg; }
    /**
     * OPL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOplOutNm() { return _columnOplOutNm; }
    /**
     * TPL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutFlg() { return _columnTplOutFlg; }
    /**
     * TPL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutNm() { return _columnTplOutNm; }
    /**
     * MLT_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutFlg() { return _columnMltOutFlg; }
    /**
     * MLT_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutNm() { return _columnMltOutNm; }
    /**
     * SPL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplOutFlg() { return _columnSplOutFlg; }
    /**
     * SPL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplOutNm() { return _columnSplOutNm; }
    /**
     * PL1_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutFlg() { return _columnPl1OutFlg; }
    /**
     * PL1_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutNm() { return _columnPl1OutNm; }
    /**
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutDt() { return _columnPl1OutDt; }
    /**
     * PL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutFlg() { return _columnPlOutFlg; }
    /**
     * PL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutNm() { return _columnPlOutNm; }
    /**
     * SL_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutFlg() { return _columnSlOutFlg; }
    /**
     * SL_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutNm() { return _columnSlOutNm; }
    /**
     * PL2_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutFlg() { return _columnPl2OutFlg; }
    /**
     * PL2_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutNm() { return _columnPl2OutNm; }
    /**
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutDt() { return _columnPl2OutDt; }
    /**
     * CASE_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutFlg() { return _columnCaseOutFlg; }
    /**
     * CASE_OUT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutNm() { return _columnCaseOutNm; }
    /**
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutDt() { return _columnCaseOutDt; }
    /**
     * PICKING_GROUP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
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
     * NUM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * PACKING_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingCnt() { return _columnPackingCnt; }
    /**
     * PACKING_CASE_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingCaseCnt() { return _columnPackingCaseCnt; }
    /**
     * PACKING_MIXED_CNT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingMixedCnt() { return _columnPackingMixedCnt; }
    /**
     * MULTI_PIC_FLG: {char(1), classification=MultiPicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiPicFlg() { return _columnMultiPicFlg; }
    /**
     * MULTI_PIC_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiPicFlgNm() { return _columnMultiPicFlgNm; }
    /**
     * TAG_OUT_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutFlg() { return _columnTagOutFlg; }
    /**
     * TAG_OUT_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutFlgNm() { return _columnTagOutFlgNm; }
    /**
     * TAG_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutDt() { return _columnTagOutDt; }
    /**
     * SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowPicFlg() { return _columnSglRowPicFlg; }
    /**
     * SGL_ROW_PIC_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowPicNm() { return _columnSglRowPicNm; }
    /**
     * CASE_PIC_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePicFlg() { return _columnCasePicFlg; }
    /**
     * CASE_PIC_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePicNm() { return _columnCasePicNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnWorkDt());
        ls.add(columnShippingDt());
        ls.add(columnPickingBatchNo());
        ls.add(columnPickingWorkNo());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
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
        ls.add(columnOplOutNm());
        ls.add(columnTplOutFlg());
        ls.add(columnTplOutNm());
        ls.add(columnMltOutFlg());
        ls.add(columnMltOutNm());
        ls.add(columnSplOutFlg());
        ls.add(columnSplOutNm());
        ls.add(columnPl1OutFlg());
        ls.add(columnPl1OutNm());
        ls.add(columnPl1OutDt());
        ls.add(columnPlOutFlg());
        ls.add(columnPlOutNm());
        ls.add(columnSlOutFlg());
        ls.add(columnSlOutNm());
        ls.add(columnPl2OutFlg());
        ls.add(columnPl2OutNm());
        ls.add(columnPl2OutDt());
        ls.add(columnCaseOutFlg());
        ls.add(columnCaseOutNm());
        ls.add(columnCaseOutDt());
        ls.add(columnPickingGroupNo());
        ls.add(columnEmergencyFlg());
        ls.add(columnUpdDt());
        ls.add(columnNum());
        ls.add(columnPackingCnt());
        ls.add(columnPackingCaseCnt());
        ls.add(columnPackingMixedCnt());
        ls.add(columnMultiPicFlg());
        ls.add(columnMultiPicFlgNm());
        ls.add(columnTagOutFlg());
        ls.add(columnTagOutFlgNm());
        ls.add(columnTagOutDt());
        ls.add(columnSglRowPicFlg());
        ls.add(columnSglRowPicNm());
        ls.add(columnCasePicFlg());
        ls.add(columnCasePicNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPickingListPrint> getEntityType() { return SqlPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPickingListPrint newEntity() { return new SqlPickingListPrint(); }
    public SqlPickingListPrint newMyEntity() { return new SqlPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
