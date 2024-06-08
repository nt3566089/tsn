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
 * The DB meta of T_RECEIVE_PLAN_R. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanRDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReceivePlanRDbm _instance = new TReceivePlanRDbm();
    private TReceivePlanRDbm() {}
    public static TReceivePlanRDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getReceivePlanHId(), (et, vl) -> ((TReceivePlanR)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getRplOutFlg(), (et, vl) -> ((TReceivePlanR)et).setRplOutFlg((String)vl), "rplOutFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getRplOutUserId(), (et, vl) -> ((TReceivePlanR)et).setRplOutUserId(ctl(vl)), "rplOutUserId");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getRplOutDt(), (et, vl) -> ((TReceivePlanR)et).setRplOutDt(cttp(vl)), "rplOutDt");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getDelFlg(), (et, vl) -> ((TReceivePlanR)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getVersionNo(), (et, vl) -> ((TReceivePlanR)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getControlNo(), (et, vl) -> ((TReceivePlanR)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getAddDt(), (et, vl) -> ((TReceivePlanR)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getAddUser(), (et, vl) -> ((TReceivePlanR)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getAddProcess(), (et, vl) -> ((TReceivePlanR)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getUpdDt(), (et, vl) -> ((TReceivePlanR)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getUpdUser(), (et, vl) -> ((TReceivePlanR)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TReceivePlanR)et).getUpdProcess(), (et, vl) -> ((TReceivePlanR)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TReceivePlanR)et).getTReceivePlanH(), (et, vl) -> ((TReceivePlanR)et).setTReceivePlanH((TReceivePlanH)vl), "TReceivePlanH");
        setupEfpg(_efpgMap, et -> ((TReceivePlanR)et).getBUser(), (et, vl) -> ((TReceivePlanR)et).setBUser((BUser)vl), "BUser");
        setupEfpg(_efpgMap, et -> ((TReceivePlanR)et).getBClassDtlByRplOutFlg(), (et, vl) -> ((TReceivePlanR)et).setBClassDtlByRplOutFlg((BClassDtl)vl), "BClassDtlByRplOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_RECEIVE_PLAN_R";
    protected final String _tableDispName = "T_RECEIVE_PLAN_R";
    protected final String _tablePropertyName = "TReceivePlanR";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_RECEIVE_PLAN_R", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TReceivePlanH", null, null, false);
    protected final ColumnInfo _columnRplOutFlg = cci("RPL_OUT_FLG", "RPL_OUT_FLG", null, null, String.class, "rplOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByRplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnRplOutUserId = cci("RPL_OUT_USER_ID", "RPL_OUT_USER_ID", null, null, Long.class, "rplOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUser", null, null, false);
    protected final ColumnInfo _columnRplOutDt = cci("RPL_OUT_DT", "RPL_OUT_DT", null, null, java.sql.Timestamp.class, "rplOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_RECEIVE_PLAN_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * RPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRplOutFlg() { return _columnRplOutFlg; }
    /**
     * RPL_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRplOutUserId() { return _columnRplOutUserId; }
    /**
     * RPL_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRplOutDt() { return _columnRplOutDt; }
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
        ls.add(columnReceivePlanHId());
        ls.add(columnRplOutFlg());
        ls.add(columnRplOutUserId());
        ls.add(columnRplOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanHId()); }
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
     * T_RECEIVE_PLAN_H by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanHDbm.getInstance().columnReceivePlanHId());
        return cfi("T_RECEIVE_PLAN_R_FK1", "TReceivePlanH", this, TReceivePlanHDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TReceivePlanRAsOne", false);
    }
    /**
     * B_USER by my RPL_OUT_USER_ID, named 'BUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRplOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_RECEIVE_PLAN_R_FK2", "BUser", this, BUserDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TReceivePlanRList", false);
    }
    /**
     * B_CLASS_DTL by my RPL_OUT_FLG, named 'BClassDtlByRplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByRplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_R_RPL_OUT_FLG", "BClassDtlByRplOutFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TReceivePlanR"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TReceivePlanRCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReceivePlanR> getEntityType() { return TReceivePlanR.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReceivePlanR newEntity() { return new TReceivePlanR(); }
    public TReceivePlanR newMyEntity() { return new TReceivePlanR(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReceivePlanR)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReceivePlanR)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
