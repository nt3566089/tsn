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
 * The DB meta of T_TRFLEXIBILITY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrflexibilityDbm _instance = new TTrflexibilityDbm();
    private TTrflexibilityDbm() {}
    public static TTrflexibilityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getFlexibleTransportInfoId(), (et, vl) -> ((TTrflexibility)et).setFlexibleTransportInfoId(ctl(vl)), "flexibleTransportInfoId");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getSuppliercd(), (et, vl) -> ((TTrflexibility)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getShipcd(), (et, vl) -> ((TTrflexibility)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getSchdate(), (et, vl) -> ((TTrflexibility)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getFlexibityno(), (et, vl) -> ((TTrflexibility)et).setFlexibityno(ctb(vl)), "flexibityno");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getTransportcd(), (et, vl) -> ((TTrflexibility)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getRcvdate(), (et, vl) -> ((TTrflexibility)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getSts(), (et, vl) -> ((TTrflexibility)et).setSts(ctl(vl)), "sts");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getInstractdatetime(), (et, vl) -> ((TTrflexibility)et).setInstractdatetime(cttp(vl)), "instractdatetime");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getVaExtdata1(), (et, vl) -> ((TTrflexibility)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getNmExtdata1(), (et, vl) -> ((TTrflexibility)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getCenterId(), (et, vl) -> ((TTrflexibility)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getClientId(), (et, vl) -> ((TTrflexibility)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getDelFlg(), (et, vl) -> ((TTrflexibility)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getVersionNo(), (et, vl) -> ((TTrflexibility)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getControlNo(), (et, vl) -> ((TTrflexibility)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getAddDt(), (et, vl) -> ((TTrflexibility)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getAddUser(), (et, vl) -> ((TTrflexibility)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getAddProcess(), (et, vl) -> ((TTrflexibility)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getUpdDt(), (et, vl) -> ((TTrflexibility)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getUpdUser(), (et, vl) -> ((TTrflexibility)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrflexibility)et).getUpdProcess(), (et, vl) -> ((TTrflexibility)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRFLEXIBILITY";
    protected final String _tableDispName = "T_TRFLEXIBILITY";
    protected final String _tablePropertyName = "TTrflexibility";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRFLEXIBILITY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFlexibleTransportInfoId = cci("FLEXIBLE_TRANSPORT_INFO_ID", "FLEXIBLE_TRANSPORT_INFO_ID", null, null, Long.class, "flexibleTransportInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TTrflexibilitydetailList", null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SCHDATE", "SCHDATE", null, null, String.class, "schdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexibityno = cci("FLEXIBITYNO", "FLEXIBITYNO", null, null, java.math.BigDecimal.class, "flexibityno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdate = cci("RCVDATE", "RCVDATE", null, null, String.class, "rcvdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, Long.class, "sts", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstractdatetime = cci("INSTRACTDATETIME", "INSTRACTDATETIME", null, null, java.sql.Timestamp.class, "instractdatetime", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_EXTDATA1", "VA_EXTDATA1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata1 = cci("NM_EXTDATA1", "NM_EXTDATA1", null, null, Long.class, "nmExtdata1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibleTransportInfoId() { return _columnFlexibleTransportInfoId; }
    /**
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * SHIPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SCHDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibityno() { return _columnFlexibityno; }
    /**
     * TRANSPORTCD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdate() { return _columnRcvdate; }
    /**
     * STS: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * INSTRACTDATETIME: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstractdatetime() { return _columnInstractdatetime; }
    /**
     * VA_EXTDATA1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * NM_EXTDATA1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata1() { return _columnNmExtdata1; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19)}
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
        ls.add(columnFlexibleTransportInfoId());
        ls.add(columnSuppliercd());
        ls.add(columnShipcd());
        ls.add(columnSchdate());
        ls.add(columnFlexibityno());
        ls.add(columnTransportcd());
        ls.add(columnRcvdate());
        ls.add(columnSts());
        ls.add(columnInstractdatetime());
        ls.add(columnVaExtdata1());
        ls.add(columnNmExtdata1());
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
    protected UniqueInfo cpui() { return hpcpui(columnFlexibleTransportInfoId()); }
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
    /**
     * T_TRFLEXIBILITYDETAIL by FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibilitydetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrflexibilitydetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlexibleTransportInfoId(), TTrflexibilitydetailDbm.getInstance().columnFlexibleTransportInfoId());
        return cri("T_TRFLEXIBILITYDETAIL_FK1", "TTrflexibilitydetailList", this, TTrflexibilitydetailDbm.getInstance(), mp, false, "TTrflexibility");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrflexibility"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrflexibilityCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrflexibilityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrflexibility> getEntityType() { return TTrflexibility.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrflexibility newEntity() { return new TTrflexibility(); }
    public TTrflexibility newMyEntity() { return new TTrflexibility(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrflexibility)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrflexibility)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
