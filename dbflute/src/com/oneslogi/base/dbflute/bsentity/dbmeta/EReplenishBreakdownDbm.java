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
 * The DB meta of E_REPLENISH_BREAKDOWN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EReplenishBreakdownDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EReplenishBreakdownDbm _instance = new EReplenishBreakdownDbm();
    private EReplenishBreakdownDbm() {}
    public static EReplenishBreakdownDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getReplenishBreakdownId(), (et, vl) -> ((EReplenishBreakdown)et).setReplenishBreakdownId(ctl(vl)), "replenishBreakdownId");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getReceiveCd(), (et, vl) -> ((EReplenishBreakdown)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getReceiveRowId(), (et, vl) -> ((EReplenishBreakdown)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getImportFlg(), (et, vl) -> ((EReplenishBreakdown)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getErrorFlg(), (et, vl) -> ((EReplenishBreakdown)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getErrorMessageCd(), (et, vl) -> ((EReplenishBreakdown)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getTransportcd(), (et, vl) -> ((EReplenishBreakdown)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getShipcd(), (et, vl) -> ((EReplenishBreakdown)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getShipschdata(), (et, vl) -> ((EReplenishBreakdown)et).setShipschdata((String)vl), "shipschdata");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getSupplierCd(), (et, vl) -> ((EReplenishBreakdown)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getShiptoschdata(), (et, vl) -> ((EReplenishBreakdown)et).setShiptoschdata((String)vl), "shiptoschdata");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getProductCd(), (et, vl) -> ((EReplenishBreakdown)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getQty(), (et, vl) -> ((EReplenishBreakdown)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getManufacturdate(), (et, vl) -> ((EReplenishBreakdown)et).setManufacturdate((String)vl), "manufacturdate");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getDesigncd(), (et, vl) -> ((EReplenishBreakdown)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getDelFlg(), (et, vl) -> ((EReplenishBreakdown)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getVersionNo(), (et, vl) -> ((EReplenishBreakdown)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getControlNo(), (et, vl) -> ((EReplenishBreakdown)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getAddDt(), (et, vl) -> ((EReplenishBreakdown)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getAddUser(), (et, vl) -> ((EReplenishBreakdown)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getAddProcess(), (et, vl) -> ((EReplenishBreakdown)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getUpdDt(), (et, vl) -> ((EReplenishBreakdown)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getUpdUser(), (et, vl) -> ((EReplenishBreakdown)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EReplenishBreakdown)et).getUpdProcess(), (et, vl) -> ((EReplenishBreakdown)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_REPLENISH_BREAKDOWN";
    protected final String _tableDispName = "E_REPLENISH_BREAKDOWN";
    protected final String _tablePropertyName = "EReplenishBreakdown";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_REPLENISH_BREAKDOWN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReplenishBreakdownId = cci("REPLENISH_BREAKDOWN_ID", "REPLENISH_BREAKDOWN_ID", null, null, Long.class, "replenishBreakdownId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdata = cci("SHIPSCHDATA", "SHIPSCHDATA", null, null, String.class, "shipschdata", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoschdata = cci("SHIPTOSCHDATA", "SHIPTOSCHDATA", null, null, String.class, "shiptoschdata", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturdate = cci("MANUFACTURDATE", "MANUFACTURDATE", null, null, String.class, "manufacturdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * REPLENISH_BREAKDOWN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishBreakdownId() { return _columnReplenishBreakdownId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
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
     * TRANSPORTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * SHIPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SHIPSCHDATA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdata() { return _columnShipschdata; }
    /**
     * SUPPLIER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SHIPTOSCHDATA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoschdata() { return _columnShiptoschdata; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * QTY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * MANUFACTURDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturdate() { return _columnManufacturdate; }
    /**
     * DESIGNCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
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
        ls.add(columnReplenishBreakdownId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnTransportcd());
        ls.add(columnShipcd());
        ls.add(columnShipschdata());
        ls.add(columnSupplierCd());
        ls.add(columnShiptoschdata());
        ls.add(columnProductCd());
        ls.add(columnQty());
        ls.add(columnManufacturdate());
        ls.add(columnDesigncd());
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
    protected UniqueInfo cpui() { return hpcpui(columnReplenishBreakdownId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EReplenishBreakdown"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EReplenishBreakdownCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EReplenishBreakdownBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EReplenishBreakdown> getEntityType() { return EReplenishBreakdown.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EReplenishBreakdown newEntity() { return new EReplenishBreakdown(); }
    public EReplenishBreakdown newMyEntity() { return new EReplenishBreakdown(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EReplenishBreakdown)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EReplenishBreakdown)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
