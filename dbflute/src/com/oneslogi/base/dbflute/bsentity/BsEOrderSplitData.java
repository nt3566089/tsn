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
 * The entity of E_ORDER_SPLIT_DATA as TABLE. <br>
 * オーダー分割結果データ送信テーブル
 * <pre>
 * [primary-key]
 *     ORDER_SPLIT_DATA_ID
 *
 * [column]
 *     ORDER_SPLIT_DATA_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, REC_FLG, SRWHCD, DPCD, DED, PSTNID, DLVRNK, DLVSNM, SROPRTCNT, SSCD, DLVYMD, ZZORDYMD, SLPMRGTMG, ORDGR, S, H, M, SRYMD, RLYBSCD, KEEPAREAH1, SLPTYP, CMPCD, SLPNO, SLEDIV, CNGPRTSLPNO, SPPLYMD, CGGDID, KEEPAREAH2, ZZMATNR, BOXNO, BOXTYPE, ZZMATNRTOTAL, BOXNOCNSNM, BXOSZL, BXOSZH, BXOSZW, BOXTOTALWEIGH, WEIGHTYPE, BOXTOTALNUMBER, KEEPAREAM1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_SPLIT_DATA_ID
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
 * Long orderSplitDataId = entity.getOrderSplitDataId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String recFlg = entity.getRecFlg();
 * String srwhcd = entity.getSrwhcd();
 * String dpcd = entity.getDpcd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String dlvrnk = entity.getDlvrnk();
 * Long dlvsnm = entity.getDlvsnm();
 * Long sroprtcnt = entity.getSroprtcnt();
 * String sscd = entity.getSscd();
 * String dlvymd = entity.getDlvymd();
 * String zzordymd = entity.getZzordymd();
 * String slpmrgtmg = entity.getSlpmrgtmg();
 * String ordgr = entity.getOrdgr();
 * Long s = entity.getS();
 * Long h = entity.getH();
 * Long m = entity.getM();
 * String srymd = entity.getSrymd();
 * String rlybscd = entity.getRlybscd();
 * String keepareah1 = entity.getKeepareah1();
 * String slptyp = entity.getSlptyp();
 * String cmpcd = entity.getCmpcd();
 * String slpno = entity.getSlpno();
 * String slediv = entity.getSlediv();
 * String cngprtslpno = entity.getCngprtslpno();
 * String spplymd = entity.getSpplymd();
 * String cggdid = entity.getCggdid();
 * String keepareah2 = entity.getKeepareah2();
 * String zzmatnr = entity.getZzmatnr();
 * String boxno = entity.getBoxno();
 * String boxtype = entity.getBoxtype();
 * Long zzmatnrtotal = entity.getZzmatnrtotal();
 * String boxnocnsnm = entity.getBoxnocnsnm();
 * Long bxoszl = entity.getBxoszl();
 * Long bxoszh = entity.getBxoszh();
 * Long bxoszw = entity.getBxoszw();
 * Long boxtotalweigh = entity.getBoxtotalweigh();
 * String weightype = entity.getWeightype();
 * Long boxtotalnumber = entity.getBoxtotalnumber();
 * String keepaream1 = entity.getKeepaream1();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setOrderSplitDataId(orderSplitDataId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setRecFlg(recFlg);
 * entity.setSrwhcd(srwhcd);
 * entity.setDpcd(dpcd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setDlvrnk(dlvrnk);
 * entity.setDlvsnm(dlvsnm);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setSscd(sscd);
 * entity.setDlvymd(dlvymd);
 * entity.setZzordymd(zzordymd);
 * entity.setSlpmrgtmg(slpmrgtmg);
 * entity.setOrdgr(ordgr);
 * entity.setS(s);
 * entity.setH(h);
 * entity.setM(m);
 * entity.setSrymd(srymd);
 * entity.setRlybscd(rlybscd);
 * entity.setKeepareah1(keepareah1);
 * entity.setSlptyp(slptyp);
 * entity.setCmpcd(cmpcd);
 * entity.setSlpno(slpno);
 * entity.setSlediv(slediv);
 * entity.setCngprtslpno(cngprtslpno);
 * entity.setSpplymd(spplymd);
 * entity.setCggdid(cggdid);
 * entity.setKeepareah2(keepareah2);
 * entity.setZzmatnr(zzmatnr);
 * entity.setBoxno(boxno);
 * entity.setBoxtype(boxtype);
 * entity.setZzmatnrtotal(zzmatnrtotal);
 * entity.setBoxnocnsnm(boxnocnsnm);
 * entity.setBxoszl(bxoszl);
 * entity.setBxoszh(bxoszh);
 * entity.setBxoszw(bxoszw);
 * entity.setBoxtotalweigh(boxtotalweigh);
 * entity.setWeightype(weightype);
 * entity.setBoxtotalnumber(boxtotalnumber);
 * entity.setKeepaream1(keepaream1);
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
public abstract class BsEOrderSplitData extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _orderSplitDataId;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {char(1)} */
    protected String _workFlg;

    /** REC_FLG: {varchar(30)} */
    protected String _recFlg;

    /** SRWHCD: {varchar(30)} */
    protected String _srwhcd;

    /** DPCD: {varchar(30)} */
    protected String _dpcd;

    /** DED: {varchar(30)} */
    protected String _ded;

    /** PSTNID: {char(1)} */
    protected String _pstnid;

    /** DLVRNK: {varchar(30)} */
    protected String _dlvrnk;

    /** DLVSNM: {bigint(19)} */
    protected Long _dlvsnm;

    /** SROPRTCNT: {bigint(19)} */
    protected Long _sroprtcnt;

    /** SSCD: {varchar(30)} */
    protected String _sscd;

    /** DLVYMD: {varchar(8)} */
    protected String _dlvymd;

    /** ZZORDYMD: {varchar(8)} */
    protected String _zzordymd;

    /** SLPMRGTMG: {varchar(30)} */
    protected String _slpmrgtmg;

    /** ORDGR: {varchar(30)} */
    protected String _ordgr;

    /** S: {bigint(19)} */
    protected Long _s;

    /** H: {bigint(19)} */
    protected Long _h;

    /** M: {bigint(19)} */
    protected Long _m;

    /** SRYMD: {varchar(8)} */
    protected String _srymd;

    /** RLYBSCD: {varchar(30)} */
    protected String _rlybscd;

    /** KEEPAREAH1: {varchar(30)} */
    protected String _keepareah1;

    /** SLPTYP: {varchar(30)} */
    protected String _slptyp;

    /** CMPCD: {varchar(30)} */
    protected String _cmpcd;

    /** SLPNO: {varchar(30)} */
    protected String _slpno;

    /** SLEDIV: {varchar(30)} */
    protected String _slediv;

    /** CNGPRTSLPNO: {varchar(30)} */
    protected String _cngprtslpno;

    /** SPPLYMD: {varchar(8)} */
    protected String _spplymd;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    /** KEEPAREAH2: {varchar(30)} */
    protected String _keepareah2;

    /** ZZMATNR: {varchar(30)} */
    protected String _zzmatnr;

    /** BOXNO: {varchar(30)} */
    protected String _boxno;

    /** BOXTYPE: {varchar(30)} */
    protected String _boxtype;

    /** ZZMATNRTOTAL: {bigint(19)} */
    protected Long _zzmatnrtotal;

    /** BOXNOCNSNM: {varchar(30)} */
    protected String _boxnocnsnm;

    /** BXOSZL: {bigint(19)} */
    protected Long _bxoszl;

    /** BXOSZH: {bigint(19)} */
    protected Long _bxoszh;

    /** BXOSZW: {bigint(19)} */
    protected Long _bxoszw;

    /** BOXTOTALWEIGH: {bigint(19)} */
    protected Long _boxtotalweigh;

    /** WEIGHTYPE: {varchar(30)} */
    protected String _weightype;

    /** BOXTOTALNUMBER: {bigint(19)} */
    protected Long _boxtotalnumber;

    /** KEEPAREAM1: {varchar(30)} */
    protected String _keepaream1;

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
        return "E_ORDER_SPLIT_DATA";
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
        if (_orderSplitDataId == null) { return false; }
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
        if (obj instanceof BsEOrderSplitData) {
            BsEOrderSplitData other = (BsEOrderSplitData)obj;
            if (!xSV(_orderSplitDataId, other._orderSplitDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _orderSplitDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_orderSplitDataId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_recFlg));
        sb.append(dm).append(xfND(_srwhcd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_dlvrnk));
        sb.append(dm).append(xfND(_dlvsnm));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_sscd));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_zzordymd));
        sb.append(dm).append(xfND(_slpmrgtmg));
        sb.append(dm).append(xfND(_ordgr));
        sb.append(dm).append(xfND(_s));
        sb.append(dm).append(xfND(_h));
        sb.append(dm).append(xfND(_m));
        sb.append(dm).append(xfND(_srymd));
        sb.append(dm).append(xfND(_rlybscd));
        sb.append(dm).append(xfND(_keepareah1));
        sb.append(dm).append(xfND(_slptyp));
        sb.append(dm).append(xfND(_cmpcd));
        sb.append(dm).append(xfND(_slpno));
        sb.append(dm).append(xfND(_slediv));
        sb.append(dm).append(xfND(_cngprtslpno));
        sb.append(dm).append(xfND(_spplymd));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_keepareah2));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_boxno));
        sb.append(dm).append(xfND(_boxtype));
        sb.append(dm).append(xfND(_zzmatnrtotal));
        sb.append(dm).append(xfND(_boxnocnsnm));
        sb.append(dm).append(xfND(_bxoszl));
        sb.append(dm).append(xfND(_bxoszh));
        sb.append(dm).append(xfND(_bxoszw));
        sb.append(dm).append(xfND(_boxtotalweigh));
        sb.append(dm).append(xfND(_weightype));
        sb.append(dm).append(xfND(_boxtotalnumber));
        sb.append(dm).append(xfND(_keepaream1));
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
    public EOrderSplitData clone() {
        return (EOrderSplitData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * オーダー分割結果データ送信ID
     * @return The value of the column 'ORDER_SPLIT_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getOrderSplitDataId() {
        checkSpecifiedProperty("orderSplitDataId");
        return _orderSplitDataId;
    }

    /**
     * [set] ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * オーダー分割結果データ送信ID
     * @param orderSplitDataId The value of the column 'ORDER_SPLIT_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOrderSplitDataId(Long orderSplitDataId) {
        registerModifiedProperty("orderSplitDataId");
        _orderSplitDataId = orderSplitDataId;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
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
     * [get] REC_FLG: {varchar(30)} <br>
     * レコード区分
     * @return The value of the column 'REC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecFlg() {
        checkSpecifiedProperty("recFlg");
        return convertEmptyToNull(_recFlg);
    }

    /**
     * [set] REC_FLG: {varchar(30)} <br>
     * レコード区分
     * @param recFlg The value of the column 'REC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecFlg(String recFlg) {
        registerModifiedProperty("recFlg");
        _recFlg = recFlg;
    }

    /**
     * [get] SRWHCD: {varchar(30)} <br>
     * 仕分拠点コード
     * @return The value of the column 'SRWHCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrwhcd() {
        checkSpecifiedProperty("srwhcd");
        return convertEmptyToNull(_srwhcd);
    }

    /**
     * [set] SRWHCD: {varchar(30)} <br>
     * 仕分拠点コード
     * @param srwhcd The value of the column 'SRWHCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrwhcd(String srwhcd) {
        registerModifiedProperty("srwhcd");
        _srwhcd = srwhcd;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点コード
     * @return The value of the column 'DPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点コード
     * @param dpcd The value of the column 'DPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] DED: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed even if selected: for no constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {char(1)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] DLVRNK: {varchar(30)} <br>
     * 配達順位
     * @return The value of the column 'DLVRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvrnk() {
        checkSpecifiedProperty("dlvrnk");
        return convertEmptyToNull(_dlvrnk);
    }

    /**
     * [set] DLVRNK: {varchar(30)} <br>
     * 配達順位
     * @param dlvrnk The value of the column 'DLVRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvrnk(String dlvrnk) {
        registerModifiedProperty("dlvrnk");
        _dlvrnk = dlvrnk;
    }

    /**
     * [get] DLVSNM: {bigint(19)} <br>
     * 仕分通番
     * @return The value of the column 'DLVSNM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDlvsnm() {
        checkSpecifiedProperty("dlvsnm");
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {bigint(19)} <br>
     * 仕分通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvsnm(Long dlvsnm) {
        registerModifiedProperty("dlvsnm");
        _dlvsnm = dlvsnm;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] SSCD: {varchar(30)} <br>
     * お得意様コード
     * @return The value of the column 'SSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscd() {
        checkSpecifiedProperty("sscd");
        return convertEmptyToNull(_sscd);
    }

    /**
     * [set] SSCD: {varchar(30)} <br>
     * お得意様コード
     * @param sscd The value of the column 'SSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscd(String sscd) {
        registerModifiedProperty("sscd");
        _sscd = sscd;
    }

    /**
     * [get] DLVYMD: {varchar(8)} <br>
     * 販売年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvymd() {
        checkSpecifiedProperty("dlvymd");
        return convertEmptyToNull(_dlvymd);
    }

    /**
     * [set] DLVYMD: {varchar(8)} <br>
     * 販売年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvymd(String dlvymd) {
        registerModifiedProperty("dlvymd");
        _dlvymd = dlvymd;
    }

    /**
     * [get] ZZORDYMD: {varchar(8)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzordymd() {
        checkSpecifiedProperty("zzordymd");
        return convertEmptyToNull(_zzordymd);
    }

    /**
     * [set] ZZORDYMD: {varchar(8)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzordymd(String zzordymd) {
        registerModifiedProperty("zzordymd");
        _zzordymd = zzordymd;
    }

    /**
     * [get] SLPMRGTMG: {varchar(30)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'SLPMRGTMG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlpmrgtmg() {
        checkSpecifiedProperty("slpmrgtmg");
        return convertEmptyToNull(_slpmrgtmg);
    }

    /**
     * [set] SLPMRGTMG: {varchar(30)} <br>
     * 帳票マージタイミング
     * @param slpmrgtmg The value of the column 'SLPMRGTMG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlpmrgtmg(String slpmrgtmg) {
        registerModifiedProperty("slpmrgtmg");
        _slpmrgtmg = slpmrgtmg;
    }

    /**
     * [get] ORDGR: {varchar(30)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdgr() {
        checkSpecifiedProperty("ordgr");
        return convertEmptyToNull(_ordgr);
    }

    /**
     * [set] ORDGR: {varchar(30)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdgr(String ordgr) {
        registerModifiedProperty("ordgr");
        _ordgr = ordgr;
    }

    /**
     * [get] S: {bigint(19)} <br>
     * 正箱個口
     * @return The value of the column 'S'. (NullAllowed even if selected: for no constraint)
     */
    public Long getS() {
        checkSpecifiedProperty("s");
        return _s;
    }

    /**
     * [set] S: {bigint(19)} <br>
     * 正箱個口
     * @param s The value of the column 'S'. (NullAllowed: null update allowed for no constraint)
     */
    public void setS(Long s) {
        registerModifiedProperty("s");
        _s = s;
    }

    /**
     * [get] H: {bigint(19)} <br>
     * 半箱個口
     * @return The value of the column 'H'. (NullAllowed even if selected: for no constraint)
     */
    public Long getH() {
        checkSpecifiedProperty("h");
        return _h;
    }

    /**
     * [set] H: {bigint(19)} <br>
     * 半箱個口
     * @param h The value of the column 'H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setH(Long h) {
        registerModifiedProperty("h");
        _h = h;
    }

    /**
     * [get] M: {bigint(19)} <br>
     * 丸段個口
     * @return The value of the column 'M'. (NullAllowed even if selected: for no constraint)
     */
    public Long getM() {
        checkSpecifiedProperty("m");
        return _m;
    }

    /**
     * [set] M: {bigint(19)} <br>
     * 丸段個口
     * @param m The value of the column 'M'. (NullAllowed: null update allowed for no constraint)
     */
    public void setM(Long m) {
        registerModifiedProperty("m");
        _m = m;
    }

    /**
     * [get] SRYMD: {varchar(8)} <br>
     * 仕分年月日
     * @return The value of the column 'SRYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrymd() {
        checkSpecifiedProperty("srymd");
        return convertEmptyToNull(_srymd);
    }

    /**
     * [set] SRYMD: {varchar(8)} <br>
     * 仕分年月日
     * @param srymd The value of the column 'SRYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrymd(String srymd) {
        registerModifiedProperty("srymd");
        _srymd = srymd;
    }

    /**
     * [get] RLYBSCD: {varchar(30)} <br>
     * 中継拠点コード
     * @return The value of the column 'RLYBSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybscd() {
        checkSpecifiedProperty("rlybscd");
        return convertEmptyToNull(_rlybscd);
    }

    /**
     * [set] RLYBSCD: {varchar(30)} <br>
     * 中継拠点コード
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybscd(String rlybscd) {
        registerModifiedProperty("rlybscd");
        _rlybscd = rlybscd;
    }

    /**
     * [get] KEEPAREAH1: {varchar(30)} <br>
     * 拡張項目親ヘッダ
     * @return The value of the column 'KEEPAREAH1'. (NullAllowed even if selected: for no constraint)
     */
    public String getKeepareah1() {
        checkSpecifiedProperty("keepareah1");
        return convertEmptyToNull(_keepareah1);
    }

    /**
     * [set] KEEPAREAH1: {varchar(30)} <br>
     * 拡張項目親ヘッダ
     * @param keepareah1 The value of the column 'KEEPAREAH1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKeepareah1(String keepareah1) {
        registerModifiedProperty("keepareah1");
        _keepareah1 = keepareah1;
    }

    /**
     * [get] SLPTYP: {varchar(30)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLPTYP'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlptyp() {
        checkSpecifiedProperty("slptyp");
        return convertEmptyToNull(_slptyp);
    }

    /**
     * [set] SLPTYP: {varchar(30)} <br>
     * 伝票タイプ
     * @param slptyp The value of the column 'SLPTYP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlptyp(String slptyp) {
        registerModifiedProperty("slptyp");
        _slptyp = slptyp;
    }

    /**
     * [get] CMPCD: {varchar(30)} <br>
     * 会社コード
     * @return The value of the column 'CMPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmpcd() {
        checkSpecifiedProperty("cmpcd");
        return convertEmptyToNull(_cmpcd);
    }

    /**
     * [set] CMPCD: {varchar(30)} <br>
     * 会社コード
     * @param cmpcd The value of the column 'CMPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmpcd(String cmpcd) {
        registerModifiedProperty("cmpcd");
        _cmpcd = cmpcd;
    }

    /**
     * [get] SLPNO: {varchar(30)} <br>
     * 伝票番号
     * @return The value of the column 'SLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlpno() {
        checkSpecifiedProperty("slpno");
        return convertEmptyToNull(_slpno);
    }

    /**
     * [set] SLPNO: {varchar(30)} <br>
     * 伝票番号
     * @param slpno The value of the column 'SLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlpno(String slpno) {
        registerModifiedProperty("slpno");
        _slpno = slpno;
    }

    /**
     * [get] SLEDIV: {varchar(30)} <br>
     * 販売区分
     * @return The value of the column 'SLEDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlediv() {
        checkSpecifiedProperty("slediv");
        return convertEmptyToNull(_slediv);
    }

    /**
     * [set] SLEDIV: {varchar(30)} <br>
     * 販売区分
     * @param slediv The value of the column 'SLEDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlediv(String slediv) {
        registerModifiedProperty("slediv");
        _slediv = slediv;
    }

    /**
     * [get] CNGPRTSLPNO: {varchar(30)} <br>
     * 相手伝票番号
     * @return The value of the column 'CNGPRTSLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCngprtslpno() {
        checkSpecifiedProperty("cngprtslpno");
        return convertEmptyToNull(_cngprtslpno);
    }

    /**
     * [set] CNGPRTSLPNO: {varchar(30)} <br>
     * 相手伝票番号
     * @param cngprtslpno The value of the column 'CNGPRTSLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCngprtslpno(String cngprtslpno) {
        registerModifiedProperty("cngprtslpno");
        _cngprtslpno = cngprtslpno;
    }

    /**
     * [get] SPPLYMD: {varchar(8)} <br>
     * 出荷予定日
     * @return The value of the column 'SPPLYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpplymd() {
        checkSpecifiedProperty("spplymd");
        return convertEmptyToNull(_spplymd);
    }

    /**
     * [set] SPPLYMD: {varchar(8)} <br>
     * 出荷予定日
     * @param spplymd The value of the column 'SPPLYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpplymd(String spplymd) {
        registerModifiedProperty("spplymd");
        _spplymd = spplymd;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] KEEPAREAH2: {varchar(30)} <br>
     * 拡張項目子ヘッダ
     * @return The value of the column 'KEEPAREAH2'. (NullAllowed even if selected: for no constraint)
     */
    public String getKeepareah2() {
        checkSpecifiedProperty("keepareah2");
        return convertEmptyToNull(_keepareah2);
    }

    /**
     * [set] KEEPAREAH2: {varchar(30)} <br>
     * 拡張項目子ヘッダ
     * @param keepareah2 The value of the column 'KEEPAREAH2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKeepareah2(String keepareah2) {
        registerModifiedProperty("keepareah2");
        _keepareah2 = keepareah2;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @return The value of the column 'ZZMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
    }

    /**
     * [get] BOXNO: {varchar(30)} <br>
     * 箱No
     * @return The value of the column 'BOXNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxno() {
        checkSpecifiedProperty("boxno");
        return convertEmptyToNull(_boxno);
    }

    /**
     * [set] BOXNO: {varchar(30)} <br>
     * 箱No
     * @param boxno The value of the column 'BOXNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxno(String boxno) {
        registerModifiedProperty("boxno");
        _boxno = boxno;
    }

    /**
     * [get] BOXTYPE: {varchar(30)} <br>
     * 段ボール種類
     * @return The value of the column 'BOXTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxtype() {
        checkSpecifiedProperty("boxtype");
        return convertEmptyToNull(_boxtype);
    }

    /**
     * [set] BOXTYPE: {varchar(30)} <br>
     * 段ボール種類
     * @param boxtype The value of the column 'BOXTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxtype(String boxtype) {
        registerModifiedProperty("boxtype");
        _boxtype = boxtype;
    }

    /**
     * [get] ZZMATNRTOTAL: {bigint(19)} <br>
     * カートン数
     * @return The value of the column 'ZZMATNRTOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZzmatnrtotal() {
        checkSpecifiedProperty("zzmatnrtotal");
        return _zzmatnrtotal;
    }

    /**
     * [set] ZZMATNRTOTAL: {bigint(19)} <br>
     * カートン数
     * @param zzmatnrtotal The value of the column 'ZZMATNRTOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnrtotal(Long zzmatnrtotal) {
        registerModifiedProperty("zzmatnrtotal");
        _zzmatnrtotal = zzmatnrtotal;
    }

    /**
     * [get] BOXNOCNSNM: {varchar(30)} <br>
     * 箱No（通番）
     * @return The value of the column 'BOXNOCNSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxnocnsnm() {
        checkSpecifiedProperty("boxnocnsnm");
        return convertEmptyToNull(_boxnocnsnm);
    }

    /**
     * [set] BOXNOCNSNM: {varchar(30)} <br>
     * 箱No（通番）
     * @param boxnocnsnm The value of the column 'BOXNOCNSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxnocnsnm(String boxnocnsnm) {
        registerModifiedProperty("boxnocnsnm");
        _boxnocnsnm = boxnocnsnm;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * 梱包ケースサイズ(縦)
     * @return The value of the column 'BXOSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszl() {
        checkSpecifiedProperty("bxoszl");
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * 梱包ケースサイズ(縦)
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszl(Long bxoszl) {
        registerModifiedProperty("bxoszl");
        _bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * 梱包ケースサイズ(高さ)
     * @return The value of the column 'BXOSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszh() {
        checkSpecifiedProperty("bxoszh");
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * 梱包ケースサイズ(高さ)
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszh(Long bxoszh) {
        registerModifiedProperty("bxoszh");
        _bxoszh = bxoszh;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * 梱包ケースサイズ(横)
     * @return The value of the column 'BXOSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszw() {
        checkSpecifiedProperty("bxoszw");
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * 梱包ケースサイズ(横)
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszw(Long bxoszw) {
        registerModifiedProperty("bxoszw");
        _bxoszw = bxoszw;
    }

    /**
     * [get] BOXTOTALWEIGH: {bigint(19)} <br>
     * 梱包総重量
     * @return The value of the column 'BOXTOTALWEIGH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxtotalweigh() {
        checkSpecifiedProperty("boxtotalweigh");
        return _boxtotalweigh;
    }

    /**
     * [set] BOXTOTALWEIGH: {bigint(19)} <br>
     * 梱包総重量
     * @param boxtotalweigh The value of the column 'BOXTOTALWEIGH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxtotalweigh(Long boxtotalweigh) {
        registerModifiedProperty("boxtotalweigh");
        _boxtotalweigh = boxtotalweigh;
    }

    /**
     * [get] WEIGHTYPE: {varchar(30)} <br>
     * 重量識別区分
     * @return The value of the column 'WEIGHTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getWeightype() {
        checkSpecifiedProperty("weightype");
        return convertEmptyToNull(_weightype);
    }

    /**
     * [set] WEIGHTYPE: {varchar(30)} <br>
     * 重量識別区分
     * @param weightype The value of the column 'WEIGHTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeightype(String weightype) {
        registerModifiedProperty("weightype");
        _weightype = weightype;
    }

    /**
     * [get] BOXTOTALNUMBER: {bigint(19)} <br>
     * 梱包内総数量
     * @return The value of the column 'BOXTOTALNUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxtotalnumber() {
        checkSpecifiedProperty("boxtotalnumber");
        return _boxtotalnumber;
    }

    /**
     * [set] BOXTOTALNUMBER: {bigint(19)} <br>
     * 梱包内総数量
     * @param boxtotalnumber The value of the column 'BOXTOTALNUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxtotalnumber(Long boxtotalnumber) {
        registerModifiedProperty("boxtotalnumber");
        _boxtotalnumber = boxtotalnumber;
    }

    /**
     * [get] KEEPAREAM1: {varchar(30)} <br>
     * 拡張項目明細
     * @return The value of the column 'KEEPAREAM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getKeepaream1() {
        checkSpecifiedProperty("keepaream1");
        return convertEmptyToNull(_keepaream1);
    }

    /**
     * [set] KEEPAREAM1: {varchar(30)} <br>
     * 拡張項目明細
     * @param keepaream1 The value of the column 'KEEPAREAM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKeepaream1(String keepaream1) {
        registerModifiedProperty("keepaream1");
        _keepaream1 = keepaream1;
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
