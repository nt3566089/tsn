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
 * The entity of E_PRODUCT_M_SEND as TABLE. <br>
 * 銘柄テーブル(マテハン)送信テーブル
 * <pre>
 * [primary-key]
 *     PRODUCT_M_SEND_ID
 *
 * [column]
 *     PRODUCT_M_SEND_ID, COMPANY_CD, PRODUCT_CD, BRFNFL, BRFNHF, BRANFL, BRANHF, IOID_CLS, OTRNK, BRCTG, NUMCT, CTNUM, CBCT, PATCBQA, CTBCDID, CTBCD, CBBCDID, CBBCD, FWBRID, CTFM, CTSZL, CTSZW, CTSZH, CTCC, CTWEIGHT, ZZFRDATEH, ZZTODATEH, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_M_SEND_ID
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
 * Long productMSendId = entity.getProductMSendId();
 * String companyCd = entity.getCompanyCd();
 * String productCd = entity.getProductCd();
 * String brfnfl = entity.getBrfnfl();
 * String brfnhf = entity.getBrfnhf();
 * String branfl = entity.getBranfl();
 * String branhf = entity.getBranhf();
 * String ioidCls = entity.getIoidCls();
 * Long otrnk = entity.getOtrnk();
 * Long brctg = entity.getBrctg();
 * Long numct = entity.getNumct();
 * Long ctnum = entity.getCtnum();
 * Long cbct = entity.getCbct();
 * Long patcbqa = entity.getPatcbqa();
 * String ctbcdid = entity.getCtbcdid();
 * String ctbcd = entity.getCtbcd();
 * String cbbcdid = entity.getCbbcdid();
 * String cbbcd = entity.getCbbcd();
 * String fwbrid = entity.getFwbrid();
 * String ctfm = entity.getCtfm();
 * Long ctszl = entity.getCtszl();
 * Long ctszw = entity.getCtszw();
 * Long ctszh = entity.getCtszh();
 * Long ctcc = entity.getCtcc();
 * java.math.BigDecimal ctweight = entity.getCtweight();
 * String zzfrdateh = entity.getZzfrdateh();
 * String zztodateh = entity.getZztodateh();
 * String sendCd = entity.getSendCd();
 * String workFlg = entity.getWorkFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProductMSendId(productMSendId);
 * entity.setCompanyCd(companyCd);
 * entity.setProductCd(productCd);
 * entity.setBrfnfl(brfnfl);
 * entity.setBrfnhf(brfnhf);
 * entity.setBranfl(branfl);
 * entity.setBranhf(branhf);
 * entity.setIoidCls(ioidCls);
 * entity.setOtrnk(otrnk);
 * entity.setBrctg(brctg);
 * entity.setNumct(numct);
 * entity.setCtnum(ctnum);
 * entity.setCbct(cbct);
 * entity.setPatcbqa(patcbqa);
 * entity.setCtbcdid(ctbcdid);
 * entity.setCtbcd(ctbcd);
 * entity.setCbbcdid(cbbcdid);
 * entity.setCbbcd(cbbcd);
 * entity.setFwbrid(fwbrid);
 * entity.setCtfm(ctfm);
 * entity.setCtszl(ctszl);
 * entity.setCtszw(ctszw);
 * entity.setCtszh(ctszh);
 * entity.setCtcc(ctcc);
 * entity.setCtweight(ctweight);
 * entity.setZzfrdateh(zzfrdateh);
 * entity.setZztodateh(zztodateh);
 * entity.setSendCd(sendCd);
 * entity.setWorkFlg(workFlg);
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
public abstract class BsEProductMSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _productMSendId;

    /** COMPANY_CD: {varchar(30)} */
    protected String _companyCd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** BRFNFL: {varchar(255)} */
    protected String _brfnfl;

    /** BRFNHF: {varchar(255)} */
    protected String _brfnhf;

    /** BRANFL: {varchar(255)} */
    protected String _branfl;

    /** BRANHF: {varchar(255)} */
    protected String _branhf;

    /** IOID_CLS: {varchar(30)} */
    protected String _ioidCls;

    /** OTRNK: {bigint(19)} */
    protected Long _otrnk;

    /** BRCTG: {bigint(19)} */
    protected Long _brctg;

    /** NUMCT: {bigint(19)} */
    protected Long _numct;

    /** CTNUM: {bigint(19)} */
    protected Long _ctnum;

    /** CBCT: {bigint(19)} */
    protected Long _cbct;

    /** PATCBQA: {bigint(19)} */
    protected Long _patcbqa;

    /** CTBCDID: {varchar(30)} */
    protected String _ctbcdid;

    /** CTBCD: {varchar(30)} */
    protected String _ctbcd;

    /** CBBCDID: {varchar(30)} */
    protected String _cbbcdid;

    /** CBBCD: {varchar(30)} */
    protected String _cbbcd;

    /** FWBRID: {varchar(30)} */
    protected String _fwbrid;

    /** CTFM: {varchar(30)} */
    protected String _ctfm;

    /** CTSZL: {bigint(19)} */
    protected Long _ctszl;

    /** CTSZW: {bigint(19)} */
    protected Long _ctszw;

    /** CTSZH: {bigint(19)} */
    protected Long _ctszh;

    /** CTCC: {bigint(19)} */
    protected Long _ctcc;

    /** CTWEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _ctweight;

    /** ZZFRDATEH: {varchar(8)} */
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    protected String _zztodateh;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** WORK_FLG: {char(1), default=[(0)]} */
    protected String _workFlg;

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
        return "E_PRODUCT_M_SEND";
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
        if (_productMSendId == null) { return false; }
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
        if (obj instanceof BsEProductMSend) {
            BsEProductMSend other = (BsEProductMSend)obj;
            if (!xSV(_productMSendId, other._productMSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productMSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productMSendId));
        sb.append(dm).append(xfND(_companyCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_brfnfl));
        sb.append(dm).append(xfND(_brfnhf));
        sb.append(dm).append(xfND(_branfl));
        sb.append(dm).append(xfND(_branhf));
        sb.append(dm).append(xfND(_ioidCls));
        sb.append(dm).append(xfND(_otrnk));
        sb.append(dm).append(xfND(_brctg));
        sb.append(dm).append(xfND(_numct));
        sb.append(dm).append(xfND(_ctnum));
        sb.append(dm).append(xfND(_cbct));
        sb.append(dm).append(xfND(_patcbqa));
        sb.append(dm).append(xfND(_ctbcdid));
        sb.append(dm).append(xfND(_ctbcd));
        sb.append(dm).append(xfND(_cbbcdid));
        sb.append(dm).append(xfND(_cbbcd));
        sb.append(dm).append(xfND(_fwbrid));
        sb.append(dm).append(xfND(_ctfm));
        sb.append(dm).append(xfND(_ctszl));
        sb.append(dm).append(xfND(_ctszw));
        sb.append(dm).append(xfND(_ctszh));
        sb.append(dm).append(xfND(_ctcc));
        sb.append(dm).append(xfND(_ctweight));
        sb.append(dm).append(xfND(_zzfrdateh));
        sb.append(dm).append(xfND(_zztodateh));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_workFlg));
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
    public EProductMSend clone() {
        return (EProductMSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄(マテハン)送信ID
     * @return The value of the column 'PRODUCT_M_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductMSendId() {
        checkSpecifiedProperty("productMSendId");
        return _productMSendId;
    }

    /**
     * [set] PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄(マテハン)送信ID
     * @param productMSendId The value of the column 'PRODUCT_M_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductMSendId(Long productMSendId) {
        registerModifiedProperty("productMSendId");
        _productMSendId = productMSendId;
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
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'BRFNFL'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrfnfl() {
        checkSpecifiedProperty("brfnfl");
        return convertEmptyToNull(_brfnfl);
    }

    /**
     * [set] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @param brfnfl The value of the column 'BRFNFL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrfnfl(String brfnfl) {
        registerModifiedProperty("brfnfl");
        _brfnfl = brfnfl;
    }

    /**
     * [get] BRFNHF: {varchar(255)} <br>
     * 銘柄名正称(半角)
     * @return The value of the column 'BRFNHF'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrfnhf() {
        checkSpecifiedProperty("brfnhf");
        return convertEmptyToNull(_brfnhf);
    }

    /**
     * [set] BRFNHF: {varchar(255)} <br>
     * 銘柄名正称(半角)
     * @param brfnhf The value of the column 'BRFNHF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrfnhf(String brfnhf) {
        registerModifiedProperty("brfnhf");
        _brfnhf = brfnhf;
    }

    /**
     * [get] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @return The value of the column 'BRANFL'. (NullAllowed even if selected: for no constraint)
     */
    public String getBranfl() {
        checkSpecifiedProperty("branfl");
        return convertEmptyToNull(_branfl);
    }

    /**
     * [set] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @param branfl The value of the column 'BRANFL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBranfl(String branfl) {
        registerModifiedProperty("branfl");
        _branfl = branfl;
    }

    /**
     * [get] BRANHF: {varchar(255)} <br>
     * 銘柄名略称(半角)
     * @return The value of the column 'BRANHF'. (NullAllowed even if selected: for no constraint)
     */
    public String getBranhf() {
        checkSpecifiedProperty("branhf");
        return convertEmptyToNull(_branhf);
    }

    /**
     * [set] BRANHF: {varchar(255)} <br>
     * 銘柄名略称(半角)
     * @param branhf The value of the column 'BRANHF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBranhf(String branhf) {
        registerModifiedProperty("branhf");
        _branhf = branhf;
    }

    /**
     * [get] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'IOID_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIoidCls() {
        checkSpecifiedProperty("ioidCls");
        return convertEmptyToNull(_ioidCls);
    }

    /**
     * [set] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @param ioidCls The value of the column 'IOID_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIoidCls(String ioidCls) {
        registerModifiedProperty("ioidCls");
        _ioidCls = ioidCls;
    }

    /**
     * [get] OTRNK: {bigint(19)} <br>
     * 出力順
     * @return The value of the column 'OTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtrnk() {
        checkSpecifiedProperty("otrnk");
        return _otrnk;
    }

    /**
     * [set] OTRNK: {bigint(19)} <br>
     * 出力順
     * @param otrnk The value of the column 'OTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtrnk(Long otrnk) {
        registerModifiedProperty("otrnk");
        _otrnk = otrnk;
    }

    /**
     * [get] BRCTG: {bigint(19)} <br>
     * 銘柄カテゴリ
     * @return The value of the column 'BRCTG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBrctg() {
        checkSpecifiedProperty("brctg");
        return _brctg;
    }

    /**
     * [set] BRCTG: {bigint(19)} <br>
     * 銘柄カテゴリ
     * @param brctg The value of the column 'BRCTG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrctg(Long brctg) {
        registerModifiedProperty("brctg");
        _brctg = brctg;
    }

    /**
     * [get] NUMCT: {bigint(19)} <br>
     * 本数／個
     * @return The value of the column 'NUMCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNumct() {
        checkSpecifiedProperty("numct");
        return _numct;
    }

    /**
     * [set] NUMCT: {bigint(19)} <br>
     * 本数／個
     * @param numct The value of the column 'NUMCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumct(Long numct) {
        registerModifiedProperty("numct");
        _numct = numct;
    }

    /**
     * [get] CTNUM: {bigint(19)} <br>
     * 個／カートン
     * @return The value of the column 'CTNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtnum() {
        checkSpecifiedProperty("ctnum");
        return _ctnum;
    }

    /**
     * [set] CTNUM: {bigint(19)} <br>
     * 個／カートン
     * @param ctnum The value of the column 'CTNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtnum(Long ctnum) {
        registerModifiedProperty("ctnum");
        _ctnum = ctnum;
    }

    /**
     * [get] CBCT: {bigint(19)} <br>
     * カートン／ダンボール
     * @return The value of the column 'CBCT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCbct() {
        checkSpecifiedProperty("cbct");
        return _cbct;
    }

    /**
     * [set] CBCT: {bigint(19)} <br>
     * カートン／ダンボール
     * @param cbct The value of the column 'CBCT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbct(Long cbct) {
        registerModifiedProperty("cbct");
        _cbct = cbct;
    }

    /**
     * [get] PATCBQA: {bigint(19)} <br>
     * ダンボール／パレット
     * @return The value of the column 'PATCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPatcbqa() {
        checkSpecifiedProperty("patcbqa");
        return _patcbqa;
    }

    /**
     * [set] PATCBQA: {bigint(19)} <br>
     * ダンボール／パレット
     * @param patcbqa The value of the column 'PATCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPatcbqa(Long patcbqa) {
        registerModifiedProperty("patcbqa");
        _patcbqa = patcbqa;
    }

    /**
     * [get] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @return The value of the column 'CTBCDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCtbcdid() {
        checkSpecifiedProperty("ctbcdid");
        return convertEmptyToNull(_ctbcdid);
    }

    /**
     * [set] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @param ctbcdid The value of the column 'CTBCDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtbcdid(String ctbcdid) {
        registerModifiedProperty("ctbcdid");
        _ctbcdid = ctbcdid;
    }

    /**
     * [get] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'CTBCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCtbcd() {
        checkSpecifiedProperty("ctbcd");
        return convertEmptyToNull(_ctbcd);
    }

    /**
     * [set] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @param ctbcd The value of the column 'CTBCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtbcd(String ctbcd) {
        registerModifiedProperty("ctbcd");
        _ctbcd = ctbcd;
    }

    /**
     * [get] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @return The value of the column 'CBBCDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCbbcdid() {
        checkSpecifiedProperty("cbbcdid");
        return convertEmptyToNull(_cbbcdid);
    }

    /**
     * [set] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @param cbbcdid The value of the column 'CBBCDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbbcdid(String cbbcdid) {
        registerModifiedProperty("cbbcdid");
        _cbbcdid = cbbcdid;
    }

    /**
     * [get] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CBBCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCbbcd() {
        checkSpecifiedProperty("cbbcd");
        return convertEmptyToNull(_cbbcd);
    }

    /**
     * [set] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @param cbbcd The value of the column 'CBBCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCbbcd(String cbbcd) {
        registerModifiedProperty("cbbcd");
        _cbbcd = cbbcd;
    }

    /**
     * [get] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'FWBRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getFwbrid() {
        checkSpecifiedProperty("fwbrid");
        return convertEmptyToNull(_fwbrid);
    }

    /**
     * [set] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @param fwbrid The value of the column 'FWBRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwbrid(String fwbrid) {
        registerModifiedProperty("fwbrid");
        _fwbrid = fwbrid;
    }

    /**
     * [get] CTFM: {varchar(30)} <br>
     * カートン形状
     * @return The value of the column 'CTFM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCtfm() {
        checkSpecifiedProperty("ctfm");
        return convertEmptyToNull(_ctfm);
    }

    /**
     * [set] CTFM: {varchar(30)} <br>
     * カートン形状
     * @param ctfm The value of the column 'CTFM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtfm(String ctfm) {
        registerModifiedProperty("ctfm");
        _ctfm = ctfm;
    }

    /**
     * [get] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @return The value of the column 'CTSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtszl() {
        checkSpecifiedProperty("ctszl");
        return _ctszl;
    }

    /**
     * [set] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @param ctszl The value of the column 'CTSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtszl(Long ctszl) {
        registerModifiedProperty("ctszl");
        _ctszl = ctszl;
    }

    /**
     * [get] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @return The value of the column 'CTSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtszw() {
        checkSpecifiedProperty("ctszw");
        return _ctszw;
    }

    /**
     * [set] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @param ctszw The value of the column 'CTSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtszw(Long ctszw) {
        registerModifiedProperty("ctszw");
        _ctszw = ctszw;
    }

    /**
     * [get] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @return The value of the column 'CTSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtszh() {
        checkSpecifiedProperty("ctszh");
        return _ctszh;
    }

    /**
     * [set] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @param ctszh The value of the column 'CTSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtszh(Long ctszh) {
        registerModifiedProperty("ctszh");
        _ctszh = ctszh;
    }

    /**
     * [get] CTCC: {bigint(19)} <br>
     * カートン容積
     * @return The value of the column 'CTCC'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCtcc() {
        checkSpecifiedProperty("ctcc");
        return _ctcc;
    }

    /**
     * [set] CTCC: {bigint(19)} <br>
     * カートン容積
     * @param ctcc The value of the column 'CTCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtcc(Long ctcc) {
        registerModifiedProperty("ctcc");
        _ctcc = ctcc;
    }

    /**
     * [get] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @return The value of the column 'CTWEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCtweight() {
        checkSpecifiedProperty("ctweight");
        return _ctweight;
    }

    /**
     * [set] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @param ctweight The value of the column 'CTWEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCtweight(java.math.BigDecimal ctweight) {
        registerModifiedProperty("ctweight");
        _ctweight = ctweight;
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
     * [get] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
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
