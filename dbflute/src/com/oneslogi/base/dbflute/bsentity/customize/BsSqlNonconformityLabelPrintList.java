package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlNonconformityLabelPrintList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRBADITEMCASE_ID, TARGETMON, BADITEMCD, ITEMCD, CREATEDDATE, INOUTKBN, VA_EXTDATA2, CENTER_CD, CENTER_NM, PRODUCT_ABBR, CASE_NUM, ALLOCPOLICYKEY, USERNUM3
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
 * Long trbaditemcaseId = entity.getTrbaditemcaseId();
 * String targetmon = entity.getTargetmon();
 * java.math.BigDecimal baditemcd = entity.getBaditemcd();
 * String itemcd = entity.getItemcd();
 * String createddate = entity.getCreateddate();
 * String inoutkbn = entity.getInoutkbn();
 * String vaExtdata2 = entity.getVaExtdata2();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String productAbbr = entity.getProductAbbr();
 * java.math.BigDecimal caseNum = entity.getCaseNum();
 * java.math.BigDecimal allocpolicykey = entity.getAllocpolicykey();
 * Long usernum3 = entity.getUsernum3();
 * entity.setTrbaditemcaseId(trbaditemcaseId);
 * entity.setTargetmon(targetmon);
 * entity.setBaditemcd(baditemcd);
 * entity.setItemcd(itemcd);
 * entity.setCreateddate(createddate);
 * entity.setInoutkbn(inoutkbn);
 * entity.setVaExtdata2(vaExtdata2);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setCaseNum(caseNum);
 * entity.setAllocpolicykey(allocpolicykey);
 * entity.setUsernum3(usernum3);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlNonconformityLabelPrintList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRBADITEMCASE_ID: {bigint(19)} */
    protected Long _trbaditemcaseId;

    /** TARGETMON: {varchar(8)} */
    protected String _targetmon;

    /** BADITEMCD: {decimal(16, 6)} */
    protected java.math.BigDecimal _baditemcd;

    /** ITEMCD: {varchar(30)} */
    protected String _itemcd;

    /** CREATEDDATE: {varchar(8)} */
    protected String _createddate;

    /** INOUTKBN: {varchar(30)} */
    protected String _inoutkbn;

    /** VA_EXTDATA2: {varchar(30)} */
    protected String _vaExtdata2;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** CASE_NUM: {decimal(33, 12)} */
    protected java.math.BigDecimal _caseNum;

    /** ALLOCPOLICYKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _allocpolicykey;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlNonconformityLabelPrintListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlNonconformityLabelPrintList";
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
        if (obj instanceof BsSqlNonconformityLabelPrintList) {
            BsSqlNonconformityLabelPrintList other = (BsSqlNonconformityLabelPrintList)obj;
            if (!xSV(_trbaditemcaseId, other._trbaditemcaseId)) { return false; }
            if (!xSV(_targetmon, other._targetmon)) { return false; }
            if (!xSV(_baditemcd, other._baditemcd)) { return false; }
            if (!xSV(_itemcd, other._itemcd)) { return false; }
            if (!xSV(_createddate, other._createddate)) { return false; }
            if (!xSV(_inoutkbn, other._inoutkbn)) { return false; }
            if (!xSV(_vaExtdata2, other._vaExtdata2)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_caseNum, other._caseNum)) { return false; }
            if (!xSV(_allocpolicykey, other._allocpolicykey)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trbaditemcaseId);
        hs = xCH(hs, _targetmon);
        hs = xCH(hs, _baditemcd);
        hs = xCH(hs, _itemcd);
        hs = xCH(hs, _createddate);
        hs = xCH(hs, _inoutkbn);
        hs = xCH(hs, _vaExtdata2);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _caseNum);
        hs = xCH(hs, _allocpolicykey);
        hs = xCH(hs, _usernum3);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trbaditemcaseId));
        sb.append(dm).append(xfND(_targetmon));
        sb.append(dm).append(xfND(_baditemcd));
        sb.append(dm).append(xfND(_itemcd));
        sb.append(dm).append(xfND(_createddate));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_vaExtdata2));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_caseNum));
        sb.append(dm).append(xfND(_allocpolicykey));
        sb.append(dm).append(xfND(_usernum3));
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
    public SqlNonconformityLabelPrintList clone() {
        return (SqlNonconformityLabelPrintList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRBADITEMCASE_ID: {bigint(19)} <br>
     * @return The value of the column 'TRBADITEMCASE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrbaditemcaseId() {
        checkSpecifiedProperty("trbaditemcaseId");
        return _trbaditemcaseId;
    }

    /**
     * [set] TRBADITEMCASE_ID: {bigint(19)} <br>
     * @param trbaditemcaseId The value of the column 'TRBADITEMCASE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrbaditemcaseId(Long trbaditemcaseId) {
        registerModifiedProperty("trbaditemcaseId");
        _trbaditemcaseId = trbaditemcaseId;
    }

    /**
     * [get] TARGETMON: {varchar(8)} <br>
     * @return The value of the column 'TARGETMON'. (NullAllowed even if selected: for no constraint)
     */
    public String getTargetmon() {
        checkSpecifiedProperty("targetmon");
        return convertEmptyToNull(_targetmon);
    }

    /**
     * [set] TARGETMON: {varchar(8)} <br>
     * @param targetmon The value of the column 'TARGETMON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetmon(String targetmon) {
        registerModifiedProperty("targetmon");
        _targetmon = targetmon;
    }

    /**
     * [get] BADITEMCD: {decimal(16, 6)} <br>
     * @return The value of the column 'BADITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBaditemcd() {
        checkSpecifiedProperty("baditemcd");
        return _baditemcd;
    }

    /**
     * [set] BADITEMCD: {decimal(16, 6)} <br>
     * @param baditemcd The value of the column 'BADITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaditemcd(java.math.BigDecimal baditemcd) {
        registerModifiedProperty("baditemcd");
        _baditemcd = baditemcd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcd() {
        checkSpecifiedProperty("itemcd");
        return convertEmptyToNull(_itemcd);
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcd(String itemcd) {
        registerModifiedProperty("itemcd");
        _itemcd = itemcd;
    }

    /**
     * [get] CREATEDDATE: {varchar(8)} <br>
     * @return The value of the column 'CREATEDDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateddate() {
        checkSpecifiedProperty("createddate");
        return convertEmptyToNull(_createddate);
    }

    /**
     * [set] CREATEDDATE: {varchar(8)} <br>
     * @param createddate The value of the column 'CREATEDDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateddate(String createddate) {
        registerModifiedProperty("createddate");
        _createddate = createddate;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata2() {
        checkSpecifiedProperty("vaExtdata2");
        return convertEmptyToNull(_vaExtdata2);
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata2(String vaExtdata2) {
        registerModifiedProperty("vaExtdata2");
        _vaExtdata2 = vaExtdata2;
    }

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
     * [get] CASE_NUM: {decimal(33, 12)} <br>
     * @return The value of the column 'CASE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCaseNum() {
        checkSpecifiedProperty("caseNum");
        return _caseNum;
    }

    /**
     * [set] CASE_NUM: {decimal(33, 12)} <br>
     * @param caseNum The value of the column 'CASE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseNum(java.math.BigDecimal caseNum) {
        registerModifiedProperty("caseNum");
        _caseNum = caseNum;
    }

    /**
     * [get] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * @return The value of the column 'ALLOCPOLICYKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocpolicykey() {
        checkSpecifiedProperty("allocpolicykey");
        return _allocpolicykey;
    }

    /**
     * [set] ALLOCPOLICYKEY: {decimal(16, 6)} <br>
     * @param allocpolicykey The value of the column 'ALLOCPOLICYKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocpolicykey(java.math.BigDecimal allocpolicykey) {
        registerModifiedProperty("allocpolicykey");
        _allocpolicykey = allocpolicykey;
    }

    /**
     * [get] USERNUM3: {bigint(19)} <br>
     * @return The value of the column 'USERNUM3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum3(Long usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
    }
}
