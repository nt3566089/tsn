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
 * The entity of M_MFMONTHCHG as TABLE. <br>
 * 月替り・デ変情報マスタ
 * <pre>
 * [primary-key]
 *     MFMONTHCHG_ID
 *
 * [column]
 *     MFMONTHCHG_ID, CLIENT_ID, CENTER_ID, SYSTEM_DT, PRODUCT_CD, SOTEDUNIT, LIMITDATE, DESIGNFLG, PICKLISTTYPE, SOTEDLOC, PICKLISTKEY, PICKLISTGNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFMONTHCHG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long mfmonthchgId = entity.getMfmonthchgId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String systemDt = entity.getSystemDt();
 * String productCd = entity.getProductCd();
 * String sotedunit = entity.getSotedunit();
 * String limitdate = entity.getLimitdate();
 * String designflg = entity.getDesignflg();
 * String picklisttype = entity.getPicklisttype();
 * String sotedloc = entity.getSotedloc();
 * Long picklistkey = entity.getPicklistkey();
 * Long picklistgno = entity.getPicklistgno();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMfmonthchgId(mfmonthchgId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setSystemDt(systemDt);
 * entity.setProductCd(productCd);
 * entity.setSotedunit(sotedunit);
 * entity.setLimitdate(limitdate);
 * entity.setDesignflg(designflg);
 * entity.setPicklisttype(picklisttype);
 * entity.setSotedloc(sotedloc);
 * entity.setPicklistkey(picklistkey);
 * entity.setPicklistgno(picklistgno);
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
public abstract class BsMMfmonthchg extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mfmonthchgId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** SYSTEM_DT: {NotNull, varchar(8)} */
    protected String _systemDt;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** SOTEDUNIT: {NotNull, varchar(30)} */
    protected String _sotedunit;

    /** LIMITDATE: {NotNull, varchar(8)} */
    protected String _limitdate;

    /** DESIGNFLG: {NotNull, varchar(30)} */
    protected String _designflg;

    /** PICKLISTTYPE: {varchar(30)} */
    protected String _picklisttype;

    /** SOTEDLOC: {varchar(30)} */
    protected String _sotedloc;

    /** PICKLISTKEY: {bigint(19)} */
    protected Long _picklistkey;

    /** PICKLISTGNO: {bigint(19)} */
    protected Long _picklistgno;

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
        return "M_MFMONTHCHG";
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
        if (_mfmonthchgId == null) { return false; }
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
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

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
        if (obj instanceof BsMMfmonthchg) {
            BsMMfmonthchg other = (BsMMfmonthchg)obj;
            if (!xSV(_mfmonthchgId, other._mfmonthchgId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfmonthchgId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfmonthchgId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_systemDt));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_sotedunit));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_designflg));
        sb.append(dm).append(xfND(_picklisttype));
        sb.append(dm).append(xfND(_sotedloc));
        sb.append(dm).append(xfND(_picklistkey));
        sb.append(dm).append(xfND(_picklistgno));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MMfmonthchg clone() {
        return (MMfmonthchg)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 月替り・デ変情報ID
     * @return The value of the column 'MFMONTHCHG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMfmonthchgId() {
        checkSpecifiedProperty("mfmonthchgId");
        return _mfmonthchgId;
    }

    /**
     * [set] MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 月替り・デ変情報ID
     * @param mfmonthchgId The value of the column 'MFMONTHCHG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMfmonthchgId(Long mfmonthchgId) {
        registerModifiedProperty("mfmonthchgId");
        _mfmonthchgId = mfmonthchgId;
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
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * 更新日付
     * @return The value of the column 'SYSTEM_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getSystemDt() {
        checkSpecifiedProperty("systemDt");
        return convertEmptyToNull(_systemDt);
    }

    /**
     * [set] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * 更新日付
     * @param systemDt The value of the column 'SYSTEM_DT'. (basically NotNull if update: for the constraint)
     */
    public void setSystemDt(String systemDt) {
        registerModifiedProperty("systemDt");
        _systemDt = systemDt;
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
     * [get] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (basically NotNull if selected: for the constraint)
     */
    public String getSotedunit() {
        checkSpecifiedProperty("sotedunit");
        return convertEmptyToNull(_sotedunit);
    }

    /**
     * [set] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (basically NotNull if update: for the constraint)
     */
    public void setSotedunit(String sotedunit) {
        registerModifiedProperty("sotedunit");
        _sotedunit = sotedunit;
    }

    /**
     * [get] LIMITDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (basically NotNull if update: for the constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] DESIGNFLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDesignflg() {
        checkSpecifiedProperty("designflg");
        return convertEmptyToNull(_designflg);
    }

    /**
     * [set] DESIGNFLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designflg The value of the column 'DESIGNFLG'. (basically NotNull if update: for the constraint)
     */
    public void setDesignflg(String designflg) {
        registerModifiedProperty("designflg");
        _designflg = designflg;
    }

    /**
     * [get] PICKLISTTYPE: {varchar(30)} <br>
     * 山出しタイプ
     * @return The value of the column 'PICKLISTTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicklisttype() {
        checkSpecifiedProperty("picklisttype");
        return convertEmptyToNull(_picklisttype);
    }

    /**
     * [set] PICKLISTTYPE: {varchar(30)} <br>
     * 山出しタイプ
     * @param picklisttype The value of the column 'PICKLISTTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklisttype(String picklisttype) {
        registerModifiedProperty("picklisttype");
        _picklisttype = picklisttype;
    }

    /**
     * [get] SOTEDLOC: {varchar(30)} <br>
     * 仕分ロケ
     * @return The value of the column 'SOTEDLOC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedloc() {
        checkSpecifiedProperty("sotedloc");
        return convertEmptyToNull(_sotedloc);
    }

    /**
     * [set] SOTEDLOC: {varchar(30)} <br>
     * 仕分ロケ
     * @param sotedloc The value of the column 'SOTEDLOC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedloc(String sotedloc) {
        registerModifiedProperty("sotedloc");
        _sotedloc = sotedloc;
    }

    /**
     * [get] PICKLISTKEY: {bigint(19)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICKLISTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicklistkey() {
        checkSpecifiedProperty("picklistkey");
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {bigint(19)} <br>
     * 山出しリストNo.
     * @param picklistkey The value of the column 'PICKLISTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklistkey(Long picklistkey) {
        registerModifiedProperty("picklistkey");
        _picklistkey = picklistkey;
    }

    /**
     * [get] PICKLISTGNO: {bigint(19)} <br>
     * 山出しリスト明細行No.
     * @return The value of the column 'PICKLISTGNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicklistgno() {
        checkSpecifiedProperty("picklistgno");
        return _picklistgno;
    }

    /**
     * [set] PICKLISTGNO: {bigint(19)} <br>
     * 山出しリスト明細行No.
     * @param picklistgno The value of the column 'PICKLISTGNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklistgno(Long picklistgno) {
        registerModifiedProperty("picklistgno");
        _picklistgno = picklistgno;
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
