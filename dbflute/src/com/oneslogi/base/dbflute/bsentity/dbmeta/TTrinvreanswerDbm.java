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
 * The DB meta of T_TRINVREANSWER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrinvreanswerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrinvreanswerDbm _instance = new TTrinvreanswerDbm();
    private TTrinvreanswerDbm() {}
    public static TTrinvreanswerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getTrinvreanswerId(), (et, vl) -> ((TTrinvreanswer)et).setTrinvreanswerId(ctl(vl)), "trinvreanswerId");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getInvinqkey(), (et, vl) -> ((TTrinvreanswer)et).setInvinqkey(ctb(vl)), "invinqkey");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getAnswerlineno(), (et, vl) -> ((TTrinvreanswer)et).setAnswerlineno(ctb(vl)), "answerlineno");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getInvinqno(), (et, vl) -> ((TTrinvreanswer)et).setInvinqno((String)vl), "invinqno");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getInvinqdate(), (et, vl) -> ((TTrinvreanswer)et).setInvinqdate((String)vl), "invinqdate");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getCompanycd(), (et, vl) -> ((TTrinvreanswer)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getProductCd(), (et, vl) -> ((TTrinvreanswer)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getManufacturdate(), (et, vl) -> ((TTrinvreanswer)et).setManufacturdate((String)vl), "manufacturdate");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getDesigncd(), (et, vl) -> ((TTrinvreanswer)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getStockkbn(), (et, vl) -> ((TTrinvreanswer)et).setStockkbn((String)vl), "stockkbn");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getStockqty(), (et, vl) -> ((TTrinvreanswer)et).setStockqty(ctl(vl)), "stockqty");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getTransportcd(), (et, vl) -> ((TTrinvreanswer)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getFirmcarryno(), (et, vl) -> ((TTrinvreanswer)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getShipcd(), (et, vl) -> ((TTrinvreanswer)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getShipschdate(), (et, vl) -> ((TTrinvreanswer)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getReceivedate(), (et, vl) -> ((TTrinvreanswer)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getRcvschdate(), (et, vl) -> ((TTrinvreanswer)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getExpectqty(), (et, vl) -> ((TTrinvreanswer)et).setExpectqty(ctl(vl)), "expectqty");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getGetdate(), (et, vl) -> ((TTrinvreanswer)et).setGetdate((String)vl), "getdate");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getCenterId(), (et, vl) -> ((TTrinvreanswer)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getClientId(), (et, vl) -> ((TTrinvreanswer)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getDelFlg(), (et, vl) -> ((TTrinvreanswer)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getVersionNo(), (et, vl) -> ((TTrinvreanswer)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getControlNo(), (et, vl) -> ((TTrinvreanswer)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getAddDt(), (et, vl) -> ((TTrinvreanswer)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getAddUser(), (et, vl) -> ((TTrinvreanswer)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getAddProcess(), (et, vl) -> ((TTrinvreanswer)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getUpdDt(), (et, vl) -> ((TTrinvreanswer)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getUpdUser(), (et, vl) -> ((TTrinvreanswer)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrinvreanswer)et).getUpdProcess(), (et, vl) -> ((TTrinvreanswer)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrinvreanswer)et).getMCenter(), (et, vl) -> ((TTrinvreanswer)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrinvreanswer)et).getMClient(), (et, vl) -> ((TTrinvreanswer)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRINVREANSWER";
    protected final String _tableDispName = "T_TRINVREANSWER";
    protected final String _tablePropertyName = "TTrinvreanswer";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRINVREANSWER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrinvreanswerId = cci("TRINVREANSWER_ID", "TRINVREANSWER_ID", null, null, Long.class, "trinvreanswerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvinqkey = cci("INVINQKEY", "INVINQKEY", null, null, java.math.BigDecimal.class, "invinqkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAnswerlineno = cci("ANSWERLINENO", "ANSWERLINENO", null, null, java.math.BigDecimal.class, "answerlineno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvinqno = cci("INVINQNO", "INVINQNO", null, null, String.class, "invinqno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvinqdate = cci("INVINQDATE", "INVINQDATE", null, null, String.class, "invinqdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturdate = cci("MANUFACTURDATE", "MANUFACTURDATE", null, null, String.class, "manufacturdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockkbn = cci("STOCKKBN", "STOCKKBN", null, null, String.class, "stockkbn", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockqty = cci("STOCKQTY", "STOCKQTY", null, null, Long.class, "stockqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty = cci("EXPECTQTY", "EXPECTQTY", null, null, Long.class, "expectqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGetdate = cci("GETDATE", "GETDATE", null, null, String.class, "getdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
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
     * TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrinvreanswerId() { return _columnTrinvreanswerId; }
    /**
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvinqkey() { return _columnInvinqkey; }
    /**
     * ANSWERLINENO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnswerlineno() { return _columnAnswerlineno; }
    /**
     * INVINQNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvinqno() { return _columnInvinqno; }
    /**
     * INVINQDATE: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvinqdate() { return _columnInvinqdate; }
    /**
     * COMPANYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * MANUFACTURDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturdate() { return _columnManufacturdate; }
    /**
     * DESIGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * STOCKKBN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockkbn() { return _columnStockkbn; }
    /**
     * STOCKQTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockqty() { return _columnStockqty; }
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
     * SHIPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SHIPSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * RCVSCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvschdate() { return _columnRcvschdate; }
    /**
     * EXPECTQTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty() { return _columnExpectqty; }
    /**
     * GETDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGetdate() { return _columnGetdate; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
        ls.add(columnTrinvreanswerId());
        ls.add(columnInvinqkey());
        ls.add(columnAnswerlineno());
        ls.add(columnInvinqno());
        ls.add(columnInvinqdate());
        ls.add(columnCompanycd());
        ls.add(columnProductCd());
        ls.add(columnManufacturdate());
        ls.add(columnDesigncd());
        ls.add(columnStockkbn());
        ls.add(columnStockqty());
        ls.add(columnTransportcd());
        ls.add(columnFirmcarryno());
        ls.add(columnShipcd());
        ls.add(columnShipschdate());
        ls.add(columnReceivedate());
        ls.add(columnRcvschdate());
        ls.add(columnExpectqty());
        ls.add(columnGetdate());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrinvreanswerId()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRINVREANSWER_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrinvreanswerList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRINVREANSWER_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrinvreanswerList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrinvreanswer"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrinvreanswerCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrinvreanswerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrinvreanswer> getEntityType() { return TTrinvreanswer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrinvreanswer newEntity() { return new TTrinvreanswer(); }
    public TTrinvreanswer newMyEntity() { return new TTrinvreanswer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrinvreanswer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrinvreanswer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
