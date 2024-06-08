package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTCcopamPrintData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TDRELAYID, STCD, SNNO1, SNNO2, SNNO3, SNYMD, ARVYMD, PLNCARKND, AMCARKND, TRANNM, CARNO, GNLPLTQA, OTPLTQA, SUMPLTQA, QTY, TOTALNUM, SELNO1, SELNO2, SELNO3
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
 * String tdrelayid = entity.getTdrelayid();
 * String stcd = entity.getStcd();
 * String snno1 = entity.getSnno1();
 * String snno2 = entity.getSnno2();
 * String snno3 = entity.getSnno3();
 * String snymd = entity.getSnymd();
 * String arvymd = entity.getArvymd();
 * String plncarknd = entity.getPlncarknd();
 * String amcarknd = entity.getAmcarknd();
 * String trannm = entity.getTrannm();
 * String carno = entity.getCarno();
 * Long gnlpltqa = entity.getGnlpltqa();
 * Long otpltqa = entity.getOtpltqa();
 * Long sumpltqa = entity.getSumpltqa();
 * Long qty = entity.getQty();
 * Long totalnum = entity.getTotalnum();
 * String selno1 = entity.getSelno1();
 * String selno2 = entity.getSelno2();
 * String selno3 = entity.getSelno3();
 * entity.setTdrelayid(tdrelayid);
 * entity.setStcd(stcd);
 * entity.setSnno1(snno1);
 * entity.setSnno2(snno2);
 * entity.setSnno3(snno3);
 * entity.setSnymd(snymd);
 * entity.setArvymd(arvymd);
 * entity.setPlncarknd(plncarknd);
 * entity.setAmcarknd(amcarknd);
 * entity.setTrannm(trannm);
 * entity.setCarno(carno);
 * entity.setGnlpltqa(gnlpltqa);
 * entity.setOtpltqa(otpltqa);
 * entity.setSumpltqa(sumpltqa);
 * entity.setQty(qty);
 * entity.setTotalnum(totalnum);
 * entity.setSelno1(selno1);
 * entity.setSelno2(selno2);
 * entity.setSelno3(selno3);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTCcopamPrintData extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TDRELAYID: {char(1)} */
    protected String _tdrelayid;

    /** STCD: {varchar(30)} */
    protected String _stcd;

    /** SNNO1: {varchar(30)} */
    protected String _snno1;

    /** SNNO2: {varchar(30)} */
    protected String _snno2;

    /** SNNO3: {varchar(30)} */
    protected String _snno3;

    /** SNYMD: {varchar(8)} */
    protected String _snymd;

    /** ARVYMD: {varchar(8)} */
    protected String _arvymd;

    /** PLNCARKND: {varchar(255)} */
    protected String _plncarknd;

    /** AMCARKND: {varchar(255)} */
    protected String _amcarknd;

    /** TRANNM: {varchar(60)} */
    protected String _trannm;

    /** CARNO: {varchar(30)} */
    protected String _carno;

    /** GNLPLTQA: {bigint(19)} */
    protected Long _gnlpltqa;

    /** OTPLTQA: {bigint(19)} */
    protected Long _otpltqa;

    /** SUMPLTQA: {bigint(19)} */
    protected Long _sumpltqa;

    /** QTY: {bigint(19)} */
    protected Long _qty;

    /** TOTALNUM: {bigint(19)} */
    protected Long _totalnum;

    /** SELNO1: {varchar(30)} */
    protected String _selno1;

    /** SELNO2: {varchar(30)} */
    protected String _selno2;

    /** SELNO3: {varchar(30)} */
    protected String _selno3;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTCcopamPrintDataDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTCcopamPrintData";
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
        if (obj instanceof BsSqlTCcopamPrintData) {
            BsSqlTCcopamPrintData other = (BsSqlTCcopamPrintData)obj;
            if (!xSV(_tdrelayid, other._tdrelayid)) { return false; }
            if (!xSV(_stcd, other._stcd)) { return false; }
            if (!xSV(_snno1, other._snno1)) { return false; }
            if (!xSV(_snno2, other._snno2)) { return false; }
            if (!xSV(_snno3, other._snno3)) { return false; }
            if (!xSV(_snymd, other._snymd)) { return false; }
            if (!xSV(_arvymd, other._arvymd)) { return false; }
            if (!xSV(_plncarknd, other._plncarknd)) { return false; }
            if (!xSV(_amcarknd, other._amcarknd)) { return false; }
            if (!xSV(_trannm, other._trannm)) { return false; }
            if (!xSV(_carno, other._carno)) { return false; }
            if (!xSV(_gnlpltqa, other._gnlpltqa)) { return false; }
            if (!xSV(_otpltqa, other._otpltqa)) { return false; }
            if (!xSV(_sumpltqa, other._sumpltqa)) { return false; }
            if (!xSV(_qty, other._qty)) { return false; }
            if (!xSV(_totalnum, other._totalnum)) { return false; }
            if (!xSV(_selno1, other._selno1)) { return false; }
            if (!xSV(_selno2, other._selno2)) { return false; }
            if (!xSV(_selno3, other._selno3)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tdrelayid);
        hs = xCH(hs, _stcd);
        hs = xCH(hs, _snno1);
        hs = xCH(hs, _snno2);
        hs = xCH(hs, _snno3);
        hs = xCH(hs, _snymd);
        hs = xCH(hs, _arvymd);
        hs = xCH(hs, _plncarknd);
        hs = xCH(hs, _amcarknd);
        hs = xCH(hs, _trannm);
        hs = xCH(hs, _carno);
        hs = xCH(hs, _gnlpltqa);
        hs = xCH(hs, _otpltqa);
        hs = xCH(hs, _sumpltqa);
        hs = xCH(hs, _qty);
        hs = xCH(hs, _totalnum);
        hs = xCH(hs, _selno1);
        hs = xCH(hs, _selno2);
        hs = xCH(hs, _selno3);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tdrelayid));
        sb.append(dm).append(xfND(_stcd));
        sb.append(dm).append(xfND(_snno1));
        sb.append(dm).append(xfND(_snno2));
        sb.append(dm).append(xfND(_snno3));
        sb.append(dm).append(xfND(_snymd));
        sb.append(dm).append(xfND(_arvymd));
        sb.append(dm).append(xfND(_plncarknd));
        sb.append(dm).append(xfND(_amcarknd));
        sb.append(dm).append(xfND(_trannm));
        sb.append(dm).append(xfND(_carno));
        sb.append(dm).append(xfND(_gnlpltqa));
        sb.append(dm).append(xfND(_otpltqa));
        sb.append(dm).append(xfND(_sumpltqa));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_totalnum));
        sb.append(dm).append(xfND(_selno1));
        sb.append(dm).append(xfND(_selno2));
        sb.append(dm).append(xfND(_selno3));
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
    public SqlTCcopamPrintData clone() {
        return (SqlTCcopamPrintData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TDRELAYID: {char(1)} <br>
     * @return The value of the column 'TDRELAYID'. (NullAllowed even if selected: for no constraint)
     */
    public String getTdrelayid() {
        checkSpecifiedProperty("tdrelayid");
        return convertEmptyToNull(_tdrelayid);
    }

    /**
     * [set] TDRELAYID: {char(1)} <br>
     * @param tdrelayid The value of the column 'TDRELAYID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdrelayid(String tdrelayid) {
        registerModifiedProperty("tdrelayid");
        _tdrelayid = tdrelayid;
    }

    /**
     * [get] STCD: {varchar(30)} <br>
     * @return The value of the column 'STCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStcd() {
        checkSpecifiedProperty("stcd");
        return convertEmptyToNull(_stcd);
    }

    /**
     * [set] STCD: {varchar(30)} <br>
     * @param stcd The value of the column 'STCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStcd(String stcd) {
        registerModifiedProperty("stcd");
        _stcd = stcd;
    }

    /**
     * [get] SNNO1: {varchar(30)} <br>
     * @return The value of the column 'SNNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnno1() {
        checkSpecifiedProperty("snno1");
        return convertEmptyToNull(_snno1);
    }

    /**
     * [set] SNNO1: {varchar(30)} <br>
     * @param snno1 The value of the column 'SNNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnno1(String snno1) {
        registerModifiedProperty("snno1");
        _snno1 = snno1;
    }

    /**
     * [get] SNNO2: {varchar(30)} <br>
     * @return The value of the column 'SNNO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnno2() {
        checkSpecifiedProperty("snno2");
        return convertEmptyToNull(_snno2);
    }

    /**
     * [set] SNNO2: {varchar(30)} <br>
     * @param snno2 The value of the column 'SNNO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnno2(String snno2) {
        registerModifiedProperty("snno2");
        _snno2 = snno2;
    }

    /**
     * [get] SNNO3: {varchar(30)} <br>
     * @return The value of the column 'SNNO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnno3() {
        checkSpecifiedProperty("snno3");
        return convertEmptyToNull(_snno3);
    }

    /**
     * [set] SNNO3: {varchar(30)} <br>
     * @param snno3 The value of the column 'SNNO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnno3(String snno3) {
        registerModifiedProperty("snno3");
        _snno3 = snno3;
    }

    /**
     * [get] SNYMD: {varchar(8)} <br>
     * @return The value of the column 'SNYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnymd() {
        checkSpecifiedProperty("snymd");
        return convertEmptyToNull(_snymd);
    }

    /**
     * [set] SNYMD: {varchar(8)} <br>
     * @param snymd The value of the column 'SNYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnymd(String snymd) {
        registerModifiedProperty("snymd");
        _snymd = snymd;
    }

    /**
     * [get] ARVYMD: {varchar(8)} <br>
     * @return The value of the column 'ARVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getArvymd() {
        checkSpecifiedProperty("arvymd");
        return convertEmptyToNull(_arvymd);
    }

    /**
     * [set] ARVYMD: {varchar(8)} <br>
     * @param arvymd The value of the column 'ARVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArvymd(String arvymd) {
        registerModifiedProperty("arvymd");
        _arvymd = arvymd;
    }

    /**
     * [get] PLNCARKND: {varchar(255)} <br>
     * @return The value of the column 'PLNCARKND'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlncarknd() {
        checkSpecifiedProperty("plncarknd");
        return convertEmptyToNull(_plncarknd);
    }

    /**
     * [set] PLNCARKND: {varchar(255)} <br>
     * @param plncarknd The value of the column 'PLNCARKND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlncarknd(String plncarknd) {
        registerModifiedProperty("plncarknd");
        _plncarknd = plncarknd;
    }

    /**
     * [get] AMCARKND: {varchar(255)} <br>
     * @return The value of the column 'AMCARKND'. (NullAllowed even if selected: for no constraint)
     */
    public String getAmcarknd() {
        checkSpecifiedProperty("amcarknd");
        return convertEmptyToNull(_amcarknd);
    }

    /**
     * [set] AMCARKND: {varchar(255)} <br>
     * @param amcarknd The value of the column 'AMCARKND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmcarknd(String amcarknd) {
        registerModifiedProperty("amcarknd");
        _amcarknd = amcarknd;
    }

    /**
     * [get] TRANNM: {varchar(60)} <br>
     * @return The value of the column 'TRANNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrannm() {
        checkSpecifiedProperty("trannm");
        return convertEmptyToNull(_trannm);
    }

    /**
     * [set] TRANNM: {varchar(60)} <br>
     * @param trannm The value of the column 'TRANNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrannm(String trannm) {
        registerModifiedProperty("trannm");
        _trannm = trannm;
    }

    /**
     * [get] CARNO: {varchar(30)} <br>
     * @return The value of the column 'CARNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarno() {
        checkSpecifiedProperty("carno");
        return convertEmptyToNull(_carno);
    }

    /**
     * [set] CARNO: {varchar(30)} <br>
     * @param carno The value of the column 'CARNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarno(String carno) {
        registerModifiedProperty("carno");
        _carno = carno;
    }

    /**
     * [get] GNLPLTQA: {bigint(19)} <br>
     * @return The value of the column 'GNLPLTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGnlpltqa() {
        checkSpecifiedProperty("gnlpltqa");
        return _gnlpltqa;
    }

    /**
     * [set] GNLPLTQA: {bigint(19)} <br>
     * @param gnlpltqa The value of the column 'GNLPLTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGnlpltqa(Long gnlpltqa) {
        registerModifiedProperty("gnlpltqa");
        _gnlpltqa = gnlpltqa;
    }

    /**
     * [get] OTPLTQA: {bigint(19)} <br>
     * @return The value of the column 'OTPLTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOtpltqa() {
        checkSpecifiedProperty("otpltqa");
        return _otpltqa;
    }

    /**
     * [set] OTPLTQA: {bigint(19)} <br>
     * @param otpltqa The value of the column 'OTPLTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtpltqa(Long otpltqa) {
        registerModifiedProperty("otpltqa");
        _otpltqa = otpltqa;
    }

    /**
     * [get] SUMPLTQA: {bigint(19)} <br>
     * @return The value of the column 'SUMPLTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSumpltqa() {
        checkSpecifiedProperty("sumpltqa");
        return _sumpltqa;
    }

    /**
     * [set] SUMPLTQA: {bigint(19)} <br>
     * @param sumpltqa The value of the column 'SUMPLTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumpltqa(Long sumpltqa) {
        registerModifiedProperty("sumpltqa");
        _sumpltqa = sumpltqa;
    }

    /**
     * [get] QTY: {bigint(19)} <br>
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {bigint(19)} <br>
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(Long qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] TOTALNUM: {bigint(19)} <br>
     * @return The value of the column 'TOTALNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalnum() {
        checkSpecifiedProperty("totalnum");
        return _totalnum;
    }

    /**
     * [set] TOTALNUM: {bigint(19)} <br>
     * @param totalnum The value of the column 'TOTALNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalnum(Long totalnum) {
        registerModifiedProperty("totalnum");
        _totalnum = totalnum;
    }

    /**
     * [get] SELNO1: {varchar(30)} <br>
     * @return The value of the column 'SELNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSelno1() {
        checkSpecifiedProperty("selno1");
        return convertEmptyToNull(_selno1);
    }

    /**
     * [set] SELNO1: {varchar(30)} <br>
     * @param selno1 The value of the column 'SELNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelno1(String selno1) {
        registerModifiedProperty("selno1");
        _selno1 = selno1;
    }

    /**
     * [get] SELNO2: {varchar(30)} <br>
     * @return The value of the column 'SELNO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSelno2() {
        checkSpecifiedProperty("selno2");
        return convertEmptyToNull(_selno2);
    }

    /**
     * [set] SELNO2: {varchar(30)} <br>
     * @param selno2 The value of the column 'SELNO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelno2(String selno2) {
        registerModifiedProperty("selno2");
        _selno2 = selno2;
    }

    /**
     * [get] SELNO3: {varchar(30)} <br>
     * @return The value of the column 'SELNO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSelno3() {
        checkSpecifiedProperty("selno3");
        return convertEmptyToNull(_selno3);
    }

    /**
     * [set] SELNO3: {varchar(30)} <br>
     * @param selno3 The value of the column 'SELNO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelno3(String selno3) {
        registerModifiedProperty("selno3");
        _selno3 = selno3;
    }
}
