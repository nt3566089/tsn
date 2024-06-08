package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlNotGoodItemReportList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, INVDATE, PRODUCT_CD, PRODUCT_NM, INADEQUACYAREA, DIFFQTY, CGGDID, USER_CD, USER_NM, CGGDID_NM, INOUTKBN_NM, PRINTCOUNT, EMTPYFLAG
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
 * String centerNm = entity.getCenterNm();
 * String invdate = entity.getInvdate();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String inadequacyarea = entity.getInadequacyarea();
 * java.math.BigDecimal diffqty = entity.getDiffqty();
 * String cggdid = entity.getCggdid();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * String cggdidNm = entity.getCggdidNm();
 * String inoutkbnNm = entity.getInoutkbnNm();
 * Long printcount = entity.getPrintcount();
 * String emtpyflag = entity.getEmtpyflag();
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setInvdate(invdate);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setInadequacyarea(inadequacyarea);
 * entity.setDiffqty(diffqty);
 * entity.setCggdid(cggdid);
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
public abstract class BsSqlNotGoodItemReportList extends AbstractEntity implements CustomizeEntity {

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

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** INVDATE: {varchar(8)} */
    protected String _invdate;

    /** PRODUCT_CD: {int(10)} */
    protected String _productCd;

    /** PRODUCT_NM: {int(10)} */
    protected String _productNm;

    /** INADEQUACYAREA: {varchar(2)} */
    protected String _inadequacyarea;

    /** DIFFQTY: {int(10)} */
    protected java.math.BigDecimal _diffqty;

    /** CGGDID: {int(10)} */
    protected String _cggdid;

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
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlNotGoodItemReportListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlNotGoodItemReportList";
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
        if (obj instanceof BsSqlNotGoodItemReportList) {
            BsSqlNotGoodItemReportList other = (BsSqlNotGoodItemReportList)obj;
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_invdate, other._invdate)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_inadequacyarea, other._inadequacyarea)) { return false; }
            if (!xSV(_diffqty, other._diffqty)) { return false; }
            if (!xSV(_cggdid, other._cggdid)) { return false; }
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
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _invdate);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _inadequacyarea);
        hs = xCH(hs, _diffqty);
        hs = xCH(hs, _cggdid);
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
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_invdate));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_inadequacyarea));
        sb.append(dm).append(xfND(_diffqty));
        sb.append(dm).append(xfND(_cggdid));
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
    public SqlNotGoodItemReportList clone() {
        return (SqlNotGoodItemReportList)super.clone();
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
     * [get] INADEQUACYAREA: {varchar(2)} <br>
     * @return The value of the column 'INADEQUACYAREA'. (NullAllowed even if selected: for no constraint)
     */
    public String getInadequacyarea() {
        checkSpecifiedProperty("inadequacyarea");
        return convertEmptyToNull(_inadequacyarea);
    }

    /**
     * [set] INADEQUACYAREA: {varchar(2)} <br>
     * @param inadequacyarea The value of the column 'INADEQUACYAREA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInadequacyarea(String inadequacyarea) {
        registerModifiedProperty("inadequacyarea");
        _inadequacyarea = inadequacyarea;
    }

    /**
     * [get] DIFFQTY: {int(10)} <br>
     * @return The value of the column 'DIFFQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDiffqty() {
        checkSpecifiedProperty("diffqty");
        return _diffqty;
    }

    /**
     * [set] DIFFQTY: {int(10)} <br>
     * @param diffqty The value of the column 'DIFFQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffqty(java.math.BigDecimal diffqty) {
        registerModifiedProperty("diffqty");
        _diffqty = diffqty;
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
