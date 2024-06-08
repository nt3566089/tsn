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
 * The DB meta of T_TRMAKERCASECD. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrmakercasecdDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrmakercasecdDbm _instance = new TTrmakercasecdDbm();
    private TTrmakercasecdDbm() {}
    public static TTrmakercasecdDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getTrmakercasecdId(), (et, vl) -> ((TTrmakercasecd)et).setTrmakercasecdId(ctl(vl)), "trmakercasecdId");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getSeqno(), (et, vl) -> ((TTrmakercasecd)et).setSeqno(ctl(vl)), "seqno");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getReceivePlanHId(), (et, vl) -> ((TTrmakercasecd)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getWarehousecd(), (et, vl) -> ((TTrmakercasecd)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getSenderLocation(), (et, vl) -> ((TTrmakercasecd)et).setSenderLocation((String)vl), "senderLocation");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getReceiverLocation(), (et, vl) -> ((TTrmakercasecd)et).setReceiverLocation((String)vl), "receiverLocation");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getShipmentId(), (et, vl) -> ((TTrmakercasecd)et).setShipmentId((String)vl), "shipmentId");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getShipmentDate(), (et, vl) -> ((TTrmakercasecd)et).setShipmentDate((String)vl), "shipmentDate");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getCarrierno(), (et, vl) -> ((TTrmakercasecd)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getCarrierwbno(), (et, vl) -> ((TTrmakercasecd)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getNumberOfPallets(), (et, vl) -> ((TTrmakercasecd)et).setNumberOfPallets((String)vl), "numberOfPallets");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getSscc(), (et, vl) -> ((TTrmakercasecd)et).setSscc((String)vl), "sscc");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getCaseno(), (et, vl) -> ((TTrmakercasecd)et).setCaseno((String)vl), "caseno");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getMakercaseno(), (et, vl) -> ((TTrmakercasecd)et).setMakercaseno((String)vl), "makercaseno");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getLot4(), (et, vl) -> ((TTrmakercasecd)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getResultflg(), (et, vl) -> ((TTrmakercasecd)et).setResultflg((String)vl), "resultflg");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getReceivedflg(), (et, vl) -> ((TTrmakercasecd)et).setReceivedflg((String)vl), "receivedflg");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getIfreceivedflg(), (et, vl) -> ((TTrmakercasecd)et).setIfreceivedflg((String)vl), "ifreceivedflg");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getSymbolno(), (et, vl) -> ((TTrmakercasecd)et).setSymbolno(ctl(vl)), "symbolno");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getDelFlg(), (et, vl) -> ((TTrmakercasecd)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getVersionNo(), (et, vl) -> ((TTrmakercasecd)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getControlNo(), (et, vl) -> ((TTrmakercasecd)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getAddDt(), (et, vl) -> ((TTrmakercasecd)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getAddUser(), (et, vl) -> ((TTrmakercasecd)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getAddProcess(), (et, vl) -> ((TTrmakercasecd)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getUpdDt(), (et, vl) -> ((TTrmakercasecd)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getUpdUser(), (et, vl) -> ((TTrmakercasecd)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrmakercasecd)et).getUpdProcess(), (et, vl) -> ((TTrmakercasecd)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRMAKERCASECD";
    protected final String _tableDispName = "T_TRMAKERCASECD";
    protected final String _tablePropertyName = "TTrmakercasecd";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRMAKERCASECD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrmakercasecdId = cci("TRMAKERCASECD_ID", "TRMAKERCASECD_ID", null, null, Long.class, "trmakercasecdId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, Long.class, "seqno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSenderLocation = cci("SENDER_LOCATION", "SENDER_LOCATION", null, null, String.class, "senderLocation", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiverLocation = cci("RECEIVER_LOCATION", "RECEIVER_LOCATION", null, null, String.class, "receiverLocation", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentId = cci("SHIPMENT_ID", "SHIPMENT_ID", null, null, String.class, "shipmentId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentDate = cci("SHIPMENT_DATE", "SHIPMENT_DATE", null, null, String.class, "shipmentDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumberOfPallets = cci("NUMBER_OF_PALLETS", "NUMBER_OF_PALLETS", null, null, String.class, "numberOfPallets", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscc = cci("SSCC", "SSCC", null, null, String.class, "sscc", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseno = cci("CASENO", "CASENO", null, null, String.class, "caseno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMakercaseno = cci("MAKERCASENO", "MAKERCASENO", null, null, String.class, "makercaseno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResultflg = cci("RESULTFLG", "RESULTFLG", null, null, String.class, "resultflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedflg = cci("RECEIVEDFLG", "RECEIVEDFLG", null, null, String.class, "receivedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfreceivedflg = cci("IFRECEIVEDFLG", "IFRECEIVEDFLG", null, null, String.class, "ifreceivedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymbolno = cci("SYMBOLNO", "SYMBOLNO", null, null, Long.class, "symbolno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRMAKERCASECD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrmakercasecdId() { return _columnTrmakercasecdId; }
    /**
     * SEQNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * WAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * SENDER_LOCATION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSenderLocation() { return _columnSenderLocation; }
    /**
     * RECEIVER_LOCATION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiverLocation() { return _columnReceiverLocation; }
    /**
     * SHIPMENT_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentId() { return _columnShipmentId; }
    /**
     * SHIPMENT_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentDate() { return _columnShipmentDate; }
    /**
     * CARRIERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
    /**
     * CARRIERWBNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberOfPallets() { return _columnNumberOfPallets; }
    /**
     * SSCC: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscc() { return _columnSscc; }
    /**
     * CASENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseno() { return _columnCaseno; }
    /**
     * MAKERCASENO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMakercaseno() { return _columnMakercaseno; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * RESULTFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResultflg() { return _columnResultflg; }
    /**
     * RECEIVEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedflg() { return _columnReceivedflg; }
    /**
     * IFRECEIVEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfreceivedflg() { return _columnIfreceivedflg; }
    /**
     * SYMBOLNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymbolno() { return _columnSymbolno; }
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
        ls.add(columnTrmakercasecdId());
        ls.add(columnSeqno());
        ls.add(columnReceivePlanHId());
        ls.add(columnWarehousecd());
        ls.add(columnSenderLocation());
        ls.add(columnReceiverLocation());
        ls.add(columnShipmentId());
        ls.add(columnShipmentDate());
        ls.add(columnCarrierno());
        ls.add(columnCarrierwbno());
        ls.add(columnNumberOfPallets());
        ls.add(columnSscc());
        ls.add(columnCaseno());
        ls.add(columnMakercaseno());
        ls.add(columnLot4());
        ls.add(columnResultflg());
        ls.add(columnReceivedflg());
        ls.add(columnIfreceivedflg());
        ls.add(columnSymbolno());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrmakercasecdId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrmakercasecd"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrmakercasecdCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrmakercasecdBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrmakercasecd> getEntityType() { return TTrmakercasecd.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrmakercasecd newEntity() { return new TTrmakercasecd(); }
    public TTrmakercasecd newMyEntity() { return new TTrmakercasecd(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrmakercasecd)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrmakercasecd)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
