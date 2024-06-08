package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of M_USER_TERM as TABLE. <br>
 * ユーザマスタ適用期間
 * <pre>
 * [primary-key]
 *     COMMON_AUTH_ID
 *
 * [column]
 *     COMMON_AUTH_ID, EMPLOYEE_NO, ID_TYPE, ENROLLMENT_STATUS, LAST_NAME, FIRST_NAME, LAST_NAME_KANA, FIRST_NAME_KANA, MAIL_ADDRESS, ADMIN_FLG, COMPANY_UNIT_CD, BIZ_SYSTEM_CD, BIZ_SYSTEM_NM, USER_ROLE_CD, USER_ROLE_NM, PLAN_COMPANY_CD, WMS_COMPANY_CD, DLV_ROOT_COMPANY_CD, SVF_COMPANY_CD, KB_COMPANY_CD, ORDER_LOGIN_COMPANY_CD, ORDER_OFFICE_COMPANY_CD, ORDER_SMARTEDIT_COMPANY_CD, SUPANDDEM_TAX_COMPANY_CD, VALID_FRDATEH, VALID_TODATEH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMON_AUTH_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMUserTermDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** COMMON_AUTH_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _commonAuthId;

    /** EMPLOYEE_NO: {bigint(19)} */
    @JsonKey
    protected Long _employeeNo;

    /** ID_TYPE: {varchar(30)} */
    @JsonKey
    protected String _idType;

    /** ENROLLMENT_STATUS: {varchar(30)} */
    @JsonKey
    protected String _enrollmentStatus;

    /** LAST_NAME: {varchar(255)} */
    @JsonKey
    protected String _lastName;

    /** FIRST_NAME: {varchar(255)} */
    @JsonKey
    protected String _firstName;

    /** LAST_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _lastNameKana;

    /** FIRST_NAME_KANA: {varchar(255)} */
    @JsonKey
    protected String _firstNameKana;

    /** MAIL_ADDRESS: {varchar(255)} */
    @JsonKey
    protected String _mailAddress;

    /** ADMIN_FLG: {char(1)} */
    @JsonKey
    protected String _adminFlg;

    /** COMPANY_UNIT_CD: {varchar(30)} */
    @JsonKey
    protected String _companyUnitCd;

    /** BIZ_SYSTEM_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _bizSystemCd;

    /** BIZ_SYSTEM_NM: {varchar(60)} */
    @JsonKey
    protected String _bizSystemNm;

    /** USER_ROLE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userRoleCd;

    /** USER_ROLE_NM: {varchar(60)} */
    @JsonKey
    protected String _userRoleNm;

    /** PLAN_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _planCompanyCd;

    /** WMS_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _wmsCompanyCd;

    /** DLV_ROOT_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _dlvRootCompanyCd;

    /** SVF_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _svfCompanyCd;

    /** KB_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _kbCompanyCd;

    /** ORDER_LOGIN_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _orderLoginCompanyCd;

    /** ORDER_OFFICE_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _orderOfficeCompanyCd;

    /** ORDER_SMARTEDIT_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _orderSmarteditCompanyCd;

    /** SUPANDDEM_TAX_COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _supanddemTaxCompanyCd;

    /** VALID_FRDATEH: {NotNull, varchar(8)} */
    @JsonKey
    protected String _validFrdateh;

    /** VALID_TODATEH: {NotNull, varchar(8)} */
    @JsonKey
    protected String _validTodateh;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMUserTermDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMUserTermDto)) { return false; }
        final BsMUserTermDto otherEntity = (BsMUserTermDto)other;
        if (!helpComparingValue(getCommonAuthId(), otherEntity.getCommonAuthId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_USER_TERM");
        result = xCH(result, getCommonAuthId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getCommonAuthId());
        sb.append(c).append(getEmployeeNo());
        sb.append(c).append(getIdType());
        sb.append(c).append(getEnrollmentStatus());
        sb.append(c).append(getLastName());
        sb.append(c).append(getFirstName());
        sb.append(c).append(getLastNameKana());
        sb.append(c).append(getFirstNameKana());
        sb.append(c).append(getMailAddress());
        sb.append(c).append(getAdminFlg());
        sb.append(c).append(getCompanyUnitCd());
        sb.append(c).append(getBizSystemCd());
        sb.append(c).append(getBizSystemNm());
        sb.append(c).append(getUserRoleCd());
        sb.append(c).append(getUserRoleNm());
        sb.append(c).append(getPlanCompanyCd());
        sb.append(c).append(getWmsCompanyCd());
        sb.append(c).append(getDlvRootCompanyCd());
        sb.append(c).append(getSvfCompanyCd());
        sb.append(c).append(getKbCompanyCd());
        sb.append(c).append(getOrderLoginCompanyCd());
        sb.append(c).append(getOrderOfficeCompanyCd());
        sb.append(c).append(getOrderSmarteditCompanyCd());
        sb.append(c).append(getSupanddemTaxCompanyCd());
        sb.append(c).append(getValidFrdateh());
        sb.append(c).append(getValidTodateh());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMMON_AUTH_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通認証ID
     * @return The value of the column 'COMMON_AUTH_ID'. (NullAllowed)
     */
    public Long getCommonAuthId() {
        return _commonAuthId;
    }

    /**
     * [set] COMMON_AUTH_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通認証ID
     * @param commonAuthId The value of the column 'COMMON_AUTH_ID'. (NullAllowed)
     */
    public void setCommonAuthId(Long commonAuthId) {
        __modifiedProperties.add("commonAuthId");
        this._commonAuthId = commonAuthId;
    }

    /**
     * [get] EMPLOYEE_NO: {bigint(19)} <br>
     * 従業員番号
     * @return The value of the column 'EMPLOYEE_NO'. (NullAllowed)
     */
    public Long getEmployeeNo() {
        return _employeeNo;
    }

    /**
     * [set] EMPLOYEE_NO: {bigint(19)} <br>
     * 従業員番号
     * @param employeeNo The value of the column 'EMPLOYEE_NO'. (NullAllowed)
     */
    public void setEmployeeNo(Long employeeNo) {
        __modifiedProperties.add("employeeNo");
        this._employeeNo = employeeNo;
    }

    /**
     * [get] ID_TYPE: {varchar(30)} <br>
     * ID種別
     * @return The value of the column 'ID_TYPE'. (NullAllowed)
     */
    public String getIdType() {
        return _idType;
    }

    /**
     * [set] ID_TYPE: {varchar(30)} <br>
     * ID種別
     * @param idType The value of the column 'ID_TYPE'. (NullAllowed)
     */
    public void setIdType(String idType) {
        __modifiedProperties.add("idType");
        this._idType = idType;
    }

    /**
     * [get] ENROLLMENT_STATUS: {varchar(30)} <br>
     * 在籍状態
     * @return The value of the column 'ENROLLMENT_STATUS'. (NullAllowed)
     */
    public String getEnrollmentStatus() {
        return _enrollmentStatus;
    }

    /**
     * [set] ENROLLMENT_STATUS: {varchar(30)} <br>
     * 在籍状態
     * @param enrollmentStatus The value of the column 'ENROLLMENT_STATUS'. (NullAllowed)
     */
    public void setEnrollmentStatus(String enrollmentStatus) {
        __modifiedProperties.add("enrollmentStatus");
        this._enrollmentStatus = enrollmentStatus;
    }

    /**
     * [get] LAST_NAME: {varchar(255)} <br>
     * 姓
     * @return The value of the column 'LAST_NAME'. (NullAllowed)
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * [set] LAST_NAME: {varchar(255)} <br>
     * 姓
     * @param lastName The value of the column 'LAST_NAME'. (NullAllowed)
     */
    public void setLastName(String lastName) {
        __modifiedProperties.add("lastName");
        this._lastName = lastName;
    }

    /**
     * [get] FIRST_NAME: {varchar(255)} <br>
     * 名
     * @return The value of the column 'FIRST_NAME'. (NullAllowed)
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * [set] FIRST_NAME: {varchar(255)} <br>
     * 名
     * @param firstName The value of the column 'FIRST_NAME'. (NullAllowed)
     */
    public void setFirstName(String firstName) {
        __modifiedProperties.add("firstName");
        this._firstName = firstName;
    }

    /**
     * [get] LAST_NAME_KANA: {varchar(255)} <br>
     * 姓(カタカナ)
     * @return The value of the column 'LAST_NAME_KANA'. (NullAllowed)
     */
    public String getLastNameKana() {
        return _lastNameKana;
    }

    /**
     * [set] LAST_NAME_KANA: {varchar(255)} <br>
     * 姓(カタカナ)
     * @param lastNameKana The value of the column 'LAST_NAME_KANA'. (NullAllowed)
     */
    public void setLastNameKana(String lastNameKana) {
        __modifiedProperties.add("lastNameKana");
        this._lastNameKana = lastNameKana;
    }

    /**
     * [get] FIRST_NAME_KANA: {varchar(255)} <br>
     * 名（カタカナ）
     * @return The value of the column 'FIRST_NAME_KANA'. (NullAllowed)
     */
    public String getFirstNameKana() {
        return _firstNameKana;
    }

    /**
     * [set] FIRST_NAME_KANA: {varchar(255)} <br>
     * 名（カタカナ）
     * @param firstNameKana The value of the column 'FIRST_NAME_KANA'. (NullAllowed)
     */
    public void setFirstNameKana(String firstNameKana) {
        __modifiedProperties.add("firstNameKana");
        this._firstNameKana = firstNameKana;
    }

    /**
     * [get] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed)
     */
    public String getMailAddress() {
        return _mailAddress;
    }

    /**
     * [set] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed)
     */
    public void setMailAddress(String mailAddress) {
        __modifiedProperties.add("mailAddress");
        this._mailAddress = mailAddress;
    }

    /**
     * [get] ADMIN_FLG: {char(1)} <br>
     * 管理職フラグ
     * @return The value of the column 'ADMIN_FLG'. (NullAllowed)
     */
    public String getAdminFlg() {
        return _adminFlg;
    }

    /**
     * [set] ADMIN_FLG: {char(1)} <br>
     * 管理職フラグ
     * @param adminFlg The value of the column 'ADMIN_FLG'. (NullAllowed)
     */
    public void setAdminFlg(String adminFlg) {
        __modifiedProperties.add("adminFlg");
        this._adminFlg = adminFlg;
    }

    /**
     * [get] COMPANY_UNIT_CD: {varchar(30)} <br>
     * 組織ユニットコード
     * @return The value of the column 'COMPANY_UNIT_CD'. (NullAllowed)
     */
    public String getCompanyUnitCd() {
        return _companyUnitCd;
    }

    /**
     * [set] COMPANY_UNIT_CD: {varchar(30)} <br>
     * 組織ユニットコード
     * @param companyUnitCd The value of the column 'COMPANY_UNIT_CD'. (NullAllowed)
     */
    public void setCompanyUnitCd(String companyUnitCd) {
        __modifiedProperties.add("companyUnitCd");
        this._companyUnitCd = companyUnitCd;
    }

    /**
     * [get] BIZ_SYSTEM_CD: {NotNull, varchar(30)} <br>
     * 業務システムコード
     * @return The value of the column 'BIZ_SYSTEM_CD'. (NullAllowed)
     */
    public String getBizSystemCd() {
        return _bizSystemCd;
    }

    /**
     * [set] BIZ_SYSTEM_CD: {NotNull, varchar(30)} <br>
     * 業務システムコード
     * @param bizSystemCd The value of the column 'BIZ_SYSTEM_CD'. (NullAllowed)
     */
    public void setBizSystemCd(String bizSystemCd) {
        __modifiedProperties.add("bizSystemCd");
        this._bizSystemCd = bizSystemCd;
    }

    /**
     * [get] BIZ_SYSTEM_NM: {varchar(60)} <br>
     * 業務システム名称
     * @return The value of the column 'BIZ_SYSTEM_NM'. (NullAllowed)
     */
    public String getBizSystemNm() {
        return _bizSystemNm;
    }

    /**
     * [set] BIZ_SYSTEM_NM: {varchar(60)} <br>
     * 業務システム名称
     * @param bizSystemNm The value of the column 'BIZ_SYSTEM_NM'. (NullAllowed)
     */
    public void setBizSystemNm(String bizSystemNm) {
        __modifiedProperties.add("bizSystemNm");
        this._bizSystemNm = bizSystemNm;
    }

    /**
     * [get] USER_ROLE_CD: {NotNull, varchar(30)} <br>
     * ユーザロールコード
     * @return The value of the column 'USER_ROLE_CD'. (NullAllowed)
     */
    public String getUserRoleCd() {
        return _userRoleCd;
    }

    /**
     * [set] USER_ROLE_CD: {NotNull, varchar(30)} <br>
     * ユーザロールコード
     * @param userRoleCd The value of the column 'USER_ROLE_CD'. (NullAllowed)
     */
    public void setUserRoleCd(String userRoleCd) {
        __modifiedProperties.add("userRoleCd");
        this._userRoleCd = userRoleCd;
    }

    /**
     * [get] USER_ROLE_NM: {varchar(60)} <br>
     * ユーザロール名称
     * @return The value of the column 'USER_ROLE_NM'. (NullAllowed)
     */
    public String getUserRoleNm() {
        return _userRoleNm;
    }

    /**
     * [set] USER_ROLE_NM: {varchar(60)} <br>
     * ユーザロール名称
     * @param userRoleNm The value of the column 'USER_ROLE_NM'. (NullAllowed)
     */
    public void setUserRoleNm(String userRoleNm) {
        __modifiedProperties.add("userRoleNm");
        this._userRoleNm = userRoleNm;
    }

    /**
     * [get] PLAN_COMPANY_CD: {varchar(30)} <br>
     * 販物用組織コード
     * @return The value of the column 'PLAN_COMPANY_CD'. (NullAllowed)
     */
    public String getPlanCompanyCd() {
        return _planCompanyCd;
    }

    /**
     * [set] PLAN_COMPANY_CD: {varchar(30)} <br>
     * 販物用組織コード
     * @param planCompanyCd The value of the column 'PLAN_COMPANY_CD'. (NullAllowed)
     */
    public void setPlanCompanyCd(String planCompanyCd) {
        __modifiedProperties.add("planCompanyCd");
        this._planCompanyCd = planCompanyCd;
    }

    /**
     * [get] WMS_COMPANY_CD: {varchar(30)} <br>
     * WMS用組織コード
     * @return The value of the column 'WMS_COMPANY_CD'. (NullAllowed)
     */
    public String getWmsCompanyCd() {
        return _wmsCompanyCd;
    }

    /**
     * [set] WMS_COMPANY_CD: {varchar(30)} <br>
     * WMS用組織コード
     * @param wmsCompanyCd The value of the column 'WMS_COMPANY_CD'. (NullAllowed)
     */
    public void setWmsCompanyCd(String wmsCompanyCd) {
        __modifiedProperties.add("wmsCompanyCd");
        this._wmsCompanyCd = wmsCompanyCd;
    }

    /**
     * [get] DLV_ROOT_COMPANY_CD: {varchar(30)} <br>
     * 配達・ルート管理用組織コード
     * @return The value of the column 'DLV_ROOT_COMPANY_CD'. (NullAllowed)
     */
    public String getDlvRootCompanyCd() {
        return _dlvRootCompanyCd;
    }

    /**
     * [set] DLV_ROOT_COMPANY_CD: {varchar(30)} <br>
     * 配達・ルート管理用組織コード
     * @param dlvRootCompanyCd The value of the column 'DLV_ROOT_COMPANY_CD'. (NullAllowed)
     */
    public void setDlvRootCompanyCd(String dlvRootCompanyCd) {
        __modifiedProperties.add("dlvRootCompanyCd");
        this._dlvRootCompanyCd = dlvRootCompanyCd;
    }

    /**
     * [get] SVF_COMPANY_CD: {varchar(30)} <br>
     * 帳票（SVF）用組織コード
     * @return The value of the column 'SVF_COMPANY_CD'. (NullAllowed)
     */
    public String getSvfCompanyCd() {
        return _svfCompanyCd;
    }

    /**
     * [set] SVF_COMPANY_CD: {varchar(30)} <br>
     * 帳票（SVF）用組織コード
     * @param svfCompanyCd The value of the column 'SVF_COMPANY_CD'. (NullAllowed)
     */
    public void setSvfCompanyCd(String svfCompanyCd) {
        __modifiedProperties.add("svfCompanyCd");
        this._svfCompanyCd = svfCompanyCd;
    }

    /**
     * [get] KB_COMPANY_CD: {varchar(30)} <br>
     * 帳票（活文）用組織コード
     * @return The value of the column 'KB_COMPANY_CD'. (NullAllowed)
     */
    public String getKbCompanyCd() {
        return _kbCompanyCd;
    }

    /**
     * [set] KB_COMPANY_CD: {varchar(30)} <br>
     * 帳票（活文）用組織コード
     * @param kbCompanyCd The value of the column 'KB_COMPANY_CD'. (NullAllowed)
     */
    public void setKbCompanyCd(String kbCompanyCd) {
        __modifiedProperties.add("kbCompanyCd");
        this._kbCompanyCd = kbCompanyCd;
    }

    /**
     * [get] ORDER_LOGIN_COMPANY_CD: {varchar(30)} <br>
     * WEB受注（代理ログイン）用組織コード
     * @return The value of the column 'ORDER_LOGIN_COMPANY_CD'. (NullAllowed)
     */
    public String getOrderLoginCompanyCd() {
        return _orderLoginCompanyCd;
    }

    /**
     * [set] ORDER_LOGIN_COMPANY_CD: {varchar(30)} <br>
     * WEB受注（代理ログイン）用組織コード
     * @param orderLoginCompanyCd The value of the column 'ORDER_LOGIN_COMPANY_CD'. (NullAllowed)
     */
    public void setOrderLoginCompanyCd(String orderLoginCompanyCd) {
        __modifiedProperties.add("orderLoginCompanyCd");
        this._orderLoginCompanyCd = orderLoginCompanyCd;
    }

    /**
     * [get] ORDER_OFFICE_COMPANY_CD: {varchar(30)} <br>
     * WEB受注（バックオフィス）用組織コード
     * @return The value of the column 'ORDER_OFFICE_COMPANY_CD'. (NullAllowed)
     */
    public String getOrderOfficeCompanyCd() {
        return _orderOfficeCompanyCd;
    }

    /**
     * [set] ORDER_OFFICE_COMPANY_CD: {varchar(30)} <br>
     * WEB受注（バックオフィス）用組織コード
     * @param orderOfficeCompanyCd The value of the column 'ORDER_OFFICE_COMPANY_CD'. (NullAllowed)
     */
    public void setOrderOfficeCompanyCd(String orderOfficeCompanyCd) {
        __modifiedProperties.add("orderOfficeCompanyCd");
        this._orderOfficeCompanyCd = orderOfficeCompanyCd;
    }

    /**
     * [get] ORDER_SMARTEDIT_COMPANY_CD: {varchar(30)} <br>
     * WEB受注（Smart edit）用組織コード
     * @return The value of the column 'ORDER_SMARTEDIT_COMPANY_CD'. (NullAllowed)
     */
    public String getOrderSmarteditCompanyCd() {
        return _orderSmarteditCompanyCd;
    }

    /**
     * [set] ORDER_SMARTEDIT_COMPANY_CD: {varchar(30)} <br>
     * WEB受注（Smart edit）用組織コード
     * @param orderSmarteditCompanyCd The value of the column 'ORDER_SMARTEDIT_COMPANY_CD'. (NullAllowed)
     */
    public void setOrderSmarteditCompanyCd(String orderSmarteditCompanyCd) {
        __modifiedProperties.add("orderSmarteditCompanyCd");
        this._orderSmarteditCompanyCd = orderSmarteditCompanyCd;
    }

    /**
     * [get] SUPANDDEM_TAX_COMPANY_CD: {varchar(30)} <br>
     * 需給保税用組織コード
     * @return The value of the column 'SUPANDDEM_TAX_COMPANY_CD'. (NullAllowed)
     */
    public String getSupanddemTaxCompanyCd() {
        return _supanddemTaxCompanyCd;
    }

    /**
     * [set] SUPANDDEM_TAX_COMPANY_CD: {varchar(30)} <br>
     * 需給保税用組織コード
     * @param supanddemTaxCompanyCd The value of the column 'SUPANDDEM_TAX_COMPANY_CD'. (NullAllowed)
     */
    public void setSupanddemTaxCompanyCd(String supanddemTaxCompanyCd) {
        __modifiedProperties.add("supanddemTaxCompanyCd");
        this._supanddemTaxCompanyCd = supanddemTaxCompanyCd;
    }

    /**
     * [get] VALID_FRDATEH: {NotNull, varchar(8)} <br>
     * 有効開始年月日
     * @return The value of the column 'VALID_FRDATEH'. (NullAllowed)
     */
    public String getValidFrdateh() {
        return _validFrdateh;
    }

    /**
     * [set] VALID_FRDATEH: {NotNull, varchar(8)} <br>
     * 有効開始年月日
     * @param validFrdateh The value of the column 'VALID_FRDATEH'. (NullAllowed)
     */
    public void setValidFrdateh(String validFrdateh) {
        __modifiedProperties.add("validFrdateh");
        this._validFrdateh = validFrdateh;
    }

    /**
     * [get] VALID_TODATEH: {NotNull, varchar(8)} <br>
     * 有効終了年月日
     * @return The value of the column 'VALID_TODATEH'. (NullAllowed)
     */
    public String getValidTodateh() {
        return _validTodateh;
    }

    /**
     * [set] VALID_TODATEH: {NotNull, varchar(8)} <br>
     * 有効終了年月日
     * @param validTodateh The value of the column 'VALID_TODATEH'. (NullAllowed)
     */
    public void setValidTodateh(String validTodateh) {
        __modifiedProperties.add("validTodateh");
        this._validTodateh = validTodateh;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}