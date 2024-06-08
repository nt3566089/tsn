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
 * The entity of W_CDRCATT_INST_INPUT as TABLE. <br>
 * 方面属性一括取込ワーク
 * <pre>
 * [primary-key]
 *     CDRCATT_INST_INPUT_ID
 *
 * [column]
 *     CDRCATT_INST_INPUT_ID, RECEIVE_CD, CENTER_CD, CLIENT_CD, COMPANY_CD, DPCD, DRCCD, ZZPSTNID, SRLIN, SRRNK, SNMPRTRNKAD, SRWKDY, COMT, SPRPRSID, ODDVID, HDRDBXUSID, IKEIINCLDFLG, REMOTEISLAND, ZZFRDATEH, ZZTODATEH, GRTNID, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CDRCATT_INST_INPUT_ID
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
 * Long cdrcattInstInputId = entity.getCdrcattInstInputId();
 * String receiveCd = entity.getReceiveCd();
 * String centerCd = entity.getCenterCd();
 * String clientCd = entity.getClientCd();
 * String companyCd = entity.getCompanyCd();
 * String dpcd = entity.getDpcd();
 * String drccd = entity.getDrccd();
 * String zzpstnid = entity.getZzpstnid();
 * String srlin = entity.getSrlin();
 * Long srrnk = entity.getSrrnk();
 * String snmprtrnkad = entity.getSnmprtrnkad();
 * java.math.BigDecimal srwkdy = entity.getSrwkdy();
 * String comt = entity.getComt();
 * String sprprsid = entity.getSprprsid();
 * String oddvid = entity.getOddvid();
 * String hdrdbxusid = entity.getHdrdbxusid();
 * String ikeiincldflg = entity.getIkeiincldflg();
 * String remoteisland = entity.getRemoteisland();
 * String zzfrdateh = entity.getZzfrdateh();
 * String zztodateh = entity.getZztodateh();
 * String grtnid = entity.getGrtnid();
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
 * entity.setCdrcattInstInputId(cdrcattInstInputId);
 * entity.setReceiveCd(receiveCd);
 * entity.setCenterCd(centerCd);
 * entity.setClientCd(clientCd);
 * entity.setCompanyCd(companyCd);
 * entity.setDpcd(dpcd);
 * entity.setDrccd(drccd);
 * entity.setZzpstnid(zzpstnid);
 * entity.setSrlin(srlin);
 * entity.setSrrnk(srrnk);
 * entity.setSnmprtrnkad(snmprtrnkad);
 * entity.setSrwkdy(srwkdy);
 * entity.setComt(comt);
 * entity.setSprprsid(sprprsid);
 * entity.setOddvid(oddvid);
 * entity.setHdrdbxusid(hdrdbxusid);
 * entity.setIkeiincldflg(ikeiincldflg);
 * entity.setRemoteisland(remoteisland);
 * entity.setZzfrdateh(zzfrdateh);
 * entity.setZztodateh(zztodateh);
 * entity.setGrtnid(grtnid);
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
public abstract class BsWCdrcattInstInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _cdrcattInstInputId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    protected String _receiveCd;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** COMPANY_CD: {varchar(30)} */
    protected String _companyCd;

    /** DPCD: {varchar(30)} */
    protected String _dpcd;

    /** DRCCD: {varchar(30)} */
    protected String _drccd;

    /** ZZPSTNID: {char(1)} */
    protected String _zzpstnid;

    /** SRLIN: {varchar(30)} */
    protected String _srlin;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** SNMPRTRNKAD: {char(1)} */
    protected String _snmprtrnkad;

    /** SRWKDY: {decimal(16, 6)} */
    protected java.math.BigDecimal _srwkdy;

    /** COMT: {varchar(60)} */
    protected String _comt;

    /** SPRPRSID: {char(1)} */
    protected String _sprprsid;

    /** ODDVID: {char(1)} */
    protected String _oddvid;

    /** HDRDBXUSID: {char(1)} */
    protected String _hdrdbxusid;

    /** IKEIINCLDFLG: {char(1)} */
    protected String _ikeiincldflg;

    /** REMOTEISLAND: {varchar(30)} */
    protected String _remoteisland;

    /** ZZFRDATEH: {varchar(8)} */
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    protected String _zztodateh;

    /** GRTNID: {char(1)} */
    protected String _grtnid;

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
        return "W_CDRCATT_INST_INPUT";
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
        if (_cdrcattInstInputId == null) { return false; }
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
        if (obj instanceof BsWCdrcattInstInput) {
            BsWCdrcattInstInput other = (BsWCdrcattInstInput)obj;
            if (!xSV(_cdrcattInstInputId, other._cdrcattInstInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cdrcattInstInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cdrcattInstInputId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_companyCd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_drccd));
        sb.append(dm).append(xfND(_zzpstnid));
        sb.append(dm).append(xfND(_srlin));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_snmprtrnkad));
        sb.append(dm).append(xfND(_srwkdy));
        sb.append(dm).append(xfND(_comt));
        sb.append(dm).append(xfND(_sprprsid));
        sb.append(dm).append(xfND(_oddvid));
        sb.append(dm).append(xfND(_hdrdbxusid));
        sb.append(dm).append(xfND(_ikeiincldflg));
        sb.append(dm).append(xfND(_remoteisland));
        sb.append(dm).append(xfND(_zzfrdateh));
        sb.append(dm).append(xfND(_zztodateh));
        sb.append(dm).append(xfND(_grtnid));
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
    public WCdrcattInstInput clone() {
        return (WCdrcattInstInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性一括取込ワークID
     * @return The value of the column 'CDRCATT_INST_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCdrcattInstInputId() {
        checkSpecifiedProperty("cdrcattInstInputId");
        return _cdrcattInstInputId;
    }

    /**
     * [set] CDRCATT_INST_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 方面属性一括取込ワークID
     * @param cdrcattInstInputId The value of the column 'CDRCATT_INST_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCdrcattInstInputId(Long cdrcattInstInputId) {
        registerModifiedProperty("cdrcattInstInputId");
        _cdrcattInstInputId = cdrcattInstInputId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
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
     * [get] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyCd() {
        checkSpecifiedProperty("companyCd");
        return convertEmptyToNull(_companyCd);
    }

    /**
     * [set] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyCd(String companyCd) {
        registerModifiedProperty("companyCd");
        _companyCd = companyCd;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] DRCCD: {varchar(30)} <br>
     * 方面CD
     * @return The value of the column 'DRCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDrccd() {
        checkSpecifiedProperty("drccd");
        return convertEmptyToNull(_drccd);
    }

    /**
     * [set] DRCCD: {varchar(30)} <br>
     * 方面CD
     * @param drccd The value of the column 'DRCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDrccd(String drccd) {
        registerModifiedProperty("drccd");
        _drccd = drccd;
    }

    /**
     * [get] ZZPSTNID: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'ZZPSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzpstnid() {
        checkSpecifiedProperty("zzpstnid");
        return convertEmptyToNull(_zzpstnid);
    }

    /**
     * [set] ZZPSTNID: {char(1)} <br>
     * ピストン区分
     * @param zzpstnid The value of the column 'ZZPSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzpstnid(String zzpstnid) {
        registerModifiedProperty("zzpstnid");
        _zzpstnid = zzpstnid;
    }

    /**
     * [get] SRLIN: {varchar(30)} <br>
     * 仕分ライン
     * @return The value of the column 'SRLIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrlin() {
        checkSpecifiedProperty("srlin");
        return convertEmptyToNull(_srlin);
    }

    /**
     * [set] SRLIN: {varchar(30)} <br>
     * 仕分ライン
     * @param srlin The value of the column 'SRLIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrlin(String srlin) {
        registerModifiedProperty("srlin");
        _srlin = srlin;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrrnk() {
        checkSpecifiedProperty("srrnk");
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrrnk(Long srrnk) {
        registerModifiedProperty("srrnk");
        _srrnk = srrnk;
    }

    /**
     * [get] SNMPRTRNKAD: {char(1)} <br>
     * 通番印刷順（昇順／降順）
     * @return The value of the column 'SNMPRTRNKAD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnmprtrnkad() {
        checkSpecifiedProperty("snmprtrnkad");
        return convertEmptyToNull(_snmprtrnkad);
    }

    /**
     * [set] SNMPRTRNKAD: {char(1)} <br>
     * 通番印刷順（昇順／降順）
     * @param snmprtrnkad The value of the column 'SNMPRTRNKAD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnmprtrnkad(String snmprtrnkad) {
        registerModifiedProperty("snmprtrnkad");
        _snmprtrnkad = snmprtrnkad;
    }

    /**
     * [get] SRWKDY: {decimal(16, 6)} <br>
     * 仕分曜日
     * @return The value of the column 'SRWKDY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSrwkdy() {
        checkSpecifiedProperty("srwkdy");
        return _srwkdy;
    }

    /**
     * [set] SRWKDY: {decimal(16, 6)} <br>
     * 仕分曜日
     * @param srwkdy The value of the column 'SRWKDY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrwkdy(java.math.BigDecimal srwkdy) {
        registerModifiedProperty("srwkdy");
        _srwkdy = srwkdy;
    }

    /**
     * [get] COMT: {varchar(60)} <br>
     * コメント
     * @return The value of the column 'COMT'. (NullAllowed even if selected: for no constraint)
     */
    public String getComt() {
        checkSpecifiedProperty("comt");
        return convertEmptyToNull(_comt);
    }

    /**
     * [set] COMT: {varchar(60)} <br>
     * コメント
     * @param comt The value of the column 'COMT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComt(String comt) {
        registerModifiedProperty("comt");
        _comt = comt;
    }

    /**
     * [get] SPRPRSID: {char(1)} <br>
     * 個口圧縮区分
     * @return The value of the column 'SPRPRSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSprprsid() {
        checkSpecifiedProperty("sprprsid");
        return convertEmptyToNull(_sprprsid);
    }

    /**
     * [set] SPRPRSID: {char(1)} <br>
     * 個口圧縮区分
     * @param sprprsid The value of the column 'SPRPRSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSprprsid(String sprprsid) {
        registerModifiedProperty("sprprsid");
        _sprprsid = sprprsid;
    }

    /**
     * [get] ODDVID: {char(1)} <br>
     * オーダー分割区分
     * @return The value of the column 'ODDVID'. (NullAllowed even if selected: for no constraint)
     */
    public String getOddvid() {
        checkSpecifiedProperty("oddvid");
        return convertEmptyToNull(_oddvid);
    }

    /**
     * [set] ODDVID: {char(1)} <br>
     * オーダー分割区分
     * @param oddvid The value of the column 'ODDVID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOddvid(String oddvid) {
        registerModifiedProperty("oddvid");
        _oddvid = oddvid;
    }

    /**
     * [get] HDRDBXUSID: {char(1)} <br>
     * １００箱使用区分
     * @return The value of the column 'HDRDBXUSID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdbxusid() {
        checkSpecifiedProperty("hdrdbxusid");
        return convertEmptyToNull(_hdrdbxusid);
    }

    /**
     * [set] HDRDBXUSID: {char(1)} <br>
     * １００箱使用区分
     * @param hdrdbxusid The value of the column 'HDRDBXUSID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdbxusid(String hdrdbxusid) {
        registerModifiedProperty("hdrdbxusid");
        _hdrdbxusid = hdrdbxusid;
    }

    /**
     * [get] IKEIINCLDFLG: {char(1)} <br>
     * 異型品同梱フラグ
     * @return The value of the column 'IKEIINCLDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getIkeiincldflg() {
        checkSpecifiedProperty("ikeiincldflg");
        return convertEmptyToNull(_ikeiincldflg);
    }

    /**
     * [set] IKEIINCLDFLG: {char(1)} <br>
     * 異型品同梱フラグ
     * @param ikeiincldflg The value of the column 'IKEIINCLDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIkeiincldflg(String ikeiincldflg) {
        registerModifiedProperty("ikeiincldflg");
        _ikeiincldflg = ikeiincldflg;
    }

    /**
     * [get] REMOTEISLAND: {varchar(30)} <br>
     * 離島フラグ
     * @return The value of the column 'REMOTEISLAND'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemoteisland() {
        checkSpecifiedProperty("remoteisland");
        return convertEmptyToNull(_remoteisland);
    }

    /**
     * [set] REMOTEISLAND: {varchar(30)} <br>
     * 離島フラグ
     * @param remoteisland The value of the column 'REMOTEISLAND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemoteisland(String remoteisland) {
        registerModifiedProperty("remoteisland");
        _remoteisland = remoteisland;
    }

    /**
     * [get] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzfrdateh() {
        checkSpecifiedProperty("zzfrdateh");
        return convertEmptyToNull(_zzfrdateh);
    }

    /**
     * [set] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzfrdateh(String zzfrdateh) {
        registerModifiedProperty("zzfrdateh");
        _zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZztodateh() {
        checkSpecifiedProperty("zztodateh");
        return convertEmptyToNull(_zztodateh);
    }

    /**
     * [set] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZztodateh(String zztodateh) {
        registerModifiedProperty("zztodateh");
        _zztodateh = zztodateh;
    }

    /**
     * [get] GRTNID: {char(1)} <br>
     * 世代区分
     * @return The value of the column 'GRTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrtnid() {
        checkSpecifiedProperty("grtnid");
        return convertEmptyToNull(_grtnid);
    }

    /**
     * [set] GRTNID: {char(1)} <br>
     * 世代区分
     * @param grtnid The value of the column 'GRTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrtnid(String grtnid) {
        registerModifiedProperty("grtnid");
        _grtnid = grtnid;
    }

    /**
     * [get] LINE_NO: {bigint(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {bigint(19)} <br>
     * 行NO.
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
