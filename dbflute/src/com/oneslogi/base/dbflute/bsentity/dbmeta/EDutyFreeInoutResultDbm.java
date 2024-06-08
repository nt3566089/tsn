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
 * The DB meta of E_DUTY_FREE_INOUT_RESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EDutyFreeInoutResultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EDutyFreeInoutResultDbm _instance = new EDutyFreeInoutResultDbm();
    private EDutyFreeInoutResultDbm() {}
    public static EDutyFreeInoutResultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getDutyFreeInoutResultId(), (et, vl) -> ((EDutyFreeInoutResult)et).setDutyFreeInoutResultId(ctl(vl)), "dutyFreeInoutResultId");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSendCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSendRowId(), (et, vl) -> ((EDutyFreeInoutResult)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getWorkFlg(), (et, vl) -> ((EDutyFreeInoutResult)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolPosKey(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolPosKey((String)vl), "symbolPosKey");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getWarehouseCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolFactoryCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolFactoryCd((String)vl), "symbolFactoryCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolItemCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolItemCd((String)vl), "symbolItemCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolSku(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolSku((String)vl), "symbolSku");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolReceiveCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolReceiveCd((String)vl), "symbolReceiveCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolProductMark(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolProductMark((String)vl), "symbolProductMark");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolOrderno(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolOrderno((String)vl), "symbolOrderno");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolPrinterno(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolPrinterno((String)vl), "symbolPrinterno");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolMakeno(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolMakeno((String)vl), "symbolMakeno");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolLot4(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolLot4((String)vl), "symbolLot4");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolMaketime(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolMaketime((String)vl), "symbolMaketime");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolCirculationId(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolCirculationId((String)vl), "symbolCirculationId");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getTransportCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setTransportCd((String)vl), "transportCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getPalletId(), (et, vl) -> ((EDutyFreeInoutResult)et).setPalletId((String)vl), "palletId");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getInitNum(), (et, vl) -> ((EDutyFreeInoutResult)et).setInitNum((String)vl), "initNum");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getCreateDatetime(), (et, vl) -> ((EDutyFreeInoutResult)et).setCreateDatetime((String)vl), "createDatetime");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSortingDatetime(), (et, vl) -> ((EDutyFreeInoutResult)et).setSortingDatetime((String)vl), "sortingDatetime");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getTraceType(), (et, vl) -> ((EDutyFreeInoutResult)et).setTraceType((String)vl), "traceType");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getLineBlock(), (et, vl) -> ((EDutyFreeInoutResult)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAssortEdUnit(), (et, vl) -> ((EDutyFreeInoutResult)et).setAssortEdUnit((String)vl), "assortEdUnit");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAssortEdIndex(), (et, vl) -> ((EDutyFreeInoutResult)et).setAssortEdIndex((String)vl), "assortEdIndex");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getOperationCode(), (et, vl) -> ((EDutyFreeInoutResult)et).setOperationCode((String)vl), "operationCode");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getCaseInNum(), (et, vl) -> ((EDutyFreeInoutResult)et).setCaseInNum((String)vl), "caseInNum");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAssortNum(), (et, vl) -> ((EDutyFreeInoutResult)et).setAssortNum((String)vl), "assortNum");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAssortDifNum(), (et, vl) -> ((EDutyFreeInoutResult)et).setAssortDifNum((String)vl), "assortDifNum");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getDirectionCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setDirectionCd((String)vl), "directionCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getPistonType(), (et, vl) -> ((EDutyFreeInoutResult)et).setPistonType((String)vl), "pistonType");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getCustomerCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getDirectionNum(), (et, vl) -> ((EDutyFreeInoutResult)et).setDirectionNum((String)vl), "directionNum");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getDistWarehouseCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setDistWarehouseCd((String)vl), "distWarehouseCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getSymbolRcvKey(), (et, vl) -> ((EDutyFreeInoutResult)et).setSymbolRcvKey((String)vl), "symbolRcvKey");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getItemCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setItemCd((String)vl), "itemCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getDesignCd(), (et, vl) -> ((EDutyFreeInoutResult)et).setDesignCd((String)vl), "designCd");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getResesrveArea(), (et, vl) -> ((EDutyFreeInoutResult)et).setResesrveArea((String)vl), "resesrveArea");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getDelFlg(), (et, vl) -> ((EDutyFreeInoutResult)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getVersionNo(), (et, vl) -> ((EDutyFreeInoutResult)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getControlNo(), (et, vl) -> ((EDutyFreeInoutResult)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAddDt(), (et, vl) -> ((EDutyFreeInoutResult)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAddUser(), (et, vl) -> ((EDutyFreeInoutResult)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getAddProcess(), (et, vl) -> ((EDutyFreeInoutResult)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getUpdDt(), (et, vl) -> ((EDutyFreeInoutResult)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getUpdUser(), (et, vl) -> ((EDutyFreeInoutResult)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EDutyFreeInoutResult)et).getUpdProcess(), (et, vl) -> ((EDutyFreeInoutResult)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_DUTY_FREE_INOUT_RESULT";
    protected final String _tableDispName = "E_DUTY_FREE_INOUT_RESULT";
    protected final String _tablePropertyName = "EDutyFreeInoutResult";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_DUTY_FREE_INOUT_RESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDutyFreeInoutResultId = cci("DUTY_FREE_INOUT_RESULT_ID", "DUTY_FREE_INOUT_RESULT_ID", null, null, Long.class, "dutyFreeInoutResultId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolPosKey = cci("SYMBOL_POS_KEY", "SYMBOL_POS_KEY", null, null, String.class, "symbolPosKey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolFactoryCd = cci("SYMBOL_FACTORY_CD", "SYMBOL_FACTORY_CD", null, null, String.class, "symbolFactoryCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolItemCd = cci("SYMBOL_ITEM_CD", "SYMBOL_ITEM_CD", null, null, String.class, "symbolItemCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolSku = cci("SYMBOL_SKU", "SYMBOL_SKU", null, null, String.class, "symbolSku", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolReceiveCd = cci("SYMBOL_RECEIVE_CD", "SYMBOL_RECEIVE_CD", null, null, String.class, "symbolReceiveCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolProductMark = cci("SYMBOL_PRODUCT_MARK", "SYMBOL_PRODUCT_MARK", null, null, String.class, "symbolProductMark", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolOrderno = cci("SYMBOL_ORDERNO", "SYMBOL_ORDERNO", null, null, String.class, "symbolOrderno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolPrinterno = cci("SYMBOL_PRINTERNO", "SYMBOL_PRINTERNO", null, null, String.class, "symbolPrinterno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolMakeno = cci("SYMBOL_MAKENO", "SYMBOL_MAKENO", null, null, String.class, "symbolMakeno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolLot4 = cci("SYMBOL_LOT4", "SYMBOL_LOT4", null, null, String.class, "symbolLot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolMaketime = cci("SYMBOL_MAKETIME", "SYMBOL_MAKETIME", null, null, String.class, "symbolMaketime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolCirculationId = cci("SYMBOL_CIRCULATION_ID", "SYMBOL_CIRCULATION_ID", null, null, String.class, "symbolCirculationId", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportCd = cci("TRANSPORT_CD", "TRANSPORT_CD", null, null, String.class, "transportCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, String.class, "palletId", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitNum = cci("INIT_NUM", "INIT_NUM", null, null, String.class, "initNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDatetime = cci("CREATE_DATETIME", "CREATE_DATETIME", null, null, String.class, "createDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortingDatetime = cci("SORTING_DATETIME", "SORTING_DATETIME", null, null, String.class, "sortingDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTraceType = cci("TRACE_TYPE", "TRACE_TYPE", null, null, String.class, "traceType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortEdUnit = cci("ASSORT_ED_UNIT", "ASSORT_ED_UNIT", null, null, String.class, "assortEdUnit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortEdIndex = cci("ASSORT_ED_INDEX", "ASSORT_ED_INDEX", null, null, String.class, "assortEdIndex", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationCode = cci("OPERATION_CODE", "OPERATION_CODE", null, null, String.class, "operationCode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseInNum = cci("CASE_IN_NUM", "CASE_IN_NUM", null, null, String.class, "caseInNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortNum = cci("ASSORT_NUM", "ASSORT_NUM", null, null, String.class, "assortNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortDifNum = cci("ASSORT_DIF_NUM", "ASSORT_DIF_NUM", null, null, String.class, "assortDifNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionCd = cci("DIRECTION_CD", "DIRECTION_CD", null, null, String.class, "directionCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistonType = cci("PISTON_TYPE", "PISTON_TYPE", null, null, String.class, "pistonType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionNum = cci("DIRECTION_NUM", "DIRECTION_NUM", null, null, String.class, "directionNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistWarehouseCd = cci("DIST_WAREHOUSE_CD", "DIST_WAREHOUSE_CD", null, null, String.class, "distWarehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolRcvKey = cci("SYMBOL_RCV_KEY", "SYMBOL_RCV_KEY", null, null, String.class, "symbolRcvKey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCd = cci("ITEM_CD", "ITEM_CD", null, null, String.class, "itemCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCd = cci("DESIGN_CD", "DESIGN_CD", null, null, String.class, "designCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResesrveArea = cci("RESESRVE_AREA", "RESESRVE_AREA", null, null, String.class, "resesrveArea", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * DUTY_FREE_INOUT_RESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDutyFreeInoutResultId() { return _columnDutyFreeInoutResultId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * SYMBOL_POS_KEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolPosKey() { return _columnSymbolPosKey; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * SYMBOL_FACTORY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolFactoryCd() { return _columnSymbolFactoryCd; }
    /**
     * SYMBOL_ITEM_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolItemCd() { return _columnSymbolItemCd; }
    /**
     * SYMBOL_SKU: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolSku() { return _columnSymbolSku; }
    /**
     * SYMBOL_RECEIVE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolReceiveCd() { return _columnSymbolReceiveCd; }
    /**
     * SYMBOL_PRODUCT_MARK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolProductMark() { return _columnSymbolProductMark; }
    /**
     * SYMBOL_ORDERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolOrderno() { return _columnSymbolOrderno; }
    /**
     * SYMBOL_PRINTERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolPrinterno() { return _columnSymbolPrinterno; }
    /**
     * SYMBOL_MAKENO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolMakeno() { return _columnSymbolMakeno; }
    /**
     * SYMBOL_LOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolLot4() { return _columnSymbolLot4; }
    /**
     * SYMBOL_MAKETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolMaketime() { return _columnSymbolMaketime; }
    /**
     * SYMBOL_CIRCULATION_ID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolCirculationId() { return _columnSymbolCirculationId; }
    /**
     * TRANSPORT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportCd() { return _columnTransportCd; }
    /**
     * PALLET_ID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * INIT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitNum() { return _columnInitNum; }
    /**
     * CREATE_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDatetime() { return _columnCreateDatetime; }
    /**
     * SORTING_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortingDatetime() { return _columnSortingDatetime; }
    /**
     * TRACE_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceType() { return _columnTraceType; }
    /**
     * LINE_BLOCK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * ASSORT_ED_UNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortEdUnit() { return _columnAssortEdUnit; }
    /**
     * ASSORT_ED_INDEX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortEdIndex() { return _columnAssortEdIndex; }
    /**
     * OPERATION_CODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationCode() { return _columnOperationCode; }
    /**
     * CASE_IN_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseInNum() { return _columnCaseInNum; }
    /**
     * ASSORT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortNum() { return _columnAssortNum; }
    /**
     * ASSORT_DIF_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortDifNum() { return _columnAssortDifNum; }
    /**
     * DIRECTION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionCd() { return _columnDirectionCd; }
    /**
     * PISTON_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistonType() { return _columnPistonType; }
    /**
     * CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * DIRECTION_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionNum() { return _columnDirectionNum; }
    /**
     * DIST_WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistWarehouseCd() { return _columnDistWarehouseCd; }
    /**
     * SYMBOL_RCV_KEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolRcvKey() { return _columnSymbolRcvKey; }
    /**
     * ITEM_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCd() { return _columnItemCd; }
    /**
     * DESIGN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCd() { return _columnDesignCd; }
    /**
     * RESESRVE_AREA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResesrveArea() { return _columnResesrveArea; }
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
        ls.add(columnDutyFreeInoutResultId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnSymbolPosKey());
        ls.add(columnWarehouseCd());
        ls.add(columnSymbolFactoryCd());
        ls.add(columnSymbolItemCd());
        ls.add(columnSymbolSku());
        ls.add(columnSymbolReceiveCd());
        ls.add(columnSymbolProductMark());
        ls.add(columnSymbolOrderno());
        ls.add(columnSymbolPrinterno());
        ls.add(columnSymbolMakeno());
        ls.add(columnSymbolLot4());
        ls.add(columnSymbolMaketime());
        ls.add(columnSymbolCirculationId());
        ls.add(columnTransportCd());
        ls.add(columnPalletId());
        ls.add(columnInitNum());
        ls.add(columnCreateDatetime());
        ls.add(columnSortingDatetime());
        ls.add(columnTraceType());
        ls.add(columnLineBlock());
        ls.add(columnAssortEdUnit());
        ls.add(columnAssortEdIndex());
        ls.add(columnOperationCode());
        ls.add(columnCaseInNum());
        ls.add(columnAssortNum());
        ls.add(columnAssortDifNum());
        ls.add(columnDirectionCd());
        ls.add(columnPistonType());
        ls.add(columnCustomerCd());
        ls.add(columnDirectionNum());
        ls.add(columnDistWarehouseCd());
        ls.add(columnSymbolRcvKey());
        ls.add(columnItemCd());
        ls.add(columnDesignCd());
        ls.add(columnResesrveArea());
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
    protected UniqueInfo cpui() { return hpcpui(columnDutyFreeInoutResultId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EDutyFreeInoutResult"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EDutyFreeInoutResultCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EDutyFreeInoutResultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EDutyFreeInoutResult> getEntityType() { return EDutyFreeInoutResult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EDutyFreeInoutResult newEntity() { return new EDutyFreeInoutResult(); }
    public EDutyFreeInoutResult newMyEntity() { return new EDutyFreeInoutResult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EDutyFreeInoutResult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EDutyFreeInoutResult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
