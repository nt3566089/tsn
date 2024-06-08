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
 * The DB meta of T_TRALLLASTWHINVDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTralllastwhinvdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTralllastwhinvdetailDbm _instance = new TTralllastwhinvdetailDbm();
    private TTralllastwhinvdetailDbm() {}
    public static TTralllastwhinvdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getAlllastwhinvdetailkey(), (et, vl) -> ((TTralllastwhinvdetail)et).setAlllastwhinvdetailkey(ctl(vl)), "alllastwhinvdetailkey");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getProductCd(), (et, vl) -> ((TTralllastwhinvdetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getProductdate(), (et, vl) -> ((TTralllastwhinvdetail)et).setProductdate((String)vl), "productdate");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getDesigncd(), (et, vl) -> ((TTralllastwhinvdetail)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getInvnum(), (et, vl) -> ((TTralllastwhinvdetail)et).setInvnum(ctb(vl)), "invnum");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getInvkbncd(), (et, vl) -> ((TTralllastwhinvdetail)et).setInvkbncd((String)vl), "invkbncd");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getInvkbn(), (et, vl) -> ((TTralllastwhinvdetail)et).setInvkbn((String)vl), "invkbn");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getTransportcd(), (et, vl) -> ((TTralllastwhinvdetail)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getFirmcarryno(), (et, vl) -> ((TTralllastwhinvdetail)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getAssortedunit(), (et, vl) -> ((TTralllastwhinvdetail)et).setAssortedunit((String)vl), "assortedunit");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getLoccd(), (et, vl) -> ((TTralllastwhinvdetail)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getSchdate(), (et, vl) -> ((TTralllastwhinvdetail)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getReceivedate(), (et, vl) -> ((TTralllastwhinvdetail)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getOutputtype(), (et, vl) -> ((TTralllastwhinvdetail)et).setOutputtype(ctb(vl)), "outputtype");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getOutputorg(), (et, vl) -> ((TTralllastwhinvdetail)et).setOutputorg(ctl(vl)), "outputorg");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getUsetype(), (et, vl) -> ((TTralllastwhinvdetail)et).setUsetype(ctl(vl)), "usetype");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getProcflg(), (et, vl) -> ((TTralllastwhinvdetail)et).setProcflg(ctl(vl)), "procflg");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getDelFlg(), (et, vl) -> ((TTralllastwhinvdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getVersionNo(), (et, vl) -> ((TTralllastwhinvdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getControlNo(), (et, vl) -> ((TTralllastwhinvdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getAddDt(), (et, vl) -> ((TTralllastwhinvdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getAddUser(), (et, vl) -> ((TTralllastwhinvdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getAddProcess(), (et, vl) -> ((TTralllastwhinvdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getUpdDt(), (et, vl) -> ((TTralllastwhinvdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getUpdUser(), (et, vl) -> ((TTralllastwhinvdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTralllastwhinvdetail)et).getUpdProcess(), (et, vl) -> ((TTralllastwhinvdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRALLLASTWHINVDETAIL";
    protected final String _tableDispName = "T_TRALLLASTWHINVDETAIL";
    protected final String _tablePropertyName = "TTralllastwhinvdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRALLLASTWHINVDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAlllastwhinvdetailkey = cci("ALLLASTWHINVDETAILKEY", "ALLLASTWHINVDETAILKEY", null, null, Long.class, "alllastwhinvdetailkey", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductdate = cci("PRODUCTDATE", "PRODUCTDATE", null, null, String.class, "productdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvnum = cci("INVNUM", "INVNUM", null, null, java.math.BigDecimal.class, "invnum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvkbncd = cci("INVKBNCD", "INVKBNCD", null, null, String.class, "invkbncd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvkbn = cci("INVKBN", "INVKBN", null, null, String.class, "invkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortedunit = cci("ASSORTEDUNIT", "ASSORTEDUNIT", null, null, String.class, "assortedunit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SCHDATE", "SCHDATE", null, null, String.class, "schdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutputtype = cci("OUTPUTTYPE", "OUTPUTTYPE", null, null, java.math.BigDecimal.class, "outputtype", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutputorg = cci("OUTPUTORG", "OUTPUTORG", null, null, Long.class, "outputorg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsetype = cci("USETYPE", "USETYPE", null, null, Long.class, "usetype", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcflg = cci("PROCFLG", "PROCFLG", null, null, Long.class, "procflg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlllastwhinvdetailkey() { return _columnAlllastwhinvdetailkey; }
    /**
     * PRODUCT_CD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCTDATE: {IX+, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductdate() { return _columnProductdate; }
    /**
     * DESIGNCD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * INVNUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvnum() { return _columnInvnum; }
    /**
     * INVKBNCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvkbncd() { return _columnInvkbncd; }
    /**
     * INVKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvkbn() { return _columnInvkbn; }
    /**
     * TRANSPORTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * FIRMCARRYNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * ASSORTEDUNIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortedunit() { return _columnAssortedunit; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * SCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * OUTPUTTYPE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutputtype() { return _columnOutputtype; }
    /**
     * OUTPUTORG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutputorg() { return _columnOutputorg; }
    /**
     * USETYPE: {IX+, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsetype() { return _columnUsetype; }
    /**
     * PROCFLG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcflg() { return _columnProcflg; }
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
        ls.add(columnAlllastwhinvdetailkey());
        ls.add(columnProductCd());
        ls.add(columnProductdate());
        ls.add(columnDesigncd());
        ls.add(columnInvnum());
        ls.add(columnInvkbncd());
        ls.add(columnInvkbn());
        ls.add(columnTransportcd());
        ls.add(columnFirmcarryno());
        ls.add(columnAssortedunit());
        ls.add(columnLoccd());
        ls.add(columnSchdate());
        ls.add(columnReceivedate());
        ls.add(columnOutputtype());
        ls.add(columnOutputorg());
        ls.add(columnUsetype());
        ls.add(columnProcflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnAlllastwhinvdetailkey()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTralllastwhinvdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTralllastwhinvdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTralllastwhinvdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTralllastwhinvdetail> getEntityType() { return TTralllastwhinvdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTralllastwhinvdetail newEntity() { return new TTralllastwhinvdetail(); }
    public TTralllastwhinvdetail newMyEntity() { return new TTralllastwhinvdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTralllastwhinvdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTralllastwhinvdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
