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
 * The DB meta of E_NOTIFICATION_DOMESTIC. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ENotificationDomesticDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ENotificationDomesticDbm _instance = new ENotificationDomesticDbm();
    private ENotificationDomesticDbm() {}
    public static ENotificationDomesticDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getNotificationDomesticId(), (et, vl) -> ((ENotificationDomestic)et).setNotificationDomesticId(ctl(vl)), "notificationDomesticId");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getReceiveCd(), (et, vl) -> ((ENotificationDomestic)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getReceiveRowId(), (et, vl) -> ((ENotificationDomestic)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getImportFlg(), (et, vl) -> ((ENotificationDomestic)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getErrorFlg(), (et, vl) -> ((ENotificationDomestic)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getErrorMessageCd(), (et, vl) -> ((ENotificationDomestic)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getWarehousecd(), (et, vl) -> ((ENotificationDomestic)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getRefno(), (et, vl) -> ((ENotificationDomestic)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getShipcd(), (et, vl) -> ((ENotificationDomestic)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getShipschdate(), (et, vl) -> ((ENotificationDomestic)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getShiptocd(), (et, vl) -> ((ENotificationDomestic)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getShiptoschdate(), (et, vl) -> ((ENotificationDomestic)et).setShiptoschdate((String)vl), "shiptoschdate");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getDatatype(), (et, vl) -> ((ENotificationDomestic)et).setDatatype((String)vl), "datatype");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getProductCd(), (et, vl) -> ((ENotificationDomestic)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getQty(), (et, vl) -> ((ENotificationDomestic)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getSubwarehousecd(), (et, vl) -> ((ENotificationDomestic)et).setSubwarehousecd((String)vl), "subwarehousecd");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getDelFlg(), (et, vl) -> ((ENotificationDomestic)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getVersionNo(), (et, vl) -> ((ENotificationDomestic)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getControlNo(), (et, vl) -> ((ENotificationDomestic)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getAddDt(), (et, vl) -> ((ENotificationDomestic)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getAddUser(), (et, vl) -> ((ENotificationDomestic)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getAddProcess(), (et, vl) -> ((ENotificationDomestic)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getUpdDt(), (et, vl) -> ((ENotificationDomestic)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getUpdUser(), (et, vl) -> ((ENotificationDomestic)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ENotificationDomestic)et).getUpdProcess(), (et, vl) -> ((ENotificationDomestic)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_NOTIFICATION_DOMESTIC";
    protected final String _tableDispName = "E_NOTIFICATION_DOMESTIC";
    protected final String _tablePropertyName = "ENotificationDomestic";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_NOTIFICATION_DOMESTIC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNotificationDomesticId = cci("NOTIFICATION_DOMESTIC_ID", "NOTIFICATION_DOMESTIC_ID", null, null, Long.class, "notificationDomesticId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoschdate = cci("SHIPTOSCHDATE", "SHIPTOSCHDATE", null, null, String.class, "shiptoschdate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatatype = cci("DATATYPE", "DATATYPE", null, null, String.class, "datatype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubwarehousecd = cci("SUBWAREHOUSECD", "SUBWAREHOUSECD", null, null, String.class, "subwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * NOTIFICATION_DOMESTIC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotificationDomesticId() { return _columnNotificationDomesticId; }
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
     * IMPORT_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * WAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * REFNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * SHIPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SHIPSCHDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * SHIPTOCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * SHIPTOSCHDATE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoschdate() { return _columnShiptoschdate; }
    /**
     * DATATYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatatype() { return _columnDatatype; }
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
     * SUBWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubwarehousecd() { return _columnSubwarehousecd; }
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
        ls.add(columnNotificationDomesticId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnWarehousecd());
        ls.add(columnRefno());
        ls.add(columnShipcd());
        ls.add(columnShipschdate());
        ls.add(columnShiptocd());
        ls.add(columnShiptoschdate());
        ls.add(columnDatatype());
        ls.add(columnProductCd());
        ls.add(columnQty());
        ls.add(columnSubwarehousecd());
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
    protected UniqueInfo cpui() { return hpcpui(columnNotificationDomesticId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ENotificationDomestic"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ENotificationDomesticCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ENotificationDomesticBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ENotificationDomestic> getEntityType() { return ENotificationDomestic.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ENotificationDomestic newEntity() { return new ENotificationDomestic(); }
    public ENotificationDomestic newMyEntity() { return new ENotificationDomestic(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ENotificationDomestic)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ENotificationDomestic)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
