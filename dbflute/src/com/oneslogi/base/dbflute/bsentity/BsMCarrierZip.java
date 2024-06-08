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
 * The entity of M_CARRIER_ZIP as TABLE. <br>
 * 運送業者郵便番号マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_ZIP_ID
 *
 * [column]
 *     CARRIER_ZIP_ID, COMMON_CARRIER_ID, ZIP_ID, ARRIVAL_STORE_CD, ARRIVAL_STORE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_COMMON_CARRIER, M_ZIP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCommonCarrier, mZip
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long carrierZipId = entity.getCarrierZipId();
 * Long commonCarrierId = entity.getCommonCarrierId();
 * Long zipId = entity.getZipId();
 * String arrivalStoreCd = entity.getArrivalStoreCd();
 * String arrivalStoreNm = entity.getArrivalStoreNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCarrierZipId(carrierZipId);
 * entity.setCommonCarrierId(commonCarrierId);
 * entity.setZipId(zipId);
 * entity.setArrivalStoreCd(arrivalStoreCd);
 * entity.setArrivalStoreNm(arrivalStoreNm);
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
public abstract class BsMCarrierZip extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _carrierZipId;

    /** COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER} */
    protected Long _commonCarrierId;

    /** ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP} */
    protected Long _zipId;

    /** ARRIVAL_STORE_CD: {NotNull, varchar(30)} */
    protected String _arrivalStoreCd;

    /** ARRIVAL_STORE_NM: {varchar(255)} */
    protected String _arrivalStoreNm;

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
        return "M_CARRIER_ZIP";
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
        if (_carrierZipId == null) { return false; }
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
    /** M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'. */
    protected MCommonCarrier _mCommonCarrier;

    /**
     * [get] M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'. <br>
     * @return The entity of foreign property 'MCommonCarrier'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCommonCarrier getMCommonCarrier() {
        return _mCommonCarrier;
    }

    /**
     * [set] M_COMMON_CARRIER by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @param mCommonCarrier The entity of foreign property 'MCommonCarrier'. (NullAllowed)
     */
    public void setMCommonCarrier(MCommonCarrier mCommonCarrier) {
        _mCommonCarrier = mCommonCarrier;
    }

    /** M_ZIP by my ZIP_ID, named 'MZip'. */
    protected MZip _mZip;

    /**
     * [get] M_ZIP by my ZIP_ID, named 'MZip'. <br>
     * @return The entity of foreign property 'MZip'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MZip getMZip() {
        return _mZip;
    }

    /**
     * [set] M_ZIP by my ZIP_ID, named 'MZip'.
     * @param mZip The entity of foreign property 'MZip'. (NullAllowed)
     */
    public void setMZip(MZip mZip) {
        _mZip = mZip;
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
        if (obj instanceof BsMCarrierZip) {
            BsMCarrierZip other = (BsMCarrierZip)obj;
            if (!xSV(_carrierZipId, other._carrierZipId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _carrierZipId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCommonCarrier != null)
        { sb.append(li).append(xbRDS(_mCommonCarrier, "mCommonCarrier")); }
        if (_mZip != null)
        { sb.append(li).append(xbRDS(_mZip, "mZip")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_carrierZipId));
        sb.append(dm).append(xfND(_commonCarrierId));
        sb.append(dm).append(xfND(_zipId));
        sb.append(dm).append(xfND(_arrivalStoreCd));
        sb.append(dm).append(xfND(_arrivalStoreNm));
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
        if (_mCommonCarrier != null)
        { sb.append(dm).append("mCommonCarrier"); }
        if (_mZip != null)
        { sb.append(dm).append("mZip"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCarrierZip clone() {
        return (MCarrierZip)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 運送業者郵便番号ID
     * @return The value of the column 'CARRIER_ZIP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCarrierZipId() {
        checkSpecifiedProperty("carrierZipId");
        return _carrierZipId;
    }

    /**
     * [set] CARRIER_ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 運送業者郵便番号ID
     * @param carrierZipId The value of the column 'CARRIER_ZIP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCarrierZipId(Long carrierZipId) {
        registerModifiedProperty("carrierZipId");
        _carrierZipId = carrierZipId;
    }

    /**
     * [get] COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER} <br>
     * 共通運送業者ID
     * @return The value of the column 'COMMON_CARRIER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCommonCarrierId() {
        checkSpecifiedProperty("commonCarrierId");
        return _commonCarrierId;
    }

    /**
     * [set] COMMON_CARRIER_ID: {IX, NotNull, bigint(19), FK to M_COMMON_CARRIER} <br>
     * 共通運送業者ID
     * @param commonCarrierId The value of the column 'COMMON_CARRIER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCommonCarrierId(Long commonCarrierId) {
        registerModifiedProperty("commonCarrierId");
        _commonCarrierId = commonCarrierId;
    }

    /**
     * [get] ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP} <br>
     * 郵便番号ID
     * @return The value of the column 'ZIP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getZipId() {
        checkSpecifiedProperty("zipId");
        return _zipId;
    }

    /**
     * [set] ZIP_ID: {IX, NotNull, bigint(19), FK to M_ZIP} <br>
     * 郵便番号ID
     * @param zipId The value of the column 'ZIP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZipId(Long zipId) {
        registerModifiedProperty("zipId");
        _zipId = zipId;
    }

    /**
     * [get] ARRIVAL_STORE_CD: {NotNull, varchar(30)} <br>
     * 着店CD
     * @return The value of the column 'ARRIVAL_STORE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getArrivalStoreCd() {
        checkSpecifiedProperty("arrivalStoreCd");
        return convertEmptyToNull(_arrivalStoreCd);
    }

    /**
     * [set] ARRIVAL_STORE_CD: {NotNull, varchar(30)} <br>
     * 着店CD
     * @param arrivalStoreCd The value of the column 'ARRIVAL_STORE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setArrivalStoreCd(String arrivalStoreCd) {
        registerModifiedProperty("arrivalStoreCd");
        _arrivalStoreCd = arrivalStoreCd;
    }

    /**
     * [get] ARRIVAL_STORE_NM: {varchar(255)} <br>
     * 着店名称
     * @return The value of the column 'ARRIVAL_STORE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalStoreNm() {
        checkSpecifiedProperty("arrivalStoreNm");
        return convertEmptyToNull(_arrivalStoreNm);
    }

    /**
     * [set] ARRIVAL_STORE_NM: {varchar(255)} <br>
     * 着店名称
     * @param arrivalStoreNm The value of the column 'ARRIVAL_STORE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalStoreNm(String arrivalStoreNm) {
        registerModifiedProperty("arrivalStoreNm");
        _arrivalStoreNm = arrivalStoreNm;
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
