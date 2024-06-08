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
 * The entity of B_USER_AUTH as TABLE. <br>
 * ユーザ認証マスタ
 * <pre>
 * [primary-key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, PASSWORD, SALT, PASSWORD_RESET, PASSWORD_MODIFIED_DATE, LAST_LOGIN_DATE, LAST_FAILED_LOGIN_DATE, FAILED_LOGIN_ATTEMPTS, LOCKOUT, LOCKOUT_DATE, AVAILABLE_START_DATE, AVAILABLE_END_DATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, B_CLASS_DTL(ByPasswordReset)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, bClassDtlByPasswordReset, bClassDtlByLockout
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userId = entity.getUserId();
 * String password = entity.getPassword();
 * String salt = entity.getSalt();
 * String passwordReset = entity.getPasswordReset();
 * java.sql.Timestamp passwordModifiedDate = entity.getPasswordModifiedDate();
 * java.sql.Timestamp lastLoginDate = entity.getLastLoginDate();
 * java.sql.Timestamp lastFailedLoginDate = entity.getLastFailedLoginDate();
 * Long failedLoginAttempts = entity.getFailedLoginAttempts();
 * String lockout = entity.getLockout();
 * java.sql.Timestamp lockoutDate = entity.getLockoutDate();
 * java.sql.Timestamp availableStartDate = entity.getAvailableStartDate();
 * java.sql.Timestamp availableEndDate = entity.getAvailableEndDate();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setUserId(userId);
 * entity.setPassword(password);
 * entity.setSalt(salt);
 * entity.setPasswordReset(passwordReset);
 * entity.setPasswordModifiedDate(passwordModifiedDate);
 * entity.setLastLoginDate(lastLoginDate);
 * entity.setLastFailedLoginDate(lastFailedLoginDate);
 * entity.setFailedLoginAttempts(failedLoginAttempts);
 * entity.setLockout(lockout);
 * entity.setLockoutDate(lockoutDate);
 * entity.setAvailableStartDate(availableStartDate);
 * entity.setAvailableEndDate(availableEndDate);
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
public abstract class BsBUserAuth extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_ID: {PK, NotNull, bigint(19), FK to B_USER} */
    protected Long _userId;

    /** PASSWORD: {varchar(255)} */
    protected String _password;

    /** SALT: {UQ, NotNull, varchar(100)} */
    protected String _salt;

    /** PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} */
    protected String _passwordReset;

    /** PASSWORD_MODIFIED_DATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _passwordModifiedDate;

    /** LAST_LOGIN_DATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _lastLoginDate;

    /** LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _lastFailedLoginDate;

    /** FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]} */
    protected Long _failedLoginAttempts;

    /** LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} */
    protected String _lockout;

    /** LOCKOUT_DATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _lockoutDate;

    /** AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _availableStartDate;

    /** AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _availableEndDate;

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
        return "B_USER_AUTH";
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
        if (_userId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param salt : UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(String salt) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("salt");
        setSalt(salt);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of passwordReset as the classification of PasswordReset. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PasswordReset getPasswordResetAsPasswordReset() {
        return CDef.PasswordReset.codeOf(getPasswordReset());
    }

    /**
     * Set the value of passwordReset as the classification of PasswordReset. <br>
     * PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPasswordResetAsPasswordReset(CDef.PasswordReset cdef) {
        setPasswordReset(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of lockout as the classification of Lockout. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Lockout getLockoutAsLockout() {
        return CDef.Lockout.codeOf(getLockout());
    }

    /**
     * Set the value of lockout as the classification of Lockout. <br>
     * LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLockoutAsLockout(CDef.Lockout cdef) {
        setLockout(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of passwordReset as $0 (0). <br>
     * $0: 強制しない
     */
    public void setPasswordReset_$0() {
        setPasswordResetAsPasswordReset(CDef.PasswordReset.$0);
    }

    /**
     * Set the value of passwordReset as $1 (1). <br>
     * $1: 強制する
     */
    public void setPasswordReset_$1() {
        setPasswordResetAsPasswordReset(CDef.PasswordReset.$1);
    }

    /**
     * Set the value of lockout as $0 (0). <br>
     * $0: アンロック
     */
    public void setLockout_$0() {
        setLockoutAsLockout(CDef.Lockout.$0);
    }

    /**
     * Set the value of lockout as $1 (1). <br>
     * $1: ロックアウト
     */
    public void setLockout_$1() {
        setLockoutAsLockout(CDef.Lockout.$1);
    }

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
     * Is the value of passwordReset $0? <br>
     * $0: 強制しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPasswordReset$0() {
        CDef.PasswordReset cdef = getPasswordResetAsPasswordReset();
        return cdef != null ? cdef.equals(CDef.PasswordReset.$0) : false;
    }

    /**
     * Is the value of passwordReset $1? <br>
     * $1: 強制する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPasswordReset$1() {
        CDef.PasswordReset cdef = getPasswordResetAsPasswordReset();
        return cdef != null ? cdef.equals(CDef.PasswordReset.$1) : false;
    }

    /**
     * Is the value of lockout $0? <br>
     * $0: アンロック
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLockout$0() {
        CDef.Lockout cdef = getLockoutAsLockout();
        return cdef != null ? cdef.equals(CDef.Lockout.$0) : false;
    }

    /**
     * Is the value of lockout $1? <br>
     * $1: ロックアウト
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLockout$1() {
        CDef.Lockout cdef = getLockoutAsLockout();
        return cdef != null ? cdef.equals(CDef.Lockout.$1) : false;
    }

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
     * Get the value of the column 'passwordReset' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPasswordResetName() {
        CDef.PasswordReset cdef = getPasswordResetAsPasswordReset();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'lockout' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLockoutName() {
        CDef.Lockout cdef = getLockoutAsLockout();
        return cdef != null ? cdef.name() : null;
    }

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
    /** B_USER by my USER_ID, named 'BUser'. */
    protected BUser _bUser;

    /**
     * [get] B_USER by my USER_ID, named 'BUser'. <br>
     * @return The entity of foreign property 'BUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUser() {
        return _bUser;
    }

    /**
     * [set] B_USER by my USER_ID, named 'BUser'.
     * @param bUser The entity of foreign property 'BUser'. (NullAllowed)
     */
    public void setBUser(BUser bUser) {
        _bUser = bUser;
    }

    /** B_CLASS_DTL by my PASSWORD_RESET, named 'BClassDtlByPasswordReset'. */
    protected BClassDtl _bClassDtlByPasswordReset;

    /**
     * [get] B_CLASS_DTL by my PASSWORD_RESET, named 'BClassDtlByPasswordReset'. <br>
     * @return The entity of foreign property 'BClassDtlByPasswordReset'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPasswordReset() {
        return _bClassDtlByPasswordReset;
    }

    /**
     * [set] B_CLASS_DTL by my PASSWORD_RESET, named 'BClassDtlByPasswordReset'.
     * @param bClassDtlByPasswordReset The entity of foreign property 'BClassDtlByPasswordReset'. (NullAllowed)
     */
    public void setBClassDtlByPasswordReset(BClassDtl bClassDtlByPasswordReset) {
        _bClassDtlByPasswordReset = bClassDtlByPasswordReset;
    }

    /** B_CLASS_DTL by my LOCKOUT, named 'BClassDtlByLockout'. */
    protected BClassDtl _bClassDtlByLockout;

    /**
     * [get] B_CLASS_DTL by my LOCKOUT, named 'BClassDtlByLockout'. <br>
     * @return The entity of foreign property 'BClassDtlByLockout'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLockout() {
        return _bClassDtlByLockout;
    }

    /**
     * [set] B_CLASS_DTL by my LOCKOUT, named 'BClassDtlByLockout'.
     * @param bClassDtlByLockout The entity of foreign property 'BClassDtlByLockout'. (NullAllowed)
     */
    public void setBClassDtlByLockout(BClassDtl bClassDtlByLockout) {
        _bClassDtlByLockout = bClassDtlByLockout;
    }

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
        if (obj instanceof BsBUserAuth) {
            BsBUserAuth other = (BsBUserAuth)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUser != null)
        { sb.append(li).append(xbRDS(_bUser, "bUser")); }
        if (_bClassDtlByPasswordReset != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPasswordReset, "bClassDtlByPasswordReset")); }
        if (_bClassDtlByLockout != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLockout, "bClassDtlByLockout")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_salt));
        sb.append(dm).append(xfND(_passwordReset));
        sb.append(dm).append(xfND(_passwordModifiedDate));
        sb.append(dm).append(xfND(_lastLoginDate));
        sb.append(dm).append(xfND(_lastFailedLoginDate));
        sb.append(dm).append(xfND(_failedLoginAttempts));
        sb.append(dm).append(xfND(_lockout));
        sb.append(dm).append(xfND(_lockoutDate));
        sb.append(dm).append(xfND(_availableStartDate));
        sb.append(dm).append(xfND(_availableEndDate));
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
        StringBuilder sb = new StringBuilder();
        if (_bUser != null)
        { sb.append(dm).append("bUser"); }
        if (_bClassDtlByPasswordReset != null)
        { sb.append(dm).append("bClassDtlByPasswordReset"); }
        if (_bClassDtlByLockout != null)
        { sb.append(dm).append("bClassDtlByLockout"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BUserAuth clone() {
        return (BUserAuth)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, NotNull, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, NotNull, bigint(19), FK to B_USER} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] PASSWORD: {varchar(255)} <br>
     * パスワード
     * @return The value of the column 'PASSWORD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return convertEmptyToNull(_password);
    }

    /**
     * [set] PASSWORD: {varchar(255)} <br>
     * パスワード
     * @param password The value of the column 'PASSWORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] SALT: {UQ, NotNull, varchar(100)} <br>
     * ソルト
     * @return The value of the column 'SALT'. (basically NotNull if selected: for the constraint)
     */
    public String getSalt() {
        checkSpecifiedProperty("salt");
        return convertEmptyToNull(_salt);
    }

    /**
     * [set] SALT: {UQ, NotNull, varchar(100)} <br>
     * ソルト
     * @param salt The value of the column 'SALT'. (basically NotNull if update: for the constraint)
     */
    public void setSalt(String salt) {
        registerModifiedProperty("salt");
        _salt = salt;
    }

    /**
     * [get] PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @return The value of the column 'PASSWORD_RESET'. (basically NotNull if selected: for the constraint)
     */
    public String getPasswordReset() {
        checkSpecifiedProperty("passwordReset");
        return convertEmptyToNull(_passwordReset);
    }

    /**
     * [set] PASSWORD_RESET: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PasswordReset} <br>
     * パスワードリセット
     * @param passwordReset The value of the column 'PASSWORD_RESET'. (basically NotNull if update: for the constraint)
     */
    public void setPasswordReset(String passwordReset) {
        registerModifiedProperty("passwordReset");
        _passwordReset = passwordReset;
    }

    /**
     * [get] PASSWORD_MODIFIED_DATE: {datetime2(26, 6)} <br>
     * パスワード変更日時
     * @return The value of the column 'PASSWORD_MODIFIED_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPasswordModifiedDate() {
        checkSpecifiedProperty("passwordModifiedDate");
        return _passwordModifiedDate;
    }

    /**
     * [set] PASSWORD_MODIFIED_DATE: {datetime2(26, 6)} <br>
     * パスワード変更日時
     * @param passwordModifiedDate The value of the column 'PASSWORD_MODIFIED_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPasswordModifiedDate(java.sql.Timestamp passwordModifiedDate) {
        registerModifiedProperty("passwordModifiedDate");
        _passwordModifiedDate = passwordModifiedDate;
    }

    /**
     * [get] LAST_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン日時
     * @return The value of the column 'LAST_LOGIN_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getLastLoginDate() {
        checkSpecifiedProperty("lastLoginDate");
        return _lastLoginDate;
    }

    /**
     * [set] LAST_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン日時
     * @param lastLoginDate The value of the column 'LAST_LOGIN_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastLoginDate(java.sql.Timestamp lastLoginDate) {
        registerModifiedProperty("lastLoginDate");
        _lastLoginDate = lastLoginDate;
    }

    /**
     * [get] LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン失敗日時
     * @return The value of the column 'LAST_FAILED_LOGIN_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getLastFailedLoginDate() {
        checkSpecifiedProperty("lastFailedLoginDate");
        return _lastFailedLoginDate;
    }

    /**
     * [set] LAST_FAILED_LOGIN_DATE: {datetime2(26, 6)} <br>
     * 最終ログイン失敗日時
     * @param lastFailedLoginDate The value of the column 'LAST_FAILED_LOGIN_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastFailedLoginDate(java.sql.Timestamp lastFailedLoginDate) {
        registerModifiedProperty("lastFailedLoginDate");
        _lastFailedLoginDate = lastFailedLoginDate;
    }

    /**
     * [get] FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]} <br>
     * ログイン失敗回数
     * @return The value of the column 'FAILED_LOGIN_ATTEMPTS'. (basically NotNull if selected: for the constraint)
     */
    public Long getFailedLoginAttempts() {
        checkSpecifiedProperty("failedLoginAttempts");
        return _failedLoginAttempts;
    }

    /**
     * [set] FAILED_LOGIN_ATTEMPTS: {NotNull, bigint(19), default=[(0)]} <br>
     * ログイン失敗回数
     * @param failedLoginAttempts The value of the column 'FAILED_LOGIN_ATTEMPTS'. (basically NotNull if update: for the constraint)
     */
    public void setFailedLoginAttempts(Long failedLoginAttempts) {
        registerModifiedProperty("failedLoginAttempts");
        _failedLoginAttempts = failedLoginAttempts;
    }

    /**
     * [get] LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @return The value of the column 'LOCKOUT'. (basically NotNull if selected: for the constraint)
     */
    public String getLockout() {
        checkSpecifiedProperty("lockout");
        return convertEmptyToNull(_lockout);
    }

    /**
     * [set] LOCKOUT: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Lockout} <br>
     * ロックアウト
     * @param lockout The value of the column 'LOCKOUT'. (basically NotNull if update: for the constraint)
     */
    public void setLockout(String lockout) {
        registerModifiedProperty("lockout");
        _lockout = lockout;
    }

    /**
     * [get] LOCKOUT_DATE: {datetime2(26, 6)} <br>
     * ロックアウト日時
     * @return The value of the column 'LOCKOUT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getLockoutDate() {
        checkSpecifiedProperty("lockoutDate");
        return _lockoutDate;
    }

    /**
     * [set] LOCKOUT_DATE: {datetime2(26, 6)} <br>
     * ロックアウト日時
     * @param lockoutDate The value of the column 'LOCKOUT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLockoutDate(java.sql.Timestamp lockoutDate) {
        registerModifiedProperty("lockoutDate");
        _lockoutDate = lockoutDate;
    }

    /**
     * [get] AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能開始日
     * @return The value of the column 'AVAILABLE_START_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getAvailableStartDate() {
        checkSpecifiedProperty("availableStartDate");
        return _availableStartDate;
    }

    /**
     * [set] AVAILABLE_START_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能開始日
     * @param availableStartDate The value of the column 'AVAILABLE_START_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setAvailableStartDate(java.sql.Timestamp availableStartDate) {
        registerModifiedProperty("availableStartDate");
        _availableStartDate = availableStartDate;
    }

    /**
     * [get] AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能終了日
     * @return The value of the column 'AVAILABLE_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getAvailableEndDate() {
        checkSpecifiedProperty("availableEndDate");
        return _availableEndDate;
    }

    /**
     * [set] AVAILABLE_END_DATE: {NotNull, datetime2(26, 6)} <br>
     * 利用可能終了日
     * @param availableEndDate The value of the column 'AVAILABLE_END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setAvailableEndDate(java.sql.Timestamp availableEndDate) {
        registerModifiedProperty("availableEndDate");
        _availableEndDate = availableEndDate;
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
