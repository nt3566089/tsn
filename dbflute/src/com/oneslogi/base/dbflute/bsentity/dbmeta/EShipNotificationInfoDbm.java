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
 * The DB meta of E_SHIP_NOTIFICATION_INFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShipNotificationInfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShipNotificationInfoDbm _instance = new EShipNotificationInfoDbm();
    private EShipNotificationInfoDbm() {}
    public static EShipNotificationInfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getShipNotificationInfoId(), (et, vl) -> ((EShipNotificationInfo)et).setShipNotificationInfoId(ctl(vl)), "shipNotificationInfoId");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getReceiveCd(), (et, vl) -> ((EShipNotificationInfo)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getReceiveRowId(), (et, vl) -> ((EShipNotificationInfo)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getImportFlg(), (et, vl) -> ((EShipNotificationInfo)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getErrorFlg(), (et, vl) -> ((EShipNotificationInfo)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getErrorMessageCd(), (et, vl) -> ((EShipNotificationInfo)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getWarehouseCd(), (et, vl) -> ((EShipNotificationInfo)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getRefNo(), (et, vl) -> ((EShipNotificationInfo)et).setRefNo((String)vl), "refNo");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getShipCd(), (et, vl) -> ((EShipNotificationInfo)et).setShipCd((String)vl), "shipCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getShipSchDate(), (et, vl) -> ((EShipNotificationInfo)et).setShipSchDate((String)vl), "shipSchDate");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getShipToCd(), (et, vl) -> ((EShipNotificationInfo)et).setShipToCd((String)vl), "shipToCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getShipToSchDate(), (et, vl) -> ((EShipNotificationInfo)et).setShipToSchDate((String)vl), "shipToSchDate");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getDataType(), (et, vl) -> ((EShipNotificationInfo)et).setDataType((String)vl), "dataType");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getProductCd(), (et, vl) -> ((EShipNotificationInfo)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getQty(), (et, vl) -> ((EShipNotificationInfo)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getSubWarehouseCd(), (et, vl) -> ((EShipNotificationInfo)et).setSubWarehouseCd((String)vl), "subWarehouseCd");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getDelFlg(), (et, vl) -> ((EShipNotificationInfo)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getVersionNo(), (et, vl) -> ((EShipNotificationInfo)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getControlNo(), (et, vl) -> ((EShipNotificationInfo)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getAddDt(), (et, vl) -> ((EShipNotificationInfo)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getAddUser(), (et, vl) -> ((EShipNotificationInfo)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getAddProcess(), (et, vl) -> ((EShipNotificationInfo)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getUpdDt(), (et, vl) -> ((EShipNotificationInfo)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getUpdUser(), (et, vl) -> ((EShipNotificationInfo)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShipNotificationInfo)et).getUpdProcess(), (et, vl) -> ((EShipNotificationInfo)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHIP_NOTIFICATION_INFO";
    protected final String _tableDispName = "E_SHIP_NOTIFICATION_INFO";
    protected final String _tablePropertyName = "EShipNotificationInfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHIP_NOTIFICATION_INFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShipNotificationInfoId = cci("SHIP_NOTIFICATION_INFO_ID", "SHIP_NOTIFICATION_INFO_ID", null, null, Long.class, "shipNotificationInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefNo = cci("REF_NO", "REF_NO", null, null, String.class, "refNo", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCd = cci("SHIP_CD", "SHIP_CD", null, null, String.class, "shipCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSchDate = cci("SHIP_SCH_DATE", "SHIP_SCH_DATE", null, null, String.class, "shipSchDate", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipToCd = cci("SHIP_TO_CD", "SHIP_TO_CD", null, null, String.class, "shipToCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipToSchDate = cci("SHIP_TO_SCH_DATE", "SHIP_TO_SCH_DATE", null, null, String.class, "shipToSchDate", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataType = cci("DATA_TYPE", "DATA_TYPE", null, null, String.class, "dataType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, String.class, "qty", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubWarehouseCd = cci("SUB_WAREHOUSE_CD", "SUB_WAREHOUSE_CD", null, null, String.class, "subWarehouseCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIP_NOTIFICATION_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipNotificationInfoId() { return _columnShipNotificationInfoId; }
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
     * WAREHOUSE_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * REF_NO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefNo() { return _columnRefNo; }
    /**
     * SHIP_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCd() { return _columnShipCd; }
    /**
     * SHIP_SCH_DATE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipSchDate() { return _columnShipSchDate; }
    /**
     * SHIP_TO_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipToCd() { return _columnShipToCd; }
    /**
     * SHIP_TO_SCH_DATE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipToSchDate() { return _columnShipToSchDate; }
    /**
     * DATA_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataType() { return _columnDataType; }
    /**
     * PRODUCT_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * QTY: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * SUB_WAREHOUSE_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubWarehouseCd() { return _columnSubWarehouseCd; }
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
        ls.add(columnShipNotificationInfoId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnWarehouseCd());
        ls.add(columnRefNo());
        ls.add(columnShipCd());
        ls.add(columnShipSchDate());
        ls.add(columnShipToCd());
        ls.add(columnShipToSchDate());
        ls.add(columnDataType());
        ls.add(columnProductCd());
        ls.add(columnQty());
        ls.add(columnSubWarehouseCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnShipNotificationInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShipNotificationInfo"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShipNotificationInfoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShipNotificationInfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShipNotificationInfo> getEntityType() { return EShipNotificationInfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShipNotificationInfo newEntity() { return new EShipNotificationInfo(); }
    public EShipNotificationInfo newMyEntity() { return new EShipNotificationInfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShipNotificationInfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShipNotificationInfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
