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
 * The DB meta of E_STOCK_INQUIRY_ANSWER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EStockInquiryAnswerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EStockInquiryAnswerDbm _instance = new EStockInquiryAnswerDbm();
    private EStockInquiryAnswerDbm() {}
    public static EStockInquiryAnswerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getTrinvreanswerId(), (et, vl) -> ((EStockInquiryAnswer)et).setTrinvreanswerId(ctl(vl)), "trinvreanswerId");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getInvinqno(), (et, vl) -> ((EStockInquiryAnswer)et).setInvinqno((String)vl), "invinqno");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getInvinqdate(), (et, vl) -> ((EStockInquiryAnswer)et).setInvinqdate((String)vl), "invinqdate");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getCompanycd(), (et, vl) -> ((EStockInquiryAnswer)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getProductCd(), (et, vl) -> ((EStockInquiryAnswer)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getManufacturdate(), (et, vl) -> ((EStockInquiryAnswer)et).setManufacturdate((String)vl), "manufacturdate");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getDesigncd(), (et, vl) -> ((EStockInquiryAnswer)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getStockkbn(), (et, vl) -> ((EStockInquiryAnswer)et).setStockkbn((String)vl), "stockkbn");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getStockqty(), (et, vl) -> ((EStockInquiryAnswer)et).setStockqty(ctl(vl)), "stockqty");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getTransportcd(), (et, vl) -> ((EStockInquiryAnswer)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getFirmcarryno(), (et, vl) -> ((EStockInquiryAnswer)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getShipcd(), (et, vl) -> ((EStockInquiryAnswer)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getShipschdate(), (et, vl) -> ((EStockInquiryAnswer)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getReceivedate(), (et, vl) -> ((EStockInquiryAnswer)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getRcvschdate(), (et, vl) -> ((EStockInquiryAnswer)et).setRcvschdate((String)vl), "rcvschdate");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getExpectqty(), (et, vl) -> ((EStockInquiryAnswer)et).setExpectqty(ctl(vl)), "expectqty");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getGetdate(), (et, vl) -> ((EStockInquiryAnswer)et).setGetdate((String)vl), "getdate");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getDelFlg(), (et, vl) -> ((EStockInquiryAnswer)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getVersionNo(), (et, vl) -> ((EStockInquiryAnswer)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getControlNo(), (et, vl) -> ((EStockInquiryAnswer)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getAddDt(), (et, vl) -> ((EStockInquiryAnswer)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getAddUser(), (et, vl) -> ((EStockInquiryAnswer)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getAddProcess(), (et, vl) -> ((EStockInquiryAnswer)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getUpdDt(), (et, vl) -> ((EStockInquiryAnswer)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getUpdUser(), (et, vl) -> ((EStockInquiryAnswer)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EStockInquiryAnswer)et).getUpdProcess(), (et, vl) -> ((EStockInquiryAnswer)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_STOCK_INQUIRY_ANSWER";
    protected final String _tableDispName = "E_STOCK_INQUIRY_ANSWER";
    protected final String _tablePropertyName = "EStockInquiryAnswer";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_STOCK_INQUIRY_ANSWER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrinvreanswerId = cci("TRINVREANSWER_ID", "TRINVREANSWER_ID", null, null, Long.class, "trinvreanswerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvinqno = cci("INVINQNO", "INVINQNO", null, null, String.class, "invinqno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvinqdate = cci("INVINQDATE", "INVINQDATE", null, null, String.class, "invinqdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturdate = cci("MANUFACTURDATE", "MANUFACTURDATE", null, null, String.class, "manufacturdate", null, false, false, false, "varchar", 8, 0, null, "        ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, "  ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockkbn = cci("STOCKKBN", "STOCKKBN", null, null, String.class, "stockkbn", null, false, false, false, "varchar", 30, 0, null, "  ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockqty = cci("STOCKQTY", "STOCKQTY", null, null, Long.class, "stockqty", null, false, false, false, "bigint", 19, 0, null, "0000000000000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, "       ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, "            ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, false, "varchar", 30, 0, null, "    ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, false, "varchar", 8, 0, null, "        ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, "        ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvschdate = cci("RCVSCHDATE", "RCVSCHDATE", null, null, String.class, "rcvschdate", null, false, false, false, "varchar", 8, 0, null, "        ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty = cci("EXPECTQTY", "EXPECTQTY", null, null, Long.class, "expectqty", null, false, false, false, "bigint", 19, 0, null, "             ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGetdate = cci("GETDATE", "GETDATE", null, null, String.class, "getdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * INVINQNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvinqno() { return _columnInvinqno; }
    /**
     * INVINQDATE: {UQ+, IX, NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvinqdate() { return _columnInvinqdate; }
    /**
     * COMPANYCD: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * STOCKQTY: {bigint(19), default=[0000000000000]}
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
     * GETDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGetdate() { return _columnGetdate; }
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnInvinqdate());
        ls.add(columnCompanycd());
        return hpcui(ls);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EStockInquiryAnswer"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EStockInquiryAnswerCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EStockInquiryAnswerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EStockInquiryAnswer> getEntityType() { return EStockInquiryAnswer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EStockInquiryAnswer newEntity() { return new EStockInquiryAnswer(); }
    public EStockInquiryAnswer newMyEntity() { return new EStockInquiryAnswer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EStockInquiryAnswer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EStockInquiryAnswer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
