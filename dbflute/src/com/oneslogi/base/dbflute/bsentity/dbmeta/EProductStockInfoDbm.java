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
 * The DB meta of E_PRODUCT_STOCK_INFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EProductStockInfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EProductStockInfoDbm _instance = new EProductStockInfoDbm();
    private EProductStockInfoDbm() {}
    public static EProductStockInfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getEProductStockInfoId(), (et, vl) -> ((EProductStockInfo)et).setEProductStockInfoId(ctl(vl)), "EProductStockInfoId");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSendCd(), (et, vl) -> ((EProductStockInfo)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSendRowId(), (et, vl) -> ((EProductStockInfo)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getWorkFlg(), (et, vl) -> ((EProductStockInfo)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getErrorFlg(), (et, vl) -> ((EProductStockInfo)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getErrorMessageCd(), (et, vl) -> ((EProductStockInfo)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getCenterId(), (et, vl) -> ((EProductStockInfo)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getClientId(), (et, vl) -> ((EProductStockInfo)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSeq(), (et, vl) -> ((EProductStockInfo)et).setSeq(ctl(vl)), "seq");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getInOutKbn(), (et, vl) -> ((EProductStockInfo)et).setInOutKbn((String)vl), "inOutKbn");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getCenterCd(), (et, vl) -> ((EProductStockInfo)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getCenterNm(), (et, vl) -> ((EProductStockInfo)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getExecuteDate(), (et, vl) -> ((EProductStockInfo)et).setExecuteDate((String)vl), "executeDate");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getProductCd(), (et, vl) -> ((EProductStockInfo)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getProductNm(), (et, vl) -> ((EProductStockInfo)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getStockLocation(), (et, vl) -> ((EProductStockInfo)et).setStockLocation((String)vl), "stockLocation");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getStockLocationNm(), (et, vl) -> ((EProductStockInfo)et).setStockLocationNm((String)vl), "stockLocationNm");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getManufactureDate(), (et, vl) -> ((EProductStockInfo)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getDesignKbn(), (et, vl) -> ((EProductStockInfo)et).setDesignKbn((String)vl), "designKbn");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getLocationCd(), (et, vl) -> ((EProductStockInfo)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getTransportCd(), (et, vl) -> ((EProductStockInfo)et).setTransportCd((String)vl), "transportCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getFirmCarryNo(), (et, vl) -> ((EProductStockInfo)et).setFirmCarryNo((String)vl), "firmCarryNo");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSourceCd(), (et, vl) -> ((EProductStockInfo)et).setSourceCd((String)vl), "sourceCd");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSourceNm(), (et, vl) -> ((EProductStockInfo)et).setSourceNm((String)vl), "sourceNm");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSchDate(), (et, vl) -> ((EProductStockInfo)et).setSchDate((String)vl), "schDate");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getRcvDate(), (et, vl) -> ((EProductStockInfo)et).setRcvDate((String)vl), "rcvDate");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getPTdayTotalDiffQty(), (et, vl) -> ((EProductStockInfo)et).setPTdayTotalDiffQty(ctl(vl)), "PTdayTotalDiffQty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getPQty(), (et, vl) -> ((EProductStockInfo)et).setPQty(ctl(vl)), "PQty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getPInventoryNum(), (et, vl) -> ((EProductStockInfo)et).setPInventoryNum(ctl(vl)), "PInventoryNum");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getPYdayTotalDiffQty(), (et, vl) -> ((EProductStockInfo)et).setPYdayTotalDiffQty(ctl(vl)), "PYdayTotalDiffQty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getPTdayDiffQty(), (et, vl) -> ((EProductStockInfo)et).setPTdayDiffQty(ctl(vl)), "PTdayDiffQty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSlYdayTotalDiffQty(), (et, vl) -> ((EProductStockInfo)et).setSlYdayTotalDiffQty(ctl(vl)), "slYdayTotalDiffQty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getSlTdayDiffQty(), (et, vl) -> ((EProductStockInfo)et).setSlTdayDiffQty(ctl(vl)), "slTdayDiffQty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getQty(), (et, vl) -> ((EProductStockInfo)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getInventoryNum(), (et, vl) -> ((EProductStockInfo)et).setInventoryNum(ctl(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getUserUse4(), (et, vl) -> ((EProductStockInfo)et).setUserUse4((String)vl), "userUse4");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getLotAtrb1Title(), (et, vl) -> ((EProductStockInfo)et).setLotAtrb1Title((String)vl), "lotAtrb1Title");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getUserNum4(), (et, vl) -> ((EProductStockInfo)et).setUserNum4((String)vl), "userNum4");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getUserNum3(), (et, vl) -> ((EProductStockInfo)et).setUserNum3((String)vl), "userNum3");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getDelFlg(), (et, vl) -> ((EProductStockInfo)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getVersionNo(), (et, vl) -> ((EProductStockInfo)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getControlNo(), (et, vl) -> ((EProductStockInfo)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getAddDt(), (et, vl) -> ((EProductStockInfo)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getAddUser(), (et, vl) -> ((EProductStockInfo)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getAddProcess(), (et, vl) -> ((EProductStockInfo)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getUpdDt(), (et, vl) -> ((EProductStockInfo)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getUpdUser(), (et, vl) -> ((EProductStockInfo)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EProductStockInfo)et).getUpdProcess(), (et, vl) -> ((EProductStockInfo)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PRODUCT_STOCK_INFO";
    protected final String _tableDispName = "E_PRODUCT_STOCK_INFO";
    protected final String _tablePropertyName = "EProductStockInfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PRODUCT_STOCK_INFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEProductStockInfoId = cci("E_PRODUCT_STOCK_INFO_ID", "E_PRODUCT_STOCK_INFO_ID", null, null, Long.class, "EProductStockInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeq = cci("SEQ", "SEQ", null, null, Long.class, "seq", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInOutKbn = cci("IN_OUT_KBN", "IN_OUT_KBN", null, null, String.class, "inOutKbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExecuteDate = cci("EXECUTE_DATE", "EXECUTE_DATE", null, null, String.class, "executeDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockLocation = cci("STOCK_LOCATION", "STOCK_LOCATION", null, null, String.class, "stockLocation", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockLocationNm = cci("STOCK_LOCATION_NM", "STOCK_LOCATION_NM", null, null, String.class, "stockLocationNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignKbn = cci("DESIGN_KBN", "DESIGN_KBN", null, null, String.class, "designKbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportCd = cci("TRANSPORT_CD", "TRANSPORT_CD", null, null, String.class, "transportCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmCarryNo = cci("FIRM_CARRY_NO", "FIRM_CARRY_NO", null, null, String.class, "firmCarryNo", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceCd = cci("SOURCE_CD", "SOURCE_CD", null, null, String.class, "sourceCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceNm = cci("SOURCE_NM", "SOURCE_NM", null, null, String.class, "sourceNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchDate = cci("SCH_DATE", "SCH_DATE", null, null, String.class, "schDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvDate = cci("RCV_DATE", "RCV_DATE", null, null, String.class, "rcvDate", null, false, false, true, "varchar", 14, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPTdayTotalDiffQty = cci("P_TDAY_TOTAL_DIFF_QTY", "P_TDAY_TOTAL_DIFF_QTY", null, null, Long.class, "PTdayTotalDiffQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPQty = cci("P_QTY", "P_QTY", null, null, Long.class, "PQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPInventoryNum = cci("P_INVENTORY_NUM", "P_INVENTORY_NUM", null, null, Long.class, "PInventoryNum", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPYdayTotalDiffQty = cci("P_YDAY_TOTAL_DIFF_QTY", "P_YDAY_TOTAL_DIFF_QTY", null, null, Long.class, "PYdayTotalDiffQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPTdayDiffQty = cci("P_TDAY_DIFF_QTY", "P_TDAY_DIFF_QTY", null, null, Long.class, "PTdayDiffQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlYdayTotalDiffQty = cci("SL_YDAY_TOTAL_DIFF_QTY", "SL_YDAY_TOTAL_DIFF_QTY", null, null, Long.class, "slYdayTotalDiffQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlTdayDiffQty = cci("SL_TDAY_DIFF_QTY", "SL_TDAY_DIFF_QTY", null, null, Long.class, "slTdayDiffQty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, Long.class, "inventoryNum", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserUse4 = cci("USER_USE4", "USER_USE4", null, null, String.class, "userUse4", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotAtrb1Title = cci("LOT_ATRB1_TITLE", "LOT_ATRB1_TITLE", null, null, String.class, "lotAtrb1Title", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNum4 = cci("USER_NUM4", "USER_NUM4", null, null, String.class, "userNum4", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNum3 = cci("USER_NUM3", "USER_NUM3", null, null, String.class, "userNum3", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEProductStockInfoId() { return _columnEProductStockInfoId; }
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * SEQ: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeq() { return _columnSeq; }
    /**
     * IN_OUT_KBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInOutKbn() { return _columnInOutKbn; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * EXECUTE_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExecuteDate() { return _columnExecuteDate; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * STOCK_LOCATION: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockLocation() { return _columnStockLocation; }
    /**
     * STOCK_LOCATION_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockLocationNm() { return _columnStockLocationNm; }
    /**
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * DESIGN_KBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignKbn() { return _columnDesignKbn; }
    /**
     * LOCATION_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * TRANSPORT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportCd() { return _columnTransportCd; }
    /**
     * FIRM_CARRY_NO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmCarryNo() { return _columnFirmCarryNo; }
    /**
     * SOURCE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCd() { return _columnSourceCd; }
    /**
     * SOURCE_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceNm() { return _columnSourceNm; }
    /**
     * SCH_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchDate() { return _columnSchDate; }
    /**
     * RCV_DATE: {NotNull, varchar(14)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvDate() { return _columnRcvDate; }
    /**
     * P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPTdayTotalDiffQty() { return _columnPTdayTotalDiffQty; }
    /**
     * P_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPQty() { return _columnPQty; }
    /**
     * P_INVENTORY_NUM: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPInventoryNum() { return _columnPInventoryNum; }
    /**
     * P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPYdayTotalDiffQty() { return _columnPYdayTotalDiffQty; }
    /**
     * P_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPTdayDiffQty() { return _columnPTdayDiffQty; }
    /**
     * SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlYdayTotalDiffQty() { return _columnSlYdayTotalDiffQty; }
    /**
     * SL_TDAY_DIFF_QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlTdayDiffQty() { return _columnSlTdayDiffQty; }
    /**
     * QTY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * INVENTORY_NUM: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * USER_USE4: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserUse4() { return _columnUserUse4; }
    /**
     * LOT_ATRB1_TITLE: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotAtrb1Title() { return _columnLotAtrb1Title; }
    /**
     * USER_NUM4: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNum4() { return _columnUserNum4; }
    /**
     * USER_NUM3: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNum3() { return _columnUserNum3; }
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
        ls.add(columnEProductStockInfoId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnSeq());
        ls.add(columnInOutKbn());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnExecuteDate());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnStockLocation());
        ls.add(columnStockLocationNm());
        ls.add(columnManufactureDate());
        ls.add(columnDesignKbn());
        ls.add(columnLocationCd());
        ls.add(columnTransportCd());
        ls.add(columnFirmCarryNo());
        ls.add(columnSourceCd());
        ls.add(columnSourceNm());
        ls.add(columnSchDate());
        ls.add(columnRcvDate());
        ls.add(columnPTdayTotalDiffQty());
        ls.add(columnPQty());
        ls.add(columnPInventoryNum());
        ls.add(columnPYdayTotalDiffQty());
        ls.add(columnPTdayDiffQty());
        ls.add(columnSlYdayTotalDiffQty());
        ls.add(columnSlTdayDiffQty());
        ls.add(columnQty());
        ls.add(columnInventoryNum());
        ls.add(columnUserUse4());
        ls.add(columnLotAtrb1Title());
        ls.add(columnUserNum4());
        ls.add(columnUserNum3());
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
    protected UniqueInfo cpui() { return hpcpui(columnEProductStockInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EProductStockInfo"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EProductStockInfoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EProductStockInfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EProductStockInfo> getEntityType() { return EProductStockInfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EProductStockInfo newEntity() { return new EProductStockInfo(); }
    public EProductStockInfo newMyEntity() { return new EProductStockInfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EProductStockInfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EProductStockInfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
