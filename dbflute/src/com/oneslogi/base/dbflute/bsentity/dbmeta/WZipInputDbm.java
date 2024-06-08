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
 * The DB meta of W_ZIP_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WZipInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WZipInputDbm _instance = new WZipInputDbm();
    private WZipInputDbm() {}
    public static WZipInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WZipInput)et).getZipInputId(), (et, vl) -> ((WZipInput)et).setZipInputId(ctl(vl)), "zipInputId");
        setupEpg(_epgMap, et -> ((WZipInput)et).getPublicCd(), (et, vl) -> ((WZipInput)et).setPublicCd((String)vl), "publicCd");
        setupEpg(_epgMap, et -> ((WZipInput)et).getZipCd5(), (et, vl) -> ((WZipInput)et).setZipCd5((String)vl), "zipCd5");
        setupEpg(_epgMap, et -> ((WZipInput)et).getZipCd(), (et, vl) -> ((WZipInput)et).setZipCd((String)vl), "zipCd");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddressKn1(), (et, vl) -> ((WZipInput)et).setAddressKn1((String)vl), "addressKn1");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddressKn2(), (et, vl) -> ((WZipInput)et).setAddressKn2((String)vl), "addressKn2");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddressKn3(), (et, vl) -> ((WZipInput)et).setAddressKn3((String)vl), "addressKn3");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddress1(), (et, vl) -> ((WZipInput)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddress2(), (et, vl) -> ((WZipInput)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddress3(), (et, vl) -> ((WZipInput)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((WZipInput)et).getFlg1(), (et, vl) -> ((WZipInput)et).setFlg1((String)vl), "flg1");
        setupEpg(_epgMap, et -> ((WZipInput)et).getFlg2(), (et, vl) -> ((WZipInput)et).setFlg2((String)vl), "flg2");
        setupEpg(_epgMap, et -> ((WZipInput)et).getFlg3(), (et, vl) -> ((WZipInput)et).setFlg3((String)vl), "flg3");
        setupEpg(_epgMap, et -> ((WZipInput)et).getFlg4(), (et, vl) -> ((WZipInput)et).setFlg4((String)vl), "flg4");
        setupEpg(_epgMap, et -> ((WZipInput)et).getUpdType(), (et, vl) -> ((WZipInput)et).setUpdType((String)vl), "updType");
        setupEpg(_epgMap, et -> ((WZipInput)et).getReasonType(), (et, vl) -> ((WZipInput)et).setReasonType((String)vl), "reasonType");
        setupEpg(_epgMap, et -> ((WZipInput)et).getLineNo(), (et, vl) -> ((WZipInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WZipInput)et).getWorkFlg(), (et, vl) -> ((WZipInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WZipInput)et).getErrorFlg(), (et, vl) -> ((WZipInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WZipInput)et).getErrorMsg(), (et, vl) -> ((WZipInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WZipInput)et).getDelFlg(), (et, vl) -> ((WZipInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WZipInput)et).getVersionNo(), (et, vl) -> ((WZipInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WZipInput)et).getControlNo(), (et, vl) -> ((WZipInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddDt(), (et, vl) -> ((WZipInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddUser(), (et, vl) -> ((WZipInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WZipInput)et).getAddProcess(), (et, vl) -> ((WZipInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WZipInput)et).getUpdDt(), (et, vl) -> ((WZipInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WZipInput)et).getUpdUser(), (et, vl) -> ((WZipInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WZipInput)et).getUpdProcess(), (et, vl) -> ((WZipInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_ZIP_INPUT";
    protected final String _tableDispName = "W_ZIP_INPUT";
    protected final String _tablePropertyName = "WZipInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_ZIP_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnZipInputId = cci("ZIP_INPUT_ID", "ZIP_INPUT_ID", null, null, Long.class, "zipInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublicCd = cci("PUBLIC_CD", "PUBLIC_CD", null, null, String.class, "publicCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd5 = cci("ZIP_CD_5", "ZIP_CD_5", null, null, String.class, "zipCd5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZipCd = cci("ZIP_CD", "ZIP_CD", null, null, String.class, "zipCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn1 = cci("ADDRESS_KN1", "ADDRESS_KN1", null, null, String.class, "addressKn1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn2 = cci("ADDRESS_KN2", "ADDRESS_KN2", null, null, String.class, "addressKn2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddressKn3 = cci("ADDRESS_KN3", "ADDRESS_KN3", null, null, String.class, "addressKn3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("ADDRESS1", "ADDRESS1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("ADDRESS3", "ADDRESS3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg1 = cci("FLG1", "FLG1", null, null, String.class, "flg1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg2 = cci("FLG2", "FLG2", null, null, String.class, "flg2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg3 = cci("FLG3", "FLG3", null, null, String.class, "flg3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlg4 = cci("FLG4", "FLG4", null, null, String.class, "flg4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdType = cci("UPD_TYPE", "UPD_TYPE", null, null, String.class, "updType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReasonType = cci("REASON_TYPE", "REASON_TYPE", null, null, String.class, "reasonType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipInputId() { return _columnZipInputId; }
    /**
     * PUBLIC_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicCd() { return _columnPublicCd; }
    /**
     * ZIP_CD_5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd5() { return _columnZipCd5; }
    /**
     * ZIP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipCd() { return _columnZipCd; }
    /**
     * ADDRESS_KN1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddressKn1() { return _columnAddressKn1; }
    /**
     * ADDRESS_KN2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddressKn2() { return _columnAddressKn2; }
    /**
     * ADDRESS_KN3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddressKn3() { return _columnAddressKn3; }
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
     * FLG1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg1() { return _columnFlg1; }
    /**
     * FLG2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg2() { return _columnFlg2; }
    /**
     * FLG3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg3() { return _columnFlg3; }
    /**
     * FLG4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlg4() { return _columnFlg4; }
    /**
     * UPD_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdType() { return _columnUpdType; }
    /**
     * REASON_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReasonType() { return _columnReasonType; }
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
        ls.add(columnZipInputId());
        ls.add(columnPublicCd());
        ls.add(columnZipCd5());
        ls.add(columnZipCd());
        ls.add(columnAddressKn1());
        ls.add(columnAddressKn2());
        ls.add(columnAddressKn3());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnFlg1());
        ls.add(columnFlg2());
        ls.add(columnFlg3());
        ls.add(columnFlg4());
        ls.add(columnUpdType());
        ls.add(columnReasonType());
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
    protected UniqueInfo cpui() { return hpcpui(columnZipInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WZipInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WZipInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WZipInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WZipInput> getEntityType() { return WZipInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WZipInput newEntity() { return new WZipInput(); }
    public WZipInput newMyEntity() { return new WZipInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WZipInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WZipInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
