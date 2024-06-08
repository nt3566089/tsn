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
 * The DB meta of E_PRODUCT_CODE_CONVERSION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EProductCodeConversionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EProductCodeConversionDbm _instance = new EProductCodeConversionDbm();
    private EProductCodeConversionDbm() {}
    public static EProductCodeConversionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getProductCodeConversionId(), (et, vl) -> ((EProductCodeConversion)et).setProductCodeConversionId(ctl(vl)), "productCodeConversionId");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getJttsflg(), (et, vl) -> ((EProductCodeConversion)et).setJttsflg((String)vl), "jttsflg");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getCompanycd(), (et, vl) -> ((EProductCodeConversion)et).setCompanycd((String)vl), "companycd");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getItemcdFrom(), (et, vl) -> ((EProductCodeConversion)et).setItemcdFrom((String)vl), "itemcdFrom");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getItemcdTo(), (et, vl) -> ((EProductCodeConversion)et).setItemcdTo((String)vl), "itemcdTo");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getQty(), (et, vl) -> ((EProductCodeConversion)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getSendCd(), (et, vl) -> ((EProductCodeConversion)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getWorkFlg(), (et, vl) -> ((EProductCodeConversion)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getCenterCd(), (et, vl) -> ((EProductCodeConversion)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getSendRowId(), (et, vl) -> ((EProductCodeConversion)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getDelFlg(), (et, vl) -> ((EProductCodeConversion)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getVersionNo(), (et, vl) -> ((EProductCodeConversion)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getControlNo(), (et, vl) -> ((EProductCodeConversion)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getAddDt(), (et, vl) -> ((EProductCodeConversion)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getAddUser(), (et, vl) -> ((EProductCodeConversion)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getAddProcess(), (et, vl) -> ((EProductCodeConversion)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getUpdDt(), (et, vl) -> ((EProductCodeConversion)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getUpdUser(), (et, vl) -> ((EProductCodeConversion)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EProductCodeConversion)et).getUpdProcess(), (et, vl) -> ((EProductCodeConversion)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PRODUCT_CODE_CONVERSION";
    protected final String _tableDispName = "E_PRODUCT_CODE_CONVERSION";
    protected final String _tablePropertyName = "EProductCodeConversion";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PRODUCT_CODE_CONVERSION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCodeConversionId = cci("PRODUCT_CODE_CONVERSION_ID", "PRODUCT_CODE_CONVERSION_ID", null, null, Long.class, "productCodeConversionId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJttsflg = cci("JTTSFLG", "JTTSFLG", null, null, String.class, "jttsflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanycd = cci("COMPANYCD", "COMPANYCD", null, null, String.class, "companycd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdFrom = cci("ITEMCD_FROM", "ITEMCD_FROM", null, null, String.class, "itemcdFrom", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcdTo = cci("ITEMCD_TO", "ITEMCD_TO", null, null, String.class, "itemcdTo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCodeConversionId() { return _columnProductCodeConversionId; }
    /**
     * JTTSFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJttsflg() { return _columnJttsflg; }
    /**
     * COMPANYCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanycd() { return _columnCompanycd; }
    /**
     * ITEMCD_FROM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdFrom() { return _columnItemcdFrom; }
    /**
     * ITEMCD_TO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcdTo() { return _columnItemcdTo; }
    /**
     * QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
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
        ls.add(columnProductCodeConversionId());
        ls.add(columnJttsflg());
        ls.add(columnCompanycd());
        ls.add(columnItemcdFrom());
        ls.add(columnItemcdTo());
        ls.add(columnQty());
        ls.add(columnSendCd());
        ls.add(columnWorkFlg());
        ls.add(columnCenterCd());
        ls.add(columnSendRowId());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductCodeConversionId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EProductCodeConversion"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EProductCodeConversionCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EProductCodeConversionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EProductCodeConversion> getEntityType() { return EProductCodeConversion.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EProductCodeConversion newEntity() { return new EProductCodeConversion(); }
    public EProductCodeConversion newMyEntity() { return new EProductCodeConversion(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EProductCodeConversion)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EProductCodeConversion)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
