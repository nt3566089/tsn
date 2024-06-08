package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlGoodItemDiffReportListCenter. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_ABBR, INVDATE, PRODUCT_CD, PRODUCT_NM, DAMAGE_REFUND_KBN, DIFFOCCAREA, CGGDID, DIFF_QTY, USER_CD, USER_NM, CGGDID_NM, INOUTKBN_NM, PRINTCOUNT, EMTPYFLAG
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
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * String invdate = entity.getInvdate();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String damageRefundKbn = entity.getDamageRefundKbn();
 * String diffoccarea = entity.getDiffoccarea();
 * String cggdid = entity.getCggdid();
 * java.math.BigDecimal diffQty = entity.getDiffQty();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * String cggdidNm = entity.getCggdidNm();
 * String inoutkbnNm = entity.getInoutkbnNm();
 * Long printcount = entity.getPrintcount();
 * String emtpyflag = entity.getEmtpyflag();
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setInvdate(invdate);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setDamageRefundKbn(damageRefundKbn);
 * entity.setDiffoccarea(diffoccarea);
 * entity.setCggdid(cggdid);
 * entity.setDiffQty(diffQty);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * entity.setCggdidNm(cggdidNm);
 * entity.setInoutkbnNm(inoutkbnNm);
 * entity.setPrintcount(printcount);
 * entity.setEmtpyflag(emtpyflag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlGoodItemDiffReportListCenter extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** INVDATE: {varchar(8)} */
    protected String _invdate;

    /** PRODUCT_CD: {int(10)} */
    protected String _productCd;

    /** PRODUCT_NM: {int(10)} */
    protected String _productNm;

    /** DAMAGE_REFUND_KBN: {varchar(1)} */
    protected String _damageRefundKbn;

    /** DIFFOCCAREA: {varchar(2)} */
    protected String _diffoccarea;

    /** CGGDID: {int(10)} */
    protected String _cggdid;

    /** DIFF_QTY: {int(10)} */
    protected java.math.BigDecimal _diffQty;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    /** CGGDID_NM: {int(10)} */
    protected String _cggdidNm;

    /** INOUTKBN_NM: {varchar(100)} */
    protected String _inoutkbnNm;

    /** PRINTCOUNT: {numeric(11)} */
    protected Long _printcount;

    /** EMTPYFLAG: {varchar(19)} */
    protected String _emtpyflag;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlGoodItemDiffReportListCenterDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlGoodItemDiffReportListCenter";
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
        if (obj instanceof BsSqlGoodItemDiffReportListCenter) {
            BsSqlGoodItemDiffReportListCenter other = (BsSqlGoodItemDiffReportListCenter)obj;
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_invdate, other._invdate)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_damageRefundKbn, other._damageRefundKbn)) { return false; }
            if (!xSV(_diffoccarea, other._diffoccarea)) { return false; }
            if (!xSV(_cggdid, other._cggdid)) { return false; }
            if (!xSV(_diffQty, other._diffQty)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_cggdidNm, other._cggdidNm)) { return false; }
            if (!xSV(_inoutkbnNm, other._inoutkbnNm)) { return false; }
            if (!xSV(_printcount, other._printcount)) { return false; }
            if (!xSV(_emtpyflag, other._emtpyflag)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _invdate);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _damageRefundKbn);
        hs = xCH(hs, _diffoccarea);
        hs = xCH(hs, _cggdid);
        hs = xCH(hs, _diffQty);
        hs = xCH(hs, _userCd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _cggdidNm);
        hs = xCH(hs, _inoutkbnNm);
        hs = xCH(hs, _printcount);
        hs = xCH(hs, _emtpyflag);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_invdate));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_damageRefundKbn));
        sb.append(dm).append(xfND(_diffoccarea));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_diffQty));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_cggdidNm));
        sb.append(dm).append(xfND(_inoutkbnNm));
        sb.append(dm).append(xfND(_printcount));
        sb.append(dm).append(xfND(_emtpyflag));
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
    public SqlGoodItemDiffReportListCenter clone() {
        return (SqlGoodItemDiffReportListCenter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] INVDATE: {varchar(8)} <br>
     * @return The value of the column 'INVDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvdate() {
        checkSpecifiedProperty("invdate");
        return convertEmptyToNull(_invdate);
    }

    /**
     * [set] INVDATE: {varchar(8)} <br>
     * @param invdate The value of the column 'INVDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvdate(String invdate) {
        registerModifiedProperty("invdate");
        _invdate = invdate;
    }

    /**
     * [get] PRODUCT_CD: {int(10)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {int(10)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {int(10)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {int(10)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] DAMAGE_REFUND_KBN: {varchar(1)} <br>
     * @return The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDamageRefundKbn() {
        checkSpecifiedProperty("damageRefundKbn");
        return convertEmptyToNull(_damageRefundKbn);
    }

    /**
     * [set] DAMAGE_REFUND_KBN: {varchar(1)} <br>
     * @param damageRefundKbn The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDamageRefundKbn(String damageRefundKbn) {
        registerModifiedProperty("damageRefundKbn");
        _damageRefundKbn = damageRefundKbn;
    }

    /**
     * [get] DIFFOCCAREA: {varchar(2)} <br>
     * @return The value of the column 'DIFFOCCAREA'. (NullAllowed even if selected: for no constraint)
     */
    public String getDiffoccarea() {
        checkSpecifiedProperty("diffoccarea");
        return convertEmptyToNull(_diffoccarea);
    }

    /**
     * [set] DIFFOCCAREA: {varchar(2)} <br>
     * @param diffoccarea The value of the column 'DIFFOCCAREA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffoccarea(String diffoccarea) {
        registerModifiedProperty("diffoccarea");
        _diffoccarea = diffoccarea;
    }

    /**
     * [get] CGGDID: {int(10)} <br>
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {int(10)} <br>
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] DIFF_QTY: {int(10)} <br>
     * @return The value of the column 'DIFF_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDiffQty() {
        checkSpecifiedProperty("diffQty");
        return _diffQty;
    }

    /**
     * [set] DIFF_QTY: {int(10)} <br>
     * @param diffQty The value of the column 'DIFF_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffQty(java.math.BigDecimal diffQty) {
        registerModifiedProperty("diffQty");
        _diffQty = diffQty;
    }

    /**
     * [get] USER_CD: {varchar(30)} <br>
     * @return The value of the column 'USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserCd() {
        checkSpecifiedProperty("userCd");
        return convertEmptyToNull(_userCd);
    }

    /**
     * [set] USER_CD: {varchar(30)} <br>
     * @param userCd The value of the column 'USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserCd(String userCd) {
        registerModifiedProperty("userCd");
        _userCd = userCd;
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
     * [get] CGGDID_NM: {int(10)} <br>
     * @return The value of the column 'CGGDID_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdidNm() {
        checkSpecifiedProperty("cggdidNm");
        return convertEmptyToNull(_cggdidNm);
    }

    /**
     * [set] CGGDID_NM: {int(10)} <br>
     * @param cggdidNm The value of the column 'CGGDID_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdidNm(String cggdidNm) {
        registerModifiedProperty("cggdidNm");
        _cggdidNm = cggdidNm;
    }

    /**
     * [get] INOUTKBN_NM: {varchar(100)} <br>
     * @return The value of the column 'INOUTKBN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbnNm() {
        checkSpecifiedProperty("inoutkbnNm");
        return convertEmptyToNull(_inoutkbnNm);
    }

    /**
     * [set] INOUTKBN_NM: {varchar(100)} <br>
     * @param inoutkbnNm The value of the column 'INOUTKBN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbnNm(String inoutkbnNm) {
        registerModifiedProperty("inoutkbnNm");
        _inoutkbnNm = inoutkbnNm;
    }

    /**
     * [get] PRINTCOUNT: {numeric(11)} <br>
     * @return The value of the column 'PRINTCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPrintcount() {
        checkSpecifiedProperty("printcount");
        return _printcount;
    }

    /**
     * [set] PRINTCOUNT: {numeric(11)} <br>
     * @param printcount The value of the column 'PRINTCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintcount(Long printcount) {
        registerModifiedProperty("printcount");
        _printcount = printcount;
    }

    /**
     * [get] EMTPYFLAG: {varchar(19)} <br>
     * @return The value of the column 'EMTPYFLAG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmtpyflag() {
        checkSpecifiedProperty("emtpyflag");
        return convertEmptyToNull(_emtpyflag);
    }

    /**
     * [set] EMTPYFLAG: {varchar(19)} <br>
     * @param emtpyflag The value of the column 'EMTPYFLAG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmtpyflag(String emtpyflag) {
        registerModifiedProperty("emtpyflag");
        _emtpyflag = emtpyflag;
    }
}
