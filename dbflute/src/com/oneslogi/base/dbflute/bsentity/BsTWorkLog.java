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
 * The entity of T_WORK_LOG as TABLE. <br>
 * 作業実績
 * <pre>
 * [primary-key]
 *     WORK_LOG_ID
 *
 * [column]
 *     WORK_LOG_ID, CLIENT_CD, CENTER_CD, USER_CD, WORK_CD, WORK_DT, WORK_START_DT, WORK_END_DT, WORK_QTY, TRACE_ITEM, MAC_ADDRESS, WORK_STATUS, WORK_LOG_OUT_FLG, WORK_LOG_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByWorkStatus)
 *
 * [referrer table]
 *     T_WORK_DATA
 *
 * [foreign property]
 *     bClassDtlByWorkStatus, bClassDtlByWorkLogOutFlg
 *
 * [referrer property]
 *     tWorkDataList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long workLogId = entity.getWorkLogId();
 * String clientCd = entity.getClientCd();
 * String centerCd = entity.getCenterCd();
 * String userCd = entity.getUserCd();
 * String workCd = entity.getWorkCd();
 * String workDt = entity.getWorkDt();
 * java.sql.Timestamp workStartDt = entity.getWorkStartDt();
 * java.sql.Timestamp workEndDt = entity.getWorkEndDt();
 * java.math.BigDecimal workQty = entity.getWorkQty();
 * String traceItem = entity.getTraceItem();
 * String macAddress = entity.getMacAddress();
 * String workStatus = entity.getWorkStatus();
 * String workLogOutFlg = entity.getWorkLogOutFlg();
 * java.sql.Timestamp workLogOutDt = entity.getWorkLogOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWorkLogId(workLogId);
 * entity.setClientCd(clientCd);
 * entity.setCenterCd(centerCd);
 * entity.setUserCd(userCd);
 * entity.setWorkCd(workCd);
 * entity.setWorkDt(workDt);
 * entity.setWorkStartDt(workStartDt);
 * entity.setWorkEndDt(workEndDt);
 * entity.setWorkQty(workQty);
 * entity.setTraceItem(traceItem);
 * entity.setMacAddress(macAddress);
 * entity.setWorkStatus(workStatus);
 * entity.setWorkLogOutFlg(workLogOutFlg);
 * entity.setWorkLogOutDt(workLogOutDt);
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
public abstract class BsTWorkLog extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WORK_LOG_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _workLogId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** WORK_CD: {varchar(30)} */
    protected String _workCd;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** WORK_START_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _workEndDt;

    /** WORK_QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _workQty;

    /** TRACE_ITEM: {varchar(255)} */
    protected String _traceItem;

    /** MAC_ADDRESS: {varchar(60)} */
    protected String _macAddress;

    /** WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus} */
    protected String _workStatus;

    /** WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} */
    protected String _workLogOutFlg;

    /** WORK_LOG_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _workLogOutDt;

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
        return "T_WORK_LOG";
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
        if (_workLogId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of workStatus as the classification of WorkStatus. <br>
     * WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus} <br>
     * 作業ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.WorkStatus getWorkStatusAsWorkStatus() {
        return CDef.WorkStatus.codeOf(getWorkStatus());
    }

    /**
     * Set the value of workStatus as the classification of WorkStatus. <br>
     * WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus} <br>
     * 作業ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setWorkStatusAsWorkStatus(CDef.WorkStatus cdef) {
        setWorkStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of workLogOutFlg as the classification of WorkLogOutFlg. <br>
     * WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} <br>
     * 作業実績出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.WorkLogOutFlg getWorkLogOutFlgAsWorkLogOutFlg() {
        return CDef.WorkLogOutFlg.codeOf(getWorkLogOutFlg());
    }

    /**
     * Set the value of workLogOutFlg as the classification of WorkLogOutFlg. <br>
     * WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} <br>
     * 作業実績出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setWorkLogOutFlgAsWorkLogOutFlg(CDef.WorkLogOutFlg cdef) {
        setWorkLogOutFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of workStatus as $01 (01). <br>
     * $01: 作業中
     */
    public void setWorkStatus_$01() {
        setWorkStatusAsWorkStatus(CDef.WorkStatus.$01);
    }

    /**
     * Set the value of workStatus as $02 (02). <br>
     * $02: 正常終了
     */
    public void setWorkStatus_$02() {
        setWorkStatusAsWorkStatus(CDef.WorkStatus.$02);
    }

    /**
     * Set the value of workStatus as $03 (03). <br>
     * $03: 基盤強制終了
     */
    public void setWorkStatus_$03() {
        setWorkStatusAsWorkStatus(CDef.WorkStatus.$03);
    }

    /**
     * Set the value of workLogOutFlg as $0 (0). <br>
     * $0: 未出力
     */
    public void setWorkLogOutFlg_$0() {
        setWorkLogOutFlgAsWorkLogOutFlg(CDef.WorkLogOutFlg.$0);
    }

    /**
     * Set the value of workLogOutFlg as $1 (1). <br>
     * $1: 出力済
     */
    public void setWorkLogOutFlg_$1() {
        setWorkLogOutFlgAsWorkLogOutFlg(CDef.WorkLogOutFlg.$1);
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
     * Is the value of workStatus $01? <br>
     * $01: 作業中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWorkStatus$01() {
        CDef.WorkStatus cdef = getWorkStatusAsWorkStatus();
        return cdef != null ? cdef.equals(CDef.WorkStatus.$01) : false;
    }

    /**
     * Is the value of workStatus $02? <br>
     * $02: 正常終了
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWorkStatus$02() {
        CDef.WorkStatus cdef = getWorkStatusAsWorkStatus();
        return cdef != null ? cdef.equals(CDef.WorkStatus.$02) : false;
    }

    /**
     * Is the value of workStatus $03? <br>
     * $03: 基盤強制終了
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWorkStatus$03() {
        CDef.WorkStatus cdef = getWorkStatusAsWorkStatus();
        return cdef != null ? cdef.equals(CDef.WorkStatus.$03) : false;
    }

    /**
     * Is the value of workLogOutFlg $0? <br>
     * $0: 未出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWorkLogOutFlg$0() {
        CDef.WorkLogOutFlg cdef = getWorkLogOutFlgAsWorkLogOutFlg();
        return cdef != null ? cdef.equals(CDef.WorkLogOutFlg.$0) : false;
    }

    /**
     * Is the value of workLogOutFlg $1? <br>
     * $1: 出力済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWorkLogOutFlg$1() {
        CDef.WorkLogOutFlg cdef = getWorkLogOutFlgAsWorkLogOutFlg();
        return cdef != null ? cdef.equals(CDef.WorkLogOutFlg.$1) : false;
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
     * Get the value of the column 'workStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getWorkStatusName() {
        CDef.WorkStatus cdef = getWorkStatusAsWorkStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'workLogOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getWorkLogOutFlgName() {
        CDef.WorkLogOutFlg cdef = getWorkLogOutFlgAsWorkLogOutFlg();
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
    /** B_CLASS_DTL by my WORK_STATUS, named 'BClassDtlByWorkStatus'. */
    protected BClassDtl _bClassDtlByWorkStatus;

    /**
     * [get] B_CLASS_DTL by my WORK_STATUS, named 'BClassDtlByWorkStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByWorkStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByWorkStatus() {
        return _bClassDtlByWorkStatus;
    }

    /**
     * [set] B_CLASS_DTL by my WORK_STATUS, named 'BClassDtlByWorkStatus'.
     * @param bClassDtlByWorkStatus The entity of foreign property 'BClassDtlByWorkStatus'. (NullAllowed)
     */
    public void setBClassDtlByWorkStatus(BClassDtl bClassDtlByWorkStatus) {
        _bClassDtlByWorkStatus = bClassDtlByWorkStatus;
    }

    /** B_CLASS_DTL by my WORK_LOG_OUT_FLG, named 'BClassDtlByWorkLogOutFlg'. */
    protected BClassDtl _bClassDtlByWorkLogOutFlg;

    /**
     * [get] B_CLASS_DTL by my WORK_LOG_OUT_FLG, named 'BClassDtlByWorkLogOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByWorkLogOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByWorkLogOutFlg() {
        return _bClassDtlByWorkLogOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my WORK_LOG_OUT_FLG, named 'BClassDtlByWorkLogOutFlg'.
     * @param bClassDtlByWorkLogOutFlg The entity of foreign property 'BClassDtlByWorkLogOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByWorkLogOutFlg(BClassDtl bClassDtlByWorkLogOutFlg) {
        _bClassDtlByWorkLogOutFlg = bClassDtlByWorkLogOutFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_WORK_DATA by WORK_LOG_ID, named 'TWorkDataList'. */
    protected List<TWorkData> _tWorkDataList;

    /**
     * [get] T_WORK_DATA by WORK_LOG_ID, named 'TWorkDataList'.
     * @return The entity list of referrer property 'TWorkDataList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TWorkData> getTWorkDataList() {
        if (_tWorkDataList == null) { _tWorkDataList = newReferrerList(); }
        return _tWorkDataList;
    }

    /**
     * [set] T_WORK_DATA by WORK_LOG_ID, named 'TWorkDataList'.
     * @param tWorkDataList The entity list of referrer property 'TWorkDataList'. (NullAllowed)
     */
    public void setTWorkDataList(List<TWorkData> tWorkDataList) {
        _tWorkDataList = tWorkDataList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTWorkLog) {
            BsTWorkLog other = (BsTWorkLog)obj;
            if (!xSV(_workLogId, other._workLogId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _workLogId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByWorkStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByWorkStatus, "bClassDtlByWorkStatus")); }
        if (_bClassDtlByWorkLogOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByWorkLogOutFlg, "bClassDtlByWorkLogOutFlg")); }
        if (_tWorkDataList != null) { for (TWorkData et : _tWorkDataList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tWorkDataList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_workLogId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_workCd));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_workStartDt));
        sb.append(dm).append(xfND(_workEndDt));
        sb.append(dm).append(xfND(_workQty));
        sb.append(dm).append(xfND(_traceItem));
        sb.append(dm).append(xfND(_macAddress));
        sb.append(dm).append(xfND(_workStatus));
        sb.append(dm).append(xfND(_workLogOutFlg));
        sb.append(dm).append(xfND(_workLogOutDt));
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
        if (_bClassDtlByWorkStatus != null)
        { sb.append(dm).append("bClassDtlByWorkStatus"); }
        if (_bClassDtlByWorkLogOutFlg != null)
        { sb.append(dm).append("bClassDtlByWorkLogOutFlg"); }
        if (_tWorkDataList != null && !_tWorkDataList.isEmpty())
        { sb.append(dm).append("tWorkDataList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TWorkLog clone() {
        return (TWorkLog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WORK_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 作業実績ID
     * @return The value of the column 'WORK_LOG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWorkLogId() {
        checkSpecifiedProperty("workLogId");
        return _workLogId;
    }

    /**
     * [set] WORK_LOG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 作業実績ID
     * @param workLogId The value of the column 'WORK_LOG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWorkLogId(Long workLogId) {
        registerModifiedProperty("workLogId");
        _workLogId = workLogId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] USER_CD: {varchar(30)} <br>
     * ユーザCD
     * @return The value of the column 'USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserCd() {
        checkSpecifiedProperty("userCd");
        return convertEmptyToNull(_userCd);
    }

    /**
     * [set] USER_CD: {varchar(30)} <br>
     * ユーザCD
     * @param userCd The value of the column 'USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserCd(String userCd) {
        registerModifiedProperty("userCd");
        _userCd = userCd;
    }

    /**
     * [get] WORK_CD: {varchar(30)} <br>
     * 作業CD
     * @return The value of the column 'WORK_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkCd() {
        checkSpecifiedProperty("workCd");
        return convertEmptyToNull(_workCd);
    }

    /**
     * [set] WORK_CD: {varchar(30)} <br>
     * 作業CD
     * @param workCd The value of the column 'WORK_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkCd(String workCd) {
        registerModifiedProperty("workCd");
        _workCd = workCd;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] WORK_START_DT: {datetime2(26, 6)} <br>
     * 作業開始日時
     * @return The value of the column 'WORK_START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkStartDt() {
        checkSpecifiedProperty("workStartDt");
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {datetime2(26, 6)} <br>
     * 作業開始日時
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        registerModifiedProperty("workStartDt");
        _workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {datetime2(26, 6)} <br>
     * 作業終了日時
     * @return The value of the column 'WORK_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkEndDt() {
        checkSpecifiedProperty("workEndDt");
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {datetime2(26, 6)} <br>
     * 作業終了日時
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        registerModifiedProperty("workEndDt");
        _workEndDt = workEndDt;
    }

    /**
     * [get] WORK_QTY: {decimal(16, 6)} <br>
     * 作業数量
     * @return The value of the column 'WORK_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWorkQty() {
        checkSpecifiedProperty("workQty");
        return _workQty;
    }

    /**
     * [set] WORK_QTY: {decimal(16, 6)} <br>
     * 作業数量
     * @param workQty The value of the column 'WORK_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkQty(java.math.BigDecimal workQty) {
        registerModifiedProperty("workQty");
        _workQty = workQty;
    }

    /**
     * [get] TRACE_ITEM: {varchar(255)} <br>
     * トレース項目
     * @return The value of the column 'TRACE_ITEM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTraceItem() {
        checkSpecifiedProperty("traceItem");
        return convertEmptyToNull(_traceItem);
    }

    /**
     * [set] TRACE_ITEM: {varchar(255)} <br>
     * トレース項目
     * @param traceItem The value of the column 'TRACE_ITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTraceItem(String traceItem) {
        registerModifiedProperty("traceItem");
        _traceItem = traceItem;
    }

    /**
     * [get] MAC_ADDRESS: {varchar(60)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMacAddress() {
        checkSpecifiedProperty("macAddress");
        return convertEmptyToNull(_macAddress);
    }

    /**
     * [set] MAC_ADDRESS: {varchar(60)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMacAddress(String macAddress) {
        registerModifiedProperty("macAddress");
        _macAddress = macAddress;
    }

    /**
     * [get] WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus} <br>
     * 作業ステータス
     * @return The value of the column 'WORK_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkStatus() {
        checkSpecifiedProperty("workStatus");
        return convertEmptyToNull(_workStatus);
    }

    /**
     * [set] WORK_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=WorkStatus} <br>
     * 作業ステータス
     * @param workStatus The value of the column 'WORK_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkStatus(String workStatus) {
        registerModifiedProperty("workStatus");
        _workStatus = workStatus;
    }

    /**
     * [get] WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} <br>
     * 作業実績出力フラグ
     * @return The value of the column 'WORK_LOG_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkLogOutFlg() {
        checkSpecifiedProperty("workLogOutFlg");
        return convertEmptyToNull(_workLogOutFlg);
    }

    /**
     * [set] WORK_LOG_OUT_FLG: {IX, char(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} <br>
     * 作業実績出力フラグ
     * @param workLogOutFlg The value of the column 'WORK_LOG_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkLogOutFlg(String workLogOutFlg) {
        registerModifiedProperty("workLogOutFlg");
        _workLogOutFlg = workLogOutFlg;
    }

    /**
     * [get] WORK_LOG_OUT_DT: {datetime2(26, 6)} <br>
     * 作業実績出力日時
     * @return The value of the column 'WORK_LOG_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkLogOutDt() {
        checkSpecifiedProperty("workLogOutDt");
        return _workLogOutDt;
    }

    /**
     * [set] WORK_LOG_OUT_DT: {datetime2(26, 6)} <br>
     * 作業実績出力日時
     * @param workLogOutDt The value of the column 'WORK_LOG_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkLogOutDt(java.sql.Timestamp workLogOutDt) {
        registerModifiedProperty("workLogOutDt");
        _workLogOutDt = workLogOutDt;
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
