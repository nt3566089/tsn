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
 * The DB meta of E_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EUserDbm _instance = new EUserDbm();
    private EUserDbm() {}
    public static EUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EUser)et).getReceiveLoginInfoId(), (et, vl) -> ((EUser)et).setReceiveLoginInfoId(ctl(vl)), "receiveLoginInfoId");
        setupEpg(_epgMap, et -> ((EUser)et).getReceiveCd(), (et, vl) -> ((EUser)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EUser)et).getReceiveRowId(), (et, vl) -> ((EUser)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EUser)et).getImportFlg(), (et, vl) -> ((EUser)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EUser)et).getErrorFlg(), (et, vl) -> ((EUser)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EUser)et).getErrorMessageCd(), (et, vl) -> ((EUser)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EUser)et).getCommonAuthId(), (et, vl) -> ((EUser)et).setCommonAuthId((String)vl), "commonAuthId");
        setupEpg(_epgMap, et -> ((EUser)et).getEmployeeNo(), (et, vl) -> ((EUser)et).setEmployeeNo((String)vl), "employeeNo");
        setupEpg(_epgMap, et -> ((EUser)et).getIdType(), (et, vl) -> ((EUser)et).setIdType((String)vl), "idType");
        setupEpg(_epgMap, et -> ((EUser)et).getEnrollmentStatus(), (et, vl) -> ((EUser)et).setEnrollmentStatus((String)vl), "enrollmentStatus");
        setupEpg(_epgMap, et -> ((EUser)et).getLastName(), (et, vl) -> ((EUser)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((EUser)et).getFirstName(), (et, vl) -> ((EUser)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((EUser)et).getLastNameKana(), (et, vl) -> ((EUser)et).setLastNameKana((String)vl), "lastNameKana");
        setupEpg(_epgMap, et -> ((EUser)et).getFirstNameKana(), (et, vl) -> ((EUser)et).setFirstNameKana((String)vl), "firstNameKana");
        setupEpg(_epgMap, et -> ((EUser)et).getMailAddress(), (et, vl) -> ((EUser)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((EUser)et).getAdminFlg(), (et, vl) -> ((EUser)et).setAdminFlg((String)vl), "adminFlg");
        setupEpg(_epgMap, et -> ((EUser)et).getCompanyUnitCd(), (et, vl) -> ((EUser)et).setCompanyUnitCd((String)vl), "companyUnitCd");
        setupEpg(_epgMap, et -> ((EUser)et).getBizSystemCd(), (et, vl) -> ((EUser)et).setBizSystemCd((String)vl), "bizSystemCd");
        setupEpg(_epgMap, et -> ((EUser)et).getBizSystemNm(), (et, vl) -> ((EUser)et).setBizSystemNm((String)vl), "bizSystemNm");
        setupEpg(_epgMap, et -> ((EUser)et).getUserRoleCd(), (et, vl) -> ((EUser)et).setUserRoleCd((String)vl), "userRoleCd");
        setupEpg(_epgMap, et -> ((EUser)et).getUserRoleNm(), (et, vl) -> ((EUser)et).setUserRoleNm((String)vl), "userRoleNm");
        setupEpg(_epgMap, et -> ((EUser)et).getPlanCompanyCd(), (et, vl) -> ((EUser)et).setPlanCompanyCd((String)vl), "planCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getWmsCompanyCd(), (et, vl) -> ((EUser)et).setWmsCompanyCd((String)vl), "wmsCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getDlvRootCompanyCd(), (et, vl) -> ((EUser)et).setDlvRootCompanyCd((String)vl), "dlvRootCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getSvfCompanyCd(), (et, vl) -> ((EUser)et).setSvfCompanyCd((String)vl), "svfCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getKbCompanyCd(), (et, vl) -> ((EUser)et).setKbCompanyCd((String)vl), "kbCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getOrderLoginCompanyCd(), (et, vl) -> ((EUser)et).setOrderLoginCompanyCd((String)vl), "orderLoginCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getOrderOfficeCompanyCd(), (et, vl) -> ((EUser)et).setOrderOfficeCompanyCd((String)vl), "orderOfficeCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getOrderSmarteditCompanyCd(), (et, vl) -> ((EUser)et).setOrderSmarteditCompanyCd((String)vl), "orderSmarteditCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getSupanddemTaxCompanyCd(), (et, vl) -> ((EUser)et).setSupanddemTaxCompanyCd((String)vl), "supanddemTaxCompanyCd");
        setupEpg(_epgMap, et -> ((EUser)et).getValidFrdateh(), (et, vl) -> ((EUser)et).setValidFrdateh((String)vl), "validFrdateh");
        setupEpg(_epgMap, et -> ((EUser)et).getValidTodateh(), (et, vl) -> ((EUser)et).setValidTodateh((String)vl), "validTodateh");
        setupEpg(_epgMap, et -> ((EUser)et).getDelFlg(), (et, vl) -> ((EUser)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EUser)et).getVersionNo(), (et, vl) -> ((EUser)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EUser)et).getControlNo(), (et, vl) -> ((EUser)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EUser)et).getAddDt(), (et, vl) -> ((EUser)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EUser)et).getAddUser(), (et, vl) -> ((EUser)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EUser)et).getAddProcess(), (et, vl) -> ((EUser)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EUser)et).getUpdDt(), (et, vl) -> ((EUser)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EUser)et).getUpdUser(), (et, vl) -> ((EUser)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EUser)et).getUpdProcess(), (et, vl) -> ((EUser)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_USER";
    protected final String _tableDispName = "E_USER";
    protected final String _tablePropertyName = "EUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceiveLoginInfoId = cci("RECEIVE_LOGIN_INFO_ID", "RECEIVE_LOGIN_INFO_ID", null, null, Long.class, "receiveLoginInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCommonAuthId = cci("COMMON_AUTH_ID", "COMMON_AUTH_ID", null, null, String.class, "commonAuthId", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmployeeNo = cci("EMPLOYEE_NO", "EMPLOYEE_NO", null, null, String.class, "employeeNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdType = cci("ID_TYPE", "ID_TYPE", null, null, String.class, "idType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEnrollmentStatus = cci("ENROLLMENT_STATUS", "ENROLLMENT_STATUS", null, null, String.class, "enrollmentStatus", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("LAST_NAME", "LAST_NAME", null, null, String.class, "lastName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("FIRST_NAME", "FIRST_NAME", null, null, String.class, "firstName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastNameKana = cci("LAST_NAME_KANA", "LAST_NAME_KANA", null, null, String.class, "lastNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstNameKana = cci("FIRST_NAME_KANA", "FIRST_NAME_KANA", null, null, String.class, "firstNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, null, String.class, "mailAddress", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdminFlg = cci("ADMIN_FLG", "ADMIN_FLG", null, null, String.class, "adminFlg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompanyUnitCd = cci("COMPANY_UNIT_CD", "COMPANY_UNIT_CD", null, null, String.class, "companyUnitCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizSystemCd = cci("BIZ_SYSTEM_CD", "BIZ_SYSTEM_CD", null, null, String.class, "bizSystemCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizSystemNm = cci("BIZ_SYSTEM_NM", "BIZ_SYSTEM_NM", null, null, String.class, "bizSystemNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserRoleCd = cci("USER_ROLE_CD", "USER_ROLE_CD", null, null, String.class, "userRoleCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserRoleNm = cci("USER_ROLE_NM", "USER_ROLE_NM", null, null, String.class, "userRoleNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanCompanyCd = cci("PLAN_COMPANY_CD", "PLAN_COMPANY_CD", null, null, String.class, "planCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsCompanyCd = cci("WMS_COMPANY_CD", "WMS_COMPANY_CD", null, null, String.class, "wmsCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvRootCompanyCd = cci("DLV_ROOT_COMPANY_CD", "DLV_ROOT_COMPANY_CD", null, null, String.class, "dlvRootCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSvfCompanyCd = cci("SVF_COMPANY_CD", "SVF_COMPANY_CD", null, null, String.class, "svfCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKbCompanyCd = cci("KB_COMPANY_CD", "KB_COMPANY_CD", null, null, String.class, "kbCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderLoginCompanyCd = cci("ORDER_LOGIN_COMPANY_CD", "ORDER_LOGIN_COMPANY_CD", null, null, String.class, "orderLoginCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderOfficeCompanyCd = cci("ORDER_OFFICE_COMPANY_CD", "ORDER_OFFICE_COMPANY_CD", null, null, String.class, "orderOfficeCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderSmarteditCompanyCd = cci("ORDER_SMARTEDIT_COMPANY_CD", "ORDER_SMARTEDIT_COMPANY_CD", null, null, String.class, "orderSmarteditCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupanddemTaxCompanyCd = cci("SUPANDDEM_TAX_COMPANY_CD", "SUPANDDEM_TAX_COMPANY_CD", null, null, String.class, "supanddemTaxCompanyCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidFrdateh = cci("VALID_FRDATEH", "VALID_FRDATEH", null, null, String.class, "validFrdateh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidTodateh = cci("VALID_TODATEH", "VALID_TODATEH", null, null, String.class, "validTodateh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_LOGIN_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLoginInfoId() { return _columnReceiveLoginInfoId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * COMMON_AUTH_ID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommonAuthId() { return _columnCommonAuthId; }
    /**
     * EMPLOYEE_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmployeeNo() { return _columnEmployeeNo; }
    /**
     * ID_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdType() { return _columnIdType; }
    /**
     * ENROLLMENT_STATUS: {varchar(255)}
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
     * ADMIN_FLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdminFlg() { return _columnAdminFlg; }
    /**
     * COMPANY_UNIT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompanyUnitCd() { return _columnCompanyUnitCd; }
    /**
     * BIZ_SYSTEM_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizSystemCd() { return _columnBizSystemCd; }
    /**
     * BIZ_SYSTEM_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizSystemNm() { return _columnBizSystemNm; }
    /**
     * USER_ROLE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserRoleCd() { return _columnUserRoleCd; }
    /**
     * USER_ROLE_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserRoleNm() { return _columnUserRoleNm; }
    /**
     * PLAN_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanCompanyCd() { return _columnPlanCompanyCd; }
    /**
     * WMS_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsCompanyCd() { return _columnWmsCompanyCd; }
    /**
     * DLV_ROOT_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvRootCompanyCd() { return _columnDlvRootCompanyCd; }
    /**
     * SVF_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSvfCompanyCd() { return _columnSvfCompanyCd; }
    /**
     * KB_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKbCompanyCd() { return _columnKbCompanyCd; }
    /**
     * ORDER_LOGIN_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderLoginCompanyCd() { return _columnOrderLoginCompanyCd; }
    /**
     * ORDER_OFFICE_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderOfficeCompanyCd() { return _columnOrderOfficeCompanyCd; }
    /**
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderSmarteditCompanyCd() { return _columnOrderSmarteditCompanyCd; }
    /**
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupanddemTaxCompanyCd() { return _columnSupanddemTaxCompanyCd; }
    /**
     * VALID_FRDATEH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidFrdateh() { return _columnValidFrdateh; }
    /**
     * VALID_TODATEH: {varchar(255)}
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
        ls.add(columnReceiveLoginInfoId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceiveLoginInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EUser"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EUserCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EUser> getEntityType() { return EUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EUser newEntity() { return new EUser(); }
    public EUser newMyEntity() { return new EUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
