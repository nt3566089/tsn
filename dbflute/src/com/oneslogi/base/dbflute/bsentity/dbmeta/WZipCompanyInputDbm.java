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
 * The DB meta of W_ZIP_COMPANY_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WZipCompanyInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WZipCompanyInputDbm _instance = new WZipCompanyInputDbm();
    private WZipCompanyInputDbm() {}
    public static WZipCompanyInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getZipCompanyInputId(), (et, vl) -> ((WZipCompanyInput)et).setZipCompanyInputId(ctl(vl)), "zipCompanyInputId");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getPublicCd(), (et, vl) -> ((WZipCompanyInput)et).setPublicCd((String)vl), "publicCd");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getCompanyKn(), (et, vl) -> ((WZipCompanyInput)et).setCompanyKn((String)vl), "companyKn");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getCompanyNm(), (et, vl) -> ((WZipCompanyInput)et).setCompanyNm((String)vl), "companyNm");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddress1(), (et, vl) -> ((WZipCompanyInput)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddress2(), (et, vl) -> ((WZipCompanyInput)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddress3(), (et, vl) -> ((WZipCompanyInput)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddress4(), (et, vl) -> ((WZipCompanyInput)et).setAddress4((String)vl), "address4");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getZipCd(), (et, vl) -> ((WZipCompanyInput)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getZipCd5(), (et, vl) -> ((WZipCompanyInput)et).setZipCd5((String)vl), "zipCd5");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getHandlingAddress(), (et, vl) -> ((WZipCompanyInput)et).setHandlingAddress((String)vl), "handlingAddress");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getFlg5(), (et, vl) -> ((WZipCompanyInput)et).setFlg5((String)vl), "flg5");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getFlg6(), (et, vl) -> ((WZipCompanyInput)et).setFlg6((String)vl), "flg6");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getUpdCd(), (et, vl) -> ((WZipCompanyInput)et).setUpdCd((String)vl), "updCd");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getCompanyFlg(), (et, vl) -> ((WZipCompanyInput)et).setCompanyFlg((String)vl), "companyFlg");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getLineNo(), (et, vl) -> ((WZipCompanyInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getWorkFlg(), (et, vl) -> ((WZipCompanyInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getErrorFlg(), (et, vl) -> ((WZipCompanyInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getErrorMsg(), (et, vl) -> ((WZipCompanyInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getDelFlg(), (et, vl) -> ((WZipCompanyInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getVersionNo(), (et, vl) -> ((WZipCompanyInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getControlNo(), (et, vl) -> ((WZipCompanyInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddDt(), (et, vl) -> ((WZipCompanyInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddUser(), (et, vl) -> ((WZipCompanyInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getAddProcess(), (et, vl) -> ((WZipCompanyInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getUpdDt(), (et, vl) -> ((WZipCompanyInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getUpdUser(), (et, vl) -> ((WZipCompanyInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WZipCompanyInput)et).getUpdProcess(), (et, vl) -> ((WZipCompanyInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_ZIP_COMPANY_INPUT";
    protected final String _tableDispName = "W_ZIP_COMPANY_INPUT";
    protected final String _tablePropertyName = "WZipCompanyInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_ZIP_COMPANY_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnZipCompanyInputId = cci("ZIP_COMPANY_INPUT_ID", "ZIP_COMPANY_INPUT_ID", null, null, Long.class, "zipCompanyInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublicCd = cci("PUBLIC_CD", "PUBLIC_CD", null, null, String.class, "publicCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyKn = cci("COMPANY_KN", "COMPANY_KN", null, null, String.class, "companyKn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyNm = cci("COMPANY_NM", "COMPANY_NM", null, null, String.class, "companyNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress4 = cci("ADDRESS4", "ADDRESS4", null, null, String.class, "address4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd5 = cci("ZIP_CD_5", "ZIP_CD_5", null, null, String.class, "zipCd5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHandlingAddress = cci("HANDLING_ADDRESS", "HANDLING_ADDRESS", null, null, String.class, "handlingAddress", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg5 = cci("FLG5", "FLG5", null, null, String.class, "flg5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg6 = cci("FLG6", "FLG6", null, null, String.class, "flg6", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdCd = cci("UPD_CD", "UPD_CD", null, null, String.class, "updCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyFlg = cci("COMPANY_FLG", "COMPANY_FLG", null, null, String.class, "companyFlg", null, false, false, false, "varchar", 255, 0, null, "1", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * ZIP_COMPANY_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCompanyInputId() { return _columnZipCompanyInputId; }
    /**
     * PUBLIC_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicCd() { return _columnPublicCd; }
    /**
     * COMPANY_KN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyKn() { return _columnCompanyKn; }
    /**
     * COMPANY_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyNm() { return _columnCompanyNm; }
    /**
     * ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * ADDRESS4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress4() { return _columnAddress4; }
    /**
     * ZIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * ZIP_CD_5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd5() { return _columnZipCd5; }
    /**
     * HANDLING_ADDRESS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandlingAddress() { return _columnHandlingAddress; }
    /**
     * FLG5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg5() { return _columnFlg5; }
    /**
     * FLG6: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg6() { return _columnFlg6; }
    /**
     * UPD_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdCd() { return _columnUpdCd; }
    /**
     * COMPANY_FLG: {varchar(255), default=[1]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyFlg() { return _columnCompanyFlg; }
    /**
     * LINE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnZipCompanyInputId());
        ls.add(columnPublicCd());
        ls.add(columnCompanyKn());
        ls.add(columnCompanyNm());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnAddress4());
        ls.add(columnZipCd());
        ls.add(columnZipCd5());
        ls.add(columnHandlingAddress());
        ls.add(columnFlg5());
        ls.add(columnFlg6());
        ls.add(columnUpdCd());
        ls.add(columnCompanyFlg());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnZipCompanyInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WZipCompanyInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WZipCompanyInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WZipCompanyInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WZipCompanyInput> getEntityType() { return WZipCompanyInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WZipCompanyInput newEntity() { return new WZipCompanyInput(); }
    public WZipCompanyInput newMyEntity() { return new WZipCompanyInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WZipCompanyInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WZipCompanyInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
