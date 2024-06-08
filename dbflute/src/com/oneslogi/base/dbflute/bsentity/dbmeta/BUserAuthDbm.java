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
 * The DB meta of B_USER_AUTH. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BUserAuthDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BUserAuthDbm _instance = new BUserAuthDbm();
    private BUserAuthDbm() {}
    public static BUserAuthDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BUserAuth)et).getUserId(), (et, vl) -> ((BUserAuth)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getPassword(), (et, vl) -> ((BUserAuth)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getSalt(), (et, vl) -> ((BUserAuth)et).setSalt((String)vl), "salt");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getPasswordReset(), (et, vl) -> ((BUserAuth)et).setPasswordReset((String)vl), "passwordReset");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getPasswordModifiedDate(), (et, vl) -> ((BUserAuth)et).setPasswordModifiedDate(cttp(vl)), "passwordModifiedDate");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getLastLoginDate(), (et, vl) -> ((BUserAuth)et).setLastLoginDate(cttp(vl)), "lastLoginDate");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getLastFailedLoginDate(), (et, vl) -> ((BUserAuth)et).setLastFailedLoginDate(cttp(vl)), "lastFailedLoginDate");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getFailedLoginAttempts(), (et, vl) -> ((BUserAuth)et).setFailedLoginAttempts(ctl(vl)), "failedLoginAttempts");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getLockout(), (et, vl) -> ((BUserAuth)et).setLockout((String)vl), "lockout");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getLockoutDate(), (et, vl) -> ((BUserAuth)et).setLockoutDate(cttp(vl)), "lockoutDate");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getAvailableStartDate(), (et, vl) -> ((BUserAuth)et).setAvailableStartDate(cttp(vl)), "availableStartDate");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getAvailableEndDate(), (et, vl) -> ((BUserAuth)et).setAvailableEndDate(cttp(vl)), "availableEndDate");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getDelFlg(), (et, vl) -> ((BUserAuth)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getVersionNo(), (et, vl) -> ((BUserAuth)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getControlNo(), (et, vl) -> ((BUserAuth)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getAddDt(), (et, vl) -> ((BUserAuth)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getAddUser(), (et, vl) -> ((BUserAuth)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getAddProcess(), (et, vl) -> ((BUserAuth)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getUpdDt(), (et, vl) -> ((BUserAuth)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getUpdUser(), (et, vl) -> ((BUserAuth)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BUserAuth)et).getUpdProcess(), (et, vl) -> ((BUserAuth)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BUserAuth)et).getBUser(), (et, vl) -> ((BUserAuth)et).setBUser((BUser)vl), "BUser");
        setupEfpg(_efpgMap, et -> ((BUserAuth)et).getBClassDtlByPasswordReset(), (et, vl) -> ((BUserAuth)et).setBClassDtlByPasswordReset((BClassDtl)vl), "BClassDtlByPasswordReset");
        setupEfpg(_efpgMap, et -> ((BUserAuth)et).getBClassDtlByLockout(), (et, vl) -> ((BUserAuth)et).setBClassDtlByLockout((BClassDtl)vl), "BClassDtlByLockout");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_USER_AUTH";
    protected final String _tableDispName = "B_USER_AUTH";
    protected final String _tablePropertyName = "BUserAuth";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_USER_AUTH", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, true, false, true, "bigint", 19, 0, null, null, false, null, null, "BUser", null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalt = cci("SALT", "SALT", null, null, String.class, "salt", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPasswordReset = cci("PASSWORD_RESET", "PASSWORD_RESET", null, null, String.class, "passwordReset", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByPasswordReset", null, CDef.DefMeta.PasswordReset, false);
    protected final ColumnInfo _columnPasswordModifiedDate = cci("PASSWORD_MODIFIED_DATE", "PASSWORD_MODIFIED_DATE", null, null, java.sql.Timestamp.class, "passwordModifiedDate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastLoginDate = cci("LAST_LOGIN_DATE", "LAST_LOGIN_DATE", null, null, java.sql.Timestamp.class, "lastLoginDate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastFailedLoginDate = cci("LAST_FAILED_LOGIN_DATE", "LAST_FAILED_LOGIN_DATE", null, null, java.sql.Timestamp.class, "lastFailedLoginDate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFailedLoginAttempts = cci("FAILED_LOGIN_ATTEMPTS", "FAILED_LOGIN_ATTEMPTS", null, null, Long.class, "failedLoginAttempts", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLockout = cci("LOCKOUT", "LOCKOUT", null, null, String.class, "lockout", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByLockout", null, CDef.DefMeta.Lockout, false);
    protected final ColumnInfo _columnLockoutDate = cci("LOCKOUT_DATE", "LOCKOUT_DATE", null, null, java.sql.Timestamp.class, "lockoutDate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAvailableStartDate = cci("AVAILABLE_START_DATE", "AVAILABLE_START_DATE", null, null, java.sql.Timestamp.class, "availableStartDate", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAvailableEndDate = cci("AVAILABLE_END_DATE", "AVAILABLE_END_DATE", null, null, java.sql.Timestamp.class, "availableEndDate", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * USER_ID: {PK, NotNull, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * PASSWORD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * SALT: {UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalt() { return _columnSalt; }
    /**
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPasswordReset() { return _columnPasswordReset; }
    /**
     * PASSWORD_MODIFIED_DATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPasswordModifiedDate() { return _columnPasswordModifiedDate; }
    /**
     * LAST_LOGIN_DATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastLoginDate() { return _columnLastLoginDate; }
    /**
     * LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastFailedLoginDate() { return _columnLastFailedLoginDate; }
    /**
     * FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFailedLoginAttempts() { return _columnFailedLoginAttempts; }
    /**
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLockout() { return _columnLockout; }
    /**
     * LOCKOUT_DATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLockoutDate() { return _columnLockoutDate; }
    /**
     * AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAvailableStartDate() { return _columnAvailableStartDate; }
    /**
     * AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAvailableEndDate() { return _columnAvailableEndDate; }
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
        ls.add(columnUserId());
        ls.add(columnPassword());
        ls.add(columnSalt());
        ls.add(columnPasswordReset());
        ls.add(columnPasswordModifiedDate());
        ls.add(columnLastLoginDate());
        ls.add(columnLastFailedLoginDate());
        ls.add(columnFailedLoginAttempts());
        ls.add(columnLockout());
        ls.add(columnLockoutDate());
        ls.add(columnAvailableStartDate());
        ls.add(columnAvailableEndDate());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnSalt()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * B_USER by my USER_ID, named 'BUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("B_USER_AUTH_FK1", "BUser", this, BUserDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "BUserAuthAsOne", false);
    }
    /**
     * B_CLASS_DTL by my PASSWORD_RESET, named 'BClassDtlByPasswordReset'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPasswordReset() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPasswordReset(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_USER_AUTH_PASSWORD_RESET", "BClassDtlByPasswordReset", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PASSWORD_RESET'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LOCKOUT, named 'BClassDtlByLockout'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLockout() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLockout(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_USER_AUTH_LOCKOUT", "BClassDtlByLockout", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOCKOUT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BUserAuth"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BUserAuthCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BUserAuthBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BUserAuth> getEntityType() { return BUserAuth.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BUserAuth newEntity() { return new BUserAuth(); }
    public BUserAuth newMyEntity() { return new BUserAuth(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BUserAuth)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BUserAuth)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
