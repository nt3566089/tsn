package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlWorkloadInquiryList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SEQUENCENO, WORK_DT, USERCD, USER_NM, TASK_TYPE, TASK_TYPE_DETAIL, WORKTIME, START_END, WORK_PALLET_QTY, WORK_CASE_QTY, WORK_CARTON_QTY, WORK_QTY, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
 * Long sequenceno = entity.getSequenceno();
 * String workDt = entity.getWorkDt();
 * String usercd = entity.getUsercd();
 * String userNm = entity.getUserNm();
 * String taskType = entity.getTaskType();
 * String taskTypeDetail = entity.getTaskTypeDetail();
 * String worktime = entity.getWorktime();
 * String startEnd = entity.getStartEnd();
 * Long workPalletQty = entity.getWorkPalletQty();
 * Long workCaseQty = entity.getWorkCaseQty();
 * Long workCartonQty = entity.getWorkCartonQty();
 * Long workQty = entity.getWorkQty();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * entity.setSequenceno(sequenceno);
 * entity.setWorkDt(workDt);
 * entity.setUsercd(usercd);
 * entity.setUserNm(userNm);
 * entity.setTaskType(taskType);
 * entity.setTaskTypeDetail(taskTypeDetail);
 * entity.setWorktime(worktime);
 * entity.setStartEnd(startEnd);
 * entity.setWorkPalletQty(workPalletQty);
 * entity.setWorkCaseQty(workCaseQty);
 * entity.setWorkCartonQty(workCartonQty);
 * entity.setWorkQty(workQty);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlWorkloadInquiryList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SEQUENCENO: {bigint(19)} */
    protected Long _sequenceno;

    /** WORK_DT: {nvarchar(4000)} */
    protected String _workDt;

    /** USERCD: {varchar(30)} */
    protected String _usercd;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    /** TASK_TYPE: {varchar(30)} */
    protected String _taskType;

    /** TASK_TYPE_DETAIL: {varchar(30)} */
    protected String _taskTypeDetail;

    /** WORKTIME: {nvarchar(4000)} */
    protected String _worktime;

    /** START_END: {varchar(30)} */
    protected String _startEnd;

    /** WORK_PALLET_QTY: {bigint(19)} */
    protected Long _workPalletQty;

    /** WORK_CASE_QTY: {bigint(19)} */
    protected Long _workCaseQty;

    /** WORK_CARTON_QTY: {bigint(19)} */
    protected Long _workCartonQty;

    /** WORK_QTY: {bigint(19)} */
    protected Long _workQty;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlWorkloadInquiryListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlWorkloadInquiryList";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
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
        if (obj instanceof BsSqlWorkloadInquiryList) {
            BsSqlWorkloadInquiryList other = (BsSqlWorkloadInquiryList)obj;
            if (!xSV(_sequenceno, other._sequenceno)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_usercd, other._usercd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_taskType, other._taskType)) { return false; }
            if (!xSV(_taskTypeDetail, other._taskTypeDetail)) { return false; }
            if (!xSV(_worktime, other._worktime)) { return false; }
            if (!xSV(_startEnd, other._startEnd)) { return false; }
            if (!xSV(_workPalletQty, other._workPalletQty)) { return false; }
            if (!xSV(_workCaseQty, other._workCaseQty)) { return false; }
            if (!xSV(_workCartonQty, other._workCartonQty)) { return false; }
            if (!xSV(_workQty, other._workQty)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sequenceno);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _usercd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _taskType);
        hs = xCH(hs, _taskTypeDetail);
        hs = xCH(hs, _worktime);
        hs = xCH(hs, _startEnd);
        hs = xCH(hs, _workPalletQty);
        hs = xCH(hs, _workCaseQty);
        hs = xCH(hs, _workCartonQty);
        hs = xCH(hs, _workQty);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sequenceno));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_usercd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_taskType));
        sb.append(dm).append(xfND(_taskTypeDetail));
        sb.append(dm).append(xfND(_worktime));
        sb.append(dm).append(xfND(_startEnd));
        sb.append(dm).append(xfND(_workPalletQty));
        sb.append(dm).append(xfND(_workCaseQty));
        sb.append(dm).append(xfND(_workCartonQty));
        sb.append(dm).append(xfND(_workQty));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
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
    public SqlWorkloadInquiryList clone() {
        return (SqlWorkloadInquiryList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SEQUENCENO: {bigint(19)} <br>
     * @return The value of the column 'SEQUENCENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSequenceno() {
        checkSpecifiedProperty("sequenceno");
        return _sequenceno;
    }

    /**
     * [set] SEQUENCENO: {bigint(19)} <br>
     * @param sequenceno The value of the column 'SEQUENCENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSequenceno(Long sequenceno) {
        registerModifiedProperty("sequenceno");
        _sequenceno = sequenceno;
    }

    /**
     * [get] WORK_DT: {nvarchar(4000)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {nvarchar(4000)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] USERCD: {varchar(30)} <br>
     * @return The value of the column 'USERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsercd() {
        checkSpecifiedProperty("usercd");
        return convertEmptyToNull(_usercd);
    }

    /**
     * [set] USERCD: {varchar(30)} <br>
     * @param usercd The value of the column 'USERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsercd(String usercd) {
        registerModifiedProperty("usercd");
        _usercd = usercd;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserNm() {
        checkSpecifiedProperty("userNm");
        return convertEmptyToNull(_userNm);
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserNm(String userNm) {
        registerModifiedProperty("userNm");
        _userNm = userNm;
    }

    /**
     * [get] TASK_TYPE: {varchar(30)} <br>
     * @return The value of the column 'TASK_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTaskType() {
        checkSpecifiedProperty("taskType");
        return convertEmptyToNull(_taskType);
    }

    /**
     * [set] TASK_TYPE: {varchar(30)} <br>
     * @param taskType The value of the column 'TASK_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaskType(String taskType) {
        registerModifiedProperty("taskType");
        _taskType = taskType;
    }

    /**
     * [get] TASK_TYPE_DETAIL: {varchar(30)} <br>
     * @return The value of the column 'TASK_TYPE_DETAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getTaskTypeDetail() {
        checkSpecifiedProperty("taskTypeDetail");
        return convertEmptyToNull(_taskTypeDetail);
    }

    /**
     * [set] TASK_TYPE_DETAIL: {varchar(30)} <br>
     * @param taskTypeDetail The value of the column 'TASK_TYPE_DETAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaskTypeDetail(String taskTypeDetail) {
        registerModifiedProperty("taskTypeDetail");
        _taskTypeDetail = taskTypeDetail;
    }

    /**
     * [get] WORKTIME: {nvarchar(4000)} <br>
     * @return The value of the column 'WORKTIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorktime() {
        checkSpecifiedProperty("worktime");
        return convertEmptyToNull(_worktime);
    }

    /**
     * [set] WORKTIME: {nvarchar(4000)} <br>
     * @param worktime The value of the column 'WORKTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorktime(String worktime) {
        registerModifiedProperty("worktime");
        _worktime = worktime;
    }

    /**
     * [get] START_END: {varchar(30)} <br>
     * @return The value of the column 'START_END'. (NullAllowed even if selected: for no constraint)
     */
    public String getStartEnd() {
        checkSpecifiedProperty("startEnd");
        return convertEmptyToNull(_startEnd);
    }

    /**
     * [set] START_END: {varchar(30)} <br>
     * @param startEnd The value of the column 'START_END'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartEnd(String startEnd) {
        registerModifiedProperty("startEnd");
        _startEnd = startEnd;
    }

    /**
     * [get] WORK_PALLET_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_PALLET_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkPalletQty() {
        checkSpecifiedProperty("workPalletQty");
        return _workPalletQty;
    }

    /**
     * [set] WORK_PALLET_QTY: {bigint(19)} <br>
     * @param workPalletQty The value of the column 'WORK_PALLET_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkPalletQty(Long workPalletQty) {
        registerModifiedProperty("workPalletQty");
        _workPalletQty = workPalletQty;
    }

    /**
     * [get] WORK_CASE_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_CASE_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkCaseQty() {
        checkSpecifiedProperty("workCaseQty");
        return _workCaseQty;
    }

    /**
     * [set] WORK_CASE_QTY: {bigint(19)} <br>
     * @param workCaseQty The value of the column 'WORK_CASE_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkCaseQty(Long workCaseQty) {
        registerModifiedProperty("workCaseQty");
        _workCaseQty = workCaseQty;
    }

    /**
     * [get] WORK_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_CARTON_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkCartonQty() {
        checkSpecifiedProperty("workCartonQty");
        return _workCartonQty;
    }

    /**
     * [set] WORK_CARTON_QTY: {bigint(19)} <br>
     * @param workCartonQty The value of the column 'WORK_CARTON_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkCartonQty(Long workCartonQty) {
        registerModifiedProperty("workCartonQty");
        _workCartonQty = workCartonQty;
    }

    /**
     * [get] WORK_QTY: {bigint(19)} <br>
     * @return The value of the column 'WORK_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkQty() {
        checkSpecifiedProperty("workQty");
        return _workQty;
    }

    /**
     * [set] WORK_QTY: {bigint(19)} <br>
     * @param workQty The value of the column 'WORK_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkQty(Long workQty) {
        registerModifiedProperty("workQty");
        _workQty = workQty;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }
}
