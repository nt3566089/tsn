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
 * The entity of B_NUMBERING as TABLE. <br>
 * 採番マスタ
 * <pre>
 * [primary-key]
 *     NUMBERING_ID
 *
 * [column]
 *     NUMBERING_ID, BIZ_CD, BIZ_NM, LENGTH, FIXED_VALUE, FIXED_DT_FORMAT, PRESENT_NUMBER, INC_NUMBER, MIN_NUMBER, MAX_NUMBER, CHECK_DIGIT, SYSTEM_TYPE, CASH_COUNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NUMBERING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByCheckDigit)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bClassDtlByCheckDigit
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long numberingId = entity.getNumberingId();
 * String bizCd = entity.getBizCd();
 * String bizNm = entity.getBizNm();
 * Long length = entity.getLength();
 * String fixedValue = entity.getFixedValue();
 * String fixedDtFormat = entity.getFixedDtFormat();
 * Long presentNumber = entity.getPresentNumber();
 * Long incNumber = entity.getIncNumber();
 * Long minNumber = entity.getMinNumber();
 * Long maxNumber = entity.getMaxNumber();
 * String checkDigit = entity.getCheckDigit();
 * String systemType = entity.getSystemType();
 * Long cashCount = entity.getCashCount();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setNumberingId(numberingId);
 * entity.setBizCd(bizCd);
 * entity.setBizNm(bizNm);
 * entity.setLength(length);
 * entity.setFixedValue(fixedValue);
 * entity.setFixedDtFormat(fixedDtFormat);
 * entity.setPresentNumber(presentNumber);
 * entity.setIncNumber(incNumber);
 * entity.setMinNumber(minNumber);
 * entity.setMaxNumber(maxNumber);
 * entity.setCheckDigit(checkDigit);
 * entity.setSystemType(systemType);
 * entity.setCashCount(cashCount);
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
public abstract class BsBNumbering extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NUMBERING_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _numberingId;

    /** BIZ_CD: {UQ, NotNull, varchar(30)} */
    protected String _bizCd;

    /** BIZ_NM: {NotNull, varchar(60)} */
    protected String _bizNm;

    /** LENGTH: {NotNull, bigint(19)} */
    protected Long _length;

    /** FIXED_VALUE: {varchar(30)} */
    protected String _fixedValue;

    /** FIXED_DT_FORMAT: {varchar(30)} */
    protected String _fixedDtFormat;

    /** PRESENT_NUMBER: {NotNull, bigint(19)} */
    protected Long _presentNumber;

    /** INC_NUMBER: {NotNull, bigint(19)} */
    protected Long _incNumber;

    /** MIN_NUMBER: {NotNull, bigint(19)} */
    protected Long _minNumber;

    /** MAX_NUMBER: {NotNull, bigint(19)} */
    protected Long _maxNumber;

    /** CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} */
    protected String _checkDigit;

    /** SYSTEM_TYPE: {varchar(30)} */
    protected String _systemType;

    /** CASH_COUNT: {bigint(19), default=[(0)]} */
    protected Long _cashCount;

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
        return "B_NUMBERING";
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
        if (_numberingId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param bizCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String bizCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("bizCd");
        setBizCd(bizCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of checkDigit as the classification of CheckDigit. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CheckDigit getCheckDigitAsCheckDigit() {
        return CDef.CheckDigit.codeOf(getCheckDigit());
    }

    /**
     * Set the value of checkDigit as the classification of CheckDigit. <br>
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCheckDigitAsCheckDigit(CDef.CheckDigit cdef) {
        setCheckDigit(cdef != null ? cdef.code() : null);
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
     * Set the value of checkDigit as $0 (0). <br>
     * $0: チェックディジット無
     */
    public void setCheckDigit_$0() {
        setCheckDigitAsCheckDigit(CDef.CheckDigit.$0);
    }

    /**
     * Set the value of checkDigit as $7 (7). <br>
     * $7: 7DR方式
     */
    public void setCheckDigit_$7() {
        setCheckDigitAsCheckDigit(CDef.CheckDigit.$7);
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
     * Is the value of checkDigit $0? <br>
     * $0: チェックディジット無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCheckDigit$0() {
        CDef.CheckDigit cdef = getCheckDigitAsCheckDigit();
        return cdef != null ? cdef.equals(CDef.CheckDigit.$0) : false;
    }

    /**
     * Is the value of checkDigit $7? <br>
     * $7: 7DR方式
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCheckDigit$7() {
        CDef.CheckDigit cdef = getCheckDigitAsCheckDigit();
        return cdef != null ? cdef.equals(CDef.CheckDigit.$7) : false;
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
     * Get the value of the column 'checkDigit' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCheckDigitName() {
        CDef.CheckDigit cdef = getCheckDigitAsCheckDigit();
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
    /** B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'. */
    protected BClassDtl _bClassDtlByCheckDigit;

    /**
     * [get] B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'. <br>
     * @return The entity of foreign property 'BClassDtlByCheckDigit'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCheckDigit() {
        return _bClassDtlByCheckDigit;
    }

    /**
     * [set] B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'.
     * @param bClassDtlByCheckDigit The entity of foreign property 'BClassDtlByCheckDigit'. (NullAllowed)
     */
    public void setBClassDtlByCheckDigit(BClassDtl bClassDtlByCheckDigit) {
        _bClassDtlByCheckDigit = bClassDtlByCheckDigit;
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
        if (obj instanceof BsBNumbering) {
            BsBNumbering other = (BsBNumbering)obj;
            if (!xSV(_numberingId, other._numberingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _numberingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByCheckDigit != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCheckDigit, "bClassDtlByCheckDigit")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_numberingId));
        sb.append(dm).append(xfND(_bizCd));
        sb.append(dm).append(xfND(_bizNm));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_fixedValue));
        sb.append(dm).append(xfND(_fixedDtFormat));
        sb.append(dm).append(xfND(_presentNumber));
        sb.append(dm).append(xfND(_incNumber));
        sb.append(dm).append(xfND(_minNumber));
        sb.append(dm).append(xfND(_maxNumber));
        sb.append(dm).append(xfND(_checkDigit));
        sb.append(dm).append(xfND(_systemType));
        sb.append(dm).append(xfND(_cashCount));
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
        if (_bClassDtlByCheckDigit != null)
        { sb.append(dm).append("bClassDtlByCheckDigit"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BNumbering clone() {
        return (BNumbering)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NUMBERING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 採番ID
     * @return The value of the column 'NUMBERING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNumberingId() {
        checkSpecifiedProperty("numberingId");
        return _numberingId;
    }

    /**
     * [set] NUMBERING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 採番ID
     * @param numberingId The value of the column 'NUMBERING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNumberingId(Long numberingId) {
        registerModifiedProperty("numberingId");
        _numberingId = numberingId;
    }

    /**
     * [get] BIZ_CD: {UQ, NotNull, varchar(30)} <br>
     * 業務CD
     * @return The value of the column 'BIZ_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getBizCd() {
        checkSpecifiedProperty("bizCd");
        return convertEmptyToNull(_bizCd);
    }

    /**
     * [set] BIZ_CD: {UQ, NotNull, varchar(30)} <br>
     * 業務CD
     * @param bizCd The value of the column 'BIZ_CD'. (basically NotNull if update: for the constraint)
     */
    public void setBizCd(String bizCd) {
        registerModifiedProperty("bizCd");
        _bizCd = bizCd;
    }

    /**
     * [get] BIZ_NM: {NotNull, varchar(60)} <br>
     * 業務名称
     * @return The value of the column 'BIZ_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getBizNm() {
        checkSpecifiedProperty("bizNm");
        return convertEmptyToNull(_bizNm);
    }

    /**
     * [set] BIZ_NM: {NotNull, varchar(60)} <br>
     * 業務名称
     * @param bizNm The value of the column 'BIZ_NM'. (basically NotNull if update: for the constraint)
     */
    public void setBizNm(String bizNm) {
        registerModifiedProperty("bizNm");
        _bizNm = bizNm;
    }

    /**
     * [get] LENGTH: {NotNull, bigint(19)} <br>
     * 桁数
     * @return The value of the column 'LENGTH'. (basically NotNull if selected: for the constraint)
     */
    public Long getLength() {
        checkSpecifiedProperty("length");
        return _length;
    }

    /**
     * [set] LENGTH: {NotNull, bigint(19)} <br>
     * 桁数
     * @param length The value of the column 'LENGTH'. (basically NotNull if update: for the constraint)
     */
    public void setLength(Long length) {
        registerModifiedProperty("length");
        _length = length;
    }

    /**
     * [get] FIXED_VALUE: {varchar(30)} <br>
     * 固定値
     * @return The value of the column 'FIXED_VALUE'. (NullAllowed even if selected: for no constraint)
     */
    public String getFixedValue() {
        checkSpecifiedProperty("fixedValue");
        return convertEmptyToNull(_fixedValue);
    }

    /**
     * [set] FIXED_VALUE: {varchar(30)} <br>
     * 固定値
     * @param fixedValue The value of the column 'FIXED_VALUE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixedValue(String fixedValue) {
        registerModifiedProperty("fixedValue");
        _fixedValue = fixedValue;
    }

    /**
     * [get] FIXED_DT_FORMAT: {varchar(30)} <br>
     * 固定日付フォーマット
     * @return The value of the column 'FIXED_DT_FORMAT'. (NullAllowed even if selected: for no constraint)
     */
    public String getFixedDtFormat() {
        checkSpecifiedProperty("fixedDtFormat");
        return convertEmptyToNull(_fixedDtFormat);
    }

    /**
     * [set] FIXED_DT_FORMAT: {varchar(30)} <br>
     * 固定日付フォーマット
     * @param fixedDtFormat The value of the column 'FIXED_DT_FORMAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixedDtFormat(String fixedDtFormat) {
        registerModifiedProperty("fixedDtFormat");
        _fixedDtFormat = fixedDtFormat;
    }

    /**
     * [get] PRESENT_NUMBER: {NotNull, bigint(19)} <br>
     * 現在値
     * @return The value of the column 'PRESENT_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public Long getPresentNumber() {
        checkSpecifiedProperty("presentNumber");
        return _presentNumber;
    }

    /**
     * [set] PRESENT_NUMBER: {NotNull, bigint(19)} <br>
     * 現在値
     * @param presentNumber The value of the column 'PRESENT_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setPresentNumber(Long presentNumber) {
        registerModifiedProperty("presentNumber");
        _presentNumber = presentNumber;
    }

    /**
     * [get] INC_NUMBER: {NotNull, bigint(19)} <br>
     * 増分値
     * @return The value of the column 'INC_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public Long getIncNumber() {
        checkSpecifiedProperty("incNumber");
        return _incNumber;
    }

    /**
     * [set] INC_NUMBER: {NotNull, bigint(19)} <br>
     * 増分値
     * @param incNumber The value of the column 'INC_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setIncNumber(Long incNumber) {
        registerModifiedProperty("incNumber");
        _incNumber = incNumber;
    }

    /**
     * [get] MIN_NUMBER: {NotNull, bigint(19)} <br>
     * 最小値
     * @return The value of the column 'MIN_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public Long getMinNumber() {
        checkSpecifiedProperty("minNumber");
        return _minNumber;
    }

    /**
     * [set] MIN_NUMBER: {NotNull, bigint(19)} <br>
     * 最小値
     * @param minNumber The value of the column 'MIN_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setMinNumber(Long minNumber) {
        registerModifiedProperty("minNumber");
        _minNumber = minNumber;
    }

    /**
     * [get] MAX_NUMBER: {NotNull, bigint(19)} <br>
     * 最大値
     * @return The value of the column 'MAX_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public Long getMaxNumber() {
        checkSpecifiedProperty("maxNumber");
        return _maxNumber;
    }

    /**
     * [set] MAX_NUMBER: {NotNull, bigint(19)} <br>
     * 最大値
     * @param maxNumber The value of the column 'MAX_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setMaxNumber(Long maxNumber) {
        registerModifiedProperty("maxNumber");
        _maxNumber = maxNumber;
    }

    /**
     * [get] CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @return The value of the column 'CHECK_DIGIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCheckDigit() {
        checkSpecifiedProperty("checkDigit");
        return convertEmptyToNull(_checkDigit);
    }

    /**
     * [set] CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param checkDigit The value of the column 'CHECK_DIGIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCheckDigit(String checkDigit) {
        registerModifiedProperty("checkDigit");
        _checkDigit = checkDigit;
    }

    /**
     * [get] SYSTEM_TYPE: {varchar(30)} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSystemType() {
        checkSpecifiedProperty("systemType");
        return convertEmptyToNull(_systemType);
    }

    /**
     * [set] SYSTEM_TYPE: {varchar(30)} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSystemType(String systemType) {
        registerModifiedProperty("systemType");
        _systemType = systemType;
    }

    /**
     * [get] CASH_COUNT: {bigint(19), default=[(0)]} <br>
     * キャッシュ数
     * @return The value of the column 'CASH_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCashCount() {
        checkSpecifiedProperty("cashCount");
        return _cashCount;
    }

    /**
     * [set] CASH_COUNT: {bigint(19), default=[(0)]} <br>
     * キャッシュ数
     * @param cashCount The value of the column 'CASH_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCashCount(Long cashCount) {
        registerModifiedProperty("cashCount");
        _cashCount = cashCount;
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
