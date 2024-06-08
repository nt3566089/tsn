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
 * The DB meta of E_TRIFCASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETrifcaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETrifcaseDbm _instance = new ETrifcaseDbm();
    private ETrifcaseDbm() {}
    public static ETrifcaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETrifcase)et).getJtsymbolno(), (et, vl) -> ((ETrifcase)et).setJtsymbolno(ctb(vl)), "jtsymbolno");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getFactorycd(), (et, vl) -> ((ETrifcase)et).setFactorycd((String)vl), "factorycd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getProductCd(), (et, vl) -> ((ETrifcase)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getMachineno(), (et, vl) -> ((ETrifcase)et).setMachineno((String)vl), "machineno");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getLimitdate(), (et, vl) -> ((ETrifcase)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getOrderno(), (et, vl) -> ((ETrifcase)et).setOrderno((String)vl), "orderno");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getCreateno(), (et, vl) -> ((ETrifcase)et).setCreateno((String)vl), "createno");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getSkucd(), (et, vl) -> ((ETrifcase)et).setSkucd((String)vl), "skucd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getDestinationcd(), (et, vl) -> ((ETrifcase)et).setDestinationcd((String)vl), "destinationcd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getManufacturecd(), (et, vl) -> ((ETrifcase)et).setManufacturecd((String)vl), "manufacturecd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getDatetime(), (et, vl) -> ((ETrifcase)et).setDatetime((String)vl), "datetime");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getDistributioncd(), (et, vl) -> ((ETrifcase)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getPalletid(), (et, vl) -> ((ETrifcase)et).setPalletid((String)vl), "palletid");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getTransportcd(), (et, vl) -> ((ETrifcase)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getShiptocd(), (et, vl) -> ((ETrifcase)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getHeadOrderno(), (et, vl) -> ((ETrifcase)et).setHeadOrderno((String)vl), "headOrderno");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getCaseqty(), (et, vl) -> ((ETrifcase)et).setCaseqty(ctl(vl)), "caseqty");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getFractqty(), (et, vl) -> ((ETrifcase)et).setFractqty(ctl(vl)), "fractqty");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getSymboladdflg(), (et, vl) -> ((ETrifcase)et).setSymboladdflg((String)vl), "symboladdflg");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getDelFlg(), (et, vl) -> ((ETrifcase)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getVersionNo(), (et, vl) -> ((ETrifcase)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getControlNo(), (et, vl) -> ((ETrifcase)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getAddDt(), (et, vl) -> ((ETrifcase)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getAddUser(), (et, vl) -> ((ETrifcase)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getAddProcess(), (et, vl) -> ((ETrifcase)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getUpdDt(), (et, vl) -> ((ETrifcase)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getUpdUser(), (et, vl) -> ((ETrifcase)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETrifcase)et).getUpdProcess(), (et, vl) -> ((ETrifcase)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TRIFCASE";
    protected final String _tableDispName = "E_TRIFCASE";
    protected final String _tablePropertyName = "ETrifcase";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TRIFCASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJtsymbolno = cci("JTSYMBOLNO", "JTSYMBOLNO", null, null, java.math.BigDecimal.class, "jtsymbolno", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFactorycd = cci("FACTORYCD", "FACTORYCD", null, null, String.class, "factorycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMachineno = cci("MACHINENO", "MACHINENO", null, null, String.class, "machineno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderno = cci("ORDERNO", "ORDERNO", null, null, String.class, "orderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateno = cci("CREATENO", "CREATENO", null, null, String.class, "createno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucd = cci("SKUCD", "SKUCD", null, null, String.class, "skucd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationcd = cci("DESTINATIONCD", "DESTINATIONCD", null, null, String.class, "destinationcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturecd = cci("MANUFACTURECD", "MANUFACTURECD", null, null, String.class, "manufacturecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatetime = cci("DATETIME", "DATETIME", null, null, String.class, "datetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletid = cci("PALLETID", "PALLETID", null, null, String.class, "palletid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TRANSPORTCD", "TRANSPORTCD", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeadOrderno = cci("HEAD_ORDERNO", "HEAD_ORDERNO", null, null, String.class, "headOrderno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseqty = cci("CASEQTY", "CASEQTY", null, null, Long.class, "caseqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFractqty = cci("FRACTQTY", "FRACTQTY", null, null, Long.class, "fractqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymboladdflg = cci("SYMBOLADDFLG", "SYMBOLADDFLG", null, null, String.class, "symboladdflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtsymbolno() { return _columnJtsymbolno; }
    /**
     * FACTORYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFactorycd() { return _columnFactorycd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * MACHINENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMachineno() { return _columnMachineno; }
    /**
     * LIMITDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * ORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderno() { return _columnOrderno; }
    /**
     * CREATENO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateno() { return _columnCreateno; }
    /**
     * SKUCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkucd() { return _columnSkucd; }
    /**
     * DESTINATIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationcd() { return _columnDestinationcd; }
    /**
     * MANUFACTURECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturecd() { return _columnManufacturecd; }
    /**
     * DATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatetime() { return _columnDatetime; }
    /**
     * DISTRIBUTIONCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * PALLETID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletid() { return _columnPalletid; }
    /**
     * TRANSPORTCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * SHIPTOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * HEAD_ORDERNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeadOrderno() { return _columnHeadOrderno; }
    /**
     * CASEQTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseqty() { return _columnCaseqty; }
    /**
     * FRACTQTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFractqty() { return _columnFractqty; }
    /**
     * SYMBOLADDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymboladdflg() { return _columnSymboladdflg; }
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
        ls.add(columnJtsymbolno());
        ls.add(columnFactorycd());
        ls.add(columnProductCd());
        ls.add(columnMachineno());
        ls.add(columnLimitdate());
        ls.add(columnOrderno());
        ls.add(columnCreateno());
        ls.add(columnSkucd());
        ls.add(columnDestinationcd());
        ls.add(columnManufacturecd());
        ls.add(columnDatetime());
        ls.add(columnDistributioncd());
        ls.add(columnPalletid());
        ls.add(columnTransportcd());
        ls.add(columnShiptocd());
        ls.add(columnHeadOrderno());
        ls.add(columnCaseqty());
        ls.add(columnFractqty());
        ls.add(columnSymboladdflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnJtsymbolno()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETrifcase"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETrifcaseCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETrifcaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETrifcase> getEntityType() { return ETrifcase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETrifcase newEntity() { return new ETrifcase(); }
    public ETrifcase newMyEntity() { return new ETrifcase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETrifcase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETrifcase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
