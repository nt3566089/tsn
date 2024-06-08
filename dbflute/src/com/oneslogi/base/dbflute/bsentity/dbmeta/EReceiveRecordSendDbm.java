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
 * The DB meta of E_RECEIVE_RECORD_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EReceiveRecordSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EReceiveRecordSendDbm _instance = new EReceiveRecordSendDbm();
    private EReceiveRecordSendDbm() {}
    public static EReceiveRecordSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getReceiveRecordSendId(), (et, vl) -> ((EReceiveRecordSend)et).setReceiveRecordSendId(ctl(vl)), "receiveRecordSendId");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getSendCd(), (et, vl) -> ((EReceiveRecordSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getSendRowId(), (et, vl) -> ((EReceiveRecordSend)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getWorkFlg(), (et, vl) -> ((EReceiveRecordSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getCenterCd(), (et, vl) -> ((EReceiveRecordSend)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getUsernum1(), (et, vl) -> ((EReceiveRecordSend)et).setUsernum1(ctl(vl)), "usernum1");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getRecordType(), (et, vl) -> ((EReceiveRecordSend)et).setRecordType((String)vl), "recordType");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getJttsflg(), (et, vl) -> ((EReceiveRecordSend)et).setJttsflg((String)vl), "jttsflg");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getRefno(), (et, vl) -> ((EReceiveRecordSend)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getSeqno(), (et, vl) -> ((EReceiveRecordSend)et).setSeqno((String)vl), "seqno");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getTransportType(), (et, vl) -> ((EReceiveRecordSend)et).setTransportType((String)vl), "transportType");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getSuppliercd(), (et, vl) -> ((EReceiveRecordSend)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getWarehouseCd(), (et, vl) -> ((EReceiveRecordSend)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getReceivedate(), (et, vl) -> ((EReceiveRecordSend)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getReceivedatetime(), (et, vl) -> ((EReceiveRecordSend)et).setReceivedatetime((String)vl), "receivedatetime");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getProductCd(), (et, vl) -> ((EReceiveRecordSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getLotno(), (et, vl) -> ((EReceiveRecordSend)et).setLotno((String)vl), "lotno");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getExpectQtySum(), (et, vl) -> ((EReceiveRecordSend)et).setExpectQtySum((String)vl), "expectQtySum");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getDelFlg(), (et, vl) -> ((EReceiveRecordSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getVersionNo(), (et, vl) -> ((EReceiveRecordSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getControlNo(), (et, vl) -> ((EReceiveRecordSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getAddDt(), (et, vl) -> ((EReceiveRecordSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getAddUser(), (et, vl) -> ((EReceiveRecordSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getAddProcess(), (et, vl) -> ((EReceiveRecordSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getUpdDt(), (et, vl) -> ((EReceiveRecordSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getUpdUser(), (et, vl) -> ((EReceiveRecordSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EReceiveRecordSend)et).getUpdProcess(), (et, vl) -> ((EReceiveRecordSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_RECEIVE_RECORD_SEND";
    protected final String _tableDispName = "E_RECEIVE_RECORD_SEND";
    protected final String _tablePropertyName = "EReceiveRecordSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_RECEIVE_RECORD_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceiveRecordSendId = cci("RECEIVE_RECORD_SEND_ID", "RECEIVE_RECORD_SEND_ID", null, null, Long.class, "receiveRecordSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, Long.class, "usernum1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecordType = cci("RECORD_TYPE", "RECORD_TYPE", null, null, String.class, "recordType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJttsflg = cci("JTTSFLG", "JTTSFLG", null, null, String.class, "jttsflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, String.class, "seqno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportType = cci("TRANSPORT_TYPE", "TRANSPORT_TYPE", null, null, String.class, "transportType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedatetime = cci("RECEIVEDATETIME", "RECEIVEDATETIME", null, null, String.class, "receivedatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotno = cci("LOTNO", "LOTNO", null, null, String.class, "lotno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectQtySum = cci("EXPECT_QTY_SUM", "EXPECT_QTY_SUM", null, null, String.class, "expectQtySum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRecordSendId() { return _columnReceiveRecordSendId; }
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
     * USERNUM1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * RECORD_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecordType() { return _columnRecordType; }
    /**
     * JTTSFLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJttsflg() { return _columnJttsflg; }
    /**
     * REFNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
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
     * SUPPLIERCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
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
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOTNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotno() { return _columnLotno; }
    /**
     * EXPECT_QTY_SUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectQtySum() { return _columnExpectQtySum; }
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
        ls.add(columnReceiveRecordSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnCenterCd());
        ls.add(columnUsernum1());
        ls.add(columnRecordType());
        ls.add(columnJttsflg());
        ls.add(columnRefno());
        ls.add(columnSeqno());
        ls.add(columnTransportType());
        ls.add(columnSuppliercd());
        ls.add(columnWarehouseCd());
        ls.add(columnReceivedate());
        ls.add(columnReceivedatetime());
        ls.add(columnProductCd());
        ls.add(columnLotno());
        ls.add(columnExpectQtySum());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceiveRecordSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EReceiveRecordSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EReceiveRecordSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EReceiveRecordSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EReceiveRecordSend> getEntityType() { return EReceiveRecordSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EReceiveRecordSend newEntity() { return new EReceiveRecordSend(); }
    public EReceiveRecordSend newMyEntity() { return new EReceiveRecordSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EReceiveRecordSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EReceiveRecordSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
