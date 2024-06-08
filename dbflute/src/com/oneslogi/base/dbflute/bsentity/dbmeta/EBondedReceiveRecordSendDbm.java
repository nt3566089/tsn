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
 * The DB meta of E_BONDED_RECEIVE_RECORD_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EBondedReceiveRecordSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EBondedReceiveRecordSendDbm _instance = new EBondedReceiveRecordSendDbm();
    private EBondedReceiveRecordSendDbm() {}
    public static EBondedReceiveRecordSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getBondedReceiveRecordSendId(), (et, vl) -> ((EBondedReceiveRecordSend)et).setBondedReceiveRecordSendId(ctl(vl)), "bondedReceiveRecordSendId");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getSendCd(), (et, vl) -> ((EBondedReceiveRecordSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getSendRowId(), (et, vl) -> ((EBondedReceiveRecordSend)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getWorkFlg(), (et, vl) -> ((EBondedReceiveRecordSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getCenterCd(), (et, vl) -> ((EBondedReceiveRecordSend)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getFromsub(), (et, vl) -> ((EBondedReceiveRecordSend)et).setFromsub((String)vl), "fromsub");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getSbwarehousecd(), (et, vl) -> ((EBondedReceiveRecordSend)et).setSbwarehousecd((String)vl), "sbwarehousecd");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getRefno(), (et, vl) -> ((EBondedReceiveRecordSend)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getReceivePlanDt(), (et, vl) -> ((EBondedReceiveRecordSend)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getCarrierno(), (et, vl) -> ((EBondedReceiveRecordSend)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getWarehouseCd(), (et, vl) -> ((EBondedReceiveRecordSend)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getOtherrefno1(), (et, vl) -> ((EBondedReceiveRecordSend)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getProductCd(), (et, vl) -> ((EBondedReceiveRecordSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getLot3(), (et, vl) -> ((EBondedReceiveRecordSend)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getLot4(), (et, vl) -> ((EBondedReceiveRecordSend)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getLot1(), (et, vl) -> ((EBondedReceiveRecordSend)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getReceivedqty1Sum(), (et, vl) -> ((EBondedReceiveRecordSend)et).setReceivedqty1Sum((String)vl), "receivedqty1Sum");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getLot2(), (et, vl) -> ((EBondedReceiveRecordSend)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getCarriersname(), (et, vl) -> ((EBondedReceiveRecordSend)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getCarrierwbno(), (et, vl) -> ((EBondedReceiveRecordSend)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getForeigncargoflg(), (et, vl) -> ((EBondedReceiveRecordSend)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getOtherlot1(), (et, vl) -> ((EBondedReceiveRecordSend)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getRecordType(), (et, vl) -> ((EBondedReceiveRecordSend)et).setRecordType((String)vl), "recordType");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getDomRefno(), (et, vl) -> ((EBondedReceiveRecordSend)et).setDomRefno((String)vl), "domRefno");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getJttsflg(), (et, vl) -> ((EBondedReceiveRecordSend)et).setJttsflg((String)vl), "jttsflg");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getSeqno(), (et, vl) -> ((EBondedReceiveRecordSend)et).setSeqno((String)vl), "seqno");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getTransportType(), (et, vl) -> ((EBondedReceiveRecordSend)et).setTransportType((String)vl), "transportType");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getReceivedate(), (et, vl) -> ((EBondedReceiveRecordSend)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getReceivedatetime(), (et, vl) -> ((EBondedReceiveRecordSend)et).setReceivedatetime((String)vl), "receivedatetime");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getLotno(), (et, vl) -> ((EBondedReceiveRecordSend)et).setLotno((String)vl), "lotno");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getReceivedqty2Sum(), (et, vl) -> ((EBondedReceiveRecordSend)et).setReceivedqty2Sum((String)vl), "receivedqty2Sum");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getDelFlg(), (et, vl) -> ((EBondedReceiveRecordSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getVersionNo(), (et, vl) -> ((EBondedReceiveRecordSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getControlNo(), (et, vl) -> ((EBondedReceiveRecordSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getAddDt(), (et, vl) -> ((EBondedReceiveRecordSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getAddUser(), (et, vl) -> ((EBondedReceiveRecordSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getAddProcess(), (et, vl) -> ((EBondedReceiveRecordSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getUpdDt(), (et, vl) -> ((EBondedReceiveRecordSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getUpdUser(), (et, vl) -> ((EBondedReceiveRecordSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EBondedReceiveRecordSend)et).getUpdProcess(), (et, vl) -> ((EBondedReceiveRecordSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_BONDED_RECEIVE_RECORD_SEND";
    protected final String _tableDispName = "E_BONDED_RECEIVE_RECORD_SEND";
    protected final String _tablePropertyName = "EBondedReceiveRecordSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_BONDED_RECEIVE_RECORD_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBondedReceiveRecordSendId = cci("BONDED_RECEIVE_RECORD_SEND_ID", "BONDED_RECEIVE_RECORD_SEND_ID", null, null, Long.class, "bondedReceiveRecordSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromsub = cci("FROMSUB", "FROMSUB", null, null, String.class, "fromsub", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSbwarehousecd = cci("SBWAREHOUSECD", "SBWAREHOUSECD", null, null, String.class, "sbwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("RECEIVE_PLAN_DT", "RECEIVE_PLAN_DT", null, null, String.class, "receivePlanDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty1Sum = cci("RECEIVEDQTY1_SUM", "RECEIVEDQTY1_SUM", null, null, String.class, "receivedqty1Sum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecordType = cci("RECORD_TYPE", "RECORD_TYPE", null, null, String.class, "recordType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDomRefno = cci("DOM_REFNO", "DOM_REFNO", null, null, String.class, "domRefno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJttsflg = cci("JTTSFLG", "JTTSFLG", null, null, String.class, "jttsflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, String.class, "seqno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportType = cci("TRANSPORT_TYPE", "TRANSPORT_TYPE", null, null, String.class, "transportType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedatetime = cci("RECEIVEDATETIME", "RECEIVEDATETIME", null, null, String.class, "receivedatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotno = cci("LOTNO", "LOTNO", null, null, String.class, "lotno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty2Sum = cci("RECEIVEDQTY2_SUM", "RECEIVEDQTY2_SUM", null, null, String.class, "receivedqty2Sum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBondedReceiveRecordSendId() { return _columnBondedReceiveRecordSendId; }
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * FROMSUB: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromsub() { return _columnFromsub; }
    /**
     * SBWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSbwarehousecd() { return _columnSbwarehousecd; }
    /**
     * REFNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDt() { return _columnReceivePlanDt; }
    /**
     * CARRIERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * OTHERREFNO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * RECEIVEDQTY1_SUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty1Sum() { return _columnReceivedqty1Sum; }
    /**
     * LOT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * CARRIERSNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriersname() { return _columnCarriersname; }
    /**
     * CARRIERWBNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * FOREIGNCARGOFLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * OTHERLOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * RECORD_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecordType() { return _columnRecordType; }
    /**
     * DOM_REFNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDomRefno() { return _columnDomRefno; }
    /**
     * JTTSFLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJttsflg() { return _columnJttsflg; }
    /**
     * SEQNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * TRANSPORT_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportType() { return _columnTransportType; }
    /**
     * RECEIVEDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * RECEIVEDATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedatetime() { return _columnReceivedatetime; }
    /**
     * LOTNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotno() { return _columnLotno; }
    /**
     * RECEIVEDQTY2_SUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty2Sum() { return _columnReceivedqty2Sum; }
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
        ls.add(columnBondedReceiveRecordSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnCenterCd());
        ls.add(columnFromsub());
        ls.add(columnSbwarehousecd());
        ls.add(columnRefno());
        ls.add(columnReceivePlanDt());
        ls.add(columnCarrierno());
        ls.add(columnWarehouseCd());
        ls.add(columnOtherrefno1());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot1());
        ls.add(columnReceivedqty1Sum());
        ls.add(columnLot2());
        ls.add(columnCarriersname());
        ls.add(columnCarrierwbno());
        ls.add(columnForeigncargoflg());
        ls.add(columnOtherlot1());
        ls.add(columnRecordType());
        ls.add(columnDomRefno());
        ls.add(columnJttsflg());
        ls.add(columnSeqno());
        ls.add(columnTransportType());
        ls.add(columnReceivedate());
        ls.add(columnReceivedatetime());
        ls.add(columnLotno());
        ls.add(columnReceivedqty2Sum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBondedReceiveRecordSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EBondedReceiveRecordSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EBondedReceiveRecordSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EBondedReceiveRecordSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EBondedReceiveRecordSend> getEntityType() { return EBondedReceiveRecordSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EBondedReceiveRecordSend newEntity() { return new EBondedReceiveRecordSend(); }
    public EBondedReceiveRecordSend newMyEntity() { return new EBondedReceiveRecordSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EBondedReceiveRecordSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EBondedReceiveRecordSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
