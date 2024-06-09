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
 * The entity of M_CLIENT_CENTER as TABLE. <br>
 * 荷主拠点マスタ
 * <pre>
 * [primary-key]
 *     CLIENT_CENTER_ID
 *
 * [column]
 *     CLIENT_CENTER_ID, CLIENT_ID, CENTER_ID, SYSTEM_DT, BATCH_PROGRESS_FLG, BEFORE_SYSTEM_DT, CUSTOMER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_CUSTOMER, B_CLASS_DTL(ByBatchProgressFlg), M_PARAM(AsOne)
 *
 * [referrer table]
 *     M_PARAM
 *
 * [foreign property]
 *     mCenter, mClient, mCustomer, bClassDtlByBatchProgressFlg, bClassDtlByDelFlg, mParamAsOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long clientCenterId = entity.getClientCenterId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String systemDt = entity.getSystemDt();
 * String batchProgressFlg = entity.getBatchProgressFlg();
 * String beforeSystemDt = entity.getBeforeSystemDt();
 * Long customerId = entity.getCustomerId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setClientCenterId(clientCenterId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setSystemDt(systemDt);
 * entity.setBatchProgressFlg(batchProgressFlg);
 * entity.setBeforeSystemDt(beforeSystemDt);
 * entity.setCustomerId(customerId);
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
public abstract class BsMClientCenter extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _clientCenterId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** SYSTEM_DT: {NotNull, varchar(8)} */
    protected String _systemDt;

    /** BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} */
    protected String _batchProgressFlg;

    /** BEFORE_SYSTEM_DT: {varchar(8)} */
    protected String _beforeSystemDt;

    /** CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _customerId;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "M_CLIENT_CENTER";
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
        if (_clientCenterId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param centerId : +UQ, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     */
    public void uniqueBy(Long clientId, Long centerId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("centerId");
        setClientId(clientId);setCenterId(centerId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of batchProgressFlg as the classification of BatchProgressFlg. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BatchProgressFlg getBatchProgressFlgAsBatchProgressFlg() {
        return CDef.BatchProgressFlg.codeOf(getBatchProgressFlg());
    }

    /**
     * Set the value of batchProgressFlg as the classification of BatchProgressFlg. <br>
     * BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setBatchProgressFlgAsBatchProgressFlg(CDef.BatchProgressFlg cdef) {
        setBatchProgressFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
     * Set the value of batchProgressFlg as $0 (0). <br>
     * $0: 非処理中
     */
    public void setBatchProgressFlg_$0() {
        setBatchProgressFlgAsBatchProgressFlg(CDef.BatchProgressFlg.$0);
    }

    /**
     * Set the value of batchProgressFlg as $1 (1). <br>
     * $1: 処理中
     */
    public void setBatchProgressFlg_$1() {
        setBatchProgressFlgAsBatchProgressFlg(CDef.BatchProgressFlg.$1);
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
     * Is the value of batchProgressFlg $0? <br>
     * $0: 非処理中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBatchProgressFlg$0() {
        CDef.BatchProgressFlg cdef = getBatchProgressFlgAsBatchProgressFlg();
        return cdef != null ? cdef.equals(CDef.BatchProgressFlg.$0) : false;
    }

    /**
     * Is the value of batchProgressFlg $1? <br>
     * $1: 処理中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBatchProgressFlg$1() {
        CDef.BatchProgressFlg cdef = getBatchProgressFlgAsBatchProgressFlg();
        return cdef != null ? cdef.equals(CDef.BatchProgressFlg.$1) : false;
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
     * Get the value of the column 'batchProgressFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getBatchProgressFlgName() {
        CDef.BatchProgressFlg cdef = getBatchProgressFlgAsBatchProgressFlg();
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

    /** M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** B_CLASS_DTL by my BATCH_PROGRESS_FLG, named 'BClassDtlByBatchProgressFlg'. */
    protected BClassDtl _bClassDtlByBatchProgressFlg;

    /**
     * [get] B_CLASS_DTL by my BATCH_PROGRESS_FLG, named 'BClassDtlByBatchProgressFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByBatchProgressFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByBatchProgressFlg() {
        return _bClassDtlByBatchProgressFlg;
    }

    /**
     * [set] B_CLASS_DTL by my BATCH_PROGRESS_FLG, named 'BClassDtlByBatchProgressFlg'.
     * @param bClassDtlByBatchProgressFlg The entity of foreign property 'BClassDtlByBatchProgressFlg'. (NullAllowed)
     */
    public void setBClassDtlByBatchProgressFlg(BClassDtl bClassDtlByBatchProgressFlg) {
        _bClassDtlByBatchProgressFlg = bClassDtlByBatchProgressFlg;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** M_PARAM by CLIENT_CENTER_ID, named 'MParamAsOne'. */
    protected MParam _mParamAsOne;

    /**
     * [get] M_PARAM by CLIENT_CENTER_ID, named 'MParamAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'MParamAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MParam getMParamAsOne() {
        return _mParamAsOne;
    }

    /**
     * [set] M_PARAM by CLIENT_CENTER_ID, named 'MParamAsOne'.
     * @param MParamAsOne The entity of foreign property(referrer-as-one) 'MParamAsOne'. (NullAllowed)
     */
    public void setMParamAsOne(MParam MParamAsOne) {
        _mParamAsOne = MParamAsOne;
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
        if (obj instanceof BsMClientCenter) {
            BsMClientCenter other = (BsMClientCenter)obj;
            if (!xSV(_clientCenterId, other._clientCenterId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientCenterId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_bClassDtlByBatchProgressFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByBatchProgressFlg, "bClassDtlByBatchProgressFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mParamAsOne != null)
        { sb.append(li).append(xbRDS(_mParamAsOne, "mParamAsOne")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientCenterId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_systemDt));
        sb.append(dm).append(xfND(_batchProgressFlg));
        sb.append(dm).append(xfND(_beforeSystemDt));
        sb.append(dm).append(xfND(_customerId));
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
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_bClassDtlByBatchProgressFlg != null)
        { sb.append(dm).append("bClassDtlByBatchProgressFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mParamAsOne != null)
        { sb.append(dm).append("mParamAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MClientCenter clone() {
        return (MClientCenter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主拠点ID
     * @return The value of the column 'CLIENT_CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientCenterId() {
        checkSpecifiedProperty("clientCenterId");
        return _clientCenterId;
    }

    /**
     * [set] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷主拠点ID
     * @param clientCenterId The value of the column 'CLIENT_CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientCenterId(Long clientCenterId) {
        registerModifiedProperty("clientCenterId");
        _clientCenterId = clientCenterId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * システム管理日付
     * @return The value of the column 'SYSTEM_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getSystemDt() {
        checkSpecifiedProperty("systemDt");
        return convertEmptyToNull(_systemDt);
    }

    /**
     * [set] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * システム管理日付
     * @param systemDt The value of the column 'SYSTEM_DT'. (basically NotNull if update: for the constraint)
     */
    public void setSystemDt(String systemDt) {
        registerModifiedProperty("systemDt");
        _systemDt = systemDt;
    }

    /**
     * [get] BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @return The value of the column 'BATCH_PROGRESS_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getBatchProgressFlg() {
        checkSpecifiedProperty("batchProgressFlg");
        return convertEmptyToNull(_batchProgressFlg);
    }

    /**
     * [set] BATCH_PROGRESS_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=BatchProgressFlg} <br>
     * バッチ処理中フラグ
     * @param batchProgressFlg The value of the column 'BATCH_PROGRESS_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setBatchProgressFlg(String batchProgressFlg) {
        registerModifiedProperty("batchProgressFlg");
        _batchProgressFlg = batchProgressFlg;
    }

    /**
     * [get] BEFORE_SYSTEM_DT: {varchar(8)} <br>
     * 前回システム管理日付
     * @return The value of the column 'BEFORE_SYSTEM_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getBeforeSystemDt() {
        checkSpecifiedProperty("beforeSystemDt");
        return convertEmptyToNull(_beforeSystemDt);
    }

    /**
     * [set] BEFORE_SYSTEM_DT: {varchar(8)} <br>
     * 前回システム管理日付
     * @param beforeSystemDt The value of the column 'BEFORE_SYSTEM_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBeforeSystemDt(String beforeSystemDt) {
        registerModifiedProperty("beforeSystemDt");
        _beforeSystemDt = beforeSystemDt;
    }

    /**
     * [get] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 拠点取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 拠点取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
