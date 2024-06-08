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
 * The DB meta of E_RECEIVE_PLAN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EReceivePlanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EReceivePlanDbm _instance = new EReceivePlanDbm();
    private EReceivePlanDbm() {}
    public static EReceivePlanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceivePlanId(), (et, vl) -> ((EReceivePlan)et).setReceivePlanId(ctl(vl)), "receivePlanId");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveCd(), (et, vl) -> ((EReceivePlan)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceiveRowId(), (et, vl) -> ((EReceivePlan)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getImportFlg(), (et, vl) -> ((EReceivePlan)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getErrorFlg(), (et, vl) -> ((EReceivePlan)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getErrorMessageCd(), (et, vl) -> ((EReceivePlan)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getClientCd(), (et, vl) -> ((EReceivePlan)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getCenterCd(), (et, vl) -> ((EReceivePlan)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanClientReceiveNo(), (et, vl) -> ((EReceivePlan)et).setPlanClientReceiveNo((String)vl), "planClientReceiveNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanSupplierCd(), (et, vl) -> ((EReceivePlan)et).setPlanSupplierCd((String)vl), "planSupplierCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getReceivePlanDt(), (et, vl) -> ((EReceivePlan)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getProcessTypeCd(), (et, vl) -> ((EReceivePlan)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getStockTypeCd(), (et, vl) -> ((EReceivePlan)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanDepositCd(), (et, vl) -> ((EReceivePlan)et).setPlanDepositCd((String)vl), "planDepositCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getProductCd(), (et, vl) -> ((EReceivePlan)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getProductNm(), (et, vl) -> ((EReceivePlan)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanNum(), (et, vl) -> ((EReceivePlan)et).setPlanNum((String)vl), "planNum");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanWarehouseCd(), (et, vl) -> ((EReceivePlan)et).setPlanWarehouseCd((String)vl), "planWarehouseCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanLocationCd(), (et, vl) -> ((EReceivePlan)et).setPlanLocationCd((String)vl), "planLocationCd");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanLot(), (et, vl) -> ((EReceivePlan)et).setPlanLot((String)vl), "planLot");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanLimitDt(), (et, vl) -> ((EReceivePlan)et).setPlanLimitDt((String)vl), "planLimitDt");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getPlanClientOrderNo(), (et, vl) -> ((EReceivePlan)et).setPlanClientOrderNo((String)vl), "planClientOrderNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareStr1(), (et, vl) -> ((EReceivePlan)et).setSpareStr1((String)vl), "spareStr1");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareStr2(), (et, vl) -> ((EReceivePlan)et).setSpareStr2((String)vl), "spareStr2");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareStr3(), (et, vl) -> ((EReceivePlan)et).setSpareStr3((String)vl), "spareStr3");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareNum1(), (et, vl) -> ((EReceivePlan)et).setSpareNum1((String)vl), "spareNum1");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareNum2(), (et, vl) -> ((EReceivePlan)et).setSpareNum2((String)vl), "spareNum2");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getSpareNum3(), (et, vl) -> ((EReceivePlan)et).setSpareNum3((String)vl), "spareNum3");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getDelFlg(), (et, vl) -> ((EReceivePlan)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getVersionNo(), (et, vl) -> ((EReceivePlan)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getControlNo(), (et, vl) -> ((EReceivePlan)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAddDt(), (et, vl) -> ((EReceivePlan)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAddUser(), (et, vl) -> ((EReceivePlan)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getAddProcess(), (et, vl) -> ((EReceivePlan)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUpdDt(), (et, vl) -> ((EReceivePlan)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUpdUser(), (et, vl) -> ((EReceivePlan)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EReceivePlan)et).getUpdProcess(), (et, vl) -> ((EReceivePlan)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_RECEIVE_PLAN";
    protected final String _tableDispName = "E_RECEIVE_PLAN";
    protected final String _tablePropertyName = "EReceivePlan";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_RECEIVE_PLAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanId = cci("RECEIVE_PLAN_ID", "RECEIVE_PLAN_ID", null, null, Long.class, "receivePlanId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanClientReceiveNo = cci("PLAN_CLIENT_RECEIVE_NO", "PLAN_CLIENT_RECEIVE_NO", null, null, String.class, "planClientReceiveNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanSupplierCd = cci("PLAN_SUPPLIER_CD", "PLAN_SUPPLIER_CD", null, null, String.class, "planSupplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("RECEIVE_PLAN_DT", "RECEIVE_PLAN_DT", null, null, String.class, "receivePlanDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanDepositCd = cci("PLAN_DEPOSIT_CD", "PLAN_DEPOSIT_CD", null, null, String.class, "planDepositCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanNum = cci("PLAN_NUM", "PLAN_NUM", null, null, String.class, "planNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanWarehouseCd = cci("PLAN_WAREHOUSE_CD", "PLAN_WAREHOUSE_CD", null, null, String.class, "planWarehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLocationCd = cci("PLAN_LOCATION_CD", "PLAN_LOCATION_CD", null, null, String.class, "planLocationCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLot = cci("PLAN_LOT", "PLAN_LOT", null, null, String.class, "planLot", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLimitDt = cci("PLAN_LIMIT_DT", "PLAN_LIMIT_DT", null, null, String.class, "planLimitDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanClientOrderNo = cci("PLAN_CLIENT_ORDER_NO", "PLAN_CLIENT_ORDER_NO", null, null, String.class, "planClientOrderNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr1 = cci("SPARE_STR_1", "SPARE_STR_1", null, null, String.class, "spareStr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr2 = cci("SPARE_STR_2", "SPARE_STR_2", null, null, String.class, "spareStr2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr3 = cci("SPARE_STR_3", "SPARE_STR_3", null, null, String.class, "spareStr3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum1 = cci("SPARE_NUM_1", "SPARE_NUM_1", null, null, String.class, "spareNum1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum2 = cci("SPARE_NUM_2", "SPARE_NUM_2", null, null, String.class, "spareNum2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareNum3 = cci("SPARE_NUM_3", "SPARE_NUM_3", null, null, String.class, "spareNum3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanId() { return _columnReceivePlanId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * STOCK_TYPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * PLAN_DEPOSIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanDepositCd() { return _columnPlanDepositCd; }
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
        ls.add(columnReceivePlanId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnPlanClientReceiveNo());
        ls.add(columnPlanSupplierCd());
        ls.add(columnReceivePlanDt());
        ls.add(columnProcessTypeCd());
        ls.add(columnStockTypeCd());
        ls.add(columnPlanDepositCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnPlanNum());
        ls.add(columnPlanWarehouseCd());
        ls.add(columnPlanLocationCd());
        ls.add(columnPlanLot());
        ls.add(columnPlanLimitDt());
        ls.add(columnPlanClientOrderNo());
        ls.add(columnSpareStr1());
        ls.add(columnSpareStr2());
        ls.add(columnSpareStr3());
        ls.add(columnSpareNum1());
        ls.add(columnSpareNum2());
        ls.add(columnSpareNum3());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        return hpcui(ls);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EReceivePlan"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EReceivePlanCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EReceivePlanBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EReceivePlan> getEntityType() { return EReceivePlan.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EReceivePlan newEntity() { return new EReceivePlan(); }
    public EReceivePlan newMyEntity() { return new EReceivePlan(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EReceivePlan)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EReceivePlan)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
