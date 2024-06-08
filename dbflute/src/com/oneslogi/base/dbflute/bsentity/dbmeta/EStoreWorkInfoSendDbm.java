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
 * The DB meta of E_STORE_WORK_INFO_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EStoreWorkInfoSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EStoreWorkInfoSendDbm _instance = new EStoreWorkInfoSendDbm();
    private EStoreWorkInfoSendDbm() {}
    public static EStoreWorkInfoSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getStoreWorkInfoSendId(), (et, vl) -> ((EStoreWorkInfoSend)et).setStoreWorkInfoSendId(ctl(vl)), "storeWorkInfoSendId");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getSendCd(), (et, vl) -> ((EStoreWorkInfoSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getSendRowId(), (et, vl) -> ((EStoreWorkInfoSend)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getWorkFlg(), (et, vl) -> ((EStoreWorkInfoSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getWarehousegroup(), (et, vl) -> ((EStoreWorkInfoSend)et).setWarehousegroup((String)vl), "warehousegroup");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getSupplierrcvno(), (et, vl) -> ((EStoreWorkInfoSend)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getWarehouseCd(), (et, vl) -> ((EStoreWorkInfoSend)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getReceivePlanDt(), (et, vl) -> ((EStoreWorkInfoSend)et).setReceivePlanDt((String)vl), "receivePlanDt");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getOtherrefno1(), (et, vl) -> ((EStoreWorkInfoSend)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getCarrierno(), (et, vl) -> ((EStoreWorkInfoSend)et).setCarrierno((String)vl), "carrierno");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getProductCd(), (et, vl) -> ((EStoreWorkInfoSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getLot3(), (et, vl) -> ((EStoreWorkInfoSend)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getLot4(), (et, vl) -> ((EStoreWorkInfoSend)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getLot1(), (et, vl) -> ((EStoreWorkInfoSend)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getFromfax(), (et, vl) -> ((EStoreWorkInfoSend)et).setFromfax((String)vl), "fromfax");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getLot2(), (et, vl) -> ((EStoreWorkInfoSend)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getCarriersname(), (et, vl) -> ((EStoreWorkInfoSend)et).setCarriersname((String)vl), "carriersname");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getForeigncargoflg(), (et, vl) -> ((EStoreWorkInfoSend)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getCarrierwbno(), (et, vl) -> ((EStoreWorkInfoSend)et).setCarrierwbno((String)vl), "carrierwbno");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getFromphone(), (et, vl) -> ((EStoreWorkInfoSend)et).setFromphone((String)vl), "fromphone");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getRcvkey(), (et, vl) -> ((EStoreWorkInfoSend)et).setRcvkey((String)vl), "rcvkey");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getExpectqty1(), (et, vl) -> ((EStoreWorkInfoSend)et).setExpectqty1((String)vl), "expectqty1");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getDelFlg(), (et, vl) -> ((EStoreWorkInfoSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getVersionNo(), (et, vl) -> ((EStoreWorkInfoSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getControlNo(), (et, vl) -> ((EStoreWorkInfoSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getAddDt(), (et, vl) -> ((EStoreWorkInfoSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getAddUser(), (et, vl) -> ((EStoreWorkInfoSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getAddProcess(), (et, vl) -> ((EStoreWorkInfoSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getUpdDt(), (et, vl) -> ((EStoreWorkInfoSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getUpdUser(), (et, vl) -> ((EStoreWorkInfoSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EStoreWorkInfoSend)et).getUpdProcess(), (et, vl) -> ((EStoreWorkInfoSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_STORE_WORK_INFO_SEND";
    protected final String _tableDispName = "E_STORE_WORK_INFO_SEND";
    protected final String _tablePropertyName = "EStoreWorkInfoSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_STORE_WORK_INFO_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreWorkInfoSendId = cci("STORE_WORK_INFO_SEND_ID", "STORE_WORK_INFO_SEND_ID", null, null, Long.class, "storeWorkInfoSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousegroup = cci("WarehouseGroup", "WarehouseGroup", null, null, String.class, "warehousegroup", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanDt = cci("RECEIVE_PLAN_DT", "RECEIVE_PLAN_DT", null, null, String.class, "receivePlanDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierno = cci("CARRIERNO", "CARRIERNO", null, null, String.class, "carrierno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromfax = cci("FROMFAX", "FROMFAX", null, null, String.class, "fromfax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriersname = cci("CARRIERSNAME", "CARRIERSNAME", null, null, String.class, "carriersname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierwbno = cci("CARRIERWBNO", "CARRIERWBNO", null, null, String.class, "carrierwbno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromphone = cci("FROMPHONE", "FROMPHONE", null, null, String.class, "fromphone", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, String.class, "rcvkey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, String.class, "expectqty1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * STORE_WORK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreWorkInfoSendId() { return _columnStoreWorkInfoSendId; }
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
     * WORK_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * WarehouseGroup: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousegroup() { return _columnWarehousegroup; }
    /**
     * SUPPLIERRCVNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
    /**
     * WAREHOUSE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * RECEIVE_PLAN_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDt() { return _columnReceivePlanDt; }
    /**
     * OTHERREFNO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * CARRIERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierno() { return _columnCarrierno; }
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
     * FROMFAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromfax() { return _columnFromfax; }
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
     * FOREIGNCARGOFLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CARRIERWBNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierwbno() { return _columnCarrierwbno; }
    /**
     * FROMPHONE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromphone() { return _columnFromphone; }
    /**
     * RCVKEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * EXPECTQTY1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
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
        ls.add(columnStoreWorkInfoSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnWarehousegroup());
        ls.add(columnSupplierrcvno());
        ls.add(columnWarehouseCd());
        ls.add(columnReceivePlanDt());
        ls.add(columnOtherrefno1());
        ls.add(columnCarrierno());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot1());
        ls.add(columnFromfax());
        ls.add(columnLot2());
        ls.add(columnCarriersname());
        ls.add(columnForeigncargoflg());
        ls.add(columnCarrierwbno());
        ls.add(columnFromphone());
        ls.add(columnRcvkey());
        ls.add(columnExpectqty1());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreWorkInfoSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EStoreWorkInfoSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EStoreWorkInfoSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EStoreWorkInfoSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EStoreWorkInfoSend> getEntityType() { return EStoreWorkInfoSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EStoreWorkInfoSend newEntity() { return new EStoreWorkInfoSend(); }
    public EStoreWorkInfoSend newMyEntity() { return new EStoreWorkInfoSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EStoreWorkInfoSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EStoreWorkInfoSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
