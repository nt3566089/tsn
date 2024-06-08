package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of E_TSN_USER as TABLE. <br>
 * TSNユーザマスタ
 * <pre>
 * [primary-key]
 *     TSN_USER_ID
 *
 * [column]
 *     TSN_USER_ID, IMPORT_FLG, COMMON_AUTH_ID, EMPLOYEE_NO, ID_TYPE, ENROLLMENT_STATUS, LAST_NAME, FIRST_NAME, LAST_NAME_KANA, FIRST_NAME_KANA, MAIL_ADDRESS, ADMIN_FLG, COMPANY_UNIT_CD, BIZ_SYSTEM_CD, BIZ_SYSTEM_NM, USER_ROLE_CD, USER_ROLE_NM, PLAN_COMPANY_CD, WMS_COMPANY_CD, DLV_ROOT_COMPANY_CD, SVF_COMPANY_CD, KB_COMPANY_CD, ORDER_LOGIN_COMPANY_CD, ORDER_OFFICE_COMPANY_CD, ORDER_SMARTEDIT_COMPANY_CD, SUPANDDEM_TAX_COMPANY_CD, VALID_FRDATEH, VALID_TODATEH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TSN_USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tsnUserId = entity.getTsnUserId();
 * String importFlg = entity.getImportFlg();
 * String commonAuthId = entity.getCommonAuthId();
 * String employeeNo = entity.getEmployeeNo();
 * String idType = entity.getIdType();
 * String enrollmentStatus = entity.getEnrollmentStatus();
 * String lastName = entity.getLastName();
 * String firstName = entity.getFirstName();
 * String lastNameKana = entity.getLastNameKana();
 * String firstNameKana = entity.getFirstNameKana();
 * String mailAddress = entity.getMailAddress();
 * String adminFlg = entity.getAdminFlg();
 * String companyUnitCd = entity.getCompanyUnitCd();
 * String bizSystemCd = entity.getBizSystemCd();
 * String bizSystemNm = entity.getBizSystemNm();
 * String userRoleCd = entity.getUserRoleCd();
 * String userRoleNm = entity.getUserRoleNm();
 * String planCompanyCd = entity.getPlanCompanyCd();
 * String wmsCompanyCd = entity.getWmsCompanyCd();
 * String dlvRootCompanyCd = entity.getDlvRootCompanyCd();
 * String svfCompanyCd = entity.getSvfCompanyCd();
 * String kbCompanyCd = entity.getKbCompanyCd();
 * String orderLoginCompanyCd = entity.getOrderLoginCompanyCd();
 * String orderOfficeCompanyCd = entity.getOrderOfficeCompanyCd();
 * String orderSmarteditCompanyCd = entity.getOrderSmarteditCompanyCd();
 * String supanddemTaxCompanyCd = entity.getSupanddemTaxCompanyCd();
 * String validFrdateh = entity.getValidFrdateh();
 * String validTodateh = entity.getValidTodateh();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTsnUserId(tsnUserId);
 * entity.setImportFlg(importFlg);
 * entity.setCommonAuthId(commonAuthId);
 * entity.setEmployeeNo(employeeNo);
 * entity.setIdType(idType);
 * entity.setEnrollmentStatus(enrollmentStatus);
 * entity.setLastName(lastName);
 * entity.setFirstName(firstName);
 * entity.setLastNameKana(lastNameKana);
 * entity.setFirstNameKana(firstNameKana);
 * entity.setMailAddress(mailAddress);
 * entity.setAdminFlg(adminFlg);
 * entity.setCompanyUnitCd(companyUnitCd);
 * entity.setBizSystemCd(bizSystemCd);
 * entity.setBizSystemNm(bizSystemNm);
 * entity.setUserRoleCd(userRoleCd);
 * entity.setUserRoleNm(userRoleNm);
 * entity.setPlanCompanyCd(planCompanyCd);
 * entity.setWmsCompanyCd(wmsCompanyCd);
 * entity.setDlvRootCompanyCd(dlvRootCompanyCd);
 * entity.setSvfCompanyCd(svfCompanyCd);
 * entity.setKbCompanyCd(kbCompanyCd);
 * entity.setOrderLoginCompanyCd(orderLoginCompanyCd);
 * entity.setOrderOfficeCompanyCd(orderOfficeCompanyCd);
 * entity.setOrderSmarteditCompanyCd(orderSmarteditCompanyCd);
 * entity.setSupanddemTaxCompanyCd(supanddemTaxCompanyCd);
 * entity.setValidFrdateh(validFrdateh);
 * entity.setValidTodateh(validTodateh);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsETsnUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _tsnUserId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** COMMON_AUTH_ID: {char(1)} */
    protected String _commonAuthId;

    /** EMPLOYEE_NO: {varchar(255)} */
    protected String _employeeNo;

    /** ID_TYPE: {varchar(255)} */
    protected String _idType;

    /** ENROLLMENT_STATUS: {varchar(255)} */
    protected String _enrollmentStatus;

    /** LAST_NAME: {varchar(255)} */
    protected String _lastName;

    /** FIRST_NAME: {varchar(255)} */
    protected String _firstName;

    /** LAST_NAME_KANA: {varchar(255)} */
    protected String _lastNameKana;

    /** FIRST_NAME_KANA: {varchar(255)} */
    protected String _firstNameKana;

    /** MAIL_ADDRESS: {varchar(255)} */
    protected String _mailAddress;

    /** ADMIN_FLG: {varchar(255)} */
    protected String _adminFlg;

    /** COMPANY_UNIT_CD: {varchar(255)} */
    protected String _companyUnitCd;

    /** BIZ_SYSTEM_CD: {varchar(255)} */
    protected String _bizSystemCd;

    /** BIZ_SYSTEM_NM: {varchar(255)} */
    protected String _bizSystemNm;

    /** USER_ROLE_CD: {varchar(255)} */
    protected String _userRoleCd;

    /** USER_ROLE_NM: {varchar(255)} */
    protected String _userRoleNm;

    /** PLAN_COMPANY_CD: {varchar(255)} */
    protected String _planCompanyCd;

    /** WMS_COMPANY_CD: {varchar(255)} */
    protected String _wmsCompanyCd;

    /** DLV_ROOT_COMPANY_CD: {varchar(255)} */
    protected String _dlvRootCompanyCd;

    /** SVF_COMPANY_CD: {varchar(255)} */
    protected String _svfCompanyCd;

    /** KB_COMPANY_CD: {varchar(255)} */
    protected String _kbCompanyCd;

    /** ORDER_LOGIN_COMPANY_CD: {varchar(255)} */
    protected String _orderLoginCompanyCd;

    /** ORDER_OFFICE_COMPANY_CD: {varchar(255)} */
    protected String _orderOfficeCompanyCd;

    /** ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)} */
    protected String _orderSmarteditCompanyCd;

    /** SUPANDDEM_TAX_COMPANY_CD: {varchar(255)} */
    protected String _supanddemTaxCompanyCd;

    /** VALID_FRDATEH: {varchar(255)} */
    protected String _validFrdateh;

    /** VALID_TODATEH: {varchar(255)} */
    protected String _validTodateh;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "E_TSN_USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tsnUserId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsETsnUser) {
            BsETsnUser other = (BsETsnUser)obj;
            if (!xSV(_tsnUserId, other._tsnUserId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tsnUserId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tsnUserId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_commonAuthId));
        sb.append(dm).append(xfND(_employeeNo));
        sb.append(dm).append(xfND(_idType));
        sb.append(dm).append(xfND(_enrollmentStatus));
        sb.append(dm).append(xfND(_lastName));
        sb.append(dm).append(xfND(_firstName));
        sb.append(dm).append(xfND(_lastNameKana));
        sb.append(dm).append(xfND(_firstNameKana));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_adminFlg));
        sb.append(dm).append(xfND(_companyUnitCd));
        sb.append(dm).append(xfND(_bizSystemCd));
        sb.append(dm).append(xfND(_bizSystemNm));
        sb.append(dm).append(xfND(_userRoleCd));
        sb.append(dm).append(xfND(_userRoleNm));
        sb.append(dm).append(xfND(_planCompanyCd));
        sb.append(dm).append(xfND(_wmsCompanyCd));
        sb.append(dm).append(xfND(_dlvRootCompanyCd));
        sb.append(dm).append(xfND(_svfCompanyCd));
        sb.append(dm).append(xfND(_kbCompanyCd));
        sb.append(dm).append(xfND(_orderLoginCompanyCd));
        sb.append(dm).append(xfND(_orderOfficeCompanyCd));
        sb.append(dm).append(xfND(_orderSmarteditCompanyCd));
        sb.append(dm).append(xfND(_supanddemTaxCompanyCd));
        sb.append(dm).append(xfND(_validFrdateh));
        sb.append(dm).append(xfND(_validTodateh));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public ETsnUser clone() {
        return (ETsnUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSNユーザマスタID
     * @return The value of the column 'TSN_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTsnUserId() {
        checkSpecifiedProperty("tsnUserId");
        return _tsnUserId;
    }

    /**
     * [set] TSN_USER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * TSNユーザマスタID
     * @param tsnUserId The value of the column 'TSN_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTsnUserId(Long tsnUserId) {
        registerModifiedProperty("tsnUserId");
        _tsnUserId = tsnUserId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] COMMON_AUTH_ID: {char(1)} <br>
     * 共通認証ID
     * @return The value of the column 'COMMON_AUTH_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCommonAuthId() {
        checkSpecifiedProperty("commonAuthId");
        return convertEmptyToNull(_commonAuthId);
    }

    /**
     * [set] COMMON_AUTH_ID: {char(1)} <br>
     * 共通認証ID
     * @param commonAuthId The value of the column 'COMMON_AUTH_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCommonAuthId(String commonAuthId) {
        registerModifiedProperty("commonAuthId");
        _commonAuthId = commonAuthId;
    }

    /**
     * [get] EMPLOYEE_NO: {varchar(255)} <br>
     * 従業員番号
     * @return The value of the column 'EMPLOYEE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmployeeNo() {
        checkSpecifiedProperty("employeeNo");
        return convertEmptyToNull(_employeeNo);
    }

    /**
     * [set] EMPLOYEE_NO: {varchar(255)} <br>
     * 従業員番号
     * @param employeeNo The value of the column 'EMPLOYEE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmployeeNo(String employeeNo) {
        registerModifiedProperty("employeeNo");
        _employeeNo = employeeNo;
    }

    /**
     * [get] ID_TYPE: {varchar(255)} <br>
     * ID種別
     * @return The value of the column 'ID_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getIdType() {
        checkSpecifiedProperty("idType");
        return convertEmptyToNull(_idType);
    }

    /**
     * [set] ID_TYPE: {varchar(255)} <br>
     * ID種別
     * @param idType The value of the column 'ID_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIdType(String idType) {
        registerModifiedProperty("idType");
        _idType = idType;
    }

    /**
     * [get] ENROLLMENT_STATUS: {varchar(255)} <br>
     * 在籍状態
     * @return The value of the column 'ENROLLMENT_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getEnrollmentStatus() {
        checkSpecifiedProperty("enrollmentStatus");
        return convertEmptyToNull(_enrollmentStatus);
    }

    /**
     * [set] ENROLLMENT_STATUS: {varchar(255)} <br>
     * 在籍状態
     * @param enrollmentStatus The value of the column 'ENROLLMENT_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEnrollmentStatus(String enrollmentStatus) {
        registerModifiedProperty("enrollmentStatus");
        _enrollmentStatus = enrollmentStatus;
    }

    /**
     * [get] LAST_NAME: {varchar(255)} <br>
     * 姓
     * @return The value of the column 'LAST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastName() {
        checkSpecifiedProperty("lastName");
        return convertEmptyToNull(_lastName);
    }

    /**
     * [set] LAST_NAME: {varchar(255)} <br>
     * 姓
     * @param lastName The value of the column 'LAST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastName(String lastName) {
        registerModifiedProperty("lastName");
        _lastName = lastName;
    }

    /**
     * [get] FIRST_NAME: {varchar(255)} <br>
     * 名
     * @return The value of the column 'FIRST_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstName() {
        checkSpecifiedProperty("firstName");
        return convertEmptyToNull(_firstName);
    }

    /**
     * [set] FIRST_NAME: {varchar(255)} <br>
     * 名
     * @param firstName The value of the column 'FIRST_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstName(String firstName) {
        registerModifiedProperty("firstName");
        _firstName = firstName;
    }

    /**
     * [get] LAST_NAME_KANA: {varchar(255)} <br>
     * 姓(カタカナ)
     * @return The value of the column 'LAST_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastNameKana() {
        checkSpecifiedProperty("lastNameKana");
        return convertEmptyToNull(_lastNameKana);
    }

    /**
     * [set] LAST_NAME_KANA: {varchar(255)} <br>
     * 姓(カタカナ)
     * @param lastNameKana The value of the column 'LAST_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastNameKana(String lastNameKana) {
        registerModifiedProperty("lastNameKana");
        _lastNameKana = lastNameKana;
    }

    /**
     * [get] FIRST_NAME_KANA: {varchar(255)} <br>
     * 名（カタカナ）
     * @return The value of the column 'FIRST_NAME_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstNameKana() {
        checkSpecifiedProperty("firstNameKana");
        return convertEmptyToNull(_firstNameKana);
    }

    /**
     * [set] FIRST_NAME_KANA: {varchar(255)} <br>
     * 名（カタカナ）
     * @param firstNameKana The value of the column 'FIRST_NAME_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstNameKana(String firstNameKana) {
        registerModifiedProperty("firstNameKana");
        _firstNameKana = firstNameKana;
    }

    /**
     * [get] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return convertEmptyToNull(_mailAddress);
    }

    /**
     * [set] MAIL_ADDRESS: {varchar(255)} <br>
     * メールアドレス
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] ADMIN_FLG: {varchar(255)} <br>
     * 管理職フラグ
     * @return The value of the column 'ADMIN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdminFlg() {
        checkSpecifiedProperty("adminFlg");
        return convertEmptyToNull(_adminFlg);
    }

    /**
     * [set] ADMIN_FLG: {varchar(255)} <br>
     * 管理職フラグ
     * @param adminFlg The value of the column 'ADMIN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdminFlg(String adminFlg) {
        registerModifiedProperty("adminFlg");
        _adminFlg = adminFlg;
    }

    /**
     * [get] COMPANY_UNIT_CD: {varchar(255)} <br>
     * 組織ユニットコード
     * @return The value of the column 'COMPANY_UNIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyUnitCd() {
        checkSpecifiedProperty("companyUnitCd");
        return convertEmptyToNull(_companyUnitCd);
    }

    /**
     * [set] COMPANY_UNIT_CD: {varchar(255)} <br>
     * 組織ユニットコード
     * @param companyUnitCd The value of the column 'COMPANY_UNIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyUnitCd(String companyUnitCd) {
        registerModifiedProperty("companyUnitCd");
        _companyUnitCd = companyUnitCd;
    }

    /**
     * [get] BIZ_SYSTEM_CD: {varchar(255)} <br>
     * 業務システムコード
     * @return The value of the column 'BIZ_SYSTEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBizSystemCd() {
        checkSpecifiedProperty("bizSystemCd");
        return convertEmptyToNull(_bizSystemCd);
    }

    /**
     * [set] BIZ_SYSTEM_CD: {varchar(255)} <br>
     * 業務システムコード
     * @param bizSystemCd The value of the column 'BIZ_SYSTEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBizSystemCd(String bizSystemCd) {
        registerModifiedProperty("bizSystemCd");
        _bizSystemCd = bizSystemCd;
    }

    /**
     * [get] BIZ_SYSTEM_NM: {varchar(255)} <br>
     * 業務システム名称
     * @return The value of the column 'BIZ_SYSTEM_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBizSystemNm() {
        checkSpecifiedProperty("bizSystemNm");
        return convertEmptyToNull(_bizSystemNm);
    }

    /**
     * [set] BIZ_SYSTEM_NM: {varchar(255)} <br>
     * 業務システム名称
     * @param bizSystemNm The value of the column 'BIZ_SYSTEM_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBizSystemNm(String bizSystemNm) {
        registerModifiedProperty("bizSystemNm");
        _bizSystemNm = bizSystemNm;
    }

    /**
     * [get] USER_ROLE_CD: {varchar(255)} <br>
     * ユーザロールコード
     * @return The value of the column 'USER_ROLE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserRoleCd() {
        checkSpecifiedProperty("userRoleCd");
        return convertEmptyToNull(_userRoleCd);
    }

    /**
     * [set] USER_ROLE_CD: {varchar(255)} <br>
     * ユーザロールコード
     * @param userRoleCd The value of the column 'USER_ROLE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserRoleCd(String userRoleCd) {
        registerModifiedProperty("userRoleCd");
        _userRoleCd = userRoleCd;
    }

    /**
     * [get] USER_ROLE_NM: {varchar(255)} <br>
     * ユーザロール名称
     * @return The value of the column 'USER_ROLE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserRoleNm() {
        checkSpecifiedProperty("userRoleNm");
        return convertEmptyToNull(_userRoleNm);
    }

    /**
     * [set] USER_ROLE_NM: {varchar(255)} <br>
     * ユーザロール名称
     * @param userRoleNm The value of the column 'USER_ROLE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserRoleNm(String userRoleNm) {
        registerModifiedProperty("userRoleNm");
        _userRoleNm = userRoleNm;
    }

    /**
     * [get] PLAN_COMPANY_CD: {varchar(255)} <br>
     * 販物用組織コード
     * @return The value of the column 'PLAN_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanCompanyCd() {
        checkSpecifiedProperty("planCompanyCd");
        return convertEmptyToNull(_planCompanyCd);
    }

    /**
     * [set] PLAN_COMPANY_CD: {varchar(255)} <br>
     * 販物用組織コード
     * @param planCompanyCd The value of the column 'PLAN_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanCompanyCd(String planCompanyCd) {
        registerModifiedProperty("planCompanyCd");
        _planCompanyCd = planCompanyCd;
    }

    /**
     * [get] WMS_COMPANY_CD: {varchar(255)} <br>
     * WMS用組織コード
     * @return The value of the column 'WMS_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsCompanyCd() {
        checkSpecifiedProperty("wmsCompanyCd");
        return convertEmptyToNull(_wmsCompanyCd);
    }

    /**
     * [set] WMS_COMPANY_CD: {varchar(255)} <br>
     * WMS用組織コード
     * @param wmsCompanyCd The value of the column 'WMS_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsCompanyCd(String wmsCompanyCd) {
        registerModifiedProperty("wmsCompanyCd");
        _wmsCompanyCd = wmsCompanyCd;
    }

    /**
     * [get] DLV_ROOT_COMPANY_CD: {varchar(255)} <br>
     * 配達・ルート管理用組織コード
     * @return The value of the column 'DLV_ROOT_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvRootCompanyCd() {
        checkSpecifiedProperty("dlvRootCompanyCd");
        return convertEmptyToNull(_dlvRootCompanyCd);
    }

    /**
     * [set] DLV_ROOT_COMPANY_CD: {varchar(255)} <br>
     * 配達・ルート管理用組織コード
     * @param dlvRootCompanyCd The value of the column 'DLV_ROOT_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvRootCompanyCd(String dlvRootCompanyCd) {
        registerModifiedProperty("dlvRootCompanyCd");
        _dlvRootCompanyCd = dlvRootCompanyCd;
    }

    /**
     * [get] SVF_COMPANY_CD: {varchar(255)} <br>
     * 帳票（SVF）用組織コード
     * @return The value of the column 'SVF_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSvfCompanyCd() {
        checkSpecifiedProperty("svfCompanyCd");
        return convertEmptyToNull(_svfCompanyCd);
    }

    /**
     * [set] SVF_COMPANY_CD: {varchar(255)} <br>
     * 帳票（SVF）用組織コード
     * @param svfCompanyCd The value of the column 'SVF_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSvfCompanyCd(String svfCompanyCd) {
        registerModifiedProperty("svfCompanyCd");
        _svfCompanyCd = svfCompanyCd;
    }

    /**
     * [get] KB_COMPANY_CD: {varchar(255)} <br>
     * 帳票（活文）用組織コード
     * @return The value of the column 'KB_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKbCompanyCd() {
        checkSpecifiedProperty("kbCompanyCd");
        return convertEmptyToNull(_kbCompanyCd);
    }

    /**
     * [set] KB_COMPANY_CD: {varchar(255)} <br>
     * 帳票（活文）用組織コード
     * @param kbCompanyCd The value of the column 'KB_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKbCompanyCd(String kbCompanyCd) {
        registerModifiedProperty("kbCompanyCd");
        _kbCompanyCd = kbCompanyCd;
    }

    /**
     * [get] ORDER_LOGIN_COMPANY_CD: {varchar(255)} <br>
     * WEB受注（代理ログイン）用組織コード
     * @return The value of the column 'ORDER_LOGIN_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderLoginCompanyCd() {
        checkSpecifiedProperty("orderLoginCompanyCd");
        return convertEmptyToNull(_orderLoginCompanyCd);
    }

    /**
     * [set] ORDER_LOGIN_COMPANY_CD: {varchar(255)} <br>
     * WEB受注（代理ログイン）用組織コード
     * @param orderLoginCompanyCd The value of the column 'ORDER_LOGIN_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderLoginCompanyCd(String orderLoginCompanyCd) {
        registerModifiedProperty("orderLoginCompanyCd");
        _orderLoginCompanyCd = orderLoginCompanyCd;
    }

    /**
     * [get] ORDER_OFFICE_COMPANY_CD: {varchar(255)} <br>
     * WEB受注（バックオフィス）用組織コード
     * @return The value of the column 'ORDER_OFFICE_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderOfficeCompanyCd() {
        checkSpecifiedProperty("orderOfficeCompanyCd");
        return convertEmptyToNull(_orderOfficeCompanyCd);
    }

    /**
     * [set] ORDER_OFFICE_COMPANY_CD: {varchar(255)} <br>
     * WEB受注（バックオフィス）用組織コード
     * @param orderOfficeCompanyCd The value of the column 'ORDER_OFFICE_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderOfficeCompanyCd(String orderOfficeCompanyCd) {
        registerModifiedProperty("orderOfficeCompanyCd");
        _orderOfficeCompanyCd = orderOfficeCompanyCd;
    }

    /**
     * [get] ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)} <br>
     * WEB受注（Smart edit）用組織コード
     * @return The value of the column 'ORDER_SMARTEDIT_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderSmarteditCompanyCd() {
        checkSpecifiedProperty("orderSmarteditCompanyCd");
        return convertEmptyToNull(_orderSmarteditCompanyCd);
    }

    /**
     * [set] ORDER_SMARTEDIT_COMPANY_CD: {varchar(255)} <br>
     * WEB受注（Smart edit）用組織コード
     * @param orderSmarteditCompanyCd The value of the column 'ORDER_SMARTEDIT_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderSmarteditCompanyCd(String orderSmarteditCompanyCd) {
        registerModifiedProperty("orderSmarteditCompanyCd");
        _orderSmarteditCompanyCd = orderSmarteditCompanyCd;
    }

    /**
     * [get] SUPANDDEM_TAX_COMPANY_CD: {varchar(255)} <br>
     * 需給保税用組織コード
     * @return The value of the column 'SUPANDDEM_TAX_COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupanddemTaxCompanyCd() {
        checkSpecifiedProperty("supanddemTaxCompanyCd");
        return convertEmptyToNull(_supanddemTaxCompanyCd);
    }

    /**
     * [set] SUPANDDEM_TAX_COMPANY_CD: {varchar(255)} <br>
     * 需給保税用組織コード
     * @param supanddemTaxCompanyCd The value of the column 'SUPANDDEM_TAX_COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupanddemTaxCompanyCd(String supanddemTaxCompanyCd) {
        registerModifiedProperty("supanddemTaxCompanyCd");
        _supanddemTaxCompanyCd = supanddemTaxCompanyCd;
    }

    /**
     * [get] VALID_FRDATEH: {varchar(255)} <br>
     * 有効開始年月日
     * @return The value of the column 'VALID_FRDATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getValidFrdateh() {
        checkSpecifiedProperty("validFrdateh");
        return convertEmptyToNull(_validFrdateh);
    }

    /**
     * [set] VALID_FRDATEH: {varchar(255)} <br>
     * 有効開始年月日
     * @param validFrdateh The value of the column 'VALID_FRDATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidFrdateh(String validFrdateh) {
        registerModifiedProperty("validFrdateh");
        _validFrdateh = validFrdateh;
    }

    /**
     * [get] VALID_TODATEH: {varchar(255)} <br>
     * 有効終了年月日
     * @return The value of the column 'VALID_TODATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getValidTodateh() {
        checkSpecifiedProperty("validTodateh");
        return convertEmptyToNull(_validTodateh);
    }

    /**
     * [set] VALID_TODATEH: {varchar(255)} <br>
     * 有効終了年月日
     * @param validTodateh The value of the column 'VALID_TODATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setValidTodateh(String validTodateh) {
        registerModifiedProperty("validTodateh");
        _validTodateh = validTodateh;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
