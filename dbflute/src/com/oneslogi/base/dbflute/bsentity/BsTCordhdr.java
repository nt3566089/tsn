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
 * The entity of T_CORDHDR as TABLE. <br>
 * さしずヘッダ
 * <pre>
 * [primary-key]
 *     ORDER_H_ID
 *
 * [column]
 *     ORDER_H_ID, CENTER_ID, CLIENT_ID, ZZORGNCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, IOID, CTQA, STA, WRKMFG, SROPRTCNT, CORDRCVCNT, COMPLETE_FLG, RCV_FLG, SKIP_KBN, SORT_DATE, COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     T_CORDDTAEC, T_CORDDTASR
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     tCorddtaecList, tCorddtasrList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long orderHId = entity.getOrderHId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String zzorgncd = entity.getZzorgncd();
 * String dpcd = entity.getDpcd();
 * String zzordymd = entity.getZzordymd();
 * String ordgr = entity.getOrdgr();
 * String dlvymd = entity.getDlvymd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String scddlvymd = entity.getScddlvymd();
 * String scdded = entity.getScdded();
 * String scdpstnid = entity.getScdpstnid();
 * String ioid = entity.getIoid();
 * Long ctqa = entity.getCtqa();
 * java.math.BigDecimal sta = entity.getSta();
 * String wrkmfg = entity.getWrkmfg();
 * Long sroprtcnt = entity.getSroprtcnt();
 * Long cordrcvcnt = entity.getCordrcvcnt();
 * String completeFlg = entity.getCompleteFlg();
 * String rcvFlg = entity.getRcvFlg();
 * String skipKbn = entity.getSkipKbn();
 * String sortDate = entity.getSortDate();
 * String comment = entity.getComment();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setOrderHId(orderHId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setZzorgncd(zzorgncd);
 * entity.setDpcd(dpcd);
 * entity.setZzordymd(zzordymd);
 * entity.setOrdgr(ordgr);
 * entity.setDlvymd(dlvymd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setScddlvymd(scddlvymd);
 * entity.setScdded(scdded);
 * entity.setScdpstnid(scdpstnid);
 * entity.setIoid(ioid);
 * entity.setCtqa(ctqa);
 * entity.setSta(sta);
 * entity.setWrkmfg(wrkmfg);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setCordrcvcnt(cordrcvcnt);
 * entity.setCompleteFlg(completeFlg);
 * entity.setRcvFlg(rcvFlg);
 * entity.setSkipKbn(skipKbn);
 * entity.setSortDate(sortDate);
 * entity.setComment(comment);
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
public abstract class BsTCordhdr extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _orderHId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    protected String _zzorgncd;

    /** DPCD: {NotNull, varchar(30)} */
    protected String _dpcd;

    /** ZZORDYMD: {NotNull, varchar(8)} */
    protected String _zzordymd;

    /** ORDGR: {NotNull, varchar(30)} */
    protected String _ordgr;

    /** DLVYMD: {NotNull, varchar(8)} */
    protected String _dlvymd;

    /** DED: {NotNull, varchar(30)} */
    protected String _ded;

    /** PSTNID: {NotNull, varchar(30)} */
    protected String _pstnid;

    /** SCDDLVYMD: {NotNull, varchar(8)} */
    protected String _scddlvymd;

    /** SCDDED: {NotNull, varchar(30)} */
    protected String _scdded;

    /** SCDPSTNID: {NotNull, varchar(30)} */
    protected String _scdpstnid;

    /** IOID: {NotNull, char(1)} */
    protected String _ioid;

    /** CTQA: {NotNull, bigint(19)} */
    protected Long _ctqa;

    /** STA: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _sta;

    /** WRKMFG: {NotNull, char(1)} */
    protected String _wrkmfg;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    protected Long _sroprtcnt;

    /** CORDRCVCNT: {NotNull, bigint(19)} */
    protected Long _cordrcvcnt;

    /** COMPLETE_FLG: {NotNull, char(1)} */
    protected String _completeFlg;

    /** RCV_FLG: {NotNull, char(1), default=[0]} */
    protected String _rcvFlg;

    /** SKIP_KBN: {varchar(30)} */
    protected String _skipKbn;

    /** SORT_DATE: {varchar(8)} */
    protected String _sortDate;

    /** COMMENT: {varchar(255)} */
    protected String _comment;

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
        return "T_CORDHDR";
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
        if (_orderHId == null) { return false; }
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
    /** T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'. */
    protected List<TCorddtaec> _tCorddtaecList;

    /**
     * [get] T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'.
     * @return The entity list of referrer property 'TCorddtaecList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCorddtaec> getTCorddtaecList() {
        if (_tCorddtaecList == null) { _tCorddtaecList = newReferrerList(); }
        return _tCorddtaecList;
    }

    /**
     * [set] T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'.
     * @param tCorddtaecList The entity list of referrer property 'TCorddtaecList'. (NullAllowed)
     */
    public void setTCorddtaecList(List<TCorddtaec> tCorddtaecList) {
        _tCorddtaecList = tCorddtaecList;
    }

    /** T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'. */
    protected List<TCorddtasr> _tCorddtasrList;

    /**
     * [get] T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'.
     * @return The entity list of referrer property 'TCorddtasrList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCorddtasr> getTCorddtasrList() {
        if (_tCorddtasrList == null) { _tCorddtasrList = newReferrerList(); }
        return _tCorddtasrList;
    }

    /**
     * [set] T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'.
     * @param tCorddtasrList The entity list of referrer property 'TCorddtasrList'. (NullAllowed)
     */
    public void setTCorddtasrList(List<TCorddtasr> tCorddtasrList) {
        _tCorddtasrList = tCorddtasrList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTCordhdr) {
            BsTCordhdr other = (BsTCordhdr)obj;
            if (!xSV(_orderHId, other._orderHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _orderHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_tCorddtaecList != null) { for (TCorddtaec et : _tCorddtaecList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCorddtaecList")); } } }
        if (_tCorddtasrList != null) { for (TCorddtasr et : _tCorddtasrList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCorddtasrList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_orderHId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_zzordymd));
        sb.append(dm).append(xfND(_ordgr));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_scddlvymd));
        sb.append(dm).append(xfND(_scdded));
        sb.append(dm).append(xfND(_scdpstnid));
        sb.append(dm).append(xfND(_ioid));
        sb.append(dm).append(xfND(_ctqa));
        sb.append(dm).append(xfND(_sta));
        sb.append(dm).append(xfND(_wrkmfg));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_cordrcvcnt));
        sb.append(dm).append(xfND(_completeFlg));
        sb.append(dm).append(xfND(_rcvFlg));
        sb.append(dm).append(xfND(_skipKbn));
        sb.append(dm).append(xfND(_sortDate));
        sb.append(dm).append(xfND(_comment));
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
        if (_tCorddtaecList != null && !_tCorddtaecList.isEmpty())
        { sb.append(dm).append("tCorddtaecList"); }
        if (_tCorddtasrList != null && !_tCorddtasrList.isEmpty())
        { sb.append(dm).append("tCorddtasrList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TCordhdr clone() {
        return (TCordhdr)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずヘッダID
     * @return The value of the column 'ORDER_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getOrderHId() {
        checkSpecifiedProperty("orderHId");
        return _orderHId;
    }

    /**
     * [set] ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずヘッダID
     * @param orderHId The value of the column 'ORDER_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOrderHId(Long orderHId) {
        registerModifiedProperty("orderHId");
        _orderHId = orderHId;
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
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'ZZORGNCD'. (basically NotNull if selected: for the constraint)
     */
    public String getZzorgncd() {
        checkSpecifiedProperty("zzorgncd");
        return convertEmptyToNull(_zzorgncd);
    }

    /**
     * [set] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @param zzorgncd The value of the column 'ZZORGNCD'. (basically NotNull if update: for the constraint)
     */
    public void setZzorgncd(String zzorgncd) {
        registerModifiedProperty("zzorgncd");
        _zzorgncd = zzorgncd;
    }

    /**
     * [get] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (basically NotNull if update: for the constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] ZZORDYMD: {NotNull, varchar(8)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getZzordymd() {
        checkSpecifiedProperty("zzordymd");
        return convertEmptyToNull(_zzordymd);
    }

    /**
     * [set] ZZORDYMD: {NotNull, varchar(8)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (basically NotNull if update: for the constraint)
     */
    public void setZzordymd(String zzordymd) {
        registerModifiedProperty("zzordymd");
        _zzordymd = zzordymd;
    }

    /**
     * [get] ORDGR: {NotNull, varchar(30)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (basically NotNull if selected: for the constraint)
     */
    public String getOrdgr() {
        checkSpecifiedProperty("ordgr");
        return convertEmptyToNull(_ordgr);
    }

    /**
     * [set] ORDGR: {NotNull, varchar(30)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (basically NotNull if update: for the constraint)
     */
    public void setOrdgr(String ordgr) {
        registerModifiedProperty("ordgr");
        _ordgr = ordgr;
    }

    /**
     * [get] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getDlvymd() {
        checkSpecifiedProperty("dlvymd");
        return convertEmptyToNull(_dlvymd);
    }

    /**
     * [set] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (basically NotNull if update: for the constraint)
     */
    public void setDlvymd(String dlvymd) {
        registerModifiedProperty("dlvymd");
        _dlvymd = dlvymd;
    }

    /**
     * [get] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (basically NotNull if selected: for the constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (basically NotNull if update: for the constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (basically NotNull if selected: for the constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (basically NotNull if update: for the constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] SCDDLVYMD: {NotNull, varchar(8)} <br>
     * 画面表示用配達年月日
     * @return The value of the column 'SCDDLVYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getScddlvymd() {
        checkSpecifiedProperty("scddlvymd");
        return convertEmptyToNull(_scddlvymd);
    }

    /**
     * [set] SCDDLVYMD: {NotNull, varchar(8)} <br>
     * 画面表示用配達年月日
     * @param scddlvymd The value of the column 'SCDDLVYMD'. (basically NotNull if update: for the constraint)
     */
    public void setScddlvymd(String scddlvymd) {
        registerModifiedProperty("scddlvymd");
        _scddlvymd = scddlvymd;
    }

    /**
     * [get] SCDDED: {NotNull, varchar(30)} <br>
     * 画面表示用配達方面
     * @return The value of the column 'SCDDED'. (basically NotNull if selected: for the constraint)
     */
    public String getScdded() {
        checkSpecifiedProperty("scdded");
        return convertEmptyToNull(_scdded);
    }

    /**
     * [set] SCDDED: {NotNull, varchar(30)} <br>
     * 画面表示用配達方面
     * @param scdded The value of the column 'SCDDED'. (basically NotNull if update: for the constraint)
     */
    public void setScdded(String scdded) {
        registerModifiedProperty("scdded");
        _scdded = scdded;
    }

    /**
     * [get] SCDPSTNID: {NotNull, varchar(30)} <br>
     * 画面表示用ピストン区分
     * @return The value of the column 'SCDPSTNID'. (basically NotNull if selected: for the constraint)
     */
    public String getScdpstnid() {
        checkSpecifiedProperty("scdpstnid");
        return convertEmptyToNull(_scdpstnid);
    }

    /**
     * [set] SCDPSTNID: {NotNull, varchar(30)} <br>
     * 画面表示用ピストン区分
     * @param scdpstnid The value of the column 'SCDPSTNID'. (basically NotNull if update: for the constraint)
     */
    public void setScdpstnid(String scdpstnid) {
        registerModifiedProperty("scdpstnid");
        _scdpstnid = scdpstnid;
    }

    /**
     * [get] IOID: {NotNull, char(1)} <br>
     * 内外区分
     * @return The value of the column 'IOID'. (basically NotNull if selected: for the constraint)
     */
    public String getIoid() {
        checkSpecifiedProperty("ioid");
        return convertEmptyToNull(_ioid);
    }

    /**
     * [set] IOID: {NotNull, char(1)} <br>
     * 内外区分
     * @param ioid The value of the column 'IOID'. (basically NotNull if update: for the constraint)
     */
    public void setIoid(String ioid) {
        registerModifiedProperty("ioid");
        _ioid = ioid;
    }

    /**
     * [get] CTQA: {NotNull, bigint(19)} <br>
     * カートン数
     * @return The value of the column 'CTQA'. (basically NotNull if selected: for the constraint)
     */
    public Long getCtqa() {
        checkSpecifiedProperty("ctqa");
        return _ctqa;
    }

    /**
     * [set] CTQA: {NotNull, bigint(19)} <br>
     * カートン数
     * @param ctqa The value of the column 'CTQA'. (basically NotNull if update: for the constraint)
     */
    public void setCtqa(Long ctqa) {
        registerModifiedProperty("ctqa");
        _ctqa = ctqa;
    }

    /**
     * [get] STA: {NotNull, decimal(16, 6)} <br>
     * 状態
     * @return The value of the column 'STA'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSta() {
        checkSpecifiedProperty("sta");
        return _sta;
    }

    /**
     * [set] STA: {NotNull, decimal(16, 6)} <br>
     * 状態
     * @param sta The value of the column 'STA'. (basically NotNull if update: for the constraint)
     */
    public void setSta(java.math.BigDecimal sta) {
        registerModifiedProperty("sta");
        _sta = sta;
    }

    /**
     * [get] WRKMFG: {NotNull, char(1)} <br>
     * 割込フラグ
     * @return The value of the column 'WRKMFG'. (basically NotNull if selected: for the constraint)
     */
    public String getWrkmfg() {
        checkSpecifiedProperty("wrkmfg");
        return convertEmptyToNull(_wrkmfg);
    }

    /**
     * [set] WRKMFG: {NotNull, char(1)} <br>
     * 割込フラグ
     * @param wrkmfg The value of the column 'WRKMFG'. (basically NotNull if update: for the constraint)
     */
    public void setWrkmfg(String wrkmfg) {
        registerModifiedProperty("wrkmfg");
        _wrkmfg = wrkmfg;
    }

    /**
     * [get] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (basically NotNull if selected: for the constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (basically NotNull if update: for the constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] CORDRCVCNT: {NotNull, bigint(19)} <br>
     * さしず受信回数
     * @return The value of the column 'CORDRCVCNT'. (basically NotNull if selected: for the constraint)
     */
    public Long getCordrcvcnt() {
        checkSpecifiedProperty("cordrcvcnt");
        return _cordrcvcnt;
    }

    /**
     * [set] CORDRCVCNT: {NotNull, bigint(19)} <br>
     * さしず受信回数
     * @param cordrcvcnt The value of the column 'CORDRCVCNT'. (basically NotNull if update: for the constraint)
     */
    public void setCordrcvcnt(Long cordrcvcnt) {
        registerModifiedProperty("cordrcvcnt");
        _cordrcvcnt = cordrcvcnt;
    }

    /**
     * [get] COMPLETE_FLG: {NotNull, char(1)} <br>
     * 完了フラグ
     * @return The value of the column 'COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getCompleteFlg() {
        checkSpecifiedProperty("completeFlg");
        return convertEmptyToNull(_completeFlg);
    }

    /**
     * [set] COMPLETE_FLG: {NotNull, char(1)} <br>
     * 完了フラグ
     * @param completeFlg The value of the column 'COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setCompleteFlg(String completeFlg) {
        registerModifiedProperty("completeFlg");
        _completeFlg = completeFlg;
    }

    /**
     * [get] RCV_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込済フラグ
     * @return The value of the column 'RCV_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvFlg() {
        checkSpecifiedProperty("rcvFlg");
        return convertEmptyToNull(_rcvFlg);
    }

    /**
     * [set] RCV_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込済フラグ
     * @param rcvFlg The value of the column 'RCV_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setRcvFlg(String rcvFlg) {
        registerModifiedProperty("rcvFlg");
        _rcvFlg = rcvFlg;
    }

    /**
     * [get] SKIP_KBN: {varchar(30)} <br>
     * スキップ区分
     * @return The value of the column 'SKIP_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkipKbn() {
        checkSpecifiedProperty("skipKbn");
        return convertEmptyToNull(_skipKbn);
    }

    /**
     * [set] SKIP_KBN: {varchar(30)} <br>
     * スキップ区分
     * @param skipKbn The value of the column 'SKIP_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkipKbn(String skipKbn) {
        registerModifiedProperty("skipKbn");
        _skipKbn = skipKbn;
    }

    /**
     * [get] SORT_DATE: {varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SORT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortDate() {
        checkSpecifiedProperty("sortDate");
        return convertEmptyToNull(_sortDate);
    }

    /**
     * [set] SORT_DATE: {varchar(8)} <br>
     * 仕分作業日付
     * @param sortDate The value of the column 'SORT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortDate(String sortDate) {
        registerModifiedProperty("sortDate");
        _sortDate = sortDate;
    }

    /**
     * [get] COMMENT: {varchar(255)} <br>
     * コメント
     * @return The value of the column 'COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getComment() {
        checkSpecifiedProperty("comment");
        return convertEmptyToNull(_comment);
    }

    /**
     * [set] COMMENT: {varchar(255)} <br>
     * コメント
     * @param comment The value of the column 'COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComment(String comment) {
        registerModifiedProperty("comment");
        _comment = comment;
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
