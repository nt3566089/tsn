package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of M_USER_TERM.
 * @author DBFlute(AutoGenerator)
 */
public class BsMUserTermCQ extends AbstractBsMUserTermCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MUserTermCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMUserTermCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_USER_TERM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MUserTermCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MUserTermCIQ xcreateCIQ() {
        MUserTermCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MUserTermCIQ xnewCIQ() {
        return new MUserTermCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_USER_TERM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MUserTermCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MUserTermCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _commonAuthId;
    public ConditionValue xdfgetCommonAuthId()
    { if (_commonAuthId == null) { _commonAuthId = nCV(); }
      return _commonAuthId; }
    protected ConditionValue xgetCValueCommonAuthId() { return xdfgetCommonAuthId(); }

    /**
     * Add order-by as ascend. <br>
     * COMMON_AUTH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_CommonAuthId_Asc() { regOBA("COMMON_AUTH_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMON_AUTH_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_CommonAuthId_Desc() { regOBD("COMMON_AUTH_ID"); return this; }

    protected ConditionValue _employeeNo;
    public ConditionValue xdfgetEmployeeNo()
    { if (_employeeNo == null) { _employeeNo = nCV(); }
      return _employeeNo; }
    protected ConditionValue xgetCValueEmployeeNo() { return xdfgetEmployeeNo(); }

    /**
     * Add order-by as ascend. <br>
     * EMPLOYEE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_EmployeeNo_Asc() { regOBA("EMPLOYEE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMPLOYEE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_EmployeeNo_Desc() { regOBD("EMPLOYEE_NO"); return this; }

    protected ConditionValue _idType;
    public ConditionValue xdfgetIdType()
    { if (_idType == null) { _idType = nCV(); }
      return _idType; }
    protected ConditionValue xgetCValueIdType() { return xdfgetIdType(); }

    /**
     * Add order-by as ascend. <br>
     * ID_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_IdType_Asc() { regOBA("ID_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_IdType_Desc() { regOBD("ID_TYPE"); return this; }

    protected ConditionValue _enrollmentStatus;
    public ConditionValue xdfgetEnrollmentStatus()
    { if (_enrollmentStatus == null) { _enrollmentStatus = nCV(); }
      return _enrollmentStatus; }
    protected ConditionValue xgetCValueEnrollmentStatus() { return xdfgetEnrollmentStatus(); }

    /**
     * Add order-by as ascend. <br>
     * ENROLLMENT_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_EnrollmentStatus_Asc() { regOBA("ENROLLMENT_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENROLLMENT_STATUS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_EnrollmentStatus_Desc() { regOBD("ENROLLMENT_STATUS"); return this; }

    protected ConditionValue _lastName;
    public ConditionValue xdfgetLastName()
    { if (_lastName == null) { _lastName = nCV(); }
      return _lastName; }
    protected ConditionValue xgetCValueLastName() { return xdfgetLastName(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_LastName_Asc() { regOBA("LAST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_LastName_Desc() { regOBD("LAST_NAME"); return this; }

    protected ConditionValue _firstName;
    public ConditionValue xdfgetFirstName()
    { if (_firstName == null) { _firstName = nCV(); }
      return _firstName; }
    protected ConditionValue xgetCValueFirstName() { return xdfgetFirstName(); }

    /**
     * Add order-by as ascend. <br>
     * FIRST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_FirstName_Asc() { regOBA("FIRST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_FirstName_Desc() { regOBD("FIRST_NAME"); return this; }

    protected ConditionValue _lastNameKana;
    public ConditionValue xdfgetLastNameKana()
    { if (_lastNameKana == null) { _lastNameKana = nCV(); }
      return _lastNameKana; }
    protected ConditionValue xgetCValueLastNameKana() { return xdfgetLastNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_LastNameKana_Asc() { regOBA("LAST_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_LastNameKana_Desc() { regOBD("LAST_NAME_KANA"); return this; }

    protected ConditionValue _firstNameKana;
    public ConditionValue xdfgetFirstNameKana()
    { if (_firstNameKana == null) { _firstNameKana = nCV(); }
      return _firstNameKana; }
    protected ConditionValue xgetCValueFirstNameKana() { return xdfgetFirstNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_FirstNameKana_Asc() { regOBA("FIRST_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_FirstNameKana_Desc() { regOBD("FIRST_NAME_KANA"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _adminFlg;
    public ConditionValue xdfgetAdminFlg()
    { if (_adminFlg == null) { _adminFlg = nCV(); }
      return _adminFlg; }
    protected ConditionValue xgetCValueAdminFlg() { return xdfgetAdminFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ADMIN_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AdminFlg_Asc() { regOBA("ADMIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADMIN_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AdminFlg_Desc() { regOBD("ADMIN_FLG"); return this; }

    protected ConditionValue _companyUnitCd;
    public ConditionValue xdfgetCompanyUnitCd()
    { if (_companyUnitCd == null) { _companyUnitCd = nCV(); }
      return _companyUnitCd; }
    protected ConditionValue xgetCValueCompanyUnitCd() { return xdfgetCompanyUnitCd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_UNIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_CompanyUnitCd_Asc() { regOBA("COMPANY_UNIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_UNIT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_CompanyUnitCd_Desc() { regOBD("COMPANY_UNIT_CD"); return this; }

    protected ConditionValue _bizSystemCd;
    public ConditionValue xdfgetBizSystemCd()
    { if (_bizSystemCd == null) { _bizSystemCd = nCV(); }
      return _bizSystemCd; }
    protected ConditionValue xgetCValueBizSystemCd() { return xdfgetBizSystemCd(); }

    /**
     * Add order-by as ascend. <br>
     * BIZ_SYSTEM_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_BizSystemCd_Asc() { regOBA("BIZ_SYSTEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIZ_SYSTEM_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_BizSystemCd_Desc() { regOBD("BIZ_SYSTEM_CD"); return this; }

    protected ConditionValue _bizSystemNm;
    public ConditionValue xdfgetBizSystemNm()
    { if (_bizSystemNm == null) { _bizSystemNm = nCV(); }
      return _bizSystemNm; }
    protected ConditionValue xgetCValueBizSystemNm() { return xdfgetBizSystemNm(); }

    /**
     * Add order-by as ascend. <br>
     * BIZ_SYSTEM_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_BizSystemNm_Asc() { regOBA("BIZ_SYSTEM_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIZ_SYSTEM_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_BizSystemNm_Desc() { regOBD("BIZ_SYSTEM_NM"); return this; }

    protected ConditionValue _userRoleCd;
    public ConditionValue xdfgetUserRoleCd()
    { if (_userRoleCd == null) { _userRoleCd = nCV(); }
      return _userRoleCd; }
    protected ConditionValue xgetCValueUserRoleCd() { return xdfgetUserRoleCd(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ROLE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UserRoleCd_Asc() { regOBA("USER_ROLE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ROLE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UserRoleCd_Desc() { regOBD("USER_ROLE_CD"); return this; }

    protected ConditionValue _userRoleNm;
    public ConditionValue xdfgetUserRoleNm()
    { if (_userRoleNm == null) { _userRoleNm = nCV(); }
      return _userRoleNm; }
    protected ConditionValue xgetCValueUserRoleNm() { return xdfgetUserRoleNm(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ROLE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UserRoleNm_Asc() { regOBA("USER_ROLE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ROLE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UserRoleNm_Desc() { regOBD("USER_ROLE_NM"); return this; }

    protected ConditionValue _planCompanyCd;
    public ConditionValue xdfgetPlanCompanyCd()
    { if (_planCompanyCd == null) { _planCompanyCd = nCV(); }
      return _planCompanyCd; }
    protected ConditionValue xgetCValuePlanCompanyCd() { return xdfgetPlanCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_PlanCompanyCd_Asc() { regOBA("PLAN_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_PlanCompanyCd_Desc() { regOBD("PLAN_COMPANY_CD"); return this; }

    protected ConditionValue _wmsCompanyCd;
    public ConditionValue xdfgetWmsCompanyCd()
    { if (_wmsCompanyCd == null) { _wmsCompanyCd = nCV(); }
      return _wmsCompanyCd; }
    protected ConditionValue xgetCValueWmsCompanyCd() { return xdfgetWmsCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_WmsCompanyCd_Asc() { regOBA("WMS_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_WmsCompanyCd_Desc() { regOBD("WMS_COMPANY_CD"); return this; }

    protected ConditionValue _dlvRootCompanyCd;
    public ConditionValue xdfgetDlvRootCompanyCd()
    { if (_dlvRootCompanyCd == null) { _dlvRootCompanyCd = nCV(); }
      return _dlvRootCompanyCd; }
    protected ConditionValue xgetCValueDlvRootCompanyCd() { return xdfgetDlvRootCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_DlvRootCompanyCd_Asc() { regOBA("DLV_ROOT_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLV_ROOT_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_DlvRootCompanyCd_Desc() { regOBD("DLV_ROOT_COMPANY_CD"); return this; }

    protected ConditionValue _svfCompanyCd;
    public ConditionValue xdfgetSvfCompanyCd()
    { if (_svfCompanyCd == null) { _svfCompanyCd = nCV(); }
      return _svfCompanyCd; }
    protected ConditionValue xgetCValueSvfCompanyCd() { return xdfgetSvfCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * SVF_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_SvfCompanyCd_Asc() { regOBA("SVF_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SVF_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_SvfCompanyCd_Desc() { regOBD("SVF_COMPANY_CD"); return this; }

    protected ConditionValue _kbCompanyCd;
    public ConditionValue xdfgetKbCompanyCd()
    { if (_kbCompanyCd == null) { _kbCompanyCd = nCV(); }
      return _kbCompanyCd; }
    protected ConditionValue xgetCValueKbCompanyCd() { return xdfgetKbCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * KB_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_KbCompanyCd_Asc() { regOBA("KB_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KB_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_KbCompanyCd_Desc() { regOBD("KB_COMPANY_CD"); return this; }

    protected ConditionValue _orderLoginCompanyCd;
    public ConditionValue xdfgetOrderLoginCompanyCd()
    { if (_orderLoginCompanyCd == null) { _orderLoginCompanyCd = nCV(); }
      return _orderLoginCompanyCd; }
    protected ConditionValue xgetCValueOrderLoginCompanyCd() { return xdfgetOrderLoginCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_OrderLoginCompanyCd_Asc() { regOBA("ORDER_LOGIN_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_LOGIN_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_OrderLoginCompanyCd_Desc() { regOBD("ORDER_LOGIN_COMPANY_CD"); return this; }

    protected ConditionValue _orderOfficeCompanyCd;
    public ConditionValue xdfgetOrderOfficeCompanyCd()
    { if (_orderOfficeCompanyCd == null) { _orderOfficeCompanyCd = nCV(); }
      return _orderOfficeCompanyCd; }
    protected ConditionValue xgetCValueOrderOfficeCompanyCd() { return xdfgetOrderOfficeCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_OrderOfficeCompanyCd_Asc() { regOBA("ORDER_OFFICE_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_OFFICE_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_OrderOfficeCompanyCd_Desc() { regOBD("ORDER_OFFICE_COMPANY_CD"); return this; }

    protected ConditionValue _orderSmarteditCompanyCd;
    public ConditionValue xdfgetOrderSmarteditCompanyCd()
    { if (_orderSmarteditCompanyCd == null) { _orderSmarteditCompanyCd = nCV(); }
      return _orderSmarteditCompanyCd; }
    protected ConditionValue xgetCValueOrderSmarteditCompanyCd() { return xdfgetOrderSmarteditCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_OrderSmarteditCompanyCd_Asc() { regOBA("ORDER_SMARTEDIT_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_SMARTEDIT_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_OrderSmarteditCompanyCd_Desc() { regOBD("ORDER_SMARTEDIT_COMPANY_CD"); return this; }

    protected ConditionValue _supanddemTaxCompanyCd;
    public ConditionValue xdfgetSupanddemTaxCompanyCd()
    { if (_supanddemTaxCompanyCd == null) { _supanddemTaxCompanyCd = nCV(); }
      return _supanddemTaxCompanyCd; }
    protected ConditionValue xgetCValueSupanddemTaxCompanyCd() { return xdfgetSupanddemTaxCompanyCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_SupanddemTaxCompanyCd_Asc() { regOBA("SUPANDDEM_TAX_COMPANY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPANDDEM_TAX_COMPANY_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_SupanddemTaxCompanyCd_Desc() { regOBD("SUPANDDEM_TAX_COMPANY_CD"); return this; }

    protected ConditionValue _validFrdateh;
    public ConditionValue xdfgetValidFrdateh()
    { if (_validFrdateh == null) { _validFrdateh = nCV(); }
      return _validFrdateh; }
    protected ConditionValue xgetCValueValidFrdateh() { return xdfgetValidFrdateh(); }

    /**
     * Add order-by as ascend. <br>
     * VALID_FRDATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_ValidFrdateh_Asc() { regOBA("VALID_FRDATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALID_FRDATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_ValidFrdateh_Desc() { regOBD("VALID_FRDATEH"); return this; }

    protected ConditionValue _validTodateh;
    public ConditionValue xdfgetValidTodateh()
    { if (_validTodateh == null) { _validTodateh = nCV(); }
      return _validTodateh; }
    protected ConditionValue xgetCValueValidTodateh() { return xdfgetValidTodateh(); }

    /**
     * Add order-by as ascend. <br>
     * VALID_TODATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_ValidTodateh_Asc() { regOBA("VALID_TODATEH"); return this; }

    /**
     * Add order-by as descend. <br>
     * VALID_TODATEH: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_ValidTodateh_Desc() { regOBD("VALID_TODATEH"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMUserTermCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MUserTermCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MUserTermCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MUserTermCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MUserTermCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MUserTermCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MUserTermCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MUserTermCQ> _myselfExistsMap;
    public Map<String, MUserTermCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MUserTermCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MUserTermCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MUserTermCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MUserTermCB.class.getName(); }
    protected String xCQ() { return MUserTermCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
