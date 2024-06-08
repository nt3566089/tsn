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
 * The DB meta of E_RETURNED_RECEIVE_PLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EReturnedReceivePlanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EReturnedReceivePlanDbm _instance = new EReturnedReceivePlanDbm();
    private EReturnedReceivePlanDbm() {}
    public static EReturnedReceivePlanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getReturnedReceivePlanId(), (et, vl) -> ((EReturnedReceivePlan)et).setReturnedReceivePlanId(ctl(vl)), "returnedReceivePlanId");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getReceiveCd(), (et, vl) -> ((EReturnedReceivePlan)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getReceiveRowId(), (et, vl) -> ((EReturnedReceivePlan)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getImportFlg(), (et, vl) -> ((EReturnedReceivePlan)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getErrorFlg(), (et, vl) -> ((EReturnedReceivePlan)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getErrorMessageCd(), (et, vl) -> ((EReturnedReceivePlan)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getHeaderFlg(), (et, vl) -> ((EReturnedReceivePlan)et).setHeaderFlg((String)vl), "headerFlg");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getSortBsCd(), (et, vl) -> ((EReturnedReceivePlan)et).setSortBsCd((String)vl), "sortBsCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getDelivayCenterCd(), (et, vl) -> ((EReturnedReceivePlan)et).setDelivayCenterCd((String)vl), "delivayCenterCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getOrderGroup(), (et, vl) -> ((EReturnedReceivePlan)et).setOrderGroup((String)vl), "orderGroup");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getSaleDatetime(), (et, vl) -> ((EReturnedReceivePlan)et).setSaleDatetime((String)vl), "saleDatetime");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getCustomerCd(), (et, vl) -> ((EReturnedReceivePlan)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getSlipType(), (et, vl) -> ((EReturnedReceivePlan)et).setSlipType((String)vl), "slipType");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getSlipNo(), (et, vl) -> ((EReturnedReceivePlan)et).setSlipNo((String)vl), "slipNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getSequenceNo(), (et, vl) -> ((EReturnedReceivePlan)et).setSequenceNo((String)vl), "sequenceNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getOrderDate(), (et, vl) -> ((EReturnedReceivePlan)et).setOrderDate((String)vl), "orderDate");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getShipingDate(), (et, vl) -> ((EReturnedReceivePlan)et).setShipingDate((String)vl), "shipingDate");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getOtorgcd(), (et, vl) -> ((EReturnedReceivePlan)et).setOtorgcd((String)vl), "otorgcd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getOrdorgcd(), (et, vl) -> ((EReturnedReceivePlan)et).setOrdorgcd((String)vl), "ordorgcd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getRlybscd(), (et, vl) -> ((EReturnedReceivePlan)et).setRlybscd((String)vl), "rlybscd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getDirectionCd(), (et, vl) -> ((EReturnedReceivePlan)et).setDirectionCd((String)vl), "directionCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getPistonId(), (et, vl) -> ((EReturnedReceivePlan)et).setPistonId((String)vl), "pistonId");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getDelivalyRank(), (et, vl) -> ((EReturnedReceivePlan)et).setDelivalyRank((String)vl), "delivalyRank");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getBulkDelivalyNo(), (et, vl) -> ((EReturnedReceivePlan)et).setBulkDelivalyNo((String)vl), "bulkDelivalyNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getDivmtd(), (et, vl) -> ((EReturnedReceivePlan)et).setDivmtd((String)vl), "divmtd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getZzhdvrid(), (et, vl) -> ((EReturnedReceivePlan)et).setZzhdvrid((String)vl), "zzhdvrid");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getCustomerNm(), (et, vl) -> ((EReturnedReceivePlan)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getHeaderPriceSale(), (et, vl) -> ((EReturnedReceivePlan)et).setHeaderPriceSale((String)vl), "headerPriceSale");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getZregprcc(), (et, vl) -> ((EReturnedReceivePlan)et).setZregprcc((String)vl), "zregprcc");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getTax(), (et, vl) -> ((EReturnedReceivePlan)et).setTax((String)vl), "tax");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getZzgodfpc(), (et, vl) -> ((EReturnedReceivePlan)et).setZzgodfpc((String)vl), "zzgodfpc");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getZzgodspc(), (et, vl) -> ((EReturnedReceivePlan)et).setZzgodspc((String)vl), "zzgodspc");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getZzgodctx(), (et, vl) -> ((EReturnedReceivePlan)et).setZzgodctx((String)vl), "zzgodctx");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getCompanyCd(), (et, vl) -> ((EReturnedReceivePlan)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getSaleType(), (et, vl) -> ((EReturnedReceivePlan)et).setSaleType((String)vl), "saleType");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getHvrtReason(), (et, vl) -> ((EReturnedReceivePlan)et).setHvrtReason((String)vl), "hvrtReason");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getHvrtInoutDate(), (et, vl) -> ((EReturnedReceivePlan)et).setHvrtInoutDate((String)vl), "hvrtInoutDate");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getCngPrtSlipNo(), (et, vl) -> ((EReturnedReceivePlan)et).setCngPrtSlipNo((String)vl), "cngPrtSlipNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getProcessType(), (et, vl) -> ((EReturnedReceivePlan)et).setProcessType((String)vl), "processType");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getEosOrdAftFlg(), (et, vl) -> ((EReturnedReceivePlan)et).setEosOrdAftFlg((String)vl), "eosOrdAftFlg");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getEosSlipNo(), (et, vl) -> ((EReturnedReceivePlan)et).setEosSlipNo((String)vl), "eosSlipNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getHdrdBxType(), (et, vl) -> ((EReturnedReceivePlan)et).setHdrdBxType((String)vl), "hdrdBxType");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getInotRfslType(), (et, vl) -> ((EReturnedReceivePlan)et).setInotRfslType((String)vl), "inotRfslType");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getBxMntRfslType(), (et, vl) -> ((EReturnedReceivePlan)et).setBxMntRfslType((String)vl), "bxMntRfslType");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getReportMerfeTiming(), (et, vl) -> ((EReturnedReceivePlan)et).setReportMerfeTiming((String)vl), "reportMerfeTiming");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getReportOutDatetime(), (et, vl) -> ((EReturnedReceivePlan)et).setReportOutDatetime((String)vl), "reportOutDatetime");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getClientId(), (et, vl) -> ((EReturnedReceivePlan)et).setClientId((String)vl), "clientId");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getKwmeng(), (et, vl) -> ((EReturnedReceivePlan)et).setKwmeng((String)vl), "kwmeng");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getStatusCd(), (et, vl) -> ((EReturnedReceivePlan)et).setStatusCd((String)vl), "statusCd");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getStgVal(), (et, vl) -> ((EReturnedReceivePlan)et).setStgVal((String)vl), "stgVal");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getDetailPriceSale(), (et, vl) -> ((EReturnedReceivePlan)et).setDetailPriceSale((String)vl), "detailPriceSale");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getDelFlg(), (et, vl) -> ((EReturnedReceivePlan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getVersionNo(), (et, vl) -> ((EReturnedReceivePlan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getControlNo(), (et, vl) -> ((EReturnedReceivePlan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getAddDt(), (et, vl) -> ((EReturnedReceivePlan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getAddUser(), (et, vl) -> ((EReturnedReceivePlan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getAddProcess(), (et, vl) -> ((EReturnedReceivePlan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getUpdDt(), (et, vl) -> ((EReturnedReceivePlan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getUpdUser(), (et, vl) -> ((EReturnedReceivePlan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EReturnedReceivePlan)et).getUpdProcess(), (et, vl) -> ((EReturnedReceivePlan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_RETURNED_RECEIVE_PLAN";
    protected final String _tableDispName = "E_RETURNED_RECEIVE_PLAN";
    protected final String _tablePropertyName = "EReturnedReceivePlan";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_RETURNED_RECEIVE_PLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReturnedReceivePlanId = cci("RETURNED_RECEIVE_PLAN_ID", "RETURNED_RECEIVE_PLAN_ID", null, null, Long.class, "returnedReceivePlanId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeaderFlg = cci("HEADER_FLG", "HEADER_FLG", null, null, String.class, "headerFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortBsCd = cci("SORT_BS_CD", "SORT_BS_CD", null, null, String.class, "sortBsCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivayCenterCd = cci("DELIVAY_CENTER_CD", "DELIVAY_CENTER_CD", null, null, String.class, "delivayCenterCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderGroup = cci("ORDER_GROUP", "ORDER_GROUP", null, null, String.class, "orderGroup", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSaleDatetime = cci("SALE_DATETIME", "SALE_DATETIME", null, null, String.class, "saleDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipType = cci("SLIP_TYPE", "SLIP_TYPE", null, null, String.class, "slipType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNo = cci("SLIP_NO", "SLIP_NO", null, null, String.class, "slipNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSequenceNo = cci("SEQUENCE_NO", "SEQUENCE_NO", null, null, String.class, "sequenceNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderDate = cci("ORDER_DATE", "ORDER_DATE", null, null, String.class, "orderDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipingDate = cci("SHIPING_DATE", "SHIPING_DATE", null, null, String.class, "shipingDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtorgcd = cci("OTORGCD", "OTORGCD", null, null, String.class, "otorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdorgcd = cci("ORDORGCD", "ORDORGCD", null, null, String.class, "ordorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybscd = cci("RLYBSCD", "RLYBSCD", null, null, String.class, "rlybscd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionCd = cci("DIRECTION_CD", "DIRECTION_CD", null, null, String.class, "directionCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistonId = cci("PISTON_ID", "PISTON_ID", null, null, String.class, "pistonId", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivalyRank = cci("DELIVALY_RANK", "DELIVALY_RANK", null, null, String.class, "delivalyRank", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBulkDelivalyNo = cci("BULK_DELIVALY_NO", "BULK_DELIVALY_NO", null, null, String.class, "bulkDelivalyNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivmtd = cci("DIVMTD", "DIVMTD", null, null, String.class, "divmtd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzhdvrid = cci("ZZHDVRID", "ZZHDVRID", null, null, String.class, "zzhdvrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeaderPriceSale = cci("HEADER_PRICE_SALE", "HEADER_PRICE_SALE", null, null, String.class, "headerPriceSale", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZregprcc = cci("ZREGPRCC", "ZREGPRCC", null, null, String.class, "zregprcc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, String.class, "tax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzgodfpc = cci("ZZGODFPC", "ZZGODFPC", null, null, String.class, "zzgodfpc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzgodspc = cci("ZZGODSPC", "ZZGODSPC", null, null, String.class, "zzgodspc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzgodctx = cci("ZZGODCTX", "ZZGODCTX", null, null, String.class, "zzgodctx", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSaleType = cci("SALE_TYPE", "SALE_TYPE", null, null, String.class, "saleType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHvrtReason = cci("HVRT_REASON", "HVRT_REASON", null, null, String.class, "hvrtReason", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHvrtInoutDate = cci("HVRT_INOUT_DATE", "HVRT_INOUT_DATE", null, null, String.class, "hvrtInoutDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCngPrtSlipNo = cci("CNG_PRT_SLIP_NO", "CNG_PRT_SLIP_NO", null, null, String.class, "cngPrtSlipNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessType = cci("PROCESS_TYPE", "PROCESS_TYPE", null, null, String.class, "processType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEosOrdAftFlg = cci("EOS_ORD_AFT_FLG", "EOS_ORD_AFT_FLG", null, null, String.class, "eosOrdAftFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEosSlipNo = cci("EOS_SLIP_NO", "EOS_SLIP_NO", null, null, String.class, "eosSlipNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdBxType = cci("HDRD_BX_TYPE", "HDRD_BX_TYPE", null, null, String.class, "hdrdBxType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInotRfslType = cci("INOT_RFSL_TYPE", "INOT_RFSL_TYPE", null, null, String.class, "inotRfslType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxMntRfslType = cci("BX_MNT_RFSL_TYPE", "BX_MNT_RFSL_TYPE", null, null, String.class, "bxMntRfslType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportMerfeTiming = cci("REPORT_MERFE_TIMING", "REPORT_MERFE_TIMING", null, null, String.class, "reportMerfeTiming", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportOutDatetime = cci("REPORT_OUT_DATETIME", "REPORT_OUT_DATETIME", null, null, String.class, "reportOutDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, String.class, "clientId", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKwmeng = cci("KWMENG", "KWMENG", null, null, String.class, "kwmeng", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatusCd = cci("STATUS_CD", "STATUS_CD", null, null, String.class, "statusCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStgVal = cci("STG_VAL", "STG_VAL", null, null, String.class, "stgVal", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDetailPriceSale = cci("DETAIL_PRICE_SALE", "DETAIL_PRICE_SALE", null, null, String.class, "detailPriceSale", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReturnedReceivePlanId() { return _columnReturnedReceivePlanId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * HEADER_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeaderFlg() { return _columnHeaderFlg; }
    /**
     * SORT_BS_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortBsCd() { return _columnSortBsCd; }
    /**
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivayCenterCd() { return _columnDelivayCenterCd; }
    /**
     * ORDER_GROUP: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderGroup() { return _columnOrderGroup; }
    /**
     * SALE_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSaleDatetime() { return _columnSaleDatetime; }
    /**
     * CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * SLIP_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipType() { return _columnSlipType; }
    /**
     * SLIP_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipNo() { return _columnSlipNo; }
    /**
     * SEQUENCE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSequenceNo() { return _columnSequenceNo; }
    /**
     * ORDER_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDate() { return _columnOrderDate; }
    /**
     * SHIPING_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipingDate() { return _columnShipingDate; }
    /**
     * OTORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtorgcd() { return _columnOtorgcd; }
    /**
     * ORDORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdorgcd() { return _columnOrdorgcd; }
    /**
     * RLYBSCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybscd() { return _columnRlybscd; }
    /**
     * DIRECTION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionCd() { return _columnDirectionCd; }
    /**
     * PISTON_ID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistonId() { return _columnPistonId; }
    /**
     * DELIVALY_RANK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivalyRank() { return _columnDelivalyRank; }
    /**
     * BULK_DELIVALY_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBulkDelivalyNo() { return _columnBulkDelivalyNo; }
    /**
     * DIVMTD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivmtd() { return _columnDivmtd; }
    /**
     * ZZHDVRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzhdvrid() { return _columnZzhdvrid; }
    /**
     * CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * HEADER_PRICE_SALE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeaderPriceSale() { return _columnHeaderPriceSale; }
    /**
     * ZREGPRCC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZregprcc() { return _columnZregprcc; }
    /**
     * TAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTax() { return _columnTax; }
    /**
     * ZZGODFPC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzgodfpc() { return _columnZzgodfpc; }
    /**
     * ZZGODSPC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzgodspc() { return _columnZzgodspc; }
    /**
     * ZZGODCTX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzgodctx() { return _columnZzgodctx; }
    /**
     * COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
    /**
     * SALE_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSaleType() { return _columnSaleType; }
    /**
     * HVRT_REASON: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHvrtReason() { return _columnHvrtReason; }
    /**
     * HVRT_INOUT_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHvrtInoutDate() { return _columnHvrtInoutDate; }
    /**
     * CNG_PRT_SLIP_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCngPrtSlipNo() { return _columnCngPrtSlipNo; }
    /**
     * PROCESS_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessType() { return _columnProcessType; }
    /**
     * EOS_ORD_AFT_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEosOrdAftFlg() { return _columnEosOrdAftFlg; }
    /**
     * EOS_SLIP_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEosSlipNo() { return _columnEosSlipNo; }
    /**
     * HDRD_BX_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdBxType() { return _columnHdrdBxType; }
    /**
     * INOT_RFSL_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInotRfslType() { return _columnInotRfslType; }
    /**
     * BX_MNT_RFSL_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxMntRfslType() { return _columnBxMntRfslType; }
    /**
     * REPORT_MERFE_TIMING: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportMerfeTiming() { return _columnReportMerfeTiming; }
    /**
     * REPORT_OUT_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportOutDatetime() { return _columnReportOutDatetime; }
    /**
     * CLIENT_ID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * KWMENG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKwmeng() { return _columnKwmeng; }
    /**
     * STATUS_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatusCd() { return _columnStatusCd; }
    /**
     * STG_VAL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStgVal() { return _columnStgVal; }
    /**
     * DETAIL_PRICE_SALE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDetailPriceSale() { return _columnDetailPriceSale; }
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
        ls.add(columnReturnedReceivePlanId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnHeaderFlg());
        ls.add(columnSortBsCd());
        ls.add(columnDelivayCenterCd());
        ls.add(columnOrderGroup());
        ls.add(columnSaleDatetime());
        ls.add(columnCustomerCd());
        ls.add(columnSlipType());
        ls.add(columnSlipNo());
        ls.add(columnSequenceNo());
        ls.add(columnOrderDate());
        ls.add(columnShipingDate());
        ls.add(columnOtorgcd());
        ls.add(columnOrdorgcd());
        ls.add(columnRlybscd());
        ls.add(columnDirectionCd());
        ls.add(columnPistonId());
        ls.add(columnDelivalyRank());
        ls.add(columnBulkDelivalyNo());
        ls.add(columnDivmtd());
        ls.add(columnZzhdvrid());
        ls.add(columnCustomerNm());
        ls.add(columnHeaderPriceSale());
        ls.add(columnZregprcc());
        ls.add(columnTax());
        ls.add(columnZzgodfpc());
        ls.add(columnZzgodspc());
        ls.add(columnZzgodctx());
        ls.add(columnCompanyCd());
        ls.add(columnSaleType());
        ls.add(columnHvrtReason());
        ls.add(columnHvrtInoutDate());
        ls.add(columnCngPrtSlipNo());
        ls.add(columnProcessType());
        ls.add(columnEosOrdAftFlg());
        ls.add(columnEosSlipNo());
        ls.add(columnHdrdBxType());
        ls.add(columnInotRfslType());
        ls.add(columnBxMntRfslType());
        ls.add(columnReportMerfeTiming());
        ls.add(columnReportOutDatetime());
        ls.add(columnClientId());
        ls.add(columnKwmeng());
        ls.add(columnStatusCd());
        ls.add(columnStgVal());
        ls.add(columnDetailPriceSale());
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
    protected UniqueInfo cpui() { return hpcpui(columnReturnedReceivePlanId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EReturnedReceivePlan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EReturnedReceivePlanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EReturnedReceivePlanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EReturnedReceivePlan> getEntityType() { return EReturnedReceivePlan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EReturnedReceivePlan newEntity() { return new EReturnedReceivePlan(); }
    public EReturnedReceivePlan newMyEntity() { return new EReturnedReceivePlan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EReturnedReceivePlan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EReturnedReceivePlan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
