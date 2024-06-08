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
 * The DB meta of M_USER_TERM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MUserTermDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MUserTermDbm _instance = new MUserTermDbm();
    private MUserTermDbm() {}
    public static MUserTermDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MUserTerm)et).getCommonAuthId(), (et, vl) -> ((MUserTerm)et).setCommonAuthId(ctl(vl)), "commonAuthId");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getEmployeeNo(), (et, vl) -> ((MUserTerm)et).setEmployeeNo(ctl(vl)), "employeeNo");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getIdType(), (et, vl) -> ((MUserTerm)et).setIdType((String)vl), "idType");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getEnrollmentStatus(), (et, vl) -> ((MUserTerm)et).setEnrollmentStatus((String)vl), "enrollmentStatus");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getLastName(), (et, vl) -> ((MUserTerm)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getFirstName(), (et, vl) -> ((MUserTerm)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getLastNameKana(), (et, vl) -> ((MUserTerm)et).setLastNameKana((String)vl), "lastNameKana");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getFirstNameKana(), (et, vl) -> ((MUserTerm)et).setFirstNameKana((String)vl), "firstNameKana");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getMailAddress(), (et, vl) -> ((MUserTerm)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getAdminFlg(), (et, vl) -> ((MUserTerm)et).setAdminFlg((String)vl), "adminFlg");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getCompanyUnitCd(), (et, vl) -> ((MUserTerm)et).setCompanyUnitCd((String)vl), "companyUnitCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getBizSystemCd(), (et, vl) -> ((MUserTerm)et).setBizSystemCd((String)vl), "bizSystemCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getBizSystemNm(), (et, vl) -> ((MUserTerm)et).setBizSystemNm((String)vl), "bizSystemNm");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getUserRoleCd(), (et, vl) -> ((MUserTerm)et).setUserRoleCd((String)vl), "userRoleCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getUserRoleNm(), (et, vl) -> ((MUserTerm)et).setUserRoleNm((String)vl), "userRoleNm");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getPlanCompanyCd(), (et, vl) -> ((MUserTerm)et).setPlanCompanyCd((String)vl), "planCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getWmsCompanyCd(), (et, vl) -> ((MUserTerm)et).setWmsCompanyCd((String)vl), "wmsCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getDlvRootCompanyCd(), (et, vl) -> ((MUserTerm)et).setDlvRootCompanyCd((String)vl), "dlvRootCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getSvfCompanyCd(), (et, vl) -> ((MUserTerm)et).setSvfCompanyCd((String)vl), "svfCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getKbCompanyCd(), (et, vl) -> ((MUserTerm)et).setKbCompanyCd((String)vl), "kbCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getOrderLoginCompanyCd(), (et, vl) -> ((MUserTerm)et).setOrderLoginCompanyCd((String)vl), "orderLoginCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getOrderOfficeCompanyCd(), (et, vl) -> ((MUserTerm)et).setOrderOfficeCompanyCd((String)vl), "orderOfficeCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getOrderSmarteditCompanyCd(), (et, vl) -> ((MUserTerm)et).setOrderSmarteditCompanyCd((String)vl), "orderSmarteditCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getSupanddemTaxCompanyCd(), (et, vl) -> ((MUserTerm)et).setSupanddemTaxCompanyCd((String)vl), "supanddemTaxCompanyCd");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getValidFrdateh(), (et, vl) -> ((MUserTerm)et).setValidFrdateh((String)vl), "validFrdateh");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getValidTodateh(), (et, vl) -> ((MUserTerm)et).setValidTodateh((String)vl), "validTodateh");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getDelFlg(), (et, vl) -> ((MUserTerm)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getVersionNo(), (et, vl) -> ((MUserTerm)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getControlNo(), (et, vl) -> ((MUserTerm)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getAddDt(), (et, vl) -> ((MUserTerm)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getAddUser(), (et, vl) -> ((MUserTerm)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getAddProcess(), (et, vl) -> ((MUserTerm)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getUpdDt(), (et, vl) -> ((MUserTerm)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getUpdUser(), (et, vl) -> ((MUserTerm)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MUserTerm)et).getUpdProcess(), (et, vl) -> ((MUserTerm)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_USER_TERM";
    protected final String _tableDispName = "M_USER_TERM";
    protected final String _tablePropertyName = "MUserTerm";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_USER_TERM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCommonAuthId = cci("COMMON_AUTH_ID", "COMMON_AUTH_ID", null, null, Long.class, "commonAuthId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmployeeNo = cci("EMPLOYEE_NO", "EMPLOYEE_NO", null, null, Long.class, "employeeNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdType = cci("ID_TYPE", "ID_TYPE", null, null, String.class, "idType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEnrollmentStatus = cci("ENROLLMENT_STATUS", "ENROLLMENT_STATUS", null, null, String.class, "enrollmentStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("LAST_NAME", "LAST_NAME", null, null, String.class, "lastName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("FIRST_NAME", "FIRST_NAME", null, null, String.class, "firstName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastNameKana = cci("LAST_NAME_KANA", "LAST_NAME_KANA", null, null, String.class, "lastNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstNameKana = cci("FIRST_NAME_KANA", "FIRST_NAME_KANA", null, null, String.class, "firstNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, null, String.class, "mailAddress", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdminFlg = cci("ADMIN_FLG", "ADMIN_FLG", null, null, String.class, "adminFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyUnitCd = cci("COMPANY_UNIT_CD", "COMPANY_UNIT_CD", null, null, String.class, "companyUnitCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizSystemCd = cci("BIZ_SYSTEM_CD", "BIZ_SYSTEM_CD", null, null, String.class, "bizSystemCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizSystemNm = cci("BIZ_SYSTEM_NM", "BIZ_SYSTEM_NM", null, null, String.class, "bizSystemNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserRoleCd = cci("USER_ROLE_CD", "USER_ROLE_CD", null, null, String.class, "userRoleCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserRoleNm = cci("USER_ROLE_NM", "USER_ROLE_NM", null, null, String.class, "userRoleNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanCompanyCd = cci("PLAN_COMPANY_CD", "PLAN_COMPANY_CD", null, null, String.class, "planCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsCompanyCd = cci("WMS_COMPANY_CD", "WMS_COMPANY_CD", null, null, String.class, "wmsCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvRootCompanyCd = cci("DLV_ROOT_COMPANY_CD", "DLV_ROOT_COMPANY_CD", null, null, String.class, "dlvRootCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSvfCompanyCd = cci("SVF_COMPANY_CD", "SVF_COMPANY_CD", null, null, String.class, "svfCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKbCompanyCd = cci("KB_COMPANY_CD", "KB_COMPANY_CD", null, null, String.class, "kbCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderLoginCompanyCd = cci("ORDER_LOGIN_COMPANY_CD", "ORDER_LOGIN_COMPANY_CD", null, null, String.class, "orderLoginCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderOfficeCompanyCd = cci("ORDER_OFFICE_COMPANY_CD", "ORDER_OFFICE_COMPANY_CD", null, null, String.class, "orderOfficeCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderSmarteditCompanyCd = cci("ORDER_SMARTEDIT_COMPANY_CD", "ORDER_SMARTEDIT_COMPANY_CD", null, null, String.class, "orderSmarteditCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupanddemTaxCompanyCd = cci("SUPANDDEM_TAX_COMPANY_CD", "SUPANDDEM_TAX_COMPANY_CD", null, null, String.class, "supanddemTaxCompanyCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidFrdateh = cci("VALID_FRDATEH", "VALID_FRDATEH", null, null, String.class, "validFrdateh", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidTodateh = cci("VALID_TODATEH", "VALID_TODATEH", null, null, String.class, "validTodateh", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * COMMON_AUTH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommonAuthId() { return _columnCommonAuthId; }
    /**
     * EMPLOYEE_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmployeeNo() { return _columnEmployeeNo; }
    /**
     * ID_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdType() { return _columnIdType; }
    /**
     * ENROLLMENT_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEnrollmentStatus() { return _columnEnrollmentStatus; }
    /**
     * LAST_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastName() { return _columnLastName; }
    /**
     * FIRST_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstName() { return _columnFirstName; }
    /**
     * LAST_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastNameKana() { return _columnLastNameKana; }
    /**
     * FIRST_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstNameKana() { return _columnFirstNameKana; }
    /**
     * MAIL_ADDRESS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    /**
     * ADMIN_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdminFlg() { return _columnAdminFlg; }
    /**
     * COMPANY_UNIT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyUnitCd() { return _columnCompanyUnitCd; }
    /**
     * BIZ_SYSTEM_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizSystemCd() { return _columnBizSystemCd; }
    /**
     * BIZ_SYSTEM_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizSystemNm() { return _columnBizSystemNm; }
    /**
     * USER_ROLE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserRoleCd() { return _columnUserRoleCd; }
    /**
     * USER_ROLE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserRoleNm() { return _columnUserRoleNm; }
    /**
     * PLAN_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanCompanyCd() { return _columnPlanCompanyCd; }
    /**
     * WMS_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsCompanyCd() { return _columnWmsCompanyCd; }
    /**
     * DLV_ROOT_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvRootCompanyCd() { return _columnDlvRootCompanyCd; }
    /**
     * SVF_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSvfCompanyCd() { return _columnSvfCompanyCd; }
    /**
     * KB_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKbCompanyCd() { return _columnKbCompanyCd; }
    /**
     * ORDER_LOGIN_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderLoginCompanyCd() { return _columnOrderLoginCompanyCd; }
    /**
     * ORDER_OFFICE_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderOfficeCompanyCd() { return _columnOrderOfficeCompanyCd; }
    /**
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderSmarteditCompanyCd() { return _columnOrderSmarteditCompanyCd; }
    /**
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupanddemTaxCompanyCd() { return _columnSupanddemTaxCompanyCd; }
    /**
     * VALID_FRDATEH: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidFrdateh() { return _columnValidFrdateh; }
    /**
     * VALID_TODATEH: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidTodateh() { return _columnValidTodateh; }
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
        ls.add(columnCommonAuthId());
        ls.add(columnEmployeeNo());
        ls.add(columnIdType());
        ls.add(columnEnrollmentStatus());
        ls.add(columnLastName());
        ls.add(columnFirstName());
        ls.add(columnLastNameKana());
        ls.add(columnFirstNameKana());
        ls.add(columnMailAddress());
        ls.add(columnAdminFlg());
        ls.add(columnCompanyUnitCd());
        ls.add(columnBizSystemCd());
        ls.add(columnBizSystemNm());
        ls.add(columnUserRoleCd());
        ls.add(columnUserRoleNm());
        ls.add(columnPlanCompanyCd());
        ls.add(columnWmsCompanyCd());
        ls.add(columnDlvRootCompanyCd());
        ls.add(columnSvfCompanyCd());
        ls.add(columnKbCompanyCd());
        ls.add(columnOrderLoginCompanyCd());
        ls.add(columnOrderOfficeCompanyCd());
        ls.add(columnOrderSmarteditCompanyCd());
        ls.add(columnSupanddemTaxCompanyCd());
        ls.add(columnValidFrdateh());
        ls.add(columnValidTodateh());
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
    protected UniqueInfo cpui() { return hpcpui(columnCommonAuthId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MUserTerm"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MUserTermCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MUserTermBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MUserTerm> getEntityType() { return MUserTerm.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MUserTerm newEntity() { return new MUserTerm(); }
    public MUserTerm newMyEntity() { return new MUserTerm(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MUserTerm)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MUserTerm)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
