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
 * The DB meta of E_STOCKINFOIMPORT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EStockinfoimportDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EStockinfoimportDbm _instance = new EStockinfoimportDbm();
    private EStockinfoimportDbm() {}
    public static EStockinfoimportDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getCenterStockInfoSendId(), (et, vl) -> ((EStockinfoimport)et).setCenterStockInfoSendId(ctl(vl)), "centerStockInfoSendId");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSendCd(), (et, vl) -> ((EStockinfoimport)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSendRowId(), (et, vl) -> ((EStockinfoimport)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getWorkFlg(), (et, vl) -> ((EStockinfoimport)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSeqno(), (et, vl) -> ((EStockinfoimport)et).setSeqno((String)vl), "seqno");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getAdddatetime(), (et, vl) -> ((EStockinfoimport)et).setAdddatetime((String)vl), "adddatetime");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getWarehousecd(), (et, vl) -> ((EStockinfoimport)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getWarehouseSname(), (et, vl) -> ((EStockinfoimport)et).setWarehouseSname((String)vl), "warehouseSname");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getProductCd(), (et, vl) -> ((EStockinfoimport)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getItemName(), (et, vl) -> ((EStockinfoimport)et).setItemName((String)vl), "itemName");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getLimitdate(), (et, vl) -> ((EStockinfoimport)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getDesignCd(), (et, vl) -> ((EStockinfoimport)et).setDesignCd((String)vl), "designCd");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getOtherlot1(), (et, vl) -> ((EStockinfoimport)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getAddress3(), (et, vl) -> ((EStockinfoimport)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getQty1(), (et, vl) -> ((EStockinfoimport)et).setQty1((String)vl), "qty1");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getRefno(), (et, vl) -> ((EStockinfoimport)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getFirmcarryno(), (et, vl) -> ((EStockinfoimport)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getManufacturecd(), (et, vl) -> ((EStockinfoimport)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSourceCd(), (et, vl) -> ((EStockinfoimport)et).setSourceCd((String)vl), "sourceCd");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSourceName(), (et, vl) -> ((EStockinfoimport)et).setSourceName((String)vl), "sourceName");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getShipschdate(), (et, vl) -> ((EStockinfoimport)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSchreceiveDate(), (et, vl) -> ((EStockinfoimport)et).setSchreceiveDate((String)vl), "schreceiveDate");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getSchreceiveNum(), (et, vl) -> ((EStockinfoimport)et).setSchreceiveNum((String)vl), "schreceiveNum");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getTransportPriority(), (et, vl) -> ((EStockinfoimport)et).setTransportPriority((String)vl), "transportPriority");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getItemOrderby(), (et, vl) -> ((EStockinfoimport)et).setItemOrderby((String)vl), "itemOrderby");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getUsetype(), (et, vl) -> ((EStockinfoimport)et).setUsetype((String)vl), "usetype");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getLocgroup(), (et, vl) -> ((EStockinfoimport)et).setLocgroup((String)vl), "locgroup");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getLocgroupname(), (et, vl) -> ((EStockinfoimport)et).setLocgroupname((String)vl), "locgroupname");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getOtherrefno1(), (et, vl) -> ((EStockinfoimport)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getDelFlg(), (et, vl) -> ((EStockinfoimport)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getVersionNo(), (et, vl) -> ((EStockinfoimport)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getControlNo(), (et, vl) -> ((EStockinfoimport)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getAddDt(), (et, vl) -> ((EStockinfoimport)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getAddUser(), (et, vl) -> ((EStockinfoimport)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getAddProcess(), (et, vl) -> ((EStockinfoimport)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getUpdDt(), (et, vl) -> ((EStockinfoimport)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getUpdUser(), (et, vl) -> ((EStockinfoimport)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EStockinfoimport)et).getUpdProcess(), (et, vl) -> ((EStockinfoimport)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_STOCKINFOIMPORT";
    protected final String _tableDispName = "E_STOCKINFOIMPORT";
    protected final String _tablePropertyName = "EStockinfoimport";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_STOCKINFOIMPORT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterStockInfoSendId = cci("CENTER_STOCK_INFO_SEND_ID", "CENTER_STOCK_INFO_SEND_ID", null, null, Long.class, "centerStockInfoSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, String.class, "seqno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdddatetime = cci("ADDDATETIME", "ADDDATETIME", null, null, String.class, "adddatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseSname = cci("WAREHOUSE_SNAME", "WAREHOUSE_SNAME", null, null, String.class, "warehouseSname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemName = cci("ITEM_NAME", "ITEM_NAME", null, null, String.class, "itemName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCd = cci("DESIGN_CD", "DESIGN_CD", null, null, String.class, "designCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty1 = cci("QTY1", "QTY1", null, null, String.class, "qty1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceCd = cci("SOURCE_CD", "SOURCE_CD", null, null, String.class, "sourceCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceName = cci("SOURCE_NAME", "SOURCE_NAME", null, null, String.class, "sourceName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchreceiveDate = cci("SCHRECEIVE_DATE", "SCHRECEIVE_DATE", null, null, String.class, "schreceiveDate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchreceiveNum = cci("SCHRECEIVE_NUM", "SCHRECEIVE_NUM", null, null, String.class, "schreceiveNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportPriority = cci("TRANSPORT_PRIORITY", "TRANSPORT_PRIORITY", null, null, String.class, "transportPriority", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemOrderby = cci("ITEM_ORDERBY", "ITEM_ORDERBY", null, null, String.class, "itemOrderby", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsetype = cci("USETYPE", "USETYPE", null, null, String.class, "usetype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocgroup = cci("LOCGROUP", "LOCGROUP", null, null, String.class, "locgroup", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocgroupname = cci("LOCGROUPNAME", "LOCGROUPNAME", null, null, String.class, "locgroupname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterStockInfoSendId() { return _columnCenterStockInfoSendId; }
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
     * SEQNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * ADDDATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdddatetime() { return _columnAdddatetime; }
    /**
     * WAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WAREHOUSE_SNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseSname() { return _columnWarehouseSname; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEM_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemName() { return _columnItemName; }
    /**
     * LIMITDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * DESIGN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCd() { return _columnDesignCd; }
    /**
     * OTHERLOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * QTY1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty1() { return _columnQty1; }
    /**
     * REFNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * FIRMCARRYNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * MANUFACTURECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturecd() { return _columnManufacturecd; }
    /**
     * SOURCE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCd() { return _columnSourceCd; }
    /**
     * SOURCE_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceName() { return _columnSourceName; }
    /**
     * SHIPSCHDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * SCHRECEIVE_DATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchreceiveDate() { return _columnSchreceiveDate; }
    /**
     * SCHRECEIVE_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchreceiveNum() { return _columnSchreceiveNum; }
    /**
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportPriority() { return _columnTransportPriority; }
    /**
     * ITEM_ORDERBY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemOrderby() { return _columnItemOrderby; }
    /**
     * USETYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsetype() { return _columnUsetype; }
    /**
     * LOCGROUP: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocgroup() { return _columnLocgroup; }
    /**
     * LOCGROUPNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocgroupname() { return _columnLocgroupname; }
    /**
     * OTHERREFNO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
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
        ls.add(columnCenterStockInfoSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnSeqno());
        ls.add(columnAdddatetime());
        ls.add(columnWarehousecd());
        ls.add(columnWarehouseSname());
        ls.add(columnProductCd());
        ls.add(columnItemName());
        ls.add(columnLimitdate());
        ls.add(columnDesignCd());
        ls.add(columnOtherlot1());
        ls.add(columnAddress3());
        ls.add(columnQty1());
        ls.add(columnRefno());
        ls.add(columnFirmcarryno());
        ls.add(columnManufacturecd());
        ls.add(columnSourceCd());
        ls.add(columnSourceName());
        ls.add(columnShipschdate());
        ls.add(columnSchreceiveDate());
        ls.add(columnSchreceiveNum());
        ls.add(columnTransportPriority());
        ls.add(columnItemOrderby());
        ls.add(columnUsetype());
        ls.add(columnLocgroup());
        ls.add(columnLocgroupname());
        ls.add(columnOtherrefno1());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterStockInfoSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EStockinfoimport"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EStockinfoimportCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EStockinfoimportBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EStockinfoimport> getEntityType() { return EStockinfoimport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EStockinfoimport newEntity() { return new EStockinfoimport(); }
    public EStockinfoimport newMyEntity() { return new EStockinfoimport(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EStockinfoimport)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EStockinfoimport)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
