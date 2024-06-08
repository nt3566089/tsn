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
 * The DB meta of E_RETURNED_EXCHANGE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EReturnedExchangeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EReturnedExchangeDbm _instance = new EReturnedExchangeDbm();
    private EReturnedExchangeDbm() {}
    public static EReturnedExchangeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getReturnedExchangeId(), (et, vl) -> ((EReturnedExchange)et).setReturnedExchangeId(ctl(vl)), "returnedExchangeId");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getSendCd(), (et, vl) -> ((EReturnedExchange)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getSendRowId(), (et, vl) -> ((EReturnedExchange)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getWorkFlg(), (et, vl) -> ((EReturnedExchange)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getCenterCd(), (et, vl) -> ((EReturnedExchange)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getRcvtype(), (et, vl) -> ((EReturnedExchange)et).setRcvtype((String)vl), "rcvtype");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getSyhnKbn(), (et, vl) -> ((EReturnedExchange)et).setSyhnKbn((String)vl), "syhnKbn");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getRecordType(), (et, vl) -> ((EReturnedExchange)et).setRecordType((String)vl), "recordType");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getSupplierrcvno(), (et, vl) -> ((EReturnedExchange)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getSeqno(), (et, vl) -> ((EReturnedExchange)et).setSeqno((String)vl), "seqno");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getWorkType(), (et, vl) -> ((EReturnedExchange)et).setWorkType((String)vl), "workType");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getOtherrefno1(), (et, vl) -> ((EReturnedExchange)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getRmano(), (et, vl) -> ((EReturnedExchange)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getOtherrefno3(), (et, vl) -> ((EReturnedExchange)et).setOtherrefno3((String)vl), "otherrefno3");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getSuppliercd(), (et, vl) -> ((EReturnedExchange)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getFromaddress2(), (et, vl) -> ((EReturnedExchange)et).setFromaddress2((String)vl), "fromaddress2");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getFromaddress1(), (et, vl) -> ((EReturnedExchange)et).setFromaddress1((String)vl), "fromaddress1");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getIfitemcd(), (et, vl) -> ((EReturnedExchange)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getReceivedqty1(), (et, vl) -> ((EReturnedExchange)et).setReceivedqty1((String)vl), "receivedqty1");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getPriceWholesale(), (et, vl) -> ((EReturnedExchange)et).setPriceWholesale((String)vl), "priceWholesale");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getLot2(), (et, vl) -> ((EReturnedExchange)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getDelFlg(), (et, vl) -> ((EReturnedExchange)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getVersionNo(), (et, vl) -> ((EReturnedExchange)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getControlNo(), (et, vl) -> ((EReturnedExchange)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getAddDt(), (et, vl) -> ((EReturnedExchange)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getAddUser(), (et, vl) -> ((EReturnedExchange)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getAddProcess(), (et, vl) -> ((EReturnedExchange)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getUpdDt(), (et, vl) -> ((EReturnedExchange)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getUpdUser(), (et, vl) -> ((EReturnedExchange)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EReturnedExchange)et).getUpdProcess(), (et, vl) -> ((EReturnedExchange)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_RETURNED_EXCHANGE";
    protected final String _tableDispName = "E_RETURNED_EXCHANGE";
    protected final String _tablePropertyName = "EReturnedExchange";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_RETURNED_EXCHANGE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReturnedExchangeId = cci("RETURNED_EXCHANGE_ID", "RETURNED_EXCHANGE_ID", null, null, Long.class, "returnedExchangeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtype = cci("RCVTYPE", "RCVTYPE", null, null, String.class, "rcvtype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSyhnKbn = cci("SYHN_KBN", "SYHN_KBN", null, null, String.class, "syhnKbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecordType = cci("RECORD_TYPE", "RECORD_TYPE", null, null, String.class, "recordType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, String.class, "seqno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkType = cci("WORK_TYPE", "WORK_TYPE", null, null, String.class, "workType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno3 = cci("OTHERREFNO3", "OTHERREFNO3", null, null, String.class, "otherrefno3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromaddress2 = cci("FROMADDRESS2", "FROMADDRESS2", null, null, String.class, "fromaddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromaddress1 = cci("FROMADDRESS1", "FROMADDRESS1", null, null, String.class, "fromaddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty1 = cci("RECEIVEDQTY1", "RECEIVEDQTY1", null, null, String.class, "receivedqty1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceWholesale = cci("PRICE_WHOLESALE", "PRICE_WHOLESALE", null, null, String.class, "priceWholesale", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReturnedExchangeId() { return _columnReturnedExchangeId; }
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
     * WORK_FLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * RCVTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvtype() { return _columnRcvtype; }
    /**
     * SYHN_KBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSyhnKbn() { return _columnSyhnKbn; }
    /**
     * RECORD_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecordType() { return _columnRecordType; }
    /**
     * SUPPLIERRCVNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * SEQNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * WORK_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkType() { return _columnWorkType; }
    /**
     * OTHERREFNO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * RMANO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * OTHERREFNO3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno3() { return _columnOtherrefno3; }
    /**
     * SUPPLIERCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * FROMADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromaddress2() { return _columnFromaddress2; }
    /**
     * FROMADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromaddress1() { return _columnFromaddress1; }
    /**
     * IFITEMCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * RECEIVEDQTY1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty1() { return _columnReceivedqty1; }
    /**
     * PRICE_WHOLESALE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceWholesale() { return _columnPriceWholesale; }
    /**
     * LOT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
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
        ls.add(columnReturnedExchangeId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnCenterCd());
        ls.add(columnRcvtype());
        ls.add(columnSyhnKbn());
        ls.add(columnRecordType());
        ls.add(columnSupplierrcvno());
        ls.add(columnSeqno());
        ls.add(columnWorkType());
        ls.add(columnOtherrefno1());
        ls.add(columnRmano());
        ls.add(columnOtherrefno3());
        ls.add(columnSuppliercd());
        ls.add(columnFromaddress2());
        ls.add(columnFromaddress1());
        ls.add(columnIfitemcd());
        ls.add(columnReceivedqty1());
        ls.add(columnPriceWholesale());
        ls.add(columnLot2());
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
    protected UniqueInfo cpui() { return hpcpui(columnReturnedExchangeId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EReturnedExchange"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EReturnedExchangeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EReturnedExchangeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EReturnedExchange> getEntityType() { return EReturnedExchange.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EReturnedExchange newEntity() { return new EReturnedExchange(); }
    public EReturnedExchange newMyEntity() { return new EReturnedExchange(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EReturnedExchange)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EReturnedExchange)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
