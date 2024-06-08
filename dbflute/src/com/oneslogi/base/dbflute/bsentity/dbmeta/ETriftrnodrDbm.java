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
 * The DB meta of E_TRIFTRNODR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETriftrnodrDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETriftrnodrDbm _instance = new ETriftrnodrDbm();
    private ETriftrnodrDbm() {}
    public static ETriftrnodrDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getIfdatakey(), (et, vl) -> ((ETriftrnodr)et).setIfdatakey(ctb(vl)), "ifdatakey");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getSegname(), (et, vl) -> ((ETriftrnodr)et).setSegname((String)vl), "segname");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getRefno(), (et, vl) -> ((ETriftrnodr)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getNexuspkey(), (et, vl) -> ((ETriftrnodr)et).setNexuspkey((String)vl), "nexuspkey");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getOrderno(), (et, vl) -> ((ETriftrnodr)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getOrdertype(), (et, vl) -> ((ETriftrnodr)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getCustorderno(), (et, vl) -> ((ETriftrnodr)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getTrantype(), (et, vl) -> ((ETriftrnodr)et).setTrantype((String)vl), "trantype");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getRmano(), (et, vl) -> ((ETriftrnodr)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getTransdetailtype(), (et, vl) -> ((ETriftrnodr)et).setTransdetailtype((String)vl), "transdetailtype");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getSchdate(), (et, vl) -> ((ETriftrnodr)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getSchtime(), (et, vl) -> ((ETriftrnodr)et).setSchtime((String)vl), "schtime");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getActualdate(), (et, vl) -> ((ETriftrnodr)et).setActualdate((String)vl), "actualdate");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getActualtime(), (et, vl) -> ((ETriftrnodr)et).setActualtime((String)vl), "actualtime");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getWarehousecd(), (et, vl) -> ((ETriftrnodr)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getFromcompanycd(), (et, vl) -> ((ETriftrnodr)et).setFromcompanycd((String)vl), "fromcompanycd");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getFromownercd(), (et, vl) -> ((ETriftrnodr)et).setFromownercd((String)vl), "fromownercd");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getTocompanycd(), (et, vl) -> ((ETriftrnodr)et).setTocompanycd((String)vl), "tocompanycd");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getToownercd(), (et, vl) -> ((ETriftrnodr)et).setToownercd((String)vl), "toownercd");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getNotes(), (et, vl) -> ((ETriftrnodr)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getOtherrefno1(), (et, vl) -> ((ETriftrnodr)et).setOtherrefno1((String)vl), "otherrefno1");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getOtherrefno2(), (et, vl) -> ((ETriftrnodr)et).setOtherrefno2((String)vl), "otherrefno2");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getOtherrefno3(), (et, vl) -> ((ETriftrnodr)et).setOtherrefno3((String)vl), "otherrefno3");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getPriority(), (et, vl) -> ((ETriftrnodr)et).setPriority((String)vl), "priority");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getDelFlg(), (et, vl) -> ((ETriftrnodr)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getVersionNo(), (et, vl) -> ((ETriftrnodr)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getControlNo(), (et, vl) -> ((ETriftrnodr)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getAddDt(), (et, vl) -> ((ETriftrnodr)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getAddUser(), (et, vl) -> ((ETriftrnodr)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getAddProcess(), (et, vl) -> ((ETriftrnodr)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getUpdDt(), (et, vl) -> ((ETriftrnodr)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getUpdUser(), (et, vl) -> ((ETriftrnodr)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETriftrnodr)et).getUpdProcess(), (et, vl) -> ((ETriftrnodr)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TRIFTRNODR";
    protected final String _tableDispName = "E_TRIFTRNODR";
    protected final String _tablePropertyName = "ETriftrnodr";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TRIFTRNODR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnIfdatakey = cci("IFDATAKEY", "IFDATAKEY", null, null, java.math.BigDecimal.class, "ifdatakey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSegname = cci("SEGNAME", "SEGNAME", null, null, String.class, "segname", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, true, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNexuspkey = cci("NEXUSPKEY", "NEXUSPKEY", null, null, String.class, "nexuspkey", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrantype = cci("TRANTYPE", "TRANTYPE", null, null, String.class, "trantype", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransdetailtype = cci("TRANSDETAILTYPE", "TRANSDETAILTYPE", null, null, String.class, "transdetailtype", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SCHDATE", "SCHDATE", null, null, String.class, "schdate", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchtime = cci("SCHTIME", "SCHTIME", null, null, String.class, "schtime", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActualdate = cci("ACTUALDATE", "ACTUALDATE", null, null, String.class, "actualdate", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActualtime = cci("ACTUALTIME", "ACTUALTIME", null, null, String.class, "actualtime", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromcompanycd = cci("FROMCOMPANYCD", "FROMCOMPANYCD", null, null, String.class, "fromcompanycd", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromownercd = cci("FROMOWNERCD", "FROMOWNERCD", null, null, String.class, "fromownercd", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTocompanycd = cci("TOCOMPANYCD", "TOCOMPANYCD", null, null, String.class, "tocompanycd", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToownercd = cci("TOOWNERCD", "TOOWNERCD", null, null, String.class, "toownercd", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, true, "varchar", 4000, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno1 = cci("OTHERREFNO1", "OTHERREFNO1", null, null, String.class, "otherrefno1", null, false, false, true, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno2 = cci("OTHERREFNO2", "OTHERREFNO2", null, null, String.class, "otherrefno2", null, false, false, true, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherrefno3 = cci("OTHERREFNO3", "OTHERREFNO3", null, null, String.class, "otherrefno3", null, false, false, true, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriority = cci("PRIORITY", "PRIORITY", null, null, String.class, "priority", null, false, false, true, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
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
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfdatakey() { return _columnIfdatakey; }
    /**
     * SEGNAME: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSegname() { return _columnSegname; }
    /**
     * REFNO: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * NEXUSPKEY: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNexuspkey() { return _columnNexuspkey; }
    /**
     * ORDERNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * ORDERTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * CUSTORDERNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
    /**
     * TRANTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrantype() { return _columnTrantype; }
    /**
     * RMANO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * TRANSDETAILTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransdetailtype() { return _columnTransdetailtype; }
    /**
     * SCHDATE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * SCHTIME: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchtime() { return _columnSchtime; }
    /**
     * ACTUALDATE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActualdate() { return _columnActualdate; }
    /**
     * ACTUALTIME: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActualtime() { return _columnActualtime; }
    /**
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * FROMCOMPANYCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromcompanycd() { return _columnFromcompanycd; }
    /**
     * FROMOWNERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromownercd() { return _columnFromownercd; }
    /**
     * TOCOMPANYCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTocompanycd() { return _columnTocompanycd; }
    /**
     * TOOWNERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToownercd() { return _columnToownercd; }
    /**
     * NOTES: {NotNull, varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * OTHERREFNO1: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno1() { return _columnOtherrefno1; }
    /**
     * OTHERREFNO2: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno2() { return _columnOtherrefno2; }
    /**
     * OTHERREFNO3: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherrefno3() { return _columnOtherrefno3; }
    /**
     * PRIORITY: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriority() { return _columnPriority; }
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
        ls.add(columnIfdatakey());
        ls.add(columnSegname());
        ls.add(columnRefno());
        ls.add(columnNexuspkey());
        ls.add(columnOrderno());
        ls.add(columnOrdertype());
        ls.add(columnCustorderno());
        ls.add(columnTrantype());
        ls.add(columnRmano());
        ls.add(columnTransdetailtype());
        ls.add(columnSchdate());
        ls.add(columnSchtime());
        ls.add(columnActualdate());
        ls.add(columnActualtime());
        ls.add(columnWarehousecd());
        ls.add(columnFromcompanycd());
        ls.add(columnFromownercd());
        ls.add(columnTocompanycd());
        ls.add(columnToownercd());
        ls.add(columnNotes());
        ls.add(columnOtherrefno1());
        ls.add(columnOtherrefno2());
        ls.add(columnOtherrefno3());
        ls.add(columnPriority());
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
    protected UniqueInfo cpui() { return hpcpui(columnIfdatakey()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETriftrnodr"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETriftrnodrCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETriftrnodrBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETriftrnodr> getEntityType() { return ETriftrnodr.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETriftrnodr newEntity() { return new ETriftrnodr(); }
    public ETriftrnodr newMyEntity() { return new ETriftrnodr(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETriftrnodr)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETriftrnodr)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
