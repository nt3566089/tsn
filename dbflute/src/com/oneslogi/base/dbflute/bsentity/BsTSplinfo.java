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
 * The entity of T_SPLINFO as TABLE. <br>
 * 補充情報(仕分)
 * <pre>
 * [primary-key]
 *     SPLINFO_ID
 *
 * [column]
 *     SPLINFO_ID, CENTER_ID, CLIENT_ID, SPLYMD, UPDDTM, CSPLNUN, LINBLK, LOCATION_ID, LOCATION_CD, PRODUCT_ID, PRODUCT_CD, SPLID, DPCD, DED, LOC_KBN, PRECB, PRECT, CALCB, CALCT, REQCB, REQCT, STATUS, RESCB, RESTB, ABSTOSPLCBQA, ABSTOSPLCTQA, ABSCBQA, RESCBQA, LBKBN, PRTRNK, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SPLINFO_ID
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
 * Long splinfoId = entity.getSplinfoId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String splymd = entity.getSplymd();
 * java.sql.Timestamp upddtm = entity.getUpddtm();
 * Long csplnun = entity.getCsplnun();
 * String linblk = entity.getLinblk();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * java.math.BigDecimal splid = entity.getSplid();
 * String dpcd = entity.getDpcd();
 * String ded = entity.getDed();
 * String locKbn = entity.getLocKbn();
 * Long precb = entity.getPrecb();
 * Long prect = entity.getPrect();
 * Long calcb = entity.getCalcb();
 * Long calct = entity.getCalct();
 * Long reqcb = entity.getReqcb();
 * Long reqct = entity.getReqct();
 * String status = entity.getStatus();
 * Long rescb = entity.getRescb();
 * Long restb = entity.getRestb();
 * Long abstosplcbqa = entity.getAbstosplcbqa();
 * Long abstosplctqa = entity.getAbstosplctqa();
 * Long abscbqa = entity.getAbscbqa();
 * Long rescbqa = entity.getRescbqa();
 * Long lbkbn = entity.getLbkbn();
 * Long prtrnk = entity.getPrtrnk();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSplinfoId(splinfoId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setSplymd(splymd);
 * entity.setUpddtm(upddtm);
 * entity.setCsplnun(csplnun);
 * entity.setLinblk(linblk);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setSplid(splid);
 * entity.setDpcd(dpcd);
 * entity.setDed(ded);
 * entity.setLocKbn(locKbn);
 * entity.setPrecb(precb);
 * entity.setPrect(prect);
 * entity.setCalcb(calcb);
 * entity.setCalct(calct);
 * entity.setReqcb(reqcb);
 * entity.setReqct(reqct);
 * entity.setStatus(status);
 * entity.setRescb(rescb);
 * entity.setRestb(restb);
 * entity.setAbstosplcbqa(abstosplcbqa);
 * entity.setAbstosplctqa(abstosplctqa);
 * entity.setAbscbqa(abscbqa);
 * entity.setRescbqa(rescbqa);
 * entity.setLbkbn(lbkbn);
 * entity.setPrtrnk(prtrnk);
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
public abstract class BsTSplinfo extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _splinfoId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** SPLYMD: {NotNull, varchar(8)} */
    protected String _splymd;

    /** UPDDTM: {datetime2(26, 6), default=[NULL]} */
    protected java.sql.Timestamp _upddtm;

    /** CSPLNUN: {NotNull, bigint(19)} */
    protected Long _csplnun;

    /** LINBLK: {NotNull, varchar(30)} */
    protected String _linblk;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    protected Long _locationId;

    /** LOCATION_CD: {NotNull, varchar(30)} */
    protected String _locationCd;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    protected Long _productId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** SPLID: {NotNull, decimal(16, 6), default=[(1)]} */
    protected java.math.BigDecimal _splid;

    /** DPCD: {varchar(30)} */
    protected String _dpcd;

    /** DED: {varchar(255)} */
    protected String _ded;

    /** LOC_KBN: {NotNull, char(1), default=[0]} */
    protected String _locKbn;

    /** PRECB: {NotNull, bigint(19)} */
    protected Long _precb;

    /** PRECT: {NotNull, bigint(19)} */
    protected Long _prect;

    /** CALCB: {NotNull, bigint(19)} */
    protected Long _calcb;

    /** CALCT: {NotNull, bigint(19)} */
    protected Long _calct;

    /** REQCB: {NotNull, bigint(19), default=[(0)]} */
    protected Long _reqcb;

    /** REQCT: {NotNull, bigint(19), default=[(0)]} */
    protected Long _reqct;

    /** STATUS: {NotNull, varchar(30), default=[0]} */
    protected String _status;

    /** RESCB: {NotNull, bigint(19), default=[(0)]} */
    protected Long _rescb;

    /** RESTB: {NotNull, bigint(19), default=[(0)]} */
    protected Long _restb;

    /** ABSTOSPLCBQA: {bigint(19)} */
    protected Long _abstosplcbqa;

    /** ABSTOSPLCTQA: {bigint(19)} */
    protected Long _abstosplctqa;

    /** ABSCBQA: {bigint(19)} */
    protected Long _abscbqa;

    /** RESCBQA: {bigint(19)} */
    protected Long _rescbqa;

    /** LBKBN: {bigint(19)} */
    protected Long _lbkbn;

    /** PRTRNK: {bigint(19)} */
    protected Long _prtrnk;

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
        return "T_SPLINFO";
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
        if (_splinfoId == null) { return false; }
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
        if (obj instanceof BsTSplinfo) {
            BsTSplinfo other = (BsTSplinfo)obj;
            if (!xSV(_splinfoId, other._splinfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _splinfoId);
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
        sb.append(dm).append(xfND(_splinfoId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_splymd));
        sb.append(dm).append(xfND(_upddtm));
        sb.append(dm).append(xfND(_csplnun));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_splid));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_locKbn));
        sb.append(dm).append(xfND(_precb));
        sb.append(dm).append(xfND(_prect));
        sb.append(dm).append(xfND(_calcb));
        sb.append(dm).append(xfND(_calct));
        sb.append(dm).append(xfND(_reqcb));
        sb.append(dm).append(xfND(_reqct));
        sb.append(dm).append(xfND(_status));
        sb.append(dm).append(xfND(_rescb));
        sb.append(dm).append(xfND(_restb));
        sb.append(dm).append(xfND(_abstosplcbqa));
        sb.append(dm).append(xfND(_abstosplctqa));
        sb.append(dm).append(xfND(_abscbqa));
        sb.append(dm).append(xfND(_rescbqa));
        sb.append(dm).append(xfND(_lbkbn));
        sb.append(dm).append(xfND(_prtrnk));
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
    public TSplinfo clone() {
        return (TSplinfo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 補充情報ID
     * @return The value of the column 'SPLINFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSplinfoId() {
        checkSpecifiedProperty("splinfoId");
        return _splinfoId;
    }

    /**
     * [set] SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 補充情報ID
     * @param splinfoId The value of the column 'SPLINFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSplinfoId(Long splinfoId) {
        registerModifiedProperty("splinfoId");
        _splinfoId = splinfoId;
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
     * [get] SPLYMD: {NotNull, varchar(8)} <br>
     * 補充年月日
     * @return The value of the column 'SPLYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getSplymd() {
        checkSpecifiedProperty("splymd");
        return convertEmptyToNull(_splymd);
    }

    /**
     * [set] SPLYMD: {NotNull, varchar(8)} <br>
     * 補充年月日
     * @param splymd The value of the column 'SPLYMD'. (basically NotNull if update: for the constraint)
     */
    public void setSplymd(String splymd) {
        registerModifiedProperty("splymd");
        _splymd = splymd;
    }

    /**
     * [get] UPDDTM: {datetime2(26, 6), default=[NULL]} <br>
     * 更新時間
     * @return The value of the column 'UPDDTM'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpddtm() {
        checkSpecifiedProperty("upddtm");
        return _upddtm;
    }

    /**
     * [set] UPDDTM: {datetime2(26, 6), default=[NULL]} <br>
     * 更新時間
     * @param upddtm The value of the column 'UPDDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpddtm(java.sql.Timestamp upddtm) {
        registerModifiedProperty("upddtm");
        _upddtm = upddtm;
    }

    /**
     * [get] CSPLNUN: {NotNull, bigint(19)} <br>
     * 補充回数
     * @return The value of the column 'CSPLNUN'. (basically NotNull if selected: for the constraint)
     */
    public Long getCsplnun() {
        checkSpecifiedProperty("csplnun");
        return _csplnun;
    }

    /**
     * [set] CSPLNUN: {NotNull, bigint(19)} <br>
     * 補充回数
     * @param csplnun The value of the column 'CSPLNUN'. (basically NotNull if update: for the constraint)
     */
    public void setCsplnun(Long csplnun) {
        registerModifiedProperty("csplnun");
        _csplnun = csplnun;
    }

    /**
     * [get] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (basically NotNull if selected: for the constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (basically NotNull if update: for the constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (basically NotNull if update: for the constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
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
     * [get] SPLID: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 補充区分
     * @return The value of the column 'SPLID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSplid() {
        checkSpecifiedProperty("splid");
        return _splid;
    }

    /**
     * [set] SPLID: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 補充区分
     * @param splid The value of the column 'SPLID'. (basically NotNull if update: for the constraint)
     */
    public void setSplid(java.math.BigDecimal splid) {
        registerModifiedProperty("splid");
        _splid = splid;
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
     * [get] DED: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed even if selected: for no constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {varchar(255)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] LOC_KBN: {NotNull, char(1), default=[0]} <br>
     * ロケーション区分
     * @return The value of the column 'LOC_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getLocKbn() {
        checkSpecifiedProperty("locKbn");
        return convertEmptyToNull(_locKbn);
    }

    /**
     * [set] LOC_KBN: {NotNull, char(1), default=[0]} <br>
     * ロケーション区分
     * @param locKbn The value of the column 'LOC_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setLocKbn(String locKbn) {
        registerModifiedProperty("locKbn");
        _locKbn = locKbn;
    }

    /**
     * [get] PRECB: {NotNull, bigint(19)} <br>
     * 補充前在庫（段ボール）
     * @return The value of the column 'PRECB'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrecb() {
        checkSpecifiedProperty("precb");
        return _precb;
    }

    /**
     * [set] PRECB: {NotNull, bigint(19)} <br>
     * 補充前在庫（段ボール）
     * @param precb The value of the column 'PRECB'. (basically NotNull if update: for the constraint)
     */
    public void setPrecb(Long precb) {
        registerModifiedProperty("precb");
        _precb = precb;
    }

    /**
     * [get] PRECT: {NotNull, bigint(19)} <br>
     * 補充前在庫（カートン）
     * @return The value of the column 'PRECT'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrect() {
        checkSpecifiedProperty("prect");
        return _prect;
    }

    /**
     * [set] PRECT: {NotNull, bigint(19)} <br>
     * 補充前在庫（カートン）
     * @param prect The value of the column 'PRECT'. (basically NotNull if update: for the constraint)
     */
    public void setPrect(Long prect) {
        registerModifiedProperty("prect");
        _prect = prect;
    }

    /**
     * [get] CALCB: {NotNull, bigint(19)} <br>
     * 算定補充量（段ボール）
     * @return The value of the column 'CALCB'. (basically NotNull if selected: for the constraint)
     */
    public Long getCalcb() {
        checkSpecifiedProperty("calcb");
        return _calcb;
    }

    /**
     * [set] CALCB: {NotNull, bigint(19)} <br>
     * 算定補充量（段ボール）
     * @param calcb The value of the column 'CALCB'. (basically NotNull if update: for the constraint)
     */
    public void setCalcb(Long calcb) {
        registerModifiedProperty("calcb");
        _calcb = calcb;
    }

    /**
     * [get] CALCT: {NotNull, bigint(19)} <br>
     * 算定補充量（カートン）
     * @return The value of the column 'CALCT'. (basically NotNull if selected: for the constraint)
     */
    public Long getCalct() {
        checkSpecifiedProperty("calct");
        return _calct;
    }

    /**
     * [set] CALCT: {NotNull, bigint(19)} <br>
     * 算定補充量（カートン）
     * @param calct The value of the column 'CALCT'. (basically NotNull if update: for the constraint)
     */
    public void setCalct(Long calct) {
        registerModifiedProperty("calct");
        _calct = calct;
    }

    /**
     * [get] REQCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（段ボール）
     * @return The value of the column 'REQCB'. (basically NotNull if selected: for the constraint)
     */
    public Long getReqcb() {
        checkSpecifiedProperty("reqcb");
        return _reqcb;
    }

    /**
     * [set] REQCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（段ボール）
     * @param reqcb The value of the column 'REQCB'. (basically NotNull if update: for the constraint)
     */
    public void setReqcb(Long reqcb) {
        registerModifiedProperty("reqcb");
        _reqcb = reqcb;
    }

    /**
     * [get] REQCT: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（カートン）
     * @return The value of the column 'REQCT'. (basically NotNull if selected: for the constraint)
     */
    public Long getReqct() {
        checkSpecifiedProperty("reqct");
        return _reqct;
    }

    /**
     * [set] REQCT: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（カートン）
     * @param reqct The value of the column 'REQCT'. (basically NotNull if update: for the constraint)
     */
    public void setReqct(Long reqct) {
        registerModifiedProperty("reqct");
        _reqct = reqct;
    }

    /**
     * [get] STATUS: {NotNull, varchar(30), default=[0]} <br>
     * 補充状態ステータス
     * @return The value of the column 'STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getStatus() {
        checkSpecifiedProperty("status");
        return convertEmptyToNull(_status);
    }

    /**
     * [set] STATUS: {NotNull, varchar(30), default=[0]} <br>
     * 補充状態ステータス
     * @param status The value of the column 'STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setStatus(String status) {
        registerModifiedProperty("status");
        _status = status;
    }

    /**
     * [get] RESCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（段ボール）
     * @return The value of the column 'RESCB'. (basically NotNull if selected: for the constraint)
     */
    public Long getRescb() {
        checkSpecifiedProperty("rescb");
        return _rescb;
    }

    /**
     * [set] RESCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（段ボール）
     * @param rescb The value of the column 'RESCB'. (basically NotNull if update: for the constraint)
     */
    public void setRescb(Long rescb) {
        registerModifiedProperty("rescb");
        _rescb = rescb;
    }

    /**
     * [get] RESTB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（カートン）
     * @return The value of the column 'RESTB'. (basically NotNull if selected: for the constraint)
     */
    public Long getRestb() {
        checkSpecifiedProperty("restb");
        return _restb;
    }

    /**
     * [set] RESTB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（カートン）
     * @param restb The value of the column 'RESTB'. (basically NotNull if update: for the constraint)
     */
    public void setRestb(Long restb) {
        registerModifiedProperty("restb");
        _restb = restb;
    }

    /**
     * [get] ABSTOSPLCBQA: {bigint(19)} <br>
     * 絶対補充量、ダンボール数
     * @return The value of the column 'ABSTOSPLCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAbstosplcbqa() {
        checkSpecifiedProperty("abstosplcbqa");
        return _abstosplcbqa;
    }

    /**
     * [set] ABSTOSPLCBQA: {bigint(19)} <br>
     * 絶対補充量、ダンボール数
     * @param abstosplcbqa The value of the column 'ABSTOSPLCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbstosplcbqa(Long abstosplcbqa) {
        registerModifiedProperty("abstosplcbqa");
        _abstosplcbqa = abstosplcbqa;
    }

    /**
     * [get] ABSTOSPLCTQA: {bigint(19)} <br>
     * 絶対補充量、カートン数
     * @return The value of the column 'ABSTOSPLCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAbstosplctqa() {
        checkSpecifiedProperty("abstosplctqa");
        return _abstosplctqa;
    }

    /**
     * [set] ABSTOSPLCTQA: {bigint(19)} <br>
     * 絶対補充量、カートン数
     * @param abstosplctqa The value of the column 'ABSTOSPLCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbstosplctqa(Long abstosplctqa) {
        registerModifiedProperty("abstosplctqa");
        _abstosplctqa = abstosplctqa;
    }

    /**
     * [get] ABSCBQA: {bigint(19)} <br>
     * 絶対補充切り上げダンボール数
     * @return The value of the column 'ABSCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAbscbqa() {
        checkSpecifiedProperty("abscbqa");
        return _abscbqa;
    }

    /**
     * [set] ABSCBQA: {bigint(19)} <br>
     * 絶対補充切り上げダンボール数
     * @param abscbqa The value of the column 'ABSCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbscbqa(Long abscbqa) {
        registerModifiedProperty("abscbqa");
        _abscbqa = abscbqa;
    }

    /**
     * [get] RESCBQA: {bigint(19)} <br>
     * 内予備ダンボール数
     * @return The value of the column 'RESCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRescbqa() {
        checkSpecifiedProperty("rescbqa");
        return _rescbqa;
    }

    /**
     * [set] RESCBQA: {bigint(19)} <br>
     * 内予備ダンボール数
     * @param rescbqa The value of the column 'RESCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRescbqa(Long rescbqa) {
        registerModifiedProperty("rescbqa");
        _rescbqa = rescbqa;
    }

    /**
     * [get] LBKBN: {bigint(19)} <br>
     * ライン／ブロック区分
     * @return The value of the column 'LBKBN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLbkbn() {
        checkSpecifiedProperty("lbkbn");
        return _lbkbn;
    }

    /**
     * [set] LBKBN: {bigint(19)} <br>
     * ライン／ブロック区分
     * @param lbkbn The value of the column 'LBKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbkbn(Long lbkbn) {
        registerModifiedProperty("lbkbn");
        _lbkbn = lbkbn;
    }

    /**
     * [get] PRTRNK: {bigint(19)} <br>
     * 印刷順
     * @return The value of the column 'PRTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrtrnk() {
        checkSpecifiedProperty("prtrnk");
        return _prtrnk;
    }

    /**
     * [set] PRTRNK: {bigint(19)} <br>
     * 印刷順
     * @param prtrnk The value of the column 'PRTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrtrnk(Long prtrnk) {
        registerModifiedProperty("prtrnk");
        _prtrnk = prtrnk;
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
