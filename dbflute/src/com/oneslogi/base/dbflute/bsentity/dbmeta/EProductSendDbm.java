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
 * The DB meta of E_PRODUCT_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EProductSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EProductSendDbm _instance = new EProductSendDbm();
    private EProductSendDbm() {}
    public static EProductSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EProductSend)et).getProductSendId(), (et, vl) -> ((EProductSend)et).setProductSendId(ctl(vl)), "productSendId");
        setupEpg(_epgMap, et -> ((EProductSend)et).getSendCd(), (et, vl) -> ((EProductSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EProductSend)et).getSendRowId(), (et, vl) -> ((EProductSend)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EProductSend)et).getProcessedFlg(), (et, vl) -> ((EProductSend)et).setProcessedFlg((String)vl), "processedFlg");
        setupEpg(_epgMap, et -> ((EProductSend)et).getProductCd(), (et, vl) -> ((EProductSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EProductSend)et).getProductNm(), (et, vl) -> ((EProductSend)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((EProductSend)et).getProductAbbr(), (et, vl) -> ((EProductSend)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((EProductSend)et).getPriceBuy(), (et, vl) -> ((EProductSend)et).setPriceBuy(ctl(vl)), "priceBuy");
        setupEpg(_epgMap, et -> ((EProductSend)et).getUnit2(), (et, vl) -> ((EProductSend)et).setUnit2(ctb(vl)), "unit2");
        setupEpg(_epgMap, et -> ((EProductSend)et).getBxPerNumber(), (et, vl) -> ((EProductSend)et).setBxPerNumber(ctb(vl)), "bxPerNumber");
        setupEpg(_epgMap, et -> ((EProductSend)et).getPBxCount(), (et, vl) -> ((EProductSend)et).setPBxCount(ctb(vl)), "PBxCount");
        setupEpg(_epgMap, et -> ((EProductSend)et).getFUser1(), (et, vl) -> ((EProductSend)et).setFUser1((String)vl), "FUser1");
        setupEpg(_epgMap, et -> ((EProductSend)et).getLength1(), (et, vl) -> ((EProductSend)et).setLength1(ctl(vl)), "length1");
        setupEpg(_epgMap, et -> ((EProductSend)et).getWidth1(), (et, vl) -> ((EProductSend)et).setWidth1(ctl(vl)), "width1");
        setupEpg(_epgMap, et -> ((EProductSend)et).getHeight1(), (et, vl) -> ((EProductSend)et).setHeight1(ctl(vl)), "height1");
        setupEpg(_epgMap, et -> ((EProductSend)et).getPOdd(), (et, vl) -> ((EProductSend)et).setPOdd(ctb(vl)), "POdd");
        setupEpg(_epgMap, et -> ((EProductSend)et).getSpOperator1(), (et, vl) -> ((EProductSend)et).setSpOperator1((String)vl), "spOperator1");
        setupEpg(_epgMap, et -> ((EProductSend)et).getManuitemcd(), (et, vl) -> ((EProductSend)et).setManuitemcd((String)vl), "manuitemcd");
        setupEpg(_epgMap, et -> ((EProductSend)et).getUseruse3(), (et, vl) -> ((EProductSend)et).setUseruse3((String)vl), "useruse3");
        setupEpg(_epgMap, et -> ((EProductSend)et).getDelFlg(), (et, vl) -> ((EProductSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EProductSend)et).getVersionNo(), (et, vl) -> ((EProductSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EProductSend)et).getControlNo(), (et, vl) -> ((EProductSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EProductSend)et).getAddDt(), (et, vl) -> ((EProductSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EProductSend)et).getAddUser(), (et, vl) -> ((EProductSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EProductSend)et).getAddProcess(), (et, vl) -> ((EProductSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EProductSend)et).getUpdDt(), (et, vl) -> ((EProductSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EProductSend)et).getUpdUser(), (et, vl) -> ((EProductSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EProductSend)et).getUpdProcess(), (et, vl) -> ((EProductSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PRODUCT_SEND";
    protected final String _tableDispName = "E_PRODUCT_SEND";
    protected final String _tablePropertyName = "EProductSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PRODUCT_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductSendId = cci("PRODUCT_SEND_ID", "PRODUCT_SEND_ID", null, null, Long.class, "productSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessedFlg = cci("PROCESSED_FLG", "PROCESSED_FLG", null, null, String.class, "processedFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceBuy = cci("PRICE_BUY", "PRICE_BUY", null, null, Long.class, "priceBuy", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, java.math.BigDecimal.class, "unit2", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxPerNumber = cci("BX_PER_NUMBER", "BX_PER_NUMBER", null, null, java.math.BigDecimal.class, "bxPerNumber", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPBxCount = cci("P_BX_COUNT", "P_BX_COUNT", null, null, java.math.BigDecimal.class, "PBxCount", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser1 = cci("F_USER1", "F_USER1", null, null, String.class, "FUser1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength1 = cci("LENGTH1", "LENGTH1", null, null, Long.class, "length1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth1 = cci("WIDTH1", "WIDTH1", null, null, Long.class, "width1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight1 = cci("HEIGHT1", "HEIGHT1", null, null, Long.class, "height1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPOdd = cci("P_ODD", "P_ODD", null, null, java.math.BigDecimal.class, "POdd", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpOperator1 = cci("SP_OPERATOR1", "SP_OPERATOR1", null, null, String.class, "spOperator1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManuitemcd = cci("MANUITEMCD", "MANUITEMCD", null, null, String.class, "manuitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse3 = cci("USERUSE3", "USERUSE3", null, null, String.class, "useruse3", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductSendId() { return _columnProductSendId; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessedFlg() { return _columnProcessedFlg; }
    /**
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * PRICE_BUY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceBuy() { return _columnPriceBuy; }
    /**
     * UNIT2: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxPerNumber() { return _columnBxPerNumber; }
    /**
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPBxCount() { return _columnPBxCount; }
    /**
     * F_USER1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser1() { return _columnFUser1; }
    /**
     * LENGTH1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength1() { return _columnLength1; }
    /**
     * WIDTH1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth1() { return _columnWidth1; }
    /**
     * HEIGHT1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight1() { return _columnHeight1; }
    /**
     * P_ODD: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPOdd() { return _columnPOdd; }
    /**
     * SP_OPERATOR1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpOperator1() { return _columnSpOperator1; }
    /**
     * MANUITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManuitemcd() { return _columnManuitemcd; }
    /**
     * USERUSE3: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse3() { return _columnUseruse3; }
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
        ls.add(columnProductSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnProcessedFlg());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnPriceBuy());
        ls.add(columnUnit2());
        ls.add(columnBxPerNumber());
        ls.add(columnPBxCount());
        ls.add(columnFUser1());
        ls.add(columnLength1());
        ls.add(columnWidth1());
        ls.add(columnHeight1());
        ls.add(columnPOdd());
        ls.add(columnSpOperator1());
        ls.add(columnManuitemcd());
        ls.add(columnUseruse3());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EProductSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EProductSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EProductSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EProductSend> getEntityType() { return EProductSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EProductSend newEntity() { return new EProductSend(); }
    public EProductSend newMyEntity() { return new EProductSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EProductSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EProductSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
