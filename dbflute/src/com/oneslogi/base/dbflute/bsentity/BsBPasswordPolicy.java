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
 * The entity of B_PASSWORD_POLICY as TABLE. <br>
 * パスワードポリシーマスタ
 * <pre>
 * [primary-key]
 *     PASSWORD_POLICY_ID
 *
 * [column]
 *     PASSWORD_POLICY_ID, PASSWORD_POLICY_NM, FIRST_CHANGE_CONTROL, MIN_LENGTH, MIN_ALPHA, MIN_LOWER_CASE, MIN_UPPER_CASE, MIN_NUMBERS, MIN_SYMBOL, MAX_AGE, MAX_FAILURE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PASSWORD_POLICY_ID
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
 * Long passwordPolicyId = entity.getPasswordPolicyId();
 * String passwordPolicyNm = entity.getPasswordPolicyNm();
 * String firstChangeControl = entity.getFirstChangeControl();
 * Long minLength = entity.getMinLength();
 * Long minAlpha = entity.getMinAlpha();
 * Long minLowerCase = entity.getMinLowerCase();
 * Long minUpperCase = entity.getMinUpperCase();
 * Long minNumbers = entity.getMinNumbers();
 * Long minSymbol = entity.getMinSymbol();
 * Long maxAge = entity.getMaxAge();
 * Long maxFailure = entity.getMaxFailure();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPasswordPolicyId(passwordPolicyId);
 * entity.setPasswordPolicyNm(passwordPolicyNm);
 * entity.setFirstChangeControl(firstChangeControl);
 * entity.setMinLength(minLength);
 * entity.setMinAlpha(minAlpha);
 * entity.setMinLowerCase(minLowerCase);
 * entity.setMinUpperCase(minUpperCase);
 * entity.setMinNumbers(minNumbers);
 * entity.setMinSymbol(minSymbol);
 * entity.setMaxAge(maxAge);
 * entity.setMaxFailure(maxFailure);
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
public abstract class BsBPasswordPolicy extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _passwordPolicyId;

    /** PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} */
    protected String _passwordPolicyNm;

    /** FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} */
    protected String _firstChangeControl;

    /** MIN_LENGTH: {NotNull, bigint(19), default=[(0)]} */
    protected Long _minLength;

    /** MIN_ALPHA: {NotNull, bigint(19), default=[(0)]} */
    protected Long _minAlpha;

    /** MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _minLowerCase;

    /** MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _minUpperCase;

    /** MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]} */
    protected Long _minNumbers;

    /** MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]} */
    protected Long _minSymbol;

    /** MAX_AGE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _maxAge;

    /** MAX_FAILURE: {NotNull, bigint(19), default=[(0)]} */
    protected Long _maxFailure;

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
        return "B_PASSWORD_POLICY";
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
        if (_passwordPolicyId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param passwordPolicyNm : UQ, NotNull, varchar(60). (NotNull)
     */
    public void uniqueBy(String passwordPolicyNm) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("passwordPolicyNm");
        setPasswordPolicyNm(passwordPolicyNm);
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
        if (obj instanceof BsBPasswordPolicy) {
            BsBPasswordPolicy other = (BsBPasswordPolicy)obj;
            if (!xSV(_passwordPolicyId, other._passwordPolicyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _passwordPolicyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_passwordPolicyId));
        sb.append(dm).append(xfND(_passwordPolicyNm));
        sb.append(dm).append(xfND(_firstChangeControl));
        sb.append(dm).append(xfND(_minLength));
        sb.append(dm).append(xfND(_minAlpha));
        sb.append(dm).append(xfND(_minLowerCase));
        sb.append(dm).append(xfND(_minUpperCase));
        sb.append(dm).append(xfND(_minNumbers));
        sb.append(dm).append(xfND(_minSymbol));
        sb.append(dm).append(xfND(_maxAge));
        sb.append(dm).append(xfND(_maxFailure));
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
    public BPasswordPolicy clone() {
        return (BPasswordPolicy)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パスワードポリシーID
     * @return The value of the column 'PASSWORD_POLICY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPasswordPolicyId() {
        checkSpecifiedProperty("passwordPolicyId");
        return _passwordPolicyId;
    }

    /**
     * [set] PASSWORD_POLICY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パスワードポリシーID
     * @param passwordPolicyId The value of the column 'PASSWORD_POLICY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPasswordPolicyId(Long passwordPolicyId) {
        registerModifiedProperty("passwordPolicyId");
        _passwordPolicyId = passwordPolicyId;
    }

    /**
     * [get] PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} <br>
     * パスワードポリシー名称
     * @return The value of the column 'PASSWORD_POLICY_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getPasswordPolicyNm() {
        checkSpecifiedProperty("passwordPolicyNm");
        return convertEmptyToNull(_passwordPolicyNm);
    }

    /**
     * [set] PASSWORD_POLICY_NM: {UQ, NotNull, varchar(60)} <br>
     * パスワードポリシー名称
     * @param passwordPolicyNm The value of the column 'PASSWORD_POLICY_NM'. (basically NotNull if update: for the constraint)
     */
    public void setPasswordPolicyNm(String passwordPolicyNm) {
        registerModifiedProperty("passwordPolicyNm");
        _passwordPolicyNm = passwordPolicyNm;
    }

    /**
     * [get] FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} <br>
     * 初回変更制御
     * @return The value of the column 'FIRST_CHANGE_CONTROL'. (basically NotNull if selected: for the constraint)
     */
    public String getFirstChangeControl() {
        checkSpecifiedProperty("firstChangeControl");
        return convertEmptyToNull(_firstChangeControl);
    }

    /**
     * [set] FIRST_CHANGE_CONTROL: {NotNull, varchar(30), default=[00]} <br>
     * 初回変更制御
     * @param firstChangeControl The value of the column 'FIRST_CHANGE_CONTROL'. (basically NotNull if update: for the constraint)
     */
    public void setFirstChangeControl(String firstChangeControl) {
        registerModifiedProperty("firstChangeControl");
        _firstChangeControl = firstChangeControl;
    }

    /**
     * [get] MIN_LENGTH: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小桁数
     * @return The value of the column 'MIN_LENGTH'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinLength() {
        checkSpecifiedProperty("minLength");
        return _minLength;
    }

    /**
     * [set] MIN_LENGTH: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小桁数
     * @param minLength The value of the column 'MIN_LENGTH'. (basically NotNull if update: for the constraint)
     */
    public void setMinLength(Long minLength) {
        registerModifiedProperty("minLength");
        _minLength = minLength;
    }

    /**
     * [get] MIN_ALPHA: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小英字桁数
     * @return The value of the column 'MIN_ALPHA'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinAlpha() {
        checkSpecifiedProperty("minAlpha");
        return _minAlpha;
    }

    /**
     * [set] MIN_ALPHA: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小英字桁数
     * @param minAlpha The value of the column 'MIN_ALPHA'. (basically NotNull if update: for the constraint)
     */
    public void setMinAlpha(Long minAlpha) {
        registerModifiedProperty("minAlpha");
        _minAlpha = minAlpha;
    }

    /**
     * [get] MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小小文字桁数
     * @return The value of the column 'MIN_LOWER_CASE'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinLowerCase() {
        checkSpecifiedProperty("minLowerCase");
        return _minLowerCase;
    }

    /**
     * [set] MIN_LOWER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小小文字桁数
     * @param minLowerCase The value of the column 'MIN_LOWER_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setMinLowerCase(Long minLowerCase) {
        registerModifiedProperty("minLowerCase");
        _minLowerCase = minLowerCase;
    }

    /**
     * [get] MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小大文字桁数
     * @return The value of the column 'MIN_UPPER_CASE'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinUpperCase() {
        checkSpecifiedProperty("minUpperCase");
        return _minUpperCase;
    }

    /**
     * [set] MIN_UPPER_CASE: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小大文字桁数
     * @param minUpperCase The value of the column 'MIN_UPPER_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setMinUpperCase(Long minUpperCase) {
        registerModifiedProperty("minUpperCase");
        _minUpperCase = minUpperCase;
    }

    /**
     * [get] MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小数字桁数
     * @return The value of the column 'MIN_NUMBERS'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinNumbers() {
        checkSpecifiedProperty("minNumbers");
        return _minNumbers;
    }

    /**
     * [set] MIN_NUMBERS: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小数字桁数
     * @param minNumbers The value of the column 'MIN_NUMBERS'. (basically NotNull if update: for the constraint)
     */
    public void setMinNumbers(Long minNumbers) {
        registerModifiedProperty("minNumbers");
        _minNumbers = minNumbers;
    }

    /**
     * [get] MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小記号桁数
     * @return The value of the column 'MIN_SYMBOL'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinSymbol() {
        checkSpecifiedProperty("minSymbol");
        return _minSymbol;
    }

    /**
     * [set] MIN_SYMBOL: {NotNull, bigint(19), default=[(0)]} <br>
     * 最小記号桁数
     * @param minSymbol The value of the column 'MIN_SYMBOL'. (basically NotNull if update: for the constraint)
     */
    public void setMinSymbol(Long minSymbol) {
        registerModifiedProperty("minSymbol");
        _minSymbol = minSymbol;
    }

    /**
     * [get] MAX_AGE: {NotNull, bigint(19), default=[(0)]} <br>
     * 有効期限
     * @return The value of the column 'MAX_AGE'. (basically NotNull if selected: for the constraint)
     */
    public Long getMaxAge() {
        checkSpecifiedProperty("maxAge");
        return _maxAge;
    }

    /**
     * [set] MAX_AGE: {NotNull, bigint(19), default=[(0)]} <br>
     * 有効期限
     * @param maxAge The value of the column 'MAX_AGE'. (basically NotNull if update: for the constraint)
     */
    public void setMaxAge(Long maxAge) {
        registerModifiedProperty("maxAge");
        _maxAge = maxAge;
    }

    /**
     * [get] MAX_FAILURE: {NotNull, bigint(19), default=[(0)]} <br>
     * 失敗回数
     * @return The value of the column 'MAX_FAILURE'. (basically NotNull if selected: for the constraint)
     */
    public Long getMaxFailure() {
        checkSpecifiedProperty("maxFailure");
        return _maxFailure;
    }

    /**
     * [set] MAX_FAILURE: {NotNull, bigint(19), default=[(0)]} <br>
     * 失敗回数
     * @param maxFailure The value of the column 'MAX_FAILURE'. (basically NotNull if update: for the constraint)
     */
    public void setMaxFailure(Long maxFailure) {
        registerModifiedProperty("maxFailure");
        _maxFailure = maxFailure;
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
