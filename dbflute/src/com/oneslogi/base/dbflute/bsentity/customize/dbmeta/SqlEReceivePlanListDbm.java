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
 * The DB meta of SqlEReceivePlanList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlEReceivePlanListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlEReceivePlanListDbm _instance = new SqlEReceivePlanListDbm();
    private SqlEReceivePlanListDbm() {}
    public static SqlEReceivePlanListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getReceiveCd(), (et, vl) -> ((SqlEReceivePlanList)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getReceivePlanId(), (et, vl) -> ((SqlEReceivePlanList)et).setReceivePlanId(ctl(vl)), "receivePlanId");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getReceiveRowId(), (et, vl) -> ((SqlEReceivePlanList)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getImportFlg(), (et, vl) -> ((SqlEReceivePlanList)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getErrorFlg(), (et, vl) -> ((SqlEReceivePlanList)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getErrorMessageCd(), (et, vl) -> ((SqlEReceivePlanList)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getClientCd(), (et, vl) -> ((SqlEReceivePlanList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getCenterCd(), (et, vl) -> ((SqlEReceivePlanList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanClientReceiveNo(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanClientReceiveNo((String)vl), "planClientReceiveNo");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanSupplierCd(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanSupplierCd((String)vl), "planSupplierCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getVersionNo(), (et, vl) -> ((SqlEReceivePlanList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getControlNo(), (et, vl) -> ((SqlEReceivePlanList)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getCustomerNm(), (et, vl) -> ((SqlEReceivePlanList)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getCustomerAbbr(), (et, vl) -> ((SqlEReceivePlanList)et).setCustomerAbbr((String)vl), "customerAbbr");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getReceivePlanDt(), (et, vl) -> ((SqlEReceivePlanList)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getProcessTypeCd(), (et, vl) -> ((SqlEReceivePlanList)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getProcessTypeNm(), (et, vl) -> ((SqlEReceivePlanList)et).setProcessTypeNm((String)vl), "processTypeNm");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getStockTypeCd(), (et, vl) -> ((SqlEReceivePlanList)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getStockTypeNm(), (et, vl) -> ((SqlEReceivePlanList)et).setStockTypeNm((String)vl), "stockTypeNm");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanDepositCd(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanDepositCd((String)vl), "planDepositCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanDepositNm(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanDepositNm((String)vl), "planDepositNm");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getProductCd(), (et, vl) -> ((SqlEReceivePlanList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getProductNm(), (et, vl) -> ((SqlEReceivePlanList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getProductAbbr(), (et, vl) -> ((SqlEReceivePlanList)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getJanCd(), (et, vl) -> ((SqlEReceivePlanList)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getLotManagFlg(), (et, vl) -> ((SqlEReceivePlanList)et).setLotManagFlg((String)vl), "lotManagFlg");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getLimitDtManagFlg(), (et, vl) -> ((SqlEReceivePlanList)et).setLimitDtManagFlg((String)vl), "limitDtManagFlg");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanNum(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanNum((String)vl), "planNum");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanWarehouseCd(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanWarehouseCd((String)vl), "planWarehouseCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanLocationCd(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanLocationCd((String)vl), "planLocationCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanLot(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanLot((String)vl), "planLot");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanLimitDt(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanLimitDt((String)vl), "planLimitDt");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getPlanClientOrderNo(), (et, vl) -> ((SqlEReceivePlanList)et).setPlanClientOrderNo((String)vl), "planClientOrderNo");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getMessageNm(), (et, vl) -> ((SqlEReceivePlanList)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getLocationId(), (et, vl) -> ((SqlEReceivePlanList)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getLcsWarehouseCd(), (et, vl) -> ((SqlEReceivePlanList)et).setLcsWarehouseCd((String)vl), "lcsWarehouseCd");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getSpareStr1(), (et, vl) -> ((SqlEReceivePlanList)et).setSpareStr1((String)vl), "spareStr1");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getSpareStr2(), (et, vl) -> ((SqlEReceivePlanList)et).setSpareStr2((String)vl), "spareStr2");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getSpareStr3(), (et, vl) -> ((SqlEReceivePlanList)et).setSpareStr3((String)vl), "spareStr3");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getSpareNum1(), (et, vl) -> ((SqlEReceivePlanList)et).setSpareNum1((String)vl), "spareNum1");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getSpareNum2(), (et, vl) -> ((SqlEReceivePlanList)et).setSpareNum2((String)vl), "spareNum2");
        setupEpg(_epgMap, et -> ((SqlEReceivePlanList)et).getSpareNum3(), (et, vl) -> ((SqlEReceivePlanList)et).setSpareNum3((String)vl), "spareNum3");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlEReceivePlanList";
    protected final String _tableDispName = "SqlEReceivePlanList";
    protected final String _tablePropertyName = "sqlEReceivePlanList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlEReceivePlanList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanId = cci("RECEIVE_PLAN_ID", "RECEIVE_PLAN_ID", null, null, Long.class, "receivePlanId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanClientReceiveNo = cci("PLAN_CLIENT_RECEIVE_NO", "PLAN_CLIENT_RECEIVE_NO", null, null, String.class, "planClientReceiveNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanSupplierCd = cci("PLAN_SUPPLIER_CD", "PLAN_SUPPLIER_CD", null, null, String.class, "planSupplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerAbbr = cci("CUSTOMER_ABBR", "CUSTOMER_ABBR", null, null, String.class, "customerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("RECEIVE_PLAN_DT", "RECEIVE_PLAN_DT", null, null, String.class, "receivePlanDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeNm = cci("PROCESS_TYPE_NM", "PROCESS_TYPE_NM", null, null, String.class, "processTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeNm = cci("STOCK_TYPE_NM", "STOCK_TYPE_NM", null, null, String.class, "stockTypeNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanDepositCd = cci("PLAN_DEPOSIT_CD", "PLAN_DEPOSIT_CD", null, null, String.class, "planDepositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanDepositNm = cci("PLAN_DEPOSIT_NM", "PLAN_DEPOSIT_NM", null, null, String.class, "planDepositNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagFlg = cci("LOT_MANAG_FLG", "LOT_MANAG_FLG", null, null, String.class, "lotManagFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.LotManagFlg, false);
    protected final ColumnInfo _columnLimitDtManagFlg = cci("LIMIT_DT_MANAG_FLG", "LIMIT_DT_MANAG_FLG", null, null, String.class, "limitDtManagFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.LimitDtManagFlg, false);
    protected final ColumnInfo _columnPlanNum = cci("PLAN_NUM", "PLAN_NUM", null, null, String.class, "planNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanWarehouseCd = cci("PLAN_WAREHOUSE_CD", "PLAN_WAREHOUSE_CD", null, null, String.class, "planWarehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLocationCd = cci("PLAN_LOCATION_CD", "PLAN_LOCATION_CD", null, null, String.class, "planLocationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLot = cci("PLAN_LOT", "PLAN_LOT", null, null, String.class, "planLot", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLimitDt = cci("PLAN_LIMIT_DT", "PLAN_LIMIT_DT", null, null, String.class, "planLimitDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanClientOrderNo = cci("PLAN_CLIENT_ORDER_NO", "PLAN_CLIENT_ORDER_NO", null, null, String.class, "planClientOrderNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLcsWarehouseCd = cci("LCS_WAREHOUSE_CD", "LCS_WAREHOUSE_CD", null, null, String.class, "lcsWarehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr1 = cci("SPARE_STR_1", "SPARE_STR_1", null, null, String.class, "spareStr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr2 = cci("SPARE_STR_2", "SPARE_STR_2", null, null, String.class, "spareStr2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr3 = cci("SPARE_STR_3", "SPARE_STR_3", null, null, String.class, "spareStr3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum1 = cci("SPARE_NUM_1", "SPARE_NUM_1", null, null, String.class, "spareNum1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum2 = cci("SPARE_NUM_2", "SPARE_NUM_2", null, null, String.class, "spareNum2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum3 = cci("SPARE_NUM_3", "SPARE_NUM_3", null, null, String.class, "spareNum3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);

    /**
     * RECEIVE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_PLAN_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanId() { return _columnReceivePlanId; }
    /**
     * RECEIVE_ROW_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * PLAN_CLIENT_RECEIVE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanClientReceiveNo() { return _columnPlanClientReceiveNo; }
    /**
     * PLAN_SUPPLIER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanSupplierCd() { return _columnPlanSupplierCd; }
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
    /**
     * CUSTOMER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * CUSTOMER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerAbbr() { return _columnCustomerAbbr; }
    /**
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDt() { return _columnReceivePlanDt; }
    /**
     * PROCESS_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeCd() { return _columnProcessTypeCd; }
    /**
     * PROCESS_TYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeNm() { return _columnProcessTypeNm; }
    /**
     * STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * STOCK_TYPE_NM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeNm() { return _columnStockTypeNm; }
    /**
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanDepositCd() { return _columnPlanDepositCd; }
    /**
     * PLAN_DEPOSIT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanDepositNm() { return _columnPlanDepositNm; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * JAN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * LOT_MANAG_FLG: {char(1), classification=LotManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagFlg() { return _columnLotManagFlg; }
    /**
     * LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtManagFlg() { return _columnLimitDtManagFlg; }
    /**
     * PLAN_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanNum() { return _columnPlanNum; }
    /**
     * PLAN_WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanWarehouseCd() { return _columnPlanWarehouseCd; }
    /**
     * PLAN_LOCATION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLocationCd() { return _columnPlanLocationCd; }
    /**
     * PLAN_LOT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLot() { return _columnPlanLot; }
    /**
     * PLAN_LIMIT_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLimitDt() { return _columnPlanLimitDt; }
    /**
     * PLAN_CLIENT_ORDER_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanClientOrderNo() { return _columnPlanClientOrderNo; }
    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LCS_WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLcsWarehouseCd() { return _columnLcsWarehouseCd; }
    /**
     * SPARE_STR_1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr1() { return _columnSpareStr1; }
    /**
     * SPARE_STR_2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr2() { return _columnSpareStr2; }
    /**
     * SPARE_STR_3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr3() { return _columnSpareStr3; }
    /**
     * SPARE_NUM_1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum1() { return _columnSpareNum1; }
    /**
     * SPARE_NUM_2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum2() { return _columnSpareNum2; }
    /**
     * SPARE_NUM_3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareNum3() { return _columnSpareNum3; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReceiveCd());
        ls.add(columnReceivePlanId());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnPlanClientReceiveNo());
        ls.add(columnPlanSupplierCd());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnCustomerNm());
        ls.add(columnCustomerAbbr());
        ls.add(columnReceivePlanDt());
        ls.add(columnProcessTypeCd());
        ls.add(columnProcessTypeNm());
        ls.add(columnStockTypeCd());
        ls.add(columnStockTypeNm());
        ls.add(columnPlanDepositCd());
        ls.add(columnPlanDepositNm());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnLotManagFlg());
        ls.add(columnLimitDtManagFlg());
        ls.add(columnPlanNum());
        ls.add(columnPlanWarehouseCd());
        ls.add(columnPlanLocationCd());
        ls.add(columnPlanLot());
        ls.add(columnPlanLimitDt());
        ls.add(columnPlanClientOrderNo());
        ls.add(columnMessageNm());
        ls.add(columnLocationId());
        ls.add(columnLcsWarehouseCd());
        ls.add(columnSpareStr1());
        ls.add(columnSpareStr2());
        ls.add(columnSpareStr3());
        ls.add(columnSpareNum1());
        ls.add(columnSpareNum2());
        ls.add(columnSpareNum3());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlEReceivePlanList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlEReceivePlanList> getEntityType() { return SqlEReceivePlanList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlEReceivePlanList newEntity() { return new SqlEReceivePlanList(); }
    public SqlEReceivePlanList newMyEntity() { return new SqlEReceivePlanList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlEReceivePlanList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlEReceivePlanList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
