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
 * The DB meta of E_DELIVERY_SORTING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EDeliverySortingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EDeliverySortingDbm _instance = new EDeliverySortingDbm();
    private EDeliverySortingDbm() {}
    public static EDeliverySortingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getDeliverySortingId(), (et, vl) -> ((EDeliverySorting)et).setDeliverySortingId(ctl(vl)), "deliverySortingId");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getReceiveCd(), (et, vl) -> ((EDeliverySorting)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getReceiveRowId(), (et, vl) -> ((EDeliverySorting)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getImportFlg(), (et, vl) -> ((EDeliverySorting)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getErrorFlg(), (et, vl) -> ((EDeliverySorting)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getErrorMessageCd(), (et, vl) -> ((EDeliverySorting)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getCompanyCd(), (et, vl) -> ((EDeliverySorting)et).setCompanyCd((String)vl), "companyCd");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getRefNo(), (et, vl) -> ((EDeliverySorting)et).setRefNo((String)vl), "refNo");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getShipCd(), (et, vl) -> ((EDeliverySorting)et).setShipCd((String)vl), "shipCd");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getShipSchDate(), (et, vl) -> ((EDeliverySorting)et).setShipSchDate((String)vl), "shipSchDate");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getShipToCd(), (et, vl) -> ((EDeliverySorting)et).setShipToCd((String)vl), "shipToCd");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getShipToSchDate(), (et, vl) -> ((EDeliverySorting)et).setShipToSchDate((String)vl), "shipToSchDate");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getFcflg(), (et, vl) -> ((EDeliverySorting)et).setFcflg((String)vl), "fcflg");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getDelFlg(), (et, vl) -> ((EDeliverySorting)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getVersionNo(), (et, vl) -> ((EDeliverySorting)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getControlNo(), (et, vl) -> ((EDeliverySorting)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getAddDt(), (et, vl) -> ((EDeliverySorting)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getAddUser(), (et, vl) -> ((EDeliverySorting)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getAddProcess(), (et, vl) -> ((EDeliverySorting)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getUpdDt(), (et, vl) -> ((EDeliverySorting)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getUpdUser(), (et, vl) -> ((EDeliverySorting)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EDeliverySorting)et).getUpdProcess(), (et, vl) -> ((EDeliverySorting)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_DELIVERY_SORTING";
    protected final String _tableDispName = "E_DELIVERY_SORTING";
    protected final String _tablePropertyName = "EDeliverySorting";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_DELIVERY_SORTING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeliverySortingId = cci("DELIVERY_SORTING_ID", "DELIVERY_SORTING_ID", null, null, Long.class, "deliverySortingId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyCd = cci("COMPANY_CD", "COMPANY_CD", null, null, String.class, "companyCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefNo = cci("REF_NO", "REF_NO", null, null, String.class, "refNo", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCd = cci("SHIP_CD", "SHIP_CD", null, null, String.class, "shipCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSchDate = cci("SHIP_SCH_DATE", "SHIP_SCH_DATE", null, null, String.class, "shipSchDate", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipToCd = cci("SHIP_TO_CD", "SHIP_TO_CD", null, null, String.class, "shipToCd", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipToSchDate = cci("SHIP_TO_SCH_DATE", "SHIP_TO_SCH_DATE", null, null, String.class, "shipToSchDate", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFcflg = cci("FCFLG", "FCFLG", null, null, String.class, "fcflg", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * DELIVERY_SORTING_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverySortingId() { return _columnDeliverySortingId; }
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
     * COMPANY_CD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyCd() { return _columnCompanyCd; }
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
     * FCFLG: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFcflg() { return _columnFcflg; }
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
        ls.add(columnDeliverySortingId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnCompanyCd());
        ls.add(columnRefNo());
        ls.add(columnShipCd());
        ls.add(columnShipSchDate());
        ls.add(columnShipToCd());
        ls.add(columnShipToSchDate());
        ls.add(columnFcflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnDeliverySortingId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EDeliverySorting"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EDeliverySortingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EDeliverySortingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EDeliverySorting> getEntityType() { return EDeliverySorting.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EDeliverySorting newEntity() { return new EDeliverySorting(); }
    public EDeliverySorting newMyEntity() { return new EDeliverySorting(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EDeliverySorting)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EDeliverySorting)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
