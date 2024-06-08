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
 * The DB meta of T_TRSOLIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsolistDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsolistDbm _instance = new TTrsolistDbm();
    private TTrsolistDbm() {}
    public static TTrsolistDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsolist)et).getShippingListPrintId(), (et, vl) -> ((TTrsolist)et).setShippingListPrintId(ctl(vl)), "shippingListPrintId");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getTrsolistkey(), (et, vl) -> ((TTrsolist)et).setTrsolistkey(ctl(vl)), "trsolistkey");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getListkbn(), (et, vl) -> ((TTrsolist)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getPrintedflg(), (et, vl) -> ((TTrsolist)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getTrsoliststs(), (et, vl) -> ((TTrsolist)et).setTrsoliststs((String)vl), "trsoliststs");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getPrintdatetime(), (et, vl) -> ((TTrsolist)et).setPrintdatetime(cttp(vl)), "printdatetime");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getShipschdate(), (et, vl) -> ((TTrsolist)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getWorkallocateid(), (et, vl) -> ((TTrsolist)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getRmano(), (et, vl) -> ((TTrsolist)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getOwnersono(), (et, vl) -> ((TTrsolist)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getShiptocd(), (et, vl) -> ((TTrsolist)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getItemcd(), (et, vl) -> ((TTrsolist)et).setItemcd((String)vl), "itemcd");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getSoid(), (et, vl) -> ((TTrsolist)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getSodetailid(), (et, vl) -> ((TTrsolist)et).setSodetailid(ctl(vl)), "sodetailid");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getSopalletno(), (et, vl) -> ((TTrsolist)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getFloor(), (et, vl) -> ((TTrsolist)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getPickingInstId(), (et, vl) -> ((TTrsolist)et).setPickingInstId(ctl(vl)), "pickingInstId");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getCenterId(), (et, vl) -> ((TTrsolist)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getClientId(), (et, vl) -> ((TTrsolist)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getDelFlg(), (et, vl) -> ((TTrsolist)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getVersionNo(), (et, vl) -> ((TTrsolist)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getControlNo(), (et, vl) -> ((TTrsolist)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getAddDt(), (et, vl) -> ((TTrsolist)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getAddUser(), (et, vl) -> ((TTrsolist)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getAddProcess(), (et, vl) -> ((TTrsolist)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getUpdDt(), (et, vl) -> ((TTrsolist)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getUpdUser(), (et, vl) -> ((TTrsolist)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsolist)et).getUpdProcess(), (et, vl) -> ((TTrsolist)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSOLIST";
    protected final String _tableDispName = "T_TRSOLIST";
    protected final String _tablePropertyName = "TTrsolist";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSOLIST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingListPrintId = cci("SHIPPING_LIST_PRINT_ID", "SHIPPING_LIST_PRINT_ID", null, null, Long.class, "shippingListPrintId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsolistkey = cci("TRSOLISTKEY", "TRSOLISTKEY", null, null, Long.class, "trsolistkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsoliststs = cci("TRSOLISTSTS", "TRSOLISTSTS", null, null, String.class, "trsoliststs", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintdatetime = cci("PRINTDATETIME", "PRINTDATETIME", null, null, java.sql.Timestamp.class, "printdatetime", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcd = cci("ITEMCD", "ITEMCD", null, null, String.class, "itemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSodetailid = cci("SODETAILID", "SODETAILID", null, null, Long.class, "sodetailid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingInstId = cci("PICKING_INST_ID", "PICKING_INST_ID", null, null, Long.class, "pickingInstId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingListPrintId() { return _columnShippingListPrintId; }
    /**
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsolistkey() { return _columnTrsolistkey; }
    /**
     * LISTKBN: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * PRINTEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * TRSOLISTSTS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsoliststs() { return _columnTrsoliststs; }
    /**
     * PRINTDATETIME: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintdatetime() { return _columnPrintdatetime; }
    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * WORKALLOCATEID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * RMANO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * SHIPTOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * ITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcd() { return _columnItemcd; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * SODETAILID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSodetailid() { return _columnSodetailid; }
    /**
     * SOPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * FLOOR: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * PICKING_INST_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstId() { return _columnPickingInstId; }
    /**
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnShippingListPrintId());
        ls.add(columnTrsolistkey());
        ls.add(columnListkbn());
        ls.add(columnPrintedflg());
        ls.add(columnTrsoliststs());
        ls.add(columnPrintdatetime());
        ls.add(columnShipschdate());
        ls.add(columnWorkallocateid());
        ls.add(columnRmano());
        ls.add(columnOwnersono());
        ls.add(columnShiptocd());
        ls.add(columnItemcd());
        ls.add(columnSoid());
        ls.add(columnSodetailid());
        ls.add(columnSopalletno());
        ls.add(columnFloor());
        ls.add(columnPickingInstId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingListPrintId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsolist"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsolistCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsolistBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsolist> getEntityType() { return TTrsolist.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsolist newEntity() { return new TTrsolist(); }
    public TTrsolist newMyEntity() { return new TTrsolist(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsolist)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsolist)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
