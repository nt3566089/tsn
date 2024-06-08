package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlNotGoodItemDiffReportList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, STOCKDATE, PRODUCT_CD, PRODUCT_ABBR, DIFFOCC_AREA, DIFF_QTY_1, CGGDID, USER_CD, USER_NM, DICT_NM, PRINTCOUNT, EMTPYFLAG
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
 * String stockdate = entity.getStockdate();
 * String productCd = entity.getProductCd();
 * String productAbbr = entity.getProductAbbr();
 * String diffoccArea = entity.getDiffoccArea();
 * java.math.BigDecimal diffQty1 = entity.getDiffQty1();
 * String cggdid = entity.getCggdid();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * String dictNm = entity.getDictNm();
 * Long printcount = entity.getPrintcount();
 * String emtpyflag = entity.getEmtpyflag();
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setStockdate(stockdate);
 * entity.setProductCd(productCd);
 * entity.setProductAbbr(productAbbr);
 * entity.setDiffoccArea(diffoccArea);
 * entity.setDiffQty1(diffQty1);
 * entity.setCggdid(cggdid);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * entity.setDictNm(dictNm);
 * entity.setPrintcount(printcount);
 * entity.setEmtpyflag(emtpyflag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlNotGoodItemDiffReportList extends AbstractEntity implements CustomizeEntity {

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

    /** STOCKDATE: {varchar(8)} */
    protected String _stockdate;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** DIFFOCC_AREA: {char(1)} */
    protected String _diffoccArea;

    /** DIFF_QTY_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _diffQty1;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    /** DICT_NM: {varchar(100)} */
    protected String _dictNm;

    /** PRINTCOUNT: {numeric(11)} */
    protected Long _printcount;

    /** EMTPYFLAG: {varchar(19)} */
    protected String _emtpyflag;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlNotGoodItemDiffReportListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlNotGoodItemDiffReportList";
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
        if (obj instanceof BsSqlNotGoodItemDiffReportList) {
            BsSqlNotGoodItemDiffReportList other = (BsSqlNotGoodItemDiffReportList)obj;
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_stockdate, other._stockdate)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_diffoccArea, other._diffoccArea)) { return false; }
            if (!xSV(_diffQty1, other._diffQty1)) { return false; }
            if (!xSV(_cggdid, other._cggdid)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_dictNm, other._dictNm)) { return false; }
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
        hs = xCH(hs, _stockdate);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _diffoccArea);
        hs = xCH(hs, _diffQty1);
        hs = xCH(hs, _cggdid);
        hs = xCH(hs, _userCd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _dictNm);
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
        sb.append(dm).append(xfND(_stockdate));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_diffoccArea));
        sb.append(dm).append(xfND(_diffQty1));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_dictNm));
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
    public SqlNotGoodItemDiffReportList clone() {
        return (SqlNotGoodItemDiffReportList)super.clone();
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
     * [get] STOCKDATE: {varchar(8)} <br>
     * @return The value of the column 'STOCKDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockdate() {
        checkSpecifiedProperty("stockdate");
        return convertEmptyToNull(_stockdate);
    }

    /**
     * [set] STOCKDATE: {varchar(8)} <br>
     * @param stockdate The value of the column 'STOCKDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockdate(String stockdate) {
        registerModifiedProperty("stockdate");
        _stockdate = stockdate;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] DIFFOCC_AREA: {char(1)} <br>
     * @return The value of the column 'DIFFOCC_AREA'. (NullAllowed even if selected: for no constraint)
     */
    public String getDiffoccArea() {
        checkSpecifiedProperty("diffoccArea");
        return convertEmptyToNull(_diffoccArea);
    }

    /**
     * [set] DIFFOCC_AREA: {char(1)} <br>
     * @param diffoccArea The value of the column 'DIFFOCC_AREA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffoccArea(String diffoccArea) {
        registerModifiedProperty("diffoccArea");
        _diffoccArea = diffoccArea;
    }

    /**
     * [get] DIFF_QTY_1: {decimal(38, 6)} <br>
     * @return The value of the column 'DIFF_QTY_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDiffQty1() {
        checkSpecifiedProperty("diffQty1");
        return _diffQty1;
    }

    /**
     * [set] DIFF_QTY_1: {decimal(38, 6)} <br>
     * @param diffQty1 The value of the column 'DIFF_QTY_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffQty1(java.math.BigDecimal diffQty1) {
        registerModifiedProperty("diffQty1");
        _diffQty1 = diffQty1;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
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
     * [get] DICT_NM: {varchar(100)} <br>
     * @return The value of the column 'DICT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDictNm() {
        checkSpecifiedProperty("dictNm");
        return convertEmptyToNull(_dictNm);
    }

    /**
     * [set] DICT_NM: {varchar(100)} <br>
     * @param dictNm The value of the column 'DICT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDictNm(String dictNm) {
        registerModifiedProperty("dictNm");
        _dictNm = dictNm;
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
