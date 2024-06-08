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
 * The entity of T_CLCKINV as TABLE. <br>
 * 仕分用論理在庫
 * <pre>
 * [primary-key]
 *     CLCKINV_ID
 *
 * [column]
 *     CLCKINV_ID, CENTER_ID, LOCATION_ID, PRESRCBQA, PRESRCTQA, LCKCBIVQ, LCKCTIVQ, DSCBQA, DSCTQA, TOSPLCBQA, TOSPLCTQA, PRESPLCBQA, PRESPLCTQA, TSTINVCB, TSTINVCT, TSPLCB, TSPLCT, TPRESPLCB, TPRESPLCT, TINVMDTCB, TINVMDTCT, CSPLNUN, UPFG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLCKINV_ID
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
 * Long clckinvId = entity.getClckinvId();
 * Long centerId = entity.getCenterId();
 * Long locationId = entity.getLocationId();
 * Long presrcbqa = entity.getPresrcbqa();
 * Long presrctqa = entity.getPresrctqa();
 * Long lckcbivq = entity.getLckcbivq();
 * Long lckctivq = entity.getLckctivq();
 * Long dscbqa = entity.getDscbqa();
 * Long dsctqa = entity.getDsctqa();
 * Long tosplcbqa = entity.getTosplcbqa();
 * Long tosplctqa = entity.getTosplctqa();
 * Long presplcbqa = entity.getPresplcbqa();
 * Long presplctqa = entity.getPresplctqa();
 * Long tstinvcb = entity.getTstinvcb();
 * Long tstinvct = entity.getTstinvct();
 * Long tsplcb = entity.getTsplcb();
 * Long tsplct = entity.getTsplct();
 * Long tpresplcb = entity.getTpresplcb();
 * Long tpresplct = entity.getTpresplct();
 * Long tinvmdtcb = entity.getTinvmdtcb();
 * Long tinvmdtct = entity.getTinvmdtct();
 * Long csplnun = entity.getCsplnun();
 * String upfg = entity.getUpfg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setClckinvId(clckinvId);
 * entity.setCenterId(centerId);
 * entity.setLocationId(locationId);
 * entity.setPresrcbqa(presrcbqa);
 * entity.setPresrctqa(presrctqa);
 * entity.setLckcbivq(lckcbivq);
 * entity.setLckctivq(lckctivq);
 * entity.setDscbqa(dscbqa);
 * entity.setDsctqa(dsctqa);
 * entity.setTosplcbqa(tosplcbqa);
 * entity.setTosplctqa(tosplctqa);
 * entity.setPresplcbqa(presplcbqa);
 * entity.setPresplctqa(presplctqa);
 * entity.setTstinvcb(tstinvcb);
 * entity.setTstinvct(tstinvct);
 * entity.setTsplcb(tsplcb);
 * entity.setTsplct(tsplct);
 * entity.setTpresplcb(tpresplcb);
 * entity.setTpresplct(tpresplct);
 * entity.setTinvmdtcb(tinvmdtcb);
 * entity.setTinvmdtct(tinvmdtct);
 * entity.setCsplnun(csplnun);
 * entity.setUpfg(upfg);
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
public abstract class BsTClckinv extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _clckinvId;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** PRESRCBQA: {bigint(19)} */
    protected Long _presrcbqa;

    /** PRESRCTQA: {bigint(19)} */
    protected Long _presrctqa;

    /** LCKCBIVQ: {bigint(19)} */
    protected Long _lckcbivq;

    /** LCKCTIVQ: {bigint(19)} */
    protected Long _lckctivq;

    /** DSCBQA: {bigint(19)} */
    protected Long _dscbqa;

    /** DSCTQA: {bigint(19)} */
    protected Long _dsctqa;

    /** TOSPLCBQA: {bigint(19)} */
    protected Long _tosplcbqa;

    /** TOSPLCTQA: {bigint(19)} */
    protected Long _tosplctqa;

    /** PRESPLCBQA: {bigint(19)} */
    protected Long _presplcbqa;

    /** PRESPLCTQA: {bigint(19)} */
    protected Long _presplctqa;

    /** TSTINVCB: {bigint(19)} */
    protected Long _tstinvcb;

    /** TSTINVCT: {bigint(19)} */
    protected Long _tstinvct;

    /** TSPLCB: {bigint(19)} */
    protected Long _tsplcb;

    /** TSPLCT: {bigint(19)} */
    protected Long _tsplct;

    /** TPRESPLCB: {bigint(19)} */
    protected Long _tpresplcb;

    /** TPRESPLCT: {bigint(19)} */
    protected Long _tpresplct;

    /** TINVMDTCB: {bigint(19)} */
    protected Long _tinvmdtcb;

    /** TINVMDTCT: {bigint(19)} */
    protected Long _tinvmdtct;

    /** CSPLNUN: {bigint(19)} */
    protected Long _csplnun;

    /** UPFG: {NotNull, varchar(30), default=[0]} */
    protected String _upfg;

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
        return "T_CLCKINV";
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
        if (_clckinvId == null) { return false; }
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
        if (obj instanceof BsTClckinv) {
            BsTClckinv other = (BsTClckinv)obj;
            if (!xSV(_clckinvId, other._clckinvId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clckinvId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clckinvId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_presrcbqa));
        sb.append(dm).append(xfND(_presrctqa));
        sb.append(dm).append(xfND(_lckcbivq));
        sb.append(dm).append(xfND(_lckctivq));
        sb.append(dm).append(xfND(_dscbqa));
        sb.append(dm).append(xfND(_dsctqa));
        sb.append(dm).append(xfND(_tosplcbqa));
        sb.append(dm).append(xfND(_tosplctqa));
        sb.append(dm).append(xfND(_presplcbqa));
        sb.append(dm).append(xfND(_presplctqa));
        sb.append(dm).append(xfND(_tstinvcb));
        sb.append(dm).append(xfND(_tstinvct));
        sb.append(dm).append(xfND(_tsplcb));
        sb.append(dm).append(xfND(_tsplct));
        sb.append(dm).append(xfND(_tpresplcb));
        sb.append(dm).append(xfND(_tpresplct));
        sb.append(dm).append(xfND(_tinvmdtcb));
        sb.append(dm).append(xfND(_tinvmdtct));
        sb.append(dm).append(xfND(_csplnun));
        sb.append(dm).append(xfND(_upfg));
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
    public TClckinv clone() {
        return (TClckinv)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分用論理在庫ID
     * @return The value of the column 'CLCKINV_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClckinvId() {
        checkSpecifiedProperty("clckinvId");
        return _clckinvId;
    }

    /**
     * [set] CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分用論理在庫ID
     * @param clckinvId The value of the column 'CLCKINV_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClckinvId(Long clckinvId) {
        registerModifiedProperty("clckinvId");
        _clckinvId = clckinvId;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] PRESRCBQA: {bigint(19)} <br>
     * 仕分前在庫(ダンボール)
     * @return The value of the column 'PRESRCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresrcbqa() {
        checkSpecifiedProperty("presrcbqa");
        return _presrcbqa;
    }

    /**
     * [set] PRESRCBQA: {bigint(19)} <br>
     * 仕分前在庫(ダンボール)
     * @param presrcbqa The value of the column 'PRESRCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresrcbqa(Long presrcbqa) {
        registerModifiedProperty("presrcbqa");
        _presrcbqa = presrcbqa;
    }

    /**
     * [get] PRESRCTQA: {bigint(19)} <br>
     * 仕分前在庫(カートン)
     * @return The value of the column 'PRESRCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresrctqa() {
        checkSpecifiedProperty("presrctqa");
        return _presrctqa;
    }

    /**
     * [set] PRESRCTQA: {bigint(19)} <br>
     * 仕分前在庫(カートン)
     * @param presrctqa The value of the column 'PRESRCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresrctqa(Long presrctqa) {
        registerModifiedProperty("presrctqa");
        _presrctqa = presrctqa;
    }

    /**
     * [get] LCKCBIVQ: {bigint(19)} <br>
     * 仕分後在庫(ダンボール)
     * @return The value of the column 'LCKCBIVQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLckcbivq() {
        checkSpecifiedProperty("lckcbivq");
        return _lckcbivq;
    }

    /**
     * [set] LCKCBIVQ: {bigint(19)} <br>
     * 仕分後在庫(ダンボール)
     * @param lckcbivq The value of the column 'LCKCBIVQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLckcbivq(Long lckcbivq) {
        registerModifiedProperty("lckcbivq");
        _lckcbivq = lckcbivq;
    }

    /**
     * [get] LCKCTIVQ: {bigint(19)} <br>
     * 仕分後在庫(カートン)
     * @return The value of the column 'LCKCTIVQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLckctivq() {
        checkSpecifiedProperty("lckctivq");
        return _lckctivq;
    }

    /**
     * [set] LCKCTIVQ: {bigint(19)} <br>
     * 仕分後在庫(カートン)
     * @param lckctivq The value of the column 'LCKCTIVQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLckctivq(Long lckctivq) {
        registerModifiedProperty("lckctivq");
        _lckctivq = lckctivq;
    }

    /**
     * [get] DSCBQA: {bigint(19)} <br>
     * 払い出し(ダンボール)
     * @return The value of the column 'DSCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDscbqa() {
        checkSpecifiedProperty("dscbqa");
        return _dscbqa;
    }

    /**
     * [set] DSCBQA: {bigint(19)} <br>
     * 払い出し(ダンボール)
     * @param dscbqa The value of the column 'DSCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDscbqa(Long dscbqa) {
        registerModifiedProperty("dscbqa");
        _dscbqa = dscbqa;
    }

    /**
     * [get] DSCTQA: {bigint(19)} <br>
     * 払い出し(カートン)
     * @return The value of the column 'DSCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDsctqa() {
        checkSpecifiedProperty("dsctqa");
        return _dsctqa;
    }

    /**
     * [set] DSCTQA: {bigint(19)} <br>
     * 払い出し(カートン)
     * @param dsctqa The value of the column 'DSCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDsctqa(Long dsctqa) {
        registerModifiedProperty("dsctqa");
        _dsctqa = dsctqa;
    }

    /**
     * [get] TOSPLCBQA: {bigint(19)} <br>
     * 今回当日補充数(ダンボール)
     * @return The value of the column 'TOSPLCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTosplcbqa() {
        checkSpecifiedProperty("tosplcbqa");
        return _tosplcbqa;
    }

    /**
     * [set] TOSPLCBQA: {bigint(19)} <br>
     * 今回当日補充数(ダンボール)
     * @param tosplcbqa The value of the column 'TOSPLCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTosplcbqa(Long tosplcbqa) {
        registerModifiedProperty("tosplcbqa");
        _tosplcbqa = tosplcbqa;
    }

    /**
     * [get] TOSPLCTQA: {bigint(19)} <br>
     * 今回当日補充数(カートン)
     * @return The value of the column 'TOSPLCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTosplctqa() {
        checkSpecifiedProperty("tosplctqa");
        return _tosplctqa;
    }

    /**
     * [set] TOSPLCTQA: {bigint(19)} <br>
     * 今回当日補充数(カートン)
     * @param tosplctqa The value of the column 'TOSPLCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTosplctqa(Long tosplctqa) {
        registerModifiedProperty("tosplctqa");
        _tosplctqa = tosplctqa;
    }

    /**
     * [get] PRESPLCBQA: {bigint(19)} <br>
     * 今回事前補充数(ダンボール)
     * @return The value of the column 'PRESPLCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresplcbqa() {
        checkSpecifiedProperty("presplcbqa");
        return _presplcbqa;
    }

    /**
     * [set] PRESPLCBQA: {bigint(19)} <br>
     * 今回事前補充数(ダンボール)
     * @param presplcbqa The value of the column 'PRESPLCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresplcbqa(Long presplcbqa) {
        registerModifiedProperty("presplcbqa");
        _presplcbqa = presplcbqa;
    }

    /**
     * [get] PRESPLCTQA: {bigint(19)} <br>
     * 今回事前補充数(カートン)
     * @return The value of the column 'PRESPLCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPresplctqa() {
        checkSpecifiedProperty("presplctqa");
        return _presplctqa;
    }

    /**
     * [set] PRESPLCTQA: {bigint(19)} <br>
     * 今回事前補充数(カートン)
     * @param presplctqa The value of the column 'PRESPLCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresplctqa(Long presplctqa) {
        registerModifiedProperty("presplctqa");
        _presplctqa = presplctqa;
    }

    /**
     * [get] TSTINVCB: {bigint(19)} <br>
     * 当日開始在庫数(ダンボール)
     * @return The value of the column 'TSTINVCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTstinvcb() {
        checkSpecifiedProperty("tstinvcb");
        return _tstinvcb;
    }

    /**
     * [set] TSTINVCB: {bigint(19)} <br>
     * 当日開始在庫数(ダンボール)
     * @param tstinvcb The value of the column 'TSTINVCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTstinvcb(Long tstinvcb) {
        registerModifiedProperty("tstinvcb");
        _tstinvcb = tstinvcb;
    }

    /**
     * [get] TSTINVCT: {bigint(19)} <br>
     * 当日開始在庫数(カートン)
     * @return The value of the column 'TSTINVCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTstinvct() {
        checkSpecifiedProperty("tstinvct");
        return _tstinvct;
    }

    /**
     * [set] TSTINVCT: {bigint(19)} <br>
     * 当日開始在庫数(カートン)
     * @param tstinvct The value of the column 'TSTINVCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTstinvct(Long tstinvct) {
        registerModifiedProperty("tstinvct");
        _tstinvct = tstinvct;
    }

    /**
     * [get] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計（ダンボール）
     * @return The value of the column 'TSPLCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTsplcb() {
        checkSpecifiedProperty("tsplcb");
        return _tsplcb;
    }

    /**
     * [set] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計（ダンボール）
     * @param tsplcb The value of the column 'TSPLCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsplcb(Long tsplcb) {
        registerModifiedProperty("tsplcb");
        _tsplcb = tsplcb;
    }

    /**
     * [get] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計（カートン）
     * @return The value of the column 'TSPLCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTsplct() {
        checkSpecifiedProperty("tsplct");
        return _tsplct;
    }

    /**
     * [set] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計（カートン）
     * @param tsplct The value of the column 'TSPLCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTsplct(Long tsplct) {
        registerModifiedProperty("tsplct");
        _tsplct = tsplct;
    }

    /**
     * [get] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計（ダンボール）
     * @return The value of the column 'TPRESPLCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTpresplcb() {
        checkSpecifiedProperty("tpresplcb");
        return _tpresplcb;
    }

    /**
     * [set] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計（ダンボール）
     * @param tpresplcb The value of the column 'TPRESPLCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTpresplcb(Long tpresplcb) {
        registerModifiedProperty("tpresplcb");
        _tpresplcb = tpresplcb;
    }

    /**
     * [get] TPRESPLCT: {bigint(19)} <br>
     * 当日事前補充数合計(カートン)
     * @return The value of the column 'TPRESPLCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTpresplct() {
        checkSpecifiedProperty("tpresplct");
        return _tpresplct;
    }

    /**
     * [set] TPRESPLCT: {bigint(19)} <br>
     * 当日事前補充数合計(カートン)
     * @param tpresplct The value of the column 'TPRESPLCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTpresplct(Long tpresplct) {
        registerModifiedProperty("tpresplct");
        _tpresplct = tpresplct;
    }

    /**
     * [get] TINVMDTCB: {bigint(19)} <br>
     * 当日在庫修正数合計(ダンボール)
     * @return The value of the column 'TINVMDTCB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTinvmdtcb() {
        checkSpecifiedProperty("tinvmdtcb");
        return _tinvmdtcb;
    }

    /**
     * [set] TINVMDTCB: {bigint(19)} <br>
     * 当日在庫修正数合計(ダンボール)
     * @param tinvmdtcb The value of the column 'TINVMDTCB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTinvmdtcb(Long tinvmdtcb) {
        registerModifiedProperty("tinvmdtcb");
        _tinvmdtcb = tinvmdtcb;
    }

    /**
     * [get] TINVMDTCT: {bigint(19)} <br>
     * 当日在庫修正数合計(カートン)
     * @return The value of the column 'TINVMDTCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTinvmdtct() {
        checkSpecifiedProperty("tinvmdtct");
        return _tinvmdtct;
    }

    /**
     * [set] TINVMDTCT: {bigint(19)} <br>
     * 当日在庫修正数合計(カートン)
     * @param tinvmdtct The value of the column 'TINVMDTCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTinvmdtct(Long tinvmdtct) {
        registerModifiedProperty("tinvmdtct");
        _tinvmdtct = tinvmdtct;
    }

    /**
     * [get] CSPLNUN: {bigint(19)} <br>
     * 今回補充回数
     * @return The value of the column 'CSPLNUN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCsplnun() {
        checkSpecifiedProperty("csplnun");
        return _csplnun;
    }

    /**
     * [set] CSPLNUN: {bigint(19)} <br>
     * 今回補充回数
     * @param csplnun The value of the column 'CSPLNUN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsplnun(Long csplnun) {
        registerModifiedProperty("csplnun");
        _csplnun = csplnun;
    }

    /**
     * [get] UPFG: {NotNull, varchar(30), default=[0]} <br>
     * 自動割付ロケ不定棚フラグ
     * @return The value of the column 'UPFG'. (basically NotNull if selected: for the constraint)
     */
    public String getUpfg() {
        checkSpecifiedProperty("upfg");
        return convertEmptyToNull(_upfg);
    }

    /**
     * [set] UPFG: {NotNull, varchar(30), default=[0]} <br>
     * 自動割付ロケ不定棚フラグ
     * @param upfg The value of the column 'UPFG'. (basically NotNull if update: for the constraint)
     */
    public void setUpfg(String upfg) {
        registerModifiedProperty("upfg");
        _upfg = upfg;
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
