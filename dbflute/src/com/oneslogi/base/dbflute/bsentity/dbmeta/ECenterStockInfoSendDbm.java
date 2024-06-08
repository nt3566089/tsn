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
 * The DB meta of E_CENTER_STOCK_INFO_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ECenterStockInfoSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ECenterStockInfoSendDbm _instance = new ECenterStockInfoSendDbm();
    private ECenterStockInfoSendDbm() {}
    public static ECenterStockInfoSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getCenterStockInfoSendId(), (et, vl) -> ((ECenterStockInfoSend)et).setCenterStockInfoSendId(ctl(vl)), "centerStockInfoSendId");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSeqno(), (et, vl) -> ((ECenterStockInfoSend)et).setSeqno(ctl(vl)), "seqno");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getProcessDt(), (et, vl) -> ((ECenterStockInfoSend)et).setProcessDt((String)vl), "processDt");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getWarehouseCd(), (et, vl) -> ((ECenterStockInfoSend)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getWarehouseName(), (et, vl) -> ((ECenterStockInfoSend)et).setWarehouseName((String)vl), "warehouseName");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getItemCd(), (et, vl) -> ((ECenterStockInfoSend)et).setItemCd((String)vl), "itemCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getItemName(), (et, vl) -> ((ECenterStockInfoSend)et).setItemName((String)vl), "itemName");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getLimitDate(), (et, vl) -> ((ECenterStockInfoSend)et).setLimitDate((String)vl), "limitDate");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getDesignCd(), (et, vl) -> ((ECenterStockInfoSend)et).setDesignCd((String)vl), "designCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getInvType(), (et, vl) -> ((ECenterStockInfoSend)et).setInvType((String)vl), "invType");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getInvNum(), (et, vl) -> ((ECenterStockInfoSend)et).setInvNum(ctb(vl)), "invNum");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getTransportCd(), (et, vl) -> ((ECenterStockInfoSend)et).setTransportCd((String)vl), "transportCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getFirmtransportCd(), (et, vl) -> ((ECenterStockInfoSend)et).setFirmtransportCd((String)vl), "firmtransportCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSourceCd(), (et, vl) -> ((ECenterStockInfoSend)et).setSourceCd((String)vl), "sourceCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSourceName(), (et, vl) -> ((ECenterStockInfoSend)et).setSourceName((String)vl), "sourceName");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSchDate(), (et, vl) -> ((ECenterStockInfoSend)et).setSchDate((String)vl), "schDate");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getReceiveDate(), (et, vl) -> ((ECenterStockInfoSend)et).setReceiveDate((String)vl), "receiveDate");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSchreceiveDate(), (et, vl) -> ((ECenterStockInfoSend)et).setSchreceiveDate((String)vl), "schreceiveDate");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSchreceiveNum(), (et, vl) -> ((ECenterStockInfoSend)et).setSchreceiveNum(ctb(vl)), "schreceiveNum");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getTransportPriority(), (et, vl) -> ((ECenterStockInfoSend)et).setTransportPriority(ctb(vl)), "transportPriority");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getItemSort(), (et, vl) -> ((ECenterStockInfoSend)et).setItemSort(ctb(vl)), "itemSort");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getUseType(), (et, vl) -> ((ECenterStockInfoSend)et).setUseType(ctb(vl)), "useType");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSendCd(), (et, vl) -> ((ECenterStockInfoSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getSendFlg(), (et, vl) -> ((ECenterStockInfoSend)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getDelFlg(), (et, vl) -> ((ECenterStockInfoSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getVersionNo(), (et, vl) -> ((ECenterStockInfoSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getControlNo(), (et, vl) -> ((ECenterStockInfoSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getAddDt(), (et, vl) -> ((ECenterStockInfoSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getAddUser(), (et, vl) -> ((ECenterStockInfoSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getAddProcess(), (et, vl) -> ((ECenterStockInfoSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getUpdDt(), (et, vl) -> ((ECenterStockInfoSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getUpdUser(), (et, vl) -> ((ECenterStockInfoSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ECenterStockInfoSend)et).getUpdProcess(), (et, vl) -> ((ECenterStockInfoSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_CENTER_STOCK_INFO_SEND";
    protected final String _tableDispName = "E_CENTER_STOCK_INFO_SEND";
    protected final String _tablePropertyName = "ECenterStockInfoSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_CENTER_STOCK_INFO_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterStockInfoSendId = cci("CENTER_STOCK_INFO_SEND_ID", "CENTER_STOCK_INFO_SEND_ID", null, null, Long.class, "centerStockInfoSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, Long.class, "seqno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessDt = cci("PROCESS_DT", "PROCESS_DT", null, null, String.class, "processDt", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseName = cci("WAREHOUSE_NAME", "WAREHOUSE_NAME", null, null, String.class, "warehouseName", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCd = cci("ITEM_CD", "ITEM_CD", null, null, String.class, "itemCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemName = cci("ITEM_NAME", "ITEM_NAME", null, null, String.class, "itemName", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDate = cci("LIMIT_DATE", "LIMIT_DATE", null, null, String.class, "limitDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignCd = cci("DESIGN_CD", "DESIGN_CD", null, null, String.class, "designCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvType = cci("INV_TYPE", "INV_TYPE", null, null, String.class, "invType", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvNum = cci("INV_NUM", "INV_NUM", null, null, java.math.BigDecimal.class, "invNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportCd = cci("TRANSPORT_CD", "TRANSPORT_CD", null, null, String.class, "transportCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmtransportCd = cci("FIRMTRANSPORT_CD", "FIRMTRANSPORT_CD", null, null, String.class, "firmtransportCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceCd = cci("SOURCE_CD", "SOURCE_CD", null, null, String.class, "sourceCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourceName = cci("SOURCE_NAME", "SOURCE_NAME", null, null, String.class, "sourceName", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchDate = cci("SCH_DATE", "SCH_DATE", null, null, String.class, "schDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDate = cci("RECEIVE_DATE", "RECEIVE_DATE", null, null, String.class, "receiveDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchreceiveDate = cci("SCHRECEIVE_DATE", "SCHRECEIVE_DATE", null, null, String.class, "schreceiveDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchreceiveNum = cci("SCHRECEIVE_NUM", "SCHRECEIVE_NUM", null, null, java.math.BigDecimal.class, "schreceiveNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportPriority = cci("TRANSPORT_PRIORITY", "TRANSPORT_PRIORITY", null, null, java.math.BigDecimal.class, "transportPriority", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSort = cci("ITEM_SORT", "ITEM_SORT", null, null, java.math.BigDecimal.class, "itemSort", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseType = cci("USE_TYPE", "USE_TYPE", null, null, java.math.BigDecimal.class, "useType", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * SEQNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * PROCESS_DT: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessDt() { return _columnProcessDt; }
    /**
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseName() { return _columnWarehouseName; }
    /**
     * ITEM_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCd() { return _columnItemCd; }
    /**
     * ITEM_NAME: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemName() { return _columnItemName; }
    /**
     * LIMIT_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDate() { return _columnLimitDate; }
    /**
     * DESIGN_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignCd() { return _columnDesignCd; }
    /**
     * INV_TYPE: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvType() { return _columnInvType; }
    /**
     * INV_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvNum() { return _columnInvNum; }
    /**
     * TRANSPORT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportCd() { return _columnTransportCd; }
    /**
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmtransportCd() { return _columnFirmtransportCd; }
    /**
     * SOURCE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceCd() { return _columnSourceCd; }
    /**
     * SOURCE_NAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourceName() { return _columnSourceName; }
    /**
     * SCH_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchDate() { return _columnSchDate; }
    /**
     * RECEIVE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDate() { return _columnReceiveDate; }
    /**
     * SCHRECEIVE_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchreceiveDate() { return _columnSchreceiveDate; }
    /**
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchreceiveNum() { return _columnSchreceiveNum; }
    /**
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportPriority() { return _columnTransportPriority; }
    /**
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSort() { return _columnItemSort; }
    /**
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseType() { return _columnUseType; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
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
        ls.add(columnSeqno());
        ls.add(columnProcessDt());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseName());
        ls.add(columnItemCd());
        ls.add(columnItemName());
        ls.add(columnLimitDate());
        ls.add(columnDesignCd());
        ls.add(columnInvType());
        ls.add(columnInvNum());
        ls.add(columnTransportCd());
        ls.add(columnFirmtransportCd());
        ls.add(columnSourceCd());
        ls.add(columnSourceName());
        ls.add(columnSchDate());
        ls.add(columnReceiveDate());
        ls.add(columnSchreceiveDate());
        ls.add(columnSchreceiveNum());
        ls.add(columnTransportPriority());
        ls.add(columnItemSort());
        ls.add(columnUseType());
        ls.add(columnSendCd());
        ls.add(columnSendFlg());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ECenterStockInfoSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ECenterStockInfoSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ECenterStockInfoSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ECenterStockInfoSend> getEntityType() { return ECenterStockInfoSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ECenterStockInfoSend newEntity() { return new ECenterStockInfoSend(); }
    public ECenterStockInfoSend newMyEntity() { return new ECenterStockInfoSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ECenterStockInfoSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ECenterStockInfoSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
