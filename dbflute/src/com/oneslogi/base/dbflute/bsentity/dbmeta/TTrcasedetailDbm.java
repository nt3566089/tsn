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
 * The DB meta of T_TRCASEDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrcasedetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrcasedetailDbm _instance = new TTrcasedetailDbm();
    private TTrcasedetailDbm() {}
    public static TTrcasedetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getTrcasedetailId(), (et, vl) -> ((TTrcasedetail)et).setTrcasedetailId(ctl(vl)), "trcasedetailId");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getCasedetailno(), (et, vl) -> ((TTrcasedetail)et).setCasedetailno(ctl(vl)), "casedetailno");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getTrsymbolId(), (et, vl) -> ((TTrcasedetail)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getCreatedatetime(), (et, vl) -> ((TTrcasedetail)et).setCreatedatetime(cttp(vl)), "createdatetime");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getTracetypedt(), (et, vl) -> ((TTrcasedetail)et).setTracetypedt((String)vl), "tracetypedt");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getOperationnum(), (et, vl) -> ((TTrcasedetail)et).setOperationnum(ctl(vl)), "operationnum");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAssortinitnum(), (et, vl) -> ((TTrcasedetail)et).setAssortinitnum(ctl(vl)), "assortinitnum");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAssortnum(), (et, vl) -> ((TTrcasedetail)et).setAssortnum(ctl(vl)), "assortnum");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAssortedcd(), (et, vl) -> ((TTrcasedetail)et).setAssortedcd((String)vl), "assortedcd");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAssortedunit(), (et, vl) -> ((TTrcasedetail)et).setAssortedunit((String)vl), "assortedunit");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAssortedindex(), (et, vl) -> ((TTrcasedetail)et).setAssortedindex(ctl(vl)), "assortedindex");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAssortdifnum(), (et, vl) -> ((TTrcasedetail)et).setAssortdifnum(ctl(vl)), "assortdifnum");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getDirectioncd(), (et, vl) -> ((TTrcasedetail)et).setDirectioncd((String)vl), "directioncd");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getPistontype(), (et, vl) -> ((TTrcasedetail)et).setPistontype((String)vl), "pistontype");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getDirectionnum(), (et, vl) -> ((TTrcasedetail)et).setDirectionnum(ctl(vl)), "directionnum");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getShiporder(), (et, vl) -> ((TTrcasedetail)et).setShiporder(ctl(vl)), "shiporder");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getCustomercd(), (et, vl) -> ((TTrcasedetail)et).setCustomercd((String)vl), "customercd");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getCaseserial(), (et, vl) -> ((TTrcasedetail)et).setCaseserial((String)vl), "caseserial");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getDistwarehousecd(), (et, vl) -> ((TTrcasedetail)et).setDistwarehousecd((String)vl), "distwarehousecd");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getSendsts(), (et, vl) -> ((TTrcasedetail)et).setSendsts(ctb(vl)), "sendsts");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getDtExtdata1(), (et, vl) -> ((TTrcasedetail)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getDtExtdata2(), (et, vl) -> ((TTrcasedetail)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getDelFlg(), (et, vl) -> ((TTrcasedetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getVersionNo(), (et, vl) -> ((TTrcasedetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getControlNo(), (et, vl) -> ((TTrcasedetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAddDt(), (et, vl) -> ((TTrcasedetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAddUser(), (et, vl) -> ((TTrcasedetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getAddProcess(), (et, vl) -> ((TTrcasedetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getUpdDt(), (et, vl) -> ((TTrcasedetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getUpdUser(), (et, vl) -> ((TTrcasedetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrcasedetail)et).getUpdProcess(), (et, vl) -> ((TTrcasedetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRCASEDETAIL";
    protected final String _tableDispName = "T_TRCASEDETAIL";
    protected final String _tablePropertyName = "TTrcasedetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRCASEDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrcasedetailId = cci("TRCASEDETAIL_ID", "TRCASEDETAIL_ID", null, null, Long.class, "trcasedetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasedetailno = cci("CASEDETAILNO", "CASEDETAILNO", null, null, Long.class, "casedetailno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, java.sql.Timestamp.class, "createdatetime", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetypedt = cci("TRACETYPEDT", "TRACETYPEDT", null, null, String.class, "tracetypedt", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOperationnum = cci("OPERATIONNUM", "OPERATIONNUM", null, null, Long.class, "operationnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortinitnum = cci("ASSORTINITNUM", "ASSORTINITNUM", null, null, Long.class, "assortinitnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortnum = cci("ASSORTNUM", "ASSORTNUM", null, null, Long.class, "assortnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedcd = cci("ASSORTEDCD", "ASSORTEDCD", null, null, String.class, "assortedcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedunit = cci("ASSORTEDUNIT", "ASSORTEDUNIT", null, null, String.class, "assortedunit", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedindex = cci("ASSORTEDINDEX", "ASSORTEDINDEX", null, null, Long.class, "assortedindex", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortdifnum = cci("ASSORTDIFNUM", "ASSORTDIFNUM", null, null, Long.class, "assortdifnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectioncd = cci("DIRECTIONCD", "DIRECTIONCD", null, null, String.class, "directioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistontype = cci("PISTONTYPE", "PISTONTYPE", null, null, String.class, "pistontype", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionnum = cci("DIRECTIONNUM", "DIRECTIONNUM", null, null, Long.class, "directionnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiporder = cci("SHIPORDER", "SHIPORDER", null, null, Long.class, "shiporder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomercd = cci("CUSTOMERCD", "CUSTOMERCD", null, null, String.class, "customercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseserial = cci("CASESERIAL", "CASESERIAL", null, null, String.class, "caseserial", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistwarehousecd = cci("DISTWAREHOUSECD", "DISTWAREHOUSECD", null, null, String.class, "distwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendsts = cci("SENDSTS", "SENDSTS", null, null, java.math.BigDecimal.class, "sendsts", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata1 = cci("DT_EXTDATA1", "DT_EXTDATA1", null, null, String.class, "dtExtdata1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_EXTDATA2", "DT_EXTDATA2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * TRCASEDETAIL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrcasedetailId() { return _columnTrcasedetailId; }
    /**
     * CASEDETAILNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasedetailno() { return _columnCasedetailno; }
    /**
     * TRSYMBOL_ID: {IX+, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * CREATEDATETIME: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedatetime() { return _columnCreatedatetime; }
    /**
     * TRACETYPEDT: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracetypedt() { return _columnTracetypedt; }
    /**
     * OPERATIONNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationnum() { return _columnOperationnum; }
    /**
     * ASSORTINITNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortinitnum() { return _columnAssortinitnum; }
    /**
     * ASSORTNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortnum() { return _columnAssortnum; }
    /**
     * ASSORTEDCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedcd() { return _columnAssortedcd; }
    /**
     * ASSORTEDUNIT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedunit() { return _columnAssortedunit; }
    /**
     * ASSORTEDINDEX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedindex() { return _columnAssortedindex; }
    /**
     * ASSORTDIFNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortdifnum() { return _columnAssortdifnum; }
    /**
     * DIRECTIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectioncd() { return _columnDirectioncd; }
    /**
     * PISTONTYPE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistontype() { return _columnPistontype; }
    /**
     * DIRECTIONNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionnum() { return _columnDirectionnum; }
    /**
     * SHIPORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiporder() { return _columnShiporder; }
    /**
     * CUSTOMERCD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomercd() { return _columnCustomercd; }
    /**
     * CASESERIAL: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseserial() { return _columnCaseserial; }
    /**
     * DISTWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistwarehousecd() { return _columnDistwarehousecd; }
    /**
     * SENDSTS: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendsts() { return _columnSendsts; }
    /**
     * DT_EXTDATA1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata1() { return _columnDtExtdata1; }
    /**
     * DT_EXTDATA2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
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
        ls.add(columnTrcasedetailId());
        ls.add(columnCasedetailno());
        ls.add(columnTrsymbolId());
        ls.add(columnCreatedatetime());
        ls.add(columnTracetypedt());
        ls.add(columnOperationnum());
        ls.add(columnAssortinitnum());
        ls.add(columnAssortnum());
        ls.add(columnAssortedcd());
        ls.add(columnAssortedunit());
        ls.add(columnAssortedindex());
        ls.add(columnAssortdifnum());
        ls.add(columnDirectioncd());
        ls.add(columnPistontype());
        ls.add(columnDirectionnum());
        ls.add(columnShiporder());
        ls.add(columnCustomercd());
        ls.add(columnCaseserial());
        ls.add(columnDistwarehousecd());
        ls.add(columnSendsts());
        ls.add(columnDtExtdata1());
        ls.add(columnDtExtdata2());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrcasedetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrcasedetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrcasedetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrcasedetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrcasedetail> getEntityType() { return TTrcasedetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrcasedetail newEntity() { return new TTrcasedetail(); }
    public TTrcasedetail newMyEntity() { return new TTrcasedetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrcasedetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrcasedetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
