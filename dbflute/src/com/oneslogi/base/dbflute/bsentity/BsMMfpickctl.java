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
 * The entity of M_MFPICKCTL as TABLE. <br>
 * 引当制御マスタ
 * <pre>
 * [primary-key]
 *     MFPICKCTL_ID
 *
 * [column]
 *     MFPICKCTL_ID, CLIENT_ID, PRODUCT_CD, PICKFRDATE, PICKTODATE, PICKRANK1, PICKRANK2, PICKRANK3, PICKRANK4, PICKRANK5, VALIDTYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFPICKCTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long mfpickctlId = entity.getMfpickctlId();
 * Long clientId = entity.getClientId();
 * String productCd = entity.getProductCd();
 * String pickfrdate = entity.getPickfrdate();
 * String picktodate = entity.getPicktodate();
 * String pickrank1 = entity.getPickrank1();
 * String pickrank2 = entity.getPickrank2();
 * String pickrank3 = entity.getPickrank3();
 * String pickrank4 = entity.getPickrank4();
 * String pickrank5 = entity.getPickrank5();
 * String validtype = entity.getValidtype();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMfpickctlId(mfpickctlId);
 * entity.setClientId(clientId);
 * entity.setProductCd(productCd);
 * entity.setPickfrdate(pickfrdate);
 * entity.setPicktodate(picktodate);
 * entity.setPickrank1(pickrank1);
 * entity.setPickrank2(pickrank2);
 * entity.setPickrank3(pickrank3);
 * entity.setPickrank4(pickrank4);
 * entity.setPickrank5(pickrank5);
 * entity.setValidtype(validtype);
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
public abstract class BsMMfpickctl extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mfpickctlId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** PICKFRDATE: {NotNull, varchar(8)} */
    protected String _pickfrdate;

    /** PICKTODATE: {NotNull, varchar(8)} */
    protected String _picktodate;

    /** PICKRANK1: {NotNull, varchar(30)} */
    protected String _pickrank1;

    /** PICKRANK2: {varchar(30)} */
    protected String _pickrank2;

    /** PICKRANK3: {varchar(30)} */
    protected String _pickrank3;

    /** PICKRANK4: {varchar(30)} */
    protected String _pickrank4;

    /** PICKRANK5: {varchar(30)} */
    protected String _pickrank5;

    /** VALIDTYPE: {NotNull, varchar(30)} */
    protected String _validtype;

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
        return "M_MFPICKCTL";
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
        if (_mfpickctlId == null) { return false; }
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
    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
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
        if (obj instanceof BsMMfpickctl) {
            BsMMfpickctl other = (BsMMfpickctl)obj;
            if (!xSV(_mfpickctlId, other._mfpickctlId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfpickctlId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfpickctlId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_pickfrdate));
        sb.append(dm).append(xfND(_picktodate));
        sb.append(dm).append(xfND(_pickrank1));
        sb.append(dm).append(xfND(_pickrank2));
        sb.append(dm).append(xfND(_pickrank3));
        sb.append(dm).append(xfND(_pickrank4));
        sb.append(dm).append(xfND(_pickrank5));
        sb.append(dm).append(xfND(_validtype));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MMfpickctl clone() {
        return (MMfpickctl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 引当制御ID
     * @return The value of the column 'MFPICKCTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMfpickctlId() {
        checkSpecifiedProperty("mfpickctlId");
        return _mfpickctlId;
    }

    /**
     * [set] MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 引当制御ID
     * @param mfpickctlId The value of the column 'MFPICKCTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMfpickctlId(Long mfpickctlId) {
        registerModifiedProperty("mfpickctlId");
        _mfpickctlId = mfpickctlId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PICKFRDATE: {NotNull, varchar(8)} <br>
     * 適用開始日
     * @return The value of the column 'PICKFRDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPickfrdate() {
        checkSpecifiedProperty("pickfrdate");
        return convertEmptyToNull(_pickfrdate);
    }

    /**
     * [set] PICKFRDATE: {NotNull, varchar(8)} <br>
     * 適用開始日
     * @param pickfrdate The value of the column 'PICKFRDATE'. (basically NotNull if update: for the constraint)
     */
    public void setPickfrdate(String pickfrdate) {
        registerModifiedProperty("pickfrdate");
        _pickfrdate = pickfrdate;
    }

    /**
     * [get] PICKTODATE: {NotNull, varchar(8)} <br>
     * 適用終了日
     * @return The value of the column 'PICKTODATE'. (basically NotNull if selected: for the constraint)
     */
    public String getPicktodate() {
        checkSpecifiedProperty("picktodate");
        return convertEmptyToNull(_picktodate);
    }

    /**
     * [set] PICKTODATE: {NotNull, varchar(8)} <br>
     * 適用終了日
     * @param picktodate The value of the column 'PICKTODATE'. (basically NotNull if update: for the constraint)
     */
    public void setPicktodate(String picktodate) {
        registerModifiedProperty("picktodate");
        _picktodate = picktodate;
    }

    /**
     * [get] PICKRANK1: {NotNull, varchar(30)} <br>
     * 引当順位１デザイン区分
     * @return The value of the column 'PICKRANK1'. (basically NotNull if selected: for the constraint)
     */
    public String getPickrank1() {
        checkSpecifiedProperty("pickrank1");
        return convertEmptyToNull(_pickrank1);
    }

    /**
     * [set] PICKRANK1: {NotNull, varchar(30)} <br>
     * 引当順位１デザイン区分
     * @param pickrank1 The value of the column 'PICKRANK1'. (basically NotNull if update: for the constraint)
     */
    public void setPickrank1(String pickrank1) {
        registerModifiedProperty("pickrank1");
        _pickrank1 = pickrank1;
    }

    /**
     * [get] PICKRANK2: {varchar(30)} <br>
     * 引当順位２デザイン区分
     * @return The value of the column 'PICKRANK2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank2() {
        checkSpecifiedProperty("pickrank2");
        return convertEmptyToNull(_pickrank2);
    }

    /**
     * [set] PICKRANK2: {varchar(30)} <br>
     * 引当順位２デザイン区分
     * @param pickrank2 The value of the column 'PICKRANK2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank2(String pickrank2) {
        registerModifiedProperty("pickrank2");
        _pickrank2 = pickrank2;
    }

    /**
     * [get] PICKRANK3: {varchar(30)} <br>
     * 引当順位３デザイン区分
     * @return The value of the column 'PICKRANK3'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank3() {
        checkSpecifiedProperty("pickrank3");
        return convertEmptyToNull(_pickrank3);
    }

    /**
     * [set] PICKRANK3: {varchar(30)} <br>
     * 引当順位３デザイン区分
     * @param pickrank3 The value of the column 'PICKRANK3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank3(String pickrank3) {
        registerModifiedProperty("pickrank3");
        _pickrank3 = pickrank3;
    }

    /**
     * [get] PICKRANK4: {varchar(30)} <br>
     * 引当順位４デザイン区分
     * @return The value of the column 'PICKRANK4'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank4() {
        checkSpecifiedProperty("pickrank4");
        return convertEmptyToNull(_pickrank4);
    }

    /**
     * [set] PICKRANK4: {varchar(30)} <br>
     * 引当順位４デザイン区分
     * @param pickrank4 The value of the column 'PICKRANK4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank4(String pickrank4) {
        registerModifiedProperty("pickrank4");
        _pickrank4 = pickrank4;
    }

    /**
     * [get] PICKRANK5: {varchar(30)} <br>
     * 引当順位５デザイン区分
     * @return The value of the column 'PICKRANK5'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickrank5() {
        checkSpecifiedProperty("pickrank5");
        return convertEmptyToNull(_pickrank5);
    }

    /**
     * [set] PICKRANK5: {varchar(30)} <br>
     * 引当順位５デザイン区分
     * @param pickrank5 The value of the column 'PICKRANK5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickrank5(String pickrank5) {
        registerModifiedProperty("pickrank5");
        _pickrank5 = pickrank5;
    }

    /**
     * [get] VALIDTYPE: {NotNull, varchar(30)} <br>
     * 有効区分
     * @return The value of the column 'VALIDTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getValidtype() {
        checkSpecifiedProperty("validtype");
        return convertEmptyToNull(_validtype);
    }

    /**
     * [set] VALIDTYPE: {NotNull, varchar(30)} <br>
     * 有効区分
     * @param validtype The value of the column 'VALIDTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setValidtype(String validtype) {
        registerModifiedProperty("validtype");
        _validtype = validtype;
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
