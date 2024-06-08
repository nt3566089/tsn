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
 * The entity of E_MH_SHIPPING as TABLE. <br>
 * 共通下位データ送信テーブル(さしず実績)
 * <pre>
 * [primary-key]
 *     MH_SHIPPING_ID
 *
 * [column]
 *     MH_SHIPPING_ID, DPCD, DLVYMD, DED, PSTNID, SRDED, SRPSTNID, SRLINCD, SRRNK, SSCD, SSNM, ZZMATNR, SLQACB, SLQACT, LINBLK, LOCNO, LOCID, DLVPRTRNK, DLVSNM, DLVDTLSNM, SROPRTCNT, TTSROPRTCNT, TTTOPDEDRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_SHIPPING_ID
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
 * Long mhShippingId = entity.getMhShippingId();
 * String dpcd = entity.getDpcd();
 * String dlvymd = entity.getDlvymd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String srded = entity.getSrded();
 * String srpstnid = entity.getSrpstnid();
 * String srlincd = entity.getSrlincd();
 * Long srrnk = entity.getSrrnk();
 * String sscd = entity.getSscd();
 * String ssnm = entity.getSsnm();
 * String zzmatnr = entity.getZzmatnr();
 * Long slqacb = entity.getSlqacb();
 * Long slqact = entity.getSlqact();
 * String linblk = entity.getLinblk();
 * String locno = entity.getLocno();
 * String locid = entity.getLocid();
 * Long dlvprtrnk = entity.getDlvprtrnk();
 * Long dlvsnm = entity.getDlvsnm();
 * java.math.BigDecimal dlvdtlsnm = entity.getDlvdtlsnm();
 * Long sroprtcnt = entity.getSroprtcnt();
 * Long ttsroprtcnt = entity.getTtsroprtcnt();
 * Long tttopdedrnk = entity.getTttopdedrnk();
 * String brtyp = entity.getBrtyp();
 * String boxno = entity.getBoxno();
 * String boxnocnsnm = entity.getBoxnocnsnm();
 * String boxtyp = entity.getBoxtyp();
 * String mgboxdid = entity.getMgboxdid();
 * String dmdid = entity.getDmdid();
 * Long ttboxqa = entity.getTtboxqa();
 * Long boxctqata = entity.getBoxctqata();
 * Long boxctqaapsrplc = entity.getBoxctqaapsrplc();
 * String drclstlbcbid = entity.getDrclstlbcbid();
 * Long lbboxno = entity.getLbboxno();
 * Long lbttboxqa = entity.getLbttboxqa();
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
 * entity.setMhShippingId(mhShippingId);
 * entity.setDpcd(dpcd);
 * entity.setDlvymd(dlvymd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setSrded(srded);
 * entity.setSrpstnid(srpstnid);
 * entity.setSrlincd(srlincd);
 * entity.setSrrnk(srrnk);
 * entity.setSscd(sscd);
 * entity.setSsnm(ssnm);
 * entity.setZzmatnr(zzmatnr);
 * entity.setSlqacb(slqacb);
 * entity.setSlqact(slqact);
 * entity.setLinblk(linblk);
 * entity.setLocno(locno);
 * entity.setLocid(locid);
 * entity.setDlvprtrnk(dlvprtrnk);
 * entity.setDlvsnm(dlvsnm);
 * entity.setDlvdtlsnm(dlvdtlsnm);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setTtsroprtcnt(ttsroprtcnt);
 * entity.setTttopdedrnk(tttopdedrnk);
 * entity.setBrtyp(brtyp);
 * entity.setBoxno(boxno);
 * entity.setBoxnocnsnm(boxnocnsnm);
 * entity.setBoxtyp(boxtyp);
 * entity.setMgboxdid(mgboxdid);
 * entity.setDmdid(dmdid);
 * entity.setTtboxqa(ttboxqa);
 * entity.setBoxctqata(boxctqata);
 * entity.setBoxctqaapsrplc(boxctqaapsrplc);
 * entity.setDrclstlbcbid(drclstlbcbid);
 * entity.setLbboxno(lbboxno);
 * entity.setLbttboxqa(lbttboxqa);
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
public abstract class BsEMhShipping extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mhShippingId;

    /** DPCD: {varchar(30)} */
    protected String _dpcd;

    /** DLVYMD: {varchar(8)} */
    protected String _dlvymd;

    /** DED: {varchar(30)} */
    protected String _ded;

    /** PSTNID: {char(1)} */
    protected String _pstnid;

    /** SRDED: {varchar(30)} */
    protected String _srded;

    /** SRPSTNID: {char(1)} */
    protected String _srpstnid;

    /** SRLINCD: {varchar(30)} */
    protected String _srlincd;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** SSCD: {varchar(30)} */
    protected String _sscd;

    /** SSNM: {varchar(60)} */
    protected String _ssnm;

    /** ZZMATNR: {varchar(30)} */
    protected String _zzmatnr;

    /** SLQACB: {bigint(19)} */
    protected Long _slqacb;

    /** SLQACT: {bigint(19)} */
    protected Long _slqact;

    /** LINBLK: {varchar(30)} */
    protected String _linblk;

    /** LOCNO: {varchar(255)} */
    protected String _locno;

    /** LOCID: {char(1)} */
    protected String _locid;

    /** DLVPRTRNK: {bigint(19)} */
    protected Long _dlvprtrnk;

    /** DLVSNM: {bigint(19)} */
    protected Long _dlvsnm;

    /** DLVDTLSNM: {decimal(16, 6)} */
    protected java.math.BigDecimal _dlvdtlsnm;

    /** SROPRTCNT: {bigint(19)} */
    protected Long _sroprtcnt;

    /** TTSROPRTCNT: {bigint(19)} */
    protected Long _ttsroprtcnt;

    /** TTTOPDEDRNK: {bigint(19)} */
    protected Long _tttopdedrnk;

    /** BRTYP: {char(1)} */
    protected String _brtyp;

    /** BOXNO: {varchar(30)} */
    protected String _boxno;

    /** BOXNOCNSNM: {varchar(30)} */
    protected String _boxnocnsnm;

    /** BOXTYP: {char(1)} */
    protected String _boxtyp;

    /** MGBOXDID: {char(1)} */
    protected String _mgboxdid;

    /** DMDID: {char(1)} */
    protected String _dmdid;

    /** TTBOXQA: {bigint(19)} */
    protected Long _ttboxqa;

    /** BOXCTQATA: {bigint(19)} */
    protected Long _boxctqata;

    /** BOXCTQAAPSRPLC: {bigint(19)} */
    protected Long _boxctqaapsrplc;

    /** DRCLSTLBCBID: {char(1)} */
    protected String _drclstlbcbid;

    /** LBBOXNO: {bigint(19)} */
    protected Long _lbboxno;

    /** LBTTBOXQA: {bigint(19)} */
    protected Long _lbttboxqa;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** WORK_FLG: {char(1)} */
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
        return "E_MH_SHIPPING";
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
        if (_mhShippingId == null) { return false; }
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
        if (obj instanceof BsEMhShipping) {
            BsEMhShipping other = (BsEMhShipping)obj;
            if (!xSV(_mhShippingId, other._mhShippingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mhShippingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mhShippingId));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_srded));
        sb.append(dm).append(xfND(_srpstnid));
        sb.append(dm).append(xfND(_srlincd));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_sscd));
        sb.append(dm).append(xfND(_ssnm));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_slqacb));
        sb.append(dm).append(xfND(_slqact));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_locno));
        sb.append(dm).append(xfND(_locid));
        sb.append(dm).append(xfND(_dlvprtrnk));
        sb.append(dm).append(xfND(_dlvsnm));
        sb.append(dm).append(xfND(_dlvdtlsnm));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_ttsroprtcnt));
        sb.append(dm).append(xfND(_tttopdedrnk));
        sb.append(dm).append(xfND(_brtyp));
        sb.append(dm).append(xfND(_boxno));
        sb.append(dm).append(xfND(_boxnocnsnm));
        sb.append(dm).append(xfND(_boxtyp));
        sb.append(dm).append(xfND(_mgboxdid));
        sb.append(dm).append(xfND(_dmdid));
        sb.append(dm).append(xfND(_ttboxqa));
        sb.append(dm).append(xfND(_boxctqata));
        sb.append(dm).append(xfND(_boxctqaapsrplc));
        sb.append(dm).append(xfND(_drclstlbcbid));
        sb.append(dm).append(xfND(_lbboxno));
        sb.append(dm).append(xfND(_lbttboxqa));
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
    public EMhShipping clone() {
        return (EMhShipping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(さしず実績)ID
     * @return The value of the column 'MH_SHIPPING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMhShippingId() {
        checkSpecifiedProperty("mhShippingId");
        return _mhShippingId;
    }

    /**
     * [set] MH_SHIPPING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(さしず実績)ID
     * @param mhShippingId The value of the column 'MH_SHIPPING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMhShippingId(Long mhShippingId) {
        registerModifiedProperty("mhShippingId");
        _mhShippingId = mhShippingId;
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
     * [get] DLVYMD: {varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvymd() {
        checkSpecifiedProperty("dlvymd");
        return convertEmptyToNull(_dlvymd);
    }

    /**
     * [set] DLVYMD: {varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvymd(String dlvymd) {
        registerModifiedProperty("dlvymd");
        _dlvymd = dlvymd;
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
     * [get] SRDED: {varchar(30)} <br>
     * CAP用配達方面
     * @return The value of the column 'SRDED'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrded() {
        checkSpecifiedProperty("srded");
        return convertEmptyToNull(_srded);
    }

    /**
     * [set] SRDED: {varchar(30)} <br>
     * CAP用配達方面
     * @param srded The value of the column 'SRDED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrded(String srded) {
        registerModifiedProperty("srded");
        _srded = srded;
    }

    /**
     * [get] SRPSTNID: {char(1)} <br>
     * CAP用ピストン区分
     * @return The value of the column 'SRPSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrpstnid() {
        checkSpecifiedProperty("srpstnid");
        return convertEmptyToNull(_srpstnid);
    }

    /**
     * [set] SRPSTNID: {char(1)} <br>
     * CAP用ピストン区分
     * @param srpstnid The value of the column 'SRPSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrpstnid(String srpstnid) {
        registerModifiedProperty("srpstnid");
        _srpstnid = srpstnid;
    }

    /**
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrlincd() {
        checkSpecifiedProperty("srlincd");
        return convertEmptyToNull(_srlincd);
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrlincd(String srlincd) {
        registerModifiedProperty("srlincd");
        _srlincd = srlincd;
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
     * [get] SSCD: {varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscd() {
        checkSpecifiedProperty("sscd");
        return convertEmptyToNull(_sscd);
    }

    /**
     * [set] SSCD: {varchar(30)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscd(String sscd) {
        registerModifiedProperty("sscd");
        _sscd = sscd;
    }

    /**
     * [get] SSNM: {varchar(60)} <br>
     * お得意様名
     * @return The value of the column 'SSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSsnm() {
        checkSpecifiedProperty("ssnm");
        return convertEmptyToNull(_ssnm);
    }

    /**
     * [set] SSNM: {varchar(60)} <br>
     * お得意様名
     * @param ssnm The value of the column 'SSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSsnm(String ssnm) {
        registerModifiedProperty("ssnm");
        _ssnm = ssnm;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ZZMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄CD
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
    }

    /**
     * [get] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @return The value of the column 'SLQACB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlqacb() {
        checkSpecifiedProperty("slqacb");
        return _slqacb;
    }

    /**
     * [set] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @param slqacb The value of the column 'SLQACB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqacb(Long slqacb) {
        registerModifiedProperty("slqacb");
        _slqacb = slqacb;
    }

    /**
     * [get] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @return The value of the column 'SLQACT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlqact() {
        checkSpecifiedProperty("slqact");
        return _slqact;
    }

    /**
     * [set] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @param slqact The value of the column 'SLQACT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqact(Long slqact) {
        registerModifiedProperty("slqact");
        _slqact = slqact;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
    }

    /**
     * [get] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ.
     * @return The value of the column 'LOCNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocno() {
        checkSpecifiedProperty("locno");
        return convertEmptyToNull(_locno);
    }

    /**
     * [set] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ.
     * @param locno The value of the column 'LOCNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocno(String locno) {
        registerModifiedProperty("locno");
        _locno = locno;
    }

    /**
     * [get] LOCID: {char(1)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCID'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocid() {
        checkSpecifiedProperty("locid");
        return convertEmptyToNull(_locid);
    }

    /**
     * [set] LOCID: {char(1)} <br>
     * ロケーション区分
     * @param locid The value of the column 'LOCID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocid(String locid) {
        registerModifiedProperty("locid");
        _locid = locid;
    }

    /**
     * [get] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @return The value of the column 'DLVPRTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDlvprtrnk() {
        checkSpecifiedProperty("dlvprtrnk");
        return _dlvprtrnk;
    }

    /**
     * [set] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @param dlvprtrnk The value of the column 'DLVPRTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvprtrnk(Long dlvprtrnk) {
        registerModifiedProperty("dlvprtrnk");
        _dlvprtrnk = dlvprtrnk;
    }

    /**
     * [get] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DLVSNM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDlvsnm() {
        checkSpecifiedProperty("dlvsnm");
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvsnm(Long dlvsnm) {
        registerModifiedProperty("dlvsnm");
        _dlvsnm = dlvsnm;
    }

    /**
     * [get] DLVDTLSNM: {decimal(16, 6)} <br>
     * 配達通番枝番
     * @return The value of the column 'DLVDTLSNM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDlvdtlsnm() {
        checkSpecifiedProperty("dlvdtlsnm");
        return _dlvdtlsnm;
    }

    /**
     * [set] DLVDTLSNM: {decimal(16, 6)} <br>
     * 配達通番枝番
     * @param dlvdtlsnm The value of the column 'DLVDTLSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvdtlsnm(java.math.BigDecimal dlvdtlsnm) {
        registerModifiedProperty("dlvdtlsnm");
        _dlvdtlsnm = dlvdtlsnm;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'TTSROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTtsroprtcnt() {
        checkSpecifiedProperty("ttsroprtcnt");
        return _ttsroprtcnt;
    }

    /**
     * [set] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param ttsroprtcnt The value of the column 'TTSROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTtsroprtcnt(Long ttsroprtcnt) {
        registerModifiedProperty("ttsroprtcnt");
        _ttsroprtcnt = ttsroprtcnt;
    }

    /**
     * [get] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'TTTOPDEDRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTttopdedrnk() {
        checkSpecifiedProperty("tttopdedrnk");
        return _tttopdedrnk;
    }

    /**
     * [set] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @param tttopdedrnk The value of the column 'TTTOPDEDRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTttopdedrnk(Long tttopdedrnk) {
        registerModifiedProperty("tttopdedrnk");
        _tttopdedrnk = tttopdedrnk;
    }

    /**
     * [get] BRTYP: {char(1)} <br>
     * 銘柄タイプ
     * @return The value of the column 'BRTYP'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrtyp() {
        checkSpecifiedProperty("brtyp");
        return convertEmptyToNull(_brtyp);
    }

    /**
     * [set] BRTYP: {char(1)} <br>
     * 銘柄タイプ
     * @param brtyp The value of the column 'BRTYP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrtyp(String brtyp) {
        registerModifiedProperty("brtyp");
        _brtyp = brtyp;
    }

    /**
     * [get] BOXNO: {varchar(30)} <br>
     * 箱Ｎｏ．
     * @return The value of the column 'BOXNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxno() {
        checkSpecifiedProperty("boxno");
        return convertEmptyToNull(_boxno);
    }

    /**
     * [set] BOXNO: {varchar(30)} <br>
     * 箱Ｎｏ．
     * @param boxno The value of the column 'BOXNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxno(String boxno) {
        registerModifiedProperty("boxno");
        _boxno = boxno;
    }

    /**
     * [get] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．(通番)
     * @return The value of the column 'BOXNOCNSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxnocnsnm() {
        checkSpecifiedProperty("boxnocnsnm");
        return convertEmptyToNull(_boxnocnsnm);
    }

    /**
     * [set] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．(通番)
     * @param boxnocnsnm The value of the column 'BOXNOCNSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxnocnsnm(String boxnocnsnm) {
        registerModifiedProperty("boxnocnsnm");
        _boxnocnsnm = boxnocnsnm;
    }

    /**
     * [get] BOXTYP: {char(1)} <br>
     * 箱タイプ
     * @return The value of the column 'BOXTYP'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxtyp() {
        checkSpecifiedProperty("boxtyp");
        return convertEmptyToNull(_boxtyp);
    }

    /**
     * [set] BOXTYP: {char(1)} <br>
     * 箱タイプ
     * @param boxtyp The value of the column 'BOXTYP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxtyp(String boxtyp) {
        registerModifiedProperty("boxtyp");
        _boxtyp = boxtyp;
    }

    /**
     * [get] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @return The value of the column 'MGBOXDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getMgboxdid() {
        checkSpecifiedProperty("mgboxdid");
        return convertEmptyToNull(_mgboxdid);
    }

    /**
     * [set] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @param mgboxdid The value of the column 'MGBOXDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMgboxdid(String mgboxdid) {
        registerModifiedProperty("mgboxdid");
        _mgboxdid = mgboxdid;
    }

    /**
     * [get] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @return The value of the column 'DMDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmdid() {
        checkSpecifiedProperty("dmdid");
        return convertEmptyToNull(_dmdid);
    }

    /**
     * [set] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @param dmdid The value of the column 'DMDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmdid(String dmdid) {
        registerModifiedProperty("dmdid");
        _dmdid = dmdid;
    }

    /**
     * [get] TTBOXQA: {bigint(19)} <br>
     * ＤＭ表示区分
     * @return The value of the column 'TTBOXQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTtboxqa() {
        checkSpecifiedProperty("ttboxqa");
        return _ttboxqa;
    }

    /**
     * [set] TTBOXQA: {bigint(19)} <br>
     * ＤＭ表示区分
     * @param ttboxqa The value of the column 'TTBOXQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTtboxqa(Long ttboxqa) {
        registerModifiedProperty("ttboxqa");
        _ttboxqa = ttboxqa;
    }

    /**
     * [get] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数(総数)
     * @return The value of the column 'BOXCTQATA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxctqata() {
        checkSpecifiedProperty("boxctqata");
        return _boxctqata;
    }

    /**
     * [set] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数(総数)
     * @param boxctqata The value of the column 'BOXCTQATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxctqata(Long boxctqata) {
        registerModifiedProperty("boxctqata");
        _boxctqata = boxctqata;
    }

    /**
     * [get] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数(該当仕分場分)
     * @return The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxctqaapsrplc() {
        checkSpecifiedProperty("boxctqaapsrplc");
        return _boxctqaapsrplc;
    }

    /**
     * [set] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数(該当仕分場分)
     * @param boxctqaapsrplc The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxctqaapsrplc(Long boxctqaapsrplc) {
        registerModifiedProperty("boxctqaapsrplc");
        _boxctqaapsrplc = boxctqaapsrplc;
    }

    /**
     * [get] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @return The value of the column 'DRCLSTLBCBID'. (NullAllowed even if selected: for no constraint)
     */
    public String getDrclstlbcbid() {
        checkSpecifiedProperty("drclstlbcbid");
        return convertEmptyToNull(_drclstlbcbid);
    }

    /**
     * [set] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @param drclstlbcbid The value of the column 'DRCLSTLBCBID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDrclstlbcbid(String drclstlbcbid) {
        registerModifiedProperty("drclstlbcbid");
        _drclstlbcbid = drclstlbcbid;
    }

    /**
     * [get] LBBOXNO: {bigint(19)} <br>
     * ライン／ブロック箱Ｎｏ
     * @return The value of the column 'LBBOXNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLbboxno() {
        checkSpecifiedProperty("lbboxno");
        return _lbboxno;
    }

    /**
     * [set] LBBOXNO: {bigint(19)} <br>
     * ライン／ブロック箱Ｎｏ
     * @param lbboxno The value of the column 'LBBOXNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbboxno(Long lbboxno) {
        registerModifiedProperty("lbboxno");
        _lbboxno = lbboxno;
    }

    /**
     * [get] LBTTBOXQA: {bigint(19)} <br>
     * ライン／ブロックトータル箱数
     * @return The value of the column 'LBTTBOXQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLbttboxqa() {
        checkSpecifiedProperty("lbttboxqa");
        return _lbttboxqa;
    }

    /**
     * [set] LBTTBOXQA: {bigint(19)} <br>
     * ライン／ブロックトータル箱数
     * @param lbttboxqa The value of the column 'LBTTBOXQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbttboxqa(Long lbttboxqa) {
        registerModifiedProperty("lbttboxqa");
        _lbttboxqa = lbttboxqa;
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
