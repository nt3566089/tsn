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
 * The DB meta of T_WORK_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TWorkLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TWorkLogDbm _instance = new TWorkLogDbm();
    private TWorkLogDbm() {}
    public static TWorkLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkLogId(), (et, vl) -> ((TWorkLog)et).setWorkLogId(ctl(vl)), "workLogId");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getClientCd(), (et, vl) -> ((TWorkLog)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getCenterCd(), (et, vl) -> ((TWorkLog)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getUserCd(), (et, vl) -> ((TWorkLog)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkCd(), (et, vl) -> ((TWorkLog)et).setWorkCd((String)vl), "workCd");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkDt(), (et, vl) -> ((TWorkLog)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkStartDt(), (et, vl) -> ((TWorkLog)et).setWorkStartDt(cttp(vl)), "workStartDt");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkEndDt(), (et, vl) -> ((TWorkLog)et).setWorkEndDt(cttp(vl)), "workEndDt");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkQty(), (et, vl) -> ((TWorkLog)et).setWorkQty(ctb(vl)), "workQty");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getTraceItem(), (et, vl) -> ((TWorkLog)et).setTraceItem((String)vl), "traceItem");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getMacAddress(), (et, vl) -> ((TWorkLog)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkStatus(), (et, vl) -> ((TWorkLog)et).setWorkStatus((String)vl), "workStatus");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkLogOutFlg(), (et, vl) -> ((TWorkLog)et).setWorkLogOutFlg((String)vl), "workLogOutFlg");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getWorkLogOutDt(), (et, vl) -> ((TWorkLog)et).setWorkLogOutDt(cttp(vl)), "workLogOutDt");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getDelFlg(), (et, vl) -> ((TWorkLog)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getVersionNo(), (et, vl) -> ((TWorkLog)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getControlNo(), (et, vl) -> ((TWorkLog)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getAddDt(), (et, vl) -> ((TWorkLog)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getAddUser(), (et, vl) -> ((TWorkLog)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getAddProcess(), (et, vl) -> ((TWorkLog)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getUpdDt(), (et, vl) -> ((TWorkLog)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getUpdUser(), (et, vl) -> ((TWorkLog)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TWorkLog)et).getUpdProcess(), (et, vl) -> ((TWorkLog)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TWorkLog)et).getBClassDtlByWorkStatus(), (et, vl) -> ((TWorkLog)et).setBClassDtlByWorkStatus((BClassDtl)vl), "BClassDtlByWorkStatus");
        setupEfpg(_efpgMap, et -> ((TWorkLog)et).getBClassDtlByWorkLogOutFlg(), (et, vl) -> ((TWorkLog)et).setBClassDtlByWorkLogOutFlg((BClassDtl)vl), "BClassDtlByWorkLogOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_WORK_LOG";
    protected final String _tableDispName = "T_WORK_LOG";
    protected final String _tablePropertyName = "TWorkLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_WORK_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWorkLogId = cci("WORK_LOG_ID", "WORK_LOG_ID", null, null, Long.class, "workLogId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TWorkDataList", null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCd = cci("WORK_CD", "WORK_CD", null, null, String.class, "workCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkStartDt = cci("WORK_START_DT", "WORK_START_DT", null, null, java.sql.Timestamp.class, "workStartDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkEndDt = cci("WORK_END_DT", "WORK_END_DT", null, null, java.sql.Timestamp.class, "workEndDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkQty = cci("WORK_QTY", "WORK_QTY", null, null, java.math.BigDecimal.class, "workQty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTraceItem = cci("TRACE_ITEM", "TRACE_ITEM", null, null, String.class, "traceItem", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkStatus = cci("WORK_STATUS", "WORK_STATUS", null, null, String.class, "workStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByWorkStatus", null, CDef.DefMeta.WorkStatus, false);
    protected final ColumnInfo _columnWorkLogOutFlg = cci("WORK_LOG_OUT_FLG", "WORK_LOG_OUT_FLG", null, null, String.class, "workLogOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByWorkLogOutFlg", null, CDef.DefMeta.WorkLogOutFlg, false);
    protected final ColumnInfo _columnWorkLogOutDt = cci("WORK_LOG_OUT_DT", "WORK_LOG_OUT_DT", null, null, java.sql.Timestamp.class, "workLogOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * WORK_LOG_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkLogId() { return _columnWorkLogId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * USER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * WORK_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCd() { return _columnWorkCd; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * WORK_START_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkStartDt() { return _columnWorkStartDt; }
    /**
     * WORK_END_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkEndDt() { return _columnWorkEndDt; }
    /**
     * WORK_QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkQty() { return _columnWorkQty; }
    /**
     * TRACE_ITEM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceItem() { return _columnTraceItem; }
    /**
     * MAC_ADDRESS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkStatus() { return _columnWorkStatus; }
    /**
     * WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkLogOutFlg() { return _columnWorkLogOutFlg; }
    /**
     * WORK_LOG_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkLogOutDt() { return _columnWorkLogOutDt; }
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
        ls.add(columnWorkLogId());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnUserCd());
        ls.add(columnWorkCd());
        ls.add(columnWorkDt());
        ls.add(columnWorkStartDt());
        ls.add(columnWorkEndDt());
        ls.add(columnWorkQty());
        ls.add(columnTraceItem());
        ls.add(columnMacAddress());
        ls.add(columnWorkStatus());
        ls.add(columnWorkLogOutFlg());
        ls.add(columnWorkLogOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnWorkLogId()); }
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
    /**
     * B_CLASS_DTL by my WORK_STATUS, named 'BClassDtlByWorkStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByWorkStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWorkStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_WORK_LOG_WORK_STATUS", "BClassDtlByWorkStatus", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'WORK_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my WORK_LOG_OUT_FLG, named 'BClassDtlByWorkLogOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByWorkLogOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWorkLogOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_WORK_LOG_WORK_LOG_OUT_FLG", "BClassDtlByWorkLogOutFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'WORK_LOG_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_WORK_DATA by WORK_LOG_ID, named 'TWorkDataList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTWorkDataList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWorkLogId(), TWorkDataDbm.getInstance().columnWorkLogId());
        return cri("T_WORK_DATA_FK1", "TWorkDataList", this, TWorkDataDbm.getInstance(), mp, false, "TWorkLog");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TWorkLog"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TWorkLogCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TWorkLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TWorkLog> getEntityType() { return TWorkLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TWorkLog newEntity() { return new TWorkLog(); }
    public TWorkLog newMyEntity() { return new TWorkLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TWorkLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TWorkLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
