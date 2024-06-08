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
 * The entity of W_ZIP_INPUT as TABLE. <br>
 * 郵便番号マスタ取込ワーク
 * <pre>
 * [primary-key]
 *     ZIP_INPUT_ID
 *
 * [column]
 *     ZIP_INPUT_ID, PUBLIC_CD, ZIP_CD_5, ZIP_CD, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, ADDRESS1, ADDRESS2, ADDRESS3, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_INPUT_ID
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
 * Long zipInputId = entity.getZipInputId();
 * String publicCd = entity.getPublicCd();
 * String zipCd5 = entity.getZipCd5();
 * String zipCd = entity.getZipCd();
 * String addressKn1 = entity.getAddressKn1();
 * String addressKn2 = entity.getAddressKn2();
 * String addressKn3 = entity.getAddressKn3();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String flg1 = entity.getFlg1();
 * String flg2 = entity.getFlg2();
 * String flg3 = entity.getFlg3();
 * String flg4 = entity.getFlg4();
 * String updType = entity.getUpdType();
 * String reasonType = entity.getReasonType();
 * Long lineNo = entity.getLineNo();
 * String workFlg = entity.getWorkFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMsg = entity.getErrorMsg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setZipInputId(zipInputId);
 * entity.setPublicCd(publicCd);
 * entity.setZipCd5(zipCd5);
 * entity.setZipCd(zipCd);
 * entity.setAddressKn1(addressKn1);
 * entity.setAddressKn2(addressKn2);
 * entity.setAddressKn3(addressKn3);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setFlg1(flg1);
 * entity.setFlg2(flg2);
 * entity.setFlg3(flg3);
 * entity.setFlg4(flg4);
 * entity.setUpdType(updType);
 * entity.setReasonType(reasonType);
 * entity.setLineNo(lineNo);
 * entity.setWorkFlg(workFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMsg(errorMsg);
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
public abstract class BsWZipInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _zipInputId;

    /** PUBLIC_CD: {varchar(255)} */
    protected String _publicCd;

    /** ZIP_CD_5: {varchar(255)} */
    protected String _zipCd5;

    /** ZIP_CD: {varchar(255)} */
    protected String _zipCd;

    /** ADDRESS_KN1: {varchar(255)} */
    protected String _addressKn1;

    /** ADDRESS_KN2: {varchar(255)} */
    protected String _addressKn2;

    /** ADDRESS_KN3: {varchar(255)} */
    protected String _addressKn3;

    /** ADDRESS1: {varchar(255)} */
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** FLG1: {varchar(255)} */
    protected String _flg1;

    /** FLG2: {varchar(255)} */
    protected String _flg2;

    /** FLG3: {varchar(255)} */
    protected String _flg3;

    /** FLG4: {varchar(255)} */
    protected String _flg4;

    /** UPD_TYPE: {varchar(255)} */
    protected String _updType;

    /** REASON_TYPE: {varchar(255)} */
    protected String _reasonType;

    /** LINE_NO: {bigint(19)} */
    protected Long _lineNo;

    /** WORK_FLG: {char(1)} */
    protected String _workFlg;

    /** ERROR_FLG: {char(1)} */
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    protected String _errorMsg;

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
        return "W_ZIP_INPUT";
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
        if (_zipInputId == null) { return false; }
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
        if (obj instanceof BsWZipInput) {
            BsWZipInput other = (BsWZipInput)obj;
            if (!xSV(_zipInputId, other._zipInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _zipInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_zipInputId));
        sb.append(dm).append(xfND(_publicCd));
        sb.append(dm).append(xfND(_zipCd5));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_addressKn1));
        sb.append(dm).append(xfND(_addressKn2));
        sb.append(dm).append(xfND(_addressKn3));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_flg1));
        sb.append(dm).append(xfND(_flg2));
        sb.append(dm).append(xfND(_flg3));
        sb.append(dm).append(xfND(_flg4));
        sb.append(dm).append(xfND(_updType));
        sb.append(dm).append(xfND(_reasonType));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMsg));
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
    public WZipInput clone() {
        return (WZipInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ取込ワークID
     * @return The value of the column 'ZIP_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getZipInputId() {
        checkSpecifiedProperty("zipInputId");
        return _zipInputId;
    }

    /**
     * [set] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ取込ワークID
     * @param zipInputId The value of the column 'ZIP_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZipInputId(Long zipInputId) {
        registerModifiedProperty("zipInputId");
        _zipInputId = zipInputId;
    }

    /**
     * [get] PUBLIC_CD: {varchar(255)} <br>
     * 全国地方公共団体CD
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPublicCd() {
        checkSpecifiedProperty("publicCd");
        return convertEmptyToNull(_publicCd);
    }

    /**
     * [set] PUBLIC_CD: {varchar(255)} <br>
     * 全国地方公共団体CD
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublicCd(String publicCd) {
        registerModifiedProperty("publicCd");
        _publicCd = publicCd;
    }

    /**
     * [get] ZIP_CD_5: {varchar(255)} <br>
     * 旧郵便番号
     * @return The value of the column 'ZIP_CD_5'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd5() {
        checkSpecifiedProperty("zipCd5");
        return convertEmptyToNull(_zipCd5);
    }

    /**
     * [set] ZIP_CD_5: {varchar(255)} <br>
     * 旧郵便番号
     * @param zipCd5 The value of the column 'ZIP_CD_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd5(String zipCd5) {
        registerModifiedProperty("zipCd5");
        _zipCd5 = zipCd5;
    }

    /**
     * [get] ZIP_CD: {varchar(255)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {varchar(255)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県名カナ
     * @return The value of the column 'ADDRESS_KN1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn1() {
        checkSpecifiedProperty("addressKn1");
        return convertEmptyToNull(_addressKn1);
    }

    /**
     * [set] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県名カナ
     * @param addressKn1 The value of the column 'ADDRESS_KN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn1(String addressKn1) {
        registerModifiedProperty("addressKn1");
        _addressKn1 = addressKn1;
    }

    /**
     * [get] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村名カナ
     * @return The value of the column 'ADDRESS_KN2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn2() {
        checkSpecifiedProperty("addressKn2");
        return convertEmptyToNull(_addressKn2);
    }

    /**
     * [set] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村名カナ
     * @param addressKn2 The value of the column 'ADDRESS_KN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn2(String addressKn2) {
        registerModifiedProperty("addressKn2");
        _addressKn2 = addressKn2;
    }

    /**
     * [get] ADDRESS_KN3: {varchar(255)} <br>
     * 町域名カナ
     * @return The value of the column 'ADDRESS_KN3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn3() {
        checkSpecifiedProperty("addressKn3");
        return convertEmptyToNull(_addressKn3);
    }

    /**
     * [set] ADDRESS_KN3: {varchar(255)} <br>
     * 町域名カナ
     * @param addressKn3 The value of the column 'ADDRESS_KN3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn3(String addressKn3) {
        registerModifiedProperty("addressKn3");
        _addressKn3 = addressKn3;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 都道府県名
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 都道府県名
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 市区町村名
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 市区町村名
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 町域名
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 町域名
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] FLG1: {varchar(255)} <br>
     * フラグ１
     * @return The value of the column 'FLG1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg1() {
        checkSpecifiedProperty("flg1");
        return convertEmptyToNull(_flg1);
    }

    /**
     * [set] FLG1: {varchar(255)} <br>
     * フラグ１
     * @param flg1 The value of the column 'FLG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg1(String flg1) {
        registerModifiedProperty("flg1");
        _flg1 = flg1;
    }

    /**
     * [get] FLG2: {varchar(255)} <br>
     * フラグ２
     * @return The value of the column 'FLG2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg2() {
        checkSpecifiedProperty("flg2");
        return convertEmptyToNull(_flg2);
    }

    /**
     * [set] FLG2: {varchar(255)} <br>
     * フラグ２
     * @param flg2 The value of the column 'FLG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg2(String flg2) {
        registerModifiedProperty("flg2");
        _flg2 = flg2;
    }

    /**
     * [get] FLG3: {varchar(255)} <br>
     * フラグ３
     * @return The value of the column 'FLG3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg3() {
        checkSpecifiedProperty("flg3");
        return convertEmptyToNull(_flg3);
    }

    /**
     * [set] FLG3: {varchar(255)} <br>
     * フラグ３
     * @param flg3 The value of the column 'FLG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg3(String flg3) {
        registerModifiedProperty("flg3");
        _flg3 = flg3;
    }

    /**
     * [get] FLG4: {varchar(255)} <br>
     * フラグ４
     * @return The value of the column 'FLG4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg4() {
        checkSpecifiedProperty("flg4");
        return convertEmptyToNull(_flg4);
    }

    /**
     * [set] FLG4: {varchar(255)} <br>
     * フラグ４
     * @param flg4 The value of the column 'FLG4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg4(String flg4) {
        registerModifiedProperty("flg4");
        _flg4 = flg4;
    }

    /**
     * [get] UPD_TYPE: {varchar(255)} <br>
     * 更新の表示
     * @return The value of the column 'UPD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdType() {
        checkSpecifiedProperty("updType");
        return convertEmptyToNull(_updType);
    }

    /**
     * [set] UPD_TYPE: {varchar(255)} <br>
     * 更新の表示
     * @param updType The value of the column 'UPD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdType(String updType) {
        registerModifiedProperty("updType");
        _updType = updType;
    }

    /**
     * [get] REASON_TYPE: {varchar(255)} <br>
     * 変更理由
     * @return The value of the column 'REASON_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReasonType() {
        checkSpecifiedProperty("reasonType");
        return convertEmptyToNull(_reasonType);
    }

    /**
     * [set] REASON_TYPE: {varchar(255)} <br>
     * 変更理由
     * @param reasonType The value of the column 'REASON_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReasonType(String reasonType) {
        registerModifiedProperty("reasonType");
        _reasonType = reasonType;
    }

    /**
     * [get] LINE_NO: {bigint(19)} <br>
     * 行NO
     * @return The value of the column 'LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {bigint(19)} <br>
     * 行NO
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMsg() {
        checkSpecifiedProperty("errorMsg");
        return convertEmptyToNull(_errorMsg);
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMsg(String errorMsg) {
        registerModifiedProperty("errorMsg");
        _errorMsg = errorMsg;
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
